import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!cf")
public final class Class27 implements Interface6 {

	static {
		new Class34("You are temporarily blocked from joining channels - please try again later!", "Du darfst derzeit keine Chaträume betreten - bitte versuch es später.", "Vous êtes temporairement exclu des canaux - veuillez réessayer ultérieurement.", "Você está temporariamente impedido de entrar em canais. Tente de novo depois!");
		new Class34("Unable to send message - player not on your friendlist.", "Nachricht kann nicht geschickt werden,", "Impossible d'envoyer un message - joueur non inclus dans votre liste d'amis.", "Não foi possível enviar a mensagem. O jogador não está na sua lista de amigos.");
	}

	@OriginalMember(owner = "client!cf", name = "a", descriptor = "(I[IBJ)Ljava/lang/String;")
	@Override
	public String method908(@OriginalArg(0) int arg0, @OriginalArg(1) int[] arg1, @OriginalArg(3) long arg2) {
		if (arg0 == 0) {
			@Pc(14) Class1_Sub4_Sub8 local14 = Static5.method190(arg1[0]);
			return local14.method1440((int) arg2);
		} else if (arg0 == 1 || arg0 == 10) {
			@Pc(35) Class111 local35 = Static20.method561((int) arg2);
			return local35.aString30;
		} else if (arg0 == 6 || arg0 == 7 || arg0 == 11) {
			return Static5.method190(arg1[0]).method1440((int) arg2);
		} else {
			return null;
		}
	}
}
