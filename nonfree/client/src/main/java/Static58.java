import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static58 {

	@OriginalMember(owner = "client!e", name = "N", descriptor = "Lclient!bn;")
	public static Class2_Sub8_Sub1 aClass2_Sub8_Sub1_6;

	@OriginalMember(owner = "client!e", name = "Q", descriptor = "F")
	public static float aFloat4;

	@OriginalMember(owner = "client!e", name = "M", descriptor = "Ljava/lang/String;")
	public static String aString52 = " is already on your ignore list.";

	@OriginalMember(owner = "client!e", name = "P", descriptor = "J")
	public static long aLong50 = 0L;

	@OriginalMember(owner = "client!e", name = "a", descriptor = "(IBIZ[Lclient!g;I)V")
	public static void method1137(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) boolean arg2, @OriginalArg(4) Class56[] arg3, @OriginalArg(5) int arg4) {
		for (@Pc(18) int local18 = 0; local18 < arg3.length; local18++) {
			@Pc(30) Class56 local30 = arg3[local18];
			if (local30 != null && local30.anInt2030 == arg4) {
				Static59.method1140(local30, arg0, arg1, arg2);
				Static150.method2673(local30, arg0, arg1);
				if (local30.anInt2063 > local30.anInt2053 - local30.anInt2057) {
					local30.anInt2063 = local30.anInt2053 - local30.anInt2057;
				}
				if (local30.anInt2063 < 0) {
					local30.anInt2063 = 0;
				}
				if (local30.anInt2039 > local30.anInt2087 - local30.anInt2031) {
					local30.anInt2039 = local30.anInt2087 - local30.anInt2031;
				}
				if (local30.anInt2039 < 0) {
					local30.anInt2039 = 0;
				}
				if (local30.anInt2092 == 0) {
					Static52.method967(arg2, local30);
				}
			}
		}
	}
}
