import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static520 {

	@OriginalMember(owner = "client!un", name = "v", descriptor = "I")
	public static int anInt8968;

	@OriginalMember(owner = "client!un", name = "e", descriptor = "Lclient!nc;")
	public static final Class208 aClass208_13 = new Class208();

	@OriginalMember(owner = "client!un", name = "a", descriptor = "(Lclient!ll;I)I")
	public static int method7328(@OriginalArg(0) Class186 arg0) {
		if (arg0 == Static152.aClass186_1) {
			return 9216;
		} else if (arg0 == Static414.aClass186_3) {
			return 34065;
		} else if (Static490.aClass186_4 == arg0) {
			return 34066;
		} else {
			throw new IllegalArgumentException();
		}
	}

	@OriginalMember(owner = "client!un", name = "a", descriptor = "([ILclient!pq;ILclient!pq;)V")
	public static void method7330(@OriginalArg(0) int[] arg0, @OriginalArg(1) Class251 arg1, @OriginalArg(3) Class251 arg2) {
		if (arg0 != null) {
			Static380.anIntArray555 = arg0;
		}
		Static251.aClass251_87 = arg2;
		Static15.aClass251_139 = arg1;
	}
}
