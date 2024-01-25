import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static224 {

	@OriginalMember(owner = "client!ii", name = "h", descriptor = "J")
	public static long aLong106;

	@OriginalMember(owner = "client!ii", name = "c", descriptor = "[I")
	public static final int[] anIntArray215 = new int[14];

	@OriginalMember(owner = "client!ii", name = "a", descriptor = "(IILclient!ri;)Lclient!fm;")
	public static Class3_Sub19 method3703(@OriginalArg(0) int arg0, @OriginalArg(2) Class284 arg1) {
		@Pc(13) byte[] local13 = arg1.method6357(arg0);
		return local13 == null ? null : new Class3_Sub19(local13);
	}
}
