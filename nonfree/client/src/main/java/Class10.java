import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hm")
public abstract class Class10 {

	@OriginalMember(owner = "client!hm", name = "a", descriptor = "(ILclient!e;IIZLclient!hm;I)V")
	public abstract void method5335(@OriginalArg(0) int arg0, @OriginalArg(1) Class46 arg1, @OriginalArg(2) int arg2, @OriginalArg(4) boolean arg3, @OriginalArg(5) Class10 arg4, @OriginalArg(6) int arg5);

	@OriginalMember(owner = "client!hm", name = "a", descriptor = "(IIILclient!e;)Z")
	public abstract boolean method5336(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Class46 arg2);

	@OriginalMember(owner = "client!hm", name = "a", descriptor = "(Lclient!e;Z)Lclient!um;")
	public abstract Class1_Sub8 method5337(@OriginalArg(0) Class46 arg0);

	@OriginalMember(owner = "client!hm", name = "c", descriptor = "(I)Z")
	public abstract boolean method5339();

	@OriginalMember(owner = "client!hm", name = "d", descriptor = "(I)V")
	public abstract void method5340();

	@OriginalMember(owner = "client!hm", name = "b", descriptor = "(Lclient!e;B)V")
	public abstract void method5343(@OriginalArg(0) Class46 arg0);
}
