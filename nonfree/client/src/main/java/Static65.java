import java.io.DataInputStream;
import java.net.URL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static65 {

	@OriginalMember(owner = "client!kd", name = "c", descriptor = "I")
	public static int anInt1734;

	@OriginalMember(owner = "client!kd", name = "b", descriptor = "Lclient!id;")
	public static Class34 aClass34_810 = Static9.method266("Lade Wordpack )2 ");

	@OriginalMember(owner = "client!kd", name = "f", descriptor = "Lclient!id;")
	private static Class34 aClass34_811 = Static9.method266("Location");

	@OriginalMember(owner = "client!kd", name = "i", descriptor = "Lclient!id;")
	public static Class34 aClass34_812 = Static9.method266("Clientscript error )2 check log for details");

	@OriginalMember(owner = "client!kd", name = "m", descriptor = "[Lclient!id;")
	public static Class34[] aClass34Array15 = new Class34[8];

	@OriginalMember(owner = "client!kd", name = "q", descriptor = "Lclient!id;")
	public static Class34 aClass34_813 = aClass34_811;

	@OriginalMember(owner = "client!kd", name = "v", descriptor = "Lclient!id;")
	public static Class34 aClass34_814 = Static9.method266("Hierhin gehen");

	@OriginalMember(owner = "client!kd", name = "a", descriptor = "(B)V")
	public static void method1110() {
		aClass34_812 = null;
		aClass34_811 = null;
		aClass34_813 = null;
		aClass34_810 = null;
		aClass34Array15 = null;
		aClass34_814 = null;
	}

	@OriginalMember(owner = "client!kd", name = "a", descriptor = "(IIIII)V")
	public static void method1111(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		for (@Pc(11) int local11 = arg0; local11 <= arg0 + arg1; local11++) {
			for (@Pc(15) int local15 = arg2; local15 <= arg2 + arg3; local15++) {
				if (local15 >= 0 && local15 < 104 && local11 >= 0 && local11 < 104) {
					Static69.aByteArrayArrayArray7[0][local15][local11] = 127;
					if (arg2 == local15 && local15 > 0) {
						Static98.anIntArrayArrayArray4[0][local15][local11] = Static98.anIntArrayArrayArray4[0][local15 - 1][local11];
					}
					if (arg2 + arg3 == local15 && local15 < 103) {
						Static98.anIntArrayArrayArray4[0][local15][local11] = Static98.anIntArrayArrayArray4[0][local15 + 1][local11];
					}
					if (local11 == arg0 && local11 > 0) {
						Static98.anIntArrayArrayArray4[0][local15][local11] = Static98.anIntArrayArrayArray4[0][local15][local11 - 1];
					}
					if (arg0 + arg1 == local11 && local11 < 103) {
						Static98.anIntArrayArrayArray4[0][local15][local11] = Static98.anIntArrayArrayArray4[0][local15][local11 + 1];
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!kd", name = "a", descriptor = "(JI)V")
	public static void method1113(@OriginalArg(0) long arg0) {
		if (arg0 == 0L) {
			return;
		}
		for (@Pc(12) int local12 = 0; local12 < Static114.anInt2736; local12++) {
			if (Static40.aLongArray3[local12] == arg0) {
				Static114.anInt2736--;
				for (@Pc(34) int local34 = local12; local34 < Static114.anInt2736; local34++) {
					Static40.aLongArray3[local34] = Static40.aLongArray3[local34 + 1];
				}
				Static38.anInt1125 = Static70.anInt1848;
				Static21.aClass1_Sub19_Sub1_1.method2105(189);
				Static21.aClass1_Sub19_Sub1_1.method2073(arg0);
				return;
			}
		}
	}

	@OriginalMember(owner = "client!kd", name = "a", descriptor = "(ILjava/lang/String;Ljava/lang/Throwable;)V")
	public static void method1115(@OriginalArg(1) String arg0, @OriginalArg(2) Throwable arg1) {
		try {
			@Pc(7) String local7 = "";
			if (arg1 != null) {
				local7 = Static7.method251(arg1);
			}
			if (arg0 != null) {
				if (arg1 != null) {
					local7 = local7 + " | ";
				}
				local7 = local7 + arg0;
			}
			System.out.println("Error: " + local7);
			local7 = local7.replace(':', '.');
			local7 = local7.replace('@', '_');
			local7 = local7.replace('&', '_');
			local7 = local7.replace('#', '_');
			if (Static26.aClass15_1.anApplet1 != null) {
				@Pc(109) Class73 local109 = Static26.aClass15_1.method490(new URL(Static26.aClass15_1.anApplet1.getCodeBase(), "clienterror.ws?c=" + Static15.anInt602 + "&u=" + Static109.aLong161 + "&v1=" + Static25.aString1 + "&v2=" + Static25.aString2 + "&e=" + local7));
				while (local109.anInt2813 == 0) {
					Static109.method2037(1L);
				}
				if (local109.anInt2813 == 1) {
					@Pc(125) DataInputStream local125 = (DataInputStream) local109.anObject4;
					local125.read();
					local125.close();
				}
			}
		} catch (@Pc(132) Exception local132) {
		}
	}

	@OriginalMember(owner = "client!kd", name = "b", descriptor = "(B)Z")
	public static boolean method1116() {
		try {
			if (Static93.anInt2429 == 2) {
				if (Static45.aClass1_Sub13_10 == null) {
					Static45.aClass1_Sub13_10 = Static136.method1057(Static98.aClass35_25, Static37.anInt1103, Static21.anInt756);
					if (Static45.aClass1_Sub13_10 == null) {
						return false;
					}
				}
				if (Static15.aClass42_1 == null) {
					Static15.aClass42_1 = new Class42(Static67.aClass35_18, Static119.aClass35_30);
				}
				if (Static22.aClass1_Sub4_Sub1_1.method316(Static130.aClass35_12, Static15.aClass42_1, Static45.aClass1_Sub13_10)) {
					Static22.aClass1_Sub4_Sub1_1.method322();
					Static22.aClass1_Sub4_Sub1_1.method337(Static12.anInt540);
					Static22.aClass1_Sub4_Sub1_1.method317(Static45.aClass1_Sub13_10, Static76.aBoolean109);
					Static98.aClass35_25 = null;
					Static45.aClass1_Sub13_10 = null;
					Static93.anInt2429 = 0;
					Static15.aClass42_1 = null;
					return true;
				}
			}
		} catch (@Pc(65) Exception local65) {
			local65.printStackTrace();
			Static22.aClass1_Sub4_Sub1_1.method334();
			Static45.aClass1_Sub13_10 = null;
			Static93.anInt2429 = 0;
			Static15.aClass42_1 = null;
			Static98.aClass35_25 = null;
		}
		return false;
	}

	@OriginalMember(owner = "client!kd", name = "a", descriptor = "(Lclient!of;Lclient!id;I)I")
	public static int method1117(@OriginalArg(0) Class1_Sub19 arg0, @OriginalArg(1) Class34 arg1) {
		@Pc(6) int local6 = arg0.anInt3111;
		arg0.method2081(arg1.anInt1553);
		arg0.anInt3111 += Static95.aClass21_1.method566(arg1.anInt1553, arg0.anInt3111, arg0.aByteArray42, arg1.aByteArray20, 0);
		return arg0.anInt3111 - local6;
	}

	@OriginalMember(owner = "client!kd", name = "a", descriptor = "(IB)Lclient!wa;")
	public static Class1_Sub1_Sub17 method1119(@OriginalArg(0) int arg0) {
		@Pc(10) Class1_Sub1_Sub17 local10 = (Class1_Sub1_Sub17) Static112.aClass63_21.method1663((long) arg0);
		if (local10 != null) {
			return local10;
		}
		@Pc(25) byte[] local25 = Static122.aClass35_33.method1573(9, arg0);
		local10 = new Class1_Sub1_Sub17();
		local10.anInt3043 = arg0;
		if (local25 != null) {
			local10.method2015(new Class1_Sub19(local25));
		}
		local10.method2013();
		Static112.aClass63_21.method1659(local10, (long) arg0);
		return local10;
	}
}
