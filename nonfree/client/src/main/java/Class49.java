import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lb")
public abstract class Class49 {

	@OriginalMember(owner = "client!lb", name = "e", descriptor = "(I)Z")
	public abstract boolean method7451();

	@OriginalMember(owner = "client!lb", name = "a", descriptor = "(IILclient!qa;I)Z")
	public abstract boolean method7452(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class122 arg2);

	@OriginalMember(owner = "client!lb", name = "a", descriptor = "(BLclient!qa;)Lclient!qba;")
	public abstract Class72_Sub7 method7453(@OriginalArg(1) Class122 arg0);

	@OriginalMember(owner = "client!lb", name = "b", descriptor = "(Lclient!qa;I)V")
	public abstract void method7455(@OriginalArg(0) Class122 arg0);

	@OriginalMember(owner = "client!lb", name = "a", descriptor = "(IIILclient!qa;IZLclient!lb;)V")
	public abstract void method7456(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Class122 arg2, @OriginalArg(4) int arg3, @OriginalArg(5) boolean arg4, @OriginalArg(6) Class49 arg5);

	@OriginalMember(owner = "client!lb", name = "b", descriptor = "(B)V")
	public abstract void method7457();

	@OriginalMember(owner = "client!lb", name = "b", descriptor = "(ILclient!qa;)Lclient!ud;")
	public abstract Class291 method7460(@OriginalArg(1) Class122 arg0);
}
