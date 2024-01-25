import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!km")
public abstract class Class8 {

	@OriginalMember(owner = "client!km", name = "a", descriptor = "(Lclient!vq;ZLclient!km;IIBI)V")
	public abstract void method5621(@OriginalArg(0) Class47 arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) Class8 arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(6) int arg5);

	@OriginalMember(owner = "client!km", name = "d", descriptor = "(I)Z")
	public abstract boolean method5622();

	@OriginalMember(owner = "client!km", name = "a", descriptor = "(Lclient!vq;IIB)Z")
	public abstract boolean method5623(@OriginalArg(0) Class47 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2);

	@OriginalMember(owner = "client!km", name = "a", descriptor = "(BLclient!vq;)Lclient!bf;")
	public abstract Class2_Sub2 method5624(@OriginalArg(1) Class47 arg0);

	@OriginalMember(owner = "client!km", name = "c", descriptor = "(B)V")
	public abstract void method5625();

	@OriginalMember(owner = "client!km", name = "a", descriptor = "(Lclient!vq;B)V")
	public abstract void method5627(@OriginalArg(0) Class47 arg0);
}
