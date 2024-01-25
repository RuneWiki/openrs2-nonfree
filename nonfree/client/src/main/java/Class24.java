import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vs")
public abstract class Class24 {

	@OriginalMember(owner = "client!vs", name = "a", descriptor = "(BLclient!za;)V")
	public abstract void method5685(@OriginalArg(1) Class50 arg0);

	@OriginalMember(owner = "client!vs", name = "b", descriptor = "(Lclient!za;I)Lclient!nd;")
	public abstract Class40_Sub5 method5686(@OriginalArg(0) Class50 arg0);

	@OriginalMember(owner = "client!vs", name = "a", descriptor = "(IBILclient!vs;Lclient!za;ZI)V")
	public abstract void method5687(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Class24 arg2, @OriginalArg(4) Class50 arg3, @OriginalArg(5) boolean arg4, @OriginalArg(6) int arg5);

	@OriginalMember(owner = "client!vs", name = "f", descriptor = "(I)V")
	public abstract void method5690();

	@OriginalMember(owner = "client!vs", name = "a", descriptor = "(ZLclient!za;II)Z")
	public abstract boolean method5691(@OriginalArg(1) Class50 arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2);

	@OriginalMember(owner = "client!vs", name = "a", descriptor = "(B)Z")
	public abstract boolean method5692();
}
