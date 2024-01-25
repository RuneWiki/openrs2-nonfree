import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static106 {

	@OriginalMember(owner = "client!fd", name = "K", descriptor = "[I")
	public static final int[] anIntArray173 = new int[] { 0, 1, 2, 2, 1, 1, 2, 3, 1, 3, 3, 4, 2, 0, 4 };

	@OriginalMember(owner = "client!fd", name = "M", descriptor = "Lclient!uf;")
	public static final Class237 aClass237_31 = new Class237(100, 14);

	@OriginalMember(owner = "client!fd", name = "O", descriptor = "[J")
	public static final long[] aLongArray3 = new long[32];

	@OriginalMember(owner = "client!fd", name = "P", descriptor = "[I")
	public static int[] anIntArray174 = new int[1];

	@OriginalMember(owner = "client!fd", name = "Q", descriptor = "I")
	public static int anInt1963 = 0;

	@OriginalMember(owner = "client!fd", name = "R", descriptor = "Z")
	public static boolean aBoolean110 = false;

	@OriginalMember(owner = "client!fd", name = "c", descriptor = "(II)I")
	public static int method1649(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return Static51.anIntArrayArray28 == null ? 0 : Static51.anIntArrayArray28[arg0][arg1] & 0xFFFFFF;
	}
}
