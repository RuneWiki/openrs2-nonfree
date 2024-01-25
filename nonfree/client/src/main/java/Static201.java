import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static201 {

	@OriginalMember(owner = "client!js", name = "c", descriptor = "I")
	public static int anInt3586 = -1;

	@OriginalMember(owner = "client!js", name = "e", descriptor = "[I")
	public static final int[] anIntArray226 = new int[100];

	@OriginalMember(owner = "client!js", name = "i", descriptor = "I")
	public static int anInt3591 = 0;

	@OriginalMember(owner = "client!js", name = "a", descriptor = "(ILclient!ub;)I")
	public static int method3082(@OriginalArg(1) Class1_Sub2_Sub6_Sub1 arg0) {
		@Pc(8) Class158 local8 = arg0.aClass158_1;
		if (local8.anIntArray294 != null) {
			local8 = local8.method3705(Static119.aClass47_1);
			if (local8 == null) {
				return -1;
			}
		}
		@Pc(28) int local28 = local8.anInt4440;
		@Pc(32) Class142 local32 = arg0.method6189();
		if (arg0.aBoolean507) {
			local28 = local8.anInt4453;
		} else if (arg0.anInt7586 == local32.anInt4153 || local32.anInt4182 == arg0.anInt7586 || local32.anInt4157 == arg0.anInt7586 || arg0.anInt7586 == local32.anInt4191) {
			local28 = local8.anInt4472;
		} else if (local32.anInt4175 == arg0.anInt7586 || arg0.anInt7586 == local32.anInt4176 || arg0.anInt7586 == local32.anInt4181 || local32.anInt4195 == arg0.anInt7586) {
			local28 = local8.anInt4468;
		}
		return local28;
	}

	@OriginalMember(owner = "client!js", name = "a", descriptor = "(III)I")
	public static int method3083(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(40) int local40 = Static269.method2903(arg0 - 1, arg1 + -1) + Static269.method2903(arg0 - 1, arg1 - -1) + Static269.method2903(arg0 + 1, arg1 + -1) + Static269.method2903(arg0 - -1, arg1 + 1);
		@Pc(69) int local69 = Static269.method2903(arg0, arg1 - 1) + Static269.method2903(arg0, arg1 + 1) + Static269.method2903(arg0 - 1, arg1) + Static269.method2903(arg0 + 1, arg1);
		@Pc(74) int local74 = Static269.method2903(arg0, arg1);
		return local74 / 4 + local69 / 8 + local40 / 16;
	}

	@OriginalMember(owner = "client!js", name = "a", descriptor = "([IIIBI)V")
	public static void method3084(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3) {
		arg1--;
		@Pc(7) int local7 = arg2 - 1;
		@Pc(11) int local11 = local7 - 7;
		while (local11 > arg1) {
			@Pc(20) int local20 = arg1 + 1;
			arg0[local20] = arg3;
			@Pc(25) int local25 = local20 + 1;
			arg0[local25] = arg3;
			@Pc(30) int local30 = local25 + 1;
			arg0[local30] = arg3;
			@Pc(35) int local35 = local30 + 1;
			arg0[local35] = arg3;
			@Pc(40) int local40 = local35 + 1;
			arg0[local40] = arg3;
			@Pc(45) int local45 = local40 + 1;
			arg0[local45] = arg3;
			@Pc(50) int local50 = local45 + 1;
			arg0[local50] = arg3;
			arg1 = local50 + 1;
			arg0[arg1] = arg3;
		}
		while (local7 > arg1) {
			arg1++;
			arg0[arg1] = arg3;
		}
	}

	@OriginalMember(owner = "client!js", name = "a", descriptor = "(IIB)Z")
	public static boolean method3086(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return (arg1 & 0x10) != 0;
	}

	@OriginalMember(owner = "client!js", name = "a", descriptor = "(I[B)[B")
	public static byte[] method3087(@OriginalArg(1) byte[] arg0) {
		@Pc(8) Class3_Sub25 local8 = new Class3_Sub25(arg0);
		@Pc(12) int local12 = local8.method4096();
		@Pc(24) int local24 = local8.method4108();
		if (local24 < 0 || Static319.anInt5384 != 0 && local24 > Static319.anInt5384) {
			throw new RuntimeException();
		} else if (local12 == 0) {
			@Pc(90) byte[] local90 = new byte[local24];
			local8.method4118(local90, local24);
			return local90;
		} else {
			@Pc(48) int local48 = local8.method4108();
			if (local48 < 0 || Static319.anInt5384 != 0 && local48 > Static319.anInt5384) {
				throw new RuntimeException();
			}
			@Pc(68) byte[] local68 = new byte[local48];
			if (local12 == 1) {
				Static206.method3130(local68, local48, arg0, local24);
			} else {
				Static428.aClass84_1.method2034(local8, local68);
			}
			return local68;
		}
	}

	@OriginalMember(owner = "client!js", name = "a", descriptor = "(BD)V")
	public static void method3088(@OriginalArg(1) double arg0) {
		if (arg0 == Static107.aDouble9) {
			return;
		}
		for (@Pc(11) int local11 = 0; local11 < 256; local11++) {
			@Pc(23) int local23 = (int) (Math.pow((double) local11 / 255.0D, arg0) * 255.0D);
			Static366.anIntArray381[local11] = local23 <= 255 ? local23 : 255;
		}
		Static107.aDouble9 = arg0;
	}
}
