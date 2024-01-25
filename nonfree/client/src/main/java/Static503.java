import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static503 {

	@OriginalMember(owner = "client!u", name = "A", descriptor = "I")
	public static int anInt8950;

	@OriginalMember(owner = "client!u", name = "D", descriptor = "Lclient!jo;")
	public static Class168 aClass168_115;

	@OriginalMember(owner = "client!u", name = "F", descriptor = "J")
	public static long aLong217;

	@OriginalMember(owner = "client!u", name = "G", descriptor = "I")
	public static int anInt8951;

	@OriginalMember(owner = "client!u", name = "o", descriptor = "Lclient!cea;")
	public static final Class50 aClass50_4 = new Class50();

	@OriginalMember(owner = "client!u", name = "B", descriptor = "Lclient!vw;")
	public static final Class340 aClass340_13 = new Class340();

	@OriginalMember(owner = "client!u", name = "C", descriptor = "[F")
	public static final float[] aFloatArray64 = new float[16];

	@OriginalMember(owner = "client!u", name = "E", descriptor = "Lclient!kfa;")
	public static final Class181 aClass181_100 = new Class181(23, 3);

	@OriginalMember(owner = "client!u", name = "a", descriptor = "(IZI)V")
	public static void method7506(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		if (Static31.anInt1033 == 1) {
			Static204.method3798(Static410.aClass6_Sub42_3, arg0, arg1);
		} else if (Static31.anInt1033 == 2) {
			Static529.method7713(arg1, arg0);
		}
		Static410.aClass6_Sub42_3 = null;
		Static31.anInt1033 = 0;
	}

	@OriginalMember(owner = "client!u", name = "a", descriptor = "(IBII)V")
	public static void method7507(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		if (arg0 == 1007) {
			Static89.method1989(Static126.aClass26_2, arg2, arg1);
		} else if (arg0 == 1001) {
			Static89.method1989(Static351.aClass26_7, arg2, arg1);
		} else if (arg0 == 1010) {
			Static89.method1989(Static318.aClass26_5, arg2, arg1);
		} else if (arg0 == 1006) {
			Static89.method1989(Static433.aClass26_8, arg2, arg1);
		} else if (arg0 == 1003) {
			Static89.method1989(Static228.aClass26_3, arg2, arg1);
			return;
		}
	}

	@OriginalMember(owner = "client!u", name = "a", descriptor = "(IILclient!bfa;IIILclient!pi;Lclient!ag;)V")
	public static void method7509(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class31 arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) Class11_Sub1_Sub1_Sub2 arg5, @OriginalArg(7) Class11_Sub1_Sub1_Sub1 arg6) {
		@Pc(12) Class6_Sub2 local12 = new Class6_Sub2();
		local12.anInt564 = arg4;
		local12.anInt561 = arg1 << 9;
		local12.anInt566 = arg3 << 9;
		if (arg2 != null) {
			local12.aClass31_1 = arg2;
			@Pc(33) int local33 = arg2.anInt1109;
			@Pc(36) int local36 = arg2.anInt1058;
			if (arg0 == 1 || arg0 == 3) {
				local33 = arg2.anInt1058;
				local36 = arg2.anInt1109;
			}
			local12.anIntArray45 = arg2.anIntArray70;
			local12.anInt562 = arg1 + local36 << 9;
			local12.anInt555 = arg2.anInt1072;
			local12.anInt568 = arg2.anInt1075;
			local12.anInt565 = arg3 + local33 << 9;
			local12.anInt557 = arg2.anInt1087 << 9;
			local12.aBoolean34 = arg2.aBoolean89;
			local12.anInt556 = arg2.anInt1083;
			local12.anInt560 = arg2.anInt1105;
			local12.aBoolean33 = arg2.aBoolean88;
			if (arg2.anIntArray69 != null) {
				local12.aBoolean35 = true;
				local12.method636();
			}
			if (local12.anIntArray45 != null) {
				local12.anInt554 = (int) ((double) (local12.anInt560 - local12.anInt555) * Math.random()) + local12.anInt555;
			}
			Static284.aClass211_39.method5173(local12);
		} else if (arg6 != null) {
			local12.aClass11_Sub1_Sub1_Sub1_1 = arg6;
			@Pc(187) Class222 local187 = arg6.aClass222_1;
			if (local187.anIntArray464 != null) {
				local12.aBoolean35 = true;
				local187 = local187.method5329(Static435.aClass234_1);
			}
			if (local187 != null) {
				local12.anInt562 = arg1 + local187.anInt6248 << 9;
				local12.anInt565 = arg3 + local187.anInt6248 << 9;
				local12.anInt568 = Static421.method6532(arg6);
				local12.anInt556 = local187.anInt6235;
				local12.aBoolean33 = local187.aBoolean467;
				local12.anInt557 = local187.anInt6233 << 9;
			}
			Static299.aClass211_43.method5173(local12);
		} else if (arg5 != null) {
			local12.aClass11_Sub1_Sub1_Sub2_1 = arg5;
			local12.anInt565 = arg3 + arg5.method6212() << 9;
			local12.anInt562 = arg1 + arg5.method6212() << 9;
			local12.anInt568 = Static325.method5248(arg5);
			local12.anInt556 = arg5.anInt7436;
			local12.anInt557 = arg5.anInt7439 << 9;
			local12.aBoolean33 = arg5.aBoolean547;
			Static580.aClass305_42.method7448((long) arg5.anInt7392, local12);
			return;
		}
	}
}
