import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ua")
public abstract class Class25 {

	@OriginalMember(owner = "client!ua", name = "a", descriptor = "(I)V")
	public abstract void method1150();

	@OriginalMember(owner = "client!ua", name = "b", descriptor = "(Z)V")
	public abstract void method1151();

	@OriginalMember(owner = "client!ua", name = "a", descriptor = "(I[BBZ)V")
	public abstract void method1154(@OriginalArg(0) int arg0, @OriginalArg(1) byte[] arg1, @OriginalArg(3) boolean arg2);

	@OriginalMember(owner = "client!ua", name = "b", descriptor = "(IB)V")
	public abstract void method1156(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!ua", name = "b", descriptor = "(I)V")
	public abstract void method1157();

	@OriginalMember(owner = "client!ua", name = "a", descriptor = "(III)V")
	public abstract void method1158(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1);
}
