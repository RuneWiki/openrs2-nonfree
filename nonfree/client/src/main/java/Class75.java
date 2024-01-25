import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gm")
public final class Class75 {

	@OriginalMember(owner = "client!gm", name = "d", descriptor = "I")
	public int anInt2397;

	@OriginalMember(owner = "client!gm", name = "e", descriptor = "I")
	public int anInt2398;

	@OriginalMember(owner = "client!gm", name = "c", descriptor = "Lclient!pj;")
	public final Class155 aClass155_1 = new Class155();

	@OriginalMember(owner = "client!gm", name = "f", descriptor = "Z")
	public boolean aBoolean207 = false;

	static {
		new Class93("You cannot report that person for Staff Impersonation, they are Jagex Staff.", "Diese Person ist ein Jagex-Mitarbeiter!", "Cette personne est un membre du personnel de Jagex, vous ne pouvez pas la signaler pour abus d'identité.", "Você não pode denunciar essa pessoa por tentar se passar por membro da equipe Jagex, pois ela faz parte da equipe.");
	}
}
