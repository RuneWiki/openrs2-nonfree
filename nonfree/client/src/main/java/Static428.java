import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static428 {

	@OriginalMember(owner = "client!vq", name = "a", descriptor = "[I")
	public static final int[] anIntArray615 = new int[5];

	@OriginalMember(owner = "client!vq", name = "a", descriptor = "(III)Lclient!ab;")
	public static Class3_Sub1 method5836(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(7) Class189 local7 = Static30.aClass189ArrayArrayArray2[arg0][arg1][arg2];
		return local7 == null ? null : local7.aClass3_Sub1_1;
	}

	@OriginalMember(owner = "client!vq", name = "b", descriptor = "(I)V")
	public static void method5839() {
		Static307.aClass28_42.method3583(((float) Static8.aClass173_Sub1_1.anInt4416 * 0.1F + 0.7F) * Static304.aFloat88);
		Static307.aClass28_42.method3529(Static424.anInt179, Static307.aFloat45, Static49.aFloat31, (float) (Static108.anInt1928 << 0), (float) (Static20.anInt356 << 0), (float) (Static353.anInt5953 << 0));
		Static307.aClass28_42.method3502(Static435.aClass133_4);
	}

	@OriginalMember(owner = "client!vq", name = "c", descriptor = "(I)V")
	public static void method5840() {
		for (@Pc(15) Class6_Sub43 local15 = (Class6_Sub43) Static203.aClass88_32.method1882(); local15 != null; local15 = (Class6_Sub43) Static203.aClass88_32.method1891()) {
			if (local15.anInt6919 == -1) {
				local15.anInt6922 = 0;
				if (local15.anInt6925 >= 0 && local15.anInt6918 >= 0 && Static84.anInt1632 > local15.anInt6925 && local15.anInt6918 < Static261.anInt4480) {
					Static54.method1026(local15);
				}
			} else {
				local15.method5977();
			}
		}
	}

	@OriginalMember(owner = "client!vq", name = "a", descriptor = "(IBIII)V")
	public static void method5841(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		@Pc(7) int local7 = 0;
		@Pc(9) int local9 = arg0;
		@Pc(17) int local17 = -arg0;
		@Pc(19) int local19 = -1;
		@Pc(27) int local27 = Static53.method977(Static99.anInt1808, Static81.anInt1574, arg2 + arg0);
		@Pc(36) int local36 = Static53.method977(Static99.anInt1808, Static81.anInt1574, arg2 - arg0);
		Static73.method1404(Static347.anIntArrayArray54[arg1], local27, arg3, local36);
		while (local9 > local7) {
			local19 += 2;
			local17 += local19;
			@Pc(68) int local68;
			@Pc(73) int local73;
			@Pc(91) int local91;
			@Pc(99) int local99;
			if (local17 > 0) {
				local9--;
				local17 -= local9 << 1;
				local68 = arg1 - local9;
				local73 = arg1 + local9;
				if (Static97.anInt1796 <= local73 && Static85.anInt1636 >= local68) {
					local91 = Static53.method977(Static99.anInt1808, Static81.anInt1574, arg2 + local7);
					local99 = Static53.method977(Static99.anInt1808, Static81.anInt1574, arg2 - local7);
					if (local73 <= Static85.anInt1636) {
						Static73.method1404(Static347.anIntArrayArray54[local73], local91, arg3, local99);
					}
					if (local68 >= Static97.anInt1796) {
						Static73.method1404(Static347.anIntArrayArray54[local68], local91, arg3, local99);
					}
				}
			}
			local7++;
			local68 = arg1 - local7;
			local73 = local7 + arg1;
			if (local73 >= Static97.anInt1796 && local68 <= Static85.anInt1636) {
				local91 = Static53.method977(Static99.anInt1808, Static81.anInt1574, arg2 + local9);
				local99 = Static53.method977(Static99.anInt1808, Static81.anInt1574, arg2 - local9);
				if (Static85.anInt1636 >= local73) {
					Static73.method1404(Static347.anIntArrayArray54[local73], local91, arg3, local99);
				}
				if (Static97.anInt1796 <= local68) {
					Static73.method1404(Static347.anIntArrayArray54[local68], local91, arg3, local99);
				}
			}
		}
	}
}
