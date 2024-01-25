import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fs")
public abstract class Class25 {

	@OriginalMember(owner = "client!fs", name = "a", descriptor = "(Lclient!en;I)V")
	public abstract void method5583(@OriginalArg(0) Class59 arg0);

	@OriginalMember(owner = "client!fs", name = "a", descriptor = "(ILclient!en;IBLclient!fs;IZ)V")
	public abstract void method5584(@OriginalArg(0) int arg0, @OriginalArg(1) Class59 arg1, @OriginalArg(2) int arg2, @OriginalArg(4) Class25 arg3, @OriginalArg(5) int arg4, @OriginalArg(6) boolean arg5);

	@OriginalMember(owner = "client!fs", name = "e", descriptor = "(I)Z")
	public abstract boolean method5585();

	@OriginalMember(owner = "client!fs", name = "a", descriptor = "(IIZLclient!en;)Z")
	public abstract boolean method5586(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) Class59 arg2);

	@OriginalMember(owner = "client!fs", name = "f", descriptor = "(I)V")
	public abstract void method5588();

	@OriginalMember(owner = "client!fs", name = "a", descriptor = "(ILclient!en;)Lclient!ir;")
	public abstract Class63_Sub3 method5590(@OriginalArg(1) Class59 arg0);
}
