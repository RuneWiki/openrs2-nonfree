import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ma")
public final class Class161 {

	@OriginalMember(owner = "client!ma", name = "a", descriptor = "I")
	public int anInt4060;

	@OriginalMember(owner = "client!ma", name = "c", descriptor = "I")
	public int anInt4061;

	@OriginalMember(owner = "client!ma", name = "e", descriptor = "I")
	public int anInt4063;

	@OriginalMember(owner = "client!ma", name = "h", descriptor = "Lclient!ql;")
	public Class132 aClass132_2;

	@OriginalMember(owner = "client!ma", name = "j", descriptor = "Lclient!ma;")
	public Class161 aClass161_1;

	@OriginalMember(owner = "client!ma", name = "g", descriptor = "I")
	public final int anInt4065;

	@OriginalMember(owner = "client!ma", name = "l", descriptor = "I")
	public final int anInt4068;

	static {
		new Class231("This player is on a quick chat world and cannot receive your message.", "Der Spieler kann auf einer Direktchat-Welt keine Nachrichten empfangen.", "Ce joueur est sur un serveur à messagerie rapide et ne peut pas recevoir votre message.", "Este jogador não pode receber sua mensagem porque está em um mundo de papo rápido.");
		new Class231("Invalid channel name entered!", "Ungültiger Chatraum-Name angegeben.", "Nom de canal incorrect !", "Nome de canal inválido!");
	}

	@OriginalMember(owner = "client!ma", name = "<init>", descriptor = "(II)V")
	public Class161(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.anInt4065 = arg0;
		this.anInt4068 = arg1;
	}

	@OriginalMember(owner = "client!ma", name = "<init>", descriptor = "(Lclient!ma;I)V")
	public Class161(@OriginalArg(0) Class161 arg0, @OriginalArg(1) int arg1) {
		this.aClass161_1 = arg0;
		this.anInt4068 = arg1 + this.aClass161_1.anInt4068;
		this.anInt4065 = this.aClass161_1.anInt4065;
		this.aClass132_2 = this.aClass161_1.aClass132_2;
	}

	@OriginalMember(owner = "client!ma", name = "a", descriptor = "(B)Lclient!mj;")
	public Class168 method3710() {
		return Static441.method5929(this.anInt4065);
	}

	@OriginalMember(owner = "client!ma", name = "a", descriptor = "(ZI)Lclient!ma;")
	public Class161 method3712(@OriginalArg(1) int arg0) {
		return new Class161(this.anInt4065, arg0);
	}
}
