import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!in")
public abstract class Class28 {

	@OriginalMember(owner = "client!in", name = "a", descriptor = "(Lclient!np;B)V")
	public abstract void method5406(@OriginalArg(0) Class155 arg0);

	@OriginalMember(owner = "client!in", name = "b", descriptor = "(ILclient!np;)Lclient!ql;")
	public abstract Class12_Sub7 method5407(@OriginalArg(1) Class155 arg0);

	@OriginalMember(owner = "client!in", name = "a", descriptor = "(IIILclient!np;)Z")
	public abstract boolean method5408(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Class155 arg2);

	@OriginalMember(owner = "client!in", name = "a", descriptor = "(ILclient!in;ILclient!np;BZI)V")
	public abstract void method5410(@OriginalArg(0) int arg0, @OriginalArg(1) Class28 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) Class155 arg3, @OriginalArg(5) boolean arg4, @OriginalArg(6) int arg5);

	@OriginalMember(owner = "client!in", name = "d", descriptor = "(I)V")
	public abstract void method5411();

	@OriginalMember(owner = "client!in", name = "e", descriptor = "(I)Z")
	public abstract boolean method5413();
}
