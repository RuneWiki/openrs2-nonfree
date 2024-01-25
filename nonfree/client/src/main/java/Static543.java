import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static543 {

	@OriginalMember(owner = "client!us", name = "b", descriptor = "I")
	public static int anInt9642;

	@OriginalMember(owner = "client!us", name = "c", descriptor = "[[I")
	public static final int[][] anIntArrayArray57 = new int[][] { { 2, 4, 6, 0 }, { 0, 2, 3, 5, 6, 4 }, { 0, 1, 4, 5 }, { 4, 6, 0, 2 }, { 2, 4, 0 }, { 0, 2, 4 }, { 6, 0, 1, 2, 4, 5 }, { 0, 1, 2, 4, 6, 7 }, { 4, 7, 6, 0 }, { 0, 8, 6, 1, 9, 2, 9, 4 }, { 2, 9, 4, 0, 8, 6 }, { 2, 11, 3, 7, 10, 10, 6, 6 }, { 2, 4, 6, 0 } };

	@OriginalMember(owner = "client!us", name = "d", descriptor = "Lclient!hf;")
	public static final Class136 aClass136_8 = new Class136();

	@OriginalMember(owner = "client!us", name = "e", descriptor = "J")
	public static long aLong252 = -1L;

	@OriginalMember(owner = "client!us", name = "a", descriptor = "(IB)V")
	public static void method7875(@OriginalArg(0) int arg0) {
		@Pc(10) Class4_Sub5_Sub16 local10 = Static219.method3587(arg0, 6);
		local10.method7134();
	}
}
