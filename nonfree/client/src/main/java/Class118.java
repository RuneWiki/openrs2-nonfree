import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kr")
public abstract class Class118 {

	static {
		new Class85("I can't reach that!", "Da kommst du nicht hin.", "Je ne peux pas l'atteindre !", "Não consigo alcançar!");
		new Class85("You are not currently in a channel.", "Du befindest dich derzeit nicht in einem Chatraum.", "Vous n'êtes dans aucun canal à l'heure actuelle.", "No momento você não está em um canal.");
	}

	@OriginalMember(owner = "client!kr", name = "<init>", descriptor = "()V")
	protected Class118() {
	}

	@OriginalMember(owner = "client!kr", name = "a", descriptor = "(I)Z")
	protected abstract boolean method4048();

	@OriginalMember(owner = "client!kr", name = "a", descriptor = "(Z)V")
	public abstract void method4049();

	@OriginalMember(owner = "client!kr", name = "a", descriptor = "(B)I")
	public abstract int method4050();

	@OriginalMember(owner = "client!kr", name = "b", descriptor = "(I)Z")
	public abstract boolean method4051();

	@OriginalMember(owner = "client!kr", name = "b", descriptor = "(B)Z")
	public final boolean method4052() {
		return this.method4051() || this.method4059() || this.method4048();
	}

	@OriginalMember(owner = "client!kr", name = "b", descriptor = "(Z)I")
	public abstract int method4054();

	@OriginalMember(owner = "client!kr", name = "d", descriptor = "(I)Lclient!mp;")
	public abstract Class5_Sub26 method4057();

	@OriginalMember(owner = "client!kr", name = "e", descriptor = "(I)V")
	public abstract void method4058();

	@OriginalMember(owner = "client!kr", name = "d", descriptor = "(B)Z")
	protected abstract boolean method4059();
}
