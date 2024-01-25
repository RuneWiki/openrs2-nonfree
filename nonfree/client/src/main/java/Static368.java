import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static368 {

	@OriginalMember(owner = "client!sn", name = "f", descriptor = "Lclient!ya;")
	public static Class135 aClass135_11;

	@OriginalMember(owner = "client!sn", name = "a", descriptor = "Ljava/lang/String;")
	public static String aString66 = null;

	@OriginalMember(owner = "client!sn", name = "d", descriptor = "Lclient!ap;")
	public static final Class15 aClass15_110 = new Class15("Please wait...", "Bitte warte...", "Veuillez patienter...", "Aguarde...");

	@OriginalMember(owner = "client!sn", name = "h", descriptor = "I")
	public static int anInt6060 = 0;

	@OriginalMember(owner = "client!sn", name = "i", descriptor = "Lclient!dq;")
	public static final Class56 aClass56_226 = new Class56(64, 2);

	@OriginalMember(owner = "client!sn", name = "a", descriptor = "(ILclient!vn;B)Lclient!ur;")
	public static Class251 method4862(@OriginalArg(0) int arg0, @OriginalArg(1) Class8_Sub3 arg1) {
		@Pc(9) Class251 local9;
		if (Static41.aClass251_1 == null) {
			local9 = new Class251();
		} else {
			local9 = Static41.aClass251_1;
			Static41.aClass251_1 = Static41.aClass251_1.aClass251_3;
			local9.aClass251_3 = null;
			Static103.anInt1877--;
		}
		local9.aClass8_Sub3_2 = arg1;
		local9.anInt7018 = arg0;
		return local9;
	}

	@OriginalMember(owner = "client!sn", name = "a", descriptor = "(BI)Z")
	public static boolean method4864(@OriginalArg(1) int arg0) {
		return arg0 == 0 || arg0 == 1 || arg0 == 2;
	}
}
