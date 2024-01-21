import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static50 {

	@OriginalMember(owner = "client!jc", name = "n", descriptor = "I")
	public static int anInt1407;

	@OriginalMember(owner = "client!jc", name = "u", descriptor = "Lclient!ta;")
	public static Class36_Sub1 aClass36_Sub1_12;

	@OriginalMember(owner = "client!jc", name = "f", descriptor = "Lclient!mb;")
	public static Class2_Sub5_Sub1 aClass2_Sub5_Sub1_2 = new Class2_Sub5_Sub1(5000);

	@OriginalMember(owner = "client!jc", name = "h", descriptor = "I")
	public static int anInt1402 = 0;

	@OriginalMember(owner = "client!jc", name = "m", descriptor = "J")
	public static volatile long aLong37 = 0L;

	@OriginalMember(owner = "client!jc", name = "o", descriptor = "I")
	public static int anInt1408 = 0;

	@OriginalMember(owner = "client!jc", name = "p", descriptor = "Lclient!ke;")
	public static Class39 aClass39_623 = Static2.method66("Aus");

	@OriginalMember(owner = "client!jc", name = "q", descriptor = "[I")
	public static int[] anIntArray193 = new int[16384];

	@OriginalMember(owner = "client!jc", name = "r", descriptor = "Lclient!qd;")
	public static Class54 aClass54_13 = new Class54(50);

	@OriginalMember(owner = "client!jc", name = "s", descriptor = "Lclient!ke;")
	public static Class39 aClass39_624 = Static2.method66(" steht bereits auf Ihrer Ignorieren)2Liste(Q");

	@OriginalMember(owner = "client!jc", name = "t", descriptor = "Lclient!ke;")
	public static Class39 aClass39_625 = Static2.method66("(X");

	@OriginalMember(owner = "client!jc", name = "v", descriptor = "Lclient!ke;")
	public static Class39 aClass39_626 = Static2.method66("leuchten1:");

	@OriginalMember(owner = "client!jc", name = "a", descriptor = "(IILclient!ta;)V")
	public static void method950(@OriginalArg(0) int arg0, @OriginalArg(2) Class36_Sub1 arg1) {
		if (Static77.aClass2_Sub5_4 == null) {
			Static84.method2049(255, null, 0, 255, (byte) 0, true);
			Static9.aClass36_Sub1Array1[arg0] = arg1;
		} else {
			Static77.aClass2_Sub5_4.anInt1772 = arg0 * 4 + 5;
			@Pc(16) int local16 = Static77.aClass2_Sub5_4.method1276();
			arg1.method1783(local16);
		}
	}

	@OriginalMember(owner = "client!jc", name = "a", descriptor = "(Z)V")
	public static void method951() {
		for (@Pc(3) int local3 = 0; local3 < Static1.anInt1; local3++) {
			@Pc(9) int local9 = Static8.anIntArray26[local3]--;
			if (Static8.anIntArray26[local3] >= -10) {
				@Pc(80) Class56 local80 = Static66.aClass56Array1[local3];
				if (local80 == null) {
					local80 = Static116.method1668(Static58.aClass36_Sub1_14, Static54.anIntArray210[local3]);
					if (local80 == null) {
						continue;
					}
					Static8.anIntArray26[local3] += local80.method1669();
					Static66.aClass56Array1[local3] = local80;
				}
				if (Static8.anIntArray26[local3] < 0) {
					@Pc(110) int local110 = Static25.anInt723;
					if (Static79.anIntArray335[local3] != 0) {
						@Pc(125) int local125 = (Static79.anIntArray335[local3] & 0xFF) * 128;
						@Pc(133) int local133 = Static79.anIntArray335[local3] >> 16 & 0xFF;
						@Pc(142) int local142 = local133 * 128 + 64 - Static28.aClass2_Sub1_Sub2_Sub3_Sub1_1.anInt2896;
						@Pc(150) int local150 = Static79.anIntArray335[local3] >> 8 & 0xFF;
						@Pc(159) int local159 = local150 * 128 + 64 - Static28.aClass2_Sub1_Sub2_Sub3_Sub1_1.anInt2899;
						if (local142 < 0) {
							local142 = -local142;
						}
						if (local159 < 0) {
							local159 = -local159;
						}
						@Pc(179) int local179 = local142 + local159 - 128;
						if (local179 > local125) {
							Static8.anIntArray26[local3] = -100;
							continue;
						}
						if (local179 < 0) {
							local179 = 0;
						}
						local110 = (local125 - local179) * Static25.anInt723 / local125;
					}
					@Pc(210) Class2_Sub8_Sub1 local210 = local80.method1667().method1622(Static82.aClass61_1);
					@Pc(215) Class2_Sub4_Sub1 local215 = Static111.method474(local210, local110);
					local215.method484(Static23.anIntArray70[local3] - 1);
					Static10.aClass2_Sub4_Sub2_1.method1659(local215);
					Static8.anIntArray26[local3] = -100;
				}
			} else {
				Static1.anInt1--;
				for (@Pc(23) int local23 = local3; local23 < Static1.anInt1; local23++) {
					Static54.anIntArray210[local23] = Static54.anIntArray210[local23 + 1];
					Static66.aClass56Array1[local23] = Static66.aClass56Array1[local23 + 1];
					Static23.anIntArray70[local23] = Static23.anIntArray70[local23 + 1];
					Static8.anIntArray26[local23] = Static8.anIntArray26[local23 + 1];
					Static79.anIntArray335[local23] = Static79.anIntArray335[local23 + 1];
				}
				local3--;
			}
		}
		if (Static31.anInt1773 <= 0) {
			return;
		}
		Static31.anInt1773 -= 20;
		if (Static31.anInt1773 < 0) {
			Static31.anInt1773 = 0;
		}
		if (Static31.anInt1773 == 0 && Static79.anInt2768 != 0 && Static38.anInt1156 != -1) {
			Static73.method1502(0, aClass36_Sub1_12, Static79.anInt2768, Static38.anInt1156);
		}
	}

	@OriginalMember(owner = "client!jc", name = "a", descriptor = "(IIIII)V")
	public static void method952(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		for (@Pc(6) Class2_Sub10 local6 = (Class2_Sub10) Static12.aClass34_9.method872(); local6 != null; local6 = (Class2_Sub10) Static12.aClass34_9.method879()) {
			if (local6.anInt2059 != -1 || local6.anIntArray258 != null) {
				@Pc(18) int local18 = 0;
				if (arg2 > local6.anInt2064) {
					local18 = arg2 - local6.anInt2064;
				} else if (arg2 < local6.anInt2056) {
					local18 = local6.anInt2056 - arg2;
				}
				if (local6.anInt2071 < arg3) {
					local18 += arg3 - local6.anInt2071;
				} else if (arg3 < local6.anInt2074) {
					local18 += local6.anInt2074 - arg3;
				}
				if (local6.anInt2053 < local18 - 64 || Static25.anInt723 == 0 || arg1 != local6.anInt2060) {
					if (local6.aClass2_Sub4_Sub1_2 != null) {
						Static10.aClass2_Sub4_Sub2_1.method1662(local6.aClass2_Sub4_Sub1_2);
						local6.aClass2_Sub4_Sub1_2 = null;
					}
					if (local6.aClass2_Sub4_Sub1_1 != null) {
						Static10.aClass2_Sub4_Sub2_1.method1662(local6.aClass2_Sub4_Sub1_1);
						local6.aClass2_Sub4_Sub1_1 = null;
					}
				} else {
					local18 -= 64;
					if (local18 < 0) {
						local18 = 0;
					}
					@Pc(134) int local134 = (local6.anInt2053 - local18) * Static25.anInt723 / local6.anInt2053;
					if (local6.aClass2_Sub4_Sub1_2 != null) {
						local6.aClass2_Sub4_Sub1_2.method480(local134);
					} else if (local6.anInt2059 >= 0) {
						@Pc(146) Class56 local146 = Static116.method1668(Static58.aClass36_Sub1_14, local6.anInt2059);
						if (local146 != null) {
							@Pc(153) Class2_Sub8_Sub1 local153 = local146.method1667().method1622(Static82.aClass61_1);
							@Pc(158) Class2_Sub4_Sub1 local158 = Static111.method474(local153, local134);
							local158.method484(-1);
							Static10.aClass2_Sub4_Sub2_1.method1659(local158);
							local6.aClass2_Sub4_Sub1_2 = local158;
						}
					}
					if (local6.aClass2_Sub4_Sub1_1 != null) {
						local6.aClass2_Sub4_Sub1_1.method480(local134);
						if (!local6.aClass2_Sub4_Sub1_1.method486()) {
							local6.aClass2_Sub4_Sub1_1 = null;
						}
					} else if (local6.anIntArray258 != null && (local6.anInt2069 -= arg0) <= 0) {
						@Pc(208) int local208 = (int) ((double) local6.anIntArray258.length * Math.random());
						@Pc(216) Class56 local216 = Static116.method1668(Static58.aClass36_Sub1_14, local6.anIntArray258[local208]);
						if (local216 != null) {
							@Pc(223) Class2_Sub8_Sub1 local223 = local216.method1667().method1622(Static82.aClass61_1);
							@Pc(228) Class2_Sub4_Sub1 local228 = Static111.method474(local223, local134);
							local228.method484(0);
							Static10.aClass2_Sub4_Sub2_1.method1659(local228);
							local6.anInt2069 = (int) (Math.random() * (double) (local6.anInt2055 - local6.anInt2057)) + local6.anInt2057;
							local6.aClass2_Sub4_Sub1_1 = local228;
						}
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!jc", name = "a", descriptor = "(I)V")
	public static void method953() {
		Static60.aClass51_36.method1970();
	}

	@OriginalMember(owner = "client!jc", name = "b", descriptor = "(I)V")
	public static void method954() {
		anIntArray193 = null;
		aClass39_625 = null;
		aClass36_Sub1_12 = null;
		aClass39_624 = null;
		aClass2_Sub5_Sub1_2 = null;
		aClass54_13 = null;
		aClass39_623 = null;
		aClass39_626 = null;
	}
}
