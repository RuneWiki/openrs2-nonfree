import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sd")
public final class Class4_Sub37 extends Class4 {

	@OriginalMember(owner = "client!sd", name = "q", descriptor = "S")
	public short aShort86;

	static {
		new Class242("If you are not, please change your password to something more obscure!", "nicht der Fall ist, ändere dein Passwort zu einem ungewöhnlicheren Begriff!", "Si ce n'est pas le cas, remplacez votre mot de passe par une formule moins évidente !", "Caso não esteja, altere sua senha para algo mais obscuro!");
	}

	@OriginalMember(owner = "client!sd", name = "<init>", descriptor = "()V")
	private Class4_Sub37() {
	}

	@OriginalMember(owner = "client!sd", name = "<init>", descriptor = "(S)V")
	public Class4_Sub37(@OriginalArg(0) short arg0) {
		this.aShort86 = arg0;
	}
}
