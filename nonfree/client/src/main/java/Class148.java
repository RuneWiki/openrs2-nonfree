import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ls")
public final class Class148 {

	@OriginalMember(owner = "client!ls", name = "a", descriptor = "I")
	public int anInt4118;

	@OriginalMember(owner = "client!ls", name = "b", descriptor = "I")
	public int anInt4119;

	@OriginalMember(owner = "client!ls", name = "h", descriptor = "I")
	public int anInt4124;

	static {
		new Class55("Unable to send message - player not on your friends list.", "Nachricht kann nicht geschickt werden,", "Impossible d'envoyer un message - joueur non inclus dans votre liste d'amis.", "Não foi possível enviar a mensagem. O jogador não está na sua lista de amigos.");
		new Class55("Swap this note at any bank for the equivalent item.", "Dieses Zertifikat kann in einer Bank entsprechend eingetauscht werden.", "Échangez ce reçu contre l'objet correspondant dans la banque de votre choix.", "Vá a qualquer banco para trocar esta nota pelo objeto equivalente.");
	}

	@OriginalMember(owner = "client!ls", name = "a", descriptor = "(ZILclient!gk;)V")
	private void method3263(@OriginalArg(1) int arg0, @OriginalArg(2) Class7_Sub14 arg1) {
		if (arg0 == 1) {
			this.anInt4124 = arg1.method3943();
			this.anInt4118 = arg1.method3981();
			this.anInt4119 = arg1.method3981();
		}
	}

	@OriginalMember(owner = "client!ls", name = "a", descriptor = "(ILclient!gk;)V")
	public void method3265(@OriginalArg(1) Class7_Sub14 arg0) {
		while (true) {
			@Pc(13) int local13 = arg0.method3981();
			if (local13 == 0) {
				return;
			}
			this.method3263(local13, arg0);
		}
	}
}
