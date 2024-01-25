import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static338 {

	@OriginalMember(owner = "client!nq", name = "J", descriptor = "I")
	public static int anInt6353;

	@OriginalMember(owner = "client!nq", name = "K", descriptor = "Lclient!gp;")
	public static Class117 aClass117_151;

	@OriginalMember(owner = "client!nq", name = "D", descriptor = "Lclient!iu;")
	public static final Class150 aClass150_159 = new Class150(35, 5);

	@OriginalMember(owner = "client!nq", name = "H", descriptor = "[I")
	public static final int[] anIntArray473 = new int[] { 2, 1, 1, 1, 2, 2, 2, 1, 3, 3, 3, 2, 0, 4, 0 };

	@OriginalMember(owner = "client!nq", name = "I", descriptor = "Lclient!pp;")
	public static final Class236 aClass236_56 = new Class236(2, 2);

	@OriginalMember(owner = "client!nq", name = "c", descriptor = "(III)I")
	public static int method5273(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return arg0 == 1 || arg0 == 3 ? Static363.anIntArray510[arg1 & 0x3] : Static454.anIntArray594[arg1 & 0x3];
	}
}
