import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static18 {

	@OriginalMember(owner = "client!aq", name = "R", descriptor = "Lclient!o;")
	public static Class49 aClass49_1;

	@OriginalMember(owner = "client!aq", name = "H", descriptor = "[[I")
	public static final int[][] anIntArrayArray1 = new int[6][];

	@OriginalMember(owner = "client!aq", name = "O", descriptor = "Lclient!pu;")
	public static final Class198 aClass198_6 = new Class198("Discard", "Ablegen", "Jeter", "Descartar");

	@OriginalMember(owner = "client!aq", name = "Q", descriptor = "I")
	public static int anInt395 = 0;

	@OriginalMember(owner = "client!aq", name = "a", descriptor = "(Ljava/lang/String;I)I")
	public static int method304(@OriginalArg(0) String arg0) {
		if (arg0 == null) {
			return -1;
		}
		for (@Pc(18) int local18 = 0; local18 < Static244.anInt3939; local18++) {
			if (arg0.equalsIgnoreCase(Static225.aStringArray27[local18])) {
				return local18;
			}
		}
		return -1;
	}
}
