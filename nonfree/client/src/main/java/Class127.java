import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tfa")
public abstract class Class127 {

	@OriginalMember(owner = "client!tfa", name = "g", descriptor = "Lclient!kw;")
	protected final Class5_Sub2 aClass5_Sub2_42;

	@OriginalMember(owner = "client!tfa", name = "<init>", descriptor = "(Lclient!kw;)V")
	public Class127(@OriginalArg(0) Class5_Sub2 arg0) {
		this.aClass5_Sub2_42 = arg0;
	}

	@OriginalMember(owner = "client!tfa", name = "a", descriptor = "(ZII)V")
	public abstract void method8453(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1);

	@OriginalMember(owner = "client!tfa", name = "a", descriptor = "(B)V")
	public abstract void method8454();

	@OriginalMember(owner = "client!tfa", name = "a", descriptor = "(I)Z")
	public abstract boolean method8456();

	@OriginalMember(owner = "client!tfa", name = "a", descriptor = "(ZI)V")
	public abstract void method8457(@OriginalArg(0) boolean arg0);

	@OriginalMember(owner = "client!tfa", name = "b", descriptor = "(IZ)V")
	public abstract void method8458(@OriginalArg(1) boolean arg0);

	@OriginalMember(owner = "client!tfa", name = "a", descriptor = "(Lclient!ou;II)V")
	public abstract void method8460(@OriginalArg(0) Class76 arg0, @OriginalArg(2) int arg1);
}
