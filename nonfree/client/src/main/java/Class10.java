import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nc")
public abstract class Class10 {

	@OriginalMember(owner = "client!nc", name = "a", descriptor = "(Z)V")
	public abstract void method5819();

	@OriginalMember(owner = "client!nc", name = "b", descriptor = "(Lclient!ii;I)Lclient!eb;")
	public abstract Class7_Sub3 method5821(@OriginalArg(0) Class105 arg0);

	@OriginalMember(owner = "client!nc", name = "a", descriptor = "(ILclient!ii;)V")
	public abstract void method5822(@OriginalArg(1) Class105 arg0);

	@OriginalMember(owner = "client!nc", name = "e", descriptor = "(I)Z")
	public abstract boolean method5824();

	@OriginalMember(owner = "client!nc", name = "a", descriptor = "(Lclient!ii;IIIILclient!nc;Z)V")
	public abstract void method5825(@OriginalArg(0) Class105 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) Class10 arg4, @OriginalArg(6) boolean arg5);

	@OriginalMember(owner = "client!nc", name = "a", descriptor = "(IIZLclient!ii;)Z")
	public abstract boolean method5826(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) Class105 arg2);
}
