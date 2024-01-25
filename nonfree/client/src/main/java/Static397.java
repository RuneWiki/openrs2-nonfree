import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static397 {

	@OriginalMember(owner = "client!nfa", name = "D", descriptor = "I")
	public static int anInt11031;

	@OriginalMember(owner = "client!nfa", name = "s", descriptor = "Lclient!in;")
	public static final Class169 aClass169_256 = new Class169(125, 12);

	@OriginalMember(owner = "client!nfa", name = "w", descriptor = "Z")
	public static volatile boolean aBoolean791 = false;

	@OriginalMember(owner = "client!nfa", name = "y", descriptor = "I")
	public static int anInt11030 = 1;

	@OriginalMember(owner = "client!nfa", name = "B", descriptor = "Lclient!in;")
	public static final Class169 aClass169_257 = new Class169(69, 1);

	@OriginalMember(owner = "client!nfa", name = "C", descriptor = "Z")
	public static boolean aBoolean792 = false;

	@OriginalMember(owner = "client!nfa", name = "a", descriptor = "(Ljava/lang/String;I)I")
	public static int method9440(@OriginalArg(0) String arg0) {
		for (@Pc(12) int local12 = 0; local12 < Static372.aStringArray39.length; local12++) {
			if (Static372.aStringArray39[local12].equalsIgnoreCase(arg0)) {
				return local12;
			}
		}
		return -1;
	}
}
