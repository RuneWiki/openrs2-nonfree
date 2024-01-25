import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static628 {

	@OriginalMember(owner = "client!wha", name = "r", descriptor = "Lclient!g;")
	public static Class9 aClass9_1;

	@OriginalMember(owner = "client!wha", name = "z", descriptor = "F")
	public static float aFloat212;

	@OriginalMember(owner = "client!wha", name = "s", descriptor = "Lclient!oaa;")
	public static final Class234 aClass234_25 = new Class234(9, 0, 4, 1);

	@OriginalMember(owner = "client!wha", name = "w", descriptor = "[I")
	public static final int[] anIntArray707 = new int[500];

	@OriginalMember(owner = "client!wha", name = "x", descriptor = "Z")
	public static boolean aBoolean745 = false;

	@OriginalMember(owner = "client!wha", name = "a", descriptor = "(BIZ)Lclient!ie;")
	public static Class2_Sub24 method9105(@OriginalArg(1) int arg0, @OriginalArg(2) boolean arg1) {
		@Pc(20) long local20 = (long) (arg0 | (arg1 ? Integer.MIN_VALUE : 0));
		return (Class2_Sub24) Static538.aClass99_84.method3056(local20);
	}
}
