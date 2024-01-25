import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cea")
public abstract class Class15 {

	@OriginalMember(owner = "client!cea", name = "b", descriptor = "(ILclient!qa;)Lclient!km;")
	public abstract Class175 method6854(@OriginalArg(1) Class62 arg0);

	@OriginalMember(owner = "client!cea", name = "a", descriptor = "(BLclient!qa;II)Z")
	public abstract boolean method6857(@OriginalArg(1) Class62 arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2);

	@OriginalMember(owner = "client!cea", name = "a", descriptor = "(Lclient!qa;I)Lclient!bi;")
	public abstract Class30_Sub1 method6858(@OriginalArg(0) Class62 arg0);

	@OriginalMember(owner = "client!cea", name = "a", descriptor = "(BZILclient!qa;IILclient!cea;)V")
	public abstract void method6859(@OriginalArg(1) boolean arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Class62 arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) Class15 arg5);

	@OriginalMember(owner = "client!cea", name = "e", descriptor = "(I)V")
	public abstract void method6860();

	@OriginalMember(owner = "client!cea", name = "a", descriptor = "(Z)Z")
	public abstract boolean method6861();

	@OriginalMember(owner = "client!cea", name = "a", descriptor = "(Lclient!qa;B)V")
	public abstract void method6862(@OriginalArg(0) Class62 arg0);
}
