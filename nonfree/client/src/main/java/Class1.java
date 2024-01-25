import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pe")
public class Class1 {

	@OriginalMember(owner = "client!pe", name = "a", descriptor = "Lclient!pe;")
	public Class1 aClass1_261;

	@OriginalMember(owner = "client!pe", name = "b", descriptor = "Lclient!pe;")
	public Class1 aClass1_262;

	@OriginalMember(owner = "client!pe", name = "e", descriptor = "J")
	public long aLong230;

	static {
		new Class119("You cannot report that person for Staff Impersonation, they are Jagex Staff.", "Diese Person ist ein Jagex-Mitarbeiter!", "Cette personne est un membre du personnel de Jagex, vous ne pouvez pas la signaler pour abus d'identité.", "Você não pode denunciar essa pessoa por tentar se passar por membro da equipe Jagex, pois ela faz parte da equipe.");
	}

	@OriginalMember(owner = "client!pe", name = "a", descriptor = "(I)Z")
	public final boolean method5914() {
		return this.aClass1_262 != null;
	}

	@OriginalMember(owner = "client!pe", name = "a", descriptor = "(Z)V")
	public final void method5915() {
		if (this.aClass1_262 != null) {
			this.aClass1_262.aClass1_261 = this.aClass1_261;
			this.aClass1_261.aClass1_262 = this.aClass1_262;
			this.aClass1_261 = null;
			this.aClass1_262 = null;
		}
	}
}
