import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!oc")
public final class Class5_Sub28 extends Class5 {

	@OriginalMember(owner = "client!oc", name = "q", descriptor = "J")
	public long aLong159;

	static {
		new Class85("If you are not, please change your password to something more obscure!", "nicht der Fall ist, ändere dein Passwort zu einem ungewöhnlicheren Begriff!", "Si ce n'est pas le cas, remplacez votre mot de passe par une formule moins évidente !", "Caso não esteja, altere sua senha para algo mais obscuro!");
	}

	@OriginalMember(owner = "client!oc", name = "<init>", descriptor = "()V")
	private Class5_Sub28() {
	}

	@OriginalMember(owner = "client!oc", name = "<init>", descriptor = "(J)V")
	public Class5_Sub28(@OriginalArg(0) long arg0) {
		this.aLong159 = arg0;
	}
}
