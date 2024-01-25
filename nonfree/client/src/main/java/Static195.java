import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static195 {

	@OriginalMember(owner = "client!me", name = "b", descriptor = "Lclient!ct;")
	public static Class30 aClass30_57;

	@OriginalMember(owner = "client!me", name = "e", descriptor = "[Lclient!oc;")
	public static Class152[] aClass152Array2;

	@OriginalMember(owner = "client!me", name = "g", descriptor = "I")
	public static int anInt3948 = 0;

	@OriginalMember(owner = "client!me", name = "i", descriptor = "I")
	public static int anInt3950 = 0;

	@OriginalMember(owner = "client!me", name = "k", descriptor = "Lclient!bn;")
	public static final Class18 aClass18_126 = new Class18(0, 0);

	@OriginalMember(owner = "client!me", name = "l", descriptor = "Z")
	public static boolean aBoolean294 = true;

	@OriginalMember(owner = "client!me", name = "m", descriptor = "[I")
	public static final int[] anIntArray302 = new int[] { 0, 64, 128, 128, 128, 64, 0, 0, 32, 64, 32, 96, 64 };

	@OriginalMember(owner = "client!me", name = "a", descriptor = "(IIII)V")
	public static void method3637(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (arg1 == 1008) {
			Static302.method5244(Static215.aClass105_13, arg2, arg0);
		} else if (arg1 == 1003) {
			Static302.method5244(Static103.aClass105_5, arg2, arg0);
		} else if (arg1 == 1009) {
			Static302.method5244(Static196.aClass105_12, arg2, arg0);
		} else if (arg1 == 1007) {
			Static302.method5244(Static16.aClass105_1, arg2, arg0);
		} else if (arg1 == 1012) {
			Static302.method5244(Static363.aClass105_19, arg2, arg0);
		}
	}

	@OriginalMember(owner = "client!me", name = "a", descriptor = "(Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;)Ljava/lang/String;")
	public static String method3638(@OriginalArg(0) String arg0, @OriginalArg(2) String arg1, @OriginalArg(3) String arg2) {
		for (@Pc(9) int local9 = arg1.indexOf(arg0); local9 != -1; local9 = arg1.indexOf(arg0, arg2.length() + local9)) {
			arg1 = arg1.substring(0, local9) + arg2 + arg1.substring(local9 + arg0.length());
		}
		return arg1;
	}

	@OriginalMember(owner = "client!me", name = "a", descriptor = "(B)Z")
	public static boolean method3640() {
		return Static224.anInt4512 > 0;
	}

	@OriginalMember(owner = "client!me", name = "a", descriptor = "(Lclient!we;B)V")
	public static void method3641(@OriginalArg(0) Class11_Sub2_Sub6_Sub2 arg0) {
		for (@Pc(19) Class1_Sub40 local19 = (Class1_Sub40) Static136.aClass42_40.method1543(); local19 != null; local19 = (Class1_Sub40) Static136.aClass42_40.method1551()) {
			if (local19.aClass11_Sub2_Sub6_Sub2_1 == arg0) {
				if (local19.aClass1_Sub6_Sub2_2 != null) {
					Static324.aClass1_Sub6_Sub3_2.method3786(local19.aClass1_Sub6_Sub2_2);
					local19.aClass1_Sub6_Sub2_2 = null;
				}
				local19.method6045();
				return;
			}
		}
	}

	@OriginalMember(owner = "client!me", name = "a", descriptor = "(IIIII)V")
	public static void method3642(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		@Pc(7) int local7 = 0;
		@Pc(13) int local13 = arg0;
		@Pc(16) int local16 = -arg0;
		Static367.method6081(arg1, arg2 - arg0, Static43.anIntArrayArray57[arg3], arg2 + arg0);
		@Pc(32) int local32 = -1;
		while (local13 > local7) {
			local32 += 2;
			local16 += local32;
			local7++;
			if (local16 >= 0) {
				local13--;
				local16 -= local13 << 1;
				@Pc(55) int[] local55 = Static43.anIntArrayArray57[local13 + arg3];
				@Pc(62) int[] local62 = Static43.anIntArrayArray57[arg3 - local13];
				@Pc(66) int local66 = arg2 + local7;
				@Pc(71) int local71 = arg2 - local7;
				Static367.method6081(arg1, local71, local55, local66);
				Static367.method6081(arg1, local71, local62, local66);
			}
			@Pc(87) int local87 = arg2 + local13;
			@Pc(92) int local92 = arg2 - local13;
			@Pc(98) int[] local98 = Static43.anIntArrayArray57[local7 + arg3];
			@Pc(105) int[] local105 = Static43.anIntArrayArray57[arg3 - local7];
			Static367.method6081(arg1, local92, local98, local87);
			Static367.method6081(arg1, local92, local105, local87);
		}
	}

	@OriginalMember(owner = "client!me", name = "a", descriptor = "(I)V")
	public static void method3643() {
		@Pc(1) Class21 local1 = Static110.aClass21_71;
		synchronized (Static110.aClass21_71) {
			Static110.aClass21_71.method857();
		}
		local1 = Static161.aClass21_91;
		synchronized (Static161.aClass21_91) {
			Static161.aClass21_91.method857();
		}
		local1 = Static168.aClass21_97;
		synchronized (Static168.aClass21_97) {
			Static168.aClass21_97.method857();
		}
		local1 = Static300.aClass21_152;
		synchronized (Static300.aClass21_152) {
			Static300.aClass21_152.method857();
		}
	}
}
