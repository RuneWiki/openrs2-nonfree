import java.awt.datatransfer.DataFlavor;
import java.awt.datatransfer.Transferable;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static247 {

	@OriginalMember(owner = "client!im", name = "B", descriptor = "[J")
	private static long[] aLongArray14;

	@OriginalMember(owner = "client!im", name = "I", descriptor = "Lclient!wt;")
	private static Class5_Sub55 aClass5_Sub55_1;

	@OriginalMember(owner = "client!im", name = "r", descriptor = "Lclient!sca;")
	private static Class325 aClass325_2;

	@OriginalMember(owner = "client!im", name = "H", descriptor = "Lclient!fca;")
	private static Class108 aClass108_1;

	@OriginalMember(owner = "client!im", name = "b", descriptor = "Lclient!mj;")
	private static Class238 aClass238_8;

	@OriginalMember(owner = "client!im", name = "g", descriptor = "Lclient!mj;")
	private static Class238 aClass238_9;

	@OriginalMember(owner = "client!im", name = "f", descriptor = "[I")
	private static int[] anIntArray220;

	@OriginalMember(owner = "client!im", name = "F", descriptor = "[Ljava/lang/String;")
	private static String[] aStringArray23;

	@OriginalMember(owner = "client!im", name = "G", descriptor = "I")
	private static int anInt4311 = 0;

	@OriginalMember(owner = "client!im", name = "c", descriptor = "[I")
	private static final int[] anIntArray219 = new int[1000];

	@OriginalMember(owner = "client!im", name = "z", descriptor = "I")
	private static int anInt4318 = 0;

	@OriginalMember(owner = "client!im", name = "u", descriptor = "I")
	private static int anInt4319 = 0;

	@OriginalMember(owner = "client!im", name = "q", descriptor = "I")
	private static int anInt4321 = 0;

	@OriginalMember(owner = "client!im", name = "i", descriptor = "[J")
	private static final long[] aLongArray15 = new long[1000];

	@OriginalMember(owner = "client!im", name = "p", descriptor = "Lclient!iha;")
	public static final Class168 aClass168_42 = new Class168(4);

	@OriginalMember(owner = "client!im", name = "o", descriptor = "[[I")
	private static final int[][] anIntArrayArray35 = new int[5][5000];

	@OriginalMember(owner = "client!im", name = "a", descriptor = "[Lclient!vi;")
	private static final Class378[] aClass378Array1 = new Class378[50];

	@OriginalMember(owner = "client!im", name = "k", descriptor = "[I")
	private static final int[] anIntArray221 = new int[5];

	@OriginalMember(owner = "client!im", name = "A", descriptor = "[Ljava/lang/String;")
	private static final String[] aStringArray22 = new String[1000];

	@OriginalMember(owner = "client!im", name = "E", descriptor = "[I")
	private static final int[] anIntArray222 = new int[3];

	@OriginalMember(owner = "client!im", name = "y", descriptor = "I")
	private static int anInt4325 = 0;

	@OriginalMember(owner = "client!im", name = "e", descriptor = "Ljava/lang/String;")
	public static String aString40 = null;

	@OriginalMember(owner = "client!im", name = "s", descriptor = "Z")
	public static boolean aBoolean282 = false;

	@OriginalMember(owner = "client!im", name = "b", descriptor = "(IZ)V")
	private static void method3954(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1) {
		@Pc(220) Class238 local220;
		@Pc(21) int local21;
		@Pc(72) int local72;
		@Pc(27) int local27;
		@Pc(38) Class238 local38;
		@Pc(303) Class238 local303;
		@Pc(15) int local15;
		@Pc(248) Class238 local248;
		if (arg0 < 300) {
			if (arg0 == 150) {
				anInt4319 -= 3;
				local15 = anIntArray219[anInt4319];
				local21 = anIntArray219[anInt4319 + 1];
				local27 = anIntArray219[anInt4319 + 2];
				if (local21 == 0) {
					throw new RuntimeException();
				}
				local38 = Static305.method4761(local15);
				if (local38.aClass238Array1 == null) {
					local38.aClass238Array1 = new Class238[local27 + 1];
					local38.aClass238Array2 = local38.aClass238Array1;
				}
				if (local38.aClass238Array1.length <= local27) {
					@Pc(70) Class238[] local70;
					if (local38.aClass238Array1 == local38.aClass238Array2) {
						local70 = new Class238[local27 + 1];
						for (local72 = 0; local72 < local38.aClass238Array1.length; local72++) {
							local70[local72] = local38.aClass238Array1[local72];
						}
						local38.aClass238Array1 = local38.aClass238Array2 = local70;
					} else {
						local70 = new Class238[local27 + 1];
						@Pc(104) Class238[] local104 = new Class238[local27 + 1];
						for (@Pc(106) int local106 = 0; local106 < local38.aClass238Array1.length; local106++) {
							local70[local106] = local38.aClass238Array1[local106];
							local104[local106] = local38.aClass238Array2[local106];
						}
						local38.aClass238Array1 = local70;
						local38.aClass238Array2 = local104;
					}
				}
				if (local27 > 0 && local38.aClass238Array1[local27 - 1] == null) {
					throw new RuntimeException("Gap at:" + (local27 - 1));
				}
				@Pc(166) Class238 local166 = new Class238();
				local166.anInt5976 = local21;
				local166.anInt5963 = local166.anInt5971 = local38.anInt5971;
				local166.anInt5986 = local27;
				local38.aClass238Array1[local27] = local166;
				if (local38.aClass238Array2 != local38.aClass238Array1) {
					local38.aClass238Array2[local27] = local166;
				}
				if (arg1) {
					aClass238_8 = local166;
				} else {
					aClass238_9 = local166;
				}
				Static333.method5032(local38);
				return;
			}
			if (arg0 == 151) {
				local220 = arg1 ? aClass238_8 : aClass238_9;
				if (local220.anInt5986 == -1) {
					if (arg1) {
						throw new RuntimeException("Tried to .cc_delete static .active-component!");
					}
					throw new RuntimeException("Tried to cc_delete static active-component!");
				}
				local248 = Static305.method4761(local220.anInt5971);
				local248.aClass238Array1[local220.anInt5986] = null;
				Static333.method5032(local248);
				return;
			}
			if (arg0 == 152) {
				local220 = Static305.method4761(anIntArray219[--anInt4319]);
				local220.aClass238Array1 = null;
				local220.aClass238Array2 = null;
				Static333.method5032(local220);
				return;
			}
			if (arg0 == 200) {
				anInt4319 -= 2;
				local15 = anIntArray219[anInt4319];
				local21 = anIntArray219[anInt4319 + 1];
				local303 = Static333.method5035(local21, local15);
				if (local303 != null && local21 != -1) {
					anIntArray219[anInt4319++] = 1;
					if (arg1) {
						aClass238_8 = local303;
						return;
					}
					aClass238_9 = local303;
					return;
				}
				anIntArray219[anInt4319++] = 0;
				return;
			}
			if (arg0 == 201) {
				local15 = anIntArray219[--anInt4319];
				local248 = Static305.method4761(local15);
				if (local248 != null) {
					anIntArray219[anInt4319++] = 1;
					if (arg1) {
						aClass238_8 = local248;
						return;
					}
					aClass238_9 = local248;
					return;
				}
				anIntArray219[anInt4319++] = 0;
				return;
			}
			if (arg0 != 202 && arg0 != 204) {
				if (arg0 != 203 && arg0 != 205) {
					throw new IllegalStateException(String.valueOf(arg0));
				}
				if (arg0 == 203) {
					local21 = anIntArray219[--anInt4319];
					local220 = Static305.method4761(local21);
				} else {
					local220 = arg1 ? aClass238_8 : aClass238_9;
				}
				method3966(local220);
				return;
			}
			if (arg0 == 202) {
				local21 = anIntArray219[--anInt4319];
				local220 = Static305.method4761(local21);
			} else {
				local220 = arg1 ? aClass238_8 : aClass238_9;
			}
			method3965(local220);
			return;
		}
		@Pc(506) int local506;
		@Pc(575) boolean local575;
		if (arg0 < 500) {
			if (arg0 == 403) {
				anInt4319 -= 2;
				local15 = anIntArray219[anInt4319];
				local21 = anIntArray219[anInt4319 + 1];
				if (Static362.aClass4_Sub1_Sub1_Sub2_Sub1_4.aClass359_1 == null) {
					return;
				}
				for (local27 = 0; local27 < Static498.anIntArray463.length; local27++) {
					if (Static498.anIntArray463[local27] == local15) {
						Static362.aClass4_Sub1_Sub1_Sub2_Sub1_4.aClass359_1.method8153(local27, local21, Static239.aClass294_1);
						return;
					}
				}
				for (local506 = 0; local506 < Static283.anIntArray294.length; local506++) {
					if (Static283.anIntArray294[local506] == local15) {
						Static362.aClass4_Sub1_Sub1_Sub2_Sub1_4.aClass359_1.method8153(local506, local21, Static239.aClass294_1);
						return;
					}
				}
				return;
			}
			if (arg0 == 404) {
				anInt4319 -= 2;
				local15 = anIntArray219[anInt4319];
				local21 = anIntArray219[anInt4319 + 1];
				if (Static362.aClass4_Sub1_Sub1_Sub2_Sub1_4.aClass359_1 == null) {
					return;
				}
				Static362.aClass4_Sub1_Sub1_Sub2_Sub1_4.aClass359_1.method8158(local15, local21);
				return;
			}
			if (arg0 == 410) {
				local575 = anIntArray219[--anInt4319] != 0;
				if (Static362.aClass4_Sub1_Sub1_Sub2_Sub1_4.aClass359_1 == null) {
					return;
				}
				Static362.aClass4_Sub1_Sub1_Sub2_Sub1_4.aClass359_1.method8152(local575);
				return;
			}
			if (arg0 == 411) {
				anInt4319 -= 2;
				local15 = anIntArray219[anInt4319];
				local21 = anIntArray219[anInt4319 + 1];
				if (Static362.aClass4_Sub1_Sub1_Sub2_Sub1_4.aClass359_1 == null) {
					return;
				}
				Static362.aClass4_Sub1_Sub1_Sub2_Sub1_4.aClass359_1.method8154(local21, local15, Static82.aClass134_1);
				return;
			}
		} else if (arg0 >= 1000 && arg0 < 1100 || arg0 >= 2000 && arg0 < 2100) {
			if (arg0 >= 2000) {
				arg0 -= 1000;
				local220 = Static305.method4761(anIntArray219[--anInt4319]);
			} else {
				local220 = arg1 ? aClass238_8 : aClass238_9;
			}
			if (arg0 == 1000) {
				anInt4319 -= 4;
				local220.anInt5984 = anIntArray219[anInt4319];
				local220.anInt5992 = anIntArray219[anInt4319 + 1];
				local21 = anIntArray219[anInt4319 + 2];
				if (local21 < 0) {
					local21 = 0;
				} else if (local21 > 5) {
					local21 = 5;
				}
				local27 = anIntArray219[anInt4319 + 3];
				if (local27 < 0) {
					local27 = 0;
				} else if (local27 > 5) {
					local27 = 5;
				}
				local220.aByte84 = (byte) local21;
				local220.aByte86 = (byte) local27;
				Static333.method5032(local220);
				Static504.method6985(local220);
				if (local220.anInt5986 == -1) {
					Static408.method5961(local220.anInt5971);
				}
				return;
			}
			if (arg0 == 1001) {
				anInt4319 -= 4;
				local220.anInt5980 = anIntArray219[anInt4319];
				local220.anInt6031 = anIntArray219[anInt4319 + 1];
				local220.anInt5991 = 0;
				local220.anInt6024 = 0;
				local21 = anIntArray219[anInt4319 + 2];
				if (local21 < 0) {
					local21 = 0;
				} else if (local21 > 4) {
					local21 = 4;
				}
				local27 = anIntArray219[anInt4319 + 3];
				if (local27 < 0) {
					local27 = 0;
				} else if (local27 > 4) {
					local27 = 4;
				}
				local220.aByte85 = (byte) local21;
				local220.aByte83 = (byte) local27;
				Static333.method5032(local220);
				Static504.method6985(local220);
				if (local220.anInt5976 == 0) {
					Static374.method5569(local220, false);
				}
				return;
			}
			if (arg0 == 1003) {
				@Pc(834) boolean local834 = anIntArray219[--anInt4319] == 1;
				if (local220.aBoolean404 != local834) {
					local220.aBoolean404 = local834;
					Static333.method5032(local220);
				}
				if (local220.anInt5986 == -1) {
					Static20.method347(local220.anInt5971);
				}
				return;
			}
			if (arg0 == 1004) {
				anInt4319 -= 2;
				local220.anInt5961 = anIntArray219[anInt4319];
				local220.anInt5954 = anIntArray219[anInt4319 + 1];
				Static333.method5032(local220);
				Static504.method6985(local220);
				if (local220.anInt5976 == 0) {
					Static374.method5569(local220, false);
				}
				return;
			}
			if (arg0 == 1005) {
				local220.aBoolean397 = anIntArray219[--anInt4319] == 1;
				return;
			}
		} else {
			@Pc(1798) String local1798;
			@Pc(1401) String local1401;
			if (arg0 >= 1100 && arg0 < 1200 || !(arg0 < 2100 || arg0 >= 2200)) {
				if (arg0 >= 2000) {
					arg0 -= 1000;
					local220 = Static305.method4761(anIntArray219[--anInt4319]);
				} else {
					local220 = arg1 ? aClass238_8 : aClass238_9;
				}
				if (arg0 == 1100) {
					anInt4319 -= 2;
					local220.anInt5951 = anIntArray219[anInt4319];
					if (local220.anInt5951 > local220.anInt5941 - local220.anInt5985) {
						local220.anInt5951 = local220.anInt5941 - local220.anInt5985;
					}
					if (local220.anInt5951 < 0) {
						local220.anInt5951 = 0;
					}
					local220.anInt5953 = anIntArray219[anInt4319 + 1];
					if (local220.anInt5953 > local220.anInt5995 - local220.anInt5973) {
						local220.anInt5953 = local220.anInt5995 - local220.anInt5973;
					}
					if (local220.anInt5953 < 0) {
						local220.anInt5953 = 0;
					}
					Static333.method5032(local220);
					if (local220.anInt5986 == -1) {
						Static613.method8419(local220.anInt5971);
					}
					return;
				}
				if (arg0 == 1101) {
					local220.anInt5981 = anIntArray219[--anInt4319];
					Static333.method5032(local220);
					if (local220.anInt5986 == -1) {
						Static7.method123(local220.anInt5971);
					}
					return;
				}
				if (arg0 == 1102) {
					local220.aBoolean401 = anIntArray219[--anInt4319] == 1;
					Static333.method5032(local220);
					return;
				}
				if (arg0 == 1103) {
					local220.anInt5998 = anIntArray219[--anInt4319];
					Static333.method5032(local220);
					return;
				}
				if (arg0 == 1104) {
					local220.anInt6014 = anIntArray219[--anInt4319];
					Static333.method5032(local220);
					return;
				}
				if (arg0 == 1105) {
					local21 = anIntArray219[--anInt4319];
					if (local220.anInt5950 != local21) {
						local220.anInt5950 = local21;
						Static333.method5032(local220);
					}
					if (local220.anInt5986 == -1) {
						Static132.method1958(local220.anInt5971);
					}
					return;
				}
				if (arg0 == 1106) {
					local220.anInt5969 = anIntArray219[--anInt4319];
					Static333.method5032(local220);
					return;
				}
				if (arg0 == 1107) {
					local220.aBoolean403 = anIntArray219[--anInt4319] == 1;
					Static333.method5032(local220);
					return;
				}
				if (arg0 == 1108) {
					local220.anInt5967 = 1;
					local220.anInt5964 = anIntArray219[--anInt4319];
					Static333.method5032(local220);
					if (local220.anInt5986 == -1) {
						Static603.method8269(local220.anInt5971);
					}
					return;
				}
				if (arg0 == 1109) {
					anInt4319 -= 6;
					local220.anInt6011 = anIntArray219[anInt4319];
					local220.anInt6027 = anIntArray219[anInt4319 + 1];
					local220.anInt5946 = anIntArray219[anInt4319 + 2];
					local220.anInt6025 = anIntArray219[anInt4319 + 3];
					local220.anInt6002 = anIntArray219[anInt4319 + 4];
					local220.anInt5982 = anIntArray219[anInt4319 + 5];
					Static333.method5032(local220);
					if (local220.anInt5986 == -1) {
						Static373.method5557(local220.anInt5971);
						Static339.method5094(local220.anInt5971);
					}
					return;
				}
				if (arg0 == 1110) {
					local21 = anIntArray219[--anInt4319];
					if (local220.anInt5996 != local21) {
						local220.anInt5996 = local21;
						local220.anInt5968 = 0;
						local220.anInt6022 = 1;
						local220.anInt6023 = 0;
						@Pc(1343) Class264 local1343 = local220.anInt5996 == -1 ? null : Static315.aClass14_1.method227(local220.anInt5996);
						if (local1343 != null) {
							Static179.method3121(local220.anInt5968, local1343);
						}
						Static333.method5032(local220);
					}
					if (local220.anInt5986 == -1) {
						Static548.method7484(local220.anInt5971);
					}
					return;
				}
				if (arg0 == 1111) {
					local220.aBoolean407 = anIntArray219[--anInt4319] == 1;
					Static333.method5032(local220);
					return;
				}
				if (arg0 == 1112) {
					local1401 = aStringArray22[--anInt4321];
					if (!local1401.equals(local220.aString71)) {
						local220.aString71 = local1401;
						Static333.method5032(local220);
					}
					if (local220.anInt5986 == -1) {
						Static402.method5853(local220.anInt5971);
					}
					return;
				}
				if (arg0 == 1113) {
					local220.anInt5942 = anIntArray219[--anInt4319];
					Static333.method5032(local220);
					if (local220.anInt5986 == -1) {
						Static479.method6759(local220.anInt5971);
					}
					return;
				}
				if (arg0 == 1114) {
					anInt4319 -= 3;
					local220.anInt5945 = anIntArray219[anInt4319];
					local220.anInt5975 = anIntArray219[anInt4319 + 1];
					local220.anInt6007 = anIntArray219[anInt4319 + 2];
					Static333.method5032(local220);
					return;
				}
				if (arg0 == 1115) {
					local220.aBoolean400 = anIntArray219[--anInt4319] == 1;
					Static333.method5032(local220);
					return;
				}
				if (arg0 == 1116) {
					local220.anInt6030 = anIntArray219[--anInt4319];
					Static333.method5032(local220);
					return;
				}
				if (arg0 == 1117) {
					local220.anInt5997 = anIntArray219[--anInt4319];
					Static333.method5032(local220);
					return;
				}
				if (arg0 == 1118) {
					local220.aBoolean410 = anIntArray219[--anInt4319] == 1;
					Static333.method5032(local220);
					return;
				}
				if (arg0 == 1119) {
					local220.aBoolean408 = anIntArray219[--anInt4319] == 1;
					Static333.method5032(local220);
					return;
				}
				if (arg0 == 1120) {
					anInt4319 -= 2;
					local220.anInt5941 = anIntArray219[anInt4319];
					local220.anInt5995 = anIntArray219[anInt4319 + 1];
					Static333.method5032(local220);
					if (local220.anInt5976 == 0) {
						Static374.method5569(local220, false);
					}
					return;
				}
				if (arg0 == 1122) {
					local220.aBoolean399 = anIntArray219[--anInt4319] == 1;
					Static333.method5032(local220);
					return;
				}
				if (arg0 == 1123) {
					local220.anInt5982 = anIntArray219[--anInt4319];
					Static333.method5032(local220);
					if (local220.anInt5986 == -1) {
						Static373.method5557(local220.anInt5971);
					}
					return;
				}
				if (arg0 == 1124) {
					local21 = anIntArray219[--anInt4319];
					local220.aBoolean396 = local21 == 1;
					Static333.method5032(local220);
					return;
				}
				if (arg0 == 1125) {
					anInt4319 -= 2;
					local220.anInt5959 = anIntArray219[anInt4319];
					local220.anInt5939 = anIntArray219[anInt4319 + 1];
					Static333.method5032(local220);
					return;
				}
				if (arg0 == 1126) {
					local220.anInt6009 = anIntArray219[--anInt4319];
					Static333.method5032(local220);
					return;
				}
				@Pc(1763) Class22 local1763;
				if (arg0 == 1127) {
					anInt4319 -= 2;
					local21 = anIntArray219[anInt4319];
					local27 = anIntArray219[anInt4319 + 1];
					local1763 = Static612.aClass380_2.method8839(local21);
					if (local27 != local1763.anInt336) {
						local220.method5312(local21, local27);
						return;
					}
					local220.method5317(local21);
					return;
				}
				if (arg0 == 1128) {
					local21 = anIntArray219[--anInt4319];
					local1798 = aStringArray22[--anInt4321];
					local1763 = Static612.aClass380_2.method8839(local21);
					if (!local1763.aString4.equals(local1798)) {
						local220.method5306(local21, local1798);
						return;
					}
					local220.method5317(local21);
					return;
				}
				if (arg0 == 1129 || arg0 == 1130) {
					local21 = anIntArray219[--anInt4319];
					if ((local220.anInt5976 == 5 || arg0 != 1129) && (local220.anInt5976 == 4 || arg0 != 1130)) {
						if (local220.anInt5974 != local21) {
							local220.anInt5974 = local21;
							Static333.method5032(local220);
						}
						if (local220.anInt5986 == -1) {
							Static67.method1109(local220.anInt5971);
						}
						return;
					}
					return;
				}
				@Pc(1899) short local1899;
				@Pc(1906) short local1906;
				if (arg0 == 1131) {
					anInt4319 -= 3;
					local21 = anIntArray219[anInt4319];
					local1899 = (short) anIntArray219[anInt4319 + 1];
					local1906 = (short) anIntArray219[anInt4319 + 2];
					if (local21 >= 0 && local21 < 5) {
						local220.method5305(local1899, local1906, local21);
						Static333.method5032(local220);
						if (local220.anInt5986 == -1) {
							Static162.method2999(local220.anInt5971, local21);
						}
						return;
					}
					return;
				}
				if (arg0 == 1132) {
					anInt4319 -= 3;
					local21 = anIntArray219[anInt4319];
					local1899 = (short) anIntArray219[anInt4319 + 1];
					local1906 = (short) anIntArray219[anInt4319 + 2];
					if (local21 >= 0 && local21 < 5) {
						local220.method5320(local1906, local1899, local21);
						Static333.method5032(local220);
						if (local220.anInt5986 == -1) {
							Static372.method5544(local220.anInt5971, local21);
						}
						return;
					}
					return;
				}
			} else if (arg0 >= 1200 && arg0 < 1300 || arg0 >= 2200 && arg0 < 2300) {
				if (arg0 >= 2000) {
					arg0 -= 1000;
					local220 = Static305.method4761(anIntArray219[--anInt4319]);
				} else {
					local220 = arg1 ? aClass238_8 : aClass238_9;
				}
				Static333.method5032(local220);
				if (arg0 == 1200 || arg0 == 1205 || arg0 == 1208 || arg0 == 1209 || arg0 == 1212 || arg0 == 1213) {
					anInt4319 -= 2;
					local21 = anIntArray219[anInt4319];
					local27 = anIntArray219[anInt4319 + 1];
					if (local220.anInt5986 == -1) {
						Static415.method6098(local220.anInt5971);
						Static373.method5557(local220.anInt5971);
						Static339.method5094(local220.anInt5971);
					}
					if (local21 == -1) {
						local220.anInt5967 = 1;
						local220.anInt5964 = -1;
						local220.anInt5990 = -1;
						return;
					}
					local220.anInt5990 = local21;
					local220.anInt6017 = local27;
					if (arg0 == 1208 || arg0 == 1209) {
						local220.aBoolean398 = true;
					} else {
						local220.aBoolean398 = false;
					}
					@Pc(2137) Class246 local2137 = Static82.aClass134_1.method3191(local21);
					local220.anInt5946 = local2137.anInt6480;
					local220.anInt6025 = local2137.anInt6501;
					local220.anInt6002 = local2137.anInt6466;
					local220.anInt6011 = local2137.anInt6516;
					local220.anInt6027 = local2137.anInt6475;
					local220.anInt5982 = local2137.anInt6468;
					if (arg0 == 1205 || arg0 == 1209) {
						local220.anInt5952 = 0;
					} else if (arg0 == 1212 || arg0 == 1213) {
						local220.anInt5952 = 1;
					} else {
						local220.anInt5952 = 2;
					}
					if (local220.anInt5991 > 0) {
						local220.anInt5982 = local220.anInt5982 * 32 / local220.anInt5991;
						return;
					}
					if (local220.anInt5980 > 0) {
						local220.anInt5982 = local220.anInt5982 * 32 / local220.anInt5980;
					}
					return;
				}
				if (arg0 == 1201) {
					local220.anInt5967 = 2;
					local220.anInt5964 = anIntArray219[--anInt4319];
					if (local220.anInt5986 == -1) {
						Static603.method8269(local220.anInt5971);
					}
					return;
				}
				if (arg0 == 1202) {
					local220.anInt5967 = 3;
					local220.anInt5964 = -1;
					if (local220.anInt5986 == -1) {
						Static603.method8269(local220.anInt5971);
					}
					return;
				}
				if (arg0 == 1203) {
					local220.anInt5967 = 6;
					local220.anInt5964 = anIntArray219[--anInt4319];
					if (local220.anInt5986 == -1) {
						Static603.method8269(local220.anInt5971);
					}
					return;
				}
				if (arg0 == 1204) {
					local220.anInt5967 = 5;
					local220.anInt5964 = anIntArray219[--anInt4319];
					if (local220.anInt5986 == -1) {
						Static603.method8269(local220.anInt5971);
					}
					return;
				}
				if (arg0 == 1206) {
					anInt4319 -= 4;
					local220.anInt6020 = anIntArray219[anInt4319];
					local220.anInt6026 = anIntArray219[anInt4319 + 1];
					local220.anInt6005 = anIntArray219[anInt4319 + 2];
					local220.anInt5949 = anIntArray219[anInt4319 + 3];
					Static333.method5032(local220);
					return;
				}
				if (arg0 == 1207) {
					anInt4319 -= 2;
					local220.anInt6019 = anIntArray219[anInt4319];
					local220.anInt6008 = anIntArray219[anInt4319 + 1];
					Static333.method5032(local220);
					return;
				}
				if (arg0 == 1210) {
					anInt4319 -= 4;
					local220.anInt5964 = anIntArray219[anInt4319];
					local220.anInt6016 = anIntArray219[anInt4319 + 1];
					if (anIntArray219[anInt4319 + 2] == 1) {
						local220.anInt5967 = 9;
					} else {
						local220.anInt5967 = 8;
					}
					if (anIntArray219[anInt4319 + 3] == 1) {
						local220.aBoolean398 = true;
					} else {
						local220.aBoolean398 = false;
					}
					if (local220.anInt5986 == -1) {
						Static603.method8269(local220.anInt5971);
					}
					return;
				}
				if (arg0 == 1211) {
					local220.anInt5967 = 5;
					local220.anInt5964 = Static649.anInt10621;
					local220.anInt6016 = 0;
					if (local220.anInt5986 == -1) {
						Static603.method8269(local220.anInt5971);
					}
					return;
				}
			} else {
				@Pc(2879) int local2879;
				if ((arg0 < 1300 || arg0 >= 1400) && (arg0 < 2300 || arg0 >= 2400)) {
					if (arg0 >= 1400 && arg0 < 1500 || arg0 >= 2400 && arg0 < 2500) {
						if (arg0 >= 2000) {
							arg0 -= 1000;
							local220 = Static305.method4761(anIntArray219[--anInt4319]);
						} else {
							local220 = arg1 ? aClass238_8 : aClass238_9;
						}
						if (arg0 == 1499) {
							local220.method5322();
							return;
						}
						local1401 = aStringArray22[--anInt4321];
						@Pc(2978) int[] local2978 = null;
						if (local1401.length() > 0 && local1401.charAt(local1401.length() - 1) == 'Y') {
							local506 = anIntArray219[--anInt4319];
							if (local506 > 0) {
								local2978 = new int[local506];
								while (local506-- > 0) {
									local2978[local506] = anIntArray219[--anInt4319];
								}
							}
							local1401 = local1401.substring(0, local1401.length() - 1);
						}
						@Pc(3032) Object[] local3032 = new Object[local1401.length() + 1];
						for (local2879 = local3032.length - 1; local2879 >= 1; local2879--) {
							if (local1401.charAt(local2879 - 1) == 's') {
								local3032[local2879] = aStringArray22[--anInt4321];
							} else if (local1401.charAt(local2879 - 1) == '§') {
								local3032[local2879] = Long.valueOf(aLongArray15[--anInt4318]);
							} else {
								local3032[local2879] = Integer.valueOf(anIntArray219[--anInt4319]);
							}
						}
						local72 = anIntArray219[--anInt4319];
						if (local72 == -1) {
							local3032 = null;
						} else {
							local3032[0] = Integer.valueOf(local72);
						}
						if (arg0 == 1400) {
							local220.anObjectArray9 = local3032;
						} else if (arg0 == 1401) {
							local220.anObjectArray14 = local3032;
						} else if (arg0 == 1402) {
							local220.anObjectArray13 = local3032;
						} else if (arg0 == 1403) {
							local220.anObjectArray25 = local3032;
						} else if (arg0 == 1404) {
							local220.anObjectArray28 = local3032;
						} else if (arg0 == 1405) {
							local220.anObjectArray32 = local3032;
						} else if (arg0 == 1406) {
							local220.anObjectArray18 = local3032;
						} else if (arg0 == 1407) {
							local220.anObjectArray15 = local3032;
							local220.anIntArray350 = local2978;
						} else if (arg0 == 1408) {
							local220.anObjectArray3 = local3032;
						} else if (arg0 == 1409) {
							local220.anObjectArray33 = local3032;
						} else if (arg0 == 1410) {
							local220.anObjectArray16 = local3032;
						} else if (arg0 == 1411) {
							local220.anObjectArray10 = local3032;
						} else if (arg0 == 1412) {
							local220.anObjectArray27 = local3032;
						} else if (arg0 == 1414) {
							local220.anObjectArray24 = local3032;
							local220.anIntArray351 = local2978;
						} else if (arg0 == 1415) {
							local220.anObjectArray17 = local3032;
							local220.anIntArray355 = local2978;
						} else if (arg0 == 1416) {
							local220.anObjectArray31 = local3032;
						} else if (arg0 == 1417) {
							local220.anObjectArray22 = local3032;
						} else if (arg0 == 1418) {
							local220.anObjectArray4 = local3032;
						} else if (arg0 == 1419) {
							local220.anObjectArray19 = local3032;
						} else if (arg0 == 1420) {
							local220.anObjectArray36 = local3032;
						} else if (arg0 == 1421) {
							local220.anObjectArray8 = local3032;
						} else if (arg0 == 1422) {
							local220.anObjectArray6 = local3032;
						} else if (arg0 == 1423) {
							local220.anObjectArray35 = local3032;
						} else if (arg0 == 1424) {
							local220.anObjectArray7 = local3032;
						} else if (arg0 == 1425) {
							local220.anObjectArray5 = local3032;
						} else if (arg0 == 1426) {
							local220.anObjectArray12 = local3032;
						} else if (arg0 == 1427) {
							local220.anObjectArray29 = local3032;
						} else if (arg0 == 1428) {
							local220.anObjectArray30 = local3032;
							local220.anIntArray347 = local2978;
						} else if (arg0 == 1429) {
							local220.anObjectArray26 = local3032;
							local220.anIntArray348 = local2978;
						} else if (arg0 == 1430) {
							local220.anObjectArray23 = local3032;
						} else if (arg0 == 1431) {
							local220.anObjectArray34 = local3032;
						} else if (arg0 == 1432) {
							local220.anObjectArray11 = local3032;
						} else if (arg0 == 1433) {
							local220.anObjectArray20 = local3032;
						}
						local220.aBoolean409 = true;
						return;
					}
					if (arg0 < 1600) {
						local220 = arg1 ? aClass238_8 : aClass238_9;
						if (arg0 == 1500) {
							anIntArray219[anInt4319++] = local220.anInt6028;
							return;
						}
						if (arg0 == 1501) {
							anIntArray219[anInt4319++] = local220.anInt5989;
							return;
						}
						if (arg0 == 1502) {
							anIntArray219[anInt4319++] = local220.anInt5985;
							return;
						}
						if (arg0 == 1503) {
							anIntArray219[anInt4319++] = local220.anInt5973;
							return;
						}
						if (arg0 == 1504) {
							anIntArray219[anInt4319++] = local220.aBoolean404 ? 1 : 0;
							return;
						}
						if (arg0 == 1505) {
							anIntArray219[anInt4319++] = local220.anInt5963;
							return;
						}
						if (arg0 == 1506) {
							local248 = Static300.method4694(local220);
							anIntArray219[anInt4319++] = local248 == null ? -1 : local248.anInt5971;
							return;
						}
						if (arg0 == 1507) {
							anIntArray219[anInt4319++] = local220.anInt5981;
							return;
						}
					} else {
						@Pc(3749) Class22 local3749;
						if (arg0 < 1700) {
							local220 = arg1 ? aClass238_8 : aClass238_9;
							if (arg0 == 1600) {
								anIntArray219[anInt4319++] = local220.anInt5951;
								return;
							}
							if (arg0 == 1601) {
								anIntArray219[anInt4319++] = local220.anInt5953;
								return;
							}
							if (arg0 == 1602) {
								aStringArray22[anInt4321++] = local220.aString71;
								return;
							}
							if (arg0 == 1603) {
								anIntArray219[anInt4319++] = local220.anInt5941;
								return;
							}
							if (arg0 == 1604) {
								anIntArray219[anInt4319++] = local220.anInt5995;
								return;
							}
							if (arg0 == 1605) {
								anIntArray219[anInt4319++] = local220.anInt5982;
								return;
							}
							if (arg0 == 1606) {
								anIntArray219[anInt4319++] = local220.anInt5946;
								return;
							}
							if (arg0 == 1607) {
								anIntArray219[anInt4319++] = local220.anInt6002;
								return;
							}
							if (arg0 == 1608) {
								anIntArray219[anInt4319++] = local220.anInt6025;
								return;
							}
							if (arg0 == 1609) {
								anIntArray219[anInt4319++] = local220.anInt5998;
								return;
							}
							if (arg0 == 1610) {
								anIntArray219[anInt4319++] = local220.anInt6011;
								return;
							}
							if (arg0 == 1611) {
								anIntArray219[anInt4319++] = local220.anInt6027;
								return;
							}
							if (arg0 == 1612) {
								anIntArray219[anInt4319++] = local220.anInt5950;
								return;
							}
							if (arg0 == 1613) {
								local21 = anIntArray219[--anInt4319];
								local3749 = Static612.aClass380_2.method8839(local21);
								if (local3749.method385()) {
									aStringArray22[anInt4321++] = local220.method5311(local3749.aString4, local21);
									return;
								}
								anIntArray219[anInt4319++] = local220.method5319(local3749.anInt336, local21);
								return;
							}
							if (arg0 == 1614) {
								anIntArray219[anInt4319++] = local220.anInt5969;
								return;
							}
							if (arg0 == 2614) {
								anIntArray219[anInt4319++] = local220.anInt5967 == 1 ? local220.anInt5964 : -1;
								return;
							}
						} else if (arg0 < 1800) {
							local220 = arg1 ? aClass238_8 : aClass238_9;
							if (arg0 == 1700) {
								anIntArray219[anInt4319++] = local220.anInt5990;
								return;
							}
							if (arg0 == 1701) {
								if (local220.anInt5990 != -1) {
									anIntArray219[anInt4319++] = local220.anInt6017;
									return;
								}
								anIntArray219[anInt4319++] = 0;
								return;
							}
							if (arg0 == 1702) {
								anIntArray219[anInt4319++] = local220.anInt5986;
								return;
							}
						} else if (arg0 < 1900) {
							local220 = arg1 ? aClass238_8 : aClass238_9;
							if (arg0 == 1800) {
								anIntArray219[anInt4319++] = Static73.method1209(local220).method1972();
								return;
							}
							if (arg0 == 1801) {
								local21 = anIntArray219[--anInt4319];
								local21--;
								if (local220.aStringArray28 != null && local21 < local220.aStringArray28.length && local220.aStringArray28[local21] != null) {
									aStringArray22[anInt4321++] = local220.aStringArray28[local21];
									return;
								}
								aStringArray22[anInt4321++] = "";
								return;
							}
							if (arg0 == 1802) {
								if (local220.aString69 == null) {
									aStringArray22[anInt4321++] = "";
									return;
								}
								aStringArray22[anInt4321++] = local220.aString69;
								return;
							}
						} else if (arg0 < 2000 || arg0 >= 2900 && arg0 < 3000) {
							if (arg0 >= 2000) {
								local220 = Static305.method4761(anIntArray219[--anInt4319]);
								arg0 -= 1000;
							} else {
								local220 = arg1 ? aClass238_8 : aClass238_9;
							}
							if (anInt4325 >= 10) {
								throw new RuntimeException("C29xx-1");
							}
							if (arg0 == 1927) {
								if (local220.anObjectArray29 == null) {
									return;
								}
								@Pc(4056) Class5_Sub24 local4056 = new Class5_Sub24();
								local4056.aClass238_6 = local220;
								local4056.anObjectArray2 = local220.anObjectArray29;
								local4056.anInt4052 = anInt4325 + 1;
								Static196.aClass20_11.method370(local4056);
								return;
							}
						} else if (arg0 < 2600) {
							local220 = Static305.method4761(anIntArray219[--anInt4319]);
							if (arg0 == 2500) {
								anIntArray219[anInt4319++] = local220.anInt6028;
								return;
							}
							if (arg0 == 2501) {
								anIntArray219[anInt4319++] = local220.anInt5989;
								return;
							}
							if (arg0 == 2502) {
								anIntArray219[anInt4319++] = local220.anInt5985;
								return;
							}
							if (arg0 == 2503) {
								anIntArray219[anInt4319++] = local220.anInt5973;
								return;
							}
							if (arg0 == 2504) {
								anIntArray219[anInt4319++] = local220.aBoolean404 ? 1 : 0;
								return;
							}
							if (arg0 == 2505) {
								anIntArray219[anInt4319++] = local220.anInt5963;
								return;
							}
							if (arg0 == 2506) {
								local248 = Static300.method4694(local220);
								anIntArray219[anInt4319++] = local248 == null ? -1 : local248.anInt5971;
								return;
							}
							if (arg0 == 2507) {
								anIntArray219[anInt4319++] = local220.anInt5981;
								return;
							}
						} else if (arg0 < 2700) {
							local220 = Static305.method4761(anIntArray219[--anInt4319]);
							if (arg0 == 2600) {
								anIntArray219[anInt4319++] = local220.anInt5951;
								return;
							}
							if (arg0 == 2601) {
								anIntArray219[anInt4319++] = local220.anInt5953;
								return;
							}
							if (arg0 == 2602) {
								aStringArray22[anInt4321++] = local220.aString71;
								return;
							}
							if (arg0 == 2603) {
								anIntArray219[anInt4319++] = local220.anInt5941;
								return;
							}
							if (arg0 == 2604) {
								anIntArray219[anInt4319++] = local220.anInt5995;
								return;
							}
							if (arg0 == 2605) {
								anIntArray219[anInt4319++] = local220.anInt5982;
								return;
							}
							if (arg0 == 2606) {
								anIntArray219[anInt4319++] = local220.anInt5946;
								return;
							}
							if (arg0 == 2607) {
								anIntArray219[anInt4319++] = local220.anInt6002;
								return;
							}
							if (arg0 == 2608) {
								anIntArray219[anInt4319++] = local220.anInt6025;
								return;
							}
							if (arg0 == 2609) {
								anIntArray219[anInt4319++] = local220.anInt5998;
								return;
							}
							if (arg0 == 2610) {
								anIntArray219[anInt4319++] = local220.anInt6011;
								return;
							}
							if (arg0 == 2611) {
								anIntArray219[anInt4319++] = local220.anInt6027;
								return;
							}
							if (arg0 == 2612) {
								anIntArray219[anInt4319++] = local220.anInt5950;
								return;
							}
							if (arg0 == 2613) {
								anIntArray219[anInt4319++] = local220.anInt5969;
								return;
							}
							if (arg0 == 2614) {
								anIntArray219[anInt4319++] = local220.anInt5967 == 1 ? local220.anInt5964 : -1;
								return;
							}
						} else {
							@Pc(4633) Class5_Sub38 local4633;
							@Pc(4526) Class5_Sub38 local4526;
							if (arg0 < 2800) {
								if (arg0 == 2700) {
									local220 = Static305.method4761(anIntArray219[--anInt4319]);
									anIntArray219[anInt4319++] = local220.anInt5990;
									return;
								}
								if (arg0 == 2701) {
									local220 = Static305.method4761(anIntArray219[--anInt4319]);
									if (local220.anInt5990 != -1) {
										anIntArray219[anInt4319++] = local220.anInt6017;
										return;
									}
									anIntArray219[anInt4319++] = 0;
									return;
								}
								if (arg0 == 2702) {
									local15 = anIntArray219[--anInt4319];
									local4526 = (Class5_Sub38) Static438.aClass306_31.method6943((long) local15);
									if (local4526 != null) {
										anIntArray219[anInt4319++] = 1;
										return;
									}
									anIntArray219[anInt4319++] = 0;
									return;
								}
								if (arg0 == 2703) {
									local220 = Static305.method4761(anIntArray219[--anInt4319]);
									if (local220.aClass238Array1 == null) {
										anIntArray219[anInt4319++] = 0;
										return;
									}
									local21 = local220.aClass238Array1.length;
									for (local27 = 0; local27 < local220.aClass238Array1.length; local27++) {
										if (local220.aClass238Array1[local27] == null) {
											local21 = local27;
											break;
										}
									}
									anIntArray219[anInt4319++] = local21;
									return;
								}
								if (arg0 == 2704 || arg0 == 2705) {
									anInt4319 -= 2;
									local15 = anIntArray219[anInt4319];
									local21 = anIntArray219[anInt4319 + 1];
									local4633 = (Class5_Sub38) Static438.aClass306_31.method6943((long) local15);
									if (local4633 != null && local4633.anInt6418 == local21) {
										anIntArray219[anInt4319++] = 1;
										return;
									}
									anIntArray219[anInt4319++] = 0;
									return;
								}
							} else if (arg0 < 2900) {
								local220 = Static305.method4761(anIntArray219[--anInt4319]);
								if (arg0 == 2800) {
									anIntArray219[anInt4319++] = Static73.method1209(local220).method1972();
									return;
								}
								if (arg0 == 2801) {
									local21 = anIntArray219[--anInt4319];
									local21--;
									if (local220.aStringArray28 != null && local21 < local220.aStringArray28.length && local220.aStringArray28[local21] != null) {
										aStringArray22[anInt4321++] = local220.aStringArray28[local21];
										return;
									}
									aStringArray22[anInt4321++] = "";
									return;
								}
								if (arg0 == 2802) {
									if (local220.aString69 == null) {
										aStringArray22[anInt4321++] = "";
										return;
									}
									aStringArray22[anInt4321++] = local220.aString69;
									return;
								}
							} else {
								@Pc(4878) Class5_Sub41 local4878;
								@Pc(4784) String local4784;
								if (arg0 < 3200) {
									if (arg0 == 3100) {
										local4784 = aStringArray22[--anInt4321];
										Static91.method5827(local4784);
										return;
									}
									if (arg0 == 3101) {
										anInt4319 -= 2;
										Static490.method6894(Static362.aClass4_Sub1_Sub1_Sub2_Sub1_4, anIntArray219[anInt4319], anIntArray219[anInt4319 + 1]);
										return;
									}
									if (arg0 == 3103) {
										Static300.method4695();
										return;
									}
									if (arg0 == 3104) {
										local4784 = aStringArray22[--anInt4321];
										local21 = 0;
										if (Static352.method5186(local4784)) {
											local21 = Static407.method5956(local4784);
										}
										@Pc(4847) Class5_Sub41 local4847 = Static647.method8905(Static303.aClass381_243, Static4.aClass389_17.aClass393_2);
										local4847.aClass5_Sub36_Sub2_1.method7287(local21);
										Static4.aClass389_17.method9079(local4847);
										return;
									}
									if (arg0 == 3105) {
										local4784 = aStringArray22[--anInt4321];
										local4878 = Static647.method8905(Static162.aClass381_76, Static4.aClass389_17.aClass393_2);
										local4878.aClass5_Sub36_Sub2_1.method7324(local4784.length() + 1);
										local4878.aClass5_Sub36_Sub2_1.method7327(local4784);
										Static4.aClass389_17.method9079(local4878);
										return;
									}
									if (arg0 == 3106) {
										local4784 = aStringArray22[--anInt4321];
										local4878 = Static647.method8905(Static218.aClass381_93, Static4.aClass389_17.aClass393_2);
										local4878.aClass5_Sub36_Sub2_1.method7324(local4784.length() + 1);
										local4878.aClass5_Sub36_Sub2_1.method7327(local4784);
										Static4.aClass389_17.method9079(local4878);
										return;
									}
									if (arg0 == 3107) {
										local15 = anIntArray219[--anInt4319];
										local1401 = aStringArray22[--anInt4321];
										Static463.method6551(local15, local1401);
										return;
									}
									if (arg0 == 3108) {
										anInt4319 -= 3;
										local15 = anIntArray219[anInt4319];
										local21 = anIntArray219[anInt4319 + 1];
										local27 = anIntArray219[anInt4319 + 2];
										local38 = Static305.method4761(local27);
										Static650.method8982(local38, local21, local15);
										return;
									}
									if (arg0 == 3109) {
										anInt4319 -= 2;
										local15 = anIntArray219[anInt4319];
										local21 = anIntArray219[anInt4319 + 1];
										local303 = arg1 ? aClass238_8 : aClass238_9;
										Static650.method8982(local303, local21, local15);
										return;
									}
									if (arg0 == 3110) {
										local15 = anIntArray219[--anInt4319];
										local4878 = Static647.method8905(Static53.aClass381_28, Static4.aClass389_17.aClass393_2);
										local4878.aClass5_Sub36_Sub2_1.method7296(local15);
										Static4.aClass389_17.method9079(local4878);
										return;
									}
									if (arg0 == 3111) {
										anInt4319 -= 2;
										local15 = anIntArray219[anInt4319];
										local21 = anIntArray219[anInt4319 + 1];
										local4633 = (Class5_Sub38) Static438.aClass306_31.method6943((long) local15);
										if (local4633 != null) {
											Static655.method9010(true, local4633, local4633.anInt6418 != local21);
										}
										Static191.method8803(true, local15, local21, 3);
										return;
									}
									if (arg0 == 3112) {
										anInt4319--;
										local15 = anIntArray219[anInt4319];
										local4526 = (Class5_Sub38) Static438.aClass306_31.method6943((long) local15);
										if (local4526 != null && local4526.anInt6419 == 3) {
											Static655.method9010(true, local4526, true);
										}
										return;
									}
									if (arg0 == 3113) {
										Static143.method2613(aStringArray22[--anInt4321]);
										return;
									}
									if (arg0 == 3114) {
										anInt4319 -= 2;
										local15 = anIntArray219[anInt4319];
										local21 = anIntArray219[anInt4319 + 1];
										local1798 = aStringArray22[--anInt4321];
										Static464.method6554("", "", local15, "", local1798, local21);
										return;
									}
									if (arg0 == 3115) {
										anInt4319 -= 11;
										@Pc(5193) Class189[] local5193 = Static447.method6379();
										@Pc(5196) Class346[] local5196 = Static378.method5602();
										Static180.method3131(anIntArray219[anInt4319 + 10], anIntArray219[anInt4319 + 8], anIntArray219[anInt4319 + 6], local5196[anIntArray219[anInt4319 + 1]], anIntArray219[anInt4319 + 5], anIntArray219[anInt4319 + 2], anIntArray219[anInt4319 + 4], anIntArray219[anInt4319 + 9], anIntArray219[anInt4319 + 7], local5193[anIntArray219[anInt4319]], anIntArray219[anInt4319 + 3]);
										return;
									}
									if (arg0 == 3116) {
										local15 = anIntArray219[--anInt4319];
										local4878 = Static647.method8905(Static334.aClass381_255, Static4.aClass389_17.aClass393_2);
										local4878.aClass5_Sub36_Sub2_1.method7296(local15);
										Static4.aClass389_17.method9079(local4878);
										return;
									}
									if (arg0 == 3117) {
										local4784 = aStringArray22[--anInt4321];
										local4878 = Static647.method8905(Static578.aClass381_239, Static4.aClass389_17.aClass393_2);
										local4878.aClass5_Sub36_Sub2_1.method7324(local4784.length() + 1);
										local4878.aClass5_Sub36_Sub2_1.method7327(local4784);
										Static4.aClass389_17.method9079(local4878);
										return;
									}
								} else if (arg0 < 3300) {
									if (arg0 == 3200) {
										anInt4319 -= 3;
										Static649.method8959(255, 256, anIntArray219[anInt4319 + 1], anIntArray219[anInt4319 + 2], anIntArray219[anInt4319]);
										return;
									}
									if (arg0 == 3201) {
										Static613.method8422(50, anIntArray219[--anInt4319], 255);
										return;
									}
									if (arg0 == 3202) {
										anInt4319 -= 2;
										Static671.method9112(255, anIntArray219[anInt4319], anIntArray219[anInt4319 + 1]);
										return;
									}
									if (arg0 == 3203) {
										anInt4319 -= 4;
										Static649.method8959(anIntArray219[anInt4319 + 3], 256, anIntArray219[anInt4319 + 1], anIntArray219[anInt4319 + 2], anIntArray219[anInt4319]);
										return;
									}
									if (arg0 == 3204) {
										anInt4319 -= 3;
										Static613.method8422(anIntArray219[anInt4319 + 2], anIntArray219[anInt4319], anIntArray219[anInt4319 + 1]);
										return;
									}
									if (arg0 == 3205) {
										anInt4319 -= 3;
										Static671.method9112(anIntArray219[anInt4319 + 2], anIntArray219[anInt4319], anIntArray219[anInt4319 + 1]);
										return;
									}
									if (arg0 == 3206) {
										anInt4319 -= 4;
										Static152.method2787(anIntArray219[anInt4319 + 1], 256, anIntArray219[anInt4319], anIntArray219[anInt4319 + 2], anIntArray219[anInt4319 + 3], false);
										return;
									}
									if (arg0 == 3207) {
										anInt4319 -= 4;
										Static152.method2787(anIntArray219[anInt4319 + 1], 256, anIntArray219[anInt4319], anIntArray219[anInt4319 + 2], anIntArray219[anInt4319 + 3], true);
										return;
									}
									if (arg0 == 3208) {
										anInt4319 -= 5;
										Static649.method8959(anIntArray219[anInt4319 + 3], anIntArray219[anInt4319 + 4], anIntArray219[anInt4319 + 1], anIntArray219[anInt4319 + 2], anIntArray219[anInt4319]);
										return;
									}
									if (arg0 == 3209) {
										anInt4319 -= 5;
										Static152.method2787(anIntArray219[anInt4319 + 1], anIntArray219[anInt4319 + 4], anIntArray219[anInt4319], anIntArray219[anInt4319 + 2], anIntArray219[anInt4319 + 3], false);
										return;
									}
								} else if (arg0 < 3400) {
									if (arg0 == 3300) {
										anIntArray219[anInt4319++] = Static565.anInt8921;
										return;
									}
									if (arg0 == 3301) {
										anInt4319 -= 2;
										local15 = anIntArray219[anInt4319];
										local21 = anIntArray219[anInt4319 + 1];
										anIntArray219[anInt4319++] = Static408.method5959(local21, local15, false);
										return;
									}
									if (arg0 == 3302) {
										anInt4319 -= 2;
										local15 = anIntArray219[anInt4319];
										local21 = anIntArray219[anInt4319 + 1];
										anIntArray219[anInt4319++] = Static663.method9086(local15, false, local21);
										return;
									}
									if (arg0 == 3303) {
										anInt4319 -= 2;
										local15 = anIntArray219[anInt4319];
										local21 = anIntArray219[anInt4319 + 1];
										anIntArray219[anInt4319++] = Static405.method9201(false, local21, local15);
										return;
									}
									if (arg0 == 3304) {
										local15 = anIntArray219[--anInt4319];
										anIntArray219[anInt4319++] = Static279.aClass347_1.method7721(local15).anInt5648;
										return;
									}
									if (arg0 == 3305) {
										local15 = anIntArray219[--anInt4319];
										anIntArray219[anInt4319++] = Static406.anIntArray78[local15];
										return;
									}
									if (arg0 == 3306) {
										local15 = anIntArray219[--anInt4319];
										anIntArray219[anInt4319++] = Static241.anIntArray212[local15];
										return;
									}
									if (arg0 == 3307) {
										local15 = anIntArray219[--anInt4319];
										anIntArray219[anInt4319++] = Static425.anIntArray429[local15];
										return;
									}
									if (arg0 == 3308) {
										@Pc(5802) byte local5802 = Static362.aClass4_Sub1_Sub1_Sub2_Sub1_4.aByte139;
										local21 = (Static362.aClass4_Sub1_Sub1_Sub2_Sub1_4.anInt9805 >> 9) + Static315.anInt5380;
										local27 = (Static362.aClass4_Sub1_Sub1_Sub2_Sub1_4.anInt9803 >> 9) + Static290.anInt5128;
										anIntArray219[anInt4319++] = (local5802 << 28) + (local21 << 14) + local27;
										return;
									}
									if (arg0 == 3309) {
										local15 = anIntArray219[--anInt4319];
										anIntArray219[anInt4319++] = local15 >> 14 & 0x3FFF;
										return;
									}
									if (arg0 == 3310) {
										local15 = anIntArray219[--anInt4319];
										anIntArray219[anInt4319++] = local15 >> 28;
										return;
									}
									if (arg0 == 3311) {
										local15 = anIntArray219[--anInt4319];
										anIntArray219[anInt4319++] = local15 & 0x3FFF;
										return;
									}
									if (arg0 == 3312) {
										anIntArray219[anInt4319++] = Static504.aBoolean543 ? 1 : 0;
										return;
									}
									if (arg0 == 3313) {
										anInt4319 -= 2;
										local15 = anIntArray219[anInt4319];
										local21 = anIntArray219[anInt4319 + 1];
										anIntArray219[anInt4319++] = Static408.method5959(local21, local15, true);
										return;
									}
									if (arg0 == 3314) {
										anInt4319 -= 2;
										local15 = anIntArray219[anInt4319];
										local21 = anIntArray219[anInt4319 + 1];
										anIntArray219[anInt4319++] = Static663.method9086(local15, true, local21);
										return;
									}
									if (arg0 == 3315) {
										anInt4319 -= 2;
										local15 = anIntArray219[anInt4319];
										local21 = anIntArray219[anInt4319 + 1];
										anIntArray219[anInt4319++] = Static405.method9201(true, local21, local15);
										return;
									}
									if (arg0 == 3316) {
										if (Static296.anInt5190 >= 2) {
											anIntArray219[anInt4319++] = Static296.anInt5190;
											return;
										}
										anIntArray219[anInt4319++] = 0;
										return;
									}
									if (arg0 == 3317) {
										anIntArray219[anInt4319++] = Static413.anInt6991;
										return;
									}
									if (arg0 == 3318) {
										anIntArray219[anInt4319++] = Static68.aClass258_6.anInt6748;
										return;
									}
									if (arg0 == 3321) {
										anIntArray219[anInt4319++] = Static356.anInt5858;
										return;
									}
									if (arg0 == 3322) {
										anIntArray219[anInt4319++] = Static129.anInt2160;
										return;
									}
									if (arg0 == 3323) {
										if (Static198.anInt3601 >= 5 && Static198.anInt3601 <= 9) {
											anIntArray219[anInt4319++] = 1;
											return;
										}
										anIntArray219[anInt4319++] = 0;
										return;
									}
									if (arg0 == 3324) {
										if (Static198.anInt3601 >= 5 && Static198.anInt3601 <= 9) {
											anIntArray219[anInt4319++] = Static198.anInt3601;
											return;
										}
										anIntArray219[anInt4319++] = 0;
										return;
									}
									if (arg0 == 3325) {
										anIntArray219[anInt4319++] = Static82.aBoolean119 ? 1 : 0;
										return;
									}
									if (arg0 == 3326) {
										anIntArray219[anInt4319++] = Static362.aClass4_Sub1_Sub1_Sub2_Sub1_4.anInt4565;
										return;
									}
									if (arg0 == 3327) {
										anIntArray219[anInt4319++] = Static362.aClass4_Sub1_Sub1_Sub2_Sub1_4.aClass359_1 != null && Static362.aClass4_Sub1_Sub1_Sub2_Sub1_4.aClass359_1.aBoolean669 ? 1 : 0;
										return;
									}
									if (arg0 == 3329) {
										anIntArray219[anInt4319++] = Static76.aBoolean116 ? 1 : 0;
										return;
									}
									if (arg0 == 3330) {
										local15 = anIntArray219[--anInt4319];
										anIntArray219[anInt4319++] = Static93.method1473(local15);
										return;
									}
									if (arg0 == 3331) {
										anInt4319 -= 2;
										local15 = anIntArray219[anInt4319];
										local21 = anIntArray219[anInt4319 + 1];
										anIntArray219[anInt4319++] = Static348.method5139(local21, local15, false);
										return;
									}
									if (arg0 == 3332) {
										anInt4319 -= 2;
										local15 = anIntArray219[anInt4319];
										local21 = anIntArray219[anInt4319 + 1];
										anIntArray219[anInt4319++] = Static348.method5139(local21, local15, true);
										return;
									}
									if (arg0 == 3333) {
										anIntArray219[anInt4319++] = Static125.method1873();
										return;
									}
									if (arg0 == 3335) {
										anIntArray219[anInt4319++] = Static375.anInt7800;
										return;
									}
									if (arg0 == 3336) {
										anInt4319 -= 4;
										local15 = anIntArray219[anInt4319];
										local21 = anIntArray219[anInt4319 + 1];
										local27 = anIntArray219[anInt4319 + 2];
										local506 = anIntArray219[anInt4319 + 3];
										local15 += local21 << 14;
										local15 += local27 << 28;
										local15 += local506;
										anIntArray219[anInt4319++] = local15;
										return;
									}
									if (arg0 == 3337) {
										anIntArray219[anInt4319++] = Static653.anInt10666;
										return;
									}
									if (arg0 == 3338) {
										anIntArray219[anInt4319++] = Static475.method8942();
										return;
									}
									if (arg0 == 3339) {
										anIntArray219[anInt4319++] = 0;
										return;
									}
									if (arg0 == 3340) {
										anIntArray219[anInt4319++] = Static645.aBoolean756 ? 1 : 0;
										return;
									}
									if (arg0 == 3341) {
										anIntArray219[anInt4319++] = Static588.aBoolean668 ? 1 : 0;
										return;
									}
									if (arg0 == 3342) {
										anIntArray219[anInt4319++] = Static300.aClass164_1.method4999();
										return;
									}
									if (arg0 == 3343) {
										anIntArray219[anInt4319++] = Static300.aClass164_1.method5000();
										return;
									}
									if (arg0 == 3344) {
										aStringArray22[anInt4321++] = Static366.method5330();
										return;
									}
									if (arg0 == 3345) {
										aStringArray22[anInt4321++] = Static572.method7702();
										return;
									}
									if (arg0 == 3346) {
										anIntArray219[anInt4319++] = Static178.method3119();
										return;
									}
									if (arg0 == 3347) {
										anIntArray219[anInt4319++] = Static469.anInt7627;
										return;
									}
									if (arg0 == 3349) {
										anIntArray219[anInt4319++] = Static362.aClass4_Sub1_Sub1_Sub2_Sub1_4.aClass49_7.method978() >> 3;
										return;
									}
								} else if (arg0 < 3500) {
									@Pc(6606) Class127 local6606;
									if (arg0 == 3400) {
										anInt4319 -= 2;
										local15 = anIntArray219[anInt4319];
										local21 = anIntArray219[anInt4319 + 1];
										local6606 = Static116.aClass237_3.method5240(local15);
										aStringArray22[anInt4321++] = local6606.method3102(local21);
										return;
									}
									if (arg0 == 3408) {
										anInt4319 -= 4;
										local15 = anIntArray219[anInt4319];
										local21 = anIntArray219[anInt4319 + 1];
										local27 = anIntArray219[anInt4319 + 2];
										local506 = anIntArray219[anInt4319 + 3];
										@Pc(6652) Class127 local6652 = Static116.aClass237_3.method5240(local27);
										if (local6652.aChar4 == local15 && local6652.aChar3 == local21) {
											if (local21 == 115) {
												aStringArray22[anInt4321++] = local6652.method3102(local506);
												return;
											}
											anIntArray219[anInt4319++] = local6652.method3101(local506);
											return;
										}
										throw new RuntimeException("C3408-1 " + local27 + "-" + local506);
									}
									if (arg0 == 3409) {
										anInt4319 -= 3;
										local15 = anIntArray219[anInt4319];
										local21 = anIntArray219[anInt4319 + 1];
										local27 = anIntArray219[anInt4319 + 2];
										if (local21 == -1) {
											throw new RuntimeException("C3409-2");
										}
										@Pc(6747) Class127 local6747 = Static116.aClass237_3.method5240(local21);
										if (local6747.aChar3 != local15) {
											throw new RuntimeException("C3409-1");
										}
										anIntArray219[anInt4319++] = local6747.method3103(local27) ? 1 : 0;
										return;
									}
									if (arg0 == 3410) {
										local15 = anIntArray219[--anInt4319];
										local1401 = aStringArray22[--anInt4321];
										if (local15 == -1) {
											throw new RuntimeException("C3410-2");
										}
										local6606 = Static116.aClass237_3.method5240(local15);
										if (local6606.aChar3 != 's') {
											throw new RuntimeException("C3410-1");
										}
										anIntArray219[anInt4319++] = local6606.method3098(local1401) ? 1 : 0;
										return;
									}
									if (arg0 == 3411) {
										local15 = anIntArray219[--anInt4319];
										@Pc(6856) Class127 local6856 = Static116.aClass237_3.method5240(local15);
										anIntArray219[anInt4319++] = local6856.method3105();
										return;
									}
								} else if (arg0 < 3700) {
									if (arg0 == 3600) {
										if (Static166.anInt3255 == 0) {
											anIntArray219[anInt4319++] = -2;
											return;
										}
										if (Static166.anInt3255 == 1) {
											anIntArray219[anInt4319++] = -1;
											return;
										}
										anIntArray219[anInt4319++] = Static645.anInt10557;
										return;
									}
									if (arg0 == 3601) {
										local15 = anIntArray219[--anInt4319];
										if (Static166.anInt3255 == 2 && local15 < Static645.anInt10557) {
											aStringArray22[anInt4321++] = Static167.aStringArray13[local15];
											if (Static7.aStringArray1[local15] != null) {
												aStringArray22[anInt4321++] = Static7.aStringArray1[local15];
												return;
											}
											aStringArray22[anInt4321++] = "";
											return;
										}
										aStringArray22[anInt4321++] = "";
										aStringArray22[anInt4321++] = "";
										return;
									}
									if (arg0 == 3602) {
										local15 = anIntArray219[--anInt4319];
										if (Static166.anInt3255 == 2 && local15 < Static645.anInt10557) {
											anIntArray219[anInt4319++] = Static167.anIntArray152[local15];
											return;
										}
										anIntArray219[anInt4319++] = 0;
										return;
									}
									if (arg0 == 3603) {
										local15 = anIntArray219[--anInt4319];
										if (Static166.anInt3255 == 2 && local15 < Static645.anInt10557) {
											anIntArray219[anInt4319++] = Static351.anIntArray339[local15];
											return;
										}
										anIntArray219[anInt4319++] = 0;
										return;
									}
									if (arg0 == 3604) {
										local4784 = aStringArray22[--anInt4321];
										local21 = anIntArray219[--anInt4319];
										Static179.method3123(local21, local4784);
										return;
									}
									if (arg0 == 3605) {
										local4784 = aStringArray22[--anInt4321];
										Static89.method1393(local4784);
										return;
									}
									if (arg0 == 3606) {
										local4784 = aStringArray22[--anInt4321];
										Static371.method5531(local4784);
										return;
									}
									if (arg0 == 3607) {
										local4784 = aStringArray22[--anInt4321];
										Static637.method6721(115, local4784, false);
										return;
									}
									if (arg0 == 3608) {
										local4784 = aStringArray22[--anInt4321];
										Static288.method4584(local4784);
										return;
									}
									if (arg0 == 3609) {
										local4784 = aStringArray22[--anInt4321];
										if (local4784.startsWith("<img=0>") || local4784.startsWith("<img=1>")) {
											local4784 = local4784.substring(7);
										}
										anIntArray219[anInt4319++] = Static134.method1971(local4784) ? 1 : 0;
										return;
									}
									if (arg0 == 3610) {
										local15 = anIntArray219[--anInt4319];
										if (Static166.anInt3255 == 2 && local15 < Static645.anInt10557) {
											aStringArray22[anInt4321++] = Static181.aStringArray14[local15];
											return;
										}
										aStringArray22[anInt4321++] = "";
										return;
									}
									if (arg0 == 3611) {
										if (Static282.aString56 != null) {
											aStringArray22[anInt4321++] = Static37.method8307(Static282.aString56);
											return;
										}
										aStringArray22[anInt4321++] = "";
										return;
									}
									if (arg0 == 3612) {
										if (Static282.aString56 != null) {
											anIntArray219[anInt4319++] = Static480.anInt7783;
											return;
										}
										anIntArray219[anInt4319++] = 0;
										return;
									}
									if (arg0 == 3613) {
										local15 = anIntArray219[--anInt4319];
										if (Static282.aString56 != null && local15 < Static480.anInt7783) {
											aStringArray22[anInt4321++] = Static508.aClass183Array1[local15].aString52;
											return;
										}
										aStringArray22[anInt4321++] = "";
										return;
									}
									if (arg0 == 3614) {
										local15 = anIntArray219[--anInt4319];
										if (Static282.aString56 != null && local15 < Static480.anInt7783) {
											anIntArray219[anInt4319++] = Static508.aClass183Array1[local15].anInt4713;
											return;
										}
										anIntArray219[anInt4319++] = 0;
										return;
									}
									if (arg0 == 3615) {
										local15 = anIntArray219[--anInt4319];
										if (Static282.aString56 != null && local15 < Static480.anInt7783) {
											anIntArray219[anInt4319++] = Static508.aClass183Array1[local15].aByte69;
											return;
										}
										anIntArray219[anInt4319++] = 0;
										return;
									}
									if (arg0 == 3616) {
										anIntArray219[anInt4319++] = Static654.aByte145;
										return;
									}
									if (arg0 == 3617) {
										local4784 = aStringArray22[--anInt4321];
										Static217.method3436(local4784);
										return;
									}
									if (arg0 == 3618) {
										anIntArray219[anInt4319++] = Static484.aByte114;
										return;
									}
									if (arg0 == 3619) {
										local4784 = aStringArray22[--anInt4321];
										Static110.method8141(local4784);
										return;
									}
									if (arg0 == 3620) {
										Static113.method3808();
										return;
									}
									if (arg0 == 3621) {
										if (Static166.anInt3255 == 0) {
											anIntArray219[anInt4319++] = -1;
											return;
										}
										anIntArray219[anInt4319++] = Static62.anInt1053;
										return;
									}
									if (arg0 == 3622) {
										local15 = anIntArray219[--anInt4319];
										if (Static166.anInt3255 != 0 && local15 < Static62.anInt1053) {
											aStringArray22[anInt4321++] = Static119.aStringArray8[local15];
											if (Static669.aStringArray42[local15] != null) {
												aStringArray22[anInt4321++] = Static669.aStringArray42[local15];
												return;
											}
											aStringArray22[anInt4321++] = "";
											return;
										}
										aStringArray22[anInt4321++] = "";
										aStringArray22[anInt4321++] = "";
										return;
									}
									if (arg0 == 3623) {
										local4784 = aStringArray22[--anInt4321];
										if (local4784.startsWith("<img=0>") || local4784.startsWith("<img=1>")) {
											local4784 = local4784.substring(7);
										}
										anIntArray219[anInt4319++] = Static39.method701(local4784) ? 1 : 0;
										return;
									}
									if (arg0 == 3624) {
										local15 = anIntArray219[--anInt4319];
										if (Static508.aClass183Array1 != null && local15 < Static480.anInt7783 && Static508.aClass183Array1[local15].aString49.equalsIgnoreCase(Static362.aClass4_Sub1_Sub1_Sub2_Sub1_4.aString44)) {
											anIntArray219[anInt4319++] = 1;
											return;
										}
										anIntArray219[anInt4319++] = 0;
										return;
									}
									if (arg0 == 3625) {
										if (Static164.aString29 != null) {
											aStringArray22[anInt4321++] = Static164.aString29;
											return;
										}
										aStringArray22[anInt4321++] = "";
										return;
									}
									if (arg0 == 3626) {
										local15 = anIntArray219[--anInt4319];
										if (Static282.aString56 != null && local15 < Static480.anInt7783) {
											aStringArray22[anInt4321++] = Static508.aClass183Array1[local15].aString51;
											return;
										}
										aStringArray22[anInt4321++] = "";
										return;
									}
									if (arg0 == 3627) {
										local15 = anIntArray219[--anInt4319];
										if (Static166.anInt3255 == 2 && local15 >= 0 && local15 < Static645.anInt10557) {
											anIntArray219[anInt4319++] = Static369.aBooleanArray18[local15] ? 1 : 0;
											return;
										}
										anIntArray219[anInt4319++] = 0;
										return;
									}
									if (arg0 == 3628) {
										local4784 = aStringArray22[--anInt4321];
										if (local4784.startsWith("<img=0>") || local4784.startsWith("<img=1>")) {
											local4784 = local4784.substring(7);
										}
										anIntArray219[anInt4319++] = Static551.method7502(local4784);
										return;
									}
									if (arg0 == 3629) {
										anIntArray219[anInt4319++] = Static72.anInt1198;
										return;
									}
									if (arg0 == 3630) {
										local4784 = aStringArray22[--anInt4321];
										Static637.method6721(106, local4784, true);
										return;
									}
									if (arg0 == 3631) {
										local15 = anIntArray219[--anInt4319];
										anIntArray219[anInt4319++] = Static222.aBooleanArray12[local15] ? 1 : 0;
										return;
									}
									if (arg0 == 3632) {
										local15 = anIntArray219[--anInt4319];
										if (Static282.aString56 != null && local15 < Static480.anInt7783) {
											aStringArray22[anInt4321++] = Static508.aClass183Array1[local15].aString49;
											return;
										}
										aStringArray22[anInt4321++] = "";
										return;
									}
									if (arg0 == 3633) {
										local15 = anIntArray219[--anInt4319];
										if (Static166.anInt3255 != 0 && local15 < Static62.anInt1053) {
											aStringArray22[anInt4321++] = Static300.aStringArray27[local15];
											return;
										}
										aStringArray22[anInt4321++] = "";
										return;
									}
								} else if (arg0 < 3800) {
									if (arg0 == 3700) {
										if (Static321.aClass325_3 != null) {
											anIntArray219[anInt4319++] = 1;
											aClass325_2 = Static321.aClass325_3;
											return;
										}
										anIntArray219[anInt4319++] = 0;
										return;
									}
									if (arg0 == 3701) {
										if (Static55.aClass325_1 != null) {
											anIntArray219[anInt4319++] = 1;
											aClass325_2 = Static55.aClass325_1;
											return;
										}
										anIntArray219[anInt4319++] = 0;
										return;
									}
									if (arg0 == 3702) {
										aStringArray22[anInt4321++] = aClass325_2.aString97;
										return;
									}
									if (arg0 == 3703) {
										anIntArray219[anInt4319++] = aClass325_2.aBoolean564 ? 1 : 0;
										return;
									}
									if (arg0 == 3704) {
										anIntArray219[anInt4319++] = aClass325_2.aByte119;
										return;
									}
									if (arg0 == 3705) {
										anIntArray219[anInt4319++] = aClass325_2.aByte120;
										return;
									}
									if (arg0 == 3706) {
										anIntArray219[anInt4319++] = aClass325_2.aByte121;
										return;
									}
									if (arg0 == 3707) {
										anIntArray219[anInt4319++] = aClass325_2.aByte122;
										return;
									}
									if (arg0 == 3709) {
										anIntArray219[anInt4319++] = aClass325_2.anInt8576;
										return;
									}
									if (arg0 == 3710) {
										local15 = anIntArray219[--anInt4319];
										aStringArray22[anInt4321++] = aClass325_2.aStringArray36[local15];
										return;
									}
									if (arg0 == 3711) {
										local15 = anIntArray219[--anInt4319];
										anIntArray219[anInt4319++] = aClass325_2.aByteArray90[local15];
										return;
									}
									if (arg0 == 3712) {
										anIntArray219[anInt4319++] = aClass325_2.anInt8584;
										return;
									}
									if (arg0 == 3713) {
										local15 = anIntArray219[--anInt4319];
										aStringArray22[anInt4321++] = aClass325_2.aStringArray37[local15];
										return;
									}
									if (arg0 == 3714) {
										anInt4319 -= 3;
										local15 = anIntArray219[anInt4319];
										local21 = anIntArray219[anInt4319 + 1];
										local27 = anIntArray219[anInt4319 + 2];
										anIntArray219[anInt4319++] = aClass325_2.method7386(local21, local27, local15);
										return;
									}
									if (arg0 == 3715) {
										anIntArray219[anInt4319++] = aClass325_2.anInt8577;
										return;
									}
									if (arg0 == 3716) {
										anIntArray219[anInt4319++] = aClass325_2.anInt8572;
										return;
									}
									if (arg0 == 3717) {
										anIntArray219[anInt4319++] = aClass325_2.method7391(aStringArray22[--anInt4321]);
										return;
									}
									if (arg0 == 3718) {
										anIntArray219[anInt4319 - 1] = aClass325_2.method7396()[anIntArray219[anInt4319 - 1]];
										return;
									}
									if (arg0 == 3719) {
										Static179.method3120(anIntArray219[--anInt4319]);
										return;
									}
									if (arg0 == 3750) {
										if (Static348.aClass5_Sub55_2 != null) {
											anIntArray219[anInt4319++] = 1;
											aClass5_Sub55_1 = Static348.aClass5_Sub55_2;
											return;
										}
										anIntArray219[anInt4319++] = 0;
										return;
									}
									if (arg0 == 3751) {
										if (Static605.aClass5_Sub55_3 != null) {
											anIntArray219[anInt4319++] = 1;
											aClass5_Sub55_1 = Static605.aClass5_Sub55_3;
											return;
										}
										anIntArray219[anInt4319++] = 0;
										return;
									}
									if (arg0 == 3752) {
										aStringArray22[anInt4321++] = aClass5_Sub55_1.aString123;
										return;
									}
									if (arg0 == 3753) {
										anIntArray219[anInt4319++] = aClass5_Sub55_1.aByte149;
										return;
									}
									if (arg0 == 3754) {
										anIntArray219[anInt4319++] = aClass5_Sub55_1.aByte150;
										return;
									}
									if (arg0 == 3755) {
										anIntArray219[anInt4319++] = aClass5_Sub55_1.anInt10883;
										return;
									}
									if (arg0 == 3756) {
										local15 = anIntArray219[--anInt4319];
										aStringArray22[anInt4321++] = aClass5_Sub55_1.aClass395Array1[local15].aString120;
										return;
									}
									if (arg0 == 3757) {
										local15 = anIntArray219[--anInt4319];
										anIntArray219[anInt4319++] = aClass5_Sub55_1.aClass395Array1[local15].aByte147;
										return;
									}
									if (arg0 == 3758) {
										local15 = anIntArray219[--anInt4319];
										anIntArray219[anInt4319++] = aClass5_Sub55_1.aClass395Array1[local15].anInt10839;
										return;
									}
									if (arg0 == 3759) {
										local15 = anIntArray219[--anInt4319];
										Static274.method4463(aClass5_Sub55_1 == Static605.aClass5_Sub55_3, local15);
										return;
									}
									if (arg0 == 3760) {
										anIntArray219[anInt4319++] = aClass5_Sub55_1.method9192(aStringArray22[--anInt4321]);
										return;
									}
									if (arg0 == 3761) {
										anIntArray219[anInt4319 - 1] = aClass5_Sub55_1.method9193()[anIntArray219[anInt4319 - 1]];
										return;
									}
									if (arg0 == 3790) {
										anIntArray219[anInt4319++] = Static539.anObjectArray37 == null ? 0 : 1;
										return;
									}
								} else if (arg0 < 4000) {
									if (arg0 == 3903) {
										local15 = anIntArray219[--anInt4319];
										anIntArray219[anInt4319++] = Static562.aClass63Array1[local15].method1166();
										return;
									}
									if (arg0 == 3904) {
										local15 = anIntArray219[--anInt4319];
										anIntArray219[anInt4319++] = Static562.aClass63Array1[local15].anInt1203;
										return;
									}
									if (arg0 == 3905) {
										local15 = anIntArray219[--anInt4319];
										anIntArray219[anInt4319++] = Static562.aClass63Array1[local15].anInt1199;
										return;
									}
									if (arg0 == 3906) {
										local15 = anIntArray219[--anInt4319];
										anIntArray219[anInt4319++] = Static562.aClass63Array1[local15].anInt1205;
										return;
									}
									if (arg0 == 3907) {
										local15 = anIntArray219[--anInt4319];
										anIntArray219[anInt4319++] = Static562.aClass63Array1[local15].anInt1196;
										return;
									}
									if (arg0 == 3908) {
										local15 = anIntArray219[--anInt4319];
										anIntArray219[anInt4319++] = Static562.aClass63Array1[local15].anInt1206;
										return;
									}
									if (arg0 == 3910) {
										local15 = anIntArray219[--anInt4319];
										local21 = Static562.aClass63Array1[local15].method1165();
										anIntArray219[anInt4319++] = local21 == 0 ? 1 : 0;
										return;
									}
									if (arg0 == 3911) {
										local15 = anIntArray219[--anInt4319];
										local21 = Static562.aClass63Array1[local15].method1165();
										anIntArray219[anInt4319++] = local21 == 2 ? 1 : 0;
										return;
									}
									if (arg0 == 3912) {
										local15 = anIntArray219[--anInt4319];
										local21 = Static562.aClass63Array1[local15].method1165();
										anIntArray219[anInt4319++] = local21 == 5 ? 1 : 0;
										return;
									}
									if (arg0 == 3913) {
										local15 = anIntArray219[--anInt4319];
										local21 = Static562.aClass63Array1[local15].method1165();
										anIntArray219[anInt4319++] = local21 == 1 ? 1 : 0;
										return;
									}
								} else {
									@Pc(9092) long local9092;
									if (arg0 < 4100) {
										if (arg0 == 4000) {
											anInt4319 -= 2;
											local15 = anIntArray219[anInt4319];
											local21 = anIntArray219[anInt4319 + 1];
											anIntArray219[anInt4319++] = local15 + local21;
											return;
										}
										if (arg0 == 4001) {
											anInt4319 -= 2;
											local15 = anIntArray219[anInt4319];
											local21 = anIntArray219[anInt4319 + 1];
											anIntArray219[anInt4319++] = local15 - local21;
											return;
										}
										if (arg0 == 4002) {
											anInt4319 -= 2;
											local15 = anIntArray219[anInt4319];
											local21 = anIntArray219[anInt4319 + 1];
											anIntArray219[anInt4319++] = local15 * local21;
											return;
										}
										if (arg0 == 4003) {
											anInt4319 -= 2;
											local15 = anIntArray219[anInt4319];
											local21 = anIntArray219[anInt4319 + 1];
											anIntArray219[anInt4319++] = local15 / local21;
											return;
										}
										if (arg0 == 4004) {
											local15 = anIntArray219[--anInt4319];
											anIntArray219[anInt4319++] = (int) (Math.random() * (double) local15);
											return;
										}
										if (arg0 == 4005) {
											local15 = anIntArray219[--anInt4319];
											anIntArray219[anInt4319++] = (int) (Math.random() * (double) (local15 + 1));
											return;
										}
										if (arg0 == 4006) {
											anInt4319 -= 5;
											local15 = anIntArray219[anInt4319];
											local21 = anIntArray219[anInt4319 + 1];
											local27 = anIntArray219[anInt4319 + 2];
											local506 = anIntArray219[anInt4319 + 3];
											local2879 = anIntArray219[anInt4319 + 4];
											anIntArray219[anInt4319++] = local15 + (local21 - local15) * (local2879 - local27) / (local506 - local27);
											return;
										}
										@Pc(9099) long local9099;
										if (arg0 == 4007) {
											anInt4319 -= 2;
											local9092 = (long) anIntArray219[anInt4319];
											local9099 = (long) anIntArray219[anInt4319 + 1];
											anIntArray219[anInt4319++] = (int) (local9092 + local9092 * local9099 / 100L);
											return;
										}
										if (arg0 == 4008) {
											anInt4319 -= 2;
											local15 = anIntArray219[anInt4319];
											local21 = anIntArray219[anInt4319 + 1];
											anIntArray219[anInt4319++] = local15 | 0x1 << local21;
											return;
										}
										if (arg0 == 4009) {
											anInt4319 -= 2;
											local15 = anIntArray219[anInt4319];
											local21 = anIntArray219[anInt4319 + 1];
											anIntArray219[anInt4319++] = local15 & -(0x1 << local21) - 1;
											return;
										}
										if (arg0 == 4010) {
											anInt4319 -= 2;
											local15 = anIntArray219[anInt4319];
											local21 = anIntArray219[anInt4319 + 1];
											anIntArray219[anInt4319++] = (local15 & 0x1 << local21) == 0 ? 0 : 1;
											return;
										}
										if (arg0 == 4011) {
											anInt4319 -= 2;
											local15 = anIntArray219[anInt4319];
											local21 = anIntArray219[anInt4319 + 1];
											anIntArray219[anInt4319++] = local15 % local21;
											return;
										}
										if (arg0 == 4012) {
											anInt4319 -= 2;
											local15 = anIntArray219[anInt4319];
											local21 = anIntArray219[anInt4319 + 1];
											if (local15 == 0) {
												anIntArray219[anInt4319++] = 0;
												return;
											}
											anIntArray219[anInt4319++] = (int) Math.pow((double) local15, (double) local21);
											return;
										}
										if (arg0 == 4013) {
											anInt4319 -= 2;
											local15 = anIntArray219[anInt4319];
											local21 = anIntArray219[anInt4319 + 1];
											if (local15 == 0) {
												anIntArray219[anInt4319++] = 0;
												return;
											}
											if (local21 == 0) {
												anIntArray219[anInt4319++] = Integer.MAX_VALUE;
												return;
											}
											anIntArray219[anInt4319++] = (int) Math.pow((double) local15, 1.0D / (double) local21);
											return;
										}
										if (arg0 == 4014) {
											anInt4319 -= 2;
											local15 = anIntArray219[anInt4319];
											local21 = anIntArray219[anInt4319 + 1];
											anIntArray219[anInt4319++] = local15 & local21;
											return;
										}
										if (arg0 == 4015) {
											anInt4319 -= 2;
											local15 = anIntArray219[anInt4319];
											local21 = anIntArray219[anInt4319 + 1];
											anIntArray219[anInt4319++] = local15 | local21;
											return;
										}
										if (arg0 == 4016) {
											anInt4319 -= 2;
											local15 = anIntArray219[anInt4319];
											local21 = anIntArray219[anInt4319 + 1];
											anIntArray219[anInt4319++] = local15 < local21 ? local15 : local21;
											return;
										}
										if (arg0 == 4017) {
											anInt4319 -= 2;
											local15 = anIntArray219[anInt4319];
											local21 = anIntArray219[anInt4319 + 1];
											anIntArray219[anInt4319++] = local15 > local21 ? local15 : local21;
											return;
										}
										if (arg0 == 4018) {
											anInt4319 -= 3;
											local9092 = (long) anIntArray219[anInt4319];
											local9099 = (long) anIntArray219[anInt4319 + 1];
											@Pc(9486) long local9486 = (long) anIntArray219[anInt4319 + 2];
											anIntArray219[anInt4319++] = (int) (local9092 * local9486 / local9099);
											return;
										}
										if (arg0 == 4019) {
											anInt4319 -= 2;
											local15 = anIntArray219[anInt4319];
											local21 = anIntArray219[anInt4319 + 1];
											if (local15 > 700 || local21 > 700) {
												anIntArray219[anInt4319++] = 256;
											}
											@Pc(9549) double local9549 = (Math.random() * (double) (local21 + local15) + 800.0D - (double) local15) / 100.0D;
											anIntArray219[anInt4319++] = (int) (Math.pow(2.0D, local9549) + 0.5D);
											return;
										}
										if (arg0 == 4020) {
											local15 = anIntArray219[--anInt4319];
											anIntArray219[anInt4319++] = Static305.anIntArray314[Static161.method2975(local15) & 0xFFFF];
											return;
										}
									} else if (arg0 < 4200) {
										if (arg0 == 4100) {
											local4784 = aStringArray22[--anInt4321];
											local21 = anIntArray219[--anInt4319];
											aStringArray22[anInt4321++] = local4784 + local21;
											return;
										}
										if (arg0 == 4101) {
											anInt4321 -= 2;
											local4784 = aStringArray22[anInt4321];
											local1401 = aStringArray22[anInt4321 + 1];
											aStringArray22[anInt4321++] = local4784 + local1401;
											return;
										}
										if (arg0 == 4102) {
											local4784 = aStringArray22[--anInt4321];
											local21 = anIntArray219[--anInt4319];
											aStringArray22[anInt4321++] = local4784 + Static539.method7407(true, local21);
											return;
										}
										if (arg0 == 4103) {
											local4784 = aStringArray22[--anInt4321];
											aStringArray22[anInt4321++] = local4784.toLowerCase();
											return;
										}
										if (arg0 == 4104) {
											aStringArray22[anInt4321++] = Static242.method4538(Static375.anInt7800, Static262.method4271(anIntArray219[--anInt4319]));
											return;
										}
										if (arg0 == 4105) {
											anInt4321 -= 2;
											local4784 = aStringArray22[anInt4321];
											local1401 = aStringArray22[anInt4321 + 1];
											if (Static362.aClass4_Sub1_Sub1_Sub2_Sub1_4.aClass359_1 != null && Static362.aClass4_Sub1_Sub1_Sub2_Sub1_4.aClass359_1.aBoolean669) {
												aStringArray22[anInt4321++] = local1401;
												return;
											}
											aStringArray22[anInt4321++] = local4784;
											return;
										}
										if (arg0 == 4106) {
											local15 = anIntArray219[--anInt4319];
											aStringArray22[anInt4321++] = Integer.toString(local15);
											return;
										}
										if (arg0 == 4107) {
											anInt4321 -= 2;
											anIntArray219[anInt4319++] = Static311.method4809(Static375.anInt7800, aStringArray22[anInt4321 + 1], aStringArray22[anInt4321]);
											return;
										}
										@Pc(9869) Class196 local9869;
										if (arg0 == 4108) {
											local4784 = aStringArray22[--anInt4321];
											anInt4319 -= 2;
											local21 = anIntArray219[anInt4319];
											local27 = anIntArray219[anInt4319 + 1];
											local9869 = Static603.method8267(Static600.aClass126_275, local27);
											anIntArray219[anInt4319++] = local9869.method4566(local21, Static326.aClass155Array13, local4784);
											return;
										}
										if (arg0 == 4109) {
											local4784 = aStringArray22[--anInt4321];
											anInt4319 -= 2;
											local21 = anIntArray219[anInt4319];
											local27 = anIntArray219[anInt4319 + 1];
											local9869 = Static603.method8267(Static600.aClass126_275, local27);
											anIntArray219[anInt4319++] = local9869.method4562(local4784, local21, Static326.aClass155Array13);
											return;
										}
										if (arg0 == 4110) {
											anInt4321 -= 2;
											local4784 = aStringArray22[anInt4321];
											local1401 = aStringArray22[anInt4321 + 1];
											if (anIntArray219[--anInt4319] == 1) {
												aStringArray22[anInt4321++] = local4784;
												return;
											}
											aStringArray22[anInt4321++] = local1401;
											return;
										}
										if (arg0 == 4111) {
											local4784 = aStringArray22[--anInt4321];
											aStringArray22[anInt4321++] = Static562.method7599(local4784);
											return;
										}
										if (arg0 == 4112) {
											local4784 = aStringArray22[--anInt4321];
											local21 = anIntArray219[--anInt4319];
											if (local21 == -1) {
												throw new RuntimeException("null char");
											}
											aStringArray22[anInt4321++] = local4784 + (char) local21;
											return;
										}
										if (arg0 == 4113) {
											local15 = anIntArray219[--anInt4319];
											anIntArray219[anInt4319++] = method3964((char) local15);
											return;
										}
										if (arg0 == 4114) {
											local15 = anIntArray219[--anInt4319];
											anIntArray219[anInt4319++] = Static340.method5097((char) local15) ? 1 : 0;
											return;
										}
										if (arg0 == 4115) {
											local15 = anIntArray219[--anInt4319];
											anIntArray219[anInt4319++] = Static346.method4444((char) local15) ? 1 : 0;
											return;
										}
										if (arg0 == 4116) {
											local15 = anIntArray219[--anInt4319];
											anIntArray219[anInt4319++] = Static4.method7574((char) local15) ? 1 : 0;
											return;
										}
										if (arg0 == 4117) {
											local4784 = aStringArray22[--anInt4321];
											if (local4784 != null) {
												anIntArray219[anInt4319++] = local4784.length();
												return;
											}
											anIntArray219[anInt4319++] = 0;
											return;
										}
										if (arg0 == 4118) {
											local4784 = aStringArray22[--anInt4321];
											anInt4319 -= 2;
											local21 = anIntArray219[anInt4319];
											local27 = anIntArray219[anInt4319 + 1];
											aStringArray22[anInt4321++] = local4784.substring(local21, local27);
											return;
										}
										if (arg0 == 4119) {
											local4784 = aStringArray22[--anInt4321];
											@Pc(10235) StringBuffer local10235 = new StringBuffer(local4784.length());
											@Pc(10237) boolean local10237 = false;
											for (local506 = 0; local506 < local4784.length(); local506++) {
												@Pc(10244) char local10244 = local4784.charAt(local506);
												if (local10244 == '<') {
													local10237 = true;
												} else if (local10244 == '>') {
													local10237 = false;
												} else if (!local10237) {
													local10235.append(local10244);
												}
											}
											aStringArray22[anInt4321++] = local10235.toString();
											return;
										}
										if (arg0 == 4120) {
											local4784 = aStringArray22[--anInt4321];
											anInt4319 -= 2;
											local21 = anIntArray219[anInt4319];
											local27 = anIntArray219[anInt4319 + 1];
											anIntArray219[anInt4319++] = local4784.indexOf(local21, local27);
											return;
										}
										if (arg0 == 4121) {
											anInt4321 -= 2;
											local4784 = aStringArray22[anInt4321];
											local1401 = aStringArray22[anInt4321 + 1];
											local27 = anIntArray219[--anInt4319];
											anIntArray219[anInt4319++] = local4784.indexOf(local1401, local27);
											return;
										}
										if (arg0 == 4122) {
											local15 = anIntArray219[--anInt4319];
											anIntArray219[anInt4319++] = Character.toLowerCase((char) local15);
											return;
										}
										if (arg0 == 4123) {
											local15 = anIntArray219[--anInt4319];
											anIntArray219[anInt4319++] = Character.toUpperCase((char) local15);
											return;
										}
										if (arg0 == 4124) {
											local575 = anIntArray219[--anInt4319] != 0;
											local21 = anIntArray219[--anInt4319];
											aStringArray22[anInt4321++] = Static204.method3367((long) local21, 0, local575, Static375.anInt7800);
											return;
										}
										if (arg0 == 4125) {
											local4784 = aStringArray22[--anInt4321];
											local21 = anIntArray219[--anInt4319];
											@Pc(10464) Class196 local10464 = Static603.method8267(Static600.aClass126_275, local21);
											anIntArray219[anInt4319++] = local10464.method4558(Static326.aClass155Array13, local4784);
											return;
										}
										if (arg0 == 4126) {
											aStringArray22[anInt4321++] = Static150.method2777(Static375.anInt7800, (long) anIntArray219[--anInt4319] * 60000L) + " UTC";
											return;
										}
										if (arg0 == 4127) {
											local9092 = aLongArray15[--anInt4318];
											aStringArray22[anInt4321++] = local9092 == -1L ? "" : Long.toString(local9092, 36).toUpperCase();
											return;
										}
									} else if (arg0 < 4300) {
										if (arg0 == 4200) {
											local15 = anIntArray219[--anInt4319];
											aStringArray22[anInt4321++] = Static82.aClass134_1.method3191(local15).aString77;
											return;
										}
										@Pc(10593) Class246 local10593;
										if (arg0 == 4201) {
											anInt4319 -= 2;
											local15 = anIntArray219[anInt4319];
											local21 = anIntArray219[anInt4319 + 1];
											local10593 = Static82.aClass134_1.method3191(local15);
											if (local21 >= 1 && local21 <= 5 && local10593.aStringArray30[local21 - 1] != null) {
												aStringArray22[anInt4321++] = local10593.aStringArray30[local21 - 1];
												return;
											}
											aStringArray22[anInt4321++] = "";
											return;
										}
										if (arg0 == 4202) {
											anInt4319 -= 2;
											local15 = anIntArray219[anInt4319];
											local21 = anIntArray219[anInt4319 + 1];
											local10593 = Static82.aClass134_1.method3191(local15);
											if (local21 >= 1 && local21 <= 5 && local10593.aStringArray29[local21 - 1] != null) {
												aStringArray22[anInt4321++] = local10593.aStringArray29[local21 - 1];
												return;
											}
											aStringArray22[anInt4321++] = "";
											return;
										}
										if (arg0 == 4203) {
											local15 = anIntArray219[--anInt4319];
											anIntArray219[anInt4319++] = Static82.aClass134_1.method3191(local15).anInt6486;
											return;
										}
										if (arg0 == 4204) {
											local15 = anIntArray219[--anInt4319];
											anIntArray219[anInt4319++] = Static82.aClass134_1.method3191(local15).anInt6474 == 1 ? 1 : 0;
											return;
										}
										@Pc(10767) Class246 local10767;
										if (arg0 == 4205) {
											local15 = anIntArray219[--anInt4319];
											local10767 = Static82.aClass134_1.method3191(local15);
											if (local10767.anInt6490 == -1 && local10767.anInt6510 >= 0) {
												anIntArray219[anInt4319++] = local10767.anInt6510;
												return;
											}
											anIntArray219[anInt4319++] = local15;
											return;
										}
										if (arg0 == 4206) {
											local15 = anIntArray219[--anInt4319];
											local10767 = Static82.aClass134_1.method3191(local15);
											if (local10767.anInt6490 >= 0 && local10767.anInt6510 >= 0) {
												anIntArray219[anInt4319++] = local10767.anInt6510;
												return;
											}
											anIntArray219[anInt4319++] = local15;
											return;
										}
										if (arg0 == 4207) {
											local15 = anIntArray219[--anInt4319];
											anIntArray219[anInt4319++] = Static82.aClass134_1.method3191(local15).aBoolean425 ? 1 : 0;
											return;
										}
										if (arg0 == 4208) {
											anInt4319 -= 2;
											local15 = anIntArray219[anInt4319];
											local21 = anIntArray219[anInt4319 + 1];
											local3749 = Static612.aClass380_2.method8839(local21);
											if (local3749.method385()) {
												aStringArray22[anInt4321++] = Static82.aClass134_1.method3191(local15).method5694(local3749.aString4, local21);
												return;
											}
											anIntArray219[anInt4319++] = Static82.aClass134_1.method3191(local15).method5691(local3749.anInt336, local21);
											return;
										}
										if (arg0 == 4209) {
											anInt4319 -= 2;
											local15 = anIntArray219[anInt4319];
											local21 = anIntArray219[anInt4319 + 1] - 1;
											local10593 = Static82.aClass134_1.method3191(local15);
											if (local10593.anInt6483 == local21) {
												anIntArray219[anInt4319++] = local10593.anInt6509;
												return;
											}
											if (local10593.anInt6457 == local21) {
												anIntArray219[anInt4319++] = local10593.anInt6502;
												return;
											}
											anIntArray219[anInt4319++] = -1;
											return;
										}
										if (arg0 == 4210) {
											local4784 = aStringArray22[--anInt4321];
											local21 = anIntArray219[--anInt4319];
											Static495.method299(local4784, local21 == 1);
											anIntArray219[anInt4319++] = Static380.anInt6378;
											return;
										}
										if (arg0 == 4211) {
											if (Static602.aShortArray141 != null && Static637.anInt7728 < Static380.anInt6378) {
												anIntArray219[anInt4319++] = Static602.aShortArray141[Static637.anInt7728++] & 0xFFFF;
												return;
											}
											anIntArray219[anInt4319++] = -1;
											return;
										}
										if (arg0 == 4212) {
											Static637.anInt7728 = 0;
											return;
										}
										if (arg0 == 4213) {
											local15 = anIntArray219[--anInt4319];
											anIntArray219[anInt4319++] = Static82.aClass134_1.method3191(local15).anInt6496;
											return;
										}
										if (arg0 == 4214) {
											local4784 = aStringArray22[--anInt4321];
											anInt4319 -= 3;
											local21 = anIntArray219[anInt4319];
											local27 = anIntArray219[anInt4319 + 1];
											local506 = anIntArray219[anInt4319 + 2];
											Static303.method8177(local27, local21 == 1, local506, local4784);
											anIntArray219[anInt4319++] = Static380.anInt6378;
											return;
										}
										if (arg0 == 4215) {
											anInt4321 -= 2;
											anInt4319 -= 2;
											local4784 = aStringArray22[anInt4321];
											local21 = anIntArray219[anInt4319];
											local27 = anIntArray219[anInt4319 + 1];
											@Pc(11184) String local11184 = aStringArray22[anInt4321 + 1];
											Static305.method4762(local21 == 1, local11184, local4784, local27);
											anIntArray219[anInt4319++] = Static380.anInt6378;
											return;
										}
									} else if (arg0 < 4400) {
										if (arg0 == 4300) {
											anInt4319 -= 2;
											local15 = anIntArray219[anInt4319];
											local21 = anIntArray219[anInt4319 + 1];
											local3749 = Static612.aClass380_2.method8839(local21);
											if (local3749.method385()) {
												aStringArray22[anInt4321++] = Static378.aClass369_2.method8471(local15).method2614(local21, local3749.aString4);
												return;
											}
											anIntArray219[anInt4319++] = Static378.aClass369_2.method8471(local15).method2618(local3749.anInt336, local21);
											return;
										}
									} else if (arg0 < 4500) {
										if (arg0 == 4400) {
											anInt4319 -= 2;
											local15 = anIntArray219[anInt4319];
											local21 = anIntArray219[anInt4319 + 1];
											local3749 = Static612.aClass380_2.method8839(local21);
											if (local3749.method385()) {
												aStringArray22[anInt4321++] = Static528.aClass243_3.method5556(local15).method8020(local21, local3749.aString4);
												return;
											}
											anIntArray219[anInt4319++] = Static528.aClass243_3.method5556(local15).method8029(local21, local3749.anInt336);
											return;
										}
									} else if (arg0 < 4600) {
										if (arg0 == 4500) {
											anInt4319 -= 2;
											local15 = anIntArray219[anInt4319];
											local21 = anIntArray219[anInt4319 + 1];
											local3749 = Static612.aClass380_2.method8839(local21);
											if (local3749.method385()) {
												aStringArray22[anInt4321++] = Static280.aClass111_1.method2756(local15).method8192(local3749.aString4, local21);
												return;
											}
											anIntArray219[anInt4319++] = Static280.aClass111_1.method2756(local15).method8195(local3749.anInt336, local21);
											return;
										}
									} else if (arg0 < 4700) {
										if (arg0 == 4600) {
											local15 = anIntArray219[--anInt4319];
											@Pc(11424) Class92 local11424 = Static591.aClass148_2.method3404(local15);
											if (local11424.anIntArray102 != null && local11424.anIntArray102.length > 0) {
												local27 = 0;
												local506 = local11424.anIntArray100[0];
												for (local2879 = 1; local2879 < local11424.anIntArray102.length; local2879++) {
													if (local11424.anIntArray100[local2879] > local506) {
														local27 = local2879;
														local506 = local11424.anIntArray100[local2879];
													}
												}
												anIntArray219[anInt4319++] = local11424.anIntArray102[local27];
												return;
											}
											anIntArray219[anInt4319++] = local11424.anInt1920;
											return;
										}
									} else if (arg0 < 4800) {
										if (arg0 == 4700) {
											anIntArray219[anInt4319++] = Static368.aBoolean415 ? 1 : 0;
											return;
										}
										if (arg0 == 4701) {
											local4784 = aStringArray22[--anInt4321];
											if (Static652.anInt10664 == 7 && !Static546.method7472()) {
												if (local4784.length() > 20) {
													Static238.aByte46 = -4;
													return;
												}
												Static238.aByte46 = -1;
												local4878 = Static647.method8905(Static200.aClass381_87, Static4.aClass389_16.aClass393_2);
												local4878.aClass5_Sub36_Sub2_1.method7324(0);
												local27 = local4878.aClass5_Sub36_Sub2_1.anInt8456;
												local4878.aClass5_Sub36_Sub2_1.method7327(local4784);
												local4878.aClass5_Sub36_Sub2_1.method7314(local4878.aClass5_Sub36_Sub2_1.anInt8456 - local27);
												Static4.aClass389_16.method9079(local4878);
												return;
											}
											Static238.aByte46 = -5;
											return;
										}
										if (arg0 == 4702) {
											anIntArray219[anInt4319++] = Static238.aByte46;
											if (Static238.aByte46 != -1) {
												Static238.aByte46 = -6;
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
						local220 = Static305.method4761(anIntArray219[--anInt4319]);
					} else {
						local220 = arg1 ? aClass238_8 : aClass238_9;
					}
					if (arg0 == 1300) {
						local21 = anIntArray219[--anInt4319] - 1;
						if (local21 >= 0 && local21 <= 9) {
							local220.method5304(aStringArray22[--anInt4321], local21);
							return;
						}
						anInt4321--;
						return;
					}
					if (arg0 == 1301) {
						anInt4319 -= 2;
						local21 = anIntArray219[anInt4319];
						local27 = anIntArray219[anInt4319 + 1];
						if (local21 == -1 && local27 == -1) {
							local220.aClass238_10 = null;
							return;
						}
						local220.aClass238_10 = Static333.method5035(local27, local21);
						return;
					}
					if (arg0 == 1302) {
						local21 = anIntArray219[--anInt4319];
						if (local21 != Static595.anInt9608 && local21 != Static600.anInt9671 && local21 != Static254.anInt4626) {
							return;
						}
						local220.anInt5965 = local21;
						return;
					}
					if (arg0 == 1303) {
						local220.anInt5977 = anIntArray219[--anInt4319];
						return;
					}
					if (arg0 == 1304) {
						local220.anInt5970 = anIntArray219[--anInt4319];
						return;
					}
					if (arg0 == 1305) {
						local220.aString69 = aStringArray22[--anInt4321];
						return;
					}
					if (arg0 == 1306) {
						local220.aString68 = aStringArray22[--anInt4321];
						return;
					}
					if (arg0 == 1307) {
						local220.aStringArray28 = null;
						return;
					}
					if (arg0 == 1308) {
						local220.anInt5978 = anIntArray219[--anInt4319];
						local220.anInt6000 = anIntArray219[--anInt4319];
						return;
					}
					if (arg0 == 1309) {
						local21 = anIntArray219[--anInt4319];
						local27 = anIntArray219[--anInt4319];
						if (local27 >= 1 && local27 <= 10) {
							local220.method5321(local27 - 1, local21);
						}
						return;
					}
					if (arg0 == 1310) {
						local220.aString72 = aStringArray22[--anInt4321];
						return;
					}
					if (arg0 == 1311) {
						local220.anInt6001 = anIntArray219[--anInt4319];
						return;
					}
					if (arg0 == 1312 || arg0 == 1313) {
						if (arg0 == 1312) {
							anInt4319 -= 3;
							local21 = anIntArray219[anInt4319] - 1;
							local27 = anIntArray219[anInt4319 + 1];
							local506 = anIntArray219[anInt4319 + 2];
							if (local21 < 0 || local21 > 9) {
								throw new RuntimeException("IOR13121313");
							}
						} else {
							anInt4319 -= 2;
							local21 = 10;
							local27 = anIntArray219[anInt4319];
							local506 = anIntArray219[anInt4319 + 1];
						}
						if (local220.aByteArray64 == null) {
							if (local27 == 0) {
								return;
							}
							local220.aByteArray64 = new byte[11];
							local220.aByteArray65 = new byte[11];
							local220.anIntArray349 = new int[11];
						}
						local220.aByteArray64[local21] = (byte) local27;
						if (local27 == 0) {
							local220.aBoolean411 = false;
							for (local2879 = 0; local2879 < local220.aByteArray64.length; local2879++) {
								if (local220.aByteArray64[local2879] != 0) {
									local220.aBoolean411 = true;
									break;
								}
							}
						} else {
							local220.aBoolean411 = true;
						}
						local220.aByteArray65[local21] = (byte) local506;
						return;
					}
					if (arg0 == 1314) {
						local220.anInt5940 = anIntArray219[--anInt4319];
						return;
					}
				}
			}
		}
		throw new IllegalStateException(String.valueOf(arg0));
	}

	@OriginalMember(owner = "client!im", name = "a", descriptor = "()V")
	public static void method3955() {
	}

	@OriginalMember(owner = "client!im", name = "a", descriptor = "(Ljava/lang/String;I)V")
	private static void method3956(@OriginalArg(0) String arg0, @OriginalArg(1) int arg1) {
		if (Static296.anInt5190 == 0 && (Static163.aBoolean238 && !Static490.aBoolean537 || Static76.aBoolean116)) {
			return;
		}
		@Pc(18) String local18 = arg0.toLowerCase();
		@Pc(20) byte local20 = 0;
		if (local18.startsWith(Static184.aClass131_48.method3168(0))) {
			local20 = 0;
			arg0 = arg0.substring(Static184.aClass131_48.method3168(0).length());
		} else if (local18.startsWith(Static184.aClass131_49.method3168(0))) {
			local20 = 1;
			arg0 = arg0.substring(Static184.aClass131_49.method3168(0).length());
		} else if (local18.startsWith(Static184.aClass131_50.method3168(0))) {
			local20 = 2;
			arg0 = arg0.substring(Static184.aClass131_50.method3168(0).length());
		} else if (local18.startsWith(Static184.aClass131_51.method3168(0))) {
			local20 = 3;
			arg0 = arg0.substring(Static184.aClass131_51.method3168(0).length());
		} else if (local18.startsWith(Static184.aClass131_52.method3168(0))) {
			local20 = 4;
			arg0 = arg0.substring(Static184.aClass131_52.method3168(0).length());
		} else if (local18.startsWith(Static184.aClass131_53.method3168(0))) {
			local20 = 5;
			arg0 = arg0.substring(Static184.aClass131_53.method3168(0).length());
		} else if (local18.startsWith(Static184.aClass131_54.method3168(0))) {
			local20 = 6;
			arg0 = arg0.substring(Static184.aClass131_54.method3168(0).length());
		} else if (local18.startsWith(Static184.aClass131_55.method3168(0))) {
			local20 = 7;
			arg0 = arg0.substring(Static184.aClass131_55.method3168(0).length());
		} else if (local18.startsWith(Static184.aClass131_56.method3168(0))) {
			local20 = 8;
			arg0 = arg0.substring(Static184.aClass131_56.method3168(0).length());
		} else if (local18.startsWith(Static184.aClass131_57.method3168(0))) {
			local20 = 9;
			arg0 = arg0.substring(Static184.aClass131_57.method3168(0).length());
		} else if (local18.startsWith(Static184.aClass131_58.method3168(0))) {
			local20 = 10;
			arg0 = arg0.substring(Static184.aClass131_58.method3168(0).length());
		} else if (local18.startsWith(Static184.aClass131_59.method3168(0))) {
			local20 = 11;
			arg0 = arg0.substring(Static184.aClass131_59.method3168(0).length());
		} else if (Static375.anInt7800 != 0) {
			if (local18.startsWith(Static184.aClass131_48.method3168(Static375.anInt7800))) {
				local20 = 0;
				arg0 = arg0.substring(Static184.aClass131_48.method3168(Static375.anInt7800).length());
			} else if (local18.startsWith(Static184.aClass131_49.method3168(Static375.anInt7800))) {
				local20 = 1;
				arg0 = arg0.substring(Static184.aClass131_49.method3168(Static375.anInt7800).length());
			} else if (local18.startsWith(Static184.aClass131_50.method3168(Static375.anInt7800))) {
				local20 = 2;
				arg0 = arg0.substring(Static184.aClass131_50.method3168(Static375.anInt7800).length());
			} else if (local18.startsWith(Static184.aClass131_51.method3168(Static375.anInt7800))) {
				local20 = 3;
				arg0 = arg0.substring(Static184.aClass131_51.method3168(Static375.anInt7800).length());
			} else if (local18.startsWith(Static184.aClass131_52.method3168(Static375.anInt7800))) {
				local20 = 4;
				arg0 = arg0.substring(Static184.aClass131_52.method3168(Static375.anInt7800).length());
			} else if (local18.startsWith(Static184.aClass131_53.method3168(Static375.anInt7800))) {
				local20 = 5;
				arg0 = arg0.substring(Static184.aClass131_53.method3168(Static375.anInt7800).length());
			} else if (local18.startsWith(Static184.aClass131_54.method3168(Static375.anInt7800))) {
				local20 = 6;
				arg0 = arg0.substring(Static184.aClass131_54.method3168(Static375.anInt7800).length());
			} else if (local18.startsWith(Static184.aClass131_55.method3168(Static375.anInt7800))) {
				local20 = 7;
				arg0 = arg0.substring(Static184.aClass131_55.method3168(Static375.anInt7800).length());
			} else if (local18.startsWith(Static184.aClass131_56.method3168(Static375.anInt7800))) {
				local20 = 8;
				arg0 = arg0.substring(Static184.aClass131_56.method3168(Static375.anInt7800).length());
			} else if (local18.startsWith(Static184.aClass131_57.method3168(Static375.anInt7800))) {
				local20 = 9;
				arg0 = arg0.substring(Static184.aClass131_57.method3168(Static375.anInt7800).length());
			} else if (local18.startsWith(Static184.aClass131_58.method3168(Static375.anInt7800))) {
				local20 = 10;
				arg0 = arg0.substring(Static184.aClass131_58.method3168(Static375.anInt7800).length());
			} else if (local18.startsWith(Static184.aClass131_59.method3168(Static375.anInt7800))) {
				local20 = 11;
				arg0 = arg0.substring(Static184.aClass131_59.method3168(Static375.anInt7800).length());
			}
		}
		local18 = arg0.toLowerCase();
		@Pc(460) byte local460 = 0;
		if (local18.startsWith(Static184.aClass131_60.method3168(0))) {
			local460 = 1;
			arg0 = arg0.substring(Static184.aClass131_60.method3168(0).length());
		} else if (local18.startsWith(Static184.aClass131_61.method3168(0))) {
			local460 = 2;
			arg0 = arg0.substring(Static184.aClass131_61.method3168(0).length());
		} else if (local18.startsWith(Static184.aClass131_62.method3168(0))) {
			local460 = 3;
			arg0 = arg0.substring(Static184.aClass131_62.method3168(0).length());
		} else if (local18.startsWith(Static184.aClass131_63.method3168(0))) {
			local460 = 4;
			arg0 = arg0.substring(Static184.aClass131_63.method3168(0).length());
		} else if (local18.startsWith(Static184.aClass131_64.method3168(0))) {
			local460 = 5;
			arg0 = arg0.substring(Static184.aClass131_64.method3168(0).length());
		} else if (Static375.anInt7800 != 0) {
			if (local18.startsWith(Static184.aClass131_60.method3168(Static375.anInt7800))) {
				local460 = 1;
				arg0 = arg0.substring(Static184.aClass131_60.method3168(Static375.anInt7800).length());
			} else if (local18.startsWith(Static184.aClass131_61.method3168(Static375.anInt7800))) {
				local460 = 2;
				arg0 = arg0.substring(Static184.aClass131_61.method3168(Static375.anInt7800).length());
			} else if (local18.startsWith(Static184.aClass131_62.method3168(Static375.anInt7800))) {
				local460 = 3;
				arg0 = arg0.substring(Static184.aClass131_62.method3168(Static375.anInt7800).length());
			} else if (local18.startsWith(Static184.aClass131_63.method3168(Static375.anInt7800))) {
				local460 = 4;
				arg0 = arg0.substring(Static184.aClass131_63.method3168(Static375.anInt7800).length());
			} else if (local18.startsWith(Static184.aClass131_64.method3168(Static375.anInt7800))) {
				local460 = 5;
				arg0 = arg0.substring(Static184.aClass131_64.method3168(Static375.anInt7800).length());
			}
		}
		@Pc(650) Class389 local650 = Static120.method1769(false);
		@Pc(656) Class5_Sub41 local656 = Static647.method8905(Static595.aClass381_246, local650.aClass393_2);
		local656.aClass5_Sub36_Sub2_1.method7324(0);
		@Pc(665) int local665 = local656.aClass5_Sub36_Sub2_1.anInt8456;
		local656.aClass5_Sub36_Sub2_1.method7324(local20);
		local656.aClass5_Sub36_Sub2_1.method7324(local460);
		Static253.method4125(arg0, local656.aClass5_Sub36_Sub2_1);
		local656.aClass5_Sub36_Sub2_1.method7314(local656.aClass5_Sub36_Sub2_1.anInt8456 - local665);
		local650.method9079(local656);
	}

	@OriginalMember(owner = "client!im", name = "a", descriptor = "(Lclient!ic;)V")
	public static void method3957(@OriginalArg(0) Class5_Sub24 arg0) {
		method3969(arg0, 200000);
	}

	@OriginalMember(owner = "client!im", name = "b", descriptor = "(I)I")
	private static int method3958(@OriginalArg(0) int arg0) {
		@Pc(4) Class103 local4 = Static197.aClass9_1.method150(arg0);
		if (local4 == null) {
			throw new RuntimeException("sr-c113");
		}
		@Pc(29) Integer local29 = aClass325_2.method7405(local4.anInt2754, Static536.aClass290_6.anInt7535 << 16 | local4.anInt2756, local4.anInt2752);
		return local29 == null ? 0 : local29;
	}

	@OriginalMember(owner = "client!im", name = "a", descriptor = "(IZ)V")
	public static void method3959() {
	}

	@OriginalMember(owner = "client!im", name = "a", descriptor = "(Lclient!kca;I)V")
	private static void method3960(@OriginalArg(0) Class5_Sub1_Sub10 arg0, @OriginalArg(1) int arg1) {
		anInt4319 = 0;
		anInt4321 = 0;
		@Pc(5) int local5 = -1;
		@Pc(8) int[] local8 = arg0.anIntArray309;
		@Pc(11) int[] local11 = arg0.anIntArray310;
		@Pc(13) byte local13 = -1;
		anInt4311 = 0;
		@Pc(706) int local706;
		try {
			@Pc(17) int local17 = 0;
			label403: while (true) {
				local17++;
				if (local17 > arg1) {
					throw new RuntimeException("slow");
				}
				local5++;
				@Pc(34) int local34 = local8[local5];
				if (aBoolean282 && (aString40 == null || arg0.aString57 != null && arg0.aString57.indexOf(aString40) != -1)) {
					System.out.println(arg0.aString57 + ": " + local34);
				}
				if (local34 >= 150) {
					@Pc(1436) boolean local1436;
					if (local11[local5] == 1) {
						local1436 = true;
					} else {
						local1436 = false;
					}
					if (local34 >= 150 && local34 < 5000) {
						method3954(local34, local1436);
					} else if (local34 >= 5000 && local34 < 10000) {
						method3968(local34, local1436);
					} else {
						throw new IllegalStateException("Command: " + local34);
					}
				} else if (local34 == 0) {
					anIntArray219[anInt4319++] = local11[local5];
				} else {
					@Pc(96) int local96;
					if (local34 == 1) {
						local96 = local11[local5];
						anIntArray219[anInt4319++] = Static23.aClass247_1.anIntArray373[local96];
					} else if (local34 == 2) {
						local96 = local11[local5];
						Static23.aClass247_1.method5705(local96, anIntArray219[--anInt4319]);
					} else if (local34 == 3) {
						aStringArray22[anInt4321++] = arg0.aStringArray26[local5];
					} else if (local34 == 6) {
						local5 += local11[local5];
					} else if (local34 == 7) {
						anInt4319 -= 2;
						if (anIntArray219[anInt4319] != anIntArray219[anInt4319 + 1]) {
							local5 += local11[local5];
						}
					} else if (local34 == 8) {
						anInt4319 -= 2;
						if (anIntArray219[anInt4319] == anIntArray219[anInt4319 + 1]) {
							local5 += local11[local5];
						}
					} else if (local34 == 9) {
						anInt4319 -= 2;
						if (anIntArray219[anInt4319] < anIntArray219[anInt4319 + 1]) {
							local5 += local11[local5];
						}
					} else if (local34 == 10) {
						anInt4319 -= 2;
						if (anIntArray219[anInt4319] > anIntArray219[anInt4319 + 1]) {
							local5 += local11[local5];
						}
					} else if (local34 == 21) {
						if (anInt4311 == 0) {
							return;
						}
						@Pc(270) Class378 local270 = aClass378Array1[--anInt4311];
						arg0 = local270.aClass5_Sub1_Sub10_1;
						local8 = arg0.anIntArray309;
						local11 = arg0.anIntArray310;
						local5 = local270.anInt10389;
						anIntArray220 = local270.anIntArray590;
						aStringArray23 = local270.aStringArray41;
						aLongArray14 = local270.aLongArray20;
					} else if (local34 == 25) {
						local96 = local11[local5];
						anIntArray219[anInt4319++] = Static23.aClass247_1.method5699(local96);
					} else if (local34 == 27) {
						local96 = local11[local5];
						Static23.aClass247_1.method5702(anIntArray219[--anInt4319], local96);
					} else if (local34 == 31) {
						anInt4319 -= 2;
						if (anIntArray219[anInt4319] <= anIntArray219[anInt4319 + 1]) {
							local5 += local11[local5];
						}
					} else if (local34 == 32) {
						anInt4319 -= 2;
						if (anIntArray219[anInt4319] >= anIntArray219[anInt4319 + 1]) {
							local5 += local11[local5];
						}
					} else if (local34 == 33) {
						anIntArray219[anInt4319++] = anIntArray220[local11[local5]];
					} else if (local34 == 34) {
						anIntArray220[local11[local5]] = anIntArray219[--anInt4319];
					} else if (local34 == 35) {
						aStringArray22[anInt4321++] = aStringArray23[local11[local5]];
					} else if (local34 == 36) {
						aStringArray23[local11[local5]] = aStringArray22[--anInt4321];
					} else {
						@Pc(465) String local465;
						if (local34 == 37) {
							local96 = local11[local5];
							anInt4321 -= local96;
							local465 = Static101.method1548(local96, anInt4321, aStringArray22);
							aStringArray22[anInt4321++] = local465;
						} else if (local34 == 38) {
							anInt4319--;
						} else if (local34 == 39) {
							anInt4321--;
						} else if (local34 == 40) {
							local96 = local11[local5];
							@Pc(503) Class5_Sub1_Sub10 local503 = Static499.method6952(local96);
							if (local503 == null) {
								throw new RuntimeException();
							}
							@Pc(514) int[] local514 = new int[local503.anInt5145];
							@Pc(518) String[] local518 = new String[local503.anInt5147];
							@Pc(522) long[] local522 = new long[local503.anInt5146];
							for (@Pc(524) int local524 = 0; local524 < local503.anInt5142; local524++) {
								local514[local524] = anIntArray219[anInt4319 + local524 - local503.anInt5142];
							}
							for (@Pc(543) int local543 = 0; local543 < local503.anInt5143; local543++) {
								local518[local543] = aStringArray22[anInt4321 + local543 - local503.anInt5143];
							}
							for (@Pc(562) int local562 = 0; local562 < local503.anInt5144; local562++) {
								local522[local562] = aLongArray15[anInt4318 + local562 - local503.anInt5144];
							}
							anInt4319 -= local503.anInt5142;
							anInt4321 -= local503.anInt5143;
							anInt4318 -= local503.anInt5144;
							@Pc(598) Class378 local598 = new Class378();
							local598.aClass5_Sub1_Sub10_1 = arg0;
							local598.anInt10389 = local5;
							local598.anIntArray590 = anIntArray220;
							local598.aStringArray41 = aStringArray23;
							local598.aLongArray20 = aLongArray14;
							if (anInt4311 >= aClass378Array1.length) {
								throw new RuntimeException();
							}
							aClass378Array1[anInt4311++] = local598;
							arg0 = local503;
							local8 = local503.anIntArray309;
							local11 = local503.anIntArray310;
							local5 = -1;
							anIntArray220 = local514;
							aStringArray23 = local518;
							aLongArray14 = local522;
						} else if (local34 == 42) {
							anIntArray219[anInt4319++] = Static123.anIntArray120[local11[local5]];
						} else if (local34 == 43) {
							local96 = local11[local5];
							Static123.anIntArray120[local96] = anIntArray219[--anInt4319];
							Static321.method4914(local96);
							Static195.aBoolean256 |= Static624.aBooleanArray27[local96];
						} else if (local34 == 44) {
							local96 = local11[local5] >> 16;
							local706 = local11[local5] & 0xFFFF;
							@Pc(714) int local714 = anIntArray219[--anInt4319];
							if (local714 >= 0 && local714 <= 5000) {
								anIntArray221[local96] = local714;
								@Pc(732) byte local732 = -1;
								if (local706 == 105) {
									local732 = 0;
								}
								@Pc(739) int local739 = 0;
								while (true) {
									if (local739 >= local714) {
										continue label403;
									}
									anIntArrayArray35[local96][local739] = local732;
									local739++;
								}
							}
							throw new RuntimeException();
						} else if (local34 == 45) {
							local96 = local11[local5];
							local706 = anIntArray219[--anInt4319];
							if (local706 < 0 || local706 >= anIntArray221[local96]) {
								throw new RuntimeException();
							}
							anIntArray219[anInt4319++] = anIntArrayArray35[local96][local706];
						} else if (local34 == 46) {
							local96 = local11[local5];
							anInt4319 -= 2;
							local706 = anIntArray219[anInt4319];
							if (local706 < 0 || local706 >= anIntArray221[local96]) {
								throw new RuntimeException();
							}
							anIntArrayArray35[local96][local706] = anIntArray219[anInt4319 + 1];
						} else if (local34 == 47) {
							@Pc(843) String local843 = Static140.aStringArray9[local11[local5]];
							if (local843 == null) {
								local843 = "null";
							}
							aStringArray22[anInt4321++] = local843;
						} else if (local34 == 48) {
							local96 = local11[local5];
							Static140.aStringArray9[local96] = aStringArray22[--anInt4321];
							Static574.method7720(local96);
						} else if (local34 == 51) {
							@Pc(889) Class306 local889 = arg0.aClass306Array1[local11[local5]];
							@Pc(902) Class5_Sub43 local902 = (Class5_Sub43) local889.method6943((long) anIntArray219[--anInt4319]);
							if (local902 != null) {
								local5 += local902.anInt6989;
							}
						} else if (local34 == 54) {
							aLongArray15[anInt4318++] = arg0.aLongArray16[local5];
						} else if (local34 == 55) {
							anInt4318--;
						} else if (local34 == 66) {
							aLongArray15[anInt4318++] = aLongArray14[local11[local5]];
						} else if (local34 == 67) {
							aLongArray14[local11[local5]] = aLongArray15[--anInt4318];
						} else if (local34 == 68) {
							anInt4318 -= 2;
							if (aLongArray15[anInt4318] != aLongArray15[anInt4318 + 1]) {
								local5 += local11[local5];
							}
						} else if (local34 == 69) {
							anInt4318 -= 2;
							if (aLongArray15[anInt4318] == aLongArray15[anInt4318 + 1]) {
								local5 += local11[local5];
							}
						} else if (local34 == 70) {
							anInt4318 -= 2;
							if (aLongArray15[anInt4318] < aLongArray15[anInt4318 + 1]) {
								local5 += local11[local5];
							}
						} else if (local34 == 71) {
							anInt4318 -= 2;
							if (aLongArray15[anInt4318] > aLongArray15[anInt4318 + 1]) {
								local5 += local11[local5];
							}
						} else if (local34 == 72) {
							anInt4318 -= 2;
							if (aLongArray15[anInt4318] <= aLongArray15[anInt4318 + 1]) {
								local5 += local11[local5];
							}
						} else if (local34 == 73) {
							anInt4318 -= 2;
							if (aLongArray15[anInt4318] >= aLongArray15[anInt4318 + 1]) {
								local5 += local11[local5];
							}
						} else if (local34 == 86) {
							if (anIntArray219[--anInt4319] == 1) {
								local5 += local11[local5];
							}
						} else if (local34 == 87) {
							if (anIntArray219[--anInt4319] == 0) {
								local5 += local11[local5];
							}
						} else if (local34 == 106) {
							local96 = local11[local5];
							@Pc(1178) Integer local1178 = (Integer) Static539.anObjectArray37[local96];
							if (local1178 == null) {
								@Pc(1185) Class211 local1185 = Static379.aClass39_1.method767(local96);
								if (local1185.aChar6 == 'i' || local1185.aChar6 == '1') {
									anIntArray219[anInt4319++] = 0;
								} else {
									anIntArray219[anInt4319++] = -1;
								}
							} else {
								anIntArray219[anInt4319++] = local1178;
							}
						} else if (local34 == 107) {
							local96 = local11[local5];
							@Pc(1236) Class211 local1236 = Static379.aClass39_1.method767(local96);
							if (local1236.aChar6 != '\u0001') {
								anIntArray219[anInt4319++] = 0;
							}
							@Pc(1256) Integer local1256 = (Integer) Static539.anObjectArray37[local1236.anInt5353];
							if (local1256 == null) {
								anIntArray219[anInt4319++] = 0;
							} else {
								@Pc(1284) int local1284 = local1236.anInt5357 == 31 ? -1 : (0x1 << local1236.anInt5357 + 1) - 1;
								anIntArray219[anInt4319++] = (local1256 & local1284) >>> local1236.anInt5354;
							}
						} else if (local34 == 108) {
							local96 = local11[local5];
							@Pc(1311) Long local1311 = (Long) Static539.anObjectArray37[local96];
							if (local1311 == null) {
								aLongArray15[anInt4318++] = -1L;
							} else {
								aLongArray15[anInt4318++] = local1311;
							}
						} else if (local34 == 109) {
							local96 = local11[local5];
							local465 = (String) Static539.anObjectArray37[local96];
							if (local465 == null) {
								aStringArray22[anInt4321++] = "";
							} else {
								aStringArray22[anInt4321++] = local465;
							}
						} else if (local34 == 112) {
							anIntArray219[anInt4319++] = method3971(local11[local5]);
						} else if (local34 == 113) {
							anIntArray219[anInt4319++] = method3958(local11[local5]);
						} else if (local34 == 114) {
							aLongArray15[anInt4318++] = method3962(local11[local5]);
						} else if (local34 == 115) {
							aStringArray22[anInt4321++] = method3970(local11[local5]);
						}
					}
				}
			}
		} catch (@Pc(1479) Exception local1479) {
			@Pc(1500) StringBuffer local1500;
			if (arg0.aString57 == null) {
				local1500 = new StringBuffer(30);
				local1500.append("CS2: ").append(arg0.aLong312).append(" ");
				for (local706 = anInt4311 - 1; local706 >= 0; local706--) {
					local1500.append("v: ").append(aClass378Array1[local706].aClass5_Sub1_Sub10_1.aLong312).append(" ");
				}
				local1500.append("op: ").append(local13);
				Static522.method7115(local1479, local1500.toString());
			} else {
				Static218.method3476("Clientscript error in: " + arg0.aString57);
				local1500 = new StringBuffer(30);
				local1500.append("Clientscript error in: ").append(arg0.aString57).append("\n");
				for (local706 = anInt4311 - 1; local706 >= 0; local706--) {
					local1500.append("via: ").append(aClass378Array1[local706].aClass5_Sub1_Sub10_1.aString57).append("\n");
				}
				local1500.append("Op: ").append(local13).append("\n");
				@Pc(1546) String local1546 = local1479.getMessage();
				if (local1546 != null && local1546.length() > 0) {
					local1500.append("Message: ").append(local1546).append("\n");
				}
				Static522.method7115(local1479, local1500.toString());
				Static239.method3794(local1500.toString());
			}
		}
	}

	@OriginalMember(owner = "client!im", name = "a", descriptor = "(Lclient!ko;II)V")
	public static void method3961(@OriginalArg(0) Class208 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(5) Class5_Sub1_Sub10 local5 = Static69.method1144(arg0, arg1, arg2);
		if (local5 == null) {
			return;
		}
		anIntArray220 = new int[local5.anInt5145];
		aStringArray23 = new String[local5.anInt5147];
		if (local5.aClass208_3 == Static440.aClass208_8 || local5.aClass208_3 == Static566.aClass208_10 || local5.aClass208_3 == Static666.aClass208_12) {
			@Pc(35) int local35 = 0;
			@Pc(37) int local37 = 0;
			if (Static605.aClass238_15 != null) {
				local35 = Static605.aClass238_15.anInt6028;
				local37 = Static605.aClass238_15.anInt5989;
			}
			anIntArray220[0] = Static300.aClass164_1.method4999() - local35;
			anIntArray220[1] = Static300.aClass164_1.method5000() - local37;
		}
		method3960(local5, 200000);
	}

	@OriginalMember(owner = "client!im", name = "e", descriptor = "(I)J")
	private static long method3962(@OriginalArg(0) int arg0) {
		@Pc(9) Long local9 = aClass325_2.method7403(Static536.aClass290_6.anInt7535 << 16 | arg0);
		return local9 == null ? -1L : local9;
	}

	@OriginalMember(owner = "client!im", name = "d", descriptor = "(I)V")
	public static void method3963(@OriginalArg(0) int arg0) {
		if (arg0 == -1 || !Static20.method345(arg0)) {
			return;
		}
		@Pc(14) Class238[] local14 = Static397.aClass238ArrayArray2[arg0];
		for (@Pc(16) int local16 = 0; local16 < local14.length; local16++) {
			@Pc(21) Class238 local21 = local14[local16];
			if (local21.anObjectArray21 != null) {
				@Pc(28) Class5_Sub24 local28 = new Class5_Sub24();
				local28.aClass238_6 = local21;
				local28.anObjectArray2 = local21.anObjectArray21;
				method3969(local28, 2000000);
			}
		}
	}

	@OriginalMember(owner = "client!im", name = "a", descriptor = "(C)I")
	private static int method3964(@OriginalArg(0) char arg0) {
		return Static8.method136(arg0) ? 1 : 0;
	}

	@OriginalMember(owner = "client!im", name = "a", descriptor = "(Lclient!mj;)V")
	private static void method3965(@OriginalArg(0) Class238 arg0) {
		if (arg0 == null) {
			return;
		}
		@Pc(71) Class238[] local71;
		if (arg0.anInt5986 == -1) {
			@Pc(119) int local119 = arg0.anInt5971 >>> 16;
			@Pc(123) Class238[] local123 = Static17.aClass238ArrayArray1[local119];
			if (local123 == null) {
				local71 = Static397.aClass238ArrayArray2[local119];
				@Pc(132) int local132 = local71.length;
				local123 = Static17.aClass238ArrayArray1[local119] = new Class238[local132];
				Static693.method8316(local71, 0, local123, 0, local71.length);
			}
			@Pc(148) int local148;
			for (local148 = 0; local148 < local123.length && local123[local148] != arg0; local148++) {
			}
			if (local148 >= local123.length) {
				return;
			}
			Static693.method8316(local123, local148 + 1, local123, local148, local123.length - local148 - 1);
			local123[local123.length - 1] = arg0;
			return;
		}
		@Pc(12) Class238 local12 = Static305.method4761(arg0.anInt5963);
		if (local12 == null) {
			return;
		}
		if (local12.aClass238Array2 == local12.aClass238Array1) {
			local12.aClass238Array2 = new Class238[local12.aClass238Array1.length];
			local12.aClass238Array2[local12.aClass238Array2.length - 1] = arg0;
			Static693.method8316(local12.aClass238Array1, 0, local12.aClass238Array2, 0, arg0.anInt5986);
			Static693.method8316(local12.aClass238Array1, arg0.anInt5986 + 1, local12.aClass238Array2, arg0.anInt5986, local12.aClass238Array1.length - arg0.anInt5986 - 1);
			return;
		}
		@Pc(68) int local68 = 0;
		local71 = local12.aClass238Array2;
		while (local68 < local71.length && local71[local68] != arg0) {
			local68++;
		}
		if (local68 >= local71.length) {
			return;
		}
		Static693.method8316(local71, local68 + 1, local71, local68, local71.length - local68 - 1);
		local71[local12.aClass238Array2.length - 1] = arg0;
		return;
	}

	@OriginalMember(owner = "client!im", name = "b", descriptor = "(Lclient!mj;)V")
	private static void method3966(@OriginalArg(0) Class238 arg0) {
		if (arg0 == null) {
			return;
		}
		@Pc(69) Class238[] local69;
		if (arg0.anInt5986 == -1) {
			@Pc(106) int local106 = arg0.anInt5971 >>> 16;
			@Pc(110) Class238[] local110 = Static17.aClass238ArrayArray1[local106];
			if (local110 == null) {
				local69 = Static397.aClass238ArrayArray2[local106];
				@Pc(119) int local119 = local69.length;
				local110 = Static17.aClass238ArrayArray1[local106] = new Class238[local119];
				Static693.method8316(local69, 0, local110, 0, local69.length);
			}
			@Pc(135) int local135;
			for (local135 = 0; local135 < local110.length && local110[local135] != arg0; local135++) {
			}
			if (local135 >= local110.length) {
				return;
			}
			Static693.method8316(local110, 0, local110, 1, local135);
			local110[0] = arg0;
			return;
		}
		@Pc(12) Class238 local12 = Static305.method4761(arg0.anInt5963);
		if (local12 == null) {
			return;
		}
		if (local12.aClass238Array2 == local12.aClass238Array1) {
			local12.aClass238Array2 = new Class238[local12.aClass238Array1.length];
			local12.aClass238Array2[0] = arg0;
			Static693.method8316(local12.aClass238Array1, 0, local12.aClass238Array2, 1, arg0.anInt5986);
			Static693.method8316(local12.aClass238Array1, arg0.anInt5986 + 1, local12.aClass238Array2, arg0.anInt5986 + 1, local12.aClass238Array1.length - arg0.anInt5986 - 1);
			return;
		}
		@Pc(66) int local66 = 0;
		local69 = local12.aClass238Array2;
		while (local66 < local69.length && local69[local66] != arg0) {
			local66++;
		}
		if (local66 >= local69.length) {
			return;
		}
		Static693.method8316(local69, 0, local69, 1, local66);
		local69[0] = arg0;
		return;
	}

	@OriginalMember(owner = "client!im", name = "c", descriptor = "(IZ)V")
	private static void method3968(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1) {
		@Pc(109) int local109;
		@Pc(375) int local375;
		@Pc(95) String local95;
		@Pc(192) int local192;
		@Pc(1578) boolean local1578;
		@Pc(834) int local834;
		@Pc(115) int local115;
		@Pc(198) String local198;
		@Pc(101) String local101;
		if (arg0 < 5100) {
			if (arg0 == 5000) {
				anIntArray219[anInt4319++] = Static446.anInt7316;
				return;
			}
			@Pc(57) Class389 local57;
			@Pc(63) Class5_Sub41 local63;
			if (arg0 == 5001) {
				anInt4319 -= 3;
				Static446.anInt7316 = anIntArray219[anInt4319];
				Static385.aClass182_5 = Static466.method6570(anIntArray219[anInt4319 + 1]);
				if (Static385.aClass182_5 == null) {
					Static385.aClass182_5 = Static665.aClass182_4;
				}
				Static528.anInt8412 = anIntArray219[anInt4319 + 2];
				local57 = Static120.method1769(false);
				local63 = Static647.method8905(Static392.aClass381_170, local57.aClass393_2);
				local63.aClass5_Sub36_Sub2_1.method7324(Static446.anInt7316);
				local63.aClass5_Sub36_Sub2_1.method7324(Static385.aClass182_5.anInt4681);
				local63.aClass5_Sub36_Sub2_1.method7324(Static528.anInt8412);
				local57.method9079(local63);
				return;
			}
			if (arg0 == 5002) {
				anInt4321 -= 2;
				local95 = aStringArray22[anInt4321];
				local101 = aStringArray22[anInt4321 + 1];
				anInt4319 -= 2;
				local109 = anIntArray219[anInt4319];
				local115 = anIntArray219[anInt4319 + 1];
				if (local101 == null) {
					local101 = "";
				}
				if (local101.length() > 80) {
					local101 = local101.substring(0, 80);
				}
				@Pc(135) Class389 local135 = Static120.method1769(false);
				@Pc(141) Class5_Sub41 local141 = Static647.method8905(Static335.aClass381_238, local135.aClass393_2);
				local141.aClass5_Sub36_Sub2_1.method7324(Static271.method4453(local95) + Static271.method4453(local101) + 2);
				local141.aClass5_Sub36_Sub2_1.method7327(local95);
				local141.aClass5_Sub36_Sub2_1.method7324(local109 - 1);
				local141.aClass5_Sub36_Sub2_1.method7324(local115);
				local141.aClass5_Sub36_Sub2_1.method7327(local101);
				local135.method9079(local141);
				return;
			}
			@Pc(196) Class114 local196;
			if (arg0 == 5003) {
				local192 = anIntArray219[--anInt4319];
				local196 = Static113.method3802(local192);
				local198 = "";
				if (local196 != null && local196.aString24 != null) {
					local198 = local196.aString24;
				}
				aStringArray22[anInt4321++] = local198;
				return;
			}
			if (arg0 == 5004) {
				local192 = anIntArray219[--anInt4319];
				local196 = Static113.method3802(local192);
				local109 = -1;
				if (local196 != null) {
					local109 = local196.anInt3033;
				}
				anIntArray219[anInt4319++] = local109;
				return;
			}
			if (arg0 == 5005) {
				if (Static385.aClass182_5 == null) {
					anIntArray219[anInt4319++] = -1;
					return;
				}
				anIntArray219[anInt4319++] = Static385.aClass182_5.anInt4681;
				return;
			}
			@Pc(295) Class5_Sub41 local295;
			@Pc(289) Class389 local289;
			if (arg0 == 5006) {
				local192 = anIntArray219[--anInt4319];
				local289 = Static120.method1769(false);
				local295 = Static647.method8905(Static419.aClass381_181, local289.aClass393_2);
				local295.aClass5_Sub36_Sub2_1.method7324(local192);
				local289.method9079(local295);
				return;
			}
			if (arg0 == 5008) {
				local95 = aStringArray22[--anInt4321];
				method3956(local95, arg0);
				return;
			}
			if (arg0 == 5009) {
				anInt4321 -= 2;
				local95 = aStringArray22[anInt4321];
				local101 = aStringArray22[anInt4321 + 1];
				if (Static296.anInt5190 != 0 || (!Static163.aBoolean238 || Static490.aBoolean537) && !Static76.aBoolean116) {
					@Pc(360) Class389 local360 = Static120.method1769(false);
					@Pc(366) Class5_Sub41 local366 = Static647.method8905(Static228.aClass381_101, local360.aClass393_2);
					local366.aClass5_Sub36_Sub2_1.method7324(0);
					local375 = local366.aClass5_Sub36_Sub2_1.anInt8456;
					local366.aClass5_Sub36_Sub2_1.method7327(local95);
					Static253.method4125(local101, local366.aClass5_Sub36_Sub2_1);
					local366.aClass5_Sub36_Sub2_1.method7314(local366.aClass5_Sub36_Sub2_1.anInt8456 - local375);
					local360.method9079(local366);
					return;
				}
				return;
			}
			if (arg0 == 5010) {
				local192 = anIntArray219[--anInt4319];
				local196 = Static113.method3802(local192);
				local198 = "";
				if (local196 != null && local196.aString26 != null) {
					local198 = local196.aString26;
				}
				aStringArray22[anInt4321++] = local198;
				return;
			}
			if (arg0 == 5011) {
				local192 = anIntArray219[--anInt4319];
				local196 = Static113.method3802(local192);
				local198 = "";
				if (local196 != null && local196.aString27 != null) {
					local198 = local196.aString27;
				}
				aStringArray22[anInt4321++] = local198;
				return;
			}
			if (arg0 == 5012) {
				local192 = anIntArray219[--anInt4319];
				local196 = Static113.method3802(local192);
				local109 = -1;
				if (local196 != null) {
					local109 = local196.anInt3032;
				}
				anIntArray219[anInt4319++] = local109;
				return;
			}
			if (arg0 == 5015) {
				if (Static362.aClass4_Sub1_Sub1_Sub2_Sub1_4 == null || Static362.aClass4_Sub1_Sub1_Sub2_Sub1_4.aString43 == null) {
					local95 = "";
				} else {
					local95 = Static362.aClass4_Sub1_Sub1_Sub2_Sub1_4.method4084();
				}
				aStringArray22[anInt4321++] = local95;
				return;
			}
			if (arg0 == 5016) {
				anIntArray219[anInt4319++] = Static528.anInt8412;
				return;
			}
			if (arg0 == 5017) {
				anIntArray219[anInt4319++] = Static226.method3580();
				return;
			}
			if (arg0 == 5018) {
				local192 = anIntArray219[--anInt4319];
				local196 = Static113.method3802(local192);
				local109 = 0;
				if (local196 != null) {
					local109 = local196.anInt3034;
				}
				anIntArray219[anInt4319++] = local109;
				return;
			}
			if (arg0 == 5019) {
				local192 = anIntArray219[--anInt4319];
				local196 = Static113.method3802(local192);
				local198 = "";
				if (local196 != null && local196.aString25 != null) {
					local198 = local196.aString25;
				}
				aStringArray22[anInt4321++] = local198;
				return;
			}
			if (arg0 == 5020) {
				if (Static362.aClass4_Sub1_Sub1_Sub2_Sub1_4 == null || Static362.aClass4_Sub1_Sub1_Sub2_Sub1_4.aString43 == null) {
					local95 = "";
				} else {
					local95 = Static362.aClass4_Sub1_Sub1_Sub2_Sub1_4.method4077();
				}
				aStringArray22[anInt4321++] = local95;
				return;
			}
			if (arg0 == 5023) {
				local192 = anIntArray219[--anInt4319];
				local196 = Static113.method3802(local192);
				local109 = -1;
				if (local196 != null) {
					local109 = local196.anInt3031;
				}
				anIntArray219[anInt4319++] = local109;
				return;
			}
			if (arg0 == 5024) {
				local192 = anIntArray219[--anInt4319];
				local196 = Static113.method3802(local192);
				local109 = -1;
				if (local196 != null) {
					local109 = local196.anInt3037;
				}
				anIntArray219[anInt4319++] = local109;
				return;
			}
			if (arg0 == 5025) {
				local192 = anIntArray219[--anInt4319];
				local196 = Static113.method3802(local192);
				local198 = "";
				if (local196 != null && local196.aString23 != null) {
					local198 = local196.aString23;
				}
				aStringArray22[anInt4321++] = local198;
				return;
			}
			if (arg0 == 5050) {
				local192 = anIntArray219[--anInt4319];
				aStringArray22[anInt4321++] = Static646.aClass263_1.method6099(local192).aString7;
				return;
			}
			@Pc(793) Class5_Sub1_Sub2 local793;
			if (arg0 == 5051) {
				local192 = anIntArray219[--anInt4319];
				local793 = Static646.aClass263_1.method6099(local192);
				if (local793.anIntArray42 == null) {
					anIntArray219[anInt4319++] = 0;
					return;
				}
				anIntArray219[anInt4319++] = local793.anIntArray42.length;
				return;
			}
			if (arg0 == 5052) {
				anInt4319 -= 2;
				local192 = anIntArray219[anInt4319];
				local834 = anIntArray219[anInt4319 + 1];
				@Pc(839) Class5_Sub1_Sub2 local839 = Static646.aClass263_1.method6099(local192);
				local115 = local839.anIntArray42[local834];
				anIntArray219[anInt4319++] = local115;
				return;
			}
			if (arg0 == 5053) {
				local192 = anIntArray219[--anInt4319];
				local793 = Static646.aClass263_1.method6099(local192);
				if (local793.anIntArray39 == null) {
					anIntArray219[anInt4319++] = 0;
					return;
				}
				anIntArray219[anInt4319++] = local793.anIntArray39.length;
				return;
			}
			if (arg0 == 5054) {
				anInt4319 -= 2;
				local192 = anIntArray219[anInt4319];
				local834 = anIntArray219[anInt4319 + 1];
				anIntArray219[anInt4319++] = Static646.aClass263_1.method6099(local192).anIntArray39[local834];
				return;
			}
			if (arg0 == 5055) {
				local192 = anIntArray219[--anInt4319];
				aStringArray22[anInt4321++] = Static54.aClass308_1.method6953(local192).method3285();
				return;
			}
			if (arg0 == 5056) {
				local192 = anIntArray219[--anInt4319];
				@Pc(966) Class5_Sub1_Sub5 local966 = Static54.aClass308_1.method6953(local192);
				if (local966.anIntArray169 == null) {
					anIntArray219[anInt4319++] = 0;
					return;
				}
				anIntArray219[anInt4319++] = local966.anIntArray169.length;
				return;
			}
			if (arg0 == 5057) {
				anInt4319 -= 2;
				local192 = anIntArray219[anInt4319];
				local834 = anIntArray219[anInt4319 + 1];
				anIntArray219[anInt4319++] = Static54.aClass308_1.method6953(local192).anIntArray169[local834];
				return;
			}
			if (arg0 == 5058) {
				aClass108_1 = new Class108();
				aClass108_1.anInt2907 = anIntArray219[--anInt4319];
				aClass108_1.aClass5_Sub1_Sub5_1 = Static54.aClass308_1.method6953(aClass108_1.anInt2907);
				aClass108_1.anIntArray137 = new int[aClass108_1.aClass5_Sub1_Sub5_1.method3287()];
				return;
			}
			if (arg0 == 5059) {
				local57 = Static120.method1769(false);
				local63 = Static647.method8905(Static232.aClass381_103, local57.aClass393_2);
				local63.aClass5_Sub36_Sub2_1.method7324(0);
				local109 = local63.aClass5_Sub36_Sub2_1.anInt8456;
				local63.aClass5_Sub36_Sub2_1.method7324(0);
				local63.aClass5_Sub36_Sub2_1.method7296(aClass108_1.anInt2907);
				aClass108_1.aClass5_Sub1_Sub5_1.method3286((byte) -119, local63.aClass5_Sub36_Sub2_1, aClass108_1.anIntArray137);
				local63.aClass5_Sub36_Sub2_1.method7314(local63.aClass5_Sub36_Sub2_1.anInt8456 - local109);
				local57.method9079(local63);
				return;
			}
			if (arg0 == 5060) {
				local95 = aStringArray22[--anInt4321];
				local289 = Static120.method1769(false);
				local295 = Static647.method8905(Static129.aClass381_60, local289.aClass393_2);
				local295.aClass5_Sub36_Sub2_1.method7324(0);
				local115 = local295.aClass5_Sub36_Sub2_1.anInt8456;
				local295.aClass5_Sub36_Sub2_1.method7327(local95);
				local295.aClass5_Sub36_Sub2_1.method7296(aClass108_1.anInt2907);
				aClass108_1.aClass5_Sub1_Sub5_1.method3286((byte) -119, local295.aClass5_Sub36_Sub2_1, aClass108_1.anIntArray137);
				local295.aClass5_Sub36_Sub2_1.method7314(local295.aClass5_Sub36_Sub2_1.anInt8456 - local115);
				local289.method9079(local295);
				return;
			}
			if (arg0 == 5061) {
				local57 = Static120.method1769(false);
				local63 = Static647.method8905(Static232.aClass381_103, local57.aClass393_2);
				local63.aClass5_Sub36_Sub2_1.method7324(0);
				local109 = local63.aClass5_Sub36_Sub2_1.anInt8456;
				local63.aClass5_Sub36_Sub2_1.method7324(1);
				local63.aClass5_Sub36_Sub2_1.method7296(aClass108_1.anInt2907);
				aClass108_1.aClass5_Sub1_Sub5_1.method3286((byte) -119, local63.aClass5_Sub36_Sub2_1, aClass108_1.anIntArray137);
				local63.aClass5_Sub36_Sub2_1.method7314(local63.aClass5_Sub36_Sub2_1.anInt8456 - local109);
				local57.method9079(local63);
				return;
			}
			if (arg0 == 5062) {
				anInt4319 -= 2;
				local192 = anIntArray219[anInt4319];
				local834 = anIntArray219[anInt4319 + 1];
				anIntArray219[anInt4319++] = Static646.aClass263_1.method6099(local192).aCharArray1[local834];
				return;
			}
			if (arg0 == 5063) {
				anInt4319 -= 2;
				local192 = anIntArray219[anInt4319];
				local834 = anIntArray219[anInt4319 + 1];
				anIntArray219[anInt4319++] = Static646.aClass263_1.method6099(local192).aCharArray2[local834];
				return;
			}
			if (arg0 == 5064) {
				anInt4319 -= 2;
				local192 = anIntArray219[anInt4319];
				local834 = anIntArray219[anInt4319 + 1];
				if (local834 == -1) {
					anIntArray219[anInt4319++] = -1;
					return;
				}
				anIntArray219[anInt4319++] = Static646.aClass263_1.method6099(local192).method535((char) local834);
				return;
			}
			if (arg0 == 5065) {
				anInt4319 -= 2;
				local192 = anIntArray219[anInt4319];
				local834 = anIntArray219[anInt4319 + 1];
				if (local834 == -1) {
					anIntArray219[anInt4319++] = -1;
					return;
				}
				anIntArray219[anInt4319++] = Static646.aClass263_1.method6099(local192).method531((char) local834);
				return;
			}
			if (arg0 == 5066) {
				local192 = anIntArray219[--anInt4319];
				anIntArray219[anInt4319++] = Static54.aClass308_1.method6953(local192).method3287();
				return;
			}
			if (arg0 == 5067) {
				anInt4319 -= 2;
				local192 = anIntArray219[anInt4319];
				local834 = anIntArray219[anInt4319 + 1];
				local109 = Static54.aClass308_1.method6953(local192).method3294(local834).anInt7328;
				anIntArray219[anInt4319++] = local109;
				return;
			}
			if (arg0 == 5068) {
				anInt4319 -= 2;
				local192 = anIntArray219[anInt4319];
				local834 = anIntArray219[anInt4319 + 1];
				aClass108_1.anIntArray137[local192] = local834;
				return;
			}
			if (arg0 == 5069) {
				anInt4319 -= 2;
				local192 = anIntArray219[anInt4319];
				local834 = anIntArray219[anInt4319 + 1];
				aClass108_1.anIntArray137[local192] = local834;
				return;
			}
			if (arg0 == 5070) {
				anInt4319 -= 3;
				local192 = anIntArray219[anInt4319];
				local834 = anIntArray219[anInt4319 + 1];
				local109 = anIntArray219[anInt4319 + 2];
				@Pc(1526) Class5_Sub1_Sub5 local1526 = Static54.aClass308_1.method6953(local192);
				if (local1526.method3294(local834).anInt7328 != 0) {
					throw new RuntimeException("bad command");
				}
				anIntArray219[anInt4319++] = local1526.method3288(local834, local109);
				return;
			}
			if (arg0 == 5071) {
				local95 = aStringArray22[--anInt4321];
				local1578 = anIntArray219[--anInt4319] == 1;
				Static533.method7616(local1578, local95);
				anIntArray219[anInt4319++] = Static380.anInt6378;
				return;
			}
			if (arg0 == 5072) {
				if (Static602.aShortArray141 != null && Static637.anInt7728 < Static380.anInt6378) {
					anIntArray219[anInt4319++] = Static602.aShortArray141[Static637.anInt7728++] & 0xFFFF;
					return;
				}
				anIntArray219[anInt4319++] = -1;
				return;
			}
			if (arg0 == 5073) {
				Static637.anInt7728 = 0;
				return;
			}
			if (arg0 == 5074) {
				local57 = Static120.method1769(false);
				local63 = Static647.method8905(Static232.aClass381_103, local57.aClass393_2);
				local63.aClass5_Sub36_Sub2_1.method7324(0);
				local109 = local63.aClass5_Sub36_Sub2_1.anInt8456;
				local63.aClass5_Sub36_Sub2_1.method7324(2);
				local63.aClass5_Sub36_Sub2_1.method7296(aClass108_1.anInt2907);
				aClass108_1.aClass5_Sub1_Sub5_1.method3286((byte) -119, local63.aClass5_Sub36_Sub2_1, aClass108_1.anIntArray137);
				local63.aClass5_Sub36_Sub2_1.method7314(local63.aClass5_Sub36_Sub2_1.anInt8456 - local109);
				local57.method9079(local63);
				return;
			}
			if (arg0 == 5075) {
				local57 = Static120.method1769(false);
				local63 = Static647.method8905(Static232.aClass381_103, local57.aClass393_2);
				local63.aClass5_Sub36_Sub2_1.method7324(0);
				local109 = local63.aClass5_Sub36_Sub2_1.anInt8456;
				local63.aClass5_Sub36_Sub2_1.method7324(3);
				local63.aClass5_Sub36_Sub2_1.method7296(aClass108_1.anInt2907);
				aClass108_1.aClass5_Sub1_Sub5_1.method3286((byte) -119, local63.aClass5_Sub36_Sub2_1, aClass108_1.anIntArray137);
				local63.aClass5_Sub36_Sub2_1.method7314(local63.aClass5_Sub36_Sub2_1.anInt8456 - local109);
				local57.method9079(local63);
				return;
			}
		} else if (arg0 < 5200) {
			if (arg0 == 5100) {
				if (Static53.aClass297_1.method6737(86)) {
					anIntArray219[anInt4319++] = 1;
					return;
				}
				anIntArray219[anInt4319++] = 0;
				return;
			}
			if (arg0 == 5101) {
				if (Static53.aClass297_1.method6737(82)) {
					anIntArray219[anInt4319++] = 1;
					return;
				}
				anIntArray219[anInt4319++] = 0;
				return;
			}
			if (arg0 == 5102) {
				if (Static53.aClass297_1.method6737(81)) {
					anIntArray219[anInt4319++] = 1;
					return;
				}
				anIntArray219[anInt4319++] = 0;
				return;
			}
		} else {
			@Pc(2331) boolean local2331;
			if (arg0 < 5300) {
				if (arg0 == 5200) {
					Static138.method2558(anIntArray219[--anInt4319]);
					return;
				}
				if (arg0 == 5201) {
					anIntArray219[anInt4319++] = Static6.method94();
					return;
				}
				if (arg0 == 5205) {
					Static360.method5241(anIntArray219[--anInt4319], -1, -1, false);
					return;
				}
				@Pc(1908) Class5_Sub1_Sub16 local1908;
				if (arg0 == 5206) {
					local192 = anIntArray219[--anInt4319];
					local1908 = Static491.method677(local192 >> 14 & 0x3FFF, local192 & 0x3FFF);
					if (local1908 == null) {
						anIntArray219[anInt4319++] = -1;
						return;
					}
					anIntArray219[anInt4319++] = local1908.anInt7441;
					return;
				}
				@Pc(1942) Class5_Sub1_Sub16 local1942;
				if (arg0 == 5207) {
					local1942 = Static491.method668(anIntArray219[--anInt4319]);
					if (local1942 != null && local1942.aString89 != null) {
						aStringArray22[anInt4321++] = local1942.aString89;
						return;
					}
					aStringArray22[anInt4321++] = "";
					return;
				}
				if (arg0 == 5208) {
					anIntArray219[anInt4319++] = Static181.anInt3402;
					anIntArray219[anInt4319++] = Static98.anInt1632;
					return;
				}
				if (arg0 == 5209) {
					anIntArray219[anInt4319++] = Static124.anInt2052 + Static491.anInt622;
					anIntArray219[anInt4319++] = Static381.anInt6410 + Static491.anInt617;
					return;
				}
				if (arg0 == 5210) {
					local192 = anIntArray219[--anInt4319];
					local1908 = Static491.method668(local192);
					if (local1908 == null) {
						anIntArray219[anInt4319++] = 0;
						anIntArray219[anInt4319++] = 0;
						return;
					}
					anIntArray219[anInt4319++] = local1908.anInt7442 >> 14 & 0x3FFF;
					anIntArray219[anInt4319++] = local1908.anInt7442 & 0x3FFF;
					return;
				}
				if (arg0 == 5211) {
					local192 = anIntArray219[--anInt4319];
					local1908 = Static491.method668(local192);
					if (local1908 == null) {
						anIntArray219[anInt4319++] = 0;
						anIntArray219[anInt4319++] = 0;
						return;
					}
					anIntArray219[anInt4319++] = local1908.anInt7447 - local1908.anInt7437;
					anIntArray219[anInt4319++] = local1908.anInt7436 - local1908.anInt7439;
					return;
				}
				@Pc(2139) Class5_Sub49 local2139;
				if (arg0 == 5212) {
					local2139 = Static580.method7996();
					if (local2139 == null) {
						anIntArray219[anInt4319++] = -1;
						anIntArray219[anInt4319++] = -1;
						return;
					}
					anIntArray219[anInt4319++] = local2139.anInt8675;
					local834 = local2139.anInt8674 << 28 | local2139.anInt8671 + Static491.anInt622 << 14 | local2139.anInt8670 + Static491.anInt617;
					anIntArray219[anInt4319++] = local834;
					return;
				}
				if (arg0 == 5213) {
					local2139 = Static292.method4640();
					if (local2139 == null) {
						anIntArray219[anInt4319++] = -1;
						anIntArray219[anInt4319++] = -1;
						return;
					}
					anIntArray219[anInt4319++] = local2139.anInt8675;
					local834 = local2139.anInt8674 << 28 | local2139.anInt8671 + Static491.anInt622 << 14 | local2139.anInt8670 + Static491.anInt617;
					anIntArray219[anInt4319++] = local834;
					return;
				}
				@Pc(2289) boolean local2289;
				if (arg0 == 5214) {
					local192 = anIntArray219[--anInt4319];
					local1908 = Static6.method98();
					if (local1908 != null) {
						local2289 = local1908.method6483(local192 >> 14 & 0x3FFF, local192 >> 28 & 0x3, local192 & 0x3FFF, anIntArray222);
						if (local2289) {
							Static588.method8127(anIntArray222[2], anIntArray222[1]);
						}
					}
					return;
				}
				if (arg0 == 5215) {
					anInt4319 -= 2;
					local192 = anIntArray219[anInt4319];
					local834 = anIntArray219[anInt4319 + 1];
					@Pc(2329) Class388 local2329 = Static491.method656(local192 >> 14 & 0x3FFF, local192 & 0x3FFF);
					local2331 = false;
					for (@Pc(2336) Class5_Sub1_Sub16 local2336 = (Class5_Sub1_Sub16) local2329.method9027(); local2336 != null; local2336 = (Class5_Sub1_Sub16) local2329.method9024()) {
						if (local2336.anInt7441 == local834) {
							local2331 = true;
							break;
						}
					}
					if (local2331) {
						anIntArray219[anInt4319++] = 1;
						return;
					}
					anIntArray219[anInt4319++] = 0;
					return;
				}
				if (arg0 == 5218) {
					local192 = anIntArray219[--anInt4319];
					local1908 = Static491.method668(local192);
					if (local1908 == null) {
						anIntArray219[anInt4319++] = -1;
						return;
					}
					anIntArray219[anInt4319++] = local1908.anInt7448;
					return;
				}
				if (arg0 == 5220) {
					anIntArray219[anInt4319++] = Static455.anInt7370 == 100 ? 1 : 0;
					return;
				}
				if (arg0 == 5221) {
					local192 = anIntArray219[--anInt4319];
					Static588.method8127(local192 & 0x3FFF, local192 >> 14 & 0x3FFF);
					return;
				}
				if (arg0 == 5222) {
					local1942 = Static6.method98();
					if (local1942 != null) {
						local1578 = local1942.method6485(Static124.anInt2052 + Static491.anInt622, anIntArray222, Static381.anInt6410 + Static491.anInt617);
						if (local1578) {
							anIntArray219[anInt4319++] = anIntArray222[1];
							anIntArray219[anInt4319++] = anIntArray222[2];
							return;
						}
						anIntArray219[anInt4319++] = -1;
						anIntArray219[anInt4319++] = -1;
						return;
					}
					anIntArray219[anInt4319++] = -1;
					anIntArray219[anInt4319++] = -1;
					return;
				}
				if (arg0 == 5223) {
					anInt4319 -= 2;
					local192 = anIntArray219[anInt4319];
					local834 = anIntArray219[anInt4319 + 1];
					Static360.method5241(local192, local834 & 0x3FFF, local834 >> 14 & 0x3FFF, false);
					return;
				}
				if (arg0 == 5224) {
					local192 = anIntArray219[--anInt4319];
					local1908 = Static6.method98();
					if (local1908 != null) {
						local2289 = local1908.method6483(local192 >> 14 & 0x3FFF, local192 >> 28 & 0x3, local192 & 0x3FFF, anIntArray222);
						if (local2289) {
							anIntArray219[anInt4319++] = anIntArray222[1];
							anIntArray219[anInt4319++] = anIntArray222[2];
							return;
						}
						anIntArray219[anInt4319++] = -1;
						anIntArray219[anInt4319++] = -1;
						return;
					}
					anIntArray219[anInt4319++] = -1;
					anIntArray219[anInt4319++] = -1;
					return;
				}
				if (arg0 == 5225) {
					local192 = anIntArray219[--anInt4319];
					local1908 = Static6.method98();
					if (local1908 != null) {
						local2289 = local1908.method6485(local192 >> 14 & 0x3FFF, anIntArray222, local192 & 0x3FFF);
						if (local2289) {
							anIntArray219[anInt4319++] = anIntArray222[1];
							anIntArray219[anInt4319++] = anIntArray222[2];
							return;
						}
						anIntArray219[anInt4319++] = -1;
						anIntArray219[anInt4319++] = -1;
						return;
					}
					anIntArray219[anInt4319++] = -1;
					anIntArray219[anInt4319++] = -1;
					return;
				}
				if (arg0 == 5226) {
					Static409.method5965(anIntArray219[--anInt4319]);
					return;
				}
				if (arg0 == 5227) {
					anInt4319 -= 2;
					local192 = anIntArray219[anInt4319];
					local834 = anIntArray219[anInt4319 + 1];
					Static360.method5241(local192, local834 & 0x3FFF, local834 >> 14 & 0x3FFF, true);
					return;
				}
				if (arg0 == 5228) {
					Static633.aBoolean746 = anIntArray219[--anInt4319] == 1;
					return;
				}
				if (arg0 == 5229) {
					anIntArray219[anInt4319++] = Static633.aBoolean746 ? 1 : 0;
					return;
				}
				if (arg0 == 5230) {
					local192 = anIntArray219[--anInt4319];
					Static352.method5179(local192);
					return;
				}
				@Pc(2867) Class5 local2867;
				if (arg0 == 5231) {
					anInt4319 -= 2;
					local192 = anIntArray219[anInt4319];
					local1578 = anIntArray219[anInt4319 + 1] == 1;
					if (Static555.aClass306_40 != null) {
						local2867 = Static555.aClass306_40.method6943((long) local192);
						if (local2867 != null && !local1578) {
							local2867.method9222();
							return;
						}
						if (local2867 == null && local1578) {
							local2867 = new Class5();
							Static555.aClass306_40.method6944(local2867, (long) local192, -12002);
						}
					}
					return;
				}
				@Pc(2914) Class5 local2914;
				if (arg0 == 5232) {
					local192 = anIntArray219[--anInt4319];
					if (Static555.aClass306_40 != null) {
						local2914 = Static555.aClass306_40.method6943((long) local192);
						anIntArray219[anInt4319++] = local2914 == null ? 0 : 1;
						return;
					}
					anIntArray219[anInt4319++] = 0;
					return;
				}
				if (arg0 == 5233) {
					anInt4319 -= 2;
					local192 = anIntArray219[anInt4319];
					local1578 = anIntArray219[anInt4319 + 1] == 1;
					if (Static582.aClass306_42 != null) {
						local2867 = Static582.aClass306_42.method6943((long) local192);
						if (local2867 != null && !local1578) {
							local2867.method9222();
							return;
						}
						if (local2867 == null && local1578) {
							local2867 = new Class5();
							Static582.aClass306_42.method6944(local2867, (long) local192, -12002);
						}
					}
					return;
				}
				if (arg0 == 5234) {
					local192 = anIntArray219[--anInt4319];
					if (Static582.aClass306_42 != null) {
						local2914 = Static582.aClass306_42.method6943((long) local192);
						anIntArray219[anInt4319++] = local2914 == null ? 0 : 1;
						return;
					}
					anIntArray219[anInt4319++] = 0;
					return;
				}
				if (arg0 == 5235) {
					anIntArray219[anInt4319++] = Static491.aClass5_Sub1_Sub16_2 == null ? -1 : Static491.aClass5_Sub1_Sub16_2.anInt7441;
					return;
				}
				if (arg0 == 5236) {
					anInt4319 -= 2;
					local192 = anIntArray219[anInt4319];
					local834 = anIntArray219[anInt4319 + 1];
					local109 = local834 >> 14 & 0x3FFF;
					local115 = local834 & 0x3FFF;
					local375 = Static127.method1896(local115, local109, local192);
					if (local375 < 0) {
						anIntArray219[anInt4319++] = -1;
						return;
					}
					anIntArray219[anInt4319++] = local375;
					return;
				}
				if (arg0 == 5237) {
					Static378.method5604();
					return;
				}
			} else if (arg0 < 5400) {
				if (arg0 == 5300) {
					anInt4319 -= 2;
					local192 = anIntArray219[anInt4319];
					local834 = anIntArray219[anInt4319 + 1];
					Static471.method6672(3, local834, local192, false);
					anIntArray219[anInt4319++] = Static95.aFrame1 == null ? 0 : 1;
					return;
				}
				if (arg0 == 5301) {
					if (Static95.aFrame1 != null) {
						Static471.method6672(Static577.aClass5_Sub19_25.aClass17_Sub6_1.method1610(), -1, -1, false);
					}
					return;
				}
				if (arg0 == 5302) {
					@Pc(3186) Class284[] local3186 = Static84.method1342();
					anIntArray219[anInt4319++] = local3186.length;
					return;
				}
				if (arg0 == 5303) {
					local192 = anIntArray219[--anInt4319];
					@Pc(3210) Class284[] local3210 = Static84.method1342();
					anIntArray219[anInt4319++] = local3210[local192].anInt7350;
					anIntArray219[anInt4319++] = local3210[local192].anInt7345;
					return;
				}
				if (arg0 == 5305) {
					local192 = Static12.anInt146;
					local834 = Static192.anInt7406;
					local109 = -1;
					@Pc(3245) Class284[] local3245 = Static84.method1342();
					for (local375 = 0; local375 < local3245.length; local375++) {
						@Pc(3252) Class284 local3252 = local3245[local375];
						if (local3252.anInt7350 == local192 && local3252.anInt7345 == local834) {
							local109 = local375;
							break;
						}
					}
					anIntArray219[anInt4319++] = local109;
					return;
				}
				if (arg0 == 5306) {
					anIntArray219[anInt4319++] = Static260.method4249();
					return;
				}
				if (arg0 == 5307) {
					local192 = anIntArray219[--anInt4319];
					if (local192 >= 1 && local192 <= 2) {
						Static471.method6672(local192, -1, -1, false);
						return;
					}
					return;
				}
				if (arg0 == 5308) {
					anIntArray219[anInt4319++] = Static577.aClass5_Sub19_25.aClass17_Sub6_1.method1610();
					return;
				}
				if (arg0 == 5309) {
					local192 = anIntArray219[--anInt4319];
					if (local192 >= 1 && local192 <= 2) {
						Static577.aClass5_Sub19_25.method2550(Static577.aClass5_Sub19_25.aClass17_Sub6_1, local192);
						Static577.aClass5_Sub19_25.method2550(Static577.aClass5_Sub19_25.lb, local192);
						Static111.method1655();
						return;
					}
					return;
				}
			} else {
				@Pc(3561) int local3561;
				if (arg0 < 5500) {
					if (arg0 == 5400) {
						anInt4321 -= 2;
						local95 = aStringArray22[anInt4321];
						local101 = aStringArray22[anInt4321 + 1];
						local109 = anIntArray219[--anInt4319];
						@Pc(3411) Class389 local3411 = Static120.method1769(false);
						@Pc(3417) Class5_Sub41 local3417 = Static647.method8905(Static103.aClass381_51, local3411.aClass393_2);
						local3417.aClass5_Sub36_Sub2_1.method7324(Static271.method4453(local95) + Static271.method4453(local101) + 1);
						local3417.aClass5_Sub36_Sub2_1.method7327(local95);
						local3417.aClass5_Sub36_Sub2_1.method7327(local101);
						local3417.aClass5_Sub36_Sub2_1.method7324(local109);
						local3411.method9079(local3417);
						return;
					}
					if (arg0 == 5401) {
						anInt4319 -= 2;
						Static279.aShortArray62[anIntArray219[anInt4319]] = (short) Static515.method7059(anIntArray219[anInt4319 + 1]);
						Static82.aClass134_1.method3188();
						Static82.aClass134_1.method3194();
						Static378.aClass369_2.method8465();
						Static352.method5188(-113);
						return;
					}
					if (arg0 == 5405) {
						anInt4319 -= 2;
						local192 = anIntArray219[anInt4319];
						local834 = anIntArray219[anInt4319 + 1];
						if (local192 >= 0 && local192 < 2) {
							Static499.anIntArrayArrayArray17[local192] = new int[local834 << 1][4];
						}
						return;
					}
					if (arg0 == 5406) {
						anInt4319 -= 7;
						local192 = anIntArray219[anInt4319];
						local834 = anIntArray219[anInt4319 + 1] << 1;
						local109 = anIntArray219[anInt4319 + 2];
						local115 = anIntArray219[anInt4319 + 3];
						local375 = anIntArray219[anInt4319 + 4];
						local3561 = anIntArray219[anInt4319 + 5];
						@Pc(3567) int local3567 = anIntArray219[anInt4319 + 6];
						if (local192 >= 0 && local192 < 2 && Static499.anIntArrayArrayArray17[local192] != null && local834 >= 0 && local834 < Static499.anIntArrayArrayArray17[local192].length) {
							Static499.anIntArrayArrayArray17[local192][local834] = new int[] { (local109 >> 14 & 0x3FFF) << 9, local115 << 2, (local109 & 0x3FFF) << 9, local3567 };
							Static499.anIntArrayArrayArray17[local192][local834 + 1] = new int[] { (local375 >> 14 & 0x3FFF) << 9, local3561 << 2, (local375 & 0x3FFF) << 9 };
						}
						return;
					}
					if (arg0 == 5407) {
						local192 = Static499.anIntArrayArrayArray17[anIntArray219[--anInt4319]].length >> 1;
						anIntArray219[anInt4319++] = local192;
						return;
					}
					if (arg0 == 5411) {
						if (Static95.aFrame1 != null) {
							Static471.method6672(Static577.aClass5_Sub19_25.aClass17_Sub6_1.method1610(), -1, -1, false);
						}
						if (Static207.aFrame2 != null) {
							Static66.method1106();
							System.exit(0);
							return;
						}
						local95 = Static665.aString55 == null ? Static467.method6574() : Static665.aString55;
						Static200.method3315(Static681.aClass349_6, local95, false, Static577.aClass5_Sub19_25.aClass17_Sub24_2.method8102() == 1);
						return;
					}
					if (arg0 == 5419) {
						local95 = "";
						if (Static77.aClass361_1 != null) {
							if (Static77.aClass361_1.anObject20 == null) {
								local95 = Static572.method7701(Static77.aClass361_1.anInt9719);
							} else {
								local95 = (String) Static77.aClass361_1.anObject20;
							}
						}
						aStringArray22[anInt4321++] = local95;
						return;
					}
					if (arg0 == 5420) {
						anIntArray219[anInt4319++] = Static681.aClass349_6.aBoolean601 ? 0 : 1;
						return;
					}
					if (arg0 == 5421) {
						if (Static95.aFrame1 != null) {
							Static471.method6672(Static577.aClass5_Sub19_25.aClass17_Sub6_1.method1610(), -1, -1, false);
						}
						local95 = aStringArray22[--anInt4321];
						local1578 = anIntArray219[--anInt4319] == 1;
						local198 = Static467.method6574() + local95;
						Static200.method3315(Static681.aClass349_6, local198, local1578, Static577.aClass5_Sub19_25.aClass17_Sub24_2.method8102() == 1);
						return;
					}
					if (arg0 == 5422) {
						anInt4321 -= 2;
						local95 = aStringArray22[anInt4321];
						local101 = aStringArray22[anInt4321 + 1];
						local109 = anIntArray219[--anInt4319];
						if (local95.length() > 0) {
							if (Static196.aStringArray19 == null) {
								Static196.aStringArray19 = new String[Static416.anIntArray419[Static536.aClass290_6.anInt7535]];
							}
							Static196.aStringArray19[local109] = local95;
						}
						if (local101.length() > 0) {
							if (Static562.aStringArray38 == null) {
								Static562.aStringArray38 = new String[Static416.anIntArray419[Static536.aClass290_6.anInt7535]];
							}
							Static562.aStringArray38[local109] = local101;
						}
						return;
					}
					if (arg0 == 5423) {
						System.out.println(aStringArray22[--anInt4321]);
						return;
					}
					if (arg0 == 5424) {
						anInt4319 -= 11;
						Static165.anInt3242 = anIntArray219[anInt4319];
						Static492.anInt7973 = anIntArray219[anInt4319 + 1];
						Static208.anInt3699 = anIntArray219[anInt4319 + 2];
						Static198.anInt3602 = anIntArray219[anInt4319 + 3];
						Static629.anInt10037 = anIntArray219[anInt4319 + 4];
						Static448.anInt7325 = anIntArray219[anInt4319 + 5];
						Static398.anInt6727 = anIntArray219[anInt4319 + 6];
						Static93.anInt1564 = anIntArray219[anInt4319 + 7];
						Static66.anInt1115 = anIntArray219[anInt4319 + 8];
						Static180.anInt3395 = anIntArray219[anInt4319 + 9];
						Static533.anInt8877 = anIntArray219[anInt4319 + 10];
						Static27.aClass126_18.method3077(Static629.anInt10037);
						Static27.aClass126_18.method3077(Static448.anInt7325);
						Static27.aClass126_18.method3077(Static398.anInt6727);
						Static27.aClass126_18.method3077(Static93.anInt1564);
						Static27.aClass126_18.method3077(Static66.anInt1115);
						Static550.aClass155_12 = null;
						Static196.aClass155_10 = null;
						Static340.aClass155_15 = null;
						Static669.aClass155_38 = null;
						Static302.aClass155_14 = null;
						Static601.aClass155_33 = null;
						Static526.aClass155_30 = null;
						Static147.aClass155_8 = null;
						Static116.aBoolean570 = true;
						return;
					}
					if (arg0 == 5425) {
						Static220.method3523();
						Static116.aBoolean570 = false;
						return;
					}
					if (arg0 == 5426) {
						anInt4319 -= 2;
						Static27.anInt363 = anIntArray219[anInt4319];
						Static61.anInt1040 = anIntArray219[anInt4319 + 1];
						return;
					}
					if (arg0 == 5427) {
						anInt4319 -= 2;
						Static1.anInt8120 = anIntArray219[anInt4319 + 1];
						return;
					}
					if (arg0 == 5428) {
						anInt4319 -= 2;
						local192 = anIntArray219[anInt4319];
						local834 = anIntArray219[anInt4319 + 1];
						anIntArray219[anInt4319++] = Static138.method2562(local834, local192) ? 1 : 0;
						return;
					}
					if (arg0 == 5429) {
						Static661.method9076(false, false, aStringArray22[--anInt4321]);
						return;
					}
					if (arg0 == 5430) {
						try {
							Static684.method782(Static265.anApplet2, "accountcreated");
							return;
						} catch (@Pc(4154) Throwable local4154) {
							return;
						}
					}
					if (arg0 == 5431) {
						try {
							Static684.method782(Static265.anApplet2, "accountcreatestarted");
							return;
						} catch (@Pc(4167) Throwable local4167) {
							return;
						}
					}
					if (arg0 == 5432) {
						local95 = "";
						if (Static78.aClipboard1 != null) {
							@Pc(4179) Transferable local4179 = Static78.aClipboard1.getContents((Object) null);
							if (local4179 != null) {
								try {
									local95 = (String) local4179.getTransferData(DataFlavor.stringFlavor);
									if (local95 == null) {
										local95 = "";
									}
								} catch (@Pc(4192) Exception local4192) {
								}
							}
						}
						aStringArray22[anInt4321++] = local95;
						return;
					}
					if (arg0 == 5433) {
						Static52.anInt915 = anIntArray219[--anInt4319];
						return;
					}
					if (arg0 == 5435) {
						anIntArray219[anInt4319++] = Static460.aBoolean507 ? 1 : 0;
						return;
					}
					if (arg0 == 5436) {
						if (Static506.aClass5_Sub32_2.anInt5633 < 6) {
							anIntArray219[anInt4319++] = 0;
							return;
						}
						if (Static506.aClass5_Sub32_2.anInt5633 == 6 && Static506.aClass5_Sub32_2.anInt5616 < 10) {
							anIntArray219[anInt4319++] = 0;
							return;
						}
						anIntArray219[anInt4319++] = 1;
						return;
					}
				} else if (arg0 < 5600) {
					if (arg0 == 5500) {
						anInt4319 -= 4;
						local192 = anIntArray219[anInt4319];
						local834 = anIntArray219[anInt4319 + 1];
						local109 = anIntArray219[anInt4319 + 2];
						local115 = anIntArray219[anInt4319 + 3];
						Static411.method6062(local834 << 2, false, local115, local109, (local192 & 0x3FFF) - Static290.anInt5128, (local192 >> 14 & 0x3FFF) - Static315.anInt5380);
						return;
					}
					if (arg0 == 5501) {
						anInt4319 -= 4;
						local192 = anIntArray219[anInt4319];
						local834 = anIntArray219[anInt4319 + 1];
						local109 = anIntArray219[anInt4319 + 2];
						local115 = anIntArray219[anInt4319 + 3];
						Static284.method4549(local115, local109, local834 << 2, (local192 & 0x3FFF) - Static290.anInt5128, (local192 >> 14 & 0x3FFF) - Static315.anInt5380);
						return;
					}
					if (arg0 == 5502) {
						anInt4319 -= 6;
						local192 = anIntArray219[anInt4319];
						if (local192 >= 2) {
							throw new RuntimeException();
						}
						Static555.anInt8761 = local192;
						local834 = anIntArray219[anInt4319 + 1];
						if (local834 + 1 >= Static499.anIntArrayArrayArray17[Static555.anInt8761].length >> 1) {
							throw new RuntimeException();
						}
						Static237.anInt4099 = local834;
						Static456.anInt7383 = 0;
						Static473.anInt7693 = anIntArray219[anInt4319 + 2];
						Static375.anInt7799 = anIntArray219[anInt4319 + 3];
						local109 = anIntArray219[anInt4319 + 4];
						if (local109 >= 2) {
							throw new RuntimeException();
						}
						Static35.anInt522 = local109;
						local115 = anIntArray219[anInt4319 + 5];
						if (local115 + 1 >= Static499.anIntArrayArrayArray17[Static35.anInt522].length >> 1) {
							throw new RuntimeException();
						}
						Static227.anInt9454 = local115;
						Static426.anInt7111 = 3;
						Static417.anInt7039 = -1;
						Static227.anInt9451 = -1;
						return;
					}
					if (arg0 == 5503) {
						Static234.method3707();
						return;
					}
					if (arg0 == 5504) {
						anInt4319 -= 2;
						Static38.method680(anIntArray219[anInt4319 + 1], anIntArray219[anInt4319]);
						return;
					}
					if (arg0 == 5505) {
						anIntArray219[anInt4319++] = (int) Static211.aFloat113 >> 3;
						return;
					}
					if (arg0 == 5506) {
						anIntArray219[anInt4319++] = (int) Static243.aFloat117 >> 3;
						return;
					}
					if (arg0 == 5507) {
						Static295.method4656();
						return;
					}
					if (arg0 == 5508) {
						Static114.method1697();
						return;
					}
					if (arg0 == 5509) {
						Static332.method5021();
						return;
					}
					if (arg0 == 5510) {
						Static478.method6757();
						return;
					}
					if (arg0 == 5511) {
						local192 = anIntArray219[--anInt4319];
						local834 = local192 >> 14 & 0x3FFF;
						local109 = local192 & 0x3FFF;
						local834 -= Static315.anInt5380;
						if (local834 < 0) {
							local834 = 0;
						} else if (local834 >= Static271.anInt4910) {
							local834 = Static271.anInt4910;
						}
						local109 -= Static290.anInt5128;
						if (local109 < 0) {
							local109 = 0;
						} else if (local109 >= Static613.anInt9909) {
							local109 = Static613.anInt9909;
						}
						Static488.anInt7900 = (local834 << 9) + 256;
						Static334.anInt9969 = (local109 << 9) + 256;
						Static426.anInt7111 = 4;
						Static417.anInt7039 = -1;
						Static227.anInt9451 = -1;
						return;
					}
					if (arg0 == 5512) {
						Static681.method9215();
						return;
					}
					if (arg0 == 5514) {
						Static216.anInt1166 = anIntArray219[--anInt4319];
						return;
					}
					if (arg0 == 5516) {
						anIntArray219[anInt4319++] = Static216.anInt1166;
						return;
					}
					if (arg0 == 5517) {
						local192 = anIntArray219[--anInt4319];
						if (local192 == -1) {
							local834 = local192 >> 14 & 0x3FFF;
							local109 = local192 & 0x3FFF;
							local834 -= Static315.anInt5380;
							if (local834 < 0) {
								local834 = 0;
							} else if (local834 >= Static271.anInt4910) {
								local834 = Static271.anInt4910;
							}
							local109 -= Static290.anInt5128;
							if (local109 < 0) {
								local109 = 0;
							} else if (local109 >= Static613.anInt9909) {
								local109 = Static613.anInt9909;
							}
							Static227.anInt9451 = (local834 << 9) + 256;
							Static417.anInt7039 = (local109 << 9) + 256;
							return;
						}
						Static227.anInt9451 = -1;
						Static417.anInt7039 = -1;
						return;
					}
				} else if (arg0 < 5700) {
					if (arg0 == 5600) {
						anInt4321 -= 2;
						local95 = aStringArray22[anInt4321];
						local101 = aStringArray22[anInt4321 + 1];
						local109 = anIntArray219[--anInt4319];
						Static114.method1692(local109, local101, local95);
						return;
					}
					if (arg0 == 5601) {
						Static386.method5712();
						return;
					}
					if (arg0 == 5602) {
						if (!Static546.method7472()) {
							Static13.method207();
						}
						return;
					}
					if (arg0 == 5604) {
						anInt4321--;
						if (Static652.anInt10664 != 3) {
							return;
						}
						if (!Static546.method7472() && Static78.anInt1382 == 0) {
							Static17.method268(aStringArray22[anInt4321]);
							return;
						}
						return;
					}
					if (arg0 == 5605) {
						anInt4321 -= 2;
						anInt4319 -= 2;
						if (Static652.anInt10664 != 3) {
							return;
						}
						if (!Static546.method7472() && Static78.anInt1382 == 0) {
							Static26.method395(anIntArray219[anInt4319], aStringArray22[anInt4321 + 1], aStringArray22[anInt4321], anIntArray219[anInt4319 + 1] == 1);
							return;
						}
						return;
					}
					if (arg0 == 5606) {
						if (Static78.anInt1382 == 0) {
							Static447.anInt7320 = -2;
						}
						return;
					}
					if (arg0 == 5607) {
						anIntArray219[anInt4319++] = Static438.anInt7237;
						return;
					}
					if (arg0 == 5608) {
						anIntArray219[anInt4319++] = Static533.anInt8884;
						return;
					}
					if (arg0 == 5609) {
						anIntArray219[anInt4319++] = Static447.anInt7320;
						return;
					}
					if (arg0 == 5611) {
						anIntArray219[anInt4319++] = Static280.anInt4976;
						return;
					}
					if (arg0 == 5612) {
						local192 = anIntArray219[--anInt4319];
						Static351.method5176(local192);
						return;
					}
					if (arg0 == 5613) {
						anIntArray219[anInt4319++] = Static438.anInt7237;
						return;
					}
					if (arg0 == 5615) {
						anInt4321 -= 2;
						local95 = aStringArray22[anInt4321];
						local101 = aStringArray22[anInt4321 + 1];
						Static148.method2746(local95, local101);
						return;
					}
					if (arg0 == 5616) {
						Static452.method6395(false);
						return;
					}
					if (arg0 == 5617) {
						anIntArray219[anInt4319++] = Static62.anInt1051;
						return;
					}
					if (arg0 == 5618) {
						anInt4319--;
						return;
					}
					if (arg0 == 5619) {
						anInt4319--;
						return;
					}
					if (arg0 == 5620) {
						anIntArray219[anInt4319++] = 0;
						return;
					}
					if (arg0 == 5621) {
						anInt4321 -= 2;
						anInt4319 -= 2;
						return;
					}
					if (arg0 == 5622) {
						return;
					}
					if (arg0 == 5623) {
						if (Static417.aByteArray79 != null) {
							anIntArray219[anInt4319++] = 1;
							return;
						}
						anIntArray219[anInt4319++] = 0;
						return;
					}
					if (arg0 == 5624) {
						anIntArray219[anInt4319++] = (int) (Static218.aLong113 >> 32);
						anIntArray219[anInt4319++] = (int) (Static218.aLong113 & 0xFFFFFFFFFFFFFFFFL);
						return;
					}
					if (arg0 == 5625) {
						anIntArray219[anInt4319++] = Static525.aBoolean555 ? 1 : 0;
						return;
					}
					if (arg0 == 5626) {
						Static525.aBoolean555 = true;
						Static147.method2741();
						return;
					}
					if (arg0 == 5627) {
						anIntArray219[anInt4319++] = Static332.anInt5594;
						anIntArray219[anInt4319++] = Static147.anInt2909;
						Static332.anInt5594 = -2;
						Static147.anInt2909 = -1;
						return;
					}
					if (arg0 == 5628) {
						anIntArray219[anInt4319++] = Static546.method7472() ? 1 : 0;
						return;
					}
					if (arg0 == 5629) {
						anIntArray219[anInt4319++] = Static144.anInt2848;
						return;
					}
					if (arg0 == 5630) {
						Static374.method5568();
						return;
					}
					if (arg0 == 5631) {
						anInt4319 -= 2;
						local192 = anIntArray219[anInt4319];
						local834 = anIntArray219[anInt4319 + 1];
						Static157.method2870(local834, local192);
						return;
					}
					if (arg0 == 5632) {
						local192 = anIntArray219[--anInt4319];
						Static640.method8832(local192);
						return;
					}
				} else if (arg0 < 6100) {
					if (arg0 == 6001) {
						local192 = anIntArray219[--anInt4319];
						Static577.aClass5_Sub19_25.method2550(Static577.aClass5_Sub19_25.aClass17_Sub4_1, local192);
						Static627.method8561();
						Static111.method1655();
						Static386.aBoolean427 = false;
						return;
					}
					@Pc(5300) boolean local5300;
					if (arg0 == 6002) {
						local5300 = anIntArray219[--anInt4319] == 1;
						Static577.aClass5_Sub19_25.method2550(Static577.aClass5_Sub19_25.aClass17_Sub27_2, local5300 ? 1 : 0);
						Static577.aClass5_Sub19_25.method2550(Static577.aClass5_Sub19_25.aClass17_Sub27_1, local5300 ? 1 : 0);
						Static627.method8561();
						Static635.method8807();
						Static111.method1655();
						Static386.aBoolean427 = false;
						return;
					}
					if (arg0 == 6003) {
						local5300 = anIntArray219[--anInt4319] == 1;
						Static577.aClass5_Sub19_25.method2550(Static577.aClass5_Sub19_25.aClass17_Sub19_1, local5300 ? 2 : 1);
						Static577.aClass5_Sub19_25.method2550(Static577.aClass5_Sub19_25.aClass17_Sub19_2, local5300 ? 2 : 1);
						Static635.method8807();
						Static111.method1655();
						Static386.aBoolean427 = false;
						return;
					}
					if (arg0 == 6005) {
						Static577.aClass5_Sub19_25.method2550(Static577.aClass5_Sub19_25.aClass17_Sub16_1, anIntArray219[--anInt4319] == 1 ? 1 : 0);
						Static627.method8561();
						Static111.method1655();
						Static386.aBoolean427 = false;
						return;
					}
					if (arg0 == 6007) {
						Static577.aClass5_Sub19_25.method2550(Static577.aClass5_Sub19_25.aClass17_Sub22_1, anIntArray219[--anInt4319]);
						Static111.method1655();
						Static386.aBoolean427 = false;
						return;
					}
					if (arg0 == 6008) {
						Static577.aClass5_Sub19_25.method2550(Static577.aClass5_Sub19_25.aClass17_Sub14_1, anIntArray219[--anInt4319] == 1 ? 1 : 0);
						Static111.method1655();
						Static386.aBoolean427 = false;
						return;
					}
					if (arg0 == 6010) {
						Static577.aClass5_Sub19_25.method2550(Static577.aClass5_Sub19_25.aClass17_Sub8_1, anIntArray219[--anInt4319] == 1 ? 1 : 0);
						Static111.method1655();
						Static386.aBoolean427 = false;
						return;
					}
					if (arg0 == 6011) {
						Static577.aClass5_Sub19_25.method2550(Static577.aClass5_Sub19_25.aClass17_Sub3_1, anIntArray219[--anInt4319]);
						Static627.method8561();
						Static111.method1655();
						Static386.aBoolean427 = false;
						return;
					}
					if (arg0 == 6012) {
						Static577.aClass5_Sub19_25.method2550(Static577.aClass5_Sub19_25.aClass17_Sub23_1, anIntArray219[--anInt4319] == 1 ? 1 : 0);
						Static569.method7681();
						Static8.method134();
						Static111.method1655();
						Static386.aBoolean427 = false;
						return;
					}
					if (arg0 == 6014) {
						Static577.aClass5_Sub19_25.method2550(Static577.aClass5_Sub19_25.aClass17_Sub10_1, anIntArray219[--anInt4319] == 1 ? 2 : 0);
						Static627.method8561();
						Static111.method1655();
						Static386.aBoolean427 = false;
						return;
					}
					if (arg0 == 6015) {
						Static577.aClass5_Sub19_25.method2550(Static577.aClass5_Sub19_25.aClass17_Sub28_1, anIntArray219[--anInt4319] == 1 ? 1 : 0);
						Static627.method8561();
						Static111.method1655();
						Static386.aBoolean427 = false;
						return;
					}
					if (arg0 == 6016) {
						Static577.aClass5_Sub19_25.method2550(Static577.aClass5_Sub19_25.aClass17_Sub29_1, anIntArray219[--anInt4319]);
						Static462.method6506(false, Static577.aClass5_Sub19_25.aClass17_Sub24_2.method8102());
						Static111.method1655();
						return;
					}
					if (arg0 == 6017) {
						Static577.aClass5_Sub19_25.method2550(Static577.aClass5_Sub19_25.aClass17_Sub2_1, anIntArray219[--anInt4319] == 1 ? 1 : 0);
						Static649.method8963();
						Static111.method1655();
						Static386.aBoolean427 = false;
						return;
					}
					if (arg0 == 6018) {
						Static577.aClass5_Sub19_25.method2550(Static577.aClass5_Sub19_25.aClass17_Sub15_2, anIntArray219[--anInt4319]);
						Static111.method1655();
						Static386.aBoolean427 = false;
						return;
					}
					if (arg0 == 6019) {
						local192 = anIntArray219[--anInt4319];
						local834 = Static577.aClass5_Sub19_25.aClass17_Sub15_4.method5251();
						if (local192 != local834) {
							if (Static372.method5547(Static652.anInt10664)) {
								if (local834 == 0 && Static603.anInt9717 != -1) {
									Static420.method6160(Static336.aClass126_156, Static603.anInt9717, local192);
									Static348.method5140();
									Static76.aBoolean115 = false;
								} else if (local192 == 0) {
									Static179.method3122();
									Static76.aBoolean115 = false;
								} else {
									Static49.method901(local192);
								}
							}
							Static577.aClass5_Sub19_25.method2550(Static577.aClass5_Sub19_25.aClass17_Sub15_4, local192);
							Static111.method1655();
							Static386.aBoolean427 = false;
						}
						return;
					}
					if (arg0 == 6020) {
						Static577.aClass5_Sub19_25.method2550(Static577.aClass5_Sub19_25.aClass17_Sub15_3, anIntArray219[--anInt4319]);
						Static111.method1655();
						Static386.aBoolean427 = false;
						return;
					}
					if (arg0 == 6021) {
						local192 = Static577.aClass5_Sub19_25.aClass17_Sub19_1.method6648();
						Static577.aClass5_Sub19_25.method2550(Static577.aClass5_Sub19_25.aClass17_Sub19_2, anIntArray219[--anInt4319] == 1 ? 0 : local192);
						Static635.method8807();
						return;
					}
					if (arg0 == 6023) {
						local192 = anIntArray219[--anInt4319];
						Static577.aClass5_Sub19_25.method2550(Static577.aClass5_Sub19_25.aClass17_Sub12_1, local192);
						Static111.method1655();
						Static386.aBoolean427 = false;
						return;
					}
					if (arg0 == 6024) {
						Static577.aClass5_Sub19_25.method2550(Static577.aClass5_Sub19_25.aClass17_Sub29_2, anIntArray219[--anInt4319]);
						Static111.method1655();
						return;
					}
					if (arg0 == 6025) {
						Static577.aClass5_Sub19_25.method2550(Static577.aClass5_Sub19_25.aClass17_Sub20_1, anIntArray219[--anInt4319]);
						Static111.method1655();
						Static386.aBoolean427 = false;
						return;
					}
					if (arg0 == 6027) {
						local192 = anIntArray219[--anInt4319];
						if (local192 < 0 || local192 > 1) {
							local192 = 0;
						}
						Static293.method6183(local192 == 1);
						return;
					}
					if (arg0 == 6028) {
						Static577.aClass5_Sub19_25.method2550(Static577.aClass5_Sub19_25.aClass17_Sub5_1, anIntArray219[--anInt4319] == 0 ? 0 : 1);
						Static111.method1655();
						return;
					}
					if (arg0 == 6029) {
						Static577.aClass5_Sub19_25.method2550(Static577.aClass5_Sub19_25.aClass17_Sub22_1, anIntArray219[--anInt4319]);
						Static111.method1655();
						return;
					}
					if (arg0 == 6030) {
						Static577.aClass5_Sub19_25.method2550(Static577.aClass5_Sub19_25.aClass17_Sub7_1, anIntArray219[--anInt4319] == 0 ? 0 : 1);
						Static111.method1655();
						Static627.method8561();
						return;
					}
					if (arg0 == 6031) {
						local192 = anIntArray219[--anInt4319];
						if (local192 < 0 || local192 > 5) {
							local192 = 2;
						}
						Static462.method6506(false, local192);
						return;
					}
					if (arg0 == 6032) {
						anInt4319 -= 2;
						local192 = anIntArray219[anInt4319];
						local1578 = anIntArray219[anInt4319 + 1] == 1;
						Static577.aClass5_Sub19_25.method2550(Static577.aClass5_Sub19_25.aClass17_Sub24_1, local192);
						if (!local1578) {
							Static577.aClass5_Sub19_25.method2550(Static577.aClass5_Sub19_25.aClass17_Sub1_1, 0);
						}
						Static111.method1655();
						Static386.aBoolean427 = false;
						return;
					}
					if (arg0 == 6033) {
						Static577.aClass5_Sub19_25.method2550(Static577.aClass5_Sub19_25.aClass17_Sub11_1, anIntArray219[--anInt4319]);
						Static111.method1655();
						return;
					}
					if (arg0 == 6034) {
						Static577.aClass5_Sub19_25.method2550(Static577.aClass5_Sub19_25.aClass17_Sub21_1, anIntArray219[--anInt4319] == 1 ? 1 : 0);
						Static111.method1655();
						Static569.method7681();
						Static386.aBoolean427 = false;
						return;
					}
					if (arg0 == 6035) {
						local192 = Static577.aClass5_Sub19_25.aClass17_Sub27_2.method9058();
						Static577.aClass5_Sub19_25.method2550(Static577.aClass5_Sub19_25.aClass17_Sub27_1, anIntArray219[--anInt4319] == 1 ? 1 : local192);
						Static627.method8561();
						Static635.method8807();
						return;
					}
					if (arg0 == 6036) {
						Static577.aClass5_Sub19_25.method2550(Static577.aClass5_Sub19_25.aClass17_Sub26_1, anIntArray219[--anInt4319]);
						Static111.method1655();
						Static27.aBoolean20 = true;
						return;
					}
					if (arg0 == 6037) {
						Static577.aClass5_Sub19_25.method2550(Static577.aClass5_Sub19_25.aClass17_Sub15_1, anIntArray219[--anInt4319]);
						Static111.method1655();
						Static386.aBoolean427 = false;
						return;
					}
					if (arg0 == 6038) {
						local192 = anIntArray219[--anInt4319];
						local834 = Static577.aClass5_Sub19_25.aClass17_Sub15_5.method5251();
						if (local192 != local834 && Static603.anInt9717 == Static551.anInt8722) {
							if (!Static372.method5547(Static652.anInt10664)) {
								if (local834 == 0) {
									Static420.method6160(Static336.aClass126_156, Static603.anInt9717, local192);
									Static348.method5140();
									Static76.aBoolean115 = false;
								} else if (local192 == 0) {
									Static179.method3122();
									Static76.aBoolean115 = false;
								} else {
									Static49.method901(local192);
								}
							}
							Static577.aClass5_Sub19_25.method2550(Static577.aClass5_Sub19_25.aClass17_Sub15_5, local192);
							Static111.method1655();
							Static386.aBoolean427 = false;
						}
						return;
					}
					if (arg0 == 6039) {
						local192 = anIntArray219[--anInt4319];
						if (local192 > 255 || local192 < 0) {
							local192 = 0;
						}
						if (local192 != Static577.aClass5_Sub19_25.aClass17_Sub13_1.method4987()) {
							Static577.aClass5_Sub19_25.method2550(Static577.aClass5_Sub19_25.aClass17_Sub13_1, local192);
							Static111.method1655();
							Static386.aBoolean427 = false;
						}
						return;
					}
					if (arg0 == 6040) {
						local192 = anIntArray219[--anInt4319];
						if (local192 != Static577.aClass5_Sub19_25.aClass17_Sub18_1.method6359()) {
							Static577.aClass5_Sub19_25.method2550(Static577.aClass5_Sub19_25.aClass17_Sub18_1, local192);
							Static111.method1655();
							Static386.aBoolean427 = false;
							Static644.method8892();
						}
						return;
					}
				} else if (arg0 < 6200) {
					if (arg0 == 6101) {
						anIntArray219[anInt4319++] = Static577.aClass5_Sub19_25.aClass17_Sub4_1.method1072();
						return;
					}
					if (arg0 == 6102) {
						anIntArray219[anInt4319++] = Static577.aClass5_Sub19_25.aClass17_Sub27_2.method9058() == 1 ? 1 : 0;
						return;
					}
					if (arg0 == 6103) {
						anIntArray219[anInt4319++] = Static577.aClass5_Sub19_25.aClass17_Sub19_1.method6648() == 2 ? 1 : 0;
						return;
					}
					if (arg0 == 6105) {
						anIntArray219[anInt4319++] = Static577.aClass5_Sub19_25.aClass17_Sub16_1.method5290() == 1 ? 1 : 0;
						return;
					}
					if (arg0 == 6107) {
						anIntArray219[anInt4319++] = Static577.aClass5_Sub19_25.aClass17_Sub22_1.method7242();
						return;
					}
					if (arg0 == 6108) {
						anIntArray219[anInt4319++] = Static577.aClass5_Sub19_25.aClass17_Sub14_1.method5118() == 1 ? 1 : 0;
						return;
					}
					if (arg0 == 6110) {
						anIntArray219[anInt4319++] = Static577.aClass5_Sub19_25.aClass17_Sub8_1.method3164() == 1 ? 1 : 0;
						return;
					}
					if (arg0 == 6111) {
						anIntArray219[anInt4319++] = Static577.aClass5_Sub19_25.aClass17_Sub3_1.method430();
						return;
					}
					if (arg0 == 6112) {
						anIntArray219[anInt4319++] = Static577.aClass5_Sub19_25.aClass17_Sub23_1.method7699() == 1 ? 1 : 0;
						return;
					}
					if (arg0 == 6114) {
						anIntArray219[anInt4319++] = Static577.aClass5_Sub19_25.aClass17_Sub10_1.method3380() == 2 ? 1 : 0;
						return;
					}
					if (arg0 == 6115) {
						anIntArray219[anInt4319++] = Static577.aClass5_Sub19_25.aClass17_Sub28_1.method9098() == 1 ? 1 : 0;
						return;
					}
					if (arg0 == 6116) {
						anIntArray219[anInt4319++] = Static577.aClass5_Sub19_25.aClass17_Sub29_1.method9175();
						return;
					}
					if (arg0 == 6117) {
						anIntArray219[anInt4319++] = Static577.aClass5_Sub19_25.aClass17_Sub2_1.method357() == 1 ? 1 : 0;
						return;
					}
					if (arg0 == 6118) {
						anIntArray219[anInt4319++] = Static577.aClass5_Sub19_25.aClass17_Sub15_2.method5251();
						return;
					}
					if (arg0 == 6119) {
						anIntArray219[anInt4319++] = Static577.aClass5_Sub19_25.aClass17_Sub15_4.method5251();
						return;
					}
					if (arg0 == 6120) {
						anIntArray219[anInt4319++] = Static577.aClass5_Sub19_25.aClass17_Sub15_3.method5251();
						return;
					}
					if (arg0 == 6123) {
						anIntArray219[anInt4319++] = Static390.method5743();
						return;
					}
					if (arg0 == 6124) {
						anIntArray219[anInt4319++] = Static577.aClass5_Sub19_25.aClass17_Sub29_2.method9175();
						return;
					}
					if (arg0 == 6125) {
						anIntArray219[anInt4319++] = Static577.aClass5_Sub19_25.aClass17_Sub20_1.method6783();
						return;
					}
					if (arg0 == 6127) {
						anIntArray219[anInt4319++] = Static577.aClass5_Sub19_25.aClass17_Sub17_1.method6214() == 1 ? 1 : 0;
						return;
					}
					if (arg0 == 6128) {
						anIntArray219[anInt4319++] = Static577.aClass5_Sub19_25.aClass17_Sub5_1.method1236() == 1 ? 1 : 0;
						return;
					}
					if (arg0 == 6129) {
						anIntArray219[anInt4319++] = Static577.aClass5_Sub19_25.aClass17_Sub22_1.method7242();
						return;
					}
					if (arg0 == 6130) {
						anIntArray219[anInt4319++] = Static577.aClass5_Sub19_25.aClass17_Sub7_1.method1654() == 1 ? 1 : 0;
						return;
					}
					if (arg0 == 6131) {
						anIntArray219[anInt4319++] = Static577.aClass5_Sub19_25.aClass17_Sub24_2.method8102();
						return;
					}
					if (arg0 == 6132) {
						anIntArray219[anInt4319++] = Static577.aClass5_Sub19_25.aClass17_Sub24_1.method8102();
						return;
					}
					if (arg0 == 6133) {
						anIntArray219[anInt4319++] = Static681.aClass349_6.aBoolean601 && !Static681.aClass349_6.aBoolean602 ? 1 : 0;
						return;
					}
					if (arg0 == 6135) {
						anIntArray219[anInt4319++] = Static577.aClass5_Sub19_25.aClass17_Sub11_1.method4285();
						return;
					}
					if (arg0 == 6136) {
						anIntArray219[anInt4319++] = Static577.aClass5_Sub19_25.aClass17_Sub21_1.method6983() == 1 ? 1 : 0;
						return;
					}
					if (arg0 == 6138) {
						anIntArray219[anInt4319++] = Static621.method3253(200, Static577.aClass5_Sub19_25.aClass17_Sub24_2.method8102());
						return;
					}
					if (arg0 == 6139) {
						anIntArray219[anInt4319++] = Static577.aClass5_Sub19_25.aClass17_Sub26_1.method8454();
						return;
					}
					if (arg0 == 6142) {
						anIntArray219[anInt4319++] = Static577.aClass5_Sub19_25.aClass17_Sub15_1.method5251();
						return;
					}
					if (arg0 == 6143) {
						anIntArray219[anInt4319++] = Static577.aClass5_Sub19_25.aClass17_Sub15_5.method5251();
						return;
					}
					if (arg0 == 6144) {
						anIntArray219[anInt4319++] = Static78.aBoolean118 ? 1 : 0;
						return;
					}
					if (arg0 == 6145) {
						anIntArray219[anInt4319++] = Static577.aClass5_Sub19_25.aClass17_Sub13_1.method4987();
						return;
					}
					if (arg0 == 6146) {
						anIntArray219[anInt4319++] = Static577.aClass5_Sub19_25.aClass17_Sub18_1.method6359();
						return;
					}
					if (arg0 == 6147) {
						anIntArray219[anInt4319++] = Static506.aClass5_Sub32_2.anInt5619 < 512 || Static78.aBoolean118 || Static331.aBoolean371 ? 1 : 0;
						return;
					}
					if (arg0 == 6148) {
						anIntArray219[anInt4319++] = Static414.aBoolean465 ? 1 : 0;
						return;
					}
				} else if (arg0 < 6300) {
					if (arg0 == 6200) {
						anInt4319 -= 2;
						Static377.aShort62 = (short) anIntArray219[anInt4319];
						if (Static377.aShort62 <= 0) {
							Static377.aShort62 = 256;
						}
						Static456.aShort81 = (short) anIntArray219[anInt4319 + 1];
						if (Static456.aShort81 <= 0) {
							Static456.aShort81 = 205;
						}
						return;
					}
					if (arg0 == 6201) {
						anInt4319 -= 2;
						Static415.aShort80 = (short) anIntArray219[anInt4319];
						if (Static415.aShort80 <= 0) {
							Static415.aShort80 = 256;
						}
						Static523.aShort98 = (short) anIntArray219[anInt4319 + 1];
						if (Static523.aShort98 <= 0) {
							Static523.aShort98 = 320;
						}
						return;
					}
					if (arg0 == 6202) {
						anInt4319 -= 4;
						Static171.aShort59 = (short) anIntArray219[anInt4319];
						if (Static171.aShort59 <= 0) {
							Static171.aShort59 = 1;
						}
						Static548.aShort101 = (short) anIntArray219[anInt4319 + 1];
						if (Static548.aShort101 <= 0) {
							Static548.aShort101 = 32767;
						} else if (Static548.aShort101 < Static171.aShort59) {
							Static548.aShort101 = Static171.aShort59;
						}
						Static155.aShort36 = (short) anIntArray219[anInt4319 + 2];
						if (Static155.aShort36 <= 0) {
							Static155.aShort36 = 1;
						}
						Static631.aShort119 = (short) anIntArray219[anInt4319 + 3];
						if (Static631.aShort119 <= 0) {
							Static631.aShort119 = 32767;
							return;
						}
						if (Static631.aShort119 < Static155.aShort36) {
							Static631.aShort119 = Static155.aShort36;
						}
						return;
					}
					if (arg0 == 6203) {
						Static294.method4650(Static326.aClass238_7.anInt5985, false, 0, Static326.aClass238_7.anInt5973, 0);
						anIntArray219[anInt4319++] = Static98.anInt1631;
						anIntArray219[anInt4319++] = Static455.anInt7373;
						return;
					}
					if (arg0 == 6204) {
						anIntArray219[anInt4319++] = Static415.aShort80;
						anIntArray219[anInt4319++] = Static523.aShort98;
						return;
					}
					if (arg0 == 6205) {
						anIntArray219[anInt4319++] = Static377.aShort62;
						anIntArray219[anInt4319++] = Static456.aShort81;
						return;
					}
				} else if (arg0 < 6400) {
					if (arg0 == 6300) {
						anIntArray219[anInt4319++] = (int) (Static480.method6763() / 60000L);
						return;
					}
					if (arg0 == 6301) {
						anIntArray219[anInt4319++] = (int) (Static480.method6763() / 86400000L) - 11745;
						return;
					}
					if (arg0 == 6302) {
						anInt4319 -= 3;
						local192 = anIntArray219[anInt4319];
						local834 = anIntArray219[anInt4319 + 1];
						local109 = anIntArray219[anInt4319 + 2];
						@Pc(7301) long local7301 = Static599.method8220(local192, local109, local834);
						local3561 = Static2.method26(local7301);
						if (local109 < 1970) {
							local3561--;
						}
						anIntArray219[anInt4319++] = local3561;
						return;
					}
					if (arg0 == 6303) {
						anIntArray219[anInt4319++] = Static184.method3167(Static480.method6763());
						return;
					}
					if (arg0 == 6304) {
						local192 = anIntArray219[--anInt4319];
						local1578 = true;
						if (local192 < 0) {
							local1578 = (local192 + 1) % 4 == 0;
						} else if (local192 < 1582) {
							local1578 = local192 % 4 == 0;
						} else if (local192 % 4 != 0) {
							local1578 = false;
						} else if (local192 % 100 != 0) {
							local1578 = true;
						} else if (local192 % 400 != 0) {
							local1578 = false;
						}
						anIntArray219[anInt4319++] = local1578 ? 1 : 0;
						return;
					}
					if (arg0 == 6305) {
						local192 = anIntArray219[--anInt4319];
						@Pc(7429) int[] local7429 = Static110.method8138(local192);
						Static693.method8323(local7429, 0, anIntArray219, anInt4319, 3);
						anInt4319 += 3;
						return;
					}
					if (arg0 == 6306) {
						local192 = anIntArray219[--anInt4319];
						anIntArray219[anInt4319++] = (int) (Static262.method4271(local192) / 60000L);
						return;
					}
				} else if (arg0 < 6500) {
					if (arg0 == 6405) {
						anIntArray219[anInt4319++] = Static488.method6854() ? 1 : 0;
						return;
					}
					if (arg0 == 6406) {
						anIntArray219[anInt4319++] = Static169.method3031() ? 1 : 0;
						return;
					}
				} else if (arg0 < 6600) {
					if (arg0 == 6500) {
						if (Static652.anInt10664 == 7 && !Static546.method7472() && Static78.anInt1382 == 0) {
							if (Static426.aBoolean475) {
								anIntArray219[anInt4319++] = 0;
								return;
							}
							if (Static18.aLong10 > Static480.method6763() - 1000L) {
								anIntArray219[anInt4319++] = 1;
								return;
							}
							Static426.aBoolean475 = true;
							@Pc(7579) Class5_Sub41 local7579 = Static647.method8905(Static595.aClass381_245, Static4.aClass389_16.aClass393_2);
							local7579.aClass5_Sub36_Sub2_1.method7287(Static24.anInt331);
							Static4.aClass389_16.method9079(local7579);
							anIntArray219[anInt4319++] = 0;
							return;
						}
						anIntArray219[anInt4319++] = 1;
						return;
					}
					@Pc(7636) Class52 local7636;
					@Pc(7603) Class51_Sub1 local7603;
					if (arg0 == 6501) {
						local7603 = Static293.method6184();
						if (local7603 != null) {
							anIntArray219[anInt4319++] = local7603.anInt3950;
							anIntArray219[anInt4319++] = local7603.anInt3944;
							aStringArray22[anInt4321++] = local7603.aString36;
							local7636 = local7603.method3616();
							anIntArray219[anInt4319++] = local7636.anInt1022;
							aStringArray22[anInt4321++] = local7636.aString10;
							anIntArray219[anInt4319++] = local7603.anInt3943;
							anIntArray219[anInt4319++] = local7603.anInt3951;
							aStringArray22[anInt4321++] = local7603.aString37;
							return;
						}
						anIntArray219[anInt4319++] = -1;
						anIntArray219[anInt4319++] = 0;
						aStringArray22[anInt4321++] = "";
						anIntArray219[anInt4319++] = 0;
						aStringArray22[anInt4321++] = "";
						anIntArray219[anInt4319++] = 0;
						anIntArray219[anInt4319++] = 0;
						aStringArray22[anInt4321++] = "";
						return;
					}
					if (arg0 == 6502) {
						local7603 = Static505.method7008();
						if (local7603 != null) {
							anIntArray219[anInt4319++] = local7603.anInt3950;
							anIntArray219[anInt4319++] = local7603.anInt3944;
							aStringArray22[anInt4321++] = local7603.aString36;
							local7636 = local7603.method3616();
							anIntArray219[anInt4319++] = local7636.anInt1022;
							aStringArray22[anInt4321++] = local7636.aString10;
							anIntArray219[anInt4319++] = local7603.anInt3943;
							anIntArray219[anInt4319++] = local7603.anInt3951;
							aStringArray22[anInt4321++] = local7603.aString37;
							return;
						}
						anIntArray219[anInt4319++] = -1;
						anIntArray219[anInt4319++] = 0;
						aStringArray22[anInt4321++] = "";
						anIntArray219[anInt4319++] = 0;
						aStringArray22[anInt4321++] = "";
						anIntArray219[anInt4319++] = 0;
						anIntArray219[anInt4319++] = 0;
						aStringArray22[anInt4321++] = "";
						return;
					}
					if (arg0 == 6503) {
						local192 = anIntArray219[--anInt4319];
						local101 = aStringArray22[--anInt4321];
						if (Static652.anInt10664 == 7 && !Static546.method7472() && Static78.anInt1382 == 0) {
							anIntArray219[anInt4319++] = Static660.method9072(local101, local192) ? 1 : 0;
							return;
						}
						anIntArray219[anInt4319++] = 0;
						return;
					}
					if (arg0 == 6506) {
						local192 = anIntArray219[--anInt4319];
						@Pc(7970) Class51_Sub1 local7970 = Static8.method137(local192);
						if (local7970 != null) {
							anIntArray219[anInt4319++] = local7970.anInt3944;
							aStringArray22[anInt4321++] = local7970.aString36;
							@Pc(7994) Class52 local7994 = local7970.method3616();
							anIntArray219[anInt4319++] = local7994.anInt1022;
							aStringArray22[anInt4321++] = local7994.aString10;
							anIntArray219[anInt4319++] = local7970.anInt3943;
							anIntArray219[anInt4319++] = local7970.anInt3951;
							aStringArray22[anInt4321++] = local7970.aString37;
							return;
						}
						anIntArray219[anInt4319++] = -1;
						aStringArray22[anInt4321++] = "";
						anIntArray219[anInt4319++] = 0;
						aStringArray22[anInt4321++] = "";
						anIntArray219[anInt4319++] = 0;
						anIntArray219[anInt4319++] = 0;
						aStringArray22[anInt4321++] = "";
						return;
					}
					if (arg0 == 6507) {
						anInt4319 -= 4;
						local192 = anIntArray219[anInt4319];
						local1578 = anIntArray219[anInt4319 + 1] == 1;
						local109 = anIntArray219[anInt4319 + 2];
						local2331 = anIntArray219[anInt4319 + 3] == 1;
						Static511.method8345(local1578, local109, local2331, local192);
						return;
					}
					if (arg0 == 6508) {
						Static510.method7022();
						return;
					}
					if (arg0 == 6509) {
						if (Static652.anInt10664 != 7) {
							return;
						}
						Static571.aBoolean596 = anIntArray219[--anInt4319] == 1;
						return;
					}
					if (arg0 == 6510) {
						anIntArray219[anInt4319++] = Static342.anInt5705;
						return;
					}
				} else if (arg0 >= 6700) {
					if (arg0 < 6800 && Static249.aClass240_3 == Static8.aClass240_1) {
						if (arg0 == 6700) {
							local192 = Static438.aClass306_31.method6939();
							if (Static381.anInt6411 != -1) {
								local192++;
							}
							anIntArray219[anInt4319++] = local192;
							return;
						}
						if (arg0 == 6701) {
							local192 = anIntArray219[--anInt4319];
							if (Static381.anInt6411 != -1) {
								if (local192 == 0) {
									anIntArray219[anInt4319++] = Static381.anInt6411;
									return;
								}
								local192--;
							}
							@Pc(8261) Class5_Sub38 local8261 = (Class5_Sub38) Static438.aClass306_31.method6941();
							while (local192-- > 0) {
								local8261 = (Class5_Sub38) Static438.aClass306_31.method6940();
							}
							anIntArray219[anInt4319++] = local8261.anInt6418;
							return;
						}
						if (arg0 == 6702) {
							local192 = anIntArray219[--anInt4319];
							if (Static397.aClass238ArrayArray2[local192] == null) {
								aStringArray22[anInt4321++] = "";
								return;
							}
							local101 = Static397.aClass238ArrayArray2[local192][0].aString70;
							if (local101 == null) {
								aStringArray22[anInt4321++] = "";
								return;
							}
							aStringArray22[anInt4321++] = local101.substring(0, local101.indexOf(58));
							return;
						}
						if (arg0 == 6703) {
							local192 = anIntArray219[--anInt4319];
							if (Static397.aClass238ArrayArray2[local192] == null) {
								anIntArray219[anInt4319++] = 0;
								return;
							}
							anIntArray219[anInt4319++] = Static397.aClass238ArrayArray2[local192].length;
							return;
						}
						if (arg0 == 6704) {
							anInt4319 -= 2;
							local192 = anIntArray219[anInt4319];
							local834 = anIntArray219[anInt4319 + 1];
							if (Static397.aClass238ArrayArray2[local192] == null) {
								aStringArray22[anInt4321++] = "";
								return;
							}
							local198 = Static397.aClass238ArrayArray2[local192][local834].aString70;
							if (local198 == null) {
								aStringArray22[anInt4321++] = "";
								return;
							}
							aStringArray22[anInt4321++] = local198;
							return;
						}
						if (arg0 == 6705) {
							anInt4319 -= 2;
							local192 = anIntArray219[anInt4319];
							local834 = anIntArray219[anInt4319 + 1];
							if (Static397.aClass238ArrayArray2[local192] == null) {
								anIntArray219[anInt4319++] = 0;
								return;
							}
							anIntArray219[anInt4319++] = Static397.aClass238ArrayArray2[local192][local834].anInt6010;
							return;
						}
						if (arg0 == 6706) {
							return;
						}
						if (arg0 == 6707) {
							anInt4319 -= 3;
							local192 = anIntArray219[anInt4319];
							local834 = anIntArray219[anInt4319 + 1];
							local109 = anIntArray219[anInt4319 + 2];
							Static504.method6987(1, "", local192 << 16 | local834, local109);
							return;
						}
						if (arg0 == 6708) {
							anInt4319 -= 3;
							local192 = anIntArray219[anInt4319];
							local834 = anIntArray219[anInt4319 + 1];
							local109 = anIntArray219[anInt4319 + 2];
							Static504.method6987(2, "", local192 << 16 | local834, local109);
							return;
						}
						if (arg0 == 6709) {
							anInt4319 -= 3;
							local192 = anIntArray219[anInt4319];
							local834 = anIntArray219[anInt4319 + 1];
							local109 = anIntArray219[anInt4319 + 2];
							Static504.method6987(3, "", local192 << 16 | local834, local109);
							return;
						}
						if (arg0 == 6710) {
							anInt4319 -= 3;
							local192 = anIntArray219[anInt4319];
							local834 = anIntArray219[anInt4319 + 1];
							local109 = anIntArray219[anInt4319 + 2];
							Static504.method6987(4, "", local192 << 16 | local834, local109);
							return;
						}
						if (arg0 == 6711) {
							anInt4319 -= 3;
							local192 = anIntArray219[anInt4319];
							local834 = anIntArray219[anInt4319 + 1];
							local109 = anIntArray219[anInt4319 + 2];
							Static504.method6987(5, "", local192 << 16 | local834, local109);
							return;
						}
						if (arg0 == 6712) {
							anInt4319 -= 3;
							local192 = anIntArray219[anInt4319];
							local834 = anIntArray219[anInt4319 + 1];
							local109 = anIntArray219[anInt4319 + 2];
							Static504.method6987(6, "", local192 << 16 | local834, local109);
							return;
						}
						if (arg0 == 6713) {
							anInt4319 -= 3;
							local192 = anIntArray219[anInt4319];
							local834 = anIntArray219[anInt4319 + 1];
							local109 = anIntArray219[anInt4319 + 2];
							Static504.method6987(7, "", local192 << 16 | local834, local109);
							return;
						}
						if (arg0 == 6714) {
							anInt4319 -= 3;
							local192 = anIntArray219[anInt4319];
							local834 = anIntArray219[anInt4319 + 1];
							local109 = anIntArray219[anInt4319 + 2];
							Static504.method6987(8, "", local192 << 16 | local834, local109);
							return;
						}
						if (arg0 == 6715) {
							anInt4319 -= 3;
							local192 = anIntArray219[anInt4319];
							local834 = anIntArray219[anInt4319 + 1];
							local109 = anIntArray219[anInt4319 + 2];
							Static504.method6987(9, "", local192 << 16 | local834, local109);
							return;
						}
						if (arg0 == 6716) {
							anInt4319 -= 3;
							local192 = anIntArray219[anInt4319];
							local834 = anIntArray219[anInt4319 + 1];
							local109 = anIntArray219[anInt4319 + 2];
							Static504.method6987(10, "", local192 << 16 | local834, local109);
							return;
						}
						if (arg0 == 6717) {
							anInt4319 -= 3;
							local192 = anIntArray219[anInt4319];
							local834 = anIntArray219[anInt4319 + 1];
							local109 = anIntArray219[anInt4319 + 2];
							@Pc(8857) Class238 local8857 = Static333.method5035(local109, local192 << 16 | local834);
							Static55.method973();
							@Pc(8862) Class5_Sub18 local8862 = Static73.method1209(local8857);
							Static137.method2548(local8857, local8862.anInt2204, local8862.method1972());
							return;
						}
					} else if (arg0 < 6900) {
						@Pc(8892) Class313 local8892;
						if (arg0 == 6800) {
							local192 = anIntArray219[--anInt4319];
							local8892 = Static583.aClass327_4.method7413(local192);
							if (local8892.aString93 == null) {
								aStringArray22[anInt4321++] = "";
								return;
							}
							aStringArray22[anInt4321++] = local8892.aString93;
							return;
						}
						if (arg0 == 6801) {
							local192 = anIntArray219[--anInt4319];
							local8892 = Static583.aClass327_4.method7413(local192);
							anIntArray219[anInt4319++] = local8892.anInt8179;
							return;
						}
						if (arg0 == 6802) {
							local192 = anIntArray219[--anInt4319];
							local8892 = Static583.aClass327_4.method7413(local192);
							anIntArray219[anInt4319++] = local8892.anInt8192;
							return;
						}
						if (arg0 == 6803) {
							local192 = anIntArray219[--anInt4319];
							local8892 = Static583.aClass327_4.method7413(local192);
							anIntArray219[anInt4319++] = local8892.anInt8176;
							return;
						}
						if (arg0 == 6804) {
							anInt4319 -= 2;
							local192 = anIntArray219[anInt4319];
							local834 = anIntArray219[anInt4319 + 1];
							@Pc(9015) Class22 local9015 = Static612.aClass380_2.method8839(local834);
							if (local9015.method385()) {
								aStringArray22[anInt4321++] = Static583.aClass327_4.method7413(local192).method7061(local834, local9015.aString4);
								return;
							}
							anIntArray219[anInt4319++] = Static583.aClass327_4.method7413(local192).method7065(local834, local9015.anInt336);
							return;
						}
					} else if (arg0 < 7000) {
						if (arg0 == 6900) {
							anIntArray219[anInt4319++] = Static163.aBoolean238 && !Static490.aBoolean537 ? 1 : 0;
							return;
						}
						if (arg0 == 6901) {
							anIntArray219[anInt4319++] = (int) (Static540.aLong248 / 60000L);
							anIntArray219[anInt4319++] = (int) ((Static540.aLong248 - Static480.method6763() - Static191.aLong293) / 60000L);
							anIntArray219[anInt4319++] = Static98.aBoolean132 ? 1 : 0;
							return;
						}
						if (arg0 == 6902) {
							anIntArray219[anInt4319++] = Static588.anInt9520;
							return;
						}
						if (arg0 == 6903) {
							anIntArray219[anInt4319++] = Static437.anInt7221;
							return;
						}
						if (arg0 == 6904) {
							anIntArray219[anInt4319++] = Static638.anInt10397;
							return;
						}
						if (arg0 == 6905) {
							local95 = "";
							if (Static77.aClass361_1 != null) {
								if (Static77.aClass361_1.anObject20 == null) {
									local95 = Static572.method7701(Static77.aClass361_1.anInt9719);
								} else {
									local95 = (String) Static77.aClass361_1.anObject20;
								}
							}
							aStringArray22[anInt4321++] = local95;
							return;
						}
						if (arg0 == 6906) {
							anIntArray219[anInt4319++] = Static485.anInt10639;
							return;
						}
						if (arg0 == 6907) {
							anIntArray219[anInt4319++] = Static444.anInt7304;
							return;
						}
						if (arg0 == 6908) {
							anIntArray219[anInt4319++] = Static593.anInt9563;
							return;
						}
						if (arg0 == 6909) {
							anIntArray219[anInt4319++] = Static223.aBoolean268 ? 1 : 0;
							return;
						}
						if (arg0 == 6910) {
							anIntArray219[anInt4319++] = Static54.anInt949;
							return;
						}
						if (arg0 == 6911) {
							anIntArray219[anInt4319++] = Static507.anInt10610;
							return;
						}
						if (arg0 == 6912) {
							anIntArray219[anInt4319++] = Static337.anInt5651;
							return;
						}
						if (arg0 == 6913) {
							anIntArray219[anInt4319++] = Static66.anInt1114;
							return;
						}
						if (arg0 == 6914) {
							anIntArray219[anInt4319++] = Static186.aBoolean248 ? 1 : 0;
							return;
						}
						if (arg0 == 6915) {
							anIntArray219[anInt4319++] = Static242.anInt5008;
							return;
						}
					} else if (arg0 < 7100) {
						if (arg0 == 7000) {
							local192 = Static347.method5135();
							anIntArray219[anInt4319++] = Static589.anInt9528 = Static577.aClass5_Sub19_25.aClass17_Sub24_2.method8102();
							anIntArray219[anInt4319++] = local192;
							Static627.method8561();
							Static111.method1655();
							Static386.aBoolean427 = false;
							return;
						}
						if (arg0 == 7001) {
							Static188.method9006();
							Static627.method8561();
							Static111.method1655();
							Static386.aBoolean427 = false;
							return;
						}
						if (arg0 == 7002) {
							Static84.method1341();
							Static627.method8561();
							Static111.method1655();
							Static386.aBoolean427 = false;
							return;
						}
						if (arg0 == 7003) {
							Static277.method4480();
							Static627.method8561();
							Static111.method1655();
							Static386.aBoolean427 = false;
							return;
						}
						if (arg0 == 7004) {
							Static388.method5742();
							Static627.method8561();
							Static111.method1655();
							Static386.aBoolean427 = false;
							return;
						}
						if (arg0 == 7005) {
							Static577.aClass5_Sub19_25.method2550(Static577.aClass5_Sub19_25.aClass17_Sub1_1, 0);
							Static111.method1655();
							Static386.aBoolean427 = false;
							return;
						}
						if (arg0 == 7006) {
							if (Static589.anInt9528 == 2) {
								Static484.aBoolean528 = true;
								return;
							}
							if (Static589.anInt9528 == 1) {
								Static316.aBoolean351 = true;
								return;
							}
							if (Static589.anInt9528 == 3) {
								Static680.aBoolean767 = true;
							}
							return;
						}
						if (arg0 == 7007) {
							anIntArray219[anInt4319++] = Static577.aClass5_Sub19_25.aClass17_Sub1_1.method288();
							return;
						}
					} else if (arg0 < 7200) {
						if (arg0 == 7100) {
							anInt4319 -= 2;
							local192 = anIntArray219[anInt4319];
							local834 = anIntArray219[anInt4319 + 1];
							if (local192 != -1) {
								if (local834 > 255) {
									local834 = 255;
								} else if (local834 < 0) {
									local834 = 0;
								}
								Static20.method348(local834, false, local192);
							}
							return;
						}
						if (arg0 == 7101) {
							local192 = anIntArray219[--anInt4319];
							if (local192 != -1) {
								Static419.method6142(local192);
							}
							return;
						}
						if (arg0 == 7102) {
							local192 = anIntArray219[--anInt4319];
							if (local192 != -1) {
								Static440.method6338(local192);
							}
							return;
						}
						if (arg0 == 7103) {
							anIntArray219[anInt4319++] = Static36.method620("jagtheora") ? 1 : 0;
							return;
						}
					} else if (arg0 < 7300) {
						if (arg0 == 7201) {
							anIntArray219[anInt4319++] = Static577.aClass5_Sub19_25.aClass17_Sub16_1.method5292() ? 1 : 0;
							return;
						}
						if (arg0 == 7202) {
							anIntArray219[anInt4319++] = Static577.aClass5_Sub19_25.aClass17_Sub8_1.method3161() ? 1 : 0;
							return;
						}
						if (arg0 == 7203) {
							anIntArray219[anInt4319++] = Static577.aClass5_Sub19_25.aClass17_Sub3_1.method431() ? 1 : 0;
							return;
						}
						if (arg0 == 7204) {
							anIntArray219[anInt4319++] = Static577.aClass5_Sub19_25.aClass17_Sub10_1.method3384() ? 1 : 0;
							return;
						}
						if (arg0 == 7205) {
							anIntArray219[anInt4319++] = Static577.aClass5_Sub19_25.aClass17_Sub29_2.method9176() && Static273.aClass100_6.method8641() ? 1 : 0;
							return;
						}
						if (arg0 == 7206) {
							anIntArray219[anInt4319++] = Static577.aClass5_Sub19_25.aClass17_Sub12_1.method4832() ? 1 : 0;
							return;
						}
						if (arg0 == 7207) {
							anIntArray219[anInt4319++] = Static577.aClass5_Sub19_25.aClass17_Sub20_1.method6784() ? 1 : 0;
							return;
						}
						if (arg0 == 7208) {
							anIntArray219[anInt4319++] = Static577.aClass5_Sub19_25.aClass17_Sub17_1.method6215() && Static273.aClass100_6.method8661() ? 1 : 0;
							return;
						}
						if (arg0 == 7209) {
							anIntArray219[anInt4319++] = Static577.aClass5_Sub19_25.aClass17_Sub7_1.method1651() ? 1 : 0;
							return;
						}
						if (arg0 == 7210) {
							anIntArray219[anInt4319++] = Static577.aClass5_Sub19_25.aClass17_Sub21_1.method6984() ? 1 : 0;
							return;
						}
						if (arg0 == 7211) {
							anIntArray219[anInt4319++] = Static577.aClass5_Sub19_25.aClass17_Sub26_1.method8453() ? 1 : 0;
							return;
						}
						if (arg0 == 7212) {
							anIntArray219[anInt4319++] = Static577.aClass5_Sub19_25.aClass17_Sub28_1.method9096() ? 1 : 0;
							return;
						}
						if (arg0 == 7213) {
							anIntArray219[anInt4319++] = Static577.aClass5_Sub19_25.aClass17_Sub18_1.method6362() ? 1 : 0;
							return;
						}
						if (arg0 == 7214) {
							anIntArray219[anInt4319++] = Static577.aClass5_Sub19_25.aClass17_Sub24_1.method8107() ? 1 : 0;
							return;
						}
					} else if (arg0 < 7400) {
						if (arg0 == 7301) {
							local192 = anIntArray219[--anInt4319];
							anIntArray219[anInt4319++] = Static577.aClass5_Sub19_25.aClass17_Sub16_1.method9169(local192);
							return;
						}
						if (arg0 == 7302) {
							local192 = anIntArray219[--anInt4319];
							anIntArray219[anInt4319++] = Static577.aClass5_Sub19_25.aClass17_Sub8_1.method9169(local192);
							return;
						}
						if (arg0 == 7303) {
							local192 = anIntArray219[--anInt4319];
							anIntArray219[anInt4319++] = Static577.aClass5_Sub19_25.aClass17_Sub3_1.method9169(local192);
							return;
						}
						if (arg0 == 7304) {
							local192 = anIntArray219[--anInt4319];
							anIntArray219[anInt4319++] = Static577.aClass5_Sub19_25.aClass17_Sub10_1.method9169(local192);
							return;
						}
						if (arg0 == 7305) {
							local192 = anIntArray219[--anInt4319];
							if (!Static273.aClass100_6.method8641()) {
								anIntArray219[anInt4319++] = 3;
								return;
							}
							anIntArray219[anInt4319++] = Static577.aClass5_Sub19_25.aClass17_Sub29_2.method9169(local192);
							return;
						}
						if (arg0 == 7306) {
							local192 = anIntArray219[--anInt4319];
							anIntArray219[anInt4319++] = Static577.aClass5_Sub19_25.aClass17_Sub12_1.method9169(local192);
							return;
						}
						if (arg0 == 7307) {
							local192 = anIntArray219[--anInt4319];
							anIntArray219[anInt4319++] = Static577.aClass5_Sub19_25.aClass17_Sub20_1.method9169(local192);
							return;
						}
						if (arg0 == 7308) {
							local192 = anIntArray219[--anInt4319];
							if (!Static273.aClass100_6.method8661()) {
								anIntArray219[anInt4319++] = 3;
								return;
							}
							anIntArray219[anInt4319++] = Static577.aClass5_Sub19_25.aClass17_Sub17_1.method9169(local192);
							return;
						}
						if (arg0 == 7309) {
							local192 = anIntArray219[--anInt4319];
							anIntArray219[anInt4319++] = Static577.aClass5_Sub19_25.aClass17_Sub7_1.method9169(local192);
							return;
						}
						if (arg0 == 7310) {
							local192 = anIntArray219[--anInt4319];
							anIntArray219[anInt4319++] = Static577.aClass5_Sub19_25.aClass17_Sub21_1.method9169(local192);
							return;
						}
						if (arg0 == 7311) {
							local192 = anIntArray219[--anInt4319];
							anIntArray219[anInt4319++] = Static577.aClass5_Sub19_25.aClass17_Sub26_1.method9169(local192);
							return;
						}
						if (arg0 == 7312) {
							local192 = anIntArray219[--anInt4319];
							anIntArray219[anInt4319++] = Static577.aClass5_Sub19_25.aClass17_Sub28_1.method9169(local192);
							return;
						}
						if (arg0 == 7313) {
							local192 = anIntArray219[--anInt4319];
							anIntArray219[anInt4319++] = Static577.aClass5_Sub19_25.aClass17_Sub18_1.method9169(local192);
							return;
						}
						if (arg0 == 7314) {
							local192 = anIntArray219[--anInt4319];
							anIntArray219[anInt4319++] = Static577.aClass5_Sub19_25.aClass17_Sub24_1.method9169(local192);
							return;
						}
					}
				}
			}
		}
		throw new IllegalStateException(String.valueOf(arg0));
	}

	@OriginalMember(owner = "client!im", name = "a", descriptor = "(Lclient!ic;I)V")
	private static void method3969(@OriginalArg(0) Class5_Sub24 arg0, @OriginalArg(1) int arg1) {
		@Pc(2) Object[] local2 = arg0.anObjectArray2;
		@Pc(8) int local8 = (Integer) local2[0];
		@Pc(12) Class5_Sub1_Sub10 local12 = Static499.method6952(local8);
		if (local12 == null) {
			return;
		}
		anIntArray220 = new int[local12.anInt5145];
		@Pc(22) int local22 = 0;
		aStringArray23 = new String[local12.anInt5147];
		@Pc(28) int local28 = 0;
		aLongArray14 = new long[local12.anInt5146];
		@Pc(34) int local34 = 0;
		for (@Pc(36) int local36 = 1; local36 < local2.length; local36++) {
			if (local2[local36] instanceof Integer) {
				@Pc(48) int local48 = (Integer) local2[local36];
				if (local48 == -2147483647) {
					local48 = arg0.anInt4054;
				}
				if (local48 == -2147483646) {
					local48 = arg0.anInt4053;
				}
				if (local48 == -2147483645) {
					local48 = arg0.aClass238_6 == null ? -1 : arg0.aClass238_6.anInt5971;
				}
				if (local48 == -2147483644) {
					local48 = arg0.anInt4055;
				}
				if (local48 == -2147483643) {
					local48 = arg0.aClass238_6 == null ? -1 : arg0.aClass238_6.anInt5986;
				}
				if (local48 == -2147483642) {
					local48 = arg0.aClass238_5 == null ? -1 : arg0.aClass238_5.anInt5971;
				}
				if (local48 == -2147483641) {
					local48 = arg0.aClass238_5 == null ? -1 : arg0.aClass238_5.anInt5986;
				}
				if (local48 == -2147483640) {
					local48 = arg0.anInt4050;
				}
				if (local48 == -2147483639) {
					local48 = arg0.anInt4051;
				}
				anIntArray220[local22++] = local48;
			} else if (local2[local36] instanceof String) {
				@Pc(154) String local154 = (String) local2[local36];
				if (local154.equals("event_opbase")) {
					local154 = arg0.aString38;
				}
				aStringArray23[local28++] = local154;
			} else if (local2[local36] instanceof Long) {
				@Pc(180) long local180 = (Long) local2[local36];
				aLongArray14[local34++] = local180;
			}
		}
		anInt4325 = arg0.anInt4052;
		method3960(local12, arg1);
	}

	@OriginalMember(owner = "client!im", name = "a", descriptor = "(I)Ljava/lang/String;")
	private static String method3970(@OriginalArg(0) int arg0) {
		@Pc(9) String local9 = aClass325_2.method7397(Static536.aClass290_6.anInt7535 << 16 | arg0);
		return local9 == null ? "" : local9;
	}

	@OriginalMember(owner = "client!im", name = "c", descriptor = "(I)I")
	private static int method3971(@OriginalArg(0) int arg0) {
		@Pc(4) Class103 local4 = Static197.aClass9_1.method150(arg0);
		if (local4 == null) {
			throw new RuntimeException("sr-c112");
		}
		@Pc(24) Integer local24 = aClass325_2.method7398(Static536.aClass290_6.anInt7535 << 16 | arg0);
		if (local24 == null) {
			return local4.aChar2 == 'i' || local4.aChar2 == '1' ? 0 : -1;
		} else {
			return local24;
		}
	}
}
