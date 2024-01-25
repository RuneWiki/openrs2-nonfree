import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static132 {

	@OriginalMember(owner = "client!fc", name = "c", descriptor = "Lclient!lh;")
	public static final Class208 aClass208_31 = new Class208(2, -1);

	@OriginalMember(owner = "client!fc", name = "a", descriptor = "(I)V")
	public static void method2304() {
		@Pc(11) Class268 local11 = null;
		try {
			local11 = Static285.method4284("2");
			@Pc(24) Class1_Sub3 local24 = new Class1_Sub3(Static550.anInt9203 * 6 + 3);
			local24.method7917(1);
			local24.method7937(Static550.anInt9203);
			for (@Pc(34) int local34 = 0; local34 < Static250.anIntArray251.length; local34++) {
				if (Static166.aBooleanArray34[local34]) {
					local24.method7937(local34);
					local24.method7936(Static250.anIntArray251[local34]);
				}
			}
			local11.method5810(local24.aByteArray104, local24.anInt9802, 0);
		} catch (@Pc(65) Exception local65) {
		}
		try {
			if (local11 != null) {
				local11.method5816();
			}
		} catch (@Pc(72) Exception local72) {
		}
		Static190.aLong163 = Static480.method6650();
		Static136.aBoolean203 = false;
	}

	@OriginalMember(owner = "client!fc", name = "a", descriptor = "(IIB[IIIII)Z")
	public static boolean method2305(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int[] arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(7) int arg5) {
		if (arg5 < 0) {
			arg5 = 0;
		}
		if (arg0 > Static312.anInt5723) {
			arg0 = Static312.anInt5723;
		}
		if (arg5 >= arg0) {
			return true;
		}
		@Pc(30) int local30 = arg0 - arg5 >> 2;
		arg3 += arg5 * arg1;
		arg4 += arg5 - 1;
		@Pc(67) int local67;
		@Pc(53) int local53;
		if (Static540.anInt9050 == 1) {
			Static397.anInt7106 += local30;
			while (true) {
				local30--;
				if (local30 < 0) {
					local30 = arg0 - arg5 & 0x3;
					while (true) {
						local30--;
						if (local30 < 0) {
							return true;
						}
						arg4++;
						if (arg2[arg4] > arg3) {
							arg2[arg4] = arg3;
						}
						arg3 += arg1;
					}
				}
				local53 = arg4 + 1;
				if (arg3 < arg2[local53]) {
					arg2[local53] = arg3;
				}
				local67 = arg3 + arg1;
				local53++;
				if (arg2[local53] > local67) {
					arg2[local53] = local67;
				}
				local67 += arg1;
				local53++;
				if (arg2[local53] > local67) {
					arg2[local53] = local67;
				}
				local67 += arg1;
				arg4 = local53 + 1;
				if (local67 < arg2[arg4]) {
					arg2[arg4] = local67;
				}
				arg3 = local67 + arg1;
			}
		} else {
			arg3 -= 38400;
			while (true) {
				local30--;
				if (local30 < 0) {
					local30 = arg0 - arg5 & 0x3;
					while (true) {
						local30--;
						if (local30 < 0) {
							return true;
						}
						arg4++;
						if (arg2[arg4] > arg3) {
							return false;
						}
						arg3 += arg1;
					}
				}
				local53 = arg4 + 1;
				if (arg2[local53] > arg3) {
					return false;
				}
				local67 = arg3 + arg1;
				@Pc(70) int local70 = ~local67;
				local53++;
				if (local70 > ~arg2[local53]) {
					return false;
				}
				local67 += arg1;
				local70 = ~local67;
				local53++;
				if (local70 > ~arg2[local53]) {
					return false;
				}
				local67 += arg1;
				arg4 = local53 + 1;
				if (local67 < arg2[arg4]) {
					return false;
				}
				arg3 = local67 + arg1;
			}
		}
	}

	@OriginalMember(owner = "client!fc", name = "a", descriptor = "(ILjava/lang/String;)I")
	public static int method2307(@OriginalArg(1) String arg0) {
		@Pc(8) int local8 = arg0.length();
		@Pc(15) int local15 = 0;
		for (@Pc(17) int local17 = 0; local17 < local8; local17++) {
			@Pc(23) char local23 = arg0.charAt(local17);
			if (local23 <= '\u007f') {
				local15++;
			} else if (local23 <= '\u07ff') {
				local15 += 2;
			} else {
				local15 += 3;
			}
		}
		return local15;
	}
}
