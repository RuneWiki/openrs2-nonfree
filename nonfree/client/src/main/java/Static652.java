import java.awt.datatransfer.DataFlavor;
import java.awt.datatransfer.Transferable;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static652 {

	@OriginalMember(owner = "client!wca", name = "e", descriptor = "Lclient!im;")
	private static Class166 aClass166_7;

	@OriginalMember(owner = "client!wca", name = "g", descriptor = "Lclient!uaa;")
	private static Class345 aClass345_13;

	@OriginalMember(owner = "client!wca", name = "h", descriptor = "[Ljava/lang/String;")
	private static String[] aStringArray58;

	@OriginalMember(owner = "client!wca", name = "l", descriptor = "Lclient!wja;")
	private static Class388 aClass388_1;

	@OriginalMember(owner = "client!wca", name = "m", descriptor = "Lclient!uaa;")
	private static Class345 aClass345_14;

	@OriginalMember(owner = "client!wca", name = "p", descriptor = "[I")
	private static int[] anIntArray597;

	@OriginalMember(owner = "client!wca", name = "z", descriptor = "Lclient!qc;")
	private static Class5_Sub45 aClass5_Sub45_3;

	@OriginalMember(owner = "client!wca", name = "B", descriptor = "[J")
	private static long[] aLongArray25;

	@OriginalMember(owner = "client!wca", name = "a", descriptor = "[I")
	private static final int[] anIntArray595 = new int[5];

	@OriginalMember(owner = "client!wca", name = "b", descriptor = "[I")
	private static final int[] anIntArray596 = new int[3];

	@OriginalMember(owner = "client!wca", name = "c", descriptor = "I")
	private static int anInt10498 = 0;

	@OriginalMember(owner = "client!wca", name = "f", descriptor = "[J")
	private static final long[] aLongArray24 = new long[1000];

	@OriginalMember(owner = "client!wca", name = "n", descriptor = "I")
	private static int anInt10503 = 0;

	@OriginalMember(owner = "client!wca", name = "o", descriptor = "I")
	private static int anInt10504 = 0;

	@OriginalMember(owner = "client!wca", name = "r", descriptor = "Lclient!tq;")
	public static final Class340 aClass340_67 = new Class340(4);

	@OriginalMember(owner = "client!wca", name = "s", descriptor = "[Ljava/lang/String;")
	private static final String[] aStringArray59 = new String[1000];

	@OriginalMember(owner = "client!wca", name = "u", descriptor = "[[I")
	private static final int[][] anIntArrayArray59 = new int[5][5000];

	@OriginalMember(owner = "client!wca", name = "x", descriptor = "[Lclient!cga;")
	private static final Class61[] aClass61Array1 = new Class61[50];

	@OriginalMember(owner = "client!wca", name = "y", descriptor = "[I")
	private static final int[] anIntArray598 = new int[1000];

	@OriginalMember(owner = "client!wca", name = "C", descriptor = "I")
	private static int anInt10510 = 0;

	@OriginalMember(owner = "client!wca", name = "F", descriptor = "I")
	private static int anInt10513 = 0;

	@OriginalMember(owner = "client!wca", name = "a", descriptor = "(I)J")
	private static long method8729(@OriginalArg(0) int arg0) {
		@Pc(9) Long local9 = aClass166_7.method4090(Static218.aClass98_2.anInt2677 << 16 | arg0);
		return local9 == null ? -1L : local9;
	}

	@OriginalMember(owner = "client!wca", name = "a", descriptor = "(C)I")
	private static int method8730(@OriginalArg(0) char arg0) {
		return Static405.method7447(arg0) ? 1 : 0;
	}

	@OriginalMember(owner = "client!wca", name = "a", descriptor = "(IZ)V")
	private static void method8731(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1) {
		@Pc(137) Class345 local137;
		@Pc(19) int local19;
		@Pc(56) int local56;
		@Pc(25) int local25;
		@Pc(35) Class345 local35;
		@Pc(158) Class345 local158;
		@Pc(210) Class345 local210;
		@Pc(13) int local13;
		if (arg0 < 300) {
			if (arg0 == 150) {
				anInt10503 -= 3;
				local13 = anIntArray598[anInt10503];
				local19 = anIntArray598[anInt10503 + 1];
				local25 = anIntArray598[anInt10503 + 2];
				if (local19 == 0) {
					throw new RuntimeException();
				}
				local35 = Static264.method4120(local13);
				if (local35.aClass345Array1 == null) {
					local35.aClass345Array1 = new Class345[local25 + 1];
				}
				if (local35.aClass345Array1.length <= local25) {
					@Pc(54) Class345[] local54 = new Class345[local25 + 1];
					for (local56 = 0; local56 < local35.aClass345Array1.length; local56++) {
						local54[local56] = local35.aClass345Array1[local56];
					}
					local35.aClass345Array1 = local54;
				}
				if (local25 > 0 && local35.aClass345Array1[local25 - 1] == null) {
					throw new RuntimeException("Gap at:" + (local25 - 1));
				}
				@Pc(99) Class345 local99 = new Class345();
				local99.anInt9591 = local19;
				local99.anInt9657 = local99.anInt9664 = local35.anInt9664;
				local99.anInt9611 = local25;
				local35.aClass345Array1[local25] = local99;
				if (arg1) {
					aClass345_14 = local99;
				} else {
					aClass345_13 = local99;
				}
				Static211.method3351(local35);
				return;
			}
			if (arg0 == 151) {
				local137 = arg1 ? aClass345_14 : aClass345_13;
				if (local137.anInt9611 == -1) {
					if (arg1) {
						throw new RuntimeException("Tried to .cc_delete static .active-component!");
					}
					throw new RuntimeException("Tried to cc_delete static active-component!");
				}
				local158 = Static264.method4120(local137.anInt9664);
				local158.aClass345Array1[local137.anInt9611] = null;
				Static211.method3351(local158);
				return;
			}
			if (arg0 == 152) {
				local137 = Static264.method4120(anIntArray598[--anInt10503]);
				local137.aClass345Array1 = null;
				Static211.method3351(local137);
				return;
			}
			if (arg0 == 200) {
				anInt10503 -= 2;
				local13 = anIntArray598[anInt10503];
				local19 = anIntArray598[anInt10503 + 1];
				local210 = Static144.method2595(local13, local19);
				if (local210 != null && local19 != -1) {
					anIntArray598[anInt10503++] = 1;
					if (arg1) {
						aClass345_14 = local210;
						return;
					}
					aClass345_13 = local210;
					return;
				}
				anIntArray598[anInt10503++] = 0;
				return;
			}
			if (arg0 == 201) {
				local13 = anIntArray598[--anInt10503];
				local158 = Static264.method4120(local13);
				if (local158 != null) {
					anIntArray598[anInt10503++] = 1;
					if (arg1) {
						aClass345_14 = local158;
						return;
					}
					aClass345_13 = local158;
					return;
				}
				anIntArray598[anInt10503++] = 0;
				return;
			}
			if (arg0 == 202) {
				local13 = anIntArray598[--anInt10503];
				method8742(local13);
				return;
			}
			if (arg0 == 203) {
				local13 = anIntArray598[--anInt10503];
				method8739(local13);
				return;
			}
		} else {
			@Pc(357) int local357;
			@Pc(420) boolean local420;
			if (arg0 < 500) {
				if (arg0 == 403) {
					anInt10503 -= 2;
					local13 = anIntArray598[anInt10503];
					local19 = anIntArray598[anInt10503 + 1];
					if (Static382.aClass28_Sub1_Sub4_Sub2_Sub2_1.aClass213_1 == null) {
						return;
					}
					for (local25 = 0; local25 < Static224.anIntArray208.length; local25++) {
						if (Static224.anIntArray208[local25] == local13) {
							Static382.aClass28_Sub1_Sub4_Sub2_Sub2_1.aClass213_1.method5207(local19, Static619.aClass94_2, local25);
							return;
						}
					}
					for (local357 = 0; local357 < Static71.anIntArray523.length; local357++) {
						if (Static71.anIntArray523[local357] == local13) {
							Static382.aClass28_Sub1_Sub4_Sub2_Sub2_1.aClass213_1.method5207(local19, Static619.aClass94_2, local357);
							return;
						}
					}
					return;
				}
				if (arg0 == 404) {
					anInt10503 -= 2;
					local13 = anIntArray598[anInt10503];
					local19 = anIntArray598[anInt10503 + 1];
					if (Static382.aClass28_Sub1_Sub4_Sub2_Sub2_1.aClass213_1 == null) {
						return;
					}
					Static382.aClass28_Sub1_Sub4_Sub2_Sub2_1.aClass213_1.method5206(local19, local13);
					return;
				}
				if (arg0 == 410) {
					local420 = anIntArray598[--anInt10503] != 0;
					if (Static382.aClass28_Sub1_Sub4_Sub2_Sub2_1.aClass213_1 == null) {
						return;
					}
					Static382.aClass28_Sub1_Sub4_Sub2_Sub2_1.aClass213_1.method5202(local420);
					return;
				}
				if (arg0 == 411) {
					anInt10503 -= 2;
					local13 = anIntArray598[anInt10503];
					local19 = anIntArray598[anInt10503 + 1];
					if (Static382.aClass28_Sub1_Sub4_Sub2_Sub2_1.aClass213_1 == null) {
						return;
					}
					Static382.aClass28_Sub1_Sub4_Sub2_Sub2_1.aClass213_1.method5205(local13, local19, Static110.aClass105_1);
					return;
				}
			} else if (arg0 >= 1000 && arg0 < 1100 || arg0 >= 2000 && arg0 < 2100) {
				if (arg0 >= 2000) {
					arg0 -= 1000;
					local137 = Static264.method4120(anIntArray598[--anInt10503]);
				} else {
					local137 = arg1 ? aClass345_14 : aClass345_13;
				}
				if (arg0 == 1000) {
					anInt10503 -= 4;
					local137.anInt9582 = anIntArray598[anInt10503];
					local137.anInt9647 = anIntArray598[anInt10503 + 1];
					local19 = anIntArray598[anInt10503 + 2];
					if (local19 < 0) {
						local19 = 0;
					} else if (local19 > 5) {
						local19 = 5;
					}
					local25 = anIntArray598[anInt10503 + 3];
					if (local25 < 0) {
						local25 = 0;
					} else if (local25 > 5) {
						local25 = 5;
					}
					local137.aByte133 = (byte) local19;
					local137.aByte132 = (byte) local25;
					Static211.method3351(local137);
					Static66.method5374(local137);
					if (local137.anInt9611 == -1) {
						Static549.method7640(local137.anInt9664);
					}
					return;
				}
				if (arg0 == 1001) {
					anInt10503 -= 4;
					local137.anInt9596 = anIntArray598[anInt10503];
					local137.anInt9614 = anIntArray598[anInt10503 + 1];
					local137.anInt9634 = 0;
					local137.anInt9599 = 0;
					local19 = anIntArray598[anInt10503 + 2];
					if (local19 < 0) {
						local19 = 0;
					} else if (local19 > 4) {
						local19 = 4;
					}
					local25 = anIntArray598[anInt10503 + 3];
					if (local25 < 0) {
						local25 = 0;
					} else if (local25 > 4) {
						local25 = 4;
					}
					local137.aByte130 = (byte) local19;
					local137.aByte131 = (byte) local25;
					Static211.method3351(local137);
					Static66.method5374(local137);
					if (local137.anInt9591 == 0) {
						Static550.method7644(local137, false);
					}
					return;
				}
				if (arg0 == 1003) {
					@Pc(661) boolean local661 = anIntArray598[--anInt10503] == 1;
					if (local137.aBoolean809 != local661) {
						local137.aBoolean809 = local661;
						Static211.method3351(local137);
					}
					if (local137.anInt9611 == -1) {
						Static584.method8025(local137.anInt9664);
					}
					return;
				}
				if (arg0 == 1004) {
					anInt10503 -= 2;
					local137.anInt9645 = anIntArray598[anInt10503];
					local137.anInt9626 = anIntArray598[anInt10503 + 1];
					Static211.method3351(local137);
					Static66.method5374(local137);
					if (local137.anInt9591 == 0) {
						Static550.method7644(local137, false);
					}
					return;
				}
				if (arg0 == 1005) {
					local137.aBoolean820 = anIntArray598[--anInt10503] == 1;
					return;
				}
			} else {
				@Pc(1523) String local1523;
				@Pc(1161) String local1161;
				if (arg0 >= 1100 && arg0 < 1200 || !(arg0 < 2100 || arg0 >= 2200)) {
					if (arg0 >= 2000) {
						arg0 -= 1000;
						local137 = Static264.method4120(anIntArray598[--anInt10503]);
					} else {
						local137 = arg1 ? aClass345_14 : aClass345_13;
					}
					if (arg0 == 1100) {
						anInt10503 -= 2;
						local137.anInt9583 = anIntArray598[anInt10503];
						if (local137.anInt9583 > local137.anInt9580 - local137.anInt9649) {
							local137.anInt9583 = local137.anInt9580 - local137.anInt9649;
						}
						if (local137.anInt9583 < 0) {
							local137.anInt9583 = 0;
						}
						local137.anInt9577 = anIntArray598[anInt10503 + 1];
						if (local137.anInt9577 > local137.anInt9593 - local137.anInt9606) {
							local137.anInt9577 = local137.anInt9593 - local137.anInt9606;
						}
						if (local137.anInt9577 < 0) {
							local137.anInt9577 = 0;
						}
						Static211.method3351(local137);
						if (local137.anInt9611 == -1) {
							Static156.method2786(local137.anInt9664);
						}
						return;
					}
					if (arg0 == 1101) {
						local137.anInt9655 = anIntArray598[--anInt10503];
						Static211.method3351(local137);
						if (local137.anInt9611 == -1) {
							Static137.method2411(local137.anInt9664);
						}
						return;
					}
					if (arg0 == 1102) {
						local137.aBoolean824 = anIntArray598[--anInt10503] == 1;
						Static211.method3351(local137);
						return;
					}
					if (arg0 == 1103) {
						local137.anInt9627 = anIntArray598[--anInt10503];
						Static211.method3351(local137);
						return;
					}
					if (arg0 == 1104) {
						local137.anInt9632 = anIntArray598[--anInt10503];
						Static211.method3351(local137);
						return;
					}
					if (arg0 == 1105) {
						local19 = anIntArray598[--anInt10503];
						if (local137.anInt9669 != local19) {
							local137.anInt9669 = local19;
							Static211.method3351(local137);
						}
						if (local137.anInt9611 == -1) {
							Static508.method7268(local137.anInt9664);
						}
						return;
					}
					if (arg0 == 1106) {
						local137.anInt9629 = anIntArray598[--anInt10503];
						Static211.method3351(local137);
						return;
					}
					if (arg0 == 1107) {
						local137.aBoolean814 = anIntArray598[--anInt10503] == 1;
						Static211.method3351(local137);
						return;
					}
					if (arg0 == 1108) {
						local137.anInt9656 = 1;
						local137.anInt9624 = anIntArray598[--anInt10503];
						Static211.method3351(local137);
						if (local137.anInt9611 == -1) {
							Static489.method7018(local137.anInt9664);
						}
						return;
					}
					if (arg0 == 1109) {
						anInt10503 -= 6;
						local137.anInt9581 = anIntArray598[anInt10503];
						local137.anInt9667 = anIntArray598[anInt10503 + 1];
						local137.anInt9662 = anIntArray598[anInt10503 + 2];
						local137.anInt9623 = anIntArray598[anInt10503 + 3];
						local137.anInt9633 = anIntArray598[anInt10503 + 4];
						local137.anInt9663 = anIntArray598[anInt10503 + 5];
						Static211.method3351(local137);
						if (local137.anInt9611 == -1) {
							Static331.method5103(local137.anInt9664);
							Static550.method7643(local137.anInt9664);
						}
						return;
					}
					if (arg0 == 1110) {
						local19 = anIntArray598[--anInt10503];
						if (local137.anInt9601 != local19) {
							local137.anInt9601 = local19;
							local137.anInt9646 = 0;
							local137.anInt9604 = 1;
							local137.anInt9658 = 0;
							@Pc(1110) Class175 local1110 = local137.anInt9601 == -1 ? null : Static591.aClass66_2.method1768(local137.anInt9601);
							if (local1110 != null) {
								Static530.method7444(local137.anInt9646, local1110);
							}
							Static211.method3351(local137);
						}
						if (local137.anInt9611 == -1) {
							Static680.method9055(local137.anInt9664);
						}
						return;
					}
					if (arg0 == 1111) {
						local137.aBoolean822 = anIntArray598[--anInt10503] == 1;
						Static211.method3351(local137);
						return;
					}
					if (arg0 == 1112) {
						local1161 = aStringArray59[--anInt10498];
						if (!local1161.equals(local137.aString95)) {
							local137.aString95 = local1161;
							Static211.method3351(local137);
						}
						if (local137.anInt9611 == -1) {
							Static480.method6843(local137.anInt9664);
						}
						return;
					}
					if (arg0 == 1113) {
						local137.anInt9616 = anIntArray598[--anInt10503];
						Static211.method3351(local137);
						if (local137.anInt9611 == -1) {
							Static628.method8488(local137.anInt9664);
						}
						return;
					}
					if (arg0 == 1114) {
						anInt10503 -= 3;
						local137.anInt9628 = anIntArray598[anInt10503];
						local137.anInt9598 = anIntArray598[anInt10503 + 1];
						local137.anInt9637 = anIntArray598[anInt10503 + 2];
						Static211.method3351(local137);
						return;
					}
					if (arg0 == 1115) {
						local137.aBoolean818 = anIntArray598[--anInt10503] == 1;
						Static211.method3351(local137);
						return;
					}
					if (arg0 == 1116) {
						local137.anInt9613 = anIntArray598[--anInt10503];
						Static211.method3351(local137);
						return;
					}
					if (arg0 == 1117) {
						local137.anInt9612 = anIntArray598[--anInt10503];
						Static211.method3351(local137);
						return;
					}
					if (arg0 == 1118) {
						local137.aBoolean808 = anIntArray598[--anInt10503] == 1;
						Static211.method3351(local137);
						return;
					}
					if (arg0 == 1119) {
						local137.aBoolean821 = anIntArray598[--anInt10503] == 1;
						Static211.method3351(local137);
						return;
					}
					if (arg0 == 1120) {
						anInt10503 -= 2;
						local137.anInt9580 = anIntArray598[anInt10503];
						local137.anInt9593 = anIntArray598[anInt10503 + 1];
						Static211.method3351(local137);
						if (local137.anInt9591 == 0) {
							Static550.method7644(local137, false);
						}
						return;
					}
					if (arg0 == 1122) {
						local137.aBoolean810 = anIntArray598[--anInt10503] == 1;
						Static211.method3351(local137);
						return;
					}
					if (arg0 == 1123) {
						local137.anInt9663 = anIntArray598[--anInt10503];
						Static211.method3351(local137);
						if (local137.anInt9611 == -1) {
							Static331.method5103(local137.anInt9664);
						}
						return;
					}
					if (arg0 == 1124) {
						local19 = anIntArray598[--anInt10503];
						local137.aBoolean823 = local19 == 1;
						Static211.method3351(local137);
						return;
					}
					if (arg0 == 1125) {
						anInt10503 -= 2;
						local137.anInt9603 = anIntArray598[anInt10503];
						local137.anInt9642 = anIntArray598[anInt10503 + 1];
						Static211.method3351(local137);
						return;
					}
					if (arg0 == 1126) {
						local137.anInt9638 = anIntArray598[--anInt10503];
						Static211.method3351(local137);
						return;
					}
					@Pc(1489) Class233 local1489;
					if (arg0 == 1127) {
						anInt10503 -= 2;
						local19 = anIntArray598[anInt10503];
						local25 = anIntArray598[anInt10503 + 1];
						local1489 = Static191.aClass381_2.method8728(local19);
						if (local25 != local1489.anInt6763) {
							local137.method8076(local19, local25);
							return;
						}
						local137.method8077(local19);
						return;
					}
					if (arg0 == 1128) {
						local19 = anIntArray598[--anInt10503];
						local1523 = aStringArray59[--anInt10498];
						local1489 = Static191.aClass381_2.method8728(local19);
						if (!local1489.aString56.equals(local1523)) {
							local137.method8079(local1523, local19);
							return;
						}
						local137.method8077(local19);
						return;
					}
					if (arg0 == 1129 || arg0 == 1130) {
						local19 = anIntArray598[--anInt10503];
						if ((local137.anInt9591 == 5 || arg0 != 1129) && (local137.anInt9591 == 4 || arg0 != 1130)) {
							if (local137.anInt9617 != local19) {
								local137.anInt9617 = local19;
								Static211.method3351(local137);
							}
							if (local137.anInt9611 == -1) {
								Static105.method2033(local137.anInt9664);
							}
							return;
						}
						return;
					}
					@Pc(1610) short local1610;
					@Pc(1617) short local1617;
					if (arg0 == 1131) {
						anInt10503 -= 3;
						local19 = anIntArray598[anInt10503];
						local1610 = (short) anIntArray598[anInt10503 + 1];
						local1617 = (short) anIntArray598[anInt10503 + 2];
						if (local19 >= 0 && local19 < 5) {
							local137.method8066(local19, local1610, local1617);
							Static211.method3351(local137);
							if (local137.anInt9611 == -1) {
								Static263.method4113(local19, local137.anInt9664);
							}
							return;
						}
						return;
					}
					if (arg0 == 1132) {
						anInt10503 -= 3;
						local19 = anIntArray598[anInt10503];
						local1610 = (short) anIntArray598[anInt10503 + 1];
						local1617 = (short) anIntArray598[anInt10503 + 2];
						if (local19 >= 0 && local19 < 5) {
							local137.method8069(local1617, local19, local1610);
							Static211.method3351(local137);
							if (local137.anInt9611 == -1) {
								Static138.method2416(local137.anInt9664, local19);
							}
							return;
						}
						return;
					}
				} else if ((arg0 < 1200 || arg0 >= 1300) && (arg0 < 2200 || arg0 >= 2300)) {
					@Pc(2473) int local2473;
					if ((arg0 < 1300 || arg0 >= 1400) && (arg0 < 2300 || arg0 >= 2400)) {
						if (arg0 >= 1400 && arg0 < 1500 || arg0 >= 2400 && arg0 < 2500) {
							if (arg0 >= 2000) {
								arg0 -= 1000;
								local137 = Static264.method4120(anIntArray598[--anInt10503]);
							} else {
								local137 = arg1 ? aClass345_14 : aClass345_13;
							}
							if (arg0 == 1499) {
								local137.method8072();
								return;
							}
							local1161 = aStringArray59[--anInt10498];
							@Pc(2559) int[] local2559 = null;
							if (local1161.length() > 0 && local1161.charAt(local1161.length() - 1) == 'Y') {
								local357 = anIntArray598[--anInt10503];
								if (local357 > 0) {
									local2559 = new int[local357];
									while (local357-- > 0) {
										local2559[local357] = anIntArray598[--anInt10503];
									}
								}
								local1161 = local1161.substring(0, local1161.length() - 1);
							}
							@Pc(2611) Object[] local2611 = new Object[local1161.length() + 1];
							for (local2473 = local2611.length - 1; local2473 >= 1; local2473--) {
								if (local1161.charAt(local2473 - 1) == 's') {
									local2611[local2473] = aStringArray59[--anInt10498];
								} else if (local1161.charAt(local2473 - 1) == '§') {
									local2611[local2473] = Long.valueOf(aLongArray24[--anInt10504]);
								} else {
									local2611[local2473] = Integer.valueOf(anIntArray598[--anInt10503]);
								}
							}
							local56 = anIntArray598[--anInt10503];
							if (local56 == -1) {
								local2611 = null;
							} else {
								local2611[0] = Integer.valueOf(local56);
							}
							if (arg0 == 1400) {
								local137.anObjectArray34 = local2611;
							} else if (arg0 == 1401) {
								local137.anObjectArray29 = local2611;
							} else if (arg0 == 1402) {
								local137.anObjectArray9 = local2611;
							} else if (arg0 == 1403) {
								local137.anObjectArray6 = local2611;
							} else if (arg0 == 1404) {
								local137.anObjectArray15 = local2611;
							} else if (arg0 == 1405) {
								local137.anObjectArray12 = local2611;
							} else if (arg0 == 1406) {
								local137.anObjectArray16 = local2611;
							} else if (arg0 == 1407) {
								local137.anObjectArray10 = local2611;
								local137.anIntArray527 = local2559;
							} else if (arg0 == 1408) {
								local137.anObjectArray25 = local2611;
							} else if (arg0 == 1409) {
								local137.anObjectArray30 = local2611;
							} else if (arg0 == 1410) {
								local137.anObjectArray8 = local2611;
							} else if (arg0 == 1411) {
								local137.anObjectArray26 = local2611;
							} else if (arg0 == 1412) {
								local137.anObjectArray18 = local2611;
							} else if (arg0 == 1414) {
								local137.anObjectArray2 = local2611;
								local137.anIntArray531 = local2559;
							} else if (arg0 == 1415) {
								local137.anObjectArray21 = local2611;
								local137.anIntArray524 = local2559;
							} else if (arg0 == 1416) {
								local137.anObjectArray33 = local2611;
							} else if (arg0 == 1417) {
								local137.anObjectArray13 = local2611;
							} else if (arg0 == 1418) {
								local137.anObjectArray20 = local2611;
							} else if (arg0 == 1419) {
								local137.anObjectArray28 = local2611;
							} else if (arg0 == 1420) {
								local137.anObjectArray3 = local2611;
							} else if (arg0 == 1421) {
								local137.anObjectArray4 = local2611;
							} else if (arg0 == 1422) {
								local137.anObjectArray17 = local2611;
							} else if (arg0 == 1423) {
								local137.anObjectArray32 = local2611;
							} else if (arg0 == 1424) {
								local137.anObjectArray31 = local2611;
							} else if (arg0 == 1425) {
								local137.anObjectArray22 = local2611;
							} else if (arg0 == 1426) {
								local137.anObjectArray11 = local2611;
							} else if (arg0 == 1427) {
								local137.anObjectArray14 = local2611;
							} else if (arg0 == 1428) {
								local137.anObjectArray7 = local2611;
								local137.anIntArray529 = local2559;
							} else if (arg0 == 1429) {
								local137.anObjectArray23 = local2611;
								local137.anIntArray525 = local2559;
							} else if (arg0 == 1430) {
								local137.anObjectArray5 = local2611;
							} else if (arg0 == 1431) {
								local137.anObjectArray19 = local2611;
							} else if (arg0 == 1432) {
								local137.anObjectArray27 = local2611;
							}
							local137.aBoolean816 = true;
							return;
						}
						if (arg0 < 1600) {
							local137 = arg1 ? aClass345_14 : aClass345_13;
							if (arg0 == 1500) {
								anIntArray598[anInt10503++] = local137.anInt9651;
								return;
							}
							if (arg0 == 1501) {
								anIntArray598[anInt10503++] = local137.anInt9588;
								return;
							}
							if (arg0 == 1502) {
								anIntArray598[anInt10503++] = local137.anInt9649;
								return;
							}
							if (arg0 == 1503) {
								anIntArray598[anInt10503++] = local137.anInt9606;
								return;
							}
							if (arg0 == 1504) {
								anIntArray598[anInt10503++] = local137.aBoolean809 ? 1 : 0;
								return;
							}
							if (arg0 == 1505) {
								anIntArray598[anInt10503++] = local137.anInt9657;
								return;
							}
							if (arg0 == 1506) {
								local158 = Static17.method233(local137);
								anIntArray598[anInt10503++] = local158 == null ? -1 : local158.anInt9664;
								return;
							}
						} else {
							@Pc(3242) Class233 local3242;
							if (arg0 < 1700) {
								local137 = arg1 ? aClass345_14 : aClass345_13;
								if (arg0 == 1600) {
									anIntArray598[anInt10503++] = local137.anInt9583;
									return;
								}
								if (arg0 == 1601) {
									anIntArray598[anInt10503++] = local137.anInt9577;
									return;
								}
								if (arg0 == 1602) {
									aStringArray59[anInt10498++] = local137.aString95;
									return;
								}
								if (arg0 == 1603) {
									anIntArray598[anInt10503++] = local137.anInt9580;
									return;
								}
								if (arg0 == 1604) {
									anIntArray598[anInt10503++] = local137.anInt9593;
									return;
								}
								if (arg0 == 1605) {
									anIntArray598[anInt10503++] = local137.anInt9663;
									return;
								}
								if (arg0 == 1606) {
									anIntArray598[anInt10503++] = local137.anInt9662;
									return;
								}
								if (arg0 == 1607) {
									anIntArray598[anInt10503++] = local137.anInt9633;
									return;
								}
								if (arg0 == 1608) {
									anIntArray598[anInt10503++] = local137.anInt9623;
									return;
								}
								if (arg0 == 1609) {
									anIntArray598[anInt10503++] = local137.anInt9627;
									return;
								}
								if (arg0 == 1610) {
									anIntArray598[anInt10503++] = local137.anInt9581;
									return;
								}
								if (arg0 == 1611) {
									anIntArray598[anInt10503++] = local137.anInt9667;
									return;
								}
								if (arg0 == 1612) {
									anIntArray598[anInt10503++] = local137.anInt9669;
									return;
								}
								if (arg0 == 1613) {
									local19 = anIntArray598[--anInt10503];
									local3242 = Static191.aClass381_2.method8728(local19);
									if (local3242.method5642()) {
										aStringArray59[anInt10498++] = local137.method8068(local19, local3242.aString56);
										return;
									}
									anIntArray598[anInt10503++] = local137.method8070(local19, local3242.anInt6763);
									return;
								}
								if (arg0 == 1614) {
									anIntArray598[anInt10503++] = local137.anInt9629;
									return;
								}
								if (arg0 == 2614) {
									anIntArray598[anInt10503++] = local137.anInt9656 == 1 ? local137.anInt9624 : -1;
									return;
								}
							} else if (arg0 < 1800) {
								local137 = arg1 ? aClass345_14 : aClass345_13;
								if (arg0 == 1700) {
									anIntArray598[anInt10503++] = local137.anInt9654;
									return;
								}
								if (arg0 == 1701) {
									if (local137.anInt9654 != -1) {
										anIntArray598[anInt10503++] = local137.anInt9585;
										return;
									}
									anIntArray598[anInt10503++] = 0;
									return;
								}
								if (arg0 == 1702) {
									anIntArray598[anInt10503++] = local137.anInt9611;
									return;
								}
							} else if (arg0 < 1900) {
								local137 = arg1 ? aClass345_14 : aClass345_13;
								if (arg0 == 1800) {
									anIntArray598[anInt10503++] = Static84.method1822(local137).method457();
									return;
								}
								if (arg0 == 1801) {
									local19 = anIntArray598[--anInt10503];
									local19--;
									if (local137.aStringArray54 != null && local19 < local137.aStringArray54.length && local137.aStringArray54[local19] != null) {
										aStringArray59[anInt10498++] = local137.aStringArray54[local19];
										return;
									}
									aStringArray59[anInt10498++] = "";
									return;
								}
								if (arg0 == 1802) {
									if (local137.aString90 == null) {
										aStringArray59[anInt10498++] = "";
										return;
									}
									aStringArray59[anInt10498++] = local137.aString90;
									return;
								}
							} else if (arg0 < 2000 || arg0 >= 2900 && arg0 < 3000) {
								if (arg0 >= 2000) {
									local137 = Static264.method4120(anIntArray598[--anInt10503]);
									arg0 -= 1000;
								} else {
									local137 = arg1 ? aClass345_14 : aClass345_13;
								}
								if (anInt10513 >= 10) {
									throw new RuntimeException("C29xx-1");
								}
								if (arg0 == 1927) {
									if (local137.anObjectArray14 == null) {
										return;
									}
									@Pc(3511) Class5_Sub22 local3511 = new Class5_Sub22();
									local3511.aClass345_1 = local137;
									local3511.anObjectArray1 = local137.anObjectArray14;
									local3511.anInt3429 = anInt10513 + 1;
									Static637.aClass114_66.method2807(local3511);
									return;
								}
							} else if (arg0 < 2600) {
								local137 = Static264.method4120(anIntArray598[--anInt10503]);
								if (arg0 == 2500) {
									anIntArray598[anInt10503++] = local137.anInt9651;
									return;
								}
								if (arg0 == 2501) {
									anIntArray598[anInt10503++] = local137.anInt9588;
									return;
								}
								if (arg0 == 2502) {
									anIntArray598[anInt10503++] = local137.anInt9649;
									return;
								}
								if (arg0 == 2503) {
									anIntArray598[anInt10503++] = local137.anInt9606;
									return;
								}
								if (arg0 == 2504) {
									anIntArray598[anInt10503++] = local137.aBoolean809 ? 1 : 0;
									return;
								}
								if (arg0 == 2505) {
									anIntArray598[anInt10503++] = local137.anInt9657;
									return;
								}
								if (arg0 == 1506) {
									local158 = Static17.method233(local137);
									anIntArray598[anInt10503++] = local158 == null ? -1 : local158.anInt9664;
									return;
								}
							} else if (arg0 < 2700) {
								local137 = Static264.method4120(anIntArray598[--anInt10503]);
								if (arg0 == 2600) {
									anIntArray598[anInt10503++] = local137.anInt9583;
									return;
								}
								if (arg0 == 2601) {
									anIntArray598[anInt10503++] = local137.anInt9577;
									return;
								}
								if (arg0 == 2602) {
									aStringArray59[anInt10498++] = local137.aString95;
									return;
								}
								if (arg0 == 2603) {
									anIntArray598[anInt10503++] = local137.anInt9580;
									return;
								}
								if (arg0 == 2604) {
									anIntArray598[anInt10503++] = local137.anInt9593;
									return;
								}
								if (arg0 == 2605) {
									anIntArray598[anInt10503++] = local137.anInt9663;
									return;
								}
								if (arg0 == 2606) {
									anIntArray598[anInt10503++] = local137.anInt9662;
									return;
								}
								if (arg0 == 2607) {
									anIntArray598[anInt10503++] = local137.anInt9633;
									return;
								}
								if (arg0 == 2608) {
									anIntArray598[anInt10503++] = local137.anInt9623;
									return;
								}
								if (arg0 == 2609) {
									anIntArray598[anInt10503++] = local137.anInt9627;
									return;
								}
								if (arg0 == 2610) {
									anIntArray598[anInt10503++] = local137.anInt9581;
									return;
								}
								if (arg0 == 2611) {
									anIntArray598[anInt10503++] = local137.anInt9667;
									return;
								}
								if (arg0 == 2612) {
									anIntArray598[anInt10503++] = local137.anInt9669;
									return;
								}
								if (arg0 == 2613) {
									anIntArray598[anInt10503++] = local137.anInt9629;
									return;
								}
								if (arg0 == 2614) {
									anIntArray598[anInt10503++] = local137.anInt9656 == 1 ? local137.anInt9624 : -1;
									return;
								}
							} else {
								@Pc(4040) Class5_Sub39 local4040;
								@Pc(3938) Class5_Sub39 local3938;
								if (arg0 < 2800) {
									if (arg0 == 2700) {
										local137 = Static264.method4120(anIntArray598[--anInt10503]);
										anIntArray598[anInt10503++] = local137.anInt9654;
										return;
									}
									if (arg0 == 2701) {
										local137 = Static264.method4120(anIntArray598[--anInt10503]);
										if (local137.anInt9654 != -1) {
											anIntArray598[anInt10503++] = local137.anInt9585;
											return;
										}
										anIntArray598[anInt10503++] = 0;
										return;
									}
									if (arg0 == 2702) {
										local13 = anIntArray598[--anInt10503];
										local3938 = (Class5_Sub39) Static452.aClass300_33.method7188((long) local13);
										if (local3938 != null) {
											anIntArray598[anInt10503++] = 1;
											return;
										}
										anIntArray598[anInt10503++] = 0;
										return;
									}
									if (arg0 == 2703) {
										local137 = Static264.method4120(anIntArray598[--anInt10503]);
										if (local137.aClass345Array1 == null) {
											anIntArray598[anInt10503++] = 0;
											return;
										}
										local19 = local137.aClass345Array1.length;
										for (local25 = 0; local25 < local137.aClass345Array1.length; local25++) {
											if (local137.aClass345Array1[local25] == null) {
												local19 = local25;
												break;
											}
										}
										anIntArray598[anInt10503++] = local19;
										return;
									}
									if (arg0 == 2704 || arg0 == 2705) {
										anInt10503 -= 2;
										local13 = anIntArray598[anInt10503];
										local19 = anIntArray598[anInt10503 + 1];
										local4040 = (Class5_Sub39) Static452.aClass300_33.method7188((long) local13);
										if (local4040 != null && local4040.anInt6238 == local19) {
											anIntArray598[anInt10503++] = 1;
											return;
										}
										anIntArray598[anInt10503++] = 0;
										return;
									}
								} else if (arg0 < 2900) {
									local137 = Static264.method4120(anIntArray598[--anInt10503]);
									if (arg0 == 2800) {
										anIntArray598[anInt10503++] = Static84.method1822(local137).method457();
										return;
									}
									if (arg0 == 2801) {
										local19 = anIntArray598[--anInt10503];
										local19--;
										if (local137.aStringArray54 != null && local19 < local137.aStringArray54.length && local137.aStringArray54[local19] != null) {
											aStringArray59[anInt10498++] = local137.aStringArray54[local19];
											return;
										}
										aStringArray59[anInt10498++] = "";
										return;
									}
									if (arg0 == 2802) {
										if (local137.aString90 == null) {
											aStringArray59[anInt10498++] = "";
											return;
										}
										aStringArray59[anInt10498++] = local137.aString90;
										return;
									}
								} else {
									@Pc(4266) Class5_Sub21 local4266;
									@Pc(4177) String local4177;
									if (arg0 < 3200) {
										if (arg0 == 3100) {
											local4177 = aStringArray59[--anInt10498];
											Static89.method1856(local4177);
											return;
										}
										if (arg0 == 3101) {
											anInt10503 -= 2;
											Static168.method2937(anIntArray598[anInt10503], anIntArray598[anInt10503 + 1], Static382.aClass28_Sub1_Sub4_Sub2_Sub2_1);
											return;
										}
										if (arg0 == 3103) {
											Static319.method4989();
											return;
										}
										if (arg0 == 3104) {
											local4177 = aStringArray59[--anInt10498];
											local19 = 0;
											if (Static414.method6154(local4177)) {
												local19 = Static270.method4173(local4177);
											}
											@Pc(4237) Class5_Sub21 local4237 = Static64.method905(Static263.aClass49_1, Static33.aClass305_9);
											local4237.aClass5_Sub41_Sub2_1.method7803(local19);
											Static495.method7092(local4237);
											return;
										}
										if (arg0 == 3105) {
											local4177 = aStringArray59[--anInt10498];
											local4266 = Static64.method905(Static263.aClass49_1, Static550.aClass305_87);
											local4266.aClass5_Sub41_Sub2_1.method7798(local4177.length() + 1);
											local4266.aClass5_Sub41_Sub2_1.method7854(local4177);
											Static495.method7092(local4266);
											return;
										}
										if (arg0 == 3106) {
											local4177 = aStringArray59[--anInt10498];
											local4266 = Static64.method905(Static263.aClass49_1, Static181.aClass305_81);
											local4266.aClass5_Sub41_Sub2_1.method7798(local4177.length() + 1);
											local4266.aClass5_Sub41_Sub2_1.method7854(local4177);
											Static495.method7092(local4266);
											return;
										}
										if (arg0 == 3107) {
											local13 = anIntArray598[--anInt10503];
											local1161 = aStringArray59[--anInt10498];
											Static470.method6769(local1161, local13);
											return;
										}
										if (arg0 == 3108) {
											anInt10503 -= 3;
											local13 = anIntArray598[anInt10503];
											local19 = anIntArray598[anInt10503 + 1];
											local25 = anIntArray598[anInt10503 + 2];
											local35 = Static264.method4120(local25);
											Static446.method6473(local35, local19, local13);
											return;
										}
										if (arg0 == 3109) {
											anInt10503 -= 2;
											local13 = anIntArray598[anInt10503];
											local19 = anIntArray598[anInt10503 + 1];
											local210 = arg1 ? aClass345_14 : aClass345_13;
											Static446.method6473(local210, local19, local13);
											return;
										}
										if (arg0 == 3110) {
											local13 = anIntArray598[--anInt10503];
											local4266 = Static64.method905(Static263.aClass49_1, Static633.aClass305_99);
											local4266.aClass5_Sub41_Sub2_1.method7848(local13);
											Static495.method7092(local4266);
											return;
										}
										if (arg0 == 3111) {
											anInt10503 -= 2;
											local13 = anIntArray598[anInt10503];
											local19 = anIntArray598[anInt10503 + 1];
											local4040 = (Class5_Sub39) Static452.aClass300_33.method7188((long) local13);
											if (local4040 != null) {
												Static68.method931(local4040, local4040.anInt6238 != local19, true);
											}
											Static187.method5799(true, 3, local13, local19);
											return;
										}
										if (arg0 == 3112) {
											anInt10503--;
											local13 = anIntArray598[anInt10503];
											local3938 = (Class5_Sub39) Static452.aClass300_33.method7188((long) local13);
											if (local3938 != null && local3938.anInt6236 == 3) {
												Static68.method931(local3938, true, true);
											}
											return;
										}
										if (arg0 == 3113) {
											Static567.method7778(aStringArray59[--anInt10498]);
											return;
										}
										if (arg0 == 3114) {
											anInt10503 -= 2;
											local13 = anIntArray598[anInt10503];
											local19 = anIntArray598[anInt10503 + 1];
											local1523 = aStringArray59[--anInt10498];
											Static234.method3619(local19, "", "", "", local1523, local13);
											return;
										}
										if (arg0 == 3115) {
											anInt10503 -= 11;
											@Pc(4567) Class275[] local4567 = Static393.method5771();
											@Pc(4570) Class81[] local4570 = Static584.method8024();
											Static219.method3469(anIntArray598[anInt10503 + 2], anIntArray598[anInt10503 + 6], anIntArray598[anInt10503 + 5], anIntArray598[anInt10503 + 4], anIntArray598[anInt10503 + 8], anIntArray598[anInt10503 + 3], local4570[anIntArray598[anInt10503 + 1]], anIntArray598[anInt10503 + 9], anIntArray598[anInt10503 + 7], anIntArray598[anInt10503 + 10], local4567[anIntArray598[anInt10503]]);
											return;
										}
										if (arg0 == 3116) {
											local13 = anIntArray598[--anInt10503];
											local4266 = Static64.method905(Static263.aClass49_1, Static592.aClass305_95);
											local4266.aClass5_Sub41_Sub2_1.method7848(local13);
											Static495.method7092(local4266);
											return;
										}
										if (arg0 == 3117) {
											local4177 = aStringArray59[--anInt10498];
											local4266 = Static64.method905(Static263.aClass49_1, Static528.aClass305_83);
											local4266.aClass5_Sub41_Sub2_1.method7798(local4177.length() + 1);
											local4266.aClass5_Sub41_Sub2_1.method7854(local4177);
											Static495.method7092(local4266);
											return;
										}
									} else if (arg0 < 3300) {
										if (arg0 == 3200) {
											anInt10503 -= 3;
											Static595.method8160(255, anIntArray598[anInt10503 + 1], 256, anIntArray598[anInt10503], anIntArray598[anInt10503 + 2]);
											return;
										}
										if (arg0 == 3201) {
											Static146.method2649(anIntArray598[--anInt10503], 50, 255);
											return;
										}
										if (arg0 == 3202) {
											anInt10503 -= 2;
											Static395.method5805(255, anIntArray598[anInt10503], anIntArray598[anInt10503 + 1]);
											return;
										}
										if (arg0 == 3203) {
											anInt10503 -= 4;
											Static595.method8160(anIntArray598[anInt10503 + 3], anIntArray598[anInt10503 + 1], 256, anIntArray598[anInt10503], anIntArray598[anInt10503 + 2]);
											return;
										}
										if (arg0 == 3204) {
											anInt10503 -= 3;
											Static146.method2649(anIntArray598[anInt10503], anIntArray598[anInt10503 + 2], anIntArray598[anInt10503 + 1]);
											return;
										}
										if (arg0 == 3205) {
											anInt10503 -= 3;
											Static395.method5805(anIntArray598[anInt10503 + 2], anIntArray598[anInt10503], anIntArray598[anInt10503 + 1]);
											return;
										}
										if (arg0 == 3206) {
											anInt10503 -= 4;
											Static155.method446(anIntArray598[anInt10503 + 3], 256, anIntArray598[anInt10503 + 2], false, anIntArray598[anInt10503 + 1], anIntArray598[anInt10503]);
											return;
										}
										if (arg0 == 3207) {
											anInt10503 -= 4;
											Static155.method446(anIntArray598[anInt10503 + 3], 256, anIntArray598[anInt10503 + 2], true, anIntArray598[anInt10503 + 1], anIntArray598[anInt10503]);
											return;
										}
										if (arg0 == 3208) {
											anInt10503 -= 5;
											Static595.method8160(anIntArray598[anInt10503 + 3], anIntArray598[anInt10503 + 1], anIntArray598[anInt10503 + 4], anIntArray598[anInt10503], anIntArray598[anInt10503 + 2]);
											return;
										}
										if (arg0 == 3209) {
											anInt10503 -= 5;
											Static155.method446(anIntArray598[anInt10503 + 3], anIntArray598[anInt10503 + 4], anIntArray598[anInt10503 + 2], false, anIntArray598[anInt10503 + 1], anIntArray598[anInt10503]);
											return;
										}
									} else if (arg0 < 3400) {
										if (arg0 == 3300) {
											anIntArray598[anInt10503++] = Static26.anInt350;
											return;
										}
										if (arg0 == 3301) {
											anInt10503 -= 2;
											local13 = anIntArray598[anInt10503];
											local19 = anIntArray598[anInt10503 + 1];
											anIntArray598[anInt10503++] = Static534.method7505(false, local13, local19);
											return;
										}
										if (arg0 == 3302) {
											anInt10503 -= 2;
											local13 = anIntArray598[anInt10503];
											local19 = anIntArray598[anInt10503 + 1];
											anIntArray598[anInt10503++] = Static628.method8482(local19, local13, false);
											return;
										}
										if (arg0 == 3303) {
											anInt10503 -= 2;
											local13 = anIntArray598[anInt10503];
											local19 = anIntArray598[anInt10503 + 1];
											anIntArray598[anInt10503++] = Static677.method9033(false, local19, local13);
											return;
										}
										if (arg0 == 3304) {
											local13 = anIntArray598[--anInt10503];
											anIntArray598[anInt10503++] = Static446.aClass242_1.method5736(local13).anInt5756;
											return;
										}
										if (arg0 == 3305) {
											local13 = anIntArray598[--anInt10503];
											anIntArray598[anInt10503++] = Static211.anIntArray200[local13];
											return;
										}
										if (arg0 == 3306) {
											local13 = anIntArray598[--anInt10503];
											anIntArray598[anInt10503++] = Static293.anIntArray312[local13];
											return;
										}
										if (arg0 == 3307) {
											local13 = anIntArray598[--anInt10503];
											anIntArray598[anInt10503++] = Static277.anIntArray294[local13];
											return;
										}
										if (arg0 == 3308) {
											@Pc(5157) byte local5157 = Static382.aClass28_Sub1_Sub4_Sub2_Sub2_1.aByte145;
											local19 = (Static382.aClass28_Sub1_Sub4_Sub2_Sub2_1.anInt10781 >> 9) + Static153.anInt3147;
											local25 = (Static382.aClass28_Sub1_Sub4_Sub2_Sub2_1.anInt10784 >> 9) + Static201.anInt3839;
											anIntArray598[anInt10503++] = (local5157 << 28) + (local19 << 14) + local25;
											return;
										}
										if (arg0 == 3309) {
											local13 = anIntArray598[--anInt10503];
											anIntArray598[anInt10503++] = local13 >> 14 & 0x3FFF;
											return;
										}
										if (arg0 == 3310) {
											local13 = anIntArray598[--anInt10503];
											anIntArray598[anInt10503++] = local13 >> 28;
											return;
										}
										if (arg0 == 3311) {
											local13 = anIntArray598[--anInt10503];
											anIntArray598[anInt10503++] = local13 & 0x3FFF;
											return;
										}
										if (arg0 == 3312) {
											anIntArray598[anInt10503++] = Static530.aBoolean743 ? 1 : 0;
											return;
										}
										if (arg0 == 3313) {
											anInt10503 -= 2;
											local13 = anIntArray598[anInt10503];
											local19 = anIntArray598[anInt10503 + 1];
											anIntArray598[anInt10503++] = Static534.method7505(true, local13, local19);
											return;
										}
										if (arg0 == 3314) {
											anInt10503 -= 2;
											local13 = anIntArray598[anInt10503];
											local19 = anIntArray598[anInt10503 + 1];
											anIntArray598[anInt10503++] = Static628.method8482(local19, local13, true);
											return;
										}
										if (arg0 == 3315) {
											anInt10503 -= 2;
											local13 = anIntArray598[anInt10503];
											local19 = anIntArray598[anInt10503 + 1];
											anIntArray598[anInt10503++] = Static677.method9033(true, local19, local13);
											return;
										}
										if (arg0 == 3316) {
											if (Static105.anInt2257 >= 2) {
												anIntArray598[anInt10503++] = Static105.anInt2257;
												return;
											}
											anIntArray598[anInt10503++] = 0;
											return;
										}
										if (arg0 == 3317) {
											anIntArray598[anInt10503++] = Static198.anInt8358;
											return;
										}
										if (arg0 == 3318) {
											anIntArray598[anInt10503++] = Static514.aClass395_4.anInt10873;
											return;
										}
										if (arg0 == 3321) {
											anIntArray598[anInt10503++] = Static171.anInt3390;
											return;
										}
										if (arg0 == 3322) {
											anIntArray598[anInt10503++] = Static535.anInt8848;
											return;
										}
										if (arg0 == 3323) {
											if (Static566.anInt9193 >= 5 && Static566.anInt9193 <= 9) {
												anIntArray598[anInt10503++] = 1;
												return;
											}
											anIntArray598[anInt10503++] = 0;
											return;
										}
										if (arg0 == 3324) {
											if (Static566.anInt9193 >= 5 && Static566.anInt9193 <= 9) {
												anIntArray598[anInt10503++] = Static566.anInt9193;
												return;
											}
											anIntArray598[anInt10503++] = 0;
											return;
										}
										if (arg0 == 3325) {
											anIntArray598[anInt10503++] = Static289.aBoolean488 ? 1 : 0;
											return;
										}
										if (arg0 == 3326) {
											anIntArray598[anInt10503++] = Static382.aClass28_Sub1_Sub4_Sub2_Sub2_1.anInt5549;
											return;
										}
										if (arg0 == 3327) {
											anIntArray598[anInt10503++] = Static382.aClass28_Sub1_Sub4_Sub2_Sub2_1.aClass213_1 != null && Static382.aClass28_Sub1_Sub4_Sub2_Sub2_1.aClass213_1.aBoolean552 ? 1 : 0;
											return;
										}
										if (arg0 == 3329) {
											anIntArray598[anInt10503++] = Static211.aBoolean327 ? 1 : 0;
											return;
										}
										if (arg0 == 3330) {
											local13 = anIntArray598[--anInt10503];
											anIntArray598[anInt10503++] = Static636.method8561(local13);
											return;
										}
										if (arg0 == 3331) {
											anInt10503 -= 2;
											local13 = anIntArray598[anInt10503];
											local19 = anIntArray598[anInt10503 + 1];
											anIntArray598[anInt10503++] = Static153.method2784(local19, local13, false);
											return;
										}
										if (arg0 == 3332) {
											anInt10503 -= 2;
											local13 = anIntArray598[anInt10503];
											local19 = anIntArray598[anInt10503 + 1];
											anIntArray598[anInt10503++] = Static153.method2784(local19, local13, true);
											return;
										}
										if (arg0 == 3333) {
											anIntArray598[anInt10503++] = Static270.anInt4979;
											return;
										}
										if (arg0 == 3335) {
											anIntArray598[anInt10503++] = Static544.anInt8937;
											return;
										}
										if (arg0 == 3336) {
											anInt10503 -= 4;
											local13 = anIntArray598[anInt10503];
											local19 = anIntArray598[anInt10503 + 1];
											local25 = anIntArray598[anInt10503 + 2];
											local357 = anIntArray598[anInt10503 + 3];
											local13 += local19 << 14;
											local13 += local25 << 28;
											local13 += local357;
											anIntArray598[anInt10503++] = local13;
											return;
										}
										if (arg0 == 3337) {
											anIntArray598[anInt10503++] = Static254.anInt4619;
											return;
										}
										if (arg0 == 3338) {
											anIntArray598[anInt10503++] = Static222.method3494();
											return;
										}
										if (arg0 == 3339) {
											anIntArray598[anInt10503++] = 0;
											return;
										}
										if (arg0 == 3340) {
											anIntArray598[anInt10503++] = Static391.aBoolean602 ? 1 : 0;
											return;
										}
										if (arg0 == 3341) {
											anIntArray598[anInt10503++] = Static315.aBoolean249 ? 1 : 0;
											return;
										}
										if (arg0 == 3342) {
											anIntArray598[anInt10503++] = Static359.aClass11_1.method6141();
											return;
										}
										if (arg0 == 3343) {
											anIntArray598[anInt10503++] = Static359.aClass11_1.method6144();
											return;
										}
										if (arg0 == 3344) {
											aStringArray59[anInt10498++] = Static283.method4546();
											return;
										}
										if (arg0 == 3345) {
											aStringArray59[anInt10498++] = Static422.method6268();
											return;
										}
										if (arg0 == 3346) {
											anIntArray598[anInt10503++] = Static399.method5896();
											return;
										}
										if (arg0 == 3347) {
											anIntArray598[anInt10503++] = Static455.anInt7736;
											return;
										}
										if (arg0 == 3349) {
											anIntArray598[anInt10503++] = Static382.aClass28_Sub1_Sub4_Sub2_Sub2_1.aClass306_7.method7389() >> 3;
											return;
										}
									} else if (arg0 < 3500) {
										@Pc(5908) Class221 local5908;
										if (arg0 == 3400) {
											anInt10503 -= 2;
											local13 = anIntArray598[anInt10503];
											local19 = anIntArray598[anInt10503 + 1];
											local5908 = Static548.aClass190_1.method4808(local13);
											aStringArray59[anInt10498++] = local5908.method5370(local19);
											return;
										}
										if (arg0 == 3408) {
											anInt10503 -= 4;
											local13 = anIntArray598[anInt10503];
											local19 = anIntArray598[anInt10503 + 1];
											local25 = anIntArray598[anInt10503 + 2];
											local357 = anIntArray598[anInt10503 + 3];
											@Pc(5954) Class221 local5954 = Static548.aClass190_1.method4808(local25);
											if (local5954.aChar3 == local13 && local5954.aChar2 == local19) {
												if (local19 == 115) {
													aStringArray59[anInt10498++] = local5954.method5370(local357);
													return;
												}
												anIntArray598[anInt10503++] = local5954.method5367(local357);
												return;
											}
											throw new RuntimeException("C3408-1 " + local25 + "-" + local357);
										}
										if (arg0 == 3409) {
											anInt10503 -= 3;
											local13 = anIntArray598[anInt10503];
											local19 = anIntArray598[anInt10503 + 1];
											local25 = anIntArray598[anInt10503 + 2];
											if (local19 == -1) {
												throw new RuntimeException("C3409-2");
											}
											@Pc(6040) Class221 local6040 = Static548.aClass190_1.method4808(local19);
											if (local6040.aChar2 != local13) {
												throw new RuntimeException("C3409-1");
											}
											anIntArray598[anInt10503++] = local6040.method5369(local25) ? 1 : 0;
											return;
										}
										if (arg0 == 3410) {
											local13 = anIntArray598[--anInt10503];
											local1161 = aStringArray59[--anInt10498];
											if (local13 == -1) {
												throw new RuntimeException("C3410-2");
											}
											local5908 = Static548.aClass190_1.method4808(local13);
											if (local5908.aChar2 != 's') {
												throw new RuntimeException("C3410-1");
											}
											anIntArray598[anInt10503++] = local5908.method5368(local1161) ? 1 : 0;
											return;
										}
										if (arg0 == 3411) {
											local13 = anIntArray598[--anInt10503];
											@Pc(6138) Class221 local6138 = Static548.aClass190_1.method4808(local13);
											anIntArray598[anInt10503++] = local6138.aClass300_29.method7190();
											return;
										}
									} else if (arg0 < 3700) {
										if (arg0 == 3600) {
											if (Static150.anInt3077 == 0) {
												anIntArray598[anInt10503++] = -2;
												return;
											}
											if (Static150.anInt3077 == 1) {
												anIntArray598[anInt10503++] = -1;
												return;
											}
											anIntArray598[anInt10503++] = Static253.anInt4604;
											return;
										}
										if (arg0 == 3601) {
											local13 = anIntArray598[--anInt10503];
											if (Static150.anInt3077 == 2 && local13 < Static253.anInt4604) {
												aStringArray59[anInt10498++] = Static326.aStringArray31[local13];
												if (Static558.aStringArray43[local13] != null) {
													aStringArray59[anInt10498++] = Static558.aStringArray43[local13];
													return;
												}
												aStringArray59[anInt10498++] = "";
												return;
											}
											aStringArray59[anInt10498++] = "";
											aStringArray59[anInt10498++] = "";
											return;
										}
										if (arg0 == 3602) {
											local13 = anIntArray598[--anInt10503];
											if (Static150.anInt3077 == 2 && local13 < Static253.anInt4604) {
												anIntArray598[anInt10503++] = Static592.anIntArray538[local13];
												return;
											}
											anIntArray598[anInt10503++] = 0;
											return;
										}
										if (arg0 == 3603) {
											local13 = anIntArray598[--anInt10503];
											if (Static150.anInt3077 == 2 && local13 < Static253.anInt4604) {
												anIntArray598[anInt10503++] = Static297.anIntArray320[local13];
												return;
											}
											anIntArray598[anInt10503++] = 0;
											return;
										}
										if (arg0 == 3604) {
											local4177 = aStringArray59[--anInt10498];
											local19 = anIntArray598[--anInt10503];
											Static678.method9039(local19, local4177);
											return;
										}
										if (arg0 == 3605) {
											local4177 = aStringArray59[--anInt10498];
											Static256.method3991(local4177);
											return;
										}
										if (arg0 == 3606) {
											local4177 = aStringArray59[--anInt10498];
											Static168.method2940(local4177);
											return;
										}
										if (arg0 == 3607) {
											local4177 = aStringArray59[--anInt10498];
											Static511.method7291(false, local4177);
											return;
										}
										if (arg0 == 3608) {
											local4177 = aStringArray59[--anInt10498];
											Static401.method5910(local4177);
											return;
										}
										if (arg0 == 3609) {
											local4177 = aStringArray59[--anInt10498];
											if (local4177.startsWith("<img=0>") || local4177.startsWith("<img=1>")) {
												local4177 = local4177.substring(7);
											}
											anIntArray598[anInt10503++] = Static476.method6820(local4177) ? 1 : 0;
											return;
										}
										if (arg0 == 3610) {
											local13 = anIntArray598[--anInt10503];
											if (Static150.anInt3077 == 2 && local13 < Static253.anInt4604) {
												aStringArray59[anInt10498++] = Static178.aStringArray23[local13];
												return;
											}
											aStringArray59[anInt10498++] = "";
											return;
										}
										if (arg0 == 3611) {
											if (Static423.aString60 != null) {
												aStringArray59[anInt10498++] = Static357.method5361(Static423.aString60);
												return;
											}
											aStringArray59[anInt10498++] = "";
											return;
										}
										if (arg0 == 3612) {
											if (Static423.aString60 != null) {
												anIntArray598[anInt10503++] = Static552.anInt9015;
												return;
											}
											anIntArray598[anInt10503++] = 0;
											return;
										}
										if (arg0 == 3613) {
											local13 = anIntArray598[--anInt10503];
											if (Static423.aString60 != null && local13 < Static552.anInt9015) {
												aStringArray59[anInt10498++] = Static243.aClass375Array1[local13].aString115;
												return;
											}
											aStringArray59[anInt10498++] = "";
											return;
										}
										if (arg0 == 3614) {
											local13 = anIntArray598[--anInt10503];
											if (Static423.aString60 != null && local13 < Static552.anInt9015) {
												anIntArray598[anInt10503++] = Static243.aClass375Array1[local13].anInt10404;
												return;
											}
											anIntArray598[anInt10503++] = 0;
											return;
										}
										if (arg0 == 3615) {
											local13 = anIntArray598[--anInt10503];
											if (Static423.aString60 != null && local13 < Static552.anInt9015) {
												anIntArray598[anInt10503++] = Static243.aClass375Array1[local13].aByte139;
												return;
											}
											anIntArray598[anInt10503++] = 0;
											return;
										}
										if (arg0 == 3616) {
											anIntArray598[anInt10503++] = Static537.aByte59;
											return;
										}
										if (arg0 == 3617) {
											local4177 = aStringArray59[--anInt10498];
											Static563.method7755(local4177);
											return;
										}
										if (arg0 == 3618) {
											anIntArray598[anInt10503++] = Static224.aByte61;
											return;
										}
										if (arg0 == 3619) {
											local4177 = aStringArray59[--anInt10498];
											Static60.method6638(local4177);
											return;
										}
										if (arg0 == 3620) {
											Static489.method7019();
											return;
										}
										if (arg0 == 3621) {
											if (Static150.anInt3077 == 0) {
												anIntArray598[anInt10503++] = -1;
												return;
											}
											anIntArray598[anInt10503++] = Static264.anInt4921;
											return;
										}
										if (arg0 == 3622) {
											local13 = anIntArray598[--anInt10503];
											if (Static150.anInt3077 != 0 && local13 < Static264.anInt4921) {
												aStringArray59[anInt10498++] = Static593.aStringArray55[local13];
												if (Static650.aStringArray57[local13] != null) {
													aStringArray59[anInt10498++] = Static650.aStringArray57[local13];
													return;
												}
												aStringArray59[anInt10498++] = "";
												return;
											}
											aStringArray59[anInt10498++] = "";
											aStringArray59[anInt10498++] = "";
											return;
										}
										if (arg0 == 3623) {
											local4177 = aStringArray59[--anInt10498];
											if (local4177.startsWith("<img=0>") || local4177.startsWith("<img=1>")) {
												local4177 = local4177.substring(7);
											}
											anIntArray598[anInt10503++] = Static444.method8130(local4177) ? 1 : 0;
											return;
										}
										if (arg0 == 3624) {
											local13 = anIntArray598[--anInt10503];
											if (Static243.aClass375Array1 != null && local13 < Static552.anInt9015 && Static243.aClass375Array1[local13].aString113.equalsIgnoreCase(Static382.aClass28_Sub1_Sub4_Sub2_Sub2_1.aString45)) {
												anIntArray598[anInt10503++] = 1;
												return;
											}
											anIntArray598[anInt10503++] = 0;
											return;
										}
										if (arg0 == 3625) {
											if (Static562.aString87 != null) {
												aStringArray59[anInt10498++] = Static562.aString87;
												return;
											}
											aStringArray59[anInt10498++] = "";
											return;
										}
										if (arg0 == 3626) {
											local13 = anIntArray598[--anInt10503];
											if (Static423.aString60 != null && local13 < Static552.anInt9015) {
												aStringArray59[anInt10498++] = Static243.aClass375Array1[local13].aString114;
												return;
											}
											aStringArray59[anInt10498++] = "";
											return;
										}
										if (arg0 == 3627) {
											local13 = anIntArray598[--anInt10503];
											if (Static150.anInt3077 == 2 && local13 >= 0 && local13 < Static253.anInt4604) {
												anIntArray598[anInt10503++] = Static292.aBooleanArray23[local13] ? 1 : 0;
												return;
											}
											anIntArray598[anInt10503++] = 0;
											return;
										}
										if (arg0 == 3628) {
											local4177 = aStringArray59[--anInt10498];
											if (local4177.startsWith("<img=0>") || local4177.startsWith("<img=1>")) {
												local4177 = local4177.substring(7);
											}
											anIntArray598[anInt10503++] = Static133.method2374(local4177);
											return;
										}
										if (arg0 == 3629) {
											anIntArray598[anInt10503++] = Static267.anInt4952;
											return;
										}
										if (arg0 == 3630) {
											local4177 = aStringArray59[--anInt10498];
											Static511.method7291(true, local4177);
											return;
										}
										if (arg0 == 3631) {
											local13 = anIntArray598[--anInt10503];
											anIntArray598[anInt10503++] = Static392.aBooleanArray29[local13] ? 1 : 0;
											return;
										}
										if (arg0 == 3632) {
											local13 = anIntArray598[--anInt10503];
											if (Static423.aString60 != null && local13 < Static552.anInt9015) {
												aStringArray59[anInt10498++] = Static243.aClass375Array1[local13].aString113;
												return;
											}
											aStringArray59[anInt10498++] = "";
											return;
										}
										if (arg0 == 3633) {
											local13 = anIntArray598[--anInt10503];
											if (Static150.anInt3077 != 0 && local13 < Static264.anInt4921) {
												aStringArray59[anInt10498++] = Static340.aStringArray35[local13];
												return;
											}
											aStringArray59[anInt10498++] = "";
											return;
										}
									} else if (arg0 < 3800) {
										if (arg0 == 3700) {
											if (Static300.aClass166_6 != null) {
												anIntArray598[anInt10503++] = 1;
												aClass166_7 = Static300.aClass166_6;
												return;
											}
											anIntArray598[anInt10503++] = 0;
											return;
										}
										if (arg0 == 3701) {
											if (Static101.aClass166_1 != null) {
												anIntArray598[anInt10503++] = 1;
												aClass166_7 = Static101.aClass166_1;
												return;
											}
											anIntArray598[anInt10503++] = 0;
											return;
										}
										if (arg0 == 3702) {
											aStringArray59[anInt10498++] = aClass166_7.aString39;
											return;
										}
										if (arg0 == 3703) {
											anIntArray598[anInt10503++] = aClass166_7.aBoolean414 ? 1 : 0;
											return;
										}
										if (arg0 == 3704) {
											anIntArray598[anInt10503++] = aClass166_7.aByte72;
											return;
										}
										if (arg0 == 3705) {
											anIntArray598[anInt10503++] = aClass166_7.aByte70;
											return;
										}
										if (arg0 == 3706) {
											anIntArray598[anInt10503++] = aClass166_7.aByte71;
											return;
										}
										if (arg0 == 3707) {
											anIntArray598[anInt10503++] = aClass166_7.aByte73;
											return;
										}
										if (arg0 == 3709) {
											anIntArray598[anInt10503++] = aClass166_7.anInt4865;
											return;
										}
										if (arg0 == 3710) {
											local13 = anIntArray598[--anInt10503];
											aStringArray59[anInt10498++] = aClass166_7.aStringArray28[local13];
											return;
										}
										if (arg0 == 3711) {
											local13 = anIntArray598[--anInt10503];
											anIntArray598[anInt10503++] = aClass166_7.aByteArray43[local13];
											return;
										}
										if (arg0 == 3712) {
											anIntArray598[anInt10503++] = aClass166_7.anInt4857;
											return;
										}
										if (arg0 == 3713) {
											local13 = anIntArray598[--anInt10503];
											aStringArray59[anInt10498++] = aClass166_7.aStringArray29[local13];
											return;
										}
										if (arg0 == 3714) {
											anInt10503 -= 3;
											local13 = anIntArray598[anInt10503];
											local19 = anIntArray598[anInt10503 + 1];
											local25 = anIntArray598[anInt10503 + 2];
											anIntArray598[anInt10503++] = aClass166_7.method4107(local19, local13, local25);
											return;
										}
										if (arg0 == 3715) {
											anIntArray598[anInt10503++] = aClass166_7.anInt4866;
											return;
										}
										if (arg0 == 3716) {
											anIntArray598[anInt10503++] = aClass166_7.anInt4868;
											return;
										}
										if (arg0 == 3717) {
											anIntArray598[anInt10503++] = aClass166_7.method4089(aStringArray59[--anInt10498]);
											return;
										}
										if (arg0 == 3718) {
											anIntArray598[anInt10503 - 1] = aClass166_7.method4096()[anIntArray598[anInt10503 - 1]];
											return;
										}
										if (arg0 == 3750) {
											if (Static613.aClass5_Sub45_2 != null) {
												anIntArray598[anInt10503++] = 1;
												aClass5_Sub45_3 = Static613.aClass5_Sub45_2;
												return;
											}
											anIntArray598[anInt10503++] = 0;
											return;
										}
										if (arg0 == 3751) {
											if (Static494.aClass5_Sub45_1 != null) {
												anIntArray598[anInt10503++] = 1;
												aClass5_Sub45_3 = Static494.aClass5_Sub45_1;
												return;
											}
											anIntArray598[anInt10503++] = 0;
											return;
										}
										if (arg0 == 3752) {
											aStringArray59[anInt10498++] = aClass5_Sub45_3.aString75;
											return;
										}
										if (arg0 == 3753) {
											anIntArray598[anInt10503++] = aClass5_Sub45_3.aByte117;
											return;
										}
										if (arg0 == 3754) {
											anIntArray598[anInt10503++] = aClass5_Sub45_3.aByte116;
											return;
										}
										if (arg0 == 3755) {
											anIntArray598[anInt10503++] = aClass5_Sub45_3.anInt7909;
											return;
										}
										if (arg0 == 3756) {
											local13 = anIntArray598[--anInt10503];
											aStringArray59[anInt10498++] = aClass5_Sub45_3.aClass126Array1[local13].aString26;
											return;
										}
										if (arg0 == 3757) {
											local13 = anIntArray598[--anInt10503];
											anIntArray598[anInt10503++] = aClass5_Sub45_3.aClass126Array1[local13].aByte41;
											return;
										}
										if (arg0 == 3758) {
											local13 = anIntArray598[--anInt10503];
											anIntArray598[anInt10503++] = aClass5_Sub45_3.aClass126Array1[local13].anInt3599;
											return;
										}
										if (arg0 == 3759) {
											local13 = anIntArray598[--anInt10503];
											Static317.method4981(local13, aClass5_Sub45_3 == Static494.aClass5_Sub45_1);
											return;
										}
										if (arg0 == 3760) {
											anIntArray598[anInt10503++] = aClass5_Sub45_3.method6690(aStringArray59[--anInt10498]);
											return;
										}
										if (arg0 == 3761) {
											anIntArray598[anInt10503 - 1] = aClass5_Sub45_3.method6687()[anIntArray598[anInt10503 - 1]];
											return;
										}
									} else if (arg0 < 4000) {
										if (arg0 == 3903) {
											local13 = anIntArray598[--anInt10503];
											anIntArray598[anInt10503++] = Static277.aClass2Array1[local13].method23();
											return;
										}
										if (arg0 == 3904) {
											local13 = anIntArray598[--anInt10503];
											anIntArray598[anInt10503++] = Static277.aClass2Array1[local13].anInt10;
											return;
										}
										if (arg0 == 3905) {
											local13 = anIntArray598[--anInt10503];
											anIntArray598[anInt10503++] = Static277.aClass2Array1[local13].anInt8;
											return;
										}
										if (arg0 == 3906) {
											local13 = anIntArray598[--anInt10503];
											anIntArray598[anInt10503++] = Static277.aClass2Array1[local13].anInt5;
											return;
										}
										if (arg0 == 3907) {
											local13 = anIntArray598[--anInt10503];
											anIntArray598[anInt10503++] = Static277.aClass2Array1[local13].anInt6;
											return;
										}
										if (arg0 == 3908) {
											local13 = anIntArray598[--anInt10503];
											anIntArray598[anInt10503++] = Static277.aClass2Array1[local13].anInt9;
											return;
										}
										if (arg0 == 3910) {
											local13 = anIntArray598[--anInt10503];
											local19 = Static277.aClass2Array1[local13].method25();
											anIntArray598[anInt10503++] = local19 == 0 ? 1 : 0;
											return;
										}
										if (arg0 == 3911) {
											local13 = anIntArray598[--anInt10503];
											local19 = Static277.aClass2Array1[local13].method25();
											anIntArray598[anInt10503++] = local19 == 2 ? 1 : 0;
											return;
										}
										if (arg0 == 3912) {
											local13 = anIntArray598[--anInt10503];
											local19 = Static277.aClass2Array1[local13].method25();
											anIntArray598[anInt10503++] = local19 == 5 ? 1 : 0;
											return;
										}
										if (arg0 == 3913) {
											local13 = anIntArray598[--anInt10503];
											local19 = Static277.aClass2Array1[local13].method25();
											anIntArray598[anInt10503++] = local19 == 1 ? 1 : 0;
											return;
										}
									} else {
										@Pc(8207) long local8207;
										if (arg0 < 4100) {
											if (arg0 == 4000) {
												anInt10503 -= 2;
												local13 = anIntArray598[anInt10503];
												local19 = anIntArray598[anInt10503 + 1];
												anIntArray598[anInt10503++] = local13 + local19;
												return;
											}
											if (arg0 == 4001) {
												anInt10503 -= 2;
												local13 = anIntArray598[anInt10503];
												local19 = anIntArray598[anInt10503 + 1];
												anIntArray598[anInt10503++] = local13 - local19;
												return;
											}
											if (arg0 == 4002) {
												anInt10503 -= 2;
												local13 = anIntArray598[anInt10503];
												local19 = anIntArray598[anInt10503 + 1];
												anIntArray598[anInt10503++] = local13 * local19;
												return;
											}
											if (arg0 == 4003) {
												anInt10503 -= 2;
												local13 = anIntArray598[anInt10503];
												local19 = anIntArray598[anInt10503 + 1];
												anIntArray598[anInt10503++] = local13 / local19;
												return;
											}
											if (arg0 == 4004) {
												local13 = anIntArray598[--anInt10503];
												anIntArray598[anInt10503++] = (int) (Math.random() * (double) local13);
												return;
											}
											if (arg0 == 4005) {
												local13 = anIntArray598[--anInt10503];
												anIntArray598[anInt10503++] = (int) (Math.random() * (double) (local13 + 1));
												return;
											}
											if (arg0 == 4006) {
												anInt10503 -= 5;
												local13 = anIntArray598[anInt10503];
												local19 = anIntArray598[anInt10503 + 1];
												local25 = anIntArray598[anInt10503 + 2];
												local357 = anIntArray598[anInt10503 + 3];
												local2473 = anIntArray598[anInt10503 + 4];
												anIntArray598[anInt10503++] = local13 + (local19 - local13) * (local2473 - local25) / (local357 - local25);
												return;
											}
											@Pc(8214) long local8214;
											if (arg0 == 4007) {
												anInt10503 -= 2;
												local8207 = (long) anIntArray598[anInt10503];
												local8214 = (long) anIntArray598[anInt10503 + 1];
												anIntArray598[anInt10503++] = (int) (local8207 + local8207 * local8214 / 100L);
												return;
											}
											if (arg0 == 4008) {
												anInt10503 -= 2;
												local13 = anIntArray598[anInt10503];
												local19 = anIntArray598[anInt10503 + 1];
												anIntArray598[anInt10503++] = local13 | 0x1 << local19;
												return;
											}
											if (arg0 == 4009) {
												anInt10503 -= 2;
												local13 = anIntArray598[anInt10503];
												local19 = anIntArray598[anInt10503 + 1];
												anIntArray598[anInt10503++] = local13 & -(0x1 << local19) - 1;
												return;
											}
											if (arg0 == 4010) {
												anInt10503 -= 2;
												local13 = anIntArray598[anInt10503];
												local19 = anIntArray598[anInt10503 + 1];
												anIntArray598[anInt10503++] = (local13 & 0x1 << local19) == 0 ? 0 : 1;
												return;
											}
											if (arg0 == 4011) {
												anInt10503 -= 2;
												local13 = anIntArray598[anInt10503];
												local19 = anIntArray598[anInt10503 + 1];
												anIntArray598[anInt10503++] = local13 % local19;
												return;
											}
											if (arg0 == 4012) {
												anInt10503 -= 2;
												local13 = anIntArray598[anInt10503];
												local19 = anIntArray598[anInt10503 + 1];
												if (local13 == 0) {
													anIntArray598[anInt10503++] = 0;
													return;
												}
												anIntArray598[anInt10503++] = (int) Math.pow((double) local13, (double) local19);
												return;
											}
											if (arg0 == 4013) {
												anInt10503 -= 2;
												local13 = anIntArray598[anInt10503];
												local19 = anIntArray598[anInt10503 + 1];
												if (local13 == 0) {
													anIntArray598[anInt10503++] = 0;
													return;
												}
												if (local19 == 0) {
													anIntArray598[anInt10503++] = Integer.MAX_VALUE;
													return;
												}
												anIntArray598[anInt10503++] = (int) Math.pow((double) local13, 1.0D / (double) local19);
												return;
											}
											if (arg0 == 4014) {
												anInt10503 -= 2;
												local13 = anIntArray598[anInt10503];
												local19 = anIntArray598[anInt10503 + 1];
												anIntArray598[anInt10503++] = local13 & local19;
												return;
											}
											if (arg0 == 4015) {
												anInt10503 -= 2;
												local13 = anIntArray598[anInt10503];
												local19 = anIntArray598[anInt10503 + 1];
												anIntArray598[anInt10503++] = local13 | local19;
												return;
											}
											if (arg0 == 4016) {
												anInt10503 -= 2;
												local13 = anIntArray598[anInt10503];
												local19 = anIntArray598[anInt10503 + 1];
												anIntArray598[anInt10503++] = local13 < local19 ? local13 : local19;
												return;
											}
											if (arg0 == 4017) {
												anInt10503 -= 2;
												local13 = anIntArray598[anInt10503];
												local19 = anIntArray598[anInt10503 + 1];
												anIntArray598[anInt10503++] = local13 > local19 ? local13 : local19;
												return;
											}
											if (arg0 == 4018) {
												anInt10503 -= 3;
												local8207 = (long) anIntArray598[anInt10503];
												local8214 = (long) anIntArray598[anInt10503 + 1];
												@Pc(8595) long local8595 = (long) anIntArray598[anInt10503 + 2];
												anIntArray598[anInt10503++] = (int) (local8207 * local8595 / local8214);
												return;
											}
											if (arg0 == 4019) {
												anInt10503 -= 2;
												local13 = anIntArray598[anInt10503];
												local19 = anIntArray598[anInt10503 + 1];
												if (local13 > 700 || local19 > 700) {
													anIntArray598[anInt10503++] = 256;
												}
												@Pc(8654) double local8654 = (Math.random() * (double) (local19 + local13) + 800.0D - (double) local13) / 100.0D;
												anIntArray598[anInt10503++] = (int) (Math.pow(2.0D, local8654) + 0.5D);
												return;
											}
											if (arg0 == 4020) {
												local13 = anIntArray598[--anInt10503];
												anIntArray598[anInt10503++] = Static378.anIntArray380[Static297.method4770(local13) & 0xFFFF];
												return;
											}
										} else if (arg0 < 4200) {
											if (arg0 == 4100) {
												local4177 = aStringArray59[--anInt10498];
												local19 = anIntArray598[--anInt10503];
												aStringArray59[anInt10498++] = local4177 + local19;
												return;
											}
											if (arg0 == 4101) {
												anInt10498 -= 2;
												local4177 = aStringArray59[anInt10498];
												local1161 = aStringArray59[anInt10498 + 1];
												aStringArray59[anInt10498++] = local4177 + local1161;
												return;
											}
											if (arg0 == 4102) {
												local4177 = aStringArray59[--anInt10498];
												local19 = anIntArray598[--anInt10503];
												aStringArray59[anInt10498++] = local4177 + Static239.method3753(local19, true);
												return;
											}
											if (arg0 == 4103) {
												local4177 = aStringArray59[--anInt10498];
												aStringArray59[anInt10498++] = local4177.toLowerCase();
												return;
											}
											if (arg0 == 4104) {
												aStringArray59[anInt10498++] = Static11.method171(Static644.method8661(anIntArray598[--anInt10503]), Static544.anInt8937);
												return;
											}
											if (arg0 == 4105) {
												anInt10498 -= 2;
												local4177 = aStringArray59[anInt10498];
												local1161 = aStringArray59[anInt10498 + 1];
												if (Static382.aClass28_Sub1_Sub4_Sub2_Sub2_1.aClass213_1 != null && Static382.aClass28_Sub1_Sub4_Sub2_Sub2_1.aClass213_1.aBoolean552) {
													aStringArray59[anInt10498++] = local1161;
													return;
												}
												aStringArray59[anInt10498++] = local4177;
												return;
											}
											if (arg0 == 4106) {
												local13 = anIntArray598[--anInt10503];
												aStringArray59[anInt10498++] = Integer.toString(local13);
												return;
											}
											if (arg0 == 4107) {
												anInt10498 -= 2;
												anIntArray598[anInt10503++] = Static578.method7998(aStringArray59[anInt10498], Static544.anInt8937, aStringArray59[anInt10498 + 1]);
												return;
											}
											@Pc(8967) Class247 local8967;
											if (arg0 == 4108) {
												local4177 = aStringArray59[--anInt10498];
												anInt10503 -= 2;
												local19 = anIntArray598[anInt10503];
												local25 = anIntArray598[anInt10503 + 1];
												local8967 = Static244.method4626(Static536.aClass390_104, local25);
												anIntArray598[anInt10503++] = local8967.method5766(local19, local4177, Static366.aClass50Array9);
												return;
											}
											if (arg0 == 4109) {
												local4177 = aStringArray59[--anInt10498];
												anInt10503 -= 2;
												local19 = anIntArray598[anInt10503];
												local25 = anIntArray598[anInt10503 + 1];
												local8967 = Static244.method4626(Static536.aClass390_104, local25);
												anIntArray598[anInt10503++] = local8967.method5769(local4177, Static366.aClass50Array9, local19);
												return;
											}
											if (arg0 == 4110) {
												anInt10498 -= 2;
												local4177 = aStringArray59[anInt10498];
												local1161 = aStringArray59[anInt10498 + 1];
												if (anIntArray598[--anInt10503] == 1) {
													aStringArray59[anInt10498++] = local4177;
													return;
												}
												aStringArray59[anInt10498++] = local1161;
												return;
											}
											if (arg0 == 4111) {
												local4177 = aStringArray59[--anInt10498];
												aStringArray59[anInt10498++] = Static192.method3183(local4177);
												return;
											}
											if (arg0 == 4112) {
												local4177 = aStringArray59[--anInt10498];
												local19 = anIntArray598[--anInt10503];
												if (local19 == -1) {
													throw new RuntimeException("null char");
												}
												aStringArray59[anInt10498++] = local4177 + (char) local19;
												return;
											}
											if (arg0 == 4113) {
												local13 = anIntArray598[--anInt10503];
												anIntArray598[anInt10503++] = method8730((char) local13);
												return;
											}
											if (arg0 == 4114) {
												local13 = anIntArray598[--anInt10503];
												anIntArray598[anInt10503++] = Static243.method3798((char) local13) ? 1 : 0;
												return;
											}
											if (arg0 == 4115) {
												local13 = anIntArray598[--anInt10503];
												anIntArray598[anInt10503++] = Static301.method4799((char) local13) ? 1 : 0;
												return;
											}
											if (arg0 == 4116) {
												local13 = anIntArray598[--anInt10503];
												anIntArray598[anInt10503++] = Static623.method8438((char) local13) ? 1 : 0;
												return;
											}
											if (arg0 == 4117) {
												local4177 = aStringArray59[--anInt10498];
												if (local4177 != null) {
													anIntArray598[anInt10503++] = local4177.length();
													return;
												}
												anIntArray598[anInt10503++] = 0;
												return;
											}
											if (arg0 == 4118) {
												local4177 = aStringArray59[--anInt10498];
												anInt10503 -= 2;
												local19 = anIntArray598[anInt10503];
												local25 = anIntArray598[anInt10503 + 1];
												aStringArray59[anInt10498++] = local4177.substring(local19, local25);
												return;
											}
											if (arg0 == 4119) {
												local4177 = aStringArray59[--anInt10498];
												@Pc(9325) StringBuffer local9325 = new StringBuffer(local4177.length());
												@Pc(9327) boolean local9327 = false;
												for (local357 = 0; local357 < local4177.length(); local357++) {
													@Pc(9334) char local9334 = local4177.charAt(local357);
													if (local9334 == '<') {
														local9327 = true;
													} else if (local9334 == '>') {
														local9327 = false;
													} else if (!local9327) {
														local9325.append(local9334);
													}
												}
												aStringArray59[anInt10498++] = local9325.toString();
												return;
											}
											if (arg0 == 4120) {
												local4177 = aStringArray59[--anInt10498];
												anInt10503 -= 2;
												local19 = anIntArray598[anInt10503];
												local25 = anIntArray598[anInt10503 + 1];
												anIntArray598[anInt10503++] = local4177.indexOf(local19, local25);
												return;
											}
											if (arg0 == 4121) {
												anInt10498 -= 2;
												local4177 = aStringArray59[anInt10498];
												local1161 = aStringArray59[anInt10498 + 1];
												local25 = anIntArray598[--anInt10503];
												anIntArray598[anInt10503++] = local4177.indexOf(local1161, local25);
												return;
											}
											if (arg0 == 4122) {
												local13 = anIntArray598[--anInt10503];
												anIntArray598[anInt10503++] = Character.toLowerCase((char) local13);
												return;
											}
											if (arg0 == 4123) {
												local13 = anIntArray598[--anInt10503];
												anIntArray598[anInt10503++] = Character.toUpperCase((char) local13);
												return;
											}
											if (arg0 == 4124) {
												local420 = anIntArray598[--anInt10503] != 0;
												local19 = anIntArray598[--anInt10503];
												aStringArray59[anInt10498++] = Static396.method5827(0, Static544.anInt8937, local420, (long) local19);
												return;
											}
											if (arg0 == 4125) {
												local4177 = aStringArray59[--anInt10498];
												local19 = anIntArray598[--anInt10503];
												@Pc(9548) Class247 local9548 = Static244.method4626(Static536.aClass390_104, local19);
												anIntArray598[anInt10503++] = local9548.method5764(local4177, Static366.aClass50Array9);
												return;
											}
											if (arg0 == 4126) {
												aStringArray59[anInt10498++] = Static443.method6453(Static544.anInt8937, (long) anIntArray598[--anInt10503] * 60000L) + " UTC";
												return;
											}
											if (arg0 == 4127) {
												local8207 = aLongArray24[--anInt10504];
												aStringArray59[anInt10498++] = local8207 == -1L ? "" : Long.toString(local8207, 36).toUpperCase();
												return;
											}
										} else if (arg0 < 4300) {
											if (arg0 == 4200) {
												local13 = anIntArray598[--anInt10503];
												aStringArray59[anInt10498++] = Static110.aClass105_1.method2659(local13).aString57;
												return;
											}
											@Pc(9671) Class238 local9671;
											if (arg0 == 4201) {
												anInt10503 -= 2;
												local13 = anIntArray598[anInt10503];
												local19 = anIntArray598[anInt10503 + 1];
												local9671 = Static110.aClass105_1.method2659(local13);
												if (local19 >= 1 && local19 <= 5 && local9671.aStringArray40[local19 - 1] != null) {
													aStringArray59[anInt10498++] = local9671.aStringArray40[local19 - 1];
													return;
												}
												aStringArray59[anInt10498++] = "";
												return;
											}
											if (arg0 == 4202) {
												anInt10503 -= 2;
												local13 = anIntArray598[anInt10503];
												local19 = anIntArray598[anInt10503 + 1];
												local9671 = Static110.aClass105_1.method2659(local13);
												if (local19 >= 1 && local19 <= 5 && local9671.aStringArray41[local19 - 1] != null) {
													aStringArray59[anInt10498++] = local9671.aStringArray41[local19 - 1];
													return;
												}
												aStringArray59[anInt10498++] = "";
												return;
											}
											if (arg0 == 4203) {
												local13 = anIntArray598[--anInt10503];
												anIntArray598[anInt10503++] = Static110.aClass105_1.method2659(local13).anInt6842;
												return;
											}
											if (arg0 == 4204) {
												local13 = anIntArray598[--anInt10503];
												anIntArray598[anInt10503++] = Static110.aClass105_1.method2659(local13).anInt6890 == 1 ? 1 : 0;
												return;
											}
											@Pc(9834) Class238 local9834;
											if (arg0 == 4205) {
												local13 = anIntArray598[--anInt10503];
												local9834 = Static110.aClass105_1.method2659(local13);
												if (local9834.anInt6852 == -1 && local9834.anInt6855 >= 0) {
													anIntArray598[anInt10503++] = local9834.anInt6855;
													return;
												}
												anIntArray598[anInt10503++] = local13;
												return;
											}
											if (arg0 == 4206) {
												local13 = anIntArray598[--anInt10503];
												local9834 = Static110.aClass105_1.method2659(local13);
												if (local9834.anInt6852 >= 0 && local9834.anInt6855 >= 0) {
													anIntArray598[anInt10503++] = local9834.anInt6855;
													return;
												}
												anIntArray598[anInt10503++] = local13;
												return;
											}
											if (arg0 == 4207) {
												local13 = anIntArray598[--anInt10503];
												anIntArray598[anInt10503++] = Static110.aClass105_1.method2659(local13).aBoolean599 ? 1 : 0;
												return;
											}
											if (arg0 == 4208) {
												anInt10503 -= 2;
												local13 = anIntArray598[anInt10503];
												local19 = anIntArray598[anInt10503 + 1];
												local3242 = Static191.aClass381_2.method8728(local19);
												if (local3242.method5642()) {
													aStringArray59[anInt10498++] = Static110.aClass105_1.method2659(local13).method5699(local19, local3242.aString56);
													return;
												}
												anIntArray598[anInt10503++] = Static110.aClass105_1.method2659(local13).method5687(local19, local3242.anInt6763);
												return;
											}
											if (arg0 == 4209) {
												anInt10503 -= 2;
												local13 = anIntArray598[anInt10503];
												local19 = anIntArray598[anInt10503 + 1] - 1;
												local9671 = Static110.aClass105_1.method2659(local13);
												if (local9671.anInt6880 == local19) {
													anIntArray598[anInt10503++] = local9671.anInt6874;
													return;
												}
												if (local9671.anInt6827 == local19) {
													anIntArray598[anInt10503++] = local9671.anInt6896;
													return;
												}
												anIntArray598[anInt10503++] = -1;
												return;
											}
											if (arg0 == 4210) {
												local4177 = aStringArray59[--anInt10498];
												local19 = anIntArray598[--anInt10503];
												Static512.method7297(local4177, local19 == 1);
												anIntArray598[anInt10503++] = Static227.anInt4175;
												return;
											}
											if (arg0 == 4211) {
												if (Static285.aShortArray74 != null && Static175.anInt3412 < Static227.anInt4175) {
													anIntArray598[anInt10503++] = Static285.aShortArray74[Static175.anInt3412++] & 0xFFFF;
													return;
												}
												anIntArray598[anInt10503++] = -1;
												return;
											}
											if (arg0 == 4212) {
												Static175.anInt3412 = 0;
												return;
											}
											if (arg0 == 4213) {
												local13 = anIntArray598[--anInt10503];
												anIntArray598[anInt10503++] = Static110.aClass105_1.method2659(local13).anInt6853;
												return;
											}
											if (arg0 == 4214) {
												local4177 = aStringArray59[--anInt10498];
												anInt10503 -= 3;
												local19 = anIntArray598[anInt10503];
												local25 = anIntArray598[anInt10503 + 1];
												local357 = anIntArray598[anInt10503 + 2];
												Static337.method5159(local4177, local357, local25, local19 == 1);
												anIntArray598[anInt10503++] = Static227.anInt4175;
												return;
											}
											if (arg0 == 4215) {
												anInt10498 -= 2;
												anInt10503 -= 2;
												local4177 = aStringArray59[anInt10498];
												local19 = anIntArray598[anInt10503];
												local25 = anIntArray598[anInt10503 + 1];
												@Pc(10233) String local10233 = aStringArray59[anInt10498 + 1];
												Static660.method8814(local4177, local19 == 1, local10233, local25);
												anIntArray598[anInt10503++] = Static227.anInt4175;
												return;
											}
										} else if (arg0 < 4400) {
											if (arg0 == 4300) {
												anInt10503 -= 2;
												local13 = anIntArray598[anInt10503];
												local19 = anIntArray598[anInt10503 + 1];
												local3242 = Static191.aClass381_2.method8728(local19);
												if (local3242.method5642()) {
													aStringArray59[anInt10498++] = Static231.aClass19_2.method274(local13).method3277(local19, local3242.aString56);
													return;
												}
												anIntArray598[anInt10503++] = Static231.aClass19_2.method274(local13).method3279(local3242.anInt6763, local19);
												return;
											}
										} else if (arg0 < 4500) {
											if (arg0 == 4400) {
												anInt10503 -= 2;
												local13 = anIntArray598[anInt10503];
												local19 = anIntArray598[anInt10503 + 1];
												local3242 = Static191.aClass381_2.method8728(local19);
												if (local3242.method5642()) {
													aStringArray59[anInt10498++] = Static568.aClass315_5.method7511(local13).method3914(local3242.aString56, local19);
													return;
												}
												anIntArray598[anInt10503++] = Static568.aClass315_5.method7511(local13).method3906(local3242.anInt6763, local19);
												return;
											}
										} else if (arg0 < 4600) {
											if (arg0 == 4500) {
												anInt10503 -= 2;
												local13 = anIntArray598[anInt10503];
												local19 = anIntArray598[anInt10503 + 1];
												local3242 = Static191.aClass381_2.method8728(local19);
												if (local3242.method5642()) {
													aStringArray59[anInt10498++] = Static73.aClass211_1.method5183(local13).method8403(local19, local3242.aString56);
													return;
												}
												anIntArray598[anInt10503++] = Static73.aClass211_1.method5183(local13).method8407(local3242.anInt6763, local19);
												return;
											}
										} else if (arg0 < 4700) {
											if (arg0 == 4600) {
												local13 = anIntArray598[--anInt10503];
												@Pc(10461) Class167 local10461 = Static299.aClass286_2.method6793(local13);
												if (local10461.anIntArray260 != null && local10461.anIntArray260.length > 0) {
													local25 = 0;
													local357 = local10461.anIntArray257[0];
													for (local2473 = 1; local2473 < local10461.anIntArray260.length; local2473++) {
														if (local10461.anIntArray257[local2473] > local357) {
															local25 = local2473;
															local357 = local10461.anIntArray257[local2473];
														}
													}
													anIntArray598[anInt10503++] = local10461.anIntArray260[local25];
													return;
												}
												anIntArray598[anInt10503++] = local10461.anInt4891;
												return;
											}
										} else if (arg0 < 4800) {
											if (arg0 == 4700) {
												anIntArray598[anInt10503++] = Static496.aBoolean706 ? 1 : 0;
												return;
											}
											if (arg0 == 4701) {
												local4177 = aStringArray59[--anInt10498];
												if (Static173.anInt3397 == 7 && Static273.anInt5015 == 0) {
													if (local4177.length() > 20) {
														Static219.aByte60 = -4;
														return;
													}
													Static219.aByte60 = -1;
													local4266 = Static64.method905(Static263.aClass49_1, Static357.aClass305_53);
													local4266.aClass5_Sub41_Sub2_1.method7798(0);
													local25 = local4266.aClass5_Sub41_Sub2_1.anInt9230;
													local4266.aClass5_Sub41_Sub2_1.method7854(local4177);
													local4266.aClass5_Sub41_Sub2_1.method7839(local4266.aClass5_Sub41_Sub2_1.anInt9230 - local25);
													Static495.method7092(local4266);
													return;
												}
												Static219.aByte60 = -5;
												return;
											}
											if (arg0 == 4702) {
												anIntArray598[anInt10503++] = Static219.aByte60;
												if (Static219.aByte60 != -1) {
													Static219.aByte60 = -6;
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
							local137 = Static264.method4120(anIntArray598[--anInt10503]);
						} else {
							local137 = arg1 ? aClass345_14 : aClass345_13;
						}
						if (arg0 == 1300) {
							local19 = anIntArray598[--anInt10503] - 1;
							if (local19 >= 0 && local19 <= 9) {
								local137.method8071(aStringArray59[--anInt10498], local19);
								return;
							}
							anInt10498--;
							return;
						}
						if (arg0 == 1301) {
							anInt10503 -= 2;
							local19 = anIntArray598[anInt10503];
							local25 = anIntArray598[anInt10503 + 1];
							if (local19 == -1 && local25 == -1) {
								local137.aClass345_12 = null;
								return;
							}
							local137.aClass345_12 = Static144.method2595(local19, local25);
							return;
						}
						if (arg0 == 1302) {
							local19 = anIntArray598[--anInt10503];
							if (local19 != Static225.anInt4138 && local19 != Static517.anInt8596 && local19 != Static613.anInt10014) {
								return;
							}
							local137.anInt9665 = local19;
							return;
						}
						if (arg0 == 1303) {
							local137.anInt9653 = anIntArray598[--anInt10503];
							return;
						}
						if (arg0 == 1304) {
							local137.anInt9592 = anIntArray598[--anInt10503];
							return;
						}
						if (arg0 == 1305) {
							local137.aString90 = aStringArray59[--anInt10498];
							return;
						}
						if (arg0 == 1306) {
							local137.aString92 = aStringArray59[--anInt10498];
							return;
						}
						if (arg0 == 1307) {
							local137.aStringArray54 = null;
							return;
						}
						if (arg0 == 1308) {
							local137.anInt9659 = anIntArray598[--anInt10503];
							local137.anInt9668 = anIntArray598[--anInt10503];
							return;
						}
						if (arg0 == 1309) {
							local19 = anIntArray598[--anInt10503];
							local25 = anIntArray598[--anInt10503];
							if (local25 >= 1 && local25 <= 10) {
								local137.method8073(local19, local25 - 1);
							}
							return;
						}
						if (arg0 == 1310) {
							local137.aString94 = aStringArray59[--anInt10498];
							return;
						}
						if (arg0 == 1311) {
							local137.anInt9609 = anIntArray598[--anInt10503];
							return;
						}
						if (arg0 == 1312 || arg0 == 1313) {
							if (arg0 == 1312) {
								anInt10503 -= 3;
								local19 = anIntArray598[anInt10503] - 1;
								local25 = anIntArray598[anInt10503 + 1];
								local357 = anIntArray598[anInt10503 + 2];
								if (local19 < 0 || local19 > 9) {
									throw new RuntimeException("IOR13121313");
								}
							} else {
								anInt10503 -= 2;
								local19 = 10;
								local25 = anIntArray598[anInt10503];
								local357 = anIntArray598[anInt10503 + 1];
							}
							if (local137.aByteArray96 == null) {
								if (local25 == 0) {
									return;
								}
								local137.aByteArray96 = new byte[11];
								local137.aByteArray97 = new byte[11];
								local137.anIntArray532 = new int[11];
							}
							local137.aByteArray96[local19] = (byte) local25;
							if (local25 == 0) {
								local137.aBoolean813 = false;
								for (local2473 = 0; local2473 < local137.aByteArray96.length; local2473++) {
									if (local137.aByteArray96[local2473] != 0) {
										local137.aBoolean813 = true;
										break;
									}
								}
							} else {
								local137.aBoolean813 = true;
							}
							local137.aByteArray97[local19] = (byte) local357;
							return;
						}
						if (arg0 == 1314) {
							local137.anInt9666 = anIntArray598[--anInt10503];
							return;
						}
					}
				} else {
					if (arg0 >= 2000) {
						arg0 -= 1000;
						local137 = Static264.method4120(anIntArray598[--anInt10503]);
					} else {
						local137 = arg1 ? aClass345_14 : aClass345_13;
					}
					Static211.method3351(local137);
					if (arg0 == 1200 || arg0 == 1205 || arg0 == 1208 || arg0 == 1209 || arg0 == 1212 || arg0 == 1213) {
						anInt10503 -= 2;
						local19 = anIntArray598[anInt10503];
						local25 = anIntArray598[anInt10503 + 1];
						if (local137.anInt9611 == -1) {
							Static397.method5840(local137.anInt9664);
							Static331.method5103(local137.anInt9664);
							Static550.method7643(local137.anInt9664);
						}
						if (local19 == -1) {
							local137.anInt9656 = 1;
							local137.anInt9624 = -1;
							local137.anInt9654 = -1;
							return;
						}
						local137.anInt9654 = local19;
						local137.anInt9585 = local25;
						if (arg0 == 1208 || arg0 == 1209) {
							local137.aBoolean817 = true;
						} else {
							local137.aBoolean817 = false;
						}
						@Pc(1813) Class238 local1813 = Static110.aClass105_1.method2659(local19);
						local137.anInt9662 = local1813.anInt6861;
						local137.anInt9623 = local1813.anInt6885;
						local137.anInt9633 = local1813.anInt6833;
						local137.anInt9581 = local1813.anInt6858;
						local137.anInt9667 = local1813.anInt6841;
						local137.anInt9663 = local1813.anInt6846;
						if (arg0 == 1205 || arg0 == 1209) {
							local137.anInt9652 = 0;
						} else if (arg0 == 1212 || arg0 == 1213) {
							local137.anInt9652 = 1;
						} else {
							local137.anInt9652 = 2;
						}
						if (local137.anInt9634 > 0) {
							local137.anInt9663 = local137.anInt9663 * 32 / local137.anInt9634;
							return;
						}
						if (local137.anInt9596 > 0) {
							local137.anInt9663 = local137.anInt9663 * 32 / local137.anInt9596;
						}
						return;
					}
					if (arg0 == 1201) {
						local137.anInt9656 = 2;
						local137.anInt9624 = anIntArray598[--anInt10503];
						if (local137.anInt9611 == -1) {
							Static489.method7018(local137.anInt9664);
						}
						return;
					}
					if (arg0 == 1202) {
						local137.anInt9656 = 3;
						local137.anInt9624 = -1;
						if (local137.anInt9611 == -1) {
							Static489.method7018(local137.anInt9664);
						}
						return;
					}
					if (arg0 == 1203) {
						local137.anInt9656 = 6;
						local137.anInt9624 = anIntArray598[--anInt10503];
						if (local137.anInt9611 == -1) {
							Static489.method7018(local137.anInt9664);
						}
						return;
					}
					if (arg0 == 1204) {
						local137.anInt9656 = 5;
						local137.anInt9624 = anIntArray598[--anInt10503];
						if (local137.anInt9611 == -1) {
							Static489.method7018(local137.anInt9664);
						}
						return;
					}
					if (arg0 == 1206) {
						anInt10503 -= 4;
						local137.anInt9595 = anIntArray598[anInt10503];
						local137.anInt9619 = anIntArray598[anInt10503 + 1];
						local137.anInt9610 = anIntArray598[anInt10503 + 2];
						local137.anInt9639 = anIntArray598[anInt10503 + 3];
						Static211.method3351(local137);
						return;
					}
					if (arg0 == 1207) {
						anInt10503 -= 2;
						local137.anInt9635 = anIntArray598[anInt10503];
						local137.anInt9640 = anIntArray598[anInt10503 + 1];
						Static211.method3351(local137);
						return;
					}
					if (arg0 == 1210) {
						anInt10503 -= 4;
						local137.anInt9624 = anIntArray598[anInt10503];
						local137.anInt9602 = anIntArray598[anInt10503 + 1];
						if (anIntArray598[anInt10503 + 2] == 1) {
							local137.anInt9656 = 9;
						} else {
							local137.anInt9656 = 8;
						}
						if (anIntArray598[anInt10503 + 3] == 1) {
							local137.aBoolean817 = true;
						} else {
							local137.aBoolean817 = false;
						}
						if (local137.anInt9611 == -1) {
							Static489.method7018(local137.anInt9664);
						}
						return;
					}
					if (arg0 == 1211) {
						local137.anInt9656 = 5;
						local137.anInt9624 = Static216.anInt4046;
						local137.anInt9602 = 0;
						if (local137.anInt9611 == -1) {
							Static489.method7018(local137.anInt9664);
						}
						return;
					}
				}
			}
		}
		throw new IllegalStateException(String.valueOf(arg0));
	}

	@OriginalMember(owner = "client!wca", name = "b", descriptor = "(I)I")
	private static int method8732(@OriginalArg(0) int arg0) {
		@Pc(4) Class357 local4 = Static667.aClass278_1.method6505(arg0);
		if (local4 == null) {
			throw new RuntimeException("sr-c113");
		}
		@Pc(26) Integer local26 = aClass166_7.method4105(local4.anInt10004, local4.anInt9999, Static218.aClass98_2.anInt2677 << 16 | local4.anInt10001);
		return local26 == null ? 0 : local26;
	}

	@OriginalMember(owner = "client!wca", name = "c", descriptor = "(I)Ljava/lang/String;")
	private static String method8733(@OriginalArg(0) int arg0) {
		@Pc(9) String local9 = aClass166_7.method4111(Static218.aClass98_2.anInt2677 << 16 | arg0);
		return local9 == null ? "" : local9;
	}

	@OriginalMember(owner = "client!wca", name = "b", descriptor = "(IZ)V")
	private static void method8734(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1) {
		@Pc(52) Class5_Sub21 local52;
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
				anIntArray598[anInt10503++] = Static99.anInt2173;
				return;
			}
			if (arg0 == 5001) {
				anInt10503 -= 3;
				Static99.anInt2173 = anIntArray598[anInt10503];
				Static567.aClass87_4 = Static170.method2960(anIntArray598[anInt10503 + 1]);
				if (Static567.aClass87_4 == null) {
					Static567.aClass87_4 = Static329.aClass87_3;
				}
				Static114.anInt2368 = anIntArray598[anInt10503 + 2];
				local52 = Static64.method905(Static263.aClass49_1, Static432.aClass305_66);
				local52.aClass5_Sub41_Sub2_1.method7798(Static99.anInt2173);
				local52.aClass5_Sub41_Sub2_1.method7798(Static567.aClass87_4.anInt2365);
				local52.aClass5_Sub41_Sub2_1.method7798(Static114.anInt2368);
				Static495.method7092(local52);
				return;
			}
			if (arg0 == 5002) {
				anInt10498 -= 2;
				local83 = aStringArray59[anInt10498];
				local89 = aStringArray59[anInt10498 + 1];
				anInt10503 -= 2;
				local97 = anIntArray598[anInt10503];
				local103 = anIntArray598[anInt10503 + 1];
				if (local89 == null) {
					local89 = "";
				}
				if (local89.length() > 80) {
					local89 = local89.substring(0, 80);
				}
				@Pc(125) Class5_Sub21 local125 = Static64.method905(Static263.aClass49_1, Static521.aClass305_82);
				local125.aClass5_Sub41_Sub2_1.method7798(Static314.method4952(local83) + Static314.method4952(local89) + 2);
				local125.aClass5_Sub41_Sub2_1.method7854(local83);
				local125.aClass5_Sub41_Sub2_1.method7798(local97 - 1);
				local125.aClass5_Sub41_Sub2_1.method7798(local103);
				local125.aClass5_Sub41_Sub2_1.method7854(local89);
				Static495.method7092(local125);
				return;
			}
			@Pc(179) Class374 local179;
			if (arg0 == 5003) {
				local175 = anIntArray598[--anInt10503];
				local179 = Static507.method7267(local175);
				local181 = "";
				if (local179 != null && local179.aString109 != null) {
					local181 = local179.aString109;
				}
				aStringArray59[anInt10498++] = local181;
				return;
			}
			if (arg0 == 5004) {
				local175 = anIntArray598[--anInt10503];
				local179 = Static507.method7267(local175);
				local97 = -1;
				if (local179 != null) {
					local97 = local179.anInt10400;
				}
				anIntArray598[anInt10503++] = local97;
				return;
			}
			if (arg0 == 5005) {
				if (Static567.aClass87_4 == null) {
					anIntArray598[anInt10503++] = -1;
					return;
				}
				anIntArray598[anInt10503++] = Static567.aClass87_4.anInt2365;
				return;
			}
			@Pc(269) Class5_Sub21 local269;
			if (arg0 == 5006) {
				local175 = anIntArray598[--anInt10503];
				local269 = Static64.method905(Static263.aClass49_1, Static513.aClass305_79);
				local269.aClass5_Sub41_Sub2_1.method7798(local175);
				Static495.method7092(local269);
				return;
			}
			if (arg0 == 5008) {
				local83 = aStringArray59[--anInt10498];
				method8738(local83, arg0);
				return;
			}
			if (arg0 == 5009) {
				anInt10498 -= 2;
				local83 = aStringArray59[anInt10498];
				local89 = aStringArray59[anInt10498 + 1];
				if (Static105.anInt2257 != 0 || (!Static185.aBoolean287 || Static373.aBoolean589) && !Static211.aBoolean327) {
					@Pc(328) Class5_Sub21 local328 = Static64.method905(Static263.aClass49_1, Static586.aClass305_94);
					local328.aClass5_Sub41_Sub2_1.method7798(0);
					local103 = local328.aClass5_Sub41_Sub2_1.anInt9230;
					local328.aClass5_Sub41_Sub2_1.method7854(local83);
					Static415.method6168(local328.aClass5_Sub41_Sub2_1, local89);
					local328.aClass5_Sub41_Sub2_1.method7839(local328.aClass5_Sub41_Sub2_1.anInt9230 - local103);
					Static495.method7092(local328);
					return;
				}
				return;
			}
			if (arg0 == 5010) {
				local175 = anIntArray598[--anInt10503];
				local179 = Static507.method7267(local175);
				local181 = "";
				if (local179 != null && local179.aString112 != null) {
					local181 = local179.aString112;
				}
				aStringArray59[anInt10498++] = local181;
				return;
			}
			if (arg0 == 5011) {
				local175 = anIntArray598[--anInt10503];
				local179 = Static507.method7267(local175);
				local181 = "";
				if (local179 != null && local179.aString108 != null) {
					local181 = local179.aString108;
				}
				aStringArray59[anInt10498++] = local181;
				return;
			}
			if (arg0 == 5012) {
				local175 = anIntArray598[--anInt10503];
				local179 = Static507.method7267(local175);
				local97 = -1;
				if (local179 != null) {
					local97 = local179.anInt10398;
				}
				anIntArray598[anInt10503++] = local97;
				return;
			}
			if (arg0 == 5015) {
				if (Static382.aClass28_Sub1_Sub4_Sub2_Sub2_1 == null || Static382.aClass28_Sub1_Sub4_Sub2_Sub2_1.aString44 == null) {
					local83 = "";
				} else {
					local83 = Static382.aClass28_Sub1_Sub4_Sub2_Sub2_1.method4607();
				}
				aStringArray59[anInt10498++] = local83;
				return;
			}
			if (arg0 == 5016) {
				anIntArray598[anInt10503++] = Static114.anInt2368;
				return;
			}
			if (arg0 == 5017) {
				anIntArray598[anInt10503++] = Static84.method1812();
				return;
			}
			if (arg0 == 5018) {
				local175 = anIntArray598[--anInt10503];
				local179 = Static507.method7267(local175);
				local97 = 0;
				if (local179 != null) {
					local97 = local179.anInt10402;
				}
				anIntArray598[anInt10503++] = local97;
				return;
			}
			if (arg0 == 5019) {
				local175 = anIntArray598[--anInt10503];
				local179 = Static507.method7267(local175);
				local181 = "";
				if (local179 != null && local179.aString110 != null) {
					local181 = local179.aString110;
				}
				aStringArray59[anInt10498++] = local181;
				return;
			}
			if (arg0 == 5020) {
				if (Static382.aClass28_Sub1_Sub4_Sub2_Sub2_1 == null || Static382.aClass28_Sub1_Sub4_Sub2_Sub2_1.aString44 == null) {
					local83 = "";
				} else {
					local83 = Static382.aClass28_Sub1_Sub4_Sub2_Sub2_1.method4612();
				}
				aStringArray59[anInt10498++] = local83;
				return;
			}
			if (arg0 == 5023) {
				local175 = anIntArray598[--anInt10503];
				local179 = Static507.method7267(local175);
				local97 = -1;
				if (local179 != null) {
					local97 = local179.anInt10393;
				}
				anIntArray598[anInt10503++] = local97;
				return;
			}
			if (arg0 == 5024) {
				local175 = anIntArray598[--anInt10503];
				local179 = Static507.method7267(local175);
				local97 = -1;
				if (local179 != null) {
					local97 = local179.anInt10397;
				}
				anIntArray598[anInt10503++] = local97;
				return;
			}
			if (arg0 == 5025) {
				local175 = anIntArray598[--anInt10503];
				local179 = Static507.method7267(local175);
				local181 = "";
				if (local179 != null && local179.aString111 != null) {
					local181 = local179.aString111;
				}
				aStringArray59[anInt10498++] = local181;
				return;
			}
			if (arg0 == 5050) {
				local175 = anIntArray598[--anInt10503];
				aStringArray59[anInt10498++] = Static314.aClass174_1.method4246(local175).aString117;
				return;
			}
			@Pc(736) Class5_Sub3_Sub21 local736;
			if (arg0 == 5051) {
				local175 = anIntArray598[--anInt10503];
				local736 = Static314.aClass174_1.method4246(local175);
				if (local736.anIntArray591 == null) {
					anIntArray598[anInt10503++] = 0;
					return;
				}
				anIntArray598[anInt10503++] = local736.anIntArray591.length;
				return;
			}
			if (arg0 == 5052) {
				anInt10503 -= 2;
				local175 = anIntArray598[anInt10503];
				local776 = anIntArray598[anInt10503 + 1];
				@Pc(781) Class5_Sub3_Sub21 local781 = Static314.aClass174_1.method4246(local175);
				local103 = local781.anIntArray591[local776];
				anIntArray598[anInt10503++] = local103;
				return;
			}
			if (arg0 == 5053) {
				local175 = anIntArray598[--anInt10503];
				local736 = Static314.aClass174_1.method4246(local175);
				if (local736.anIntArray592 == null) {
					anIntArray598[anInt10503++] = 0;
					return;
				}
				anIntArray598[anInt10503++] = local736.anIntArray592.length;
				return;
			}
			if (arg0 == 5054) {
				anInt10503 -= 2;
				local175 = anIntArray598[anInt10503];
				local776 = anIntArray598[anInt10503 + 1];
				anIntArray598[anInt10503++] = Static314.aClass174_1.method4246(local175).anIntArray592[local776];
				return;
			}
			if (arg0 == 5055) {
				local175 = anIntArray598[--anInt10503];
				aStringArray59[anInt10498++] = Static502.aClass163_2.method3900(local175).method2141();
				return;
			}
			if (arg0 == 5056) {
				local175 = anIntArray598[--anInt10503];
				@Pc(907) Class5_Sub3_Sub2 local907 = Static502.aClass163_2.method3900(local175);
				if (local907.anIntArray85 == null) {
					anIntArray598[anInt10503++] = 0;
					return;
				}
				anIntArray598[anInt10503++] = local907.anIntArray85.length;
				return;
			}
			if (arg0 == 5057) {
				anInt10503 -= 2;
				local175 = anIntArray598[anInt10503];
				local776 = anIntArray598[anInt10503 + 1];
				anIntArray598[anInt10503++] = Static502.aClass163_2.method3900(local175).anIntArray85[local776];
				return;
			}
			if (arg0 == 5058) {
				aClass388_1 = new Class388();
				aClass388_1.anInt10678 = anIntArray598[--anInt10503];
				aClass388_1.aClass5_Sub3_Sub2_1 = Static502.aClass163_2.method3900(aClass388_1.anInt10678);
				aClass388_1.anIntArray606 = new int[aClass388_1.aClass5_Sub3_Sub2_1.method2140()];
				return;
			}
			if (arg0 == 5059) {
				local52 = Static64.method905(Static263.aClass49_1, Static402.aClass305_60);
				local52.aClass5_Sub41_Sub2_1.method7798(0);
				local776 = local52.aClass5_Sub41_Sub2_1.anInt9230;
				local52.aClass5_Sub41_Sub2_1.method7798(0);
				local52.aClass5_Sub41_Sub2_1.method7848(aClass388_1.anInt10678);
				aClass388_1.aClass5_Sub3_Sub2_1.method2142(local52.aClass5_Sub41_Sub2_1, aClass388_1.anIntArray606);
				local52.aClass5_Sub41_Sub2_1.method7839(local52.aClass5_Sub41_Sub2_1.anInt9230 - local776);
				Static495.method7092(local52);
				return;
			}
			if (arg0 == 5060) {
				local83 = aStringArray59[--anInt10498];
				local269 = Static64.method905(Static263.aClass49_1, Static572.aClass305_92);
				local269.aClass5_Sub41_Sub2_1.method7798(0);
				local97 = local269.aClass5_Sub41_Sub2_1.anInt9230;
				local269.aClass5_Sub41_Sub2_1.method7854(local83);
				local269.aClass5_Sub41_Sub2_1.method7848(aClass388_1.anInt10678);
				aClass388_1.aClass5_Sub3_Sub2_1.method2142(local269.aClass5_Sub41_Sub2_1, aClass388_1.anIntArray606);
				local269.aClass5_Sub41_Sub2_1.method7839(local269.aClass5_Sub41_Sub2_1.anInt9230 - local97);
				Static495.method7092(local269);
				return;
			}
			if (arg0 == 5061) {
				local52 = Static64.method905(Static263.aClass49_1, Static402.aClass305_60);
				local52.aClass5_Sub41_Sub2_1.method7798(0);
				local776 = local52.aClass5_Sub41_Sub2_1.anInt9230;
				local52.aClass5_Sub41_Sub2_1.method7798(1);
				local52.aClass5_Sub41_Sub2_1.method7848(aClass388_1.anInt10678);
				aClass388_1.aClass5_Sub3_Sub2_1.method2142(local52.aClass5_Sub41_Sub2_1, aClass388_1.anIntArray606);
				local52.aClass5_Sub41_Sub2_1.method7839(local52.aClass5_Sub41_Sub2_1.anInt9230 - local776);
				Static495.method7092(local52);
				return;
			}
			if (arg0 == 5062) {
				anInt10503 -= 2;
				local175 = anIntArray598[anInt10503];
				local776 = anIntArray598[anInt10503 + 1];
				anIntArray598[anInt10503++] = Static314.aClass174_1.method4246(local175).aCharArray16[local776];
				return;
			}
			if (arg0 == 5063) {
				anInt10503 -= 2;
				local175 = anIntArray598[anInt10503];
				local776 = anIntArray598[anInt10503 + 1];
				anIntArray598[anInt10503++] = Static314.aClass174_1.method4246(local175).aCharArray17[local776];
				return;
			}
			if (arg0 == 5064) {
				anInt10503 -= 2;
				local175 = anIntArray598[anInt10503];
				local776 = anIntArray598[anInt10503 + 1];
				if (local776 == -1) {
					anIntArray598[anInt10503++] = -1;
					return;
				}
				anIntArray598[anInt10503++] = Static314.aClass174_1.method4246(local175).method8692((char) local776);
				return;
			}
			if (arg0 == 5065) {
				anInt10503 -= 2;
				local175 = anIntArray598[anInt10503];
				local776 = anIntArray598[anInt10503 + 1];
				if (local776 == -1) {
					anIntArray598[anInt10503++] = -1;
					return;
				}
				anIntArray598[anInt10503++] = Static314.aClass174_1.method4246(local175).method8691((char) local776);
				return;
			}
			if (arg0 == 5066) {
				local175 = anIntArray598[--anInt10503];
				anIntArray598[anInt10503++] = Static502.aClass163_2.method3900(local175).method2140();
				return;
			}
			if (arg0 == 5067) {
				anInt10503 -= 2;
				local175 = anIntArray598[anInt10503];
				local776 = anIntArray598[anInt10503 + 1];
				local97 = Static502.aClass163_2.method3900(local175).method2134(local776).anInt3770;
				anIntArray598[anInt10503++] = local97;
				return;
			}
			if (arg0 == 5068) {
				anInt10503 -= 2;
				local175 = anIntArray598[anInt10503];
				local776 = anIntArray598[anInt10503 + 1];
				aClass388_1.anIntArray606[local175] = local776;
				return;
			}
			if (arg0 == 5069) {
				anInt10503 -= 2;
				local175 = anIntArray598[anInt10503];
				local776 = anIntArray598[anInt10503 + 1];
				aClass388_1.anIntArray606[local175] = local776;
				return;
			}
			if (arg0 == 5070) {
				anInt10503 -= 3;
				local175 = anIntArray598[anInt10503];
				local776 = anIntArray598[anInt10503 + 1];
				local97 = anIntArray598[anInt10503 + 2];
				@Pc(1448) Class5_Sub3_Sub2 local1448 = Static502.aClass163_2.method3900(local175);
				if (local1448.method2134(local776).anInt3770 != 0) {
					throw new RuntimeException("bad command");
				}
				anIntArray598[anInt10503++] = local1448.method2138(local97, local776);
				return;
			}
			if (arg0 == 5071) {
				local83 = aStringArray59[--anInt10498];
				local1496 = anIntArray598[--anInt10503] == 1;
				Static656.method8801(local83, local1496);
				anIntArray598[anInt10503++] = Static227.anInt4175;
				return;
			}
			if (arg0 == 5072) {
				if (Static285.aShortArray74 != null && Static175.anInt3412 < Static227.anInt4175) {
					anIntArray598[anInt10503++] = Static285.aShortArray74[Static175.anInt3412++] & 0xFFFF;
					return;
				}
				anIntArray598[anInt10503++] = -1;
				return;
			}
			if (arg0 == 5073) {
				Static175.anInt3412 = 0;
				return;
			}
			if (arg0 == 5074) {
				local52 = Static64.method905(Static263.aClass49_1, Static402.aClass305_60);
				local52.aClass5_Sub41_Sub2_1.method7798(0);
				local776 = local52.aClass5_Sub41_Sub2_1.anInt9230;
				local52.aClass5_Sub41_Sub2_1.method7798(2);
				local52.aClass5_Sub41_Sub2_1.method7848(aClass388_1.anInt10678);
				aClass388_1.aClass5_Sub3_Sub2_1.method2142(local52.aClass5_Sub41_Sub2_1, aClass388_1.anIntArray606);
				local52.aClass5_Sub41_Sub2_1.method7839(local52.aClass5_Sub41_Sub2_1.anInt9230 - local776);
				Static495.method7092(local52);
				return;
			}
			if (arg0 == 5075) {
				local52 = Static64.method905(Static263.aClass49_1, Static402.aClass305_60);
				local52.aClass5_Sub41_Sub2_1.method7798(0);
				local776 = local52.aClass5_Sub41_Sub2_1.anInt9230;
				local52.aClass5_Sub41_Sub2_1.method7798(3);
				local52.aClass5_Sub41_Sub2_1.method7848(aClass388_1.anInt10678);
				aClass388_1.aClass5_Sub3_Sub2_1.method2142(local52.aClass5_Sub41_Sub2_1, aClass388_1.anIntArray606);
				local52.aClass5_Sub41_Sub2_1.method7839(local52.aClass5_Sub41_Sub2_1.anInt9230 - local776);
				Static495.method7092(local52);
				return;
			}
		} else if (arg0 < 5200) {
			if (arg0 == 5100) {
				if (Static17.aClass252_1.method8818(86)) {
					anIntArray598[anInt10503++] = 1;
					return;
				}
				anIntArray598[anInt10503++] = 0;
				return;
			}
			if (arg0 == 5101) {
				if (Static17.aClass252_1.method8818(82)) {
					anIntArray598[anInt10503++] = 1;
					return;
				}
				anIntArray598[anInt10503++] = 0;
				return;
			}
			if (arg0 == 5102) {
				if (Static17.aClass252_1.method8818(81)) {
					anIntArray598[anInt10503++] = 1;
					return;
				}
				anIntArray598[anInt10503++] = 0;
				return;
			}
		} else {
			@Pc(2931) int local2931;
			@Pc(2205) boolean local2205;
			if (arg0 < 5300) {
				if (arg0 == 5200) {
					Static126.method2285(anIntArray598[--anInt10503]);
					return;
				}
				if (arg0 == 5201) {
					anIntArray598[anInt10503++] = Static142.method2501();
					return;
				}
				if (arg0 == 5205) {
					Static206.method3294(-1, anIntArray598[--anInt10503], false, -1);
					return;
				}
				@Pc(1794) Class5_Sub3_Sub16 local1794;
				if (arg0 == 5206) {
					local175 = anIntArray598[--anInt10503];
					local1794 = Static330.method684(local175 >> 14 & 0x3FFF, local175 & 0x3FFF);
					if (local1794 == null) {
						anIntArray598[anInt10503++] = -1;
						return;
					}
					anIntArray598[anInt10503++] = local1794.anInt8383;
					return;
				}
				@Pc(1827) Class5_Sub3_Sub16 local1827;
				if (arg0 == 5207) {
					local1827 = Static330.method673(anIntArray598[--anInt10503]);
					if (local1827 != null && local1827.aString79 != null) {
						aStringArray59[anInt10498++] = local1827.aString79;
						return;
					}
					aStringArray59[anInt10498++] = "";
					return;
				}
				if (arg0 == 5208) {
					anIntArray598[anInt10503++] = Static61.anInt944;
					anIntArray598[anInt10503++] = Static509.anInt8531;
					return;
				}
				if (arg0 == 5209) {
					anIntArray598[anInt10503++] = Static193.anInt3730 + Static330.anInt764;
					anIntArray598[anInt10503++] = Static241.anInt4462 + Static330.anInt759;
					return;
				}
				if (arg0 == 5210) {
					local175 = anIntArray598[--anInt10503];
					local1794 = Static330.method673(local175);
					if (local1794 == null) {
						anIntArray598[anInt10503++] = 0;
						anIntArray598[anInt10503++] = 0;
						return;
					}
					anIntArray598[anInt10503++] = local1794.anInt8384 >> 14 & 0x3FFF;
					anIntArray598[anInt10503++] = local1794.anInt8384 & 0x3FFF;
					return;
				}
				if (arg0 == 5211) {
					local175 = anIntArray598[--anInt10503];
					local1794 = Static330.method673(local175);
					if (local1794 == null) {
						anIntArray598[anInt10503++] = 0;
						anIntArray598[anInt10503++] = 0;
						return;
					}
					anIntArray598[anInt10503++] = local1794.anInt8372 - local1794.anInt8378;
					anIntArray598[anInt10503++] = local1794.anInt8374 - local1794.anInt8385;
					return;
				}
				@Pc(2017) Class5_Sub36 local2017;
				if (arg0 == 5212) {
					local2017 = Static404.method5944();
					if (local2017 == null) {
						anIntArray598[anInt10503++] = -1;
						anIntArray598[anInt10503++] = -1;
						return;
					}
					anIntArray598[anInt10503++] = local2017.anInt5984;
					local776 = local2017.anInt5986 << 28 | local2017.anInt5981 + Static330.anInt764 << 14 | local2017.anInt5983 + Static330.anInt759;
					anIntArray598[anInt10503++] = local776;
					return;
				}
				if (arg0 == 5213) {
					local2017 = Static242.method3778();
					if (local2017 == null) {
						anIntArray598[anInt10503++] = -1;
						anIntArray598[anInt10503++] = -1;
						return;
					}
					anIntArray598[anInt10503++] = local2017.anInt5984;
					local776 = local2017.anInt5986 << 28 | local2017.anInt5981 + Static330.anInt764 << 14 | local2017.anInt5983 + Static330.anInt759;
					anIntArray598[anInt10503++] = local776;
					return;
				}
				@Pc(2165) boolean local2165;
				if (arg0 == 5214) {
					local175 = anIntArray598[--anInt10503];
					local1794 = Static213.method8049();
					if (local1794 != null) {
						local2165 = local1794.method7166(local175 >> 28 & 0x3, local175 & 0x3FFF, local175 >> 14 & 0x3FFF, anIntArray596);
						if (local2165) {
							Static17.method235(anIntArray596[1], anIntArray596[2]);
						}
					}
					return;
				}
				if (arg0 == 5215) {
					anInt10503 -= 2;
					local175 = anIntArray598[anInt10503];
					local776 = anIntArray598[anInt10503 + 1];
					@Pc(2203) Class358 local2203 = Static330.method679(local175 >> 14 & 0x3FFF, local175 & 0x3FFF);
					local2205 = false;
					for (@Pc(2210) Class5_Sub3_Sub16 local2210 = (Class5_Sub3_Sub16) local2203.method8322(); local2210 != null; local2210 = (Class5_Sub3_Sub16) local2203.method8328()) {
						if (local2210.anInt8383 == local776) {
							local2205 = true;
							break;
						}
					}
					if (local2205) {
						anIntArray598[anInt10503++] = 1;
						return;
					}
					anIntArray598[anInt10503++] = 0;
					return;
				}
				if (arg0 == 5218) {
					local175 = anIntArray598[--anInt10503];
					local1794 = Static330.method673(local175);
					if (local1794 == null) {
						anIntArray598[anInt10503++] = -1;
						return;
					}
					anIntArray598[anInt10503++] = local1794.anInt8377;
					return;
				}
				if (arg0 == 5220) {
					anIntArray598[anInt10503++] = Static500.anInt8324 == 100 ? 1 : 0;
					return;
				}
				if (arg0 == 5221) {
					local175 = anIntArray598[--anInt10503];
					Static17.method235(local175 >> 14 & 0x3FFF, local175 & 0x3FFF);
					return;
				}
				if (arg0 == 5222) {
					local1827 = Static213.method8049();
					if (local1827 != null) {
						local1496 = local1827.method7162(anIntArray596, Static193.anInt3730 + Static330.anInt764, Static241.anInt4462 + Static330.anInt759);
						if (local1496) {
							anIntArray598[anInt10503++] = anIntArray596[1];
							anIntArray598[anInt10503++] = anIntArray596[2];
							return;
						}
						anIntArray598[anInt10503++] = -1;
						anIntArray598[anInt10503++] = -1;
						return;
					}
					anIntArray598[anInt10503++] = -1;
					anIntArray598[anInt10503++] = -1;
					return;
				}
				if (arg0 == 5223) {
					anInt10503 -= 2;
					local175 = anIntArray598[anInt10503];
					local776 = anIntArray598[anInt10503 + 1];
					Static206.method3294(local776 >> 14 & 0x3FFF, local175, false, local776 & 0x3FFF);
					return;
				}
				if (arg0 == 5224) {
					local175 = anIntArray598[--anInt10503];
					local1794 = Static213.method8049();
					if (local1794 != null) {
						local2165 = local1794.method7166(local175 >> 28 & 0x3, local175 & 0x3FFF, local175 >> 14 & 0x3FFF, anIntArray596);
						if (local2165) {
							anIntArray598[anInt10503++] = anIntArray596[1];
							anIntArray598[anInt10503++] = anIntArray596[2];
							return;
						}
						anIntArray598[anInt10503++] = -1;
						anIntArray598[anInt10503++] = -1;
						return;
					}
					anIntArray598[anInt10503++] = -1;
					anIntArray598[anInt10503++] = -1;
					return;
				}
				if (arg0 == 5225) {
					local175 = anIntArray598[--anInt10503];
					local1794 = Static213.method8049();
					if (local1794 != null) {
						local2165 = local1794.method7162(anIntArray596, local175 >> 14 & 0x3FFF, local175 & 0x3FFF);
						if (local2165) {
							anIntArray598[anInt10503++] = anIntArray596[1];
							anIntArray598[anInt10503++] = anIntArray596[2];
							return;
						}
						anIntArray598[anInt10503++] = -1;
						anIntArray598[anInt10503++] = -1;
						return;
					}
					anIntArray598[anInt10503++] = -1;
					anIntArray598[anInt10503++] = -1;
					return;
				}
				if (arg0 == 5226) {
					Static606.method8297(anIntArray598[--anInt10503]);
					return;
				}
				if (arg0 == 5227) {
					anInt10503 -= 2;
					local175 = anIntArray598[anInt10503];
					local776 = anIntArray598[anInt10503 + 1];
					Static206.method3294(local776 >> 14 & 0x3FFF, local175, true, local776 & 0x3FFF);
					return;
				}
				if (arg0 == 5228) {
					Static208.aBoolean319 = anIntArray598[--anInt10503] == 1;
					return;
				}
				if (arg0 == 5229) {
					anIntArray598[anInt10503++] = Static208.aBoolean319 ? 1 : 0;
					return;
				}
				if (arg0 == 5230) {
					local175 = anIntArray598[--anInt10503];
					Static484.method6876(local175);
					return;
				}
				@Pc(2723) Class5 local2723;
				if (arg0 == 5231) {
					anInt10503 -= 2;
					local175 = anIntArray598[anInt10503];
					local1496 = anIntArray598[anInt10503 + 1] == 1;
					if (Static217.aClass300_17 != null) {
						local2723 = Static217.aClass300_17.method7188((long) local175);
						if (local2723 != null && !local1496) {
							local2723.method9052();
							return;
						}
						if (local2723 == null && local1496) {
							local2723 = new Class5();
							Static217.aClass300_17.method7191(local2723, (long) local175);
						}
					}
					return;
				}
				@Pc(2765) Class5 local2765;
				if (arg0 == 5232) {
					local175 = anIntArray598[--anInt10503];
					if (Static217.aClass300_17 != null) {
						local2765 = Static217.aClass300_17.method7188((long) local175);
						anIntArray598[anInt10503++] = local2765 == null ? 0 : 1;
						return;
					}
					anIntArray598[anInt10503++] = 0;
					return;
				}
				if (arg0 == 5233) {
					anInt10503 -= 2;
					local175 = anIntArray598[anInt10503];
					local1496 = anIntArray598[anInt10503 + 1] == 1;
					if (Static478.aClass300_34 != null) {
						local2723 = Static478.aClass300_34.method7188((long) local175);
						if (local2723 != null && !local1496) {
							local2723.method9052();
							return;
						}
						if (local2723 == null && local1496) {
							local2723 = new Class5();
							Static478.aClass300_34.method7191(local2723, (long) local175);
						}
					}
					return;
				}
				if (arg0 == 5234) {
					local175 = anIntArray598[--anInt10503];
					if (Static478.aClass300_34 != null) {
						local2765 = Static478.aClass300_34.method7188((long) local175);
						anIntArray598[anInt10503++] = local2765 == null ? 0 : 1;
						return;
					}
					anIntArray598[anInt10503++] = 0;
					return;
				}
				if (arg0 == 5235) {
					anIntArray598[anInt10503++] = Static330.aClass5_Sub3_Sub16_2 == null ? -1 : Static330.aClass5_Sub3_Sub16_2.anInt8383;
					return;
				}
				if (arg0 == 5236) {
					anInt10503 -= 2;
					local175 = anIntArray598[anInt10503];
					local776 = anIntArray598[anInt10503 + 1];
					local97 = local776 >> 14 & 0x3FFF;
					local103 = local776 & 0x3FFF;
					local2931 = Static443.method6452(local175, local103, local97);
					if (local2931 < 0) {
						anIntArray598[anInt10503++] = -1;
						return;
					}
					anIntArray598[anInt10503++] = local2931;
					return;
				}
				if (arg0 == 5237) {
					Static90.method7611();
					return;
				}
			} else if (arg0 < 5400) {
				if (arg0 == 5300) {
					anInt10503 -= 2;
					local175 = anIntArray598[anInt10503];
					local776 = anIntArray598[anInt10503 + 1];
					Static279.method4512(local776, false, 3, local175);
					anIntArray598[anInt10503++] = Static625.aFrame3 == null ? 0 : 1;
					return;
				}
				if (arg0 == 5301) {
					if (Static625.aFrame3 != null) {
						Static279.method4512(-1, false, Static172.aClass5_Sub50_14.aClass12_Sub9_2.method2337(), -1);
					}
					return;
				}
				if (arg0 == 5302) {
					@Pc(3017) Class310[] local3017 = Static91.method1900();
					anIntArray598[anInt10503++] = local3017.length;
					return;
				}
				if (arg0 == 5303) {
					local175 = anIntArray598[--anInt10503];
					@Pc(3041) Class310[] local3041 = Static91.method1900();
					anIntArray598[anInt10503++] = local3041[local175].anInt8744;
					anIntArray598[anInt10503++] = local3041[local175].anInt8743;
					return;
				}
				if (arg0 == 5305) {
					local175 = Static222.anInt4110;
					local776 = Static236.anInt4292;
					local97 = -1;
					@Pc(3076) Class310[] local3076 = Static91.method1900();
					for (local2931 = 0; local2931 < local3076.length; local2931++) {
						@Pc(3083) Class310 local3083 = local3076[local2931];
						if (local3083.anInt8744 == local175 && local3083.anInt8743 == local776) {
							local97 = local2931;
							break;
						}
					}
					anIntArray598[anInt10503++] = local97;
					return;
				}
				if (arg0 == 5306) {
					anIntArray598[anInt10503++] = Static469.method6688();
					return;
				}
				if (arg0 == 5307) {
					local175 = anIntArray598[--anInt10503];
					if (local175 >= 1 && local175 <= 2) {
						Static279.method4512(-1, false, local175, -1);
						return;
					}
					return;
				}
				if (arg0 == 5308) {
					anIntArray598[anInt10503++] = Static172.aClass5_Sub50_14.aClass12_Sub9_2.method2337();
					return;
				}
				if (arg0 == 5309) {
					local175 = anIntArray598[--anInt10503];
					if (local175 >= 1 && local175 <= 2) {
						Static172.aClass5_Sub50_14.method7531(local175, Static172.aClass5_Sub50_14.aClass12_Sub9_2);
						Static172.aClass5_Sub50_14.method7531(local175, Static172.aClass5_Sub50_14.aClass12_Sub9_1);
						Static102.method1995();
						return;
					}
					return;
				}
			} else {
				@Pc(3369) int local3369;
				if (arg0 < 5500) {
					if (arg0 == 5400) {
						anInt10498 -= 2;
						local83 = aStringArray59[anInt10498];
						local89 = aStringArray59[anInt10498 + 1];
						local97 = anIntArray598[--anInt10503];
						@Pc(3231) Class5_Sub21 local3231 = Static64.method905(Static263.aClass49_1, Static28.aClass305_8);
						local3231.aClass5_Sub41_Sub2_1.method7798(Static314.method4952(local83) + Static314.method4952(local89) + 1);
						local3231.aClass5_Sub41_Sub2_1.method7854(local83);
						local3231.aClass5_Sub41_Sub2_1.method7854(local89);
						local3231.aClass5_Sub41_Sub2_1.method7798(local97);
						Static495.method7092(local3231);
						return;
					}
					if (arg0 == 5401) {
						anInt10503 -= 2;
						Static607.aShortArray91[anIntArray598[anInt10503]] = (short) Static104.method2030(anIntArray598[anInt10503 + 1]);
						Static110.aClass105_1.method2645();
						Static110.aClass105_1.method2647();
						Static231.aClass19_2.method277();
						Static283.method4543();
						return;
					}
					if (arg0 == 5405) {
						anInt10503 -= 2;
						local175 = anIntArray598[anInt10503];
						local776 = anIntArray598[anInt10503 + 1];
						if (local175 >= 0 && local175 < 2) {
							Static305.anIntArrayArrayArray24[local175] = new int[local776 << 1][4];
						}
						return;
					}
					if (arg0 == 5406) {
						anInt10503 -= 7;
						local175 = anIntArray598[anInt10503];
						local776 = anIntArray598[anInt10503 + 1] << 1;
						local97 = anIntArray598[anInt10503 + 2];
						local103 = anIntArray598[anInt10503 + 3];
						local2931 = anIntArray598[anInt10503 + 4];
						local3369 = anIntArray598[anInt10503 + 5];
						@Pc(3375) int local3375 = anIntArray598[anInt10503 + 6];
						if (local175 >= 0 && local175 < 2 && Static305.anIntArrayArrayArray24[local175] != null && local776 >= 0 && local776 < Static305.anIntArrayArrayArray24[local175].length) {
							Static305.anIntArrayArrayArray24[local175][local776] = new int[] { (local97 >> 14 & 0x3FFF) << 9, local103 << 2, (local97 & 0x3FFF) << 9, local3375 };
							Static305.anIntArrayArrayArray24[local175][local776 + 1] = new int[] { (local2931 >> 14 & 0x3FFF) << 9, local3369 << 2, (local2931 & 0x3FFF) << 9 };
						}
						return;
					}
					if (arg0 == 5407) {
						local175 = Static305.anIntArrayArrayArray24[anIntArray598[--anInt10503]].length >> 1;
						anIntArray598[anInt10503++] = local175;
						return;
					}
					if (arg0 == 5411) {
						if (Static625.aFrame3 != null) {
							Static279.method4512(-1, false, Static172.aClass5_Sub50_14.aClass12_Sub9_2.method2337(), -1);
						}
						if (Static147.aFrame1 != null) {
							Static431.method6343();
							System.exit(0);
							return;
						}
						local83 = Static587.aString93 == null ? Static544.method7593() : Static587.aString93;
						Static520.method7365(Static172.aClass5_Sub50_14.aClass12_Sub16_2.method3616() == 1, false, Static570.aClass268_5, local83);
						return;
					}
					if (arg0 == 5419) {
						local83 = "";
						if (Static120.aClass331_2 != null) {
							if (Static120.aClass331_2.anObject20 == null) {
								local83 = Static126.method2277(Static120.aClass331_2.anInt9110);
							} else {
								local83 = (String) Static120.aClass331_2.anObject20;
							}
						}
						aStringArray59[anInt10498++] = local83;
						return;
					}
					if (arg0 == 5420) {
						anIntArray598[anInt10503++] = Static570.aClass268_5.aBoolean644 ? 0 : 1;
						return;
					}
					if (arg0 == 5421) {
						if (Static625.aFrame3 != null) {
							Static279.method4512(-1, false, Static172.aClass5_Sub50_14.aClass12_Sub9_2.method2337(), -1);
						}
						local83 = aStringArray59[--anInt10498];
						local1496 = anIntArray598[--anInt10503] == 1;
						local181 = Static544.method7593() + local83;
						Static520.method7365(Static172.aClass5_Sub50_14.aClass12_Sub16_2.method3616() == 1, local1496, Static570.aClass268_5, local181);
						return;
					}
					if (arg0 == 5422) {
						anInt10498 -= 2;
						local83 = aStringArray59[anInt10498];
						local89 = aStringArray59[anInt10498 + 1];
						local97 = anIntArray598[--anInt10503];
						if (local83.length() > 0) {
							if (Static427.aStringArray44 == null) {
								Static427.aStringArray44 = new String[Static224.anIntArray207[Static218.aClass98_2.anInt2677]];
							}
							Static427.aStringArray44[local97] = local83;
						}
						if (local89.length() > 0) {
							if (Static329.aStringArray32 == null) {
								Static329.aStringArray32 = new String[Static224.anIntArray207[Static218.aClass98_2.anInt2677]];
							}
							Static329.aStringArray32[local97] = local89;
						}
						return;
					}
					if (arg0 == 5423) {
						System.out.println(aStringArray59[--anInt10498]);
						return;
					}
					if (arg0 == 5424) {
						anInt10503 -= 11;
						Static372.anInt6703 = anIntArray598[anInt10503];
						Static613.anInt10007 = anIntArray598[anInt10503 + 1];
						Static385.anInt6838 = anIntArray598[anInt10503 + 2];
						Static598.anInt9819 = anIntArray598[anInt10503 + 3];
						Static366.anInt6654 = anIntArray598[anInt10503 + 4];
						Static397.anInt7052 = anIntArray598[anInt10503 + 5];
						Static406.anInt7203 = anIntArray598[anInt10503 + 6];
						Static39.anInt650 = anIntArray598[anInt10503 + 7];
						Static477.anInt8037 = anIntArray598[anInt10503 + 8];
						Static311.anInt5917 = anIntArray598[anInt10503 + 9];
						Static507.anInt8519 = anIntArray598[anInt10503 + 10];
						Static257.aClass390_60.method8905(Static366.anInt6654);
						Static257.aClass390_60.method8905(Static397.anInt7052);
						Static257.aClass390_60.method8905(Static406.anInt7203);
						Static257.aClass390_60.method8905(Static39.anInt650);
						Static257.aClass390_60.method8905(Static477.anInt8037);
						Static417.aClass50_28 = null;
						Static363.aClass50_34 = null;
						Static655.aClass50_38 = null;
						Static100.aClass50_4 = null;
						Static631.aClass50_36 = null;
						Static169.aClass50_10 = null;
						Static113.aClass50_5 = null;
						Static56.aClass50_3 = null;
						Static375.aBoolean592 = true;
						return;
					}
					if (arg0 == 5425) {
						Static169.method2948();
						Static375.aBoolean592 = false;
						return;
					}
					if (arg0 == 5426) {
						anInt10503 -= 2;
						Static314.anInt5964 = anIntArray598[anInt10503];
						Static300.anInt10361 = anIntArray598[anInt10503 + 1];
						return;
					}
					if (arg0 == 5427) {
						anInt10503 -= 2;
						Static559.anInt9123 = anIntArray598[anInt10503 + 1];
						return;
					}
					if (arg0 == 5428) {
						anInt10503 -= 2;
						local175 = anIntArray598[anInt10503];
						local776 = anIntArray598[anInt10503 + 1];
						anIntArray598[anInt10503++] = Static286.method4618(local776, local175) ? 1 : 0;
						return;
					}
					if (arg0 == 5429) {
						Static527.method7439(false, aStringArray59[--anInt10498], false);
						return;
					}
					if (arg0 == 5430) {
						try {
							Static682.method3657("accountcreated", Static639.anApplet2);
							return;
						} catch (@Pc(3917) Throwable local3917) {
							return;
						}
					}
					if (arg0 == 5431) {
						try {
							Static682.method3657("accountcreatestarted", Static639.anApplet2);
							return;
						} catch (@Pc(3928) Throwable local3928) {
							return;
						}
					}
					if (arg0 == 5432) {
						local83 = "";
						if (Static458.aClipboard1 != null) {
							@Pc(3940) Transferable local3940 = Static458.aClipboard1.getContents((Object) null);
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
						aStringArray59[anInt10498++] = local83;
						return;
					}
					if (arg0 == 5433) {
						Static657.anInt10590 = anIntArray598[--anInt10503];
						return;
					}
					if (arg0 == 5435) {
						anIntArray598[anInt10503++] = Static361.aBoolean581 ? 1 : 0;
						return;
					}
				} else if (arg0 < 5600) {
					if (arg0 == 5500) {
						anInt10503 -= 4;
						local175 = anIntArray598[anInt10503];
						local776 = anIntArray598[anInt10503 + 1];
						local97 = anIntArray598[anInt10503 + 2];
						local103 = anIntArray598[anInt10503 + 3];
						Static272.method4241(local103, (local175 >> 14 & 0x3FFF) - Static153.anInt3147, false, local97, (local175 & 0x3FFF) - Static201.anInt3839, local776 << 2);
						return;
					}
					if (arg0 == 5501) {
						anInt10503 -= 4;
						local175 = anIntArray598[anInt10503];
						local776 = anIntArray598[anInt10503 + 1];
						local97 = anIntArray598[anInt10503 + 2];
						local103 = anIntArray598[anInt10503 + 3];
						Static87.method5157(local97, (local175 & 0x3FFF) - Static201.anInt3839, (local175 >> 14 & 0x3FFF) - Static153.anInt3147, local103, local776 << 2);
						return;
					}
					if (arg0 == 5502) {
						anInt10503 -= 6;
						local175 = anIntArray598[anInt10503];
						if (local175 >= 2) {
							throw new RuntimeException();
						}
						Static438.anInt7717 = local175;
						local776 = anIntArray598[anInt10503 + 1];
						if (local776 + 1 >= Static305.anIntArrayArrayArray24[Static438.anInt7717].length >> 1) {
							throw new RuntimeException();
						}
						Static249.anInt4559 = local776;
						Static311.anInt5916 = 0;
						Static311.anInt5914 = anIntArray598[anInt10503 + 2];
						Static376.anInt10480 = anIntArray598[anInt10503 + 3];
						local97 = anIntArray598[anInt10503 + 4];
						if (local97 >= 2) {
							throw new RuntimeException();
						}
						Static542.anInt6469 = local97;
						local103 = anIntArray598[anInt10503 + 5];
						if (local103 + 1 >= Static305.anIntArrayArrayArray24[Static542.anInt6469].length >> 1) {
							throw new RuntimeException();
						}
						Static403.anInt7771 = local103;
						Static660.anInt10605 = 3;
						Static493.anInt8261 = -1;
						Static513.anInt8562 = -1;
						return;
					}
					if (arg0 == 5503) {
						Static665.method7138();
						return;
					}
					if (arg0 == 5504) {
						anInt10503 -= 2;
						Static372.method5589(anIntArray598[anInt10503], anIntArray598[anInt10503 + 1]);
						return;
					}
					if (arg0 == 5505) {
						anIntArray598[anInt10503++] = (int) Static298.aFloat116 >> 3;
						return;
					}
					if (arg0 == 5506) {
						anIntArray598[anInt10503++] = (int) Static157.aFloat83 >> 3;
						return;
					}
					if (arg0 == 5507) {
						Static32.method462();
						return;
					}
					if (arg0 == 5508) {
						Static341.method5195();
						return;
					}
					if (arg0 == 5509) {
						Static329.method5090();
						return;
					}
					if (arg0 == 5510) {
						Static461.method6598();
						return;
					}
					if (arg0 == 5511) {
						local175 = anIntArray598[--anInt10503];
						local776 = local175 >> 14 & 0x3FFF;
						local97 = local175 & 0x3FFF;
						local776 -= Static153.anInt3147;
						if (local776 < 0) {
							local776 = 0;
						} else if (local776 >= Static201.anInt3834) {
							local776 = Static201.anInt3834;
						}
						local97 -= Static201.anInt3839;
						if (local97 < 0) {
							local97 = 0;
						} else if (local97 >= Static626.anInt10238) {
							local97 = Static626.anInt10238;
						}
						Static251.anInt4573 = (local776 << 9) + 256;
						Static599.anInt9833 = (local97 << 9) + 256;
						Static660.anInt10605 = 4;
						Static493.anInt8261 = -1;
						Static513.anInt8562 = -1;
						return;
					}
					if (arg0 == 5512) {
						Static34.method490();
						return;
					}
					if (arg0 == 5514) {
						Static483.anInt8098 = anIntArray598[--anInt10503];
						return;
					}
					if (arg0 == 5516) {
						anIntArray598[anInt10503++] = Static483.anInt8098;
						return;
					}
					if (arg0 == 5517) {
						local175 = anIntArray598[--anInt10503];
						if (local175 == -1) {
							local776 = local175 >> 14 & 0x3FFF;
							local97 = local175 & 0x3FFF;
							local776 -= Static153.anInt3147;
							if (local776 < 0) {
								local776 = 0;
							} else if (local776 >= Static201.anInt3834) {
								local776 = Static201.anInt3834;
							}
							local97 -= Static201.anInt3839;
							if (local97 < 0) {
								local97 = 0;
							} else if (local97 >= Static626.anInt10238) {
								local97 = Static626.anInt10238;
							}
							Static513.anInt8562 = (local776 << 9) + 256;
							Static493.anInt8261 = (local97 << 9) + 256;
							return;
						}
						Static513.anInt8562 = -1;
						Static493.anInt8261 = -1;
						return;
					}
				} else if (arg0 < 5700) {
					if (arg0 == 5600) {
						anInt10498 -= 2;
						local83 = aStringArray59[anInt10498];
						local89 = aStringArray59[anInt10498 + 1];
						local97 = anIntArray598[--anInt10503];
						if (local83.length() > 320) {
							return;
						}
						if (Static173.anInt3397 != 3) {
							return;
						}
						if (Static273.anInt5015 == 0 && Static83.anInt1914 == 0) {
							Static178.aString23 = local83;
							Static511.aString83 = local89;
							Static270.anInt4979 = local97;
							Static271.method4671(6);
							return;
						}
						return;
					}
					if (arg0 == 5601) {
						Static314.method4950();
						return;
					}
					if (arg0 == 5602) {
						if (Static273.anInt5015 == 0) {
							Static191.anInt3702 = -2;
							Static324.anInt9546 = -2;
						}
						return;
					}
					if (arg0 == 5604) {
						anInt10498--;
						if (Static173.anInt3397 != 3) {
							return;
						}
						if (Static273.anInt5015 == 0 && Static83.anInt1914 == 0) {
							Static1.method8273(aStringArray59[anInt10498]);
							return;
						}
						return;
					}
					if (arg0 == 5605) {
						anInt10498 -= 2;
						anInt10503 -= 2;
						if (Static173.anInt3397 != 3) {
							return;
						}
						if (Static273.anInt5015 == 0 && Static83.anInt1914 == 0) {
							Static243.method3794(anIntArray598[anInt10503], anIntArray598[anInt10503 + 1] == 1, aStringArray59[anInt10498], aStringArray59[anInt10498 + 1]);
							return;
						}
						return;
					}
					if (arg0 == 5606) {
						if (Static83.anInt1914 == 0) {
							Static345.anInt6331 = -2;
						}
						return;
					}
					if (arg0 == 5607) {
						anIntArray598[anInt10503++] = Static324.anInt9546;
						return;
					}
					if (arg0 == 5608) {
						anIntArray598[anInt10503++] = Static134.anInt1984;
						return;
					}
					if (arg0 == 5609) {
						anIntArray598[anInt10503++] = Static345.anInt6331;
						return;
					}
					if (arg0 == 5611) {
						anIntArray598[anInt10503++] = Static283.anInt5420;
						return;
					}
					if (arg0 == 5612) {
						local175 = anIntArray598[--anInt10503];
						if (Static173.anInt3397 != 7) {
							return;
						}
						if (Static273.anInt5015 == 0 && Static83.anInt1914 == 0) {
							if (Static12.aClass244_1 != null) {
								Static12.aClass244_1.method5753();
								Static12.aClass244_1 = null;
							}
							Static270.anInt4979 = local175;
							Static271.method4671(9);
							return;
						}
						return;
					}
					if (arg0 == 5613) {
						anIntArray598[anInt10503++] = Static324.anInt9546;
						return;
					}
					if (arg0 == 5615) {
						anInt10498 -= 2;
						local83 = aStringArray59[anInt10498];
						local89 = aStringArray59[anInt10498 + 1];
						if (local83.length() > 320) {
							return;
						}
						if (Static173.anInt3397 != 3) {
							return;
						}
						if (Static273.anInt5015 == 0 && Static83.anInt1914 == 0) {
							if (Static12.aClass244_1 != null) {
								Static12.aClass244_1.method5753();
								Static12.aClass244_1 = null;
							}
							Static178.aString23 = local83;
							Static511.aString83 = local89;
							Static271.method4671(5);
							return;
						}
						return;
					}
					if (arg0 == 5616) {
						Static628.method8487(false);
						return;
					}
					if (arg0 == 5617) {
						anIntArray598[anInt10503++] = Static191.anInt3702;
						return;
					}
					if (arg0 == 5618) {
						anInt10503--;
						return;
					}
					if (arg0 == 5619) {
						anInt10503--;
						return;
					}
					if (arg0 == 5620) {
						anIntArray598[anInt10503++] = 0;
						return;
					}
					if (arg0 == 5621) {
						anInt10498 -= 2;
						anInt10503 -= 2;
						return;
					}
					if (arg0 == 5622) {
						return;
					}
					if (arg0 == 5623) {
						if (Static360.aString55 != null) {
							anIntArray598[anInt10503++] = 1;
							return;
						}
						anIntArray598[anInt10503++] = 0;
						return;
					}
					if (arg0 == 5624) {
						anIntArray598[anInt10503++] = (int) (Static571.aLong266 >> 32);
						anIntArray598[anInt10503++] = (int) (Static571.aLong266 & 0xFFFFFFFFFFFFFFFFL);
						return;
					}
					if (arg0 == 5625) {
						anIntArray598[anInt10503++] = Static135.aBoolean234 ? 1 : 0;
						return;
					}
					if (arg0 == 5626) {
						Static135.aBoolean234 = true;
						Static468.method6678();
						return;
					}
				} else if (arg0 < 6100) {
					if (arg0 == 6001) {
						local175 = anIntArray598[--anInt10503];
						Static172.aClass5_Sub50_14.method7531(local175, Static172.aClass5_Sub50_14.aClass12_Sub22_1);
						Static248.method3851();
						Static102.method1995();
						Static244.aBoolean480 = false;
						return;
					}
					@Pc(4900) boolean local4900;
					if (arg0 == 6002) {
						local4900 = anIntArray598[--anInt10503] == 1;
						Static172.aClass5_Sub50_14.method7531(local4900 ? 1 : 0, Static172.aClass5_Sub50_14.aClass12_Sub8_1);
						Static172.aClass5_Sub50_14.method7531(local4900 ? 1 : 0, Static172.aClass5_Sub50_14.aClass12_Sub8_2);
						Static248.method3851();
						Static634.method8552();
						Static102.method1995();
						Static244.aBoolean480 = false;
						return;
					}
					if (arg0 == 6003) {
						local4900 = anIntArray598[--anInt10503] == 1;
						Static172.aClass5_Sub50_14.method7531(local4900 ? 2 : 1, Static172.aClass5_Sub50_14.aClass12_Sub13_1);
						Static172.aClass5_Sub50_14.method7531(local4900 ? 2 : 1, Static172.aClass5_Sub50_14.aClass12_Sub13_2);
						Static634.method8552();
						Static102.method1995();
						Static244.aBoolean480 = false;
						return;
					}
					if (arg0 == 6005) {
						Static172.aClass5_Sub50_14.method7531(anIntArray598[--anInt10503] == 1 ? 1 : 0, Static172.aClass5_Sub50_14.aClass12_Sub10_1);
						Static248.method3851();
						Static102.method1995();
						Static244.aBoolean480 = false;
						return;
					}
					if (arg0 == 6007) {
						Static172.aClass5_Sub50_14.method7531(anIntArray598[--anInt10503], Static172.aClass5_Sub50_14.aClass12_Sub11_1);
						Static102.method1995();
						Static244.aBoolean480 = false;
						return;
					}
					if (arg0 == 6008) {
						Static172.aClass5_Sub50_14.method7531(anIntArray598[--anInt10503] == 1 ? 1 : 0, Static172.aClass5_Sub50_14.aClass12_Sub19_1);
						Static102.method1995();
						Static244.aBoolean480 = false;
						return;
					}
					if (arg0 == 6010) {
						Static172.aClass5_Sub50_14.method7531(anIntArray598[--anInt10503] == 1 ? 1 : 0, Static172.aClass5_Sub50_14.aClass12_Sub18_1);
						Static102.method1995();
						Static244.aBoolean480 = false;
						return;
					}
					if (arg0 == 6011) {
						Static172.aClass5_Sub50_14.method7531(anIntArray598[--anInt10503], Static172.aClass5_Sub50_14.aClass12_Sub25_1);
						Static248.method3851();
						Static102.method1995();
						Static244.aBoolean480 = false;
						return;
					}
					if (arg0 == 6012) {
						Static172.aClass5_Sub50_14.method7531(anIntArray598[--anInt10503] == 1 ? 1 : 0, Static172.aClass5_Sub50_14.aClass12_Sub4_1);
						Static675.method9021();
						Static459.method6575();
						Static102.method1995();
						Static244.aBoolean480 = false;
						return;
					}
					if (arg0 == 6014) {
						Static172.aClass5_Sub50_14.method7531(anIntArray598[--anInt10503] == 1 ? 2 : 0, Static172.aClass5_Sub50_14.aClass12_Sub29_1);
						Static248.method3851();
						Static102.method1995();
						Static244.aBoolean480 = false;
						return;
					}
					if (arg0 == 6015) {
						Static172.aClass5_Sub50_14.method7531(anIntArray598[--anInt10503] == 1 ? 1 : 0, Static172.aClass5_Sub50_14.aClass12_Sub20_1);
						Static248.method3851();
						Static102.method1995();
						Static244.aBoolean480 = false;
						return;
					}
					if (arg0 == 6016) {
						Static172.aClass5_Sub50_14.method7531(anIntArray598[--anInt10503], Static172.aClass5_Sub50_14.aClass12_Sub6_1);
						Static428.method6321(Static172.aClass5_Sub50_14.aClass12_Sub16_2.method3616(), false);
						Static102.method1995();
						return;
					}
					if (arg0 == 6017) {
						Static172.aClass5_Sub50_14.method7531(anIntArray598[--anInt10503] == 1 ? 1 : 0, Static172.aClass5_Sub50_14.aClass12_Sub17_1);
						Static150.method2727();
						Static102.method1995();
						Static244.aBoolean480 = false;
						return;
					}
					if (arg0 == 6018) {
						Static172.aClass5_Sub50_14.method7531(anIntArray598[--anInt10503], Static172.aClass5_Sub50_14.aClass12_Sub7_4);
						Static102.method1995();
						Static244.aBoolean480 = false;
						return;
					}
					if (arg0 == 6019) {
						local175 = anIntArray598[--anInt10503];
						local776 = Static172.aClass5_Sub50_14.aClass12_Sub7_1.method2118();
						if (local175 != local776) {
							if (Static134.method1808(Static173.anInt3397)) {
								if (local776 == 0 && Static33.anInt545 != -1) {
									Static127.method2322(Static396.aClass390_82, local175, Static33.anInt545);
									Static481.method6852();
									Static569.aBoolean788 = false;
								} else if (local175 == 0) {
									Static194.method3230();
									Static569.aBoolean788 = false;
								} else {
									Static251.method3866(local175);
								}
							}
							Static172.aClass5_Sub50_14.method7531(local175, Static172.aClass5_Sub50_14.aClass12_Sub7_1);
							Static102.method1995();
							Static244.aBoolean480 = false;
						}
						return;
					}
					if (arg0 == 6020) {
						Static172.aClass5_Sub50_14.method7531(anIntArray598[--anInt10503], Static172.aClass5_Sub50_14.lb);
						Static102.method1995();
						Static244.aBoolean480 = false;
						return;
					}
					if (arg0 == 6021) {
						local175 = Static172.aClass5_Sub50_14.aClass12_Sub13_1.method3075();
						Static172.aClass5_Sub50_14.method7531(anIntArray598[--anInt10503] == 1 ? 0 : local175, Static172.aClass5_Sub50_14.aClass12_Sub13_2);
						Static634.method8552();
						return;
					}
					if (arg0 == 6023) {
						local175 = anIntArray598[--anInt10503];
						Static172.aClass5_Sub50_14.method7531(local175, Static172.aClass5_Sub50_14.aClass12_Sub28_1);
						Static102.method1995();
						Static244.aBoolean480 = false;
						return;
					}
					if (arg0 == 6024) {
						Static172.aClass5_Sub50_14.method7531(anIntArray598[--anInt10503], Static172.aClass5_Sub50_14.aClass12_Sub6_2);
						Static102.method1995();
						return;
					}
					if (arg0 == 6025) {
						Static172.aClass5_Sub50_14.method7531(anIntArray598[--anInt10503], Static172.aClass5_Sub50_14.aClass12_Sub1_1);
						Static102.method1995();
						Static244.aBoolean480 = false;
						return;
					}
					if (arg0 == 6027) {
						local175 = anIntArray598[--anInt10503];
						if (local175 < 0 || local175 > 1) {
							local175 = 0;
						}
						Static477.method6823(local175 == 1);
						return;
					}
					if (arg0 == 6028) {
						Static172.aClass5_Sub50_14.method7531(anIntArray598[--anInt10503] == 0 ? 0 : 1, Static172.aClass5_Sub50_14.aClass12_Sub23_1);
						Static102.method1995();
						return;
					}
					if (arg0 == 6029) {
						Static172.aClass5_Sub50_14.method7531(anIntArray598[--anInt10503], Static172.aClass5_Sub50_14.aClass12_Sub11_1);
						Static102.method1995();
						return;
					}
					if (arg0 == 6030) {
						Static172.aClass5_Sub50_14.method7531(anIntArray598[--anInt10503] == 0 ? 0 : 1, Static172.aClass5_Sub50_14.aClass12_Sub2_1);
						Static102.method1995();
						Static248.method3851();
						return;
					}
					if (arg0 == 6031) {
						local175 = anIntArray598[--anInt10503];
						if (local175 < 0 || local175 > 5) {
							local175 = 2;
						}
						Static428.method6321(local175, false);
						return;
					}
					if (arg0 == 6032) {
						anInt10503 -= 2;
						local175 = anIntArray598[anInt10503];
						local1496 = anIntArray598[anInt10503 + 1] == 1;
						Static172.aClass5_Sub50_14.method7531(local175, Static172.aClass5_Sub50_14.aClass12_Sub16_1);
						if (!local1496) {
							Static172.aClass5_Sub50_14.method7531(0, Static172.aClass5_Sub50_14.aClass12_Sub27_1);
						}
						Static102.method1995();
						Static244.aBoolean480 = false;
						return;
					}
					if (arg0 == 6033) {
						Static172.aClass5_Sub50_14.method7531(anIntArray598[--anInt10503], Static172.aClass5_Sub50_14.aClass12_Sub3_1);
						Static102.method1995();
						return;
					}
					if (arg0 == 6034) {
						Static172.aClass5_Sub50_14.method7531(anIntArray598[--anInt10503] == 1 ? 1 : 0, Static172.aClass5_Sub50_14.aClass12_Sub21_1);
						Static102.method1995();
						Static675.method9021();
						Static244.aBoolean480 = false;
						return;
					}
					if (arg0 == 6035) {
						local175 = Static172.aClass5_Sub50_14.aClass12_Sub8_1.method2213();
						Static172.aClass5_Sub50_14.method7531(anIntArray598[--anInt10503] == 1 ? 1 : local175, Static172.aClass5_Sub50_14.aClass12_Sub8_2);
						Static248.method3851();
						Static634.method8552();
						return;
					}
					if (arg0 == 6036) {
						Static172.aClass5_Sub50_14.method7531(anIntArray598[--anInt10503], Static172.aClass5_Sub50_14.aClass12_Sub14_1);
						Static102.method1995();
						Static592.aBoolean826 = true;
						return;
					}
					if (arg0 == 6037) {
						Static172.aClass5_Sub50_14.method7531(anIntArray598[--anInt10503], Static172.aClass5_Sub50_14.aClass12_Sub7_2);
						Static102.method1995();
						Static244.aBoolean480 = false;
						return;
					}
					if (arg0 == 6038) {
						local175 = anIntArray598[--anInt10503];
						local776 = Static172.aClass5_Sub50_14.aClass12_Sub7_3.method2118();
						if (local175 != local776 && Static33.anInt545 == Static433.anInt7533) {
							if (!Static134.method1808(Static173.anInt3397)) {
								if (local776 == 0) {
									Static127.method2322(Static396.aClass390_82, local175, Static33.anInt545);
									Static481.method6852();
									Static569.aBoolean788 = false;
								} else if (local175 == 0) {
									Static194.method3230();
									Static569.aBoolean788 = false;
								} else {
									Static251.method3866(local175);
								}
							}
							Static172.aClass5_Sub50_14.method7531(local175, Static172.aClass5_Sub50_14.aClass12_Sub7_3);
							Static102.method1995();
							Static244.aBoolean480 = false;
						}
						return;
					}
					if (arg0 == 6039) {
						local175 = anIntArray598[--anInt10503];
						if (local175 > 255 || local175 < 0) {
							local175 = 0;
						}
						if (local175 != Static172.aClass5_Sub50_14.aClass12_Sub12_1.method2961()) {
							Static172.aClass5_Sub50_14.method7531(local175, Static172.aClass5_Sub50_14.aClass12_Sub12_1);
							Static102.method1995();
							Static244.aBoolean480 = false;
						}
						return;
					}
					if (arg0 == 6040) {
						local175 = anIntArray598[--anInt10503];
						if (local175 != Static172.aClass5_Sub50_14.aClass12_Sub24_1.method6854()) {
							Static172.aClass5_Sub50_14.method7531(local175, Static172.aClass5_Sub50_14.aClass12_Sub24_1);
							Static102.method1995();
							Static244.aBoolean480 = false;
							Static517.method7322();
						}
						return;
					}
				} else if (arg0 < 6200) {
					if (arg0 == 6101) {
						anIntArray598[anInt10503++] = Static172.aClass5_Sub50_14.aClass12_Sub22_1.method6464();
						return;
					}
					if (arg0 == 6102) {
						anIntArray598[anInt10503++] = Static172.aClass5_Sub50_14.aClass12_Sub8_1.method2213() == 1 ? 1 : 0;
						return;
					}
					if (arg0 == 6103) {
						anIntArray598[anInt10503++] = Static172.aClass5_Sub50_14.aClass12_Sub13_1.method3075() == 2 ? 1 : 0;
						return;
					}
					if (arg0 == 6105) {
						anIntArray598[anInt10503++] = Static172.aClass5_Sub50_14.aClass12_Sub10_1.method2365() == 1 ? 1 : 0;
						return;
					}
					if (arg0 == 6107) {
						anIntArray598[anInt10503++] = Static172.aClass5_Sub50_14.aClass12_Sub11_1.method2913();
						return;
					}
					if (arg0 == 6108) {
						anIntArray598[anInt10503++] = Static172.aClass5_Sub50_14.aClass12_Sub19_1.method5315() == 1 ? 1 : 0;
						return;
					}
					if (arg0 == 6110) {
						anIntArray598[anInt10503++] = Static172.aClass5_Sub50_14.aClass12_Sub18_1.method5001() == 1 ? 1 : 0;
						return;
					}
					if (arg0 == 6111) {
						anIntArray598[anInt10503++] = Static172.aClass5_Sub50_14.aClass12_Sub25_1.method6990();
						return;
					}
					if (arg0 == 6112) {
						anIntArray598[anInt10503++] = Static172.aClass5_Sub50_14.aClass12_Sub4_1.method930() == 1 ? 1 : 0;
						return;
					}
					if (arg0 == 6114) {
						anIntArray598[anInt10503++] = Static172.aClass5_Sub50_14.aClass12_Sub29_1.method8477() == 2 ? 1 : 0;
						return;
					}
					if (arg0 == 6115) {
						anIntArray598[anInt10503++] = Static172.aClass5_Sub50_14.aClass12_Sub20_1.method5947() == 1 ? 1 : 0;
						return;
					}
					if (arg0 == 6116) {
						anIntArray598[anInt10503++] = Static172.aClass5_Sub50_14.aClass12_Sub6_1.method1989();
						return;
					}
					if (arg0 == 6117) {
						anIntArray598[anInt10503++] = Static172.aClass5_Sub50_14.aClass12_Sub17_1.method4523() == 1 ? 1 : 0;
						return;
					}
					if (arg0 == 6118) {
						anIntArray598[anInt10503++] = Static172.aClass5_Sub50_14.aClass12_Sub7_4.method2118();
						return;
					}
					if (arg0 == 6119) {
						anIntArray598[anInt10503++] = Static172.aClass5_Sub50_14.aClass12_Sub7_1.method2118();
						return;
					}
					if (arg0 == 6120) {
						anIntArray598[anInt10503++] = Static172.aClass5_Sub50_14.lb.method2118();
						return;
					}
					if (arg0 == 6123) {
						anIntArray598[anInt10503++] = Static227.method3543();
						return;
					}
					if (arg0 == 6124) {
						anIntArray598[anInt10503++] = Static172.aClass5_Sub50_14.aClass12_Sub6_2.method1989();
						return;
					}
					if (arg0 == 6125) {
						anIntArray598[anInt10503++] = Static172.aClass5_Sub50_14.aClass12_Sub1_1.method191();
						return;
					}
					if (arg0 == 6127) {
						anIntArray598[anInt10503++] = Static172.aClass5_Sub50_14.aClass12_Sub15_1.method3450() == 1 ? 1 : 0;
						return;
					}
					if (arg0 == 6128) {
						anIntArray598[anInt10503++] = Static172.aClass5_Sub50_14.aClass12_Sub23_1.method6624() == 1 ? 1 : 0;
						return;
					}
					if (arg0 == 6129) {
						anIntArray598[anInt10503++] = Static172.aClass5_Sub50_14.aClass12_Sub11_1.method2913();
						return;
					}
					if (arg0 == 6130) {
						anIntArray598[anInt10503++] = Static172.aClass5_Sub50_14.aClass12_Sub2_1.method349() == 1 ? 1 : 0;
						return;
					}
					if (arg0 == 6131) {
						anIntArray598[anInt10503++] = Static172.aClass5_Sub50_14.aClass12_Sub16_2.method3616();
						return;
					}
					if (arg0 == 6132) {
						anIntArray598[anInt10503++] = Static172.aClass5_Sub50_14.aClass12_Sub16_1.method3616();
						return;
					}
					if (arg0 == 6133) {
						anIntArray598[anInt10503++] = Static570.aClass268_5.aBoolean644 && !Static570.aClass268_5.aBoolean645 ? 1 : 0;
						return;
					}
					if (arg0 == 6135) {
						anIntArray598[anInt10503++] = Static172.aClass5_Sub50_14.aClass12_Sub3_1.method596();
						return;
					}
					if (arg0 == 6136) {
						anIntArray598[anInt10503++] = Static172.aClass5_Sub50_14.aClass12_Sub21_1.method6299() == 1 ? 1 : 0;
						return;
					}
					if (arg0 == 6138) {
						anIntArray598[anInt10503++] = Static293.method4687(200, Static172.aClass5_Sub50_14.aClass12_Sub16_2.method3616());
						return;
					}
					if (arg0 == 6139) {
						anIntArray598[anInt10503++] = Static172.aClass5_Sub50_14.aClass12_Sub14_1.method3089();
						return;
					}
					if (arg0 == 6142) {
						anIntArray598[anInt10503++] = Static172.aClass5_Sub50_14.aClass12_Sub7_2.method2118();
						return;
					}
					if (arg0 == 6143) {
						anIntArray598[anInt10503++] = Static172.aClass5_Sub50_14.aClass12_Sub7_3.method2118();
						return;
					}
					if (arg0 == 6144) {
						anIntArray598[anInt10503++] = Static554.aBoolean774 ? 1 : 0;
						return;
					}
					if (arg0 == 6145) {
						anIntArray598[anInt10503++] = Static172.aClass5_Sub50_14.aClass12_Sub12_1.method2961();
						return;
					}
					if (arg0 == 6146) {
						anIntArray598[anInt10503++] = Static172.aClass5_Sub50_14.aClass12_Sub24_1.method6854();
						return;
					}
					if (arg0 == 6147) {
						anIntArray598[anInt10503++] = Static580.aClass5_Sub30_1.anInt4762 < 512 || Static554.aBoolean774 || Static637.aBoolean879 ? 1 : 0;
						return;
					}
					if (arg0 == 6148) {
						anIntArray598[anInt10503++] = Static83.aBoolean168 ? 1 : 0;
						return;
					}
				} else if (arg0 < 6300) {
					if (arg0 == 6200) {
						anInt10503 -= 2;
						Static157.aShort25 = (short) anIntArray598[anInt10503];
						if (Static157.aShort25 <= 0) {
							Static157.aShort25 = 256;
						}
						Static7.aShort1 = (short) anIntArray598[anInt10503 + 1];
						if (Static7.aShort1 <= 0) {
							Static7.aShort1 = 205;
						}
						return;
					}
					if (arg0 == 6201) {
						anInt10503 -= 2;
						Static542.aShort60 = (short) anIntArray598[anInt10503];
						if (Static542.aShort60 <= 0) {
							Static542.aShort60 = 256;
						}
						Static524.aShort82 = (short) anIntArray598[anInt10503 + 1];
						if (Static524.aShort82 <= 0) {
							Static524.aShort82 = 320;
						}
						return;
					}
					if (arg0 == 6202) {
						anInt10503 -= 4;
						Static135.aShort24 = (short) anIntArray598[anInt10503];
						if (Static135.aShort24 <= 0) {
							Static135.aShort24 = 1;
						}
						Static242.aShort40 = (short) anIntArray598[anInt10503 + 1];
						if (Static242.aShort40 <= 0) {
							Static242.aShort40 = 32767;
						} else if (Static242.aShort40 < Static135.aShort24) {
							Static242.aShort40 = Static135.aShort24;
						}
						Static588.aShort105 = (short) anIntArray598[anInt10503 + 2];
						if (Static588.aShort105 <= 0) {
							Static588.aShort105 = 1;
						}
						Static222.aShort37 = (short) anIntArray598[anInt10503 + 3];
						if (Static222.aShort37 <= 0) {
							Static222.aShort37 = 32767;
							return;
						}
						if (Static222.aShort37 < Static588.aShort105) {
							Static222.aShort37 = Static588.aShort105;
						}
						return;
					}
					if (arg0 == 6203) {
						Static63.method897(false, Static655.aClass345_15.anInt9606, 0, Static655.aClass345_15.anInt9649, 0);
						anIntArray598[anInt10503++] = Static650.anInt10484;
						anIntArray598[anInt10503++] = Static158.anInt3176;
						return;
					}
					if (arg0 == 6204) {
						anIntArray598[anInt10503++] = Static542.aShort60;
						anIntArray598[anInt10503++] = Static524.aShort82;
						return;
					}
					if (arg0 == 6205) {
						anIntArray598[anInt10503++] = Static157.aShort25;
						anIntArray598[anInt10503++] = Static7.aShort1;
						return;
					}
				} else if (arg0 < 6400) {
					if (arg0 == 6300) {
						anIntArray598[anInt10503++] = (int) (Static547.method7619() / 60000L);
						return;
					}
					if (arg0 == 6301) {
						anIntArray598[anInt10503++] = (int) (Static547.method7619() / 86400000L) - 11745;
						return;
					}
					if (arg0 == 6302) {
						anInt10503 -= 3;
						local175 = anIntArray598[anInt10503];
						local776 = anIntArray598[anInt10503 + 1];
						local97 = anIntArray598[anInt10503 + 2];
						@Pc(6709) long local6709 = Static271.method4670(local175, local97, local776);
						local3369 = Static464.method6627(local6709);
						if (local97 < 1970) {
							local3369--;
						}
						anIntArray598[anInt10503++] = local3369;
						return;
					}
					if (arg0 == 6303) {
						anIntArray598[anInt10503++] = Static68.method929(Static547.method7619());
						return;
					}
					if (arg0 == 6304) {
						local175 = anIntArray598[--anInt10503];
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
						anIntArray598[anInt10503++] = local1496 ? 1 : 0;
						return;
					}
					if (arg0 == 6305) {
						local175 = anIntArray598[--anInt10503];
						@Pc(6827) int[] local6827 = Static422.method6267(local175);
						Static686.method4967(local6827, 0, anIntArray598, anInt10503, 3);
						anInt10503 += 3;
						return;
					}
					if (arg0 == 6306) {
						local175 = anIntArray598[--anInt10503];
						anIntArray598[anInt10503++] = (int) (Static644.method8661(local175) / 60000L);
						return;
					}
				} else if (arg0 < 6500) {
					if (arg0 == 6405) {
						anIntArray598[anInt10503++] = Static92.method1913() ? 1 : 0;
						return;
					}
					if (arg0 == 6406) {
						anIntArray598[anInt10503++] = Static533.method7493() ? 1 : 0;
						return;
					}
				} else if (arg0 < 6600) {
					if (arg0 == 6500) {
						if (Static173.anInt3397 == 7 && Static273.anInt5015 == 0 && Static83.anInt1914 == 0) {
							if (Static133.aBoolean233) {
								anIntArray598[anInt10503++] = 0;
								return;
							}
							if (Static421.aLong199 > Static547.method7619() - 1000L) {
								anIntArray598[anInt10503++] = 1;
								return;
							}
							Static133.aBoolean233 = true;
							local52 = Static64.method905(Static263.aClass49_1, Static512.aClass305_78);
							local52.aClass5_Sub41_Sub2_1.method7803(Static125.anInt2536);
							Static495.method7092(local52);
							anIntArray598[anInt10503++] = 0;
							return;
						}
						anIntArray598[anInt10503++] = 1;
						return;
					}
					@Pc(7012) Class386 local7012;
					@Pc(6979) Class6_Sub1 local6979;
					if (arg0 == 6501) {
						local6979 = Static542.method5398();
						if (local6979 != null) {
							anIntArray598[anInt10503++] = local6979.anInt65;
							anIntArray598[anInt10503++] = local6979.anInt55;
							aStringArray59[anInt10498++] = local6979.aString1;
							local7012 = local6979.method63();
							anIntArray598[anInt10503++] = local7012.anInt10592;
							aStringArray59[anInt10498++] = local7012.aString120;
							anIntArray598[anInt10503++] = local6979.anInt53;
							anIntArray598[anInt10503++] = local6979.anInt64;
							aStringArray59[anInt10498++] = local6979.aString2;
							return;
						}
						anIntArray598[anInt10503++] = -1;
						anIntArray598[anInt10503++] = 0;
						aStringArray59[anInt10498++] = "";
						anIntArray598[anInt10503++] = 0;
						aStringArray59[anInt10498++] = "";
						anIntArray598[anInt10503++] = 0;
						anIntArray598[anInt10503++] = 0;
						aStringArray59[anInt10498++] = "";
						return;
					}
					if (arg0 == 6502) {
						local6979 = Static231.method3569();
						if (local6979 != null) {
							anIntArray598[anInt10503++] = local6979.anInt65;
							anIntArray598[anInt10503++] = local6979.anInt55;
							aStringArray59[anInt10498++] = local6979.aString1;
							local7012 = local6979.method63();
							anIntArray598[anInt10503++] = local7012.anInt10592;
							aStringArray59[anInt10498++] = local7012.aString120;
							anIntArray598[anInt10503++] = local6979.anInt53;
							anIntArray598[anInt10503++] = local6979.anInt64;
							aStringArray59[anInt10498++] = local6979.aString2;
							return;
						}
						anIntArray598[anInt10503++] = -1;
						anIntArray598[anInt10503++] = 0;
						aStringArray59[anInt10498++] = "";
						anIntArray598[anInt10503++] = 0;
						aStringArray59[anInt10498++] = "";
						anIntArray598[anInt10503++] = 0;
						anIntArray598[anInt10503++] = 0;
						aStringArray59[anInt10498++] = "";
						return;
					}
					if (arg0 == 6503) {
						local175 = anIntArray598[--anInt10503];
						local89 = aStringArray59[--anInt10498];
						if (Static173.anInt3397 == 7 && Static273.anInt5015 == 0 && Static83.anInt1914 == 0) {
							anIntArray598[anInt10503++] = Static409.method6020(local175, local89) ? 1 : 0;
							return;
						}
						anIntArray598[anInt10503++] = 0;
						return;
					}
					if (arg0 == 6506) {
						local175 = anIntArray598[--anInt10503];
						@Pc(7339) Class6_Sub1 local7339 = Static603.method8261(local175);
						if (local7339 != null) {
							anIntArray598[anInt10503++] = local7339.anInt55;
							aStringArray59[anInt10498++] = local7339.aString1;
							@Pc(7363) Class386 local7363 = local7339.method63();
							anIntArray598[anInt10503++] = local7363.anInt10592;
							aStringArray59[anInt10498++] = local7363.aString120;
							anIntArray598[anInt10503++] = local7339.anInt53;
							anIntArray598[anInt10503++] = local7339.anInt64;
							aStringArray59[anInt10498++] = local7339.aString2;
							return;
						}
						anIntArray598[anInt10503++] = -1;
						aStringArray59[anInt10498++] = "";
						anIntArray598[anInt10503++] = 0;
						aStringArray59[anInt10498++] = "";
						anIntArray598[anInt10503++] = 0;
						anIntArray598[anInt10503++] = 0;
						aStringArray59[anInt10498++] = "";
						return;
					}
					if (arg0 == 6507) {
						anInt10503 -= 4;
						local175 = anIntArray598[anInt10503];
						local1496 = anIntArray598[anInt10503 + 1] == 1;
						local97 = anIntArray598[anInt10503 + 2];
						local2205 = anIntArray598[anInt10503 + 3] == 1;
						Static328.method5085(local97, local2205, local175, local1496);
						return;
					}
					if (arg0 == 6508) {
						Static477.method6824();
						return;
					}
					if (arg0 == 6509) {
						if (Static173.anInt3397 != 7) {
							return;
						}
						Static261.aBoolean412 = anIntArray598[--anInt10503] == 1;
						return;
					}
					if (arg0 == 6510) {
						anIntArray598[anInt10503++] = Static223.anInt4119;
						return;
					}
				} else if (arg0 >= 6700) {
					if (arg0 < 6800 && Static262.aClass368_2 == Static79.aClass368_1) {
						if (arg0 == 6700) {
							local175 = Static452.aClass300_33.method7190();
							if (Static84.anInt2018 != -1) {
								local175++;
							}
							anIntArray598[anInt10503++] = local175;
							return;
						}
						if (arg0 == 6701) {
							local175 = anIntArray598[--anInt10503];
							if (Static84.anInt2018 != -1) {
								if (local175 == 0) {
									anIntArray598[anInt10503++] = Static84.anInt2018;
									return;
								}
								local175--;
							}
							@Pc(7611) Class5_Sub39 local7611 = (Class5_Sub39) Static452.aClass300_33.method7182();
							while (local175-- > 0) {
								local7611 = (Class5_Sub39) Static452.aClass300_33.method7192();
							}
							anIntArray598[anInt10503++] = local7611.anInt6238;
							return;
						}
						if (arg0 == 6702) {
							local175 = anIntArray598[--anInt10503];
							if (Static648.aClass345ArrayArray2[local175] == null) {
								aStringArray59[anInt10498++] = "";
								return;
							}
							local89 = Static648.aClass345ArrayArray2[local175][0].aString91;
							if (local89 == null) {
								aStringArray59[anInt10498++] = "";
								return;
							}
							aStringArray59[anInt10498++] = local89.substring(0, local89.indexOf(58));
							return;
						}
						if (arg0 == 6703) {
							local175 = anIntArray598[--anInt10503];
							if (Static648.aClass345ArrayArray2[local175] == null) {
								anIntArray598[anInt10503++] = 0;
								return;
							}
							anIntArray598[anInt10503++] = Static648.aClass345ArrayArray2[local175].length;
							return;
						}
						if (arg0 == 6704) {
							anInt10503 -= 2;
							local175 = anIntArray598[anInt10503];
							local776 = anIntArray598[anInt10503 + 1];
							if (Static648.aClass345ArrayArray2[local175] == null) {
								aStringArray59[anInt10498++] = "";
								return;
							}
							local181 = Static648.aClass345ArrayArray2[local175][local776].aString91;
							if (local181 == null) {
								aStringArray59[anInt10498++] = "";
								return;
							}
							aStringArray59[anInt10498++] = local181;
							return;
						}
						if (arg0 == 6705) {
							anInt10503 -= 2;
							local175 = anIntArray598[anInt10503];
							local776 = anIntArray598[anInt10503 + 1];
							if (Static648.aClass345ArrayArray2[local175] == null) {
								anIntArray598[anInt10503++] = 0;
								return;
							}
							anIntArray598[anInt10503++] = Static648.aClass345ArrayArray2[local175][local776].anInt9625;
							return;
						}
						if (arg0 == 6706) {
							return;
						}
						if (arg0 == 6707) {
							anInt10503 -= 3;
							local175 = anIntArray598[anInt10503];
							local776 = anIntArray598[anInt10503 + 1];
							local97 = anIntArray598[anInt10503 + 2];
							Static43.method600(1, "", local175 << 16 | local776, local97);
							return;
						}
						if (arg0 == 6708) {
							anInt10503 -= 3;
							local175 = anIntArray598[anInt10503];
							local776 = anIntArray598[anInt10503 + 1];
							local97 = anIntArray598[anInt10503 + 2];
							Static43.method600(2, "", local175 << 16 | local776, local97);
							return;
						}
						if (arg0 == 6709) {
							anInt10503 -= 3;
							local175 = anIntArray598[anInt10503];
							local776 = anIntArray598[anInt10503 + 1];
							local97 = anIntArray598[anInt10503 + 2];
							Static43.method600(3, "", local175 << 16 | local776, local97);
							return;
						}
						if (arg0 == 6710) {
							anInt10503 -= 3;
							local175 = anIntArray598[anInt10503];
							local776 = anIntArray598[anInt10503 + 1];
							local97 = anIntArray598[anInt10503 + 2];
							Static43.method600(4, "", local175 << 16 | local776, local97);
							return;
						}
						if (arg0 == 6711) {
							anInt10503 -= 3;
							local175 = anIntArray598[anInt10503];
							local776 = anIntArray598[anInt10503 + 1];
							local97 = anIntArray598[anInt10503 + 2];
							Static43.method600(5, "", local175 << 16 | local776, local97);
							return;
						}
						if (arg0 == 6712) {
							anInt10503 -= 3;
							local175 = anIntArray598[anInt10503];
							local776 = anIntArray598[anInt10503 + 1];
							local97 = anIntArray598[anInt10503 + 2];
							Static43.method600(6, "", local175 << 16 | local776, local97);
							return;
						}
						if (arg0 == 6713) {
							anInt10503 -= 3;
							local175 = anIntArray598[anInt10503];
							local776 = anIntArray598[anInt10503 + 1];
							local97 = anIntArray598[anInt10503 + 2];
							Static43.method600(7, "", local175 << 16 | local776, local97);
							return;
						}
						if (arg0 == 6714) {
							anInt10503 -= 3;
							local175 = anIntArray598[anInt10503];
							local776 = anIntArray598[anInt10503 + 1];
							local97 = anIntArray598[anInt10503 + 2];
							Static43.method600(8, "", local175 << 16 | local776, local97);
							return;
						}
						if (arg0 == 6715) {
							anInt10503 -= 3;
							local175 = anIntArray598[anInt10503];
							local776 = anIntArray598[anInt10503 + 1];
							local97 = anIntArray598[anInt10503 + 2];
							Static43.method600(9, "", local175 << 16 | local776, local97);
							return;
						}
						if (arg0 == 6716) {
							anInt10503 -= 3;
							local175 = anIntArray598[anInt10503];
							local776 = anIntArray598[anInt10503 + 1];
							local97 = anIntArray598[anInt10503 + 2];
							Static43.method600(10, "", local175 << 16 | local776, local97);
							return;
						}
						if (arg0 == 6717) {
							anInt10503 -= 3;
							local175 = anIntArray598[anInt10503];
							local776 = anIntArray598[anInt10503 + 1];
							local97 = anIntArray598[anInt10503 + 2];
							@Pc(8199) Class345 local8199 = Static144.method2595(local175 << 16 | local776, local97);
							Static424.method6285();
							@Pc(8204) Class5_Sub5 local8204 = Static84.method1822(local8199);
							Static30.method365(local8199, local8204.anInt508, local8204.method457());
							return;
						}
					} else if (arg0 < 6900) {
						@Pc(8232) Class103 local8232;
						if (arg0 == 6800) {
							local175 = anIntArray598[--anInt10503];
							local8232 = Static49.aClass93_1.method2280(local175);
							if (local8232.aString17 == null) {
								aStringArray59[anInt10498++] = "";
								return;
							}
							aStringArray59[anInt10498++] = local8232.aString17;
							return;
						}
						if (arg0 == 6801) {
							local175 = anIntArray598[--anInt10503];
							local8232 = Static49.aClass93_1.method2280(local175);
							anIntArray598[anInt10503++] = local8232.anInt2810;
							return;
						}
						if (arg0 == 6802) {
							local175 = anIntArray598[--anInt10503];
							local8232 = Static49.aClass93_1.method2280(local175);
							anIntArray598[anInt10503++] = local8232.anInt2808;
							return;
						}
						if (arg0 == 6803) {
							local175 = anIntArray598[--anInt10503];
							local8232 = Static49.aClass93_1.method2280(local175);
							anIntArray598[anInt10503++] = local8232.anInt2801;
							return;
						}
						if (arg0 == 6804) {
							anInt10503 -= 2;
							local175 = anIntArray598[anInt10503];
							local776 = anIntArray598[anInt10503 + 1];
							@Pc(8354) Class233 local8354 = Static191.aClass381_2.method8728(local776);
							if (local8354.method5642()) {
								aStringArray59[anInt10498++] = Static49.aClass93_1.method2280(local175).method2494(local776, local8354.aString56);
								return;
							}
							anIntArray598[anInt10503++] = Static49.aClass93_1.method2280(local175).method2495(local776, local8354.anInt6763);
							return;
						}
					} else if (arg0 < 7000) {
						if (arg0 == 6900) {
							anIntArray598[anInt10503++] = Static185.aBoolean287 && !Static373.aBoolean589 ? 1 : 0;
							return;
						}
						if (arg0 == 6901) {
							anIntArray598[anInt10503++] = (int) (Static508.aLong239 / 60000L);
							anIntArray598[anInt10503++] = (int) ((Static508.aLong239 - Static547.method7619() - Static483.aLong227) / 60000L);
							anIntArray598[anInt10503++] = Static487.aBoolean691 ? 1 : 0;
							return;
						}
						if (arg0 == 6902) {
							anIntArray598[anInt10503++] = Static81.anInt1279;
							return;
						}
						if (arg0 == 6903) {
							anIntArray598[anInt10503++] = Static500.anInt8319;
							return;
						}
						if (arg0 == 6904) {
							anIntArray598[anInt10503++] = Static497.anInt7300;
							return;
						}
						if (arg0 == 6905) {
							local83 = "";
							if (Static120.aClass331_2 != null) {
								if (Static120.aClass331_2.anObject20 == null) {
									local83 = Static126.method2277(Static120.aClass331_2.anInt9110);
								} else {
									local83 = (String) Static120.aClass331_2.anObject20;
								}
							}
							aStringArray59[anInt10498++] = local83;
							return;
						}
						if (arg0 == 6906) {
							anIntArray598[anInt10503++] = Static206.anInt3874;
							return;
						}
						if (arg0 == 6907) {
							anIntArray598[anInt10503++] = Static382.anInt6788;
							return;
						}
						if (arg0 == 6908) {
							anIntArray598[anInt10503++] = Static639.anInt10382;
							return;
						}
						if (arg0 == 6909) {
							anIntArray598[anInt10503++] = Static401.aBoolean620 ? 1 : 0;
							return;
						}
						if (arg0 == 6910) {
							anIntArray598[anInt10503++] = Static42.anInt678;
							return;
						}
						if (arg0 == 6911) {
							anIntArray598[anInt10503++] = Static621.anInt10180;
							return;
						}
						if (arg0 == 6912) {
							anIntArray598[anInt10503++] = Static657.anInt10586;
							return;
						}
						if (arg0 == 6913) {
							anIntArray598[anInt10503++] = Static676.anInt10854;
							return;
						}
					} else if (arg0 < 7100) {
						if (arg0 == 7000) {
							local175 = Static526.method7436();
							anIntArray598[anInt10503++] = Static674.anInt10833 = Static172.aClass5_Sub50_14.aClass12_Sub16_2.method3616();
							anIntArray598[anInt10503++] = local175;
							Static248.method3851();
							Static102.method1995();
							Static244.aBoolean480 = false;
							return;
						}
						if (arg0 == 7001) {
							Static115.method2132();
							Static248.method3851();
							Static102.method1995();
							Static244.aBoolean480 = false;
							return;
						}
						if (arg0 == 7002) {
							Static428.method6320();
							Static248.method3851();
							Static102.method1995();
							Static244.aBoolean480 = false;
							return;
						}
						if (arg0 == 7003) {
							Static274.method4251();
							Static248.method3851();
							Static102.method1995();
							Static244.aBoolean480 = false;
							return;
						}
						if (arg0 == 7004) {
							Static418.method6228();
							Static248.method3851();
							Static102.method1995();
							Static244.aBoolean480 = false;
							return;
						}
						if (arg0 == 7005) {
							Static172.aClass5_Sub50_14.method7531(0, Static172.aClass5_Sub50_14.aClass12_Sub27_1);
							Static102.method1995();
							Static244.aBoolean480 = false;
							return;
						}
						if (arg0 == 7006) {
							if (Static674.anInt10833 == 2) {
								Static70.aBoolean78 = true;
								return;
							}
							if (Static674.anInt10833 == 1) {
								Static206.aBoolean317 = true;
								return;
							}
							if (Static674.anInt10833 == 3) {
								Static184.aBoolean286 = true;
							}
							return;
						}
						if (arg0 == 7007) {
							anIntArray598[anInt10503++] = Static172.aClass5_Sub50_14.aClass12_Sub27_1.method7770();
							return;
						}
					} else if (arg0 < 7200) {
						if (arg0 == 7100) {
							anInt10503 -= 2;
							local175 = anIntArray598[anInt10503];
							local776 = anIntArray598[anInt10503 + 1];
							if (local175 != -1) {
								if (local776 > 255) {
									local776 = 255;
								} else if (local776 < 0) {
									local776 = 0;
								}
								Static340.method5192(local175, local776, false);
							}
							return;
						}
						if (arg0 == 7101) {
							local175 = anIntArray598[--anInt10503];
							if (local175 != -1) {
								Static231.method3572(local175);
							}
							return;
						}
						if (arg0 == 7102) {
							local175 = anIntArray598[--anInt10503];
							if (local175 != -1) {
								Static25.method310(local175);
							}
							return;
						}
						if (arg0 == 7103) {
							anIntArray598[anInt10503++] = Static64.method906("jagtheora") ? 1 : 0;
							return;
						}
					} else if (arg0 < 7300) {
						if (arg0 == 7201) {
							anIntArray598[anInt10503++] = Static172.aClass5_Sub50_14.aClass12_Sub10_1.method2366() ? 1 : 0;
							return;
						}
						if (arg0 == 7202) {
							anIntArray598[anInt10503++] = Static172.aClass5_Sub50_14.aClass12_Sub18_1.method4999() ? 1 : 0;
							return;
						}
						if (arg0 == 7203) {
							anIntArray598[anInt10503++] = Static172.aClass5_Sub50_14.aClass12_Sub25_1.method6989() ? 1 : 0;
							return;
						}
						if (arg0 == 7204) {
							anIntArray598[anInt10503++] = Static172.aClass5_Sub50_14.aClass12_Sub29_1.method8475() ? 1 : 0;
							return;
						}
						if (arg0 == 7205) {
							anIntArray598[anInt10503++] = Static172.aClass5_Sub50_14.aClass12_Sub6_2.method1994() && Static208.aClass65_7.method6927() ? 1 : 0;
							return;
						}
						if (arg0 == 7206) {
							anIntArray598[anInt10503++] = Static172.aClass5_Sub50_14.aClass12_Sub28_1.method8316() ? 1 : 0;
							return;
						}
						if (arg0 == 7207) {
							anIntArray598[anInt10503++] = Static172.aClass5_Sub50_14.aClass12_Sub1_1.method188() ? 1 : 0;
							return;
						}
						if (arg0 == 7208) {
							anIntArray598[anInt10503++] = Static172.aClass5_Sub50_14.aClass12_Sub15_1.method3452() && Static208.aClass65_7.method6884() ? 1 : 0;
							return;
						}
						if (arg0 == 7209) {
							anIntArray598[anInt10503++] = Static172.aClass5_Sub50_14.aClass12_Sub2_1.method348() ? 1 : 0;
							return;
						}
						if (arg0 == 7210) {
							anIntArray598[anInt10503++] = Static172.aClass5_Sub50_14.aClass12_Sub21_1.method6298() ? 1 : 0;
							return;
						}
						if (arg0 == 7211) {
							anIntArray598[anInt10503++] = Static172.aClass5_Sub50_14.aClass12_Sub14_1.method3088() ? 1 : 0;
							return;
						}
						if (arg0 == 7212) {
							anIntArray598[anInt10503++] = Static172.aClass5_Sub50_14.aClass12_Sub20_1.method5948() ? 1 : 0;
							return;
						}
						if (arg0 == 7213) {
							anIntArray598[anInt10503++] = Static172.aClass5_Sub50_14.aClass12_Sub24_1.method6855() ? 1 : 0;
							return;
						}
						if (arg0 == 7214) {
							anIntArray598[anInt10503++] = Static172.aClass5_Sub50_14.aClass12_Sub16_1.method3620() ? 1 : 0;
							return;
						}
					} else if (arg0 < 7400) {
						if (arg0 == 7301) {
							local175 = anIntArray598[--anInt10503];
							anIntArray598[anInt10503++] = Static172.aClass5_Sub50_14.aClass12_Sub10_1.method8473(local175);
							return;
						}
						if (arg0 == 7302) {
							local175 = anIntArray598[--anInt10503];
							anIntArray598[anInt10503++] = Static172.aClass5_Sub50_14.aClass12_Sub18_1.method8473(local175);
							return;
						}
						if (arg0 == 7303) {
							local175 = anIntArray598[--anInt10503];
							anIntArray598[anInt10503++] = Static172.aClass5_Sub50_14.aClass12_Sub25_1.method8473(local175);
							return;
						}
						if (arg0 == 7304) {
							local175 = anIntArray598[--anInt10503];
							anIntArray598[anInt10503++] = Static172.aClass5_Sub50_14.aClass12_Sub29_1.method8473(local175);
							return;
						}
						if (arg0 == 7305) {
							local175 = anIntArray598[--anInt10503];
							if (!Static208.aClass65_7.method6927()) {
								anIntArray598[anInt10503++] = 3;
								return;
							}
							anIntArray598[anInt10503++] = Static172.aClass5_Sub50_14.aClass12_Sub6_2.method8473(local175);
							return;
						}
						if (arg0 == 7306) {
							local175 = anIntArray598[--anInt10503];
							anIntArray598[anInt10503++] = Static172.aClass5_Sub50_14.aClass12_Sub28_1.method8473(local175);
							return;
						}
						if (arg0 == 7307) {
							local175 = anIntArray598[--anInt10503];
							anIntArray598[anInt10503++] = Static172.aClass5_Sub50_14.aClass12_Sub1_1.method8473(local175);
							return;
						}
						if (arg0 == 7308) {
							local175 = anIntArray598[--anInt10503];
							if (!Static208.aClass65_7.method6884()) {
								anIntArray598[anInt10503++] = 3;
								return;
							}
							anIntArray598[anInt10503++] = Static172.aClass5_Sub50_14.aClass12_Sub15_1.method8473(local175);
							return;
						}
						if (arg0 == 7309) {
							local175 = anIntArray598[--anInt10503];
							anIntArray598[anInt10503++] = Static172.aClass5_Sub50_14.aClass12_Sub2_1.method8473(local175);
							return;
						}
						if (arg0 == 7310) {
							local175 = anIntArray598[--anInt10503];
							anIntArray598[anInt10503++] = Static172.aClass5_Sub50_14.aClass12_Sub21_1.method8473(local175);
							return;
						}
						if (arg0 == 7311) {
							local175 = anIntArray598[--anInt10503];
							anIntArray598[anInt10503++] = Static172.aClass5_Sub50_14.aClass12_Sub14_1.method8473(local175);
							return;
						}
						if (arg0 == 7312) {
							local175 = anIntArray598[--anInt10503];
							anIntArray598[anInt10503++] = Static172.aClass5_Sub50_14.aClass12_Sub20_1.method8473(local175);
							return;
						}
						if (arg0 == 7313) {
							local175 = anIntArray598[--anInt10503];
							anIntArray598[anInt10503++] = Static172.aClass5_Sub50_14.aClass12_Sub24_1.method8473(local175);
							return;
						}
						if (arg0 == 7314) {
							local175 = anIntArray598[--anInt10503];
							anIntArray598[anInt10503++] = Static172.aClass5_Sub50_14.aClass12_Sub16_1.method8473(local175);
							return;
						}
					}
				}
			}
		}
		throw new IllegalStateException(String.valueOf(arg0));
	}

	@OriginalMember(owner = "client!wca", name = "d", descriptor = "(I)I")
	private static int method8735(@OriginalArg(0) int arg0) {
		@Pc(4) Class357 local4 = Static667.aClass278_1.method6505(arg0);
		if (local4 == null) {
			throw new RuntimeException("sr-c112");
		}
		@Pc(21) Integer local21 = aClass166_7.method4094(Static218.aClass98_2.anInt2677 << 16 | arg0);
		if (local21 == null) {
			return local4.aChar6 == 'i' || local4.aChar6 == '1' ? 0 : -1;
		} else {
			return local21;
		}
	}

	@OriginalMember(owner = "client!wca", name = "a", descriptor = "(Lclient!fba;I)V")
	private static void method8736(@OriginalArg(0) Class5_Sub3_Sub3 arg0, @OriginalArg(1) int arg1) {
		anInt10503 = 0;
		anInt10498 = 0;
		@Pc(5) int local5 = -1;
		@Pc(8) int[] local8 = arg0.anIntArray136;
		@Pc(11) int[] local11 = arg0.anIntArray135;
		@Pc(13) byte local13 = -1;
		anInt10510 = 0;
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
						method8731(local31, local1134);
					} else if (local31 >= 5000 && local31 < 10000) {
						method8734(local31, local1134);
					} else {
						throw new IllegalStateException("Command: " + local31);
					}
				} else if (local31 == 0) {
					anIntArray598[anInt10503++] = local11[local5];
				} else {
					@Pc(54) int local54;
					if (local31 == 1) {
						local54 = local11[local5];
						anIntArray598[anInt10503++] = Static161.aClass237_3.anIntArray387[local54];
					} else if (local31 == 2) {
						local54 = local11[local5];
						Static161.aClass237_3.method5683(anIntArray598[--anInt10503], local54);
					} else if (local31 == 3) {
						aStringArray59[anInt10498++] = arg0.aStringArray21[local5];
					} else if (local31 == 6) {
						local5 += local11[local5];
					} else if (local31 == 7) {
						anInt10503 -= 2;
						if (anIntArray598[anInt10503] != anIntArray598[anInt10503 + 1]) {
							local5 += local11[local5];
						}
					} else if (local31 == 8) {
						anInt10503 -= 2;
						if (anIntArray598[anInt10503] == anIntArray598[anInt10503 + 1]) {
							local5 += local11[local5];
						}
					} else if (local31 == 9) {
						anInt10503 -= 2;
						if (anIntArray598[anInt10503] < anIntArray598[anInt10503 + 1]) {
							local5 += local11[local5];
						}
					} else if (local31 == 10) {
						anInt10503 -= 2;
						if (anIntArray598[anInt10503] > anIntArray598[anInt10503 + 1]) {
							local5 += local11[local5];
						}
					} else if (local31 == 21) {
						if (anInt10510 == 0) {
							return;
						}
						@Pc(216) Class61 local216 = aClass61Array1[--anInt10510];
						arg0 = local216.aClass5_Sub3_Sub3_1;
						local8 = arg0.anIntArray136;
						local11 = arg0.anIntArray135;
						local5 = local216.anInt1063;
						anIntArray597 = local216.anIntArray58;
						aStringArray58 = local216.aStringArray13;
						aLongArray25 = local216.aLongArray4;
					} else if (local31 == 25) {
						local54 = local11[local5];
						anIntArray598[anInt10503++] = Static161.aClass237_3.method5678(local54);
					} else if (local31 == 27) {
						local54 = local11[local5];
						Static161.aClass237_3.method5681(anIntArray598[--anInt10503], local54);
					} else if (local31 == 31) {
						anInt10503 -= 2;
						if (anIntArray598[anInt10503] <= anIntArray598[anInt10503 + 1]) {
							local5 += local11[local5];
						}
					} else if (local31 == 32) {
						anInt10503 -= 2;
						if (anIntArray598[anInt10503] >= anIntArray598[anInt10503 + 1]) {
							local5 += local11[local5];
						}
					} else if (local31 == 33) {
						anIntArray598[anInt10503++] = anIntArray597[local11[local5]];
					} else if (local31 == 34) {
						anIntArray597[local11[local5]] = anIntArray598[--anInt10503];
					} else if (local31 == 35) {
						aStringArray59[anInt10498++] = aStringArray58[local11[local5]];
					} else if (local31 == 36) {
						aStringArray58[local11[local5]] = aStringArray59[--anInt10498];
					} else if (local31 == 37) {
						local54 = local11[local5];
						anInt10498 -= local54;
						@Pc(403) String local403 = Static78.method1015(aStringArray59, anInt10498, local54);
						aStringArray59[anInt10498++] = local403;
					} else if (local31 == 38) {
						anInt10503--;
					} else if (local31 == 39) {
						anInt10498--;
					} else if (local31 == 40) {
						local54 = local11[local5];
						@Pc(439) Class5_Sub3_Sub3 local439 = Static5.method65(local54);
						if (local439 == null) {
							throw new RuntimeException();
						}
						@Pc(449) int[] local449 = new int[local439.anInt3179];
						@Pc(453) String[] local453 = new String[local439.anInt3175];
						@Pc(457) long[] local457 = new long[local439.anInt3177];
						for (@Pc(459) int local459 = 0; local459 < local439.anInt3178; local459++) {
							local449[local459] = anIntArray598[anInt10503 + local459 - local439.anInt3178];
						}
						for (@Pc(478) int local478 = 0; local478 < local439.anInt3180; local478++) {
							local453[local478] = aStringArray59[anInt10498 + local478 - local439.anInt3180];
						}
						for (@Pc(497) int local497 = 0; local497 < local439.anInt3173; local497++) {
							local457[local497] = aLongArray24[anInt10504 + local497 - local439.anInt3173];
						}
						anInt10503 -= local439.anInt3178;
						anInt10498 -= local439.anInt3180;
						anInt10504 -= local439.anInt3173;
						@Pc(533) Class61 local533 = new Class61();
						local533.aClass5_Sub3_Sub3_1 = arg0;
						local533.anInt1063 = local5;
						local533.anIntArray58 = anIntArray597;
						local533.aStringArray13 = aStringArray58;
						local533.aLongArray4 = aLongArray25;
						if (anInt10510 >= aClass61Array1.length) {
							throw new RuntimeException();
						}
						aClass61Array1[anInt10510++] = local533;
						arg0 = local439;
						local8 = local439.anIntArray136;
						local11 = local439.anIntArray135;
						local5 = -1;
						anIntArray597 = local449;
						aStringArray58 = local453;
						aLongArray25 = local457;
					} else if (local31 == 42) {
						anIntArray598[anInt10503++] = Static326.anIntArray342[local11[local5]];
					} else if (local31 == 43) {
						local54 = local11[local5];
						Static326.anIntArray342[local54] = anIntArray598[--anInt10503];
						Static270.method4172(local54);
						Static550.aBoolean771 |= Static180.aBooleanArray15[local54];
					} else if (local31 == 44) {
						local54 = local11[local5] >> 16;
						local639 = local11[local5] & 0xFFFF;
						@Pc(647) int local647 = anIntArray598[--anInt10503];
						if (local647 >= 0 && local647 <= 5000) {
							anIntArray595[local54] = local647;
							@Pc(662) byte local662 = -1;
							if (local639 == 105) {
								local662 = 0;
							}
							@Pc(669) int local669 = 0;
							while (true) {
								if (local669 >= local647) {
									continue label333;
								}
								anIntArrayArray59[local54][local669] = local662;
								local669++;
							}
						}
						throw new RuntimeException();
					} else if (local31 == 45) {
						local54 = local11[local5];
						local639 = anIntArray598[--anInt10503];
						if (local639 < 0 || local639 >= anIntArray595[local54]) {
							throw new RuntimeException();
						}
						anIntArray598[anInt10503++] = anIntArrayArray59[local54][local639];
					} else if (local31 == 46) {
						local54 = local11[local5];
						anInt10503 -= 2;
						local639 = anIntArray598[anInt10503];
						if (local639 < 0 || local639 >= anIntArray595[local54]) {
							throw new RuntimeException();
						}
						anIntArrayArray59[local54][local639] = anIntArray598[anInt10503 + 1];
					} else if (local31 == 47) {
						@Pc(766) String local766 = Static2.aStringArray1[local11[local5]];
						if (local766 == null) {
							local766 = "null";
						}
						aStringArray59[anInt10498++] = local766;
					} else if (local31 == 48) {
						local54 = local11[local5];
						Static2.aStringArray1[local54] = aStringArray59[--anInt10498];
						Static673.method8996(local54);
					} else if (local31 == 51) {
						@Pc(810) Class300 local810 = arg0.aClass300Array1[local11[local5]];
						@Pc(823) Class5_Sub47 local823 = (Class5_Sub47) local810.method7188((long) anIntArray598[--anInt10503]);
						if (local823 != null) {
							local5 += local823.anInt8308;
						}
					} else if (local31 == 54) {
						aLongArray24[anInt10504++] = arg0.aLongArray10[local5];
					} else if (local31 == 55) {
						anInt10504--;
					} else if (local31 == 66) {
						aLongArray24[anInt10504++] = aLongArray25[local11[local5]];
					} else if (local31 == 67) {
						aLongArray25[local11[local5]] = aLongArray24[--anInt10504];
					} else if (local31 == 68) {
						anInt10504 -= 2;
						if (aLongArray24[anInt10504] != aLongArray24[anInt10504 + 1]) {
							local5 += local11[local5];
						}
					} else if (local31 == 69) {
						anInt10504 -= 2;
						if (aLongArray24[anInt10504] == aLongArray24[anInt10504 + 1]) {
							local5 += local11[local5];
						}
					} else if (local31 == 70) {
						anInt10504 -= 2;
						if (aLongArray24[anInt10504] < aLongArray24[anInt10504 + 1]) {
							local5 += local11[local5];
						}
					} else if (local31 == 71) {
						anInt10504 -= 2;
						if (aLongArray24[anInt10504] > aLongArray24[anInt10504 + 1]) {
							local5 += local11[local5];
						}
					} else if (local31 == 72) {
						anInt10504 -= 2;
						if (aLongArray24[anInt10504] <= aLongArray24[anInt10504 + 1]) {
							local5 += local11[local5];
						}
					} else if (local31 == 73) {
						anInt10504 -= 2;
						if (aLongArray24[anInt10504] >= aLongArray24[anInt10504 + 1]) {
							local5 += local11[local5];
						}
					} else if (local31 == 86) {
						if (anIntArray598[--anInt10503] == 1) {
							local5 += local11[local5];
						}
					} else if (local31 == 87) {
						if (anIntArray598[--anInt10503] == 0) {
							local5 += local11[local5];
						}
					} else if (local31 == 112) {
						anIntArray598[anInt10503++] = method8735(local11[local5]);
					} else if (local31 == 113) {
						anIntArray598[anInt10503++] = method8732(local11[local5]);
					} else if (local31 == 114) {
						aLongArray24[anInt10504++] = method8729(local11[local5]);
					} else if (local31 == 115) {
						aStringArray59[anInt10498++] = method8733(local11[local5]);
					}
				}
			}
		} catch (@Pc(1169) Exception local1169) {
			@Pc(1188) StringBuffer local1188;
			if (arg0.aString18 == null) {
				local1188 = new StringBuffer(30);
				local1188.append("CS2: ").append(arg0.aLong307).append(" ");
				for (local639 = anInt10510 - 1; local639 >= 0; local639--) {
					local1188.append("v: ").append(aClass61Array1[local639].aClass5_Sub3_Sub3_1.aLong307).append(" ");
				}
				local1188.append("op: ").append(local13);
				Static234.method3615(local1169, local1188.toString());
			} else {
				Static491.method7052("Clientscript error in: " + arg0.aString18);
				local1188 = new StringBuffer(30);
				local1188.append("Clientscript error in: ").append(arg0.aString18).append("\n");
				for (local639 = anInt10510 - 1; local639 >= 0; local639--) {
					local1188.append("via: ").append(aClass61Array1[local639].aClass5_Sub3_Sub3_1.aString18).append("\n");
				}
				local1188.append("Op: ").append(local13).append("\n");
				@Pc(1228) String local1228 = local1169.getMessage();
				if (local1228 != null && local1228.length() > 0) {
					local1188.append("Message: ").append(local1228).append("\n");
				}
				Static234.method3615(local1169, local1188.toString());
				Static574.method7927(local1188.toString());
			}
		}
	}

	@OriginalMember(owner = "client!wca", name = "e", descriptor = "(I)V")
	public static void method8737(@OriginalArg(0) int arg0) {
		if (arg0 == -1 || !Static107.method2043(arg0)) {
			return;
		}
		@Pc(12) Class345[] local12 = Static648.aClass345ArrayArray2[arg0];
		for (@Pc(14) int local14 = 0; local14 < local12.length; local14++) {
			@Pc(19) Class345 local19 = local12[local14];
			if (local19.anObjectArray24 != null) {
				@Pc(26) Class5_Sub22 local26 = new Class5_Sub22();
				local26.aClass345_1 = local19;
				local26.anObjectArray1 = local19.anObjectArray24;
				method8745(local26, 2000000);
			}
		}
	}

	@OriginalMember(owner = "client!wca", name = "a", descriptor = "(Ljava/lang/String;I)V")
	private static void method8738(@OriginalArg(0) String arg0, @OriginalArg(1) int arg1) {
		if (Static105.anInt2257 == 0 && (Static185.aBoolean287 && !Static373.aBoolean589 || Static211.aBoolean327)) {
			return;
		}
		@Pc(11) String local11 = arg0.toLowerCase();
		@Pc(13) byte local13 = 0;
		if (local11.startsWith(Static64.aClass52_47.method907(0))) {
			local13 = 0;
			arg0 = arg0.substring(Static64.aClass52_47.method907(0).length());
		} else if (local11.startsWith(Static64.aClass52_48.method907(0))) {
			local13 = 1;
			arg0 = arg0.substring(Static64.aClass52_48.method907(0).length());
		} else if (local11.startsWith(Static64.aClass52_49.method907(0))) {
			local13 = 2;
			arg0 = arg0.substring(Static64.aClass52_49.method907(0).length());
		} else if (local11.startsWith(Static64.aClass52_50.method907(0))) {
			local13 = 3;
			arg0 = arg0.substring(Static64.aClass52_50.method907(0).length());
		} else if (local11.startsWith(Static64.aClass52_51.method907(0))) {
			local13 = 4;
			arg0 = arg0.substring(Static64.aClass52_51.method907(0).length());
		} else if (local11.startsWith(Static64.aClass52_52.method907(0))) {
			local13 = 5;
			arg0 = arg0.substring(Static64.aClass52_52.method907(0).length());
		} else if (local11.startsWith(Static64.aClass52_53.method907(0))) {
			local13 = 6;
			arg0 = arg0.substring(Static64.aClass52_53.method907(0).length());
		} else if (local11.startsWith(Static64.aClass52_54.method907(0))) {
			local13 = 7;
			arg0 = arg0.substring(Static64.aClass52_54.method907(0).length());
		} else if (local11.startsWith(Static64.aClass52_55.method907(0))) {
			local13 = 8;
			arg0 = arg0.substring(Static64.aClass52_55.method907(0).length());
		} else if (local11.startsWith(Static64.aClass52_56.method907(0))) {
			local13 = 9;
			arg0 = arg0.substring(Static64.aClass52_56.method907(0).length());
		} else if (local11.startsWith(Class52.lb.method907(0))) {
			local13 = 10;
			arg0 = arg0.substring(Class52.lb.method907(0).length());
		} else if (local11.startsWith(Static64.aClass52_57.method907(0))) {
			local13 = 11;
			arg0 = arg0.substring(Static64.aClass52_57.method907(0).length());
		} else if (Static544.anInt8937 != 0) {
			if (local11.startsWith(Static64.aClass52_47.method907(Static544.anInt8937))) {
				local13 = 0;
				arg0 = arg0.substring(Static64.aClass52_47.method907(Static544.anInt8937).length());
			} else if (local11.startsWith(Static64.aClass52_48.method907(Static544.anInt8937))) {
				local13 = 1;
				arg0 = arg0.substring(Static64.aClass52_48.method907(Static544.anInt8937).length());
			} else if (local11.startsWith(Static64.aClass52_49.method907(Static544.anInt8937))) {
				local13 = 2;
				arg0 = arg0.substring(Static64.aClass52_49.method907(Static544.anInt8937).length());
			} else if (local11.startsWith(Static64.aClass52_50.method907(Static544.anInt8937))) {
				local13 = 3;
				arg0 = arg0.substring(Static64.aClass52_50.method907(Static544.anInt8937).length());
			} else if (local11.startsWith(Static64.aClass52_51.method907(Static544.anInt8937))) {
				local13 = 4;
				arg0 = arg0.substring(Static64.aClass52_51.method907(Static544.anInt8937).length());
			} else if (local11.startsWith(Static64.aClass52_52.method907(Static544.anInt8937))) {
				local13 = 5;
				arg0 = arg0.substring(Static64.aClass52_52.method907(Static544.anInt8937).length());
			} else if (local11.startsWith(Static64.aClass52_53.method907(Static544.anInt8937))) {
				local13 = 6;
				arg0 = arg0.substring(Static64.aClass52_53.method907(Static544.anInt8937).length());
			} else if (local11.startsWith(Static64.aClass52_54.method907(Static544.anInt8937))) {
				local13 = 7;
				arg0 = arg0.substring(Static64.aClass52_54.method907(Static544.anInt8937).length());
			} else if (local11.startsWith(Static64.aClass52_55.method907(Static544.anInt8937))) {
				local13 = 8;
				arg0 = arg0.substring(Static64.aClass52_55.method907(Static544.anInt8937).length());
			} else if (local11.startsWith(Static64.aClass52_56.method907(Static544.anInt8937))) {
				local13 = 9;
				arg0 = arg0.substring(Static64.aClass52_56.method907(Static544.anInt8937).length());
			} else if (local11.startsWith(Class52.lb.method907(Static544.anInt8937))) {
				local13 = 10;
				arg0 = arg0.substring(Class52.lb.method907(Static544.anInt8937).length());
			} else if (local11.startsWith(Static64.aClass52_57.method907(Static544.anInt8937))) {
				local13 = 11;
				arg0 = arg0.substring(Static64.aClass52_57.method907(Static544.anInt8937).length());
			}
		}
		local11 = arg0.toLowerCase();
		@Pc(451) byte local451 = 0;
		if (local11.startsWith(Static64.aClass52_58.method907(0))) {
			local451 = 1;
			arg0 = arg0.substring(Static64.aClass52_58.method907(0).length());
		} else if (local11.startsWith(Static64.aClass52_59.method907(0))) {
			local451 = 2;
			arg0 = arg0.substring(Static64.aClass52_59.method907(0).length());
		} else if (local11.startsWith(Static64.aClass52_60.method907(0))) {
			local451 = 3;
			arg0 = arg0.substring(Static64.aClass52_60.method907(0).length());
		} else if (local11.startsWith(Static64.aClass52_61.method907(0))) {
			local451 = 4;
			arg0 = arg0.substring(Static64.aClass52_61.method907(0).length());
		} else if (local11.startsWith(Static64.aClass52_62.method907(0))) {
			local451 = 5;
			arg0 = arg0.substring(Static64.aClass52_62.method907(0).length());
		} else if (Static544.anInt8937 != 0) {
			if (local11.startsWith(Static64.aClass52_58.method907(Static544.anInt8937))) {
				local451 = 1;
				arg0 = arg0.substring(Static64.aClass52_58.method907(Static544.anInt8937).length());
			} else if (local11.startsWith(Static64.aClass52_59.method907(Static544.anInt8937))) {
				local451 = 2;
				arg0 = arg0.substring(Static64.aClass52_59.method907(Static544.anInt8937).length());
			} else if (local11.startsWith(Static64.aClass52_60.method907(Static544.anInt8937))) {
				local451 = 3;
				arg0 = arg0.substring(Static64.aClass52_60.method907(Static544.anInt8937).length());
			} else if (local11.startsWith(Static64.aClass52_61.method907(Static544.anInt8937))) {
				local451 = 4;
				arg0 = arg0.substring(Static64.aClass52_61.method907(Static544.anInt8937).length());
			} else if (local11.startsWith(Static64.aClass52_62.method907(Static544.anInt8937))) {
				local451 = 5;
				arg0 = arg0.substring(Static64.aClass52_62.method907(Static544.anInt8937).length());
			}
		}
		@Pc(641) Class5_Sub21 local641 = Static64.method905(Static263.aClass49_1, Static142.aClass305_24);
		local641.aClass5_Sub41_Sub2_1.method7798(0);
		@Pc(650) int local650 = local641.aClass5_Sub41_Sub2_1.anInt9230;
		local641.aClass5_Sub41_Sub2_1.method7798(local13);
		local641.aClass5_Sub41_Sub2_1.method7798(local451);
		Static415.method6168(local641.aClass5_Sub41_Sub2_1, arg0);
		local641.aClass5_Sub41_Sub2_1.method7839(local641.aClass5_Sub41_Sub2_1.anInt9230 - local650);
		Static495.method7092(local641);
	}

	@OriginalMember(owner = "client!wca", name = "f", descriptor = "(I)V")
	private static void method8739(@OriginalArg(0) int arg0) {
		@Pc(3) Class345 local3 = Static264.method4120(arg0);
		if (local3 == null) {
			return;
		}
		@Pc(9) int local9 = arg0 >>> 16;
		@Pc(13) Class345[] local13 = Static212.aClass345ArrayArray1[local9];
		if (local13 == null) {
			@Pc(19) Class345[] local19 = Static648.aClass345ArrayArray2[local9];
			@Pc(22) int local22 = local19.length;
			local13 = Static212.aClass345ArrayArray1[local9] = new Class345[local22];
			Static686.method4966(local19, 0, local13, 0, local19.length);
		}
		@Pc(38) int local38;
		for (local38 = 0; local38 < local13.length && local13[local38] != local3; local38++) {
		}
		if (local38 >= local13.length) {
			return;
		}
		Static686.method4966(local13, 0, local13, 1, local38);
		local13[0] = local3;
	}

	@OriginalMember(owner = "client!wca", name = "c", descriptor = "(IZ)V")
	public static void method8741() {
	}

	@OriginalMember(owner = "client!wca", name = "g", descriptor = "(I)V")
	private static void method8742(@OriginalArg(0) int arg0) {
		@Pc(3) Class345 local3 = Static264.method4120(arg0);
		if (local3 == null) {
			return;
		}
		@Pc(9) int local9 = arg0 >>> 16;
		@Pc(13) Class345[] local13 = Static212.aClass345ArrayArray1[local9];
		if (local13 == null) {
			@Pc(19) Class345[] local19 = Static648.aClass345ArrayArray2[local9];
			@Pc(22) int local22 = local19.length;
			local13 = Static212.aClass345ArrayArray1[local9] = new Class345[local22];
			Static686.method4966(local19, 0, local13, 0, local19.length);
		}
		@Pc(38) int local38;
		for (local38 = 0; local38 < local13.length && local13[local38] != local3; local38++) {
		}
		if (local38 >= local13.length) {
			return;
		}
		Static686.method4966(local13, local38 + 1, local13, local38, local13.length - local38 - 1);
		local13[local13.length - 1] = local3;
	}

	@OriginalMember(owner = "client!wca", name = "a", descriptor = "(Lclient!fn;)V")
	public static void method8743(@OriginalArg(0) Class5_Sub22 arg0) {
		method8745(arg0, 200000);
	}

	@OriginalMember(owner = "client!wca", name = "a", descriptor = "(Lclient!wu;II)V")
	public static void method8744(@OriginalArg(0) Class394 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(5) Class5_Sub3_Sub3 local5 = Static397.method5838(arg1, arg2, arg0);
		if (local5 == null) {
			return;
		}
		anIntArray597 = new int[local5.anInt3179];
		aStringArray58 = new String[local5.anInt3175];
		if (local5.aClass394_43 == Static411.aClass394_113 || local5.aClass394_43 == Static326.aClass394_94 || local5.aClass394_43 == Static328.aClass394_95) {
			@Pc(30) int local30 = 0;
			@Pc(32) int local32 = 0;
			if (Static378.aClass345_9 != null) {
				local30 = Static378.aClass345_9.anInt9651;
				local32 = Static378.aClass345_9.anInt9588;
			}
			anIntArray597[0] = Static359.aClass11_1.method6141() - local30;
			anIntArray597[1] = Static359.aClass11_1.method6144() - local32;
		}
		method8736(local5, 200000);
	}

	@OriginalMember(owner = "client!wca", name = "a", descriptor = "(Lclient!fn;I)V")
	private static void method8745(@OriginalArg(0) Class5_Sub22 arg0, @OriginalArg(1) int arg1) {
		@Pc(2) Object[] local2 = arg0.anObjectArray1;
		@Pc(8) int local8 = (Integer) local2[0];
		@Pc(12) Class5_Sub3_Sub3 local12 = Static5.method65(local8);
		if (local12 == null) {
			return;
		}
		anIntArray597 = new int[local12.anInt3179];
		@Pc(21) int local21 = 0;
		aStringArray58 = new String[local12.anInt3175];
		@Pc(27) int local27 = 0;
		aLongArray25 = new long[local12.anInt3177];
		@Pc(33) int local33 = 0;
		for (@Pc(35) int local35 = 1; local35 < local2.length; local35++) {
			if (local2[local35] instanceof Integer) {
				@Pc(47) int local47 = (Integer) local2[local35];
				if (local47 == -2147483647) {
					local47 = arg0.anInt3430;
				}
				if (local47 == -2147483646) {
					local47 = arg0.anInt3436;
				}
				if (local47 == -2147483645) {
					local47 = arg0.aClass345_1 == null ? -1 : arg0.aClass345_1.anInt9664;
				}
				if (local47 == -2147483644) {
					local47 = arg0.anInt3432;
				}
				if (local47 == -2147483643) {
					local47 = arg0.aClass345_1 == null ? -1 : arg0.aClass345_1.anInt9611;
				}
				if (local47 == -2147483642) {
					local47 = arg0.aClass345_2 == null ? -1 : arg0.aClass345_2.anInt9664;
				}
				if (local47 == -2147483641) {
					local47 = arg0.aClass345_2 == null ? -1 : arg0.aClass345_2.anInt9611;
				}
				if (local47 == -2147483640) {
					local47 = arg0.anInt3431;
				}
				if (local47 == -2147483639) {
					local47 = arg0.anInt3433;
				}
				anIntArray597[local21++] = local47;
			} else if (local2[local35] instanceof String) {
				@Pc(141) String local141 = (String) local2[local35];
				if (local141.equals("event_opbase")) {
					local141 = arg0.aString22;
				}
				aStringArray58[local27++] = local141;
			} else if (local2[local35] instanceof Long) {
				@Pc(165) long local165 = (Long) local2[local35];
				aLongArray25[local33++] = local165;
			}
		}
		anInt10513 = arg0.anInt3429;
		method8736(local12, arg1);
	}

	@OriginalMember(owner = "client!wca", name = "b", descriptor = "()V")
	public static void method8746() {
	}
}
