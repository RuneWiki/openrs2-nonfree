import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static196 {

	@OriginalMember(owner = "client!vb", name = "z", descriptor = "I")
	public static int anInt4343;

	@OriginalMember(owner = "client!vb", name = "q", descriptor = "Z")
	public static final boolean aBoolean203 = false;

	@OriginalMember(owner = "client!vb", name = "r", descriptor = "Lclient!dj;")
	public static final Class24 aClass24_1254 = Static81.method1507("Bitte laden Sie die Seite neu)3");

	@OriginalMember(owner = "client!vb", name = "u", descriptor = "Lclient!dj;")
	public static final Class24 aClass24_1255 = Static81.method1507("Zu viele Anmelde)2Versuche von Ihrer Adresse");

	@OriginalMember(owner = "client!vb", name = "w", descriptor = "Lclient!dj;")
	public static final Class24 aClass24_1256 = Static81.method1507("<col=ffffff>");

	@OriginalMember(owner = "client!vb", name = "b", descriptor = "(II)I")
	public static int method3327(@OriginalArg(1) int arg0) {
		return arg0 & 0xFF;
	}

	@OriginalMember(owner = "client!vb", name = "a", descriptor = "(IIIIIILclient!wd;IJ)Z")
	public static boolean method3328(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) Class5 arg6, @OriginalArg(7) int arg7, @OriginalArg(8) long arg8) {
		if (arg6 == null) {
			return true;
		} else {
			@Pc(11) int local11 = arg1 * 128 + arg4 * 64;
			@Pc(19) int local19 = arg2 * 128 + arg5 * 64;
			return Static127.method2122(arg0, arg1, arg2, arg4, arg5, local11, local19, arg3, arg6, arg7, false, arg8);
		}
	}
}
