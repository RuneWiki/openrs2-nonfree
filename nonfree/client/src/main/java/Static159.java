import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static159 {

	@OriginalMember(owner = "client!ta", name = "g", descriptor = "J")
	public static long aLong127;

	@OriginalMember(owner = "client!ta", name = "f", descriptor = "Lclient!jd;")
	public static final Class46 aClass46_1313 = Static177.method3050("<)4col>");

	@OriginalMember(owner = "client!ta", name = "i", descriptor = "Lclient!jd;")
	public static final Class46 aClass46_1314 = Static177.method3050("Bitte versuchen Sie es erneut)3");

	@OriginalMember(owner = "client!ta", name = "j", descriptor = "Lclient!jd;")
	public static final Class46 aClass46_1315 = Static177.method3050("null");

	@OriginalMember(owner = "client!ta", name = "l", descriptor = "[I")
	public static final int[] anIntArray341 = new int[4000];

	@OriginalMember(owner = "client!ta", name = "a", descriptor = "(II)Z")
	public static boolean method2690(@OriginalArg(1) int arg0) {
		return (arg0 & 0x1) != 0;
	}

	@OriginalMember(owner = "client!ta", name = "a", descriptor = "(ILclient!nh;)V")
	public static void method2691(@OriginalArg(1) Class62 arg0) {
		Static136.aClass62_33 = arg0;
	}

	@OriginalMember(owner = "client!ta", name = "a", descriptor = "(B[B)[B")
	public static byte[] method2694(@OriginalArg(1) byte[] arg0) {
		@Pc(13) Class4_Sub11 local13 = new Class4_Sub11(arg0);
		@Pc(17) int local17 = local13.method1253();
		@Pc(21) int local21 = local13.method1263();
		if (local21 < 0 || Static135.anInt3216 != 0 && Static135.anInt3216 < local21) {
			throw new RuntimeException();
		} else if (local17 == 0) {
			@Pc(47) byte[] local47 = new byte[local21];
			local13.method1226(local21, local47);
			return local47;
		} else {
			@Pc(59) int local59 = local13.method1263();
			if (local59 < 0 || Static135.anInt3216 != 0 && local59 > Static135.anInt3216) {
				throw new RuntimeException();
			}
			@Pc(80) byte[] local80 = new byte[local59];
			if (local17 == 1) {
				Static70.method1490(local80, local59, arg0, local21);
			} else {
				Static188.aClass94_1.method3127(local80, local13);
			}
			return local80;
		}
	}
}
