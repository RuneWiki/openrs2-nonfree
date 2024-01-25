import java.util.Calendar;
import java.util.Date;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static308 {

	@OriginalMember(owner = "client!pj", name = "e", descriptor = "[Ljava/lang/String;")
	private static String[] aStringArray36;

	@OriginalMember(owner = "client!pj", name = "f", descriptor = "Lclient!tq;")
	private static Class239 aClass239_7;

	@OriginalMember(owner = "client!pj", name = "l", descriptor = "Lclient!tq;")
	private static Class239 aClass239_8;

	@OriginalMember(owner = "client!pj", name = "q", descriptor = "[I")
	private static int[] anIntArray452;

	@OriginalMember(owner = "client!pj", name = "t", descriptor = "Lclient!lr;")
	private static Class157 aClass157_1;

	@OriginalMember(owner = "client!pj", name = "a", descriptor = "[I")
	private static final int[] anIntArray450 = new int[1000];

	@OriginalMember(owner = "client!pj", name = "b", descriptor = "[Lclient!fj;")
	private static final Class80[] aClass80Array1 = new Class80[50];

	@OriginalMember(owner = "client!pj", name = "g", descriptor = "[[I")
	private static final int[][] anIntArrayArray44 = new int[5][5000];

	@OriginalMember(owner = "client!pj", name = "i", descriptor = "[I")
	private static final int[] anIntArray451 = new int[5];

	@OriginalMember(owner = "client!pj", name = "k", descriptor = "I")
	private static int anInt5007 = 0;

	@OriginalMember(owner = "client!pj", name = "n", descriptor = "I")
	private static int anInt5009 = 0;

	@OriginalMember(owner = "client!pj", name = "o", descriptor = "I")
	private static int anInt5010 = 0;

	@OriginalMember(owner = "client!pj", name = "s", descriptor = "[Ljava/lang/String;")
	private static final String[] aStringArray37 = new String[1000];

	@OriginalMember(owner = "client!pj", name = "y", descriptor = "Ljava/util/Calendar;")
	private static final Calendar aCalendar2 = Calendar.getInstance();

	@OriginalMember(owner = "client!pj", name = "z", descriptor = "[I")
	private static final int[] anIntArray453 = new int[3];

	@OriginalMember(owner = "client!pj", name = "A", descriptor = "[Ljava/lang/String;")
	private static final String[] aStringArray38 = new String[] { "Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec" };

	@OriginalMember(owner = "client!pj", name = "B", descriptor = "Lclient!rp;")
	public static final Class220 aClass220_46 = new Class220(4);

	@OriginalMember(owner = "client!pj", name = "C", descriptor = "I")
	private static int anInt5017 = 0;

	@OriginalMember(owner = "client!pj", name = "a", descriptor = "(Ljava/lang/String;I)V")
	private static void method4414(@OriginalArg(0) String arg0, @OriginalArg(1) int arg1) {
		if (Static221.anInt3810 == 0 && (Static311.aBoolean354 && !Static40.aBoolean73 || Static130.aBoolean175)) {
			return;
		}
		@Pc(11) String local11 = arg0.toLowerCase();
		@Pc(13) byte local13 = 0;
		if (local11.startsWith(Static295.aClass231_86.method5138(0))) {
			local13 = 0;
			arg0 = arg0.substring(Static295.aClass231_86.method5138(0).length());
		} else if (local11.startsWith(Static207.aClass231_64.method5138(0))) {
			local13 = 1;
			arg0 = arg0.substring(Static207.aClass231_64.method5138(0).length());
		} else if (local11.startsWith(Static236.aClass231_71.method5138(0))) {
			local13 = 2;
			arg0 = arg0.substring(Static236.aClass231_71.method5138(0).length());
		} else if (local11.startsWith(Static214.aClass231_65.method5138(0))) {
			local13 = 3;
			arg0 = arg0.substring(Static214.aClass231_65.method5138(0).length());
		} else if (local11.startsWith(Static59.aClass231_20.method5138(0))) {
			local13 = 4;
			arg0 = arg0.substring(Static59.aClass231_20.method5138(0).length());
		} else if (local11.startsWith(Static33.aClass231_12.method5138(0))) {
			local13 = 5;
			arg0 = arg0.substring(Static33.aClass231_12.method5138(0).length());
		} else if (local11.startsWith(Static7.aClass231_5.method5138(0))) {
			local13 = 6;
			arg0 = arg0.substring(Static7.aClass231_5.method5138(0).length());
		} else if (local11.startsWith(Static215.aClass231_66.method5138(0))) {
			local13 = 7;
			arg0 = arg0.substring(Static215.aClass231_66.method5138(0).length());
		} else if (local11.startsWith(Static29.aClass231_11.method5138(0))) {
			local13 = 8;
			arg0 = arg0.substring(Static29.aClass231_11.method5138(0).length());
		} else if (local11.startsWith(Static318.aClass231_91.method5138(0))) {
			local13 = 9;
			arg0 = arg0.substring(Static318.aClass231_91.method5138(0).length());
		} else if (local11.startsWith(Static108.aClass231_30.method5138(0))) {
			local13 = 10;
			arg0 = arg0.substring(Static108.aClass231_30.method5138(0).length());
		} else if (local11.startsWith(Static151.aClass231_41.method5138(0))) {
			local13 = 11;
			arg0 = arg0.substring(Static151.aClass231_41.method5138(0).length());
		} else if (Static382.anInt6289 != 0) {
			if (local11.startsWith(Static295.aClass231_86.method5138(Static382.anInt6289))) {
				local13 = 0;
				arg0 = arg0.substring(Static295.aClass231_86.method5138(Static382.anInt6289).length());
			} else if (local11.startsWith(Static207.aClass231_64.method5138(Static382.anInt6289))) {
				local13 = 1;
				arg0 = arg0.substring(Static207.aClass231_64.method5138(Static382.anInt6289).length());
			} else if (local11.startsWith(Static236.aClass231_71.method5138(Static382.anInt6289))) {
				local13 = 2;
				arg0 = arg0.substring(Static236.aClass231_71.method5138(Static382.anInt6289).length());
			} else if (local11.startsWith(Static214.aClass231_65.method5138(Static382.anInt6289))) {
				local13 = 3;
				arg0 = arg0.substring(Static214.aClass231_65.method5138(Static382.anInt6289).length());
			} else if (local11.startsWith(Static59.aClass231_20.method5138(Static382.anInt6289))) {
				local13 = 4;
				arg0 = arg0.substring(Static59.aClass231_20.method5138(Static382.anInt6289).length());
			} else if (local11.startsWith(Static33.aClass231_12.method5138(Static382.anInt6289))) {
				local13 = 5;
				arg0 = arg0.substring(Static33.aClass231_12.method5138(Static382.anInt6289).length());
			} else if (local11.startsWith(Static7.aClass231_5.method5138(Static382.anInt6289))) {
				local13 = 6;
				arg0 = arg0.substring(Static7.aClass231_5.method5138(Static382.anInt6289).length());
			} else if (local11.startsWith(Static215.aClass231_66.method5138(Static382.anInt6289))) {
				local13 = 7;
				arg0 = arg0.substring(Static215.aClass231_66.method5138(Static382.anInt6289).length());
			} else if (local11.startsWith(Static29.aClass231_11.method5138(Static382.anInt6289))) {
				local13 = 8;
				arg0 = arg0.substring(Static29.aClass231_11.method5138(Static382.anInt6289).length());
			} else if (local11.startsWith(Static318.aClass231_91.method5138(Static382.anInt6289))) {
				local13 = 9;
				arg0 = arg0.substring(Static318.aClass231_91.method5138(Static382.anInt6289).length());
			} else if (local11.startsWith(Static108.aClass231_30.method5138(Static382.anInt6289))) {
				local13 = 10;
				arg0 = arg0.substring(Static108.aClass231_30.method5138(Static382.anInt6289).length());
			} else if (local11.startsWith(Static151.aClass231_41.method5138(Static382.anInt6289))) {
				local13 = 11;
				arg0 = arg0.substring(Static151.aClass231_41.method5138(Static382.anInt6289).length());
			}
		}
		local11 = arg0.toLowerCase();
		@Pc(451) byte local451 = 0;
		if (local11.startsWith(Static180.aClass231_48.method5138(0))) {
			local451 = 1;
			arg0 = arg0.substring(Static180.aClass231_48.method5138(0).length());
		} else if (local11.startsWith(Static195.aClass231_57.method5138(0))) {
			local451 = 2;
			arg0 = arg0.substring(Static195.aClass231_57.method5138(0).length());
		} else if (local11.startsWith(Static119.aClass231_32.method5138(0))) {
			local451 = 3;
			arg0 = arg0.substring(Static119.aClass231_32.method5138(0).length());
		} else if (local11.startsWith(Static431.aClass231_96.method5138(0))) {
			local451 = 4;
			arg0 = arg0.substring(Static431.aClass231_96.method5138(0).length());
		} else if (local11.startsWith(Static296.aClass231_88.method5138(0))) {
			local451 = 5;
			arg0 = arg0.substring(Static296.aClass231_88.method5138(0).length());
		} else if (Static382.anInt6289 != 0) {
			if (local11.startsWith(Static180.aClass231_48.method5138(Static382.anInt6289))) {
				local451 = 1;
				arg0 = arg0.substring(Static180.aClass231_48.method5138(Static382.anInt6289).length());
			} else if (local11.startsWith(Static195.aClass231_57.method5138(Static382.anInt6289))) {
				local451 = 2;
				arg0 = arg0.substring(Static195.aClass231_57.method5138(Static382.anInt6289).length());
			} else if (local11.startsWith(Static119.aClass231_32.method5138(Static382.anInt6289))) {
				local451 = 3;
				arg0 = arg0.substring(Static119.aClass231_32.method5138(Static382.anInt6289).length());
			} else if (local11.startsWith(Static431.aClass231_96.method5138(Static382.anInt6289))) {
				local451 = 4;
				arg0 = arg0.substring(Static431.aClass231_96.method5138(Static382.anInt6289).length());
			} else if (local11.startsWith(Static296.aClass231_88.method5138(Static382.anInt6289))) {
				local451 = 5;
				arg0 = arg0.substring(Static296.aClass231_88.method5138(Static382.anInt6289).length());
			}
		}
		Static298.method4373(Static167.aClass25_46);
		Static449.aClass6_Sub15_Sub1_2.method3075(0);
		@Pc(646) int local646 = Static449.aClass6_Sub15_Sub1_2.anInt3487;
		if (arg1 == 5021) {
			Static449.aClass6_Sub15_Sub1_2.method3075(1);
		} else if (arg1 == 5022) {
			Static449.aClass6_Sub15_Sub1_2.method3075(2);
		} else {
			Static449.aClass6_Sub15_Sub1_2.method3075(0);
		}
		Static449.aClass6_Sub15_Sub1_2.method3075(local13);
		Static449.aClass6_Sub15_Sub1_2.method3075(local451);
		Static155.method2530(Static449.aClass6_Sub15_Sub1_2, arg0);
		Static449.aClass6_Sub15_Sub1_2.method3118(Static449.aClass6_Sub15_Sub1_2.anInt3487 - local646);
	}

	@OriginalMember(owner = "client!pj", name = "a", descriptor = "(IZ)V")
	private static void method4415(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1) {
		@Pc(137) Class239 local137;
		@Pc(25) int local25;
		@Pc(56) int local56;
		@Pc(19) int local19;
		@Pc(35) Class239 local35;
		@Pc(13) int local13;
		@Pc(210) Class239 local210;
		@Pc(158) Class239 local158;
		if (arg0 < 300) {
			if (arg0 == 100) {
				anInt5009 -= 3;
				local13 = anIntArray450[anInt5009];
				local19 = anIntArray450[anInt5009 + 1];
				local25 = anIntArray450[anInt5009 + 2];
				if (local19 == 0) {
					throw new RuntimeException();
				}
				local35 = Static299.method4387(local13);
				if (local35.aClass239Array1 == null) {
					local35.aClass239Array1 = new Class239[local25 + 1];
				}
				if (local35.aClass239Array1.length <= local25) {
					@Pc(54) Class239[] local54 = new Class239[local25 + 1];
					for (local56 = 0; local56 < local35.aClass239Array1.length; local56++) {
						local54[local56] = local35.aClass239Array1[local56];
					}
					local35.aClass239Array1 = local54;
				}
				if (local25 > 0 && local35.aClass239Array1[local25 - 1] == null) {
					throw new RuntimeException("Gap at:" + (local25 - 1));
				}
				@Pc(99) Class239 local99 = new Class239();
				local99.anInt6447 = local19;
				local99.anInt6479 = local99.anInt6423 = local35.anInt6423;
				local99.anInt6487 = local25;
				local35.aClass239Array1[local25] = local99;
				if (arg1) {
					aClass239_8 = local99;
				} else {
					aClass239_7 = local99;
				}
				Static354.method4992(local35);
				return;
			}
			if (arg0 == 101) {
				local137 = arg1 ? aClass239_8 : aClass239_7;
				if (local137.anInt6487 == -1) {
					if (arg1) {
						throw new RuntimeException("Tried to .cc_delete static .active-component!");
					}
					throw new RuntimeException("Tried to cc_delete static active-component!");
				}
				local158 = Static299.method4387(local137.anInt6423);
				local158.aClass239Array1[local137.anInt6487] = null;
				Static354.method4992(local158);
				return;
			}
			if (arg0 == 102) {
				local137 = Static299.method4387(anIntArray450[--anInt5009]);
				local137.aClass239Array1 = null;
				Static354.method4992(local137);
				return;
			}
			if (arg0 == 200) {
				anInt5009 -= 2;
				local13 = anIntArray450[anInt5009];
				local19 = anIntArray450[anInt5009 + 1];
				local210 = Static316.method5795(local19, local13);
				if (local210 != null && local19 != -1) {
					anIntArray450[anInt5009++] = 1;
					if (arg1) {
						aClass239_8 = local210;
						return;
					}
					aClass239_7 = local210;
					return;
				}
				anIntArray450[anInt5009++] = 0;
				return;
			}
			if (arg0 == 201) {
				local13 = anIntArray450[--anInt5009];
				local158 = Static299.method4387(local13);
				if (local158 != null) {
					anIntArray450[anInt5009++] = 1;
					if (arg1) {
						aClass239_8 = local158;
						return;
					}
					aClass239_7 = local158;
					return;
				}
				anIntArray450[anInt5009++] = 0;
				return;
			}
			if (arg0 == 202) {
				local13 = anIntArray450[--anInt5009];
				method4417(local13);
				return;
			}
			if (arg0 == 203) {
				local13 = anIntArray450[--anInt5009];
				method4416(local13);
				return;
			}
		} else {
			@Pc(353) int local353;
			@Pc(412) boolean local412;
			if (arg0 < 500) {
				if (arg0 == 403) {
					anInt5009 -= 2;
					local13 = anIntArray450[anInt5009];
					local19 = anIntArray450[anInt5009 + 1];
					for (local25 = 0; local25 < Static135.anIntArray241.length; local25++) {
						if (Static135.anIntArray241[local25] == local13) {
							Static134.aClass3_Sub3_Sub6_Sub1_1.aClass73_1.method1676(local19, local25, Static167.aClass223_1);
							return;
						}
					}
					for (local353 = 0; local353 < Static102.anIntArray449.length; local353++) {
						if (Static102.anIntArray449[local353] == local13) {
							Static134.aClass3_Sub3_Sub6_Sub1_1.aClass73_1.method1676(local19, local353, Static167.aClass223_1);
							return;
						}
					}
					return;
				}
				if (arg0 == 404) {
					anInt5009 -= 2;
					local13 = anIntArray450[anInt5009];
					local19 = anIntArray450[anInt5009 + 1];
					Static134.aClass3_Sub3_Sub6_Sub1_1.aClass73_1.method1677(local19, local13);
					return;
				}
				if (arg0 == 410) {
					local412 = anIntArray450[--anInt5009] != 0;
					Static134.aClass3_Sub3_Sub6_Sub1_1.aClass73_1.method1671(local412);
					return;
				}
			} else if ((arg0 < 1000 || arg0 >= 1100) && (arg0 < 2000 || arg0 >= 2100)) {
				@Pc(1488) String local1488;
				@Pc(1101) String local1101;
				if (arg0 >= 1100 && arg0 < 1200 || arg0 >= 2100 && arg0 < 2200) {
					if (arg0 >= 2000) {
						arg0 -= 1000;
						local137 = Static299.method4387(anIntArray450[--anInt5009]);
					} else {
						local137 = arg1 ? aClass239_8 : aClass239_7;
					}
					if (arg0 == 1100) {
						anInt5009 -= 2;
						local137.anInt6495 = anIntArray450[anInt5009];
						if (local137.anInt6495 > local137.anInt6429 - local137.anInt6435) {
							local137.anInt6495 = local137.anInt6429 - local137.anInt6435;
						}
						if (local137.anInt6495 < 0) {
							local137.anInt6495 = 0;
						}
						local137.anInt6438 = anIntArray450[anInt5009 + 1];
						if (local137.anInt6438 > local137.anInt6440 - local137.anInt6408) {
							local137.anInt6438 = local137.anInt6440 - local137.anInt6408;
						}
						if (local137.anInt6438 < 0) {
							local137.anInt6438 = 0;
						}
						Static354.method4992(local137);
						if (local137.anInt6487 == -1) {
							Static168.method2734(local137.anInt6423);
						}
						return;
					}
					if (arg0 == 1101) {
						local137.anInt6431 = anIntArray450[--anInt5009];
						Static354.method4992(local137);
						if (local137.anInt6487 == -1) {
							Static112.method5326(local137.anInt6423);
						}
						return;
					}
					if (arg0 == 1102) {
						local137.aBoolean427 = anIntArray450[--anInt5009] == 1;
						Static354.method4992(local137);
						return;
					}
					if (arg0 == 1103) {
						local137.anInt6414 = anIntArray450[--anInt5009];
						Static354.method4992(local137);
						return;
					}
					if (arg0 == 1104) {
						local137.anInt6482 = anIntArray450[--anInt5009];
						Static354.method4992(local137);
						return;
					}
					if (arg0 == 1105) {
						local19 = anIntArray450[--anInt5009];
						if (local137.anInt6455 != local19) {
							local137.anInt6455 = local19;
							Static354.method4992(local137);
						}
						if (local137.anInt6487 == -1) {
							Static88.method1555(local137.anInt6423);
						}
						return;
					}
					if (arg0 == 1106) {
						local137.anInt6453 = anIntArray450[--anInt5009];
						Static354.method4992(local137);
						return;
					}
					if (arg0 == 1107) {
						local137.aBoolean430 = anIntArray450[--anInt5009] == 1;
						Static354.method4992(local137);
						return;
					}
					if (arg0 == 1108) {
						local137.anInt6446 = 1;
						local137.anInt6426 = anIntArray450[--anInt5009];
						Static354.method4992(local137);
						if (local137.anInt6487 == -1) {
							Static195.method3061(local137.anInt6423);
						}
						return;
					}
					if (arg0 == 1109) {
						anInt5009 -= 6;
						local137.anInt6496 = anIntArray450[anInt5009];
						local137.anInt6463 = anIntArray450[anInt5009 + 1];
						local137.anInt6458 = anIntArray450[anInt5009 + 2];
						local137.anInt6449 = anIntArray450[anInt5009 + 3];
						local137.anInt6486 = anIntArray450[anInt5009 + 4];
						local137.anInt6462 = anIntArray450[anInt5009 + 5];
						Static354.method4992(local137);
						if (local137.anInt6487 == -1) {
							Static347.method4916(local137.anInt6423);
							Static229.method3472(local137.anInt6423);
						}
						return;
					}
					if (arg0 == 1110) {
						local19 = anIntArray450[--anInt5009];
						if (local137.anInt6493 != local19) {
							local137.anInt6493 = local19;
							local137.anInt6460 = 0;
							local137.anInt6469 = 1;
							local137.anInt6498 = 0;
							Static354.method4992(local137);
						}
						if (local137.anInt6487 == -1) {
							Static325.method4615(local137.anInt6423);
						}
						return;
					}
					if (arg0 == 1111) {
						local137.aBoolean439 = anIntArray450[--anInt5009] == 1;
						Static354.method4992(local137);
						return;
					}
					if (arg0 == 1112) {
						local1101 = aStringArray37[--anInt5007];
						if (!local1101.equals(local137.aString59)) {
							local137.aString59 = local1101;
							Static354.method4992(local137);
						}
						if (local137.anInt6487 == -1) {
							Static376.method4533(local137.anInt6423);
						}
						return;
					}
					if (arg0 == 1113) {
						local137.anInt6477 = anIntArray450[--anInt5009];
						Static354.method4992(local137);
						if (local137.anInt6487 == -1) {
							Static66.method1263(local137.anInt6423);
						}
						return;
					}
					if (arg0 == 1114) {
						anInt5009 -= 3;
						local137.anInt6427 = anIntArray450[anInt5009];
						local137.anInt6450 = anIntArray450[anInt5009 + 1];
						local137.anInt6464 = anIntArray450[anInt5009 + 2];
						Static354.method4992(local137);
						return;
					}
					if (arg0 == 1115) {
						local137.aBoolean436 = anIntArray450[--anInt5009] == 1;
						Static354.method4992(local137);
						return;
					}
					if (arg0 == 1116) {
						local137.anInt6481 = anIntArray450[--anInt5009];
						Static354.method4992(local137);
						return;
					}
					if (arg0 == 1117) {
						local137.anInt6420 = anIntArray450[--anInt5009];
						Static354.method4992(local137);
						return;
					}
					if (arg0 == 1118) {
						local137.aBoolean438 = anIntArray450[--anInt5009] == 1;
						Static354.method4992(local137);
						return;
					}
					if (arg0 == 1119) {
						local137.aBoolean437 = anIntArray450[--anInt5009] == 1;
						Static354.method4992(local137);
						return;
					}
					if (arg0 == 1120) {
						anInt5009 -= 2;
						local137.anInt6429 = anIntArray450[anInt5009];
						local137.anInt6440 = anIntArray450[anInt5009 + 1];
						Static354.method4992(local137);
						if (local137.anInt6447 == 0) {
							Static199.method3150(local137, false);
						}
						return;
					}
					if (arg0 == 1121) {
						anInt5009 -= 2;
						local137.anInt6499 = (short) anIntArray450[anInt5009];
						local137.anInt6488 = (short) anIntArray450[anInt5009 + 1];
						Static354.method4992(local137);
						return;
					}
					if (arg0 == 1122) {
						local137.aBoolean432 = anIntArray450[--anInt5009] == 1;
						Static354.method4992(local137);
						return;
					}
					if (arg0 == 1123) {
						local137.anInt6462 = anIntArray450[--anInt5009];
						Static354.method4992(local137);
						if (local137.anInt6487 == -1) {
							Static347.method4916(local137.anInt6423);
						}
						return;
					}
					if (arg0 == 1124) {
						local19 = anIntArray450[--anInt5009];
						local137.aBoolean434 = local19 == 1;
						Static354.method4992(local137);
						return;
					}
					if (arg0 == 1125) {
						anInt5009 -= 2;
						local137.anInt6433 = anIntArray450[anInt5009];
						local137.anInt6451 = anIntArray450[anInt5009 + 1];
						Static354.method4992(local137);
						return;
					}
					if (arg0 == 1126) {
						local137.anInt6444 = anIntArray450[--anInt5009];
						Static354.method4992(local137);
						return;
					}
					@Pc(1454) Class255 local1454;
					if (arg0 == 1127) {
						anInt5009 -= 2;
						local19 = anIntArray450[anInt5009];
						local25 = anIntArray450[anInt5009 + 1];
						local1454 = Static414.aClass258_2.method5882(local19);
						if (local25 != local1454.anInt7133) {
							local137.method5362(local19, local25);
							return;
						}
						local137.method5358(local19);
						return;
					}
					if (arg0 == 1128) {
						local19 = anIntArray450[--anInt5009];
						local1488 = aStringArray37[--anInt5007];
						local1454 = Static414.aClass258_2.method5882(local19);
						if (!local1454.aString68.equals(local1488)) {
							local137.method5369(local19, local1488);
							return;
						}
						local137.method5358(local19);
						return;
					}
				} else if ((arg0 < 1200 || arg0 >= 1300) && (arg0 < 2200 || arg0 >= 2300)) {
					@Pc(2290) int local2290;
					if (arg0 >= 1300 && arg0 < 1400 || arg0 >= 2300 && arg0 < 2400) {
						if (arg0 >= 2000) {
							arg0 -= 1000;
							local137 = Static299.method4387(anIntArray450[--anInt5009]);
						} else {
							local137 = arg1 ? aClass239_8 : aClass239_7;
						}
						if (arg0 == 1300) {
							local19 = anIntArray450[--anInt5009] - 1;
							if (local19 >= 0 && local19 <= 9) {
								local137.method5361(local19, aStringArray37[--anInt5007]);
								return;
							}
							anInt5007--;
							return;
						}
						if (arg0 == 1301) {
							anInt5009 -= 2;
							local19 = anIntArray450[anInt5009];
							local25 = anIntArray450[anInt5009 + 1];
							if (local19 == -1 && local25 == -1) {
								local137.aClass239_15 = null;
								return;
							}
							local137.aClass239_15 = Static316.method5795(local25, local19);
							return;
						}
						if (arg0 == 1302) {
							local19 = anIntArray450[--anInt5009];
							if (local19 != Static276.anInt4711 && local19 != Static324.anInt5292 && local19 != Static9.anInt166) {
								return;
							}
							local137.anInt6445 = local19;
							return;
						}
						if (arg0 == 1303) {
							local137.anInt6478 = anIntArray450[--anInt5009];
							return;
						}
						if (arg0 == 1304) {
							local137.anInt6471 = anIntArray450[--anInt5009];
							return;
						}
						if (arg0 == 1305) {
							local137.aString56 = aStringArray37[--anInt5007];
							return;
						}
						if (arg0 == 1306) {
							local137.aString58 = aStringArray37[--anInt5007];
							return;
						}
						if (arg0 == 1307) {
							local137.aStringArray45 = null;
							return;
						}
						if (arg0 == 1308) {
							local137.anInt6416 = anIntArray450[--anInt5009];
							local137.anInt6461 = anIntArray450[--anInt5009];
							return;
						}
						if (arg0 == 1309) {
							local19 = anIntArray450[--anInt5009];
							local25 = anIntArray450[--anInt5009];
							if (local25 >= 1 && local25 <= 10) {
								local137.method5371(local25 - 1, local19);
							}
							return;
						}
						if (arg0 == 1310) {
							local137.aString60 = aStringArray37[--anInt5007];
							return;
						}
						if (arg0 == 1311) {
							local137.anInt6410 = anIntArray450[--anInt5009];
							return;
						}
						if (arg0 == 1312 || arg0 == 1313) {
							if (arg0 == 1312) {
								anInt5009 -= 3;
								local19 = anIntArray450[anInt5009] - 1;
								local25 = anIntArray450[anInt5009 + 1];
								local353 = anIntArray450[anInt5009 + 2];
								if (local19 < 0 || local19 > 9) {
									throw new RuntimeException("IOR13121313");
								}
							} else {
								anInt5009 -= 2;
								local19 = 10;
								local25 = anIntArray450[anInt5009];
								local353 = anIntArray450[anInt5009 + 1];
							}
							if (local137.aByteArray82 == null) {
								if (local25 == 0) {
									return;
								}
								local137.aByteArray82 = new byte[11];
								local137.aByteArray81 = new byte[11];
								local137.anIntArray565 = new int[11];
							}
							local137.aByteArray82[local19] = (byte) local25;
							if (local25 == 0) {
								local137.aBoolean433 = false;
								for (local2290 = 0; local2290 < local137.aByteArray82.length; local2290++) {
									if (local137.aByteArray82[local2290] != 0) {
										local137.aBoolean433 = true;
										break;
									}
								}
							} else {
								local137.aBoolean433 = true;
							}
							local137.aByteArray81[local19] = (byte) local353;
							return;
						}
						if (arg0 == 1314) {
							local137.anInt6465 = anIntArray450[--anInt5009];
							return;
						}
					} else if (arg0 >= 1400 && arg0 < 1500 || arg0 >= 2400 && arg0 < 2500) {
						if (arg0 >= 2000) {
							arg0 -= 1000;
							local137 = Static299.method4387(anIntArray450[--anInt5009]);
						} else {
							local137 = arg1 ? aClass239_8 : aClass239_7;
						}
						local1101 = aStringArray37[--anInt5007];
						@Pc(2369) int[] local2369 = null;
						if (local1101.length() > 0 && local1101.charAt(local1101.length() - 1) == 'Y') {
							local353 = anIntArray450[--anInt5009];
							if (local353 > 0) {
								local2369 = new int[local353];
								while (local353-- > 0) {
									local2369[local353] = anIntArray450[--anInt5009];
								}
							}
							local1101 = local1101.substring(0, local1101.length() - 1);
						}
						@Pc(2421) Object[] local2421 = new Object[local1101.length() + 1];
						for (local2290 = local2421.length - 1; local2290 >= 1; local2290--) {
							if (local1101.charAt(local2290 - 1) == 's') {
								local2421[local2290] = aStringArray37[--anInt5007];
							} else {
								local2421[local2290] = Integer.valueOf(anIntArray450[--anInt5009]);
							}
						}
						local56 = anIntArray450[--anInt5009];
						if (local56 == -1) {
							local2421 = null;
						} else {
							local2421[0] = Integer.valueOf(local56);
						}
						if (arg0 == 1400) {
							local137.anObjectArray10 = local2421;
						} else if (arg0 == 1401) {
							local137.anObjectArray20 = local2421;
						} else if (arg0 == 1402) {
							local137.anObjectArray24 = local2421;
						} else if (arg0 == 1403) {
							local137.anObjectArray30 = local2421;
						} else if (arg0 == 1404) {
							local137.anObjectArray5 = local2421;
						} else if (arg0 == 1405) {
							local137.anObjectArray13 = local2421;
						} else if (arg0 == 1406) {
							local137.anObjectArray16 = local2421;
						} else if (arg0 == 1407) {
							local137.anObjectArray28 = local2421;
							local137.anIntArray562 = local2369;
						} else if (arg0 == 1408) {
							local137.anObjectArray6 = local2421;
						} else if (arg0 == 1409) {
							local137.anObjectArray21 = local2421;
						} else if (arg0 == 1410) {
							local137.anObjectArray22 = local2421;
						} else if (arg0 == 1411) {
							local137.anObjectArray27 = local2421;
						} else if (arg0 == 1412) {
							local137.anObjectArray17 = local2421;
						} else if (arg0 == 1414) {
							local137.anObjectArray26 = local2421;
							local137.anIntArray564 = local2369;
						} else if (arg0 == 1415) {
							local137.anObjectArray23 = local2421;
							local137.anIntArray561 = local2369;
						} else if (arg0 == 1416) {
							local137.anObjectArray18 = local2421;
						} else if (arg0 == 1417) {
							local137.anObjectArray34 = local2421;
						} else if (arg0 == 1418) {
							local137.anObjectArray9 = local2421;
						} else if (arg0 == 1419) {
							local137.anObjectArray7 = local2421;
						} else if (arg0 == 1420) {
							local137.anObjectArray11 = local2421;
						} else if (arg0 == 1421) {
							local137.anObjectArray15 = local2421;
						} else if (arg0 == 1422) {
							local137.anObjectArray33 = local2421;
						} else if (arg0 == 1423) {
							local137.anObjectArray32 = local2421;
						} else if (arg0 == 1424) {
							local137.anObjectArray31 = local2421;
						} else if (arg0 == 1425) {
							local137.anObjectArray29 = local2421;
						} else if (arg0 == 1426) {
							local137.anObjectArray19 = local2421;
						} else if (arg0 == 1427) {
							local137.anObjectArray35 = local2421;
						} else if (arg0 == 1428) {
							local137.anObjectArray14 = local2421;
							local137.anIntArray563 = local2369;
						} else if (arg0 == 1429) {
							local137.anObjectArray25 = local2421;
							local137.anIntArray557 = local2369;
						} else if (arg0 == 1430) {
							local137.anObjectArray8 = local2421;
						}
						local137.aBoolean431 = true;
						return;
					} else if (arg0 < 1600) {
						local137 = arg1 ? aClass239_8 : aClass239_7;
						if (arg0 == 1500) {
							anIntArray450[anInt5009++] = local137.anInt6484;
							return;
						}
						if (arg0 == 1501) {
							anIntArray450[anInt5009++] = local137.anInt6483;
							return;
						}
						if (arg0 == 1502) {
							anIntArray450[anInt5009++] = local137.anInt6435;
							return;
						}
						if (arg0 == 1503) {
							anIntArray450[anInt5009++] = local137.anInt6408;
							return;
						}
						if (arg0 == 1504) {
							anIntArray450[anInt5009++] = local137.aBoolean428 ? 1 : 0;
							return;
						}
						if (arg0 == 1505) {
							anIntArray450[anInt5009++] = local137.anInt6479;
							return;
						}
						if (arg0 == 1506) {
							local158 = Static257.method3954(local137);
							anIntArray450[anInt5009++] = local158 == null ? -1 : local158.anInt6423;
							return;
						}
					} else {
						@Pc(3017) Class255 local3017;
						if (arg0 < 1700) {
							local137 = arg1 ? aClass239_8 : aClass239_7;
							if (arg0 == 1600) {
								anIntArray450[anInt5009++] = local137.anInt6495;
								return;
							}
							if (arg0 == 1601) {
								anIntArray450[anInt5009++] = local137.anInt6438;
								return;
							}
							if (arg0 == 1602) {
								aStringArray37[anInt5007++] = local137.aString59;
								return;
							}
							if (arg0 == 1603) {
								anIntArray450[anInt5009++] = local137.anInt6429;
								return;
							}
							if (arg0 == 1604) {
								anIntArray450[anInt5009++] = local137.anInt6440;
								return;
							}
							if (arg0 == 1605) {
								anIntArray450[anInt5009++] = local137.anInt6462;
								return;
							}
							if (arg0 == 1606) {
								anIntArray450[anInt5009++] = local137.anInt6458;
								return;
							}
							if (arg0 == 1607) {
								anIntArray450[anInt5009++] = local137.anInt6486;
								return;
							}
							if (arg0 == 1608) {
								anIntArray450[anInt5009++] = local137.anInt6449;
								return;
							}
							if (arg0 == 1609) {
								anIntArray450[anInt5009++] = local137.anInt6414;
								return;
							}
							if (arg0 == 1610) {
								anIntArray450[anInt5009++] = local137.anInt6496;
								return;
							}
							if (arg0 == 1611) {
								anIntArray450[anInt5009++] = local137.anInt6463;
								return;
							}
							if (arg0 == 1612) {
								anIntArray450[anInt5009++] = local137.anInt6455;
								return;
							}
							if (arg0 == 1613) {
								local19 = anIntArray450[--anInt5009];
								local3017 = Static414.aClass258_2.method5882(local19);
								if (local3017.method5849()) {
									aStringArray37[anInt5007++] = local137.method5357(local19, local3017.aString68);
								} else {
									anIntArray450[anInt5009++] = local137.method5363(local3017.anInt7133, local19);
								}
							}
						} else if (arg0 < 1800) {
							local137 = arg1 ? aClass239_8 : aClass239_7;
							if (arg0 == 1700) {
								anIntArray450[anInt5009++] = local137.anInt6492;
								return;
							}
							if (arg0 == 1701) {
								if (local137.anInt6492 != -1) {
									anIntArray450[anInt5009++] = local137.anInt6466;
									return;
								}
								anIntArray450[anInt5009++] = 0;
								return;
							}
							if (arg0 == 1702) {
								anIntArray450[anInt5009++] = local137.anInt6487;
								return;
							}
						} else if (arg0 < 1900) {
							local137 = arg1 ? aClass239_8 : aClass239_7;
							if (arg0 == 1800) {
								anIntArray450[anInt5009++] = Static54.method1017(local137).method4842();
								return;
							}
							if (arg0 == 1801) {
								local19 = anIntArray450[--anInt5009];
								local19--;
								if (local137.aStringArray45 != null && local19 < local137.aStringArray45.length && local137.aStringArray45[local19] != null) {
									aStringArray37[anInt5007++] = local137.aStringArray45[local19];
									return;
								}
								aStringArray37[anInt5007++] = "";
								return;
							}
							if (arg0 == 1802) {
								if (local137.aString56 == null) {
									aStringArray37[anInt5007++] = "";
									return;
								}
								aStringArray37[anInt5007++] = local137.aString56;
								return;
							}
						} else if (arg0 < 2000 || arg0 >= 2900 && arg0 < 3000) {
							if (arg0 >= 2000) {
								local137 = Static299.method4387(anIntArray450[--anInt5009]);
								arg0 -= 1000;
							} else {
								local137 = arg1 ? aClass239_8 : aClass239_7;
							}
							if (anInt5017 >= 10) {
								throw new RuntimeException("C29xx-1");
							}
							if (arg0 == 1927) {
								if (local137.anObjectArray35 == null) {
									return;
								}
								@Pc(3254) Class6_Sub29 local3254 = new Class6_Sub29();
								local3254.aClass239_10 = local137;
								local3254.anObjectArray4 = local137.anObjectArray35;
								local3254.anInt5266 = anInt5017 + 1;
								Static357.aClass88_41.method1878(local3254);
								return;
							}
						} else if (arg0 < 2600) {
							local137 = Static299.method4387(anIntArray450[--anInt5009]);
							if (arg0 == 2500) {
								anIntArray450[anInt5009++] = local137.anInt6484;
								return;
							}
							if (arg0 == 2501) {
								anIntArray450[anInt5009++] = local137.anInt6483;
								return;
							}
							if (arg0 == 2502) {
								anIntArray450[anInt5009++] = local137.anInt6435;
								return;
							}
							if (arg0 == 2503) {
								anIntArray450[anInt5009++] = local137.anInt6408;
								return;
							}
							if (arg0 == 2504) {
								anIntArray450[anInt5009++] = local137.aBoolean428 ? 1 : 0;
								return;
							}
							if (arg0 == 2505) {
								anIntArray450[anInt5009++] = local137.anInt6479;
								return;
							}
							if (arg0 == 1506) {
								local158 = Static257.method3954(local137);
								anIntArray450[anInt5009++] = local158 == null ? -1 : local158.anInt6423;
								return;
							}
						} else if (arg0 < 2700) {
							local137 = Static299.method4387(anIntArray450[--anInt5009]);
							if (arg0 == 2600) {
								anIntArray450[anInt5009++] = local137.anInt6495;
								return;
							}
							if (arg0 == 2601) {
								anIntArray450[anInt5009++] = local137.anInt6438;
								return;
							}
							if (arg0 == 2602) {
								aStringArray37[anInt5007++] = local137.aString59;
								return;
							}
							if (arg0 == 2603) {
								anIntArray450[anInt5009++] = local137.anInt6429;
								return;
							}
							if (arg0 == 2604) {
								anIntArray450[anInt5009++] = local137.anInt6440;
								return;
							}
							if (arg0 == 2605) {
								anIntArray450[anInt5009++] = local137.anInt6462;
								return;
							}
							if (arg0 == 2606) {
								anIntArray450[anInt5009++] = local137.anInt6458;
								return;
							}
							if (arg0 == 2607) {
								anIntArray450[anInt5009++] = local137.anInt6486;
								return;
							}
							if (arg0 == 2608) {
								anIntArray450[anInt5009++] = local137.anInt6449;
								return;
							}
							if (arg0 == 2609) {
								anIntArray450[anInt5009++] = local137.anInt6414;
								return;
							}
							if (arg0 == 2610) {
								anIntArray450[anInt5009++] = local137.anInt6496;
								return;
							}
							if (arg0 == 2611) {
								anIntArray450[anInt5009++] = local137.anInt6463;
								return;
							}
							if (arg0 == 2612) {
								anIntArray450[anInt5009++] = local137.anInt6455;
								return;
							}
						} else {
							@Pc(3751) Class6_Sub16 local3751;
							@Pc(3649) Class6_Sub16 local3649;
							if (arg0 < 2800) {
								if (arg0 == 2700) {
									local137 = Static299.method4387(anIntArray450[--anInt5009]);
									anIntArray450[anInt5009++] = local137.anInt6492;
									return;
								}
								if (arg0 == 2701) {
									local137 = Static299.method4387(anIntArray450[--anInt5009]);
									if (local137.anInt6492 != -1) {
										anIntArray450[anInt5009++] = local137.anInt6466;
										return;
									}
									anIntArray450[anInt5009++] = 0;
									return;
								}
								if (arg0 == 2702) {
									local13 = anIntArray450[--anInt5009];
									local3649 = (Class6_Sub16) Static20.aClass137_3.method3175((long) local13);
									if (local3649 != null) {
										anIntArray450[anInt5009++] = 1;
										return;
									}
									anIntArray450[anInt5009++] = 0;
									return;
								}
								if (arg0 == 2703) {
									local137 = Static299.method4387(anIntArray450[--anInt5009]);
									if (local137.aClass239Array1 == null) {
										anIntArray450[anInt5009++] = 0;
										return;
									}
									local19 = local137.aClass239Array1.length;
									for (local25 = 0; local25 < local137.aClass239Array1.length; local25++) {
										if (local137.aClass239Array1[local25] == null) {
											local19 = local25;
											break;
										}
									}
									anIntArray450[anInt5009++] = local19;
									return;
								}
								if (arg0 == 2704 || arg0 == 2705) {
									anInt5009 -= 2;
									local13 = anIntArray450[anInt5009];
									local19 = anIntArray450[anInt5009 + 1];
									local3751 = (Class6_Sub16) Static20.aClass137_3.method3175((long) local13);
									if (local3751 != null && local3751.anInt2715 == local19) {
										anIntArray450[anInt5009++] = 1;
										return;
									}
									anIntArray450[anInt5009++] = 0;
									return;
								}
							} else if (arg0 < 2900) {
								local137 = Static299.method4387(anIntArray450[--anInt5009]);
								if (arg0 == 2800) {
									anIntArray450[anInt5009++] = Static54.method1017(local137).method4842();
									return;
								}
								if (arg0 == 2801) {
									local19 = anIntArray450[--anInt5009];
									local19--;
									if (local137.aStringArray45 != null && local19 < local137.aStringArray45.length && local137.aStringArray45[local19] != null) {
										aStringArray37[anInt5007++] = local137.aStringArray45[local19];
										return;
									}
									aStringArray37[anInt5007++] = "";
									return;
								}
								if (arg0 == 2802) {
									if (local137.aString56 == null) {
										aStringArray37[anInt5007++] = "";
										return;
									}
									aStringArray37[anInt5007++] = local137.aString56;
									return;
								}
							} else {
								@Pc(3888) String local3888;
								if (arg0 < 3200) {
									if (arg0 == 3100) {
										local3888 = aStringArray37[--anInt5007];
										Static109.method1805(local3888);
										return;
									}
									if (arg0 == 3101) {
										anInt5009 -= 2;
										Static181.method2824(Static134.aClass3_Sub3_Sub6_Sub1_1, anIntArray450[anInt5009], anIntArray450[anInt5009 + 1]);
										return;
									}
									if (arg0 == 3103) {
										Static229.method3474();
										return;
									}
									if (arg0 == 3104) {
										local3888 = aStringArray37[--anInt5007];
										local19 = 0;
										if (Static176.method2767(local3888)) {
											local19 = Static265.method4063(local3888);
										}
										Static298.method4373(Static52.aClass25_17);
										Static449.aClass6_Sub15_Sub1_2.method3107(local19);
										return;
									}
									if (arg0 == 3105) {
										local3888 = aStringArray37[--anInt5007];
										Static298.method4373(Static200.aClass25_51);
										Static449.aClass6_Sub15_Sub1_2.method3075(local3888.length() + 1);
										Static449.aClass6_Sub15_Sub1_2.method3094(local3888);
										return;
									}
									if (arg0 == 3106) {
										local3888 = aStringArray37[--anInt5007];
										Static298.method4373(Static38.aClass25_13);
										Static449.aClass6_Sub15_Sub1_2.method3075(local3888.length() + 1);
										Static449.aClass6_Sub15_Sub1_2.method3094(local3888);
										return;
									}
									if (arg0 == 3107) {
										local13 = anIntArray450[--anInt5009];
										local1101 = aStringArray37[--anInt5007];
										Static189.method5440(local1101, local13);
										return;
									}
									if (arg0 == 3108) {
										anInt5009 -= 3;
										local13 = anIntArray450[anInt5009];
										local19 = anIntArray450[anInt5009 + 1];
										local25 = anIntArray450[anInt5009 + 2];
										local35 = Static299.method4387(local25);
										Static244.method3775(local13, local35, local19);
										return;
									}
									if (arg0 == 3109) {
										anInt5009 -= 2;
										local13 = anIntArray450[anInt5009];
										local19 = anIntArray450[anInt5009 + 1];
										local210 = arg1 ? aClass239_8 : aClass239_7;
										Static244.method3775(local13, local210, local19);
										return;
									}
									if (arg0 == 3110) {
										local13 = anIntArray450[--anInt5009];
										Static298.method4373(Static425.aClass25_111);
										Static449.aClass6_Sub15_Sub1_2.method3100(local13);
										return;
									}
									if (arg0 == 3111) {
										anInt5009 -= 2;
										local13 = anIntArray450[anInt5009];
										local19 = anIntArray450[anInt5009 + 1];
										local3751 = (Class6_Sub16) Static20.aClass137_3.method3175((long) local13);
										if (local3751 != null) {
											Static60.method1108(true, local3751.anInt2715 != local19, local3751);
										}
										Static128.method2087(local13, local19, 3, true);
										return;
									}
									if (arg0 == 3112) {
										anInt5009--;
										local13 = anIntArray450[anInt5009];
										local3649 = (Class6_Sub16) Static20.aClass137_3.method3175((long) local13);
										if (local3649 != null && local3649.anInt2717 == 3) {
											Static60.method1108(true, true, local3649);
										}
										return;
									}
									if (arg0 == 3113) {
										Static95.method1652(aStringArray37[--anInt5007]);
										return;
									}
									if (arg0 == 3114) {
										anInt5009 -= 2;
										local13 = anIntArray450[anInt5009];
										local19 = anIntArray450[anInt5009 + 1];
										local1488 = aStringArray37[--anInt5007];
										Static84.method1521(local1488, local13, "", local19, "");
										return;
									}
								} else if (arg0 < 3300) {
									if (arg0 == 3200) {
										anInt5009 -= 3;
										Static350.method4969(anIntArray450[anInt5009], anIntArray450[anInt5009 + 2], 255, anIntArray450[anInt5009 + 1]);
										return;
									}
									if (arg0 == 3201) {
										Static190.method2936(255, anIntArray450[--anInt5009], 50);
										return;
									}
									if (arg0 == 3202) {
										anInt5009 -= 2;
										Static65.method1231(anIntArray450[anInt5009 + 1], anIntArray450[anInt5009], 255);
										return;
									}
									if (arg0 == 3203) {
										anInt5009 -= 4;
										Static350.method4969(anIntArray450[anInt5009], anIntArray450[anInt5009 + 2], anIntArray450[anInt5009 + 3], anIntArray450[anInt5009 + 1]);
										return;
									}
									if (arg0 == 3204) {
										anInt5009 -= 3;
										Static190.method2936(anIntArray450[anInt5009 + 1], anIntArray450[anInt5009], anIntArray450[anInt5009 + 2]);
										return;
									}
									if (arg0 == 3205) {
										anInt5009 -= 3;
										Static65.method1231(anIntArray450[anInt5009 + 1], anIntArray450[anInt5009], anIntArray450[anInt5009 + 2]);
										return;
									}
									if (arg0 == 3206) {
										anInt5009 -= 4;
										Static91.method1567(anIntArray450[anInt5009], anIntArray450[anInt5009 + 2], anIntArray450[anInt5009 + 1], anIntArray450[anInt5009 + 3]);
										return;
									}
								} else if (arg0 < 3400) {
									if (arg0 == 3300) {
										anIntArray450[anInt5009++] = Static125.anInt2225;
										return;
									}
									if (arg0 == 3301) {
										anInt5009 -= 2;
										local13 = anIntArray450[anInt5009];
										local19 = anIntArray450[anInt5009 + 1];
										anIntArray450[anInt5009++] = Static417.method5673(local13, local19, false);
										return;
									}
									if (arg0 == 3302) {
										anInt5009 -= 2;
										local13 = anIntArray450[anInt5009];
										local19 = anIntArray450[anInt5009 + 1];
										anIntArray450[anInt5009++] = Static418.method5685(local13, local19, false);
										return;
									}
									if (arg0 == 3303) {
										anInt5009 -= 2;
										local13 = anIntArray450[anInt5009];
										local19 = anIntArray450[anInt5009 + 1];
										anIntArray450[anInt5009++] = Static205.method1173(local19, local13, false);
										return;
									}
									if (arg0 == 3304) {
										local13 = anIntArray450[--anInt5009];
										anIntArray450[anInt5009++] = Static172.aClass16_1.method279(local13).anInt6943;
										return;
									}
									if (arg0 == 3305) {
										local13 = anIntArray450[--anInt5009];
										anIntArray450[anInt5009++] = Static422.anIntArray605[local13];
										return;
									}
									if (arg0 == 3306) {
										local13 = anIntArray450[--anInt5009];
										anIntArray450[anInt5009++] = Static393.anIntArray496[local13];
										return;
									}
									if (arg0 == 3307) {
										local13 = anIntArray450[--anInt5009];
										anIntArray450[anInt5009++] = Static327.anIntArray487[local13];
										return;
									}
									if (arg0 == 3308) {
										@Pc(4605) byte local4605 = Static134.aClass3_Sub3_Sub6_Sub1_1.aByte93;
										local19 = (Static134.aClass3_Sub3_Sub6_Sub1_1.anInt6675 >> 7) + Static206.anInt3592;
										local25 = (Static134.aClass3_Sub3_Sub6_Sub1_1.anInt6677 >> 7) + Static99.anInt1814;
										anIntArray450[anInt5009++] = (local4605 << 28) + (local19 << 14) + local25;
										return;
									}
									if (arg0 == 3309) {
										local13 = anIntArray450[--anInt5009];
										anIntArray450[anInt5009++] = local13 >> 14 & 0x3FFF;
										return;
									}
									if (arg0 == 3310) {
										local13 = anIntArray450[--anInt5009];
										anIntArray450[anInt5009++] = local13 >> 28;
										return;
									}
									if (arg0 == 3311) {
										local13 = anIntArray450[--anInt5009];
										anIntArray450[anInt5009++] = local13 & 0x3FFF;
										return;
									}
									if (arg0 == 3312) {
										anIntArray450[anInt5009++] = Static118.aBoolean158 ? 1 : 0;
										return;
									}
									if (arg0 == 3313) {
										anInt5009 -= 2;
										local13 = anIntArray450[anInt5009];
										local19 = anIntArray450[anInt5009 + 1];
										anIntArray450[anInt5009++] = Static417.method5673(local13, local19, true);
										return;
									}
									if (arg0 == 3314) {
										anInt5009 -= 2;
										local13 = anIntArray450[anInt5009];
										local19 = anIntArray450[anInt5009 + 1];
										anIntArray450[anInt5009++] = Static418.method5685(local13, local19, true);
										return;
									}
									if (arg0 == 3315) {
										anInt5009 -= 2;
										local13 = anIntArray450[anInt5009];
										local19 = anIntArray450[anInt5009 + 1];
										anIntArray450[anInt5009++] = Static205.method1173(local19, local13, true);
										return;
									}
									if (arg0 == 3316) {
										if (Static221.anInt3810 >= 2) {
											anIntArray450[anInt5009++] = Static221.anInt3810;
											return;
										}
										anIntArray450[anInt5009++] = 0;
										return;
									}
									if (arg0 == 3317) {
										anIntArray450[anInt5009++] = Static96.anInt1785;
										return;
									}
									if (arg0 == 3318) {
										anIntArray450[anInt5009++] = Static53.anInt1053;
										return;
									}
									if (arg0 == 3321) {
										anIntArray450[anInt5009++] = Static376.anInt5184;
										return;
									}
									if (arg0 == 3322) {
										anIntArray450[anInt5009++] = Static311.anInt5062;
										return;
									}
									if (arg0 == 3323) {
										if (Static200.anInt3527 >= 5 && Static200.anInt3527 <= 9) {
											anIntArray450[anInt5009++] = 1;
											return;
										}
										anIntArray450[anInt5009++] = 0;
										return;
									}
									if (arg0 == 3324) {
										if (Static200.anInt3527 >= 5 && Static200.anInt3527 <= 9) {
											anIntArray450[anInt5009++] = Static200.anInt3527;
											return;
										}
										anIntArray450[anInt5009++] = 0;
										return;
									}
									if (arg0 == 3325) {
										anIntArray450[anInt5009++] = Static181.aBoolean223 ? 1 : 0;
										return;
									}
									if (arg0 == 3326) {
										anIntArray450[anInt5009++] = Static134.aClass3_Sub3_Sub6_Sub1_1.anInt5504;
										return;
									}
									if (arg0 == 3327) {
										anIntArray450[anInt5009++] = Static134.aClass3_Sub3_Sub6_Sub1_1.aClass73_1.aBoolean147 ? 1 : 0;
										return;
									}
									if (arg0 == 3328) {
										anIntArray450[anInt5009++] = Static311.aBoolean354 && !Static40.aBoolean73 ? 1 : 0;
										return;
									}
									if (arg0 == 3329) {
										anIntArray450[anInt5009++] = Static130.aBoolean175 ? 1 : 0;
										return;
									}
									if (arg0 == 3330) {
										local13 = anIntArray450[--anInt5009];
										anIntArray450[anInt5009++] = Static95.method1645(local13);
										return;
									}
									if (arg0 == 3331) {
										anInt5009 -= 2;
										local13 = anIntArray450[anInt5009];
										local19 = anIntArray450[anInt5009 + 1];
										anIntArray450[anInt5009++] = Static73.method1406(local19, false, local13);
										return;
									}
									if (arg0 == 3332) {
										anInt5009 -= 2;
										local13 = anIntArray450[anInt5009];
										local19 = anIntArray450[anInt5009 + 1];
										anIntArray450[anInt5009++] = Static73.method1406(local19, true, local13);
										return;
									}
									if (arg0 == 3333) {
										anIntArray450[anInt5009++] = Static32.anInt522;
										return;
									}
									if (arg0 == 3335) {
										anIntArray450[anInt5009++] = Static382.anInt6289;
										return;
									}
									if (arg0 == 3336) {
										anInt5009 -= 4;
										local13 = anIntArray450[anInt5009];
										local19 = anIntArray450[anInt5009 + 1];
										local25 = anIntArray450[anInt5009 + 2];
										local353 = anIntArray450[anInt5009 + 3];
										local13 += local19 << 14;
										local13 += local25 << 28;
										local13 += local353;
										anIntArray450[anInt5009++] = local13;
										return;
									}
									if (arg0 == 3337) {
										anIntArray450[anInt5009++] = Static441.anInt7213;
										return;
									}
									if (arg0 == 3338) {
										anIntArray450[anInt5009++] = Static144.method2411();
										return;
									}
								} else if (arg0 < 3500) {
									@Pc(5230) Class143 local5230;
									if (arg0 == 3400) {
										anInt5009 -= 2;
										local13 = anIntArray450[anInt5009];
										local19 = anIntArray450[anInt5009 + 1];
										local5230 = Static35.aClass122_1.method2750(local13);
										aStringArray37[anInt5007++] = local5230.method3277(local19);
										return;
									}
									if (arg0 == 3408) {
										anInt5009 -= 4;
										local13 = anIntArray450[anInt5009];
										local19 = anIntArray450[anInt5009 + 1];
										local25 = anIntArray450[anInt5009 + 2];
										local353 = anIntArray450[anInt5009 + 3];
										@Pc(5276) Class143 local5276 = Static35.aClass122_1.method2750(local25);
										if (local5276.aChar3 == local13 && local5276.aChar4 == local19) {
											if (local19 == 115) {
												aStringArray37[anInt5007++] = local5276.method3277(local353);
												return;
											}
											anIntArray450[anInt5009++] = local5276.method3272(local353);
											return;
										}
										throw new RuntimeException("C3408-1");
									}
									if (arg0 == 3409) {
										anInt5009 -= 3;
										local13 = anIntArray450[anInt5009];
										local19 = anIntArray450[anInt5009 + 1];
										local25 = anIntArray450[anInt5009 + 2];
										if (local19 == -1) {
											throw new RuntimeException("C3409-2");
										}
										@Pc(5352) Class143 local5352 = Static35.aClass122_1.method2750(local19);
										if (local5352.aChar4 != local13) {
											throw new RuntimeException("C3409-1");
										}
										anIntArray450[anInt5009++] = local5352.method3276(local25) ? 1 : 0;
										return;
									}
									if (arg0 == 3410) {
										local13 = anIntArray450[--anInt5009];
										local1101 = aStringArray37[--anInt5007];
										if (local13 == -1) {
											throw new RuntimeException("C3410-2");
										}
										local5230 = Static35.aClass122_1.method2750(local13);
										if (local5230.aChar4 != 's') {
											throw new RuntimeException("C3410-1");
										}
										anIntArray450[anInt5009++] = local5230.method3280(local1101) ? 1 : 0;
										return;
									}
									if (arg0 == 3411) {
										local13 = anIntArray450[--anInt5009];
										@Pc(5450) Class143 local5450 = Static35.aClass122_1.method2750(local13);
										anIntArray450[anInt5009++] = local5450.aClass137_21.method3177();
										return;
									}
								} else if (arg0 < 3700) {
									if (arg0 == 3600) {
										if (Static302.anInt4975 == 0) {
											anIntArray450[anInt5009++] = -2;
											return;
										}
										if (Static302.anInt4975 == 1) {
											anIntArray450[anInt5009++] = -1;
											return;
										}
										anIntArray450[anInt5009++] = Static165.anInt2940;
										return;
									}
									if (arg0 == 3601) {
										local13 = anIntArray450[--anInt5009];
										if (Static302.anInt4975 == 2 && local13 < Static165.anInt2940) {
											aStringArray37[anInt5007++] = Static208.aStringArray24[local13];
											if (Static76.aStringArray8[local13] != null) {
												aStringArray37[anInt5007++] = Static76.aStringArray8[local13];
												return;
											}
											aStringArray37[anInt5007++] = "";
											return;
										}
										aStringArray37[anInt5007++] = "";
										aStringArray37[anInt5007++] = "";
										return;
									}
									if (arg0 == 3602) {
										local13 = anIntArray450[--anInt5009];
										if (Static302.anInt4975 == 2 && local13 < Static165.anInt2940) {
											anIntArray450[anInt5009++] = Static262.anIntArray399[local13];
											return;
										}
										anIntArray450[anInt5009++] = 0;
										return;
									}
									if (arg0 == 3603) {
										local13 = anIntArray450[--anInt5009];
										if (Static302.anInt4975 == 2 && local13 < Static165.anInt2940) {
											anIntArray450[anInt5009++] = Static85.anIntArray168[local13];
											return;
										}
										anIntArray450[anInt5009++] = 0;
										return;
									}
									if (arg0 == 3604) {
										local3888 = aStringArray37[--anInt5007];
										local19 = anIntArray450[--anInt5009];
										Static40.method800(local19, local3888);
										return;
									}
									if (arg0 == 3605) {
										local3888 = aStringArray37[--anInt5007];
										Static186.method2909(local3888);
										return;
									}
									if (arg0 == 3606) {
										local3888 = aStringArray37[--anInt5007];
										Static124.method3218(local3888);
										return;
									}
									if (arg0 == 3607) {
										local3888 = aStringArray37[--anInt5007];
										Static287.method4278(local3888, false);
										return;
									}
									if (arg0 == 3608) {
										local3888 = aStringArray37[--anInt5007];
										Static344.method4844(local3888);
										return;
									}
									if (arg0 == 3609) {
										local3888 = aStringArray37[--anInt5007];
										if (local3888.startsWith("<img=0>") || local3888.startsWith("<img=1>")) {
											local3888 = local3888.substring(7);
										}
										anIntArray450[anInt5009++] = Static364.method5130(local3888) ? 1 : 0;
										return;
									}
									if (arg0 == 3610) {
										local13 = anIntArray450[--anInt5009];
										if (Static302.anInt4975 == 2 && local13 < Static165.anInt2940) {
											aStringArray37[anInt5007++] = Static315.aStringArray28[local13];
											return;
										}
										aStringArray37[anInt5007++] = "";
										return;
									}
									if (arg0 == 3611) {
										if (Static390.aString61 != null) {
											aStringArray37[anInt5007++] = Static225.method3416(Static390.aString61);
											return;
										}
										aStringArray37[anInt5007++] = "";
										return;
									}
									if (arg0 == 3612) {
										if (Static390.aString61 != null) {
											anIntArray450[anInt5009++] = Static88.anInt1654;
											return;
										}
										anIntArray450[anInt5009++] = 0;
										return;
									}
									if (arg0 == 3613) {
										local13 = anIntArray450[--anInt5009];
										if (Static390.aString61 != null && local13 < Static88.anInt1654) {
											aStringArray37[anInt5007++] = Static41.aClass85Array1[local13].aString15;
											return;
										}
										aStringArray37[anInt5007++] = "";
										return;
									}
									if (arg0 == 3614) {
										local13 = anIntArray450[--anInt5009];
										if (Static390.aString61 != null && local13 < Static88.anInt1654) {
											anIntArray450[anInt5009++] = Static41.aClass85Array1[local13].anInt2011;
											return;
										}
										anIntArray450[anInt5009++] = 0;
										return;
									}
									if (arg0 == 3615) {
										local13 = anIntArray450[--anInt5009];
										if (Static390.aString61 != null && local13 < Static88.anInt1654) {
											anIntArray450[anInt5009++] = Static41.aClass85Array1[local13].aByte20;
											return;
										}
										anIntArray450[anInt5009++] = 0;
										return;
									}
									if (arg0 == 3616) {
										anIntArray450[anInt5009++] = Static256.aByte44;
										return;
									}
									if (arg0 == 3617) {
										local3888 = aStringArray37[--anInt5007];
										Static217.method3361(local3888);
										return;
									}
									if (arg0 == 3618) {
										anIntArray450[anInt5009++] = Static351.aByte82;
										return;
									}
									if (arg0 == 3619) {
										local3888 = aStringArray37[--anInt5007];
										Static167.method2724(local3888);
										return;
									}
									if (arg0 == 3620) {
										Static314.method5785();
										return;
									}
									if (arg0 == 3621) {
										if (Static302.anInt4975 == 0) {
											anIntArray450[anInt5009++] = -1;
											return;
										}
										anIntArray450[anInt5009++] = Static203.anInt3584;
										return;
									}
									if (arg0 == 3622) {
										local13 = anIntArray450[--anInt5009];
										if (Static302.anInt4975 != 0 && local13 < Static203.anInt3584) {
											aStringArray37[anInt5007++] = Static411.aStringArray46[local13];
											if (Static371.aStringArray43[local13] != null) {
												aStringArray37[anInt5007++] = Static371.aStringArray43[local13];
												return;
											}
											aStringArray37[anInt5007++] = "";
											return;
										}
										aStringArray37[anInt5007++] = "";
										aStringArray37[anInt5007++] = "";
										return;
									}
									if (arg0 == 3623) {
										local3888 = aStringArray37[--anInt5007];
										if (local3888.startsWith("<img=0>") || local3888.startsWith("<img=1>")) {
											local3888 = local3888.substring(7);
										}
										anIntArray450[anInt5009++] = Static250.method3853(local3888) ? 1 : 0;
										return;
									}
									if (arg0 == 3624) {
										local13 = anIntArray450[--anInt5009];
										if (Static41.aClass85Array1 != null && local13 < Static88.anInt1654 && Static41.aClass85Array1[local13].aString17.equalsIgnoreCase(Static134.aClass3_Sub3_Sub6_Sub1_1.aString48)) {
											anIntArray450[anInt5009++] = 1;
											return;
										}
										anIntArray450[anInt5009++] = 0;
										return;
									}
									if (arg0 == 3625) {
										if (Static209.aString33 != null) {
											aStringArray37[anInt5007++] = Static209.aString33;
											return;
										}
										aStringArray37[anInt5007++] = "";
										return;
									}
									if (arg0 == 3626) {
										local13 = anIntArray450[--anInt5009];
										if (Static390.aString61 != null && local13 < Static88.anInt1654) {
											aStringArray37[anInt5007++] = Static41.aClass85Array1[local13].aString18;
											return;
										}
										aStringArray37[anInt5007++] = "";
										return;
									}
									if (arg0 == 3627) {
										local13 = anIntArray450[--anInt5009];
										if (Static302.anInt4975 == 2 && local13 >= 0 && local13 < Static165.anInt2940) {
											anIntArray450[anInt5009++] = Static381.aBooleanArray26[local13] ? 1 : 0;
											return;
										}
										anIntArray450[anInt5009++] = 0;
										return;
									}
									if (arg0 == 3628) {
										local3888 = aStringArray37[--anInt5007];
										if (local3888.startsWith("<img=0>") || local3888.startsWith("<img=1>")) {
											local3888 = local3888.substring(7);
										}
										anIntArray450[anInt5009++] = Static114.method1871(local3888);
										return;
									}
									if (arg0 == 3629) {
										anIntArray450[anInt5009++] = Static124.anInt3591;
										return;
									}
									if (arg0 == 3630) {
										local3888 = aStringArray37[--anInt5007];
										Static287.method4278(local3888, true);
										return;
									}
									if (arg0 == 3631) {
										local13 = anIntArray450[--anInt5009];
										anIntArray450[anInt5009++] = Static323.aBooleanArray22[local13] ? 1 : 0;
										return;
									}
									if (arg0 == 3632) {
										local13 = anIntArray450[--anInt5009];
										if (Static390.aString61 != null && local13 < Static88.anInt1654) {
											aStringArray37[anInt5007++] = Static41.aClass85Array1[local13].aString17;
											return;
										}
										aStringArray37[anInt5007++] = "";
										return;
									}
									if (arg0 == 3633) {
										local13 = anIntArray450[--anInt5009];
										if (Static302.anInt4975 != 0 && local13 < Static203.anInt3584) {
											aStringArray37[anInt5007++] = Static115.aStringArray15[local13];
											return;
										}
										aStringArray37[anInt5007++] = "";
										return;
									}
								} else if (arg0 < 4000) {
									if (arg0 == 3903) {
										local13 = anIntArray450[--anInt5009];
										anIntArray450[anInt5009++] = Static400.aClass180Array1[local13].method4145();
										return;
									}
									if (arg0 == 3904) {
										local13 = anIntArray450[--anInt5009];
										anIntArray450[anInt5009++] = Static400.aClass180Array1[local13].anInt4661;
										return;
									}
									if (arg0 == 3905) {
										local13 = anIntArray450[--anInt5009];
										anIntArray450[anInt5009++] = Static400.aClass180Array1[local13].anInt4665;
										return;
									}
									if (arg0 == 3906) {
										local13 = anIntArray450[--anInt5009];
										anIntArray450[anInt5009++] = Static400.aClass180Array1[local13].anInt4662;
										return;
									}
									if (arg0 == 3907) {
										local13 = anIntArray450[--anInt5009];
										anIntArray450[anInt5009++] = Static400.aClass180Array1[local13].anInt4664;
										return;
									}
									if (arg0 == 3908) {
										local13 = anIntArray450[--anInt5009];
										anIntArray450[anInt5009++] = Static400.aClass180Array1[local13].anInt4666;
										return;
									}
									if (arg0 == 3910) {
										local13 = anIntArray450[--anInt5009];
										local19 = Static400.aClass180Array1[local13].method4147();
										anIntArray450[anInt5009++] = local19 == 0 ? 1 : 0;
										return;
									}
									if (arg0 == 3911) {
										local13 = anIntArray450[--anInt5009];
										local19 = Static400.aClass180Array1[local13].method4147();
										anIntArray450[anInt5009++] = local19 == 2 ? 1 : 0;
										return;
									}
									if (arg0 == 3912) {
										local13 = anIntArray450[--anInt5009];
										local19 = Static400.aClass180Array1[local13].method4147();
										anIntArray450[anInt5009++] = local19 == 5 ? 1 : 0;
										return;
									}
									if (arg0 == 3913) {
										local13 = anIntArray450[--anInt5009];
										local19 = Static400.aClass180Array1[local13].method4147();
										anIntArray450[anInt5009++] = local19 == 1 ? 1 : 0;
										return;
									}
								} else if (arg0 < 4100) {
									if (arg0 == 4000) {
										anInt5009 -= 2;
										local13 = anIntArray450[anInt5009];
										local19 = anIntArray450[anInt5009 + 1];
										anIntArray450[anInt5009++] = local13 + local19;
										return;
									}
									if (arg0 == 4001) {
										anInt5009 -= 2;
										local13 = anIntArray450[anInt5009];
										local19 = anIntArray450[anInt5009 + 1];
										anIntArray450[anInt5009++] = local13 - local19;
										return;
									}
									if (arg0 == 4002) {
										anInt5009 -= 2;
										local13 = anIntArray450[anInt5009];
										local19 = anIntArray450[anInt5009 + 1];
										anIntArray450[anInt5009++] = local13 * local19;
										return;
									}
									if (arg0 == 4003) {
										anInt5009 -= 2;
										local13 = anIntArray450[anInt5009];
										local19 = anIntArray450[anInt5009 + 1];
										anIntArray450[anInt5009++] = local13 / local19;
										return;
									}
									if (arg0 == 4004) {
										local13 = anIntArray450[--anInt5009];
										anIntArray450[anInt5009++] = (int) (Math.random() * (double) local13);
										return;
									}
									if (arg0 == 4005) {
										local13 = anIntArray450[--anInt5009];
										anIntArray450[anInt5009++] = (int) (Math.random() * (double) (local13 + 1));
										return;
									}
									if (arg0 == 4006) {
										anInt5009 -= 5;
										local13 = anIntArray450[anInt5009];
										local19 = anIntArray450[anInt5009 + 1];
										local25 = anIntArray450[anInt5009 + 2];
										local353 = anIntArray450[anInt5009 + 3];
										local2290 = anIntArray450[anInt5009 + 4];
										anIntArray450[anInt5009++] = local13 + (local19 - local13) * (local2290 - local25) / (local353 - local25);
										return;
									}
									@Pc(6960) long local6960;
									@Pc(6953) long local6953;
									if (arg0 == 4007) {
										anInt5009 -= 2;
										local6953 = anIntArray450[anInt5009];
										local6960 = anIntArray450[anInt5009 + 1];
										anIntArray450[anInt5009++] = (int) (local6953 + local6953 * local6960 / 100L);
										return;
									}
									if (arg0 == 4008) {
										anInt5009 -= 2;
										local13 = anIntArray450[anInt5009];
										local19 = anIntArray450[anInt5009 + 1];
										anIntArray450[anInt5009++] = local13 | 0x1 << local19;
										return;
									}
									if (arg0 == 4009) {
										anInt5009 -= 2;
										local13 = anIntArray450[anInt5009];
										local19 = anIntArray450[anInt5009 + 1];
										anIntArray450[anInt5009++] = local13 & -(0x1 << local19) - 1;
										return;
									}
									if (arg0 == 4010) {
										anInt5009 -= 2;
										local13 = anIntArray450[anInt5009];
										local19 = anIntArray450[anInt5009 + 1];
										anIntArray450[anInt5009++] = (local13 & 0x1 << local19) == 0 ? 0 : 1;
										return;
									}
									if (arg0 == 4011) {
										anInt5009 -= 2;
										local13 = anIntArray450[anInt5009];
										local19 = anIntArray450[anInt5009 + 1];
										anIntArray450[anInt5009++] = local13 % local19;
										return;
									}
									if (arg0 == 4012) {
										anInt5009 -= 2;
										local13 = anIntArray450[anInt5009];
										local19 = anIntArray450[anInt5009 + 1];
										if (local13 == 0) {
											anIntArray450[anInt5009++] = 0;
											return;
										}
										anIntArray450[anInt5009++] = (int) Math.pow((double) local13, (double) local19);
										return;
									}
									if (arg0 == 4013) {
										anInt5009 -= 2;
										local13 = anIntArray450[anInt5009];
										local19 = anIntArray450[anInt5009 + 1];
										if (local13 == 0) {
											anIntArray450[anInt5009++] = 0;
											return;
										}
										if (local19 == 0) {
											anIntArray450[anInt5009++] = Integer.MAX_VALUE;
											return;
										}
										anIntArray450[anInt5009++] = (int) Math.pow((double) local13, 1.0D / (double) local19);
										return;
									}
									if (arg0 == 4014) {
										anInt5009 -= 2;
										local13 = anIntArray450[anInt5009];
										local19 = anIntArray450[anInt5009 + 1];
										anIntArray450[anInt5009++] = local13 & local19;
										return;
									}
									if (arg0 == 4015) {
										anInt5009 -= 2;
										local13 = anIntArray450[anInt5009];
										local19 = anIntArray450[anInt5009 + 1];
										anIntArray450[anInt5009++] = local13 | local19;
										return;
									}
									if (arg0 == 4016) {
										anInt5009 -= 2;
										local13 = anIntArray450[anInt5009];
										local19 = anIntArray450[anInt5009 + 1];
										anIntArray450[anInt5009++] = local13 < local19 ? local13 : local19;
										return;
									}
									if (arg0 == 4017) {
										anInt5009 -= 2;
										local13 = anIntArray450[anInt5009];
										local19 = anIntArray450[anInt5009 + 1];
										anIntArray450[anInt5009++] = local13 > local19 ? local13 : local19;
										return;
									}
									if (arg0 == 4018) {
										anInt5009 -= 3;
										local6953 = anIntArray450[anInt5009];
										local6960 = anIntArray450[anInt5009 + 1];
										@Pc(7341) long local7341 = (long) anIntArray450[anInt5009 + 2];
										anIntArray450[anInt5009++] = (int) (local6953 * local7341 / local6960);
										return;
									}
								} else if (arg0 < 4200) {
									if (arg0 == 4100) {
										local3888 = aStringArray37[--anInt5007];
										local19 = anIntArray450[--anInt5009];
										aStringArray37[anInt5007++] = local3888 + local19;
										return;
									}
									if (arg0 == 4101) {
										anInt5007 -= 2;
										local3888 = aStringArray37[anInt5007];
										local1101 = aStringArray37[anInt5007 + 1];
										aStringArray37[anInt5007++] = local3888 + local1101;
										return;
									}
									if (arg0 == 4102) {
										local3888 = aStringArray37[--anInt5007];
										local19 = anIntArray450[--anInt5009];
										aStringArray37[anInt5007++] = local3888 + Static167.method2730(local19);
										return;
									}
									if (arg0 == 4103) {
										local3888 = aStringArray37[--anInt5007];
										aStringArray37[anInt5007++] = local3888.toLowerCase();
										return;
									}
									if (arg0 == 4104) {
										aStringArray37[anInt5007++] = method4419(anIntArray450[--anInt5009]);
										return;
									}
									if (arg0 == 4105) {
										anInt5007 -= 2;
										local3888 = aStringArray37[anInt5007];
										local1101 = aStringArray37[anInt5007 + 1];
										if (Static134.aClass3_Sub3_Sub6_Sub1_1.aClass73_1 != null && Static134.aClass3_Sub3_Sub6_Sub1_1.aClass73_1.aBoolean147) {
											aStringArray37[anInt5007++] = local1101;
											return;
										}
										aStringArray37[anInt5007++] = local3888;
										return;
									}
									if (arg0 == 4106) {
										local13 = anIntArray450[--anInt5009];
										aStringArray37[anInt5007++] = Integer.toString(local13);
										return;
									}
									if (arg0 == 4107) {
										anInt5007 -= 2;
										anIntArray450[anInt5009++] = Static342.method4814(aStringArray37[anInt5007 + 1], Static382.anInt6289, aStringArray37[anInt5007]);
										return;
									}
									@Pc(7624) Class201 local7624;
									if (arg0 == 4108) {
										local3888 = aStringArray37[--anInt5007];
										anInt5009 -= 2;
										local19 = anIntArray450[anInt5009];
										local25 = anIntArray450[anInt5009 + 1];
										local7624 = Static150.method2471(Static241.aClass158_55, local25);
										anIntArray450[anInt5009++] = local7624.method4454(Static205.aClass12Array3, local19, local3888);
										return;
									}
									if (arg0 == 4109) {
										local3888 = aStringArray37[--anInt5007];
										anInt5009 -= 2;
										local19 = anIntArray450[anInt5009];
										local25 = anIntArray450[anInt5009 + 1];
										local7624 = Static150.method2471(Static241.aClass158_55, local25);
										anIntArray450[anInt5009++] = local7624.method4449(Static205.aClass12Array3, local3888, local19);
										return;
									}
									if (arg0 == 4110) {
										anInt5007 -= 2;
										local3888 = aStringArray37[anInt5007];
										local1101 = aStringArray37[anInt5007 + 1];
										if (anIntArray450[--anInt5009] == 1) {
											aStringArray37[anInt5007++] = local3888;
											return;
										}
										aStringArray37[anInt5007++] = local1101;
										return;
									}
									if (arg0 == 4111) {
										local3888 = aStringArray37[--anInt5007];
										aStringArray37[anInt5007++] = Static296.method4364(local3888);
										return;
									}
									if (arg0 == 4112) {
										local3888 = aStringArray37[--anInt5007];
										local19 = anIntArray450[--anInt5009];
										if (local19 == -1) {
											throw new RuntimeException("null char");
										}
										aStringArray37[anInt5007++] = local3888 + (char) local19;
										return;
									}
									if (arg0 == 4113) {
										local13 = anIntArray450[--anInt5009];
										anIntArray450[anInt5009++] = Static57.method1068((char) local13) ? 1 : 0;
										return;
									}
									if (arg0 == 4114) {
										local13 = anIntArray450[--anInt5009];
										anIntArray450[anInt5009++] = Static284.method4265((char) local13) ? 1 : 0;
										return;
									}
									if (arg0 == 4115) {
										local13 = anIntArray450[--anInt5009];
										anIntArray450[anInt5009++] = Static432.method5872((char) local13) ? 1 : 0;
										return;
									}
									if (arg0 == 4116) {
										local13 = anIntArray450[--anInt5009];
										anIntArray450[anInt5009++] = Static138.method5579((char) local13) ? 1 : 0;
										return;
									}
									if (arg0 == 4117) {
										local3888 = aStringArray37[--anInt5007];
										if (local3888 != null) {
											anIntArray450[anInt5009++] = local3888.length();
											return;
										}
										anIntArray450[anInt5009++] = 0;
										return;
									}
									if (arg0 == 4118) {
										local3888 = aStringArray37[--anInt5007];
										anInt5009 -= 2;
										local19 = anIntArray450[anInt5009];
										local25 = anIntArray450[anInt5009 + 1];
										aStringArray37[anInt5007++] = local3888.substring(local19, local25);
										return;
									}
									if (arg0 == 4119) {
										local3888 = aStringArray37[--anInt5007];
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
										aStringArray37[anInt5007++] = local7987.toString();
										return;
									}
									if (arg0 == 4120) {
										local3888 = aStringArray37[--anInt5007];
										anInt5009 -= 2;
										local19 = anIntArray450[anInt5009];
										local25 = anIntArray450[anInt5009 + 1];
										anIntArray450[anInt5009++] = local3888.indexOf(local19, local25);
										return;
									}
									if (arg0 == 4121) {
										anInt5007 -= 2;
										local3888 = aStringArray37[anInt5007];
										local1101 = aStringArray37[anInt5007 + 1];
										local25 = anIntArray450[--anInt5009];
										anIntArray450[anInt5009++] = local3888.indexOf(local1101, local25);
										return;
									}
									if (arg0 == 4122) {
										local13 = anIntArray450[--anInt5009];
										anIntArray450[anInt5009++] = Character.toLowerCase((char) local13);
										return;
									}
									if (arg0 == 4123) {
										local13 = anIntArray450[--anInt5009];
										anIntArray450[anInt5009++] = Character.toUpperCase((char) local13);
										return;
									}
									if (arg0 == 4124) {
										local412 = anIntArray450[--anInt5009] != 0;
										local19 = anIntArray450[--anInt5009];
										aStringArray37[anInt5007++] = Static364.method5129((long) local19, Static382.anInt6289, local412, 0);
										return;
									}
									if (arg0 == 4125) {
										local3888 = aStringArray37[--anInt5007];
										local19 = anIntArray450[--anInt5009];
										@Pc(8210) Class201 local8210 = Static150.method2471(Static241.aClass158_55, local19);
										anIntArray450[anInt5009++] = local8210.method4460(Static205.aClass12Array3, local3888);
										return;
									}
								} else if (arg0 < 4300) {
									if (arg0 == 4200) {
										local13 = anIntArray450[--anInt5009];
										aStringArray37[anInt5007++] = Static354.aClass170_2.method3865(local13).aString8;
										return;
									}
									@Pc(8272) Class32 local8272;
									if (arg0 == 4201) {
										anInt5009 -= 2;
										local13 = anIntArray450[anInt5009];
										local19 = anIntArray450[anInt5009 + 1];
										local8272 = Static354.aClass170_2.method3865(local13);
										if (local19 >= 1 && local19 <= 5 && local8272.aStringArray2[local19 - 1] != null) {
											aStringArray37[anInt5007++] = local8272.aStringArray2[local19 - 1];
											return;
										}
										aStringArray37[anInt5007++] = "";
										return;
									}
									if (arg0 == 4202) {
										anInt5009 -= 2;
										local13 = anIntArray450[anInt5009];
										local19 = anIntArray450[anInt5009 + 1];
										local8272 = Static354.aClass170_2.method3865(local13);
										if (local19 >= 1 && local19 <= 5 && local8272.aStringArray3[local19 - 1] != null) {
											aStringArray37[anInt5007++] = local8272.aStringArray3[local19 - 1];
											return;
										}
										aStringArray37[anInt5007++] = "";
										return;
									}
									if (arg0 == 4203) {
										local13 = anIntArray450[--anInt5009];
										anIntArray450[anInt5009++] = Static354.aClass170_2.method3865(local13).anInt820;
										return;
									}
									if (arg0 == 4204) {
										local13 = anIntArray450[--anInt5009];
										anIntArray450[anInt5009++] = Static354.aClass170_2.method3865(local13).anInt860 == 1 ? 1 : 0;
										return;
									}
									@Pc(8435) Class32 local8435;
									if (arg0 == 4205) {
										local13 = anIntArray450[--anInt5009];
										local8435 = Static354.aClass170_2.method3865(local13);
										if (local8435.anInt836 == -1 && local8435.anInt838 >= 0) {
											anIntArray450[anInt5009++] = local8435.anInt838;
											return;
										}
										anIntArray450[anInt5009++] = local13;
										return;
									}
									if (arg0 == 4206) {
										local13 = anIntArray450[--anInt5009];
										local8435 = Static354.aClass170_2.method3865(local13);
										if (local8435.anInt836 >= 0 && local8435.anInt838 >= 0) {
											anIntArray450[anInt5009++] = local8435.anInt838;
											return;
										}
										anIntArray450[anInt5009++] = local13;
										return;
									}
									if (arg0 == 4207) {
										local13 = anIntArray450[--anInt5009];
										anIntArray450[anInt5009++] = Static354.aClass170_2.method3865(local13).aBoolean72 ? 1 : 0;
										return;
									}
									if (arg0 == 4208) {
										anInt5009 -= 2;
										local13 = anIntArray450[anInt5009];
										local19 = anIntArray450[anInt5009 + 1];
										local3017 = Static414.aClass258_2.method5882(local19);
										if (local3017.method5849()) {
											aStringArray37[anInt5007++] = Static354.aClass170_2.method3865(local13).method772(local19, local3017.aString68);
											return;
										}
										anIntArray450[anInt5009++] = Static354.aClass170_2.method3865(local13).method773(local19, local3017.anInt7133);
										return;
									}
									if (arg0 == 4209) {
										anInt5009 -= 2;
										local13 = anIntArray450[anInt5009];
										local19 = anIntArray450[anInt5009 + 1] - 1;
										local8272 = Static354.aClass170_2.method3865(local13);
										if (local8272.anInt823 == local19) {
											anIntArray450[anInt5009++] = local8272.anInt833;
											return;
										}
										if (local8272.anInt841 == local19) {
											anIntArray450[anInt5009++] = local8272.anInt865;
											return;
										}
										anIntArray450[anInt5009++] = -1;
										return;
									}
									if (arg0 == 4210) {
										local3888 = aStringArray37[--anInt5007];
										local19 = anIntArray450[--anInt5009];
										Static223.method3405(local3888, local19 == 1);
										anIntArray450[anInt5009++] = Static251.anInt4261;
										return;
									}
									if (arg0 == 4211) {
										if (Static73.aShortArray27 != null && Static28.anInt442 < Static251.anInt4261) {
											anIntArray450[anInt5009++] = Static73.aShortArray27[Static28.anInt442++] & 0xFFFF;
											return;
										}
										anIntArray450[anInt5009++] = -1;
										return;
									}
									if (arg0 == 4212) {
										Static28.anInt442 = 0;
										return;
									}
								} else if (arg0 < 4400) {
									if (arg0 == 4300) {
										anInt5009 -= 2;
										local13 = anIntArray450[anInt5009];
										local19 = anIntArray450[anInt5009 + 1];
										local3017 = Static414.aClass258_2.method5882(local19);
										if (local3017.method5849()) {
											aStringArray37[anInt5007++] = Static336.aClass59_2.method1468(local13).method287(local3017.aString68, local19);
											return;
										}
										anIntArray450[anInt5009++] = Static336.aClass59_2.method1468(local13).method291(local19, local3017.anInt7133);
										return;
									}
								} else if (arg0 < 4500) {
									if (arg0 == 4400) {
										anInt5009 -= 2;
										local13 = anIntArray450[anInt5009];
										local19 = anIntArray450[anInt5009 + 1];
										local3017 = Static414.aClass258_2.method5882(local19);
										if (local3017.method5849()) {
											aStringArray37[anInt5007++] = Static113.aClass127_2.method2820(local13).method2715(local19, local3017.aString68);
											return;
										}
										anIntArray450[anInt5009++] = Static113.aClass127_2.method2820(local13).method2723(local19, local3017.anInt7133);
										return;
									}
								} else if (arg0 < 4600) {
									if (arg0 == 4500) {
										anInt5009 -= 2;
										local13 = anIntArray450[anInt5009];
										local19 = anIntArray450[anInt5009 + 1];
										local3017 = Static414.aClass258_2.method5882(local19);
										if (local3017.method5849()) {
											aStringArray37[anInt5007++] = Static333.aClass50_3.method1391(local13).method158(local19, local3017.aString68);
											return;
										}
										anIntArray450[anInt5009++] = Static333.aClass50_3.method1391(local13).method165(local19, local3017.anInt7133);
										return;
									}
								} else if (arg0 < 4700 && arg0 == 4600) {
									local13 = anIntArray450[--anInt5009];
									@Pc(8936) Class208 local8936 = Static255.aClass222_1.method5008(local13);
									if (local8936.anIntArray489 != null && local8936.anIntArray489.length > 0) {
										local25 = 0;
										local353 = local8936.anIntArray490[0];
										for (local2290 = 1; local2290 < local8936.anIntArray489.length; local2290++) {
											if (local8936.anIntArray490[local2290] > local353) {
												local25 = local2290;
												local353 = local8936.anIntArray490[local2290];
											}
										}
										anIntArray450[anInt5009++] = local8936.anIntArray489[local25];
										return;
									}
									anIntArray450[anInt5009++] = local8936.anInt5580;
									return;
								}
							}
						}
					}
				} else {
					if (arg0 >= 2000) {
						arg0 -= 1000;
						local137 = Static299.method4387(anIntArray450[--anInt5009]);
					} else {
						local137 = arg1 ? aClass239_8 : aClass239_7;
					}
					Static354.method4992(local137);
					if (arg0 == 1200 || arg0 == 1205 || arg0 == 1208 || arg0 == 1209 || arg0 == 1212 || arg0 == 1213) {
						anInt5009 -= 2;
						local19 = anIntArray450[anInt5009];
						local25 = anIntArray450[anInt5009 + 1];
						if (local137.anInt6487 == -1) {
							Static437.method5898(local137.anInt6423);
							Static347.method4916(local137.anInt6423);
							Static229.method3472(local137.anInt6423);
						}
						if (local19 == -1) {
							local137.anInt6446 = 1;
							local137.anInt6426 = -1;
							local137.anInt6492 = -1;
							return;
						}
						local137.anInt6492 = local19;
						local137.anInt6466 = local25;
						if (arg0 == 1208 || arg0 == 1209) {
							local137.aBoolean429 = true;
						} else {
							local137.aBoolean429 = false;
						}
						@Pc(1630) Class32 local1630 = Static354.aClass170_2.method3865(local19);
						local137.anInt6458 = local1630.anInt875;
						local137.anInt6449 = local1630.anInt877;
						local137.anInt6486 = local1630.anInt867;
						local137.anInt6496 = local1630.anInt816;
						local137.anInt6463 = local1630.anInt845;
						local137.anInt6462 = local1630.anInt849;
						if (arg0 == 1205 || arg0 == 1209) {
							local137.anInt6474 = 0;
						} else if (arg0 == 1212 || arg0 == 1213) {
							local137.anInt6474 = 1;
						} else {
							local137.anInt6474 = 2;
						}
						if (local137.anInt6407 > 0) {
							local137.anInt6462 = local137.anInt6462 * 32 / local137.anInt6407;
							return;
						}
						if (local137.anInt6459 > 0) {
							local137.anInt6462 = local137.anInt6462 * 32 / local137.anInt6459;
						}
						return;
					}
					if (arg0 == 1201) {
						local137.anInt6446 = 2;
						local137.anInt6426 = anIntArray450[--anInt5009];
						if (local137.anInt6487 == -1) {
							Static195.method3061(local137.anInt6423);
						}
						return;
					}
					if (arg0 == 1202) {
						local137.anInt6446 = 3;
						local137.anInt6426 = -1;
						if (local137.anInt6487 == -1) {
							Static195.method3061(local137.anInt6423);
						}
						return;
					}
					if (arg0 == 1203) {
						local137.anInt6446 = 6;
						local137.anInt6426 = anIntArray450[--anInt5009];
						if (local137.anInt6487 == -1) {
							Static195.method3061(local137.anInt6423);
						}
						return;
					}
					if (arg0 == 1204) {
						local137.anInt6446 = 5;
						local137.anInt6426 = anIntArray450[--anInt5009];
						if (local137.anInt6487 == -1) {
							Static195.method3061(local137.anInt6423);
						}
						return;
					}
					if (arg0 == 1206) {
						anInt5009 -= 4;
						local137.anInt6409 = anIntArray450[anInt5009];
						local137.anInt6434 = anIntArray450[anInt5009 + 1];
						local137.anInt6430 = anIntArray450[anInt5009 + 2];
						local137.anInt6468 = anIntArray450[anInt5009 + 3];
						Static354.method4992(local137);
						return;
					}
					if (arg0 == 1207) {
						anInt5009 -= 2;
						local137.anInt6436 = anIntArray450[anInt5009];
						local137.anInt6439 = anIntArray450[anInt5009 + 1];
						Static354.method4992(local137);
						return;
					}
					if (arg0 == 1210) {
						anInt5009 -= 4;
						local137.anInt6426 = anIntArray450[anInt5009];
						local137.anInt6413 = anIntArray450[anInt5009 + 1];
						if (anIntArray450[anInt5009 + 2] == 1) {
							local137.anInt6446 = 9;
						} else {
							local137.anInt6446 = 8;
						}
						if (anIntArray450[anInt5009 + 3] == 1) {
							local137.aBoolean429 = true;
						} else {
							local137.aBoolean429 = false;
						}
						if (local137.anInt6487 == -1) {
							Static195.method3061(local137.anInt6423);
						}
						return;
					}
					if (arg0 == 1211) {
						local137.anInt6446 = 5;
						local137.anInt6426 = Static251.anInt4268;
						local137.anInt6413 = 0;
						if (local137.anInt6487 == -1) {
							Static195.method3061(local137.anInt6423);
						}
						return;
					}
				}
			} else {
				if (arg0 >= 2000) {
					arg0 -= 1000;
					local137 = Static299.method4387(anIntArray450[--anInt5009]);
				} else {
					local137 = arg1 ? aClass239_8 : aClass239_7;
				}
				if (arg0 == 1000) {
					anInt5009 -= 4;
					local137.anInt6454 = anIntArray450[anInt5009];
					local137.anInt6485 = anIntArray450[anInt5009 + 1];
					local19 = anIntArray450[anInt5009 + 2];
					if (local19 < 0) {
						local19 = 0;
					} else if (local19 > 5) {
						local19 = 5;
					}
					local25 = anIntArray450[anInt5009 + 3];
					if (local25 < 0) {
						local25 = 0;
					} else if (local25 > 5) {
						local25 = 5;
					}
					local137.aByte90 = (byte) local19;
					local137.aByte91 = (byte) local25;
					Static354.method4992(local137);
					Static117.method1896(local137);
					if (local137.anInt6487 == -1) {
						Static90.method1557(local137.anInt6423);
					}
					return;
				}
				if (arg0 == 1001) {
					anInt5009 -= 4;
					local137.anInt6459 = anIntArray450[anInt5009];
					local137.anInt6425 = anIntArray450[anInt5009 + 1];
					local137.anInt6407 = 0;
					local137.anInt6412 = 0;
					local19 = anIntArray450[anInt5009 + 2];
					if (local19 < 0) {
						local19 = 0;
					} else if (local19 > 4) {
						local19 = 4;
					}
					local25 = anIntArray450[anInt5009 + 3];
					if (local25 < 0) {
						local25 = 0;
					} else if (local25 > 4) {
						local25 = 4;
					}
					local137.aByte92 = (byte) local19;
					local137.lb = (byte) local25;
					Static354.method4992(local137);
					Static117.method1896(local137);
					if (local137.anInt6447 == 0) {
						Static199.method3150(local137, false);
					}
					return;
				}
				if (arg0 == 1003) {
					@Pc(620) boolean local620 = anIntArray450[--anInt5009] == 1;
					if (local137.aBoolean428 != local620) {
						local137.aBoolean428 = local620;
						Static354.method4992(local137);
					}
					if (local137.anInt6487 == -1) {
						Static15.method247(local137.anInt6423);
					}
					return;
				}
				if (arg0 == 1004) {
					anInt5009 -= 2;
					local137.anInt6494 = anIntArray450[anInt5009];
					local137.anInt6448 = anIntArray450[anInt5009 + 1];
					Static354.method4992(local137);
					Static117.method1896(local137);
					if (local137.anInt6447 == 0) {
						Static199.method3150(local137, false);
					}
					return;
				}
				if (arg0 == 1005) {
					local137.aBoolean426 = anIntArray450[--anInt5009] == 1;
					return;
				}
			}
		}
		throw new IllegalStateException();
	}

	@OriginalMember(owner = "client!pj", name = "a", descriptor = "(I)V")
	private static void method4416(@OriginalArg(0) int arg0) {
		@Pc(3) Class239 local3 = Static299.method4387(arg0);
		if (local3 == null) {
			return;
		}
		@Pc(9) int local9 = arg0 >>> 16;
		@Pc(13) Class239[] local13 = Static419.aClass239ArrayArray2[local9];
		if (local13 == null) {
			@Pc(19) Class239[] local19 = Static129.aClass239ArrayArray1[local9];
			@Pc(22) int local22 = local19.length;
			local13 = Static419.aClass239ArrayArray2[local9] = new Class239[local22];
			Static459.method5353(local19, 0, local13, 0, local19.length);
		}
		@Pc(38) int local38;
		for (local38 = 0; local38 < local13.length && local13[local38] != local3; local38++) {
		}
		if (local38 >= local13.length) {
			return;
		}
		Static459.method5353(local13, 0, local13, 1, local38);
		local13[0] = local3;
	}

	@OriginalMember(owner = "client!pj", name = "b", descriptor = "(I)V")
	private static void method4417(@OriginalArg(0) int arg0) {
		@Pc(3) Class239 local3 = Static299.method4387(arg0);
		if (local3 == null) {
			return;
		}
		@Pc(9) int local9 = arg0 >>> 16;
		@Pc(13) Class239[] local13 = Static419.aClass239ArrayArray2[local9];
		if (local13 == null) {
			@Pc(19) Class239[] local19 = Static129.aClass239ArrayArray1[local9];
			@Pc(22) int local22 = local19.length;
			local13 = Static419.aClass239ArrayArray2[local9] = new Class239[local22];
			Static459.method5353(local19, 0, local13, 0, local19.length);
		}
		@Pc(38) int local38;
		for (local38 = 0; local38 < local13.length && local13[local38] != local3; local38++) {
		}
		if (local38 >= local13.length) {
			return;
		}
		Static459.method5353(local13, local38 + 1, local13, local38, local13.length - local38 - 1);
		local13[local13.length - 1] = local3;
	}

	@OriginalMember(owner = "client!pj", name = "a", descriptor = "(Lclient!qd;I)V")
	private static void method4418(@OriginalArg(0) Class6_Sub29 arg0, @OriginalArg(1) int arg1) {
		@Pc(2) Object[] local2 = arg0.anObjectArray4;
		@Pc(8) int local8 = (Integer) local2[0];
		@Pc(12) Class6_Sub1_Sub18 local12 = Static140.method2317(local8);
		if (local12 == null) {
			return;
		}
		anIntArray452 = new int[local12.anInt7272];
		@Pc(21) int local21 = 0;
		aStringArray36 = new String[local12.anInt7269];
		@Pc(27) int local27 = 0;
		for (@Pc(29) int local29 = 1; local29 < local2.length; local29++) {
			if (local2[local29] instanceof Integer) {
				@Pc(41) int local41 = (Integer) local2[local29];
				if (local41 == -2147483647) {
					local41 = arg0.anInt5273;
				}
				if (local41 == -2147483646) {
					local41 = arg0.anInt5268;
				}
				if (local41 == -2147483645) {
					local41 = arg0.aClass239_10 == null ? -1 : arg0.aClass239_10.anInt6423;
				}
				if (local41 == -2147483644) {
					local41 = arg0.anInt5270;
				}
				if (local41 == -2147483643) {
					local41 = arg0.aClass239_10 == null ? -1 : arg0.aClass239_10.anInt6487;
				}
				if (local41 == -2147483642) {
					local41 = arg0.aClass239_9 == null ? -1 : arg0.aClass239_9.anInt6423;
				}
				if (local41 == -2147483641) {
					local41 = arg0.aClass239_9 == null ? -1 : arg0.aClass239_9.anInt6487;
				}
				if (local41 == -2147483640) {
					local41 = arg0.anInt5267;
				}
				if (local41 == -2147483639) {
					local41 = arg0.anInt5272;
				}
				anIntArray452[local21++] = local41;
			} else if (local2[local29] instanceof String) {
				@Pc(135) String local135 = (String) local2[local29];
				if (local135.equals("event_opbase")) {
					local135 = arg0.aString44;
				}
				aStringArray36[local27++] = local135;
			}
		}
		anInt5017 = arg0.anInt5266;
		method4420(local12, arg1);
	}

	@OriginalMember(owner = "client!pj", name = "c", descriptor = "(I)Ljava/lang/String;")
	private static String method4419(@OriginalArg(0) int arg0) {
		@Pc(6) long local6 = ((long) arg0 + 11745L) * 86400000L;
		aCalendar2.setTime(new Date(local6));
		@Pc(16) int local16 = aCalendar2.get(5);
		@Pc(20) int local20 = aCalendar2.get(2);
		@Pc(24) int local24 = aCalendar2.get(1);
		return local16 + "-" + aStringArray38[local20] + "-" + local24;
	}

	@OriginalMember(owner = "client!pj", name = "a", descriptor = "(Lclient!wt;I)V")
	private static void method4420(@OriginalArg(0) Class6_Sub1_Sub18 arg0, @OriginalArg(1) int arg1) {
		anInt5009 = 0;
		anInt5007 = 0;
		@Pc(5) int local5 = -1;
		@Pc(8) int[] local8 = arg0.anIntArray644;
		@Pc(11) int[] local11 = arg0.anIntArray641;
		@Pc(13) byte local13 = -1;
		anInt5010 = 0;
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
						method4415(local31, local802);
					} else if (local31 >= 5000 && local31 < 10000) {
						method4427(local31, local802);
					} else {
						throw new IllegalStateException("Command: " + local31);
					}
				} else if (local31 == 0) {
					anIntArray450[anInt5009++] = local11[local5];
				} else {
					@Pc(54) int local54;
					if (local31 == 1) {
						local54 = local11[local5];
						anIntArray450[anInt5009++] = Static71.aClass126_1.anIntArray291[local54];
					} else if (local31 == 2) {
						local54 = local11[local5];
						Static71.aClass126_1.method2805(anIntArray450[--anInt5009], local54);
					} else if (local31 == 3) {
						aStringArray37[anInt5007++] = arg0.aStringArray47[local5];
					} else if (local31 == 6) {
						local5 += local11[local5];
					} else if (local31 == 7) {
						anInt5009 -= 2;
						if (anIntArray450[anInt5009] != anIntArray450[anInt5009 + 1]) {
							local5 += local11[local5];
						}
					} else if (local31 == 8) {
						anInt5009 -= 2;
						if (anIntArray450[anInt5009] == anIntArray450[anInt5009 + 1]) {
							local5 += local11[local5];
						}
					} else if (local31 == 9) {
						anInt5009 -= 2;
						if (anIntArray450[anInt5009] < anIntArray450[anInt5009 + 1]) {
							local5 += local11[local5];
						}
					} else if (local31 == 10) {
						anInt5009 -= 2;
						if (anIntArray450[anInt5009] > anIntArray450[anInt5009 + 1]) {
							local5 += local11[local5];
						}
					} else if (local31 == 21) {
						if (anInt5010 == 0) {
							return;
						}
						@Pc(216) Class80 local216 = aClass80Array1[--anInt5010];
						arg0 = local216.aClass6_Sub1_Sub18_1;
						local8 = arg0.anIntArray644;
						local11 = arg0.anIntArray641;
						local5 = local216.anInt1925;
						anIntArray452 = local216.anIntArray204;
						aStringArray36 = local216.aStringArray13;
					} else if (local31 == 25) {
						local54 = local11[local5];
						anIntArray450[anInt5009++] = Static71.aClass126_1.method2802(local54);
					} else if (local31 == 27) {
						local54 = local11[local5];
						Static71.aClass126_1.method2806(local54, anIntArray450[--anInt5009]);
					} else if (local31 == 31) {
						anInt5009 -= 2;
						if (anIntArray450[anInt5009] <= anIntArray450[anInt5009 + 1]) {
							local5 += local11[local5];
						}
					} else if (local31 == 32) {
						anInt5009 -= 2;
						if (anIntArray450[anInt5009] >= anIntArray450[anInt5009 + 1]) {
							local5 += local11[local5];
						}
					} else if (local31 == 33) {
						anIntArray450[anInt5009++] = anIntArray452[local11[local5]];
					} else if (local31 == 34) {
						anIntArray452[local11[local5]] = anIntArray450[--anInt5009];
					} else if (local31 == 35) {
						aStringArray37[anInt5007++] = aStringArray36[local11[local5]];
					} else if (local31 == 36) {
						aStringArray36[local11[local5]] = aStringArray37[--anInt5007];
					} else if (local31 == 37) {
						local54 = local11[local5];
						anInt5007 -= local54;
						@Pc(400) String local400 = Static378.method5920(local54, anInt5007, aStringArray37);
						aStringArray37[anInt5007++] = local400;
					} else if (local31 == 38) {
						anInt5009--;
					} else if (local31 == 39) {
						anInt5007--;
					} else {
						@Pc(452) int local452;
						if (local31 == 40) {
							local54 = local11[local5];
							@Pc(436) Class6_Sub1_Sub18 local436 = Static140.method2317(local54);
							if (local436 == null) {
								throw new RuntimeException();
							}
							@Pc(446) int[] local446 = new int[local436.anInt7272];
							@Pc(450) String[] local450 = new String[local436.anInt7269];
							for (local452 = 0; local452 < local436.anInt7273; local452++) {
								local446[local452] = anIntArray450[anInt5009 + local452 - local436.anInt7273];
							}
							for (@Pc(471) int local471 = 0; local471 < local436.anInt7271; local471++) {
								local450[local471] = aStringArray37[anInt5007 + local471 - local436.anInt7271];
							}
							anInt5009 -= local436.anInt7273;
							anInt5007 -= local436.anInt7271;
							@Pc(502) Class80 local502 = new Class80();
							local502.aClass6_Sub1_Sub18_1 = arg0;
							local502.anInt1925 = local5;
							local502.anIntArray204 = anIntArray452;
							local502.aStringArray13 = aStringArray36;
							if (anInt5010 >= aClass80Array1.length) {
								throw new RuntimeException();
							}
							aClass80Array1[anInt5010++] = local502;
							arg0 = local436;
							local8 = local436.anIntArray644;
							local11 = local436.anIntArray641;
							local5 = -1;
							anIntArray452 = local446;
							aStringArray36 = local450;
						} else if (local31 == 42) {
							anIntArray450[anInt5009++] = Static235.anIntArray358[local11[local5]];
						} else if (local31 == 43) {
							local54 = local11[local5];
							Static235.anIntArray358[local54] = anIntArray450[--anInt5009];
							Static155.method2531(local54);
							Static243.aBoolean270 |= Static434.aBooleanArray27[local54];
						} else if (local31 == 44) {
							local54 = local11[local5] >> 16;
							local603 = local11[local5] & 0xFFFF;
							@Pc(611) int local611 = anIntArray450[--anInt5009];
							if (local611 >= 0 && local611 <= 5000) {
								anIntArray451[local54] = local611;
								@Pc(626) byte local626 = -1;
								if (local603 == 105) {
									local626 = 0;
								}
								local452 = 0;
								while (true) {
									if (local452 >= local611) {
										continue label260;
									}
									anIntArrayArray44[local54][local452] = local626;
									local452++;
								}
							}
							throw new RuntimeException();
						} else if (local31 == 45) {
							local54 = local11[local5];
							local603 = anIntArray450[--anInt5009];
							if (local603 < 0 || local603 >= anIntArray451[local54]) {
								throw new RuntimeException();
							}
							anIntArray450[anInt5009++] = anIntArrayArray44[local54][local603];
						} else if (local31 == 46) {
							local54 = local11[local5];
							anInt5009 -= 2;
							local603 = anIntArray450[anInt5009];
							if (local603 < 0 || local603 >= anIntArray451[local54]) {
								throw new RuntimeException();
							}
							anIntArrayArray44[local54][local603] = anIntArray450[anInt5009 + 1];
						} else if (local31 == 47) {
							@Pc(730) String local730 = Static307.aStringArray18[local11[local5]];
							if (local730 == null) {
								local730 = "null";
							}
							aStringArray37[anInt5007++] = local730;
						} else if (local31 == 48) {
							local54 = local11[local5];
							Static307.aStringArray18[local54] = aStringArray37[--anInt5007];
							Static447.method5955(local54);
						} else if (local31 == 51) {
							@Pc(774) Class137 local774 = arg0.aClass137Array1[local11[local5]];
							@Pc(787) Class6_Sub44 local787 = (Class6_Sub44) local774.method3175((long) anIntArray450[--anInt5009]);
							if (local787 != null) {
								local5 += local787.anInt7027;
							}
						}
					}
				}
			}
		} catch (@Pc(837) Exception local837) {
			@Pc(855) StringBuffer local855;
			if (arg0.aString71 == null) {
				local855 = new StringBuffer(30);
				local855.append("CS2: ").append(arg0.aLong217).append(" ");
				for (local603 = anInt5010 - 1; local603 >= 0; local603--) {
					local855.append("v: ").append(aClass80Array1[local603].aClass6_Sub1_Sub18_1.aLong217).append(" ");
				}
				local855.append("op: ").append(local13);
				Static40.method799(local837, local855.toString());
			} else {
				Static109.method1805("Clientscript error in: " + arg0.aString71);
				local855 = new StringBuffer(30);
				local855.append("Clientscript error in: ").append(arg0.aString71).append("\n");
				for (local603 = anInt5010 - 1; local603 >= 0; local603--) {
					local855.append("via: ").append(aClass80Array1[local603].aClass6_Sub1_Sub18_1.aString71).append("\n");
				}
				local855.append("Op: ").append(local13).append("\n");
				@Pc(895) String local895 = local837.getMessage();
				if (local895 != null && local895.length() > 0) {
					local855.append("Message: ").append(local895).append("\n");
				}
				Static40.method799(local837, local855.toString());
				Static98.method5863(local855.toString());
			}
		}
	}

	@OriginalMember(owner = "client!pj", name = "a", descriptor = "(Lclient!oq;II)V")
	public static void method4421(@OriginalArg(0) Class193 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(5) Class6_Sub1_Sub18 local5 = Static349.method4949(arg1, arg2, arg0);
		if (local5 == null) {
			return;
		}
		anIntArray452 = new int[local5.anInt7272];
		aStringArray36 = new String[local5.anInt7269];
		if (local5.aClass193_9 == Static250.aClass193_4 || local5.aClass193_9 == Static359.aClass193_7 || local5.aClass193_9 == Static107.aClass193_3) {
			@Pc(30) int local30 = 0;
			@Pc(32) int local32 = 0;
			if (Static332.aClass239_11 != null) {
				local30 = Static332.aClass239_11.anInt6484;
				local32 = Static332.aClass239_11.anInt6483;
			}
			anIntArray452[0] = Static37.aClass71_26.method1618() - local30;
			anIntArray452[1] = Static37.aClass71_26.method1624() - local32;
		}
		method4420(local5, 200000);
	}

	@OriginalMember(owner = "client!pj", name = "b", descriptor = "(IZ)V")
	public static void method4422() {
	}

	@OriginalMember(owner = "client!pj", name = "d", descriptor = "(I)V")
	public static void method4423(@OriginalArg(0) int arg0) {
		if (arg0 == -1 || !Static367.method5802(arg0)) {
			return;
		}
		@Pc(12) Class239[] local12 = Static129.aClass239ArrayArray1[arg0];
		for (@Pc(14) int local14 = 0; local14 < local12.length; local14++) {
			@Pc(19) Class239 local19 = local12[local14];
			if (local19.anObjectArray12 != null) {
				@Pc(26) Class6_Sub29 local26 = new Class6_Sub29();
				local26.aClass239_10 = local19;
				local26.anObjectArray4 = local19.anObjectArray12;
				method4418(local26, 2000000);
			}
		}
	}

	@OriginalMember(owner = "client!pj", name = "a", descriptor = "(Lclient!qd;)V")
	public static void method4424(@OriginalArg(0) Class6_Sub29 arg0) {
		method4418(arg0, 200000);
	}

	@OriginalMember(owner = "client!pj", name = "a", descriptor = "()V")
	public static void method4425() {
	}

	@OriginalMember(owner = "client!pj", name = "c", descriptor = "(IZ)V")
	private static void method4427(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1) {
		@Pc(157) int local157;
		@Pc(1313) boolean local1313;
		@Pc(89) int local89;
		@Pc(75) String local75;
		@Pc(192) int local192;
		@Pc(95) int local95;
		@Pc(81) String local81;
		if (arg0 < 5100) {
			if (arg0 == 5000) {
				anIntArray450[anInt5009++] = Static56.anInt1177;
				return;
			}
			if (arg0 == 5001) {
				anInt5009 -= 3;
				Static56.anInt1177 = anIntArray450[anInt5009];
				Static289.aClass253_2 = Static425.method5789(anIntArray450[anInt5009 + 1]);
				if (Static289.aClass253_2 == null) {
					Static289.aClass253_2 = Static343.aClass253_3;
				}
				Static258.anInt4426 = anIntArray450[anInt5009 + 2];
				Static298.method4373(Static451.aClass25_101);
				Static449.aClass6_Sub15_Sub1_2.method3075(Static56.anInt1177);
				Static449.aClass6_Sub15_Sub1_2.method3075(Static289.aClass253_2.anInt7017);
				Static449.aClass6_Sub15_Sub1_2.method3075(Static258.anInt4426);
				return;
			}
			if (arg0 == 5002) {
				anInt5007 -= 2;
				local75 = aStringArray37[anInt5007];
				local81 = aStringArray37[anInt5007 + 1];
				anInt5009 -= 2;
				local89 = anIntArray450[anInt5009];
				local95 = anIntArray450[anInt5009 + 1];
				if (local81 == null) {
					local81 = "";
				}
				if (local81.length() > 80) {
					local81 = local81.substring(0, 80);
				}
				Static298.method4373(Static194.aClass25_91);
				Static449.aClass6_Sub15_Sub1_2.method3075(Static384.method5308(local75) + Static384.method5308(local81) + 2);
				Static449.aClass6_Sub15_Sub1_2.method3094(local75);
				Static449.aClass6_Sub15_Sub1_2.method3075(local89 - 1);
				Static449.aClass6_Sub15_Sub1_2.method3075(local95);
				Static449.aClass6_Sub15_Sub1_2.method3094(local81);
				return;
			}
			if (arg0 == 5003) {
				local157 = anIntArray450[--anInt5009];
				local81 = null;
				if (local157 < 100) {
					local81 = Static131.aStringArray21[local157];
				}
				if (local81 == null) {
					local81 = "";
				}
				aStringArray37[anInt5007++] = local81;
				return;
			}
			if (arg0 == 5004) {
				local157 = anIntArray450[--anInt5009];
				local192 = -1;
				if (local157 < 100 && Static131.aStringArray21[local157] != null) {
					local192 = Static421.anIntArray456[local157];
				}
				anIntArray450[anInt5009++] = local192;
				return;
			}
			if (arg0 == 5005) {
				if (Static289.aClass253_2 == null) {
					anIntArray450[anInt5009++] = -1;
					return;
				}
				anIntArray450[anInt5009++] = Static289.aClass253_2.anInt7017;
				return;
			}
			if (arg0 == 5008 || arg0 == 5021 || arg0 == 5022) {
				local75 = aStringArray37[--anInt5007];
				method4414(local75, arg0);
				return;
			}
			if (arg0 == 5009) {
				anInt5007 -= 2;
				local75 = aStringArray37[anInt5007];
				local81 = aStringArray37[anInt5007 + 1];
				if (Static221.anInt3810 != 0 || (!Static311.aBoolean354 || Static40.aBoolean73) && !Static130.aBoolean175) {
					Static298.method4373(Static275.aClass25_73);
					Static449.aClass6_Sub15_Sub1_2.method3075(0);
					local89 = Static449.aClass6_Sub15_Sub1_2.anInt3487;
					Static449.aClass6_Sub15_Sub1_2.method3094(local75);
					Static155.method2530(Static449.aClass6_Sub15_Sub1_2, local81);
					Static449.aClass6_Sub15_Sub1_2.method3118(Static449.aClass6_Sub15_Sub1_2.anInt3487 - local89);
					return;
				}
				return;
			}
			if (arg0 == 5010) {
				local157 = anIntArray450[--anInt5009];
				local81 = null;
				if (local157 < 100) {
					local81 = Static117.aStringArray16[local157];
				}
				if (local81 == null) {
					local81 = "";
				}
				aStringArray37[anInt5007++] = local81;
				return;
			}
			if (arg0 == 5011) {
				local157 = anIntArray450[--anInt5009];
				local81 = null;
				if (local157 < 100) {
					local81 = Static113.aStringArray14[local157];
				}
				if (local81 == null) {
					local81 = "";
				}
				aStringArray37[anInt5007++] = local81;
				return;
			}
			if (arg0 == 5012) {
				local157 = anIntArray450[--anInt5009];
				local192 = -1;
				if (local157 < 100) {
					local192 = Static232.anIntArray340[local157];
				}
				anIntArray450[anInt5009++] = local192;
				return;
			}
			if (arg0 == 5015) {
				if (Static134.aClass3_Sub3_Sub6_Sub1_1 == null || Static134.aClass3_Sub3_Sub6_Sub1_1.aString49 == null) {
					local75 = Static27.aString4;
				} else {
					local75 = Static134.aClass3_Sub3_Sub6_Sub1_1.method4685();
				}
				aStringArray37[anInt5007++] = local75;
				return;
			}
			if (arg0 == 5016) {
				anIntArray450[anInt5009++] = Static258.anInt4426;
				return;
			}
			if (arg0 == 5017) {
				anIntArray450[anInt5009++] = Static259.anInt4456;
				return;
			}
			if (arg0 == 5018) {
				local157 = anIntArray450[--anInt5009];
				local192 = 0;
				if (local157 < 100 && Static131.aStringArray21[local157] != null) {
					local192 = Static421.anIntArray456[local157];
				}
				anIntArray450[anInt5009++] = local192;
				return;
			}
			if (arg0 == 5019) {
				local157 = anIntArray450[--anInt5009];
				local81 = null;
				if (local157 < 100) {
					local81 = Static355.aStringArray41[local157];
				}
				if (local81 == null) {
					local81 = "";
				}
				aStringArray37[anInt5007++] = local81;
				return;
			}
			if (arg0 == 5020) {
				if (Static134.aClass3_Sub3_Sub6_Sub1_1 == null || Static134.aClass3_Sub3_Sub6_Sub1_1.aString49 == null) {
					local75 = Static27.aString4;
				} else {
					local75 = Static134.aClass3_Sub3_Sub6_Sub1_1.method4690();
				}
				aStringArray37[anInt5007++] = local75;
				return;
			}
			if (arg0 == 5050) {
				local157 = anIntArray450[--anInt5009];
				aStringArray37[anInt5007++] = Static380.aClass151_1.method3417(local157).aString5;
				return;
			}
			@Pc(589) Class6_Sub1_Sub3 local589;
			if (arg0 == 5051) {
				local157 = anIntArray450[--anInt5009];
				local589 = Static380.aClass151_1.method3417(local157);
				if (local589.anIntArray45 == null) {
					anIntArray450[anInt5009++] = 0;
					return;
				}
				anIntArray450[anInt5009++] = local589.anIntArray45.length;
				return;
			}
			if (arg0 == 5052) {
				anInt5009 -= 2;
				local157 = anIntArray450[anInt5009];
				local192 = anIntArray450[anInt5009 + 1];
				@Pc(634) Class6_Sub1_Sub3 local634 = Static380.aClass151_1.method3417(local157);
				local95 = local634.anIntArray45[local192];
				anIntArray450[anInt5009++] = local95;
				return;
			}
			if (arg0 == 5053) {
				local157 = anIntArray450[--anInt5009];
				local589 = Static380.aClass151_1.method3417(local157);
				if (local589.anIntArray44 == null) {
					anIntArray450[anInt5009++] = 0;
					return;
				}
				anIntArray450[anInt5009++] = local589.anIntArray44.length;
				return;
			}
			if (arg0 == 5054) {
				anInt5009 -= 2;
				local157 = anIntArray450[anInt5009];
				local192 = anIntArray450[anInt5009 + 1];
				anIntArray450[anInt5009++] = Static380.aClass151_1.method3417(local157).anIntArray44[local192];
				return;
			}
			if (arg0 == 5055) {
				local157 = anIntArray450[--anInt5009];
				aStringArray37[anInt5007++] = Static327.aClass129_2.method2908(local157).method1435();
				return;
			}
			if (arg0 == 5056) {
				local157 = anIntArray450[--anInt5009];
				@Pc(760) Class6_Sub1_Sub6 local760 = Static327.aClass129_2.method2908(local157);
				if (local760.anIntArray161 == null) {
					anIntArray450[anInt5009++] = 0;
					return;
				}
				anIntArray450[anInt5009++] = local760.anIntArray161.length;
				return;
			}
			if (arg0 == 5057) {
				anInt5009 -= 2;
				local157 = anIntArray450[anInt5009];
				local192 = anIntArray450[anInt5009 + 1];
				anIntArray450[anInt5009++] = Static327.aClass129_2.method2908(local157).anIntArray161[local192];
				return;
			}
			if (arg0 == 5058) {
				aClass157_1 = new Class157();
				aClass157_1.anInt3952 = anIntArray450[--anInt5009];
				aClass157_1.aClass6_Sub1_Sub6_1 = Static327.aClass129_2.method2908(aClass157_1.anInt3952);
				aClass157_1.anIntArray338 = new int[aClass157_1.aClass6_Sub1_Sub6_1.method1434()];
				return;
			}
			if (arg0 == 5059) {
				Static298.method4373(Static152.aClass25_104);
				Static449.aClass6_Sub15_Sub1_2.method3075(0);
				local157 = Static449.aClass6_Sub15_Sub1_2.anInt3487;
				Static449.aClass6_Sub15_Sub1_2.method3075(0);
				Static449.aClass6_Sub15_Sub1_2.method3100(aClass157_1.anInt3952);
				aClass157_1.aClass6_Sub1_Sub6_1.method1441(aClass157_1.anIntArray338, Static449.aClass6_Sub15_Sub1_2);
				Static449.aClass6_Sub15_Sub1_2.method3118(Static449.aClass6_Sub15_Sub1_2.anInt3487 - local157);
				return;
			}
			if (arg0 == 5060) {
				local75 = aStringArray37[--anInt5007];
				Static298.method4373(Static258.aClass25_66);
				Static449.aClass6_Sub15_Sub1_2.method3075(0);
				local192 = Static449.aClass6_Sub15_Sub1_2.anInt3487;
				Static449.aClass6_Sub15_Sub1_2.method3094(local75);
				Static449.aClass6_Sub15_Sub1_2.method3100(aClass157_1.anInt3952);
				aClass157_1.aClass6_Sub1_Sub6_1.method1441(aClass157_1.anIntArray338, Static449.aClass6_Sub15_Sub1_2);
				Static449.aClass6_Sub15_Sub1_2.method3118(Static449.aClass6_Sub15_Sub1_2.anInt3487 - local192);
				return;
			}
			if (arg0 == 5061) {
				Static298.method4373(Static152.aClass25_104);
				Static449.aClass6_Sub15_Sub1_2.method3075(0);
				local157 = Static449.aClass6_Sub15_Sub1_2.anInt3487;
				Static449.aClass6_Sub15_Sub1_2.method3075(1);
				Static449.aClass6_Sub15_Sub1_2.method3100(aClass157_1.anInt3952);
				aClass157_1.aClass6_Sub1_Sub6_1.method1441(aClass157_1.anIntArray338, Static449.aClass6_Sub15_Sub1_2);
				Static449.aClass6_Sub15_Sub1_2.method3118(Static449.aClass6_Sub15_Sub1_2.anInt3487 - local157);
				return;
			}
			if (arg0 == 5062) {
				anInt5009 -= 2;
				local157 = anIntArray450[anInt5009];
				local192 = anIntArray450[anInt5009 + 1];
				anIntArray450[anInt5009++] = Static380.aClass151_1.method3417(local157).aCharArray1[local192];
				return;
			}
			if (arg0 == 5063) {
				anInt5009 -= 2;
				local157 = anIntArray450[anInt5009];
				local192 = anIntArray450[anInt5009 + 1];
				anIntArray450[anInt5009++] = Static380.aClass151_1.method3417(local157).aCharArray2[local192];
				return;
			}
			if (arg0 == 5064) {
				anInt5009 -= 2;
				local157 = anIntArray450[anInt5009];
				local192 = anIntArray450[anInt5009 + 1];
				if (local192 == -1) {
					anIntArray450[anInt5009++] = -1;
					return;
				}
				anIntArray450[anInt5009++] = Static380.aClass151_1.method3417(local157).method422((char) local192);
				return;
			}
			if (arg0 == 5065) {
				anInt5009 -= 2;
				local157 = anIntArray450[anInt5009];
				local192 = anIntArray450[anInt5009 + 1];
				if (local192 == -1) {
					anIntArray450[anInt5009++] = -1;
					return;
				}
				anIntArray450[anInt5009++] = Static380.aClass151_1.method3417(local157).method425((char) local192);
				return;
			}
			if (arg0 == 5066) {
				local157 = anIntArray450[--anInt5009];
				anIntArray450[anInt5009++] = Static327.aClass129_2.method2908(local157).method1434();
				return;
			}
			if (arg0 == 5067) {
				anInt5009 -= 2;
				local157 = anIntArray450[anInt5009];
				local192 = anIntArray450[anInt5009 + 1];
				local89 = Static327.aClass129_2.method2908(local157).method1442(local192).anInt2626;
				anIntArray450[anInt5009++] = local89;
				return;
			}
			if (arg0 == 5068) {
				anInt5009 -= 2;
				local157 = anIntArray450[anInt5009];
				local192 = anIntArray450[anInt5009 + 1];
				aClass157_1.anIntArray338[local157] = local192;
				return;
			}
			if (arg0 == 5069) {
				anInt5009 -= 2;
				local157 = anIntArray450[anInt5009];
				local192 = anIntArray450[anInt5009 + 1];
				aClass157_1.anIntArray338[local157] = local192;
				return;
			}
			if (arg0 == 5070) {
				anInt5009 -= 3;
				local157 = anIntArray450[anInt5009];
				local192 = anIntArray450[anInt5009 + 1];
				local89 = anIntArray450[anInt5009 + 2];
				@Pc(1265) Class6_Sub1_Sub6 local1265 = Static327.aClass129_2.method2908(local157);
				if (local1265.method1442(local192).anInt2626 != 0) {
					throw new RuntimeException("bad command");
				}
				anIntArray450[anInt5009++] = local1265.method1439(local89, local192);
				return;
			}
			if (arg0 == 5071) {
				local75 = aStringArray37[--anInt5007];
				local1313 = anIntArray450[--anInt5009] == 1;
				Static432.method5871(local1313, local75);
				anIntArray450[anInt5009++] = Static251.anInt4261;
				return;
			}
			if (arg0 == 5072) {
				if (Static73.aShortArray27 != null && Static28.anInt442 < Static251.anInt4261) {
					anIntArray450[anInt5009++] = Static73.aShortArray27[Static28.anInt442++] & 0xFFFF;
					return;
				}
				anIntArray450[anInt5009++] = -1;
				return;
			}
			if (arg0 == 5073) {
				Static28.anInt442 = 0;
				return;
			}
			if (arg0 == 5074) {
				Static298.method4373(Static152.aClass25_104);
				Static449.aClass6_Sub15_Sub1_2.method3075(0);
				local157 = Static449.aClass6_Sub15_Sub1_2.anInt3487;
				Static449.aClass6_Sub15_Sub1_2.method3075(2);
				Static449.aClass6_Sub15_Sub1_2.method3100(aClass157_1.anInt3952);
				aClass157_1.aClass6_Sub1_Sub6_1.method1441(aClass157_1.anIntArray338, Static449.aClass6_Sub15_Sub1_2);
				Static449.aClass6_Sub15_Sub1_2.method3118(Static449.aClass6_Sub15_Sub1_2.anInt3487 - local157);
				return;
			}
		} else if (arg0 < 5200) {
			if (arg0 == 5100) {
				if (Static326.aClass86_1.method1867(86)) {
					anIntArray450[anInt5009++] = 1;
					return;
				}
				anIntArray450[anInt5009++] = 0;
				return;
			}
			if (arg0 == 5101) {
				if (Static326.aClass86_1.method1867(82)) {
					anIntArray450[anInt5009++] = 1;
					return;
				}
				anIntArray450[anInt5009++] = 0;
				return;
			}
			if (arg0 == 5102) {
				if (Static326.aClass86_1.method1867(81)) {
					anIntArray450[anInt5009++] = 1;
					return;
				}
				anIntArray450[anInt5009++] = 0;
				return;
			}
		} else {
			@Pc(2691) int local2691;
			@Pc(1965) boolean local1965;
			if (arg0 < 5300) {
				if (arg0 == 5200) {
					Static205.method1168(anIntArray450[--anInt5009]);
					return;
				}
				if (arg0 == 5201) {
					anIntArray450[anInt5009++] = Static434.method5881();
					return;
				}
				if (arg0 == 5205) {
					Static96.method1661(anIntArray450[--anInt5009], false, -1, -1);
					return;
				}
				@Pc(1554) Class6_Sub1_Sub4 local1554;
				if (arg0 == 5206) {
					local157 = anIntArray450[--anInt5009];
					local1554 = Static36.method2058(local157 >> 14 & 0x3FFF, local157 & 0x3FFF);
					if (local1554 == null) {
						anIntArray450[anInt5009++] = -1;
						return;
					}
					anIntArray450[anInt5009++] = local1554.anInt1189;
					return;
				}
				@Pc(1587) Class6_Sub1_Sub4 local1587;
				if (arg0 == 5207) {
					local1587 = Static36.method2049(anIntArray450[--anInt5009]);
					if (local1587 != null && local1587.aString12 != null) {
						aStringArray37[anInt5007++] = local1587.aString12;
						return;
					}
					aStringArray37[anInt5007++] = "";
					return;
				}
				if (arg0 == 5208) {
					anIntArray450[anInt5009++] = Static442.anInt6181;
					anIntArray450[anInt5009++] = Static337.anInt5671;
					return;
				}
				if (arg0 == 5209) {
					anIntArray450[anInt5009++] = Static187.anInt3261 + Static36.anInt2246;
					anIntArray450[anInt5009++] = Static70.anInt1464 + Static36.anInt2243;
					return;
				}
				if (arg0 == 5210) {
					local157 = anIntArray450[--anInt5009];
					local1554 = Static36.method2049(local157);
					if (local1554 == null) {
						anIntArray450[anInt5009++] = 0;
						anIntArray450[anInt5009++] = 0;
						return;
					}
					anIntArray450[anInt5009++] = local1554.anInt1200 >> 14 & 0x3FFF;
					anIntArray450[anInt5009++] = local1554.anInt1200 & 0x3FFF;
					return;
				}
				if (arg0 == 5211) {
					local157 = anIntArray450[--anInt5009];
					local1554 = Static36.method2049(local157);
					if (local1554 == null) {
						anIntArray450[anInt5009++] = 0;
						anIntArray450[anInt5009++] = 0;
						return;
					}
					anIntArray450[anInt5009++] = local1554.anInt1198 - local1554.anInt1192;
					anIntArray450[anInt5009++] = local1554.anInt1187 - local1554.anInt1199;
					return;
				}
				@Pc(1777) Class6_Sub24 local1777;
				if (arg0 == 5212) {
					local1777 = Static6.method91();
					if (local1777 == null) {
						anIntArray450[anInt5009++] = -1;
						anIntArray450[anInt5009++] = -1;
						return;
					}
					anIntArray450[anInt5009++] = local1777.anInt4802;
					local192 = local1777.anInt4800 << 28 | local1777.anInt4798 + Static36.anInt2246 << 14 | local1777.anInt4805 + Static36.anInt2243;
					anIntArray450[anInt5009++] = local192;
					return;
				}
				if (arg0 == 5213) {
					local1777 = Static374.method5185();
					if (local1777 == null) {
						anIntArray450[anInt5009++] = -1;
						anIntArray450[anInt5009++] = -1;
						return;
					}
					anIntArray450[anInt5009++] = local1777.anInt4802;
					local192 = local1777.anInt4800 << 28 | local1777.anInt4798 + Static36.anInt2246 << 14 | local1777.anInt4805 + Static36.anInt2243;
					anIntArray450[anInt5009++] = local192;
					return;
				}
				@Pc(1925) boolean local1925;
				if (arg0 == 5214) {
					local157 = anIntArray450[--anInt5009];
					local1554 = Static201.method3174();
					if (local1554 != null) {
						local1925 = local1554.method1066(local157 >> 14 & 0x3FFF, local157 & 0x3FFF, anIntArray453, local157 >> 28 & 0x3);
						if (local1925) {
							Static278.method4212(anIntArray453[1], anIntArray453[2]);
						}
					}
					return;
				}
				if (arg0 == 5215) {
					anInt5009 -= 2;
					local157 = anIntArray450[anInt5009];
					local192 = anIntArray450[anInt5009 + 1];
					@Pc(1963) Class202 local1963 = Static36.method2045(local157 >> 14 & 0x3FFF, local157 & 0x3FFF);
					local1965 = false;
					for (@Pc(1970) Class6_Sub1_Sub4 local1970 = (Class6_Sub1_Sub4) local1963.method4476(); local1970 != null; local1970 = (Class6_Sub1_Sub4) local1963.method4474()) {
						if (local1970.anInt1189 == local192) {
							local1965 = true;
							break;
						}
					}
					if (local1965) {
						anIntArray450[anInt5009++] = 1;
						return;
					}
					anIntArray450[anInt5009++] = 0;
					return;
				}
				if (arg0 == 5218) {
					local157 = anIntArray450[--anInt5009];
					local1554 = Static36.method2049(local157);
					if (local1554 == null) {
						anIntArray450[anInt5009++] = -1;
						return;
					}
					anIntArray450[anInt5009++] = local1554.anInt1202;
					return;
				}
				if (arg0 == 5220) {
					anIntArray450[anInt5009++] = Static126.anInt4528 == 100 ? 1 : 0;
					return;
				}
				if (arg0 == 5221) {
					local157 = anIntArray450[--anInt5009];
					Static278.method4212(local157 >> 14 & 0x3FFF, local157 & 0x3FFF);
					return;
				}
				if (arg0 == 5222) {
					local1587 = Static201.method3174();
					if (local1587 != null) {
						local1313 = local1587.method1071(anIntArray453, Static70.anInt1464 + Static36.anInt2243, Static187.anInt3261 + Static36.anInt2246);
						if (local1313) {
							anIntArray450[anInt5009++] = anIntArray453[1];
							anIntArray450[anInt5009++] = anIntArray453[2];
							return;
						}
						anIntArray450[anInt5009++] = -1;
						anIntArray450[anInt5009++] = -1;
						return;
					}
					anIntArray450[anInt5009++] = -1;
					anIntArray450[anInt5009++] = -1;
					return;
				}
				if (arg0 == 5223) {
					anInt5009 -= 2;
					local157 = anIntArray450[anInt5009];
					local192 = anIntArray450[anInt5009 + 1];
					Static96.method1661(local157, false, local192 & 0x3FFF, local192 >> 14 & 0x3FFF);
					return;
				}
				if (arg0 == 5224) {
					local157 = anIntArray450[--anInt5009];
					local1554 = Static201.method3174();
					if (local1554 != null) {
						local1925 = local1554.method1066(local157 >> 14 & 0x3FFF, local157 & 0x3FFF, anIntArray453, local157 >> 28 & 0x3);
						if (local1925) {
							anIntArray450[anInt5009++] = anIntArray453[1];
							anIntArray450[anInt5009++] = anIntArray453[2];
							return;
						}
						anIntArray450[anInt5009++] = -1;
						anIntArray450[anInt5009++] = -1;
						return;
					}
					anIntArray450[anInt5009++] = -1;
					anIntArray450[anInt5009++] = -1;
					return;
				}
				if (arg0 == 5225) {
					local157 = anIntArray450[--anInt5009];
					local1554 = Static201.method3174();
					if (local1554 != null) {
						local1925 = local1554.method1071(anIntArray453, local157 & 0x3FFF, local157 >> 14 & 0x3FFF);
						if (local1925) {
							anIntArray450[anInt5009++] = anIntArray453[1];
							anIntArray450[anInt5009++] = anIntArray453[2];
							return;
						}
						anIntArray450[anInt5009++] = -1;
						anIntArray450[anInt5009++] = -1;
						return;
					}
					anIntArray450[anInt5009++] = -1;
					anIntArray450[anInt5009++] = -1;
					return;
				}
				if (arg0 == 5226) {
					Static200.method3168(anIntArray450[--anInt5009]);
					return;
				}
				if (arg0 == 5227) {
					anInt5009 -= 2;
					local157 = anIntArray450[anInt5009];
					local192 = anIntArray450[anInt5009 + 1];
					Static96.method1661(local157, true, local192 & 0x3FFF, local192 >> 14 & 0x3FFF);
					return;
				}
				if (arg0 == 5228) {
					Static393.aBoolean382 = anIntArray450[--anInt5009] == 1;
					return;
				}
				if (arg0 == 5229) {
					anIntArray450[anInt5009++] = Static393.aBoolean382 ? 1 : 0;
					return;
				}
				if (arg0 == 5230) {
					local157 = anIntArray450[--anInt5009];
					Static209.method3257(local157);
					return;
				}
				@Pc(2483) Class6 local2483;
				if (arg0 == 5231) {
					anInt5009 -= 2;
					local157 = anIntArray450[anInt5009];
					local1313 = anIntArray450[anInt5009 + 1] == 1;
					if (Static180.aClass137_20 != null) {
						local2483 = Static180.aClass137_20.method3175((long) local157);
						if (local2483 != null && !local1313) {
							local2483.method5977();
							return;
						}
						if (local2483 == null && local1313) {
							local2483 = new Class6();
							Static180.aClass137_20.method3179((long) local157, local2483);
						}
					}
					return;
				}
				@Pc(2525) Class6 local2525;
				if (arg0 == 5232) {
					local157 = anIntArray450[--anInt5009];
					if (Static180.aClass137_20 != null) {
						local2525 = Static180.aClass137_20.method3175((long) local157);
						anIntArray450[anInt5009++] = local2525 == null ? 0 : 1;
						return;
					}
					anIntArray450[anInt5009++] = 0;
					return;
				}
				if (arg0 == 5233) {
					anInt5009 -= 2;
					local157 = anIntArray450[anInt5009];
					local1313 = anIntArray450[anInt5009 + 1] == 1;
					if (Static90.aClass137_9 != null) {
						local2483 = Static90.aClass137_9.method3175((long) local157);
						if (local2483 != null && !local1313) {
							local2483.method5977();
							return;
						}
						if (local2483 == null && local1313) {
							local2483 = new Class6();
							Static90.aClass137_9.method3179((long) local157, local2483);
						}
					}
					return;
				}
				if (arg0 == 5234) {
					local157 = anIntArray450[--anInt5009];
					if (Static90.aClass137_9 != null) {
						local2525 = Static90.aClass137_9.method3175((long) local157);
						anIntArray450[anInt5009++] = local2525 == null ? 0 : 1;
						return;
					}
					anIntArray450[anInt5009++] = 0;
					return;
				}
				if (arg0 == 5235) {
					anIntArray450[anInt5009++] = Static36.aClass6_Sub1_Sub4_2 == null ? -1 : Static36.aClass6_Sub1_Sub4_2.anInt1189;
					return;
				}
				if (arg0 == 5236) {
					anInt5009 -= 2;
					local157 = anIntArray450[anInt5009];
					local192 = anIntArray450[anInt5009 + 1];
					local89 = local192 >> 14 & 0x3FFF;
					local95 = local192 & 0x3FFF;
					local2691 = Static283.method4261(local89, local157, local95);
					if (local2691 < 0) {
						anIntArray450[anInt5009++] = -1;
						return;
					}
					anIntArray450[anInt5009++] = local2691;
					return;
				}
			} else if (arg0 < 5400) {
				if (arg0 == 5300) {
					anInt5009 -= 2;
					local157 = anIntArray450[anInt5009];
					local192 = anIntArray450[anInt5009 + 1];
					Static369.method5142(false, 3, local157, local192);
					anIntArray450[anInt5009++] = Static93.aFrame1 == null ? 0 : 1;
					return;
				}
				if (arg0 == 5301) {
					if (Static93.aFrame1 != null) {
						Static369.method5142(false, Static8.aClass173_Sub1_1.anInt4409, -1, -1);
					}
					return;
				}
				if (arg0 == 5302) {
					@Pc(2769) Class117[] local2769 = Static63.method1194();
					anIntArray450[anInt5009++] = local2769.length;
					return;
				}
				if (arg0 == 5303) {
					local157 = anIntArray450[--anInt5009];
					@Pc(2793) Class117[] local2793 = Static63.method1194();
					anIntArray450[anInt5009++] = local2793[local157].anInt2944;
					anIntArray450[anInt5009++] = local2793[local157].anInt2939;
					return;
				}
				if (arg0 == 5305) {
					local157 = Static8.aClass173_Sub1_1.anInt4412;
					local192 = Static8.aClass173_Sub1_1.anInt4410;
					local89 = -1;
					@Pc(2830) Class117[] local2830 = Static63.method1194();
					for (local2691 = 0; local2691 < local2830.length; local2691++) {
						@Pc(2837) Class117 local2837 = local2830[local2691];
						if (local2837.anInt2944 == local157 && local2837.anInt2939 == local192) {
							local89 = local2691;
							break;
						}
					}
					anIntArray450[anInt5009++] = local89;
					return;
				}
				if (arg0 == 5306) {
					anIntArray450[anInt5009++] = Static172.method2743();
					return;
				}
				if (arg0 == 5307) {
					local157 = anIntArray450[--anInt5009];
					if (local157 >= 1 && local157 <= 2) {
						Static369.method5142(false, local157, -1, -1);
						return;
					}
					return;
				}
				if (arg0 == 5308) {
					anIntArray450[anInt5009++] = Static8.aClass173_Sub1_1.anInt4409;
					return;
				}
				if (arg0 == 5309) {
					local157 = anIntArray450[--anInt5009];
					if (local157 >= 1 && local157 <= 2) {
						Static8.aClass173_Sub1_1.anInt4409 = local157;
						Static8.aClass173_Sub1_1.method3970(Static165.aClass103_3);
						return;
					}
					return;
				}
			} else {
				@Pc(3345) String local3345;
				if (arg0 < 5500) {
					if (arg0 == 5400) {
						anInt5007 -= 2;
						local75 = aStringArray37[anInt5007];
						local81 = aStringArray37[anInt5007 + 1];
						local89 = anIntArray450[--anInt5009];
						Static298.method4373(Static125.aClass25_33);
						Static449.aClass6_Sub15_Sub1_2.method3075(Static384.method5308(local75) + Static384.method5308(local81) + 1);
						Static449.aClass6_Sub15_Sub1_2.method3094(local75);
						Static449.aClass6_Sub15_Sub1_2.method3094(local81);
						Static449.aClass6_Sub15_Sub1_2.method3075(local89);
						return;
					}
					if (arg0 == 5401) {
						anInt5009 -= 2;
						Static107.aShortArray31[anIntArray450[anInt5009]] = (short) Static298.method4374(anIntArray450[anInt5009 + 1]);
						Static354.aClass170_2.method3860();
						Static354.aClass170_2.method3864();
						Static336.aClass59_2.method1476();
						Static207.method3239();
						return;
					}
					if (arg0 == 5405) {
						anInt5009 -= 2;
						local157 = anIntArray450[anInt5009];
						local192 = anIntArray450[anInt5009 + 1];
						if (local157 >= 0 && local157 < 2) {
							Static138.anIntArrayArrayArray13[local157] = new int[local192 << 1][4];
						}
						return;
					}
					if (arg0 == 5406) {
						anInt5009 -= 7;
						local157 = anIntArray450[anInt5009];
						local192 = anIntArray450[anInt5009 + 1] << 1;
						local89 = anIntArray450[anInt5009 + 2];
						local95 = anIntArray450[anInt5009 + 3];
						local2691 = anIntArray450[anInt5009 + 4];
						@Pc(3105) int local3105 = anIntArray450[anInt5009 + 5];
						@Pc(3111) int local3111 = anIntArray450[anInt5009 + 6];
						if (local157 >= 0 && local157 < 2 && Static138.anIntArrayArrayArray13[local157] != null && local192 >= 0 && local192 < Static138.anIntArrayArrayArray13[local157].length) {
							Static138.anIntArrayArrayArray13[local157][local192] = new int[] { (local89 >> 14 & 0x3FFF) << 7, local95, (local89 & 0x3FFF) << 7, local3111 };
							Static138.anIntArrayArrayArray13[local157][local192 + 1] = new int[] { (local2691 >> 14 & 0x3FFF) << 7, local3105, (local2691 & 0x3FFF) << 7 };
						}
						return;
					}
					if (arg0 == 5407) {
						local157 = Static138.anIntArrayArrayArray13[anIntArray450[--anInt5009]].length >> 1;
						anIntArray450[anInt5009++] = local157;
						return;
					}
					if (arg0 == 5411) {
						if (Static93.aFrame1 != null) {
							Static369.method5142(false, Static8.aClass173_Sub1_1.anInt4409, -1, -1);
						}
						if (Static176.aFrame2 != null) {
							Static224.method3409();
							System.exit(0);
							return;
						}
						local75 = Static299.aString42 == null ? Static106.method2513() : Static299.aString42;
						Static260.method4008(Static165.aClass103_3, false, Static155.anInt2774 == 1, local75);
						return;
					}
					if (arg0 == 5419) {
						local75 = "";
						if (Static340.aClass249_6 != null) {
							if (Static340.aClass249_6.anObject10 == null) {
								local75 = Static160.method2635(Static340.aClass249_6.anInt6931);
							} else {
								local75 = (String) Static340.aClass249_6.anObject10;
							}
						}
						aStringArray37[anInt5007++] = local75;
						return;
					}
					if (arg0 == 5420) {
						anIntArray450[anInt5009++] = Static143.anInt2575 == 3 ? 1 : 0;
						return;
					}
					if (arg0 == 5421) {
						if (Static93.aFrame1 != null) {
							Static369.method5142(false, Static8.aClass173_Sub1_1.anInt4409, -1, -1);
						}
						local75 = aStringArray37[--anInt5007];
						local1313 = anIntArray450[--anInt5009] == 1;
						local3345 = Static106.method2513() + local75;
						Static260.method4008(Static165.aClass103_3, local1313, Static155.anInt2774 == 1, local3345);
						return;
					}
					if (arg0 == 5422) {
						anInt5007 -= 2;
						local75 = aStringArray37[anInt5007];
						local81 = aStringArray37[anInt5007 + 1];
						local89 = anIntArray450[--anInt5009];
						if (local75.length() > 0) {
							if (Static77.aStringArray11 == null) {
								Static77.aStringArray11 = new String[Static253.anIntArray388[Static323.aClass44_4.anInt1139]];
							}
							Static77.aStringArray11[local89] = local75;
						}
						if (local81.length() > 0) {
							if (Static293.aStringArray34 == null) {
								Static293.aStringArray34 = new String[Static253.anIntArray388[Static323.aClass44_4.anInt1139]];
							}
							Static293.aStringArray34[local89] = local81;
						}
						return;
					}
					if (arg0 == 5423) {
						System.out.println(aStringArray37[--anInt5007]);
						return;
					}
					if (arg0 == 5424) {
						anInt5009 -= 11;
						Static319.anInt5197 = anIntArray450[anInt5009];
						Static42.anInt909 = anIntArray450[anInt5009 + 1];
						Static111.anInt1996 = anIntArray450[anInt5009 + 2];
						Static141.anInt2561 = anIntArray450[anInt5009 + 3];
						Static205.anInt1290 = anIntArray450[anInt5009 + 4];
						Static387.anInt6388 = anIntArray450[anInt5009 + 5];
						Static268.anInt4598 = anIntArray450[anInt5009 + 6];
						Static256.anInt4375 = anIntArray450[anInt5009 + 7];
						Static185.anInt4926 = anIntArray450[anInt5009 + 8];
						Static159.anInt2856 = anIntArray450[anInt5009 + 9];
						Static213.anInt3696 = anIntArray450[anInt5009 + 10];
						Static76.aClass158_17.method3686(Static205.anInt1290);
						Static76.aClass158_17.method3686(Static387.anInt6388);
						Static76.aClass158_17.method3686(Static268.anInt4598);
						Static76.aClass158_17.method3686(Static256.anInt4375);
						Static76.aClass158_17.method3686(Static185.anInt4926);
						Static56.aClass12_1 = null;
						Static148.aClass12_8 = null;
						Static321.aClass12_14 = null;
						Static327.aClass12_15 = null;
						Static261.aClass12_13 = null;
						Static348.aClass12_16 = null;
						Static141.aClass12_4 = null;
						Static158.aClass12_9 = null;
						Static312.aBoolean355 = true;
						return;
					}
					if (arg0 == 5425) {
						Static255.method3943();
						Static312.aBoolean355 = false;
						return;
					}
					if (arg0 == 5426) {
						anInt5009 -= 2;
						Static415.anInt6946 = anIntArray450[anInt5009];
						Static414.anInt6928 = anIntArray450[anInt5009 + 1];
						return;
					}
					if (arg0 == 5427) {
						anInt5009 -= 2;
						Static134.anInt2365 = anIntArray450[anInt5009 + 1];
						return;
					}
					if (arg0 == 5428) {
						anInt5009 -= 2;
						local157 = anIntArray450[anInt5009];
						local192 = anIntArray450[anInt5009 + 1];
						anIntArray450[anInt5009++] = Static422.method5700(local157, local192) ? 1 : 0;
						return;
					}
					if (arg0 == 5429) {
						Static421.method4464(aStringArray37[--anInt5007], false);
						return;
					}
				} else if (arg0 < 5600) {
					if (arg0 == 5500) {
						anInt5009 -= 4;
						local157 = anIntArray450[anInt5009];
						local192 = anIntArray450[anInt5009 + 1];
						local89 = anIntArray450[anInt5009 + 2];
						local95 = anIntArray450[anInt5009 + 3];
						Static230.method3597(local192, (local157 & 0x3FFF) - Static99.anInt1814, local89, false, (local157 >> 14 & 0x3FFF) - Static206.anInt3592, local95);
						return;
					}
					if (arg0 == 5501) {
						anInt5009 -= 4;
						local157 = anIntArray450[anInt5009];
						local192 = anIntArray450[anInt5009 + 1];
						local89 = anIntArray450[anInt5009 + 2];
						local95 = anIntArray450[anInt5009 + 3];
						Static245.method3779(local89, local192, local95, (local157 >> 14 & 0x3FFF) - Static206.anInt3592, (local157 & 0x3FFF) - Static99.anInt1814);
						return;
					}
					if (arg0 == 5502) {
						anInt5009 -= 6;
						local157 = anIntArray450[anInt5009];
						if (local157 >= 2) {
							throw new RuntimeException();
						}
						Static8.anInt159 = local157;
						local192 = anIntArray450[anInt5009 + 1];
						if (local192 + 1 >= Static138.anIntArrayArrayArray13[Static8.anInt159].length >> 1) {
							throw new RuntimeException();
						}
						Static413.anInt6909 = local192;
						Static135.anInt2408 = 0;
						Static207.anInt3616 = anIntArray450[anInt5009 + 2];
						Static155.anInt2773 = anIntArray450[anInt5009 + 3];
						local89 = anIntArray450[anInt5009 + 4];
						if (local89 >= 2) {
							throw new RuntimeException();
						}
						Static125.anInt2215 = local89;
						local95 = anIntArray450[anInt5009 + 5];
						if (local95 + 1 >= Static138.anIntArrayArrayArray13[Static125.anInt2215].length >> 1) {
							throw new RuntimeException();
						}
						Static419.anInt7008 = local95;
						Static9.anInt164 = 3;
						return;
					}
					if (arg0 == 5503) {
						Static207.method3241();
						return;
					}
					if (arg0 == 5504) {
						anInt5009 -= 2;
						Static349.method4947(anIntArray450[anInt5009], anIntArray450[anInt5009 + 1]);
						return;
					}
					if (arg0 == 5505) {
						anIntArray450[anInt5009++] = (int) Static367.aFloat104 >> 3;
						return;
					}
					if (arg0 == 5506) {
						anIntArray450[anInt5009++] = (int) Static397.aFloat99 >> 3;
						return;
					}
					if (arg0 == 5507) {
						Static342.method4811();
						return;
					}
					if (arg0 == 5508) {
						Static324.method4597();
						return;
					}
					if (arg0 == 5509) {
						Static198.method3148();
						return;
					}
					if (arg0 == 5510) {
						Static359.method5052();
						return;
					}
					if (arg0 == 5511) {
						local157 = anIntArray450[--anInt5009];
						local192 = local157 >> 14 & 0x3FFF;
						local89 = local157 & 0x3FFF;
						local192 -= Static206.anInt3592;
						if (local192 < 0) {
							local192 = 0;
						} else if (local192 >= Static84.anInt1632) {
							local192 = Static84.anInt1632;
						}
						local89 -= Static99.anInt1814;
						if (local89 < 0) {
							local89 = 0;
						} else if (local89 >= Static261.anInt4480) {
							local89 = Static261.anInt4480;
						}
						Static375.anInt6234 = (local192 << 7) + 64;
						Static45.anInt923 = (local89 << 7) + 64;
						Static9.anInt164 = 4;
						return;
					}
					if (arg0 == 5512) {
						Static295.method4341();
						return;
					}
				} else if (arg0 < 5700) {
					if (arg0 == 5600) {
						anInt5007 -= 2;
						local75 = aStringArray37[anInt5007];
						local81 = aStringArray37[anInt5007 + 1];
						local89 = anIntArray450[--anInt5009];
						if (Static54.anInt1123 != 10) {
							return;
						}
						if (Static65.anInt1374 == 0 && Static140.anInt2540 == 0 && Static90.anInt1675 == 0 && Static400.anInt6607 == 0) {
							Static283.method4258(local75, local89, local81);
							return;
						}
						return;
					}
					if (arg0 == 5601) {
						Static55.method1034();
						return;
					}
					if (arg0 == 5602) {
						if (Static140.anInt2540 == 0) {
							Static189.anInt6579 = -2;
						}
						return;
					}
					if (arg0 == 5603) {
						anInt5009 -= 4;
						if (Static54.anInt1123 != 10) {
							return;
						}
						if (Static65.anInt1374 == 0 && Static140.anInt2540 == 0 && Static90.anInt1675 == 0 && Static400.anInt6607 == 0) {
							Static50.method923(anIntArray450[anInt5009], anIntArray450[anInt5009 + 1], anIntArray450[anInt5009 + 3], anIntArray450[anInt5009 + 2]);
							return;
						}
						return;
					}
					if (arg0 == 5604) {
						anInt5007--;
						if (Static54.anInt1123 != 10) {
							return;
						}
						if (Static65.anInt1374 == 0 && Static140.anInt2540 == 0 && Static90.anInt1675 == 0 && Static400.anInt6607 == 0) {
							Static348.method4939(Static293.method4335(aStringArray37[anInt5007]));
							return;
						}
						return;
					}
					if (arg0 == 5605) {
						anInt5007 -= 3;
						anInt5009 -= 7;
						if (Static54.anInt1123 != 10) {
							return;
						}
						if (Static65.anInt1374 == 0 && Static140.anInt2540 == 0 && Static90.anInt1675 == 0 && Static400.anInt6607 == 0) {
							Static83.method1500(anIntArray450[anInt5009 + 2], anIntArray450[anInt5009], Static293.method4335(aStringArray37[anInt5007]), anIntArray450[anInt5009 + 3], anIntArray450[anInt5009 + 1], anIntArray450[anInt5009 + 6] == 1, aStringArray37[anInt5007 + 1], anIntArray450[anInt5009 + 5] == 1, aStringArray37[anInt5007 + 2], anIntArray450[anInt5009 + 4] == 1);
							return;
						}
						return;
					}
					if (arg0 == 5606) {
						if (Static90.anInt1675 == 0) {
							Static201.anInt3540 = -2;
						}
						return;
					}
					if (arg0 == 5607) {
						anIntArray450[anInt5009++] = Static189.anInt6579;
						return;
					}
					if (arg0 == 5608) {
						anIntArray450[anInt5009++] = Static40.anInt882;
						return;
					}
					if (arg0 == 5609) {
						anIntArray450[anInt5009++] = Static201.anInt3540;
						return;
					}
					if (arg0 == 5610) {
						for (local157 = 0; local157 < 5; local157++) {
							aStringArray37[anInt5007++] = Static237.aStringArray27.length > local157 ? Static225.method3416(Static237.aStringArray27[local157]) : "";
						}
						Static237.aStringArray27 = null;
						return;
					}
					if (arg0 == 5611) {
						anIntArray450[anInt5009++] = Static236.anInt4058;
						return;
					}
				} else if (arg0 < 6100) {
					if (arg0 == 6001) {
						local157 = anIntArray450[--anInt5009];
						if (local157 < 1) {
							local157 = 1;
						}
						if (local157 > 4) {
							local157 = 4;
						}
						Static8.aClass173_Sub1_1.anInt4416 = local157;
						Static118.method1900();
						Static8.aClass173_Sub1_1.method3970(Static165.aClass103_3);
						Static59.aBoolean106 = false;
						return;
					}
					if (arg0 == 6002) {
						Static8.aClass173_Sub1_1.method3967(anIntArray450[--anInt5009] == 1);
						Static118.method1900();
						Static158.method2616();
						Static8.aClass173_Sub1_1.method3970(Static165.aClass103_3);
						Static59.aBoolean106 = false;
						return;
					}
					if (arg0 == 6003) {
						Static8.aClass173_Sub1_1.aBoolean313 = anIntArray450[--anInt5009] == 1;
						Static158.method2616();
						Static8.aClass173_Sub1_1.method3970(Static165.aClass103_3);
						Static59.aBoolean106 = false;
						return;
					}
					if (arg0 == 6005) {
						Static8.aClass173_Sub1_1.aBoolean302 = anIntArray450[--anInt5009] == 1;
						Static118.method1900();
						Static8.aClass173_Sub1_1.method3970(Static165.aClass103_3);
						Static59.aBoolean106 = false;
						return;
					}
					if (arg0 == 6006) {
						Static8.aClass173_Sub1_1.aBoolean312 = anIntArray450[--anInt5009] == 1;
						Static44.aClass28_14.method3480(!Static8.aClass173_Sub1_1.aBoolean312);
						Static8.aClass173_Sub1_1.method3970(Static165.aClass103_3);
						Static59.aBoolean106 = false;
						return;
					}
					if (arg0 == 6007) {
						Static8.aClass173_Sub1_1.anInt4407 = anIntArray450[--anInt5009];
						Static8.aClass173_Sub1_1.method3970(Static165.aClass103_3);
						Static59.aBoolean106 = false;
						return;
					}
					if (arg0 == 6008) {
						Static8.aClass173_Sub1_1.aBoolean314 = anIntArray450[--anInt5009] == 1;
						Static8.aClass173_Sub1_1.method3970(Static165.aClass103_3);
						Static59.aBoolean106 = false;
						return;
					}
					if (arg0 == 6009) {
						Static8.aClass173_Sub1_1.aBoolean304 = anIntArray450[--anInt5009] == 1;
						Static118.method1900();
						Static8.aClass173_Sub1_1.method3970(Static165.aClass103_3);
						Static59.aBoolean106 = false;
						return;
					}
					if (arg0 == 6010) {
						Static8.aClass173_Sub1_1.aBoolean307 = anIntArray450[--anInt5009] == 1;
						Static8.aClass173_Sub1_1.method3970(Static165.aClass103_3);
						Static59.aBoolean106 = false;
						return;
					}
					if (arg0 == 6011) {
						local157 = anIntArray450[--anInt5009];
						if (local157 < 0 || local157 > 2) {
							local157 = 0;
						}
						Static118.method1900();
						Static8.aClass173_Sub1_1.anInt4420 = local157;
						Static8.aClass173_Sub1_1.method3970(Static165.aClass103_3);
						Static59.aBoolean106 = false;
						return;
					}
					if (arg0 == 6012) {
						Static8.aClass173_Sub1_1.aBoolean317 = anIntArray450[--anInt5009] == 1;
						Static263.method4044();
						Static121.method1986();
						Static8.aClass173_Sub1_1.method3970(Static165.aClass103_3);
						Static59.aBoolean106 = false;
						return;
					}
					if (arg0 == 6014) {
						Static8.aClass173_Sub1_1.aBoolean301 = anIntArray450[--anInt5009] == 1;
						Static118.method1900();
						Static8.aClass173_Sub1_1.method3970(Static165.aClass103_3);
						Static59.aBoolean106 = false;
						return;
					}
					if (arg0 == 6015) {
						Static8.aClass173_Sub1_1.aBoolean303 = anIntArray450[--anInt5009] == 1;
						Static118.method1900();
						Static8.aClass173_Sub1_1.method3970(Static165.aClass103_3);
						Static59.aBoolean106 = false;
						return;
					}
					if (arg0 == 6016) {
						local157 = anIntArray450[--anInt5009];
						if (local157 < 0 || local157 > 2) {
							local157 = 0;
						}
						Static8.aClass173_Sub1_1.anInt4417 = local157;
						Static385.method5310(Static155.anInt2774);
						Static8.aClass173_Sub1_1.method3970(Static165.aClass103_3);
						return;
					}
					if (arg0 == 6017) {
						Static8.aClass173_Sub1_1.aBoolean309 = anIntArray450[--anInt5009] == 1;
						Static51.method937();
						Static8.aClass173_Sub1_1.method3970(Static165.aClass103_3);
						Static59.aBoolean106 = false;
						return;
					}
					if (arg0 == 6018) {
						local157 = anIntArray450[--anInt5009];
						if (local157 < 0) {
							local157 = 0;
						}
						if (local157 > 127) {
							local157 = 127;
						}
						Static8.aClass173_Sub1_1.anInt4406 = local157;
						Static8.aClass173_Sub1_1.method3970(Static165.aClass103_3);
						Static59.aBoolean106 = false;
						return;
					}
					if (arg0 == 6019) {
						local157 = anIntArray450[--anInt5009];
						if (local157 < 0) {
							local157 = 0;
						}
						if (local157 > 255) {
							local157 = 255;
						}
						if (local157 != Static8.aClass173_Sub1_1.anInt4414) {
							if (Static8.aClass173_Sub1_1.anInt4414 == 0 && Static75.anInt1505 != -1) {
								Static233.method3661(Static280.aClass158_63, local157, Static75.anInt1505);
								Static284.aBoolean341 = false;
							} else if (local157 == 0) {
								Static376.method4541();
								Static284.aBoolean341 = false;
							} else {
								Static232.method3615(local157);
							}
							Static8.aClass173_Sub1_1.anInt4414 = local157;
						}
						Static8.aClass173_Sub1_1.method3970(Static165.aClass103_3);
						Static59.aBoolean106 = false;
						return;
					}
					if (arg0 == 6020) {
						local157 = anIntArray450[--anInt5009];
						if (local157 < 0) {
							local157 = 0;
						}
						if (local157 > 127) {
							local157 = 127;
						}
						Static8.aClass173_Sub1_1.anInt4411 = local157;
						Static8.aClass173_Sub1_1.method3970(Static165.aClass103_3);
						Static59.aBoolean106 = false;
						return;
					}
					if (arg0 == 6021) {
						Static8.aClass173_Sub1_1.aBoolean318 = anIntArray450[--anInt5009] == 1;
						Static158.method2616();
						return;
					}
					if (arg0 == 6023) {
						local157 = anIntArray450[--anInt5009];
						local1313 = false;
						if (local157 < 0) {
							local157 = 0;
						}
						if (local157 > 2) {
							local157 = 2;
						}
						if (Static2.anInt8 < 96) {
							local157 = 0;
							local1313 = true;
						}
						Static165.method2690(local157);
						Static8.aClass173_Sub1_1.method3970(Static165.aClass103_3);
						Static59.aBoolean106 = false;
						anIntArray450[anInt5009++] = local1313 ? 0 : 1;
						return;
					}
					if (arg0 == 6024) {
						local157 = anIntArray450[--anInt5009];
						if (local157 < 0 || local157 > 2) {
							local157 = 0;
						}
						Static8.aClass173_Sub1_1.anInt4413 = local157;
						Static8.aClass173_Sub1_1.method3970(Static165.aClass103_3);
						return;
					}
					if (arg0 == 6025) {
						local157 = anIntArray450[--anInt5009];
						if (local157 < 0 || local157 > Static254.method3445(Static2.anInt8)) {
							local157 = 0;
						}
						Static8.aClass173_Sub1_1.anInt4418 = local157;
						Static8.aClass173_Sub1_1.method3970(Static165.aClass103_3);
						Static59.aBoolean106 = false;
						return;
					}
					if (arg0 == 6027) {
						local157 = anIntArray450[--anInt5009];
						if (local157 < 0 || local157 > 1) {
							local157 = 0;
						}
						Static416.method4229(local157 == 1);
						return;
					}
					if (arg0 == 6028) {
						Static8.aClass173_Sub1_1.aBoolean306 = anIntArray450[--anInt5009] != 0;
						Static8.aClass173_Sub1_1.method3970(Static165.aClass103_3);
						return;
					}
					if (arg0 == 6029) {
						Static8.aClass173_Sub1_1.anInt4407 = anIntArray450[--anInt5009];
						Static8.aClass173_Sub1_1.method3970(Static165.aClass103_3);
						return;
					}
					if (arg0 == 6030) {
						Static8.aClass173_Sub1_1.aBoolean305 = anIntArray450[--anInt5009] != 0;
						Static8.aClass173_Sub1_1.method3970(Static165.aClass103_3);
						Static118.method1900();
						return;
					}
					if (arg0 == 6031) {
						local157 = anIntArray450[--anInt5009];
						if (local157 < 0 || local157 > 3) {
							local157 = 2;
						}
						Static385.method5310(local157);
						return;
					}
					if (arg0 == 6032) {
						local157 = anIntArray450[--anInt5009];
						if (local157 < 0 || local157 > 3) {
							local157 = 2;
						}
						Static8.aClass173_Sub1_1.anInt4408 = local157;
						Static8.aClass173_Sub1_1.method3970(Static165.aClass103_3);
						Static59.aBoolean106 = false;
						return;
					}
					if (arg0 == 6033) {
						local157 = anIntArray450[--anInt5009];
						if (local157 < 0 || local157 > 4) {
							local157 = 2;
						}
						Static8.aClass173_Sub1_1.anInt4405 = local157;
						Static8.aClass173_Sub1_1.method3970(Static165.aClass103_3);
						return;
					}
					if (arg0 == 6035) {
						Static8.aClass173_Sub1_1.aBoolean319 = anIntArray450[--anInt5009] == 1;
						Static118.method1900();
						Static158.method2616();
						return;
					}
				} else if (arg0 < 6200) {
					if (arg0 == 6101) {
						anIntArray450[anInt5009++] = Static8.aClass173_Sub1_1.anInt4416;
						return;
					}
					if (arg0 == 6102) {
						anIntArray450[anInt5009++] = Static8.aClass173_Sub1_1.method3968(Static155.anInt2774) ? 1 : 0;
						return;
					}
					if (arg0 == 6103) {
						anIntArray450[anInt5009++] = Static8.aClass173_Sub1_1.aBoolean313 ? 1 : 0;
						return;
					}
					if (arg0 == 6105) {
						anIntArray450[anInt5009++] = Static8.aClass173_Sub1_1.aBoolean302 ? 1 : 0;
						return;
					}
					if (arg0 == 6106) {
						anIntArray450[anInt5009++] = Static8.aClass173_Sub1_1.aBoolean312 ? 1 : 0;
						return;
					}
					if (arg0 == 6107) {
						anIntArray450[anInt5009++] = Static8.aClass173_Sub1_1.anInt4407;
						return;
					}
					if (arg0 == 6108) {
						anIntArray450[anInt5009++] = Static8.aClass173_Sub1_1.aBoolean314 ? 1 : 0;
						return;
					}
					if (arg0 == 6109) {
						anIntArray450[anInt5009++] = Static8.aClass173_Sub1_1.aBoolean304 ? 1 : 0;
						return;
					}
					if (arg0 == 6110) {
						anIntArray450[anInt5009++] = Static8.aClass173_Sub1_1.aBoolean307 ? 1 : 0;
						return;
					}
					if (arg0 == 6111) {
						anIntArray450[anInt5009++] = Static8.aClass173_Sub1_1.anInt4420;
						return;
					}
					if (arg0 == 6112) {
						anIntArray450[anInt5009++] = Static8.aClass173_Sub1_1.aBoolean317 ? 1 : 0;
						return;
					}
					if (arg0 == 6114) {
						anIntArray450[anInt5009++] = Static8.aClass173_Sub1_1.aBoolean301 ? 1 : 0;
						return;
					}
					if (arg0 == 6115) {
						anIntArray450[anInt5009++] = Static8.aClass173_Sub1_1.aBoolean303 ? 1 : 0;
						return;
					}
					if (arg0 == 6116) {
						anIntArray450[anInt5009++] = Static8.aClass173_Sub1_1.anInt4417;
						return;
					}
					if (arg0 == 6117) {
						anIntArray450[anInt5009++] = Static8.aClass173_Sub1_1.aBoolean309 ? 1 : 0;
						return;
					}
					if (arg0 == 6118) {
						anIntArray450[anInt5009++] = Static8.aClass173_Sub1_1.anInt4406;
						return;
					}
					if (arg0 == 6119) {
						anIntArray450[anInt5009++] = Static8.aClass173_Sub1_1.anInt4414;
						return;
					}
					if (arg0 == 6120) {
						anIntArray450[anInt5009++] = Static8.aClass173_Sub1_1.anInt4411;
						return;
					}
					if (arg0 == 6121) {
						anIntArray450[anInt5009++] = Static44.aClass28_14.method3491() ? 1 : 0;
						return;
					}
					if (arg0 == 6123) {
						anIntArray450[anInt5009++] = Static171.method1545();
						return;
					}
					if (arg0 == 6124) {
						anIntArray450[anInt5009++] = Static8.aClass173_Sub1_1.anInt4413;
						return;
					}
					if (arg0 == 6125) {
						anIntArray450[anInt5009++] = Static8.aClass173_Sub1_1.anInt4418;
						return;
					}
					if (arg0 == 6126) {
						anIntArray450[anInt5009++] = Static44.aClass28_14.method3537() ? 1 : 0;
						return;
					}
					if (arg0 == 6127) {
						anIntArray450[anInt5009++] = Static8.aClass173_Sub1_1.aBoolean308 ? 1 : 0;
						return;
					}
					if (arg0 == 6128) {
						anIntArray450[anInt5009++] = Static8.aClass173_Sub1_1.aBoolean306 ? 1 : 0;
						return;
					}
					if (arg0 == 6129) {
						anIntArray450[anInt5009++] = Static8.aClass173_Sub1_1.anInt4407;
						return;
					}
					if (arg0 == 6130) {
						anIntArray450[anInt5009++] = Static8.aClass173_Sub1_1.aBoolean305 ? 1 : 0;
						return;
					}
					if (arg0 == 6131) {
						anIntArray450[anInt5009++] = Static155.anInt2774;
						return;
					}
					if (arg0 == 6132) {
						anIntArray450[anInt5009++] = Static8.aClass173_Sub1_1.anInt4408;
						return;
					}
					if (arg0 == 6133) {
						anIntArray450[anInt5009++] = Static143.anInt2575 == 1 || Static143.anInt2575 == 4 ? 1 : 0;
						return;
					}
					if (arg0 == 6134) {
						anIntArray450[anInt5009++] = Static254.method3445(Static2.anInt8);
						return;
					}
					if (arg0 == 6135) {
						anIntArray450[anInt5009++] = Static8.aClass173_Sub1_1.anInt4405;
						return;
					}
				} else if (arg0 < 6300) {
					if (arg0 == 6200) {
						anInt5009 -= 2;
						Static6.aShort2 = (short) anIntArray450[anInt5009];
						if (Static6.aShort2 <= 0) {
							Static6.aShort2 = 256;
						}
						Static303.aShort68 = (short) anIntArray450[anInt5009 + 1];
						if (Static303.aShort68 <= 0) {
							Static303.aShort68 = 205;
						}
						return;
					}
					if (arg0 == 6201) {
						anInt5009 -= 2;
						Static224.aShort55 = (short) anIntArray450[anInt5009];
						if (Static224.aShort55 <= 0) {
							Static224.aShort55 = 256;
						}
						Static1.aShort1 = (short) anIntArray450[anInt5009 + 1];
						if (Static1.aShort1 <= 0) {
							Static1.aShort1 = 320;
						}
						return;
					}
					if (arg0 == 6202) {
						anInt5009 -= 4;
						Static313.aShort69 = (short) anIntArray450[anInt5009];
						if (Static313.aShort69 <= 0) {
							Static313.aShort69 = 1;
						}
						Static89.aShort11 = (short) anIntArray450[anInt5009 + 1];
						if (Static89.aShort11 <= 0) {
							Static89.aShort11 = 32767;
						} else if (Static89.aShort11 < Static313.aShort69) {
							Static89.aShort11 = Static313.aShort69;
						}
						Static136.aShort42 = (short) anIntArray450[anInt5009 + 2];
						if (Static136.aShort42 <= 0) {
							Static136.aShort42 = 1;
						}
						Static8.aShort3 = (short) anIntArray450[anInt5009 + 3];
						if (Static8.aShort3 <= 0) {
							Static8.aShort3 = 32767;
							return;
						}
						if (Static8.aShort3 < Static136.aShort42) {
							Static8.aShort3 = Static136.aShort42;
						}
						return;
					}
					if (arg0 == 6203) {
						Static216.method3343(false, Static389.aClass239_14.anInt6435, 0, 0, Static389.aClass239_14.anInt6408);
						anIntArray450[anInt5009++] = Static145.anInt2640;
						anIntArray450[anInt5009++] = Static19.anInt324;
						return;
					}
					if (arg0 == 6204) {
						anIntArray450[anInt5009++] = Static224.aShort55;
						anIntArray450[anInt5009++] = Static1.aShort1;
						return;
					}
					if (arg0 == 6205) {
						anIntArray450[anInt5009++] = Static6.aShort2;
						anIntArray450[anInt5009++] = Static303.aShort68;
						return;
					}
				} else if (arg0 < 6400) {
					if (arg0 == 6300) {
						anIntArray450[anInt5009++] = (int) (Static154.method2527() / 60000L);
						return;
					}
					if (arg0 == 6301) {
						anIntArray450[anInt5009++] = (int) (Static154.method2527() / 86400000L) - 11745;
						return;
					}
					if (arg0 == 6302) {
						anInt5009 -= 3;
						local157 = anIntArray450[anInt5009];
						local192 = anIntArray450[anInt5009 + 1];
						local89 = anIntArray450[anInt5009 + 2];
						aCalendar2.clear();
						aCalendar2.set(11, 12);
						aCalendar2.set(local89, local192, local157);
						anIntArray450[anInt5009++] = (int) (aCalendar2.getTime().getTime() / 86400000L) - 11745;
						return;
					}
					if (arg0 == 6303) {
						aCalendar2.clear();
						aCalendar2.setTime(new Date(Static154.method2527()));
						anIntArray450[anInt5009++] = aCalendar2.get(1);
						return;
					}
					if (arg0 == 6304) {
						local157 = anIntArray450[--anInt5009];
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
						anIntArray450[anInt5009++] = local1313 ? 1 : 0;
						return;
					}
				} else if (arg0 < 6500) {
					if (arg0 == 6405) {
						anIntArray450[anInt5009++] = Static307.method1992() ? 1 : 0;
						return;
					}
					if (arg0 == 6406) {
						anIntArray450[anInt5009++] = Static12.method162() ? 1 : 0;
						return;
					}
				} else if (arg0 < 6600) {
					if (arg0 == 6500) {
						if (Static54.anInt1123 == 10 && Static65.anInt1374 == 0 && Static140.anInt2540 == 0 && Static90.anInt1675 == 0) {
							anIntArray450[anInt5009++] = Static255.method3941() == -1 ? 0 : 1;
							return;
						}
						anIntArray450[anInt5009++] = 1;
						return;
					}
					@Pc(6097) Class206 local6097;
					@Pc(6064) Class184_Sub1 local6064;
					if (arg0 == 6501) {
						local6064 = Static150.method2472();
						if (local6064 != null) {
							anIntArray450[anInt5009++] = local6064.anInt4776;
							anIntArray450[anInt5009++] = local6064.anInt4769;
							aStringArray37[anInt5007++] = local6064.aString41;
							local6097 = local6064.method4236();
							anIntArray450[anInt5009++] = local6097.anInt5319;
							aStringArray37[anInt5007++] = local6097.aString45;
							anIntArray450[anInt5009++] = local6064.anInt4767;
							anIntArray450[anInt5009++] = local6064.anInt4777;
							return;
						}
						anIntArray450[anInt5009++] = -1;
						anIntArray450[anInt5009++] = 0;
						aStringArray37[anInt5007++] = "";
						anIntArray450[anInt5009++] = 0;
						aStringArray37[anInt5007++] = "";
						anIntArray450[anInt5009++] = 0;
						anIntArray450[anInt5009++] = 0;
						return;
					}
					if (arg0 == 6502) {
						local6064 = Static71.method1393();
						if (local6064 != null) {
							anIntArray450[anInt5009++] = local6064.anInt4776;
							anIntArray450[anInt5009++] = local6064.anInt4769;
							aStringArray37[anInt5007++] = local6064.aString41;
							local6097 = local6064.method4236();
							anIntArray450[anInt5009++] = local6097.anInt5319;
							aStringArray37[anInt5007++] = local6097.aString45;
							anIntArray450[anInt5009++] = local6064.anInt4767;
							anIntArray450[anInt5009++] = local6064.anInt4777;
							return;
						}
						anIntArray450[anInt5009++] = -1;
						anIntArray450[anInt5009++] = 0;
						aStringArray37[anInt5007++] = "";
						anIntArray450[anInt5009++] = 0;
						aStringArray37[anInt5007++] = "";
						anIntArray450[anInt5009++] = 0;
						anIntArray450[anInt5009++] = 0;
						return;
					}
					if (arg0 == 6503) {
						local157 = anIntArray450[--anInt5009];
						if (Static54.anInt1123 == 10 && Static65.anInt1374 == 0 && Static140.anInt2540 == 0 && Static90.anInt1675 == 0) {
							anIntArray450[anInt5009++] = Static47.method5150(local157) ? 1 : 0;
							return;
						}
						anIntArray450[anInt5009++] = 0;
						return;
					}
					if (arg0 == 6504) {
						Static8.aClass173_Sub1_1.anInt4415 = anIntArray450[--anInt5009];
						Static8.aClass173_Sub1_1.method3970(Static165.aClass103_3);
						return;
					}
					if (arg0 == 6505) {
						anIntArray450[anInt5009++] = Static8.aClass173_Sub1_1.anInt4415;
						return;
					}
					if (arg0 == 6506) {
						local157 = anIntArray450[--anInt5009];
						@Pc(6413) Class184_Sub1 local6413 = Static243.method3753(local157);
						if (local6413 != null) {
							anIntArray450[anInt5009++] = local6413.anInt4769;
							aStringArray37[anInt5007++] = local6413.aString41;
							@Pc(6437) Class206 local6437 = local6413.method4236();
							anIntArray450[anInt5009++] = local6437.anInt5319;
							aStringArray37[anInt5007++] = local6437.aString45;
							anIntArray450[anInt5009++] = local6413.anInt4767;
							anIntArray450[anInt5009++] = local6413.anInt4777;
							return;
						}
						anIntArray450[anInt5009++] = -1;
						aStringArray37[anInt5007++] = "";
						anIntArray450[anInt5009++] = 0;
						aStringArray37[anInt5007++] = "";
						anIntArray450[anInt5009++] = 0;
						anIntArray450[anInt5009++] = 0;
						return;
					}
					if (arg0 == 6507) {
						anInt5009 -= 4;
						local157 = anIntArray450[anInt5009];
						local1313 = anIntArray450[anInt5009 + 1] == 1;
						local89 = anIntArray450[anInt5009 + 2];
						local1965 = anIntArray450[anInt5009 + 3] == 1;
						Static202.method3188(local1965, local157, local1313, local89);
						return;
					}
					if (arg0 == 6508) {
						Static157.method5939();
						return;
					}
					if (arg0 == 6509) {
						if (Static54.anInt1123 != 10) {
							return;
						}
						Static370.aBoolean410 = anIntArray450[--anInt5009] == 1;
						return;
					}
				} else if (arg0 < 6700) {
					if (arg0 == 6600) {
						Static8.aClass173_Sub1_1.aBoolean311 = anIntArray450[--anInt5009] == 1;
						Static8.aClass173_Sub1_1.method3970(Static165.aClass103_3);
						return;
					}
					if (arg0 == 6601) {
						anIntArray450[anInt5009++] = Static8.aClass173_Sub1_1.aBoolean311 ? 1 : 0;
						return;
					}
				} else if (arg0 < 6800 && Static35.aClass257_1 == Static186.aClass257_3) {
					if (arg0 == 6700) {
						local157 = Static20.aClass137_3.method3177();
						if (Static313.anInt5099 != -1) {
							local157++;
						}
						anIntArray450[anInt5009++] = local157;
						return;
					}
					if (arg0 == 6701) {
						local157 = anIntArray450[--anInt5009];
						if (Static313.anInt5099 != -1) {
							if (local157 == 0) {
								anIntArray450[anInt5009++] = Static313.anInt5099;
								return;
							}
							local157--;
						}
						@Pc(6695) Class6_Sub16 local6695 = (Class6_Sub16) Static20.aClass137_3.method3181();
						while (local157-- > 0) {
							local6695 = (Class6_Sub16) Static20.aClass137_3.method3182();
						}
						anIntArray450[anInt5009++] = local6695.anInt2715;
						return;
					}
					if (arg0 == 6702) {
						local157 = anIntArray450[--anInt5009];
						if (Static129.aClass239ArrayArray1[local157] == null) {
							aStringArray37[anInt5007++] = "";
							return;
						}
						local81 = Static129.aClass239ArrayArray1[local157][0].aString57;
						if (local81 == null) {
							aStringArray37[anInt5007++] = "";
							return;
						}
						aStringArray37[anInt5007++] = local81.substring(0, local81.indexOf(58));
						return;
					}
					if (arg0 == 6703) {
						local157 = anIntArray450[--anInt5009];
						if (Static129.aClass239ArrayArray1[local157] == null) {
							anIntArray450[anInt5009++] = 0;
							return;
						}
						anIntArray450[anInt5009++] = Static129.aClass239ArrayArray1[local157].length;
						return;
					}
					if (arg0 == 6704) {
						anInt5009 -= 2;
						local157 = anIntArray450[anInt5009];
						local192 = anIntArray450[anInt5009 + 1];
						if (Static129.aClass239ArrayArray1[local157] == null) {
							aStringArray37[anInt5007++] = "";
							return;
						}
						local3345 = Static129.aClass239ArrayArray1[local157][local192].aString57;
						if (local3345 == null) {
							aStringArray37[anInt5007++] = "";
							return;
						}
						aStringArray37[anInt5007++] = local3345;
						return;
					}
					if (arg0 == 6705) {
						anInt5009 -= 2;
						local157 = anIntArray450[anInt5009];
						local192 = anIntArray450[anInt5009 + 1];
						if (Static129.aClass239ArrayArray1[local157] == null) {
							anIntArray450[anInt5009++] = 0;
							return;
						}
						anIntArray450[anInt5009++] = Static129.aClass239ArrayArray1[local157][local192].anInt6490;
						return;
					}
					if (arg0 == 6706) {
						return;
					}
					if (arg0 == 6707) {
						anInt5009 -= 3;
						local157 = anIntArray450[anInt5009];
						local192 = anIntArray450[anInt5009 + 1];
						local89 = anIntArray450[anInt5009 + 2];
						Static401.method5466(local89, local157 << 16 | local192, "", 1);
						return;
					}
					if (arg0 == 6708) {
						anInt5009 -= 3;
						local157 = anIntArray450[anInt5009];
						local192 = anIntArray450[anInt5009 + 1];
						local89 = anIntArray450[anInt5009 + 2];
						Static401.method5466(local89, local157 << 16 | local192, "", 2);
						return;
					}
					if (arg0 == 6709) {
						anInt5009 -= 3;
						local157 = anIntArray450[anInt5009];
						local192 = anIntArray450[anInt5009 + 1];
						local89 = anIntArray450[anInt5009 + 2];
						Static401.method5466(local89, local157 << 16 | local192, "", 3);
						return;
					}
					if (arg0 == 6710) {
						anInt5009 -= 3;
						local157 = anIntArray450[anInt5009];
						local192 = anIntArray450[anInt5009 + 1];
						local89 = anIntArray450[anInt5009 + 2];
						Static401.method5466(local89, local157 << 16 | local192, "", 4);
						return;
					}
					if (arg0 == 6711) {
						anInt5009 -= 3;
						local157 = anIntArray450[anInt5009];
						local192 = anIntArray450[anInt5009 + 1];
						local89 = anIntArray450[anInt5009 + 2];
						Static401.method5466(local89, local157 << 16 | local192, "", 5);
						return;
					}
					if (arg0 == 6712) {
						anInt5009 -= 3;
						local157 = anIntArray450[anInt5009];
						local192 = anIntArray450[anInt5009 + 1];
						local89 = anIntArray450[anInt5009 + 2];
						Static401.method5466(local89, local157 << 16 | local192, "", 6);
						return;
					}
					if (arg0 == 6713) {
						anInt5009 -= 3;
						local157 = anIntArray450[anInt5009];
						local192 = anIntArray450[anInt5009 + 1];
						local89 = anIntArray450[anInt5009 + 2];
						Static401.method5466(local89, local157 << 16 | local192, "", 7);
						return;
					}
					if (arg0 == 6714) {
						anInt5009 -= 3;
						local157 = anIntArray450[anInt5009];
						local192 = anIntArray450[anInt5009 + 1];
						local89 = anIntArray450[anInt5009 + 2];
						Static401.method5466(local89, local157 << 16 | local192, "", 8);
						return;
					}
					if (arg0 == 6715) {
						anInt5009 -= 3;
						local157 = anIntArray450[anInt5009];
						local192 = anIntArray450[anInt5009 + 1];
						local89 = anIntArray450[anInt5009 + 2];
						Static401.method5466(local89, local157 << 16 | local192, "", 9);
						return;
					}
					if (arg0 == 6716) {
						anInt5009 -= 3;
						local157 = anIntArray450[anInt5009];
						local192 = anIntArray450[anInt5009 + 1];
						local89 = anIntArray450[anInt5009 + 2];
						Static401.method5466(local89, local157 << 16 | local192, "", 10);
						return;
					}
					if (arg0 == 6717) {
						anInt5009 -= 3;
						local157 = anIntArray450[anInt5009];
						local192 = anIntArray450[anInt5009 + 1];
						local89 = anIntArray450[anInt5009 + 2];
						@Pc(7283) Class239 local7283 = Static316.method5795(local89, local157 << 16 | local192);
						Static12.method160();
						@Pc(7288) Class6_Sub30 local7288 = Static54.method1017(local7283);
						Static270.method4109(local7288.anInt5763, local7283, local7288.method4842());
						return;
					}
				} else if (arg0 < 6900) {
					@Pc(7316) Class94 local7316;
					if (arg0 == 6800) {
						local157 = anIntArray450[--anInt5009];
						local7316 = Static171.aClass254_3.method5834(local157);
						if (local7316.aString20 == null) {
							aStringArray37[anInt5007++] = "";
							return;
						}
						aStringArray37[anInt5007++] = local7316.aString20;
						return;
					}
					if (arg0 == 6801) {
						local157 = anIntArray450[--anInt5009];
						local7316 = Static171.aClass254_3.method5834(local157);
						anIntArray450[anInt5009++] = local7316.anInt2183;
						return;
					}
					if (arg0 == 6802) {
						local157 = anIntArray450[--anInt5009];
						local7316 = Static171.aClass254_3.method5834(local157);
						anIntArray450[anInt5009++] = local7316.anInt2190;
						return;
					}
					if (arg0 == 6803) {
						local157 = anIntArray450[--anInt5009];
						local7316 = Static171.aClass254_3.method5834(local157);
						anIntArray450[anInt5009++] = local7316.anInt2178;
						return;
					}
					if (arg0 == 6804) {
						anInt5009 -= 2;
						local157 = anIntArray450[anInt5009];
						local192 = anIntArray450[anInt5009 + 1];
						@Pc(7438) Class255 local7438 = Static414.aClass258_2.method5882(local192);
						if (local7438.method5849()) {
							aStringArray37[anInt5007++] = Static171.aClass254_3.method5834(local157).method1998(local192, local7438.aString68);
							return;
						}
						anIntArray450[anInt5009++] = Static171.aClass254_3.method5834(local157).method2005(local192, local7438.anInt7133);
						return;
					}
				}
			}
		}
		throw new IllegalStateException();
	}
}
