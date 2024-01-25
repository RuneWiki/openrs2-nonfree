import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!od")
public abstract class Class33 {

	@OriginalMember(owner = "client!od", name = "a", descriptor = "Lclient!qfa;")
	protected final Class137_Sub3 aClass137_Sub3_42;

	@OriginalMember(owner = "client!od", name = "<init>", descriptor = "(Lclient!qfa;)V")
	public Class33(@OriginalArg(0) Class137_Sub3 arg0) {
		this.aClass137_Sub3_42 = arg0;
	}

	@OriginalMember(owner = "client!od", name = "a", descriptor = "(I)Z")
	public abstract boolean method8846();

	@OriginalMember(owner = "client!od", name = "a", descriptor = "(ZI)V")
	public abstract void method8847(@OriginalArg(0) boolean arg0);

	@OriginalMember(owner = "client!od", name = "b", descriptor = "(I)V")
	public abstract void method8848();

	@OriginalMember(owner = "client!od", name = "a", descriptor = "(BII)V")
	public abstract void method8849(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1);

	@OriginalMember(owner = "client!od", name = "a", descriptor = "(IZLclient!dca;)V")
	public abstract void method8851(@OriginalArg(0) int arg0, @OriginalArg(2) Class66 arg1);

	@OriginalMember(owner = "client!od", name = "b", descriptor = "(ZI)V")
	public abstract void method8854(@OriginalArg(0) boolean arg0);
}
