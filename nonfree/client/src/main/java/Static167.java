import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static167 {

	@OriginalMember(owner = "client!jb", name = "O", descriptor = "Lclient!dp;")
	public static Class51 aClass51_8;

	@OriginalMember(owner = "client!jb", name = "C", descriptor = "Lclient!sh;")
	public static final Class211 aClass211_76 = new Class211(45, 2);

	@OriginalMember(owner = "client!jb", name = "N", descriptor = "Lclient!bm;")
	public static final Class28 aClass28_2 = new Class28("WIP", 2);

	@OriginalMember(owner = "client!jb", name = "a", descriptor = "(II[B)I")
	public static int method2462(@OriginalArg(1) int arg0, @OriginalArg(2) byte[] arg1) {
		return Static245.method1575(0, arg1, arg0);
	}

	@OriginalMember(owner = "client!jb", name = "b", descriptor = "(I)V")
	public static void method2467() {
		if (Static25.aBoolean36) {
			return;
		}
		Static25.aBoolean36 = true;
		Static187.aBoolean292 = true;
		if (Static188.aClass135_Sub1_1.aBoolean329) {
			Static386.aFloat82 = (int) Static386.aFloat82 + 191 & 0xFFFFFF80;
		} else {
			Static356.aFloat22 += (24.0F - Static356.aFloat22) / 2.0F;
		}
	}
}
