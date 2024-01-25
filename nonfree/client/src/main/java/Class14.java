import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ar")
public abstract class Class14 {

	static {
		new Class134("Now talking in clan channel of player: ", "Clanchat dieses Spieler beigetreten: ", "Vous participez actuellement au canal de clan du joueur : ", "Falando no canal do clã do jogador: ");
	}

	@OriginalMember(owner = "client!ar", name = "<init>", descriptor = "()V")
	protected Class14() {
	}

	@OriginalMember(owner = "client!ar", name = "a", descriptor = "(IB)V")
	public abstract void method2726(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!ar", name = "a", descriptor = "(B)Lclient!lf;")
	public abstract Class143 method2727();

	@OriginalMember(owner = "client!ar", name = "b", descriptor = "(IB)[B")
	public abstract byte[] method2729(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!ar", name = "b", descriptor = "(II)I")
	public abstract int method2731(@OriginalArg(1) int arg0);
}
