import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static597 {

	@OriginalMember(owner = "client!wu", name = "a", descriptor = "(Ljava/lang/String;B)I")
	public static int method7850(@OriginalArg(0) String arg0) {
		@Pc(8) int local8 = arg0.length();
		@Pc(10) int local10 = 0;
		for (@Pc(12) int local12 = 0; local12 < local8; local12++) {
			local10 = (local10 << 5) + arg0.charAt(local12) - local10;
		}
		return local10;
	}

	@OriginalMember(owner = "client!wu", name = "a", descriptor = "(IIILjava/lang/Object;)[B")
	public static byte[] method7851(@OriginalArg(1) int arg0, @OriginalArg(3) Object arg1) {
		if (arg1 == null) {
			return null;
		} else if (arg1 instanceof byte[]) {
			@Pc(18) byte[] local18 = (byte[]) arg1;
			return Static34.method944(arg0, local18);
		} else if (arg1 instanceof Class41) {
			@Pc(30) Class41 local30 = (Class41) arg1;
			return local30.method1154(arg0);
		} else {
			throw new IllegalArgumentException();
		}
	}

	@OriginalMember(owner = "client!wu", name = "a", descriptor = "(IIILclient!mc;I)V")
	public static void method7852(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) Class6_Sub31 arg2, @OriginalArg(4) int arg3) {
		arg2.aClass6_Sub21_Sub2_2.method6033(arg0);
		arg2.aClass6_Sub21_Sub2_2.method6037(arg3);
		arg2.aClass6_Sub21_Sub2_2.method6023(arg1);
	}
}
