import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static132 {

	@OriginalMember(owner = "client!qf", name = "jb", descriptor = "Lclient!ma;")
	public static Class50 aClass50_3;

	@OriginalMember(owner = "client!qf", name = "zc", descriptor = "Lclient!gd;")
	public static Class2_Sub2_Sub3_Sub3 aClass2_Sub2_Sub3_Sub3_6;

	@OriginalMember(owner = "client!qf", name = "z", descriptor = "I")
	public static int anInt3177 = 0;

	@OriginalMember(owner = "client!qf", name = "N", descriptor = "I")
	public static int anInt3185 = 0;

	@OriginalMember(owner = "client!qf", name = "wb", descriptor = "Lclient!sg;")
	public static Class77 aClass77_1160 = Static146.method2172("(U3");

	@OriginalMember(owner = "client!qf", name = "a", descriptor = "(I)V")
	public static void method2239() {
		aClass2_Sub2_Sub3_Sub3_6 = null;
		aClass50_3 = null;
		aClass77_1160 = null;
	}

	@OriginalMember(owner = "client!qf", name = "a", descriptor = "(II)Z")
	public static boolean method2242(@OriginalArg(1) int arg0) {
		return (arg0 >> 30 & 0x1) != 0;
	}

	@OriginalMember(owner = "client!qf", name = "a", descriptor = "(ZI)V")
	public static void method2244(@OriginalArg(1) int arg0) {
		if (arg0 == -1 && !Static8.aBoolean10) {
			Static54.method1030();
		} else if (arg0 != -1 && (Static99.anInt2498 != arg0 || !Static82.method1514()) && Static120.anInt1042 != 0 && !Static8.aBoolean10) {
			Static98.method1784(Static120.anInt1042, 0, Static176.aClass43_Sub1_20, arg0);
		}
		Static99.anInt2498 = arg0;
	}

	@OriginalMember(owner = "client!qf", name = "a", descriptor = "(IBIIIIIII)V")
	public static void method2251(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7) {
		if (Static40.method798(arg1)) {
			Static87.aClass66Array1 = null;
			Static14.method324(arg3, arg4, Static125.aClass66ArrayArray1[arg1], arg7, arg6, arg5, arg0, -1, arg2);
			if (Static87.aClass66Array1 != null) {
				Static14.method324(arg3, arg4, Static87.aClass66Array1, Static8.anInt227, arg6, arg5, arg0, -1412584499, Static167.anInt4137);
				Static87.aClass66Array1 = null;
			}
		} else if (arg6 == -1) {
			for (@Pc(20) int local20 = 0; local20 < 100; local20++) {
				Static103.aBooleanArray9[local20] = true;
			}
		} else {
			Static103.aBooleanArray9[arg6] = true;
		}
	}

	@OriginalMember(owner = "client!qf", name = "a", descriptor = "(ILclient!og;II[B[Lclient!vb;)V")
	public static void method2253(@OriginalArg(1) Class60 arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) byte[] arg3, @OriginalArg(5) Class86[] arg4) {
		@Pc(12) int local12 = -1;
		@Pc(17) Class2_Sub18 local17 = new Class2_Sub18(arg3);
		while (true) {
			@Pc(21) int local21 = local17.method2380();
			if (local21 == 0) {
				return;
			}
			@Pc(25) int local25 = 0;
			local12 += local21;
			while (true) {
				@Pc(33) int local33 = local17.method2380();
				if (local33 == 0) {
					break;
				}
				local25 += local33 - 1;
				@Pc(48) int local48 = local25 & 0x3F;
				@Pc(54) int local54 = local25 >> 6 & 0x3F;
				@Pc(58) int local58 = local25 >> 12;
				@Pc(62) int local62 = local17.method2387();
				@Pc(66) int local66 = local54 + arg1;
				@Pc(71) int local71 = local48 + arg2;
				@Pc(75) int local75 = local62 & 0x3;
				@Pc(79) int local79 = local62 >> 2;
				if (local66 > 0 && local71 > 0 && local66 < 103 && local71 < 103) {
					@Pc(99) Class86 local99 = null;
					@Pc(101) int local101 = local58;
					if ((Static140.aByteArrayArrayArray6[1][local66][local71] & 0x2) == 2) {
						local101 = local58 - 1;
					}
					if (local101 >= 0) {
						local99 = arg4[local101];
					}
					Static10.method147(local99, arg0, local75, local58, local79, local12, local71, local66);
				}
			}
		}
	}
}
