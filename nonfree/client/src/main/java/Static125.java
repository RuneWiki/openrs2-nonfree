import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static125 {

	@OriginalMember(owner = "client!fs", name = "H", descriptor = "Lclient!eh;")
	public static final Class67 aClass67_83 = new Class67(51, 5);

	@OriginalMember(owner = "client!fs", name = "a", descriptor = "(IIIII)V")
	public static void method1540(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		for (@Pc(6) Class1_Sub35 local6 = (Class1_Sub35) Static463.aClass14_53.method203(); local6 != null; local6 = (Class1_Sub35) Static463.aClass14_53.method208()) {
			Static67.method5769(arg0, arg3, local6, arg1, arg2);
		}
		for (@Pc(31) Class1_Sub35 local31 = (Class1_Sub35) Static175.aClass14_12.method203(); local31 != null; local31 = (Class1_Sub35) Static175.aClass14_12.method208()) {
			@Pc(35) byte local35 = 1;
			@Pc(40) Class164 local40 = local31.aClass11_Sub1_Sub3_Sub1_1.method2640();
			if (local31.aClass11_Sub1_Sub3_Sub1_1.aBoolean322) {
				local35 = 0;
			} else if (local31.aClass11_Sub1_Sub3_Sub1_1.anInt3317 == local40.anInt4636 || local31.aClass11_Sub1_Sub3_Sub1_1.anInt3317 == local40.anInt4598 || local31.aClass11_Sub1_Sub3_Sub1_1.anInt3317 == local40.anInt4599 || local40.anInt4609 == local31.aClass11_Sub1_Sub3_Sub1_1.anInt3317) {
				local35 = 2;
			} else if (local31.aClass11_Sub1_Sub3_Sub1_1.anInt3317 == local40.anInt4611 || local31.aClass11_Sub1_Sub3_Sub1_1.anInt3317 == local40.anInt4595 || local40.anInt4620 == local31.aClass11_Sub1_Sub3_Sub1_1.anInt3317 || local40.anInt4610 == local31.aClass11_Sub1_Sub3_Sub1_1.anInt3317) {
				local35 = 3;
			}
			if (local31.anInt5292 != local35) {
				@Pc(131) int local131 = Static64.method872(local31.aClass11_Sub1_Sub3_Sub1_1);
				if (local131 != local31.anInt5294) {
					if (local31.aClass1_Sub9_Sub4_3 != null) {
						Static123.aClass1_Sub9_Sub1_1.method4263(local31.aClass1_Sub9_Sub4_3);
						local31.aClass1_Sub9_Sub4_3 = null;
					}
					local31.anInt5294 = local131;
				}
				local31.anInt5292 = local35;
			}
			local31.anInt5300 = local31.aClass11_Sub1_Sub3_Sub1_1.anInt6428;
			local31.anInt5290 = local31.aClass11_Sub1_Sub3_Sub1_1.anInt6428 + (local31.aClass11_Sub1_Sub3_Sub1_1.method2635() << 6);
			local31.anInt5299 = local31.aClass11_Sub1_Sub3_Sub1_1.anInt6430;
			local31.anInt5293 = local31.aClass11_Sub1_Sub3_Sub1_1.anInt6430 + (local31.aClass11_Sub1_Sub3_Sub1_1.method2635() << 6);
			Static67.method5769(arg0, arg3, local31, arg1, arg2);
		}
		for (@Pc(209) Class1_Sub35 local209 = (Class1_Sub35) Static263.aClass208_28.method4414(); local209 != null; local209 = (Class1_Sub35) Static263.aClass208_28.method4410()) {
			@Pc(213) byte local213 = 1;
			@Pc(218) Class164 local218 = local209.aClass11_Sub1_Sub3_Sub2_2.method2640();
			if (local209.aClass11_Sub1_Sub3_Sub2_2.aBoolean322) {
				local213 = 0;
			} else if (local209.aClass11_Sub1_Sub3_Sub2_2.anInt3317 == local218.anInt4636 || local209.aClass11_Sub1_Sub3_Sub2_2.anInt3317 == local218.anInt4598 || local218.anInt4599 == local209.aClass11_Sub1_Sub3_Sub2_2.anInt3317 || local209.aClass11_Sub1_Sub3_Sub2_2.anInt3317 == local218.anInt4609) {
				local213 = 2;
			} else if (local218.anInt4611 == local209.aClass11_Sub1_Sub3_Sub2_2.anInt3317 || local218.anInt4595 == local209.aClass11_Sub1_Sub3_Sub2_2.anInt3317 || local218.anInt4620 == local209.aClass11_Sub1_Sub3_Sub2_2.anInt3317 || local209.aClass11_Sub1_Sub3_Sub2_2.anInt3317 == local218.anInt4610) {
				local213 = 3;
			}
			if (local209.anInt5292 != local213) {
				@Pc(309) int local309 = Static20.method313(local209.aClass11_Sub1_Sub3_Sub2_2);
				if (local309 != local209.anInt5294) {
					if (local209.aClass1_Sub9_Sub4_3 != null) {
						Static123.aClass1_Sub9_Sub1_1.method4263(local209.aClass1_Sub9_Sub4_3);
						local209.aClass1_Sub9_Sub4_3 = null;
					}
					local209.anInt5294 = local309;
				}
				local209.anInt5292 = local213;
			}
			local209.anInt5300 = local209.aClass11_Sub1_Sub3_Sub2_2.anInt6428;
			local209.anInt5290 = local209.aClass11_Sub1_Sub3_Sub2_2.anInt6428 + (local209.aClass11_Sub1_Sub3_Sub2_2.method2635() << 6);
			local209.anInt5299 = local209.aClass11_Sub1_Sub3_Sub2_2.anInt6430;
			local209.anInt5293 = local209.aClass11_Sub1_Sub3_Sub2_2.anInt6430 + (local209.aClass11_Sub1_Sub3_Sub2_2.method2635() << 6);
			Static67.method5769(arg0, arg3, local209, arg1, arg2);
		}
	}
}
