import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static666 {

	@OriginalMember(owner = "client!wba", name = "e", descriptor = "[I")
	public static int[] anIntArray584;

	@OriginalMember(owner = "client!wba", name = "c", descriptor = "I")
	public static int anInt10882;

	@OriginalMember(owner = "client!wba", name = "a", descriptor = "Lclient!vq;")
	public static final Class382 aClass382_22 = new Class382(15, 0, 1, 0);

	@OriginalMember(owner = "client!wba", name = "a", descriptor = "(I[B)[B")
	public static byte[] method9235(@OriginalArg(1) byte[] arg0) {
		@Pc(14) Class14_Sub21 local14 = new Class14_Sub21(arg0);
		@Pc(18) int local18 = local14.method7695(106);
		@Pc(22) int local22 = local14.method7748();
		if (local22 < 0 || Static169.anInt2625 != 0 && local22 > Static169.anInt2625) {
			throw new RuntimeException();
		} else if (local18 == 0) {
			@Pc(113) byte[] local113 = new byte[local22];
			local14.method7750(local22, 0, local113);
			return local113;
		} else {
			@Pc(50) int local50 = local14.method7748();
			if (local50 < 0 || Static169.anInt2625 != 0 && Static169.anInt2625 < local50) {
				throw new RuntimeException();
			}
			@Pc(79) byte[] local79 = new byte[local50];
			if (local18 == 1) {
				Static96.method1612(local79, local50, arg0, local22);
			} else {
				@Pc(95) Class179 local95 = Static44.aClass179_1;
				synchronized (Static44.aClass179_1) {
					Static44.aClass179_1.method4389(local14, local79);
				}
			}
			return local79;
		}
	}
}
