import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static146 {

	@OriginalMember(owner = "client!rg", name = "f", descriptor = "Lclient!ah;")
	public static Class5 aClass5_2;

	@OriginalMember(owner = "client!rg", name = "k", descriptor = "Lclient!kf;")
	public static Class2_Sub2_Sub2_Sub3 aClass2_Sub2_Sub2_Sub3_7;

	@OriginalMember(owner = "client!rg", name = "l", descriptor = "I")
	public static int anInt3098;

	@OriginalMember(owner = "client!rg", name = "t", descriptor = "[S")
	public static short[] aShortArray32;

	@OriginalMember(owner = "client!rg", name = "b", descriptor = "[Lclient!oe;")
	public static Class2_Sub2_Sub3_Sub6[] aClass2_Sub2_Sub3_Sub6Array1 = new Class2_Sub2_Sub3_Sub6[4];

	@OriginalMember(owner = "client!rg", name = "e", descriptor = "I")
	public static int anInt3093 = 0;

	@OriginalMember(owner = "client!rg", name = "D", descriptor = "[I")
	public static int[] anIntArray284 = new int[50];

	@OriginalMember(owner = "client!rg", name = "a", descriptor = "(IIZI)Lclient!lf;")
	public static Class49 method2398(@OriginalArg(2) boolean arg0, @OriginalArg(3) int arg1) {
		@Pc(28) int local28 = 1;
		@Pc(37) int local37 = arg1 / 10;
		while (local37 != 0) {
			local37 /= 10;
			local28++;
		}
		@Pc(48) int local48 = local28;
		if (arg1 < 0 || arg0) {
			local48 = local28 + 1;
		}
		@Pc(59) byte[] local59 = new byte[local48];
		if (arg1 < 0) {
			local59[0] = 45;
		} else if (arg0) {
			local59[0] = 43;
		}
		for (@Pc(75) int local75 = 0; local75 < local28; local75++) {
			@Pc(81) int local81 = arg1 % 10;
			arg1 /= 10;
			if (local81 < 0) {
				local81 = -local81;
			}
			if (local81 > 9) {
				local81 += 39;
			}
			local59[local48 - local75 - 1] = (byte) (local81 + 48);
		}
		@Pc(119) Class49 local119 = new Class49();
		local119.anInt2058 = local48;
		local119.aByteArray28 = local59;
		return local119;
	}

	@OriginalMember(owner = "client!rg", name = "a", descriptor = "(ILclient!lf;IZI)V")
	public static void method2399(@OriginalArg(0) int arg0, @OriginalArg(1) Class49 arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3) {
		@Pc(4) Class85 local4 = Static114.method1938(arg2, arg0);
		if (local4 == null) {
			return;
		}
		if (local4.anObjectArray10 != null) {
			@Pc(18) Class2_Sub12 local18 = new Class2_Sub12();
			local18.aClass49_820 = arg1;
			local18.aClass85_4 = local4;
			local18.anObjectArray2 = local4.anObjectArray10;
			local18.anInt1564 = arg3;
			Static38.method766(local18);
		}
		@Pc(36) boolean local36 = true;
		if (local4.anInt3876 > 0) {
			local36 = Static100.method1733(local4);
		}
		if (!local36 || !Static132.method2214(Static111.method1895(local4), arg3 - 1)) {
			return;
		}
		if (arg3 == 1) {
			Static176.aClass2_Sub13_Sub1_14.method2976(181);
			Static176.aClass2_Sub13_Sub1_14.method2952(arg2);
			Static176.aClass2_Sub13_Sub1_14.method2921(arg0);
		}
		if (arg3 == 2) {
			Static176.aClass2_Sub13_Sub1_14.method2976(198);
			Static176.aClass2_Sub13_Sub1_14.method2952(arg2);
			Static176.aClass2_Sub13_Sub1_14.method2921(arg0);
		}
		if (arg3 == 3) {
			Static176.aClass2_Sub13_Sub1_14.method2976(158);
			Static176.aClass2_Sub13_Sub1_14.method2952(arg2);
			Static176.aClass2_Sub13_Sub1_14.method2921(arg0);
		}
		if (arg3 == 4) {
			Static176.aClass2_Sub13_Sub1_14.method2976(84);
			Static176.aClass2_Sub13_Sub1_14.method2952(arg2);
			Static176.aClass2_Sub13_Sub1_14.method2921(arg0);
		}
		if (arg3 == 5) {
			Static176.aClass2_Sub13_Sub1_14.method2976(203);
			Static176.aClass2_Sub13_Sub1_14.method2952(arg2);
			Static176.aClass2_Sub13_Sub1_14.method2921(arg0);
		}
		if (arg3 == 6) {
			Static176.aClass2_Sub13_Sub1_14.method2976(21);
			Static176.aClass2_Sub13_Sub1_14.method2952(arg2);
			Static176.aClass2_Sub13_Sub1_14.method2921(arg0);
		}
		if (arg3 == 7) {
			Static176.aClass2_Sub13_Sub1_14.method2976(234);
			Static176.aClass2_Sub13_Sub1_14.method2952(arg2);
			Static176.aClass2_Sub13_Sub1_14.method2921(arg0);
		}
		if (arg3 == 8) {
			Static176.aClass2_Sub13_Sub1_14.method2976(120);
			Static176.aClass2_Sub13_Sub1_14.method2952(arg2);
			Static176.aClass2_Sub13_Sub1_14.method2921(arg0);
		}
		if (arg3 == 9) {
			Static176.aClass2_Sub13_Sub1_14.method2976(128);
			Static176.aClass2_Sub13_Sub1_14.method2952(arg2);
			Static176.aClass2_Sub13_Sub1_14.method2921(arg0);
		}
		if (arg3 == 10) {
			Static176.aClass2_Sub13_Sub1_14.method2976(22);
			Static176.aClass2_Sub13_Sub1_14.method2952(arg2);
			Static176.aClass2_Sub13_Sub1_14.method2921(arg0);
		}
	}

	@OriginalMember(owner = "client!rg", name = "a", descriptor = "(B)V")
	public static void method2400() {
		aShortArray32 = null;
		aClass5_2 = null;
		anIntArray284 = null;
		aClass2_Sub2_Sub3_Sub6Array1 = null;
		aClass2_Sub2_Sub2_Sub3_7 = null;
	}

	@OriginalMember(owner = "client!rg", name = "a", descriptor = "(BLclient!bg;ZLclient!db;Lclient!bg;)V")
	public static void method2401(@OriginalArg(1) Class11 arg0, @OriginalArg(2) boolean arg1, @OriginalArg(3) Class2_Sub2_Sub2_Sub1_Sub1 arg2, @OriginalArg(4) Class11 arg3) {
		Static8.aClass11_88 = arg3;
		Static96.aBoolean85 = arg1;
		Static78.aClass11_66 = arg0;
		Static134.anInt2913 = Static78.aClass11_66.method2069(10);
		Static76.aClass2_Sub2_Sub2_Sub1_Sub1_3 = arg2;
	}

	@OriginalMember(owner = "client!rg", name = "a", descriptor = "(III)V")
	public static void method2402(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(13) int local13;
		if (arg1 != Static53.anInt1184) {
			Static43.anIntArray102 = new int[arg1];
			for (local13 = 0; local13 < arg1; local13++) {
				Static43.anIntArray102[local13] = (local13 << 12) / arg1;
			}
			Static27.anInt588 = arg1 - 1;
			Static53.anInt1184 = arg1;
		}
		if (arg0 == Static34.anInt889) {
			return;
		}
		Static50.anIntArray106 = new int[arg0];
		for (local13 = 0; local13 < arg0; local13++) {
			Static50.anIntArray106[local13] = (local13 << 12) / arg0;
		}
		Static34.anInt889 = arg0;
		Static134.anInt2915 = arg0 - 1;
	}
}
