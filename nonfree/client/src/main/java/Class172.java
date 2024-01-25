import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rg")
public final class Class172 {

	@OriginalMember(owner = "client!rg", name = "e", descriptor = "Ljava/lang/String;")
	public final String aString55;

	@OriginalMember(owner = "client!rg", name = "i", descriptor = "I")
	public final int anInt5669;

	static {
		new Class140("You are not allowed to talk in this clan channel.", "Du darfst in diesem Chatraum nicht reden.", "Vous n'êtes pas autorisé à parler dans ce canal de clan.", "Você não tem permissão para conversar neste canal de clã.");
		new Class140("You do not have a high enough rank to join this clan channel.", "Dein Rang reicht nicht aus, um diesen Chatraum zu betreten.", "Votre rang n'est pas assez élevé pour rejoindre ce canal de clan.", "Sua posição não é alta o suficiente para você entrar nesse canal de clã.");
	}

	@OriginalMember(owner = "client!rg", name = "<init>", descriptor = "(Ljava/lang/String;I)V")
	public Class172(@OriginalArg(0) String arg0, @OriginalArg(1) int arg1) {
		this.aString55 = arg0;
		this.anInt5669 = arg1;
	}

	@OriginalMember(owner = "client!rg", name = "toString", descriptor = "()Ljava/lang/String;")
	@Override
	public String toString() {
		throw new IllegalStateException();
	}
}
