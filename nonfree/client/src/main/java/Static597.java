import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static597 {

	@OriginalMember(owner = "client!su", name = "e", descriptor = "Lclient!ji;")
	public static final Class197 aClass197_25 = new Class197(4, 1, 1, 1);

	@OriginalMember(owner = "client!su", name = "b", descriptor = "I")
	public static int anInt9295 = 0;

	@OriginalMember(owner = "client!su", name = "c", descriptor = "[I")
	public static final int[] anIntArray677 = new int[2048];

	@OriginalMember(owner = "client!su", name = "a", descriptor = "(Lclient!nca;II)Lclient!pga;")
	public static Class289 method8191(@OriginalArg(0) Class254 arg0, @OriginalArg(1) int arg1) {
		@Pc(18) byte[] local18 = arg0.method6079(arg1);
		return local18 == null ? null : new Class289(local18);
	}
}
