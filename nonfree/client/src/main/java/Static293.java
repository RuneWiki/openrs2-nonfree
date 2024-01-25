import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static293 {

	@OriginalMember(owner = "client!or", name = "D", descriptor = "I")
	public static int anInt345;

	@OriginalMember(owner = "client!or", name = "I", descriptor = "I")
	public static int anInt349;

	@OriginalMember(owner = "client!or", name = "F", descriptor = "Z")
	public static boolean aBoolean13 = false;

	@OriginalMember(owner = "client!or", name = "c", descriptor = "(Z)V")
	public static void method297() {
		Static317.anInt2331 = -1;
		Static164.anInt3282 = 0;
		Static65.anInt2233 = 0;
		Static149.anInt3065 = 1;
		Static311.anInt5426 = 0;
		Static107.anInt2300 = -3;
		Static327.aBoolean352 = false;
	}

	@OriginalMember(owner = "client!or", name = "a", descriptor = "([[[Lclient!hg;I)V")
	public static void method298(@OriginalArg(0) Class101[][][] arg0) {
		for (@Pc(11) int local11 = 0; local11 < arg0.length; local11++) {
			@Pc(17) Class101[][] local17 = arg0[local11];
			for (@Pc(19) int local19 = 0; local19 < local17.length; local19++) {
				for (@Pc(23) int local23 = 0; local23 < local17[local19].length; local23++) {
					@Pc(31) Class101 local31 = local17[local19][local23];
					if (local31 != null) {
						if (local31.aClass3_Sub5_1 instanceof Interface10) {
							((Interface10) local31.aClass3_Sub5_1).method5324();
						}
						if (local31.aClass3_Sub1_2 instanceof Interface10) {
							((Interface10) local31.aClass3_Sub1_2).method5324();
						}
						if (local31.aClass3_Sub1_3 instanceof Interface10) {
							((Interface10) local31.aClass3_Sub1_3).method5324();
						}
						if (local31.aClass3_Sub3_2 instanceof Interface10) {
							((Interface10) local31.aClass3_Sub3_2).method5324();
						}
						if (local31.aClass3_Sub3_1 instanceof Interface10) {
							((Interface10) local31.aClass3_Sub3_1).method5324();
						}
						for (@Pc(85) Class145 local85 = local31.aClass145_1; local85 != null; local85 = local85.aClass145_2) {
							@Pc(90) Class3_Sub2 local90 = local85.aClass3_Sub2_2;
							if (local90 instanceof Interface10) {
								((Interface10) local90).method5324();
							}
						}
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!or", name = "a", descriptor = "(ZI)V")
	public static void method299() {
		Static403.method5961(Static352.aClass92_123);
		for (@Pc(17) Class6_Sub9 local17 = (Class6_Sub9) Static432.aClass74_33.method1889(); local17 != null; local17 = (Class6_Sub9) Static432.aClass74_33.method1881()) {
			if (!local17.method6531()) {
				local17 = (Class6_Sub9) Static432.aClass74_33.method1889();
				if (local17 == null) {
					break;
				}
			}
			if (local17.anInt1506 == 0) {
				Static37.method917(true, true, local17);
			}
		}
		if (Static100.aClass239_4 != null) {
			Static437.method6328(Static100.aClass239_4);
			Static100.aClass239_4 = null;
		}
	}

	@OriginalMember(owner = "client!or", name = "a", descriptor = "(IZII)V")
	public static void method301(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		if (arg0 == 0) {
			Static403.method5961(Static393.aClass92_140);
		}
		if (arg0 == 1) {
			Static403.method5961(Static143.aClass92_52);
		}
		Static109.aClass6_Sub1_Sub1_5.method6479(arg1 + Static348.anInt6273);
		Static109.aClass6_Sub1_Sub1_5.method6453(arg2 + Static2.anInt6396);
		Static109.aClass6_Sub1_Sub1_5.method6437(Static54.aClass187_1.method4602(82) ? 1 : 0);
		Static346.anInt6243 = arg1;
		Static409.aBoolean467 = false;
		Static114.anInt5655 = arg2;
		Static97.method1811();
	}
}
