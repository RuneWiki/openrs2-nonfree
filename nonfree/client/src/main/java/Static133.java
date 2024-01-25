import java.math.BigInteger;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static133 {

	@OriginalMember(owner = "client!gi", name = "b", descriptor = "I")
	public static int anInt2586;

	@OriginalMember(owner = "client!gi", name = "g", descriptor = "I")
	public static int anInt2589;

	@OriginalMember(owner = "client!gi", name = "e", descriptor = "Ljava/math/BigInteger;")
	public static final BigInteger aBigInteger1 = new BigInteger("7162900525229798032761816791230527296329313291232324290237849263501208207972894053929065636522363163621000728841182238772712427862772219676577293600221789");

	@OriginalMember(owner = "client!gi", name = "f", descriptor = "Lclient!cu;")
	public static final Class44 aClass44_34 = new Class44(30, 7);

	@OriginalMember(owner = "client!gi", name = "a", descriptor = "(IB)V")
	public static void method1921(@OriginalArg(0) int arg0) {
		Static17.anInt401 = arg0;
		Static402.aClass129_67.method3025();
	}
}
