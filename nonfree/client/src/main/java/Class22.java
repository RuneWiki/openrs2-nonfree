import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bj")
public abstract class Class22 {

	static {
		new Class85("Invalid player name.", "Unzulässiger Charaktername!", "Nom de joueur incorrect.", "Nome de jogador inválido.");
	}

	@OriginalMember(owner = "client!bj", name = "a", descriptor = "(I)[B")
	public abstract byte[] method5482();

	@OriginalMember(owner = "client!bj", name = "a", descriptor = "([BI)V")
	public abstract void method5487(@OriginalArg(0) byte[] arg0);
}
