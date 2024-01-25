import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qk")
public abstract class Class104 {

	@OriginalMember(owner = "client!qk", name = "a", descriptor = "Lclient!ap;")
	protected final Class9_Sub2 aClass9_Sub2_40;

	@OriginalMember(owner = "client!qk", name = "<init>", descriptor = "(Lclient!ap;)V")
	public Class104(@OriginalArg(0) Class9_Sub2 arg0) {
		this.aClass9_Sub2_40 = arg0;
	}

	@OriginalMember(owner = "client!qk", name = "a", descriptor = "(I)Z")
	public abstract boolean method7865();

	@OriginalMember(owner = "client!qk", name = "a", descriptor = "(IIZ)V")
	public abstract void method7866(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1);

	@OriginalMember(owner = "client!qk", name = "a", descriptor = "(ZB)V")
	public abstract void method7867(@OriginalArg(0) boolean arg0);

	@OriginalMember(owner = "client!qk", name = "a", descriptor = "(B)V")
	public abstract void method7868();

	@OriginalMember(owner = "client!qk", name = "a", descriptor = "(BZ)V")
	public abstract void method7871(@OriginalArg(1) boolean arg0);

	@OriginalMember(owner = "client!qk", name = "a", descriptor = "(IILclient!uda;)V")
	public abstract void method7872(@OriginalArg(0) int arg0, @OriginalArg(2) Class132 arg1);
}
