import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qj")
public abstract class Class26 {

	@OriginalMember(owner = "client!qj", name = "a", descriptor = "(ILclient!ya;II)Z")
	public abstract boolean method5711(@OriginalArg(0) int arg0, @OriginalArg(1) Class51 arg1, @OriginalArg(3) int arg2);

	@OriginalMember(owner = "client!qj", name = "a", descriptor = "(Lclient!ya;IIILclient!qj;IZ)V")
	public abstract void method5712(@OriginalArg(0) Class51 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) Class26 arg4, @OriginalArg(6) boolean arg5);

	@OriginalMember(owner = "client!qj", name = "a", descriptor = "(Lclient!ya;I)V")
	public abstract void method5713(@OriginalArg(0) Class51 arg0);

	@OriginalMember(owner = "client!qj", name = "b", descriptor = "(Lclient!ya;I)Lclient!mo;")
	public abstract Class28_Sub4 method5714(@OriginalArg(0) Class51 arg0);

	@OriginalMember(owner = "client!qj", name = "c", descriptor = "(I)V")
	public abstract void method5715();

	@OriginalMember(owner = "client!qj", name = "e", descriptor = "(I)Z")
	public abstract boolean method5721();
}
