import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!mk")
public final class Class116_Sub2 extends Class116 {

	@OriginalMember(owner = "client!mk", name = "j", descriptor = "I")
	private final int anInt5504;

	@OriginalMember(owner = "client!mk", name = "l", descriptor = "I")
	private final int anInt5506;

	@OriginalMember(owner = "client!mk", name = "x", descriptor = "I")
	private final int anInt5516;

	@OriginalMember(owner = "client!mk", name = "t", descriptor = "I")
	private final int anInt5512;

	@OriginalMember(owner = "client!mk", name = "u", descriptor = "I")
	private final int anInt5513;

	@OriginalMember(owner = "client!mk", name = "i", descriptor = "I")
	private final int anInt5503;

	@OriginalMember(owner = "client!mk", name = "n", descriptor = "I")
	private final int anInt5508;

	@OriginalMember(owner = "client!mk", name = "o", descriptor = "I")
	private final int anInt5509;

	static {
		new Class202("Player ", "Spieler ", "Joueur ", "Jogador ");
		new Class202("You do not have a high enough rank to join this clan channel.", "Dein Rang reicht nicht aus, um diesen Chatraum zu betreten.", "Votre rang n'est pas assez élevé pour rejoindre ce canal de clan.", "Sua posição não é alta o suficiente para você entrar nesse canal de clã.");
		new Class202("To talk, start each line of chat with the / symbol.", "Leite eine Zeile mit / ein, um hier zu chatten.", "Pour parler, insérez le symbole / au début de chaque ligne.", "Para falar, comece cada linha de conversa com o símbolo /.");
		new Class202("Unable to send message - system busy.", "Deine Nachricht konnte nicht verschickt werden, das System ist derzeit ausgelastet.", "Impossible d'envoyer un message - système occupé.", "Não foi possível enviar a mensagem. O sistema está ocupado.");
	}

	@OriginalMember(owner = "client!mk", name = "<init>", descriptor = "(IIIIIIIIII)V")
	public Class116_Sub2(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9) {
		super(-1, arg8, arg9);
		this.anInt5504 = arg2;
		this.anInt5506 = arg3;
		this.anInt5516 = arg6;
		this.anInt5512 = arg5;
		this.anInt5513 = arg1;
		this.anInt5503 = arg7;
		this.anInt5508 = arg4;
		this.anInt5509 = arg0;
	}

	@OriginalMember(owner = "client!mk", name = "a", descriptor = "(ZII)V")
	@Override
	public void method6462(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(10) int local10 = this.anInt5509 * arg0 >> 12;
		@Pc(17) int local17 = arg1 * this.anInt5513 >> 12;
		@Pc(24) int local24 = arg0 * this.anInt5504 >> 12;
		@Pc(37) int local37 = arg1 * this.anInt5506 >> 12;
		@Pc(44) int local44 = arg0 * this.anInt5508 >> 12;
		@Pc(51) int local51 = this.anInt5512 * arg1 >> 12;
		@Pc(58) int local58 = arg0 * this.anInt5516 >> 12;
		@Pc(65) int local65 = this.anInt5503 * arg1 >> 12;
		Static323.method5137(local44, local37, local10, local65, super.anInt7706, local24, local58, local17, local51);
	}

	@OriginalMember(owner = "client!mk", name = "b", descriptor = "(IBI)V")
	@Override
	public void method6467(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
	}

	@OriginalMember(owner = "client!mk", name = "a", descriptor = "(IBI)V")
	@Override
	public void method6465(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
	}
}
