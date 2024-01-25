import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ij")
public abstract class Class3 {

	@OriginalMember(owner = "client!ij", name = "f", descriptor = "(I)Z")
	public abstract boolean method5135();

	@OriginalMember(owner = "client!ij", name = "a", descriptor = "(Lclient!ya;IZLclient!ij;III)V")
	public abstract void method5136(@OriginalArg(0) Class49 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2, @OriginalArg(3) Class3 arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5);

	@OriginalMember(owner = "client!ij", name = "a", descriptor = "(ZILclient!ya;I)Z")
	public abstract boolean method5140(@OriginalArg(1) int arg0, @OriginalArg(2) Class49 arg1, @OriginalArg(3) int arg2);

	@OriginalMember(owner = "client!ij", name = "a", descriptor = "(Lclient!ya;B)Lclient!mf;")
	public abstract Class8_Sub5 method5141(@OriginalArg(0) Class49 arg0);

	@OriginalMember(owner = "client!ij", name = "c", descriptor = "(ILclient!ya;)V")
	public abstract void method5143(@OriginalArg(1) Class49 arg0);

	@OriginalMember(owner = "client!ij", name = "h", descriptor = "(I)V")
	public abstract void method5144();
}
