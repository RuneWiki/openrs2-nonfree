import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static260 {

	@OriginalMember(owner = "client!rg", name = "M", descriptor = "Lclient!lm;")
	public static Class134 aClass134_121;

	@OriginalMember(owner = "client!rg", name = "P", descriptor = "I")
	public static int anInt5344;

	@OriginalMember(owner = "client!rg", name = "S", descriptor = "I")
	public static int anInt5347 = 0;

	@OriginalMember(owner = "client!rg", name = "T", descriptor = "I")
	public static int anInt5348 = 104;

	@OriginalMember(owner = "client!rg", name = "a", descriptor = "(BLclient!n;)V")
	public static void method4680(@OriginalArg(1) Class10_Sub1_Sub2_Sub2 arg0) {
		if (Static61.anInt1413 >= 400 || Static127.aClass10_Sub1_Sub2_Sub2_1 == arg0) {
			return;
		}
		@Pc(131) String local131;
		@Pc(64) int local64;
		if (arg0.anInt4110 == 0) {
			@Pc(23) boolean local23 = true;
			if (Static127.aClass10_Sub1_Sub2_Sub2_1.anInt4122 != -1 && arg0.anInt4122 != -1) {
				@Pc(42) int local42 = arg0.anInt4107 >= Static127.aClass10_Sub1_Sub2_Sub2_1.anInt4107 ? arg0.anInt4107 : Static127.aClass10_Sub1_Sub2_Sub2_1.anInt4107;
				@Pc(53) int local53 = Static127.aClass10_Sub1_Sub2_Sub2_1.anInt4122 >= arg0.anInt4122 ? arg0.anInt4122 : Static127.aClass10_Sub1_Sub2_Sub2_1.anInt4122;
				local64 = local53 + local42 * 10 / 100 + 5;
				@Pc(71) int local71 = Static127.aClass10_Sub1_Sub2_Sub2_1.anInt4107 - arg0.anInt4107;
				if (local71 < 0) {
					local71 = -local71;
				}
				if (local64 < local71) {
					local23 = false;
				}
			}
			@Pc(92) String local92 = Class10_Sub1_Sub1.lb == 1 ? Static208.aString167 : Static246.aString197;
			if (arg0.anInt4108 <= arg0.anInt4107) {
				local131 = arg0.method3424() + (local23 ? Static348.method5327(arg0.anInt4107, Static127.aClass10_Sub1_Sub2_Sub2_1.anInt4107) : "<col=ffffff>") + " (" + local92 + arg0.anInt4107 + ")";
			} else {
				local131 = arg0.method3424() + (local23 ? Static348.method5327(arg0.anInt4107, Static127.aClass10_Sub1_Sub2_Sub2_1.anInt4107) : "<col=ffffff>") + " (" + local92 + arg0.anInt4107 + "+" + (arg0.anInt4108 - arg0.anInt4107) + ")";
			}
		} else {
			local131 = arg0.method3424() + " (" + Static335.aString254 + arg0.anInt4110 + ")";
		}
		if (Static254.anInt5233 == 1) {
			Static169.method2996(0, Static318.anInt6339, Static319.aString120, (long) arg0.anInt4036, Static142.aString102 + " -> <col=ffffff>" + local131, 17, 0);
		} else if (!Static265.aBoolean456) {
			for (@Pc(226) int local226 = 7; local226 >= 0; local226--) {
				if (Static13.aStringArray2[local226] != null) {
					@Pc(234) short local234 = 0;
					if (Class10_Sub1_Sub1.lb == 0 && Static13.aStringArray2[local226].equalsIgnoreCase(Static41.aString40)) {
						if (Static127.aClass10_Sub1_Sub2_Sub2_1.anInt4107 < arg0.anInt4107) {
							local234 = 2000;
						}
						if (Static127.aClass10_Sub1_Sub2_Sub2_1.anInt4096 != 0 && arg0.anInt4096 != 0) {
							if (Static127.aClass10_Sub1_Sub2_Sub2_1.anInt4096 == arg0.anInt4096) {
								local234 = 2000;
							} else {
								local234 = 0;
							}
						}
					} else if (Static106.aBooleanArray10[local226]) {
						local234 = 2000;
					}
					@Pc(284) short local284 = (short) (local234 + Static313.aShortArray103[local226]);
					local64 = Static285.anIntArray557[local226] == -1 ? Static188.anInt3930 : Static285.anIntArray557[local226];
					Static169.method2996(0, local64, Static13.aStringArray2[local226], (long) arg0.anInt4036, "<col=ffffff>" + local131, local284, 0);
				}
			}
		} else if ((Static45.anInt1184 & 0x8) != 0) {
			Static169.method2996(0, Static224.anInt4728, Static238.aString191, (long) arg0.anInt4036, Static49.aString203 + " -> <col=ffffff>" + local131, 42, 0);
		}
		for (@Pc(360) Class1_Sub12 local360 = (Class1_Sub12) Static58.aClass14_4.method302(); local360 != null; local360 = (Class1_Sub12) Static58.aClass14_4.method313()) {
			if (local360.anInt1409 == 60) {
				local360.aString52 = "<col=ffffff>" + local131;
				break;
			}
		}
	}

	@OriginalMember(owner = "client!rg", name = "a", descriptor = "(Lclient!lm;Lclient!lm;Lclient!lm;Z)V")
	public static void method4681(@OriginalArg(0) Class134 arg0, @OriginalArg(1) Class134 arg1, @OriginalArg(2) Class134 arg2) {
		Static305.aClass134_134 = arg1;
		Static127.method2022(arg2, arg0);
	}

	@OriginalMember(owner = "client!rg", name = "a", descriptor = "(Lclient!pl;I)V")
	public static void method4682(@OriginalArg(0) Class1_Sub31 arg0) {
		arg0.aBoolean530 = false;
		if (arg0.aClass1_Sub20_5 != null) {
			arg0.aClass1_Sub20_5.anInt2540 = 0;
		}
		for (@Pc(18) Class1_Sub31 local18 = arg0.method5517(); local18 != null; local18 = arg0.method5513()) {
			method4682(local18);
		}
	}
}
