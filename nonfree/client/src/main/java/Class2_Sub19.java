import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ii")
public final class Class2_Sub19 extends Class2 {

	@OriginalMember(owner = "client!ii", name = "s", descriptor = "[B")
	public final byte[] aByteArray36;

	static {
		new Class62("Now talking in clan channel of player: ", "Clanchat dieses Spieler beigetreten: ", "Vous participez actuellement au canal de clan du joueur : ", "Falando no canal do clã do jogador: ");
	}

	@OriginalMember(owner = "client!ii", name = "<init>", descriptor = "([B)V")
	public Class2_Sub19(@OriginalArg(0) byte[] arg0) {
		this.aByteArray36 = arg0;
	}
}
