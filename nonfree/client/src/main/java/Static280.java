import java.awt.Component;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static280 {

	@OriginalMember(owner = "client!ua", name = "P", descriptor = "Z")
	public static boolean aBoolean382 = false;

	@OriginalMember(owner = "client!ua", name = "R", descriptor = "S")
	public static short aShort48 = 32767;

	@OriginalMember(owner = "client!ua", name = "T", descriptor = "[Z")
	public static boolean[] aBooleanArray58 = new boolean[8];

	@OriginalMember(owner = "client!ua", name = "U", descriptor = "I")
	public static int anInt5336 = -1;

	@OriginalMember(owner = "client!ua", name = "W", descriptor = "Z")
	public static boolean aBoolean383 = true;

	@OriginalMember(owner = "client!ua", name = "Z", descriptor = "[Lclient!sb;")
	public static Class1_Sub14[] aClass1_Sub14Array1 = new Class1_Sub14[2048];

	@OriginalMember(owner = "client!ua", name = "c", descriptor = "(III)V")
	public static void method4152(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		Static20.anInt396 = Static20.aClass135ArrayArray1[arg1][arg0].anInt4080;
		Static59.anInt1171 = Static20.aClass135ArrayArray1[arg1][arg0].anInt4074;
		Static73.anInt1415 = Static20.aClass135ArrayArray1[arg1][arg0].anInt4069;
		Static96.method1392((float) Static20.anInt396, (float) Static59.anInt1171, (float) Static73.anInt1415);
	}

	@OriginalMember(owner = "client!ua", name = "g", descriptor = "(I)V")
	public static void method4153() {
		for (@Pc(7) int local7 = 0; local7 < Static105.anInt2015; local7++) {
			@Pc(18) int local18 = Static7.anIntArray12[local7];
			@Pc(22) Class22_Sub3_Sub1 local22 = Static265.aClass22_Sub3_Sub1Array1[local18];
			if (local22 != null) {
				Static236.method3732(local22, local22.aClass112_1.anInt3495);
			}
		}
	}

	@OriginalMember(owner = "client!ua", name = "a", descriptor = "(IIIIII)V")
	public static void method4154(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		@Pc(11) int local11 = Static310.method1126(Static59.anInt1155, Static240.anInt1319, arg1);
		@Pc(21) int local21 = Static310.method1126(Static59.anInt1155, Static240.anInt1319, arg3);
		@Pc(27) int local27 = Static310.method1126(Static214.anInt4216, Static312.anInt5850, arg4);
		@Pc(33) int local33 = Static310.method1126(Static214.anInt4216, Static312.anInt5850, arg2);
		for (@Pc(35) int local35 = local11; local35 <= local21; local35++) {
			Static109.method1795(local27, Static51.anIntArrayArray1[local35], local33, arg0);
		}
	}

	@OriginalMember(owner = "client!ua", name = "a", descriptor = "(ZBLjava/lang/String;)V")
	public static void method4155(@OriginalArg(0) boolean arg0, @OriginalArg(2) String arg1) {
		@Pc(4) String local4 = arg1.toLowerCase();
		@Pc(10) int local10 = 0;
		@Pc(13) short[] local13 = new short[16];
		@Pc(24) int local24 = arg0 ? 32768 : 0;
		@Pc(32) int local32 = (arg0 ? Static295.anInt5588 : Static236.anInt4779) + local24;
		for (@Pc(34) int local34 = local24; local34 < local32; local34++) {
			@Pc(47) Class1_Sub1_Sub20 local47 = Static57.method981(local34);
			if (local47.aBoolean349 && local47.method3800().toLowerCase().indexOf(local4) != -1) {
				if (local10 >= 50) {
					Static151.anInt3099 = -1;
					Static93.aShortArray17 = null;
					return;
				}
				if (local13.length <= local10) {
					@Pc(78) short[] local78 = new short[local13.length * 2];
					for (@Pc(80) int local80 = 0; local80 < local10; local80++) {
						local78[local80] = local13[local80];
					}
					local13 = local78;
				}
				local13[local10++] = (short) local34;
			}
		}
		Static8.anInt142 = 0;
		Static93.aShortArray17 = local13;
		Static151.anInt3099 = local10;
		@Pc(116) String[] local116 = new String[Static151.anInt3099];
		for (@Pc(118) int local118 = 0; local118 < Static151.anInt3099; local118++) {
			local116[local118] = Static57.method981(local13[local118]).method3800();
		}
		Static76.method1203(Static93.aShortArray17, local116);
	}

	@OriginalMember(owner = "client!ua", name = "a", descriptor = "(ZB)V")
	public static void method4157(@OriginalArg(0) boolean arg0) {
		@Pc(17) byte local17;
		@Pc(15) byte[][] local15;
		if (Static291.aBoolean404 && arg0) {
			local15 = Static70.aByteArrayArray3;
			local17 = 1;
		} else {
			local15 = Static90.aByteArrayArray13;
			local17 = 4;
		}
		for (@Pc(25) int local25 = 0; local25 < local17; local25++) {
			Static82.method1238();
			for (@Pc(38) int local38 = 0; local38 < 13; local38++) {
				for (@Pc(45) int local45 = 0; local45 < 13; local45++) {
					@Pc(58) int local58 = Static268.anIntArrayArrayArray19[local25][local38][local45];
					if (local58 != -1) {
						@Pc(70) int local70 = local58 >> 24 & 0x3;
						if (!arg0 || local70 == 0) {
							@Pc(84) int local84 = local58 >> 1 & 0x3;
							@Pc(90) int local90 = local58 >> 3 & 0x7FF;
							@Pc(96) int local96 = local58 >> 14 & 0x3FF;
							@Pc(106) int local106 = (local96 / 8 << 8) + local90 / 8;
							for (@Pc(108) int local108 = 0; local108 < Static278.anIntArray487.length; local108++) {
								if (local106 == Static278.anIntArray487[local108] && local15[local108] != null) {
									Static264.method3949(local84, arg0, local38 * 8, local70, (local96 & 0x7) * 8, (local90 & 0x7) * 8, local15[local108], local45 * 8, local25, Static56.aClass122Array1);
									break;
								}
							}
						}
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!ua", name = "a", descriptor = "(ILclient!nf;IILjava/awt/Component;)Lclient!tl;")
	public static Class101 method4158(@OriginalArg(0) int arg0, @OriginalArg(1) Class117 arg1, @OriginalArg(3) int arg2, @OriginalArg(4) Component arg3) {
		if (Static152.anInt3130 == 0) {
			throw new IllegalStateException();
		}
		try {
			@Pc(32) Class101 local32 = (Class101) Class.forName("Class101_Sub1").getDeclaredConstructor().newInstance();
			local32.anInt3484 = arg0;
			local32.anIntArray278 = new int[(Static64.aBoolean221 ? 2 : 1) * 256];
			local32.method2796(arg3);
			local32.anInt3488 = (arg0 & -1024) + 1024;
			if (local32.anInt3488 > 16384) {
				local32.anInt3488 = 16384;
			}
			local32.method2804(local32.anInt3488);
			if (Static61.anInt1209 > 0 && Static33.aClass51_1 == null) {
				Static33.aClass51_1 = new Class51();
				Static33.aClass51_1.aClass117_2 = arg1;
				arg1.method3000(Static61.anInt1209, Static33.aClass51_1);
			}
			if (Static33.aClass51_1 != null) {
				if (Static33.aClass51_1.aClass101Array1[arg2] != null) {
					throw new IllegalArgumentException();
				}
				Static33.aClass51_1.aClass101Array1[arg2] = local32;
			}
			return local32;
		} catch (@Pc(108) Throwable local108) {
			try {
				@Pc(114) Class101_Sub2 local114 = new Class101_Sub2(arg1, arg2);
				local114.anIntArray278 = new int[(Static64.aBoolean221 ? 2 : 1) * 256];
				local114.anInt3484 = arg0;
				local114.method2796(arg3);
				local114.anInt3488 = 16384;
				local114.method2804(local114.anInt3488);
				if (Static61.anInt1209 > 0 && Static33.aClass51_1 == null) {
					Static33.aClass51_1 = new Class51();
					Static33.aClass51_1.aClass117_2 = arg1;
					arg1.method3000(Static61.anInt1209, Static33.aClass51_1);
				}
				if (Static33.aClass51_1 != null) {
					if (Static33.aClass51_1.aClass101Array1[arg2] != null) {
						throw new IllegalArgumentException();
					}
					Static33.aClass51_1.aClass101Array1[arg2] = local114;
				}
				return local114;
			} catch (@Pc(185) Throwable local185) {
				return new Class101();
			}
		}
	}
}
