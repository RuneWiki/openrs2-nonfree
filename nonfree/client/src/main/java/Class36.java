import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gr")
public abstract class Class36 {

	@OriginalMember(owner = "client!gr", name = "c", descriptor = "Lclient!bo;")
	protected final Class26_Sub1 aClass26_Sub1_43;

	@OriginalMember(owner = "client!gr", name = "<init>", descriptor = "(Lclient!bo;)V")
	public Class36(@OriginalArg(0) Class26_Sub1 arg0) {
		this.aClass26_Sub1_43 = arg0;
	}

	@OriginalMember(owner = "client!gr", name = "a", descriptor = "(ZII)V")
	public abstract void method6007(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1);

	@OriginalMember(owner = "client!gr", name = "a", descriptor = "(Lclient!nk;II)V")
	public abstract void method6008(@OriginalArg(0) Class65 arg0, @OriginalArg(2) int arg1);

	@OriginalMember(owner = "client!gr", name = "a", descriptor = "(Z)Z")
	public abstract boolean method6010();

	@OriginalMember(owner = "client!gr", name = "a", descriptor = "(IZ)V")
	public abstract void method6011(@OriginalArg(1) boolean arg0);

	@OriginalMember(owner = "client!gr", name = "a", descriptor = "(I)V")
	public abstract void method6012();

	@OriginalMember(owner = "client!gr", name = "a", descriptor = "(ZI)V")
	public abstract void method6015(@OriginalArg(0) boolean arg0);
}
