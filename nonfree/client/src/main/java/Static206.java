import java.net.URL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static206 {

	@OriginalMember(owner = "client!oj", name = "b", descriptor = "Z")
	public static boolean aBoolean291;

	@OriginalMember(owner = "client!oj", name = "m", descriptor = "Lclient!dj;")
	public static Class2_Sub8_Sub5_Sub1 aClass2_Sub8_Sub5_Sub1_1;

	@OriginalMember(owner = "client!oj", name = "n", descriptor = "I")
	public static int anInt4289;

	@OriginalMember(owner = "client!oj", name = "c", descriptor = "Ljava/lang/String;")
	public static String aString147 = "Allocated memory";

	@OriginalMember(owner = "client!oj", name = "i", descriptor = "Lclient!lj;")
	public static Class106 aClass106_7 = new Class106(64);

	@OriginalMember(owner = "client!oj", name = "j", descriptor = "[I")
	public static int[] anIntArray424 = new int[] { 1, 1, 0, 0, 0, 8, 0, 0, 8 };

	@OriginalMember(owner = "client!oj", name = "l", descriptor = "Z")
	public static boolean aBoolean292 = true;

	@OriginalMember(owner = "client!oj", name = "o", descriptor = "I")
	public static int anInt4290 = 500;

	@OriginalMember(owner = "client!oj", name = "p", descriptor = "[I")
	public static int[] anIntArray425 = new int[64];

	@OriginalMember(owner = "client!oj", name = "q", descriptor = "Z")
	public static boolean aBoolean293 = false;

	@OriginalMember(owner = "client!oj", name = "a", descriptor = "(II)Z")
	public static boolean method3477(@OriginalArg(0) int arg0) {
		@Pc(7) Class58_Sub1 local7 = Static252.method3958(arg0);
		if (local7 == null) {
			return false;
		} else if (Static158.anInt3501 == 1 || Static158.anInt3501 == 2 || Static123.anInt2856 == 2) {
			Static74.anInt1836 = local7.anInt2165;
			Static122.aString96 = local7.aString78;
			if (Static123.anInt2856 != 0) {
				Static285.anInt5646 = Static74.anInt1836 + 50000;
				Static259.anInt5136 = Static74.anInt1836 + 40000;
				Static166.anInt3677 = Static259.anInt5136;
			}
			return true;
		} else {
			@Pc(51) String local51 = "";
			if (Static123.anInt2856 != 0) {
				local51 = ":" + (local7.anInt2165 + 7000);
			}
			@Pc(71) String local71 = "";
			if (Static6.aString4 != null) {
				local71 = "/p=" + Static6.aString4;
			}
			@Pc(129) String local129 = "http://" + local7.aString78 + local51 + "/l=" + Static100.anInt2375 + "/a=" + Static21.anInt460 + local71 + "/j" + (Static219.aBoolean300 ? "1" : "0") + ",o" + (Static154.aBoolean237 ? "1" : "0") + ",a2,m" + (Static115.aBoolean396 ? "1" : "0");
			try {
				Static243.aClient1.getAppletContext().showDocument(new URL(local129), "_self");
				return true;
			} catch (@Pc(139) Exception local139) {
				return false;
			}
		}
	}

	@OriginalMember(owner = "client!oj", name = "a", descriptor = "(Ljava/lang/String;JISZLjava/lang/String;II)V")
	public static void method3478(@OriginalArg(0) String arg0, @OriginalArg(1) long arg1, @OriginalArg(2) int arg2, @OriginalArg(3) short arg3, @OriginalArg(5) String arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6) {
		if (Static196.aBoolean281 || Static68.anInt1741 >= 500) {
			return;
		}
		Static56.aStringArray8[Static68.anInt1741] = arg4;
		Static175.aStringArray28[Static68.anInt1741] = arg0;
		Static131.anIntArray297[Static68.anInt1741] = arg6 == -1 ? Static203.anInt4260 : arg6;
		Static290.aShortArray85[Static68.anInt1741] = arg3;
		Static166.aLongArray4[Static68.anInt1741] = arg1;
		Static67.anIntArray144[Static68.anInt1741] = arg5;
		Static56.anIntArray123[Static68.anInt1741] = arg2;
		Static68.anInt1741++;
	}
}
