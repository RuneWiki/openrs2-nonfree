import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static147 {

	@OriginalMember(owner = "client!eu", name = "a", descriptor = "(I)V")
	public static void method2176() {
		@Pc(20) byte[] local20;
		if (Static248.anObject8 == null) {
			@Pc(13) Class67_Sub2_Sub2 local13 = new Class67_Sub2_Sub2();
			local20 = local13.method6698();
			Static248.anObject8 = Static649.method9108(local20);
		}
		if (Static508.anObject20 == null) {
			@Pc(35) Class67_Sub1_Sub1 local35 = new Class67_Sub1_Sub1();
			local20 = local35.method1474();
			Static508.anObject20 = Static649.method9108(local20);
		}
	}

	@OriginalMember(owner = "client!eu", name = "a", descriptor = "(Lclient!nh;I)V")
	public static void method2177(@OriginalArg(0) Class4_Sub3_Sub3_Sub3 arg0) {
		@Pc(6) Class181 local6 = arg0.aClass181_7;
		if (local6.method8970() && local6.method8961(1) && local6.method8962()) {
			if (arg0.aBoolean236) {
				local6.method8964(arg0.method2865().method3036(), 0);
				arg0.aBoolean236 = local6.method8970();
			}
			local6.method8942();
		}
		@Pc(67) Class181 local67;
		for (@Pc(52) int local52 = 0; local52 < arg0.aClass214Array3.length; local52++) {
			if (arg0.aClass214Array3[local52].anInt5678 != -1) {
				local67 = arg0.aClass214Array3[local52].aClass181_10;
				if (local67.method8969()) {
					@Pc(80) Class203 local80 = Static453.aClass281_2.method6686(arg0.aClass214Array3[local52].anInt5678);
					@Pc(84) Class259 local84 = local67.method8952();
					if (local80.aBoolean402) {
						if (local84.anInt7192 == 3) {
							if (arg0.anInt3297 > 0 && arg0.anInt3287 <= Static530.anInt9105 && arg0.anInt3286 < Static530.anInt9105) {
								local67.method8964(-1, 0);
								arg0.aClass214Array3[local52].anInt5678 = -1;
								continue;
							}
						} else if (local84.anInt7192 == 1 && arg0.anInt3297 > 0 && arg0.anInt3287 <= Static530.anInt9105 && Static530.anInt9105 > arg0.anInt3286) {
							continue;
						}
					}
				}
				if (local67.method8961(1) && local67.method8962()) {
					local67.method8964(-1, 0);
					arg0.aClass214Array3[local52].anInt5678 = -1;
				}
			}
		}
		local67 = arg0.aClass181_8;
		if (local67.method8970()) {
			label83: {
				@Pc(201) Class259 local201 = local67.method8952();
				if (local201.anInt7192 == 3) {
					if (arg0.anInt3297 > 0 && arg0.anInt3287 <= Static530.anInt9105 && arg0.anInt3286 < Static530.anInt9105) {
						arg0.anIntArray198 = null;
						local67.method8964(-1, 0);
						break label83;
					}
				} else if (local201.anInt7192 == 1) {
					if (arg0.anInt3297 > 0 && Static530.anInt9105 >= arg0.anInt3287 && Static530.anInt9105 > arg0.anInt3286) {
						local67.method8953(1);
						break label83;
					}
					local67.method8953(0);
				}
				if (local67.method8961(1) && local67.method8962()) {
					arg0.anIntArray198 = null;
					local67.method8964(-1, 0);
				}
			}
		}
		for (@Pc(295) int local295 = 0; local295 < arg0.aClass181_Sub2_Sub1Array3.length; local295++) {
			@Pc(301) Class181_Sub2_Sub1 local301 = arg0.aClass181_Sub2_Sub1Array3[local295];
			if (local301 != null) {
				if (local301.anInt10497 > 0) {
					local301.anInt10497--;
				} else if (local301.method8961(1) && local301.method8962()) {
					arg0.aClass181_Sub2_Sub1Array3[local295] = null;
				}
			}
		}
	}
}
