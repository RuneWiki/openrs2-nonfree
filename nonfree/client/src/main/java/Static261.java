import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static261 {

	@OriginalMember(owner = "client!nb", name = "c", descriptor = "[J")
	public static long[] aLongArray4;

	@OriginalMember(owner = "client!nb", name = "d", descriptor = "Lclient!wp;")
	public static Class1_Sub45 aClass1_Sub45_2;

	@OriginalMember(owner = "client!nb", name = "e", descriptor = "Lclient!ri;")
	public static final Class214 aClass214_159 = new Class214(51, -1);

	@OriginalMember(owner = "client!nb", name = "a", descriptor = "(III)Lclient!sm;")
	public static Class20_Sub2 method3366(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(7) Class82 local7 = Static159.aClass82ArrayArrayArray2[arg0][arg1][arg2];
		return local7 == null || local7.aClass20_Sub2_1 == null ? null : local7.aClass20_Sub2_1;
	}

	@OriginalMember(owner = "client!nb", name = "a", descriptor = "(I)V")
	public static void method3367() {
		Static188.aClass254_20.method5438();
		for (@Pc(13) Class1_Sub45 local13 = (Class1_Sub45) Static50.aClass254_8.method5437(); local13 != null; local13 = (Class1_Sub45) Static50.aClass254_8.method5433()) {
			if (local13.anInt7398 < 1000) {
				local13.method5617();
				Static188.aClass254_20.method5430(local13);
			}
		}
		Static188.aClass254_20.method5442(Static50.aClass254_8);
		@Pc(45) int local45 = -1;
		@Pc(52) Class1_Sub29 local52 = (Class1_Sub29) Static416.aClass254_44.method5437();
		if (local52 != null) {
			local45 = local52.method3483();
		}
		if (!Static263.aBoolean329) {
			if (local45 == 0 && (Static354.anInt5869 == 1 && Static19.anInt396 > 2 || Static286.method3731())) {
				local45 = 2;
			}
			if (local45 == 2 && Static19.anInt396 > 0 && local52 != null) {
				if (Static68.aClass250_2 == null && Static316.anInt5247 == 0) {
					Static296.method3888(local52.method3481(), local52.method3484());
				} else {
					Static220.anInt3559 = 2;
				}
			}
			if (local45 == 0 && Static19.anInt396 > 0) {
				Static275.method3497();
			}
			if (Static68.aClass250_2 == null && Static316.anInt5247 == 0) {
				Static220.anInt3559 = 0;
				aClass1_Sub45_2 = null;
				return;
			}
			return;
		}
		@Pc(135) int local135;
		@Pc(139) int local139;
		if (local45 == -1) {
			local135 = Static210.aClass26_1.method576();
			local139 = Static210.aClass26_1.method574();
			if (Static351.anInt5784 - 10 > local135 || local135 > Static163.anInt2682 + Static351.anInt5784 + 10 || Static430.anInt7189 - 10 > local139 || Static430.anInt7189 + Static360.anInt5991 + 10 < local139) {
				Static263.aBoolean329 = false;
				Static113.method1580(Static351.anInt5784, Static360.anInt5991, Static430.anInt7189, Static163.anInt2682);
			}
		}
		if (local45 != 0) {
			return;
		}
		local135 = Static351.anInt5784;
		local139 = Static430.anInt7189;
		@Pc(188) int local188 = Static163.anInt2682;
		@Pc(192) int local192 = local52.method3481();
		@Pc(196) int local196 = local52.method3484();
		@Pc(198) int local198 = -1;
		@Pc(218) int local218;
		for (@Pc(200) int local200 = 0; local200 < Static19.anInt396; local200++) {
			if (Static411.aBoolean546) {
				local218 = local139 + (Static19.anInt396 - 1 + -local200) * 16 + 33;
				if (local135 < local192 && local192 < local188 + local135 && local196 > local218 - 13 && local218 + 4 > local196) {
					local198 = local200;
				}
			} else {
				local218 = local139 + (Static19.anInt396 + -1 - local200) * 16 + 31;
				if (local135 < local192 && local192 < local135 + local188 && local218 - 13 < local196 && local196 < local218 + 3) {
					local198 = local200;
				}
			}
		}
		if (local198 != -1) {
			local218 = 0;
			@Pc(298) Class172 local298 = new Class172(Static50.aClass254_8);
			for (@Pc(303) Class1_Sub45 local303 = (Class1_Sub45) local298.method3434(); local303 != null; local303 = (Class1_Sub45) local298.method3435()) {
				if (local218 == local198) {
					Static74.method1179(local303, local196, local192);
				}
				local218++;
			}
		}
		Static263.aBoolean329 = false;
		Static113.method1580(Static351.anInt5784, Static360.anInt5991, Static430.anInt7189, Static163.anInt2682);
	}
}
