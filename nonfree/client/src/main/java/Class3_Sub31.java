import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lq")
public final class Class3_Sub31 extends Class3 {

	@OriginalMember(owner = "client!lq", name = "j", descriptor = "I")
	public int anInt5804;

	@OriginalMember(owner = "client!lq", name = "l", descriptor = "I")
	public int anInt5805;

	@OriginalMember(owner = "client!lq", name = "m", descriptor = "I")
	public int anInt5806;

	@OriginalMember(owner = "client!lq", name = "n", descriptor = "I")
	public int anInt5807;

	@OriginalMember(owner = "client!lq", name = "o", descriptor = "I")
	public int anInt5808;

	@OriginalMember(owner = "client!lq", name = "k", descriptor = "Z")
	public boolean aBoolean374 = false;

	@OriginalMember(owner = "client!lq", name = "p", descriptor = "I")
	public int anInt5809 = -1;

	static {
		new Class67("Sending request to leave channel...", "Chatraum wird verlassen...", "Envoi de la demande de sortie du canal...", "Enviando solicitação para deixar o canal...");
	}

	@OriginalMember(owner = "client!lq", name = "<init>", descriptor = "(I)V")
	public Class3_Sub31(@OriginalArg(0) int arg0) {
		this.anInt5809 = arg0;
	}
}
