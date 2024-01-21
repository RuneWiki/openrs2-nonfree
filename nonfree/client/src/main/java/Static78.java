import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static78 {

	@OriginalMember(owner = "client!hi", name = "db", descriptor = "[Lclient!vi;")
	public static Class2_Sub1_Sub2[] aClass2_Sub1_Sub2Array6;

	@OriginalMember(owner = "client!hi", name = "eb", descriptor = "[I")
	public static int[] anIntArray137;

	@OriginalMember(owner = "client!hi", name = "hb", descriptor = "[Lclient!hh;")
	public static Class42[] aClass42Array5;

	@OriginalMember(owner = "client!hi", name = "ab", descriptor = "Lclient!q;")
	public static final Class79 aClass79_6 = new Class79(4);

	@OriginalMember(owner = "client!hi", name = "bb", descriptor = "Lclient!kg;")
	public static final Class53 aClass53_4 = new Class53(64);

	@OriginalMember(owner = "client!hi", name = "cb", descriptor = "Lclient!mb;")
	public static final Class62 aClass62_552 = Static151.method2243(" steht bereits auf Ihrer Ignorieren)2Liste(Q");

	@OriginalMember(owner = "client!hi", name = "fb", descriptor = "Lclient!q;")
	public static final Class79 aClass79_7 = new Class79(500);

	@OriginalMember(owner = "client!hi", name = "gb", descriptor = "I")
	public static int anInt1622 = 0;

	@OriginalMember(owner = "client!hi", name = "ib", descriptor = "Lclient!mb;")
	private static final Class62 aClass62_553 = Static151.method2243("Loaded config");

	@OriginalMember(owner = "client!hi", name = "jb", descriptor = "[[I")
	public static final int[][] anIntArrayArray14 = new int[104][104];

	@OriginalMember(owner = "client!hi", name = "kb", descriptor = "Lclient!mb;")
	public static Class62 aClass62_554 = aClass62_553;

	@OriginalMember(owner = "client!hi", name = "a", descriptor = "(Ljava/lang/Throwable;Ljava/lang/String;)Lclient!ff;")
	public static RuntimeException_Sub1 method1102(@OriginalArg(0) Throwable arg0, @OriginalArg(1) String arg1) {
		@Pc(12) RuntimeException_Sub1 local12;
		if (arg0 instanceof RuntimeException_Sub1) {
			local12 = (RuntimeException_Sub1) arg0;
			local12.aString1 = local12.aString1 + ' ' + arg1;
		} else {
			local12 = new RuntimeException_Sub1(arg0, arg1);
		}
		return local12;
	}

	@OriginalMember(owner = "client!hi", name = "c", descriptor = "(III)Lclient!bc;")
	public static Class10 method1103(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(7) Class2_Sub18 local7 = Static92.aClass2_Sub18ArrayArrayArray1[arg0][arg1][arg2];
		return local7 == null || local7.aClass10_1 == null ? null : local7.aClass10_1;
	}

	@OriginalMember(owner = "client!hi", name = "a", descriptor = "(IIILclient!pb;ZI)V")
	public static void method1104(@OriginalArg(1) int arg0, @OriginalArg(3) Class71 arg1, @OriginalArg(5) int arg2) {
		Static59.anInt1222 = 10000;
		Static49.anInt1075 = arg2;
		Static46.anInt1030 = arg0;
		Static40.aBoolean40 = false;
		Static80.anInt1663 = 0;
		Static35.anInt841 = 1;
		Static21.aClass71_3 = arg1;
	}

	@OriginalMember(owner = "client!hi", name = "a", descriptor = "(IB)V")
	public static void method1105(@OriginalArg(0) int arg0) {
		Static138.anInt2899 += arg0 * 128;
		@Pc(29) int local29;
		if (Static138.anInt2899 > Static57.anIntArray90.length) {
			Static138.anInt2899 -= Static57.anIntArray90.length;
			local29 = (int) (Math.random() * 12.0D);
			Static2.method60(Static59.aClass42_Sub1Array2[local29]);
		}
		local29 = 0;
		@Pc(42) int local42 = arg0 * 128;
		@Pc(48) int local48 = (256 - arg0) * 128;
		for (@Pc(50) int local50 = 0; local50 < local48; local50++) {
			@Pc(75) int local75 = Static85.anIntArray156[local29 + local42] - Static57.anIntArray90[local29 + Static138.anInt2899 & Static57.anIntArray90.length - 1] * arg0 / 6;
			if (local75 < 0) {
				local75 = 0;
			}
			Static85.anIntArray156[local29++] = local75;
		}
		@Pc(110) int local110;
		@Pc(112) int local112;
		@Pc(119) int local119;
		for (@Pc(104) int local104 = 256 - arg0; local104 < 256; local104++) {
			local110 = local104 * 128;
			for (local112 = 0; local112 < 128; local112++) {
				local119 = (int) (Math.random() * 100.0D);
				if (local119 < 50 && local112 > 10 && local112 < 118) {
					Static85.anIntArray156[local110 + local112] = 255;
				} else {
					Static85.anIntArray156[local112 + local110] = 0;
				}
			}
		}
		if (Static18.anInt450 > 0) {
			Static18.anInt450 -= arg0 * 4;
		}
		if (Static214.anInt4478 > 0) {
			Static214.anInt4478 -= arg0 * 4;
		}
		if (Static18.anInt450 == 0 && Static214.anInt4478 == 0) {
			local110 = (int) (Math.random() * (double) (2000 / arg0));
			if (local110 == 0) {
				Static18.anInt450 = 1024;
			}
			if (local110 == 1) {
				Static214.anInt4478 = 1024;
			}
		}
		for (local110 = 0; local110 < 256 - arg0; local110++) {
			Static7.anIntArray228[local110] = Static7.anIntArray228[local110 + arg0];
		}
		for (local112 = 256 - arg0; local112 < 256; local112++) {
			Static7.anIntArray228[local112] = (int) (Math.sin((double) Static174.anInt3691 / 14.0D) * 16.0D + Math.sin((double) Static174.anInt3691 / 15.0D) * 14.0D + Math.sin((double) Static174.anInt3691 / 16.0D) * 12.0D);
			Static174.anInt3691++;
		}
		Static58.anInt1151 += arg0;
		local119 = (arg0 + (Static25.anInt581 & 0x1)) / 2;
		if (local119 <= 0) {
			return;
		}
		@Pc(296) int local296;
		@Pc(303) int local303;
		for (@Pc(287) int local287 = 0; local287 < Static58.anInt1151 * 100; local287++) {
			local296 = (int) (Math.random() * 124.0D) + 2;
			local303 = (int) (Math.random() * 128.0D) + 128;
			Static85.anIntArray156[(local303 << 7) + local296] = 192;
		}
		Static58.anInt1151 = 0;
		@Pc(329) int local329;
		@Pc(332) int local332;
		for (local296 = 0; local296 < 256; local296++) {
			local303 = 0;
			local329 = local296 * 128;
			for (local332 = -local119; local332 < 128; local332++) {
				if (local332 + local119 < 128) {
					local303 += Static85.anIntArray156[local119 + local332 + local329];
				}
				if (local332 - local119 - 1 >= 0) {
					local303 -= Static85.anIntArray156[local332 + local329 - local119 - 1];
				}
				if (local332 >= 0) {
					Static53.anIntArray84[local329 + local332] = local303 / (local119 * 2 + 1);
				}
			}
		}
		for (local303 = 0; local303 < 128; local303++) {
			local329 = 0;
			for (local332 = -local119; local332 < 256; local332++) {
				@Pc(412) int local412 = local332 * 128;
				if (local119 + local332 < 256) {
					local329 += Static53.anIntArray84[local412 + local303 + local119 * 128];
				}
				if (local332 - local119 - 1 >= 0) {
					local329 -= Static53.anIntArray84[local303 + local412 - local119 * 128 - 128];
				}
				if (local332 >= 0) {
					Static85.anIntArray156[local412 + local303] = local329 / (local119 * 2 + 1);
				}
			}
		}
	}

	@OriginalMember(owner = "client!hi", name = "a", descriptor = "(ILclient!hf;ILclient!kd;)V")
	public static void method1106(@OriginalArg(1) Class41 arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Class2_Sub11 arg2) {
		@Pc(9) Class2_Sub3 local9 = new Class2_Sub3();
		local9.anInt204 = arg2.method1534();
		local9.anInt202 = arg2.method1577();
		local9.aByteArrayArrayArray1 = new byte[local9.anInt204][][];
		local9.anIntArray19 = new int[local9.anInt204];
		local9.anIntArray21 = new int[local9.anInt204];
		local9.aClass56Array2 = new Class56[local9.anInt204];
		local9.anIntArray20 = new int[local9.anInt204];
		local9.aClass56Array1 = new Class56[local9.anInt204];
		for (@Pc(58) int local58 = 0; local58 < local9.anInt204; local58++) {
			try {
				@Pc(66) int local66 = arg2.method1534();
				@Pc(95) String local95;
				@Pc(104) String local104;
				@Pc(108) int local108;
				if (local66 == 0 || local66 == 1 || local66 == 2) {
					local95 = new String(arg2.method1538().method1845());
					local104 = new String(arg2.method1538().method1845());
					local108 = 0;
					if (local66 == 1) {
						local108 = arg2.method1577();
					}
					local9.anIntArray20[local58] = local66;
					local9.anIntArray19[local58] = local108;
					local9.aClass56Array2[local58] = arg0.method1048(Static94.method1426(local95), local104);
				} else if (local66 == 3 || local66 == 4) {
					local95 = new String(arg2.method1538().method1845());
					local104 = new String(arg2.method1538().method1845());
					local108 = arg2.method1534();
					@Pc(111) String[] local111 = new String[local108];
					for (@Pc(113) int local113 = 0; local113 < local108; local113++) {
						local111[local113] = new String(arg2.method1538().method1845());
					}
					@Pc(137) byte[][] local137 = new byte[local108][];
					@Pc(148) int local148;
					if (local66 == 3) {
						for (@Pc(142) int local142 = 0; local142 < local108; local142++) {
							local148 = arg2.method1577();
							local137[local142] = new byte[local148];
							arg2.method1541(local137[local142], local148);
						}
					}
					local9.anIntArray20[local58] = local66;
					@Pc(179) Class[] local179 = new Class[local108];
					for (local148 = 0; local148 < local108; local148++) {
						local179[local148] = Static94.method1426(local111[local148]);
					}
					local9.aClass56Array1[local58] = arg0.method1049(local104, local179, Static94.method1426(local95));
					local9.aByteArrayArrayArray1[local58] = local137;
				}
			} catch (@Pc(270) ClassNotFoundException local270) {
				local9.anIntArray21[local58] = -1;
			} catch (@Pc(277) SecurityException local277) {
				local9.anIntArray21[local58] = -2;
			} catch (@Pc(284) NullPointerException local284) {
				local9.anIntArray21[local58] = -3;
			} catch (@Pc(291) Exception local291) {
				local9.anIntArray21[local58] = -4;
			} catch (@Pc(298) Throwable local298) {
				local9.anIntArray21[local58] = -5;
			}
		}
		Static187.aClass13_16.method304(local9);
	}

	@OriginalMember(owner = "client!hi", name = "h", descriptor = "(I)V")
	public static void method1107() {
		Static81.aClass53_25.method1649();
		aClass79_7.method2351();
		Static37.aClass79_3.method2351();
		Static25.aClass79_1.method2351();
	}
}
