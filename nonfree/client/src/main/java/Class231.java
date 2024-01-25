import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mk")
public abstract class Class231 {

	@OriginalMember(owner = "client!mk", name = "d", descriptor = "Lclient!ck;")
	protected final Class65_Sub1 aClass65_Sub1_41;

	@OriginalMember(owner = "client!mk", name = "<init>", descriptor = "(Lclient!ck;)V")
	public Class231(@OriginalArg(0) Class65_Sub1 arg0) {
		this.aClass65_Sub1_41 = arg0;
	}

	@OriginalMember(owner = "client!mk", name = "a", descriptor = "(Lclient!wj;II)V")
	public abstract void method8712(@OriginalArg(0) Class80 arg0, @OriginalArg(2) int arg1);

	@OriginalMember(owner = "client!mk", name = "a", descriptor = "(IZ)V")
	public abstract void method8713(@OriginalArg(1) boolean arg0);

	@OriginalMember(owner = "client!mk", name = "a", descriptor = "(B)Z")
	public abstract boolean method8714();

	@OriginalMember(owner = "client!mk", name = "a", descriptor = "(III)V")
	public abstract void method8715(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1);

	@OriginalMember(owner = "client!mk", name = "b", descriptor = "(B)V")
	public abstract void method8716();

	@OriginalMember(owner = "client!mk", name = "b", descriptor = "(IZ)V")
	public abstract void method8717(@OriginalArg(1) boolean arg0);
}
