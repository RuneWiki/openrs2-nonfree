import java.math.BigInteger;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static154 {

	@OriginalMember(owner = "client!fea", name = "h", descriptor = "Ljava/lang/String;")
	public static String aString30;

	@OriginalMember(owner = "client!fea", name = "c", descriptor = "Ljava/math/BigInteger;")
	public static final BigInteger aBigInteger4 = new BigInteger("10001", 16);

	@OriginalMember(owner = "client!fea", name = "a", descriptor = "(ILclient!nd;Lclient!nd;I)V")
	public static void method2689(@OriginalArg(1) Class238 arg0, @OriginalArg(2) Class238 arg1) {
		Static187.aClass238_90 = arg0;
		Static567.aClass238_265 = arg1;
	}

	@OriginalMember(owner = "client!fea", name = "a", descriptor = "(B)V")
	public static void method2691() {
		if (Static246.anIntArray290 != null && Static511.anIntArray605 != null) {
			return;
		}
		Static246.anIntArray290 = new int[256];
		Static511.anIntArray605 = new int[256];
		for (@Pc(13) int local13 = 0; local13 < 256; local13++) {
			@Pc(22) double local22 = (double) local13 / 255.0D * 6.283185307179586D;
			Static246.anIntArray290[local13] = (int) (Math.sin(local22) * 4096.0D);
			Static511.anIntArray605[local13] = (int) (Math.cos(local22) * 4096.0D);
		}
	}

	@OriginalMember(owner = "client!fea", name = "a", descriptor = "(III)V")
	public static void method2695(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		Static137.method2510(arg1, arg0);
	}
}
