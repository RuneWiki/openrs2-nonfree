import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static436 {

	@OriginalMember(owner = "client!vt", name = "a", descriptor = "(Z)V")
	public static void method5476() {
		for (@Pc(6) Class2_Sub41 local6 = (Class2_Sub41) Static148.aClass156_15.method3155(); local6 != null; local6 = (Class2_Sub41) Static148.aClass156_15.method3150()) {
			if (Static309.aClass270ArrayArrayArray3 == null) {
				local6.method5703();
			} else {
				@Pc(28) int local28;
				@Pc(169) Class3_Sub2 local169;
				@Pc(182) Class3_Sub2_Sub1 local182;
				@Pc(87) Class3_Sub5 local87;
				@Pc(130) Class3_Sub4 local130;
				@Pc(43) Class3_Sub3 local43;
				@Pc(100) Class3_Sub5_Sub3 local100;
				@Pc(56) Class3_Sub3_Sub1 local56;
				if (local6.anInt6956 <= Static266.anInt4392) {
					local28 = Static235.anIntArray329[local6.anInt6972];
					if (local28 == 0) {
						local169 = Static113.method1718(local6.anInt6957, local6.anInt6960, local6.anInt6958);
						if (local169 instanceof Class3_Sub2_Sub1) {
							Static415.method5248(local6.anInt6957, local6.anInt6960, local6.anInt6958);
							local182 = (Class3_Sub2_Sub1) local169;
							if (local182.aClass3_Sub2_1 != null) {
								Static53.method741(local6.anInt6957, local6.anInt6960, local6.anInt6958, local182.aClass3_Sub2_1, null);
							}
						}
					} else if (local28 == 1) {
						local43 = Static333.method4460(local6.anInt6957, local6.anInt6960, local6.anInt6958);
						if (local43 instanceof Class3_Sub3_Sub1) {
							Static170.method2388(local6.anInt6957, local6.anInt6960, local6.anInt6958);
							local56 = (Class3_Sub3_Sub1) local43;
							if (local56.aClass3_Sub3_1 != null) {
								Static277.method3723(local6.anInt6957, local6.anInt6960, local6.anInt6958, local56.aClass3_Sub3_1, null);
							}
						}
					} else if (local28 == 2) {
						local130 = Static144.method2120(local6.anInt6957, local6.anInt6960, local6.anInt6958, bn.class);
						if (local130 instanceof Class3_Sub4_Sub2) {
							Static152.method2186(local6.anInt6957, local6.anInt6960, local6.anInt6958, bn.class);
							@Pc(151) Class3_Sub4_Sub2 local151 = (Class3_Sub4_Sub2) local130;
							if (local151.aClass3_Sub4_1 != null) {
								Static249.method3169(local151.aClass3_Sub4_1, false);
							}
						}
					} else if (local28 == 3) {
						local87 = Static350.method4653(local6.anInt6957, local6.anInt6960, local6.anInt6958);
						if (local87 instanceof Class3_Sub5_Sub3) {
							Static22.method265(local6.anInt6957, local6.anInt6960, local6.anInt6958);
							local100 = (Class3_Sub5_Sub3) local87;
							if (local100.aClass3_Sub5_1 != null) {
								Static392.method5009(local6.anInt6957, local6.anInt6960, local6.anInt6958, local100.aClass3_Sub5_1);
							}
						}
					}
					local6.method5703();
				} else if (local6.anInt6970 == Static266.anInt4392) {
					local28 = Static235.anIntArray329[local6.anInt6972];
					if (local28 == 0) {
						local169 = Static113.method1718(local6.anInt6957, local6.anInt6960, local6.anInt6958);
						if (local169 instanceof Class3_Sub2_Sub1) {
							local6.method5703();
						} else if (Static4.method75(local6.anInt6957, local6.anInt6960, local6.anInt6958) == null) {
							local182 = new Class3_Sub2_Sub1(local6.anInt6972, local6.anInt6964, local6.anInt6962, local6.anInt6959, local6.anInt6973, local169);
							Static53.method741(local6.anInt6957, local6.anInt6960, local6.anInt6958, local182, null);
						} else {
							local6.method5703();
						}
					} else if (local28 == 1) {
						local43 = Static333.method4460(local6.anInt6957, local6.anInt6960, local6.anInt6958);
						if (local43 instanceof Class3_Sub3_Sub1) {
							local6.method5703();
						} else if (Static89.method1409(local6.anInt6957, local6.anInt6960, local6.anInt6958) == null) {
							local56 = new Class3_Sub3_Sub1(local6.anInt6972, local6.anInt6964, local6.anInt6962, local6.anInt6959, local6.anInt6973, local43);
							Static277.method3723(local6.anInt6957, local6.anInt6960, local6.anInt6958, local56, null);
						} else {
							local6.method5703();
						}
					} else if (local28 == 2) {
						local130 = Static144.method2120(local6.anInt6957, local6.anInt6960, local6.anInt6958, bn.class);
						if (local130 instanceof Class3_Sub4_Sub2) {
							local6.method5703();
						} else {
							Static152.method2186(local6.anInt6957, local6.anInt6960, local6.anInt6958, bn.class);
							@Pc(266) Class192 local266 = Static50.aClass190_1.method4218(local6.anInt6963);
							@Pc(280) int local280;
							@Pc(277) int local277;
							if (local6.anInt6964 == 1 || local6.anInt6964 == 3) {
								local277 = local266.anInt5321;
								local280 = local266.anInt5355;
							} else {
								local277 = local266.anInt5355;
								local280 = local266.anInt5321;
							}
							@Pc(322) Class3_Sub4_Sub2 local322 = new Class3_Sub4_Sub2(local6.anInt6972, local6.anInt6964, local6.anInt6957, local6.anInt6962, local6.anInt6959, local6.anInt6973, local6.anInt6960, local6.anInt6960 + local280 - 1, local6.anInt6958, local277 + local6.anInt6958 - 1, local130);
							Static249.method3169(local322, false);
						}
					} else if (local28 == 3) {
						local87 = Static350.method4653(local6.anInt6957, local6.anInt6960, local6.anInt6958);
						if (local87 instanceof Class3_Sub5_Sub3) {
							local6.method5703();
						} else {
							local100 = new Class3_Sub5_Sub3(local6.anInt6962, local6.anInt6959, local6.anInt6973, local87);
							Static392.method5009(local6.anInt6957, local6.anInt6960, local6.anInt6958, local100);
						}
					}
				}
			}
		}
	}
}
