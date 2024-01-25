import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dw")
public abstract class Class2_Sub14 extends Class2 {

	static {
		new Class134("Player ", "Spieler ", "Joueur ", "Jogador ");
	}

	@OriginalMember(owner = "client!dw", name = "c", descriptor = "(I)I")
	public abstract int method5381();

	@OriginalMember(owner = "client!dw", name = "d", descriptor = "(I)I")
	public abstract int method5382();

	@OriginalMember(owner = "client!dw", name = "c", descriptor = "(B)I")
	public abstract int method5383();

	@OriginalMember(owner = "client!dw", name = "e", descriptor = "(I)J")
	public abstract long method5384();
}
