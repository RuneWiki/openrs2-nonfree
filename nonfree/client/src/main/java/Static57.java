import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static57 {

	@OriginalMember(owner = "client!lc", name = "n", descriptor = "Lclient!he;")
	public static Class11 aClass11_39;

	@OriginalMember(owner = "client!lc", name = "p", descriptor = "Lclient!he;")
	public static Class11 aClass11_40;

	@OriginalMember(owner = "client!lc", name = "q", descriptor = "I")
	public static int anInt1512;

	@OriginalMember(owner = "client!lc", name = "E", descriptor = "Lclient!w;")
	public static Class15 aClass15_24;

	@OriginalMember(owner = "client!lc", name = "F", descriptor = "Lclient!w;")
	public static Class15 aClass15_25;

	@OriginalMember(owner = "client!lc", name = "H", descriptor = "Lclient!c;")
	public static Class7 aClass7_1;

	@OriginalMember(owner = "client!lc", name = "P", descriptor = "Lclient!be;")
	public static Class11_Sub1 aClass11_Sub1_10;

	@OriginalMember(owner = "client!lc", name = "d", descriptor = "[I")
	public static int[] anIntArray161 = new int[5];

	@OriginalMember(owner = "client!lc", name = "e", descriptor = "Lclient!qb;")
	public static Class51 aClass51_1 = new Class51();

	@OriginalMember(owner = "client!lc", name = "u", descriptor = "I")
	public static final int anInt1514 = 50;

	@OriginalMember(owner = "client!lc", name = "g", descriptor = "[I")
	public static int[] anIntArray162 = new int[anInt1514];

	@OriginalMember(owner = "client!lc", name = "i", descriptor = "[I")
	public static int[] anIntArray163 = new int[anInt1514];

	@OriginalMember(owner = "client!lc", name = "j", descriptor = "I")
	public static int anInt1509 = 0;

	@OriginalMember(owner = "client!lc", name = "k", descriptor = "[I")
	public static int[] anIntArray164 = new int[anInt1514];

	@OriginalMember(owner = "client!lc", name = "l", descriptor = "[Lclient!va;")
	public static Class61[] aClass61Array10 = new Class61[anInt1514];

	@OriginalMember(owner = "client!lc", name = "r", descriptor = "[I")
	public static int[] anIntArray165 = new int[anInt1514];

	@OriginalMember(owner = "client!lc", name = "s", descriptor = "Lclient!va;")
	public static Class61 aClass61_627 = Static88.method1421("Fps:");

	@OriginalMember(owner = "client!lc", name = "v", descriptor = "I")
	public static int anInt1515 = 0;

	@OriginalMember(owner = "client!lc", name = "w", descriptor = "[I")
	public static int[] anIntArray166 = new int[anInt1514];

	@OriginalMember(owner = "client!lc", name = "y", descriptor = "Lclient!va;")
	private static Class61 aClass61_628 = Static88.method1421("Please close the interface you have open before using (Wreport abuse(W");

	@OriginalMember(owner = "client!lc", name = "A", descriptor = "[J")
	public static long[] aLongArray4 = new long[100];

	@OriginalMember(owner = "client!lc", name = "B", descriptor = "I")
	public static int anInt1518 = -1;

	@OriginalMember(owner = "client!lc", name = "C", descriptor = "[I")
	public static int[] anIntArray167 = new int[anInt1514];

	@OriginalMember(owner = "client!lc", name = "D", descriptor = "I")
	public static int anInt1519 = 0;

	@OriginalMember(owner = "client!lc", name = "G", descriptor = "[I")
	public static int[] anIntArray168 = new int[anInt1514];

	@OriginalMember(owner = "client!lc", name = "I", descriptor = "Lclient!va;")
	public static Class61 aClass61_629 = aClass61_628;

	@OriginalMember(owner = "client!lc", name = "K", descriptor = "Lclient!va;")
	public static Class61 aClass61_630 = Static88.method1421("m");

	@OriginalMember(owner = "client!lc", name = "L", descriptor = "Lclient!va;")
	private static Class61 aClass61_631 = Static88.method1421("Close");

	@OriginalMember(owner = "client!lc", name = "M", descriptor = "Lclient!va;")
	private static Class61 aClass61_632 = Static88.method1421("glow1:");

	@OriginalMember(owner = "client!lc", name = "N", descriptor = "Lclient!va;")
	public static Class61 aClass61_633 = aClass61_631;

	@OriginalMember(owner = "client!lc", name = "O", descriptor = "Lclient!va;")
	public static Class61 aClass61_634 = aClass61_632;

	@OriginalMember(owner = "client!lc", name = "a", descriptor = "(B)V")
	public static void method829() {
		aClass61_632 = null;
		aClass11_40 = null;
		anIntArray163 = null;
		aClass61_631 = null;
		anIntArray164 = null;
		anIntArray162 = null;
		aClass61_634 = null;
		anIntArray168 = null;
		aClass61Array10 = null;
		aClass51_1 = null;
		aClass15_24 = null;
		aClass61_630 = null;
		anIntArray167 = null;
		aClass11_Sub1_10 = null;
		aLongArray4 = null;
		anIntArray165 = null;
		aClass61_629 = null;
		aClass7_1 = null;
		aClass61_627 = null;
		aClass61_628 = null;
		anIntArray161 = null;
		aClass11_39 = null;
		aClass61_633 = null;
		anIntArray166 = null;
		aClass15_25 = null;
	}

	@OriginalMember(owner = "client!lc", name = "a", descriptor = "(IIIII)I")
	public static int method830(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		@Pc(25) int local25 = 65536 - Class10_Sub1_Sub1_Sub3.anIntArray203[arg2 * 1024 / arg0] >> 1;
		return ((65536 - local25) * arg1 >> 16) + (arg3 * local25 >> 16);
	}

	@OriginalMember(owner = "client!lc", name = "a", descriptor = "(I[B)V")
	public static void method831(@OriginalArg(1) byte[] arg0) {
		@Pc(8) Class10_Sub10 local8 = new Class10_Sub10(arg0);
		local8.anInt1957 = arg0.length - 2;
		Static100.anInt2658 = local8.method1160();
		Static71.anIntArray207 = new int[Static100.anInt2658];
		Static88.anIntArray306 = new int[Static100.anInt2658];
		Static96.anIntArray321 = new int[Static100.anInt2658];
		Static47.aByteArrayArray8 = new byte[Static100.anInt2658][];
		Static54.anIntArray158 = new int[Static100.anInt2658];
		local8.anInt1957 = arg0.length - Static100.anInt2658 * 8 - 7;
		Static1.anInt4 = local8.method1160();
		Static22.anInt740 = local8.method1160();
		@Pc(60) int local60 = (local8.method1111() & 0xFF) + 1;
		for (@Pc(62) int local62 = 0; local62 < Static100.anInt2658; local62++) {
			Static96.anIntArray321[local62] = local8.method1160();
		}
		for (@Pc(81) int local81 = 0; local81 < Static100.anInt2658; local81++) {
			Static54.anIntArray158[local81] = local8.method1160();
		}
		for (@Pc(98) int local98 = 0; local98 < Static100.anInt2658; local98++) {
			Static88.anIntArray306[local98] = local8.method1160();
		}
		for (@Pc(111) int local111 = 0; local111 < Static100.anInt2658; local111++) {
			Static71.anIntArray207[local111] = local8.method1160();
		}
		local8.anInt1957 = arg0.length - Static100.anInt2658 * 8 - (local60 - 1) * 3 - 7;
		Static25.anIntArray80 = new int[local60];
		for (@Pc(154) int local154 = 1; local154 < local60; local154++) {
			Static25.anIntArray80[local154] = local8.method1138();
			if (Static25.anIntArray80[local154] == 0) {
				Static25.anIntArray80[local154] = 1;
			}
		}
		local8.anInt1957 = 0;
		for (@Pc(180) int local180 = 0; local180 < Static100.anInt2658; local180++) {
			@Pc(185) int local185 = Static88.anIntArray306[local180];
			@Pc(189) int local189 = Static71.anIntArray207[local180];
			@Pc(193) int local193 = local185 * local189;
			@Pc(196) byte[] local196 = new byte[local193];
			Static47.aByteArrayArray8[local180] = local196;
			@Pc(204) int local204 = local8.method1111();
			@Pc(211) int local211;
			if (local204 == 0) {
				for (local211 = 0; local211 < local193; local211++) {
					local196[local211] = local8.method1131();
				}
			} else if (local204 == 1) {
				for (local211 = 0; local211 < local185; local211++) {
					for (@Pc(233) int local233 = 0; local233 < local189; local233++) {
						local196[local185 * local233 + local211] = local8.method1131();
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!lc", name = "a", descriptor = "(Ljava/lang/Throwable;Ljava/lang/String;)Lclient!la;")
	public static RuntimeException_Sub1 method832(@OriginalArg(0) Throwable arg0, @OriginalArg(1) String arg1) {
		@Pc(9) RuntimeException_Sub1 local9;
		if (arg0 instanceof RuntimeException_Sub1) {
			local9 = (RuntimeException_Sub1) arg0;
			local9.aString1 = local9.aString1 + ' ' + arg1;
		} else {
			local9 = new RuntimeException_Sub1(arg0, arg1);
		}
		return local9;
	}

	@OriginalMember(owner = "client!lc", name = "a", descriptor = "(ILclient!he;IIB)[B")
	public static byte[] method833(@OriginalArg(0) int arg0, @OriginalArg(1) Class11 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(23) long local23 = (long) (arg2 << 16) + ((long) arg3 << 32) + (long) (arg2 * 37 + arg0 & 0xFFFF);
		if (Static98.aClass29_69 != null) {
			@Pc(31) Class10_Sub1_Sub12 local31 = (Class10_Sub1_Sub12) Static98.aClass29_69.method644(local23);
			if (local31 != null) {
				return local31.aByteArray7;
			}
		}
		@Pc(42) byte[] local42 = arg1.method203(arg2, arg0);
		if (local42 == null) {
			return null;
		} else {
			if (Static98.aClass29_69 != null) {
				Static98.aClass29_69.method649(new Class10_Sub1_Sub12(local42), local23);
			}
			return local42;
		}
	}

	@OriginalMember(owner = "client!lc", name = "a", descriptor = "(Lclient!m;I)V")
	public static void method834(@OriginalArg(0) Class10_Sub1_Sub1_Sub2 arg0) {
		for (@Pc(5) int local5 = 0; local5 < Static63.anIntArray58.length; local5++) {
			Static63.anIntArray58[local5] = 0;
		}
		@Pc(28) int local28;
		for (@Pc(19) int local19 = 0; local19 < 5000; local19++) {
			local28 = (int) (Math.random() * 128.0D * (double) 256);
			Static63.anIntArray58[local28] = (int) (Math.random() * 256.0D);
		}
		@Pc(47) int local47;
		@Pc(54) int local54;
		for (local28 = 0; local28 < 20; local28++) {
			for (@Pc(44) int local44 = 1; local44 < 255; local44++) {
				for (local47 = 1; local47 < 127; local47++) {
					local54 = local47 + (local44 << 7);
					Static50.anIntArray153[local54] = (Static63.anIntArray58[local54 + 128] + Static63.anIntArray58[local54 - 1] + Static63.anIntArray58[local54 + 1] + Static63.anIntArray58[local54 - 128]) / 4;
				}
			}
			@Pc(99) int[] local99 = Static63.anIntArray58;
			Static63.anIntArray58 = Static50.anIntArray153;
			Static50.anIntArray153 = local99;
		}
		if (arg0 == null) {
			return;
		}
		local47 = 0;
		for (local54 = 0; local54 < arg0.anInt1566; local54++) {
			for (@Pc(126) int local126 = 0; local126 < arg0.anInt1570; local126++) {
				if (arg0.aByteArray5[local47++] != 0) {
					@Pc(140) int local140 = arg0.anInt1569 + local126 + 16;
					@Pc(148) int local148 = local54 + arg0.anInt1567 + 16;
					@Pc(155) int local155 = local140 + (local148 << 7);
					Static63.anIntArray58[local155] = 0;
				}
			}
		}
	}

	@OriginalMember(owner = "client!lc", name = "b", descriptor = "(B)V")
	public static void method835() {
		Static18.aByteArrayArrayArray3 = new byte[4][105][105];
		Static9.anInt290 = 99;
		Static22.anIntArray77 = new int[104];
		Static95.aByteArrayArrayArray9 = new byte[4][104][104];
		Static82.anIntArray246 = new int[104];
		Static33.aByteArrayArrayArray6 = new byte[4][104][104];
		Static95.anIntArray319 = new int[104];
		Static11.anIntArrayArray5 = new int[105][105];
		Static28.anIntArray94 = new int[104];
		Static65.anIntArray193 = new int[104];
		Static51.anIntArrayArrayArray3 = new int[4][105][105];
		Static40.aByteArrayArrayArray7 = new byte[4][104][104];
		Static27.aByteArrayArrayArray5 = new byte[4][104][104];
	}
}
