import java.util.Random;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!js")
public abstract class Class76 {

	@OriginalMember(owner = "client!js", name = "o", descriptor = "[S")
	private short[] aShortArray98;

	@OriginalMember(owner = "client!js", name = "b", descriptor = "[S")
	private final short[] aShortArray97 = new short[512];

	@OriginalMember(owner = "client!js", name = "d", descriptor = "I")
	private int anInt6464 = 4;

	@OriginalMember(owner = "client!js", name = "j", descriptor = "I")
	protected int anInt6469 = 4;

	@OriginalMember(owner = "client!js", name = "s", descriptor = "I")
	private int anInt6474 = 4;

	@OriginalMember(owner = "client!js", name = "p", descriptor = "I")
	private int anInt6472 = 0;

	@OriginalMember(owner = "client!js", name = "r", descriptor = "I")
	private int anInt6473 = 4;

	@OriginalMember(owner = "client!js", name = "<init>", descriptor = "(IIIII)V")
	protected Class76(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		this.anInt6473 = arg4;
		this.anInt6464 = arg3;
		this.anInt6474 = arg2;
		this.anInt6472 = arg0;
		this.anInt6469 = arg1;
		this.method5034();
		this.method5043();
	}

	@OriginalMember(owner = "client!js", name = "a", descriptor = "(Z)V")
	private void method5034() {
		this.aShortArray98 = new short[this.anInt6469];
		for (@Pc(16) int local16 = 0; local16 < this.anInt6469; local16++) {
			this.aShortArray98[local16] = (short) Math.pow(2.0D, (double) local16);
		}
	}

	@OriginalMember(owner = "client!js", name = "a", descriptor = "(IIII)V")
	protected final void method5035() {
		@Pc(12) int[] local12 = new int[128];
		@Pc(15) int[] local15 = new int[128];
		for (@Pc(17) int local17 = 0; local17 < 128; local17++) {
			local12[local17] = (local17 << 12) / 128;
		}
		@Pc(34) int[] local34 = new int[16];
		for (@Pc(36) int local36 = 0; local36 < 128; local36++) {
			local15[local36] = (local36 << 12) / 128;
		}
		for (@Pc(52) int local52 = 0; local52 < 16; local52++) {
			local34[local52] = (local52 << 12) / 16;
		}
		this.method5041();
		for (@Pc(75) int local75 = 0; local75 < 16; local75++) {
			for (@Pc(79) int local79 = 0; local79 < 128; local79++) {
				for (@Pc(83) int local83 = 0; local83 < 128; local83++) {
					for (@Pc(87) int local87 = 0; local87 < this.anInt6469; local87++) {
						@Pc(96) int local96 = this.aShortArray98[local87] << 12;
						@Pc(103) int local103 = local96 * this.anInt6464 >> 12;
						@Pc(110) int local110 = this.anInt6473 * local96 >> 12;
						@Pc(118) int local118 = local96 * local12[local83] >> 12;
						@Pc(126) int local126 = local34[local75] * local96 >> 12;
						@Pc(133) int local133 = this.anInt6474 * local96 >> 12;
						@Pc(141) int local141 = local96 * local15[local79] >> 12;
						@Pc(146) int local146 = local126 * this.anInt6473;
						@Pc(151) int local151 = local118 * this.anInt6474;
						@Pc(156) int local156 = local141 * this.anInt6464;
						@Pc(160) int local160 = local151 >> 12;
						@Pc(164) int local164 = local160 + 1;
						@Pc(168) int local168 = local156 >> 12;
						@Pc(172) int local172 = local160 & 0xFF;
						@Pc(176) int local176 = local168 + 1;
						@Pc(180) int local180 = local146 >> 12;
						@Pc(184) int local184 = local168 & 0xFF;
						@Pc(188) int local188 = local180 + 1;
						@Pc(192) int local192 = local151 & 0xFFF;
						if (local188 >= local110) {
							local188 = 0;
						} else {
							local188 &= 0xFF;
						}
						if (local133 <= local164) {
							local164 = 0;
						} else {
							local164 &= 0xFF;
						}
						local180 &= 0xFF;
						local141 = local156 & 0xFFF;
						if (local176 >= local103) {
							local176 = 0;
						} else {
							local176 &= 0xFF;
						}
						local126 = local146 & 0xFFF;
						@Pc(245) int local245 = Class2_Sub7.anIntArray508[local126];
						@Pc(249) int local249 = local126 - 4096;
						@Pc(253) int local253 = local192 - 4096;
						@Pc(257) int local257 = local141 - 4096;
						@Pc(261) int local261 = Class2_Sub7.anIntArray508[local141];
						@Pc(266) short local266 = this.aShortArray97[local188];
						@Pc(270) int local270 = Class2_Sub7.anIntArray508[local192];
						@Pc(275) short local275 = this.aShortArray97[local180];
						@Pc(282) short local282 = this.aShortArray97[local266 + local176];
						@Pc(289) short local289 = this.aShortArray97[local275 + local184];
						@Pc(296) short local296 = this.aShortArray97[local266 + local184];
						@Pc(303) short local303 = this.aShortArray97[local275 + local176];
						@Pc(316) int local316 = Static439.method5664(local141, local192, this.aShortArray97[local172 + local289], local126);
						@Pc(328) int local328 = Static439.method5664(local141, local253, this.aShortArray97[local289 + local164], local126);
						@Pc(338) int local338 = (local270 * (local328 - local316) >> 12) + local316;
						@Pc(351) int local351 = Static439.method5664(local257, local192, this.aShortArray97[local172 + local303], local126);
						@Pc(363) int local363 = Static439.method5664(local257, local253, this.aShortArray97[local303 + local164], local126);
						@Pc(375) int local375 = local351 + ((local363 - local351) * local270 >> 12);
						@Pc(387) int local387 = local338 + (local261 * (local375 - local338) >> 12);
						@Pc(399) int local399 = Static439.method5664(local141, local192, this.aShortArray97[local296 + local172], local249);
						@Pc(411) int local411 = Static439.method5664(local141, local253, this.aShortArray97[local296 + local164], local249);
						@Pc(423) int local423 = local399 + (local270 * (local411 - local399) >> 12);
						@Pc(436) int local436 = Static439.method5664(local257, local192, this.aShortArray97[local172 + local282], local249);
						@Pc(449) int local449 = Static439.method5664(local257, local253, this.aShortArray97[local164 + local282], local249);
						@Pc(460) int local460 = local436 + (local270 * (local449 - local436) >> 12);
						@Pc(471) int local471 = ((local460 - local423) * local261 >> 12) + local423;
						this.method5037(local387 + (local245 * (local471 - local387) >> 12), local87);
					}
					this.method5042();
				}
			}
		}
	}

	@OriginalMember(owner = "client!js", name = "a", descriptor = "(III)V")
	protected abstract void method5037(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1);

	@OriginalMember(owner = "client!js", name = "a", descriptor = "(I)V")
	protected abstract void method5041();

	@OriginalMember(owner = "client!js", name = "b", descriptor = "(B)V")
	protected abstract void method5042();

	@OriginalMember(owner = "client!js", name = "c", descriptor = "(B)V")
	private void method5043() {
		@Pc(12) Random local12 = new Random((long) this.anInt6472);
		for (@Pc(14) int local14 = 0; local14 < 255; local14++) {
			this.aShortArray97[local14] = (short) local14;
		}
		for (@Pc(28) int local28 = 0; local28 < 255; local28++) {
			@Pc(40) int local40 = 255 - local28;
			@Pc(45) int local45 = Static346.method4895(local12, local40);
			@Pc(50) short local50 = this.aShortArray97[local45];
			this.aShortArray97[local45] = this.aShortArray97[local40];
			this.aShortArray97[local40] = this.aShortArray97[local40 + 256] = local50;
		}
	}
}
