import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static160 {

	@OriginalMember(owner = "client!gi", name = "s", descriptor = "I")
	public static int anInt3274;

	@OriginalMember(owner = "client!gi", name = "n", descriptor = "[[I")
	public static final int[][] anIntArrayArray22 = new int[][] { { 0, 1, 2, 3 }, { 1, 2, 3, 0 }, { 1, 2, -1, 0 }, { 2, 0, -1, 1 }, { 0, 1, -1, 2 }, { 1, 2, -1, 0 }, { -1, 4, -1, 1 }, { -1, 1, 3, -1 }, { -1, 0, 2, -1 }, { 3, 5, 2, 0 }, { 0, 2, 5, 3 }, { 0, 2, 3, 5 }, { 0, 1, 2, 3 } };

	@OriginalMember(owner = "client!gi", name = "t", descriptor = "Lclient!gi;")
	public static final Class5_Sub21 aClass5_Sub21_1 = new Class5_Sub21(0, 0);

	@OriginalMember(owner = "client!gi", name = "a", descriptor = "(IBI)Z")
	public static boolean method2897(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		return (arg0 & 0x10000) != 0;
	}

	@OriginalMember(owner = "client!gi", name = "a", descriptor = "(IILclient!tk;IILclient!bda;BLclient!jk;)V")
	public static void method2898(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class283 arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) Class15_Sub2_Sub1_Sub1 arg5, @OriginalArg(7) Class15_Sub2_Sub1_Sub2 arg6) {
		@Pc(11) Class5_Sub19 local11 = new Class5_Sub19();
		local11.anInt3163 = arg3 << 7;
		local11.anInt3173 = arg4;
		local11.anInt3159 = arg0 << 7;
		if (arg2 != null) {
			local11.aClass283_1 = arg2;
			@Pc(32) int local32 = arg2.anInt8184;
			@Pc(35) int local35 = arg2.anInt8153;
			if (arg1 == 1 || arg1 == 3) {
				local35 = arg2.anInt8184;
				local32 = arg2.anInt8153;
			}
			local11.anIntArray245 = arg2.anIntArray634;
			local11.anInt3164 = arg2.anInt8193;
			local11.anInt3168 = arg2.anInt8169;
			local11.anInt3167 = arg2.anInt8175;
			local11.anInt3166 = arg3 + local35 << 7;
			local11.anInt3170 = arg2.anInt8194 << 7;
			local11.anInt3160 = local32 + arg0 << 7;
			local11.anInt3162 = arg2.anInt8179;
			if (arg2.anIntArray632 != null) {
				local11.aBoolean208 = true;
				local11.method2823();
			}
			if (local11.anIntArray245 != null) {
				local11.anInt3172 = (int) ((double) (local11.anInt3167 - local11.anInt3162) * Math.random()) + local11.anInt3162;
			}
			Static206.aClass99_39.method2513(local11);
		} else if (arg6 != null) {
			local11.aClass15_Sub2_Sub1_Sub2_1 = arg6;
			@Pc(130) Class305 local130 = arg6.aClass305_1;
			if (local130.anIntArray679 != null) {
				local11.aBoolean208 = true;
				local130 = local130.method7150(Static540.aClass242_1);
			}
			if (local130 != null) {
				local11.anInt3160 = local130.anInt8815 + arg0 << 7;
				local11.anInt3166 = arg3 + local130.anInt8815 << 7;
				local11.anInt3164 = Static7.method266(arg6);
				local11.anInt3168 = local130.anInt8811;
				local11.anInt3170 = local130.anInt8813 << 7;
			}
			Static479.aClass99_71.method2513(local11);
		} else if (arg5 != null) {
			local11.aClass15_Sub2_Sub1_Sub1_2 = arg5;
			local11.anInt3160 = arg5.method4035() + arg0 << 7;
			local11.anInt3166 = arg5.method4035() + arg3 << 7;
			local11.anInt3164 = Static276.method4515(arg5);
			local11.anInt3170 = arg5.anInt855 << 7;
			local11.anInt3168 = arg5.anInt837;
			Static484.aClass42_43.method1106((long) arg5.anInt4745, local11);
		}
	}

	@OriginalMember(owner = "client!gi", name = "a", descriptor = "(Lclient!gp;I)V")
	public static void method2899(@OriginalArg(0) Class117 arg0) {
		Static21.anInt7324 = 0;
		Static68.anInt1407 = 0;
		Static84.aClass77_5 = new Class77();
		Static500.aClass30_Sub2_Sub1_Sub1Array2 = new Class30_Sub2_Sub1_Sub1[1024];
		Static67.aClass30_Sub7Array3 = new Class30_Sub7[Static112.anIntArray210[Static490.anInt8412] + 1];
		Static528.anInt8608 = 0;
		Static134.anInt2771 = 0;
		Static325.method5194(arg0);
		Static476.method6638(arg0);
	}

	@OriginalMember(owner = "client!gi", name = "a", descriptor = "(B)V")
	public static void method2900() {
		@Pc(5) Class288 local5 = Static240.aClass288_34;
		synchronized (Static240.aClass288_34) {
			Static240.aClass288_34.method6744();
		}
		local5 = Static229.aClass288_33;
		synchronized (Static229.aClass288_33) {
			Static229.aClass288_33.method6744();
		}
	}

	@OriginalMember(owner = "client!gi", name = "a", descriptor = "(Z)V")
	public static void method2901() {
		Static337.aClass288_45.method6744();
	}
}
