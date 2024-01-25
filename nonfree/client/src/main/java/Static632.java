import java.awt.datatransfer.DataFlavor;
import java.awt.datatransfer.Transferable;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static632 {

	@OriginalMember(owner = "client!vh", name = "d", descriptor = "Lclient!lc;")
	private static Class207 aClass207_1;

	@OriginalMember(owner = "client!vh", name = "f", descriptor = "[Ljava/lang/String;")
	private static String[] aStringArray43;

	@OriginalMember(owner = "client!vh", name = "h", descriptor = "[J")
	private static long[] aLongArray21;

	@OriginalMember(owner = "client!vh", name = "k", descriptor = "Lclient!mea;")
	private static Class230 aClass230_11;

	@OriginalMember(owner = "client!vh", name = "l", descriptor = "Lclient!mea;")
	private static Class230 aClass230_12;

	@OriginalMember(owner = "client!vh", name = "m", descriptor = "Lclient!hs;")
	private static Class14_Sub25 aClass14_Sub25_3;

	@OriginalMember(owner = "client!vh", name = "x", descriptor = "Lclient!mda;")
	private static Class229 aClass229_3;

	@OriginalMember(owner = "client!vh", name = "C", descriptor = "[I")
	private static int[] anIntArray786;

	@OriginalMember(owner = "client!vh", name = "b", descriptor = "Lclient!oo;")
	public static final Class264 aClass264_63 = new Class264(4);

	@OriginalMember(owner = "client!vh", name = "g", descriptor = "[I")
	private static final int[] anIntArray783 = new int[3];

	@OriginalMember(owner = "client!vh", name = "j", descriptor = "I")
	private static int anInt10591 = 0;

	@OriginalMember(owner = "client!vh", name = "o", descriptor = "I")
	private static int anInt10593 = 0;

	@OriginalMember(owner = "client!vh", name = "q", descriptor = "I")
	private static int anInt10595 = 0;

	@OriginalMember(owner = "client!vh", name = "t", descriptor = "[J")
	private static final long[] aLongArray22 = new long[1000];

	@OriginalMember(owner = "client!vh", name = "u", descriptor = "[Ljava/lang/String;")
	private static final String[] aStringArray44 = new String[1000];

	@OriginalMember(owner = "client!vh", name = "v", descriptor = "[I")
	private static final int[] anIntArray784 = new int[5];

	@OriginalMember(owner = "client!vh", name = "w", descriptor = "I")
	private static int anInt10598 = 0;

	@OriginalMember(owner = "client!vh", name = "A", descriptor = "[Lclient!sj;")
	private static final Class321[] aClass321Array1 = new Class321[50];

	@OriginalMember(owner = "client!vh", name = "B", descriptor = "[I")
	private static final int[] anIntArray785 = new int[1000];

	@OriginalMember(owner = "client!vh", name = "E", descriptor = "[[I")
	private static final int[][] anIntArrayArray60 = new int[5][5000];

	@OriginalMember(owner = "client!vh", name = "F", descriptor = "I")
	private static int anInt10602 = 0;

	@OriginalMember(owner = "client!vh", name = "a", descriptor = "(Ljava/lang/String;I)V")
	private static void method8825(@OriginalArg(0) String arg0, @OriginalArg(1) int arg1) {
		if (Static447.anInt10238 == 0 && (Static13.aBoolean12 && !Static47.aBoolean97 || Static154.aBoolean234)) {
			return;
		}
		@Pc(11) String local11 = arg0.toLowerCase();
		@Pc(13) byte local13 = 0;
		if (local11.startsWith(Static514.aClass303_49.method7473(0))) {
			local13 = 0;
			arg0 = arg0.substring(Static514.aClass303_49.method7473(0).length());
		} else if (local11.startsWith(Static514.aClass303_50.method7473(0))) {
			local13 = 1;
			arg0 = arg0.substring(Static514.aClass303_50.method7473(0).length());
		} else if (local11.startsWith(Static514.aClass303_51.method7473(0))) {
			local13 = 2;
			arg0 = arg0.substring(Static514.aClass303_51.method7473(0).length());
		} else if (local11.startsWith(Static514.aClass303_52.method7473(0))) {
			local13 = 3;
			arg0 = arg0.substring(Static514.aClass303_52.method7473(0).length());
		} else if (local11.startsWith(Static514.aClass303_53.method7473(0))) {
			local13 = 4;
			arg0 = arg0.substring(Static514.aClass303_53.method7473(0).length());
		} else if (local11.startsWith(Static514.aClass303_54.method7473(0))) {
			local13 = 5;
			arg0 = arg0.substring(Static514.aClass303_54.method7473(0).length());
		} else if (local11.startsWith(Static514.aClass303_55.method7473(0))) {
			local13 = 6;
			arg0 = arg0.substring(Static514.aClass303_55.method7473(0).length());
		} else if (local11.startsWith(Static514.aClass303_56.method7473(0))) {
			local13 = 7;
			arg0 = arg0.substring(Static514.aClass303_56.method7473(0).length());
		} else if (local11.startsWith(Static514.aClass303_57.method7473(0))) {
			local13 = 8;
			arg0 = arg0.substring(Static514.aClass303_57.method7473(0).length());
		} else if (local11.startsWith(Static514.aClass303_58.method7473(0))) {
			local13 = 9;
			arg0 = arg0.substring(Static514.aClass303_58.method7473(0).length());
		} else if (local11.startsWith(Static514.aClass303_59.method7473(0))) {
			local13 = 10;
			arg0 = arg0.substring(Static514.aClass303_59.method7473(0).length());
		} else if (local11.startsWith(Static514.aClass303_60.method7473(0))) {
			local13 = 11;
			arg0 = arg0.substring(Static514.aClass303_60.method7473(0).length());
		} else if (Static232.anInt4258 != 0) {
			if (local11.startsWith(Static514.aClass303_49.method7473(Static232.anInt4258))) {
				local13 = 0;
				arg0 = arg0.substring(Static514.aClass303_49.method7473(Static232.anInt4258).length());
			} else if (local11.startsWith(Static514.aClass303_50.method7473(Static232.anInt4258))) {
				local13 = 1;
				arg0 = arg0.substring(Static514.aClass303_50.method7473(Static232.anInt4258).length());
			} else if (local11.startsWith(Static514.aClass303_51.method7473(Static232.anInt4258))) {
				local13 = 2;
				arg0 = arg0.substring(Static514.aClass303_51.method7473(Static232.anInt4258).length());
			} else if (local11.startsWith(Static514.aClass303_52.method7473(Static232.anInt4258))) {
				local13 = 3;
				arg0 = arg0.substring(Static514.aClass303_52.method7473(Static232.anInt4258).length());
			} else if (local11.startsWith(Static514.aClass303_53.method7473(Static232.anInt4258))) {
				local13 = 4;
				arg0 = arg0.substring(Static514.aClass303_53.method7473(Static232.anInt4258).length());
			} else if (local11.startsWith(Static514.aClass303_54.method7473(Static232.anInt4258))) {
				local13 = 5;
				arg0 = arg0.substring(Static514.aClass303_54.method7473(Static232.anInt4258).length());
			} else if (local11.startsWith(Static514.aClass303_55.method7473(Static232.anInt4258))) {
				local13 = 6;
				arg0 = arg0.substring(Static514.aClass303_55.method7473(Static232.anInt4258).length());
			} else if (local11.startsWith(Static514.aClass303_56.method7473(Static232.anInt4258))) {
				local13 = 7;
				arg0 = arg0.substring(Static514.aClass303_56.method7473(Static232.anInt4258).length());
			} else if (local11.startsWith(Static514.aClass303_57.method7473(Static232.anInt4258))) {
				local13 = 8;
				arg0 = arg0.substring(Static514.aClass303_57.method7473(Static232.anInt4258).length());
			} else if (local11.startsWith(Static514.aClass303_58.method7473(Static232.anInt4258))) {
				local13 = 9;
				arg0 = arg0.substring(Static514.aClass303_58.method7473(Static232.anInt4258).length());
			} else if (local11.startsWith(Static514.aClass303_59.method7473(Static232.anInt4258))) {
				local13 = 10;
				arg0 = arg0.substring(Static514.aClass303_59.method7473(Static232.anInt4258).length());
			} else if (local11.startsWith(Static514.aClass303_60.method7473(Static232.anInt4258))) {
				local13 = 11;
				arg0 = arg0.substring(Static514.aClass303_60.method7473(Static232.anInt4258).length());
			}
		}
		local11 = arg0.toLowerCase();
		@Pc(451) byte local451 = 0;
		if (local11.startsWith(Class303.lb.method7473(0))) {
			local451 = 1;
			arg0 = arg0.substring(Class303.lb.method7473(0).length());
		} else if (local11.startsWith(Static514.aClass303_61.method7473(0))) {
			local451 = 2;
			arg0 = arg0.substring(Static514.aClass303_61.method7473(0).length());
		} else if (local11.startsWith(Static514.aClass303_62.method7473(0))) {
			local451 = 3;
			arg0 = arg0.substring(Static514.aClass303_62.method7473(0).length());
		} else if (local11.startsWith(Static514.aClass303_63.method7473(0))) {
			local451 = 4;
			arg0 = arg0.substring(Static514.aClass303_63.method7473(0).length());
		} else if (local11.startsWith(Static514.aClass303_64.method7473(0))) {
			local451 = 5;
			arg0 = arg0.substring(Static514.aClass303_64.method7473(0).length());
		} else if (Static232.anInt4258 != 0) {
			if (local11.startsWith(Class303.lb.method7473(Static232.anInt4258))) {
				local451 = 1;
				arg0 = arg0.substring(Class303.lb.method7473(Static232.anInt4258).length());
			} else if (local11.startsWith(Static514.aClass303_61.method7473(Static232.anInt4258))) {
				local451 = 2;
				arg0 = arg0.substring(Static514.aClass303_61.method7473(Static232.anInt4258).length());
			} else if (local11.startsWith(Static514.aClass303_62.method7473(Static232.anInt4258))) {
				local451 = 3;
				arg0 = arg0.substring(Static514.aClass303_62.method7473(Static232.anInt4258).length());
			} else if (local11.startsWith(Static514.aClass303_63.method7473(Static232.anInt4258))) {
				local451 = 4;
				arg0 = arg0.substring(Static514.aClass303_63.method7473(Static232.anInt4258).length());
			} else if (local11.startsWith(Static514.aClass303_64.method7473(Static232.anInt4258))) {
				local451 = 5;
				arg0 = arg0.substring(Static514.aClass303_64.method7473(Static232.anInt4258).length());
			}
		}
		@Pc(641) Class14_Sub19 local641 = Static286.method4081(Static205.aClass394_1, Static657.aClass100_142);
		local641.aClass14_Sub29_Sub1_1.method5854(0);
		@Pc(650) int local650 = local641.aClass14_Sub29_Sub1_1.anInt7264;
		local641.aClass14_Sub29_Sub1_1.method5854(local13);
		local641.aClass14_Sub29_Sub1_1.method5854(local451);
		Static40.method1450(arg0, local641.aClass14_Sub29_Sub1_1);
		local641.aClass14_Sub29_Sub1_1.method5853(local641.aClass14_Sub29_Sub1_1.anInt7264 - local650);
		Static576.method8234(local641);
	}

	@OriginalMember(owner = "client!vh", name = "a", descriptor = "(IZ)V")
	private static void method8827(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1) {
		@Pc(137) Class230 local137;
		@Pc(25) int local25;
		@Pc(56) int local56;
		@Pc(19) int local19;
		@Pc(35) Class230 local35;
		@Pc(158) Class230 local158;
		@Pc(210) Class230 local210;
		@Pc(13) int local13;
		if (arg0 < 300) {
			if (arg0 == 150) {
				anInt10593 -= 3;
				local13 = anIntArray785[anInt10593];
				local19 = anIntArray785[anInt10593 + 1];
				local25 = anIntArray785[anInt10593 + 2];
				if (local19 == 0) {
					throw new RuntimeException();
				}
				local35 = Static655.method9094(local13);
				if (local35.aClass230Array2 == null) {
					local35.aClass230Array2 = new Class230[local25 + 1];
				}
				if (local35.aClass230Array2.length <= local25) {
					@Pc(54) Class230[] local54 = new Class230[local25 + 1];
					for (local56 = 0; local56 < local35.aClass230Array2.length; local56++) {
						local54[local56] = local35.aClass230Array2[local56];
					}
					local35.aClass230Array2 = local54;
				}
				if (local25 > 0 && local35.aClass230Array2[local25 - 1] == null) {
					throw new RuntimeException("Gap at:" + (local25 - 1));
				}
				@Pc(99) Class230 local99 = new Class230();
				local99.anInt6660 = local19;
				local99.anInt6668 = local99.anInt6663 = local35.anInt6663;
				local99.anInt6679 = local25;
				local35.aClass230Array2[local25] = local99;
				if (arg1) {
					aClass230_12 = local99;
				} else {
					aClass230_11 = local99;
				}
				Static634.method8860(local35);
				return;
			}
			if (arg0 == 151) {
				local137 = arg1 ? aClass230_12 : aClass230_11;
				if (local137.anInt6679 == -1) {
					if (arg1) {
						throw new RuntimeException("Tried to .cc_delete static .active-component!");
					}
					throw new RuntimeException("Tried to cc_delete static active-component!");
				}
				local158 = Static655.method9094(local137.anInt6663);
				local158.aClass230Array2[local137.anInt6679] = null;
				Static634.method8860(local158);
				return;
			}
			if (arg0 == 152) {
				local137 = Static655.method9094(anIntArray785[--anInt10593]);
				local137.aClass230Array2 = null;
				Static634.method8860(local137);
				return;
			}
			if (arg0 == 200) {
				anInt10593 -= 2;
				local13 = anIntArray785[anInt10593];
				local19 = anIntArray785[anInt10593 + 1];
				local210 = Static572.method8204(local19, local13);
				if (local210 != null && local19 != -1) {
					anIntArray785[anInt10593++] = 1;
					if (arg1) {
						aClass230_12 = local210;
						return;
					}
					aClass230_11 = local210;
					return;
				}
				anIntArray785[anInt10593++] = 0;
				return;
			}
			if (arg0 == 201) {
				local13 = anIntArray785[--anInt10593];
				local158 = Static655.method9094(local13);
				if (local158 != null) {
					anIntArray785[anInt10593++] = 1;
					if (arg1) {
						aClass230_12 = local158;
						return;
					}
					aClass230_11 = local158;
					return;
				}
				anIntArray785[anInt10593++] = 0;
				return;
			}
			if (arg0 == 202) {
				local13 = anIntArray785[--anInt10593];
				method8842(local13);
				return;
			}
			if (arg0 == 203) {
				local13 = anIntArray785[--anInt10593];
				method8832(local13);
				return;
			}
		} else {
			@Pc(357) int local357;
			@Pc(420) boolean local420;
			if (arg0 < 500) {
				if (arg0 == 403) {
					anInt10593 -= 2;
					local13 = anIntArray785[anInt10593];
					local19 = anIntArray785[anInt10593 + 1];
					if (Static657.aClass12_Sub2_Sub2_Sub1_Sub2_2.aClass325_1 == null) {
						return;
					}
					for (local25 = 0; local25 < Static329.anIntArray451.length; local25++) {
						if (Static329.anIntArray451[local25] == local13) {
							Static657.aClass12_Sub2_Sub2_Sub1_Sub2_2.aClass325_1.method7788(Static372.aClass154_2, local25, local19);
							return;
						}
					}
					for (local357 = 0; local357 < Static12.anIntArray10.length; local357++) {
						if (Static12.anIntArray10[local357] == local13) {
							Static657.aClass12_Sub2_Sub2_Sub1_Sub2_2.aClass325_1.method7788(Static372.aClass154_2, local357, local19);
							return;
						}
					}
					return;
				}
				if (arg0 == 404) {
					anInt10593 -= 2;
					local13 = anIntArray785[anInt10593];
					local19 = anIntArray785[anInt10593 + 1];
					if (Static657.aClass12_Sub2_Sub2_Sub1_Sub2_2.aClass325_1 == null) {
						return;
					}
					Static657.aClass12_Sub2_Sub2_Sub1_Sub2_2.aClass325_1.method7780(local13, local19);
					return;
				}
				if (arg0 == 410) {
					local420 = anIntArray785[--anInt10593] != 0;
					if (Static657.aClass12_Sub2_Sub2_Sub1_Sub2_2.aClass325_1 == null) {
						return;
					}
					Static657.aClass12_Sub2_Sub2_Sub1_Sub2_2.aClass325_1.method7790(local420);
					return;
				}
				if (arg0 == 411) {
					anInt10593 -= 2;
					local13 = anIntArray785[anInt10593];
					local19 = anIntArray785[anInt10593 + 1];
					if (Static657.aClass12_Sub2_Sub2_Sub1_Sub2_2.aClass325_1 == null) {
						return;
					}
					Static657.aClass12_Sub2_Sub2_Sub1_Sub2_2.aClass325_1.method7785(local13, Static175.aClass247_2, local19);
					return;
				}
			} else if ((arg0 < 1000 || arg0 >= 1100) && (arg0 < 2000 || arg0 >= 2100)) {
				@Pc(1523) String local1523;
				@Pc(1161) String local1161;
				if (arg0 >= 1100 && arg0 < 1200 || arg0 >= 2100 && arg0 < 2200) {
					if (arg0 >= 2000) {
						arg0 -= 1000;
						local137 = Static655.method9094(anIntArray785[--anInt10593]);
					} else {
						local137 = arg1 ? aClass230_12 : aClass230_11;
					}
					if (arg0 == 1100) {
						anInt10593 -= 2;
						local137.anInt6705 = anIntArray785[anInt10593];
						if (local137.anInt6705 > local137.anInt6711 - local137.anInt6703) {
							local137.anInt6705 = local137.anInt6711 - local137.anInt6703;
						}
						if (local137.anInt6705 < 0) {
							local137.anInt6705 = 0;
						}
						local137.anInt6641 = anIntArray785[anInt10593 + 1];
						if (local137.anInt6641 > local137.anInt6638 - local137.anInt6701) {
							local137.anInt6641 = local137.anInt6638 - local137.anInt6701;
						}
						if (local137.anInt6641 < 0) {
							local137.anInt6641 = 0;
						}
						Static634.method8860(local137);
						if (local137.anInt6679 == -1) {
							Static384.method5712(local137.anInt6663);
						}
						return;
					}
					if (arg0 == 1101) {
						local137.anInt6713 = anIntArray785[--anInt10593];
						Static634.method8860(local137);
						if (local137.anInt6679 == -1) {
							Static218.method3410(local137.anInt6663);
						}
						return;
					}
					if (arg0 == 1102) {
						local137.aBoolean484 = anIntArray785[--anInt10593] == 1;
						Static634.method8860(local137);
						return;
					}
					if (arg0 == 1103) {
						local137.anInt6715 = anIntArray785[--anInt10593];
						Static634.method8860(local137);
						return;
					}
					if (arg0 == 1104) {
						local137.anInt6650 = anIntArray785[--anInt10593];
						Static634.method8860(local137);
						return;
					}
					if (arg0 == 1105) {
						local19 = anIntArray785[--anInt10593];
						if (local137.anInt6688 != local19) {
							local137.anInt6688 = local19;
							Static634.method8860(local137);
						}
						if (local137.anInt6679 == -1) {
							Static2.method23(local137.anInt6663);
						}
						return;
					}
					if (arg0 == 1106) {
						local137.anInt6661 = anIntArray785[--anInt10593];
						Static634.method8860(local137);
						return;
					}
					if (arg0 == 1107) {
						local137.aBoolean481 = anIntArray785[--anInt10593] == 1;
						Static634.method8860(local137);
						return;
					}
					if (arg0 == 1108) {
						local137.anInt6680 = 1;
						local137.anInt6674 = anIntArray785[--anInt10593];
						Static634.method8860(local137);
						if (local137.anInt6679 == -1) {
							Static91.method1716(local137.anInt6663);
						}
						return;
					}
					if (arg0 == 1109) {
						anInt10593 -= 6;
						local137.anInt6695 = anIntArray785[anInt10593];
						local137.anInt6655 = anIntArray785[anInt10593 + 1];
						local137.anInt6640 = anIntArray785[anInt10593 + 2];
						local137.anInt6685 = anIntArray785[anInt10593 + 3];
						local137.anInt6659 = anIntArray785[anInt10593 + 4];
						local137.anInt6710 = anIntArray785[anInt10593 + 5];
						Static634.method8860(local137);
						if (local137.anInt6679 == -1) {
							Static353.method5355(local137.anInt6663);
							Static323.method5091(local137.anInt6663);
						}
						return;
					}
					if (arg0 == 1110) {
						local19 = anIntArray785[--anInt10593];
						if (local137.anInt6637 != local19) {
							local137.anInt6637 = local19;
							local137.anInt6728 = 0;
							local137.anInt6666 = 1;
							local137.anInt6723 = 0;
							@Pc(1110) Class275 local1110 = local137.anInt6637 == -1 ? null : Static501.aClass191_2.method4322(local137.anInt6637);
							if (local1110 != null) {
								Static493.method7314(local1110, local137.anInt6728);
							}
							Static634.method8860(local137);
						}
						if (local137.anInt6679 == -1) {
							Static72.method1370(local137.anInt6663);
						}
						return;
					}
					if (arg0 == 1111) {
						local137.aBoolean469 = anIntArray785[--anInt10593] == 1;
						Static634.method8860(local137);
						return;
					}
					if (arg0 == 1112) {
						local1161 = aStringArray44[--anInt10591];
						if (!local1161.equals(local137.aString72)) {
							local137.aString72 = local1161;
							Static634.method8860(local137);
						}
						if (local137.anInt6679 == -1) {
							Static63.method1260(local137.anInt6663);
						}
						return;
					}
					if (arg0 == 1113) {
						local137.anInt6690 = anIntArray785[--anInt10593];
						Static634.method8860(local137);
						if (local137.anInt6679 == -1) {
							Static55.method1184(local137.anInt6663);
						}
						return;
					}
					if (arg0 == 1114) {
						anInt10593 -= 3;
						local137.anInt6672 = anIntArray785[anInt10593];
						local137.anInt6665 = anIntArray785[anInt10593 + 1];
						local137.anInt6651 = anIntArray785[anInt10593 + 2];
						Static634.method8860(local137);
						return;
					}
					if (arg0 == 1115) {
						local137.aBoolean472 = anIntArray785[--anInt10593] == 1;
						Static634.method8860(local137);
						return;
					}
					if (arg0 == 1116) {
						local137.anInt6712 = anIntArray785[--anInt10593];
						Static634.method8860(local137);
						return;
					}
					if (arg0 == 1117) {
						local137.anInt6698 = anIntArray785[--anInt10593];
						Static634.method8860(local137);
						return;
					}
					if (arg0 == 1118) {
						local137.aBoolean474 = anIntArray785[--anInt10593] == 1;
						Static634.method8860(local137);
						return;
					}
					if (arg0 == 1119) {
						local137.aBoolean468 = anIntArray785[--anInt10593] == 1;
						Static634.method8860(local137);
						return;
					}
					if (arg0 == 1120) {
						anInt10593 -= 2;
						local137.anInt6711 = anIntArray785[anInt10593];
						local137.anInt6638 = anIntArray785[anInt10593 + 1];
						Static634.method8860(local137);
						if (local137.anInt6660 == 0) {
							Static163.method2629(local137, false);
						}
						return;
					}
					if (arg0 == 1122) {
						local137.aBoolean478 = anIntArray785[--anInt10593] == 1;
						Static634.method8860(local137);
						return;
					}
					if (arg0 == 1123) {
						local137.anInt6710 = anIntArray785[--anInt10593];
						Static634.method8860(local137);
						if (local137.anInt6679 == -1) {
							Static353.method5355(local137.anInt6663);
						}
						return;
					}
					if (arg0 == 1124) {
						local19 = anIntArray785[--anInt10593];
						local137.aBoolean470 = local19 == 1;
						Static634.method8860(local137);
						return;
					}
					if (arg0 == 1125) {
						anInt10593 -= 2;
						local137.anInt6652 = anIntArray785[anInt10593];
						local137.anInt6657 = anIntArray785[anInt10593 + 1];
						Static634.method8860(local137);
						return;
					}
					if (arg0 == 1126) {
						local137.anInt6681 = anIntArray785[--anInt10593];
						Static634.method8860(local137);
						return;
					}
					@Pc(1489) Class341 local1489;
					if (arg0 == 1127) {
						anInt10593 -= 2;
						local19 = anIntArray785[anInt10593];
						local25 = anIntArray785[anInt10593 + 1];
						local1489 = Static217.aClass90_1.method2122(local19);
						if (local25 != local1489.anInt9931) {
							local137.method5468(local19, local25);
							return;
						}
						local137.method5454(local19);
						return;
					}
					if (arg0 == 1128) {
						local19 = anIntArray785[--anInt10593];
						local1523 = aStringArray44[--anInt10591];
						local1489 = Static217.aClass90_1.method2122(local19);
						if (!local1489.aString107.equals(local1523)) {
							local137.method5455(local19, local1523);
							return;
						}
						local137.method5454(local19);
						return;
					}
					if (arg0 == 1129 || arg0 == 1130) {
						local19 = anIntArray785[--anInt10593];
						if (local137.anInt6660 != 5 && arg0 == 1129 || local137.anInt6660 != 4 && arg0 == 1130) {
							return;
						}
						if (local137.anInt6671 != local19) {
							local137.anInt6671 = local19;
							Static634.method8860(local137);
						}
						if (local137.anInt6679 == -1) {
							Static113.method1945(local137.anInt6663);
						}
						return;
					}
					@Pc(1617) short local1617;
					@Pc(1610) short local1610;
					if (arg0 == 1131) {
						anInt10593 -= 3;
						local19 = anIntArray785[anInt10593];
						local1610 = (short) anIntArray785[anInt10593 + 1];
						local1617 = (short) anIntArray785[anInt10593 + 2];
						if (local19 >= 0 && local19 < 5) {
							local137.method5471(local1617, local1610, local19);
							Static634.method8860(local137);
							if (local137.anInt6679 == -1) {
								Static432.method6334(local19, local137.anInt6663);
							}
							return;
						}
						return;
					}
					if (arg0 == 1132) {
						anInt10593 -= 3;
						local19 = anIntArray785[anInt10593];
						local1610 = (short) anIntArray785[anInt10593 + 1];
						local1617 = (short) anIntArray785[anInt10593 + 2];
						if (local19 >= 0 && local19 < 5) {
							local137.method5470(local1617, local1610, local19);
							Static634.method8860(local137);
							if (local137.anInt6679 == -1) {
								Static244.method3633(local19, local137.anInt6663);
							}
							return;
						}
						return;
					}
				} else if (arg0 >= 1200 && arg0 < 1300 || arg0 >= 2200 && arg0 < 2300) {
					if (arg0 >= 2000) {
						arg0 -= 1000;
						local137 = Static655.method9094(anIntArray785[--anInt10593]);
					} else {
						local137 = arg1 ? aClass230_12 : aClass230_11;
					}
					Static634.method8860(local137);
					if (arg0 == 1200 || arg0 == 1205 || arg0 == 1208 || arg0 == 1209 || arg0 == 1212 || arg0 == 1213) {
						anInt10593 -= 2;
						local19 = anIntArray785[anInt10593];
						local25 = anIntArray785[anInt10593 + 1];
						if (local137.anInt6679 == -1) {
							Static607.method3357(local137.anInt6663);
							Static353.method5355(local137.anInt6663);
							Static323.method5091(local137.anInt6663);
						}
						if (local19 == -1) {
							local137.anInt6680 = 1;
							local137.anInt6674 = -1;
							local137.anInt6646 = -1;
							return;
						}
						local137.anInt6646 = local19;
						local137.anInt6692 = local25;
						if (arg0 == 1208 || arg0 == 1209) {
							local137.aBoolean471 = true;
						} else {
							local137.aBoolean471 = false;
						}
						@Pc(1813) Class27 local1813 = Static175.aClass247_2.method5962(local19);
						local137.anInt6640 = local1813.anInt961;
						local137.anInt6685 = local1813.anInt948;
						local137.anInt6659 = local1813.anInt930;
						local137.anInt6695 = local1813.anInt939;
						local137.anInt6655 = local1813.anInt911;
						local137.anInt6710 = local1813.anInt935;
						if (arg0 == 1205 || arg0 == 1209) {
							local137.anInt6721 = 0;
						} else if (arg0 == 1212 || arg0 == 1213) {
							local137.anInt6721 = 1;
						} else {
							local137.anInt6721 = 2;
						}
						if (local137.anInt6677 > 0) {
							local137.anInt6710 = local137.anInt6710 * 32 / local137.anInt6677;
							return;
						}
						if (local137.anInt6656 > 0) {
							local137.anInt6710 = local137.anInt6710 * 32 / local137.anInt6656;
						}
						return;
					}
					if (arg0 == 1201) {
						local137.anInt6680 = 2;
						local137.anInt6674 = anIntArray785[--anInt10593];
						if (local137.anInt6679 == -1) {
							Static91.method1716(local137.anInt6663);
						}
						return;
					}
					if (arg0 == 1202) {
						local137.anInt6680 = 3;
						local137.anInt6674 = -1;
						if (local137.anInt6679 == -1) {
							Static91.method1716(local137.anInt6663);
						}
						return;
					}
					if (arg0 == 1203) {
						local137.anInt6680 = 6;
						local137.anInt6674 = anIntArray785[--anInt10593];
						if (local137.anInt6679 == -1) {
							Static91.method1716(local137.anInt6663);
						}
						return;
					}
					if (arg0 == 1204) {
						local137.anInt6680 = 5;
						local137.anInt6674 = anIntArray785[--anInt10593];
						if (local137.anInt6679 == -1) {
							Static91.method1716(local137.anInt6663);
						}
						return;
					}
					if (arg0 == 1206) {
						anInt10593 -= 4;
						local137.anInt6719 = anIntArray785[anInt10593];
						local137.anInt6726 = anIntArray785[anInt10593 + 1];
						local137.anInt6689 = anIntArray785[anInt10593 + 2];
						local137.anInt6731 = anIntArray785[anInt10593 + 3];
						Static634.method8860(local137);
						return;
					}
					if (arg0 == 1207) {
						anInt10593 -= 2;
						local137.anInt6639 = anIntArray785[anInt10593];
						local137.anInt6644 = anIntArray785[anInt10593 + 1];
						Static634.method8860(local137);
						return;
					}
					if (arg0 == 1210) {
						anInt10593 -= 4;
						local137.anInt6674 = anIntArray785[anInt10593];
						local137.anInt6648 = anIntArray785[anInt10593 + 1];
						if (anIntArray785[anInt10593 + 2] == 1) {
							local137.anInt6680 = 9;
						} else {
							local137.anInt6680 = 8;
						}
						if (anIntArray785[anInt10593 + 3] == 1) {
							local137.aBoolean471 = true;
						} else {
							local137.aBoolean471 = false;
						}
						if (local137.anInt6679 == -1) {
							Static91.method1716(local137.anInt6663);
						}
						return;
					}
					if (arg0 == 1211) {
						local137.anInt6680 = 5;
						local137.anInt6674 = Static568.anInt9800;
						local137.anInt6648 = 0;
						if (local137.anInt6679 == -1) {
							Static91.method1716(local137.anInt6663);
						}
						return;
					}
				} else {
					@Pc(2473) int local2473;
					if ((arg0 < 1300 || arg0 >= 1400) && (arg0 < 2300 || arg0 >= 2400)) {
						if (arg0 >= 1400 && arg0 < 1500 || arg0 >= 2400 && arg0 < 2500) {
							if (arg0 >= 2000) {
								arg0 -= 1000;
								local137 = Static655.method9094(anIntArray785[--anInt10593]);
							} else {
								local137 = arg1 ? aClass230_12 : aClass230_11;
							}
							if (arg0 == 1499) {
								local137.method5458();
								return;
							}
							local1161 = aStringArray44[--anInt10591];
							@Pc(2559) int[] local2559 = null;
							if (local1161.length() > 0 && local1161.charAt(local1161.length() - 1) == 'Y') {
								local357 = anIntArray785[--anInt10593];
								if (local357 > 0) {
									local2559 = new int[local357];
									while (local357-- > 0) {
										local2559[local357] = anIntArray785[--anInt10593];
									}
								}
								local1161 = local1161.substring(0, local1161.length() - 1);
							}
							@Pc(2611) Object[] local2611 = new Object[local1161.length() + 1];
							for (local2473 = local2611.length - 1; local2473 >= 1; local2473--) {
								if (local1161.charAt(local2473 - 1) == 's') {
									local2611[local2473] = aStringArray44[--anInt10591];
								} else if (local1161.charAt(local2473 - 1) == '§') {
									local2611[local2473] = Long.valueOf(aLongArray22[--anInt10595]);
								} else {
									local2611[local2473] = Integer.valueOf(anIntArray785[--anInt10593]);
								}
							}
							local56 = anIntArray785[--anInt10593];
							if (local56 == -1) {
								local2611 = null;
							} else {
								local2611[0] = Integer.valueOf(local56);
							}
							if (arg0 == 1400) {
								local137.anObjectArray21 = local2611;
							} else if (arg0 == 1401) {
								local137.anObjectArray6 = local2611;
							} else if (arg0 == 1402) {
								local137.anObjectArray32 = local2611;
							} else if (arg0 == 1403) {
								local137.anObjectArray17 = local2611;
							} else if (arg0 == 1404) {
								local137.anObjectArray15 = local2611;
							} else if (arg0 == 1405) {
								local137.anObjectArray22 = local2611;
							} else if (arg0 == 1406) {
								local137.lb = local2611;
							} else if (arg0 == 1407) {
								local137.anObjectArray11 = local2611;
								local137.anIntArray479 = local2559;
							} else if (arg0 == 1408) {
								local137.anObjectArray13 = local2611;
							} else if (arg0 == 1409) {
								local137.anObjectArray26 = local2611;
							} else if (arg0 == 1410) {
								local137.anObjectArray18 = local2611;
							} else if (arg0 == 1411) {
								local137.anObjectArray29 = local2611;
							} else if (arg0 == 1412) {
								local137.anObjectArray3 = local2611;
							} else if (arg0 == 1414) {
								local137.anObjectArray12 = local2611;
								local137.anIntArray484 = local2559;
							} else if (arg0 == 1415) {
								local137.anObjectArray10 = local2611;
								local137.anIntArray482 = local2559;
							} else if (arg0 == 1416) {
								local137.anObjectArray28 = local2611;
							} else if (arg0 == 1417) {
								local137.anObjectArray9 = local2611;
							} else if (arg0 == 1418) {
								local137.anObjectArray14 = local2611;
							} else if (arg0 == 1419) {
								local137.anObjectArray23 = local2611;
							} else if (arg0 == 1420) {
								local137.anObjectArray1 = local2611;
							} else if (arg0 == 1421) {
								local137.anObjectArray7 = local2611;
							} else if (arg0 == 1422) {
								local137.anObjectArray2 = local2611;
							} else if (arg0 == 1423) {
								local137.anObjectArray8 = local2611;
							} else if (arg0 == 1424) {
								local137.anObjectArray31 = local2611;
							} else if (arg0 == 1425) {
								local137.anObjectArray30 = local2611;
							} else if (arg0 == 1426) {
								local137.anObjectArray20 = local2611;
							} else if (arg0 == 1427) {
								local137.anObjectArray4 = local2611;
							} else if (arg0 == 1428) {
								local137.anObjectArray27 = local2611;
								local137.anIntArray485 = local2559;
							} else if (arg0 == 1429) {
								local137.anObjectArray5 = local2611;
								local137.anIntArray480 = local2559;
							} else if (arg0 == 1430) {
								local137.anObjectArray24 = local2611;
							} else if (arg0 == 1431) {
								local137.anObjectArray25 = local2611;
							} else if (arg0 == 1432) {
								local137.anObjectArray16 = local2611;
							}
							local137.aBoolean479 = true;
							return;
						}
						if (arg0 < 1600) {
							local137 = arg1 ? aClass230_12 : aClass230_11;
							if (arg0 == 1500) {
								anIntArray785[anInt10593++] = local137.anInt6725;
								return;
							}
							if (arg0 == 1501) {
								anIntArray785[anInt10593++] = local137.anInt6676;
								return;
							}
							if (arg0 == 1502) {
								anIntArray785[anInt10593++] = local137.anInt6703;
								return;
							}
							if (arg0 == 1503) {
								anIntArray785[anInt10593++] = local137.anInt6701;
								return;
							}
							if (arg0 == 1504) {
								anIntArray785[anInt10593++] = local137.aBoolean475 ? 1 : 0;
								return;
							}
							if (arg0 == 1505) {
								anIntArray785[anInt10593++] = local137.anInt6668;
								return;
							}
							if (arg0 == 1506) {
								local158 = Static252.method3712(local137);
								anIntArray785[anInt10593++] = local158 == null ? -1 : local158.anInt6663;
								return;
							}
						} else {
							@Pc(3242) Class341 local3242;
							if (arg0 < 1700) {
								local137 = arg1 ? aClass230_12 : aClass230_11;
								if (arg0 == 1600) {
									anIntArray785[anInt10593++] = local137.anInt6705;
									return;
								}
								if (arg0 == 1601) {
									anIntArray785[anInt10593++] = local137.anInt6641;
									return;
								}
								if (arg0 == 1602) {
									aStringArray44[anInt10591++] = local137.aString72;
									return;
								}
								if (arg0 == 1603) {
									anIntArray785[anInt10593++] = local137.anInt6711;
									return;
								}
								if (arg0 == 1604) {
									anIntArray785[anInt10593++] = local137.anInt6638;
									return;
								}
								if (arg0 == 1605) {
									anIntArray785[anInt10593++] = local137.anInt6710;
									return;
								}
								if (arg0 == 1606) {
									anIntArray785[anInt10593++] = local137.anInt6640;
									return;
								}
								if (arg0 == 1607) {
									anIntArray785[anInt10593++] = local137.anInt6659;
									return;
								}
								if (arg0 == 1608) {
									anIntArray785[anInt10593++] = local137.anInt6685;
									return;
								}
								if (arg0 == 1609) {
									anIntArray785[anInt10593++] = local137.anInt6715;
									return;
								}
								if (arg0 == 1610) {
									anIntArray785[anInt10593++] = local137.anInt6695;
									return;
								}
								if (arg0 == 1611) {
									anIntArray785[anInt10593++] = local137.anInt6655;
									return;
								}
								if (arg0 == 1612) {
									anIntArray785[anInt10593++] = local137.anInt6688;
									return;
								}
								if (arg0 == 1613) {
									local19 = anIntArray785[--anInt10593];
									local3242 = Static217.aClass90_1.method2122(local19);
									if (local3242.method8270()) {
										aStringArray44[anInt10591++] = local137.method5461(local3242.aString107, local19);
										return;
									}
									anIntArray785[anInt10593++] = local137.method5462(local19, local3242.anInt9931);
									return;
								}
								if (arg0 == 1614) {
									anIntArray785[anInt10593++] = local137.anInt6661;
									return;
								}
								if (arg0 == 2614) {
									anIntArray785[anInt10593++] = local137.anInt6680 == 1 ? local137.anInt6674 : -1;
									return;
								}
							} else if (arg0 < 1800) {
								local137 = arg1 ? aClass230_12 : aClass230_11;
								if (arg0 == 1700) {
									anIntArray785[anInt10593++] = local137.anInt6646;
									return;
								}
								if (arg0 == 1701) {
									if (local137.anInt6646 != -1) {
										anIntArray785[anInt10593++] = local137.anInt6692;
										return;
									}
									anIntArray785[anInt10593++] = 0;
									return;
								}
								if (arg0 == 1702) {
									anIntArray785[anInt10593++] = local137.anInt6679;
									return;
								}
							} else if (arg0 < 1900) {
								local137 = arg1 ? aClass230_12 : aClass230_11;
								if (arg0 == 1800) {
									anIntArray785[anInt10593++] = Static78.method1481(local137).method5402();
									return;
								}
								if (arg0 == 1801) {
									local19 = anIntArray785[--anInt10593];
									local19--;
									if (local137.aStringArray23 != null && local19 < local137.aStringArray23.length && local137.aStringArray23[local19] != null) {
										aStringArray44[anInt10591++] = local137.aStringArray23[local19];
										return;
									}
									aStringArray44[anInt10591++] = "";
									return;
								}
								if (arg0 == 1802) {
									if (local137.aString71 == null) {
										aStringArray44[anInt10591++] = "";
										return;
									}
									aStringArray44[anInt10591++] = local137.aString71;
									return;
								}
							} else if (arg0 < 2000 || arg0 >= 2900 && arg0 < 3000) {
								if (arg0 >= 2000) {
									local137 = Static655.method9094(anIntArray785[--anInt10593]);
									arg0 -= 1000;
								} else {
									local137 = arg1 ? aClass230_12 : aClass230_11;
								}
								if (anInt10602 >= 10) {
									throw new RuntimeException("C29xx-1");
								}
								if (arg0 == 1927) {
									if (local137.anObjectArray4 == null) {
										return;
									}
									@Pc(3511) Class14_Sub55 local3511 = new Class14_Sub55();
									local3511.aClass230_14 = local137;
									local3511.anObjectArray33 = local137.anObjectArray4;
									local3511.anInt10937 = anInt10602 + 1;
									Static576.aClass262_67.method6314(local3511);
									return;
								}
							} else if (arg0 < 2600) {
								local137 = Static655.method9094(anIntArray785[--anInt10593]);
								if (arg0 == 2500) {
									anIntArray785[anInt10593++] = local137.anInt6725;
									return;
								}
								if (arg0 == 2501) {
									anIntArray785[anInt10593++] = local137.anInt6676;
									return;
								}
								if (arg0 == 2502) {
									anIntArray785[anInt10593++] = local137.anInt6703;
									return;
								}
								if (arg0 == 2503) {
									anIntArray785[anInt10593++] = local137.anInt6701;
									return;
								}
								if (arg0 == 2504) {
									anIntArray785[anInt10593++] = local137.aBoolean475 ? 1 : 0;
									return;
								}
								if (arg0 == 2505) {
									anIntArray785[anInt10593++] = local137.anInt6668;
									return;
								}
								if (arg0 == 1506) {
									local158 = Static252.method3712(local137);
									anIntArray785[anInt10593++] = local158 == null ? -1 : local158.anInt6663;
									return;
								}
							} else if (arg0 < 2700) {
								local137 = Static655.method9094(anIntArray785[--anInt10593]);
								if (arg0 == 2600) {
									anIntArray785[anInt10593++] = local137.anInt6705;
									return;
								}
								if (arg0 == 2601) {
									anIntArray785[anInt10593++] = local137.anInt6641;
									return;
								}
								if (arg0 == 2602) {
									aStringArray44[anInt10591++] = local137.aString72;
									return;
								}
								if (arg0 == 2603) {
									anIntArray785[anInt10593++] = local137.anInt6711;
									return;
								}
								if (arg0 == 2604) {
									anIntArray785[anInt10593++] = local137.anInt6638;
									return;
								}
								if (arg0 == 2605) {
									anIntArray785[anInt10593++] = local137.anInt6710;
									return;
								}
								if (arg0 == 2606) {
									anIntArray785[anInt10593++] = local137.anInt6640;
									return;
								}
								if (arg0 == 2607) {
									anIntArray785[anInt10593++] = local137.anInt6659;
									return;
								}
								if (arg0 == 2608) {
									anIntArray785[anInt10593++] = local137.anInt6685;
									return;
								}
								if (arg0 == 2609) {
									anIntArray785[anInt10593++] = local137.anInt6715;
									return;
								}
								if (arg0 == 2610) {
									anIntArray785[anInt10593++] = local137.anInt6695;
									return;
								}
								if (arg0 == 2611) {
									anIntArray785[anInt10593++] = local137.anInt6655;
									return;
								}
								if (arg0 == 2612) {
									anIntArray785[anInt10593++] = local137.anInt6688;
									return;
								}
								if (arg0 == 2613) {
									anIntArray785[anInt10593++] = local137.anInt6661;
									return;
								}
								if (arg0 == 2614) {
									anIntArray785[anInt10593++] = local137.anInt6680 == 1 ? local137.anInt6674 : -1;
									return;
								}
							} else {
								@Pc(4040) Class14_Sub32 local4040;
								@Pc(3938) Class14_Sub32 local3938;
								if (arg0 < 2800) {
									if (arg0 == 2700) {
										local137 = Static655.method9094(anIntArray785[--anInt10593]);
										anIntArray785[anInt10593++] = local137.anInt6646;
										return;
									}
									if (arg0 == 2701) {
										local137 = Static655.method9094(anIntArray785[--anInt10593]);
										if (local137.anInt6646 != -1) {
											anIntArray785[anInt10593++] = local137.anInt6692;
											return;
										}
										anIntArray785[anInt10593++] = 0;
										return;
									}
									if (arg0 == 2702) {
										local13 = anIntArray785[--anInt10593];
										local3938 = (Class14_Sub32) Static547.aClass187_69.method4078((long) local13);
										if (local3938 != null) {
											anIntArray785[anInt10593++] = 1;
											return;
										}
										anIntArray785[anInt10593++] = 0;
										return;
									}
									if (arg0 == 2703) {
										local137 = Static655.method9094(anIntArray785[--anInt10593]);
										if (local137.aClass230Array2 == null) {
											anIntArray785[anInt10593++] = 0;
											return;
										}
										local19 = local137.aClass230Array2.length;
										for (local25 = 0; local25 < local137.aClass230Array2.length; local25++) {
											if (local137.aClass230Array2[local25] == null) {
												local19 = local25;
												break;
											}
										}
										anIntArray785[anInt10593++] = local19;
										return;
									}
									if (arg0 == 2704 || arg0 == 2705) {
										anInt10593 -= 2;
										local13 = anIntArray785[anInt10593];
										local19 = anIntArray785[anInt10593 + 1];
										local4040 = (Class14_Sub32) Static547.aClass187_69.method4078((long) local13);
										if (local4040 != null && local4040.anInt6351 == local19) {
											anIntArray785[anInt10593++] = 1;
											return;
										}
										anIntArray785[anInt10593++] = 0;
										return;
									}
								} else if (arg0 < 2900) {
									local137 = Static655.method9094(anIntArray785[--anInt10593]);
									if (arg0 == 2800) {
										anIntArray785[anInt10593++] = Static78.method1481(local137).method5402();
										return;
									}
									if (arg0 == 2801) {
										local19 = anIntArray785[--anInt10593];
										local19--;
										if (local137.aStringArray23 != null && local19 < local137.aStringArray23.length && local137.aStringArray23[local19] != null) {
											aStringArray44[anInt10591++] = local137.aStringArray23[local19];
											return;
										}
										aStringArray44[anInt10591++] = "";
										return;
									}
									if (arg0 == 2802) {
										if (local137.aString71 == null) {
											aStringArray44[anInt10591++] = "";
											return;
										}
										aStringArray44[anInt10591++] = local137.aString71;
										return;
									}
								} else {
									@Pc(4266) Class14_Sub19 local4266;
									@Pc(4177) String local4177;
									if (arg0 < 3200) {
										if (arg0 == 3100) {
											local4177 = aStringArray44[--anInt10591];
											Static68.method1356(local4177);
											return;
										}
										if (arg0 == 3101) {
											anInt10593 -= 2;
											Static572.method8201(anIntArray785[anInt10593 + 1], Static657.aClass12_Sub2_Sub2_Sub1_Sub2_2, anIntArray785[anInt10593]);
											return;
										}
										if (arg0 == 3103) {
											Static461.method6749();
											return;
										}
										if (arg0 == 3104) {
											local4177 = aStringArray44[--anInt10591];
											local19 = 0;
											if (Static324.method5106(local4177)) {
												local19 = Static235.method3555(local4177);
											}
											@Pc(4237) Class14_Sub19 local4237 = Static286.method4081(Static205.aClass394_1, Static234.aClass100_68);
											local4237.aClass14_Sub29_Sub1_1.method5861(local19);
											Static576.method8234(local4237);
											return;
										}
										if (arg0 == 3105) {
											local4177 = aStringArray44[--anInt10591];
											local4266 = Static286.method4081(Static205.aClass394_1, Static17.aClass100_5);
											local4266.aClass14_Sub29_Sub1_1.method5854(local4177.length() + 1);
											local4266.aClass14_Sub29_Sub1_1.method5855(local4177);
											Static576.method8234(local4266);
											return;
										}
										if (arg0 == 3106) {
											local4177 = aStringArray44[--anInt10591];
											local4266 = Static286.method4081(Static205.aClass394_1, Static636.aClass100_136);
											local4266.aClass14_Sub29_Sub1_1.method5854(local4177.length() + 1);
											local4266.aClass14_Sub29_Sub1_1.method5855(local4177);
											Static576.method8234(local4266);
											return;
										}
										if (arg0 == 3107) {
											local13 = anIntArray785[--anInt10593];
											local1161 = aStringArray44[--anInt10591];
											Static205.method3201(local13, local1161);
											return;
										}
										if (arg0 == 3108) {
											anInt10593 -= 3;
											local13 = anIntArray785[anInt10593];
											local19 = anIntArray785[anInt10593 + 1];
											local25 = anIntArray785[anInt10593 + 2];
											local35 = Static655.method9094(local25);
											Static496.method7328(local19, local35, local13);
											return;
										}
										if (arg0 == 3109) {
											anInt10593 -= 2;
											local13 = anIntArray785[anInt10593];
											local19 = anIntArray785[anInt10593 + 1];
											local210 = arg1 ? aClass230_12 : aClass230_11;
											Static496.method7328(local19, local210, local13);
											return;
										}
										if (arg0 == 3110) {
											local13 = anIntArray785[--anInt10593];
											local4266 = Static286.method4081(Static205.aClass394_1, Static631.aClass100_133);
											local4266.aClass14_Sub29_Sub1_1.method5859(local13);
											Static576.method8234(local4266);
											return;
										}
										if (arg0 == 3111) {
											anInt10593 -= 2;
											local13 = anIntArray785[anInt10593];
											local19 = anIntArray785[anInt10593 + 1];
											local4040 = (Class14_Sub32) Static547.aClass187_69.method4078((long) local13);
											if (local4040 != null) {
												Static446.method6502(local4040, local4040.anInt6351 != local19, true);
											}
											Static403.method5994(true, local13, local19, 3);
											return;
										}
										if (arg0 == 3112) {
											anInt10593--;
											local13 = anIntArray785[anInt10593];
											local3938 = (Class14_Sub32) Static547.aClass187_69.method4078((long) local13);
											if (local3938 != null && local3938.anInt6350 == 3) {
												Static446.method6502(local3938, true, true);
											}
											return;
										}
										if (arg0 == 3113) {
											Static491.method7256(aStringArray44[--anInt10591]);
											return;
										}
										if (arg0 == 3114) {
											anInt10593 -= 2;
											local13 = anIntArray785[anInt10593];
											local19 = anIntArray785[anInt10593 + 1];
											local1523 = aStringArray44[--anInt10591];
											Static149.method5512("", "", local1523, local13, local19, "");
											return;
										}
										if (arg0 == 3115) {
											anInt10593 -= 11;
											@Pc(4567) Class168[] local4567 = Static191.method2989();
											@Pc(4570) Class339[] local4570 = Static324.method5108();
											Static455.method6581(anIntArray785[anInt10593 + 2], local4570[anIntArray785[anInt10593 + 1]], anIntArray785[anInt10593 + 4], anIntArray785[anInt10593 + 6], anIntArray785[anInt10593 + 8], anIntArray785[anInt10593 + 9], anIntArray785[anInt10593 + 5], anIntArray785[anInt10593 + 3], anIntArray785[anInt10593 + 7], local4567[anIntArray785[anInt10593]], anIntArray785[anInt10593 + 10]);
											return;
										}
										if (arg0 == 3116) {
											local13 = anIntArray785[--anInt10593];
											local4266 = Static286.method4081(Static205.aClass394_1, Static573.aClass100_124);
											local4266.aClass14_Sub29_Sub1_1.method5859(local13);
											Static576.method8234(local4266);
											return;
										}
										if (arg0 == 3117) {
											local4177 = aStringArray44[--anInt10591];
											local4266 = Static286.method4081(Static205.aClass394_1, Static9.aClass100_2);
											local4266.aClass14_Sub29_Sub1_1.method5854(local4177.length() + 1);
											local4266.aClass14_Sub29_Sub1_1.method5855(local4177);
											Static576.method8234(local4266);
											return;
										}
									} else if (arg0 < 3300) {
										if (arg0 == 3200) {
											anInt10593 -= 3;
											Static143.method2260(255, anIntArray785[anInt10593 + 2], anIntArray785[anInt10593 + 1], anIntArray785[anInt10593], 256);
											return;
										}
										if (arg0 == 3201) {
											Static425.method6284(anIntArray785[--anInt10593], 50, 255);
											return;
										}
										if (arg0 == 3202) {
											anInt10593 -= 2;
											Static202.method3077(anIntArray785[anInt10593], anIntArray785[anInt10593 + 1], 255);
											return;
										}
										if (arg0 == 3203) {
											anInt10593 -= 4;
											Static143.method2260(anIntArray785[anInt10593 + 3], anIntArray785[anInt10593 + 2], anIntArray785[anInt10593 + 1], anIntArray785[anInt10593], 256);
											return;
										}
										if (arg0 == 3204) {
											anInt10593 -= 3;
											Static425.method6284(anIntArray785[anInt10593], anIntArray785[anInt10593 + 2], anIntArray785[anInt10593 + 1]);
											return;
										}
										if (arg0 == 3205) {
											anInt10593 -= 3;
											Static202.method3077(anIntArray785[anInt10593], anIntArray785[anInt10593 + 1], anIntArray785[anInt10593 + 2]);
											return;
										}
										if (arg0 == 3206) {
											anInt10593 -= 4;
											Static503.method7357(256, anIntArray785[anInt10593 + 3], anIntArray785[anInt10593 + 2], false, anIntArray785[anInt10593], anIntArray785[anInt10593 + 1]);
											return;
										}
										if (arg0 == 3207) {
											anInt10593 -= 4;
											Static503.method7357(256, anIntArray785[anInt10593 + 3], anIntArray785[anInt10593 + 2], true, anIntArray785[anInt10593], anIntArray785[anInt10593 + 1]);
											return;
										}
										if (arg0 == 3208) {
											anInt10593 -= 5;
											Static143.method2260(anIntArray785[anInt10593 + 3], anIntArray785[anInt10593 + 2], anIntArray785[anInt10593 + 1], anIntArray785[anInt10593], anIntArray785[anInt10593 + 4]);
											return;
										}
										if (arg0 == 3209) {
											anInt10593 -= 5;
											Static503.method7357(anIntArray785[anInt10593 + 4], anIntArray785[anInt10593 + 3], anIntArray785[anInt10593 + 2], false, anIntArray785[anInt10593], anIntArray785[anInt10593 + 1]);
											return;
										}
									} else if (arg0 < 3400) {
										if (arg0 == 3300) {
											anIntArray785[anInt10593++] = Static87.anInt1951;
											return;
										}
										if (arg0 == 3301) {
											anInt10593 -= 2;
											local13 = anIntArray785[anInt10593];
											local19 = anIntArray785[anInt10593 + 1];
											anIntArray785[anInt10593++] = Static211.method3344(false, local13, local19);
											return;
										}
										if (arg0 == 3302) {
											anInt10593 -= 2;
											local13 = anIntArray785[anInt10593];
											local19 = anIntArray785[anInt10593 + 1];
											anIntArray785[anInt10593++] = Static167.method2682(false, local13, local19);
											return;
										}
										if (arg0 == 3303) {
											anInt10593 -= 2;
											local13 = anIntArray785[anInt10593];
											local19 = anIntArray785[anInt10593 + 1];
											anIntArray785[anInt10593++] = Static117.method9146(local13, local19, false);
											return;
										}
										if (arg0 == 3304) {
											local13 = anIntArray785[--anInt10593];
											anIntArray785[anInt10593++] = Static548.aClass41_1.method1102(local13).anInt7037;
											return;
										}
										if (arg0 == 3305) {
											local13 = anIntArray785[--anInt10593];
											anIntArray785[anInt10593++] = Static94.anIntArray154[local13];
											return;
										}
										if (arg0 == 3306) {
											local13 = anIntArray785[--anInt10593];
											anIntArray785[anInt10593++] = Static311.anIntArray433[local13];
											return;
										}
										if (arg0 == 3307) {
											local13 = anIntArray785[--anInt10593];
											anIntArray785[anInt10593++] = Static240.anIntArray339[local13];
											return;
										}
										if (arg0 == 3308) {
											@Pc(5157) byte local5157 = Static657.aClass12_Sub2_Sub2_Sub1_Sub2_2.aByte146;
											local19 = (Static657.aClass12_Sub2_Sub2_Sub1_Sub2_2.anInt10998 >> 9) + Static329.anInt6225;
											local25 = (Static657.aClass12_Sub2_Sub2_Sub1_Sub2_2.anInt11002 >> 9) + Static202.anInt3755;
											anIntArray785[anInt10593++] = (local5157 << 28) + (local19 << 14) + local25;
											return;
										}
										if (arg0 == 3309) {
											local13 = anIntArray785[--anInt10593];
											anIntArray785[anInt10593++] = local13 >> 14 & 0x3FFF;
											return;
										}
										if (arg0 == 3310) {
											local13 = anIntArray785[--anInt10593];
											anIntArray785[anInt10593++] = local13 >> 28;
											return;
										}
										if (arg0 == 3311) {
											local13 = anIntArray785[--anInt10593];
											anIntArray785[anInt10593++] = local13 & 0x3FFF;
											return;
										}
										if (arg0 == 3312) {
											anIntArray785[anInt10593++] = Static377.aBoolean495 ? 1 : 0;
											return;
										}
										if (arg0 == 3313) {
											anInt10593 -= 2;
											local13 = anIntArray785[anInt10593];
											local19 = anIntArray785[anInt10593 + 1];
											anIntArray785[anInt10593++] = Static211.method3344(true, local13, local19);
											return;
										}
										if (arg0 == 3314) {
											anInt10593 -= 2;
											local13 = anIntArray785[anInt10593];
											local19 = anIntArray785[anInt10593 + 1];
											anIntArray785[anInt10593++] = Static167.method2682(true, local13, local19);
											return;
										}
										if (arg0 == 3315) {
											anInt10593 -= 2;
											local13 = anIntArray785[anInt10593];
											local19 = anIntArray785[anInt10593 + 1];
											anIntArray785[anInt10593++] = Static117.method9146(local13, local19, true);
											return;
										}
										if (arg0 == 3316) {
											if (Static447.anInt10238 >= 2) {
												anIntArray785[anInt10593++] = Static447.anInt10238;
												return;
											}
											anIntArray785[anInt10593++] = 0;
											return;
										}
										if (arg0 == 3317) {
											anIntArray785[anInt10593++] = Static192.anInt3587;
											return;
										}
										if (arg0 == 3318) {
											anIntArray785[anInt10593++] = Static92.aClass337_1.anInt9843;
											return;
										}
										if (arg0 == 3321) {
											anIntArray785[anInt10593++] = Static313.anInt9043;
											return;
										}
										if (arg0 == 3322) {
											anIntArray785[anInt10593++] = Static38.anInt996;
											return;
										}
										if (arg0 == 3323) {
											if (Static320.anInt6102 >= 5 && Static320.anInt6102 <= 9) {
												anIntArray785[anInt10593++] = 1;
												return;
											}
											anIntArray785[anInt10593++] = 0;
											return;
										}
										if (arg0 == 3324) {
											if (Static320.anInt6102 >= 5 && Static320.anInt6102 <= 9) {
												anIntArray785[anInt10593++] = Static320.anInt6102;
												return;
											}
											anIntArray785[anInt10593++] = 0;
											return;
										}
										if (arg0 == 3325) {
											anIntArray785[anInt10593++] = Static524.aBoolean638 ? 1 : 0;
											return;
										}
										if (arg0 == 3326) {
											anIntArray785[anInt10593++] = Static657.aClass12_Sub2_Sub2_Sub1_Sub2_2.anInt2995;
											return;
										}
										if (arg0 == 3327) {
											anIntArray785[anInt10593++] = Static657.aClass12_Sub2_Sub2_Sub1_Sub2_2.aClass325_1 != null && Static657.aClass12_Sub2_Sub2_Sub1_Sub2_2.aClass325_1.aBoolean661 ? 1 : 0;
											return;
										}
										if (arg0 == 3329) {
											anIntArray785[anInt10593++] = Static154.aBoolean234 ? 1 : 0;
											return;
										}
										if (arg0 == 3330) {
											local13 = anIntArray785[--anInt10593];
											anIntArray785[anInt10593++] = Static499.method7332(local13);
											return;
										}
										if (arg0 == 3331) {
											anInt10593 -= 2;
											local13 = anIntArray785[anInt10593];
											local19 = anIntArray785[anInt10593 + 1];
											anIntArray785[anInt10593++] = Static407.method6042(false, local19, local13);
											return;
										}
										if (arg0 == 3332) {
											anInt10593 -= 2;
											local13 = anIntArray785[anInt10593];
											local19 = anIntArray785[anInt10593 + 1];
											anIntArray785[anInt10593++] = Static407.method6042(true, local19, local13);
											return;
										}
										if (arg0 == 3333) {
											anIntArray785[anInt10593++] = Static648.method9017();
											return;
										}
										if (arg0 == 3335) {
											anIntArray785[anInt10593++] = Static232.anInt4258;
											return;
										}
										if (arg0 == 3336) {
											anInt10593 -= 4;
											local13 = anIntArray785[anInt10593];
											local19 = anIntArray785[anInt10593 + 1];
											local25 = anIntArray785[anInt10593 + 2];
											local357 = anIntArray785[anInt10593 + 3];
											local13 += local19 << 14;
											local13 += local25 << 28;
											local13 += local357;
											anIntArray785[anInt10593++] = local13;
											return;
										}
										if (arg0 == 3337) {
											anIntArray785[anInt10593++] = Static349.anInt6487;
											return;
										}
										if (arg0 == 3338) {
											anIntArray785[anInt10593++] = Static482.method7139();
											return;
										}
										if (arg0 == 3339) {
											anIntArray785[anInt10593++] = 0;
											return;
										}
										if (arg0 == 3340) {
											anIntArray785[anInt10593++] = Static645.aBoolean743 ? 1 : 0;
											return;
										}
										if (arg0 == 3341) {
											anIntArray785[anInt10593++] = Static87.aBoolean164 ? 1 : 0;
											return;
										}
										if (arg0 == 3342) {
											anIntArray785[anInt10593++] = Static666.aClass79_1.method3361();
											return;
										}
										if (arg0 == 3343) {
											anIntArray785[anInt10593++] = Static666.aClass79_1.method3358();
											return;
										}
										if (arg0 == 3344) {
											aStringArray44[anInt10591++] = Static13.method131();
											return;
										}
										if (arg0 == 3345) {
											aStringArray44[anInt10591++] = Static459.method6610();
											return;
										}
										if (arg0 == 3346) {
											anIntArray785[anInt10593++] = Static220.method3434();
											return;
										}
										if (arg0 == 3347) {
											anIntArray785[anInt10593++] = Static548.anInt9334;
											return;
										}
										if (arg0 == 3349) {
											anIntArray785[anInt10593++] = Static657.aClass12_Sub2_Sub2_Sub1_Sub2_2.aClass139_7.method3204() >> 3;
											return;
										}
									} else if (arg0 < 3500) {
										@Pc(5909) Class61 local5909;
										if (arg0 == 3400) {
											anInt10593 -= 2;
											local13 = anIntArray785[anInt10593];
											local19 = anIntArray785[anInt10593 + 1];
											local5909 = Static202.aClass172_1.method3783(local13);
											aStringArray44[anInt10591++] = local5909.method1493(local19);
											return;
										}
										if (arg0 == 3408) {
											anInt10593 -= 4;
											local13 = anIntArray785[anInt10593];
											local19 = anIntArray785[anInt10593 + 1];
											local25 = anIntArray785[anInt10593 + 2];
											local357 = anIntArray785[anInt10593 + 3];
											@Pc(5955) Class61 local5955 = Static202.aClass172_1.method3783(local25);
											if (local5955.aChar2 == local13 && local5955.aChar1 == local19) {
												if (local19 == 115) {
													aStringArray44[anInt10591++] = local5955.method1493(local357);
													return;
												}
												anIntArray785[anInt10593++] = local5955.method1490(local357);
												return;
											}
											throw new RuntimeException("C3408-1 " + local25 + "-" + local357);
										}
										if (arg0 == 3409) {
											anInt10593 -= 3;
											local13 = anIntArray785[anInt10593];
											local19 = anIntArray785[anInt10593 + 1];
											local25 = anIntArray785[anInt10593 + 2];
											if (local19 == -1) {
												throw new RuntimeException("C3409-2");
											}
											@Pc(6041) Class61 local6041 = Static202.aClass172_1.method3783(local19);
											if (local6041.aChar1 != local13) {
												throw new RuntimeException("C3409-1");
											}
											anIntArray785[anInt10593++] = local6041.method1487(local25) ? 1 : 0;
											return;
										}
										if (arg0 == 3410) {
											local13 = anIntArray785[--anInt10593];
											local1161 = aStringArray44[--anInt10591];
											if (local13 == -1) {
												throw new RuntimeException("C3410-2");
											}
											local5909 = Static202.aClass172_1.method3783(local13);
											if (local5909.aChar1 != 's') {
												throw new RuntimeException("C3410-1");
											}
											anIntArray785[anInt10593++] = local5909.method1494(local1161) ? 1 : 0;
											return;
										}
										if (arg0 == 3411) {
											local13 = anIntArray785[--anInt10593];
											@Pc(6139) Class61 local6139 = Static202.aClass172_1.method3783(local13);
											anIntArray785[anInt10593++] = local6139.aClass187_14.method4080();
											return;
										}
									} else if (arg0 < 3700) {
										if (arg0 == 3600) {
											if (Static491.anInt8761 == 0) {
												anIntArray785[anInt10593++] = -2;
												return;
											}
											if (Static491.anInt8761 == 1) {
												anIntArray785[anInt10593++] = -1;
												return;
											}
											anIntArray785[anInt10593++] = Static592.anInt1870;
											return;
										}
										if (arg0 == 3601) {
											local13 = anIntArray785[--anInt10593];
											if (Static491.anInt8761 == 2 && local13 < Static592.anInt1870) {
												aStringArray44[anInt10591++] = Static369.aStringArray24[local13];
												if (Static570.aStringArray37[local13] != null) {
													aStringArray44[anInt10591++] = Static570.aStringArray37[local13];
													return;
												}
												aStringArray44[anInt10591++] = "";
												return;
											}
											aStringArray44[anInt10591++] = "";
											aStringArray44[anInt10591++] = "";
											return;
										}
										if (arg0 == 3602) {
											local13 = anIntArray785[--anInt10593];
											if (Static491.anInt8761 == 2 && local13 < Static592.anInt1870) {
												anIntArray785[anInt10593++] = Static620.anIntArray765[local13];
												return;
											}
											anIntArray785[anInt10593++] = 0;
											return;
										}
										if (arg0 == 3603) {
											local13 = anIntArray785[--anInt10593];
											if (Static491.anInt8761 == 2 && local13 < Static592.anInt1870) {
												anIntArray785[anInt10593++] = Static555.anIntArray694[local13];
												return;
											}
											anIntArray785[anInt10593++] = 0;
											return;
										}
										if (arg0 == 3604) {
											local4177 = aStringArray44[--anInt10591];
											local19 = anIntArray785[--anInt10593];
											Static223.method3458(local19, local4177);
											return;
										}
										if (arg0 == 3605) {
											local4177 = aStringArray44[--anInt10591];
											Static139.method2204(local4177);
											return;
										}
										if (arg0 == 3606) {
											local4177 = aStringArray44[--anInt10591];
											Static610.method8579(local4177);
											return;
										}
										if (arg0 == 3607) {
											local4177 = aStringArray44[--anInt10591];
											Static535.method7639(local4177, false);
											return;
										}
										if (arg0 == 3608) {
											local4177 = aStringArray44[--anInt10591];
											Static375.method5567(local4177);
											return;
										}
										if (arg0 == 3609) {
											local4177 = aStringArray44[--anInt10591];
											if (local4177.startsWith("<img=0>") || local4177.startsWith("<img=1>")) {
												local4177 = local4177.substring(7);
											}
											anIntArray785[anInt10593++] = Static21.method342(local4177) ? 1 : 0;
											return;
										}
										if (arg0 == 3610) {
											local13 = anIntArray785[--anInt10593];
											if (Static491.anInt8761 == 2 && local13 < Static592.anInt1870) {
												aStringArray44[anInt10591++] = Static674.aStringArray47[local13];
												return;
											}
											aStringArray44[anInt10591++] = "";
											return;
										}
										if (arg0 == 3611) {
											if (Static521.aString86 != null) {
												aStringArray44[anInt10591++] = Static354.method5373(Static521.aString86);
												return;
											}
											aStringArray44[anInt10591++] = "";
											return;
										}
										if (arg0 == 3612) {
											if (Static521.aString86 != null) {
												anIntArray785[anInt10593++] = Static3.anInt23;
												return;
											}
											anIntArray785[anInt10593++] = 0;
											return;
										}
										if (arg0 == 3613) {
											local13 = anIntArray785[--anInt10593];
											if (Static521.aString86 != null && local13 < Static3.anInt23) {
												aStringArray44[anInt10591++] = Static678.aClass111Array1[local13].aString42;
												return;
											}
											aStringArray44[anInt10591++] = "";
											return;
										}
										if (arg0 == 3614) {
											local13 = anIntArray785[--anInt10593];
											if (Static521.aString86 != null && local13 < Static3.anInt23) {
												anIntArray785[anInt10593++] = Static678.aClass111Array1[local13].anInt3251;
												return;
											}
											anIntArray785[anInt10593++] = 0;
											return;
										}
										if (arg0 == 3615) {
											local13 = anIntArray785[--anInt10593];
											if (Static521.aString86 != null && local13 < Static3.anInt23) {
												anIntArray785[anInt10593++] = Static678.aClass111Array1[local13].aByte68;
												return;
											}
											anIntArray785[anInt10593++] = 0;
											return;
										}
										if (arg0 == 3616) {
											anIntArray785[anInt10593++] = Static467.aByte120;
											return;
										}
										if (arg0 == 3617) {
											local4177 = aStringArray44[--anInt10591];
											Static68.method1355(local4177);
											return;
										}
										if (arg0 == 3618) {
											anIntArray785[anInt10593++] = Static75.aByte38;
											return;
										}
										if (arg0 == 3619) {
											local4177 = aStringArray44[--anInt10591];
											Static428.method6308(local4177);
											return;
										}
										if (arg0 == 3620) {
											Static679.method9319();
											return;
										}
										if (arg0 == 3621) {
											if (Static491.anInt8761 == 0) {
												anIntArray785[anInt10593++] = -1;
												return;
											}
											anIntArray785[anInt10593++] = Static641.anInt10703;
											return;
										}
										if (arg0 == 3622) {
											local13 = anIntArray785[--anInt10593];
											if (Static491.anInt8761 != 0 && local13 < Static641.anInt10703) {
												aStringArray44[anInt10591++] = Static304.aStringArray17[local13];
												if (Static543.aStringArray34[local13] != null) {
													aStringArray44[anInt10591++] = Static543.aStringArray34[local13];
													return;
												}
												aStringArray44[anInt10591++] = "";
												return;
											}
											aStringArray44[anInt10591++] = "";
											aStringArray44[anInt10591++] = "";
											return;
										}
										if (arg0 == 3623) {
											local4177 = aStringArray44[--anInt10591];
											if (local4177.startsWith("<img=0>") || local4177.startsWith("<img=1>")) {
												local4177 = local4177.substring(7);
											}
											anIntArray785[anInt10593++] = Static239.method3588(local4177) ? 1 : 0;
											return;
										}
										if (arg0 == 3624) {
											local13 = anIntArray785[--anInt10593];
											if (Static678.aClass111Array1 != null && local13 < Static3.anInt23 && Static678.aClass111Array1[local13].aString39.equalsIgnoreCase(Static657.aClass12_Sub2_Sub2_Sub1_Sub2_2.aString35)) {
												anIntArray785[anInt10593++] = 1;
												return;
											}
											anIntArray785[anInt10593++] = 0;
											return;
										}
										if (arg0 == 3625) {
											if (Static437.aString79 != null) {
												aStringArray44[anInt10591++] = Static437.aString79;
												return;
											}
											aStringArray44[anInt10591++] = "";
											return;
										}
										if (arg0 == 3626) {
											local13 = anIntArray785[--anInt10593];
											if (Static521.aString86 != null && local13 < Static3.anInt23) {
												aStringArray44[anInt10591++] = Static678.aClass111Array1[local13].aString40;
												return;
											}
											aStringArray44[anInt10591++] = "";
											return;
										}
										if (arg0 == 3627) {
											local13 = anIntArray785[--anInt10593];
											if (Static491.anInt8761 == 2 && local13 >= 0 && local13 < Static592.anInt1870) {
												anIntArray785[anInt10593++] = Static267.aBooleanArray14[local13] ? 1 : 0;
												return;
											}
											anIntArray785[anInt10593++] = 0;
											return;
										}
										if (arg0 == 3628) {
											local4177 = aStringArray44[--anInt10591];
											if (local4177.startsWith("<img=0>") || local4177.startsWith("<img=1>")) {
												local4177 = local4177.substring(7);
											}
											anIntArray785[anInt10593++] = Static317.method5023(local4177);
											return;
										}
										if (arg0 == 3629) {
											anIntArray785[anInt10593++] = Static334.anInt6331;
											return;
										}
										if (arg0 == 3630) {
											local4177 = aStringArray44[--anInt10591];
											Static535.method7639(local4177, true);
											return;
										}
										if (arg0 == 3631) {
											local13 = anIntArray785[--anInt10593];
											anIntArray785[anInt10593++] = Static535.aBooleanArray21[local13] ? 1 : 0;
											return;
										}
										if (arg0 == 3632) {
											local13 = anIntArray785[--anInt10593];
											if (Static521.aString86 != null && local13 < Static3.anInt23) {
												aStringArray44[anInt10591++] = Static678.aClass111Array1[local13].aString39;
												return;
											}
											aStringArray44[anInt10591++] = "";
											return;
										}
										if (arg0 == 3633) {
											local13 = anIntArray785[--anInt10593];
											if (Static491.anInt8761 != 0 && local13 < Static641.anInt10703) {
												aStringArray44[anInt10591++] = Static411.aStringArray27[local13];
												return;
											}
											aStringArray44[anInt10591++] = "";
											return;
										}
									} else if (arg0 < 3800) {
										if (arg0 == 3700) {
											if (Static432.aClass229_2 != null) {
												anIntArray785[anInt10593++] = 1;
												aClass229_3 = Static432.aClass229_2;
												return;
											}
											anIntArray785[anInt10593++] = 0;
											return;
										}
										if (arg0 == 3701) {
											if (Static128.aClass229_1 != null) {
												anIntArray785[anInt10593++] = 1;
												aClass229_3 = Static128.aClass229_1;
												return;
											}
											anIntArray785[anInt10593++] = 0;
											return;
										}
										if (arg0 == 3702) {
											aStringArray44[anInt10591++] = aClass229_3.aString69;
											return;
										}
										if (arg0 == 3703) {
											anIntArray785[anInt10593++] = aClass229_3.aBoolean467 ? 1 : 0;
											return;
										}
										if (arg0 == 3704) {
											anIntArray785[anInt10593++] = aClass229_3.aByte104;
											return;
										}
										if (arg0 == 3705) {
											anIntArray785[anInt10593++] = aClass229_3.aByte103;
											return;
										}
										if (arg0 == 3706) {
											anIntArray785[anInt10593++] = aClass229_3.aByte102;
											return;
										}
										if (arg0 == 3707) {
											anIntArray785[anInt10593++] = aClass229_3.aByte101;
											return;
										}
										if (arg0 == 3709) {
											anIntArray785[anInt10593++] = aClass229_3.anInt6622;
											return;
										}
										if (arg0 == 3710) {
											local13 = anIntArray785[--anInt10593];
											aStringArray44[anInt10591++] = aClass229_3.aStringArray22[local13];
											return;
										}
										if (arg0 == 3711) {
											local13 = anIntArray785[--anInt10593];
											anIntArray785[anInt10593++] = aClass229_3.aByteArray76[local13];
											return;
										}
										if (arg0 == 3712) {
											anIntArray785[anInt10593++] = aClass229_3.anInt6603;
											return;
										}
										if (arg0 == 3713) {
											local13 = anIntArray785[--anInt10593];
											aStringArray44[anInt10591++] = aClass229_3.aStringArray21[local13];
											return;
										}
										if (arg0 == 3714) {
											anInt10593 -= 3;
											local13 = anIntArray785[anInt10593];
											local19 = anIntArray785[anInt10593 + 1];
											local25 = anIntArray785[anInt10593 + 2];
											anIntArray785[anInt10593++] = aClass229_3.method5418(local25, local13, local19);
											return;
										}
										if (arg0 == 3715) {
											anIntArray785[anInt10593++] = aClass229_3.anInt6599;
											return;
										}
										if (arg0 == 3716) {
											anIntArray785[anInt10593++] = aClass229_3.anInt6625;
											return;
										}
										if (arg0 == 3717) {
											anIntArray785[anInt10593++] = aClass229_3.method5434(aStringArray44[--anInt10591]);
											return;
										}
										if (arg0 == 3718) {
											anIntArray785[anInt10593 - 1] = aClass229_3.method5425()[anIntArray785[anInt10593 - 1]];
											return;
										}
										if (arg0 == 3750) {
											if (Static64.aClass14_Sub25_1 != null) {
												anIntArray785[anInt10593++] = 1;
												aClass14_Sub25_3 = Static64.aClass14_Sub25_1;
												return;
											}
											anIntArray785[anInt10593++] = 0;
											return;
										}
										if (arg0 == 3751) {
											if (Static323.aClass14_Sub25_2 != null) {
												anIntArray785[anInt10593++] = 1;
												aClass14_Sub25_3 = Static323.aClass14_Sub25_2;
												return;
											}
											anIntArray785[anInt10593++] = 0;
											return;
										}
										if (arg0 == 3752) {
											aStringArray44[anInt10591++] = aClass14_Sub25_3.aString48;
											return;
										}
										if (arg0 == 3753) {
											anIntArray785[anInt10593++] = aClass14_Sub25_3.aByte80;
											return;
										}
										if (arg0 == 3754) {
											anIntArray785[anInt10593++] = aClass14_Sub25_3.aByte81;
											return;
										}
										if (arg0 == 3755) {
											anIntArray785[anInt10593++] = aClass14_Sub25_3.anInt4216;
											return;
										}
										if (arg0 == 3756) {
											local13 = anIntArray785[--anInt10593];
											aStringArray44[anInt10591++] = aClass14_Sub25_3.aClass336Array1[local13].aString102;
											return;
										}
										if (arg0 == 3757) {
											local13 = anIntArray785[--anInt10593];
											anIntArray785[anInt10593++] = aClass14_Sub25_3.aClass336Array1[local13].aByte135;
											return;
										}
										if (arg0 == 3758) {
											local13 = anIntArray785[--anInt10593];
											anIntArray785[anInt10593++] = aClass14_Sub25_3.aClass336Array1[local13].anInt9809;
											return;
										}
										if (arg0 == 3759) {
											local13 = anIntArray785[--anInt10593];
											Static674.method9278(local13, aClass14_Sub25_3 == Static323.aClass14_Sub25_2);
											return;
										}
										if (arg0 == 3760) {
											anIntArray785[anInt10593++] = aClass14_Sub25_3.method3489(aStringArray44[--anInt10591]);
											return;
										}
										if (arg0 == 3761) {
											anIntArray785[anInt10593 - 1] = aClass14_Sub25_3.method3492()[anIntArray785[anInt10593 - 1]];
											return;
										}
									} else if (arg0 < 4000) {
										if (arg0 == 3903) {
											local13 = anIntArray785[--anInt10593];
											anIntArray785[anInt10593++] = Static294.aClass272Array1[local13].method6506();
											return;
										}
										if (arg0 == 3904) {
											local13 = anIntArray785[--anInt10593];
											anIntArray785[anInt10593++] = Static294.aClass272Array1[local13].anInt7868;
											return;
										}
										if (arg0 == 3905) {
											local13 = anIntArray785[--anInt10593];
											anIntArray785[anInt10593++] = Static294.aClass272Array1[local13].anInt7862;
											return;
										}
										if (arg0 == 3906) {
											local13 = anIntArray785[--anInt10593];
											anIntArray785[anInt10593++] = Static294.aClass272Array1[local13].anInt7864;
											return;
										}
										if (arg0 == 3907) {
											local13 = anIntArray785[--anInt10593];
											anIntArray785[anInt10593++] = Static294.aClass272Array1[local13].anInt7861;
											return;
										}
										if (arg0 == 3908) {
											local13 = anIntArray785[--anInt10593];
											anIntArray785[anInt10593++] = Static294.aClass272Array1[local13].anInt7865;
											return;
										}
										if (arg0 == 3910) {
											local13 = anIntArray785[--anInt10593];
											local19 = Static294.aClass272Array1[local13].method6504();
											anIntArray785[anInt10593++] = local19 == 0 ? 1 : 0;
											return;
										}
										if (arg0 == 3911) {
											local13 = anIntArray785[--anInt10593];
											local19 = Static294.aClass272Array1[local13].method6504();
											anIntArray785[anInt10593++] = local19 == 2 ? 1 : 0;
											return;
										}
										if (arg0 == 3912) {
											local13 = anIntArray785[--anInt10593];
											local19 = Static294.aClass272Array1[local13].method6504();
											anIntArray785[anInt10593++] = local19 == 5 ? 1 : 0;
											return;
										}
										if (arg0 == 3913) {
											local13 = anIntArray785[--anInt10593];
											local19 = Static294.aClass272Array1[local13].method6504();
											anIntArray785[anInt10593++] = local19 == 1 ? 1 : 0;
											return;
										}
									} else {
										@Pc(8208) long local8208;
										if (arg0 < 4100) {
											if (arg0 == 4000) {
												anInt10593 -= 2;
												local13 = anIntArray785[anInt10593];
												local19 = anIntArray785[anInt10593 + 1];
												anIntArray785[anInt10593++] = local13 + local19;
												return;
											}
											if (arg0 == 4001) {
												anInt10593 -= 2;
												local13 = anIntArray785[anInt10593];
												local19 = anIntArray785[anInt10593 + 1];
												anIntArray785[anInt10593++] = local13 - local19;
												return;
											}
											if (arg0 == 4002) {
												anInt10593 -= 2;
												local13 = anIntArray785[anInt10593];
												local19 = anIntArray785[anInt10593 + 1];
												anIntArray785[anInt10593++] = local13 * local19;
												return;
											}
											if (arg0 == 4003) {
												anInt10593 -= 2;
												local13 = anIntArray785[anInt10593];
												local19 = anIntArray785[anInt10593 + 1];
												anIntArray785[anInt10593++] = local13 / local19;
												return;
											}
											if (arg0 == 4004) {
												local13 = anIntArray785[--anInt10593];
												anIntArray785[anInt10593++] = (int) (Math.random() * (double) local13);
												return;
											}
											if (arg0 == 4005) {
												local13 = anIntArray785[--anInt10593];
												anIntArray785[anInt10593++] = (int) (Math.random() * (double) (local13 + 1));
												return;
											}
											if (arg0 == 4006) {
												anInt10593 -= 5;
												local13 = anIntArray785[anInt10593];
												local19 = anIntArray785[anInt10593 + 1];
												local25 = anIntArray785[anInt10593 + 2];
												local357 = anIntArray785[anInt10593 + 3];
												local2473 = anIntArray785[anInt10593 + 4];
												anIntArray785[anInt10593++] = local13 + (local19 - local13) * (local2473 - local25) / (local357 - local25);
												return;
											}
											@Pc(8215) long local8215;
											if (arg0 == 4007) {
												anInt10593 -= 2;
												local8208 = (long) anIntArray785[anInt10593];
												local8215 = (long) anIntArray785[anInt10593 + 1];
												anIntArray785[anInt10593++] = (int) (local8208 + local8208 * local8215 / 100L);
												return;
											}
											if (arg0 == 4008) {
												anInt10593 -= 2;
												local13 = anIntArray785[anInt10593];
												local19 = anIntArray785[anInt10593 + 1];
												anIntArray785[anInt10593++] = local13 | 0x1 << local19;
												return;
											}
											if (arg0 == 4009) {
												anInt10593 -= 2;
												local13 = anIntArray785[anInt10593];
												local19 = anIntArray785[anInt10593 + 1];
												anIntArray785[anInt10593++] = local13 & -(0x1 << local19) - 1;
												return;
											}
											if (arg0 == 4010) {
												anInt10593 -= 2;
												local13 = anIntArray785[anInt10593];
												local19 = anIntArray785[anInt10593 + 1];
												anIntArray785[anInt10593++] = (local13 & 0x1 << local19) == 0 ? 0 : 1;
												return;
											}
											if (arg0 == 4011) {
												anInt10593 -= 2;
												local13 = anIntArray785[anInt10593];
												local19 = anIntArray785[anInt10593 + 1];
												anIntArray785[anInt10593++] = local13 % local19;
												return;
											}
											if (arg0 == 4012) {
												anInt10593 -= 2;
												local13 = anIntArray785[anInt10593];
												local19 = anIntArray785[anInt10593 + 1];
												if (local13 == 0) {
													anIntArray785[anInt10593++] = 0;
													return;
												}
												anIntArray785[anInt10593++] = (int) Math.pow((double) local13, (double) local19);
												return;
											}
											if (arg0 == 4013) {
												anInt10593 -= 2;
												local13 = anIntArray785[anInt10593];
												local19 = anIntArray785[anInt10593 + 1];
												if (local13 == 0) {
													anIntArray785[anInt10593++] = 0;
													return;
												}
												if (local19 == 0) {
													anIntArray785[anInt10593++] = Integer.MAX_VALUE;
													return;
												}
												anIntArray785[anInt10593++] = (int) Math.pow((double) local13, 1.0D / (double) local19);
												return;
											}
											if (arg0 == 4014) {
												anInt10593 -= 2;
												local13 = anIntArray785[anInt10593];
												local19 = anIntArray785[anInt10593 + 1];
												anIntArray785[anInt10593++] = local13 & local19;
												return;
											}
											if (arg0 == 4015) {
												anInt10593 -= 2;
												local13 = anIntArray785[anInt10593];
												local19 = anIntArray785[anInt10593 + 1];
												anIntArray785[anInt10593++] = local13 | local19;
												return;
											}
											if (arg0 == 4016) {
												anInt10593 -= 2;
												local13 = anIntArray785[anInt10593];
												local19 = anIntArray785[anInt10593 + 1];
												anIntArray785[anInt10593++] = local13 < local19 ? local13 : local19;
												return;
											}
											if (arg0 == 4017) {
												anInt10593 -= 2;
												local13 = anIntArray785[anInt10593];
												local19 = anIntArray785[anInt10593 + 1];
												anIntArray785[anInt10593++] = local13 > local19 ? local13 : local19;
												return;
											}
											if (arg0 == 4018) {
												anInt10593 -= 3;
												local8208 = (long) anIntArray785[anInt10593];
												local8215 = (long) anIntArray785[anInt10593 + 1];
												@Pc(8596) long local8596 = (long) anIntArray785[anInt10593 + 2];
												anIntArray785[anInt10593++] = (int) (local8208 * local8596 / local8215);
												return;
											}
											if (arg0 == 4019) {
												anInt10593 -= 2;
												local13 = anIntArray785[anInt10593];
												local19 = anIntArray785[anInt10593 + 1];
												if (local13 > 700 || local19 > 700) {
													anIntArray785[anInt10593++] = 256;
												}
												@Pc(8655) double local8655 = (Math.random() * (double) (local19 + local13) + 800.0D - (double) local13) / 100.0D;
												anIntArray785[anInt10593++] = (int) (Math.pow(2.0D, local8655) + 0.5D);
												return;
											}
											if (arg0 == 4020) {
												local13 = anIntArray785[--anInt10593];
												anIntArray785[anInt10593++] = Static520.anIntArray666[Static592.method1600(local13) & 0xFFFF];
												return;
											}
										} else if (arg0 < 4200) {
											if (arg0 == 4100) {
												local4177 = aStringArray44[--anInt10591];
												local19 = anIntArray785[--anInt10593];
												aStringArray44[anInt10591++] = local4177 + local19;
												return;
											}
											if (arg0 == 4101) {
												anInt10591 -= 2;
												local4177 = aStringArray44[anInt10591];
												local1161 = aStringArray44[anInt10591 + 1];
												aStringArray44[anInt10591++] = local4177 + local1161;
												return;
											}
											if (arg0 == 4102) {
												local4177 = aStringArray44[--anInt10591];
												local19 = anIntArray785[--anInt10593];
												aStringArray44[anInt10591++] = local4177 + Static149.method5514(local19, true);
												return;
											}
											if (arg0 == 4103) {
												local4177 = aStringArray44[--anInt10591];
												aStringArray44[anInt10591++] = local4177.toLowerCase();
												return;
											}
											if (arg0 == 4104) {
												aStringArray44[anInt10591++] = Static594.method8431(Static551.method5873(anIntArray785[--anInt10593]), Static232.anInt4258);
												return;
											}
											if (arg0 == 4105) {
												anInt10591 -= 2;
												local4177 = aStringArray44[anInt10591];
												local1161 = aStringArray44[anInt10591 + 1];
												if (Static657.aClass12_Sub2_Sub2_Sub1_Sub2_2.aClass325_1 != null && Static657.aClass12_Sub2_Sub2_Sub1_Sub2_2.aClass325_1.aBoolean661) {
													aStringArray44[anInt10591++] = local1161;
													return;
												}
												aStringArray44[anInt10591++] = local4177;
												return;
											}
											if (arg0 == 4106) {
												local13 = anIntArray785[--anInt10593];
												aStringArray44[anInt10591++] = Integer.toString(local13);
												return;
											}
											if (arg0 == 4107) {
												anInt10591 -= 2;
												anIntArray785[anInt10593++] = Static657.method9109(Static232.anInt4258, aStringArray44[anInt10591], aStringArray44[anInt10591 + 1]);
												return;
											}
											@Pc(8968) Class158 local8968;
											if (arg0 == 4108) {
												local4177 = aStringArray44[--anInt10591];
												anInt10593 -= 2;
												local19 = anIntArray785[anInt10593];
												local25 = anIntArray785[anInt10593 + 1];
												local8968 = Static512.method7464(Static329.aClass386_78, local25);
												anIntArray785[anInt10593++] = local8968.method3603(local4177, Static521.aClass20Array13, local19);
												return;
											}
											if (arg0 == 4109) {
												local4177 = aStringArray44[--anInt10591];
												anInt10593 -= 2;
												local19 = anIntArray785[anInt10593];
												local25 = anIntArray785[anInt10593 + 1];
												local8968 = Static512.method7464(Static329.aClass386_78, local25);
												anIntArray785[anInt10593++] = local8968.method3599(Static521.aClass20Array13, local4177, local19);
												return;
											}
											if (arg0 == 4110) {
												anInt10591 -= 2;
												local4177 = aStringArray44[anInt10591];
												local1161 = aStringArray44[anInt10591 + 1];
												if (anIntArray785[--anInt10593] == 1) {
													aStringArray44[anInt10591++] = local4177;
													return;
												}
												aStringArray44[anInt10591++] = local1161;
												return;
											}
											if (arg0 == 4111) {
												local4177 = aStringArray44[--anInt10591];
												aStringArray44[anInt10591++] = Static383.method5698(local4177);
												return;
											}
											if (arg0 == 4112) {
												local4177 = aStringArray44[--anInt10591];
												local19 = anIntArray785[--anInt10593];
												if (local19 == -1) {
													throw new RuntimeException("null char");
												}
												aStringArray44[anInt10591++] = local4177 + (char) local19;
												return;
											}
											if (arg0 == 4113) {
												local13 = anIntArray785[--anInt10593];
												anIntArray785[anInt10593++] = method8836((char) local13);
												return;
											}
											if (arg0 == 4114) {
												local13 = anIntArray785[--anInt10593];
												anIntArray785[anInt10593++] = Static232.method3510((char) local13) ? 1 : 0;
												return;
											}
											if (arg0 == 4115) {
												local13 = anIntArray785[--anInt10593];
												anIntArray785[anInt10593++] = Static538.method7647((char) local13) ? 1 : 0;
												return;
											}
											if (arg0 == 4116) {
												local13 = anIntArray785[--anInt10593];
												anIntArray785[anInt10593++] = Static160.method2607((char) local13) ? 1 : 0;
												return;
											}
											if (arg0 == 4117) {
												local4177 = aStringArray44[--anInt10591];
												if (local4177 != null) {
													anIntArray785[anInt10593++] = local4177.length();
													return;
												}
												anIntArray785[anInt10593++] = 0;
												return;
											}
											if (arg0 == 4118) {
												local4177 = aStringArray44[--anInt10591];
												anInt10593 -= 2;
												local19 = anIntArray785[anInt10593];
												local25 = anIntArray785[anInt10593 + 1];
												aStringArray44[anInt10591++] = local4177.substring(local19, local25);
												return;
											}
											if (arg0 == 4119) {
												local4177 = aStringArray44[--anInt10591];
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
												aStringArray44[anInt10591++] = local9326.toString();
												return;
											}
											if (arg0 == 4120) {
												local4177 = aStringArray44[--anInt10591];
												anInt10593 -= 2;
												local19 = anIntArray785[anInt10593];
												local25 = anIntArray785[anInt10593 + 1];
												anIntArray785[anInt10593++] = local4177.indexOf(local19, local25);
												return;
											}
											if (arg0 == 4121) {
												anInt10591 -= 2;
												local4177 = aStringArray44[anInt10591];
												local1161 = aStringArray44[anInt10591 + 1];
												local25 = anIntArray785[--anInt10593];
												anIntArray785[anInt10593++] = local4177.indexOf(local1161, local25);
												return;
											}
											if (arg0 == 4122) {
												local13 = anIntArray785[--anInt10593];
												anIntArray785[anInt10593++] = Character.toLowerCase((char) local13);
												return;
											}
											if (arg0 == 4123) {
												local13 = anIntArray785[--anInt10593];
												anIntArray785[anInt10593++] = Character.toUpperCase((char) local13);
												return;
											}
											if (arg0 == 4124) {
												local420 = anIntArray785[--anInt10593] != 0;
												local19 = anIntArray785[--anInt10593];
												aStringArray44[anInt10591++] = Static345.method5288(Static232.anInt4258, local420, 0, (long) local19);
												return;
											}
											if (arg0 == 4125) {
												local4177 = aStringArray44[--anInt10591];
												local19 = anIntArray785[--anInt10593];
												@Pc(9549) Class158 local9549 = Static512.method7464(Static329.aClass386_78, local19);
												anIntArray785[anInt10593++] = local9549.method3600(local4177, Static521.aClass20Array13);
												return;
											}
											if (arg0 == 4126) {
												aStringArray44[anInt10591++] = Static16.method8424(Static232.anInt4258, (long) anIntArray785[--anInt10593] * 60000L) + " UTC";
												return;
											}
											if (arg0 == 4127) {
												local8208 = aLongArray22[--anInt10595];
												aStringArray44[anInt10591++] = local8208 == -1L ? "" : Long.toString(local8208, 36).toUpperCase();
												return;
											}
										} else if (arg0 < 4300) {
											if (arg0 == 4200) {
												local13 = anIntArray785[--anInt10593];
												aStringArray44[anInt10591++] = Static175.aClass247_2.method5962(local13).aString9;
												return;
											}
											@Pc(9672) Class27 local9672;
											if (arg0 == 4201) {
												anInt10593 -= 2;
												local13 = anIntArray785[anInt10593];
												local19 = anIntArray785[anInt10593 + 1];
												local9672 = Static175.aClass247_2.method5962(local13);
												if (local19 >= 1 && local19 <= 5 && local9672.aStringArray2[local19 - 1] != null) {
													aStringArray44[anInt10591++] = local9672.aStringArray2[local19 - 1];
													return;
												}
												aStringArray44[anInt10591++] = "";
												return;
											}
											if (arg0 == 4202) {
												anInt10593 -= 2;
												local13 = anIntArray785[anInt10593];
												local19 = anIntArray785[anInt10593 + 1];
												local9672 = Static175.aClass247_2.method5962(local13);
												if (local19 >= 1 && local19 <= 5 && local9672.aStringArray1[local19 - 1] != null) {
													aStringArray44[anInt10591++] = local9672.aStringArray1[local19 - 1];
													return;
												}
												aStringArray44[anInt10591++] = "";
												return;
											}
											if (arg0 == 4203) {
												local13 = anIntArray785[--anInt10593];
												anIntArray785[anInt10593++] = Static175.aClass247_2.method5962(local13).anInt921;
												return;
											}
											if (arg0 == 4204) {
												local13 = anIntArray785[--anInt10593];
												anIntArray785[anInt10593++] = Static175.aClass247_2.method5962(local13).anInt901 == 1 ? 1 : 0;
												return;
											}
											@Pc(9835) Class27 local9835;
											if (arg0 == 4205) {
												local13 = anIntArray785[--anInt10593];
												local9835 = Static175.aClass247_2.method5962(local13);
												if (local9835.anInt916 == -1 && local9835.anInt956 >= 0) {
													anIntArray785[anInt10593++] = local9835.anInt956;
													return;
												}
												anIntArray785[anInt10593++] = local13;
												return;
											}
											if (arg0 == 4206) {
												local13 = anIntArray785[--anInt10593];
												local9835 = Static175.aClass247_2.method5962(local13);
												if (local9835.anInt916 >= 0 && local9835.anInt956 >= 0) {
													anIntArray785[anInt10593++] = local9835.anInt956;
													return;
												}
												anIntArray785[anInt10593++] = local13;
												return;
											}
											if (arg0 == 4207) {
												local13 = anIntArray785[--anInt10593];
												anIntArray785[anInt10593++] = Static175.aClass247_2.method5962(local13).aBoolean72 ? 1 : 0;
												return;
											}
											if (arg0 == 4208) {
												anInt10593 -= 2;
												local13 = anIntArray785[anInt10593];
												local19 = anIntArray785[anInt10593 + 1];
												local3242 = Static217.aClass90_1.method2122(local19);
												if (local3242.method8270()) {
													aStringArray44[anInt10591++] = Static175.aClass247_2.method5962(local13).method804(local19, local3242.aString107);
													return;
												}
												anIntArray785[anInt10593++] = Static175.aClass247_2.method5962(local13).method807(local19, local3242.anInt9931);
												return;
											}
											if (arg0 == 4209) {
												anInt10593 -= 2;
												local13 = anIntArray785[anInt10593];
												local19 = anIntArray785[anInt10593 + 1] - 1;
												local9672 = Static175.aClass247_2.method5962(local13);
												if (local9672.anInt927 == local19) {
													anIntArray785[anInt10593++] = local9672.anInt945;
													return;
												}
												if (local9672.anInt953 == local19) {
													anIntArray785[anInt10593++] = local9672.anInt954;
													return;
												}
												anIntArray785[anInt10593++] = -1;
												return;
											}
											if (arg0 == 4210) {
												local4177 = aStringArray44[--anInt10591];
												local19 = anIntArray785[--anInt10593];
												Static650.method9059(local19 == 1, local4177);
												anIntArray785[anInt10593++] = Static665.anInt4338;
												return;
											}
											if (arg0 == 4211) {
												if (Static550.aShortArray136 != null && Static38.anInt995 < Static665.anInt4338) {
													anIntArray785[anInt10593++] = Static550.aShortArray136[Static38.anInt995++] & 0xFFFF;
													return;
												}
												anIntArray785[anInt10593++] = -1;
												return;
											}
											if (arg0 == 4212) {
												Static38.anInt995 = 0;
												return;
											}
											if (arg0 == 4213) {
												local13 = anIntArray785[--anInt10593];
												anIntArray785[anInt10593++] = Static175.aClass247_2.method5962(local13).anInt958;
												return;
											}
											if (arg0 == 4214) {
												local4177 = aStringArray44[--anInt10591];
												anInt10593 -= 3;
												local19 = anIntArray785[anInt10593];
												local25 = anIntArray785[anInt10593 + 1];
												local357 = anIntArray785[anInt10593 + 2];
												Static337.method5264(local357, local4177, local19 == 1, local25);
												anIntArray785[anInt10593++] = Static665.anInt4338;
												return;
											}
											if (arg0 == 4215) {
												anInt10591 -= 2;
												anInt10593 -= 2;
												local4177 = aStringArray44[anInt10591];
												local19 = anIntArray785[anInt10593];
												local25 = anIntArray785[anInt10593 + 1];
												@Pc(10234) String local10234 = aStringArray44[anInt10591 + 1];
												Static667.method9239(local19 == 1, local10234, local4177, local25);
												anIntArray785[anInt10593++] = Static665.anInt4338;
												return;
											}
										} else if (arg0 < 4400) {
											if (arg0 == 4300) {
												anInt10593 -= 2;
												local13 = anIntArray785[anInt10593];
												local19 = anIntArray785[anInt10593 + 1];
												local3242 = Static217.aClass90_1.method2122(local19);
												if (local3242.method8270()) {
													aStringArray44[anInt10591++] = Static63.aClass37_1.method974(local13).method7132(local3242.aString107, local19);
													return;
												}
												anIntArray785[anInt10593++] = Static63.aClass37_1.method974(local13).method7134(local3242.anInt9931, local19);
												return;
											}
										} else if (arg0 < 4500) {
											if (arg0 == 4400) {
												anInt10593 -= 2;
												local13 = anIntArray785[anInt10593];
												local19 = anIntArray785[anInt10593 + 1];
												local3242 = Static217.aClass90_1.method2122(local19);
												if (local3242.method8270()) {
													aStringArray44[anInt10591++] = Static511.aClass13_2.method86(local13).method5019(local19, local3242.aString107);
													return;
												}
												anIntArray785[anInt10593++] = Static511.aClass13_2.method86(local13).method5016(local3242.anInt9931, local19);
												return;
											}
										} else if (arg0 < 4600) {
											if (arg0 == 4500) {
												anInt10593 -= 2;
												local13 = anIntArray785[anInt10593];
												local19 = anIntArray785[anInt10593 + 1];
												local3242 = Static217.aClass90_1.method2122(local19);
												if (local3242.method8270()) {
													aStringArray44[anInt10591++] = Static296.aClass205_3.method5066(local13).method2345(local3242.aString107, local19);
													return;
												}
												anIntArray785[anInt10593++] = Static296.aClass205_3.method5066(local13).method2348(local3242.anInt9931, local19);
												return;
											}
										} else if (arg0 < 4700) {
											if (arg0 == 4600) {
												local13 = anIntArray785[--anInt10593];
												@Pc(10462) Class132 local10462 = Static110.aClass197_1.method4401(local13);
												if (local10462.anIntArray303 != null && local10462.anIntArray303.length > 0) {
													local25 = 0;
													local357 = local10462.anIntArray306[0];
													for (local2473 = 1; local2473 < local10462.anIntArray303.length; local2473++) {
														if (local10462.anIntArray306[local2473] > local357) {
															local25 = local2473;
															local357 = local10462.anIntArray306[local2473];
														}
													}
													anIntArray785[anInt10593++] = local10462.anIntArray303[local25];
													return;
												}
												anIntArray785[anInt10593++] = local10462.anInt3654;
												return;
											}
										} else if (arg0 < 4800) {
											if (arg0 == 4700) {
												anIntArray785[anInt10593++] = Static573.aBoolean698 ? 1 : 0;
												return;
											}
											if (arg0 == 4701) {
												local4177 = aStringArray44[--anInt10591];
												if (Static430.anInt7691 == 7 && !Static232.method3511()) {
													if (local4177.length() > 20) {
														Static312.aByte88 = -4;
														return;
													}
													Static312.aByte88 = -1;
													local4266 = Static286.method4081(Static205.aClass394_1, Static373.aClass100_93);
													local4266.aClass14_Sub29_Sub1_1.method5854(0);
													local25 = local4266.aClass14_Sub29_Sub1_1.anInt7264;
													local4266.aClass14_Sub29_Sub1_1.method5855(local4177);
													local4266.aClass14_Sub29_Sub1_1.method5853(local4266.aClass14_Sub29_Sub1_1.anInt7264 - local25);
													Static576.method8234(local4266);
													return;
												}
												Static312.aByte88 = -5;
												return;
											}
											if (arg0 == 4702) {
												anIntArray785[anInt10593++] = Static312.aByte88;
												if (Static312.aByte88 != -1) {
													Static312.aByte88 = -6;
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
							local137 = Static655.method9094(anIntArray785[--anInt10593]);
						} else {
							local137 = arg1 ? aClass230_12 : aClass230_11;
						}
						if (arg0 == 1300) {
							local19 = anIntArray785[--anInt10593] - 1;
							if (local19 >= 0 && local19 <= 9) {
								local137.method5460(aStringArray44[--anInt10591], local19);
								return;
							}
							anInt10591--;
							return;
						}
						if (arg0 == 1301) {
							anInt10593 -= 2;
							local19 = anIntArray785[anInt10593];
							local25 = anIntArray785[anInt10593 + 1];
							if (local19 == -1 && local25 == -1) {
								local137.aClass230_6 = null;
								return;
							}
							local137.aClass230_6 = Static572.method8204(local25, local19);
							return;
						}
						if (arg0 == 1302) {
							local19 = anIntArray785[--anInt10593];
							if (local19 != Static200.anInt3718 && local19 != Static452.anInt7936 && local19 != Static46.anInt1125) {
								return;
							}
							local137.anInt6694 = local19;
							return;
						}
						if (arg0 == 1303) {
							local137.anInt6662 = anIntArray785[--anInt10593];
							return;
						}
						if (arg0 == 1304) {
							local137.anInt6664 = anIntArray785[--anInt10593];
							return;
						}
						if (arg0 == 1305) {
							local137.aString71 = aStringArray44[--anInt10591];
							return;
						}
						if (arg0 == 1306) {
							local137.aString74 = aStringArray44[--anInt10591];
							return;
						}
						if (arg0 == 1307) {
							local137.aStringArray23 = null;
							return;
						}
						if (arg0 == 1308) {
							local137.anInt6697 = anIntArray785[--anInt10593];
							local137.anInt6658 = anIntArray785[--anInt10593];
							return;
						}
						if (arg0 == 1309) {
							local19 = anIntArray785[--anInt10593];
							local25 = anIntArray785[--anInt10593];
							if (local25 >= 1 && local25 <= 10) {
								local137.method5469(local25 - 1, local19);
							}
							return;
						}
						if (arg0 == 1310) {
							local137.aString73 = aStringArray44[--anInt10591];
							return;
						}
						if (arg0 == 1311) {
							local137.anInt6716 = anIntArray785[--anInt10593];
							return;
						}
						if (arg0 == 1312 || arg0 == 1313) {
							if (arg0 == 1312) {
								anInt10593 -= 3;
								local19 = anIntArray785[anInt10593] - 1;
								local25 = anIntArray785[anInt10593 + 1];
								local357 = anIntArray785[anInt10593 + 2];
								if (local19 < 0 || local19 > 9) {
									throw new RuntimeException("IOR13121313");
								}
							} else {
								anInt10593 -= 2;
								local19 = 10;
								local25 = anIntArray785[anInt10593];
								local357 = anIntArray785[anInt10593 + 1];
							}
							if (local137.aByteArray78 == null) {
								if (local25 == 0) {
									return;
								}
								local137.aByteArray78 = new byte[11];
								local137.aByteArray77 = new byte[11];
								local137.anIntArray477 = new int[11];
							}
							local137.aByteArray78[local19] = (byte) local25;
							if (local25 == 0) {
								local137.aBoolean476 = false;
								for (local2473 = 0; local2473 < local137.aByteArray78.length; local2473++) {
									if (local137.aByteArray78[local2473] != 0) {
										local137.aBoolean476 = true;
										break;
									}
								}
							} else {
								local137.aBoolean476 = true;
							}
							local137.aByteArray77[local19] = (byte) local357;
							return;
						}
						if (arg0 == 1314) {
							local137.anInt6649 = anIntArray785[--anInt10593];
							return;
						}
					}
				}
			} else {
				if (arg0 >= 2000) {
					arg0 -= 1000;
					local137 = Static655.method9094(anIntArray785[--anInt10593]);
				} else {
					local137 = arg1 ? aClass230_12 : aClass230_11;
				}
				if (arg0 == 1000) {
					anInt10593 -= 4;
					local137.anInt6642 = anIntArray785[anInt10593];
					local137.anInt6699 = anIntArray785[anInt10593 + 1];
					local19 = anIntArray785[anInt10593 + 2];
					if (local19 < 0) {
						local19 = 0;
					} else if (local19 > 5) {
						local19 = 5;
					}
					local25 = anIntArray785[anInt10593 + 3];
					if (local25 < 0) {
						local25 = 0;
					} else if (local25 > 5) {
						local25 = 5;
					}
					local137.aByte107 = (byte) local19;
					local137.aByte105 = (byte) local25;
					Static634.method8860(local137);
					Static514.method7471(local137);
					if (local137.anInt6679 == -1) {
						Static172.method2781(local137.anInt6663);
					}
					return;
				}
				if (arg0 == 1001) {
					anInt10593 -= 4;
					local137.anInt6656 = anIntArray785[anInt10593];
					local137.anInt6684 = anIntArray785[anInt10593 + 1];
					local137.anInt6677 = 0;
					local137.anInt6691 = 0;
					local19 = anIntArray785[anInt10593 + 2];
					if (local19 < 0) {
						local19 = 0;
					} else if (local19 > 4) {
						local19 = 4;
					}
					local25 = anIntArray785[anInt10593 + 3];
					if (local25 < 0) {
						local25 = 0;
					} else if (local25 > 4) {
						local25 = 4;
					}
					local137.aByte106 = (byte) local19;
					local137.aByte108 = (byte) local25;
					Static634.method8860(local137);
					Static514.method7471(local137);
					if (local137.anInt6660 == 0) {
						Static163.method2629(local137, false);
					}
					return;
				}
				if (arg0 == 1003) {
					@Pc(661) boolean local661 = anIntArray785[--anInt10593] == 1;
					if (local137.aBoolean475 != local661) {
						local137.aBoolean475 = local661;
						Static634.method8860(local137);
					}
					if (local137.anInt6679 == -1) {
						Static623.method8749(local137.anInt6663);
					}
					return;
				}
				if (arg0 == 1004) {
					anInt10593 -= 2;
					local137.anInt6669 = anIntArray785[anInt10593];
					local137.anInt6707 = anIntArray785[anInt10593 + 1];
					Static634.method8860(local137);
					Static514.method7471(local137);
					if (local137.anInt6660 == 0) {
						Static163.method2629(local137, false);
					}
					return;
				}
				if (arg0 == 1005) {
					local137.aBoolean473 = anIntArray785[--anInt10593] == 1;
					return;
				}
			}
		}
		throw new IllegalStateException(String.valueOf(arg0));
	}

	@OriginalMember(owner = "client!vh", name = "b", descriptor = "(IZ)V")
	private static void method8828(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1) {
		@Pc(52) Class14_Sub19 local52;
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
				anIntArray785[anInt10593++] = Static107.anInt2234;
				return;
			}
			if (arg0 == 5001) {
				anInt10593 -= 3;
				Static107.anInt2234 = anIntArray785[anInt10593];
				Static88.aClass372_11 = Static30.method691(anIntArray785[anInt10593 + 1]);
				if (Static88.aClass372_11 == null) {
					Static88.aClass372_11 = Static160.aClass372_6;
				}
				Static545.anInt9311 = anIntArray785[anInt10593 + 2];
				local52 = Static286.method4081(Static205.aClass394_1, Static319.aClass100_83);
				local52.aClass14_Sub29_Sub1_1.method5854(Static107.anInt2234);
				local52.aClass14_Sub29_Sub1_1.method5854(Static88.aClass372_11.anInt10652);
				local52.aClass14_Sub29_Sub1_1.method5854(Static545.anInt9311);
				Static576.method8234(local52);
				return;
			}
			if (arg0 == 5002) {
				anInt10591 -= 2;
				local83 = aStringArray44[anInt10591];
				local89 = aStringArray44[anInt10591 + 1];
				anInt10593 -= 2;
				local97 = anIntArray785[anInt10593];
				local103 = anIntArray785[anInt10593 + 1];
				if (local89 == null) {
					local89 = "";
				}
				if (local89.length() > 80) {
					local89 = local89.substring(0, 80);
				}
				@Pc(125) Class14_Sub19 local125 = Static286.method4081(Static205.aClass394_1, Static133.aClass100_37);
				local125.aClass14_Sub29_Sub1_1.method5854(Static651.method9066(local83) + Static651.method9066(local89) + 2);
				local125.aClass14_Sub29_Sub1_1.method5855(local83);
				local125.aClass14_Sub29_Sub1_1.method5854(local97 - 1);
				local125.aClass14_Sub29_Sub1_1.method5854(local103);
				local125.aClass14_Sub29_Sub1_1.method5855(local89);
				Static576.method8234(local125);
				return;
			}
			@Pc(179) Class175 local179;
			if (arg0 == 5003) {
				local175 = anIntArray785[--anInt10593];
				local179 = Static386.method5772(local175);
				local181 = "";
				if (local179 != null && local179.aString53 != null) {
					local181 = local179.aString53;
				}
				aStringArray44[anInt10591++] = local181;
				return;
			}
			if (arg0 == 5004) {
				local175 = anIntArray785[--anInt10593];
				local179 = Static386.method5772(local175);
				local97 = -1;
				if (local179 != null) {
					local97 = local179.anInt4612;
				}
				anIntArray785[anInt10593++] = local97;
				return;
			}
			if (arg0 == 5005) {
				if (Static88.aClass372_11 == null) {
					anIntArray785[anInt10593++] = -1;
					return;
				}
				anIntArray785[anInt10593++] = Static88.aClass372_11.anInt10652;
				return;
			}
			@Pc(269) Class14_Sub19 local269;
			if (arg0 == 5006) {
				local175 = anIntArray785[--anInt10593];
				local269 = Static286.method4081(Static205.aClass394_1, Static655.aClass100_140);
				local269.aClass14_Sub29_Sub1_1.method5854(local175);
				Static576.method8234(local269);
				return;
			}
			if (arg0 == 5008) {
				local83 = aStringArray44[--anInt10591];
				method8825(local83, arg0);
				return;
			}
			if (arg0 == 5009) {
				anInt10591 -= 2;
				local83 = aStringArray44[anInt10591];
				local89 = aStringArray44[anInt10591 + 1];
				if (Static447.anInt10238 != 0 || (!Static13.aBoolean12 || Static47.aBoolean97) && !Static154.aBoolean234) {
					@Pc(328) Class14_Sub19 local328 = Static286.method4081(Static205.aClass394_1, Static171.aClass100_50);
					local328.aClass14_Sub29_Sub1_1.method5854(0);
					local103 = local328.aClass14_Sub29_Sub1_1.anInt7264;
					local328.aClass14_Sub29_Sub1_1.method5855(local83);
					Static40.method1450(local89, local328.aClass14_Sub29_Sub1_1);
					local328.aClass14_Sub29_Sub1_1.method5853(local328.aClass14_Sub29_Sub1_1.anInt7264 - local103);
					Static576.method8234(local328);
					return;
				}
				return;
			}
			if (arg0 == 5010) {
				local175 = anIntArray785[--anInt10593];
				local179 = Static386.method5772(local175);
				local181 = "";
				if (local179 != null && local179.aString54 != null) {
					local181 = local179.aString54;
				}
				aStringArray44[anInt10591++] = local181;
				return;
			}
			if (arg0 == 5011) {
				local175 = anIntArray785[--anInt10593];
				local179 = Static386.method5772(local175);
				local181 = "";
				if (local179 != null && local179.aString51 != null) {
					local181 = local179.aString51;
				}
				aStringArray44[anInt10591++] = local181;
				return;
			}
			if (arg0 == 5012) {
				local175 = anIntArray785[--anInt10593];
				local179 = Static386.method5772(local175);
				local97 = -1;
				if (local179 != null) {
					local97 = local179.anInt4611;
				}
				anIntArray785[anInt10593++] = local97;
				return;
			}
			if (arg0 == 5015) {
				if (Static657.aClass12_Sub2_Sub2_Sub1_Sub2_2 == null || Static657.aClass12_Sub2_Sub2_Sub1_Sub2_2.aString34 == null) {
					local83 = "";
				} else {
					local83 = Static657.aClass12_Sub2_Sub2_Sub1_Sub2_2.method2440();
				}
				aStringArray44[anInt10591++] = local83;
				return;
			}
			if (arg0 == 5016) {
				anIntArray785[anInt10593++] = Static545.anInt9311;
				return;
			}
			if (arg0 == 5017) {
				anIntArray785[anInt10593++] = Static446.method6500();
				return;
			}
			if (arg0 == 5018) {
				local175 = anIntArray785[--anInt10593];
				local179 = Static386.method5772(local175);
				local97 = 0;
				if (local179 != null) {
					local97 = local179.anInt4606;
				}
				anIntArray785[anInt10593++] = local97;
				return;
			}
			if (arg0 == 5019) {
				local175 = anIntArray785[--anInt10593];
				local179 = Static386.method5772(local175);
				local181 = "";
				if (local179 != null && local179.aString50 != null) {
					local181 = local179.aString50;
				}
				aStringArray44[anInt10591++] = local181;
				return;
			}
			if (arg0 == 5020) {
				if (Static657.aClass12_Sub2_Sub2_Sub1_Sub2_2 == null || Static657.aClass12_Sub2_Sub2_Sub1_Sub2_2.aString34 == null) {
					local83 = "";
				} else {
					local83 = Static657.aClass12_Sub2_Sub2_Sub1_Sub2_2.method2443();
				}
				aStringArray44[anInt10591++] = local83;
				return;
			}
			if (arg0 == 5023) {
				local175 = anIntArray785[--anInt10593];
				local179 = Static386.method5772(local175);
				local97 = -1;
				if (local179 != null) {
					local97 = local179.anInt4610;
				}
				anIntArray785[anInt10593++] = local97;
				return;
			}
			if (arg0 == 5024) {
				local175 = anIntArray785[--anInt10593];
				local179 = Static386.method5772(local175);
				local97 = -1;
				if (local179 != null) {
					local97 = local179.anInt4608;
				}
				anIntArray785[anInt10593++] = local97;
				return;
			}
			if (arg0 == 5025) {
				local175 = anIntArray785[--anInt10593];
				local179 = Static386.method5772(local175);
				local181 = "";
				if (local179 != null && local179.aString52 != null) {
					local181 = local179.aString52;
				}
				aStringArray44[anInt10591++] = local181;
				return;
			}
			if (arg0 == 5050) {
				local175 = anIntArray785[--anInt10593];
				aStringArray44[anInt10591++] = Static180.aClass122_1.method2909(local175).aString112;
				return;
			}
			@Pc(736) Class14_Sub3_Sub18 local736;
			if (arg0 == 5051) {
				local175 = anIntArray785[--anInt10593];
				local736 = Static180.aClass122_1.method2909(local175);
				if (local736.anIntArray743 == null) {
					anIntArray785[anInt10593++] = 0;
					return;
				}
				anIntArray785[anInt10593++] = local736.anIntArray743.length;
				return;
			}
			if (arg0 == 5052) {
				anInt10593 -= 2;
				local175 = anIntArray785[anInt10593];
				local776 = anIntArray785[anInt10593 + 1];
				@Pc(781) Class14_Sub3_Sub18 local781 = Static180.aClass122_1.method2909(local175);
				local103 = local781.anIntArray743[local776];
				anIntArray785[anInt10593++] = local103;
				return;
			}
			if (arg0 == 5053) {
				local175 = anIntArray785[--anInt10593];
				local736 = Static180.aClass122_1.method2909(local175);
				if (local736.anIntArray742 == null) {
					anIntArray785[anInt10593++] = 0;
					return;
				}
				anIntArray785[anInt10593++] = local736.anIntArray742.length;
				return;
			}
			if (arg0 == 5054) {
				anInt10593 -= 2;
				local175 = anIntArray785[anInt10593];
				local776 = anIntArray785[anInt10593 + 1];
				anIntArray785[anInt10593++] = Static180.aClass122_1.method2909(local175).anIntArray742[local776];
				return;
			}
			if (arg0 == 5055) {
				local175 = anIntArray785[--anInt10593];
				aStringArray44[anInt10591++] = Static526.aClass266_1.method6436(local175).method8787();
				return;
			}
			if (arg0 == 5056) {
				local175 = anIntArray785[--anInt10593];
				@Pc(907) Class14_Sub3_Sub20 local907 = Static526.aClass266_1.method6436(local175);
				if (local907.anIntArray777 == null) {
					anIntArray785[anInt10593++] = 0;
					return;
				}
				anIntArray785[anInt10593++] = local907.anIntArray777.length;
				return;
			}
			if (arg0 == 5057) {
				anInt10593 -= 2;
				local175 = anIntArray785[anInt10593];
				local776 = anIntArray785[anInt10593 + 1];
				anIntArray785[anInt10593++] = Static526.aClass266_1.method6436(local175).anIntArray777[local776];
				return;
			}
			if (arg0 == 5058) {
				aClass207_1 = new Class207();
				aClass207_1.anInt6123 = anIntArray785[--anInt10593];
				aClass207_1.aClass14_Sub3_Sub20_1 = Static526.aClass266_1.method6436(aClass207_1.anInt6123);
				aClass207_1.anIntArray447 = new int[aClass207_1.aClass14_Sub3_Sub20_1.method8786()];
				return;
			}
			if (arg0 == 5059) {
				local52 = Static286.method4081(Static205.aClass394_1, Static132.aClass100_36);
				local52.aClass14_Sub29_Sub1_1.method5854(0);
				local776 = local52.aClass14_Sub29_Sub1_1.anInt7264;
				local52.aClass14_Sub29_Sub1_1.method5854(0);
				local52.aClass14_Sub29_Sub1_1.method5859(aClass207_1.anInt6123);
				aClass207_1.aClass14_Sub3_Sub20_1.method8791(aClass207_1.anIntArray447, local52.aClass14_Sub29_Sub1_1);
				local52.aClass14_Sub29_Sub1_1.method5853(local52.aClass14_Sub29_Sub1_1.anInt7264 - local776);
				Static576.method8234(local52);
				return;
			}
			if (arg0 == 5060) {
				local83 = aStringArray44[--anInt10591];
				local269 = Static286.method4081(Static205.aClass394_1, Static514.aClass100_109);
				local269.aClass14_Sub29_Sub1_1.method5854(0);
				local97 = local269.aClass14_Sub29_Sub1_1.anInt7264;
				local269.aClass14_Sub29_Sub1_1.method5855(local83);
				local269.aClass14_Sub29_Sub1_1.method5859(aClass207_1.anInt6123);
				aClass207_1.aClass14_Sub3_Sub20_1.method8791(aClass207_1.anIntArray447, local269.aClass14_Sub29_Sub1_1);
				local269.aClass14_Sub29_Sub1_1.method5853(local269.aClass14_Sub29_Sub1_1.anInt7264 - local97);
				Static576.method8234(local269);
				return;
			}
			if (arg0 == 5061) {
				local52 = Static286.method4081(Static205.aClass394_1, Static132.aClass100_36);
				local52.aClass14_Sub29_Sub1_1.method5854(0);
				local776 = local52.aClass14_Sub29_Sub1_1.anInt7264;
				local52.aClass14_Sub29_Sub1_1.method5854(1);
				local52.aClass14_Sub29_Sub1_1.method5859(aClass207_1.anInt6123);
				aClass207_1.aClass14_Sub3_Sub20_1.method8791(aClass207_1.anIntArray447, local52.aClass14_Sub29_Sub1_1);
				local52.aClass14_Sub29_Sub1_1.method5853(local52.aClass14_Sub29_Sub1_1.anInt7264 - local776);
				Static576.method8234(local52);
				return;
			}
			if (arg0 == 5062) {
				anInt10593 -= 2;
				local175 = anIntArray785[anInt10593];
				local776 = anIntArray785[anInt10593 + 1];
				anIntArray785[anInt10593++] = Static180.aClass122_1.method2909(local175).aCharArray6[local776];
				return;
			}
			if (arg0 == 5063) {
				anInt10593 -= 2;
				local175 = anIntArray785[anInt10593];
				local776 = anIntArray785[anInt10593 + 1];
				anIntArray785[anInt10593++] = Static180.aClass122_1.method2909(local175).aCharArray7[local776];
				return;
			}
			if (arg0 == 5064) {
				anInt10593 -= 2;
				local175 = anIntArray785[anInt10593];
				local776 = anIntArray785[anInt10593 + 1];
				if (local776 == -1) {
					anIntArray785[anInt10593++] = -1;
					return;
				}
				anIntArray785[anInt10593++] = Static180.aClass122_1.method2909(local175).method8507((char) local776);
				return;
			}
			if (arg0 == 5065) {
				anInt10593 -= 2;
				local175 = anIntArray785[anInt10593];
				local776 = anIntArray785[anInt10593 + 1];
				if (local776 == -1) {
					anIntArray785[anInt10593++] = -1;
					return;
				}
				anIntArray785[anInt10593++] = Static180.aClass122_1.method2909(local175).method8508((char) local776);
				return;
			}
			if (arg0 == 5066) {
				local175 = anIntArray785[--anInt10593];
				anIntArray785[anInt10593++] = Static526.aClass266_1.method6436(local175).method8786();
				return;
			}
			if (arg0 == 5067) {
				anInt10593 -= 2;
				local175 = anIntArray785[anInt10593];
				local776 = anIntArray785[anInt10593 + 1];
				local97 = Static526.aClass266_1.method6436(local175).method8784(local776).anInt10184;
				anIntArray785[anInt10593++] = local97;
				return;
			}
			if (arg0 == 5068) {
				anInt10593 -= 2;
				local175 = anIntArray785[anInt10593];
				local776 = anIntArray785[anInt10593 + 1];
				aClass207_1.anIntArray447[local175] = local776;
				return;
			}
			if (arg0 == 5069) {
				anInt10593 -= 2;
				local175 = anIntArray785[anInt10593];
				local776 = anIntArray785[anInt10593 + 1];
				aClass207_1.anIntArray447[local175] = local776;
				return;
			}
			if (arg0 == 5070) {
				anInt10593 -= 3;
				local175 = anIntArray785[anInt10593];
				local776 = anIntArray785[anInt10593 + 1];
				local97 = anIntArray785[anInt10593 + 2];
				@Pc(1448) Class14_Sub3_Sub20 local1448 = Static526.aClass266_1.method6436(local175);
				if (local1448.method8784(local776).anInt10184 != 0) {
					throw new RuntimeException("bad command");
				}
				anIntArray785[anInt10593++] = local1448.method8793(local776, local97);
				return;
			}
			if (arg0 == 5071) {
				local83 = aStringArray44[--anInt10591];
				local1496 = anIntArray785[--anInt10593] == 1;
				Static73.method1383(local83, local1496);
				anIntArray785[anInt10593++] = Static665.anInt4338;
				return;
			}
			if (arg0 == 5072) {
				if (Static550.aShortArray136 != null && Static38.anInt995 < Static665.anInt4338) {
					anIntArray785[anInt10593++] = Static550.aShortArray136[Static38.anInt995++] & 0xFFFF;
					return;
				}
				anIntArray785[anInt10593++] = -1;
				return;
			}
			if (arg0 == 5073) {
				Static38.anInt995 = 0;
				return;
			}
			if (arg0 == 5074) {
				local52 = Static286.method4081(Static205.aClass394_1, Static132.aClass100_36);
				local52.aClass14_Sub29_Sub1_1.method5854(0);
				local776 = local52.aClass14_Sub29_Sub1_1.anInt7264;
				local52.aClass14_Sub29_Sub1_1.method5854(2);
				local52.aClass14_Sub29_Sub1_1.method5859(aClass207_1.anInt6123);
				aClass207_1.aClass14_Sub3_Sub20_1.method8791(aClass207_1.anIntArray447, local52.aClass14_Sub29_Sub1_1);
				local52.aClass14_Sub29_Sub1_1.method5853(local52.aClass14_Sub29_Sub1_1.anInt7264 - local776);
				Static576.method8234(local52);
				return;
			}
			if (arg0 == 5075) {
				local52 = Static286.method4081(Static205.aClass394_1, Static132.aClass100_36);
				local52.aClass14_Sub29_Sub1_1.method5854(0);
				local776 = local52.aClass14_Sub29_Sub1_1.anInt7264;
				local52.aClass14_Sub29_Sub1_1.method5854(3);
				local52.aClass14_Sub29_Sub1_1.method5859(aClass207_1.anInt6123);
				aClass207_1.aClass14_Sub3_Sub20_1.method8791(aClass207_1.anIntArray447, local52.aClass14_Sub29_Sub1_1);
				local52.aClass14_Sub29_Sub1_1.method5853(local52.aClass14_Sub29_Sub1_1.anInt7264 - local776);
				Static576.method8234(local52);
				return;
			}
		} else if (arg0 < 5200) {
			if (arg0 == 5100) {
				if (Static68.aClass65_1.method1565(86)) {
					anIntArray785[anInt10593++] = 1;
					return;
				}
				anIntArray785[anInt10593++] = 0;
				return;
			}
			if (arg0 == 5101) {
				if (Static68.aClass65_1.method1565(82)) {
					anIntArray785[anInt10593++] = 1;
					return;
				}
				anIntArray785[anInt10593++] = 0;
				return;
			}
			if (arg0 == 5102) {
				if (Static68.aClass65_1.method1565(81)) {
					anIntArray785[anInt10593++] = 1;
					return;
				}
				anIntArray785[anInt10593++] = 0;
				return;
			}
		} else {
			@Pc(2931) int local2931;
			@Pc(2205) boolean local2205;
			if (arg0 < 5300) {
				if (arg0 == 5200) {
					Static345.method5295(anIntArray785[--anInt10593]);
					return;
				}
				if (arg0 == 5201) {
					anIntArray785[anInt10593++] = Static89.method1690();
					return;
				}
				if (arg0 == 5205) {
					Static518.method8570(-1, anIntArray785[--anInt10593], -1, false);
					return;
				}
				@Pc(1794) Class14_Sub3_Sub16 local1794;
				if (arg0 == 5206) {
					local175 = anIntArray785[--anInt10593];
					local1794 = Static498.method7294(local175 >> 14 & 0x3FFF, local175 & 0x3FFF);
					if (local1794 == null) {
						anIntArray785[anInt10593++] = -1;
						return;
					}
					anIntArray785[anInt10593++] = local1794.anInt9283;
					return;
				}
				@Pc(1827) Class14_Sub3_Sub16 local1827;
				if (arg0 == 5207) {
					local1827 = Static498.method7295(anIntArray785[--anInt10593]);
					if (local1827 != null && local1827.aString91 != null) {
						aStringArray44[anInt10591++] = local1827.aString91;
						return;
					}
					aStringArray44[anInt10591++] = "";
					return;
				}
				if (arg0 == 5208) {
					anIntArray785[anInt10593++] = Static17.anInt218;
					anIntArray785[anInt10593++] = Static461.anInt8097;
					return;
				}
				if (arg0 == 5209) {
					anIntArray785[anInt10593++] = Static397.anInt7311 + Static498.anInt8795;
					anIntArray785[anInt10593++] = Static517.anInt9046 + Static498.anInt8796;
					return;
				}
				if (arg0 == 5210) {
					local175 = anIntArray785[--anInt10593];
					local1794 = Static498.method7295(local175);
					if (local1794 == null) {
						anIntArray785[anInt10593++] = 0;
						anIntArray785[anInt10593++] = 0;
						return;
					}
					anIntArray785[anInt10593++] = local1794.anInt9282 >> 14 & 0x3FFF;
					anIntArray785[anInt10593++] = local1794.anInt9282 & 0x3FFF;
					return;
				}
				if (arg0 == 5211) {
					local175 = anIntArray785[--anInt10593];
					local1794 = Static498.method7295(local175);
					if (local1794 == null) {
						anIntArray785[anInt10593++] = 0;
						anIntArray785[anInt10593++] = 0;
						return;
					}
					anIntArray785[anInt10593++] = local1794.anInt9296 - local1794.anInt9287;
					anIntArray785[anInt10593++] = local1794.anInt9284 - local1794.anInt9293;
					return;
				}
				@Pc(2017) Class14_Sub46 local2017;
				if (arg0 == 5212) {
					local2017 = Static456.method6583();
					if (local2017 == null) {
						anIntArray785[anInt10593++] = -1;
						anIntArray785[anInt10593++] = -1;
						return;
					}
					anIntArray785[anInt10593++] = local2017.anInt8309;
					local776 = local2017.anInt8311 << 28 | local2017.anInt8308 + Static498.anInt8795 << 14 | local2017.anInt8307 + Static498.anInt8796;
					anIntArray785[anInt10593++] = local776;
					return;
				}
				if (arg0 == 5213) {
					local2017 = Static330.method5180();
					if (local2017 == null) {
						anIntArray785[anInt10593++] = -1;
						anIntArray785[anInt10593++] = -1;
						return;
					}
					anIntArray785[anInt10593++] = local2017.anInt8309;
					local776 = local2017.anInt8311 << 28 | local2017.anInt8308 + Static498.anInt8795 << 14 | local2017.anInt8307 + Static498.anInt8796;
					anIntArray785[anInt10593++] = local776;
					return;
				}
				@Pc(2165) boolean local2165;
				if (arg0 == 5214) {
					local175 = anIntArray785[--anInt10593];
					local1794 = Static126.method2098();
					if (local1794 != null) {
						local2165 = local1794.method7676(anIntArray783, local175 >> 14 & 0x3FFF, local175 >> 28 & 0x3, local175 & 0x3FFF);
						if (local2165) {
							Static676.method9296(anIntArray783[1], anIntArray783[2]);
						}
					}
					return;
				}
				if (arg0 == 5215) {
					anInt10593 -= 2;
					local175 = anIntArray785[anInt10593];
					local776 = anIntArray785[anInt10593 + 1];
					@Pc(2203) Class73 local2203 = Static498.method7300(local175 >> 14 & 0x3FFF, local175 & 0x3FFF);
					local2205 = false;
					for (@Pc(2210) Class14_Sub3_Sub16 local2210 = (Class14_Sub3_Sub16) local2203.method1826(); local2210 != null; local2210 = (Class14_Sub3_Sub16) local2203.method1827()) {
						if (local2210.anInt9283 == local776) {
							local2205 = true;
							break;
						}
					}
					if (local2205) {
						anIntArray785[anInt10593++] = 1;
						return;
					}
					anIntArray785[anInt10593++] = 0;
					return;
				}
				if (arg0 == 5218) {
					local175 = anIntArray785[--anInt10593];
					local1794 = Static498.method7295(local175);
					if (local1794 == null) {
						anIntArray785[anInt10593++] = -1;
						return;
					}
					anIntArray785[anInt10593++] = local1794.anInt9281;
					return;
				}
				if (arg0 == 5220) {
					anIntArray785[anInt10593++] = Static156.anInt3087 == 100 ? 1 : 0;
					return;
				}
				if (arg0 == 5221) {
					local175 = anIntArray785[--anInt10593];
					Static676.method9296(local175 >> 14 & 0x3FFF, local175 & 0x3FFF);
					return;
				}
				if (arg0 == 5222) {
					local1827 = Static126.method2098();
					if (local1827 != null) {
						local1496 = local1827.method7674(Static397.anInt7311 + Static498.anInt8795, anIntArray783, Static517.anInt9046 + Static498.anInt8796);
						if (local1496) {
							anIntArray785[anInt10593++] = anIntArray783[1];
							anIntArray785[anInt10593++] = anIntArray783[2];
							return;
						}
						anIntArray785[anInt10593++] = -1;
						anIntArray785[anInt10593++] = -1;
						return;
					}
					anIntArray785[anInt10593++] = -1;
					anIntArray785[anInt10593++] = -1;
					return;
				}
				if (arg0 == 5223) {
					anInt10593 -= 2;
					local175 = anIntArray785[anInt10593];
					local776 = anIntArray785[anInt10593 + 1];
					Static518.method8570(local776 & 0x3FFF, local175, local776 >> 14 & 0x3FFF, false);
					return;
				}
				if (arg0 == 5224) {
					local175 = anIntArray785[--anInt10593];
					local1794 = Static126.method2098();
					if (local1794 != null) {
						local2165 = local1794.method7676(anIntArray783, local175 >> 14 & 0x3FFF, local175 >> 28 & 0x3, local175 & 0x3FFF);
						if (local2165) {
							anIntArray785[anInt10593++] = anIntArray783[1];
							anIntArray785[anInt10593++] = anIntArray783[2];
							return;
						}
						anIntArray785[anInt10593++] = -1;
						anIntArray785[anInt10593++] = -1;
						return;
					}
					anIntArray785[anInt10593++] = -1;
					anIntArray785[anInt10593++] = -1;
					return;
				}
				if (arg0 == 5225) {
					local175 = anIntArray785[--anInt10593];
					local1794 = Static126.method2098();
					if (local1794 != null) {
						local2165 = local1794.method7674(local175 >> 14 & 0x3FFF, anIntArray783, local175 & 0x3FFF);
						if (local2165) {
							anIntArray785[anInt10593++] = anIntArray783[1];
							anIntArray785[anInt10593++] = anIntArray783[2];
							return;
						}
						anIntArray785[anInt10593++] = -1;
						anIntArray785[anInt10593++] = -1;
						return;
					}
					anIntArray785[anInt10593++] = -1;
					anIntArray785[anInt10593++] = -1;
					return;
				}
				if (arg0 == 5226) {
					Static47.method970(anIntArray785[--anInt10593]);
					return;
				}
				if (arg0 == 5227) {
					anInt10593 -= 2;
					local175 = anIntArray785[anInt10593];
					local776 = anIntArray785[anInt10593 + 1];
					Static518.method8570(local776 & 0x3FFF, local175, local776 >> 14 & 0x3FFF, true);
					return;
				}
				if (arg0 == 5228) {
					Static285.aBoolean333 = anIntArray785[--anInt10593] == 1;
					return;
				}
				if (arg0 == 5229) {
					anIntArray785[anInt10593++] = Static285.aBoolean333 ? 1 : 0;
					return;
				}
				if (arg0 == 5230) {
					local175 = anIntArray785[--anInt10593];
					Static226.method5392(local175);
					return;
				}
				@Pc(2723) Class14 local2723;
				if (arg0 == 5231) {
					anInt10593 -= 2;
					local175 = anIntArray785[anInt10593];
					local1496 = anIntArray785[anInt10593 + 1] == 1;
					if (Static7.aClass187_1 != null) {
						local2723 = Static7.aClass187_1.method4078((long) local175);
						if (local2723 != null && !local1496) {
							local2723.method9315();
							return;
						}
						if (local2723 == null && local1496) {
							local2723 = new Class14();
							Static7.aClass187_1.method4077((long) local175, local2723);
						}
					}
					return;
				}
				@Pc(2765) Class14 local2765;
				if (arg0 == 5232) {
					local175 = anIntArray785[--anInt10593];
					if (Static7.aClass187_1 != null) {
						local2765 = Static7.aClass187_1.method4078((long) local175);
						anIntArray785[anInt10593++] = local2765 == null ? 0 : 1;
						return;
					}
					anIntArray785[anInt10593++] = 0;
					return;
				}
				if (arg0 == 5233) {
					anInt10593 -= 2;
					local175 = anIntArray785[anInt10593];
					local1496 = anIntArray785[anInt10593 + 1] == 1;
					if (Static38.aClass187_7 != null) {
						local2723 = Static38.aClass187_7.method4078((long) local175);
						if (local2723 != null && !local1496) {
							local2723.method9315();
							return;
						}
						if (local2723 == null && local1496) {
							local2723 = new Class14();
							Static38.aClass187_7.method4077((long) local175, local2723);
						}
					}
					return;
				}
				if (arg0 == 5234) {
					local175 = anIntArray785[--anInt10593];
					if (Static38.aClass187_7 != null) {
						local2765 = Static38.aClass187_7.method4078((long) local175);
						anIntArray785[anInt10593++] = local2765 == null ? 0 : 1;
						return;
					}
					anIntArray785[anInt10593++] = 0;
					return;
				}
				if (arg0 == 5235) {
					anIntArray785[anInt10593++] = Static498.aClass14_Sub3_Sub16_3 == null ? -1 : Static498.aClass14_Sub3_Sub16_3.anInt9283;
					return;
				}
				if (arg0 == 5236) {
					anInt10593 -= 2;
					local175 = anIntArray785[anInt10593];
					local776 = anIntArray785[anInt10593 + 1];
					local97 = local776 >> 14 & 0x3FFF;
					local103 = local776 & 0x3FFF;
					local2931 = Static500.method7346(local175, local103, local97);
					if (local2931 < 0) {
						anIntArray785[anInt10593++] = -1;
						return;
					}
					anIntArray785[anInt10593++] = local2931;
					return;
				}
				if (arg0 == 5237) {
					Static503.method7355();
					return;
				}
			} else if (arg0 < 5400) {
				if (arg0 == 5300) {
					anInt10593 -= 2;
					local175 = anIntArray785[anInt10593];
					local776 = anIntArray785[anInt10593 + 1];
					Static437.method6438(local175, local776, false, 3);
					anIntArray785[anInt10593++] = Static628.aFrame3 == null ? 0 : 1;
					return;
				}
				if (arg0 == 5301) {
					if (Static628.aFrame3 != null) {
						Static437.method6438(-1, -1, false, Static56.aClass14_Sub22_5.aClass21_Sub15_2.method5081());
					}
					return;
				}
				if (arg0 == 5302) {
					@Pc(3017) Class235[] local3017 = Static667.method9241();
					anIntArray785[anInt10593++] = local3017.length;
					return;
				}
				if (arg0 == 5303) {
					local175 = anIntArray785[--anInt10593];
					@Pc(3041) Class235[] local3041 = Static667.method9241();
					anIntArray785[anInt10593++] = local3041[local175].anInt6838;
					anIntArray785[anInt10593++] = local3041[local175].anInt6833;
					return;
				}
				if (arg0 == 5305) {
					local175 = Static398.anInt7332;
					local776 = Static383.anInt7041;
					local97 = -1;
					@Pc(3076) Class235[] local3076 = Static667.method9241();
					for (local2931 = 0; local2931 < local3076.length; local2931++) {
						@Pc(3083) Class235 local3083 = local3076[local2931];
						if (local3083.anInt6838 == local175 && local3083.anInt6833 == local776) {
							local97 = local2931;
							break;
						}
					}
					anIntArray785[anInt10593++] = local97;
					return;
				}
				if (arg0 == 5306) {
					anIntArray785[anInt10593++] = Static482.method7137();
					return;
				}
				if (arg0 == 5307) {
					local175 = anIntArray785[--anInt10593];
					if (local175 >= 1 && local175 <= 2) {
						Static437.method6438(-1, -1, false, local175);
						return;
					}
					return;
				}
				if (arg0 == 5308) {
					anIntArray785[anInt10593++] = Static56.aClass14_Sub22_5.aClass21_Sub15_2.method5081();
					return;
				}
				if (arg0 == 5309) {
					local175 = anIntArray785[--anInt10593];
					if (local175 >= 1 && local175 <= 2) {
						Static56.aClass14_Sub22_5.method3012(Static56.aClass14_Sub22_5.aClass21_Sub15_2, local175);
						Static56.aClass14_Sub22_5.method3012(Static56.aClass14_Sub22_5.aClass21_Sub15_1, local175);
						Static169.method2762();
						return;
					}
					return;
				}
			} else {
				@Pc(3369) int local3369;
				if (arg0 < 5500) {
					if (arg0 == 5400) {
						anInt10591 -= 2;
						local83 = aStringArray44[anInt10591];
						local89 = aStringArray44[anInt10591 + 1];
						local97 = anIntArray785[--anInt10593];
						@Pc(3231) Class14_Sub19 local3231 = Static286.method4081(Static205.aClass394_1, Static126.aClass100_34);
						local3231.aClass14_Sub29_Sub1_1.method5854(Static651.method9066(local83) + Static651.method9066(local89) + 1);
						local3231.aClass14_Sub29_Sub1_1.method5855(local83);
						local3231.aClass14_Sub29_Sub1_1.method5855(local89);
						local3231.aClass14_Sub29_Sub1_1.method5854(local97);
						Static576.method8234(local3231);
						return;
					}
					if (arg0 == 5401) {
						anInt10593 -= 2;
						Static129.aShortArray105[anIntArray785[anInt10593]] = (short) Static532.method7621(anIntArray785[anInt10593 + 1]);
						Static175.aClass247_2.method5961();
						Static175.aClass247_2.method5953();
						Static63.aClass37_1.method972();
						Static31.method720();
						return;
					}
					if (arg0 == 5405) {
						anInt10593 -= 2;
						local175 = anIntArray785[anInt10593];
						local776 = anIntArray785[anInt10593 + 1];
						if (local175 >= 0 && local175 < 2) {
							Static546.anIntArrayArrayArray20[local175] = new int[local776 << 1][4];
						}
						return;
					}
					if (arg0 == 5406) {
						anInt10593 -= 7;
						local175 = anIntArray785[anInt10593];
						local776 = anIntArray785[anInt10593 + 1] << 1;
						local97 = anIntArray785[anInt10593 + 2];
						local103 = anIntArray785[anInt10593 + 3];
						local2931 = anIntArray785[anInt10593 + 4];
						local3369 = anIntArray785[anInt10593 + 5];
						@Pc(3375) int local3375 = anIntArray785[anInt10593 + 6];
						if (local175 >= 0 && local175 < 2 && Static546.anIntArrayArrayArray20[local175] != null && local776 >= 0 && local776 < Static546.anIntArrayArrayArray20[local175].length) {
							Static546.anIntArrayArrayArray20[local175][local776] = new int[] { (local97 >> 14 & 0x3FFF) << 9, local103 << 2, (local97 & 0x3FFF) << 9, local3375 };
							Static546.anIntArrayArrayArray20[local175][local776 + 1] = new int[] { (local2931 >> 14 & 0x3FFF) << 9, local3369 << 2, (local2931 & 0x3FFF) << 9 };
						}
						return;
					}
					if (arg0 == 5407) {
						local175 = Static546.anIntArrayArrayArray20[anIntArray785[--anInt10593]].length >> 1;
						anIntArray785[anInt10593++] = local175;
						return;
					}
					if (arg0 == 5411) {
						if (Static628.aFrame3 != null) {
							Static437.method6438(-1, -1, false, Static56.aClass14_Sub22_5.aClass21_Sub15_2.method5081());
						}
						if (Static339.aFrame2 != null) {
							Static559.method7855();
							System.exit(0);
							return;
						}
						local83 = Static437.aString78 == null ? Static493.method7315() : Static437.aString78;
						Static120.method7603(false, Static234.aClass333_5, local83, Static56.aClass14_Sub22_5.aClass21_Sub21_2.method7541() == 1);
						return;
					}
					if (arg0 == 5419) {
						local83 = "";
						if (Static651.aClass150_11 != null) {
							if (Static651.aClass150_11.anObject8 == null) {
								local83 = Static415.method6203(Static651.aClass150_11.anInt4246);
							} else {
								local83 = (String) Static651.aClass150_11.anObject8;
							}
						}
						aStringArray44[anInt10591++] = local83;
						return;
					}
					if (arg0 == 5420) {
						anIntArray785[anInt10593++] = Static234.aClass333_5.aBoolean693 ? 0 : 1;
						return;
					}
					if (arg0 == 5421) {
						if (Static628.aFrame3 != null) {
							Static437.method6438(-1, -1, false, Static56.aClass14_Sub22_5.aClass21_Sub15_2.method5081());
						}
						local83 = aStringArray44[--anInt10591];
						local1496 = anIntArray785[--anInt10593] == 1;
						local181 = Static493.method7315() + local83;
						Static120.method7603(local1496, Static234.aClass333_5, local181, Static56.aClass14_Sub22_5.aClass21_Sub21_2.method7541() == 1);
						return;
					}
					if (arg0 == 5422) {
						anInt10591 -= 2;
						local83 = aStringArray44[anInt10591];
						local89 = aStringArray44[anInt10591 + 1];
						local97 = anIntArray785[--anInt10593];
						if (local83.length() > 0) {
							if (Static612.aStringArray41 == null) {
								Static612.aStringArray41 = new String[Static418.anIntArray555[Static630.aClass77_8.anInt2295]];
							}
							Static612.aStringArray41[local97] = local83;
						}
						if (local89.length() > 0) {
							if (Static633.aStringArray45 == null) {
								Static633.aStringArray45 = new String[Static418.anIntArray555[Static630.aClass77_8.anInt2295]];
							}
							Static633.aStringArray45[local97] = local89;
						}
						return;
					}
					if (arg0 == 5423) {
						System.out.println(aStringArray44[--anInt10591]);
						return;
					}
					if (arg0 == 5424) {
						anInt10593 -= 11;
						Static628.anInt10569 = anIntArray785[anInt10593];
						Static477.anInt8313 = anIntArray785[anInt10593 + 1];
						Static615.anInt10350 = anIntArray785[anInt10593 + 2];
						Static640.anInt2935 = anIntArray785[anInt10593 + 3];
						Static348.anInt6439 = anIntArray785[anInt10593 + 4];
						Static314.anInt5980 = anIntArray785[anInt10593 + 5];
						Static645.anInt10796 = anIntArray785[anInt10593 + 6];
						Static180.anInt3465 = anIntArray785[anInt10593 + 7];
						Static626.anInt10555 = anIntArray785[anInt10593 + 8];
						Static27.anInt697 = anIntArray785[anInt10593 + 9];
						Static528.anInt9162 = anIntArray785[anInt10593 + 10];
						Static666.aClass386_141.method9206(Static348.anInt6439);
						Static666.aClass386_141.method9206(Static314.anInt5980);
						Static666.aClass386_141.method9206(Static645.anInt10796);
						Static666.aClass386_141.method9206(Static180.anInt3465);
						Static666.aClass386_141.method9206(Static626.anInt10555);
						Static567.aClass20_35 = null;
						Static414.aClass20_26 = null;
						Static543.aClass20_32 = null;
						Static65.aClass20_3 = null;
						Static427.aClass20_29 = null;
						Static425.aClass20_27 = null;
						Static426.aClass20_28 = null;
						Static464.aClass20_31 = null;
						Static575.aBoolean699 = true;
						return;
					}
					if (arg0 == 5425) {
						Static541.method8224();
						Static575.aBoolean699 = false;
						return;
					}
					if (arg0 == 5426) {
						anInt10593 -= 2;
						Static139.anInt2651 = anIntArray785[anInt10593];
						Static334.anInt6334 = anIntArray785[anInt10593 + 1];
						return;
					}
					if (arg0 == 5427) {
						anInt10593 -= 2;
						Static30.anInt779 = anIntArray785[anInt10593 + 1];
						return;
					}
					if (arg0 == 5428) {
						anInt10593 -= 2;
						local175 = anIntArray785[anInt10593];
						local776 = anIntArray785[anInt10593 + 1];
						anIntArray785[anInt10593++] = Static605.method8488(local776, local175) ? 1 : 0;
						return;
					}
					if (arg0 == 5429) {
						Static507.method7426(aStringArray44[--anInt10591], false, false);
						return;
					}
					if (arg0 == 5430) {
						try {
							Static682.method5126("accountcreated", Static645.anApplet2);
							return;
						} catch (@Pc(3917) Throwable local3917) {
							return;
						}
					}
					if (arg0 == 5431) {
						try {
							Static682.method5126("accountcreatestarted", Static645.anApplet2);
							return;
						} catch (@Pc(3928) Throwable local3928) {
							return;
						}
					}
					if (arg0 == 5432) {
						local83 = "";
						if (Static518.aClipboard3 != null) {
							@Pc(3940) Transferable local3940 = Static518.aClipboard3.getContents((Object) null);
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
						aStringArray44[anInt10591++] = local83;
						return;
					}
					if (arg0 == 5433) {
						Static408.anInt7105 = anIntArray785[--anInt10593];
						return;
					}
					if (arg0 == 5435) {
						anIntArray785[anInt10593++] = Static116.aBoolean192 ? 1 : 0;
						return;
					}
				} else if (arg0 < 5600) {
					if (arg0 == 5500) {
						anInt10593 -= 4;
						local175 = anIntArray785[anInt10593];
						local776 = anIntArray785[anInt10593 + 1];
						local97 = anIntArray785[anInt10593 + 2];
						local103 = anIntArray785[anInt10593 + 3];
						Static27.method614((local175 >> 14 & 0x3FFF) - Static329.anInt6225, false, local97, local103, (local175 & 0x3FFF) - Static202.anInt3755, local776 << 2);
						return;
					}
					if (arg0 == 5501) {
						anInt10593 -= 4;
						local175 = anIntArray785[anInt10593];
						local776 = anIntArray785[anInt10593 + 1];
						local97 = anIntArray785[anInt10593 + 2];
						local103 = anIntArray785[anInt10593 + 3];
						Static176.method2829(local97, local776 << 2, local103, (local175 & 0x3FFF) - Static202.anInt3755, (local175 >> 14 & 0x3FFF) - Static329.anInt6225);
						return;
					}
					if (arg0 == 5502) {
						anInt10593 -= 6;
						local175 = anIntArray785[anInt10593];
						if (local175 >= 2) {
							throw new RuntimeException();
						}
						Static123.anInt2476 = local175;
						local776 = anIntArray785[anInt10593 + 1];
						if (local776 + 1 >= Static546.anIntArrayArrayArray20[Static123.anInt2476].length >> 1) {
							throw new RuntimeException();
						}
						Static76.anInt1651 = local776;
						Static225.anInt4187 = 0;
						Static403.anInt7398 = anIntArray785[anInt10593 + 2];
						Static36.anInt969 = anIntArray785[anInt10593 + 3];
						local97 = anIntArray785[anInt10593 + 4];
						if (local97 >= 2) {
							throw new RuntimeException();
						}
						Static358.anInt6615 = local97;
						local103 = anIntArray785[anInt10593 + 5];
						if (local103 + 1 >= Static546.anIntArrayArrayArray20[Static358.anInt6615].length >> 1) {
							throw new RuntimeException();
						}
						Static65.anInt1515 = local103;
						Static378.anInt6935 = 3;
						Static115.anInt2304 = -1;
						Static667.anInt11097 = -1;
						return;
					}
					if (arg0 == 5503) {
						Static306.method4487();
						return;
					}
					if (arg0 == 5504) {
						anInt10593 -= 2;
						Static542.method7658(anIntArray785[anInt10593 + 1], anIntArray785[anInt10593]);
						return;
					}
					if (arg0 == 5505) {
						anIntArray785[anInt10593++] = (int) Static2.aFloat1 >> 3;
						return;
					}
					if (arg0 == 5506) {
						anIntArray785[anInt10593++] = (int) Static543.aFloat228 >> 3;
						return;
					}
					if (arg0 == 5507) {
						Static261.method3778();
						return;
					}
					if (arg0 == 5508) {
						Static453.method6561();
						return;
					}
					if (arg0 == 5509) {
						Static326.method5119();
						return;
					}
					if (arg0 == 5510) {
						Static142.method2218();
						return;
					}
					if (arg0 == 5511) {
						local175 = anIntArray785[--anInt10593];
						local776 = local175 >> 14 & 0x3FFF;
						local97 = local175 & 0x3FFF;
						local776 -= Static329.anInt6225;
						if (local776 < 0) {
							local776 = 0;
						} else if (local776 >= Static26.anInt462) {
							local776 = Static26.anInt462;
						}
						local97 -= Static202.anInt3755;
						if (local97 < 0) {
							local97 = 0;
						} else if (local97 >= Static445.anInt6140) {
							local97 = Static445.anInt6140;
						}
						Static322.anInt6116 = (local776 << 9) + 256;
						Static620.anInt10427 = (local97 << 9) + 256;
						Static378.anInt6935 = 4;
						Static115.anInt2304 = -1;
						Static667.anInt11097 = -1;
						return;
					}
					if (arg0 == 5512) {
						Static14.method133();
						return;
					}
					if (arg0 == 5514) {
						Static331.anInt6274 = anIntArray785[--anInt10593];
						return;
					}
					if (arg0 == 5516) {
						anIntArray785[anInt10593++] = Static331.anInt6274;
						return;
					}
					if (arg0 == 5517) {
						local175 = anIntArray785[--anInt10593];
						if (local175 == -1) {
							local776 = local175 >> 14 & 0x3FFF;
							local97 = local175 & 0x3FFF;
							local776 -= Static329.anInt6225;
							if (local776 < 0) {
								local776 = 0;
							} else if (local776 >= Static26.anInt462) {
								local776 = Static26.anInt462;
							}
							local97 -= Static202.anInt3755;
							if (local97 < 0) {
								local97 = 0;
							} else if (local97 >= Static445.anInt6140) {
								local97 = Static445.anInt6140;
							}
							Static667.anInt11097 = (local776 << 9) + 256;
							Static115.anInt2304 = (local97 << 9) + 256;
							return;
						}
						Static667.anInt11097 = -1;
						Static115.anInt2304 = -1;
						return;
					}
				} else if (arg0 < 5700) {
					if (arg0 == 5600) {
						anInt10591 -= 2;
						local83 = aStringArray44[anInt10591];
						local89 = aStringArray44[anInt10591 + 1];
						local97 = anIntArray785[--anInt10593];
						Static447.method8529(local83, local89, local97);
						return;
					}
					if (arg0 == 5601) {
						Static299.method4402();
						return;
					}
					if (arg0 == 5602) {
						if (!Static232.method3511()) {
							Static120.method7600();
						}
						return;
					}
					if (arg0 == 5604) {
						anInt10591--;
						if (Static430.anInt7691 != 3) {
							return;
						}
						if (!Static232.method3511() && Static101.anInt2152 == 0) {
							Static169.method2761(aStringArray44[anInt10591]);
							return;
						}
						return;
					}
					if (arg0 == 5605) {
						anInt10591 -= 2;
						anInt10593 -= 2;
						if (Static430.anInt7691 != 3) {
							return;
						}
						if (!Static232.method3511() && Static101.anInt2152 == 0) {
							Static532.method7629(aStringArray44[anInt10591 + 1], anIntArray785[anInt10593], aStringArray44[anInt10591], anIntArray785[anInt10593 + 1] == 1);
							return;
						}
						return;
					}
					if (arg0 == 5606) {
						if (Static101.anInt2152 == 0) {
							Static408.anInt7106 = -2;
						}
						return;
					}
					if (arg0 == 5607) {
						anIntArray785[anInt10593++] = Static642.anInt10721;
						return;
					}
					if (arg0 == 5608) {
						anIntArray785[anInt10593++] = Static54.anInt1375;
						return;
					}
					if (arg0 == 5609) {
						anIntArray785[anInt10593++] = Static408.anInt7106;
						return;
					}
					if (arg0 == 5611) {
						anIntArray785[anInt10593++] = Static252.anInt4470;
						return;
					}
					if (arg0 == 5612) {
						local175 = anIntArray785[--anInt10593];
						Static236.method3560(local175);
						return;
					}
					if (arg0 == 5613) {
						anIntArray785[anInt10593++] = Static642.anInt10721;
						return;
					}
					if (arg0 == 5615) {
						anInt10591 -= 2;
						local83 = aStringArray44[anInt10591];
						local89 = aStringArray44[anInt10591 + 1];
						Static501.method7349(local83, local89);
						return;
					}
					if (arg0 == 5616) {
						Static128.method2105(false);
						return;
					}
					if (arg0 == 5617) {
						anIntArray785[anInt10593++] = Static447.anInt10239;
						return;
					}
					if (arg0 == 5618) {
						anInt10593--;
						return;
					}
					if (arg0 == 5619) {
						anInt10593--;
						return;
					}
					if (arg0 == 5620) {
						anIntArray785[anInt10593++] = 0;
						return;
					}
					if (arg0 == 5621) {
						anInt10591 -= 2;
						anInt10593 -= 2;
						return;
					}
					if (arg0 == 5622) {
						return;
					}
					if (arg0 == 5623) {
						if (Static436.aByteArray90 != null) {
							anIntArray785[anInt10593++] = 1;
							return;
						}
						anIntArray785[anInt10593++] = 0;
						return;
					}
					if (arg0 == 5624) {
						anIntArray785[anInt10593++] = (int) (Static598.aLong266 >> 32);
						anIntArray785[anInt10593++] = (int) (Static598.aLong266 & 0xFFFFFFFFFFFFFFFFL);
						return;
					}
					if (arg0 == 5625) {
						anIntArray785[anInt10593++] = Static141.aBoolean152 ? 1 : 0;
						return;
					}
					if (arg0 == 5626) {
						Static141.aBoolean152 = true;
						Static462.method6789();
						return;
					}
					if (arg0 == 5628) {
						anIntArray785[anInt10593++] = Static232.method3511() ? 1 : 0;
						return;
					}
					if (arg0 == 5630) {
						Static312.method4984();
						return;
					}
					if (arg0 == 5631) {
						anInt10593 -= 2;
						local175 = anIntArray785[anInt10593];
						local776 = anIntArray785[anInt10593 + 1];
						Static652.method9071(local776, local175);
						return;
					}
					if (arg0 == 5632) {
						local175 = anIntArray785[--anInt10593];
						Static315.method5004(local175);
						return;
					}
				} else if (arg0 < 6100) {
					if (arg0 == 6001) {
						local175 = anIntArray785[--anInt10593];
						Static56.aClass14_Sub22_5.method3012(Static56.aClass14_Sub22_5.aClass21_Sub2_1, local175);
						Static107.method1893();
						Static169.method2762();
						Static26.aBoolean36 = false;
						return;
					}
					@Pc(4901) boolean local4901;
					if (arg0 == 6002) {
						local4901 = anIntArray785[--anInt10593] == 1;
						Static56.aClass14_Sub22_5.method3012(Static56.aClass14_Sub22_5.aClass21_Sub13_1, local4901 ? 1 : 0);
						Static56.aClass14_Sub22_5.method3012(Static56.aClass14_Sub22_5.aClass21_Sub13_2, local4901 ? 1 : 0);
						Static107.method1893();
						Static514.method7474();
						Static169.method2762();
						Static26.aBoolean36 = false;
						return;
					}
					if (arg0 == 6003) {
						local4901 = anIntArray785[--anInt10593] == 1;
						Static56.aClass14_Sub22_5.method3012(Static56.aClass14_Sub22_5.aClass21_Sub25_1, local4901 ? 2 : 1);
						Static56.aClass14_Sub22_5.method3012(Static56.aClass14_Sub22_5.aClass21_Sub25_2, local4901 ? 2 : 1);
						Static514.method7474();
						Static169.method2762();
						Static26.aBoolean36 = false;
						return;
					}
					if (arg0 == 6005) {
						Static56.aClass14_Sub22_5.method3012(Static56.aClass14_Sub22_5.aClass21_Sub27_1, anIntArray785[--anInt10593] == 1 ? 1 : 0);
						Static107.method1893();
						Static169.method2762();
						Static26.aBoolean36 = false;
						return;
					}
					if (arg0 == 6007) {
						Static56.aClass14_Sub22_5.method3012(Static56.aClass14_Sub22_5.aClass21_Sub4_1, anIntArray785[--anInt10593]);
						Static169.method2762();
						Static26.aBoolean36 = false;
						return;
					}
					if (arg0 == 6008) {
						Static56.aClass14_Sub22_5.method3012(Static56.aClass14_Sub22_5.aClass21_Sub19_1, anIntArray785[--anInt10593] == 1 ? 1 : 0);
						Static169.method2762();
						Static26.aBoolean36 = false;
						return;
					}
					if (arg0 == 6010) {
						Static56.aClass14_Sub22_5.method3012(Static56.aClass14_Sub22_5.aClass21_Sub10_1, anIntArray785[--anInt10593] == 1 ? 1 : 0);
						Static169.method2762();
						Static26.aBoolean36 = false;
						return;
					}
					if (arg0 == 6011) {
						Static56.aClass14_Sub22_5.method3012(Static56.aClass14_Sub22_5.aClass21_Sub1_1, anIntArray785[--anInt10593]);
						Static107.method1893();
						Static169.method2762();
						Static26.aBoolean36 = false;
						return;
					}
					if (arg0 == 6012) {
						Static56.aClass14_Sub22_5.method3012(Static56.aClass14_Sub22_5.aClass21_Sub18_1, anIntArray785[--anInt10593] == 1 ? 1 : 0);
						Static221.method6306();
						Static677.method9300();
						Static169.method2762();
						Static26.aBoolean36 = false;
						return;
					}
					if (arg0 == 6014) {
						Static56.aClass14_Sub22_5.method3012(Static56.aClass14_Sub22_5.aClass21_Sub8_1, anIntArray785[--anInt10593] == 1 ? 2 : 0);
						Static107.method1893();
						Static169.method2762();
						Static26.aBoolean36 = false;
						return;
					}
					if (arg0 == 6015) {
						Static56.aClass14_Sub22_5.method3012(Static56.aClass14_Sub22_5.aClass21_Sub17_1, anIntArray785[--anInt10593] == 1 ? 1 : 0);
						Static107.method1893();
						Static169.method2762();
						Static26.aBoolean36 = false;
						return;
					}
					if (arg0 == 6016) {
						Static56.aClass14_Sub22_5.method3012(Static56.aClass14_Sub22_5.aClass21_Sub9_1, anIntArray785[--anInt10593]);
						Static155.method2506(Static56.aClass14_Sub22_5.aClass21_Sub21_2.method7541(), false);
						Static169.method2762();
						return;
					}
					if (arg0 == 6017) {
						Static56.aClass14_Sub22_5.method3012(Static56.aClass14_Sub22_5.aClass21_Sub26_1, anIntArray785[--anInt10593] == 1 ? 1 : 0);
						Static364.method5501();
						Static169.method2762();
						Static26.aBoolean36 = false;
						return;
					}
					if (arg0 == 6018) {
						Static56.aClass14_Sub22_5.method3012(Static56.aClass14_Sub22_5.aClass21_Sub20_1, anIntArray785[--anInt10593]);
						Static169.method2762();
						Static26.aBoolean36 = false;
						return;
					}
					if (arg0 == 6019) {
						local175 = anIntArray785[--anInt10593];
						local776 = Static56.aClass14_Sub22_5.aClass21_Sub20_2.method7115();
						if (local175 != local776) {
							if (Static177.method2836(Static430.anInt7691)) {
								if (local776 == 0 && Static344.anInt11217 != -1) {
									Static522.method7501(local175, Static40.aClass386_19, Static344.anInt11217);
									Static669.method9260();
									Static275.aBoolean329 = false;
								} else if (local175 == 0) {
									Static610.method8580();
									Static275.aBoolean329 = false;
								} else {
									Static1.method8560(local175);
								}
							}
							Static56.aClass14_Sub22_5.method3012(Static56.aClass14_Sub22_5.aClass21_Sub20_2, local175);
							Static169.method2762();
							Static26.aBoolean36 = false;
						}
						return;
					}
					if (arg0 == 6020) {
						Static56.aClass14_Sub22_5.method3012(Static56.aClass14_Sub22_5.aClass21_Sub20_5, anIntArray785[--anInt10593]);
						Static169.method2762();
						Static26.aBoolean36 = false;
						return;
					}
					if (arg0 == 6021) {
						local175 = Static56.aClass14_Sub22_5.aClass21_Sub25_1.method8195();
						Static56.aClass14_Sub22_5.method3012(Static56.aClass14_Sub22_5.aClass21_Sub25_2, anIntArray785[--anInt10593] == 1 ? 0 : local175);
						Static514.method7474();
						return;
					}
					if (arg0 == 6023) {
						local175 = anIntArray785[--anInt10593];
						Static56.aClass14_Sub22_5.method3012(Static56.aClass14_Sub22_5.aClass21_Sub16_1, local175);
						Static169.method2762();
						Static26.aBoolean36 = false;
						return;
					}
					if (arg0 == 6024) {
						Static56.aClass14_Sub22_5.method3012(Static56.aClass14_Sub22_5.aClass21_Sub9_2, anIntArray785[--anInt10593]);
						Static169.method2762();
						return;
					}
					if (arg0 == 6025) {
						Static56.aClass14_Sub22_5.method3012(Static56.aClass14_Sub22_5.aClass21_Sub3_1, anIntArray785[--anInt10593]);
						Static169.method2762();
						Static26.aBoolean36 = false;
						return;
					}
					if (arg0 == 6027) {
						local175 = anIntArray785[--anInt10593];
						if (local175 < 0 || local175 > 1) {
							local175 = 0;
						}
						Static154.method2473(local175 == 1);
						return;
					}
					if (arg0 == 6028) {
						Static56.aClass14_Sub22_5.method3012(Static56.aClass14_Sub22_5.aClass21_Sub5_1, anIntArray785[--anInt10593] == 0 ? 0 : 1);
						Static169.method2762();
						return;
					}
					if (arg0 == 6029) {
						Static56.aClass14_Sub22_5.method3012(Static56.aClass14_Sub22_5.aClass21_Sub4_1, anIntArray785[--anInt10593]);
						Static169.method2762();
						return;
					}
					if (arg0 == 6030) {
						Static56.aClass14_Sub22_5.method3012(Static56.aClass14_Sub22_5.aClass21_Sub22_1, anIntArray785[--anInt10593] == 0 ? 0 : 1);
						Static169.method2762();
						Static107.method1893();
						return;
					}
					if (arg0 == 6031) {
						local175 = anIntArray785[--anInt10593];
						if (local175 < 0 || local175 > 5) {
							local175 = 2;
						}
						Static155.method2506(local175, false);
						return;
					}
					if (arg0 == 6032) {
						anInt10593 -= 2;
						local175 = anIntArray785[anInt10593];
						local1496 = anIntArray785[anInt10593 + 1] == 1;
						Static56.aClass14_Sub22_5.method3012(Static56.aClass14_Sub22_5.aClass21_Sub21_1, local175);
						if (!local1496) {
							Static56.aClass14_Sub22_5.method3012(Static56.aClass14_Sub22_5.aClass21_Sub11_1, 0);
						}
						Static169.method2762();
						Static26.aBoolean36 = false;
						return;
					}
					if (arg0 == 6033) {
						Static56.aClass14_Sub22_5.method3012(Static56.aClass14_Sub22_5.aClass21_Sub14_1, anIntArray785[--anInt10593]);
						Static169.method2762();
						return;
					}
					if (arg0 == 6034) {
						Static56.aClass14_Sub22_5.method3012(Static56.aClass14_Sub22_5.aClass21_Sub28_1, anIntArray785[--anInt10593] == 1 ? 1 : 0);
						Static169.method2762();
						Static221.method6306();
						Static26.aBoolean36 = false;
						return;
					}
					if (arg0 == 6035) {
						local175 = Static56.aClass14_Sub22_5.aClass21_Sub13_1.method4396();
						Static56.aClass14_Sub22_5.method3012(Static56.aClass14_Sub22_5.aClass21_Sub13_2, anIntArray785[--anInt10593] == 1 ? 1 : local175);
						Static107.method1893();
						Static514.method7474();
						return;
					}
					if (arg0 == 6036) {
						Static56.aClass14_Sub22_5.method3012(Static56.aClass14_Sub22_5.aClass21_Sub23_1, anIntArray785[--anInt10593]);
						Static169.method2762();
						Static6.aBoolean3 = true;
						return;
					}
					if (arg0 == 6037) {
						Static56.aClass14_Sub22_5.method3012(Static56.aClass14_Sub22_5.aClass21_Sub20_4, anIntArray785[--anInt10593]);
						Static169.method2762();
						Static26.aBoolean36 = false;
						return;
					}
					if (arg0 == 6038) {
						local175 = anIntArray785[--anInt10593];
						local776 = Static56.aClass14_Sub22_5.aClass21_Sub20_3.method7115();
						if (local175 != local776 && Static344.anInt11217 == Static203.anInt3760) {
							if (!Static177.method2836(Static430.anInt7691)) {
								if (local776 == 0) {
									Static522.method7501(local175, Static40.aClass386_19, Static344.anInt11217);
									Static669.method9260();
									Static275.aBoolean329 = false;
								} else if (local175 == 0) {
									Static610.method8580();
									Static275.aBoolean329 = false;
								} else {
									Static1.method8560(local175);
								}
							}
							Static56.aClass14_Sub22_5.method3012(Static56.aClass14_Sub22_5.aClass21_Sub20_3, local175);
							Static169.method2762();
							Static26.aBoolean36 = false;
						}
						return;
					}
					if (arg0 == 6039) {
						local175 = anIntArray785[--anInt10593];
						if (local175 > 255 || local175 < 0) {
							local175 = 0;
						}
						if (local175 != Static56.aClass14_Sub22_5.aClass21_Sub24_1.method8185()) {
							Static56.aClass14_Sub22_5.method3012(Static56.aClass14_Sub22_5.aClass21_Sub24_1, local175);
							Static169.method2762();
							Static26.aBoolean36 = false;
						}
						return;
					}
					if (arg0 == 6040) {
						local175 = anIntArray785[--anInt10593];
						if (local175 != Static56.aClass14_Sub22_5.aClass21_Sub6_1.method1933()) {
							Static56.aClass14_Sub22_5.method3012(Static56.aClass14_Sub22_5.aClass21_Sub6_1, local175);
							Static169.method2762();
							Static26.aBoolean36 = false;
							Static102.method1817();
						}
						return;
					}
				} else if (arg0 < 6200) {
					if (arg0 == 6101) {
						anIntArray785[anInt10593++] = Static56.aClass14_Sub22_5.aClass21_Sub2_1.method837();
						return;
					}
					if (arg0 == 6102) {
						anIntArray785[anInt10593++] = Static56.aClass14_Sub22_5.aClass21_Sub13_1.method4396() == 1 ? 1 : 0;
						return;
					}
					if (arg0 == 6103) {
						anIntArray785[anInt10593++] = Static56.aClass14_Sub22_5.aClass21_Sub25_1.method8195() == 2 ? 1 : 0;
						return;
					}
					if (arg0 == 6105) {
						anIntArray785[anInt10593++] = Static56.aClass14_Sub22_5.aClass21_Sub27_1.method8612() == 1 ? 1 : 0;
						return;
					}
					if (arg0 == 6107) {
						anIntArray785[anInt10593++] = Static56.aClass14_Sub22_5.aClass21_Sub4_1.method1258();
						return;
					}
					if (arg0 == 6108) {
						anIntArray785[anInt10593++] = Static56.aClass14_Sub22_5.aClass21_Sub19_1.method6498() == 1 ? 1 : 0;
						return;
					}
					if (arg0 == 6110) {
						anIntArray785[anInt10593++] = Static56.aClass14_Sub22_5.aClass21_Sub10_1.method2383() == 1 ? 1 : 0;
						return;
					}
					if (arg0 == 6111) {
						anIntArray785[anInt10593++] = Static56.aClass14_Sub22_5.aClass21_Sub1_1.method459();
						return;
					}
					if (arg0 == 6112) {
						anIntArray785[anInt10593++] = Static56.aClass14_Sub22_5.aClass21_Sub18_1.method5561() == 1 ? 1 : 0;
						return;
					}
					if (arg0 == 6114) {
						anIntArray785[anInt10593++] = Static56.aClass14_Sub22_5.aClass21_Sub8_1.method2132() == 2 ? 1 : 0;
						return;
					}
					if (arg0 == 6115) {
						anIntArray785[anInt10593++] = Static56.aClass14_Sub22_5.aClass21_Sub17_1.method5452() == 1 ? 1 : 0;
						return;
					}
					if (arg0 == 6116) {
						anIntArray785[anInt10593++] = Static56.aClass14_Sub22_5.aClass21_Sub9_1.method2372();
						return;
					}
					if (arg0 == 6117) {
						anIntArray785[anInt10593++] = Static56.aClass14_Sub22_5.aClass21_Sub26_1.method8389() == 1 ? 1 : 0;
						return;
					}
					if (arg0 == 6118) {
						anIntArray785[anInt10593++] = Static56.aClass14_Sub22_5.aClass21_Sub20_1.method7115();
						return;
					}
					if (arg0 == 6119) {
						anIntArray785[anInt10593++] = Static56.aClass14_Sub22_5.aClass21_Sub20_2.method7115();
						return;
					}
					if (arg0 == 6120) {
						anIntArray785[anInt10593++] = Static56.aClass14_Sub22_5.aClass21_Sub20_5.method7115();
						return;
					}
					if (arg0 == 6123) {
						anIntArray785[anInt10593++] = Static36.method834();
						return;
					}
					if (arg0 == 6124) {
						anIntArray785[anInt10593++] = Static56.aClass14_Sub22_5.aClass21_Sub9_2.method2372();
						return;
					}
					if (arg0 == 6125) {
						anIntArray785[anInt10593++] = Static56.aClass14_Sub22_5.aClass21_Sub3_1.method964();
						return;
					}
					if (arg0 == 6127) {
						anIntArray785[anInt10593++] = Static56.aClass14_Sub22_5.aClass21_Sub29_1.method9295() == 1 ? 1 : 0;
						return;
					}
					if (arg0 == 6128) {
						anIntArray785[anInt10593++] = Static56.aClass14_Sub22_5.aClass21_Sub5_1.method1912() == 1 ? 1 : 0;
						return;
					}
					if (arg0 == 6129) {
						anIntArray785[anInt10593++] = Static56.aClass14_Sub22_5.aClass21_Sub4_1.method1258();
						return;
					}
					if (arg0 == 6130) {
						anIntArray785[anInt10593++] = Static56.aClass14_Sub22_5.aClass21_Sub22_1.method7709() == 1 ? 1 : 0;
						return;
					}
					if (arg0 == 6131) {
						anIntArray785[anInt10593++] = Static56.aClass14_Sub22_5.aClass21_Sub21_2.method7541();
						return;
					}
					if (arg0 == 6132) {
						anIntArray785[anInt10593++] = Static56.aClass14_Sub22_5.aClass21_Sub21_1.method7541();
						return;
					}
					if (arg0 == 6133) {
						anIntArray785[anInt10593++] = Static234.aClass333_5.aBoolean693 && !Static234.aClass333_5.aBoolean694 ? 1 : 0;
						return;
					}
					if (arg0 == 6135) {
						anIntArray785[anInt10593++] = Static56.aClass14_Sub22_5.aClass21_Sub14_1.method4522();
						return;
					}
					if (arg0 == 6136) {
						anIntArray785[anInt10593++] = Static56.aClass14_Sub22_5.aClass21_Sub28_1.method9104() == 1 ? 1 : 0;
						return;
					}
					if (arg0 == 6138) {
						anIntArray785[anInt10593++] = Static428.method6310(Static56.aClass14_Sub22_5.aClass21_Sub21_2.method7541(), 200);
						return;
					}
					if (arg0 == 6139) {
						anIntArray785[anInt10593++] = Static56.aClass14_Sub22_5.aClass21_Sub23_1.method7768();
						return;
					}
					if (arg0 == 6142) {
						anIntArray785[anInt10593++] = Static56.aClass14_Sub22_5.aClass21_Sub20_4.method7115();
						return;
					}
					if (arg0 == 6143) {
						anIntArray785[anInt10593++] = Static56.aClass14_Sub22_5.aClass21_Sub20_3.method7115();
						return;
					}
					if (arg0 == 6144) {
						anIntArray785[anInt10593++] = Static328.aBoolean431 ? 1 : 0;
						return;
					}
					if (arg0 == 6145) {
						anIntArray785[anInt10593++] = Static56.aClass14_Sub22_5.aClass21_Sub24_1.method8185();
						return;
					}
					if (arg0 == 6146) {
						anIntArray785[anInt10593++] = Static56.aClass14_Sub22_5.aClass21_Sub6_1.method1933();
						return;
					}
					if (arg0 == 6147) {
						anIntArray785[anInt10593++] = Static58.aClass14_Sub11_1.anInt1980 < 512 || Static328.aBoolean431 || Static524.aBoolean637 ? 1 : 0;
						return;
					}
					if (arg0 == 6148) {
						anIntArray785[anInt10593++] = Static290.aBoolean345 ? 1 : 0;
						return;
					}
				} else if (arg0 < 6300) {
					if (arg0 == 6200) {
						anInt10593 -= 2;
						Static677.aShort125 = (short) anIntArray785[anInt10593];
						if (Static677.aShort125 <= 0) {
							Static677.aShort125 = 256;
						}
						Static146.aShort34 = (short) anIntArray785[anInt10593 + 1];
						if (Static146.aShort34 <= 0) {
							Static146.aShort34 = 205;
						}
						return;
					}
					if (arg0 == 6201) {
						anInt10593 -= 2;
						Static26.aShort4 = (short) anIntArray785[anInt10593];
						if (Static26.aShort4 <= 0) {
							Static26.aShort4 = 256;
						}
						Static175.aShort45 = (short) anIntArray785[anInt10593 + 1];
						if (Static175.aShort45 <= 0) {
							Static175.aShort45 = 320;
						}
						return;
					}
					if (arg0 == 6202) {
						anInt10593 -= 4;
						Static177.aShort46 = (short) anIntArray785[anInt10593];
						if (Static177.aShort46 <= 0) {
							Static177.aShort46 = 1;
						}
						Static657.aShort118 = (short) anIntArray785[anInt10593 + 1];
						if (Static657.aShort118 <= 0) {
							Static657.aShort118 = 32767;
						} else if (Static657.aShort118 < Static177.aShort46) {
							Static657.aShort118 = Static177.aShort46;
						}
						Static132.aShort27 = (short) anIntArray785[anInt10593 + 2];
						if (Static132.aShort27 <= 0) {
							Static132.aShort27 = 1;
						}
						Static452.aShort83 = (short) anIntArray785[anInt10593 + 3];
						if (Static452.aShort83 <= 0) {
							Static452.aShort83 = 32767;
							return;
						}
						if (Static452.aShort83 < Static132.aShort27) {
							Static452.aShort83 = Static132.aShort27;
						}
						return;
					}
					if (arg0 == 6203) {
						Static353.method5354(0, 0, false, Static459.aClass230_8.anInt6703, Static459.aClass230_8.anInt6701);
						anIntArray785[anInt10593++] = Static286.anInt4890;
						anIntArray785[anInt10593++] = Static568.anInt9799;
						return;
					}
					if (arg0 == 6204) {
						anIntArray785[anInt10593++] = Static26.aShort4;
						anIntArray785[anInt10593++] = Static175.aShort45;
						return;
					}
					if (arg0 == 6205) {
						anIntArray785[anInt10593++] = Static677.aShort125;
						anIntArray785[anInt10593++] = Static146.aShort34;
						return;
					}
				} else if (arg0 < 6400) {
					if (arg0 == 6300) {
						anIntArray785[anInt10593++] = (int) (Static521.method7499() / 60000L);
						return;
					}
					if (arg0 == 6301) {
						anIntArray785[anInt10593++] = (int) (Static521.method7499() / 86400000L) - 11745;
						return;
					}
					if (arg0 == 6302) {
						anInt10593 -= 3;
						local175 = anIntArray785[anInt10593];
						local776 = anIntArray785[anInt10593 + 1];
						local97 = anIntArray785[anInt10593 + 2];
						@Pc(6710) long local6710 = Static146.method2326(local97, local776, local175);
						local3369 = Static120.method7598(local6710);
						if (local97 < 1970) {
							local3369--;
						}
						anIntArray785[anInt10593++] = local3369;
						return;
					}
					if (arg0 == 6303) {
						anIntArray785[anInt10593++] = Static269.method9157(Static521.method7499());
						return;
					}
					if (arg0 == 6304) {
						local175 = anIntArray785[--anInt10593];
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
						anIntArray785[anInt10593++] = local1496 ? 1 : 0;
						return;
					}
					if (arg0 == 6305) {
						local175 = anIntArray785[--anInt10593];
						@Pc(6828) int[] local6828 = Static178.method2839(local175);
						Static681.method2482(local6828, 0, anIntArray785, anInt10593, 3);
						anInt10593 += 3;
						return;
					}
					if (arg0 == 6306) {
						local175 = anIntArray785[--anInt10593];
						anIntArray785[anInt10593++] = (int) (Static551.method5873(local175) / 60000L);
						return;
					}
				} else if (arg0 < 6500) {
					if (arg0 == 6405) {
						anIntArray785[anInt10593++] = Static131.method6552() ? 1 : 0;
						return;
					}
					if (arg0 == 6406) {
						anIntArray785[anInt10593++] = Static104.method1840() ? 1 : 0;
						return;
					}
				} else if (arg0 < 6600) {
					if (arg0 == 6500) {
						if (Static430.anInt7691 == 7 && !Static232.method3511() && Static101.anInt2152 == 0) {
							if (Static586.aBoolean709) {
								anIntArray785[anInt10593++] = 0;
								return;
							}
							if (Static590.aLong264 > Static521.method7499() - 1000L) {
								anIntArray785[anInt10593++] = 1;
								return;
							}
							Static586.aBoolean709 = true;
							local52 = Static286.method4081(Static205.aClass394_1, Static182.aClass100_53);
							local52.aClass14_Sub29_Sub1_1.method5861(Static67.anInt1550);
							Static576.method8234(local52);
							anIntArray785[anInt10593++] = 0;
							return;
						}
						anIntArray785[anInt10593++] = 1;
						return;
					}
					@Pc(7014) Class204 local7014;
					@Pc(6981) Class217_Sub1 local6981;
					if (arg0 == 6501) {
						local6981 = Static67.method1342();
						if (local6981 != null) {
							anIntArray785[anInt10593++] = local6981.anInt9134;
							anIntArray785[anInt10593++] = local6981.anInt9130;
							aStringArray44[anInt10591++] = local6981.aString88;
							local7014 = local6981.method7553();
							anIntArray785[anInt10593++] = local7014.anInt6067;
							aStringArray44[anInt10591++] = local7014.aString65;
							anIntArray785[anInt10593++] = local6981.anInt9131;
							anIntArray785[anInt10593++] = local6981.anInt9136;
							aStringArray44[anInt10591++] = local6981.aString89;
							return;
						}
						anIntArray785[anInt10593++] = -1;
						anIntArray785[anInt10593++] = 0;
						aStringArray44[anInt10591++] = "";
						anIntArray785[anInt10593++] = 0;
						aStringArray44[anInt10591++] = "";
						anIntArray785[anInt10593++] = 0;
						anIntArray785[anInt10593++] = 0;
						aStringArray44[anInt10591++] = "";
						return;
					}
					if (arg0 == 6502) {
						local6981 = Static349.method5326();
						if (local6981 != null) {
							anIntArray785[anInt10593++] = local6981.anInt9134;
							anIntArray785[anInt10593++] = local6981.anInt9130;
							aStringArray44[anInt10591++] = local6981.aString88;
							local7014 = local6981.method7553();
							anIntArray785[anInt10593++] = local7014.anInt6067;
							aStringArray44[anInt10591++] = local7014.aString65;
							anIntArray785[anInt10593++] = local6981.anInt9131;
							anIntArray785[anInt10593++] = local6981.anInt9136;
							aStringArray44[anInt10591++] = local6981.aString89;
							return;
						}
						anIntArray785[anInt10593++] = -1;
						anIntArray785[anInt10593++] = 0;
						aStringArray44[anInt10591++] = "";
						anIntArray785[anInt10593++] = 0;
						aStringArray44[anInt10591++] = "";
						anIntArray785[anInt10593++] = 0;
						anIntArray785[anInt10593++] = 0;
						aStringArray44[anInt10591++] = "";
						return;
					}
					if (arg0 == 6503) {
						local175 = anIntArray785[--anInt10593];
						local89 = aStringArray44[--anInt10591];
						if (Static430.anInt7691 == 7 && !Static232.method3511() && Static101.anInt2152 == 0) {
							anIntArray785[anInt10593++] = Static660.method9134(local175, local89) ? 1 : 0;
							return;
						}
						anIntArray785[anInt10593++] = 0;
						return;
					}
					if (arg0 == 6506) {
						local175 = anIntArray785[--anInt10593];
						@Pc(7342) Class217_Sub1 local7342 = Static344.method9318(local175);
						if (local7342 != null) {
							anIntArray785[anInt10593++] = local7342.anInt9130;
							aStringArray44[anInt10591++] = local7342.aString88;
							@Pc(7366) Class204 local7366 = local7342.method7553();
							anIntArray785[anInt10593++] = local7366.anInt6067;
							aStringArray44[anInt10591++] = local7366.aString65;
							anIntArray785[anInt10593++] = local7342.anInt9131;
							anIntArray785[anInt10593++] = local7342.anInt9136;
							aStringArray44[anInt10591++] = local7342.aString89;
							return;
						}
						anIntArray785[anInt10593++] = -1;
						aStringArray44[anInt10591++] = "";
						anIntArray785[anInt10593++] = 0;
						aStringArray44[anInt10591++] = "";
						anIntArray785[anInt10593++] = 0;
						anIntArray785[anInt10593++] = 0;
						aStringArray44[anInt10591++] = "";
						return;
					}
					if (arg0 == 6507) {
						anInt10593 -= 4;
						local175 = anIntArray785[anInt10593];
						local1496 = anIntArray785[anInt10593 + 1] == 1;
						local97 = anIntArray785[anInt10593 + 2];
						local2205 = anIntArray785[anInt10593 + 3] == 1;
						Static228.method3477(local2205, local175, local1496, local97);
						return;
					}
					if (arg0 == 6508) {
						Static634.method8859();
						return;
					}
					if (arg0 == 6509) {
						if (Static430.anInt7691 != 7) {
							return;
						}
						Static107.aBoolean185 = anIntArray785[--anInt10593] == 1;
						return;
					}
					if (arg0 == 6510) {
						anIntArray785[anInt10593++] = Static472.anInt8235;
						return;
					}
				} else if (arg0 >= 6700) {
					if (arg0 < 6800 && Static668.aClass222_8 == Static276.aClass222_6) {
						if (arg0 == 6700) {
							local175 = Static547.aClass187_69.method4080();
							if (Static563.anInt9769 != -1) {
								local175++;
							}
							anIntArray785[anInt10593++] = local175;
							return;
						}
						if (arg0 == 6701) {
							local175 = anIntArray785[--anInt10593];
							if (Static563.anInt9769 != -1) {
								if (local175 == 0) {
									anIntArray785[anInt10593++] = Static563.anInt9769;
									return;
								}
								local175--;
							}
							@Pc(7614) Class14_Sub32 local7614 = (Class14_Sub32) Static547.aClass187_69.method4079();
							while (local175-- > 0) {
								local7614 = (Class14_Sub32) Static547.aClass187_69.method4084();
							}
							anIntArray785[anInt10593++] = local7614.anInt6351;
							return;
						}
						if (arg0 == 6702) {
							local175 = anIntArray785[--anInt10593];
							if (Static559.aClass230ArrayArray2[local175] == null) {
								aStringArray44[anInt10591++] = "";
								return;
							}
							local89 = Static559.aClass230ArrayArray2[local175][0].aString70;
							if (local89 == null) {
								aStringArray44[anInt10591++] = "";
								return;
							}
							aStringArray44[anInt10591++] = local89.substring(0, local89.indexOf(58));
							return;
						}
						if (arg0 == 6703) {
							local175 = anIntArray785[--anInt10593];
							if (Static559.aClass230ArrayArray2[local175] == null) {
								anIntArray785[anInt10593++] = 0;
								return;
							}
							anIntArray785[anInt10593++] = Static559.aClass230ArrayArray2[local175].length;
							return;
						}
						if (arg0 == 6704) {
							anInt10593 -= 2;
							local175 = anIntArray785[anInt10593];
							local776 = anIntArray785[anInt10593 + 1];
							if (Static559.aClass230ArrayArray2[local175] == null) {
								aStringArray44[anInt10591++] = "";
								return;
							}
							local181 = Static559.aClass230ArrayArray2[local175][local776].aString70;
							if (local181 == null) {
								aStringArray44[anInt10591++] = "";
								return;
							}
							aStringArray44[anInt10591++] = local181;
							return;
						}
						if (arg0 == 6705) {
							anInt10593 -= 2;
							local175 = anIntArray785[anInt10593];
							local776 = anIntArray785[anInt10593 + 1];
							if (Static559.aClass230ArrayArray2[local175] == null) {
								anIntArray785[anInt10593++] = 0;
								return;
							}
							anIntArray785[anInt10593++] = Static559.aClass230ArrayArray2[local175][local776].anInt6718;
							return;
						}
						if (arg0 == 6706) {
							return;
						}
						if (arg0 == 6707) {
							anInt10593 -= 3;
							local175 = anIntArray785[anInt10593];
							local776 = anIntArray785[anInt10593 + 1];
							local97 = anIntArray785[anInt10593 + 2];
							Static69.method1357(local97, local175 << 16 | local776, 1, "");
							return;
						}
						if (arg0 == 6708) {
							anInt10593 -= 3;
							local175 = anIntArray785[anInt10593];
							local776 = anIntArray785[anInt10593 + 1];
							local97 = anIntArray785[anInt10593 + 2];
							Static69.method1357(local97, local175 << 16 | local776, 2, "");
							return;
						}
						if (arg0 == 6709) {
							anInt10593 -= 3;
							local175 = anIntArray785[anInt10593];
							local776 = anIntArray785[anInt10593 + 1];
							local97 = anIntArray785[anInt10593 + 2];
							Static69.method1357(local97, local175 << 16 | local776, 3, "");
							return;
						}
						if (arg0 == 6710) {
							anInt10593 -= 3;
							local175 = anIntArray785[anInt10593];
							local776 = anIntArray785[anInt10593 + 1];
							local97 = anIntArray785[anInt10593 + 2];
							Static69.method1357(local97, local175 << 16 | local776, 4, "");
							return;
						}
						if (arg0 == 6711) {
							anInt10593 -= 3;
							local175 = anIntArray785[anInt10593];
							local776 = anIntArray785[anInt10593 + 1];
							local97 = anIntArray785[anInt10593 + 2];
							Static69.method1357(local97, local175 << 16 | local776, 5, "");
							return;
						}
						if (arg0 == 6712) {
							anInt10593 -= 3;
							local175 = anIntArray785[anInt10593];
							local776 = anIntArray785[anInt10593 + 1];
							local97 = anIntArray785[anInt10593 + 2];
							Static69.method1357(local97, local175 << 16 | local776, 6, "");
							return;
						}
						if (arg0 == 6713) {
							anInt10593 -= 3;
							local175 = anIntArray785[anInt10593];
							local776 = anIntArray785[anInt10593 + 1];
							local97 = anIntArray785[anInt10593 + 2];
							Static69.method1357(local97, local175 << 16 | local776, 7, "");
							return;
						}
						if (arg0 == 6714) {
							anInt10593 -= 3;
							local175 = anIntArray785[anInt10593];
							local776 = anIntArray785[anInt10593 + 1];
							local97 = anIntArray785[anInt10593 + 2];
							Static69.method1357(local97, local175 << 16 | local776, 8, "");
							return;
						}
						if (arg0 == 6715) {
							anInt10593 -= 3;
							local175 = anIntArray785[anInt10593];
							local776 = anIntArray785[anInt10593 + 1];
							local97 = anIntArray785[anInt10593 + 2];
							Static69.method1357(local97, local175 << 16 | local776, 9, "");
							return;
						}
						if (arg0 == 6716) {
							anInt10593 -= 3;
							local175 = anIntArray785[anInt10593];
							local776 = anIntArray785[anInt10593 + 1];
							local97 = anIntArray785[anInt10593 + 2];
							Static69.method1357(local97, local175 << 16 | local776, 10, "");
							return;
						}
						if (arg0 == 6717) {
							anInt10593 -= 3;
							local175 = anIntArray785[anInt10593];
							local776 = anIntArray785[anInt10593 + 1];
							local97 = anIntArray785[anInt10593 + 2];
							@Pc(8202) Class230 local8202 = Static572.method8204(local97, local175 << 16 | local776);
							Static141.method1563();
							@Pc(8207) Class14_Sub33 local8207 = Static78.method1481(local8202);
							Static178.method2842(local8207.method5402(), local8207.anInt6587, local8202);
							return;
						}
					} else if (arg0 < 6900) {
						@Pc(8235) Class42 local8235;
						if (arg0 == 6800) {
							local175 = anIntArray785[--anInt10593];
							local8235 = Static196.aClass116_2.method2783(local175);
							if (local8235.aString12 == null) {
								aStringArray44[anInt10591++] = "";
								return;
							}
							aStringArray44[anInt10591++] = local8235.aString12;
							return;
						}
						if (arg0 == 6801) {
							local175 = anIntArray785[--anInt10593];
							local8235 = Static196.aClass116_2.method2783(local175);
							anIntArray785[anInt10593++] = local8235.anInt1281;
							return;
						}
						if (arg0 == 6802) {
							local175 = anIntArray785[--anInt10593];
							local8235 = Static196.aClass116_2.method2783(local175);
							anIntArray785[anInt10593++] = local8235.anInt1279;
							return;
						}
						if (arg0 == 6803) {
							local175 = anIntArray785[--anInt10593];
							local8235 = Static196.aClass116_2.method2783(local175);
							anIntArray785[anInt10593++] = local8235.anInt1303;
							return;
						}
						if (arg0 == 6804) {
							anInt10593 -= 2;
							local175 = anIntArray785[anInt10593];
							local776 = anIntArray785[anInt10593 + 1];
							@Pc(8357) Class341 local8357 = Static217.aClass90_1.method2122(local776);
							if (local8357.method8270()) {
								aStringArray44[anInt10591++] = Static196.aClass116_2.method2783(local175).method1113(local776, local8357.aString107);
								return;
							}
							anIntArray785[anInt10593++] = Static196.aClass116_2.method2783(local175).method1104(local776, local8357.anInt9931);
							return;
						}
					} else if (arg0 < 7000) {
						if (arg0 == 6900) {
							anIntArray785[anInt10593++] = Static13.aBoolean12 && !Static47.aBoolean97 ? 1 : 0;
							return;
						}
						if (arg0 == 6901) {
							anIntArray785[anInt10593++] = (int) (Static343.aLong176 / 60000L);
							anIntArray785[anInt10593++] = (int) ((Static343.aLong176 - Static521.method7499() - Static635.aLong288) / 60000L);
							anIntArray785[anInt10593++] = Static598.aBoolean714 ? 1 : 0;
							return;
						}
						if (arg0 == 6902) {
							anIntArray785[anInt10593++] = Static198.anInt3673;
							return;
						}
						if (arg0 == 6903) {
							anIntArray785[anInt10593++] = Static553.anInt9425;
							return;
						}
						if (arg0 == 6904) {
							anIntArray785[anInt10593++] = Static291.anInt5167;
							return;
						}
						if (arg0 == 6905) {
							local83 = "";
							if (Static651.aClass150_11 != null) {
								if (Static651.aClass150_11.anObject8 == null) {
									local83 = Static415.method6203(Static651.aClass150_11.anInt4246);
								} else {
									local83 = (String) Static651.aClass150_11.anObject8;
								}
							}
							aStringArray44[anInt10591++] = local83;
							return;
						}
						if (arg0 == 6906) {
							anIntArray785[anInt10593++] = Static336.anInt6340;
							return;
						}
						if (arg0 == 6907) {
							anIntArray785[anInt10593++] = Static607.anInt4031;
							return;
						}
						if (arg0 == 6908) {
							anIntArray785[anInt10593++] = Static425.anInt7659;
							return;
						}
						if (arg0 == 6909) {
							anIntArray785[anInt10593++] = Static167.aBoolean250 ? 1 : 0;
							return;
						}
						if (arg0 == 6910) {
							anIntArray785[anInt10593++] = Static537.anInt9244;
							return;
						}
						if (arg0 == 6911) {
							anIntArray785[anInt10593++] = Static7.anInt54;
							return;
						}
						if (arg0 == 6912) {
							anIntArray785[anInt10593++] = Static109.anInt2258;
							return;
						}
						if (arg0 == 6913) {
							anIntArray785[anInt10593++] = Static583.anInt10018;
							return;
						}
					} else if (arg0 < 7100) {
						if (arg0 == 7000) {
							local175 = Static447.method8532();
							anIntArray785[anInt10593++] = Static451.anInt7919 = Static56.aClass14_Sub22_5.aClass21_Sub21_2.method7541();
							anIntArray785[anInt10593++] = local175;
							Static107.method1893();
							Static169.method2762();
							Static26.aBoolean36 = false;
							return;
						}
						if (arg0 == 7001) {
							Static501.method7348();
							Static107.method1893();
							Static169.method2762();
							Static26.aBoolean36 = false;
							return;
						}
						if (arg0 == 7002) {
							Static424.method6264();
							Static107.method1893();
							Static169.method2762();
							Static26.aBoolean36 = false;
							return;
						}
						if (arg0 == 7003) {
							Static597.method8448();
							Static107.method1893();
							Static169.method2762();
							Static26.aBoolean36 = false;
							return;
						}
						if (arg0 == 7004) {
							Static126.method2100();
							Static107.method1893();
							Static169.method2762();
							Static26.aBoolean36 = false;
							return;
						}
						if (arg0 == 7005) {
							Static56.aClass14_Sub22_5.method3012(Static56.aClass14_Sub22_5.aClass21_Sub11_1, 0);
							Static169.method2762();
							Static26.aBoolean36 = false;
							return;
						}
						if (arg0 == 7006) {
							if (Static451.anInt7919 == 2) {
								Static534.aBoolean651 = true;
								return;
							}
							if (Static451.anInt7919 == 1) {
								Static504.aBoolean628 = true;
								return;
							}
							if (Static451.anInt7919 == 3) {
								Static345.aBoolean438 = true;
							}
							return;
						}
						if (arg0 == 7007) {
							anIntArray785[anInt10593++] = Static56.aClass14_Sub22_5.aClass21_Sub11_1.method3087();
							return;
						}
					} else if (arg0 < 7200) {
						if (arg0 == 7100) {
							anInt10593 -= 2;
							local175 = anIntArray785[anInt10593];
							local776 = anIntArray785[anInt10593 + 1];
							if (local175 != -1) {
								if (local776 > 255) {
									local776 = 255;
								} else if (local776 < 0) {
									local776 = 0;
								}
								Static384.method5714(local175, local776, false);
							}
							return;
						}
						if (arg0 == 7101) {
							local175 = anIntArray785[--anInt10593];
							if (local175 != -1) {
								Static107.method1894(local175);
							}
							return;
						}
						if (arg0 == 7102) {
							local175 = anIntArray785[--anInt10593];
							if (local175 != -1) {
								Static297.method4371(local175);
							}
							return;
						}
						if (arg0 == 7103) {
							anIntArray785[anInt10593++] = Static189.method2976("jagtheora") ? 1 : 0;
							return;
						}
					} else if (arg0 < 7300) {
						if (arg0 == 7201) {
							anIntArray785[anInt10593++] = Static56.aClass14_Sub22_5.aClass21_Sub27_1.method8613() ? 1 : 0;
							return;
						}
						if (arg0 == 7202) {
							anIntArray785[anInt10593++] = Static56.aClass14_Sub22_5.aClass21_Sub10_1.method2382() ? 1 : 0;
							return;
						}
						if (arg0 == 7203) {
							anIntArray785[anInt10593++] = Static56.aClass14_Sub22_5.aClass21_Sub1_1.method460() ? 1 : 0;
							return;
						}
						if (arg0 == 7204) {
							anIntArray785[anInt10593++] = Static56.aClass14_Sub22_5.aClass21_Sub8_1.method2133() ? 1 : 0;
							return;
						}
						if (arg0 == 7205) {
							anIntArray785[anInt10593++] = Static56.aClass14_Sub22_5.aClass21_Sub9_2.method2371() && Static677.aClass137_47.method7909() ? 1 : 0;
							return;
						}
						if (arg0 == 7206) {
							anIntArray785[anInt10593++] = Static56.aClass14_Sub22_5.aClass21_Sub16_1.method5191() ? 1 : 0;
							return;
						}
						if (arg0 == 7207) {
							anIntArray785[anInt10593++] = Static56.aClass14_Sub22_5.aClass21_Sub3_1.method962() ? 1 : 0;
							return;
						}
						if (arg0 == 7208) {
							anIntArray785[anInt10593++] = Static56.aClass14_Sub22_5.aClass21_Sub29_1.method9298() && Static677.aClass137_47.method7936() ? 1 : 0;
							return;
						}
						if (arg0 == 7209) {
							anIntArray785[anInt10593++] = Static56.aClass14_Sub22_5.aClass21_Sub22_1.method7710() ? 1 : 0;
							return;
						}
						if (arg0 == 7210) {
							anIntArray785[anInt10593++] = Static56.aClass14_Sub22_5.aClass21_Sub28_1.method9106() ? 1 : 0;
							return;
						}
						if (arg0 == 7211) {
							anIntArray785[anInt10593++] = Static56.aClass14_Sub22_5.aClass21_Sub23_1.method7770() ? 1 : 0;
							return;
						}
						if (arg0 == 7212) {
							anIntArray785[anInt10593++] = Static56.aClass14_Sub22_5.aClass21_Sub17_1.method5451() ? 1 : 0;
							return;
						}
						if (arg0 == 7213) {
							anIntArray785[anInt10593++] = Static56.aClass14_Sub22_5.aClass21_Sub6_1.method1934() ? 1 : 0;
							return;
						}
						if (arg0 == 7214) {
							anIntArray785[anInt10593++] = Static56.aClass14_Sub22_5.aClass21_Sub21_1.method7545() ? 1 : 0;
							return;
						}
					} else if (arg0 < 7400) {
						if (arg0 == 7301) {
							local175 = anIntArray785[--anInt10593];
							anIntArray785[anInt10593++] = Static56.aClass14_Sub22_5.aClass21_Sub27_1.method9289(local175);
							return;
						}
						if (arg0 == 7302) {
							local175 = anIntArray785[--anInt10593];
							anIntArray785[anInt10593++] = Static56.aClass14_Sub22_5.aClass21_Sub10_1.method9289(local175);
							return;
						}
						if (arg0 == 7303) {
							local175 = anIntArray785[--anInt10593];
							anIntArray785[anInt10593++] = Static56.aClass14_Sub22_5.aClass21_Sub1_1.method9289(local175);
							return;
						}
						if (arg0 == 7304) {
							local175 = anIntArray785[--anInt10593];
							anIntArray785[anInt10593++] = Static56.aClass14_Sub22_5.aClass21_Sub8_1.method9289(local175);
							return;
						}
						if (arg0 == 7305) {
							local175 = anIntArray785[--anInt10593];
							if (!Static677.aClass137_47.method7909()) {
								anIntArray785[anInt10593++] = 3;
								return;
							}
							anIntArray785[anInt10593++] = Static56.aClass14_Sub22_5.aClass21_Sub9_2.method9289(local175);
							return;
						}
						if (arg0 == 7306) {
							local175 = anIntArray785[--anInt10593];
							anIntArray785[anInt10593++] = Static56.aClass14_Sub22_5.aClass21_Sub16_1.method9289(local175);
							return;
						}
						if (arg0 == 7307) {
							local175 = anIntArray785[--anInt10593];
							anIntArray785[anInt10593++] = Static56.aClass14_Sub22_5.aClass21_Sub3_1.method9289(local175);
							return;
						}
						if (arg0 == 7308) {
							local175 = anIntArray785[--anInt10593];
							if (!Static677.aClass137_47.method7936()) {
								anIntArray785[anInt10593++] = 3;
								return;
							}
							anIntArray785[anInt10593++] = Static56.aClass14_Sub22_5.aClass21_Sub29_1.method9289(local175);
							return;
						}
						if (arg0 == 7309) {
							local175 = anIntArray785[--anInt10593];
							anIntArray785[anInt10593++] = Static56.aClass14_Sub22_5.aClass21_Sub22_1.method9289(local175);
							return;
						}
						if (arg0 == 7310) {
							local175 = anIntArray785[--anInt10593];
							anIntArray785[anInt10593++] = Static56.aClass14_Sub22_5.aClass21_Sub28_1.method9289(local175);
							return;
						}
						if (arg0 == 7311) {
							local175 = anIntArray785[--anInt10593];
							anIntArray785[anInt10593++] = Static56.aClass14_Sub22_5.aClass21_Sub23_1.method9289(local175);
							return;
						}
						if (arg0 == 7312) {
							local175 = anIntArray785[--anInt10593];
							anIntArray785[anInt10593++] = Static56.aClass14_Sub22_5.aClass21_Sub17_1.method9289(local175);
							return;
						}
						if (arg0 == 7313) {
							local175 = anIntArray785[--anInt10593];
							anIntArray785[anInt10593++] = Static56.aClass14_Sub22_5.aClass21_Sub6_1.method9289(local175);
							return;
						}
						if (arg0 == 7314) {
							local175 = anIntArray785[--anInt10593];
							anIntArray785[anInt10593++] = Static56.aClass14_Sub22_5.aClass21_Sub21_1.method9289(local175);
							return;
						}
					}
				}
			}
		}
		throw new IllegalStateException(String.valueOf(arg0));
	}

	@OriginalMember(owner = "client!vh", name = "a", descriptor = "(Lclient!fi;I)V")
	private static void method8829(@OriginalArg(0) Class14_Sub3_Sub8 arg0, @OriginalArg(1) int arg1) {
		anInt10593 = 0;
		anInt10591 = 0;
		@Pc(5) int local5 = -1;
		@Pc(8) int[] local8 = arg0.anIntArray259;
		@Pc(11) int[] local11 = arg0.anIntArray257;
		@Pc(13) byte local13 = -1;
		anInt10598 = 0;
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
						method8827(local31, local1134);
					} else if (local31 >= 5000 && local31 < 10000) {
						method8828(local31, local1134);
					} else {
						throw new IllegalStateException("Command: " + local31);
					}
				} else if (local31 == 0) {
					anIntArray785[anInt10593++] = local11[local5];
				} else {
					@Pc(54) int local54;
					if (local31 == 1) {
						local54 = local11[local5];
						anIntArray785[anInt10593++] = Static595.aClass241_1.anIntArray524[local54];
					} else if (local31 == 2) {
						local54 = local11[local5];
						Static595.aClass241_1.method5821(anIntArray785[--anInt10593], local54);
					} else if (local31 == 3) {
						aStringArray44[anInt10591++] = arg0.aStringArray9[local5];
					} else if (local31 == 6) {
						local5 += local11[local5];
					} else if (local31 == 7) {
						anInt10593 -= 2;
						if (anIntArray785[anInt10593] != anIntArray785[anInt10593 + 1]) {
							local5 += local11[local5];
						}
					} else if (local31 == 8) {
						anInt10593 -= 2;
						if (anIntArray785[anInt10593] == anIntArray785[anInt10593 + 1]) {
							local5 += local11[local5];
						}
					} else if (local31 == 9) {
						anInt10593 -= 2;
						if (anIntArray785[anInt10593] < anIntArray785[anInt10593 + 1]) {
							local5 += local11[local5];
						}
					} else if (local31 == 10) {
						anInt10593 -= 2;
						if (anIntArray785[anInt10593] > anIntArray785[anInt10593 + 1]) {
							local5 += local11[local5];
						}
					} else if (local31 == 21) {
						if (anInt10598 == 0) {
							return;
						}
						@Pc(216) Class321 local216 = aClass321Array1[--anInt10598];
						arg0 = local216.aClass14_Sub3_Sub8_1;
						local8 = arg0.anIntArray259;
						local11 = arg0.anIntArray257;
						local5 = local216.anInt9318;
						anIntArray786 = local216.anIntArray680;
						aStringArray43 = local216.aStringArray35;
						aLongArray21 = local216.aLongArray20;
					} else if (local31 == 25) {
						local54 = local11[local5];
						anIntArray785[anInt10593++] = Static595.aClass241_1.method5813(local54);
					} else if (local31 == 27) {
						local54 = local11[local5];
						Static595.aClass241_1.method5819(anIntArray785[--anInt10593], local54);
					} else if (local31 == 31) {
						anInt10593 -= 2;
						if (anIntArray785[anInt10593] <= anIntArray785[anInt10593 + 1]) {
							local5 += local11[local5];
						}
					} else if (local31 == 32) {
						anInt10593 -= 2;
						if (anIntArray785[anInt10593] >= anIntArray785[anInt10593 + 1]) {
							local5 += local11[local5];
						}
					} else if (local31 == 33) {
						anIntArray785[anInt10593++] = anIntArray786[local11[local5]];
					} else if (local31 == 34) {
						anIntArray786[local11[local5]] = anIntArray785[--anInt10593];
					} else if (local31 == 35) {
						aStringArray44[anInt10591++] = aStringArray43[local11[local5]];
					} else if (local31 == 36) {
						aStringArray43[local11[local5]] = aStringArray44[--anInt10591];
					} else if (local31 == 37) {
						local54 = local11[local5];
						anInt10591 -= local54;
						@Pc(403) String local403 = Static153.method2448(local54, anInt10591, aStringArray44);
						aStringArray44[anInt10591++] = local403;
					} else if (local31 == 38) {
						anInt10593--;
					} else if (local31 == 39) {
						anInt10591--;
					} else if (local31 == 40) {
						local54 = local11[local5];
						@Pc(439) Class14_Sub3_Sub8 local439 = Static346.method5298(local54);
						if (local439 == null) {
							throw new RuntimeException();
						}
						@Pc(449) int[] local449 = new int[local439.anInt3174];
						@Pc(453) String[] local453 = new String[local439.anInt3170];
						@Pc(457) long[] local457 = new long[local439.anInt3173];
						for (@Pc(459) int local459 = 0; local459 < local439.anInt3169; local459++) {
							local449[local459] = anIntArray785[anInt10593 + local459 - local439.anInt3169];
						}
						for (@Pc(478) int local478 = 0; local478 < local439.anInt3177; local478++) {
							local453[local478] = aStringArray44[anInt10591 + local478 - local439.anInt3177];
						}
						for (@Pc(497) int local497 = 0; local497 < local439.anInt3171; local497++) {
							local457[local497] = aLongArray22[anInt10595 + local497 - local439.anInt3171];
						}
						anInt10593 -= local439.anInt3169;
						anInt10591 -= local439.anInt3177;
						anInt10595 -= local439.anInt3171;
						@Pc(533) Class321 local533 = new Class321();
						local533.aClass14_Sub3_Sub8_1 = arg0;
						local533.anInt9318 = local5;
						local533.anIntArray680 = anIntArray786;
						local533.aStringArray35 = aStringArray43;
						local533.aLongArray20 = aLongArray21;
						if (anInt10598 >= aClass321Array1.length) {
							throw new RuntimeException();
						}
						aClass321Array1[anInt10598++] = local533;
						arg0 = local439;
						local8 = local439.anIntArray259;
						local11 = local439.anIntArray257;
						local5 = -1;
						anIntArray786 = local449;
						aStringArray43 = local453;
						aLongArray21 = local457;
					} else if (local31 == 42) {
						anIntArray785[anInt10593++] = Static259.anIntArray800[local11[local5]];
					} else if (local31 == 43) {
						local54 = local11[local5];
						Static259.anIntArray800[local54] = anIntArray785[--anInt10593];
						Static234.method3551(local54);
						Static354.aBoolean460 |= Static330.aBooleanArray15[local54];
					} else if (local31 == 44) {
						local54 = local11[local5] >> 16;
						local639 = local11[local5] & 0xFFFF;
						@Pc(647) int local647 = anIntArray785[--anInt10593];
						if (local647 >= 0 && local647 <= 5000) {
							anIntArray784[local54] = local647;
							@Pc(662) byte local662 = -1;
							if (local639 == 105) {
								local662 = 0;
							}
							@Pc(669) int local669 = 0;
							while (true) {
								if (local669 >= local647) {
									continue label333;
								}
								anIntArrayArray60[local54][local669] = local662;
								local669++;
							}
						}
						throw new RuntimeException();
					} else if (local31 == 45) {
						local54 = local11[local5];
						local639 = anIntArray785[--anInt10593];
						if (local639 < 0 || local639 >= anIntArray784[local54]) {
							throw new RuntimeException();
						}
						anIntArray785[anInt10593++] = anIntArrayArray60[local54][local639];
					} else if (local31 == 46) {
						local54 = local11[local5];
						anInt10593 -= 2;
						local639 = anIntArray785[anInt10593];
						if (local639 < 0 || local639 >= anIntArray784[local54]) {
							throw new RuntimeException();
						}
						anIntArrayArray60[local54][local639] = anIntArray785[anInt10593 + 1];
					} else if (local31 == 47) {
						@Pc(766) String local766 = Static277.aStringArray13[local11[local5]];
						if (local766 == null) {
							local766 = "null";
						}
						aStringArray44[anInt10591++] = local766;
					} else if (local31 == 48) {
						local54 = local11[local5];
						Static277.aStringArray13[local54] = aStringArray44[--anInt10591];
						Static10.method57(local54);
					} else if (local31 == 51) {
						@Pc(810) Class187 local810 = arg0.aClass187Array1[local11[local5]];
						@Pc(823) Class14_Sub18 local823 = (Class14_Sub18) local810.method4078((long) anIntArray785[--anInt10593]);
						if (local823 != null) {
							local5 += local823.anInt2644;
						}
					} else if (local31 == 54) {
						aLongArray22[anInt10595++] = arg0.aLongArray3[local5];
					} else if (local31 == 55) {
						anInt10595--;
					} else if (local31 == 66) {
						aLongArray22[anInt10595++] = aLongArray21[local11[local5]];
					} else if (local31 == 67) {
						aLongArray21[local11[local5]] = aLongArray22[--anInt10595];
					} else if (local31 == 68) {
						anInt10595 -= 2;
						if (aLongArray22[anInt10595] != aLongArray22[anInt10595 + 1]) {
							local5 += local11[local5];
						}
					} else if (local31 == 69) {
						anInt10595 -= 2;
						if (aLongArray22[anInt10595] == aLongArray22[anInt10595 + 1]) {
							local5 += local11[local5];
						}
					} else if (local31 == 70) {
						anInt10595 -= 2;
						if (aLongArray22[anInt10595] < aLongArray22[anInt10595 + 1]) {
							local5 += local11[local5];
						}
					} else if (local31 == 71) {
						anInt10595 -= 2;
						if (aLongArray22[anInt10595] > aLongArray22[anInt10595 + 1]) {
							local5 += local11[local5];
						}
					} else if (local31 == 72) {
						anInt10595 -= 2;
						if (aLongArray22[anInt10595] <= aLongArray22[anInt10595 + 1]) {
							local5 += local11[local5];
						}
					} else if (local31 == 73) {
						anInt10595 -= 2;
						if (aLongArray22[anInt10595] >= aLongArray22[anInt10595 + 1]) {
							local5 += local11[local5];
						}
					} else if (local31 == 86) {
						if (anIntArray785[--anInt10593] == 1) {
							local5 += local11[local5];
						}
					} else if (local31 == 87) {
						if (anIntArray785[--anInt10593] == 0) {
							local5 += local11[local5];
						}
					} else if (local31 == 112) {
						anIntArray785[anInt10593++] = method8840(local11[local5]);
					} else if (local31 == 113) {
						anIntArray785[anInt10593++] = method8839(local11[local5]);
					} else if (local31 == 114) {
						aLongArray22[anInt10595++] = method8831(local11[local5]);
					} else if (local31 == 115) {
						aStringArray44[anInt10591++] = method8835(local11[local5]);
					}
				}
			}
		} catch (@Pc(1169) Exception local1169) {
			@Pc(1188) StringBuffer local1188;
			if (arg0.aString38 == null) {
				local1188 = new StringBuffer(30);
				local1188.append("CS2: ").append(arg0.aLong305).append(" ");
				for (local639 = anInt10598 - 1; local639 >= 0; local639--) {
					local1188.append("v: ").append(aClass321Array1[local639].aClass14_Sub3_Sub8_1.aLong305).append(" ");
				}
				local1188.append("op: ").append(local13);
				Static524.method7532(local1188.toString(), local1169);
			} else {
				Static271.method3957("Clientscript error in: " + arg0.aString38);
				local1188 = new StringBuffer(30);
				local1188.append("Clientscript error in: ").append(arg0.aString38).append("\n");
				for (local639 = anInt10598 - 1; local639 >= 0; local639--) {
					local1188.append("via: ").append(aClass321Array1[local639].aClass14_Sub3_Sub8_1.aString38).append("\n");
				}
				local1188.append("Op: ").append(local13).append("\n");
				@Pc(1228) String local1228 = local1169.getMessage();
				if (local1228 != null && local1228.length() > 0) {
					local1188.append("Message: ").append(local1228).append("\n");
				}
				Static524.method7532(local1188.toString(), local1169);
				Static466.method6830(local1188.toString());
			}
		}
	}

	@OriginalMember(owner = "client!vh", name = "a", descriptor = "(Lclient!wea;)V")
	public static void method8830(@OriginalArg(0) Class14_Sub55 arg0) {
		method8834(arg0, 200000);
	}

	@OriginalMember(owner = "client!vh", name = "a", descriptor = "(I)J")
	private static long method8831(@OriginalArg(0) int arg0) {
		@Pc(9) Long local9 = aClass229_3.method5438(Static630.aClass77_8.anInt2295 << 16 | arg0);
		return local9 == null ? -1L : local9;
	}

	@OriginalMember(owner = "client!vh", name = "b", descriptor = "(I)V")
	private static void method8832(@OriginalArg(0) int arg0) {
		@Pc(3) Class230 local3 = Static655.method9094(arg0);
		if (local3 == null) {
			return;
		}
		@Pc(9) int local9 = arg0 >>> 16;
		@Pc(13) Class230[] local13 = Static46.aClass230ArrayArray1[local9];
		if (local13 == null) {
			@Pc(19) Class230[] local19 = Static559.aClass230ArrayArray2[local9];
			@Pc(22) int local22 = local19.length;
			local13 = Static46.aClass230ArrayArray1[local9] = new Class230[local22];
			Static681.method2481(local19, 0, local13, 0, local19.length);
		}
		@Pc(38) int local38;
		for (local38 = 0; local38 < local13.length && local13[local38] != local3; local38++) {
		}
		if (local38 >= local13.length) {
			return;
		}
		Static681.method2481(local13, 0, local13, 1, local38);
		local13[0] = local3;
	}

	@OriginalMember(owner = "client!vh", name = "a", descriptor = "(Lclient!pha;II)V")
	public static void method8833(@OriginalArg(0) Class276 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(5) Class14_Sub3_Sub8 local5 = Static193.method2995(arg2, arg0, arg1);
		if (local5 == null) {
			return;
		}
		anIntArray786 = new int[local5.anInt3174];
		aStringArray43 = new String[local5.anInt3170];
		if (local5.aClass276_7 == Static335.aClass276_11 || local5.aClass276_7 == Static24.aClass276_1 || local5.aClass276_7 == Static220.aClass276_9) {
			@Pc(30) int local30 = 0;
			@Pc(32) int local32 = 0;
			if (Static289.aClass230_3 != null) {
				local30 = Static289.aClass230_3.anInt6725;
				local32 = Static289.aClass230_3.anInt6676;
			}
			anIntArray786[0] = Static666.aClass79_1.method3361() - local30;
			anIntArray786[1] = Static666.aClass79_1.method3358() - local32;
		}
		method8829(local5, 200000);
	}

	@OriginalMember(owner = "client!vh", name = "a", descriptor = "(Lclient!wea;I)V")
	private static void method8834(@OriginalArg(0) Class14_Sub55 arg0, @OriginalArg(1) int arg1) {
		@Pc(2) Object[] local2 = arg0.anObjectArray33;
		@Pc(8) int local8 = (Integer) local2[0];
		@Pc(12) Class14_Sub3_Sub8 local12 = Static346.method5298(local8);
		if (local12 == null) {
			return;
		}
		anIntArray786 = new int[local12.anInt3174];
		@Pc(21) int local21 = 0;
		aStringArray43 = new String[local12.anInt3170];
		@Pc(27) int local27 = 0;
		aLongArray21 = new long[local12.anInt3173];
		@Pc(33) int local33 = 0;
		for (@Pc(35) int local35 = 1; local35 < local2.length; local35++) {
			if (local2[local35] instanceof Integer) {
				@Pc(47) int local47 = (Integer) local2[local35];
				if (local47 == -2147483647) {
					local47 = arg0.anInt10932;
				}
				if (local47 == -2147483646) {
					local47 = arg0.anInt10933;
				}
				if (local47 == -2147483645) {
					local47 = arg0.aClass230_14 == null ? -1 : arg0.aClass230_14.anInt6663;
				}
				if (local47 == -2147483644) {
					local47 = arg0.anInt10934;
				}
				if (local47 == -2147483643) {
					local47 = arg0.aClass230_14 == null ? -1 : arg0.aClass230_14.anInt6679;
				}
				if (local47 == -2147483642) {
					local47 = arg0.aClass230_13 == null ? -1 : arg0.aClass230_13.anInt6663;
				}
				if (local47 == -2147483641) {
					local47 = arg0.aClass230_13 == null ? -1 : arg0.aClass230_13.anInt6679;
				}
				if (local47 == -2147483640) {
					local47 = arg0.anInt10936;
				}
				if (local47 == -2147483639) {
					local47 = arg0.anInt10931;
				}
				anIntArray786[local21++] = local47;
			} else if (local2[local35] instanceof String) {
				@Pc(141) String local141 = (String) local2[local35];
				if (local141.equals("event_opbase")) {
					local141 = arg0.aString116;
				}
				aStringArray43[local27++] = local141;
			} else if (local2[local35] instanceof Long) {
				@Pc(165) long local165 = (Long) local2[local35];
				aLongArray21[local33++] = local165;
			}
		}
		anInt10602 = arg0.anInt10937;
		method8829(local12, arg1);
	}

	@OriginalMember(owner = "client!vh", name = "c", descriptor = "(I)Ljava/lang/String;")
	private static String method8835(@OriginalArg(0) int arg0) {
		@Pc(9) String local9 = aClass229_3.method5428(Static630.aClass77_8.anInt2295 << 16 | arg0);
		return local9 == null ? "" : local9;
	}

	@OriginalMember(owner = "client!vh", name = "a", descriptor = "(C)I")
	private static int method8836(@OriginalArg(0) char arg0) {
		return Static356.method5395(arg0) ? 1 : 0;
	}

	@OriginalMember(owner = "client!vh", name = "d", descriptor = "(I)V")
	public static void method8837(@OriginalArg(0) int arg0) {
		if (arg0 == -1 || !Static220.method3432(arg0)) {
			return;
		}
		@Pc(12) Class230[] local12 = Static559.aClass230ArrayArray2[arg0];
		for (@Pc(14) int local14 = 0; local14 < local12.length; local14++) {
			@Pc(19) Class230 local19 = local12[local14];
			if (local19.anObjectArray19 != null) {
				@Pc(26) Class14_Sub55 local26 = new Class14_Sub55();
				local26.aClass230_14 = local19;
				local26.anObjectArray33 = local19.anObjectArray19;
				method8834(local26, 2000000);
			}
		}
	}

	@OriginalMember(owner = "client!vh", name = "c", descriptor = "(IZ)V")
	public static void method8838() {
	}

	@OriginalMember(owner = "client!vh", name = "e", descriptor = "(I)I")
	private static int method8839(@OriginalArg(0) int arg0) {
		@Pc(4) Class245 local4 = Static634.aClass15_1.method135(arg0);
		if (local4 == null) {
			throw new RuntimeException("sr-c113");
		}
		@Pc(26) Integer local26 = aClass229_3.method5439(Static630.aClass77_8.anInt2295 << 16 | local4.anInt7299, local4.anInt7300, local4.anInt7296);
		return local26 == null ? 0 : local26;
	}

	@OriginalMember(owner = "client!vh", name = "f", descriptor = "(I)I")
	private static int method8840(@OriginalArg(0) int arg0) {
		@Pc(4) Class245 local4 = Static634.aClass15_1.method135(arg0);
		if (local4 == null) {
			throw new RuntimeException("sr-c112");
		}
		@Pc(21) Integer local21 = aClass229_3.method5422(Static630.aClass77_8.anInt2295 << 16 | arg0);
		if (local21 == null) {
			return local4.aChar5 == 'i' || local4.aChar5 == '1' ? 0 : -1;
		} else {
			return local21;
		}
	}

	@OriginalMember(owner = "client!vh", name = "b", descriptor = "()V")
	public static void method8841() {
	}

	@OriginalMember(owner = "client!vh", name = "g", descriptor = "(I)V")
	private static void method8842(@OriginalArg(0) int arg0) {
		@Pc(3) Class230 local3 = Static655.method9094(arg0);
		if (local3 == null) {
			return;
		}
		@Pc(9) int local9 = arg0 >>> 16;
		@Pc(13) Class230[] local13 = Static46.aClass230ArrayArray1[local9];
		if (local13 == null) {
			@Pc(19) Class230[] local19 = Static559.aClass230ArrayArray2[local9];
			@Pc(22) int local22 = local19.length;
			local13 = Static46.aClass230ArrayArray1[local9] = new Class230[local22];
			Static681.method2481(local19, 0, local13, 0, local19.length);
		}
		@Pc(38) int local38;
		for (local38 = 0; local38 < local13.length && local13[local38] != local3; local38++) {
		}
		if (local38 >= local13.length) {
			return;
		}
		Static681.method2481(local13, local38 + 1, local13, local38, local13.length - local38 - 1);
		local13[local13.length - 1] = local3;
	}
}
