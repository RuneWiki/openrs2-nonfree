import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!je")
public abstract class Class11 {

	@OriginalMember(owner = "client!je", name = "a", descriptor = "(ILclient!fp;)Lclient!uq;")
	public abstract Class32_Sub7 method5909(@OriginalArg(1) Class63 arg0);

	@OriginalMember(owner = "client!je", name = "d", descriptor = "(I)V")
	public abstract void method5911();

	@OriginalMember(owner = "client!je", name = "b", descriptor = "(ILclient!fp;)V")
	public abstract void method5912(@OriginalArg(1) Class63 arg0);

	@OriginalMember(owner = "client!je", name = "d", descriptor = "(B)Z")
	public abstract boolean method5913();

	@OriginalMember(owner = "client!je", name = "a", descriptor = "(Lclient!fp;III)Z")
	public abstract boolean method5914(@OriginalArg(0) Class63 arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2);

	@OriginalMember(owner = "client!je", name = "a", descriptor = "(Lclient!fp;Lclient!je;ZIIII)V")
	public abstract void method5915(@OriginalArg(0) Class63 arg0, @OriginalArg(1) Class11 arg1, @OriginalArg(2) boolean arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(6) int arg5);
}
