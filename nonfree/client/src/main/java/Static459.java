import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static459 {

	@OriginalMember(owner = "client!pha", name = "D", descriptor = "I")
	public static int anInt7964;

	@OriginalMember(owner = "client!pha", name = "B", descriptor = "Lclient!sk;")
	public static final Class6_Sub48 aClass6_Sub48_1 = new Class6_Sub48(0, 0);

	@OriginalMember(owner = "client!pha", name = "a", descriptor = "(IBII)V")
	public static void method7009(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		@Pc(10) int local10 = arg2 + Static50.anInt606;
		@Pc(14) int local14 = Static404.anInt7039 + arg0;
		if (Static334.aClass243ArrayArrayArray2 == null || arg2 < 0 || arg0 < 0 || arg2 >= Static29.anInt380 || Static327.anInt5650 <= arg0 || Static687.aClass6_Sub44_33.aClass7_Sub6_1.method926() == 0 && Static194.aClass60_Sub1_Sub1_Sub3_Sub1_1.aByte135 != arg1) {
			return;
		}
		@Pc(75) long local75 = (long) (arg1 << 28 | local14 << 14 | local10);
		@Pc(81) Class6_Sub36 local81 = (Class6_Sub36) Static650.aClass74_72.method1401(local75);
		if (local81 == null) {
			Static403.method6208(arg1, arg2, arg0);
			return;
		}
		@Pc(103) Class6_Sub23 local103 = (Class6_Sub23) local81.aClass340_42.method8124();
		if (local103 == null) {
			Static403.method6208(arg1, arg2, arg0);
			return;
		}
		@Pc(118) Class60_Sub1_Sub4_Sub1 local118 = (Class60_Sub1_Sub4_Sub1) Static403.method6208(arg1, arg2, arg0);
		if (local118 == null) {
			local118 = new Class60_Sub1_Sub4_Sub1(arg2 << 9, Static555.aClass96Array3[arg1].method8080(arg2, arg0), arg0 << 9, arg1, arg1);
		} else {
			local118.anInt3879 = local118.anInt3875 = -1;
		}
		local118.anInt3870 = local103.anInt4410;
		local118.anInt3862 = local103.anInt4411;
		label56: while (true) {
			@Pc(163) Class6_Sub23 local163 = (Class6_Sub23) local81.aClass340_42.method8134();
			if (local163 == null) {
				break;
			}
			if (local163.anInt4411 != local118.anInt3862) {
				local118.anInt3879 = local163.anInt4411;
				local118.anInt3878 = local163.anInt4410;
				while (true) {
					@Pc(194) Class6_Sub23 local194 = (Class6_Sub23) local81.aClass340_42.method8134();
					if (local194 == null) {
						break label56;
					}
					if (local118.anInt3862 != local194.anInt4411 && local194.anInt4411 != local118.anInt3879) {
						local118.anInt3861 = local194.anInt4410;
						local118.anInt3875 = local194.anInt4411;
					}
				}
			}
		}
		@Pc(244) int local244 = Static248.method4318((arg0 << 9) + 256, arg1, (arg2 << 9) + 256);
		local118.anInt3874 = 0;
		local118.anInt9048 = arg2 << 9;
		local118.aByte135 = (byte) arg1;
		local118.aByte134 = (byte) arg1;
		local118.anInt9051 = local244;
		local118.anInt9057 = arg0 << 9;
		if (Static180.method3417(1, arg2, arg0)) {
			local118.aByte134++;
		}
		Static594.method8229(arg1, arg2, arg0, local244, local118);
	}
}
