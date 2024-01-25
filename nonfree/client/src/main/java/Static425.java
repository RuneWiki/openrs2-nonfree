import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static425 {

	@OriginalMember(owner = "client!qc", name = "a", descriptor = "I")
	public static int anInt7330;

	@OriginalMember(owner = "client!qc", name = "d", descriptor = "I")
	public static int anInt7333;

	@OriginalMember(owner = "client!qc", name = "f", descriptor = "I")
	public static int anInt7335;

	@OriginalMember(owner = "client!qc", name = "g", descriptor = "[Ljava/lang/String;")
	public static String[] aStringArray32;

	@OriginalMember(owner = "client!qc", name = "a", descriptor = "(BII)Z")
	public static boolean method6081(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		return (arg1 & 0x21) != 0;
	}

	@OriginalMember(owner = "client!qc", name = "a", descriptor = "(ZI)I")
	public static int method6082(@OriginalArg(1) int arg0) {
		return arg0 >>> 8;
	}

	@OriginalMember(owner = "client!qc", name = "a", descriptor = "(IC)Z")
	public static boolean method6084(@OriginalArg(1) char arg0) {
		return arg0 >= '0' && arg0 <= '9';
	}
}
