import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ed")
public final class Class52_Sub1 extends Class52 {

	@OriginalMember(owner = "client!ed", name = "r", descriptor = "[I")
	public final int[] anIntArray177;

	@OriginalMember(owner = "client!ed", name = "k", descriptor = "[I")
	public final int[] anIntArray176;

	static {
		new Class34("Sending request to leave channel...", "Chatraum wird verlassen...", "Envoi de la demande de sortie du canal...", "Enviando solicitação para deixar o canal...");
	}

	@OriginalMember(owner = "client!ed", name = "<init>", descriptor = "(II[I[I)V")
	public Class52_Sub1(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[] arg2, @OriginalArg(3) int[] arg3) {
		this.anIntArray177 = arg2;
		this.anIntArray176 = arg3;
	}
}
