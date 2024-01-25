import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static644 {

	@OriginalMember(owner = "client!wu", name = "i", descriptor = "F")
	public static float aFloat192;

	@OriginalMember(owner = "client!wu", name = "h", descriptor = "Lclient!fc;")
	public static final Class94 aClass94_69 = new Class94(8);

	@OriginalMember(owner = "client!wu", name = "a", descriptor = "(B)V")
	public static void method8776() {
		Static429.aClass259Array1 = null;
	}

	@OriginalMember(owner = "client!wu", name = "a", descriptor = "(II[[BZ[I[[B[I[B)I")
	public static int method8778(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) byte[][] arg2, @OriginalArg(4) int[] arg3, @OriginalArg(5) byte[][] arg4, @OriginalArg(6) int[] arg5, @OriginalArg(7) byte[] arg6) {
		@Pc(14) int local14 = arg5[arg1];
		@Pc(20) int local20 = local14 + arg3[arg1];
		@Pc(24) int local24 = arg5[arg0];
		@Pc(31) int local31 = local24 + arg3[arg0];
		@Pc(33) int local33 = local14;
		if (local14 < local24) {
			local33 = local24;
		}
		@Pc(40) int local40 = local20;
		if (local31 < local20) {
			local40 = local31;
		}
		@Pc(51) int local51 = arg6[arg1] & 0xFF;
		if ((arg6[arg0] & 0xFF) < local51) {
			local51 = arg6[arg0] & 0xFF;
		}
		@Pc(68) byte[] local68 = arg4[arg1];
		@Pc(72) byte[] local72 = arg2[arg0];
		@Pc(77) int local77 = local33 - local14;
		@Pc(82) int local82 = local33 - local24;
		for (@Pc(84) int local84 = local33; local84 < local40; local84++) {
			@Pc(96) int local96 = local72[local82++] + local68[local77++];
			if (local96 < local51) {
				local51 = local96;
			}
		}
		return -local51;
	}

	@OriginalMember(owner = "client!wu", name = "a", descriptor = "(BII)Z")
	public static boolean method8779(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		if (arg1 >= 1000 && arg0 < 1000) {
			return true;
		} else if (arg1 >= 1000 || arg0 >= 1000) {
			return arg1 >= 1000 && arg0 >= 1000;
		} else if (Static582.method8054(arg0)) {
			return true;
		} else {
			return !Static582.method8054(arg1);
		}
	}

	@OriginalMember(owner = "client!wu", name = "a", descriptor = "(IIIZI)V")
	public static void method8780(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) boolean arg2, @OriginalArg(4) int arg3) {
		if (Static156.method3070(arg1)) {
			Static239.method4875(arg2, Static299.aClass302ArrayArray2[arg1], arg0, arg3, -1);
		}
	}

	@OriginalMember(owner = "client!wu", name = "a", descriptor = "(Ljava/lang/String;I)Ljava/lang/String;")
	public static String method8781(@OriginalArg(0) String arg0) {
		@Pc(9) StringBuffer local9 = new StringBuffer();
		@Pc(12) int local12 = arg0.length();
		for (@Pc(14) int local14 = 0; local14 < local12; local14++) {
			@Pc(20) char local20 = arg0.charAt(local14);
			if (local20 == '%' && local12 > local14 + 2) {
				local20 = arg0.charAt(local14 + 1);
				@Pc(64) int local64;
				if (local20 >= '0' && local20 <= '9') {
					local64 = local20 - 48;
				} else if (local20 >= 'a' && local20 <= 'f') {
					local64 = local20 + '\n' - 97;
				} else {
					if (local20 < 'A' || local20 > 'F') {
						local9.append('%');
						continue;
					}
					local64 = local20 + 10 - 65;
				}
				local64 *= 16;
				local20 = arg0.charAt(local14 + 2);
				if (local20 >= '0' && local20 <= '9') {
					local64 += local20 - 48;
				} else if (local20 >= 'a' && local20 <= 'f') {
					local64 += local20 - 87;
				} else {
					if (local20 < 'A' || local20 > 'F') {
						local9.append('%');
						continue;
					}
					local64 += local20 + '\n' - 65;
				}
				local14 += 2;
				if (local64 != 0 && Static525.method7481((byte) local64)) {
					local9.append(Static111.method2501((byte) local64));
				}
			} else if (local20 == '+') {
				local9.append(' ');
			} else {
				local9.append(local20);
			}
		}
		return local9.toString();
	}
}
