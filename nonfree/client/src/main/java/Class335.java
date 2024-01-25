import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tfa")
public abstract class Class335 {

	@OriginalMember(owner = "client!tfa", name = "<init>", descriptor = "()V")
	protected Class335() {
	}

	@OriginalMember(owner = "client!tfa", name = "b", descriptor = "(I)I")
	public abstract int method7811();

	@OriginalMember(owner = "client!tfa", name = "a", descriptor = "(Z)Z")
	public final boolean method7812() {
		return this.method7818() || this.method7820() || this.method7814();
	}

	@OriginalMember(owner = "client!tfa", name = "b", descriptor = "(B)Z")
	protected abstract boolean method7814();

	@OriginalMember(owner = "client!tfa", name = "c", descriptor = "(I)V")
	public abstract void method7815();

	@OriginalMember(owner = "client!tfa", name = "c", descriptor = "(B)Lclient!fi;")
	public abstract Class2_Sub12 method7816();

	@OriginalMember(owner = "client!tfa", name = "d", descriptor = "(I)V")
	public abstract void method7817();

	@OriginalMember(owner = "client!tfa", name = "e", descriptor = "(I)Z")
	public abstract boolean method7818();

	@OriginalMember(owner = "client!tfa", name = "f", descriptor = "(I)Z")
	protected abstract boolean method7820();

	@OriginalMember(owner = "client!tfa", name = "g", descriptor = "(I)I")
	public abstract int method7821();
}
