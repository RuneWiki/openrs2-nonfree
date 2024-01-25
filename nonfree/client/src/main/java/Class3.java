import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lb")
public abstract class Class3 {

	@OriginalMember(owner = "client!lb", name = "c", descriptor = "(I)Z")
	public abstract boolean method5277();

	@OriginalMember(owner = "client!lb", name = "a", descriptor = "(BLclient!za;)Lclient!ql;")
	public abstract Class21_Sub6 method5280(@OriginalArg(1) Class163 arg0);

	@OriginalMember(owner = "client!lb", name = "a", descriptor = "(Lclient!lb;IZIBILclient!za;)V")
	public abstract void method5281(@OriginalArg(0) Class3 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) Class163 arg5);

	@OriginalMember(owner = "client!lb", name = "a", descriptor = "(IBILclient!za;)Z")
	public abstract boolean method5282(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Class163 arg2);

	@OriginalMember(owner = "client!lb", name = "e", descriptor = "(I)V")
	public abstract void method5284();

	@OriginalMember(owner = "client!lb", name = "c", descriptor = "(Lclient!za;I)V")
	public abstract void method5285(@OriginalArg(0) Class163 arg0);
}
