import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static243 {

	@OriginalMember(owner = "client!np", name = "i", descriptor = "I")
	public static int anInt4394;

	@OriginalMember(owner = "client!np", name = "j", descriptor = "[S")
	public static short[] aShortArray87;

	@OriginalMember(owner = "client!np", name = "b", descriptor = "Lclient!fn;")
	public static final Class77 aClass77_118 = new Class77(47, 5);

	@OriginalMember(owner = "client!np", name = "h", descriptor = "Z")
	public static boolean aBoolean331 = false;

	@OriginalMember(owner = "client!np", name = "k", descriptor = "Lclient!ms;")
	public static Class155 aClass155_26 = null;

	@OriginalMember(owner = "client!np", name = "a", descriptor = "(Lclient!es;IIBIII)V")
	public static void method3900(@OriginalArg(0) Class12_Sub1_Sub2 arg0, @OriginalArg(2) int arg1, @OriginalArg(4) int arg2, @OriginalArg(5) int arg3) {
		Static357.method861(arg0.aByte74, arg0.anInt6328, arg2, arg1, arg0.anInt6317, arg3, 0);
	}

	@OriginalMember(owner = "client!np", name = "a", descriptor = "(III)Z")
	public static boolean method3903(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		if (!Static48.aBoolean87) {
			return false;
		}
		@Pc(21) int local21 = arg0 >> 16;
		@Pc(25) int local25 = arg0 & 0xFFFF;
		if (Static228.aClass155ArrayArray1[local21] == null || Static228.aClass155ArrayArray1[local21][local25] == null) {
			return false;
		}
		@Pc(43) Class155 local43 = Static228.aClass155ArrayArray1[local21][local25];
		@Pc(54) Class2_Sub7 local54;
		if (arg1 == -1 && local43.anInt4164 == 0) {
			for (local54 = (Class2_Sub7) Static66.aClass210_43.method5035(); local54 != null; local54 = (Class2_Sub7) Static66.aClass210_43.method5037()) {
				if (local54.anInt541 == 23 || local54.anInt541 == 1004 || local54.anInt541 == 13 || local54.anInt541 == 50 || local54.anInt541 == 59) {
					for (@Pc(85) Class155 local85 = Static240.method3886(local54.anInt542); local85 != null; local85 = Static171.method2802(local85)) {
						if (local85.anInt4166 == local43.anInt4166) {
							return true;
						}
					}
				}
			}
		} else {
			for (local54 = (Class2_Sub7) Static66.aClass210_43.method5035(); local54 != null; local54 = (Class2_Sub7) Static66.aClass210_43.method5037()) {
				if (local54.anInt544 == arg1 && local43.anInt4166 == local54.anInt542 && (local54.anInt541 == 23 || local54.anInt541 == 1004 || local54.anInt541 == 13 || local54.anInt541 == 50 || local54.anInt541 == 59)) {
					return true;
				}
			}
		}
		return false;
	}
}
