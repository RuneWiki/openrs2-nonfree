import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hh")
public abstract class Class22 {

	@OriginalMember(owner = "client!hh", name = "c", descriptor = "(B)V")
	public abstract void method5338();

	@OriginalMember(owner = "client!hh", name = "a", descriptor = "(ZILclient!hh;Lclient!pe;III)V")
	public abstract void method5340(@OriginalArg(0) boolean arg0, @OriginalArg(2) Class22 arg1, @OriginalArg(3) Class89 arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5);

	@OriginalMember(owner = "client!hh", name = "a", descriptor = "(ILclient!pe;)V")
	public abstract void method5341(@OriginalArg(1) Class89 arg0);

	@OriginalMember(owner = "client!hh", name = "a", descriptor = "(IILclient!pe;I)Z")
	public abstract boolean method5342(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class89 arg2);

	@OriginalMember(owner = "client!hh", name = "e", descriptor = "(I)Z")
	public abstract boolean method5343();

	@OriginalMember(owner = "client!hh", name = "a", descriptor = "(Lclient!pe;B)Lclient!ca;")
	public abstract Class36_Sub1 method5345(@OriginalArg(0) Class89 arg0);
}
