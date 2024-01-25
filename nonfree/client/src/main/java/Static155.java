import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static155 {

	@OriginalMember(owner = "client!eq", name = "o", descriptor = "[I")
	public static int[] anIntArray176;

	@OriginalMember(owner = "client!eq", name = "b", descriptor = "I")
	public static int anInt2759 = 1;

	@OriginalMember(owner = "client!eq", name = "a", descriptor = "(IBI)I")
	public static int method2526(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(17) double local17 = Math.log((double) arg0) / Math.log(2.0D);
		@Pc(24) double local24 = Math.log((double) arg1) / Math.log(2.0D);
		@Pc(33) double local33 = Math.random() * (local17 - local24) + local24;
		return (int) (Math.pow(2.0D, local33) + 0.5D);
	}
}
