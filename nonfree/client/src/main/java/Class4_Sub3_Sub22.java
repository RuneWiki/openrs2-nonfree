import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ke")
public final class Class4_Sub3_Sub22 extends Class4_Sub3 {

	@OriginalMember(owner = "client!ke", name = "ab", descriptor = "[I")
	public static final int[] anIntArray228 = new int[256];

	@OriginalMember(owner = "client!ke", name = "Z", descriptor = "I")
	private int anInt2423;

	@OriginalMember(owner = "client!ke", name = "S", descriptor = "I")
	private int anInt2416;

	@OriginalMember(owner = "client!ke", name = "Y", descriptor = "I")
	private int anInt2422;

	@OriginalMember(owner = "client!ke", name = "V", descriptor = "I")
	private int anInt2419;

	@OriginalMember(owner = "client!ke", name = "X", descriptor = "I")
	private int anInt2421;

	@OriginalMember(owner = "client!ke", name = "eb", descriptor = "I")
	private int anInt2427;

	@OriginalMember(owner = "client!ke", name = "jb", descriptor = "I")
	private int anInt2431;

	static {
		for (@Pc(4) int local4 = 0; local4 < 256; local4++) {
			@Pc(7) int local7 = local4;
			for (@Pc(9) int local9 = 0; local9 < 8; local9++) {
				if ((local7 & 0x1) == 1) {
					local7 = local7 >>> 1 ^ 0xEDB88320;
				} else {
					local7 >>>= 0x1;
				}
			}
			anIntArray228[local4] = local7;
		}
	}

	@OriginalMember(owner = "client!ke", name = "b", descriptor = "(III)Z")
	private boolean method1839(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(12) int local12 = this.anInt2422 * (arg1 - arg0) >> 12;
		@Pc(22) int local22 = Static22.anIntArray59[local12 * 255 >> 12 & 0xFF];
		@Pc(29) int local29 = (local22 << 12) / this.anInt2422;
		@Pc(36) int local36 = (local29 << 12) / this.anInt2423;
		@Pc(49) int local49 = this.anInt2427 * local36 >> 12;
		return local49 > arg1 + arg0 && -local49 < arg0 + arg1;
	}

	@OriginalMember(owner = "client!ke", name = "d", descriptor = "(B)V")
	@Override
	public void method3148() {
		Static97.method1889();
	}

	@OriginalMember(owner = "client!ke", name = "b", descriptor = "(BII)Z")
	private boolean method1842(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(21) int local21 = this.anInt2422 * (arg1 + arg0) >> 12;
		@Pc(31) int local31 = Static22.anIntArray59[local21 * 255 >> 12 & 0xFF];
		@Pc(38) int local38 = (local31 << 12) / this.anInt2422;
		@Pc(45) int local45 = (local38 << 12) / this.anInt2423;
		@Pc(52) int local52 = this.anInt2427 * local45 >> 12;
		return arg0 - arg1 < local52 && -local52 < arg0 - arg1;
	}

	@OriginalMember(owner = "client!ke", name = "a", descriptor = "(ILclient!h;I)V")
	@Override
	public void method3157(@OriginalArg(0) int arg0, @OriginalArg(1) Class4_Sub11 arg1) {
		if (arg0 == 0) {
			this.anInt2419 = arg1.method1252();
		} else if (arg0 == 1) {
			this.anInt2416 = arg1.method1252();
		} else if (arg0 == 2) {
			this.anInt2421 = arg1.method1252();
		} else if (arg0 == 3) {
			this.anInt2431 = arg1.method1252();
		} else if (arg0 == 4) {
			this.anInt2422 = arg1.method1252();
		} else if (arg0 == 5) {
			this.anInt2427 = arg1.method1252();
		} else if (arg0 == 6) {
			this.anInt2423 = arg1.method1252();
		}
	}

	@OriginalMember(owner = "client!ke", name = "a", descriptor = "(IB)[I")
	@Override
	public int[] method3161(@OriginalArg(0) int arg0) {
		@Pc(11) int[] local11 = super.aClass64_41.method2211(arg0);
		if (super.aClass64_41.aBoolean127) {
			@Pc(29) int local29 = Static148.anIntArray321[arg0] - 2048;
			for (@Pc(31) int local31 = 0; local31 < Static134.anInt3188; local31++) {
				@Pc(39) int local39 = Static67.anIntArray170[local31] - 2048;
				@Pc(45) int local45 = local39 + this.anInt2419;
				@Pc(56) int local56 = local45 >= -2048 ? local45 : local45 + 4096;
				@Pc(67) int local67 = local56 > 2048 ? local56 - 4096 : local56;
				@Pc(72) int local72 = this.anInt2416 + local29;
				@Pc(81) int local81 = local72 >= -2048 ? local72 : local72 + 4096;
				@Pc(90) int local90 = local81 <= 2048 ? local81 : local81 - 4096;
				@Pc(95) int local95 = this.anInt2421 + local39;
				@Pc(101) int local101 = local29 + this.anInt2431;
				@Pc(112) int local112 = local95 >= -2048 ? local95 : local95 + 4096;
				@Pc(121) int local121 = local101 >= -2048 ? local101 : local101 + 4096;
				@Pc(132) int local132 = local112 <= 2048 ? local112 : local112 - 4096;
				@Pc(141) int local141 = local121 <= 2048 ? local121 : local121 - 4096;
				local11[local31] = this.method1839(local67, local90) || this.method1842(local141, local132) ? 4096 : 0;
			}
		}
		return local11;
	}
}
