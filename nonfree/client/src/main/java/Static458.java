import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static458 {

	@OriginalMember(owner = "client!rf", name = "e", descriptor = "Lclient!nw;")
	public static final Class236 aClass236_4 = new Class236();

	@OriginalMember(owner = "client!rf", name = "f", descriptor = "Z")
	public static boolean aBoolean624 = false;

	@OriginalMember(owner = "client!rf", name = "a", descriptor = "(I)V")
	public static void method6491() {
		if (Static79.aClass14_1 != null) {
			Static79.aClass14_1.method5521();
		}
		if (Static417.aClass14_2 != null) {
			Static417.aClass14_2.method5521();
		}
	}

	@OriginalMember(owner = "client!rf", name = "a", descriptor = "(ILclient!bfa;)V")
	public static void method6492(@OriginalArg(1) Class2_Sub5 arg0) {
		if (!Static167.aBoolean291) {
			arg0.method7966();
			Static347.anInt6255--;
		}
	}

	@OriginalMember(owner = "client!rf", name = "a", descriptor = "(ZLclient!r;ZLclient!sa;Lclient!la;Ljava/lang/String;)V")
	public static void method6493(@OriginalArg(1) Class100 arg0, @OriginalArg(2) boolean arg1, @OriginalArg(3) Class294 arg2, @OriginalArg(4) Class29 arg3, @OriginalArg(5) String arg4) {
		@Pc(22) boolean local22 = !Static212.aBoolean333 || Static259.method4034();
		if (!local22) {
			return;
		}
		@Pc(36) int local36;
		@Pc(45) int local45;
		if (Static212.aBoolean333 && local22) {
			@Pc(145) Class294 local145 = Static289.aClass294_7;
			@Pc(151) Class29 local151 = arg0.method6225(local145, Static540.aClass13Array1);
			local36 = local145.method6722(arg4, null, 250);
			local45 = local145.method6727(250, local145.anInt8122, arg4, null);
			@Pc(170) int local170 = Static45.aClass13_1.anInt427;
			@Pc(174) int local174 = local170 + 4;
			local45 += local174 * 2;
			local36 += local174 * 2;
			if (local36 < Static378.anInt6703) {
				local36 = Static378.anInt6703;
			}
			if (Static164.anInt3481 > local45) {
				local45 = Static164.anInt3481;
			}
			@Pc(208) int local208 = Static168.aClass62_5.method1173(Static26.anInt651, local36) + Static305.anInt5435;
			@Pc(216) int local216 = Static21.aClass279_4.method6456(Static554.anInt9119, local45) + Static506.anInt8462;
			arg0.method6256(Static205.aClass13_2, false).DA(Static499.aClass13_3.anInt427 + local208, local216 + Static499.aClass13_3.anInt428, local36 - Static499.aClass13_3.anInt427 * 2, local45 + -(Static499.aClass13_3.anInt428 * 2), 1, 0, 0);
			arg0.method6256(Static499.aClass13_3, true).method7851(local208, local216);
			Static499.aClass13_3.method246();
			arg0.method6256(Static499.aClass13_3, true).method7851(local208 + local36 - local170, local216);
			Static499.aClass13_3.method258();
			arg0.method6256(Static499.aClass13_3, true).method7851(local208 + local36 - local170, local45 + local216 + -local170);
			Static499.aClass13_3.method246();
			arg0.method6256(Static499.aClass13_3, true).method7851(local208, local45 + local216 - local170);
			Static499.aClass13_3.method258();
			arg0.method6256(Static45.aClass13_1, true).method7860(local208, Static499.aClass13_3.anInt428 + local216, local170, local45 - Static499.aClass13_3.anInt428 * 2);
			Static45.aClass13_1.method256();
			arg0.method6256(Static45.aClass13_1, true).method7860(local208 + Static499.aClass13_3.anInt427, local216, local36 - Static499.aClass13_3.anInt427 * 2, local170);
			Static45.aClass13_1.method256();
			arg0.method6256(Static45.aClass13_1, true).method7860(local36 + local208 - local170, local216 + Static499.aClass13_3.anInt428, local170, local45 - Static499.aClass13_3.anInt428 * 2);
			Static45.aClass13_1.method256();
			arg0.method6256(Static45.aClass13_1, true).method7860(local208 + Static499.aClass13_3.anInt427, -local170 + local216 + local45, local36 - Static499.aClass13_3.anInt427 * 2, local170);
			Static45.aClass13_1.method256();
			local151.method7104(-1, 0, null, local36 - local174 * 2, arg4, Static432.anInt7309 | 0xFF000000, 1, 1, local45 - local174 * 2, null, null, 0, 0, local216 + local174, local174 + local208);
			Static50.method898(local36, local216, local45, local208);
		} else {
			local36 = arg2.method6722(arg4, null, 250);
			local45 = arg2.method6726(250, arg4, null) * 13;
			arg0.J(6, 6, local36 + 4 + 4, local45 + 4 - -4, -16777216, 0);
			arg0.method6212(6, 6, local36 + 4 + 4, local45 + 4 + 4, -1, 0);
			arg3.method7104(-1, 0, null, local36, arg4, -1, 1, 1, local45, null, null, 0, 0, 10, 10);
			Static50.method898(local36 + 4 + 4, 6, local45 + 4 + 4, 6);
		}
		if (arg1) {
			try {
				arg0.method6238();
			} catch (@Pc(440) Exception_Sub1 local440) {
			}
		}
	}
}
