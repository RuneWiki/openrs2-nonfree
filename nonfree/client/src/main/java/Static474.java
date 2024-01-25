import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static474 {

	@OriginalMember(owner = "client!tr", name = "c", descriptor = "F")
	public static float aFloat153;

	@OriginalMember(owner = "client!tr", name = "h", descriptor = "I")
	public static int anInt7956;

	@OriginalMember(owner = "client!tr", name = "d", descriptor = "Lclient!im;")
	public static final Class140 aClass140_130 = new Class140(3, 0);

	@OriginalMember(owner = "client!tr", name = "f", descriptor = "Z")
	public static boolean aBoolean564 = false;

	@OriginalMember(owner = "client!tr", name = "g", descriptor = "I")
	public static int anInt7955 = -1;

	@OriginalMember(owner = "client!tr", name = "a", descriptor = "(I)Lclient!gj;")
	public static Class72_Sub3 method6595() {
		@Pc(12) Class72_Sub3 local12 = (Class72_Sub3) Static365.aClass299_8.method7034();
		if (local12 == null) {
			return new Class72_Sub3();
		} else {
			Static321.anInt5889--;
			return local12;
		}
	}

	@OriginalMember(owner = "client!tr", name = "a", descriptor = "([BII)[B")
	public static byte[] method6597(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int arg1) {
		@Pc(6) byte[] local6 = new byte[arg1];
		Static551.method3488(arg0, 0, local6, 0, arg1);
		return local6;
	}

	@OriginalMember(owner = "client!tr", name = "a", descriptor = "(ZII)Z")
	public static boolean method6598(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		return Static500.method5192(arg1, arg0) || Static255.method4305(arg1, arg0);
	}
}
