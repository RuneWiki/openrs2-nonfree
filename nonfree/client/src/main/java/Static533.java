import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static533 {

	@OriginalMember(owner = "client!su", name = "qb", descriptor = "I")
	public static int anInt9234 = 0;

	@OriginalMember(owner = "client!su", name = "Ub", descriptor = "[[I")
	public static final int[][] anIntArrayArray49 = new int[128][128];

	@OriginalMember(owner = "client!su", name = "a", descriptor = "(BI)I")
	public static int method7861(@OriginalArg(1) int arg0) {
		return arg0 == 16711935 ? -1 : Static537.method7904(arg0);
	}

	@OriginalMember(owner = "client!su", name = "a", descriptor = "(ILclient!vd;B)Lclient!os;")
	public static Class6_Sub32 method7868(@OriginalArg(0) int arg0, @OriginalArg(1) Class353 arg1) {
		@Pc(8) byte[] local8 = arg1.method8419(arg0);
		return local8 == null ? null : new Class6_Sub32(local8);
	}
}
