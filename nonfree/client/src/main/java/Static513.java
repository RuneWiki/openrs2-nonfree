import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static513 {

	@OriginalMember(owner = "client!se", name = "u", descriptor = "I")
	public static int anInt8871;

	@OriginalMember(owner = "client!se", name = "x", descriptor = "[I")
	public static int[] anIntArray548;

	@OriginalMember(owner = "client!se", name = "y", descriptor = "[[[B")
	public static byte[][][] aByteArrayArrayArray18;

	@OriginalMember(owner = "client!se", name = "C", descriptor = "[I")
	public static int[] anIntArray549;

	@OriginalMember(owner = "client!se", name = "J", descriptor = "[Lclient!sia;")
	public static Class309[] aClass309Array4;

	@OriginalMember(owner = "client!se", name = "G", descriptor = "Z")
	public static boolean aBoolean632 = false;

	@OriginalMember(owner = "client!se", name = "I", descriptor = "I")
	public static int anInt8880 = 0;

	@OriginalMember(owner = "client!se", name = "a", descriptor = "(CB)C")
	public static char method7656(@OriginalArg(0) char arg0) {
		if (arg0 == 'Æ') {
			return 'E';
		} else if (arg0 == 'æ') {
			return 'e';
		} else if (arg0 == 'ß') {
			return 's';
		} else if (arg0 == 'Œ') {
			return 'E';
		} else {
			return (char) (arg0 == 'œ' ? 'e' : '\u0000');
		}
	}

	@OriginalMember(owner = "client!se", name = "f", descriptor = "(I)Z")
	public static boolean method7657() {
		return Static485.anInt8420 >= 1;
	}

	@OriginalMember(owner = "client!se", name = "c", descriptor = "(B)V")
	public static void method7658() {
		Static496.aClass102_16.method2681();
	}
}
