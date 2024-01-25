import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static265 {

	@OriginalMember(owner = "client!it", name = "I", descriptor = "Lclient!es;")
	public static Class103 aClass103_2;

	@OriginalMember(owner = "client!it", name = "M", descriptor = "[I")
	public static int[] anIntArray251;

	@OriginalMember(owner = "client!it", name = "K", descriptor = "[Ljava/lang/String;")
	public static final String[] aStringArray23 = new String[200];

	@OriginalMember(owner = "client!it", name = "J", descriptor = "[I")
	public static final int[] anIntArray250 = new int[8];

	@OriginalMember(owner = "client!it", name = "F", descriptor = "Lclient!ho;")
	public static final Class160 aClass160_141 = new Class160(130, 0);

	@OriginalMember(owner = "client!it", name = "a", descriptor = "(BLjava/lang/String;ZI)I")
	public static int method4403(@OriginalArg(1) String arg0, @OriginalArg(3) int arg1) {
		if (arg1 > 36) {
			throw new IllegalArgumentException("Invalid radix:" + arg1);
		}
		@Pc(29) boolean local29 = false;
		@Pc(31) boolean local31 = false;
		@Pc(33) int local33 = 0;
		@Pc(36) int local36 = arg0.length();
		for (@Pc(46) int local46 = 0; local46 < local36; local46++) {
			@Pc(51) char local51 = arg0.charAt(local46);
			if (local46 == 0) {
				if (local51 == '-') {
					local29 = true;
					continue;
				}
				if (local51 == '+' && true) {
					continue;
				}
			}
			@Pc(95) int local95;
			if (local51 >= '0' && local51 <= '9') {
				local95 = local51 - '0';
			} else if (local51 >= 'A' && local51 <= 'Z') {
				local95 = local51 - '7';
			} else if (local51 >= 'a' && local51 <= 'z') {
				local95 = local51 - 'W';
			} else {
				throw new NumberFormatException();
			}
			if (local95 >= arg1) {
				throw new NumberFormatException();
			}
			if (local29) {
				local95 = -local95;
			}
			@Pc(134) int local134 = local95 + local33 * arg1;
			if (local134 / arg1 != local33) {
				throw new NumberFormatException();
			}
			local33 = local134;
			local31 = true;
		}
		if (!local31) {
			throw new NumberFormatException();
		}
		return local33;
	}

	@OriginalMember(owner = "client!it", name = "a", descriptor = "(IIZI)V")
	public static void method4405(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2) {
		if (Static445.aClass125_30.method2630((long) arg1) != null) {
			return;
		}
		if (Static665.aBoolean758) {
			@Pc(22) Class14_Sub27 local22 = new Class14_Sub27(arg1, new Class147_Sub1(4096, Static64.aClass310_13, arg1), arg0, arg2);
			local22.aClass147_Sub1_1.method5251(Static528.aStringArray39[Static26.anInt352]);
			Static445.aClass125_30.method2626(local22, (long) arg1);
		} else {
			Static397.method6080(arg1, arg2);
		}
	}
}
