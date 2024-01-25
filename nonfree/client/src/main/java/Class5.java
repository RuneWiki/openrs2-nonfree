import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qh")
public abstract class Class5 {

	@OriginalMember(owner = "client!qh", name = "a", descriptor = "(IZIILclient!aa;ILclient!qh;)V")
	public abstract void method5677(@OriginalArg(1) boolean arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) Class2 arg3, @OriginalArg(5) int arg4, @OriginalArg(6) Class5 arg5);

	@OriginalMember(owner = "client!qh", name = "c", descriptor = "(B)V")
	public abstract void method5678();

	@OriginalMember(owner = "client!qh", name = "a", descriptor = "(Lclient!aa;I)Lclient!cn;")
	public abstract Class15_Sub3 method5680(@OriginalArg(0) Class2 arg0);

	@OriginalMember(owner = "client!qh", name = "d", descriptor = "(I)Z")
	public abstract boolean method5681();

	@OriginalMember(owner = "client!qh", name = "a", descriptor = "(IIILclient!aa;)Z")
	public abstract boolean method5684(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Class2 arg2);

	@OriginalMember(owner = "client!qh", name = "a", descriptor = "(Lclient!aa;Z)V")
	public abstract void method5686(@OriginalArg(0) Class2 arg0);
}
