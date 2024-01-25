import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static483 {

	@OriginalMember(owner = "client!tba", name = "b", descriptor = "Lclient!pca;")
	public static final Class245 aClass245_61 = new Class245(8);

	@OriginalMember(owner = "client!tba", name = "c", descriptor = "I")
	public static int anInt8763 = 0;

	@OriginalMember(owner = "client!tba", name = "a", descriptor = "(I[B)[B")
	public static byte[] method7335(@OriginalArg(1) byte[] arg0) {
		@Pc(13) Class6_Sub26 local13 = new Class6_Sub26(arg0);
		@Pc(19) int local19 = local13.method4966();
		@Pc(23) int local23 = local13.method5000();
		if (local23 < 0 || Static435.anInt7936 != 0 && Static435.anInt7936 < local23) {
			throw new RuntimeException();
		} else if (local19 == 0) {
			@Pc(52) byte[] local52 = new byte[local23];
			local13.method4977(local23, local52);
			return local52;
		} else {
			@Pc(66) int local66 = local13.method5000();
			if (local66 < 0 || Static435.anInt7936 != 0 && local66 > Static435.anInt7936) {
				throw new RuntimeException();
			}
			@Pc(83) byte[] local83 = new byte[local66];
			if (local19 == 1) {
				Static481.method7324(local83, local66, arg0, local23);
			} else {
				@Pc(99) Class306 local99 = Static532.aClass306_1;
				synchronized (Static532.aClass306_1) {
					Static532.aClass306_1.method7451(local13, local83);
				}
			}
			return local83;
		}
	}

	@OriginalMember(owner = "client!tba", name = "a", descriptor = "(I)V")
	public static void method7336() {
		Static220.anImage2 = null;
		Static168.aFont1 = null;
	}
}
