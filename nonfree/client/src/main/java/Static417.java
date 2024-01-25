import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static417 {

	@OriginalMember(owner = "client!ut", name = "t", descriptor = "[[B")
	public static final byte[][] aByteArrayArray57 = new byte[1000][];

	@OriginalMember(owner = "client!ut", name = "u", descriptor = "[Ljava/lang/String;")
	public static final String[] aStringArray39 = new String[100];

	@OriginalMember(owner = "client!ut", name = "x", descriptor = "[Lclient!hv;")
	public static final Class110[] aClass110Array1 = new Class110[30];

	@OriginalMember(owner = "client!ut", name = "z", descriptor = "Lclient!kc;")
	public static final Class134 aClass134_99 = new Class134("Please wait...", "Bitte warte...", "Veuillez patienter...", "Aguarde...");

	@OriginalMember(owner = "client!ut", name = "a", descriptor = "(ZZ)Z")
	public static boolean method5271(@OriginalArg(1) boolean arg0) {
		@Pc(11) boolean local11 = Static82.aClass163_1.method5555();
		if (arg0 == local11) {
			return true;
		}
		if (!arg0) {
			Static82.aClass163_1.method5520();
		} else if (!Static82.aClass163_1.method5492()) {
			arg0 = false;
		}
		if (arg0 == local11) {
			return false;
		} else {
			Static2.aClass148_Sub1_1.aBoolean261 = arg0;
			Static2.aClass148_Sub1_1.method3041(Static79.aClass183_2);
			return true;
		}
	}
}
