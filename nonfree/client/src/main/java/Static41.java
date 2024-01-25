import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static41 {

	@OriginalMember(owner = "client!bi", name = "G", descriptor = "I")
	public static int anInt827;

	@OriginalMember(owner = "client!bi", name = "v", descriptor = "Lclient!gca;")
	public static final Class118 aClass118_6 = new Class118(64);

	@OriginalMember(owner = "client!bi", name = "D", descriptor = "[[I")
	public static final int[][] anIntArrayArray2 = new int[][] { { 12, 12, 12, 12 }, { 12, 12, 12, 12, 12, 5 }, { 5, 5, 1, 1 }, { 5, 1, 1, 5 }, { 5, 5, 5 }, { 5, 5, 5 }, { 12, 12, 12, 12, 12, 12 }, { 1, 12, 12, 12, 12, 12 }, { 1, 1, 7, 1 }, { 8, 9, 9, 8, 8, 3, 1, 9 }, { 8, 8, 9, 8, 9, 9 }, { 10, 10, 11, 11, 11, 7, 3, 7 }, { 12, 12, 12, 12 } };

	@OriginalMember(owner = "client!bi", name = "a", descriptor = "(IIZLjava/lang/String;)V")
	public static void method665(@OriginalArg(1) int arg0, @OriginalArg(2) boolean arg1, @OriginalArg(3) String arg2) {
		Static433.method5968();
		Static383.method5125();
		Static96.method1495();
		Static344.method4623(arg2, arg1, arg0);
		Static371.method5016();
		Static355.method4778(Static192.aClass95_4);
		Static472.method6366(Static192.aClass95_4);
		Static494.method6860(Static192.aClass95_4, Static79.aClass380_22);
		Static352.method4709();
		Static106.method1599(Static176.aClass61Array5);
		Static32.method574();
		Static45.method741();
		if (Static324.anInt5145 == 3) {
			Static158.method2370(4);
		} else if (Static324.anInt5145 == 7) {
			Static158.method2370(8);
		} else if (Static324.anInt5145 == 10) {
			Static158.method2370(11);
		} else if (Static324.anInt5145 == 1 || Static324.anInt5145 == 2) {
			Static617.method8288();
		}
	}

	@OriginalMember(owner = "client!bi", name = "b", descriptor = "(Ljava/lang/String;B)V")
	public static void method666(@OriginalArg(0) String arg0) {
		if (arg0 == null) {
			return;
		}
		if (arg0.startsWith("*")) {
			arg0 = arg0.substring(1);
		}
		@Pc(20) String local20 = Static60.method906(arg0);
		if (local20 == null) {
			return;
		}
		for (@Pc(30) int local30 = 0; local30 < Static124.anInt2182; local30++) {
			@Pc(36) String local36 = Static214.aStringArray14[local30];
			if (local36.startsWith("*")) {
				local36 = local36.substring(1);
			}
			local36 = Static60.method906(local36);
			if (local36 != null && local36.equals(local20)) {
				Static124.anInt2182--;
				for (@Pc(60) int local60 = local30; local60 < Static124.anInt2182; local60++) {
					Static214.aStringArray14[local60] = Static214.aStringArray14[local60 + 1];
					Static55.aStringArray5[local60] = Static55.aStringArray5[local60 + 1];
					Static594.aStringArray45[local60] = Static594.aStringArray45[local60 + 1];
					Static198.aStringArray40[local60] = Static198.aStringArray40[local60 + 1];
					Static240.aBooleanArray14[local60] = Static240.aBooleanArray14[local60 + 1];
				}
				Static111.anInt2031 = Static542.anInt8903;
				@Pc(121) Class2_Sub40 local121 = Static464.method6285(Static251.aClass131_1, Static125.aClass179_27);
				local121.aClass2_Sub22_Sub2_2.method8537(Static154.method2286(arg0));
				local121.aClass2_Sub22_Sub2_2.method8540(arg0);
				Static528.method7295(local121);
				return;
			}
		}
	}
}
