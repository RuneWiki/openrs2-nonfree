import java.awt.Canvas;
import java.awt.Color;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static164 {

	@OriginalMember(owner = "client!ii", name = "p", descriptor = "Ljava/lang/String;")
	public static String aString45;

	@OriginalMember(owner = "client!ii", name = "E", descriptor = "F")
	public static float aFloat143;

	@OriginalMember(owner = "client!ii", name = "i", descriptor = "[Ljava/awt/Color;")
	public static final Color[] aColorArray6 = new Color[] { new Color(9179409), new Color(16777215) };

	@OriginalMember(owner = "client!ii", name = "n", descriptor = "[Lclient!ri;")
	public static final Class30[] aClass30Array4 = new Class30[128];

	@OriginalMember(owner = "client!ii", name = "o", descriptor = "[[I")
	public static final int[][] anIntArrayArray37 = new int[][] { { 2, 4, 6, 0 }, { 0, 2, 3, 5, 6, 4 }, { 0, 1, 4, 5 }, { 4, 6, 0, 2 }, { 2, 4, 0 }, { 0, 2, 4 }, { 6, 0, 1, 2, 4, 5 }, { 0, 1, 2, 4, 6, 7 }, { 4, 7, 6, 0 }, { 0, 8, 6, 1, 9, 2, 9, 4 }, { 2, 9, 4, 0, 8, 6 }, { 2, 11, 3, 7, 10, 10, 6, 6 }, { 2, 4, 6, 0 } };

	@OriginalMember(owner = "client!ii", name = "w", descriptor = "F")
	public static float aFloat142 = 1024.0F;

	@OriginalMember(owner = "client!ii", name = "B", descriptor = "Lclient!bg;")
	public static final Class22 aClass22_204 = new Class22(57, 15);

	@OriginalMember(owner = "client!ii", name = "C", descriptor = "[I")
	public static final int[] anIntArray302 = new int[] { 28, 35, 40, 44 };

	@OriginalMember(owner = "client!ii", name = "a", descriptor = "(IIIIIIBIII)V")
	public static void method3579(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8) {
		if (arg4 == arg2 && arg8 == arg5 && arg7 == arg0 && arg6 == arg3) {
			Static200.method3167(arg1, arg6, arg8, arg0, arg4);
			return;
		}
		@Pc(36) int local36 = arg4;
		@Pc(38) int local38 = arg8;
		@Pc(42) int local42 = arg4 * 3;
		@Pc(46) int local46 = arg8 * 3;
		@Pc(50) int local50 = arg2 * 3;
		@Pc(54) int local54 = arg5 * 3;
		@Pc(58) int local58 = arg7 * 3;
		@Pc(62) int local62 = arg3 * 3;
		@Pc(71) int local71 = local50 + arg0 - local58 - arg4;
		@Pc(81) int local81 = arg6 + local54 - local62 - arg8;
		@Pc(91) int local91 = local42 + local58 - local50 - local50;
		@Pc(101) int local101 = local46 + local62 - local54 - local54;
		@Pc(106) int local106 = local50 - local42;
		@Pc(111) int local111 = local54 - local46;
		for (@Pc(113) int local113 = 128; local113 <= 4096; local113 += 128) {
			@Pc(121) int local121 = local113 * local113 >> 12;
			@Pc(127) int local127 = local121 * local113 >> 12;
			@Pc(131) int local131 = local71 * local127;
			@Pc(135) int local135 = local81 * local127;
			@Pc(139) int local139 = local91 * local121;
			@Pc(143) int local143 = local101 * local121;
			@Pc(147) int local147 = local113 * local106;
			@Pc(151) int local151 = local113 * local111;
			@Pc(162) int local162 = arg4 + (local139 + local131 + local147 >> 12);
			@Pc(173) int local173 = (local143 + local135 + local151 >> 12) + arg8;
			Static200.method3167(arg1, local173, local38, local162, local36);
			local36 = local162;
			local38 = local173;
		}
	}

	@OriginalMember(owner = "client!ii", name = "a", descriptor = "(IIIII)V")
	public static void method3580(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		if (Static354.anInt6186 <= arg3 - arg2 && arg2 + arg3 <= Static208.anInt2656 && Static376.anInt6287 <= arg0 - arg2 && arg0 + arg2 <= Static168.anInt3256) {
			Static169.method2755(arg3, arg2, arg0, arg1);
		} else {
			Static441.method5570(arg0, arg1, arg2, arg3);
		}
	}

	@OriginalMember(owner = "client!ii", name = "f", descriptor = "(I)V")
	public static void method3582() {
		if (Static334.anInt5766 == -1) {
			return;
		}
		@Pc(17) int local17 = Static420.aClass80_1.method2234();
		@Pc(23) int local23 = Static420.aClass80_1.method2230();
		@Pc(28) Class4_Sub5 local28 = (Class4_Sub5) Static413.aClass183_47.method4140();
		if (local28 != null) {
			local17 = local28.method518();
			local23 = local28.method519();
		}
		Static59.method988(0, 0, Static141.anInt2881, Static334.anInt5766, 0, 0, Static302.anInt5346, local23, local17);
		if (Static81.aClass247_2 != null) {
			Static308.method4154(local17, local23);
		}
	}

	@OriginalMember(owner = "client!ii", name = "a", descriptor = "(Ljava/awt/Canvas;I)Lclient!kd;")
	public static Class4_Sub22 method3584(@OriginalArg(0) Canvas arg0) {
		try {
			@Pc(6) Class local6 = Class.forName("Class4_Sub22_Sub1");
			@Pc(10) Class4_Sub22 local10 = (Class4_Sub22) local6.getDeclaredConstructor().newInstance();
			local10.method4606(arg0);
			return local10;
		} catch (@Pc(22) Throwable local22) {
			@Pc(26) Class4_Sub22_Sub2 local26 = new Class4_Sub22_Sub2();
			local26.method4606(arg0);
			return local26;
		}
	}

	@OriginalMember(owner = "client!ii", name = "a", descriptor = "(ZII)V")
	public static void method3585(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(8) Class4_Sub1_Sub11 local8 = Static405.method5222(arg1, 14);
		local8.method2604();
		local8.anInt3083 = arg0;
	}
}
