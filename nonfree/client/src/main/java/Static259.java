import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static259 {

	@OriginalMember(owner = "client!os", name = "c", descriptor = "Lclient!os;")
	public static Class118 aClass118_4;

	@OriginalMember(owner = "client!os", name = "d", descriptor = "I")
	public static int anInt3006 = 0;

	@OriginalMember(owner = "client!os", name = "e", descriptor = "I")
	public static int anInt3007 = 0;

	@OriginalMember(owner = "client!os", name = "a", descriptor = "(ZLjava/lang/String;IZ)I")
	public static int method2661(@OriginalArg(1) String arg0, @OriginalArg(2) int arg1) {
		@Pc(26) boolean local26 = false;
		@Pc(28) boolean local28 = false;
		@Pc(30) int local30 = 0;
		@Pc(33) int local33 = arg0.length();
		for (@Pc(35) int local35 = 0; local35 < local33; local35++) {
			@Pc(41) char local41 = arg0.charAt(local35);
			if (local35 == 0) {
				if (local41 == '-') {
					local26 = true;
					continue;
				}
				if (local41 == '+') {
					continue;
				}
			}
			@Pc(69) int local69;
			if (local41 >= '0' && local41 <= '9') {
				local69 = local41 - '0';
			} else if (local41 >= 'A' && local41 <= 'Z') {
				local69 = local41 - '7';
			} else if (local41 >= 'a' && local41 <= 'z') {
				local69 = local41 - 'W';
			} else {
				throw new NumberFormatException();
			}
			if (arg1 <= local69) {
				throw new NumberFormatException();
			}
			if (local26) {
				local69 = -local69;
			}
			@Pc(119) int local119 = arg1 * local30 + local69;
			if (local30 != local119 / arg1) {
				throw new NumberFormatException();
			}
			local28 = true;
			local30 = local119;
		}
		if (!local28) {
			throw new NumberFormatException();
		}
		return local30;
	}

	@OriginalMember(owner = "client!os", name = "a", descriptor = "(B)V")
	public static void method2662() {
		Static377.aClass110Array16 = null;
		Static235.aClass110Array9 = null;
		Static210.aClass110Array8 = null;
		Static333.aClass110Array13 = null;
		Static74.aClass110Array2 = null;
		Static376.aClass110Array15 = null;
		Static327.aClass110_15 = null;
		Static95.aClass150_6 = null;
		Static81.aClass110Array3 = null;
		Static362.aClass110_19 = null;
		Static71.aClass150_1 = null;
		Static161.aClass110Array7 = null;
		Static140.aClass150_3 = null;
		Static323.aClass110Array12 = null;
		Static110.aClass110Array4 = null;
		Static30.aClass110Array1 = null;
		Static243.aClass110Array10 = null;
		Static289.aClass110Array11 = null;
	}
}
