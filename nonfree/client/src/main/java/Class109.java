import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hp")
public final class Class109 {

	@OriginalMember(owner = "client!hp", name = "b", descriptor = "I")
	public int anInt2937;

	@OriginalMember(owner = "client!hp", name = "c", descriptor = "[I")
	public final int[] anIntArray259;

	@OriginalMember(owner = "client!hp", name = "a", descriptor = "[I")
	public final int[] anIntArray258;

	static {
		new Class55("Unable to send message - system busy.", "Deine Nachricht konnte nicht verschickt werden, das System ist derzeit ausgelastet.", "Impossible d'envoyer un message - système occupé.", "Não foi possível enviar a mensagem. O sistema está ocupado.");
	}

	@OriginalMember(owner = "client!hp", name = "<init>", descriptor = "(I)V")
	public Class109(@OriginalArg(0) int arg0) {
		this.anInt2937 = arg0;
		this.anIntArray259 = new int[this.anInt2937];
		this.anIntArray258 = new int[this.anInt2937];
	}
}
