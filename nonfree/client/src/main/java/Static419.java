import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static419 {

	@OriginalMember(owner = "client!qb", name = "r", descriptor = "F")
	public static float aFloat163;

	@OriginalMember(owner = "client!qb", name = "h", descriptor = "Z")
	public static boolean aBoolean572 = true;

	@OriginalMember(owner = "client!qb", name = "a", descriptor = "(IIIIZII)Lclient!jba;")
	public static Class83 method5825(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		@Pc(38) long local38 = (long) arg1 * 986053L ^ (long) arg5 * 67481L ^ (long) arg4 * 97549L ^ (long) arg2 * 475427L ^ (long) arg0 * 32147369L ^ (long) arg3 * 76724863L;
		@Pc(44) Class83 local44 = (Class83) Static512.aClass222_57.method4430(local38);
		if (local44 == null) {
			local44 = Static307.aClass134_8.method6911(arg5, arg4, arg2, arg1, arg0, arg3);
			Static512.aClass222_57.method4434(local44, local38);
			return local44;
		} else {
			return local44;
		}
	}

	@OriginalMember(owner = "client!qb", name = "a", descriptor = "(I)I")
	public static int method5826() {
		@Pc(5) Class222 local5 = Static40.aClass222_2;
		synchronized (Static40.aClass222_2) {
			return Static40.aClass222_2.method4427();
		}
	}

	@OriginalMember(owner = "client!qb", name = "b", descriptor = "(I)Ljava/lang/String;")
	public static String method5827() {
		@Pc(7) String local7 = "www";
		if (Static357.aClass308_6 == Static466.aClass308_7) {
			local7 = "www-wtrc";
		} else if (Static357.aClass308_6 == Static302.aClass308_4) {
			local7 = "www-wtqa";
		} else if (Static357.aClass308_6 == Static354.aClass308_5) {
			local7 = "www-wtwip";
		}
		@Pc(40) String local40 = "";
		if (Static499.aString36 != null) {
			local40 = "/p=" + Static499.aString36;
		}
		return "http://" + local7 + "." + Static246.aClass195_2.aString45 + ".com/l=" + Static307.anInt5279 + "/a=" + Static47.anInt802 + local40 + "/";
	}
}
