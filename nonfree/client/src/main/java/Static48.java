import java.net.URL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static48 {

	@OriginalMember(owner = "client!co", name = "c", descriptor = "[Ljava/lang/String;")
	public static String[] aStringArray45;

	@OriginalMember(owner = "client!co", name = "b", descriptor = "I")
	public static int anInt5547 = 13156520;

	@OriginalMember(owner = "client!co", name = "a", descriptor = "(II)I")
	public static int method4684(@OriginalArg(1) int arg0) {
		return arg0 & 0xFF;
	}

	@OriginalMember(owner = "client!co", name = "a", descriptor = "(IIIIBII)V")
	public static void method4685(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		@Pc(8) Class26 local8 = Static23.method4815(arg2, arg5);
		if (local8 != null && local8.anObjectArray9 != null) {
			@Pc(17) Class7_Sub25 local17 = new Class7_Sub25();
			local17.anObjectArray34 = local8.anObjectArray9;
			local17.aClass26_22 = local8;
			Static83.method1766(local17);
		}
		Static88.anInt3954 = arg3;
		Static301.anInt5782 = arg0;
		Static72.anInt1772 = arg1;
		Static253.aBoolean361 = true;
		Static221.anInt4408 = arg4;
		Static256.anInt4950 = arg2;
		Static269.anInt5313 = arg5;
		Static245.method4226(local8);
	}

	@OriginalMember(owner = "client!co", name = "a", descriptor = "(I)V")
	public static void method4689() {
		Static307.method4980();
		Static321.aClass14ArrayArray1 = null;
		Static34.aClass89_1 = null;
		Static142.aClass17_3 = null;
		Static114.aClass17_2 = null;
		Static178.aClass17_4 = null;
	}

	@OriginalMember(owner = "client!co", name = "b", descriptor = "(II)Z")
	public static boolean method4690(@OriginalArg(1) int arg0) {
		@Pc(7) Class187_Sub1 local7 = Static27.method479(arg0);
		if (local7 == null) {
			return false;
		} else if (Static22.anInt448 == 3) {
			@Pc(45) String local45 = "";
			if (Static151.anInt3239 != 0) {
				local45 = ":" + (local7.anInt5950 + 7000);
			}
			@Pc(63) String local63 = "";
			if (Static249.aString99 != null) {
				local63 = "/p=" + Static249.aString99;
			}
			@Pc(112) String local112 = "http://" + local7.aString382 + local45 + "/l=" + Static177.anInt3637 + "/a=" + Static37.anInt1055 + local63 + "/j" + (Static94.aBoolean158 ? "1" : "0") + ",o" + (Static329.aBoolean456 ? "1" : "0") + ",a2";
			try {
				Static251.aClient4.getAppletContext().showDocument(new URL(local112), "_self");
				return true;
			} catch (@Pc(122) Exception local122) {
				return false;
			}
		} else {
			Static65.anInt1630 = local7.anInt5950;
			Static302.aString423 = local7.aString382;
			if (Static151.anInt3239 != 0) {
				Static64.anInt1615 = Static65.anInt1630 + 40000;
				Static342.anInt6490 = Static65.anInt1630 + 50000;
				Static206.anInt4119 = Static64.anInt1615;
			}
			return true;
		}
	}

	@OriginalMember(owner = "client!co", name = "b", descriptor = "(III)Lclient!gl;")
	public static Class22_Sub4 method4691(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(7) Class49 local7 = Static229.aClass49ArrayArrayArray6[arg0][arg1][arg2];
		return local7 == null ? null : local7.aClass22_Sub4_1;
	}

	@OriginalMember(owner = "client!co", name = "a", descriptor = "(IIIIIB)V")
	public static void method4693(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		if (arg3 == arg2) {
			Static102.method2038(arg0, arg3, arg4, arg1);
		} else if (arg0 - arg3 >= Static61.anInt1534 && Static168.anInt3509 >= arg3 + arg0 && Static142.anInt3103 <= arg4 - arg2 && Static314.anInt6030 >= arg2 + arg4) {
			Static80.method1712(arg4, arg3, arg1, arg0, arg2);
		} else {
			Static129.method2631(arg4, arg1, arg0, arg2, arg3);
		}
	}
}
