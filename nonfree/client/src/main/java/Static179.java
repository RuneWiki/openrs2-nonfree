import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static179 {

	@OriginalMember(owner = "client!wg", name = "d", descriptor = "Lclient!ea;")
	private static Class18 aClass18_1233 = Static8.method128("wishes to duel with you)3");

	@OriginalMember(owner = "client!wg", name = "a", descriptor = "Lclient!ea;")
	public static Class18 aClass18_1231 = aClass18_1233;

	@OriginalMember(owner = "client!wg", name = "c", descriptor = "Lclient!ea;")
	public static Class18 aClass18_1232 = Static8.method128("::");

	@OriginalMember(owner = "client!wg", name = "f", descriptor = "Lclient!ea;")
	public static Class18 aClass18_1234 = Static8.method128(" steht bereits auf Ihrer Freunde)2Liste(Q");

	@OriginalMember(owner = "client!wg", name = "i", descriptor = "Lclient!ea;")
	private static Class18 aClass18_1236 = Static8.method128("and choose the (Wcreate account(W");

	@OriginalMember(owner = "client!wg", name = "g", descriptor = "Lclient!ea;")
	public static Class18 aClass18_1235 = aClass18_1236;

	@OriginalMember(owner = "client!wg", name = "j", descriptor = "J")
	public static long aLong138 = 0L;

	@OriginalMember(owner = "client!wg", name = "a", descriptor = "(I)V")
	public static void method3196() {
		aClass18_1232 = null;
		aClass18_1235 = null;
		aClass18_1234 = null;
		aClass18_1231 = null;
		aClass18_1236 = null;
		aClass18_1233 = null;
	}

	@OriginalMember(owner = "client!wg", name = "a", descriptor = "(Lclient!dd;II)Z")
	public static boolean method3197(@OriginalArg(0) Class16 arg0, @OriginalArg(2) int arg1) {
		@Pc(8) byte[] local8 = arg0.method2234(arg1);
		if (local8 == null) {
			return false;
		} else {
			Static109.method2228(local8);
			return true;
		}
	}
}
