import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!oj")
public abstract class Class75 {

	@OriginalMember(owner = "client!oj", name = "b", descriptor = "Lclient!ji;")
	protected final Class15_Sub3 aClass15_Sub3_42;

	@OriginalMember(owner = "client!oj", name = "<init>", descriptor = "(Lclient!ji;)V")
	public Class75(@OriginalArg(0) Class15_Sub3 arg0) {
		this.aClass15_Sub3_42 = arg0;
	}

	@OriginalMember(owner = "client!oj", name = "a", descriptor = "(IILclient!gq;)V")
	public abstract void method8289(@OriginalArg(0) int arg0, @OriginalArg(2) Class11 arg1);

	@OriginalMember(owner = "client!oj", name = "a", descriptor = "(I)V")
	public abstract void method8290();

	@OriginalMember(owner = "client!oj", name = "a", descriptor = "(IZ)V")
	public abstract void method8293(@OriginalArg(1) boolean arg0);

	@OriginalMember(owner = "client!oj", name = "a", descriptor = "(ZII)V")
	public abstract void method8294(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1);

	@OriginalMember(owner = "client!oj", name = "b", descriptor = "(B)Z")
	public abstract boolean method8295();

	@OriginalMember(owner = "client!oj", name = "a", descriptor = "(ZB)V")
	public abstract void method8296(@OriginalArg(0) boolean arg0);
}
