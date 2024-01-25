import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ps")
public abstract class Class182 {

	static {
		new Class169("If you are not, please change your password to something more obscure!", "nicht der Fall ist, ändere dein Passwort zu einem ungewöhnlicheren Begriff!", "Si ce n'est pas le cas, remplacez votre mot de passe par une formule moins évidente !", "Caso não esteja, altere sua senha para algo mais obscuro!");
	}

	@OriginalMember(owner = "client!ps", name = "<init>", descriptor = "()V")
	protected Class182() {
	}

	@OriginalMember(owner = "client!ps", name = "a", descriptor = "(I)Z")
	public abstract boolean method4109();

	@OriginalMember(owner = "client!ps", name = "b", descriptor = "(I)V")
	public abstract void method4111();

	@OriginalMember(owner = "client!ps", name = "c", descriptor = "(I)I")
	public abstract int method4112();

	@OriginalMember(owner = "client!ps", name = "d", descriptor = "(I)Lclient!fl;")
	public abstract Class1_Sub13 method4113();

	@OriginalMember(owner = "client!ps", name = "a", descriptor = "(B)Z")
	public final boolean method4114() {
		return this.method4109() || this.method4119() || this.method4115();
	}

	@OriginalMember(owner = "client!ps", name = "e", descriptor = "(I)Z")
	protected abstract boolean method4115();

	@OriginalMember(owner = "client!ps", name = "e", descriptor = "(B)Z")
	protected abstract boolean method4119();

	@OriginalMember(owner = "client!ps", name = "f", descriptor = "(I)V")
	public abstract void method4120();

	@OriginalMember(owner = "client!ps", name = "f", descriptor = "(B)I")
	public abstract int method4121();
}
