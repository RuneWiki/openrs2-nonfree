import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static73 {

	@OriginalMember(owner = "client!lf", name = "b", descriptor = "Lclient!de;")
	public static Class1_Sub1_Sub4_Sub1 aClass1_Sub1_Sub4_Sub1_36;

	@OriginalMember(owner = "client!lf", name = "k", descriptor = "Lclient!gd;")
	public static Class1_Sub1_Sub4_Sub3 aClass1_Sub1_Sub4_Sub3_2;

	@OriginalMember(owner = "client!lf", name = "r", descriptor = "Lclient!q;")
	public static Class62 aClass62_22;

	@OriginalMember(owner = "client!lf", name = "t", descriptor = "[Lclient!pb;")
	public static Class1_Sub1_Sub4_Sub4[] aClass1_Sub1_Sub4_Sub4Array8;

	@OriginalMember(owner = "client!lf", name = "c", descriptor = "I")
	public static int anInt1817 = 1;

	@OriginalMember(owner = "client!lf", name = "d", descriptor = "Lclient!kd;")
	public static Class39 aClass39_893 = Static108.method1915("RuneScape wird geladen )2 bitte warten)3)3)3");

	@OriginalMember(owner = "client!lf", name = "e", descriptor = "Lclient!kd;")
	public static Class39 aClass39_894 = Static108.method1915("Einloggen");

	@OriginalMember(owner = "client!lf", name = "g", descriptor = "Lclient!kd;")
	public static Class39 aClass39_895 = Static108.method1915("<col=40ff00>");

	@OriginalMember(owner = "client!lf", name = "l", descriptor = "Lclient!kd;")
	private static Class39 aClass39_896 = Static108.method1915("Invalid loginserver requested)3");

	@OriginalMember(owner = "client!lf", name = "m", descriptor = "Lclient!kd;")
	public static Class39 aClass39_897 = aClass39_896;

	@OriginalMember(owner = "client!lf", name = "o", descriptor = "Lclient!kd;")
	private static Class39 aClass39_899 = Static108.method1915("Checking for updates )2 ");

	@OriginalMember(owner = "client!lf", name = "n", descriptor = "Lclient!kd;")
	public static Class39 aClass39_898 = aClass39_899;

	@OriginalMember(owner = "client!lf", name = "p", descriptor = "Lclient!kd;")
	public static Class39 aClass39_900 = Static108.method1915(":duelreq:");

	@OriginalMember(owner = "client!lf", name = "a", descriptor = "(B)V")
	public static void method1252() {
		aClass39_897 = null;
		aClass1_Sub1_Sub4_Sub3_2 = null;
		aClass39_900 = null;
		aClass1_Sub1_Sub4_Sub4Array8 = null;
		aClass39_898 = null;
		aClass39_895 = null;
		aClass1_Sub1_Sub4_Sub1_36 = null;
		aClass62_22 = null;
		aClass39_894 = null;
		aClass39_896 = null;
		aClass39_899 = null;
		aClass39_893 = null;
	}

	@OriginalMember(owner = "client!lf", name = "a", descriptor = "(IIB)V")
	public static void method1253(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(15) long local15 = (long) ((arg0 << 16) + arg1);
		@Pc(21) Class1_Sub1_Sub15 local21 = (Class1_Sub1_Sub15) Static98.aClass70_9.method1961(local15);
		if (local21 != null) {
			Static71.aClass42_2.method1197(local21);
		}
	}

	@OriginalMember(owner = "client!lf", name = "a", descriptor = "(IIII)I")
	public static int method1254(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		@Pc(9) int local9 = arg0 & arg1 - 1;
		@Pc(13) int local13 = arg0 / arg1;
		@Pc(17) int local17 = arg2 / arg1;
		@Pc(23) int local23 = arg1 - 1 & arg2;
		@Pc(37) int local37 = Static82.method1394(local17, local13);
		@Pc(44) int local44 = Static82.method1394(local17, local13 + 1);
		@Pc(51) int local51 = Static82.method1394(local17 + 1, local13);
		@Pc(60) int local60 = Static82.method1394(local17 + 1, local13 - -1);
		@Pc(67) int local67 = Static38.method692(local9, arg1, local37, local44);
		@Pc(74) int local74 = Static38.method692(local9, arg1, local51, local60);
		return Static38.method692(local23, arg1, local67, local74);
	}

	@OriginalMember(owner = "client!lf", name = "a", descriptor = "(ILclient!f;BII)V")
	public static void method1255(@OriginalArg(0) int arg0, @OriginalArg(1) Class1_Sub1_Sub7 arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		if (Static56.anInt1518 >= 50 || Static86.anInt2059 == 0 || (arg1.anIntArray152 == null || arg3 >= arg1.anIntArray152.length)) {
			return;
		}
		@Pc(29) int local29 = arg1.anIntArray152[arg3];
		if (local29 == 0) {
			return;
		}
		@Pc(43) int local43 = local29 >> 8;
		@Pc(49) int local49 = (arg0 - 64) / 128;
		@Pc(55) int local55 = local29 >> 4 & 0x7;
		Static18.anIntArray103[Static56.anInt1518] = local43;
		@Pc(65) int local65 = (arg2 - 64) / 128;
		@Pc(69) int local69 = local29 & 0xF;
		Static127.anIntArray481[Static56.anInt1518] = local55;
		Static35.anIntArray155[Static56.anInt1518] = 0;
		Static2.aClass51Array1[Static56.anInt1518] = null;
		Static38.anIntArray166[Static56.anInt1518] = (local49 << 16) + (local65 << 8) + local69;
		Static56.anInt1518++;
	}

	@OriginalMember(owner = "client!lf", name = "a", descriptor = "(ZIZ)I")
	public static int method1256() {
		return Static122.anInt2977 + Static52.anInt1452;
	}

	@OriginalMember(owner = "client!lf", name = "a", descriptor = "([BIII)Z")
	public static boolean method1257(@OriginalArg(0) byte[] arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		@Pc(11) boolean local11 = true;
		@Pc(20) Class1_Sub18 local20 = new Class1_Sub18(arg0);
		@Pc(22) int local22 = -1;
		label54: while (true) {
			@Pc(26) int local26 = local20.method2175();
			if (local26 == 0) {
				return local11;
			}
			local22 += local26;
			@Pc(34) int local34 = 0;
			@Pc(36) boolean local36 = false;
			while (true) {
				@Pc(42) int local42;
				while (!local36) {
					local42 = local20.method2175();
					if (local42 == 0) {
						continue label54;
					}
					local34 += local42 - 1;
					@Pc(66) int local66 = local34 & 0x3F;
					@Pc(72) int local72 = local34 >> 6 & 0x3F;
					@Pc(78) int local78 = local20.method2169() >> 2;
					@Pc(82) int local82 = local72 + arg2;
					@Pc(86) int local86 = arg1 + local66;
					if (local82 > 0 && local86 > 0 && local82 < 103 && local86 < 103) {
						@Pc(105) Class1_Sub1_Sub18 local105 = Static104.method1862(local22);
						if (local78 != 22 || !Static68.aBoolean149 || local105.anInt3060 != 0 || local105.anInt3033 == 1 || local105.aBoolean251) {
							local36 = true;
							if (!local105.method2123()) {
								Static72.anInt1811++;
								local11 = false;
							}
						}
					}
				}
				local42 = local20.method2175();
				if (local42 == 0) {
					break;
				}
				local20.method2169();
			}
		}
	}

	@OriginalMember(owner = "client!lf", name = "b", descriptor = "(B)V")
	public static void method1258() {
		for (@Pc(3) int local3 = 0; local3 < Static20.anInt731; local3++) {
			@Pc(9) int local9 = Static51.anIntArray192[local3];
			@Pc(13) Class1_Sub1_Sub2_Sub1_Sub1 local13 = Static114.aClass1_Sub1_Sub2_Sub1_Sub1Array1[local9];
			if (local13 != null) {
				Static2.method62(local13, local13.aClass1_Sub1_Sub5_1.anInt910);
			}
		}
	}
}
