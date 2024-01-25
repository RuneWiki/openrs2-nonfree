import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static214 {

	@OriginalMember(owner = "client!hba", name = "k", descriptor = "[J")
	public static long[] aLongArray7;

	@OriginalMember(owner = "client!hba", name = "c", descriptor = "Lclient!fja;")
	public static final Class126 aClass126_74 = new Class126(107, 6);

	@OriginalMember(owner = "client!hba", name = "i", descriptor = "[I")
	public static final int[] anIntArray270 = new int[] { 16, 32, 64, 128 };

	@OriginalMember(owner = "client!hba", name = "j", descriptor = "[I")
	public static final int[] anIntArray271 = new int[13];

	@OriginalMember(owner = "client!hba", name = "a", descriptor = "(IB)I")
	public static int method3384(@OriginalArg(0) int arg0) {
		return arg0 >>> 8;
	}
}
