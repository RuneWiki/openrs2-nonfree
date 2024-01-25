import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static478 {

	@OriginalMember(owner = "client!os", name = "k", descriptor = "[Z")
	public static boolean[] aBooleanArray12;

	@OriginalMember(owner = "client!os", name = "h", descriptor = "Lclient!pc;")
	public static final Class3_Sub47 aClass3_Sub47_2 = new Class3_Sub47(0, -1);

	@OriginalMember(owner = "client!os", name = "i", descriptor = "I")
	public static int anInt5830 = 0;

	@OriginalMember(owner = "client!os", name = "d", descriptor = "I")
	public static int anInt5834 = 0;

	@OriginalMember(owner = "client!os", name = "a", descriptor = "(IBI)Z")
	public static boolean method5098(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		return (arg0 & 0x180) != 0;
	}

	@OriginalMember(owner = "client!os", name = "b", descriptor = "(I)V")
	public static void method5099() {
		Static169.aClass196Array1 = null;
	}

	@OriginalMember(owner = "client!os", name = "a", descriptor = "(Ljava/lang/String;I)I")
	public static int method5101(@OriginalArg(0) String arg0) {
		if (arg0 == null) {
			return -1;
		}
		for (@Pc(12) int local12 = 0; local12 < Static544.anInt9946; local12++) {
			if (arg0.equalsIgnoreCase(Static636.aStringArray41[local12])) {
				return local12;
			}
		}
		return -1;
	}
}
