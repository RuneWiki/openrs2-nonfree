import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!af")
public abstract class Class6 {

	static {
		new Class159("You cannot report that person for Staff Impersonation, they are Jagex Staff.", "Diese Person ist ein Jagex-Mitarbeiter!", "Cette personne est un membre du personnel de Jagex, vous ne pouvez pas la signaler pour abus d'identité.", "Você não pode denunciar essa pessoa por tentar se passar por membro da equipe Jagex, pois ela faz parte da equipe.");
	}

	@OriginalMember(owner = "client!af", name = "a", descriptor = "(Z)J")
	public abstract long method4655();

	@OriginalMember(owner = "client!af", name = "b", descriptor = "(II)I")
	public abstract int method4658(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!af", name = "a", descriptor = "(B)V")
	public abstract void method4659();
}
