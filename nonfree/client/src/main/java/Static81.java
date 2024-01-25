import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static81 {

	@OriginalMember(owner = "client!em", name = "e", descriptor = "Lclient!sr;")
	public static Interface7 anInterface7_2;

	@OriginalMember(owner = "client!em", name = "h", descriptor = "I")
	public static int anInt1606;

	@OriginalMember(owner = "client!em", name = "i", descriptor = "I")
	public static int anInt1607;

	@OriginalMember(owner = "client!em", name = "k", descriptor = "I")
	public static int anInt1609;

	@OriginalMember(owner = "client!em", name = "c", descriptor = "I")
	public static int anInt1604 = -1;

	@OriginalMember(owner = "client!em", name = "d", descriptor = "[I")
	public static final int[] anIntArray185 = new int[128];

	@OriginalMember(owner = "client!em", name = "f", descriptor = "[I")
	public static final int[] anIntArray186 = new int[] { 1, 4 };

	@OriginalMember(owner = "client!em", name = "a", descriptor = "(ILclient!rg;II)V")
	public static void method1557(@OriginalArg(0) int arg0, @OriginalArg(1) Class177 arg1, @OriginalArg(2) int arg2) {
		Static335.aClass177_24 = arg1;
		Static174.anInt3615 = arg2;
		Static40.anInt4333 = arg0;
	}

	@OriginalMember(owner = "client!em", name = "a", descriptor = "([I[I[ILclient!ql;I)V")
	public static void method1558(@OriginalArg(0) int[] arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) int[] arg2, @OriginalArg(3) Class5_Sub3_Sub3_Sub2 arg3) {
		for (@Pc(7) int local7 = 0; local7 < arg0.length; local7++) {
			@Pc(13) int local13 = arg0[local7];
			@Pc(17) int local17 = arg2[local7];
			@Pc(21) int local21 = arg1[local7];
			for (@Pc(23) int local23 = 0; local17 != 0 && arg3.aClass59Array3.length > local23; local23++) {
				if ((local17 & 0x1) != 0) {
					if (local13 == -1) {
						arg3.aClass59Array3[local23] = null;
					} else {
						@Pc(39) Class121 local39 = Static133.method2520(local13);
						@Pc(42) int local42 = local39.anInt3780;
						@Pc(47) Class59 local47 = arg3.aClass59Array3[local23];
						if (local47 != null) {
							if (local13 == local47.anInt1772) {
								if (local42 == 0) {
									local47 = arg3.aClass59Array3[local23] = null;
								} else if (local42 == 1) {
									local47.anInt1767 = local21;
									local47.anInt1766 = 1;
									local47.anInt1770 = 0;
									local47.anInt1769 = 0;
									local47.anInt1771 = 0;
									Static131.method2490(false, local39, 0, arg3.anInt5047, arg3.anInt5050);
								} else if (local42 == 2) {
									local47.anInt1769 = 0;
								}
							} else if (local39.anInt3772 >= Static133.method2520(local47.anInt1772).anInt3772) {
								local47 = arg3.aClass59Array3[local23] = null;
							}
						}
						if (local47 == null) {
							local47 = arg3.aClass59Array3[local23] = new Class59();
							local47.anInt1769 = 0;
							local47.anInt1771 = 0;
							local47.anInt1772 = local13;
							local47.anInt1770 = 0;
							local47.anInt1767 = local21;
							local47.anInt1766 = 1;
							Static131.method2490(false, local39, 0, arg3.anInt5047, arg3.anInt5050);
						}
					}
				}
				local17 >>>= 0x1;
			}
		}
	}

	@OriginalMember(owner = "client!em", name = "a", descriptor = "(BII)I")
	public static int method1560(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(40) int local40 = Static143.method2718(arg0 + 45365, arg1 - -91923, 4) + (Static143.method2718(arg0 + 10294, arg1 + 37821, 2) - 128 >> 1) + (Static143.method2718(arg0, arg1, 1) + -128 >> 2) - 128;
		local40 = (int) ((double) local40 * 0.3D) + 35;
		if (local40 < 10) {
			local40 = 10;
		} else if (local40 > 60) {
			local40 = 60;
		}
		return local40;
	}

	@OriginalMember(owner = "client!em", name = "b", descriptor = "(I)V")
	public static void method1561() {
		Static248.aClass1_Sub7_Sub1_2.method728(42);
		Static248.aClass1_Sub7_Sub1_2.method3108(0);
	}

	@OriginalMember(owner = "client!em", name = "c", descriptor = "(I)V")
	public static void method1562() {
		Static131.aClass140_72.method3813();
		Static112.aClass140_103.method3813();
	}
}
