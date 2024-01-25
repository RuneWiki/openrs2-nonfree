import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!eq")
public abstract class Class4 {

	@OriginalMember(owner = "client!eq", name = "a", descriptor = "(Z)V")
	public abstract void method5889();

	@OriginalMember(owner = "client!eq", name = "b", descriptor = "(B)Z")
	public abstract boolean method5891();

	@OriginalMember(owner = "client!eq", name = "a", descriptor = "(IILclient!qa;Lclient!eq;IIZ)V")
	public abstract void method5892(@OriginalArg(1) int arg0, @OriginalArg(2) Class26 arg1, @OriginalArg(3) Class4 arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) boolean arg5);

	@OriginalMember(owner = "client!eq", name = "a", descriptor = "(Lclient!qa;Z)V")
	public abstract void method5893(@OriginalArg(0) Class26 arg0);

	@OriginalMember(owner = "client!eq", name = "a", descriptor = "(IILclient!qa;I)Z")
	public abstract boolean method5894(@OriginalArg(1) int arg0, @OriginalArg(2) Class26 arg1, @OriginalArg(3) int arg2);

	@OriginalMember(owner = "client!eq", name = "b", descriptor = "(ILclient!qa;)Lclient!fm;")
	public abstract Class38_Sub3 method5896(@OriginalArg(1) Class26 arg0);
}
