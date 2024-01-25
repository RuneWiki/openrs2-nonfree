import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!in")
public final class Class119 {

	@OriginalMember(owner = "client!in", name = "a", descriptor = "Lclient!in;")
	public Class119 aClass119_1;

	@OriginalMember(owner = "client!in", name = "b", descriptor = "I")
	public int anInt3443;

	@OriginalMember(owner = "client!in", name = "c", descriptor = "I")
	public int anInt3444;

	@OriginalMember(owner = "client!in", name = "d", descriptor = "I")
	public int anInt3445;

	@OriginalMember(owner = "client!in", name = "f", descriptor = "I")
	public int anInt3447;

	@OriginalMember(owner = "client!in", name = "h", descriptor = "I")
	public int anInt3449;

	@OriginalMember(owner = "client!in", name = "j", descriptor = "I")
	public int anInt3451;

	@OriginalMember(owner = "client!in", name = "l", descriptor = "I")
	public int anInt3453;

	@OriginalMember(owner = "client!in", name = "n", descriptor = "I")
	public int anInt3455;

	@OriginalMember(owner = "client!in", name = "p", descriptor = "I")
	public int anInt3457;

	@OriginalMember(owner = "client!in", name = "q", descriptor = "I")
	public final int anInt3458;

	@OriginalMember(owner = "client!in", name = "g", descriptor = "I")
	private final int anInt3448;

	@OriginalMember(owner = "client!in", name = "e", descriptor = "I")
	public final int anInt3446;

	@OriginalMember(owner = "client!in", name = "s", descriptor = "B")
	public final byte aByte52;

	@OriginalMember(owner = "client!in", name = "r", descriptor = "I")
	public final int anInt3459;

	static {
		new Class267("Unable to send message - player unavailable.", "Deine Nachricht konnte nicht verschickt werden,", "Impossible d'envoyer un message - joueur indisponible.", "Não foi possível enviar a mensagem. O jogador não está disponível.");
	}

	@OriginalMember(owner = "client!in", name = "<init>", descriptor = "(IIIIB)V")
	public Class119(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) byte arg4) {
		this.anInt3458 = arg2;
		this.anInt3448 = arg0;
		this.anInt3446 = arg1;
		this.aByte52 = arg4;
		this.anInt3459 = arg3;
	}

	@OriginalMember(owner = "client!in", name = "<init>", descriptor = "(Lclient!in;I)V")
	public Class119(@OriginalArg(0) Class119 arg0, @OriginalArg(1) int arg1) {
		this.aClass119_1 = arg0;
		this.anInt3446 = this.aClass119_1.anInt3446 + arg1;
		this.anInt3459 = arg1 + this.aClass119_1.anInt3459;
		this.anInt3448 = this.aClass119_1.anInt3448;
		this.anInt3458 = arg1 + this.aClass119_1.anInt3458;
		this.aByte52 = this.aClass119_1.aByte52;
	}

	@OriginalMember(owner = "client!in", name = "a", descriptor = "(IIIB)Lclient!in;")
	public Class119 method2862(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		return new Class119(this.anInt3448, arg1, arg2, arg0, this.aByte52);
	}

	@OriginalMember(owner = "client!in", name = "b", descriptor = "(B)Lclient!ou;")
	public Class188 method2863() {
		return Static71.method1454(this.anInt3448);
	}
}
