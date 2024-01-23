import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static50 {

	@OriginalMember(owner = "client!dk", name = "h", descriptor = "Lclient!th;")
	public static Class168 aClass168_12;

	@OriginalMember(owner = "client!dk", name = "q", descriptor = "[I")
	public static int[] anIntArray22;

	@OriginalMember(owner = "client!dk", name = "i", descriptor = "Z")
	public static boolean aBoolean16 = false;

	@OriginalMember(owner = "client!dk", name = "m", descriptor = "Lclient!rl;")
	public static Class123 aClass123_5 = Static312.method4733();

	@OriginalMember(owner = "client!dk", name = "p", descriptor = "Ljava/lang/String;")
	public static String aString21 = "Loading world list data";

	@OriginalMember(owner = "client!dk", name = "a", descriptor = "(IIII)V")
	public static void method278(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		@Pc(32) String local32 = "::tele " + arg0 + "," + (arg2 >> 6) + "," + (arg1 >> 6) + "," + (arg2 & 0x3F) + "," + (arg1 & 0x3F);
		System.out.println(local32);
		Static37.method775(local32);
	}

	@OriginalMember(owner = "client!dk", name = "a", descriptor = "(ILclient!wf;B)I")
	public static int method281(@OriginalArg(0) int arg0, @OriginalArg(1) Class191 arg1) {
		if (!Static35.method737(arg1).method4554(arg0) && arg1.anObjectArray23 == null) {
			return -1;
		} else if (arg1.anIntArray546 == null || arg0 >= arg1.anIntArray546.length) {
			return -1;
		} else {
			return arg1.anIntArray546[arg0];
		}
	}
}
