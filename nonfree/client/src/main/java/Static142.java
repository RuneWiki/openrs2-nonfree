import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static142 {

	@OriginalMember(owner = "client!o", name = "bb", descriptor = "Z")
	public static boolean aBoolean143;

	@OriginalMember(owner = "client!o", name = "eb", descriptor = "I")
	public static int anInt3236;

	@OriginalMember(owner = "client!o", name = "fb", descriptor = "[[[B")
	public static byte[][][] aByteArrayArrayArray11;

	@OriginalMember(owner = "client!o", name = "Z", descriptor = "[I")
	public static int[] anIntArray534 = new int[5];

	@OriginalMember(owner = "client!o", name = "cb", descriptor = "I")
	public static int anInt3235 = 0;

	@OriginalMember(owner = "client!o", name = "db", descriptor = "Lclient!he;")
	public static Class44 aClass44_36 = new Class44();

	@OriginalMember(owner = "client!o", name = "gb", descriptor = "I")
	public static int anInt3237 = 0;

	@OriginalMember(owner = "client!o", name = "a", descriptor = "(IIIIIILclient!qf;IJ)Z")
	public static boolean method2534(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) Class5 arg6, @OriginalArg(8) long arg7) {
		if (arg6 == null) {
			return true;
		} else {
			@Pc(11) int local11 = arg1 * 128 + arg4 * 64;
			@Pc(19) int local19 = arg2 * 128 + arg5 * 64;
			return Static44.method588(arg0, arg1, arg2, arg4, arg5, local11, local19, arg3, arg6, 0, false, arg7);
		}
	}

	@OriginalMember(owner = "client!o", name = "a", descriptor = "(ILclient!ob;)V")
	public static void method2535(@OriginalArg(1) Class2_Sub25 arg0) {
		@Pc(5) long local5 = 0L;
		if (arg0.anInt3277 == 0) {
			local5 = Static105.method1814(arg0.anInt3269, arg0.anInt3279, arg0.anInt3270);
		}
		if (arg0.anInt3277 == 1) {
			local5 = Static161.method2902(arg0.anInt3269, arg0.anInt3279, arg0.anInt3270);
		}
		@Pc(33) int local33 = 0;
		if (arg0.anInt3277 == 2) {
			local5 = Static188.method3485(arg0.anInt3269, arg0.anInt3279, arg0.anInt3270);
		}
		@Pc(49) int local49 = 0;
		if (arg0.anInt3277 == 3) {
			local5 = Static144.method2568(arg0.anInt3269, arg0.anInt3279, arg0.anInt3270);
		}
		@Pc(63) int local63 = -1;
		if (local5 != 0L) {
			local63 = (int) (local5 >>> 32) & Integer.MAX_VALUE;
			local49 = (int) local5 >> 20 & 0x3;
			local33 = (int) local5 >> 14 & 0x1F;
		}
		arg0.anInt3274 = local33;
		arg0.anInt3278 = local63;
		arg0.anInt3275 = local49;
	}

	@OriginalMember(owner = "client!o", name = "c", descriptor = "(II)Lclient!pi;")
	public static Class2_Sub3_Sub24 method2536(@OriginalArg(0) int arg0) {
		@Pc(10) Class2_Sub3_Sub24 local10 = (Class2_Sub3_Sub24) Static41.aClass110_6.method3891((long) arg0);
		if (local10 != null) {
			return local10;
		}
		@Pc(28) byte[] local28 = Static72.aClass72_272.method3197(arg0, 5);
		local10 = new Class2_Sub3_Sub24();
		if (local28 != null) {
			local10.method2901(new Class2_Sub23(local28));
		}
		Static41.aClass110_6.method3894(local10, (long) arg0);
		return local10;
	}

	@OriginalMember(owner = "client!o", name = "a", descriptor = "(IIIZIIII)V")
	public static void method2537(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6) {
		if (arg2 < 1 || arg1 < 1 || arg2 > 102 || arg1 > 102) {
			return;
		}
		@Pc(40) int local40;
		if (!Static48.method633() && (Static133.aByteArrayArrayArray10[0][arg2][arg1] & 0x2) == 0) {
			local40 = arg6;
			if ((Static133.aByteArrayArrayArray10[arg6][arg2][arg1] & 0x8) != 0) {
				local40 = 0;
			}
			if (Static150.anInt3435 != local40) {
				return;
			}
		}
		local40 = arg6;
		if (arg6 < 3 && (Static133.aByteArrayArrayArray10[1][arg2][arg1] & 0x2) == 2) {
			local40 = arg6 + 1;
		}
		Static213.method1602(arg1, arg6, Static202.aClass90Array1[arg6], arg2, arg5, local40);
		if (arg0 < 0) {
			return;
		}
		@Pc(89) boolean local89 = Static112.aBoolean105;
		Static112.aBoolean105 = true;
		Static90.method1591(arg1, false, arg2, local40, arg0, arg4, Static202.aClass90Array1[arg6], arg6, arg3);
		Static112.aBoolean105 = local89;
		return;
	}

	@OriginalMember(owner = "client!o", name = "d", descriptor = "(II)I")
	public static int method2538(@OriginalArg(0) int arg0) {
		if (arg0 >= 97 && arg0 <= 122 || arg0 >= 224 && arg0 <= 254 && arg0 != 247) {
			return arg0 - 32;
		} else if (arg0 == 255) {
			return 159;
		} else if (arg0 == 156) {
			return 140;
		} else {
			return arg0;
		}
	}
}
