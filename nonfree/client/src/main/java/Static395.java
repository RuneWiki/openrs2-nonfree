import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static395 {

	@OriginalMember(owner = "client!od", name = "b", descriptor = "Lclient!bh;")
	public static Class29 aClass29_7;

	@OriginalMember(owner = "client!od", name = "g", descriptor = "Lclient!kha;")
	public static Class181 aClass181_74;

	@OriginalMember(owner = "client!od", name = "a", descriptor = "(BLjava/lang/String;IZ)I")
	public static int method6318(@OriginalArg(1) String arg0, @OriginalArg(2) int arg1) {
		@Pc(24) boolean local24 = false;
		@Pc(26) boolean local26 = false;
		@Pc(28) int local28 = 0;
		@Pc(31) int local31 = arg0.length();
		for (@Pc(33) int local33 = 0; local33 < local31; local33++) {
			@Pc(39) char local39 = arg0.charAt(local33);
			if (local33 == 0) {
				if (local39 == '-') {
					local24 = true;
					continue;
				}
				if (local39 == '+') {
					continue;
				}
			}
			@Pc(76) int local76;
			if (local39 >= '0' && local39 <= '9') {
				local76 = local39 - '0';
			} else if (local39 >= 'A' && local39 <= 'Z') {
				local76 = local39 - '7';
			} else if (local39 >= 'a' && local39 <= 'z') {
				local76 = local39 - 'W';
			} else {
				throw new NumberFormatException();
			}
			if (local76 >= arg1) {
				throw new NumberFormatException();
			}
			if (local24) {
				local76 = -local76;
			}
			@Pc(114) int local114 = local28 * arg1 + local76;
			if (local28 != local114 / arg1) {
				throw new NumberFormatException();
			}
			local28 = local114;
			local26 = true;
		}
		if (!local26) {
			throw new NumberFormatException();
		}
		return local28;
	}

	@OriginalMember(owner = "client!od", name = "a", descriptor = "(II)V")
	public static void method6319() {
		Static443.aClass112_50.method3637(50);
		Static376.aClass112_42.method3637(50);
		Static237.aClass112_29.method3637(50);
		Static510.aClass112_54.method3637(50);
	}

	@OriginalMember(owner = "client!od", name = "a", descriptor = "(III[IIIII)Z")
	public static boolean method6320(@OriginalArg(2) int arg0, @OriginalArg(3) int[] arg1, @OriginalArg(4) int arg2, @OriginalArg(5) int arg3, @OriginalArg(6) int arg4, @OriginalArg(7) int arg5) {
		if (Static582.anInt9741 < arg2) {
			arg2 = Static582.anInt9741;
		}
		if (arg3 < 0) {
			arg3 = 0;
		}
		if (arg3 >= arg2) {
			return true;
		}
		@Pc(42) int local42 = arg2 - arg3 >> 2;
		arg5 += arg3 - 1;
		arg0 += arg3 * arg4;
		@Pc(81) int local81;
		@Pc(68) int local68;
		if (Static249.anInt5548 == 1) {
			Static314.anInt6404 += local42;
			while (true) {
				local42--;
				if (local42 < 0) {
					local42 = arg2 - arg3 & 0x3;
					while (true) {
						local42--;
						if (local42 < 0) {
							return true;
						}
						arg5++;
						if (arg1[arg5] > arg0) {
							arg1[arg5] = arg0;
						}
						arg0 += arg4;
					}
				}
				@Pc(66) int local66 = ~arg0;
				local68 = arg5 + 1;
				if (local66 > ~arg1[local68]) {
					arg1[local68] = arg0;
				}
				local81 = arg0 + arg4;
				local68++;
				if (arg1[local68] > local81) {
					arg1[local68] = local81;
				}
				local81 += arg4;
				local68++;
				if (arg1[local68] > local81) {
					arg1[local68] = local81;
				}
				local81 += arg4;
				arg5 = local68 + 1;
				if (arg1[arg5] > local81) {
					arg1[arg5] = local81;
				}
				arg0 = local81 + arg4;
			}
		} else {
			arg0 -= 38400;
			while (true) {
				local42--;
				if (local42 < 0) {
					local42 = arg2 - arg3 & 0x3;
					while (true) {
						local42--;
						if (local42 < 0) {
							return true;
						}
						arg5++;
						if (arg1[arg5] > arg0) {
							return false;
						}
						arg0 += arg4;
					}
				}
				local68 = arg5 + 1;
				if (arg0 < arg1[local68]) {
					return false;
				}
				local81 = arg0 + arg4;
				local68++;
				if (arg1[local68] > local81) {
					return false;
				}
				local81 += arg4;
				local68++;
				if (arg1[local68] > local81) {
					return false;
				}
				local81 += arg4;
				arg5 = local68 + 1;
				if (arg1[arg5] > local81) {
					return false;
				}
				arg0 = local81 + arg4;
			}
		}
	}
}
