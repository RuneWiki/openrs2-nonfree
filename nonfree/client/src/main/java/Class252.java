import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pe")
public abstract class Class252 {

	@OriginalMember(owner = "client!pe", name = "<init>", descriptor = "()V")
	protected Class252() {
	}

	@OriginalMember(owner = "client!pe", name = "a", descriptor = "(I)Lclient!km;")
	public abstract Class191 method7921();

	@OriginalMember(owner = "client!pe", name = "a", descriptor = "(II)[B")
	public abstract byte[] method7922(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!pe", name = "a", descriptor = "(IB)I")
	public abstract int method7923(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!pe", name = "b", descriptor = "(IB)V")
	public abstract void method7926(@OriginalArg(0) int arg0);
}
