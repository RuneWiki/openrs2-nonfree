import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ps")
public abstract class Class3 {

	@OriginalMember(owner = "client!ps", name = "a", descriptor = "(BLclient!qq;)Lclient!km;")
	public abstract Class48_Sub6 method5790(@OriginalArg(1) Class28 arg0);

	@OriginalMember(owner = "client!ps", name = "d", descriptor = "(I)Z")
	public abstract boolean method5791();

	@OriginalMember(owner = "client!ps", name = "b", descriptor = "(ZLclient!qq;)V")
	public abstract void method5792(@OriginalArg(1) Class28 arg0);

	@OriginalMember(owner = "client!ps", name = "a", descriptor = "(ILclient!qq;Lclient!ps;ZZII)V")
	public abstract void method5794(@OriginalArg(0) int arg0, @OriginalArg(1) Class28 arg1, @OriginalArg(2) Class3 arg2, @OriginalArg(3) boolean arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5);

	@OriginalMember(owner = "client!ps", name = "a", descriptor = "(Lclient!qq;BII)Z")
	public abstract boolean method5797(@OriginalArg(0) Class28 arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2);

	@OriginalMember(owner = "client!ps", name = "e", descriptor = "(I)V")
	public abstract void method5798();
}
