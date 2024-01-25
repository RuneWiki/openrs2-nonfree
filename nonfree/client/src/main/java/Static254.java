import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static254 {

	@OriginalMember(owner = "client!ji", name = "i", descriptor = "I")
	public static int anInt4211;

	@OriginalMember(owner = "client!ji", name = "n", descriptor = "I")
	public static int anInt4213;

	@OriginalMember(owner = "client!ji", name = "j", descriptor = "Lclient!dh;")
	public static final Class71 aClass71_41 = new Class71(7, 6);

	@OriginalMember(owner = "client!ji", name = "k", descriptor = "Ljava/lang/String;")
	public static String aString54 = null;

	@OriginalMember(owner = "client!ji", name = "m", descriptor = "[I")
	public static final int[] anIntArray234 = new int[] { 2047, 16383, 65535 };

	@OriginalMember(owner = "client!ji", name = "a", descriptor = "(Lclient!sn;I)Z")
	public static boolean method3441(@OriginalArg(0) Class313 arg0) {
		return arg0 == Static190.aClass313_12 || arg0 == Static141.aClass313_6 || Static78.aClass313_4 == arg0 || arg0 == Static501.aClass313_13;
	}

	@OriginalMember(owner = "client!ji", name = "d", descriptor = "(I)V")
	public static void method3442() {
		for (@Pc(7) int local7 = 0; local7 < 5; local7++) {
			Static97.aBooleanArray4[local7] = false;
		}
		Static258.anInt5552 = 0;
		Static44.anInt1555 = -1;
		Static266.anInt5675 = -1;
		Static621.anInt10407 = -1;
		Static460.anInt8416 = -1;
		Static324.anInt6509 = 0;
		Static427.anInt8005 = 1;
	}
}
