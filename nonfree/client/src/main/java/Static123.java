import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static123 {

	@OriginalMember(owner = "client!en", name = "a", descriptor = "(II[Lclient!ps;IIZ)V")
	public static void method1656(@OriginalArg(1) int arg0, @OriginalArg(2) Class273[] arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) boolean arg4) {
		for (@Pc(15) int local15 = 0; local15 < arg1.length; local15++) {
			@Pc(21) Class273 local21 = arg1[local15];
			if (local21 != null && arg0 == local21.anInt6820) {
				Static277.method4019(arg4, arg3, arg2, local21);
				Static389.method5370(arg2, arg3, local21);
				if (local21.anInt6812 > local21.anInt6857 - local21.anInt6883) {
					local21.anInt6812 = local21.anInt6857 - local21.anInt6883;
				}
				if (local21.anInt6880 > local21.anInt6835 - local21.anInt6814) {
					local21.anInt6880 = local21.anInt6835 - local21.anInt6814;
				}
				if (local21.anInt6812 < 0) {
					local21.anInt6812 = 0;
				}
				if (local21.anInt6880 < 0) {
					local21.anInt6880 = 0;
				}
				if (local21.anInt6868 == 0) {
					Static576.method7471(arg4, local21);
				}
			}
		}
	}

	@OriginalMember(owner = "client!en", name = "a", descriptor = "(IZII)V")
	public static void method1657(@OriginalArg(1) boolean arg0) {
		Static345.anInt5965 = 2;
		Static517.aBoolean697 = arg0;
		Static591.anInt9580 = 22050;
	}

	@OriginalMember(owner = "client!en", name = "b", descriptor = "(I)V")
	public static void method1659() {
		Static186.aClass21_30.method313();
	}

	@OriginalMember(owner = "client!en", name = "c", descriptor = "(I)I")
	public static int method1660() {
		if (Class12_Sub2_Sub1_Sub3.lb == null) {
			if (!Static572.aBoolean774 && Static484.anInt7715 > 0) {
				if (Static418.aBoolean542 && Static106.aClass150_3.method2632(81) && Static484.anInt7715 > 2) {
					return ((Class2_Sub27) Static411.aClass70_43.aClass2_39.aClass2_285.aClass2_285).anInt4326;
				}
				return ((Class2_Sub27) Static411.aClass70_43.aClass2_39.aClass2_285).anInt4326;
			}
			@Pc(38) int local38 = Static205.aClass131_1.method6544();
			@Pc(42) int local42 = Static205.aClass131_1.method6542();
			@Pc(44) int local44 = Static214.anInt3100;
			@Pc(46) int local46 = Static312.anInt5139;
			@Pc(48) int local48 = Static428.anInt6943;
			if (local38 > local44 && local38 < local48 + local44) {
				@Pc(58) int local58 = -1;
				@Pc(77) int local77;
				for (@Pc(60) int local60 = 0; local60 < Static484.anInt7715; local60++) {
					if (Static321.aBoolean428) {
						local77 = (Static484.anInt7715 - local60 - 1) * 16 + local46 + 33;
						if (local42 > local77 - 13 && local42 <= local77 + 3) {
							local58 = local60;
						}
					} else {
						local77 = local46 + (-local60 + -1 + Static484.anInt7715) * 16 + 31;
						if (local42 > local77 - 13 && local42 <= local77 + 3) {
							local58 = local60;
						}
					}
				}
				if (local58 != -1) {
					local77 = 0;
					@Pc(140) Class314 local140 = new Class314(Static411.aClass70_43);
					for (@Pc(145) Class2_Sub27 local145 = (Class2_Sub27) local140.method6302(); local145 != null; local145 = (Class2_Sub27) local140.method6304()) {
						if (local77++ == local58) {
							return local145.anInt4326;
						}
					}
				}
			}
		}
		return -1;
	}
}
