import java.util.Random;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!el")
public abstract class Class12 {

	@OriginalMember(owner = "client!el", name = "f", descriptor = "[S")
	private short[] aShortArray182;

	@OriginalMember(owner = "client!el", name = "e", descriptor = "I")
	private int anInt7485 = 4;

	@OriginalMember(owner = "client!el", name = "c", descriptor = "I")
	private int anInt7483 = 4;

	@OriginalMember(owner = "client!el", name = "d", descriptor = "I")
	private int anInt7484 = 4;

	@OriginalMember(owner = "client!el", name = "i", descriptor = "I")
	protected int anInt7487 = 4;

	@OriginalMember(owner = "client!el", name = "l", descriptor = "[S")
	private final short[] aShortArray183 = new short[512];

	@OriginalMember(owner = "client!el", name = "n", descriptor = "I")
	private int anInt7490 = 0;

	@OriginalMember(owner = "client!el", name = "<init>", descriptor = "(IIIII)V")
	protected Class12(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		this.anInt7485 = arg3;
		this.anInt7484 = arg2;
		this.anInt7490 = arg0;
		this.anInt7487 = arg1;
		this.anInt7483 = arg4;
		this.method6175();
		this.method6174();
	}

	@OriginalMember(owner = "client!el", name = "a", descriptor = "(I)V")
	protected abstract void method6172();

	@OriginalMember(owner = "client!el", name = "a", descriptor = "(IIBI)V")
	protected final void method6173() {
		@Pc(14) int[] local14 = new int[128];
		@Pc(17) int[] local17 = new int[128];
		for (@Pc(19) int local19 = 0; local19 < 128; local19++) {
			local14[local19] = (local19 << 12) / 128;
		}
		@Pc(40) int[] local40 = new int[16];
		for (@Pc(42) int local42 = 0; local42 < 128; local42++) {
			local17[local42] = (local42 << 12) / 128;
		}
		for (@Pc(62) int local62 = 0; local62 < 16; local62++) {
			local40[local62] = (local62 << 12) / 16;
		}
		this.method6172();
		for (@Pc(81) int local81 = 0; local81 < 16; local81++) {
			for (@Pc(85) int local85 = 0; local85 < 128; local85++) {
				for (@Pc(89) int local89 = 0; local89 < 128; local89++) {
					for (@Pc(93) int local93 = 0; local93 < this.anInt7487; local93++) {
						@Pc(102) int local102 = this.aShortArray182[local93] << 12;
						@Pc(110) int local110 = local14[local89] * local102 >> 12;
						@Pc(118) int local118 = local17[local85] * local102 >> 12;
						@Pc(126) int local126 = local40[local81] * local102 >> 12;
						@Pc(133) int local133 = this.anInt7484 * local102 >> 12;
						@Pc(140) int local140 = this.anInt7483 * local102 >> 12;
						@Pc(147) int local147 = local102 * this.anInt7485 >> 12;
						@Pc(152) int local152 = local126 * this.anInt7483;
						@Pc(157) int local157 = local118 * this.anInt7485;
						@Pc(162) int local162 = local110 * this.anInt7484;
						@Pc(166) int local166 = local162 >> 12;
						@Pc(170) int local170 = local166 + 1;
						@Pc(174) int local174 = local166 & 0xFF;
						@Pc(178) int local178 = local157 >> 12;
						@Pc(182) int local182 = local178 + 1;
						@Pc(186) int local186 = local152 >> 12;
						@Pc(190) int local190 = local178 & 0xFF;
						@Pc(194) int local194 = local186 + 1;
						@Pc(198) int local198 = local186 & 0xFF;
						if (local147 <= local182) {
							local182 = 0;
						} else {
							local182 &= 0xFF;
						}
						if (local170 < local133) {
							local170 &= 0xFF;
						} else {
							local170 = 0;
						}
						if (local194 < local140) {
							local194 &= 0xFF;
						} else {
							local194 = 0;
						}
						local118 = local157 & 0xFFF;
						local126 = local152 & 0xFFF;
						local110 = local162 & 0xFFF;
						@Pc(251) int local251 = Class3_Sub4_Sub1.anIntArray399[local126];
						@Pc(255) int local255 = Class3_Sub4_Sub1.anIntArray399[local118];
						@Pc(260) short local260 = this.aShortArray183[local194];
						@Pc(264) int local264 = Class3_Sub4_Sub1.anIntArray399[local110];
						@Pc(268) int local268 = local110 - 4096;
						@Pc(272) int local272 = local118 - 4096;
						@Pc(277) short local277 = this.aShortArray183[local198];
						@Pc(281) int local281 = local126 - 4096;
						@Pc(288) short local288 = this.aShortArray183[local277 + local190];
						@Pc(296) short local296 = this.aShortArray183[local182 + local277];
						@Pc(303) short local303 = this.aShortArray183[local190 + local260];
						@Pc(310) short local310 = this.aShortArray183[local260 + local182];
						@Pc(322) int local322 = Static353.method5561(local118, local126, this.aShortArray183[local288 + local174], local110);
						@Pc(334) int local334 = Static353.method5561(local118, local126, this.aShortArray183[local170 + local288], local268);
						@Pc(345) int local345 = (local264 * (local334 - local322) >> 12) + local322;
						@Pc(357) int local357 = Static353.method5561(local272, local126, this.aShortArray183[local296 + local174], local110);
						@Pc(369) int local369 = Static353.method5561(local272, local126, this.aShortArray183[local296 + local170], local268);
						@Pc(379) int local379 = ((local369 - local357) * local264 >> 12) + local357;
						@Pc(390) int local390 = ((local379 - local345) * local255 >> 12) + local345;
						@Pc(402) int local402 = Static353.method5561(local118, local281, this.aShortArray183[local303 + local174], local110);
						@Pc(414) int local414 = Static353.method5561(local118, local281, this.aShortArray183[local303 + local170], local268);
						@Pc(425) int local425 = (local264 * (local414 - local402) >> 12) + local402;
						@Pc(437) int local437 = Static353.method5561(local272, local281, this.aShortArray183[local174 + local310], local110);
						@Pc(449) int local449 = Static353.method5561(local272, local281, this.aShortArray183[local170 + local310], local268);
						@Pc(460) int local460 = ((local449 - local437) * local264 >> 12) + local437;
						@Pc(471) int local471 = (local255 * (local460 - local425) >> 12) + local425;
						this.method6178(local93, ((local471 - local390) * local251 >> 12) + local390);
					}
					this.method6176();
				}
			}
		}
	}

	@OriginalMember(owner = "client!el", name = "a", descriptor = "(B)V")
	private void method6174() {
		@Pc(18) Random local18 = new Random((long) this.anInt7490);
		for (@Pc(20) int local20 = 0; local20 < 255; local20++) {
			this.aShortArray183[local20] = (short) local20;
		}
		for (@Pc(34) int local34 = 0; local34 < 255; local34++) {
			@Pc(41) int local41 = 255 - local34;
			@Pc(46) int local46 = Static500.method7215(local18, local41);
			@Pc(51) short local51 = this.aShortArray183[local46];
			this.aShortArray183[local46] = this.aShortArray183[local41];
			this.aShortArray183[local41] = this.aShortArray183[local41 + 256] = local51;
		}
	}

	@OriginalMember(owner = "client!el", name = "b", descriptor = "(I)V")
	private void method6175() {
		this.aShortArray182 = new short[this.anInt7487];
		for (@Pc(12) int local12 = 0; local12 < this.anInt7487; local12++) {
			this.aShortArray182[local12] = (short) Math.pow(2.0D, (double) local12);
		}
	}

	@OriginalMember(owner = "client!el", name = "c", descriptor = "(I)V")
	protected abstract void method6176();

	@OriginalMember(owner = "client!el", name = "a", descriptor = "(BII)V")
	protected abstract void method6178(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1);
}
