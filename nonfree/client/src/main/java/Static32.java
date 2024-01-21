import java.util.zip.CRC32;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static32 {

	@OriginalMember(owner = "client!ef", name = "Gc", descriptor = "[I")
	public static int[] anIntArray150;

	@OriginalMember(owner = "client!ef", name = "Kc", descriptor = "Lclient!pa;")
	public static Class35_Sub1 aClass35_Sub1_12;

	@OriginalMember(owner = "client!ef", name = "Nc", descriptor = "I")
	public static int anInt1454;

	@OriginalMember(owner = "client!ef", name = "tb", descriptor = "I")
	public static int anInt1396 = -2;

	@OriginalMember(owner = "client!ef", name = "Nb", descriptor = "Ljava/util/zip/CRC32;")
	public static CRC32 aCRC32_3 = new CRC32();

	@OriginalMember(owner = "client!ef", name = "kc", descriptor = "Lclient!id;")
	public static Class34 aClass34_700 = null;

	@OriginalMember(owner = "client!ef", name = "vc", descriptor = "I")
	public static int anInt1440 = 0;

	@OriginalMember(owner = "client!ef", name = "xc", descriptor = "Z")
	public static boolean aBoolean81 = false;

	@OriginalMember(owner = "client!ef", name = "Bc", descriptor = "I")
	public static int anInt1445 = 0;

	@OriginalMember(owner = "client!ef", name = "Lc", descriptor = "I")
	public static int anInt1453 = 0;

	@OriginalMember(owner = "client!ef", name = "Mc", descriptor = "[I")
	public static int[] anIntArray151 = new int[100];

	@OriginalMember(owner = "client!ef", name = "Pc", descriptor = "Lclient!id;")
	public static Class34 aClass34_702 = Static9.method266("Angreifen");

	@OriginalMember(owner = "client!ef", name = "a", descriptor = "(IIBI)I")
	public static int method896(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		@Pc(11) int local11 = 256 - arg1;
		return (arg1 * (arg2 & 0xFF00) + (arg0 & 0xFF00) * local11 & 0xFF0000) + (local11 * (arg0 & 0xFF00FF) + arg1 * (arg2 & 0xFF00FF) & 0xFF00FF00) >> 8;
	}

	@OriginalMember(owner = "client!ef", name = "a", descriptor = "(ZI)Lclient!sf;")
	public static Class1_Sub1_Sub12 method897(@OriginalArg(1) int arg0) {
		@Pc(10) Class1_Sub1_Sub12 local10 = (Class1_Sub1_Sub12) Static1.aClass63_1.method1663((long) arg0);
		if (local10 != null) {
			return local10;
		}
		@Pc(20) byte[] local20 = Static12.aClass35_1.method1573(4, arg0);
		local10 = new Class1_Sub1_Sub12();
		if (local20 != null) {
			local10.method1797(arg0, new Class1_Sub19(local20));
		}
		local10.method1796();
		Static1.aClass63_1.method1659(local10, (long) arg0);
		return local10;
	}

	@OriginalMember(owner = "client!ef", name = "b", descriptor = "(Z)V")
	public static void method898() {
		Static51.aClass1_Sub19_Sub1_4.method2102();
		@Pc(13) int local13 = Static51.aClass1_Sub19_Sub1_4.method2096(8);
		@Pc(22) int local22;
		if (local13 < Static64.anInt1731) {
			for (local22 = local13; local22 < Static64.anInt1731; local22++) {
				Static120.anIntArray354[Static92.anInt2405++] = Static1.anIntArray19[local22];
			}
		}
		if (Static64.anInt1731 < local13) {
			throw new RuntimeException("gnpov1");
		}
		Static64.anInt1731 = 0;
		for (local22 = 0; local22 < local13; local22++) {
			@Pc(69) int local69 = Static1.anIntArray19[local22];
			@Pc(73) Class1_Sub1_Sub1_Sub1_Sub2 local73 = Static4.aClass1_Sub1_Sub1_Sub1_Sub2Array1[local69];
			@Pc(82) int local82 = Static51.aClass1_Sub19_Sub1_4.method2096(1);
			if (local82 == 0) {
				Static1.anIntArray19[Static64.anInt1731++] = local69;
				local73.anInt1435 = Static73.anInt1947;
			} else {
				@Pc(105) int local105 = Static51.aClass1_Sub19_Sub1_4.method2096(2);
				if (local105 == 0) {
					Static1.anIntArray19[Static64.anInt1731++] = local69;
					local73.anInt1435 = Static73.anInt1947;
					Static17.anIntArray65[anInt1453++] = local69;
				} else {
					@Pc(149) int local149;
					@Pc(163) int local163;
					if (local105 == 1) {
						Static1.anIntArray19[Static64.anInt1731++] = local69;
						local73.anInt1435 = Static73.anInt1947;
						local149 = Static51.aClass1_Sub19_Sub1_4.method2096(3);
						local73.method895(local149, false);
						local163 = Static51.aClass1_Sub19_Sub1_4.method2096(1);
						if (local163 == 1) {
							Static17.anIntArray65[anInt1453++] = local69;
						}
					} else if (local105 == 2) {
						Static1.anIntArray19[Static64.anInt1731++] = local69;
						local73.anInt1435 = Static73.anInt1947;
						local149 = Static51.aClass1_Sub19_Sub1_4.method2096(3);
						local73.method895(local149, true);
						local163 = Static51.aClass1_Sub19_Sub1_4.method2096(3);
						local73.method895(local163, true);
						@Pc(221) int local221 = Static51.aClass1_Sub19_Sub1_4.method2096(1);
						if (local221 == 1) {
							Static17.anIntArray65[anInt1453++] = local69;
						}
					} else if (local105 == 3) {
						Static120.anIntArray354[Static92.anInt2405++] = local69;
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!ef", name = "a", descriptor = "(II[Lclient!pb;[BIII)V")
	public static void method900(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class58[] arg2, @OriginalArg(3) byte[] arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		@Pc(11) int local11;
		for (@Pc(3) int local3 = 0; local3 < 4; local3++) {
			for (@Pc(7) int local7 = 0; local7 < 64; local7++) {
				for (local11 = 0; local11 < 64; local11++) {
					if (arg0 + local7 > 0 && arg0 + local7 < 103 && arg4 + local11 > 0 && local11 + arg4 < 103) {
						arg2[local3].anIntArrayArray26[arg0 + local7][arg4 + local11] &= 0xFEFFFFFF;
					}
				}
			}
		}
		@Pc(81) Class1_Sub19 local81 = new Class1_Sub19(arg3);
		for (local11 = 0; local11 < 4; local11++) {
			for (@Pc(91) int local91 = 0; local91 < 64; local91++) {
				for (@Pc(95) int local95 = 0; local95 < 64; local95++) {
					Static115.method1848(0, arg5, arg4 + local95, arg1, arg0 + local91, local81, local11);
				}
			}
		}
	}

	@OriginalMember(owner = "client!ef", name = "a", descriptor = "(Lclient!ie;Lclient!ie;Lclient!ie;Lclient!ie;B)V")
	public static void method902(@OriginalArg(0) Class35 arg0, @OriginalArg(1) Class35 arg1, @OriginalArg(2) Class35 arg2, @OriginalArg(3) Class35 arg3) {
		Static121.aClass35_32 = arg3;
		Static71.aClass35_19 = arg2;
		Static101.aClass35_27 = arg1;
		Static37.aClass35_10 = arg0;
		Static41.aClass1_Sub9ArrayArray1 = new Class1_Sub9[Static37.aClass35_10.method1568()][];
		Static113.aBooleanArray18 = new boolean[Static37.aClass35_10.method1568()];
	}

	@OriginalMember(owner = "client!ef", name = "g", descriptor = "(I)V")
	public static void method904() {
		anIntArray150 = null;
		aClass34_700 = null;
		anIntArray151 = null;
		aCRC32_3 = null;
		aClass35_Sub1_12 = null;
		aClass34_702 = null;
	}

	@OriginalMember(owner = "client!ef", name = "a", descriptor = "(Lclient!bd;I)V")
	public static void method905(@OriginalArg(0) Class1_Sub3 arg0) {
		@Pc(10) int local10 = 0;
		@Pc(12) int local12 = 0;
		@Pc(14) int local14 = 0;
		@Pc(16) int local16 = -1;
		if (arg0.anInt474 == 0) {
			local10 = Static39.aClass44_1.method1145(arg0.anInt483, arg0.anInt469, arg0.anInt484);
		}
		if (arg0.anInt474 == 1) {
			local10 = Static39.aClass44_1.method1143(arg0.anInt483, arg0.anInt469, arg0.anInt484);
		}
		if (arg0.anInt474 == 2) {
			local10 = Static39.aClass44_1.method1156(arg0.anInt483, arg0.anInt469, arg0.anInt484);
		}
		if (arg0.anInt474 == 3) {
			local10 = Static39.aClass44_1.method1153(arg0.anInt483, arg0.anInt469, arg0.anInt484);
		}
		if (local10 != 0) {
			local16 = local10 >> 14 & 0x7FFF;
			@Pc(97) int local97 = Static39.aClass44_1.method1138(arg0.anInt483, arg0.anInt469, arg0.anInt484, local10);
			local14 = local97 & 0x1F;
			local12 = local97 >> 6 & 0x3;
		}
		arg0.anInt476 = local14;
		arg0.anInt478 = local12;
		arg0.anInt473 = local16;
	}

	@OriginalMember(owner = "client!ef", name = "a", descriptor = "(IB)V")
	public static void method907(@OriginalArg(0) int arg0) {
		if (!Static26.method496(arg0)) {
			return;
		}
		@Pc(21) Class1_Sub9[] local21 = Static41.aClass1_Sub9ArrayArray1[arg0];
		for (@Pc(23) int local23 = 0; local23 < local21.length; local23++) {
			@Pc(29) Class1_Sub9 local29 = local21[local23];
			if (local29 != null) {
				local29.anInt1082 = 0;
				local29.anInt1052 = 0;
			}
		}
	}
}
