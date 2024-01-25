import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static110 {

	@OriginalMember(owner = "client!ei", name = "f", descriptor = "F")
	public static float aFloat19;

	@OriginalMember(owner = "client!ei", name = "d", descriptor = "I")
	public static int anInt2232 = 0;

	@OriginalMember(owner = "client!ei", name = "e", descriptor = "Lclient!vt;")
	public static final Class306 aClass306_29 = new Class306("Loaded config", "Konfig geladen.", "Fichiers config chargés", "Config carregada");

	@OriginalMember(owner = "client!ei", name = "a", descriptor = "(BLclient!jq;)Lclient!jq;")
	public static Class156 method1888(@OriginalArg(1) Class156 arg0) {
		@Pc(6) Class156 local6 = Static67.method1226(arg0);
		if (local6 == null) {
			local6 = arg0.aClass156_9;
		}
		return local6;
	}
}
