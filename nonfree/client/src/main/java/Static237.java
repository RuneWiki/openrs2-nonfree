import java.awt.datatransfer.DataFlavor;
import java.awt.datatransfer.Transferable;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static237 {

	@OriginalMember(owner = "client!hw", name = "a", descriptor = "Lclient!oga;")
	private static Class267 aClass267_3;

	@OriginalMember(owner = "client!hw", name = "h", descriptor = "Lclient!kq;")
	private static Class199 aClass199_3;

	@OriginalMember(owner = "client!hw", name = "j", descriptor = "Lclient!wt;")
	private static Class4_Sub55 aClass4_Sub55_2;

	@OriginalMember(owner = "client!hw", name = "o", descriptor = "[I")
	private static int[] anIntArray259;

	@OriginalMember(owner = "client!hw", name = "p", descriptor = "[J")
	private static long[] aLongArray5;

	@OriginalMember(owner = "client!hw", name = "w", descriptor = "Lclient!kq;")
	private static Class199 aClass199_4;

	@OriginalMember(owner = "client!hw", name = "x", descriptor = "[Ljava/lang/String;")
	private static String[] aStringArray18;

	@OriginalMember(owner = "client!hw", name = "E", descriptor = "Lclient!eb;")
	private static Class81 aClass81_1;

	@OriginalMember(owner = "client!hw", name = "b", descriptor = "[I")
	private static final int[] anIntArray257 = new int[1000];

	@OriginalMember(owner = "client!hw", name = "d", descriptor = "[J")
	private static final long[] aLongArray4 = new long[1000];

	@OriginalMember(owner = "client!hw", name = "i", descriptor = "[I")
	private static final int[] anIntArray258 = new int[5];

	@OriginalMember(owner = "client!hw", name = "l", descriptor = "Lclient!tja;")
	public static final Class352 aClass352_33 = new Class352(4);

	@OriginalMember(owner = "client!hw", name = "q", descriptor = "I")
	private static int anInt3702 = 0;

	@OriginalMember(owner = "client!hw", name = "r", descriptor = "[Ljava/lang/String;")
	private static final String[] aStringArray17 = new String[1000];

	@OriginalMember(owner = "client!hw", name = "t", descriptor = "[I")
	private static final int[] anIntArray260 = new int[3];

	@OriginalMember(owner = "client!hw", name = "z", descriptor = "[Lclient!tga;")
	private static final Class350[] aClass350Array1 = new Class350[50];

	@OriginalMember(owner = "client!hw", name = "A", descriptor = "I")
	private static int anInt3707 = 0;

	@OriginalMember(owner = "client!hw", name = "B", descriptor = "[[I")
	private static final int[][] anIntArrayArray20 = new int[5][5000];

	@OriginalMember(owner = "client!hw", name = "C", descriptor = "I")
	private static int anInt3708 = 0;

	@OriginalMember(owner = "client!hw", name = "D", descriptor = "I")
	private static int anInt3709 = 0;

	@OriginalMember(owner = "client!hw", name = "F", descriptor = "I")
	private static int anInt3710 = 0;

	@OriginalMember(owner = "client!hw", name = "a", descriptor = "(Lclient!is;I)V")
	private static void method3377(@OriginalArg(0) Class4_Sub25 arg0, @OriginalArg(1) int arg1) {
		@Pc(2) Object[] local2 = arg0.anObjectArray2;
		@Pc(8) int local8 = (Integer) local2[0];
		@Pc(12) Class4_Sub5_Sub4 local12 = Static567.method7516(local8);
		if (local12 == null) {
			return;
		}
		anIntArray259 = new int[local12.anInt1084];
		@Pc(21) int local21 = 0;
		aStringArray18 = new String[local12.anInt1085];
		@Pc(27) int local27 = 0;
		aLongArray5 = new long[local12.anInt1083];
		@Pc(33) int local33 = 0;
		for (@Pc(35) int local35 = 1; local35 < local2.length; local35++) {
			if (local2[local35] instanceof Integer) {
				@Pc(47) int local47 = (Integer) local2[local35];
				if (local47 == -2147483647) {
					local47 = arg0.anInt4282;
				}
				if (local47 == -2147483646) {
					local47 = arg0.anInt4279;
				}
				if (local47 == -2147483645) {
					local47 = arg0.aClass199_6 == null ? -1 : arg0.aClass199_6.anInt5041;
				}
				if (local47 == -2147483644) {
					local47 = arg0.anInt4284;
				}
				if (local47 == -2147483643) {
					local47 = arg0.aClass199_6 == null ? -1 : arg0.aClass199_6.anInt5005;
				}
				if (local47 == -2147483642) {
					local47 = arg0.aClass199_5 == null ? -1 : arg0.aClass199_5.anInt5041;
				}
				if (local47 == -2147483641) {
					local47 = arg0.aClass199_5 == null ? -1 : arg0.aClass199_5.anInt5005;
				}
				if (local47 == -2147483640) {
					local47 = arg0.anInt4281;
				}
				if (local47 == -2147483639) {
					local47 = arg0.anInt4283;
				}
				anIntArray259[local21++] = local47;
			} else if (local2[local35] instanceof String) {
				@Pc(141) String local141 = (String) local2[local35];
				if (local141.equals("event_opbase")) {
					local141 = arg0.aString41;
				}
				aStringArray18[local27++] = local141;
			} else if (local2[local35] instanceof Long) {
				@Pc(165) long local165 = (Long) local2[local35];
				aLongArray5[local33++] = local165;
			}
		}
		anInt3710 = arg0.anInt4286;
		method3381(local12, arg1);
	}

	@OriginalMember(owner = "client!hw", name = "a", descriptor = "(I)V")
	private static void method3378(@OriginalArg(0) int arg0) {
		@Pc(3) Class199 local3 = Static569.method7534(arg0);
		if (local3 == null) {
			return;
		}
		@Pc(9) int local9 = arg0 >>> 16;
		@Pc(13) Class199[] local13 = Static269.aClass199ArrayArray1[local9];
		if (local13 == null) {
			@Pc(19) Class199[] local19 = Static392.aClass199ArrayArray2[local9];
			@Pc(22) int local22 = local19.length;
			local13 = Static269.aClass199ArrayArray1[local9] = new Class199[local22];
			Static685.method6469(local19, 0, local13, 0, local19.length);
		}
		@Pc(38) int local38;
		for (local38 = 0; local38 < local13.length && local13[local38] != local3; local38++) {
		}
		if (local38 >= local13.length) {
			return;
		}
		Static685.method6469(local13, local38 + 1, local13, local38, local13.length - local38 - 1);
		local13[local13.length - 1] = local3;
	}

	@OriginalMember(owner = "client!hw", name = "b", descriptor = "(I)I")
	private static int method3379(@OriginalArg(0) int arg0) {
		@Pc(4) Class347 local4 = Static315.aClass135_1.method3025(arg0);
		if (local4 == null) {
			throw new RuntimeException("sr-c112");
		}
		@Pc(21) Integer local21 = aClass267_3.method5942(Static333.aClass234_5.anInt5621 << 16 | arg0);
		if (local21 == null) {
			return local4.aChar4 == 'i' || local4.aChar4 == '1' ? 0 : -1;
		} else {
			return local21;
		}
	}

	@OriginalMember(owner = "client!hw", name = "a", descriptor = "(IZ)V")
	public static void method3380() {
	}

	@OriginalMember(owner = "client!hw", name = "a", descriptor = "(Lclient!bo;I)V")
	private static void method3381(@OriginalArg(0) Class4_Sub5_Sub4 arg0, @OriginalArg(1) int arg1) {
		anInt3702 = 0;
		anInt3709 = 0;
		@Pc(5) int local5 = -1;
		@Pc(8) int[] local8 = arg0.anIntArray74;
		@Pc(11) int[] local11 = arg0.anIntArray75;
		@Pc(13) byte local13 = -1;
		anInt3707 = 0;
		@Pc(639) int local639;
		try {
			@Pc(17) int local17 = 0;
			label333: while (true) {
				local17++;
				if (local17 > arg1) {
					throw new RuntimeException("slow");
				}
				local5++;
				@Pc(31) int local31 = local8[local5];
				if (local31 >= 150) {
					@Pc(1134) boolean local1134;
					if (local11[local5] == 1) {
						local1134 = true;
					} else {
						local1134 = false;
					}
					if (local31 >= 150 && local31 < 5000) {
						method3390(local31, local1134);
					} else if (local31 >= 5000 && local31 < 10000) {
						method3382(local31, local1134);
					} else {
						throw new IllegalStateException("Command: " + local31);
					}
				} else if (local31 == 0) {
					anIntArray257[anInt3702++] = local11[local5];
				} else {
					@Pc(54) int local54;
					if (local31 == 1) {
						local54 = local11[local5];
						anIntArray257[anInt3702++] = Static526.aClass293_1.anIntArray509[local54];
					} else if (local31 == 2) {
						local54 = local11[local5];
						Static526.aClass293_1.method6531(anIntArray257[--anInt3702], local54);
					} else if (local31 == 3) {
						aStringArray17[anInt3709++] = arg0.aStringArray5[local5];
					} else if (local31 == 6) {
						local5 += local11[local5];
					} else if (local31 == 7) {
						anInt3702 -= 2;
						if (anIntArray257[anInt3702] != anIntArray257[anInt3702 + 1]) {
							local5 += local11[local5];
						}
					} else if (local31 == 8) {
						anInt3702 -= 2;
						if (anIntArray257[anInt3702] == anIntArray257[anInt3702 + 1]) {
							local5 += local11[local5];
						}
					} else if (local31 == 9) {
						anInt3702 -= 2;
						if (anIntArray257[anInt3702] < anIntArray257[anInt3702 + 1]) {
							local5 += local11[local5];
						}
					} else if (local31 == 10) {
						anInt3702 -= 2;
						if (anIntArray257[anInt3702] > anIntArray257[anInt3702 + 1]) {
							local5 += local11[local5];
						}
					} else if (local31 == 21) {
						if (anInt3707 == 0) {
							return;
						}
						@Pc(216) Class350 local216 = aClass350Array1[--anInt3707];
						arg0 = local216.aClass4_Sub5_Sub4_1;
						local8 = arg0.anIntArray74;
						local11 = arg0.anIntArray75;
						local5 = local216.anInt8899;
						anIntArray259 = local216.anIntArray635;
						aStringArray18 = local216.aStringArray45;
						aLongArray5 = local216.aLongArray19;
					} else if (local31 == 25) {
						local54 = local11[local5];
						anIntArray257[anInt3702++] = Static526.aClass293_1.method6529(local54);
					} else if (local31 == 27) {
						local54 = local11[local5];
						Static526.aClass293_1.method6538(anIntArray257[--anInt3702], local54);
					} else if (local31 == 31) {
						anInt3702 -= 2;
						if (anIntArray257[anInt3702] <= anIntArray257[anInt3702 + 1]) {
							local5 += local11[local5];
						}
					} else if (local31 == 32) {
						anInt3702 -= 2;
						if (anIntArray257[anInt3702] >= anIntArray257[anInt3702 + 1]) {
							local5 += local11[local5];
						}
					} else if (local31 == 33) {
						anIntArray257[anInt3702++] = anIntArray259[local11[local5]];
					} else if (local31 == 34) {
						anIntArray259[local11[local5]] = anIntArray257[--anInt3702];
					} else if (local31 == 35) {
						aStringArray17[anInt3709++] = aStringArray18[local11[local5]];
					} else if (local31 == 36) {
						aStringArray18[local11[local5]] = aStringArray17[--anInt3709];
					} else if (local31 == 37) {
						local54 = local11[local5];
						anInt3709 -= local54;
						@Pc(403) String local403 = Static211.method8992(anInt3709, local54, aStringArray17);
						aStringArray17[anInt3709++] = local403;
					} else if (local31 == 38) {
						anInt3702--;
					} else if (local31 == 39) {
						anInt3709--;
					} else if (local31 == 40) {
						local54 = local11[local5];
						@Pc(439) Class4_Sub5_Sub4 local439 = Static567.method7516(local54);
						if (local439 == null) {
							throw new RuntimeException();
						}
						@Pc(449) int[] local449 = new int[local439.anInt1084];
						@Pc(453) String[] local453 = new String[local439.anInt1085];
						@Pc(457) long[] local457 = new long[local439.anInt1083];
						for (@Pc(459) int local459 = 0; local459 < local439.anInt1086; local459++) {
							local449[local459] = anIntArray257[anInt3702 + local459 - local439.anInt1086];
						}
						for (@Pc(478) int local478 = 0; local478 < local439.anInt1088; local478++) {
							local453[local478] = aStringArray17[anInt3709 + local478 - local439.anInt1088];
						}
						for (@Pc(497) int local497 = 0; local497 < local439.anInt1087; local497++) {
							local457[local497] = aLongArray4[anInt3708 + local497 - local439.anInt1087];
						}
						anInt3702 -= local439.anInt1086;
						anInt3709 -= local439.anInt1088;
						anInt3708 -= local439.anInt1087;
						@Pc(533) Class350 local533 = new Class350();
						local533.aClass4_Sub5_Sub4_1 = arg0;
						local533.anInt8899 = local5;
						local533.anIntArray635 = anIntArray259;
						local533.aStringArray45 = aStringArray18;
						local533.aLongArray19 = aLongArray5;
						if (anInt3707 >= aClass350Array1.length) {
							throw new RuntimeException();
						}
						aClass350Array1[anInt3707++] = local533;
						arg0 = local439;
						local8 = local439.anIntArray74;
						local11 = local439.anIntArray75;
						local5 = -1;
						anIntArray259 = local449;
						aStringArray18 = local453;
						aLongArray5 = local457;
					} else if (local31 == 42) {
						anIntArray257[anInt3702++] = Static509.anIntArray546[local11[local5]];
					} else if (local31 == 43) {
						local54 = local11[local5];
						Static509.anIntArray546[local54] = anIntArray257[--anInt3702];
						Static345.method4662(local54);
						Static550.aBoolean656 |= Static51.aBooleanArray3[local54];
					} else if (local31 == 44) {
						local54 = local11[local5] >> 16;
						local639 = local11[local5] & 0xFFFF;
						@Pc(647) int local647 = anIntArray257[--anInt3702];
						if (local647 >= 0 && local647 <= 5000) {
							anIntArray258[local54] = local647;
							@Pc(662) byte local662 = -1;
							if (local639 == 105) {
								local662 = 0;
							}
							@Pc(669) int local669 = 0;
							while (true) {
								if (local669 >= local647) {
									continue label333;
								}
								anIntArrayArray20[local54][local669] = local662;
								local669++;
							}
						}
						throw new RuntimeException();
					} else if (local31 == 45) {
						local54 = local11[local5];
						local639 = anIntArray257[--anInt3702];
						if (local639 < 0 || local639 >= anIntArray258[local54]) {
							throw new RuntimeException();
						}
						anIntArray257[anInt3702++] = anIntArrayArray20[local54][local639];
					} else if (local31 == 46) {
						local54 = local11[local5];
						anInt3702 -= 2;
						local639 = anIntArray257[anInt3702];
						if (local639 < 0 || local639 >= anIntArray258[local54]) {
							throw new RuntimeException();
						}
						anIntArrayArray20[local54][local639] = anIntArray257[anInt3702 + 1];
					} else if (local31 == 47) {
						@Pc(766) String local766 = Static89.aStringArray9[local11[local5]];
						if (local766 == null) {
							local766 = "null";
						}
						aStringArray17[anInt3709++] = local766;
					} else if (local31 == 48) {
						local54 = local11[local5];
						Static89.aStringArray9[local54] = aStringArray17[--anInt3709];
						Static670.method6028(local54);
					} else if (local31 == 51) {
						@Pc(810) Class66 local810 = arg0.aClass66Array1[local11[local5]];
						@Pc(823) Class4_Sub24 local823 = (Class4_Sub24) local810.method1994((long) anIntArray257[--anInt3702]);
						if (local823 != null) {
							local5 += local823.anInt4156;
						}
					} else if (local31 == 54) {
						aLongArray4[anInt3708++] = arg0.aLongArray1[local5];
					} else if (local31 == 55) {
						anInt3708--;
					} else if (local31 == 66) {
						aLongArray4[anInt3708++] = aLongArray5[local11[local5]];
					} else if (local31 == 67) {
						aLongArray5[local11[local5]] = aLongArray4[--anInt3708];
					} else if (local31 == 68) {
						anInt3708 -= 2;
						if (aLongArray4[anInt3708] != aLongArray4[anInt3708 + 1]) {
							local5 += local11[local5];
						}
					} else if (local31 == 69) {
						anInt3708 -= 2;
						if (aLongArray4[anInt3708] == aLongArray4[anInt3708 + 1]) {
							local5 += local11[local5];
						}
					} else if (local31 == 70) {
						anInt3708 -= 2;
						if (aLongArray4[anInt3708] < aLongArray4[anInt3708 + 1]) {
							local5 += local11[local5];
						}
					} else if (local31 == 71) {
						anInt3708 -= 2;
						if (aLongArray4[anInt3708] > aLongArray4[anInt3708 + 1]) {
							local5 += local11[local5];
						}
					} else if (local31 == 72) {
						anInt3708 -= 2;
						if (aLongArray4[anInt3708] <= aLongArray4[anInt3708 + 1]) {
							local5 += local11[local5];
						}
					} else if (local31 == 73) {
						anInt3708 -= 2;
						if (aLongArray4[anInt3708] >= aLongArray4[anInt3708 + 1]) {
							local5 += local11[local5];
						}
					} else if (local31 == 86) {
						if (anIntArray257[--anInt3702] == 1) {
							local5 += local11[local5];
						}
					} else if (local31 == 87) {
						if (anIntArray257[--anInt3702] == 0) {
							local5 += local11[local5];
						}
					} else if (local31 == 112) {
						anIntArray257[anInt3702++] = method3379(local11[local5]);
					} else if (local31 == 113) {
						anIntArray257[anInt3702++] = method3387(local11[local5]);
					} else if (local31 == 114) {
						aLongArray4[anInt3708++] = method3392(local11[local5]);
					} else if (local31 == 115) {
						aStringArray17[anInt3709++] = method3383(local11[local5]);
					}
				}
			}
		} catch (@Pc(1169) Exception local1169) {
			@Pc(1188) StringBuffer local1188;
			if (arg0.aString10 == null) {
				local1188 = new StringBuffer(30);
				local1188.append("CS2: ").append(arg0.aLong307).append(" ");
				for (local639 = anInt3707 - 1; local639 >= 0; local639--) {
					local1188.append("v: ").append(aClass350Array1[local639].aClass4_Sub5_Sub4_1.aLong307).append(" ");
				}
				local1188.append("op: ").append(local13);
				Static357.method4765(local1169, local1188.toString());
			} else {
				Static417.method5293("Clientscript error in: " + arg0.aString10);
				local1188 = new StringBuffer(30);
				local1188.append("Clientscript error in: ").append(arg0.aString10).append("\n");
				for (local639 = anInt3707 - 1; local639 >= 0; local639--) {
					local1188.append("via: ").append(aClass350Array1[local639].aClass4_Sub5_Sub4_1.aString10).append("\n");
				}
				local1188.append("Op: ").append(local13).append("\n");
				@Pc(1228) String local1228 = local1169.getMessage();
				if (local1228 != null && local1228.length() > 0) {
					local1188.append("Message: ").append(local1228).append("\n");
				}
				Static357.method4765(local1169, local1188.toString());
				Static383.method8457(local1188.toString());
			}
		}
	}

	@OriginalMember(owner = "client!hw", name = "b", descriptor = "(IZ)V")
	private static void method3382(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1) {
		@Pc(52) Class4_Sub48 local52;
		@Pc(776) int local776;
		@Pc(97) int local97;
		@Pc(83) String local83;
		@Pc(175) int local175;
		@Pc(1496) boolean local1496;
		@Pc(181) String local181;
		@Pc(103) int local103;
		@Pc(89) String local89;
		if (arg0 < 5100) {
			if (arg0 == 5000) {
				anIntArray257[anInt3702++] = Static586.anInt9032;
				return;
			}
			if (arg0 == 5001) {
				anInt3702 -= 3;
				Static586.anInt9032 = anIntArray257[anInt3702];
				Static186.aClass356_4 = Static54.method1292(anIntArray257[anInt3702 + 1]);
				if (Static186.aClass356_4 == null) {
					Static186.aClass356_4 = Static226.aClass356_6;
				}
				Static77.anInt1633 = anIntArray257[anInt3702 + 2];
				local52 = Static335.method4615(Static350.aClass216_94, Static669.aClass196_2);
				local52.aClass4_Sub11_Sub1_2.method8822(Static586.anInt9032);
				local52.aClass4_Sub11_Sub1_2.method8822(Static186.aClass356_4.anInt9084);
				local52.aClass4_Sub11_Sub1_2.method8822(Static77.anInt1633);
				Static410.method5170(local52);
				return;
			}
			if (arg0 == 5002) {
				anInt3709 -= 2;
				local83 = aStringArray17[anInt3709];
				local89 = aStringArray17[anInt3709 + 1];
				anInt3702 -= 2;
				local97 = anIntArray257[anInt3702];
				local103 = anIntArray257[anInt3702 + 1];
				if (local89 == null) {
					local89 = "";
				}
				if (local89.length() > 80) {
					local89 = local89.substring(0, 80);
				}
				@Pc(125) Class4_Sub48 local125 = Static335.method4615(Static472.aClass216_119, Static669.aClass196_2);
				local125.aClass4_Sub11_Sub1_2.method8822(Static115.method2143(local83) + Static115.method2143(local89) + 2);
				local125.aClass4_Sub11_Sub1_2.method8857(local83);
				local125.aClass4_Sub11_Sub1_2.method8822(local97 - 1);
				local125.aClass4_Sub11_Sub1_2.method8822(local103);
				local125.aClass4_Sub11_Sub1_2.method8857(local89);
				Static410.method5170(local125);
				return;
			}
			@Pc(179) Class97 local179;
			if (arg0 == 5003) {
				local175 = anIntArray257[--anInt3702];
				local179 = Static465.method6461(local175);
				local181 = "";
				if (local179 != null && local179.aString20 != null) {
					local181 = local179.aString20;
				}
				aStringArray17[anInt3709++] = local181;
				return;
			}
			if (arg0 == 5004) {
				local175 = anIntArray257[--anInt3702];
				local179 = Static465.method6461(local175);
				local97 = -1;
				if (local179 != null) {
					local97 = local179.anInt2497;
				}
				anIntArray257[anInt3702++] = local97;
				return;
			}
			if (arg0 == 5005) {
				if (Static186.aClass356_4 == null) {
					anIntArray257[anInt3702++] = -1;
					return;
				}
				anIntArray257[anInt3702++] = Static186.aClass356_4.anInt9084;
				return;
			}
			@Pc(269) Class4_Sub48 local269;
			if (arg0 == 5006) {
				local175 = anIntArray257[--anInt3702];
				local269 = Static335.method4615(Static88.aClass216_34, Static669.aClass196_2);
				local269.aClass4_Sub11_Sub1_2.method8822(local175);
				Static410.method5170(local269);
				return;
			}
			if (arg0 == 5008) {
				local83 = aStringArray17[--anInt3709];
				method3384(local83, arg0);
				return;
			}
			if (arg0 == 5009) {
				anInt3709 -= 2;
				local83 = aStringArray17[anInt3709];
				local89 = aStringArray17[anInt3709 + 1];
				if (Static279.anInt4498 != 0 || (!Static197.aBoolean408 || Static263.aBoolean317) && !Static42.aBoolean75) {
					@Pc(328) Class4_Sub48 local328 = Static335.method4615(Static559.aClass216_136, Static669.aClass196_2);
					local328.aClass4_Sub11_Sub1_2.method8822(0);
					local103 = local328.aClass4_Sub11_Sub1_2.anInt10466;
					local328.aClass4_Sub11_Sub1_2.method8857(local83);
					Static519.method7021(local328.aClass4_Sub11_Sub1_2, local89);
					local328.aClass4_Sub11_Sub1_2.method8835(local328.aClass4_Sub11_Sub1_2.anInt10466 - local103);
					Static410.method5170(local328);
					return;
				}
				return;
			}
			if (arg0 == 5010) {
				local175 = anIntArray257[--anInt3702];
				local179 = Static465.method6461(local175);
				local181 = "";
				if (local179 != null && local179.aString18 != null) {
					local181 = local179.aString18;
				}
				aStringArray17[anInt3709++] = local181;
				return;
			}
			if (arg0 == 5011) {
				local175 = anIntArray257[--anInt3702];
				local179 = Static465.method6461(local175);
				local181 = "";
				if (local179 != null && local179.aString17 != null) {
					local181 = local179.aString17;
				}
				aStringArray17[anInt3709++] = local181;
				return;
			}
			if (arg0 == 5012) {
				local175 = anIntArray257[--anInt3702];
				local179 = Static465.method6461(local175);
				local97 = -1;
				if (local179 != null) {
					local97 = local179.anInt2498;
				}
				anIntArray257[anInt3702++] = local97;
				return;
			}
			if (arg0 == 5015) {
				if (Static554.aClass3_Sub1_Sub2_Sub2_Sub1_4 == null || Static554.aClass3_Sub1_Sub2_Sub2_Sub1_4.aString36 == null) {
					local83 = "";
				} else {
					local83 = Static554.aClass3_Sub1_Sub2_Sub2_Sub1_4.method3532();
				}
				aStringArray17[anInt3709++] = local83;
				return;
			}
			if (arg0 == 5016) {
				anIntArray257[anInt3702++] = Static77.anInt1633;
				return;
			}
			if (arg0 == 5017) {
				anIntArray257[anInt3702++] = Static91.method1802();
				return;
			}
			if (arg0 == 5018) {
				local175 = anIntArray257[--anInt3702];
				local179 = Static465.method6461(local175);
				local97 = 0;
				if (local179 != null) {
					local97 = local179.anInt2500;
				}
				anIntArray257[anInt3702++] = local97;
				return;
			}
			if (arg0 == 5019) {
				local175 = anIntArray257[--anInt3702];
				local179 = Static465.method6461(local175);
				local181 = "";
				if (local179 != null && local179.aString19 != null) {
					local181 = local179.aString19;
				}
				aStringArray17[anInt3709++] = local181;
				return;
			}
			if (arg0 == 5020) {
				if (Static554.aClass3_Sub1_Sub2_Sub2_Sub1_4 == null || Static554.aClass3_Sub1_Sub2_Sub2_Sub1_4.aString36 == null) {
					local83 = "";
				} else {
					local83 = Static554.aClass3_Sub1_Sub2_Sub2_Sub1_4.method3531();
				}
				aStringArray17[anInt3709++] = local83;
				return;
			}
			if (arg0 == 5023) {
				local175 = anIntArray257[--anInt3702];
				local179 = Static465.method6461(local175);
				local97 = -1;
				if (local179 != null) {
					local97 = local179.anInt2502;
				}
				anIntArray257[anInt3702++] = local97;
				return;
			}
			if (arg0 == 5024) {
				local175 = anIntArray257[--anInt3702];
				local179 = Static465.method6461(local175);
				local97 = -1;
				if (local179 != null) {
					local97 = local179.anInt2503;
				}
				anIntArray257[anInt3702++] = local97;
				return;
			}
			if (arg0 == 5025) {
				local175 = anIntArray257[--anInt3702];
				local179 = Static465.method6461(local175);
				local181 = "";
				if (local179 != null && local179.aString21 != null) {
					local181 = local179.aString21;
				}
				aStringArray17[anInt3709++] = local181;
				return;
			}
			if (arg0 == 5050) {
				local175 = anIntArray257[--anInt3702];
				aStringArray17[anInt3709++] = Static468.aClass337_1.method7426(local175).aString100;
				return;
			}
			@Pc(736) Class4_Sub5_Sub18 local736;
			if (arg0 == 5051) {
				local175 = anIntArray257[--anInt3702];
				local736 = Static468.aClass337_1.method7426(local175);
				if (local736.anIntArray549 == null) {
					anIntArray257[anInt3702++] = 0;
					return;
				}
				anIntArray257[anInt3702++] = local736.anIntArray549.length;
				return;
			}
			if (arg0 == 5052) {
				anInt3702 -= 2;
				local175 = anIntArray257[anInt3702];
				local776 = anIntArray257[anInt3702 + 1];
				@Pc(781) Class4_Sub5_Sub18 local781 = Static468.aClass337_1.method7426(local175);
				local103 = local781.anIntArray549[local776];
				anIntArray257[anInt3702++] = local103;
				return;
			}
			if (arg0 == 5053) {
				local175 = anIntArray257[--anInt3702];
				local736 = Static468.aClass337_1.method7426(local175);
				if (local736.anIntArray550 == null) {
					anIntArray257[anInt3702++] = 0;
					return;
				}
				anIntArray257[anInt3702++] = local736.anIntArray550.length;
				return;
			}
			if (arg0 == 5054) {
				anInt3702 -= 2;
				local175 = anIntArray257[anInt3702];
				local776 = anIntArray257[anInt3702 + 1];
				anIntArray257[anInt3702++] = Static468.aClass337_1.method7426(local175).anIntArray550[local776];
				return;
			}
			if (arg0 == 5055) {
				local175 = anIntArray257[--anInt3702];
				aStringArray17[anInt3709++] = Static410.aClass298_1.method6589(local175).method6415();
				return;
			}
			if (arg0 == 5056) {
				local175 = anIntArray257[--anInt3702];
				@Pc(907) Class4_Sub5_Sub16 local907 = Static410.aClass298_1.method6589(local175);
				if (local907.anIntArray498 == null) {
					anIntArray257[anInt3702++] = 0;
					return;
				}
				anIntArray257[anInt3702++] = local907.anIntArray498.length;
				return;
			}
			if (arg0 == 5057) {
				anInt3702 -= 2;
				local175 = anIntArray257[anInt3702];
				local776 = anIntArray257[anInt3702 + 1];
				anIntArray257[anInt3702++] = Static410.aClass298_1.method6589(local175).anIntArray498[local776];
				return;
			}
			if (arg0 == 5058) {
				aClass81_1 = new Class81();
				aClass81_1.anInt2221 = anIntArray257[--anInt3702];
				aClass81_1.aClass4_Sub5_Sub16_1 = Static410.aClass298_1.method6589(aClass81_1.anInt2221);
				aClass81_1.anIntArray153 = new int[aClass81_1.aClass4_Sub5_Sub16_1.method6414()];
				return;
			}
			if (arg0 == 5059) {
				local52 = Static335.method4615(Static413.aClass216_102, Static669.aClass196_2);
				local52.aClass4_Sub11_Sub1_2.method8822(0);
				local776 = local52.aClass4_Sub11_Sub1_2.anInt10466;
				local52.aClass4_Sub11_Sub1_2.method8822(0);
				local52.aClass4_Sub11_Sub1_2.method8838(aClass81_1.anInt2221);
				aClass81_1.aClass4_Sub5_Sub16_1.method6424(aClass81_1.anIntArray153, local52.aClass4_Sub11_Sub1_2);
				local52.aClass4_Sub11_Sub1_2.method8835(local52.aClass4_Sub11_Sub1_2.anInt10466 - local776);
				Static410.method5170(local52);
				return;
			}
			if (arg0 == 5060) {
				local83 = aStringArray17[--anInt3709];
				local269 = Static335.method4615(Static62.aClass216_18, Static669.aClass196_2);
				local269.aClass4_Sub11_Sub1_2.method8822(0);
				local97 = local269.aClass4_Sub11_Sub1_2.anInt10466;
				local269.aClass4_Sub11_Sub1_2.method8857(local83);
				local269.aClass4_Sub11_Sub1_2.method8838(aClass81_1.anInt2221);
				aClass81_1.aClass4_Sub5_Sub16_1.method6424(aClass81_1.anIntArray153, local269.aClass4_Sub11_Sub1_2);
				local269.aClass4_Sub11_Sub1_2.method8835(local269.aClass4_Sub11_Sub1_2.anInt10466 - local97);
				Static410.method5170(local269);
				return;
			}
			if (arg0 == 5061) {
				local52 = Static335.method4615(Static413.aClass216_102, Static669.aClass196_2);
				local52.aClass4_Sub11_Sub1_2.method8822(0);
				local776 = local52.aClass4_Sub11_Sub1_2.anInt10466;
				local52.aClass4_Sub11_Sub1_2.method8822(1);
				local52.aClass4_Sub11_Sub1_2.method8838(aClass81_1.anInt2221);
				aClass81_1.aClass4_Sub5_Sub16_1.method6424(aClass81_1.anIntArray153, local52.aClass4_Sub11_Sub1_2);
				local52.aClass4_Sub11_Sub1_2.method8835(local52.aClass4_Sub11_Sub1_2.anInt10466 - local776);
				Static410.method5170(local52);
				return;
			}
			if (arg0 == 5062) {
				anInt3702 -= 2;
				local175 = anIntArray257[anInt3702];
				local776 = anIntArray257[anInt3702 + 1];
				anIntArray257[anInt3702++] = Static468.aClass337_1.method7426(local175).aCharArray6[local776];
				return;
			}
			if (arg0 == 5063) {
				anInt3702 -= 2;
				local175 = anIntArray257[anInt3702];
				local776 = anIntArray257[anInt3702 + 1];
				anIntArray257[anInt3702++] = Static468.aClass337_1.method7426(local175).aCharArray5[local776];
				return;
			}
			if (arg0 == 5064) {
				anInt3702 -= 2;
				local175 = anIntArray257[anInt3702];
				local776 = anIntArray257[anInt3702 + 1];
				if (local776 == -1) {
					anIntArray257[anInt3702++] = -1;
					return;
				}
				anIntArray257[anInt3702++] = Static468.aClass337_1.method7426(local175).method6992((char) local776);
				return;
			}
			if (arg0 == 5065) {
				anInt3702 -= 2;
				local175 = anIntArray257[anInt3702];
				local776 = anIntArray257[anInt3702 + 1];
				if (local776 == -1) {
					anIntArray257[anInt3702++] = -1;
					return;
				}
				anIntArray257[anInt3702++] = Static468.aClass337_1.method7426(local175).method6993((char) local776);
				return;
			}
			if (arg0 == 5066) {
				local175 = anIntArray257[--anInt3702];
				anIntArray257[anInt3702++] = Static410.aClass298_1.method6589(local175).method6414();
				return;
			}
			if (arg0 == 5067) {
				anInt3702 -= 2;
				local175 = anIntArray257[anInt3702];
				local776 = anIntArray257[anInt3702 + 1];
				local97 = Static410.aClass298_1.method6589(local175).method6420(local776).anInt883;
				anIntArray257[anInt3702++] = local97;
				return;
			}
			if (arg0 == 5068) {
				anInt3702 -= 2;
				local175 = anIntArray257[anInt3702];
				local776 = anIntArray257[anInt3702 + 1];
				aClass81_1.anIntArray153[local175] = local776;
				return;
			}
			if (arg0 == 5069) {
				anInt3702 -= 2;
				local175 = anIntArray257[anInt3702];
				local776 = anIntArray257[anInt3702 + 1];
				aClass81_1.anIntArray153[local175] = local776;
				return;
			}
			if (arg0 == 5070) {
				anInt3702 -= 3;
				local175 = anIntArray257[anInt3702];
				local776 = anIntArray257[anInt3702 + 1];
				local97 = anIntArray257[anInt3702 + 2];
				@Pc(1448) Class4_Sub5_Sub16 local1448 = Static410.aClass298_1.method6589(local175);
				if (local1448.method6420(local776).anInt883 != 0) {
					throw new RuntimeException("bad command");
				}
				anIntArray257[anInt3702++] = local1448.method6425(local776, local97);
				return;
			}
			if (arg0 == 5071) {
				local83 = aStringArray17[--anInt3709];
				local1496 = anIntArray257[--anInt3702] == 1;
				Static592.method7786(local1496, local83);
				anIntArray257[anInt3702++] = Static359.anInt5450;
				return;
			}
			if (arg0 == 5072) {
				if (Static118.aShortArray33 != null && Static558.anInt8602 < Static359.anInt5450) {
					anIntArray257[anInt3702++] = Static118.aShortArray33[Static558.anInt8602++] & 0xFFFF;
					return;
				}
				anIntArray257[anInt3702++] = -1;
				return;
			}
			if (arg0 == 5073) {
				Static558.anInt8602 = 0;
				return;
			}
			if (arg0 == 5074) {
				local52 = Static335.method4615(Static413.aClass216_102, Static669.aClass196_2);
				local52.aClass4_Sub11_Sub1_2.method8822(0);
				local776 = local52.aClass4_Sub11_Sub1_2.anInt10466;
				local52.aClass4_Sub11_Sub1_2.method8822(2);
				local52.aClass4_Sub11_Sub1_2.method8838(aClass81_1.anInt2221);
				aClass81_1.aClass4_Sub5_Sub16_1.method6424(aClass81_1.anIntArray153, local52.aClass4_Sub11_Sub1_2);
				local52.aClass4_Sub11_Sub1_2.method8835(local52.aClass4_Sub11_Sub1_2.anInt10466 - local776);
				Static410.method5170(local52);
				return;
			}
			if (arg0 == 5075) {
				local52 = Static335.method4615(Static413.aClass216_102, Static669.aClass196_2);
				local52.aClass4_Sub11_Sub1_2.method8822(0);
				local776 = local52.aClass4_Sub11_Sub1_2.anInt10466;
				local52.aClass4_Sub11_Sub1_2.method8822(3);
				local52.aClass4_Sub11_Sub1_2.method8838(aClass81_1.anInt2221);
				aClass81_1.aClass4_Sub5_Sub16_1.method6424(aClass81_1.anIntArray153, local52.aClass4_Sub11_Sub1_2);
				local52.aClass4_Sub11_Sub1_2.method8835(local52.aClass4_Sub11_Sub1_2.anInt10466 - local776);
				Static410.method5170(local52);
				return;
			}
		} else if (arg0 < 5200) {
			if (arg0 == 5100) {
				if (Static231.aClass102_6.method4311(86)) {
					anIntArray257[anInt3702++] = 1;
					return;
				}
				anIntArray257[anInt3702++] = 0;
				return;
			}
			if (arg0 == 5101) {
				if (Static231.aClass102_6.method4311(82)) {
					anIntArray257[anInt3702++] = 1;
					return;
				}
				anIntArray257[anInt3702++] = 0;
				return;
			}
			if (arg0 == 5102) {
				if (Static231.aClass102_6.method4311(81)) {
					anIntArray257[anInt3702++] = 1;
					return;
				}
				anIntArray257[anInt3702++] = 0;
				return;
			}
		} else {
			@Pc(2931) int local2931;
			@Pc(2205) boolean local2205;
			if (arg0 < 5300) {
				if (arg0 == 5200) {
					Static308.method8522(anIntArray257[--anInt3702]);
					return;
				}
				if (arg0 == 5201) {
					anIntArray257[anInt3702++] = Static415.method5236();
					return;
				}
				if (arg0 == 5205) {
					Static408.method5157(-1, anIntArray257[--anInt3702], -1, false);
					return;
				}
				@Pc(1794) Class4_Sub5_Sub3 local1794;
				if (arg0 == 5206) {
					local175 = anIntArray257[--anInt3702];
					local1794 = Static154.method468(local175 >> 14 & 0x3FFF, local175 & 0x3FFF);
					if (local1794 == null) {
						anIntArray257[anInt3702++] = -1;
						return;
					}
					anIntArray257[anInt3702++] = local1794.anInt874;
					return;
				}
				@Pc(1827) Class4_Sub5_Sub3 local1827;
				if (arg0 == 5207) {
					local1827 = Static154.method454(anIntArray257[--anInt3702]);
					if (local1827 != null && local1827.aString8 != null) {
						aStringArray17[anInt3709++] = local1827.aString8;
						return;
					}
					aStringArray17[anInt3709++] = "";
					return;
				}
				if (arg0 == 5208) {
					anIntArray257[anInt3702++] = Static642.anInt10085;
					anIntArray257[anInt3702++] = Static601.anInt9245;
					return;
				}
				if (arg0 == 5209) {
					anIntArray257[anInt3702++] = Static253.anInt4127 + Static154.anInt437;
					anIntArray257[anInt3702++] = Static379.anInt5638 + Static154.anInt439;
					return;
				}
				if (arg0 == 5210) {
					local175 = anIntArray257[--anInt3702];
					local1794 = Static154.method454(local175);
					if (local1794 == null) {
						anIntArray257[anInt3702++] = 0;
						anIntArray257[anInt3702++] = 0;
						return;
					}
					anIntArray257[anInt3702++] = local1794.anInt867 >> 14 & 0x3FFF;
					anIntArray257[anInt3702++] = local1794.anInt867 & 0x3FFF;
					return;
				}
				if (arg0 == 5211) {
					local175 = anIntArray257[--anInt3702];
					local1794 = Static154.method454(local175);
					if (local1794 == null) {
						anIntArray257[anInt3702++] = 0;
						anIntArray257[anInt3702++] = 0;
						return;
					}
					anIntArray257[anInt3702++] = local1794.anInt869 - local1794.anInt872;
					anIntArray257[anInt3702++] = local1794.anInt879 - local1794.anInt875;
					return;
				}
				@Pc(2017) Class4_Sub30 local2017;
				if (arg0 == 5212) {
					local2017 = Static393.method5074();
					if (local2017 == null) {
						anIntArray257[anInt3702++] = -1;
						anIntArray257[anInt3702++] = -1;
						return;
					}
					anIntArray257[anInt3702++] = local2017.anInt4794;
					local776 = local2017.anInt4795 << 28 | local2017.anInt4799 + Static154.anInt437 << 14 | local2017.anInt4798 + Static154.anInt439;
					anIntArray257[anInt3702++] = local776;
					return;
				}
				if (arg0 == 5213) {
					local2017 = Static296.method4193();
					if (local2017 == null) {
						anIntArray257[anInt3702++] = -1;
						anIntArray257[anInt3702++] = -1;
						return;
					}
					anIntArray257[anInt3702++] = local2017.anInt4794;
					local776 = local2017.anInt4795 << 28 | local2017.anInt4799 + Static154.anInt437 << 14 | local2017.anInt4798 + Static154.anInt439;
					anIntArray257[anInt3702++] = local776;
					return;
				}
				@Pc(2165) boolean local2165;
				if (arg0 == 5214) {
					local175 = anIntArray257[--anInt3702];
					local1794 = Static481.method6594();
					if (local1794 != null) {
						local2165 = local1794.method803(local175 >> 14 & 0x3FFF, local175 & 0x3FFF, local175 >> 28 & 0x3, anIntArray260);
						if (local2165) {
							Static570.method7540(anIntArray260[2], anIntArray260[1]);
						}
					}
					return;
				}
				if (arg0 == 5215) {
					anInt3702 -= 2;
					local175 = anIntArray257[anInt3702];
					local776 = anIntArray257[anInt3702 + 1];
					@Pc(2203) Class367 local2203 = Static154.method451(local175 >> 14 & 0x3FFF, local175 & 0x3FFF);
					local2205 = false;
					for (@Pc(2210) Class4_Sub5_Sub3 local2210 = (Class4_Sub5_Sub3) local2203.method8308(); local2210 != null; local2210 = (Class4_Sub5_Sub3) local2203.method8309()) {
						if (local2210.anInt874 == local776) {
							local2205 = true;
							break;
						}
					}
					if (local2205) {
						anIntArray257[anInt3702++] = 1;
						return;
					}
					anIntArray257[anInt3702++] = 0;
					return;
				}
				if (arg0 == 5218) {
					local175 = anIntArray257[--anInt3702];
					local1794 = Static154.method454(local175);
					if (local1794 == null) {
						anIntArray257[anInt3702++] = -1;
						return;
					}
					anIntArray257[anInt3702++] = local1794.anInt870;
					return;
				}
				if (arg0 == 5220) {
					anIntArray257[anInt3702++] = Static532.anInt8252 == 100 ? 1 : 0;
					return;
				}
				if (arg0 == 5221) {
					local175 = anIntArray257[--anInt3702];
					Static570.method7540(local175 & 0x3FFF, local175 >> 14 & 0x3FFF);
					return;
				}
				if (arg0 == 5222) {
					local1827 = Static481.method6594();
					if (local1827 != null) {
						local1496 = local1827.method804(Static379.anInt5638 + Static154.anInt439, Static253.anInt4127 + Static154.anInt437, anIntArray260);
						if (local1496) {
							anIntArray257[anInt3702++] = anIntArray260[1];
							anIntArray257[anInt3702++] = anIntArray260[2];
							return;
						}
						anIntArray257[anInt3702++] = -1;
						anIntArray257[anInt3702++] = -1;
						return;
					}
					anIntArray257[anInt3702++] = -1;
					anIntArray257[anInt3702++] = -1;
					return;
				}
				if (arg0 == 5223) {
					anInt3702 -= 2;
					local175 = anIntArray257[anInt3702];
					local776 = anIntArray257[anInt3702 + 1];
					Static408.method5157(local776 >> 14 & 0x3FFF, local175, local776 & 0x3FFF, false);
					return;
				}
				if (arg0 == 5224) {
					local175 = anIntArray257[--anInt3702];
					local1794 = Static481.method6594();
					if (local1794 != null) {
						local2165 = local1794.method803(local175 >> 14 & 0x3FFF, local175 & 0x3FFF, local175 >> 28 & 0x3, anIntArray260);
						if (local2165) {
							anIntArray257[anInt3702++] = anIntArray260[1];
							anIntArray257[anInt3702++] = anIntArray260[2];
							return;
						}
						anIntArray257[anInt3702++] = -1;
						anIntArray257[anInt3702++] = -1;
						return;
					}
					anIntArray257[anInt3702++] = -1;
					anIntArray257[anInt3702++] = -1;
					return;
				}
				if (arg0 == 5225) {
					local175 = anIntArray257[--anInt3702];
					local1794 = Static481.method6594();
					if (local1794 != null) {
						local2165 = local1794.method804(local175 & 0x3FFF, local175 >> 14 & 0x3FFF, anIntArray260);
						if (local2165) {
							anIntArray257[anInt3702++] = anIntArray260[1];
							anIntArray257[anInt3702++] = anIntArray260[2];
							return;
						}
						anIntArray257[anInt3702++] = -1;
						anIntArray257[anInt3702++] = -1;
						return;
					}
					anIntArray257[anInt3702++] = -1;
					anIntArray257[anInt3702++] = -1;
					return;
				}
				if (arg0 == 5226) {
					Static173.method2844(anIntArray257[--anInt3702]);
					return;
				}
				if (arg0 == 5227) {
					anInt3702 -= 2;
					local175 = anIntArray257[anInt3702];
					local776 = anIntArray257[anInt3702 + 1];
					Static408.method5157(local776 >> 14 & 0x3FFF, local175, local776 & 0x3FFF, true);
					return;
				}
				if (arg0 == 5228) {
					Static205.aBoolean250 = anIntArray257[--anInt3702] == 1;
					return;
				}
				if (arg0 == 5229) {
					anIntArray257[anInt3702++] = Static205.aBoolean250 ? 1 : 0;
					return;
				}
				if (arg0 == 5230) {
					local175 = anIntArray257[--anInt3702];
					Static419.method5753(local175);
					return;
				}
				@Pc(2723) Class4 local2723;
				if (arg0 == 5231) {
					anInt3702 -= 2;
					local175 = anIntArray257[anInt3702];
					local1496 = anIntArray257[anInt3702 + 1] == 1;
					if (Static287.aClass66_21 != null) {
						local2723 = Static287.aClass66_21.method1994((long) local175);
						if (local2723 != null && !local1496) {
							local2723.method9000();
							return;
						}
						if (local2723 == null && local1496) {
							local2723 = new Class4();
							Static287.aClass66_21.method1985(local2723, (long) local175);
						}
					}
					return;
				}
				@Pc(2765) Class4 local2765;
				if (arg0 == 5232) {
					local175 = anIntArray257[--anInt3702];
					if (Static287.aClass66_21 != null) {
						local2765 = Static287.aClass66_21.method1994((long) local175);
						anIntArray257[anInt3702++] = local2765 == null ? 0 : 1;
						return;
					}
					anIntArray257[anInt3702++] = 0;
					return;
				}
				if (arg0 == 5233) {
					anInt3702 -= 2;
					local175 = anIntArray257[anInt3702];
					local1496 = anIntArray257[anInt3702 + 1] == 1;
					if (Static330.aClass66_24 != null) {
						local2723 = Static330.aClass66_24.method1994((long) local175);
						if (local2723 != null && !local1496) {
							local2723.method9000();
							return;
						}
						if (local2723 == null && local1496) {
							local2723 = new Class4();
							Static330.aClass66_24.method1985(local2723, (long) local175);
						}
					}
					return;
				}
				if (arg0 == 5234) {
					local175 = anIntArray257[--anInt3702];
					if (Static330.aClass66_24 != null) {
						local2765 = Static330.aClass66_24.method1994((long) local175);
						anIntArray257[anInt3702++] = local2765 == null ? 0 : 1;
						return;
					}
					anIntArray257[anInt3702++] = 0;
					return;
				}
				if (arg0 == 5235) {
					anIntArray257[anInt3702++] = Static154.aClass4_Sub5_Sub3_2 == null ? -1 : Static154.aClass4_Sub5_Sub3_2.anInt874;
					return;
				}
				if (arg0 == 5236) {
					anInt3702 -= 2;
					local175 = anIntArray257[anInt3702];
					local776 = anIntArray257[anInt3702 + 1];
					local97 = local776 >> 14 & 0x3FFF;
					local103 = local776 & 0x3FFF;
					local2931 = Static571.method7585(local103, local175, local97);
					if (local2931 < 0) {
						anIntArray257[anInt3702++] = -1;
						return;
					}
					anIntArray257[anInt3702++] = local2931;
					return;
				}
				if (arg0 == 5237) {
					Static399.method5100();
					return;
				}
			} else if (arg0 < 5400) {
				if (arg0 == 5300) {
					anInt3702 -= 2;
					local175 = anIntArray257[anInt3702];
					local776 = anIntArray257[anInt3702 + 1];
					Static532.method7162(3, local776, local175, false);
					anIntArray257[anInt3702++] = Static407.aFrame5 == null ? 0 : 1;
					return;
				}
				if (arg0 == 5301) {
					if (Static407.aFrame5 != null) {
						Static532.method7162(Static124.aClass4_Sub20_4.aClass8_Sub21_2.method7121(), -1, -1, false);
					}
					return;
				}
				if (arg0 == 5302) {
					@Pc(3017) Class249[] local3017 = Static594.method7814();
					anIntArray257[anInt3702++] = local3017.length;
					return;
				}
				if (arg0 == 5303) {
					local175 = anIntArray257[--anInt3702];
					@Pc(3041) Class249[] local3041 = Static594.method7814();
					anIntArray257[anInt3702++] = local3041[local175].anInt5845;
					anIntArray257[anInt3702++] = local3041[local175].anInt5848;
					return;
				}
				if (arg0 == 5305) {
					local175 = Static449.anInt7009;
					local776 = Static224.anInt3559;
					local97 = -1;
					@Pc(3076) Class249[] local3076 = Static594.method7814();
					for (local2931 = 0; local2931 < local3076.length; local2931++) {
						@Pc(3083) Class249 local3083 = local3076[local2931];
						if (local3083.anInt5845 == local175 && local3083.anInt5848 == local776) {
							local97 = local2931;
							break;
						}
					}
					anIntArray257[anInt3702++] = local97;
					return;
				}
				if (arg0 == 5306) {
					anIntArray257[anInt3702++] = Static324.method4462();
					return;
				}
				if (arg0 == 5307) {
					local175 = anIntArray257[--anInt3702];
					if (local175 >= 1 && local175 <= 2) {
						Static532.method7162(local175, -1, -1, false);
						return;
					}
					return;
				}
				if (arg0 == 5308) {
					anIntArray257[anInt3702++] = Static124.aClass4_Sub20_4.aClass8_Sub21_2.method7121();
					return;
				}
				if (arg0 == 5309) {
					local175 = anIntArray257[--anInt3702];
					if (local175 >= 1 && local175 <= 2) {
						Static124.aClass4_Sub20_4.method3147(Static124.aClass4_Sub20_4.aClass8_Sub21_2, local175);
						Static124.aClass4_Sub20_4.method3147(Static124.aClass4_Sub20_4.aClass8_Sub21_1, local175);
						Static361.method4808();
						return;
					}
					return;
				}
			} else {
				@Pc(3369) int local3369;
				if (arg0 < 5500) {
					if (arg0 == 5400) {
						anInt3709 -= 2;
						local83 = aStringArray17[anInt3709];
						local89 = aStringArray17[anInt3709 + 1];
						local97 = anIntArray257[--anInt3702];
						@Pc(3231) Class4_Sub48 local3231 = Static335.method4615(Static613.aClass216_142, Static669.aClass196_2);
						local3231.aClass4_Sub11_Sub1_2.method8822(Static115.method2143(local83) + Static115.method2143(local89) + 1);
						local3231.aClass4_Sub11_Sub1_2.method8857(local83);
						local3231.aClass4_Sub11_Sub1_2.method8857(local89);
						local3231.aClass4_Sub11_Sub1_2.method8822(local97);
						Static410.method5170(local3231);
						return;
					}
					if (arg0 == 5401) {
						anInt3702 -= 2;
						Static75.aShortArray16[anIntArray257[anInt3702]] = (short) Static278.method4064(anIntArray257[anInt3702 + 1]);
						Static532.aClass255_2.method5216();
						Static532.aClass255_2.method5212();
						Static255.aClass380_1.method8592();
						Static34.method8332();
						return;
					}
					if (arg0 == 5405) {
						anInt3702 -= 2;
						local175 = anIntArray257[anInt3702];
						local776 = anIntArray257[anInt3702 + 1];
						if (local175 >= 0 && local175 < 2) {
							Static107.anIntArrayArrayArray7[local175] = new int[local776 << 1][4];
						}
						return;
					}
					if (arg0 == 5406) {
						anInt3702 -= 7;
						local175 = anIntArray257[anInt3702];
						local776 = anIntArray257[anInt3702 + 1] << 1;
						local97 = anIntArray257[anInt3702 + 2];
						local103 = anIntArray257[anInt3702 + 3];
						local2931 = anIntArray257[anInt3702 + 4];
						local3369 = anIntArray257[anInt3702 + 5];
						@Pc(3375) int local3375 = anIntArray257[anInt3702 + 6];
						if (local175 >= 0 && local175 < 2 && Static107.anIntArrayArrayArray7[local175] != null && local776 >= 0 && local776 < Static107.anIntArrayArrayArray7[local175].length) {
							Static107.anIntArrayArrayArray7[local175][local776] = new int[] { (local97 >> 14 & 0x3FFF) << 9, local103 << 2, (local97 & 0x3FFF) << 9, local3375 };
							Static107.anIntArrayArrayArray7[local175][local776 + 1] = new int[] { (local2931 >> 14 & 0x3FFF) << 9, local3369 << 2, (local2931 & 0x3FFF) << 9 };
						}
						return;
					}
					if (arg0 == 5407) {
						local175 = Static107.anIntArrayArrayArray7[anIntArray257[--anInt3702]].length >> 1;
						anIntArray257[anInt3702++] = local175;
						return;
					}
					if (arg0 == 5411) {
						if (Static407.aFrame5 != null) {
							Static532.method7162(Static124.aClass4_Sub20_4.aClass8_Sub21_2.method7121(), -1, -1, false);
						}
						if (Static280.aFrame10 != null) {
							Static352.method4721();
							System.exit(0);
							return;
						}
						local83 = Static488.aString95 == null ? Static534.method7460() : Static488.aString95;
						Static355.method4755(Static239.aClass207_2, local83, false, Static124.aClass4_Sub20_4.aClass8_Sub13_2.method5052() == 1);
						return;
					}
					if (arg0 == 5419) {
						local83 = "";
						if (Static431.aClass281_4 != null) {
							if (Static431.aClass281_4.anObject17 == null) {
								local83 = Static179.method2892(Static431.aClass281_4.anInt7337);
							} else {
								local83 = (String) Static431.aClass281_4.anObject17;
							}
						}
						aStringArray17[anInt3709++] = local83;
						return;
					}
					if (arg0 == 5420) {
						anIntArray257[anInt3702++] = Static239.aClass207_2.aBoolean399 ? 0 : 1;
						return;
					}
					if (arg0 == 5421) {
						if (Static407.aFrame5 != null) {
							Static532.method7162(Static124.aClass4_Sub20_4.aClass8_Sub21_2.method7121(), -1, -1, false);
						}
						local83 = aStringArray17[--anInt3709];
						local1496 = anIntArray257[--anInt3702] == 1;
						local181 = Static534.method7460() + local83;
						Static355.method4755(Static239.aClass207_2, local181, local1496, Static124.aClass4_Sub20_4.aClass8_Sub13_2.method5052() == 1);
						return;
					}
					if (arg0 == 5422) {
						anInt3709 -= 2;
						local83 = aStringArray17[anInt3709];
						local89 = aStringArray17[anInt3709 + 1];
						local97 = anIntArray257[--anInt3702];
						if (local83.length() > 0) {
							if (Static216.aStringArray16 == null) {
								Static216.aStringArray16 = new String[Static427.anIntArray464[Static333.aClass234_5.anInt5621]];
							}
							Static216.aStringArray16[local97] = local83;
						}
						if (local89.length() > 0) {
							if (Static599.aStringArray47 == null) {
								Static599.aStringArray47 = new String[Static427.anIntArray464[Static333.aClass234_5.anInt5621]];
							}
							Static599.aStringArray47[local97] = local89;
						}
						return;
					}
					if (arg0 == 5423) {
						System.out.println(aStringArray17[--anInt3709]);
						return;
					}
					if (arg0 == 5424) {
						anInt3702 -= 11;
						Static533.anInt8272 = anIntArray257[anInt3702];
						Static164.anInt2983 = anIntArray257[anInt3702 + 1];
						Static6.anInt86 = anIntArray257[anInt3702 + 2];
						Static465.anInt7433 = anIntArray257[anInt3702 + 3];
						Static516.anInt8033 = anIntArray257[anInt3702 + 4];
						Static485.anInt7631 = anIntArray257[anInt3702 + 5];
						Static355.anInt5411 = anIntArray257[anInt3702 + 6];
						Static404.anInt5859 = anIntArray257[anInt3702 + 7];
						Static3.anInt3612 = anIntArray257[anInt3702 + 8];
						Static222.anInt7628 = anIntArray257[anInt3702 + 9];
						Static294.anInt4652 = anIntArray257[anInt3702 + 10];
						Static368.aClass34_80.method1235(Static516.anInt8033);
						Static368.aClass34_80.method1235(Static485.anInt7631);
						Static368.aClass34_80.method1235(Static355.anInt5411);
						Static368.aClass34_80.method1235(Static404.anInt5859);
						Static368.aClass34_80.method1235(Static3.anInt3612);
						Static191.aClass17_31 = null;
						Static312.aClass17_46 = null;
						Static16.aClass17_2 = null;
						Static191.aClass17_30 = null;
						Static475.aClass17_56 = null;
						Static9.aClass17_77 = null;
						Static563.aClass17_53 = null;
						Static376.aClass17_50 = null;
						Static523.aBoolean633 = true;
						return;
					}
					if (arg0 == 5425) {
						Static162.method2595();
						Static523.aBoolean633 = false;
						return;
					}
					if (arg0 == 5426) {
						anInt3702 -= 2;
						Static203.anInt3317 = anIntArray257[anInt3702];
						Static232.anInt3661 = anIntArray257[anInt3702 + 1];
						return;
					}
					if (arg0 == 5427) {
						anInt3702 -= 2;
						Static431.anInt6801 = anIntArray257[anInt3702 + 1];
						return;
					}
					if (arg0 == 5428) {
						anInt3702 -= 2;
						local175 = anIntArray257[anInt3702];
						local776 = anIntArray257[anInt3702 + 1];
						anIntArray257[anInt3702++] = Static170.method2829(local175, local776) ? 1 : 0;
						return;
					}
					if (arg0 == 5429) {
						Static93.method1898(false, false, aStringArray17[--anInt3709]);
						return;
					}
					if (arg0 == 5430) {
						try {
							Static684.method6376("accountcreated", Static649.anApplet2);
							return;
						} catch (@Pc(3917) Throwable local3917) {
							return;
						}
					}
					if (arg0 == 5431) {
						try {
							Static684.method6376("accountcreatestarted", Static649.anApplet2);
							return;
						} catch (@Pc(3928) Throwable local3928) {
							return;
						}
					}
					if (arg0 == 5432) {
						local83 = "";
						if (Static169.aClipboard1 != null) {
							@Pc(3940) Transferable local3940 = Static169.aClipboard1.getContents((Object) null);
							if (local3940 != null) {
								try {
									local83 = (String) local3940.getTransferData(DataFlavor.stringFlavor);
									if (local83 == null) {
										local83 = "";
									}
								} catch (@Pc(3953) Exception local3953) {
								}
							}
						}
						aStringArray17[anInt3709++] = local83;
						return;
					}
					if (arg0 == 5433) {
						Static298.anInt8468 = anIntArray257[--anInt3702];
						return;
					}
					if (arg0 == 5435) {
						anIntArray257[anInt3702++] = Static278.aBoolean340 ? 1 : 0;
						return;
					}
				} else if (arg0 < 5600) {
					if (arg0 == 5500) {
						anInt3702 -= 4;
						local175 = anIntArray257[anInt3702];
						local776 = anIntArray257[anInt3702 + 1];
						local97 = anIntArray257[anInt3702 + 2];
						local103 = anIntArray257[anInt3702 + 3];
						Static536.method7199(local97, local103, local776 << 2, (local175 & 0x3FFF) - Static321.anInt5000, false, (local175 >> 14 & 0x3FFF) - Static445.anInt6949);
						return;
					}
					if (arg0 == 5501) {
						anInt3702 -= 4;
						local175 = anIntArray257[anInt3702];
						local776 = anIntArray257[anInt3702 + 1];
						local97 = anIntArray257[anInt3702 + 2];
						local103 = anIntArray257[anInt3702 + 3];
						Static333.method4592(local103, (local175 >> 14 & 0x3FFF) - Static445.anInt6949, local97, (local175 & 0x3FFF) - Static321.anInt5000, local776 << 2);
						return;
					}
					if (arg0 == 5502) {
						anInt3702 -= 6;
						local175 = anIntArray257[anInt3702];
						if (local175 >= 2) {
							throw new RuntimeException();
						}
						Static75.anInt1621 = local175;
						local776 = anIntArray257[anInt3702 + 1];
						if (local776 + 1 >= Static107.anIntArrayArrayArray7[Static75.anInt1621].length >> 1) {
							throw new RuntimeException();
						}
						Static143.anInt2612 = local776;
						Static657.anInt10372 = 0;
						Static219.anInt3532 = anIntArray257[anInt3702 + 2];
						Static606.anInt9316 = anIntArray257[anInt3702 + 3];
						local97 = anIntArray257[anInt3702 + 4];
						if (local97 >= 2) {
							throw new RuntimeException();
						}
						Static558.anInt8603 = local97;
						local103 = anIntArray257[anInt3702 + 5];
						if (local103 + 1 >= Static107.anIntArrayArrayArray7[Static558.anInt8603].length >> 1) {
							throw new RuntimeException();
						}
						Static263.anInt4258 = local103;
						Static259.anInt4200 = 3;
						Static286.anInt4563 = -1;
						Static77.anInt1632 = -1;
						return;
					}
					if (arg0 == 5503) {
						Static310.method4320();
						return;
					}
					if (arg0 == 5504) {
						anInt3702 -= 2;
						Static224.method3272(anIntArray257[anInt3702], anIntArray257[anInt3702 + 1]);
						return;
					}
					if (arg0 == 5505) {
						anIntArray257[anInt3702++] = (int) Static275.aFloat105 >> 3;
						return;
					}
					if (arg0 == 5506) {
						anIntArray257[anInt3702++] = (int) Static642.aFloat230 >> 3;
						return;
					}
					if (arg0 == 5507) {
						Static655.method8736();
						return;
					}
					if (arg0 == 5508) {
						Static614.method8041();
						return;
					}
					if (arg0 == 5509) {
						Static558.method7418();
						return;
					}
					if (arg0 == 5510) {
						Static590.method7765();
						return;
					}
					if (arg0 == 5511) {
						local175 = anIntArray257[--anInt3702];
						local776 = local175 >> 14 & 0x3FFF;
						local97 = local175 & 0x3FFF;
						local776 -= Static445.anInt6949;
						if (local776 < 0) {
							local776 = 0;
						} else if (local776 >= Static224.anInt3557) {
							local776 = Static224.anInt3557;
						}
						local97 -= Static321.anInt5000;
						if (local97 < 0) {
							local97 = 0;
						} else if (local97 >= Static267.anInt4309) {
							local97 = Static267.anInt4309;
						}
						Static443.anInt6913 = (local776 << 9) + 256;
						Static149.anInt2728 = (local97 << 9) + 256;
						Static259.anInt4200 = 4;
						Static286.anInt4563 = -1;
						Static77.anInt1632 = -1;
						return;
					}
					if (arg0 == 5512) {
						Static257.method3718();
						return;
					}
					if (arg0 == 5514) {
						Static140.anInt8125 = anIntArray257[--anInt3702];
						return;
					}
					if (arg0 == 5516) {
						anIntArray257[anInt3702++] = Static140.anInt8125;
						return;
					}
					if (arg0 == 5517) {
						local175 = anIntArray257[--anInt3702];
						if (local175 == -1) {
							local776 = local175 >> 14 & 0x3FFF;
							local97 = local175 & 0x3FFF;
							local776 -= Static445.anInt6949;
							if (local776 < 0) {
								local776 = 0;
							} else if (local776 >= Static224.anInt3557) {
								local776 = Static224.anInt3557;
							}
							local97 -= Static321.anInt5000;
							if (local97 < 0) {
								local97 = 0;
							} else if (local97 >= Static267.anInt4309) {
								local97 = Static267.anInt4309;
							}
							Static77.anInt1632 = (local776 << 9) + 256;
							Static286.anInt4563 = (local97 << 9) + 256;
							return;
						}
						Static77.anInt1632 = -1;
						Static286.anInt4563 = -1;
						return;
					}
				} else if (arg0 < 5700) {
					if (arg0 == 5600) {
						anInt3709 -= 2;
						local83 = aStringArray17[anInt3709];
						local89 = aStringArray17[anInt3709 + 1];
						local97 = anIntArray257[--anInt3702];
						Static627.method8415(local89, local97, local83);
						return;
					}
					if (arg0 == 5601) {
						Static663.method8790();
						return;
					}
					if (arg0 == 5602) {
						if (!Static71.method1514()) {
							Static44.method820();
						}
						return;
					}
					if (arg0 == 5604) {
						anInt3709--;
						if (Static656.anInt10356 != 3) {
							return;
						}
						if (!Static71.method1514() && Static87.anInt1778 == 0) {
							Static336.method8995(aStringArray17[anInt3709]);
							return;
						}
						return;
					}
					if (arg0 == 5605) {
						anInt3709 -= 2;
						anInt3702 -= 2;
						if (Static656.anInt10356 != 3) {
							return;
						}
						if (!Static71.method1514() && Static87.anInt1778 == 0) {
							Static194.method3021(aStringArray17[anInt3709], aStringArray17[anInt3709 + 1], anIntArray257[anInt3702], anIntArray257[anInt3702 + 1] == 1);
							return;
						}
						return;
					}
					if (arg0 == 5606) {
						if (Static87.anInt1778 == 0) {
							Static393.anInt5778 = -2;
						}
						return;
					}
					if (arg0 == 5607) {
						anIntArray257[anInt3702++] = Static54.anInt1255;
						return;
					}
					if (arg0 == 5608) {
						anIntArray257[anInt3702++] = Static18.anInt6907;
						return;
					}
					if (arg0 == 5609) {
						anIntArray257[anInt3702++] = Static393.anInt5778;
						return;
					}
					if (arg0 == 5611) {
						anIntArray257[anInt3702++] = Static80.anInt1713;
						return;
					}
					if (arg0 == 5612) {
						local175 = anIntArray257[--anInt3702];
						Static588.method7747(local175);
						return;
					}
					if (arg0 == 5613) {
						anIntArray257[anInt3702++] = Static54.anInt1255;
						return;
					}
					if (arg0 == 5615) {
						anInt3709 -= 2;
						local83 = aStringArray17[anInt3709];
						local89 = aStringArray17[anInt3709 + 1];
						Static230.method3343(local89, local83);
						return;
					}
					if (arg0 == 5616) {
						Static306.method4298(false);
						return;
					}
					if (arg0 == 5617) {
						anIntArray257[anInt3702++] = Static85.anInt1771;
						return;
					}
					if (arg0 == 5618) {
						anInt3702--;
						return;
					}
					if (arg0 == 5619) {
						anInt3702--;
						return;
					}
					if (arg0 == 5620) {
						anIntArray257[anInt3702++] = 0;
						return;
					}
					if (arg0 == 5621) {
						anInt3709 -= 2;
						anInt3702 -= 2;
						return;
					}
					if (arg0 == 5622) {
						return;
					}
					if (arg0 == 5623) {
						if (Static420.aString78 != null) {
							anIntArray257[anInt3702++] = 1;
							return;
						}
						anIntArray257[anInt3702++] = 0;
						return;
					}
					if (arg0 == 5624) {
						anIntArray257[anInt3702++] = (int) (Static278.aLong133 >> 32);
						anIntArray257[anInt3702++] = (int) (Static278.aLong133 & 0xFFFFFFFFFFFFFFFFL);
						return;
					}
					if (arg0 == 5625) {
						anIntArray257[anInt3702++] = Static552.aBoolean666 ? 1 : 0;
						return;
					}
					if (arg0 == 5626) {
						Static552.aBoolean666 = true;
						Static561.method7441();
						return;
					}
					if (arg0 == 5628) {
						anIntArray257[anInt3702++] = Static71.method1514() ? 1 : 0;
						return;
					}
					if (arg0 == 5630) {
						Static419.method5760();
						return;
					}
					if (arg0 == 5631) {
						anInt3702 -= 2;
						local175 = anIntArray257[anInt3702];
						local776 = anIntArray257[anInt3702 + 1];
						Static156.method2707(local175, local776);
						return;
					}
					if (arg0 == 5632) {
						local175 = anIntArray257[--anInt3702];
						Static23.method558(local175);
						return;
					}
				} else if (arg0 < 6100) {
					if (arg0 == 6001) {
						local175 = anIntArray257[--anInt3702];
						Static124.aClass4_Sub20_4.method3147(Static124.aClass4_Sub20_4.aClass8_Sub9_1, local175);
						Static270.method3888();
						Static361.method4808();
						Static391.aBoolean438 = false;
						return;
					}
					@Pc(4901) boolean local4901;
					if (arg0 == 6002) {
						local4901 = anIntArray257[--anInt3702] == 1;
						Static124.aClass4_Sub20_4.method3147(Static124.aClass4_Sub20_4.aClass8_Sub3_2, local4901 ? 1 : 0);
						Static124.aClass4_Sub20_4.method3147(Static124.aClass4_Sub20_4.aClass8_Sub3_1, local4901 ? 1 : 0);
						Static270.method3888();
						Static115.method2144();
						Static361.method4808();
						Static391.aBoolean438 = false;
						return;
					}
					if (arg0 == 6003) {
						local4901 = anIntArray257[--anInt3702] == 1;
						Static124.aClass4_Sub20_4.method3147(Static124.aClass4_Sub20_4.aClass8_Sub16_2, local4901 ? 2 : 1);
						Static124.aClass4_Sub20_4.method3147(Static124.aClass4_Sub20_4.aClass8_Sub16_1, local4901 ? 2 : 1);
						Static115.method2144();
						Static361.method4808();
						Static391.aBoolean438 = false;
						return;
					}
					if (arg0 == 6005) {
						Static124.aClass4_Sub20_4.method3147(Static124.aClass4_Sub20_4.aClass8_Sub24_1, anIntArray257[--anInt3702] == 1 ? 1 : 0);
						Static270.method3888();
						Static361.method4808();
						Static391.aBoolean438 = false;
						return;
					}
					if (arg0 == 6007) {
						Static124.aClass4_Sub20_4.method3147(Static124.aClass4_Sub20_4.aClass8_Sub17_1, anIntArray257[--anInt3702]);
						Static361.method4808();
						Static391.aBoolean438 = false;
						return;
					}
					if (arg0 == 6008) {
						Static124.aClass4_Sub20_4.method3147(Static124.aClass4_Sub20_4.aClass8_Sub5_1, anIntArray257[--anInt3702] == 1 ? 1 : 0);
						Static361.method4808();
						Static391.aBoolean438 = false;
						return;
					}
					if (arg0 == 6010) {
						Static124.aClass4_Sub20_4.method3147(Static124.aClass4_Sub20_4.aClass8_Sub19_1, anIntArray257[--anInt3702] == 1 ? 1 : 0);
						Static361.method4808();
						Static391.aBoolean438 = false;
						return;
					}
					if (arg0 == 6011) {
						Static124.aClass4_Sub20_4.method3147(Static124.aClass4_Sub20_4.aClass8_Sub8_1, anIntArray257[--anInt3702]);
						Static270.method3888();
						Static361.method4808();
						Static391.aBoolean438 = false;
						return;
					}
					if (arg0 == 6012) {
						Static124.aClass4_Sub20_4.method3147(Static124.aClass4_Sub20_4.aClass8_Sub1_1, anIntArray257[--anInt3702] == 1 ? 1 : 0);
						Static544.method7261();
						Static568.method7522();
						Static361.method4808();
						Static391.aBoolean438 = false;
						return;
					}
					if (arg0 == 6014) {
						Static124.aClass4_Sub20_4.method3147(Static124.aClass4_Sub20_4.aClass8_Sub12_1, anIntArray257[--anInt3702] == 1 ? 2 : 0);
						Static270.method3888();
						Static361.method4808();
						Static391.aBoolean438 = false;
						return;
					}
					if (arg0 == 6015) {
						Static124.aClass4_Sub20_4.method3147(Static124.aClass4_Sub20_4.aClass8_Sub25_1, anIntArray257[--anInt3702] == 1 ? 1 : 0);
						Static270.method3888();
						Static361.method4808();
						Static391.aBoolean438 = false;
						return;
					}
					if (arg0 == 6016) {
						Static124.aClass4_Sub20_4.method3147(Static124.aClass4_Sub20_4.aClass8_Sub27_2, anIntArray257[--anInt3702]);
						Static46.method825(Static124.aClass4_Sub20_4.aClass8_Sub13_2.method5052(), false);
						Static361.method4808();
						return;
					}
					if (arg0 == 6017) {
						Static124.aClass4_Sub20_4.method3147(Static124.aClass4_Sub20_4.aClass8_Sub28_1, anIntArray257[--anInt3702] == 1 ? 1 : 0);
						Static651.method8691();
						Static361.method4808();
						Static391.aBoolean438 = false;
						return;
					}
					if (arg0 == 6018) {
						Static124.aClass4_Sub20_4.method3147(Static124.aClass4_Sub20_4.aClass8_Sub22_4, anIntArray257[--anInt3702]);
						Static361.method4808();
						Static391.aBoolean438 = false;
						return;
					}
					if (arg0 == 6019) {
						local175 = anIntArray257[--anInt3702];
						local776 = Static124.aClass4_Sub20_4.aClass8_Sub22_5.method7414();
						if (local175 != local776) {
							if (Static310.method4317(Static656.anInt10356)) {
								if (local776 == 0 && Static573.anInt8886 != -1) {
									Static64.method1419(Static611.aClass34_120, local175, Static573.anInt8886);
									Static174.method2858();
									Static299.aBoolean350 = false;
								} else if (local175 == 0) {
									Static633.method8381();
									Static299.aBoolean350 = false;
								} else {
									Static558.method7417(local175);
								}
							}
							Static124.aClass4_Sub20_4.method3147(Static124.aClass4_Sub20_4.aClass8_Sub22_5, local175);
							Static361.method4808();
							Static391.aBoolean438 = false;
						}
						return;
					}
					if (arg0 == 6020) {
						Static124.aClass4_Sub20_4.method3147(Static124.aClass4_Sub20_4.aClass8_Sub22_3, anIntArray257[--anInt3702]);
						Static361.method4808();
						Static391.aBoolean438 = false;
						return;
					}
					if (arg0 == 6021) {
						local175 = Static124.aClass4_Sub20_4.aClass8_Sub16_2.method6388();
						Static124.aClass4_Sub20_4.method3147(Static124.aClass4_Sub20_4.aClass8_Sub16_1, anIntArray257[--anInt3702] == 1 ? 0 : local175);
						Static115.method2144();
						return;
					}
					if (arg0 == 6023) {
						local175 = anIntArray257[--anInt3702];
						Static124.aClass4_Sub20_4.method3147(Static124.aClass4_Sub20_4.aClass8_Sub14_1, local175);
						Static361.method4808();
						Static391.aBoolean438 = false;
						return;
					}
					if (arg0 == 6024) {
						Static124.aClass4_Sub20_4.method3147(Static124.aClass4_Sub20_4.aClass8_Sub27_1, anIntArray257[--anInt3702]);
						Static361.method4808();
						return;
					}
					if (arg0 == 6025) {
						Static124.aClass4_Sub20_4.method3147(Static124.aClass4_Sub20_4.aClass8_Sub26_1, anIntArray257[--anInt3702]);
						Static361.method4808();
						Static391.aBoolean438 = false;
						return;
					}
					if (arg0 == 6027) {
						local175 = anIntArray257[--anInt3702];
						if (local175 < 0 || local175 > 1) {
							local175 = 0;
						}
						Static253.method3680(local175 == 1);
						return;
					}
					if (arg0 == 6028) {
						Static124.aClass4_Sub20_4.method3147(Static124.aClass4_Sub20_4.aClass8_Sub4_1, anIntArray257[--anInt3702] == 0 ? 0 : 1);
						Static361.method4808();
						return;
					}
					if (arg0 == 6029) {
						Static124.aClass4_Sub20_4.method3147(Static124.aClass4_Sub20_4.aClass8_Sub17_1, anIntArray257[--anInt3702]);
						Static361.method4808();
						return;
					}
					if (arg0 == 6030) {
						Static124.aClass4_Sub20_4.method3147(Static124.aClass4_Sub20_4.aClass8_Sub6_1, anIntArray257[--anInt3702] == 0 ? 0 : 1);
						Static361.method4808();
						Static270.method3888();
						return;
					}
					if (arg0 == 6031) {
						local175 = anIntArray257[--anInt3702];
						if (local175 < 0 || local175 > 5) {
							local175 = 2;
						}
						Static46.method825(local175, false);
						return;
					}
					if (arg0 == 6032) {
						anInt3702 -= 2;
						local175 = anIntArray257[anInt3702];
						local1496 = anIntArray257[anInt3702 + 1] == 1;
						Static124.aClass4_Sub20_4.method3147(Static124.aClass4_Sub20_4.aClass8_Sub13_1, local175);
						if (!local1496) {
							Static124.aClass4_Sub20_4.method3147(Static124.aClass4_Sub20_4.aClass8_Sub23_1, 0);
						}
						Static361.method4808();
						Static391.aBoolean438 = false;
						return;
					}
					if (arg0 == 6033) {
						Static124.aClass4_Sub20_4.method3147(Static124.aClass4_Sub20_4.aClass8_Sub20_1, anIntArray257[--anInt3702]);
						Static361.method4808();
						return;
					}
					if (arg0 == 6034) {
						Static124.aClass4_Sub20_4.method3147(Static124.aClass4_Sub20_4.aClass8_Sub2_1, anIntArray257[--anInt3702] == 1 ? 1 : 0);
						Static361.method4808();
						Static544.method7261();
						Static391.aBoolean438 = false;
						return;
					}
					if (arg0 == 6035) {
						local175 = Static124.aClass4_Sub20_4.aClass8_Sub3_2.method2884();
						Static124.aClass4_Sub20_4.method3147(Static124.aClass4_Sub20_4.aClass8_Sub3_1, anIntArray257[--anInt3702] == 1 ? 1 : local175);
						Static270.method3888();
						Static115.method2144();
						return;
					}
					if (arg0 == 6036) {
						Static124.aClass4_Sub20_4.method3147(Static124.aClass4_Sub20_4.aClass8_Sub18_1, anIntArray257[--anInt3702]);
						Static361.method4808();
						Static70.aBoolean93 = true;
						return;
					}
					if (arg0 == 6037) {
						Static124.aClass4_Sub20_4.method3147(Static124.aClass4_Sub20_4.aClass8_Sub22_1, anIntArray257[--anInt3702]);
						Static361.method4808();
						Static391.aBoolean438 = false;
						return;
					}
					if (arg0 == 6038) {
						local175 = anIntArray257[--anInt3702];
						local776 = Static124.aClass4_Sub20_4.aClass8_Sub22_2.method7414();
						if (local175 != local776 && Static573.anInt8886 == Static431.anInt6781) {
							if (!Static310.method4317(Static656.anInt10356)) {
								if (local776 == 0) {
									Static64.method1419(Static611.aClass34_120, local175, Static573.anInt8886);
									Static174.method2858();
									Static299.aBoolean350 = false;
								} else if (local175 == 0) {
									Static633.method8381();
									Static299.aBoolean350 = false;
								} else {
									Static558.method7417(local175);
								}
							}
							Static124.aClass4_Sub20_4.method3147(Static124.aClass4_Sub20_4.aClass8_Sub22_2, local175);
							Static361.method4808();
							Static391.aBoolean438 = false;
						}
						return;
					}
					if (arg0 == 6039) {
						local175 = anIntArray257[--anInt3702];
						if (local175 > 255 || local175 < 0) {
							local175 = 0;
						}
						if (local175 != Static124.aClass4_Sub20_4.aClass8_Sub11_1.method4347()) {
							Static124.aClass4_Sub20_4.method3147(Static124.aClass4_Sub20_4.aClass8_Sub11_1, local175);
							Static361.method4808();
							Static391.aBoolean438 = false;
						}
						return;
					}
					if (arg0 == 6040) {
						local175 = anIntArray257[--anInt3702];
						if (local175 != Static124.aClass4_Sub20_4.aClass8_Sub15_1.method6055()) {
							Static124.aClass4_Sub20_4.method3147(Static124.aClass4_Sub20_4.aClass8_Sub15_1, local175);
							Static361.method4808();
							Static391.aBoolean438 = false;
							Static620.method7581();
						}
						return;
					}
				} else if (arg0 < 6200) {
					if (arg0 == 6101) {
						anIntArray257[anInt3702++] = Static124.aClass4_Sub20_4.aClass8_Sub9_1.method3807();
						return;
					}
					if (arg0 == 6102) {
						anIntArray257[anInt3702++] = Static124.aClass4_Sub20_4.aClass8_Sub3_2.method2884() == 1 ? 1 : 0;
						return;
					}
					if (arg0 == 6103) {
						anIntArray257[anInt3702++] = Static124.aClass4_Sub20_4.aClass8_Sub16_2.method6388() == 2 ? 1 : 0;
						return;
					}
					if (arg0 == 6105) {
						anIntArray257[anInt3702++] = Static124.aClass4_Sub20_4.aClass8_Sub24_1.method7743() == 1 ? 1 : 0;
						return;
					}
					if (arg0 == 6107) {
						anIntArray257[anInt3702++] = Static124.aClass4_Sub20_4.aClass8_Sub17_1.method6583();
						return;
					}
					if (arg0 == 6108) {
						anIntArray257[anInt3702++] = Static124.aClass4_Sub20_4.aClass8_Sub5_1.method2985() == 1 ? 1 : 0;
						return;
					}
					if (arg0 == 6110) {
						anIntArray257[anInt3702++] = Static124.aClass4_Sub20_4.aClass8_Sub19_1.method6698() == 1 ? 1 : 0;
						return;
					}
					if (arg0 == 6111) {
						anIntArray257[anInt3702++] = Static124.aClass4_Sub20_4.aClass8_Sub8_1.method3571();
						return;
					}
					if (arg0 == 6112) {
						anIntArray257[anInt3702++] = Static124.aClass4_Sub20_4.aClass8_Sub1_1.method177() == 1 ? 1 : 0;
						return;
					}
					if (arg0 == 6114) {
						anIntArray257[anInt3702++] = Static124.aClass4_Sub20_4.aClass8_Sub12_1.method4650() == 2 ? 1 : 0;
						return;
					}
					if (arg0 == 6115) {
						anIntArray257[anInt3702++] = Static124.aClass4_Sub20_4.aClass8_Sub25_1.method7779() == 1 ? 1 : 0;
						return;
					}
					if (arg0 == 6116) {
						anIntArray257[anInt3702++] = Static124.aClass4_Sub20_4.aClass8_Sub27_2.method7983();
						return;
					}
					if (arg0 == 6117) {
						anIntArray257[anInt3702++] = Static124.aClass4_Sub20_4.aClass8_Sub28_1.method8027() == 1 ? 1 : 0;
						return;
					}
					if (arg0 == 6118) {
						anIntArray257[anInt3702++] = Static124.aClass4_Sub20_4.aClass8_Sub22_4.method7414();
						return;
					}
					if (arg0 == 6119) {
						anIntArray257[anInt3702++] = Static124.aClass4_Sub20_4.aClass8_Sub22_5.method7414();
						return;
					}
					if (arg0 == 6120) {
						anIntArray257[anInt3702++] = Static124.aClass4_Sub20_4.aClass8_Sub22_3.method7414();
						return;
					}
					if (arg0 == 6123) {
						anIntArray257[anInt3702++] = Static147.method7909();
						return;
					}
					if (arg0 == 6124) {
						anIntArray257[anInt3702++] = Static124.aClass4_Sub20_4.aClass8_Sub27_1.method7983();
						return;
					}
					if (arg0 == 6125) {
						anIntArray257[anInt3702++] = Static124.aClass4_Sub20_4.aClass8_Sub26_1.method7943();
						return;
					}
					if (arg0 == 6127) {
						anIntArray257[anInt3702++] = Static124.aClass4_Sub20_4.aClass8_Sub29_1.method8390() == 1 ? 1 : 0;
						return;
					}
					if (arg0 == 6128) {
						anIntArray257[anInt3702++] = Static124.aClass4_Sub20_4.aClass8_Sub4_1.method2973() == 1 ? 1 : 0;
						return;
					}
					if (arg0 == 6129) {
						anIntArray257[anInt3702++] = Static124.aClass4_Sub20_4.aClass8_Sub17_1.method6583();
						return;
					}
					if (arg0 == 6130) {
						anIntArray257[anInt3702++] = Static124.aClass4_Sub20_4.aClass8_Sub6_1.method3083() == 1 ? 1 : 0;
						return;
					}
					if (arg0 == 6131) {
						anIntArray257[anInt3702++] = Static124.aClass4_Sub20_4.aClass8_Sub13_2.method5052();
						return;
					}
					if (arg0 == 6132) {
						anIntArray257[anInt3702++] = Static124.aClass4_Sub20_4.aClass8_Sub13_1.method5052();
						return;
					}
					if (arg0 == 6133) {
						anIntArray257[anInt3702++] = Static239.aClass207_2.aBoolean399 && !Static239.aClass207_2.aBoolean398 ? 1 : 0;
						return;
					}
					if (arg0 == 6135) {
						anIntArray257[anInt3702++] = Static124.aClass4_Sub20_4.aClass8_Sub20_1.method6737();
						return;
					}
					if (arg0 == 6136) {
						anIntArray257[anInt3702++] = Static124.aClass4_Sub20_4.aClass8_Sub2_1.method1355() == 1 ? 1 : 0;
						return;
					}
					if (arg0 == 6138) {
						anIntArray257[anInt3702++] = Static97.method1974(200, Static124.aClass4_Sub20_4.aClass8_Sub13_2.method5052());
						return;
					}
					if (arg0 == 6139) {
						anIntArray257[anInt3702++] = Static124.aClass4_Sub20_4.aClass8_Sub18_1.method6657();
						return;
					}
					if (arg0 == 6142) {
						anIntArray257[anInt3702++] = Static124.aClass4_Sub20_4.aClass8_Sub22_1.method7414();
						return;
					}
					if (arg0 == 6143) {
						anIntArray257[anInt3702++] = Static124.aClass4_Sub20_4.aClass8_Sub22_2.method7414();
						return;
					}
					if (arg0 == 6144) {
						anIntArray257[anInt3702++] = Static338.aBoolean404 ? 1 : 0;
						return;
					}
					if (arg0 == 6145) {
						anIntArray257[anInt3702++] = Static124.aClass4_Sub20_4.aClass8_Sub11_1.method4347();
						return;
					}
					if (arg0 == 6146) {
						anIntArray257[anInt3702++] = Static124.aClass4_Sub20_4.aClass8_Sub15_1.method6055();
						return;
					}
					if (arg0 == 6147) {
						anIntArray257[anInt3702++] = Static566.aClass4_Sub41_1.anInt7533 < 512 || Static338.aBoolean404 || Static436.aBoolean593 ? 1 : 0;
						return;
					}
					if (arg0 == 6148) {
						anIntArray257[anInt3702++] = Static645.aBoolean784 ? 1 : 0;
						return;
					}
				} else if (arg0 < 6300) {
					if (arg0 == 6200) {
						anInt3702 -= 2;
						Static445.aShort96 = (short) anIntArray257[anInt3702];
						if (Static445.aShort96 <= 0) {
							Static445.aShort96 = 256;
						}
						Static595.aShort115 = (short) anIntArray257[anInt3702 + 1];
						if (Static595.aShort115 <= 0) {
							Static595.aShort115 = 205;
						}
						return;
					}
					if (arg0 == 6201) {
						anInt3702 -= 2;
						Static142.aShort80 = (short) anIntArray257[anInt3702];
						if (Static142.aShort80 <= 0) {
							Static142.aShort80 = 256;
						}
						Static634.aShort121 = (short) anIntArray257[anInt3702 + 1];
						if (Static634.aShort121 <= 0) {
							Static634.aShort121 = 320;
						}
						return;
					}
					if (arg0 == 6202) {
						anInt3702 -= 4;
						Static53.aShort15 = (short) anIntArray257[anInt3702];
						if (Static53.aShort15 <= 0) {
							Static53.aShort15 = 1;
						}
						Static112.aShort39 = (short) anIntArray257[anInt3702 + 1];
						if (Static112.aShort39 <= 0) {
							Static112.aShort39 = 32767;
						} else if (Static112.aShort39 < Static53.aShort15) {
							Static112.aShort39 = Static53.aShort15;
						}
						Static362.aShort86 = (short) anIntArray257[anInt3702 + 2];
						if (Static362.aShort86 <= 0) {
							Static362.aShort86 = 1;
						}
						Static379.aShort89 = (short) anIntArray257[anInt3702 + 3];
						if (Static379.aShort89 <= 0) {
							Static379.aShort89 = 32767;
							return;
						}
						if (Static379.aShort89 < Static362.aShort86) {
							Static379.aShort89 = Static362.aShort86;
						}
						return;
					}
					if (arg0 == 6203) {
						Static532.method7159(Static593.aClass199_16.anInt4994, 0, 0, Static593.aClass199_16.anInt5035, false);
						anIntArray257[anInt3702++] = Static211.anInt10621;
						anIntArray257[anInt3702++] = Static509.anInt7968;
						return;
					}
					if (arg0 == 6204) {
						anIntArray257[anInt3702++] = Static142.aShort80;
						anIntArray257[anInt3702++] = Static634.aShort121;
						return;
					}
					if (arg0 == 6205) {
						anIntArray257[anInt3702++] = Static445.aShort96;
						anIntArray257[anInt3702++] = Static595.aShort115;
						return;
					}
				} else if (arg0 < 6400) {
					if (arg0 == 6300) {
						anIntArray257[anInt3702++] = (int) (Static429.method5935() / 60000L);
						return;
					}
					if (arg0 == 6301) {
						anIntArray257[anInt3702++] = (int) (Static429.method5935() / 86400000L) - 11745;
						return;
					}
					if (arg0 == 6302) {
						anInt3702 -= 3;
						local175 = anIntArray257[anInt3702];
						local776 = anIntArray257[anInt3702 + 1];
						local97 = anIntArray257[anInt3702 + 2];
						@Pc(6710) long local6710 = Static304.method8639(local175, local97, local776);
						local3369 = Static174.method2856(local6710);
						if (local97 < 1970) {
							local3369--;
						}
						anIntArray257[anInt3702++] = local3369;
						return;
					}
					if (arg0 == 6303) {
						anIntArray257[anInt3702++] = Static377.method4938(Static429.method5935());
						return;
					}
					if (arg0 == 6304) {
						local175 = anIntArray257[--anInt3702];
						local1496 = true;
						if (local175 < 0) {
							local1496 = (local175 + 1) % 4 == 0;
						} else if (local175 < 1582) {
							local1496 = local175 % 4 == 0;
						} else if (local175 % 4 != 0) {
							local1496 = false;
						} else if (local175 % 100 != 0) {
							local1496 = true;
						} else if (local175 % 400 != 0) {
							local1496 = false;
						}
						anIntArray257[anInt3702++] = local1496 ? 1 : 0;
						return;
					}
					if (arg0 == 6305) {
						local175 = anIntArray257[--anInt3702];
						@Pc(6828) int[] local6828 = Static144.method2497(local175);
						Static685.method6466(local6828, 0, anIntArray257, anInt3702, 3);
						anInt3702 += 3;
						return;
					}
					if (arg0 == 6306) {
						local175 = anIntArray257[--anInt3702];
						anIntArray257[anInt3702++] = (int) (Static670.method6029(local175) / 60000L);
						return;
					}
				} else if (arg0 < 6500) {
					if (arg0 == 6405) {
						anIntArray257[anInt3702++] = Static434.method6035() ? 1 : 0;
						return;
					}
					if (arg0 == 6406) {
						anIntArray257[anInt3702++] = Static116.method2146() ? 1 : 0;
						return;
					}
				} else if (arg0 < 6600) {
					if (arg0 == 6500) {
						if (Static656.anInt10356 == 7 && !Static71.method1514() && Static87.anInt1778 == 0) {
							if (Static512.aBoolean628) {
								anIntArray257[anInt3702++] = 0;
								return;
							}
							if (Static134.aLong84 > Static429.method5935() - 1000L) {
								anIntArray257[anInt3702++] = 1;
								return;
							}
							Static512.aBoolean628 = true;
							local52 = Static335.method4615(Static229.aClass216_71, Static669.aClass196_2);
							local52.aClass4_Sub11_Sub1_2.method8860(Static360.anInt6722);
							Static410.method5170(local52);
							anIntArray257[anInt3702++] = 0;
							return;
						}
						anIntArray257[anInt3702++] = 1;
						return;
					}
					@Pc(7014) Class308 local7014;
					@Pc(6981) Class22_Sub1 local6981;
					if (arg0 == 6501) {
						local6981 = Static566.method7508();
						if (local6981 != null) {
							anIntArray257[anInt3702++] = local6981.anInt1421;
							anIntArray257[anInt3702++] = local6981.anInt1414;
							aStringArray17[anInt3709++] = local6981.aString13;
							local7014 = local6981.method1434();
							anIntArray257[anInt3702++] = local7014.anInt7966;
							aStringArray17[anInt3709++] = local7014.aString99;
							anIntArray257[anInt3702++] = local6981.anInt1412;
							anIntArray257[anInt3702++] = local6981.anInt1419;
							aStringArray17[anInt3709++] = local6981.aString12;
							return;
						}
						anIntArray257[anInt3702++] = -1;
						anIntArray257[anInt3702++] = 0;
						aStringArray17[anInt3709++] = "";
						anIntArray257[anInt3702++] = 0;
						aStringArray17[anInt3709++] = "";
						anIntArray257[anInt3702++] = 0;
						anIntArray257[anInt3702++] = 0;
						aStringArray17[anInt3709++] = "";
						return;
					}
					if (arg0 == 6502) {
						local6981 = Static100.method2024();
						if (local6981 != null) {
							anIntArray257[anInt3702++] = local6981.anInt1421;
							anIntArray257[anInt3702++] = local6981.anInt1414;
							aStringArray17[anInt3709++] = local6981.aString13;
							local7014 = local6981.method1434();
							anIntArray257[anInt3702++] = local7014.anInt7966;
							aStringArray17[anInt3709++] = local7014.aString99;
							anIntArray257[anInt3702++] = local6981.anInt1412;
							anIntArray257[anInt3702++] = local6981.anInt1419;
							aStringArray17[anInt3709++] = local6981.aString12;
							return;
						}
						anIntArray257[anInt3702++] = -1;
						anIntArray257[anInt3702++] = 0;
						aStringArray17[anInt3709++] = "";
						anIntArray257[anInt3702++] = 0;
						aStringArray17[anInt3709++] = "";
						anIntArray257[anInt3702++] = 0;
						anIntArray257[anInt3702++] = 0;
						aStringArray17[anInt3709++] = "";
						return;
					}
					if (arg0 == 6503) {
						local175 = anIntArray257[--anInt3702];
						local89 = aStringArray17[--anInt3709];
						if (Static656.anInt10356 == 7 && !Static71.method1514() && Static87.anInt1778 == 0) {
							anIntArray257[anInt3702++] = Static606.method7952(local175, local89) ? 1 : 0;
							return;
						}
						anIntArray257[anInt3702++] = 0;
						return;
					}
					if (arg0 == 6506) {
						local175 = anIntArray257[--anInt3702];
						@Pc(7342) Class22_Sub1 local7342 = Static271.method3931(local175);
						if (local7342 != null) {
							anIntArray257[anInt3702++] = local7342.anInt1414;
							aStringArray17[anInt3709++] = local7342.aString13;
							@Pc(7366) Class308 local7366 = local7342.method1434();
							anIntArray257[anInt3702++] = local7366.anInt7966;
							aStringArray17[anInt3709++] = local7366.aString99;
							anIntArray257[anInt3702++] = local7342.anInt1412;
							anIntArray257[anInt3702++] = local7342.anInt1419;
							aStringArray17[anInt3709++] = local7342.aString12;
							return;
						}
						anIntArray257[anInt3702++] = -1;
						aStringArray17[anInt3709++] = "";
						anIntArray257[anInt3702++] = 0;
						aStringArray17[anInt3709++] = "";
						anIntArray257[anInt3702++] = 0;
						anIntArray257[anInt3702++] = 0;
						aStringArray17[anInt3709++] = "";
						return;
					}
					if (arg0 == 6507) {
						anInt3702 -= 4;
						local175 = anIntArray257[anInt3702];
						local1496 = anIntArray257[anInt3702 + 1] == 1;
						local97 = anIntArray257[anInt3702 + 2];
						local2205 = anIntArray257[anInt3702 + 3] == 1;
						Static481.method6597(local1496, local175, local2205, local97);
						return;
					}
					if (arg0 == 6508) {
						Static221.method3264();
						return;
					}
					if (arg0 == 6509) {
						if (Static656.anInt10356 != 7) {
							return;
						}
						Static92.aBoolean127 = anIntArray257[--anInt3702] == 1;
						return;
					}
					if (arg0 == 6510) {
						anIntArray257[anInt3702++] = Static255.anInt4152;
						return;
					}
				} else if (arg0 >= 6700) {
					if (arg0 < 6800 && Static88.aClass288_1 == Static331.aClass288_3) {
						if (arg0 == 6700) {
							local175 = Static242.aClass66_17.method1990();
							if (Static77.anInt1630 != -1) {
								local175++;
							}
							anIntArray257[anInt3702++] = local175;
							return;
						}
						if (arg0 == 6701) {
							local175 = anIntArray257[--anInt3702];
							if (Static77.anInt1630 != -1) {
								if (local175 == 0) {
									anIntArray257[anInt3702++] = Static77.anInt1630;
									return;
								}
								local175--;
							}
							@Pc(7614) Class4_Sub28 local7614 = (Class4_Sub28) Static242.aClass66_17.method1992();
							while (local175-- > 0) {
								local7614 = (Class4_Sub28) Static242.aClass66_17.method1984();
							}
							anIntArray257[anInt3702++] = local7614.anInt4697;
							return;
						}
						if (arg0 == 6702) {
							local175 = anIntArray257[--anInt3702];
							if (Static392.aClass199ArrayArray2[local175] == null) {
								aStringArray17[anInt3709++] = "";
								return;
							}
							local89 = Static392.aClass199ArrayArray2[local175][0].aString53;
							if (local89 == null) {
								aStringArray17[anInt3709++] = "";
								return;
							}
							aStringArray17[anInt3709++] = local89.substring(0, local89.indexOf(58));
							return;
						}
						if (arg0 == 6703) {
							local175 = anIntArray257[--anInt3702];
							if (Static392.aClass199ArrayArray2[local175] == null) {
								anIntArray257[anInt3702++] = 0;
								return;
							}
							anIntArray257[anInt3702++] = Static392.aClass199ArrayArray2[local175].length;
							return;
						}
						if (arg0 == 6704) {
							anInt3702 -= 2;
							local175 = anIntArray257[anInt3702];
							local776 = anIntArray257[anInt3702 + 1];
							if (Static392.aClass199ArrayArray2[local175] == null) {
								aStringArray17[anInt3709++] = "";
								return;
							}
							local181 = Static392.aClass199ArrayArray2[local175][local776].aString53;
							if (local181 == null) {
								aStringArray17[anInt3709++] = "";
								return;
							}
							aStringArray17[anInt3709++] = local181;
							return;
						}
						if (arg0 == 6705) {
							anInt3702 -= 2;
							local175 = anIntArray257[anInt3702];
							local776 = anIntArray257[anInt3702 + 1];
							if (Static392.aClass199ArrayArray2[local175] == null) {
								anIntArray257[anInt3702++] = 0;
								return;
							}
							anIntArray257[anInt3702++] = Static392.aClass199ArrayArray2[local175][local776].anInt5009;
							return;
						}
						if (arg0 == 6706) {
							return;
						}
						if (arg0 == 6707) {
							anInt3702 -= 3;
							local175 = anIntArray257[anInt3702];
							local776 = anIntArray257[anInt3702 + 1];
							local97 = anIntArray257[anInt3702 + 2];
							Static331.method4566(local97, local175 << 16 | local776, "", 1);
							return;
						}
						if (arg0 == 6708) {
							anInt3702 -= 3;
							local175 = anIntArray257[anInt3702];
							local776 = anIntArray257[anInt3702 + 1];
							local97 = anIntArray257[anInt3702 + 2];
							Static331.method4566(local97, local175 << 16 | local776, "", 2);
							return;
						}
						if (arg0 == 6709) {
							anInt3702 -= 3;
							local175 = anIntArray257[anInt3702];
							local776 = anIntArray257[anInt3702 + 1];
							local97 = anIntArray257[anInt3702 + 2];
							Static331.method4566(local97, local175 << 16 | local776, "", 3);
							return;
						}
						if (arg0 == 6710) {
							anInt3702 -= 3;
							local175 = anIntArray257[anInt3702];
							local776 = anIntArray257[anInt3702 + 1];
							local97 = anIntArray257[anInt3702 + 2];
							Static331.method4566(local97, local175 << 16 | local776, "", 4);
							return;
						}
						if (arg0 == 6711) {
							anInt3702 -= 3;
							local175 = anIntArray257[anInt3702];
							local776 = anIntArray257[anInt3702 + 1];
							local97 = anIntArray257[anInt3702 + 2];
							Static331.method4566(local97, local175 << 16 | local776, "", 5);
							return;
						}
						if (arg0 == 6712) {
							anInt3702 -= 3;
							local175 = anIntArray257[anInt3702];
							local776 = anIntArray257[anInt3702 + 1];
							local97 = anIntArray257[anInt3702 + 2];
							Static331.method4566(local97, local175 << 16 | local776, "", 6);
							return;
						}
						if (arg0 == 6713) {
							anInt3702 -= 3;
							local175 = anIntArray257[anInt3702];
							local776 = anIntArray257[anInt3702 + 1];
							local97 = anIntArray257[anInt3702 + 2];
							Static331.method4566(local97, local175 << 16 | local776, "", 7);
							return;
						}
						if (arg0 == 6714) {
							anInt3702 -= 3;
							local175 = anIntArray257[anInt3702];
							local776 = anIntArray257[anInt3702 + 1];
							local97 = anIntArray257[anInt3702 + 2];
							Static331.method4566(local97, local175 << 16 | local776, "", 8);
							return;
						}
						if (arg0 == 6715) {
							anInt3702 -= 3;
							local175 = anIntArray257[anInt3702];
							local776 = anIntArray257[anInt3702 + 1];
							local97 = anIntArray257[anInt3702 + 2];
							Static331.method4566(local97, local175 << 16 | local776, "", 9);
							return;
						}
						if (arg0 == 6716) {
							anInt3702 -= 3;
							local175 = anIntArray257[anInt3702];
							local776 = anIntArray257[anInt3702 + 1];
							local97 = anIntArray257[anInt3702 + 2];
							Static331.method4566(local97, local175 << 16 | local776, "", 10);
							return;
						}
						if (arg0 == 6717) {
							anInt3702 -= 3;
							local175 = anIntArray257[anInt3702];
							local776 = anIntArray257[anInt3702 + 1];
							local97 = anIntArray257[anInt3702 + 2];
							@Pc(8202) Class199 local8202 = Static203.method3070(local97, local175 << 16 | local776);
							Static124.method2204();
							@Pc(8207) Class4_Sub10 local8207 = Static75.method1604(local8202);
							Static200.method3058(local8207.anInt889, local8207.method815(), local8202);
							return;
						}
					} else if (arg0 < 6900) {
						@Pc(8235) Class259 local8235;
						if (arg0 == 6800) {
							local175 = anIntArray257[--anInt3702];
							local8235 = Static526.aClass59_4.method1798(local175);
							if (local8235.aString80 == null) {
								aStringArray17[anInt3709++] = "";
								return;
							}
							aStringArray17[anInt3709++] = local8235.aString80;
							return;
						}
						if (arg0 == 6801) {
							local175 = anIntArray257[--anInt3702];
							local8235 = Static526.aClass59_4.method1798(local175);
							anIntArray257[anInt3702++] = local8235.anInt6678;
							return;
						}
						if (arg0 == 6802) {
							local175 = anIntArray257[--anInt3702];
							local8235 = Static526.aClass59_4.method1798(local175);
							anIntArray257[anInt3702++] = local8235.anInt6685;
							return;
						}
						if (arg0 == 6803) {
							local175 = anIntArray257[--anInt3702];
							local8235 = Static526.aClass59_4.method1798(local175);
							anIntArray257[anInt3702++] = local8235.anInt6670;
							return;
						}
						if (arg0 == 6804) {
							anInt3702 -= 2;
							local175 = anIntArray257[anInt3702];
							local776 = anIntArray257[anInt3702 + 1];
							@Pc(8357) Class257 local8357 = Static482.aClass84_2.method2152(local776);
							if (local8357.method5757()) {
								aStringArray17[anInt3709++] = Static526.aClass59_4.method1798(local175).method5872(local8357.aString77, local776);
								return;
							}
							anIntArray257[anInt3702++] = Static526.aClass59_4.method1798(local175).method5871(local776, local8357.anInt6617);
							return;
						}
					} else if (arg0 < 7000) {
						if (arg0 == 6900) {
							anIntArray257[anInt3702++] = Static197.aBoolean408 && !Static263.aBoolean317 ? 1 : 0;
							return;
						}
						if (arg0 == 6901) {
							anIntArray257[anInt3702++] = (int) (Static127.aLong83 / 60000L);
							anIntArray257[anInt3702++] = (int) ((Static127.aLong83 - Static429.method5935() - Static419.aLong192) / 60000L);
							anIntArray257[anInt3702++] = Static664.aBoolean795 ? 1 : 0;
							return;
						}
						if (arg0 == 6902) {
							anIntArray257[anInt3702++] = Static394.anInt5899;
							return;
						}
						if (arg0 == 6903) {
							anIntArray257[anInt3702++] = Static223.anInt3551;
							return;
						}
						if (arg0 == 6904) {
							anIntArray257[anInt3702++] = Static393.anInt5780;
							return;
						}
						if (arg0 == 6905) {
							local83 = "";
							if (Static431.aClass281_4 != null) {
								if (Static431.aClass281_4.anObject17 == null) {
									local83 = Static179.method2892(Static431.aClass281_4.anInt7337);
								} else {
									local83 = (String) Static431.aClass281_4.anObject17;
								}
							}
							aStringArray17[anInt3709++] = local83;
							return;
						}
						if (arg0 == 6906) {
							anIntArray257[anInt3702++] = Static209.anInt3390;
							return;
						}
						if (arg0 == 6907) {
							anIntArray257[anInt3702++] = Static100.anInt2071;
							return;
						}
						if (arg0 == 6908) {
							anIntArray257[anInt3702++] = Static430.anInt6773;
							return;
						}
						if (arg0 == 6909) {
							anIntArray257[anInt3702++] = Static472.aBoolean588 ? 1 : 0;
							return;
						}
						if (arg0 == 6910) {
							anIntArray257[anInt3702++] = Static34.anInt9717;
							return;
						}
						if (arg0 == 6911) {
							anIntArray257[anInt3702++] = Static208.anInt3381;
							return;
						}
						if (arg0 == 6912) {
							anIntArray257[anInt3702++] = Static310.anInt4841;
							return;
						}
						if (arg0 == 6913) {
							anIntArray257[anInt3702++] = Static235.anInt5515;
							return;
						}
					} else if (arg0 < 7100) {
						if (arg0 == 7000) {
							local175 = Static653.method8707();
							anIntArray257[anInt3702++] = Static592.anInt9105 = Static124.aClass4_Sub20_4.aClass8_Sub13_2.method5052();
							anIntArray257[anInt3702++] = local175;
							Static270.method3888();
							Static361.method4808();
							Static391.aBoolean438 = false;
							return;
						}
						if (arg0 == 7001) {
							Static486.method6643();
							Static270.method3888();
							Static361.method4808();
							Static391.aBoolean438 = false;
							return;
						}
						if (arg0 == 7002) {
							Static331.method4564();
							Static270.method3888();
							Static361.method4808();
							Static391.aBoolean438 = false;
							return;
						}
						if (arg0 == 7003) {
							Static38.method7844();
							Static270.method3888();
							Static361.method4808();
							Static391.aBoolean438 = false;
							return;
						}
						if (arg0 == 7004) {
							Static539.method7210();
							Static270.method3888();
							Static361.method4808();
							Static391.aBoolean438 = false;
							return;
						}
						if (arg0 == 7005) {
							Static124.aClass4_Sub20_4.method3147(Static124.aClass4_Sub20_4.aClass8_Sub23_1, 0);
							Static361.method4808();
							Static391.aBoolean438 = false;
							return;
						}
						if (arg0 == 7006) {
							if (Static592.anInt9105 == 2) {
								Static357.aBoolean407 = true;
								return;
							}
							if (Static592.anInt9105 == 1) {
								Static376.aBoolean422 = true;
								return;
							}
							if (Static592.anInt9105 == 3) {
								Static431.aBoolean528 = true;
							}
							return;
						}
						if (arg0 == 7007) {
							anIntArray257[anInt3702++] = Static124.aClass4_Sub20_4.aClass8_Sub23_1.method7615();
							return;
						}
					} else if (arg0 < 7200) {
						if (arg0 == 7100) {
							anInt3702 -= 2;
							local175 = anIntArray257[anInt3702];
							local776 = anIntArray257[anInt3702 + 1];
							if (local175 != -1) {
								if (local776 > 255) {
									local776 = 255;
								} else if (local776 < 0) {
									local776 = 0;
								}
								Static470.method6501(local175, false, local776);
							}
							return;
						}
						if (arg0 == 7101) {
							local175 = anIntArray257[--anInt3702];
							if (local175 != -1) {
								Static343.method4655(local175);
							}
							return;
						}
						if (arg0 == 7102) {
							local175 = anIntArray257[--anInt3702];
							if (local175 != -1) {
								Static426.method5914(local175);
							}
							return;
						}
						if (arg0 == 7103) {
							anIntArray257[anInt3702++] = Static571.method7587("jagtheora") ? 1 : 0;
							return;
						}
					} else if (arg0 < 7300) {
						if (arg0 == 7201) {
							anIntArray257[anInt3702++] = Static124.aClass4_Sub20_4.aClass8_Sub24_1.method7742() ? 1 : 0;
							return;
						}
						if (arg0 == 7202) {
							anIntArray257[anInt3702++] = Static124.aClass4_Sub20_4.aClass8_Sub19_1.method6695() ? 1 : 0;
							return;
						}
						if (arg0 == 7203) {
							anIntArray257[anInt3702++] = Static124.aClass4_Sub20_4.aClass8_Sub8_1.method3576() ? 1 : 0;
							return;
						}
						if (arg0 == 7204) {
							anIntArray257[anInt3702++] = Static124.aClass4_Sub20_4.aClass8_Sub12_1.method4651() ? 1 : 0;
							return;
						}
						if (arg0 == 7205) {
							anIntArray257[anInt3702++] = Static124.aClass4_Sub20_4.aClass8_Sub27_1.method7981() && Static582.aClass33_13.method8114() ? 1 : 0;
							return;
						}
						if (arg0 == 7206) {
							anIntArray257[anInt3702++] = Static124.aClass4_Sub20_4.aClass8_Sub14_1.method5188() ? 1 : 0;
							return;
						}
						if (arg0 == 7207) {
							anIntArray257[anInt3702++] = Static124.aClass4_Sub20_4.aClass8_Sub26_1.method7945() ? 1 : 0;
							return;
						}
						if (arg0 == 7208) {
							anIntArray257[anInt3702++] = Static124.aClass4_Sub20_4.aClass8_Sub29_1.method8391() && Static582.aClass33_13.method8107() ? 1 : 0;
							return;
						}
						if (arg0 == 7209) {
							anIntArray257[anInt3702++] = Static124.aClass4_Sub20_4.aClass8_Sub6_1.method3084() ? 1 : 0;
							return;
						}
						if (arg0 == 7210) {
							anIntArray257[anInt3702++] = Static124.aClass4_Sub20_4.aClass8_Sub2_1.method1356() ? 1 : 0;
							return;
						}
						if (arg0 == 7211) {
							anIntArray257[anInt3702++] = Static124.aClass4_Sub20_4.aClass8_Sub18_1.method6656() ? 1 : 0;
							return;
						}
						if (arg0 == 7212) {
							anIntArray257[anInt3702++] = Static124.aClass4_Sub20_4.aClass8_Sub25_1.method7778() ? 1 : 0;
							return;
						}
						if (arg0 == 7213) {
							anIntArray257[anInt3702++] = Static124.aClass4_Sub20_4.aClass8_Sub15_1.method6052() ? 1 : 0;
							return;
						}
						if (arg0 == 7214) {
							anIntArray257[anInt3702++] = Static124.aClass4_Sub20_4.aClass8_Sub13_1.method5057() ? 1 : 0;
							return;
						}
					} else if (arg0 < 7400) {
						if (arg0 == 7301) {
							local175 = anIntArray257[--anInt3702];
							anIntArray257[anInt3702++] = Static124.aClass4_Sub20_4.aClass8_Sub24_1.method8387(local175);
							return;
						}
						if (arg0 == 7302) {
							local175 = anIntArray257[--anInt3702];
							anIntArray257[anInt3702++] = Static124.aClass4_Sub20_4.aClass8_Sub19_1.method8387(local175);
							return;
						}
						if (arg0 == 7303) {
							local175 = anIntArray257[--anInt3702];
							anIntArray257[anInt3702++] = Static124.aClass4_Sub20_4.aClass8_Sub8_1.method8387(local175);
							return;
						}
						if (arg0 == 7304) {
							local175 = anIntArray257[--anInt3702];
							anIntArray257[anInt3702++] = Static124.aClass4_Sub20_4.aClass8_Sub12_1.method8387(local175);
							return;
						}
						if (arg0 == 7305) {
							local175 = anIntArray257[--anInt3702];
							if (!Static582.aClass33_13.method8114()) {
								anIntArray257[anInt3702++] = 3;
								return;
							}
							anIntArray257[anInt3702++] = Static124.aClass4_Sub20_4.aClass8_Sub27_1.method8387(local175);
							return;
						}
						if (arg0 == 7306) {
							local175 = anIntArray257[--anInt3702];
							anIntArray257[anInt3702++] = Static124.aClass4_Sub20_4.aClass8_Sub14_1.method8387(local175);
							return;
						}
						if (arg0 == 7307) {
							local175 = anIntArray257[--anInt3702];
							anIntArray257[anInt3702++] = Static124.aClass4_Sub20_4.aClass8_Sub26_1.method8387(local175);
							return;
						}
						if (arg0 == 7308) {
							local175 = anIntArray257[--anInt3702];
							if (!Static582.aClass33_13.method8107()) {
								anIntArray257[anInt3702++] = 3;
								return;
							}
							anIntArray257[anInt3702++] = Static124.aClass4_Sub20_4.aClass8_Sub29_1.method8387(local175);
							return;
						}
						if (arg0 == 7309) {
							local175 = anIntArray257[--anInt3702];
							anIntArray257[anInt3702++] = Static124.aClass4_Sub20_4.aClass8_Sub6_1.method8387(local175);
							return;
						}
						if (arg0 == 7310) {
							local175 = anIntArray257[--anInt3702];
							anIntArray257[anInt3702++] = Static124.aClass4_Sub20_4.aClass8_Sub2_1.method8387(local175);
							return;
						}
						if (arg0 == 7311) {
							local175 = anIntArray257[--anInt3702];
							anIntArray257[anInt3702++] = Static124.aClass4_Sub20_4.aClass8_Sub18_1.method8387(local175);
							return;
						}
						if (arg0 == 7312) {
							local175 = anIntArray257[--anInt3702];
							anIntArray257[anInt3702++] = Static124.aClass4_Sub20_4.aClass8_Sub25_1.method8387(local175);
							return;
						}
						if (arg0 == 7313) {
							local175 = anIntArray257[--anInt3702];
							anIntArray257[anInt3702++] = Static124.aClass4_Sub20_4.aClass8_Sub15_1.method8387(local175);
							return;
						}
						if (arg0 == 7314) {
							local175 = anIntArray257[--anInt3702];
							anIntArray257[anInt3702++] = Static124.aClass4_Sub20_4.aClass8_Sub13_1.method8387(local175);
							return;
						}
					}
				}
			}
		}
		throw new IllegalStateException(String.valueOf(arg0));
	}

	@OriginalMember(owner = "client!hw", name = "c", descriptor = "(I)Ljava/lang/String;")
	private static String method3383(@OriginalArg(0) int arg0) {
		@Pc(9) String local9 = aClass267_3.method5949(Static333.aClass234_5.anInt5621 << 16 | arg0);
		return local9 == null ? "" : local9;
	}

	@OriginalMember(owner = "client!hw", name = "a", descriptor = "(Ljava/lang/String;I)V")
	private static void method3384(@OriginalArg(0) String arg0, @OriginalArg(1) int arg1) {
		if (Static279.anInt4498 == 0 && (Static197.aBoolean408 && !Static263.aBoolean317 || Static42.aBoolean75)) {
			return;
		}
		@Pc(11) String local11 = arg0.toLowerCase();
		@Pc(13) byte local13 = 0;
		if (local11.startsWith(Static279.aClass179_47.method4066(0))) {
			local13 = 0;
			arg0 = arg0.substring(Static279.aClass179_47.method4066(0).length());
		} else if (local11.startsWith(Static279.aClass179_48.method4066(0))) {
			local13 = 1;
			arg0 = arg0.substring(Static279.aClass179_48.method4066(0).length());
		} else if (local11.startsWith(Static279.aClass179_49.method4066(0))) {
			local13 = 2;
			arg0 = arg0.substring(Static279.aClass179_49.method4066(0).length());
		} else if (local11.startsWith(Static279.aClass179_50.method4066(0))) {
			local13 = 3;
			arg0 = arg0.substring(Static279.aClass179_50.method4066(0).length());
		} else if (local11.startsWith(Static279.aClass179_51.method4066(0))) {
			local13 = 4;
			arg0 = arg0.substring(Static279.aClass179_51.method4066(0).length());
		} else if (local11.startsWith(Static279.aClass179_52.method4066(0))) {
			local13 = 5;
			arg0 = arg0.substring(Static279.aClass179_52.method4066(0).length());
		} else if (local11.startsWith(Static279.aClass179_53.method4066(0))) {
			local13 = 6;
			arg0 = arg0.substring(Static279.aClass179_53.method4066(0).length());
		} else if (local11.startsWith(Static279.aClass179_54.method4066(0))) {
			local13 = 7;
			arg0 = arg0.substring(Static279.aClass179_54.method4066(0).length());
		} else if (local11.startsWith(Static279.aClass179_55.method4066(0))) {
			local13 = 8;
			arg0 = arg0.substring(Static279.aClass179_55.method4066(0).length());
		} else if (local11.startsWith(Static279.aClass179_56.method4066(0))) {
			local13 = 9;
			arg0 = arg0.substring(Static279.aClass179_56.method4066(0).length());
		} else if (local11.startsWith(Static279.aClass179_57.method4066(0))) {
			local13 = 10;
			arg0 = arg0.substring(Static279.aClass179_57.method4066(0).length());
		} else if (local11.startsWith(Static279.aClass179_58.method4066(0))) {
			local13 = 11;
			arg0 = arg0.substring(Static279.aClass179_58.method4066(0).length());
		} else if (Static164.anInt2984 != 0) {
			if (local11.startsWith(Static279.aClass179_47.method4066(Static164.anInt2984))) {
				local13 = 0;
				arg0 = arg0.substring(Static279.aClass179_47.method4066(Static164.anInt2984).length());
			} else if (local11.startsWith(Static279.aClass179_48.method4066(Static164.anInt2984))) {
				local13 = 1;
				arg0 = arg0.substring(Static279.aClass179_48.method4066(Static164.anInt2984).length());
			} else if (local11.startsWith(Static279.aClass179_49.method4066(Static164.anInt2984))) {
				local13 = 2;
				arg0 = arg0.substring(Static279.aClass179_49.method4066(Static164.anInt2984).length());
			} else if (local11.startsWith(Static279.aClass179_50.method4066(Static164.anInt2984))) {
				local13 = 3;
				arg0 = arg0.substring(Static279.aClass179_50.method4066(Static164.anInt2984).length());
			} else if (local11.startsWith(Static279.aClass179_51.method4066(Static164.anInt2984))) {
				local13 = 4;
				arg0 = arg0.substring(Static279.aClass179_51.method4066(Static164.anInt2984).length());
			} else if (local11.startsWith(Static279.aClass179_52.method4066(Static164.anInt2984))) {
				local13 = 5;
				arg0 = arg0.substring(Static279.aClass179_52.method4066(Static164.anInt2984).length());
			} else if (local11.startsWith(Static279.aClass179_53.method4066(Static164.anInt2984))) {
				local13 = 6;
				arg0 = arg0.substring(Static279.aClass179_53.method4066(Static164.anInt2984).length());
			} else if (local11.startsWith(Static279.aClass179_54.method4066(Static164.anInt2984))) {
				local13 = 7;
				arg0 = arg0.substring(Static279.aClass179_54.method4066(Static164.anInt2984).length());
			} else if (local11.startsWith(Static279.aClass179_55.method4066(Static164.anInt2984))) {
				local13 = 8;
				arg0 = arg0.substring(Static279.aClass179_55.method4066(Static164.anInt2984).length());
			} else if (local11.startsWith(Static279.aClass179_56.method4066(Static164.anInt2984))) {
				local13 = 9;
				arg0 = arg0.substring(Static279.aClass179_56.method4066(Static164.anInt2984).length());
			} else if (local11.startsWith(Static279.aClass179_57.method4066(Static164.anInt2984))) {
				local13 = 10;
				arg0 = arg0.substring(Static279.aClass179_57.method4066(Static164.anInt2984).length());
			} else if (local11.startsWith(Static279.aClass179_58.method4066(Static164.anInt2984))) {
				local13 = 11;
				arg0 = arg0.substring(Static279.aClass179_58.method4066(Static164.anInt2984).length());
			}
		}
		local11 = arg0.toLowerCase();
		@Pc(451) byte local451 = 0;
		if (local11.startsWith(Static279.aClass179_59.method4066(0))) {
			local451 = 1;
			arg0 = arg0.substring(Static279.aClass179_59.method4066(0).length());
		} else if (local11.startsWith(Static279.aClass179_60.method4066(0))) {
			local451 = 2;
			arg0 = arg0.substring(Static279.aClass179_60.method4066(0).length());
		} else if (local11.startsWith(Class179.lb.method4066(0))) {
			local451 = 3;
			arg0 = arg0.substring(Class179.lb.method4066(0).length());
		} else if (local11.startsWith(Static279.aClass179_61.method4066(0))) {
			local451 = 4;
			arg0 = arg0.substring(Static279.aClass179_61.method4066(0).length());
		} else if (local11.startsWith(Static279.aClass179_62.method4066(0))) {
			local451 = 5;
			arg0 = arg0.substring(Static279.aClass179_62.method4066(0).length());
		} else if (Static164.anInt2984 != 0) {
			if (local11.startsWith(Static279.aClass179_59.method4066(Static164.anInt2984))) {
				local451 = 1;
				arg0 = arg0.substring(Static279.aClass179_59.method4066(Static164.anInt2984).length());
			} else if (local11.startsWith(Static279.aClass179_60.method4066(Static164.anInt2984))) {
				local451 = 2;
				arg0 = arg0.substring(Static279.aClass179_60.method4066(Static164.anInt2984).length());
			} else if (local11.startsWith(Class179.lb.method4066(Static164.anInt2984))) {
				local451 = 3;
				arg0 = arg0.substring(Class179.lb.method4066(Static164.anInt2984).length());
			} else if (local11.startsWith(Static279.aClass179_61.method4066(Static164.anInt2984))) {
				local451 = 4;
				arg0 = arg0.substring(Static279.aClass179_61.method4066(Static164.anInt2984).length());
			} else if (local11.startsWith(Static279.aClass179_62.method4066(Static164.anInt2984))) {
				local451 = 5;
				arg0 = arg0.substring(Static279.aClass179_62.method4066(Static164.anInt2984).length());
			}
		}
		@Pc(641) Class4_Sub48 local641 = Static335.method4615(Static482.aClass216_122, Static669.aClass196_2);
		local641.aClass4_Sub11_Sub1_2.method8822(0);
		@Pc(650) int local650 = local641.aClass4_Sub11_Sub1_2.anInt10466;
		local641.aClass4_Sub11_Sub1_2.method8822(local13);
		local641.aClass4_Sub11_Sub1_2.method8822(local451);
		Static519.method7021(local641.aClass4_Sub11_Sub1_2, arg0);
		local641.aClass4_Sub11_Sub1_2.method8835(local641.aClass4_Sub11_Sub1_2.anInt10466 - local650);
		Static410.method5170(local641);
	}

	@OriginalMember(owner = "client!hw", name = "a", descriptor = "(C)I")
	private static int method3385(@OriginalArg(0) char arg0) {
		return Static329.method4557(arg0) ? 1 : 0;
	}

	@OriginalMember(owner = "client!hw", name = "a", descriptor = "(Lclient!oh;II)V")
	public static void method3386(@OriginalArg(0) Class268 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(5) Class4_Sub5_Sub4 local5 = Static631.method8449(arg2, arg1, arg0);
		if (local5 == null) {
			return;
		}
		anIntArray259 = new int[local5.anInt1084];
		aStringArray18 = new String[local5.anInt1085];
		if (local5.aClass268_9 == Static125.aClass268_14 || local5.aClass268_9 == Static553.aClass268_35 || local5.aClass268_9 == Static490.aClass268_45) {
			@Pc(30) int local30 = 0;
			@Pc(32) int local32 = 0;
			if (Static277.aClass199_7 != null) {
				local30 = Static277.aClass199_7.anInt4973;
				local32 = Static277.aClass199_7.anInt5028;
			}
			anIntArray259[0] = Static373.aClass161_1.method5903() - local30;
			anIntArray259[1] = Static373.aClass161_1.method5898() - local32;
		}
		method3381(local5, 200000);
	}

	@OriginalMember(owner = "client!hw", name = "d", descriptor = "(I)I")
	private static int method3387(@OriginalArg(0) int arg0) {
		@Pc(4) Class347 local4 = Static315.aClass135_1.method3025(arg0);
		if (local4 == null) {
			throw new RuntimeException("sr-c113");
		}
		@Pc(26) Integer local26 = aClass267_3.method5958(Static333.aClass234_5.anInt5621 << 16 | local4.anInt8881, local4.anInt8880, local4.anInt8884);
		return local26 == null ? 0 : local26;
	}

	@OriginalMember(owner = "client!hw", name = "e", descriptor = "(I)V")
	private static void method3388(@OriginalArg(0) int arg0) {
		@Pc(3) Class199 local3 = Static569.method7534(arg0);
		if (local3 == null) {
			return;
		}
		@Pc(9) int local9 = arg0 >>> 16;
		@Pc(13) Class199[] local13 = Static269.aClass199ArrayArray1[local9];
		if (local13 == null) {
			@Pc(19) Class199[] local19 = Static392.aClass199ArrayArray2[local9];
			@Pc(22) int local22 = local19.length;
			local13 = Static269.aClass199ArrayArray1[local9] = new Class199[local22];
			Static685.method6469(local19, 0, local13, 0, local19.length);
		}
		@Pc(38) int local38;
		for (local38 = 0; local38 < local13.length && local13[local38] != local3; local38++) {
		}
		if (local38 >= local13.length) {
			return;
		}
		Static685.method6469(local13, 0, local13, 1, local38);
		local13[0] = local3;
	}

	@OriginalMember(owner = "client!hw", name = "a", descriptor = "()V")
	public static void method3389() {
	}

	@OriginalMember(owner = "client!hw", name = "c", descriptor = "(IZ)V")
	private static void method3390(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1) {
		@Pc(137) Class199 local137;
		@Pc(25) int local25;
		@Pc(56) int local56;
		@Pc(19) int local19;
		@Pc(35) Class199 local35;
		@Pc(158) Class199 local158;
		@Pc(210) Class199 local210;
		@Pc(13) int local13;
		if (arg0 < 300) {
			if (arg0 == 150) {
				anInt3702 -= 3;
				local13 = anIntArray257[anInt3702];
				local19 = anIntArray257[anInt3702 + 1];
				local25 = anIntArray257[anInt3702 + 2];
				if (local19 == 0) {
					throw new RuntimeException();
				}
				local35 = Static569.method7534(local13);
				if (local35.aClass199Array1 == null) {
					local35.aClass199Array1 = new Class199[local25 + 1];
				}
				if (local35.aClass199Array1.length <= local25) {
					@Pc(54) Class199[] local54 = new Class199[local25 + 1];
					for (local56 = 0; local56 < local35.aClass199Array1.length; local56++) {
						local54[local56] = local35.aClass199Array1[local56];
					}
					local35.aClass199Array1 = local54;
				}
				if (local25 > 0 && local35.aClass199Array1[local25 - 1] == null) {
					throw new RuntimeException("Gap at:" + (local25 - 1));
				}
				@Pc(99) Class199 local99 = new Class199();
				local99.anInt4966 = local19;
				local99.anInt4982 = local99.anInt5041 = local35.anInt5041;
				local99.anInt5005 = local25;
				local35.aClass199Array1[local25] = local99;
				if (arg1) {
					aClass199_3 = local99;
				} else {
					aClass199_4 = local99;
				}
				Static331.method4565(local35);
				return;
			}
			if (arg0 == 151) {
				local137 = arg1 ? aClass199_3 : aClass199_4;
				if (local137.anInt5005 == -1) {
					if (arg1) {
						throw new RuntimeException("Tried to .cc_delete static .active-component!");
					}
					throw new RuntimeException("Tried to cc_delete static active-component!");
				}
				local158 = Static569.method7534(local137.anInt5041);
				local158.aClass199Array1[local137.anInt5005] = null;
				Static331.method4565(local158);
				return;
			}
			if (arg0 == 152) {
				local137 = Static569.method7534(anIntArray257[--anInt3702]);
				local137.aClass199Array1 = null;
				Static331.method4565(local137);
				return;
			}
			if (arg0 == 200) {
				anInt3702 -= 2;
				local13 = anIntArray257[anInt3702];
				local19 = anIntArray257[anInt3702 + 1];
				local210 = Static203.method3070(local19, local13);
				if (local210 != null && local19 != -1) {
					anIntArray257[anInt3702++] = 1;
					if (arg1) {
						aClass199_3 = local210;
						return;
					}
					aClass199_4 = local210;
					return;
				}
				anIntArray257[anInt3702++] = 0;
				return;
			}
			if (arg0 == 201) {
				local13 = anIntArray257[--anInt3702];
				local158 = Static569.method7534(local13);
				if (local158 != null) {
					anIntArray257[anInt3702++] = 1;
					if (arg1) {
						aClass199_3 = local158;
						return;
					}
					aClass199_4 = local158;
					return;
				}
				anIntArray257[anInt3702++] = 0;
				return;
			}
			if (arg0 == 202) {
				local13 = anIntArray257[--anInt3702];
				method3378(local13);
				return;
			}
			if (arg0 == 203) {
				local13 = anIntArray257[--anInt3702];
				method3388(local13);
				return;
			}
		} else {
			@Pc(357) int local357;
			@Pc(420) boolean local420;
			if (arg0 < 500) {
				if (arg0 == 403) {
					anInt3702 -= 2;
					local13 = anIntArray257[anInt3702];
					local19 = anIntArray257[anInt3702 + 1];
					if (Static554.aClass3_Sub1_Sub2_Sub2_Sub1_4.aClass245_1 == null) {
						return;
					}
					for (local25 = 0; local25 < Static606.anIntArray656.length; local25++) {
						if (Static606.anIntArray656[local25] == local13) {
							Static554.aClass3_Sub1_Sub2_Sub2_Sub1_4.aClass245_1.method5058(local19, local25, Static511.aClass254_1);
							return;
						}
					}
					for (local357 = 0; local357 < Static22.anIntArray682.length; local357++) {
						if (Static22.anIntArray682[local357] == local13) {
							Static554.aClass3_Sub1_Sub2_Sub2_Sub1_4.aClass245_1.method5058(local19, local357, Static511.aClass254_1);
							return;
						}
					}
					return;
				}
				if (arg0 == 404) {
					anInt3702 -= 2;
					local13 = anIntArray257[anInt3702];
					local19 = anIntArray257[anInt3702 + 1];
					if (Static554.aClass3_Sub1_Sub2_Sub2_Sub1_4.aClass245_1 == null) {
						return;
					}
					Static554.aClass3_Sub1_Sub2_Sub2_Sub1_4.aClass245_1.method5062(local13, local19);
					return;
				}
				if (arg0 == 410) {
					local420 = anIntArray257[--anInt3702] != 0;
					if (Static554.aClass3_Sub1_Sub2_Sub2_Sub1_4.aClass245_1 == null) {
						return;
					}
					Static554.aClass3_Sub1_Sub2_Sub2_Sub1_4.aClass245_1.method5063(local420);
					return;
				}
				if (arg0 == 411) {
					anInt3702 -= 2;
					local13 = anIntArray257[anInt3702];
					local19 = anIntArray257[anInt3702 + 1];
					if (Static554.aClass3_Sub1_Sub2_Sub2_Sub1_4.aClass245_1 == null) {
						return;
					}
					Static554.aClass3_Sub1_Sub2_Sub2_Sub1_4.aClass245_1.method5067(local13, Static532.aClass255_2, local19);
					return;
				}
			} else if ((arg0 < 1000 || arg0 >= 1100) && (arg0 < 2000 || arg0 >= 2100)) {
				@Pc(1523) String local1523;
				@Pc(1161) String local1161;
				if (arg0 >= 1100 && arg0 < 1200 || arg0 >= 2100 && arg0 < 2200) {
					if (arg0 >= 2000) {
						arg0 -= 1000;
						local137 = Static569.method7534(anIntArray257[--anInt3702]);
					} else {
						local137 = arg1 ? aClass199_3 : aClass199_4;
					}
					if (arg0 == 1100) {
						anInt3702 -= 2;
						local137.anInt5031 = anIntArray257[anInt3702];
						if (local137.anInt5031 > local137.anInt5023 - local137.anInt5035) {
							local137.anInt5031 = local137.anInt5023 - local137.anInt5035;
						}
						if (local137.anInt5031 < 0) {
							local137.anInt5031 = 0;
						}
						local137.anInt4977 = anIntArray257[anInt3702 + 1];
						if (local137.anInt4977 > local137.anInt4981 - local137.anInt4994) {
							local137.anInt4977 = local137.anInt4981 - local137.anInt4994;
						}
						if (local137.anInt4977 < 0) {
							local137.anInt4977 = 0;
						}
						Static331.method4565(local137);
						if (local137.anInt5005 == -1) {
							Static504.method6852(local137.anInt5041);
						}
						return;
					}
					if (arg0 == 1101) {
						local137.anInt4950 = anIntArray257[--anInt3702];
						Static331.method4565(local137);
						if (local137.anInt5005 == -1) {
							Static25.method575(local137.anInt5041);
						}
						return;
					}
					if (arg0 == 1102) {
						local137.aBoolean382 = anIntArray257[--anInt3702] == 1;
						Static331.method4565(local137);
						return;
					}
					if (arg0 == 1103) {
						local137.anInt5027 = anIntArray257[--anInt3702];
						Static331.method4565(local137);
						return;
					}
					if (arg0 == 1104) {
						local137.anInt5008 = anIntArray257[--anInt3702];
						Static331.method4565(local137);
						return;
					}
					if (arg0 == 1105) {
						local19 = anIntArray257[--anInt3702];
						if (local137.anInt4958 != local19) {
							local137.anInt4958 = local19;
							Static331.method4565(local137);
						}
						if (local137.anInt5005 == -1) {
							Static254.method3690(local137.anInt5041);
						}
						return;
					}
					if (arg0 == 1106) {
						local137.anInt5017 = anIntArray257[--anInt3702];
						Static331.method4565(local137);
						return;
					}
					if (arg0 == 1107) {
						local137.aBoolean385 = anIntArray257[--anInt3702] == 1;
						Static331.method4565(local137);
						return;
					}
					if (arg0 == 1108) {
						local137.anInt5039 = 1;
						local137.anInt4956 = anIntArray257[--anInt3702];
						Static331.method4565(local137);
						if (local137.anInt5005 == -1) {
							Static542.method7257(local137.anInt5041);
						}
						return;
					}
					if (arg0 == 1109) {
						anInt3702 -= 6;
						local137.lb = anIntArray257[anInt3702];
						local137.anInt5021 = anIntArray257[anInt3702 + 1];
						local137.anInt4972 = anIntArray257[anInt3702 + 2];
						local137.anInt5006 = anIntArray257[anInt3702 + 3];
						local137.anInt4957 = anIntArray257[anInt3702 + 4];
						local137.anInt4961 = anIntArray257[anInt3702 + 5];
						Static331.method4565(local137);
						if (local137.anInt5005 == -1) {
							Static405.method5134(local137.anInt5041);
							Static647.method8634(local137.anInt5041);
						}
						return;
					}
					if (arg0 == 1110) {
						local19 = anIntArray257[--anInt3702];
						if (local137.anInt4948 != local19) {
							local137.anInt4948 = local19;
							local137.anInt4985 = 0;
							local137.anInt5014 = 1;
							local137.anInt4960 = 0;
							@Pc(1110) Class124 local1110 = local137.anInt4948 == -1 ? null : Static99.aClass2_1.method22(local137.anInt4948);
							if (local1110 != null) {
								Static122.method2185(local137.anInt4985, local1110);
							}
							Static331.method4565(local137);
						}
						if (local137.anInt5005 == -1) {
							Static111.method2110(local137.anInt5041);
						}
						return;
					}
					if (arg0 == 1111) {
						local137.aBoolean378 = anIntArray257[--anInt3702] == 1;
						Static331.method4565(local137);
						return;
					}
					if (arg0 == 1112) {
						local1161 = aStringArray17[--anInt3709];
						if (!local1161.equals(local137.aString52)) {
							local137.aString52 = local1161;
							Static331.method4565(local137);
						}
						if (local137.anInt5005 == -1) {
							Static120.method2171(local137.anInt5041);
						}
						return;
					}
					if (arg0 == 1113) {
						local137.anInt4980 = anIntArray257[--anInt3702];
						Static331.method4565(local137);
						if (local137.anInt5005 == -1) {
							Static396.method8688(local137.anInt5041);
						}
						return;
					}
					if (arg0 == 1114) {
						anInt3702 -= 3;
						local137.anInt4986 = anIntArray257[anInt3702];
						local137.anInt4987 = anIntArray257[anInt3702 + 1];
						local137.anInt4984 = anIntArray257[anInt3702 + 2];
						Static331.method4565(local137);
						return;
					}
					if (arg0 == 1115) {
						local137.aBoolean383 = anIntArray257[--anInt3702] == 1;
						Static331.method4565(local137);
						return;
					}
					if (arg0 == 1116) {
						local137.anInt5016 = anIntArray257[--anInt3702];
						Static331.method4565(local137);
						return;
					}
					if (arg0 == 1117) {
						local137.anInt5022 = anIntArray257[--anInt3702];
						Static331.method4565(local137);
						return;
					}
					if (arg0 == 1118) {
						local137.aBoolean386 = anIntArray257[--anInt3702] == 1;
						Static331.method4565(local137);
						return;
					}
					if (arg0 == 1119) {
						local137.aBoolean374 = anIntArray257[--anInt3702] == 1;
						Static331.method4565(local137);
						return;
					}
					if (arg0 == 1120) {
						anInt3702 -= 2;
						local137.anInt5023 = anIntArray257[anInt3702];
						local137.anInt4981 = anIntArray257[anInt3702 + 1];
						Static331.method4565(local137);
						if (local137.anInt4966 == 0) {
							Static284.method4095(false, local137);
						}
						return;
					}
					if (arg0 == 1122) {
						local137.aBoolean381 = anIntArray257[--anInt3702] == 1;
						Static331.method4565(local137);
						return;
					}
					if (arg0 == 1123) {
						local137.anInt4961 = anIntArray257[--anInt3702];
						Static331.method4565(local137);
						if (local137.anInt5005 == -1) {
							Static405.method5134(local137.anInt5041);
						}
						return;
					}
					if (arg0 == 1124) {
						local19 = anIntArray257[--anInt3702];
						local137.aBoolean372 = local19 == 1;
						Static331.method4565(local137);
						return;
					}
					if (arg0 == 1125) {
						anInt3702 -= 2;
						local137.anInt5004 = anIntArray257[anInt3702];
						local137.anInt4949 = anIntArray257[anInt3702 + 1];
						Static331.method4565(local137);
						return;
					}
					if (arg0 == 1126) {
						local137.anInt4999 = anIntArray257[--anInt3702];
						Static331.method4565(local137);
						return;
					}
					@Pc(1489) Class257 local1489;
					if (arg0 == 1127) {
						anInt3702 -= 2;
						local19 = anIntArray257[anInt3702];
						local25 = anIntArray257[anInt3702 + 1];
						local1489 = Static482.aClass84_2.method2152(local19);
						if (local25 != local1489.anInt6617) {
							local137.method4429(local19, local25);
							return;
						}
						local137.method4418(local19);
						return;
					}
					if (arg0 == 1128) {
						local19 = anIntArray257[--anInt3702];
						local1523 = aStringArray17[--anInt3709];
						local1489 = Static482.aClass84_2.method2152(local19);
						if (!local1489.aString77.equals(local1523)) {
							local137.method4425(local1523, local19);
							return;
						}
						local137.method4418(local19);
						return;
					}
					if (arg0 == 1129 || arg0 == 1130) {
						local19 = anIntArray257[--anInt3702];
						if (local137.anInt4966 != 5 && arg0 == 1129 || local137.anInt4966 != 4 && arg0 == 1130) {
							return;
						}
						if (local137.anInt4951 != local19) {
							local137.anInt4951 = local19;
							Static331.method4565(local137);
						}
						if (local137.anInt5005 == -1) {
							Static210.method3129(local137.anInt5041);
						}
						return;
					}
					@Pc(1617) short local1617;
					@Pc(1610) short local1610;
					if (arg0 == 1131) {
						anInt3702 -= 3;
						local19 = anIntArray257[anInt3702];
						local1610 = (short) anIntArray257[anInt3702 + 1];
						local1617 = (short) anIntArray257[anInt3702 + 2];
						if (local19 >= 0 && local19 < 5) {
							local137.method4411(local19, local1617, local1610);
							Static331.method4565(local137);
							if (local137.anInt5005 == -1) {
								Static598.method7846(local137.anInt5041, local19);
							}
							return;
						}
						return;
					}
					if (arg0 == 1132) {
						anInt3702 -= 3;
						local19 = anIntArray257[anInt3702];
						local1610 = (short) anIntArray257[anInt3702 + 1];
						local1617 = (short) anIntArray257[anInt3702 + 2];
						if (local19 >= 0 && local19 < 5) {
							local137.method4426(local1610, local19, local1617);
							Static331.method4565(local137);
							if (local137.anInt5005 == -1) {
								Static285.method4103(local137.anInt5041, local19);
							}
							return;
						}
						return;
					}
				} else if (arg0 >= 1200 && arg0 < 1300 || arg0 >= 2200 && arg0 < 2300) {
					if (arg0 >= 2000) {
						arg0 -= 1000;
						local137 = Static569.method7534(anIntArray257[--anInt3702]);
					} else {
						local137 = arg1 ? aClass199_3 : aClass199_4;
					}
					Static331.method4565(local137);
					if (arg0 == 1200 || arg0 == 1205 || arg0 == 1208 || arg0 == 1209 || arg0 == 1212 || arg0 == 1213) {
						anInt3702 -= 2;
						local19 = anIntArray257[anInt3702];
						local25 = anIntArray257[anInt3702 + 1];
						if (local137.anInt5005 == -1) {
							Static413.method5198(local137.anInt5041);
							Static405.method5134(local137.anInt5041);
							Static647.method8634(local137.anInt5041);
						}
						if (local19 == -1) {
							local137.anInt5039 = 1;
							local137.anInt4956 = -1;
							local137.anInt5002 = -1;
							return;
						}
						local137.anInt5002 = local19;
						local137.anInt5032 = local25;
						if (arg0 == 1208 || arg0 == 1209) {
							local137.aBoolean384 = true;
						} else {
							local137.aBoolean384 = false;
						}
						@Pc(1813) Class110 local1813 = Static532.aClass255_2.method5210(local19);
						local137.anInt4972 = local1813.anInt2778;
						local137.anInt5006 = local1813.lb;
						local137.anInt4957 = local1813.anInt2773;
						local137.lb = local1813.anInt2750;
						local137.anInt5021 = local1813.anInt2754;
						local137.anInt4961 = local1813.anInt2792;
						if (arg0 == 1205 || arg0 == 1209) {
							local137.anInt5034 = 0;
						} else if (arg0 == 1212 || arg0 == 1213) {
							local137.anInt5034 = 1;
						} else {
							local137.anInt5034 = 2;
						}
						if (local137.anInt4953 > 0) {
							local137.anInt4961 = local137.anInt4961 * 32 / local137.anInt4953;
							return;
						}
						if (local137.anInt4962 > 0) {
							local137.anInt4961 = local137.anInt4961 * 32 / local137.anInt4962;
						}
						return;
					}
					if (arg0 == 1201) {
						local137.anInt5039 = 2;
						local137.anInt4956 = anIntArray257[--anInt3702];
						if (local137.anInt5005 == -1) {
							Static542.method7257(local137.anInt5041);
						}
						return;
					}
					if (arg0 == 1202) {
						local137.anInt5039 = 3;
						local137.anInt4956 = -1;
						if (local137.anInt5005 == -1) {
							Static542.method7257(local137.anInt5041);
						}
						return;
					}
					if (arg0 == 1203) {
						local137.anInt5039 = 6;
						local137.anInt4956 = anIntArray257[--anInt3702];
						if (local137.anInt5005 == -1) {
							Static542.method7257(local137.anInt5041);
						}
						return;
					}
					if (arg0 == 1204) {
						local137.anInt5039 = 5;
						local137.anInt4956 = anIntArray257[--anInt3702];
						if (local137.anInt5005 == -1) {
							Static542.method7257(local137.anInt5041);
						}
						return;
					}
					if (arg0 == 1206) {
						anInt3702 -= 4;
						local137.anInt4998 = anIntArray257[anInt3702];
						local137.anInt4974 = anIntArray257[anInt3702 + 1];
						local137.anInt4997 = anIntArray257[anInt3702 + 2];
						local137.anInt4978 = anIntArray257[anInt3702 + 3];
						Static331.method4565(local137);
						return;
					}
					if (arg0 == 1207) {
						anInt3702 -= 2;
						local137.anInt5019 = anIntArray257[anInt3702];
						local137.anInt5007 = anIntArray257[anInt3702 + 1];
						Static331.method4565(local137);
						return;
					}
					if (arg0 == 1210) {
						anInt3702 -= 4;
						local137.anInt4956 = anIntArray257[anInt3702];
						local137.anInt4983 = anIntArray257[anInt3702 + 1];
						if (anIntArray257[anInt3702 + 2] == 1) {
							local137.anInt5039 = 9;
						} else {
							local137.anInt5039 = 8;
						}
						if (anIntArray257[anInt3702 + 3] == 1) {
							local137.aBoolean384 = true;
						} else {
							local137.aBoolean384 = false;
						}
						if (local137.anInt5005 == -1) {
							Static542.method7257(local137.anInt5041);
						}
						return;
					}
					if (arg0 == 1211) {
						local137.anInt5039 = 5;
						local137.anInt4956 = Static184.anInt3149;
						local137.anInt4983 = 0;
						if (local137.anInt5005 == -1) {
							Static542.method7257(local137.anInt5041);
						}
						return;
					}
				} else {
					@Pc(2473) int local2473;
					if ((arg0 < 1300 || arg0 >= 1400) && (arg0 < 2300 || arg0 >= 2400)) {
						if (arg0 >= 1400 && arg0 < 1500 || arg0 >= 2400 && arg0 < 2500) {
							if (arg0 >= 2000) {
								arg0 -= 1000;
								local137 = Static569.method7534(anIntArray257[--anInt3702]);
							} else {
								local137 = arg1 ? aClass199_3 : aClass199_4;
							}
							if (arg0 == 1499) {
								local137.method4432();
								return;
							}
							local1161 = aStringArray17[--anInt3709];
							@Pc(2559) int[] local2559 = null;
							if (local1161.length() > 0 && local1161.charAt(local1161.length() - 1) == 'Y') {
								local357 = anIntArray257[--anInt3702];
								if (local357 > 0) {
									local2559 = new int[local357];
									while (local357-- > 0) {
										local2559[local357] = anIntArray257[--anInt3702];
									}
								}
								local1161 = local1161.substring(0, local1161.length() - 1);
							}
							@Pc(2611) Object[] local2611 = new Object[local1161.length() + 1];
							for (local2473 = local2611.length - 1; local2473 >= 1; local2473--) {
								if (local1161.charAt(local2473 - 1) == 's') {
									local2611[local2473] = aStringArray17[--anInt3709];
								} else if (local1161.charAt(local2473 - 1) == '§') {
									local2611[local2473] = Long.valueOf(aLongArray4[--anInt3708]);
								} else {
									local2611[local2473] = Integer.valueOf(anIntArray257[--anInt3702]);
								}
							}
							local56 = anIntArray257[--anInt3702];
							if (local56 == -1) {
								local2611 = null;
							} else {
								local2611[0] = Integer.valueOf(local56);
							}
							if (arg0 == 1400) {
								local137.anObjectArray26 = local2611;
							} else if (arg0 == 1401) {
								local137.anObjectArray14 = local2611;
							} else if (arg0 == 1402) {
								local137.anObjectArray32 = local2611;
							} else if (arg0 == 1403) {
								local137.anObjectArray15 = local2611;
							} else if (arg0 == 1404) {
								local137.anObjectArray16 = local2611;
							} else if (arg0 == 1405) {
								local137.anObjectArray6 = local2611;
							} else if (arg0 == 1406) {
								local137.anObjectArray24 = local2611;
							} else if (arg0 == 1407) {
								local137.anObjectArray29 = local2611;
								local137.anIntArray388 = local2559;
							} else if (arg0 == 1408) {
								local137.anObjectArray28 = local2611;
							} else if (arg0 == 1409) {
								local137.anObjectArray22 = local2611;
							} else if (arg0 == 1410) {
								local137.anObjectArray7 = local2611;
							} else if (arg0 == 1411) {
								local137.anObjectArray13 = local2611;
							} else if (arg0 == 1412) {
								local137.anObjectArray21 = local2611;
							} else if (arg0 == 1414) {
								local137.anObjectArray5 = local2611;
								local137.anIntArray386 = local2559;
							} else if (arg0 == 1415) {
								local137.anObjectArray17 = local2611;
								local137.anIntArray382 = local2559;
							} else if (arg0 == 1416) {
								local137.anObjectArray8 = local2611;
							} else if (arg0 == 1417) {
								local137.anObjectArray11 = local2611;
							} else if (arg0 == 1418) {
								local137.anObjectArray30 = local2611;
							} else if (arg0 == 1419) {
								local137.anObjectArray31 = local2611;
							} else if (arg0 == 1420) {
								local137.anObjectArray18 = local2611;
							} else if (arg0 == 1421) {
								local137.anObjectArray23 = local2611;
							} else if (arg0 == 1422) {
								local137.anObjectArray25 = local2611;
							} else if (arg0 == 1423) {
								local137.anObjectArray9 = local2611;
							} else if (arg0 == 1424) {
								local137.anObjectArray35 = local2611;
							} else if (arg0 == 1425) {
								local137.anObjectArray19 = local2611;
							} else if (arg0 == 1426) {
								local137.anObjectArray12 = local2611;
							} else if (arg0 == 1427) {
								local137.anObjectArray3 = local2611;
							} else if (arg0 == 1428) {
								local137.anObjectArray10 = local2611;
								local137.anIntArray389 = local2559;
							} else if (arg0 == 1429) {
								local137.anObjectArray4 = local2611;
								local137.anIntArray385 = local2559;
							} else if (arg0 == 1430) {
								local137.anObjectArray33 = local2611;
							} else if (arg0 == 1431) {
								local137.anObjectArray20 = local2611;
							} else if (arg0 == 1432) {
								local137.anObjectArray34 = local2611;
							}
							local137.aBoolean377 = true;
							return;
						}
						if (arg0 < 1600) {
							local137 = arg1 ? aClass199_3 : aClass199_4;
							if (arg0 == 1500) {
								anIntArray257[anInt3702++] = local137.anInt4973;
								return;
							}
							if (arg0 == 1501) {
								anIntArray257[anInt3702++] = local137.anInt5028;
								return;
							}
							if (arg0 == 1502) {
								anIntArray257[anInt3702++] = local137.anInt5035;
								return;
							}
							if (arg0 == 1503) {
								anIntArray257[anInt3702++] = local137.anInt4994;
								return;
							}
							if (arg0 == 1504) {
								anIntArray257[anInt3702++] = local137.aBoolean373 ? 1 : 0;
								return;
							}
							if (arg0 == 1505) {
								anIntArray257[anInt3702++] = local137.anInt4982;
								return;
							}
							if (arg0 == 1506) {
								local158 = Static518.method8704(local137);
								anIntArray257[anInt3702++] = local158 == null ? -1 : local158.anInt5041;
								return;
							}
						} else {
							@Pc(3242) Class257 local3242;
							if (arg0 < 1700) {
								local137 = arg1 ? aClass199_3 : aClass199_4;
								if (arg0 == 1600) {
									anIntArray257[anInt3702++] = local137.anInt5031;
									return;
								}
								if (arg0 == 1601) {
									anIntArray257[anInt3702++] = local137.anInt4977;
									return;
								}
								if (arg0 == 1602) {
									aStringArray17[anInt3709++] = local137.aString52;
									return;
								}
								if (arg0 == 1603) {
									anIntArray257[anInt3702++] = local137.anInt5023;
									return;
								}
								if (arg0 == 1604) {
									anIntArray257[anInt3702++] = local137.anInt4981;
									return;
								}
								if (arg0 == 1605) {
									anIntArray257[anInt3702++] = local137.anInt4961;
									return;
								}
								if (arg0 == 1606) {
									anIntArray257[anInt3702++] = local137.anInt4972;
									return;
								}
								if (arg0 == 1607) {
									anIntArray257[anInt3702++] = local137.anInt4957;
									return;
								}
								if (arg0 == 1608) {
									anIntArray257[anInt3702++] = local137.anInt5006;
									return;
								}
								if (arg0 == 1609) {
									anIntArray257[anInt3702++] = local137.anInt5027;
									return;
								}
								if (arg0 == 1610) {
									anIntArray257[anInt3702++] = local137.lb;
									return;
								}
								if (arg0 == 1611) {
									anIntArray257[anInt3702++] = local137.anInt5021;
									return;
								}
								if (arg0 == 1612) {
									anIntArray257[anInt3702++] = local137.anInt4958;
									return;
								}
								if (arg0 == 1613) {
									local19 = anIntArray257[--anInt3702];
									local3242 = Static482.aClass84_2.method2152(local19);
									if (local3242.method5757()) {
										aStringArray17[anInt3709++] = local137.method4422(local19, local3242.aString77);
										return;
									}
									anIntArray257[anInt3702++] = local137.method4421(local3242.anInt6617, local19);
									return;
								}
								if (arg0 == 1614) {
									anIntArray257[anInt3702++] = local137.anInt5017;
									return;
								}
								if (arg0 == 2614) {
									anIntArray257[anInt3702++] = local137.anInt5039 == 1 ? local137.anInt4956 : -1;
									return;
								}
							} else if (arg0 < 1800) {
								local137 = arg1 ? aClass199_3 : aClass199_4;
								if (arg0 == 1700) {
									anIntArray257[anInt3702++] = local137.anInt5002;
									return;
								}
								if (arg0 == 1701) {
									if (local137.anInt5002 != -1) {
										anIntArray257[anInt3702++] = local137.anInt5032;
										return;
									}
									anIntArray257[anInt3702++] = 0;
									return;
								}
								if (arg0 == 1702) {
									anIntArray257[anInt3702++] = local137.anInt5005;
									return;
								}
							} else if (arg0 < 1900) {
								local137 = arg1 ? aClass199_3 : aClass199_4;
								if (arg0 == 1800) {
									anIntArray257[anInt3702++] = Static75.method1604(local137).method815();
									return;
								}
								if (arg0 == 1801) {
									local19 = anIntArray257[--anInt3702];
									local19--;
									if (local137.aStringArray22 != null && local19 < local137.aStringArray22.length && local137.aStringArray22[local19] != null) {
										aStringArray17[anInt3709++] = local137.aStringArray22[local19];
										return;
									}
									aStringArray17[anInt3709++] = "";
									return;
								}
								if (arg0 == 1802) {
									if (local137.aString50 == null) {
										aStringArray17[anInt3709++] = "";
										return;
									}
									aStringArray17[anInt3709++] = local137.aString50;
									return;
								}
							} else if (arg0 < 2000 || arg0 >= 2900 && arg0 < 3000) {
								if (arg0 >= 2000) {
									local137 = Static569.method7534(anIntArray257[--anInt3702]);
									arg0 -= 1000;
								} else {
									local137 = arg1 ? aClass199_3 : aClass199_4;
								}
								if (anInt3710 >= 10) {
									throw new RuntimeException("C29xx-1");
								}
								if (arg0 == 1927) {
									if (local137.anObjectArray3 == null) {
										return;
									}
									@Pc(3511) Class4_Sub25 local3511 = new Class4_Sub25();
									local3511.aClass199_6 = local137;
									local3511.anObjectArray2 = local137.anObjectArray3;
									local3511.anInt4286 = anInt3710 + 1;
									Static209.aClass163_20.method3646(local3511);
									return;
								}
							} else if (arg0 < 2600) {
								local137 = Static569.method7534(anIntArray257[--anInt3702]);
								if (arg0 == 2500) {
									anIntArray257[anInt3702++] = local137.anInt4973;
									return;
								}
								if (arg0 == 2501) {
									anIntArray257[anInt3702++] = local137.anInt5028;
									return;
								}
								if (arg0 == 2502) {
									anIntArray257[anInt3702++] = local137.anInt5035;
									return;
								}
								if (arg0 == 2503) {
									anIntArray257[anInt3702++] = local137.anInt4994;
									return;
								}
								if (arg0 == 2504) {
									anIntArray257[anInt3702++] = local137.aBoolean373 ? 1 : 0;
									return;
								}
								if (arg0 == 2505) {
									anIntArray257[anInt3702++] = local137.anInt4982;
									return;
								}
								if (arg0 == 1506) {
									local158 = Static518.method8704(local137);
									anIntArray257[anInt3702++] = local158 == null ? -1 : local158.anInt5041;
									return;
								}
							} else if (arg0 < 2700) {
								local137 = Static569.method7534(anIntArray257[--anInt3702]);
								if (arg0 == 2600) {
									anIntArray257[anInt3702++] = local137.anInt5031;
									return;
								}
								if (arg0 == 2601) {
									anIntArray257[anInt3702++] = local137.anInt4977;
									return;
								}
								if (arg0 == 2602) {
									aStringArray17[anInt3709++] = local137.aString52;
									return;
								}
								if (arg0 == 2603) {
									anIntArray257[anInt3702++] = local137.anInt5023;
									return;
								}
								if (arg0 == 2604) {
									anIntArray257[anInt3702++] = local137.anInt4981;
									return;
								}
								if (arg0 == 2605) {
									anIntArray257[anInt3702++] = local137.anInt4961;
									return;
								}
								if (arg0 == 2606) {
									anIntArray257[anInt3702++] = local137.anInt4972;
									return;
								}
								if (arg0 == 2607) {
									anIntArray257[anInt3702++] = local137.anInt4957;
									return;
								}
								if (arg0 == 2608) {
									anIntArray257[anInt3702++] = local137.anInt5006;
									return;
								}
								if (arg0 == 2609) {
									anIntArray257[anInt3702++] = local137.anInt5027;
									return;
								}
								if (arg0 == 2610) {
									anIntArray257[anInt3702++] = local137.lb;
									return;
								}
								if (arg0 == 2611) {
									anIntArray257[anInt3702++] = local137.anInt5021;
									return;
								}
								if (arg0 == 2612) {
									anIntArray257[anInt3702++] = local137.anInt4958;
									return;
								}
								if (arg0 == 2613) {
									anIntArray257[anInt3702++] = local137.anInt5017;
									return;
								}
								if (arg0 == 2614) {
									anIntArray257[anInt3702++] = local137.anInt5039 == 1 ? local137.anInt4956 : -1;
									return;
								}
							} else {
								@Pc(4040) Class4_Sub28 local4040;
								@Pc(3938) Class4_Sub28 local3938;
								if (arg0 < 2800) {
									if (arg0 == 2700) {
										local137 = Static569.method7534(anIntArray257[--anInt3702]);
										anIntArray257[anInt3702++] = local137.anInt5002;
										return;
									}
									if (arg0 == 2701) {
										local137 = Static569.method7534(anIntArray257[--anInt3702]);
										if (local137.anInt5002 != -1) {
											anIntArray257[anInt3702++] = local137.anInt5032;
											return;
										}
										anIntArray257[anInt3702++] = 0;
										return;
									}
									if (arg0 == 2702) {
										local13 = anIntArray257[--anInt3702];
										local3938 = (Class4_Sub28) Static242.aClass66_17.method1994((long) local13);
										if (local3938 != null) {
											anIntArray257[anInt3702++] = 1;
											return;
										}
										anIntArray257[anInt3702++] = 0;
										return;
									}
									if (arg0 == 2703) {
										local137 = Static569.method7534(anIntArray257[--anInt3702]);
										if (local137.aClass199Array1 == null) {
											anIntArray257[anInt3702++] = 0;
											return;
										}
										local19 = local137.aClass199Array1.length;
										for (local25 = 0; local25 < local137.aClass199Array1.length; local25++) {
											if (local137.aClass199Array1[local25] == null) {
												local19 = local25;
												break;
											}
										}
										anIntArray257[anInt3702++] = local19;
										return;
									}
									if (arg0 == 2704 || arg0 == 2705) {
										anInt3702 -= 2;
										local13 = anIntArray257[anInt3702];
										local19 = anIntArray257[anInt3702 + 1];
										local4040 = (Class4_Sub28) Static242.aClass66_17.method1994((long) local13);
										if (local4040 != null && local4040.anInt4697 == local19) {
											anIntArray257[anInt3702++] = 1;
											return;
										}
										anIntArray257[anInt3702++] = 0;
										return;
									}
								} else if (arg0 < 2900) {
									local137 = Static569.method7534(anIntArray257[--anInt3702]);
									if (arg0 == 2800) {
										anIntArray257[anInt3702++] = Static75.method1604(local137).method815();
										return;
									}
									if (arg0 == 2801) {
										local19 = anIntArray257[--anInt3702];
										local19--;
										if (local137.aStringArray22 != null && local19 < local137.aStringArray22.length && local137.aStringArray22[local19] != null) {
											aStringArray17[anInt3709++] = local137.aStringArray22[local19];
											return;
										}
										aStringArray17[anInt3709++] = "";
										return;
									}
									if (arg0 == 2802) {
										if (local137.aString50 == null) {
											aStringArray17[anInt3709++] = "";
											return;
										}
										aStringArray17[anInt3709++] = local137.aString50;
										return;
									}
								} else {
									@Pc(4266) Class4_Sub48 local4266;
									@Pc(4177) String local4177;
									if (arg0 < 3200) {
										if (arg0 == 3100) {
											local4177 = aStringArray17[--anInt3709];
											Static16.method301(local4177);
											return;
										}
										if (arg0 == 3101) {
											anInt3702 -= 2;
											Static493.method6696(anIntArray257[anInt3702 + 1], anIntArray257[anInt3702], Static554.aClass3_Sub1_Sub2_Sub2_Sub1_4);
											return;
										}
										if (arg0 == 3103) {
											Static100.method2021();
											return;
										}
										if (arg0 == 3104) {
											local4177 = aStringArray17[--anInt3709];
											local19 = 0;
											if (Static509.method6933(local4177)) {
												local19 = Static613.method8035(local4177);
											}
											@Pc(4237) Class4_Sub48 local4237 = Static335.method4615(Static210.aClass216_68, Static669.aClass196_2);
											local4237.aClass4_Sub11_Sub1_2.method8860(local19);
											Static410.method5170(local4237);
											return;
										}
										if (arg0 == 3105) {
											local4177 = aStringArray17[--anInt3709];
											local4266 = Static335.method4615(Static293.aClass216_85, Static669.aClass196_2);
											local4266.aClass4_Sub11_Sub1_2.method8822(local4177.length() + 1);
											local4266.aClass4_Sub11_Sub1_2.method8857(local4177);
											Static410.method5170(local4266);
											return;
										}
										if (arg0 == 3106) {
											local4177 = aStringArray17[--anInt3709];
											local4266 = Static335.method4615(Static432.aClass216_110, Static669.aClass196_2);
											local4266.aClass4_Sub11_Sub1_2.method8822(local4177.length() + 1);
											local4266.aClass4_Sub11_Sub1_2.method8857(local4177);
											Static410.method5170(local4266);
											return;
										}
										if (arg0 == 3107) {
											local13 = anIntArray257[--anInt3702];
											local1161 = aStringArray17[--anInt3709];
											Static215.method3223(local1161, local13);
											return;
										}
										if (arg0 == 3108) {
											anInt3702 -= 3;
											local13 = anIntArray257[anInt3702];
											local19 = anIntArray257[anInt3702 + 1];
											local25 = anIntArray257[anInt3702 + 2];
											local35 = Static569.method7534(local25);
											Static447.method6139(local13, local19, local35);
											return;
										}
										if (arg0 == 3109) {
											anInt3702 -= 2;
											local13 = anIntArray257[anInt3702];
											local19 = anIntArray257[anInt3702 + 1];
											local210 = arg1 ? aClass199_3 : aClass199_4;
											Static447.method6139(local13, local19, local210);
											return;
										}
										if (arg0 == 3110) {
											local13 = anIntArray257[--anInt3702];
											local4266 = Static335.method4615(Static104.aClass216_39, Static669.aClass196_2);
											local4266.aClass4_Sub11_Sub1_2.method8838(local13);
											Static410.method5170(local4266);
											return;
										}
										if (arg0 == 3111) {
											anInt3702 -= 2;
											local13 = anIntArray257[anInt3702];
											local19 = anIntArray257[anInt3702 + 1];
											local4040 = (Class4_Sub28) Static242.aClass66_17.method1994((long) local13);
											if (local4040 != null) {
												Static601.method7899(local4040.anInt4697 != local19, true, local4040);
											}
											Static275.method3975(local13, true, 3, local19);
											return;
										}
										if (arg0 == 3112) {
											anInt3702--;
											local13 = anIntArray257[anInt3702];
											local3938 = (Class4_Sub28) Static242.aClass66_17.method1994((long) local13);
											if (local3938 != null && local3938.anInt4696 == 3) {
												Static601.method7899(true, true, local3938);
											}
											return;
										}
										if (arg0 == 3113) {
											Static288.method4128(aStringArray17[--anInt3709]);
											return;
										}
										if (arg0 == 3114) {
											anInt3702 -= 2;
											local13 = anIntArray257[anInt3702];
											local19 = anIntArray257[anInt3702 + 1];
											local1523 = aStringArray17[--anInt3709];
											Static388.method5002("", local1523, "", "", local13, local19);
											return;
										}
										if (arg0 == 3115) {
											anInt3702 -= 11;
											@Pc(4567) Class291[] local4567 = Static305.method4279();
											@Pc(4570) Class125[] local4570 = Static640.method8546();
											Static538.method7208(anIntArray257[anInt3702 + 6], anIntArray257[anInt3702 + 4], anIntArray257[anInt3702 + 8], anIntArray257[anInt3702 + 10], anIntArray257[anInt3702 + 3], anIntArray257[anInt3702 + 2], anIntArray257[anInt3702 + 7], local4567[anIntArray257[anInt3702]], anIntArray257[anInt3702 + 5], anIntArray257[anInt3702 + 9], local4570[anIntArray257[anInt3702 + 1]]);
											return;
										}
										if (arg0 == 3116) {
											local13 = anIntArray257[--anInt3702];
											local4266 = Static335.method4615(Static338.aClass216_91, Static669.aClass196_2);
											local4266.aClass4_Sub11_Sub1_2.method8838(local13);
											Static410.method5170(local4266);
											return;
										}
										if (arg0 == 3117) {
											local4177 = aStringArray17[--anInt3709];
											local4266 = Static335.method4615(Static502.aClass216_126, Static669.aClass196_2);
											local4266.aClass4_Sub11_Sub1_2.method8822(local4177.length() + 1);
											local4266.aClass4_Sub11_Sub1_2.method8857(local4177);
											Static410.method5170(local4266);
											return;
										}
									} else if (arg0 < 3300) {
										if (arg0 == 3200) {
											anInt3702 -= 3;
											Static430.method5939(anIntArray257[anInt3702 + 2], anIntArray257[anInt3702], 256, anIntArray257[anInt3702 + 1], 255);
											return;
										}
										if (arg0 == 3201) {
											Static583.method7684(anIntArray257[--anInt3702], 50, 255);
											return;
										}
										if (arg0 == 3202) {
											anInt3702 -= 2;
											Static319.method4409(anIntArray257[anInt3702 + 1], anIntArray257[anInt3702], 255);
											return;
										}
										if (arg0 == 3203) {
											anInt3702 -= 4;
											Static430.method5939(anIntArray257[anInt3702 + 2], anIntArray257[anInt3702], 256, anIntArray257[anInt3702 + 1], anIntArray257[anInt3702 + 3]);
											return;
										}
										if (arg0 == 3204) {
											anInt3702 -= 3;
											Static583.method7684(anIntArray257[anInt3702], anIntArray257[anInt3702 + 2], anIntArray257[anInt3702 + 1]);
											return;
										}
										if (arg0 == 3205) {
											anInt3702 -= 3;
											Static319.method4409(anIntArray257[anInt3702 + 1], anIntArray257[anInt3702], anIntArray257[anInt3702 + 2]);
											return;
										}
										if (arg0 == 3206) {
											anInt3702 -= 4;
											Static412.method5195(256, anIntArray257[anInt3702 + 3], anIntArray257[anInt3702 + 1], anIntArray257[anInt3702], false, anIntArray257[anInt3702 + 2]);
											return;
										}
										if (arg0 == 3207) {
											anInt3702 -= 4;
											Static412.method5195(256, anIntArray257[anInt3702 + 3], anIntArray257[anInt3702 + 1], anIntArray257[anInt3702], true, anIntArray257[anInt3702 + 2]);
											return;
										}
										if (arg0 == 3208) {
											anInt3702 -= 5;
											Static430.method5939(anIntArray257[anInt3702 + 2], anIntArray257[anInt3702], anIntArray257[anInt3702 + 4], anIntArray257[anInt3702 + 1], anIntArray257[anInt3702 + 3]);
											return;
										}
										if (arg0 == 3209) {
											anInt3702 -= 5;
											Static412.method5195(anIntArray257[anInt3702 + 4], anIntArray257[anInt3702 + 3], anIntArray257[anInt3702 + 1], anIntArray257[anInt3702], false, anIntArray257[anInt3702 + 2]);
											return;
										}
									} else if (arg0 < 3400) {
										if (arg0 == 3300) {
											anIntArray257[anInt3702++] = Static177.anInt3088;
											return;
										}
										if (arg0 == 3301) {
											anInt3702 -= 2;
											local13 = anIntArray257[anInt3702];
											local19 = anIntArray257[anInt3702 + 1];
											anIntArray257[anInt3702++] = Static18.method6088(false, local19, local13);
											return;
										}
										if (arg0 == 3302) {
											anInt3702 -= 2;
											local13 = anIntArray257[anInt3702];
											local19 = anIntArray257[anInt3702 + 1];
											anIntArray257[anInt3702++] = Static362.method4814(local19, local13, false);
											return;
										}
										if (arg0 == 3303) {
											anInt3702 -= 2;
											local13 = anIntArray257[anInt3702];
											local19 = anIntArray257[anInt3702 + 1];
											anIntArray257[anInt3702++] = Static484.method6624(local19, false, local13);
											return;
										}
										if (arg0 == 3304) {
											local13 = anIntArray257[--anInt3702];
											anIntArray257[anInt3702++] = Static432.aClass121_1.method2808(local13).anInt10581;
											return;
										}
										if (arg0 == 3305) {
											local13 = anIntArray257[--anInt3702];
											anIntArray257[anInt3702++] = Static521.anIntArray554[local13];
											return;
										}
										if (arg0 == 3306) {
											local13 = anIntArray257[--anInt3702];
											anIntArray257[anInt3702++] = Static668.anIntArray722[local13];
											return;
										}
										if (arg0 == 3307) {
											local13 = anIntArray257[--anInt3702];
											anIntArray257[anInt3702++] = Static523.anIntArray556[local13];
											return;
										}
										if (arg0 == 3308) {
											@Pc(5157) byte local5157 = Static554.aClass3_Sub1_Sub2_Sub2_Sub1_4.aByte141;
											local19 = (Static554.aClass3_Sub1_Sub2_Sub2_Sub1_4.anInt9925 >> 9) + Static445.anInt6949;
											local25 = (Static554.aClass3_Sub1_Sub2_Sub2_Sub1_4.anInt9917 >> 9) + Static321.anInt5000;
											anIntArray257[anInt3702++] = (local5157 << 28) + (local19 << 14) + local25;
											return;
										}
										if (arg0 == 3309) {
											local13 = anIntArray257[--anInt3702];
											anIntArray257[anInt3702++] = local13 >> 14 & 0x3FFF;
											return;
										}
										if (arg0 == 3310) {
											local13 = anIntArray257[--anInt3702];
											anIntArray257[anInt3702++] = local13 >> 28;
											return;
										}
										if (arg0 == 3311) {
											local13 = anIntArray257[--anInt3702];
											anIntArray257[anInt3702++] = local13 & 0x3FFF;
											return;
										}
										if (arg0 == 3312) {
											anIntArray257[anInt3702++] = Static307.aBoolean718 ? 1 : 0;
											return;
										}
										if (arg0 == 3313) {
											anInt3702 -= 2;
											local13 = anIntArray257[anInt3702];
											local19 = anIntArray257[anInt3702 + 1];
											anIntArray257[anInt3702++] = Static18.method6088(true, local19, local13);
											return;
										}
										if (arg0 == 3314) {
											anInt3702 -= 2;
											local13 = anIntArray257[anInt3702];
											local19 = anIntArray257[anInt3702 + 1];
											anIntArray257[anInt3702++] = Static362.method4814(local19, local13, true);
											return;
										}
										if (arg0 == 3315) {
											anInt3702 -= 2;
											local13 = anIntArray257[anInt3702];
											local19 = anIntArray257[anInt3702 + 1];
											anIntArray257[anInt3702++] = Static484.method6624(local19, true, local13);
											return;
										}
										if (arg0 == 3316) {
											if (Static279.anInt4498 >= 2) {
												anIntArray257[anInt3702++] = Static279.anInt4498;
												return;
											}
											anIntArray257[anInt3702++] = 0;
											return;
										}
										if (arg0 == 3317) {
											anIntArray257[anInt3702++] = Static179.anInt3120;
											return;
										}
										if (arg0 == 3318) {
											anIntArray257[anInt3702++] = Static653.aClass382_5.anInt10282;
											return;
										}
										if (arg0 == 3321) {
											anIntArray257[anInt3702++] = Static301.anInt4756;
											return;
										}
										if (arg0 == 3322) {
											anIntArray257[anInt3702++] = Static646.anInt10162;
											return;
										}
										if (arg0 == 3323) {
											if (Static595.anInt9154 >= 5 && Static595.anInt9154 <= 9) {
												anIntArray257[anInt3702++] = 1;
												return;
											}
											anIntArray257[anInt3702++] = 0;
											return;
										}
										if (arg0 == 3324) {
											if (Static595.anInt9154 >= 5 && Static595.anInt9154 <= 9) {
												anIntArray257[anInt3702++] = Static595.anInt9154;
												return;
											}
											anIntArray257[anInt3702++] = 0;
											return;
										}
										if (arg0 == 3325) {
											anIntArray257[anInt3702++] = Static54.aBoolean83 ? 1 : 0;
											return;
										}
										if (arg0 == 3326) {
											anIntArray257[anInt3702++] = Static554.aClass3_Sub1_Sub2_Sub2_Sub1_4.anInt3920;
											return;
										}
										if (arg0 == 3327) {
											anIntArray257[anInt3702++] = Static554.aClass3_Sub1_Sub2_Sub2_Sub1_4.aClass245_1 != null && Static554.aClass3_Sub1_Sub2_Sub2_Sub1_4.aClass245_1.aBoolean441 ? 1 : 0;
											return;
										}
										if (arg0 == 3329) {
											anIntArray257[anInt3702++] = Static42.aBoolean75 ? 1 : 0;
											return;
										}
										if (arg0 == 3330) {
											local13 = anIntArray257[--anInt3702];
											anIntArray257[anInt3702++] = Static227.method3322(local13);
											return;
										}
										if (arg0 == 3331) {
											anInt3702 -= 2;
											local13 = anIntArray257[anInt3702];
											local19 = anIntArray257[anInt3702 + 1];
											anIntArray257[anInt3702++] = Static145.method2540(false, local13, local19);
											return;
										}
										if (arg0 == 3332) {
											anInt3702 -= 2;
											local13 = anIntArray257[anInt3702];
											local19 = anIntArray257[anInt3702 + 1];
											anIntArray257[anInt3702++] = Static145.method2540(true, local13, local19);
											return;
										}
										if (arg0 == 3333) {
											anIntArray257[anInt3702++] = Static532.method7160();
											return;
										}
										if (arg0 == 3335) {
											anIntArray257[anInt3702++] = Static164.anInt2984;
											return;
										}
										if (arg0 == 3336) {
											anInt3702 -= 4;
											local13 = anIntArray257[anInt3702];
											local19 = anIntArray257[anInt3702 + 1];
											local25 = anIntArray257[anInt3702 + 2];
											local357 = anIntArray257[anInt3702 + 3];
											local13 += local19 << 14;
											local13 += local25 << 28;
											local13 += local357;
											anIntArray257[anInt3702++] = local13;
											return;
										}
										if (arg0 == 3337) {
											anIntArray257[anInt3702++] = Static461.anInt7416;
											return;
										}
										if (arg0 == 3338) {
											anIntArray257[anInt3702++] = Static319.method4404();
											return;
										}
										if (arg0 == 3339) {
											anIntArray257[anInt3702++] = 0;
											return;
										}
										if (arg0 == 3340) {
											anIntArray257[anInt3702++] = Static175.aBoolean230 ? 1 : 0;
											return;
										}
										if (arg0 == 3341) {
											anIntArray257[anInt3702++] = Static555.aBoolean668 ? 1 : 0;
											return;
										}
										if (arg0 == 3342) {
											anIntArray257[anInt3702++] = Static373.aClass161_1.method5903();
											return;
										}
										if (arg0 == 3343) {
											anIntArray257[anInt3702++] = Static373.aClass161_1.method5898();
											return;
										}
										if (arg0 == 3344) {
											aStringArray17[anInt3709++] = Static414.method5205();
											return;
										}
										if (arg0 == 3345) {
											aStringArray17[anInt3709++] = Static527.method7104();
											return;
										}
										if (arg0 == 3346) {
											anIntArray257[anInt3702++] = Static621.method8351();
											return;
										}
										if (arg0 == 3347) {
											anIntArray257[anInt3702++] = Static308.anInt9935;
											return;
										}
										if (arg0 == 3349) {
											anIntArray257[anInt3702++] = Static554.aClass3_Sub1_Sub2_Sub2_Sub1_4.aClass240_7.method4986() >> 3;
											return;
										}
									} else if (arg0 < 3500) {
										@Pc(5909) Class381 local5909;
										if (arg0 == 3400) {
											anInt3702 -= 2;
											local13 = anIntArray257[anInt3702];
											local19 = anIntArray257[anInt3702 + 1];
											local5909 = Static599.aClass311_1.method6971(local13);
											aStringArray17[anInt3709++] = local5909.method8604(local19);
											return;
										}
										if (arg0 == 3408) {
											anInt3702 -= 4;
											local13 = anIntArray257[anInt3702];
											local19 = anIntArray257[anInt3702 + 1];
											local25 = anIntArray257[anInt3702 + 2];
											local357 = anIntArray257[anInt3702 + 3];
											@Pc(5955) Class381 local5955 = Static599.aClass311_1.method6971(local25);
											if (local5955.aChar5 == local13 && local5955.aChar6 == local19) {
												if (local19 == 115) {
													aStringArray17[anInt3709++] = local5955.method8604(local357);
													return;
												}
												anIntArray257[anInt3702++] = local5955.method8611(local357);
												return;
											}
											throw new RuntimeException("C3408-1 " + local25 + "-" + local357);
										}
										if (arg0 == 3409) {
											anInt3702 -= 3;
											local13 = anIntArray257[anInt3702];
											local19 = anIntArray257[anInt3702 + 1];
											local25 = anIntArray257[anInt3702 + 2];
											if (local19 == -1) {
												throw new RuntimeException("C3409-2");
											}
											@Pc(6041) Class381 local6041 = Static599.aClass311_1.method6971(local19);
											if (local6041.aChar6 != local13) {
												throw new RuntimeException("C3409-1");
											}
											anIntArray257[anInt3702++] = local6041.method8601(local25) ? 1 : 0;
											return;
										}
										if (arg0 == 3410) {
											local13 = anIntArray257[--anInt3702];
											local1161 = aStringArray17[--anInt3709];
											if (local13 == -1) {
												throw new RuntimeException("C3410-2");
											}
											local5909 = Static599.aClass311_1.method6971(local13);
											if (local5909.aChar6 != 's') {
												throw new RuntimeException("C3410-1");
											}
											anIntArray257[anInt3702++] = local5909.method8602(local1161) ? 1 : 0;
											return;
										}
										if (arg0 == 3411) {
											local13 = anIntArray257[--anInt3702];
											@Pc(6139) Class381 local6139 = Static599.aClass311_1.method6971(local13);
											anIntArray257[anInt3702++] = local6139.aClass66_46.method1990();
											return;
										}
									} else if (arg0 < 3700) {
										if (arg0 == 3600) {
											if (Static517.anInt8054 == 0) {
												anIntArray257[anInt3702++] = -2;
												return;
											}
											if (Static517.anInt8054 == 1) {
												anIntArray257[anInt3702++] = -1;
												return;
											}
											anIntArray257[anInt3702++] = Static450.anInt7035;
											return;
										}
										if (arg0 == 3601) {
											local13 = anIntArray257[--anInt3702];
											if (Static517.anInt8054 == 2 && local13 < Static450.anInt7035) {
												aStringArray17[anInt3709++] = Static289.aStringArray20[local13];
												if (Static496.aStringArray41[local13] != null) {
													aStringArray17[anInt3709++] = Static496.aStringArray41[local13];
													return;
												}
												aStringArray17[anInt3709++] = "";
												return;
											}
											aStringArray17[anInt3709++] = "";
											aStringArray17[anInt3709++] = "";
											return;
										}
										if (arg0 == 3602) {
											local13 = anIntArray257[--anInt3702];
											if (Static517.anInt8054 == 2 && local13 < Static450.anInt7035) {
												anIntArray257[anInt3702++] = Static151.anIntArray198[local13];
												return;
											}
											anIntArray257[anInt3702++] = 0;
											return;
										}
										if (arg0 == 3603) {
											local13 = anIntArray257[--anInt3702];
											if (Static517.anInt8054 == 2 && local13 < Static450.anInt7035) {
												anIntArray257[anInt3702++] = Static536.anIntArray566[local13];
												return;
											}
											anIntArray257[anInt3702++] = 0;
											return;
										}
										if (arg0 == 3604) {
											local4177 = aStringArray17[--anInt3709];
											local19 = anIntArray257[--anInt3702];
											Static636.method8470(local4177, local19);
											return;
										}
										if (arg0 == 3605) {
											local4177 = aStringArray17[--anInt3709];
											Static574.method7596(local4177);
											return;
										}
										if (arg0 == 3606) {
											local4177 = aStringArray17[--anInt3709];
											Static200.method3057(local4177);
											return;
										}
										if (arg0 == 3607) {
											local4177 = aStringArray17[--anInt3709];
											Static341.method4653(local4177, false);
											return;
										}
										if (arg0 == 3608) {
											local4177 = aStringArray17[--anInt3709];
											Static234.method2232(local4177);
											return;
										}
										if (arg0 == 3609) {
											local4177 = aStringArray17[--anInt3709];
											if (local4177.startsWith("<img=0>") || local4177.startsWith("<img=1>")) {
												local4177 = local4177.substring(7);
											}
											anIntArray257[anInt3702++] = Static74.method1578(local4177) ? 1 : 0;
											return;
										}
										if (arg0 == 3610) {
											local13 = anIntArray257[--anInt3702];
											if (Static517.anInt8054 == 2 && local13 < Static450.anInt7035) {
												aStringArray17[anInt3709++] = Static368.aStringArray27[local13];
												return;
											}
											aStringArray17[anInt3709++] = "";
											return;
										}
										if (arg0 == 3611) {
											if (Static348.aString69 != null) {
												aStringArray17[anInt3709++] = Static264.method3792(Static348.aString69);
												return;
											}
											aStringArray17[anInt3709++] = "";
											return;
										}
										if (arg0 == 3612) {
											if (Static348.aString69 != null) {
												anIntArray257[anInt3702++] = Static596.anInt9157;
												return;
											}
											anIntArray257[anInt3702++] = 0;
											return;
										}
										if (arg0 == 3613) {
											local13 = anIntArray257[--anInt3702];
											if (Static348.aString69 != null && local13 < Static596.anInt9157) {
												aStringArray17[anInt3709++] = Static547.aClass275Array1[local13].aString88;
												return;
											}
											aStringArray17[anInt3709++] = "";
											return;
										}
										if (arg0 == 3614) {
											local13 = anIntArray257[--anInt3702];
											if (Static348.aString69 != null && local13 < Static596.anInt9157) {
												anIntArray257[anInt3702++] = Static547.aClass275Array1[local13].anInt7327;
												return;
											}
											anIntArray257[anInt3702++] = 0;
											return;
										}
										if (arg0 == 3615) {
											local13 = anIntArray257[--anInt3702];
											if (Static348.aString69 != null && local13 < Static596.anInt9157) {
												anIntArray257[anInt3702++] = Static547.aClass275Array1[local13].aByte105;
												return;
											}
											anIntArray257[anInt3702++] = 0;
											return;
										}
										if (arg0 == 3616) {
											anIntArray257[anInt3702++] = Static164.aByte32;
											return;
										}
										if (arg0 == 3617) {
											local4177 = aStringArray17[--anInt3709];
											Static206.method3094(local4177);
											return;
										}
										if (arg0 == 3618) {
											anIntArray257[anInt3702++] = Static294.aByte73;
											return;
										}
										if (arg0 == 3619) {
											local4177 = aStringArray17[--anInt3709];
											Static303.method4272(local4177);
											return;
										}
										if (arg0 == 3620) {
											Static259.method3755();
											return;
										}
										if (arg0 == 3621) {
											if (Static517.anInt8054 == 0) {
												anIntArray257[anInt3702++] = -1;
												return;
											}
											anIntArray257[anInt3702++] = Static633.anInt9792;
											return;
										}
										if (arg0 == 3622) {
											local13 = anIntArray257[--anInt3702];
											if (Static517.anInt8054 != 0 && local13 < Static633.anInt9792) {
												aStringArray17[anInt3709++] = Static16.aStringArray4[local13];
												if (Static301.aStringArray21[local13] != null) {
													aStringArray17[anInt3709++] = Static301.aStringArray21[local13];
													return;
												}
												aStringArray17[anInt3709++] = "";
												return;
											}
											aStringArray17[anInt3709++] = "";
											aStringArray17[anInt3709++] = "";
											return;
										}
										if (arg0 == 3623) {
											local4177 = aStringArray17[--anInt3709];
											if (local4177.startsWith("<img=0>") || local4177.startsWith("<img=1>")) {
												local4177 = local4177.substring(7);
											}
											anIntArray257[anInt3702++] = Static130.method2323(local4177) ? 1 : 0;
											return;
										}
										if (arg0 == 3624) {
											local13 = anIntArray257[--anInt3702];
											if (Static547.aClass275Array1 != null && local13 < Static596.anInt9157 && Static547.aClass275Array1[local13].aString90.equalsIgnoreCase(Static554.aClass3_Sub1_Sub2_Sub2_Sub1_4.aString37)) {
												anIntArray257[anInt3702++] = 1;
												return;
											}
											anIntArray257[anInt3702++] = 0;
											return;
										}
										if (arg0 == 3625) {
											if (Static324.aString56 != null) {
												aStringArray17[anInt3709++] = Static324.aString56;
												return;
											}
											aStringArray17[anInt3709++] = "";
											return;
										}
										if (arg0 == 3626) {
											local13 = anIntArray257[--anInt3702];
											if (Static348.aString69 != null && local13 < Static596.anInt9157) {
												aStringArray17[anInt3709++] = Static547.aClass275Array1[local13].aString87;
												return;
											}
											aStringArray17[anInt3709++] = "";
											return;
										}
										if (arg0 == 3627) {
											local13 = anIntArray257[--anInt3702];
											if (Static517.anInt8054 == 2 && local13 >= 0 && local13 < Static450.anInt7035) {
												anIntArray257[anInt3702++] = Static226.aBooleanArray9[local13] ? 1 : 0;
												return;
											}
											anIntArray257[anInt3702++] = 0;
											return;
										}
										if (arg0 == 3628) {
											local4177 = aStringArray17[--anInt3709];
											if (local4177.startsWith("<img=0>") || local4177.startsWith("<img=1>")) {
												local4177 = local4177.substring(7);
											}
											anIntArray257[anInt3702++] = Static427.method5927(local4177);
											return;
										}
										if (arg0 == 3629) {
											anIntArray257[anInt3702++] = Static138.anInt2568;
											return;
										}
										if (arg0 == 3630) {
											local4177 = aStringArray17[--anInt3709];
											Static341.method4653(local4177, true);
											return;
										}
										if (arg0 == 3631) {
											local13 = anIntArray257[--anInt3702];
											anIntArray257[anInt3702++] = Static506.aBooleanArray16[local13] ? 1 : 0;
											return;
										}
										if (arg0 == 3632) {
											local13 = anIntArray257[--anInt3702];
											if (Static348.aString69 != null && local13 < Static596.anInt9157) {
												aStringArray17[anInt3709++] = Static547.aClass275Array1[local13].aString90;
												return;
											}
											aStringArray17[anInt3709++] = "";
											return;
										}
										if (arg0 == 3633) {
											local13 = anIntArray257[--anInt3702];
											if (Static517.anInt8054 != 0 && local13 < Static633.anInt9792) {
												aStringArray17[anInt3709++] = Static280.aStringArray49[local13];
												return;
											}
											aStringArray17[anInt3709++] = "";
											return;
										}
									} else if (arg0 < 3800) {
										if (arg0 == 3700) {
											if (Static345.aClass267_4 != null) {
												anIntArray257[anInt3702++] = 1;
												aClass267_3 = Static345.aClass267_4;
												return;
											}
											anIntArray257[anInt3702++] = 0;
											return;
										}
										if (arg0 == 3701) {
											if (Static140.aClass267_5 != null) {
												anIntArray257[anInt3702++] = 1;
												aClass267_3 = Static140.aClass267_5;
												return;
											}
											anIntArray257[anInt3702++] = 0;
											return;
										}
										if (arg0 == 3702) {
											aStringArray17[anInt3709++] = aClass267_3.aString81;
											return;
										}
										if (arg0 == 3703) {
											anIntArray257[anInt3702++] = aClass267_3.aBoolean525 ? 1 : 0;
											return;
										}
										if (arg0 == 3704) {
											anIntArray257[anInt3702++] = aClass267_3.aByte94;
											return;
										}
										if (arg0 == 3705) {
											anIntArray257[anInt3702++] = aClass267_3.aByte93;
											return;
										}
										if (arg0 == 3706) {
											anIntArray257[anInt3702++] = aClass267_3.aByte96;
											return;
										}
										if (arg0 == 3707) {
											anIntArray257[anInt3702++] = aClass267_3.aByte95;
											return;
										}
										if (arg0 == 3709) {
											anIntArray257[anInt3702++] = aClass267_3.anInt6793;
											return;
										}
										if (arg0 == 3710) {
											local13 = anIntArray257[--anInt3702];
											aStringArray17[anInt3709++] = aClass267_3.aStringArray33[local13];
											return;
										}
										if (arg0 == 3711) {
											local13 = anIntArray257[--anInt3702];
											anIntArray257[anInt3702++] = aClass267_3.aByteArray64[local13];
											return;
										}
										if (arg0 == 3712) {
											anIntArray257[anInt3702++] = aClass267_3.anInt6803;
											return;
										}
										if (arg0 == 3713) {
											local13 = anIntArray257[--anInt3702];
											aStringArray17[anInt3709++] = aClass267_3.aStringArray32[local13];
											return;
										}
										if (arg0 == 3714) {
											anInt3702 -= 3;
											local13 = anIntArray257[anInt3702];
											local19 = anIntArray257[anInt3702 + 1];
											local25 = anIntArray257[anInt3702 + 2];
											anIntArray257[anInt3702++] = aClass267_3.method5945(local25, local19, local13);
											return;
										}
										if (arg0 == 3715) {
											anIntArray257[anInt3702++] = aClass267_3.anInt6790;
											return;
										}
										if (arg0 == 3716) {
											anIntArray257[anInt3702++] = aClass267_3.anInt6780;
											return;
										}
										if (arg0 == 3717) {
											anIntArray257[anInt3702++] = aClass267_3.method5961(aStringArray17[--anInt3709]);
											return;
										}
										if (arg0 == 3718) {
											anIntArray257[anInt3702 - 1] = aClass267_3.method5943()[anIntArray257[anInt3702 - 1]];
											return;
										}
										if (arg0 == 3750) {
											if (Static252.aClass4_Sub55_3 != null) {
												anIntArray257[anInt3702++] = 1;
												aClass4_Sub55_2 = Static252.aClass4_Sub55_3;
												return;
											}
											anIntArray257[anInt3702++] = 0;
											return;
										}
										if (arg0 == 3751) {
											if (Static64.aClass4_Sub55_1 != null) {
												anIntArray257[anInt3702++] = 1;
												aClass4_Sub55_2 = Static64.aClass4_Sub55_1;
												return;
											}
											anIntArray257[anInt3702++] = 0;
											return;
										}
										if (arg0 == 3752) {
											aStringArray17[anInt3709++] = aClass4_Sub55_2.aString124;
											return;
										}
										if (arg0 == 3753) {
											anIntArray257[anInt3702++] = aClass4_Sub55_2.aByte149;
											return;
										}
										if (arg0 == 3754) {
											anIntArray257[anInt3702++] = aClass4_Sub55_2.aByte150;
											return;
										}
										if (arg0 == 3755) {
											anIntArray257[anInt3702++] = aClass4_Sub55_2.anInt10602;
											return;
										}
										if (arg0 == 3756) {
											local13 = anIntArray257[--anInt3702];
											aStringArray17[anInt3709++] = aClass4_Sub55_2.aClass357Array1[local13].aString111;
											return;
										}
										if (arg0 == 3757) {
											local13 = anIntArray257[--anInt3702];
											anIntArray257[anInt3702++] = aClass4_Sub55_2.aClass357Array1[local13].aByte136;
											return;
										}
										if (arg0 == 3758) {
											local13 = anIntArray257[--anInt3702];
											anIntArray257[anInt3702++] = aClass4_Sub55_2.aClass357Array1[local13].anInt9106;
											return;
										}
										if (arg0 == 3759) {
											local13 = anIntArray257[--anInt3702];
											Static427.method5930(aClass4_Sub55_2 == Static64.aClass4_Sub55_1, local13);
											return;
										}
										if (arg0 == 3760) {
											anIntArray257[anInt3702++] = aClass4_Sub55_2.method8965(aStringArray17[--anInt3709]);
											return;
										}
										if (arg0 == 3761) {
											anIntArray257[anInt3702 - 1] = aClass4_Sub55_2.method8967()[anIntArray257[anInt3702 - 1]];
											return;
										}
									} else if (arg0 < 4000) {
										if (arg0 == 3903) {
											local13 = anIntArray257[--anInt3702];
											anIntArray257[anInt3702++] = Static493.aClass203Array1[local13].method4493();
											return;
										}
										if (arg0 == 3904) {
											local13 = anIntArray257[--anInt3702];
											anIntArray257[anInt3702++] = Static493.aClass203Array1[local13].anInt5098;
											return;
										}
										if (arg0 == 3905) {
											local13 = anIntArray257[--anInt3702];
											anIntArray257[anInt3702++] = Static493.aClass203Array1[local13].anInt5093;
											return;
										}
										if (arg0 == 3906) {
											local13 = anIntArray257[--anInt3702];
											anIntArray257[anInt3702++] = Static493.aClass203Array1[local13].anInt5097;
											return;
										}
										if (arg0 == 3907) {
											local13 = anIntArray257[--anInt3702];
											anIntArray257[anInt3702++] = Static493.aClass203Array1[local13].anInt5095;
											return;
										}
										if (arg0 == 3908) {
											local13 = anIntArray257[--anInt3702];
											anIntArray257[anInt3702++] = Static493.aClass203Array1[local13].anInt5096;
											return;
										}
										if (arg0 == 3910) {
											local13 = anIntArray257[--anInt3702];
											local19 = Static493.aClass203Array1[local13].method4494();
											anIntArray257[anInt3702++] = local19 == 0 ? 1 : 0;
											return;
										}
										if (arg0 == 3911) {
											local13 = anIntArray257[--anInt3702];
											local19 = Static493.aClass203Array1[local13].method4494();
											anIntArray257[anInt3702++] = local19 == 2 ? 1 : 0;
											return;
										}
										if (arg0 == 3912) {
											local13 = anIntArray257[--anInt3702];
											local19 = Static493.aClass203Array1[local13].method4494();
											anIntArray257[anInt3702++] = local19 == 5 ? 1 : 0;
											return;
										}
										if (arg0 == 3913) {
											local13 = anIntArray257[--anInt3702];
											local19 = Static493.aClass203Array1[local13].method4494();
											anIntArray257[anInt3702++] = local19 == 1 ? 1 : 0;
											return;
										}
									} else {
										@Pc(8208) long local8208;
										if (arg0 < 4100) {
											if (arg0 == 4000) {
												anInt3702 -= 2;
												local13 = anIntArray257[anInt3702];
												local19 = anIntArray257[anInt3702 + 1];
												anIntArray257[anInt3702++] = local13 + local19;
												return;
											}
											if (arg0 == 4001) {
												anInt3702 -= 2;
												local13 = anIntArray257[anInt3702];
												local19 = anIntArray257[anInt3702 + 1];
												anIntArray257[anInt3702++] = local13 - local19;
												return;
											}
											if (arg0 == 4002) {
												anInt3702 -= 2;
												local13 = anIntArray257[anInt3702];
												local19 = anIntArray257[anInt3702 + 1];
												anIntArray257[anInt3702++] = local13 * local19;
												return;
											}
											if (arg0 == 4003) {
												anInt3702 -= 2;
												local13 = anIntArray257[anInt3702];
												local19 = anIntArray257[anInt3702 + 1];
												anIntArray257[anInt3702++] = local13 / local19;
												return;
											}
											if (arg0 == 4004) {
												local13 = anIntArray257[--anInt3702];
												anIntArray257[anInt3702++] = (int) (Math.random() * (double) local13);
												return;
											}
											if (arg0 == 4005) {
												local13 = anIntArray257[--anInt3702];
												anIntArray257[anInt3702++] = (int) (Math.random() * (double) (local13 + 1));
												return;
											}
											if (arg0 == 4006) {
												anInt3702 -= 5;
												local13 = anIntArray257[anInt3702];
												local19 = anIntArray257[anInt3702 + 1];
												local25 = anIntArray257[anInt3702 + 2];
												local357 = anIntArray257[anInt3702 + 3];
												local2473 = anIntArray257[anInt3702 + 4];
												anIntArray257[anInt3702++] = local13 + (local19 - local13) * (local2473 - local25) / (local357 - local25);
												return;
											}
											@Pc(8215) long local8215;
											if (arg0 == 4007) {
												anInt3702 -= 2;
												local8208 = (long) anIntArray257[anInt3702];
												local8215 = (long) anIntArray257[anInt3702 + 1];
												anIntArray257[anInt3702++] = (int) (local8208 + local8208 * local8215 / 100L);
												return;
											}
											if (arg0 == 4008) {
												anInt3702 -= 2;
												local13 = anIntArray257[anInt3702];
												local19 = anIntArray257[anInt3702 + 1];
												anIntArray257[anInt3702++] = local13 | 0x1 << local19;
												return;
											}
											if (arg0 == 4009) {
												anInt3702 -= 2;
												local13 = anIntArray257[anInt3702];
												local19 = anIntArray257[anInt3702 + 1];
												anIntArray257[anInt3702++] = local13 & -(0x1 << local19) - 1;
												return;
											}
											if (arg0 == 4010) {
												anInt3702 -= 2;
												local13 = anIntArray257[anInt3702];
												local19 = anIntArray257[anInt3702 + 1];
												anIntArray257[anInt3702++] = (local13 & 0x1 << local19) == 0 ? 0 : 1;
												return;
											}
											if (arg0 == 4011) {
												anInt3702 -= 2;
												local13 = anIntArray257[anInt3702];
												local19 = anIntArray257[anInt3702 + 1];
												anIntArray257[anInt3702++] = local13 % local19;
												return;
											}
											if (arg0 == 4012) {
												anInt3702 -= 2;
												local13 = anIntArray257[anInt3702];
												local19 = anIntArray257[anInt3702 + 1];
												if (local13 == 0) {
													anIntArray257[anInt3702++] = 0;
													return;
												}
												anIntArray257[anInt3702++] = (int) Math.pow((double) local13, (double) local19);
												return;
											}
											if (arg0 == 4013) {
												anInt3702 -= 2;
												local13 = anIntArray257[anInt3702];
												local19 = anIntArray257[anInt3702 + 1];
												if (local13 == 0) {
													anIntArray257[anInt3702++] = 0;
													return;
												}
												if (local19 == 0) {
													anIntArray257[anInt3702++] = Integer.MAX_VALUE;
													return;
												}
												anIntArray257[anInt3702++] = (int) Math.pow((double) local13, 1.0D / (double) local19);
												return;
											}
											if (arg0 == 4014) {
												anInt3702 -= 2;
												local13 = anIntArray257[anInt3702];
												local19 = anIntArray257[anInt3702 + 1];
												anIntArray257[anInt3702++] = local13 & local19;
												return;
											}
											if (arg0 == 4015) {
												anInt3702 -= 2;
												local13 = anIntArray257[anInt3702];
												local19 = anIntArray257[anInt3702 + 1];
												anIntArray257[anInt3702++] = local13 | local19;
												return;
											}
											if (arg0 == 4016) {
												anInt3702 -= 2;
												local13 = anIntArray257[anInt3702];
												local19 = anIntArray257[anInt3702 + 1];
												anIntArray257[anInt3702++] = local13 < local19 ? local13 : local19;
												return;
											}
											if (arg0 == 4017) {
												anInt3702 -= 2;
												local13 = anIntArray257[anInt3702];
												local19 = anIntArray257[anInt3702 + 1];
												anIntArray257[anInt3702++] = local13 > local19 ? local13 : local19;
												return;
											}
											if (arg0 == 4018) {
												anInt3702 -= 3;
												local8208 = (long) anIntArray257[anInt3702];
												local8215 = (long) anIntArray257[anInt3702 + 1];
												@Pc(8596) long local8596 = (long) anIntArray257[anInt3702 + 2];
												anIntArray257[anInt3702++] = (int) (local8208 * local8596 / local8215);
												return;
											}
											if (arg0 == 4019) {
												anInt3702 -= 2;
												local13 = anIntArray257[anInt3702];
												local19 = anIntArray257[anInt3702 + 1];
												if (local13 > 700 || local19 > 700) {
													anIntArray257[anInt3702++] = 256;
												}
												@Pc(8655) double local8655 = (Math.random() * (double) (local19 + local13) + 800.0D - (double) local13) / 100.0D;
												anIntArray257[anInt3702++] = (int) (Math.pow(2.0D, local8655) + 0.5D);
												return;
											}
											if (arg0 == 4020) {
												local13 = anIntArray257[--anInt3702];
												anIntArray257[anInt3702++] = Static84.anIntArray114[Static391.method5048(local13) & 0xFFFF];
												return;
											}
										} else if (arg0 < 4200) {
											if (arg0 == 4100) {
												local4177 = aStringArray17[--anInt3709];
												local19 = anIntArray257[--anInt3702];
												aStringArray17[anInt3709++] = local4177 + local19;
												return;
											}
											if (arg0 == 4101) {
												anInt3709 -= 2;
												local4177 = aStringArray17[anInt3709];
												local1161 = aStringArray17[anInt3709 + 1];
												aStringArray17[anInt3709++] = local4177 + local1161;
												return;
											}
											if (arg0 == 4102) {
												local4177 = aStringArray17[--anInt3709];
												local19 = anIntArray257[--anInt3702];
												aStringArray17[anInt3709++] = local4177 + Static438.method6053(true, local19);
												return;
											}
											if (arg0 == 4103) {
												local4177 = aStringArray17[--anInt3709];
												aStringArray17[anInt3709++] = local4177.toLowerCase();
												return;
											}
											if (arg0 == 4104) {
												aStringArray17[anInt3709++] = Static415.method5233(Static164.anInt2984, Static670.method6029(anIntArray257[--anInt3702]));
												return;
											}
											if (arg0 == 4105) {
												anInt3709 -= 2;
												local4177 = aStringArray17[anInt3709];
												local1161 = aStringArray17[anInt3709 + 1];
												if (Static554.aClass3_Sub1_Sub2_Sub2_Sub1_4.aClass245_1 != null && Static554.aClass3_Sub1_Sub2_Sub2_Sub1_4.aClass245_1.aBoolean441) {
													aStringArray17[anInt3709++] = local1161;
													return;
												}
												aStringArray17[anInt3709++] = local4177;
												return;
											}
											if (arg0 == 4106) {
												local13 = anIntArray257[--anInt3702];
												aStringArray17[anInt3709++] = Integer.toString(local13);
												return;
											}
											if (arg0 == 4107) {
												anInt3709 -= 2;
												anIntArray257[anInt3702++] = Static59.method1324(Static164.anInt2984, aStringArray17[anInt3709], aStringArray17[anInt3709 + 1]);
												return;
											}
											@Pc(8968) Class31 local8968;
											if (arg0 == 4108) {
												local4177 = aStringArray17[--anInt3709];
												anInt3702 -= 2;
												local19 = anIntArray257[anInt3702];
												local25 = anIntArray257[anInt3702 + 1];
												local8968 = Static464.method6458(local25, Static305.aClass34_68);
												anIntArray257[anInt3702++] = local8968.method1017(Static638.aClass17Array18, local4177, local19);
												return;
											}
											if (arg0 == 4109) {
												local4177 = aStringArray17[--anInt3709];
												anInt3702 -= 2;
												local19 = anIntArray257[anInt3702];
												local25 = anIntArray257[anInt3702 + 1];
												local8968 = Static464.method6458(local25, Static305.aClass34_68);
												anIntArray257[anInt3702++] = local8968.method1020(Static638.aClass17Array18, local4177, local19);
												return;
											}
											if (arg0 == 4110) {
												anInt3709 -= 2;
												local4177 = aStringArray17[anInt3709];
												local1161 = aStringArray17[anInt3709 + 1];
												if (anIntArray257[--anInt3702] == 1) {
													aStringArray17[anInt3709++] = local4177;
													return;
												}
												aStringArray17[anInt3709++] = local1161;
												return;
											}
											if (arg0 == 4111) {
												local4177 = aStringArray17[--anInt3709];
												aStringArray17[anInt3709++] = Static30.method665(local4177);
												return;
											}
											if (arg0 == 4112) {
												local4177 = aStringArray17[--anInt3709];
												local19 = anIntArray257[--anInt3702];
												if (local19 == -1) {
													throw new RuntimeException("null char");
												}
												aStringArray17[anInt3709++] = local4177 + (char) local19;
												return;
											}
											if (arg0 == 4113) {
												local13 = anIntArray257[--anInt3702];
												anIntArray257[anInt3702++] = method3385((char) local13);
												return;
											}
											if (arg0 == 4114) {
												local13 = anIntArray257[--anInt3702];
												anIntArray257[anInt3702++] = Static251.method1890((char) local13) ? 1 : 0;
												return;
											}
											if (arg0 == 4115) {
												local13 = anIntArray257[--anInt3702];
												anIntArray257[anInt3702++] = Static429.method5933((char) local13) ? 1 : 0;
												return;
											}
											if (arg0 == 4116) {
												local13 = anIntArray257[--anInt3702];
												anIntArray257[anInt3702++] = Static498.method6738((char) local13) ? 1 : 0;
												return;
											}
											if (arg0 == 4117) {
												local4177 = aStringArray17[--anInt3709];
												if (local4177 != null) {
													anIntArray257[anInt3702++] = local4177.length();
													return;
												}
												anIntArray257[anInt3702++] = 0;
												return;
											}
											if (arg0 == 4118) {
												local4177 = aStringArray17[--anInt3709];
												anInt3702 -= 2;
												local19 = anIntArray257[anInt3702];
												local25 = anIntArray257[anInt3702 + 1];
												aStringArray17[anInt3709++] = local4177.substring(local19, local25);
												return;
											}
											if (arg0 == 4119) {
												local4177 = aStringArray17[--anInt3709];
												@Pc(9326) StringBuffer local9326 = new StringBuffer(local4177.length());
												@Pc(9328) boolean local9328 = false;
												for (local357 = 0; local357 < local4177.length(); local357++) {
													@Pc(9335) char local9335 = local4177.charAt(local357);
													if (local9335 == '<') {
														local9328 = true;
													} else if (local9335 == '>') {
														local9328 = false;
													} else if (!local9328) {
														local9326.append(local9335);
													}
												}
												aStringArray17[anInt3709++] = local9326.toString();
												return;
											}
											if (arg0 == 4120) {
												local4177 = aStringArray17[--anInt3709];
												anInt3702 -= 2;
												local19 = anIntArray257[anInt3702];
												local25 = anIntArray257[anInt3702 + 1];
												anIntArray257[anInt3702++] = local4177.indexOf(local19, local25);
												return;
											}
											if (arg0 == 4121) {
												anInt3709 -= 2;
												local4177 = aStringArray17[anInt3709];
												local1161 = aStringArray17[anInt3709 + 1];
												local25 = anIntArray257[--anInt3702];
												anIntArray257[anInt3702++] = local4177.indexOf(local1161, local25);
												return;
											}
											if (arg0 == 4122) {
												local13 = anIntArray257[--anInt3702];
												anIntArray257[anInt3702++] = Character.toLowerCase((char) local13);
												return;
											}
											if (arg0 == 4123) {
												local13 = anIntArray257[--anInt3702];
												anIntArray257[anInt3702++] = Character.toUpperCase((char) local13);
												return;
											}
											if (arg0 == 4124) {
												local420 = anIntArray257[--anInt3702] != 0;
												local19 = anIntArray257[--anInt3702];
												aStringArray17[anInt3709++] = Static34.method8333((long) local19, local420, Static164.anInt2984, 0);
												return;
											}
											if (arg0 == 4125) {
												local4177 = aStringArray17[--anInt3709];
												local19 = anIntArray257[--anInt3702];
												@Pc(9549) Class31 local9549 = Static464.method6458(local19, Static305.aClass34_68);
												anIntArray257[anInt3702++] = local9549.method1022(local4177, Static638.aClass17Array18);
												return;
											}
											if (arg0 == 4126) {
												aStringArray17[anInt3709++] = Static510.method6943(Static164.anInt2984, (long) anIntArray257[--anInt3702] * 60000L) + " UTC";
												return;
											}
											if (arg0 == 4127) {
												local8208 = aLongArray4[--anInt3708];
												aStringArray17[anInt3709++] = local8208 == -1L ? "" : Long.toString(local8208, 36).toUpperCase();
												return;
											}
										} else if (arg0 < 4300) {
											if (arg0 == 4200) {
												local13 = anIntArray257[--anInt3702];
												aStringArray17[anInt3709++] = Static532.aClass255_2.method5210(local13).aString24;
												return;
											}
											@Pc(9672) Class110 local9672;
											if (arg0 == 4201) {
												anInt3702 -= 2;
												local13 = anIntArray257[anInt3702];
												local19 = anIntArray257[anInt3702 + 1];
												local9672 = Static532.aClass255_2.method5210(local13);
												if (local19 >= 1 && local19 <= 5 && local9672.aStringArray14[local19 - 1] != null) {
													aStringArray17[anInt3709++] = local9672.aStringArray14[local19 - 1];
													return;
												}
												aStringArray17[anInt3709++] = "";
												return;
											}
											if (arg0 == 4202) {
												anInt3702 -= 2;
												local13 = anIntArray257[anInt3702];
												local19 = anIntArray257[anInt3702 + 1];
												local9672 = Static532.aClass255_2.method5210(local13);
												if (local19 >= 1 && local19 <= 5 && local9672.aStringArray15[local19 - 1] != null) {
													aStringArray17[anInt3709++] = local9672.aStringArray15[local19 - 1];
													return;
												}
												aStringArray17[anInt3709++] = "";
												return;
											}
											if (arg0 == 4203) {
												local13 = anIntArray257[--anInt3702];
												anIntArray257[anInt3702++] = Static532.aClass255_2.method5210(local13).anInt2753;
												return;
											}
											if (arg0 == 4204) {
												local13 = anIntArray257[--anInt3702];
												anIntArray257[anInt3702++] = Static532.aClass255_2.method5210(local13).anInt2797 == 1 ? 1 : 0;
												return;
											}
											@Pc(9835) Class110 local9835;
											if (arg0 == 4205) {
												local13 = anIntArray257[--anInt3702];
												local9835 = Static532.aClass255_2.method5210(local13);
												if (local9835.anInt2774 == -1 && local9835.anInt2799 >= 0) {
													anIntArray257[anInt3702++] = local9835.anInt2799;
													return;
												}
												anIntArray257[anInt3702++] = local13;
												return;
											}
											if (arg0 == 4206) {
												local13 = anIntArray257[--anInt3702];
												local9835 = Static532.aClass255_2.method5210(local13);
												if (local9835.anInt2774 >= 0 && local9835.anInt2799 >= 0) {
													anIntArray257[anInt3702++] = local9835.anInt2799;
													return;
												}
												anIntArray257[anInt3702++] = local13;
												return;
											}
											if (arg0 == 4207) {
												local13 = anIntArray257[--anInt3702];
												anIntArray257[anInt3702++] = Static532.aClass255_2.method5210(local13).aBoolean202 ? 1 : 0;
												return;
											}
											if (arg0 == 4208) {
												anInt3702 -= 2;
												local13 = anIntArray257[anInt3702];
												local19 = anIntArray257[anInt3702 + 1];
												local3242 = Static482.aClass84_2.method2152(local19);
												if (local3242.method5757()) {
													aStringArray17[anInt3709++] = Static532.aClass255_2.method5210(local13).method2606(local19, local3242.aString77);
													return;
												}
												anIntArray257[anInt3702++] = Static532.aClass255_2.method5210(local13).method2611(local3242.anInt6617, local19);
												return;
											}
											if (arg0 == 4209) {
												anInt3702 -= 2;
												local13 = anIntArray257[anInt3702];
												local19 = anIntArray257[anInt3702 + 1] - 1;
												local9672 = Static532.aClass255_2.method5210(local13);
												if (local9672.anInt2746 == local19) {
													anIntArray257[anInt3702++] = local9672.anInt2748;
													return;
												}
												if (local9672.anInt2766 == local19) {
													anIntArray257[anInt3702++] = local9672.anInt2770;
													return;
												}
												anIntArray257[anInt3702++] = -1;
												return;
											}
											if (arg0 == 4210) {
												local4177 = aStringArray17[--anInt3709];
												local19 = anIntArray257[--anInt3702];
												Static387.method4996(local4177, local19 == 1);
												anIntArray257[anInt3702++] = Static359.anInt5450;
												return;
											}
											if (arg0 == 4211) {
												if (Static118.aShortArray33 != null && Static558.anInt8602 < Static359.anInt5450) {
													anIntArray257[anInt3702++] = Static118.aShortArray33[Static558.anInt8602++] & 0xFFFF;
													return;
												}
												anIntArray257[anInt3702++] = -1;
												return;
											}
											if (arg0 == 4212) {
												Static558.anInt8602 = 0;
												return;
											}
											if (arg0 == 4213) {
												local13 = anIntArray257[--anInt3702];
												anIntArray257[anInt3702++] = Static532.aClass255_2.method5210(local13).anInt2795;
												return;
											}
											if (arg0 == 4214) {
												local4177 = aStringArray17[--anInt3709];
												anInt3702 -= 3;
												local19 = anIntArray257[anInt3702];
												local25 = anIntArray257[anInt3702 + 1];
												local357 = anIntArray257[anInt3702 + 2];
												Static534.method7452(local25, local19 == 1, local357, local4177);
												anIntArray257[anInt3702++] = Static359.anInt5450;
												return;
											}
											if (arg0 == 4215) {
												anInt3709 -= 2;
												anInt3702 -= 2;
												local4177 = aStringArray17[anInt3709];
												local19 = anIntArray257[anInt3702];
												local25 = anIntArray257[anInt3702 + 1];
												@Pc(10234) String local10234 = aStringArray17[anInt3709 + 1];
												Static668.method8912(local10234, local25, local4177, local19 == 1);
												anIntArray257[anInt3702++] = Static359.anInt5450;
												return;
											}
										} else if (arg0 < 4400) {
											if (arg0 == 4300) {
												anInt3702 -= 2;
												local13 = anIntArray257[anInt3702];
												local19 = anIntArray257[anInt3702 + 1];
												local3242 = Static482.aClass84_2.method2152(local19);
												if (local3242.method5757()) {
													aStringArray17[anInt3709++] = Static255.aClass380_1.method8596(local13).method7532(local19, local3242.aString77);
													return;
												}
												anIntArray257[anInt3702++] = Static255.aClass380_1.method8596(local13).method7538(local19, local3242.anInt6617);
												return;
											}
										} else if (arg0 < 4500) {
											if (arg0 == 4400) {
												anInt3702 -= 2;
												local13 = anIntArray257[anInt3702];
												local19 = anIntArray257[anInt3702 + 1];
												local3242 = Static482.aClass84_2.method2152(local19);
												if (local3242.method5757()) {
													aStringArray17[anInt3709++] = Static441.aClass74_169.method2075(local13).method7501(local3242.aString77, local19);
													return;
												}
												anIntArray257[anInt3702++] = Static441.aClass74_169.method2075(local13).method7504(local19, local3242.anInt6617);
												return;
											}
										} else if (arg0 < 4600) {
											if (arg0 == 4500) {
												anInt3702 -= 2;
												local13 = anIntArray257[anInt3702];
												local19 = anIntArray257[anInt3702 + 1];
												local3242 = Static482.aClass84_2.method2152(local19);
												if (local3242.method5757()) {
													aStringArray17[anInt3709++] = Static536.aClass148_1.method3258(local13).method8589(local19, local3242.aString77);
													return;
												}
												anIntArray257[anInt3702++] = Static536.aClass148_1.method3258(local13).method8587(local19, local3242.anInt6617);
												return;
											}
										} else if (arg0 < 4700) {
											if (arg0 == 4600) {
												local13 = anIntArray257[--anInt3702];
												@Pc(10462) Class377 local10462 = Static116.aClass177_1.method3979(local13);
												if (local10462.anIntArray696 != null && local10462.anIntArray696.length > 0) {
													local25 = 0;
													local357 = local10462.anIntArray695[0];
													for (local2473 = 1; local2473 < local10462.anIntArray696.length; local2473++) {
														if (local10462.anIntArray695[local2473] > local357) {
															local25 = local2473;
															local357 = local10462.anIntArray695[local2473];
														}
													}
													anIntArray257[anInt3702++] = local10462.anIntArray696[local25];
													return;
												}
												anIntArray257[anInt3702++] = local10462.anInt10075;
												return;
											}
										} else if (arg0 < 4800) {
											if (arg0 == 4700) {
												anIntArray257[anInt3702++] = Static56.aBoolean84 ? 1 : 0;
												return;
											}
											if (arg0 == 4701) {
												local4177 = aStringArray17[--anInt3709];
												if (Static656.anInt10356 == 7 && !Static71.method1514()) {
													if (local4177.length() > 20) {
														Static583.aByte135 = -4;
														return;
													}
													Static583.aByte135 = -1;
													local4266 = Static335.method4615(Static486.aClass216_123, Static669.aClass196_2);
													local4266.aClass4_Sub11_Sub1_2.method8822(0);
													local25 = local4266.aClass4_Sub11_Sub1_2.anInt10466;
													local4266.aClass4_Sub11_Sub1_2.method8857(local4177);
													local4266.aClass4_Sub11_Sub1_2.method8835(local4266.aClass4_Sub11_Sub1_2.anInt10466 - local25);
													Static410.method5170(local4266);
													return;
												}
												Static583.aByte135 = -5;
												return;
											}
											if (arg0 == 4702) {
												anIntArray257[anInt3702++] = Static583.aByte135;
												if (Static583.aByte135 != -1) {
													Static583.aByte135 = -6;
												}
												return;
											}
										}
									}
								}
							}
						}
					} else {
						if (arg0 >= 2000) {
							arg0 -= 1000;
							local137 = Static569.method7534(anIntArray257[--anInt3702]);
						} else {
							local137 = arg1 ? aClass199_3 : aClass199_4;
						}
						if (arg0 == 1300) {
							local19 = anIntArray257[--anInt3702] - 1;
							if (local19 >= 0 && local19 <= 9) {
								local137.method4423(local19, aStringArray17[--anInt3709]);
								return;
							}
							anInt3709--;
							return;
						}
						if (arg0 == 1301) {
							anInt3702 -= 2;
							local19 = anIntArray257[anInt3702];
							local25 = anIntArray257[anInt3702 + 1];
							if (local19 == -1 && local25 == -1) {
								local137.aClass199_8 = null;
								return;
							}
							local137.aClass199_8 = Static203.method3070(local25, local19);
							return;
						}
						if (arg0 == 1302) {
							local19 = anIntArray257[--anInt3702];
							if (local19 != Static199.anInt3294 && local19 != Static547.anInt8421 && local19 != Static146.anInt2670) {
								return;
							}
							local137.anInt5010 = local19;
							return;
						}
						if (arg0 == 1303) {
							local137.anInt4991 = anIntArray257[--anInt3702];
							return;
						}
						if (arg0 == 1304) {
							local137.anInt4947 = anIntArray257[--anInt3702];
							return;
						}
						if (arg0 == 1305) {
							local137.aString50 = aStringArray17[--anInt3709];
							return;
						}
						if (arg0 == 1306) {
							local137.aString51 = aStringArray17[--anInt3709];
							return;
						}
						if (arg0 == 1307) {
							local137.aStringArray22 = null;
							return;
						}
						if (arg0 == 1308) {
							local137.anInt5020 = anIntArray257[--anInt3702];
							local137.anInt4995 = anIntArray257[--anInt3702];
							return;
						}
						if (arg0 == 1309) {
							local19 = anIntArray257[--anInt3702];
							local25 = anIntArray257[--anInt3702];
							if (local25 >= 1 && local25 <= 10) {
								local137.method4427(local19, local25 - 1);
							}
							return;
						}
						if (arg0 == 1310) {
							local137.aString49 = aStringArray17[--anInt3709];
							return;
						}
						if (arg0 == 1311) {
							local137.anInt4990 = anIntArray257[--anInt3702];
							return;
						}
						if (arg0 == 1312 || arg0 == 1313) {
							if (arg0 == 1312) {
								anInt3702 -= 3;
								local19 = anIntArray257[anInt3702] - 1;
								local25 = anIntArray257[anInt3702 + 1];
								local357 = anIntArray257[anInt3702 + 2];
								if (local19 < 0 || local19 > 9) {
									throw new RuntimeException("IOR13121313");
								}
							} else {
								anInt3702 -= 2;
								local19 = 10;
								local25 = anIntArray257[anInt3702];
								local357 = anIntArray257[anInt3702 + 1];
							}
							if (local137.aByteArray54 == null) {
								if (local25 == 0) {
									return;
								}
								local137.aByteArray54 = new byte[11];
								local137.aByteArray55 = new byte[11];
								local137.anIntArray381 = new int[11];
							}
							local137.aByteArray54[local19] = (byte) local25;
							if (local25 == 0) {
								local137.aBoolean380 = false;
								for (local2473 = 0; local2473 < local137.aByteArray54.length; local2473++) {
									if (local137.aByteArray54[local2473] != 0) {
										local137.aBoolean380 = true;
										break;
									}
								}
							} else {
								local137.aBoolean380 = true;
							}
							local137.aByteArray55[local19] = (byte) local357;
							return;
						}
						if (arg0 == 1314) {
							local137.anInt4965 = anIntArray257[--anInt3702];
							return;
						}
					}
				}
			} else {
				if (arg0 >= 2000) {
					arg0 -= 1000;
					local137 = Static569.method7534(anIntArray257[--anInt3702]);
				} else {
					local137 = arg1 ? aClass199_3 : aClass199_4;
				}
				if (arg0 == 1000) {
					anInt3702 -= 4;
					local137.anInt4968 = anIntArray257[anInt3702];
					local137.anInt5026 = anIntArray257[anInt3702 + 1];
					local19 = anIntArray257[anInt3702 + 2];
					if (local19 < 0) {
						local19 = 0;
					} else if (local19 > 5) {
						local19 = 5;
					}
					local25 = anIntArray257[anInt3702 + 3];
					if (local25 < 0) {
						local25 = 0;
					} else if (local25 > 5) {
						local25 = 5;
					}
					local137.aByte78 = (byte) local19;
					local137.aByte77 = (byte) local25;
					Static331.method4565(local137);
					Static468.method6477(local137);
					if (local137.anInt5005 == -1) {
						Static637.method8481(local137.anInt5041);
					}
					return;
				}
				if (arg0 == 1001) {
					anInt3702 -= 4;
					local137.anInt4962 = anIntArray257[anInt3702];
					local137.anInt4959 = anIntArray257[anInt3702 + 1];
					local137.anInt4953 = 0;
					local137.anInt4996 = 0;
					local19 = anIntArray257[anInt3702 + 2];
					if (local19 < 0) {
						local19 = 0;
					} else if (local19 > 4) {
						local19 = 4;
					}
					local25 = anIntArray257[anInt3702 + 3];
					if (local25 < 0) {
						local25 = 0;
					} else if (local25 > 4) {
						local25 = 4;
					}
					local137.aByte76 = (byte) local19;
					local137.aByte79 = (byte) local25;
					Static331.method4565(local137);
					Static468.method6477(local137);
					if (local137.anInt4966 == 0) {
						Static284.method4095(false, local137);
					}
					return;
				}
				if (arg0 == 1003) {
					@Pc(661) boolean local661 = anIntArray257[--anInt3702] == 1;
					if (local137.aBoolean373 != local661) {
						local137.aBoolean373 = local661;
						Static331.method4565(local137);
					}
					if (local137.anInt5005 == -1) {
						Static93.method1897(local137.anInt5041);
					}
					return;
				}
				if (arg0 == 1004) {
					anInt3702 -= 2;
					local137.anInt5025 = anIntArray257[anInt3702];
					local137.anInt4952 = anIntArray257[anInt3702 + 1];
					Static331.method4565(local137);
					Static468.method6477(local137);
					if (local137.anInt4966 == 0) {
						Static284.method4095(false, local137);
					}
					return;
				}
				if (arg0 == 1005) {
					local137.aBoolean387 = anIntArray257[--anInt3702] == 1;
					return;
				}
			}
		}
		throw new IllegalStateException(String.valueOf(arg0));
	}

	@OriginalMember(owner = "client!hw", name = "f", descriptor = "(I)V")
	public static void method3391(@OriginalArg(0) int arg0) {
		if (arg0 == -1 || !Static583.method7687(arg0)) {
			return;
		}
		@Pc(12) Class199[] local12 = Static392.aClass199ArrayArray2[arg0];
		for (@Pc(14) int local14 = 0; local14 < local12.length; local14++) {
			@Pc(19) Class199 local19 = local12[local14];
			if (local19.anObjectArray27 != null) {
				@Pc(26) Class4_Sub25 local26 = new Class4_Sub25();
				local26.aClass199_6 = local19;
				local26.anObjectArray2 = local19.anObjectArray27;
				method3377(local26, 2000000);
			}
		}
	}

	@OriginalMember(owner = "client!hw", name = "g", descriptor = "(I)J")
	private static long method3392(@OriginalArg(0) int arg0) {
		@Pc(9) Long local9 = aClass267_3.method5957(Static333.aClass234_5.anInt5621 << 16 | arg0);
		return local9 == null ? -1L : local9;
	}

	@OriginalMember(owner = "client!hw", name = "a", descriptor = "(Lclient!is;)V")
	public static void method3393(@OriginalArg(0) Class4_Sub25 arg0) {
		method3377(arg0, 200000);
	}
}
