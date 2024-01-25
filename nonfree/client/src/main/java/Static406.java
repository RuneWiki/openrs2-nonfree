import java.awt.Rectangle;
import java.net.URL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static406 {

	@OriginalMember(owner = "client!uk", name = "f", descriptor = "Lclient!lh;")
	public static Class1_Sub1 aClass1_Sub1_7 = new Class1_Sub1(1);

	@OriginalMember(owner = "client!uk", name = "i", descriptor = "I")
	public static int anInt7018 = 0;

	@OriginalMember(owner = "client!uk", name = "t", descriptor = "[I")
	public static final int[] anIntArray583 = new int[] { 36064, 36065, 36066, 36067, 36068, 36069, 36070, 36071, 36096 };

	@OriginalMember(owner = "client!uk", name = "a", descriptor = "(II)Z")
	public static boolean method5488(@OriginalArg(1) int arg0) {
		@Pc(7) Class196_Sub1 local7 = Static66.method1141(arg0);
		if (local7 == null) {
			return false;
		} else if (Static210.anInt3860 == 3) {
			@Pc(37) String local37 = "";
			if (Static221.aClass176_5 != Static234.aClass176_7) {
				local37 = ":" + (local7.anInt7431 + 7000);
			}
			@Pc(53) String local53 = "";
			if (Static143.aString15 != null) {
				local53 = "/p=" + Static143.aString15;
			}
			@Pc(102) String local102 = "http://" + local7.aString62 + local37 + "/l=" + Static167.anInt3118 + "/a=" + Static253.anInt4554 + local53 + "/j" + (Static45.aBoolean36 ? "1" : "0") + ",o" + (Static74.aBoolean70 ? "1" : "0") + ",a2";
			try {
				Static185.aClient1.getAppletContext().showDocument(new URL(local102), "_self");
				return true;
			} catch (@Pc(118) Exception local118) {
				return false;
			}
		} else {
			Static193.anInt1052 = local7.anInt7431;
			Static212.aString4 = local7.aString62;
			if (Static234.aClass176_7 != Static221.aClass176_5) {
				Static41.anInt7070 = Static193.anInt1052 + 40000;
				Static58.anInt1248 = Static193.anInt1052 + 50000;
				Static163.anInt3040 = Static41.anInt7070;
			}
			return true;
		}
	}

	@OriginalMember(owner = "client!uk", name = "a", descriptor = "(Lclient!ss;B)V")
	public static void method5489(@OriginalArg(0) Class219 arg0) {
		@Pc(7) Class219 local7 = Static119.method5886(arg0);
		@Pc(15) int local15;
		@Pc(12) int local12;
		if (local7 == null) {
			local15 = Static207.anInt3842;
			local12 = Static255.anInt4574;
		} else {
			local12 = local7.anInt6363;
			local15 = local7.anInt6398;
		}
		Static175.method2726(local12, false, arg0, local15);
		Static185.method2826(local15, local12, arg0);
	}

	@OriginalMember(owner = "client!uk", name = "a", descriptor = "(ZI)V")
	public static void method5490(@OriginalArg(1) int arg0) {
		@Pc(13) Class1_Sub2_Sub1 local13 = Static258.method5559(arg0, 10);
		local13.method195();
	}

	@OriginalMember(owner = "client!uk", name = "h", descriptor = "(I)Lclient!gm;")
	public static Class95 method5493() {
		try {
			return (Class95) Class.forName("Class95_Sub1").getDeclaredConstructor().newInstance();
		} catch (@Pc(15) Throwable local15) {
			return null;
		}
	}

	@OriginalMember(owner = "client!uk", name = "a", descriptor = "(IIIIB)V")
	public static void method5495(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		for (@Pc(13) int local13 = 0; local13 < Static262.anInt4661; local13++) {
			@Pc(19) Rectangle local19 = Class1_Sub45.aRectangleArray2[local13];
			if (arg3 < local19.x + local19.width && local19.x < arg0 + arg3 && local19.y + local19.height > arg2 && arg2 + arg1 > local19.y) {
				Static108.aBooleanArray7[local13] = true;
			}
		}
	}
}
