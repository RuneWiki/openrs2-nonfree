import java.io.IOException;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static137 {

	@OriginalMember(owner = "client!qb", name = "G", descriptor = "I")
	public static int anInt3410;

	@OriginalMember(owner = "client!qb", name = "I", descriptor = "[J")
	public static long[] aLongArray7 = new long[32];

	@OriginalMember(owner = "client!qb", name = "J", descriptor = "Z")
	public static boolean aBoolean262 = true;

	@OriginalMember(owner = "client!qb", name = "M", descriptor = "Lclient!dd;")
	public static Class13 aClass13_1174 = Static161.method2971("Lade Texturen )2 ");

	@OriginalMember(owner = "client!qb", name = "N", descriptor = "Lclient!dd;")
	public static Class13 aClass13_1175 = Static161.method2971("Benutzen Sie die (WPasswort -=ndern(W Option");

	@OriginalMember(owner = "client!qb", name = "P", descriptor = "Lclient!dd;")
	public static Class13 aClass13_1176 = Static161.method2971("Bitte entfernen Sie ");

	@OriginalMember(owner = "client!qb", name = "a", descriptor = "(ZI)V")
	public static void method2454(@OriginalArg(0) boolean arg0) {
		Static131.method2376();
		Static97.anInt4166++;
		if (Static97.anInt4166 < 50 && !arg0) {
			return;
		}
		Static97.anInt4166 = 0;
		if (Static47.aBoolean245 || Static96.aClass62_4 == null) {
			return;
		}
		Static1.aClass1_Sub8_Sub1_1.method1654(46);
		try {
			Static96.aClass62_4.method2281(Static1.aClass1_Sub8_Sub1_1.anInt2195, Static1.aClass1_Sub8_Sub1_1.aByteArray27);
			Static1.aClass1_Sub8_Sub1_1.anInt2195 = 0;
		} catch (@Pc(46) IOException local46) {
			Static47.aBoolean245 = true;
		}
	}

	@OriginalMember(owner = "client!qb", name = "d", descriptor = "(B)V")
	public static void method2455() {
		Static153.aClass1_Sub8_Sub1_2.method1657();
		@Pc(11) int local11 = Static153.aClass1_Sub8_Sub1_2.method1656(1);
		if (local11 == 0) {
			return;
		}
		@Pc(19) int local19 = Static153.aClass1_Sub8_Sub1_2.method1656(2);
		if (local19 == 0) {
			Static147.anIntArray350[Static156.anInt3694++] = 2047;
			return;
		}
		@Pc(40) int local40;
		@Pc(50) int local50;
		if (local19 == 1) {
			local40 = Static153.aClass1_Sub8_Sub1_2.method1656(3);
			Static64.aClass1_Sub2_Sub2_Sub2_Sub2_1.method1883(false, local40);
			local50 = Static153.aClass1_Sub8_Sub1_2.method1656(1);
			if (local50 == 1) {
				Static147.anIntArray350[Static156.anInt3694++] = 2047;
			}
			return;
		}
		@Pc(92) int local92;
		if (local19 == 2) {
			local40 = Static153.aClass1_Sub8_Sub1_2.method1656(3);
			Static64.aClass1_Sub2_Sub2_Sub2_Sub2_1.method1883(true, local40);
			local50 = Static153.aClass1_Sub8_Sub1_2.method1656(3);
			Static64.aClass1_Sub2_Sub2_Sub2_Sub2_1.method1883(true, local50);
			local92 = Static153.aClass1_Sub8_Sub1_2.method1656(1);
			if (local92 == 1) {
				Static147.anIntArray350[Static156.anInt3694++] = 2047;
			}
		} else if (local19 == 3) {
			local40 = Static153.aClass1_Sub8_Sub1_2.method1656(1);
			Static156.anInt3696 = Static153.aClass1_Sub8_Sub1_2.method1656(2);
			local50 = Static153.aClass1_Sub8_Sub1_2.method1656(1);
			if (local50 == 1) {
				Static147.anIntArray350[Static156.anInt3694++] = 2047;
			}
			local92 = Static153.aClass1_Sub8_Sub1_2.method1656(7);
			@Pc(152) int local152 = Static153.aClass1_Sub8_Sub1_2.method1656(7);
			Static64.aClass1_Sub2_Sub2_Sub2_Sub2_1.method1884(local40 == 1, local152, local92);
		}
	}

	@OriginalMember(owner = "client!qb", name = "d", descriptor = "(I)V")
	public static void method2456() {
		aLongArray7 = null;
		aClass13_1175 = null;
		aClass13_1174 = null;
		aClass13_1176 = null;
	}

	@OriginalMember(owner = "client!qb", name = "a", descriptor = "(II[II[Lclient!id;[I)V")
	public static void method2459(@OriginalArg(0) int arg0, @OriginalArg(2) int[] arg1, @OriginalArg(3) int arg2, @OriginalArg(4) Class36[] arg3, @OriginalArg(5) int[] arg4) {
		if (arg2 >= arg0) {
			return;
		}
		@Pc(17) int local17 = arg2 - 1;
		@Pc(21) int local21 = arg0 + 1;
		@Pc(28) int local28 = (arg2 + arg0) / 2;
		@Pc(32) Class36 local32 = arg3[local28];
		arg3[local28] = arg3[arg2];
		arg3[arg2] = local32;
		while (local21 > local17) {
			@Pc(46) boolean local46 = true;
			@Pc(49) int local49;
			@Pc(63) int local63;
			@Pc(66) int local66;
			do {
				local21--;
				for (local49 = 0; local49 < 4; local49++) {
					if (arg4[local49] == 2) {
						local63 = arg3[local21].anInt2128;
						local66 = local32.anInt2128;
					} else if (arg4[local49] == 1) {
						local63 = arg3[local21].anInt2133;
						if (local63 == -1 && arg1[local49] == 1) {
							local63 = 2001;
						}
						local66 = local32.anInt2133;
						if (local66 == -1 && arg1[local49] == 1) {
							local66 = 2001;
						}
					} else if (arg4[local49] == 3) {
						local63 = arg3[local21].aBoolean167 ? 1 : 0;
						local66 = local32.aBoolean167 ? 1 : 0;
					} else {
						local66 = local32.anInt2134;
						local63 = arg3[local21].anInt2134;
					}
					if (local63 != local66) {
						if ((arg1[local49] != 1 || local63 <= local66) && (arg1[local49] != 0 || local66 <= local63)) {
							local46 = false;
						}
						break;
					}
					if (local49 == 3) {
						local46 = false;
					}
				}
			} while (local46);
			local46 = true;
			do {
				local17++;
				for (local49 = 0; local49 < 4; local49++) {
					if (arg4[local49] == 2) {
						local63 = arg3[local17].anInt2128;
						local66 = local32.anInt2128;
					} else if (arg4[local49] == 1) {
						local66 = local32.anInt2133;
						local63 = arg3[local17].anInt2133;
						if (local63 == -1 && arg1[local49] == 1) {
							local63 = 2001;
						}
						if (local66 == -1 && arg1[local49] == 1) {
							local66 = 2001;
						}
					} else if (arg4[local49] == 3) {
						local66 = local32.aBoolean167 ? 1 : 0;
						local63 = arg3[local17].aBoolean167 ? 1 : 0;
					} else {
						local63 = arg3[local17].anInt2134;
						local66 = local32.anInt2134;
					}
					if (local63 != local66) {
						if ((arg1[local49] != 1 || local63 >= local66) && (arg1[local49] != 0 || local66 >= local63)) {
							local46 = false;
						}
						break;
					}
					if (local49 == 3) {
						local46 = false;
					}
				}
			} while (local46);
			if (local17 < local21) {
				@Pc(336) Class36 local336 = arg3[local17];
				arg3[local17] = arg3[local21];
				arg3[local21] = local336;
			}
		}
		method2459(local21, arg1, arg2, arg3, arg4);
		method2459(arg0, arg1, local21 + 1, arg3, arg4);
	}
}
