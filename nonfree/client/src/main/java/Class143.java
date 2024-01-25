import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kt")
public final class Class143 {

	@OriginalMember(owner = "client!kt", name = "c", descriptor = "Lclient!ih;")
	private final Class117_Sub1 aClass117_Sub1_23;

	@OriginalMember(owner = "client!kt", name = "b", descriptor = "J")
	public final long aLong130;

	static {
		new Class142("If you are not, please change your password to something more obscure!", "nicht der Fall ist, ändere dein Passwort zu einem ungewöhnlicheren Begriff!", "Si ce n'est pas le cas, remplacez votre mot de passe par une formule moins évidente !", "Caso não esteja, altere sua senha para algo mais obscuro!");
	}

	@OriginalMember(owner = "client!kt", name = "<init>", descriptor = "(Lclient!ih;JI)V")
	public Class143(@OriginalArg(0) Class117_Sub1 arg0, @OriginalArg(1) long arg1, @OriginalArg(2) int arg2) {
		this.aClass117_Sub1_23 = arg0;
		this.aLong130 = arg1;
	}

	@OriginalMember(owner = "client!kt", name = "finalize", descriptor = "()V")
	@Override
	public void finalize() throws Throwable {
		this.aClass117_Sub1_23.method2482(this.aLong130);
		super.finalize();
	}
}
