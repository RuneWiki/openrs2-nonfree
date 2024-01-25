import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static190 {

	@OriginalMember(owner = "client!gg", name = "L", descriptor = "Lclient!tb;")
	public static Class49 aClass49_9;

	@OriginalMember(owner = "client!gg", name = "ab", descriptor = "Lclient!lga;")
	public static Class223 aClass223_38;

	@OriginalMember(owner = "client!gg", name = "a", descriptor = "([Ljava/lang/String;B)[Ljava/lang/String;")
	public static String[] method3592(@OriginalArg(0) String[] arg0) {
		@Pc(8) String[] local8 = new String[5];
		for (@Pc(10) int local10 = 0; local10 < 5; local10++) {
			local8[local10] = local10 + ": ";
			if (arg0 != null && arg0[local10] != null) {
				local8[local10] = local8[local10] + arg0[local10];
			}
		}
		return local8;
	}

	@OriginalMember(owner = "client!gg", name = "a", descriptor = "(I)V")
	public static void method3593() {
		@Pc(10) Class6_Sub50 local10;
		for (local10 = (Class6_Sub50) Static666.aClass340_75.method8124(); local10 != null; local10 = (Class6_Sub50) Static666.aClass340_75.method8134()) {
			Static428.method6530(false, local10);
		}
		for (local10 = (Class6_Sub50) Static39.aClass340_2.method8124(); local10 != null; local10 = (Class6_Sub50) Static39.aClass340_2.method8134()) {
			Static428.method6530(true, local10);
		}
	}
}
