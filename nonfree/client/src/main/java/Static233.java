import java.awt.Color;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static233 {

	@OriginalMember(owner = "client!lk", name = "v", descriptor = "Lclient!f;")
	public static Class22 aClass22_10;

	@OriginalMember(owner = "client!lk", name = "r", descriptor = "Lclient!hb;")
	public static final Class92 aClass92_145 = new Class92(73, 15);

	@OriginalMember(owner = "client!lk", name = "w", descriptor = "[S")
	public static final short[] aShortArray53 = new short[] { 960, 957, -21568, -21571, 22464 };

	@OriginalMember(owner = "client!lk", name = "x", descriptor = "[S")
	public static final short[] aShortArray54 = new short[] { 6798, 8741, 25238, 4626, 4550 };

	@OriginalMember(owner = "client!lk", name = "y", descriptor = "[Ljava/awt/Color;")
	public static final Color[] aColorArray2 = new Color[] { new Color(9179409), new Color(3289650) };

	@OriginalMember(owner = "client!lk", name = "z", descriptor = "[I")
	public static final int[] anIntArray352 = new int[] { 0, 4, 3, 3, 1, 1, 3, 5, 1, 5, 3, 6, 4 };

	@OriginalMember(owner = "client!lk", name = "A", descriptor = "I")
	public static int anInt4493 = 0;

	@OriginalMember(owner = "client!lk", name = "a", descriptor = "(IFIFF)F")
	public static float method3660(@OriginalArg(0) int arg0, @OriginalArg(1) float arg1, @OriginalArg(3) float arg2, @OriginalArg(4) float arg3) {
		@Pc(7) float[] local7 = Static160.aFloatArrayArray4[arg0];
		return arg1 * local7[2] + arg2 * local7[1] + local7[0] * arg3;
	}

	@OriginalMember(owner = "client!lk", name = "a", descriptor = "(IZIIIII)I")
	public static int method3661(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		@Pc(3) int local3 = arg5 & 0x3;
		if ((arg4 & 0x1) == 1) {
			@Pc(10) int local10 = arg1;
			arg1 = arg3;
			arg3 = local10;
		}
		if (local3 == 0) {
			return arg0;
		} else if (local3 == 1) {
			return 1 + 7 - arg1 - arg2;
		} else if (local3 == 2) {
			return 1 + 7 - arg3 - arg0;
		} else {
			return arg2;
		}
	}

	@OriginalMember(owner = "client!lk", name = "a", descriptor = "(ILclient!wt;)V")
	public static void method3664(@OriginalArg(1) Class3_Sub2_Sub2 arg0) {
		@Pc(10) int local10 = 0;
		arg0.method6056();
		@Pc(20) int local20;
		@Pc(47) int local47;
		for (@Pc(15) int local15 = 0; local15 < Static207.anInt4136; local15++) {
			local20 = Static322.anIntArray436[local15];
			if ((Static206.aByteArray45[local20] & 0x1) == 0) {
				if (local10 > 0) {
					Static206.aByteArray45[local20] = (byte) (Static206.aByteArray45[local20] | 0x2);
					local10--;
				} else {
					local47 = arg0.method6057(1);
					if (local47 == 0) {
						local10 = Static266.method4000(arg0);
						Static206.aByteArray45[local20] = (byte) (Static206.aByteArray45[local20] | 0x2);
					} else {
						Static329.method4787(arg0, local20);
					}
				}
			}
		}
		arg0.method6059();
		if (local10 != 0) {
			throw new RuntimeException("nsn0");
		}
		arg0.method6056();
		@Pc(128) int local128;
		for (local20 = 0; local20 < Static207.anInt4136; local20++) {
			local47 = Static322.anIntArray436[local20];
			if ((Static206.aByteArray45[local47] & 0x1) != 0) {
				if (local10 > 0) {
					Static206.aByteArray45[local47] = (byte) (Static206.aByteArray45[local47] | 0x2);
					local10--;
				} else {
					local128 = arg0.method6057(1);
					if (local128 == 0) {
						local10 = Static266.method4000(arg0);
						Static206.aByteArray45[local47] = (byte) (Static206.aByteArray45[local47] | 0x2);
					} else {
						Static329.method4787(arg0, local47);
					}
				}
			}
		}
		arg0.method6059();
		if (local10 != 0) {
			throw new RuntimeException("nsn1");
		}
		arg0.method6056();
		@Pc(209) int local209;
		for (local47 = 0; local47 < Static211.anInt4169; local47++) {
			local128 = Static224.anIntArray327[local47];
			if ((Static206.aByteArray45[local128] & 0x1) != 0) {
				if (local10 > 0) {
					Static206.aByteArray45[local128] = (byte) (Static206.aByteArray45[local128] | 0x2);
					local10--;
				} else {
					local209 = arg0.method6057(1);
					if (local209 == 0) {
						local10 = Static266.method4000(arg0);
						Static206.aByteArray45[local128] = (byte) (Static206.aByteArray45[local128] | 0x2);
					} else if (Static301.method4449(local128, arg0)) {
						Static206.aByteArray45[local128] = (byte) (Static206.aByteArray45[local128] | 0x2);
					}
				}
			}
		}
		arg0.method6059();
		if (local10 != 0) {
			throw new RuntimeException("nsn2");
		}
		arg0.method6056();
		for (local128 = 0; local128 < Static211.anInt4169; local128++) {
			local209 = Static224.anIntArray327[local128];
			if ((Static206.aByteArray45[local209] & 0x1) == 0) {
				if (local10 > 0) {
					local10--;
					Static206.aByteArray45[local209] = (byte) (Static206.aByteArray45[local209] | 0x2);
				} else {
					@Pc(294) int local294 = arg0.method6057(1);
					if (local294 == 0) {
						local10 = Static266.method4000(arg0);
						Static206.aByteArray45[local209] = (byte) (Static206.aByteArray45[local209] | 0x2);
					} else if (Static301.method4449(local209, arg0)) {
						Static206.aByteArray45[local209] = (byte) (Static206.aByteArray45[local209] | 0x2);
					}
				}
			}
		}
		arg0.method6059();
		if (local10 != 0) {
			throw new RuntimeException("nsn3");
		}
		Static211.anInt4169 = 0;
		Static207.anInt4136 = 0;
		for (local209 = 1; local209 < 2048; local209++) {
			Static206.aByteArray45[local209] = (byte) (Static206.aByteArray45[local209] >> 1);
			@Pc(360) Class1_Sub3_Sub3_Sub1 local360 = Static308.aClass1_Sub3_Sub3_Sub1Array1[local209];
			if (local360 == null) {
				Static224.anIntArray327[Static211.anInt4169++] = local209;
			} else {
				Static322.anIntArray436[Static207.anInt4136++] = local209;
			}
		}
	}
}
