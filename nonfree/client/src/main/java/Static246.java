import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static246 {

	@OriginalMember(owner = "client!jk", name = "e", descriptor = "Lclient!jk;")
	public static final Class173 aClass173_74 = new Class173(59, -1);

	@OriginalMember(owner = "client!jk", name = "g", descriptor = "I")
	public static final int anInt4514 = 1401;

	@OriginalMember(owner = "client!jk", name = "h", descriptor = "I")
	public static int anInt4515 = 0;

	@OriginalMember(owner = "client!jk", name = "i", descriptor = "[I")
	public static final int[] anIntArray228 = new int[32];

	@OriginalMember(owner = "client!jk", name = "b", descriptor = "(I)V")
	public static void method3955(@OriginalArg(0) int arg0) {
		if (arg0 == 0) {
			if (Static468.anInt2399 == 2) {
				Static339.aClass127Array1[0].method3176(Static526.aClass124Array2[0]);
				Static339.aClass127Array1[1].method3176(Static526.aClass124Array2[1]);
			} else if (Static468.anInt2399 == 3) {
				Static339.aClass127Array1[0].method3176(Static526.aClass124Array2[0]);
				Static339.aClass127Array1[1].method3176(Static526.aClass124Array2[1]);
				Static339.aClass127Array1[2].method3176(Static526.aClass124Array2[2]);
			} else {
				Static339.aClass127Array1[0].method3176(Static526.aClass124Array2[0]);
				Static339.aClass127Array1[1].method3176(Static526.aClass124Array2[1]);
				Static339.aClass127Array1[2].method3176(Static526.aClass124Array2[2]);
				Static339.aClass127Array1[3].method3176(Static526.aClass124Array2[3]);
			}
		} else if (arg0 == 1) {
			if (Static468.anInt2399 == 2) {
				Static339.aClass127Array1[0].method3176(Static526.aClass124Array2[2]);
			} else if (Static468.anInt2399 == 3) {
				Static339.aClass127Array1[0].method3176(Static526.aClass124Array2[3]);
				Static339.aClass127Array1[1].method3176(Static526.aClass124Array2[4]);
			} else {
				Static339.aClass127Array1[0].method3176(Static526.aClass124Array2[4]);
				Static339.aClass127Array1[1].method3176(Static526.aClass124Array2[5]);
				Static339.aClass127Array1[2].method3176(Static526.aClass124Array2[6]);
			}
		} else if (arg0 == 2) {
			if (Static468.anInt2399 == 2) {
				Static339.aClass127Array1[0].method3176(Static526.aClass124Array2[3]);
				return;
			}
			if (Static468.anInt2399 == 3) {
				Static339.aClass127Array1[0].method3176(Static526.aClass124Array2[5]);
				return;
			}
			Static339.aClass127Array1[0].method3176(Static526.aClass124Array2[7]);
		}
	}

	@OriginalMember(owner = "client!jk", name = "a", descriptor = "(III)V")
	public static void method3956(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(13) Class4_Sub5_Sub16 local13 = Static219.method3587(0, 15);
		local13.method7133();
		local13.anInt8736 = arg0;
		local13.anInt8738 = arg1;
	}
}
