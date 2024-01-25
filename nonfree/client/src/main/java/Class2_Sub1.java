import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hc")
public abstract class Class2_Sub1 extends Class2 {

	static {
		new Class140(" joined the channel.", " hat den Chatraum betreten.", " a rejoint le canal.", " entrou no canal.");
	}

	@OriginalMember(owner = "client!hc", name = "c", descriptor = "(I)J")
	public abstract long method47();

	@OriginalMember(owner = "client!hc", name = "d", descriptor = "(I)I")
	public abstract int method49();

	@OriginalMember(owner = "client!hc", name = "c", descriptor = "(B)I")
	public abstract int method51();

	@OriginalMember(owner = "client!hc", name = "e", descriptor = "(I)I")
	public abstract int method53();
}
