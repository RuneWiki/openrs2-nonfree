import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!og")
public abstract class Class11_Sub4 extends Class11 {

	@OriginalMember(owner = "client!og", name = "f", descriptor = "I")
	public int anInt1658;

	@OriginalMember(owner = "client!og", name = "g", descriptor = "I")
	public int anInt1659;

	@OriginalMember(owner = "client!og", name = "i", descriptor = "Z")
	public boolean aBoolean121;

	@OriginalMember(owner = "client!og", name = "m", descriptor = "I")
	public int anInt1663;

	static {
		new Class21("If you are not, please change your password to something more obscure!", "nicht der Fall ist, ändere dein Passwort zu einem ungewöhnlicheren Begriff!", "Si ce n'est pas le cas, remplacez votre mot de passe par une formule moins évidente !", "Caso não esteja, altere sua senha para algo mais obscuro!");
	}

	@OriginalMember(owner = "client!og", name = "d", descriptor = "(I)Z")
	@Override
	public final boolean method6301() {
		return false;
	}

	@OriginalMember(owner = "client!og", name = "a", descriptor = "(IIILclient!qa;ZLclient!ee;Z)V")
	@Override
	public final void method6306(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) Class30 arg3, @OriginalArg(5) Class11 arg4, @OriginalArg(6) boolean arg5) {
		throw new IllegalStateException();
	}

	@OriginalMember(owner = "client!og", name = "a", descriptor = "(Z)V")
	@Override
	public final void method6307() {
		throw new IllegalStateException();
	}
}
