import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static403 {

	@OriginalMember(owner = "client!pca", name = "jd", descriptor = "I")
	public static int anInt7291;

	@OriginalMember(owner = "client!pca", name = "ld", descriptor = "[[B")
	public static byte[][] aByteArrayArray35;

	@OriginalMember(owner = "client!pca", name = "Pb", descriptor = "Lclient!hga;")
	public static final Class123 aClass123_234 = new Class123(32, 12);

	@OriginalMember(owner = "client!pca", name = "gd", descriptor = "Lclient!hga;")
	public static final Class123 aClass123_235 = new Class123(110, 3);

	@OriginalMember(owner = "client!pca", name = "md", descriptor = "Lclient!rl;")
	public static final Class287 aClass287_119 = new Class287(1, 15);

	@OriginalMember(owner = "client!pca", name = "qd", descriptor = "I")
	public static int anInt7292 = 0;

	@OriginalMember(owner = "client!pca", name = "a", descriptor = "(IB)Ljava/lang/String;")
	public static String method5708(@OriginalArg(0) int arg0) {
		@Pc(13) String local13 = Integer.toString(arg0);
		for (@Pc(18) int local18 = local13.length() - 3; local18 > 0; local18 -= 3) {
			local13 = local13.substring(0, local18) + "," + local13.substring(local18);
		}
		if (local13.length() > 9) {
			return " <col=00ff80>" + local13.substring(0, local13.length() - 8) + Static573.aClass350_37.method7730(Static201.anInt4321) + " (" + local13 + ")</col>";
		} else if (local13.length() > 6) {
			return " <col=ffffff>" + local13.substring(0, local13.length() - 4) + Static573.aClass350_39.method7730(Static201.anInt4321) + " (" + local13 + ")</col>";
		} else {
			return " <col=ffff00>" + local13 + "</col>";
		}
	}
}
