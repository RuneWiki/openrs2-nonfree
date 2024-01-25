import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static62 {

	@OriginalMember(owner = "client!dl", name = "i", descriptor = "Lclient!sc;")
	public static Class179 aClass179_2;

	@OriginalMember(owner = "client!dl", name = "d", descriptor = "[Z")
	public static final boolean[] aBooleanArray7 = new boolean[5];

	@OriginalMember(owner = "client!dl", name = "g", descriptor = "[I")
	public static final int[] anIntArray99 = new int[] { 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99 };

	@OriginalMember(owner = "client!dl", name = "l", descriptor = "[[I")
	public static final int[][] anIntArrayArray18 = new int[][] { { 2, 4, 6, 0 }, { 0, 2, 4, 6 }, { 0, 2, 4 }, { 4, 0, 2 }, { 2, 4, 0 }, { 0, 2, 4 }, { 6, 0, 1, 2, 4, 5 }, { 0, 4, 7, 6 }, { 4, 7, 6, 0 }, { 0, 8, 6, 2, 9, 4 }, { 2, 9, 4, 0, 8, 6 }, { 2, 11, 4, 6, 10, 0 }, { 2, 4, 6, 0 } };

	@OriginalMember(owner = "client!dl", name = "a", descriptor = "(IIBII)V")
	public static void method1300(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		@Pc(8) Class2_Sub9_Sub4 local8 = Static98.method1971(10, arg3);
		local8.method1801();
		local8.anInt1719 = arg0;
		local8.anInt1729 = arg2;
		local8.anInt1723 = arg1;
	}
}
