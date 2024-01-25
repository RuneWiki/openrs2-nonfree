import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ot")
public abstract class Class25 {

	@OriginalMember(owner = "client!ot", name = "b", descriptor = "(BLclient!za;)Lclient!uc;")
	public abstract Class4_Sub7 method4600(@OriginalArg(1) Class34 arg0);

	@OriginalMember(owner = "client!ot", name = "a", descriptor = "(ILclient!za;BI)Z")
	public abstract boolean method4601(@OriginalArg(0) int arg0, @OriginalArg(1) Class34 arg1, @OriginalArg(3) int arg2);

	@OriginalMember(owner = "client!ot", name = "c", descriptor = "(B)Z")
	public abstract boolean method4602();

	@OriginalMember(owner = "client!ot", name = "c", descriptor = "(BLclient!za;)V")
	public abstract void method4606(@OriginalArg(1) Class34 arg0);

	@OriginalMember(owner = "client!ot", name = "d", descriptor = "(B)V")
	public abstract void method4607();

	@OriginalMember(owner = "client!ot", name = "a", descriptor = "(IIIZILclient!ot;Lclient!za;)V")
	public abstract void method4609(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) boolean arg2, @OriginalArg(4) int arg3, @OriginalArg(5) Class25 arg4, @OriginalArg(6) Class34 arg5);
}
