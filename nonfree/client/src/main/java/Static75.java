import java.io.IOException;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static75 {

	@OriginalMember(owner = "client!od", name = "eb", descriptor = "I")
	public static int anInt1788;

	@OriginalMember(owner = "client!od", name = "gb", descriptor = "I")
	public static int anInt1790;

	@OriginalMember(owner = "client!od", name = "Ab", descriptor = "I")
	public static int anInt1798;

	@OriginalMember(owner = "client!od", name = "Gb", descriptor = "Lclient!uc;")
	public static Class3_Sub1_Sub4_Sub3 aClass3_Sub1_Sub4_Sub3_26;

	@OriginalMember(owner = "client!od", name = "cb", descriptor = "Lclient!ad;")
	public static Class4 aClass4_988 = method1216("(U5");

	@OriginalMember(owner = "client!od", name = "db", descriptor = "Lclient!ad;")
	private static Class4 aClass4_989 = method1216("Malformed login packet)3");

	@OriginalMember(owner = "client!od", name = "ib", descriptor = "Lclient!ad;")
	public static Class4 aClass4_990 = aClass4_989;

	@OriginalMember(owner = "client!od", name = "jb", descriptor = "Lclient!ad;")
	public static Class4 aClass4_991 = method1216("Die Verbindung konnte");

	@OriginalMember(owner = "client!od", name = "kb", descriptor = "[I")
	public static int[] anIntArray238 = new int[4000];

	@OriginalMember(owner = "client!od", name = "mb", descriptor = "Lclient!ad;")
	private static Class4 aClass4_992 = method1216("Enter amount:");

	@OriginalMember(owner = "client!od", name = "qb", descriptor = "Lclient!ad;")
	private static Class4 aClass4_993 = method1216("Loading title screen )2 ");

	@OriginalMember(owner = "client!od", name = "sb", descriptor = "Lclient!ad;")
	public static Class4 aClass4_994 = method1216("Verbindung mit Update)2Server)3)3)3");

	@OriginalMember(owner = "client!od", name = "tb", descriptor = "Lclient!ad;")
	public static Class4 aClass4_995 = aClass4_992;

	@OriginalMember(owner = "client!od", name = "vb", descriptor = "Lclient!ad;")
	public static Class4 aClass4_996 = method1216("@cr2@");

	@OriginalMember(owner = "client!od", name = "Bb", descriptor = "Lclient!ad;")
	private static Class4 aClass4_997 = method1216("RuneScape is loading )2 please wait)3)3)3");

	@OriginalMember(owner = "client!od", name = "Fb", descriptor = "Lclient!ad;")
	public static Class4 aClass4_998 = method1216(" )2>");

	@OriginalMember(owner = "client!od", name = "Kb", descriptor = "Lclient!ad;")
	public static Class4 aClass4_999 = method1216("mapfunction");

	@OriginalMember(owner = "client!od", name = "Lb", descriptor = "Lclient!ad;")
	public static Class4 aClass4_1000 = aClass4_993;

	@OriginalMember(owner = "client!od", name = "Mb", descriptor = "Lclient!ad;")
	public static Class4 aClass4_1001 = aClass4_997;

	@OriginalMember(owner = "client!od", name = "a", descriptor = "(IZ)Lclient!ad;")
	public static Class4 method1208(@OriginalArg(0) int arg0) {
		@Pc(9) Class4 local9 = Static93.method1632(arg0);
		for (@Pc(15) int local15 = local9.method118() - 3; local15 > 0; local15 -= 3) {
			local9 = Static60.method1012(new Class4[] { local9.method136(0, local15), Static28.aClass4_407, local9.method137(local15) });
		}
		if (local9.method118() > 8) {
			local9 = Static60.method1012(new Class4[] { Static34.aClass4_522, local9.method136(0, local9.method118() - 8), Static72.aClass4_918, Static86.aClass4_1125, local9, Static38.aClass4_1576 });
		} else if (local9.method118() > 4) {
			local9 = Static60.method1012(new Class4[] { Static54.aClass4_684, local9.method136(0, local9.method118() - 4), Static70.aClass4_875, Static86.aClass4_1125, local9, Static38.aClass4_1576 });
		}
		return Static60.method1012(new Class4[] { Static23.aClass4_260, local9 });
	}

	@OriginalMember(owner = "client!od", name = "a", descriptor = "(Lclient!gb;B)[Ljava/lang/Object;")
	public static Object[] method1210(@OriginalArg(0) Class3_Sub4 arg0) {
		@Pc(9) int local9 = arg0.method446();
		if (local9 == 0) {
			return null;
		}
		@Pc(24) Object[] local24 = new Object[local9];
		for (@Pc(26) int local26 = 0; local26 < local9; local26++) {
			@Pc(32) int local32 = arg0.method446();
			if (local32 == 0) {
				local24[local26] = Integer.valueOf(arg0.method438());
			} else if (local32 == 1) {
				local24[local26] = arg0.method417();
			}
		}
		return local24;
	}

	@OriginalMember(owner = "client!od", name = "a", descriptor = "(IBI)I")
	public static int method1212(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		if (arg1 == -2) {
			return 12345678;
		} else if (arg1 == -1) {
			if (arg0 < 0) {
				arg0 = 0;
			} else if (arg0 > 127) {
				arg0 = 127;
			}
			return 127 - arg0;
		} else {
			arg0 = arg0 * (arg1 & 0x7F) / 128;
			if (arg0 < 2) {
				arg0 = 2;
			} else if (arg0 > 126) {
				arg0 = 126;
			}
			return (arg1 & 0xFF80) + arg0;
		}
	}

	@OriginalMember(owner = "client!od", name = "f", descriptor = "(I)V")
	public static void method1213() {
		aClass4_988 = null;
		aClass4_989 = null;
		aClass4_995 = null;
		aClass4_1000 = null;
		aClass4_998 = null;
		aClass4_994 = null;
		aClass4_996 = null;
		aClass4_991 = null;
		aClass4_1001 = null;
		aClass4_997 = null;
		aClass4_999 = null;
		aClass4_990 = null;
		aClass4_992 = null;
		aClass4_993 = null;
		aClass3_Sub1_Sub4_Sub3_26 = null;
		anIntArray238 = null;
	}

	@OriginalMember(owner = "client!od", name = "e", descriptor = "(B)V")
	public static void method1214() {
		for (@Pc(18) Class3_Sub12 local18 = (Class3_Sub12) Static67.aClass20_8.method308(); local18 != null; local18 = (Class3_Sub12) Static67.aClass20_8.method309()) {
			if (local18.anInt2766 == -1) {
				local18.anInt2778 = 0;
				Static103.method1695(local18);
			} else {
				local18.method1930();
			}
		}
	}

	@OriginalMember(owner = "client!od", name = "a", descriptor = "(Ljava/lang/String;I)Lclient!ad;")
	public static Class4 method1216(@OriginalArg(0) String arg0) {
		@Pc(6) byte[] local6 = arg0.getBytes();
		@Pc(9) int local9 = local6.length;
		@Pc(13) Class4 local13 = new Class4();
		local13.aByteArray1 = new byte[local9];
		@Pc(19) int local19 = 0;
		while (local19 < local9) {
			@Pc(35) int local35 = local6[local19++] & 0xFF;
			if (local35 <= 45 && local35 >= 40) {
				if (local19 >= local9) {
					break;
				}
				@Pc(71) int local71 = local6[local19++] & 0xFF;
				local13.aByteArray1[local13.anInt238++] = (byte) (local35 * 43 + local71 - 1720 - 48);
			} else if (local35 != 0) {
				local13.aByteArray1[local13.anInt238++] = (byte) local35;
			}
		}
		local13.method133();
		return local13.method122();
	}

	@OriginalMember(owner = "client!od", name = "a", descriptor = "(ZZ)V")
	public static void method1217(@OriginalArg(0) boolean arg0) {
		Static42.anInt1133++;
		if (Static42.anInt1133 < 50 && !arg0) {
			return;
		}
		Static42.anInt1133 = 0;
		if (Static11.aBoolean251 || Static53.aClass31_6 == null) {
			return;
		}
		Static5.aClass3_Sub4_Sub1_1.method464(102);
		try {
			Static53.aClass31_6.method716(Static5.aClass3_Sub4_Sub1_1.anInt627, Static5.aClass3_Sub4_Sub1_1.aByteArray4);
			Static5.aClass3_Sub4_Sub1_1.anInt627 = 0;
		} catch (@Pc(47) IOException local47) {
			Static11.aBoolean251 = true;
		}
	}

	@OriginalMember(owner = "client!od", name = "h", descriptor = "(I)V")
	public static void method1219() {
		@Pc(16) int local16;
		for (@Pc(9) int local9 = 10; local9 < 117; local9++) {
			local16 = (int) (Math.random() * 100.0D);
			if (local16 < 50) {
				Static51.anIntArray174[local9 + 32512] = 255;
			}
		}
		@Pc(44) int local44;
		@Pc(51) int local51;
		@Pc(57) int local57;
		for (local16 = 0; local16 < 100; local16++) {
			local44 = (int) (Math.random() * 124.0D) + 2;
			local51 = (int) (Math.random() * 128.0D) + 128;
			local57 = (local51 << 7) + local44;
			Static51.anIntArray174[local57] = 192;
		}
		for (local44 = 1; local44 < 255; local44++) {
			for (local51 = 1; local51 < 127; local51++) {
				local57 = local51 + (local44 << 7);
				Static21.anIntArray36[local57] = (Static51.anIntArray174[local57 + 1] + Static51.anIntArray174[local57 - 1] + Static51.anIntArray174[local57 + -128] + Static51.anIntArray174[local57 + 128]) / 4;
			}
		}
		Static1.anInt3 += 128;
		if (Static85.anIntArray260.length < Static1.anInt3) {
			local51 = (int) (Math.random() * 12.0D);
			Static1.anInt3 -= Static85.anIntArray260.length;
			Static93.method1617(Static27.aClass3_Sub1_Sub4_Sub3Array2[local51]);
		}
		@Pc(189) int local189;
		for (local51 = 1; local51 < 255; local51++) {
			for (local57 = 1; local57 < 127; local57++) {
				@Pc(168) int local168 = (local51 << 7) + local57;
				local189 = Static21.anIntArray36[local168 + 128] - Static85.anIntArray260[local168 + Static1.anInt3 & Static85.anIntArray260.length + -1] / 5;
				if (local189 < 0) {
					local189 = 0;
				}
				Static51.anIntArray174[local168] = local189;
			}
		}
		for (local57 = 0; local57 < 255; local57++) {
			Static54.anIntArray179[local57] = Static54.anIntArray179[local57 + 1];
		}
		Static54.anIntArray179[255] = (int) (Math.sin((double) Static60.anInt1489 / 14.0D) * 16.0D + Math.sin((double) Static60.anInt1489 / 15.0D) * 14.0D + Math.sin((double) Static60.anInt1489 / 16.0D) * 12.0D);
		if (Static81.anInt1899 > 0) {
			Static81.anInt1899 -= 4;
		}
		if (Static104.anInt2547 > 0) {
			Static104.anInt2547 -= 4;
		}
		if (Static81.anInt1899 != 0 || Static104.anInt2547 != 0) {
			return;
		}
		local189 = (int) (Math.random() * 2000.0D);
		if (local189 == 0) {
			Static81.anInt1899 = 1024;
		}
		if (local189 == 1) {
			Static104.anInt2547 = 1024;
			return;
		}
	}
}
