import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static668 {

	@OriginalMember(owner = "client!uw", name = "l", descriptor = "Lclient!bma;")
	public static Class43 aClass43_5;

	@OriginalMember(owner = "client!uw", name = "m", descriptor = "Lclient!ra;")
	public static final Class320 aClass320_40 = new Class320(32);

	@OriginalMember(owner = "client!uw", name = "r", descriptor = "I")
	public static int anInt10258 = 0;

	@OriginalMember(owner = "client!uw", name = "j", descriptor = "I")
	public static int anInt10259 = 7000;

	@OriginalMember(owner = "client!uw", name = "k", descriptor = "I")
	public static int anInt10260 = anInt10259;

	@OriginalMember(owner = "client!uw", name = "a", descriptor = "(Ljava/lang/String;I)Ljava/lang/String;")
	public static String method8760(@OriginalArg(0) String arg0) {
		@Pc(9) String local9 = Static329.method4760(Static68.method1525(arg0));
		if (local9 == null) {
			local9 = "";
		}
		return local9;
	}
}
