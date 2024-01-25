import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static454 {

	@OriginalMember(owner = "client!wu", name = "o", descriptor = "Z")
	public static boolean aBoolean658 = false;

	@OriginalMember(owner = "client!wu", name = "x", descriptor = "[I")
	public static final int[] anIntArray534 = new int[1000];

	@OriginalMember(owner = "client!wu", name = "a", descriptor = "(IIIIIIII)V")
	public static void method5981(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		if (arg0 == arg4) {
			Static88.method1665(arg5, arg4, arg3, arg6, arg1, arg2);
		} else if (Static452.anInt7626 <= arg3 - arg4 && arg4 + arg3 <= Static82.anInt3956 && Static341.anInt5789 <= arg1 - arg0 && Static309.anInt5495 >= arg0 + arg1) {
			Static282.method3513(arg4, arg5, arg3, arg6, arg0, arg2, arg1);
		} else {
			Static298.method4484(arg4, arg6, arg0, arg2, arg5, arg1, arg3);
		}
	}

	@OriginalMember(owner = "client!wu", name = "a", descriptor = "(Lclient!qf;III)V")
	public static void method5983(@OriginalArg(0) Class34 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(7) long local7 = Static24.aLongArrayArrayArray1[arg1][arg2][arg3];
		@Pc(9) long local9 = 0L;
		arg0.anInt1154 = 0;
		@Pc(21) int local21;
		while (local9 <= 48L) {
			local21 = (int) (local7 >> (int) local9 & 0xFFFFL);
			if (local21 <= 0) {
				break;
			}
			arg0.aClass3_Sub8Array2[arg0.anInt1154++] = Static375.aClass191Array2[local21 - 1].aClass3_Sub8_2;
			local9 += 16L;
		}
		for (local21 = arg0.anInt1154; local21 < 4; local21++) {
			arg0.aClass3_Sub8Array2[local21] = null;
		}
	}

	@OriginalMember(owner = "client!wu", name = "e", descriptor = "(I)V")
	public static void method5988() {
		Static257.method3784(Static374.aClass20_Sub1_1.aBoolean196);
		Static388.aClass3_Sub5_Sub4_1 = new Class3_Sub5_Sub4();
		Static388.aClass3_Sub5_Sub4_1.method5124();
		Static47.aClass16_2 = Static76.method1507(22050, Static66.aClass143_2, 0, Static392.aCanvas6);
		Static47.aClass16_2.method4113(Static388.aClass3_Sub5_Sub4_1);
		Static279.method3495(Static388.aClass3_Sub5_Sub4_1, Static69.aClass32_30, Static316.aClass32_71, Static9.aClass32_3);
		Static42.aClass16_1 = Static76.method1507(2048, Static66.aClass143_2, 1, Static392.aCanvas6);
		Static331.aClass3_Sub5_Sub1_42 = new Class3_Sub5_Sub1();
		Static42.aClass16_1.method4113(Static331.aClass3_Sub5_Sub1_42);
		Static262.aClass174_1 = new Class174(22050, Static232.anInt4442);
		Static267.anInt5033 = Static149.aClass32_43.method807("scape main");
	}

	@OriginalMember(owner = "client!wu", name = "a", descriptor = "(II)V")
	public static void method5989(@OriginalArg(0) int arg0) {
		@Pc(8) Class3_Sub4_Sub12 local8 = Static393.method5080(arg0, 12);
		local8.method3244();
	}
}
