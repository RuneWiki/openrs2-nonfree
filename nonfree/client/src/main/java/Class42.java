import java.util.Random;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!dr")
public abstract class Class42 {

	@OriginalMember(owner = "client!dr", name = "b", descriptor = "[S")
	private short[] aShortArray50;

	@OriginalMember(owner = "client!dr", name = "e", descriptor = "I")
	private int anInt3513 = 0;

	@OriginalMember(owner = "client!dr", name = "f", descriptor = "I")
	protected int anInt3514 = 4;

	@OriginalMember(owner = "client!dr", name = "d", descriptor = "[S")
	private final short[] aShortArray51 = new short[512];

	@OriginalMember(owner = "client!dr", name = "g", descriptor = "I")
	private int anInt3515 = 4;

	@OriginalMember(owner = "client!dr", name = "n", descriptor = "I")
	private int anInt3521 = 4;

	@OriginalMember(owner = "client!dr", name = "h", descriptor = "I")
	private int anInt3516 = 4;

	@OriginalMember(owner = "client!dr", name = "<init>", descriptor = "(IIIII)V")
	protected Class42(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		this.anInt3521 = arg2;
		this.anInt3516 = arg3;
		this.anInt3513 = arg0;
		this.anInt3515 = arg4;
		this.anInt3514 = arg1;
		this.method2857();
		this.method2854();
	}

	@OriginalMember(owner = "client!dr", name = "a", descriptor = "(B)V")
	protected abstract void method2851();

	@OriginalMember(owner = "client!dr", name = "a", descriptor = "(IIB)V")
	protected abstract void method2852(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1);

	@OriginalMember(owner = "client!dr", name = "a", descriptor = "(I)V")
	protected abstract void method2853();

	@OriginalMember(owner = "client!dr", name = "b", descriptor = "(B)V")
	private void method2854() {
		@Pc(20) Random local20 = new Random((long) this.anInt3513);
		for (@Pc(22) int local22 = 0; local22 < 255; local22++) {
			this.aShortArray51[local22] = (short) local22;
		}
		for (@Pc(38) int local38 = 0; local38 < 255; local38++) {
			@Pc(44) int local44 = 255 - local38;
			@Pc(49) int local49 = Static301.method4119(local20, local44);
			@Pc(54) short local54 = this.aShortArray51[local49];
			this.aShortArray51[local49] = this.aShortArray51[local44];
			this.aShortArray51[local44] = this.aShortArray51[local44 + 256] = local54;
		}
	}

	@OriginalMember(owner = "client!dr", name = "a", descriptor = "(IIII)V")
	protected final void method2855() {
		@Pc(8) int[] local8 = new int[128];
		@Pc(11) int[] local11 = new int[128];
		for (@Pc(19) int local19 = 0; local19 < 128; local19++) {
			local8[local19] = (local19 << 12) / 128;
		}
		@Pc(40) int[] local40 = new int[16];
		for (@Pc(42) int local42 = 0; local42 < 128; local42++) {
			local11[local42] = (local42 << 12) / 128;
		}
		for (@Pc(62) int local62 = 0; local62 < 16; local62++) {
			local40[local62] = (local62 << 12) / 16;
		}
		this.method2851();
		for (@Pc(81) int local81 = 0; local81 < 16; local81++) {
			for (@Pc(85) int local85 = 0; local85 < 128; local85++) {
				for (@Pc(89) int local89 = 0; local89 < 128; local89++) {
					for (@Pc(93) int local93 = 0; local93 < this.anInt3514; local93++) {
						@Pc(102) int local102 = this.aShortArray50[local93] << 12;
						@Pc(109) int local109 = local102 * this.anInt3516 >> 12;
						@Pc(117) int local117 = local102 * local11[local85] >> 12;
						@Pc(125) int local125 = local102 * local40[local81] >> 12;
						@Pc(132) int local132 = local102 * this.anInt3515 >> 12;
						@Pc(140) int local140 = local102 * local8[local89] >> 12;
						@Pc(147) int local147 = local102 * this.anInt3521 >> 12;
						@Pc(152) int local152 = local117 * this.anInt3516;
						@Pc(157) int local157 = local140 * this.anInt3521;
						@Pc(162) int local162 = local125 * this.anInt3515;
						@Pc(166) int local166 = local157 >> 12;
						@Pc(170) int local170 = local166 + 1;
						@Pc(174) int local174 = local166 & 0xFF;
						@Pc(178) int local178 = local152 >> 12;
						@Pc(182) int local182 = local178 + 1;
						@Pc(186) int local186 = local162 >> 12;
						@Pc(190) int local190 = local178 & 0xFF;
						@Pc(194) int local194 = local186 + 1;
						@Pc(198) int local198 = local157 & 0xFFF;
						@Pc(202) int local202 = local186 & 0xFF;
						if (local194 < local132) {
							local194 &= 0xFF;
						} else {
							local194 = 0;
						}
						local117 = local152 & 0xFFF;
						if (local182 >= local109) {
							local182 = 0;
						} else {
							local182 &= 0xFF;
						}
						local125 = local162 & 0xFFF;
						if (local147 <= local170) {
							local170 = 0;
						} else {
							local170 &= 0xFF;
						}
						@Pc(251) int local251 = Class1_Sub4_Sub22.anIntArray236[local198];
						@Pc(255) int local255 = Class1_Sub4_Sub22.anIntArray236[local125];
						@Pc(259) int local259 = local125 - 4096;
						@Pc(263) int local263 = local198 - 4096;
						@Pc(267) int local267 = local117 - 4096;
						@Pc(271) int local271 = Class1_Sub4_Sub22.anIntArray236[local117];
						@Pc(276) short local276 = this.aShortArray51[local194];
						@Pc(281) short local281 = this.aShortArray51[local202];
						@Pc(288) short local288 = this.aShortArray51[local276 + local182];
						@Pc(295) short local295 = this.aShortArray51[local281 + local190];
						@Pc(302) short local302 = this.aShortArray51[local276 + local190];
						@Pc(310) short local310 = this.aShortArray51[local182 + local281];
						@Pc(322) int local322 = Static283.method3904(local117, this.aShortArray51[local174 + local295], local125, local198);
						@Pc(335) int local335 = Static283.method3904(local117, this.aShortArray51[local170 + local295], local125, local263);
						@Pc(347) int local347 = local322 + ((local335 - local322) * local251 >> 12);
						@Pc(359) int local359 = Static283.method3904(local267, this.aShortArray51[local310 + local174], local125, local198);
						@Pc(371) int local371 = Static283.method3904(local267, this.aShortArray51[local310 + local170], local125, local263);
						@Pc(381) int local381 = (local251 * (local371 - local359) >> 12) + local359;
						@Pc(391) int local391 = local347 + ((local381 - local347) * local271 >> 12);
						@Pc(404) int local404 = Static283.method3904(local117, this.aShortArray51[local174 + local302], local259, local198);
						@Pc(416) int local416 = Static283.method3904(local117, this.aShortArray51[local302 + local170], local259, local263);
						@Pc(427) int local427 = (local251 * (local416 - local404) >> 12) + local404;
						@Pc(439) int local439 = Static283.method3904(local267, this.aShortArray51[local288 + local174], local259, local198);
						@Pc(451) int local451 = Static283.method3904(local267, this.aShortArray51[local288 + local170], local259, local263);
						@Pc(462) int local462 = ((local451 - local439) * local251 >> 12) + local439;
						@Pc(472) int local472 = local427 + ((local462 - local427) * local271 >> 12);
						this.method2852(local93, local391 + (local255 * (local472 - local391) >> 12));
					}
					this.method2853();
				}
			}
		}
	}

	@OriginalMember(owner = "client!dr", name = "c", descriptor = "(B)V")
	private void method2857() {
		this.aShortArray50 = new short[this.anInt3514];
		for (@Pc(20) int local20 = 0; local20 < this.anInt3514; local20++) {
			this.aShortArray50[local20] = (short) Math.pow(2.0D, (double) local20);
		}
	}
}
