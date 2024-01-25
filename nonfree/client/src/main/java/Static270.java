import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static270 {

	@OriginalMember(owner = "client!rd", name = "m", descriptor = "[[[B")
	public static byte[][][] aByteArrayArrayArray12;

	@OriginalMember(owner = "client!rd", name = "y", descriptor = "Lclient!mn;")
	public static final Class137 aClass137_1 = new Class137(100);

	@OriginalMember(owner = "client!rd", name = "a", descriptor = "(IIII)V")
	public static void method4573(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		@Pc(8) Class6_Sub2_Sub8 local8 = Static239.method5786(9, arg0);
		local8.method2648();
		local8.anInt2511 = arg2;
		local8.anInt2507 = arg1;
	}

	@OriginalMember(owner = "client!rd", name = "b", descriptor = "(II)V")
	public static void method4574(@OriginalArg(1) int arg0) {
		@Pc(1) Class6_Sub2_Sub17 local1 = null;
		for (@Pc(3) int local3 = 1; local3 < arg0; local3++) {
			@Pc(8) Class106 local8 = Static99.aClass106Array4[local3];
			if (local8 != null) {
				for (@Pc(12) int local12 = 0; local12 < Static163.anInt3084; local12++) {
					for (@Pc(15) int local15 = 0; local15 < Static310.anInt5828; local15++) {
						local1 = local8.method5710(local15, local12, local1);
						if (local1 != null) {
							@Pc(28) int local28 = local15 << 7;
							@Pc(32) int local32 = local12 << 7;
							for (@Pc(36) int local36 = local3 - 1; local36 >= 0; local36--) {
								@Pc(41) Class106 local41 = Static99.aClass106Array4[local36];
								if (local41 != null) {
									@Pc(53) int local53 = local8.method5720(local15, local12) - local41.method5720(local15, local12);
									@Pc(67) int local67 = local8.method5720(local15 + 1, local12) - local41.method5720(local15 + 1, local12);
									@Pc(85) int local85 = local8.method5720(local15 + 1, local12 + 1) - local41.method5720(local15 + 1, local12 + 1);
									@Pc(99) int local99 = local8.method5720(local15, local12 + 1) - local41.method5720(local15, local12 + 1);
									local41.method5719(local1, local28, (local53 + local67 + local85 + local99) / 4, local32);
								}
							}
						}
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!rd", name = "f", descriptor = "(B)V")
	public static void method4575() {
		Static338.aClass70_106.method1399();
	}

	@OriginalMember(owner = "client!rd", name = "a", descriptor = "(IIIII)V")
	public static void method4577(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		if (arg3 <= arg2) {
			Static14.method247(arg2, arg0, Static11.anIntArrayArray11[arg1], arg3);
		} else {
			Static14.method247(arg3, arg0, Static11.anIntArrayArray11[arg1], arg2);
		}
	}

	@OriginalMember(owner = "client!rd", name = "a", descriptor = "(IBI)V")
	public static void method4579(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		Static43.aClass70_22 = new Class70(arg1);
		Static113.aClass70_37 = new Class70(arg0);
	}
}
