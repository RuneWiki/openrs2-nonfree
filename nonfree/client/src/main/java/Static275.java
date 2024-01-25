import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static275 {

	@OriginalMember(owner = "client!pp", name = "x", descriptor = "I")
	public static int anInt4799;

	@OriginalMember(owner = "client!pp", name = "y", descriptor = "I")
	public static int anInt4800;

	@OriginalMember(owner = "client!pp", name = "m", descriptor = "I")
	public static int anInt4790 = 765;

	@OriginalMember(owner = "client!pp", name = "q", descriptor = "[I")
	public static int[] anIntArray581 = new int[2];

	@OriginalMember(owner = "client!pp", name = "v", descriptor = "I")
	public static int anInt4798 = -1;

	@OriginalMember(owner = "client!pp", name = "a", descriptor = "(Lclient!vc;Lclient!bg;ILclient!h;IIIB)V")
	public static void method4229(@OriginalArg(0) Class236 arg0, @OriginalArg(1) Class25_Sub1_Sub1_Sub1 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) Class25_Sub1_Sub1_Sub2 arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		@Pc(12) Class1_Sub18 local12 = new Class1_Sub18();
		local12.anInt2854 = arg6 * 128;
		local12.anInt2855 = arg5 * 128;
		local12.anInt2850 = arg2;
		if (arg0 != null) {
			local12.aClass236_1 = arg0;
			@Pc(33) int local33 = arg0.anInt5893;
			@Pc(36) int local36 = arg0.anInt5912;
			if (arg4 == 1 || arg4 == 3) {
				local36 = arg0.anInt5893;
				local33 = arg0.anInt5912;
			}
			local12.anInt2849 = arg0.anInt5899 * 128;
			local12.anInt2863 = (arg6 + local33) * 128;
			local12.anInt2853 = arg0.anInt5935;
			local12.anIntArray341 = arg0.anIntArray711;
			local12.anInt2861 = arg0.anInt5914;
			local12.anInt2851 = (local36 + arg5) * 128;
			local12.anInt2859 = arg0.anInt5896;
			local12.anInt2852 = arg0.anInt5927;
			if (arg0.anIntArray706 != null) {
				local12.aBoolean247 = true;
				local12.method2348();
			}
			if (local12.anIntArray341 != null) {
				local12.anInt2857 = (int) ((double) (local12.anInt2852 - local12.anInt2853) * Math.random()) + local12.anInt2853;
			}
			Static67.aClass17_11.method199(local12);
		} else if (arg3 != null) {
			local12.aClass25_Sub1_Sub1_Sub2_1 = arg3;
			@Pc(128) Class59 local128 = arg3.aClass59_1;
			if (local128.anIntArray186 != null) {
				local12.aBoolean247 = true;
				local128 = local128.method1150(Static230.aClass72_3);
			}
			if (local128 != null) {
				local12.anInt2863 = (arg6 + local128.anInt1420) * 128;
				local12.anInt2851 = (arg5 + local128.anInt1420) * 128;
				local12.anInt2859 = Static179.method2590(arg3);
				local12.anInt2861 = local128.anInt1427;
				local12.anInt2849 = local128.anInt1424 * 128;
			}
			Static102.aClass17_30.method199(local12);
		} else if (arg1 != null) {
			local12.aClass25_Sub1_Sub1_Sub1_1 = arg1;
			local12.anInt2863 = (arg6 + arg1.method1877()) * 128;
			local12.anInt2851 = (arg5 + arg1.method1877()) * 128;
			local12.anInt2859 = Static182.method2612(arg1);
			local12.anInt2849 = arg1.anInt581 * 128;
			local12.anInt2861 = arg1.anInt610;
			Static48.aClass77_4.method1370((long) arg1.anInt2331, local12);
		}
	}

	@OriginalMember(owner = "client!pp", name = "a", descriptor = "(Lclient!vg;Z)V")
	public static void method4233(@OriginalArg(0) Class1_Sub33_Sub2 arg0) {
		arg0.method5200();
		@Pc(10) int local10 = Static43.anInt861;
		@Pc(20) Class25_Sub1_Sub1_Sub1 local20 = Static321.aClass25_Sub1_Sub1_Sub1_2 = Static225.aClass25_Sub1_Sub1_Sub1Array3[local10] = new Class25_Sub1_Sub1_Sub1();
		local20.anInt2331 = local10;
		@Pc(28) int local28 = arg0.method5191(30);
		@Pc(33) byte local33 = (byte) (local28 >> 28);
		@Pc(39) int local39 = local28 >> 14 & 0x3FFF;
		@Pc(43) int local43 = local28 & 0x3FFF;
		local20.anIntArray296[0] = local39 - Static256.anInt4410;
		local20.anInt6080 = (local20.anIntArray296[0] << 7) + (local20.method1877() << 6);
		local20.anIntArray295[0] = local43 - Static293.anInt5053;
		local20.anInt6077 = (local20.anIntArray295[0] << 7) + (local20.method1877() << 6);
		Static122.anInt2188 = local20.aByte70 = local33;
		if (Static322.aClass1_Sub33Array1[local10] != null) {
			local20.method472(Static322.aClass1_Sub33Array1[local10]);
		}
		Static331.anInt5548 = 0;
		Static345.anIntArray681[Static331.anInt5548++] = local10;
		Static117.aByteArray39[local10] = 0;
		Static93.anInt1678 = 0;
		for (@Pc(120) int local120 = 1; local120 < 2048; local120++) {
			if (local10 != local120) {
				@Pc(134) int local134 = arg0.method5191(18);
				@Pc(138) int local138 = local134 >> 16;
				@Pc(144) int local144 = local134 >> 8 & 0xFF;
				@Pc(148) int local148 = local134 & 0xFF;
				Static16.anIntArray29[local120] = (local138 << 28) + (local144 << 14) + local148;
				Static131.anIntArray301[local120] = 0;
				Static253.anIntArray538[local120] = -1;
				Static37.anIntArray108[Static93.anInt1678++] = local120;
				Static117.aByteArray39[local120] = 0;
			}
		}
		arg0.method5193();
	}

	@OriginalMember(owner = "client!pp", name = "a", descriptor = "(B)Lclient!fo;")
	public static Class1_Sub6_Sub4 method4234() {
		return Static353.aClass1_Sub6_Sub4_2;
	}
}
