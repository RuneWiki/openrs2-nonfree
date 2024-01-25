import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qv")
public abstract class Class6 {

	@OriginalMember(owner = "client!qv", name = "a", descriptor = "(Lclient!qa;I)Lclient!pj;")
	public abstract Class41_Sub6 method5630(@OriginalArg(0) Class30 arg0);

	@OriginalMember(owner = "client!qv", name = "a", descriptor = "(IIILclient!qa;)Z")
	public abstract boolean method5631(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Class30 arg2);

	@OriginalMember(owner = "client!qv", name = "d", descriptor = "(I)Z")
	public abstract boolean method5633();

	@OriginalMember(owner = "client!qv", name = "e", descriptor = "(I)V")
	public abstract void method5634();

	@OriginalMember(owner = "client!qv", name = "a", descriptor = "(Lclient!qv;BLclient!qa;IZII)V")
	public abstract void method5636(@OriginalArg(0) Class6 arg0, @OriginalArg(2) Class30 arg1, @OriginalArg(3) int arg2, @OriginalArg(4) boolean arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5);

	@OriginalMember(owner = "client!qv", name = "b", descriptor = "(BLclient!qa;)V")
	public abstract void method5637(@OriginalArg(1) Class30 arg0);
}
