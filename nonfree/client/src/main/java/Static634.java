import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static634 {

	@OriginalMember(owner = "client!tr", name = "n", descriptor = "Z")
	public static boolean aBoolean658;

	@OriginalMember(owner = "client!tr", name = "r", descriptor = "[[I")
	public static final int[][] anIntArrayArray51 = new int[][] { { 0, 2, 4, 6 }, { 6, 0, 2, 4 }, { 6, 0, 2 }, { 2, 6, 0 }, { 0, 2, 6 }, { 6, 0, 2 }, { 5, 6, 0, 1, 2, 4 }, { 7, 2, 4, 4 }, { 2, 4, 4, 7 }, { 6, 6, 4, 0, 2, 2 }, { 0, 2, 2, 6, 6, 4 }, { 0, 2, 2, 4, 6, 6 }, { 0, 2, 4, 6 } };

	@OriginalMember(owner = "client!tr", name = "q", descriptor = "Z")
	public static boolean aBoolean656 = false;

	@OriginalMember(owner = "client!tr", name = "k", descriptor = "Z")
	public static boolean aBoolean657 = false;

	@OriginalMember(owner = "client!tr", name = "a", descriptor = "(Ljava/lang/String;I)V")
	public static void method8326(@OriginalArg(0) String arg0) {
		Static689.aString129 = arg0;
		Static685.anInt6069 = Static689.aString129.length();
	}
}
