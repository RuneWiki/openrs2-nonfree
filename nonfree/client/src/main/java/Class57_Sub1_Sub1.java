import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!lq")
public final class Class57_Sub1_Sub1 extends Class57_Sub1 {

	@OriginalMember(owner = "client!lq", name = "L", descriptor = "[B")
	private byte[] aByteArray55;

	static {
		new Class189("Error sending message to clan chat - please try again later!", "Fehler beim Versenden der Nachricht - bitte versuch es später erneut.", "Erreur lors de l'envoi du message au canal de clan - veuillez réessayer ultérieurement.", "Erro ao enviar mensagem ao canal de clã. Tente de novo depois!");
		new Class189(null, "Mitglieder können 200 Freunde hinzufügen, freie Spieler nur 100.", null, null);
	}

	@OriginalMember(owner = "client!lq", name = "<init>", descriptor = "()V")
	public Class57_Sub1_Sub1() {
		super(8, 5, 8, 8, 2, 0.1F, 0.55F, 3.0F);
	}

	@OriginalMember(owner = "client!lq", name = "b", descriptor = "(IIII)[B")
	public byte[] method3582() {
		this.aByteArray55 = new byte[524288];
		this.method4477();
		return this.aByteArray55;
	}

	@OriginalMember(owner = "client!lq", name = "a", descriptor = "(BBI)V")
	@Override
	protected void method3579(@OriginalArg(1) byte arg0, @OriginalArg(2) int arg1) {
		@Pc(13) int local13 = arg1 * 2;
		@Pc(17) int local17 = arg0 & 0xFF;
		@Pc(20) int local20 = local13;
		@Pc(21) int local21 = local13 + 1;
		this.aByteArray55[local20] = (byte) (local17 * 3 >> 5);
		this.aByteArray55[local21] = (byte) (local17 * 3 >> 5);
	}
}
