import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static446 {

	@OriginalMember(owner = "client!pa", name = "I", descriptor = "Lclient!o;")
	public static Class259 aClass259_6;

	@OriginalMember(owner = "client!pa", name = "G", descriptor = "Lclient!lb;")
	public static Class218 aClass218_1;

	@OriginalMember(owner = "client!pa", name = "H", descriptor = "Lclient!sb;")
	public static final Class322 aClass322_136 = new Class322(40, -1);

	@OriginalMember(owner = "client!pa", name = "B", descriptor = "[J")
	public static final long[] aLongArray17 = new long[32];

	@OriginalMember(owner = "client!pa", name = "z", descriptor = "Lclient!sb;")
	public static final Class322 aClass322_137 = new Class322(70, 6);

	@OriginalMember(owner = "client!pa", name = "a", descriptor = "(Ljava/lang/String;I)Z")
	public static boolean method6903(@OriginalArg(0) String arg0) {
		if (arg0 == null) {
			return false;
		}
		for (@Pc(12) int local12 = 0; local12 < Static287.anInt5151; local12++) {
			if (arg0.equalsIgnoreCase(Static591.aStringArray36[local12])) {
				return true;
			}
			if (arg0.equalsIgnoreCase(Static353.aStringArray26[local12])) {
				return true;
			}
		}
		return false;
	}

	@OriginalMember(owner = "client!pa", name = "b", descriptor = "(III)Z")
	public static boolean method6906(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return (arg0 & 0x20) != 0;
	}
}
