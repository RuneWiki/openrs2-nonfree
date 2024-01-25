import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static709 {

	@OriginalMember(owner = "client!wha", name = "w", descriptor = "I")
	public static int anInt11217;

	@OriginalMember(owner = "client!wha", name = "v", descriptor = "I")
	public static int anInt11219;

	@OriginalMember(owner = "client!wha", name = "t", descriptor = "Lclient!jia;")
	public static final Class186 aClass186_200 = new Class186(144, 2);

	@OriginalMember(owner = "client!wha", name = "z", descriptor = "[I")
	public static final int[] anIntArray637 = new int[] { 2047, 16383, 65535 };

	@OriginalMember(owner = "client!wha", name = "a", descriptor = "(IB)Lclient!uj;")
	public static Class371 method9379(@OriginalArg(0) int arg0) {
		@Pc(8) Class371[] local8 = Static393.method5918();
		for (@Pc(17) int local17 = 0; local17 < local8.length; local17++) {
			@Pc(23) Class371 local23 = local8[local17];
			if (local23.anInt10440 == arg0) {
				return local23;
			}
		}
		return null;
	}
}
