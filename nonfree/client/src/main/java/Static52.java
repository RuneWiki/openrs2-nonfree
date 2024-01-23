import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static52 {

	@OriginalMember(owner = "client!di", name = "y", descriptor = "Lclient!cg;")
	public static Class22 aClass22_25;

	@OriginalMember(owner = "client!di", name = "E", descriptor = "[I")
	public static int[] anIntArray122;

	@OriginalMember(owner = "client!di", name = "G", descriptor = "I")
	public static int anInt1183;

	@OriginalMember(owner = "client!di", name = "H", descriptor = "Lclient!lg;")
	public static Class97 aClass97_8;

	@OriginalMember(owner = "client!di", name = "L", descriptor = "F")
	public static float aFloat31;

	@OriginalMember(owner = "client!di", name = "A", descriptor = "[I")
	public static int[] anIntArray121 = new int[32];

	@OriginalMember(owner = "client!di", name = "N", descriptor = "Ljava/lang/String;")
	public static String aString41 = "Loaded defaults";

	@OriginalMember(owner = "client!di", name = "P", descriptor = "[Ljava/lang/String;")
	public static String[] aStringArray6 = new String[500];

	@OriginalMember(owner = "client!di", name = "c", descriptor = "(II)Lclient!re;")
	public static Class146 method1017(@OriginalArg(1) int arg0) {
		@Pc(6) Class146 local6 = (Class146) Static43.aClass172_5.method4347((long) arg0);
		if (local6 != null) {
			return local6;
		}
		@Pc(22) byte[] local22 = Static214.aClass22_98.method665(1, arg0);
		local6 = new Class146();
		local6.anInt4704 = arg0;
		if (local22 != null) {
			local6.method3674(new Class4_Sub24(local22));
		}
		local6.method3673();
		if (local6.anInt4703 == 2 && Static111.aClass163_20.method4188((long) arg0) == null) {
			Static111.aClass163_20.method4181((long) arg0, new Class4_Sub25(Static16.anInt350));
			Static146.aClass146Array1[Static16.anInt350++] = local6;
		}
		Static43.aClass172_5.method4345(local6, (long) arg0);
		return local6;
	}

	@OriginalMember(owner = "client!di", name = "a", descriptor = "(Lclient!ql;Lclient!ql;ZII)I")
	public static int method1018(@OriginalArg(0) Class64_Sub1 arg0, @OriginalArg(1) Class64_Sub1 arg1, @OriginalArg(2) boolean arg2, @OriginalArg(4) int arg3) {
		if (arg3 == 1) {
			@Pc(12) int local12 = arg1.anInt4587;
			@Pc(15) int local15 = arg0.anInt4587;
			if (!arg2) {
				if (local15 == -1) {
					local15 = 2001;
				}
				if (local12 == -1) {
					local12 = 2001;
				}
			}
			return local12 - local15;
		} else if (arg3 == 2) {
			return Static153.method2511(Static187.anInt3840, arg1.method3597().aString159, arg0.method3597().aString159);
		} else if (arg3 == 3) {
			if (arg1.aString153.equals("-")) {
				if (arg0.aString153.equals("-")) {
					return 0;
				} else if (arg2) {
					return -1;
				} else {
					return 1;
				}
			} else if (arg0.aString153.equals("-")) {
				return arg2 ? 1 : -1;
			} else {
				return Static153.method2511(Static187.anInt3840, arg1.aString153, arg0.aString153);
			}
		} else if (arg3 == 4) {
			return arg1.method3594() ? (arg0.method3594() ? 0 : 1) : (arg0.method3594() ? -1 : 0);
		} else if (arg3 == 5) {
			return arg1.method3593() ? (arg0.method3593() ? 0 : 1) : arg0.method3593() ? -1 : 0;
		} else if (arg3 == 6) {
			return arg1.method3596() ? (arg0.method3596() ? 0 : 1) : (arg0.method3596() ? -1 : 0);
		} else if (arg3 == 7) {
			return arg1.method3589() ? (arg0.method3589() ? 0 : 1) : (arg0.method3589() ? -1 : 0);
		} else {
			return arg1.anInt4596 - arg0.anInt4596;
		}
	}

	@OriginalMember(owner = "client!di", name = "a", descriptor = "(ILclient!ie;IIIIIBI)V")
	public static void method1023(@OriginalArg(0) int arg0, @OriginalArg(1) Class73 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(8) int arg7) {
		@Pc(5) int local5 = arg2 & 0x3;
		@Pc(22) int local22;
		@Pc(25) int local25;
		if (local5 == 1 || local5 == 3) {
			local22 = arg1.anInt2253;
			local25 = arg1.anInt2259;
		} else {
			local22 = arg1.anInt2259;
			local25 = arg1.anInt2253;
		}
		@Pc(44) int local44;
		@Pc(52) int local52;
		if (arg0 + local22 <= 104) {
			local44 = arg0 + (local22 >> 1);
			local52 = arg0 + (local22 + 1 >> 1);
		} else {
			local52 = arg0 + 1;
			local44 = arg0;
		}
		@Pc(81) int local81;
		@Pc(74) int local74;
		if (arg3 + local25 <= 104) {
			local74 = arg3 + (local25 + 1 >> 1);
			local81 = arg3 + (local25 >> 1);
		} else {
			local81 = arg3;
			local74 = arg3 + 1;
		}
		@Pc(98) int local98 = (arg0 << 7) + (local22 << 6);
		@Pc(114) int local114 = (local25 << 6) + (arg3 << 7);
		@Pc(118) int[][] local118 = Static154.anIntArrayArrayArray5[arg5];
		@Pc(145) int local145 = local118[local52][local81] + local118[local44][local81] + local118[local44][local74] + local118[local52][local74] >> 2;
		@Pc(147) int local147 = 0;
		@Pc(153) int[][] local153;
		if (arg5 != 0) {
			local153 = Static154.anIntArrayArrayArray5[0];
			local147 = local145 - (local153[local52][local74] + local153[local44][local74] + local153[local44][local81] + local153[local52][local81] >> 2);
		}
		local153 = null;
		if (arg5 < 3) {
			local153 = Static154.anIntArrayArrayArray5[arg5 + 1];
		}
		@Pc(208) Class129 local208 = arg1.method1889(arg4, null, true, local153, local118, arg2, local114, false, local145, local98);
		Static249.method3815(local208.aClass58_Sub2_3, local98 - arg7, local147, local114 - arg6);
	}

	@OriginalMember(owner = "client!di", name = "a", descriptor = "(ILclient!cg;)V")
	public static void method1024(@OriginalArg(1) Class22 arg0) {
		Static299.anInt5734 = arg0.method661("p11_full");
		Static280.anInt5489 = arg0.method661("p12_full");
		Static237.anInt4716 = arg0.method661("b12_full");
		Static282.anInt5537 = arg0.method661("mapfunction");
		Static123.anInt2507 = arg0.method661("hitmarks");
		Static244.anInt4817 = arg0.method661("hitbar_default");
		Static126.anInt2525 = arg0.method661("headicons_pk");
		Static4.anInt74 = arg0.method661("headicons_prayer");
		Static141.anInt2798 = arg0.method661("hint_headicons");
		Static190.anInt3868 = arg0.method661("hint_mapmarkers");
		Static235.anInt4658 = arg0.method661("mapflag");
		Static115.anInt2333 = arg0.method661("cross");
		Static240.anInt2604 = arg0.method661("mapdots");
		Static102.anInt2017 = arg0.method661("scrollbar");
		Static77.anInt1593 = arg0.method661("name_icons");
		Static185.anInt3674 = arg0.method661("floorshadows");
		Static12.anInt286 = arg0.method661("compass");
		Static205.anInt4052 = arg0.method661("hint_mapedge");
	}
}
