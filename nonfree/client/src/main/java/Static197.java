import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static197 {

	@OriginalMember(owner = "client!i", name = "Db", descriptor = "I")
	public static int anInt4404;

	@OriginalMember(owner = "client!i", name = "N", descriptor = "Z")
	public static boolean aBoolean347 = false;

	@OriginalMember(owner = "client!i", name = "eb", descriptor = "Lclient!h;")
	public static final Class125 aClass125_23 = new Class125(8);

	@OriginalMember(owner = "client!i", name = "xc", descriptor = "Lclient!cba;")
	public static final Class45 aClass45_66 = new Class45(100, 5);

	@OriginalMember(owner = "client!i", name = "Bc", descriptor = "[Lclient!kf;")
	public static Class23_Sub1[] aClass23_Sub1Array1 = new Class23_Sub1[0];

	@OriginalMember(owner = "client!i", name = "b", descriptor = "(IIII)V")
	public static void method3729(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(7) Class37 local7 = Static120.aClass37ArrayArrayArray1[arg0][arg1][arg2];
		if (local7 == null) {
			return;
		}
		@Pc(13) Class30_Sub4 local13 = local7.aClass30_Sub4_2;
		@Pc(16) Class30_Sub4 local16 = local7.aClass30_Sub4_1;
		if (local13 != null) {
			local13.anInt9545 = local13.anInt9545 * arg3 / (0x10 << Static193.anInt4311 - 7);
			local13.anInt9551 = local13.anInt9551 * arg3 / (0x10 << Static193.anInt4311 - 7);
		}
		if (local16 != null) {
			local16.anInt9545 = local16.anInt9545 * arg3 / (0x10 << Static193.anInt4311 - 7);
			local16.anInt9551 = local16.anInt9551 * arg3 / (0x10 << Static193.anInt4311 - 7);
		}
	}

	@OriginalMember(owner = "client!i", name = "a", descriptor = "(IB)Z")
	public static boolean method3743(@OriginalArg(0) int arg0) {
		if (arg0 == 23 || arg0 == 13 || arg0 == 16 || arg0 == 12 || arg0 == 30) {
			return true;
		} else {
			return arg0 == 21 || arg0 == 1010;
		}
	}
}
