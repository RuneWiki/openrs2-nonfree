import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static49 {

	@OriginalMember(owner = "client!je", name = "b", descriptor = "Lclient!mb;")
	public static Class1_Sub1_Sub6_Sub3 aClass1_Sub1_Sub6_Sub3_14;

	@OriginalMember(owner = "client!je", name = "e", descriptor = "Lclient!fc;")
	public static Class1_Sub4 aClass1_Sub4_3;

	@OriginalMember(owner = "client!je", name = "l", descriptor = "I")
	public static int anInt1440;

	@OriginalMember(owner = "client!je", name = "c", descriptor = "I")
	public static int anInt1435 = 0;

	@OriginalMember(owner = "client!je", name = "g", descriptor = "Lclient!gd;")
	private static Class23 aClass23_762 = Static15.method178("Checking for updates )2 ");

	@OriginalMember(owner = "client!je", name = "h", descriptor = "[[[Lclient!oe;")
	public static Class45[][][] aClass45ArrayArrayArray3 = new Class45[4][104][104];

	@OriginalMember(owner = "client!je", name = "j", descriptor = "Lclient!gd;")
	public static Class23 aClass23_763 = Static15.method178("null");

	@OriginalMember(owner = "client!je", name = "k", descriptor = "I")
	public static int anInt1439 = 0;

	@OriginalMember(owner = "client!je", name = "m", descriptor = "Lclient!gd;")
	public static Class23 aClass23_764 = aClass23_762;

	@OriginalMember(owner = "client!je", name = "n", descriptor = "Lclient!gd;")
	public static Class23 aClass23_765 = Static15.method178("Bitte versuchen Sie es erneut)3");

	@OriginalMember(owner = "client!je", name = "o", descriptor = "Lclient!gd;")
	public static Class23 aClass23_766 = Static15.method178("Wir vermuten)1 dass jemand Ihr Passwort kennt)3");

	@OriginalMember(owner = "client!je", name = "a", descriptor = "(II[BI)I")
	public static int method895(@OriginalArg(0) int arg0, @OriginalArg(2) byte[] arg1, @OriginalArg(3) int arg2) {
		@Pc(10) int local10 = -1;
		for (@Pc(12) int local12 = arg2; local12 < arg0; local12++) {
			local10 = local10 >>> 8 ^ Class1_Sub10.anIntArray231[(local10 ^ arg1[local12]) & 0xFF];
		}
		return ~local10;
	}

	@OriginalMember(owner = "client!je", name = "a", descriptor = "(Lclient!gd;ILclient!rb;Lclient!gd;)[Lclient!mb;")
	public static Class1_Sub1_Sub6_Sub3[] method896(@OriginalArg(0) Class23 arg0, @OriginalArg(2) Class55 arg1, @OriginalArg(3) Class23 arg2) {
		@Pc(4) int local4 = arg1.method1885(arg2);
		@Pc(14) int local14 = arg1.method1876(local4, arg0);
		return Static48.method983(arg1, local14, local4);
	}

	@OriginalMember(owner = "client!je", name = "a", descriptor = "(I)V")
	public static void method897() {
		if (Static72.aClass1_Sub1_Sub7_5 == null) {
			return;
		}
		@Pc(13) Class1_Sub1_Sub7 local13 = Static72.aClass1_Sub1_Sub7_5;
		@Pc(17) Class1_Sub1_Sub7 local17 = Static80.method1396(local13);
		if (local17 == null) {
			Static72.aClass1_Sub1_Sub7_5 = null;
			return;
		}
		Static63.anInt1928++;
		@Pc(30) int[] local30 = Static43.method913(local17);
		@Pc(34) int[] local34 = Static43.method913(local13);
		@Pc(39) int local39 = Static110.anInt2872 - Static58.anInt2821;
		@Pc(43) int local43 = Static32.anInt1007 - Static92.anInt2922;
		if (local13.anInt800 >= local43 && local43 >= -local13.anInt800 && local39 <= local13.anInt800 && local39 >= -local13.anInt800 && !Static61.aBoolean94) {
			local39 = 0;
			local43 = 0;
		} else if (Static63.anInt1928 > local13.anInt806 || Static61.aBoolean94) {
			Static61.aBoolean94 = true;
		} else {
			local39 = 0;
			local43 = 0;
		}
		@Pc(110) int local110 = local34[1] + local39 - local30[1];
		@Pc(120) int local120 = local34[0] + local43 - local30[0];
		if (local120 < 0) {
			local120 = 0;
		}
		if (local110 < 0) {
			local110 = 0;
		}
		if (local13.anInt817 + local110 > local17.anInt817) {
			local110 = local17.anInt817 - local13.anInt817;
		}
		if (local120 + local13.anInt823 > local17.anInt823) {
			local120 = local17.anInt823 - local13.anInt823;
		}
		if (Static72.aClass1_Sub1_Sub7_5.anObjectArray14 != null && Static61.aBoolean94) {
			Static34.method585(local13.anObjectArray14, local110, local120, local13, 0);
		}
		if (Static89.anInt2389 != 0) {
			return;
		}
		if (!Static61.aBoolean94) {
			if (Static72.aClass1_Sub1_Sub7_5.anObjectArray7 != null) {
				Static34.method585(local13.anObjectArray7, local110, local120, local13, 0);
			}
			if ((Static104.anInt2687 == 1 || Static110.method1893(Static40.anInt1400 - 1)) && Static40.anInt1400 > 2) {
				Static106.method1794();
			} else if (Static40.anInt1400 > 0) {
				Static7.method94(Static40.anInt1400 - 1);
			}
		} else if (Static72.aClass1_Sub1_Sub7_5.anObjectArray10 != null) {
			Static34.method585(local13.anObjectArray10, local110, local120, local13, 0);
		}
		Static72.aClass1_Sub1_Sub7_5 = null;
		return;
	}

	@OriginalMember(owner = "client!je", name = "a", descriptor = "(Z)V")
	public static void method899() {
		while (true) {
			@Pc(10) Class45 local10 = Static48.aClass45_4;
			@Pc(21) Class1_Sub7 local21;
			synchronized (Static48.aClass45_4) {
				local21 = (Class1_Sub7) Static39.aClass45_3.method1300();
			}
			if (local21 == null) {
				return;
			}
			local21.aClass55_Sub1_8.method1897(local21.aByteArray8, local21.aClass41_1, (int) local21.aLong85, false);
		}
	}

	@OriginalMember(owner = "client!je", name = "c", descriptor = "(I)V")
	public static void method902() {
		aClass23_765 = null;
		aClass23_763 = null;
		aClass23_764 = null;
		aClass45ArrayArrayArray3 = null;
		aClass1_Sub1_Sub6_Sub3_14 = null;
		aClass23_766 = null;
		aClass23_762 = null;
		aClass1_Sub4_3 = null;
	}
}
