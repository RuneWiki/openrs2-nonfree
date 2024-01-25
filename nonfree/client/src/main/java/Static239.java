import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static239 {

	@OriginalMember(owner = "client!ij", name = "c", descriptor = "I")
	public static int anInt4786;

	@OriginalMember(owner = "client!ij", name = "b", descriptor = "[[Ljava/lang/String;")
	public static final String[][] aStringArrayArray1 = new String[][] { { "M1", "M2", "S1", "F" }, { "M1", "M2", "M3", "S1", "S2", "F" }, { "M1", "M2", "M3", "M4", "S1", "S2", "S3", "F" } };

	@OriginalMember(owner = "client!ij", name = "d", descriptor = "Lclient!mia;")
	public static final Class208 aClass208_40 = new Class208(21, -1);

	@OriginalMember(owner = "client!ij", name = "a", descriptor = "(IIZ)Z")
	public static boolean method4149(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return (arg0 & 0x100) != 0;
	}
}
