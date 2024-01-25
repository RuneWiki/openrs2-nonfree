import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static242 {

	@OriginalMember(owner = "client!ns", name = "H", descriptor = "I")
	public static int anInt4260;

	@OriginalMember(owner = "client!ns", name = "Q", descriptor = "I")
	public static int anInt4267;

	@OriginalMember(owner = "client!ns", name = "R", descriptor = "I")
	public static int anInt4268;

	@OriginalMember(owner = "client!ns", name = "S", descriptor = "[I")
	public static int[] anIntArray485;

	@OriginalMember(owner = "client!ns", name = "K", descriptor = "Lclient!dk;")
	public static final Class57 aClass57_68 = new Class57(" from your friend list first.", " zuerst von deiner Freunde-Liste!", " de votre liste d'amis.", " da sua lista de amigos primeiro.");

	@OriginalMember(owner = "client!ns", name = "P", descriptor = "[I")
	public static final int[] anIntArray484 = new int[13];

	@OriginalMember(owner = "client!ns", name = "c", descriptor = "(Z)V")
	public static void method3971() {
		for (@Pc(6) Class3_Sub32 local6 = (Class3_Sub32) Static35.aClass138_6.method3051(); local6 != null; local6 = (Class3_Sub32) Static35.aClass138_6.method3050()) {
			if (Static69.aClass48ArrayArrayArray1 == null) {
				local6.method5700();
			} else {
				@Pc(30) int local30;
				@Pc(98) Class28_Sub2 local98;
				@Pc(111) Class28_Sub2_Sub1 local111;
				@Pc(56) Class28_Sub1 local56;
				@Pc(133) Class28_Sub4 local133;
				@Pc(169) Class28_Sub3 local169;
				@Pc(146) Class28_Sub4_Sub3 local146;
				@Pc(182) Class28_Sub3_Sub3 local182;
				if (local6.anInt4604 <= Static76.anInt1617) {
					local30 = Static138.anIntArray275[local6.anInt4599];
					if (local30 == 0) {
						local169 = Static343.method5200(local6.anInt4608, local6.anInt4609, local6.anInt4607);
						if (local169 instanceof Class28_Sub3_Sub3) {
							Static139.method2218(local6.anInt4608, local6.anInt4609, local6.anInt4607);
							local182 = (Class28_Sub3_Sub3) local169;
							if (local182.aClass28_Sub3_3 != null) {
								Static45.method703(local6.anInt4608, local6.anInt4609, local6.anInt4607, local182.aClass28_Sub3_3, null);
							}
						}
					} else if (local30 == 1) {
						local133 = Static202.method3148(local6.anInt4608, local6.anInt4609, local6.anInt4607);
						if (local133 instanceof Class28_Sub4_Sub3) {
							Static358.method5348(local6.anInt4608, local6.anInt4609, local6.anInt4607);
							local146 = (Class28_Sub4_Sub3) local133;
							if (local146.aClass28_Sub4_3 != null) {
								Static289.method4516(local6.anInt4608, local6.anInt4609, local6.anInt4607, local146.aClass28_Sub4_3, null);
							}
						}
					} else if (local30 == 2) {
						local56 = Static30.method472(local6.anInt4608, local6.anInt4609, local6.anInt4607, gg.class);
						if (local56 instanceof Class28_Sub1_Sub2) {
							Static196.method4651(local6.anInt4608, local6.anInt4609, local6.anInt4607, gg.class);
							@Pc(77) Class28_Sub1_Sub2 local77 = (Class28_Sub1_Sub2) local56;
							if (local77.aClass28_Sub1_2 != null) {
								Static202.method3149(local77.aClass28_Sub1_2, false);
							}
						}
					} else if (local30 == 3) {
						local98 = Static277.method4347(local6.anInt4608, local6.anInt4609, local6.anInt4607);
						if (local98 instanceof Class28_Sub2_Sub1) {
							Static319.method4844(local6.anInt4608, local6.anInt4609, local6.anInt4607);
							local111 = (Class28_Sub2_Sub1) local98;
							if (local111.aClass28_Sub2_1 != null) {
								Static187.method2963(local6.anInt4608, local6.anInt4609, local6.anInt4607, local111.aClass28_Sub2_1);
							}
						}
					}
					local6.method5700();
				} else if (local6.anInt4602 == Static76.anInt1617) {
					local30 = Static138.anIntArray275[local6.anInt4599];
					if (local30 == 0) {
						local169 = Static343.method5200(local6.anInt4608, local6.anInt4609, local6.anInt4607);
						if (local169 instanceof Class28_Sub3_Sub3) {
							local6.method5700();
						} else if (Static78.method1315(local6.anInt4608, local6.anInt4609, local6.anInt4607) == null) {
							local182 = new Class28_Sub3_Sub3(local6.anInt4599, local6.anInt4617, local6.anInt4606, local6.anInt4614, local6.anInt4601, local169);
							Static45.method703(local6.anInt4608, local6.anInt4609, local6.anInt4607, local182, null);
						} else {
							local6.method5700();
						}
					} else if (local30 == 1) {
						local133 = Static202.method3148(local6.anInt4608, local6.anInt4609, local6.anInt4607);
						if (local133 instanceof Class28_Sub4_Sub3) {
							local6.method5700();
						} else if (Static16.method200(local6.anInt4608, local6.anInt4609, local6.anInt4607) == null) {
							local146 = new Class28_Sub4_Sub3(local6.anInt4599, local6.anInt4617, local6.anInt4606, local6.anInt4614, local6.anInt4601, local133);
							Static289.method4516(local6.anInt4608, local6.anInt4609, local6.anInt4607, local146, null);
						} else {
							local6.method5700();
						}
					} else if (local30 == 2) {
						local56 = Static30.method472(local6.anInt4608, local6.anInt4609, local6.anInt4607, gg.class);
						if (local56 instanceof Class28_Sub1_Sub2) {
							local6.method5700();
						} else {
							Static196.method4651(local6.anInt4608, local6.anInt4609, local6.anInt4607, gg.class);
							@Pc(326) Class60 local326 = Static97.aClass217_4.method5007(local6.anInt4615);
							@Pc(341) int local341;
							@Pc(344) int local344;
							if (local6.anInt4617 == 1 || local6.anInt4617 == 3) {
								local341 = local326.anInt1427;
								local344 = local326.anInt1390;
							} else {
								local344 = local326.anInt1427;
								local341 = local326.anInt1390;
							}
							@Pc(386) Class28_Sub1_Sub2 local386 = new Class28_Sub1_Sub2(local6.anInt4599, local6.anInt4617, local6.anInt4608, local6.anInt4606, local6.anInt4614, local6.anInt4601, local6.anInt4609, local6.anInt4609 + local341 - 1, local6.anInt4607, local6.anInt4607 + local344 - 1, local56);
							Static202.method3149(local386, false);
						}
					} else if (local30 == 3) {
						local98 = Static277.method4347(local6.anInt4608, local6.anInt4609, local6.anInt4607);
						if (local98 instanceof Class28_Sub2_Sub1) {
							local6.method5700();
						} else {
							local111 = new Class28_Sub2_Sub1(local6.anInt4606, local6.anInt4614, local6.anInt4601, local98);
							Static187.method2963(local6.anInt4608, local6.anInt4609, local6.anInt4607, local111);
						}
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!ns", name = "c", descriptor = "(II)V")
	public static void method3972(@OriginalArg(1) int arg0) {
		Static334.anInt5686 = 1000 / arg0;
	}
}
