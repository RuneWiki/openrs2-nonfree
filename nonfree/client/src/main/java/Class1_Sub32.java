import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!oo")
public final class Class1_Sub32 extends Class1 {

	@OriginalMember(owner = "client!oo", name = "n", descriptor = "S")
	public short aShort78;

	static {
		new Class158("If you are not, please change your password to something more obscure!", "nicht der Fall ist, ändere dein Passwort zu einem ungewöhnlicheren Begriff!", "Si ce n'est pas le cas, remplacez votre mot de passe par une formule moins évidente !", "Caso não esteja, altere sua senha para algo mais obscuro!");
	}

	@OriginalMember(owner = "client!oo", name = "<init>", descriptor = "()V")
	private Class1_Sub32() {
	}

	@OriginalMember(owner = "client!oo", name = "<init>", descriptor = "(S)V")
	public Class1_Sub32(@OriginalArg(0) short arg0) {
		this.aShort78 = arg0;
	}
}
