import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static107 {

	@OriginalMember(owner = "client!sa", name = "i", descriptor = "[I")
	public static int[] anIntArray414;

	@OriginalMember(owner = "client!sa", name = "u", descriptor = "[Lclient!de;")
	public static Class1_Sub1_Sub4_Sub1[] aClass1_Sub1_Sub4_Sub1Array10;

	@OriginalMember(owner = "client!sa", name = "b", descriptor = "Lclient!kd;")
	public static Class39 aClass39_1305 = Static108.method1915("Hier wechseln");

	@OriginalMember(owner = "client!sa", name = "f", descriptor = "I")
	public static int anInt2687 = 0;

	@OriginalMember(owner = "client!sa", name = "k", descriptor = "Lclient!jb;")
	public static Class33 aClass33_37 = new Class33(100);

	@OriginalMember(owner = "client!sa", name = "l", descriptor = "Lclient!kd;")
	public static Class39 aClass39_1306 = Static108.method1915("Suche nach Updates )2 ");

	@OriginalMember(owner = "client!sa", name = "o", descriptor = "Lclient!kd;")
	private static Class39 aClass39_1307 = Static108.method1915("No reply from loginserver)3");

	@OriginalMember(owner = "client!sa", name = "q", descriptor = "Lclient!kd;")
	public static Class39 aClass39_1308 = aClass39_1307;

	@OriginalMember(owner = "client!sa", name = "t", descriptor = "Lclient!kd;")
	private static Class39 aClass39_1310 = Static108.method1915("Off");

	@OriginalMember(owner = "client!sa", name = "s", descriptor = "Lclient!kd;")
	public static Class39 aClass39_1309 = aClass39_1310;

	@OriginalMember(owner = "client!sa", name = "a", descriptor = "(Lclient!kd;Lclient!kd;Lclient!q;I)Lclient!gd;")
	public static Class1_Sub1_Sub4_Sub3 method1885(@OriginalArg(0) Class39 arg0, @OriginalArg(1) Class39 arg1, @OriginalArg(2) Class62 arg2) {
		@Pc(13) int local13 = arg2.method2015(arg0);
		@Pc(19) int local19 = arg2.method2012(local13, arg1);
		return Static36.method647(arg2, local19, local13);
	}

	@OriginalMember(owner = "client!sa", name = "a", descriptor = "(II)V")
	public static void method1886(@OriginalArg(0) int arg0) {
		for (@Pc(4) Class1_Sub11 local4 = (Class1_Sub11) Static48.aClass70_3.method1958(); local4 != null; local4 = (Class1_Sub11) Static48.aClass70_3.method1956()) {
			if ((long) arg0 == (local4.aLong98 >> 48 & 0xFFFFL)) {
				local4.method2128();
			}
		}
	}

	@OriginalMember(owner = "client!sa", name = "b", descriptor = "(II)Z")
	public static boolean method1887(@OriginalArg(1) int arg0) {
		return arg0 >= 48 && arg0 <= 57;
	}

	@OriginalMember(owner = "client!sa", name = "a", descriptor = "(B)V")
	public static void method1888() {
		aClass39_1308 = null;
		aClass33_37 = null;
		aClass39_1310 = null;
		aClass39_1307 = null;
		aClass39_1306 = null;
		anIntArray414 = null;
		aClass39_1305 = null;
		aClass39_1309 = null;
		aClass1_Sub1_Sub4_Sub1Array10 = null;
	}

	@OriginalMember(owner = "client!sa", name = "a", descriptor = "(IIIIIIILclient!a;I)V")
	public static void method1889(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) Class1_Sub1_Sub1 arg7) {
		if (Static66.aBoolean146) {
			Static12.anInt501 = 32;
		} else {
			Static12.anInt501 = 0;
		}
		Static66.aBoolean146 = false;
		@Pc(151) int local151;
		if (arg1 <= arg5 && arg5 < arg1 + 16 && arg4 >= arg0 && arg0 + 16 > arg4) {
			if (arg6 == 1) {
				Static35.aBoolean96 = true;
			}
			if (arg6 == 2 || arg6 == 3) {
				Static113.aBoolean226 = true;
			}
			arg7.anInt95 -= Static69.anInt1769 * 4;
		} else if (arg5 >= arg1 && arg1 + 16 > arg5 && arg0 + arg2 - 16 <= arg4 && arg4 < arg0 + arg2) {
			if (arg6 == 2 || arg6 == 3) {
				Static113.aBoolean226 = true;
			}
			if (arg6 == 1) {
				Static35.aBoolean96 = true;
			}
			arg7.anInt95 += Static69.anInt1769 * 4;
		} else if (arg1 - Static12.anInt501 <= arg5 && arg5 < Static12.anInt501 + arg1 + 16 && arg4 >= arg0 + 16 && arg0 + arg2 - 16 > arg4 && Static69.anInt1769 > 0) {
			Static66.aBoolean146 = true;
			if (arg6 == 1) {
				Static35.aBoolean96 = true;
			}
			if (arg6 == 2 || arg6 == 3) {
				Static113.aBoolean226 = true;
			}
			local151 = (arg2 - 32) * arg2 / arg3;
			if (local151 < 8) {
				local151 = 8;
			}
			@Pc(163) int local163 = arg2 - local151 - 32;
			@Pc(175) int local175 = arg4 - local151 / 2 - arg0 - 16;
			arg7.anInt95 = (arg3 - arg2) * local175 / local163;
		}
		if (Static74.anInt1858 == 0) {
			return;
		}
		local151 = arg7.anInt101;
		if (arg6 == -1) {
			local151 = 479;
		}
		if (arg1 - local151 > arg5 || arg4 < arg0 || arg1 + 16 <= arg5 || arg4 > arg2 + arg0) {
			return;
		}
		if (arg6 == 2 || arg6 == 3) {
			Static113.aBoolean226 = true;
		}
		if (arg6 == 1) {
			Static35.aBoolean96 = true;
		}
		arg7.anInt95 += Static74.anInt1858 * 45;
		return;
	}

	@OriginalMember(owner = "client!sa", name = "a", descriptor = "(Lclient!q;ILclient!q;Lclient!q;)V")
	public static void method1890(@OriginalArg(0) Class62 arg0, @OriginalArg(2) Class62 arg1, @OriginalArg(3) Class62 arg2) {
		Static97.aClass62_35 = arg2;
		Static44.aClass62_11 = arg1;
		Static56.aClass62_17 = arg0;
		Static102.aClass1_Sub1_Sub1ArrayArray1 = new Class1_Sub1_Sub1[Static44.aClass62_11.method2014()][];
		Static62.aBooleanArray16 = new boolean[Static44.aClass62_11.method2014()];
	}

	@OriginalMember(owner = "client!sa", name = "b", descriptor = "(B)V")
	public static void method1891() {
		Static85.aClass33_30.method1034();
		Static97.aClass33_43.method1034();
		Static33.aClass33_12.method1034();
		Static69.aClass33_24.method1034();
	}
}
