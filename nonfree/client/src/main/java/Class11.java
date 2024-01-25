import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fl")
public abstract class Class11 {

	@OriginalMember(owner = "client!fl", name = "a", descriptor = "(ZIZIILclient!fl;Lclient!oa;)V")
	public abstract void method8103(@OriginalArg(0) boolean arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) Class11 arg4, @OriginalArg(6) Class9 arg5);

	@OriginalMember(owner = "client!fl", name = "a", descriptor = "(IILclient!oa;I)Z")
	public abstract boolean method8104(@OriginalArg(0) int arg0, @OriginalArg(2) Class9 arg1, @OriginalArg(3) int arg2);

	@OriginalMember(owner = "client!fl", name = "d", descriptor = "(B)Z")
	public abstract boolean method8105();

	@OriginalMember(owner = "client!fl", name = "a", descriptor = "(ILclient!oa;)Lclient!gr;")
	public abstract Class122 method8106(@OriginalArg(1) Class9 arg0);

	@OriginalMember(owner = "client!fl", name = "d", descriptor = "(I)V")
	public abstract void method8107();

	@OriginalMember(owner = "client!fl", name = "b", descriptor = "(Lclient!oa;I)Lclient!ok;")
	public abstract Class5_Sub5 method8109(@OriginalArg(0) Class9 arg0);

	@OriginalMember(owner = "client!fl", name = "c", descriptor = "(Lclient!oa;I)V")
	public abstract void method8110(@OriginalArg(0) Class9 arg0);
}
