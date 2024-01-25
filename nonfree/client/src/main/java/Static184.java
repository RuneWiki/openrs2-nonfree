import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static184 {

	@OriginalMember(owner = "client!mb", name = "u", descriptor = "Lclient!vn;")
	public static final Class211 aClass211_40 = new Class211();

	@OriginalMember(owner = "client!mb", name = "v", descriptor = "I")
	public static int anInt6249 = 0;

	@OriginalMember(owner = "client!mb", name = "w", descriptor = "[I")
	public static final int[] anIntArray536 = new int[25];

	@OriginalMember(owner = "client!mb", name = "x", descriptor = "I")
	public static int anInt6250 = 0;

	@OriginalMember(owner = "client!mb", name = "a", descriptor = "(Lclient!ra;I)V")
	public static void method5544(@OriginalArg(0) Class170 arg0) {
		Static320.aClass170_113 = arg0;
		Static214.anInt4250 = Static320.aClass170_113.method4575(16);
	}

	@OriginalMember(owner = "client!mb", name = "g", descriptor = "(I)V")
	public static void method5546() {
		while (true) {
			if (Static6.aClass5_Sub1_Sub1_1.method179(Static179.anInt3568) >= 27) {
				@Pc(22) int local22 = Static6.aClass5_Sub1_Sub1_1.method182(15);
				if (local22 != 32767) {
					@Pc(29) boolean local29 = false;
					if (Static188.aClass25_Sub1_Sub1_Sub2Array1[local22] == null) {
						Static188.aClass25_Sub1_Sub1_Sub2Array1[local22] = new Class25_Sub1_Sub1_Sub2();
						Static188.aClass25_Sub1_Sub1_Sub2Array1[local22].anInt5287 = local22;
						local29 = true;
					}
					@Pc(50) Class25_Sub1_Sub1_Sub2 local50 = Static188.aClass25_Sub1_Sub1_Sub2Array1[local22];
					Static331.anIntArray535[Static63.anInt1486++] = local22;
					local50.anInt5320 = Static180.anInt3606;
					if (local50.aClass216_1 != null && local50.aClass216_1.method5780()) {
						Static69.method1524(local50);
					}
					@Pc(77) int local77 = Static6.aClass5_Sub1_Sub1_1.method182(1);
					@Pc(82) int local82 = Static6.aClass5_Sub1_Sub1_1.method182(1);
					if (local82 == 1) {
						Static178.anIntArray266[Static47.anInt1211++] = local22;
					}
					@Pc(100) int local100 = Static6.aClass5_Sub1_Sub1_1.method182(5);
					if (local100 > 15) {
						local100 -= 32;
					}
					@Pc(111) int local111 = Static301.anIntArray504[Static6.aClass5_Sub1_Sub1_1.method182(3)];
					@Pc(118) int local118 = Static6.aClass5_Sub1_Sub1_1.method182(5);
					if (local118 > 15) {
						local118 -= 32;
					}
					local50.method4664(Static2.method5(Static6.aClass5_Sub1_Sub1_1.method182(14)));
					local50.method4644(local50.aClass216_1.anInt6566);
					local50.anInt5308 = local50.aClass216_1.anInt6544 << 3;
					if (local50.anInt5308 == 0) {
						local50.method4648(0);
					} else if (local29) {
						local50.method4648(local111);
					}
					local50.method4658(Static85.aClass25_Sub1_Sub1_Sub1_1.anIntArray402[0] + local100, Static156.anInt3123, Static85.aClass25_Sub1_Sub1_Sub1_1.anIntArray401[0] + local118, local50.method4646(), local77 == 1);
					if (local50.aClass216_1.method5780()) {
						Static129.method2471(local50.anIntArray402[0], local50.anIntArray401[0], null, null, 0, Static156.anInt3123, local50);
					}
					continue;
				}
			}
			Static6.aClass5_Sub1_Sub1_1.method175();
			return;
		}
	}
}
