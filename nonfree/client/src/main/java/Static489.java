import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static489 {

	@OriginalMember(owner = "client!qp", name = "a", descriptor = "I")
	public static int anInt8199 = -1;

	@OriginalMember(owner = "client!qp", name = "c", descriptor = "[I")
	public static final int[] anIntArray456 = new int[] { 32, 39, 44, 47 };

	@OriginalMember(owner = "client!qp", name = "a", descriptor = "(Lclient!mq;ILclient!mq;)V")
	public static void method7017(@OriginalArg(0) Class28 arg0, @OriginalArg(2) Class28 arg1) {
		if (arg0.aClass28_67 != null) {
			arg0.method9022();
		}
		arg0.aClass28_68 = arg1;
		arg0.aClass28_67 = arg1.aClass28_67;
		arg0.aClass28_67.aClass28_68 = arg0;
		arg0.aClass28_68.aClass28_67 = arg0;
	}

	@OriginalMember(owner = "client!qp", name = "a", descriptor = "(II)V")
	public static void method7018(@OriginalArg(1) int arg0) {
		@Pc(9) Class5_Sub3_Sub17 local9 = Static358.method5408(4, (long) arg0);
		local9.method7288();
	}

	@OriginalMember(owner = "client!qp", name = "d", descriptor = "(I)V")
	public static void method7019() {
		@Pc(12) Class5_Sub21 local12 = Static64.method905(Static263.aClass49_1, Static595.aClass305_96);
		local12.aClass5_Sub41_Sub2_1.method7798(0);
		Static495.method7092(local12);
	}

	@OriginalMember(owner = "client!qp", name = "e", descriptor = "(I)V")
	public static void method7020() {
		if (Static63.anInt977 < 0) {
			return;
		}
		@Pc(13) long local13 = Static547.method7619();
		Static63.anInt977 = (int) ((long) Static63.anInt977 + Static56.aLong29 - local13);
		if (Static63.anInt977 <= 0) {
			Static282.aClass57_1 = Static368.aClass347_2.aClass57_5;
			Static542.aFloat122 = Static368.aClass347_2.aFloat201;
			Static349.aFloat121 = Static368.aClass347_2.aFloat200;
			Static146.anInt2996 = Static368.aClass347_2.anInt9687;
			Static390.anInt6936 = Static368.aClass347_2.anInt9684;
			Static176.aFloat86 = Static368.aClass347_2.aFloat199;
			Static360.aFloat123 = Static368.aClass347_2.aFloat198;
			Static17.aFloat1 = Static368.aClass347_2.aFloat197;
			Static416.aFloat143 = Static368.aClass347_2.aFloat196;
			Static63.anInt977 = -1;
			Static149.anInt3071 = Static368.aClass347_2.anInt9688;
		} else {
			@Pc(66) int local66 = (Static63.anInt977 << 8) / Static404.anInt7177;
			@Pc(71) int local71 = 255 - local66;
			@Pc(76) float local76 = (float) local66 / 255.0F;
			Static390.anInt6936 = (local66 * (Static154.anInt3150 & 0xFF00) + (Static368.aClass347_2.anInt9684 & 0xFF00) * local71 & 0xFF0000) + (local66 * (Static154.anInt3150 & 0xFF00FF) + (local71 * (Static368.aClass347_2.anInt9684 & 0xFF00FF)) & 0xFF00FF00) >>> 8;
			@Pc(113) float local113 = 1.0F - local76;
			Static416.aFloat143 = (Static368.aClass347_2.aFloat196 - Static376.aFloat213) * local113 + Static376.aFloat213;
			Static176.aFloat86 = Static466.aFloat163 + (Static368.aClass347_2.aFloat199 - Static466.aFloat163) * local113;
			Static146.anInt2996 = ((Static368.aClass347_2.anInt9687 & 0xFF00FF) * local71 + (Static189.anInt3684 & 0xFF00FF) * local66 & 0xFF00FF00) + (local66 * (Static189.anInt3684 & 0xFF00) + ((Static368.aClass347_2.anInt9687 & 0xFF00) * local71) & 0xFF0000) >>> 8;
			Static542.aFloat122 = Static246.aFloat93 + (Static368.aClass347_2.aFloat201 - Static246.aFloat93) * local113;
			Static149.anInt3071 = local71 * Static368.aClass347_2.anInt9688 + local66 * Static2.anInt7 >> 8;
			Static349.aFloat121 = (Static368.aClass347_2.aFloat200 - Static667.aFloat214) * local113 + Static667.aFloat214;
			Static17.aFloat1 = Static527.aFloat188 + local113 * (Static368.aClass347_2.aFloat197 - Static527.aFloat188);
			Static360.aFloat123 = Static226.aFloat202 + local113 * (Static368.aClass347_2.aFloat198 - Static226.aFloat202);
			if (Static368.aClass347_2.aClass57_5 != Static484.aClass57_4) {
				Static282.aClass57_1 = Static367.aClass65_11.method6949(Static484.aClass57_4, Static368.aClass347_2.aClass57_5, local113, Static282.aClass57_1);
			}
		}
		Static56.aLong29 = local13;
	}
}
