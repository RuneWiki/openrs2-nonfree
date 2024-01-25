import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static130 {

	@OriginalMember(owner = "client!gm", name = "F", descriptor = "Lclient!gk;")
	public static final Class83 aClass83_52 = new Class83("Loaded config", "Konfig geladen.", "Fichiers config chargés", "Config carregada");

	@OriginalMember(owner = "client!gm", name = "Q", descriptor = "Lclient!sl;")
	public static final Class215 aClass215_34 = new Class215(65, 3);

	@OriginalMember(owner = "client!gm", name = "a", descriptor = "(BLjava/lang/String;)I")
	public static int method2302(@OriginalArg(1) String arg0) {
		@Pc(16) int local16 = arg0.length();
		@Pc(18) int local18 = 0;
		for (@Pc(20) int local20 = 0; local20 < local16; local20++) {
			local18 = arg0.charAt(local20) + (local18 << 5) - local18;
		}
		return local18;
	}
}
