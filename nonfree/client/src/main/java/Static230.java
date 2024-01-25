import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static230 {

	@OriginalMember(owner = "client!lq", name = "n", descriptor = "I")
	public static int anInt4581;

	@OriginalMember(owner = "client!lq", name = "e", descriptor = "Lclient!bd;")
	public static final Class21 aClass21_63 = new Class21("Loaded interfaces", "Benutzeroberfläche geladen.", "Interfaces chargées", "Interfaces carregadas");

	@OriginalMember(owner = "client!lq", name = "f", descriptor = "[S")
	public static final short[] aShortArray67 = new short[] { -4160, -4163, -8256, -8259, 22461 };

	@OriginalMember(owner = "client!lq", name = "o", descriptor = "Lclient!kj;")
	public static final Class131 aClass131_5 = new Class131("", 17);

	@OriginalMember(owner = "client!lq", name = "u", descriptor = "Ljava/lang/String;")
	public static String aString35 = null;

	@OriginalMember(owner = "client!lq", name = "a", descriptor = "(BI)Lclient!hu;")
	public static Class4_Sub1_Sub11 method3926(@OriginalArg(1) int arg0) {
		@Pc(10) Class4_Sub1_Sub11 local10 = (Class4_Sub1_Sub11) Static54.aClass181_5.method4420((long) arg0);
		if (local10 != null) {
			return local10;
		}
		@Pc(20) byte[] local20 = Static308.aClass38_64.method1039(0, arg0);
		if (local20 == null || local20.length <= 1) {
			return null;
		} else {
			local10 = Static26.method400(local20);
			Static54.aClass181_5.method4421((long) arg0, local10);
			return local10;
		}
	}
}
