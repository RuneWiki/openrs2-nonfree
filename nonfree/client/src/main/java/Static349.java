import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static349 {

	@OriginalMember(owner = "client!wh", name = "a", descriptor = "I")
	public static int anInt6795;

	@OriginalMember(owner = "client!wh", name = "j", descriptor = "Lclient!am;")
	public static Class11 aClass11_154;

	@OriginalMember(owner = "client!wh", name = "b", descriptor = "[Lclient!tq;")
	public static final Class4_Sub7[] aClass4_Sub7Array1 = new Class4_Sub7[2048];

	@OriginalMember(owner = "client!wh", name = "c", descriptor = "Ljava/lang/String;")
	public static final String aString253 = "flash3:";

	@OriginalMember(owner = "client!wh", name = "d", descriptor = "[I")
	public static final int[] anIntArray540 = new int[50];

	@OriginalMember(owner = "client!wh", name = "f", descriptor = "[Lclient!sj;")
	public static final Class190[] aClass190Array1 = new Class190[6];

	@OriginalMember(owner = "client!wh", name = "i", descriptor = "Ljava/lang/String;")
	public static String aString254 = "glow2:";

	@OriginalMember(owner = "client!wh", name = "a", descriptor = "(II)Lclient!ek;")
	public static Class64 method5643(@OriginalArg(0) int arg0) {
		@Pc(10) Class64 local10 = (Class64) Static275.aClass154_84.method4222((long) arg0);
		if (local10 != null) {
			return local10;
		}
		@Pc(20) byte[] local20 = Static270.aClass11_149.method288(arg0, 30);
		local10 = new Class64();
		if (local20 != null) {
			local10.method1387(arg0, new Class4_Sub7(local20));
		}
		Static275.aClass154_84.method4221((long) arg0, local10);
		return local10;
	}
}
