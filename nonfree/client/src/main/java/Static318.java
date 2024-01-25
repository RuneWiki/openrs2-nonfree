import java.math.BigInteger;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static318 {

	@OriginalMember(owner = "client!pu", name = "V", descriptor = "Lclient!ql;")
	public static Class132 aClass132_3;

	@OriginalMember(owner = "client!pu", name = "z", descriptor = "Lclient!sk;")
	public static final Class231 aClass231_91 = new Class231("glow1:", "leuchten1:", "brillant1:", "brilho1:");

	@OriginalMember(owner = "client!pu", name = "W", descriptor = "Ljava/math/BigInteger;")
	public static final BigInteger aBigInteger2 = new BigInteger("7162900525229798032761816791230527296329313291232324290237849263501208207972894053929065636522363163621000728841182238772712427862772219676577293600221789");

	@OriginalMember(owner = "client!pu", name = "Z", descriptor = "I")
	public static int anInt5150 = 0;

	@OriginalMember(owner = "client!pu", name = "b", descriptor = "(III)I")
	public static int method4505(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		return arg0 == 4 || arg0 == 5 ? Static72.anIntArray156[arg1 & 0x3] : 256;
	}

	@OriginalMember(owner = "client!pu", name = "a", descriptor = "(B)V")
	public static void method4506() {
		Static88.aFont1 = null;
		Static201.anImage2 = null;
	}

	@OriginalMember(owner = "client!pu", name = "a", descriptor = "(IB)I")
	public static int method4511(@OriginalArg(0) int arg0) {
		return arg0 >>> 8;
	}
}
