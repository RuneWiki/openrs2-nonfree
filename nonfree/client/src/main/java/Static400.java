import java.awt.datatransfer.DataFlavor;
import java.awt.datatransfer.Transferable;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static400 {

	@OriginalMember(owner = "client!oea", name = "l", descriptor = "[I")
	private static int[] anIntArray424;

	@OriginalMember(owner = "client!oea", name = "p", descriptor = "Lclient!nia;")
	private static Class238 aClass238_1;

	@OriginalMember(owner = "client!oea", name = "r", descriptor = "[Ljava/lang/String;")
	private static String[] aStringArray55;

	@OriginalMember(owner = "client!oea", name = "w", descriptor = "Lclient!uv;")
	private static Class344 aClass344_7;

	@OriginalMember(owner = "client!oea", name = "x", descriptor = "Lclient!uv;")
	private static Class344 aClass344_8;

	@OriginalMember(owner = "client!oea", name = "a", descriptor = "[[I")
	private static final int[][] anIntArrayArray34 = new int[5][5000];

	@OriginalMember(owner = "client!oea", name = "c", descriptor = "I")
	private static int anInt7128 = 0;

	@OriginalMember(owner = "client!oea", name = "d", descriptor = "[Lclient!wfa;")
	private static final Class373[] aClass373Array1 = new Class373[50];

	@OriginalMember(owner = "client!oea", name = "f", descriptor = "[I")
	private static final int[] anIntArray422 = new int[1000];

	@OriginalMember(owner = "client!oea", name = "h", descriptor = "[I")
	private static final int[] anIntArray423 = new int[3];

	@OriginalMember(owner = "client!oea", name = "i", descriptor = "I")
	private static int anInt7131 = 0;

	@OriginalMember(owner = "client!oea", name = "m", descriptor = "I")
	private static int anInt7134 = 0;

	@OriginalMember(owner = "client!oea", name = "u", descriptor = "[Ljava/lang/String;")
	private static final String[] aStringArray56 = new String[1000];

	@OriginalMember(owner = "client!oea", name = "y", descriptor = "Lclient!gw;")
	public static final Class136 aClass136_45 = new Class136(4);

	@OriginalMember(owner = "client!oea", name = "z", descriptor = "[I")
	private static final int[] anIntArray425 = new int[5];

	@OriginalMember(owner = "client!oea", name = "A", descriptor = "I")
	private static int anInt7141 = 0;

	@OriginalMember(owner = "client!oea", name = "a", descriptor = "(Ljava/lang/String;I)V")
	private static void method6277(@OriginalArg(0) String arg0, @OriginalArg(1) int arg1) {
		if (Static544.anInt9130 == 0 && (Static11.aBoolean13 && !Static317.aBoolean446 || Static61.aBoolean57)) {
			return;
		}
		@Pc(11) String local11 = arg0.toLowerCase();
		@Pc(13) byte local13 = 0;
		if (local11.startsWith(Static369.aClass235_50.method5893(0))) {
			local13 = 0;
			arg0 = arg0.substring(Static369.aClass235_50.method5893(0).length());
		} else if (local11.startsWith(Static369.aClass235_51.method5893(0))) {
			local13 = 1;
			arg0 = arg0.substring(Static369.aClass235_51.method5893(0).length());
		} else if (local11.startsWith(Static369.aClass235_52.method5893(0))) {
			local13 = 2;
			arg0 = arg0.substring(Static369.aClass235_52.method5893(0).length());
		} else if (local11.startsWith(Static369.aClass235_53.method5893(0))) {
			local13 = 3;
			arg0 = arg0.substring(Static369.aClass235_53.method5893(0).length());
		} else if (local11.startsWith(Static369.aClass235_54.method5893(0))) {
			local13 = 4;
			arg0 = arg0.substring(Static369.aClass235_54.method5893(0).length());
		} else if (local11.startsWith(Static369.aClass235_55.method5893(0))) {
			local13 = 5;
			arg0 = arg0.substring(Static369.aClass235_55.method5893(0).length());
		} else if (local11.startsWith(Static369.aClass235_56.method5893(0))) {
			local13 = 6;
			arg0 = arg0.substring(Static369.aClass235_56.method5893(0).length());
		} else if (local11.startsWith(Static369.aClass235_57.method5893(0))) {
			local13 = 7;
			arg0 = arg0.substring(Static369.aClass235_57.method5893(0).length());
		} else if (local11.startsWith(Static369.aClass235_58.method5893(0))) {
			local13 = 8;
			arg0 = arg0.substring(Static369.aClass235_58.method5893(0).length());
		} else if (local11.startsWith(Static369.aClass235_59.method5893(0))) {
			local13 = 9;
			arg0 = arg0.substring(Static369.aClass235_59.method5893(0).length());
		} else if (local11.startsWith(Static369.aClass235_60.method5893(0))) {
			local13 = 10;
			arg0 = arg0.substring(Static369.aClass235_60.method5893(0).length());
		} else if (local11.startsWith(Static369.aClass235_61.method5893(0))) {
			local13 = 11;
			arg0 = arg0.substring(Static369.aClass235_61.method5893(0).length());
		} else if (Static455.anInt7738 != 0) {
			if (local11.startsWith(Static369.aClass235_50.method5893(Static455.anInt7738))) {
				local13 = 0;
				arg0 = arg0.substring(Static369.aClass235_50.method5893(Static455.anInt7738).length());
			} else if (local11.startsWith(Static369.aClass235_51.method5893(Static455.anInt7738))) {
				local13 = 1;
				arg0 = arg0.substring(Static369.aClass235_51.method5893(Static455.anInt7738).length());
			} else if (local11.startsWith(Static369.aClass235_52.method5893(Static455.anInt7738))) {
				local13 = 2;
				arg0 = arg0.substring(Static369.aClass235_52.method5893(Static455.anInt7738).length());
			} else if (local11.startsWith(Static369.aClass235_53.method5893(Static455.anInt7738))) {
				local13 = 3;
				arg0 = arg0.substring(Static369.aClass235_53.method5893(Static455.anInt7738).length());
			} else if (local11.startsWith(Static369.aClass235_54.method5893(Static455.anInt7738))) {
				local13 = 4;
				arg0 = arg0.substring(Static369.aClass235_54.method5893(Static455.anInt7738).length());
			} else if (local11.startsWith(Static369.aClass235_55.method5893(Static455.anInt7738))) {
				local13 = 5;
				arg0 = arg0.substring(Static369.aClass235_55.method5893(Static455.anInt7738).length());
			} else if (local11.startsWith(Static369.aClass235_56.method5893(Static455.anInt7738))) {
				local13 = 6;
				arg0 = arg0.substring(Static369.aClass235_56.method5893(Static455.anInt7738).length());
			} else if (local11.startsWith(Static369.aClass235_57.method5893(Static455.anInt7738))) {
				local13 = 7;
				arg0 = arg0.substring(Static369.aClass235_57.method5893(Static455.anInt7738).length());
			} else if (local11.startsWith(Static369.aClass235_58.method5893(Static455.anInt7738))) {
				local13 = 8;
				arg0 = arg0.substring(Static369.aClass235_58.method5893(Static455.anInt7738).length());
			} else if (local11.startsWith(Static369.aClass235_59.method5893(Static455.anInt7738))) {
				local13 = 9;
				arg0 = arg0.substring(Static369.aClass235_59.method5893(Static455.anInt7738).length());
			} else if (local11.startsWith(Static369.aClass235_60.method5893(Static455.anInt7738))) {
				local13 = 10;
				arg0 = arg0.substring(Static369.aClass235_60.method5893(Static455.anInt7738).length());
			} else if (local11.startsWith(Static369.aClass235_61.method5893(Static455.anInt7738))) {
				local13 = 11;
				arg0 = arg0.substring(Static369.aClass235_61.method5893(Static455.anInt7738).length());
			}
		}
		local11 = arg0.toLowerCase();
		@Pc(451) byte local451 = 0;
		if (local11.startsWith(Class235.lb.method5893(0))) {
			local451 = 1;
			arg0 = arg0.substring(Class235.lb.method5893(0).length());
		} else if (local11.startsWith(Static369.aClass235_62.method5893(0))) {
			local451 = 2;
			arg0 = arg0.substring(Static369.aClass235_62.method5893(0).length());
		} else if (local11.startsWith(Static369.aClass235_63.method5893(0))) {
			local451 = 3;
			arg0 = arg0.substring(Static369.aClass235_63.method5893(0).length());
		} else if (local11.startsWith(Static369.aClass235_64.method5893(0))) {
			local451 = 4;
			arg0 = arg0.substring(Static369.aClass235_64.method5893(0).length());
		} else if (local11.startsWith(Static369.aClass235_65.method5893(0))) {
			local451 = 5;
			arg0 = arg0.substring(Static369.aClass235_65.method5893(0).length());
		} else if (Static455.anInt7738 != 0) {
			if (local11.startsWith(Class235.lb.method5893(Static455.anInt7738))) {
				local451 = 1;
				arg0 = arg0.substring(Class235.lb.method5893(Static455.anInt7738).length());
			} else if (local11.startsWith(Static369.aClass235_62.method5893(Static455.anInt7738))) {
				local451 = 2;
				arg0 = arg0.substring(Static369.aClass235_62.method5893(Static455.anInt7738).length());
			} else if (local11.startsWith(Static369.aClass235_63.method5893(Static455.anInt7738))) {
				local451 = 3;
				arg0 = arg0.substring(Static369.aClass235_63.method5893(Static455.anInt7738).length());
			} else if (local11.startsWith(Static369.aClass235_64.method5893(Static455.anInt7738))) {
				local451 = 4;
				arg0 = arg0.substring(Static369.aClass235_64.method5893(Static455.anInt7738).length());
			} else if (local11.startsWith(Static369.aClass235_65.method5893(Static455.anInt7738))) {
				local451 = 5;
				arg0 = arg0.substring(Static369.aClass235_65.method5893(Static455.anInt7738).length());
			}
		}
		@Pc(641) Class3_Sub27 local641 = Static59.method1040(Static325.aClass20_2, Static509.aClass314_116);
		local641.aClass3_Sub9_Sub2_2.method5572(0);
		@Pc(650) int local650 = local641.aClass3_Sub9_Sub2_2.anInt6453;
		local641.aClass3_Sub9_Sub2_2.method5572(local13);
		local641.aClass3_Sub9_Sub2_2.method5572(local451);
		Static525.method7635(arg0, local641.aClass3_Sub9_Sub2_2);
		local641.aClass3_Sub9_Sub2_2.method5615(local641.aClass3_Sub9_Sub2_2.anInt6453 - local650);
		Static148.method2572(local641);
	}

	@OriginalMember(owner = "client!oea", name = "a", descriptor = "(C)I")
	private static int method6278(@OriginalArg(0) char arg0) {
		return Static387.method6062(arg0) ? 1 : 0;
	}

	@OriginalMember(owner = "client!oea", name = "a", descriptor = "()V")
	public static void method6279() {
	}

	@OriginalMember(owner = "client!oea", name = "a", descriptor = "(IZ)V")
	private static void method6280(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1) {
		@Pc(137) Class344 local137;
		@Pc(25) int local25;
		@Pc(56) int local56;
		@Pc(19) int local19;
		@Pc(35) Class344 local35;
		@Pc(13) int local13;
		@Pc(210) Class344 local210;
		@Pc(158) Class344 local158;
		if (arg0 < 300) {
			if (arg0 == 100) {
				anInt7131 -= 3;
				local13 = anIntArray422[anInt7131];
				local19 = anIntArray422[anInt7131 + 1];
				local25 = anIntArray422[anInt7131 + 2];
				if (local19 == 0) {
					throw new RuntimeException();
				}
				local35 = Static324.method5363(local13);
				if (local35.aClass344Array2 == null) {
					local35.aClass344Array2 = new Class344[local25 + 1];
				}
				if (local35.aClass344Array2.length <= local25) {
					@Pc(54) Class344[] local54 = new Class344[local25 + 1];
					for (local56 = 0; local56 < local35.aClass344Array2.length; local56++) {
						local54[local56] = local35.aClass344Array2[local56];
					}
					local35.aClass344Array2 = local54;
				}
				if (local25 > 0 && local35.aClass344Array2[local25 - 1] == null) {
					throw new RuntimeException("Gap at:" + (local25 - 1));
				}
				@Pc(99) Class344 local99 = new Class344();
				local99.anInt9554 = local19;
				local99.anInt9632 = local99.anInt9571 = local35.anInt9571;
				local99.anInt9586 = local25;
				local35.aClass344Array2[local25] = local99;
				if (arg1) {
					aClass344_7 = local99;
				} else {
					aClass344_8 = local99;
				}
				Static605.method8323(local35);
				return;
			}
			if (arg0 == 101) {
				local137 = arg1 ? aClass344_7 : aClass344_8;
				if (local137.anInt9586 == -1) {
					if (arg1) {
						throw new RuntimeException("Tried to .cc_delete static .active-component!");
					}
					throw new RuntimeException("Tried to cc_delete static active-component!");
				}
				local158 = Static324.method5363(local137.anInt9571);
				local158.aClass344Array2[local137.anInt9586] = null;
				Static605.method8323(local158);
				return;
			}
			if (arg0 == 102) {
				local137 = Static324.method5363(anIntArray422[--anInt7131]);
				local137.aClass344Array2 = null;
				Static605.method8323(local137);
				return;
			}
			if (arg0 == 200) {
				anInt7131 -= 2;
				local13 = anIntArray422[anInt7131];
				local19 = anIntArray422[anInt7131 + 1];
				local210 = Static258.method4328(local13, local19);
				if (local210 != null && local19 != -1) {
					anIntArray422[anInt7131++] = 1;
					if (arg1) {
						aClass344_7 = local210;
						return;
					}
					aClass344_8 = local210;
					return;
				}
				anIntArray422[anInt7131++] = 0;
				return;
			}
			if (arg0 == 201) {
				local13 = anIntArray422[--anInt7131];
				local158 = Static324.method5363(local13);
				if (local158 != null) {
					anIntArray422[anInt7131++] = 1;
					if (arg1) {
						aClass344_7 = local158;
						return;
					}
					aClass344_8 = local158;
					return;
				}
				anIntArray422[anInt7131++] = 0;
				return;
			}
			if (arg0 == 202) {
				local13 = anIntArray422[--anInt7131];
				method6283(local13);
				return;
			}
			if (arg0 == 203) {
				local13 = anIntArray422[--anInt7131];
				method6290(local13);
				return;
			}
		} else {
			@Pc(357) int local357;
			@Pc(420) boolean local420;
			if (arg0 < 500) {
				if (arg0 == 403) {
					anInt7131 -= 2;
					local13 = anIntArray422[anInt7131];
					local19 = anIntArray422[anInt7131 + 1];
					if (Static68.aClass9_Sub2_Sub1_Sub2_Sub1_1.aClass375_1 == null) {
						return;
					}
					for (local25 = 0; local25 < Static266.anIntArray282.length; local25++) {
						if (Static266.anIntArray282[local25] == local13) {
							Static68.aClass9_Sub2_Sub1_Sub2_Sub1_1.aClass375_1.method8539(Static54.aClass22_1, local25, local19);
							return;
						}
					}
					for (local357 = 0; local357 < Static173.anIntArray208.length; local357++) {
						if (Static173.anIntArray208[local357] == local13) {
							Static68.aClass9_Sub2_Sub1_Sub2_Sub1_1.aClass375_1.method8539(Static54.aClass22_1, local357, local19);
							return;
						}
					}
					return;
				}
				if (arg0 == 404) {
					anInt7131 -= 2;
					local13 = anIntArray422[anInt7131];
					local19 = anIntArray422[anInt7131 + 1];
					if (Static68.aClass9_Sub2_Sub1_Sub2_Sub1_1.aClass375_1 == null) {
						return;
					}
					Static68.aClass9_Sub2_Sub1_Sub2_Sub1_1.aClass375_1.method8544(local13, local19);
					return;
				}
				if (arg0 == 410) {
					local420 = anIntArray422[--anInt7131] != 0;
					if (Static68.aClass9_Sub2_Sub1_Sub2_Sub1_1.aClass375_1 == null) {
						return;
					}
					Static68.aClass9_Sub2_Sub1_Sub2_Sub1_1.aClass375_1.method8537(local420);
					return;
				}
				if (arg0 == 411) {
					anInt7131 -= 2;
					local13 = anIntArray422[anInt7131];
					local19 = anIntArray422[anInt7131 + 1];
					if (Static68.aClass9_Sub2_Sub1_Sub2_Sub1_1.aClass375_1 == null) {
						return;
					}
					Static68.aClass9_Sub2_Sub1_Sub2_Sub1_1.aClass375_1.method8538(local19, local13, Static298.aClass132_1);
					return;
				}
			} else if ((arg0 < 1000 || arg0 >= 1100) && (arg0 < 2000 || arg0 >= 2100)) {
				@Pc(1523) String local1523;
				@Pc(1161) String local1161;
				if (arg0 >= 1100 && arg0 < 1200 || arg0 >= 2100 && arg0 < 2200) {
					if (arg0 >= 2000) {
						arg0 -= 1000;
						local137 = Static324.method5363(anIntArray422[--anInt7131]);
					} else {
						local137 = arg1 ? aClass344_7 : aClass344_8;
					}
					if (arg0 == 1100) {
						anInt7131 -= 2;
						local137.anInt9621 = anIntArray422[anInt7131];
						if (local137.anInt9621 > local137.anInt9562 - local137.anInt9546) {
							local137.anInt9621 = local137.anInt9562 - local137.anInt9546;
						}
						if (local137.anInt9621 < 0) {
							local137.anInt9621 = 0;
						}
						local137.anInt9618 = anIntArray422[anInt7131 + 1];
						if (local137.anInt9618 > local137.anInt9591 - local137.anInt9602) {
							local137.anInt9618 = local137.anInt9591 - local137.anInt9602;
						}
						if (local137.anInt9618 < 0) {
							local137.anInt9618 = 0;
						}
						Static605.method8323(local137);
						if (local137.anInt9586 == -1) {
							Static180.method2959(local137.anInt9571);
						}
						return;
					}
					if (arg0 == 1101) {
						local137.anInt9543 = anIntArray422[--anInt7131];
						Static605.method8323(local137);
						if (local137.anInt9586 == -1) {
							Static424.method6729(local137.anInt9571);
						}
						return;
					}
					if (arg0 == 1102) {
						local137.lb = anIntArray422[--anInt7131] == 1;
						Static605.method8323(local137);
						return;
					}
					if (arg0 == 1103) {
						local137.anInt9606 = anIntArray422[--anInt7131];
						Static605.method8323(local137);
						return;
					}
					if (arg0 == 1104) {
						local137.anInt9551 = anIntArray422[--anInt7131];
						Static605.method8323(local137);
						return;
					}
					if (arg0 == 1105) {
						local19 = anIntArray422[--anInt7131];
						if (local137.anInt9597 != local19) {
							local137.anInt9597 = local19;
							Static605.method8323(local137);
						}
						if (local137.anInt9586 == -1) {
							Static159.method2762(local137.anInt9571);
						}
						return;
					}
					if (arg0 == 1106) {
						local137.anInt9583 = anIntArray422[--anInt7131];
						Static605.method8323(local137);
						return;
					}
					if (arg0 == 1107) {
						local137.aBoolean720 = anIntArray422[--anInt7131] == 1;
						Static605.method8323(local137);
						return;
					}
					if (arg0 == 1108) {
						local137.anInt9611 = 1;
						local137.anInt9549 = anIntArray422[--anInt7131];
						Static605.method8323(local137);
						if (local137.anInt9586 == -1) {
							Static544.method7831(local137.anInt9571);
						}
						return;
					}
					if (arg0 == 1109) {
						anInt7131 -= 6;
						local137.anInt9572 = anIntArray422[anInt7131];
						local137.anInt9593 = anIntArray422[anInt7131 + 1];
						local137.anInt9609 = anIntArray422[anInt7131 + 2];
						local137.anInt9614 = anIntArray422[anInt7131 + 3];
						local137.anInt9613 = anIntArray422[anInt7131 + 4];
						local137.anInt9626 = anIntArray422[anInt7131 + 5];
						Static605.method8323(local137);
						if (local137.anInt9586 == -1) {
							Static646.method4014(local137.anInt9571);
							Static548.method8390(local137.anInt9571);
						}
						return;
					}
					if (arg0 == 1110) {
						local19 = anIntArray422[--anInt7131];
						if (local137.anInt9601 != local19) {
							local137.anInt9601 = local19;
							local137.anInt9582 = 0;
							local137.anInt9630 = 1;
							local137.anInt9556 = 0;
							@Pc(1110) Class267 local1110 = local137.anInt9601 == -1 ? null : Static474.aClass264_2.method6574(local137.anInt9601);
							if (local1110 != null) {
								Static491.method7210(local1110, local137.anInt9582);
							}
							Static605.method8323(local137);
						}
						if (local137.anInt9586 == -1) {
							Static89.method5574(local137.anInt9571);
						}
						return;
					}
					if (arg0 == 1111) {
						local137.aBoolean719 = anIntArray422[--anInt7131] == 1;
						Static605.method8323(local137);
						return;
					}
					if (arg0 == 1112) {
						local1161 = aStringArray56[--anInt7134];
						if (!local1161.equals(local137.aString95)) {
							local137.aString95 = local1161;
							Static605.method8323(local137);
						}
						if (local137.anInt9586 == -1) {
							Static446.method6672(local137.anInt9571);
						}
						return;
					}
					if (arg0 == 1113) {
						local137.anInt9548 = anIntArray422[--anInt7131];
						Static605.method8323(local137);
						if (local137.anInt9586 == -1) {
							Static392.method6209(local137.anInt9571);
						}
						return;
					}
					if (arg0 == 1114) {
						anInt7131 -= 3;
						local137.anInt9612 = anIntArray422[anInt7131];
						local137.anInt9570 = anIntArray422[anInt7131 + 1];
						local137.anInt9552 = anIntArray422[anInt7131 + 2];
						Static605.method8323(local137);
						return;
					}
					if (arg0 == 1115) {
						local137.aBoolean718 = anIntArray422[--anInt7131] == 1;
						Static605.method8323(local137);
						return;
					}
					if (arg0 == 1116) {
						local137.anInt9588 = anIntArray422[--anInt7131];
						Static605.method8323(local137);
						return;
					}
					if (arg0 == 1117) {
						local137.anInt9600 = anIntArray422[--anInt7131];
						Static605.method8323(local137);
						return;
					}
					if (arg0 == 1118) {
						local137.aBoolean715 = anIntArray422[--anInt7131] == 1;
						Static605.method8323(local137);
						return;
					}
					if (arg0 == 1119) {
						local137.aBoolean728 = anIntArray422[--anInt7131] == 1;
						Static605.method8323(local137);
						return;
					}
					if (arg0 == 1120) {
						anInt7131 -= 2;
						local137.anInt9562 = anIntArray422[anInt7131];
						local137.anInt9591 = anIntArray422[anInt7131 + 1];
						Static605.method8323(local137);
						if (local137.anInt9554 == 0) {
							Static335.method5417(false, local137);
						}
						return;
					}
					if (arg0 == 1122) {
						local137.aBoolean717 = anIntArray422[--anInt7131] == 1;
						Static605.method8323(local137);
						return;
					}
					if (arg0 == 1123) {
						local137.anInt9626 = anIntArray422[--anInt7131];
						Static605.method8323(local137);
						if (local137.anInt9586 == -1) {
							Static646.method4014(local137.anInt9571);
						}
						return;
					}
					if (arg0 == 1124) {
						local19 = anIntArray422[--anInt7131];
						local137.aBoolean724 = local19 == 1;
						Static605.method8323(local137);
						return;
					}
					if (arg0 == 1125) {
						anInt7131 -= 2;
						local137.anInt9625 = anIntArray422[anInt7131];
						local137.anInt9578 = anIntArray422[anInt7131 + 1];
						Static605.method8323(local137);
						return;
					}
					if (arg0 == 1126) {
						local137.anInt9550 = anIntArray422[--anInt7131];
						Static605.method8323(local137);
						return;
					}
					@Pc(1489) Class108 local1489;
					if (arg0 == 1127) {
						anInt7131 -= 2;
						local19 = anIntArray422[anInt7131];
						local25 = anIntArray422[anInt7131 + 1];
						local1489 = Static220.aClass214_2.method5419(local19);
						if (local25 == local1489.anInt3158) {
							local137.method8179(local19);
							return;
						} else {
							local137.method8168(local25, local19);
							return;
						}
					}
					if (arg0 == 1128) {
						local19 = anIntArray422[--anInt7131];
						local1523 = aStringArray56[--anInt7134];
						local1489 = Static220.aClass214_2.method5419(local19);
						if (!local1489.aString23.equals(local1523)) {
							local137.method8169(local1523, local19);
							return;
						}
						local137.method8179(local19);
						return;
					}
					if (arg0 == 1129 || arg0 == 1130) {
						local19 = anIntArray422[--anInt7131];
						if (local137.anInt9554 != 5 && arg0 == 1129 || local137.anInt9554 != 4 && arg0 == 1130) {
							return;
						}
						if (local137.anInt9545 != local19) {
							local137.anInt9545 = local19;
							Static605.method8323(local137);
						}
						if (local137.anInt9586 == -1) {
							Static520.method7576(local137.anInt9571);
						}
						return;
					}
				} else if ((arg0 < 1200 || arg0 >= 1300) && (arg0 < 2200 || arg0 >= 2300)) {
					@Pc(2373) int local2373;
					if (arg0 >= 1300 && arg0 < 1400 || arg0 >= 2300 && arg0 < 2400) {
						if (arg0 >= 2000) {
							arg0 -= 1000;
							local137 = Static324.method5363(anIntArray422[--anInt7131]);
						} else {
							local137 = arg1 ? aClass344_7 : aClass344_8;
						}
						if (arg0 == 1300) {
							local19 = anIntArray422[--anInt7131] - 1;
							if (local19 >= 0 && local19 <= 9) {
								local137.method8178(aStringArray56[--anInt7134], local19);
								return;
							}
							anInt7134--;
							return;
						}
						if (arg0 == 1301) {
							anInt7131 -= 2;
							local19 = anIntArray422[anInt7131];
							local25 = anIntArray422[anInt7131 + 1];
							if (local19 == -1 && local25 == -1) {
								local137.aClass344_14 = null;
								return;
							}
							local137.aClass344_14 = Static258.method4328(local19, local25);
							return;
						}
						if (arg0 == 1302) {
							local19 = anIntArray422[--anInt7131];
							if (local19 != Static302.anInt5958 && local19 != Static302.anInt5959 && local19 != Static207.anInt3783) {
								return;
							}
							local137.anInt9555 = local19;
							return;
						}
						if (arg0 == 1303) {
							local137.anInt9623 = anIntArray422[--anInt7131];
							return;
						}
						if (arg0 == 1304) {
							local137.anInt9560 = anIntArray422[--anInt7131];
							return;
						}
						if (arg0 == 1305) {
							local137.aString93 = aStringArray56[--anInt7134];
							return;
						}
						if (arg0 == 1306) {
							local137.aString92 = aStringArray56[--anInt7134];
							return;
						}
						if (arg0 == 1307) {
							local137.aStringArray77 = null;
							return;
						}
						if (arg0 == 1308) {
							local137.anInt9581 = anIntArray422[--anInt7131];
							local137.anInt9584 = anIntArray422[--anInt7131];
							return;
						}
						if (arg0 == 1309) {
							local19 = anIntArray422[--anInt7131];
							local25 = anIntArray422[--anInt7131];
							if (local25 >= 1 && local25 <= 10) {
								local137.method8164(local19, local25 - 1);
							}
							return;
						}
						if (arg0 == 1310) {
							local137.aString91 = aStringArray56[--anInt7134];
							return;
						}
						if (arg0 == 1311) {
							local137.anInt9564 = anIntArray422[--anInt7131];
							return;
						}
						if (arg0 == 1312 || arg0 == 1313) {
							if (arg0 == 1312) {
								anInt7131 -= 3;
								local19 = anIntArray422[anInt7131] - 1;
								local25 = anIntArray422[anInt7131 + 1];
								local357 = anIntArray422[anInt7131 + 2];
								if (local19 < 0 || local19 > 9) {
									throw new RuntimeException("IOR13121313");
								}
							} else {
								anInt7131 -= 2;
								local19 = 10;
								local25 = anIntArray422[anInt7131];
								local357 = anIntArray422[anInt7131 + 1];
							}
							if (local137.aByteArray95 == null) {
								if (local25 == 0) {
									return;
								}
								local137.aByteArray95 = new byte[11];
								local137.aByteArray96 = new byte[11];
								local137.anIntArray599 = new int[11];
							}
							local137.aByteArray95[local19] = (byte) local25;
							if (local25 == 0) {
								local137.aBoolean725 = false;
								for (local2373 = 0; local2373 < local137.aByteArray95.length; local2373++) {
									if (local137.aByteArray95[local2373] != 0) {
										local137.aBoolean725 = true;
										break;
									}
								}
							} else {
								local137.aBoolean725 = true;
							}
							local137.aByteArray96[local19] = (byte) local357;
							return;
						}
						if (arg0 == 1314) {
							local137.anInt9547 = anIntArray422[--anInt7131];
							return;
						}
					} else if (arg0 >= 1400 && arg0 < 1500 || arg0 >= 2400 && arg0 < 2500) {
						if (arg0 >= 2000) {
							arg0 -= 1000;
							local137 = Static324.method5363(anIntArray422[--anInt7131]);
						} else {
							local137 = arg1 ? aClass344_7 : aClass344_8;
						}
						if (arg0 == 1499) {
							local137.method8172();
							return;
						}
						local1161 = aStringArray56[--anInt7134];
						@Pc(2459) int[] local2459 = null;
						if (local1161.length() > 0 && local1161.charAt(local1161.length() - 1) == 'Y') {
							local357 = anIntArray422[--anInt7131];
							if (local357 > 0) {
								local2459 = new int[local357];
								while (local357-- > 0) {
									local2459[local357] = anIntArray422[--anInt7131];
								}
							}
							local1161 = local1161.substring(0, local1161.length() - 1);
						}
						@Pc(2511) Object[] local2511 = new Object[local1161.length() + 1];
						for (local2373 = local2511.length - 1; local2373 >= 1; local2373--) {
							if (local1161.charAt(local2373 - 1) == 's') {
								local2511[local2373] = aStringArray56[--anInt7134];
							} else {
								local2511[local2373] = Integer.valueOf(anIntArray422[--anInt7131]);
							}
						}
						local56 = anIntArray422[--anInt7131];
						if (local56 == -1) {
							local2511 = null;
						} else {
							local2511[0] = Integer.valueOf(local56);
						}
						if (arg0 == 1400) {
							local137.anObjectArray29 = local2511;
						} else if (arg0 == 1401) {
							local137.anObjectArray11 = local2511;
						} else if (arg0 == 1402) {
							local137.anObjectArray12 = local2511;
						} else if (arg0 == 1403) {
							local137.anObjectArray5 = local2511;
						} else if (arg0 == 1404) {
							local137.anObjectArray16 = local2511;
						} else if (arg0 == 1405) {
							local137.anObjectArray6 = local2511;
						} else if (arg0 == 1406) {
							local137.anObjectArray20 = local2511;
						} else if (arg0 == 1407) {
							local137.anObjectArray27 = local2511;
							local137.anIntArray597 = local2459;
						} else if (arg0 == 1408) {
							local137.anObjectArray18 = local2511;
						} else if (arg0 == 1409) {
							local137.anObjectArray23 = local2511;
						} else if (arg0 == 1410) {
							local137.anObjectArray10 = local2511;
						} else if (arg0 == 1411) {
							local137.anObjectArray4 = local2511;
						} else if (arg0 == 1412) {
							local137.anObjectArray25 = local2511;
						} else if (arg0 == 1414) {
							local137.anObjectArray32 = local2511;
							local137.anIntArray598 = local2459;
						} else if (arg0 == 1415) {
							local137.anObjectArray33 = local2511;
							local137.anIntArray606 = local2459;
						} else if (arg0 == 1416) {
							local137.anObjectArray21 = local2511;
						} else if (arg0 == 1417) {
							local137.anObjectArray3 = local2511;
						} else if (arg0 == 1418) {
							local137.anObjectArray19 = local2511;
						} else if (arg0 == 1419) {
							local137.anObjectArray31 = local2511;
						} else if (arg0 == 1420) {
							local137.anObjectArray15 = local2511;
						} else if (arg0 == 1421) {
							local137.anObjectArray22 = local2511;
						} else if (arg0 == 1422) {
							local137.anObjectArray14 = local2511;
						} else if (arg0 == 1423) {
							local137.anObjectArray9 = local2511;
						} else if (arg0 == 1424) {
							local137.anObjectArray30 = local2511;
						} else if (arg0 == 1425) {
							local137.anObjectArray28 = local2511;
						} else if (arg0 == 1426) {
							local137.anObjectArray17 = local2511;
						} else if (arg0 == 1427) {
							local137.anObjectArray8 = local2511;
						} else if (arg0 == 1428) {
							local137.anObjectArray13 = local2511;
							local137.anIntArray603 = local2459;
						} else if (arg0 == 1429) {
							local137.anObjectArray24 = local2511;
							local137.anIntArray601 = local2459;
						} else if (arg0 == 1430) {
							local137.anObjectArray7 = local2511;
						}
						local137.aBoolean716 = true;
						return;
					} else if (arg0 < 1600) {
						local137 = arg1 ? aClass344_7 : aClass344_8;
						if (arg0 == 1500) {
							anIntArray422[anInt7131++] = local137.anInt9569;
							return;
						}
						if (arg0 == 1501) {
							anIntArray422[anInt7131++] = local137.anInt9573;
							return;
						}
						if (arg0 == 1502) {
							anIntArray422[anInt7131++] = local137.anInt9546;
							return;
						}
						if (arg0 == 1503) {
							anIntArray422[anInt7131++] = local137.anInt9602;
							return;
						}
						if (arg0 == 1504) {
							anIntArray422[anInt7131++] = local137.aBoolean730 ? 1 : 0;
							return;
						}
						if (arg0 == 1505) {
							anIntArray422[anInt7131++] = local137.anInt9632;
							return;
						}
						if (arg0 == 1506) {
							local158 = Static565.method6923(local137);
							anIntArray422[anInt7131++] = local158 == null ? -1 : local158.anInt9571;
							return;
						}
					} else {
						@Pc(3107) Class108 local3107;
						if (arg0 < 1700) {
							local137 = arg1 ? aClass344_7 : aClass344_8;
							if (arg0 == 1600) {
								anIntArray422[anInt7131++] = local137.anInt9621;
								return;
							}
							if (arg0 == 1601) {
								anIntArray422[anInt7131++] = local137.anInt9618;
								return;
							}
							if (arg0 == 1602) {
								aStringArray56[anInt7134++] = local137.aString95;
								return;
							}
							if (arg0 == 1603) {
								anIntArray422[anInt7131++] = local137.anInt9562;
								return;
							}
							if (arg0 == 1604) {
								anIntArray422[anInt7131++] = local137.anInt9591;
								return;
							}
							if (arg0 == 1605) {
								anIntArray422[anInt7131++] = local137.anInt9626;
								return;
							}
							if (arg0 == 1606) {
								anIntArray422[anInt7131++] = local137.anInt9609;
								return;
							}
							if (arg0 == 1607) {
								anIntArray422[anInt7131++] = local137.anInt9613;
								return;
							}
							if (arg0 == 1608) {
								anIntArray422[anInt7131++] = local137.anInt9614;
								return;
							}
							if (arg0 == 1609) {
								anIntArray422[anInt7131++] = local137.anInt9606;
								return;
							}
							if (arg0 == 1610) {
								anIntArray422[anInt7131++] = local137.anInt9572;
								return;
							}
							if (arg0 == 1611) {
								anIntArray422[anInt7131++] = local137.anInt9593;
								return;
							}
							if (arg0 == 1612) {
								anIntArray422[anInt7131++] = local137.anInt9597;
								return;
							}
							if (arg0 == 1613) {
								local19 = anIntArray422[--anInt7131];
								local3107 = Static220.aClass214_2.method5419(local19);
								if (local3107.method2736()) {
									aStringArray56[anInt7134++] = local137.method8176(local19, local3107.aString23);
									return;
								}
								anIntArray422[anInt7131++] = local137.method8165(local3107.anInt3158, local19);
								return;
							}
							if (arg0 == 1614) {
								anIntArray422[anInt7131++] = local137.anInt9583;
								return;
							}
							if (arg0 == 2614) {
								anIntArray422[anInt7131++] = local137.anInt9611 == 1 ? local137.anInt9549 : -1;
								return;
							}
						} else if (arg0 < 1800) {
							local137 = arg1 ? aClass344_7 : aClass344_8;
							if (arg0 == 1700) {
								anIntArray422[anInt7131++] = local137.anInt9567;
								return;
							}
							if (arg0 == 1701) {
								if (local137.anInt9567 != -1) {
									anIntArray422[anInt7131++] = local137.anInt9565;
									return;
								}
								anIntArray422[anInt7131++] = 0;
								return;
							}
							if (arg0 == 1702) {
								anIntArray422[anInt7131++] = local137.anInt9586;
								return;
							}
						} else if (arg0 < 1900) {
							local137 = arg1 ? aClass344_7 : aClass344_8;
							if (arg0 == 1800) {
								anIntArray422[anInt7131++] = Static76.method1311(local137).method8089();
								return;
							}
							if (arg0 == 1801) {
								local19 = anIntArray422[--anInt7131];
								local19--;
								if (local137.aStringArray77 != null && local19 < local137.aStringArray77.length && local137.aStringArray77[local19] != null) {
									aStringArray56[anInt7134++] = local137.aStringArray77[local19];
									return;
								}
								aStringArray56[anInt7134++] = "";
								return;
							}
							if (arg0 == 1802) {
								if (local137.aString93 == null) {
									aStringArray56[anInt7134++] = "";
									return;
								}
								aStringArray56[anInt7134++] = local137.aString93;
								return;
							}
						} else if (arg0 < 2000 || arg0 >= 2900 && arg0 < 3000) {
							if (arg0 >= 2000) {
								local137 = Static324.method5363(anIntArray422[--anInt7131]);
								arg0 -= 1000;
							} else {
								local137 = arg1 ? aClass344_7 : aClass344_8;
							}
							if (anInt7141 >= 10) {
								throw new RuntimeException("C29xx-1");
							}
							if (arg0 == 1927) {
								if (local137.anObjectArray8 == null) {
									return;
								}
								@Pc(3376) Class3_Sub36 local3376 = new Class3_Sub36();
								local3376.aClass344_6 = local137;
								local3376.anObjectArray1 = local137.anObjectArray8;
								local3376.anInt6955 = anInt7141 + 1;
								Static361.aClass216_48.method5449(local3376);
								return;
							}
						} else if (arg0 < 2600) {
							local137 = Static324.method5363(anIntArray422[--anInt7131]);
							if (arg0 == 2500) {
								anIntArray422[anInt7131++] = local137.anInt9569;
								return;
							}
							if (arg0 == 2501) {
								anIntArray422[anInt7131++] = local137.anInt9573;
								return;
							}
							if (arg0 == 2502) {
								anIntArray422[anInt7131++] = local137.anInt9546;
								return;
							}
							if (arg0 == 2503) {
								anIntArray422[anInt7131++] = local137.anInt9602;
								return;
							}
							if (arg0 == 2504) {
								anIntArray422[anInt7131++] = local137.aBoolean730 ? 1 : 0;
								return;
							}
							if (arg0 == 2505) {
								anIntArray422[anInt7131++] = local137.anInt9632;
								return;
							}
							if (arg0 == 1506) {
								local158 = Static565.method6923(local137);
								anIntArray422[anInt7131++] = local158 == null ? -1 : local158.anInt9571;
								return;
							}
						} else if (arg0 < 2700) {
							local137 = Static324.method5363(anIntArray422[--anInt7131]);
							if (arg0 == 2600) {
								anIntArray422[anInt7131++] = local137.anInt9621;
								return;
							}
							if (arg0 == 2601) {
								anIntArray422[anInt7131++] = local137.anInt9618;
								return;
							}
							if (arg0 == 2602) {
								aStringArray56[anInt7134++] = local137.aString95;
								return;
							}
							if (arg0 == 2603) {
								anIntArray422[anInt7131++] = local137.anInt9562;
								return;
							}
							if (arg0 == 2604) {
								anIntArray422[anInt7131++] = local137.anInt9591;
								return;
							}
							if (arg0 == 2605) {
								anIntArray422[anInt7131++] = local137.anInt9626;
								return;
							}
							if (arg0 == 2606) {
								anIntArray422[anInt7131++] = local137.anInt9609;
								return;
							}
							if (arg0 == 2607) {
								anIntArray422[anInt7131++] = local137.anInt9613;
								return;
							}
							if (arg0 == 2608) {
								anIntArray422[anInt7131++] = local137.anInt9614;
								return;
							}
							if (arg0 == 2609) {
								anIntArray422[anInt7131++] = local137.anInt9606;
								return;
							}
							if (arg0 == 2610) {
								anIntArray422[anInt7131++] = local137.anInt9572;
								return;
							}
							if (arg0 == 2611) {
								anIntArray422[anInt7131++] = local137.anInt9593;
								return;
							}
							if (arg0 == 2612) {
								anIntArray422[anInt7131++] = local137.anInt9597;
								return;
							}
							if (arg0 == 2613) {
								anIntArray422[anInt7131++] = local137.anInt9583;
								return;
							}
							if (arg0 == 2614) {
								anIntArray422[anInt7131++] = local137.anInt9611 == 1 ? local137.anInt9549 : -1;
								return;
							}
						} else {
							@Pc(3905) Class3_Sub1 local3905;
							@Pc(3803) Class3_Sub1 local3803;
							if (arg0 < 2800) {
								if (arg0 == 2700) {
									local137 = Static324.method5363(anIntArray422[--anInt7131]);
									anIntArray422[anInt7131++] = local137.anInt9567;
									return;
								}
								if (arg0 == 2701) {
									local137 = Static324.method5363(anIntArray422[--anInt7131]);
									if (local137.anInt9567 != -1) {
										anIntArray422[anInt7131++] = local137.anInt9565;
										return;
									}
									anIntArray422[anInt7131++] = 0;
									return;
								}
								if (arg0 == 2702) {
									local13 = anIntArray422[--anInt7131];
									local3803 = (Class3_Sub1) Static128.aClass25_7.method426((long) local13);
									if (local3803 != null) {
										anIntArray422[anInt7131++] = 1;
										return;
									}
									anIntArray422[anInt7131++] = 0;
									return;
								}
								if (arg0 == 2703) {
									local137 = Static324.method5363(anIntArray422[--anInt7131]);
									if (local137.aClass344Array2 == null) {
										anIntArray422[anInt7131++] = 0;
										return;
									}
									local19 = local137.aClass344Array2.length;
									for (local25 = 0; local25 < local137.aClass344Array2.length; local25++) {
										if (local137.aClass344Array2[local25] == null) {
											local19 = local25;
											break;
										}
									}
									anIntArray422[anInt7131++] = local19;
									return;
								}
								if (arg0 == 2704 || arg0 == 2705) {
									anInt7131 -= 2;
									local13 = anIntArray422[anInt7131];
									local19 = anIntArray422[anInt7131 + 1];
									local3905 = (Class3_Sub1) Static128.aClass25_7.method426((long) local13);
									if (local3905 != null && local3905.anInt24 == local19) {
										anIntArray422[anInt7131++] = 1;
										return;
									}
									anIntArray422[anInt7131++] = 0;
									return;
								}
							} else if (arg0 < 2900) {
								local137 = Static324.method5363(anIntArray422[--anInt7131]);
								if (arg0 == 2800) {
									anIntArray422[anInt7131++] = Static76.method1311(local137).method8089();
									return;
								}
								if (arg0 == 2801) {
									local19 = anIntArray422[--anInt7131];
									local19--;
									if (local137.aStringArray77 != null && local19 < local137.aStringArray77.length && local137.aStringArray77[local19] != null) {
										aStringArray56[anInt7134++] = local137.aStringArray77[local19];
										return;
									}
									aStringArray56[anInt7134++] = "";
									return;
								}
								if (arg0 == 2802) {
									if (local137.aString93 == null) {
										aStringArray56[anInt7134++] = "";
										return;
									}
									aStringArray56[anInt7134++] = local137.aString93;
									return;
								}
							} else {
								@Pc(4131) Class3_Sub27 local4131;
								@Pc(4042) String local4042;
								if (arg0 < 3200) {
									if (arg0 == 3100) {
										local4042 = aStringArray56[--anInt7134];
										Static525.method7637(local4042);
										return;
									}
									if (arg0 == 3101) {
										anInt7131 -= 2;
										Static188.method3053(anIntArray422[anInt7131 + 1], anIntArray422[anInt7131], Static68.aClass9_Sub2_Sub1_Sub2_Sub1_1);
										return;
									}
									if (arg0 == 3103) {
										Static291.method4808();
										return;
									}
									if (arg0 == 3104) {
										local4042 = aStringArray56[--anInt7134];
										local19 = 0;
										if (Static279.method4561(local4042)) {
											local19 = Static508.method7720(local4042);
										}
										@Pc(4102) Class3_Sub27 local4102 = Static59.method1040(Static325.aClass20_2, Static253.aClass314_77);
										local4102.aClass3_Sub9_Sub2_2.method5601(local19);
										Static148.method2572(local4102);
										return;
									}
									if (arg0 == 3105) {
										local4042 = aStringArray56[--anInt7134];
										local4131 = Static59.method1040(Static325.aClass20_2, Static64.aClass314_24);
										local4131.aClass3_Sub9_Sub2_2.method5572(local4042.length() + 1);
										local4131.aClass3_Sub9_Sub2_2.method5638(local4042);
										Static148.method2572(local4131);
										return;
									}
									if (arg0 == 3106) {
										local4042 = aStringArray56[--anInt7134];
										local4131 = Static59.method1040(Static325.aClass20_2, Static102.aClass314_38);
										local4131.aClass3_Sub9_Sub2_2.method5572(local4042.length() + 1);
										local4131.aClass3_Sub9_Sub2_2.method5638(local4042);
										Static148.method2572(local4131);
										return;
									}
									if (arg0 == 3107) {
										local13 = anIntArray422[--anInt7131];
										local1161 = aStringArray56[--anInt7134];
										Static190.method3068(local1161, local13);
										return;
									}
									if (arg0 == 3108) {
										anInt7131 -= 3;
										local13 = anIntArray422[anInt7131];
										local19 = anIntArray422[anInt7131 + 1];
										local25 = anIntArray422[anInt7131 + 2];
										local35 = Static324.method5363(local25);
										Static390.method6096(local19, local13, local35);
										return;
									}
									if (arg0 == 3109) {
										anInt7131 -= 2;
										local13 = anIntArray422[anInt7131];
										local19 = anIntArray422[anInt7131 + 1];
										local210 = arg1 ? aClass344_7 : aClass344_8;
										Static390.method6096(local19, local13, local210);
										return;
									}
									if (arg0 == 3110) {
										local13 = anIntArray422[--anInt7131];
										local4131 = Static59.method1040(Static325.aClass20_2, Static199.aClass314_68);
										local4131.aClass3_Sub9_Sub2_2.method5620(local13);
										Static148.method2572(local4131);
										return;
									}
									if (arg0 == 3111) {
										anInt7131 -= 2;
										local13 = anIntArray422[anInt7131];
										local19 = anIntArray422[anInt7131 + 1];
										local3905 = (Class3_Sub1) Static128.aClass25_7.method426((long) local13);
										if (local3905 != null) {
											Static69.method1233(local3905, local3905.anInt24 != local19, true);
										}
										Static90.method7198(3, local19, true, local13);
										return;
									}
									if (arg0 == 3112) {
										anInt7131--;
										local13 = anIntArray422[anInt7131];
										local3803 = (Class3_Sub1) Static128.aClass25_7.method426((long) local13);
										if (local3803 != null && local3803.anInt25 == 3) {
											Static69.method1233(local3803, true, true);
										}
										return;
									}
									if (arg0 == 3113) {
										Static351.method5662(aStringArray56[--anInt7134]);
										return;
									}
									if (arg0 == 3114) {
										anInt7131 -= 2;
										local13 = anIntArray422[anInt7131];
										local19 = anIntArray422[anInt7131 + 1];
										local1523 = aStringArray56[--anInt7134];
										Static329.method5394(local1523, "", "", "", local13, local19);
										return;
									}
									if (arg0 == 3115) {
										anInt7131 -= 11;
										@Pc(4432) Class293[] local4432 = Static76.method1319();
										@Pc(4435) Class15[] local4435 = Static582.method8112();
										Static412.method6386(local4435[anIntArray422[anInt7131 + 1]], anIntArray422[anInt7131 + 5], anIntArray422[anInt7131 + 4], anIntArray422[anInt7131 + 7], anIntArray422[anInt7131 + 8], anIntArray422[anInt7131 + 9], local4432[anIntArray422[anInt7131]], anIntArray422[anInt7131 + 2], anIntArray422[anInt7131 + 10], anIntArray422[anInt7131 + 3], anIntArray422[anInt7131 + 6]);
										return;
									}
								} else if (arg0 < 3300) {
									if (arg0 == 3200) {
										anInt7131 -= 3;
										Static93.method1568(anIntArray422[anInt7131], 256, 255, anIntArray422[anInt7131 + 1], anIntArray422[anInt7131 + 2]);
										return;
									}
									if (arg0 == 3201) {
										Static40.method733(anIntArray422[--anInt7131], 50, 255);
										return;
									}
									if (arg0 == 3202) {
										anInt7131 -= 2;
										Static208.method3270(anIntArray422[anInt7131 + 1], 255, anIntArray422[anInt7131]);
										return;
									}
									if (arg0 == 3203) {
										anInt7131 -= 4;
										Static93.method1568(anIntArray422[anInt7131], 256, anIntArray422[anInt7131 + 3], anIntArray422[anInt7131 + 1], anIntArray422[anInt7131 + 2]);
										return;
									}
									if (arg0 == 3204) {
										anInt7131 -= 3;
										Static40.method733(anIntArray422[anInt7131], anIntArray422[anInt7131 + 2], anIntArray422[anInt7131 + 1]);
										return;
									}
									if (arg0 == 3205) {
										anInt7131 -= 3;
										Static208.method3270(anIntArray422[anInt7131 + 1], anIntArray422[anInt7131 + 2], anIntArray422[anInt7131]);
										return;
									}
									if (arg0 == 3206) {
										anInt7131 -= 4;
										Static84.method7777(anIntArray422[anInt7131 + 3], anIntArray422[anInt7131], 256, false, anIntArray422[anInt7131 + 2], anIntArray422[anInt7131 + 1]);
										return;
									}
									if (arg0 == 3207) {
										anInt7131 -= 4;
										Static84.method7777(anIntArray422[anInt7131 + 3], anIntArray422[anInt7131], 256, true, anIntArray422[anInt7131 + 2], anIntArray422[anInt7131 + 1]);
										return;
									}
									if (arg0 == 3208) {
										anInt7131 -= 5;
										Static93.method1568(anIntArray422[anInt7131], anIntArray422[anInt7131 + 4], anIntArray422[anInt7131 + 3], anIntArray422[anInt7131 + 1], anIntArray422[anInt7131 + 2]);
										return;
									}
									if (arg0 == 3209) {
										anInt7131 -= 5;
										Static84.method7777(anIntArray422[anInt7131 + 3], anIntArray422[anInt7131], anIntArray422[anInt7131 + 4], false, anIntArray422[anInt7131 + 2], anIntArray422[anInt7131 + 1]);
										return;
									}
								} else if (arg0 < 3400) {
									if (arg0 == 3300) {
										anIntArray422[anInt7131++] = Static304.anInt8391;
										return;
									}
									if (arg0 == 3301) {
										anInt7131 -= 2;
										local13 = anIntArray422[anInt7131];
										local19 = anIntArray422[anInt7131 + 1];
										anIntArray422[anInt7131++] = Static542.method7795(false, local13, local19);
										return;
									}
									if (arg0 == 3302) {
										anInt7131 -= 2;
										local13 = anIntArray422[anInt7131];
										local19 = anIntArray422[anInt7131 + 1];
										anIntArray422[anInt7131++] = Static443.method6639(local13, false, local19);
										return;
									}
									if (arg0 == 3303) {
										anInt7131 -= 2;
										local13 = anIntArray422[anInt7131];
										local19 = anIntArray422[anInt7131 + 1];
										anIntArray422[anInt7131++] = Static87.method1476(local19, false, local13);
										return;
									}
									if (arg0 == 3304) {
										local13 = anIntArray422[--anInt7131];
										anIntArray422[anInt7131++] = Static543.aClass115_1.method2800(local13).anInt8969;
										return;
									}
									if (arg0 == 3305) {
										local13 = anIntArray422[--anInt7131];
										anIntArray422[anInt7131++] = Static442.anIntArray462[local13];
										return;
									}
									if (arg0 == 3306) {
										local13 = anIntArray422[--anInt7131];
										anIntArray422[anInt7131++] = Static389.anIntArray406[local13];
										return;
									}
									if (arg0 == 3307) {
										local13 = anIntArray422[--anInt7131];
										anIntArray422[anInt7131++] = Static114.anIntArray160[local13];
										return;
									}
									if (arg0 == 3308) {
										@Pc(4960) byte local4960 = Static68.aClass9_Sub2_Sub1_Sub2_Sub1_1.aByte127;
										local19 = (Static68.aClass9_Sub2_Sub1_Sub2_Sub1_1.anInt10152 >> 9) + Static427.anInt7462;
										local25 = (Static68.aClass9_Sub2_Sub1_Sub2_Sub1_1.anInt10158 >> 9) + Static22.anInt329;
										anIntArray422[anInt7131++] = (local4960 << 28) + (local19 << 14) + local25;
										return;
									}
									if (arg0 == 3309) {
										local13 = anIntArray422[--anInt7131];
										anIntArray422[anInt7131++] = local13 >> 14 & 0x3FFF;
										return;
									}
									if (arg0 == 3310) {
										local13 = anIntArray422[--anInt7131];
										anIntArray422[anInt7131++] = local13 >> 28;
										return;
									}
									if (arg0 == 3311) {
										local13 = anIntArray422[--anInt7131];
										anIntArray422[anInt7131++] = local13 & 0x3FFF;
										return;
									}
									if (arg0 == 3312) {
										anIntArray422[anInt7131++] = Static166.aBoolean243 ? 1 : 0;
										return;
									}
									if (arg0 == 3313) {
										anInt7131 -= 2;
										local13 = anIntArray422[anInt7131];
										local19 = anIntArray422[anInt7131 + 1];
										anIntArray422[anInt7131++] = Static542.method7795(true, local13, local19);
										return;
									}
									if (arg0 == 3314) {
										anInt7131 -= 2;
										local13 = anIntArray422[anInt7131];
										local19 = anIntArray422[anInt7131 + 1];
										anIntArray422[anInt7131++] = Static443.method6639(local13, true, local19);
										return;
									}
									if (arg0 == 3315) {
										anInt7131 -= 2;
										local13 = anIntArray422[anInt7131];
										local19 = anIntArray422[anInt7131 + 1];
										anIntArray422[anInt7131++] = Static87.method1476(local19, true, local13);
										return;
									}
									if (arg0 == 3316) {
										if (Static544.anInt9130 >= 2) {
											anIntArray422[anInt7131++] = Static544.anInt9130;
											return;
										}
										anIntArray422[anInt7131++] = 0;
										return;
									}
									if (arg0 == 3317) {
										anIntArray422[anInt7131++] = Static269.anInt5252;
										return;
									}
									if (arg0 == 3318) {
										anIntArray422[anInt7131++] = Static28.aClass157_1.anInt4641;
										return;
									}
									if (arg0 == 3321) {
										anIntArray422[anInt7131++] = Static461.anInt7890;
										return;
									}
									if (arg0 == 3322) {
										anIntArray422[anInt7131++] = Static475.anInt8127;
										return;
									}
									if (arg0 == 3323) {
										if (Static124.anInt2654 >= 5 && Static124.anInt2654 <= 9) {
											anIntArray422[anInt7131++] = 1;
											return;
										}
										anIntArray422[anInt7131++] = 0;
										return;
									}
									if (arg0 == 3324) {
										if (Static124.anInt2654 >= 5 && Static124.anInt2654 <= 9) {
											anIntArray422[anInt7131++] = Static124.anInt2654;
											return;
										}
										anIntArray422[anInt7131++] = 0;
										return;
									}
									if (arg0 == 3325) {
										anIntArray422[anInt7131++] = Static367.aBoolean486 ? 1 : 0;
										return;
									}
									if (arg0 == 3326) {
										anIntArray422[anInt7131++] = Static68.aClass9_Sub2_Sub1_Sub2_Sub1_1.anInt1306;
										return;
									}
									if (arg0 == 3327) {
										anIntArray422[anInt7131++] = Static68.aClass9_Sub2_Sub1_Sub2_Sub1_1.aClass375_1 != null && Static68.aClass9_Sub2_Sub1_Sub2_Sub1_1.aClass375_1.aBoolean763 ? 1 : 0;
										return;
									}
									if (arg0 == 3329) {
										anIntArray422[anInt7131++] = Static61.aBoolean57 ? 1 : 0;
										return;
									}
									if (arg0 == 3330) {
										local13 = anIntArray422[--anInt7131];
										anIntArray422[anInt7131++] = Static308.method1835(local13);
										return;
									}
									if (arg0 == 3331) {
										anInt7131 -= 2;
										local13 = anIntArray422[anInt7131];
										local19 = anIntArray422[anInt7131 + 1];
										anIntArray422[anInt7131++] = Static300.method8283(local19, false, local13);
										return;
									}
									if (arg0 == 3332) {
										anInt7131 -= 2;
										local13 = anIntArray422[anInt7131];
										local19 = anIntArray422[anInt7131 + 1];
										anIntArray422[anInt7131++] = Static300.method8283(local19, true, local13);
										return;
									}
									if (arg0 == 3333) {
										anIntArray422[anInt7131++] = Static550.anInt9147;
										return;
									}
									if (arg0 == 3335) {
										anIntArray422[anInt7131++] = Static455.anInt7738;
										return;
									}
									if (arg0 == 3336) {
										anInt7131 -= 4;
										local13 = anIntArray422[anInt7131];
										local19 = anIntArray422[anInt7131 + 1];
										local25 = anIntArray422[anInt7131 + 2];
										local357 = anIntArray422[anInt7131 + 3];
										local13 += local19 << 14;
										local13 += local25 << 28;
										local13 += local357;
										anIntArray422[anInt7131++] = local13;
										return;
									}
									if (arg0 == 3337) {
										anIntArray422[anInt7131++] = Static541.anInt9077;
										return;
									}
									if (arg0 == 3338) {
										anIntArray422[anInt7131++] = Static576.method8076();
										return;
									}
									if (arg0 == 3339) {
										anIntArray422[anInt7131++] = 0;
										return;
									}
									if (arg0 == 3340) {
										anIntArray422[anInt7131++] = Static489.aBoolean602 ? 1 : 0;
										return;
									}
									if (arg0 == 3341) {
										anIntArray422[anInt7131++] = Static280.aBoolean393 ? 1 : 0;
										return;
									}
									if (arg0 == 3342) {
										anIntArray422[anInt7131++] = Static281.aClass49_1.method2426();
										return;
									}
									if (arg0 == 3343) {
										anIntArray422[anInt7131++] = Static281.aClass49_1.method2429();
										return;
									}
									if (arg0 == 3344) {
										aStringArray56[anInt7134++] = Static594.method8213();
										return;
									}
									if (arg0 == 3345) {
										aStringArray56[anInt7134++] = Static175.method2891();
										return;
									}
									if (arg0 == 3346) {
										anIntArray422[anInt7131++] = Static577.method8081();
										return;
									}
									if (arg0 == 3347) {
										anIntArray422[anInt7131++] = Static257.anInt5006;
										return;
									}
									if (arg0 == 3349) {
										anIntArray422[anInt7131++] = Static68.aClass9_Sub2_Sub1_Sub2_Sub1_1.aClass191_7.method5071() >> 3;
										return;
									}
								} else if (arg0 < 3500) {
									@Pc(5711) Class146 local5711;
									if (arg0 == 3400) {
										anInt7131 -= 2;
										local13 = anIntArray422[anInt7131];
										local19 = anIntArray422[anInt7131 + 1];
										local5711 = Static324.aClass307_1.method7524(local13);
										aStringArray56[anInt7134++] = local5711.method3761(local19);
										return;
									}
									if (arg0 == 3408) {
										anInt7131 -= 4;
										local13 = anIntArray422[anInt7131];
										local19 = anIntArray422[anInt7131 + 1];
										local25 = anIntArray422[anInt7131 + 2];
										local357 = anIntArray422[anInt7131 + 3];
										@Pc(5757) Class146 local5757 = Static324.aClass307_1.method7524(local25);
										if (local5757.aChar4 == local13 && local5757.aChar3 == local19) {
											if (local19 == 115) {
												aStringArray56[anInt7134++] = local5757.method3761(local357);
												return;
											}
											anIntArray422[anInt7131++] = local5757.method3764(local357);
											return;
										}
										throw new RuntimeException("C3408-1 " + local25 + "-" + local357);
									}
									if (arg0 == 3409) {
										anInt7131 -= 3;
										local13 = anIntArray422[anInt7131];
										local19 = anIntArray422[anInt7131 + 1];
										local25 = anIntArray422[anInt7131 + 2];
										if (local19 == -1) {
											throw new RuntimeException("C3409-2");
										}
										@Pc(5843) Class146 local5843 = Static324.aClass307_1.method7524(local19);
										if (local5843.aChar3 != local13) {
											throw new RuntimeException("C3409-1");
										}
										anIntArray422[anInt7131++] = local5843.method3760(local25) ? 1 : 0;
										return;
									}
									if (arg0 == 3410) {
										local13 = anIntArray422[--anInt7131];
										local1161 = aStringArray56[--anInt7134];
										if (local13 == -1) {
											throw new RuntimeException("C3410-2");
										}
										local5711 = Static324.aClass307_1.method7524(local13);
										if (local5711.aChar3 != 's') {
											throw new RuntimeException("C3410-1");
										}
										anIntArray422[anInt7131++] = local5711.method3770(local1161) ? 1 : 0;
										return;
									}
									if (arg0 == 3411) {
										local13 = anIntArray422[--anInt7131];
										@Pc(5941) Class146 local5941 = Static324.aClass307_1.method7524(local13);
										anIntArray422[anInt7131++] = local5941.aClass25_22.method430();
										return;
									}
								} else if (arg0 < 3700) {
									if (arg0 == 3600) {
										if (Static468.anInt8022 == 0) {
											anIntArray422[anInt7131++] = -2;
											return;
										}
										if (Static468.anInt8022 == 1) {
											anIntArray422[anInt7131++] = -1;
											return;
										}
										anIntArray422[anInt7131++] = Static606.anInt9791;
										return;
									}
									if (arg0 == 3601) {
										local13 = anIntArray422[--anInt7131];
										if (Static468.anInt8022 == 2 && local13 < Static606.anInt9791) {
											aStringArray56[anInt7134++] = Static233.aStringArray32[local13];
											if (Static633.aStringArray14[local13] != null) {
												aStringArray56[anInt7134++] = Static633.aStringArray14[local13];
												return;
											}
											aStringArray56[anInt7134++] = "";
											return;
										}
										aStringArray56[anInt7134++] = "";
										aStringArray56[anInt7134++] = "";
										return;
									}
									if (arg0 == 3602) {
										local13 = anIntArray422[--anInt7131];
										if (Static468.anInt8022 == 2 && local13 < Static606.anInt9791) {
											anIntArray422[anInt7131++] = Static112.anIntArray152[local13];
											return;
										}
										anIntArray422[anInt7131++] = 0;
										return;
									}
									if (arg0 == 3603) {
										local13 = anIntArray422[--anInt7131];
										if (Static468.anInt8022 == 2 && local13 < Static606.anInt9791) {
											anIntArray422[anInt7131++] = Static33.anIntArray38[local13];
											return;
										}
										anIntArray422[anInt7131++] = 0;
										return;
									}
									if (arg0 == 3604) {
										local4042 = aStringArray56[--anInt7134];
										local19 = anIntArray422[--anInt7131];
										Static390.method6095(local19, local4042);
										return;
									}
									if (arg0 == 3605) {
										local4042 = aStringArray56[--anInt7134];
										Static322.method5338(local4042);
										return;
									}
									if (arg0 == 3606) {
										local4042 = aStringArray56[--anInt7134];
										Static140.method2402(local4042);
										return;
									}
									if (arg0 == 3607) {
										local4042 = aStringArray56[--anInt7134];
										Static220.method3850(false, local4042);
										return;
									}
									if (arg0 == 3608) {
										local4042 = aStringArray56[--anInt7134];
										Static252.method4221(local4042);
										return;
									}
									if (arg0 == 3609) {
										local4042 = aStringArray56[--anInt7134];
										if (local4042.startsWith("<img=0>") || local4042.startsWith("<img=1>")) {
											local4042 = local4042.substring(7);
										}
										anIntArray422[anInt7131++] = Static328.method5384(local4042) ? 1 : 0;
										return;
									}
									if (arg0 == 3610) {
										local13 = anIntArray422[--anInt7131];
										if (Static468.anInt8022 == 2 && local13 < Static606.anInt9791) {
											aStringArray56[anInt7134++] = Static1.aStringArray75[local13];
											return;
										}
										aStringArray56[anInt7134++] = "";
										return;
									}
									if (arg0 == 3611) {
										if (Static9.aString1 != null) {
											aStringArray56[anInt7134++] = Static605.method8322(Static9.aString1);
											return;
										}
										aStringArray56[anInt7134++] = "";
										return;
									}
									if (arg0 == 3612) {
										if (Static9.aString1 != null) {
											anIntArray422[anInt7131++] = Static398.anInt7117;
											return;
										}
										anIntArray422[anInt7131++] = 0;
										return;
									}
									if (arg0 == 3613) {
										local13 = anIntArray422[--anInt7131];
										if (Static9.aString1 != null && local13 < Static398.anInt7117) {
											aStringArray56[anInt7134++] = Static95.aClass253Array1[local13].aString59;
											return;
										}
										aStringArray56[anInt7134++] = "";
										return;
									}
									if (arg0 == 3614) {
										local13 = anIntArray422[--anInt7131];
										if (Static9.aString1 != null && local13 < Static398.anInt7117) {
											anIntArray422[anInt7131++] = Static95.aClass253Array1[local13].anInt7221;
											return;
										}
										anIntArray422[anInt7131++] = 0;
										return;
									}
									if (arg0 == 3615) {
										local13 = anIntArray422[--anInt7131];
										if (Static9.aString1 != null && local13 < Static398.anInt7117) {
											anIntArray422[anInt7131++] = Static95.aClass253Array1[local13].aByte78;
											return;
										}
										anIntArray422[anInt7131++] = 0;
										return;
									}
									if (arg0 == 3616) {
										anIntArray422[anInt7131++] = Static292.aByte70;
										return;
									}
									if (arg0 == 3617) {
										local4042 = aStringArray56[--anInt7134];
										Static341.method5452(local4042);
										return;
									}
									if (arg0 == 3618) {
										anIntArray422[anInt7131++] = Static284.aByte69;
										return;
									}
									if (arg0 == 3619) {
										local4042 = aStringArray56[--anInt7134];
										Static584.method8115(local4042);
										return;
									}
									if (arg0 == 3620) {
										Static50.method934();
										return;
									}
									if (arg0 == 3621) {
										if (Static468.anInt8022 == 0) {
											anIntArray422[anInt7131++] = -1;
											return;
										}
										anIntArray422[anInt7131++] = Static191.anInt3579;
										return;
									}
									if (arg0 == 3622) {
										local13 = anIntArray422[--anInt7131];
										if (Static468.anInt8022 != 0 && local13 < Static191.anInt3579) {
											aStringArray56[anInt7134++] = Static151.aStringArray24[local13];
											if (Static193.aStringArray82[local13] != null) {
												aStringArray56[anInt7134++] = Static193.aStringArray82[local13];
												return;
											}
											aStringArray56[anInt7134++] = "";
											return;
										}
										aStringArray56[anInt7134++] = "";
										aStringArray56[anInt7134++] = "";
										return;
									}
									if (arg0 == 3623) {
										local4042 = aStringArray56[--anInt7134];
										if (local4042.startsWith("<img=0>") || local4042.startsWith("<img=1>")) {
											local4042 = local4042.substring(7);
										}
										anIntArray422[anInt7131++] = Static427.method6524(local4042) ? 1 : 0;
										return;
									}
									if (arg0 == 3624) {
										local13 = anIntArray422[--anInt7131];
										if (Static95.aClass253Array1 != null && local13 < Static398.anInt7117 && Static95.aClass253Array1[local13].aString60.equalsIgnoreCase(Static68.aClass9_Sub2_Sub1_Sub2_Sub1_1.aString5)) {
											anIntArray422[anInt7131++] = 1;
											return;
										}
										anIntArray422[anInt7131++] = 0;
										return;
									}
									if (arg0 == 3625) {
										if (Static122.aString17 != null) {
											aStringArray56[anInt7134++] = Static122.aString17;
											return;
										}
										aStringArray56[anInt7134++] = "";
										return;
									}
									if (arg0 == 3626) {
										local13 = anIntArray422[--anInt7131];
										if (Static9.aString1 != null && local13 < Static398.anInt7117) {
											aStringArray56[anInt7134++] = Static95.aClass253Array1[local13].aString61;
											return;
										}
										aStringArray56[anInt7134++] = "";
										return;
									}
									if (arg0 == 3627) {
										local13 = anIntArray422[--anInt7131];
										if (Static468.anInt8022 == 2 && local13 >= 0 && local13 < Static606.anInt9791) {
											anIntArray422[anInt7131++] = Static211.aBooleanArray13[local13] ? 1 : 0;
											return;
										}
										anIntArray422[anInt7131++] = 0;
										return;
									}
									if (arg0 == 3628) {
										local4042 = aStringArray56[--anInt7134];
										if (local4042.startsWith("<img=0>") || local4042.startsWith("<img=1>")) {
											local4042 = local4042.substring(7);
										}
										anIntArray422[anInt7131++] = Static603.method8314(local4042);
										return;
									}
									if (arg0 == 3629) {
										anIntArray422[anInt7131++] = Static128.anInt1666;
										return;
									}
									if (arg0 == 3630) {
										local4042 = aStringArray56[--anInt7134];
										Static220.method3850(true, local4042);
										return;
									}
									if (arg0 == 3631) {
										local13 = anIntArray422[--anInt7131];
										anIntArray422[anInt7131++] = Static158.aBooleanArray9[local13] ? 1 : 0;
										return;
									}
									if (arg0 == 3632) {
										local13 = anIntArray422[--anInt7131];
										if (Static9.aString1 != null && local13 < Static398.anInt7117) {
											aStringArray56[anInt7134++] = Static95.aClass253Array1[local13].aString60;
											return;
										}
										aStringArray56[anInt7134++] = "";
										return;
									}
									if (arg0 == 3633) {
										local13 = anIntArray422[--anInt7131];
										if (Static468.anInt8022 != 0 && local13 < Static191.anInt3579) {
											aStringArray56[anInt7134++] = Static209.aStringArray30[local13];
											return;
										}
										aStringArray56[anInt7134++] = "";
										return;
									}
								} else if (arg0 < 4000) {
									if (arg0 == 3903) {
										local13 = anIntArray422[--anInt7131];
										anIntArray422[anInt7131++] = Static467.aClass206Array1[local13].method5366();
										return;
									}
									if (arg0 == 3904) {
										local13 = anIntArray422[--anInt7131];
										anIntArray422[anInt7131++] = Static467.aClass206Array1[local13].anInt6208;
										return;
									}
									if (arg0 == 3905) {
										local13 = anIntArray422[--anInt7131];
										anIntArray422[anInt7131++] = Static467.aClass206Array1[local13].anInt6204;
										return;
									}
									if (arg0 == 3906) {
										local13 = anIntArray422[--anInt7131];
										anIntArray422[anInt7131++] = Static467.aClass206Array1[local13].anInt6207;
										return;
									}
									if (arg0 == 3907) {
										local13 = anIntArray422[--anInt7131];
										anIntArray422[anInt7131++] = Static467.aClass206Array1[local13].anInt6203;
										return;
									}
									if (arg0 == 3908) {
										local13 = anIntArray422[--anInt7131];
										anIntArray422[anInt7131++] = Static467.aClass206Array1[local13].anInt6202;
										return;
									}
									if (arg0 == 3910) {
										local13 = anIntArray422[--anInt7131];
										local19 = Static467.aClass206Array1[local13].method5364();
										anIntArray422[anInt7131++] = local19 == 0 ? 1 : 0;
										return;
									}
									if (arg0 == 3911) {
										local13 = anIntArray422[--anInt7131];
										local19 = Static467.aClass206Array1[local13].method5364();
										anIntArray422[anInt7131++] = local19 == 2 ? 1 : 0;
										return;
									}
									if (arg0 == 3912) {
										local13 = anIntArray422[--anInt7131];
										local19 = Static467.aClass206Array1[local13].method5364();
										anIntArray422[anInt7131++] = local19 == 5 ? 1 : 0;
										return;
									}
									if (arg0 == 3913) {
										local13 = anIntArray422[--anInt7131];
										local19 = Static467.aClass206Array1[local13].method5364();
										anIntArray422[anInt7131++] = local19 == 1 ? 1 : 0;
										return;
									}
								} else if (arg0 < 4100) {
									if (arg0 == 4000) {
										anInt7131 -= 2;
										local13 = anIntArray422[anInt7131];
										local19 = anIntArray422[anInt7131 + 1];
										anIntArray422[anInt7131++] = local13 + local19;
										return;
									}
									if (arg0 == 4001) {
										anInt7131 -= 2;
										local13 = anIntArray422[anInt7131];
										local19 = anIntArray422[anInt7131 + 1];
										anIntArray422[anInt7131++] = local13 - local19;
										return;
									}
									if (arg0 == 4002) {
										anInt7131 -= 2;
										local13 = anIntArray422[anInt7131];
										local19 = anIntArray422[anInt7131 + 1];
										anIntArray422[anInt7131++] = local13 * local19;
										return;
									}
									if (arg0 == 4003) {
										anInt7131 -= 2;
										local13 = anIntArray422[anInt7131];
										local19 = anIntArray422[anInt7131 + 1];
										anIntArray422[anInt7131++] = local13 / local19;
										return;
									}
									if (arg0 == 4004) {
										local13 = anIntArray422[--anInt7131];
										anIntArray422[anInt7131++] = (int) (Math.random() * (double) local13);
										return;
									}
									if (arg0 == 4005) {
										local13 = anIntArray422[--anInt7131];
										anIntArray422[anInt7131++] = (int) (Math.random() * (double) (local13 + 1));
										return;
									}
									if (arg0 == 4006) {
										anInt7131 -= 5;
										local13 = anIntArray422[anInt7131];
										local19 = anIntArray422[anInt7131 + 1];
										local25 = anIntArray422[anInt7131 + 2];
										local357 = anIntArray422[anInt7131 + 3];
										local2373 = anIntArray422[anInt7131 + 4];
										anIntArray422[anInt7131++] = local13 + (local19 - local13) * (local2373 - local25) / (local357 - local25);
										return;
									}
									@Pc(7451) long local7451;
									@Pc(7444) long local7444;
									if (arg0 == 4007) {
										anInt7131 -= 2;
										local7444 = (long) anIntArray422[anInt7131];
										local7451 = (long) anIntArray422[anInt7131 + 1];
										anIntArray422[anInt7131++] = (int) (local7444 + local7444 * local7451 / 100L);
										return;
									}
									if (arg0 == 4008) {
										anInt7131 -= 2;
										local13 = anIntArray422[anInt7131];
										local19 = anIntArray422[anInt7131 + 1];
										anIntArray422[anInt7131++] = local13 | 0x1 << local19;
										return;
									}
									if (arg0 == 4009) {
										anInt7131 -= 2;
										local13 = anIntArray422[anInt7131];
										local19 = anIntArray422[anInt7131 + 1];
										anIntArray422[anInt7131++] = local13 & -(0x1 << local19) - 1;
										return;
									}
									if (arg0 == 4010) {
										anInt7131 -= 2;
										local13 = anIntArray422[anInt7131];
										local19 = anIntArray422[anInt7131 + 1];
										anIntArray422[anInt7131++] = (local13 & 0x1 << local19) == 0 ? 0 : 1;
										return;
									}
									if (arg0 == 4011) {
										anInt7131 -= 2;
										local13 = anIntArray422[anInt7131];
										local19 = anIntArray422[anInt7131 + 1];
										anIntArray422[anInt7131++] = local13 % local19;
										return;
									}
									if (arg0 == 4012) {
										anInt7131 -= 2;
										local13 = anIntArray422[anInt7131];
										local19 = anIntArray422[anInt7131 + 1];
										if (local13 == 0) {
											anIntArray422[anInt7131++] = 0;
											return;
										}
										anIntArray422[anInt7131++] = (int) Math.pow((double) local13, (double) local19);
										return;
									}
									if (arg0 == 4013) {
										anInt7131 -= 2;
										local13 = anIntArray422[anInt7131];
										local19 = anIntArray422[anInt7131 + 1];
										if (local13 == 0) {
											anIntArray422[anInt7131++] = 0;
											return;
										}
										if (local19 == 0) {
											anIntArray422[anInt7131++] = Integer.MAX_VALUE;
											return;
										}
										anIntArray422[anInt7131++] = (int) Math.pow((double) local13, 1.0D / (double) local19);
										return;
									}
									if (arg0 == 4014) {
										anInt7131 -= 2;
										local13 = anIntArray422[anInt7131];
										local19 = anIntArray422[anInt7131 + 1];
										anIntArray422[anInt7131++] = local13 & local19;
										return;
									}
									if (arg0 == 4015) {
										anInt7131 -= 2;
										local13 = anIntArray422[anInt7131];
										local19 = anIntArray422[anInt7131 + 1];
										anIntArray422[anInt7131++] = local13 | local19;
										return;
									}
									if (arg0 == 4016) {
										anInt7131 -= 2;
										local13 = anIntArray422[anInt7131];
										local19 = anIntArray422[anInt7131 + 1];
										anIntArray422[anInt7131++] = local13 < local19 ? local13 : local19;
										return;
									}
									if (arg0 == 4017) {
										anInt7131 -= 2;
										local13 = anIntArray422[anInt7131];
										local19 = anIntArray422[anInt7131 + 1];
										anIntArray422[anInt7131++] = local13 > local19 ? local13 : local19;
										return;
									}
									if (arg0 == 4018) {
										anInt7131 -= 3;
										local7444 = (long) anIntArray422[anInt7131];
										local7451 = (long) anIntArray422[anInt7131 + 1];
										@Pc(7832) long local7832 = (long) anIntArray422[anInt7131 + 2];
										anIntArray422[anInt7131++] = (int) (local7444 * local7832 / local7451);
										return;
									}
									if (arg0 == 4019) {
										anInt7131 -= 2;
										local13 = anIntArray422[anInt7131];
										local19 = anIntArray422[anInt7131 + 1];
										if (local13 > 700 || local19 > 700) {
											anIntArray422[anInt7131++] = 256;
										}
										@Pc(7891) double local7891 = (Math.random() * (double) (local19 + local13) + 800.0D - (double) local13) / 100.0D;
										anIntArray422[anInt7131++] = (int) (Math.pow(2.0D, local7891) + 0.5D);
										return;
									}
								} else if (arg0 < 4200) {
									if (arg0 == 4100) {
										local4042 = aStringArray56[--anInt7134];
										local19 = anIntArray422[--anInt7131];
										aStringArray56[anInt7134++] = local4042 + local19;
										return;
									}
									if (arg0 == 4101) {
										anInt7134 -= 2;
										local4042 = aStringArray56[anInt7134];
										local1161 = aStringArray56[anInt7134 + 1];
										aStringArray56[anInt7134++] = local4042 + local1161;
										return;
									}
									if (arg0 == 4102) {
										local4042 = aStringArray56[--anInt7134];
										local19 = anIntArray422[--anInt7131];
										aStringArray56[anInt7134++] = local4042 + Static106.method1791(local19, true);
										return;
									}
									if (arg0 == 4103) {
										local4042 = aStringArray56[--anInt7134];
										aStringArray56[anInt7134++] = local4042.toLowerCase();
										return;
									}
									if (arg0 == 4104) {
										aStringArray56[anInt7134++] = Static2.method31(Static455.anInt7738, Static156.method2753(anIntArray422[--anInt7131]));
										return;
									}
									if (arg0 == 4105) {
										anInt7134 -= 2;
										local4042 = aStringArray56[anInt7134];
										local1161 = aStringArray56[anInt7134 + 1];
										if (Static68.aClass9_Sub2_Sub1_Sub2_Sub1_1.aClass375_1 != null && Static68.aClass9_Sub2_Sub1_Sub2_Sub1_1.aClass375_1.aBoolean763) {
											aStringArray56[anInt7134++] = local1161;
											return;
										}
										aStringArray56[anInt7134++] = local4042;
										return;
									}
									if (arg0 == 4106) {
										local13 = anIntArray422[--anInt7131];
										aStringArray56[anInt7134++] = Integer.toString(local13);
										return;
									}
									if (arg0 == 4107) {
										anInt7134 -= 2;
										anIntArray422[anInt7131++] = Static513.method7471(Static455.anInt7738, aStringArray56[anInt7134], aStringArray56[anInt7134 + 1]);
										return;
									}
									@Pc(8178) Class93 local8178;
									if (arg0 == 4108) {
										local4042 = aStringArray56[--anInt7134];
										anInt7131 -= 2;
										local19 = anIntArray422[anInt7131];
										local25 = anIntArray422[anInt7131 + 1];
										local8178 = Static210.method3285(local25, Static394.aClass343_188);
										anIntArray422[anInt7131++] = local8178.method2318(local4042, local19, Static427.aClass103Array16);
										return;
									}
									if (arg0 == 4109) {
										local4042 = aStringArray56[--anInt7134];
										anInt7131 -= 2;
										local19 = anIntArray422[anInt7131];
										local25 = anIntArray422[anInt7131 + 1];
										local8178 = Static210.method3285(local25, Static394.aClass343_188);
										anIntArray422[anInt7131++] = local8178.method2316(Static427.aClass103Array16, local4042, local19);
										return;
									}
									if (arg0 == 4110) {
										anInt7134 -= 2;
										local4042 = aStringArray56[anInt7134];
										local1161 = aStringArray56[anInt7134 + 1];
										if (anIntArray422[--anInt7131] == 1) {
											aStringArray56[anInt7134++] = local4042;
											return;
										}
										aStringArray56[anInt7134++] = local1161;
										return;
									}
									if (arg0 == 4111) {
										local4042 = aStringArray56[--anInt7134];
										aStringArray56[anInt7134++] = Static212.method3300(local4042);
										return;
									}
									if (arg0 == 4112) {
										local4042 = aStringArray56[--anInt7134];
										local19 = anIntArray422[--anInt7131];
										if (local19 == -1) {
											throw new RuntimeException("null char");
										}
										aStringArray56[anInt7134++] = local4042 + (char) local19;
										return;
									}
									if (arg0 == 4113) {
										local13 = anIntArray422[--anInt7131];
										anIntArray422[anInt7131++] = method6278((char) local13);
										return;
									}
									if (arg0 == 4114) {
										local13 = anIntArray422[--anInt7131];
										anIntArray422[anInt7131++] = Static374.method5189((char) local13) ? 1 : 0;
										return;
									}
									if (arg0 == 4115) {
										local13 = anIntArray422[--anInt7131];
										anIntArray422[anInt7131++] = Static440.method6628((char) local13) ? 1 : 0;
										return;
									}
									if (arg0 == 4116) {
										local13 = anIntArray422[--anInt7131];
										anIntArray422[anInt7131++] = Static590.method8200((char) local13) ? 1 : 0;
										return;
									}
									if (arg0 == 4117) {
										local4042 = aStringArray56[--anInt7134];
										if (local4042 != null) {
											anIntArray422[anInt7131++] = local4042.length();
											return;
										}
										anIntArray422[anInt7131++] = 0;
										return;
									}
									if (arg0 == 4118) {
										local4042 = aStringArray56[--anInt7134];
										anInt7131 -= 2;
										local19 = anIntArray422[anInt7131];
										local25 = anIntArray422[anInt7131 + 1];
										aStringArray56[anInt7134++] = local4042.substring(local19, local25);
										return;
									}
									if (arg0 == 4119) {
										local4042 = aStringArray56[--anInt7134];
										@Pc(8536) StringBuffer local8536 = new StringBuffer(local4042.length());
										@Pc(8538) boolean local8538 = false;
										for (local357 = 0; local357 < local4042.length(); local357++) {
											@Pc(8545) char local8545 = local4042.charAt(local357);
											if (local8545 == '<') {
												local8538 = true;
											} else if (local8545 == '>') {
												local8538 = false;
											} else if (!local8538) {
												local8536.append(local8545);
											}
										}
										aStringArray56[anInt7134++] = local8536.toString();
										return;
									}
									if (arg0 == 4120) {
										local4042 = aStringArray56[--anInt7134];
										anInt7131 -= 2;
										local19 = anIntArray422[anInt7131];
										local25 = anIntArray422[anInt7131 + 1];
										anIntArray422[anInt7131++] = local4042.indexOf(local19, local25);
										return;
									}
									if (arg0 == 4121) {
										anInt7134 -= 2;
										local4042 = aStringArray56[anInt7134];
										local1161 = aStringArray56[anInt7134 + 1];
										local25 = anIntArray422[--anInt7131];
										anIntArray422[anInt7131++] = local4042.indexOf(local1161, local25);
										return;
									}
									if (arg0 == 4122) {
										local13 = anIntArray422[--anInt7131];
										anIntArray422[anInt7131++] = Character.toLowerCase((char) local13);
										return;
									}
									if (arg0 == 4123) {
										local13 = anIntArray422[--anInt7131];
										anIntArray422[anInt7131++] = Character.toUpperCase((char) local13);
										return;
									}
									if (arg0 == 4124) {
										local420 = anIntArray422[--anInt7131] != 0;
										local19 = anIntArray422[--anInt7131];
										aStringArray56[anInt7134++] = Static257.method4310(0, local420, Static455.anInt7738, (long) local19);
										return;
									}
									if (arg0 == 4125) {
										local4042 = aStringArray56[--anInt7134];
										local19 = anIntArray422[--anInt7131];
										@Pc(8759) Class93 local8759 = Static210.method3285(local19, Static394.aClass343_188);
										anIntArray422[anInt7131++] = local8759.method2319(Static427.aClass103Array16, local4042);
										return;
									}
									if (arg0 == 4126) {
										aStringArray56[anInt7134++] = Static595.method8229((long) anIntArray422[--anInt7131] * 60000L, Static455.anInt7738);
										return;
									}
								} else if (arg0 < 4300) {
									if (arg0 == 4200) {
										local13 = anIntArray422[--anInt7131];
										aStringArray56[anInt7134++] = Static298.aClass132_1.method3062(local13).aString63;
										return;
									}
									@Pc(8845) Class259 local8845;
									if (arg0 == 4201) {
										anInt7131 -= 2;
										local13 = anIntArray422[anInt7131];
										local19 = anIntArray422[anInt7131 + 1];
										local8845 = Static298.aClass132_1.method3062(local13);
										if (local19 >= 1 && local19 <= 5 && local8845.aStringArray59[local19 - 1] != null) {
											aStringArray56[anInt7134++] = local8845.aStringArray59[local19 - 1];
											return;
										}
										aStringArray56[anInt7134++] = "";
										return;
									}
									if (arg0 == 4202) {
										anInt7131 -= 2;
										local13 = anIntArray422[anInt7131];
										local19 = anIntArray422[anInt7131 + 1];
										local8845 = Static298.aClass132_1.method3062(local13);
										if (local19 >= 1 && local19 <= 5 && local8845.aStringArray58[local19 - 1] != null) {
											aStringArray56[anInt7134++] = local8845.aStringArray58[local19 - 1];
											return;
										}
										aStringArray56[anInt7134++] = "";
										return;
									}
									if (arg0 == 4203) {
										local13 = anIntArray422[--anInt7131];
										anIntArray422[anInt7131++] = Static298.aClass132_1.method3062(local13).anInt7349;
										return;
									}
									if (arg0 == 4204) {
										local13 = anIntArray422[--anInt7131];
										anIntArray422[anInt7131++] = Static298.aClass132_1.method3062(local13).anInt7370 == 1 ? 1 : 0;
										return;
									}
									@Pc(9008) Class259 local9008;
									if (arg0 == 4205) {
										local13 = anIntArray422[--anInt7131];
										local9008 = Static298.aClass132_1.method3062(local13);
										if (local9008.anInt7377 == -1 && local9008.anInt7385 >= 0) {
											anIntArray422[anInt7131++] = local9008.anInt7385;
											return;
										}
										anIntArray422[anInt7131++] = local13;
										return;
									}
									if (arg0 == 4206) {
										local13 = anIntArray422[--anInt7131];
										local9008 = Static298.aClass132_1.method3062(local13);
										if (local9008.anInt7377 >= 0 && local9008.anInt7385 >= 0) {
											anIntArray422[anInt7131++] = local9008.anInt7385;
											return;
										}
										anIntArray422[anInt7131++] = local13;
										return;
									}
									if (arg0 == 4207) {
										local13 = anIntArray422[--anInt7131];
										anIntArray422[anInt7131++] = Static298.aClass132_1.method3062(local13).aBoolean525 ? 1 : 0;
										return;
									}
									if (arg0 == 4208) {
										anInt7131 -= 2;
										local13 = anIntArray422[anInt7131];
										local19 = anIntArray422[anInt7131 + 1];
										local3107 = Static220.aClass214_2.method5419(local19);
										if (local3107.method2736()) {
											aStringArray56[anInt7134++] = Static298.aClass132_1.method3062(local13).method6460(local19, local3107.aString23);
											return;
										}
										anIntArray422[anInt7131++] = Static298.aClass132_1.method3062(local13).method6450(local3107.anInt3158, local19);
										return;
									}
									if (arg0 == 4209) {
										anInt7131 -= 2;
										local13 = anIntArray422[anInt7131];
										local19 = anIntArray422[anInt7131 + 1] - 1;
										local8845 = Static298.aClass132_1.method3062(local13);
										if (local8845.anInt7364 == local19) {
											anIntArray422[anInt7131++] = local8845.lb;
											return;
										}
										if (local8845.anInt7352 == local19) {
											anIntArray422[anInt7131++] = local8845.anInt7359;
											return;
										}
										anIntArray422[anInt7131++] = -1;
										return;
									}
									if (arg0 == 4210) {
										local4042 = aStringArray56[--anInt7134];
										local19 = anIntArray422[--anInt7131];
										Static131.method2310(local19 == 1, local4042);
										anIntArray422[anInt7131++] = Static439.anInt9345;
										return;
									}
									if (arg0 == 4211) {
										if (Static306.aShortArray49 != null && Static497.anInt5760 < Static439.anInt9345) {
											anIntArray422[anInt7131++] = Static306.aShortArray49[Static497.anInt5760++] & 0xFFFF;
											return;
										}
										anIntArray422[anInt7131++] = -1;
										return;
									}
									if (arg0 == 4212) {
										Static497.anInt5760 = 0;
										return;
									}
									if (arg0 == 4213) {
										local13 = anIntArray422[--anInt7131];
										anIntArray422[anInt7131++] = Static298.aClass132_1.method3062(local13).anInt7356;
										return;
									}
									if (arg0 == 4214) {
										local4042 = aStringArray56[--anInt7134];
										anInt7131 -= 3;
										local19 = anIntArray422[anInt7131];
										local25 = anIntArray422[anInt7131 + 1];
										local357 = anIntArray422[anInt7131 + 2];
										Static21.method281(local25, local357, local4042, local19 == 1);
										anIntArray422[anInt7131++] = Static439.anInt9345;
										return;
									}
									if (arg0 == 4215) {
										anInt7134 -= 2;
										anInt7131 -= 2;
										local4042 = aStringArray56[anInt7134];
										local19 = anIntArray422[anInt7131];
										local25 = anIntArray422[anInt7131 + 1];
										@Pc(9407) String local9407 = aStringArray56[anInt7134 + 1];
										Static544.method7835(local9407, local25, local19 == 1, local4042);
										anIntArray422[anInt7131++] = Static439.anInt9345;
										return;
									}
								} else if (arg0 < 4400) {
									if (arg0 == 4300) {
										anInt7131 -= 2;
										local13 = anIntArray422[anInt7131];
										local19 = anIntArray422[anInt7131 + 1];
										local3107 = Static220.aClass214_2.method5419(local19);
										if (local3107.method2736()) {
											aStringArray56[anInt7134++] = Static153.aClass2_1.method23(local13).method7591(local3107.aString23, local19);
											return;
										}
										anIntArray422[anInt7131++] = Static153.aClass2_1.method23(local13).method7584(local19, local3107.anInt3158);
										return;
									}
								} else if (arg0 < 4500) {
									if (arg0 == 4400) {
										anInt7131 -= 2;
										local13 = anIntArray422[anInt7131];
										local19 = anIntArray422[anInt7131 + 1];
										local3107 = Static220.aClass214_2.method5419(local19);
										if (local3107.method2736()) {
											aStringArray56[anInt7134++] = Static370.aClass284_3.method6915(local13).method7895(local3107.aString23, local19);
											return;
										}
										anIntArray422[anInt7131++] = Static370.aClass284_3.method6915(local13).method7896(local3107.anInt3158, local19);
										return;
									}
								} else if (arg0 < 4600) {
									if (arg0 == 4500) {
										anInt7131 -= 2;
										local13 = anIntArray422[anInt7131];
										local19 = anIntArray422[anInt7131 + 1];
										local3107 = Static220.aClass214_2.method5419(local19);
										if (local3107.method2736()) {
											aStringArray56[anInt7134++] = Static113.aClass175_1.method4472(local13).method7917(local19, local3107.aString23);
											return;
										}
										anIntArray422[anInt7131++] = Static113.aClass175_1.method4472(local13).method7918(local3107.anInt3158, local19);
										return;
									}
								} else if (arg0 < 4700) {
									if (arg0 == 4600) {
										local13 = anIntArray422[--anInt7131];
										@Pc(9635) Class176 local9635 = Static61.aClass119_1.method2845(local13);
										if (local9635.anIntArray283 != null && local9635.anIntArray283.length > 0) {
											local25 = 0;
											local357 = local9635.anIntArray284[0];
											for (local2373 = 1; local2373 < local9635.anIntArray283.length; local2373++) {
												if (local9635.anIntArray284[local2373] > local357) {
													local25 = local2373;
													local357 = local9635.anIntArray284[local2373];
												}
											}
											anIntArray422[anInt7131++] = local9635.anIntArray283[local25];
											return;
										}
										anIntArray422[anInt7131++] = local9635.anInt5197;
										return;
									}
								} else if (arg0 < 4800) {
									if (arg0 == 4700) {
										anIntArray422[anInt7131++] = Static387.aBoolean503 ? 1 : 0;
										return;
									}
									if (arg0 == 4701) {
										local4042 = aStringArray56[--anInt7134];
										if (Static82.anInt1653 == 7 && Static71.anInt1424 == 0) {
											if (local4042.length() > 20) {
												Static73.aByte35 = -4;
												return;
											}
											Static73.aByte35 = -1;
											local4131 = Static59.method1040(Static325.aClass20_2, Static372.aClass314_106);
											local4131.aClass3_Sub9_Sub2_2.method5572(0);
											local25 = local4131.aClass3_Sub9_Sub2_2.anInt6453;
											local4131.aClass3_Sub9_Sub2_2.method5638(local4042);
											local4131.aClass3_Sub9_Sub2_2.method5615(local4131.aClass3_Sub9_Sub2_2.anInt6453 - local25);
											Static148.method2572(local4131);
											return;
										}
										Static73.aByte35 = -5;
										return;
									}
									if (arg0 == 4702) {
										anIntArray422[anInt7131++] = Static73.aByte35;
										if (Static73.aByte35 != -1) {
											Static73.aByte35 = -6;
										}
										return;
									}
								}
							}
						}
					}
				} else {
					if (arg0 >= 2000) {
						arg0 -= 1000;
						local137 = Static324.method5363(anIntArray422[--anInt7131]);
					} else {
						local137 = arg1 ? aClass344_7 : aClass344_8;
					}
					Static605.method8323(local137);
					if (arg0 == 1200 || arg0 == 1205 || arg0 == 1208 || arg0 == 1209 || arg0 == 1212 || arg0 == 1213) {
						anInt7131 -= 2;
						local19 = anIntArray422[anInt7131];
						local25 = anIntArray422[anInt7131 + 1];
						if (local137.anInt9586 == -1) {
							Static542.method7794(local137.anInt9571);
							Static646.method4014(local137.anInt9571);
							Static548.method8390(local137.anInt9571);
						}
						if (local19 == -1) {
							local137.anInt9611 = 1;
							local137.anInt9549 = -1;
							local137.anInt9567 = -1;
							return;
						}
						local137.anInt9567 = local19;
						local137.anInt9565 = local25;
						if (arg0 == 1208 || arg0 == 1209) {
							local137.aBoolean729 = true;
						} else {
							local137.aBoolean729 = false;
						}
						@Pc(1713) Class259 local1713 = Static298.aClass132_1.method3062(local19);
						local137.anInt9609 = local1713.anInt7335;
						local137.anInt9614 = local1713.anInt7375;
						local137.anInt9613 = local1713.anInt7382;
						local137.anInt9572 = local1713.anInt7363;
						local137.anInt9593 = local1713.anInt7362;
						local137.anInt9626 = local1713.anInt7384;
						if (arg0 == 1205 || arg0 == 1209) {
							local137.anInt9619 = 0;
						} else if (arg0 == 1212 || arg0 == 1213) {
							local137.anInt9619 = 1;
						} else {
							local137.anInt9619 = 2;
						}
						if (local137.anInt9585 > 0) {
							local137.anInt9626 = local137.anInt9626 * 32 / local137.anInt9585;
							return;
						}
						if (local137.anInt9616 > 0) {
							local137.anInt9626 = local137.anInt9626 * 32 / local137.anInt9616;
						}
						return;
					}
					if (arg0 == 1201) {
						local137.anInt9611 = 2;
						local137.anInt9549 = anIntArray422[--anInt7131];
						if (local137.anInt9586 == -1) {
							Static544.method7831(local137.anInt9571);
						}
						return;
					}
					if (arg0 == 1202) {
						local137.anInt9611 = 3;
						local137.anInt9549 = -1;
						if (local137.anInt9586 == -1) {
							Static544.method7831(local137.anInt9571);
						}
						return;
					}
					if (arg0 == 1203) {
						local137.anInt9611 = 6;
						local137.anInt9549 = anIntArray422[--anInt7131];
						if (local137.anInt9586 == -1) {
							Static544.method7831(local137.anInt9571);
						}
						return;
					}
					if (arg0 == 1204) {
						local137.anInt9611 = 5;
						local137.anInt9549 = anIntArray422[--anInt7131];
						if (local137.anInt9586 == -1) {
							Static544.method7831(local137.anInt9571);
						}
						return;
					}
					if (arg0 == 1206) {
						anInt7131 -= 4;
						local137.anInt9575 = anIntArray422[anInt7131];
						local137.anInt9610 = anIntArray422[anInt7131 + 1];
						local137.anInt9561 = anIntArray422[anInt7131 + 2];
						local137.anInt9605 = anIntArray422[anInt7131 + 3];
						Static605.method8323(local137);
						return;
					}
					if (arg0 == 1207) {
						anInt7131 -= 2;
						local137.anInt9594 = anIntArray422[anInt7131];
						local137.anInt9566 = anIntArray422[anInt7131 + 1];
						Static605.method8323(local137);
						return;
					}
					if (arg0 == 1210) {
						anInt7131 -= 4;
						local137.anInt9549 = anIntArray422[anInt7131];
						local137.anInt9603 = anIntArray422[anInt7131 + 1];
						if (anIntArray422[anInt7131 + 2] == 1) {
							local137.anInt9611 = 9;
						} else {
							local137.anInt9611 = 8;
						}
						if (anIntArray422[anInt7131 + 3] == 1) {
							local137.aBoolean729 = true;
						} else {
							local137.aBoolean729 = false;
						}
						if (local137.anInt9586 == -1) {
							Static544.method7831(local137.anInt9571);
						}
						return;
					}
					if (arg0 == 1211) {
						local137.anInt9611 = 5;
						local137.anInt9549 = Static54.anInt1032;
						local137.anInt9603 = 0;
						if (local137.anInt9586 == -1) {
							Static544.method7831(local137.anInt9571);
						}
						return;
					}
				}
			} else {
				if (arg0 >= 2000) {
					arg0 -= 1000;
					local137 = Static324.method5363(anIntArray422[--anInt7131]);
				} else {
					local137 = arg1 ? aClass344_7 : aClass344_8;
				}
				if (arg0 == 1000) {
					anInt7131 -= 4;
					local137.anInt9559 = anIntArray422[anInt7131];
					local137.anInt9596 = anIntArray422[anInt7131 + 1];
					local19 = anIntArray422[anInt7131 + 2];
					if (local19 < 0) {
						local19 = 0;
					} else if (local19 > 5) {
						local19 = 5;
					}
					local25 = anIntArray422[anInt7131 + 3];
					if (local25 < 0) {
						local25 = 0;
					} else if (local25 > 5) {
						local25 = 5;
					}
					local137.aByte117 = (byte) local19;
					local137.aByte114 = (byte) local25;
					Static605.method8323(local137);
					Static92.method1555(local137);
					if (local137.anInt9586 == -1) {
						Static346.method5545(local137.anInt9571);
					}
					return;
				}
				if (arg0 == 1001) {
					anInt7131 -= 4;
					local137.anInt9616 = anIntArray422[anInt7131];
					local137.anInt9631 = anIntArray422[anInt7131 + 1];
					local137.anInt9585 = 0;
					local137.anInt9615 = 0;
					local19 = anIntArray422[anInt7131 + 2];
					if (local19 < 0) {
						local19 = 0;
					} else if (local19 > 4) {
						local19 = 4;
					}
					local25 = anIntArray422[anInt7131 + 3];
					if (local25 < 0) {
						local25 = 0;
					} else if (local25 > 4) {
						local25 = 4;
					}
					local137.aByte115 = (byte) local19;
					local137.aByte116 = (byte) local25;
					Static605.method8323(local137);
					Static92.method1555(local137);
					if (local137.anInt9554 == 0) {
						Static335.method5417(false, local137);
					}
					return;
				}
				if (arg0 == 1003) {
					@Pc(661) boolean local661 = anIntArray422[--anInt7131] == 1;
					if (local137.aBoolean730 != local661) {
						local137.aBoolean730 = local661;
						Static605.method8323(local137);
					}
					if (local137.anInt9586 == -1) {
						Static217.method3797(local137.anInt9571);
					}
					return;
				}
				if (arg0 == 1004) {
					anInt7131 -= 2;
					local137.anInt9587 = anIntArray422[anInt7131];
					local137.anInt9577 = anIntArray422[anInt7131 + 1];
					Static605.method8323(local137);
					Static92.method1555(local137);
					if (local137.anInt9554 == 0) {
						Static335.method5417(false, local137);
					}
					return;
				}
				if (arg0 == 1005) {
					local137.aBoolean727 = anIntArray422[--anInt7131] == 1;
					return;
				}
			}
		}
		throw new IllegalStateException(String.valueOf(arg0));
	}

	@OriginalMember(owner = "client!oea", name = "a", descriptor = "(Lclient!wn;II)V")
	public static void method6281(@OriginalArg(0) Class379 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(5) Class3_Sub7_Sub10 local5 = Static544.method7822(arg1, arg2, arg0);
		if (local5 == null) {
			return;
		}
		anIntArray424 = new int[local5.anInt3149];
		aStringArray55 = new String[local5.anInt3157];
		if (local5.aClass379_3 == Static163.aClass379_4 || local5.aClass379_3 == Static9.aClass379_1 || local5.aClass379_3 == Static543.aClass379_10) {
			@Pc(30) int local30 = 0;
			@Pc(32) int local32 = 0;
			if (Static165.aClass344_4 != null) {
				local30 = Static165.aClass344_4.anInt9569;
				local32 = Static165.aClass344_4.anInt9573;
			}
			anIntArray424[0] = Static281.aClass49_1.method2426() - local30;
			anIntArray424[1] = Static281.aClass49_1.method2429() - local32;
		}
		method6289(local5, 200000);
	}

	@OriginalMember(owner = "client!oea", name = "a", descriptor = "(Lclient!nt;I)V")
	private static void method6282(@OriginalArg(0) Class3_Sub36 arg0, @OriginalArg(1) int arg1) {
		@Pc(2) Object[] local2 = arg0.anObjectArray1;
		@Pc(8) int local8 = (Integer) local2[0];
		@Pc(12) Class3_Sub7_Sub10 local12 = Static362.method5814(local8);
		if (local12 == null) {
			return;
		}
		anIntArray424 = new int[local12.anInt3149];
		@Pc(21) int local21 = 0;
		aStringArray55 = new String[local12.anInt3157];
		@Pc(27) int local27 = 0;
		for (@Pc(29) int local29 = 1; local29 < local2.length; local29++) {
			if (local2[local29] instanceof Integer) {
				@Pc(41) int local41 = (Integer) local2[local29];
				if (local41 == -2147483647) {
					local41 = arg0.anInt6951;
				}
				if (local41 == -2147483646) {
					local41 = arg0.anInt6956;
				}
				if (local41 == -2147483645) {
					local41 = arg0.aClass344_6 == null ? -1 : arg0.aClass344_6.anInt9571;
				}
				if (local41 == -2147483644) {
					local41 = arg0.anInt6958;
				}
				if (local41 == -2147483643) {
					local41 = arg0.aClass344_6 == null ? -1 : arg0.aClass344_6.anInt9586;
				}
				if (local41 == -2147483642) {
					local41 = arg0.aClass344_5 == null ? -1 : arg0.aClass344_5.anInt9571;
				}
				if (local41 == -2147483641) {
					local41 = arg0.aClass344_5 == null ? -1 : arg0.aClass344_5.anInt9586;
				}
				if (local41 == -2147483640) {
					local41 = arg0.anInt6953;
				}
				if (local41 == -2147483639) {
					local41 = arg0.anInt6957;
				}
				anIntArray424[local21++] = local41;
			} else if (local2[local29] instanceof String) {
				@Pc(135) String local135 = (String) local2[local29];
				if (local135.equals("event_opbase")) {
					local135 = arg0.aString50;
				}
				aStringArray55[local27++] = local135;
			}
		}
		anInt7141 = arg0.anInt6955;
		method6289(local12, arg1);
	}

	@OriginalMember(owner = "client!oea", name = "a", descriptor = "(I)V")
	private static void method6283(@OriginalArg(0) int arg0) {
		@Pc(3) Class344 local3 = Static324.method5363(arg0);
		if (local3 == null) {
			return;
		}
		@Pc(9) int local9 = arg0 >>> 16;
		@Pc(13) Class344[] local13 = Static69.aClass344ArrayArray1[local9];
		if (local13 == null) {
			@Pc(19) Class344[] local19 = Static319.aClass344ArrayArray2[local9];
			@Pc(22) int local22 = local19.length;
			local13 = Static69.aClass344ArrayArray1[local9] = new Class344[local22];
			Static651.method752(local19, 0, local13, 0, local19.length);
		}
		@Pc(38) int local38;
		for (local38 = 0; local38 < local13.length && local13[local38] != local3; local38++) {
		}
		if (local38 >= local13.length) {
			return;
		}
		Static651.method752(local13, local38 + 1, local13, local38, local13.length - local38 - 1);
		local13[local13.length - 1] = local3;
	}

	@OriginalMember(owner = "client!oea", name = "b", descriptor = "(IZ)V")
	private static void method6284(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1) {
		@Pc(83) String local83;
		@Pc(1496) boolean local1496;
		@Pc(97) int local97;
		@Pc(175) int local175;
		@Pc(776) int local776;
		@Pc(181) String local181;
		@Pc(103) int local103;
		@Pc(52) Class3_Sub27 local52;
		@Pc(89) String local89;
		if (arg0 < 5100) {
			if (arg0 == 5000) {
				anIntArray422[anInt7131++] = Static589.anInt9635;
				return;
			}
			if (arg0 == 5001) {
				anInt7131 -= 3;
				Static589.anInt9635 = anIntArray422[anInt7131];
				Static278.aClass261_4 = Static213.method3758(anIntArray422[anInt7131 + 1]);
				if (Static278.aClass261_4 == null) {
					Static278.aClass261_4 = Static498.aClass261_6;
				}
				Static110.anInt2203 = anIntArray422[anInt7131 + 2];
				local52 = Static59.method1040(Static325.aClass20_2, Static329.aClass314_94);
				local52.aClass3_Sub9_Sub2_2.method5572(Static589.anInt9635);
				local52.aClass3_Sub9_Sub2_2.method5572(Static278.aClass261_4.anInt7428);
				local52.aClass3_Sub9_Sub2_2.method5572(Static110.anInt2203);
				Static148.method2572(local52);
				return;
			}
			if (arg0 == 5002) {
				anInt7134 -= 2;
				local83 = aStringArray56[anInt7134];
				local89 = aStringArray56[anInt7134 + 1];
				anInt7131 -= 2;
				local97 = anIntArray422[anInt7131];
				local103 = anIntArray422[anInt7131 + 1];
				if (local89 == null) {
					local89 = "";
				}
				if (local89.length() > 80) {
					local89 = local89.substring(0, 80);
				}
				@Pc(125) Class3_Sub27 local125 = Static59.method1040(Static325.aClass20_2, Static580.aClass314_142);
				local125.aClass3_Sub9_Sub2_2.method5572(Static300.method8285(local83) + Static300.method8285(local89) + 2);
				local125.aClass3_Sub9_Sub2_2.method5638(local83);
				local125.aClass3_Sub9_Sub2_2.method5572(local97 - 1);
				local125.aClass3_Sub9_Sub2_2.method5572(local103);
				local125.aClass3_Sub9_Sub2_2.method5638(local89);
				Static148.method2572(local125);
				return;
			}
			@Pc(179) Class371 local179;
			if (arg0 == 5003) {
				local175 = anIntArray422[--anInt7131];
				local179 = Static589.method8183(local175);
				local181 = "";
				if (local179 != null && local179.aString102 != null) {
					local181 = local179.aString102;
				}
				aStringArray56[anInt7134++] = local181;
				return;
			}
			if (arg0 == 5004) {
				local175 = anIntArray422[--anInt7131];
				local179 = Static589.method8183(local175);
				local97 = -1;
				if (local179 != null) {
					local97 = local179.anInt9991;
				}
				anIntArray422[anInt7131++] = local97;
				return;
			}
			if (arg0 == 5005) {
				if (Static278.aClass261_4 == null) {
					anIntArray422[anInt7131++] = -1;
					return;
				}
				anIntArray422[anInt7131++] = Static278.aClass261_4.anInt7428;
				return;
			}
			@Pc(269) Class3_Sub27 local269;
			if (arg0 == 5006) {
				local175 = anIntArray422[--anInt7131];
				local269 = Static59.method1040(Static325.aClass20_2, Static82.aClass314_30);
				local269.aClass3_Sub9_Sub2_2.method5572(local175);
				Static148.method2572(local269);
				return;
			}
			if (arg0 == 5008) {
				local83 = aStringArray56[--anInt7134];
				method6277(local83, arg0);
				return;
			}
			if (arg0 == 5009) {
				anInt7134 -= 2;
				local83 = aStringArray56[anInt7134];
				local89 = aStringArray56[anInt7134 + 1];
				if (Static544.anInt9130 != 0 || (!Static11.aBoolean13 || Static317.aBoolean446) && !Static61.aBoolean57) {
					@Pc(328) Class3_Sub27 local328 = Static59.method1040(Static325.aClass20_2, Static143.aClass314_46);
					local328.aClass3_Sub9_Sub2_2.method5572(0);
					local103 = local328.aClass3_Sub9_Sub2_2.anInt6453;
					local328.aClass3_Sub9_Sub2_2.method5638(local83);
					Static525.method7635(local89, local328.aClass3_Sub9_Sub2_2);
					local328.aClass3_Sub9_Sub2_2.method5615(local328.aClass3_Sub9_Sub2_2.anInt6453 - local103);
					Static148.method2572(local328);
					return;
				}
				return;
			}
			if (arg0 == 5010) {
				local175 = anIntArray422[--anInt7131];
				local179 = Static589.method8183(local175);
				local181 = "";
				if (local179 != null && local179.aString101 != null) {
					local181 = local179.aString101;
				}
				aStringArray56[anInt7134++] = local181;
				return;
			}
			if (arg0 == 5011) {
				local175 = anIntArray422[--anInt7131];
				local179 = Static589.method8183(local175);
				local181 = "";
				if (local179 != null && local179.aString104 != null) {
					local181 = local179.aString104;
				}
				aStringArray56[anInt7134++] = local181;
				return;
			}
			if (arg0 == 5012) {
				local175 = anIntArray422[--anInt7131];
				local179 = Static589.method8183(local175);
				local97 = -1;
				if (local179 != null) {
					local97 = local179.anInt9988;
				}
				anIntArray422[anInt7131++] = local97;
				return;
			}
			if (arg0 == 5015) {
				if (Static68.aClass9_Sub2_Sub1_Sub2_Sub1_1 == null || Static68.aClass9_Sub2_Sub1_Sub2_Sub1_1.aString6 == null) {
					local83 = "";
				} else {
					local83 = Static68.aClass9_Sub2_Sub1_Sub2_Sub1_1.method1160();
				}
				aStringArray56[anInt7134++] = local83;
				return;
			}
			if (arg0 == 5016) {
				anIntArray422[anInt7131++] = Static110.anInt2203;
				return;
			}
			if (arg0 == 5017) {
				anIntArray422[anInt7131++] = Static280.method4569();
				return;
			}
			if (arg0 == 5018) {
				local175 = anIntArray422[--anInt7131];
				local179 = Static589.method8183(local175);
				local97 = 0;
				if (local179 != null) {
					local97 = local179.anInt9987;
				}
				anIntArray422[anInt7131++] = local97;
				return;
			}
			if (arg0 == 5019) {
				local175 = anIntArray422[--anInt7131];
				local179 = Static589.method8183(local175);
				local181 = "";
				if (local179 != null && local179.aString105 != null) {
					local181 = local179.aString105;
				}
				aStringArray56[anInt7134++] = local181;
				return;
			}
			if (arg0 == 5020) {
				if (Static68.aClass9_Sub2_Sub1_Sub2_Sub1_1 == null || Static68.aClass9_Sub2_Sub1_Sub2_Sub1_1.aString6 == null) {
					local83 = "";
				} else {
					local83 = Static68.aClass9_Sub2_Sub1_Sub2_Sub1_1.method1159();
				}
				aStringArray56[anInt7134++] = local83;
				return;
			}
			if (arg0 == 5023) {
				local175 = anIntArray422[--anInt7131];
				local179 = Static589.method8183(local175);
				local97 = -1;
				if (local179 != null) {
					local97 = local179.anInt9993;
				}
				anIntArray422[anInt7131++] = local97;
				return;
			}
			if (arg0 == 5024) {
				local175 = anIntArray422[--anInt7131];
				local179 = Static589.method8183(local175);
				local97 = -1;
				if (local179 != null) {
					local97 = local179.anInt9990;
				}
				anIntArray422[anInt7131++] = local97;
				return;
			}
			if (arg0 == 5025) {
				local175 = anIntArray422[--anInt7131];
				local179 = Static589.method8183(local175);
				local181 = "";
				if (local179 != null && local179.aString103 != null) {
					local181 = local179.aString103;
				}
				aStringArray56[anInt7134++] = local181;
				return;
			}
			if (arg0 == 5050) {
				local175 = anIntArray422[--anInt7131];
				aStringArray56[anInt7134++] = Static131.aClass204_1.method5306(local175).aString20;
				return;
			}
			@Pc(736) Class3_Sub7_Sub9 local736;
			if (arg0 == 5051) {
				local175 = anIntArray422[--anInt7131];
				local736 = Static131.aClass204_1.method5306(local175);
				if (local736.anIntArray188 == null) {
					anIntArray422[anInt7131++] = 0;
					return;
				}
				anIntArray422[anInt7131++] = local736.anIntArray188.length;
				return;
			}
			if (arg0 == 5052) {
				anInt7131 -= 2;
				local175 = anIntArray422[anInt7131];
				local776 = anIntArray422[anInt7131 + 1];
				@Pc(781) Class3_Sub7_Sub9 local781 = Static131.aClass204_1.method5306(local175);
				local103 = local781.anIntArray188[local776];
				anIntArray422[anInt7131++] = local103;
				return;
			}
			if (arg0 == 5053) {
				local175 = anIntArray422[--anInt7131];
				local736 = Static131.aClass204_1.method5306(local175);
				if (local736.anIntArray190 == null) {
					anIntArray422[anInt7131++] = 0;
					return;
				}
				anIntArray422[anInt7131++] = local736.anIntArray190.length;
				return;
			}
			if (arg0 == 5054) {
				anInt7131 -= 2;
				local175 = anIntArray422[anInt7131];
				local776 = anIntArray422[anInt7131 + 1];
				anIntArray422[anInt7131++] = Static131.aClass204_1.method5306(local175).anIntArray190[local776];
				return;
			}
			if (arg0 == 5055) {
				local175 = anIntArray422[--anInt7131];
				aStringArray56[anInt7134++] = Static54.aClass257_1.method6447(local175).method4299();
				return;
			}
			if (arg0 == 5056) {
				local175 = anIntArray422[--anInt7131];
				@Pc(907) Class3_Sub7_Sub14 local907 = Static54.aClass257_1.method6447(local175);
				if (local907.anIntArray276 == null) {
					anIntArray422[anInt7131++] = 0;
					return;
				}
				anIntArray422[anInt7131++] = local907.anIntArray276.length;
				return;
			}
			if (arg0 == 5057) {
				anInt7131 -= 2;
				local175 = anIntArray422[anInt7131];
				local776 = anIntArray422[anInt7131 + 1];
				anIntArray422[anInt7131++] = Static54.aClass257_1.method6447(local175).anIntArray276[local776];
				return;
			}
			if (arg0 == 5058) {
				aClass238_1 = new Class238();
				aClass238_1.anInt6830 = anIntArray422[--anInt7131];
				aClass238_1.aClass3_Sub7_Sub14_1 = Static54.aClass257_1.method6447(aClass238_1.anInt6830);
				aClass238_1.anIntArray400 = new int[aClass238_1.aClass3_Sub7_Sub14_1.method4301()];
				return;
			}
			if (arg0 == 5059) {
				local52 = Static59.method1040(Static325.aClass20_2, Static141.aClass314_45);
				local52.aClass3_Sub9_Sub2_2.method5572(0);
				local776 = local52.aClass3_Sub9_Sub2_2.anInt6453;
				local52.aClass3_Sub9_Sub2_2.method5572(0);
				local52.aClass3_Sub9_Sub2_2.method5620(aClass238_1.anInt6830);
				aClass238_1.aClass3_Sub7_Sub14_1.method4300(aClass238_1.anIntArray400, local52.aClass3_Sub9_Sub2_2);
				local52.aClass3_Sub9_Sub2_2.method5615(local52.aClass3_Sub9_Sub2_2.anInt6453 - local776);
				Static148.method2572(local52);
				return;
			}
			if (arg0 == 5060) {
				local83 = aStringArray56[--anInt7134];
				local269 = Static59.method1040(Static325.aClass20_2, Static1.aClass314_140);
				local269.aClass3_Sub9_Sub2_2.method5572(0);
				local97 = local269.aClass3_Sub9_Sub2_2.anInt6453;
				local269.aClass3_Sub9_Sub2_2.method5638(local83);
				local269.aClass3_Sub9_Sub2_2.method5620(aClass238_1.anInt6830);
				aClass238_1.aClass3_Sub7_Sub14_1.method4300(aClass238_1.anIntArray400, local269.aClass3_Sub9_Sub2_2);
				local269.aClass3_Sub9_Sub2_2.method5615(local269.aClass3_Sub9_Sub2_2.anInt6453 - local97);
				Static148.method2572(local269);
				return;
			}
			if (arg0 == 5061) {
				local52 = Static59.method1040(Static325.aClass20_2, Static141.aClass314_45);
				local52.aClass3_Sub9_Sub2_2.method5572(0);
				local776 = local52.aClass3_Sub9_Sub2_2.anInt6453;
				local52.aClass3_Sub9_Sub2_2.method5572(1);
				local52.aClass3_Sub9_Sub2_2.method5620(aClass238_1.anInt6830);
				aClass238_1.aClass3_Sub7_Sub14_1.method4300(aClass238_1.anIntArray400, local52.aClass3_Sub9_Sub2_2);
				local52.aClass3_Sub9_Sub2_2.method5615(local52.aClass3_Sub9_Sub2_2.anInt6453 - local776);
				Static148.method2572(local52);
				return;
			}
			if (arg0 == 5062) {
				anInt7131 -= 2;
				local175 = anIntArray422[anInt7131];
				local776 = anIntArray422[anInt7131 + 1];
				anIntArray422[anInt7131++] = Static131.aClass204_1.method5306(local175).aCharArray7[local776];
				return;
			}
			if (arg0 == 5063) {
				anInt7131 -= 2;
				local175 = anIntArray422[anInt7131];
				local776 = anIntArray422[anInt7131 + 1];
				anIntArray422[anInt7131++] = Static131.aClass204_1.method5306(local175).aCharArray6[local776];
				return;
			}
			if (arg0 == 5064) {
				anInt7131 -= 2;
				local175 = anIntArray422[anInt7131];
				local776 = anIntArray422[anInt7131 + 1];
				if (local776 == -1) {
					anIntArray422[anInt7131++] = -1;
					return;
				}
				anIntArray422[anInt7131++] = Static131.aClass204_1.method5306(local175).method2598((char) local776);
				return;
			}
			if (arg0 == 5065) {
				anInt7131 -= 2;
				local175 = anIntArray422[anInt7131];
				local776 = anIntArray422[anInt7131 + 1];
				if (local776 == -1) {
					anIntArray422[anInt7131++] = -1;
					return;
				}
				anIntArray422[anInt7131++] = Static131.aClass204_1.method5306(local175).method2592((char) local776);
				return;
			}
			if (arg0 == 5066) {
				local175 = anIntArray422[--anInt7131];
				anIntArray422[anInt7131++] = Static54.aClass257_1.method6447(local175).method4301();
				return;
			}
			if (arg0 == 5067) {
				anInt7131 -= 2;
				local175 = anIntArray422[anInt7131];
				local776 = anIntArray422[anInt7131 + 1];
				local97 = Static54.aClass257_1.method6447(local175).method4304(local776).anInt5300;
				anIntArray422[anInt7131++] = local97;
				return;
			}
			if (arg0 == 5068) {
				anInt7131 -= 2;
				local175 = anIntArray422[anInt7131];
				local776 = anIntArray422[anInt7131 + 1];
				aClass238_1.anIntArray400[local175] = local776;
				return;
			}
			if (arg0 == 5069) {
				anInt7131 -= 2;
				local175 = anIntArray422[anInt7131];
				local776 = anIntArray422[anInt7131 + 1];
				aClass238_1.anIntArray400[local175] = local776;
				return;
			}
			if (arg0 == 5070) {
				anInt7131 -= 3;
				local175 = anIntArray422[anInt7131];
				local776 = anIntArray422[anInt7131 + 1];
				local97 = anIntArray422[anInt7131 + 2];
				@Pc(1448) Class3_Sub7_Sub14 local1448 = Static54.aClass257_1.method6447(local175);
				if (local1448.method4304(local776).anInt5300 != 0) {
					throw new RuntimeException("bad command");
				}
				anIntArray422[anInt7131++] = local1448.method4307(local97, local776);
				return;
			}
			if (arg0 == 5071) {
				local83 = aStringArray56[--anInt7134];
				local1496 = anIntArray422[--anInt7131] == 1;
				Static299.method5114(local1496, local83);
				anIntArray422[anInt7131++] = Static439.anInt9345;
				return;
			}
			if (arg0 == 5072) {
				if (Static306.aShortArray49 != null && Static497.anInt5760 < Static439.anInt9345) {
					anIntArray422[anInt7131++] = Static306.aShortArray49[Static497.anInt5760++] & 0xFFFF;
					return;
				}
				anIntArray422[anInt7131++] = -1;
				return;
			}
			if (arg0 == 5073) {
				Static497.anInt5760 = 0;
				return;
			}
		} else if (arg0 < 5200) {
			if (arg0 == 5100) {
				if (Static476.aClass62_2.method1421(86)) {
					anIntArray422[anInt7131++] = 1;
					return;
				}
				anIntArray422[anInt7131++] = 0;
				return;
			}
			if (arg0 == 5101) {
				if (Static476.aClass62_2.method1421(82)) {
					anIntArray422[anInt7131++] = 1;
					return;
				}
				anIntArray422[anInt7131++] = 0;
				return;
			}
			if (arg0 == 5102) {
				if (Static476.aClass62_2.method1421(81)) {
					anIntArray422[anInt7131++] = 1;
					return;
				}
				anIntArray422[anInt7131++] = 0;
				return;
			}
		} else {
			@Pc(2833) int local2833;
			@Pc(2107) boolean local2107;
			if (arg0 < 5300) {
				if (arg0 == 5200) {
					Static47.method899(anIntArray422[--anInt7131]);
					return;
				}
				if (arg0 == 5201) {
					anIntArray422[anInt7131++] = Static2.method28();
					return;
				}
				if (arg0 == 5205) {
					Static379.method5972(anIntArray422[--anInt7131], -1, false, -1);
					return;
				}
				@Pc(1696) Class3_Sub7_Sub6 local1696;
				if (arg0 == 5206) {
					local175 = anIntArray422[--anInt7131];
					local1696 = Static598.method2538(local175 >> 14 & 0x3FFF, local175 & 0x3FFF);
					if (local1696 == null) {
						anIntArray422[anInt7131++] = -1;
						return;
					}
					anIntArray422[anInt7131++] = local1696.anInt1846;
					return;
				}
				@Pc(1729) Class3_Sub7_Sub6 local1729;
				if (arg0 == 5207) {
					local1729 = Static598.method2547(anIntArray422[--anInt7131]);
					if (local1729 != null && local1729.aString11 != null) {
						aStringArray56[anInt7134++] = local1729.aString11;
						return;
					}
					aStringArray56[anInt7134++] = "";
					return;
				}
				if (arg0 == 5208) {
					anIntArray422[anInt7131++] = Static192.anInt3594;
					anIntArray422[anInt7131++] = Static124.anInt2655;
					return;
				}
				if (arg0 == 5209) {
					anIntArray422[anInt7131++] = Static122.anInt2649 + Static598.anInt2992;
					anIntArray422[anInt7131++] = Static168.anInt3275 + Static598.anInt2995;
					return;
				}
				if (arg0 == 5210) {
					local175 = anIntArray422[--anInt7131];
					local1696 = Static598.method2547(local175);
					if (local1696 == null) {
						anIntArray422[anInt7131++] = 0;
						anIntArray422[anInt7131++] = 0;
						return;
					}
					anIntArray422[anInt7131++] = local1696.anInt1842 >> 14 & 0x3FFF;
					anIntArray422[anInt7131++] = local1696.anInt1842 & 0x3FFF;
					return;
				}
				if (arg0 == 5211) {
					local175 = anIntArray422[--anInt7131];
					local1696 = Static598.method2547(local175);
					if (local1696 == null) {
						anIntArray422[anInt7131++] = 0;
						anIntArray422[anInt7131++] = 0;
						return;
					}
					anIntArray422[anInt7131++] = local1696.anInt1845 - local1696.anInt1840;
					anIntArray422[anInt7131++] = local1696.anInt1837 - local1696.anInt1847;
					return;
				}
				@Pc(1919) Class3_Sub47 local1919;
				if (arg0 == 5212) {
					local1919 = Static524.method7620();
					if (local1919 == null) {
						anIntArray422[anInt7131++] = -1;
						anIntArray422[anInt7131++] = -1;
						return;
					}
					anIntArray422[anInt7131++] = local1919.anInt9169;
					local776 = local1919.anInt9162 << 28 | local1919.anInt9168 + Static598.anInt2992 << 14 | local1919.anInt9165 + Static598.anInt2995;
					anIntArray422[anInt7131++] = local776;
					return;
				}
				if (arg0 == 5213) {
					local1919 = Static122.method2218();
					if (local1919 == null) {
						anIntArray422[anInt7131++] = -1;
						anIntArray422[anInt7131++] = -1;
						return;
					}
					anIntArray422[anInt7131++] = local1919.anInt9169;
					local776 = local1919.anInt9162 << 28 | local1919.anInt9168 + Static598.anInt2992 << 14 | local1919.anInt9165 + Static598.anInt2995;
					anIntArray422[anInt7131++] = local776;
					return;
				}
				@Pc(2067) boolean local2067;
				if (arg0 == 5214) {
					local175 = anIntArray422[--anInt7131];
					local1696 = Static321.method5308();
					if (local1696 != null) {
						local2067 = local1696.method1570(local175 >> 14 & 0x3FFF, local175 >> 28 & 0x3, local175 & 0x3FFF, anIntArray423);
						if (local2067) {
							Static308.method1833(anIntArray423[2], anIntArray423[1]);
						}
					}
					return;
				}
				if (arg0 == 5215) {
					anInt7131 -= 2;
					local175 = anIntArray422[anInt7131];
					local776 = anIntArray422[anInt7131 + 1];
					@Pc(2105) Class363 local2105 = Static598.method2531(local175 >> 14 & 0x3FFF, local175 & 0x3FFF);
					local2107 = false;
					for (@Pc(2112) Class3_Sub7_Sub6 local2112 = (Class3_Sub7_Sub6) local2105.method8414(); local2112 != null; local2112 = (Class3_Sub7_Sub6) local2105.method8415()) {
						if (local2112.anInt1846 == local776) {
							local2107 = true;
							break;
						}
					}
					if (local2107) {
						anIntArray422[anInt7131++] = 1;
						return;
					}
					anIntArray422[anInt7131++] = 0;
					return;
				}
				if (arg0 == 5218) {
					local175 = anIntArray422[--anInt7131];
					local1696 = Static598.method2547(local175);
					if (local1696 == null) {
						anIntArray422[anInt7131++] = -1;
						return;
					}
					anIntArray422[anInt7131++] = local1696.anInt1839;
					return;
				}
				if (arg0 == 5220) {
					anIntArray422[anInt7131++] = Static214.anInt4427 == 100 ? 1 : 0;
					return;
				}
				if (arg0 == 5221) {
					local175 = anIntArray422[--anInt7131];
					Static308.method1833(local175 & 0x3FFF, local175 >> 14 & 0x3FFF);
					return;
				}
				if (arg0 == 5222) {
					local1729 = Static321.method5308();
					if (local1729 != null) {
						local1496 = local1729.method1569(anIntArray423, Static122.anInt2649 + Static598.anInt2992, Static168.anInt3275 + Static598.anInt2995);
						if (local1496) {
							anIntArray422[anInt7131++] = anIntArray423[1];
							anIntArray422[anInt7131++] = anIntArray423[2];
							return;
						}
						anIntArray422[anInt7131++] = -1;
						anIntArray422[anInt7131++] = -1;
						return;
					}
					anIntArray422[anInt7131++] = -1;
					anIntArray422[anInt7131++] = -1;
					return;
				}
				if (arg0 == 5223) {
					anInt7131 -= 2;
					local175 = anIntArray422[anInt7131];
					local776 = anIntArray422[anInt7131 + 1];
					Static379.method5972(local175, local776 >> 14 & 0x3FFF, false, local776 & 0x3FFF);
					return;
				}
				if (arg0 == 5224) {
					local175 = anIntArray422[--anInt7131];
					local1696 = Static321.method5308();
					if (local1696 != null) {
						local2067 = local1696.method1570(local175 >> 14 & 0x3FFF, local175 >> 28 & 0x3, local175 & 0x3FFF, anIntArray423);
						if (local2067) {
							anIntArray422[anInt7131++] = anIntArray423[1];
							anIntArray422[anInt7131++] = anIntArray423[2];
							return;
						}
						anIntArray422[anInt7131++] = -1;
						anIntArray422[anInt7131++] = -1;
						return;
					}
					anIntArray422[anInt7131++] = -1;
					anIntArray422[anInt7131++] = -1;
					return;
				}
				if (arg0 == 5225) {
					local175 = anIntArray422[--anInt7131];
					local1696 = Static321.method5308();
					if (local1696 != null) {
						local2067 = local1696.method1569(anIntArray423, local175 >> 14 & 0x3FFF, local175 & 0x3FFF);
						if (local2067) {
							anIntArray422[anInt7131++] = anIntArray423[1];
							anIntArray422[anInt7131++] = anIntArray423[2];
							return;
						}
						anIntArray422[anInt7131++] = -1;
						anIntArray422[anInt7131++] = -1;
						return;
					}
					anIntArray422[anInt7131++] = -1;
					anIntArray422[anInt7131++] = -1;
					return;
				}
				if (arg0 == 5226) {
					Static274.method4525(anIntArray422[--anInt7131]);
					return;
				}
				if (arg0 == 5227) {
					anInt7131 -= 2;
					local175 = anIntArray422[anInt7131];
					local776 = anIntArray422[anInt7131 + 1];
					Static379.method5972(local175, local776 >> 14 & 0x3FFF, true, local776 & 0x3FFF);
					return;
				}
				if (arg0 == 5228) {
					Static631.aBoolean762 = anIntArray422[--anInt7131] == 1;
					return;
				}
				if (arg0 == 5229) {
					anIntArray422[anInt7131++] = Static631.aBoolean762 ? 1 : 0;
					return;
				}
				if (arg0 == 5230) {
					local175 = anIntArray422[--anInt7131];
					Static322.method5337(local175);
					return;
				}
				@Pc(2625) Class3 local2625;
				if (arg0 == 5231) {
					anInt7131 -= 2;
					local175 = anIntArray422[anInt7131];
					local1496 = anIntArray422[anInt7131 + 1] == 1;
					if (Static618.aClass25_47 != null) {
						local2625 = Static618.aClass25_47.method426((long) local175);
						if (local2625 != null && !local1496) {
							local2625.method8682();
							return;
						}
						if (local2625 == null && local1496) {
							local2625 = new Class3();
							Static618.aClass25_47.method434((long) local175, local2625);
						}
					}
					return;
				}
				@Pc(2667) Class3 local2667;
				if (arg0 == 5232) {
					local175 = anIntArray422[--anInt7131];
					if (Static618.aClass25_47 != null) {
						local2667 = Static618.aClass25_47.method426((long) local175);
						anIntArray422[anInt7131++] = local2667 == null ? 0 : 1;
						return;
					}
					anIntArray422[anInt7131++] = 0;
					return;
				}
				if (arg0 == 5233) {
					anInt7131 -= 2;
					local175 = anIntArray422[anInt7131];
					local1496 = anIntArray422[anInt7131 + 1] == 1;
					if (Static347.aClass25_26 != null) {
						local2625 = Static347.aClass25_26.method426((long) local175);
						if (local2625 != null && !local1496) {
							local2625.method8682();
							return;
						}
						if (local2625 == null && local1496) {
							local2625 = new Class3();
							Static347.aClass25_26.method434((long) local175, local2625);
						}
					}
					return;
				}
				if (arg0 == 5234) {
					local175 = anIntArray422[--anInt7131];
					if (Static347.aClass25_26 != null) {
						local2667 = Static347.aClass25_26.method426((long) local175);
						anIntArray422[anInt7131++] = local2667 == null ? 0 : 1;
						return;
					}
					anIntArray422[anInt7131++] = 0;
					return;
				}
				if (arg0 == 5235) {
					anIntArray422[anInt7131++] = Static598.aClass3_Sub7_Sub6_3 == null ? -1 : Static598.aClass3_Sub7_Sub6_3.anInt1846;
					return;
				}
				if (arg0 == 5236) {
					anInt7131 -= 2;
					local175 = anIntArray422[anInt7131];
					local776 = anIntArray422[anInt7131 + 1];
					local97 = local776 >> 14 & 0x3FFF;
					local103 = local776 & 0x3FFF;
					local2833 = Static17.method258(local175, local103, local97);
					if (local2833 < 0) {
						anIntArray422[anInt7131++] = -1;
						return;
					}
					anIntArray422[anInt7131++] = local2833;
					return;
				}
				if (arg0 == 5237) {
					Static464.method6853();
					return;
				}
			} else if (arg0 < 5400) {
				if (arg0 == 5300) {
					anInt7131 -= 2;
					local175 = anIntArray422[anInt7131];
					local776 = anIntArray422[anInt7131 + 1];
					Static545.method7843(local776, 3, local175, false);
					anIntArray422[anInt7131++] = Static355.aFrame7 == null ? 0 : 1;
					return;
				}
				if (arg0 == 5301) {
					if (Static355.aFrame7 != null) {
						Static545.method7843(-1, Static32.aClass3_Sub41_3.aClass7_Sub22_2.method6533(), -1, false);
					}
					return;
				}
				if (arg0 == 5302) {
					@Pc(2919) Class334[] local2919 = Static143.method2415();
					anIntArray422[anInt7131++] = local2919.length;
					return;
				}
				if (arg0 == 5303) {
					local175 = anIntArray422[--anInt7131];
					@Pc(2943) Class334[] local2943 = Static143.method2415();
					anIntArray422[anInt7131++] = local2943[local175].anInt9336;
					anIntArray422[anInt7131++] = local2943[local175].anInt9335;
					return;
				}
				if (arg0 == 5305) {
					local175 = Static25.anInt363;
					local776 = Static213.anInt4406;
					local97 = -1;
					@Pc(2978) Class334[] local2978 = Static143.method2415();
					for (local2833 = 0; local2833 < local2978.length; local2833++) {
						@Pc(2985) Class334 local2985 = local2978[local2833];
						if (local2985.anInt9336 == local175 && local2985.anInt9335 == local776) {
							local97 = local2833;
							break;
						}
					}
					anIntArray422[anInt7131++] = local97;
					return;
				}
				if (arg0 == 5306) {
					anIntArray422[anInt7131++] = Static339.method917();
					return;
				}
				if (arg0 == 5307) {
					local175 = anIntArray422[--anInt7131];
					if (local175 >= 1 && local175 <= 2) {
						Static545.method7843(-1, local175, -1, false);
						return;
					}
					return;
				}
				if (arg0 == 5308) {
					anIntArray422[anInt7131++] = Static32.aClass3_Sub41_3.aClass7_Sub22_2.method6533();
					return;
				}
				if (arg0 == 5309) {
					local175 = anIntArray422[--anInt7131];
					if (local175 >= 1 && local175 <= 2) {
						Static32.aClass3_Sub41_3.method6773(local175, Static32.aClass3_Sub41_3.aClass7_Sub22_2);
						Static32.aClass3_Sub41_3.method6773(local175, Static32.aClass3_Sub41_3.aClass7_Sub22_1);
						Static124.method2223();
						return;
					}
					return;
				}
			} else {
				@Pc(3271) int local3271;
				if (arg0 < 5500) {
					if (arg0 == 5400) {
						anInt7134 -= 2;
						local83 = aStringArray56[anInt7134];
						local89 = aStringArray56[anInt7134 + 1];
						local97 = anIntArray422[--anInt7131];
						@Pc(3133) Class3_Sub27 local3133 = Static59.method1040(Static325.aClass20_2, Static268.aClass314_81);
						local3133.aClass3_Sub9_Sub2_2.method5572(Static300.method8285(local83) + Static300.method8285(local89) + 1);
						local3133.aClass3_Sub9_Sub2_2.method5638(local83);
						local3133.aClass3_Sub9_Sub2_2.method5638(local89);
						local3133.aClass3_Sub9_Sub2_2.method5572(local97);
						Static148.method2572(local3133);
						return;
					}
					if (arg0 == 5401) {
						anInt7131 -= 2;
						Static331.aShortArray54[anIntArray422[anInt7131]] = (short) Static64.method1060(anIntArray422[anInt7131 + 1]);
						Static298.aClass132_1.method3059();
						Static298.aClass132_1.method3064();
						Static153.aClass2_1.method21();
						Static647.method8677();
						return;
					}
					if (arg0 == 5405) {
						anInt7131 -= 2;
						local175 = anIntArray422[anInt7131];
						local776 = anIntArray422[anInt7131 + 1];
						if (local175 >= 0 && local175 < 2) {
							Static583.anIntArrayArrayArray37[local175] = new int[local776 << 1][4];
						}
						return;
					}
					if (arg0 == 5406) {
						anInt7131 -= 7;
						local175 = anIntArray422[anInt7131];
						local776 = anIntArray422[anInt7131 + 1] << 1;
						local97 = anIntArray422[anInt7131 + 2];
						local103 = anIntArray422[anInt7131 + 3];
						local2833 = anIntArray422[anInt7131 + 4];
						local3271 = anIntArray422[anInt7131 + 5];
						@Pc(3277) int local3277 = anIntArray422[anInt7131 + 6];
						if (local175 >= 0 && local175 < 2 && Static583.anIntArrayArrayArray37[local175] != null && local776 >= 0 && local776 < Static583.anIntArrayArrayArray37[local175].length) {
							Static583.anIntArrayArrayArray37[local175][local776] = new int[] { (local97 >> 14 & 0x3FFF) << 9, local103 << 2, (local97 & 0x3FFF) << 9, local3277 };
							Static583.anIntArrayArrayArray37[local175][local776 + 1] = new int[] { (local2833 >> 14 & 0x3FFF) << 9, local3271 << 2, (local2833 & 0x3FFF) << 9 };
						}
						return;
					}
					if (arg0 == 5407) {
						local175 = Static583.anIntArrayArrayArray37[anIntArray422[--anInt7131]].length >> 1;
						anIntArray422[anInt7131++] = local175;
						return;
					}
					if (arg0 == 5411) {
						if (Static355.aFrame7 != null) {
							Static545.method7843(-1, Static32.aClass3_Sub41_3.aClass7_Sub22_2.method6533(), -1, false);
						}
						if (Static190.aFrame1 != null) {
							Static173.method2878();
							System.exit(0);
							return;
						}
						local83 = Static380.aString49 == null ? Static401.method6291() : Static380.aString49;
						Static254.method1240(Static32.aClass3_Sub41_3.aClass7_Sub9_2.method4181() == 1, false, local83, Static48.aClass298_12);
						return;
					}
					if (arg0 == 5419) {
						local83 = "";
						if (Static170.aClass174_4 != null) {
							if (Static170.aClass174_4.anObject12 == null) {
								local83 = Static550.method7854(Static170.aClass174_4.anInt5124);
							} else {
								local83 = (String) Static170.aClass174_4.anObject12;
							}
						}
						aStringArray56[anInt7134++] = local83;
						return;
					}
					if (arg0 == 5420) {
						anIntArray422[anInt7131++] = Static48.aClass298_12.aBoolean613 ? 0 : 1;
						return;
					}
					if (arg0 == 5421) {
						if (Static355.aFrame7 != null) {
							Static545.method7843(-1, Static32.aClass3_Sub41_3.aClass7_Sub22_2.method6533(), -1, false);
						}
						local83 = aStringArray56[--anInt7134];
						local1496 = anIntArray422[--anInt7131] == 1;
						local181 = Static401.method6291() + local83;
						Static254.method1240(Static32.aClass3_Sub41_3.aClass7_Sub9_2.method4181() == 1, local1496, local181, Static48.aClass298_12);
						return;
					}
					if (arg0 == 5422) {
						anInt7134 -= 2;
						local83 = aStringArray56[anInt7134];
						local89 = aStringArray56[anInt7134 + 1];
						local97 = anIntArray422[--anInt7131];
						if (local83.length() > 0) {
							if (Static12.aStringArray5 == null) {
								Static12.aStringArray5 = new String[Static26.anIntArray31[Static431.aClass133_11.anInt3574]];
							}
							Static12.aStringArray5[local97] = local83;
						}
						if (local89.length() > 0) {
							if (Static13.aStringArray6 == null) {
								Static13.aStringArray6 = new String[Static26.anIntArray31[Static431.aClass133_11.anInt3574]];
							}
							Static13.aStringArray6[local97] = local89;
						}
						return;
					}
					if (arg0 == 5423) {
						System.out.println(aStringArray56[--anInt7134]);
						return;
					}
					if (arg0 == 5424) {
						anInt7131 -= 11;
						Static493.anInt8371 = anIntArray422[anInt7131];
						Static541.anInt9076 = anIntArray422[anInt7131 + 1];
						Static250.anInt7626 = anIntArray422[anInt7131 + 2];
						Static152.anInt3131 = anIntArray422[anInt7131 + 3];
						Static450.anInt7670 = anIntArray422[anInt7131 + 4];
						Static24.anInt344 = anIntArray422[anInt7131 + 5];
						Static601.anInt9749 = anIntArray422[anInt7131 + 6];
						Static284.anInt5429 = anIntArray422[anInt7131 + 7];
						Static462.anInt7901 = anIntArray422[anInt7131 + 8];
						Static514.anInt8691 = anIntArray422[anInt7131 + 9];
						Static524.anInt8883 = anIntArray422[anInt7131 + 10];
						Static419.aClass343_200.method8138(Static450.anInt7670);
						Static419.aClass343_200.method8138(Static24.anInt344);
						Static419.aClass343_200.method8138(Static601.anInt9749);
						Static419.aClass343_200.method8138(Static284.anInt5429);
						Static419.aClass343_200.method8138(Static462.anInt7901);
						Static282.aClass103_29 = null;
						Static426.aClass103_37 = null;
						Static259.aClass103_27 = null;
						Static74.aClass103_5 = null;
						Static448.aClass103_31 = null;
						Static324.aClass103_33 = null;
						Static376.aClass103_48 = null;
						Static196.aClass103_15 = null;
						Static53.aBoolean52 = true;
						return;
					}
					if (arg0 == 5425) {
						Static473.method7003();
						Static53.aBoolean52 = false;
						return;
					}
					if (arg0 == 5426) {
						anInt7131 -= 2;
						Static111.anInt2222 = anIntArray422[anInt7131];
						Static299.anInt5924 = anIntArray422[anInt7131 + 1];
						return;
					}
					if (arg0 == 5427) {
						anInt7131 -= 2;
						Static135.anInt2826 = anIntArray422[anInt7131 + 1];
						return;
					}
					if (arg0 == 5428) {
						anInt7131 -= 2;
						local175 = anIntArray422[anInt7131];
						local776 = anIntArray422[anInt7131 + 1];
						anIntArray422[anInt7131++] = Static303.method7243(local175, local776) ? 1 : 0;
						return;
					}
					if (arg0 == 5429) {
						Static214.method3768(aStringArray56[--anInt7134], false, false);
						return;
					}
					if (arg0 == 5430) {
						try {
							Static652.method1818("accountcreated", Static303.anApplet3);
							return;
						} catch (@Pc(3819) Throwable local3819) {
							return;
						}
					}
					if (arg0 == 5431) {
						try {
							Static652.method1818("accountcreatestarted", Static303.anApplet3);
							return;
						} catch (@Pc(3830) Throwable local3830) {
							return;
						}
					}
					if (arg0 == 5432) {
						local83 = "";
						if (Static472.aClipboard1 != null) {
							@Pc(3842) Transferable local3842 = Static472.aClipboard1.getContents((Object) null);
							if (local3842 != null) {
								try {
									local83 = (String) local3842.getTransferData(DataFlavor.stringFlavor);
									if (local83 == null) {
										local83 = "";
									}
								} catch (@Pc(3855) Exception local3855) {
								}
							}
						}
						aStringArray56[anInt7134++] = local83;
						return;
					}
					if (arg0 == 5433) {
						Static297.anInt8681 = anIntArray422[--anInt7131];
						return;
					}
					if (arg0 == 5435) {
						anIntArray422[anInt7131++] = Static543.aBoolean676 ? 1 : 0;
						return;
					}
				} else if (arg0 < 5600) {
					if (arg0 == 5500) {
						anInt7131 -= 4;
						local175 = anIntArray422[anInt7131];
						local776 = anIntArray422[anInt7131 + 1];
						local97 = anIntArray422[anInt7131 + 2];
						local103 = anIntArray422[anInt7131 + 3];
						Static570.method3074(false, local97, local776 << 2, (local175 & 0x3FFF) - Static22.anInt329, local103, (local175 >> 14 & 0x3FFF) - Static427.anInt7462);
						return;
					}
					if (arg0 == 5501) {
						anInt7131 -= 4;
						local175 = anIntArray422[anInt7131];
						local776 = anIntArray422[anInt7131 + 1];
						local97 = anIntArray422[anInt7131 + 2];
						local103 = anIntArray422[anInt7131 + 3];
						Static613.method8373(local103, local97, local776 << 2, (local175 >> 14 & 0x3FFF) - Static427.anInt7462, (local175 & 0x3FFF) - Static22.anInt329);
						return;
					}
					if (arg0 == 5502) {
						anInt7131 -= 6;
						local175 = anIntArray422[anInt7131];
						if (local175 >= 2) {
							throw new RuntimeException();
						}
						Static300.anInt9743 = local175;
						local776 = anIntArray422[anInt7131 + 1];
						if (local776 + 1 >= Static583.anIntArrayArrayArray37[Static300.anInt9743].length >> 1) {
							throw new RuntimeException();
						}
						Static634.anInt10078 = local776;
						Static235.anInt4693 = 0;
						Static615.anInt9898 = anIntArray422[anInt7131 + 2];
						Static49.anInt969 = anIntArray422[anInt7131 + 3];
						local97 = anIntArray422[anInt7131 + 4];
						if (local97 >= 2) {
							throw new RuntimeException();
						}
						Static138.anInt2851 = local97;
						local103 = anIntArray422[anInt7131 + 5];
						if (local103 + 1 >= Static583.anIntArrayArrayArray37[Static138.anInt2851].length >> 1) {
							throw new RuntimeException();
						}
						Static209.anInt3820 = local103;
						Static471.anInt8064 = 3;
						Static189.anInt3565 = -1;
						Static68.anInt1361 = -1;
						return;
					}
					if (arg0 == 5503) {
						Static494.method7224();
						return;
					}
					if (arg0 == 5504) {
						anInt7131 -= 2;
						Static512.method7422(anIntArray422[anInt7131], anIntArray422[anInt7131 + 1]);
						return;
					}
					if (arg0 == 5505) {
						anIntArray422[anInt7131++] = (int) Static509.aFloat152 >> 3;
						return;
					}
					if (arg0 == 5506) {
						anIntArray422[anInt7131++] = (int) Static170.aFloat71 >> 3;
						return;
					}
					if (arg0 == 5507) {
						Static648.method8679();
						return;
					}
					if (arg0 == 5508) {
						Static435.method6600();
						return;
					}
					if (arg0 == 5509) {
						Static399.method6275();
						return;
					}
					if (arg0 == 5510) {
						Static479.method6548();
						return;
					}
					if (arg0 == 5511) {
						local175 = anIntArray422[--anInt7131];
						local776 = local175 >> 14 & 0x3FFF;
						local97 = local175 & 0x3FFF;
						local776 -= Static427.anInt7462;
						if (local776 < 0) {
							local776 = 0;
						} else if (local776 >= Static399.anInt7121) {
							local776 = Static399.anInt7121;
						}
						local97 -= Static22.anInt329;
						if (local97 < 0) {
							local97 = 0;
						} else if (local97 >= Static24.anInt345) {
							local97 = Static24.anInt345;
						}
						Static49.anInt971 = (local776 << 9) + 256;
						Static528.anInt8946 = (local97 << 9) + 256;
						Static471.anInt8064 = 4;
						Static189.anInt3565 = -1;
						Static68.anInt1361 = -1;
						return;
					}
					if (arg0 == 5512) {
						Static366.method5861();
						return;
					}
					if (arg0 == 5514) {
						Static562.anInt9324 = anIntArray422[--anInt7131];
						return;
					}
					if (arg0 == 5516) {
						anIntArray422[anInt7131++] = Static562.anInt9324;
						return;
					}
					if (arg0 == 5517) {
						local175 = anIntArray422[--anInt7131];
						if (local175 == -1) {
							local776 = local175 >> 14 & 0x3FFF;
							local97 = local175 & 0x3FFF;
							local776 -= Static427.anInt7462;
							if (local776 < 0) {
								local776 = 0;
							} else if (local776 >= Static399.anInt7121) {
								local776 = Static399.anInt7121;
							}
							local97 -= Static22.anInt329;
							if (local97 < 0) {
								local97 = 0;
							} else if (local97 >= Static24.anInt345) {
								local97 = Static24.anInt345;
							}
							Static68.anInt1361 = (local776 << 9) + 256;
							Static189.anInt3565 = (local97 << 9) + 256;
							return;
						}
						Static68.anInt1361 = -1;
						Static189.anInt3565 = -1;
						return;
					}
				} else if (arg0 < 5700) {
					if (arg0 == 5600) {
						anInt7134 -= 2;
						local83 = aStringArray56[anInt7134];
						local89 = aStringArray56[anInt7134 + 1];
						local97 = anIntArray422[--anInt7131];
						if (local83.length() > 320) {
							return;
						}
						if (Static82.anInt1653 != 3) {
							return;
						}
						if (Static71.anInt1424 == 0 && Static187.anInt3550 == 0) {
							Static265.aString40 = local83;
							Static465.aString71 = local89;
							Static550.anInt9147 = local97;
							Static206.method3226(6);
							return;
						}
						return;
					}
					if (arg0 == 5601) {
						Static302.method5129();
						return;
					}
					if (arg0 == 5602) {
						if (Static71.anInt1424 == 0) {
							Static213.anInt4387 = -2;
							Static154.anInt3148 = -2;
						}
						return;
					}
					if (arg0 == 5604) {
						anInt7134--;
						if (Static82.anInt1653 != 3) {
							return;
						}
						if (Static71.anInt1424 == 0 && Static187.anInt3550 == 0) {
							Static227.method3945(aStringArray56[anInt7134]);
							return;
						}
						return;
					}
					if (arg0 == 5605) {
						anInt7134 -= 2;
						anInt7131 -= 2;
						if (Static82.anInt1653 != 3) {
							return;
						}
						if (Static71.anInt1424 == 0 && Static187.anInt3550 == 0) {
							Static204.method3219(aStringArray56[anInt7134], anIntArray422[anInt7131], aStringArray56[anInt7134 + 1], anIntArray422[anInt7131 + 1] == 1);
							return;
						}
						return;
					}
					if (arg0 == 5606) {
						if (Static187.anInt3550 == 0) {
							Static32.anInt482 = -2;
						}
						return;
					}
					if (arg0 == 5607) {
						anIntArray422[anInt7131++] = Static154.anInt3148;
						return;
					}
					if (arg0 == 5608) {
						anIntArray422[anInt7131++] = Static607.anInt9800;
						return;
					}
					if (arg0 == 5609) {
						anIntArray422[anInt7131++] = Static32.anInt482;
						return;
					}
					if (arg0 == 5611) {
						anIntArray422[anInt7131++] = Static167.anInt3261;
						return;
					}
					if (arg0 == 5612) {
						local175 = anIntArray422[--anInt7131];
						if (Static82.anInt1653 != 7) {
							return;
						}
						if (Static71.anInt1424 == 0 && Static187.anInt3550 == 0) {
							if (Static547.aClass197_1 != null) {
								Static547.aClass197_1.method5188();
								Static547.aClass197_1 = null;
							}
							Static550.anInt9147 = local175;
							Static206.method3226(9);
							return;
						}
						return;
					}
					if (arg0 == 5613) {
						anIntArray422[anInt7131++] = Static154.anInt3148;
						return;
					}
					if (arg0 == 5615) {
						anInt7134 -= 2;
						local83 = aStringArray56[anInt7134];
						local89 = aStringArray56[anInt7134 + 1];
						if (local83.length() > 320) {
							return;
						}
						if (Static82.anInt1653 != 3) {
							return;
						}
						if (Static71.anInt1424 == 0 && Static187.anInt3550 == 0) {
							if (Static547.aClass197_1 != null) {
								Static547.aClass197_1.method5188();
								Static547.aClass197_1 = null;
							}
							Static265.aString40 = local83;
							Static465.aString71 = local89;
							Static206.method3226(5);
							return;
						}
						return;
					}
					if (arg0 == 5616) {
						Static416.method6442(false);
						return;
					}
					if (arg0 == 5617) {
						anIntArray422[anInt7131++] = Static213.anInt4387;
						return;
					}
					if (arg0 == 5618) {
						anInt7131--;
						return;
					}
					if (arg0 == 5619) {
						anInt7131--;
						return;
					}
					if (arg0 == 5620) {
						anIntArray422[anInt7131++] = 0;
						return;
					}
					if (arg0 == 5621) {
						anInt7134 -= 2;
						anInt7131 -= 2;
						return;
					}
					if (arg0 == 5622) {
						return;
					}
					if (arg0 == 5623) {
						if (Static111.aString13 != null) {
							anIntArray422[anInt7131++] = 1;
							return;
						}
						anIntArray422[anInt7131++] = 0;
						return;
					}
					if (arg0 == 5624) {
						anIntArray422[anInt7131++] = (int) (Static145.aLong103 >> 32);
						anIntArray422[anInt7131++] = (int) (Static145.aLong103 & 0xFFFFFFFFFFFFFFFFL);
						return;
					}
					if (arg0 == 5625) {
						anIntArray422[anInt7131++] = Static502.aBoolean614 ? 1 : 0;
						return;
					}
					if (arg0 == 5626) {
						Static502.aBoolean614 = true;
						Static9.method188();
						return;
					}
				} else if (arg0 < 6100) {
					if (arg0 == 6001) {
						local175 = anIntArray422[--anInt7131];
						Static32.aClass3_Sub41_3.method6773(local175, Static32.aClass3_Sub41_3.aClass7_Sub24_1);
						Static1.method8036();
						Static124.method2223();
						Static576.aBoolean708 = false;
						return;
					}
					@Pc(4802) boolean local4802;
					if (arg0 == 6002) {
						local4802 = anIntArray422[--anInt7131] == 1;
						Static32.aClass3_Sub41_3.method6773(local4802 ? 1 : 0, Static32.aClass3_Sub41_3.aClass7_Sub13_1);
						Static32.aClass3_Sub41_3.method6773(local4802 ? 1 : 0, Static32.aClass3_Sub41_3.aClass7_Sub13_2);
						Static1.method8036();
						Static212.method3299();
						Static124.method2223();
						Static576.aBoolean708 = false;
						return;
					}
					if (arg0 == 6003) {
						local4802 = anIntArray422[--anInt7131] == 1;
						Static32.aClass3_Sub41_3.method6773(local4802 ? 2 : 1, Static32.aClass3_Sub41_3.aClass7_Sub8_1);
						Static32.aClass3_Sub41_3.method6773(local4802 ? 2 : 1, Static32.aClass3_Sub41_3.aClass7_Sub8_2);
						Static212.method3299();
						Static124.method2223();
						Static576.aBoolean708 = false;
						return;
					}
					if (arg0 == 6005) {
						Static32.aClass3_Sub41_3.method6773(anIntArray422[--anInt7131] == 1 ? 1 : 0, Static32.aClass3_Sub41_3.aClass7_Sub29_1);
						Static1.method8036();
						Static124.method2223();
						Static576.aBoolean708 = false;
						return;
					}
					if (arg0 == 6007) {
						Static32.aClass3_Sub41_3.method6773(anIntArray422[--anInt7131], Static32.aClass3_Sub41_3.aClass7_Sub18_1);
						Static124.method2223();
						Static576.aBoolean708 = false;
						return;
					}
					if (arg0 == 6008) {
						Static32.aClass3_Sub41_3.method6773(anIntArray422[--anInt7131] == 1 ? 1 : 0, Static32.aClass3_Sub41_3.aClass7_Sub16_1);
						Static124.method2223();
						Static576.aBoolean708 = false;
						return;
					}
					if (arg0 == 6010) {
						Static32.aClass3_Sub41_3.method6773(anIntArray422[--anInt7131] == 1 ? 1 : 0, Static32.aClass3_Sub41_3.aClass7_Sub10_1);
						Static124.method2223();
						Static576.aBoolean708 = false;
						return;
					}
					if (arg0 == 6011) {
						Static32.aClass3_Sub41_3.method6773(anIntArray422[--anInt7131], Static32.aClass3_Sub41_3.aClass7_Sub2_1);
						Static1.method8036();
						Static124.method2223();
						Static576.aBoolean708 = false;
						return;
					}
					if (arg0 == 6012) {
						Static32.aClass3_Sub41_3.method6773(anIntArray422[--anInt7131] == 1 ? 1 : 0, Static32.aClass3_Sub41_3.aClass7_Sub6_1);
						Static408.method6354();
						Static183.method2986();
						Static124.method2223();
						Static576.aBoolean708 = false;
						return;
					}
					if (arg0 == 6014) {
						Static32.aClass3_Sub41_3.method6773(anIntArray422[--anInt7131] == 1 ? 2 : 0, Static32.aClass3_Sub41_3.aClass7_Sub27_1);
						Static1.method8036();
						Static124.method2223();
						Static576.aBoolean708 = false;
						return;
					}
					if (arg0 == 6015) {
						Static32.aClass3_Sub41_3.method6773(anIntArray422[--anInt7131] == 1 ? 1 : 0, Static32.aClass3_Sub41_3.aClass7_Sub7_1);
						Static1.method8036();
						Static124.method2223();
						Static576.aBoolean708 = false;
						return;
					}
					if (arg0 == 6016) {
						Static32.aClass3_Sub41_3.method6773(anIntArray422[--anInt7131], Static32.aClass3_Sub41_3.aClass7_Sub26_2);
						Static230.method3973(Static32.aClass3_Sub41_3.aClass7_Sub9_2.method4181(), false);
						Static124.method2223();
						return;
					}
					if (arg0 == 6017) {
						Static32.aClass3_Sub41_3.method6773(anIntArray422[--anInt7131] == 1 ? 1 : 0, Static32.aClass3_Sub41_3.aClass7_Sub5_1);
						Static104.method1723();
						Static124.method2223();
						Static576.aBoolean708 = false;
						return;
					}
					if (arg0 == 6018) {
						Static32.aClass3_Sub41_3.method6773(anIntArray422[--anInt7131], Static32.aClass3_Sub41_3.aClass7_Sub15_2);
						Static124.method2223();
						Static576.aBoolean708 = false;
						return;
					}
					if (arg0 == 6019) {
						local175 = anIntArray422[--anInt7131];
						local776 = Static32.aClass3_Sub41_3.aClass7_Sub15_1.method5663();
						if (local175 != local776) {
							if (Static26.method368(Static82.anInt1653)) {
								if (local776 == 0 && Static573.anInt6752 != -1) {
									Static471.method6966(local175, Static521.aClass343_238, Static573.anInt6752);
									Static612.method8364();
									Static145.aBoolean263 = false;
								} else if (local175 == 0) {
									Static70.method1243();
									Static145.aBoolean263 = false;
								} else {
									Static386.method7125(local175);
								}
							}
							Static32.aClass3_Sub41_3.method6773(local175, Static32.aClass3_Sub41_3.aClass7_Sub15_1);
							Static124.method2223();
							Static576.aBoolean708 = false;
						}
						return;
					}
					if (arg0 == 6020) {
						Static32.aClass3_Sub41_3.method6773(anIntArray422[--anInt7131], Static32.aClass3_Sub41_3.aClass7_Sub15_5);
						Static124.method2223();
						Static576.aBoolean708 = false;
						return;
					}
					if (arg0 == 6021) {
						local175 = Static32.aClass3_Sub41_3.aClass7_Sub8_1.method3974();
						Static32.aClass3_Sub41_3.method6773(anIntArray422[--anInt7131] == 1 ? 0 : local175, Static32.aClass3_Sub41_3.aClass7_Sub8_2);
						Static212.method3299();
						return;
					}
					if (arg0 == 6023) {
						local175 = anIntArray422[--anInt7131];
						Static32.aClass3_Sub41_3.method6773(local175, Static32.aClass3_Sub41_3.aClass7_Sub3_1);
						Static124.method2223();
						Static576.aBoolean708 = false;
						return;
					}
					if (arg0 == 6024) {
						Static32.aClass3_Sub41_3.method6773(anIntArray422[--anInt7131], Static32.aClass3_Sub41_3.aClass7_Sub26_1);
						Static124.method2223();
						return;
					}
					if (arg0 == 6025) {
						Static32.aClass3_Sub41_3.method6773(anIntArray422[--anInt7131], Static32.aClass3_Sub41_3.aClass7_Sub11_1);
						Static124.method2223();
						Static576.aBoolean708 = false;
						return;
					}
					if (arg0 == 6027) {
						local175 = anIntArray422[--anInt7131];
						if (local175 < 0 || local175 > 1) {
							local175 = 0;
						}
						Static64.method1059(local175 == 1);
						return;
					}
					if (arg0 == 6028) {
						Static32.aClass3_Sub41_3.method6773(anIntArray422[--anInt7131] == 0 ? 0 : 1, Static32.aClass3_Sub41_3.aClass7_Sub19_1);
						Static124.method2223();
						return;
					}
					if (arg0 == 6029) {
						Static32.aClass3_Sub41_3.method6773(anIntArray422[--anInt7131], Static32.aClass3_Sub41_3.aClass7_Sub18_1);
						Static124.method2223();
						return;
					}
					if (arg0 == 6030) {
						Static32.aClass3_Sub41_3.method6773(anIntArray422[--anInt7131] == 0 ? 0 : 1, Static32.aClass3_Sub41_3.aClass7_Sub1_1);
						Static124.method2223();
						Static1.method8036();
						return;
					}
					if (arg0 == 6031) {
						local175 = anIntArray422[--anInt7131];
						if (local175 < 0 || local175 > 5) {
							local175 = 2;
						}
						Static230.method3973(local175, false);
						return;
					}
					if (arg0 == 6032) {
						anInt7131 -= 2;
						local175 = anIntArray422[anInt7131];
						local1496 = anIntArray422[anInt7131 + 1] == 1;
						Static32.aClass3_Sub41_3.method6773(local175, Static32.aClass3_Sub41_3.aClass7_Sub9_1);
						if (!local1496) {
							Static32.aClass3_Sub41_3.method6773(0, Static32.aClass3_Sub41_3.aClass7_Sub14_1);
						}
						Static124.method2223();
						Static576.aBoolean708 = false;
						return;
					}
					if (arg0 == 6033) {
						Static32.aClass3_Sub41_3.method6773(anIntArray422[--anInt7131], Static32.aClass3_Sub41_3.aClass7_Sub17_1);
						Static124.method2223();
						return;
					}
					if (arg0 == 6034) {
						Static32.aClass3_Sub41_3.method6773(anIntArray422[--anInt7131] == 1 ? 1 : 0, Static32.aClass3_Sub41_3.aClass7_Sub28_1);
						Static124.method2223();
						Static408.method6354();
						Static576.aBoolean708 = false;
						return;
					}
					if (arg0 == 6035) {
						local175 = Static32.aClass3_Sub41_3.aClass7_Sub13_1.method5385();
						Static32.aClass3_Sub41_3.method6773(anIntArray422[--anInt7131] == 1 ? 1 : local175, Static32.aClass3_Sub41_3.aClass7_Sub13_2);
						Static1.method8036();
						Static212.method3299();
						return;
					}
					if (arg0 == 6036) {
						Static32.aClass3_Sub41_3.method6773(anIntArray422[--anInt7131], Static32.aClass3_Sub41_3.aClass7_Sub20_1);
						Static124.method2223();
						Static264.aBoolean581 = true;
						return;
					}
					if (arg0 == 6037) {
						Static32.aClass3_Sub41_3.method6773(anIntArray422[--anInt7131], Static32.aClass3_Sub41_3.aClass7_Sub15_3);
						Static124.method2223();
						Static576.aBoolean708 = false;
						return;
					}
					if (arg0 == 6038) {
						local175 = anIntArray422[--anInt7131];
						local776 = Static32.aClass3_Sub41_3.aClass7_Sub15_4.method5663();
						if (local175 != local776 && Static573.anInt6752 == Static384.anInt6926) {
							if (!Static26.method368(Static82.anInt1653)) {
								if (local776 == 0) {
									Static471.method6966(local175, Static521.aClass343_238, Static573.anInt6752);
									Static612.method8364();
									Static145.aBoolean263 = false;
								} else if (local175 == 0) {
									Static70.method1243();
									Static145.aBoolean263 = false;
								} else {
									Static386.method7125(local175);
								}
							}
							Static32.aClass3_Sub41_3.method6773(local175, Static32.aClass3_Sub41_3.aClass7_Sub15_4);
							Static124.method2223();
							Static576.aBoolean708 = false;
						}
						return;
					}
					if (arg0 == 6039) {
						local175 = anIntArray422[--anInt7131];
						if (local175 > 255 || local175 < 0) {
							local175 = 0;
						}
						if (local175 != Static32.aClass3_Sub41_3.aClass7_Sub12_1.method5242()) {
							Static32.aClass3_Sub41_3.method6773(local175, Static32.aClass3_Sub41_3.aClass7_Sub12_1);
							Static124.method2223();
							Static576.aBoolean708 = false;
						}
						return;
					}
					if (arg0 == 6040) {
						local175 = anIntArray422[--anInt7131];
						if (local175 != Static32.aClass3_Sub41_3.aClass7_Sub4_1.method1402()) {
							Static32.aClass3_Sub41_3.method6773(local175, Static32.aClass3_Sub41_3.aClass7_Sub4_1);
							Static124.method2223();
							Static576.aBoolean708 = false;
							Static592.method8210();
						}
						return;
					}
				} else if (arg0 < 6200) {
					if (arg0 == 6101) {
						anIntArray422[anInt7131++] = Static32.aClass3_Sub41_3.aClass7_Sub24_1.method7021();
						return;
					}
					if (arg0 == 6102) {
						anIntArray422[anInt7131++] = Static32.aClass3_Sub41_3.aClass7_Sub13_1.method5385() == 1 ? 1 : 0;
						return;
					}
					if (arg0 == 6103) {
						anIntArray422[anInt7131++] = Static32.aClass3_Sub41_3.aClass7_Sub8_1.method3974() == 2 ? 1 : 0;
						return;
					}
					if (arg0 == 6105) {
						anIntArray422[anInt7131++] = Static32.aClass3_Sub41_3.aClass7_Sub29_1.method8579() == 1 ? 1 : 0;
						return;
					}
					if (arg0 == 6107) {
						anIntArray422[anInt7131++] = Static32.aClass3_Sub41_3.aClass7_Sub18_1.method6276();
						return;
					}
					if (arg0 == 6108) {
						anIntArray422[anInt7131++] = Static32.aClass3_Sub41_3.aClass7_Sub16_1.method6022() == 1 ? 1 : 0;
						return;
					}
					if (arg0 == 6110) {
						anIntArray422[anInt7131++] = Static32.aClass3_Sub41_3.aClass7_Sub10_1.method4510() == 1 ? 1 : 0;
						return;
					}
					if (arg0 == 6111) {
						anIntArray422[anInt7131++] = Static32.aClass3_Sub41_3.aClass7_Sub2_1.method984();
						return;
					}
					if (arg0 == 6112) {
						anIntArray422[anInt7131++] = Static32.aClass3_Sub41_3.aClass7_Sub6_1.method3237() == 1 ? 1 : 0;
						return;
					}
					if (arg0 == 6114) {
						anIntArray422[anInt7131++] = Static32.aClass3_Sub41_3.aClass7_Sub27_1.method8231() == 2 ? 1 : 0;
						return;
					}
					if (arg0 == 6115) {
						anIntArray422[anInt7131++] = Static32.aClass3_Sub41_3.aClass7_Sub7_1.method3298() == 1 ? 1 : 0;
						return;
					}
					if (arg0 == 6116) {
						anIntArray422[anInt7131++] = Static32.aClass3_Sub41_3.aClass7_Sub26_2.method8128();
						return;
					}
					if (arg0 == 6117) {
						anIntArray422[anInt7131++] = Static32.aClass3_Sub41_3.aClass7_Sub5_1.method2834() == 1 ? 1 : 0;
						return;
					}
					if (arg0 == 6118) {
						anIntArray422[anInt7131++] = Static32.aClass3_Sub41_3.aClass7_Sub15_2.method5663();
						return;
					}
					if (arg0 == 6119) {
						anIntArray422[anInt7131++] = Static32.aClass3_Sub41_3.aClass7_Sub15_1.method5663();
						return;
					}
					if (arg0 == 6120) {
						anIntArray422[anInt7131++] = Static32.aClass3_Sub41_3.aClass7_Sub15_5.method5663();
						return;
					}
					if (arg0 == 6123) {
						anIntArray422[anInt7131++] = Static261.method4381();
						return;
					}
					if (arg0 == 6124) {
						anIntArray422[anInt7131++] = Static32.aClass3_Sub41_3.aClass7_Sub26_1.method8128();
						return;
					}
					if (arg0 == 6125) {
						anIntArray422[anInt7131++] = Static32.aClass3_Sub41_3.aClass7_Sub11_1.method5159();
						return;
					}
					if (arg0 == 6127) {
						anIntArray422[anInt7131++] = Static32.aClass3_Sub41_3.aClass7_Sub25_1.method7711() == 1 ? 1 : 0;
						return;
					}
					if (arg0 == 6128) {
						anIntArray422[anInt7131++] = Static32.aClass3_Sub41_3.aClass7_Sub19_1.method6303() == 1 ? 1 : 0;
						return;
					}
					if (arg0 == 6129) {
						anIntArray422[anInt7131++] = Static32.aClass3_Sub41_3.aClass7_Sub18_1.method6276();
						return;
					}
					if (arg0 == 6130) {
						anIntArray422[anInt7131++] = Static32.aClass3_Sub41_3.aClass7_Sub1_1.method189() == 1 ? 1 : 0;
						return;
					}
					if (arg0 == 6131) {
						anIntArray422[anInt7131++] = Static32.aClass3_Sub41_3.aClass7_Sub9_2.method4181();
						return;
					}
					if (arg0 == 6132) {
						anIntArray422[anInt7131++] = Static32.aClass3_Sub41_3.aClass7_Sub9_1.method4181();
						return;
					}
					if (arg0 == 6133) {
						anIntArray422[anInt7131++] = Static48.aClass298_12.aBoolean613 && !Static48.aClass298_12.aBoolean612 ? 1 : 0;
						return;
					}
					if (arg0 == 6135) {
						anIntArray422[anInt7131++] = Static32.aClass3_Sub41_3.aClass7_Sub17_1.method6220();
						return;
					}
					if (arg0 == 6136) {
						anIntArray422[anInt7131++] = Static32.aClass3_Sub41_3.aClass7_Sub28_1.method8245() == 1 ? 1 : 0;
						return;
					}
					if (arg0 == 6138) {
						anIntArray422[anInt7131++] = Static163.method2791(200, Static32.aClass3_Sub41_3.aClass7_Sub9_2.method4181());
						return;
					}
					if (arg0 == 6139) {
						anIntArray422[anInt7131++] = Static32.aClass3_Sub41_3.aClass7_Sub20_1.method6317();
						return;
					}
					if (arg0 == 6142) {
						anIntArray422[anInt7131++] = Static32.aClass3_Sub41_3.aClass7_Sub15_3.method5663();
						return;
					}
					if (arg0 == 6143) {
						anIntArray422[anInt7131++] = Static32.aClass3_Sub41_3.aClass7_Sub15_4.method5663();
						return;
					}
					if (arg0 == 6144) {
						anIntArray422[anInt7131++] = Static211.aBoolean272 ? 1 : 0;
						return;
					}
					if (arg0 == 6145) {
						anIntArray422[anInt7131++] = Static32.aClass3_Sub41_3.aClass7_Sub12_1.method5242();
						return;
					}
					if (arg0 == 6146) {
						anIntArray422[anInt7131++] = Static32.aClass3_Sub41_3.aClass7_Sub4_1.method1402();
						return;
					}
					if (arg0 == 6147) {
						anIntArray422[anInt7131++] = Static545.aClass3_Sub38_1.anInt7213 < 512 || Static211.aBoolean272 || Static112.aBoolean167 ? 1 : 0;
						return;
					}
					if (arg0 == 6148) {
						anIntArray422[anInt7131++] = Static493.aBoolean605 ? 1 : 0;
						return;
					}
				} else if (arg0 < 6300) {
					if (arg0 == 6200) {
						anInt7131 -= 2;
						Static428.aShort84 = (short) anIntArray422[anInt7131];
						if (Static428.aShort84 <= 0) {
							Static428.aShort84 = 256;
						}
						Static548.aShort123 = (short) anIntArray422[anInt7131 + 1];
						if (Static548.aShort123 <= 0) {
							Static548.aShort123 = 205;
						}
						return;
					}
					if (arg0 == 6201) {
						anInt7131 -= 2;
						Static602.aShort120 = (short) anIntArray422[anInt7131];
						if (Static602.aShort120 <= 0) {
							Static602.aShort120 = 256;
						}
						Static584.aShort113 = (short) anIntArray422[anInt7131 + 1];
						if (Static584.aShort113 <= 0) {
							Static584.aShort113 = 320;
						}
						return;
					}
					if (arg0 == 6202) {
						anInt7131 -= 4;
						Static554.aShort107 = (short) anIntArray422[anInt7131];
						if (Static554.aShort107 <= 0) {
							Static554.aShort107 = 1;
						}
						Static68.aShort21 = (short) anIntArray422[anInt7131 + 1];
						if (Static68.aShort21 <= 0) {
							Static68.aShort21 = 32767;
						} else if (Static68.aShort21 < Static554.aShort107) {
							Static68.aShort21 = Static554.aShort107;
						}
						Static397.aShort82 = (short) anIntArray422[anInt7131 + 2];
						if (Static397.aShort82 <= 0) {
							Static397.aShort82 = 1;
						}
						Static605.aShort121 = (short) anIntArray422[anInt7131 + 3];
						if (Static605.aShort121 <= 0) {
							Static605.aShort121 = 32767;
							return;
						}
						if (Static605.aShort121 < Static397.aShort82) {
							Static605.aShort121 = Static397.aShort82;
						}
						return;
					}
					if (arg0 == 6203) {
						Static56.method1014(Static529.aClass344_12.anInt9602, Static529.aClass344_12.anInt9546, false, 0, 0);
						anIntArray422[anInt7131++] = Static556.anInt9246;
						anIntArray422[anInt7131++] = Static274.anInt5297;
						return;
					}
					if (arg0 == 6204) {
						anIntArray422[anInt7131++] = Static602.aShort120;
						anIntArray422[anInt7131++] = Static584.aShort113;
						return;
					}
					if (arg0 == 6205) {
						anIntArray422[anInt7131++] = Static428.aShort84;
						anIntArray422[anInt7131++] = Static548.aShort123;
						return;
					}
				} else if (arg0 < 6400) {
					if (arg0 == 6300) {
						anIntArray422[anInt7131++] = (int) (Static191.method3071() / 60000L);
						return;
					}
					if (arg0 == 6301) {
						anIntArray422[anInt7131++] = (int) (Static191.method3071() / 86400000L) - 11745;
						return;
					}
					if (arg0 == 6302) {
						anInt7131 -= 3;
						local175 = anIntArray422[anInt7131];
						local776 = anIntArray422[anInt7131 + 1];
						local97 = anIntArray422[anInt7131 + 2];
						@Pc(6611) long local6611 = Static317.method5283(local776, local175, local97);
						local3271 = Static608.method8331(local6611);
						if (local97 < 1970) {
							local3271--;
						}
						anIntArray422[anInt7131++] = local3271;
						return;
					}
					if (arg0 == 6303) {
						anIntArray422[anInt7131++] = Static201.method3195(Static191.method3071());
						return;
					}
					if (arg0 == 6304) {
						local175 = anIntArray422[--anInt7131];
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
						anIntArray422[anInt7131++] = local1496 ? 1 : 0;
						return;
					}
				} else if (arg0 < 6500) {
					if (arg0 == 6405) {
						anIntArray422[anInt7131++] = Static604.method8527() ? 1 : 0;
						return;
					}
					if (arg0 == 6406) {
						anIntArray422[anInt7131++] = Static571.method8268() ? 1 : 0;
						return;
					}
				} else if (arg0 < 6600) {
					if (arg0 == 6500) {
						if (Static82.anInt1653 == 7 && Static71.anInt1424 == 0 && Static187.anInt3550 == 0) {
							if (Static322.aBoolean452) {
								anIntArray422[anInt7131++] = 0;
								return;
							}
							if (Static490.aLong218 > Static191.method3071() - 1000L) {
								anIntArray422[anInt7131++] = 1;
								return;
							}
							Static322.aBoolean452 = true;
							local52 = Static59.method1040(Static325.aClass20_2, Static570.aClass314_64);
							local52.aClass3_Sub9_Sub2_2.method5601(Static353.anInt6518);
							Static148.method2572(local52);
							anIntArray422[anInt7131++] = 0;
							return;
						}
						anIntArray422[anInt7131++] = 1;
						return;
					}
					@Pc(6863) Class349 local6863;
					@Pc(6830) Class354_Sub1 local6830;
					if (arg0 == 6501) {
						local6830 = Static524.method7623();
						if (local6830 != null) {
							anIntArray422[anInt7131++] = local6830.anInt9773;
							anIntArray422[anInt7131++] = local6830.anInt9771;
							aStringArray56[anInt7134++] = local6830.aString99;
							local6863 = local6830.method8311();
							anIntArray422[anInt7131++] = local6863.anInt9681;
							aStringArray56[anInt7134++] = local6863.aString96;
							anIntArray422[anInt7131++] = local6830.anInt9770;
							anIntArray422[anInt7131++] = local6830.anInt9775;
							aStringArray56[anInt7134++] = local6830.aString100;
							return;
						}
						anIntArray422[anInt7131++] = -1;
						anIntArray422[anInt7131++] = 0;
						aStringArray56[anInt7134++] = "";
						anIntArray422[anInt7131++] = 0;
						aStringArray56[anInt7134++] = "";
						anIntArray422[anInt7131++] = 0;
						anIntArray422[anInt7131++] = 0;
						aStringArray56[anInt7134++] = "";
						return;
					}
					if (arg0 == 6502) {
						local6830 = Static231.method3978();
						if (local6830 != null) {
							anIntArray422[anInt7131++] = local6830.anInt9773;
							anIntArray422[anInt7131++] = local6830.anInt9771;
							aStringArray56[anInt7134++] = local6830.aString99;
							local6863 = local6830.method8311();
							anIntArray422[anInt7131++] = local6863.anInt9681;
							aStringArray56[anInt7134++] = local6863.aString96;
							anIntArray422[anInt7131++] = local6830.anInt9770;
							anIntArray422[anInt7131++] = local6830.anInt9775;
							aStringArray56[anInt7134++] = local6830.aString100;
							return;
						}
						anIntArray422[anInt7131++] = -1;
						anIntArray422[anInt7131++] = 0;
						aStringArray56[anInt7134++] = "";
						anIntArray422[anInt7131++] = 0;
						aStringArray56[anInt7134++] = "";
						anIntArray422[anInt7131++] = 0;
						anIntArray422[anInt7131++] = 0;
						aStringArray56[anInt7134++] = "";
						return;
					}
					if (arg0 == 6503) {
						local175 = anIntArray422[--anInt7131];
						local89 = aStringArray56[--anInt7134];
						if (Static82.anInt1653 == 7 && Static71.anInt1424 == 0 && Static187.anInt3550 == 0) {
							anIntArray422[anInt7131++] = Static567.method8021(local175, local89) ? 1 : 0;
							return;
						}
						anIntArray422[anInt7131++] = 0;
						return;
					}
					if (arg0 == 6506) {
						local175 = anIntArray422[--anInt7131];
						@Pc(7190) Class354_Sub1 local7190 = Static536.method7772(local175);
						if (local7190 != null) {
							anIntArray422[anInt7131++] = local7190.anInt9771;
							aStringArray56[anInt7134++] = local7190.aString99;
							@Pc(7214) Class349 local7214 = local7190.method8311();
							anIntArray422[anInt7131++] = local7214.anInt9681;
							aStringArray56[anInt7134++] = local7214.aString96;
							anIntArray422[anInt7131++] = local7190.anInt9770;
							anIntArray422[anInt7131++] = local7190.anInt9775;
							aStringArray56[anInt7134++] = local7190.aString100;
							return;
						}
						anIntArray422[anInt7131++] = -1;
						aStringArray56[anInt7134++] = "";
						anIntArray422[anInt7131++] = 0;
						aStringArray56[anInt7134++] = "";
						anIntArray422[anInt7131++] = 0;
						anIntArray422[anInt7131++] = 0;
						aStringArray56[anInt7134++] = "";
						return;
					}
					if (arg0 == 6507) {
						anInt7131 -= 4;
						local175 = anIntArray422[anInt7131];
						local1496 = anIntArray422[anInt7131 + 1] == 1;
						local97 = anIntArray422[anInt7131 + 2];
						local2107 = anIntArray422[anInt7131 + 3] == 1;
						Static88.method1481(local1496, local175, local97, local2107);
						return;
					}
					if (arg0 == 6508) {
						Static145.method3123();
						return;
					}
					if (arg0 == 6509) {
						if (Static82.anInt1653 != 7) {
							return;
						}
						Static540.aBoolean673 = anIntArray422[--anInt7131] == 1;
						return;
					}
					if (arg0 == 6510) {
						anIntArray422[anInt7131++] = Static237.anInt4731;
						return;
					}
				} else if (arg0 >= 6700) {
					if (arg0 < 6800 && Static373.aClass34_2 == Static536.aClass34_3) {
						if (arg0 == 6700) {
							local175 = Static128.aClass25_7.method430();
							if (Static528.anInt8950 != -1) {
								local175++;
							}
							anIntArray422[anInt7131++] = local175;
							return;
						}
						if (arg0 == 6701) {
							local175 = anIntArray422[--anInt7131];
							if (Static528.anInt8950 != -1) {
								if (local175 == 0) {
									anIntArray422[anInt7131++] = Static528.anInt8950;
									return;
								}
								local175--;
							}
							@Pc(7462) Class3_Sub1 local7462 = (Class3_Sub1) Static128.aClass25_7.method435();
							while (local175-- > 0) {
								local7462 = (Class3_Sub1) Static128.aClass25_7.method432();
							}
							anIntArray422[anInt7131++] = local7462.anInt24;
							return;
						}
						if (arg0 == 6702) {
							local175 = anIntArray422[--anInt7131];
							if (Static319.aClass344ArrayArray2[local175] == null) {
								aStringArray56[anInt7134++] = "";
								return;
							}
							local89 = Static319.aClass344ArrayArray2[local175][0].aString94;
							if (local89 == null) {
								aStringArray56[anInt7134++] = "";
								return;
							}
							aStringArray56[anInt7134++] = local89.substring(0, local89.indexOf(58));
							return;
						}
						if (arg0 == 6703) {
							local175 = anIntArray422[--anInt7131];
							if (Static319.aClass344ArrayArray2[local175] == null) {
								anIntArray422[anInt7131++] = 0;
								return;
							}
							anIntArray422[anInt7131++] = Static319.aClass344ArrayArray2[local175].length;
							return;
						}
						if (arg0 == 6704) {
							anInt7131 -= 2;
							local175 = anIntArray422[anInt7131];
							local776 = anIntArray422[anInt7131 + 1];
							if (Static319.aClass344ArrayArray2[local175] == null) {
								aStringArray56[anInt7134++] = "";
								return;
							}
							local181 = Static319.aClass344ArrayArray2[local175][local776].aString94;
							if (local181 == null) {
								aStringArray56[anInt7134++] = "";
								return;
							}
							aStringArray56[anInt7134++] = local181;
							return;
						}
						if (arg0 == 6705) {
							anInt7131 -= 2;
							local175 = anIntArray422[anInt7131];
							local776 = anIntArray422[anInt7131 + 1];
							if (Static319.aClass344ArrayArray2[local175] == null) {
								anIntArray422[anInt7131++] = 0;
								return;
							}
							anIntArray422[anInt7131++] = Static319.aClass344ArrayArray2[local175][local776].anInt9598;
							return;
						}
						if (arg0 == 6706) {
							return;
						}
						if (arg0 == 6707) {
							anInt7131 -= 3;
							local175 = anIntArray422[anInt7131];
							local776 = anIntArray422[anInt7131 + 1];
							local97 = anIntArray422[anInt7131 + 2];
							Static554.method7878(local97, "", 1, local175 << 16 | local776);
							return;
						}
						if (arg0 == 6708) {
							anInt7131 -= 3;
							local175 = anIntArray422[anInt7131];
							local776 = anIntArray422[anInt7131 + 1];
							local97 = anIntArray422[anInt7131 + 2];
							Static554.method7878(local97, "", 2, local175 << 16 | local776);
							return;
						}
						if (arg0 == 6709) {
							anInt7131 -= 3;
							local175 = anIntArray422[anInt7131];
							local776 = anIntArray422[anInt7131 + 1];
							local97 = anIntArray422[anInt7131 + 2];
							Static554.method7878(local97, "", 3, local175 << 16 | local776);
							return;
						}
						if (arg0 == 6710) {
							anInt7131 -= 3;
							local175 = anIntArray422[anInt7131];
							local776 = anIntArray422[anInt7131 + 1];
							local97 = anIntArray422[anInt7131 + 2];
							Static554.method7878(local97, "", 4, local175 << 16 | local776);
							return;
						}
						if (arg0 == 6711) {
							anInt7131 -= 3;
							local175 = anIntArray422[anInt7131];
							local776 = anIntArray422[anInt7131 + 1];
							local97 = anIntArray422[anInt7131 + 2];
							Static554.method7878(local97, "", 5, local175 << 16 | local776);
							return;
						}
						if (arg0 == 6712) {
							anInt7131 -= 3;
							local175 = anIntArray422[anInt7131];
							local776 = anIntArray422[anInt7131 + 1];
							local97 = anIntArray422[anInt7131 + 2];
							Static554.method7878(local97, "", 6, local175 << 16 | local776);
							return;
						}
						if (arg0 == 6713) {
							anInt7131 -= 3;
							local175 = anIntArray422[anInt7131];
							local776 = anIntArray422[anInt7131 + 1];
							local97 = anIntArray422[anInt7131 + 2];
							Static554.method7878(local97, "", 7, local175 << 16 | local776);
							return;
						}
						if (arg0 == 6714) {
							anInt7131 -= 3;
							local175 = anIntArray422[anInt7131];
							local776 = anIntArray422[anInt7131 + 1];
							local97 = anIntArray422[anInt7131 + 2];
							Static554.method7878(local97, "", 8, local175 << 16 | local776);
							return;
						}
						if (arg0 == 6715) {
							anInt7131 -= 3;
							local175 = anIntArray422[anInt7131];
							local776 = anIntArray422[anInt7131 + 1];
							local97 = anIntArray422[anInt7131 + 2];
							Static554.method7878(local97, "", 9, local175 << 16 | local776);
							return;
						}
						if (arg0 == 6716) {
							anInt7131 -= 3;
							local175 = anIntArray422[anInt7131];
							local776 = anIntArray422[anInt7131 + 1];
							local97 = anIntArray422[anInt7131 + 2];
							Static554.method7878(local97, "", 10, local175 << 16 | local776);
							return;
						}
						if (arg0 == 6717) {
							anInt7131 -= 3;
							local175 = anIntArray422[anInt7131];
							local776 = anIntArray422[anInt7131 + 1];
							local97 = anIntArray422[anInt7131 + 2];
							@Pc(8050) Class344 local8050 = Static258.method4328(local175 << 16 | local776, local97);
							Static409.method6364();
							@Pc(8055) Class3_Sub50 local8055 = Static76.method1311(local8050);
							Static163.method2789(local8050, local8055.anInt9448, local8055.method8089());
							return;
						}
					} else if (arg0 < 6900) {
						@Pc(8083) Class179 local8083;
						if (arg0 == 6800) {
							local175 = anIntArray422[--anInt7131];
							local8083 = Static167.aClass154_3.method3947(local175);
							if (local8083.aString42 == null) {
								aStringArray56[anInt7134++] = "";
								return;
							}
							aStringArray56[anInt7134++] = local8083.aString42;
							return;
						}
						if (arg0 == 6801) {
							local175 = anIntArray422[--anInt7131];
							local8083 = Static167.aClass154_3.method3947(local175);
							anIntArray422[anInt7131++] = local8083.anInt5340;
							return;
						}
						if (arg0 == 6802) {
							local175 = anIntArray422[--anInt7131];
							local8083 = Static167.aClass154_3.method3947(local175);
							anIntArray422[anInt7131++] = local8083.anInt5332;
							return;
						}
						if (arg0 == 6803) {
							local175 = anIntArray422[--anInt7131];
							local8083 = Static167.aClass154_3.method3947(local175);
							anIntArray422[anInt7131++] = local8083.anInt5334;
							return;
						}
						if (arg0 == 6804) {
							anInt7131 -= 2;
							local175 = anIntArray422[anInt7131];
							local776 = anIntArray422[anInt7131 + 1];
							@Pc(8205) Class108 local8205 = Static220.aClass214_2.method5419(local776);
							if (local8205.method2736()) {
								aStringArray56[anInt7134++] = Static167.aClass154_3.method3947(local175).method4538(local8205.aString23, local776);
								return;
							}
							anIntArray422[anInt7131++] = Static167.aClass154_3.method3947(local175).method4536(local776, local8205.anInt3158);
							return;
						}
					} else if (arg0 < 7000) {
						if (arg0 == 6900) {
							anIntArray422[anInt7131++] = Static11.aBoolean13 && !Static317.aBoolean446 ? 1 : 0;
							return;
						}
						if (arg0 == 6901) {
							anIntArray422[anInt7131++] = (int) (Static81.aLong53 / 60000L);
							anIntArray422[anInt7131++] = Static445.aBoolean551 ? 1 : 0;
							return;
						}
						if (arg0 == 6902) {
							anIntArray422[anInt7131++] = Static545.anInt9138;
							return;
						}
						if (arg0 == 6903) {
							anIntArray422[anInt7131++] = Static167.anInt3259;
							return;
						}
						if (arg0 == 6904) {
							anIntArray422[anInt7131++] = Static268.anInt5234;
							return;
						}
						if (arg0 == 6905) {
							local83 = "";
							if (Static170.aClass174_4 != null) {
								if (Static170.aClass174_4.anObject12 == null) {
									local83 = Static550.method7854(Static170.aClass174_4.anInt5124);
								} else {
									local83 = (String) Static170.aClass174_4.anObject12;
								}
							}
							aStringArray56[anInt7134++] = local83;
							return;
						}
						if (arg0 == 6906) {
							anIntArray422[anInt7131++] = Static192.anInt3595;
							return;
						}
						if (arg0 == 6907) {
							anIntArray422[anInt7131++] = Static590.anInt9672;
							return;
						}
						if (arg0 == 6908) {
							anIntArray422[anInt7131++] = Static431.anInt7512;
							return;
						}
						if (arg0 == 6909) {
							anIntArray422[anInt7131++] = Static67.aBoolean86 ? 1 : 0;
							return;
						}
						if (arg0 == 6910) {
							anIntArray422[anInt7131++] = Static279.anInt5376;
							return;
						}
						if (arg0 == 6911) {
							anIntArray422[anInt7131++] = Static240.anInt4751;
							return;
						}
						if (arg0 == 6912) {
							anIntArray422[anInt7131++] = Static429.anInt7484;
							return;
						}
						if (arg0 == 6913) {
							anIntArray422[anInt7131++] = Static198.anInt7015;
							return;
						}
					} else if (arg0 < 7100) {
						if (arg0 == 7000) {
							local175 = Static188.method3054();
							anIntArray422[anInt7131++] = Static243.anInt4807 = Static32.aClass3_Sub41_3.aClass7_Sub9_2.method4181();
							anIntArray422[anInt7131++] = local175;
							Static1.method8036();
							Static124.method2223();
							Static576.aBoolean708 = false;
							return;
						}
						if (arg0 == 7001) {
							Static303.method7244();
							Static1.method8036();
							Static124.method2223();
							Static576.aBoolean708 = false;
							return;
						}
						if (arg0 == 7002) {
							Static407.method6323();
							Static1.method8036();
							Static124.method2223();
							Static576.aBoolean708 = false;
							return;
						}
						if (arg0 == 7003) {
							Static339.method915();
							Static1.method8036();
							Static124.method2223();
							Static576.aBoolean708 = false;
							return;
						}
						if (arg0 == 7004) {
							Static499.method7252();
							Static1.method8036();
							Static124.method2223();
							Static576.aBoolean708 = false;
							return;
						}
						if (arg0 == 7005) {
							Static32.aClass3_Sub41_3.method6773(0, Static32.aClass3_Sub41_3.aClass7_Sub14_1);
							Static124.method2223();
							Static576.aBoolean708 = false;
							return;
						}
						if (arg0 == 7006) {
							if (Static243.anInt4807 == 2) {
								Static52.aBoolean51 = true;
								return;
							}
							if (Static243.anInt4807 == 1) {
								Static153.aBoolean236 = true;
								return;
							}
							if (Static243.anInt4807 == 3) {
								Static205.aBoolean609 = true;
							}
							return;
						}
						if (arg0 == 7007) {
							anIntArray422[anInt7131++] = Static32.aClass3_Sub41_3.aClass7_Sub14_1.method5440();
							return;
						}
					} else if (arg0 < 7200) {
						if (arg0 == 7100) {
							anInt7131 -= 2;
							local175 = anIntArray422[anInt7131];
							local776 = anIntArray422[anInt7131 + 1];
							if (local175 != -1) {
								if (local776 > 255) {
									local776 = 255;
								} else if (local776 < 0) {
									local776 = 0;
								}
								Static574.method8061(local175, local776, false);
							}
							return;
						}
						if (arg0 == 7101) {
							local175 = anIntArray422[--anInt7131];
							if (local175 != -1) {
								Static558.method7939(local175);
							}
							return;
						}
						if (arg0 == 7102) {
							local175 = anIntArray422[--anInt7131];
							if (local175 != -1) {
								Static29.method385(local175);
							}
							return;
						}
						if (arg0 == 7103) {
							anIntArray422[anInt7131++] = Static420.method6469("jagtheora") ? 1 : 0;
							return;
						}
					} else if (arg0 < 7300) {
						if (arg0 == 7201) {
							anIntArray422[anInt7131++] = Static32.aClass3_Sub41_3.aClass7_Sub29_1.method8578() ? 1 : 0;
							return;
						}
						if (arg0 == 7202) {
							anIntArray422[anInt7131++] = Static32.aClass3_Sub41_3.aClass7_Sub10_1.method4509() ? 1 : 0;
							return;
						}
						if (arg0 == 7203) {
							anIntArray422[anInt7131++] = Static32.aClass3_Sub41_3.aClass7_Sub2_1.method982() ? 1 : 0;
							return;
						}
						if (arg0 == 7204) {
							anIntArray422[anInt7131++] = Static32.aClass3_Sub41_3.aClass7_Sub27_1.method8232() ? 1 : 0;
							return;
						}
						if (arg0 == 7205) {
							anIntArray422[anInt7131++] = Static32.aClass3_Sub41_3.aClass7_Sub26_1.method8127() && Static266.aClass82_8.method6171() ? 1 : 0;
							return;
						}
						if (arg0 == 7206) {
							anIntArray422[anInt7131++] = Static32.aClass3_Sub41_3.aClass7_Sub3_1.method1271() ? 1 : 0;
							return;
						}
						if (arg0 == 7207) {
							anIntArray422[anInt7131++] = Static32.aClass3_Sub41_3.aClass7_Sub11_1.method5160() ? 1 : 0;
							return;
						}
						if (arg0 == 7208) {
							anIntArray422[anInt7131++] = Static32.aClass3_Sub41_3.aClass7_Sub25_1.method7712() && Static266.aClass82_8.method6136() ? 1 : 0;
							return;
						}
						if (arg0 == 7209) {
							anIntArray422[anInt7131++] = Static32.aClass3_Sub41_3.aClass7_Sub1_1.method187() ? 1 : 0;
							return;
						}
						if (arg0 == 7210) {
							anIntArray422[anInt7131++] = Static32.aClass3_Sub41_3.aClass7_Sub28_1.method8243() ? 1 : 0;
							return;
						}
						if (arg0 == 7211) {
							anIntArray422[anInt7131++] = Static32.aClass3_Sub41_3.aClass7_Sub20_1.method6319() ? 1 : 0;
							return;
						}
						if (arg0 == 7212) {
							anIntArray422[anInt7131++] = Static32.aClass3_Sub41_3.aClass7_Sub7_1.method3294() ? 1 : 0;
							return;
						}
						if (arg0 == 7213) {
							anIntArray422[anInt7131++] = Static32.aClass3_Sub41_3.aClass7_Sub4_1.method1401() ? 1 : 0;
							return;
						}
						if (arg0 == 7214) {
							anIntArray422[anInt7131++] = Static32.aClass3_Sub41_3.aClass7_Sub9_1.method4178() ? 1 : 0;
							return;
						}
					} else if (arg0 < 7400) {
						if (arg0 == 7301) {
							local175 = anIntArray422[--anInt7131];
							anIntArray422[anInt7131++] = Static32.aClass3_Sub41_3.aClass7_Sub29_1.method8573(local175);
							return;
						}
						if (arg0 == 7302) {
							local175 = anIntArray422[--anInt7131];
							anIntArray422[anInt7131++] = Static32.aClass3_Sub41_3.aClass7_Sub10_1.method8573(local175);
							return;
						}
						if (arg0 == 7303) {
							local175 = anIntArray422[--anInt7131];
							anIntArray422[anInt7131++] = Static32.aClass3_Sub41_3.aClass7_Sub2_1.method8573(local175);
							return;
						}
						if (arg0 == 7304) {
							local175 = anIntArray422[--anInt7131];
							anIntArray422[anInt7131++] = Static32.aClass3_Sub41_3.aClass7_Sub27_1.method8573(local175);
							return;
						}
						if (arg0 == 7305) {
							local175 = anIntArray422[--anInt7131];
							if (!Static266.aClass82_8.method6171()) {
								anIntArray422[anInt7131++] = 3;
								return;
							}
							anIntArray422[anInt7131++] = Static32.aClass3_Sub41_3.aClass7_Sub26_1.method8573(local175);
							return;
						}
						if (arg0 == 7306) {
							local175 = anIntArray422[--anInt7131];
							anIntArray422[anInt7131++] = Static32.aClass3_Sub41_3.aClass7_Sub3_1.method8573(local175);
							return;
						}
						if (arg0 == 7307) {
							local175 = anIntArray422[--anInt7131];
							anIntArray422[anInt7131++] = Static32.aClass3_Sub41_3.aClass7_Sub11_1.method8573(local175);
							return;
						}
						if (arg0 == 7308) {
							local175 = anIntArray422[--anInt7131];
							if (!Static266.aClass82_8.method6136()) {
								anIntArray422[anInt7131++] = 3;
								return;
							}
							anIntArray422[anInt7131++] = Static32.aClass3_Sub41_3.aClass7_Sub25_1.method8573(local175);
							return;
						}
						if (arg0 == 7309) {
							local175 = anIntArray422[--anInt7131];
							anIntArray422[anInt7131++] = Static32.aClass3_Sub41_3.aClass7_Sub1_1.method8573(local175);
							return;
						}
						if (arg0 == 7310) {
							local175 = anIntArray422[--anInt7131];
							anIntArray422[anInt7131++] = Static32.aClass3_Sub41_3.aClass7_Sub28_1.method8573(local175);
							return;
						}
						if (arg0 == 7311) {
							local175 = anIntArray422[--anInt7131];
							anIntArray422[anInt7131++] = Static32.aClass3_Sub41_3.aClass7_Sub20_1.method8573(local175);
							return;
						}
						if (arg0 == 7312) {
							local175 = anIntArray422[--anInt7131];
							anIntArray422[anInt7131++] = Static32.aClass3_Sub41_3.aClass7_Sub7_1.method8573(local175);
							return;
						}
						if (arg0 == 7313) {
							local175 = anIntArray422[--anInt7131];
							anIntArray422[anInt7131++] = Static32.aClass3_Sub41_3.aClass7_Sub4_1.method8573(local175);
							return;
						}
						if (arg0 == 7314) {
							local175 = anIntArray422[--anInt7131];
							anIntArray422[anInt7131++] = Static32.aClass3_Sub41_3.aClass7_Sub9_1.method8573(local175);
							return;
						}
					}
				}
			}
		}
		throw new IllegalStateException(String.valueOf(arg0));
	}

	@OriginalMember(owner = "client!oea", name = "c", descriptor = "(IZ)V")
	public static void method6285() {
	}

	@OriginalMember(owner = "client!oea", name = "b", descriptor = "(I)V")
	public static void method6287(@OriginalArg(0) int arg0) {
		if (arg0 == -1 || !Static64.method1061(arg0)) {
			return;
		}
		@Pc(12) Class344[] local12 = Static319.aClass344ArrayArray2[arg0];
		for (@Pc(14) int local14 = 0; local14 < local12.length; local14++) {
			@Pc(19) Class344 local19 = local12[local14];
			if (local19.anObjectArray26 != null) {
				@Pc(26) Class3_Sub36 local26 = new Class3_Sub36();
				local26.aClass344_6 = local19;
				local26.anObjectArray1 = local19.anObjectArray26;
				method6282(local26, 2000000);
			}
		}
	}

	@OriginalMember(owner = "client!oea", name = "a", descriptor = "(Lclient!nt;)V")
	public static void method6288(@OriginalArg(0) Class3_Sub36 arg0) {
		method6282(arg0, 200000);
	}

	@OriginalMember(owner = "client!oea", name = "a", descriptor = "(Lclient!fi;I)V")
	private static void method6289(@OriginalArg(0) Class3_Sub7_Sub10 arg0, @OriginalArg(1) int arg1) {
		anInt7131 = 0;
		anInt7134 = 0;
		@Pc(5) int local5 = -1;
		@Pc(8) int[] local8 = arg0.anIntArray196;
		@Pc(11) int[] local11 = arg0.anIntArray197;
		@Pc(13) byte local13 = -1;
		anInt7128 = 0;
		@Pc(603) int local603;
		try {
			@Pc(17) int local17 = 0;
			label270: while (true) {
				local17++;
				if (local17 > arg1) {
					throw new RuntimeException("slow");
				}
				local5++;
				@Pc(31) int local31 = local8[local5];
				if (local31 >= 100) {
					@Pc(839) boolean local839;
					if (local11[local5] == 1) {
						local839 = true;
					} else {
						local839 = false;
					}
					if (local31 >= 100 && local31 < 5000) {
						method6280(local31, local839);
					} else if (local31 >= 5000 && local31 < 10000) {
						method6284(local31, local839);
					} else {
						throw new IllegalStateException("Command: " + local31);
					}
				} else if (local31 == 0) {
					anIntArray422[anInt7131++] = local11[local5];
				} else {
					@Pc(54) int local54;
					if (local31 == 1) {
						local54 = local11[local5];
						anIntArray422[anInt7131++] = Static183.aClass285_1.anIntArray490[local54];
					} else if (local31 == 2) {
						local54 = local11[local5];
						Static183.aClass285_1.method6943(local54, anIntArray422[--anInt7131]);
					} else if (local31 == 3) {
						aStringArray56[anInt7134++] = arg0.aStringArray25[local5];
					} else if (local31 == 6) {
						local5 += local11[local5];
					} else if (local31 == 7) {
						anInt7131 -= 2;
						if (anIntArray422[anInt7131] != anIntArray422[anInt7131 + 1]) {
							local5 += local11[local5];
						}
					} else if (local31 == 8) {
						anInt7131 -= 2;
						if (anIntArray422[anInt7131] == anIntArray422[anInt7131 + 1]) {
							local5 += local11[local5];
						}
					} else if (local31 == 9) {
						anInt7131 -= 2;
						if (anIntArray422[anInt7131] < anIntArray422[anInt7131 + 1]) {
							local5 += local11[local5];
						}
					} else if (local31 == 10) {
						anInt7131 -= 2;
						if (anIntArray422[anInt7131] > anIntArray422[anInt7131 + 1]) {
							local5 += local11[local5];
						}
					} else if (local31 == 21) {
						if (anInt7128 == 0) {
							return;
						}
						@Pc(216) Class373 local216 = aClass373Array1[--anInt7128];
						arg0 = local216.aClass3_Sub7_Sub10_1;
						local8 = arg0.anIntArray196;
						local11 = arg0.anIntArray197;
						local5 = local216.anInt10041;
						anIntArray424 = local216.anIntArray655;
						aStringArray55 = local216.aStringArray80;
					} else if (local31 == 25) {
						local54 = local11[local5];
						anIntArray422[anInt7131++] = Static183.aClass285_1.method6938(local54);
					} else if (local31 == 27) {
						local54 = local11[local5];
						Static183.aClass285_1.method6940(anIntArray422[--anInt7131], local54);
					} else if (local31 == 31) {
						anInt7131 -= 2;
						if (anIntArray422[anInt7131] <= anIntArray422[anInt7131 + 1]) {
							local5 += local11[local5];
						}
					} else if (local31 == 32) {
						anInt7131 -= 2;
						if (anIntArray422[anInt7131] >= anIntArray422[anInt7131 + 1]) {
							local5 += local11[local5];
						}
					} else if (local31 == 33) {
						anIntArray422[anInt7131++] = anIntArray424[local11[local5]];
					} else if (local31 == 34) {
						anIntArray424[local11[local5]] = anIntArray422[--anInt7131];
					} else if (local31 == 35) {
						aStringArray56[anInt7134++] = aStringArray55[local11[local5]];
					} else if (local31 == 36) {
						aStringArray55[local11[local5]] = aStringArray56[--anInt7134];
					} else if (local31 == 37) {
						local54 = local11[local5];
						anInt7134 -= local54;
						@Pc(400) String local400 = Static481.method7114(aStringArray56, anInt7134, local54);
						aStringArray56[anInt7134++] = local400;
					} else if (local31 == 38) {
						anInt7131--;
					} else if (local31 == 39) {
						anInt7134--;
					} else {
						@Pc(452) int local452;
						if (local31 == 40) {
							local54 = local11[local5];
							@Pc(436) Class3_Sub7_Sub10 local436 = Static362.method5814(local54);
							if (local436 == null) {
								throw new RuntimeException();
							}
							@Pc(446) int[] local446 = new int[local436.anInt3149];
							@Pc(450) String[] local450 = new String[local436.anInt3157];
							for (local452 = 0; local452 < local436.anInt3155; local452++) {
								local446[local452] = anIntArray422[anInt7131 + local452 - local436.anInt3155];
							}
							for (@Pc(471) int local471 = 0; local471 < local436.anInt3154; local471++) {
								local450[local471] = aStringArray56[anInt7134 + local471 - local436.anInt3154];
							}
							anInt7131 -= local436.anInt3155;
							anInt7134 -= local436.anInt3154;
							@Pc(502) Class373 local502 = new Class373();
							local502.aClass3_Sub7_Sub10_1 = arg0;
							local502.anInt10041 = local5;
							local502.anIntArray655 = anIntArray424;
							local502.aStringArray80 = aStringArray55;
							if (anInt7128 >= aClass373Array1.length) {
								throw new RuntimeException();
							}
							aClass373Array1[anInt7128++] = local502;
							arg0 = local436;
							local8 = local436.anIntArray196;
							local11 = local436.anIntArray197;
							local5 = -1;
							anIntArray424 = local446;
							aStringArray55 = local450;
						} else if (local31 == 42) {
							anIntArray422[anInt7131++] = Static584.anIntArray595[local11[local5]];
						} else if (local31 == 43) {
							local54 = local11[local5];
							Static584.anIntArray595[local54] = anIntArray422[--anInt7131];
							Static296.method5072(local54);
							Static644.aBoolean777 |= Static586.aBooleanArray29[local54];
						} else if (local31 == 44) {
							local54 = local11[local5] >> 16;
							local603 = local11[local5] & 0xFFFF;
							@Pc(611) int local611 = anIntArray422[--anInt7131];
							if (local611 >= 0 && local611 <= 5000) {
								anIntArray425[local54] = local611;
								@Pc(626) byte local626 = -1;
								if (local603 == 105) {
									local626 = 0;
								}
								local452 = 0;
								while (true) {
									if (local452 >= local611) {
										continue label270;
									}
									anIntArrayArray34[local54][local452] = local626;
									local452++;
								}
							}
							throw new RuntimeException();
						} else if (local31 == 45) {
							local54 = local11[local5];
							local603 = anIntArray422[--anInt7131];
							if (local603 < 0 || local603 >= anIntArray425[local54]) {
								throw new RuntimeException();
							}
							anIntArray422[anInt7131++] = anIntArrayArray34[local54][local603];
						} else if (local31 == 46) {
							local54 = local11[local5];
							anInt7131 -= 2;
							local603 = anIntArray422[anInt7131];
							if (local603 < 0 || local603 >= anIntArray425[local54]) {
								throw new RuntimeException();
							}
							anIntArrayArray34[local54][local603] = anIntArray422[anInt7131 + 1];
						} else if (local31 == 47) {
							@Pc(730) String local730 = Static10.aStringArray4[local11[local5]];
							if (local730 == null) {
								local730 = "null";
							}
							aStringArray56[anInt7134++] = local730;
						} else if (local31 == 48) {
							local54 = local11[local5];
							Static10.aStringArray4[local54] = aStringArray56[--anInt7134];
							Static199.method3186(local54);
						} else if (local31 == 51) {
							@Pc(774) Class25 local774 = arg0.aClass25Array1[local11[local5]];
							@Pc(787) Class3_Sub51 local787 = (Class3_Sub51) local774.method426((long) anIntArray422[--anInt7131]);
							if (local787 != null) {
								local5 += local787.anInt9787;
							}
						} else if (local31 == 86) {
							if (anIntArray422[--anInt7131] == 1) {
								local5 += local11[local5];
							}
						} else if (local31 == 87 && anIntArray422[--anInt7131] == 0) {
							local5 += local11[local5];
						}
					}
				}
			}
		} catch (@Pc(874) Exception local874) {
			@Pc(893) StringBuffer local893;
			if (arg0.aString22 == null) {
				local893 = new StringBuffer(30);
				local893.append("CS2: ").append(arg0.aLong277).append(" ");
				for (local603 = anInt7128 - 1; local603 >= 0; local603--) {
					local893.append("v: ").append(aClass373Array1[local603].aClass3_Sub7_Sub10_1.aLong277).append(" ");
				}
				local893.append("op: ").append(local13);
				Static296.method5075(local874, local893.toString());
			} else {
				Static608.method8332("Clientscript error in: " + arg0.aString22);
				local893 = new StringBuffer(30);
				local893.append("Clientscript error in: ").append(arg0.aString22).append("\n");
				for (local603 = anInt7128 - 1; local603 >= 0; local603--) {
					local893.append("via: ").append(aClass373Array1[local603].aClass3_Sub7_Sub10_1.aString22).append("\n");
				}
				local893.append("Op: ").append(local13).append("\n");
				@Pc(933) String local933 = local874.getMessage();
				if (local933 != null && local933.length() > 0) {
					local893.append("Message: ").append(local933).append("\n");
				}
				Static296.method5075(local874, local893.toString());
				Static8.method147(local893.toString());
			}
		}
	}

	@OriginalMember(owner = "client!oea", name = "c", descriptor = "(I)V")
	private static void method6290(@OriginalArg(0) int arg0) {
		@Pc(3) Class344 local3 = Static324.method5363(arg0);
		if (local3 == null) {
			return;
		}
		@Pc(9) int local9 = arg0 >>> 16;
		@Pc(13) Class344[] local13 = Static69.aClass344ArrayArray1[local9];
		if (local13 == null) {
			@Pc(19) Class344[] local19 = Static319.aClass344ArrayArray2[local9];
			@Pc(22) int local22 = local19.length;
			local13 = Static69.aClass344ArrayArray1[local9] = new Class344[local22];
			Static651.method752(local19, 0, local13, 0, local19.length);
		}
		@Pc(38) int local38;
		for (local38 = 0; local38 < local13.length && local13[local38] != local3; local38++) {
		}
		if (local38 >= local13.length) {
			return;
		}
		Static651.method752(local13, 0, local13, 1, local38);
		local13[0] = local3;
	}
}
