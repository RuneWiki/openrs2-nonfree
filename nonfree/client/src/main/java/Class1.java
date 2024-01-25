import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!la")
public abstract class Class1 {

	@OriginalMember(owner = "client!la", name = "c", descriptor = "(Lclient!dr;I)V")
	public abstract void method5754(@OriginalArg(0) Class37 arg0);

	@OriginalMember(owner = "client!la", name = "a", descriptor = "(IILclient!dr;I)Z")
	public abstract boolean method5757(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class37 arg2);

	@OriginalMember(owner = "client!la", name = "d", descriptor = "(Lclient!dr;I)Lclient!kq;")
	public abstract Class57_Sub5 method5758(@OriginalArg(0) Class37 arg0);

	@OriginalMember(owner = "client!la", name = "b", descriptor = "(Z)Z")
	public abstract boolean method5759();

	@OriginalMember(owner = "client!la", name = "b", descriptor = "(B)V")
	public abstract void method5761();

	@OriginalMember(owner = "client!la", name = "a", descriptor = "(ZILclient!la;IIILclient!dr;)V")
	public abstract void method5762(@OriginalArg(0) boolean arg0, @OriginalArg(2) Class1 arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) Class37 arg5);
}
