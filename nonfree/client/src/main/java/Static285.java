import jagex3.jagmisc.jagmisc;
import java.util.Calendar;
import java.util.Date;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static285 {

	@OriginalMember(owner = "client!of", name = "g", descriptor = "Lclient!bo;")
	private static Class27 aClass27_1;

	@OriginalMember(owner = "client!of", name = "k", descriptor = "[I")
	private static int[] anIntArray350;

	@OriginalMember(owner = "client!of", name = "l", descriptor = "Lclient!mq;")
	private static Class156 aClass156_14;

	@OriginalMember(owner = "client!of", name = "q", descriptor = "[Ljava/lang/String;")
	private static String[] aStringArray38;

	@OriginalMember(owner = "client!of", name = "y", descriptor = "Lclient!mq;")
	private static Class156 aClass156_15;

	@OriginalMember(owner = "client!of", name = "b", descriptor = "I")
	private static int anInt5192 = 0;

	@OriginalMember(owner = "client!of", name = "c", descriptor = "[I")
	private static final int[] anIntArray349 = new int[1000];

	@OriginalMember(owner = "client!of", name = "e", descriptor = "[Lclient!qu;")
	private static final Class209[] aClass209Array1 = new Class209[50];

	@OriginalMember(owner = "client!of", name = "o", descriptor = "Ljava/util/Calendar;")
	private static final Calendar aCalendar2 = Calendar.getInstance();

	@OriginalMember(owner = "client!of", name = "r", descriptor = "I")
	private static int anInt5201 = 0;

	@OriginalMember(owner = "client!of", name = "s", descriptor = "[I")
	private static final int[] anIntArray351 = new int[5];

	@OriginalMember(owner = "client!of", name = "t", descriptor = "I")
	private static int anInt5202 = 0;

	@OriginalMember(owner = "client!of", name = "u", descriptor = "[[I")
	private static final int[][] anIntArrayArray33 = new int[5][5000];

	@OriginalMember(owner = "client!of", name = "v", descriptor = "[Ljava/lang/String;")
	private static final String[] aStringArray39 = new String[1000];

	@OriginalMember(owner = "client!of", name = "z", descriptor = "Lclient!jv;")
	public static final Class126 aClass126_41 = new Class126(4);

	@OriginalMember(owner = "client!of", name = "A", descriptor = "[Ljava/lang/String;")
	private static final String[] aStringArray40 = new String[] { "Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec" };

	@OriginalMember(owner = "client!of", name = "B", descriptor = "[I")
	private static final int[] anIntArray352 = new int[3];

	@OriginalMember(owner = "client!of", name = "C", descriptor = "I")
	private static int anInt5205 = 0;

	@OriginalMember(owner = "client!of", name = "a", descriptor = "(IZ)V")
	public static void method4048() {
	}

	@OriginalMember(owner = "client!of", name = "a", descriptor = "(Ljava/lang/String;I)V")
	private static void method4049(@OriginalArg(0) String arg0, @OriginalArg(1) int arg1) {
		if (Static190.anInt3803 == 0 && (Static388.aBoolean561 && !Static331.aBoolean651 || Static338.aBoolean492)) {
			return;
		}
		@Pc(11) String local11 = arg0.toLowerCase();
		@Pc(13) byte local13 = 0;
		if (local11.startsWith(Static259.aClass189_155.method4262(0))) {
			local13 = 0;
			arg0 = arg0.substring(Static259.aClass189_155.method4262(0).length());
		} else if (local11.startsWith(Static85.aClass189_66.method4262(0))) {
			local13 = 1;
			arg0 = arg0.substring(Static85.aClass189_66.method4262(0).length());
		} else if (local11.startsWith(Static328.aClass189_181.method4262(0))) {
			local13 = 2;
			arg0 = arg0.substring(Static328.aClass189_181.method4262(0).length());
		} else if (local11.startsWith(Static2.aClass189_2.method4262(0))) {
			local13 = 3;
			arg0 = arg0.substring(Static2.aClass189_2.method4262(0).length());
		} else if (local11.startsWith(Static363.aClass189_199.method4262(0))) {
			local13 = 4;
			arg0 = arg0.substring(Static363.aClass189_199.method4262(0).length());
		} else if (local11.startsWith(Static416.aClass189_224.method4262(0))) {
			local13 = 5;
			arg0 = arg0.substring(Static416.aClass189_224.method4262(0).length());
		} else if (local11.startsWith(Static250.aClass189_151.method4262(0))) {
			local13 = 6;
			arg0 = arg0.substring(Static250.aClass189_151.method4262(0).length());
		} else if (local11.startsWith(Static172.aClass189_108.method4262(0))) {
			local13 = 7;
			arg0 = arg0.substring(Static172.aClass189_108.method4262(0).length());
		} else if (local11.startsWith(Static424.aClass189_228.method4262(0))) {
			local13 = 8;
			arg0 = arg0.substring(Static424.aClass189_228.method4262(0).length());
		} else if (local11.startsWith(Static219.aClass189_132.method4262(0))) {
			local13 = 9;
			arg0 = arg0.substring(Static219.aClass189_132.method4262(0).length());
		} else if (local11.startsWith(Static344.aClass189_187.method4262(0))) {
			local13 = 10;
			arg0 = arg0.substring(Static344.aClass189_187.method4262(0).length());
		} else if (local11.startsWith(Static29.aClass189_197.method4262(0))) {
			local13 = 11;
			arg0 = arg0.substring(Static29.aClass189_197.method4262(0).length());
		} else if (Static53.anInt1454 != 0) {
			if (local11.startsWith(Static259.aClass189_155.method4262(Static53.anInt1454))) {
				local13 = 0;
				arg0 = arg0.substring(Static259.aClass189_155.method4262(Static53.anInt1454).length());
			} else if (local11.startsWith(Static85.aClass189_66.method4262(Static53.anInt1454))) {
				local13 = 1;
				arg0 = arg0.substring(Static85.aClass189_66.method4262(Static53.anInt1454).length());
			} else if (local11.startsWith(Static328.aClass189_181.method4262(Static53.anInt1454))) {
				local13 = 2;
				arg0 = arg0.substring(Static328.aClass189_181.method4262(Static53.anInt1454).length());
			} else if (local11.startsWith(Static2.aClass189_2.method4262(Static53.anInt1454))) {
				local13 = 3;
				arg0 = arg0.substring(Static2.aClass189_2.method4262(Static53.anInt1454).length());
			} else if (local11.startsWith(Static363.aClass189_199.method4262(Static53.anInt1454))) {
				local13 = 4;
				arg0 = arg0.substring(Static363.aClass189_199.method4262(Static53.anInt1454).length());
			} else if (local11.startsWith(Static416.aClass189_224.method4262(Static53.anInt1454))) {
				local13 = 5;
				arg0 = arg0.substring(Static416.aClass189_224.method4262(Static53.anInt1454).length());
			} else if (local11.startsWith(Static250.aClass189_151.method4262(Static53.anInt1454))) {
				local13 = 6;
				arg0 = arg0.substring(Static250.aClass189_151.method4262(Static53.anInt1454).length());
			} else if (local11.startsWith(Static172.aClass189_108.method4262(Static53.anInt1454))) {
				local13 = 7;
				arg0 = arg0.substring(Static172.aClass189_108.method4262(Static53.anInt1454).length());
			} else if (local11.startsWith(Static424.aClass189_228.method4262(Static53.anInt1454))) {
				local13 = 8;
				arg0 = arg0.substring(Static424.aClass189_228.method4262(Static53.anInt1454).length());
			} else if (local11.startsWith(Static219.aClass189_132.method4262(Static53.anInt1454))) {
				local13 = 9;
				arg0 = arg0.substring(Static219.aClass189_132.method4262(Static53.anInt1454).length());
			} else if (local11.startsWith(Static344.aClass189_187.method4262(Static53.anInt1454))) {
				local13 = 10;
				arg0 = arg0.substring(Static344.aClass189_187.method4262(Static53.anInt1454).length());
			} else if (local11.startsWith(Static29.aClass189_197.method4262(Static53.anInt1454))) {
				local13 = 11;
				arg0 = arg0.substring(Static29.aClass189_197.method4262(Static53.anInt1454).length());
			}
		}
		local11 = arg0.toLowerCase();
		@Pc(451) byte local451 = 0;
		if (local11.startsWith(Static411.aClass189_222.method4262(0))) {
			local451 = 1;
			arg0 = arg0.substring(Static411.aClass189_222.method4262(0).length());
		} else if (local11.startsWith(Static106.aClass189_77.method4262(0))) {
			local451 = 2;
			arg0 = arg0.substring(Static106.aClass189_77.method4262(0).length());
		} else if (local11.startsWith(Static364.aClass189_200.method4262(0))) {
			local451 = 3;
			arg0 = arg0.substring(Static364.aClass189_200.method4262(0).length());
		} else if (local11.startsWith(Static82.aClass189_125.method4262(0))) {
			local451 = 4;
			arg0 = arg0.substring(Static82.aClass189_125.method4262(0).length());
		} else if (local11.startsWith(Static77.aClass189_61.method4262(0))) {
			local451 = 5;
			arg0 = arg0.substring(Static77.aClass189_61.method4262(0).length());
		} else if (Static53.anInt1454 != 0) {
			if (local11.startsWith(Static411.aClass189_222.method4262(Static53.anInt1454))) {
				local451 = 1;
				arg0 = arg0.substring(Static411.aClass189_222.method4262(Static53.anInt1454).length());
			} else if (local11.startsWith(Static106.aClass189_77.method4262(Static53.anInt1454))) {
				local451 = 2;
				arg0 = arg0.substring(Static106.aClass189_77.method4262(Static53.anInt1454).length());
			} else if (local11.startsWith(Static364.aClass189_200.method4262(Static53.anInt1454))) {
				local451 = 3;
				arg0 = arg0.substring(Static364.aClass189_200.method4262(Static53.anInt1454).length());
			} else if (local11.startsWith(Static82.aClass189_125.method4262(Static53.anInt1454))) {
				local451 = 4;
				arg0 = arg0.substring(Static82.aClass189_125.method4262(Static53.anInt1454).length());
			} else if (local11.startsWith(Static77.aClass189_61.method4262(Static53.anInt1454))) {
				local451 = 5;
				arg0 = arg0.substring(Static77.aClass189_61.method4262(Static53.anInt1454).length());
			}
		}
		Static30.method641(Static276.aClass217_77);
		Static302.aClass3_Sub7_Sub1_2.method2628(0);
		@Pc(646) int local646 = Static302.aClass3_Sub7_Sub1_2.anInt3235;
		if (arg1 == 5021) {
			Static302.aClass3_Sub7_Sub1_2.method2628(1);
		} else if (arg1 == 5022) {
			Static302.aClass3_Sub7_Sub1_2.method2628(2);
		} else {
			Static302.aClass3_Sub7_Sub1_2.method2628(0);
		}
		Static302.aClass3_Sub7_Sub1_2.method2628(local13);
		Static302.aClass3_Sub7_Sub1_2.method2628(local451);
		Static296.method4143(arg0, Static302.aClass3_Sub7_Sub1_2);
		Static302.aClass3_Sub7_Sub1_2.method2629(Static302.aClass3_Sub7_Sub1_2.anInt3235 - local646);
	}

	@OriginalMember(owner = "client!of", name = "a", descriptor = "(I)V")
	private static void method4051(@OriginalArg(0) int arg0) {
		@Pc(3) Class156 local3 = Static435.method5705(arg0);
		if (local3 == null) {
			return;
		}
		@Pc(9) int local9 = arg0 >>> 16;
		@Pc(13) Class156[] local13 = Static111.aClass156ArrayArray1[local9];
		if (local13 == null) {
			@Pc(19) Class156[] local19 = Static178.aClass156ArrayArray2[local9];
			@Pc(22) int local22 = local19.length;
			local13 = Static111.aClass156ArrayArray1[local9] = new Class156[local22];
			Static462.method4614(local19, 0, local13, 0, local19.length);
		}
		@Pc(38) int local38;
		for (local38 = 0; local38 < local13.length && local13[local38] != local3; local38++) {
		}
		if (local38 >= local13.length) {
			return;
		}
		Static462.method4614(local13, 0, local13, 1, local38);
		local13[0] = local3;
	}

	@OriginalMember(owner = "client!of", name = "a", descriptor = "(Lclient!dj;I)V")
	private static void method4052(@OriginalArg(0) Class3_Sub4_Sub7 arg0, @OriginalArg(1) int arg1) {
		anInt5192 = 0;
		anInt5202 = 0;
		@Pc(5) int local5 = -1;
		@Pc(8) int[] local8 = arg0.anIntArray107;
		@Pc(11) int[] local11 = arg0.anIntArray108;
		@Pc(13) byte local13 = -1;
		anInt5201 = 0;
		@Pc(603) int local603;
		try {
			@Pc(17) int local17 = 0;
			label260: while (true) {
				local17++;
				if (local17 > arg1) {
					throw new RuntimeException("slow");
				}
				local5++;
				@Pc(31) int local31 = local8[local5];
				if (local31 >= 100) {
					@Pc(802) boolean local802;
					if (local11[local5] == 1) {
						local802 = true;
					} else {
						local802 = false;
					}
					if (local31 >= 100 && local31 < 5000) {
						method4053(local31, local802);
					} else if (local31 >= 5000 && local31 < 10000) {
						method4061(local31, local802);
					} else {
						throw new IllegalStateException("Command: " + local31);
					}
				} else if (local31 == 0) {
					anIntArray349[anInt5192++] = local11[local5];
				} else {
					@Pc(54) int local54;
					if (local31 == 1) {
						local54 = local11[local5];
						anIntArray349[anInt5192++] = Static85.aClass49_1.anIntArray99[local54];
					} else if (local31 == 2) {
						local54 = local11[local5];
						Static85.aClass49_1.method1321(local54, anIntArray349[--anInt5192]);
					} else if (local31 == 3) {
						aStringArray39[anInt5202++] = arg0.aStringArray11[local5];
					} else if (local31 == 6) {
						local5 += local11[local5];
					} else if (local31 == 7) {
						anInt5192 -= 2;
						if (anIntArray349[anInt5192] != anIntArray349[anInt5192 + 1]) {
							local5 += local11[local5];
						}
					} else if (local31 == 8) {
						anInt5192 -= 2;
						if (anIntArray349[anInt5192] == anIntArray349[anInt5192 + 1]) {
							local5 += local11[local5];
						}
					} else if (local31 == 9) {
						anInt5192 -= 2;
						if (anIntArray349[anInt5192] < anIntArray349[anInt5192 + 1]) {
							local5 += local11[local5];
						}
					} else if (local31 == 10) {
						anInt5192 -= 2;
						if (anIntArray349[anInt5192] > anIntArray349[anInt5192 + 1]) {
							local5 += local11[local5];
						}
					} else if (local31 == 21) {
						if (anInt5201 == 0) {
							return;
						}
						@Pc(216) Class209 local216 = aClass209Array1[--anInt5201];
						arg0 = local216.aClass3_Sub4_Sub7_1;
						local8 = arg0.anIntArray107;
						local11 = arg0.anIntArray108;
						local5 = local216.anInt5762;
						anIntArray350 = local216.anIntArray385;
						aStringArray38 = local216.aStringArray43;
					} else if (local31 == 25) {
						local54 = local11[local5];
						anIntArray349[anInt5192++] = Static85.aClass49_1.method1310(local54);
					} else if (local31 == 27) {
						local54 = local11[local5];
						Static85.aClass49_1.method1314(anIntArray349[--anInt5192], local54);
					} else if (local31 == 31) {
						anInt5192 -= 2;
						if (anIntArray349[anInt5192] <= anIntArray349[anInt5192 + 1]) {
							local5 += local11[local5];
						}
					} else if (local31 == 32) {
						anInt5192 -= 2;
						if (anIntArray349[anInt5192] >= anIntArray349[anInt5192 + 1]) {
							local5 += local11[local5];
						}
					} else if (local31 == 33) {
						anIntArray349[anInt5192++] = anIntArray350[local11[local5]];
					} else if (local31 == 34) {
						anIntArray350[local11[local5]] = anIntArray349[--anInt5192];
					} else if (local31 == 35) {
						aStringArray39[anInt5202++] = aStringArray38[local11[local5]];
					} else if (local31 == 36) {
						aStringArray38[local11[local5]] = aStringArray39[--anInt5202];
					} else if (local31 == 37) {
						local54 = local11[local5];
						anInt5202 -= local54;
						@Pc(400) String local400 = Static23.method509(local54, anInt5202, aStringArray39);
						aStringArray39[anInt5202++] = local400;
					} else if (local31 == 38) {
						anInt5192--;
					} else if (local31 == 39) {
						anInt5202--;
					} else {
						@Pc(452) int local452;
						if (local31 == 40) {
							local54 = local11[local5];
							@Pc(436) Class3_Sub4_Sub7 local436 = Static349.method4647(local54);
							if (local436 == null) {
								throw new RuntimeException();
							}
							@Pc(446) int[] local446 = new int[local436.anInt1791];
							@Pc(450) String[] local450 = new String[local436.anInt1793];
							for (local452 = 0; local452 < local436.anInt1794; local452++) {
								local446[local452] = anIntArray349[anInt5192 + local452 - local436.anInt1794];
							}
							for (@Pc(471) int local471 = 0; local471 < local436.anInt1790; local471++) {
								local450[local471] = aStringArray39[anInt5202 + local471 - local436.anInt1790];
							}
							anInt5192 -= local436.anInt1794;
							anInt5202 -= local436.anInt1790;
							@Pc(502) Class209 local502 = new Class209();
							local502.aClass3_Sub4_Sub7_1 = arg0;
							local502.anInt5762 = local5;
							local502.anIntArray385 = anIntArray350;
							local502.aStringArray43 = aStringArray38;
							if (anInt5201 >= aClass209Array1.length) {
								throw new RuntimeException();
							}
							aClass209Array1[anInt5201++] = local502;
							arg0 = local436;
							local8 = local436.anIntArray107;
							local11 = local436.anIntArray108;
							local5 = -1;
							anIntArray350 = local446;
							aStringArray38 = local450;
						} else if (local31 == 42) {
							anIntArray349[anInt5192++] = Static407.anIntArray453[local11[local5]];
						} else if (local31 == 43) {
							local54 = local11[local5];
							Static407.anIntArray453[local54] = anIntArray349[--anInt5192];
							Static436.method5726(local54);
							Static321.aBoolean480 |= Static20.aBooleanArray4[local54];
						} else if (local31 == 44) {
							local54 = local11[local5] >> 16;
							local603 = local11[local5] & 0xFFFF;
							@Pc(611) int local611 = anIntArray349[--anInt5192];
							if (local611 >= 0 && local611 <= 5000) {
								anIntArray351[local54] = local611;
								@Pc(626) byte local626 = -1;
								if (local603 == 105) {
									local626 = 0;
								}
								local452 = 0;
								while (true) {
									if (local452 >= local611) {
										continue label260;
									}
									anIntArrayArray33[local54][local452] = local626;
									local452++;
								}
							}
							throw new RuntimeException();
						} else if (local31 == 45) {
							local54 = local11[local5];
							local603 = anIntArray349[--anInt5192];
							if (local603 < 0 || local603 >= anIntArray351[local54]) {
								throw new RuntimeException();
							}
							anIntArray349[anInt5192++] = anIntArrayArray33[local54][local603];
						} else if (local31 == 46) {
							local54 = local11[local5];
							anInt5192 -= 2;
							local603 = anIntArray349[anInt5192];
							if (local603 < 0 || local603 >= anIntArray351[local54]) {
								throw new RuntimeException();
							}
							anIntArrayArray33[local54][local603] = anIntArray349[anInt5192 + 1];
						} else if (local31 == 47) {
							@Pc(730) String local730 = Static71.aStringArray12[local11[local5]];
							if (local730 == null) {
								local730 = "null";
							}
							aStringArray39[anInt5202++] = local730;
						} else if (local31 == 48) {
							local54 = local11[local5];
							Static71.aStringArray12[local54] = aStringArray39[--anInt5202];
							Static24.method584(local54);
						} else if (local31 == 51) {
							@Pc(774) Class11 local774 = arg0.aClass11Array1[local11[local5]];
							@Pc(787) Class3_Sub34 local787 = (Class3_Sub34) local774.method324((long) anIntArray349[--anInt5192]);
							if (local787 != null) {
								local5 += local787.anInt5289;
							}
						}
					}
				}
			}
		} catch (@Pc(837) Exception local837) {
			@Pc(855) StringBuffer local855;
			if (arg0.aString8 == null) {
				local855 = new StringBuffer(30);
				local855.append("CS2: ").append(arg0.aLong234).append(" ");
				for (local603 = anInt5201 - 1; local603 >= 0; local603--) {
					local855.append("v: ").append(aClass209Array1[local603].aClass3_Sub4_Sub7_1.aLong234).append(" ");
				}
				local855.append("op: ").append(local13);
				Static324.method5974(local837, local855.toString());
			} else {
				Static155.method2520("Clientscript error in: " + arg0.aString8);
				local855 = new StringBuffer(30);
				local855.append("Clientscript error in: ").append(arg0.aString8).append("\n");
				for (local603 = anInt5201 - 1; local603 >= 0; local603--) {
					local855.append("via: ").append(aClass209Array1[local603].aClass3_Sub4_Sub7_1.aString8).append("\n");
				}
				local855.append("Op: ").append(local13).append("\n");
				@Pc(895) String local895 = local837.getMessage();
				if (local895 != null && local895.length() > 0) {
					local855.append("Message: ").append(local895).append("\n");
				}
				Static324.method5974(local837, local855.toString());
				Static231.method3481(local855.toString());
			}
		}
	}

	@OriginalMember(owner = "client!of", name = "b", descriptor = "(IZ)V")
	private static void method4053(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1) {
		@Pc(137) Class156 local137;
		@Pc(25) int local25;
		@Pc(56) int local56;
		@Pc(19) int local19;
		@Pc(35) Class156 local35;
		@Pc(13) int local13;
		@Pc(210) Class156 local210;
		@Pc(158) Class156 local158;
		if (arg0 < 300) {
			if (arg0 == 100) {
				anInt5192 -= 3;
				local13 = anIntArray349[anInt5192];
				local19 = anIntArray349[anInt5192 + 1];
				local25 = anIntArray349[anInt5192 + 2];
				if (local19 == 0) {
					throw new RuntimeException();
				}
				local35 = Static435.method5705(local13);
				if (local35.aClass156Array2 == null) {
					local35.aClass156Array2 = new Class156[local25 + 1];
				}
				if (local35.aClass156Array2.length <= local25) {
					@Pc(54) Class156[] local54 = new Class156[local25 + 1];
					for (local56 = 0; local56 < local35.aClass156Array2.length; local56++) {
						local54[local56] = local35.aClass156Array2[local56];
					}
					local35.aClass156Array2 = local54;
				}
				if (local25 > 0 && local35.aClass156Array2[local25 - 1] == null) {
					throw new RuntimeException("Gap at:" + (local25 - 1));
				}
				@Pc(99) Class156 local99 = new Class156();
				local99.anInt4792 = local19;
				local99.anInt4839 = local99.anInt4850 = local35.anInt4850;
				local99.anInt4868 = local25;
				local35.aClass156Array2[local25] = local99;
				if (arg1) {
					aClass156_15 = local99;
				} else {
					aClass156_14 = local99;
				}
				Static386.method5010(local35);
				return;
			}
			if (arg0 == 101) {
				local137 = arg1 ? aClass156_15 : aClass156_14;
				if (local137.anInt4868 == -1) {
					if (arg1) {
						throw new RuntimeException("Tried to .cc_delete static .active-component!");
					}
					throw new RuntimeException("Tried to cc_delete static active-component!");
				}
				local158 = Static435.method5705(local137.anInt4850);
				local158.aClass156Array2[local137.anInt4868] = null;
				Static386.method5010(local158);
				return;
			}
			if (arg0 == 102) {
				local137 = Static435.method5705(anIntArray349[--anInt5192]);
				local137.aClass156Array2 = null;
				Static386.method5010(local137);
				return;
			}
			if (arg0 == 200) {
				anInt5192 -= 2;
				local13 = anIntArray349[anInt5192];
				local19 = anIntArray349[anInt5192 + 1];
				local210 = Static109.method1853(local13, local19);
				if (local210 != null && local19 != -1) {
					anIntArray349[anInt5192++] = 1;
					if (arg1) {
						aClass156_15 = local210;
						return;
					}
					aClass156_14 = local210;
					return;
				}
				anIntArray349[anInt5192++] = 0;
				return;
			}
			if (arg0 == 201) {
				local13 = anIntArray349[--anInt5192];
				local158 = Static435.method5705(local13);
				if (local158 != null) {
					anIntArray349[anInt5192++] = 1;
					if (arg1) {
						aClass156_15 = local158;
						return;
					}
					aClass156_14 = local158;
					return;
				}
				anIntArray349[anInt5192++] = 0;
				return;
			}
			if (arg0 == 202) {
				local13 = anIntArray349[--anInt5192];
				method4058(local13);
				return;
			}
			if (arg0 == 203) {
				local13 = anIntArray349[--anInt5192];
				method4051(local13);
				return;
			}
		} else {
			@Pc(353) int local353;
			@Pc(412) boolean local412;
			if (arg0 < 500) {
				if (arg0 == 403) {
					anInt5192 -= 2;
					local13 = anIntArray349[anInt5192];
					local19 = anIntArray349[anInt5192 + 1];
					for (local25 = 0; local25 < Static65.anIntArray98.length; local25++) {
						if (Static65.anIntArray98[local25] == local13) {
							Static379.aClass7_Sub2_Sub3_Sub2_2.aClass206_1.method4462(local19, Static24.aClass69_1, local25);
							return;
						}
					}
					for (local353 = 0; local353 < Static218.anIntArray275.length; local353++) {
						if (Static218.anIntArray275[local353] == local13) {
							Static379.aClass7_Sub2_Sub3_Sub2_2.aClass206_1.method4462(local19, Static24.aClass69_1, local353);
							return;
						}
					}
					return;
				}
				if (arg0 == 404) {
					anInt5192 -= 2;
					local13 = anIntArray349[anInt5192];
					local19 = anIntArray349[anInt5192 + 1];
					Static379.aClass7_Sub2_Sub3_Sub2_2.aClass206_1.method4461(local19, local13);
					return;
				}
				if (arg0 == 410) {
					local412 = anIntArray349[--anInt5192] != 0;
					Static379.aClass7_Sub2_Sub3_Sub2_2.aClass206_1.method4460(local412);
					return;
				}
			} else if ((arg0 < 1000 || arg0 >= 1100) && (arg0 < 2000 || arg0 >= 2100)) {
				@Pc(1488) String local1488;
				@Pc(1101) String local1101;
				if (arg0 >= 1100 && arg0 < 1200 || arg0 >= 2100 && arg0 < 2200) {
					if (arg0 >= 2000) {
						arg0 -= 1000;
						local137 = Static435.method5705(anIntArray349[--anInt5192]);
					} else {
						local137 = arg1 ? aClass156_15 : aClass156_14;
					}
					if (arg0 == 1100) {
						anInt5192 -= 2;
						local137.anInt4821 = anIntArray349[anInt5192];
						if (local137.anInt4821 > local137.anInt4877 - local137.anInt4853) {
							local137.anInt4821 = local137.anInt4877 - local137.anInt4853;
						}
						if (local137.anInt4821 < 0) {
							local137.anInt4821 = 0;
						}
						local137.anInt4801 = anIntArray349[anInt5192 + 1];
						if (local137.anInt4801 > local137.anInt4796 - local137.anInt4823) {
							local137.anInt4801 = local137.anInt4796 - local137.anInt4823;
						}
						if (local137.anInt4801 < 0) {
							local137.anInt4801 = 0;
						}
						Static386.method5010(local137);
						if (local137.anInt4868 == -1) {
							Static454.method5989(local137.anInt4850);
						}
						return;
					}
					if (arg0 == 1101) {
						local137.anInt4847 = anIntArray349[--anInt5192];
						Static386.method5010(local137);
						if (local137.anInt4868 == -1) {
							Static295.method4138(local137.anInt4850);
						}
						return;
					}
					if (arg0 == 1102) {
						local137.aBoolean424 = anIntArray349[--anInt5192] == 1;
						Static386.method5010(local137);
						return;
					}
					if (arg0 == 1103) {
						local137.anInt4872 = anIntArray349[--anInt5192];
						Static386.method5010(local137);
						return;
					}
					if (arg0 == 1104) {
						local137.anInt4852 = anIntArray349[--anInt5192];
						Static386.method5010(local137);
						return;
					}
					if (arg0 == 1105) {
						local19 = anIntArray349[--anInt5192];
						if (local137.anInt4822 != local19) {
							local137.anInt4822 = local19;
							Static386.method5010(local137);
						}
						if (local137.anInt4868 == -1) {
							Static377.method4935(local137.anInt4850);
						}
						return;
					}
					if (arg0 == 1106) {
						local137.anInt4865 = anIntArray349[--anInt5192];
						Static386.method5010(local137);
						return;
					}
					if (arg0 == 1107) {
						local137.aBoolean420 = anIntArray349[--anInt5192] == 1;
						Static386.method5010(local137);
						return;
					}
					if (arg0 == 1108) {
						local137.anInt4832 = 1;
						local137.anInt4816 = anIntArray349[--anInt5192];
						Static386.method5010(local137);
						if (local137.anInt4868 == -1) {
							Static69.method1366(local137.anInt4850);
						}
						return;
					}
					if (arg0 == 1109) {
						anInt5192 -= 6;
						local137.anInt4844 = anIntArray349[anInt5192];
						local137.anInt4834 = anIntArray349[anInt5192 + 1];
						local137.anInt4817 = anIntArray349[anInt5192 + 2];
						local137.anInt4873 = anIntArray349[anInt5192 + 3];
						local137.anInt4849 = anIntArray349[anInt5192 + 4];
						local137.anInt4811 = anIntArray349[anInt5192 + 5];
						Static386.method5010(local137);
						if (local137.anInt4868 == -1) {
							Static441.method5812(local137.anInt4850);
							Static318.method5480(local137.anInt4850);
						}
						return;
					}
					if (arg0 == 1110) {
						local19 = anIntArray349[--anInt5192];
						if (local137.lb != local19) {
							local137.lb = local19;
							local137.anInt4860 = 0;
							local137.anInt4851 = 1;
							local137.anInt4795 = 0;
							Static386.method5010(local137);
						}
						if (local137.anInt4868 == -1) {
							Static158.method2542(local137.anInt4850);
						}
						return;
					}
					if (arg0 == 1111) {
						local137.aBoolean421 = anIntArray349[--anInt5192] == 1;
						Static386.method5010(local137);
						return;
					}
					if (arg0 == 1112) {
						local1101 = aStringArray39[--anInt5202];
						if (!local1101.equals(local137.aString43)) {
							local137.aString43 = local1101;
							Static386.method5010(local137);
						}
						if (local137.anInt4868 == -1) {
							Static91.method1683(local137.anInt4850);
						}
						return;
					}
					if (arg0 == 1113) {
						local137.anInt4798 = anIntArray349[--anInt5192];
						Static386.method5010(local137);
						if (local137.anInt4868 == -1) {
							Static184.method2935(local137.anInt4850);
						}
						return;
					}
					if (arg0 == 1114) {
						anInt5192 -= 3;
						local137.anInt4841 = anIntArray349[anInt5192];
						local137.anInt4803 = anIntArray349[anInt5192 + 1];
						local137.anInt4819 = anIntArray349[anInt5192 + 2];
						Static386.method5010(local137);
						return;
					}
					if (arg0 == 1115) {
						local137.aBoolean428 = anIntArray349[--anInt5192] == 1;
						Static386.method5010(local137);
						return;
					}
					if (arg0 == 1116) {
						local137.anInt4791 = anIntArray349[--anInt5192];
						Static386.method5010(local137);
						return;
					}
					if (arg0 == 1117) {
						local137.anInt4876 = anIntArray349[--anInt5192];
						Static386.method5010(local137);
						return;
					}
					if (arg0 == 1118) {
						local137.aBoolean416 = anIntArray349[--anInt5192] == 1;
						Static386.method5010(local137);
						return;
					}
					if (arg0 == 1119) {
						local137.aBoolean417 = anIntArray349[--anInt5192] == 1;
						Static386.method5010(local137);
						return;
					}
					if (arg0 == 1120) {
						anInt5192 -= 2;
						local137.anInt4877 = anIntArray349[anInt5192];
						local137.anInt4796 = anIntArray349[anInt5192 + 1];
						Static386.method5010(local137);
						if (local137.anInt4792 == 0) {
							Static317.method4367(false, local137);
						}
						return;
					}
					if (arg0 == 1121) {
						anInt5192 -= 2;
						local137.anInt4835 = (short) anIntArray349[anInt5192];
						local137.anInt4858 = (short) anIntArray349[anInt5192 + 1];
						Static386.method5010(local137);
						return;
					}
					if (arg0 == 1122) {
						local137.aBoolean413 = anIntArray349[--anInt5192] == 1;
						Static386.method5010(local137);
						return;
					}
					if (arg0 == 1123) {
						local137.anInt4811 = anIntArray349[--anInt5192];
						Static386.method5010(local137);
						if (local137.anInt4868 == -1) {
							Static441.method5812(local137.anInt4850);
						}
						return;
					}
					if (arg0 == 1124) {
						local19 = anIntArray349[--anInt5192];
						local137.aBoolean425 = local19 == 1;
						Static386.method5010(local137);
						return;
					}
					if (arg0 == 1125) {
						anInt5192 -= 2;
						local137.anInt4867 = anIntArray349[anInt5192];
						local137.anInt4862 = anIntArray349[anInt5192 + 1];
						Static386.method5010(local137);
						return;
					}
					if (arg0 == 1126) {
						local137.anInt4809 = anIntArray349[--anInt5192];
						Static386.method5010(local137);
						return;
					}
					@Pc(1454) Class224 local1454;
					if (arg0 == 1127) {
						anInt5192 -= 2;
						local19 = anIntArray349[anInt5192];
						local25 = anIntArray349[anInt5192 + 1];
						local1454 = Static318.aClass26_5.method691(local19);
						if (local25 != local1454.anInt6133) {
							local137.method3764(local19, local25);
							return;
						}
						local137.method3758(local19);
						return;
					}
					if (arg0 == 1128) {
						local19 = anIntArray349[--anInt5192];
						local1488 = aStringArray39[--anInt5202];
						local1454 = Static318.aClass26_5.method691(local19);
						if (!local1454.aString56.equals(local1488)) {
							local137.method3768(local1488, local19);
							return;
						}
						local137.method3758(local19);
						return;
					}
				} else if ((arg0 < 1200 || arg0 >= 1300) && (arg0 < 2200 || arg0 >= 2300)) {
					@Pc(2290) int local2290;
					if (arg0 >= 1300 && arg0 < 1400 || arg0 >= 2300 && arg0 < 2400) {
						if (arg0 >= 2000) {
							arg0 -= 1000;
							local137 = Static435.method5705(anIntArray349[--anInt5192]);
						} else {
							local137 = arg1 ? aClass156_15 : aClass156_14;
						}
						if (arg0 == 1300) {
							local19 = anIntArray349[--anInt5192] - 1;
							if (local19 >= 0 && local19 <= 9) {
								local137.method3763(aStringArray39[--anInt5202], local19);
								return;
							}
							anInt5202--;
							return;
						}
						if (arg0 == 1301) {
							anInt5192 -= 2;
							local19 = anIntArray349[anInt5192];
							local25 = anIntArray349[anInt5192 + 1];
							if (local19 == -1 && local25 == -1) {
								local137.aClass156_10 = null;
								return;
							}
							local137.aClass156_10 = Static109.method1853(local19, local25);
							return;
						}
						if (arg0 == 1302) {
							local19 = anIntArray349[--anInt5192];
							if (local19 != Static374.anInt6291 && local19 != Static97.anInt2199 && local19 != Static290.anInt5241) {
								return;
							}
							local137.anInt4828 = local19;
							return;
						}
						if (arg0 == 1303) {
							local137.anInt4855 = anIntArray349[--anInt5192];
							return;
						}
						if (arg0 == 1304) {
							local137.anInt4812 = anIntArray349[--anInt5192];
							return;
						}
						if (arg0 == 1305) {
							local137.aString42 = aStringArray39[--anInt5202];
							return;
						}
						if (arg0 == 1306) {
							local137.aString40 = aStringArray39[--anInt5202];
							return;
						}
						if (arg0 == 1307) {
							local137.aStringArray34 = null;
							return;
						}
						if (arg0 == 1308) {
							local137.anInt4845 = anIntArray349[--anInt5192];
							local137.anInt4871 = anIntArray349[--anInt5192];
							return;
						}
						if (arg0 == 1309) {
							local19 = anIntArray349[--anInt5192];
							local25 = anIntArray349[--anInt5192];
							if (local25 >= 1 && local25 <= 10) {
								local137.method3770(local19, local25 - 1);
							}
							return;
						}
						if (arg0 == 1310) {
							local137.aString39 = aStringArray39[--anInt5202];
							return;
						}
						if (arg0 == 1311) {
							local137.anInt4880 = anIntArray349[--anInt5192];
							return;
						}
						if (arg0 == 1312 || arg0 == 1313) {
							if (arg0 == 1312) {
								anInt5192 -= 3;
								local19 = anIntArray349[anInt5192] - 1;
								local25 = anIntArray349[anInt5192 + 1];
								local353 = anIntArray349[anInt5192 + 2];
								if (local19 < 0 || local19 > 9) {
									throw new RuntimeException("IOR13121313");
								}
							} else {
								anInt5192 -= 2;
								local19 = 10;
								local25 = anIntArray349[anInt5192];
								local353 = anIntArray349[anInt5192 + 1];
							}
							if (local137.aByteArray58 == null) {
								if (local25 == 0) {
									return;
								}
								local137.aByteArray58 = new byte[11];
								local137.aByteArray57 = new byte[11];
								local137.anIntArray318 = new int[11];
							}
							local137.aByteArray58[local19] = (byte) local25;
							if (local25 == 0) {
								local137.aBoolean422 = false;
								for (local2290 = 0; local2290 < local137.aByteArray58.length; local2290++) {
									if (local137.aByteArray58[local2290] != 0) {
										local137.aBoolean422 = true;
										break;
									}
								}
							} else {
								local137.aBoolean422 = true;
							}
							local137.aByteArray57[local19] = (byte) local353;
							return;
						}
						if (arg0 == 1314) {
							local137.anInt4854 = anIntArray349[--anInt5192];
							return;
						}
					} else if (arg0 >= 1400 && arg0 < 1500 || arg0 >= 2400 && arg0 < 2500) {
						if (arg0 >= 2000) {
							arg0 -= 1000;
							local137 = Static435.method5705(anIntArray349[--anInt5192]);
						} else {
							local137 = arg1 ? aClass156_15 : aClass156_14;
						}
						local1101 = aStringArray39[--anInt5202];
						@Pc(2369) int[] local2369 = null;
						if (local1101.length() > 0 && local1101.charAt(local1101.length() - 1) == 'Y') {
							local353 = anIntArray349[--anInt5192];
							if (local353 > 0) {
								local2369 = new int[local353];
								while (local353-- > 0) {
									local2369[local353] = anIntArray349[--anInt5192];
								}
							}
							local1101 = local1101.substring(0, local1101.length() - 1);
						}
						@Pc(2421) Object[] local2421 = new Object[local1101.length() + 1];
						for (local2290 = local2421.length - 1; local2290 >= 1; local2290--) {
							if (local1101.charAt(local2290 - 1) == 's') {
								local2421[local2290] = aStringArray39[--anInt5202];
							} else {
								local2421[local2290] = Integer.valueOf(anIntArray349[--anInt5192]);
							}
						}
						local56 = anIntArray349[--anInt5192];
						if (local56 == -1) {
							local2421 = null;
						} else {
							local2421[0] = Integer.valueOf(local56);
						}
						if (arg0 == 1400) {
							local137.anObjectArray34 = local2421;
						} else if (arg0 == 1401) {
							local137.anObjectArray14 = local2421;
						} else if (arg0 == 1402) {
							local137.anObjectArray22 = local2421;
						} else if (arg0 == 1403) {
							local137.anObjectArray16 = local2421;
						} else if (arg0 == 1404) {
							local137.anObjectArray19 = local2421;
						} else if (arg0 == 1405) {
							local137.anObjectArray35 = local2421;
						} else if (arg0 == 1406) {
							local137.anObjectArray12 = local2421;
						} else if (arg0 == 1407) {
							local137.anObjectArray5 = local2421;
							local137.anIntArray312 = local2369;
						} else if (arg0 == 1408) {
							local137.anObjectArray30 = local2421;
						} else if (arg0 == 1409) {
							local137.anObjectArray31 = local2421;
						} else if (arg0 == 1410) {
							local137.anObjectArray6 = local2421;
						} else if (arg0 == 1411) {
							local137.anObjectArray24 = local2421;
						} else if (arg0 == 1412) {
							local137.anObjectArray28 = local2421;
						} else if (arg0 == 1414) {
							local137.anObjectArray21 = local2421;
							local137.anIntArray310 = local2369;
						} else if (arg0 == 1415) {
							local137.anObjectArray27 = local2421;
							local137.anIntArray311 = local2369;
						} else if (arg0 == 1416) {
							local137.anObjectArray9 = local2421;
						} else if (arg0 == 1417) {
							local137.anObjectArray18 = local2421;
						} else if (arg0 == 1418) {
							local137.anObjectArray8 = local2421;
						} else if (arg0 == 1419) {
							local137.anObjectArray29 = local2421;
						} else if (arg0 == 1420) {
							local137.anObjectArray17 = local2421;
						} else if (arg0 == 1421) {
							local137.anObjectArray20 = local2421;
						} else if (arg0 == 1422) {
							local137.anObjectArray33 = local2421;
						} else if (arg0 == 1423) {
							local137.anObjectArray32 = local2421;
						} else if (arg0 == 1424) {
							local137.anObjectArray25 = local2421;
						} else if (arg0 == 1425) {
							local137.anObjectArray26 = local2421;
						} else if (arg0 == 1426) {
							local137.anObjectArray15 = local2421;
						} else if (arg0 == 1427) {
							local137.anObjectArray10 = local2421;
						} else if (arg0 == 1428) {
							local137.anObjectArray23 = local2421;
							local137.anIntArray317 = local2369;
						} else if (arg0 == 1429) {
							local137.anObjectArray7 = local2421;
							local137.anIntArray309 = local2369;
						} else if (arg0 == 1430) {
							local137.anObjectArray13 = local2421;
						}
						local137.aBoolean423 = true;
						return;
					} else if (arg0 < 1600) {
						local137 = arg1 ? aClass156_15 : aClass156_14;
						if (arg0 == 1500) {
							anIntArray349[anInt5192++] = local137.anInt4800;
							return;
						}
						if (arg0 == 1501) {
							anIntArray349[anInt5192++] = local137.anInt4806;
							return;
						}
						if (arg0 == 1502) {
							anIntArray349[anInt5192++] = local137.anInt4853;
							return;
						}
						if (arg0 == 1503) {
							anIntArray349[anInt5192++] = local137.anInt4823;
							return;
						}
						if (arg0 == 1504) {
							anIntArray349[anInt5192++] = local137.aBoolean427 ? 1 : 0;
							return;
						}
						if (arg0 == 1505) {
							anIntArray349[anInt5192++] = local137.anInt4839;
							return;
						}
						if (arg0 == 1506) {
							local158 = Static386.method5013(local137);
							anIntArray349[anInt5192++] = local158 == null ? -1 : local158.anInt4850;
							return;
						}
					} else {
						@Pc(3017) Class224 local3017;
						if (arg0 < 1700) {
							local137 = arg1 ? aClass156_15 : aClass156_14;
							if (arg0 == 1600) {
								anIntArray349[anInt5192++] = local137.anInt4821;
								return;
							}
							if (arg0 == 1601) {
								anIntArray349[anInt5192++] = local137.anInt4801;
								return;
							}
							if (arg0 == 1602) {
								aStringArray39[anInt5202++] = local137.aString43;
								return;
							}
							if (arg0 == 1603) {
								anIntArray349[anInt5192++] = local137.anInt4877;
								return;
							}
							if (arg0 == 1604) {
								anIntArray349[anInt5192++] = local137.anInt4796;
								return;
							}
							if (arg0 == 1605) {
								anIntArray349[anInt5192++] = local137.anInt4811;
								return;
							}
							if (arg0 == 1606) {
								anIntArray349[anInt5192++] = local137.anInt4817;
								return;
							}
							if (arg0 == 1607) {
								anIntArray349[anInt5192++] = local137.anInt4849;
								return;
							}
							if (arg0 == 1608) {
								anIntArray349[anInt5192++] = local137.anInt4873;
								return;
							}
							if (arg0 == 1609) {
								anIntArray349[anInt5192++] = local137.anInt4872;
								return;
							}
							if (arg0 == 1610) {
								anIntArray349[anInt5192++] = local137.anInt4844;
								return;
							}
							if (arg0 == 1611) {
								anIntArray349[anInt5192++] = local137.anInt4834;
								return;
							}
							if (arg0 == 1612) {
								anIntArray349[anInt5192++] = local137.anInt4822;
								return;
							}
							if (arg0 == 1613) {
								local19 = anIntArray349[--anInt5192];
								local3017 = Static318.aClass26_5.method691(local19);
								if (local3017.method4789()) {
									aStringArray39[anInt5202++] = local137.method3761(local3017.aString56, local19);
								} else {
									anIntArray349[anInt5192++] = local137.method3769(local19, local3017.anInt6133);
								}
							}
						} else if (arg0 < 1800) {
							local137 = arg1 ? aClass156_15 : aClass156_14;
							if (arg0 == 1700) {
								anIntArray349[anInt5192++] = local137.anInt4826;
								return;
							}
							if (arg0 == 1701) {
								if (local137.anInt4826 != -1) {
									anIntArray349[anInt5192++] = local137.anInt4838;
									return;
								}
								anIntArray349[anInt5192++] = 0;
								return;
							}
							if (arg0 == 1702) {
								anIntArray349[anInt5192++] = local137.anInt4868;
								return;
							}
						} else if (arg0 < 1900) {
							local137 = arg1 ? aClass156_15 : aClass156_14;
							if (arg0 == 1800) {
								anIntArray349[anInt5192++] = Static53.method1118(local137).method5980();
								return;
							}
							if (arg0 == 1801) {
								local19 = anIntArray349[--anInt5192];
								local19--;
								if (local137.aStringArray34 != null && local19 < local137.aStringArray34.length && local137.aStringArray34[local19] != null) {
									aStringArray39[anInt5202++] = local137.aStringArray34[local19];
									return;
								}
								aStringArray39[anInt5202++] = "";
								return;
							}
							if (arg0 == 1802) {
								if (local137.aString42 == null) {
									aStringArray39[anInt5202++] = "";
									return;
								}
								aStringArray39[anInt5202++] = local137.aString42;
								return;
							}
						} else if (arg0 < 2000 || arg0 >= 2900 && arg0 < 3000) {
							if (arg0 >= 2000) {
								local137 = Static435.method5705(anIntArray349[--anInt5192]);
								arg0 -= 1000;
							} else {
								local137 = arg1 ? aClass156_15 : aClass156_14;
							}
							if (anInt5205 >= 10) {
								throw new RuntimeException("C29xx-1");
							}
							if (arg0 == 1927) {
								if (local137.anObjectArray10 == null) {
									return;
								}
								@Pc(3254) Class3_Sub31 local3254 = new Class3_Sub31();
								local3254.aClass156_11 = local137;
								local3254.anObjectArray36 = local137.anObjectArray10;
								local3254.anInt5002 = anInt5205 + 1;
								Static221.aClass243_26.method5198(local3254);
								return;
							}
						} else if (arg0 < 2600) {
							local137 = Static435.method5705(anIntArray349[--anInt5192]);
							if (arg0 == 2500) {
								anIntArray349[anInt5192++] = local137.anInt4800;
								return;
							}
							if (arg0 == 2501) {
								anIntArray349[anInt5192++] = local137.anInt4806;
								return;
							}
							if (arg0 == 2502) {
								anIntArray349[anInt5192++] = local137.anInt4853;
								return;
							}
							if (arg0 == 2503) {
								anIntArray349[anInt5192++] = local137.anInt4823;
								return;
							}
							if (arg0 == 2504) {
								anIntArray349[anInt5192++] = local137.aBoolean427 ? 1 : 0;
								return;
							}
							if (arg0 == 2505) {
								anIntArray349[anInt5192++] = local137.anInt4839;
								return;
							}
							if (arg0 == 1506) {
								local158 = Static386.method5013(local137);
								anIntArray349[anInt5192++] = local158 == null ? -1 : local158.anInt4850;
								return;
							}
						} else if (arg0 < 2700) {
							local137 = Static435.method5705(anIntArray349[--anInt5192]);
							if (arg0 == 2600) {
								anIntArray349[anInt5192++] = local137.anInt4821;
								return;
							}
							if (arg0 == 2601) {
								anIntArray349[anInt5192++] = local137.anInt4801;
								return;
							}
							if (arg0 == 2602) {
								aStringArray39[anInt5202++] = local137.aString43;
								return;
							}
							if (arg0 == 2603) {
								anIntArray349[anInt5192++] = local137.anInt4877;
								return;
							}
							if (arg0 == 2604) {
								anIntArray349[anInt5192++] = local137.anInt4796;
								return;
							}
							if (arg0 == 2605) {
								anIntArray349[anInt5192++] = local137.anInt4811;
								return;
							}
							if (arg0 == 2606) {
								anIntArray349[anInt5192++] = local137.anInt4817;
								return;
							}
							if (arg0 == 2607) {
								anIntArray349[anInt5192++] = local137.anInt4849;
								return;
							}
							if (arg0 == 2608) {
								anIntArray349[anInt5192++] = local137.anInt4873;
								return;
							}
							if (arg0 == 2609) {
								anIntArray349[anInt5192++] = local137.anInt4872;
								return;
							}
							if (arg0 == 2610) {
								anIntArray349[anInt5192++] = local137.anInt4844;
								return;
							}
							if (arg0 == 2611) {
								anIntArray349[anInt5192++] = local137.anInt4834;
								return;
							}
							if (arg0 == 2612) {
								anIntArray349[anInt5192++] = local137.anInt4822;
								return;
							}
						} else {
							@Pc(3751) Class3_Sub9 local3751;
							@Pc(3649) Class3_Sub9 local3649;
							if (arg0 < 2800) {
								if (arg0 == 2700) {
									local137 = Static435.method5705(anIntArray349[--anInt5192]);
									anIntArray349[anInt5192++] = local137.anInt4826;
									return;
								}
								if (arg0 == 2701) {
									local137 = Static435.method5705(anIntArray349[--anInt5192]);
									if (local137.anInt4826 != -1) {
										anIntArray349[anInt5192++] = local137.anInt4838;
										return;
									}
									anIntArray349[anInt5192++] = 0;
									return;
								}
								if (arg0 == 2702) {
									local13 = anIntArray349[--anInt5192];
									local3649 = (Class3_Sub9) Static318.aClass11_42.method324((long) local13);
									if (local3649 != null) {
										anIntArray349[anInt5192++] = 1;
										return;
									}
									anIntArray349[anInt5192++] = 0;
									return;
								}
								if (arg0 == 2703) {
									local137 = Static435.method5705(anIntArray349[--anInt5192]);
									if (local137.aClass156Array2 == null) {
										anIntArray349[anInt5192++] = 0;
										return;
									}
									local19 = local137.aClass156Array2.length;
									for (local25 = 0; local25 < local137.aClass156Array2.length; local25++) {
										if (local137.aClass156Array2[local25] == null) {
											local19 = local25;
											break;
										}
									}
									anIntArray349[anInt5192++] = local19;
									return;
								}
								if (arg0 == 2704 || arg0 == 2705) {
									anInt5192 -= 2;
									local13 = anIntArray349[anInt5192];
									local19 = anIntArray349[anInt5192 + 1];
									local3751 = (Class3_Sub9) Static318.aClass11_42.method324((long) local13);
									if (local3751 != null && local3751.anInt1804 == local19) {
										anIntArray349[anInt5192++] = 1;
										return;
									}
									anIntArray349[anInt5192++] = 0;
									return;
								}
							} else if (arg0 < 2900) {
								local137 = Static435.method5705(anIntArray349[--anInt5192]);
								if (arg0 == 2800) {
									anIntArray349[anInt5192++] = Static53.method1118(local137).method5980();
									return;
								}
								if (arg0 == 2801) {
									local19 = anIntArray349[--anInt5192];
									local19--;
									if (local137.aStringArray34 != null && local19 < local137.aStringArray34.length && local137.aStringArray34[local19] != null) {
										aStringArray39[anInt5202++] = local137.aStringArray34[local19];
										return;
									}
									aStringArray39[anInt5202++] = "";
									return;
								}
								if (arg0 == 2802) {
									if (local137.aString42 == null) {
										aStringArray39[anInt5202++] = "";
										return;
									}
									aStringArray39[anInt5202++] = local137.aString42;
									return;
								}
							} else {
								@Pc(3888) String local3888;
								if (arg0 < 3200) {
									if (arg0 == 3100) {
										local3888 = aStringArray39[--anInt5202];
										Static155.method2520(local3888);
										return;
									}
									if (arg0 == 3101) {
										anInt5192 -= 2;
										Static323.method842(anIntArray349[anInt5192 + 1], Static379.aClass7_Sub2_Sub3_Sub2_2, anIntArray349[anInt5192]);
										return;
									}
									if (arg0 == 3103) {
										Static426.method5446();
										return;
									}
									if (arg0 == 3104) {
										local3888 = aStringArray39[--anInt5202];
										local19 = 0;
										if (Static406.method5236(local3888)) {
											local19 = Static247.method3714(local3888);
										}
										Static30.method641(Static82.aClass217_64);
										Static302.aClass3_Sub7_Sub1_2.method2636(local19);
										return;
									}
									if (arg0 == 3105) {
										local3888 = aStringArray39[--anInt5202];
										Static30.method641(Static253.aClass217_72);
										Static302.aClass3_Sub7_Sub1_2.method2628(local3888.length() + 1);
										Static302.aClass3_Sub7_Sub1_2.method2608(local3888);
										return;
									}
									if (arg0 == 3106) {
										local3888 = aStringArray39[--anInt5202];
										Static30.method641(Static205.aClass217_65);
										Static302.aClass3_Sub7_Sub1_2.method2628(local3888.length() + 1);
										Static302.aClass3_Sub7_Sub1_2.method2608(local3888);
										return;
									}
									if (arg0 == 3107) {
										local13 = anIntArray349[--anInt5192];
										local1101 = aStringArray39[--anInt5202];
										Static15.method334(local1101, local13);
										return;
									}
									if (arg0 == 3108) {
										anInt5192 -= 3;
										local13 = anIntArray349[anInt5192];
										local19 = anIntArray349[anInt5192 + 1];
										local25 = anIntArray349[anInt5192 + 2];
										local35 = Static435.method5705(local25);
										Static213.method3264(local35, local13, local19);
										return;
									}
									if (arg0 == 3109) {
										anInt5192 -= 2;
										local13 = anIntArray349[anInt5192];
										local19 = anIntArray349[anInt5192 + 1];
										local210 = arg1 ? aClass156_15 : aClass156_14;
										Static213.method3264(local210, local13, local19);
										return;
									}
									if (arg0 == 3110) {
										local13 = anIntArray349[--anInt5192];
										Static30.method641(Static206.aClass217_67);
										Static302.aClass3_Sub7_Sub1_2.method2613(local13);
										return;
									}
									if (arg0 == 3111) {
										anInt5192 -= 2;
										local13 = anIntArray349[anInt5192];
										local19 = anIntArray349[anInt5192 + 1];
										local3751 = (Class3_Sub9) Static318.aClass11_42.method324((long) local13);
										if (local3751 != null) {
											Static434.method5676(local3751.anInt1804 != local19, true, local3751);
										}
										Static68.method1328(true, local19, local13, 3);
										return;
									}
									if (arg0 == 3112) {
										anInt5192--;
										local13 = anIntArray349[anInt5192];
										local3649 = (Class3_Sub9) Static318.aClass11_42.method324((long) local13);
										if (local3649 != null && local3649.anInt1803 == 3) {
											Static434.method5676(true, true, local3649);
										}
										return;
									}
									if (arg0 == 3113) {
										Static150.method3216(aStringArray39[--anInt5202]);
										return;
									}
									if (arg0 == 3114) {
										anInt5192 -= 2;
										local13 = anIntArray349[anInt5192];
										local19 = anIntArray349[anInt5192 + 1];
										local1488 = aStringArray39[--anInt5202];
										Static301.method1894(local19, local13, local1488, "", "");
										return;
									}
								} else if (arg0 < 3300) {
									if (arg0 == 3200) {
										anInt5192 -= 3;
										Static442.method5816(anIntArray349[anInt5192 + 2], 255, anIntArray349[anInt5192], anIntArray349[anInt5192 + 1]);
										return;
									}
									if (arg0 == 3201) {
										Static407.method5243(50, anIntArray349[--anInt5192], 255);
										return;
									}
									if (arg0 == 3202) {
										anInt5192 -= 2;
										Static339.method4510(anIntArray349[anInt5192 + 1], anIntArray349[anInt5192], 255);
										return;
									}
									if (arg0 == 3203) {
										anInt5192 -= 4;
										Static442.method5816(anIntArray349[anInt5192 + 2], anIntArray349[anInt5192 + 3], anIntArray349[anInt5192], anIntArray349[anInt5192 + 1]);
										return;
									}
									if (arg0 == 3204) {
										anInt5192 -= 3;
										Static407.method5243(anIntArray349[anInt5192 + 2], anIntArray349[anInt5192], anIntArray349[anInt5192 + 1]);
										return;
									}
									if (arg0 == 3205) {
										anInt5192 -= 3;
										Static339.method4510(anIntArray349[anInt5192 + 1], anIntArray349[anInt5192], anIntArray349[anInt5192 + 2]);
										return;
									}
									if (arg0 == 3206) {
										anInt5192 -= 4;
										Static123.method1984(anIntArray349[anInt5192 + 3], anIntArray349[anInt5192 + 1], anIntArray349[anInt5192], anIntArray349[anInt5192 + 2]);
										return;
									}
								} else if (arg0 < 3400) {
									if (arg0 == 3300) {
										anIntArray349[anInt5192++] = Static253.anInt4787;
										return;
									}
									if (arg0 == 3301) {
										anInt5192 -= 2;
										local13 = anIntArray349[anInt5192];
										local19 = anIntArray349[anInt5192 + 1];
										anIntArray349[anInt5192++] = Static59.method2642(local13, false, local19);
										return;
									}
									if (arg0 == 3302) {
										anInt5192 -= 2;
										local13 = anIntArray349[anInt5192];
										local19 = anIntArray349[anInt5192 + 1];
										anIntArray349[anInt5192++] = Static63.method1283(local19, false, local13);
										return;
									}
									if (arg0 == 3303) {
										anInt5192 -= 2;
										local13 = anIntArray349[anInt5192];
										local19 = anIntArray349[anInt5192 + 1];
										anIntArray349[anInt5192++] = Static416.method5339(local13, false, local19);
										return;
									}
									if (arg0 == 3304) {
										local13 = anIntArray349[--anInt5192];
										anIntArray349[anInt5192++] = Static77.aClass142_1.method3379(local13).anInt1135;
										return;
									}
									if (arg0 == 3305) {
										local13 = anIntArray349[--anInt5192];
										anIntArray349[anInt5192++] = Static255.anIntArray320[local13];
										return;
									}
									if (arg0 == 3306) {
										local13 = anIntArray349[--anInt5192];
										anIntArray349[anInt5192++] = Static355.anIntArray392[local13];
										return;
									}
									if (arg0 == 3307) {
										local13 = anIntArray349[--anInt5192];
										anIntArray349[anInt5192++] = Static281.anIntArray520[local13];
										return;
									}
									if (arg0 == 3308) {
										@Pc(4605) byte local4605 = Static379.aClass7_Sub2_Sub3_Sub2_2.aByte77;
										local19 = (Static379.aClass7_Sub2_Sub3_Sub2_2.anInt4318 >> 7) + Static223.anInt7618;
										local25 = (Static379.aClass7_Sub2_Sub3_Sub2_2.anInt4321 >> 7) + Static57.anInt5085;
										anIntArray349[anInt5192++] = (local4605 << 28) + (local19 << 14) + local25;
										return;
									}
									if (arg0 == 3309) {
										local13 = anIntArray349[--anInt5192];
										anIntArray349[anInt5192++] = local13 >> 14 & 0x3FFF;
										return;
									}
									if (arg0 == 3310) {
										local13 = anIntArray349[--anInt5192];
										anIntArray349[anInt5192++] = local13 >> 28;
										return;
									}
									if (arg0 == 3311) {
										local13 = anIntArray349[--anInt5192];
										anIntArray349[anInt5192++] = local13 & 0x3FFF;
										return;
									}
									if (arg0 == 3312) {
										anIntArray349[anInt5192++] = Static187.aBoolean320 ? 1 : 0;
										return;
									}
									if (arg0 == 3313) {
										anInt5192 -= 2;
										local13 = anIntArray349[anInt5192];
										local19 = anIntArray349[anInt5192 + 1];
										anIntArray349[anInt5192++] = Static59.method2642(local13, true, local19);
										return;
									}
									if (arg0 == 3314) {
										anInt5192 -= 2;
										local13 = anIntArray349[anInt5192];
										local19 = anIntArray349[anInt5192 + 1];
										anIntArray349[anInt5192++] = Static63.method1283(local19, true, local13);
										return;
									}
									if (arg0 == 3315) {
										anInt5192 -= 2;
										local13 = anIntArray349[anInt5192];
										local19 = anIntArray349[anInt5192 + 1];
										anIntArray349[anInt5192++] = Static416.method5339(local13, true, local19);
										return;
									}
									if (arg0 == 3316) {
										if (Static190.anInt3803 >= 2) {
											anIntArray349[anInt5192++] = Static190.anInt3803;
											return;
										}
										anIntArray349[anInt5192++] = 0;
										return;
									}
									if (arg0 == 3317) {
										anIntArray349[anInt5192++] = Static445.anInt7526;
										return;
									}
									if (arg0 == 3318) {
										anIntArray349[anInt5192++] = Static101.anInt6819;
										return;
									}
									if (arg0 == 3321) {
										anIntArray349[anInt5192++] = Static65.anInt1684;
										return;
									}
									if (arg0 == 3322) {
										anIntArray349[anInt5192++] = Static300.anInt5394;
										return;
									}
									if (arg0 == 3323) {
										if (Static301.anInt2464 >= 5 && Static301.anInt2464 <= 9) {
											anIntArray349[anInt5192++] = 1;
											return;
										}
										anIntArray349[anInt5192++] = 0;
										return;
									}
									if (arg0 == 3324) {
										if (Static301.anInt2464 >= 5 && Static301.anInt2464 <= 9) {
											anIntArray349[anInt5192++] = Static301.anInt2464;
											return;
										}
										anIntArray349[anInt5192++] = 0;
										return;
									}
									if (arg0 == 3325) {
										anIntArray349[anInt5192++] = Static17.aBoolean33 ? 1 : 0;
										return;
									}
									if (arg0 == 3326) {
										anIntArray349[anInt5192++] = Static379.aClass7_Sub2_Sub3_Sub2_2.anInt4414;
										return;
									}
									if (arg0 == 3327) {
										anIntArray349[anInt5192++] = Static379.aClass7_Sub2_Sub3_Sub2_2.aClass206_1.aBoolean489 ? 1 : 0;
										return;
									}
									if (arg0 == 3328) {
										anIntArray349[anInt5192++] = Static388.aBoolean561 && !Static331.aBoolean651 ? 1 : 0;
										return;
									}
									if (arg0 == 3329) {
										anIntArray349[anInt5192++] = Static338.aBoolean492 ? 1 : 0;
										return;
									}
									if (arg0 == 3330) {
										local13 = anIntArray349[--anInt5192];
										anIntArray349[anInt5192++] = Static412.method5295(local13);
										return;
									}
									if (arg0 == 3331) {
										anInt5192 -= 2;
										local13 = anIntArray349[anInt5192];
										local19 = anIntArray349[anInt5192 + 1];
										anIntArray349[anInt5192++] = Static31.method4738(false, local19, local13);
										return;
									}
									if (arg0 == 3332) {
										anInt5192 -= 2;
										local13 = anIntArray349[anInt5192];
										local19 = anIntArray349[anInt5192 + 1];
										anIntArray349[anInt5192++] = Static31.method4738(true, local19, local13);
										return;
									}
									if (arg0 == 3333) {
										anIntArray349[anInt5192++] = Static5.anInt76;
										return;
									}
									if (arg0 == 3335) {
										anIntArray349[anInt5192++] = Static53.anInt1454;
										return;
									}
									if (arg0 == 3336) {
										anInt5192 -= 4;
										local13 = anIntArray349[anInt5192];
										local19 = anIntArray349[anInt5192 + 1];
										local25 = anIntArray349[anInt5192 + 2];
										local353 = anIntArray349[anInt5192 + 3];
										local13 += local19 << 14;
										local13 += local25 << 28;
										local13 += local353;
										anIntArray349[anInt5192++] = local13;
										return;
									}
									if (arg0 == 3337) {
										anIntArray349[anInt5192++] = Static17.anInt475;
										return;
									}
									if (arg0 == 3338) {
										anIntArray349[anInt5192++] = Static312.method4323();
										return;
									}
								} else if (arg0 < 3500) {
									@Pc(5230) Class197 local5230;
									if (arg0 == 3400) {
										anInt5192 -= 2;
										local13 = anIntArray349[anInt5192];
										local19 = anIntArray349[anInt5192 + 1];
										local5230 = Static106.aClass211_1.method4512(local13);
										aStringArray39[anInt5202++] = local5230.method4325(local19);
										return;
									}
									if (arg0 == 3408) {
										anInt5192 -= 4;
										local13 = anIntArray349[anInt5192];
										local19 = anIntArray349[anInt5192 + 1];
										local25 = anIntArray349[anInt5192 + 2];
										local353 = anIntArray349[anInt5192 + 3];
										@Pc(5276) Class197 local5276 = Static106.aClass211_1.method4512(local25);
										if (local5276.aChar3 == local13 && local5276.aChar4 == local19) {
											if (local19 == 115) {
												aStringArray39[anInt5202++] = local5276.method4325(local353);
												return;
											}
											anIntArray349[anInt5192++] = local5276.method4321(local353);
											return;
										}
										throw new RuntimeException("C3408-1");
									}
									if (arg0 == 3409) {
										anInt5192 -= 3;
										local13 = anIntArray349[anInt5192];
										local19 = anIntArray349[anInt5192 + 1];
										local25 = anIntArray349[anInt5192 + 2];
										if (local19 == -1) {
											throw new RuntimeException("C3409-2");
										}
										@Pc(5352) Class197 local5352 = Static106.aClass211_1.method4512(local19);
										if (local5352.aChar4 != local13) {
											throw new RuntimeException("C3409-1");
										}
										anIntArray349[anInt5192++] = local5352.method4318(local25) ? 1 : 0;
										return;
									}
									if (arg0 == 3410) {
										local13 = anIntArray349[--anInt5192];
										local1101 = aStringArray39[--anInt5202];
										if (local13 == -1) {
											throw new RuntimeException("C3410-2");
										}
										local5230 = Static106.aClass211_1.method4512(local13);
										if (local5230.aChar4 != 's') {
											throw new RuntimeException("C3410-1");
										}
										anIntArray349[anInt5192++] = local5230.method4327(local1101) ? 1 : 0;
										return;
									}
									if (arg0 == 3411) {
										local13 = anIntArray349[--anInt5192];
										@Pc(5450) Class197 local5450 = Static106.aClass211_1.method4512(local13);
										anIntArray349[anInt5192++] = local5450.aClass11_35.method322();
										return;
									}
								} else if (arg0 < 3700) {
									if (arg0 == 3600) {
										if (Static105.anInt2381 == 0) {
											anIntArray349[anInt5192++] = -2;
											return;
										}
										if (Static105.anInt2381 == 1) {
											anIntArray349[anInt5192++] = -1;
											return;
										}
										anIntArray349[anInt5192++] = Static202.anInt3950;
										return;
									}
									if (arg0 == 3601) {
										local13 = anIntArray349[--anInt5192];
										if (Static105.anInt2381 == 2 && local13 < Static202.anInt3950) {
											aStringArray39[anInt5202++] = Static388.aStringArray45[local13];
											if (Static93.aStringArray19[local13] != null) {
												aStringArray39[anInt5202++] = Static93.aStringArray19[local13];
												return;
											}
											aStringArray39[anInt5202++] = "";
											return;
										}
										aStringArray39[anInt5202++] = "";
										aStringArray39[anInt5202++] = "";
										return;
									}
									if (arg0 == 3602) {
										local13 = anIntArray349[--anInt5192];
										if (Static105.anInt2381 == 2 && local13 < Static202.anInt3950) {
											anIntArray349[anInt5192++] = Static102.anIntArray137[local13];
											return;
										}
										anIntArray349[anInt5192++] = 0;
										return;
									}
									if (arg0 == 3603) {
										local13 = anIntArray349[--anInt5192];
										if (Static105.anInt2381 == 2 && local13 < Static202.anInt3950) {
											anIntArray349[anInt5192++] = Static252.anIntArray306[local13];
											return;
										}
										anIntArray349[anInt5192++] = 0;
										return;
									}
									if (arg0 == 3604) {
										local3888 = aStringArray39[--anInt5202];
										local19 = anIntArray349[--anInt5192];
										Static309.method4311(local19, local3888);
										return;
									}
									if (arg0 == 3605) {
										local3888 = aStringArray39[--anInt5202];
										Static338.method4507(local3888);
										return;
									}
									if (arg0 == 3606) {
										local3888 = aStringArray39[--anInt5202];
										Static178.method2829(local3888);
										return;
									}
									if (arg0 == 3607) {
										local3888 = aStringArray39[--anInt5202];
										Static70.method1395(false, local3888);
										return;
									}
									if (arg0 == 3608) {
										local3888 = aStringArray39[--anInt5202];
										Static147.method2412(local3888);
										return;
									}
									if (arg0 == 3609) {
										local3888 = aStringArray39[--anInt5202];
										if (local3888.startsWith("<img=0>") || local3888.startsWith("<img=1>")) {
											local3888 = local3888.substring(7);
										}
										anIntArray349[anInt5192++] = Static422.method5383(local3888) ? 1 : 0;
										return;
									}
									if (arg0 == 3610) {
										local13 = anIntArray349[--anInt5192];
										if (Static105.anInt2381 == 2 && local13 < Static202.anInt3950) {
											aStringArray39[anInt5202++] = Static20.aStringArray6[local13];
											return;
										}
										aStringArray39[anInt5202++] = "";
										return;
									}
									if (arg0 == 3611) {
										if (Static453.aString68 != null) {
											aStringArray39[anInt5202++] = Static321.method4378(Static453.aString68);
											return;
										}
										aStringArray39[anInt5202++] = "";
										return;
									}
									if (arg0 == 3612) {
										if (Static453.aString68 != null) {
											anIntArray349[anInt5192++] = Static85.anInt2098;
											return;
										}
										anIntArray349[anInt5192++] = 0;
										return;
									}
									if (arg0 == 3613) {
										local13 = anIntArray349[--anInt5192];
										if (Static453.aString68 != null && local13 < Static85.anInt2098) {
											aStringArray39[anInt5202++] = Static92.aClass173Array1[local13].aString48;
											return;
										}
										aStringArray39[anInt5202++] = "";
										return;
									}
									if (arg0 == 3614) {
										local13 = anIntArray349[--anInt5192];
										if (Static453.aString68 != null && local13 < Static85.anInt2098) {
											anIntArray349[anInt5192++] = Static92.aClass173Array1[local13].anInt5180;
											return;
										}
										anIntArray349[anInt5192++] = 0;
										return;
									}
									if (arg0 == 3615) {
										local13 = anIntArray349[--anInt5192];
										if (Static453.aString68 != null && local13 < Static85.anInt2098) {
											anIntArray349[anInt5192++] = Static92.aClass173Array1[local13].aByte92;
											return;
										}
										anIntArray349[anInt5192++] = 0;
										return;
									}
									if (arg0 == 3616) {
										anIntArray349[anInt5192++] = Static110.aByte47;
										return;
									}
									if (arg0 == 3617) {
										local3888 = aStringArray39[--anInt5202];
										Static223.method5951(local3888);
										return;
									}
									if (arg0 == 3618) {
										anIntArray349[anInt5192++] = Static64.aByte34;
										return;
									}
									if (arg0 == 3619) {
										local3888 = aStringArray39[--anInt5202];
										Static431.method5277(local3888);
										return;
									}
									if (arg0 == 3620) {
										Static229.method3439();
										return;
									}
									if (arg0 == 3621) {
										if (Static105.anInt2381 == 0) {
											anIntArray349[anInt5192++] = -1;
											return;
										}
										anIntArray349[anInt5192++] = Static415.anInt6805;
										return;
									}
									if (arg0 == 3622) {
										local13 = anIntArray349[--anInt5192];
										if (Static105.anInt2381 != 0 && local13 < Static415.anInt6805) {
											aStringArray39[anInt5202++] = Static82.aStringArray32[local13];
											if (Static135.aStringArray29[local13] != null) {
												aStringArray39[anInt5202++] = Static135.aStringArray29[local13];
												return;
											}
											aStringArray39[anInt5202++] = "";
											return;
										}
										aStringArray39[anInt5202++] = "";
										aStringArray39[anInt5202++] = "";
										return;
									}
									if (arg0 == 3623) {
										local3888 = aStringArray39[--anInt5202];
										if (local3888.startsWith("<img=0>") || local3888.startsWith("<img=1>")) {
											local3888 = local3888.substring(7);
										}
										anIntArray349[anInt5192++] = Static2.method9(local3888) ? 1 : 0;
										return;
									}
									if (arg0 == 3624) {
										local13 = anIntArray349[--anInt5192];
										if (Static92.aClass173Array1 != null && local13 < Static85.anInt2098 && Static92.aClass173Array1[local13].aString50.equalsIgnoreCase(Static379.aClass7_Sub2_Sub3_Sub2_2.aString36)) {
											anIntArray349[anInt5192++] = 1;
											return;
										}
										anIntArray349[anInt5192++] = 0;
										return;
									}
									if (arg0 == 3625) {
										if (Static406.aString58 != null) {
											aStringArray39[anInt5202++] = Static406.aString58;
											return;
										}
										aStringArray39[anInt5202++] = "";
										return;
									}
									if (arg0 == 3626) {
										local13 = anIntArray349[--anInt5192];
										if (Static453.aString68 != null && local13 < Static85.anInt2098) {
											aStringArray39[anInt5202++] = Static92.aClass173Array1[local13].aString49;
											return;
										}
										aStringArray39[anInt5202++] = "";
										return;
									}
									if (arg0 == 3627) {
										local13 = anIntArray349[--anInt5192];
										if (Static105.anInt2381 == 2 && local13 >= 0 && local13 < Static202.anInt3950) {
											anIntArray349[anInt5192++] = Static272.aBooleanArray19[local13] ? 1 : 0;
											return;
										}
										anIntArray349[anInt5192++] = 0;
										return;
									}
									if (arg0 == 3628) {
										local3888 = aStringArray39[--anInt5202];
										if (local3888.startsWith("<img=0>") || local3888.startsWith("<img=1>")) {
											local3888 = local3888.substring(7);
										}
										anIntArray349[anInt5192++] = Static35.method722(local3888);
										return;
									}
									if (arg0 == 3629) {
										anIntArray349[anInt5192++] = Static383.anInt6369;
										return;
									}
									if (arg0 == 3630) {
										local3888 = aStringArray39[--anInt5202];
										Static70.method1395(true, local3888);
										return;
									}
									if (arg0 == 3631) {
										local13 = anIntArray349[--anInt5192];
										anIntArray349[anInt5192++] = Static217.aBooleanArray18[local13] ? 1 : 0;
										return;
									}
									if (arg0 == 3632) {
										local13 = anIntArray349[--anInt5192];
										if (Static453.aString68 != null && local13 < Static85.anInt2098) {
											aStringArray39[anInt5202++] = Static92.aClass173Array1[local13].aString50;
											return;
										}
										aStringArray39[anInt5202++] = "";
										return;
									}
									if (arg0 == 3633) {
										local13 = anIntArray349[--anInt5192];
										if (Static105.anInt2381 != 0 && local13 < Static415.anInt6805) {
											aStringArray39[anInt5202++] = Static67.aStringArray10[local13];
											return;
										}
										aStringArray39[anInt5202++] = "";
										return;
									}
								} else if (arg0 < 4000) {
									if (arg0 == 3903) {
										local13 = anIntArray349[--anInt5192];
										anIntArray349[anInt5192++] = Static364.aClass86Array1[local13].method2007();
										return;
									}
									if (arg0 == 3904) {
										local13 = anIntArray349[--anInt5192];
										anIntArray349[anInt5192++] = Static364.aClass86Array1[local13].anInt2652;
										return;
									}
									if (arg0 == 3905) {
										local13 = anIntArray349[--anInt5192];
										anIntArray349[anInt5192++] = Static364.aClass86Array1[local13].anInt2649;
										return;
									}
									if (arg0 == 3906) {
										local13 = anIntArray349[--anInt5192];
										anIntArray349[anInt5192++] = Static364.aClass86Array1[local13].anInt2658;
										return;
									}
									if (arg0 == 3907) {
										local13 = anIntArray349[--anInt5192];
										anIntArray349[anInt5192++] = Static364.aClass86Array1[local13].anInt2653;
										return;
									}
									if (arg0 == 3908) {
										local13 = anIntArray349[--anInt5192];
										anIntArray349[anInt5192++] = Static364.aClass86Array1[local13].anInt2655;
										return;
									}
									if (arg0 == 3910) {
										local13 = anIntArray349[--anInt5192];
										local19 = Static364.aClass86Array1[local13].method2010();
										anIntArray349[anInt5192++] = local19 == 0 ? 1 : 0;
										return;
									}
									if (arg0 == 3911) {
										local13 = anIntArray349[--anInt5192];
										local19 = Static364.aClass86Array1[local13].method2010();
										anIntArray349[anInt5192++] = local19 == 2 ? 1 : 0;
										return;
									}
									if (arg0 == 3912) {
										local13 = anIntArray349[--anInt5192];
										local19 = Static364.aClass86Array1[local13].method2010();
										anIntArray349[anInt5192++] = local19 == 5 ? 1 : 0;
										return;
									}
									if (arg0 == 3913) {
										local13 = anIntArray349[--anInt5192];
										local19 = Static364.aClass86Array1[local13].method2010();
										anIntArray349[anInt5192++] = local19 == 1 ? 1 : 0;
										return;
									}
								} else if (arg0 < 4100) {
									if (arg0 == 4000) {
										anInt5192 -= 2;
										local13 = anIntArray349[anInt5192];
										local19 = anIntArray349[anInt5192 + 1];
										anIntArray349[anInt5192++] = local13 + local19;
										return;
									}
									if (arg0 == 4001) {
										anInt5192 -= 2;
										local13 = anIntArray349[anInt5192];
										local19 = anIntArray349[anInt5192 + 1];
										anIntArray349[anInt5192++] = local13 - local19;
										return;
									}
									if (arg0 == 4002) {
										anInt5192 -= 2;
										local13 = anIntArray349[anInt5192];
										local19 = anIntArray349[anInt5192 + 1];
										anIntArray349[anInt5192++] = local13 * local19;
										return;
									}
									if (arg0 == 4003) {
										anInt5192 -= 2;
										local13 = anIntArray349[anInt5192];
										local19 = anIntArray349[anInt5192 + 1];
										anIntArray349[anInt5192++] = local13 / local19;
										return;
									}
									if (arg0 == 4004) {
										local13 = anIntArray349[--anInt5192];
										anIntArray349[anInt5192++] = (int) (Math.random() * (double) local13);
										return;
									}
									if (arg0 == 4005) {
										local13 = anIntArray349[--anInt5192];
										anIntArray349[anInt5192++] = (int) (Math.random() * (double) (local13 + 1));
										return;
									}
									if (arg0 == 4006) {
										anInt5192 -= 5;
										local13 = anIntArray349[anInt5192];
										local19 = anIntArray349[anInt5192 + 1];
										local25 = anIntArray349[anInt5192 + 2];
										local353 = anIntArray349[anInt5192 + 3];
										local2290 = anIntArray349[anInt5192 + 4];
										anIntArray349[anInt5192++] = local13 + (local19 - local13) * (local2290 - local25) / (local353 - local25);
										return;
									}
									@Pc(6960) long local6960;
									@Pc(6953) long local6953;
									if (arg0 == 4007) {
										anInt5192 -= 2;
										local6953 = anIntArray349[anInt5192];
										local6960 = anIntArray349[anInt5192 + 1];
										anIntArray349[anInt5192++] = (int) (local6953 + local6953 * local6960 / 100L);
										return;
									}
									if (arg0 == 4008) {
										anInt5192 -= 2;
										local13 = anIntArray349[anInt5192];
										local19 = anIntArray349[anInt5192 + 1];
										anIntArray349[anInt5192++] = local13 | 0x1 << local19;
										return;
									}
									if (arg0 == 4009) {
										anInt5192 -= 2;
										local13 = anIntArray349[anInt5192];
										local19 = anIntArray349[anInt5192 + 1];
										anIntArray349[anInt5192++] = local13 & -(0x1 << local19) - 1;
										return;
									}
									if (arg0 == 4010) {
										anInt5192 -= 2;
										local13 = anIntArray349[anInt5192];
										local19 = anIntArray349[anInt5192 + 1];
										anIntArray349[anInt5192++] = (local13 & 0x1 << local19) == 0 ? 0 : 1;
										return;
									}
									if (arg0 == 4011) {
										anInt5192 -= 2;
										local13 = anIntArray349[anInt5192];
										local19 = anIntArray349[anInt5192 + 1];
										anIntArray349[anInt5192++] = local13 % local19;
										return;
									}
									if (arg0 == 4012) {
										anInt5192 -= 2;
										local13 = anIntArray349[anInt5192];
										local19 = anIntArray349[anInt5192 + 1];
										if (local13 == 0) {
											anIntArray349[anInt5192++] = 0;
											return;
										}
										anIntArray349[anInt5192++] = (int) Math.pow((double) local13, (double) local19);
										return;
									}
									if (arg0 == 4013) {
										anInt5192 -= 2;
										local13 = anIntArray349[anInt5192];
										local19 = anIntArray349[anInt5192 + 1];
										if (local13 == 0) {
											anIntArray349[anInt5192++] = 0;
											return;
										}
										if (local19 == 0) {
											anIntArray349[anInt5192++] = Integer.MAX_VALUE;
											return;
										}
										anIntArray349[anInt5192++] = (int) Math.pow((double) local13, 1.0D / (double) local19);
										return;
									}
									if (arg0 == 4014) {
										anInt5192 -= 2;
										local13 = anIntArray349[anInt5192];
										local19 = anIntArray349[anInt5192 + 1];
										anIntArray349[anInt5192++] = local13 & local19;
										return;
									}
									if (arg0 == 4015) {
										anInt5192 -= 2;
										local13 = anIntArray349[anInt5192];
										local19 = anIntArray349[anInt5192 + 1];
										anIntArray349[anInt5192++] = local13 | local19;
										return;
									}
									if (arg0 == 4016) {
										anInt5192 -= 2;
										local13 = anIntArray349[anInt5192];
										local19 = anIntArray349[anInt5192 + 1];
										anIntArray349[anInt5192++] = local13 < local19 ? local13 : local19;
										return;
									}
									if (arg0 == 4017) {
										anInt5192 -= 2;
										local13 = anIntArray349[anInt5192];
										local19 = anIntArray349[anInt5192 + 1];
										anIntArray349[anInt5192++] = local13 > local19 ? local13 : local19;
										return;
									}
									if (arg0 == 4018) {
										anInt5192 -= 3;
										local6953 = anIntArray349[anInt5192];
										local6960 = anIntArray349[anInt5192 + 1];
										@Pc(7341) long local7341 = (long) anIntArray349[anInt5192 + 2];
										anIntArray349[anInt5192++] = (int) (local6953 * local7341 / local6960);
										return;
									}
								} else if (arg0 < 4200) {
									if (arg0 == 4100) {
										local3888 = aStringArray39[--anInt5202];
										local19 = anIntArray349[--anInt5192];
										aStringArray39[anInt5202++] = local3888 + local19;
										return;
									}
									if (arg0 == 4101) {
										anInt5202 -= 2;
										local3888 = aStringArray39[anInt5202];
										local1101 = aStringArray39[anInt5202 + 1];
										aStringArray39[anInt5202++] = local3888 + local1101;
										return;
									}
									if (arg0 == 4102) {
										local3888 = aStringArray39[--anInt5202];
										local19 = anIntArray349[--anInt5192];
										aStringArray39[anInt5202++] = local3888 + Static163.method4907(local19);
										return;
									}
									if (arg0 == 4103) {
										local3888 = aStringArray39[--anInt5202];
										aStringArray39[anInt5202++] = local3888.toLowerCase();
										return;
									}
									if (arg0 == 4104) {
										aStringArray39[anInt5202++] = method4056(anIntArray349[--anInt5192]);
										return;
									}
									if (arg0 == 4105) {
										anInt5202 -= 2;
										local3888 = aStringArray39[anInt5202];
										local1101 = aStringArray39[anInt5202 + 1];
										if (Static379.aClass7_Sub2_Sub3_Sub2_2.aClass206_1 != null && Static379.aClass7_Sub2_Sub3_Sub2_2.aClass206_1.aBoolean489) {
											aStringArray39[anInt5202++] = local1101;
											return;
										}
										aStringArray39[anInt5202++] = local3888;
										return;
									}
									if (arg0 == 4106) {
										local13 = anIntArray349[--anInt5192];
										aStringArray39[anInt5202++] = Integer.toString(local13);
										return;
									}
									if (arg0 == 4107) {
										anInt5202 -= 2;
										anIntArray349[anInt5192++] = Static37.method732(aStringArray39[anInt5202 + 1], Static53.anInt1454, aStringArray39[anInt5202]);
										return;
									}
									@Pc(7624) Class70 local7624;
									if (arg0 == 4108) {
										local3888 = aStringArray39[--anInt5202];
										anInt5192 -= 2;
										local19 = anIntArray349[anInt5192];
										local25 = anIntArray349[anInt5192 + 1];
										local7624 = Static388.method5044(Static56.aClass32_26, local25);
										anIntArray349[anInt5192++] = local7624.method1755(local19, Static260.aClass8Array170, local3888);
										return;
									}
									if (arg0 == 4109) {
										local3888 = aStringArray39[--anInt5202];
										anInt5192 -= 2;
										local19 = anIntArray349[anInt5192];
										local25 = anIntArray349[anInt5192 + 1];
										local7624 = Static388.method5044(Static56.aClass32_26, local25);
										anIntArray349[anInt5192++] = local7624.method1752(Static260.aClass8Array170, local19, local3888);
										return;
									}
									if (arg0 == 4110) {
										anInt5202 -= 2;
										local3888 = aStringArray39[anInt5202];
										local1101 = aStringArray39[anInt5202 + 1];
										if (anIntArray349[--anInt5192] == 1) {
											aStringArray39[anInt5202++] = local3888;
											return;
										}
										aStringArray39[anInt5202++] = local1101;
										return;
									}
									if (arg0 == 4111) {
										local3888 = aStringArray39[--anInt5202];
										aStringArray39[anInt5202++] = Static249.method3737(local3888);
										return;
									}
									if (arg0 == 4112) {
										local3888 = aStringArray39[--anInt5202];
										local19 = anIntArray349[--anInt5192];
										if (local19 == -1) {
											throw new RuntimeException("null char");
										}
										aStringArray39[anInt5202++] = local3888 + (char) local19;
										return;
									}
									if (arg0 == 4113) {
										local13 = anIntArray349[--anInt5192];
										anIntArray349[anInt5192++] = Static341.method4532((char) local13) ? 1 : 0;
										return;
									}
									if (arg0 == 4114) {
										local13 = anIntArray349[--anInt5192];
										anIntArray349[anInt5192++] = Static25.method590((char) local13) ? 1 : 0;
										return;
									}
									if (arg0 == 4115) {
										local13 = anIntArray349[--anInt5192];
										anIntArray349[anInt5192++] = Static21.method468((char) local13) ? 1 : 0;
										return;
									}
									if (arg0 == 4116) {
										local13 = anIntArray349[--anInt5192];
										anIntArray349[anInt5192++] = Static9.method115((char) local13) ? 1 : 0;
										return;
									}
									if (arg0 == 4117) {
										local3888 = aStringArray39[--anInt5202];
										if (local3888 != null) {
											anIntArray349[anInt5192++] = local3888.length();
											return;
										}
										anIntArray349[anInt5192++] = 0;
										return;
									}
									if (arg0 == 4118) {
										local3888 = aStringArray39[--anInt5202];
										anInt5192 -= 2;
										local19 = anIntArray349[anInt5192];
										local25 = anIntArray349[anInt5192 + 1];
										aStringArray39[anInt5202++] = local3888.substring(local19, local25);
										return;
									}
									if (arg0 == 4119) {
										local3888 = aStringArray39[--anInt5202];
										@Pc(7987) StringBuffer local7987 = new StringBuffer(local3888.length());
										@Pc(7989) boolean local7989 = false;
										for (local353 = 0; local353 < local3888.length(); local353++) {
											@Pc(7996) char local7996 = local3888.charAt(local353);
											if (local7996 == '<') {
												local7989 = true;
											} else if (local7996 == '>') {
												local7989 = false;
											} else if (!local7989) {
												local7987.append(local7996);
											}
										}
										aStringArray39[anInt5202++] = local7987.toString();
										return;
									}
									if (arg0 == 4120) {
										local3888 = aStringArray39[--anInt5202];
										anInt5192 -= 2;
										local19 = anIntArray349[anInt5192];
										local25 = anIntArray349[anInt5192 + 1];
										anIntArray349[anInt5192++] = local3888.indexOf(local19, local25);
										return;
									}
									if (arg0 == 4121) {
										anInt5202 -= 2;
										local3888 = aStringArray39[anInt5202];
										local1101 = aStringArray39[anInt5202 + 1];
										local25 = anIntArray349[--anInt5192];
										anIntArray349[anInt5192++] = local3888.indexOf(local1101, local25);
										return;
									}
									if (arg0 == 4122) {
										local13 = anIntArray349[--anInt5192];
										anIntArray349[anInt5192++] = Character.toLowerCase((char) local13);
										return;
									}
									if (arg0 == 4123) {
										local13 = anIntArray349[--anInt5192];
										anIntArray349[anInt5192++] = Character.toUpperCase((char) local13);
										return;
									}
									if (arg0 == 4124) {
										local412 = anIntArray349[--anInt5192] != 0;
										local19 = anIntArray349[--anInt5192];
										aStringArray39[anInt5202++] = Static102.method1789(Static53.anInt1454, (long) local19, 0, local412);
										return;
									}
									if (arg0 == 4125) {
										local3888 = aStringArray39[--anInt5202];
										local19 = anIntArray349[--anInt5192];
										@Pc(8210) Class70 local8210 = Static388.method5044(Static56.aClass32_26, local19);
										anIntArray349[anInt5192++] = local8210.method1756(Static260.aClass8Array170, local3888);
										return;
									}
								} else if (arg0 < 4300) {
									if (arg0 == 4200) {
										local13 = anIntArray349[--anInt5192];
										aStringArray39[anInt5202++] = Static314.aClass12_2.method327(local13).aString17;
										return;
									}
									@Pc(8272) Class81 local8272;
									if (arg0 == 4201) {
										anInt5192 -= 2;
										local13 = anIntArray349[anInt5192];
										local19 = anIntArray349[anInt5192 + 1];
										local8272 = Static314.aClass12_2.method327(local13);
										if (local19 >= 1 && local19 <= 5 && local8272.aStringArray23[local19 - 1] != null) {
											aStringArray39[anInt5202++] = local8272.aStringArray23[local19 - 1];
											return;
										}
										aStringArray39[anInt5202++] = "";
										return;
									}
									if (arg0 == 4202) {
										anInt5192 -= 2;
										local13 = anIntArray349[anInt5192];
										local19 = anIntArray349[anInt5192 + 1];
										local8272 = Static314.aClass12_2.method327(local13);
										if (local19 >= 1 && local19 <= 5 && local8272.aStringArray22[local19 - 1] != null) {
											aStringArray39[anInt5202++] = local8272.aStringArray22[local19 - 1];
											return;
										}
										aStringArray39[anInt5202++] = "";
										return;
									}
									if (arg0 == 4203) {
										local13 = anIntArray349[--anInt5192];
										anIntArray349[anInt5192++] = Static314.aClass12_2.method327(local13).anInt2524;
										return;
									}
									if (arg0 == 4204) {
										local13 = anIntArray349[--anInt5192];
										anIntArray349[anInt5192++] = Static314.aClass12_2.method327(local13).anInt2535 == 1 ? 1 : 0;
										return;
									}
									@Pc(8435) Class81 local8435;
									if (arg0 == 4205) {
										local13 = anIntArray349[--anInt5192];
										local8435 = Static314.aClass12_2.method327(local13);
										if (local8435.anInt2541 == -1 && local8435.anInt2548 >= 0) {
											anIntArray349[anInt5192++] = local8435.anInt2548;
											return;
										}
										anIntArray349[anInt5192++] = local13;
										return;
									}
									if (arg0 == 4206) {
										local13 = anIntArray349[--anInt5192];
										local8435 = Static314.aClass12_2.method327(local13);
										if (local8435.anInt2541 >= 0 && local8435.anInt2548 >= 0) {
											anIntArray349[anInt5192++] = local8435.anInt2548;
											return;
										}
										anIntArray349[anInt5192++] = local13;
										return;
									}
									if (arg0 == 4207) {
										local13 = anIntArray349[--anInt5192];
										anIntArray349[anInt5192++] = Static314.aClass12_2.method327(local13).aBoolean225 ? 1 : 0;
										return;
									}
									if (arg0 == 4208) {
										anInt5192 -= 2;
										local13 = anIntArray349[anInt5192];
										local19 = anIntArray349[anInt5192 + 1];
										local3017 = Static318.aClass26_5.method691(local19);
										if (local3017.method4789()) {
											aStringArray39[anInt5202++] = Static314.aClass12_2.method327(local13).method1939(local19, local3017.aString56);
											return;
										}
										anIntArray349[anInt5192++] = Static314.aClass12_2.method327(local13).method1951(local3017.anInt6133, local19);
										return;
									}
									if (arg0 == 4209) {
										anInt5192 -= 2;
										local13 = anIntArray349[anInt5192];
										local19 = anIntArray349[anInt5192 + 1] - 1;
										local8272 = Static314.aClass12_2.method327(local13);
										if (local8272.anInt2549 == local19) {
											anIntArray349[anInt5192++] = local8272.anInt2557;
											return;
										}
										if (local8272.anInt2561 == local19) {
											anIntArray349[anInt5192++] = local8272.anInt2553;
											return;
										}
										anIntArray349[anInt5192++] = -1;
										return;
									}
									if (arg0 == 4210) {
										local3888 = aStringArray39[--anInt5202];
										local19 = anIntArray349[--anInt5192];
										Static359.method4751(local19 == 1, local3888);
										anIntArray349[anInt5192++] = Static36.anInt1022;
										return;
									}
									if (arg0 == 4211) {
										if (Static226.aShortArray66 != null && Static390.anInt6521 < Static36.anInt1022) {
											anIntArray349[anInt5192++] = Static226.aShortArray66[Static390.anInt6521++] & 0xFFFF;
											return;
										}
										anIntArray349[anInt5192++] = -1;
										return;
									}
									if (arg0 == 4212) {
										Static390.anInt6521 = 0;
										return;
									}
								} else if (arg0 < 4400) {
									if (arg0 == 4300) {
										anInt5192 -= 2;
										local13 = anIntArray349[anInt5192];
										local19 = anIntArray349[anInt5192 + 1];
										local3017 = Static318.aClass26_5.method691(local19);
										if (local3017.method4789()) {
											aStringArray39[anInt5202++] = Static364.aClass96_2.method2199(local13).method1237(local19, local3017.aString56);
											return;
										}
										anIntArray349[anInt5192++] = Static364.aClass96_2.method2199(local13).method1245(local3017.anInt6133, local19);
										return;
									}
								} else if (arg0 < 4500) {
									if (arg0 == 4400) {
										anInt5192 -= 2;
										local13 = anIntArray349[anInt5192];
										local19 = anIntArray349[anInt5192 + 1];
										local3017 = Static318.aClass26_5.method691(local19);
										if (local3017.method4789()) {
											aStringArray39[anInt5202++] = Static435.aClass30_4.method769(local13).method2061(local3017.aString56, local19);
											return;
										}
										anIntArray349[anInt5192++] = Static435.aClass30_4.method769(local13).method2067(local19, local3017.anInt6133);
										return;
									}
								} else if (arg0 < 4600) {
									if (arg0 == 4500) {
										anInt5192 -= 2;
										local13 = anIntArray349[anInt5192];
										local19 = anIntArray349[anInt5192 + 1];
										local3017 = Static318.aClass26_5.method691(local19);
										if (local3017.method4789()) {
											aStringArray39[anInt5202++] = Static106.aClass124_1.method3116(local13).method4996(local19, local3017.aString56);
											return;
										}
										anIntArray349[anInt5192++] = Static106.aClass124_1.method3116(local13).method4992(local19, local3017.anInt6133);
										return;
									}
								} else if (arg0 < 4700 && arg0 == 4600) {
									local13 = anIntArray349[--anInt5192];
									@Pc(8936) Class1 local8936 = Static432.aClass73_1.method1823(local13);
									if (local8936.anIntArray1 != null && local8936.anIntArray1.length > 0) {
										local25 = 0;
										local353 = local8936.anIntArray3[0];
										for (local2290 = 1; local2290 < local8936.anIntArray1.length; local2290++) {
											if (local8936.anIntArray3[local2290] > local353) {
												local25 = local2290;
												local353 = local8936.anIntArray3[local2290];
											}
										}
										anIntArray349[anInt5192++] = local8936.anIntArray1[local25];
										return;
									}
									anIntArray349[anInt5192++] = local8936.anInt19;
									return;
								}
							}
						}
					}
				} else {
					if (arg0 >= 2000) {
						arg0 -= 1000;
						local137 = Static435.method5705(anIntArray349[--anInt5192]);
					} else {
						local137 = arg1 ? aClass156_15 : aClass156_14;
					}
					Static386.method5010(local137);
					if (arg0 == 1200 || arg0 == 1205 || arg0 == 1208 || arg0 == 1209 || arg0 == 1212 || arg0 == 1213) {
						anInt5192 -= 2;
						local19 = anIntArray349[anInt5192];
						local25 = anIntArray349[anInt5192 + 1];
						if (local137.anInt4868 == -1) {
							Static411.method5288(local137.anInt4850);
							Static441.method5812(local137.anInt4850);
							Static318.method5480(local137.anInt4850);
						}
						if (local19 == -1) {
							local137.anInt4832 = 1;
							local137.anInt4816 = -1;
							local137.anInt4826 = -1;
							return;
						}
						local137.anInt4826 = local19;
						local137.anInt4838 = local25;
						if (arg0 == 1208 || arg0 == 1209) {
							local137.aBoolean419 = true;
						} else {
							local137.aBoolean419 = false;
						}
						@Pc(1630) Class81 local1630 = Static314.aClass12_2.method327(local19);
						local137.anInt4817 = local1630.anInt2539;
						local137.anInt4873 = local1630.anInt2552;
						local137.anInt4849 = local1630.anInt2580;
						local137.anInt4844 = local1630.anInt2526;
						local137.anInt4834 = local1630.anInt2532;
						local137.anInt4811 = local1630.anInt2566;
						if (arg0 == 1205 || arg0 == 1209) {
							local137.anInt4810 = 0;
						} else if (arg0 == 1212 || arg0 == 1213) {
							local137.anInt4810 = 1;
						} else {
							local137.anInt4810 = 2;
						}
						if (local137.anInt4870 > 0) {
							local137.anInt4811 = local137.anInt4811 * 32 / local137.anInt4870;
							return;
						}
						if (local137.anInt4830 > 0) {
							local137.anInt4811 = local137.anInt4811 * 32 / local137.anInt4830;
						}
						return;
					}
					if (arg0 == 1201) {
						local137.anInt4832 = 2;
						local137.anInt4816 = anIntArray349[--anInt5192];
						if (local137.anInt4868 == -1) {
							Static69.method1366(local137.anInt4850);
						}
						return;
					}
					if (arg0 == 1202) {
						local137.anInt4832 = 3;
						local137.anInt4816 = -1;
						if (local137.anInt4868 == -1) {
							Static69.method1366(local137.anInt4850);
						}
						return;
					}
					if (arg0 == 1203) {
						local137.anInt4832 = 6;
						local137.anInt4816 = anIntArray349[--anInt5192];
						if (local137.anInt4868 == -1) {
							Static69.method1366(local137.anInt4850);
						}
						return;
					}
					if (arg0 == 1204) {
						local137.anInt4832 = 5;
						local137.anInt4816 = anIntArray349[--anInt5192];
						if (local137.anInt4868 == -1) {
							Static69.method1366(local137.anInt4850);
						}
						return;
					}
					if (arg0 == 1206) {
						anInt5192 -= 4;
						local137.anInt4805 = anIntArray349[anInt5192];
						local137.anInt4881 = anIntArray349[anInt5192 + 1];
						local137.anInt4818 = anIntArray349[anInt5192 + 2];
						local137.anInt4842 = anIntArray349[anInt5192 + 3];
						Static386.method5010(local137);
						return;
					}
					if (arg0 == 1207) {
						anInt5192 -= 2;
						local137.anInt4846 = anIntArray349[anInt5192];
						local137.anInt4799 = anIntArray349[anInt5192 + 1];
						Static386.method5010(local137);
						return;
					}
					if (arg0 == 1210) {
						anInt5192 -= 4;
						local137.anInt4816 = anIntArray349[anInt5192];
						local137.anInt4815 = anIntArray349[anInt5192 + 1];
						if (anIntArray349[anInt5192 + 2] == 1) {
							local137.anInt4832 = 9;
						} else {
							local137.anInt4832 = 8;
						}
						if (anIntArray349[anInt5192 + 3] == 1) {
							local137.aBoolean419 = true;
						} else {
							local137.aBoolean419 = false;
						}
						if (local137.anInt4868 == -1) {
							Static69.method1366(local137.anInt4850);
						}
						return;
					}
					if (arg0 == 1211) {
						local137.anInt4832 = 5;
						local137.anInt4816 = Static319.anInt1936;
						local137.anInt4815 = 0;
						if (local137.anInt4868 == -1) {
							Static69.method1366(local137.anInt4850);
						}
						return;
					}
				}
			} else {
				if (arg0 >= 2000) {
					arg0 -= 1000;
					local137 = Static435.method5705(anIntArray349[--anInt5192]);
				} else {
					local137 = arg1 ? aClass156_15 : aClass156_14;
				}
				if (arg0 == 1000) {
					anInt5192 -= 4;
					local137.anInt4869 = anIntArray349[anInt5192];
					local137.anInt4837 = anIntArray349[anInt5192 + 1];
					local19 = anIntArray349[anInt5192 + 2];
					if (local19 < 0) {
						local19 = 0;
					} else if (local19 > 5) {
						local19 = 5;
					}
					local25 = anIntArray349[anInt5192 + 3];
					if (local25 < 0) {
						local25 = 0;
					} else if (local25 > 5) {
						local25 = 5;
					}
					local137.aByte90 = (byte) local19;
					local137.aByte89 = (byte) local25;
					Static386.method5010(local137);
					Static168.method2733(local137);
					if (local137.anInt4868 == -1) {
						Static345.method5811(local137.anInt4850);
					}
					return;
				}
				if (arg0 == 1001) {
					anInt5192 -= 4;
					local137.anInt4830 = anIntArray349[anInt5192];
					local137.anInt4804 = anIntArray349[anInt5192 + 1];
					local137.anInt4870 = 0;
					local137.anInt4802 = 0;
					local19 = anIntArray349[anInt5192 + 2];
					if (local19 < 0) {
						local19 = 0;
					} else if (local19 > 4) {
						local19 = 4;
					}
					local25 = anIntArray349[anInt5192 + 3];
					if (local25 < 0) {
						local25 = 0;
					} else if (local25 > 4) {
						local25 = 4;
					}
					local137.aByte88 = (byte) local19;
					local137.aByte87 = (byte) local25;
					Static386.method5010(local137);
					Static168.method2733(local137);
					if (local137.anInt4792 == 0) {
						Static317.method4367(false, local137);
					}
					return;
				}
				if (arg0 == 1003) {
					@Pc(620) boolean local620 = anIntArray349[--anInt5192] == 1;
					if (local137.aBoolean427 != local620) {
						local137.aBoolean427 = local620;
						Static386.method5010(local137);
					}
					if (local137.anInt4868 == -1) {
						Static362.method4781(local137.anInt4850);
					}
					return;
				}
				if (arg0 == 1004) {
					anInt5192 -= 2;
					local137.anInt4827 = anIntArray349[anInt5192];
					local137.anInt4840 = anIntArray349[anInt5192 + 1];
					Static386.method5010(local137);
					Static168.method2733(local137);
					if (local137.anInt4792 == 0) {
						Static317.method4367(false, local137);
					}
					return;
				}
				if (arg0 == 1005) {
					local137.aBoolean418 = anIntArray349[--anInt5192] == 1;
					return;
				}
			}
		}
		throw new IllegalStateException();
	}

	@OriginalMember(owner = "client!of", name = "a", descriptor = "(Lclient!no;II)V")
	public static void method4054(@OriginalArg(0) Class167 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(5) Class3_Sub4_Sub7 local5 = Static66.method1311(arg1, arg2, arg0);
		if (local5 == null) {
			return;
		}
		anIntArray350 = new int[local5.anInt1791];
		aStringArray38 = new String[local5.anInt1793];
		if (local5.aClass167_2 == Static236.aClass167_6 || local5.aClass167_2 == Static217.aClass167_5 || local5.aClass167_2 == Static237.aClass167_7) {
			@Pc(30) int local30 = 0;
			@Pc(32) int local32 = 0;
			if (Static443.aClass156_8 != null) {
				local30 = Static443.aClass156_8.anInt4800;
				local32 = Static443.aClass156_8.anInt4806;
			}
			anIntArray350[0] = Static290.aClass100_1.method3218() - local30;
			anIntArray350[1] = Static290.aClass100_1.method3213() - local32;
		}
		method4052(local5, 200000);
	}

	@OriginalMember(owner = "client!of", name = "a", descriptor = "(Lclient!ne;I)V")
	private static void method4055(@OriginalArg(0) Class3_Sub31 arg0, @OriginalArg(1) int arg1) {
		@Pc(2) Object[] local2 = arg0.anObjectArray36;
		@Pc(8) int local8 = (Integer) local2[0];
		@Pc(12) Class3_Sub4_Sub7 local12 = Static349.method4647(local8);
		if (local12 == null) {
			return;
		}
		anIntArray350 = new int[local12.anInt1791];
		@Pc(21) int local21 = 0;
		aStringArray38 = new String[local12.anInt1793];
		@Pc(27) int local27 = 0;
		for (@Pc(29) int local29 = 1; local29 < local2.length; local29++) {
			if (local2[local29] instanceof Integer) {
				@Pc(41) int local41 = (Integer) local2[local29];
				if (local41 == -2147483647) {
					local41 = arg0.anInt5003;
				}
				if (local41 == -2147483646) {
					local41 = arg0.anInt4999;
				}
				if (local41 == -2147483645) {
					local41 = arg0.aClass156_11 == null ? -1 : arg0.aClass156_11.anInt4850;
				}
				if (local41 == -2147483644) {
					local41 = arg0.anInt5004;
				}
				if (local41 == -2147483643) {
					local41 = arg0.aClass156_11 == null ? -1 : arg0.aClass156_11.anInt4868;
				}
				if (local41 == -2147483642) {
					local41 = arg0.aClass156_12 == null ? -1 : arg0.aClass156_12.anInt4850;
				}
				if (local41 == -2147483641) {
					local41 = arg0.aClass156_12 == null ? -1 : arg0.aClass156_12.anInt4868;
				}
				if (local41 == -2147483640) {
					local41 = arg0.anInt5001;
				}
				if (local41 == -2147483639) {
					local41 = arg0.anInt5000;
				}
				anIntArray350[local21++] = local41;
			} else if (local2[local29] instanceof String) {
				@Pc(135) String local135 = (String) local2[local29];
				if (local135.equals("event_opbase")) {
					local135 = arg0.aString44;
				}
				aStringArray38[local27++] = local135;
			}
		}
		anInt5205 = arg0.anInt5002;
		method4052(local12, arg1);
	}

	@OriginalMember(owner = "client!of", name = "b", descriptor = "(I)Ljava/lang/String;")
	private static String method4056(@OriginalArg(0) int arg0) {
		@Pc(6) long local6 = ((long) arg0 + 11745L) * 86400000L;
		aCalendar2.setTime(new Date(local6));
		@Pc(16) int local16 = aCalendar2.get(5);
		@Pc(20) int local20 = aCalendar2.get(2);
		@Pc(24) int local24 = aCalendar2.get(1);
		return local16 + "-" + aStringArray40[local20] + "-" + local24;
	}

	@OriginalMember(owner = "client!of", name = "c", descriptor = "(I)V")
	public static void method4057(@OriginalArg(0) int arg0) {
		if (arg0 == -1 || !Static55.method1137(arg0)) {
			return;
		}
		@Pc(12) Class156[] local12 = Static178.aClass156ArrayArray2[arg0];
		for (@Pc(14) int local14 = 0; local14 < local12.length; local14++) {
			@Pc(19) Class156 local19 = local12[local14];
			if (local19.anObjectArray11 != null) {
				@Pc(26) Class3_Sub31 local26 = new Class3_Sub31();
				local26.aClass156_11 = local19;
				local26.anObjectArray36 = local19.anObjectArray11;
				method4055(local26, 2000000);
			}
		}
	}

	@OriginalMember(owner = "client!of", name = "d", descriptor = "(I)V")
	private static void method4058(@OriginalArg(0) int arg0) {
		@Pc(3) Class156 local3 = Static435.method5705(arg0);
		if (local3 == null) {
			return;
		}
		@Pc(9) int local9 = arg0 >>> 16;
		@Pc(13) Class156[] local13 = Static111.aClass156ArrayArray1[local9];
		if (local13 == null) {
			@Pc(19) Class156[] local19 = Static178.aClass156ArrayArray2[local9];
			@Pc(22) int local22 = local19.length;
			local13 = Static111.aClass156ArrayArray1[local9] = new Class156[local22];
			Static462.method4614(local19, 0, local13, 0, local19.length);
		}
		@Pc(38) int local38;
		for (local38 = 0; local38 < local13.length && local13[local38] != local3; local38++) {
		}
		if (local38 >= local13.length) {
			return;
		}
		Static462.method4614(local13, local38 + 1, local13, local38, local13.length - local38 - 1);
		local13[local13.length - 1] = local3;
	}

	@OriginalMember(owner = "client!of", name = "a", descriptor = "(Lclient!ne;)V")
	public static void method4059(@OriginalArg(0) Class3_Sub31 arg0) {
		method4055(arg0, 200000);
	}

	@OriginalMember(owner = "client!of", name = "b", descriptor = "()V")
	public static void method4060() {
	}

	@OriginalMember(owner = "client!of", name = "c", descriptor = "(IZ)V")
	private static void method4061(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1) {
		@Pc(157) int local157;
		@Pc(1313) boolean local1313;
		@Pc(89) int local89;
		@Pc(75) String local75;
		@Pc(192) int local192;
		@Pc(95) int local95;
		@Pc(81) String local81;
		if (arg0 < 5100) {
			if (arg0 == 5000) {
				anIntArray349[anInt5192++] = Static1.anInt23;
				return;
			}
			if (arg0 == 5001) {
				anInt5192 -= 3;
				Static1.anInt23 = anIntArray349[anInt5192];
				Static86.aClass77_2 = Static36.method726(anIntArray349[anInt5192 + 1]);
				if (Static86.aClass77_2 == null) {
					Static86.aClass77_2 = Static419.aClass77_4;
				}
				Static53.anInt1459 = anIntArray349[anInt5192 + 2];
				Static30.method641(Static69.aClass217_33);
				Static302.aClass3_Sub7_Sub1_2.method2628(Static1.anInt23);
				Static302.aClass3_Sub7_Sub1_2.method2628(Static86.aClass77_2.anInt2451);
				Static302.aClass3_Sub7_Sub1_2.method2628(Static53.anInt1459);
				return;
			}
			if (arg0 == 5002) {
				anInt5202 -= 2;
				local75 = aStringArray39[anInt5202];
				local81 = aStringArray39[anInt5202 + 1];
				anInt5192 -= 2;
				local89 = anIntArray349[anInt5192];
				local95 = anIntArray349[anInt5192 + 1];
				if (local81 == null) {
					local81 = "";
				}
				if (local81.length() > 80) {
					local81 = local81.substring(0, 80);
				}
				Static30.method641(Static54.aClass217_25);
				Static302.aClass3_Sub7_Sub1_2.method2628(Static24.method582(local75) + Static24.method582(local81) + 2);
				Static302.aClass3_Sub7_Sub1_2.method2608(local75);
				Static302.aClass3_Sub7_Sub1_2.method2628(local89 - 1);
				Static302.aClass3_Sub7_Sub1_2.method2628(local95);
				Static302.aClass3_Sub7_Sub1_2.method2608(local81);
				return;
			}
			if (arg0 == 5003) {
				local157 = anIntArray349[--anInt5192];
				local81 = null;
				if (local157 < 100) {
					local81 = Static125.aStringArray24[local157];
				}
				if (local81 == null) {
					local81 = "";
				}
				aStringArray39[anInt5202++] = local81;
				return;
			}
			if (arg0 == 5004) {
				local157 = anIntArray349[--anInt5192];
				local192 = -1;
				if (local157 < 100 && Static125.aStringArray24[local157] != null) {
					local192 = Static384.anIntArray409[local157];
				}
				anIntArray349[anInt5192++] = local192;
				return;
			}
			if (arg0 == 5005) {
				if (Static86.aClass77_2 == null) {
					anIntArray349[anInt5192++] = -1;
					return;
				}
				anIntArray349[anInt5192++] = Static86.aClass77_2.anInt2451;
				return;
			}
			if (arg0 == 5008 || arg0 == 5021 || arg0 == 5022) {
				local75 = aStringArray39[--anInt5202];
				method4049(local75, arg0);
				return;
			}
			if (arg0 == 5009) {
				anInt5202 -= 2;
				local75 = aStringArray39[anInt5202];
				local81 = aStringArray39[anInt5202 + 1];
				if (Static190.anInt3803 != 0 || (!Static388.aBoolean561 || Static331.aBoolean651) && !Static338.aBoolean492) {
					Static30.method641(Static127.aClass217_48);
					Static302.aClass3_Sub7_Sub1_2.method2628(0);
					local89 = Static302.aClass3_Sub7_Sub1_2.anInt3235;
					Static302.aClass3_Sub7_Sub1_2.method2608(local75);
					Static296.method4143(local81, Static302.aClass3_Sub7_Sub1_2);
					Static302.aClass3_Sub7_Sub1_2.method2629(Static302.aClass3_Sub7_Sub1_2.anInt3235 - local89);
					return;
				}
				return;
			}
			if (arg0 == 5010) {
				local157 = anIntArray349[--anInt5192];
				local81 = null;
				if (local157 < 100) {
					local81 = Static8.aStringArray44[local157];
				}
				if (local81 == null) {
					local81 = "";
				}
				aStringArray39[anInt5202++] = local81;
				return;
			}
			if (arg0 == 5011) {
				local157 = anIntArray349[--anInt5192];
				local81 = null;
				if (local157 < 100) {
					local81 = Static284.aStringArray37[local157];
				}
				if (local81 == null) {
					local81 = "";
				}
				aStringArray39[anInt5202++] = local81;
				return;
			}
			if (arg0 == 5012) {
				local157 = anIntArray349[--anInt5192];
				local192 = -1;
				if (local157 < 100) {
					local192 = Static277.anIntArray345[local157];
				}
				anIntArray349[anInt5192++] = local192;
				return;
			}
			if (arg0 == 5015) {
				if (Static379.aClass7_Sub2_Sub3_Sub2_2 == null || Static379.aClass7_Sub2_Sub3_Sub2_2.aString37 == null) {
					local75 = Static2.aString1;
				} else {
					local75 = Static379.aClass7_Sub2_Sub3_Sub2_2.method3525();
				}
				aStringArray39[anInt5202++] = local75;
				return;
			}
			if (arg0 == 5016) {
				anIntArray349[anInt5192++] = Static53.anInt1459;
				return;
			}
			if (arg0 == 5017) {
				anIntArray349[anInt5192++] = Static84.anInt2097;
				return;
			}
			if (arg0 == 5018) {
				local157 = anIntArray349[--anInt5192];
				local192 = 0;
				if (local157 < 100 && Static125.aStringArray24[local157] != null) {
					local192 = Static384.anIntArray409[local157];
				}
				anIntArray349[anInt5192++] = local192;
				return;
			}
			if (arg0 == 5019) {
				local157 = anIntArray349[--anInt5192];
				local81 = null;
				if (local157 < 100) {
					local81 = Static75.aStringArray15[local157];
				}
				if (local81 == null) {
					local81 = "";
				}
				aStringArray39[anInt5202++] = local81;
				return;
			}
			if (arg0 == 5020) {
				if (Static379.aClass7_Sub2_Sub3_Sub2_2 == null || Static379.aClass7_Sub2_Sub3_Sub2_2.aString37 == null) {
					local75 = Static2.aString1;
				} else {
					local75 = Static379.aClass7_Sub2_Sub3_Sub2_2.method3522();
				}
				aStringArray39[anInt5202++] = local75;
				return;
			}
			if (arg0 == 5050) {
				local157 = anIntArray349[--anInt5192];
				aStringArray39[anInt5202++] = Static225.aClass38_1.method866(local157).aString55;
				return;
			}
			@Pc(589) Class3_Sub4_Sub13 local589;
			if (arg0 == 5051) {
				local157 = anIntArray349[--anInt5192];
				local589 = Static225.aClass38_1.method866(local157);
				if (local589.anIntArray388 == null) {
					anIntArray349[anInt5192++] = 0;
					return;
				}
				anIntArray349[anInt5192++] = local589.anIntArray388.length;
				return;
			}
			if (arg0 == 5052) {
				anInt5192 -= 2;
				local157 = anIntArray349[anInt5192];
				local192 = anIntArray349[anInt5192 + 1];
				@Pc(634) Class3_Sub4_Sub13 local634 = Static225.aClass38_1.method866(local157);
				local95 = local634.anIntArray388[local192];
				anIntArray349[anInt5192++] = local95;
				return;
			}
			if (arg0 == 5053) {
				local157 = anIntArray349[--anInt5192];
				local589 = Static225.aClass38_1.method866(local157);
				if (local589.anIntArray390 == null) {
					anIntArray349[anInt5192++] = 0;
					return;
				}
				anIntArray349[anInt5192++] = local589.anIntArray390.length;
				return;
			}
			if (arg0 == 5054) {
				anInt5192 -= 2;
				local157 = anIntArray349[anInt5192];
				local192 = anIntArray349[anInt5192 + 1];
				anIntArray349[anInt5192++] = Static225.aClass38_1.method866(local157).anIntArray390[local192];
				return;
			}
			if (arg0 == 5055) {
				local157 = anIntArray349[--anInt5192];
				aStringArray39[anInt5202++] = Static104.aClass262_1.method5748(local157).method5181();
				return;
			}
			if (arg0 == 5056) {
				local157 = anIntArray349[--anInt5192];
				@Pc(760) Class3_Sub4_Sub15 local760 = Static104.aClass262_1.method5748(local157);
				if (local760.anIntArray449 == null) {
					anIntArray349[anInt5192++] = 0;
					return;
				}
				anIntArray349[anInt5192++] = local760.anIntArray449.length;
				return;
			}
			if (arg0 == 5057) {
				anInt5192 -= 2;
				local157 = anIntArray349[anInt5192];
				local192 = anIntArray349[anInt5192 + 1];
				anIntArray349[anInt5192++] = Static104.aClass262_1.method5748(local157).anIntArray449[local192];
				return;
			}
			if (arg0 == 5058) {
				aClass27_1 = new Class27();
				aClass27_1.anInt1018 = anIntArray349[--anInt5192];
				aClass27_1.aClass3_Sub4_Sub15_1 = Static104.aClass262_1.method5748(aClass27_1.anInt1018);
				aClass27_1.anIntArray76 = new int[aClass27_1.aClass3_Sub4_Sub15_1.method5177()];
				return;
			}
			if (arg0 == 5059) {
				Static30.method641(Static261.aClass217_17);
				Static302.aClass3_Sub7_Sub1_2.method2628(0);
				local157 = Static302.aClass3_Sub7_Sub1_2.anInt3235;
				Static302.aClass3_Sub7_Sub1_2.method2628(0);
				Static302.aClass3_Sub7_Sub1_2.method2613(aClass27_1.anInt1018);
				aClass27_1.aClass3_Sub4_Sub15_1.method5186(Static302.aClass3_Sub7_Sub1_2, aClass27_1.anIntArray76);
				Static302.aClass3_Sub7_Sub1_2.method2629(Static302.aClass3_Sub7_Sub1_2.anInt3235 - local157);
				return;
			}
			if (arg0 == 5060) {
				local75 = aStringArray39[--anInt5202];
				Static30.method641(Static409.aClass217_103);
				Static302.aClass3_Sub7_Sub1_2.method2628(0);
				local192 = Static302.aClass3_Sub7_Sub1_2.anInt3235;
				Static302.aClass3_Sub7_Sub1_2.method2608(local75);
				Static302.aClass3_Sub7_Sub1_2.method2613(aClass27_1.anInt1018);
				aClass27_1.aClass3_Sub4_Sub15_1.method5186(Static302.aClass3_Sub7_Sub1_2, aClass27_1.anIntArray76);
				Static302.aClass3_Sub7_Sub1_2.method2629(Static302.aClass3_Sub7_Sub1_2.anInt3235 - local192);
				return;
			}
			if (arg0 == 5061) {
				Static30.method641(Static261.aClass217_17);
				Static302.aClass3_Sub7_Sub1_2.method2628(0);
				local157 = Static302.aClass3_Sub7_Sub1_2.anInt3235;
				Static302.aClass3_Sub7_Sub1_2.method2628(1);
				Static302.aClass3_Sub7_Sub1_2.method2613(aClass27_1.anInt1018);
				aClass27_1.aClass3_Sub4_Sub15_1.method5186(Static302.aClass3_Sub7_Sub1_2, aClass27_1.anIntArray76);
				Static302.aClass3_Sub7_Sub1_2.method2629(Static302.aClass3_Sub7_Sub1_2.anInt3235 - local157);
				return;
			}
			if (arg0 == 5062) {
				anInt5192 -= 2;
				local157 = anIntArray349[anInt5192];
				local192 = anIntArray349[anInt5192 + 1];
				anIntArray349[anInt5192++] = Static225.aClass38_1.method866(local157).aCharArray5[local192];
				return;
			}
			if (arg0 == 5063) {
				anInt5192 -= 2;
				local157 = anIntArray349[anInt5192];
				local192 = anIntArray349[anInt5192 + 1];
				anIntArray349[anInt5192++] = Static225.aClass38_1.method866(local157).aCharArray6[local192];
				return;
			}
			if (arg0 == 5064) {
				anInt5192 -= 2;
				local157 = anIntArray349[anInt5192];
				local192 = anIntArray349[anInt5192 + 1];
				if (local192 == -1) {
					anIntArray349[anInt5192++] = -1;
					return;
				}
				anIntArray349[anInt5192++] = Static225.aClass38_1.method866(local157).method4603((char) local192);
				return;
			}
			if (arg0 == 5065) {
				anInt5192 -= 2;
				local157 = anIntArray349[anInt5192];
				local192 = anIntArray349[anInt5192 + 1];
				if (local192 == -1) {
					anIntArray349[anInt5192++] = -1;
					return;
				}
				anIntArray349[anInt5192++] = Static225.aClass38_1.method866(local157).method4607((char) local192);
				return;
			}
			if (arg0 == 5066) {
				local157 = anIntArray349[--anInt5192];
				anIntArray349[anInt5192++] = Static104.aClass262_1.method5748(local157).method5177();
				return;
			}
			if (arg0 == 5067) {
				anInt5192 -= 2;
				local157 = anIntArray349[anInt5192];
				local192 = anIntArray349[anInt5192 + 1];
				local89 = Static104.aClass262_1.method5748(local157).method5185(local192).anInt2100;
				anIntArray349[anInt5192++] = local89;
				return;
			}
			if (arg0 == 5068) {
				anInt5192 -= 2;
				local157 = anIntArray349[anInt5192];
				local192 = anIntArray349[anInt5192 + 1];
				aClass27_1.anIntArray76[local157] = local192;
				return;
			}
			if (arg0 == 5069) {
				anInt5192 -= 2;
				local157 = anIntArray349[anInt5192];
				local192 = anIntArray349[anInt5192 + 1];
				aClass27_1.anIntArray76[local157] = local192;
				return;
			}
			if (arg0 == 5070) {
				anInt5192 -= 3;
				local157 = anIntArray349[anInt5192];
				local192 = anIntArray349[anInt5192 + 1];
				local89 = anIntArray349[anInt5192 + 2];
				@Pc(1265) Class3_Sub4_Sub15 local1265 = Static104.aClass262_1.method5748(local157);
				if (local1265.method5185(local192).anInt2100 != 0) {
					throw new RuntimeException("bad command");
				}
				anIntArray349[anInt5192++] = local1265.method5179(local89, local192);
				return;
			}
			if (arg0 == 5071) {
				local75 = aStringArray39[--anInt5202];
				local1313 = anIntArray349[--anInt5192] == 1;
				Static411.method5289(local75, local1313);
				anIntArray349[anInt5192++] = Static36.anInt1022;
				return;
			}
			if (arg0 == 5072) {
				if (Static226.aShortArray66 != null && Static390.anInt6521 < Static36.anInt1022) {
					anIntArray349[anInt5192++] = Static226.aShortArray66[Static390.anInt6521++] & 0xFFFF;
					return;
				}
				anIntArray349[anInt5192++] = -1;
				return;
			}
			if (arg0 == 5073) {
				Static390.anInt6521 = 0;
				return;
			}
			if (arg0 == 5074) {
				Static30.method641(Static261.aClass217_17);
				Static302.aClass3_Sub7_Sub1_2.method2628(0);
				local157 = Static302.aClass3_Sub7_Sub1_2.anInt3235;
				Static302.aClass3_Sub7_Sub1_2.method2628(2);
				Static302.aClass3_Sub7_Sub1_2.method2613(aClass27_1.anInt1018);
				aClass27_1.aClass3_Sub4_Sub15_1.method5186(Static302.aClass3_Sub7_Sub1_2, aClass27_1.anIntArray76);
				Static302.aClass3_Sub7_Sub1_2.method2629(Static302.aClass3_Sub7_Sub1_2.anInt3235 - local157);
				return;
			}
		} else if (arg0 < 5200) {
			if (arg0 == 5100) {
				if (Static263.aClass10_1.method301(86)) {
					anIntArray349[anInt5192++] = 1;
					return;
				}
				anIntArray349[anInt5192++] = 0;
				return;
			}
			if (arg0 == 5101) {
				if (Static263.aClass10_1.method301(82)) {
					anIntArray349[anInt5192++] = 1;
					return;
				}
				anIntArray349[anInt5192++] = 0;
				return;
			}
			if (arg0 == 5102) {
				if (Static263.aClass10_1.method301(81)) {
					anIntArray349[anInt5192++] = 1;
					return;
				}
				anIntArray349[anInt5192++] = 0;
				return;
			}
		} else {
			@Pc(2691) int local2691;
			@Pc(1965) boolean local1965;
			if (arg0 < 5300) {
				if (arg0 == 5200) {
					Static213.method3266(anIntArray349[--anInt5192]);
					return;
				}
				if (arg0 == 5201) {
					anIntArray349[anInt5192++] = Static330.method4451();
					return;
				}
				if (arg0 == 5205) {
					Static419.method5367(-1, -1, false, anIntArray349[--anInt5192]);
					return;
				}
				@Pc(1554) Class3_Sub4_Sub8 local1554;
				if (arg0 == 5206) {
					local157 = anIntArray349[--anInt5192];
					local1554 = Static144.method4248(local157 >> 14 & 0x3FFF, local157 & 0x3FFF);
					if (local1554 == null) {
						anIntArray349[anInt5192++] = -1;
						return;
					}
					anIntArray349[anInt5192++] = local1554.anInt2260;
					return;
				}
				@Pc(1587) Class3_Sub4_Sub8 local1587;
				if (arg0 == 5207) {
					local1587 = Static144.method4244(anIntArray349[--anInt5192]);
					if (local1587 != null && local1587.aString14 != null) {
						aStringArray39[anInt5202++] = local1587.aString14;
						return;
					}
					aStringArray39[anInt5202++] = "";
					return;
				}
				if (arg0 == 5208) {
					anIntArray349[anInt5192++] = Static175.anInt7347;
					anIntArray349[anInt5192++] = Static240.anInt4579;
					return;
				}
				if (arg0 == 5209) {
					anIntArray349[anInt5192++] = Static411.anInt6760 + Static144.anInt5410;
					anIntArray349[anInt5192++] = Static76.anInt1937 + Static144.anInt5420;
					return;
				}
				if (arg0 == 5210) {
					local157 = anIntArray349[--anInt5192];
					local1554 = Static144.method4244(local157);
					if (local1554 == null) {
						anIntArray349[anInt5192++] = 0;
						anIntArray349[anInt5192++] = 0;
						return;
					}
					anIntArray349[anInt5192++] = local1554.anInt2257 >> 14 & 0x3FFF;
					anIntArray349[anInt5192++] = local1554.anInt2257 & 0x3FFF;
					return;
				}
				if (arg0 == 5211) {
					local157 = anIntArray349[--anInt5192];
					local1554 = Static144.method4244(local157);
					if (local1554 == null) {
						anIntArray349[anInt5192++] = 0;
						anIntArray349[anInt5192++] = 0;
						return;
					}
					anIntArray349[anInt5192++] = local1554.anInt2261 - local1554.anInt2255;
					anIntArray349[anInt5192++] = local1554.anInt2252 - local1554.anInt2266;
					return;
				}
				@Pc(1777) Class3_Sub26 local1777;
				if (arg0 == 5212) {
					local1777 = Static79.method4480();
					if (local1777 == null) {
						anIntArray349[anInt5192++] = -1;
						anIntArray349[anInt5192++] = -1;
						return;
					}
					anIntArray349[anInt5192++] = local1777.anInt3892;
					local192 = local1777.anInt3894 << 28 | local1777.anInt3895 + Static144.anInt5410 << 14 | local1777.anInt3891 + Static144.anInt5420;
					anIntArray349[anInt5192++] = local192;
					return;
				}
				if (arg0 == 5213) {
					local1777 = Static155.method2516();
					if (local1777 == null) {
						anIntArray349[anInt5192++] = -1;
						anIntArray349[anInt5192++] = -1;
						return;
					}
					anIntArray349[anInt5192++] = local1777.anInt3892;
					local192 = local1777.anInt3894 << 28 | local1777.anInt3895 + Static144.anInt5410 << 14 | local1777.anInt3891 + Static144.anInt5420;
					anIntArray349[anInt5192++] = local192;
					return;
				}
				@Pc(1925) boolean local1925;
				if (arg0 == 5214) {
					local157 = anIntArray349[--anInt5192];
					local1554 = Static51.method1058();
					if (local1554 != null) {
						local1925 = local1554.method1749(local157 >> 14 & 0x3FFF, local157 & 0x3FFF, anIntArray352, local157 >> 28 & 0x3);
						if (local1925) {
							Static166.method2720(anIntArray352[1], anIntArray352[2]);
						}
					}
					return;
				}
				if (arg0 == 5215) {
					anInt5192 -= 2;
					local157 = anIntArray349[anInt5192];
					local192 = anIntArray349[anInt5192 + 1];
					@Pc(1963) Class244 local1963 = Static144.method4240(local157 >> 14 & 0x3FFF, local157 & 0x3FFF);
					local1965 = false;
					for (@Pc(1970) Class3_Sub4_Sub8 local1970 = (Class3_Sub4_Sub8) local1963.method5240(); local1970 != null; local1970 = (Class3_Sub4_Sub8) local1963.method5232()) {
						if (local1970.anInt2260 == local192) {
							local1965 = true;
							break;
						}
					}
					if (local1965) {
						anIntArray349[anInt5192++] = 1;
						return;
					}
					anIntArray349[anInt5192++] = 0;
					return;
				}
				if (arg0 == 5218) {
					local157 = anIntArray349[--anInt5192];
					local1554 = Static144.method4244(local157);
					if (local1554 == null) {
						anIntArray349[anInt5192++] = -1;
						return;
					}
					anIntArray349[anInt5192++] = local1554.anInt2262;
					return;
				}
				if (arg0 == 5220) {
					anIntArray349[anInt5192++] = Static66.anInt1702 == 100 ? 1 : 0;
					return;
				}
				if (arg0 == 5221) {
					local157 = anIntArray349[--anInt5192];
					Static166.method2720(local157 >> 14 & 0x3FFF, local157 & 0x3FFF);
					return;
				}
				if (arg0 == 5222) {
					local1587 = Static51.method1058();
					if (local1587 != null) {
						local1313 = local1587.method1742(anIntArray352, Static76.anInt1937 + Static144.anInt5420, Static411.anInt6760 + Static144.anInt5410);
						if (local1313) {
							anIntArray349[anInt5192++] = anIntArray352[1];
							anIntArray349[anInt5192++] = anIntArray352[2];
							return;
						}
						anIntArray349[anInt5192++] = -1;
						anIntArray349[anInt5192++] = -1;
						return;
					}
					anIntArray349[anInt5192++] = -1;
					anIntArray349[anInt5192++] = -1;
					return;
				}
				if (arg0 == 5223) {
					anInt5192 -= 2;
					local157 = anIntArray349[anInt5192];
					local192 = anIntArray349[anInt5192 + 1];
					Static419.method5367(local192 >> 14 & 0x3FFF, local192 & 0x3FFF, false, local157);
					return;
				}
				if (arg0 == 5224) {
					local157 = anIntArray349[--anInt5192];
					local1554 = Static51.method1058();
					if (local1554 != null) {
						local1925 = local1554.method1749(local157 >> 14 & 0x3FFF, local157 & 0x3FFF, anIntArray352, local157 >> 28 & 0x3);
						if (local1925) {
							anIntArray349[anInt5192++] = anIntArray352[1];
							anIntArray349[anInt5192++] = anIntArray352[2];
							return;
						}
						anIntArray349[anInt5192++] = -1;
						anIntArray349[anInt5192++] = -1;
						return;
					}
					anIntArray349[anInt5192++] = -1;
					anIntArray349[anInt5192++] = -1;
					return;
				}
				if (arg0 == 5225) {
					local157 = anIntArray349[--anInt5192];
					local1554 = Static51.method1058();
					if (local1554 != null) {
						local1925 = local1554.method1742(anIntArray352, local157 & 0x3FFF, local157 >> 14 & 0x3FFF);
						if (local1925) {
							anIntArray349[anInt5192++] = anIntArray352[1];
							anIntArray349[anInt5192++] = anIntArray352[2];
							return;
						}
						anIntArray349[anInt5192++] = -1;
						anIntArray349[anInt5192++] = -1;
						return;
					}
					anIntArray349[anInt5192++] = -1;
					anIntArray349[anInt5192++] = -1;
					return;
				}
				if (arg0 == 5226) {
					Static74.method1473(anIntArray349[--anInt5192]);
					return;
				}
				if (arg0 == 5227) {
					anInt5192 -= 2;
					local157 = anIntArray349[anInt5192];
					local192 = anIntArray349[anInt5192 + 1];
					Static419.method5367(local192 >> 14 & 0x3FFF, local192 & 0x3FFF, true, local157);
					return;
				}
				if (arg0 == 5228) {
					Static268.aBoolean445 = anIntArray349[--anInt5192] == 1;
					return;
				}
				if (arg0 == 5229) {
					anIntArray349[anInt5192++] = Static268.aBoolean445 ? 1 : 0;
					return;
				}
				if (arg0 == 5230) {
					local157 = anIntArray349[--anInt5192];
					Static444.method5851(local157);
					return;
				}
				@Pc(2483) Class3 local2483;
				if (arg0 == 5231) {
					anInt5192 -= 2;
					local157 = anIntArray349[anInt5192];
					local1313 = anIntArray349[anInt5192 + 1] == 1;
					if (Static286.aClass11_6 != null) {
						local2483 = Static286.aClass11_6.method324((long) local157);
						if (local2483 != null && !local1313) {
							local2483.method5977();
							return;
						}
						if (local2483 == null && local1313) {
							local2483 = new Class3();
							Static286.aClass11_6.method319(local2483, (long) local157);
						}
					}
					return;
				}
				@Pc(2525) Class3 local2525;
				if (arg0 == 5232) {
					local157 = anIntArray349[--anInt5192];
					if (Static286.aClass11_6 != null) {
						local2525 = Static286.aClass11_6.method324((long) local157);
						anIntArray349[anInt5192++] = local2525 == null ? 0 : 1;
						return;
					}
					anIntArray349[anInt5192++] = 0;
					return;
				}
				if (arg0 == 5233) {
					anInt5192 -= 2;
					local157 = anIntArray349[anInt5192];
					local1313 = anIntArray349[anInt5192 + 1] == 1;
					if (Static177.aClass11_21 != null) {
						local2483 = Static177.aClass11_21.method324((long) local157);
						if (local2483 != null && !local1313) {
							local2483.method5977();
							return;
						}
						if (local2483 == null && local1313) {
							local2483 = new Class3();
							Static177.aClass11_21.method319(local2483, (long) local157);
						}
					}
					return;
				}
				if (arg0 == 5234) {
					local157 = anIntArray349[--anInt5192];
					if (Static177.aClass11_21 != null) {
						local2525 = Static177.aClass11_21.method324((long) local157);
						anIntArray349[anInt5192++] = local2525 == null ? 0 : 1;
						return;
					}
					anIntArray349[anInt5192++] = 0;
					return;
				}
				if (arg0 == 5235) {
					anIntArray349[anInt5192++] = Static144.aClass3_Sub4_Sub8_5 == null ? -1 : Static144.aClass3_Sub4_Sub8_5.anInt2260;
					return;
				}
				if (arg0 == 5236) {
					anInt5192 -= 2;
					local157 = anIntArray349[anInt5192];
					local192 = anIntArray349[anInt5192 + 1];
					local89 = local192 >> 14 & 0x3FFF;
					local95 = local192 & 0x3FFF;
					local2691 = Static326.method4412(local89, local157, local95);
					if (local2691 < 0) {
						anIntArray349[anInt5192++] = -1;
						return;
					}
					anIntArray349[anInt5192++] = local2691;
					return;
				}
			} else if (arg0 < 5400) {
				if (arg0 == 5300) {
					anInt5192 -= 2;
					local157 = anIntArray349[anInt5192];
					local192 = anIntArray349[anInt5192 + 1];
					Static387.method5031(3, local192, local157, false);
					anIntArray349[anInt5192++] = Static438.aFrame2 == null ? 0 : 1;
					return;
				}
				if (arg0 == 5301) {
					if (Static438.aFrame2 != null) {
						Static387.method5031(Static374.aClass20_Sub1_1.anInt2353, -1, -1, false);
					}
					return;
				}
				if (arg0 == 5302) {
					@Pc(2769) Class136[] local2769 = Static432.method5645();
					anIntArray349[anInt5192++] = local2769.length;
					return;
				}
				if (arg0 == 5303) {
					local157 = anIntArray349[--anInt5192];
					@Pc(2793) Class136[] local2793 = Static432.method5645();
					anIntArray349[anInt5192++] = local2793[local157].anInt4114;
					anIntArray349[anInt5192++] = local2793[local157].anInt4110;
					return;
				}
				if (arg0 == 5305) {
					local157 = Static374.aClass20_Sub1_1.anInt2344;
					local192 = Static374.aClass20_Sub1_1.anInt2359;
					local89 = -1;
					@Pc(2830) Class136[] local2830 = Static432.method5645();
					for (local2691 = 0; local2691 < local2830.length; local2691++) {
						@Pc(2837) Class136 local2837 = local2830[local2691];
						if (local2837.anInt4114 == local157 && local2837.anInt4110 == local192) {
							local89 = local2691;
							break;
						}
					}
					anIntArray349[anInt5192++] = local89;
					return;
				}
				if (arg0 == 5306) {
					anIntArray349[anInt5192++] = Static391.method5269();
					return;
				}
				if (arg0 == 5307) {
					local157 = anIntArray349[--anInt5192];
					if (local157 >= 1 && local157 <= 2) {
						Static387.method5031(local157, -1, -1, false);
						return;
					}
					return;
				}
				if (arg0 == 5308) {
					anIntArray349[anInt5192++] = Static374.aClass20_Sub1_1.anInt2353;
					return;
				}
				if (arg0 == 5309) {
					local157 = anIntArray349[--anInt5192];
					if (local157 >= 1 && local157 <= 2) {
						Static374.aClass20_Sub1_1.anInt2353 = local157;
						Static374.aClass20_Sub1_1.method1818(Static66.aClass143_2);
						return;
					}
					return;
				}
			} else {
				@Pc(3345) String local3345;
				if (arg0 < 5500) {
					if (arg0 == 5400) {
						anInt5202 -= 2;
						local75 = aStringArray39[anInt5202];
						local81 = aStringArray39[anInt5202 + 1];
						local89 = anIntArray349[--anInt5192];
						Static30.method641(Static316.aClass217_87);
						Static302.aClass3_Sub7_Sub1_2.method2628(Static24.method582(local75) + Static24.method582(local81) + 1);
						Static302.aClass3_Sub7_Sub1_2.method2608(local75);
						Static302.aClass3_Sub7_Sub1_2.method2608(local81);
						Static302.aClass3_Sub7_Sub1_2.method2628(local89);
						return;
					}
					if (arg0 == 5401) {
						anInt5192 -= 2;
						Static6.aShortArray1[anIntArray349[anInt5192]] = (short) Static406.method5237(anIntArray349[anInt5192 + 1]);
						Static314.aClass12_2.method338();
						Static314.aClass12_2.method330();
						Static364.aClass96_2.method2200();
						Static36.method725();
						return;
					}
					if (arg0 == 5405) {
						anInt5192 -= 2;
						local157 = anIntArray349[anInt5192];
						local192 = anIntArray349[anInt5192 + 1];
						if (local157 >= 0 && local157 < 2) {
							Static431.anIntArrayArrayArray14[local157] = new int[local192 << 1][4];
						}
						return;
					}
					if (arg0 == 5406) {
						anInt5192 -= 7;
						local157 = anIntArray349[anInt5192];
						local192 = anIntArray349[anInt5192 + 1] << 1;
						local89 = anIntArray349[anInt5192 + 2];
						local95 = anIntArray349[anInt5192 + 3];
						local2691 = anIntArray349[anInt5192 + 4];
						@Pc(3105) int local3105 = anIntArray349[anInt5192 + 5];
						@Pc(3111) int local3111 = anIntArray349[anInt5192 + 6];
						if (local157 >= 0 && local157 < 2 && Static431.anIntArrayArrayArray14[local157] != null && local192 >= 0 && local192 < Static431.anIntArrayArrayArray14[local157].length) {
							Static431.anIntArrayArrayArray14[local157][local192] = new int[] { (local89 >> 14 & 0x3FFF) << 7, local95, (local89 & 0x3FFF) << 7, local3111 };
							Static431.anIntArrayArrayArray14[local157][local192 + 1] = new int[] { (local2691 >> 14 & 0x3FFF) << 7, local3105, (local2691 & 0x3FFF) << 7 };
						}
						return;
					}
					if (arg0 == 5407) {
						local157 = Static431.anIntArrayArrayArray14[anIntArray349[--anInt5192]].length >> 1;
						anIntArray349[anInt5192++] = local157;
						return;
					}
					if (arg0 == 5411) {
						if (Static438.aFrame2 != null) {
							Static387.method5031(Static374.aClass20_Sub1_1.anInt2353, -1, -1, false);
						}
						if (Static10.aFrame1 != null) {
							Static40.method775();
							System.exit(0);
							return;
						}
						local75 = Static57.aString45 == null ? Static45.method846() : Static57.aString45;
						Static174.method2794(false, Static105.anInt2382 == 1, Static66.aClass143_2, local75);
						return;
					}
					if (arg0 == 5419) {
						local75 = "";
						if (Static126.aClass43_4 != null) {
							if (Static126.aClass43_4.anObject3 == null) {
								local75 = Static389.method5056(Static126.aClass43_4.anInt1523);
							} else {
								local75 = (String) Static126.aClass43_4.anObject3;
							}
						}
						aStringArray39[anInt5202++] = local75;
						return;
					}
					if (arg0 == 5420) {
						anIntArray349[anInt5192++] = Static227.anInt4227 == 3 ? 1 : 0;
						return;
					}
					if (arg0 == 5421) {
						if (Static438.aFrame2 != null) {
							Static387.method5031(Static374.aClass20_Sub1_1.anInt2353, -1, -1, false);
						}
						local75 = aStringArray39[--anInt5202];
						local1313 = anIntArray349[--anInt5192] == 1;
						local3345 = Static45.method846() + local75;
						Static174.method2794(local1313, Static105.anInt2382 == 1, Static66.aClass143_2, local3345);
						return;
					}
					if (arg0 == 5422) {
						anInt5202 -= 2;
						local75 = aStringArray39[anInt5202];
						local81 = aStringArray39[anInt5202 + 1];
						local89 = anIntArray349[--anInt5192];
						if (local75.length() > 0) {
							if (Static95.aStringArray20 == null) {
								Static95.aStringArray20 = new String[Static228.anIntArray279[Static57.aClass183_3.anInt5280]];
							}
							Static95.aStringArray20[local89] = local75;
						}
						if (local81.length() > 0) {
							if (Static433.aStringArray50 == null) {
								Static433.aStringArray50 = new String[Static228.anIntArray279[Static57.aClass183_3.anInt5280]];
							}
							Static433.aStringArray50[local89] = local81;
						}
						return;
					}
					if (arg0 == 5423) {
						System.out.println(aStringArray39[--anInt5202]);
						return;
					}
					if (arg0 == 5424) {
						anInt5192 -= 11;
						Static388.anInt6485 = anIntArray349[anInt5192];
						Static447.anInt7574 = anIntArray349[anInt5192 + 1];
						Static284.anInt5187 = anIntArray349[anInt5192 + 2];
						Static122.anInt2613 = anIntArray349[anInt5192 + 3];
						Static377.anInt6349 = anIntArray349[anInt5192 + 4];
						Static409.anInt6740 = anIntArray349[anInt5192 + 5];
						Static272.anInt6023 = anIntArray349[anInt5192 + 6];
						Static280.anInt5132 = anIntArray349[anInt5192 + 7];
						Static178.anInt3546 = anIntArray349[anInt5192 + 8];
						Static421.anInt6878 = anIntArray349[anInt5192 + 9];
						Static43.anInt1145 = anIntArray349[anInt5192 + 10];
						Static405.aClass32_82.method800(Static377.anInt6349);
						Static405.aClass32_82.method800(Static409.anInt6740);
						Static405.aClass32_82.method800(Static272.anInt6023);
						Static405.aClass32_82.method800(Static280.anInt5132);
						Static405.aClass32_82.method800(Static178.anInt3546);
						Static258.aClass8_19 = null;
						Static156.aClass8_11 = null;
						Static405.aClass8_26 = null;
						Static335.aClass8_10 = null;
						Static302.aClass8_22 = null;
						Static355.aClass8_24 = null;
						Static64.aClass8_4 = null;
						Static8.aClass8_23 = null;
						Static378.aBoolean550 = true;
						return;
					}
					if (arg0 == 5425) {
						Static345.method5809();
						Static378.aBoolean550 = false;
						return;
					}
					if (arg0 == 5426) {
						anInt5192 -= 2;
						Static58.anInt1564 = anIntArray349[anInt5192];
						Static366.anInt6171 = anIntArray349[anInt5192 + 1];
						return;
					}
					if (arg0 == 5427) {
						anInt5192 -= 2;
						Static103.anInt2338 = anIntArray349[anInt5192 + 1];
						return;
					}
					if (arg0 == 5428) {
						anInt5192 -= 2;
						local157 = anIntArray349[anInt5192];
						local192 = anIntArray349[anInt5192 + 1];
						anIntArray349[anInt5192++] = Static59.method2634(local157, local192) ? 1 : 0;
						return;
					}
					if (arg0 == 5429) {
						Static392.method5076(aStringArray39[--anInt5202], false);
						return;
					}
					if (arg0 == 5430) {
						try {
							Static456.method852("accountcreated", Static66.aClass143_2.anApplet1);
							return;
						} catch (@Pc(3639) Throwable local3639) {
							return;
						}
					}
				} else if (arg0 < 5600) {
					if (arg0 == 5500) {
						anInt5192 -= 4;
						local157 = anIntArray349[anInt5192];
						local192 = anIntArray349[anInt5192 + 1];
						local89 = anIntArray349[anInt5192 + 2];
						local95 = anIntArray349[anInt5192 + 3];
						Static129.method2030(local192, local89, local95, (local157 >> 14 & 0x3FFF) - Static223.anInt7618, false, (local157 & 0x3FFF) - Static57.anInt5085);
						return;
					}
					if (arg0 == 5501) {
						anInt5192 -= 4;
						local157 = anIntArray349[anInt5192];
						local192 = anIntArray349[anInt5192 + 1];
						local89 = anIntArray349[anInt5192 + 2];
						local95 = anIntArray349[anInt5192 + 3];
						Static44.method5694(local89, local95, (local157 >> 14 & 0x3FFF) - Static223.anInt7618, local192, (local157 & 0x3FFF) - Static57.anInt5085);
						return;
					}
					if (arg0 == 5502) {
						anInt5192 -= 6;
						local157 = anIntArray349[anInt5192];
						if (local157 >= 2) {
							throw new RuntimeException();
						}
						Static166.anInt3384 = local157;
						local192 = anIntArray349[anInt5192 + 1];
						if (local192 + 1 >= Static431.anIntArrayArrayArray14[Static166.anInt3384].length >> 1) {
							throw new RuntimeException();
						}
						Static106.anInt2386 = local192;
						Static374.anInt6290 = 0;
						Static49.anInt1182 = anIntArray349[anInt5192 + 2];
						Static219.anInt4145 = anIntArray349[anInt5192 + 3];
						local89 = anIntArray349[anInt5192 + 4];
						if (local89 >= 2) {
							throw new RuntimeException();
						}
						Static362.anInt6125 = local89;
						local95 = anIntArray349[anInt5192 + 5];
						if (local95 + 1 >= Static431.anIntArrayArrayArray14[Static362.anInt6125].length >> 1) {
							throw new RuntimeException();
						}
						Static198.anInt3915 = local95;
						Static161.anInt3316 = 3;
						return;
					}
					if (arg0 == 5503) {
						Static434.method5675();
						return;
					}
					if (arg0 == 5504) {
						anInt5192 -= 2;
						Static188.method3009(anIntArray349[anInt5192 + 1], anIntArray349[anInt5192]);
						return;
					}
					if (arg0 == 5505) {
						anIntArray349[anInt5192++] = (int) Static180.aFloat27 >> 3;
						return;
					}
					if (arg0 == 5506) {
						anIntArray349[anInt5192++] = (int) Static252.aFloat47 >> 3;
						return;
					}
					if (arg0 == 5507) {
						Static147.method2410();
						return;
					}
					if (arg0 == 5508) {
						Static260.method4830();
						return;
					}
					if (arg0 == 5509) {
						Static396.method5085();
						return;
					}
					if (arg0 == 5510) {
						Static67.method1323();
						return;
					}
					if (arg0 == 5511) {
						local157 = anIntArray349[--anInt5192];
						local192 = local157 >> 14 & 0x3FFF;
						local89 = local157 & 0x3FFF;
						local192 -= Static223.anInt7618;
						if (local192 < 0) {
							local192 = 0;
						} else if (local192 >= Static40.anInt1089) {
							local192 = Static40.anInt1089;
						}
						local89 -= Static57.anInt5085;
						if (local89 < 0) {
							local89 = 0;
						} else if (local89 >= Static44.anInt7276) {
							local89 = Static44.anInt7276;
						}
						Static382.anInt1874 = (local192 << 7) + 64;
						Static422.anInt6891 = (local89 << 7) + 64;
						Static161.anInt3316 = 4;
						return;
					}
					if (arg0 == 5512) {
						Static133.method2054();
						return;
					}
				} else if (arg0 < 5700) {
					if (arg0 == 5600) {
						anInt5202 -= 2;
						local75 = aStringArray39[anInt5202];
						local81 = aStringArray39[anInt5202 + 1];
						local89 = anIntArray349[--anInt5192];
						if (Static120.anInt2584 != 10) {
							return;
						}
						if (Static191.anInt3830 == 0 && Static254.anInt4793 == 0 && Static116.anInt5389 == 0 && Static301.anInt2466 == 0) {
							Static391.method5271(local89, local81, local75);
							return;
						}
						return;
					}
					if (arg0 == 5601) {
						Static256.method3778();
						return;
					}
					if (arg0 == 5602) {
						if (Static254.anInt4793 == 0) {
							Static97.anInt2201 = -2;
						}
						return;
					}
					if (arg0 == 5603) {
						anInt5192 -= 4;
						if (Static120.anInt2584 != 10) {
							return;
						}
						if (Static191.anInt3830 == 0 && Static254.anInt4793 == 0 && Static116.anInt5389 == 0 && Static301.anInt2466 == 0) {
							Static151.method2450(anIntArray349[anInt5192 + 3], anIntArray349[anInt5192], anIntArray349[anInt5192 + 2], anIntArray349[anInt5192 + 1]);
							return;
						}
						return;
					}
					if (arg0 == 5604) {
						anInt5202--;
						if (Static120.anInt2584 != 10) {
							return;
						}
						if (Static191.anInt3830 == 0 && Static254.anInt4793 == 0 && Static116.anInt5389 == 0 && Static301.anInt2466 == 0) {
							Static33.method675(Static14.method321(aStringArray39[anInt5202]));
							return;
						}
						return;
					}
					if (arg0 == 5605) {
						anInt5202 -= 3;
						anInt5192 -= 7;
						if (Static120.anInt2584 != 10) {
							return;
						}
						if (Static191.anInt3830 == 0 && Static254.anInt4793 == 0 && Static116.anInt5389 == 0 && Static301.anInt2466 == 0) {
							Static97.method1708(anIntArray349[anInt5192 + 3], Static14.method321(aStringArray39[anInt5202]), anIntArray349[anInt5192 + 2], anIntArray349[anInt5192 + 1], anIntArray349[anInt5192 + 5] == 1, aStringArray39[anInt5202 + 2], anIntArray349[anInt5192 + 6] == 1, aStringArray39[anInt5202 + 1], anIntArray349[anInt5192 + 4] == 1, anIntArray349[anInt5192]);
							return;
						}
						return;
					}
					if (arg0 == 5606) {
						if (Static116.anInt5389 == 0) {
							Static443.anInt4523 = -2;
						}
						return;
					}
					if (arg0 == 5607) {
						anIntArray349[anInt5192++] = Static97.anInt2201;
						return;
					}
					if (arg0 == 5608) {
						anIntArray349[anInt5192++] = Static80.anInt2007;
						return;
					}
					if (arg0 == 5609) {
						anIntArray349[anInt5192++] = Static443.anInt4523;
						return;
					}
					if (arg0 == 5610) {
						for (local157 = 0; local157 < 5; local157++) {
							aStringArray39[anInt5202++] = Static46.aStringArray7.length > local157 ? Static321.method4378(Static46.aStringArray7[local157]) : "";
						}
						Static46.aStringArray7 = null;
						return;
					}
					if (arg0 == 5611) {
						anIntArray349[anInt5192++] = Static124.anInt7629;
						return;
					}
				} else if (arg0 < 6100) {
					if (arg0 == 6001) {
						local157 = anIntArray349[--anInt5192];
						if (local157 < 1) {
							local157 = 1;
						}
						if (local157 > 4) {
							local157 = 4;
						}
						Static374.aClass20_Sub1_1.anInt2346 = local157;
						Static213.method3267();
						Static374.aClass20_Sub1_1.method1818(Static66.aClass143_2);
						Static196.aBoolean336 = false;
						return;
					}
					if (arg0 == 6002) {
						Static374.aClass20_Sub1_1.method1819(anIntArray349[--anInt5192] == 1);
						Static213.method3267();
						Static416.method5340();
						Static374.aClass20_Sub1_1.method1818(Static66.aClass143_2);
						Static196.aBoolean336 = false;
						return;
					}
					if (arg0 == 6003) {
						Static374.aClass20_Sub1_1.aBoolean199 = anIntArray349[--anInt5192] == 1;
						Static416.method5340();
						Static374.aClass20_Sub1_1.method1818(Static66.aClass143_2);
						Static196.aBoolean336 = false;
						return;
					}
					if (arg0 == 6005) {
						Static374.aClass20_Sub1_1.aBoolean183 = anIntArray349[--anInt5192] == 1;
						Static213.method3267();
						Static374.aClass20_Sub1_1.method1818(Static66.aClass143_2);
						Static196.aBoolean336 = false;
						return;
					}
					if (arg0 == 6006) {
						Static374.aClass20_Sub1_1.aBoolean195 = anIntArray349[--anInt5192] == 1;
						Static121.aClass172_3.method5541(!Static374.aClass20_Sub1_1.aBoolean195);
						Static374.aClass20_Sub1_1.method1818(Static66.aClass143_2);
						Static196.aBoolean336 = false;
						return;
					}
					if (arg0 == 6007) {
						Static374.aClass20_Sub1_1.anInt2342 = anIntArray349[--anInt5192];
						Static374.aClass20_Sub1_1.method1818(Static66.aClass143_2);
						Static196.aBoolean336 = false;
						return;
					}
					if (arg0 == 6008) {
						Static374.aClass20_Sub1_1.aBoolean185 = anIntArray349[--anInt5192] == 1;
						Static374.aClass20_Sub1_1.method1818(Static66.aClass143_2);
						Static196.aBoolean336 = false;
						return;
					}
					if (arg0 == 6009) {
						Static374.aClass20_Sub1_1.aBoolean200 = anIntArray349[--anInt5192] == 1;
						Static213.method3267();
						Static374.aClass20_Sub1_1.method1818(Static66.aClass143_2);
						Static196.aBoolean336 = false;
						return;
					}
					if (arg0 == 6010) {
						Static374.aClass20_Sub1_1.aBoolean191 = anIntArray349[--anInt5192] == 1;
						Static374.aClass20_Sub1_1.method1818(Static66.aClass143_2);
						Static196.aBoolean336 = false;
						return;
					}
					if (arg0 == 6011) {
						local157 = anIntArray349[--anInt5192];
						if (local157 < 0 || local157 > 2) {
							local157 = 0;
						}
						Static374.aClass20_Sub1_1.method1802(local157, Static105.anInt2382);
						Static213.method3267();
						Static374.aClass20_Sub1_1.method1818(Static66.aClass143_2);
						Static196.aBoolean336 = false;
						return;
					}
					if (arg0 == 6012) {
						Static374.aClass20_Sub1_1.method1803(anIntArray349[--anInt5192] == 1, Static105.anInt2382);
						Static176.method2814();
						Static214.method3288();
						Static374.aClass20_Sub1_1.method1818(Static66.aClass143_2);
						Static196.aBoolean336 = false;
						return;
					}
					if (arg0 == 6014) {
						Static374.aClass20_Sub1_1.aBoolean198 = anIntArray349[--anInt5192] == 1;
						Static213.method3267();
						Static374.aClass20_Sub1_1.method1818(Static66.aClass143_2);
						Static196.aBoolean336 = false;
						return;
					}
					if (arg0 == 6015) {
						Static374.aClass20_Sub1_1.aBoolean190 = anIntArray349[--anInt5192] == 1;
						Static213.method3267();
						Static374.aClass20_Sub1_1.method1818(Static66.aClass143_2);
						Static196.aBoolean336 = false;
						return;
					}
					if (arg0 == 6016) {
						local157 = anIntArray349[--anInt5192];
						if (local157 < 0 || local157 > 2) {
							local157 = 0;
						}
						Static374.aClass20_Sub1_1.anInt2350 = local157;
						Static111.method1883(Static105.anInt2382);
						Static374.aClass20_Sub1_1.method1818(Static66.aClass143_2);
						return;
					}
					if (arg0 == 6017) {
						Static374.aClass20_Sub1_1.aBoolean196 = anIntArray349[--anInt5192] == 1;
						Static277.method3925();
						Static374.aClass20_Sub1_1.method1818(Static66.aClass143_2);
						Static196.aBoolean336 = false;
						return;
					}
					if (arg0 == 6018) {
						local157 = anIntArray349[--anInt5192];
						if (local157 < 0) {
							local157 = 0;
						}
						if (local157 > 127) {
							local157 = 127;
						}
						Static374.aClass20_Sub1_1.anInt2360 = local157;
						Static374.aClass20_Sub1_1.method1818(Static66.aClass143_2);
						Static196.aBoolean336 = false;
						return;
					}
					if (arg0 == 6019) {
						local157 = anIntArray349[--anInt5192];
						if (local157 < 0) {
							local157 = 0;
						}
						if (local157 > 255) {
							local157 = 255;
						}
						if (local157 != Static374.aClass20_Sub1_1.anInt2341) {
							if (Static374.aClass20_Sub1_1.anInt2341 == 0 && Static120.anInt2586 != -1) {
								Static73.method1426(local157, Static120.anInt2586, Static149.aClass32_43);
								Static24.aBoolean64 = false;
							} else if (local157 == 0) {
								Static124.method5969();
								Static24.aBoolean64 = false;
							} else {
								Static440.method5767(local157);
							}
							Static374.aClass20_Sub1_1.anInt2341 = local157;
						}
						Static374.aClass20_Sub1_1.method1818(Static66.aClass143_2);
						Static196.aBoolean336 = false;
						return;
					}
					if (arg0 == 6020) {
						local157 = anIntArray349[--anInt5192];
						if (local157 < 0) {
							local157 = 0;
						}
						if (local157 > 127) {
							local157 = 127;
						}
						Static374.aClass20_Sub1_1.anInt2349 = local157;
						Static374.aClass20_Sub1_1.method1818(Static66.aClass143_2);
						Static196.aBoolean336 = false;
						return;
					}
					if (arg0 == 6021) {
						Static374.aClass20_Sub1_1.aBoolean201 = anIntArray349[--anInt5192] == 1;
						Static416.method5340();
						return;
					}
					if (arg0 == 6023) {
						local157 = anIntArray349[--anInt5192];
						local1313 = false;
						if (local157 < 0) {
							local157 = 0;
						}
						if (local157 > 2) {
							local157 = 2;
						}
						if (Static286.anInt1448 < 96) {
							local157 = 0;
							local1313 = true;
						}
						Static82.method3177(local157);
						Static374.aClass20_Sub1_1.method1818(Static66.aClass143_2);
						Static196.aBoolean336 = false;
						anIntArray349[anInt5192++] = local1313 ? 0 : 1;
						return;
					}
					if (arg0 == 6024) {
						local157 = anIntArray349[--anInt5192];
						if (local157 < 0 || local157 > 2) {
							local157 = 0;
						}
						Static374.aClass20_Sub1_1.anInt2351 = local157;
						Static374.aClass20_Sub1_1.method1818(Static66.aClass143_2);
						return;
					}
					if (arg0 == 6025) {
						local157 = anIntArray349[--anInt5192];
						if (local157 < 0 || local157 > Static242.method3661(Static286.anInt1448)) {
							local157 = 0;
						}
						Static374.aClass20_Sub1_1.anInt2352 = local157;
						Static374.aClass20_Sub1_1.method1818(Static66.aClass143_2);
						Static196.aBoolean336 = false;
						return;
					}
					if (arg0 == 6027) {
						local157 = anIntArray349[--anInt5192];
						if (local157 < 0 || local157 > 1) {
							local157 = 0;
						}
						Static354.method4717(local157 == 1);
						return;
					}
					if (arg0 == 6028) {
						Static374.aClass20_Sub1_1.aBoolean194 = anIntArray349[--anInt5192] != 0;
						Static374.aClass20_Sub1_1.method1818(Static66.aClass143_2);
						return;
					}
					if (arg0 == 6029) {
						Static374.aClass20_Sub1_1.anInt2342 = anIntArray349[--anInt5192];
						Static374.aClass20_Sub1_1.method1818(Static66.aClass143_2);
						return;
					}
					if (arg0 == 6030) {
						Static374.aClass20_Sub1_1.aBoolean184 = anIntArray349[--anInt5192] != 0;
						Static374.aClass20_Sub1_1.method1818(Static66.aClass143_2);
						Static213.method3267();
						return;
					}
					if (arg0 == 6031) {
						local157 = anIntArray349[--anInt5192];
						if (local157 < 0 || local157 > 3) {
							local157 = 2;
						}
						Static111.method1883(local157);
						return;
					}
					if (arg0 == 6032) {
						local157 = anIntArray349[--anInt5192];
						if (local157 < 0 || local157 > 3) {
							local157 = 2;
						}
						Static374.aClass20_Sub1_1.anInt2347 = local157;
						Static374.aClass20_Sub1_1.method1818(Static66.aClass143_2);
						Static196.aBoolean336 = false;
						return;
					}
					if (arg0 == 6033) {
						local157 = anIntArray349[--anInt5192];
						if (local157 < 0 || local157 > 4) {
							local157 = 2;
						}
						Static374.aClass20_Sub1_1.anInt2357 = local157;
						Static374.aClass20_Sub1_1.method1818(Static66.aClass143_2);
						return;
					}
					if (arg0 == 6034) {
						Static374.aClass20_Sub1_1.aBoolean193 = anIntArray349[--anInt5192] == 1;
						Static374.aClass20_Sub1_1.method1818(Static66.aClass143_2);
						Static176.method2814();
						Static196.aBoolean336 = false;
						return;
					}
					if (arg0 == 6035) {
						Static374.aClass20_Sub1_1.aBoolean202 = anIntArray349[--anInt5192] == 1;
						Static213.method3267();
						Static416.method5340();
						return;
					}
				} else if (arg0 < 6200) {
					if (arg0 == 6101) {
						anIntArray349[anInt5192++] = Static374.aClass20_Sub1_1.anInt2346;
						return;
					}
					if (arg0 == 6102) {
						anIntArray349[anInt5192++] = Static374.aClass20_Sub1_1.method1817(Static105.anInt2382) ? 1 : 0;
						return;
					}
					if (arg0 == 6103) {
						anIntArray349[anInt5192++] = Static374.aClass20_Sub1_1.aBoolean199 ? 1 : 0;
						return;
					}
					if (arg0 == 6105) {
						anIntArray349[anInt5192++] = Static374.aClass20_Sub1_1.aBoolean183 ? 1 : 0;
						return;
					}
					if (arg0 == 6106) {
						anIntArray349[anInt5192++] = Static374.aClass20_Sub1_1.aBoolean195 ? 1 : 0;
						return;
					}
					if (arg0 == 6107) {
						anIntArray349[anInt5192++] = Static374.aClass20_Sub1_1.anInt2342;
						return;
					}
					if (arg0 == 6108) {
						anIntArray349[anInt5192++] = Static374.aClass20_Sub1_1.aBoolean185 ? 1 : 0;
						return;
					}
					if (arg0 == 6109) {
						anIntArray349[anInt5192++] = Static374.aClass20_Sub1_1.aBoolean200 ? 1 : 0;
						return;
					}
					if (arg0 == 6110) {
						anIntArray349[anInt5192++] = Static374.aClass20_Sub1_1.aBoolean191 ? 1 : 0;
						return;
					}
					if (arg0 == 6111) {
						anIntArray349[anInt5192++] = Static374.aClass20_Sub1_1.method1806(Static105.anInt2382);
						return;
					}
					if (arg0 == 6112) {
						anIntArray349[anInt5192++] = Static374.aClass20_Sub1_1.method1805(Static105.anInt2382) ? 1 : 0;
						return;
					}
					if (arg0 == 6114) {
						anIntArray349[anInt5192++] = Static374.aClass20_Sub1_1.aBoolean198 ? 1 : 0;
						return;
					}
					if (arg0 == 6115) {
						anIntArray349[anInt5192++] = Static374.aClass20_Sub1_1.aBoolean190 ? 1 : 0;
						return;
					}
					if (arg0 == 6116) {
						anIntArray349[anInt5192++] = Static374.aClass20_Sub1_1.anInt2350;
						return;
					}
					if (arg0 == 6117) {
						anIntArray349[anInt5192++] = Static374.aClass20_Sub1_1.aBoolean196 ? 1 : 0;
						return;
					}
					if (arg0 == 6118) {
						anIntArray349[anInt5192++] = Static374.aClass20_Sub1_1.anInt2360;
						return;
					}
					if (arg0 == 6119) {
						anIntArray349[anInt5192++] = Static374.aClass20_Sub1_1.anInt2341;
						return;
					}
					if (arg0 == 6120) {
						anIntArray349[anInt5192++] = Static374.aClass20_Sub1_1.anInt2349;
						return;
					}
					if (arg0 == 6121) {
						anIntArray349[anInt5192++] = Static121.aClass172_3.method5533() ? 1 : 0;
						return;
					}
					if (arg0 == 6123) {
						anIntArray349[anInt5192++] = Static309.method4305();
						return;
					}
					if (arg0 == 6124) {
						anIntArray349[anInt5192++] = Static374.aClass20_Sub1_1.anInt2351;
						return;
					}
					if (arg0 == 6125) {
						anIntArray349[anInt5192++] = Static374.aClass20_Sub1_1.anInt2352;
						return;
					}
					if (arg0 == 6126) {
						anIntArray349[anInt5192++] = Static121.aClass172_3.method5486() ? 1 : 0;
						return;
					}
					if (arg0 == 6127) {
						anIntArray349[anInt5192++] = Static374.aClass20_Sub1_1.aBoolean197 ? 1 : 0;
						return;
					}
					if (arg0 == 6128) {
						anIntArray349[anInt5192++] = Static374.aClass20_Sub1_1.aBoolean194 ? 1 : 0;
						return;
					}
					if (arg0 == 6129) {
						anIntArray349[anInt5192++] = Static374.aClass20_Sub1_1.anInt2342;
						return;
					}
					if (arg0 == 6130) {
						anIntArray349[anInt5192++] = Static374.aClass20_Sub1_1.aBoolean184 ? 1 : 0;
						return;
					}
					if (arg0 == 6131) {
						anIntArray349[anInt5192++] = Static105.anInt2382;
						return;
					}
					if (arg0 == 6132) {
						anIntArray349[anInt5192++] = Static374.aClass20_Sub1_1.anInt2347;
						return;
					}
					if (arg0 == 6133) {
						anIntArray349[anInt5192++] = Static227.anInt4227 == 1 || Static227.anInt4227 == 4 ? 1 : 0;
						return;
					}
					if (arg0 == 6134) {
						anIntArray349[anInt5192++] = Static242.method3661(Static286.anInt1448);
						return;
					}
					if (arg0 == 6135) {
						anIntArray349[anInt5192++] = Static374.aClass20_Sub1_1.anInt2357;
						return;
					}
					if (arg0 == 6136) {
						anIntArray349[anInt5192++] = Static374.aClass20_Sub1_1.aBoolean193 ? 1 : 0;
						return;
					}
					if (arg0 == 6137) {
						@Pc(5679) boolean local5679 = true;
						try {
							local5679 = jagmisc.getTotalPhysicalMemory() > 268435456L;
						} catch (@Pc(5689) Throwable local5689) {
						}
						anIntArray349[anInt5192++] = local5679 ? 1 : 0;
						return;
					}
				} else if (arg0 < 6300) {
					if (arg0 == 6200) {
						anInt5192 -= 2;
						Static366.aShort89 = (short) anIntArray349[anInt5192];
						if (Static366.aShort89 <= 0) {
							Static366.aShort89 = 256;
						}
						Static387.aShort90 = (short) anIntArray349[anInt5192 + 1];
						if (Static387.aShort90 <= 0) {
							Static387.aShort90 = 205;
						}
						return;
					}
					if (arg0 == 6201) {
						anInt5192 -= 2;
						Static37.aShort35 = (short) anIntArray349[anInt5192];
						if (Static37.aShort35 <= 0) {
							Static37.aShort35 = 256;
						}
						Static402.aShort91 = (short) anIntArray349[anInt5192 + 1];
						if (Static402.aShort91 <= 0) {
							Static402.aShort91 = 320;
						}
						return;
					}
					if (arg0 == 6202) {
						anInt5192 -= 4;
						Static224.aShort69 = (short) anIntArray349[anInt5192];
						if (Static224.aShort69 <= 0) {
							Static224.aShort69 = 1;
						}
						Static421.aShort92 = (short) anIntArray349[anInt5192 + 1];
						if (Static421.aShort92 <= 0) {
							Static421.aShort92 = 32767;
						} else if (Static421.aShort92 < Static224.aShort69) {
							Static421.aShort92 = Static224.aShort69;
						}
						Static32.aShort30 = (short) anIntArray349[anInt5192 + 2];
						if (Static32.aShort30 <= 0) {
							Static32.aShort30 = 1;
						}
						Static16.aShort21 = (short) anIntArray349[anInt5192 + 3];
						if (Static16.aShort21 <= 0) {
							Static16.aShort21 = 32767;
							return;
						}
						if (Static16.aShort21 < Static32.aShort30) {
							Static16.aShort21 = Static32.aShort30;
						}
						return;
					}
					if (arg0 == 6203) {
						Static115.method1913(false, Static30.aClass156_1.anInt4823, Static30.aClass156_1.anInt4853, 0, 0);
						anIntArray349[anInt5192++] = Static410.anInt6752;
						anIntArray349[anInt5192++] = Static361.anInt6104;
						return;
					}
					if (arg0 == 6204) {
						anIntArray349[anInt5192++] = Static37.aShort35;
						anIntArray349[anInt5192++] = Static402.aShort91;
						return;
					}
					if (arg0 == 6205) {
						anIntArray349[anInt5192++] = Static366.aShort89;
						anIntArray349[anInt5192++] = Static387.aShort90;
						return;
					}
				} else if (arg0 < 6400) {
					if (arg0 == 6300) {
						anIntArray349[anInt5192++] = (int) (Static118.method1934() / 60000L);
						return;
					}
					if (arg0 == 6301) {
						anIntArray349[anInt5192++] = (int) (Static118.method1934() / 86400000L) - 11745;
						return;
					}
					if (arg0 == 6302) {
						anInt5192 -= 3;
						local157 = anIntArray349[anInt5192];
						local192 = anIntArray349[anInt5192 + 1];
						local89 = anIntArray349[anInt5192 + 2];
						aCalendar2.clear();
						aCalendar2.set(11, 12);
						aCalendar2.set(local89, local192, local157);
						anIntArray349[anInt5192++] = (int) (aCalendar2.getTime().getTime() / 86400000L) - 11745;
						return;
					}
					if (arg0 == 6303) {
						aCalendar2.clear();
						aCalendar2.setTime(new Date(Static118.method1934()));
						anIntArray349[anInt5192++] = aCalendar2.get(1);
						return;
					}
					if (arg0 == 6304) {
						local157 = anIntArray349[--anInt5192];
						local1313 = true;
						if (local157 < 0) {
							local1313 = (local157 + 1) % 4 == 0;
						} else if (local157 < 1582) {
							local1313 = local157 % 4 == 0;
						} else if (local157 % 4 != 0) {
							local1313 = false;
						} else if (local157 % 100 != 0) {
							local1313 = true;
						} else if (local157 % 400 != 0) {
							local1313 = false;
						}
						anIntArray349[anInt5192++] = local1313 ? 1 : 0;
						return;
					}
				} else if (arg0 < 6500) {
					if (arg0 == 6405) {
						anIntArray349[anInt5192++] = Static350.method2923() ? 1 : 0;
						return;
					}
					if (arg0 == 6406) {
						anIntArray349[anInt5192++] = Static49.method870() ? 1 : 0;
						return;
					}
				} else if (arg0 < 6600) {
					if (arg0 == 6500) {
						if (Static120.anInt2584 == 10 && Static191.anInt3830 == 0 && Static254.anInt4793 == 0 && Static116.anInt5389 == 0) {
							anIntArray349[anInt5192++] = Static306.method4283() == -1 ? 0 : 1;
							return;
						}
						anIntArray349[anInt5192++] = 1;
						return;
					}
					@Pc(6188) Class186 local6188;
					@Pc(6155) Class117_Sub1 local6155;
					if (arg0 == 6501) {
						local6155 = Static291.method4103();
						if (local6155 != null) {
							anIntArray349[anInt5192++] = local6155.anInt7359;
							anIntArray349[anInt5192++] = local6155.anInt7350;
							aStringArray39[anInt5202++] = local6155.aString66;
							local6188 = local6155.method5725();
							anIntArray349[anInt5192++] = local6188.anInt5395;
							aStringArray39[anInt5202++] = local6188.aString52;
							anIntArray349[anInt5192++] = local6155.anInt7353;
							anIntArray349[anInt5192++] = local6155.anInt7360;
							return;
						}
						anIntArray349[anInt5192++] = -1;
						anIntArray349[anInt5192++] = 0;
						aStringArray39[anInt5202++] = "";
						anIntArray349[anInt5192++] = 0;
						aStringArray39[anInt5202++] = "";
						anIntArray349[anInt5192++] = 0;
						anIntArray349[anInt5192++] = 0;
						return;
					}
					if (arg0 == 6502) {
						local6155 = Static407.method5246();
						if (local6155 != null) {
							anIntArray349[anInt5192++] = local6155.anInt7359;
							anIntArray349[anInt5192++] = local6155.anInt7350;
							aStringArray39[anInt5202++] = local6155.aString66;
							local6188 = local6155.method5725();
							anIntArray349[anInt5192++] = local6188.anInt5395;
							aStringArray39[anInt5202++] = local6188.aString52;
							anIntArray349[anInt5192++] = local6155.anInt7353;
							anIntArray349[anInt5192++] = local6155.anInt7360;
							return;
						}
						anIntArray349[anInt5192++] = -1;
						anIntArray349[anInt5192++] = 0;
						aStringArray39[anInt5202++] = "";
						anIntArray349[anInt5192++] = 0;
						aStringArray39[anInt5202++] = "";
						anIntArray349[anInt5192++] = 0;
						anIntArray349[anInt5192++] = 0;
						return;
					}
					if (arg0 == 6503) {
						local157 = anIntArray349[--anInt5192];
						if (Static120.anInt2584 == 10 && Static191.anInt3830 == 0 && Static254.anInt4793 == 0 && Static116.anInt5389 == 0) {
							anIntArray349[anInt5192++] = Static35.method719(local157) ? 1 : 0;
							return;
						}
						anIntArray349[anInt5192++] = 0;
						return;
					}
					if (arg0 == 6504) {
						Static374.aClass20_Sub1_1.anInt2354 = anIntArray349[--anInt5192];
						Static374.aClass20_Sub1_1.method1818(Static66.aClass143_2);
						return;
					}
					if (arg0 == 6505) {
						anIntArray349[anInt5192++] = Static374.aClass20_Sub1_1.anInt2354;
						return;
					}
					if (arg0 == 6506) {
						local157 = anIntArray349[--anInt5192];
						@Pc(6504) Class117_Sub1 local6504 = Static132.method2050(local157);
						if (local6504 != null) {
							anIntArray349[anInt5192++] = local6504.anInt7350;
							aStringArray39[anInt5202++] = local6504.aString66;
							@Pc(6528) Class186 local6528 = local6504.method5725();
							anIntArray349[anInt5192++] = local6528.anInt5395;
							aStringArray39[anInt5202++] = local6528.aString52;
							anIntArray349[anInt5192++] = local6504.anInt7353;
							anIntArray349[anInt5192++] = local6504.anInt7360;
							return;
						}
						anIntArray349[anInt5192++] = -1;
						aStringArray39[anInt5202++] = "";
						anIntArray349[anInt5192++] = 0;
						aStringArray39[anInt5202++] = "";
						anIntArray349[anInt5192++] = 0;
						anIntArray349[anInt5192++] = 0;
						return;
					}
					if (arg0 == 6507) {
						anInt5192 -= 4;
						local157 = anIntArray349[anInt5192];
						local1313 = anIntArray349[anInt5192 + 1] == 1;
						local89 = anIntArray349[anInt5192 + 2];
						local1965 = anIntArray349[anInt5192 + 3] == 1;
						Static120.method1954(local157, local1965, local1313, local89);
						return;
					}
					if (arg0 == 6508) {
						Static1.method5();
						return;
					}
					if (arg0 == 6509) {
						if (Static120.anInt2584 != 10) {
							return;
						}
						Static415.aBoolean587 = anIntArray349[--anInt5192] == 1;
						return;
					}
				} else if (arg0 < 6700) {
					if (arg0 == 6600) {
						Static374.aClass20_Sub1_1.aBoolean186 = anIntArray349[--anInt5192] == 1;
						Static374.aClass20_Sub1_1.method1818(Static66.aClass143_2);
						return;
					}
					if (arg0 == 6601) {
						anIntArray349[anInt5192++] = Static374.aClass20_Sub1_1.aBoolean186 ? 1 : 0;
						return;
					}
				} else if (arg0 < 6800 && Static201.aClass134_5 == Static320.aClass134_6) {
					if (arg0 == 6700) {
						local157 = Static318.aClass11_42.method322();
						if (Static226.anInt4225 != -1) {
							local157++;
						}
						anIntArray349[anInt5192++] = local157;
						return;
					}
					if (arg0 == 6701) {
						local157 = anIntArray349[--anInt5192];
						if (Static226.anInt4225 != -1) {
							if (local157 == 0) {
								anIntArray349[anInt5192++] = Static226.anInt4225;
								return;
							}
							local157--;
						}
						@Pc(6786) Class3_Sub9 local6786 = (Class3_Sub9) Static318.aClass11_42.method313();
						while (local157-- > 0) {
							local6786 = (Class3_Sub9) Static318.aClass11_42.method316();
						}
						anIntArray349[anInt5192++] = local6786.anInt1804;
						return;
					}
					if (arg0 == 6702) {
						local157 = anIntArray349[--anInt5192];
						if (Static178.aClass156ArrayArray2[local157] == null) {
							aStringArray39[anInt5202++] = "";
							return;
						}
						local81 = Static178.aClass156ArrayArray2[local157][0].aString41;
						if (local81 == null) {
							aStringArray39[anInt5202++] = "";
							return;
						}
						aStringArray39[anInt5202++] = local81.substring(0, local81.indexOf(58));
						return;
					}
					if (arg0 == 6703) {
						local157 = anIntArray349[--anInt5192];
						if (Static178.aClass156ArrayArray2[local157] == null) {
							anIntArray349[anInt5192++] = 0;
							return;
						}
						anIntArray349[anInt5192++] = Static178.aClass156ArrayArray2[local157].length;
						return;
					}
					if (arg0 == 6704) {
						anInt5192 -= 2;
						local157 = anIntArray349[anInt5192];
						local192 = anIntArray349[anInt5192 + 1];
						if (Static178.aClass156ArrayArray2[local157] == null) {
							aStringArray39[anInt5202++] = "";
							return;
						}
						local3345 = Static178.aClass156ArrayArray2[local157][local192].aString41;
						if (local3345 == null) {
							aStringArray39[anInt5202++] = "";
							return;
						}
						aStringArray39[anInt5202++] = local3345;
						return;
					}
					if (arg0 == 6705) {
						anInt5192 -= 2;
						local157 = anIntArray349[anInt5192];
						local192 = anIntArray349[anInt5192 + 1];
						if (Static178.aClass156ArrayArray2[local157] == null) {
							anIntArray349[anInt5192++] = 0;
							return;
						}
						anIntArray349[anInt5192++] = Static178.aClass156ArrayArray2[local157][local192].anInt4863;
						return;
					}
					if (arg0 == 6706) {
						return;
					}
					if (arg0 == 6707) {
						anInt5192 -= 3;
						local157 = anIntArray349[anInt5192];
						local192 = anIntArray349[anInt5192 + 1];
						local89 = anIntArray349[anInt5192 + 2];
						Static132.method2052(1, local89, local157 << 16 | local192, "");
						return;
					}
					if (arg0 == 6708) {
						anInt5192 -= 3;
						local157 = anIntArray349[anInt5192];
						local192 = anIntArray349[anInt5192 + 1];
						local89 = anIntArray349[anInt5192 + 2];
						Static132.method2052(2, local89, local157 << 16 | local192, "");
						return;
					}
					if (arg0 == 6709) {
						anInt5192 -= 3;
						local157 = anIntArray349[anInt5192];
						local192 = anIntArray349[anInt5192 + 1];
						local89 = anIntArray349[anInt5192 + 2];
						Static132.method2052(3, local89, local157 << 16 | local192, "");
						return;
					}
					if (arg0 == 6710) {
						anInt5192 -= 3;
						local157 = anIntArray349[anInt5192];
						local192 = anIntArray349[anInt5192 + 1];
						local89 = anIntArray349[anInt5192 + 2];
						Static132.method2052(4, local89, local157 << 16 | local192, "");
						return;
					}
					if (arg0 == 6711) {
						anInt5192 -= 3;
						local157 = anIntArray349[anInt5192];
						local192 = anIntArray349[anInt5192 + 1];
						local89 = anIntArray349[anInt5192 + 2];
						Static132.method2052(5, local89, local157 << 16 | local192, "");
						return;
					}
					if (arg0 == 6712) {
						anInt5192 -= 3;
						local157 = anIntArray349[anInt5192];
						local192 = anIntArray349[anInt5192 + 1];
						local89 = anIntArray349[anInt5192 + 2];
						Static132.method2052(6, local89, local157 << 16 | local192, "");
						return;
					}
					if (arg0 == 6713) {
						anInt5192 -= 3;
						local157 = anIntArray349[anInt5192];
						local192 = anIntArray349[anInt5192 + 1];
						local89 = anIntArray349[anInt5192 + 2];
						Static132.method2052(7, local89, local157 << 16 | local192, "");
						return;
					}
					if (arg0 == 6714) {
						anInt5192 -= 3;
						local157 = anIntArray349[anInt5192];
						local192 = anIntArray349[anInt5192 + 1];
						local89 = anIntArray349[anInt5192 + 2];
						Static132.method2052(8, local89, local157 << 16 | local192, "");
						return;
					}
					if (arg0 == 6715) {
						anInt5192 -= 3;
						local157 = anIntArray349[anInt5192];
						local192 = anIntArray349[anInt5192 + 1];
						local89 = anIntArray349[anInt5192 + 2];
						Static132.method2052(9, local89, local157 << 16 | local192, "");
						return;
					}
					if (arg0 == 6716) {
						anInt5192 -= 3;
						local157 = anIntArray349[anInt5192];
						local192 = anIntArray349[anInt5192 + 1];
						local89 = anIntArray349[anInt5192 + 2];
						Static132.method2052(10, local89, local157 << 16 | local192, "");
						return;
					}
					if (arg0 == 6717) {
						anInt5192 -= 3;
						local157 = anIntArray349[anInt5192];
						local192 = anIntArray349[anInt5192 + 1];
						local89 = anIntArray349[anInt5192 + 2];
						@Pc(7374) Class156 local7374 = Static109.method1853(local157 << 16 | local192, local89);
						Static70.method1396();
						@Pc(7379) Class3_Sub45 local7379 = Static53.method1118(local7374);
						Static104.method1812(local7379.method5980(), local7379.anInt7653, local7374);
						return;
					}
				} else if (arg0 < 6900) {
					@Pc(7407) Class90 local7407;
					if (arg0 == 6800) {
						local157 = anIntArray349[--anInt5192];
						local7407 = Static168.aClass171_3.method3940(local157);
						if (local7407.aString18 == null) {
							aStringArray39[anInt5202++] = "";
							return;
						}
						aStringArray39[anInt5202++] = local7407.aString18;
						return;
					}
					if (arg0 == 6801) {
						local157 = anIntArray349[--anInt5192];
						local7407 = Static168.aClass171_3.method3940(local157);
						anIntArray349[anInt5192++] = local7407.anInt2704;
						return;
					}
					if (arg0 == 6802) {
						local157 = anIntArray349[--anInt5192];
						local7407 = Static168.aClass171_3.method3940(local157);
						anIntArray349[anInt5192++] = local7407.anInt2702;
						return;
					}
					if (arg0 == 6803) {
						local157 = anIntArray349[--anInt5192];
						local7407 = Static168.aClass171_3.method3940(local157);
						anIntArray349[anInt5192++] = local7407.anInt2698;
						return;
					}
					if (arg0 == 6804) {
						anInt5192 -= 2;
						local157 = anIntArray349[anInt5192];
						local192 = anIntArray349[anInt5192 + 1];
						@Pc(7529) Class224 local7529 = Static318.aClass26_5.method691(local192);
						if (local7529.method4789()) {
							aStringArray39[anInt5202++] = Static168.aClass171_3.method3940(local157).method2041(local192, local7529.aString56);
							return;
						}
						anIntArray349[anInt5192++] = Static168.aClass171_3.method3940(local157).method2040(local192, local7529.anInt6133);
						return;
					}
				}
			}
		}
		throw new IllegalStateException();
	}
}
