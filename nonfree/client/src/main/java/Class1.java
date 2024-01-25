import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!a")
public abstract class Class1 {

	@OriginalMember(owner = "client!a", name = "b", descriptor = "(ZLclient!qa;)V")
	public abstract void method6241(@OriginalArg(1) Class167 arg0);

	@OriginalMember(owner = "client!a", name = "a", descriptor = "(ILclient!qa;)Lclient!ou;")
	public abstract Class23_Sub5 method6242(@OriginalArg(1) Class167 arg0);

	@OriginalMember(owner = "client!a", name = "f", descriptor = "(I)V")
	public abstract void method6244();

	@OriginalMember(owner = "client!a", name = "a", descriptor = "(BIILclient!qa;)Z")
	public abstract boolean method6245(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Class167 arg2);

	@OriginalMember(owner = "client!a", name = "b", descriptor = "(Z)Z")
	public abstract boolean method6247();

	@OriginalMember(owner = "client!a", name = "a", descriptor = "(ILclient!a;IIILclient!qa;Z)V")
	public abstract void method6248(@OriginalArg(0) int arg0, @OriginalArg(1) Class1 arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) Class167 arg4, @OriginalArg(6) boolean arg5);
}
