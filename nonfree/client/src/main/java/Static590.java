import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static590 {

	@OriginalMember(owner = "client!tt", name = "a", descriptor = "(III[BII)V")
	public static void method7801(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) byte[] arg2, @OriginalArg(5) int arg3) {
		if (arg3 >= arg0) {
			return;
		}
		@Pc(20) int local20 = arg0 - arg3 >> 2;
		arg1 += arg3;
		while (true) {
			local20--;
			if (local20 < 0) {
				local20 = arg0 - arg3 & 0x3;
				while (true) {
					local20--;
					if (local20 < 0) {
						return;
					}
					arg2[arg1++] = 1;
				}
			}
			@Pc(29) int local29 = arg1 + 1;
			arg2[arg1] = 1;
			@Pc(34) int local34 = local29 + 1;
			arg2[local29] = 1;
			@Pc(39) int local39 = local34 + 1;
			arg2[local34] = 1;
			arg1 = local39 + 1;
			arg2[local39] = 1;
		}
	}

	@OriginalMember(owner = "client!tt", name = "a", descriptor = "(ILjava/lang/String;ZI)I")
	public static int method7802(@OriginalArg(1) String arg0, @OriginalArg(3) int arg1) {
		@Pc(28) boolean local28 = false;
		@Pc(35) boolean local35 = false;
		@Pc(37) int local37 = 0;
		@Pc(40) int local40 = arg0.length();
		for (@Pc(42) int local42 = 0; local42 < local40; local42++) {
			@Pc(48) char local48 = arg0.charAt(local42);
			if (local42 == 0) {
				if (local48 == '-') {
					local28 = true;
					continue;
				}
				if (local48 == '+') {
					continue;
				}
			}
			@Pc(76) int local76;
			if (local48 >= '0' && local48 <= '9') {
				local76 = local48 - '0';
			} else if (local48 >= 'A' && local48 <= 'Z') {
				local76 = local48 - '7';
			} else if (local48 >= 'a' && local48 <= 'z') {
				local76 = local48 - 'W';
			} else {
				throw new NumberFormatException();
			}
			if (arg1 <= local76) {
				throw new NumberFormatException();
			}
			if (local28) {
				local76 = -local76;
			}
			@Pc(124) int local124 = local37 * arg1 + local76;
			if (local124 / arg1 != local37) {
				throw new NumberFormatException();
			}
			local37 = local124;
			local35 = true;
		}
		if (!local35) {
			throw new NumberFormatException();
		}
		return local37;
	}
}
