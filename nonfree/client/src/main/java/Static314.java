import java.lang.reflect.Method;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static314 {

	@OriginalMember(owner = "client!rq", name = "C", descriptor = "Lclient!uq;")
	public static Class134_Sub1 aClass134_Sub1_3;

	@OriginalMember(owner = "client!rq", name = "J", descriptor = "F")
	public static float aFloat90;

	@OriginalMember(owner = "client!rq", name = "P", descriptor = "[Lclient!aq;")
	public static Class5[] aClass5Array15;

	@OriginalMember(owner = "client!rq", name = "T", descriptor = "[Lclient!aq;")
	public static Class5[] aClass5Array16;

	@OriginalMember(owner = "client!rq", name = "W", descriptor = "I")
	public static int anInt5577;

	@OriginalMember(owner = "client!rq", name = "H", descriptor = "Lclient!cs;")
	public static final Class41 aClass41_167 = new Class41(45, 3);

	@OriginalMember(owner = "client!rq", name = "V", descriptor = "I")
	public static int anInt5576 = 64;

	@OriginalMember(owner = "client!rq", name = "a", descriptor = "(III)V")
	public static void method4879(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(8) int local8 = Static267.aClass12_Sub1_Sub2_Sub2_1.anIntArray659[0];
		@Pc(17) int local17 = Static267.aClass12_Sub1_Sub2_Sub2_1.anIntArray658[0];
		if (Static209.aClass48_2 == Static77.aClass48_1) {
			if (!Static201.method4206(1, false, 0, local17, arg0, 1, local8, arg1, -2, 0)) {
				Static201.method4206(1, false, 0, local17, arg0, 1, local8, arg1, -3, 0);
			}
		} else if (!Static201.method4206(1, false, 0, local17, arg0, 1, local8, arg1, -3, 0)) {
			Static201.method4206(1, false, 0, local17, arg0, 1, local8, arg1, -2, 0);
		}
	}

	@OriginalMember(owner = "client!rq", name = "a", descriptor = "(ILjava/lang/String;)V")
	public static void method4881(@OriginalArg(1) String arg0) {
		if (arg0 == null) {
			return;
		}
		if (Static244.anInt1014 >= 100 && !Static118.aBoolean180 || Static244.anInt1014 >= 200) {
			Static366.method5530(Static269.aClass221_167.method5229(Static189.anInt5185));
			return;
		}
		@Pc(29) String local29 = Static236.method3861(arg0);
		if (local29 == null) {
			return;
		}
		@Pc(74) String local74;
		for (@Pc(34) int local34 = 0; local34 < Static244.anInt1014; local34++) {
			@Pc(42) String local42 = Static236.method3861(Static340.aStringArray38[local34]);
			if (local42 != null && local42.equals(local29)) {
				Static366.method5530(arg0 + Static67.aClass221_49.method5229(Static189.anInt5185));
				return;
			}
			if (Static278.aStringArray8[local34] != null) {
				local74 = Static236.method3861(Static278.aStringArray8[local34]);
				if (local74 != null && local74.equals(local29)) {
					Static366.method5530(arg0 + Static67.aClass221_49.method5229(Static189.anInt5185));
					return;
				}
			}
		}
		for (@Pc(100) int local100 = 0; local100 < Static379.anInt1197; local100++) {
			local74 = Static236.method3861(Static235.aStringArray28[local100]);
			if (local74 != null && local74.equals(local29)) {
				Static366.method5530(Static133.aClass221_94.method5229(Static189.anInt5185) + arg0 + Static8.aClass221_9.method5229(Static189.anInt5185));
				return;
			}
			if (Static184.aStringArray42[local100] != null) {
				@Pc(147) String local147 = Static236.method3861(Static184.aStringArray42[local100]);
				if (local147 != null && local147.equals(local29)) {
					Static366.method5530(Static133.aClass221_94.method5229(Static189.anInt5185) + arg0 + Static8.aClass221_9.method5229(Static189.anInt5185));
					return;
				}
			}
		}
		if (Static236.method3861(Static267.aClass12_Sub1_Sub2_Sub2_1.aString51).equals(local29)) {
			Static366.method5530(Static345.aClass221_217.method5229(Static189.anInt5185));
		} else {
			Static19.method552(Static377.aClass41_201);
			Static39.aClass2_Sub13_Sub2_4.method4207(Static346.method5273(arg0));
			Static39.aClass2_Sub13_Sub2_4.method4230(arg0);
		}
	}

	@OriginalMember(owner = "client!rq", name = "c", descriptor = "(B)V")
	public static void method4882() {
		try {
			@Pc(20) Method local20 = Runtime.class.getMethod("availableProcessors");
			if (local20 != null) {
				try {
					@Pc(24) Runtime local24 = Runtime.getRuntime();
					@Pc(30) Integer local30 = (Integer) local20.invoke(local24, (Object[]) null);
					Static78.anInt1502 = local30;
				} catch (@Pc(35) Throwable local35) {
				}
			}
		} catch (@Pc(37) Exception local37) {
		}
	}

	@OriginalMember(owner = "client!rq", name = "a", descriptor = "(BLclient!fc;Lclient!km;)V")
	public static void method4885(@OriginalArg(1) Class71 arg0, @OriginalArg(2) Class82 arg1) {
		if (Static229.aBoolean457) {
			return;
		}
		arg1.method4481(0);
		Static248.aClass5_6 = arg1.method4514(Static404.method5316(arg0, Static10.anInt310));
		Static248.aClass5_6.method5004((Static335.anInt5875 - Static248.aClass5_6.method4990()) / 2, (Static263.anInt4662 - Static248.aClass5_6.method4992()) / 2);
		Static208.aClass5_3 = arg1.method4514(Static404.method5316(arg0, Static58.anInt5536));
		Static208.aClass5_3.method5004((Static335.anInt5875 - Static208.aClass5_3.method4990()) / 2, 18);
		Static229.aBoolean457 = true;
	}
}
