import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!gr")
public final class Class1_Sub4_Sub11 extends Class1_Sub4 {

	@OriginalMember(owner = "client!gr", name = "C", descriptor = "I")
	public int anInt2436 = 0;

	static {
		new Class106("If you are not, please change your password to something more obscure!", "nicht der Fall ist, ändere dein Passwort zu einem ungewöhnlicheren Begriff!", "Si ce n'est pas le cas, remplacez votre mot de passe par une formule moins évidente !", "Caso não esteja, altere sua senha para algo mais obscuro!");
	}

	@OriginalMember(owner = "client!gr", name = "a", descriptor = "(IILclient!at;)V")
	private void method2321(@OriginalArg(0) int arg0, @OriginalArg(2) Class1_Sub7 arg1) {
		if (arg0 == 2) {
			this.anInt2436 = arg1.method2161();
		}
	}

	@OriginalMember(owner = "client!gr", name = "a", descriptor = "(Lclient!at;I)V")
	public void method2326(@OriginalArg(0) Class1_Sub7 arg0) {
		while (true) {
			@Pc(9) int local9 = arg0.method2132();
			if (local9 == 0) {
				return;
			}
			this.method2321(local9, arg0);
		}
	}
}
