import jagex3.jagmisc.jagmisc;
import java.io.IOException;
import java.util.Calendar;
import java.util.Date;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static199 {

	@OriginalMember(owner = "client!hj", name = "a", descriptor = "[Ljava/lang/String;")
	private static String[] aStringArray19;

	@OriginalMember(owner = "client!hj", name = "b", descriptor = "Lclient!faa;")
	private static Class97 aClass97_9;

	@OriginalMember(owner = "client!hj", name = "d", descriptor = "Lclient!hh;")
	private static Class129 aClass129_1;

	@OriginalMember(owner = "client!hj", name = "h", descriptor = "[I")
	private static int[] anIntArray322;

	@OriginalMember(owner = "client!hj", name = "j", descriptor = "Lclient!faa;")
	private static Class97 aClass97_10;

	@OriginalMember(owner = "client!hj", name = "e", descriptor = "Ljava/util/Calendar;")
	private static final Calendar aCalendar1 = Calendar.getInstance();

	@OriginalMember(owner = "client!hj", name = "f", descriptor = "I")
	private static int anInt3825 = 0;

	@OriginalMember(owner = "client!hj", name = "g", descriptor = "I")
	private static int anInt3826 = 0;

	@OriginalMember(owner = "client!hj", name = "k", descriptor = "[I")
	private static final int[] anIntArray323 = new int[1000];

	@OriginalMember(owner = "client!hj", name = "l", descriptor = "[Lclient!fr;")
	private static final Class112[] aClass112Array1 = new Class112[50];

	@OriginalMember(owner = "client!hj", name = "m", descriptor = "[I")
	private static final int[] anIntArray324 = new int[5];

	@OriginalMember(owner = "client!hj", name = "q", descriptor = "[Ljava/lang/String;")
	private static final String[] aStringArray20 = new String[1000];

	@OriginalMember(owner = "client!hj", name = "s", descriptor = "[[I")
	private static final int[][] anIntArrayArray33 = new int[5][5000];

	@OriginalMember(owner = "client!hj", name = "u", descriptor = "I")
	private static int anInt3833 = 0;

	@OriginalMember(owner = "client!hj", name = "z", descriptor = "Lclient!vh;")
	public static final Class330 aClass330_25 = new Class330(4);

	@OriginalMember(owner = "client!hj", name = "A", descriptor = "[I")
	private static final int[] anIntArray325 = new int[3];

	@OriginalMember(owner = "client!hj", name = "B", descriptor = "[Ljava/lang/String;")
	private static final String[] aStringArray21 = new String[] { "Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec" };

	@OriginalMember(owner = "client!hj", name = "C", descriptor = "I")
	private static int anInt3838 = 0;

	@OriginalMember(owner = "client!hj", name = "a", descriptor = "(IZ)V")
	private static void method3314(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1) {
		@Pc(137) Class97 local137;
		@Pc(19) int local19;
		@Pc(35) Class97 local35;
		@Pc(56) int local56;
		@Pc(13) int local13;
		@Pc(210) Class97 local210;
		@Pc(25) int local25;
		@Pc(158) Class97 local158;
		if (arg0 < 300) {
			if (arg0 == 100) {
				anInt3825 -= 3;
				local13 = anIntArray323[anInt3825];
				local19 = anIntArray323[anInt3825 + 1];
				local25 = anIntArray323[anInt3825 + 2];
				if (local19 == 0) {
					throw new RuntimeException();
				}
				local35 = Static495.method7281(local13);
				if (local35.aClass97Array2 == null) {
					local35.aClass97Array2 = new Class97[local25 + 1];
				}
				if (local35.aClass97Array2.length <= local25) {
					@Pc(54) Class97[] local54 = new Class97[local25 + 1];
					for (local56 = 0; local56 < local35.aClass97Array2.length; local56++) {
						local54[local56] = local35.aClass97Array2[local56];
					}
					local35.aClass97Array2 = local54;
				}
				if (local25 > 0 && local35.aClass97Array2[local25 - 1] == null) {
					throw new RuntimeException("Gap at:" + (local25 - 1));
				}
				@Pc(99) Class97 local99 = new Class97();
				local99.anInt2637 = local19;
				local99.anInt2655 = local99.anInt2678 = local35.anInt2678;
				local99.anInt2675 = local25;
				local35.aClass97Array2[local25] = local99;
				if (arg1) {
					aClass97_10 = local99;
				} else {
					aClass97_9 = local99;
				}
				Static479.method6666(local35);
				return;
			}
			if (arg0 == 101) {
				local137 = arg1 ? aClass97_10 : aClass97_9;
				if (local137.anInt2675 == -1) {
					if (arg1) {
						throw new RuntimeException("Tried to .cc_delete static .active-component!");
					}
					throw new RuntimeException("Tried to cc_delete static active-component!");
				}
				local158 = Static495.method7281(local137.anInt2678);
				local158.aClass97Array2[local137.anInt2675] = null;
				Static479.method6666(local158);
				return;
			}
			if (arg0 == 102) {
				local137 = Static495.method7281(anIntArray323[--anInt3825]);
				local137.aClass97Array2 = null;
				Static479.method6666(local137);
				return;
			}
			if (arg0 == 200) {
				anInt3825 -= 2;
				local13 = anIntArray323[anInt3825];
				local19 = anIntArray323[anInt3825 + 1];
				local210 = Static76.method1088(local13, local19);
				if (local210 != null && local19 != -1) {
					anIntArray323[anInt3825++] = 1;
					if (arg1) {
						aClass97_10 = local210;
						return;
					}
					aClass97_9 = local210;
					return;
				}
				anIntArray323[anInt3825++] = 0;
				return;
			}
			if (arg0 == 201) {
				local13 = anIntArray323[--anInt3825];
				local158 = Static495.method7281(local13);
				if (local158 != null) {
					anIntArray323[anInt3825++] = 1;
					if (arg1) {
						aClass97_10 = local158;
						return;
					}
					aClass97_9 = local158;
					return;
				}
				anIntArray323[anInt3825++] = 0;
				return;
			}
			if (arg0 == 202) {
				local13 = anIntArray323[--anInt3825];
				method3321(local13);
				return;
			}
			if (arg0 == 203) {
				local13 = anIntArray323[--anInt3825];
				method3327(local13);
				return;
			}
		} else {
			@Pc(353) int local353;
			@Pc(412) boolean local412;
			if (arg0 < 500) {
				if (arg0 == 403) {
					anInt3825 -= 2;
					local13 = anIntArray323[anInt3825];
					local19 = anIntArray323[anInt3825 + 1];
					for (local25 = 0; local25 < Static267.anIntArray421.length; local25++) {
						if (Static267.anIntArray421[local25] == local13) {
							Static461.aClass15_Sub2_Sub4_Sub2_2.aClass212_1.method5079(local25, local19, Static518.aClass242_2);
							return;
						}
					}
					for (local353 = 0; local353 < Static183.anIntArray304.length; local353++) {
						if (Static183.anIntArray304[local353] == local13) {
							Static461.aClass15_Sub2_Sub4_Sub2_2.aClass212_1.method5079(local353, local19, Static518.aClass242_2);
							return;
						}
					}
					return;
				}
				if (arg0 == 404) {
					anInt3825 -= 2;
					local13 = anIntArray323[anInt3825];
					local19 = anIntArray323[anInt3825 + 1];
					Static461.aClass15_Sub2_Sub4_Sub2_2.aClass212_1.method5077(local19, local13);
					return;
				}
				if (arg0 == 410) {
					local412 = anIntArray323[--anInt3825] != 0;
					Static461.aClass15_Sub2_Sub4_Sub2_2.aClass212_1.method5075(local412);
					return;
				}
			} else if (arg0 >= 1000 && arg0 < 1100 || arg0 >= 2000 && arg0 < 2100) {
				if (arg0 >= 2000) {
					arg0 -= 1000;
					local137 = Static495.method7281(anIntArray323[--anInt3825]);
				} else {
					local137 = arg1 ? aClass97_10 : aClass97_9;
				}
				if (arg0 == 1000) {
					anInt3825 -= 4;
					local137.anInt2650 = anIntArray323[anInt3825];
					local137.anInt2618 = anIntArray323[anInt3825 + 1];
					local19 = anIntArray323[anInt3825 + 2];
					if (local19 < 0) {
						local19 = 0;
					} else if (local19 > 5) {
						local19 = 5;
					}
					local25 = anIntArray323[anInt3825 + 3];
					if (local25 < 0) {
						local25 = 0;
					} else if (local25 > 5) {
						local25 = 5;
					}
					local137.aByte29 = (byte) local19;
					local137.aByte28 = (byte) local25;
					Static479.method6666(local137);
					Static168.method2677(local137);
					if (local137.anInt2675 == -1) {
						Static462.method6472(local137.anInt2678);
					}
					return;
				}
				if (arg0 == 1001) {
					anInt3825 -= 4;
					local137.anInt2616 = anIntArray323[anInt3825];
					local137.anInt2646 = anIntArray323[anInt3825 + 1];
					local137.anInt2633 = 0;
					local137.anInt2621 = 0;
					local19 = anIntArray323[anInt3825 + 2];
					if (local19 < 0) {
						local19 = 0;
					} else if (local19 > 4) {
						local19 = 4;
					}
					local25 = anIntArray323[anInt3825 + 3];
					if (local25 < 0) {
						local25 = 0;
					} else if (local25 > 4) {
						local25 = 4;
					}
					local137.aByte27 = (byte) local19;
					local137.aByte30 = (byte) local25;
					Static479.method6666(local137);
					Static168.method2677(local137);
					if (local137.anInt2637 == 0) {
						Static465.method6499(local137, false);
					}
					return;
				}
				if (arg0 == 1003) {
					@Pc(620) boolean local620 = anIntArray323[--anInt3825] == 1;
					if (local137.aBoolean200 != local620) {
						local137.aBoolean200 = local620;
						Static479.method6666(local137);
					}
					if (local137.anInt2675 == -1) {
						Static446.method6300(local137.anInt2678);
					}
					return;
				}
				if (arg0 == 1004) {
					anInt3825 -= 2;
					local137.anInt2666 = anIntArray323[anInt3825];
					local137.anInt2628 = anIntArray323[anInt3825 + 1];
					Static479.method6666(local137);
					Static168.method2677(local137);
					if (local137.anInt2637 == 0) {
						Static465.method6499(local137, false);
					}
					return;
				}
				if (arg0 == 1005) {
					local137.aBoolean202 = anIntArray323[--anInt3825] == 1;
					return;
				}
			} else {
				@Pc(1488) String local1488;
				@Pc(1101) String local1101;
				if (arg0 >= 1100 && arg0 < 1200 || arg0 >= 2100 && arg0 < 2200) {
					if (arg0 >= 2000) {
						arg0 -= 1000;
						local137 = Static495.method7281(anIntArray323[--anInt3825]);
					} else {
						local137 = arg1 ? aClass97_10 : aClass97_9;
					}
					if (arg0 == 1100) {
						anInt3825 -= 2;
						local137.anInt2691 = anIntArray323[anInt3825];
						if (local137.anInt2691 > local137.anInt2658 - local137.anInt2690) {
							local137.anInt2691 = local137.anInt2658 - local137.anInt2690;
						}
						if (local137.anInt2691 < 0) {
							local137.anInt2691 = 0;
						}
						local137.anInt2665 = anIntArray323[anInt3825 + 1];
						if (local137.anInt2665 > local137.anInt2603 - local137.anInt2670) {
							local137.anInt2665 = local137.anInt2603 - local137.anInt2670;
						}
						if (local137.anInt2665 < 0) {
							local137.anInt2665 = 0;
						}
						Static479.method6666(local137);
						if (local137.anInt2675 == -1) {
							Static376.method5505(local137.anInt2678);
						}
						return;
					}
					if (arg0 == 1101) {
						local137.anInt2606 = anIntArray323[--anInt3825];
						Static479.method6666(local137);
						if (local137.anInt2675 == -1) {
							Static469.method6533(local137.anInt2678);
						}
						return;
					}
					if (arg0 == 1102) {
						local137.aBoolean196 = anIntArray323[--anInt3825] == 1;
						Static479.method6666(local137);
						return;
					}
					if (arg0 == 1103) {
						local137.anInt2602 = anIntArray323[--anInt3825];
						Static479.method6666(local137);
						return;
					}
					if (arg0 == 1104) {
						local137.anInt2631 = anIntArray323[--anInt3825];
						Static479.method6666(local137);
						return;
					}
					if (arg0 == 1105) {
						local19 = anIntArray323[--anInt3825];
						if (local137.anInt2632 != local19) {
							local137.anInt2632 = local19;
							Static479.method6666(local137);
						}
						if (local137.anInt2675 == -1) {
							Static31.method501(local137.anInt2678);
						}
						return;
					}
					if (arg0 == 1106) {
						local137.anInt2649 = anIntArray323[--anInt3825];
						Static479.method6666(local137);
						return;
					}
					if (arg0 == 1107) {
						local137.aBoolean205 = anIntArray323[--anInt3825] == 1;
						Static479.method6666(local137);
						return;
					}
					if (arg0 == 1108) {
						local137.anInt2681 = 1;
						local137.anInt2636 = anIntArray323[--anInt3825];
						Static479.method6666(local137);
						if (local137.anInt2675 == -1) {
							Static243.method3796(local137.anInt2678);
						}
						return;
					}
					if (arg0 == 1109) {
						anInt3825 -= 6;
						local137.anInt2630 = anIntArray323[anInt3825];
						local137.anInt2614 = anIntArray323[anInt3825 + 1];
						local137.anInt2687 = anIntArray323[anInt3825 + 2];
						local137.anInt2639 = anIntArray323[anInt3825 + 3];
						local137.anInt2661 = anIntArray323[anInt3825 + 4];
						local137.anInt2683 = anIntArray323[anInt3825 + 5];
						Static479.method6666(local137);
						if (local137.anInt2675 == -1) {
							Static176.method7615(local137.anInt2678);
							Static44.method719(local137.anInt2678);
						}
						return;
					}
					if (arg0 == 1110) {
						local19 = anIntArray323[--anInt3825];
						if (local137.anInt2620 != local19) {
							local137.anInt2620 = local19;
							local137.anInt2601 = 0;
							local137.anInt2626 = 1;
							local137.anInt2685 = 0;
							Static479.method6666(local137);
						}
						if (local137.anInt2675 == -1) {
							Static554.method7715(local137.anInt2678);
						}
						return;
					}
					if (arg0 == 1111) {
						local137.aBoolean206 = anIntArray323[--anInt3825] == 1;
						Static479.method6666(local137);
						return;
					}
					if (arg0 == 1112) {
						local1101 = aStringArray20[--anInt3833];
						if (!local1101.equals(local137.aString18)) {
							local137.aString18 = local1101;
							Static479.method6666(local137);
						}
						if (local137.anInt2675 == -1) {
							Static172.method2698(local137.anInt2678);
						}
						return;
					}
					if (arg0 == 1113) {
						local137.anInt2651 = anIntArray323[--anInt3825];
						Static479.method6666(local137);
						if (local137.anInt2675 == -1) {
							Static70.method981(local137.anInt2678);
						}
						return;
					}
					if (arg0 == 1114) {
						anInt3825 -= 3;
						local137.anInt2684 = anIntArray323[anInt3825];
						local137.anInt2617 = anIntArray323[anInt3825 + 1];
						local137.anInt2652 = anIntArray323[anInt3825 + 2];
						Static479.method6666(local137);
						return;
					}
					if (arg0 == 1115) {
						local137.aBoolean203 = anIntArray323[--anInt3825] == 1;
						Static479.method6666(local137);
						return;
					}
					if (arg0 == 1116) {
						local137.anInt2634 = anIntArray323[--anInt3825];
						Static479.method6666(local137);
						return;
					}
					if (arg0 == 1117) {
						local137.anInt2647 = anIntArray323[--anInt3825];
						Static479.method6666(local137);
						return;
					}
					if (arg0 == 1118) {
						local137.aBoolean199 = anIntArray323[--anInt3825] == 1;
						Static479.method6666(local137);
						return;
					}
					if (arg0 == 1119) {
						local137.aBoolean193 = anIntArray323[--anInt3825] == 1;
						Static479.method6666(local137);
						return;
					}
					if (arg0 == 1120) {
						anInt3825 -= 2;
						local137.anInt2658 = anIntArray323[anInt3825];
						local137.anInt2603 = anIntArray323[anInt3825 + 1];
						Static479.method6666(local137);
						if (local137.anInt2637 == 0) {
							Static465.method6499(local137, false);
						}
						return;
					}
					if (arg0 == 1121) {
						anInt3825 -= 2;
						local137.anInt2653 = (short) anIntArray323[anInt3825];
						local137.anInt2611 = (short) anIntArray323[anInt3825 + 1];
						Static479.method6666(local137);
						return;
					}
					if (arg0 == 1122) {
						local137.aBoolean207 = anIntArray323[--anInt3825] == 1;
						Static479.method6666(local137);
						return;
					}
					if (arg0 == 1123) {
						local137.anInt2683 = anIntArray323[--anInt3825];
						Static479.method6666(local137);
						if (local137.anInt2675 == -1) {
							Static176.method7615(local137.anInt2678);
						}
						return;
					}
					if (arg0 == 1124) {
						local19 = anIntArray323[--anInt3825];
						local137.aBoolean197 = local19 == 1;
						Static479.method6666(local137);
						return;
					}
					if (arg0 == 1125) {
						anInt3825 -= 2;
						local137.anInt2624 = anIntArray323[anInt3825];
						local137.anInt2645 = anIntArray323[anInt3825 + 1];
						Static479.method6666(local137);
						return;
					}
					if (arg0 == 1126) {
						local137.anInt2648 = anIntArray323[--anInt3825];
						Static479.method6666(local137);
						return;
					}
					@Pc(1454) Class348 local1454;
					if (arg0 == 1127) {
						anInt3825 -= 2;
						local19 = anIntArray323[anInt3825];
						local25 = anIntArray323[anInt3825 + 1];
						local1454 = Static111.aClass259_1.method5915(local19);
						if (local25 != local1454.anInt9885) {
							local137.method2291(local19, local25);
							return;
						}
						local137.method2284(local19);
						return;
					}
					if (arg0 == 1128) {
						local19 = anIntArray323[--anInt3825];
						local1488 = aStringArray20[--anInt3833];
						local1454 = Static111.aClass259_1.method5915(local19);
						if (!local1454.aString92.equals(local1488)) {
							local137.method2299(local19, local1488);
							return;
						}
						local137.method2284(local19);
						return;
					}
				} else if (arg0 >= 1200 && arg0 < 1300 || arg0 >= 2200 && arg0 < 2300) {
					if (arg0 >= 2000) {
						arg0 -= 1000;
						local137 = Static495.method7281(anIntArray323[--anInt3825]);
					} else {
						local137 = arg1 ? aClass97_10 : aClass97_9;
					}
					Static479.method6666(local137);
					if (arg0 == 1200 || arg0 == 1205 || arg0 == 1208 || arg0 == 1209 || arg0 == 1212 || arg0 == 1213) {
						anInt3825 -= 2;
						local19 = anIntArray323[anInt3825];
						local25 = anIntArray323[anInt3825 + 1];
						if (local137.anInt2675 == -1) {
							Static100.method1448(local137.anInt2678);
							Static176.method7615(local137.anInt2678);
							Static44.method719(local137.anInt2678);
						}
						if (local19 == -1) {
							local137.anInt2681 = 1;
							local137.anInt2636 = -1;
							local137.anInt2607 = -1;
							return;
						}
						local137.anInt2607 = local19;
						local137.anInt2660 = local25;
						if (arg0 == 1208 || arg0 == 1209) {
							local137.aBoolean201 = true;
						} else {
							local137.aBoolean201 = false;
						}
						@Pc(1630) Class236 local1630 = Static119.aClass244_4.method5726(local19);
						local137.anInt2687 = local1630.anInt6826;
						local137.anInt2639 = local1630.anInt6819;
						local137.anInt2661 = local1630.anInt6766;
						local137.anInt2630 = local1630.anInt6825;
						local137.anInt2614 = local1630.anInt6770;
						local137.anInt2683 = local1630.anInt6822;
						if (arg0 == 1205 || arg0 == 1209) {
							local137.anInt2689 = 0;
						} else if (arg0 == 1212 || arg0 == 1213) {
							local137.anInt2689 = 1;
						} else {
							local137.anInt2689 = 2;
						}
						if (local137.anInt2633 > 0) {
							local137.anInt2683 = local137.anInt2683 * 32 / local137.anInt2633;
							return;
						}
						if (local137.anInt2616 > 0) {
							local137.anInt2683 = local137.anInt2683 * 32 / local137.anInt2616;
						}
						return;
					}
					if (arg0 == 1201) {
						local137.anInt2681 = 2;
						local137.anInt2636 = anIntArray323[--anInt3825];
						if (local137.anInt2675 == -1) {
							Static243.method3796(local137.anInt2678);
						}
						return;
					}
					if (arg0 == 1202) {
						local137.anInt2681 = 3;
						local137.anInt2636 = -1;
						if (local137.anInt2675 == -1) {
							Static243.method3796(local137.anInt2678);
						}
						return;
					}
					if (arg0 == 1203) {
						local137.anInt2681 = 6;
						local137.anInt2636 = anIntArray323[--anInt3825];
						if (local137.anInt2675 == -1) {
							Static243.method3796(local137.anInt2678);
						}
						return;
					}
					if (arg0 == 1204) {
						local137.anInt2681 = 5;
						local137.anInt2636 = anIntArray323[--anInt3825];
						if (local137.anInt2675 == -1) {
							Static243.method3796(local137.anInt2678);
						}
						return;
					}
					if (arg0 == 1206) {
						anInt3825 -= 4;
						local137.anInt2654 = anIntArray323[anInt3825];
						local137.anInt2672 = anIntArray323[anInt3825 + 1];
						local137.anInt2671 = anIntArray323[anInt3825 + 2];
						local137.anInt2659 = anIntArray323[anInt3825 + 3];
						Static479.method6666(local137);
						return;
					}
					if (arg0 == 1207) {
						anInt3825 -= 2;
						local137.anInt2619 = anIntArray323[anInt3825];
						local137.anInt2612 = anIntArray323[anInt3825 + 1];
						Static479.method6666(local137);
						return;
					}
					if (arg0 == 1210) {
						anInt3825 -= 4;
						local137.anInt2636 = anIntArray323[anInt3825];
						local137.anInt2682 = anIntArray323[anInt3825 + 1];
						if (anIntArray323[anInt3825 + 2] == 1) {
							local137.anInt2681 = 9;
						} else {
							local137.anInt2681 = 8;
						}
						if (anIntArray323[anInt3825 + 3] == 1) {
							local137.aBoolean201 = true;
						} else {
							local137.aBoolean201 = false;
						}
						if (local137.anInt2675 == -1) {
							Static243.method3796(local137.anInt2678);
						}
						return;
					}
					if (arg0 == 1211) {
						local137.anInt2681 = 5;
						local137.anInt2636 = Static517.anInt8881;
						local137.anInt2682 = 0;
						if (local137.anInt2675 == -1) {
							Static243.method3796(local137.anInt2678);
						}
						return;
					}
				} else {
					@Pc(2290) int local2290;
					if (arg0 >= 1300 && arg0 < 1400 || arg0 >= 2300 && arg0 < 2400) {
						if (arg0 >= 2000) {
							arg0 -= 1000;
							local137 = Static495.method7281(anIntArray323[--anInt3825]);
						} else {
							local137 = arg1 ? aClass97_10 : aClass97_9;
						}
						if (arg0 == 1300) {
							local19 = anIntArray323[--anInt3825] - 1;
							if (local19 >= 0 && local19 <= 9) {
								local137.method2287(local19, aStringArray20[--anInt3833]);
								return;
							} else {
								anInt3833--;
								return;
							}
						}
						if (arg0 == 1301) {
							anInt3825 -= 2;
							local19 = anIntArray323[anInt3825];
							local25 = anIntArray323[anInt3825 + 1];
							if (local19 == -1 && local25 == -1) {
								local137.aClass97_7 = null;
								return;
							}
							local137.aClass97_7 = Static76.method1088(local19, local25);
							return;
						}
						if (arg0 == 1302) {
							local19 = anIntArray323[--anInt3825];
							if (local19 != Static386.anInt7091 && local19 != Static113.anInt1925 && local19 != Static392.anInt7163) {
								return;
							}
							local137.lb = local19;
							return;
						}
						if (arg0 == 1303) {
							local137.anInt2667 = anIntArray323[--anInt3825];
							return;
						}
						if (arg0 == 1304) {
							local137.anInt2673 = anIntArray323[--anInt3825];
							return;
						}
						if (arg0 == 1305) {
							local137.aString20 = aStringArray20[--anInt3833];
							return;
						}
						if (arg0 == 1306) {
							local137.aString21 = aStringArray20[--anInt3833];
							return;
						}
						if (arg0 == 1307) {
							local137.aStringArray11 = null;
							return;
						}
						if (arg0 == 1308) {
							local137.anInt2604 = anIntArray323[--anInt3825];
							local137.anInt2692 = anIntArray323[--anInt3825];
							return;
						}
						if (arg0 == 1309) {
							local19 = anIntArray323[--anInt3825];
							local25 = anIntArray323[--anInt3825];
							if (local25 >= 1 && local25 <= 10) {
								local137.method2282(local25 - 1, local19);
							}
							return;
						}
						if (arg0 == 1310) {
							local137.aString19 = aStringArray20[--anInt3833];
							return;
						}
						if (arg0 == 1311) {
							local137.anInt2679 = anIntArray323[--anInt3825];
							return;
						}
						if (arg0 == 1312 || arg0 == 1313) {
							if (arg0 == 1312) {
								anInt3825 -= 3;
								local19 = anIntArray323[anInt3825] - 1;
								local25 = anIntArray323[anInt3825 + 1];
								local353 = anIntArray323[anInt3825 + 2];
								if (local19 < 0 || local19 > 9) {
									throw new RuntimeException("IOR13121313");
								}
							} else {
								anInt3825 -= 2;
								local19 = 10;
								local25 = anIntArray323[anInt3825];
								local353 = anIntArray323[anInt3825 + 1];
							}
							if (local137.aByteArray39 == null) {
								if (local25 == 0) {
									return;
								}
								local137.aByteArray39 = new byte[11];
								local137.aByteArray40 = new byte[11];
								local137.anIntArray276 = new int[11];
							}
							local137.aByteArray39[local19] = (byte) local25;
							if (local25 == 0) {
								local137.aBoolean208 = false;
								for (local2290 = 0; local2290 < local137.aByteArray39.length; local2290++) {
									if (local137.aByteArray39[local2290] != 0) {
										local137.aBoolean208 = true;
										break;
									}
								}
							} else {
								local137.aBoolean208 = true;
							}
							local137.aByteArray40[local19] = (byte) local353;
							return;
						}
						if (arg0 == 1314) {
							local137.anInt2663 = anIntArray323[--anInt3825];
							return;
						}
					} else if (arg0 >= 1400 && arg0 < 1500 || arg0 >= 2400 && arg0 < 2500) {
						if (arg0 >= 2000) {
							arg0 -= 1000;
							local137 = Static495.method7281(anIntArray323[--anInt3825]);
						} else {
							local137 = arg1 ? aClass97_10 : aClass97_9;
						}
						if (arg0 == 1499) {
							local137.method2292();
							return;
						}
						local1101 = aStringArray20[--anInt3833];
						@Pc(2376) int[] local2376 = null;
						if (local1101.length() > 0 && local1101.charAt(local1101.length() - 1) == 'Y') {
							local353 = anIntArray323[--anInt3825];
							if (local353 > 0) {
								local2376 = new int[local353];
								while (local353-- > 0) {
									local2376[local353] = anIntArray323[--anInt3825];
								}
							}
							local1101 = local1101.substring(0, local1101.length() - 1);
						}
						@Pc(2428) Object[] local2428 = new Object[local1101.length() + 1];
						for (local2290 = local2428.length - 1; local2290 >= 1; local2290--) {
							if (local1101.charAt(local2290 - 1) == 's') {
								local2428[local2290] = aStringArray20[--anInt3833];
							} else {
								local2428[local2290] = Integer.valueOf(anIntArray323[--anInt3825]);
							}
						}
						local56 = anIntArray323[--anInt3825];
						if (local56 == -1) {
							local2428 = null;
						} else {
							local2428[0] = Integer.valueOf(local56);
						}
						if (arg0 == 1400) {
							local137.anObjectArray28 = local2428;
						} else if (arg0 == 1401) {
							local137.anObjectArray19 = local2428;
						} else if (arg0 == 1402) {
							local137.anObjectArray13 = local2428;
						} else if (arg0 == 1403) {
							local137.anObjectArray7 = local2428;
						} else if (arg0 == 1404) {
							local137.anObjectArray25 = local2428;
						} else if (arg0 == 1405) {
							local137.anObjectArray29 = local2428;
						} else if (arg0 == 1406) {
							local137.anObjectArray6 = local2428;
						} else if (arg0 == 1407) {
							local137.anObjectArray14 = local2428;
							local137.anIntArray278 = local2376;
						} else if (arg0 == 1408) {
							local137.anObjectArray32 = local2428;
						} else if (arg0 == 1409) {
							local137.anObjectArray2 = local2428;
						} else if (arg0 == 1410) {
							local137.anObjectArray12 = local2428;
						} else if (arg0 == 1411) {
							local137.anObjectArray21 = local2428;
						} else if (arg0 == 1412) {
							local137.anObjectArray31 = local2428;
						} else if (arg0 == 1414) {
							local137.anObjectArray18 = local2428;
							local137.anIntArray269 = local2376;
						} else if (arg0 == 1415) {
							local137.anObjectArray22 = local2428;
							local137.anIntArray274 = local2376;
						} else if (arg0 == 1416) {
							local137.anObjectArray24 = local2428;
						} else if (arg0 == 1417) {
							local137.anObjectArray5 = local2428;
						} else if (arg0 == 1418) {
							local137.anObjectArray20 = local2428;
						} else if (arg0 == 1419) {
							local137.anObjectArray16 = local2428;
						} else if (arg0 == 1420) {
							local137.anObjectArray26 = local2428;
						} else if (arg0 == 1421) {
							local137.anObjectArray4 = local2428;
						} else if (arg0 == 1422) {
							local137.anObjectArray3 = local2428;
						} else if (arg0 == 1423) {
							local137.anObjectArray9 = local2428;
						} else if (arg0 == 1424) {
							local137.anObjectArray10 = local2428;
						} else if (arg0 == 1425) {
							local137.anObjectArray27 = local2428;
						} else if (arg0 == 1426) {
							local137.anObjectArray30 = local2428;
						} else if (arg0 == 1427) {
							local137.anObjectArray17 = local2428;
						} else if (arg0 == 1428) {
							local137.anObjectArray15 = local2428;
							local137.anIntArray273 = local2376;
						} else if (arg0 == 1429) {
							local137.anObjectArray23 = local2428;
							local137.anIntArray270 = local2376;
						} else if (arg0 == 1430) {
							local137.anObjectArray8 = local2428;
						}
						local137.aBoolean195 = true;
						return;
					} else if (arg0 < 1600) {
						local137 = arg1 ? aClass97_10 : aClass97_9;
						if (arg0 == 1500) {
							anIntArray323[anInt3825++] = local137.anInt2642;
							return;
						}
						if (arg0 == 1501) {
							anIntArray323[anInt3825++] = local137.anInt2641;
							return;
						}
						if (arg0 == 1502) {
							anIntArray323[anInt3825++] = local137.anInt2690;
							return;
						}
						if (arg0 == 1503) {
							anIntArray323[anInt3825++] = local137.anInt2670;
							return;
						}
						if (arg0 == 1504) {
							anIntArray323[anInt3825++] = local137.aBoolean200 ? 1 : 0;
							return;
						}
						if (arg0 == 1505) {
							anIntArray323[anInt3825++] = local137.anInt2655;
							return;
						}
						if (arg0 == 1506) {
							local158 = Static464.method6495(local137);
							anIntArray323[anInt3825++] = local158 == null ? -1 : local158.anInt2678;
							return;
						}
					} else {
						@Pc(3024) Class348 local3024;
						if (arg0 < 1700) {
							local137 = arg1 ? aClass97_10 : aClass97_9;
							if (arg0 == 1600) {
								anIntArray323[anInt3825++] = local137.anInt2691;
								return;
							}
							if (arg0 == 1601) {
								anIntArray323[anInt3825++] = local137.anInt2665;
								return;
							}
							if (arg0 == 1602) {
								aStringArray20[anInt3833++] = local137.aString18;
								return;
							}
							if (arg0 == 1603) {
								anIntArray323[anInt3825++] = local137.anInt2658;
								return;
							}
							if (arg0 == 1604) {
								anIntArray323[anInt3825++] = local137.anInt2603;
								return;
							}
							if (arg0 == 1605) {
								anIntArray323[anInt3825++] = local137.anInt2683;
								return;
							}
							if (arg0 == 1606) {
								anIntArray323[anInt3825++] = local137.anInt2687;
								return;
							}
							if (arg0 == 1607) {
								anIntArray323[anInt3825++] = local137.anInt2661;
								return;
							}
							if (arg0 == 1608) {
								anIntArray323[anInt3825++] = local137.anInt2639;
								return;
							}
							if (arg0 == 1609) {
								anIntArray323[anInt3825++] = local137.anInt2602;
								return;
							}
							if (arg0 == 1610) {
								anIntArray323[anInt3825++] = local137.anInt2630;
								return;
							}
							if (arg0 == 1611) {
								anIntArray323[anInt3825++] = local137.anInt2614;
								return;
							}
							if (arg0 == 1612) {
								anIntArray323[anInt3825++] = local137.anInt2632;
								return;
							}
							if (arg0 == 1613) {
								local19 = anIntArray323[--anInt3825];
								local3024 = Static111.aClass259_1.method5915(local19);
								if (local3024.method7864()) {
									aStringArray20[anInt3833++] = local137.method2288(local19, local3024.aString92);
									return;
								}
								anIntArray323[anInt3825++] = local137.method2298(local3024.anInt9885, local19);
								return;
							}
							if (arg0 == 1614) {
								anIntArray323[anInt3825++] = local137.anInt2649;
								return;
							}
						} else if (arg0 < 1800) {
							local137 = arg1 ? aClass97_10 : aClass97_9;
							if (arg0 == 1700) {
								anIntArray323[anInt3825++] = local137.anInt2607;
								return;
							}
							if (arg0 == 1701) {
								if (local137.anInt2607 != -1) {
									anIntArray323[anInt3825++] = local137.anInt2660;
									return;
								}
								anIntArray323[anInt3825++] = 0;
								return;
							}
							if (arg0 == 1702) {
								anIntArray323[anInt3825++] = local137.anInt2675;
								return;
							}
						} else if (arg0 < 1900) {
							local137 = arg1 ? aClass97_10 : aClass97_9;
							if (arg0 == 1800) {
								anIntArray323[anInt3825++] = Static74.method1044(local137).method5834();
								return;
							}
							if (arg0 == 1801) {
								local19 = anIntArray323[--anInt3825];
								local19--;
								if (local137.aStringArray11 != null && local19 < local137.aStringArray11.length && local137.aStringArray11[local19] != null) {
									aStringArray20[anInt3833++] = local137.aStringArray11[local19];
									return;
								}
								aStringArray20[anInt3833++] = "";
								return;
							}
							if (arg0 == 1802) {
								if (local137.aString20 == null) {
									aStringArray20[anInt3833++] = "";
									return;
								}
								aStringArray20[anInt3833++] = local137.aString20;
								return;
							}
						} else if (arg0 < 2000 || arg0 >= 2900 && arg0 < 3000) {
							if (arg0 >= 2000) {
								local137 = Static495.method7281(anIntArray323[--anInt3825]);
								arg0 -= 1000;
							} else {
								local137 = arg1 ? aClass97_10 : aClass97_9;
							}
							if (anInt3838 >= 10) {
								throw new RuntimeException("C29xx-1");
							}
							if (arg0 == 1927) {
								if (local137.anObjectArray17 == null) {
									return;
								}
								@Pc(3274) Class6_Sub1 local3274 = new Class6_Sub1();
								local3274.aClass97_2 = local137;
								local3274.anObjectArray1 = local137.anObjectArray17;
								local3274.anInt85 = anInt3838 + 1;
								Static534.aClass298_190.method6812(local3274);
								return;
							}
						} else if (arg0 < 2600) {
							local137 = Static495.method7281(anIntArray323[--anInt3825]);
							if (arg0 == 2500) {
								anIntArray323[anInt3825++] = local137.anInt2642;
								return;
							}
							if (arg0 == 2501) {
								anIntArray323[anInt3825++] = local137.anInt2641;
								return;
							}
							if (arg0 == 2502) {
								anIntArray323[anInt3825++] = local137.anInt2690;
								return;
							}
							if (arg0 == 2503) {
								anIntArray323[anInt3825++] = local137.anInt2670;
								return;
							}
							if (arg0 == 2504) {
								anIntArray323[anInt3825++] = local137.aBoolean200 ? 1 : 0;
								return;
							}
							if (arg0 == 2505) {
								anIntArray323[anInt3825++] = local137.anInt2655;
								return;
							}
							if (arg0 == 1506) {
								local158 = Static464.method6495(local137);
								anIntArray323[anInt3825++] = local158 == null ? -1 : local158.anInt2678;
								return;
							}
						} else if (arg0 < 2700) {
							local137 = Static495.method7281(anIntArray323[--anInt3825]);
							if (arg0 == 2600) {
								anIntArray323[anInt3825++] = local137.anInt2691;
								return;
							}
							if (arg0 == 2601) {
								anIntArray323[anInt3825++] = local137.anInt2665;
								return;
							}
							if (arg0 == 2602) {
								aStringArray20[anInt3833++] = local137.aString18;
								return;
							}
							if (arg0 == 2603) {
								anIntArray323[anInt3825++] = local137.anInt2658;
								return;
							}
							if (arg0 == 2604) {
								anIntArray323[anInt3825++] = local137.anInt2603;
								return;
							}
							if (arg0 == 2605) {
								anIntArray323[anInt3825++] = local137.anInt2683;
								return;
							}
							if (arg0 == 2606) {
								anIntArray323[anInt3825++] = local137.anInt2687;
								return;
							}
							if (arg0 == 2607) {
								anIntArray323[anInt3825++] = local137.anInt2661;
								return;
							}
							if (arg0 == 2608) {
								anIntArray323[anInt3825++] = local137.anInt2639;
								return;
							}
							if (arg0 == 2609) {
								anIntArray323[anInt3825++] = local137.anInt2602;
								return;
							}
							if (arg0 == 2610) {
								anIntArray323[anInt3825++] = local137.anInt2630;
								return;
							}
							if (arg0 == 2611) {
								anIntArray323[anInt3825++] = local137.anInt2614;
								return;
							}
							if (arg0 == 2612) {
								anIntArray323[anInt3825++] = local137.anInt2632;
								return;
							}
							if (arg0 == 2613) {
								anIntArray323[anInt3825++] = local137.anInt2649;
								return;
							}
						} else {
							@Pc(3682) Class6_Sub43 local3682;
							@Pc(3784) Class6_Sub43 local3784;
							if (arg0 < 2800) {
								if (arg0 == 2700) {
									local137 = Static495.method7281(anIntArray323[--anInt3825]);
									anIntArray323[anInt3825++] = local137.anInt2607;
									return;
								}
								if (arg0 == 2701) {
									local137 = Static495.method7281(anIntArray323[--anInt3825]);
									if (local137.anInt2607 != -1) {
										anIntArray323[anInt3825++] = local137.anInt2660;
										return;
									}
									anIntArray323[anInt3825++] = 0;
									return;
								}
								if (arg0 == 2702) {
									local13 = anIntArray323[--anInt3825];
									local3682 = (Class6_Sub43) Static162.aClass234_23.method5464((long) local13);
									if (local3682 != null) {
										anIntArray323[anInt3825++] = 1;
										return;
									}
									anIntArray323[anInt3825++] = 0;
									return;
								}
								if (arg0 == 2703) {
									local137 = Static495.method7281(anIntArray323[--anInt3825]);
									if (local137.aClass97Array2 == null) {
										anIntArray323[anInt3825++] = 0;
										return;
									}
									local19 = local137.aClass97Array2.length;
									for (local25 = 0; local25 < local137.aClass97Array2.length; local25++) {
										if (local137.aClass97Array2[local25] == null) {
											local19 = local25;
											break;
										}
									}
									anIntArray323[anInt3825++] = local19;
									return;
								}
								if (arg0 == 2704 || arg0 == 2705) {
									anInt3825 -= 2;
									local13 = anIntArray323[anInt3825];
									local19 = anIntArray323[anInt3825 + 1];
									local3784 = (Class6_Sub43) Static162.aClass234_23.method5464((long) local13);
									if (local3784 != null && local3784.anInt8192 == local19) {
										anIntArray323[anInt3825++] = 1;
										return;
									}
									anIntArray323[anInt3825++] = 0;
									return;
								}
							} else if (arg0 < 2900) {
								local137 = Static495.method7281(anIntArray323[--anInt3825]);
								if (arg0 == 2800) {
									anIntArray323[anInt3825++] = Static74.method1044(local137).method5834();
									return;
								}
								if (arg0 == 2801) {
									local19 = anIntArray323[--anInt3825];
									@Pc(3848) int local3848 = local19 - 1;
									if (local137.aStringArray11 != null && local3848 < local137.aStringArray11.length && local137.aStringArray11[local3848] != null) {
										aStringArray20[anInt3833++] = local137.aStringArray11[local3848];
										return;
									}
									aStringArray20[anInt3833++] = "";
									return;
								}
								if (arg0 == 2802) {
									if (local137.aString20 == null) {
										aStringArray20[anInt3833++] = "";
										return;
									}
									aStringArray20[anInt3833++] = local137.aString20;
									return;
								}
							} else {
								@Pc(3921) String local3921;
								if (arg0 < 3200) {
									if (arg0 == 3100) {
										local3921 = aStringArray20[--anInt3833];
										Static375.method7252(local3921);
										return;
									}
									if (arg0 == 3101) {
										anInt3825 -= 2;
										Static440.method6242(anIntArray323[anInt3825 + 1], anIntArray323[anInt3825], Static461.aClass15_Sub2_Sub4_Sub2_2);
										return;
									}
									if (arg0 == 3103) {
										Static578.method7902();
										return;
									}
									if (arg0 == 3104) {
										local3921 = aStringArray20[--anInt3833];
										local19 = 0;
										if (Static166.method3816(local3921)) {
											local19 = Static443.method6265(local3921);
										}
										Static534.method7063(Static407.aClass316_91);
										Static340.aClass6_Sub12_Sub2_1.method6042(local19);
										return;
									}
									if (arg0 == 3105) {
										local3921 = aStringArray20[--anInt3833];
										Static534.method7063(Static513.aClass316_110);
										Static340.aClass6_Sub12_Sub2_1.method6047(local3921.length() + 1);
										Static340.aClass6_Sub12_Sub2_1.method6009(local3921);
										return;
									}
									if (arg0 == 3106) {
										local3921 = aStringArray20[--anInt3833];
										Static534.method7063(Static155.aClass316_36);
										Static340.aClass6_Sub12_Sub2_1.method6047(local3921.length() + 1);
										Static340.aClass6_Sub12_Sub2_1.method6009(local3921);
										return;
									}
									if (arg0 == 3107) {
										local13 = anIntArray323[--anInt3825];
										local1101 = aStringArray20[--anInt3833];
										Static382.method5591(local13, local1101);
										return;
									}
									if (arg0 == 3108) {
										anInt3825 -= 3;
										local13 = anIntArray323[anInt3825];
										local19 = anIntArray323[anInt3825 + 1];
										local25 = anIntArray323[anInt3825 + 2];
										local35 = Static495.method7281(local25);
										Static151.method2390(local35, local13, local19);
										return;
									}
									if (arg0 == 3109) {
										anInt3825 -= 2;
										local13 = anIntArray323[anInt3825];
										local19 = anIntArray323[anInt3825 + 1];
										local210 = arg1 ? aClass97_10 : aClass97_9;
										Static151.method2390(local210, local13, local19);
										return;
									}
									if (arg0 == 3110) {
										local13 = anIntArray323[--anInt3825];
										Static534.method7063(Static161.aClass316_39);
										Static340.aClass6_Sub12_Sub2_1.method6032(local13);
										return;
									}
									if (arg0 == 3111) {
										anInt3825 -= 2;
										local13 = anIntArray323[anInt3825];
										local19 = anIntArray323[anInt3825 + 1];
										local3784 = (Class6_Sub43) Static162.aClass234_23.method5464((long) local13);
										if (local3784 != null) {
											Static536.method7299(true, local3784.anInt8192 != local19, local3784);
										}
										Static287.method4366(local13, true, 3, local19);
										return;
									}
									if (arg0 == 3112) {
										anInt3825--;
										local13 = anIntArray323[anInt3825];
										local3682 = (Class6_Sub43) Static162.aClass234_23.method5464((long) local13);
										if (local3682 != null && local3682.anInt8194 == 3) {
											Static536.method7299(true, true, local3682);
										}
										return;
									}
									if (arg0 == 3113) {
										Static573.method7854(aStringArray20[--anInt3833]);
										return;
									}
									if (arg0 == 3114) {
										anInt3825 -= 2;
										local13 = anIntArray323[anInt3825];
										local19 = anIntArray323[anInt3825 + 1];
										local1488 = aStringArray20[--anInt3833];
										Static170.method2697("", "", "", local13, local1488, local19);
										return;
									}
								} else if (arg0 < 3300) {
									if (arg0 == 3200) {
										anInt3825 -= 3;
										Static264.method4005(anIntArray323[anInt3825], anIntArray323[anInt3825 + 1], 255, anIntArray323[anInt3825 + 2]);
										return;
									}
									if (arg0 == 3201) {
										Static151.method2393(anIntArray323[--anInt3825], 50, 255);
										return;
									}
									if (arg0 == 3202) {
										anInt3825 -= 2;
										Static62.method894(anIntArray323[anInt3825], anIntArray323[anInt3825 + 1], 255);
										return;
									}
									if (arg0 == 3203) {
										anInt3825 -= 4;
										Static264.method4005(anIntArray323[anInt3825], anIntArray323[anInt3825 + 1], anIntArray323[anInt3825 + 3], anIntArray323[anInt3825 + 2]);
										return;
									}
									if (arg0 == 3204) {
										anInt3825 -= 3;
										Static151.method2393(anIntArray323[anInt3825], anIntArray323[anInt3825 + 2], anIntArray323[anInt3825 + 1]);
										return;
									}
									if (arg0 == 3205) {
										anInt3825 -= 3;
										Static62.method894(anIntArray323[anInt3825], anIntArray323[anInt3825 + 1], anIntArray323[anInt3825 + 2]);
										return;
									}
									if (arg0 == 3206) {
										anInt3825 -= 4;
										Static541.method7364(anIntArray323[anInt3825 + 3], anIntArray323[anInt3825 + 1], false, anIntArray323[anInt3825 + 2], anIntArray323[anInt3825]);
										return;
									}
									if (arg0 == 3207) {
										anInt3825 -= 4;
										Static541.method7364(anIntArray323[anInt3825 + 3], anIntArray323[anInt3825 + 1], true, anIntArray323[anInt3825 + 2], anIntArray323[anInt3825]);
										return;
									}
								} else if (arg0 < 3400) {
									if (arg0 == 3300) {
										anIntArray323[anInt3825++] = Static363.anInt6671;
										return;
									}
									if (arg0 == 3301) {
										anInt3825 -= 2;
										local13 = anIntArray323[anInt3825];
										local19 = anIntArray323[anInt3825 + 1];
										anIntArray323[anInt3825++] = Static133.method2177(local19, local13, false);
										return;
									}
									if (arg0 == 3302) {
										anInt3825 -= 2;
										local13 = anIntArray323[anInt3825];
										local19 = anIntArray323[anInt3825 + 1];
										anIntArray323[anInt3825++] = Static217.method3477(local19, local13, false);
										return;
									}
									if (arg0 == 3303) {
										anInt3825 -= 2;
										local13 = anIntArray323[anInt3825];
										local19 = anIntArray323[anInt3825 + 1];
										anIntArray323[anInt3825++] = Static4.method71(local13, false, local19);
										return;
									}
									if (arg0 == 3304) {
										local13 = anIntArray323[--anInt3825];
										anIntArray323[anInt3825++] = Static410.aClass21_1.method354(local13).anInt5543;
										return;
									}
									if (arg0 == 3305) {
										local13 = anIntArray323[--anInt3825];
										anIntArray323[anInt3825++] = Static108.anIntArray154[local13];
										return;
									}
									if (arg0 == 3306) {
										local13 = anIntArray323[--anInt3825];
										anIntArray323[anInt3825++] = Static47.anIntArray37[local13];
										return;
									}
									if (arg0 == 3307) {
										local13 = anIntArray323[--anInt3825];
										anIntArray323[anInt3825++] = Static113.anIntArray166[local13];
										return;
									}
									if (arg0 == 3308) {
										@Pc(4669) byte local4669 = Static461.aClass15_Sub2_Sub4_Sub2_2.aByte98;
										local19 = (Static461.aClass15_Sub2_Sub4_Sub2_2.anInt8911 >> 9) + Static150.anInt2792;
										local25 = (Static461.aClass15_Sub2_Sub4_Sub2_2.anInt8913 >> 9) + Static154.anInt2878;
										anIntArray323[anInt3825++] = (local4669 << 28) + (local19 << 14) + local25;
										return;
									}
									if (arg0 == 3309) {
										local13 = anIntArray323[--anInt3825];
										anIntArray323[anInt3825++] = local13 >> 14 & 0x3FFF;
										return;
									}
									if (arg0 == 3310) {
										local13 = anIntArray323[--anInt3825];
										anIntArray323[anInt3825++] = local13 >> 28;
										return;
									}
									if (arg0 == 3311) {
										local13 = anIntArray323[--anInt3825];
										anIntArray323[anInt3825++] = local13 & 0x3FFF;
										return;
									}
									if (arg0 == 3312) {
										anIntArray323[anInt3825++] = Static485.aBoolean557 ? 1 : 0;
										return;
									}
									if (arg0 == 3313) {
										anInt3825 -= 2;
										local13 = anIntArray323[anInt3825];
										local19 = anIntArray323[anInt3825 + 1];
										anIntArray323[anInt3825++] = Static133.method2177(local19, local13, true);
										return;
									}
									if (arg0 == 3314) {
										anInt3825 -= 2;
										local13 = anIntArray323[anInt3825];
										local19 = anIntArray323[anInt3825 + 1];
										anIntArray323[anInt3825++] = Static217.method3477(local19, local13, true);
										return;
									}
									if (arg0 == 3315) {
										anInt3825 -= 2;
										local13 = anIntArray323[anInt3825];
										local19 = anIntArray323[anInt3825 + 1];
										anIntArray323[anInt3825++] = Static4.method71(local13, true, local19);
										return;
									}
									if (arg0 == 3316) {
										if (Static113.anInt1927 >= 2) {
											anIntArray323[anInt3825++] = Static113.anInt1927;
											return;
										}
										anIntArray323[anInt3825++] = 0;
										return;
									}
									if (arg0 == 3317) {
										anIntArray323[anInt3825++] = Static503.anInt8751;
										return;
									}
									if (arg0 == 3318) {
										anIntArray323[anInt3825++] = Static65.aClass297_1.anInt8579;
										return;
									}
									if (arg0 == 3321) {
										anIntArray323[anInt3825++] = Static205.anInt3900;
										return;
									}
									if (arg0 == 3322) {
										anIntArray323[anInt3825++] = Static581.anInt9937;
										return;
									}
									if (arg0 == 3323) {
										if (Static362.anInt6657 >= 5 && Static362.anInt6657 <= 9) {
											anIntArray323[anInt3825++] = 1;
											return;
										}
										anIntArray323[anInt3825++] = 0;
										return;
									}
									if (arg0 == 3324) {
										if (Static362.anInt6657 >= 5 && Static362.anInt6657 <= 9) {
											anIntArray323[anInt3825++] = Static362.anInt6657;
											return;
										}
										anIntArray323[anInt3825++] = 0;
										return;
									}
									if (arg0 == 3325) {
										anIntArray323[anInt3825++] = Static241.aBoolean324 ? 1 : 0;
										return;
									}
									if (arg0 == 3326) {
										anIntArray323[anInt3825++] = Static461.aClass15_Sub2_Sub4_Sub2_2.anInt9001;
										return;
									}
									if (arg0 == 3327) {
										anIntArray323[anInt3825++] = Static461.aClass15_Sub2_Sub4_Sub2_2.aClass212_1.aBoolean444 ? 1 : 0;
										return;
									}
									if (arg0 == 3329) {
										anIntArray323[anInt3825++] = Static255.aBoolean345 ? 1 : 0;
										return;
									}
									if (arg0 == 3330) {
										local13 = anIntArray323[--anInt3825];
										anIntArray323[anInt3825++] = Static153.method2444(local13);
										return;
									}
									if (arg0 == 3331) {
										anInt3825 -= 2;
										local13 = anIntArray323[anInt3825];
										local19 = anIntArray323[anInt3825 + 1];
										anIntArray323[anInt3825++] = Static427.method6072(local19, local13, false);
										return;
									}
									if (arg0 == 3332) {
										anInt3825 -= 2;
										local13 = anIntArray323[anInt3825];
										local19 = anIntArray323[anInt3825 + 1];
										anIntArray323[anInt3825++] = Static427.method6072(local19, local13, true);
										return;
									}
									if (arg0 == 3333) {
										anIntArray323[anInt3825++] = Static526.anInt9112;
										return;
									}
									if (arg0 == 3335) {
										anIntArray323[anInt3825++] = Static188.anInt28;
										return;
									}
									if (arg0 == 3336) {
										anInt3825 -= 4;
										local13 = anIntArray323[anInt3825];
										local19 = anIntArray323[anInt3825 + 1];
										local25 = anIntArray323[anInt3825 + 2];
										local353 = anIntArray323[anInt3825 + 3];
										local13 += local19 << 14;
										local13 += local25 << 28;
										local13 += local353;
										anIntArray323[anInt3825++] = local13;
										return;
									}
									if (arg0 == 3337) {
										anIntArray323[anInt3825++] = Static543.anInt9322;
										return;
									}
									if (arg0 == 3338) {
										anIntArray323[anInt3825++] = Static31.method504();
										return;
									}
									if (arg0 == 3339) {
										anIntArray323[anInt3825++] = Static580.aBoolean672 ? 1 : 0;
										return;
									}
									if (arg0 == 3340) {
										anIntArray323[anInt3825++] = Static162.aBoolean225 ? 1 : 0;
										return;
									}
									if (arg0 == 3341) {
										anIntArray323[anInt3825++] = Static340.aBoolean452 ? 1 : 0;
										return;
									}
									if (arg0 == 3342) {
										anIntArray323[anInt3825++] = Static9.aClass29_1.method2946();
										return;
									}
									if (arg0 == 3343) {
										anIntArray323[anInt3825++] = Static9.aClass29_1.method2942();
										return;
									}
									if (arg0 == 3344) {
										aStringArray20[anInt3833++] = Static403.method5823();
										return;
									}
									if (arg0 == 3345) {
										aStringArray20[anInt3833++] = Static401.method5806();
										return;
									}
									if (arg0 == 3346) {
										anIntArray323[anInt3825++] = Static349.method5298();
										return;
									}
									if (arg0 == 3347) {
										anIntArray323[anInt3825++] = Static500.anInt8696;
										return;
									}
								} else if (arg0 < 3500) {
									@Pc(5404) Class75 local5404;
									if (arg0 == 3400) {
										anInt3825 -= 2;
										local13 = anIntArray323[anInt3825];
										local19 = anIntArray323[anInt3825 + 1];
										local5404 = Static86.aClass94_7.method2175(local13);
										aStringArray20[anInt3833++] = local5404.method1456(local19);
										return;
									}
									if (arg0 == 3408) {
										anInt3825 -= 4;
										local13 = anIntArray323[anInt3825];
										local19 = anIntArray323[anInt3825 + 1];
										local25 = anIntArray323[anInt3825 + 2];
										local353 = anIntArray323[anInt3825 + 3];
										@Pc(5450) Class75 local5450 = Static86.aClass94_7.method2175(local25);
										if (local5450.aChar2 == local13 && local5450.aChar1 == local19) {
											if (local19 == 115) {
												aStringArray20[anInt3833++] = local5450.method1456(local353);
												return;
											}
											anIntArray323[anInt3825++] = local5450.method1460(local353);
											return;
										}
										throw new RuntimeException("C3408-1");
									}
									if (arg0 == 3409) {
										anInt3825 -= 3;
										local13 = anIntArray323[anInt3825];
										local19 = anIntArray323[anInt3825 + 1];
										local25 = anIntArray323[anInt3825 + 2];
										if (local19 == -1) {
											throw new RuntimeException("C3409-2");
										}
										@Pc(5526) Class75 local5526 = Static86.aClass94_7.method2175(local19);
										if (local5526.aChar1 != local13) {
											throw new RuntimeException("C3409-1");
										}
										anIntArray323[anInt3825++] = local5526.method1457(local25) ? 1 : 0;
										return;
									}
									if (arg0 == 3410) {
										local13 = anIntArray323[--anInt3825];
										local1101 = aStringArray20[--anInt3833];
										if (local13 == -1) {
											throw new RuntimeException("C3410-2");
										}
										local5404 = Static86.aClass94_7.method2175(local13);
										if (local5404.aChar1 != 's') {
											throw new RuntimeException("C3410-1");
										}
										anIntArray323[anInt3825++] = local5404.method1458(local1101) ? 1 : 0;
										return;
									}
									if (arg0 == 3411) {
										local13 = anIntArray323[--anInt3825];
										@Pc(5624) Class75 local5624 = Static86.aClass94_7.method2175(local13);
										anIntArray323[anInt3825++] = local5624.aClass234_11.method5460();
										return;
									}
								} else if (arg0 < 3700) {
									if (arg0 == 3600) {
										if (Static212.anInt9970 == 0) {
											anIntArray323[anInt3825++] = -2;
											return;
										}
										if (Static212.anInt9970 == 1) {
											anIntArray323[anInt3825++] = -1;
											return;
										}
										anIntArray323[anInt3825++] = Static569.anInt9840;
										return;
									}
									if (arg0 == 3601) {
										local13 = anIntArray323[--anInt3825];
										if (Static212.anInt9970 == 2 && local13 < Static569.anInt9840) {
											aStringArray20[anInt3833++] = Static326.aStringArray26[local13];
											if (Static114.aStringArray8[local13] != null) {
												aStringArray20[anInt3833++] = Static114.aStringArray8[local13];
												return;
											}
											aStringArray20[anInt3833++] = "";
											return;
										}
										aStringArray20[anInt3833++] = "";
										aStringArray20[anInt3833++] = "";
										return;
									}
									if (arg0 == 3602) {
										local13 = anIntArray323[--anInt3825];
										if (Static212.anInt9970 == 2 && local13 < Static569.anInt9840) {
											anIntArray323[anInt3825++] = Static392.anIntArray501[local13];
											return;
										}
										anIntArray323[anInt3825++] = 0;
										return;
									}
									if (arg0 == 3603) {
										local13 = anIntArray323[--anInt3825];
										if (Static212.anInt9970 == 2 && local13 < Static569.anInt9840) {
											anIntArray323[anInt3825++] = Static250.anIntArray378[local13];
											return;
										}
										anIntArray323[anInt3825++] = 0;
										return;
									}
									if (arg0 == 3604) {
										local3921 = aStringArray20[--anInt3833];
										local19 = anIntArray323[--anInt3825];
										Static555.method7723(local3921, local19);
										return;
									}
									if (arg0 == 3605) {
										local3921 = aStringArray20[--anInt3833];
										Static345.method5271(local3921);
										return;
									}
									if (arg0 == 3606) {
										local3921 = aStringArray20[--anInt3833];
										Static554.method7713(local3921);
										return;
									}
									if (arg0 == 3607) {
										local3921 = aStringArray20[--anInt3833];
										Static393.method5717(local3921, false);
										return;
									}
									if (arg0 == 3608) {
										local3921 = aStringArray20[--anInt3833];
										Static177.method2957(local3921);
										return;
									}
									if (arg0 == 3609) {
										local3921 = aStringArray20[--anInt3833];
										if (local3921.startsWith("<img=0>") || local3921.startsWith("<img=1>")) {
											local3921 = local3921.substring(7);
										}
										anIntArray323[anInt3825++] = Static439.method6213(local3921) ? 1 : 0;
										return;
									}
									if (arg0 == 3610) {
										local13 = anIntArray323[--anInt3825];
										if (Static212.anInt9970 == 2 && local13 < Static569.anInt9840) {
											aStringArray20[anInt3833++] = Static125.aStringArray9[local13];
											return;
										}
										aStringArray20[anInt3833++] = "";
										return;
									}
									if (arg0 == 3611) {
										if (Static486.aString71 != null) {
											aStringArray20[anInt3833++] = Static424.method5982(Static486.aString71);
											return;
										}
										aStringArray20[anInt3833++] = "";
										return;
									}
									if (arg0 == 3612) {
										if (Static486.aString71 != null) {
											anIntArray323[anInt3825++] = Static181.anInt3476;
											return;
										}
										anIntArray323[anInt3825++] = 0;
										return;
									}
									if (arg0 == 3613) {
										local13 = anIntArray323[--anInt3825];
										if (Static486.aString71 != null && local13 < Static181.anInt3476) {
											aStringArray20[anInt3833++] = Static175.aClass264Array1[local13].aString62;
											return;
										}
										aStringArray20[anInt3833++] = "";
										return;
									}
									if (arg0 == 3614) {
										local13 = anIntArray323[--anInt3825];
										if (Static486.aString71 != null && local13 < Static181.anInt3476) {
											anIntArray323[anInt3825++] = Static175.aClass264Array1[local13].anInt7490;
											return;
										}
										anIntArray323[anInt3825++] = 0;
										return;
									}
									if (arg0 == 3615) {
										local13 = anIntArray323[--anInt3825];
										if (Static486.aString71 != null && local13 < Static181.anInt3476) {
											anIntArray323[anInt3825++] = Static175.aClass264Array1[local13].aByte85;
											return;
										}
										anIntArray323[anInt3825++] = 0;
										return;
									}
									if (arg0 == 3616) {
										anIntArray323[anInt3825++] = Static397.aByte83;
										return;
									}
									if (arg0 == 3617) {
										local3921 = aStringArray20[--anInt3833];
										Static428.method6092(local3921);
										return;
									}
									if (arg0 == 3618) {
										anIntArray323[anInt3825++] = Static76.aByte10;
										return;
									}
									if (arg0 == 3619) {
										local3921 = aStringArray20[--anInt3833];
										Static106.method3434(local3921);
										return;
									}
									if (arg0 == 3620) {
										Static301.method4551();
										return;
									}
									if (arg0 == 3621) {
										if (Static212.anInt9970 == 0) {
											anIntArray323[anInt3825++] = -1;
											return;
										}
										anIntArray323[anInt3825++] = Static244.anInt4491;
										return;
									}
									if (arg0 == 3622) {
										local13 = anIntArray323[--anInt3825];
										if (Static212.anInt9970 != 0 && local13 < Static244.anInt4491) {
											aStringArray20[anInt3833++] = Static74.aStringArray5[local13];
											if (Static41.aStringArray4[local13] != null) {
												aStringArray20[anInt3833++] = Static41.aStringArray4[local13];
												return;
											}
											aStringArray20[anInt3833++] = "";
											return;
										}
										aStringArray20[anInt3833++] = "";
										aStringArray20[anInt3833++] = "";
										return;
									}
									if (arg0 == 3623) {
										local3921 = aStringArray20[--anInt3833];
										if (local3921.startsWith("<img=0>") || local3921.startsWith("<img=1>")) {
											local3921 = local3921.substring(7);
										}
										anIntArray323[anInt3825++] = Static170.method2693(local3921) ? 1 : 0;
										return;
									}
									if (arg0 == 3624) {
										local13 = anIntArray323[--anInt3825];
										if (Static175.aClass264Array1 != null && local13 < Static181.anInt3476 && Static175.aClass264Array1[local13].aString61.equalsIgnoreCase(Static461.aClass15_Sub2_Sub4_Sub2_2.aString82)) {
											anIntArray323[anInt3825++] = 1;
											return;
										}
										anIntArray323[anInt3825++] = 0;
										return;
									}
									if (arg0 == 3625) {
										if (Static422.aString58 != null) {
											aStringArray20[anInt3833++] = Static422.aString58;
											return;
										}
										aStringArray20[anInt3833++] = "";
										return;
									}
									if (arg0 == 3626) {
										local13 = anIntArray323[--anInt3825];
										if (Static486.aString71 != null && local13 < Static181.anInt3476) {
											aStringArray20[anInt3833++] = Static175.aClass264Array1[local13].aString60;
											return;
										}
										aStringArray20[anInt3833++] = "";
										return;
									}
									if (arg0 == 3627) {
										local13 = anIntArray323[--anInt3825];
										if (Static212.anInt9970 == 2 && local13 >= 0 && local13 < Static569.anInt9840) {
											anIntArray323[anInt3825++] = Static173.aBooleanArray13[local13] ? 1 : 0;
											return;
										}
										anIntArray323[anInt3825++] = 0;
										return;
									}
									if (arg0 == 3628) {
										local3921 = aStringArray20[--anInt3833];
										if (local3921.startsWith("<img=0>") || local3921.startsWith("<img=1>")) {
											local3921 = local3921.substring(7);
										}
										anIntArray323[anInt3825++] = Static536.method7297(local3921);
										return;
									}
									if (arg0 == 3629) {
										anIntArray323[anInt3825++] = Static311.anInt5726;
										return;
									}
									if (arg0 == 3630) {
										local3921 = aStringArray20[--anInt3833];
										Static393.method5717(local3921, true);
										return;
									}
									if (arg0 == 3631) {
										local13 = anIntArray323[--anInt3825];
										anIntArray323[anInt3825++] = Static300.aBooleanArray19[local13] ? 1 : 0;
										return;
									}
									if (arg0 == 3632) {
										local13 = anIntArray323[--anInt3825];
										if (Static486.aString71 != null && local13 < Static181.anInt3476) {
											aStringArray20[anInt3833++] = Static175.aClass264Array1[local13].aString61;
											return;
										}
										aStringArray20[anInt3833++] = "";
										return;
									}
									if (arg0 == 3633) {
										local13 = anIntArray323[--anInt3825];
										if (Static212.anInt9970 != 0 && local13 < Static244.anInt4491) {
											aStringArray20[anInt3833++] = Static328.aStringArray27[local13];
											return;
										}
										aStringArray20[anInt3833++] = "";
										return;
									}
								} else if (arg0 < 4000) {
									if (arg0 == 3903) {
										local13 = anIntArray323[--anInt3825];
										anIntArray323[anInt3825++] = Static580.aClass99Array1[local13].method2340();
										return;
									}
									if (arg0 == 3904) {
										local13 = anIntArray323[--anInt3825];
										anIntArray323[anInt3825++] = Static580.aClass99Array1[local13].anInt2745;
										return;
									}
									if (arg0 == 3905) {
										local13 = anIntArray323[--anInt3825];
										anIntArray323[anInt3825++] = Static580.aClass99Array1[local13].anInt2746;
										return;
									}
									if (arg0 == 3906) {
										local13 = anIntArray323[--anInt3825];
										anIntArray323[anInt3825++] = Static580.aClass99Array1[local13].anInt2749;
										return;
									}
									if (arg0 == 3907) {
										local13 = anIntArray323[--anInt3825];
										anIntArray323[anInt3825++] = Static580.aClass99Array1[local13].anInt2747;
										return;
									}
									if (arg0 == 3908) {
										local13 = anIntArray323[--anInt3825];
										anIntArray323[anInt3825++] = Static580.aClass99Array1[local13].anInt2748;
										return;
									}
									if (arg0 == 3910) {
										local13 = anIntArray323[--anInt3825];
										local19 = Static580.aClass99Array1[local13].method2339();
										anIntArray323[anInt3825++] = local19 == 0 ? 1 : 0;
										return;
									}
									if (arg0 == 3911) {
										local13 = anIntArray323[--anInt3825];
										local19 = Static580.aClass99Array1[local13].method2339();
										anIntArray323[anInt3825++] = local19 == 2 ? 1 : 0;
										return;
									}
									if (arg0 == 3912) {
										local13 = anIntArray323[--anInt3825];
										local19 = Static580.aClass99Array1[local13].method2339();
										anIntArray323[anInt3825++] = local19 == 5 ? 1 : 0;
										return;
									}
									if (arg0 == 3913) {
										local13 = anIntArray323[--anInt3825];
										local19 = Static580.aClass99Array1[local13].method2339();
										anIntArray323[anInt3825++] = local19 == 1 ? 1 : 0;
										return;
									}
								} else if (arg0 < 4100) {
									if (arg0 == 4000) {
										anInt3825 -= 2;
										local13 = anIntArray323[anInt3825];
										local19 = anIntArray323[anInt3825 + 1];
										anIntArray323[anInt3825++] = local13 + local19;
										return;
									}
									if (arg0 == 4001) {
										anInt3825 -= 2;
										local13 = anIntArray323[anInt3825];
										local19 = anIntArray323[anInt3825 + 1];
										anIntArray323[anInt3825++] = local13 - local19;
										return;
									}
									if (arg0 == 4002) {
										anInt3825 -= 2;
										local13 = anIntArray323[anInt3825];
										local19 = anIntArray323[anInt3825 + 1];
										anIntArray323[anInt3825++] = local13 * local19;
										return;
									}
									if (arg0 == 4003) {
										anInt3825 -= 2;
										local13 = anIntArray323[anInt3825];
										local19 = anIntArray323[anInt3825 + 1];
										anIntArray323[anInt3825++] = local13 / local19;
										return;
									}
									if (arg0 == 4004) {
										local13 = anIntArray323[--anInt3825];
										anIntArray323[anInt3825++] = (int) (Math.random() * (double) local13);
										return;
									}
									if (arg0 == 4005) {
										local13 = anIntArray323[--anInt3825];
										anIntArray323[anInt3825++] = (int) (Math.random() * (double) (local13 + 1));
										return;
									}
									if (arg0 == 4006) {
										anInt3825 -= 5;
										local13 = anIntArray323[anInt3825];
										local19 = anIntArray323[anInt3825 + 1];
										local25 = anIntArray323[anInt3825 + 2];
										local353 = anIntArray323[anInt3825 + 3];
										local2290 = anIntArray323[anInt3825 + 4];
										anIntArray323[anInt3825++] = local13 + (local19 - local13) * (local2290 - local25) / (local353 - local25);
										return;
									}
									@Pc(7134) long local7134;
									@Pc(7127) long local7127;
									if (arg0 == 4007) {
										anInt3825 -= 2;
										local7127 = anIntArray323[anInt3825];
										local7134 = anIntArray323[anInt3825 + 1];
										anIntArray323[anInt3825++] = (int) (local7127 + local7127 * local7134 / 100L);
										return;
									}
									if (arg0 == 4008) {
										anInt3825 -= 2;
										local13 = anIntArray323[anInt3825];
										local19 = anIntArray323[anInt3825 + 1];
										anIntArray323[anInt3825++] = local13 | 0x1 << local19;
										return;
									}
									if (arg0 == 4009) {
										anInt3825 -= 2;
										local13 = anIntArray323[anInt3825];
										local19 = anIntArray323[anInt3825 + 1];
										anIntArray323[anInt3825++] = local13 & -(0x1 << local19) - 1;
										return;
									}
									if (arg0 == 4010) {
										anInt3825 -= 2;
										local13 = anIntArray323[anInt3825];
										local19 = anIntArray323[anInt3825 + 1];
										anIntArray323[anInt3825++] = (local13 & 0x1 << local19) == 0 ? 0 : 1;
										return;
									}
									if (arg0 == 4011) {
										anInt3825 -= 2;
										local13 = anIntArray323[anInt3825];
										local19 = anIntArray323[anInt3825 + 1];
										anIntArray323[anInt3825++] = local13 % local19;
										return;
									}
									if (arg0 == 4012) {
										anInt3825 -= 2;
										local13 = anIntArray323[anInt3825];
										local19 = anIntArray323[anInt3825 + 1];
										if (local13 == 0) {
											anIntArray323[anInt3825++] = 0;
											return;
										}
										anIntArray323[anInt3825++] = (int) Math.pow((double) local13, (double) local19);
										return;
									}
									if (arg0 == 4013) {
										anInt3825 -= 2;
										local13 = anIntArray323[anInt3825];
										local19 = anIntArray323[anInt3825 + 1];
										if (local13 == 0) {
											anIntArray323[anInt3825++] = 0;
											return;
										}
										if (local19 == 0) {
											anIntArray323[anInt3825++] = Integer.MAX_VALUE;
											return;
										}
										anIntArray323[anInt3825++] = (int) Math.pow((double) local13, 1.0D / (double) local19);
										return;
									}
									if (arg0 == 4014) {
										anInt3825 -= 2;
										local13 = anIntArray323[anInt3825];
										local19 = anIntArray323[anInt3825 + 1];
										anIntArray323[anInt3825++] = local13 & local19;
										return;
									}
									if (arg0 == 4015) {
										anInt3825 -= 2;
										local13 = anIntArray323[anInt3825];
										local19 = anIntArray323[anInt3825 + 1];
										anIntArray323[anInt3825++] = local13 | local19;
										return;
									}
									if (arg0 == 4016) {
										anInt3825 -= 2;
										local13 = anIntArray323[anInt3825];
										local19 = anIntArray323[anInt3825 + 1];
										anIntArray323[anInt3825++] = local13 < local19 ? local13 : local19;
										return;
									}
									if (arg0 == 4017) {
										anInt3825 -= 2;
										local13 = anIntArray323[anInt3825];
										local19 = anIntArray323[anInt3825 + 1];
										anIntArray323[anInt3825++] = local13 > local19 ? local13 : local19;
										return;
									}
									if (arg0 == 4018) {
										anInt3825 -= 3;
										local7127 = anIntArray323[anInt3825];
										local7134 = anIntArray323[anInt3825 + 1];
										@Pc(7515) long local7515 = (long) anIntArray323[anInt3825 + 2];
										anIntArray323[anInt3825++] = (int) (local7127 * local7515 / local7134);
										return;
									}
								} else if (arg0 < 4200) {
									if (arg0 == 4100) {
										local3921 = aStringArray20[--anInt3833];
										local19 = anIntArray323[--anInt3825];
										aStringArray20[anInt3833++] = local3921 + local19;
										return;
									}
									if (arg0 == 4101) {
										anInt3833 -= 2;
										local3921 = aStringArray20[anInt3833];
										local1101 = aStringArray20[anInt3833 + 1];
										aStringArray20[anInt3833++] = local3921 + local1101;
										return;
									}
									if (arg0 == 4102) {
										local3921 = aStringArray20[--anInt3833];
										local19 = anIntArray323[--anInt3825];
										aStringArray20[anInt3833++] = local3921 + Static97.method1429(local19);
										return;
									}
									if (arg0 == 4103) {
										local3921 = aStringArray20[--anInt3833];
										aStringArray20[anInt3833++] = local3921.toLowerCase();
										return;
									}
									if (arg0 == 4104) {
										aStringArray20[anInt3833++] = method3317(anIntArray323[--anInt3825]);
										return;
									}
									if (arg0 == 4105) {
										anInt3833 -= 2;
										local3921 = aStringArray20[anInt3833];
										local1101 = aStringArray20[anInt3833 + 1];
										if (Static461.aClass15_Sub2_Sub4_Sub2_2.aClass212_1 != null && Static461.aClass15_Sub2_Sub4_Sub2_2.aClass212_1.aBoolean444) {
											aStringArray20[anInt3833++] = local1101;
											return;
										}
										aStringArray20[anInt3833++] = local3921;
										return;
									}
									if (arg0 == 4106) {
										local13 = anIntArray323[--anInt3825];
										aStringArray20[anInt3833++] = Integer.toString(local13);
										return;
									}
									if (arg0 == 4107) {
										anInt3833 -= 2;
										anIntArray323[anInt3825++] = Static487.method6843(Static188.anInt28, aStringArray20[anInt3833 + 1], aStringArray20[anInt3833]);
										return;
									}
									@Pc(7798) Class202 local7798;
									if (arg0 == 4108) {
										local3921 = aStringArray20[--anInt3833];
										anInt3825 -= 2;
										local19 = anIntArray323[anInt3825];
										local25 = anIntArray323[anInt3825 + 1];
										local7798 = Static129.method1978(Static550.aClass248_107, local25);
										anIntArray323[anInt3825++] = local7798.method4976(local3921, local19, Static390.aClass71Array43);
										return;
									}
									if (arg0 == 4109) {
										local3921 = aStringArray20[--anInt3833];
										anInt3825 -= 2;
										local19 = anIntArray323[anInt3825];
										local25 = anIntArray323[anInt3825 + 1];
										local7798 = Static129.method1978(Static550.aClass248_107, local25);
										anIntArray323[anInt3825++] = local7798.method4974(local3921, local19, Static390.aClass71Array43);
										return;
									}
									if (arg0 == 4110) {
										anInt3833 -= 2;
										local3921 = aStringArray20[anInt3833];
										local1101 = aStringArray20[anInt3833 + 1];
										if (anIntArray323[--anInt3825] == 1) {
											aStringArray20[anInt3833++] = local3921;
											return;
										}
										aStringArray20[anInt3833++] = local1101;
										return;
									}
									if (arg0 == 4111) {
										local3921 = aStringArray20[--anInt3833];
										aStringArray20[anInt3833++] = Static344.method5254(local3921);
										return;
									}
									if (arg0 == 4112) {
										local3921 = aStringArray20[--anInt3833];
										local19 = anIntArray323[--anInt3825];
										if (local19 == -1) {
											throw new RuntimeException("null char");
										}
										aStringArray20[anInt3833++] = local3921 + (char) local19;
										return;
									}
									if (arg0 == 4113) {
										local13 = anIntArray323[--anInt3825];
										anIntArray323[anInt3825++] = Static244.method3821((char) local13) ? 1 : 0;
										return;
									}
									if (arg0 == 4114) {
										local13 = anIntArray323[--anInt3825];
										anIntArray323[anInt3825++] = Static524.method7200((char) local13) ? 1 : 0;
										return;
									}
									if (arg0 == 4115) {
										local13 = anIntArray323[--anInt3825];
										anIntArray323[anInt3825++] = Static178.method2972((char) local13) ? 1 : 0;
										return;
									}
									if (arg0 == 4116) {
										local13 = anIntArray323[--anInt3825];
										anIntArray323[anInt3825++] = Static407.method5855((char) local13) ? 1 : 0;
										return;
									}
									if (arg0 == 4117) {
										local3921 = aStringArray20[--anInt3833];
										if (local3921 != null) {
											anIntArray323[anInt3825++] = local3921.length();
											return;
										}
										anIntArray323[anInt3825++] = 0;
										return;
									}
									if (arg0 == 4118) {
										local3921 = aStringArray20[--anInt3833];
										anInt3825 -= 2;
										local19 = anIntArray323[anInt3825];
										local25 = anIntArray323[anInt3825 + 1];
										aStringArray20[anInt3833++] = local3921.substring(local19, local25);
										return;
									}
									if (arg0 == 4119) {
										local3921 = aStringArray20[--anInt3833];
										@Pc(8161) StringBuffer local8161 = new StringBuffer(local3921.length());
										@Pc(8163) boolean local8163 = false;
										for (local353 = 0; local353 < local3921.length(); local353++) {
											@Pc(8170) char local8170 = local3921.charAt(local353);
											if (local8170 == '<') {
												local8163 = true;
											} else if (local8170 == '>') {
												local8163 = false;
											} else if (!local8163) {
												local8161.append(local8170);
											}
										}
										aStringArray20[anInt3833++] = local8161.toString();
										return;
									}
									if (arg0 == 4120) {
										local3921 = aStringArray20[--anInt3833];
										anInt3825 -= 2;
										local19 = anIntArray323[anInt3825];
										local25 = anIntArray323[anInt3825 + 1];
										anIntArray323[anInt3825++] = local3921.indexOf(local19, local25);
										return;
									}
									if (arg0 == 4121) {
										anInt3833 -= 2;
										local3921 = aStringArray20[anInt3833];
										local1101 = aStringArray20[anInt3833 + 1];
										local25 = anIntArray323[--anInt3825];
										anIntArray323[anInt3825++] = local3921.indexOf(local1101, local25);
										return;
									}
									if (arg0 == 4122) {
										local13 = anIntArray323[--anInt3825];
										anIntArray323[anInt3825++] = Character.toLowerCase((char) local13);
										return;
									}
									if (arg0 == 4123) {
										local13 = anIntArray323[--anInt3825];
										anIntArray323[anInt3825++] = Character.toUpperCase((char) local13);
										return;
									}
									if (arg0 == 4124) {
										local412 = anIntArray323[--anInt3825] != 0;
										local19 = anIntArray323[--anInt3825];
										aStringArray20[anInt3833++] = Static126.method1948(0, (long) local19, Static188.anInt28, local412);
										return;
									}
									if (arg0 == 4125) {
										local3921 = aStringArray20[--anInt3833];
										local19 = anIntArray323[--anInt3825];
										@Pc(8384) Class202 local8384 = Static129.method1978(Static550.aClass248_107, local19);
										anIntArray323[anInt3825++] = local8384.method4977(local3921, Static390.aClass71Array43);
										return;
									}
								} else if (arg0 < 4300) {
									if (arg0 == 4200) {
										local13 = anIntArray323[--anInt3825];
										aStringArray20[anInt3833++] = Static119.aClass244_4.method5726(local13).aString53;
										return;
									}
									@Pc(8446) Class236 local8446;
									if (arg0 == 4201) {
										anInt3825 -= 2;
										local13 = anIntArray323[anInt3825];
										local19 = anIntArray323[anInt3825 + 1];
										local8446 = Static119.aClass244_4.method5726(local13);
										if (local19 >= 1 && local19 <= 5 && local8446.aStringArray29[local19 - 1] != null) {
											aStringArray20[anInt3833++] = local8446.aStringArray29[local19 - 1];
											return;
										}
										aStringArray20[anInt3833++] = "";
										return;
									}
									if (arg0 == 4202) {
										anInt3825 -= 2;
										local13 = anIntArray323[anInt3825];
										local19 = anIntArray323[anInt3825 + 1];
										local8446 = Static119.aClass244_4.method5726(local13);
										if (local19 >= 1 && local19 <= 5 && local8446.aStringArray28[local19 - 1] != null) {
											aStringArray20[anInt3833++] = local8446.aStringArray28[local19 - 1];
											return;
										}
										aStringArray20[anInt3833++] = "";
										return;
									}
									if (arg0 == 4203) {
										local13 = anIntArray323[--anInt3825];
										anIntArray323[anInt3825++] = Static119.aClass244_4.method5726(local13).anInt6806;
										return;
									}
									if (arg0 == 4204) {
										local13 = anIntArray323[--anInt3825];
										anIntArray323[anInt3825++] = Static119.aClass244_4.method5726(local13).anInt6783 == 1 ? 1 : 0;
										return;
									}
									@Pc(8609) Class236 local8609;
									if (arg0 == 4205) {
										local13 = anIntArray323[--anInt3825];
										local8609 = Static119.aClass244_4.method5726(local13);
										if (local8609.anInt6800 == -1 && local8609.anInt6780 >= 0) {
											anIntArray323[anInt3825++] = local8609.anInt6780;
											return;
										}
										anIntArray323[anInt3825++] = local13;
										return;
									}
									if (arg0 == 4206) {
										local13 = anIntArray323[--anInt3825];
										local8609 = Static119.aClass244_4.method5726(local13);
										if (local8609.anInt6800 >= 0 && local8609.anInt6780 >= 0) {
											anIntArray323[anInt3825++] = local8609.anInt6780;
											return;
										}
										anIntArray323[anInt3825++] = local13;
										return;
									}
									if (arg0 == 4207) {
										local13 = anIntArray323[--anInt3825];
										anIntArray323[anInt3825++] = Static119.aClass244_4.method5726(local13).aBoolean468 ? 1 : 0;
										return;
									}
									if (arg0 == 4208) {
										anInt3825 -= 2;
										local13 = anIntArray323[anInt3825];
										local19 = anIntArray323[anInt3825 + 1];
										local3024 = Static111.aClass259_1.method5915(local19);
										if (local3024.method7864()) {
											aStringArray20[anInt3833++] = Static119.aClass244_4.method5726(local13).method5486(local19, local3024.aString92);
											return;
										}
										anIntArray323[anInt3825++] = Static119.aClass244_4.method5726(local13).method5480(local19, local3024.anInt9885);
										return;
									}
									if (arg0 == 4209) {
										anInt3825 -= 2;
										local13 = anIntArray323[anInt3825];
										local19 = anIntArray323[anInt3825 + 1] - 1;
										local8446 = Static119.aClass244_4.method5726(local13);
										if (local8446.anInt6775 == local19) {
											anIntArray323[anInt3825++] = local8446.anInt6816;
											return;
										}
										if (local8446.anInt6781 == local19) {
											anIntArray323[anInt3825++] = local8446.anInt6790;
											return;
										}
										anIntArray323[anInt3825++] = -1;
										return;
									}
									if (arg0 == 4210) {
										local3921 = aStringArray20[--anInt3833];
										local19 = anIntArray323[--anInt3825];
										Static265.method4012(local3921, local19 == 1);
										anIntArray323[anInt3825++] = Static391.anInt7133;
										return;
									}
									if (arg0 == 4211) {
										if (Static173.aShortArray46 != null && Static327.anInt6213 < Static391.anInt7133) {
											anIntArray323[anInt3825++] = Static173.aShortArray46[Static327.anInt6213++] & 0xFFFF;
											return;
										}
										anIntArray323[anInt3825++] = -1;
										return;
									}
									if (arg0 == 4212) {
										Static327.anInt6213 = 0;
										return;
									}
									if (arg0 == 4214) {
										local3921 = aStringArray20[--anInt3833];
										anInt3825 -= 3;
										local19 = anIntArray323[anInt3825];
										local25 = anIntArray323[anInt3825 + 1];
										local353 = anIntArray323[anInt3825 + 2];
										Static9.method126(local353, local25, local19 == 1, local3921);
										anIntArray323[anInt3825++] = Static391.anInt7133;
										return;
									}
									if (arg0 == 4215) {
										anInt3833 -= 2;
										anInt3825 -= 2;
										local3921 = aStringArray20[anInt3833];
										local19 = anIntArray323[anInt3825];
										local25 = anIntArray323[anInt3825 + 1];
										@Pc(8984) String local8984 = aStringArray20[anInt3833 + 1];
										Static231.method7804(local19 == 1, local25, local8984, local3921);
										anIntArray323[anInt3825++] = Static391.anInt7133;
										return;
									}
								} else if (arg0 < 4400) {
									if (arg0 == 4300) {
										anInt3825 -= 2;
										local13 = anIntArray323[anInt3825];
										local19 = anIntArray323[anInt3825 + 1];
										local3024 = Static111.aClass259_1.method5915(local19);
										if (local3024.method7864()) {
											aStringArray20[anInt3833++] = Static119.aClass226_4.method5369(local13).method1943(local3024.aString92, local19);
											return;
										}
										anIntArray323[anInt3825++] = Static119.aClass226_4.method5369(local13).method1949(local19, local3024.anInt9885);
										return;
									}
								} else if (arg0 < 4500) {
									if (arg0 == 4400) {
										anInt3825 -= 2;
										local13 = anIntArray323[anInt3825];
										local19 = anIntArray323[anInt3825 + 1];
										local3024 = Static111.aClass259_1.method5915(local19);
										if (local3024.method7864()) {
											aStringArray20[anInt3833++] = Static85.aClass27_1.method516(local13).method4586(local19, local3024.aString92);
											return;
										}
										anIntArray323[anInt3825++] = Static85.aClass27_1.method516(local13).method4596(local19, local3024.anInt9885);
										return;
									}
								} else if (arg0 < 4600) {
									if (arg0 == 4500) {
										anInt3825 -= 2;
										local13 = anIntArray323[anInt3825];
										local19 = anIntArray323[anInt3825 + 1];
										local3024 = Static111.aClass259_1.method5915(local19);
										if (local3024.method7864()) {
											aStringArray20[anInt3833++] = Static22.aClass350_1.method7900(local13).method255(local3024.aString92, local19);
											return;
										}
										anIntArray323[anInt3825++] = Static22.aClass350_1.method7900(local13).method254(local19, local3024.anInt9885);
										return;
									}
								} else if (arg0 < 4700 && arg0 == 4600) {
									local13 = anIntArray323[--anInt3825];
									@Pc(9212) Class154 local9212 = Static81.aClass12_1.method198(local13);
									if (local9212.anIntArray372 != null && local9212.anIntArray372.length > 0) {
										local25 = 0;
										local353 = local9212.anIntArray371[0];
										for (local2290 = 1; local2290 < local9212.anIntArray372.length; local2290++) {
											if (local9212.anIntArray371[local2290] > local353) {
												local25 = local2290;
												local353 = local9212.anIntArray371[local2290];
											}
										}
										anIntArray323[anInt3825++] = local9212.anIntArray372[local25];
										return;
									}
									anIntArray323[anInt3825++] = local9212.anInt4526;
									return;
								}
							}
						}
					}
				}
			}
		}
		throw new IllegalStateException(String.valueOf(arg0));
	}

	@OriginalMember(owner = "client!hj", name = "a", descriptor = "(Ljava/lang/String;I)V")
	private static void method3315(@OriginalArg(0) String arg0, @OriginalArg(1) int arg1) {
		if (Static113.anInt1927 == 0 && (Static352.aBoolean457 && !Static135.aBoolean192 || Static255.aBoolean345)) {
			return;
		}
		@Pc(11) String local11 = arg0.toLowerCase();
		@Pc(13) byte local13 = 0;
		if (local11.startsWith(Static146.aClass103_94.method2355(0))) {
			local13 = 0;
			arg0 = arg0.substring(Static146.aClass103_94.method2355(0).length());
		} else if (local11.startsWith(Static146.aClass103_95.method2355(0))) {
			local13 = 1;
			arg0 = arg0.substring(Static146.aClass103_95.method2355(0).length());
		} else if (local11.startsWith(Static146.aClass103_96.method2355(0))) {
			local13 = 2;
			arg0 = arg0.substring(Static146.aClass103_96.method2355(0).length());
		} else if (local11.startsWith(Static146.aClass103_97.method2355(0))) {
			local13 = 3;
			arg0 = arg0.substring(Static146.aClass103_97.method2355(0).length());
		} else if (local11.startsWith(Static146.aClass103_98.method2355(0))) {
			local13 = 4;
			arg0 = arg0.substring(Static146.aClass103_98.method2355(0).length());
		} else if (local11.startsWith(Static146.aClass103_99.method2355(0))) {
			local13 = 5;
			arg0 = arg0.substring(Static146.aClass103_99.method2355(0).length());
		} else if (local11.startsWith(Static146.aClass103_100.method2355(0))) {
			local13 = 6;
			arg0 = arg0.substring(Static146.aClass103_100.method2355(0).length());
		} else if (local11.startsWith(Static146.aClass103_101.method2355(0))) {
			local13 = 7;
			arg0 = arg0.substring(Static146.aClass103_101.method2355(0).length());
		} else if (local11.startsWith(Static146.aClass103_102.method2355(0))) {
			local13 = 8;
			arg0 = arg0.substring(Static146.aClass103_102.method2355(0).length());
		} else if (local11.startsWith(Static146.aClass103_103.method2355(0))) {
			local13 = 9;
			arg0 = arg0.substring(Static146.aClass103_103.method2355(0).length());
		} else if (local11.startsWith(Static146.aClass103_104.method2355(0))) {
			local13 = 10;
			arg0 = arg0.substring(Static146.aClass103_104.method2355(0).length());
		} else if (local11.startsWith(Static146.aClass103_105.method2355(0))) {
			local13 = 11;
			arg0 = arg0.substring(Static146.aClass103_105.method2355(0).length());
		} else if (Static188.anInt28 != 0) {
			if (local11.startsWith(Static146.aClass103_94.method2355(Static188.anInt28))) {
				local13 = 0;
				arg0 = arg0.substring(Static146.aClass103_94.method2355(Static188.anInt28).length());
			} else if (local11.startsWith(Static146.aClass103_95.method2355(Static188.anInt28))) {
				local13 = 1;
				arg0 = arg0.substring(Static146.aClass103_95.method2355(Static188.anInt28).length());
			} else if (local11.startsWith(Static146.aClass103_96.method2355(Static188.anInt28))) {
				local13 = 2;
				arg0 = arg0.substring(Static146.aClass103_96.method2355(Static188.anInt28).length());
			} else if (local11.startsWith(Static146.aClass103_97.method2355(Static188.anInt28))) {
				local13 = 3;
				arg0 = arg0.substring(Static146.aClass103_97.method2355(Static188.anInt28).length());
			} else if (local11.startsWith(Static146.aClass103_98.method2355(Static188.anInt28))) {
				local13 = 4;
				arg0 = arg0.substring(Static146.aClass103_98.method2355(Static188.anInt28).length());
			} else if (local11.startsWith(Static146.aClass103_99.method2355(Static188.anInt28))) {
				local13 = 5;
				arg0 = arg0.substring(Static146.aClass103_99.method2355(Static188.anInt28).length());
			} else if (local11.startsWith(Static146.aClass103_100.method2355(Static188.anInt28))) {
				local13 = 6;
				arg0 = arg0.substring(Static146.aClass103_100.method2355(Static188.anInt28).length());
			} else if (local11.startsWith(Static146.aClass103_101.method2355(Static188.anInt28))) {
				local13 = 7;
				arg0 = arg0.substring(Static146.aClass103_101.method2355(Static188.anInt28).length());
			} else if (local11.startsWith(Static146.aClass103_102.method2355(Static188.anInt28))) {
				local13 = 8;
				arg0 = arg0.substring(Static146.aClass103_102.method2355(Static188.anInt28).length());
			} else if (local11.startsWith(Static146.aClass103_103.method2355(Static188.anInt28))) {
				local13 = 9;
				arg0 = arg0.substring(Static146.aClass103_103.method2355(Static188.anInt28).length());
			} else if (local11.startsWith(Static146.aClass103_104.method2355(Static188.anInt28))) {
				local13 = 10;
				arg0 = arg0.substring(Static146.aClass103_104.method2355(Static188.anInt28).length());
			} else if (local11.startsWith(Static146.aClass103_105.method2355(Static188.anInt28))) {
				local13 = 11;
				arg0 = arg0.substring(Static146.aClass103_105.method2355(Static188.anInt28).length());
			}
		}
		local11 = arg0.toLowerCase();
		@Pc(451) byte local451 = 0;
		if (local11.startsWith(Static146.aClass103_106.method2355(0))) {
			local451 = 1;
			arg0 = arg0.substring(Static146.aClass103_106.method2355(0).length());
		} else if (local11.startsWith(Static146.aClass103_107.method2355(0))) {
			local451 = 2;
			arg0 = arg0.substring(Static146.aClass103_107.method2355(0).length());
		} else if (local11.startsWith(Static146.aClass103_108.method2355(0))) {
			local451 = 3;
			arg0 = arg0.substring(Static146.aClass103_108.method2355(0).length());
		} else if (local11.startsWith(Static146.aClass103_109.method2355(0))) {
			local451 = 4;
			arg0 = arg0.substring(Static146.aClass103_109.method2355(0).length());
		} else if (local11.startsWith(Static146.aClass103_110.method2355(0))) {
			local451 = 5;
			arg0 = arg0.substring(Static146.aClass103_110.method2355(0).length());
		} else if (Static188.anInt28 != 0) {
			if (local11.startsWith(Static146.aClass103_106.method2355(Static188.anInt28))) {
				local451 = 1;
				arg0 = arg0.substring(Static146.aClass103_106.method2355(Static188.anInt28).length());
			} else if (local11.startsWith(Static146.aClass103_107.method2355(Static188.anInt28))) {
				local451 = 2;
				arg0 = arg0.substring(Static146.aClass103_107.method2355(Static188.anInt28).length());
			} else if (local11.startsWith(Static146.aClass103_108.method2355(Static188.anInt28))) {
				local451 = 3;
				arg0 = arg0.substring(Static146.aClass103_108.method2355(Static188.anInt28).length());
			} else if (local11.startsWith(Static146.aClass103_109.method2355(Static188.anInt28))) {
				local451 = 4;
				arg0 = arg0.substring(Static146.aClass103_109.method2355(Static188.anInt28).length());
			} else if (local11.startsWith(Static146.aClass103_110.method2355(Static188.anInt28))) {
				local451 = 5;
				arg0 = arg0.substring(Static146.aClass103_110.method2355(Static188.anInt28).length());
			}
		}
		Static534.method7063(Static69.aClass316_16);
		Static340.aClass6_Sub12_Sub2_1.method6047(0);
		@Pc(646) int local646 = Static340.aClass6_Sub12_Sub2_1.anInt7556;
		Static340.aClass6_Sub12_Sub2_1.method6047(local13);
		Static340.aClass6_Sub12_Sub2_1.method6047(local451);
		Static107.method1668(arg0, Static340.aClass6_Sub12_Sub2_1);
		Static340.aClass6_Sub12_Sub2_1.method6056(Static340.aClass6_Sub12_Sub2_1.anInt7556 - local646);
	}

	@OriginalMember(owner = "client!hj", name = "a", descriptor = "(Lclient!ad;)V")
	public static void method3316(@OriginalArg(0) Class6_Sub1 arg0) {
		method3324(arg0, 200000);
	}

	@OriginalMember(owner = "client!hj", name = "a", descriptor = "(I)Ljava/lang/String;")
	private static String method3317(@OriginalArg(0) int arg0) {
		@Pc(6) long local6 = ((long) arg0 + 11745L) * 86400000L;
		aCalendar1.setTime(new Date(local6));
		@Pc(16) int local16 = aCalendar1.get(5);
		@Pc(20) int local20 = aCalendar1.get(2);
		@Pc(24) int local24 = aCalendar1.get(1);
		return local16 + "-" + aStringArray21[local20] + "-" + local24;
	}

	@OriginalMember(owner = "client!hj", name = "a", descriptor = "(Lclient!maa;II)V")
	public static void method3318(@OriginalArg(0) Class195 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(5) Class6_Sub5_Sub16 local5 = Static216.method1063(arg2, arg1, arg0);
		if (local5 == null) {
			return;
		}
		anIntArray322 = new int[local5.anInt9205];
		aStringArray19 = new String[local5.anInt9206];
		if (local5.aClass195_11 == Static166.aClass195_6 || local5.aClass195_11 == Static256.aClass195_7 || local5.aClass195_11 == Static307.aClass195_10) {
			@Pc(30) int local30 = 0;
			@Pc(32) int local32 = 0;
			if (Static496.aClass97_24 != null) {
				local30 = Static496.aClass97_24.anInt2642;
				local32 = Static496.aClass97_24.anInt2641;
			}
			anIntArray322[0] = Static9.aClass29_1.method2946() - local30;
			anIntArray322[1] = Static9.aClass29_1.method2942() - local32;
		}
		method3325(local5, 200000);
	}

	@OriginalMember(owner = "client!hj", name = "b", descriptor = "(IZ)V")
	private static void method3319(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1) {
		@Pc(75) String local75;
		@Pc(1425) boolean local1425;
		@Pc(89) int local89;
		@Pc(157) int local157;
		@Pc(741) int local741;
		@Pc(163) String local163;
		@Pc(95) int local95;
		@Pc(81) String local81;
		if (arg0 < 5100) {
			if (arg0 == 5000) {
				anIntArray323[anInt3825++] = Static319.anInt3808;
				return;
			}
			if (arg0 == 5001) {
				anInt3825 -= 3;
				Static319.anInt3808 = anIntArray323[anInt3825];
				Static257.aClass275_9 = Static71.method984(anIntArray323[anInt3825 + 1]);
				if (Static257.aClass275_9 == null) {
					Static257.aClass275_9 = Static362.aClass275_8;
				}
				Static12.anInt191 = anIntArray323[anInt3825 + 2];
				Static534.method7063(Static430.aClass316_96);
				Static340.aClass6_Sub12_Sub2_1.method6047(Static319.anInt3808);
				Static340.aClass6_Sub12_Sub2_1.method6047(Static257.aClass275_9.anInt7903);
				Static340.aClass6_Sub12_Sub2_1.method6047(Static12.anInt191);
				return;
			}
			if (arg0 == 5002) {
				anInt3833 -= 2;
				local75 = aStringArray20[anInt3833];
				local81 = aStringArray20[anInt3833 + 1];
				anInt3825 -= 2;
				local89 = anIntArray323[anInt3825];
				local95 = anIntArray323[anInt3825 + 1];
				if (local81 == null) {
					local81 = "";
				}
				if (local81.length() > 80) {
					local81 = local81.substring(0, 80);
				}
				Static534.method7063(Static41.aClass316_14);
				Static340.aClass6_Sub12_Sub2_1.method6047(Static314.method4913(local75) + Static314.method4913(local81) + 2);
				Static340.aClass6_Sub12_Sub2_1.method6009(local75);
				Static340.aClass6_Sub12_Sub2_1.method6047(local89 - 1);
				Static340.aClass6_Sub12_Sub2_1.method6047(local95);
				Static340.aClass6_Sub12_Sub2_1.method6009(local81);
				return;
			}
			@Pc(161) Class283 local161;
			if (arg0 == 5003) {
				local157 = anIntArray323[--anInt3825];
				local161 = Static528.method7237(local157);
				local163 = "";
				if (local161 != null && local161.aString69 != null) {
					local163 = local161.aString69;
				}
				aStringArray20[anInt3833++] = local163;
				return;
			}
			if (arg0 == 5004) {
				local157 = anIntArray323[--anInt3825];
				local161 = Static528.method7237(local157);
				local89 = -1;
				if (local161 != null) {
					local89 = local161.anInt7995;
				}
				anIntArray323[anInt3825++] = local89;
				return;
			}
			if (arg0 == 5005) {
				if (Static257.aClass275_9 == null) {
					anIntArray323[anInt3825++] = -1;
					return;
				}
				anIntArray323[anInt3825++] = Static257.aClass275_9.anInt7903;
				return;
			}
			if (arg0 == 5006) {
				local157 = anIntArray323[--anInt3825];
				Static534.method7063(Static500.aClass316_109);
				Static340.aClass6_Sub12_Sub2_1.method6047(local157);
				return;
			}
			if (arg0 == 5008) {
				local75 = aStringArray20[--anInt3833];
				method3315(local75, arg0);
				return;
			}
			if (arg0 == 5009) {
				anInt3833 -= 2;
				local75 = aStringArray20[anInt3833];
				local81 = aStringArray20[anInt3833 + 1];
				if (Static113.anInt1927 != 0 || (!Static352.aBoolean457 || Static135.aBoolean192) && !Static255.aBoolean345) {
					Static534.method7063(Static35.aClass316_12);
					Static340.aClass6_Sub12_Sub2_1.method6047(0);
					local89 = Static340.aClass6_Sub12_Sub2_1.anInt7556;
					Static340.aClass6_Sub12_Sub2_1.method6009(local75);
					Static107.method1668(local81, Static340.aClass6_Sub12_Sub2_1);
					Static340.aClass6_Sub12_Sub2_1.method6056(Static340.aClass6_Sub12_Sub2_1.anInt7556 - local89);
					return;
				}
				return;
			}
			if (arg0 == 5010) {
				local157 = anIntArray323[--anInt3825];
				local161 = Static528.method7237(local157);
				local163 = "";
				if (local161 != null && local161.aString65 != null) {
					local163 = local161.aString65;
				}
				aStringArray20[anInt3833++] = local163;
				return;
			}
			if (arg0 == 5011) {
				local157 = anIntArray323[--anInt3825];
				local161 = Static528.method7237(local157);
				local163 = "";
				if (local161 != null && local161.aString67 != null) {
					local163 = local161.aString67;
				}
				aStringArray20[anInt3833++] = local163;
				return;
			}
			if (arg0 == 5012) {
				local157 = anIntArray323[--anInt3825];
				local161 = Static528.method7237(local157);
				local89 = -1;
				if (local161 != null) {
					local89 = local161.anInt7994;
				}
				anIntArray323[anInt3825++] = local89;
				return;
			}
			if (arg0 == 5015) {
				if (Static461.aClass15_Sub2_Sub4_Sub2_2 == null || Static461.aClass15_Sub2_Sub4_Sub2_2.aString83 == null) {
					local75 = Static286.aString42;
				} else {
					local75 = Static461.aClass15_Sub2_Sub4_Sub2_2.method7145();
				}
				aStringArray20[anInt3833++] = local75;
				return;
			}
			if (arg0 == 5016) {
				anIntArray323[anInt3825++] = Static12.anInt191;
				return;
			}
			if (arg0 == 5017) {
				anIntArray323[anInt3825++] = Static572.method7849();
				return;
			}
			if (arg0 == 5018) {
				local157 = anIntArray323[--anInt3825];
				local161 = Static528.method7237(local157);
				local89 = 0;
				if (local161 != null) {
					local89 = local161.anInt7993;
				}
				anIntArray323[anInt3825++] = local89;
				return;
			}
			if (arg0 == 5019) {
				local157 = anIntArray323[--anInt3825];
				local161 = Static528.method7237(local157);
				local163 = "";
				if (local161 != null && local161.aString68 != null) {
					local163 = local161.aString68;
				}
				aStringArray20[anInt3833++] = local163;
				return;
			}
			if (arg0 == 5020) {
				if (Static461.aClass15_Sub2_Sub4_Sub2_2 == null || Static461.aClass15_Sub2_Sub4_Sub2_2.aString83 == null) {
					local75 = Static286.aString42;
				} else {
					local75 = Static461.aClass15_Sub2_Sub4_Sub2_2.method7148();
				}
				aStringArray20[anInt3833++] = local75;
				return;
			}
			if (arg0 == 5023) {
				local157 = anIntArray323[--anInt3825];
				local161 = Static528.method7237(local157);
				local89 = -1;
				if (local161 != null) {
					local89 = local161.anInt7990;
				}
				anIntArray323[anInt3825++] = local89;
				return;
			}
			if (arg0 == 5024) {
				local157 = anIntArray323[--anInt3825];
				local161 = Static528.method7237(local157);
				local89 = -1;
				if (local161 != null) {
					local89 = local161.anInt7996;
				}
				anIntArray323[anInt3825++] = local89;
				return;
			}
			if (arg0 == 5025) {
				local157 = anIntArray323[--anInt3825];
				local161 = Static528.method7237(local157);
				local163 = "";
				if (local161 != null && local161.aString66 != null) {
					local163 = local161.aString66;
				}
				aStringArray20[anInt3833++] = local163;
				return;
			}
			if (arg0 == 5050) {
				local157 = anIntArray323[--anInt3825];
				aStringArray20[anInt3833++] = Static73.aClass209_1.method5026(local157).aString88;
				return;
			}
			@Pc(701) Class6_Sub5_Sub18 local701;
			if (arg0 == 5051) {
				local157 = anIntArray323[--anInt3825];
				local701 = Static73.aClass209_1.method5026(local157);
				if (local701.anIntArray704 == null) {
					anIntArray323[anInt3825++] = 0;
					return;
				}
				anIntArray323[anInt3825++] = local701.anIntArray704.length;
				return;
			}
			if (arg0 == 5052) {
				anInt3825 -= 2;
				local157 = anIntArray323[anInt3825];
				local741 = anIntArray323[anInt3825 + 1];
				@Pc(746) Class6_Sub5_Sub18 local746 = Static73.aClass209_1.method5026(local157);
				local95 = local746.anIntArray704[local741];
				anIntArray323[anInt3825++] = local95;
				return;
			}
			if (arg0 == 5053) {
				local157 = anIntArray323[--anInt3825];
				local701 = Static73.aClass209_1.method5026(local157);
				if (local701.anIntArray703 == null) {
					anIntArray323[anInt3825++] = 0;
					return;
				}
				anIntArray323[anInt3825++] = local701.anIntArray703.length;
				return;
			}
			if (arg0 == 5054) {
				anInt3825 -= 2;
				local157 = anIntArray323[anInt3825];
				local741 = anIntArray323[anInt3825 + 1];
				anIntArray323[anInt3825++] = Static73.aClass209_1.method5026(local157).anIntArray703[local741];
				return;
			}
			if (arg0 == 5055) {
				local157 = anIntArray323[--anInt3825];
				aStringArray20[anInt3833++] = Static186.aClass266_1.method5987(local157).method5751();
				return;
			}
			if (arg0 == 5056) {
				local157 = anIntArray323[--anInt3825];
				@Pc(872) Class6_Sub5_Sub14 local872 = Static186.aClass266_1.method5987(local157);
				if (local872.anIntArray502 == null) {
					anIntArray323[anInt3825++] = 0;
					return;
				}
				anIntArray323[anInt3825++] = local872.anIntArray502.length;
				return;
			}
			if (arg0 == 5057) {
				anInt3825 -= 2;
				local157 = anIntArray323[anInt3825];
				local741 = anIntArray323[anInt3825 + 1];
				anIntArray323[anInt3825++] = Static186.aClass266_1.method5987(local157).anIntArray502[local741];
				return;
			}
			if (arg0 == 5058) {
				aClass129_1 = new Class129();
				aClass129_1.anInt3817 = anIntArray323[--anInt3825];
				aClass129_1.aClass6_Sub5_Sub14_1 = Static186.aClass266_1.method5987(aClass129_1.anInt3817);
				aClass129_1.anIntArray320 = new int[aClass129_1.aClass6_Sub5_Sub14_1.method5754()];
				return;
			}
			if (arg0 == 5059) {
				Static534.method7063(Static178.aClass316_41);
				Static340.aClass6_Sub12_Sub2_1.method6047(0);
				local157 = Static340.aClass6_Sub12_Sub2_1.anInt7556;
				Static340.aClass6_Sub12_Sub2_1.method6047(0);
				Static340.aClass6_Sub12_Sub2_1.method6032(aClass129_1.anInt3817);
				aClass129_1.aClass6_Sub5_Sub14_1.method5746(aClass129_1.anIntArray320, Static340.aClass6_Sub12_Sub2_1);
				Static340.aClass6_Sub12_Sub2_1.method6056(Static340.aClass6_Sub12_Sub2_1.anInt7556 - local157);
				return;
			}
			if (arg0 == 5060) {
				local75 = aStringArray20[--anInt3833];
				Static534.method7063(Static426.aClass316_95);
				Static340.aClass6_Sub12_Sub2_1.method6047(0);
				local741 = Static340.aClass6_Sub12_Sub2_1.anInt7556;
				Static340.aClass6_Sub12_Sub2_1.method6009(local75);
				Static340.aClass6_Sub12_Sub2_1.method6032(aClass129_1.anInt3817);
				aClass129_1.aClass6_Sub5_Sub14_1.method5746(aClass129_1.anIntArray320, Static340.aClass6_Sub12_Sub2_1);
				Static340.aClass6_Sub12_Sub2_1.method6056(Static340.aClass6_Sub12_Sub2_1.anInt7556 - local741);
				return;
			}
			if (arg0 == 5061) {
				Static534.method7063(Static178.aClass316_41);
				Static340.aClass6_Sub12_Sub2_1.method6047(0);
				local157 = Static340.aClass6_Sub12_Sub2_1.anInt7556;
				Static340.aClass6_Sub12_Sub2_1.method6047(1);
				Static340.aClass6_Sub12_Sub2_1.method6032(aClass129_1.anInt3817);
				aClass129_1.aClass6_Sub5_Sub14_1.method5746(aClass129_1.anIntArray320, Static340.aClass6_Sub12_Sub2_1);
				Static340.aClass6_Sub12_Sub2_1.method6056(Static340.aClass6_Sub12_Sub2_1.anInt7556 - local157);
				return;
			}
			if (arg0 == 5062) {
				anInt3825 -= 2;
				local157 = anIntArray323[anInt3825];
				local741 = anIntArray323[anInt3825 + 1];
				anIntArray323[anInt3825++] = Static73.aClass209_1.method5026(local157).aCharArray8[local741];
				return;
			}
			if (arg0 == 5063) {
				anInt3825 -= 2;
				local157 = anIntArray323[anInt3825];
				local741 = anIntArray323[anInt3825 + 1];
				anIntArray323[anInt3825++] = Static73.aClass209_1.method5026(local157).aCharArray9[local741];
				return;
			}
			if (arg0 == 5064) {
				anInt3825 -= 2;
				local157 = anIntArray323[anInt3825];
				local741 = anIntArray323[anInt3825 + 1];
				if (local741 == -1) {
					anIntArray323[anInt3825++] = -1;
					return;
				}
				anIntArray323[anInt3825++] = Static73.aClass209_1.method5026(local157).method7741((char) local741);
				return;
			}
			if (arg0 == 5065) {
				anInt3825 -= 2;
				local157 = anIntArray323[anInt3825];
				local741 = anIntArray323[anInt3825 + 1];
				if (local741 == -1) {
					anIntArray323[anInt3825++] = -1;
					return;
				}
				anIntArray323[anInt3825++] = Static73.aClass209_1.method5026(local157).method7742((char) local741);
				return;
			}
			if (arg0 == 5066) {
				local157 = anIntArray323[--anInt3825];
				anIntArray323[anInt3825++] = Static186.aClass266_1.method5987(local157).method5754();
				return;
			}
			if (arg0 == 5067) {
				anInt3825 -= 2;
				local157 = anIntArray323[anInt3825];
				local741 = anIntArray323[anInt3825 + 1];
				local89 = Static186.aClass266_1.method5987(local157).method5747(local741).anInt5217;
				anIntArray323[anInt3825++] = local89;
				return;
			}
			if (arg0 == 5068) {
				anInt3825 -= 2;
				local157 = anIntArray323[anInt3825];
				local741 = anIntArray323[anInt3825 + 1];
				aClass129_1.anIntArray320[local157] = local741;
				return;
			}
			if (arg0 == 5069) {
				anInt3825 -= 2;
				local157 = anIntArray323[anInt3825];
				local741 = anIntArray323[anInt3825 + 1];
				aClass129_1.anIntArray320[local157] = local741;
				return;
			}
			if (arg0 == 5070) {
				anInt3825 -= 3;
				local157 = anIntArray323[anInt3825];
				local741 = anIntArray323[anInt3825 + 1];
				local89 = anIntArray323[anInt3825 + 2];
				@Pc(1377) Class6_Sub5_Sub14 local1377 = Static186.aClass266_1.method5987(local157);
				if (local1377.method5747(local741).anInt5217 != 0) {
					throw new RuntimeException("bad command");
				}
				anIntArray323[anInt3825++] = local1377.method5753(local89, local741);
				return;
			}
			if (arg0 == 5071) {
				local75 = aStringArray20[--anInt3833];
				local1425 = anIntArray323[--anInt3825] == 1;
				Static327.method5033(local1425, local75);
				anIntArray323[anInt3825++] = Static391.anInt7133;
				return;
			}
			if (arg0 == 5072) {
				if (Static173.aShortArray46 != null && Static327.anInt6213 < Static391.anInt7133) {
					anIntArray323[anInt3825++] = Static173.aShortArray46[Static327.anInt6213++] & 0xFFFF;
					return;
				}
				anIntArray323[anInt3825++] = -1;
				return;
			}
			if (arg0 == 5073) {
				Static327.anInt6213 = 0;
				return;
			}
		} else if (arg0 < 5200) {
			if (arg0 == 5100) {
				if (Static184.aClass262_1.method6381(86)) {
					anIntArray323[anInt3825++] = 1;
					return;
				}
				anIntArray323[anInt3825++] = 0;
				return;
			}
			if (arg0 == 5101) {
				if (Static184.aClass262_1.method6381(82)) {
					anIntArray323[anInt3825++] = 1;
					return;
				}
				anIntArray323[anInt3825++] = 0;
				return;
			}
			if (arg0 == 5102) {
				if (Static184.aClass262_1.method6381(81)) {
					anIntArray323[anInt3825++] = 1;
					return;
				}
				anIntArray323[anInt3825++] = 0;
				return;
			}
		} else {
			@Pc(2762) int local2762;
			@Pc(2036) boolean local2036;
			if (arg0 < 5300) {
				if (arg0 == 5200) {
					Static525.method7206(anIntArray323[--anInt3825]);
					return;
				}
				if (arg0 == 5201) {
					anIntArray323[anInt3825++] = Static190.method6328();
					return;
				}
				if (arg0 == 5205) {
					Static515.method7057(-1, false, anIntArray323[--anInt3825], -1);
					return;
				}
				@Pc(1625) Class6_Sub5_Sub2 local1625;
				if (arg0 == 5206) {
					local157 = anIntArray323[--anInt3825];
					local1625 = Static490.method1739(local157 >> 14 & 0x3FFF, local157 & 0x3FFF);
					if (local1625 == null) {
						anIntArray323[anInt3825++] = -1;
						return;
					}
					anIntArray323[anInt3825++] = local1625.anInt2010;
					return;
				}
				@Pc(1658) Class6_Sub5_Sub2 local1658;
				if (arg0 == 5207) {
					local1658 = Static490.method1742(anIntArray323[--anInt3825]);
					if (local1658 != null && local1658.aString11 != null) {
						aStringArray20[anInt3833++] = local1658.aString11;
						return;
					}
					aStringArray20[anInt3833++] = "";
					return;
				}
				if (arg0 == 5208) {
					anIntArray323[anInt3825++] = Static501.anInt8701;
					anIntArray323[anInt3825++] = Static426.anInt7573;
					return;
				}
				if (arg0 == 5209) {
					anIntArray323[anInt3825++] = Static441.anInt3925 + Static490.anInt1918;
					anIntArray323[anInt3825++] = Static30.anInt535 + Static490.anInt1917;
					return;
				}
				if (arg0 == 5210) {
					local157 = anIntArray323[--anInt3825];
					local1625 = Static490.method1742(local157);
					if (local1625 == null) {
						anIntArray323[anInt3825++] = 0;
						anIntArray323[anInt3825++] = 0;
						return;
					}
					anIntArray323[anInt3825++] = local1625.anInt2019 >> 14 & 0x3FFF;
					anIntArray323[anInt3825++] = local1625.anInt2019 & 0x3FFF;
					return;
				}
				if (arg0 == 5211) {
					local157 = anIntArray323[--anInt3825];
					local1625 = Static490.method1742(local157);
					if (local1625 == null) {
						anIntArray323[anInt3825++] = 0;
						anIntArray323[anInt3825++] = 0;
						return;
					}
					anIntArray323[anInt3825++] = local1625.anInt2017 - local1625.anInt2008;
					anIntArray323[anInt3825++] = local1625.anInt2021 - local1625.anInt2011;
					return;
				}
				@Pc(1848) Class6_Sub22 local1848;
				if (arg0 == 5212) {
					local1848 = Static3.method5664();
					if (local1848 == null) {
						anIntArray323[anInt3825++] = -1;
						anIntArray323[anInt3825++] = -1;
						return;
					}
					anIntArray323[anInt3825++] = local1848.anInt4399;
					local741 = local1848.anInt4396 << 28 | local1848.anInt4395 + Static490.anInt1918 << 14 | local1848.anInt4398 + Static490.anInt1917;
					anIntArray323[anInt3825++] = local741;
					return;
				}
				if (arg0 == 5213) {
					local1848 = Static256.method3973();
					if (local1848 == null) {
						anIntArray323[anInt3825++] = -1;
						anIntArray323[anInt3825++] = -1;
						return;
					}
					anIntArray323[anInt3825++] = local1848.anInt4399;
					local741 = local1848.anInt4396 << 28 | local1848.anInt4395 + Static490.anInt1918 << 14 | local1848.anInt4398 + Static490.anInt1917;
					anIntArray323[anInt3825++] = local741;
					return;
				}
				@Pc(1996) boolean local1996;
				if (arg0 == 5214) {
					local157 = anIntArray323[--anInt3825];
					local1625 = Static529.method7816();
					if (local1625 != null) {
						local1996 = local1625.method1835(local157 & 0x3FFF, local157 >> 28 & 0x3, anIntArray325, local157 >> 14 & 0x3FFF);
						if (local1996) {
							Static99.method1440(anIntArray325[2], anIntArray325[1]);
						}
					}
					return;
				}
				if (arg0 == 5215) {
					anInt3825 -= 2;
					local157 = anIntArray323[anInt3825];
					local741 = anIntArray323[anInt3825 + 1];
					@Pc(2034) Class256 local2034 = Static490.method1752(local157 >> 14 & 0x3FFF, local157 & 0x3FFF);
					local2036 = false;
					for (@Pc(2041) Class6_Sub5_Sub2 local2041 = (Class6_Sub5_Sub2) local2034.method5902(); local2041 != null; local2041 = (Class6_Sub5_Sub2) local2034.method5901()) {
						if (local2041.anInt2010 == local741) {
							local2036 = true;
							break;
						}
					}
					if (local2036) {
						anIntArray323[anInt3825++] = 1;
						return;
					}
					anIntArray323[anInt3825++] = 0;
					return;
				}
				if (arg0 == 5218) {
					local157 = anIntArray323[--anInt3825];
					local1625 = Static490.method1742(local157);
					if (local1625 == null) {
						anIntArray323[anInt3825++] = -1;
						return;
					}
					anIntArray323[anInt3825++] = local1625.anInt2009;
					return;
				}
				if (arg0 == 5220) {
					anIntArray323[anInt3825++] = Static91.anInt1503 == 100 ? 1 : 0;
					return;
				}
				if (arg0 == 5221) {
					local157 = anIntArray323[--anInt3825];
					Static99.method1440(local157 & 0x3FFF, local157 >> 14 & 0x3FFF);
					return;
				}
				if (arg0 == 5222) {
					local1658 = Static529.method7816();
					if (local1658 != null) {
						local1425 = local1658.method1836(Static441.anInt3925 + Static490.anInt1918, Static30.anInt535 + Static490.anInt1917, anIntArray325);
						if (local1425) {
							anIntArray323[anInt3825++] = anIntArray325[1];
							anIntArray323[anInt3825++] = anIntArray325[2];
							return;
						}
						anIntArray323[anInt3825++] = -1;
						anIntArray323[anInt3825++] = -1;
						return;
					}
					anIntArray323[anInt3825++] = -1;
					anIntArray323[anInt3825++] = -1;
					return;
				}
				if (arg0 == 5223) {
					anInt3825 -= 2;
					local157 = anIntArray323[anInt3825];
					local741 = anIntArray323[anInt3825 + 1];
					Static515.method7057(local741 & 0x3FFF, false, local157, local741 >> 14 & 0x3FFF);
					return;
				}
				if (arg0 == 5224) {
					local157 = anIntArray323[--anInt3825];
					local1625 = Static529.method7816();
					if (local1625 != null) {
						local1996 = local1625.method1835(local157 & 0x3FFF, local157 >> 28 & 0x3, anIntArray325, local157 >> 14 & 0x3FFF);
						if (local1996) {
							anIntArray323[anInt3825++] = anIntArray325[1];
							anIntArray323[anInt3825++] = anIntArray325[2];
							return;
						}
						anIntArray323[anInt3825++] = -1;
						anIntArray323[anInt3825++] = -1;
						return;
					}
					anIntArray323[anInt3825++] = -1;
					anIntArray323[anInt3825++] = -1;
					return;
				}
				if (arg0 == 5225) {
					local157 = anIntArray323[--anInt3825];
					local1625 = Static529.method7816();
					if (local1625 != null) {
						local1996 = local1625.method1836(local157 >> 14 & 0x3FFF, local157 & 0x3FFF, anIntArray325);
						if (local1996) {
							anIntArray323[anInt3825++] = anIntArray325[1];
							anIntArray323[anInt3825++] = anIntArray325[2];
							return;
						}
						anIntArray323[anInt3825++] = -1;
						anIntArray323[anInt3825++] = -1;
						return;
					}
					anIntArray323[anInt3825++] = -1;
					anIntArray323[anInt3825++] = -1;
					return;
				}
				if (arg0 == 5226) {
					Static201.method3332(anIntArray323[--anInt3825]);
					return;
				}
				if (arg0 == 5227) {
					anInt3825 -= 2;
					local157 = anIntArray323[anInt3825];
					local741 = anIntArray323[anInt3825 + 1];
					Static515.method7057(local741 & 0x3FFF, true, local157, local741 >> 14 & 0x3FFF);
					return;
				}
				if (arg0 == 5228) {
					Static194.aBoolean298 = anIntArray323[--anInt3825] == 1;
					return;
				}
				if (arg0 == 5229) {
					anIntArray323[anInt3825++] = Static194.aBoolean298 ? 1 : 0;
					return;
				}
				if (arg0 == 5230) {
					local157 = anIntArray323[--anInt3825];
					Static533.method7260(local157);
					return;
				}
				@Pc(2554) Class6 local2554;
				if (arg0 == 5231) {
					anInt3825 -= 2;
					local157 = anIntArray323[anInt3825];
					local1425 = anIntArray323[anInt3825 + 1] == 1;
					if (Static359.aClass234_46 != null) {
						local2554 = Static359.aClass234_46.method5464((long) local157);
						if (local2554 != null && !local1425) {
							local2554.method7948();
							return;
						}
						if (local2554 == null && local1425) {
							local2554 = new Class6();
							Static359.aClass234_46.method5466((long) local157, local2554);
						}
					}
					return;
				}
				@Pc(2596) Class6 local2596;
				if (arg0 == 5232) {
					local157 = anIntArray323[--anInt3825];
					if (Static359.aClass234_46 != null) {
						local2596 = Static359.aClass234_46.method5464((long) local157);
						anIntArray323[anInt3825++] = local2596 == null ? 0 : 1;
						return;
					}
					anIntArray323[anInt3825++] = 0;
					return;
				}
				if (arg0 == 5233) {
					anInt3825 -= 2;
					local157 = anIntArray323[anInt3825];
					local1425 = anIntArray323[anInt3825 + 1] == 1;
					if (Static290.aClass234_32 != null) {
						local2554 = Static290.aClass234_32.method5464((long) local157);
						if (local2554 != null && !local1425) {
							local2554.method7948();
							return;
						}
						if (local2554 == null && local1425) {
							local2554 = new Class6();
							Static290.aClass234_32.method5466((long) local157, local2554);
						}
					}
					return;
				}
				if (arg0 == 5234) {
					local157 = anIntArray323[--anInt3825];
					if (Static290.aClass234_32 != null) {
						local2596 = Static290.aClass234_32.method5464((long) local157);
						anIntArray323[anInt3825++] = local2596 == null ? 0 : 1;
						return;
					}
					anIntArray323[anInt3825++] = 0;
					return;
				}
				if (arg0 == 5235) {
					anIntArray323[anInt3825++] = Static490.aClass6_Sub5_Sub2_2 == null ? -1 : Static490.aClass6_Sub5_Sub2_2.anInt2010;
					return;
				}
				if (arg0 == 5236) {
					anInt3825 -= 2;
					local157 = anIntArray323[anInt3825];
					local741 = anIntArray323[anInt3825 + 1];
					local89 = local741 >> 14 & 0x3FFF;
					local95 = local741 & 0x3FFF;
					local2762 = Static84.method1179(local89, local95, local157);
					if (local2762 < 0) {
						anIntArray323[anInt3825++] = -1;
						return;
					}
					anIntArray323[anInt3825++] = local2762;
					return;
				}
				if (arg0 == 5237) {
					Static282.method4299();
					return;
				}
			} else if (arg0 < 5400) {
				if (arg0 == 5300) {
					anInt3825 -= 2;
					local157 = anIntArray323[anInt3825];
					local741 = anIntArray323[anInt3825 + 1];
					Static192.method3260(3, false, local741, local157);
					anIntArray323[anInt3825++] = Static85.aFrame1 == null ? 0 : 1;
					return;
				}
				if (arg0 == 5301) {
					if (Static85.aFrame1 != null) {
						Static192.method3260(Static58.aClass6_Sub17_Sub1_1.anInt9294, false, -1, -1);
					}
					return;
				}
				if (arg0 == 5302) {
					@Pc(2846) Class178[] local2846 = Static41.method664();
					anIntArray323[anInt3825++] = local2846.length;
					return;
				}
				if (arg0 == 5303) {
					local157 = anIntArray323[--anInt3825];
					@Pc(2870) Class178[] local2870 = Static41.method664();
					anIntArray323[anInt3825++] = local2870[local157].anInt5209;
					anIntArray323[anInt3825++] = local2870[local157].anInt5208;
					return;
				}
				if (arg0 == 5305) {
					local157 = Static58.aClass6_Sub17_Sub1_1.anInt9290;
					local741 = Static58.aClass6_Sub17_Sub1_1.anInt9272;
					local89 = -1;
					@Pc(2907) Class178[] local2907 = Static41.method664();
					for (local2762 = 0; local2762 < local2907.length; local2762++) {
						@Pc(2914) Class178 local2914 = local2907[local2762];
						if (local2914.anInt5209 == local157 && local2914.anInt5208 == local741) {
							local89 = local2762;
							break;
						}
					}
					anIntArray323[anInt3825++] = local89;
					return;
				}
				if (arg0 == 5306) {
					anIntArray323[anInt3825++] = Static278.method4179();
					return;
				}
				if (arg0 == 5307) {
					local157 = anIntArray323[--anInt3825];
					if (local157 >= 1 && local157 <= 2) {
						Static192.method3260(local157, false, -1, -1);
						return;
					}
					return;
				}
				if (arg0 == 5308) {
					anIntArray323[anInt3825++] = Static58.aClass6_Sub17_Sub1_1.anInt9294;
					return;
				}
				if (arg0 == 5309) {
					local157 = anIntArray323[--anInt3825];
					if (local157 >= 1 && local157 <= 2) {
						Static58.aClass6_Sub17_Sub1_1.anInt9294 = local157;
						Static58.aClass6_Sub17_Sub1_1.method7359(Static174.aClass313_24);
						return;
					}
					return;
				}
			} else if (arg0 < 5500) {
				if (arg0 == 5400) {
					anInt3833 -= 2;
					local75 = aStringArray20[anInt3833];
					local81 = aStringArray20[anInt3833 + 1];
					local89 = anIntArray323[--anInt3825];
					Static534.method7063(Static111.aClass316_22);
					Static340.aClass6_Sub12_Sub2_1.method6047(Static314.method4913(local75) + Static314.method4913(local81) + 1);
					Static340.aClass6_Sub12_Sub2_1.method6009(local75);
					Static340.aClass6_Sub12_Sub2_1.method6009(local81);
					Static340.aClass6_Sub12_Sub2_1.method6047(local89);
					return;
				}
				if (arg0 == 5401) {
					anInt3825 -= 2;
					Static527.aShortArray143[anIntArray323[anInt3825]] = (short) Static15.method196(anIntArray323[anInt3825 + 1]);
					Static119.aClass244_4.method5716();
					Static119.aClass244_4.method5715();
					Static119.aClass226_4.method5366();
					Static39.method645();
					return;
				}
				if (arg0 == 5405) {
					anInt3825 -= 2;
					local157 = anIntArray323[anInt3825];
					local741 = anIntArray323[anInt3825 + 1];
					if (local157 >= 0 && local157 < 2) {
						Static351.anIntArrayArrayArray10[local157] = new int[local741 << 1][4];
					}
					return;
				}
				if (arg0 == 5406) {
					anInt3825 -= 7;
					local157 = anIntArray323[anInt3825];
					local741 = anIntArray323[anInt3825 + 1] << 1;
					local89 = anIntArray323[anInt3825 + 2];
					local95 = anIntArray323[anInt3825 + 3];
					local2762 = anIntArray323[anInt3825 + 4];
					@Pc(3182) int local3182 = anIntArray323[anInt3825 + 5];
					@Pc(3188) int local3188 = anIntArray323[anInt3825 + 6];
					if (local157 >= 0 && local157 < 2 && Static351.anIntArrayArrayArray10[local157] != null && local741 >= 0 && local741 < Static351.anIntArrayArrayArray10[local157].length) {
						Static351.anIntArrayArrayArray10[local157][local741] = new int[] { (local89 >> 14 & 0x3FFF) << 9, local95 << 2, (local89 & 0x3FFF) << 9, local3188 };
						Static351.anIntArrayArrayArray10[local157][local741 + 1] = new int[] { (local2762 >> 14 & 0x3FFF) << 9, local3182 << 2, (local2762 & 0x3FFF) << 9 };
					}
					return;
				}
				if (arg0 == 5407) {
					local157 = Static351.anIntArrayArrayArray10[anIntArray323[--anInt3825]].length >> 1;
					anIntArray323[anInt3825++] = local157;
					return;
				}
				if (arg0 == 5411) {
					if (Static85.aFrame1 != null) {
						Static192.method3260(Static58.aClass6_Sub17_Sub1_1.anInt9294, false, -1, -1);
					}
					if (Static435.aFrame2 != null) {
						Static112.method1708();
						System.exit(0);
						return;
					}
					local75 = Static451.aString64 == null ? Static196.method3305() : Static451.aString64;
					Static283.method4315(false, local75, Static79.anInt2700 == 1, Static174.aClass313_24);
					return;
				}
				if (arg0 == 5419) {
					local75 = "";
					if (Static154.aClass224_5 != null) {
						if (Static154.aClass224_5.anObject14 == null) {
							local75 = Static294.method4416(Static154.aClass224_5.anInt6631);
						} else {
							local75 = (String) Static154.aClass224_5.anObject14;
						}
					}
					aStringArray20[anInt3833++] = local75;
					return;
				}
				if (arg0 == 5420) {
					anIntArray323[anInt3825++] = Static174.aClass313_24.aBoolean569 ? 0 : 1;
					return;
				}
				if (arg0 == 5421) {
					if (Static85.aFrame1 != null) {
						Static192.method3260(Static58.aClass6_Sub17_Sub1_1.anInt9294, false, -1, -1);
					}
					local75 = aStringArray20[--anInt3833];
					local1425 = anIntArray323[--anInt3825] == 1;
					local163 = Static196.method3305() + local75;
					Static283.method4315(local1425, local163, Static79.anInt2700 == 1, Static174.aClass313_24);
					return;
				}
				if (arg0 == 5422) {
					anInt3833 -= 2;
					local75 = aStringArray20[anInt3833];
					local81 = aStringArray20[anInt3833 + 1];
					local89 = anIntArray323[--anInt3825];
					if (local75.length() > 0) {
						if (Static161.aStringArray16 == null) {
							Static161.aStringArray16 = new String[Static42.anIntArray32[Static172.aClass68_4.anInt1509]];
						}
						Static161.aStringArray16[local89] = local75;
					}
					if (local81.length() > 0) {
						if (Static187.aStringArray18 == null) {
							Static187.aStringArray18 = new String[Static42.anIntArray32[Static172.aClass68_4.anInt1509]];
						}
						Static187.aStringArray18[local89] = local81;
					}
					return;
				}
				if (arg0 == 5423) {
					System.out.println(aStringArray20[--anInt3833]);
					return;
				}
				if (arg0 == 5424) {
					anInt3825 -= 11;
					Static321.anInt6143 = anIntArray323[anInt3825];
					Static54.anInt962 = anIntArray323[anInt3825 + 1];
					Static379.anInt6947 = anIntArray323[anInt3825 + 2];
					Static568.anInt9837 = anIntArray323[anInt3825 + 3];
					Static576.anInt9883 = anIntArray323[anInt3825 + 4];
					Static388.anInt7097 = anIntArray323[anInt3825 + 5];
					Static504.anInt8759 = anIntArray323[anInt3825 + 6];
					Static353.anInt6592 = anIntArray323[anInt3825 + 7];
					Static57.anInt991 = anIntArray323[anInt3825 + 8];
					Static17.anInt233 = anIntArray323[anInt3825 + 9];
					Static415.anInt7404 = anIntArray323[anInt3825 + 10];
					Static114.aClass248_20.method5804(Static576.anInt9883);
					Static114.aClass248_20.method5804(Static388.anInt7097);
					Static114.aClass248_20.method5804(Static504.anInt8759);
					Static114.aClass248_20.method5804(Static353.anInt6592);
					Static114.aClass248_20.method5804(Static57.anInt991);
					Static31.aClass71_5 = null;
					Static571.aClass71_58 = null;
					Static507.aClass71_53 = null;
					Static147.aClass71_14 = null;
					Static469.aClass71_49 = null;
					Static526.aClass71_57 = null;
					Static217.aClass71_23 = null;
					Static40.aClass71_56 = null;
					Static544.aBoolean506 = true;
					return;
				}
				if (arg0 == 5425) {
					Static409.method5886();
					Static544.aBoolean506 = false;
					return;
				}
				if (arg0 == 5426) {
					anInt3825 -= 2;
					Static269.anInt4756 = anIntArray323[anInt3825];
					Static536.anInt9207 = anIntArray323[anInt3825 + 1];
					return;
				}
				if (arg0 == 5427) {
					anInt3825 -= 2;
					Static563.anInt9783 = anIntArray323[anInt3825 + 1];
					return;
				}
				if (arg0 == 5428) {
					anInt3825 -= 2;
					local157 = anIntArray323[anInt3825];
					local741 = anIntArray323[anInt3825 + 1];
					anIntArray323[anInt3825++] = Static173.method2706(local741, local157) ? 1 : 0;
					return;
				}
				if (arg0 == 5429) {
					Static460.method6443(false, aStringArray20[--anInt3833], false);
					return;
				}
				if (arg0 == 5430) {
					try {
						Static594.method6348("accountcreated", Static198.anApplet1);
						return;
					} catch (@Pc(3720) Throwable local3720) {
						return;
					}
				}
				if (arg0 == 5431) {
					try {
						Static594.method6348("accountcreatestarted", Static198.anApplet1);
						return;
					} catch (@Pc(3731) Throwable local3731) {
						return;
					}
				}
			} else if (arg0 < 5600) {
				if (arg0 == 5500) {
					anInt3825 -= 4;
					local157 = anIntArray323[anInt3825];
					local741 = anIntArray323[anInt3825 + 1];
					local89 = anIntArray323[anInt3825 + 2];
					local95 = anIntArray323[anInt3825 + 3];
					Static130.method2064(false, local89, (local157 & 0x3FFF) - Static154.anInt2878, local95, local741 << 2, (local157 >> 14 & 0x3FFF) - Static150.anInt2792);
					return;
				}
				if (arg0 == 5501) {
					anInt3825 -= 4;
					local157 = anIntArray323[anInt3825];
					local741 = anIntArray323[anInt3825 + 1];
					local89 = anIntArray323[anInt3825 + 2];
					local95 = anIntArray323[anInt3825 + 3];
					Static88.method1369(local89, (local157 >> 14 & 0x3FFF) - Static150.anInt2792, local741 << 2, (local157 & 0x3FFF) - Static154.anInt2878, local95);
					return;
				}
				if (arg0 == 5502) {
					anInt3825 -= 6;
					local157 = anIntArray323[anInt3825];
					if (local157 >= 2) {
						throw new RuntimeException();
					}
					Static140.anInt2734 = local157;
					local741 = anIntArray323[anInt3825 + 1];
					if (local741 + 1 >= Static351.anIntArrayArrayArray10[Static140.anInt2734].length >> 1) {
						throw new RuntimeException();
					}
					Static153.anInt2863 = local741;
					Static60.anInt1009 = 0;
					Static152.anInt1935 = anIntArray323[anInt3825 + 2];
					Static86.anInt10003 = anIntArray323[anInt3825 + 3];
					local89 = anIntArray323[anInt3825 + 4];
					if (local89 >= 2) {
						throw new RuntimeException();
					}
					Static89.anInt1491 = local89;
					local95 = anIntArray323[anInt3825 + 5];
					if (local95 + 1 >= Static351.anIntArrayArrayArray10[Static89.anInt1491].length >> 1) {
						throw new RuntimeException();
					}
					Static331.anInt6257 = local95;
					Static60.anInt1008 = 3;
					return;
				}
				if (arg0 == 5503) {
					Static212.method7945();
					return;
				}
				if (arg0 == 5504) {
					anInt3825 -= 2;
					Static284.method4343(anIntArray323[anInt3825], anIntArray323[anInt3825 + 1]);
					return;
				}
				if (arg0 == 5505) {
					anIntArray323[anInt3825++] = (int) Static532.aFloat185 >> 3;
					return;
				}
				if (arg0 == 5506) {
					anIntArray323[anInt3825++] = (int) Static562.aFloat14 >> 3;
					return;
				}
				if (arg0 == 5507) {
					Static307.method4616();
					return;
				}
				if (arg0 == 5508) {
					Static473.method6557();
					return;
				}
				if (arg0 == 5509) {
					Static440.method6241();
					return;
				}
				if (arg0 == 5510) {
					Static110.method1699();
					return;
				}
				if (arg0 == 5511) {
					local157 = anIntArray323[--anInt3825];
					local741 = local157 >> 14 & 0x3FFF;
					local89 = local157 & 0x3FFF;
					local741 -= Static150.anInt2792;
					if (local741 < 0) {
						local741 = 0;
					} else if (local741 >= Static18.anInt5706) {
						local741 = Static18.anInt5706;
					}
					local89 -= Static154.anInt2878;
					if (local89 < 0) {
						local89 = 0;
					} else if (local89 >= Static80.anInt1367) {
						local89 = Static80.anInt1367;
					}
					Static173.anInt3141 = (local741 << 9) + 256;
					Static450.anInt7952 = (local89 << 9) + 256;
					Static60.anInt1008 = 4;
					return;
				}
				if (arg0 == 5512) {
					Static49.method761();
					return;
				}
			} else if (arg0 < 5700) {
				if (arg0 == 5600) {
					anInt3833 -= 2;
					local75 = aStringArray20[anInt3833];
					local81 = aStringArray20[anInt3833 + 1];
					local89 = anIntArray323[--anInt3825];
					if (Static375.anInt9162 != 3) {
						return;
					}
					if (Static252.anInt4624 == 0 && Static402.anInt7273 == 0) {
						Static286.aString42 = local75;
						Static576.aString93 = local81;
						Static526.anInt9112 = local89;
						Static436.method6188(6);
						return;
					}
					return;
				}
				if (arg0 == 5601) {
					Static241.method3748();
					return;
				}
				if (arg0 == 5602) {
					if (Static252.anInt4624 == 0) {
						Static274.anInt4852 = -2;
						Static122.anInt2112 = -2;
					}
					return;
				}
				if (arg0 == 5603) {
					anInt3825 -= 4;
					if (Static375.anInt9162 != 3) {
						return;
					}
					if (Static252.anInt4624 == 0 && Static402.anInt7273 == 0) {
						Static123.method1917(anIntArray323[anInt3825 + 2], anIntArray323[anInt3825 + 3], anIntArray323[anInt3825 + 1], anIntArray323[anInt3825]);
						return;
					}
					return;
				}
				if (arg0 == 5604) {
					anInt3833--;
					if (Static375.anInt9162 != 3) {
						return;
					}
					if (Static252.anInt4624 == 0 && Static402.anInt7273 == 0) {
						Static45.method726(Static529.method7820(aStringArray20[anInt3833]));
						return;
					}
					return;
				}
				if (arg0 == 5605) {
					anInt3833 -= 2;
					if (Static375.anInt9162 != 3) {
						return;
					}
					if (Static252.anInt4624 == 0 && Static402.anInt7273 == 0) {
						Static517.method7073(Static529.method7820(aStringArray20[anInt3833]), aStringArray20[anInt3833 + 1], false);
						return;
					}
					return;
				}
				if (arg0 == 5606) {
					if (Static402.anInt7273 == 0) {
						Static331.anInt6271 = -2;
					}
					return;
				}
				if (arg0 == 5607) {
					anIntArray323[anInt3825++] = Static122.anInt2112;
					return;
				}
				if (arg0 == 5608) {
					anIntArray323[anInt3825++] = Static56.anInt979;
					return;
				}
				if (arg0 == 5609) {
					anIntArray323[anInt3825++] = Static331.anInt6271;
					return;
				}
				if (arg0 == 5610) {
					for (local157 = 0; local157 < 5; local157++) {
						aStringArray20[anInt3833++] = Static109.aStringArray17.length > local157 ? Static424.method5982(Static109.aStringArray17[local157]) : "";
					}
					Static109.aStringArray17 = null;
					return;
				}
				if (arg0 == 5611) {
					anIntArray323[anInt3825++] = Static496.anInt9104;
					return;
				}
				if (arg0 == 5612) {
					local157 = anIntArray323[--anInt3825];
					if (Static375.anInt9162 != 7) {
						return;
					}
					if (Static252.anInt4624 == 0 && Static402.anInt7273 == 0) {
						if (Static354.aClass1_1 != null) {
							Static354.aClass1_1.method50();
							Static354.aClass1_1 = null;
						}
						Static526.anInt9112 = local157;
						Static436.method6188(9);
						return;
					}
					return;
				}
				if (arg0 == 5613) {
					anIntArray323[anInt3825++] = Static122.anInt2112;
					return;
				}
				if (arg0 == 5615) {
					anInt3833 -= 2;
					local75 = aStringArray20[anInt3833];
					local81 = aStringArray20[anInt3833 + 1];
					if (Static375.anInt9162 != 3) {
						return;
					}
					if (Static252.anInt4624 == 0 && Static402.anInt7273 == 0) {
						if (Static354.aClass1_1 != null) {
							Static354.aClass1_1.method50();
							Static354.aClass1_1 = null;
						}
						Static286.aString42 = local75;
						Static576.aString93 = local81;
						Static436.method6188(5);
						return;
					}
					return;
				}
				if (arg0 == 5616) {
					Static342.method5247(false);
					return;
				}
				if (arg0 == 5617) {
					anIntArray323[anInt3825++] = Static274.anInt4852;
					return;
				}
				if (arg0 == 5618) {
					local157 = anIntArray323[--anInt3825];
					Static77.method1111(local157, false);
					return;
				}
				if (arg0 == 5619) {
					local157 = anIntArray323[--anInt3825];
					Static77.method1111(local157, true);
					return;
				}
				if (arg0 == 5620) {
					Static526.method7221();
					if (Static277.aString39 != "" && Static277.aString39 != "") {
						anIntArray323[anInt3825++] = 1;
						return;
					}
					anIntArray323[anInt3825++] = 0;
					return;
				}
				if (arg0 == 5621) {
					anInt3833 -= 2;
					if (Static375.anInt9162 != 3) {
						return;
					}
					if (Static252.anInt4624 == 0 && Static402.anInt7273 == 0) {
						Static517.method7073(Static529.method7820(aStringArray20[anInt3833]), aStringArray20[anInt3833 + 1], true);
						return;
					}
					return;
				}
				if (arg0 == 5622) {
					@Pc(4525) Class224 local4525 = Static174.aClass313_24.method6994("3", false);
					while (local4525.anInt6632 == 0) {
						Static183.method3079(1L);
					}
					if (local4525.anInt6632 == 2) {
						throw new RuntimeException("Error opening file");
					}
					@Pc(4545) Class108 local4545 = (Class108) local4525.anObject14;
					if (local4545.method2445().exists()) {
						@Pc(4555) Class6_Sub12 local4555 = new Class6_Sub12(50);
						try {
							local4545.method2447(local4555.aByteArray97, 0, 50);
						} catch (@Pc(4564) IOException local4564) {
						}
					}
					try {
						local4545.method2453();
						return;
					} catch (@Pc(4570) Exception local4570) {
						return;
					}
				}
				if (arg0 == 5623) {
					if (Static299.aString45 != null) {
						anIntArray323[anInt3825++] = 1;
						return;
					}
					anIntArray323[anInt3825++] = 0;
					return;
				}
				if (arg0 == 5624) {
					anIntArray323[anInt3825++] = (int) (Static184.aLong78 >> 32);
					anIntArray323[anInt3825++] = (int) (Static184.aLong78 & 0xFFFFL);
					return;
				}
			} else if (arg0 < 6100) {
				if (arg0 == 6001) {
					local157 = anIntArray323[--anInt3825];
					if (local157 < 1) {
						local157 = 1;
					}
					if (local157 > 4) {
						local157 = 4;
					}
					Static58.aClass6_Sub17_Sub1_1.anInt9274 = local157;
					Static272.method4086();
					Static58.aClass6_Sub17_Sub1_1.method7359(Static174.aClass313_24);
					Static252.aBoolean341 = false;
					return;
				}
				if (arg0 == 6002) {
					Static58.aClass6_Sub17_Sub1_1.method7358(anIntArray323[--anInt3825] == 1);
					Static272.method4086();
					Static470.method6544();
					Static58.aClass6_Sub17_Sub1_1.method7359(Static174.aClass313_24);
					Static252.aBoolean341 = false;
					return;
				}
				if (arg0 == 6003) {
					Static58.aClass6_Sub17_Sub1_1.aBoolean613 = anIntArray323[--anInt3825] == 1;
					Static470.method6544();
					Static58.aClass6_Sub17_Sub1_1.method7359(Static174.aClass313_24);
					Static252.aBoolean341 = false;
					return;
				}
				if (arg0 == 6005) {
					Static58.aClass6_Sub17_Sub1_1.aBoolean614 = anIntArray323[--anInt3825] == 1;
					Static272.method4086();
					Static58.aClass6_Sub17_Sub1_1.method7359(Static174.aClass313_24);
					Static252.aBoolean341 = false;
					return;
				}
				if (arg0 == 6006) {
					Static58.aClass6_Sub17_Sub1_1.aBoolean601 = anIntArray323[--anInt3825] == 1;
					Static554.aClass90_12.method7483(!Static58.aClass6_Sub17_Sub1_1.aBoolean601);
					Static58.aClass6_Sub17_Sub1_1.method7359(Static174.aClass313_24);
					Static252.aBoolean341 = false;
					return;
				}
				if (arg0 == 6007) {
					Static58.aClass6_Sub17_Sub1_1.anInt9277 = anIntArray323[--anInt3825];
					Static58.aClass6_Sub17_Sub1_1.method7359(Static174.aClass313_24);
					Static252.aBoolean341 = false;
					return;
				}
				if (arg0 == 6008) {
					Static58.aClass6_Sub17_Sub1_1.aBoolean609 = anIntArray323[--anInt3825] == 1;
					Static58.aClass6_Sub17_Sub1_1.method7359(Static174.aClass313_24);
					Static252.aBoolean341 = false;
					return;
				}
				if (arg0 == 6009) {
					Static58.aClass6_Sub17_Sub1_1.aBoolean606 = anIntArray323[--anInt3825] == 1;
					Static272.method4086();
					Static58.aClass6_Sub17_Sub1_1.method7359(Static174.aClass313_24);
					Static252.aBoolean341 = false;
					return;
				}
				if (arg0 == 6010) {
					Static58.aClass6_Sub17_Sub1_1.aBoolean602 = anIntArray323[--anInt3825] == 1;
					Static58.aClass6_Sub17_Sub1_1.method7359(Static174.aClass313_24);
					Static252.aBoolean341 = false;
					return;
				}
				if (arg0 == 6011) {
					local157 = anIntArray323[--anInt3825];
					if (local157 < 0 || local157 > 2) {
						local157 = 0;
					}
					Static58.aClass6_Sub17_Sub1_1.method7349(Static79.anInt2700, local157);
					Static272.method4086();
					Static58.aClass6_Sub17_Sub1_1.method7359(Static174.aClass313_24);
					Static252.aBoolean341 = false;
					return;
				}
				if (arg0 == 6012) {
					Static58.aClass6_Sub17_Sub1_1.method7347(Static79.anInt2700, anIntArray323[--anInt3825] == 1);
					Static28.method407();
					Static323.method4986();
					Static58.aClass6_Sub17_Sub1_1.method7359(Static174.aClass313_24);
					Static252.aBoolean341 = false;
					return;
				}
				if (arg0 == 6014) {
					Static58.aClass6_Sub17_Sub1_1.aBoolean604 = anIntArray323[--anInt3825] == 1;
					Static272.method4086();
					Static58.aClass6_Sub17_Sub1_1.method7359(Static174.aClass313_24);
					Static252.aBoolean341 = false;
					return;
				}
				if (arg0 == 6015) {
					Static58.aClass6_Sub17_Sub1_1.aBoolean610 = anIntArray323[--anInt3825] == 1;
					Static272.method4086();
					Static58.aClass6_Sub17_Sub1_1.method7359(Static174.aClass313_24);
					Static252.aBoolean341 = false;
					return;
				}
				if (arg0 == 6016) {
					local157 = anIntArray323[--anInt3825];
					if (local157 < 0 || local157 > 2) {
						local157 = 0;
					}
					Static58.aClass6_Sub17_Sub1_1.anInt9282 = local157;
					Static584.method7942(Static79.anInt2700);
					Static58.aClass6_Sub17_Sub1_1.method7359(Static174.aClass313_24);
					return;
				}
				if (arg0 == 6017) {
					Static58.aClass6_Sub17_Sub1_1.aBoolean600 = anIntArray323[--anInt3825] == 1;
					Static38.method635();
					Static58.aClass6_Sub17_Sub1_1.method7359(Static174.aClass313_24);
					Static252.aBoolean341 = false;
					return;
				}
				if (arg0 == 6018) {
					local157 = anIntArray323[--anInt3825];
					if (local157 < 0) {
						local157 = 0;
					}
					if (local157 > 127) {
						local157 = 127;
					}
					Static58.aClass6_Sub17_Sub1_1.anInt9279 = local157;
					Static58.aClass6_Sub17_Sub1_1.method7359(Static174.aClass313_24);
					Static252.aBoolean341 = false;
					return;
				}
				if (arg0 == 6019) {
					local157 = anIntArray323[--anInt3825];
					if (local157 < 0) {
						local157 = 0;
					}
					if (local157 > 255) {
						local157 = 255;
					}
					if (local157 != Static58.aClass6_Sub17_Sub1_1.anInt9287) {
						if (Static58.aClass6_Sub17_Sub1_1.anInt9287 == 0 && Static175.anInt3168 != -1) {
							Static365.method5403(Static175.anInt3168, Static262.aClass248_36, local157);
							Static396.aBoolean490 = false;
						} else if (local157 == 0) {
							Static259.method3990();
							Static396.aBoolean490 = false;
						} else {
							Static274.method4110(local157);
						}
						Static58.aClass6_Sub17_Sub1_1.anInt9287 = local157;
					}
					Static58.aClass6_Sub17_Sub1_1.method7359(Static174.aClass313_24);
					Static252.aBoolean341 = false;
					return;
				}
				if (arg0 == 6020) {
					local157 = anIntArray323[--anInt3825];
					if (local157 < 0) {
						local157 = 0;
					}
					if (local157 > 127) {
						local157 = 127;
					}
					Static58.aClass6_Sub17_Sub1_1.anInt9286 = local157;
					Static58.aClass6_Sub17_Sub1_1.method7359(Static174.aClass313_24);
					Static252.aBoolean341 = false;
					return;
				}
				if (arg0 == 6021) {
					Static58.aClass6_Sub17_Sub1_1.aBoolean617 = anIntArray323[--anInt3825] == 1;
					Static470.method6544();
					return;
				}
				if (arg0 == 6023) {
					local157 = anIntArray323[--anInt3825];
					local1425 = false;
					if (local157 < 0) {
						local157 = 0;
					}
					if (local157 > 2) {
						local157 = 2;
					}
					if (Static355.anInt6598 < 96) {
						local157 = 0;
						local1425 = true;
					}
					Static282.method4301(local157);
					Static58.aClass6_Sub17_Sub1_1.method7359(Static174.aClass313_24);
					Static252.aBoolean341 = false;
					anIntArray323[anInt3825++] = local1425 ? 0 : 1;
					return;
				}
				if (arg0 == 6024) {
					local157 = anIntArray323[--anInt3825];
					if (local157 < 0 || local157 > 2) {
						local157 = 0;
					}
					Static58.aClass6_Sub17_Sub1_1.anInt9268 = local157;
					Static58.aClass6_Sub17_Sub1_1.method7359(Static174.aClass313_24);
					return;
				}
				if (arg0 == 6025) {
					local157 = anIntArray323[--anInt3825];
					if (local157 < 0 || local157 > Static371.method6427(Static355.anInt6598)) {
						local157 = 0;
					}
					Static58.aClass6_Sub17_Sub1_1.anInt9291 = local157;
					Static58.aClass6_Sub17_Sub1_1.method7359(Static174.aClass313_24);
					Static252.aBoolean341 = false;
					return;
				}
				if (arg0 == 6027) {
					local157 = anIntArray323[--anInt3825];
					if (local157 < 0 || local157 > 1) {
						local157 = 0;
					}
					Static287.method4362(local157 == 1);
					return;
				}
				if (arg0 == 6028) {
					Static58.aClass6_Sub17_Sub1_1.aBoolean608 = anIntArray323[--anInt3825] != 0;
					Static58.aClass6_Sub17_Sub1_1.method7359(Static174.aClass313_24);
					return;
				}
				if (arg0 == 6029) {
					Static58.aClass6_Sub17_Sub1_1.anInt9277 = anIntArray323[--anInt3825];
					Static58.aClass6_Sub17_Sub1_1.method7359(Static174.aClass313_24);
					return;
				}
				if (arg0 == 6030) {
					Static58.aClass6_Sub17_Sub1_1.aBoolean599 = anIntArray323[--anInt3825] != 0;
					Static58.aClass6_Sub17_Sub1_1.method7359(Static174.aClass313_24);
					Static272.method4086();
					return;
				}
				if (arg0 == 6031) {
					local157 = anIntArray323[--anInt3825];
					if (local157 < 0 || local157 > 5) {
						local157 = 2;
					}
					Static584.method7942(local157);
					return;
				}
				if (arg0 == 6032) {
					local157 = anIntArray323[--anInt3825];
					if (local157 < 0 || local157 > 5) {
						local157 = 2;
					}
					Static58.aClass6_Sub17_Sub1_1.anInt9281 = local157;
					Static58.aClass6_Sub17_Sub1_1.method7359(Static174.aClass313_24);
					Static252.aBoolean341 = false;
					return;
				}
				if (arg0 == 6033) {
					local157 = anIntArray323[--anInt3825];
					if (local157 < 0 || local157 > 4) {
						local157 = 2;
					}
					Static58.aClass6_Sub17_Sub1_1.anInt9271 = local157;
					Static58.aClass6_Sub17_Sub1_1.method7359(Static174.aClass313_24);
					return;
				}
				if (arg0 == 6034) {
					Static58.aClass6_Sub17_Sub1_1.aBoolean605 = anIntArray323[--anInt3825] == 1;
					Static58.aClass6_Sub17_Sub1_1.method7359(Static174.aClass313_24);
					Static28.method407();
					Static252.aBoolean341 = false;
					return;
				}
				if (arg0 == 6035) {
					Static58.aClass6_Sub17_Sub1_1.aBoolean618 = anIntArray323[--anInt3825] == 1;
					Static272.method4086();
					Static470.method6544();
					return;
				}
				if (arg0 == 6036) {
					local157 = anIntArray323[--anInt3825];
					if (local157 < 0 || local157 > 2) {
						local157 = 0;
					}
					Static58.aClass6_Sub17_Sub1_1.method7368(local157);
					Static58.aClass6_Sub17_Sub1_1.method7359(Static174.aClass313_24);
					return;
				}
				if (arg0 == 6037) {
					local157 = anIntArray323[--anInt3825];
					if (local157 < 0) {
						local157 = 0;
					}
					if (local157 > 127) {
						local157 = 127;
					}
					Static58.aClass6_Sub17_Sub1_1.anInt9288 = local157;
					Static58.aClass6_Sub17_Sub1_1.method7359(Static174.aClass313_24);
					Static252.aBoolean341 = false;
					return;
				}
				if (arg0 == 6038) {
					local157 = anIntArray323[--anInt3825];
					if (local157 < 0) {
						local157 = 0;
					}
					if (local157 > 255) {
						local157 = 255;
					}
					if (local157 != Static58.aClass6_Sub17_Sub1_1.anInt9269 && Static175.anInt3168 == Static17.anInt235) {
						if (Static58.aClass6_Sub17_Sub1_1.anInt9269 == 0) {
							Static365.method5403(Static175.anInt3168, Static262.aClass248_36, local157);
							Static396.aBoolean490 = false;
						} else if (local157 == 0) {
							Static259.method3990();
							Static396.aBoolean490 = false;
						} else {
							Static274.method4110(local157);
						}
					}
					Static58.aClass6_Sub17_Sub1_1.anInt9269 = local157;
					Static58.aClass6_Sub17_Sub1_1.method7359(Static174.aClass313_24);
					Static252.aBoolean341 = false;
					return;
				}
				if (arg0 == 6039) {
					local157 = anIntArray323[--anInt3825];
					if (local157 > 255 || local157 < 0) {
						local157 = 0;
					}
					if (local157 != Static58.aClass6_Sub17_Sub1_1.anInt9270) {
						Static58.aClass6_Sub17_Sub1_1.anInt9270 = local157;
						Static58.aClass6_Sub17_Sub1_1.method7359(Static174.aClass313_24);
						Static252.aBoolean341 = false;
					}
					return;
				}
			} else if (arg0 < 6200) {
				if (arg0 == 6101) {
					anIntArray323[anInt3825++] = Static58.aClass6_Sub17_Sub1_1.anInt9274;
					return;
				}
				if (arg0 == 6102) {
					anIntArray323[anInt3825++] = Static58.aClass6_Sub17_Sub1_1.method7357(Static79.anInt2700) ? 1 : 0;
					return;
				}
				if (arg0 == 6103) {
					anIntArray323[anInt3825++] = Static58.aClass6_Sub17_Sub1_1.aBoolean613 ? 1 : 0;
					return;
				}
				if (arg0 == 6105) {
					anIntArray323[anInt3825++] = Static58.aClass6_Sub17_Sub1_1.aBoolean614 ? 1 : 0;
					return;
				}
				if (arg0 == 6106) {
					anIntArray323[anInt3825++] = Static58.aClass6_Sub17_Sub1_1.aBoolean601 ? 1 : 0;
					return;
				}
				if (arg0 == 6107) {
					anIntArray323[anInt3825++] = Static58.aClass6_Sub17_Sub1_1.anInt9277;
					return;
				}
				if (arg0 == 6108) {
					anIntArray323[anInt3825++] = Static58.aClass6_Sub17_Sub1_1.aBoolean609 ? 1 : 0;
					return;
				}
				if (arg0 == 6109) {
					anIntArray323[anInt3825++] = Static58.aClass6_Sub17_Sub1_1.aBoolean606 ? 1 : 0;
					return;
				}
				if (arg0 == 6110) {
					anIntArray323[anInt3825++] = Static58.aClass6_Sub17_Sub1_1.aBoolean602 ? 1 : 0;
					return;
				}
				if (arg0 == 6111) {
					anIntArray323[anInt3825++] = Static58.aClass6_Sub17_Sub1_1.method7348(Static79.anInt2700);
					return;
				}
				if (arg0 == 6112) {
					anIntArray323[anInt3825++] = Static58.aClass6_Sub17_Sub1_1.method7351(Static79.anInt2700) ? 1 : 0;
					return;
				}
				if (arg0 == 6114) {
					anIntArray323[anInt3825++] = Static58.aClass6_Sub17_Sub1_1.aBoolean604 ? 1 : 0;
					return;
				}
				if (arg0 == 6115) {
					anIntArray323[anInt3825++] = Static58.aClass6_Sub17_Sub1_1.aBoolean610 ? 1 : 0;
					return;
				}
				if (arg0 == 6116) {
					anIntArray323[anInt3825++] = Static58.aClass6_Sub17_Sub1_1.anInt9282;
					return;
				}
				if (arg0 == 6117) {
					anIntArray323[anInt3825++] = Static58.aClass6_Sub17_Sub1_1.aBoolean600 ? 1 : 0;
					return;
				}
				if (arg0 == 6118) {
					anIntArray323[anInt3825++] = Static58.aClass6_Sub17_Sub1_1.anInt9279;
					return;
				}
				if (arg0 == 6119) {
					anIntArray323[anInt3825++] = Static58.aClass6_Sub17_Sub1_1.anInt9287;
					return;
				}
				if (arg0 == 6120) {
					anIntArray323[anInt3825++] = Static58.aClass6_Sub17_Sub1_1.anInt9286;
					return;
				}
				if (arg0 == 6121) {
					anIntArray323[anInt3825++] = Static554.aClass90_12.method7493() ? 1 : 0;
					return;
				}
				if (arg0 == 6123) {
					anIntArray323[anInt3825++] = Static58.method836();
					return;
				}
				if (arg0 == 6124) {
					anIntArray323[anInt3825++] = Static58.aClass6_Sub17_Sub1_1.anInt9268;
					return;
				}
				if (arg0 == 6125) {
					anIntArray323[anInt3825++] = Static58.aClass6_Sub17_Sub1_1.anInt9291;
					return;
				}
				if (arg0 == 6126) {
					anIntArray323[anInt3825++] = Static554.aClass90_12.method7485() ? 1 : 0;
					return;
				}
				if (arg0 == 6127) {
					anIntArray323[anInt3825++] = Static58.aClass6_Sub17_Sub1_1.aBoolean603 ? 1 : 0;
					return;
				}
				if (arg0 == 6128) {
					anIntArray323[anInt3825++] = Static58.aClass6_Sub17_Sub1_1.aBoolean608 ? 1 : 0;
					return;
				}
				if (arg0 == 6129) {
					anIntArray323[anInt3825++] = Static58.aClass6_Sub17_Sub1_1.anInt9277;
					return;
				}
				if (arg0 == 6130) {
					anIntArray323[anInt3825++] = Static58.aClass6_Sub17_Sub1_1.aBoolean599 ? 1 : 0;
					return;
				}
				if (arg0 == 6131) {
					anIntArray323[anInt3825++] = Static79.anInt2700;
					return;
				}
				if (arg0 == 6132) {
					anIntArray323[anInt3825++] = Static58.aClass6_Sub17_Sub1_1.anInt9281;
					return;
				}
				if (arg0 == 6133) {
					anIntArray323[anInt3825++] = Static174.aClass313_24.aBoolean569 && !Static174.aClass313_24.aBoolean570 ? 1 : 0;
					return;
				}
				if (arg0 == 6134) {
					anIntArray323[anInt3825++] = Static371.method6427(Static355.anInt6598);
					return;
				}
				if (arg0 == 6135) {
					anIntArray323[anInt3825++] = Static58.aClass6_Sub17_Sub1_1.anInt9271;
					return;
				}
				if (arg0 == 6136) {
					anIntArray323[anInt3825++] = Static58.aClass6_Sub17_Sub1_1.aBoolean605 ? 1 : 0;
					return;
				}
				if (arg0 == 6137) {
					@Pc(6158) boolean local6158 = true;
					try {
						local6158 = jagmisc.getTotalPhysicalMemory() > 268435456L;
					} catch (@Pc(6168) Throwable local6168) {
					}
					anIntArray323[anInt3825++] = local6158 ? 1 : 0;
					return;
				}
				if (arg0 == 6138) {
					anIntArray323[anInt3825++] = Static500.method6914(200, Static79.anInt2700);
					return;
				}
				if (arg0 == 6139) {
					anIntArray323[anInt3825++] = Static58.aClass6_Sub17_Sub1_1.method7355(Static79.anInt2700);
					return;
				}
				if (arg0 == 6140) {
					@Pc(6216) byte local6216 = 0;
					if (Static473.method6560(Static79.anInt2700) && Static355.anInt6598 < 96) {
						local6216 = 1;
					}
					anIntArray323[anInt3825++] = local6216;
					return;
				}
				if (arg0 == 6141) {
					if (Static355.anInt6598 < 96) {
						anIntArray323[anInt3825++] = 0;
						return;
					}
					anIntArray323[anInt3825++] = 2;
					return;
				}
				if (arg0 == 6142) {
					anIntArray323[anInt3825++] = Static58.aClass6_Sub17_Sub1_1.anInt9288;
					return;
				}
				if (arg0 == 6143) {
					anIntArray323[anInt3825++] = Static58.aClass6_Sub17_Sub1_1.anInt9269;
					return;
				}
				if (arg0 == 6144) {
					anIntArray323[anInt3825++] = Static566.aBoolean663 ? 1 : 0;
					return;
				}
				if (arg0 == 6145) {
					anIntArray323[anInt3825++] = Static58.aClass6_Sub17_Sub1_1.anInt9270;
					return;
				}
			} else if (arg0 < 6300) {
				if (arg0 == 6200) {
					anInt3825 -= 2;
					Static567.aShort127 = (short) anIntArray323[anInt3825];
					if (Static567.aShort127 <= 0) {
						Static567.aShort127 = 256;
					}
					Static44.aShort12 = (short) anIntArray323[anInt3825 + 1];
					if (Static44.aShort12 <= 0) {
						Static44.aShort12 = 205;
					}
					return;
				}
				if (arg0 == 6201) {
					anInt3825 -= 2;
					Static287.aShort82 = (short) anIntArray323[anInt3825];
					if (Static287.aShort82 <= 0) {
						Static287.aShort82 = 256;
					}
					Static478.aShort104 = (short) anIntArray323[anInt3825 + 1];
					if (Static478.aShort104 <= 0) {
						Static478.aShort104 = 320;
					}
					return;
				}
				if (arg0 == 6202) {
					anInt3825 -= 4;
					Static439.aShort98 = (short) anIntArray323[anInt3825];
					if (Static439.aShort98 <= 0) {
						Static439.aShort98 = 1;
					}
					Static354.aShort86 = (short) anIntArray323[anInt3825 + 1];
					if (Static354.aShort86 <= 0) {
						Static354.aShort86 = 32767;
					} else if (Static354.aShort86 < Static439.aShort98) {
						Static354.aShort86 = Static439.aShort98;
					}
					Static106.aShort61 = (short) anIntArray323[anInt3825 + 2];
					if (Static106.aShort61 <= 0) {
						Static106.aShort61 = 1;
					}
					Static482.aShort105 = (short) anIntArray323[anInt3825 + 3];
					if (Static482.aShort105 <= 0) {
						Static482.aShort105 = 32767;
						return;
					}
					if (Static482.aShort105 < Static106.aShort61) {
						Static482.aShort105 = Static106.aShort61;
					}
					return;
				}
				if (arg0 == 6203) {
					Static577.method7887(Static264.aClass97_13.anInt2690, 0, false, 0, Static264.aClass97_13.anInt2670);
					anIntArray323[anInt3825++] = Static337.anInt6450;
					anIntArray323[anInt3825++] = Static135.anInt2588;
					return;
				}
				if (arg0 == 6204) {
					anIntArray323[anInt3825++] = Static287.aShort82;
					anIntArray323[anInt3825++] = Static478.aShort104;
					return;
				}
				if (arg0 == 6205) {
					anIntArray323[anInt3825++] = Static567.aShort127;
					anIntArray323[anInt3825++] = Static44.aShort12;
					return;
				}
			} else if (arg0 < 6400) {
				if (arg0 == 6300) {
					anIntArray323[anInt3825++] = (int) (Static416.method5922() / 60000L);
					return;
				}
				if (arg0 == 6301) {
					anIntArray323[anInt3825++] = (int) (Static416.method5922() / 86400000L) - 11745;
					return;
				}
				if (arg0 == 6302) {
					anInt3825 -= 3;
					local157 = anIntArray323[anInt3825];
					local741 = anIntArray323[anInt3825 + 1];
					local89 = anIntArray323[anInt3825 + 2];
					aCalendar1.clear();
					aCalendar1.set(11, 12);
					aCalendar1.set(local89, local741, local157);
					local95 = (int) (aCalendar1.getTime().getTime() / 86400000L) - 11745;
					if (local89 < 1970) {
						local95--;
					}
					anIntArray323[anInt3825++] = local95;
					return;
				}
				if (arg0 == 6303) {
					aCalendar1.clear();
					aCalendar1.setTime(new Date(Static416.method5922()));
					anIntArray323[anInt3825++] = aCalendar1.get(1);
					return;
				}
				if (arg0 == 6304) {
					local157 = anIntArray323[--anInt3825];
					local1425 = true;
					if (local157 < 0) {
						local1425 = (local157 + 1) % 4 == 0;
					} else if (local157 < 1582) {
						local1425 = local157 % 4 == 0;
					} else if (local157 % 4 != 0) {
						local1425 = false;
					} else if (local157 % 100 != 0) {
						local1425 = true;
					} else if (local157 % 400 != 0) {
						local1425 = false;
					}
					anIntArray323[anInt3825++] = local1425 ? 1 : 0;
					return;
				}
			} else if (arg0 < 6500) {
				if (arg0 == 6405) {
					anIntArray323[anInt3825++] = Static497.method6881() ? 1 : 0;
					return;
				}
				if (arg0 == 6406) {
					anIntArray323[anInt3825++] = Static514.method7054() ? 1 : 0;
					return;
				}
			} else if (arg0 < 6600) {
				if (arg0 == 6500) {
					if (Static375.anInt9162 == 7 && Static252.anInt4624 == 0 && Static402.anInt7273 == 0) {
						if (Static211.aBoolean213) {
							anIntArray323[anInt3825++] = 0;
							return;
						}
						if (Static435.aLong192 > Static416.method5922() - 1000L) {
							anIntArray323[anInt3825++] = 1;
							return;
						}
						Static211.aBoolean213 = true;
						Static534.method7063(Static561.aClass316_89);
						Static340.aClass6_Sub12_Sub2_1.method6042(Static135.anInt2591);
						anIntArray323[anInt3825++] = 0;
						return;
					}
					anIntArray323[anInt3825++] = 1;
					return;
				}
				@Pc(6833) Class85 local6833;
				@Pc(6800) Class139_Sub1 local6800;
				if (arg0 == 6501) {
					local6800 = Static364.method5401();
					if (local6800 != null) {
						anIntArray323[anInt3825++] = local6800.anInt7127;
						anIntArray323[anInt3825++] = local6800.anInt7124;
						aStringArray20[anInt3833++] = local6800.aString57;
						local6833 = local6800.method5694();
						anIntArray323[anInt3825++] = local6833.anInt2061;
						aStringArray20[anInt3833++] = local6833.aString13;
						anIntArray323[anInt3825++] = local6800.anInt7121;
						anIntArray323[anInt3825++] = local6800.anInt7130;
						aStringArray20[anInt3833++] = local6800.aString56;
						return;
					}
					anIntArray323[anInt3825++] = -1;
					anIntArray323[anInt3825++] = 0;
					aStringArray20[anInt3833++] = "";
					anIntArray323[anInt3825++] = 0;
					aStringArray20[anInt3833++] = "";
					anIntArray323[anInt3825++] = 0;
					anIntArray323[anInt3825++] = 0;
					aStringArray20[anInt3833++] = "";
					return;
				}
				if (arg0 == 6502) {
					local6800 = Static470.method6542();
					if (local6800 != null) {
						anIntArray323[anInt3825++] = local6800.anInt7127;
						anIntArray323[anInt3825++] = local6800.anInt7124;
						aStringArray20[anInt3833++] = local6800.aString57;
						local6833 = local6800.method5694();
						anIntArray323[anInt3825++] = local6833.anInt2061;
						aStringArray20[anInt3833++] = local6833.aString13;
						anIntArray323[anInt3825++] = local6800.anInt7121;
						anIntArray323[anInt3825++] = local6800.anInt7130;
						aStringArray20[anInt3833++] = local6800.aString56;
						return;
					}
					anIntArray323[anInt3825++] = -1;
					anIntArray323[anInt3825++] = 0;
					aStringArray20[anInt3833++] = "";
					anIntArray323[anInt3825++] = 0;
					aStringArray20[anInt3833++] = "";
					anIntArray323[anInt3825++] = 0;
					anIntArray323[anInt3825++] = 0;
					aStringArray20[anInt3833++] = "";
					return;
				}
				if (arg0 == 6503) {
					local157 = anIntArray323[--anInt3825];
					local81 = aStringArray20[--anInt3833];
					if (Static375.anInt9162 == 7 && Static252.anInt4624 == 0 && Static402.anInt7273 == 0) {
						anIntArray323[anInt3825++] = Static550.method7685(local157, local81) ? 1 : 0;
						return;
					}
					anIntArray323[anInt3825++] = 0;
					return;
				}
				if (arg0 == 6504) {
					Static58.aClass6_Sub17_Sub1_1.anInt9292 = anIntArray323[--anInt3825];
					Static58.aClass6_Sub17_Sub1_1.method7359(Static174.aClass313_24);
					return;
				}
				if (arg0 == 6505) {
					anIntArray323[anInt3825++] = Static58.aClass6_Sub17_Sub1_1.anInt9292;
					return;
				}
				if (arg0 == 6506) {
					local157 = anIntArray323[--anInt3825];
					@Pc(7190) Class139_Sub1 local7190 = Static246.method7301(local157);
					if (local7190 != null) {
						anIntArray323[anInt3825++] = local7190.anInt7124;
						aStringArray20[anInt3833++] = local7190.aString57;
						@Pc(7214) Class85 local7214 = local7190.method5694();
						anIntArray323[anInt3825++] = local7214.anInt2061;
						aStringArray20[anInt3833++] = local7214.aString13;
						anIntArray323[anInt3825++] = local7190.anInt7121;
						anIntArray323[anInt3825++] = local7190.anInt7130;
						aStringArray20[anInt3833++] = local7190.aString56;
						return;
					}
					anIntArray323[anInt3825++] = -1;
					aStringArray20[anInt3833++] = "";
					anIntArray323[anInt3825++] = 0;
					aStringArray20[anInt3833++] = "";
					anIntArray323[anInt3825++] = 0;
					anIntArray323[anInt3825++] = 0;
					aStringArray20[anInt3833++] = "";
					return;
				}
				if (arg0 == 6507) {
					anInt3825 -= 4;
					local157 = anIntArray323[anInt3825];
					local1425 = anIntArray323[anInt3825 + 1] == 1;
					local89 = anIntArray323[anInt3825 + 2];
					local2036 = anIntArray323[anInt3825 + 3] == 1;
					Static25.method352(local89, local157, local2036, local1425);
					return;
				}
				if (arg0 == 6508) {
					Static262.method3998();
					return;
				}
				if (arg0 == 6509) {
					if (Static375.anInt9162 != 7) {
						return;
					}
					Static260.aBoolean349 = anIntArray323[--anInt3825] == 1;
					return;
				}
				if (arg0 == 6510) {
					anIntArray323[anInt3825++] = Static152.anInt1937;
					return;
				}
			} else if (arg0 < 6700) {
				if (arg0 == 6600) {
					Static58.aClass6_Sub17_Sub1_1.aBoolean598 = anIntArray323[--anInt3825] == 1;
					Static58.aClass6_Sub17_Sub1_1.method7359(Static174.aClass313_24);
					return;
				}
				if (arg0 == 6601) {
					anIntArray323[anInt3825++] = Static58.aClass6_Sub17_Sub1_1.aBoolean598 ? 1 : 0;
					return;
				}
			} else if (arg0 < 6800 && Static546.aClass79_4 == Static17.aClass79_1) {
				if (arg0 == 6700) {
					local157 = Static162.aClass234_23.method5460();
					if (Static152.anInt1936 != -1) {
						local157++;
					}
					anIntArray323[anInt3825++] = local157;
					return;
				}
				if (arg0 == 6701) {
					local157 = anIntArray323[--anInt3825];
					if (Static152.anInt1936 != -1) {
						if (local157 == 0) {
							anIntArray323[anInt3825++] = Static152.anInt1936;
							return;
						}
						local157--;
					}
					@Pc(7501) Class6_Sub43 local7501 = (Class6_Sub43) Static162.aClass234_23.method5469();
					while (local157-- > 0) {
						local7501 = (Class6_Sub43) Static162.aClass234_23.method5465();
					}
					anIntArray323[anInt3825++] = local7501.anInt8192;
					return;
				}
				if (arg0 == 6702) {
					local157 = anIntArray323[--anInt3825];
					if (Static360.aClass97ArrayArray2[local157] == null) {
						aStringArray20[anInt3833++] = "";
						return;
					}
					local81 = Static360.aClass97ArrayArray2[local157][0].aString22;
					if (local81 == null) {
						aStringArray20[anInt3833++] = "";
						return;
					}
					aStringArray20[anInt3833++] = local81.substring(0, local81.indexOf(58));
					return;
				}
				if (arg0 == 6703) {
					local157 = anIntArray323[--anInt3825];
					if (Static360.aClass97ArrayArray2[local157] == null) {
						anIntArray323[anInt3825++] = 0;
						return;
					}
					anIntArray323[anInt3825++] = Static360.aClass97ArrayArray2[local157].length;
					return;
				}
				if (arg0 == 6704) {
					anInt3825 -= 2;
					local157 = anIntArray323[anInt3825];
					local741 = anIntArray323[anInt3825 + 1];
					if (Static360.aClass97ArrayArray2[local157] == null) {
						aStringArray20[anInt3833++] = "";
						return;
					}
					local163 = Static360.aClass97ArrayArray2[local157][local741].aString22;
					if (local163 == null) {
						aStringArray20[anInt3833++] = "";
						return;
					}
					aStringArray20[anInt3833++] = local163;
					return;
				}
				if (arg0 == 6705) {
					anInt3825 -= 2;
					local157 = anIntArray323[anInt3825];
					local741 = anIntArray323[anInt3825 + 1];
					if (Static360.aClass97ArrayArray2[local157] == null) {
						anIntArray323[anInt3825++] = 0;
						return;
					}
					anIntArray323[anInt3825++] = Static360.aClass97ArrayArray2[local157][local741].anInt2605;
					return;
				}
				if (arg0 == 6706) {
					return;
				}
				if (arg0 == 6707) {
					anInt3825 -= 3;
					local157 = anIntArray323[anInt3825];
					local741 = anIntArray323[anInt3825 + 1];
					local89 = anIntArray323[anInt3825 + 2];
					Static268.method4015("", 1, local89, local157 << 16 | local741);
					return;
				}
				if (arg0 == 6708) {
					anInt3825 -= 3;
					local157 = anIntArray323[anInt3825];
					local741 = anIntArray323[anInt3825 + 1];
					local89 = anIntArray323[anInt3825 + 2];
					Static268.method4015("", 2, local89, local157 << 16 | local741);
					return;
				}
				if (arg0 == 6709) {
					anInt3825 -= 3;
					local157 = anIntArray323[anInt3825];
					local741 = anIntArray323[anInt3825 + 1];
					local89 = anIntArray323[anInt3825 + 2];
					Static268.method4015("", 3, local89, local157 << 16 | local741);
					return;
				}
				if (arg0 == 6710) {
					anInt3825 -= 3;
					local157 = anIntArray323[anInt3825];
					local741 = anIntArray323[anInt3825 + 1];
					local89 = anIntArray323[anInt3825 + 2];
					Static268.method4015("", 4, local89, local157 << 16 | local741);
					return;
				}
				if (arg0 == 6711) {
					anInt3825 -= 3;
					local157 = anIntArray323[anInt3825];
					local741 = anIntArray323[anInt3825 + 1];
					local89 = anIntArray323[anInt3825 + 2];
					Static268.method4015("", 5, local89, local157 << 16 | local741);
					return;
				}
				if (arg0 == 6712) {
					anInt3825 -= 3;
					local157 = anIntArray323[anInt3825];
					local741 = anIntArray323[anInt3825 + 1];
					local89 = anIntArray323[anInt3825 + 2];
					Static268.method4015("", 6, local89, local157 << 16 | local741);
					return;
				}
				if (arg0 == 6713) {
					anInt3825 -= 3;
					local157 = anIntArray323[anInt3825];
					local741 = anIntArray323[anInt3825 + 1];
					local89 = anIntArray323[anInt3825 + 2];
					Static268.method4015("", 7, local89, local157 << 16 | local741);
					return;
				}
				if (arg0 == 6714) {
					anInt3825 -= 3;
					local157 = anIntArray323[anInt3825];
					local741 = anIntArray323[anInt3825 + 1];
					local89 = anIntArray323[anInt3825 + 2];
					Static268.method4015("", 8, local89, local157 << 16 | local741);
					return;
				}
				if (arg0 == 6715) {
					anInt3825 -= 3;
					local157 = anIntArray323[anInt3825];
					local741 = anIntArray323[anInt3825 + 1];
					local89 = anIntArray323[anInt3825 + 2];
					Static268.method4015("", 9, local89, local157 << 16 | local741);
					return;
				}
				if (arg0 == 6716) {
					anInt3825 -= 3;
					local157 = anIntArray323[anInt3825];
					local741 = anIntArray323[anInt3825 + 1];
					local89 = anIntArray323[anInt3825 + 2];
					Static268.method4015("", 10, local89, local157 << 16 | local741);
					return;
				}
				if (arg0 == 6717) {
					anInt3825 -= 3;
					local157 = anIntArray323[anInt3825];
					local741 = anIntArray323[anInt3825 + 1];
					local89 = anIntArray323[anInt3825 + 2];
					@Pc(8089) Class97 local8089 = Static76.method1088(local157 << 16 | local741, local89);
					Static269.method4026();
					@Pc(8094) Class6_Sub39 local8094 = Static74.method1044(local8089);
					Static249.method3893(local8094.anInt7309, local8094.method5834(), local8089);
					return;
				}
			} else if (arg0 < 6900) {
				@Pc(8122) Class336 local8122;
				if (arg0 == 6800) {
					local157 = anIntArray323[--anInt3825];
					local8122 = Static358.aClass320_3.method7209(local157);
					if (local8122.aString89 == null) {
						aStringArray20[anInt3833++] = "";
						return;
					}
					aStringArray20[anInt3833++] = local8122.aString89;
					return;
				}
				if (arg0 == 6801) {
					local157 = anIntArray323[--anInt3825];
					local8122 = Static358.aClass320_3.method7209(local157);
					anIntArray323[anInt3825++] = local8122.anInt9766;
					return;
				}
				if (arg0 == 6802) {
					local157 = anIntArray323[--anInt3825];
					local8122 = Static358.aClass320_3.method7209(local157);
					anIntArray323[anInt3825++] = local8122.anInt9762;
					return;
				}
				if (arg0 == 6803) {
					local157 = anIntArray323[--anInt3825];
					local8122 = Static358.aClass320_3.method7209(local157);
					anIntArray323[anInt3825++] = local8122.anInt9756;
					return;
				}
				if (arg0 == 6804) {
					anInt3825 -= 2;
					local157 = anIntArray323[anInt3825];
					local741 = anIntArray323[anInt3825 + 1];
					@Pc(8244) Class348 local8244 = Static111.aClass259_1.method5915(local741);
					if (local8244.method7864()) {
						aStringArray20[anInt3833++] = Static358.aClass320_3.method7209(local157).method7787(local8244.aString92, local741);
						return;
					}
					anIntArray323[anInt3825++] = Static358.aClass320_3.method7209(local157).method7789(local8244.anInt9885, local741);
					return;
				}
			} else if (arg0 < 7000) {
				if (arg0 == 6900) {
					anIntArray323[anInt3825++] = Static352.aBoolean457 && !Static135.aBoolean192 ? 1 : 0;
					return;
				}
				if (arg0 == 6901) {
					anIntArray323[anInt3825++] = Static194.anInt3796;
					return;
				}
				if (arg0 == 6902) {
					anIntArray323[anInt3825++] = Static57.anInt992;
					return;
				}
				if (arg0 == 6903) {
					anIntArray323[anInt3825++] = Static251.anInt4615;
					return;
				}
				if (arg0 == 6904) {
					anIntArray323[anInt3825++] = Static318.anInt6122;
					return;
				}
				if (arg0 == 6905) {
					local75 = "";
					if (Static154.aClass224_5 != null) {
						if (Static154.aClass224_5.anObject14 == null) {
							local75 = Static294.method4416(Static154.aClass224_5.anInt6631);
						} else {
							local75 = (String) Static154.aClass224_5.anObject14;
						}
					}
					aStringArray20[anInt3833++] = local75;
					return;
				}
				if (arg0 == 6906) {
					anIntArray323[anInt3825++] = Static289.anInt5315;
					return;
				}
				if (arg0 == 6907) {
					anIntArray323[anInt3825++] = Static267.anInt5410;
					return;
				}
				if (arg0 == 6908) {
					anIntArray323[anInt3825++] = Static41.anInt766;
					return;
				}
				if (arg0 == 6909) {
					anIntArray323[anInt3825++] = Static501.aBoolean566 ? 1 : 0;
					return;
				}
				if (arg0 == 6910) {
					anIntArray323[anInt3825++] = Static10.anInt138;
					return;
				}
				if (arg0 == 6911) {
					anIntArray323[anInt3825++] = Static241.anInt4411;
					return;
				}
				if (arg0 == 6912) {
					anIntArray323[anInt3825++] = Static496.anInt9105;
					return;
				}
			} else if (arg0 < 7100) {
				if (arg0 == 7000) {
					local157 = Static58.aClass6_Sub17_Sub1_1.method7356();
					anIntArray323[anInt3825++] = Static58.aClass6_Sub17_Sub1_1.anInt9310 = Static79.anInt2700;
					anIntArray323[anInt3825++] = local157;
					Static272.method4086();
					Static58.aClass6_Sub17_Sub1_1.method7359(Static174.aClass313_24);
					Static252.aBoolean341 = false;
					return;
				}
				if (arg0 == 7001) {
					Static58.aClass6_Sub17_Sub1_1.method7361();
					Static272.method4086();
					Static58.aClass6_Sub17_Sub1_1.method7359(Static174.aClass313_24);
					Static252.aBoolean341 = false;
					return;
				}
				if (arg0 == 7002) {
					Static58.aClass6_Sub17_Sub1_1.method7366();
					Static272.method4086();
					Static58.aClass6_Sub17_Sub1_1.method7359(Static174.aClass313_24);
					Static252.aBoolean341 = false;
					return;
				}
				if (arg0 == 7003) {
					Static58.aClass6_Sub17_Sub1_1.method7354();
					Static272.method4086();
					Static58.aClass6_Sub17_Sub1_1.method7359(Static174.aClass313_24);
					Static252.aBoolean341 = false;
					return;
				}
				if (arg0 == 7004) {
					Static58.aClass6_Sub17_Sub1_1.method7365();
					Static272.method4086();
					Static58.aClass6_Sub17_Sub1_1.method7359(Static174.aClass313_24);
					Static252.aBoolean341 = false;
					return;
				}
				if (arg0 == 7005) {
					Static58.aClass6_Sub17_Sub1_1.anInt9289 = 0;
					Static58.aClass6_Sub17_Sub1_1.method7359(Static174.aClass313_24);
					Static252.aBoolean341 = false;
					return;
				}
				if (arg0 == 7006) {
					if (Static58.aClass6_Sub17_Sub1_1.anInt9310 == 2) {
						Static58.aClass6_Sub17_Sub1_1.aBoolean619 = true;
						return;
					}
					if (Static58.aClass6_Sub17_Sub1_1.anInt9310 == 1) {
						Static58.aClass6_Sub17_Sub1_1.aBoolean615 = true;
						return;
					}
					if (Static58.aClass6_Sub17_Sub1_1.anInt9310 == 3) {
						Static58.aClass6_Sub17_Sub1_1.aBoolean616 = true;
					}
					return;
				}
				if (arg0 == 7007) {
					anIntArray323[anInt3825++] = Static58.aClass6_Sub17_Sub1_1.anInt9289;
					return;
				}
				if (arg0 == 7008) {
					if (Static79.anInt2700 == 0 && Static355.anInt6598 < 96) {
						anIntArray323[anInt3825++] = 2;
						return;
					}
					anIntArray323[anInt3825++] = 4;
					return;
				}
			}
		}
		throw new IllegalStateException(String.valueOf(arg0));
	}

	@OriginalMember(owner = "client!hj", name = "b", descriptor = "(I)V")
	public static void method3320(@OriginalArg(0) int arg0) {
		if (arg0 == -1 || !Static76.method1083(arg0)) {
			return;
		}
		@Pc(12) Class97[] local12 = Static360.aClass97ArrayArray2[arg0];
		for (@Pc(14) int local14 = 0; local14 < local12.length; local14++) {
			@Pc(19) Class97 local19 = local12[local14];
			if (local19.anObjectArray11 != null) {
				@Pc(26) Class6_Sub1 local26 = new Class6_Sub1();
				local26.aClass97_2 = local19;
				local26.anObjectArray1 = local19.anObjectArray11;
				method3324(local26, 2000000);
			}
		}
	}

	@OriginalMember(owner = "client!hj", name = "c", descriptor = "(I)V")
	private static void method3321(@OriginalArg(0) int arg0) {
		@Pc(3) Class97 local3 = Static495.method7281(arg0);
		if (local3 == null) {
			return;
		}
		@Pc(9) int local9 = arg0 >>> 16;
		@Pc(13) Class97[] local13 = Static140.aClass97ArrayArray1[local9];
		if (local13 == null) {
			@Pc(19) Class97[] local19 = Static360.aClass97ArrayArray2[local9];
			@Pc(22) int local22 = local19.length;
			local13 = Static140.aClass97ArrayArray1[local9] = new Class97[local22];
			Static596.method7721(local19, 0, local13, 0, local19.length);
		}
		@Pc(38) int local38;
		for (local38 = 0; local38 < local13.length && local13[local38] != local3; local38++) {
		}
		if (local38 >= local13.length) {
			return;
		}
		Static596.method7721(local13, local38 + 1, local13, local38, local13.length - local38 - 1);
		local13[local13.length - 1] = local3;
	}

	@OriginalMember(owner = "client!hj", name = "b", descriptor = "()V")
	public static void method3323() {
	}

	@OriginalMember(owner = "client!hj", name = "a", descriptor = "(Lclient!ad;I)V")
	private static void method3324(@OriginalArg(0) Class6_Sub1 arg0, @OriginalArg(1) int arg1) {
		@Pc(2) Object[] local2 = arg0.anObjectArray1;
		@Pc(8) int local8 = (Integer) local2[0];
		@Pc(12) Class6_Sub5_Sub16 local12 = Static503.method6958(local8);
		if (local12 == null) {
			return;
		}
		anIntArray322 = new int[local12.anInt9205];
		@Pc(21) int local21 = 0;
		aStringArray19 = new String[local12.anInt9206];
		@Pc(27) int local27 = 0;
		for (@Pc(29) int local29 = 1; local29 < local2.length; local29++) {
			if (local2[local29] instanceof Integer) {
				@Pc(41) int local41 = (Integer) local2[local29];
				if (local41 == -2147483647) {
					local41 = arg0.anInt92;
				}
				if (local41 == -2147483646) {
					local41 = arg0.anInt89;
				}
				if (local41 == -2147483645) {
					local41 = arg0.aClass97_2 == null ? -1 : arg0.aClass97_2.anInt2678;
				}
				if (local41 == -2147483644) {
					local41 = arg0.anInt88;
				}
				if (local41 == -2147483643) {
					local41 = arg0.aClass97_2 == null ? -1 : arg0.aClass97_2.anInt2675;
				}
				if (local41 == -2147483642) {
					local41 = arg0.aClass97_3 == null ? -1 : arg0.aClass97_3.anInt2678;
				}
				if (local41 == -2147483641) {
					local41 = arg0.aClass97_3 == null ? -1 : arg0.aClass97_3.anInt2675;
				}
				if (local41 == -2147483640) {
					local41 = arg0.anInt91;
				}
				if (local41 == -2147483639) {
					local41 = arg0.anInt86;
				}
				anIntArray322[local21++] = local41;
			} else if (local2[local29] instanceof String) {
				@Pc(135) String local135 = (String) local2[local29];
				if (local135.equals("event_opbase")) {
					local135 = arg0.aString1;
				}
				aStringArray19[local27++] = local135;
			}
		}
		anInt3838 = arg0.anInt85;
		method3325(local12, arg1);
	}

	@OriginalMember(owner = "client!hj", name = "a", descriptor = "(Lclient!uu;I)V")
	private static void method3325(@OriginalArg(0) Class6_Sub5_Sub16 arg0, @OriginalArg(1) int arg1) {
		anInt3825 = 0;
		anInt3833 = 0;
		@Pc(5) int local5 = -1;
		@Pc(8) int[] local8 = arg0.anIntArray651;
		@Pc(11) int[] local11 = arg0.anIntArray652;
		@Pc(13) byte local13 = -1;
		anInt3826 = 0;
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
						method3314(local31, local802);
					} else if (local31 >= 5000 && local31 < 10000) {
						method3319(local31, local802);
					} else {
						throw new IllegalStateException("Command: " + local31);
					}
				} else if (local31 == 0) {
					anIntArray323[anInt3825++] = local11[local5];
				} else {
					@Pc(54) int local54;
					if (local31 == 1) {
						local54 = local11[local5];
						anIntArray323[anInt3825++] = Static65.aClass51_1.anIntArray111[local54];
					} else if (local31 == 2) {
						local54 = local11[local5];
						Static65.aClass51_1.method967(local54, anIntArray323[--anInt3825]);
					} else if (local31 == 3) {
						aStringArray20[anInt3833++] = arg0.aStringArray38[local5];
					} else if (local31 == 6) {
						local5 += local11[local5];
					} else if (local31 == 7) {
						anInt3825 -= 2;
						if (anIntArray323[anInt3825] != anIntArray323[anInt3825 + 1]) {
							local5 += local11[local5];
						}
					} else if (local31 == 8) {
						anInt3825 -= 2;
						if (anIntArray323[anInt3825] == anIntArray323[anInt3825 + 1]) {
							local5 += local11[local5];
						}
					} else if (local31 == 9) {
						anInt3825 -= 2;
						if (anIntArray323[anInt3825] < anIntArray323[anInt3825 + 1]) {
							local5 += local11[local5];
						}
					} else if (local31 == 10) {
						anInt3825 -= 2;
						if (anIntArray323[anInt3825] > anIntArray323[anInt3825 + 1]) {
							local5 += local11[local5];
						}
					} else if (local31 == 21) {
						if (anInt3826 == 0) {
							return;
						}
						@Pc(216) Class112 local216 = aClass112Array1[--anInt3826];
						arg0 = local216.aClass6_Sub5_Sub16_1;
						local8 = arg0.anIntArray651;
						local11 = arg0.anIntArray652;
						local5 = local216.anInt2895;
						anIntArray322 = local216.anIntArray285;
						aStringArray19 = local216.aStringArray15;
					} else if (local31 == 25) {
						local54 = local11[local5];
						anIntArray323[anInt3825++] = Static65.aClass51_1.method958(local54);
					} else if (local31 == 27) {
						local54 = local11[local5];
						Static65.aClass51_1.method965(anIntArray323[--anInt3825], local54);
					} else if (local31 == 31) {
						anInt3825 -= 2;
						if (anIntArray323[anInt3825] <= anIntArray323[anInt3825 + 1]) {
							local5 += local11[local5];
						}
					} else if (local31 == 32) {
						anInt3825 -= 2;
						if (anIntArray323[anInt3825] >= anIntArray323[anInt3825 + 1]) {
							local5 += local11[local5];
						}
					} else if (local31 == 33) {
						anIntArray323[anInt3825++] = anIntArray322[local11[local5]];
					} else if (local31 == 34) {
						anIntArray322[local11[local5]] = anIntArray323[--anInt3825];
					} else if (local31 == 35) {
						aStringArray20[anInt3833++] = aStringArray19[local11[local5]];
					} else if (local31 == 36) {
						aStringArray19[local11[local5]] = aStringArray20[--anInt3833];
					} else if (local31 == 37) {
						local54 = local11[local5];
						anInt3833 -= local54;
						@Pc(400) String local400 = Static365.method5404(local54, anInt3833, aStringArray20);
						aStringArray20[anInt3833++] = local400;
					} else if (local31 == 38) {
						anInt3825--;
					} else if (local31 == 39) {
						anInt3833--;
					} else {
						@Pc(452) int local452;
						if (local31 == 40) {
							local54 = local11[local5];
							@Pc(436) Class6_Sub5_Sub16 local436 = Static503.method6958(local54);
							if (local436 == null) {
								throw new RuntimeException();
							}
							@Pc(446) int[] local446 = new int[local436.anInt9205];
							@Pc(450) String[] local450 = new String[local436.anInt9206];
							for (local452 = 0; local452 < local436.anInt9210; local452++) {
								local446[local452] = anIntArray323[anInt3825 + local452 - local436.anInt9210];
							}
							for (@Pc(471) int local471 = 0; local471 < local436.anInt9204; local471++) {
								local450[local471] = aStringArray20[anInt3833 + local471 - local436.anInt9204];
							}
							anInt3825 -= local436.anInt9210;
							anInt3833 -= local436.anInt9204;
							@Pc(502) Class112 local502 = new Class112();
							local502.aClass6_Sub5_Sub16_1 = arg0;
							local502.anInt2895 = local5;
							local502.anIntArray285 = anIntArray322;
							local502.aStringArray15 = aStringArray19;
							if (anInt3826 >= aClass112Array1.length) {
								throw new RuntimeException();
							}
							aClass112Array1[anInt3826++] = local502;
							arg0 = local436;
							local8 = local436.anIntArray651;
							local11 = local436.anIntArray652;
							local5 = -1;
							anIntArray322 = local446;
							aStringArray19 = local450;
						} else if (local31 == 42) {
							anIntArray323[anInt3825++] = Static2.anIntArray4[local11[local5]];
						} else if (local31 == 43) {
							local54 = local11[local5];
							Static2.anIntArray4[local54] = anIntArray323[--anInt3825];
							Static189.method3220(local54);
							Static492.aBoolean562 |= Static224.aBooleanArray14[local54];
						} else if (local31 == 44) {
							local54 = local11[local5] >> 16;
							local603 = local11[local5] & 0xFFFF;
							@Pc(611) int local611 = anIntArray323[--anInt3825];
							if (local611 >= 0 && local611 <= 5000) {
								anIntArray324[local54] = local611;
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
							local603 = anIntArray323[--anInt3825];
							if (local603 < 0 || local603 >= anIntArray324[local54]) {
								throw new RuntimeException();
							}
							anIntArray323[anInt3825++] = anIntArrayArray33[local54][local603];
						} else if (local31 == 46) {
							local54 = local11[local5];
							anInt3825 -= 2;
							local603 = anIntArray323[anInt3825];
							if (local603 < 0 || local603 >= anIntArray324[local54]) {
								throw new RuntimeException();
							}
							anIntArrayArray33[local54][local603] = anIntArray323[anInt3825 + 1];
						} else if (local31 == 47) {
							@Pc(730) String local730 = Static280.aStringArray24[local11[local5]];
							if (local730 == null) {
								local730 = "null";
							}
							aStringArray20[anInt3833++] = local730;
						} else if (local31 == 48) {
							local54 = local11[local5];
							Static280.aStringArray24[local54] = aStringArray20[--anInt3833];
							Static302.method4568(local54);
						} else if (local31 == 51) {
							@Pc(774) Class234 local774 = arg0.aClass234Array1[local11[local5]];
							@Pc(787) Class6_Sub14 local787 = (Class6_Sub14) local774.method5464((long) anIntArray323[--anInt3825]);
							if (local787 != null) {
								local5 += local787.anInt2188;
							}
						}
					}
				}
			}
		} catch (@Pc(837) Exception local837) {
			@Pc(856) StringBuffer local856;
			if (arg0.aString85 == null) {
				local856 = new StringBuffer(30);
				local856.append("CS2: ").append(arg0.aLong245).append(" ");
				for (local603 = anInt3826 - 1; local603 >= 0; local603--) {
					local856.append("v: ").append(aClass112Array1[local603].aClass6_Sub5_Sub16_1.aLong245).append(" ");
				}
				local856.append("op: ").append(local13);
				Static214.method5693(local856.toString(), local837);
			} else {
				Static141.method2337("Clientscript error in: " + arg0.aString85);
				local856 = new StringBuffer(30);
				local856.append("Clientscript error in: ").append(arg0.aString85).append("\n");
				for (local603 = anInt3826 - 1; local603 >= 0; local603--) {
					local856.append("via: ").append(aClass112Array1[local603].aClass6_Sub5_Sub16_1.aString85).append("\n");
				}
				local856.append("Op: ").append(local13).append("\n");
				@Pc(896) String local896 = local837.getMessage();
				if (local896 != null && local896.length() > 0) {
					local856.append("Message: ").append(local896).append("\n");
				}
				Static214.method5693(local856.toString(), local837);
				Static257.method5660(local856.toString());
			}
		}
	}

	@OriginalMember(owner = "client!hj", name = "c", descriptor = "(IZ)V")
	public static void method3326() {
	}

	@OriginalMember(owner = "client!hj", name = "d", descriptor = "(I)V")
	private static void method3327(@OriginalArg(0) int arg0) {
		@Pc(3) Class97 local3 = Static495.method7281(arg0);
		if (local3 == null) {
			return;
		}
		@Pc(9) int local9 = arg0 >>> 16;
		@Pc(13) Class97[] local13 = Static140.aClass97ArrayArray1[local9];
		if (local13 == null) {
			@Pc(19) Class97[] local19 = Static360.aClass97ArrayArray2[local9];
			@Pc(22) int local22 = local19.length;
			local13 = Static140.aClass97ArrayArray1[local9] = new Class97[local22];
			Static596.method7721(local19, 0, local13, 0, local19.length);
		}
		@Pc(38) int local38;
		for (local38 = 0; local38 < local13.length && local13[local38] != local3; local38++) {
		}
		if (local38 >= local13.length) {
			return;
		}
		Static596.method7721(local13, 0, local13, 1, local38);
		local13[0] = local3;
	}
}
