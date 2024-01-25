import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static170 {

	@OriginalMember(owner = "client!fia", name = "i", descriptor = "J")
	public static long aLong67;

	@OriginalMember(owner = "client!fia", name = "h", descriptor = "[I")
	public static final int[] anIntArray166 = new int[3];

	@OriginalMember(owner = "client!fia", name = "c", descriptor = "(II)Lclient!dl;")
	public static Class87 method2960(@OriginalArg(1) int arg0) {
		@Pc(6) Class87[] local6 = Static519.method7342();
		for (@Pc(8) int local8 = 0; local8 < local6.length; local8++) {
			@Pc(13) Class87 local13 = local6[local8];
			if (local13.anInt2365 == arg0) {
				return local13;
			}
		}
		return null;
	}

	@OriginalMember(owner = "client!fia", name = "c", descriptor = "(I)Z")
	public static boolean method2962() {
		return Static483.anInt8099 > 0;
	}
}
