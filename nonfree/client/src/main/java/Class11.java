import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ef")
public abstract class Class11 {

	@OriginalMember(owner = "client!ef", name = "b", descriptor = "Lclient!pq;")
	protected final Class132_Sub3 aClass132_Sub3_43;

	@OriginalMember(owner = "client!ef", name = "<init>", descriptor = "(Lclient!pq;)V")
	public Class11(@OriginalArg(0) Class132_Sub3 arg0) {
		this.aClass132_Sub3_43 = arg0;
	}

	@OriginalMember(owner = "client!ef", name = "a", descriptor = "(I)V")
	public abstract void method8982();

	@OriginalMember(owner = "client!ef", name = "a", descriptor = "(IZLclient!wha;)V")
	public abstract void method8983(@OriginalArg(0) int arg0, @OriginalArg(2) Class53 arg1);

	@OriginalMember(owner = "client!ef", name = "a", descriptor = "(BZ)V")
	public abstract void method8984(@OriginalArg(1) boolean arg0);

	@OriginalMember(owner = "client!ef", name = "a", descriptor = "(IIZ)V")
	public abstract void method8987(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1);

	@OriginalMember(owner = "client!ef", name = "a", descriptor = "(ZB)V")
	public abstract void method8989(@OriginalArg(0) boolean arg0);

	@OriginalMember(owner = "client!ef", name = "b", descriptor = "(I)Z")
	public abstract boolean method8991();
}
