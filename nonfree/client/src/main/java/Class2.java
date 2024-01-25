import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ps")
public abstract class Class2 {

	@OriginalMember(owner = "client!ps", name = "a", descriptor = "(Lclient!za;III)Z")
	public abstract boolean method6019(@OriginalArg(0) Class200 arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2);

	@OriginalMember(owner = "client!ps", name = "a", descriptor = "(ILclient!za;)V")
	public abstract void method6021(@OriginalArg(1) Class200 arg0);

	@OriginalMember(owner = "client!ps", name = "d", descriptor = "(I)V")
	public abstract void method6022();

	@OriginalMember(owner = "client!ps", name = "a", descriptor = "(Lclient!za;IIILclient!ps;IZ)V")
	public abstract void method6023(@OriginalArg(0) Class200 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) Class2 arg3, @OriginalArg(5) int arg4, @OriginalArg(6) boolean arg5);

	@OriginalMember(owner = "client!ps", name = "c", descriptor = "(B)Z")
	public abstract boolean method6024();

	@OriginalMember(owner = "client!ps", name = "b", descriptor = "(ILclient!za;)Lclient!hp;")
	public abstract Class88_Sub2 method6025(@OriginalArg(1) Class200 arg0);
}
