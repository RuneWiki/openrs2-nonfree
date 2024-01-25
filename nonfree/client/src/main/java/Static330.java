import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static330 {

	@OriginalMember(owner = "client!mo", name = "i", descriptor = "J")
	public static long aLong174;

	@OriginalMember(owner = "client!mo", name = "q", descriptor = "Lclient!vh;")
	public static final Class344 aClass344_56 = new Class344(21, 4);

	@OriginalMember(owner = "client!mo", name = "v", descriptor = "Lclient!vh;")
	public static final Class344 aClass344_57 = new Class344(82, 1);

	@OriginalMember(owner = "client!mo", name = "w", descriptor = "[[I")
	public static final int[][] anIntArrayArray30 = new int[6][];

	@OriginalMember(owner = "client!mo", name = "c", descriptor = "(B)Ljava/lang/String;")
	public static String method5069() {
		return Static117.aBoolean207 || Static367.aClass4_Sub36_4 == null ? "" : Static367.aClass4_Sub36_4.aString146;
	}

	@OriginalMember(owner = "client!mo", name = "a", descriptor = "(BI)Z")
	public static boolean method5076(@OriginalArg(1) int arg0) {
		return arg0 == 0 || arg0 == 1 || arg0 == 2;
	}

	@OriginalMember(owner = "client!mo", name = "b", descriptor = "(BI)Lclient!dc;")
	public static Class68 method5079(@OriginalArg(1) int arg0) {
		@Pc(8) Class68[] local8 = Static372.method5568();
		for (@Pc(16) int local16 = 0; local16 < local8.length; local16++) {
			if (local8[local16].anInt2256 == arg0) {
				return local8[local16];
			}
		}
		return null;
	}
}
