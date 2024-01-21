import java.math.BigInteger;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static64 {

	@OriginalMember(owner = "client!mb", name = "wb", descriptor = "Z")
	public static boolean aBoolean88;

	@OriginalMember(owner = "client!mb", name = "Z", descriptor = "Lclient!db;")
	public static Class14 aClass14_5 = new Class14(4096);

	@OriginalMember(owner = "client!mb", name = "db", descriptor = "[[B")
	public static byte[][] aByteArrayArray6 = new byte[50][];

	@OriginalMember(owner = "client!mb", name = "lb", descriptor = "Lclient!fc;")
	public static Class21 aClass21_20 = new Class21(64);

	@OriginalMember(owner = "client!mb", name = "pb", descriptor = "I")
	public static int anInt1659 = 2;

	@OriginalMember(owner = "client!mb", name = "qb", descriptor = "Ljava/math/BigInteger;")
	public static BigInteger aBigInteger1 = new BigInteger("7162900525229798032761816791230527296329313291232324290237849263501208207972894053929065636522363163621000728841182238772712427862772219676577293600221789");

	@OriginalMember(owner = "client!mb", name = "rb", descriptor = "Lclient!hb;")
	private static Class27 aClass27_805 = Static87.method1648("Enter message to send to ");

	@OriginalMember(owner = "client!mb", name = "tb", descriptor = "I")
	public static int anInt1661 = -1;

	@OriginalMember(owner = "client!mb", name = "ub", descriptor = "Lclient!hb;")
	public static Class27 aClass27_806 = aClass27_805;

	@OriginalMember(owner = "client!mb", name = "vb", descriptor = "Lclient!hb;")
	public static Class27 aClass27_807 = Static87.method1648("Wir vermuten)1 dass jemand Ihr Passwort kennt)3");

	@OriginalMember(owner = "client!mb", name = "g", descriptor = "(I)V")
	public static void method1180() {
		Static26.aBoolean38 = true;
		Static70.aBoolean94 = true;
	}

	@OriginalMember(owner = "client!mb", name = "a", descriptor = "(IIII[B[Lclient!pb;IIII)V")
	public static void method1181(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) byte[] arg4, @OriginalArg(5) Class49[] arg5, @OriginalArg(6) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8) {
		for (@Pc(8) int local8 = 0; local8 < 8; local8++) {
			for (@Pc(12) int local12 = 0; local12 < 8; local12++) {
				if (arg6 + local8 > 0 && local8 + arg6 < 103 && arg8 + local12 > 0 && local12 + arg8 < 103) {
					arg5[arg0].anIntArrayArray56[local8 + arg6][arg8 + local12] &= 0xFEFFFFFF;
				}
			}
		}
		@Pc(81) Class3_Sub11 local81 = new Class3_Sub11(arg4);
		for (@Pc(83) int local83 = 0; local83 < 4; local83++) {
			for (@Pc(87) int local87 = 0; local87 < 64; local87++) {
				for (@Pc(91) int local91 = 0; local91 < 64; local91++) {
					if (local83 == arg1 && arg3 <= local87 && local87 < arg3 + 8 && arg7 <= local91 && local91 < arg7 + 8) {
						Static83.method1671(arg0, arg8 + Static61.method1137(local91 & 0x7, arg2, local87 & 0x7), 0, 0, arg2, Static46.method924(local91 & 0x7, arg2, local87 & 0x7) + arg6, local81);
					} else {
						Static83.method1671(0, -1, 0, 0, 0, -1, local81);
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!mb", name = "h", descriptor = "(I)V")
	public static void method1182() {
		while (true) {
			if (Static47.aClass3_Sub11_Sub1_1.method1482(Static11.anInt2733) >= 11) {
				@Pc(28) int local28 = Static47.aClass3_Sub11_Sub1_1.method1476(11);
				if (local28 != 2047) {
					@Pc(35) boolean local35 = false;
					if (Static71.aClass3_Sub3_Sub1_Sub4_Sub2Array1[local28] == null) {
						Static71.aClass3_Sub3_Sub1_Sub4_Sub2Array1[local28] = new Class3_Sub3_Sub1_Sub4_Sub2();
						if (Static90.aClass3_Sub11Array1[local28] != null) {
							Static71.aClass3_Sub3_Sub1_Sub4_Sub2Array1[local28].method1683(Static90.aClass3_Sub11Array1[local28]);
						}
						local35 = true;
					}
					Static99.anIntArray387[Static104.anInt2718++] = local28;
					@Pc(71) Class3_Sub3_Sub1_Sub4_Sub2 local71 = Static71.aClass3_Sub3_Sub1_Sub4_Sub2Array1[local28];
					local71.anInt2382 = Static2.anInt38;
					@Pc(81) int local81 = Static47.aClass3_Sub11_Sub1_1.method1476(1);
					if (local81 == 1) {
						Static82.anIntArray335[Static70.anInt1829++] = local28;
					}
					@Pc(99) int local99 = Static47.aClass3_Sub11_Sub1_1.method1476(5);
					if (local99 > 15) {
						local99 -= 32;
					}
					@Pc(110) int local110 = Static47.aClass3_Sub11_Sub1_1.method1476(5);
					if (local110 > 15) {
						local110 -= 32;
					}
					@Pc(125) int local125 = Static31.anIntArray150[Static47.aClass3_Sub11_Sub1_1.method1476(3)];
					if (local35) {
						local71.anInt2432 = local125;
					}
					@Pc(137) int local137 = Static47.aClass3_Sub11_Sub1_1.method1476(1);
					local71.method1677(local137 == 1, local99 + Static62.aClass3_Sub3_Sub1_Sub4_Sub2_1.anIntArray357[0], Static62.aClass3_Sub3_Sub1_Sub4_Sub2_1.anIntArray359[0] - -local110);
					continue;
				}
			}
			Static47.aClass3_Sub11_Sub1_1.method1480();
			return;
		}
	}

	@OriginalMember(owner = "client!mb", name = "a", descriptor = "(II)V")
	public static void method1184(@OriginalArg(1) int arg0) {
		if (!Static80.method1535(arg0)) {
			return;
		}
		@Pc(22) Class3_Sub3_Sub6[] local22 = Static96.aClass3_Sub3_Sub6ArrayArray5[arg0];
		for (@Pc(24) int local24 = 0; local24 < local22.length; local24++) {
			@Pc(30) Class3_Sub3_Sub6 local30 = local22[local24];
			if (local30 != null) {
				local30.anInt1598 = 0;
				local30.anInt1621 = 0;
			}
		}
	}

	@OriginalMember(owner = "client!mb", name = "a", descriptor = "(III)I")
	public static int method1185(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(48) int local48 = Static12.method246(4, arg1 + 91923, arg0 - -45365) + (Static12.method246(2, arg1 + 37821, arg0 + 10294) - 128 >> 1) + (Static12.method246(1, arg1, arg0) + -128 >> 2) - 128;
		local48 = (int) ((double) local48 * 0.3D) + 35;
		if (local48 < 10) {
			local48 = 10;
		} else if (local48 > 60) {
			local48 = 60;
		}
		return local48;
	}

	@OriginalMember(owner = "client!mb", name = "a", descriptor = "(BZLclient!td;Lclient!td;)V")
	public static void method1188(@OriginalArg(1) boolean arg0, @OriginalArg(2) Class54 arg1, @OriginalArg(3) Class54 arg2) {
		Static45.aClass54_8 = arg2;
		Static84.aBoolean106 = arg0;
		Static1.aClass54_1 = arg1;
		Static81.anInt2193 = Static1.aClass54_1.method1609(10);
	}

	@OriginalMember(owner = "client!mb", name = "a", descriptor = "(IILclient!td;I)Z")
	public static boolean method1189(@OriginalArg(1) int arg0, @OriginalArg(2) Class54 arg1, @OriginalArg(3) int arg2) {
		@Pc(17) byte[] local17 = arg1.method1615(arg0, arg2);
		if (local17 == null) {
			return false;
		} else {
			Static43.method899(local17);
			return true;
		}
	}

	@OriginalMember(owner = "client!mb", name = "k", descriptor = "(I)V")
	public static void method1192() {
		aClass14_5 = null;
		aClass27_807 = null;
		aByteArrayArray6 = null;
		aClass27_806 = null;
		aClass27_805 = null;
		aClass21_20 = null;
		aBigInteger1 = null;
	}
}
