import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static120 {

	@OriginalMember(owner = "client!ega", name = "C", descriptor = "[I")
	public static int[] anIntArray152;

	@OriginalMember(owner = "client!ega", name = "D", descriptor = "I")
	public static int anInt3090;

	@OriginalMember(owner = "client!ega", name = "E", descriptor = "I")
	public static int anInt3091;

	@OriginalMember(owner = "client!ega", name = "a", descriptor = "(Ljava/lang/String;B)I")
	public static int method2826(@OriginalArg(0) String arg0) {
		@Pc(15) int local15 = arg0.length();
		@Pc(17) int local17 = 0;
		for (@Pc(19) int local19 = 0; local19 < local15; local19++) {
			local17 = Static306.method5197(arg0.charAt(local19)) + (local17 << 5) - local17;
		}
		return local17;
	}
}
