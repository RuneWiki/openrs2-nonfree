import java.util.Random;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!bk")
public abstract class Class23 {

	@OriginalMember(owner = "client!bk", name = "a", descriptor = "[S")
	private short[] aShortArray90;

	@OriginalMember(owner = "client!bk", name = "b", descriptor = "I")
	private int anInt5155 = 4;

	@OriginalMember(owner = "client!bk", name = "f", descriptor = "I")
	private int anInt5159 = 0;

	@OriginalMember(owner = "client!bk", name = "h", descriptor = "[S")
	private final short[] aShortArray91 = new short[512];

	@OriginalMember(owner = "client!bk", name = "o", descriptor = "I")
	protected int anInt5165 = 4;

	@OriginalMember(owner = "client!bk", name = "p", descriptor = "I")
	private int anInt5166 = 4;

	@OriginalMember(owner = "client!bk", name = "q", descriptor = "I")
	private int anInt5167 = 4;

	@OriginalMember(owner = "client!bk", name = "<init>", descriptor = "(IIIII)V")
	protected Class23(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		this.anInt5159 = arg0;
		this.anInt5165 = arg1;
		this.anInt5166 = arg2;
		this.anInt5167 = arg4;
		this.anInt5155 = arg3;
		this.method4627();
		this.method4631();
	}

	@OriginalMember(owner = "client!bk", name = "a", descriptor = "(I)V")
	protected abstract void method4621();

	@OriginalMember(owner = "client!bk", name = "a", descriptor = "(BIII)V")
	protected final void method4622() {
		@Pc(14) int[] local14 = new int[128];
		@Pc(17) int[] local17 = new int[128];
		for (@Pc(19) int local19 = 0; local19 < 128; local19++) {
			local14[local19] = (local19 << 12) / 128;
		}
		@Pc(40) int[] local40 = new int[16];
		for (@Pc(42) int local42 = 0; local42 < 128; local42++) {
			local17[local42] = (local42 << 12) / 128;
		}
		for (@Pc(58) int local58 = 0; local58 < 16; local58++) {
			local40[local58] = (local58 << 12) / 16;
		}
		this.method4621();
		for (@Pc(81) int local81 = 0; local81 < 16; local81++) {
			for (@Pc(85) int local85 = 0; local85 < 128; local85++) {
				for (@Pc(89) int local89 = 0; local89 < 128; local89++) {
					for (@Pc(93) int local93 = 0; local93 < this.anInt5165; local93++) {
						@Pc(102) int local102 = this.aShortArray90[local93] << 12;
						@Pc(110) int local110 = local102 * local17[local85] >> 12;
						@Pc(117) int local117 = local102 * this.anInt5166 >> 12;
						@Pc(125) int local125 = local102 * local14[local89] >> 12;
						@Pc(132) int local132 = this.anInt5155 * local102 >> 12;
						@Pc(140) int local140 = local102 * local40[local81] >> 12;
						@Pc(147) int local147 = this.anInt5167 * local102 >> 12;
						@Pc(152) int local152 = local125 * this.anInt5166;
						@Pc(157) int local157 = local140 * this.anInt5167;
						@Pc(162) int local162 = local110 * this.anInt5155;
						@Pc(166) int local166 = local152 >> 12;
						@Pc(170) int local170 = local166 + 1;
						@Pc(174) int local174 = local166 & 0xFF;
						@Pc(178) int local178 = local162 >> 12;
						@Pc(182) int local182 = local178 + 1;
						@Pc(186) int local186 = local178 & 0xFF;
						@Pc(190) int local190 = local157 >> 12;
						@Pc(194) int local194 = local190 + 1;
						if (local170 < local117) {
							local170 &= 0xFF;
						} else {
							local170 = 0;
						}
						local140 = local157 & 0xFFF;
						if (local194 < local147) {
							local194 &= 0xFF;
						} else {
							local194 = 0;
						}
						if (local132 <= local182) {
							local182 = 0;
						} else {
							local182 &= 0xFF;
						}
						local125 = local152 & 0xFFF;
						local110 = local162 & 0xFFF;
						local190 &= 0xFF;
						@Pc(256) short local256 = this.aShortArray91[local190];
						@Pc(261) short local261 = this.aShortArray91[local194];
						@Pc(265) int local265 = local125 - 4096;
						@Pc(269) int local269 = Class39.anIntArray86[local110];
						@Pc(273) int local273 = Class39.anIntArray86[local125];
						@Pc(277) int local277 = local110 - 4096;
						@Pc(281) int local281 = Class39.anIntArray86[local140];
						@Pc(285) int local285 = local140 - 4096;
						@Pc(292) short local292 = this.aShortArray91[local186 + local261];
						@Pc(300) short local300 = this.aShortArray91[local182 + local256];
						@Pc(307) short local307 = this.aShortArray91[local256 + local186];
						@Pc(314) short local314 = this.aShortArray91[local261 + local182];
						@Pc(327) int local327 = Static147.method82(local140, local110, this.aShortArray91[local174 + local307], local125);
						@Pc(342) int local342 = Static147.method82(local140, local110, this.aShortArray91[local170 + local307], local265);
						@Pc(353) int local353 = (local273 * (local342 - local327) >> 12) + local327;
						@Pc(367) int local367 = Static147.method82(local140, local277, this.aShortArray91[local300 + local174], local125);
						@Pc(379) int local379 = Static147.method82(local140, local277, this.aShortArray91[local170 + local300], local265);
						@Pc(390) int local390 = local367 + ((local379 - local367) * local273 >> 12);
						@Pc(403) int local403 = Static147.method82(local285, local110, this.aShortArray91[local174 + local292], local125);
						@Pc(415) int local415 = local353 + (local269 * (local390 - local353) >> 12);
						@Pc(427) int local427 = Static147.method82(local285, local110, this.aShortArray91[local292 + local170], local265);
						@Pc(438) int local438 = local403 + (local273 * (local427 - local403) >> 12);
						@Pc(450) int local450 = Static147.method82(local285, local277, this.aShortArray91[local174 + local314], local125);
						@Pc(463) int local463 = Static147.method82(local285, local277, this.aShortArray91[local170 + local314], local265);
						@Pc(473) int local473 = (local273 * (local463 - local450) >> 12) + local450;
						@Pc(483) int local483 = local438 + (local269 * (local473 - local438) >> 12);
						this.method4623((local281 * (local483 - local415) >> 12) + local415, local93);
					}
					this.method4629();
				}
			}
		}
	}

	@OriginalMember(owner = "client!bk", name = "a", descriptor = "(IIZ)V")
	protected abstract void method4623(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1);

	@OriginalMember(owner = "client!bk", name = "c", descriptor = "(I)V")
	private void method4627() {
		this.aShortArray90 = new short[this.anInt5165];
		for (@Pc(12) int local12 = 0; local12 < this.anInt5165; local12++) {
			this.aShortArray90[local12] = (short) Math.pow(2.0D, (double) local12);
		}
	}

	@OriginalMember(owner = "client!bk", name = "a", descriptor = "(Z)V")
	protected abstract void method4629();

	@OriginalMember(owner = "client!bk", name = "a", descriptor = "(B)V")
	private void method4631() {
		@Pc(16) Random local16 = new Random((long) this.anInt5159);
		for (@Pc(18) int local18 = 0; local18 < 255; local18++) {
			this.aShortArray91[local18] = (short) local18;
		}
		for (@Pc(32) int local32 = 0; local32 < 255; local32++) {
			@Pc(39) int local39 = 255 - local32;
			@Pc(44) int local44 = Static329.method5695(local16, local39);
			@Pc(49) short local49 = this.aShortArray91[local44];
			this.aShortArray91[local44] = this.aShortArray91[local39];
			this.aShortArray91[local39] = this.aShortArray91[local39 + 256] = local49;
		}
	}
}
