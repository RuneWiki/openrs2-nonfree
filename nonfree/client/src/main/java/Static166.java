import java.io.IOException;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static166 {

	@OriginalMember(owner = "client!ij", name = "k", descriptor = "Lclient!ul;")
	public static Class246 aClass246_94;

	@OriginalMember(owner = "client!ij", name = "o", descriptor = "I")
	public static int anInt3057;

	@OriginalMember(owner = "client!ij", name = "n", descriptor = "Lclient!ak;")
	public static final Class7 aClass7_70 = new Class7("flash1:", "blinken1:", "clignotant1:", "flash1:");

	@OriginalMember(owner = "client!ij", name = "r", descriptor = "Lclient!gu;")
	public static final Class96 aClass96_19 = new Class96(16);

	@OriginalMember(owner = "client!ij", name = "a", descriptor = "(III)Z")
	public static boolean method2654(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		return (arg1 & 0x580) != 0;
	}

	@OriginalMember(owner = "client!ij", name = "a", descriptor = "(IZ)V")
	public static void method2655(@OriginalArg(1) boolean arg0) {
		Static435.method5771();
		if (!Static340.method4806(Static342.anInt5771)) {
			return;
		}
		Static245.anInt4501++;
		if (Static245.anInt4501 < 50 && !arg0) {
			return;
		}
		Static245.anInt4501 = 0;
		if (!Static418.aBoolean473 && Static82.aClass229_1 != null) {
			Static193.method2984(Static249.aClass179_53);
			try {
				Static82.aClass229_1.method5207(Static92.aClass1_Sub5_Sub1_1.aByteArray89, Static92.aClass1_Sub5_Sub1_1.anInt6475);
				Static92.aClass1_Sub5_Sub1_1.anInt6475 = 0;
			} catch (@Pc(50) IOException local50) {
				Static418.aBoolean473 = true;
			}
		}
		Static435.method5771();
	}
}
