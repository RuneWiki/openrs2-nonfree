import java.math.BigInteger;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static64 {

	@OriginalMember(owner = "client!gi", name = "l", descriptor = "I")
	public static int anInt1390;

	@OriginalMember(owner = "client!gi", name = "g", descriptor = "Lclient!bb;")
	public static final Class8 aClass8_15 = new Class8(200);

	@OriginalMember(owner = "client!gi", name = "i", descriptor = "Lclient!dc;")
	public static final Class20 aClass20_479 = Static161.method2452("Bitte warten Sie )2 es wird versucht)1 die Verbindung wiederherzustellen)3");

	@OriginalMember(owner = "client!gi", name = "j", descriptor = "Lclient!dc;")
	public static final Class20 aClass20_480 = Static161.method2452("<img=0>");

	@OriginalMember(owner = "client!gi", name = "k", descriptor = "Ljava/math/BigInteger;")
	public static final BigInteger aBigInteger2 = new BigInteger("58778699976184461502525193738213253649000149147835990136706041084440742975821");

	@OriginalMember(owner = "client!gi", name = "m", descriptor = "Lclient!dc;")
	public static final Class20 aClass20_481 = Static161.method2452("p12_full");

	@OriginalMember(owner = "client!gi", name = "a", descriptor = "(BII)I")
	public static int method1047(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		if (arg1 == -2) {
			return 12345678;
		} else if (arg1 == -1) {
			if (arg0 < 2) {
				arg0 = 2;
			} else if (arg0 > 126) {
				arg0 = 126;
			}
			return arg0;
		} else {
			arg0 = (arg1 & 0x7F) * arg0 >> 7;
			if (arg0 < 2) {
				arg0 = 2;
			} else if (arg0 > 126) {
				arg0 = 126;
			}
			return (arg1 & 0xFF80) + arg0;
		}
	}

	@OriginalMember(owner = "client!gi", name = "a", descriptor = "(I)V")
	public static void method1048() {
		if (Static94.anIntArray191 != null && Static106.anIntArray238 != null) {
			return;
		}
		Static106.anIntArray238 = new int[256];
		Static94.anIntArray191 = new int[256];
		for (@Pc(17) int local17 = 0; local17 < 256; local17++) {
			@Pc(26) double local26 = (double) local17 / 255.0D * 6.283185307179586D;
			Static94.anIntArray191[local17] = (int) (Math.sin(local26) * 4096.0D);
			Static106.anIntArray238[local17] = (int) (Math.cos(local26) * 4096.0D);
		}
	}
}
