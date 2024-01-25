import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!va")
public abstract class Class6 {

	@OriginalMember(owner = "client!va", name = "f", descriptor = "(I)Z")
	public abstract boolean method7743();

	@OriginalMember(owner = "client!va", name = "a", descriptor = "(IILclient!oa;I)Z")
	public abstract boolean method7744(@OriginalArg(1) int arg0, @OriginalArg(2) Class5 arg1, @OriginalArg(3) int arg2);

	@OriginalMember(owner = "client!va", name = "a", descriptor = "(Lclient!oa;B)Lclient!aca;")
	public abstract Class4_Sub1 method7745(@OriginalArg(0) Class5 arg0);

	@OriginalMember(owner = "client!va", name = "a", descriptor = "(Lclient!oa;I)V")
	public abstract void method7746(@OriginalArg(0) Class5 arg0);

	@OriginalMember(owner = "client!va", name = "a", descriptor = "(IIILclient!va;Lclient!oa;ZI)V")
	public abstract void method7749(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Class6 arg2, @OriginalArg(4) Class5 arg3, @OriginalArg(5) boolean arg4, @OriginalArg(6) int arg5);

	@OriginalMember(owner = "client!va", name = "b", descriptor = "(Lclient!oa;I)Lclient!ew;")
	public abstract Class81 method7751(@OriginalArg(0) Class5 arg0);

	@OriginalMember(owner = "client!va", name = "b", descriptor = "(B)V")
	public abstract void method7752();
}
