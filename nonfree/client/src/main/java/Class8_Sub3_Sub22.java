import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ld")
public final class Class8_Sub3_Sub22 extends Class8_Sub3 {

	@OriginalMember(owner = "client!ld", name = "O", descriptor = "I")
	private int anInt2891 = 4096;

	@OriginalMember(owner = "client!ld", name = "N", descriptor = "I")
	private int anInt2890 = 0;

	@OriginalMember(owner = "client!ld", name = "S", descriptor = "I")
	private int anInt2895 = 2048;

	@OriginalMember(owner = "client!ld", name = "V", descriptor = "I")
	private int anInt2898 = 2048;

	@OriginalMember(owner = "client!ld", name = "W", descriptor = "I")
	private int anInt2899 = 12288;

	@OriginalMember(owner = "client!ld", name = "T", descriptor = "I")
	private int anInt2896 = 0;

	@OriginalMember(owner = "client!ld", name = "L", descriptor = "I")
	private int anInt2888 = 8192;

	@OriginalMember(owner = "client!ld", name = "<init>", descriptor = "()V")
	public Class8_Sub3_Sub22() {
		super(0, true);
	}

	@OriginalMember(owner = "client!ld", name = "b", descriptor = "(III)Z")
	private boolean method2310(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(13) int local13 = (arg1 - arg0) * this.anInt2899 >> 12;
		@Pc(23) int local23 = Static15.anIntArray18[local13 * 255 >> 12 & 0xFF];
		@Pc(30) int local30 = (local23 << 12) / this.anInt2899;
		@Pc(37) int local37 = (local30 << 12) / this.anInt2888;
		@Pc(50) int local50 = local37 * this.anInt2891 >> 12;
		return local50 > arg0 + arg1 && arg0 + arg1 > -local50;
	}

	@OriginalMember(owner = "client!ld", name = "b", descriptor = "(B)V")
	@Override
	public void method4220() {
		Static111.method1828();
	}

	@OriginalMember(owner = "client!ld", name = "a", descriptor = "(IZ)[I")
	@Override
	public int[] method4227(@OriginalArg(0) int arg0) {
		@Pc(11) int[] local11 = this.aClass59_41.method1366(arg0);
		if (this.aClass59_41.aBoolean131) {
			@Pc(26) int local26 = Static33.anIntArray50[arg0] - 2048;
			for (@Pc(28) int local28 = 0; local28 < Static239.anInt4789; local28++) {
				@Pc(37) int local37 = Static171.anIntArray258[local28] - 2048;
				@Pc(42) int local42 = this.anInt2898 + local37;
				@Pc(47) int local47 = local26 + this.anInt2895;
				@Pc(52) int local52 = this.anInt2890 + local37;
				@Pc(57) int local57 = this.anInt2896 + local26;
				@Pc(68) int local68 = local47 < -2048 ? local47 + 4096 : local47;
				@Pc(77) int local77 = local68 <= 2048 ? local68 : local68 - 4096;
				@Pc(88) int local88 = local57 < -2048 ? local57 + 4096 : local57;
				@Pc(99) int local99 = local42 < -2048 ? local42 + 4096 : local42;
				@Pc(108) int local108 = local88 > 2048 ? local88 - 4096 : local88;
				@Pc(119) int local119 = local52 >= -2048 ? local52 : local52 + 4096;
				@Pc(130) int local130 = local99 > 2048 ? local99 - 4096 : local99;
				@Pc(141) int local141 = local119 > 2048 ? local119 - 4096 : local119;
				local11[local28] = this.method2310(local130, local108) || this.method2314(local77, local141) ? 4096 : 0;
			}
		}
		return local11;
	}

	@OriginalMember(owner = "client!ld", name = "a", descriptor = "(IIZ)Z")
	private boolean method2314(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(12) int local12 = (arg0 + arg1) * this.anInt2899 >> 12;
		@Pc(22) int local22 = Static15.anIntArray18[local12 * 255 >> 12 & 0xFF];
		@Pc(29) int local29 = (local22 << 12) / this.anInt2899;
		@Pc(36) int local36 = (local29 << 12) / this.anInt2888;
		@Pc(49) int local49 = this.anInt2891 * local36 >> 12;
		return local49 > arg0 - arg1 && -local49 < arg0 - arg1;
	}

	@OriginalMember(owner = "client!ld", name = "a", descriptor = "(IILclient!aj;)V")
	@Override
	public void method4223(@OriginalArg(0) int arg0, @OriginalArg(2) Class8_Sub2 arg1) {
		if (arg0 == 0) {
			this.anInt2898 = arg1.method2375();
		} else if (arg0 == 1) {
			this.anInt2896 = arg1.method2375();
		} else if (arg0 == 2) {
			this.anInt2890 = arg1.method2375();
		} else if (arg0 == 3) {
			this.anInt2895 = arg1.method2375();
		} else if (arg0 == 4) {
			this.anInt2899 = arg1.method2375();
		} else if (arg0 == 5) {
			this.anInt2891 = arg1.method2375();
		} else if (arg0 == 6) {
			this.anInt2888 = arg1.method2375();
		}
	}
}
