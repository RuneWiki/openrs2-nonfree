import java.util.Random;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!dl")
public abstract class Class5 {

	@OriginalMember(owner = "client!dl", name = "d", descriptor = "[S")
	private short[] aShortArray91;

	@OriginalMember(owner = "client!dl", name = "a", descriptor = "I")
	private int anInt5455 = 4;

	@OriginalMember(owner = "client!dl", name = "j", descriptor = "[S")
	private final short[] aShortArray92 = new short[512];

	@OriginalMember(owner = "client!dl", name = "f", descriptor = "I")
	private int anInt5459 = 4;

	@OriginalMember(owner = "client!dl", name = "k", descriptor = "I")
	private int anInt5462 = 0;

	@OriginalMember(owner = "client!dl", name = "i", descriptor = "I")
	private int anInt5461 = 4;

	@OriginalMember(owner = "client!dl", name = "m", descriptor = "I")
	protected int anInt5464 = 4;

	@OriginalMember(owner = "client!dl", name = "<init>", descriptor = "(IIIII)V")
	protected Class5(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		this.anInt5459 = arg4;
		this.anInt5461 = arg2;
		this.anInt5464 = arg1;
		this.anInt5462 = arg0;
		this.anInt5455 = arg3;
		this.method4360();
		this.method4364();
	}

	@OriginalMember(owner = "client!dl", name = "a", descriptor = "(I)V")
	private void method4360() {
		this.aShortArray91 = new short[this.anInt5464];
		for (@Pc(18) int local18 = 0; local18 < this.anInt5464; local18++) {
			this.aShortArray91[local18] = (short) Math.pow(2.0D, (double) local18);
		}
	}

	@OriginalMember(owner = "client!dl", name = "a", descriptor = "(III)V")
	protected abstract void method4361(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1);

	@OriginalMember(owner = "client!dl", name = "b", descriptor = "(I)V")
	protected abstract void method4363();

	@OriginalMember(owner = "client!dl", name = "b", descriptor = "(B)V")
	private void method4364() {
		@Pc(12) Random local12 = new Random((long) this.anInt5462);
		for (@Pc(22) int local22 = 0; local22 < 255; local22++) {
			this.aShortArray92[local22] = (short) local22;
		}
		for (@Pc(38) int local38 = 0; local38 < 255; local38++) {
			@Pc(45) int local45 = 255 - local38;
			@Pc(50) int local50 = Static149.method2451(local45, local12);
			@Pc(55) short local55 = this.aShortArray92[local50];
			this.aShortArray92[local50] = this.aShortArray92[local45];
			this.aShortArray92[local45] = this.aShortArray92[local45 + 256] = local55;
		}
	}

	@OriginalMember(owner = "client!dl", name = "a", descriptor = "(IBII)V")
	protected final void method4365() {
		@Pc(8) int[] local8 = new int[128];
		@Pc(11) int[] local11 = new int[128];
		for (@Pc(13) int local13 = 0; local13 < 128; local13++) {
			local8[local13] = (local13 << 12) / 128;
		}
		@Pc(30) int[] local30 = new int[16];
		for (@Pc(32) int local32 = 0; local32 < 128; local32++) {
			local11[local32] = (local32 << 12) / 128;
		}
		for (@Pc(52) int local52 = 0; local52 < 16; local52++) {
			local30[local52] = (local52 << 12) / 16;
		}
		this.method4366();
		for (@Pc(71) int local71 = 0; local71 < 16; local71++) {
			for (@Pc(75) int local75 = 0; local75 < 128; local75++) {
				for (@Pc(79) int local79 = 0; local79 < 128; local79++) {
					for (@Pc(83) int local83 = 0; local83 < this.anInt5464; local83++) {
						@Pc(92) int local92 = this.aShortArray91[local83] << 12;
						@Pc(99) int local99 = local92 * this.anInt5455 >> 12;
						@Pc(107) int local107 = local30[local71] * local92 >> 12;
						@Pc(114) int local114 = local92 * this.anInt5461 >> 12;
						@Pc(122) int local122 = local92 * local8[local79] >> 12;
						@Pc(129) int local129 = this.anInt5459 * local92 >> 12;
						@Pc(137) int local137 = local11[local75] * local92 >> 12;
						@Pc(142) int local142 = local137 * this.anInt5455;
						@Pc(147) int local147 = local107 * this.anInt5459;
						@Pc(152) int local152 = local122 * this.anInt5461;
						@Pc(156) int local156 = local152 >> 12;
						@Pc(160) int local160 = local156 + 1;
						@Pc(164) int local164 = local156 & 0xFF;
						@Pc(168) int local168 = local142 >> 12;
						@Pc(172) int local172 = local168 + 1;
						@Pc(176) int local176 = local168 & 0xFF;
						@Pc(180) int local180 = local147 >> 12;
						@Pc(184) int local184 = local180 + 1;
						if (local160 >= local114) {
							local160 = 0;
						} else {
							local160 &= 0xFF;
						}
						local137 = local142 & 0xFFF;
						local122 = local152 & 0xFFF;
						local180 &= 0xFF;
						local107 = local147 & 0xFFF;
						if (local172 < local99) {
							local172 &= 0xFF;
						} else {
							local172 = 0;
						}
						if (local129 > local184) {
							local184 &= 0xFF;
						} else {
							local184 = 0;
						}
						@Pc(245) int local245 = local122 - 4096;
						@Pc(249) int local249 = Class2_Sub5_Sub14.anIntArray496[local107];
						@Pc(254) short local254 = this.aShortArray92[local184];
						@Pc(259) short local259 = this.aShortArray92[local180];
						@Pc(263) int local263 = Class2_Sub5_Sub14.anIntArray496[local122];
						@Pc(267) int local267 = local137 - 4096;
						@Pc(271) int local271 = Class2_Sub5_Sub14.anIntArray496[local137];
						@Pc(275) int local275 = local107 - 4096;
						@Pc(282) short local282 = this.aShortArray92[local254 + local172];
						@Pc(289) short local289 = this.aShortArray92[local259 + local172];
						@Pc(297) short local297 = this.aShortArray92[local176 + local254];
						@Pc(304) short local304 = this.aShortArray92[local259 + local176];
						@Pc(316) int local316 = Static157.method2557(local137, local107, this.aShortArray92[local304 + local164], local122);
						@Pc(328) int local328 = Static157.method2557(local137, local107, this.aShortArray92[local160 + local304], local245);
						@Pc(339) int local339 = (local263 * (local328 - local316) >> 12) + local316;
						@Pc(352) int local352 = Static157.method2557(local267, local107, this.aShortArray92[local164 + local289], local122);
						@Pc(364) int local364 = Static157.method2557(local267, local107, this.aShortArray92[local289 + local160], local245);
						@Pc(376) int local376 = local352 + (local263 * (local364 - local352) >> 12);
						@Pc(388) int local388 = local339 + ((local376 - local339) * local271 >> 12);
						@Pc(400) int local400 = Static157.method2557(local137, local275, this.aShortArray92[local164 + local297], local122);
						@Pc(412) int local412 = Static157.method2557(local137, local275, this.aShortArray92[local297 + local160], local245);
						@Pc(423) int local423 = local400 + ((local412 - local400) * local263 >> 12);
						@Pc(435) int local435 = Static157.method2557(local267, local275, this.aShortArray92[local282 + local164], local122);
						@Pc(447) int local447 = Static157.method2557(local267, local275, this.aShortArray92[local282 + local160], local245);
						@Pc(459) int local459 = local435 + ((local447 - local435) * local263 >> 12);
						@Pc(470) int local470 = ((local459 - local423) * local271 >> 12) + local423;
						this.method4361(local83, local388 + ((local470 - local388) * local249 >> 12));
					}
					this.method4363();
				}
			}
		}
	}

	@OriginalMember(owner = "client!dl", name = "a", descriptor = "(Z)V")
	protected abstract void method4366();
}
