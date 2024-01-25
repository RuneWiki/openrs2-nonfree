import java.awt.Color;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static626 {

	@OriginalMember(owner = "client!wda", name = "H", descriptor = "I")
	public static int anInt10528;

	@OriginalMember(owner = "client!wda", name = "x", descriptor = "[Ljava/lang/String;")
	public static final String[] aStringArray40 = new String[100];

	@OriginalMember(owner = "client!wda", name = "A", descriptor = "S")
	public static short aShort130 = 205;

	@OriginalMember(owner = "client!wda", name = "M", descriptor = "[F")
	public static final float[] aFloatArray77 = new float[4];

	@OriginalMember(owner = "client!wda", name = "a", descriptor = "(Lclient!cea;I)V")
	public static void method8555(@OriginalArg(0) Class9_Sub4_Sub2_Sub1_Sub1 arg0) {
		for (@Pc(20) Class6_Sub45 local20 = (Class6_Sub45) Static610.aClass163_61.method4966(); local20 != null; local20 = (Class6_Sub45) Static610.aClass163_61.method4965()) {
			if (local20.aClass9_Sub4_Sub2_Sub1_Sub1_2 == arg0) {
				if (local20.aClass6_Sub4_Sub5_3 != null) {
					Static152.aClass6_Sub4_Sub3_2.method5197(local20.aClass6_Sub4_Sub5_3);
					local20.aClass6_Sub4_Sub5_3 = null;
				}
				local20.method8792();
				return;
			}
		}
	}

	@OriginalMember(owner = "client!wda", name = "a", descriptor = "(IIIIIILclient!pfa;IIII)Z")
	public static boolean method8557(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) Class258 arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8, @OriginalArg(10) int arg9) {
		@Pc(7) int local7 = arg2;
		@Pc(9) int local9 = arg9;
		@Pc(24) int local24 = arg2 - 64;
		@Pc(29) int local29 = arg9 - 64;
		Static131.anIntArrayArray7[64][64] = 99;
		Static577.anIntArrayArray30[64][64] = 0;
		@Pc(43) byte local43 = 0;
		@Pc(45) int local45 = 0;
		Static611.anIntArray552[0] = arg2;
		@Pc(52) int local52 = local43 + 1;
		Static140.anIntArray125[0] = arg9;
		@Pc(57) int[][] local57 = arg5.anIntArrayArray38;
		while (local52 != local45) {
			local7 = Static611.anIntArray552[local45];
			local9 = Static140.anIntArray125[local45];
			@Pc(71) int local71 = local7 - local24;
			@Pc(76) int local76 = local9 - local29;
			@Pc(82) int local82 = local7 - arg5.anInt7870;
			local45 = local45 + 1 & 0xFFF;
			@Pc(94) int local94 = local9 - arg5.anInt7874;
			if (arg0 == -4) {
				if (arg4 == local7 && local9 == arg6) {
					Static47.anInt1658 = local9;
					Static365.anInt7041 = local7;
					return true;
				}
			} else if (arg0 == -3) {
				if (Static60.method5318(arg4, arg8, local9, arg1, local7, arg6, 1, 1)) {
					Static365.anInt7041 = local7;
					Static47.anInt1658 = local9;
					return true;
				}
			} else if (arg0 == -2) {
				if (arg5.method6631(arg4, arg1, arg6, local9, arg8, 1, local7, 1, arg3)) {
					Static47.anInt1658 = local9;
					Static365.anInt7041 = local7;
					return true;
				}
			} else if (arg0 == -1) {
				if (arg5.method6634(arg8, arg4, local9, 1, arg6, arg3, local7, arg1)) {
					Static47.anInt1658 = local9;
					Static365.anInt7041 = local7;
					return true;
				}
			} else if (arg0 == 0 || arg0 == 1 || arg0 == 2 || arg0 == 3 || arg0 == 9) {
				if (arg5.method6647(arg6, local7, 1, local9, arg7, arg4, arg0)) {
					Static47.anInt1658 = local9;
					Static365.anInt7041 = local7;
					return true;
				}
			} else if (arg5.method6633(arg4, arg7, local9, arg6, arg0, 1, local7)) {
				Static47.anInt1658 = local9;
				Static365.anInt7041 = local7;
				return true;
			}
			@Pc(245) int local245 = Static577.anIntArrayArray30[local71][local76] + 1;
			if (local71 > 0 && Static131.anIntArrayArray7[local71 - 1][local76] == 0 && (local57[local82 - 1][local94] & 0x42240000) == 0) {
				Static611.anIntArray552[local52] = local7 - 1;
				Static140.anIntArray125[local52] = local9;
				Static131.anIntArrayArray7[local71 - 1][local76] = 2;
				local52 = local52 + 1 & 0xFFF;
				Static577.anIntArrayArray30[local71 - 1][local76] = local245;
			}
			if (local71 < 127 && Static131.anIntArrayArray7[local71 + 1][local76] == 0 && (local57[local82 + 1][local94] & 0x60240000) == 0) {
				Static611.anIntArray552[local52] = local7 + 1;
				Static140.anIntArray125[local52] = local9;
				Static131.anIntArrayArray7[local71 + 1][local76] = 8;
				local52 = local52 + 1 & 0xFFF;
				Static577.anIntArrayArray30[local71 + 1][local76] = local245;
			}
			if (local76 > 0 && Static131.anIntArrayArray7[local71][local76 - 1] == 0 && (local57[local82][local94 - 1] & 0x40A40000) == 0) {
				Static611.anIntArray552[local52] = local7;
				Static140.anIntArray125[local52] = local9 - 1;
				Static131.anIntArrayArray7[local71][local76 - 1] = 1;
				local52 = local52 + 1 & 0xFFF;
				Static577.anIntArrayArray30[local71][local76 - 1] = local245;
			}
			if (local76 < 127 && Static131.anIntArrayArray7[local71][local76 + 1] == 0 && (local57[local82][local94 + 1] & 0x48240000) == 0) {
				Static611.anIntArray552[local52] = local7;
				Static140.anIntArray125[local52] = local9 + 1;
				local52 = local52 + 1 & 0xFFF;
				Static131.anIntArrayArray7[local71][local76 + 1] = 4;
				Static577.anIntArrayArray30[local71][local76 + 1] = local245;
			}
			if (local71 > 0 && local76 > 0 && Static131.anIntArrayArray7[local71 - 1][local76 - 1] == 0 && (local57[local82 - 1][local94 - 1] & 0x43A40000) == 0 && (local57[local82 - 1][local94] & 0x42240000) == 0 && (local57[local82][local94 - 1] & 0x40A40000) == 0) {
				Static611.anIntArray552[local52] = local7 - 1;
				Static140.anIntArray125[local52] = local9 - 1;
				local52 = local52 + 1 & 0xFFF;
				Static131.anIntArrayArray7[local71 - 1][local76 - 1] = 3;
				Static577.anIntArrayArray30[local71 - 1][local76 - 1] = local245;
			}
			if (local71 < 127 && local76 > 0 && Static131.anIntArrayArray7[local71 + 1][local76 - 1] == 0 && (local57[local82 + 1][local94 - 1] & 0x60E40000) == 0 && (local57[local82 + 1][local94] & 0x60240000) == 0 && (local57[local82][local94 - 1] & 0x40A40000) == 0) {
				Static611.anIntArray552[local52] = local7 + 1;
				Static140.anIntArray125[local52] = local9 - 1;
				local52 = local52 + 1 & 0xFFF;
				Static131.anIntArrayArray7[local71 + 1][local76 - 1] = 9;
				Static577.anIntArrayArray30[local71 + 1][local76 - 1] = local245;
			}
			if (local71 > 0 && local76 < 127 && Static131.anIntArrayArray7[local71 - 1][local76 + 1] == 0 && (local57[local82 - 1][local94 + 1] & 0x4E240000) == 0 && (local57[local82 - 1][local94] & 0x42240000) == 0 && (local57[local82][local94 + 1] & 0x48240000) == 0) {
				Static611.anIntArray552[local52] = local7 - 1;
				Static140.anIntArray125[local52] = local9 + 1;
				Static131.anIntArrayArray7[local71 - 1][local76 + 1] = 6;
				local52 = local52 + 1 & 0xFFF;
				Static577.anIntArrayArray30[local71 - 1][local76 + 1] = local245;
			}
			if (local71 < 127 && local76 < 127 && Static131.anIntArrayArray7[local71 + 1][local76 + 1] == 0 && (local57[local82 + 1][local94 + 1] & 0x78240000) == 0 && (local57[local82 + 1][local94] & 0x60240000) == 0 && (local57[local82][local94 + 1] & 0x48240000) == 0) {
				Static611.anIntArray552[local52] = local7 + 1;
				Static140.anIntArray125[local52] = local9 + 1;
				Static131.anIntArrayArray7[local71 + 1][local76 + 1] = 12;
				local52 = local52 + 1 & 0xFFF;
				Static577.anIntArrayArray30[local71 + 1][local76 + 1] = local245;
			}
		}
		Static365.anInt7041 = local7;
		Static47.anInt1658 = local9;
		return false;
	}

	@OriginalMember(owner = "client!wda", name = "a", descriptor = "(IILjava/lang/String;)I")
	public static int method8559(@OriginalArg(2) String arg0) {
		return Static403.method6331(16, arg0);
	}

	@OriginalMember(owner = "client!wda", name = "i", descriptor = "(I)V")
	public static void method8561() {
		Static391.aClass91_1.method6218();
		Static6.aClass96_1.method8027();
		Static545.aClient1.method2122();
		Static428.aCanvas12.setBackground(Color.black);
		Static562.anInt9689 = -1;
		Static391.aClass91_1 = Static627.method8564(Static428.aCanvas12);
		Static6.aClass96_1 = Static138.method2759(Static428.aCanvas12);
	}
}
