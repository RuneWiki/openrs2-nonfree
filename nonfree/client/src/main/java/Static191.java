import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static191 {

	@OriginalMember(owner = "client!t", name = "d", descriptor = "I")
	public static int anInt4119;

	@OriginalMember(owner = "client!t", name = "f", descriptor = "I")
	public static int anInt4121;

	@OriginalMember(owner = "client!t", name = "g", descriptor = "Lclient!sc;")
	public static Class102 aClass102_19;

	@OriginalMember(owner = "client!t", name = "k", descriptor = "J")
	public static long aLong142;

	@OriginalMember(owner = "client!t", name = "l", descriptor = "I")
	public static int anInt4125;

	@OriginalMember(owner = "client!t", name = "q", descriptor = "[[B")
	public static byte[][] aByteArrayArray12;

	@OriginalMember(owner = "client!t", name = "m", descriptor = "[Lclient!ib;")
	public static Class5_Sub1_Sub1[] aClass5_Sub1_Sub1Array1 = new Class5_Sub1_Sub1[2048];

	@OriginalMember(owner = "client!t", name = "o", descriptor = "[I")
	public static int[] anIntArray312 = new int[200];

	@OriginalMember(owner = "client!t", name = "r", descriptor = "Lclient!ia;")
	public static Class51 aClass51_1416 = Static64.method1101("Hierhin gehen");

	@OriginalMember(owner = "client!t", name = "a", descriptor = "(BLjava/lang/String;)Ljava/lang/Class;")
	public static Class method3193(@OriginalArg(1) String arg0) throws ClassNotFoundException {
		if (arg0.equals("B")) {
			return Byte.TYPE;
		} else if (arg0.equals("I")) {
			return Integer.TYPE;
		} else if (arg0.equals("S")) {
			return Short.TYPE;
		} else if (arg0.equals("J")) {
			return Long.TYPE;
		} else if (arg0.equals("Z")) {
			return Boolean.TYPE;
		} else if (arg0.equals("F")) {
			return Float.TYPE;
		} else if (arg0.equals("D")) {
			return Double.TYPE;
		} else if (arg0.equals("C")) {
			return Character.TYPE;
		} else {
			return Class.forName(arg0);
		}
	}

	@OriginalMember(owner = "client!t", name = "a", descriptor = "(BI)V")
	public static void method3194(@OriginalArg(1) int arg0) {
		if (arg0 == 37) {
			Static227.aDouble11 = 3.0D;
		} else if (arg0 == 50) {
			Static227.aDouble11 = 4.0D;
		} else if (arg0 == 75) {
			Static227.aDouble11 = 6.0D;
		} else {
			Static227.aDouble11 = 8.0D;
		}
		Static41.anInt977 = -1;
		Static41.anInt977 = -1;
	}

	@OriginalMember(owner = "client!t", name = "a", descriptor = "(IIIBIIII)V")
	public static void method3195(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(5) int arg3, @OriginalArg(6) int arg4) {
		if (arg1 < 128 || arg3 < 128 || arg1 > 13056 || arg3 > 13056) {
			Static106.anInt2355 = -1;
			Static203.anInt4210 = -1;
			return;
		}
		@Pc(31) int local31 = Static26.method2454(Static197.anInt2422, arg3, arg1) - arg4;
		@Pc(35) int local35 = local31 - anInt4119;
		@Pc(39) int local39 = Class94.anIntArray278[Static228.anInt4792];
		@Pc(43) int local43 = arg1 - Static122.anInt2706;
		@Pc(47) int local47 = arg3 - Static118.anInt2544;
		@Pc(51) int local51 = Class94.anIntArray277[Static228.anInt4792];
		@Pc(59) int local59 = Class94.anIntArray277[Static207.anInt4426];
		@Pc(63) int local63 = Class94.anIntArray278[Static207.anInt4426];
		@Pc(73) int local73 = local47 * local63 + local59 * local43 >> 16;
		@Pc(84) int local84 = local47 * local59 - local43 * local63 >> 16;
		@Pc(86) int local86 = local73;
		@Pc(97) int local97 = local35 * local51 - local39 * local84 >> 16;
		@Pc(107) int local107 = local84 * local51 + local35 * local39 >> 16;
		if (local107 >= 50) {
			Static106.anInt2355 = (local86 << 9) / local107 + arg0;
			Static203.anInt4210 = (local97 << 9) / local107 + arg2;
		} else {
			Static106.anInt2355 = -1;
			Static203.anInt4210 = -1;
		}
	}

	@OriginalMember(owner = "client!t", name = "a", descriptor = "(IIIIIIII)V")
	public static void method3196(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6) {
		if (arg4 < 0 || arg6 < 0 || arg4 >= 103 || arg6 >= 103) {
			return;
		}
		@Pc(41) int local41;
		if (arg1 == 0) {
			@Pc(31) Class62 local31 = Static20.method446(arg5, arg4, arg6);
			if (local31 != null) {
				local41 = (int) (local31.aLong84 >>> 32) & Integer.MAX_VALUE;
				if (arg2 == 2) {
					local31.aClass5_2 = new Class5_Sub5(local41, 2, arg0 + 4, arg5, arg4, arg6, arg3, false, local31.aClass5_2);
					local31.aClass5_1 = new Class5_Sub5(local41, 2, arg0 + 1 & 0x3, arg5, arg4, arg6, arg3, false, local31.aClass5_1);
				} else {
					local31.aClass5_2 = new Class5_Sub5(local41, arg2, arg0, arg5, arg4, arg6, arg3, false, local31.aClass5_2);
				}
			}
		}
		if (arg1 == 1) {
			@Pc(109) Class65 local109 = Static124.method3529(arg5, arg4, arg6);
			if (local109 != null) {
				local41 = (int) (local109.aLong85 >>> 32) & Integer.MAX_VALUE;
				if (arg2 == 4 || arg2 == 5) {
					local109.aClass5_3 = new Class5_Sub5(local41, 4, arg0, arg5, arg4, arg6, arg3, false, local109.aClass5_3);
				} else if (arg2 == 6) {
					local109.aClass5_3 = new Class5_Sub5(local41, 4, arg0 + 4, arg5, arg4, arg6, arg3, false, local109.aClass5_3);
				} else if (arg2 == 7) {
					local109.aClass5_3 = new Class5_Sub5(local41, 4, (arg0 + 2 & 0x3) + 4, arg5, arg4, arg6, arg3, false, local109.aClass5_3);
				} else if (arg2 == 8) {
					local109.aClass5_3 = new Class5_Sub5(local41, 4, arg0 + 4, arg5, arg4, arg6, arg3, false, local109.aClass5_3);
					local109.aClass5_4 = new Class5_Sub5(local41, 4, (arg0 + 2 & 0x3) + 4, arg5, arg4, arg6, arg3, false, local109.aClass5_4);
				}
			}
		}
		if (arg1 == 2) {
			@Pc(243) Class83 local243 = Static139.method2460(arg5, arg4, arg6);
			if (arg2 == 11) {
				arg2 = 10;
			}
			if (local243 != null) {
				local243.aClass5_5 = new Class5_Sub5(Integer.MAX_VALUE & (int) (local243.aLong118 >>> 32), arg2, arg0, arg5, arg4, arg6, arg3, false, local243.aClass5_5);
			}
		}
		if (arg1 == 3) {
			@Pc(283) Class119 local283 = Static22.method468(arg5, arg4, arg6);
			if (local283 != null) {
				local283.aClass5_9 = new Class5_Sub5((int) (local283.aLong163 >>> 32) & Integer.MAX_VALUE, 22, arg0, arg5, arg4, arg6, arg3, false, local283.aClass5_9);
			}
		}
	}

	@OriginalMember(owner = "client!t", name = "a", descriptor = "(III[B)Lclient!ia;")
	public static Class51 method3197(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) byte[] arg2) {
		@Pc(10) Class51 local10 = new Class51();
		local10.anInt1858 = 0;
		local10.aByteArray17 = new byte[arg0];
		for (@Pc(23) int local23 = arg1; local23 < arg1 + arg0; local23++) {
			if (arg2[local23] != 0) {
				local10.aByteArray17[local10.anInt1858++] = arg2[local23];
			}
		}
		return local10;
	}

	@OriginalMember(owner = "client!t", name = "a", descriptor = "(II)I")
	public static int method3198(@OriginalArg(1) int arg0) {
		return arg0 & 0xFF;
	}
}
