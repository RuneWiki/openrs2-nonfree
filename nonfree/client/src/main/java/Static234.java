import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static234 {

	@OriginalMember(owner = "client!jl", name = "m", descriptor = "I")
	public static int anInt4753;

	@OriginalMember(owner = "client!jl", name = "n", descriptor = "Lclient!cga;")
	public static final Class47 aClass47_74 = new Class47(61, 2);

	@OriginalMember(owner = "client!jl", name = "a", descriptor = "(I)V")
	public static void method4075() {
		if (Static414.aClass14_12 != null) {
			Static414.aClass14_12.method6824();
			Static414.aClass14_12 = null;
			Static381.aClass92_13 = null;
		}
	}

	@OriginalMember(owner = "client!jl", name = "a", descriptor = "(IIB)Z")
	public static boolean method4077(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return (arg0 & 0x34) != 0;
	}

	@OriginalMember(owner = "client!jl", name = "a", descriptor = "(BLclient!pfa;Lclient!pfa;[I)V")
	public static void method4079(@OriginalArg(1) Class251 arg0, @OriginalArg(2) Class251 arg1, @OriginalArg(3) int[] arg2) {
		Static400.aClass251_96 = arg0;
		if (arg2 != null) {
			Static540.anIntArray254 = arg2;
		}
		Static1.aClass251_127 = arg1;
	}

	@OriginalMember(owner = "client!jl", name = "a", descriptor = "(IZILjava/lang/String;)I")
	public static int method4082(@OriginalArg(2) int arg0, @OriginalArg(3) String arg1) {
		@Pc(26) boolean local26 = false;
		@Pc(28) boolean local28 = false;
		@Pc(30) int local30 = 0;
		@Pc(38) int local38 = arg1.length();
		for (@Pc(40) int local40 = 0; local40 < local38; local40++) {
			@Pc(46) char local46 = arg1.charAt(local40);
			if (local40 == 0) {
				if (local46 == '-') {
					local26 = true;
					continue;
				}
				if (local46 == '+') {
					continue;
				}
			}
			@Pc(93) int local93;
			if (local46 >= '0' && local46 <= '9') {
				local93 = local46 - '0';
			} else if (local46 >= 'A' && local46 <= 'Z') {
				local93 = local46 - '7';
			} else if (local46 >= 'a' && local46 <= 'z') {
				local93 = local46 - 'W';
			} else {
				throw new NumberFormatException();
			}
			if (arg0 <= local93) {
				throw new NumberFormatException();
			}
			if (local26) {
				local93 = -local93;
			}
			@Pc(121) int local121 = local93 + local30 * arg0;
			if (local30 != local121 / arg0) {
				throw new NumberFormatException();
			}
			local28 = true;
			local30 = local121;
		}
		if (!local28) {
			throw new NumberFormatException();
		}
		return local30;
	}
}
