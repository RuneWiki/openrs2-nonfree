import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static339 {

	@OriginalMember(owner = "client!nw", name = "k", descriptor = "Lclient!wf;")
	public static Class318 aClass318_3;

	@OriginalMember(owner = "client!nw", name = "l", descriptor = "I")
	public static int anInt5660;

	@OriginalMember(owner = "client!nw", name = "hb", descriptor = "I")
	public static int anInt5664;

	@OriginalMember(owner = "client!nw", name = "d", descriptor = "Lclient!kca;")
	public static final Class158 aClass158_72 = new Class158(54, 7);

	@OriginalMember(owner = "client!nw", name = "f", descriptor = "Z")
	public static volatile boolean aBoolean364 = true;

	@OriginalMember(owner = "client!nw", name = "h", descriptor = "I")
	public static int anInt5659 = 0;

	@OriginalMember(owner = "client!nw", name = "j", descriptor = "Lclient!ig;")
	public static final Class133 aClass133_99 = new Class133(61, 9);

	@OriginalMember(owner = "client!nw", name = "bb", descriptor = "[I")
	public static final int[] anIntArray501 = new int[2];

	@OriginalMember(owner = "client!nw", name = "a", descriptor = "(I)V")
	public static void method4759() {
		Static320.method5153(Static7.aClass3_Sub15_Sub1_1.aBoolean592);
		Static240.aClass3_Sub9_Sub1_1 = new Class3_Sub9_Sub1();
		Static240.aClass3_Sub9_Sub1_1.method1203();
		Static62.aClass43_7 = Static299.method4965(Static549.aCanvas15, 22050, 0, Static401.aClass285_11);
		Static62.aClass43_7.method7027(Static240.aClass3_Sub9_Sub1_1);
		Static139.method2456(Static402.aClass161_107, Static135.aClass161_28, Static365.aClass161_80, Static240.aClass3_Sub9_Sub1_1);
		Static351.aClass43_5 = Static299.method4965(Static549.aCanvas15, 2048, 1, Static401.aClass285_11);
		Static530.aClass3_Sub9_Sub3_2 = new Class3_Sub9_Sub3();
		Static351.aClass43_5.method7027(Static530.aClass3_Sub9_Sub3_2);
		Static233.aClass270_1 = new Class270(22050, Static361.anInt6755);
		Static311.anInt6054 = Static460.aClass161_42.method4240("scape main");
	}

	@OriginalMember(owner = "client!nw", name = "b", descriptor = "(I)V")
	public static void method4760() {
		Static90.aClass3_Sub27_Sub1_1.method4533();
		@Pc(18) int local18 = Static90.aClass3_Sub27_Sub1_1.method4536(8);
		@Pc(27) int local27;
		if (Static221.anInt4798 > local18) {
			for (local27 = local18; local27 < Static221.anInt4798; local27++) {
				Static46.anIntArray144[Static5.anInt459++] = Static3.anIntArray80[local27];
			}
		}
		if (Static221.anInt4798 < local18) {
			throw new RuntimeException("gnpov1");
		}
		Static221.anInt4798 = 0;
		for (local27 = 0; local27 < local18; local27++) {
			@Pc(61) int local61 = Static3.anIntArray80[local27];
			@Pc(69) Class6_Sub1_Sub2_Sub2 local69 = ((Class3_Sub3) Static240.aClass267_20.method6644((long) local61)).aClass6_Sub1_Sub2_Sub2_1;
			@Pc(74) int local74 = Static90.aClass3_Sub27_Sub1_1.method4536(1);
			if (local74 == 0) {
				Static3.anIntArray80[Static221.anInt4798++] = local61;
				local69.lb = Static223.anInt4829;
			} else {
				@Pc(97) int local97 = Static90.aClass3_Sub27_Sub1_1.method4536(2);
				if (local97 == 0) {
					Static3.anIntArray80[Static221.anInt4798++] = local61;
					local69.lb = Static223.anInt4829;
					Static102.anIntArray528[Static329.anInt6289++] = local61;
				} else {
					@Pc(139) int local139;
					@Pc(149) int local149;
					if (local97 == 1) {
						Static3.anIntArray80[Static221.anInt4798++] = local61;
						local69.lb = Static223.anInt4829;
						local139 = Static90.aClass3_Sub27_Sub1_1.method4536(3);
						local69.method7091(local139, 1);
						local149 = Static90.aClass3_Sub27_Sub1_1.method4536(1);
						if (local149 == 1) {
							Static102.anIntArray528[Static329.anInt6289++] = local61;
						}
					} else if (local97 == 2) {
						Static3.anIntArray80[Static221.anInt4798++] = local61;
						local69.lb = Static223.anInt4829;
						if (Static90.aClass3_Sub27_Sub1_1.method4536(1) == 1) {
							local139 = Static90.aClass3_Sub27_Sub1_1.method4536(3);
							local69.method7091(local139, 2);
							local149 = Static90.aClass3_Sub27_Sub1_1.method4536(3);
							local69.method7091(local149, 2);
						} else {
							local139 = Static90.aClass3_Sub27_Sub1_1.method4536(3);
							local69.method7091(local139, 0);
						}
						local139 = Static90.aClass3_Sub27_Sub1_1.method4536(1);
						if (local139 == 1) {
							Static102.anIntArray528[Static329.anInt6289++] = local61;
						}
					} else if (local97 == 3) {
						Static46.anIntArray144[Static5.anInt459++] = local61;
					}
				}
			}
		}
	}
}
