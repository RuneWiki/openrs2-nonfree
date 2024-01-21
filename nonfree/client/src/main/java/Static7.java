import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static7 {

	@OriginalMember(owner = "client!ah", name = "o", descriptor = "I")
	public static int anInt223;

	@OriginalMember(owner = "client!ah", name = "c", descriptor = "Lclient!rd;")
	public static final Class80 aClass80_49 = Static120.method1824("Musik)2Engine vorbereitet)3");

	@OriginalMember(owner = "client!ah", name = "g", descriptor = "[[B")
	public static final byte[][] aByteArrayArray1 = new byte[1000][];

	@OriginalMember(owner = "client!ah", name = "h", descriptor = "Lclient!rd;")
	public static final Class80 aClass80_50 = Static120.method1824("Fehler beim Laden Ihres Spielcharakters)3");

	@OriginalMember(owner = "client!ah", name = "j", descriptor = "I")
	public static int anInt221 = 0;

	@OriginalMember(owner = "client!ah", name = "k", descriptor = "Lclient!rd;")
	public static final Class80 aClass80_51 = Static120.method1824("Gegenstand f-Ur Mitglieder");

	@OriginalMember(owner = "client!ah", name = "l", descriptor = "[J")
	public static final long[] aLongArray1 = new long[32];

	@OriginalMember(owner = "client!ah", name = "m", descriptor = "[I")
	public static final int[] anIntArray31 = new int[128];

	@OriginalMember(owner = "client!ah", name = "n", descriptor = "I")
	public static int anInt222 = 0;

	@OriginalMember(owner = "client!ah", name = "a", descriptor = "(II)V")
	public static void method152(@OriginalArg(0) int arg0) {
		Static155.method2489();
		Static4.method127();
		@Pc(14) int local14 = Static44.method678(arg0).anInt4152;
		if (local14 == 0) {
			return;
		}
		@Pc(21) int local21 = Static41.anIntArray131[arg0];
		if (local14 == 1) {
			Static13.anInt312 = local21;
			if (Static13.anInt312 == 1) {
				Static65.method960(0.9F);
			}
			if (Static13.anInt312 == 2) {
				Static65.method960(0.8F);
			}
			if (Static13.anInt312 == 3) {
				Static65.method960(0.7F);
			}
			if (Static13.anInt312 == 4) {
				Static65.method960(0.6F);
			}
			Static170.method2730();
		}
		if (local14 == 3) {
			@Pc(59) short local59 = 0;
			if (local21 == 0) {
				local59 = 255;
			}
			if (local21 == 1) {
				local59 = 192;
			}
			if (local21 == 2) {
				local59 = 128;
			}
			if (local21 == 3) {
				local59 = 64;
			}
			if (local21 == 4) {
				local59 = 0;
			}
			if (local59 != Static187.anInt4245) {
				if (Static187.anInt4245 == 0 && Static151.anInt3396 != -1) {
					Static92.method2211(Static102.aClass1_Sub1_17, local59, Static151.anInt3396);
					Static124.aBoolean108 = false;
				} else if (local59 == 0) {
					Static190.method3094();
					Static124.aBoolean108 = false;
				} else {
					Static101.method1498(local59);
				}
				Static187.anInt4245 = local59;
			}
		}
		if (local14 == 10) {
			if (local21 == 0) {
				Static29.anInt739 = 127;
			}
			if (local21 == 1) {
				Static29.anInt739 = 96;
			}
			if (local21 == 2) {
				Static29.anInt739 = 64;
			}
			if (local21 == 3) {
				Static29.anInt739 = 32;
			}
			if (local21 == 4) {
				Static29.anInt739 = 0;
			}
		}
		if (local14 == 5) {
			Static44.anInt1007 = local21;
		}
		if (local14 == 6) {
			Static70.anInt1548 = local21;
		}
		if (local14 == 4) {
			if (local21 == 0) {
				Static5.anInt201 = 127;
			}
			if (local21 == 1) {
				Static5.anInt201 = 96;
			}
			if (local21 == 2) {
				Static5.anInt201 = 64;
			}
			if (local21 == 3) {
				Static5.anInt201 = 32;
			}
			if (local21 == 4) {
				Static5.anInt201 = 0;
			}
		}
		if (local14 == 9) {
			Static167.anInt3752 = local21;
		}
	}

	@OriginalMember(owner = "client!ah", name = "a", descriptor = "(III)V")
	public static void method153(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(7) Class3_Sub15 local7 = Static185.aClass3_Sub15ArrayArrayArray1[arg0][arg1][arg2];
		if (local7 != null) {
			local7.aClass92_1 = null;
		}
	}

	@OriginalMember(owner = "client!ah", name = "a", descriptor = "(ILclient!mb;Lclient!na;B)V")
	public static void method154(@OriginalArg(0) int arg0, @OriginalArg(1) Class3_Sub17 arg1, @OriginalArg(2) Class61 arg2) {
		@Pc(17) Class3_Sub24 local17 = new Class3_Sub24();
		local17.anInt3974 = arg1.method2107();
		local17.anInt3977 = arg1.method2132();
		local17.aClass94Array2 = new Class94[local17.anInt3974];
		local17.aByteArrayArrayArray6 = new byte[local17.anInt3974][][];
		local17.anIntArray479 = new int[local17.anInt3974];
		local17.anIntArray478 = new int[local17.anInt3974];
		local17.aClass94Array1 = new Class94[local17.anInt3974];
		local17.anIntArray480 = new int[local17.anInt3974];
		for (@Pc(59) int local59 = 0; local59 < local17.anInt3974; local59++) {
			try {
				@Pc(65) int local65 = arg1.method2107();
				@Pc(94) String local94;
				@Pc(103) String local103;
				@Pc(107) int local107;
				if (local65 == 0 || local65 == 1 || local65 == 2) {
					local94 = new String(arg1.method2102().method2444());
					local103 = new String(arg1.method2102().method2444());
					local107 = 0;
					if (local65 == 1) {
						local107 = arg1.method2132();
					}
					local17.anIntArray480[local59] = local65;
					local17.anIntArray479[local59] = local107;
					local17.aClass94Array1[local59] = arg2.method1787(local103, Static180.method2879(local94));
				} else if (local65 == 3 || local65 == 4) {
					local94 = new String(arg1.method2102().method2444());
					local103 = new String(arg1.method2102().method2444());
					local107 = arg1.method2107();
					@Pc(110) String[] local110 = new String[local107];
					for (@Pc(112) int local112 = 0; local112 < local107; local112++) {
						local110[local112] = new String(arg1.method2102().method2444());
					}
					@Pc(132) byte[][] local132 = new byte[local107][];
					@Pc(143) int local143;
					if (local65 == 3) {
						for (@Pc(137) int local137 = 0; local137 < local107; local137++) {
							local143 = arg1.method2132();
							local132[local137] = new byte[local143];
							arg1.method2126(local132[local137], local143);
						}
					}
					local17.anIntArray480[local59] = local65;
					@Pc(172) Class[] local172 = new Class[local107];
					for (local143 = 0; local143 < local107; local143++) {
						local172[local143] = Static180.method2879(local110[local143]);
					}
					local17.aClass94Array2[local59] = arg2.method1788(local103, Static180.method2879(local94), local172);
					local17.aByteArrayArrayArray6[local59] = local132;
				}
			} catch (@Pc(263) ClassNotFoundException local263) {
				local17.anIntArray478[local59] = -1;
			} catch (@Pc(270) SecurityException local270) {
				local17.anIntArray478[local59] = -2;
			} catch (@Pc(277) NullPointerException local277) {
				local17.anIntArray478[local59] = -3;
			} catch (@Pc(284) Exception local284) {
				local17.anIntArray478[local59] = -4;
			} catch (@Pc(291) Throwable local291) {
				local17.anIntArray478[local59] = -5;
			}
		}
		Static126.aClass70_17.method1958(local17);
	}

	@OriginalMember(owner = "client!ah", name = "b", descriptor = "(II)I")
	public static int method155(@OriginalArg(0) int arg0) {
		@Pc(13) int local13 = (arg0 >>> 1 & 0x55555555) + (arg0 & 0x55555555);
		@Pc(23) int local23 = (local13 >>> 2 & 0x33333333) + (local13 & 0x33333333);
		@Pc(36) int local36 = (local23 >>> 4) + local23 & 0xF0F0F0F;
		@Pc(42) int local42 = local36 + (local36 >>> 8);
		@Pc(48) int local48 = local42 + (local42 >>> 16);
		return local48 & 0xFF;
	}

	@OriginalMember(owner = "client!ah", name = "a", descriptor = "([Lclient!rd;[SI)V")
	public static void method157(@OriginalArg(0) Class80[] arg0, @OriginalArg(1) short[] arg1) {
		Static182.method2913(0, arg0, arg1, arg0.length - 1);
	}

	@OriginalMember(owner = "client!ah", name = "a", descriptor = "(II[Lclient!qf;)V")
	public static void method158(@OriginalArg(1) int arg0, @OriginalArg(2) Class77[] arg1) {
		for (@Pc(8) int local8 = 0; local8 < arg1.length; local8++) {
			@Pc(14) Class77 local14 = arg1[local8];
			if (local14 != null) {
				if (local14.anInt3206 == 0) {
					if (local14.aClass77Array1 != null) {
						method158(arg0, local14.aClass77Array1);
					}
					@Pc(38) Class3_Sub20 local38 = (Class3_Sub20) Static28.aClass54_4.method1496((long) local14.anInt3237);
					if (local38 != null) {
						Static29.method491(local38.anInt2996, arg0);
					}
				}
				@Pc(57) Class3_Sub16 local57;
				if (arg0 == 0 && local14.anObjectArray18 != null) {
					local57 = new Class3_Sub16();
					local57.aClass77_10 = local14;
					local57.anObjectArray3 = local14.anObjectArray18;
					Static168.method2710(local57);
				}
				if (arg0 == 1 && local14.anObjectArray14 != null) {
					if (local14.anInt3258 >= 0) {
						@Pc(84) Class77 local84 = Static92.method2208(local14.anInt3237);
						if (local84 == null || local84.aClass77Array1 == null || local84.aClass77Array1.length <= local14.anInt3258 || local14 != local84.aClass77Array1[local14.anInt3258]) {
							continue;
						}
					}
					local57 = new Class3_Sub16();
					local57.aClass77_10 = local14;
					local57.anObjectArray3 = local14.anObjectArray14;
					Static168.method2710(local57);
				}
			}
		}
	}

	@OriginalMember(owner = "client!ah", name = "a", descriptor = "(IIIIII)V")
	public static void method159(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		@Pc(7) int local7 = arg0 + 1;
		Static46.method726(arg4, arg3, Static96.anIntArrayArray27[arg0], arg1);
		@Pc(20) int local20 = arg2 - 1;
		Static46.method726(arg4, arg3, Static96.anIntArrayArray27[arg2], arg1);
		for (@Pc(25) int local25 = local7; local25 <= local20; local25++) {
			@Pc(31) int[] local31 = Static96.anIntArrayArray27[local25];
			local31[arg4] = local31[arg1] = arg3;
		}
	}
}
