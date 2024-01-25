import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tq")
public final class Class285 {

	@OriginalMember(owner = "client!tq", name = "b", descriptor = "I")
	public int anInt8254;

	@OriginalMember(owner = "client!tq", name = "d", descriptor = "I")
	public int anInt8256;

	@OriginalMember(owner = "client!tq", name = "g", descriptor = "I")
	public int anInt8259;

	@OriginalMember(owner = "client!tq", name = "h", descriptor = "I")
	public int anInt8260;

	@OriginalMember(owner = "client!tq", name = "n", descriptor = "I")
	public int anInt8265;

	@OriginalMember(owner = "client!tq", name = "q", descriptor = "I")
	public int anInt8266;

	@OriginalMember(owner = "client!tq", name = "r", descriptor = "I")
	public int anInt8267;

	@OriginalMember(owner = "client!tq", name = "f", descriptor = "I")
	public int anInt8258 = 128;

	@OriginalMember(owner = "client!tq", name = "k", descriptor = "I")
	public int anInt8262 = 128;

	@OriginalMember(owner = "client!tq", name = "c", descriptor = "I")
	public int anInt8255;

	static {
		new Class40("Error joining clan channel - please try again later!", "Fehler beim Betreten des Chatraums - bitte versuch es später erneut.", "Erreur lors de la connexion au canal de clan - veuillez réessayer ultérieurement.", "Erro ao entrar no canal do clã. Tente de novo depois!");
	}

	@OriginalMember(owner = "client!tq", name = "<init>", descriptor = "(I)V")
	public Class285(@OriginalArg(0) int arg0) {
		this.anInt8255 = arg0;
	}

	@OriginalMember(owner = "client!tq", name = "<init>", descriptor = "(IIIIII)V")
	private Class285(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		this.anInt8260 = arg4;
		this.anInt8259 = arg5;
		this.anInt8265 = arg3;
		this.anInt8258 = arg1;
		this.anInt8255 = arg0;
		this.anInt8262 = arg2;
	}

	@OriginalMember(owner = "client!tq", name = "a", descriptor = "(B)Lclient!tq;")
	public Class285 method6663() {
		return new Class285(this.anInt8255, this.anInt8258, this.anInt8262, this.anInt8265, this.anInt8260, this.anInt8259);
	}

	@OriginalMember(owner = "client!tq", name = "a", descriptor = "(ILclient!tq;)V")
	public void method6664(@OriginalArg(1) Class285 arg0) {
		this.anInt8259 = arg0.anInt8259;
		this.anInt8265 = arg0.anInt8265;
		this.anInt8262 = arg0.anInt8262;
		this.anInt8255 = arg0.anInt8255;
		this.anInt8258 = arg0.anInt8258;
		this.anInt8260 = arg0.anInt8260;
	}
}
