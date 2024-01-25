import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static272 {

	@OriginalMember(owner = "client!nu", name = "s", descriptor = "Lclient!wj;")
	public static final Class265 aClass265_103 = new Class265(60, 3);

	@OriginalMember(owner = "client!nu", name = "F", descriptor = "[I")
	public static final int[] anIntArray411 = new int[25];

	@OriginalMember(owner = "client!nu", name = "a", descriptor = "([SII)[S")
	public static short[] method4048(@OriginalArg(0) short[] arg0, @OriginalArg(1) int arg1) {
		@Pc(11) short[] local11 = new short[arg1];
		Static457.method681(arg0, 0, local11, 0, arg1);
		return local11;
	}
}
