import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ni")
public abstract class Class50 {

	static {
		new Class267("You are not currently in a channel.", "Du befindest dich derzeit nicht in einem Chatraum.", "Vous n'êtes dans aucun canal à l'heure actuelle.", "No momento você não está em um canal.");
	}

	@OriginalMember(owner = "client!ni", name = "<init>", descriptor = "()V")
	protected Class50() {
	}

	@OriginalMember(owner = "client!ni", name = "a", descriptor = "(I)I")
	public abstract int method1436();

	@OriginalMember(owner = "client!ni", name = "b", descriptor = "(I)Z")
	protected abstract boolean method1437();

	@OriginalMember(owner = "client!ni", name = "d", descriptor = "(I)V")
	public abstract void method1440();

	@OriginalMember(owner = "client!ni", name = "e", descriptor = "(I)Z")
	protected abstract boolean method1441();

	@OriginalMember(owner = "client!ni", name = "b", descriptor = "(B)Z")
	public abstract boolean method1442();

	@OriginalMember(owner = "client!ni", name = "f", descriptor = "(I)Lclient!rm;")
	public abstract Class6_Sub33 method1444();

	@OriginalMember(owner = "client!ni", name = "c", descriptor = "(B)I")
	public abstract int method1446();

	@OriginalMember(owner = "client!ni", name = "d", descriptor = "(B)V")
	public abstract void method1447();

	@OriginalMember(owner = "client!ni", name = "g", descriptor = "(I)Z")
	public final boolean method1448() {
		return this.method1442() || this.method1437() || this.method1441();
	}
}
