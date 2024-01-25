import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static31 {

	@OriginalMember(owner = "client!bk", name = "e", descriptor = "[I")
	public static int[] anIntArray221;

	@OriginalMember(owner = "client!bk", name = "J", descriptor = "I")
	public static int anInt2066;

	@OriginalMember(owner = "client!bk", name = "l", descriptor = "Lclient!nk;")
	public static final Class177 aClass177_31 = new Class177(42, 3);

	@OriginalMember(owner = "client!bk", name = "y", descriptor = "Z")
	public static boolean aBoolean129 = true;

	@OriginalMember(owner = "client!bk", name = "H", descriptor = "Lclient!vv;")
	public static final Class263 aClass263_46 = new Class263(85, 8);

	@OriginalMember(owner = "client!bk", name = "I", descriptor = "Z")
	public static boolean aBoolean130 = false;

	@OriginalMember(owner = "client!bk", name = "K", descriptor = "Lclient!vv;")
	public static final Class263 aClass263_47 = new Class263(108, 0);

	@OriginalMember(owner = "client!bk", name = "a", descriptor = "(B)V")
	public static void method1536() {
		Static271.aClient1.method1043();
		Static433.aClass1_Sub3_Sub1_11.anInt1710 = 0;
		Static340.aClass263_146 = null;
		Static32.anInt907 = 0;
		Static102.aClass263_56 = null;
		Static162.anInt3420 = 0;
		Static104.aClass263_58 = null;
		Static132.anInt2937 = 0;
		Static5.aClass1_Sub3_Sub1_1.anInt1710 = 0;
		Static280.aClass263_128 = null;
		for (@Pc(33) int local33 = 0; local33 < 100; local33++) {
			Static119.aStringArray21[local33] = null;
		}
		Static414.anInt7372 = 0;
		Static323.anInt5975 = 0;
		Static364.aString59 = null;
		Static84.anInt2030 = 0;
		Static216.aClass186Array1 = null;
		Static169.anInt3490 = 0;
	}

	@OriginalMember(owner = "client!bk", name = "a", descriptor = "(Lclient!ir;IIIIIIIBII)Z")
	public static boolean method1537(@OriginalArg(0) Class120 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(9) int arg8, @OriginalArg(10) int arg9) {
		@Pc(5) int local5 = arg6;
		@Pc(7) int local7 = arg9;
		@Pc(15) int local15 = arg6 - 64;
		Static75.anIntArrayArray19[64][64] = 99;
		@Pc(26) int local26 = arg9 - 64;
		Static343.anIntArrayArray50[64][64] = 0;
		@Pc(34) byte local34 = 0;
		Static367.anIntArray618[0] = arg6;
		@Pc(40) int local40 = 0;
		@Pc(43) int local43 = local34 + 1;
		Static386.anIntArray669[0] = arg9;
		@Pc(48) int[][] local48 = arg0.anIntArrayArray35;
		while (local40 != local43) {
			local7 = Static386.anIntArray669[local40];
			local5 = Static367.anIntArray618[local40];
			@Pc(70) int local70 = local7 - local26;
			@Pc(76) int local76 = local5 - arg0.anInt3918;
			@Pc(82) int local82 = local7 - arg0.anInt3915;
			@Pc(87) int local87 = local5 - local15;
			local40 = local40 + 1 & 0xFFF;
			if (arg7 == -4) {
				if (local5 == arg2 && arg5 == local7) {
					Static94.anInt2261 = local5;
					Static56.anInt1510 = local7;
					return true;
				}
			} else if (arg7 == -3) {
				if (Static149.method2370(1, arg5, local5, local7, arg8, arg2, arg1, 1)) {
					Static56.anInt1510 = local7;
					Static94.anInt2261 = local5;
					return true;
				}
			} else if (arg7 == -2) {
				if (arg0.method3053(1, arg1, arg5, local5, local7, 1, arg2, arg8, arg4)) {
					Static94.anInt2261 = local5;
					Static56.anInt1510 = local7;
					return true;
				}
			} else if (arg7 == -1) {
				if (arg0.method3039(local7, arg1, arg5, local5, 1, arg4, arg2, arg8)) {
					Static56.anInt1510 = local7;
					Static94.anInt2261 = local5;
					return true;
				}
			} else if (arg7 == 0 || arg7 == 1 || arg7 == 2 || arg7 == 3 || arg7 == 9) {
				if (arg0.method3041(arg2, arg3, arg7, arg5, local5, local7, 1)) {
					Static94.anInt2261 = local5;
					Static56.anInt1510 = local7;
					return true;
				}
			} else if (arg0.method3036(local7, arg5, arg3, 1, local5, arg2, arg7)) {
				Static56.anInt1510 = local7;
				Static94.anInt2261 = local5;
				return true;
			}
			@Pc(246) int local246 = Static343.anIntArrayArray50[local87][local70] + 1;
			if (local87 > 0 && Static75.anIntArrayArray19[local87 - 1][local70] == 0 && (local48[local76 - 1][local82] & 0x42240000) == 0) {
				Static367.anIntArray618[local43] = local5 - 1;
				Static386.anIntArray669[local43] = local7;
				Static75.anIntArrayArray19[local87 - 1][local70] = 2;
				local43 = local43 + 1 & 0xFFF;
				Static343.anIntArrayArray50[local87 - 1][local70] = local246;
			}
			if (local87 < 127 && Static75.anIntArrayArray19[local87 + 1][local70] == 0 && (local48[local76 + 1][local82] & 0x60240000) == 0) {
				Static367.anIntArray618[local43] = local5 + 1;
				Static386.anIntArray669[local43] = local7;
				local43 = local43 + 1 & 0xFFF;
				Static75.anIntArrayArray19[local87 + 1][local70] = 8;
				Static343.anIntArrayArray50[local87 + 1][local70] = local246;
			}
			if (local70 > 0 && Static75.anIntArrayArray19[local87][local70 - 1] == 0 && (local48[local76][local82 - 1] & 0x40A40000) == 0) {
				Static367.anIntArray618[local43] = local5;
				Static386.anIntArray669[local43] = local7 - 1;
				local43 = local43 + 1 & 0xFFF;
				Static75.anIntArrayArray19[local87][local70 - 1] = 1;
				Static343.anIntArrayArray50[local87][local70 - 1] = local246;
			}
			if (local70 < 127 && Static75.anIntArrayArray19[local87][local70 + 1] == 0 && (local48[local76][local82 + 1] & 0x48240000) == 0) {
				Static367.anIntArray618[local43] = local5;
				Static386.anIntArray669[local43] = local7 + 1;
				local43 = local43 + 1 & 0xFFF;
				Static75.anIntArrayArray19[local87][local70 + 1] = 4;
				Static343.anIntArrayArray50[local87][local70 + 1] = local246;
			}
			if (local87 > 0 && local70 > 0 && Static75.anIntArrayArray19[local87 - 1][local70 - 1] == 0 && (local48[local76 - 1][local82 - 1] & 0x43A40000) == 0 && (local48[local76 - 1][local82] & 0x42240000) == 0 && (local48[local76][local82 - 1] & 0x40A40000) == 0) {
				Static367.anIntArray618[local43] = local5 - 1;
				Static386.anIntArray669[local43] = local7 - 1;
				local43 = local43 + 1 & 0xFFF;
				Static75.anIntArrayArray19[local87 - 1][local70 - 1] = 3;
				Static343.anIntArrayArray50[local87 - 1][local70 - 1] = local246;
			}
			if (local87 < 127 && local70 > 0 && Static75.anIntArrayArray19[local87 + 1][local70 - 1] == 0 && (local48[local76 + 1][local82 - 1] & 0x60E40000) == 0 && (local48[local76 + 1][local82] & 0x60240000) == 0 && (local48[local76][local82 - 1] & 0x40A40000) == 0) {
				Static367.anIntArray618[local43] = local5 + 1;
				Static386.anIntArray669[local43] = local7 - 1;
				Static75.anIntArrayArray19[local87 + 1][local70 - 1] = 9;
				local43 = local43 + 1 & 0xFFF;
				Static343.anIntArrayArray50[local87 + 1][local70 - 1] = local246;
			}
			if (local87 > 0 && local70 < 127 && Static75.anIntArrayArray19[local87 - 1][local70 + 1] == 0 && (local48[local76 - 1][local82 + 1] & 0x4E240000) == 0 && (local48[local76 - 1][local82] & 0x42240000) == 0 && (local48[local76][local82 + 1] & 0x48240000) == 0) {
				Static367.anIntArray618[local43] = local5 - 1;
				Static386.anIntArray669[local43] = local7 + 1;
				local43 = local43 + 1 & 0xFFF;
				Static75.anIntArrayArray19[local87 - 1][local70 + 1] = 6;
				Static343.anIntArrayArray50[local87 - 1][local70 + 1] = local246;
			}
			if (local87 < 127 && local70 < 127 && Static75.anIntArrayArray19[local87 + 1][local70 + 1] == 0 && (local48[local76 + 1][local82 + 1] & 0x78240000) == 0 && (local48[local76 + 1][local82] & 0x60240000) == 0 && (local48[local76][local82 + 1] & 0x48240000) == 0) {
				Static367.anIntArray618[local43] = local5 + 1;
				Static386.anIntArray669[local43] = local7 + 1;
				Static75.anIntArrayArray19[local87 + 1][local70 + 1] = 12;
				local43 = local43 + 1 & 0xFFF;
				Static343.anIntArrayArray50[local87 + 1][local70 + 1] = local246;
			}
		}
		Static56.anInt1510 = local7;
		Static94.anInt2261 = local5;
		return false;
	}

	@OriginalMember(owner = "client!bk", name = "b", descriptor = "(I)V")
	public static void method1543() {
		Static194.aClass106_7.JA(((float) Static12.aClass34_Sub1_1.anInt7168 * 0.1F + 0.7F) * 1.1523438F);
		Static194.aClass106_7.B(Static5.anInt68, 0.69921875F, 1.2F, -50.0F, -60.0F, -50.0F);
		Static194.aClass106_7.Q(Static15.anInt219, -1, 256);
		Static194.aClass106_7.method5967(Static424.aClass86_4);
	}
}
