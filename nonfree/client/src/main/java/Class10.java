import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ni")
public abstract class Class10 {

	@OriginalMember(owner = "client!ni", name = "a", descriptor = "(BLclient!oa;)Lclient!pe;")
	public abstract Class26_Sub6 method7727(@OriginalArg(1) Class66 arg0);

	@OriginalMember(owner = "client!ni", name = "a", descriptor = "(BILclient!oa;I)Z")
	public abstract boolean method7728(@OriginalArg(1) int arg0, @OriginalArg(2) Class66 arg1, @OriginalArg(3) int arg2);

	@OriginalMember(owner = "client!ni", name = "a", descriptor = "(Lclient!oa;Z)V")
	public abstract void method7729(@OriginalArg(0) Class66 arg0);

	@OriginalMember(owner = "client!ni", name = "a", descriptor = "(I)Z")
	public abstract boolean method7730();

	@OriginalMember(owner = "client!ni", name = "a", descriptor = "(ILclient!oa;)Lclient!dd;")
	public abstract Class68 method7731(@OriginalArg(1) Class66 arg0);

	@OriginalMember(owner = "client!ni", name = "a", descriptor = "(ILclient!oa;ILclient!ni;ZZI)V")
	public abstract void method7732(@OriginalArg(0) int arg0, @OriginalArg(1) Class66 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) Class10 arg3, @OriginalArg(4) boolean arg4, @OriginalArg(6) int arg5);

	@OriginalMember(owner = "client!ni", name = "c", descriptor = "(B)V")
	public abstract void method7733();
}
