import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qf")
public final class Class11_Sub33 extends Class11 {

	@OriginalMember(owner = "client!qf", name = "m", descriptor = "I")
	public int anInt5153;

	static {
		new Class117("Attempting to join channel...", "Chatraum wird betreten...", "Tentative de connexion au canal...", "Tentando acessar canal...");
		new Class117("Nothing interesting happens.", "Nichts Interessantes passiert.", "Il ne se passe rien d'intéressant.", "Nada de interessante acontece.");
	}

	@OriginalMember(owner = "client!qf", name = "<init>", descriptor = "()V")
	private Class11_Sub33() {
	}

	@OriginalMember(owner = "client!qf", name = "<init>", descriptor = "(I)V")
	public Class11_Sub33(@OriginalArg(0) int arg0) {
		this.anInt5153 = arg0;
	}
}
