import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ng")
public abstract class Class59 {

	@OriginalMember(owner = "client!ng", name = "a", descriptor = "Lclient!bi;")
	protected final Class13_Sub2 aClass13_Sub2_43;

	@OriginalMember(owner = "client!ng", name = "<init>", descriptor = "(Lclient!bi;)V")
	public Class59(@OriginalArg(0) Class13_Sub2 arg0) {
		this.aClass13_Sub2_43 = arg0;
	}

	@OriginalMember(owner = "client!ng", name = "a", descriptor = "(IILclient!cj;)V")
	public abstract void method8587(@OriginalArg(1) int arg0, @OriginalArg(2) Class10 arg1);

	@OriginalMember(owner = "client!ng", name = "a", descriptor = "(I)Z")
	public abstract boolean method8588();

	@OriginalMember(owner = "client!ng", name = "a", descriptor = "(ZII)V")
	public abstract void method8589(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1);

	@OriginalMember(owner = "client!ng", name = "a", descriptor = "(B)V")
	public abstract void method8590();

	@OriginalMember(owner = "client!ng", name = "a", descriptor = "(ZI)V")
	public abstract void method8591(@OriginalArg(0) boolean arg0);

	@OriginalMember(owner = "client!ng", name = "a", descriptor = "(ZB)V")
	public abstract void method8593(@OriginalArg(0) boolean arg0);
}
