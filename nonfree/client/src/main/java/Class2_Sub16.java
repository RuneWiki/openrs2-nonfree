import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ka")
public abstract class Class2_Sub16 extends Class2 {

	static {
		new Class93("System update in: ", "System-Update in: ", "Mise à jour système dans : ", "Atualização do sistema em: ");
	}

	@OriginalMember(owner = "client!ka", name = "c", descriptor = "(B)I")
	public abstract int method1557();

	@OriginalMember(owner = "client!ka", name = "d", descriptor = "(B)J")
	public abstract long method1559();

	@OriginalMember(owner = "client!ka", name = "d", descriptor = "(I)I")
	public abstract int method1562();

	@OriginalMember(owner = "client!ka", name = "e", descriptor = "(I)I")
	public abstract int method1564();
}
