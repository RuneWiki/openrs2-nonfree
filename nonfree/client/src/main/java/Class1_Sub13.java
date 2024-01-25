import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sda")
public abstract class Class1_Sub13 extends Class1 {

	static {
		new Class306(" joined the channel.", " hat den Chatraum betreten.", " a rejoint le canal.", " entrou no canal.");
	}

	@OriginalMember(owner = "client!sda", name = "a", descriptor = "(I)I")
	public abstract int method5737();

	@OriginalMember(owner = "client!sda", name = "a", descriptor = "(B)I")
	public abstract int method5739();

	@OriginalMember(owner = "client!sda", name = "b", descriptor = "(B)I")
	public abstract int method5740();

	@OriginalMember(owner = "client!sda", name = "b", descriptor = "(I)J")
	public abstract long method5741();

	@OriginalMember(owner = "client!sda", name = "c", descriptor = "(I)I")
	public abstract int method5742();
}
