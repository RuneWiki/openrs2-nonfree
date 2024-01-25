import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static463 {

	@OriginalMember(owner = "client!sf", name = "h", descriptor = "I")
	public static int anInt9619;

	@OriginalMember(owner = "client!sf", name = "e", descriptor = "Lclient!vi;")
	public static final Class332 aClass332_212 = new Class332(64);

	@OriginalMember(owner = "client!sf", name = "i", descriptor = "Lclient!rh;")
	public static final Class275 aClass275_203 = new Class275();

	@OriginalMember(owner = "client!sf", name = "a", descriptor = "(Lclient!fca;I)Ljava/lang/String;")
	public static String method7851(@OriginalArg(0) Class97 arg0) {
		if (Static65.method862(arg0).method6471() == 0) {
			return null;
		} else if (arg0.aString39 == null || arg0.aString39.trim().length() == 0) {
			return Static446.aBoolean529 ? "Hidden-use" : null;
		} else {
			return arg0.aString39;
		}
	}
}
