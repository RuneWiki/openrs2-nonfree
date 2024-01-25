import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fi")
public abstract class Class16 {

	@OriginalMember(owner = "client!fi", name = "d", descriptor = "(I)V")
	public abstract void method5333();

	@OriginalMember(owner = "client!fi", name = "b", descriptor = "(Lclient!ya;I)V")
	public abstract void method5335(@OriginalArg(0) Class19 arg0);

	@OriginalMember(owner = "client!fi", name = "a", descriptor = "(IILclient!fi;BZLclient!ya;I)V")
	public abstract void method5337(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class16 arg2, @OriginalArg(4) boolean arg3, @OriginalArg(5) Class19 arg4, @OriginalArg(6) int arg5);

	@OriginalMember(owner = "client!fi", name = "d", descriptor = "(B)Z")
	public abstract boolean method5338();

	@OriginalMember(owner = "client!fi", name = "c", descriptor = "(Lclient!ya;I)Lclient!fk;")
	public abstract Class3_Sub3 method5339(@OriginalArg(0) Class19 arg0);

	@OriginalMember(owner = "client!fi", name = "a", descriptor = "(IILclient!ya;I)Z")
	public abstract boolean method5341(@OriginalArg(0) int arg0, @OriginalArg(2) Class19 arg1, @OriginalArg(3) int arg2);
}
