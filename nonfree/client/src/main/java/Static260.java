import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static260 {

	@OriginalMember(owner = "client!jo", name = "g", descriptor = "[[B")
	public static byte[][] aByteArrayArray25;

	@OriginalMember(owner = "client!jo", name = "h", descriptor = "I")
	public static int anInt5022;

	@OriginalMember(owner = "client!jo", name = "a", descriptor = "[I")
	public static final int[] anIntArray237 = new int[1];

	@OriginalMember(owner = "client!jo", name = "c", descriptor = "Lclient!or;")
	public static final Class244 aClass244_40 = new Class244();

	@OriginalMember(owner = "client!jo", name = "i", descriptor = "[Lclient!vc;")
	public static final Interface21[] anInterface21Array1 = new Interface21[75];

	@OriginalMember(owner = "client!jo", name = "a", descriptor = "(ILjava/lang/String;B)V")
	public static void method4014(@OriginalArg(1) String arg0) {
		Static295.method4425("", "", arg0, 0, 4, "");
	}

	@OriginalMember(owner = "client!jo", name = "a", descriptor = "(ZC)Z")
	public static boolean method4015(@OriginalArg(1) char arg0) {
		if (Character.isISOControl(arg0)) {
			return false;
		} else if (Static228.method3730(arg0)) {
			return true;
		} else {
			@Pc(18) char[] local18 = Static24.aCharArray1;
			for (@Pc(20) int local20 = 0; local20 < local18.length; local20++) {
				@Pc(26) char local26 = local18[local20];
				if (arg0 == local26) {
					return true;
				}
			}
			@Pc(53) char[] local53 = Static60.aCharArray2;
			for (@Pc(55) int local55 = 0; local55 < local53.length; local55++) {
				@Pc(61) char local61 = local53[local55];
				if (arg0 == local61) {
					return true;
				}
			}
			return false;
		}
	}
}
