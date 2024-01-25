import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static495 {

	@OriginalMember(owner = "client!to", name = "d", descriptor = "I")
	public static int anInt8251;

	@OriginalMember(owner = "client!to", name = "t", descriptor = "I")
	public static int anInt8262;

	@OriginalMember(owner = "client!to", name = "x", descriptor = "[F")
	public static final float[] aFloatArray51 = new float[16];

	@OriginalMember(owner = "client!to", name = "a", descriptor = "(IIIIIZI)V")
	public static void method6814(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) boolean arg5) {
		Static430.anInt5650 = arg1;
		Static159.anInt2791 = arg4;
		Static65.anInt1116 = arg0;
		Static168.anInt3051 = arg2;
		Static190.anInt4029 = arg3;
		if (arg5 && Static65.anInt1116 >= 100) {
			Static220.anInt3753 = Static190.anInt4029 * 512 + 256;
			Static388.anInt6921 = Static159.anInt2791 * 512 + 256;
			Static33.anInt568 = Static490.method6768(Static388.anInt6921, Static282.anInt4677, Static220.anInt3753) - Static168.anInt3051;
		}
		Static354.anInt6233 = 2;
	}

	@OriginalMember(owner = "client!to", name = "a", descriptor = "(I)V")
	public static void method6815() {
		for (@Pc(15) Class6_Sub1_Sub3 local15 = (Class6_Sub1_Sub3) Static475.aClass275_170.method6366(); local15 != null; local15 = (Class6_Sub1_Sub3) Static475.aClass275_170.method6364()) {
			@Pc(20) Class29_Sub2_Sub4 local20 = local15.aClass29_Sub2_Sub4_1;
			if (Static358.anInt6263 > local20.anInt7983) {
				local15.method7849();
				local20.method6607();
			} else if (local20.anInt8002 <= Static358.anInt6263) {
				if (local20.anInt7987 > 0) {
					@Pc(53) Class6_Sub28 local53 = (Class6_Sub28) Static31.aClass212_1.method5106((long) (local20.anInt7987 - 1));
					if (local53 != null) {
						@Pc(58) Class29_Sub2_Sub1_Sub1 local58 = local53.aClass29_Sub2_Sub1_Sub1_2;
						if (local58.anInt9222 >= 0 && local58.anInt9222 < Static301.anInt4912 * 512 && local58.anInt9218 >= 0 && local58.anInt9218 < Static473.anInt7969 * 512) {
							local20.method6608(local58.anInt9218, Static490.method6768(local58.anInt9222, local20.aByte103, local58.anInt9218) - local20.anInt8003, Static358.anInt6263, local58.anInt9222);
						}
					}
				}
				if (local20.anInt7987 < 0) {
					@Pc(112) int local112 = -local20.anInt7987 - 1;
					@Pc(117) Class29_Sub2_Sub1_Sub2 local117;
					if (local112 == Static44.anInt711) {
						local117 = Static426.aClass29_Sub2_Sub1_Sub2_2;
					} else {
						local117 = Static346.aClass29_Sub2_Sub1_Sub2Array1[local112];
					}
					if (local117 != null && local117.anInt9222 >= 0 && local117.anInt9222 < Static301.anInt4912 * 512 && local117.anInt9218 >= 0 && Static473.anInt7969 * 512 > local117.anInt9218) {
						local20.method6608(local117.anInt9218, Static490.method6768(local117.anInt9222, local20.aByte103, local117.anInt9218) - local20.anInt8003, Static358.anInt6263, local117.anInt9222);
					}
				}
				local20.method6606(Static267.anInt4424);
				Static280.method3996(local20, true);
			}
		}
	}

	@OriginalMember(owner = "client!to", name = "a", descriptor = "(BI)I")
	public static int method6817(@OriginalArg(1) int arg0) {
		return arg0 >>> 7;
	}

	@OriginalMember(owner = "client!to", name = "b", descriptor = "(B)V")
	public static void method6819() {
		if (Static355.aBoolean428) {
			return;
		}
		Static355.aBoolean428 = true;
		if (Static480.aClass6_Sub37_Sub1_1.aBoolean412) {
			Static399.aFloat167 = (int) Static399.aFloat167 + 191 & 0xFFFFFF80;
		} else {
			Static274.aFloat47 += (24.0F - Static274.aFloat47) / 2.0F;
		}
		Static244.aBoolean263 = true;
	}

	@OriginalMember(owner = "client!to", name = "a", descriptor = "(JJ)J")
	public static long method6826(@OriginalArg(0) long arg0, @OriginalArg(1) long arg1) {
		return arg0 & arg1;
	}
}
