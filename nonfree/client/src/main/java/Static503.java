import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static503 {

	@OriginalMember(owner = "client!tda", name = "C", descriptor = "F")
	public static float aFloat153;

	@OriginalMember(owner = "client!tda", name = "F", descriptor = "[[[B")
	public static byte[][][] aByteArrayArrayArray11;

	@OriginalMember(owner = "client!tda", name = "B", descriptor = "I")
	public static final int anInt8175 = -1;

	@OriginalMember(owner = "client!tda", name = "D", descriptor = "I")
	public static final int anInt8176 = 1339;

	@OriginalMember(owner = "client!tda", name = "E", descriptor = "I")
	public static int anInt8177 = 0;

	@OriginalMember(owner = "client!tda", name = "J", descriptor = "I")
	public static int anInt8181 = 0;

	@OriginalMember(owner = "client!tda", name = "a", descriptor = "(BLjava/lang/String;)Z")
	public static boolean method6787(@OriginalArg(1) String arg0) {
		if (arg0 == null) {
			return false;
		}
		for (@Pc(16) int local16 = 0; local16 < Static579.anInt9370; local16++) {
			if (arg0.equalsIgnoreCase(Static189.aStringArray16[local16])) {
				return true;
			}
			if (arg0.equalsIgnoreCase(Static119.aStringArray8[local16])) {
				return true;
			}
		}
		return false;
	}

	@OriginalMember(owner = "client!tda", name = "d", descriptor = "(I)V")
	public static void method6789() {
		Static307.aClass112_33 = new Class112();
	}
}
