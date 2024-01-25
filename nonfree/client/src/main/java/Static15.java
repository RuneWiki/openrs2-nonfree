import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static15 {

	@OriginalMember(owner = "client!an", name = "y", descriptor = "F")
	public static float aFloat2;

	@OriginalMember(owner = "client!an", name = "z", descriptor = "Lclient!nk;")
	public static final Class177 aClass177_3 = new Class177(62, 18);

	@OriginalMember(owner = "client!an", name = "C", descriptor = "I")
	public static int anInt219 = 13156520;

	@OriginalMember(owner = "client!an", name = "a", descriptor = "(Lclient!ch;ZI)V")
	public static void method166(@OriginalArg(0) Class30_Sub1_Sub1_Sub2 arg0, @OriginalArg(1) boolean arg1) {
		if (Static126.anInt2794 >= 400) {
			return;
		}
		if (Static429.aClass30_Sub1_Sub1_Sub2_2 != arg0) {
			@Pc(75) String local75;
			@Pc(121) int local121;
			if (arg0.anInt1347 == 0) {
				@Pc(79) boolean local79 = true;
				if (Static429.aClass30_Sub1_Sub1_Sub2_2.anInt1337 != -1 && arg0.anInt1337 != -1) {
					@Pc(100) int local100 = Static429.aClass30_Sub1_Sub1_Sub2_2.anInt1348 > arg0.anInt1348 ? Static429.aClass30_Sub1_Sub1_Sub2_2.anInt1348 : arg0.anInt1348;
					@Pc(111) int local111 = Static429.aClass30_Sub1_Sub1_Sub2_2.anInt1337 < arg0.anInt1337 ? Static429.aClass30_Sub1_Sub1_Sub2_2.anInt1337 : arg0.anInt1337;
					local121 = local111 + local100 * 10 / 100 + 5;
					@Pc(128) int local128 = Static429.aClass30_Sub1_Sub1_Sub2_2.anInt1348 - arg0.anInt1348;
					if (local128 < 0) {
						local128 = -local128;
					}
					if (local128 > local121) {
						local79 = false;
					}
				}
				@Pc(154) String local154 = Static268.aClass272_4 == Static266.aClass272_3 ? Static272.aClass158_134.method3594(Static365.anInt6682) : Static299.aClass158_27.method3594(Static365.anInt6682);
				if (arg0.anInt1344 <= arg0.anInt1348) {
					local75 = arg0.method962() + (local79 ? Static433.method6158(arg0.anInt1348, Static429.aClass30_Sub1_Sub1_Sub2_2.anInt1348) : "<col=ffffff>") + " (" + local154 + arg0.anInt1348 + ")";
				} else {
					local75 = arg0.method962() + (local79 ? Static433.method6158(arg0.anInt1348, Static429.aClass30_Sub1_Sub1_Sub2_2.anInt1348) : "<col=ffffff>") + " (" + local154 + arg0.anInt1348 + "+" + (arg0.anInt1344 - arg0.anInt1348) + ")";
				}
			} else {
				local75 = arg0.method962() + " (" + Static4.aClass158_4.method3594(Static365.anInt6682) + arg0.anInt1347 + ")";
			}
			if (Static293.aBoolean300) {
				if (!arg1 && (Static439.anInt7742 & 0x8) != 0) {
					Static453.method6150(46, true, false, Static263.anInt5067, -1, 0, (long) arg0.anInt1299, 0, Static1.aString1, Static90.aString17 + " -> <col=ffffff>" + local75);
				}
			} else if (arg1) {
				Static453.method6150(-1, false, true, -1, 0, 0, 0L, 0, "<col=cccccc>" + local75, "");
			} else {
				for (@Pc(235) int local235 = 7; local235 >= 0; local235--) {
					if (Static264.aStringArray35[local235] != null) {
						@Pc(243) short local243 = 0;
						if (Static268.aClass272_4 == Static181.aClass272_2 && Static264.aStringArray35[local235].equalsIgnoreCase(Static417.aClass158_201.method3594(Static365.anInt6682))) {
							if (arg0.anInt1348 > Static429.aClass30_Sub1_Sub1_Sub2_2.anInt1348) {
								local243 = 2000;
							}
							if (Static429.aClass30_Sub1_Sub1_Sub2_2.anInt1330 != 0 && arg0.anInt1330 != 0) {
								if (arg0.anInt1330 == Static429.aClass30_Sub1_Sub1_Sub2_2.anInt1330) {
									local243 = 2000;
								} else {
									local243 = 0;
								}
							}
						} else if (Static155.aBooleanArray15[local235]) {
							local243 = 2000;
						}
						@Pc(301) short local301 = (short) (Static66.aShortArray37[local235] + local243);
						local121 = Static359.anIntArray613[local235] == -1 ? Static306.anInt5748 : Static359.anIntArray613[local235];
						Static453.method6150(local301, true, false, local121, -1, 0, (long) arg0.anInt1299, 0, Static264.aStringArray35[local235], "<col=ffffff>" + local75);
					}
				}
			}
			if (!arg1) {
				for (@Pc(407) Class1_Sub35 local407 = (Class1_Sub35) Static401.aClass203_47.method4548(); local407 != null; local407 = (Class1_Sub35) Static401.aClass203_47.method4545()) {
					if (local407.anInt5839 == 23) {
						local407.aString54 = "<col=ffffff>" + local75;
						return;
					}
				}
			}
		} else if (Static293.aBoolean300 && (Static439.anInt7742 & 0x10) != 0) {
			Static453.method6150(16, true, false, Static263.anInt5067, -1, 0, 0L, 0, Static1.aString1, Static90.aString17 + " -> <col=ffffff>" + Static366.aClass158_176.method3594(Static365.anInt6682));
		}
	}
}
