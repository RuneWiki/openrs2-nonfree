import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static46 {

	@OriginalMember(owner = "client!bj", name = "i", descriptor = "I")
	public static int anInt1116;

	@OriginalMember(owner = "client!bj", name = "q", descriptor = "F")
	public static float aFloat30;

	@OriginalMember(owner = "client!bj", name = "r", descriptor = "[[Lclient!mea;")
	public static Class230[][] aClass230ArrayArray1;

	@OriginalMember(owner = "client!bj", name = "m", descriptor = "I")
	public static int anInt1120 = 0;

	@OriginalMember(owner = "client!bj", name = "n", descriptor = "Lclient!bu;")
	public static final Class44 aClass44_24 = new Class44(47, 7);

	@OriginalMember(owner = "client!bj", name = "u", descriptor = "Lclient!oo;")
	public static final Class264 aClass264_8 = new Class264(3000000, 200);

	@OriginalMember(owner = "client!bj", name = "v", descriptor = "I")
	public static final int anInt1125 = 2;

	@OriginalMember(owner = "client!bj", name = "w", descriptor = "[I")
	public static final int[] anIntArray85 = new int[8];

	@OriginalMember(owner = "client!bj", name = "a", descriptor = "(Lclient!ha;ZI)V")
	public static void method963(@OriginalArg(0) Class137 arg0, @OriginalArg(2) int arg1) {
		if (!Static12.aBoolean9 || !Static33.aBoolean71) {
			Static157.anInt3110 = 0;
			return;
		}
		if (Static222.aBoolean295) {
			Static545.aLong247 = Static247.aClass99_1.method5518();
		}
		Static508.anInt8976 = 0;
		Static333.anInt6303 = 0;
		Static338.anInt6354 = 0;
		@Pc(27) int[] local27 = arg0.Y();
		Static493.anInt8807 = (int) ((float) local27[3] / 3.0F);
		Static651.anInt10890 = (int) ((float) local27[2] / 3.0F);
		arg0.method7949(Static587.anIntArray795);
		if ((int) ((float) Static587.anIntArray795[0] / 3.0F) != Static429.anInt4560 || (int) ((float) Static587.anIntArray795[1] / 3.0F) != Static415.anInt7538) {
			Static429.anInt4560 = (int) ((float) Static587.anIntArray795[0] / 3.0F);
			Static415.anInt7538 = (int) ((float) Static587.anIntArray795[1] / 3.0F);
			Static283.anInt4862 = Static415.anInt7538 >> 1;
			Static104.anInt2176 = Static429.anInt4560 >> 1;
			Static643.anIntArray801 = new int[Static429.anInt4560 * Static415.anInt7538];
		}
		Static153.aClass26_2 = arg0.method7872();
		Static157.anInt3110 = 0;
		for (@Pc(113) int local113 = 0; local113 < Static275.anInt4779; local113++) {
			Static218.method3409(arg0, Static476.aClass296Array1[local113], arg1);
		}
		for (@Pc(128) int local128 = 0; local128 < Static54.anInt1357; local128++) {
			Static218.method3409(arg0, Static673.aClass296Array4[local128], arg1);
		}
		for (@Pc(147) int local147 = 0; local147 < Static297.anInt5234; local147++) {
			Static218.method3409(arg0, Static505.aClass296Array2[local147], arg1);
		}
		Static24.anInt440 = 0;
		if (Static157.anInt3110 > 0) {
			@Pc(174) int local174 = Static643.anIntArray801.length;
			@Pc(181) int local181 = local174 - local174 & 0x7;
			@Pc(183) int local183 = 0;
			while (local181 > local183) {
				Static643.anIntArray801[local183++] = Integer.MAX_VALUE;
				Static643.anIntArray801[local183++] = Integer.MAX_VALUE;
				Static643.anIntArray801[local183++] = Integer.MAX_VALUE;
				Static643.anIntArray801[local183++] = Integer.MAX_VALUE;
				Static643.anIntArray801[local183++] = Integer.MAX_VALUE;
				Static643.anIntArray801[local183++] = Integer.MAX_VALUE;
				Static643.anIntArray801[local183++] = Integer.MAX_VALUE;
				Static643.anIntArray801[local183++] = Integer.MAX_VALUE;
			}
			while (local174 > local183) {
				Static643.anIntArray801[local183++] = Integer.MAX_VALUE;
			}
			Static38.anInt993 = 1;
			for (@Pc(246) int local246 = 0; local246 < Static157.anInt3110; local246++) {
				@Pc(252) Class296 local252 = Static622.aClass296Array3[local246];
				Static556.method7808(local252.aShortArray135[0], local252.aShortArray135[3], local252.aShortArray134[3], local252.aShortArray134[1], local252.aShortArray135[1], local252.aShortArray133[0], local252.aShortArray134[0], local252.aShortArray133[1], local252.aShortArray133[3]);
				Static556.method7808(local252.aShortArray135[1], local252.aShortArray135[3], local252.aShortArray134[3], local252.aShortArray134[2], local252.aShortArray135[2], local252.aShortArray133[1], local252.aShortArray134[1], local252.aShortArray133[2], local252.aShortArray133[3]);
			}
			Static38.anInt993 = 2;
		}
		if (Static222.aBoolean295) {
			Static637.aLong290 = Static247.aClass99_1.method5518() - Static545.aLong247;
		}
	}

	@OriginalMember(owner = "client!bj", name = "a", descriptor = "(Lclient!eba;IIII)Z")
	public static boolean method966(@OriginalArg(0) Class12_Sub2_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		if (!Static12.aBoolean9 || !Static33.aBoolean71) {
			return false;
		} else if (Static24.anInt440 < 100) {
			return false;
		} else if (Static623.method8750(arg1, arg3, arg2)) {
			@Pc(28) int local28 = arg3 << Static579.anInt9935;
			@Pc(32) int local32 = arg1 << Static579.anInt9935;
			@Pc(47) int local47 = Static576.aClass51Array3[arg2].method7857(arg1, arg3) - 1;
			@Pc(54) int local54 = local47 + arg0.method9159();
			if (arg0.aShort94 == 1) {
				if (!Static8.method51(local54, Static222.anInt4166 + local32, local54, local32, local28, local28, local47, local32, local28)) {
					return false;
				} else if (Static8.method51(local54, local32 + Static222.anInt4166, local47, local32, local28, local28, local47, Static222.anInt4166 + local32, local28)) {
					Static338.anInt6354++;
					return true;
				} else {
					return false;
				}
			} else if (arg0.aShort94 == 2) {
				if (!Static8.method51(local54, Static222.anInt4166 + local32, local54, local32 + Static222.anInt4166, local28, local28 + Static222.anInt4166, local47, local32 + Static222.anInt4166, local28)) {
					return false;
				} else if (Static8.method51(local47, Static222.anInt4166 + local32, local54, local32 + Static222.anInt4166, local28, Static222.anInt4166 + local28, local47, local32 + Static222.anInt4166, Static222.anInt4166 + local28)) {
					Static338.anInt6354++;
					return true;
				} else {
					return false;
				}
			} else if (arg0.aShort94 == 4) {
				if (!Static8.method51(local54, Static222.anInt4166 + local32, local54, local32, Static222.anInt4166 + local28, Static222.anInt4166 + local28, local47, local32, Static222.anInt4166 + local28)) {
					return false;
				} else if (Static8.method51(local54, Static222.anInt4166 + local32, local47, local32, Static222.anInt4166 + local28, Static222.anInt4166 + local28, local47, Static222.anInt4166 + local32, Static222.anInt4166 + local28)) {
					Static338.anInt6354++;
					return true;
				} else {
					return false;
				}
			} else if (arg0.aShort94 == 8) {
				if (!Static8.method51(local54, local32, local54, local32, local28, local28 + Static222.anInt4166, local47, local32, local28)) {
					return false;
				} else if (Static8.method51(local47, local32, local54, local32, local28, local28 + Static222.anInt4166, local47, local32, local28 + Static222.anInt4166)) {
					Static338.anInt6354++;
					return true;
				} else {
					return false;
				}
			} else if (arg0.aShort94 == 16) {
				if (Static566.method8152(Static96.anInt2065, local47, local28, Static96.anInt2065, local32 + Static96.anInt2065, local54)) {
					Static338.anInt6354++;
					return true;
				} else {
					return false;
				}
			} else if (arg0.aShort94 == 32) {
				if (Static566.method8152(Static96.anInt2065, local47, Static96.anInt2065 + local28, Static96.anInt2065, local32 + Static96.anInt2065, local54)) {
					Static338.anInt6354++;
					return true;
				} else {
					return false;
				}
			} else if (arg0.aShort94 == 64) {
				if (Static566.method8152(Static96.anInt2065, local47, local28 + Static96.anInt2065, Static96.anInt2065, local32, local54)) {
					Static338.anInt6354++;
					return true;
				} else {
					return false;
				}
			} else if (arg0.aShort94 != 128) {
				return true;
			} else if (Static566.method8152(Static96.anInt2065, local47, local28, Static96.anInt2065, local32, local54)) {
				Static338.anInt6354++;
				return true;
			} else {
				return false;
			}
		} else {
			return false;
		}
	}
}
