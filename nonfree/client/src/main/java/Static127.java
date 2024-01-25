import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static127 {

	@OriginalMember(owner = "client!ei", name = "u", descriptor = "Lclient!kaa;")
	public static final Class181 aClass181_21 = new Class181(67, 8);

	@OriginalMember(owner = "client!ei", name = "a", descriptor = "(Lclient!wu;Lclient!wu;[IB)V")
	public static void method1900(@OriginalArg(0) Class384 arg0, @OriginalArg(1) Class384 arg1, @OriginalArg(2) int[] arg2) {
		Static558.aClass384_124 = arg0;
		Static76.aClass384_29 = arg1;
		if (arg2 != null) {
			Static137.anIntArray180 = arg2;
		}
	}

	@OriginalMember(owner = "client!ei", name = "a", descriptor = "(IC)Z")
	public static boolean method1904(@OriginalArg(1) char arg0) {
		return arg0 == ' ' || arg0 == ' ' || arg0 == '_' || arg0 == '-';
	}
}
