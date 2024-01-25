import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static323 {

	@OriginalMember(owner = "client!uj", name = "q", descriptor = "I")
	public static int anInt6231;

	@OriginalMember(owner = "client!uj", name = "p", descriptor = "Lclient!hc;")
	public static final Class85 aClass85_136 = new Class85("scroll:", "", "", "");

	@OriginalMember(owner = "client!uj", name = "s", descriptor = "Lclient!hc;")
	public static final Class85 aClass85_137 = new Class85("Connecting to update server", "Verbindung mit Update-Server...", "Connexion au serveur de mise à jour en cours", "Conectando ao servidor de atualização");

	@OriginalMember(owner = "client!uj", name = "u", descriptor = "Z")
	public static boolean aBoolean522 = true;

	@OriginalMember(owner = "client!uj", name = "a", descriptor = "(BLjava/lang/String;IZ)Z")
	public static boolean method5589(@OriginalArg(1) String arg0) {
		@Pc(31) boolean local31 = false;
		@Pc(33) boolean local33 = false;
		@Pc(35) int local35 = 0;
		@Pc(38) int local38 = arg0.length();
		for (@Pc(40) int local40 = 0; local40 < local38; local40++) {
			@Pc(45) char local45 = arg0.charAt(local40);
			if (local40 == 0) {
				if (local45 == '-') {
					local31 = true;
					continue;
				}
				if (local45 == '+') {
					continue;
				}
			}
			@Pc(71) int local71;
			if (local45 >= '0' && local45 <= '9') {
				local71 = local45 - '0';
			} else if (local45 >= 'A' && local45 <= 'Z') {
				local71 = local45 - '7';
			} else if (local45 >= 'a' && local45 <= 'z') {
				local71 = local45 - 'W';
			} else {
				return false;
			}
			if (local71 >= 10) {
				return false;
			}
			if (local31) {
				local71 = -local71;
			}
			@Pc(110) int local110 = local35 * 10 + local71;
			if (local110 / 10 != local35) {
				return false;
			}
			local35 = local110;
			local33 = true;
		}
		return local33;
	}
}
