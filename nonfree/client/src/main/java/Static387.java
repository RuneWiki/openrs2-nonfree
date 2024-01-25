import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static387 {

	@OriginalMember(owner = "client!tk", name = "N", descriptor = "I")
	public static int anInt6464;

	@OriginalMember(owner = "client!tk", name = "P", descriptor = "[Lclient!f;")
	public static Class8[] aClass8Array185;

	@OriginalMember(owner = "client!tk", name = "I", descriptor = "S")
	public static short aShort90 = 205;

	@OriginalMember(owner = "client!tk", name = "R", descriptor = "Z")
	public static boolean aBoolean560 = false;

	@OriginalMember(owner = "client!tk", name = "a", descriptor = "(IZIIZ)V")
	public static void method5031(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) boolean arg3) {
		Static18.aLong106 = 0L;
		@Pc(8) int local8 = Static391.method5269();
		if (arg0 == 3 || local8 == 3) {
			arg3 = true;
		}
		if (!Static121.aClass172_3.method5474()) {
			arg3 = true;
		}
		Static386.method5011(arg2, arg1, arg0, arg3, local8);
	}

	@OriginalMember(owner = "client!tk", name = "a", descriptor = "(IIBLclient!gm;ILclient!ln;Lclient!at;I)V")
	public static void method5032(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) Class93 arg2, @OriginalArg(4) int arg3, @OriginalArg(5) Class7_Sub2_Sub3_Sub2 arg4, @OriginalArg(6) Class7_Sub2_Sub3_Sub1 arg5, @OriginalArg(7) int arg6) {
		@Pc(11) Class3_Sub12 local11 = new Class3_Sub12();
		local11.anInt2117 = arg6 << 7;
		local11.anInt2125 = arg3 << 7;
		local11.anInt2113 = arg0;
		if (arg2 != null) {
			local11.aClass93_1 = arg2;
			@Pc(32) int local32 = arg2.anInt2762;
			@Pc(35) int local35 = arg2.anInt2782;
			if (arg1 == 1 || arg1 == 3) {
				local32 = arg2.anInt2782;
				local35 = arg2.anInt2762;
			}
			local11.anInt2127 = arg2.anInt2759;
			local11.anInt2126 = local35 + arg3 << 7;
			local11.anInt2123 = arg2.anInt2792;
			local11.anInt2128 = arg2.anInt2779 << 7;
			local11.anInt2118 = arg2.anInt2746;
			local11.anInt2115 = arg2.anInt2743;
			local11.anInt2114 = local32 + arg6 << 7;
			local11.anIntArray126 = arg2.anIntArray170;
			if (arg2.anIntArray171 != null) {
				local11.aBoolean168 = true;
				local11.method1644();
			}
			if (local11.anIntArray126 != null) {
				local11.anInt2112 = (int) (Math.random() * (double) (local11.anInt2123 - local11.anInt2115)) + local11.anInt2115;
			}
			Static17.aClass243_1.method5198(local11);
		} else if (arg5 != null) {
			local11.aClass7_Sub2_Sub3_Sub1_1 = arg5;
			@Pc(175) Class47 local175 = arg5.aClass47_1;
			if (local175.anIntArray94 != null) {
				local11.aBoolean168 = true;
				local175 = local175.method1251(Static85.aClass49_1);
			}
			if (local175 != null) {
				local11.anInt2114 = local175.anInt1616 + arg6 << 7;
				local11.anInt2126 = local175.anInt1616 + arg3 << 7;
				local11.anInt2118 = Static265.method3845(arg5);
				local11.anInt2128 = local175.anInt1599 << 7;
				local11.anInt2127 = local175.anInt1605;
			}
			Static54.aClass243_11.method5198(local11);
		} else if (arg4 != null) {
			local11.aClass7_Sub2_Sub3_Sub2_1 = arg4;
			local11.anInt2114 = arg6 + arg4.method3499() << 7;
			local11.anInt2126 = arg3 + arg4.method3499() << 7;
			local11.anInt2118 = Static108.method1847(arg4);
			local11.anInt2128 = arg4.anInt4430 << 7;
			local11.anInt2127 = arg4.anInt4420;
			Static272.aClass11_36.method319(local11, (long) arg4.anInt4391);
			return;
		}
	}
}
