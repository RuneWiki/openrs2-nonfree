import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!da")
public class Class2 {

	@OriginalMember(owner = "client!da", name = "a", descriptor = "Lclient!da;")
	public Class2 aClass2_261;

	@OriginalMember(owner = "client!da", name = "d", descriptor = "J")
	public long aLong227;

	@OriginalMember(owner = "client!da", name = "l", descriptor = "Lclient!da;")
	public Class2 aClass2_262;

	static {
		new Class256("You do not have permission to kick this user.", "Du darfst diesen Benutzer nicht rauswerfen.", "Vous n'êtes pas autorisé à expulser cet utilisateur.", "Você não tem permissão para expulsar este usuário.");
	}

	@OriginalMember(owner = "client!da", name = "a", descriptor = "(Z)V")
	public final void method6072() {
		if (this.aClass2_262 != null) {
			this.aClass2_262.aClass2_261 = this.aClass2_261;
			this.aClass2_261.aClass2_262 = this.aClass2_262;
			this.aClass2_262 = null;
			this.aClass2_261 = null;
		}
	}

	@OriginalMember(owner = "client!da", name = "c", descriptor = "(I)Z")
	public final boolean method6074() {
		return this.aClass2_262 != null;
	}
}
