import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static70 {

	@OriginalMember(owner = "client!mb", name = "b", descriptor = "Lclient!e;")
	public static Class16 aClass16_57 = new Class16(64);

	@OriginalMember(owner = "client!mb", name = "c", descriptor = "Lclient!u;")
	public static Class74 aClass74_1085 = Static72.method1077("::fpson");

	@OriginalMember(owner = "client!mb", name = "d", descriptor = "Lclient!u;")
	public static Class74 aClass74_1086 = Static72.method1077("@gre@");

	@OriginalMember(owner = "client!mb", name = "l", descriptor = "[I")
	public static int[] anIntArray193 = new int[25];

	@OriginalMember(owner = "client!mb", name = "A", descriptor = "Lclient!u;")
	private static Class74 aClass74_1091 = Static72.method1077("Select");

	@OriginalMember(owner = "client!mb", name = "p", descriptor = "Lclient!u;")
	public static Class74 aClass74_1087 = aClass74_1091;

	@OriginalMember(owner = "client!mb", name = "q", descriptor = "Lclient!u;")
	private static Class74 aClass74_1088 = Static72.method1077("Loaded fonts");

	@OriginalMember(owner = "client!mb", name = "w", descriptor = "Lclient!u;")
	public static Class74 aClass74_1089 = aClass74_1088;

	@OriginalMember(owner = "client!mb", name = "z", descriptor = "Lclient!u;")
	public static Class74 aClass74_1090 = Static72.method1077("Side panel redrawn");

	@OriginalMember(owner = "client!mb", name = "D", descriptor = "I")
	public static int anInt1546 = 0;

	@OriginalMember(owner = "client!mb", name = "E", descriptor = "Lclient!u;")
	public static Class74 aClass74_1092 = Static72.method1077("title_mute");

	@OriginalMember(owner = "client!mb", name = "a", descriptor = "(IIIIIBIIII)V")
	public static void method1060(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8) {
		@Pc(8) Class2_Sub8 local8 = (Class2_Sub8) Static104.aClass13_66.method415();
		@Pc(10) Class2_Sub8 local10 = null;
		while (local8 != null) {
			if (local8.anInt919 == arg4 && arg1 == local8.anInt921 && local8.anInt933 == arg8 && arg5 == local8.anInt924) {
				local10 = local8;
				break;
			}
			local8 = (Class2_Sub8) Static104.aClass13_66.method414();
		}
		if (local10 == null) {
			local10 = new Class2_Sub8();
			local10.anInt919 = arg4;
			local10.anInt933 = arg8;
			local10.anInt924 = arg5;
			local10.anInt921 = arg1;
			Static84.method1292(local10);
			Static104.aClass13_66.method418(local10);
		}
		local10.anInt923 = arg7;
		local10.anInt937 = arg2;
		local10.anInt925 = arg0;
		local10.anInt930 = arg6;
		local10.anInt932 = arg3;
	}

	@OriginalMember(owner = "client!mb", name = "a", descriptor = "(I)V")
	public static void method1061() {
		aClass74_1086 = null;
		anIntArray193 = null;
		aClass16_57 = null;
		aClass74_1092 = null;
		aClass74_1091 = null;
		aClass74_1085 = null;
		aClass74_1090 = null;
		aClass74_1088 = null;
		aClass74_1087 = null;
		aClass74_1089 = null;
	}

	@OriginalMember(owner = "client!mb", name = "a", descriptor = "(Lclient!ic;II)Lclient!u;")
	public static Class74 method1064(@OriginalArg(0) Class2_Sub10 arg0) {
		try {
			@Pc(12) Class74 local12 = new Class74();
			local12.anInt2481 = arg0.method1484();
			if (local12.anInt2481 > 32767) {
				local12.anInt2481 = 32767;
			}
			local12.aByteArray38 = new byte[local12.anInt2481];
			arg0.anInt2187 += Static105.aClass31_1.method678(local12.anInt2481, arg0.anInt2187, arg0.aByteArray27, 0, local12.aByteArray38);
			return local12;
		} catch (@Pc(49) Exception local49) {
			return Static116.aClass74_1557;
		}
	}

	@OriginalMember(owner = "client!mb", name = "b", descriptor = "(I)V")
	public static void method1065() {
		while (true) {
			@Pc(13) Class13 local13 = Static19.aClass13_17;
			@Pc(20) Class2_Sub19 local20;
			synchronized (Static19.aClass13_17) {
				local20 = (Class2_Sub19) Static63.aClass13_38.method419();
			}
			if (local20 == null) {
				return;
			}
			local20.aClass26_Sub1_68.method1376((int) local20.aLong96, local20.aClass77_4, false, local20.aByteArray29);
		}
	}

	@OriginalMember(owner = "client!mb", name = "a", descriptor = "(ILclient!ve;)Z")
	public static boolean method1067(@OriginalArg(1) Class2_Sub2_Sub17 arg0) {
		@Pc(9) int local9 = arg0.anInt2796;
		if (local9 >= 1 && local9 <= 200 || !(local9 < 701 || local9 > 900)) {
			if (local9 >= 801) {
				local9 -= 701;
			} else if (local9 >= 701) {
				local9 -= 601;
			} else if (local9 < 101) {
				local9--;
			} else {
				local9 -= 101;
			}
			Static79.method1250(0, 0, Static91.method1340(new Class74[] { Static42.aClass74_702, Static19.aClass74Array2[local9] }), Static33.aClass74_611, 0, 25);
			Static79.method1250(0, 0, Static91.method1340(new Class74[] { Static42.aClass74_702, Static19.aClass74Array2[local9] }), Static121.aClass74_1620, 0, 3);
			return true;
		} else if (local9 >= 401 && local9 <= 500) {
			Static79.method1250(0, 0, Static91.method1340(new Class74[] { Static42.aClass74_702, arg0.aClass74_1690 }), Static33.aClass74_611, 0, 41);
			return true;
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!mb", name = "a", descriptor = "(I[Lclient!u;BI)Lclient!u;")
	public static Class74 method1068(@OriginalArg(0) int arg0, @OriginalArg(1) Class74[] arg1, @OriginalArg(3) int arg2) {
		@Pc(7) int local7 = 0;
		for (@Pc(14) int local14 = 0; local14 < arg2; local14++) {
			if (arg1[arg0 + local14] == null) {
				arg1[local14 + arg0] = Static23.aClass74_508;
			}
			local7 += arg1[local14 + arg0].anInt2481;
		}
		@Pc(44) byte[] local44 = new byte[local7];
		@Pc(46) int local46 = 0;
		@Pc(57) Class74 local57;
		for (@Pc(48) int local48 = 0; local48 < arg2; local48++) {
			local57 = arg1[arg0 + local48];
			Static133.method956(local57.aByteArray38, 0, local44, local46, local57.anInt2481);
			local46 += local57.anInt2481;
		}
		local57 = new Class74();
		local57.anInt2481 = local7;
		local57.aByteArray38 = local44;
		return local57;
	}
}
