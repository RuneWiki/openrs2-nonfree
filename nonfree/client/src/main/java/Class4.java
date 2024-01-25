import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ac")
public abstract class Class4 {

	@OriginalMember(owner = "client!ac", name = "d", descriptor = "(I)Z")
	public abstract boolean method5895();

	@OriginalMember(owner = "client!ac", name = "a", descriptor = "(B)V")
	public abstract void method5896();

	@OriginalMember(owner = "client!ac", name = "a", descriptor = "(IILclient!ea;Lclient!ac;ZII)V")
	public abstract void method5897(@OriginalArg(1) int arg0, @OriginalArg(2) Class55 arg1, @OriginalArg(3) Class4 arg2, @OriginalArg(4) boolean arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5);

	@OriginalMember(owner = "client!ac", name = "b", descriptor = "(ILclient!ea;)Lclient!ms;")
	public abstract Class32_Sub4 method5898(@OriginalArg(1) Class55 arg0);

	@OriginalMember(owner = "client!ac", name = "a", descriptor = "(Lclient!ea;I)V")
	public abstract void method5899(@OriginalArg(0) Class55 arg0);

	@OriginalMember(owner = "client!ac", name = "a", descriptor = "(ZILclient!ea;I)Z")
	public abstract boolean method5900(@OriginalArg(1) int arg0, @OriginalArg(2) Class55 arg1, @OriginalArg(3) int arg2);
}
