import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!eha")
public abstract class Class18 {

	@OriginalMember(owner = "client!eha", name = "a", descriptor = "Lclient!ep;")
	protected final Class95_Sub1 aClass95_Sub1_39;

	@OriginalMember(owner = "client!eha", name = "<init>", descriptor = "(Lclient!ep;)V")
	public Class18(@OriginalArg(0) Class95_Sub1 arg0) {
		this.aClass95_Sub1_39 = arg0;
	}

	@OriginalMember(owner = "client!eha", name = "a", descriptor = "(B)Z")
	public abstract boolean method7544();

	@OriginalMember(owner = "client!eha", name = "a", descriptor = "(IBI)V")
	public abstract void method7545(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1);

	@OriginalMember(owner = "client!eha", name = "a", descriptor = "(IZLclient!hl;)V")
	public abstract void method7546(@OriginalArg(0) int arg0, @OriginalArg(2) Class65 arg1);

	@OriginalMember(owner = "client!eha", name = "a", descriptor = "(IZ)V")
	public abstract void method7550(@OriginalArg(1) boolean arg0);

	@OriginalMember(owner = "client!eha", name = "b", descriptor = "(B)V")
	public abstract void method7551();

	@OriginalMember(owner = "client!eha", name = "a", descriptor = "(ZI)V")
	public abstract void method7552(@OriginalArg(0) boolean arg0);
}
