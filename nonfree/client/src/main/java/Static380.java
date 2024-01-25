import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static380 {

	@OriginalMember(owner = "client!nj", name = "o", descriptor = "[Ljava/lang/String;")
	public static String[] aStringArray25;

	@OriginalMember(owner = "client!nj", name = "p", descriptor = "I")
	public static int anInt7104;

	@OriginalMember(owner = "client!nj", name = "i", descriptor = "[F")
	public static final float[] aFloatArray57 = new float[4];

	@OriginalMember(owner = "client!nj", name = "l", descriptor = "I")
	public static int anInt7101 = -1;

	@OriginalMember(owner = "client!nj", name = "a", descriptor = "(ILclient!gt;ILclient!rq;Lclient!l;IBI)V")
	public static void method6113(@OriginalArg(0) int arg0, @OriginalArg(1) Class4_Sub1_Sub2_Sub1_Sub1 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) Class299 arg3, @OriginalArg(4) Class4_Sub1_Sub2_Sub1_Sub2 arg4, @OriginalArg(5) int arg5, @OriginalArg(7) int arg6) {
		@Pc(7) Class3_Sub22 local7 = new Class3_Sub22();
		local7.anInt3103 = arg0 << 9;
		local7.anInt3110 = arg5;
		local7.anInt3116 = arg2 << 9;
		if (arg3 != null) {
			local7.aClass299_1 = arg3;
			@Pc(161) int local161 = arg3.anInt8661;
			@Pc(164) int local164 = arg3.anInt8625;
			if (arg6 == 1 || arg6 == 3) {
				local164 = arg3.anInt8661;
				local161 = arg3.anInt8625;
			}
			local7.anInt3118 = arg3.anInt8627;
			local7.anInt3105 = arg3.anInt8664;
			local7.anInt3101 = arg3.anInt8675;
			local7.anInt3108 = arg0 + local164 << 9;
			local7.anInt3115 = arg3.anInt8632;
			local7.anInt3117 = arg3.anInt8639 << 9;
			local7.aBoolean206 = arg3.aBoolean604;
			local7.anInt3111 = arg3.anInt8646;
			local7.anIntArray158 = arg3.anIntArray535;
			local7.aBoolean204 = arg3.aBoolean613;
			local7.anInt3114 = arg3.anInt8656;
			local7.anInt3106 = arg2 + local161 << 9;
			if (arg3.anIntArray533 != null) {
				local7.aBoolean205 = true;
				local7.method2846();
			}
			if (local7.anIntArray158 != null) {
				local7.anInt3104 = local7.anInt3115 + (int) (Math.random() * (double) (local7.anInt3105 - local7.anInt3115));
			}
			Static511.aClass223_55.method5868(local7);
			return;
		}
		if (arg1 != null) {
			local7.aClass4_Sub1_Sub2_Sub1_Sub1_1 = arg1;
			@Pc(35) Class109 local35 = arg1.aClass109_1;
			if (local35.anIntArray147 != null) {
				local7.aBoolean205 = true;
				local35 = local35.method2813(Static373.aClass150_1);
			}
			if (local35 != null) {
				local7.anInt3106 = local35.anInt3032 + arg2 << 9;
				local7.anInt3108 = local35.anInt3032 + arg0 << 9;
				local7.anInt3101 = Static559.method8065(arg1);
				local7.anInt3117 = local35.anInt3060 << 9;
				local7.anInt3114 = local35.anInt3042;
				local7.anInt3118 = local35.lb;
				local7.anInt3111 = local35.anInt3044;
				local7.aBoolean204 = local35.aBoolean197;
			}
			Static456.aClass223_48.method5868(local7);
			return;
		}
		if (arg4 == null) {
			return;
		}
		local7.aClass4_Sub1_Sub2_Sub1_Sub2_1 = arg4;
		local7.anInt3106 = arg2 + arg4.method5059() << 9;
		local7.anInt3108 = arg0 + arg4.method5059() << 9;
		local7.anInt3101 = Static638.method8714(arg4);
		local7.anInt3117 = arg4.anInt5819 << 9;
		local7.anInt3111 = arg4.anInt5831;
		local7.aBoolean204 = arg4.aBoolean413;
		local7.anInt3118 = 256;
		local7.anInt3114 = 256;
		Static613.aClass280_47.method7109(local7, (long) arg4.anInt5759);
		return;
	}

	@OriginalMember(owner = "client!nj", name = "c", descriptor = "(I)V")
	public static void method6114(@OriginalArg(0) int arg0) {
		Static611.anInt9885 = arg0;
		for (@Pc(3) int local3 = 0; local3 < Static569.anInt9425; local3++) {
			for (@Pc(6) int local6 = 0; local6 < Static293.anInt5181; local6++) {
				if (Static330.aClass77ArrayArrayArray2[arg0][local3][local6] == null) {
					Static330.aClass77ArrayArrayArray2[arg0][local3][local6] = new Class77(arg0);
				}
			}
		}
	}

	@OriginalMember(owner = "client!nj", name = "a", descriptor = "(IIZI)I")
	public static int method6115(@OriginalArg(1) int arg0, @OriginalArg(2) boolean arg1, @OriginalArg(3) int arg2) {
		@Pc(10) Class3_Sub32 local10 = Static210.method3568(arg1, arg2);
		if (local10 == null) {
			return 0;
		} else if (arg0 == -1) {
			return 0;
		} else {
			@Pc(26) int local26 = 0;
			for (@Pc(28) int local28 = 0; local28 < local10.anIntArray267.length; local28++) {
				if (local10.anIntArray268[local28] == arg0) {
					local26 += local10.anIntArray267[local28];
				}
			}
			return local26;
		}
	}
}
