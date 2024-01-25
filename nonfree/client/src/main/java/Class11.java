import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cca")
public abstract class Class11 {

	@OriginalMember(owner = "client!cca", name = "c", descriptor = "Lclient!wh;")
	protected final Class100_Sub3 aClass100_Sub3_41;

	@OriginalMember(owner = "client!cca", name = "<init>", descriptor = "(Lclient!wh;)V")
	public Class11(@OriginalArg(0) Class100_Sub3 arg0) {
		this.aClass100_Sub3_41 = arg0;
	}

	@OriginalMember(owner = "client!cca", name = "a", descriptor = "(III)V")
	public abstract void method8723(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1);

	@OriginalMember(owner = "client!cca", name = "a", descriptor = "(ZZ)V")
	public abstract void method8724(@OriginalArg(1) boolean arg0);

	@OriginalMember(owner = "client!cca", name = "a", descriptor = "(I)Z")
	public abstract boolean method8725();

	@OriginalMember(owner = "client!cca", name = "a", descriptor = "(Lclient!me;ZI)V")
	public abstract void method8726(@OriginalArg(0) Class3 arg0, @OriginalArg(2) int arg1);

	@OriginalMember(owner = "client!cca", name = "b", descriptor = "(I)V")
	public abstract void method8727();

	@OriginalMember(owner = "client!cca", name = "a", descriptor = "(IZ)V")
	public abstract void method8728(@OriginalArg(1) boolean arg0);
}
