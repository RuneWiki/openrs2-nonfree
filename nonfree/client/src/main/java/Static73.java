import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static73 {

	@OriginalMember(owner = "client!ee", name = "g", descriptor = "F")
	public static float aFloat30;

	@OriginalMember(owner = "client!ee", name = "d", descriptor = "Lclient!pf;")
	public static final Class157 aClass157_46 = new Class157(24, 12);

	@OriginalMember(owner = "client!ee", name = "f", descriptor = "Lclient!wl;")
	public static final Class221 aClass221_58 = new Class221(95, 2);

	@OriginalMember(owner = "client!ee", name = "h", descriptor = "Z")
	public static boolean aBoolean128 = true;

	@OriginalMember(owner = "client!ee", name = "a", descriptor = "(IIILclient!fh;)V")
	public static void method1487(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Class68 arg2) {
		if (Static18.aClass68_1 != null || Static258.aBoolean470 || (arg2 == null || Static256.method4497(arg2) == null)) {
			return;
		}
		Static18.aClass68_1 = arg2;
		Static132.aClass68_20 = Static256.method4497(arg2);
		Static268.aBoolean489 = false;
		Static68.anInt1184 = arg0;
		Static214.anInt4719 = arg1;
		Static81.anInt1525 = 0;
	}
}
