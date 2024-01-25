import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static319 {

	@OriginalMember(owner = "client!uh", name = "D", descriptor = "I")
	public static int anInt6099;

	@OriginalMember(owner = "client!uh", name = "K", descriptor = "Z")
	public static boolean aBoolean444;

	@OriginalMember(owner = "client!uh", name = "E", descriptor = "[I")
	public static final int[] anIntArray773 = new int[4];

	@OriginalMember(owner = "client!uh", name = "F", descriptor = "[I")
	public static final int[] anIntArray774 = new int[] { 3, 0, -1, 0, 0, 0, 2, 6, 15, 0, 9, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 7, 0, 12, -2, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, -2, 0, 0, 0, 0, 0, 0, 6, 0, -1, 0, 8, 8, 0, 10, 0, 0, 0, 0, 0, 0, 5, 0, 3, 0, 0, 0, 0, 0, 3, 2, 0, 0, 0, 8, -1, 0, 0, 0, -1, 0, 0, 0, 0, 0, 4, 0, 0, 0, 0, 8, -2, 0, 0, 8, 8, 12, 0, 14, 4, 0, 0, 0, -1, 0, 0, 0, 0, 8, 0, 6, 0, 4, -1, 5, 0, 4, 0, 0, 0, 2, 15, 14, 0, -2, 3, 1, 0, 0, 1, 8, 0, -2, 6, 0, 5, 6, 0, 0, 0, 7, -1, 0, 17, 0, 0, 6, 0, 0, 12, 0, 0, 0, -1, 6, 0, 0, -2, 0, -1, 0, 0, 0, 0, -2, -2, -1, 0, 0, 0, 0, -1, -2, 0, 0, 0, -1, 0, 3, 0, 6, 8, 12, 1, -2, 0, 0, 0, 2, 10, -2, 3, 2, 0, 6, 0, 0, 12, 6, -2, 5, -1, 0, 10, 0, -1, 0, -1, 0, 0, 0, 0, 0, 7, 0, 7, 2, 20, -2, 0, -1, 0, 0, 0, 0, 28, 3, 0, -1, 0, 0, 6, 0, 10, 0, 0, 2, 0, 0, 2, 2, 0, 0, 0, 0, 8, 0, 0, 3, -1, 6, 0, 0, 0, 0, 11, 0 };

	@OriginalMember(owner = "client!uh", name = "I", descriptor = "Lclient!nq;")
	public static Class146 aClass146_1 = new Class146(8);

	@OriginalMember(owner = "client!uh", name = "a", descriptor = "(Ljava/lang/String;IZII)V")
	public static void method5152(@OriginalArg(0) String arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		@Pc(8) Class26 local8 = Static23.method4815(arg2, arg1);
		if (local8 == null) {
			return;
		}
		if (local8.anObjectArray20 != null) {
			@Pc(18) Class7_Sub25 local18 = new Class7_Sub25();
			local18.anInt3899 = arg3;
			local18.aString252 = arg0;
			local18.aClass26_22 = local8;
			local18.anObjectArray34 = local8.anObjectArray20;
			Static83.method1766(local18);
		}
		@Pc(35) boolean local35 = true;
		if (local8.anInt557 > 0) {
			local35 = Static145.method2911(local8);
		}
		if (!local35 || !Static45.method1034(local8).method3755(arg3 - 1)) {
			return;
		}
		if (arg3 == 1) {
			Static29.aClass7_Sub3_Sub2_1.method2799(28);
			Static29.aClass7_Sub3_Sub2_1.method2765(arg1);
			Static29.aClass7_Sub3_Sub2_1.method2788(arg2);
		}
		if (arg3 == 2) {
			Static29.aClass7_Sub3_Sub2_1.method2799(78);
			Static29.aClass7_Sub3_Sub2_1.method2765(arg1);
			Static29.aClass7_Sub3_Sub2_1.method2788(arg2);
		}
		if (arg3 == 3) {
			Static29.aClass7_Sub3_Sub2_1.method2799(129);
			Static29.aClass7_Sub3_Sub2_1.method2765(arg1);
			Static29.aClass7_Sub3_Sub2_1.method2788(arg2);
		}
		if (arg3 == 4) {
			Static29.aClass7_Sub3_Sub2_1.method2799(238);
			Static29.aClass7_Sub3_Sub2_1.method2765(arg1);
			Static29.aClass7_Sub3_Sub2_1.method2788(arg2);
		}
		if (arg3 == 5) {
			Static29.aClass7_Sub3_Sub2_1.method2799(124);
			Static29.aClass7_Sub3_Sub2_1.method2765(arg1);
			Static29.aClass7_Sub3_Sub2_1.method2788(arg2);
		}
		if (arg3 == 6) {
			Static29.aClass7_Sub3_Sub2_1.method2799(101);
			Static29.aClass7_Sub3_Sub2_1.method2765(arg1);
			Static29.aClass7_Sub3_Sub2_1.method2788(arg2);
		}
		if (arg3 == 7) {
			Static29.aClass7_Sub3_Sub2_1.method2799(83);
			Static29.aClass7_Sub3_Sub2_1.method2765(arg1);
			Static29.aClass7_Sub3_Sub2_1.method2788(arg2);
		}
		if (arg3 == 8) {
			Static29.aClass7_Sub3_Sub2_1.method2799(114);
			Static29.aClass7_Sub3_Sub2_1.method2765(arg1);
			Static29.aClass7_Sub3_Sub2_1.method2788(arg2);
		}
		if (arg3 == 9) {
			Static29.aClass7_Sub3_Sub2_1.method2799(104);
			Static29.aClass7_Sub3_Sub2_1.method2765(arg1);
			Static29.aClass7_Sub3_Sub2_1.method2788(arg2);
		}
		if (arg3 == 10) {
			Static29.aClass7_Sub3_Sub2_1.method2799(251);
			Static29.aClass7_Sub3_Sub2_1.method2765(arg1);
			Static29.aClass7_Sub3_Sub2_1.method2788(arg2);
		}
	}

	@OriginalMember(owner = "client!uh", name = "b", descriptor = "(Z)V")
	public static void method5153() {
		@Pc(1) Class103 local1 = Static251.aClass103_66;
		synchronized (Static251.aClass103_66) {
			Static251.aClass103_66.method2678();
		}
	}

	@OriginalMember(owner = "client!uh", name = "a", descriptor = "(BZ)V")
	public static void method5154(@OriginalArg(1) boolean arg0) {
		if (arg0 && Static306.aClass7_Sub1_Sub10_2 != null) {
			Static133.anInt2882 = Static306.aClass7_Sub1_Sub10_2.anInt2515;
		} else {
			Static133.anInt2882 = -1;
		}
		Static306.aClass7_Sub1_Sub10_2 = null;
		Static339.anInt6444 = 0;
		Static10.aClass74_2 = null;
		Static116.aClass26_18 = null;
		Static306.method3071();
		Static306.aClass74_23.method1803();
		Static354.aClass4_10 = null;
		Static248.aClass4_7 = null;
		Static12.aClass4_3 = null;
		Static168.aClass52_18 = null;
		Static97.aClass4_4 = null;
		Static211.aClass4_5 = null;
		Static142.anInt3109 = -1;
		Static334.aClass4_9 = null;
		Static267.aClass4_8 = null;
		Static306.aClass134_2 = null;
		Static280.aClass4_6 = null;
		Static23.anInt5708 = -1;
		Static211.method3759();
		Static67.aClass166_2 = null;
		Static66.method1337(128, 64);
		Static60.method1209(64, 64);
		Static205.method3646(64);
		Static193.method3464(64);
	}

	@OriginalMember(owner = "client!uh", name = "a", descriptor = "(IIB)I")
	public static int method5155(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(16) int local16 = arg1 - 1 & arg0 >> 31;
		return local16 + (arg0 + (arg0 >>> 31)) % arg1;
	}
}
