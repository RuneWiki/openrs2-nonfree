import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wk")
public abstract class Class69 {

	@OriginalMember(owner = "client!wk", name = "f", descriptor = "Lclient!ml;")
	protected final Class75_Sub3 aClass75_Sub3_41;

	@OriginalMember(owner = "client!wk", name = "<init>", descriptor = "(Lclient!ml;)V")
	public Class69(@OriginalArg(0) Class75_Sub3 arg0) {
		this.aClass75_Sub3_41 = arg0;
	}

	@OriginalMember(owner = "client!wk", name = "a", descriptor = "(IZLclient!ica;)V")
	public abstract void method8631(@OriginalArg(0) int arg0, @OriginalArg(2) Class44 arg1);

	@OriginalMember(owner = "client!wk", name = "a", descriptor = "(ZB)V")
	public abstract void method8632(@OriginalArg(0) boolean arg0);

	@OriginalMember(owner = "client!wk", name = "a", descriptor = "(ZII)V")
	public abstract void method8634(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1);

	@OriginalMember(owner = "client!wk", name = "a", descriptor = "(ZI)V")
	public abstract void method8635(@OriginalArg(0) boolean arg0);

	@OriginalMember(owner = "client!wk", name = "a", descriptor = "(Z)Z")
	public abstract boolean method8637();

	@OriginalMember(owner = "client!wk", name = "a", descriptor = "(I)V")
	public abstract void method8638();
}
