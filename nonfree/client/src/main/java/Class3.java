import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bp")
public abstract class Class3 {

	@OriginalMember(owner = "client!bp", name = "b", descriptor = "(Lclient!eq;Z)Lclient!gl;")
	public abstract Class57_Sub2 method5936(@OriginalArg(0) Class66 arg0);

	@OriginalMember(owner = "client!bp", name = "a", descriptor = "(Lclient!eq;I)V")
	public abstract void method5937(@OriginalArg(0) Class66 arg0);

	@OriginalMember(owner = "client!bp", name = "c", descriptor = "(I)V")
	public abstract void method5938();

	@OriginalMember(owner = "client!bp", name = "a", descriptor = "(ILclient!eq;BI)Z")
	public abstract boolean method5939(@OriginalArg(0) int arg0, @OriginalArg(1) Class66 arg1, @OriginalArg(3) int arg2);

	@OriginalMember(owner = "client!bp", name = "a", descriptor = "(IIILclient!bp;IZLclient!eq;)V")
	public abstract void method5941(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) Class3 arg2, @OriginalArg(4) int arg3, @OriginalArg(5) boolean arg4, @OriginalArg(6) Class66 arg5);

	@OriginalMember(owner = "client!bp", name = "d", descriptor = "(I)Z")
	public abstract boolean method5942();
}
