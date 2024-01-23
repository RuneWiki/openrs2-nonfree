import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static189 {

	@OriginalMember(owner = "client!nj", name = "k", descriptor = "[[Lclient!ih;")
	public static Class4_Sub12[][] aClass4_Sub12ArrayArray2;

	@OriginalMember(owner = "client!nj", name = "h", descriptor = "Lclient!cc;")
	public static Class26 aClass26_35 = new Class26(64);

	@OriginalMember(owner = "client!nj", name = "i", descriptor = "Lclient!ic;")
	public static Class85 aClass85_17 = new Class85(32);

	@OriginalMember(owner = "client!nj", name = "j", descriptor = "Lclient!wa;")
	public static Class4_Sub10_Sub1 aClass4_Sub10_Sub1_2 = new Class4_Sub10_Sub1(5000);

	@OriginalMember(owner = "client!nj", name = "a", descriptor = "(III)I")
	public static int method3000(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(13) int local13 = arg1 >>> 31;
		return (local13 + arg1) / arg0 - local13;
	}

	@OriginalMember(owner = "client!nj", name = "a", descriptor = "(I)Z")
	public static boolean method3001() {
		if (Static75.aBoolean102) {
			try {
				Static319.method1852(Static276.aClass139_4.anApplet1, "showVideoAd");
				return true;
			} catch (@Pc(20) Throwable local20) {
			}
		}
		return false;
	}

	@OriginalMember(owner = "client!nj", name = "a", descriptor = "(II)V")
	public static void method3002(@OriginalArg(1) int arg0) {
		Static52.anInt2245 = arg0;
		Static253.method4018(3);
		Static253.method4018(4);
	}
}
