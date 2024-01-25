import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static77 {

	@OriginalMember(owner = "client!daa", name = "A", descriptor = "[I")
	public static final int[] anIntArray94 = new int[50];

	@OriginalMember(owner = "client!daa", name = "a", descriptor = "(III)Lclient!ch;")
	public static Class6_Sub1_Sub5 method1176(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(17) Class6_Sub1_Sub5 local17 = (Class6_Sub1_Sub5) Static385.aClass212_29.method5106((long) arg1 << 32 | (long) arg0);
		if (local17 == null) {
			local17 = new Class6_Sub1_Sub5(arg1, arg0);
			Static385.aClass212_29.method5104(local17.aLong249, local17);
		}
		return local17;
	}
}
