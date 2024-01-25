import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static75 {

	@OriginalMember(owner = "client!cm", name = "d", descriptor = "[[I")
	public static final int[][] anIntArrayArray7 = new int[][] { { 2, 4 }, { 2, 4 }, { 5, 2, 4 }, { 4, 5, 2 }, { 2, 4, 5 }, { 5, 2, 4 }, { 1, 6, 2, 5 }, { 1, 6, 7, 1 }, { 6, 7, 1, 1 }, { 0, 8, 9, 8, 9, 4 }, { 8, 9, 4, 0, 8, 9 }, { 2, 10, 0, 10, 11, 11 }, { 2, 4 }, { 1, 6, 7, 1 }, { 1, 6, 7, 1 } };

	@OriginalMember(owner = "client!cm", name = "l", descriptor = "I")
	public static int anInt1264 = 0;

	@OriginalMember(owner = "client!cm", name = "u", descriptor = "[I")
	public static final int[] anIntArray101 = new int[256];

	@OriginalMember(owner = "client!cm", name = "a", descriptor = "(III)Z")
	public static boolean method1234(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return (arg0 & 0x800) != 0;
	}

	@OriginalMember(owner = "client!cm", name = "a", descriptor = "([SIZ)[S")
	public static short[] method1235(@OriginalArg(0) short[] arg0, @OriginalArg(1) int arg1) {
		@Pc(6) short[] local6 = new short[arg1];
		Static655.method4111(arg0, 0, local6, 0, arg1);
		return local6;
	}
}
