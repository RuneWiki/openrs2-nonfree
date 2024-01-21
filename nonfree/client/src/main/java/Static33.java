import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static33 {

	@OriginalMember(owner = "client!f", name = "ib", descriptor = "Lclient!bc;")
	public static Class6 aClass6_8;

	@OriginalMember(owner = "client!f", name = "wb", descriptor = "J")
	public static long aLong23;

	@OriginalMember(owner = "client!f", name = "Cb", descriptor = "Lclient!ud;")
	public static Class74 aClass74_2;

	@OriginalMember(owner = "client!f", name = "Fb", descriptor = "Lclient!q;")
	public static Class62 aClass62_8;

	@OriginalMember(owner = "client!f", name = "Hb", descriptor = "[[I")
	public static int[][] anIntArrayArray7;

	@OriginalMember(owner = "client!f", name = "R", descriptor = "Lclient!jb;")
	public static Class33 aClass33_12 = new Class33(30);

	@OriginalMember(owner = "client!f", name = "W", descriptor = "[I")
	public static int[] anIntArray150 = new int[1000];

	@OriginalMember(owner = "client!f", name = "ab", descriptor = "Lclient!kd;")
	private static Class39 aClass39_484 = Static108.method1915("Enter name of player to delete from list");

	@OriginalMember(owner = "client!f", name = "ub", descriptor = "Lclient!kd;")
	public static Class39 aClass39_485 = Static108.method1915("overlay_multiway");

	@OriginalMember(owner = "client!f", name = "zb", descriptor = "Lclient!kd;")
	public static Class39 aClass39_486 = aClass39_484;

	@OriginalMember(owner = "client!f", name = "Bb", descriptor = "Lclient!kd;")
	public static Class39 aClass39_487 = Static108.method1915(" (X");

	@OriginalMember(owner = "client!f", name = "Db", descriptor = "Lclient!kd;")
	private static Class39 aClass39_488 = Static108.method1915("Create a free account");

	@OriginalMember(owner = "client!f", name = "Eb", descriptor = "Lclient!kd;")
	public static Class39 aClass39_489 = aClass39_488;

	@OriginalMember(owner = "client!f", name = "Gb", descriptor = "I")
	public static int anInt1053 = 0;

	@OriginalMember(owner = "client!f", name = "a", descriptor = "(IIZ)V")
	public static void method630(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(11) Class31 local11 = Static100.aClass31ArrayArrayArray1[Static9.anInt2983][arg0][arg1];
		if (local11 == null) {
			Static32.aClass5_2.method114(Static9.anInt2983, arg0, arg1);
			return;
		}
		@Pc(24) Class1_Sub1_Sub2_Sub3 local24 = (Class1_Sub1_Sub2_Sub3) local11.method1000();
		@Pc(26) int local26 = -99999999;
		@Pc(33) Class1_Sub1_Sub2_Sub3 local33 = null;
		while (local24 != null) {
			@Pc(39) Class1_Sub1_Sub17 local39 = Static8.method224(local24.anInt806);
			@Pc(42) int local42 = local39.anInt2742;
			if (local39.anInt2755 == 1) {
				local42 *= local24.anInt802 + 1;
			}
			if (local42 > local26) {
				local26 = local42;
				local33 = local24;
			}
			local24 = (Class1_Sub1_Sub2_Sub3) local11.method1003();
		}
		if (local33 == null) {
			Static32.aClass5_2.method114(Static9.anInt2983, arg0, arg1);
			return;
		}
		local11.method996(local33);
		local24 = (Class1_Sub1_Sub2_Sub3) local11.method1000();
		@Pc(86) Class1_Sub1_Sub2_Sub3 local86 = null;
		@Pc(88) Class1_Sub1_Sub2_Sub3 local88 = null;
		@Pc(96) int local96 = arg0 + (arg1 << 7) + 1610612736;
		while (local24 != null) {
			if (local33.anInt806 != local24.anInt806) {
				if (local86 == null) {
					local86 = local24;
				}
				if (local86.anInt806 != local24.anInt806 && local88 == null) {
					local88 = local24;
				}
			}
			local24 = (Class1_Sub1_Sub2_Sub3) local11.method1003();
		}
		Static32.aClass5_2.method112(Static9.anInt2983, arg0, arg1, Static62.method2035(Static9.anInt2983, arg0 * 128 + 64, arg1 * 128 - -64), local33, local96, local86, local88);
	}

	@OriginalMember(owner = "client!f", name = "c", descriptor = "(I)V")
	public static void method631() {
		aClass6_8 = null;
		aClass39_487 = null;
		aClass39_486 = null;
		aClass39_485 = null;
		aClass39_489 = null;
		aClass74_2 = null;
		anIntArray150 = null;
		aClass33_12 = null;
		aClass39_488 = null;
		anIntArrayArray7 = null;
		aClass62_8 = null;
		aClass39_484 = null;
	}

	@OriginalMember(owner = "client!f", name = "a", descriptor = "(ZLclient!de;)V")
	public static void method633(@OriginalArg(1) Class1_Sub1_Sub4_Sub1 arg0) {
		for (@Pc(7) int local7 = 0; local7 < Static101.anIntArray392.length; local7++) {
			Static101.anIntArray392[local7] = 0;
		}
		@Pc(32) int local32;
		for (@Pc(22) int local22 = 0; local22 < 5000; local22++) {
			local32 = (int) (Math.random() * 128.0D * (double) 256);
			Static101.anIntArray392[local32] = (int) (Math.random() * 256.0D);
		}
		@Pc(56) int local56;
		@Pc(60) int local60;
		@Pc(68) int local68;
		for (local32 = 0; local32 < 20; local32++) {
			for (local56 = 1; local56 < 255; local56++) {
				for (local60 = 1; local60 < 127; local60++) {
					local68 = local60 + (local56 << 7);
					Static62.anIntArray461[local68] = (Static101.anIntArray392[local68 - 128] + Static101.anIntArray392[local68 - 1] + Static101.anIntArray392[local68 + 1] + Static101.anIntArray392[local68 - -128]) / 4;
				}
			}
			@Pc(114) int[] local114 = Static101.anIntArray392;
			Static101.anIntArray392 = Static62.anIntArray461;
			Static62.anIntArray461 = local114;
		}
		if (arg0 == null) {
			return;
		}
		local56 = 0;
		for (local60 = 0; local60 < arg0.anInt870; local60++) {
			for (local68 = 0; local68 < arg0.anInt869; local68++) {
				if (arg0.aByteArray24[local56++] != 0) {
					@Pc(147) int local147 = arg0.anInt871 + local68 + 16;
					@Pc(154) int local154 = local60 + arg0.anInt872 + 16;
					@Pc(160) int local160 = (local154 << 7) + local147;
					Static101.anIntArray392[local160] = 0;
				}
			}
		}
	}

	@OriginalMember(owner = "client!f", name = "a", descriptor = "(Lclient!a;I)Z")
	public static boolean method636(@OriginalArg(0) Class1_Sub1_Sub1 arg0) {
		@Pc(4) int local4 = arg0.anInt93;
		if (local4 >= 1 && local4 <= 200 || !(local4 < 701 || local4 > 900)) {
			if (local4 >= 801) {
				local4 -= 701;
			} else if (local4 >= 701) {
				local4 -= 601;
			} else if (local4 < 101) {
				local4--;
			} else {
				local4 -= 101;
			}
			Static71.method1242(Static30.method601(new Class39[] { Static20.aClass39_352, Static117.aClass39Array29[local4] }), 21, Static14.aClass39_290, 0, 0, 0);
			Static71.method1242(Static30.method601(new Class39[] { Static20.aClass39_352, Static117.aClass39Array29[local4] }), 29, Static43.aClass39_586, 0, 0, 0);
			return true;
		} else if (local4 >= 401 && local4 <= 500) {
			Static71.method1242(Static30.method601(new Class39[] { Static20.aClass39_352, arg0.aClass39_30 }), 25, Static14.aClass39_290, 0, 0, 0);
			return true;
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!f", name = "a", descriptor = "(BI)Z")
	public static boolean method637(@OriginalArg(1) int arg0) {
		return (arg0 & 0x1) != 0;
	}
}
