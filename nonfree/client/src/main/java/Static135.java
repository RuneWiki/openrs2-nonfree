import java.math.BigInteger;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static135 {

	@OriginalMember(owner = "client!oh", name = "l", descriptor = "Lclient!sd;")
	public static Class60 aClass60_28;

	@OriginalMember(owner = "client!oh", name = "b", descriptor = "I")
	public static int anInt3348 = -1;

	@OriginalMember(owner = "client!oh", name = "g", descriptor = "Ljava/math/BigInteger;")
	public static final BigInteger aBigInteger2 = new BigInteger("7162900525229798032761816791230527296329313291232324290237849263501208207972894053929065636522363163621000728841182238772712427862772219676577293600221789");

	@OriginalMember(owner = "client!oh", name = "h", descriptor = "I")
	public static int anInt3352 = 255;

	@OriginalMember(owner = "client!oh", name = "i", descriptor = "Lclient!oc;")
	public static final Class65 aClass65_1866 = Static118.method2249(":chalreq:");

	@OriginalMember(owner = "client!oh", name = "n", descriptor = "Lclient!oc;")
	private static final Class65 aClass65_1868 = Static118.method2249("RuneScape is loading )2 please wait)3)3)3");

	@OriginalMember(owner = "client!oh", name = "m", descriptor = "Lclient!oc;")
	public static Class65 aClass65_1867 = aClass65_1868;

	@OriginalMember(owner = "client!oh", name = "o", descriptor = "Lclient!oc;")
	public static final Class65 aClass65_1869 = Static118.method2249("cookiehost");

	@OriginalMember(owner = "client!oh", name = "p", descriptor = "Lclient!oc;")
	public static final Class65 aClass65_1870 = Static118.method2249("Die Verbindung konnte");

	@OriginalMember(owner = "client!oh", name = "q", descriptor = "Lclient!oc;")
	public static final Class65 aClass65_1871 = Static118.method2249("Mem:");

	@OriginalMember(owner = "client!oh", name = "r", descriptor = "Lclient!oc;")
	public static final Class65 aClass65_1872 = Static118.method2249("<col=ff7000>");

	@OriginalMember(owner = "client!oh", name = "s", descriptor = "[I")
	public static final int[] anIntArray379 = new int[2000];

	@OriginalMember(owner = "client!oh", name = "a", descriptor = "(IB)I")
	public static int method2564(@OriginalArg(0) int arg0) {
		return arg0 & 0xFF;
	}

	@OriginalMember(owner = "client!oh", name = "b", descriptor = "(IJ)V")
	public static void method2569(@OriginalArg(1) long arg0) {
		if (arg0 <= 0L) {
			return;
		}
		if (arg0 % 10L == 0L) {
			Static164.method2818(arg0 - 1L);
			Static164.method2818(1L);
		} else {
			Static164.method2818(arg0);
		}
	}
}
