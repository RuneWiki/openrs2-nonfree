import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qha")
public abstract class Class293 {

	@OriginalMember(owner = "client!qha", name = "<init>", descriptor = "()V")
	protected Class293() {
	}

	@OriginalMember(owner = "client!qha", name = "a", descriptor = "(IZ)V")
	public abstract void method7305(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!qha", name = "a", descriptor = "(II)[B")
	public abstract byte[] method7306(@OriginalArg(1) int arg0);

	@OriginalMember(owner = "client!qha", name = "b", descriptor = "(II)I")
	public abstract int method7307(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!qha", name = "a", descriptor = "(Z)Lclient!ai;")
	public abstract Class16 method7308();
}
