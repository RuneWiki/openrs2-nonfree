import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!eb")
public abstract class Class46 {

	@OriginalMember(owner = "client!eb", name = "c", descriptor = "Lclient!vj;")
	protected final Class45_Sub3 aClass45_Sub3_40;

	@OriginalMember(owner = "client!eb", name = "<init>", descriptor = "(Lclient!vj;)V")
	public Class46(@OriginalArg(0) Class45_Sub3 arg0) {
		this.aClass45_Sub3_40 = arg0;
	}

	@OriginalMember(owner = "client!eb", name = "a", descriptor = "(BZ)V")
	public abstract void method7200(@OriginalArg(1) boolean arg0);

	@OriginalMember(owner = "client!eb", name = "a", descriptor = "(III)V")
	public abstract void method7202(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1);

	@OriginalMember(owner = "client!eb", name = "c", descriptor = "(I)V")
	public abstract void method7205();

	@OriginalMember(owner = "client!eb", name = "a", descriptor = "(ZI)V")
	public abstract void method7206(@OriginalArg(0) boolean arg0);

	@OriginalMember(owner = "client!eb", name = "a", descriptor = "(B)Z")
	public abstract boolean method7207();

	@OriginalMember(owner = "client!eb", name = "a", descriptor = "(IILclient!av;)V")
	public abstract void method7208(@OriginalArg(1) int arg0, @OriginalArg(2) Class24 arg1);
}
