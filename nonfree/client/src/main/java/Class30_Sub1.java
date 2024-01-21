import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!fb")
public final class Class30_Sub1 extends Class30 {

	@OriginalMember(owner = "client!fb", name = "v", descriptor = "[I")
	public static final int[] anIntArray64 = new int[99];

	@OriginalMember(owner = "client!fb", name = "o", descriptor = "I")
	private final int anInt1156;

	@OriginalMember(owner = "client!fb", name = "t", descriptor = "I")
	private final int anInt1161;

	@OriginalMember(owner = "client!fb", name = "p", descriptor = "I")
	private final int anInt1157;

	@OriginalMember(owner = "client!fb", name = "m", descriptor = "I")
	private final int anInt1154;

	static {
		@Pc(6) int local6 = 0;
		for (@Pc(8) int local8 = 0; local8 < 99; local8++) {
			@Pc(13) int local13 = local8 + 1;
			@Pc(26) int local26 = (int) (Math.pow(2.0D, (double) local13 / 7.0D) * 300.0D + (double) local13);
			local6 += local26;
			anIntArray64[local8] = local6 / 4;
		}
	}

	@OriginalMember(owner = "client!fb", name = "<init>", descriptor = "(IIIIII)V")
	public Class30_Sub1(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		super(-1, arg4, arg5);
		this.anInt1156 = arg2;
		this.anInt1161 = arg3;
		this.anInt1157 = arg0;
		this.anInt1154 = arg1;
	}

	@OriginalMember(owner = "client!fb", name = "b", descriptor = "(III)V")
	@Override
	public void method2390(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
	}

	@OriginalMember(owner = "client!fb", name = "a", descriptor = "(IBI)V")
	@Override
	public void method2384(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(10) int local10 = arg0 * this.anInt1157 >> 12;
		@Pc(17) int local17 = arg0 * this.anInt1156 >> 12;
		@Pc(24) int local24 = this.anInt1161 * arg1 >> 12;
		@Pc(36) int local36 = this.anInt1154 * arg1 >> 12;
		Static75.method1081(local10, local36, local24, local17, super.anInt3273);
	}

	@OriginalMember(owner = "client!fb", name = "a", descriptor = "(BII)V")
	@Override
	public void method2391(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
	}
}
