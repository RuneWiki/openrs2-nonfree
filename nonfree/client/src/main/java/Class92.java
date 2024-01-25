import java.util.Random;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!mr")
public abstract class Class92 {

	@OriginalMember(owner = "client!mr", name = "c", descriptor = "[S")
	private short[] aShortArray75;

	@OriginalMember(owner = "client!mr", name = "e", descriptor = "I")
	protected int anInt4761 = 4;

	@OriginalMember(owner = "client!mr", name = "b", descriptor = "I")
	private int anInt4759 = 4;

	@OriginalMember(owner = "client!mr", name = "j", descriptor = "I")
	private int anInt4765 = 0;

	@OriginalMember(owner = "client!mr", name = "i", descriptor = "I")
	private int anInt4764 = 4;

	@OriginalMember(owner = "client!mr", name = "l", descriptor = "I")
	private int anInt4766 = 4;

	@OriginalMember(owner = "client!mr", name = "k", descriptor = "[S")
	private final short[] aShortArray76 = new short[512];

	@OriginalMember(owner = "client!mr", name = "<init>", descriptor = "(IIIII)V")
	protected Class92(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		this.anInt4761 = arg1;
		this.anInt4765 = arg0;
		this.anInt4759 = arg2;
		this.anInt4766 = arg3;
		this.anInt4764 = arg4;
		this.method3786();
		this.method3784();
	}

	@OriginalMember(owner = "client!mr", name = "a", descriptor = "(Z)V")
	protected abstract void method3781();

	@OriginalMember(owner = "client!mr", name = "a", descriptor = "(IIII)V")
	protected final void method3782() {
		@Pc(8) int[] local8 = new int[128];
		@Pc(11) int[] local11 = new int[128];
		for (@Pc(13) int local13 = 0; local13 < 128; local13++) {
			local8[local13] = (local13 << 12) / 128;
		}
		@Pc(34) int[] local34 = new int[16];
		for (@Pc(42) int local42 = 0; local42 < 128; local42++) {
			local11[local42] = (local42 << 12) / 128;
		}
		for (@Pc(62) int local62 = 0; local62 < 16; local62++) {
			local34[local62] = (local62 << 12) / 16;
		}
		this.method3783();
		for (@Pc(81) int local81 = 0; local81 < 16; local81++) {
			for (@Pc(85) int local85 = 0; local85 < 128; local85++) {
				for (@Pc(89) int local89 = 0; local89 < 128; local89++) {
					for (@Pc(93) int local93 = 0; local93 < this.anInt4761; local93++) {
						@Pc(102) int local102 = this.aShortArray75[local93] << 12;
						@Pc(110) int local110 = local11[local85] * local102 >> 12;
						@Pc(117) int local117 = local102 * this.anInt4766 >> 12;
						@Pc(124) int local124 = this.anInt4759 * local102 >> 12;
						@Pc(131) int local131 = local102 * this.anInt4764 >> 12;
						@Pc(139) int local139 = local8[local89] * local102 >> 12;
						@Pc(147) int local147 = local34[local81] * local102 >> 12;
						@Pc(152) int local152 = local110 * this.anInt4766;
						@Pc(157) int local157 = local147 * this.anInt4764;
						@Pc(162) int local162 = local139 * this.anInt4759;
						@Pc(166) int local166 = local162 >> 12;
						@Pc(170) int local170 = local166 + 1;
						@Pc(174) int local174 = local166 & 0xFF;
						@Pc(178) int local178 = local152 >> 12;
						@Pc(182) int local182 = local178 + 1;
						@Pc(186) int local186 = local178 & 0xFF;
						@Pc(190) int local190 = local157 >> 12;
						@Pc(194) int local194 = local190 + 1;
						@Pc(198) int local198 = local152 & 0xFFF;
						@Pc(202) int local202 = local190 & 0xFF;
						if (local124 <= local170) {
							local170 = 0;
						} else {
							local170 &= 0xFF;
						}
						if (local182 >= local117) {
							local182 = 0;
						} else {
							local182 &= 0xFF;
						}
						if (local131 > local194) {
							local194 &= 0xFF;
						} else {
							local194 = 0;
						}
						local147 = local157 & 0xFFF;
						local139 = local162 & 0xFFF;
						@Pc(252) short local252 = this.aShortArray76[local194];
						@Pc(256) int local256 = local147 - 4096;
						@Pc(260) int local260 = Class2_Sub4.anIntArray452[local147];
						@Pc(265) short local265 = this.aShortArray76[local202];
						@Pc(269) int local269 = local139 - 4096;
						@Pc(273) int local273 = Class2_Sub4.anIntArray452[local139];
						@Pc(277) int local277 = local198 - 4096;
						@Pc(281) int local281 = Class2_Sub4.anIntArray452[local198];
						@Pc(288) short local288 = this.aShortArray76[local182 + local265];
						@Pc(295) short local295 = this.aShortArray76[local252 + local186];
						@Pc(302) short local302 = this.aShortArray76[local186 + local265];
						@Pc(310) short local310 = this.aShortArray76[local182 + local252];
						@Pc(322) int local322 = Static339.method4390(this.aShortArray76[local302 + local174], local198, local139, local147);
						@Pc(336) int local336 = Static339.method4390(this.aShortArray76[local170 + local302], local198, local269, local147);
						@Pc(347) int local347 = local322 + ((local336 - local322) * local273 >> 12);
						@Pc(359) int local359 = Static339.method4390(this.aShortArray76[local174 + local288], local277, local139, local147);
						@Pc(372) int local372 = Static339.method4390(this.aShortArray76[local170 + local288], local277, local269, local147);
						@Pc(383) int local383 = local359 + ((local372 - local359) * local273 >> 12);
						@Pc(395) int local395 = Static339.method4390(this.aShortArray76[local174 + local295], local198, local139, local256);
						@Pc(407) int local407 = local347 + (local281 * (local383 - local347) >> 12);
						@Pc(419) int local419 = Static339.method4390(this.aShortArray76[local170 + local295], local198, local269, local256);
						@Pc(430) int local430 = ((local419 - local395) * local273 >> 12) + local395;
						@Pc(442) int local442 = Static339.method4390(this.aShortArray76[local310 + local174], local277, local139, local256);
						@Pc(454) int local454 = Static339.method4390(this.aShortArray76[local310 + local170], local277, local269, local256);
						@Pc(464) int local464 = (local273 * (local454 - local442) >> 12) + local442;
						@Pc(475) int local475 = ((local464 - local430) * local281 >> 12) + local430;
						this.method3785(((local475 - local407) * local260 >> 12) + local407, local93);
					}
					this.method3781();
				}
			}
		}
	}

	@OriginalMember(owner = "client!mr", name = "a", descriptor = "(I)V")
	protected abstract void method3783();

	@OriginalMember(owner = "client!mr", name = "b", descriptor = "(I)V")
	private void method3784() {
		@Pc(12) Random local12 = new Random((long) this.anInt4765);
		for (@Pc(18) int local18 = 0; local18 < 255; local18++) {
			this.aShortArray76[local18] = (short) local18;
		}
		for (@Pc(32) int local32 = 0; local32 < 255; local32++) {
			@Pc(38) int local38 = 255 - local32;
			@Pc(43) int local43 = Static44.method700(local38, local12);
			@Pc(48) short local48 = this.aShortArray76[local43];
			this.aShortArray76[local43] = this.aShortArray76[local38];
			this.aShortArray76[local38] = this.aShortArray76[local38 + 256] = local48;
		}
	}

	@OriginalMember(owner = "client!mr", name = "a", descriptor = "(III)V")
	protected abstract void method3785(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1);

	@OriginalMember(owner = "client!mr", name = "b", descriptor = "(Z)V")
	private void method3786() {
		this.aShortArray75 = new short[this.anInt4761];
		for (@Pc(16) int local16 = 0; local16 < this.anInt4761; local16++) {
			this.aShortArray75[local16] = (short) Math.pow(2.0D, (double) local16);
		}
	}
}
