import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static237 {

	@OriginalMember(owner = "client!ju", name = "n", descriptor = "F")
	public static float aFloat76;

	@OriginalMember(owner = "client!ju", name = "c", descriptor = "Lclient!qu;")
	public static final Class243 aClass243_50 = new Class243(48, 3);

	@OriginalMember(owner = "client!ju", name = "j", descriptor = "Lclient!pn;")
	public static final Class224 aClass224_3 = new Class224();

	@OriginalMember(owner = "client!ju", name = "k", descriptor = "I")
	public static int anInt4213 = 0;

	@OriginalMember(owner = "client!ju", name = "l", descriptor = "[S")
	public static short[] aShortArray71 = new short[256];

	@OriginalMember(owner = "client!ju", name = "m", descriptor = "[[I")
	public static final int[][] anIntArrayArray47 = new int[6][];

	@OriginalMember(owner = "client!ju", name = "a", descriptor = "(BI[S)[S")
	public static short[] method3661(@OriginalArg(1) int arg0, @OriginalArg(2) short[] arg1) {
		@Pc(14) short[] local14 = new short[arg0];
		Static553.method3369(arg1, 0, local14, 0, arg0);
		return local14;
	}

	@OriginalMember(owner = "client!ju", name = "b", descriptor = "(II)I")
	public static int method3667(@OriginalArg(1) int arg0) {
		return arg0 & 0xFF;
	}
}
