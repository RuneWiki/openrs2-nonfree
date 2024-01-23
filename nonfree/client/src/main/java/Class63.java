import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gl")
public abstract class Class63 {

	@OriginalMember(owner = "client!gl", name = "<init>", descriptor = "()V")
	protected Class63() {
	}

	@OriginalMember(owner = "client!gl", name = "a", descriptor = "(Z)Lclient!of;")
	public abstract Class125 method3792();

	@OriginalMember(owner = "client!gl", name = "a", descriptor = "(BI)V")
	public abstract void method3794(@OriginalArg(1) int arg0);

	@OriginalMember(owner = "client!gl", name = "b", descriptor = "(BI)I")
	public abstract int method3796(@OriginalArg(1) int arg0);

	@OriginalMember(owner = "client!gl", name = "a", descriptor = "(II)[B")
	public abstract byte[] method3797(@OriginalArg(1) int arg0);
}
