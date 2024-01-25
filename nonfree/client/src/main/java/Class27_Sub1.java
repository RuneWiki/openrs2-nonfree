import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!bp")
public final class Class27_Sub1 extends Class27 {

	@OriginalMember(owner = "client!bp", name = "r", descriptor = "I")
	private final int anInt514;

	@OriginalMember(owner = "client!bp", name = "u", descriptor = "I")
	private final int anInt516;

	@OriginalMember(owner = "client!bp", name = "s", descriptor = "I")
	private final int anInt515;

	@OriginalMember(owner = "client!bp", name = "v", descriptor = "I")
	private final int anInt517;

	static {
		new Class117("Unable to send message - player not on your friendlist.", "Nachricht kann nicht geschickt werden,", "Impossible d'envoyer un message - joueur non inclus dans votre liste d'amis.", "Não foi possível enviar a mensagem. O jogador não está na sua lista de amigos.");
		new Class117("You already sent an abuse report under 60 secs ago! Do not abuse this system!", "Du hast bereits vor weniger als 60 Sekunden einen Regelverstoß gemeldet!", "Vous avez déjà signalé un abus il y a moins d'une minute ! N'abusez pas du système !", "Você já enviou uma denúncia de abuso há menos de um minuto. Não abuse deste sistema!");
	}

	@OriginalMember(owner = "client!bp", name = "<init>", descriptor = "(IIIIIII)V")
	public Class27_Sub1(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		super(arg4, arg5, arg6);
		this.anInt514 = arg1;
		this.anInt516 = arg2;
		this.anInt515 = arg0;
		this.anInt517 = arg3;
	}

	@OriginalMember(owner = "client!bp", name = "a", descriptor = "(III)V")
	@Override
	public void method5360(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(14) int local14 = arg0 * this.anInt515 >> 12;
		@Pc(21) int local21 = this.anInt516 * arg0 >> 12;
		@Pc(28) int local28 = this.anInt514 * arg1 >> 12;
		@Pc(35) int local35 = arg1 * this.anInt517 >> 12;
		Static143.method2183(local21, local28, super.anInt6262, super.anInt6257, local14, super.anInt6265, local35);
	}

	@OriginalMember(owner = "client!bp", name = "a", descriptor = "(IZI)V")
	@Override
	public void method5361(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(10) int local10 = this.anInt515 * arg1 >> 12;
		@Pc(17) int local17 = this.anInt516 * arg1 >> 12;
		@Pc(24) int local24 = this.anInt514 * arg0 >> 12;
		@Pc(39) int local39 = arg0 * this.anInt517 >> 12;
		Static36.method536(local24, super.anInt6265, local10, super.anInt6257, local39, local17);
	}

	@OriginalMember(owner = "client!bp", name = "b", descriptor = "(III)V")
	@Override
	public void method5366(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(10) int local10 = arg1 * this.anInt515 >> 12;
		@Pc(17) int local17 = arg1 * this.anInt516 >> 12;
		@Pc(24) int local24 = arg0 * this.anInt514 >> 12;
		@Pc(39) int local39 = arg0 * this.anInt517 >> 12;
		Static220.method3945(super.anInt6262, local10, local17, local39, local24);
	}
}
