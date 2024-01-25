import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static41 {

	@OriginalMember(owner = "client!bh", name = "b", descriptor = "Lclient!vm;")
	public static final Class363 aClass363_1 = new Class363();

	@OriginalMember(owner = "client!bh", name = "c", descriptor = "I")
	public static int anInt706 = 0;

	@OriginalMember(owner = "client!bh", name = "a", descriptor = "(ILjava/lang/String;)Z")
	public static boolean method724(@OriginalArg(1) String arg0) {
		if (arg0 == null) {
			return false;
		}
		for (@Pc(19) int local19 = 0; local19 < Static310.anInt5466; local19++) {
			if (arg0.equalsIgnoreCase(Static55.aStringArray3[local19])) {
				return true;
			}
			if (arg0.equalsIgnoreCase(Static611.aStringArray44[local19])) {
				return true;
			}
		}
		return false;
	}
}
