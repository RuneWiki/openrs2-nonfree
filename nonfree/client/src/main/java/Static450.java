import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static450 {

	@OriginalMember(owner = "client!rr", name = "D", descriptor = "[Ljava/lang/String;")
	public static String[] aStringArray48;

	@OriginalMember(owner = "client!rr", name = "E", descriptor = "I")
	public static int anInt8253 = 0;

	@OriginalMember(owner = "client!rr", name = "H", descriptor = "Z")
	public static boolean aBoolean604 = true;

	@OriginalMember(owner = "client!rr", name = "a", descriptor = "(I[BB)[B")
	public static byte[] method6897(@OriginalArg(0) int arg0, @OriginalArg(1) byte[] arg1) {
		@Pc(11) byte[] local11 = new byte[arg0];
		Static589.method5382(arg1, 0, local11, 0, arg0);
		return local11;
	}

	@OriginalMember(owner = "client!rr", name = "a", descriptor = "(BCLjava/lang/String;)I")
	public static int method6898(@OriginalArg(1) char arg0, @OriginalArg(2) String arg1) {
		@Pc(12) int local12 = 0;
		@Pc(15) int local15 = arg1.length();
		for (@Pc(17) int local17 = 0; local17 < local15; local17++) {
			if (arg0 == arg1.charAt(local17)) {
				local12++;
			}
		}
		return local12;
	}
}
