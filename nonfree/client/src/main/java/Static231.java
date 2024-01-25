import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static231 {

	@OriginalMember(owner = "client!he", name = "F", descriptor = "[I")
	public static int[] anIntArray285;

	@OriginalMember(owner = "client!he", name = "D", descriptor = "Lclient!lk;")
	public static final Class225 aClass225_69 = new Class225(72, 4);

	@OriginalMember(owner = "client!he", name = "E", descriptor = "[I")
	public static final int[] anIntArray286 = new int[1];

	@OriginalMember(owner = "client!he", name = "J", descriptor = "Lclient!tfa;")
	public static final Class352 aClass352_5 = new Class352();

	@OriginalMember(owner = "client!he", name = "a", descriptor = "(Lclient!nca;[ILclient!nca;B)V")
	public static void method3314(@OriginalArg(0) Class254 arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) Class254 arg2) {
		Static695.aClass254_165 = arg2;
		if (arg1 != null) {
			Static167.anIntArray217 = arg1;
		}
		Static246.aClass254_84 = arg0;
	}

	@OriginalMember(owner = "client!he", name = "d", descriptor = "(III)I")
	public static int method3315(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(10) double local10 = Math.log((double) arg1) / Math.log(2.0D);
		@Pc(17) double local17 = Math.log((double) arg0) / Math.log(2.0D);
		@Pc(32) double local32 = Math.random() * (local10 - local17) + local17;
		return (int) (Math.pow(2.0D, local32) + 0.5D);
	}
}
