import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static123 {

	@OriginalMember(owner = "client!fv", name = "c", descriptor = "[I")
	public static int[] anIntArray102;

	@OriginalMember(owner = "client!fv", name = "a", descriptor = "S")
	public static short aShort21 = 32767;

	@OriginalMember(owner = "client!fv", name = "b", descriptor = "[I")
	public static final int[] anIntArray101 = new int[1000];

	@OriginalMember(owner = "client!fv", name = "f", descriptor = "[I")
	public static int[] anIntArray103 = new int[2];

	@OriginalMember(owner = "client!fv", name = "a", descriptor = "(ZZ)Z")
	public static boolean method1957(@OriginalArg(0) boolean arg0, @OriginalArg(1) boolean arg1) {
		return arg0 | arg1;
	}

	@OriginalMember(owner = "client!fv", name = "b", descriptor = "(I)I")
	public static int method1958() {
		if (Static296.aClass82_16 == null) {
			if (!Static367.aBoolean425 && Static276.anInt4608 > 0) {
				if (Static310.aBoolean386 && Static137.aClass143_1.method5471(81) && Static276.anInt4608 > 2) {
					return ((Class3_Sub38) Static325.aClass193_54.aClass3_198.aClass3_267.aClass3_267).anInt5872;
				}
				return ((Class3_Sub38) Static325.aClass193_54.aClass3_198.aClass3_267).anInt5872;
			}
			@Pc(23) int local23 = Static171.aClass50_1.method4993();
			@Pc(29) int local29 = Static171.aClass50_1.method4989();
			@Pc(31) int local31 = Static368.anInt6234;
			@Pc(33) int local33 = Static348.anInt5871;
			@Pc(35) int local35 = Static100.anInt1814;
			if (local23 > local31 && local31 + local35 > local23) {
				@Pc(45) int local45 = -1;
				@Pc(64) int local64;
				for (@Pc(47) int local47 = 0; local47 < Static276.anInt4608; local47++) {
					if (Static71.aBoolean86) {
						local64 = (Static276.anInt4608 - local47 - 1) * 16 + local33 + 33;
						if (local29 > local64 - 13 && local64 + 3 >= local29) {
							local45 = local47;
						}
					} else {
						local64 = (Static276.anInt4608 - local47 - 1) * 16 + local33 + 31;
						if (local29 > local64 - 13 && local64 + 3 >= local29) {
							local45 = local47;
						}
					}
				}
				if (local45 != -1) {
					local64 = 0;
					@Pc(130) Class21 local130 = new Class21(Static325.aClass193_54);
					for (@Pc(135) Class3_Sub38 local135 = (Class3_Sub38) local130.method499(); local135 != null; local135 = (Class3_Sub38) local130.method498()) {
						if (local64++ == local45) {
							return local135.anInt5872;
						}
					}
				}
			}
		}
		return -1;
	}

	@OriginalMember(owner = "client!fv", name = "a", descriptor = "(III)V")
	public static void method1959(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(13) int local13 = Static251.aClass124_14.method3099(Static22.aClass174_14.method4208(Static300.anInt5192));
		@Pc(24) int local24;
		for (@Pc(18) Class3_Sub38 local18 = (Class3_Sub38) Static325.aClass193_54.method4519(); local18 != null; local18 = (Class3_Sub38) Static325.aClass193_54.method4525()) {
			local24 = Static442.method6043(local18);
			if (local13 < local24) {
				local13 = local24;
			}
		}
		local13 += 8;
		local24 = Static276.anInt4608 * 16 + 21;
		@Pc(53) int local53 = arg0 - local13 / 2;
		if (local53 + local13 > Static310.anInt5307) {
			local53 = Static310.anInt5307 - local13;
		}
		if (local53 < 0) {
			local53 = 0;
		}
		@Pc(77) int local77 = arg1;
		if (Static166.anInt3014 < local24 + arg1) {
			local77 = Static166.anInt3014 - local24;
		}
		if (local77 < 0) {
			local77 = 0;
		}
		Static368.anInt6234 = local53;
		Static242.anInt4125 = (Static71.aBoolean86 ? 26 : 22) + Static276.anInt4608 * 16;
		Static367.aBoolean425 = true;
		Static100.anInt1814 = local13;
		Static348.anInt5871 = local77;
	}
}
