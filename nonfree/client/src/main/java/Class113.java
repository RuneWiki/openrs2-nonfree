import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gs")
public abstract class Class113 {

	static {
		new Class67("You are not currently in a clan channel.", "Du befindest dich derzeit nicht in einem Chatraum.", "Vous n'êtes pas dans un canal de clan.", "No momento você não está em um canal de clã.");
	}

	@OriginalMember(owner = "client!gs", name = "<init>", descriptor = "()V")
	protected Class113() {
	}

	@OriginalMember(owner = "client!gs", name = "a", descriptor = "(IB)V")
	public abstract void method5706(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!gs", name = "a", descriptor = "(II)[B")
	public abstract byte[] method5707(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!gs", name = "b", descriptor = "(IB)I")
	public abstract int method5708(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!gs", name = "b", descriptor = "(I)Lclient!bs;")
	public abstract Class37 method5710();
}
