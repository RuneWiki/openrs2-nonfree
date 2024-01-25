import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static493 {

	@OriginalMember(owner = "client!rp", name = "a", descriptor = "Lclient!d;")
	public static Interface3 anInterface3_11;

	@OriginalMember(owner = "client!rp", name = "b", descriptor = "Lclient!la;")
	public static Class207 aClass207_104;

	@OriginalMember(owner = "client!rp", name = "h", descriptor = "Lclient!la;")
	public static Class207 aClass207_105;

	@OriginalMember(owner = "client!rp", name = "j", descriptor = "[I")
	public static int[] anIntArray476;

	@OriginalMember(owner = "client!rp", name = "f", descriptor = "Ljava/lang/String;")
	public static String aString96 = null;

	@OriginalMember(owner = "client!rp", name = "a", descriptor = "(III)Z")
	public static boolean method7228(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		return (arg1 & 0x21) != 0;
	}

	@OriginalMember(owner = "client!rp", name = "b", descriptor = "(III)I")
	public static int method7230(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(10) double local10 = Math.log((double) arg1) / Math.log(2.0D);
		@Pc(25) double local25 = Math.log((double) arg0) / Math.log(2.0D);
		@Pc(34) double local34 = local25 + (local10 - local25) * Math.random();
		return (int) (Math.pow(2.0D, local34) + 0.5D);
	}
}
