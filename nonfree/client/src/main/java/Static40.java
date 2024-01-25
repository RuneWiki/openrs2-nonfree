import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static40 {

	@OriginalMember(owner = "client!bda", name = "o", descriptor = "I")
	public static int anInt824;

	@OriginalMember(owner = "client!bda", name = "p", descriptor = "F")
	public static float aFloat4;

	@OriginalMember(owner = "client!bda", name = "s", descriptor = "Lclient!gga;")
	public static Class124 aClass124_9;

	@OriginalMember(owner = "client!bda", name = "a", descriptor = "Lclient!jv;")
	public static Class188 aClass188_1 = new Class188();

	@OriginalMember(owner = "client!bda", name = "k", descriptor = "[C")
	public static final char[] aCharArray3 = new char[] { '_', 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z', '0', '1', '2', '3', '4', '5', '6', '7', '8', '9' };

	@OriginalMember(owner = "client!bda", name = "t", descriptor = "Z")
	public static final boolean aBoolean36 = false;

	@OriginalMember(owner = "client!bda", name = "a", descriptor = "(BI)V")
	public static void method810(@OriginalArg(1) int arg0) {
		@Pc(9) Class2_Sub1_Sub5 local9 = Static653.method9595(12, (long) arg0);
		local9.method2489();
	}
}
