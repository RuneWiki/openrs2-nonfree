import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static266 {

	@OriginalMember(owner = "client!lb", name = "e", descriptor = "Lclient!kr;")
	public static Class171 aClass171_150;

	@OriginalMember(owner = "client!lb", name = "f", descriptor = "Lclient!ha;")
	public static Class2 aClass2_50;

	@OriginalMember(owner = "client!lb", name = "a", descriptor = "Lclient!bv;")
	public static final Class37 aClass37_105 = new Class37();

	@OriginalMember(owner = "client!lb", name = "c", descriptor = "[[I")
	public static final int[][] anIntArrayArray116 = new int[][] { { 0, 2, 4, 6 }, { 6, 0, 2, 3, 5, 3 }, { 6, 0, 2, 4 }, { 2, 5, 6, 1 }, { 0, 2, 6 }, { 6, 0, 2 }, { 5, 6, 0, 1, 2, 4 }, { 7, 7, 1, 2, 4, 6 }, { 2, 4, 4, 7 }, { 6, 6, 4, 0, 1, 1, 3, 3 }, { 0, 2, 2, 6, 6, 4 }, { 0, 2, 2, 3, 7, 0, 4, 3 }, { 0, 2, 4, 6 } };

	@OriginalMember(owner = "client!lb", name = "a", descriptor = "(Ljava/lang/String;IZ)I")
	public static int method7454(@OriginalArg(0) String arg0) {
		return Static543.method7540(arg0, 16);
	}

	@OriginalMember(owner = "client!lb", name = "a", descriptor = "(ILjava/lang/String;)I")
	public static int method7459(@OriginalArg(1) String arg0) {
		for (@Pc(12) int local12 = 0; local12 < Static285.aStringArray28.length; local12++) {
			if (Static285.aStringArray28[local12].equalsIgnoreCase(arg0)) {
				return local12;
			}
		}
		return -1;
	}
}
