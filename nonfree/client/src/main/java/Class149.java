import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wp")
public abstract class Class149 {

	static {
		new Class221("You cannot report that person for Staff Impersonation, they are Jagex Staff.", "Diese Person ist ein Jagex-Mitarbeiter!", "Cette personne est un membre du personnel de Jagex, vous ne pouvez pas la signaler pour abus d'identité.", "Você não pode denunciar essa pessoa por tentar se passar por membro da equipe Jagex, pois ela faz parte da equipe.");
	}

	@OriginalMember(owner = "client!wp", name = "<init>", descriptor = "()V")
	protected Class149() {
	}

	@OriginalMember(owner = "client!wp", name = "a", descriptor = "(Z)V")
	public abstract void method3682();

	@OriginalMember(owner = "client!wp", name = "a", descriptor = "(I)Lclient!au;")
	public abstract Class15 method3683();

	@OriginalMember(owner = "client!wp", name = "b", descriptor = "(I)V")
	public abstract void method3684();

	@OriginalMember(owner = "client!wp", name = "a", descriptor = "(II)Z")
	public abstract boolean method3685(@OriginalArg(0) int arg0);
}
