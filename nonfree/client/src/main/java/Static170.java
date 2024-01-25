import java.math.BigInteger;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static170 {

	@OriginalMember(owner = "client!gba", name = "Pb", descriptor = "I")
	public static int anInt3041;

	@OriginalMember(owner = "client!gba", name = "Rb", descriptor = "[I")
	public static int[] anIntArray170;

	@OriginalMember(owner = "client!gba", name = "Wb", descriptor = "Ljava/lang/String;")
	public static String aString37;

	@OriginalMember(owner = "client!gba", name = "Lb", descriptor = "Ljava/math/BigInteger;")
	public static final BigInteger aBigInteger2 = new BigInteger("10001", 16);

	@OriginalMember(owner = "client!gba", name = "Sb", descriptor = "Lclient!tg;")
	public static final Class330 aClass330_13 = new Class330();

	@OriginalMember(owner = "client!gba", name = "Vb", descriptor = "Lclient!tm;")
	public static final Class337 aClass337_55 = new Class337(52, 6);

	@OriginalMember(owner = "client!gba", name = "a", descriptor = "(IILclient!ha;Z)Lclient!da;")
	public static Class55 method2646(@OriginalArg(1) int arg0, @OriginalArg(2) Class133 arg1, @OriginalArg(3) boolean arg2) {
		@Pc(14) Class214 local14 = Static352.method5258(arg2, arg1, arg0);
		return local14 == null ? null : local14.aClass55_10;
	}

	@OriginalMember(owner = "client!gba", name = "A", descriptor = "(I)Lclient!eh;")
	public static Class49 method2650() {
		try {
			return (Class49) Class.forName("Class49_Sub1").getDeclaredConstructor().newInstance();
		} catch (@Pc(14) Throwable local14) {
			return null;
		}
	}

	@OriginalMember(owner = "client!gba", name = "B", descriptor = "(I)V")
	public static void method2654() {
		Static255.aFont1 = null;
		Static538.anImage3 = null;
	}
}
