import jagex3.jagmisc.jagmisc;
import java.io.IOException;
import java.util.Calendar;
import java.util.Date;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static180 {

	@OriginalMember(owner = "client!he", name = "a", descriptor = "[I")
	private static int[] anIntArray296;

	@OriginalMember(owner = "client!he", name = "b", descriptor = "[Ljava/lang/String;")
	private static String[] aStringArray16;

	@OriginalMember(owner = "client!he", name = "c", descriptor = "Lclient!jq;")
	private static Class156 aClass156_6;

	@OriginalMember(owner = "client!he", name = "d", descriptor = "Lclient!jq;")
	private static Class156 aClass156_7;

	@OriginalMember(owner = "client!he", name = "x", descriptor = "Lclient!vg;")
	private static Class300 aClass300_1;

	@OriginalMember(owner = "client!he", name = "f", descriptor = "[[I")
	private static final int[][] anIntArrayArray37 = new int[5][5000];

	@OriginalMember(owner = "client!he", name = "h", descriptor = "[Lclient!il;")
	private static final Class139[] aClass139Array1 = new Class139[50];

	@OriginalMember(owner = "client!he", name = "i", descriptor = "I")
	private static int anInt3171 = 0;

	@OriginalMember(owner = "client!he", name = "m", descriptor = "I")
	private static int anInt3175 = 0;

	@OriginalMember(owner = "client!he", name = "n", descriptor = "Ljava/util/Calendar;")
	private static final Calendar aCalendar1 = Calendar.getInstance();

	@OriginalMember(owner = "client!he", name = "o", descriptor = "[I")
	private static final int[] anIntArray297 = new int[5];

	@OriginalMember(owner = "client!he", name = "r", descriptor = "[I")
	private static final int[] anIntArray298 = new int[1000];

	@OriginalMember(owner = "client!he", name = "s", descriptor = "[Ljava/lang/String;")
	private static final String[] aStringArray17 = new String[1000];

	@OriginalMember(owner = "client!he", name = "t", descriptor = "I")
	private static int anInt3178 = 0;

	@OriginalMember(owner = "client!he", name = "z", descriptor = "Lclient!wg;")
	public static final Class313 aClass313_24 = new Class313(4);

	@OriginalMember(owner = "client!he", name = "A", descriptor = "[Ljava/lang/String;")
	private static final String[] aStringArray18 = new String[] { "Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec" };

	@OriginalMember(owner = "client!he", name = "B", descriptor = "[I")
	private static final int[] anIntArray299 = new int[3];

	@OriginalMember(owner = "client!he", name = "C", descriptor = "I")
	private static int anInt3183 = 0;

	@OriginalMember(owner = "client!he", name = "a", descriptor = "(I)V")
	private static void method2673(@OriginalArg(0) int arg0) {
		@Pc(3) Class156 local3 = Static182.method2888(arg0);
		if (local3 == null) {
			return;
		}
		@Pc(9) int local9 = arg0 >>> 16;
		@Pc(13) Class156[] local13 = Static520.aClass156ArrayArray2[local9];
		if (local13 == null) {
			@Pc(19) Class156[] local19 = Static396.aClass156ArrayArray1[local9];
			@Pc(22) int local22 = local19.length;
			local13 = Static520.aClass156ArrayArray2[local9] = new Class156[local22];
			Static551.method3490(local19, 0, local13, 0, local19.length);
		}
		@Pc(38) int local38;
		for (local38 = 0; local38 < local13.length && local13[local38] != local3; local38++) {
		}
		if (local38 >= local13.length) {
			return;
		}
		Static551.method3490(local13, local38 + 1, local13, local38, local13.length - local38 - 1);
		local13[local13.length - 1] = local3;
	}

	@OriginalMember(owner = "client!he", name = "a", descriptor = "(Lclient!dh;II)V")
	public static void method2674(@OriginalArg(0) Class64 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(5) Class1_Sub1_Sub18 local5 = Static232.method4012(arg0, arg2, arg1);
		if (local5 == null) {
			return;
		}
		anIntArray296 = new int[local5.anInt9151];
		aStringArray16 = new String[local5.anInt9153];
		if (local5.aClass64_12 == Static167.aClass64_5 || local5.aClass64_12 == Static518.aClass64_10 || local5.aClass64_12 == Static515.aClass64_8) {
			@Pc(30) int local30 = 0;
			@Pc(32) int local32 = 0;
			if (Static287.aClass156_13 != null) {
				local30 = Static287.aClass156_13.anInt4734;
				local32 = Static287.aClass156_13.anInt4702;
			}
			anIntArray296[0] = Static498.aClass5_1.method7052() - local30;
			anIntArray296[1] = Static498.aClass5_1.method7042() - local32;
		}
		method2678(local5, 200000);
	}

	@OriginalMember(owner = "client!he", name = "a", descriptor = "(IZ)V")
	private static void method2675(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1) {
		@Pc(137) Class156 local137;
		@Pc(19) int local19;
		@Pc(56) int local56;
		@Pc(25) int local25;
		@Pc(35) Class156 local35;
		@Pc(158) Class156 local158;
		@Pc(210) Class156 local210;
		@Pc(13) int local13;
		if (arg0 < 300) {
			if (arg0 == 100) {
				anInt3171 -= 3;
				local13 = anIntArray298[anInt3171];
				local19 = anIntArray298[anInt3171 + 1];
				local25 = anIntArray298[anInt3171 + 2];
				if (local19 == 0) {
					throw new RuntimeException();
				}
				local35 = Static182.method2888(local13);
				if (local35.aClass156Array1 == null) {
					local35.aClass156Array1 = new Class156[local25 + 1];
				}
				if (local35.aClass156Array1.length <= local25) {
					@Pc(54) Class156[] local54 = new Class156[local25 + 1];
					for (local56 = 0; local56 < local35.aClass156Array1.length; local56++) {
						local54[local56] = local35.aClass156Array1[local56];
					}
					local35.aClass156Array1 = local54;
				}
				if (local25 > 0 && local35.aClass156Array1[local25 - 1] == null) {
					throw new RuntimeException("Gap at:" + (local25 - 1));
				}
				@Pc(99) Class156 local99 = new Class156();
				local99.anInt4735 = local19;
				local99.anInt4686 = local99.anInt4677 = local35.anInt4677;
				local99.anInt4723 = local25;
				local35.aClass156Array1[local25] = local99;
				if (arg1) {
					aClass156_6 = local99;
				} else {
					aClass156_7 = local99;
				}
				Static473.method6593(local35);
				return;
			}
			if (arg0 == 101) {
				local137 = arg1 ? aClass156_6 : aClass156_7;
				if (local137.anInt4723 == -1) {
					if (arg1) {
						throw new RuntimeException("Tried to .cc_delete static .active-component!");
					}
					throw new RuntimeException("Tried to cc_delete static active-component!");
				}
				local158 = Static182.method2888(local137.anInt4677);
				local158.aClass156Array1[local137.anInt4723] = null;
				Static473.method6593(local158);
				return;
			}
			if (arg0 == 102) {
				local137 = Static182.method2888(anIntArray298[--anInt3171]);
				local137.aClass156Array1 = null;
				Static473.method6593(local137);
				return;
			}
			if (arg0 == 200) {
				anInt3171 -= 2;
				local13 = anIntArray298[anInt3171];
				local19 = anIntArray298[anInt3171 + 1];
				local210 = Static518.method7135(local19, local13);
				if (local210 != null && local19 != -1) {
					anIntArray298[anInt3171++] = 1;
					if (arg1) {
						aClass156_6 = local210;
						return;
					}
					aClass156_7 = local210;
					return;
				}
				anIntArray298[anInt3171++] = 0;
				return;
			}
			if (arg0 == 201) {
				local13 = anIntArray298[--anInt3171];
				local158 = Static182.method2888(local13);
				if (local158 != null) {
					anIntArray298[anInt3171++] = 1;
					if (arg1) {
						aClass156_6 = local158;
						return;
					}
					aClass156_7 = local158;
					return;
				}
				anIntArray298[anInt3171++] = 0;
				return;
			}
			if (arg0 == 202) {
				local13 = anIntArray298[--anInt3171];
				method2673(local13);
				return;
			}
			if (arg0 == 203) {
				local13 = anIntArray298[--anInt3171];
				method2682(local13);
				return;
			}
		} else {
			@Pc(353) int local353;
			@Pc(412) boolean local412;
			if (arg0 < 500) {
				if (arg0 == 403) {
					anInt3171 -= 2;
					local13 = anIntArray298[anInt3171];
					local19 = anIntArray298[anInt3171 + 1];
					for (local25 = 0; local25 < Static145.anIntArray269.length; local25++) {
						if (Static145.anIntArray269[local25] == local13) {
							Static63.aClass49_Sub2_Sub2_Sub1_1.aClass206_1.method5021(local25, Static477.aClass15_1, local19);
							return;
						}
					}
					for (local353 = 0; local353 < Static117.anIntArray231.length; local353++) {
						if (Static117.anIntArray231[local353] == local13) {
							Static63.aClass49_Sub2_Sub2_Sub1_1.aClass206_1.method5021(local353, Static477.aClass15_1, local19);
							return;
						}
					}
					return;
				}
				if (arg0 == 404) {
					anInt3171 -= 2;
					local13 = anIntArray298[anInt3171];
					local19 = anIntArray298[anInt3171 + 1];
					Static63.aClass49_Sub2_Sub2_Sub1_1.aClass206_1.method5020(local13, local19);
					return;
				}
				if (arg0 == 410) {
					local412 = anIntArray298[--anInt3171] != 0;
					Static63.aClass49_Sub2_Sub2_Sub1_1.aClass206_1.method5023(local412);
					return;
				}
			} else if (arg0 >= 1000 && arg0 < 1100 || arg0 >= 2000 && arg0 < 2100) {
				if (arg0 >= 2000) {
					arg0 -= 1000;
					local137 = Static182.method2888(anIntArray298[--anInt3171]);
				} else {
					local137 = arg1 ? aClass156_6 : aClass156_7;
				}
				if (arg0 == 1000) {
					anInt3171 -= 4;
					local137.anInt4681 = anIntArray298[anInt3171];
					local137.anInt4706 = anIntArray298[anInt3171 + 1];
					local19 = anIntArray298[anInt3171 + 2];
					if (local19 < 0) {
						local19 = 0;
					} else if (local19 > 5) {
						local19 = 5;
					}
					local25 = anIntArray298[anInt3171 + 3];
					if (local25 < 0) {
						local25 = 0;
					} else if (local25 > 5) {
						local25 = 5;
					}
					local137.aByte60 = (byte) local19;
					local137.aByte62 = (byte) local25;
					Static473.method6593(local137);
					Static51.method985(local137);
					if (local137.anInt4723 == -1) {
						Static404.method6685(local137.anInt4677);
					}
					return;
				}
				if (arg0 == 1001) {
					anInt3171 -= 4;
					local137.anInt4671 = anIntArray298[anInt3171];
					local137.anInt4737 = anIntArray298[anInt3171 + 1];
					local137.anInt4713 = 0;
					local137.anInt4663 = 0;
					local19 = anIntArray298[anInt3171 + 2];
					if (local19 < 0) {
						local19 = 0;
					} else if (local19 > 4) {
						local19 = 4;
					}
					local25 = anIntArray298[anInt3171 + 3];
					if (local25 < 0) {
						local25 = 0;
					} else if (local25 > 4) {
						local25 = 4;
					}
					local137.aByte61 = (byte) local19;
					local137.aByte59 = (byte) local25;
					Static473.method6593(local137);
					Static51.method985(local137);
					if (local137.anInt4735 == 0) {
						Static193.method6045(local137, false);
					}
					return;
				}
				if (arg0 == 1003) {
					@Pc(620) boolean local620 = anIntArray298[--anInt3171] == 1;
					if (local137.aBoolean327 != local620) {
						local137.aBoolean327 = local620;
						Static473.method6593(local137);
					}
					if (local137.anInt4723 == -1) {
						Static53.method1037(local137.anInt4677);
					}
					return;
				}
				if (arg0 == 1004) {
					anInt3171 -= 2;
					local137.anInt4722 = anIntArray298[anInt3171];
					local137.anInt4695 = anIntArray298[anInt3171 + 1];
					Static473.method6593(local137);
					Static51.method985(local137);
					if (local137.anInt4735 == 0) {
						Static193.method6045(local137, false);
					}
					return;
				}
				if (arg0 == 1005) {
					local137.aBoolean321 = anIntArray298[--anInt3171] == 1;
					return;
				}
			} else {
				@Pc(1488) String local1488;
				@Pc(1101) String local1101;
				if (arg0 >= 1100 && arg0 < 1200 || !(arg0 < 2100 || arg0 >= 2200)) {
					if (arg0 >= 2000) {
						arg0 -= 1000;
						local137 = Static182.method2888(anIntArray298[--anInt3171]);
					} else {
						local137 = arg1 ? aClass156_6 : aClass156_7;
					}
					if (arg0 == 1100) {
						anInt3171 -= 2;
						local137.anInt4711 = anIntArray298[anInt3171];
						if (local137.anInt4711 > local137.anInt4712 - local137.anInt4732) {
							local137.anInt4711 = local137.anInt4712 - local137.anInt4732;
						}
						if (local137.anInt4711 < 0) {
							local137.anInt4711 = 0;
						}
						local137.anInt4707 = anIntArray298[anInt3171 + 1];
						if (local137.anInt4707 > local137.anInt4719 - local137.anInt4673) {
							local137.anInt4707 = local137.anInt4719 - local137.anInt4673;
						}
						if (local137.anInt4707 < 0) {
							local137.anInt4707 = 0;
						}
						Static473.method6593(local137);
						if (local137.anInt4723 == -1) {
							Static112.method1910(local137.anInt4677);
						}
						return;
					}
					if (arg0 == 1101) {
						local137.anInt4662 = anIntArray298[--anInt3171];
						Static473.method6593(local137);
						if (local137.anInt4723 == -1) {
							Static92.method1634(local137.anInt4677);
						}
						return;
					}
					if (arg0 == 1102) {
						local137.aBoolean333 = anIntArray298[--anInt3171] == 1;
						Static473.method6593(local137);
						return;
					}
					if (arg0 == 1103) {
						local137.anInt4738 = anIntArray298[--anInt3171];
						Static473.method6593(local137);
						return;
					}
					if (arg0 == 1104) {
						local137.anInt4687 = anIntArray298[--anInt3171];
						Static473.method6593(local137);
						return;
					}
					if (arg0 == 1105) {
						local19 = anIntArray298[--anInt3171];
						if (local137.anInt4699 != local19) {
							local137.anInt4699 = local19;
							Static473.method6593(local137);
						}
						if (local137.anInt4723 == -1) {
							Static215.method3606(local137.anInt4677);
						}
						return;
					}
					if (arg0 == 1106) {
						local137.anInt4704 = anIntArray298[--anInt3171];
						Static473.method6593(local137);
						return;
					}
					if (arg0 == 1107) {
						local137.aBoolean324 = anIntArray298[--anInt3171] == 1;
						Static473.method6593(local137);
						return;
					}
					if (arg0 == 1108) {
						local137.anInt4718 = 1;
						local137.anInt4657 = anIntArray298[--anInt3171];
						Static473.method6593(local137);
						if (local137.anInt4723 == -1) {
							Static93.method1640(local137.anInt4677);
						}
						return;
					}
					if (arg0 == 1109) {
						anInt3171 -= 6;
						local137.anInt4658 = anIntArray298[anInt3171];
						local137.anInt4736 = anIntArray298[anInt3171 + 1];
						local137.anInt4733 = anIntArray298[anInt3171 + 2];
						local137.anInt4716 = anIntArray298[anInt3171 + 3];
						local137.anInt4726 = anIntArray298[anInt3171 + 4];
						local137.anInt4647 = anIntArray298[anInt3171 + 5];
						Static473.method6593(local137);
						if (local137.anInt4723 == -1) {
							Static161.method2498(local137.anInt4677);
							Static95.method1651(local137.anInt4677);
						}
						return;
					}
					if (arg0 == 1110) {
						local19 = anIntArray298[--anInt3171];
						if (local137.anInt4693 != local19) {
							local137.anInt4693 = local19;
							local137.anInt4652 = 0;
							local137.anInt4680 = 1;
							local137.anInt4670 = 0;
							Static473.method6593(local137);
						}
						if (local137.anInt4723 == -1) {
							Static308.method4861(local137.anInt4677);
						}
						return;
					}
					if (arg0 == 1111) {
						local137.aBoolean325 = anIntArray298[--anInt3171] == 1;
						Static473.method6593(local137);
						return;
					}
					if (arg0 == 1112) {
						local1101 = aStringArray17[--anInt3178];
						if (!local1101.equals(local137.aString42)) {
							local137.aString42 = local1101;
							Static473.method6593(local137);
						}
						if (local137.anInt4723 == -1) {
							Static293.method4701(local137.anInt4677);
						}
						return;
					}
					if (arg0 == 1113) {
						local137.anInt4650 = anIntArray298[--anInt3171];
						Static473.method6593(local137);
						if (local137.anInt4723 == -1) {
							Static176.method2644(local137.anInt4677);
						}
						return;
					}
					if (arg0 == 1114) {
						anInt3171 -= 3;
						local137.anInt4730 = anIntArray298[anInt3171];
						local137.anInt4661 = anIntArray298[anInt3171 + 1];
						local137.anInt4721 = anIntArray298[anInt3171 + 2];
						Static473.method6593(local137);
						return;
					}
					if (arg0 == 1115) {
						local137.aBoolean320 = anIntArray298[--anInt3171] == 1;
						Static473.method6593(local137);
						return;
					}
					if (arg0 == 1116) {
						local137.anInt4672 = anIntArray298[--anInt3171];
						Static473.method6593(local137);
						return;
					}
					if (arg0 == 1117) {
						local137.anInt4651 = anIntArray298[--anInt3171];
						Static473.method6593(local137);
						return;
					}
					if (arg0 == 1118) {
						local137.aBoolean331 = anIntArray298[--anInt3171] == 1;
						Static473.method6593(local137);
						return;
					}
					if (arg0 == 1119) {
						local137.lb = anIntArray298[--anInt3171] == 1;
						Static473.method6593(local137);
						return;
					}
					if (arg0 == 1120) {
						anInt3171 -= 2;
						local137.anInt4712 = anIntArray298[anInt3171];
						local137.anInt4719 = anIntArray298[anInt3171 + 1];
						Static473.method6593(local137);
						if (local137.anInt4735 == 0) {
							Static193.method6045(local137, false);
						}
						return;
					}
					if (arg0 == 1121) {
						anInt3171 -= 2;
						local137.anInt4665 = (short) anIntArray298[anInt3171];
						local137.anInt4678 = (short) anIntArray298[anInt3171 + 1];
						Static473.method6593(local137);
						return;
					}
					if (arg0 == 1122) {
						local137.aBoolean326 = anIntArray298[--anInt3171] == 1;
						Static473.method6593(local137);
						return;
					}
					if (arg0 == 1123) {
						local137.anInt4647 = anIntArray298[--anInt3171];
						Static473.method6593(local137);
						if (local137.anInt4723 == -1) {
							Static161.method2498(local137.anInt4677);
						}
						return;
					}
					if (arg0 == 1124) {
						local19 = anIntArray298[--anInt3171];
						local137.aBoolean334 = local19 == 1;
						Static473.method6593(local137);
						return;
					}
					if (arg0 == 1125) {
						anInt3171 -= 2;
						local137.anInt4655 = anIntArray298[anInt3171];
						local137.anInt4674 = anIntArray298[anInt3171 + 1];
						Static473.method6593(local137);
						return;
					}
					if (arg0 == 1126) {
						local137.anInt4692 = anIntArray298[--anInt3171];
						Static473.method6593(local137);
						return;
					}
					@Pc(1454) Class71 local1454;
					if (arg0 == 1127) {
						anInt3171 -= 2;
						local19 = anIntArray298[anInt3171];
						local25 = anIntArray298[anInt3171 + 1];
						local1454 = Static452.aClass317_2.method7539(local19);
						if (local25 != local1454.anInt1963) {
							local137.method4055(local25, local19);
							return;
						}
						local137.method4059(local19);
						return;
					}
					if (arg0 == 1128) {
						local19 = anIntArray298[--anInt3171];
						local1488 = aStringArray17[--anInt3178];
						local1454 = Static452.aClass317_2.method7539(local19);
						if (!local1454.aString18.equals(local1488)) {
							local137.method4063(local1488, local19);
							return;
						}
						local137.method4059(local19);
						return;
					}
				} else if ((arg0 < 1200 || arg0 >= 1300) && (arg0 < 2200 || arg0 >= 2300)) {
					@Pc(2290) int local2290;
					if ((arg0 < 1300 || arg0 >= 1400) && (arg0 < 2300 || arg0 >= 2400)) {
						if (arg0 >= 1400 && arg0 < 1500 || arg0 >= 2400 && arg0 < 2500) {
							if (arg0 >= 2000) {
								arg0 -= 1000;
								local137 = Static182.method2888(anIntArray298[--anInt3171]);
							} else {
								local137 = arg1 ? aClass156_6 : aClass156_7;
							}
							if (arg0 == 1499) {
								local137.method4060();
								return;
							}
							local1101 = aStringArray17[--anInt3178];
							@Pc(2376) int[] local2376 = null;
							if (local1101.length() > 0 && local1101.charAt(local1101.length() - 1) == 'Y') {
								local353 = anIntArray298[--anInt3171];
								if (local353 > 0) {
									local2376 = new int[local353];
									while (local353-- > 0) {
										local2376[local353] = anIntArray298[--anInt3171];
									}
								}
								local1101 = local1101.substring(0, local1101.length() - 1);
							}
							@Pc(2428) Object[] local2428 = new Object[local1101.length() + 1];
							for (local2290 = local2428.length - 1; local2290 >= 1; local2290--) {
								if (local1101.charAt(local2290 - 1) == 's') {
									local2428[local2290] = aStringArray17[--anInt3178];
								} else {
									local2428[local2290] = Integer.valueOf(anIntArray298[--anInt3171]);
								}
							}
							local56 = anIntArray298[--anInt3171];
							if (local56 == -1) {
								local2428 = null;
							} else {
								local2428[0] = Integer.valueOf(local56);
							}
							if (arg0 == 1400) {
								local137.anObjectArray24 = local2428;
							} else if (arg0 == 1401) {
								local137.anObjectArray23 = local2428;
							} else if (arg0 == 1402) {
								local137.anObjectArray4 = local2428;
							} else if (arg0 == 1403) {
								local137.anObjectArray20 = local2428;
							} else if (arg0 == 1404) {
								local137.anObjectArray22 = local2428;
							} else if (arg0 == 1405) {
								local137.anObjectArray12 = local2428;
							} else if (arg0 == 1406) {
								local137.anObjectArray5 = local2428;
							} else if (arg0 == 1407) {
								local137.anObjectArray31 = local2428;
								local137.anIntArray448 = local2376;
							} else if (arg0 == 1408) {
								local137.anObjectArray13 = local2428;
							} else if (arg0 == 1409) {
								local137.anObjectArray26 = local2428;
							} else if (arg0 == 1410) {
								local137.anObjectArray21 = local2428;
							} else if (arg0 == 1411) {
								local137.anObjectArray8 = local2428;
							} else if (arg0 == 1412) {
								local137.anObjectArray11 = local2428;
							} else if (arg0 == 1414) {
								local137.anObjectArray19 = local2428;
								local137.anIntArray452 = local2376;
							} else if (arg0 == 1415) {
								local137.anObjectArray25 = local2428;
								local137.anIntArray456 = local2376;
							} else if (arg0 == 1416) {
								local137.anObjectArray34 = local2428;
							} else if (arg0 == 1417) {
								local137.anObjectArray30 = local2428;
							} else if (arg0 == 1418) {
								local137.anObjectArray14 = local2428;
							} else if (arg0 == 1419) {
								local137.anObjectArray7 = local2428;
							} else if (arg0 == 1420) {
								local137.anObjectArray32 = local2428;
							} else if (arg0 == 1421) {
								local137.anObjectArray28 = local2428;
							} else if (arg0 == 1422) {
								local137.anObjectArray18 = local2428;
							} else if (arg0 == 1423) {
								local137.anObjectArray27 = local2428;
							} else if (arg0 == 1424) {
								local137.anObjectArray29 = local2428;
							} else if (arg0 == 1425) {
								local137.anObjectArray9 = local2428;
							} else if (arg0 == 1426) {
								local137.anObjectArray17 = local2428;
							} else if (arg0 == 1427) {
								local137.anObjectArray6 = local2428;
							} else if (arg0 == 1428) {
								local137.anObjectArray16 = local2428;
								local137.anIntArray455 = local2376;
							} else if (arg0 == 1429) {
								local137.anObjectArray15 = local2428;
								local137.anIntArray451 = local2376;
							} else if (arg0 == 1430) {
								local137.anObjectArray33 = local2428;
							}
							local137.aBoolean329 = true;
							return;
						}
						if (arg0 < 1600) {
							local137 = arg1 ? aClass156_6 : aClass156_7;
							if (arg0 == 1500) {
								anIntArray298[anInt3171++] = local137.anInt4734;
								return;
							}
							if (arg0 == 1501) {
								anIntArray298[anInt3171++] = local137.anInt4702;
								return;
							}
							if (arg0 == 1502) {
								anIntArray298[anInt3171++] = local137.anInt4732;
								return;
							}
							if (arg0 == 1503) {
								anIntArray298[anInt3171++] = local137.anInt4673;
								return;
							}
							if (arg0 == 1504) {
								anIntArray298[anInt3171++] = local137.aBoolean327 ? 1 : 0;
								return;
							}
							if (arg0 == 1505) {
								anIntArray298[anInt3171++] = local137.anInt4686;
								return;
							}
							if (arg0 == 1506) {
								local158 = Static189.method2934(local137);
								anIntArray298[anInt3171++] = local158 == null ? -1 : local158.anInt4677;
								return;
							}
						} else {
							@Pc(3024) Class71 local3024;
							if (arg0 < 1700) {
								local137 = arg1 ? aClass156_6 : aClass156_7;
								if (arg0 == 1600) {
									anIntArray298[anInt3171++] = local137.anInt4711;
									return;
								}
								if (arg0 == 1601) {
									anIntArray298[anInt3171++] = local137.anInt4707;
									return;
								}
								if (arg0 == 1602) {
									aStringArray17[anInt3178++] = local137.aString42;
									return;
								}
								if (arg0 == 1603) {
									anIntArray298[anInt3171++] = local137.anInt4712;
									return;
								}
								if (arg0 == 1604) {
									anIntArray298[anInt3171++] = local137.anInt4719;
									return;
								}
								if (arg0 == 1605) {
									anIntArray298[anInt3171++] = local137.anInt4647;
									return;
								}
								if (arg0 == 1606) {
									anIntArray298[anInt3171++] = local137.anInt4733;
									return;
								}
								if (arg0 == 1607) {
									anIntArray298[anInt3171++] = local137.anInt4726;
									return;
								}
								if (arg0 == 1608) {
									anIntArray298[anInt3171++] = local137.anInt4716;
									return;
								}
								if (arg0 == 1609) {
									anIntArray298[anInt3171++] = local137.anInt4738;
									return;
								}
								if (arg0 == 1610) {
									anIntArray298[anInt3171++] = local137.anInt4658;
									return;
								}
								if (arg0 == 1611) {
									anIntArray298[anInt3171++] = local137.anInt4736;
									return;
								}
								if (arg0 == 1612) {
									anIntArray298[anInt3171++] = local137.anInt4699;
									return;
								}
								if (arg0 == 1613) {
									local19 = anIntArray298[--anInt3171];
									local3024 = Static452.aClass317_2.method7539(local19);
									if (local3024.method1654()) {
										aStringArray17[anInt3178++] = local137.method4050(local3024.aString18, local19);
										return;
									}
									anIntArray298[anInt3171++] = local137.method4048(local19, local3024.anInt1963);
									return;
								}
							} else if (arg0 < 1800) {
								local137 = arg1 ? aClass156_6 : aClass156_7;
								if (arg0 == 1700) {
									anIntArray298[anInt3171++] = local137.anInt4697;
									return;
								}
								if (arg0 == 1701) {
									if (local137.anInt4697 != -1) {
										anIntArray298[anInt3171++] = local137.anInt4728;
										return;
									}
									anIntArray298[anInt3171++] = 0;
									return;
								}
								if (arg0 == 1702) {
									anIntArray298[anInt3171++] = local137.anInt4723;
									return;
								}
							} else if (arg0 < 1900) {
								local137 = arg1 ? aClass156_6 : aClass156_7;
								if (arg0 == 1800) {
									anIntArray298[anInt3171++] = Static67.method1228(local137).method2103();
									return;
								}
								if (arg0 == 1801) {
									local19 = anIntArray298[--anInt3171];
									local19--;
									if (local137.aStringArray24 != null && local19 < local137.aStringArray24.length && local137.aStringArray24[local19] != null) {
										aStringArray17[anInt3178++] = local137.aStringArray24[local19];
										return;
									}
									aStringArray17[anInt3178++] = "";
									return;
								}
								if (arg0 == 1802) {
									if (local137.aString44 == null) {
										aStringArray17[anInt3178++] = "";
										return;
									}
									aStringArray17[anInt3178++] = local137.aString44;
									return;
								}
							} else if (arg0 < 2000 || arg0 >= 2900 && arg0 < 3000) {
								if (arg0 >= 2000) {
									local137 = Static182.method2888(anIntArray298[--anInt3171]);
									arg0 -= 1000;
								} else {
									local137 = arg1 ? aClass156_6 : aClass156_7;
								}
								if (anInt3183 >= 10) {
									throw new RuntimeException("C29xx-1");
								}
								if (arg0 == 1927) {
									if (local137.anObjectArray6 == null) {
										return;
									}
									@Pc(3261) Class1_Sub30 local3261 = new Class1_Sub30();
									local3261.aClass156_11 = local137;
									local3261.anObjectArray36 = local137.anObjectArray6;
									local3261.anInt5297 = anInt3183 + 1;
									Static90.aClass37_21.method970(local3261);
									return;
								}
							} else if (arg0 < 2600) {
								local137 = Static182.method2888(anIntArray298[--anInt3171]);
								if (arg0 == 2500) {
									anIntArray298[anInt3171++] = local137.anInt4734;
									return;
								}
								if (arg0 == 2501) {
									anIntArray298[anInt3171++] = local137.anInt4702;
									return;
								}
								if (arg0 == 2502) {
									anIntArray298[anInt3171++] = local137.anInt4732;
									return;
								}
								if (arg0 == 2503) {
									anIntArray298[anInt3171++] = local137.anInt4673;
									return;
								}
								if (arg0 == 2504) {
									anIntArray298[anInt3171++] = local137.aBoolean327 ? 1 : 0;
									return;
								}
								if (arg0 == 2505) {
									anIntArray298[anInt3171++] = local137.anInt4686;
									return;
								}
								if (arg0 == 1506) {
									local158 = Static189.method2934(local137);
									anIntArray298[anInt3171++] = local158 == null ? -1 : local158.anInt4677;
									return;
								}
							} else if (arg0 < 2700) {
								local137 = Static182.method2888(anIntArray298[--anInt3171]);
								if (arg0 == 2600) {
									anIntArray298[anInt3171++] = local137.anInt4711;
									return;
								}
								if (arg0 == 2601) {
									anIntArray298[anInt3171++] = local137.anInt4707;
									return;
								}
								if (arg0 == 2602) {
									aStringArray17[anInt3178++] = local137.aString42;
									return;
								}
								if (arg0 == 2603) {
									anIntArray298[anInt3171++] = local137.anInt4712;
									return;
								}
								if (arg0 == 2604) {
									anIntArray298[anInt3171++] = local137.anInt4719;
									return;
								}
								if (arg0 == 2605) {
									anIntArray298[anInt3171++] = local137.anInt4647;
									return;
								}
								if (arg0 == 2606) {
									anIntArray298[anInt3171++] = local137.anInt4733;
									return;
								}
								if (arg0 == 2607) {
									anIntArray298[anInt3171++] = local137.anInt4726;
									return;
								}
								if (arg0 == 2608) {
									anIntArray298[anInt3171++] = local137.anInt4716;
									return;
								}
								if (arg0 == 2609) {
									anIntArray298[anInt3171++] = local137.anInt4738;
									return;
								}
								if (arg0 == 2610) {
									anIntArray298[anInt3171++] = local137.anInt4658;
									return;
								}
								if (arg0 == 2611) {
									anIntArray298[anInt3171++] = local137.anInt4736;
									return;
								}
								if (arg0 == 2612) {
									anIntArray298[anInt3171++] = local137.anInt4699;
									return;
								}
							} else {
								@Pc(3758) Class1_Sub35 local3758;
								@Pc(3656) Class1_Sub35 local3656;
								if (arg0 < 2800) {
									if (arg0 == 2700) {
										local137 = Static182.method2888(anIntArray298[--anInt3171]);
										anIntArray298[anInt3171++] = local137.anInt4697;
										return;
									}
									if (arg0 == 2701) {
										local137 = Static182.method2888(anIntArray298[--anInt3171]);
										if (local137.anInt4697 != -1) {
											anIntArray298[anInt3171++] = local137.anInt4728;
											return;
										}
										anIntArray298[anInt3171++] = 0;
										return;
									}
									if (arg0 == 2702) {
										local13 = anIntArray298[--anInt3171];
										local3656 = (Class1_Sub35) Static468.aClass17_36.method738((long) local13);
										if (local3656 != null) {
											anIntArray298[anInt3171++] = 1;
											return;
										}
										anIntArray298[anInt3171++] = 0;
										return;
									}
									if (arg0 == 2703) {
										local137 = Static182.method2888(anIntArray298[--anInt3171]);
										if (local137.aClass156Array1 == null) {
											anIntArray298[anInt3171++] = 0;
											return;
										}
										local19 = local137.aClass156Array1.length;
										for (local25 = 0; local25 < local137.aClass156Array1.length; local25++) {
											if (local137.aClass156Array1[local25] == null) {
												local19 = local25;
												break;
											}
										}
										anIntArray298[anInt3171++] = local19;
										return;
									}
									if (arg0 == 2704 || arg0 == 2705) {
										anInt3171 -= 2;
										local13 = anIntArray298[anInt3171];
										local19 = anIntArray298[anInt3171 + 1];
										local3758 = (Class1_Sub35) Static468.aClass17_36.method738((long) local13);
										if (local3758 != null && local3758.anInt6103 == local19) {
											anIntArray298[anInt3171++] = 1;
											return;
										}
										anIntArray298[anInt3171++] = 0;
										return;
									}
								} else if (arg0 < 2900) {
									local137 = Static182.method2888(anIntArray298[--anInt3171]);
									if (arg0 == 2800) {
										anIntArray298[anInt3171++] = Static67.method1228(local137).method2103();
										return;
									}
									if (arg0 == 2801) {
										local19 = anIntArray298[--anInt3171];
										local19--;
										if (local137.aStringArray24 != null && local19 < local137.aStringArray24.length && local137.aStringArray24[local19] != null) {
											aStringArray17[anInt3178++] = local137.aStringArray24[local19];
											return;
										}
										aStringArray17[anInt3178++] = "";
										return;
									}
									if (arg0 == 2802) {
										if (local137.aString44 == null) {
											aStringArray17[anInt3178++] = "";
											return;
										}
										aStringArray17[anInt3178++] = local137.aString44;
										return;
									}
								} else {
									@Pc(3895) String local3895;
									if (arg0 < 3200) {
										if (arg0 == 3100) {
											local3895 = aStringArray17[--anInt3178];
											Static324.method5022(local3895);
											return;
										}
										if (arg0 == 3101) {
											anInt3171 -= 2;
											Static400.method6040(Static63.aClass49_Sub2_Sub2_Sub1_1, anIntArray298[anInt3171], anIntArray298[anInt3171 + 1]);
											return;
										}
										if (arg0 == 3103) {
											Static237.method4132();
											return;
										}
										if (arg0 == 3104) {
											local3895 = aStringArray17[--anInt3178];
											local19 = 0;
											if (Static328.method5048(local3895)) {
												local19 = Static197.method7005(local3895);
											}
											Static144.method2331(Static109.aClass296_177);
											Static455.aClass1_Sub6_Sub2_2.method3948(local19);
											return;
										}
										if (arg0 == 3105) {
											local3895 = aStringArray17[--anInt3178];
											Static144.method2331(Static523.aClass296_376);
											Static455.aClass1_Sub6_Sub2_2.method3937(local3895.length() + 1);
											Static455.aClass1_Sub6_Sub2_2.method3917(local3895);
											return;
										}
										if (arg0 == 3106) {
											local3895 = aStringArray17[--anInt3178];
											Static144.method2331(Static143.aClass296_131);
											Static455.aClass1_Sub6_Sub2_2.method3937(local3895.length() + 1);
											Static455.aClass1_Sub6_Sub2_2.method3917(local3895);
											return;
										}
										if (arg0 == 3107) {
											local13 = anIntArray298[--anInt3171];
											local1101 = aStringArray17[--anInt3178];
											Static501.method6954(local13, local1101);
											return;
										}
										if (arg0 == 3108) {
											anInt3171 -= 3;
											local13 = anIntArray298[anInt3171];
											local19 = anIntArray298[anInt3171 + 1];
											local25 = anIntArray298[anInt3171 + 2];
											local35 = Static182.method2888(local25);
											Static317.method4943(local19, local13, local35);
											return;
										}
										if (arg0 == 3109) {
											anInt3171 -= 2;
											local13 = anIntArray298[anInt3171];
											local19 = anIntArray298[anInt3171 + 1];
											local210 = arg1 ? aClass156_6 : aClass156_7;
											Static317.method4943(local19, local13, local210);
											return;
										}
										if (arg0 == 3110) {
											local13 = anIntArray298[--anInt3171];
											Static144.method2331(Static542.aClass296_389);
											Static455.aClass1_Sub6_Sub2_2.method3919(local13);
											return;
										}
										if (arg0 == 3111) {
											anInt3171 -= 2;
											local13 = anIntArray298[anInt3171];
											local19 = anIntArray298[anInt3171 + 1];
											local3758 = (Class1_Sub35) Static468.aClass17_36.method738((long) local13);
											if (local3758 != null) {
												Static217.method7162(true, local3758, local3758.anInt6103 != local19);
											}
											Static252.method4236(3, local19, true, local13);
											return;
										}
										if (arg0 == 3112) {
											anInt3171--;
											local13 = anIntArray298[anInt3171];
											local3656 = (Class1_Sub35) Static468.aClass17_36.method738((long) local13);
											if (local3656 != null && local3656.anInt6102 == 3) {
												Static217.method7162(true, local3656, true);
											}
											return;
										}
										if (arg0 == 3113) {
											Static48.method944(aStringArray17[--anInt3178]);
											return;
										}
										if (arg0 == 3114) {
											anInt3171 -= 2;
											local13 = anIntArray298[anInt3171];
											local19 = anIntArray298[anInt3171 + 1];
											local1488 = aStringArray17[--anInt3178];
											Static363.method5419(local1488, local19, "", local13, "");
											return;
										}
									} else if (arg0 < 3300) {
										if (arg0 == 3200) {
											anInt3171 -= 3;
											Static161.method2496(anIntArray298[anInt3171 + 1], 255, anIntArray298[anInt3171 + 2], anIntArray298[anInt3171]);
											return;
										}
										if (arg0 == 3201) {
											Static129.method2164(255, 50, anIntArray298[--anInt3171]);
											return;
										}
										if (arg0 == 3202) {
											anInt3171 -= 2;
											Static320.method4981(255, anIntArray298[anInt3171], anIntArray298[anInt3171 + 1]);
											return;
										}
										if (arg0 == 3203) {
											anInt3171 -= 4;
											Static161.method2496(anIntArray298[anInt3171 + 1], anIntArray298[anInt3171 + 3], anIntArray298[anInt3171 + 2], anIntArray298[anInt3171]);
											return;
										}
										if (arg0 == 3204) {
											anInt3171 -= 3;
											Static129.method2164(anIntArray298[anInt3171 + 1], anIntArray298[anInt3171 + 2], anIntArray298[anInt3171]);
											return;
										}
										if (arg0 == 3205) {
											anInt3171 -= 3;
											Static320.method4981(anIntArray298[anInt3171 + 2], anIntArray298[anInt3171], anIntArray298[anInt3171 + 1]);
											return;
										}
										if (arg0 == 3206) {
											anInt3171 -= 4;
											Static187.method2925(anIntArray298[anInt3171], anIntArray298[anInt3171 + 3], anIntArray298[anInt3171 + 2], anIntArray298[anInt3171 + 1]);
											return;
										}
									} else if (arg0 < 3400) {
										if (arg0 == 3300) {
											anIntArray298[anInt3171++] = Static436.anInt6850;
											return;
										}
										if (arg0 == 3301) {
											anInt3171 -= 2;
											local13 = anIntArray298[anInt3171];
											local19 = anIntArray298[anInt3171 + 1];
											anIntArray298[anInt3171++] = Static407.method6054(local13, false, local19);
											return;
										}
										if (arg0 == 3302) {
											anInt3171 -= 2;
											local13 = anIntArray298[anInt3171];
											local19 = anIntArray298[anInt3171 + 1];
											anIntArray298[anInt3171++] = Static511.method7068(local19, local13, false);
											return;
										}
										if (arg0 == 3303) {
											anInt3171 -= 2;
											local13 = anIntArray298[anInt3171];
											local19 = anIntArray298[anInt3171 + 1];
											anIntArray298[anInt3171++] = Static537.method7442(false, local19, local13);
											return;
										}
										if (arg0 == 3304) {
											local13 = anIntArray298[--anInt3171];
											anIntArray298[anInt3171++] = Static219.aClass94_3.method2260(local13).anInt3872;
											return;
										}
										if (arg0 == 3305) {
											local13 = anIntArray298[--anInt3171];
											anIntArray298[anInt3171++] = Static532.anIntArray828[local13];
											return;
										}
										if (arg0 == 3306) {
											local13 = anIntArray298[--anInt3171];
											anIntArray298[anInt3171++] = Static3.anIntArray16[local13];
											return;
										}
										if (arg0 == 3307) {
											local13 = anIntArray298[--anInt3171];
											anIntArray298[anInt3171++] = Static533.anIntArray830[local13];
											return;
										}
										if (arg0 == 3308) {
											@Pc(4612) byte local4612 = Static63.aClass49_Sub2_Sub2_Sub1_1.aByte98;
											local19 = (Static63.aClass49_Sub2_Sub2_Sub1_1.anInt7137 >> 9) + Static470.anInt7897;
											local25 = (Static63.aClass49_Sub2_Sub2_Sub1_1.anInt7141 >> 9) + Static534.anInt9007;
											anIntArray298[anInt3171++] = (local4612 << 28) + (local19 << 14) + local25;
											return;
										}
										if (arg0 == 3309) {
											local13 = anIntArray298[--anInt3171];
											anIntArray298[anInt3171++] = local13 >> 14 & 0x3FFF;
											return;
										}
										if (arg0 == 3310) {
											local13 = anIntArray298[--anInt3171];
											anIntArray298[anInt3171++] = local13 >> 28;
											return;
										}
										if (arg0 == 3311) {
											local13 = anIntArray298[--anInt3171];
											anIntArray298[anInt3171++] = local13 & 0x3FFF;
											return;
										}
										if (arg0 == 3312) {
											anIntArray298[anInt3171++] = Static83.aBoolean102 ? 1 : 0;
											return;
										}
										if (arg0 == 3313) {
											anInt3171 -= 2;
											local13 = anIntArray298[anInt3171];
											local19 = anIntArray298[anInt3171 + 1];
											anIntArray298[anInt3171++] = Static407.method6054(local13, true, local19);
											return;
										}
										if (arg0 == 3314) {
											anInt3171 -= 2;
											local13 = anIntArray298[anInt3171];
											local19 = anIntArray298[anInt3171 + 1];
											anIntArray298[anInt3171++] = Static511.method7068(local19, local13, true);
											return;
										}
										if (arg0 == 3315) {
											anInt3171 -= 2;
											local13 = anIntArray298[anInt3171];
											local19 = anIntArray298[anInt3171 + 1];
											anIntArray298[anInt3171++] = Static537.method7442(true, local19, local13);
											return;
										}
										if (arg0 == 3316) {
											if (Static313.anInt5785 >= 2) {
												anIntArray298[anInt3171++] = Static313.anInt5785;
												return;
											}
											anIntArray298[anInt3171++] = 0;
											return;
										}
										if (arg0 == 3317) {
											anIntArray298[anInt3171++] = Static531.anInt8934;
											return;
										}
										if (arg0 == 3318) {
											anIntArray298[anInt3171++] = Static52.aClass4_1.anInt111;
											return;
										}
										if (arg0 == 3321) {
											anIntArray298[anInt3171++] = Static314.anInt5789;
											return;
										}
										if (arg0 == 3322) {
											anIntArray298[anInt3171++] = Static210.anInt4092;
											return;
										}
										if (arg0 == 3323) {
											if (Static154.anInt2806 >= 5 && Static154.anInt2806 <= 9) {
												anIntArray298[anInt3171++] = 1;
												return;
											}
											anIntArray298[anInt3171++] = 0;
											return;
										}
										if (arg0 == 3324) {
											if (Static154.anInt2806 >= 5 && Static154.anInt2806 <= 9) {
												anIntArray298[anInt3171++] = Static154.anInt2806;
												return;
											}
											anIntArray298[anInt3171++] = 0;
											return;
										}
										if (arg0 == 3325) {
											anIntArray298[anInt3171++] = Static39.aBoolean38 ? 1 : 0;
											return;
										}
										if (arg0 == 3326) {
											anIntArray298[anInt3171++] = Static63.aClass49_Sub2_Sub2_Sub1_1.anInt1754;
											return;
										}
										if (arg0 == 3327) {
											anIntArray298[anInt3171++] = Static63.aClass49_Sub2_Sub2_Sub1_1.aClass206_1.aBoolean430 ? 1 : 0;
											return;
										}
										if (arg0 == 3329) {
											anIntArray298[anInt3171++] = Static164.aBoolean185 ? 1 : 0;
											return;
										}
										if (arg0 == 3330) {
											local13 = anIntArray298[--anInt3171];
											anIntArray298[anInt3171++] = Static343.method5196(local13);
											return;
										}
										if (arg0 == 3331) {
											anInt3171 -= 2;
											local13 = anIntArray298[anInt3171];
											local19 = anIntArray298[anInt3171 + 1];
											anIntArray298[anInt3171++] = Static452.method6440(false, local13, local19);
											return;
										}
										if (arg0 == 3332) {
											anInt3171 -= 2;
											local13 = anIntArray298[anInt3171];
											local19 = anIntArray298[anInt3171 + 1];
											anIntArray298[anInt3171++] = Static452.method6440(true, local13, local19);
											return;
										}
										if (arg0 == 3333) {
											anIntArray298[anInt3171++] = Static418.anInt7355;
											return;
										}
										if (arg0 == 3335) {
											anIntArray298[anInt3171++] = Static179.anInt3168;
											return;
										}
										if (arg0 == 3336) {
											anInt3171 -= 4;
											local13 = anIntArray298[anInt3171];
											local19 = anIntArray298[anInt3171 + 1];
											local25 = anIntArray298[anInt3171 + 2];
											local353 = anIntArray298[anInt3171 + 3];
											local13 += local19 << 14;
											local13 += local25 << 28;
											local13 += local353;
											anIntArray298[anInt3171++] = local13;
											return;
										}
										if (arg0 == 3337) {
											anIntArray298[anInt3171++] = Static543.anInt9158;
											return;
										}
										if (arg0 == 3338) {
											anIntArray298[anInt3171++] = Static232.method4011();
											return;
										}
										if (arg0 == 3339) {
											anIntArray298[anInt3171++] = Static476.aBoolean565 ? 1 : 0;
											return;
										}
										if (arg0 == 3340) {
											anIntArray298[anInt3171++] = Static297.aBoolean404 ? 1 : 0;
											return;
										}
										if (arg0 == 3341) {
											anIntArray298[anInt3171++] = Static176.aBoolean215 ? 1 : 0;
											return;
										}
										if (arg0 == 3342) {
											anIntArray298[anInt3171++] = Static498.aClass5_1.method7052();
											return;
										}
										if (arg0 == 3343) {
											anIntArray298[anInt3171++] = Static498.aClass5_1.method7042();
											return;
										}
										if (arg0 == 3344) {
											aStringArray17[anInt3178++] = Static449.method6409();
											return;
										}
										if (arg0 == 3345) {
											aStringArray17[anInt3178++] = Static471.method6567();
											return;
										}
										if (arg0 == 3346) {
											anIntArray298[anInt3171++] = Static334.method5104();
											return;
										}
										if (arg0 == 3347) {
											anIntArray298[anInt3171++] = Static433.anInt7523;
											return;
										}
									} else if (arg0 < 3500) {
										@Pc(5347) Class214 local5347;
										if (arg0 == 3400) {
											anInt3171 -= 2;
											local13 = anIntArray298[anInt3171];
											local19 = anIntArray298[anInt3171 + 1];
											local5347 = Static4.aClass191_1.method4745(local13);
											aStringArray17[anInt3178++] = local5347.method5120(local19);
											return;
										}
										if (arg0 == 3408) {
											anInt3171 -= 4;
											local13 = anIntArray298[anInt3171];
											local19 = anIntArray298[anInt3171 + 1];
											local25 = anIntArray298[anInt3171 + 2];
											local353 = anIntArray298[anInt3171 + 3];
											@Pc(5393) Class214 local5393 = Static4.aClass191_1.method4745(local25);
											if (local5393.aChar4 == local13 && local5393.aChar3 == local19) {
												if (local19 == 115) {
													aStringArray17[anInt3178++] = local5393.method5120(local353);
													return;
												}
												anIntArray298[anInt3171++] = local5393.method5112(local353);
												return;
											}
											throw new RuntimeException("C3408-1");
										}
										if (arg0 == 3409) {
											anInt3171 -= 3;
											local13 = anIntArray298[anInt3171];
											local19 = anIntArray298[anInt3171 + 1];
											local25 = anIntArray298[anInt3171 + 2];
											if (local19 == -1) {
												throw new RuntimeException("C3409-2");
											}
											@Pc(5469) Class214 local5469 = Static4.aClass191_1.method4745(local19);
											if (local5469.aChar3 != local13) {
												throw new RuntimeException("C3409-1");
											}
											anIntArray298[anInt3171++] = local5469.method5115(local25) ? 1 : 0;
											return;
										}
										if (arg0 == 3410) {
											local13 = anIntArray298[--anInt3171];
											local1101 = aStringArray17[--anInt3178];
											if (local13 == -1) {
												throw new RuntimeException("C3410-2");
											}
											local5347 = Static4.aClass191_1.method4745(local13);
											if (local5347.aChar3 != 's') {
												throw new RuntimeException("C3410-1");
											}
											anIntArray298[anInt3171++] = local5347.method5119(local1101) ? 1 : 0;
											return;
										}
										if (arg0 == 3411) {
											local13 = anIntArray298[--anInt3171];
											@Pc(5567) Class214 local5567 = Static4.aClass191_1.method4745(local13);
											anIntArray298[anInt3171++] = local5567.aClass17_26.method742();
											return;
										}
									} else if (arg0 < 3700) {
										if (arg0 == 3600) {
											if (Static489.anInt8146 == 0) {
												anIntArray298[anInt3171++] = -2;
												return;
											}
											if (Static489.anInt8146 == 1) {
												anIntArray298[anInt3171++] = -1;
												return;
											}
											anIntArray298[anInt3171++] = Static234.anInt4709;
											return;
										}
										if (arg0 == 3601) {
											local13 = anIntArray298[--anInt3171];
											if (Static489.anInt8146 == 2 && local13 < Static234.anInt4709) {
												aStringArray17[anInt3178++] = Static528.aStringArray43[local13];
												if (Static373.aStringArray7[local13] != null) {
													aStringArray17[anInt3178++] = Static373.aStringArray7[local13];
													return;
												}
												aStringArray17[anInt3178++] = "";
												return;
											}
											aStringArray17[anInt3178++] = "";
											aStringArray17[anInt3178++] = "";
											return;
										}
										if (arg0 == 3602) {
											local13 = anIntArray298[--anInt3171];
											if (Static489.anInt8146 == 2 && local13 < Static234.anInt4709) {
												anIntArray298[anInt3171++] = Static122.anIntArray240[local13];
												return;
											}
											anIntArray298[anInt3171++] = 0;
											return;
										}
										if (arg0 == 3603) {
											local13 = anIntArray298[--anInt3171];
											if (Static489.anInt8146 == 2 && local13 < Static234.anInt4709) {
												anIntArray298[anInt3171++] = Static217.anIntArray787[local13];
												return;
											}
											anIntArray298[anInt3171++] = 0;
											return;
										}
										if (arg0 == 3604) {
											local3895 = aStringArray17[--anInt3178];
											local19 = anIntArray298[--anInt3171];
											Static315.method4924(local19, local3895);
											return;
										}
										if (arg0 == 3605) {
											local3895 = aStringArray17[--anInt3178];
											Static6.method244(local3895);
											return;
										}
										if (arg0 == 3606) {
											local3895 = aStringArray17[--anInt3178];
											Static535.method7410(local3895);
											return;
										}
										if (arg0 == 3607) {
											local3895 = aStringArray17[--anInt3178];
											Static114.method1963(false, local3895);
											return;
										}
										if (arg0 == 3608) {
											local3895 = aStringArray17[--anInt3178];
											Static538.method7477(local3895);
											return;
										}
										if (arg0 == 3609) {
											local3895 = aStringArray17[--anInt3178];
											if (local3895.startsWith("<img=0>") || local3895.startsWith("<img=1>")) {
												local3895 = local3895.substring(7);
											}
											anIntArray298[anInt3171++] = Static458.method6480(local3895) ? 1 : 0;
											return;
										}
										if (arg0 == 3610) {
											local13 = anIntArray298[--anInt3171];
											if (Static489.anInt8146 == 2 && local13 < Static234.anInt4709) {
												aStringArray17[anInt3178++] = Static384.aStringArray37[local13];
												return;
											}
											aStringArray17[anInt3178++] = "";
											return;
										}
										if (arg0 == 3611) {
											if (Static3.aString1 != null) {
												aStringArray17[anInt3178++] = Static541.method7521(Static3.aString1);
												return;
											}
											aStringArray17[anInt3178++] = "";
											return;
										}
										if (arg0 == 3612) {
											if (Static3.aString1 != null) {
												anIntArray298[anInt3171++] = Static218.anInt7241;
												return;
											}
											anIntArray298[anInt3171++] = 0;
											return;
										}
										if (arg0 == 3613) {
											local13 = anIntArray298[--anInt3171];
											if (Static3.aString1 != null && local13 < Static218.anInt7241) {
												aStringArray17[anInt3178++] = Static419.aClass249Array1[local13].aString67;
												return;
											}
											aStringArray17[anInt3178++] = "";
											return;
										}
										if (arg0 == 3614) {
											local13 = anIntArray298[--anInt3171];
											if (Static3.aString1 != null && local13 < Static218.anInt7241) {
												anIntArray298[anInt3171++] = Static419.aClass249Array1[local13].anInt7111;
												return;
											}
											anIntArray298[anInt3171++] = 0;
											return;
										}
										if (arg0 == 3615) {
											local13 = anIntArray298[--anInt3171];
											if (Static3.aString1 != null && local13 < Static218.anInt7241) {
												anIntArray298[anInt3171++] = Static419.aClass249Array1[local13].aByte96;
												return;
											}
											anIntArray298[anInt3171++] = 0;
											return;
										}
										if (arg0 == 3616) {
											anIntArray298[anInt3171++] = Static230.aByte12;
											return;
										}
										if (arg0 == 3617) {
											local3895 = aStringArray17[--anInt3178];
											Static26.method591(local3895);
											return;
										}
										if (arg0 == 3618) {
											anIntArray298[anInt3171++] = Static524.aByte110;
											return;
										}
										if (arg0 == 3619) {
											local3895 = aStringArray17[--anInt3178];
											Static437.method6310(local3895);
											return;
										}
										if (arg0 == 3620) {
											Static153.method2415();
											return;
										}
										if (arg0 == 3621) {
											if (Static489.anInt8146 == 0) {
												anIntArray298[anInt3171++] = -1;
												return;
											}
											anIntArray298[anInt3171++] = Static40.anInt856;
											return;
										}
										if (arg0 == 3622) {
											local13 = anIntArray298[--anInt3171];
											if (Static489.anInt8146 != 0 && local13 < Static40.anInt856) {
												aStringArray17[anInt3178++] = Static354.aStringArray32[local13];
												if (Static17.aStringArray1[local13] != null) {
													aStringArray17[anInt3178++] = Static17.aStringArray1[local13];
													return;
												}
												aStringArray17[anInt3178++] = "";
												return;
											}
											aStringArray17[anInt3178++] = "";
											aStringArray17[anInt3178++] = "";
											return;
										}
										if (arg0 == 3623) {
											local3895 = aStringArray17[--anInt3178];
											if (local3895.startsWith("<img=0>") || local3895.startsWith("<img=1>")) {
												local3895 = local3895.substring(7);
											}
											anIntArray298[anInt3171++] = Static367.method5687(local3895) ? 1 : 0;
											return;
										}
										if (arg0 == 3624) {
											local13 = anIntArray298[--anInt3171];
											if (Static419.aClass249Array1 != null && local13 < Static218.anInt7241 && Static419.aClass249Array1[local13].aString65.equalsIgnoreCase(Static63.aClass49_Sub2_Sub2_Sub1_1.aString16)) {
												anIntArray298[anInt3171++] = 1;
												return;
											}
											anIntArray298[anInt3171++] = 0;
											return;
										}
										if (arg0 == 3625) {
											if (Static83.aString14 != null) {
												aStringArray17[anInt3178++] = Static83.aString14;
												return;
											}
											aStringArray17[anInt3178++] = "";
											return;
										}
										if (arg0 == 3626) {
											local13 = anIntArray298[--anInt3171];
											if (Static3.aString1 != null && local13 < Static218.anInt7241) {
												aStringArray17[anInt3178++] = Static419.aClass249Array1[local13].aString66;
												return;
											}
											aStringArray17[anInt3178++] = "";
											return;
										}
										if (arg0 == 3627) {
											local13 = anIntArray298[--anInt3171];
											if (Static489.anInt8146 == 2 && local13 >= 0 && local13 < Static234.anInt4709) {
												anIntArray298[anInt3171++] = Static326.aBooleanArray41[local13] ? 1 : 0;
												return;
											}
											anIntArray298[anInt3171++] = 0;
											return;
										}
										if (arg0 == 3628) {
											local3895 = aStringArray17[--anInt3178];
											if (local3895.startsWith("<img=0>") || local3895.startsWith("<img=1>")) {
												local3895 = local3895.substring(7);
											}
											anIntArray298[anInt3171++] = Static167.method3553(local3895);
											return;
										}
										if (arg0 == 3629) {
											anIntArray298[anInt3171++] = Static444.anInt7643;
											return;
										}
										if (arg0 == 3630) {
											local3895 = aStringArray17[--anInt3178];
											Static114.method1963(true, local3895);
											return;
										}
										if (arg0 == 3631) {
											local13 = anIntArray298[--anInt3171];
											anIntArray298[anInt3171++] = Static175.aBooleanArray19[local13] ? 1 : 0;
											return;
										}
										if (arg0 == 3632) {
											local13 = anIntArray298[--anInt3171];
											if (Static3.aString1 != null && local13 < Static218.anInt7241) {
												aStringArray17[anInt3178++] = Static419.aClass249Array1[local13].aString65;
												return;
											}
											aStringArray17[anInt3178++] = "";
											return;
										}
										if (arg0 == 3633) {
											local13 = anIntArray298[--anInt3171];
											if (Static489.anInt8146 != 0 && local13 < Static40.anInt856) {
												aStringArray17[anInt3178++] = Static170.aStringArray15[local13];
												return;
											}
											aStringArray17[anInt3178++] = "";
											return;
										}
									} else if (arg0 < 4000) {
										if (arg0 == 3903) {
											local13 = anIntArray298[--anInt3171];
											anIntArray298[anInt3171++] = Static313.aClass142Array1[local13].method3596();
											return;
										}
										if (arg0 == 3904) {
											local13 = anIntArray298[--anInt3171];
											anIntArray298[anInt3171++] = Static313.aClass142Array1[local13].anInt4113;
											return;
										}
										if (arg0 == 3905) {
											local13 = anIntArray298[--anInt3171];
											anIntArray298[anInt3171++] = Static313.aClass142Array1[local13].anInt4116;
											return;
										}
										if (arg0 == 3906) {
											local13 = anIntArray298[--anInt3171];
											anIntArray298[anInt3171++] = Static313.aClass142Array1[local13].anInt4106;
											return;
										}
										if (arg0 == 3907) {
											local13 = anIntArray298[--anInt3171];
											anIntArray298[anInt3171++] = Static313.aClass142Array1[local13].anInt4115;
											return;
										}
										if (arg0 == 3908) {
											local13 = anIntArray298[--anInt3171];
											anIntArray298[anInt3171++] = Static313.aClass142Array1[local13].anInt4109;
											return;
										}
										if (arg0 == 3910) {
											local13 = anIntArray298[--anInt3171];
											local19 = Static313.aClass142Array1[local13].method3598();
											anIntArray298[anInt3171++] = local19 == 0 ? 1 : 0;
											return;
										}
										if (arg0 == 3911) {
											local13 = anIntArray298[--anInt3171];
											local19 = Static313.aClass142Array1[local13].method3598();
											anIntArray298[anInt3171++] = local19 == 2 ? 1 : 0;
											return;
										}
										if (arg0 == 3912) {
											local13 = anIntArray298[--anInt3171];
											local19 = Static313.aClass142Array1[local13].method3598();
											anIntArray298[anInt3171++] = local19 == 5 ? 1 : 0;
											return;
										}
										if (arg0 == 3913) {
											local13 = anIntArray298[--anInt3171];
											local19 = Static313.aClass142Array1[local13].method3598();
											anIntArray298[anInt3171++] = local19 == 1 ? 1 : 0;
											return;
										}
									} else if (arg0 < 4100) {
										if (arg0 == 4000) {
											anInt3171 -= 2;
											local13 = anIntArray298[anInt3171];
											local19 = anIntArray298[anInt3171 + 1];
											anIntArray298[anInt3171++] = local13 + local19;
											return;
										}
										if (arg0 == 4001) {
											anInt3171 -= 2;
											local13 = anIntArray298[anInt3171];
											local19 = anIntArray298[anInt3171 + 1];
											anIntArray298[anInt3171++] = local13 - local19;
											return;
										}
										if (arg0 == 4002) {
											anInt3171 -= 2;
											local13 = anIntArray298[anInt3171];
											local19 = anIntArray298[anInt3171 + 1];
											anIntArray298[anInt3171++] = local13 * local19;
											return;
										}
										if (arg0 == 4003) {
											anInt3171 -= 2;
											local13 = anIntArray298[anInt3171];
											local19 = anIntArray298[anInt3171 + 1];
											anIntArray298[anInt3171++] = local13 / local19;
											return;
										}
										if (arg0 == 4004) {
											local13 = anIntArray298[--anInt3171];
											anIntArray298[anInt3171++] = (int) (Math.random() * (double) local13);
											return;
										}
										if (arg0 == 4005) {
											local13 = anIntArray298[--anInt3171];
											anIntArray298[anInt3171++] = (int) (Math.random() * (double) (local13 + 1));
											return;
										}
										if (arg0 == 4006) {
											anInt3171 -= 5;
											local13 = anIntArray298[anInt3171];
											local19 = anIntArray298[anInt3171 + 1];
											local25 = anIntArray298[anInt3171 + 2];
											local353 = anIntArray298[anInt3171 + 3];
											local2290 = anIntArray298[anInt3171 + 4];
											anIntArray298[anInt3171++] = local13 + (local19 - local13) * (local2290 - local25) / (local353 - local25);
											return;
										}
										@Pc(7077) long local7077;
										@Pc(7070) long local7070;
										if (arg0 == 4007) {
											anInt3171 -= 2;
											local7070 = anIntArray298[anInt3171];
											local7077 = anIntArray298[anInt3171 + 1];
											anIntArray298[anInt3171++] = (int) (local7070 + local7070 * local7077 / 100L);
											return;
										}
										if (arg0 == 4008) {
											anInt3171 -= 2;
											local13 = anIntArray298[anInt3171];
											local19 = anIntArray298[anInt3171 + 1];
											anIntArray298[anInt3171++] = local13 | 0x1 << local19;
											return;
										}
										if (arg0 == 4009) {
											anInt3171 -= 2;
											local13 = anIntArray298[anInt3171];
											local19 = anIntArray298[anInt3171 + 1];
											anIntArray298[anInt3171++] = local13 & -(0x1 << local19) - 1;
											return;
										}
										if (arg0 == 4010) {
											anInt3171 -= 2;
											local13 = anIntArray298[anInt3171];
											local19 = anIntArray298[anInt3171 + 1];
											anIntArray298[anInt3171++] = (local13 & 0x1 << local19) == 0 ? 0 : 1;
											return;
										}
										if (arg0 == 4011) {
											anInt3171 -= 2;
											local13 = anIntArray298[anInt3171];
											local19 = anIntArray298[anInt3171 + 1];
											anIntArray298[anInt3171++] = local13 % local19;
											return;
										}
										if (arg0 == 4012) {
											anInt3171 -= 2;
											local13 = anIntArray298[anInt3171];
											local19 = anIntArray298[anInt3171 + 1];
											if (local13 == 0) {
												anIntArray298[anInt3171++] = 0;
												return;
											}
											anIntArray298[anInt3171++] = (int) Math.pow((double) local13, (double) local19);
											return;
										}
										if (arg0 == 4013) {
											anInt3171 -= 2;
											local13 = anIntArray298[anInt3171];
											local19 = anIntArray298[anInt3171 + 1];
											if (local13 == 0) {
												anIntArray298[anInt3171++] = 0;
												return;
											}
											if (local19 == 0) {
												anIntArray298[anInt3171++] = Integer.MAX_VALUE;
												return;
											}
											anIntArray298[anInt3171++] = (int) Math.pow((double) local13, 1.0D / (double) local19);
											return;
										}
										if (arg0 == 4014) {
											anInt3171 -= 2;
											local13 = anIntArray298[anInt3171];
											local19 = anIntArray298[anInt3171 + 1];
											anIntArray298[anInt3171++] = local13 & local19;
											return;
										}
										if (arg0 == 4015) {
											anInt3171 -= 2;
											local13 = anIntArray298[anInt3171];
											local19 = anIntArray298[anInt3171 + 1];
											anIntArray298[anInt3171++] = local13 | local19;
											return;
										}
										if (arg0 == 4016) {
											anInt3171 -= 2;
											local13 = anIntArray298[anInt3171];
											local19 = anIntArray298[anInt3171 + 1];
											anIntArray298[anInt3171++] = local13 < local19 ? local13 : local19;
											return;
										}
										if (arg0 == 4017) {
											anInt3171 -= 2;
											local13 = anIntArray298[anInt3171];
											local19 = anIntArray298[anInt3171 + 1];
											anIntArray298[anInt3171++] = local13 > local19 ? local13 : local19;
											return;
										}
										if (arg0 == 4018) {
											anInt3171 -= 3;
											local7070 = anIntArray298[anInt3171];
											local7077 = anIntArray298[anInt3171 + 1];
											@Pc(7458) long local7458 = (long) anIntArray298[anInt3171 + 2];
											anIntArray298[anInt3171++] = (int) (local7070 * local7458 / local7077);
											return;
										}
									} else if (arg0 < 4200) {
										if (arg0 == 4100) {
											local3895 = aStringArray17[--anInt3178];
											local19 = anIntArray298[--anInt3171];
											aStringArray17[anInt3178++] = local3895 + local19;
											return;
										}
										if (arg0 == 4101) {
											anInt3178 -= 2;
											local3895 = aStringArray17[anInt3178];
											local1101 = aStringArray17[anInt3178 + 1];
											aStringArray17[anInt3178++] = local3895 + local1101;
											return;
										}
										if (arg0 == 4102) {
											local3895 = aStringArray17[--anInt3178];
											local19 = anIntArray298[--anInt3171];
											aStringArray17[anInt3178++] = local3895 + Static307.method4852(local19);
											return;
										}
										if (arg0 == 4103) {
											local3895 = aStringArray17[--anInt3178];
											aStringArray17[anInt3178++] = local3895.toLowerCase();
											return;
										}
										if (arg0 == 4104) {
											aStringArray17[anInt3178++] = method2680(anIntArray298[--anInt3171]);
											return;
										}
										if (arg0 == 4105) {
											anInt3178 -= 2;
											local3895 = aStringArray17[anInt3178];
											local1101 = aStringArray17[anInt3178 + 1];
											if (Static63.aClass49_Sub2_Sub2_Sub1_1.aClass206_1 != null && Static63.aClass49_Sub2_Sub2_Sub1_1.aClass206_1.aBoolean430) {
												aStringArray17[anInt3178++] = local1101;
												return;
											}
											aStringArray17[anInt3178++] = local3895;
											return;
										}
										if (arg0 == 4106) {
											local13 = anIntArray298[--anInt3171];
											aStringArray17[anInt3178++] = Integer.toString(local13);
											return;
										}
										if (arg0 == 4107) {
											anInt3178 -= 2;
											anIntArray298[anInt3171++] = Static343.method5197(aStringArray17[anInt3178 + 1], Static179.anInt3168, aStringArray17[anInt3178]);
											return;
										}
										@Pc(7741) Class232 local7741;
										if (arg0 == 4108) {
											local3895 = aStringArray17[--anInt3178];
											anInt3171 -= 2;
											local19 = anIntArray298[anInt3171];
											local25 = anIntArray298[anInt3171 + 1];
											local7741 = Static372.method5725(local25, Static542.aClass171_152);
											anIntArray298[anInt3171++] = local7741.method5434(Static415.aClass2Array14, local3895, local19);
											return;
										}
										if (arg0 == 4109) {
											local3895 = aStringArray17[--anInt3178];
											anInt3171 -= 2;
											local19 = anIntArray298[anInt3171];
											local25 = anIntArray298[anInt3171 + 1];
											local7741 = Static372.method5725(local25, Static542.aClass171_152);
											anIntArray298[anInt3171++] = local7741.method5438(Static415.aClass2Array14, local19, local3895);
											return;
										}
										if (arg0 == 4110) {
											anInt3178 -= 2;
											local3895 = aStringArray17[anInt3178];
											local1101 = aStringArray17[anInt3178 + 1];
											if (anIntArray298[--anInt3171] == 1) {
												aStringArray17[anInt3178++] = local3895;
												return;
											}
											aStringArray17[anInt3178++] = local1101;
											return;
										}
										if (arg0 == 4111) {
											local3895 = aStringArray17[--anInt3178];
											aStringArray17[anInt3178++] = Static337.method5134(local3895);
											return;
										}
										if (arg0 == 4112) {
											local3895 = aStringArray17[--anInt3178];
											local19 = anIntArray298[--anInt3171];
											if (local19 == -1) {
												throw new RuntimeException("null char");
											}
											aStringArray17[anInt3178++] = local3895 + (char) local19;
											return;
										}
										if (arg0 == 4113) {
											local13 = anIntArray298[--anInt3171];
											anIntArray298[anInt3171++] = Static45.method919((char) local13) ? 1 : 0;
											return;
										}
										if (arg0 == 4114) {
											local13 = anIntArray298[--anInt3171];
											anIntArray298[anInt3171++] = Static535.method7413((char) local13) ? 1 : 0;
											return;
										}
										if (arg0 == 4115) {
											local13 = anIntArray298[--anInt3171];
											anIntArray298[anInt3171++] = Static201.method3447((char) local13) ? 1 : 0;
											return;
										}
										if (arg0 == 4116) {
											local13 = anIntArray298[--anInt3171];
											anIntArray298[anInt3171++] = Static214.method1851((char) local13) ? 1 : 0;
											return;
										}
										if (arg0 == 4117) {
											local3895 = aStringArray17[--anInt3178];
											if (local3895 != null) {
												anIntArray298[anInt3171++] = local3895.length();
												return;
											}
											anIntArray298[anInt3171++] = 0;
											return;
										}
										if (arg0 == 4118) {
											local3895 = aStringArray17[--anInt3178];
											anInt3171 -= 2;
											local19 = anIntArray298[anInt3171];
											local25 = anIntArray298[anInt3171 + 1];
											aStringArray17[anInt3178++] = local3895.substring(local19, local25);
											return;
										}
										if (arg0 == 4119) {
											local3895 = aStringArray17[--anInt3178];
											@Pc(8104) StringBuffer local8104 = new StringBuffer(local3895.length());
											@Pc(8106) boolean local8106 = false;
											for (local353 = 0; local353 < local3895.length(); local353++) {
												@Pc(8113) char local8113 = local3895.charAt(local353);
												if (local8113 == '<') {
													local8106 = true;
												} else if (local8113 == '>') {
													local8106 = false;
												} else if (!local8106) {
													local8104.append(local8113);
												}
											}
											aStringArray17[anInt3178++] = local8104.toString();
											return;
										}
										if (arg0 == 4120) {
											local3895 = aStringArray17[--anInt3178];
											anInt3171 -= 2;
											local19 = anIntArray298[anInt3171];
											local25 = anIntArray298[anInt3171 + 1];
											anIntArray298[anInt3171++] = local3895.indexOf(local19, local25);
											return;
										}
										if (arg0 == 4121) {
											anInt3178 -= 2;
											local3895 = aStringArray17[anInt3178];
											local1101 = aStringArray17[anInt3178 + 1];
											local25 = anIntArray298[--anInt3171];
											anIntArray298[anInt3171++] = local3895.indexOf(local1101, local25);
											return;
										}
										if (arg0 == 4122) {
											local13 = anIntArray298[--anInt3171];
											anIntArray298[anInt3171++] = Character.toLowerCase((char) local13);
											return;
										}
										if (arg0 == 4123) {
											local13 = anIntArray298[--anInt3171];
											anIntArray298[anInt3171++] = Character.toUpperCase((char) local13);
											return;
										}
										if (arg0 == 4124) {
											local412 = anIntArray298[--anInt3171] != 0;
											local19 = anIntArray298[--anInt3171];
											aStringArray17[anInt3178++] = Static510.method6253(local412, (long) local19, Static179.anInt3168, 0);
											return;
										}
										if (arg0 == 4125) {
											local3895 = aStringArray17[--anInt3178];
											local19 = anIntArray298[--anInt3171];
											@Pc(8327) Class232 local8327 = Static372.method5725(local19, Static542.aClass171_152);
											anIntArray298[anInt3171++] = local8327.method5429(local3895, Static415.aClass2Array14);
											return;
										}
									} else if (arg0 < 4300) {
										if (arg0 == 4200) {
											local13 = anIntArray298[--anInt3171];
											aStringArray17[anInt3178++] = Static342.aClass250_2.method5980(local13).aString38;
											return;
										}
										@Pc(8389) Class133 local8389;
										if (arg0 == 4201) {
											anInt3171 -= 2;
											local13 = anIntArray298[anInt3171];
											local19 = anIntArray298[anInt3171 + 1];
											local8389 = Static342.aClass250_2.method5980(local13);
											if (local19 >= 1 && local19 <= 5 && local8389.aStringArray21[local19 - 1] != null) {
												aStringArray17[anInt3178++] = local8389.aStringArray21[local19 - 1];
												return;
											}
											aStringArray17[anInt3178++] = "";
											return;
										}
										if (arg0 == 4202) {
											anInt3171 -= 2;
											local13 = anIntArray298[anInt3171];
											local19 = anIntArray298[anInt3171 + 1];
											local8389 = Static342.aClass250_2.method5980(local13);
											if (local19 >= 1 && local19 <= 5 && local8389.aStringArray20[local19 - 1] != null) {
												aStringArray17[anInt3178++] = local8389.aStringArray20[local19 - 1];
												return;
											}
											aStringArray17[anInt3178++] = "";
											return;
										}
										if (arg0 == 4203) {
											local13 = anIntArray298[--anInt3171];
											anIntArray298[anInt3171++] = Static342.aClass250_2.method5980(local13).anInt3931;
											return;
										}
										if (arg0 == 4204) {
											local13 = anIntArray298[--anInt3171];
											anIntArray298[anInt3171++] = Static342.aClass250_2.method5980(local13).anInt3914 == 1 ? 1 : 0;
											return;
										}
										@Pc(8552) Class133 local8552;
										if (arg0 == 4205) {
											local13 = anIntArray298[--anInt3171];
											local8552 = Static342.aClass250_2.method5980(local13);
											if (local8552.anInt3921 == -1 && local8552.anInt3918 >= 0) {
												anIntArray298[anInt3171++] = local8552.anInt3918;
												return;
											}
											anIntArray298[anInt3171++] = local13;
											return;
										}
										if (arg0 == 4206) {
											local13 = anIntArray298[--anInt3171];
											local8552 = Static342.aClass250_2.method5980(local13);
											if (local8552.anInt3921 >= 0 && local8552.anInt3918 >= 0) {
												anIntArray298[anInt3171++] = local8552.anInt3918;
												return;
											}
											anIntArray298[anInt3171++] = local13;
											return;
										}
										if (arg0 == 4207) {
											local13 = anIntArray298[--anInt3171];
											anIntArray298[anInt3171++] = Static342.aClass250_2.method5980(local13).aBoolean281 ? 1 : 0;
											return;
										}
										if (arg0 == 4208) {
											anInt3171 -= 2;
											local13 = anIntArray298[anInt3171];
											local19 = anIntArray298[anInt3171 + 1];
											local3024 = Static452.aClass317_2.method7539(local19);
											if (local3024.method1654()) {
												aStringArray17[anInt3178++] = Static342.aClass250_2.method5980(local13).method3448(local3024.aString18, local19);
												return;
											}
											anIntArray298[anInt3171++] = Static342.aClass250_2.method5980(local13).method3457(local3024.anInt1963, local19);
											return;
										}
										if (arg0 == 4209) {
											anInt3171 -= 2;
											local13 = anIntArray298[anInt3171];
											local19 = anIntArray298[anInt3171 + 1] - 1;
											local8389 = Static342.aClass250_2.method5980(local13);
											if (local8389.anInt3919 == local19) {
												anIntArray298[anInt3171++] = local8389.anInt3912;
												return;
											}
											if (local8389.anInt3924 == local19) {
												anIntArray298[anInt3171++] = local8389.anInt3951;
												return;
											}
											anIntArray298[anInt3171++] = -1;
											return;
										}
										if (arg0 == 4210) {
											local3895 = aStringArray17[--anInt3178];
											local19 = anIntArray298[--anInt3171];
											Static347.method5284(local19 == 1, local3895);
											anIntArray298[anInt3171++] = Static161.anInt2921;
											return;
										}
										if (arg0 == 4211) {
											if (Static482.aShortArray130 != null && Static445.anInt7648 < Static161.anInt2921) {
												anIntArray298[anInt3171++] = Static482.aShortArray130[Static445.anInt7648++] & 0xFFFF;
												return;
											}
											anIntArray298[anInt3171++] = -1;
											return;
										}
										if (arg0 == 4212) {
											Static445.anInt7648 = 0;
											return;
										}
									} else if (arg0 < 4400) {
										if (arg0 == 4300) {
											anInt3171 -= 2;
											local13 = anIntArray298[anInt3171];
											local19 = anIntArray298[anInt3171 + 1];
											local3024 = Static452.aClass317_2.method7539(local19);
											if (local3024.method1654()) {
												aStringArray17[anInt3178++] = Static538.aClass242_2.method5833(local13).method4857(local19, local3024.aString18);
												return;
											}
											anIntArray298[anInt3171++] = Static538.aClass242_2.method5833(local13).method4865(local19, local3024.anInt1963);
											return;
										}
									} else if (arg0 < 4500) {
										if (arg0 == 4400) {
											anInt3171 -= 2;
											local13 = anIntArray298[anInt3171];
											local19 = anIntArray298[anInt3171 + 1];
											local3024 = Static452.aClass317_2.method7539(local19);
											if (local3024.method1654()) {
												aStringArray17[anInt3178++] = Static308.aClass96_4.method2274(local13).method956(local19, local3024.aString18);
												return;
											}
											anIntArray298[anInt3171++] = Static308.aClass96_4.method2274(local13).method948(local19, local3024.anInt1963);
											return;
										}
									} else if (arg0 < 4600) {
										if (arg0 == 4500) {
											anInt3171 -= 2;
											local13 = anIntArray298[anInt3171];
											local19 = anIntArray298[anInt3171 + 1];
											local3024 = Static452.aClass317_2.method7539(local19);
											if (local3024.method1654()) {
												aStringArray17[anInt3178++] = Static529.aClass263_1.method6267(local13).method568(local3024.aString18, local19);
												return;
											}
											anIntArray298[anInt3171++] = Static529.aClass263_1.method6267(local13).method566(local19, local3024.anInt1963);
											return;
										}
									} else if (arg0 < 4700 && arg0 == 4600) {
										local13 = anIntArray298[--anInt3171];
										@Pc(9053) Class230 local9053 = Static351.aClass228_1.method5341(local13);
										if (local9053.anIntArray652 != null && local9053.anIntArray652.length > 0) {
											local25 = 0;
											local353 = local9053.anIntArray651[0];
											for (local2290 = 1; local2290 < local9053.anIntArray652.length; local2290++) {
												if (local9053.anIntArray651[local2290] > local353) {
													local25 = local2290;
													local353 = local9053.anIntArray651[local2290];
												}
											}
											anIntArray298[anInt3171++] = local9053.anIntArray652[local25];
											return;
										}
										anIntArray298[anInt3171++] = local9053.anInt6380;
										return;
									}
								}
							}
						}
					} else {
						if (arg0 >= 2000) {
							arg0 -= 1000;
							local137 = Static182.method2888(anIntArray298[--anInt3171]);
						} else {
							local137 = arg1 ? aClass156_6 : aClass156_7;
						}
						if (arg0 == 1300) {
							local19 = anIntArray298[--anInt3171] - 1;
							if (local19 >= 0 && local19 <= 9) {
								local137.method4058(local19, aStringArray17[--anInt3178]);
								return;
							} else {
								anInt3178--;
								return;
							}
						}
						if (arg0 == 1301) {
							anInt3171 -= 2;
							local19 = anIntArray298[anInt3171];
							local25 = anIntArray298[anInt3171 + 1];
							if (local19 == -1 && local25 == -1) {
								local137.aClass156_9 = null;
								return;
							}
							local137.aClass156_9 = Static518.method7135(local25, local19);
							return;
						}
						if (arg0 == 1302) {
							local19 = anIntArray298[--anInt3171];
							if (local19 != Static284.anInt5345 && local19 != Static114.anInt2349 && local19 != Static106.anInt2138) {
								return;
							}
							local137.anInt4668 = local19;
							return;
						}
						if (arg0 == 1303) {
							local137.anInt4683 = anIntArray298[--anInt3171];
							return;
						}
						if (arg0 == 1304) {
							local137.anInt4675 = anIntArray298[--anInt3171];
							return;
						}
						if (arg0 == 1305) {
							local137.aString44 = aStringArray17[--anInt3178];
							return;
						}
						if (arg0 == 1306) {
							local137.aString43 = aStringArray17[--anInt3178];
							return;
						}
						if (arg0 == 1307) {
							local137.aStringArray24 = null;
							return;
						}
						if (arg0 == 1308) {
							local137.anInt4654 = anIntArray298[--anInt3171];
							local137.anInt4710 = anIntArray298[--anInt3171];
							return;
						}
						if (arg0 == 1309) {
							local19 = anIntArray298[--anInt3171];
							local25 = anIntArray298[--anInt3171];
							if (local25 >= 1 && local25 <= 10) {
								local137.method4049(local19, local25 - 1);
							}
							return;
						}
						if (arg0 == 1310) {
							local137.aString45 = aStringArray17[--anInt3178];
							return;
						}
						if (arg0 == 1311) {
							local137.anInt4705 = anIntArray298[--anInt3171];
							return;
						}
						if (arg0 == 1312 || arg0 == 1313) {
							if (arg0 == 1312) {
								anInt3171 -= 3;
								local19 = anIntArray298[anInt3171] - 1;
								local25 = anIntArray298[anInt3171 + 1];
								local353 = anIntArray298[anInt3171 + 2];
								if (local19 < 0 || local19 > 9) {
									throw new RuntimeException("IOR13121313");
								}
							} else {
								anInt3171 -= 2;
								local19 = 10;
								local25 = anIntArray298[anInt3171];
								local353 = anIntArray298[anInt3171 + 1];
							}
							if (local137.aByteArray69 == null) {
								if (local25 == 0) {
									return;
								}
								local137.aByteArray69 = new byte[11];
								local137.aByteArray68 = new byte[11];
								local137.anIntArray449 = new int[11];
							}
							local137.aByteArray69[local19] = (byte) local25;
							if (local25 == 0) {
								local137.aBoolean330 = false;
								for (local2290 = 0; local2290 < local137.aByteArray69.length; local2290++) {
									if (local137.aByteArray69[local2290] != 0) {
										local137.aBoolean330 = true;
										break;
									}
								}
							} else {
								local137.aBoolean330 = true;
							}
							local137.aByteArray68[local19] = (byte) local353;
							return;
						}
						if (arg0 == 1314) {
							local137.anInt4646 = anIntArray298[--anInt3171];
							return;
						}
					}
				} else {
					if (arg0 >= 2000) {
						arg0 -= 1000;
						local137 = Static182.method2888(anIntArray298[--anInt3171]);
					} else {
						local137 = arg1 ? aClass156_6 : aClass156_7;
					}
					Static473.method6593(local137);
					if (arg0 == 1200 || arg0 == 1205 || arg0 == 1208 || arg0 == 1209 || arg0 == 1212 || arg0 == 1213) {
						anInt3171 -= 2;
						local19 = anIntArray298[anInt3171];
						local25 = anIntArray298[anInt3171 + 1];
						if (local137.anInt4723 == -1) {
							Static498.method6769(local137.anInt4677);
							Static161.method2498(local137.anInt4677);
							Static95.method1651(local137.anInt4677);
						}
						if (local19 == -1) {
							local137.anInt4718 = 1;
							local137.anInt4657 = -1;
							local137.anInt4697 = -1;
							return;
						}
						local137.anInt4697 = local19;
						local137.anInt4728 = local25;
						if (arg0 == 1208 || arg0 == 1209) {
							local137.aBoolean328 = true;
						} else {
							local137.aBoolean328 = false;
						}
						@Pc(1630) Class133 local1630 = Static342.aClass250_2.method5980(local19);
						local137.anInt4733 = local1630.anInt3904;
						local137.anInt4716 = local1630.anInt3945;
						local137.anInt4726 = local1630.anInt3908;
						local137.anInt4658 = local1630.anInt3911;
						local137.anInt4736 = local1630.lb;
						local137.anInt4647 = local1630.anInt3893;
						if (arg0 == 1205 || arg0 == 1209) {
							local137.anInt4696 = 0;
						} else if (arg0 == 1212 || arg0 == 1213) {
							local137.anInt4696 = 1;
						} else {
							local137.anInt4696 = 2;
						}
						if (local137.anInt4713 > 0) {
							local137.anInt4647 = local137.anInt4647 * 32 / local137.anInt4713;
							return;
						}
						if (local137.anInt4671 > 0) {
							local137.anInt4647 = local137.anInt4647 * 32 / local137.anInt4671;
						}
						return;
					}
					if (arg0 == 1201) {
						local137.anInt4718 = 2;
						local137.anInt4657 = anIntArray298[--anInt3171];
						if (local137.anInt4723 == -1) {
							Static93.method1640(local137.anInt4677);
						}
						return;
					}
					if (arg0 == 1202) {
						local137.anInt4718 = 3;
						local137.anInt4657 = -1;
						if (local137.anInt4723 == -1) {
							Static93.method1640(local137.anInt4677);
						}
						return;
					}
					if (arg0 == 1203) {
						local137.anInt4718 = 6;
						local137.anInt4657 = anIntArray298[--anInt3171];
						if (local137.anInt4723 == -1) {
							Static93.method1640(local137.anInt4677);
						}
						return;
					}
					if (arg0 == 1204) {
						local137.anInt4718 = 5;
						local137.anInt4657 = anIntArray298[--anInt3171];
						if (local137.anInt4723 == -1) {
							Static93.method1640(local137.anInt4677);
						}
						return;
					}
					if (arg0 == 1206) {
						anInt3171 -= 4;
						local137.anInt4656 = anIntArray298[anInt3171];
						local137.anInt4676 = anIntArray298[anInt3171 + 1];
						local137.anInt4739 = anIntArray298[anInt3171 + 2];
						local137.anInt4664 = anIntArray298[anInt3171 + 3];
						Static473.method6593(local137);
						return;
					}
					if (arg0 == 1207) {
						anInt3171 -= 2;
						local137.anInt4653 = anIntArray298[anInt3171];
						local137.anInt4648 = anIntArray298[anInt3171 + 1];
						Static473.method6593(local137);
						return;
					}
					if (arg0 == 1210) {
						anInt3171 -= 4;
						local137.anInt4657 = anIntArray298[anInt3171];
						local137.anInt4660 = anIntArray298[anInt3171 + 1];
						if (anIntArray298[anInt3171 + 2] == 1) {
							local137.anInt4718 = 9;
						} else {
							local137.anInt4718 = 8;
						}
						if (anIntArray298[anInt3171 + 3] == 1) {
							local137.aBoolean328 = true;
						} else {
							local137.aBoolean328 = false;
						}
						if (local137.anInt4723 == -1) {
							Static93.method1640(local137.anInt4677);
						}
						return;
					}
					if (arg0 == 1211) {
						local137.anInt4718 = 5;
						local137.anInt4657 = Static198.anInt3873;
						local137.anInt4660 = 0;
						if (local137.anInt4723 == -1) {
							Static93.method1640(local137.anInt4677);
						}
						return;
					}
				}
			}
		}
		throw new IllegalStateException(String.valueOf(arg0));
	}

	@OriginalMember(owner = "client!he", name = "a", descriptor = "(Ljava/lang/String;I)V")
	private static void method2676(@OriginalArg(0) String arg0, @OriginalArg(1) int arg1) {
		if (Static313.anInt5785 == 0 && (Static264.aBoolean360 && !Static397.aBoolean514 || Static164.aBoolean185)) {
			return;
		}
		@Pc(11) String local11 = arg0.toLowerCase();
		@Pc(13) byte local13 = 0;
		if (local11.startsWith(Static541.aClass306_135.method7165(0))) {
			local13 = 0;
			arg0 = arg0.substring(Static541.aClass306_135.method7165(0).length());
		} else if (local11.startsWith(Static441.aClass306_111.method7165(0))) {
			local13 = 1;
			arg0 = arg0.substring(Static441.aClass306_111.method7165(0).length());
		} else if (local11.startsWith(Static359.aClass306_75.method7165(0))) {
			local13 = 2;
			arg0 = arg0.substring(Static359.aClass306_75.method7165(0).length());
		} else if (local11.startsWith(Static207.aClass306_45.method7165(0))) {
			local13 = 3;
			arg0 = arg0.substring(Static207.aClass306_45.method7165(0).length());
		} else if (local11.startsWith(Static29.aClass306_8.method7165(0))) {
			local13 = 4;
			arg0 = arg0.substring(Static29.aClass306_8.method7165(0).length());
		} else if (local11.startsWith(Static59.aClass306_18.method7165(0))) {
			local13 = 5;
			arg0 = arg0.substring(Static59.aClass306_18.method7165(0).length());
		} else if (local11.startsWith(Static372.aClass306_89.method7165(0))) {
			local13 = 6;
			arg0 = arg0.substring(Static372.aClass306_89.method7165(0).length());
		} else if (local11.startsWith(Static426.aClass306_108.method7165(0))) {
			local13 = 7;
			arg0 = arg0.substring(Static426.aClass306_108.method7165(0).length());
		} else if (local11.startsWith(Static466.aClass306_118.method7165(0))) {
			local13 = 8;
			arg0 = arg0.substring(Static466.aClass306_118.method7165(0).length());
		} else if (local11.startsWith(Static404.aClass306_123.method7165(0))) {
			local13 = 9;
			arg0 = arg0.substring(Static404.aClass306_123.method7165(0).length());
		} else if (local11.startsWith(Static399.aClass306_101.method7165(0))) {
			local13 = 10;
			arg0 = arg0.substring(Static399.aClass306_101.method7165(0).length());
		} else if (local11.startsWith(Static287.aClass306_67.method7165(0))) {
			local13 = 11;
			arg0 = arg0.substring(Static287.aClass306_67.method7165(0).length());
		} else if (Static179.anInt3168 != 0) {
			if (local11.startsWith(Static541.aClass306_135.method7165(Static179.anInt3168))) {
				local13 = 0;
				arg0 = arg0.substring(Static541.aClass306_135.method7165(Static179.anInt3168).length());
			} else if (local11.startsWith(Static441.aClass306_111.method7165(Static179.anInt3168))) {
				local13 = 1;
				arg0 = arg0.substring(Static441.aClass306_111.method7165(Static179.anInt3168).length());
			} else if (local11.startsWith(Static359.aClass306_75.method7165(Static179.anInt3168))) {
				local13 = 2;
				arg0 = arg0.substring(Static359.aClass306_75.method7165(Static179.anInt3168).length());
			} else if (local11.startsWith(Static207.aClass306_45.method7165(Static179.anInt3168))) {
				local13 = 3;
				arg0 = arg0.substring(Static207.aClass306_45.method7165(Static179.anInt3168).length());
			} else if (local11.startsWith(Static29.aClass306_8.method7165(Static179.anInt3168))) {
				local13 = 4;
				arg0 = arg0.substring(Static29.aClass306_8.method7165(Static179.anInt3168).length());
			} else if (local11.startsWith(Static59.aClass306_18.method7165(Static179.anInt3168))) {
				local13 = 5;
				arg0 = arg0.substring(Static59.aClass306_18.method7165(Static179.anInt3168).length());
			} else if (local11.startsWith(Static372.aClass306_89.method7165(Static179.anInt3168))) {
				local13 = 6;
				arg0 = arg0.substring(Static372.aClass306_89.method7165(Static179.anInt3168).length());
			} else if (local11.startsWith(Static426.aClass306_108.method7165(Static179.anInt3168))) {
				local13 = 7;
				arg0 = arg0.substring(Static426.aClass306_108.method7165(Static179.anInt3168).length());
			} else if (local11.startsWith(Static466.aClass306_118.method7165(Static179.anInt3168))) {
				local13 = 8;
				arg0 = arg0.substring(Static466.aClass306_118.method7165(Static179.anInt3168).length());
			} else if (local11.startsWith(Static404.aClass306_123.method7165(Static179.anInt3168))) {
				local13 = 9;
				arg0 = arg0.substring(Static404.aClass306_123.method7165(Static179.anInt3168).length());
			} else if (local11.startsWith(Static399.aClass306_101.method7165(Static179.anInt3168))) {
				local13 = 10;
				arg0 = arg0.substring(Static399.aClass306_101.method7165(Static179.anInt3168).length());
			} else if (local11.startsWith(Static287.aClass306_67.method7165(Static179.anInt3168))) {
				local13 = 11;
				arg0 = arg0.substring(Static287.aClass306_67.method7165(Static179.anInt3168).length());
			}
		}
		local11 = arg0.toLowerCase();
		@Pc(451) byte local451 = 0;
		if (local11.startsWith(Static285.aClass306_64.method7165(0))) {
			local451 = 1;
			arg0 = arg0.substring(Static285.aClass306_64.method7165(0).length());
		} else if (local11.startsWith(Static48.aClass306_15.method7165(0))) {
			local451 = 2;
			arg0 = arg0.substring(Static48.aClass306_15.method7165(0).length());
		} else if (local11.startsWith(Static296.aClass306_54.method7165(0))) {
			local451 = 3;
			arg0 = arg0.substring(Static296.aClass306_54.method7165(0).length());
		} else if (local11.startsWith(Static363.aClass306_82.method7165(0))) {
			local451 = 4;
			arg0 = arg0.substring(Static363.aClass306_82.method7165(0).length());
		} else if (local11.startsWith(Static393.aClass306_97.method7165(0))) {
			local451 = 5;
			arg0 = arg0.substring(Static393.aClass306_97.method7165(0).length());
		} else if (Static179.anInt3168 != 0) {
			if (local11.startsWith(Static285.aClass306_64.method7165(Static179.anInt3168))) {
				local451 = 1;
				arg0 = arg0.substring(Static285.aClass306_64.method7165(Static179.anInt3168).length());
			} else if (local11.startsWith(Static48.aClass306_15.method7165(Static179.anInt3168))) {
				local451 = 2;
				arg0 = arg0.substring(Static48.aClass306_15.method7165(Static179.anInt3168).length());
			} else if (local11.startsWith(Static296.aClass306_54.method7165(Static179.anInt3168))) {
				local451 = 3;
				arg0 = arg0.substring(Static296.aClass306_54.method7165(Static179.anInt3168).length());
			} else if (local11.startsWith(Static363.aClass306_82.method7165(Static179.anInt3168))) {
				local451 = 4;
				arg0 = arg0.substring(Static363.aClass306_82.method7165(Static179.anInt3168).length());
			} else if (local11.startsWith(Static393.aClass306_97.method7165(Static179.anInt3168))) {
				local451 = 5;
				arg0 = arg0.substring(Static393.aClass306_97.method7165(Static179.anInt3168).length());
			}
		}
		Static144.method2331(Static430.aClass296_288);
		Static455.aClass1_Sub6_Sub2_2.method3937(0);
		@Pc(646) int local646 = Static455.aClass1_Sub6_Sub2_2.anInt4555;
		Static455.aClass1_Sub6_Sub2_2.method3937(local13);
		Static455.aClass1_Sub6_Sub2_2.method3937(local451);
		Static385.method5852(Static455.aClass1_Sub6_Sub2_2, arg0);
		Static455.aClass1_Sub6_Sub2_2.method3961(Static455.aClass1_Sub6_Sub2_2.anInt4555 - local646);
	}

	@OriginalMember(owner = "client!he", name = "b", descriptor = "(IZ)V")
	private static void method2677(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1) {
		@Pc(75) String local75;
		@Pc(1391) boolean local1391;
		@Pc(89) int local89;
		@Pc(157) int local157;
		@Pc(707) int local707;
		@Pc(95) int local95;
		@Pc(163) String local163;
		@Pc(81) String local81;
		if (arg0 < 5100) {
			if (arg0 == 5000) {
				anIntArray298[anInt3171++] = Static88.anInt1783;
				return;
			}
			if (arg0 == 5001) {
				anInt3171 -= 3;
				Static88.anInt1783 = anIntArray298[anInt3171];
				Static66.aClass256_2 = Static3.method209(anIntArray298[anInt3171 + 1]);
				if (Static66.aClass256_2 == null) {
					Static66.aClass256_2 = Static162.aClass256_3;
				}
				Static358.anInt8903 = anIntArray298[anInt3171 + 2];
				Static144.method2331(Static65.aClass296_353);
				Static455.aClass1_Sub6_Sub2_2.method3937(Static88.anInt1783);
				Static455.aClass1_Sub6_Sub2_2.method3937(Static66.aClass256_2.anInt7305);
				Static455.aClass1_Sub6_Sub2_2.method3937(Static358.anInt8903);
				return;
			}
			if (arg0 == 5002) {
				anInt3178 -= 2;
				local75 = aStringArray17[anInt3178];
				local81 = aStringArray17[anInt3178 + 1];
				anInt3171 -= 2;
				local89 = anIntArray298[anInt3171];
				local95 = anIntArray298[anInt3171 + 1];
				if (local81 == null) {
					local81 = "";
				}
				if (local81.length() > 80) {
					local81 = local81.substring(0, 80);
				}
				Static144.method2331(Static365.aClass296_286);
				Static455.aClass1_Sub6_Sub2_2.method3937(Static282.method6464(local75) + Static282.method6464(local81) + 2);
				Static455.aClass1_Sub6_Sub2_2.method3917(local75);
				Static455.aClass1_Sub6_Sub2_2.method3937(local89 - 1);
				Static455.aClass1_Sub6_Sub2_2.method3937(local95);
				Static455.aClass1_Sub6_Sub2_2.method3917(local81);
				return;
			}
			@Pc(161) Class50 local161;
			if (arg0 == 5003) {
				local157 = anIntArray298[--anInt3171];
				local161 = Static58.method1108(local157);
				local163 = "";
				if (local161 != null && local161.aString9 != null) {
					local163 = local161.aString9;
				}
				aStringArray17[anInt3178++] = local163;
				return;
			}
			if (arg0 == 5004) {
				local157 = anIntArray298[--anInt3171];
				local161 = Static58.method1108(local157);
				local89 = -1;
				if (local161 != null) {
					local89 = local161.anInt1320;
				}
				anIntArray298[anInt3171++] = local89;
				return;
			}
			if (arg0 == 5005) {
				if (Static66.aClass256_2 == null) {
					anIntArray298[anInt3171++] = -1;
					return;
				}
				anIntArray298[anInt3171++] = Static66.aClass256_2.anInt7305;
				return;
			}
			if (arg0 == 5006) {
				local157 = anIntArray298[--anInt3171];
				Static144.method2331(Static191.aClass296_170);
				Static455.aClass1_Sub6_Sub2_2.method3937(local157);
				return;
			}
			if (arg0 == 5008) {
				local75 = aStringArray17[--anInt3178];
				method2676(local75, arg0);
				return;
			}
			if (arg0 == 5009) {
				anInt3178 -= 2;
				local75 = aStringArray17[anInt3178];
				local81 = aStringArray17[anInt3178 + 1];
				if (Static313.anInt5785 != 0 || (!Static264.aBoolean360 || Static397.aBoolean514) && !Static164.aBoolean185) {
					Static144.method2331(Static257.aClass296_92);
					Static455.aClass1_Sub6_Sub2_2.method3937(0);
					local89 = Static455.aClass1_Sub6_Sub2_2.anInt4555;
					Static455.aClass1_Sub6_Sub2_2.method3917(local75);
					Static385.method5852(Static455.aClass1_Sub6_Sub2_2, local81);
					Static455.aClass1_Sub6_Sub2_2.method3961(Static455.aClass1_Sub6_Sub2_2.anInt4555 - local89);
					return;
				}
				return;
			}
			if (arg0 == 5010) {
				local157 = anIntArray298[--anInt3171];
				local161 = Static58.method1108(local157);
				local163 = "";
				if (local161 != null && local161.aString11 != null) {
					local163 = local161.aString11;
				}
				aStringArray17[anInt3178++] = local163;
				return;
			}
			if (arg0 == 5011) {
				local157 = anIntArray298[--anInt3171];
				local161 = Static58.method1108(local157);
				local163 = "";
				if (local161 != null && local161.aString8 != null) {
					local163 = local161.aString8;
				}
				aStringArray17[anInt3178++] = local163;
				return;
			}
			if (arg0 == 5012) {
				local157 = anIntArray298[--anInt3171];
				local161 = Static58.method1108(local157);
				local89 = -1;
				if (local161 != null) {
					local89 = local161.anInt1316;
				}
				anIntArray298[anInt3171++] = local89;
				return;
			}
			if (arg0 == 5015) {
				if (Static63.aClass49_Sub2_Sub2_Sub1_1 == null || Static63.aClass49_Sub2_Sub2_Sub1_1.aString17 == null) {
					local75 = Static328.aString55;
				} else {
					local75 = Static63.aClass49_Sub2_Sub2_Sub1_1.method1535();
				}
				aStringArray17[anInt3178++] = local75;
				return;
			}
			if (arg0 == 5016) {
				anIntArray298[anInt3171++] = Static358.anInt8903;
				return;
			}
			if (arg0 == 5017) {
				anIntArray298[anInt3171++] = Static4.method232();
				return;
			}
			if (arg0 == 5018) {
				local157 = anIntArray298[--anInt3171];
				local161 = Static58.method1108(local157);
				local89 = 0;
				if (local161 != null) {
					local89 = local161.anInt1318;
				}
				anIntArray298[anInt3171++] = local89;
				return;
			}
			if (arg0 == 5019) {
				local157 = anIntArray298[--anInt3171];
				local161 = Static58.method1108(local157);
				local163 = "";
				if (local161 != null && local161.aString10 != null) {
					local163 = local161.aString10;
				}
				aStringArray17[anInt3178++] = local163;
				return;
			}
			if (arg0 == 5020) {
				if (Static63.aClass49_Sub2_Sub2_Sub1_1 == null || Static63.aClass49_Sub2_Sub2_Sub1_1.aString17 == null) {
					local75 = Static328.aString55;
				} else {
					local75 = Static63.aClass49_Sub2_Sub2_Sub1_1.method1531();
				}
				aStringArray17[anInt3178++] = local75;
				return;
			}
			if (arg0 == 5023) {
				local157 = anIntArray298[--anInt3171];
				local161 = Static58.method1108(local157);
				local89 = -1;
				if (local161 != null) {
					local89 = local161.anInt1317;
				}
				anIntArray298[anInt3171++] = local89;
				return;
			}
			if (arg0 == 5024) {
				local157 = anIntArray298[--anInt3171];
				local161 = Static58.method1108(local157);
				local89 = -1;
				if (local161 != null) {
					local89 = local161.anInt1322;
				}
				anIntArray298[anInt3171++] = local89;
				return;
			}
			if (arg0 == 5050) {
				local157 = anIntArray298[--anInt3171];
				aStringArray17[anInt3178++] = Static533.aClass276_1.method6448(local157).aString56;
				return;
			}
			@Pc(667) Class1_Sub1_Sub13 local667;
			if (arg0 == 5051) {
				local157 = anIntArray298[--anInt3171];
				local667 = Static533.aClass276_1.method6448(local157);
				if (local667.anIntArray598 == null) {
					anIntArray298[anInt3171++] = 0;
					return;
				}
				anIntArray298[anInt3171++] = local667.anIntArray598.length;
				return;
			}
			if (arg0 == 5052) {
				anInt3171 -= 2;
				local157 = anIntArray298[anInt3171];
				local707 = anIntArray298[anInt3171 + 1];
				@Pc(712) Class1_Sub1_Sub13 local712 = Static533.aClass276_1.method6448(local157);
				local95 = local712.anIntArray598[local707];
				anIntArray298[anInt3171++] = local95;
				return;
			}
			if (arg0 == 5053) {
				local157 = anIntArray298[--anInt3171];
				local667 = Static533.aClass276_1.method6448(local157);
				if (local667.anIntArray599 == null) {
					anIntArray298[anInt3171++] = 0;
					return;
				}
				anIntArray298[anInt3171++] = local667.anIntArray599.length;
				return;
			}
			if (arg0 == 5054) {
				anInt3171 -= 2;
				local157 = anIntArray298[anInt3171];
				local707 = anIntArray298[anInt3171 + 1];
				anIntArray298[anInt3171++] = Static533.aClass276_1.method6448(local157).anIntArray599[local707];
				return;
			}
			if (arg0 == 5055) {
				local157 = anIntArray298[--anInt3171];
				aStringArray17[anInt3178++] = Static480.aClass32_2.method922(local157).method4430();
				return;
			}
			if (arg0 == 5056) {
				local157 = anIntArray298[--anInt3171];
				@Pc(838) Class1_Sub1_Sub10 local838 = Static480.aClass32_2.method922(local157);
				if (local838.anIntArray523 == null) {
					anIntArray298[anInt3171++] = 0;
					return;
				}
				anIntArray298[anInt3171++] = local838.anIntArray523.length;
				return;
			}
			if (arg0 == 5057) {
				anInt3171 -= 2;
				local157 = anIntArray298[anInt3171];
				local707 = anIntArray298[anInt3171 + 1];
				anIntArray298[anInt3171++] = Static480.aClass32_2.method922(local157).anIntArray523[local707];
				return;
			}
			if (arg0 == 5058) {
				aClass300_1 = new Class300();
				aClass300_1.anInt8615 = anIntArray298[--anInt3171];
				aClass300_1.aClass1_Sub1_Sub10_1 = Static480.aClass32_2.method922(aClass300_1.anInt8615);
				aClass300_1.anIntArray777 = new int[aClass300_1.aClass1_Sub1_Sub10_1.method4433()];
				return;
			}
			if (arg0 == 5059) {
				Static144.method2331(Static341.aClass296_272);
				Static455.aClass1_Sub6_Sub2_2.method3937(0);
				local157 = Static455.aClass1_Sub6_Sub2_2.anInt4555;
				Static455.aClass1_Sub6_Sub2_2.method3937(0);
				Static455.aClass1_Sub6_Sub2_2.method3919(aClass300_1.anInt8615);
				aClass300_1.aClass1_Sub1_Sub10_1.method4437(Static455.aClass1_Sub6_Sub2_2, aClass300_1.anIntArray777);
				Static455.aClass1_Sub6_Sub2_2.method3961(Static455.aClass1_Sub6_Sub2_2.anInt4555 - local157);
				return;
			}
			if (arg0 == 5060) {
				local75 = aStringArray17[--anInt3178];
				Static144.method2331(Static224.aClass296_191);
				Static455.aClass1_Sub6_Sub2_2.method3937(0);
				local707 = Static455.aClass1_Sub6_Sub2_2.anInt4555;
				Static455.aClass1_Sub6_Sub2_2.method3917(local75);
				Static455.aClass1_Sub6_Sub2_2.method3919(aClass300_1.anInt8615);
				aClass300_1.aClass1_Sub1_Sub10_1.method4437(Static455.aClass1_Sub6_Sub2_2, aClass300_1.anIntArray777);
				Static455.aClass1_Sub6_Sub2_2.method3961(Static455.aClass1_Sub6_Sub2_2.anInt4555 - local707);
				return;
			}
			if (arg0 == 5061) {
				Static144.method2331(Static341.aClass296_272);
				Static455.aClass1_Sub6_Sub2_2.method3937(0);
				local157 = Static455.aClass1_Sub6_Sub2_2.anInt4555;
				Static455.aClass1_Sub6_Sub2_2.method3937(1);
				Static455.aClass1_Sub6_Sub2_2.method3919(aClass300_1.anInt8615);
				aClass300_1.aClass1_Sub1_Sub10_1.method4437(Static455.aClass1_Sub6_Sub2_2, aClass300_1.anIntArray777);
				Static455.aClass1_Sub6_Sub2_2.method3961(Static455.aClass1_Sub6_Sub2_2.anInt4555 - local157);
				return;
			}
			if (arg0 == 5062) {
				anInt3171 -= 2;
				local157 = anIntArray298[anInt3171];
				local707 = anIntArray298[anInt3171 + 1];
				anIntArray298[anInt3171++] = Static533.aClass276_1.method6448(local157).aCharArray33[local707];
				return;
			}
			if (arg0 == 5063) {
				anInt3171 -= 2;
				local157 = anIntArray298[anInt3171];
				local707 = anIntArray298[anInt3171 + 1];
				anIntArray298[anInt3171++] = Static533.aClass276_1.method6448(local157).aCharArray34[local707];
				return;
			}
			if (arg0 == 5064) {
				anInt3171 -= 2;
				local157 = anIntArray298[anInt3171];
				local707 = anIntArray298[anInt3171 + 1];
				if (local707 == -1) {
					anIntArray298[anInt3171++] = -1;
					return;
				}
				anIntArray298[anInt3171++] = Static533.aClass276_1.method6448(local157).method5061((char) local707);
				return;
			}
			if (arg0 == 5065) {
				anInt3171 -= 2;
				local157 = anIntArray298[anInt3171];
				local707 = anIntArray298[anInt3171 + 1];
				if (local707 == -1) {
					anIntArray298[anInt3171++] = -1;
					return;
				}
				anIntArray298[anInt3171++] = Static533.aClass276_1.method6448(local157).method5060((char) local707);
				return;
			}
			if (arg0 == 5066) {
				local157 = anIntArray298[--anInt3171];
				anIntArray298[anInt3171++] = Static480.aClass32_2.method922(local157).method4433();
				return;
			}
			if (arg0 == 5067) {
				anInt3171 -= 2;
				local157 = anIntArray298[anInt3171];
				local707 = anIntArray298[anInt3171 + 1];
				local89 = Static480.aClass32_2.method922(local157).method4434(local707).anInt905;
				anIntArray298[anInt3171++] = local89;
				return;
			}
			if (arg0 == 5068) {
				anInt3171 -= 2;
				local157 = anIntArray298[anInt3171];
				local707 = anIntArray298[anInt3171 + 1];
				aClass300_1.anIntArray777[local157] = local707;
				return;
			}
			if (arg0 == 5069) {
				anInt3171 -= 2;
				local157 = anIntArray298[anInt3171];
				local707 = anIntArray298[anInt3171 + 1];
				aClass300_1.anIntArray777[local157] = local707;
				return;
			}
			if (arg0 == 5070) {
				anInt3171 -= 3;
				local157 = anIntArray298[anInt3171];
				local707 = anIntArray298[anInt3171 + 1];
				local89 = anIntArray298[anInt3171 + 2];
				@Pc(1343) Class1_Sub1_Sub10 local1343 = Static480.aClass32_2.method922(local157);
				if (local1343.method4434(local707).anInt905 != 0) {
					throw new RuntimeException("bad command");
				}
				anIntArray298[anInt3171++] = local1343.method4429(local707, local89);
				return;
			}
			if (arg0 == 5071) {
				local75 = aStringArray17[--anInt3178];
				local1391 = anIntArray298[--anInt3171] == 1;
				Static398.method6004(local1391, local75);
				anIntArray298[anInt3171++] = Static161.anInt2921;
				return;
			}
			if (arg0 == 5072) {
				if (Static482.aShortArray130 != null && Static445.anInt7648 < Static161.anInt2921) {
					anIntArray298[anInt3171++] = Static482.aShortArray130[Static445.anInt7648++] & 0xFFFF;
					return;
				}
				anIntArray298[anInt3171++] = -1;
				return;
			}
			if (arg0 == 5073) {
				Static445.anInt7648 = 0;
				return;
			}
		} else if (arg0 < 5200) {
			if (arg0 == 5100) {
				if (Static149.aClass66_1.method1582(86)) {
					anIntArray298[anInt3171++] = 1;
					return;
				}
				anIntArray298[anInt3171++] = 0;
				return;
			}
			if (arg0 == 5101) {
				if (Static149.aClass66_1.method1582(82)) {
					anIntArray298[anInt3171++] = 1;
					return;
				}
				anIntArray298[anInt3171++] = 0;
				return;
			}
			if (arg0 == 5102) {
				if (Static149.aClass66_1.method1582(81)) {
					anIntArray298[anInt3171++] = 1;
					return;
				}
				anIntArray298[anInt3171++] = 0;
				return;
			}
		} else {
			@Pc(2728) int local2728;
			@Pc(2002) boolean local2002;
			if (arg0 < 5300) {
				if (arg0 == 5200) {
					Static517.method7132(anIntArray298[--anInt3171]);
					return;
				}
				if (arg0 == 5201) {
					anIntArray298[anInt3171++] = Static66.method1187();
					return;
				}
				if (arg0 == 5205) {
					Static244.method4185(false, -1, -1, anIntArray298[--anInt3171]);
					return;
				}
				@Pc(1591) Class1_Sub1_Sub5 local1591;
				if (arg0 == 5206) {
					local157 = anIntArray298[--anInt3171];
					local1591 = Static118.method821(local157 >> 14 & 0x3FFF, local157 & 0x3FFF);
					if (local1591 == null) {
						anIntArray298[anInt3171++] = -1;
						return;
					}
					anIntArray298[anInt3171++] = local1591.anInt3147;
					return;
				}
				@Pc(1624) Class1_Sub1_Sub5 local1624;
				if (arg0 == 5207) {
					local1624 = Static118.method832(anIntArray298[--anInt3171]);
					if (local1624 != null && local1624.aString33 != null) {
						aStringArray17[anInt3178++] = local1624.aString33;
						return;
					}
					aStringArray17[anInt3178++] = "";
					return;
				}
				if (arg0 == 5208) {
					anIntArray298[anInt3171++] = Static135.anInt2650;
					anIntArray298[anInt3171++] = Static431.anInt7507;
					return;
				}
				if (arg0 == 5209) {
					anIntArray298[anInt3171++] = Static103.anInt2070 + Static118.anInt815;
					anIntArray298[anInt3171++] = Static214.anInt2191 + Static118.anInt813;
					return;
				}
				if (arg0 == 5210) {
					local157 = anIntArray298[--anInt3171];
					local1591 = Static118.method832(local157);
					if (local1591 == null) {
						anIntArray298[anInt3171++] = 0;
						anIntArray298[anInt3171++] = 0;
						return;
					}
					anIntArray298[anInt3171++] = local1591.anInt3155 >> 14 & 0x3FFF;
					anIntArray298[anInt3171++] = local1591.anInt3155 & 0x3FFF;
					return;
				}
				if (arg0 == 5211) {
					local157 = anIntArray298[--anInt3171];
					local1591 = Static118.method832(local157);
					if (local1591 == null) {
						anIntArray298[anInt3171++] = 0;
						anIntArray298[anInt3171++] = 0;
						return;
					}
					anIntArray298[anInt3171++] = local1591.anInt3144 - local1591.anInt3152;
					anIntArray298[anInt3171++] = local1591.anInt3156 - local1591.anInt3148;
					return;
				}
				@Pc(1814) Class1_Sub39 local1814;
				if (arg0 == 5212) {
					local1814 = Static534.method7408();
					if (local1814 == null) {
						anIntArray298[anInt3171++] = -1;
						anIntArray298[anInt3171++] = -1;
						return;
					}
					anIntArray298[anInt3171++] = local1814.anInt7253;
					local707 = local1814.anInt7254 << 28 | local1814.anInt7249 + Static118.anInt815 << 14 | local1814.anInt7250 + Static118.anInt813;
					anIntArray298[anInt3171++] = local707;
					return;
				}
				if (arg0 == 5213) {
					local1814 = Static242.method4179();
					if (local1814 == null) {
						anIntArray298[anInt3171++] = -1;
						anIntArray298[anInt3171++] = -1;
						return;
					}
					anIntArray298[anInt3171++] = local1814.anInt7253;
					local707 = local1814.anInt7254 << 28 | local1814.anInt7249 + Static118.anInt815 << 14 | local1814.anInt7250 + Static118.anInt813;
					anIntArray298[anInt3171++] = local707;
					return;
				}
				@Pc(1962) boolean local1962;
				if (arg0 == 5214) {
					local157 = anIntArray298[--anInt3171];
					local1591 = Static437.method6313();
					if (local1591 != null) {
						local1962 = local1591.method2667(local157 & 0x3FFF, anIntArray299, local157 >> 14 & 0x3FFF, local157 >> 28 & 0x3);
						if (local1962) {
							Static215.method3603(anIntArray299[1], anIntArray299[2]);
						}
					}
					return;
				}
				if (arg0 == 5215) {
					anInt3171 -= 2;
					local157 = anIntArray298[anInt3171];
					local707 = anIntArray298[anInt3171 + 1];
					@Pc(2000) Class104 local2000 = Static118.method838(local157 >> 14 & 0x3FFF, local157 & 0x3FFF);
					local2002 = false;
					for (@Pc(2007) Class1_Sub1_Sub5 local2007 = (Class1_Sub1_Sub5) local2000.method2414(); local2007 != null; local2007 = (Class1_Sub1_Sub5) local2000.method2417()) {
						if (local2007.anInt3147 == local707) {
							local2002 = true;
							break;
						}
					}
					if (local2002) {
						anIntArray298[anInt3171++] = 1;
						return;
					}
					anIntArray298[anInt3171++] = 0;
					return;
				}
				if (arg0 == 5218) {
					local157 = anIntArray298[--anInt3171];
					local1591 = Static118.method832(local157);
					if (local1591 == null) {
						anIntArray298[anInt3171++] = -1;
						return;
					}
					anIntArray298[anInt3171++] = local1591.anInt3146;
					return;
				}
				if (arg0 == 5220) {
					anIntArray298[anInt3171++] = Static385.anInt6975 == 100 ? 1 : 0;
					return;
				}
				if (arg0 == 5221) {
					local157 = anIntArray298[--anInt3171];
					Static215.method3603(local157 >> 14 & 0x3FFF, local157 & 0x3FFF);
					return;
				}
				if (arg0 == 5222) {
					local1624 = Static437.method6313();
					if (local1624 != null) {
						local1391 = local1624.method2661(Static103.anInt2070 + Static118.anInt815, Static214.anInt2191 + Static118.anInt813, anIntArray299);
						if (local1391) {
							anIntArray298[anInt3171++] = anIntArray299[1];
							anIntArray298[anInt3171++] = anIntArray299[2];
							return;
						}
						anIntArray298[anInt3171++] = -1;
						anIntArray298[anInt3171++] = -1;
						return;
					}
					anIntArray298[anInt3171++] = -1;
					anIntArray298[anInt3171++] = -1;
					return;
				}
				if (arg0 == 5223) {
					anInt3171 -= 2;
					local157 = anIntArray298[anInt3171];
					local707 = anIntArray298[anInt3171 + 1];
					Static244.method4185(false, local707 & 0x3FFF, local707 >> 14 & 0x3FFF, local157);
					return;
				}
				if (arg0 == 5224) {
					local157 = anIntArray298[--anInt3171];
					local1591 = Static437.method6313();
					if (local1591 != null) {
						local1962 = local1591.method2667(local157 & 0x3FFF, anIntArray299, local157 >> 14 & 0x3FFF, local157 >> 28 & 0x3);
						if (local1962) {
							anIntArray298[anInt3171++] = anIntArray299[1];
							anIntArray298[anInt3171++] = anIntArray299[2];
							return;
						}
						anIntArray298[anInt3171++] = -1;
						anIntArray298[anInt3171++] = -1;
						return;
					}
					anIntArray298[anInt3171++] = -1;
					anIntArray298[anInt3171++] = -1;
					return;
				}
				if (arg0 == 5225) {
					local157 = anIntArray298[--anInt3171];
					local1591 = Static437.method6313();
					if (local1591 != null) {
						local1962 = local1591.method2661(local157 >> 14 & 0x3FFF, local157 & 0x3FFF, anIntArray299);
						if (local1962) {
							anIntArray298[anInt3171++] = anIntArray299[1];
							anIntArray298[anInt3171++] = anIntArray299[2];
							return;
						}
						anIntArray298[anInt3171++] = -1;
						anIntArray298[anInt3171++] = -1;
						return;
					}
					anIntArray298[anInt3171++] = -1;
					anIntArray298[anInt3171++] = -1;
					return;
				}
				if (arg0 == 5226) {
					Static175.method2635(anIntArray298[--anInt3171]);
					return;
				}
				if (arg0 == 5227) {
					anInt3171 -= 2;
					local157 = anIntArray298[anInt3171];
					local707 = anIntArray298[anInt3171 + 1];
					Static244.method4185(true, local707 & 0x3FFF, local707 >> 14 & 0x3FFF, local157);
					return;
				}
				if (arg0 == 5228) {
					Static439.aBoolean544 = anIntArray298[--anInt3171] == 1;
					return;
				}
				if (arg0 == 5229) {
					anIntArray298[anInt3171++] = Static439.aBoolean544 ? 1 : 0;
					return;
				}
				if (arg0 == 5230) {
					local157 = anIntArray298[--anInt3171];
					Static546.method2430(local157);
					return;
				}
				@Pc(2520) Class1 local2520;
				if (arg0 == 5231) {
					anInt3171 -= 2;
					local157 = anIntArray298[anInt3171];
					local1391 = anIntArray298[anInt3171 + 1] == 1;
					if (Static256.aClass17_21 != null) {
						local2520 = Static256.aClass17_21.method738((long) local157);
						if (local2520 != null && !local1391) {
							local2520.method7525();
							return;
						}
						if (local2520 == null && local1391) {
							local2520 = new Class1();
							Static256.aClass17_21.method737(local2520, (long) local157);
						}
					}
					return;
				}
				@Pc(2562) Class1 local2562;
				if (arg0 == 5232) {
					local157 = anIntArray298[--anInt3171];
					if (Static256.aClass17_21 != null) {
						local2562 = Static256.aClass17_21.method738((long) local157);
						anIntArray298[anInt3171++] = local2562 == null ? 0 : 1;
						return;
					}
					anIntArray298[anInt3171++] = 0;
					return;
				}
				if (arg0 == 5233) {
					anInt3171 -= 2;
					local157 = anIntArray298[anInt3171];
					local1391 = anIntArray298[anInt3171 + 1] == 1;
					if (Static386.aClass17_30 != null) {
						local2520 = Static386.aClass17_30.method738((long) local157);
						if (local2520 != null && !local1391) {
							local2520.method7525();
							return;
						}
						if (local2520 == null && local1391) {
							local2520 = new Class1();
							Static386.aClass17_30.method737(local2520, (long) local157);
						}
					}
					return;
				}
				if (arg0 == 5234) {
					local157 = anIntArray298[--anInt3171];
					if (Static386.aClass17_30 != null) {
						local2562 = Static386.aClass17_30.method738((long) local157);
						anIntArray298[anInt3171++] = local2562 == null ? 0 : 1;
						return;
					}
					anIntArray298[anInt3171++] = 0;
					return;
				}
				if (arg0 == 5235) {
					anIntArray298[anInt3171++] = Static118.aClass1_Sub1_Sub5_2 == null ? -1 : Static118.aClass1_Sub1_Sub5_2.anInt3147;
					return;
				}
				if (arg0 == 5236) {
					anInt3171 -= 2;
					local157 = anIntArray298[anInt3171];
					local707 = anIntArray298[anInt3171 + 1];
					local89 = local707 >> 14 & 0x3FFF;
					local95 = local707 & 0x3FFF;
					local2728 = Static124.method2110(local89, local157, local95);
					if (local2728 < 0) {
						anIntArray298[anInt3171++] = -1;
						return;
					}
					anIntArray298[anInt3171++] = local2728;
					return;
				}
				if (arg0 == 5237) {
					Static222.method3844();
					return;
				}
			} else if (arg0 < 5400) {
				if (arg0 == 5300) {
					anInt3171 -= 2;
					local157 = anIntArray298[anInt3171];
					local707 = anIntArray298[anInt3171 + 1];
					Static219.method6545(3, false, local157, local707);
					anIntArray298[anInt3171++] = Static193.aFrame8 == null ? 0 : 1;
					return;
				}
				if (arg0 == 5301) {
					if (Static193.aFrame8 != null) {
						Static219.method6545(Static544.aClass1_Sub22_Sub1_1.anInt5429, false, -1, -1);
					}
					return;
				}
				if (arg0 == 5302) {
					@Pc(2812) Class308[] local2812 = Static458.method6488();
					anIntArray298[anInt3171++] = local2812.length;
					return;
				}
				if (arg0 == 5303) {
					local157 = anIntArray298[--anInt3171];
					@Pc(2836) Class308[] local2836 = Static458.method6488();
					anIntArray298[anInt3171++] = local2836[local157].anInt8790;
					anIntArray298[anInt3171++] = local2836[local157].anInt8789;
					return;
				}
				if (arg0 == 5305) {
					local157 = Static544.aClass1_Sub22_Sub1_1.anInt5455;
					local707 = Static544.aClass1_Sub22_Sub1_1.anInt5456;
					local89 = -1;
					@Pc(2873) Class308[] local2873 = Static458.method6488();
					for (local2728 = 0; local2728 < local2873.length; local2728++) {
						@Pc(2880) Class308 local2880 = local2873[local2728];
						if (local2880.anInt8790 == local157 && local2880.anInt8789 == local707) {
							local89 = local2728;
							break;
						}
					}
					anIntArray298[anInt3171++] = local89;
					return;
				}
				if (arg0 == 5306) {
					anIntArray298[anInt3171++] = Static306.method4842();
					return;
				}
				if (arg0 == 5307) {
					local157 = anIntArray298[--anInt3171];
					if (local157 >= 1 && local157 <= 2) {
						Static219.method6545(local157, false, -1, -1);
						return;
					}
					return;
				}
				if (arg0 == 5308) {
					anIntArray298[anInt3171++] = Static544.aClass1_Sub22_Sub1_1.anInt5429;
					return;
				}
				if (arg0 == 5309) {
					local157 = anIntArray298[--anInt3171];
					if (local157 >= 1 && local157 <= 2) {
						Static544.aClass1_Sub22_Sub1_1.anInt5429 = local157;
						Static544.aClass1_Sub22_Sub1_1.method4660(Static466.aClass102_4);
						return;
					}
					return;
				}
			} else if (arg0 < 5500) {
				if (arg0 == 5400) {
					anInt3178 -= 2;
					local75 = aStringArray17[anInt3178];
					local81 = aStringArray17[anInt3178 + 1];
					local89 = anIntArray298[--anInt3171];
					Static144.method2331(Static34.aClass296_46);
					Static455.aClass1_Sub6_Sub2_2.method3937(Static282.method6464(local75) + Static282.method6464(local81) + 1);
					Static455.aClass1_Sub6_Sub2_2.method3917(local75);
					Static455.aClass1_Sub6_Sub2_2.method3917(local81);
					Static455.aClass1_Sub6_Sub2_2.method3937(local89);
					return;
				}
				if (arg0 == 5401) {
					anInt3171 -= 2;
					Static283.aShortArray93[anIntArray298[anInt3171]] = (short) Static441.method6334(anIntArray298[anInt3171 + 1]);
					Static342.aClass250_2.method5975();
					Static342.aClass250_2.method5977();
					Static538.aClass242_2.method5838();
					Static299.method4748();
					return;
				}
				if (arg0 == 5405) {
					anInt3171 -= 2;
					local157 = anIntArray298[anInt3171];
					local707 = anIntArray298[anInt3171 + 1];
					if (local157 >= 0 && local157 < 2) {
						Static197.anIntArrayArrayArray21[local157] = new int[local707 << 1][4];
					}
					return;
				}
				if (arg0 == 5406) {
					anInt3171 -= 7;
					local157 = anIntArray298[anInt3171];
					local707 = anIntArray298[anInt3171 + 1] << 1;
					local89 = anIntArray298[anInt3171 + 2];
					local95 = anIntArray298[anInt3171 + 3];
					local2728 = anIntArray298[anInt3171 + 4];
					@Pc(3148) int local3148 = anIntArray298[anInt3171 + 5];
					@Pc(3154) int local3154 = anIntArray298[anInt3171 + 6];
					if (local157 >= 0 && local157 < 2 && Static197.anIntArrayArrayArray21[local157] != null && local707 >= 0 && local707 < Static197.anIntArrayArrayArray21[local157].length) {
						Static197.anIntArrayArrayArray21[local157][local707] = new int[] { (local89 >> 14 & 0x3FFF) << 9, local95 << 2, (local89 & 0x3FFF) << 9, local3154 };
						Static197.anIntArrayArrayArray21[local157][local707 + 1] = new int[] { (local2728 >> 14 & 0x3FFF) << 9, local3148 << 2, (local2728 & 0x3FFF) << 9 };
					}
					return;
				}
				if (arg0 == 5407) {
					local157 = Static197.anIntArrayArrayArray21[anIntArray298[--anInt3171]].length >> 1;
					anIntArray298[anInt3171++] = local157;
					return;
				}
				if (arg0 == 5411) {
					if (Static193.aFrame8 != null) {
						Static219.method6545(Static544.aClass1_Sub22_Sub1_1.anInt5429, false, -1, -1);
					}
					if (Static224.aFrame6 != null) {
						Static82.method3794();
						System.exit(0);
						return;
					}
					local75 = Static517.aString79 == null ? Static149.method2370() : Static517.aString79;
					Static324.method5019(local75, Static374.anInt6861 == 1, false, Static466.aClass102_4);
					return;
				}
				if (arg0 == 5419) {
					local75 = "";
					if (Static528.aClass157_9 != null) {
						if (Static528.aClass157_9.anObject12 == null) {
							local75 = Static142.method2302(Static528.aClass157_9.anInt4740);
						} else {
							local75 = (String) Static528.aClass157_9.anObject12;
						}
					}
					aStringArray17[anInt3178++] = local75;
					return;
				}
				if (arg0 == 5420) {
					anIntArray298[anInt3171++] = Static151.anInt2788 == 3 ? 1 : 0;
					return;
				}
				if (arg0 == 5421) {
					if (Static193.aFrame8 != null) {
						Static219.method6545(Static544.aClass1_Sub22_Sub1_1.anInt5429, false, -1, -1);
					}
					local75 = aStringArray17[--anInt3178];
					local1391 = anIntArray298[--anInt3171] == 1;
					local163 = Static149.method2370() + local75;
					Static324.method5019(local163, Static374.anInt6861 == 1, local1391, Static466.aClass102_4);
					return;
				}
				if (arg0 == 5422) {
					anInt3178 -= 2;
					local75 = aStringArray17[anInt3178];
					local81 = aStringArray17[anInt3178 + 1];
					local89 = anIntArray298[--anInt3171];
					if (local75.length() > 0) {
						if (Static430.aStringArray34 == null) {
							Static430.aStringArray34 = new String[Static427.anIntArray710[Static304.aClass101_1.anInt2782]];
						}
						Static430.aStringArray34[local89] = local75;
					}
					if (local81.length() > 0) {
						if (Static162.aStringArray14 == null) {
							Static162.aStringArray14 = new String[Static427.anIntArray710[Static304.aClass101_1.anInt2782]];
						}
						Static162.aStringArray14[local89] = local81;
					}
					return;
				}
				if (arg0 == 5423) {
					System.out.println(aStringArray17[--anInt3178]);
					return;
				}
				if (arg0 == 5424) {
					anInt3171 -= 11;
					Static410.anInt7286 = anIntArray298[anInt3171];
					Static208.anInt4064 = anIntArray298[anInt3171 + 1];
					Static392.anInt7065 = anIntArray298[anInt3171 + 2];
					Static517.anInt8701 = anIntArray298[anInt3171 + 3];
					Static437.anInt7563 = anIntArray298[anInt3171 + 4];
					Static292.anInt8891 = anIntArray298[anInt3171 + 5];
					Static511.anInt8620 = anIntArray298[anInt3171 + 6];
					Static129.anInt2570 = anIntArray298[anInt3171 + 7];
					Static97.anInt1966 = anIntArray298[anInt3171 + 8];
					Static193.anInt7227 = anIntArray298[anInt3171 + 9];
					Static419.anInt7360 = anIntArray298[anInt3171 + 10];
					Static543.aClass171_154.method4327(Static437.anInt7563);
					Static543.aClass171_154.method4327(Static292.anInt8891);
					Static543.aClass171_154.method4327(Static511.anInt8620);
					Static543.aClass171_154.method4327(Static129.anInt2570);
					Static543.aClass171_154.method4327(Static97.anInt1966);
					Static113.aClass2_12 = null;
					Static545.aClass2_51 = null;
					Static133.aClass2_16 = null;
					Static350.aClass2_36 = null;
					Static457.aClass2_45 = null;
					Static114.aClass2_13 = null;
					Static357.aClass2_37 = null;
					Static266.aClass2_50 = null;
					Static541.aBoolean640 = true;
					return;
				}
				if (arg0 == 5425) {
					Static68.method1246();
					Static541.aBoolean640 = false;
					return;
				}
				if (arg0 == 5426) {
					anInt3171 -= 2;
					Static457.anInt7785 = anIntArray298[anInt3171];
					Class145_Sub2.lb = anIntArray298[anInt3171 + 1];
					return;
				}
				if (arg0 == 5427) {
					anInt3171 -= 2;
					Static221.anInt4390 = anIntArray298[anInt3171 + 1];
					return;
				}
				if (arg0 == 5428) {
					anInt3171 -= 2;
					local157 = anIntArray298[anInt3171];
					local707 = anIntArray298[anInt3171 + 1];
					anIntArray298[anInt3171++] = Static540.method7515(local157, local707) ? 1 : 0;
					return;
				}
				if (arg0 == 5429) {
					Static314.method4912(aStringArray17[--anInt3178], false, false);
					return;
				}
				if (arg0 == 5430) {
					try {
						Static557.method5219("accountcreated", Static466.aClass102_4.anApplet1);
						return;
					} catch (@Pc(3687) Throwable local3687) {
						return;
					}
				}
				if (arg0 == 5431) {
					try {
						Static557.method5219("accountcreatestarted", Static466.aClass102_4.anApplet1);
						return;
					} catch (@Pc(3699) Throwable local3699) {
						return;
					}
				}
			} else if (arg0 < 5600) {
				if (arg0 == 5500) {
					anInt3171 -= 4;
					local157 = anIntArray298[anInt3171];
					local707 = anIntArray298[anInt3171 + 1];
					local89 = anIntArray298[anInt3171 + 2];
					local95 = anIntArray298[anInt3171 + 3];
					Static265.method4395(local95, (local157 & 0x3FFF) - Static534.anInt9007, false, local707 << 2, (local157 >> 14 & 0x3FFF) - Static470.anInt7897, local89);
					return;
				}
				if (arg0 == 5501) {
					anInt3171 -= 4;
					local157 = anIntArray298[anInt3171];
					local707 = anIntArray298[anInt3171 + 1];
					local89 = anIntArray298[anInt3171 + 2];
					local95 = anIntArray298[anInt3171 + 3];
					Static336.method5113(local89, local95, (local157 & 0x3FFF) - Static534.anInt9007, (local157 >> 14 & 0x3FFF) - Static470.anInt7897, local707 << 2);
					return;
				}
				if (arg0 == 5502) {
					anInt3171 -= 6;
					local157 = anIntArray298[anInt3171];
					if (local157 >= 2) {
						throw new RuntimeException();
					}
					Static259.anInt5038 = local157;
					local707 = anIntArray298[anInt3171 + 1];
					if (local707 + 1 >= Static197.anIntArrayArrayArray21[Static259.anInt5038].length >> 1) {
						throw new RuntimeException();
					}
					Static157.anInt4563 = local707;
					Static261.anInt2342 = 0;
					Static373.anInt1269 = anIntArray298[anInt3171 + 2];
					Static338.anInt6065 = anIntArray298[anInt3171 + 3];
					local89 = anIntArray298[anInt3171 + 4];
					if (local89 >= 2) {
						throw new RuntimeException();
					}
					Static54.anInt1079 = local89;
					local95 = anIntArray298[anInt3171 + 5];
					if (local95 + 1 >= Static197.anIntArrayArrayArray21[Static54.anInt1079].length >> 1) {
						throw new RuntimeException();
					}
					Static437.anInt7566 = local95;
					Static448.anInt7701 = 3;
					return;
				}
				if (arg0 == 5503) {
					Static241.method4170();
					return;
				}
				if (arg0 == 5504) {
					anInt3171 -= 2;
					Static87.method1482(anIntArray298[anInt3171], anIntArray298[anInt3171 + 1]);
					return;
				}
				if (arg0 == 5505) {
					anIntArray298[anInt3171++] = (int) Static50.aFloat13 >> 3;
					return;
				}
				if (arg0 == 5506) {
					anIntArray298[anInt3171++] = (int) Static404.aFloat156 >> 3;
					return;
				}
				if (arg0 == 5507) {
					Static483.method6629();
					return;
				}
				if (arg0 == 5508) {
					Static511.method7066();
					return;
				}
				if (arg0 == 5509) {
					Static236.method4129();
					return;
				}
				if (arg0 == 5510) {
					Static150.method2372();
					return;
				}
				if (arg0 == 5511) {
					local157 = anIntArray298[--anInt3171];
					local707 = local157 >> 14 & 0x3FFF;
					local89 = local157 & 0x3FFF;
					local707 -= Static470.anInt7897;
					if (local707 < 0) {
						local707 = 0;
					} else if (local707 >= Static459.anInt7799) {
						local707 = Static459.anInt7799;
					}
					local89 -= Static534.anInt9007;
					if (local89 < 0) {
						local89 = 0;
					} else if (local89 >= Static482.anInt7990) {
						local89 = Static482.anInt7990;
					}
					Static308.anInt5706 = (local707 << 9) + 256;
					Static88.anInt1782 = (local89 << 9) + 256;
					Static448.anInt7701 = 4;
					return;
				}
				if (arg0 == 5512) {
					Static164.method2530();
					return;
				}
			} else if (arg0 < 5700) {
				if (arg0 == 5600) {
					anInt3178 -= 2;
					local75 = aStringArray17[anInt3178];
					local81 = aStringArray17[anInt3178 + 1];
					local89 = anIntArray298[--anInt3171];
					if (Static268.anInt5100 != 2) {
						return;
					}
					if (Static250.anInt4901 == 0 && Static179.anInt3165 == 0) {
						Static328.aString55 = local75;
						Static308.aString52 = local81;
						Static418.anInt7355 = local89;
						Static85.method1463(5);
						return;
					}
					return;
				}
				if (arg0 == 5601) {
					Static300.method4756();
					return;
				}
				if (arg0 == 5602) {
					if (Static250.anInt4901 == 0) {
						Static398.anInt7152 = -2;
						Static430.anInt6478 = -2;
					}
					return;
				}
				if (arg0 == 5603) {
					anInt3171 -= 4;
					if (Static268.anInt5100 != 2) {
						return;
					}
					if (Static250.anInt4901 == 0 && Static179.anInt3165 == 0) {
						Static333.method7511(anIntArray298[anInt3171], anIntArray298[anInt3171 + 2], anIntArray298[anInt3171 + 1], anIntArray298[anInt3171 + 3]);
						return;
					}
					return;
				}
				if (arg0 == 5604) {
					anInt3178--;
					if (Static268.anInt5100 != 2) {
						return;
					}
					if (Static250.anInt4901 == 0 && Static179.anInt3165 == 0) {
						Static17.method472(Static259.method4365(aStringArray17[anInt3178]));
						return;
					}
					return;
				}
				if (arg0 == 5605) {
					anInt3178 -= 2;
					if (Static268.anInt5100 != 2) {
						return;
					}
					if (Static250.anInt4901 == 0 && Static179.anInt3165 == 0) {
						Static399.method6027(aStringArray17[anInt3178 + 1], Static259.method4365(aStringArray17[anInt3178]), false);
						return;
					}
					return;
				}
				if (arg0 == 5606) {
					if (Static179.anInt3165 == 0) {
						Static270.anInt5118 = -2;
					}
					return;
				}
				if (arg0 == 5607) {
					anIntArray298[anInt3171++] = Static430.anInt6478;
					return;
				}
				if (arg0 == 5608) {
					anIntArray298[anInt3171++] = Static5.anInt107;
					return;
				}
				if (arg0 == 5609) {
					anIntArray298[anInt3171++] = Static270.anInt5118;
					return;
				}
				if (arg0 == 5610) {
					for (local157 = 0; local157 < 5; local157++) {
						aStringArray17[anInt3178++] = Static147.aStringArray13.length > local157 ? Static541.method7521(Static147.aStringArray13[local157]) : "";
					}
					Static147.aStringArray13 = null;
					return;
				}
				if (arg0 == 5611) {
					anIntArray298[anInt3171++] = Static427.anInt7473;
					return;
				}
				if (arg0 == 5612) {
					local157 = anIntArray298[--anInt3171];
					if (Static268.anInt5100 != 6) {
						return;
					}
					if (Static250.anInt4901 == 0 && Static179.anInt3165 == 0) {
						if (Static402.aClass56_2 != null) {
							Static402.aClass56_2.method1312();
							Static402.aClass56_2 = null;
						}
						Static418.anInt7355 = local157;
						Static85.method1463(8);
						return;
					}
					return;
				}
				if (arg0 == 5613) {
					anIntArray298[anInt3171++] = Static430.anInt6478;
					return;
				}
				if (arg0 == 5615) {
					anInt3178 -= 2;
					local75 = aStringArray17[anInt3178];
					local81 = aStringArray17[anInt3178 + 1];
					if (Static268.anInt5100 != 2) {
						return;
					}
					if (Static250.anInt4901 == 0 && Static179.anInt3165 == 0) {
						if (Static402.aClass56_2 != null) {
							Static402.aClass56_2.method1312();
							Static402.aClass56_2 = null;
						}
						Static328.aString55 = local75;
						Static308.aString52 = local81;
						Static85.method1463(4);
						return;
					}
					return;
				}
				if (arg0 == 5616) {
					Static123.method2107(false);
					return;
				}
				if (arg0 == 5617) {
					anIntArray298[anInt3171++] = Static398.anInt7152;
					return;
				}
				if (arg0 == 5618) {
					local157 = anIntArray298[--anInt3171];
					Static59.method1114(false, local157);
					return;
				}
				if (arg0 == 5619) {
					local157 = anIntArray298[--anInt3171];
					Static59.method1114(true, local157);
					return;
				}
				if (arg0 == 5620) {
					Static154.method2421();
					if (Static6.aString3 != "" && Static6.aString3 != "") {
						anIntArray298[anInt3171++] = 1;
						return;
					}
					anIntArray298[anInt3171++] = 0;
					return;
				}
				if (arg0 == 5621) {
					anInt3178 -= 2;
					if (Static268.anInt5100 != 2) {
						return;
					}
					if (Static250.anInt4901 == 0 && Static179.anInt3165 == 0) {
						Static399.method6027(aStringArray17[anInt3178 + 1], Static259.method4365(aStringArray17[anInt3178]), true);
						return;
					}
					return;
				}
				if (arg0 == 5622) {
					@Pc(4493) Class157 local4493 = Static466.aClass102_4.method2388(false, "3");
					while (local4493.anInt4742 == 0) {
						Static209.method3565(1L);
					}
					if (local4493.anInt4742 == 2) {
						throw new RuntimeException("Error opening file");
					}
					@Pc(4513) Class177 local4513 = (Class177) local4493.anObject12;
					if (local4513.method4407().exists()) {
						@Pc(4523) Class1_Sub6 local4523 = new Class1_Sub6(50);
						try {
							local4513.method4408(50, local4523.aByteArray66, 0);
						} catch (@Pc(4532) IOException local4532) {
						}
					}
					try {
						local4513.method4411();
						return;
					} catch (@Pc(4538) Exception local4538) {
						return;
					}
				}
				if (arg0 == 5623) {
					if (Static306.aString51 != null) {
						anIntArray298[anInt3171++] = 1;
						return;
					}
					anIntArray298[anInt3171++] = 0;
					return;
				}
			} else if (arg0 < 6100) {
				if (arg0 == 6001) {
					local157 = anIntArray298[--anInt3171];
					if (local157 < 1) {
						local157 = 1;
					}
					if (local157 > 4) {
						local157 = 4;
					}
					Static544.aClass1_Sub22_Sub1_1.anInt5447 = local157;
					Static419.method6151();
					Static544.aClass1_Sub22_Sub1_1.method4660(Static466.aClass102_4);
					Static375.aBoolean499 = false;
					return;
				}
				if (arg0 == 6002) {
					Static544.aClass1_Sub22_Sub1_1.method4671(anIntArray298[--anInt3171] == 1);
					Static419.method6151();
					Static486.method6643();
					Static544.aClass1_Sub22_Sub1_1.method4660(Static466.aClass102_4);
					Static375.aBoolean499 = false;
					return;
				}
				if (arg0 == 6003) {
					Static544.aClass1_Sub22_Sub1_1.aBoolean393 = anIntArray298[--anInt3171] == 1;
					Static486.method6643();
					Static544.aClass1_Sub22_Sub1_1.method4660(Static466.aClass102_4);
					Static375.aBoolean499 = false;
					return;
				}
				if (arg0 == 6005) {
					Static544.aClass1_Sub22_Sub1_1.aBoolean380 = anIntArray298[--anInt3171] == 1;
					Static419.method6151();
					Static544.aClass1_Sub22_Sub1_1.method4660(Static466.aClass102_4);
					Static375.aBoolean499 = false;
					return;
				}
				if (arg0 == 6006) {
					Static544.aClass1_Sub22_Sub1_1.aBoolean395 = anIntArray298[--anInt3171] == 1;
					Static513.aClass122_10.method7272(!Static544.aClass1_Sub22_Sub1_1.aBoolean395);
					Static544.aClass1_Sub22_Sub1_1.method4660(Static466.aClass102_4);
					Static375.aBoolean499 = false;
					return;
				}
				if (arg0 == 6007) {
					Static544.aClass1_Sub22_Sub1_1.anInt5449 = anIntArray298[--anInt3171];
					Static544.aClass1_Sub22_Sub1_1.method4660(Static466.aClass102_4);
					Static375.aBoolean499 = false;
					return;
				}
				if (arg0 == 6008) {
					Static544.aClass1_Sub22_Sub1_1.aBoolean379 = anIntArray298[--anInt3171] == 1;
					Static544.aClass1_Sub22_Sub1_1.method4660(Static466.aClass102_4);
					Static375.aBoolean499 = false;
					return;
				}
				if (arg0 == 6009) {
					Static544.aClass1_Sub22_Sub1_1.aBoolean388 = anIntArray298[--anInt3171] == 1;
					Static419.method6151();
					Static544.aClass1_Sub22_Sub1_1.method4660(Static466.aClass102_4);
					Static375.aBoolean499 = false;
					return;
				}
				if (arg0 == 6010) {
					Static544.aClass1_Sub22_Sub1_1.aBoolean394 = anIntArray298[--anInt3171] == 1;
					Static544.aClass1_Sub22_Sub1_1.method4660(Static466.aClass102_4);
					Static375.aBoolean499 = false;
					return;
				}
				if (arg0 == 6011) {
					local157 = anIntArray298[--anInt3171];
					if (local157 < 0 || local157 > 2) {
						local157 = 0;
					}
					Static544.aClass1_Sub22_Sub1_1.method4647(local157, Static374.anInt6861);
					Static419.method6151();
					Static544.aClass1_Sub22_Sub1_1.method4660(Static466.aClass102_4);
					Static375.aBoolean499 = false;
					return;
				}
				if (arg0 == 6012) {
					Static544.aClass1_Sub22_Sub1_1.method4651(Static374.anInt6861, anIntArray298[--anInt3171] == 1);
					Static205.method3533();
					Static283.method4575();
					Static544.aClass1_Sub22_Sub1_1.method4660(Static466.aClass102_4);
					Static375.aBoolean499 = false;
					return;
				}
				if (arg0 == 6014) {
					Static544.aClass1_Sub22_Sub1_1.aBoolean392 = anIntArray298[--anInt3171] == 1;
					Static419.method6151();
					Static544.aClass1_Sub22_Sub1_1.method4660(Static466.aClass102_4);
					Static375.aBoolean499 = false;
					return;
				}
				if (arg0 == 6015) {
					Static544.aClass1_Sub22_Sub1_1.aBoolean391 = anIntArray298[--anInt3171] == 1;
					Static419.method6151();
					Static544.aClass1_Sub22_Sub1_1.method4660(Static466.aClass102_4);
					Static375.aBoolean499 = false;
					return;
				}
				if (arg0 == 6016) {
					local157 = anIntArray298[--anInt3171];
					if (local157 < 0 || local157 > 2) {
						local157 = 0;
					}
					Static544.aClass1_Sub22_Sub1_1.anInt5445 = local157;
					Static390.method4905(Static374.anInt6861);
					Static544.aClass1_Sub22_Sub1_1.method4660(Static466.aClass102_4);
					return;
				}
				if (arg0 == 6017) {
					Static544.aClass1_Sub22_Sub1_1.aBoolean381 = anIntArray298[--anInt3171] == 1;
					Static66.method1183();
					Static544.aClass1_Sub22_Sub1_1.method4660(Static466.aClass102_4);
					Static375.aBoolean499 = false;
					return;
				}
				if (arg0 == 6018) {
					local157 = anIntArray298[--anInt3171];
					if (local157 < 0) {
						local157 = 0;
					}
					if (local157 > 127) {
						local157 = 127;
					}
					Static544.aClass1_Sub22_Sub1_1.anInt5444 = local157;
					Static544.aClass1_Sub22_Sub1_1.method4660(Static466.aClass102_4);
					Static375.aBoolean499 = false;
					return;
				}
				if (arg0 == 6019) {
					local157 = anIntArray298[--anInt3171];
					if (local157 < 0) {
						local157 = 0;
					}
					if (local157 > 255) {
						local157 = 255;
					}
					if (local157 != Static544.aClass1_Sub22_Sub1_1.anInt5439) {
						if (Static544.aClass1_Sub22_Sub1_1.anInt5439 == 0 && Static507.anInt8581 != -1) {
							Static71.method1273(Static235.aClass171_78, local157, Static507.anInt8581);
							Static316.aBoolean424 = false;
						} else if (local157 == 0) {
							Static458.method6479();
							Static316.aBoolean424 = false;
						} else {
							Static428.method6266(local157);
						}
						Static544.aClass1_Sub22_Sub1_1.anInt5439 = local157;
					}
					Static544.aClass1_Sub22_Sub1_1.method4660(Static466.aClass102_4);
					Static375.aBoolean499 = false;
					return;
				}
				if (arg0 == 6020) {
					local157 = anIntArray298[--anInt3171];
					if (local157 < 0) {
						local157 = 0;
					}
					if (local157 > 127) {
						local157 = 127;
					}
					Static544.aClass1_Sub22_Sub1_1.anInt5431 = local157;
					Static544.aClass1_Sub22_Sub1_1.method4660(Static466.aClass102_4);
					Static375.aBoolean499 = false;
					return;
				}
				if (arg0 == 6021) {
					Static544.aClass1_Sub22_Sub1_1.aBoolean399 = anIntArray298[--anInt3171] == 1;
					Static486.method6643();
					return;
				}
				if (arg0 == 6023) {
					local157 = anIntArray298[--anInt3171];
					local1391 = false;
					if (local157 < 0) {
						local157 = 0;
					}
					if (local157 > 2) {
						local157 = 2;
					}
					if (Static17.anInt454 < 96) {
						local157 = 0;
						local1391 = true;
					}
					Static26.method592(local157);
					Static544.aClass1_Sub22_Sub1_1.method4660(Static466.aClass102_4);
					Static375.aBoolean499 = false;
					anIntArray298[anInt3171++] = local1391 ? 0 : 1;
					return;
				}
				if (arg0 == 6024) {
					local157 = anIntArray298[--anInt3171];
					if (local157 < 0 || local157 > 2) {
						local157 = 0;
					}
					Static544.aClass1_Sub22_Sub1_1.anInt5443 = local157;
					Static544.aClass1_Sub22_Sub1_1.method4660(Static466.aClass102_4);
					return;
				}
				if (arg0 == 6025) {
					local157 = anIntArray298[--anInt3171];
					if (local157 < 0 || local157 > Static238.method5129(Static17.anInt454)) {
						local157 = 0;
					}
					Static544.aClass1_Sub22_Sub1_1.anInt5450 = local157;
					Static544.aClass1_Sub22_Sub1_1.method4660(Static466.aClass102_4);
					Static375.aBoolean499 = false;
					return;
				}
				if (arg0 == 6027) {
					local157 = anIntArray298[--anInt3171];
					if (local157 < 0 || local157 > 1) {
						local157 = 0;
					}
					Static336.method5121(local157 == 1);
					return;
				}
				if (arg0 == 6028) {
					Static544.aClass1_Sub22_Sub1_1.aBoolean390 = anIntArray298[--anInt3171] != 0;
					Static544.aClass1_Sub22_Sub1_1.method4660(Static466.aClass102_4);
					return;
				}
				if (arg0 == 6029) {
					Static544.aClass1_Sub22_Sub1_1.anInt5449 = anIntArray298[--anInt3171];
					Static544.aClass1_Sub22_Sub1_1.method4660(Static466.aClass102_4);
					return;
				}
				if (arg0 == 6030) {
					Static544.aClass1_Sub22_Sub1_1.aBoolean383 = anIntArray298[--anInt3171] != 0;
					Static544.aClass1_Sub22_Sub1_1.method4660(Static466.aClass102_4);
					Static419.method6151();
					return;
				}
				if (arg0 == 6031) {
					local157 = anIntArray298[--anInt3171];
					if (local157 < 0 || local157 > 5) {
						local157 = 2;
					}
					Static390.method4905(local157);
					return;
				}
				if (arg0 == 6032) {
					local157 = anIntArray298[--anInt3171];
					if (local157 < 0 || local157 > 5) {
						local157 = 2;
					}
					Static544.aClass1_Sub22_Sub1_1.anInt5437 = local157;
					Static544.aClass1_Sub22_Sub1_1.method4660(Static466.aClass102_4);
					Static375.aBoolean499 = false;
					return;
				}
				if (arg0 == 6033) {
					local157 = anIntArray298[--anInt3171];
					if (local157 < 0 || local157 > 4) {
						local157 = 2;
					}
					Static544.aClass1_Sub22_Sub1_1.anInt5435 = local157;
					Static544.aClass1_Sub22_Sub1_1.method4660(Static466.aClass102_4);
					return;
				}
				if (arg0 == 6034) {
					Static544.aClass1_Sub22_Sub1_1.aBoolean396 = anIntArray298[--anInt3171] == 1;
					Static544.aClass1_Sub22_Sub1_1.method4660(Static466.aClass102_4);
					Static205.method3533();
					Static375.aBoolean499 = false;
					return;
				}
				if (arg0 == 6035) {
					Static544.aClass1_Sub22_Sub1_1.aBoolean401 = anIntArray298[--anInt3171] == 1;
					Static419.method6151();
					Static486.method6643();
					return;
				}
			} else if (arg0 < 6200) {
				if (arg0 == 6101) {
					anIntArray298[anInt3171++] = Static544.aClass1_Sub22_Sub1_1.anInt5447;
					return;
				}
				if (arg0 == 6102) {
					anIntArray298[anInt3171++] = Static544.aClass1_Sub22_Sub1_1.method4673(Static374.anInt6861) ? 1 : 0;
					return;
				}
				if (arg0 == 6103) {
					anIntArray298[anInt3171++] = Static544.aClass1_Sub22_Sub1_1.aBoolean393 ? 1 : 0;
					return;
				}
				if (arg0 == 6105) {
					anIntArray298[anInt3171++] = Static544.aClass1_Sub22_Sub1_1.aBoolean380 ? 1 : 0;
					return;
				}
				if (arg0 == 6106) {
					anIntArray298[anInt3171++] = Static544.aClass1_Sub22_Sub1_1.aBoolean395 ? 1 : 0;
					return;
				}
				if (arg0 == 6107) {
					anIntArray298[anInt3171++] = Static544.aClass1_Sub22_Sub1_1.anInt5449;
					return;
				}
				if (arg0 == 6108) {
					anIntArray298[anInt3171++] = Static544.aClass1_Sub22_Sub1_1.aBoolean379 ? 1 : 0;
					return;
				}
				if (arg0 == 6109) {
					anIntArray298[anInt3171++] = Static544.aClass1_Sub22_Sub1_1.aBoolean388 ? 1 : 0;
					return;
				}
				if (arg0 == 6110) {
					anIntArray298[anInt3171++] = Static544.aClass1_Sub22_Sub1_1.aBoolean394 ? 1 : 0;
					return;
				}
				if (arg0 == 6111) {
					anIntArray298[anInt3171++] = Static544.aClass1_Sub22_Sub1_1.method4655(Static374.anInt6861);
					return;
				}
				if (arg0 == 6112) {
					anIntArray298[anInt3171++] = Static544.aClass1_Sub22_Sub1_1.method4648(Static374.anInt6861) ? 1 : 0;
					return;
				}
				if (arg0 == 6114) {
					anIntArray298[anInt3171++] = Static544.aClass1_Sub22_Sub1_1.aBoolean392 ? 1 : 0;
					return;
				}
				if (arg0 == 6115) {
					anIntArray298[anInt3171++] = Static544.aClass1_Sub22_Sub1_1.aBoolean391 ? 1 : 0;
					return;
				}
				if (arg0 == 6116) {
					anIntArray298[anInt3171++] = Static544.aClass1_Sub22_Sub1_1.anInt5445;
					return;
				}
				if (arg0 == 6117) {
					anIntArray298[anInt3171++] = Static544.aClass1_Sub22_Sub1_1.aBoolean381 ? 1 : 0;
					return;
				}
				if (arg0 == 6118) {
					anIntArray298[anInt3171++] = Static544.aClass1_Sub22_Sub1_1.anInt5444;
					return;
				}
				if (arg0 == 6119) {
					anIntArray298[anInt3171++] = Static544.aClass1_Sub22_Sub1_1.anInt5439;
					return;
				}
				if (arg0 == 6120) {
					anIntArray298[anInt3171++] = Static544.aClass1_Sub22_Sub1_1.anInt5431;
					return;
				}
				if (arg0 == 6121) {
					anIntArray298[anInt3171++] = Static513.aClass122_10.method7279() ? 1 : 0;
					return;
				}
				if (arg0 == 6123) {
					anIntArray298[anInt3171++] = Static330.method5083();
					return;
				}
				if (arg0 == 6124) {
					anIntArray298[anInt3171++] = Static544.aClass1_Sub22_Sub1_1.anInt5443;
					return;
				}
				if (arg0 == 6125) {
					anIntArray298[anInt3171++] = Static544.aClass1_Sub22_Sub1_1.anInt5450;
					return;
				}
				if (arg0 == 6126) {
					anIntArray298[anInt3171++] = Static513.aClass122_10.method7244() ? 1 : 0;
					return;
				}
				if (arg0 == 6127) {
					anIntArray298[anInt3171++] = Static544.aClass1_Sub22_Sub1_1.aBoolean387 ? 1 : 0;
					return;
				}
				if (arg0 == 6128) {
					anIntArray298[anInt3171++] = Static544.aClass1_Sub22_Sub1_1.aBoolean390 ? 1 : 0;
					return;
				}
				if (arg0 == 6129) {
					anIntArray298[anInt3171++] = Static544.aClass1_Sub22_Sub1_1.anInt5449;
					return;
				}
				if (arg0 == 6130) {
					anIntArray298[anInt3171++] = Static544.aClass1_Sub22_Sub1_1.aBoolean383 ? 1 : 0;
					return;
				}
				if (arg0 == 6131) {
					anIntArray298[anInt3171++] = Static374.anInt6861;
					return;
				}
				if (arg0 == 6132) {
					anIntArray298[anInt3171++] = Static544.aClass1_Sub22_Sub1_1.anInt5437;
					return;
				}
				if (arg0 == 6133) {
					anIntArray298[anInt3171++] = Static151.anInt2788 == 1 || Static151.anInt2788 == 4 ? 1 : 0;
					return;
				}
				if (arg0 == 6134) {
					anIntArray298[anInt3171++] = Static238.method5129(Static17.anInt454);
					return;
				}
				if (arg0 == 6135) {
					anIntArray298[anInt3171++] = Static544.aClass1_Sub22_Sub1_1.anInt5435;
					return;
				}
				if (arg0 == 6136) {
					anIntArray298[anInt3171++] = Static544.aClass1_Sub22_Sub1_1.aBoolean396 ? 1 : 0;
					return;
				}
				if (arg0 == 6137) {
					@Pc(5951) boolean local5951 = true;
					try {
						local5951 = jagmisc.getTotalPhysicalMemory() > 268435456L;
					} catch (@Pc(5961) Throwable local5961) {
					}
					anIntArray298[anInt3171++] = local5951 ? 1 : 0;
					return;
				}
			} else if (arg0 < 6300) {
				if (arg0 == 6200) {
					anInt3171 -= 2;
					Static498.aShort131 = (short) anIntArray298[anInt3171];
					if (Static498.aShort131 <= 0) {
						Static498.aShort131 = 256;
					}
					Static299.aShort97 = (short) anIntArray298[anInt3171 + 1];
					if (Static299.aShort97 <= 0) {
						Static299.aShort97 = 205;
					}
					return;
				}
				if (arg0 == 6201) {
					anInt3171 -= 2;
					Static533.aShort134 = (short) anIntArray298[anInt3171];
					if (Static533.aShort134 <= 0) {
						Static533.aShort134 = 256;
					}
					Static268.aShort87 = (short) anIntArray298[anInt3171 + 1];
					if (Static268.aShort87 <= 0) {
						Static268.aShort87 = 320;
					}
					return;
				}
				if (arg0 == 6202) {
					anInt3171 -= 4;
					Static146.aShort39 = (short) anIntArray298[anInt3171];
					if (Static146.aShort39 <= 0) {
						Static146.aShort39 = 1;
					}
					Static109.aShort56 = (short) anIntArray298[anInt3171 + 1];
					if (Static109.aShort56 <= 0) {
						Static109.aShort56 = 32767;
					} else if (Static109.aShort56 < Static146.aShort39) {
						Static109.aShort56 = Static146.aShort39;
					}
					Static154.aShort45 = (short) anIntArray298[anInt3171 + 2];
					if (Static154.aShort45 <= 0) {
						Static154.aShort45 = 1;
					}
					Static148.aShort119 = (short) anIntArray298[anInt3171 + 3];
					if (Static148.aShort119 <= 0) {
						Static148.aShort119 = 32767;
						return;
					}
					if (Static148.aShort119 < Static154.aShort45) {
						Static148.aShort119 = Static154.aShort45;
					}
					return;
				}
				if (arg0 == 6203) {
					Static539.method7502(0, false, Static31.aClass156_1.anInt4673, Static31.aClass156_1.anInt4732, 0);
					anIntArray298[anInt3171++] = Static376.anInt6882;
					anIntArray298[anInt3171++] = Static211.anInt4099;
					return;
				}
				if (arg0 == 6204) {
					anIntArray298[anInt3171++] = Static533.aShort134;
					anIntArray298[anInt3171++] = Static268.aShort87;
					return;
				}
				if (arg0 == 6205) {
					anIntArray298[anInt3171++] = Static498.aShort131;
					anIntArray298[anInt3171++] = Static299.aShort97;
					return;
				}
			} else if (arg0 < 6400) {
				if (arg0 == 6300) {
					anIntArray298[anInt3171++] = (int) (Static60.method1119() / 60000L);
					return;
				}
				if (arg0 == 6301) {
					anIntArray298[anInt3171++] = (int) (Static60.method1119() / 86400000L) - 11745;
					return;
				}
				if (arg0 == 6302) {
					anInt3171 -= 3;
					local157 = anIntArray298[anInt3171];
					local707 = anIntArray298[anInt3171 + 1];
					local89 = anIntArray298[anInt3171 + 2];
					aCalendar1.clear();
					aCalendar1.set(11, 12);
					aCalendar1.set(local89, local707, local157);
					local95 = (int) (aCalendar1.getTime().getTime() / 86400000L) - 11745;
					if (local89 < 1970) {
						local95--;
					}
					anIntArray298[anInt3171++] = local95;
					return;
				}
				if (arg0 == 6303) {
					aCalendar1.clear();
					aCalendar1.setTime(new Date(Static60.method1119()));
					anIntArray298[anInt3171++] = aCalendar1.get(1);
					return;
				}
				if (arg0 == 6304) {
					local157 = anIntArray298[--anInt3171];
					local1391 = true;
					if (local157 < 0) {
						local1391 = (local157 + 1) % 4 == 0;
					} else if (local157 < 1582) {
						local1391 = local157 % 4 == 0;
					} else if (local157 % 4 != 0) {
						local1391 = false;
					} else if (local157 % 100 != 0) {
						local1391 = true;
					} else if (local157 % 400 != 0) {
						local1391 = false;
					}
					anIntArray298[anInt3171++] = local1391 ? 1 : 0;
					return;
				}
			} else if (arg0 < 6500) {
				if (arg0 == 6405) {
					anIntArray298[anInt3171++] = Static298.method4740() ? 1 : 0;
					return;
				}
				if (arg0 == 6406) {
					anIntArray298[anInt3171++] = Static414.method6109() ? 1 : 0;
					return;
				}
			} else if (arg0 < 6600) {
				if (arg0 == 6500) {
					if (Static268.anInt5100 == 6 && Static250.anInt4901 == 0 && Static179.anInt3165 == 0) {
						if (Static333.aBoolean637) {
							anIntArray298[anInt3171++] = 0;
							return;
						}
						if (Static13.aLong21 > Static60.method1119() - 1000L) {
							anIntArray298[anInt3171++] = 1;
							return;
						}
						Static333.aBoolean637 = true;
						Static144.method2331(Static441.aClass296_325);
						Static455.aClass1_Sub6_Sub2_2.method3948(Static253.anInt4947);
						anIntArray298[anInt3171++] = 0;
						return;
					}
					anIntArray298[anInt3171++] = 1;
					return;
				}
				@Pc(6494) Class162 local6494;
				@Pc(6461) Class185_Sub1 local6461;
				if (arg0 == 6501) {
					local6461 = Static80.method1382();
					if (local6461 != null) {
						anIntArray298[anInt3171++] = local6461.anInt7769;
						anIntArray298[anInt3171++] = local6461.anInt7761;
						aStringArray17[anInt3178++] = local6461.aString71;
						local6494 = local6461.method6470();
						anIntArray298[anInt3171++] = local6494.anInt4853;
						aStringArray17[anInt3178++] = local6494.aString46;
						anIntArray298[anInt3171++] = local6461.anInt7763;
						anIntArray298[anInt3171++] = local6461.anInt7771;
						aStringArray17[anInt3178++] = local6461.aString72;
						return;
					}
					anIntArray298[anInt3171++] = -1;
					anIntArray298[anInt3171++] = 0;
					aStringArray17[anInt3178++] = "";
					anIntArray298[anInt3171++] = 0;
					aStringArray17[anInt3178++] = "";
					anIntArray298[anInt3171++] = 0;
					anIntArray298[anInt3171++] = 0;
					aStringArray17[anInt3178++] = "";
					return;
				}
				if (arg0 == 6502) {
					local6461 = Static277.method4517();
					if (local6461 != null) {
						anIntArray298[anInt3171++] = local6461.anInt7769;
						anIntArray298[anInt3171++] = local6461.anInt7761;
						aStringArray17[anInt3178++] = local6461.aString71;
						local6494 = local6461.method6470();
						anIntArray298[anInt3171++] = local6494.anInt4853;
						aStringArray17[anInt3178++] = local6494.aString46;
						anIntArray298[anInt3171++] = local6461.anInt7763;
						anIntArray298[anInt3171++] = local6461.anInt7771;
						aStringArray17[anInt3178++] = local6461.aString72;
						return;
					}
					anIntArray298[anInt3171++] = -1;
					anIntArray298[anInt3171++] = 0;
					aStringArray17[anInt3178++] = "";
					anIntArray298[anInt3171++] = 0;
					aStringArray17[anInt3178++] = "";
					anIntArray298[anInt3171++] = 0;
					anIntArray298[anInt3171++] = 0;
					aStringArray17[anInt3178++] = "";
					return;
				}
				if (arg0 == 6503) {
					local157 = anIntArray298[--anInt3171];
					local81 = aStringArray17[--anInt3178];
					if (Static268.anInt5100 == 6 && Static250.anInt4901 == 0 && Static179.anInt3165 == 0) {
						anIntArray298[anInt3171++] = Static217.method7159(local157, local81) ? 1 : 0;
						return;
					}
					anIntArray298[anInt3171++] = 0;
					return;
				}
				if (arg0 == 6504) {
					Static544.aClass1_Sub22_Sub1_1.anInt5453 = anIntArray298[--anInt3171];
					Static544.aClass1_Sub22_Sub1_1.method4660(Static466.aClass102_4);
					return;
				}
				if (arg0 == 6505) {
					anIntArray298[anInt3171++] = Static544.aClass1_Sub22_Sub1_1.anInt5453;
					return;
				}
				if (arg0 == 6506) {
					local157 = anIntArray298[--anInt3171];
					@Pc(6851) Class185_Sub1 local6851 = Static33.method780(local157);
					if (local6851 != null) {
						anIntArray298[anInt3171++] = local6851.anInt7761;
						aStringArray17[anInt3178++] = local6851.aString71;
						@Pc(6875) Class162 local6875 = local6851.method6470();
						anIntArray298[anInt3171++] = local6875.anInt4853;
						aStringArray17[anInt3178++] = local6875.aString46;
						anIntArray298[anInt3171++] = local6851.anInt7763;
						anIntArray298[anInt3171++] = local6851.anInt7771;
						aStringArray17[anInt3178++] = local6851.aString72;
						return;
					}
					anIntArray298[anInt3171++] = -1;
					aStringArray17[anInt3178++] = "";
					anIntArray298[anInt3171++] = 0;
					aStringArray17[anInt3178++] = "";
					anIntArray298[anInt3171++] = 0;
					anIntArray298[anInt3171++] = 0;
					aStringArray17[anInt3178++] = "";
					return;
				}
				if (arg0 == 6507) {
					anInt3171 -= 4;
					local157 = anIntArray298[anInt3171];
					local1391 = anIntArray298[anInt3171 + 1] == 1;
					local89 = anIntArray298[anInt3171 + 2];
					local2002 = anIntArray298[anInt3171 + 3] == 1;
					Static171.method2606(local157, local1391, local2002, local89);
					return;
				}
				if (arg0 == 6508) {
					Static86.method1468();
					return;
				}
				if (arg0 == 6509) {
					if (Static268.anInt5100 != 6) {
						return;
					}
					Static3.aBoolean5 = anIntArray298[--anInt3171] == 1;
					return;
				}
				if (arg0 == 6510) {
					anIntArray298[anInt3171++] = Static192.anInt3400;
					return;
				}
			} else if (arg0 < 6700) {
				if (arg0 == 6600) {
					Static544.aClass1_Sub22_Sub1_1.aBoolean389 = anIntArray298[--anInt3171] == 1;
					Static544.aClass1_Sub22_Sub1_1.method4660(Static466.aClass102_4);
					return;
				}
				if (arg0 == 6601) {
					anIntArray298[anInt3171++] = Static544.aClass1_Sub22_Sub1_1.aBoolean389 ? 1 : 0;
					return;
				}
			} else if (arg0 < 6800 && Static221.aClass302_2 == Static31.aClass302_1) {
				if (arg0 == 6700) {
					local157 = Static468.aClass17_36.method742();
					if (Static170.anInt3050 != -1) {
						local157++;
					}
					anIntArray298[anInt3171++] = local157;
					return;
				}
				if (arg0 == 6701) {
					local157 = anIntArray298[--anInt3171];
					if (Static170.anInt3050 != -1) {
						if (local157 == 0) {
							anIntArray298[anInt3171++] = Static170.anInt3050;
							return;
						}
						local157--;
					}
					@Pc(7162) Class1_Sub35 local7162 = (Class1_Sub35) Static468.aClass17_36.method735();
					while (local157-- > 0) {
						local7162 = (Class1_Sub35) Static468.aClass17_36.method740();
					}
					anIntArray298[anInt3171++] = local7162.anInt6103;
					return;
				}
				if (arg0 == 6702) {
					local157 = anIntArray298[--anInt3171];
					if (Static396.aClass156ArrayArray1[local157] == null) {
						aStringArray17[anInt3178++] = "";
						return;
					}
					local81 = Static396.aClass156ArrayArray1[local157][0].aString41;
					if (local81 == null) {
						aStringArray17[anInt3178++] = "";
						return;
					}
					aStringArray17[anInt3178++] = local81.substring(0, local81.indexOf(58));
					return;
				}
				if (arg0 == 6703) {
					local157 = anIntArray298[--anInt3171];
					if (Static396.aClass156ArrayArray1[local157] == null) {
						anIntArray298[anInt3171++] = 0;
						return;
					}
					anIntArray298[anInt3171++] = Static396.aClass156ArrayArray1[local157].length;
					return;
				}
				if (arg0 == 6704) {
					anInt3171 -= 2;
					local157 = anIntArray298[anInt3171];
					local707 = anIntArray298[anInt3171 + 1];
					if (Static396.aClass156ArrayArray1[local157] == null) {
						aStringArray17[anInt3178++] = "";
						return;
					}
					local163 = Static396.aClass156ArrayArray1[local157][local707].aString41;
					if (local163 == null) {
						aStringArray17[anInt3178++] = "";
						return;
					}
					aStringArray17[anInt3178++] = local163;
					return;
				}
				if (arg0 == 6705) {
					anInt3171 -= 2;
					local157 = anIntArray298[anInt3171];
					local707 = anIntArray298[anInt3171 + 1];
					if (Static396.aClass156ArrayArray1[local157] == null) {
						anIntArray298[anInt3171++] = 0;
						return;
					}
					anIntArray298[anInt3171++] = Static396.aClass156ArrayArray1[local157][local707].anInt4700;
					return;
				}
				if (arg0 == 6706) {
					return;
				}
				if (arg0 == 6707) {
					anInt3171 -= 3;
					local157 = anIntArray298[anInt3171];
					local707 = anIntArray298[anInt3171 + 1];
					local89 = anIntArray298[anInt3171 + 2];
					Static362.method5401(1, local89, local157 << 16 | local707, "");
					return;
				}
				if (arg0 == 6708) {
					anInt3171 -= 3;
					local157 = anIntArray298[anInt3171];
					local707 = anIntArray298[anInt3171 + 1];
					local89 = anIntArray298[anInt3171 + 2];
					Static362.method5401(2, local89, local157 << 16 | local707, "");
					return;
				}
				if (arg0 == 6709) {
					anInt3171 -= 3;
					local157 = anIntArray298[anInt3171];
					local707 = anIntArray298[anInt3171 + 1];
					local89 = anIntArray298[anInt3171 + 2];
					Static362.method5401(3, local89, local157 << 16 | local707, "");
					return;
				}
				if (arg0 == 6710) {
					anInt3171 -= 3;
					local157 = anIntArray298[anInt3171];
					local707 = anIntArray298[anInt3171 + 1];
					local89 = anIntArray298[anInt3171 + 2];
					Static362.method5401(4, local89, local157 << 16 | local707, "");
					return;
				}
				if (arg0 == 6711) {
					anInt3171 -= 3;
					local157 = anIntArray298[anInt3171];
					local707 = anIntArray298[anInt3171 + 1];
					local89 = anIntArray298[anInt3171 + 2];
					Static362.method5401(5, local89, local157 << 16 | local707, "");
					return;
				}
				if (arg0 == 6712) {
					anInt3171 -= 3;
					local157 = anIntArray298[anInt3171];
					local707 = anIntArray298[anInt3171 + 1];
					local89 = anIntArray298[anInt3171 + 2];
					Static362.method5401(6, local89, local157 << 16 | local707, "");
					return;
				}
				if (arg0 == 6713) {
					anInt3171 -= 3;
					local157 = anIntArray298[anInt3171];
					local707 = anIntArray298[anInt3171 + 1];
					local89 = anIntArray298[anInt3171 + 2];
					Static362.method5401(7, local89, local157 << 16 | local707, "");
					return;
				}
				if (arg0 == 6714) {
					anInt3171 -= 3;
					local157 = anIntArray298[anInt3171];
					local707 = anIntArray298[anInt3171 + 1];
					local89 = anIntArray298[anInt3171 + 2];
					Static362.method5401(8, local89, local157 << 16 | local707, "");
					return;
				}
				if (arg0 == 6715) {
					anInt3171 -= 3;
					local157 = anIntArray298[anInt3171];
					local707 = anIntArray298[anInt3171 + 1];
					local89 = anIntArray298[anInt3171 + 2];
					Static362.method5401(9, local89, local157 << 16 | local707, "");
					return;
				}
				if (arg0 == 6716) {
					anInt3171 -= 3;
					local157 = anIntArray298[anInt3171];
					local707 = anIntArray298[anInt3171 + 1];
					local89 = anIntArray298[anInt3171 + 2];
					Static362.method5401(10, local89, local157 << 16 | local707, "");
					return;
				}
				if (arg0 == 6717) {
					anInt3171 -= 3;
					local157 = anIntArray298[anInt3171];
					local707 = anIntArray298[anInt3171 + 1];
					local89 = anIntArray298[anInt3171 + 2];
					@Pc(7750) Class156 local7750 = Static518.method7135(local89, local157 << 16 | local707);
					Static387.method5882();
					@Pc(7755) Class1_Sub15 local7755 = Static67.method1228(local7750);
					Static53.method1033(local7755.anInt2504, local7755.method2103(), local7750);
					return;
				}
			} else if (arg0 < 6900) {
				@Pc(7783) Class30 local7783;
				if (arg0 == 6800) {
					local157 = anIntArray298[--anInt3171];
					local7783 = Static244.aClass272_4.method6380(local157);
					if (local7783.aString5 == null) {
						aStringArray17[anInt3178++] = "";
						return;
					}
					aStringArray17[anInt3178++] = local7783.aString5;
					return;
				}
				if (arg0 == 6801) {
					local157 = anIntArray298[--anInt3171];
					local7783 = Static244.aClass272_4.method6380(local157);
					anIntArray298[anInt3171++] = local7783.anInt873;
					return;
				}
				if (arg0 == 6802) {
					local157 = anIntArray298[--anInt3171];
					local7783 = Static244.aClass272_4.method6380(local157);
					anIntArray298[anInt3171++] = local7783.anInt870;
					return;
				}
				if (arg0 == 6803) {
					local157 = anIntArray298[--anInt3171];
					local7783 = Static244.aClass272_4.method6380(local157);
					anIntArray298[anInt3171++] = local7783.anInt871;
					return;
				}
				if (arg0 == 6804) {
					anInt3171 -= 2;
					local157 = anIntArray298[anInt3171];
					local707 = anIntArray298[anInt3171 + 1];
					@Pc(7905) Class71 local7905 = Static452.aClass317_2.method7539(local707);
					if (local7905.method1654()) {
						aStringArray17[anInt3178++] = Static244.aClass272_4.method6380(local157).method909(local707, local7905.aString18);
						return;
					}
					anIntArray298[anInt3171++] = Static244.aClass272_4.method6380(local157).method910(local707, local7905.anInt1963);
					return;
				}
			} else if (arg0 < 7000) {
				if (arg0 == 6900) {
					anIntArray298[anInt3171++] = Static264.aBoolean360 && !Static397.aBoolean514 ? 1 : 0;
					return;
				}
				if (arg0 == 6901) {
					anIntArray298[anInt3171++] = Static313.anInt5782;
					return;
				}
				if (arg0 == 6902) {
					anIntArray298[anInt3171++] = Static307.anInt5684;
					return;
				}
				if (arg0 == 6903) {
					anIntArray298[anInt3171++] = Static360.anInt6344;
					return;
				}
				if (arg0 == 6904) {
					anIntArray298[anInt3171++] = Static534.anInt9005;
					return;
				}
				if (arg0 == 6905) {
					local75 = "";
					if (Static528.aClass157_9 != null) {
						if (Static528.aClass157_9.anObject12 == null) {
							local75 = Static142.method2302(Static528.aClass157_9.anInt4740);
						} else {
							local75 = (String) Static528.aClass157_9.anObject12;
						}
					}
					aStringArray17[anInt3178++] = local75;
					return;
				}
				if (arg0 == 6906) {
					anIntArray298[anInt3171++] = Static192.anInt3399;
					return;
				}
				if (arg0 == 6907) {
					anIntArray298[anInt3171++] = Static173.anInt3085;
					return;
				}
				if (arg0 == 6908) {
					anIntArray298[anInt3171++] = Static193.anInt7223;
					return;
				}
				if (arg0 == 6909) {
					anIntArray298[anInt3171++] = Static20.aBoolean22 ? 1 : 0;
					return;
				}
				if (arg0 == 6910) {
					anIntArray298[anInt3171++] = Static157.anInt4565;
					return;
				}
			} else if (arg0 < 7100) {
				if (arg0 == 7000) {
					local157 = Static544.aClass1_Sub22_Sub1_1.method4658();
					anIntArray298[anInt3171++] = Static544.aClass1_Sub22_Sub1_1.anInt5469 = Static374.anInt6861;
					anIntArray298[anInt3171++] = local157;
					Static419.method6151();
					return;
				}
				if (arg0 == 7001) {
					Static544.aClass1_Sub22_Sub1_1.method4668();
					Static419.method6151();
					return;
				}
				if (arg0 == 7002) {
					Static544.aClass1_Sub22_Sub1_1.method4663();
					Static419.method6151();
					return;
				}
				if (arg0 == 7003) {
					Static544.aClass1_Sub22_Sub1_1.method4664();
					Static419.method6151();
					return;
				}
				if (arg0 == 7004) {
					Static544.aClass1_Sub22_Sub1_1.method4656();
					Static419.method6151();
					return;
				}
				if (arg0 == 7005) {
					Static544.aClass1_Sub22_Sub1_1.anInt5440 = 0;
					return;
				}
				if (arg0 == 7006) {
					if (Static544.aClass1_Sub22_Sub1_1.anInt5469 == 2) {
						Static544.aClass1_Sub22_Sub1_1.aBoolean400 = true;
						return;
					}
					if (Static544.aClass1_Sub22_Sub1_1.anInt5469 == 1) {
						Static544.aClass1_Sub22_Sub1_1.aBoolean397 = true;
						return;
					}
					if (Static544.aClass1_Sub22_Sub1_1.anInt5469 == 3) {
						Static544.aClass1_Sub22_Sub1_1.aBoolean398 = true;
					}
					return;
				}
				if (arg0 == 7007) {
					anIntArray298[anInt3171++] = Static544.aClass1_Sub22_Sub1_1.anInt5440;
					return;
				}
				if (arg0 == 7008) {
					if (Static374.anInt6861 == 0 && Static17.anInt454 < 96) {
						anIntArray298[anInt3171++] = 2;
						return;
					}
					anIntArray298[anInt3171++] = 4;
					return;
				}
			}
		}
		throw new IllegalStateException(String.valueOf(arg0));
	}

	@OriginalMember(owner = "client!he", name = "a", descriptor = "(Lclient!ws;I)V")
	private static void method2678(@OriginalArg(0) Class1_Sub1_Sub18 arg0, @OriginalArg(1) int arg1) {
		anInt3171 = 0;
		anInt3178 = 0;
		@Pc(5) int local5 = -1;
		@Pc(8) int[] local8 = arg0.anIntArray847;
		@Pc(11) int[] local11 = arg0.anIntArray846;
		@Pc(13) byte local13 = -1;
		anInt3175 = 0;
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
						method2675(local31, local802);
					} else if (local31 >= 5000 && local31 < 10000) {
						method2677(local31, local802);
					} else {
						throw new IllegalStateException("Command: " + local31);
					}
				} else if (local31 == 0) {
					anIntArray298[anInt3171++] = local11[local5];
				} else {
					@Pc(54) int local54;
					if (local31 == 1) {
						local54 = local11[local5];
						anIntArray298[anInt3171++] = Static251.aClass119_1.anIntArray292[local54];
					} else if (local31 == 2) {
						local54 = local11[local5];
						Static251.aClass119_1.method2652(anIntArray298[--anInt3171], local54);
					} else if (local31 == 3) {
						aStringArray17[anInt3178++] = arg0.aStringArray44[local5];
					} else if (local31 == 6) {
						local5 += local11[local5];
					} else if (local31 == 7) {
						anInt3171 -= 2;
						if (anIntArray298[anInt3171] != anIntArray298[anInt3171 + 1]) {
							local5 += local11[local5];
						}
					} else if (local31 == 8) {
						anInt3171 -= 2;
						if (anIntArray298[anInt3171] == anIntArray298[anInt3171 + 1]) {
							local5 += local11[local5];
						}
					} else if (local31 == 9) {
						anInt3171 -= 2;
						if (anIntArray298[anInt3171] < anIntArray298[anInt3171 + 1]) {
							local5 += local11[local5];
						}
					} else if (local31 == 10) {
						anInt3171 -= 2;
						if (anIntArray298[anInt3171] > anIntArray298[anInt3171 + 1]) {
							local5 += local11[local5];
						}
					} else if (local31 == 21) {
						if (anInt3175 == 0) {
							return;
						}
						@Pc(216) Class139 local216 = aClass139Array1[--anInt3175];
						arg0 = local216.aClass1_Sub1_Sub18_1;
						local8 = arg0.anIntArray847;
						local11 = arg0.anIntArray846;
						local5 = local216.anInt4065;
						anIntArray296 = local216.anIntArray345;
						aStringArray16 = local216.aStringArray22;
					} else if (local31 == 25) {
						local54 = local11[local5];
						anIntArray298[anInt3171++] = Static251.aClass119_1.method2643(local54);
					} else if (local31 == 27) {
						local54 = local11[local5];
						Static251.aClass119_1.method2653(anIntArray298[--anInt3171], local54);
					} else if (local31 == 31) {
						anInt3171 -= 2;
						if (anIntArray298[anInt3171] <= anIntArray298[anInt3171 + 1]) {
							local5 += local11[local5];
						}
					} else if (local31 == 32) {
						anInt3171 -= 2;
						if (anIntArray298[anInt3171] >= anIntArray298[anInt3171 + 1]) {
							local5 += local11[local5];
						}
					} else if (local31 == 33) {
						anIntArray298[anInt3171++] = anIntArray296[local11[local5]];
					} else if (local31 == 34) {
						anIntArray296[local11[local5]] = anIntArray298[--anInt3171];
					} else if (local31 == 35) {
						aStringArray17[anInt3178++] = aStringArray16[local11[local5]];
					} else if (local31 == 36) {
						aStringArray16[local11[local5]] = aStringArray17[--anInt3178];
					} else if (local31 == 37) {
						local54 = local11[local5];
						anInt3178 -= local54;
						@Pc(400) String local400 = Static253.method4289(anInt3178, local54, aStringArray17);
						aStringArray17[anInt3178++] = local400;
					} else if (local31 == 38) {
						anInt3171--;
					} else if (local31 == 39) {
						anInt3178--;
					} else {
						@Pc(452) int local452;
						if (local31 == 40) {
							local54 = local11[local5];
							@Pc(436) Class1_Sub1_Sub18 local436 = Static399.method6032(local54);
							if (local436 == null) {
								throw new RuntimeException();
							}
							@Pc(446) int[] local446 = new int[local436.anInt9151];
							@Pc(450) String[] local450 = new String[local436.anInt9153];
							for (local452 = 0; local452 < local436.anInt9152; local452++) {
								local446[local452] = anIntArray298[anInt3171 + local452 - local436.anInt9152];
							}
							for (@Pc(471) int local471 = 0; local471 < local436.anInt9150; local471++) {
								local450[local471] = aStringArray17[anInt3178 + local471 - local436.anInt9150];
							}
							anInt3171 -= local436.anInt9152;
							anInt3178 -= local436.anInt9150;
							@Pc(502) Class139 local502 = new Class139();
							local502.aClass1_Sub1_Sub18_1 = arg0;
							local502.anInt4065 = local5;
							local502.anIntArray345 = anIntArray296;
							local502.aStringArray22 = aStringArray16;
							if (anInt3175 >= aClass139Array1.length) {
								throw new RuntimeException();
							}
							aClass139Array1[anInt3175++] = local502;
							arg0 = local436;
							local8 = local436.anIntArray847;
							local11 = local436.anIntArray846;
							local5 = -1;
							anIntArray296 = local446;
							aStringArray16 = local450;
						} else if (local31 == 42) {
							anIntArray298[anInt3171++] = Static42.anIntArray119[local11[local5]];
						} else if (local31 == 43) {
							local54 = local11[local5];
							Static42.anIntArray119[local54] = anIntArray298[--anInt3171];
							Static391.method5900(local54);
							Static47.aBoolean51 |= Static303.aBooleanArray39[local54];
						} else if (local31 == 44) {
							local54 = local11[local5] >> 16;
							local603 = local11[local5] & 0xFFFF;
							@Pc(611) int local611 = anIntArray298[--anInt3171];
							if (local611 >= 0 && local611 <= 5000) {
								anIntArray297[local54] = local611;
								@Pc(626) byte local626 = -1;
								if (local603 == 105) {
									local626 = 0;
								}
								local452 = 0;
								while (true) {
									if (local452 >= local611) {
										continue label260;
									}
									anIntArrayArray37[local54][local452] = local626;
									local452++;
								}
							}
							throw new RuntimeException();
						} else if (local31 == 45) {
							local54 = local11[local5];
							local603 = anIntArray298[--anInt3171];
							if (local603 < 0 || local603 >= anIntArray297[local54]) {
								throw new RuntimeException();
							}
							anIntArray298[anInt3171++] = anIntArrayArray37[local54][local603];
						} else if (local31 == 46) {
							local54 = local11[local5];
							anInt3171 -= 2;
							local603 = anIntArray298[anInt3171];
							if (local603 < 0 || local603 >= anIntArray297[local54]) {
								throw new RuntimeException();
							}
							anIntArrayArray37[local54][local603] = anIntArray298[anInt3171 + 1];
						} else if (local31 == 47) {
							@Pc(730) String local730 = Static221.aStringArray23[local11[local5]];
							if (local730 == null) {
								local730 = "null";
							}
							aStringArray17[anInt3178++] = local730;
						} else if (local31 == 48) {
							local54 = local11[local5];
							Static221.aStringArray23[local54] = aStringArray17[--anInt3178];
							Static464.method4174(local54);
						} else if (local31 == 51) {
							@Pc(774) Class17 local774 = arg0.aClass17Array1[local11[local5]];
							@Pc(787) Class1_Sub9 local787 = (Class1_Sub9) local774.method738((long) anIntArray298[--anInt3171]);
							if (local787 != null) {
								local5 += local787.anInt1173;
							}
						}
					}
				}
			}
		} catch (@Pc(837) Exception local837) {
			@Pc(855) StringBuffer local855;
			if (arg0.aString80 == null) {
				local855 = new StringBuffer(30);
				local855.append("CS2: ").append(arg0.aLong392).append(" ");
				for (local603 = anInt3175 - 1; local603 >= 0; local603--) {
					local855.append("v: ").append(aClass139Array1[local603].aClass1_Sub1_Sub18_1.aLong392).append(" ");
				}
				local855.append("op: ").append(local13);
				Static234.method4051(local837, local855.toString());
			} else {
				Static324.method5022("Clientscript error in: " + arg0.aString80);
				local855 = new StringBuffer(30);
				local855.append("Clientscript error in: ").append(arg0.aString80).append("\n");
				for (local603 = anInt3175 - 1; local603 >= 0; local603--) {
					local855.append("via: ").append(aClass139Array1[local603].aClass1_Sub1_Sub18_1.aString80).append("\n");
				}
				local855.append("Op: ").append(local13).append("\n");
				@Pc(895) String local895 = local837.getMessage();
				if (local895 != null && local895.length() > 0) {
					local855.append("Message: ").append(local895).append("\n");
				}
				Static234.method4051(local837, local855.toString());
				Static508.method7026(local855.toString());
			}
		}
	}

	@OriginalMember(owner = "client!he", name = "a", descriptor = "(Lclient!lq;I)V")
	private static void method2679(@OriginalArg(0) Class1_Sub30 arg0, @OriginalArg(1) int arg1) {
		@Pc(2) Object[] local2 = arg0.anObjectArray36;
		@Pc(8) int local8 = (Integer) local2[0];
		@Pc(12) Class1_Sub1_Sub18 local12 = Static399.method6032(local8);
		if (local12 == null) {
			return;
		}
		anIntArray296 = new int[local12.anInt9151];
		@Pc(21) int local21 = 0;
		aStringArray16 = new String[local12.anInt9153];
		@Pc(27) int local27 = 0;
		for (@Pc(29) int local29 = 1; local29 < local2.length; local29++) {
			if (local2[local29] instanceof Integer) {
				@Pc(41) int local41 = (Integer) local2[local29];
				if (local41 == -2147483647) {
					local41 = arg0.anInt5303;
				}
				if (local41 == -2147483646) {
					local41 = arg0.anInt5301;
				}
				if (local41 == -2147483645) {
					local41 = arg0.aClass156_11 == null ? -1 : arg0.aClass156_11.anInt4677;
				}
				if (local41 == -2147483644) {
					local41 = arg0.anInt5296;
				}
				if (local41 == -2147483643) {
					local41 = arg0.aClass156_11 == null ? -1 : arg0.aClass156_11.anInt4723;
				}
				if (local41 == -2147483642) {
					local41 = arg0.aClass156_12 == null ? -1 : arg0.aClass156_12.anInt4677;
				}
				if (local41 == -2147483641) {
					local41 = arg0.aClass156_12 == null ? -1 : arg0.aClass156_12.anInt4723;
				}
				if (local41 == -2147483640) {
					local41 = arg0.anInt5295;
				}
				if (local41 == -2147483639) {
					local41 = arg0.anInt5299;
				}
				anIntArray296[local21++] = local41;
			} else if (local2[local29] instanceof String) {
				@Pc(135) String local135 = (String) local2[local29];
				if (local135.equals("event_opbase")) {
					local135 = arg0.aString47;
				}
				aStringArray16[local27++] = local135;
			}
		}
		anInt3183 = arg0.anInt5297;
		method2678(local12, arg1);
	}

	@OriginalMember(owner = "client!he", name = "b", descriptor = "(I)Ljava/lang/String;")
	private static String method2680(@OriginalArg(0) int arg0) {
		@Pc(6) long local6 = ((long) arg0 + 11745L) * 86400000L;
		aCalendar1.setTime(new Date(local6));
		@Pc(16) int local16 = aCalendar1.get(5);
		@Pc(20) int local20 = aCalendar1.get(2);
		@Pc(24) int local24 = aCalendar1.get(1);
		return local16 + "-" + aStringArray18[local20] + "-" + local24;
	}

	@OriginalMember(owner = "client!he", name = "c", descriptor = "(IZ)V")
	public static void method2681() {
	}

	@OriginalMember(owner = "client!he", name = "c", descriptor = "(I)V")
	private static void method2682(@OriginalArg(0) int arg0) {
		@Pc(3) Class156 local3 = Static182.method2888(arg0);
		if (local3 == null) {
			return;
		}
		@Pc(9) int local9 = arg0 >>> 16;
		@Pc(13) Class156[] local13 = Static520.aClass156ArrayArray2[local9];
		if (local13 == null) {
			@Pc(19) Class156[] local19 = Static396.aClass156ArrayArray1[local9];
			@Pc(22) int local22 = local19.length;
			local13 = Static520.aClass156ArrayArray2[local9] = new Class156[local22];
			Static551.method3490(local19, 0, local13, 0, local19.length);
		}
		@Pc(38) int local38;
		for (local38 = 0; local38 < local13.length && local13[local38] != local3; local38++) {
		}
		if (local38 >= local13.length) {
			return;
		}
		Static551.method3490(local13, 0, local13, 1, local38);
		local13[0] = local3;
	}

	@OriginalMember(owner = "client!he", name = "a", descriptor = "(Lclient!lq;)V")
	public static void method2683(@OriginalArg(0) Class1_Sub30 arg0) {
		method2679(arg0, 200000);
	}

	@OriginalMember(owner = "client!he", name = "d", descriptor = "(I)V")
	public static void method2684(@OriginalArg(0) int arg0) {
		if (arg0 == -1 || !Static204.method3515(arg0)) {
			return;
		}
		@Pc(12) Class156[] local12 = Static396.aClass156ArrayArray1[arg0];
		for (@Pc(14) int local14 = 0; local14 < local12.length; local14++) {
			@Pc(19) Class156 local19 = local12[local14];
			if (local19.anObjectArray10 != null) {
				@Pc(26) Class1_Sub30 local26 = new Class1_Sub30();
				local26.aClass156_11 = local19;
				local26.anObjectArray36 = local19.anObjectArray10;
				method2679(local26, 2000000);
			}
		}
	}

	@OriginalMember(owner = "client!he", name = "a", descriptor = "()V")
	public static void method2685() {
	}
}
