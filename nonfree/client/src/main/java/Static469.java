import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static469 {

	@OriginalMember(owner = "client!rr", name = "m", descriptor = "I")
	public static int anInt4271;

	@OriginalMember(owner = "client!rr", name = "o", descriptor = "I")
	public static int anInt4273;

	@OriginalMember(owner = "client!rr", name = "h", descriptor = "Lclient!hb;")
	public static final Class122 aClass122_4 = new Class122(1);

	@OriginalMember(owner = "client!rr", name = "i", descriptor = "I")
	public static int anInt4270 = 0;

	@OriginalMember(owner = "client!rr", name = "j", descriptor = "Lclient!gk;")
	public static Class112 aClass112_27 = new Class112();

	@OriginalMember(owner = "client!rr", name = "k", descriptor = "Z")
	public static boolean aBoolean316 = false;

	@OriginalMember(owner = "client!rr", name = "l", descriptor = "Lclient!sq;")
	public static final Class314 aClass314_11 = new Class314(4);

	@OriginalMember(owner = "client!rr", name = "n", descriptor = "I")
	public static int anInt4272 = 0;

	@OriginalMember(owner = "client!rr", name = "a", descriptor = "(II)Lclient!ld;")
	public static Class186 method3733(@OriginalArg(1) int arg0) {
		@Pc(10) Class186 local10 = (Class186) Static108.aClass6_59.method92((long) arg0);
		if (local10 != null) {
			return local10;
		}
		@Pc(28) byte[] local28 = Static372.aClass322_113.method6802(0, arg0);
		local10 = new Class186();
		if (local28 != null) {
			local10.method4388(new Class3_Sub11(local28));
		}
		local10.method4386();
		Static108.aClass6_59.method106((long) arg0, local10);
		return local10;
	}
}
