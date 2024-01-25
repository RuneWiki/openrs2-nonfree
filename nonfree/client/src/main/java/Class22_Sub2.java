import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ij")
public final class Class22_Sub2 extends Class22 {

	@OriginalMember(owner = "client!ij", name = "i", descriptor = "[I")
	public final int[] anIntArray213;

	@OriginalMember(owner = "client!ij", name = "k", descriptor = "[I")
	public final int[] anIntArray214;

	static {
		new Class267("You are temporarily blocked from joining channels - please try again later!", "Du darfst derzeit keine Chaträume betreten - bitte versuch es später.", "Vous êtes temporairement exclu des canaux - veuillez réessayer ultérieurement.", "Você está temporariamente impedido de entrar em canais. Tente de novo depois!");
		new Class267("This mute will remain for a further ", "Diese Stummschaltung gilt für weitere ", "Votre accès restera bloqué encore ", "Este veto permanecerá por mais ");
	}

	@OriginalMember(owner = "client!ij", name = "<init>", descriptor = "(II[I[I)V")
	public Class22_Sub2(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[] arg2, @OriginalArg(3) int[] arg3) {
		this.anIntArray213 = arg2;
		this.anIntArray214 = arg3;
	}
}
