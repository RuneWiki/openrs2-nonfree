import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static37 {

	@OriginalMember(owner = "client!bq", name = "e", descriptor = "I")
	public static int anInt612;

	@OriginalMember(owner = "client!bq", name = "g", descriptor = "Lclient!qn;")
	public static Class211 aClass211_13;

	@OriginalMember(owner = "client!bq", name = "i", descriptor = "Lclient!jv;")
	public static Class142 aClass142_2;

	@OriginalMember(owner = "client!bq", name = "b", descriptor = "[B")
	public static final byte[] aByteArray5 = new byte[520];

	@OriginalMember(owner = "client!bq", name = "d", descriptor = "Z")
	public static boolean aBoolean35 = false;

	@OriginalMember(owner = "client!bq", name = "f", descriptor = "[B")
	public static final byte[] aByteArray6 = new byte[2048];

	@OriginalMember(owner = "client!bq", name = "h", descriptor = "Lclient!pp;")
	public static final Class201 aClass201_2 = new Class201("RC", 1);

	@OriginalMember(owner = "client!bq", name = "j", descriptor = "I")
	public static int anInt613 = 0;

	@OriginalMember(owner = "client!bq", name = "a", descriptor = "(Z)I")
	public static int method500() {
		if (Static276.aFrame5 == null) {
			return Static141.aBoolean166 ? 2 : 1;
		} else {
			return 3;
		}
	}

	@OriginalMember(owner = "client!bq", name = "a", descriptor = "(II)Lclient!pi;")
	public static Class4_Sub2_Sub15 method501(@OriginalArg(0) int arg0) {
		@Pc(10) Class4_Sub2_Sub15 local10 = (Class4_Sub2_Sub15) Static119.aClass260_6.method5744((long) arg0);
		if (local10 != null) {
			return local10;
		}
		@Pc(20) byte[] local20 = Static4.aClass211_2.method4377(arg0, 0);
		if (local20 == null || local20.length <= 1) {
			return null;
		} else {
			local10 = Static236.method3190(local20);
			Static119.aClass260_6.method5746(local10, (long) arg0);
			return local10;
		}
	}
}
