import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static313 {

	@OriginalMember(owner = "client!lha", name = "d", descriptor = "Lclient!tm;")
	public static Class337 aClass337_96;

	@OriginalMember(owner = "client!lha", name = "e", descriptor = "I")
	public static int anInt5371;

	@OriginalMember(owner = "client!lha", name = "a", descriptor = "[F")
	public static final float[] aFloatArray41 = new float[2];

	@OriginalMember(owner = "client!lha", name = "b", descriptor = "Lclient!tm;")
	public static final Class337 aClass337_95 = new Class337(55, 17);

	@OriginalMember(owner = "client!lha", name = "f", descriptor = "Lclient!tm;")
	public static final Class337 aClass337_97 = new Class337(42, 6);

	@OriginalMember(owner = "client!lha", name = "a", descriptor = "(III)Z")
	public static boolean method4818(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		return (arg1 & 0x10000) != 0;
	}
}
