import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static630 {

	@OriginalMember(owner = "client!vfa", name = "A", descriptor = "I")
	public static int anInt7989 = 0;

	@OriginalMember(owner = "client!vfa", name = "D", descriptor = "[I")
	public static int[] anIntArray400 = new int[2];

	@OriginalMember(owner = "client!vfa", name = "E", descriptor = "I")
	public static int anInt7992 = 0;

	@OriginalMember(owner = "client!vfa", name = "F", descriptor = "Lclient!si;")
	public static final Class335 aClass335_29 = new Class335(64);

	@OriginalMember(owner = "client!vfa", name = "a", descriptor = "(IIIIIIIZII)Z")
	public static boolean method7146(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8) {
		if (!Static346.method5999(arg6, arg4, arg1)) {
			return false;
		}
		@Pc(15) int local15 = Static75.anIntArray71[2];
		@Pc(19) int local19 = Static75.anIntArray71[1];
		@Pc(23) int local23 = Static75.anIntArray71[0];
		if (!Static346.method5999(arg0, arg8, arg7)) {
			return false;
		}
		@Pc(35) int local35 = Static75.anIntArray71[2];
		@Pc(39) int local39 = Static75.anIntArray71[1];
		@Pc(43) int local43 = Static75.anIntArray71[0];
		if (Static346.method5999(arg5, arg2, arg3)) {
			@Pc(60) int local60 = Static75.anIntArray71[0];
			@Pc(64) int local64 = Static75.anIntArray71[2];
			@Pc(68) int local68 = Static75.anIntArray71[1];
			return Static13.method7475(local35, local39, local68, local60, local64, local19, local43, local15, local23);
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!vfa", name = "a", descriptor = "(BLjava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;")
	public static String method7149(@OriginalArg(1) String arg0, @OriginalArg(2) String arg1, @OriginalArg(3) String arg2) {
		for (@Pc(9) int local9 = arg2.indexOf(arg0); local9 != -1; local9 = arg2.indexOf(arg0, arg1.length() + local9)) {
			arg2 = arg2.substring(0, local9) + arg1 + arg2.substring(local9 + arg0.length());
		}
		return arg2;
	}
}
