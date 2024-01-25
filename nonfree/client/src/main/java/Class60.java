import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jg")
public abstract class Class60 {

	@OriginalMember(owner = "client!jg", name = "a", descriptor = "Lclient!us;")
	protected final Class43_Sub3 aClass43_Sub3_43;

	@OriginalMember(owner = "client!jg", name = "<init>", descriptor = "(Lclient!us;)V")
	public Class60(@OriginalArg(0) Class43_Sub3 arg0) {
		this.aClass43_Sub3_43 = arg0;
	}

	@OriginalMember(owner = "client!jg", name = "a", descriptor = "(IIB)V")
	public abstract void method7729(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1);

	@OriginalMember(owner = "client!jg", name = "a", descriptor = "(ZZ)V")
	public abstract void method7730(@OriginalArg(0) boolean arg0);

	@OriginalMember(owner = "client!jg", name = "a", descriptor = "(I)V")
	public abstract void method7732();

	@OriginalMember(owner = "client!jg", name = "a", descriptor = "(ZI)V")
	public abstract void method7733(@OriginalArg(0) boolean arg0);

	@OriginalMember(owner = "client!jg", name = "a", descriptor = "(B)Z")
	public abstract boolean method7735();

	@OriginalMember(owner = "client!jg", name = "a", descriptor = "(IBLclient!um;)V")
	public abstract void method7737(@OriginalArg(0) int arg0, @OriginalArg(2) Class34 arg1);
}
