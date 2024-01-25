import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static167 {

	@OriginalMember(owner = "client!fn", name = "R", descriptor = "[[[I")
	public static int[][][] anIntArrayArrayArray8;

	@OriginalMember(owner = "client!fn", name = "K", descriptor = "Lclient!waa;")
	public static final Class373 aClass373_1 = new Class373("WTI", "office", "_wti", 5);

	@OriginalMember(owner = "client!fn", name = "P", descriptor = "Lclient!kg;")
	public static final Class200 aClass200_70 = new Class200(14, 8);

	@OriginalMember(owner = "client!fn", name = "Q", descriptor = "[I")
	public static final int[] anIntArray223 = new int[] { 1, 4, 1, 2 };

	@OriginalMember(owner = "client!fn", name = "d", descriptor = "(III)I")
	public static int method2914(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(10) double local10 = Math.log((double) arg0) / Math.log(2.0D);
		@Pc(22) double local22 = Math.log((double) arg1) / Math.log(2.0D);
		@Pc(31) double local31 = Math.random() * (local10 - local22) + local22;
		return (int) (Math.pow(2.0D, local31) + 0.5D);
	}
}
