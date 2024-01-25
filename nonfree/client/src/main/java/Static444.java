import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static444 {

	@OriginalMember(owner = "client!sca", name = "p", descriptor = "[I")
	public static int[] anIntArray587;

	@OriginalMember(owner = "client!sca", name = "A", descriptor = "Lclient!gp;")
	public static Class117 aClass117_183;

	@OriginalMember(owner = "client!sca", name = "B", descriptor = "I")
	public static int anInt7777;

	@OriginalMember(owner = "client!sca", name = "y", descriptor = "Lclient!hf;")
	public static final Class127 aClass127_8 = new Class127(2);

	@OriginalMember(owner = "client!sca", name = "C", descriptor = "[B")
	public static final byte[] aByteArray110 = new byte[2048];

	@OriginalMember(owner = "client!sca", name = "D", descriptor = "I")
	public static int anInt7778 = 0;

	@OriginalMember(owner = "client!sca", name = "a", descriptor = "(BLjava/lang/String;)Z")
	public static boolean method6295(@OriginalArg(1) String arg0) {
		if (arg0 == null) {
			return false;
		}
		for (@Pc(16) int local16 = 0; local16 < Static59.anInt1208; local16++) {
			if (arg0.equalsIgnoreCase(Static23.aStringArray7[local16])) {
				return true;
			}
		}
		return arg0.equalsIgnoreCase(Static35.aClass15_Sub2_Sub1_Sub1_1.aString18);
	}
}
