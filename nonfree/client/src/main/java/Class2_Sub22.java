import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jm")
public final class Class2_Sub22 extends Class2 {

	@OriginalMember(owner = "client!jm", name = "s", descriptor = "I")
	public final int anInt3768;

	@OriginalMember(owner = "client!jm", name = "r", descriptor = "I")
	public final int anInt3767;

	static {
		new Class256("Sending request to leave channel...", "Chatraum wird verlassen...", "Envoi de la demande de sortie du canal...", "Enviando solicitação para deixar o canal...");
	}

	@OriginalMember(owner = "client!jm", name = "<init>", descriptor = "(II)V")
	public Class2_Sub22(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.anInt3768 = arg0;
		this.anInt3767 = arg1;
	}
}
