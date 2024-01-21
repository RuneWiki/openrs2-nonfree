import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static57 {

	@OriginalMember(owner = "client!la", name = "Bb", descriptor = "Lclient!nb;")
	public static Class40 aClass40_1;

	@OriginalMember(owner = "client!la", name = "Ib", descriptor = "[[B")
	public static byte[][] aByteArrayArray4;

	@OriginalMember(owner = "client!la", name = "Kb", descriptor = "Lclient!gd;")
	public static Class23 aClass23_967 = Static15.method178("leuchten2:");

	@OriginalMember(owner = "client!la", name = "Pb", descriptor = "Lclient!gd;")
	public static Class23 aClass23_968 = Static15.method178("Zu viele Verbindungen von Ihrer Adresse)3");

	@OriginalMember(owner = "client!la", name = "Tb", descriptor = "Lclient!gd;")
	public static Class23 aClass23_969 = Static15.method178("backright1");

	@OriginalMember(owner = "client!la", name = "Ub", descriptor = "I")
	public static int anInt1779 = -1;

	@OriginalMember(owner = "client!la", name = "Vb", descriptor = "Lclient!gd;")
	public static Class23 aClass23_970 = Static15.method178("Welt");

	@OriginalMember(owner = "client!la", name = "Wb", descriptor = "I")
	public static int anInt1780 = 0;

	@OriginalMember(owner = "client!la", name = "cc", descriptor = "I")
	public static int anInt1786 = -1;

	@OriginalMember(owner = "client!la", name = "a", descriptor = "(IZLclient!hd;I)V")
	public static void method1092(@OriginalArg(0) int arg0, @OriginalArg(2) Class1_Sub1_Sub6_Sub1 arg1, @OriginalArg(3) int arg2) {
		@Pc(7) int local7 = arg2 * arg2 + arg0 * arg0;
		if (local7 <= 4225 || local7 >= 90000) {
			Static65.method1252(arg2, arg0, arg1);
			return;
		}
		@Pc(32) int local32 = Static3.anInt133 + Static35.anInt1096 & 0x7FF;
		@Pc(36) int local36 = Static81.anIntArray292[local32];
		@Pc(40) int local40 = Static81.anIntArray300[local32];
		@Pc(48) int local48 = local40 * 256 / (Static50.anInt1618 + 256);
		@Pc(56) int local56 = local36 * 256 / (Static50.anInt1618 + 256);
		@Pc(67) int local67 = arg2 * local56 - local48 * arg0 >> 16;
		@Pc(77) int local77 = arg0 * local56 + arg2 * local48 >> 16;
		@Pc(83) double local83 = Math.atan2((double) local77, (double) local67);
		@Pc(89) int local89 = (int) (Math.sin(local83) * 63.0D);
		@Pc(95) int local95 = (int) (Math.cos(local83) * 57.0D);
		Static113.aClass1_Sub1_Sub6_Sub1_6.method790(local89 + 98 - 10, -local95 + 63, local83);
	}

	@OriginalMember(owner = "client!la", name = "g", descriptor = "(I)V")
	public static void method1093() {
		if (Static113.aClass29_1 != null) {
			@Pc(11) Class29 local11 = Static113.aClass29_1;
			synchronized (Static113.aClass29_1) {
				Static113.aClass29_1 = null;
			}
		}
	}

	@OriginalMember(owner = "client!la", name = "a", descriptor = "(III)Z")
	public static boolean method1094(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (arg1 == 0 && Static109.anInt2830 == arg0) {
			return true;
		} else if (arg1 == 1 && Static2.anInt2279 == arg0) {
			return true;
		} else {
			return (arg1 == 2 || arg1 == 3) && arg0 == Static44.anInt1487;
		}
	}

	@OriginalMember(owner = "client!la", name = "h", descriptor = "(I)V")
	public static void method1096() {
		Static83.aClass1_Sub5_Sub1_3.method733();
		@Pc(16) int local16 = Static83.aClass1_Sub5_Sub1_3.method739(8);
		@Pc(21) int local21;
		if (local16 < Static20.anInt691) {
			for (local21 = local16; local21 < Static20.anInt691; local21++) {
				Static111.anIntArray403[Static82.anInt2314++] = Static98.anIntArray346[local21];
			}
		}
		if (Static20.anInt691 < local16) {
			throw new RuntimeException("gnpov1");
		}
		Static20.anInt691 = 0;
		for (local21 = 0; local21 < local16; local21++) {
			@Pc(57) int local57 = Static98.anIntArray346[local21];
			@Pc(61) Class1_Sub1_Sub2_Sub1_Sub1 local61 = Static108.aClass1_Sub1_Sub2_Sub1_Sub1Array1[local57];
			@Pc(66) int local66 = Static83.aClass1_Sub5_Sub1_3.method739(1);
			if (local66 == 0) {
				Static98.anIntArray346[Static20.anInt691++] = local57;
				local61.anInt2224 = Static7.anInt176;
			} else {
				@Pc(88) int local88 = Static83.aClass1_Sub5_Sub1_3.method739(2);
				if (local88 == 0) {
					Static98.anIntArray346[Static20.anInt691++] = local57;
					local61.anInt2224 = Static7.anInt176;
					Static88.anIntArray151[Static37.anInt1299++] = local57;
				} else {
					@Pc(129) int local129;
					@Pc(139) int local139;
					if (local88 == 1) {
						Static98.anIntArray346[Static20.anInt691++] = local57;
						local61.anInt2224 = Static7.anInt176;
						local129 = Static83.aClass1_Sub5_Sub1_3.method739(3);
						local61.method1389(false, local129);
						local139 = Static83.aClass1_Sub5_Sub1_3.method739(1);
						if (local139 == 1) {
							Static88.anIntArray151[Static37.anInt1299++] = local57;
						}
					} else if (local88 == 2) {
						Static98.anIntArray346[Static20.anInt691++] = local57;
						local61.anInt2224 = Static7.anInt176;
						local129 = Static83.aClass1_Sub5_Sub1_3.method739(3);
						local61.method1389(true, local129);
						local139 = Static83.aClass1_Sub5_Sub1_3.method739(3);
						local61.method1389(true, local139);
						@Pc(194) int local194 = Static83.aClass1_Sub5_Sub1_3.method739(1);
						if (local194 == 1) {
							Static88.anIntArray151[Static37.anInt1299++] = local57;
						}
					} else if (local88 == 3) {
						Static111.anIntArray403[Static82.anInt2314++] = local57;
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!la", name = "a", descriptor = "(IILclient!rc;Lclient!ra;)V")
	public static void method1097(@OriginalArg(1) int arg0, @OriginalArg(2) Class1_Sub5 arg1, @OriginalArg(3) Class54 arg2) {
		@Pc(7) Class1_Sub13 local7 = new Class1_Sub13();
		local7.anInt2724 = arg1.method716();
		local7.anInt2717 = arg1.method692();
		local7.anIntArray378 = new int[local7.anInt2724];
		local7.aByteArrayArrayArray6 = new byte[local7.anInt2724][][];
		local7.aClass62Array1 = new Class62[local7.anInt2724];
		local7.aClass62Array2 = new Class62[local7.anInt2724];
		local7.anIntArray377 = new int[local7.anInt2724];
		local7.anIntArray376 = new int[local7.anInt2724];
		for (@Pc(54) int local54 = 0; local54 < local7.anInt2724; local54++) {
			try {
				@Pc(59) int local59 = arg1.method716();
				@Pc(83) String local83;
				@Pc(92) String local92;
				@Pc(74) int local74;
				if (local59 == 0 || local59 == 1 || local59 == 2) {
					local74 = 0;
					local83 = new String(arg1.method683().method538());
					local92 = new String(arg1.method683().method538());
					if (local59 == 1) {
						local74 = arg1.method692();
					}
					local7.anIntArray378[local54] = local59;
					local7.anIntArray376[local54] = local74;
					local7.aClass62Array2[local54] = arg2.method1490(local92, Static45.method953(local83));
				} else if (local59 == 3 || local59 == 4) {
					local83 = new String(arg1.method683().method538());
					local92 = new String(arg1.method683().method538());
					local74 = arg1.method716();
					@Pc(160) String[] local160 = new String[local74];
					for (@Pc(162) int local162 = 0; local162 < local74; local162++) {
						local160[local162] = new String(arg1.method683().method538());
					}
					@Pc(183) byte[][] local183 = new byte[local74][];
					@Pc(195) int local195;
					if (local59 == 3) {
						for (@Pc(188) int local188 = 0; local188 < local74; local188++) {
							local195 = arg1.method692();
							local183[local188] = new byte[local195];
							arg1.method709(local183[local188], local195);
						}
					}
					local7.anIntArray378[local54] = local59;
					@Pc(220) Class[] local220 = new Class[local74];
					for (local195 = 0; local195 < local74; local195++) {
						local220[local195] = Static45.method953(local160[local195]);
					}
					local7.aClass62Array1[local54] = arg2.method1486(local220, Static45.method953(local83), local92);
					local7.aByteArrayArrayArray6[local54] = local183;
				}
			} catch (@Pc(254) ClassNotFoundException local254) {
				local7.anIntArray377[local54] = -1;
			} catch (@Pc(261) SecurityException local261) {
				local7.anIntArray377[local54] = -2;
			} catch (@Pc(268) NullPointerException local268) {
				local7.anIntArray377[local54] = -3;
			} catch (@Pc(275) Exception local275) {
				local7.anIntArray377[local54] = -4;
			} catch (@Pc(282) Throwable local282) {
				local7.anIntArray377[local54] = -5;
			}
		}
		Static82.aClass45_7.method1295(local7);
	}

	@OriginalMember(owner = "client!la", name = "i", descriptor = "(I)V")
	public static void method1098() {
		Static70.aClass22_3.method901();
		for (@Pc(8) int local8 = 0; local8 < 32; local8++) {
			Static13.aLongArray5[local8] = 0L;
		}
		for (@Pc(26) int local26 = 0; local26 < 32; local26++) {
			Static89.aLongArray29[local26] = 0L;
		}
		Static77.anInt2100 = 0;
	}

	@OriginalMember(owner = "client!la", name = "a", descriptor = "(ZIII)V")
	public static void method1099(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		if (arg0 == 1) {
			Static76.aClass1_Sub5_Sub1_2.method731(250);
			Static76.aClass1_Sub5_Sub1_2.method679(arg2);
			Static76.aClass1_Sub5_Sub1_2.method686(arg1);
		}
		if (arg0 == 2) {
			Static76.aClass1_Sub5_Sub1_2.method731(203);
			Static76.aClass1_Sub5_Sub1_2.method679(arg2);
			Static76.aClass1_Sub5_Sub1_2.method686(arg1);
		}
		if (arg0 == 3) {
			Static76.aClass1_Sub5_Sub1_2.method731(143);
			Static76.aClass1_Sub5_Sub1_2.method679(arg2);
			Static76.aClass1_Sub5_Sub1_2.method686(arg1);
		}
		if (arg0 == 4) {
			Static76.aClass1_Sub5_Sub1_2.method731(125);
			Static76.aClass1_Sub5_Sub1_2.method679(arg2);
			Static76.aClass1_Sub5_Sub1_2.method686(arg1);
		}
		if (arg0 == 5) {
			Static76.aClass1_Sub5_Sub1_2.method731(26);
			Static76.aClass1_Sub5_Sub1_2.method679(arg2);
			Static76.aClass1_Sub5_Sub1_2.method686(arg1);
		}
		if (arg0 == 6) {
			Static76.aClass1_Sub5_Sub1_2.method731(10);
			Static76.aClass1_Sub5_Sub1_2.method679(arg2);
			Static76.aClass1_Sub5_Sub1_2.method686(arg1);
		}
		if (arg0 == 7) {
			Static76.aClass1_Sub5_Sub1_2.method731(60);
			Static76.aClass1_Sub5_Sub1_2.method679(arg2);
			Static76.aClass1_Sub5_Sub1_2.method686(arg1);
		}
		if (arg0 == 8) {
			Static76.aClass1_Sub5_Sub1_2.method731(7);
			Static76.aClass1_Sub5_Sub1_2.method679(arg2);
			Static76.aClass1_Sub5_Sub1_2.method686(arg1);
		}
		if (arg0 == 9) {
			Static76.aClass1_Sub5_Sub1_2.method731(213);
			Static76.aClass1_Sub5_Sub1_2.method679(arg2);
			Static76.aClass1_Sub5_Sub1_2.method686(arg1);
		}
		if (arg0 == 10) {
			Static76.aClass1_Sub5_Sub1_2.method731(6);
			Static76.aClass1_Sub5_Sub1_2.method679(arg2);
			Static76.aClass1_Sub5_Sub1_2.method686(arg1);
		}
	}

	@OriginalMember(owner = "client!la", name = "a", descriptor = "(ZLclient!gd;)Z")
	public static boolean method1100(@OriginalArg(1) Class23 arg0) {
		if (arg0 == null) {
			return false;
		}
		for (@Pc(14) int local14 = 0; local14 < Static8.anInt186; local14++) {
			if (arg0.method530(Static8.aClass23Array4[local14])) {
				return true;
			}
		}
		return arg0.method530(Static14.aClass1_Sub1_Sub2_Sub1_Sub2_1.aClass23_1260);
	}

	@OriginalMember(owner = "client!la", name = "j", descriptor = "(I)V")
	public static void method1101() {
		aClass23_967 = null;
		aClass23_970 = null;
		aClass40_1 = null;
		aByteArrayArray4 = null;
		aClass23_969 = null;
		aClass23_968 = null;
	}
}
