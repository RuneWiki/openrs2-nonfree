import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static230 {

	@OriginalMember(owner = "client!tl", name = "q", descriptor = "F")
	public static float aFloat51 = 0.0F;

	@OriginalMember(owner = "client!tl", name = "s", descriptor = "I")
	public static int anInt5408 = 0;

	@OriginalMember(owner = "client!tl", name = "D", descriptor = "I")
	public static int anInt5417 = 0;

	@OriginalMember(owner = "client!tl", name = "H", descriptor = "[I")
	public static int[] anIntArray463 = new int[] { 0, -1, 0, 1 };

	@OriginalMember(owner = "client!tl", name = "M", descriptor = "I")
	public static int anInt5423 = 0;

	@OriginalMember(owner = "client!tl", name = "a", descriptor = "(IBLclient!hc;I)Lclient!ke;")
	public static Class1_Sub2_Sub4 method4125(@OriginalArg(0) int arg0, @OriginalArg(2) Class51 arg1) {
		return Static96.method2050(arg1, 0, arg0) ? Static109.method2226() : null;
	}

	@OriginalMember(owner = "client!tl", name = "a", descriptor = "(ILclient!hc;BI)[Lclient!ag;")
	public static Class7[] method4127(@OriginalArg(1) Class51 arg0, @OriginalArg(3) int arg1) {
		return Static96.method2050(arg0, 0, arg1) ? Static248.method4045() : null;
	}

	@OriginalMember(owner = "client!tl", name = "a", descriptor = "(BLjava/lang/String;)Ljava/lang/String;")
	public static String method4130(@OriginalArg(1) String arg0) {
		@Pc(5) String local5 = Static251.method4070(Static93.method2008(arg0));
		if (local5 == null) {
			local5 = "";
		}
		return local5;
	}
}
