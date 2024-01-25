import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!baa")
public abstract class Class22 {

	@OriginalMember(owner = "client!baa", name = "h", descriptor = "Lclient!lf;")
	protected final Class95_Sub3 aClass95_Sub3_37;

	@OriginalMember(owner = "client!baa", name = "<init>", descriptor = "(Lclient!lf;)V")
	public Class22(@OriginalArg(0) Class95_Sub3 arg0) {
		this.aClass95_Sub3_37 = arg0;
	}

	@OriginalMember(owner = "client!baa", name = "a", descriptor = "(ZZ)V")
	public abstract void method6978(@OriginalArg(0) boolean arg0);

	@OriginalMember(owner = "client!baa", name = "a", descriptor = "(Lclient!ru;II)V")
	public abstract void method6979(@OriginalArg(0) Class10 arg0, @OriginalArg(2) int arg1);

	@OriginalMember(owner = "client!baa", name = "a", descriptor = "(I)V")
	public abstract void method6980();

	@OriginalMember(owner = "client!baa", name = "a", descriptor = "(Z)Z")
	public abstract boolean method6982();

	@OriginalMember(owner = "client!baa", name = "a", descriptor = "(ZI)V")
	public abstract void method6984(@OriginalArg(0) boolean arg0);

	@OriginalMember(owner = "client!baa", name = "a", descriptor = "(III)V")
	public abstract void method6985(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1);
}
