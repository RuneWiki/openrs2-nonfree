import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vl")
public abstract class Class30 {

	@OriginalMember(owner = "client!vl", name = "b", descriptor = "(BLclient!za;)V")
	public abstract void method5716(@OriginalArg(1) Class106 arg0);

	@OriginalMember(owner = "client!vl", name = "a", descriptor = "(Lclient!za;III)Z")
	public abstract boolean method5717(@OriginalArg(0) Class106 arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2);

	@OriginalMember(owner = "client!vl", name = "a", descriptor = "(IILclient!za;IILclient!vl;Z)V")
	public abstract void method5718(@OriginalArg(1) int arg0, @OriginalArg(2) Class106 arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) Class30 arg4, @OriginalArg(6) boolean arg5);

	@OriginalMember(owner = "client!vl", name = "a", descriptor = "(Z)Z")
	public abstract boolean method5719();

	@OriginalMember(owner = "client!vl", name = "b", descriptor = "(Z)V")
	public abstract void method5721();

	@OriginalMember(owner = "client!vl", name = "b", descriptor = "(ILclient!za;)Lclient!sr;")
	public abstract Class41_Sub7 method5722(@OriginalArg(1) Class106 arg0);
}
