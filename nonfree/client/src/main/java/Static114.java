import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static114 {

	@OriginalMember(owner = "client!eba", name = "q", descriptor = "Lclient!lt;")
	public static final Class226 aClass226_9 = new Class226(3, 4);

	@OriginalMember(owner = "client!eba", name = "a", descriptor = "(IILjava/lang/String;Ljava/lang/String;)V")
	public static void method1692(@OriginalArg(1) int arg0, @OriginalArg(2) String arg1, @OriginalArg(3) String arg2) {
		if (arg2.length() > 320 || !Static536.method7364()) {
			return;
		}
		Static119.method1758();
		Static357.aString67 = arg1;
		Static623.anInt9970 = arg0;
		Static514.aString92 = arg2;
		Static411.method6060(6, -3);
	}

	@OriginalMember(owner = "client!eba", name = "h", descriptor = "(I)V")
	public static void method1693() {
		@Pc(12) Class168 local12 = Static630.aClass168_93;
		synchronized (Static630.aClass168_93) {
			Static630.aClass168_93.method3856();
		}
	}

	@OriginalMember(owner = "client!eba", name = "a", descriptor = "(Lclient!ns;Lclient!tk;BIIILclient!ip;I)V")
	public static void method1694(@OriginalArg(0) Class4_Sub1_Sub1_Sub2_Sub2 arg0, @OriginalArg(1) Class354 arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) Class4_Sub1_Sub1_Sub2_Sub1 arg5, @OriginalArg(7) int arg6) {
		@Pc(14) Class5_Sub20 local14 = new Class5_Sub20();
		local14.anInt2983 = arg6 << 9;
		local14.anInt2972 = arg4 << 9;
		local14.anInt2975 = arg3;
		if (arg1 != null) {
			local14.aClass354_1 = arg1;
			@Pc(175) int local175 = arg1.anInt9385;
			@Pc(178) int local178 = arg1.anInt9410;
			if (arg2 == 1 || arg2 == 3) {
				local178 = arg1.anInt9385;
				local175 = arg1.anInt9410;
			}
			local14.anInt2981 = arg1.anInt9409;
			local14.anInt2974 = arg1.anInt9411;
			local14.anInt2979 = arg1.anInt9428;
			local14.anInt2982 = local175 + arg4 << 9;
			local14.anInt2968 = arg6 + local178 << 9;
			local14.aBoolean222 = arg1.aBoolean645;
			local14.aBoolean223 = arg1.aBoolean639;
			local14.anInt2973 = arg1.anInt9427 << 9;
			local14.anInt2977 = arg1.anInt9416;
			local14.anInt2976 = arg1.anInt9432 << 9;
			local14.anIntArray139 = arg1.anIntArray525;
			local14.anInt2980 = arg1.anInt9425;
			local14.anInt2971 = arg1.anInt9377;
			if (arg1.anIntArray526 != null) {
				local14.aBoolean221 = true;
				local14.method2784();
			}
			if (local14.anIntArray139 != null) {
				local14.anInt2984 = local14.anInt2980 + (int) (Math.random() * (double) (local14.anInt2977 - local14.anInt2980));
			}
			Static435.aClass20_38.method370(local14);
			return;
		}
		if (arg0 != null) {
			local14.aClass4_Sub1_Sub1_Sub2_Sub2_2 = arg0;
			@Pc(39) Class105 local39 = arg0.aClass105_1;
			if (local39.anIntArray134 != null) {
				local14.aBoolean221 = true;
				local39 = local39.method2622(Static23.aClass247_1);
			}
			if (local39 != null) {
				local14.anInt2982 = local39.anInt2811 + arg4 << 9;
				local14.anInt2968 = arg6 + local39.anInt2811 << 9;
				local14.anInt2979 = Static649.method8960(arg0);
				local14.anInt2971 = local39.anInt2812;
				local14.anInt2973 = local39.anInt2814 << 9;
				local14.anInt2981 = local39.anInt2837;
				local14.anInt2976 = local39.anInt2801 << 9;
				local14.anInt2974 = local39.anInt2800;
				local14.aBoolean222 = local39.aBoolean210;
			}
			Static84.aClass20_5.method370(local14);
			return;
		}
		if (arg5 == null) {
			return;
		}
		local14.aClass4_Sub1_Sub1_Sub2_Sub1_1 = arg5;
		local14.anInt2982 = arg4 + arg5.method5932() << 9;
		local14.anInt2968 = arg5.method5932() + arg6 << 9;
		local14.anInt2979 = Static75.method1251(arg5);
		local14.aBoolean222 = arg5.aBoolean305;
		local14.anInt2971 = 256;
		local14.anInt2973 = 0;
		local14.anInt2981 = 256;
		local14.anInt2976 = arg5.anInt4545 << 9;
		local14.anInt2974 = arg5.anInt4554;
		Static342.aClass306_24.method6944(local14, (long) arg5.anInt6843, -12002);
		return;
	}

	@OriginalMember(owner = "client!eba", name = "i", descriptor = "(I)V")
	public static void method1697() {
		if (!Static509.aBoolean545) {
			Static509.aBoolean545 = true;
			Static669.aBoolean763 = true;
			Static317.aFloat130 += (-12.0F - Static317.aFloat130) / 2.0F;
		}
	}

	@OriginalMember(owner = "client!eba", name = "l", descriptor = "(I)V")
	public static void method1700() {
		if (Static673.anInterface18Array1 == null) {
			return;
		}
		@Pc(9) Interface18[] local9 = Static673.anInterface18Array1;
		for (@Pc(11) int local11 = 0; local11 < local9.length; local11++) {
			@Pc(17) Interface18 local17 = local9[local11];
			local17.method5204();
		}
	}

	@OriginalMember(owner = "client!eba", name = "a", descriptor = "(Lclient!mj;ILclient!mj;)V")
	public static void method1711(@OriginalArg(0) Class238 arg0, @OriginalArg(2) Class238 arg1) {
		@Pc(13) Class5_Sub41 local13 = Static647.method8905(Static33.aClass381_18, Static4.aClass389_17.aClass393_2);
		local13.aClass5_Sub36_Sub2_1.method7287(arg0.anInt5971);
		local13.aClass5_Sub36_Sub2_1.method7277(arg0.anInt5990);
		local13.aClass5_Sub36_Sub2_1.method7296(arg1.anInt5986);
		local13.aClass5_Sub36_Sub2_1.method7326(arg1.anInt5971);
		local13.aClass5_Sub36_Sub2_1.method7286(arg0.anInt5986);
		local13.aClass5_Sub36_Sub2_1.method7296(arg1.anInt5990);
		Static4.aClass389_17.method9079(local13);
	}
}
