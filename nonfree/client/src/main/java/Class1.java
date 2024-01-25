import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!a")
public abstract class Class1 {

	@OriginalMember(owner = "client!a", name = "c", descriptor = "(ILclient!oj;)Lclient!mg;")
	public abstract Class7_Sub5 method6013(@OriginalArg(1) Class48 arg0);

	@OriginalMember(owner = "client!a", name = "d", descriptor = "(I)Z")
	public abstract boolean method6015();

	@OriginalMember(owner = "client!a", name = "a", descriptor = "(ILclient!oj;II)Z")
	public abstract boolean method6016(@OriginalArg(0) int arg0, @OriginalArg(1) Class48 arg1, @OriginalArg(2) int arg2);

	@OriginalMember(owner = "client!a", name = "a", descriptor = "(IIZLclient!a;IBLclient!oj;)V")
	public abstract void method6019(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2, @OriginalArg(3) Class1 arg3, @OriginalArg(4) int arg4, @OriginalArg(6) Class48 arg5);

	@OriginalMember(owner = "client!a", name = "e", descriptor = "(I)V")
	public abstract void method6020();

	@OriginalMember(owner = "client!a", name = "d", descriptor = "(ILclient!oj;)V")
	public abstract void method6023(@OriginalArg(1) Class48 arg0);
}
