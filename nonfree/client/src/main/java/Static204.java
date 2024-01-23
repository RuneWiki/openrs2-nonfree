import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static204 {

	@OriginalMember(owner = "client!rf", name = "R", descriptor = "I")
	public static int anInt4527;

	@OriginalMember(owner = "client!rf", name = "O", descriptor = "Lclient!vd;")
	public static Class140 aClass140_13 = new Class140(8);

	@OriginalMember(owner = "client!rf", name = "U", descriptor = "Ljava/lang/String;")
	public static String aString307 = "glow1:";

	@OriginalMember(owner = "client!rf", name = "a", descriptor = "(BLclient!hc;)V")
	public static void method3421(@OriginalArg(1) Class51 arg0) {
		Static150.aClass51_57 = arg0;
		Static23.anInt757 = Static150.aClass51_57.method1875(16);
	}

	@OriginalMember(owner = "client!rf", name = "a", descriptor = "(Ljava/lang/String;B)I")
	public static int method3422(@OriginalArg(0) String arg0) {
		for (@Pc(7) int local7 = 0; local7 < Static258.aStringArray38.length; local7++) {
			if (Static258.aStringArray38[local7].equalsIgnoreCase(arg0)) {
				return local7;
			}
		}
		return -1;
	}

	@OriginalMember(owner = "client!rf", name = "b", descriptor = "(IB)V")
	public static void method3424(@OriginalArg(0) int arg0) {
		@Pc(14) Class1_Sub2_Sub18 local14 = Static13.method232(arg0, 5);
		local14.method3805();
	}
}
