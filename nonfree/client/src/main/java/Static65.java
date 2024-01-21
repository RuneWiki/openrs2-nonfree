import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static65 {

	@OriginalMember(owner = "client!nc", name = "E", descriptor = "Lclient!w;")
	public static Class55_Sub1 aClass55_Sub1_12;

	@OriginalMember(owner = "client!nc", name = "Q", descriptor = "I")
	public static int anInt1962;

	@OriginalMember(owner = "client!nc", name = "M", descriptor = "Lclient!gd;")
	private static Class23 aClass23_1120 = Static15.method178("Loading textures )2 ");

	@OriginalMember(owner = "client!nc", name = "N", descriptor = "Lclient!gd;")
	public static Class23 aClass23_1121 = Static15.method178("Stufe)2");

	@OriginalMember(owner = "client!nc", name = "R", descriptor = "Lclient!gd;")
	private static Class23 aClass23_1124 = Static15.method178("Off");

	@OriginalMember(owner = "client!nc", name = "O", descriptor = "Lclient!gd;")
	public static Class23 aClass23_1122 = aClass23_1124;

	@OriginalMember(owner = "client!nc", name = "P", descriptor = "Lclient!gd;")
	public static Class23 aClass23_1123 = Static15.method178("Gegenstand konnte nicht gefunden werden)1 verk-Urzen Sie den Suchbegriff)3");

	@OriginalMember(owner = "client!nc", name = "S", descriptor = "Lclient!gd;")
	public static Class23 aClass23_1125 = aClass23_1120;

	@OriginalMember(owner = "client!nc", name = "T", descriptor = "I")
	public static int anInt1963 = 0;

	@OriginalMember(owner = "client!nc", name = "a", descriptor = "(BI)Lclient!vc;")
	public static Class1_Sub1_Sub16 method1251(@OriginalArg(1) int arg0) {
		@Pc(10) Class1_Sub1_Sub16 local10 = (Class1_Sub1_Sub16) Static98.aClass5_55.method98((long) arg0);
		if (local10 != null) {
			return local10;
		}
		@Pc(20) byte[] local20 = Static79.aClass55_34.method1867(arg0, 9);
		local10 = new Class1_Sub1_Sub16();
		local10.anInt2748 = arg0;
		if (local20 != null) {
			local10.method1813(new Class1_Sub5(local20));
		}
		local10.method1820();
		Static98.aClass5_55.method97(local10, (long) arg0);
		return local10;
	}

	@OriginalMember(owner = "client!nc", name = "a", descriptor = "(IZILclient!hd;)V")
	public static void method1252(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Class1_Sub1_Sub6_Sub1 arg2) {
		if (arg2 == null) {
			return;
		}
		@Pc(13) int local13 = Static3.anInt133 + Static35.anInt1096 & 0x7FF;
		@Pc(21) int local21 = arg0 * arg0 + arg1 * arg1;
		if (local21 > 6400) {
			return;
		}
		@Pc(29) int local29 = Static81.anIntArray300[local13];
		@Pc(33) int local33 = Static81.anIntArray292[local13];
		@Pc(41) int local41 = local29 * 256 / (Static50.anInt1618 + 256);
		@Pc(49) int local49 = local33 * 256 / (Static50.anInt1618 + 256);
		@Pc(60) int local60 = arg0 * local41 + arg1 * local49 >> 16;
		@Pc(71) int local71 = arg0 * local49 - local41 * arg1 >> 16;
		if (local21 <= 2500) {
			arg2.method798(local60 + 98 - arg2.anInt1331 / 2, -(arg2.anInt1333 / 2) + -4 + -local71 + 83);
		} else {
			arg2.method783(Static75.aClass1_Sub1_Sub6_Sub3_20, local60 + 98 - arg2.anInt1331 / 2, 83 - (local71 + arg2.anInt1333 / 2) + -4);
		}
	}

	@OriginalMember(owner = "client!nc", name = "a", descriptor = "(Lclient!w;BI)V")
	public static void method1253(@OriginalArg(0) Class55_Sub1 arg0, @OriginalArg(2) int arg1) {
		if (Static25.aClass1_Sub5_3 == null) {
			method1254(255, 0, null, true, 255, (byte) 0);
			Static89.aClass55_Sub1Array1[arg1] = arg0;
		} else {
			Static25.aClass1_Sub5_3.anInt1266 = arg1 * 4 + 5;
			@Pc(16) int local16 = Static25.aClass1_Sub5_3.method692();
			arg0.method1892(local16);
		}
	}

	@OriginalMember(owner = "client!nc", name = "a", descriptor = "(IIBLclient!w;ZIB)V")
	public static void method1254(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) Class55_Sub1 arg2, @OriginalArg(4) boolean arg3, @OriginalArg(5) int arg4, @OriginalArg(6) byte arg5) {
		@Pc(11) long local11 = (long) ((arg4 << 16) + arg0);
		@Pc(17) Class1_Sub1_Sub11 local17 = (Class1_Sub1_Sub11) Static29.aClass14_4.method343(local11);
		if (local17 != null) {
			return;
		}
		local17 = (Class1_Sub1_Sub11) Static31.aClass14_6.method343(local11);
		if (local17 != null) {
			return;
		}
		local17 = (Class1_Sub1_Sub11) Static107.aClass14_7.method343(local11);
		if (local17 == null) {
			if (!arg3) {
				local17 = (Class1_Sub1_Sub11) Static29.aClass14_5.method343(local11);
				if (local17 != null) {
					return;
				}
			}
			local17 = new Class1_Sub1_Sub11();
			local17.aClass55_Sub1_13 = arg2;
			local17.aByte1 = arg5;
			local17.anInt2003 = arg1;
			if (arg3) {
				Static29.aClass14_4.method345(local17, local11);
				Static52.anInt1630++;
			} else {
				Static75.aClass38_2.method1207(local17);
				Static107.aClass14_7.method345(local17, local11);
				Static88.anInt1218++;
			}
		} else if (arg3) {
			local17.method1855();
			Static29.aClass14_4.method345(local17, local11);
			Static88.anInt1218--;
			Static52.anInt1630++;
		}
	}

	@OriginalMember(owner = "client!nc", name = "c", descriptor = "(I)V")
	public static void method1255() {
		aClass23_1120 = null;
		aClass23_1122 = null;
		aClass23_1124 = null;
		aClass23_1125 = null;
		aClass23_1123 = null;
		aClass23_1121 = null;
		aClass55_Sub1_12 = null;
		Class1_Sub10.anIntArray231 = null;
	}
}
