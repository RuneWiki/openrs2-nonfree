import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vt")
public final class Class1_Sub43 extends Class1 {

	@OriginalMember(owner = "client!vt", name = "s", descriptor = "I")
	public final int anInt7463;

	@OriginalMember(owner = "client!vt", name = "q", descriptor = "I")
	public final int anInt7461;

	static {
		new Class84("Invalid teleport!", "Unzulässiger Teleport!", "Téléportation non valide !", "Teleporte inválido!");
		new Class84("Unable to send message - player not on your friendlist.", "Nachricht kann nicht geschickt werden,", "Impossible d'envoyer un message - joueur non inclus dans votre liste d'amis.", "Não foi possível enviar a mensagem. O jogador não está na sua lista de amigos.");
	}

	@OriginalMember(owner = "client!vt", name = "<init>", descriptor = "(II)V")
	public Class1_Sub43(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.anInt7463 = arg1;
		this.anInt7461 = arg0;
	}

	@OriginalMember(owner = "client!vt", name = "d", descriptor = "(I)I")
	public int method5784() {
		return Static194.method2946(this.anInt7461);
	}

	@OriginalMember(owner = "client!vt", name = "e", descriptor = "(I)Z")
	public boolean method5785() {
		return (this.anInt7461 >> 21 & 0x1) != 0;
	}

	@OriginalMember(owner = "client!vt", name = "f", descriptor = "(I)Z")
	public boolean method5786() {
		return (this.anInt7461 >> 22 & 0x1) != 0;
	}

	@OriginalMember(owner = "client!vt", name = "c", descriptor = "(B)Z")
	public boolean method5787() {
		return (this.anInt7461 & 0x1) != 0;
	}

	@OriginalMember(owner = "client!vt", name = "b", descriptor = "(II)Z")
	public boolean method5788(@OriginalArg(1) int arg0) {
		return (this.anInt7461 >> arg0 + 1 & 0x1) != 0;
	}

	@OriginalMember(owner = "client!vt", name = "a", descriptor = "(Z)I")
	public int method5789() {
		return this.anInt7461 >> 18 & 0x7;
	}
}
