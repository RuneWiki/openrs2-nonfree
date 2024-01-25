import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static129 {

	@OriginalMember(owner = "client!em", name = "o", descriptor = "[[I")
	public static int[][] anIntArrayArray17;

	@OriginalMember(owner = "client!em", name = "p", descriptor = "Lclient!oaa;")
	public static Class224 aClass224_3;

	@OriginalMember(owner = "client!em", name = "c", descriptor = "Lclient!vh;")
	public static final Class330 aClass330_17 = new Class330(32);

	@OriginalMember(owner = "client!em", name = "a", descriptor = "(BIII)I")
	public static int method1977(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		@Pc(12) int local12 = arg2 / arg0;
		@Pc(18) int local18 = arg0 - 1 & arg2;
		@Pc(22) int local22 = arg1 / arg0;
		@Pc(28) int local28 = arg1 & arg0 - 1;
		@Pc(33) int local33 = Static168.method2673(local22, local12);
		@Pc(40) int local40 = Static168.method2673(local22, local12 + 1);
		@Pc(47) int local47 = Static168.method2673(local22 + 1, local12);
		@Pc(56) int local56 = Static168.method2673(local22 + 1, local12 + 1);
		@Pc(63) int local63 = Static12.method174(local18, arg0, local40, local33);
		@Pc(70) int local70 = Static12.method174(local18, arg0, local56, local47);
		return Static12.method174(local28, arg0, local70, local63);
	}

	@OriginalMember(owner = "client!em", name = "a", descriptor = "(IILclient!pj;I)Lclient!mj;")
	public static Class202 method1978(@OriginalArg(2) Class248 arg0, @OriginalArg(3) int arg1) {
		@Pc(14) byte[] local14 = arg0.method5797(arg1, 0);
		return local14 == null ? null : new Class202(local14);
	}

	@OriginalMember(owner = "client!em", name = "a", descriptor = "(ZZ)V")
	public static void method1979(@OriginalArg(0) boolean arg0) {
		if (arg0) {
			if (Static152.anInt1936 != -1) {
				Static228.method3571(Static152.anInt1936);
			}
			for (@Pc(15) Class6_Sub43 local15 = (Class6_Sub43) Static162.aClass234_23.method5469(); local15 != null; local15 = (Class6_Sub43) Static162.aClass234_23.method5465()) {
				if (!local15.method7949()) {
					local15 = (Class6_Sub43) Static162.aClass234_23.method5469();
					if (local15 == null) {
						break;
					}
				}
				Static536.method7299(false, true, local15);
			}
			Static152.anInt1936 = -1;
			Static162.aClass234_23 = new Class234(8);
			Static291.method4405();
			Static152.anInt1936 = Static428.anInt7625;
			Static20.method306(false);
			Static39.method645();
			Static199.method3320(Static152.anInt1936);
		}
		Static31.aBoolean30 = true;
	}
}
