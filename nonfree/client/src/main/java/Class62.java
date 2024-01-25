import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!na")
public abstract class Class62 {

	@OriginalMember(owner = "client!na", name = "a", descriptor = "(Z)Z")
	public abstract boolean method5564();

	@OriginalMember(owner = "client!na", name = "a", descriptor = "(ILclient!ae;II)Z")
	public abstract boolean method5565(@OriginalArg(0) int arg0, @OriginalArg(1) Class4 arg1, @OriginalArg(3) int arg2);

	@OriginalMember(owner = "client!na", name = "a", descriptor = "(Lclient!ae;B)V")
	public abstract void method5567(@OriginalArg(0) Class4 arg0);

	@OriginalMember(owner = "client!na", name = "a", descriptor = "(BLclient!ae;)Lclient!jg;")
	public abstract Class55_Sub3 method5568(@OriginalArg(1) Class4 arg0);

	@OriginalMember(owner = "client!na", name = "e", descriptor = "(I)V")
	public abstract void method5569();

	@OriginalMember(owner = "client!na", name = "a", descriptor = "(ZBIILclient!na;ILclient!ae;)V")
	public abstract void method5570(@OriginalArg(0) boolean arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) Class62 arg3, @OriginalArg(5) int arg4, @OriginalArg(6) Class4 arg5);
}
