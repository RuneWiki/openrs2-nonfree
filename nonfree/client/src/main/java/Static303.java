import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static303 {

	@OriginalMember(owner = "client!kea", name = "f", descriptor = "Lclient!da;")
	public static Class69 aClass69_6;

	@OriginalMember(owner = "client!kea", name = "j", descriptor = "Ljava/lang/String;")
	public static String aString49 = null;

	@OriginalMember(owner = "client!kea", name = "a", descriptor = "(Lclient!or;III)V")
	public static void method4658(@OriginalArg(0) Class260 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (arg0.aByte96 == 0) {
			arg0.anInt6950 = arg0.anInt6991;
		} else if (arg0.aByte96 == 1) {
			arg0.anInt6950 = (arg1 - arg0.anInt6971) / 2 + arg0.anInt6991;
		} else if (arg0.aByte96 == 2) {
			arg0.anInt6950 = arg1 - arg0.anInt6971 - arg0.anInt6991;
		} else if (arg0.aByte96 == 3) {
			arg0.anInt6950 = arg0.anInt6991 * arg1 >> 14;
		} else if (arg0.aByte96 == 4) {
			arg0.anInt6950 = (arg1 * arg0.anInt6991 >> 14) + (arg1 - arg0.anInt6971) / 2;
		} else {
			arg0.anInt6950 = arg1 - (arg0.anInt6991 * arg1 >> 14) - arg0.anInt6971;
		}
		if (arg0.aByte97 == 0) {
			arg0.anInt6942 = arg0.anInt6932;
		} else if (arg0.aByte97 == 1) {
			arg0.anInt6942 = (arg2 - arg0.anInt6963) / 2 + arg0.anInt6932;
		} else if (arg0.aByte97 == 2) {
			arg0.anInt6942 = arg2 - arg0.anInt6963 - arg0.anInt6932;
		} else if (arg0.aByte97 == 3) {
			arg0.anInt6942 = arg0.anInt6932 * arg2 >> 14;
		} else if (arg0.aByte97 == 4) {
			arg0.anInt6942 = (arg2 - arg0.anInt6963) / 2 + (arg2 * arg0.anInt6932 >> 14);
		} else {
			arg0.anInt6942 = arg2 - arg0.anInt6963 - (arg2 * arg0.anInt6932 >> 14);
		}
		if (!Static561.aBoolean714 || Static79.method1526(arg0).anInt8078 == 0 && arg0.anInt7003 != 0) {
			return;
		}
		if (arg0.anInt6950 < 0) {
			arg0.anInt6950 = 0;
		} else if (arg0.anInt6950 + arg0.anInt6971 > arg1) {
			arg0.anInt6950 = arg1 - arg0.anInt6971;
		}
		if (arg0.anInt6942 < 0) {
			arg0.anInt6942 = 0;
		} else if (arg0.anInt6942 + arg0.anInt6963 > arg2) {
			arg0.anInt6942 = arg2 - arg0.anInt6963;
			return;
		}
	}

	@OriginalMember(owner = "client!kea", name = "a", descriptor = "(ZLjava/lang/String;ZILjava/lang/String;BZIIJIIJ)V")
	public static void method4660(@OriginalArg(0) boolean arg0, @OriginalArg(1) String arg1, @OriginalArg(2) boolean arg2, @OriginalArg(3) int arg3, @OriginalArg(4) String arg4, @OriginalArg(6) boolean arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) long arg8, @OriginalArg(10) int arg9, @OriginalArg(11) int arg10, @OriginalArg(12) long arg11) {
		if (!Static43.aBoolean74 && Static450.anInt7444 < 500) {
			@Pc(17) int local17 = arg10 == -1 ? Static21.anInt510 : arg10;
			@Pc(33) Class3_Sub11_Sub14 local33 = new Class3_Sub11_Sub14(arg1, arg4, local17, arg7, arg3, arg11, arg6, arg9, arg5, arg0, arg8, arg2);
			Static30.method699(local33);
		}
	}
}
