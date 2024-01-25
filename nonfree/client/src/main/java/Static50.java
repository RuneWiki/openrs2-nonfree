import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static50 {

	@OriginalMember(owner = "client!bn", name = "b", descriptor = "Lclient!at;")
	public static Class24 aClass24_5;

	@OriginalMember(owner = "client!bn", name = "d", descriptor = "I")
	public static int anInt1857;

	@OriginalMember(owner = "client!bn", name = "e", descriptor = "Lclient!cs;")
	public static Class66 aClass66_3;

	@OriginalMember(owner = "client!bn", name = "a", descriptor = "Lclient!mu;")
	public static final Class215 aClass215_21 = new Class215(25, 6);

	@OriginalMember(owner = "client!bn", name = "c", descriptor = "S")
	public static short aShort4 = 205;

	@OriginalMember(owner = "client!bn", name = "g", descriptor = "I")
	public static int anInt1859 = 0;

	@OriginalMember(owner = "client!bn", name = "h", descriptor = "Lclient!mu;")
	public static final Class215 aClass215_22 = new Class215(99, -1);

	@OriginalMember(owner = "client!bn", name = "i", descriptor = "Ljava/lang/Object;")
	public static volatile Object anObject8 = null;

	@OriginalMember(owner = "client!bn", name = "a", descriptor = "(III)Z")
	public static boolean method1758(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		return Static338.method5846(arg0, arg1) | (arg0 & 0x60000) != 0 || Static206.method4087(arg1, arg0);
	}
}
