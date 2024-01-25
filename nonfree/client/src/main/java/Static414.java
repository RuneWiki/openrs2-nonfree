import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static414 {

	@OriginalMember(owner = "client!ur", name = "I", descriptor = "[I")
	public static int[] anIntArray465;

	@OriginalMember(owner = "client!ur", name = "N", descriptor = "[Z")
	public static boolean[] aBooleanArray22;

	@OriginalMember(owner = "client!ur", name = "J", descriptor = "Lclient!rn;")
	public static final Class217 aClass217_105 = new Class217(18, 7);

	@OriginalMember(owner = "client!ur", name = "a", descriptor = "(Ljava/lang/String;I)I")
	public static int method5320(@OriginalArg(0) String arg0) {
		@Pc(12) int local12 = arg0.length();
		@Pc(14) int local14 = 0;
		for (@Pc(16) int local16 = 0; local16 < local12; local16++) {
			local14 = (local14 << 5) + Static177.method2821(arg0.charAt(local16)) - local14;
		}
		return local14;
	}
}
