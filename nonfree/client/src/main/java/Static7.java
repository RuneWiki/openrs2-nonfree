import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static7 {

	@OriginalMember(owner = "client!aca", name = "L", descriptor = "Lclient!kr;")
	public static Class171 aClass171_5;

	@OriginalMember(owner = "client!aca", name = "P", descriptor = "[I")
	public static int[] anIntArray20;

	@OriginalMember(owner = "client!aca", name = "G", descriptor = "Lclient!im;")
	public static final Class140 aClass140_1 = new Class140(34, 1);

	@OriginalMember(owner = "client!aca", name = "O", descriptor = "I")
	public static int anInt161 = 0;

	@OriginalMember(owner = "client!aca", name = "Q", descriptor = "[I")
	public static final int[] anIntArray21 = new int[1000];

	@OriginalMember(owner = "client!aca", name = "a", descriptor = "(ZII)Lclient!fg;")
	public static Class1_Sub18 method282(@OriginalArg(0) boolean arg0, @OriginalArg(1) int arg1) {
		@Pc(17) long local17 = (long) ((arg0 ? Integer.MIN_VALUE : 0) | arg1);
		return (Class1_Sub18) Static92.aClass17_9.method738(local17);
	}
}
