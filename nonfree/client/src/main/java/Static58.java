import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static58 {

	@OriginalMember(owner = "client!ed", name = "F", descriptor = "[[[B")
	public static byte[][][] aByteArrayArrayArray10;

	@OriginalMember(owner = "client!ed", name = "z", descriptor = "[I")
	public static int[] anIntArray90 = new int[14];

	@OriginalMember(owner = "client!ed", name = "A", descriptor = "I")
	public static int anInt992 = 0;

	@OriginalMember(owner = "client!ed", name = "C", descriptor = "I")
	public static int anInt994 = 0;

	@OriginalMember(owner = "client!ed", name = "a", descriptor = "(ZC)Z")
	public static boolean method814(@OriginalArg(1) char arg0) {
		return arg0 >= 'A' && arg0 <= 'Z' || arg0 >= 'a' && arg0 <= 'z';
	}

	@OriginalMember(owner = "client!ed", name = "a", descriptor = "(Ljava/lang/String;Z)I")
	public static int method817(@OriginalArg(0) String arg0) {
		if (Static53.aClass82_13 == null || arg0.length() == 0) {
			return -1;
		}
		for (@Pc(22) int local22 = 0; local22 < Static53.aClass82_13.anInt2893; local22++) {
			if (Static207.method3772(" ", Static53.aClass82_13.aStringArray38[local22], "<br>").equals(arg0)) {
				return local22;
			}
		}
		return -1;
	}

	@OriginalMember(owner = "client!ed", name = "a", descriptor = "(IZ)Z")
	public static boolean method818(@OriginalArg(1) boolean arg0) {
		@Pc(1) boolean local1 = Static167.method2899();
		if (local1 == arg0) {
			return true;
		}
		if (!arg0) {
			Static167.method2906();
		} else if (!Static167.method2908() || !Static167.method2905() || !Static167.method2902()) {
			arg0 = false;
		}
		Static134.aBoolean218 = arg0;
		Static239.method3687(Static253.aClass175_4);
		if (arg0 == local1) {
			return false;
		} else {
			((Class85_Sub1) Static110.anInterface2_1).method2284();
			return true;
		}
	}
}
