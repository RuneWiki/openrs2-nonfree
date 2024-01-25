import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static13 {

	@OriginalMember(owner = "client!aj", name = "q", descriptor = "I")
	public static int anInt7635;

	@OriginalMember(owner = "client!aj", name = "u", descriptor = "Lclient!pfa;")
	public static Class251 aClass251_100;

	@OriginalMember(owner = "client!aj", name = "y", descriptor = "Lclient!xa;")
	public static Class58 aClass58_40;

	@OriginalMember(owner = "client!aj", name = "A", descriptor = "Lclient!pfa;")
	public static Class251 aClass251_101;

	@OriginalMember(owner = "client!aj", name = "b", descriptor = "I")
	public static int anInt7623 = 0;

	@OriginalMember(owner = "client!aj", name = "o", descriptor = "I")
	public static int anInt7634 = 0;

	@OriginalMember(owner = "client!aj", name = "a", descriptor = "(Lclient!ji;B)Lclient!qba;")
	public static Class6_Sub4 method6287(@OriginalArg(0) Class6_Sub21 arg0) {
		arg0.method6069();
		@Pc(18) int local18 = arg0.method6069();
		@Pc(22) Class6_Sub4 local22 = Static308.method4869(local18);
		local22.anInt9490 = arg0.method6069();
		@Pc(31) int local31 = arg0.method6069();
		for (@Pc(33) int local33 = 0; local33 < local31; local33++) {
			@Pc(39) int local39 = arg0.method6069();
			local22.method7750(local39, arg0);
		}
		local22.method7754();
		return local22;
	}

	@OriginalMember(owner = "client!aj", name = "c", descriptor = "(I)I")
	public static int method6290() {
		if (Static547.aClass292_14 == null) {
			if (!Static587.aBoolean734 && Static421.anInt7365 > 0) {
				if (Static159.aBoolean736 && Static365.aClass155_1.method4042(81) && Static421.anInt7365 > 2) {
					return ((Class6_Sub45) Static182.aClass361_23.aClass6_287.aClass6_285.aClass6_285).anInt8732;
				}
				return ((Class6_Sub45) Static182.aClass361_23.aClass6_287.aClass6_285).anInt8732;
			}
			@Pc(43) int local43 = Static164.aClass173_1.method6487();
			@Pc(47) int local47 = Static164.aClass173_1.method6489();
			@Pc(49) int local49 = Static574.anInt9422;
			@Pc(51) int local51 = Static397.anInt6954;
			@Pc(53) int local53 = Static363.anInt6354;
			if (local49 < local43 && local49 + local53 > local43) {
				@Pc(67) int local67 = -1;
				@Pc(86) int local86;
				for (@Pc(69) int local69 = 0; local69 < Static421.anInt7365; local69++) {
					if (Static370.aBoolean454) {
						local86 = (Static421.anInt7365 - local69 - 1) * 16 + local51 + 33;
						if (local86 - 13 < local47 && local47 <= local86 + 3) {
							local67 = local69;
						}
					} else {
						local86 = (Static421.anInt7365 - local69 - 1) * 16 + local51 + 31;
						if (local86 - 13 < local47 && local47 <= local86 + 3) {
							local67 = local69;
						}
					}
				}
				if (local67 != -1) {
					local86 = 0;
					@Pc(143) Class36 local143 = new Class36(Static182.aClass361_23);
					for (@Pc(148) Class6_Sub45 local148 = (Class6_Sub45) local143.method1056(); local148 != null; local148 = (Class6_Sub45) local143.method1052()) {
						if (local67 == local86++) {
							return local148.anInt8732;
						}
					}
				}
			}
		}
		return -1;
	}

	@OriginalMember(owner = "client!aj", name = "a", descriptor = "([IILclient!ac;I)V")
	public static void method6295(@OriginalArg(0) int[] arg0, @OriginalArg(2) Class4_Sub1_Sub1_Sub1 arg1, @OriginalArg(3) int arg2) {
		@Pc(10) boolean local10;
		@Pc(12) int local12;
		if (arg1.anIntArray519 != null) {
			local10 = true;
			for (local12 = 0; local12 < arg1.anIntArray519.length; local12++) {
				if (arg0[local12] != arg1.anIntArray519[local12]) {
					local10 = false;
					break;
				}
			}
			if (local10 && arg1.anInt7085 != -1) {
				@Pc(53) Class57 local53 = Static78.aClass298_2.method6521(arg1.anInt7085);
				@Pc(56) int local56 = local53.anInt1547;
				if (local56 == 1) {
					arg1.anInt7054 = 0;
					arg1.anInt7121 = 0;
					arg1.anInt7107 = arg2;
					arg1.anInt7101 = 1;
					arg1.anInt7112 = 0;
					Static520.method6532(arg1.aByte108, local53, false, arg1.anInt9542, arg1.anInt7112, arg1.anInt9540);
				}
				if (local56 == 2) {
					arg1.anInt7121 = 0;
				}
			}
		}
		local10 = true;
		for (local12 = 0; local12 < arg0.length; local12++) {
			if (arg0[local12] != -1) {
				local10 = false;
			}
			if (arg1.anIntArray519 == null || arg1.anIntArray519[local12] == -1 || Static78.aClass298_2.method6521(arg0[local12]).anInt1532 >= Static78.aClass298_2.method6521(arg1.anIntArray519[local12]).anInt1532) {
				arg1.anInt7133 = arg1.anInt7132;
				arg1.anIntArray519 = arg0;
				arg1.anInt7107 = arg2;
			}
		}
		if (local10) {
			arg1.anIntArray519 = arg0;
			arg1.anInt7107 = arg2;
			arg1.anInt7133 = arg1.anInt7132;
		}
	}

	@OriginalMember(owner = "client!aj", name = "a", descriptor = "(ZLjava/lang/String;)I")
	public static int method6297(@OriginalArg(1) String arg0) {
		for (@Pc(7) int local7 = 0; local7 < Static20.aStringArray2.length; local7++) {
			if (Static20.aStringArray2[local7].equalsIgnoreCase(arg0)) {
				return local7;
			}
		}
		return -1;
	}
}
