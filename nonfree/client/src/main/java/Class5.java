import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!km")
public abstract class Class5 {

	@OriginalMember(owner = "client!km", name = "b", descriptor = "(B)Z")
	public abstract boolean method5327();

	@OriginalMember(owner = "client!km", name = "e", descriptor = "(I)V")
	public abstract void method5328();

	@OriginalMember(owner = "client!km", name = "a", descriptor = "(Lclient!tj;I)Lclient!ri;")
	public abstract Class8_Sub7 method5329(@OriginalArg(0) Class122 arg0);

	@OriginalMember(owner = "client!km", name = "a", descriptor = "(ILclient!tj;II)Z")
	public abstract boolean method5330(@OriginalArg(0) int arg0, @OriginalArg(1) Class122 arg1, @OriginalArg(2) int arg2);

	@OriginalMember(owner = "client!km", name = "a", descriptor = "(BLclient!tj;)V")
	public abstract void method5331(@OriginalArg(1) Class122 arg0);

	@OriginalMember(owner = "client!km", name = "a", descriptor = "(ILclient!tj;BIZLclient!km;I)V")
	public abstract void method5333(@OriginalArg(0) int arg0, @OriginalArg(1) Class122 arg1, @OriginalArg(3) int arg2, @OriginalArg(4) boolean arg3, @OriginalArg(5) Class5 arg4, @OriginalArg(6) int arg5);
}
