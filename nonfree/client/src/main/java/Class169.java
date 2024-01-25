import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ni")
public final class Class169 {

	@OriginalMember(owner = "client!ni", name = "a", descriptor = "[I")
	public static final int[] anIntArray374;

	static {
		new Class134("Attempting to join channel...", "Chatraum wird betreten...", "Tentative de connexion au canal...", "Tentando acessar canal...");
		new Class134("You do not have permission to kick this user.", "Du darfst diesen Benutzer nicht rauswerfen.", "Vous n'êtes pas autorisé à expulser cet utilisateur.", "Você não tem permissão para expulsar este usuário.");
		anIntArray374 = new int[256];
		for (@Pc(16) int local16 = 0; local16 < 256; local16++) {
			@Pc(19) int local19 = local16;
			for (@Pc(21) int local21 = 0; local21 < 8; local21++) {
				if ((local19 & 0x1) == 1) {
					local19 = local19 >>> 1 ^ 0xEDB88320;
				} else {
					local19 >>>= 0x1;
				}
			}
			anIntArray374[local16] = local19;
		}
		new Class134("You have been temporarily muted due to breaking a rule.", "Aufgrund eines Regelverstoßes wurdest du vorübergehend stumm geschaltet.", "La messagerie instantanée a été temporairement bloquée suite à une infraction.", "Você foi temporariamente vetado por ter violado uma regra.");
	}
}
