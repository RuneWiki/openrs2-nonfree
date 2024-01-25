import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static514 {

	@OriginalMember(owner = "client!sia", name = "c", descriptor = "I")
	public static int anInt8855;

	@OriginalMember(owner = "client!sia", name = "a", descriptor = "(IIB)I")
	public static int method7636(@OriginalArg(0) int arg0) {
		if (arg0 == -2) {
			return 12345678;
		} else if (arg0 == -1) {
			return 96;
		} else {
			@Pc(37) int local37 = (arg0 & 0x7F) * 96 >> 7;
			if (local37 < 2) {
				local37 = 2;
			} else if (local37 > 126) {
				local37 = 126;
			}
			return (arg0 & 0xFF80) + local37;
		}
	}

	@OriginalMember(owner = "client!sia", name = "a", descriptor = "(IIIIIIII)V")
	public static void method7638(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(7) int arg6) {
		@Pc(10) int local10 = arg6 - arg0;
		@Pc(14) int local14 = arg0 + arg5;
		for (@Pc(16) int local16 = arg5; local16 < local14; local16++) {
			Static491.method7219(Static249.anIntArrayArray23[local16], arg4, arg2, arg1);
		}
		@Pc(39) int local39 = arg1 - arg0;
		@Pc(43) int local43 = arg0 + arg4;
		for (@Pc(45) int local45 = arg6; local45 > local10; local45--) {
			Static491.method7219(Static249.anIntArrayArray23[local45], arg4, arg2, arg1);
		}
		for (@Pc(75) int local75 = local14; local75 <= local10; local75++) {
			@Pc(81) int[] local81 = Static249.anIntArrayArray23[local75];
			Static491.method7219(local81, arg4, arg2, local43);
			Static491.method7219(local81, local43, arg3, local39);
			Static491.method7219(local81, local39, arg2, arg1);
		}
	}

	@OriginalMember(owner = "client!sia", name = "a", descriptor = "(IILjava/lang/Object;B)[B")
	public static byte[] method7639(@OriginalArg(1) int arg0, @OriginalArg(2) Object arg1) {
		if (arg1 == null) {
			return null;
		} else if (arg1 instanceof byte[]) {
			@Pc(18) byte[] local18 = (byte[]) arg1;
			return Static46.method797(arg0, local18);
		} else if (arg1 instanceof Class37) {
			@Pc(30) Class37 local30 = (Class37) arg1;
			return local30.method768(arg0);
		} else {
			throw new IllegalArgumentException();
		}
	}
}
