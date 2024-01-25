import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!no")
public final class Class2_Sub27 extends Class2 {

	@OriginalMember(owner = "client!no", name = "q", descriptor = "I")
	public final int anInt4387;

	@OriginalMember(owner = "client!no", name = "o", descriptor = "I")
	public final int anInt4386;

	static {
		new Class221("If you are not, please change your password to something more obscure!", "nicht der Fall ist, ändere dein Passwort zu einem ungewöhnlicheren Begriff!", "Si ce n'est pas le cas, remplacez votre mot de passe par une formule moins évidente !", "Caso não esteja, altere sua senha para algo mais obscuro!");
	}

	@OriginalMember(owner = "client!no", name = "<init>", descriptor = "(II)V")
	public Class2_Sub27(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.anInt4387 = arg0;
		this.anInt4386 = arg1;
	}
}
