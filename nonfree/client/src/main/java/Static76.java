import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static76 {

	@OriginalMember(owner = "client!cs", name = "x", descriptor = "Lclient!eda;")
	public static Class85_Sub1 aClass85_Sub1_1;

	@OriginalMember(owner = "client!cs", name = "C", descriptor = "[I")
	public static final int[] anIntArray204 = new int[1000];

	@OriginalMember(owner = "client!cs", name = "F", descriptor = "I")
	public static int anInt1598 = 0;

	@OriginalMember(owner = "client!cs", name = "K", descriptor = "[I")
	public static final int[] anIntArray205 = new int[14];

	@OriginalMember(owner = "client!cs", name = "a", descriptor = "(III)Z")
	public static boolean method1357(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return (arg0 & 0x400) != 0;
	}

	@OriginalMember(owner = "client!cs", name = "a", descriptor = "(IIZ)V")
	public static void method1359(@OriginalArg(0) int arg0, @OriginalArg(2) boolean arg1) {
		@Pc(10) Class4_Sub20 local10 = Static17.method367(arg0, arg1);
		if (local10 != null) {
			for (@Pc(20) int local20 = 0; local20 < local10.anIntArray309.length; local20++) {
				local10.anIntArray309[local20] = -1;
				local10.anIntArray308[local20] = 0;
			}
		}
	}
}
