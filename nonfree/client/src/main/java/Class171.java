import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ok")
public final class Class171 {

	@OriginalMember(owner = "client!ok", name = "g", descriptor = "S")
	public static short aShort73 = 256;

	@OriginalMember(owner = "client!ok", name = "i", descriptor = "Lclient!hu;")
	public static final Class98 aClass98_39;

	@OriginalMember(owner = "client!ok", name = "j", descriptor = "I")
	public static int anInt4692;

	@OriginalMember(owner = "client!ok", name = "h", descriptor = "I")
	public int anInt4691 = 0;

	static {
		new Class79("If you are not, please change your password to something more obscure!", "nicht der Fall ist, ändere dein Passwort zu einem ungewöhnlicheren Begriff!", "Si ce n'est pas le cas, remplacez votre mot de passe par une formule moins évidente !", "Caso não esteja, altere sua senha para algo mais obscuro!");
		aClass98_39 = new Class98(8);
		anInt4692 = 765;
	}

	@OriginalMember(owner = "client!ok", name = "a", descriptor = "(ILclient!bt;)V", line = 8)
	public void method4371(@OriginalArg(1) Class2_Sub4 arg0) {
		while (true) {
			@Pc(12) int local12 = arg0.method4816();
			if (local12 == 0) {
				return;
			}
			this.method4375(local12, arg0);
		}
	}

	@OriginalMember(owner = "client!ok", name = "a", descriptor = "(IILclient!bt;)V", line = 75)
	private void method4375(@OriginalArg(1) int arg0, @OriginalArg(2) Class2_Sub4 arg1) {
		if (arg0 == 5) {
			this.anInt4691 = arg1.method4830();
		}
	}
}
