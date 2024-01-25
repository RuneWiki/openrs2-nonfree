import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hm")
public abstract class Class25 {

	@OriginalMember(owner = "client!hm", name = "b", descriptor = "(Lclient!tq;I)Lclient!cj;")
	public abstract Class41_Sub1 method5229(@OriginalArg(0) Class164 arg0);

	@OriginalMember(owner = "client!hm", name = "a", descriptor = "(ILclient!tq;)V")
	public abstract void method5232(@OriginalArg(1) Class164 arg0);

	@OriginalMember(owner = "client!hm", name = "b", descriptor = "(I)V")
	public abstract void method5233();

	@OriginalMember(owner = "client!hm", name = "a", descriptor = "(Lclient!tq;III)Z")
	public abstract boolean method5234(@OriginalArg(0) Class164 arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2);

	@OriginalMember(owner = "client!hm", name = "a", descriptor = "(BZLclient!tq;Lclient!hm;III)V")
	public abstract void method5235(@OriginalArg(1) boolean arg0, @OriginalArg(2) Class164 arg1, @OriginalArg(3) Class25 arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5);

	@OriginalMember(owner = "client!hm", name = "c", descriptor = "(I)Z")
	public abstract boolean method5236();
}
