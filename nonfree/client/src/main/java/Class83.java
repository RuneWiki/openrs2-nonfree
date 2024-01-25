import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tb")
public abstract class Class83 {

	@OriginalMember(owner = "client!tb", name = "a", descriptor = "Lclient!mh;")
	protected final Class4_Sub3 aClass4_Sub3_41;

	@OriginalMember(owner = "client!tb", name = "<init>", descriptor = "(Lclient!mh;)V")
	public Class83(@OriginalArg(0) Class4_Sub3 arg0) {
		this.aClass4_Sub3_41 = arg0;
	}

	@OriginalMember(owner = "client!tb", name = "a", descriptor = "(IBLclient!uu;)V")
	public abstract void method7922(@OriginalArg(0) int arg0, @OriginalArg(2) Class164 arg1);

	@OriginalMember(owner = "client!tb", name = "a", descriptor = "(BZ)V")
	public abstract void method7924(@OriginalArg(1) boolean arg0);

	@OriginalMember(owner = "client!tb", name = "a", descriptor = "(B)V")
	public abstract void method7925();

	@OriginalMember(owner = "client!tb", name = "a", descriptor = "(ZII)V")
	public abstract void method7926(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1);

	@OriginalMember(owner = "client!tb", name = "a", descriptor = "(ZI)V")
	public abstract void method7927(@OriginalArg(0) boolean arg0);

	@OriginalMember(owner = "client!tb", name = "b", descriptor = "(B)Z")
	public abstract boolean method7930();
}
