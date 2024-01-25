import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static507 {

	@OriginalMember(owner = "client!rb", name = "b", descriptor = "I")
	public static int anInt8481;

	@OriginalMember(owner = "client!rb", name = "e", descriptor = "I")
	public static int anInt8484 = 765;

	@OriginalMember(owner = "client!rb", name = "a", descriptor = "(II[IIIIII)Z")
	public static boolean method7177(@OriginalArg(1) int arg0, @OriginalArg(2) int[] arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		if (Static526.anInt8708 < arg5) {
			arg5 = Static526.anInt8708;
		}
		if (arg3 < 0) {
			arg3 = 0;
		}
		if (arg5 <= arg3) {
			return true;
		}
		arg0 += arg4 * arg3;
		arg2 += arg3 - 1;
		@Pc(45) int local45 = arg5 - arg3 >> 2;
		@Pc(75) int local75;
		@Pc(72) int local72;
		@Pc(58) int local58;
		if (Static96.anInt2066 == 1) {
			Static594.anInt9366 += local45;
			while (true) {
				local45--;
				if (local45 < 0) {
					local45 = arg5 - arg3 & 0x3;
					while (true) {
						local45--;
						if (local45 < 0) {
							return true;
						}
						arg2++;
						if (arg0 < arg1[arg2]) {
							arg1[arg2] = arg0;
						}
						arg0 += arg4;
					}
				}
				local58 = arg2 + 1;
				if (arg0 < arg1[local58]) {
					arg1[local58] = arg0;
				}
				local72 = arg0 + arg4;
				local58++;
				if (local72 < arg1[local58]) {
					arg1[local58] = local72;
				}
				local72 += arg4;
				local75 = ~local72;
				local58++;
				if (local75 > ~arg1[local58]) {
					arg1[local58] = local72;
				}
				local72 += arg4;
				arg2 = local58 + 1;
				if (local72 < arg1[arg2]) {
					arg1[arg2] = local72;
				}
				arg0 = local72 + arg4;
			}
		} else {
			arg0 -= 38400;
			while (true) {
				local45--;
				if (local45 < 0) {
					local45 = arg5 - arg3 & 0x3;
					while (true) {
						local45--;
						if (local45 < 0) {
							return true;
						}
						arg2++;
						if (arg0 < arg1[arg2]) {
							return false;
						}
						arg0 += arg4;
					}
				}
				local58 = arg2 + 1;
				if (arg1[local58] > arg0) {
					return false;
				}
				local72 = arg0 + arg4;
				local75 = ~local72;
				local58++;
				if (local75 > ~arg1[local58]) {
					return false;
				}
				local72 += arg4;
				local58++;
				if (arg1[local58] > local72) {
					return false;
				}
				local72 += arg4;
				local75 = ~local72;
				arg2 = local58 + 1;
				if (local75 > ~arg1[arg2]) {
					return false;
				}
				arg0 = local72 + arg4;
			}
		}
	}

	@OriginalMember(owner = "client!rb", name = "a", descriptor = "(Ljava/lang/String;I)Ljava/lang/Class;")
	public static Class method7178(@OriginalArg(0) String arg0) throws ClassNotFoundException {
		if (arg0.equals("B")) {
			return Byte.TYPE;
		} else if (arg0.equals("I")) {
			return Integer.TYPE;
		} else if (arg0.equals("S")) {
			return Short.TYPE;
		} else if (arg0.equals("J")) {
			return Long.TYPE;
		} else if (arg0.equals("Z")) {
			return Boolean.TYPE;
		} else if (arg0.equals("F")) {
			return Float.TYPE;
		} else if (arg0.equals("D")) {
			return Double.TYPE;
		} else if (arg0.equals("C")) {
			return Character.TYPE;
		} else {
			return Class.forName(arg0);
		}
	}

	@OriginalMember(owner = "client!rb", name = "a", descriptor = "(IILclient!gj;IIZ)V")
	public static void method7179(@OriginalArg(0) int arg0, @OriginalArg(2) Class143 arg1, @OriginalArg(4) int arg2) {
		Static108.method2086(arg2, arg0, (long) 0, arg1);
	}
}
