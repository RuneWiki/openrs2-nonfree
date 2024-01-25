import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static448 {

	@OriginalMember(owner = "client!pda", name = "c", descriptor = "I")
	public static int anInt7323;

	@OriginalMember(owner = "client!pda", name = "d", descriptor = "I")
	public static int anInt7325;

	@OriginalMember(owner = "client!pda", name = "b", descriptor = "[Ljava/lang/String;")
	public static final String[] aStringArray32 = new String[] { "Sun", "Mon", "Tue", "Wed", "Thu", "Fri", "Sat" };

	@OriginalMember(owner = "client!pda", name = "e", descriptor = "I")
	public static int anInt7326 = -1;

	@OriginalMember(owner = "client!pda", name = "a", descriptor = "Z")
	public static boolean aBoolean496 = false;

	@OriginalMember(owner = "client!pda", name = "a", descriptor = "(Z[B)[B")
	public static byte[] method6383(@OriginalArg(1) byte[] arg0) {
		if (arg0 == null) {
			return null;
		} else {
			@Pc(18) byte[] local18 = new byte[arg0.length];
			Static693.method8320(arg0, 0, local18, 0, arg0.length);
			return local18;
		}
	}
}
