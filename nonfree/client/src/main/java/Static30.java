import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static30 {

	@OriginalMember(owner = "client!bba", name = "A", descriptor = "I")
	public static int anInt6667;

	@OriginalMember(owner = "client!bba", name = "y", descriptor = "J")
	public static final long aLong191 = (long) (Math.random() * 9.999999999E9D);

	@OriginalMember(owner = "client!bba", name = "z", descriptor = "I")
	public static int anInt6666 = -1;

	@OriginalMember(owner = "client!bba", name = "D", descriptor = "I")
	public static int anInt6668 = 0;

	@OriginalMember(owner = "client!bba", name = "a", descriptor = "(II)Z")
	public static boolean method5638(@OriginalArg(1) int arg0) {
		return arg0 == 21 || arg0 == 57 || arg0 == 10 || arg0 == 50 || arg0 == 25 || arg0 == 46 || arg0 == 51;
	}
}
