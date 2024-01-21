import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static45 {

	@OriginalMember(owner = "client!hd", name = "J", descriptor = "[I")
	public static int[] anIntArray238;

	@OriginalMember(owner = "client!hd", name = "ab", descriptor = "Lclient!mf;")
	public static Class56_Sub1 aClass56_Sub1_6;

	@OriginalMember(owner = "client!hd", name = "eb", descriptor = "Lclient!mf;")
	public static Class56_Sub1 aClass56_Sub1_7;

	@OriginalMember(owner = "client!hd", name = "fb", descriptor = "Lclient!oc;")
	public static Class56 aClass56_42;

	@OriginalMember(owner = "client!hd", name = "F", descriptor = "Lclient!fc;")
	public static Class25 aClass25_489 = Static78.method1313("Fehler beim Laden Ihres Spielcharakters)3");

	@OriginalMember(owner = "client!hd", name = "M", descriptor = "Lclient!fc;")
	public static Class25 aClass25_490 = Static78.method1313("backleft2");

	@OriginalMember(owner = "client!hd", name = "Q", descriptor = "I")
	public static int anInt1178 = -1;

	@OriginalMember(owner = "client!hd", name = "bb", descriptor = "Lclient!fc;")
	public static Class25 aClass25_491 = Static78.method1313("");

	@OriginalMember(owner = "client!hd", name = "a", descriptor = "(IB)V")
	public static void method959(@OriginalArg(0) int arg0) {
		for (@Pc(6) Class1_Sub19 local6 = (Class1_Sub19) Static125.aClass66_15.method1647(); local6 != null; local6 = (Class1_Sub19) Static125.aClass66_15.method1648()) {
			if ((long) arg0 == (local6.aLong184 >> 48 & 0xFFFFL)) {
				local6.method2024();
			}
		}
	}

	@OriginalMember(owner = "client!hd", name = "a", descriptor = "(Z)V")
	public static void method960() {
		aClass25_491 = null;
		aClass56_Sub1_7 = null;
		aClass56_Sub1_6 = null;
		aClass56_42 = null;
		aClass25_489 = null;
		aClass25_490 = null;
		anIntArray238 = null;
	}

	@OriginalMember(owner = "client!hd", name = "a", descriptor = "(II[Lclient!od;I[BII)V")
	public static void method961(@OriginalArg(1) int arg0, @OriginalArg(2) Class62[] arg1, @OriginalArg(3) int arg2, @OriginalArg(4) byte[] arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		@Pc(11) int local11;
		for (@Pc(3) int local3 = 0; local3 < 4; local3++) {
			for (@Pc(7) int local7 = 0; local7 < 64; local7++) {
				for (local11 = 0; local11 < 64; local11++) {
					if (local7 + arg4 > 0 && local7 + arg4 < 103 && local11 + arg0 > 0 && local11 + arg0 < 103) {
						arg1[local3].anIntArrayArray22[local7 + arg4][arg0 + local11] &= 0xFEFFFFFF;
					}
				}
			}
		}
		@Pc(94) Class1_Sub5 local94 = new Class1_Sub5(arg3);
		for (local11 = 0; local11 < 4; local11++) {
			for (@Pc(100) int local100 = 0; local100 < 64; local100++) {
				for (@Pc(104) int local104 = 0; local104 < 64; local104++) {
					Static38.method873(local11, arg5, local94, arg2, 0, arg4 + local100, local104 - -arg0);
				}
			}
		}
	}

	@OriginalMember(owner = "client!hd", name = "a", descriptor = "(IIIIIIIIII)V")
	public static void method962(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8) {
		@Pc(10) Class1_Sub16 local10 = (Class1_Sub16) Static38.aClass2_5.method22();
		@Pc(12) Class1_Sub16 local12 = null;
		while (local10 != null) {
			if (arg4 == local10.anInt2589 && arg5 == local10.anInt2584 && local10.anInt2579 == arg0 && local10.anInt2581 == arg3) {
				local12 = local10;
				break;
			}
			local10 = (Class1_Sub16) Static38.aClass2_5.method23();
		}
		if (local12 == null) {
			local12 = new Class1_Sub16();
			local12.anInt2579 = arg0;
			local12.anInt2589 = arg4;
			local12.anInt2584 = arg5;
			local12.anInt2581 = arg3;
			Static112.method1807(local12);
			Static38.aClass2_5.method33(local12);
		}
		local12.anInt2591 = arg2;
		local12.anInt2594 = arg6;
		local12.anInt2593 = arg7;
		local12.anInt2580 = arg1;
		local12.anInt2585 = arg8;
	}

	@OriginalMember(owner = "client!hd", name = "a", descriptor = "(IIB)V")
	public static void method963(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(7) Class1_Sub2_Sub9 local7 = Static116.method1860(arg1);
		@Pc(15) int local15 = local7.anInt1068;
		@Pc(18) int local18 = local7.anInt1076;
		@Pc(21) int local21 = local7.anInt1080;
		@Pc(28) int local28 = Class1_Sub2_Sub3_Sub1.anIntArray53[local21 - local18];
		if (arg0 < 0 || local28 < arg0) {
			arg0 = 0;
		}
		local28 <<= local18;
		Static95.anIntArray385[local15] = Static95.anIntArray385[local15] & ~local28 | local28 & arg0 << local18;
	}

	@OriginalMember(owner = "client!hd", name = "a", descriptor = "(Lclient!ob;B)Z")
	public static boolean method964(@OriginalArg(0) Class1_Sub2_Sub14 arg0) {
		if (arg0.anIntArray340 == null) {
			return false;
		}
		for (@Pc(17) int local17 = 0; local17 < arg0.anIntArray340.length; local17++) {
			@Pc(24) int local24 = Static98.method1967(arg0, local17);
			@Pc(29) int local29 = arg0.anIntArray346[local17];
			if (arg0.anIntArray340[local17] == 2) {
				if (local24 >= local29) {
					return false;
				}
			} else if (arg0.anIntArray340[local17] == 3) {
				if (local29 >= local24) {
					return false;
				}
			} else if (arg0.anIntArray340[local17] == 4) {
				if (local29 == local24) {
					return false;
				}
			} else if (local29 != local24) {
				return false;
			}
		}
		return true;
	}
}
