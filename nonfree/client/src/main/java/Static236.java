import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static236 {

	@OriginalMember(owner = "client!lw", name = "K", descriptor = "I")
	public static int anInt4669;

	@OriginalMember(owner = "client!lw", name = "L", descriptor = "Lclient!oi;")
	public static Class184 aClass184_2;

	@OriginalMember(owner = "client!lw", name = "T", descriptor = "Lclient!ci;")
	public static Class38 aClass38_50;

	@OriginalMember(owner = "client!lw", name = "I", descriptor = "Z")
	public static boolean aBoolean304 = false;

	@OriginalMember(owner = "client!lw", name = "N", descriptor = "Z")
	public static boolean aBoolean305 = true;

	@OriginalMember(owner = "client!lw", name = "O", descriptor = "[[S")
	public static final short[][] aShortArrayArray7 = new short[][] { { 6554, 115, 10304, 28, 5702, 7756, 5681, 4510, -31835, 22437, 2859, -11339, 16, 5157, 10446, 3658, -27314, -21965, 472, 580, 784, 21966, 28950, -15697, -14002 }, { 9104, 10275, 7595, 3610, 7975, 8526, 918, -26734, 24466, 10145, -6882, 5027, 1457, 16565, -30545, 25486, 24, 5392, 10429, 3673, -27335, -21957, 192, 687, 412, 21821, 28835, -15460, -14019 }, new short[0], new short[0], new short[0] };

	@OriginalMember(owner = "client!lw", name = "c", descriptor = "(II)Lclient!ob;")
	public static Class179 method3984(@OriginalArg(1) int arg0) {
		@Pc(15) Class179 local15 = (Class179) Static38.aClass83_8.method2338((long) arg0);
		if (local15 != null) {
			return local15;
		}
		@Pc(25) byte[] local25 = Static351.aClass38_73.method1039(arg0, 0);
		local15 = new Class179();
		if (local25 != null) {
			local15.method4401(new Class4_Sub20(local25));
		}
		local15.method4400();
		Static38.aClass83_8.method2337(local15, (long) arg0);
		return local15;
	}

	@OriginalMember(owner = "client!lw", name = "a", descriptor = "(IIIII)V")
	public static void method3985(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		if (Static157.aClass185_Sub1_1.anInt5554 != 0 && arg2 != 0 && Static93.anInt2064 < 50 && arg1 != -1) {
			Static121.aClass7Array2[Static93.anInt2064++] = new Class7((byte) 2, arg1, arg2, arg0, arg3, 0);
		}
	}

	@OriginalMember(owner = "client!lw", name = "a", descriptor = "(BLjava/lang/String;)I")
	public static int method3986(@OriginalArg(1) String arg0) {
		@Pc(8) int local8 = arg0.length();
		@Pc(19) int local19 = 0;
		for (@Pc(21) int local21 = 0; local21 < local8; local21++) {
			@Pc(27) char local27 = arg0.charAt(local21);
			if (local27 <= '\u007f') {
				local19++;
			} else if (local27 <= '\u07ff') {
				local19 += 2;
			} else {
				local19 += 3;
			}
		}
		return local19;
	}

	@OriginalMember(owner = "client!lw", name = "a", descriptor = "(BIJI)V")
	public static void method3987(@OriginalArg(1) int arg0, @OriginalArg(2) long arg1, @OriginalArg(3) int arg2) {
		@Pc(18) int local18 = (int) arg1 >> 14 & 0x1F;
		@Pc(25) int local25 = (int) arg1 >> 20 & 0x3;
		@Pc(32) int local32 = Integer.MAX_VALUE & (int) (arg1 >>> 32);
		if (local18 != 10 && local18 != 11 && local18 != 22) {
			Static258.method3306(0, 0, arg0, local18, arg2, true, local25, 0);
			return;
		}
		@Pc(64) Class139 local64 = Static146.aClass228_1.method5203(local32);
		@Pc(80) int local80;
		@Pc(77) int local77;
		if (local25 == 0 || local25 == 2) {
			local77 = local64.anInt4350;
			local80 = local64.anInt4353;
		} else {
			local77 = local64.anInt4353;
			local80 = local64.anInt4350;
		}
		@Pc(91) int local91 = local64.anInt4397;
		if (local25 != 0) {
			local91 = (local91 << local25 & 0xF) + (local91 >> 4 - local25);
		}
		Static258.method3306(local80, local91, arg0, 0, arg2, true, 0, local77);
	}

	@OriginalMember(owner = "client!lw", name = "a", descriptor = "(ILclient!qa;IBIII)Lclient!ka;")
	public static Class57 method3988(@OriginalArg(0) int arg0, @OriginalArg(1) Class30 arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		@Pc(11) long local11 = (long) arg0;
		@Pc(17) Class57 local17 = (Class57) Static44.aClass83_9.method2338(local11);
		if (local17 == null) {
			@Pc(27) Class37 local27 = Static39.method813(Static181.aClass38_39, arg0);
			if (local27 == null) {
				return null;
			}
			if (local27.anInt1037 < 13) {
				local27.method999();
			}
			local17 = arg1.method2036(local27, 2055, Static25.anInt463, 64, 768);
			Static44.aClass83_9.method2337(local17, local11);
		}
		local17 = local17.method6075((byte) 2, 2055, true);
		if (arg5 != 0) {
			local17.l(arg5);
		}
		if (arg4 != 0) {
			local17.E(arg4);
		}
		if (arg3 != 0) {
			local17.S(arg3);
		}
		if (arg2 != 0) {
			local17.R(0, arg2, 0);
		}
		return local17;
	}

	@OriginalMember(owner = "client!lw", name = "a", descriptor = "(II[III)V")
	public static void method3990(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[] arg2, @OriginalArg(4) int arg3) {
		arg1--;
		@Pc(7) int local7 = arg0 - 1;
		@Pc(11) int local11 = local7 - 7;
		while (local11 > arg1) {
			@Pc(15) int local15 = arg1 + 1;
			arg2[local15] = arg3;
			@Pc(20) int local20 = local15 + 1;
			arg2[local20] = arg3;
			@Pc(25) int local25 = local20 + 1;
			arg2[local25] = arg3;
			@Pc(30) int local30 = local25 + 1;
			arg2[local30] = arg3;
			@Pc(35) int local35 = local30 + 1;
			arg2[local35] = arg3;
			@Pc(40) int local40 = local35 + 1;
			arg2[local40] = arg3;
			@Pc(45) int local45 = local40 + 1;
			arg2[local45] = arg3;
			arg1 = local45 + 1;
			arg2[arg1] = arg3;
		}
		while (local7 > arg1) {
			arg1++;
			arg2[arg1] = arg3;
		}
	}
}
