import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static224 {

	@OriginalMember(owner = "client!rc", name = "d", descriptor = "Lclient!hm;")
	public static Class75 aClass75_1;

	@OriginalMember(owner = "client!rc", name = "i", descriptor = "F")
	public static float aFloat47;

	@OriginalMember(owner = "client!rc", name = "j", descriptor = "Lclient!pk;")
	public static Class132 aClass132_77;

	@OriginalMember(owner = "client!rc", name = "n", descriptor = "Ljava/lang/String;")
	public static String aString162;

	@OriginalMember(owner = "client!rc", name = "b", descriptor = "[[I")
	public static int[][] anIntArrayArray26 = new int[5][5000];

	@OriginalMember(owner = "client!rc", name = "l", descriptor = "Z")
	public static boolean aBoolean368 = false;

	@OriginalMember(owner = "client!rc", name = "m", descriptor = "Lclient!tk;")
	public static Class159 aClass159_16 = null;

	@OriginalMember(owner = "client!rc", name = "a", descriptor = "(IZ[Lclient!tk;III)V")
	public static void method3488(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) Class159[] arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		for (@Pc(3) int local3 = 0; local3 < arg2.length; local3++) {
			@Pc(11) Class159 local11 = arg2[local3];
			if (local11 != null && arg3 == local11.anInt5116) {
				Static9.method77(local11, arg4, arg0, arg1);
				Static182.method2788(arg0, local11, arg4);
				if (local11.anInt5162 - local11.anInt5123 < local11.anInt5128) {
					local11.anInt5128 = local11.anInt5162 - local11.anInt5123;
				}
				if (local11.anInt5128 < 0) {
					local11.anInt5128 = 0;
				}
				if (local11.anInt5176 > local11.anInt5207 - local11.anInt5121) {
					local11.anInt5176 = local11.anInt5207 - local11.anInt5121;
				}
				if (local11.anInt5176 < 0) {
					local11.anInt5176 = 0;
				}
				if (local11.anInt5197 == 0) {
					Static191.method2995(arg1, local11);
				}
			}
		}
	}

	@OriginalMember(owner = "client!rc", name = "a", descriptor = "(CI)Z")
	public static boolean method3489(@OriginalArg(0) char arg0) {
		return arg0 >= '0' && arg0 <= '9';
	}

	@OriginalMember(owner = "client!rc", name = "a", descriptor = "(II)V")
	public static void method3490(@OriginalArg(1) int arg0) {
		for (@Pc(5) Class8 local5 = Static94.aClass129_8.method3035(); local5 != null; local5 = Static94.aClass129_8.method3048()) {
			if ((local5.aLong203 >> 48 & 0xFFFFL) == (long) arg0) {
				local5.method4273();
			}
		}
	}
}
