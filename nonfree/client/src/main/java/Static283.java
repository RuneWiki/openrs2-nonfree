import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static283 {

	@OriginalMember(owner = "client!ka", name = "f", descriptor = "[Lclient!cca;")
	public static final Interface5[] anInterface5Array5 = new Interface5[128];

	@OriginalMember(owner = "client!ka", name = "a", descriptor = "(II)I")
	public static int method5408(@OriginalArg(0) int arg0) {
		return arg0 & 0x7F;
	}

	@OriginalMember(owner = "client!ka", name = "a", descriptor = "(BLjava/lang/String;Z)V")
	public static void method5416(@OriginalArg(1) String arg0, @OriginalArg(2) boolean arg1) {
		Static171.method3002(arg0, arg1, -1, -1);
	}
}
