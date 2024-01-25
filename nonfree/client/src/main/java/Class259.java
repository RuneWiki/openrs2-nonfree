import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vb")
public final class Class259 {

	@OriginalMember(owner = "client!vb", name = "b", descriptor = "Lclient!vb;")
	public Class259 aClass259_4;

	@OriginalMember(owner = "client!vb", name = "h", descriptor = "Lclient!eq;")
	public Class11_Sub1 aClass11_Sub1_2;

	@OriginalMember(owner = "client!vb", name = "j", descriptor = "I")
	public int anInt6824;

	static {
		new Class142("Sending request to leave channel...", "Chatraum wird verlassen...", "Envoi de la demande de sortie du canal...", "Enviando solicitação para deixar o canal...");
	}

	@OriginalMember(owner = "client!vb", name = "a", descriptor = "(I)V")
	public void method5413() {
		if (Static355.anInt5738 >= 500) {
			return;
		}
		this.aClass259_4 = Static358.aClass259_3;
		this.aClass11_Sub1_2 = null;
		this.anInt6824 = 0;
		Static355.anInt5738++;
		Static358.aClass259_3 = this;
	}
}
