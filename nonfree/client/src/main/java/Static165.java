import java.util.Random;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static165 {

	@OriginalMember(owner = "client!md", name = "d", descriptor = "I")
	public static int anInt3458 = 0;

	@OriginalMember(owner = "client!md", name = "e", descriptor = "Ljava/lang/String;")
	public static String aString106 = "Loading - please wait.";

	@OriginalMember(owner = "client!md", name = "k", descriptor = "[I")
	public static int[] anIntArray277 = new int[] { 2, 2, 4, 0, 1, 8, 0, 0, 0, 0, 2, 0, 0, 0, 0, 0 };

	@OriginalMember(owner = "client!md", name = "a", descriptor = "(IBIIIII)V")
	public static void method2790(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		@Pc(9) Class68[] local9 = Static257.aClass68Array1;
		for (@Pc(11) int local11 = 0; local11 < local9.length; local11++) {
			@Pc(19) Class68 local19 = local9[local11];
			if (local19 != null && local19.anInt1791 == 2) {
				Static46.method822(arg3 >> 1, local19.anInt1792 * 2, local19.anInt1796 + (local19.anInt1795 - Static118.anInt2409 << 7), arg1 >> 1, arg0, arg2, (local19.anInt1786 - Static290.anInt5497 << 7) + local19.anInt1784);
				if (Static225.anInt4443 > -1 && Static37.anInt757 % 20 < 10) {
					Static56.aClass1_Sub1_Sub3Array5[local19.anInt1794].method4628(arg4 + Static225.anInt4443 - 12, Static178.anInt3586 + arg5 + -28);
				}
			}
		}
	}

	@OriginalMember(owner = "client!md", name = "a", descriptor = "(B)V")
	public static void method2791() {
		@Pc(6) int local6 = Static237.aClass1_Sub14_Sub1_7.method2657(8);
		@Pc(20) int local20;
		if (Static222.anInt4329 > local6) {
			for (local20 = local6; local20 < Static222.anInt4329; local20++) {
				Static119.anIntArray535[Static110.anInt2185++] = Static46.anIntArray79[local20];
			}
		}
		if (Static222.anInt4329 < local6) {
			throw new RuntimeException("gppov1");
		}
		Static222.anInt4329 = 0;
		for (local20 = 0; local20 < local6; local20++) {
			@Pc(68) int local68 = Static46.anIntArray79[local20];
			@Pc(72) Class22_Sub3_Sub2 local72 = Static195.aClass22_Sub3_Sub2Array1[local68];
			@Pc(77) int local77 = Static237.aClass1_Sub14_Sub1_7.method2657(1);
			if (local77 == 0) {
				Static46.anIntArray79[Static222.anInt4329++] = local68;
				local72.anInt4614 = Static37.anInt757;
			} else {
				@Pc(101) int local101 = Static237.aClass1_Sub14_Sub1_7.method2657(2);
				if (local101 == 0) {
					Static46.anIntArray79[Static222.anInt4329++] = local68;
					local72.anInt4614 = Static37.anInt757;
					Static158.anIntArray179[Static17.anInt300++] = local68;
				} else {
					@Pc(143) int local143;
					@Pc(153) int local153;
					if (local101 == 1) {
						Static46.anIntArray79[Static222.anInt4329++] = local68;
						local72.anInt4614 = Static37.anInt757;
						local143 = Static237.aClass1_Sub14_Sub1_7.method2657(3);
						local72.method3644(1, local143);
						local153 = Static237.aClass1_Sub14_Sub1_7.method2657(1);
						if (local153 == 1) {
							Static158.anIntArray179[Static17.anInt300++] = local68;
						}
					} else if (local101 == 2) {
						Static46.anIntArray79[Static222.anInt4329++] = local68;
						local72.anInt4614 = Static37.anInt757;
						if (Static237.aClass1_Sub14_Sub1_7.method2657(1) == 1) {
							local143 = Static237.aClass1_Sub14_Sub1_7.method2657(3);
							local72.method3644(2, local143);
							local153 = Static237.aClass1_Sub14_Sub1_7.method2657(3);
							local72.method3644(2, local153);
						} else {
							local143 = Static237.aClass1_Sub14_Sub1_7.method2657(3);
							local72.method3644(0, local143);
						}
						local143 = Static237.aClass1_Sub14_Sub1_7.method2657(1);
						if (local143 == 1) {
							Static158.anIntArray179[Static17.anInt300++] = local68;
						}
					} else if (local101 == 3) {
						Static119.anIntArray535[Static110.anInt2185++] = local68;
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!md", name = "a", descriptor = "(IIII)V")
	public static void method2792(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		@Pc(8) Class1_Sub1_Sub2 local8 = Static46.method824(11, arg0);
		local8.method294();
		local8.anInt293 = arg1;
		local8.anInt296 = arg2;
	}

	@OriginalMember(owner = "client!md", name = "a", descriptor = "(BLjava/util/Random;I)I")
	public static int method2794(@OriginalArg(1) Random arg0, @OriginalArg(2) int arg1) {
		if (arg1 <= 0) {
			throw new IllegalArgumentException();
		} else if (Static219.method3494(arg1)) {
			return (int) (((long) arg0.nextInt() & 0xFFFFFFFFL) * (long) arg1 >> 32);
		} else {
			@Pc(42) int local42 = Integer.MIN_VALUE - (int) (4294967296L % (long) arg1);
			@Pc(45) int local45;
			do {
				local45 = arg0.nextInt();
			} while (local45 >= local42);
			return Static293.method4618(local45, arg1);
		}
	}
}
