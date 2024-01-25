import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qb")
public final class Class247 {

	@OriginalMember(owner = "client!qb", name = "d", descriptor = "I")
	public int anInt7426;

	@OriginalMember(owner = "client!qb", name = "j", descriptor = "Ljava/lang/String;")
	public String aString85;

	@OriginalMember(owner = "client!qb", name = "f", descriptor = "I")
	public int anInt7427 = 43594;

	@OriginalMember(owner = "client!qb", name = "b", descriptor = "Z")
	public boolean aBoolean535 = false;

	@OriginalMember(owner = "client!qb", name = "i", descriptor = "I")
	public int anInt7429 = 443;

	static {
		new Class88("Unable to join clan chat at this time - please try again later!", "Chatraum kann nicht betreten werden - bitte versuch es später erneut.", "Impossible de participer à une discussion de clan pour le moment - veuillez réessayer ultérieurement.", "Não foi possível entrar no bate-papo do clã dessa vez. Tente de novo depois!");
	}

	@OriginalMember(owner = "client!qb", name = "a", descriptor = "(I)I")
	public int method6190() {
		return this.aBoolean535 ? this.anInt7429 : this.anInt7427;
	}

	@OriginalMember(owner = "client!qb", name = "a", descriptor = "(Lclient!qb;B)Z")
	public boolean method6193(@OriginalArg(0) Class247 arg0) {
		if (arg0 == null) {
			return false;
		} else {
			return this.anInt7426 == arg0.anInt7426 && this.aString85.equals(arg0.aString85);
		}
	}
}
