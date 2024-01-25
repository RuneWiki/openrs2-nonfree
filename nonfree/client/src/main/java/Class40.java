import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wt")
public abstract class Class40 {

	static {
		new Class256("You can't report yourself!", "Du kannst dich nicht selbst melden!", "Vous ne pouvez pas vous signaler vous-même !", "Você não pode denunciar a si próprio!");
		new Class256("You already sent an abuse report under 60 secs ago! Do not abuse this system!", "Du hast bereits vor weniger als 60 Sekunden einen Regelverstoß gemeldet!", "Vous avez déjà signalé un abus il y a moins d'une minute ! N'abusez pas du système !", "Você já enviou uma denúncia de abuso há menos de um minuto. Não abuse deste sistema!");
	}

	@OriginalMember(owner = "client!wt", name = "<init>", descriptor = "()V")
	protected Class40() {
	}

	@OriginalMember(owner = "client!wt", name = "a", descriptor = "(I)Z")
	protected abstract boolean method1154();

	@OriginalMember(owner = "client!wt", name = "a", descriptor = "(B)Z")
	protected abstract boolean method1155();

	@OriginalMember(owner = "client!wt", name = "b", descriptor = "(B)Z")
	public abstract boolean method1156();

	@OriginalMember(owner = "client!wt", name = "c", descriptor = "(B)V")
	public abstract void method1158();

	@OriginalMember(owner = "client!wt", name = "a", descriptor = "(Z)I")
	public abstract int method1159();

	@OriginalMember(owner = "client!wt", name = "b", descriptor = "(I)Lclient!lb;")
	public abstract Class2_Sub6 method1160();

	@OriginalMember(owner = "client!wt", name = "c", descriptor = "(I)V")
	public abstract void method1161();

	@OriginalMember(owner = "client!wt", name = "d", descriptor = "(B)Z")
	public final boolean method1162() {
		return this.method1156() || this.method1154() || this.method1155();
	}

	@OriginalMember(owner = "client!wt", name = "d", descriptor = "(I)I")
	public abstract int method1164();
}
