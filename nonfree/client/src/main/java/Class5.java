import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!as")
public abstract class Class5 {

	@OriginalMember(owner = "client!as", name = "f", descriptor = "Ljava/lang/String;")
	public static String aString51 = "";

	static {
		new Class79("Invalid player name.", "Unzulässiger Charaktername!", "Nom de joueur incorrect.", "Nome de jogador inválido.");
		new Class79("You are not allowed to talk in this clan channel.", "Du darfst in diesem Chatraum nicht reden.", "Vous n'êtes pas autorisé à parler dans ce canal de clan.", "Você não tem permissão para conversar neste canal de clã.");
	}

	@OriginalMember(owner = "client!as", name = "a", descriptor = "(I)J")
	public abstract long method4406();

	@OriginalMember(owner = "client!as", name = "c", descriptor = "(I)V")
	public abstract void method4409();

	@OriginalMember(owner = "client!as", name = "a", descriptor = "(ZI)I")
	public abstract int method4410(@OriginalArg(1) int arg0);
}
