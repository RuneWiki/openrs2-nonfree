import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static261 {

	@OriginalMember(owner = "client!ua", name = "S", descriptor = "I")
	public static int anInt5718;

	@OriginalMember(owner = "client!ua", name = "X", descriptor = "[I")
	public static int[] anIntArray567 = new int[4];

	@OriginalMember(owner = "client!ua", name = "Z", descriptor = "[I")
	public static int[] anIntArray568 = new int[5];

	@OriginalMember(owner = "client!ua", name = "a", descriptor = "([IB)[I")
	public static int[] method4462(@OriginalArg(0) int[] arg0) {
		if (arg0 == null) {
			return null;
		} else {
			@Pc(17) int[] local17 = new int[arg0.length];
			Static302.method1374(arg0, 0, local17, 0, arg0.length);
			return local17;
		}
	}
}
