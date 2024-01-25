import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wi")
public abstract class Class40 {

	@OriginalMember(owner = "client!wi", name = "c", descriptor = "Lclient!na;")
	protected final Class75_Sub2 aClass75_Sub2_41;

	@OriginalMember(owner = "client!wi", name = "<init>", descriptor = "(Lclient!na;)V")
	public Class40(@OriginalArg(0) Class75_Sub2 arg0) {
		this.aClass75_Sub2_41 = arg0;
	}

	@OriginalMember(owner = "client!wi", name = "a", descriptor = "(I)Z")
	public abstract boolean method5753();

	@OriginalMember(owner = "client!wi", name = "a", descriptor = "(ZB)V")
	public abstract void method5755(@OriginalArg(0) boolean arg0);

	@OriginalMember(owner = "client!wi", name = "c", descriptor = "(I)V")
	public abstract void method5757();

	@OriginalMember(owner = "client!wi", name = "b", descriptor = "(ZB)V")
	public abstract void method5758(@OriginalArg(0) boolean arg0);

	@OriginalMember(owner = "client!wi", name = "a", descriptor = "(IIB)V")
	public abstract void method5759(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1);

	@OriginalMember(owner = "client!wi", name = "a", descriptor = "(IILclient!ed;)V")
	public abstract void method5760(@OriginalArg(0) int arg0, @OriginalArg(2) Class64 arg1);
}
