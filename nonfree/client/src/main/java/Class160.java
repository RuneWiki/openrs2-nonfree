import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hs")
public abstract class Class160 {

	@OriginalMember(owner = "client!hs", name = "b", descriptor = "Lclient!vf;")
	protected final Class100_Sub3 aClass100_Sub3_40;

	@OriginalMember(owner = "client!hs", name = "<init>", descriptor = "(Lclient!vf;)V")
	public Class160(@OriginalArg(0) Class100_Sub3 arg0) {
		this.aClass100_Sub3_40 = arg0;
	}

	@OriginalMember(owner = "client!hs", name = "a", descriptor = "(I)V")
	public abstract void method8061();

	@OriginalMember(owner = "client!hs", name = "a", descriptor = "(Z)Z")
	public abstract boolean method8062();

	@OriginalMember(owner = "client!hs", name = "b", descriptor = "(III)V")
	public abstract void method8063(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1);

	@OriginalMember(owner = "client!hs", name = "a", descriptor = "(IZ)V")
	public abstract void method8065(@OriginalArg(1) boolean arg0);

	@OriginalMember(owner = "client!hs", name = "a", descriptor = "(BZ)V")
	public abstract void method8066(@OriginalArg(1) boolean arg0);

	@OriginalMember(owner = "client!hs", name = "a", descriptor = "(Lclient!gb;II)V")
	public abstract void method8067(@OriginalArg(0) Class29 arg0, @OriginalArg(1) int arg1);
}
