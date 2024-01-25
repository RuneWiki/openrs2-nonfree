import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bm")
public abstract class Class11 {

	@OriginalMember(owner = "client!bm", name = "b", descriptor = "(ILclient!za;)Lclient!on;")
	public abstract Class28_Sub5 method6205(@OriginalArg(1) Class75 arg0);

	@OriginalMember(owner = "client!bm", name = "a", descriptor = "(ILclient!za;IZBILclient!bm;)V")
	public abstract void method6207(@OriginalArg(0) int arg0, @OriginalArg(1) Class75 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean arg3, @OriginalArg(5) int arg4, @OriginalArg(6) Class11 arg5);

	@OriginalMember(owner = "client!bm", name = "b", descriptor = "(I)V")
	public abstract void method6208();

	@OriginalMember(owner = "client!bm", name = "a", descriptor = "(IIILclient!za;)Z")
	public abstract boolean method6209(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Class75 arg2);

	@OriginalMember(owner = "client!bm", name = "c", descriptor = "(ILclient!za;)V")
	public abstract void method6210(@OriginalArg(1) Class75 arg0);

	@OriginalMember(owner = "client!bm", name = "b", descriptor = "(Z)Z")
	public abstract boolean method6211();
}
