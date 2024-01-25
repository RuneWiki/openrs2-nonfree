import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static13 {

	@OriginalMember(owner = "client!ah", name = "b", descriptor = "[Lclient!im;")
	public static Class166[] aClass166Array1 = new Class166[50];

	@OriginalMember(owner = "client!ah", name = "c", descriptor = "Lclient!tm;")
	public static final Class337 aClass337_12 = new Class337(15, 7);

	@OriginalMember(owner = "client!ah", name = "f", descriptor = "J")
	public static long aLong5 = -1L;

	@OriginalMember(owner = "client!ah", name = "a", descriptor = "(Ljava/lang/String;I)I")
	public static int method224(@OriginalArg(0) String arg0) {
		@Pc(11) int local11 = arg0.length();
		@Pc(13) int local13 = 0;
		for (@Pc(15) int local15 = 0; local15 < local11; local15++) {
			local13 = (local13 << 5) + Static573.method2156(arg0.charAt(local15)) - local13;
		}
		return local13;
	}
}
