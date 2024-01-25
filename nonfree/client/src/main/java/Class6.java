import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!of")
public abstract class Class6 {

	static {
		new Class140("Chat disabled", "Deaktiviert", "Messagerie désactivée", "Bate-papo desativado");
	}

	@OriginalMember(owner = "client!of", name = "a", descriptor = "(B)J")
	public abstract long method4867();

	@OriginalMember(owner = "client!of", name = "a", descriptor = "(II)I")
	public abstract int method4870(@OriginalArg(1) int arg0);

	@OriginalMember(owner = "client!of", name = "b", descriptor = "(I)V")
	public abstract void method4871();
}
