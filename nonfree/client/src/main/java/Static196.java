import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static196 {

	@OriginalMember(owner = "client!no", name = "a", descriptor = "I")
	public static int anInt3698;

	@OriginalMember(owner = "client!no", name = "g", descriptor = "Lclient!rj;")
	public static Class154 aClass154_3;

	@OriginalMember(owner = "client!no", name = "l", descriptor = "Lclient!client;")
	public static client aClient1;

	@OriginalMember(owner = "client!no", name = "m", descriptor = "I")
	public static int anInt3705;

	@OriginalMember(owner = "client!no", name = "d", descriptor = "Ljava/lang/String;")
	public static String aString209 = "Loading sprites - ";

	@OriginalMember(owner = "client!no", name = "i", descriptor = "I")
	public static int anInt3702 = 0;

	@OriginalMember(owner = "client!no", name = "j", descriptor = "I")
	public static int anInt3703 = 0;

	@OriginalMember(owner = "client!no", name = "a", descriptor = "(B[S[Ljava/lang/String;)V")
	public static void method3169(@OriginalArg(1) short[] arg0, @OriginalArg(2) String[] arg1) {
		Static257.method4070(arg0, arg1.length - 1, arg1, 0);
	}

	@OriginalMember(owner = "client!no", name = "a", descriptor = "(Lclient!nk;I)V")
	public static void method3170(@OriginalArg(0) Class121 arg0) {
		Static306.aClass121_133 = arg0;
	}
}
