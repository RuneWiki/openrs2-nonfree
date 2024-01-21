import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static59 {

	@OriginalMember(owner = "client!gb", name = "V", descriptor = "I")
	public static int anInt1907;

	@OriginalMember(owner = "client!gb", name = "Y", descriptor = "Lclient!rf;")
	private static Class70 aClass70_591 = Static49.method1293("Loaded interfaces");

	@OriginalMember(owner = "client!gb", name = "ab", descriptor = "Lclient!rf;")
	public static Class70 aClass70_592 = aClass70_591;

	@OriginalMember(owner = "client!gb", name = "bb", descriptor = "Lclient!rf;")
	public static Class70 aClass70_593 = Static49.method1293("null");

	@OriginalMember(owner = "client!gb", name = "a", descriptor = "(IILclient!u;ZLclient!u;)Lclient!j;")
	public static Class1_Sub1_Sub10 method1447(@OriginalArg(0) int arg0, @OriginalArg(2) Class76 arg1, @OriginalArg(4) Class76 arg2) {
		@Pc(3) boolean local3 = true;
		@Pc(12) int[] local12 = arg1.method3311(arg0);
		for (@Pc(14) int local14 = 0; local14 < local12.length; local14++) {
			@Pc(26) byte[] local26 = arg1.method3324(local12[local14], arg0);
			if (local26 == null) {
				local3 = false;
			} else {
				@Pc(46) int local46 = local26[1] & 0xFF | (local26[0] & 0xFF) << 8;
				@Pc(54) byte[] local54 = arg2.method3324(0, local46);
				if (local54 == null) {
					local3 = false;
				}
			}
		}
		if (!local3) {
			return null;
		}
		try {
			return new Class1_Sub1_Sub10(arg1, arg2, arg0, false);
		} catch (@Pc(88) Exception local88) {
			return null;
		}
	}

	@OriginalMember(owner = "client!gb", name = "f", descriptor = "(I)V")
	public static void method1449() {
		aClass70_591 = null;
		aClass70_593 = null;
		aClass70_592 = null;
	}
}
