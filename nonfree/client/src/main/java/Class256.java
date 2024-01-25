import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rh")
public final class Class256 {

	@OriginalMember(owner = "client!rh", name = "b", descriptor = "I")
	public final int anInt7305;

	static {
		new Class306("You cannot report that person for Staff Impersonation, they are Jagex Staff.", "Diese Person ist ein Jagex-Mitarbeiter!", "Cette personne est un membre du personnel de Jagex, vous ne pouvez pas la signaler pour abus d'identité.", "Você não pode denunciar essa pessoa por tentar se passar por membro da equipe Jagex, pois ela faz parte da equipe.");
	}

	@OriginalMember(owner = "client!rh", name = "<init>", descriptor = "(I)V")
	public Class256(@OriginalArg(0) int arg0) {
		this.anInt7305 = arg0;
	}

	@OriginalMember(owner = "client!rh", name = "toString", descriptor = "()Ljava/lang/String;")
	@Override
	public String toString() {
		throw new IllegalStateException();
	}
}
