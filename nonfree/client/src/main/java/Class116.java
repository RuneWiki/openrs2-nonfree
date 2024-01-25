import java.io.IOException;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!te")
public abstract class Class116 {

	static {
		new Class174("To go here you must login to a members' server.", "Du musst auf einer Mitglieder-Welt sein, um dort hinzukommen.", "Vous devez vous connecter à un serveur d'abonnés pour aller à cet endroit.", "Para entrar aqui, acesse um servidor para membros.");
		new Class174("You do not have a high enough rank to join this clan channel.", "Dein Rang reicht nicht aus, um diesen Chatraum zu betreten.", "Votre rang n'est pas assez élevé pour rejoindre ce canal de clan.", "Sua posição não é alta o suficiente para você entrar nesse canal de clã.");
	}

	@OriginalMember(owner = "client!te", name = "<init>", descriptor = "()V")
	protected Class116() {
	}

	@OriginalMember(owner = "client!te", name = "a", descriptor = "(IZ[BI)V")
	public abstract void method2918(@OriginalArg(0) int arg0, @OriginalArg(2) byte[] arg1) throws IOException;

	@OriginalMember(owner = "client!te", name = "a", descriptor = "([BIII)I")
	public abstract int method2919(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) throws IOException;

	@OriginalMember(owner = "client!te", name = "a", descriptor = "(B)V")
	public abstract void method2920();

	@OriginalMember(owner = "client!te", name = "a", descriptor = "(I)V")
	public abstract void method2923();

	@OriginalMember(owner = "client!te", name = "a", descriptor = "(BI)Z")
	public abstract boolean method2924(@OriginalArg(1) int arg0) throws IOException;
}
