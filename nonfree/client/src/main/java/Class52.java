import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ef")
public abstract class Class52 {

	@OriginalMember(owner = "client!ef", name = "h", descriptor = "Lclient!pea;")
	protected final Class121_Sub3 aClass121_Sub3_43;

	@OriginalMember(owner = "client!ef", name = "<init>", descriptor = "(Lclient!pea;)V")
	public Class52(@OriginalArg(0) Class121_Sub3 arg0) {
		this.aClass121_Sub3_43 = arg0;
	}

	@OriginalMember(owner = "client!ef", name = "a", descriptor = "(I)V")
	public abstract void method7598();

	@OriginalMember(owner = "client!ef", name = "a", descriptor = "(IZI)V")
	public abstract void method7599(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1);

	@OriginalMember(owner = "client!ef", name = "a", descriptor = "(Z)Z")
	public abstract boolean method7601();

	@OriginalMember(owner = "client!ef", name = "a", descriptor = "(ZI)V")
	public abstract void method7603(@OriginalArg(0) boolean arg0);

	@OriginalMember(owner = "client!ef", name = "a", descriptor = "(BLclient!wq;I)V")
	public abstract void method7604(@OriginalArg(1) Class35 arg0, @OriginalArg(2) int arg1);

	@OriginalMember(owner = "client!ef", name = "a", descriptor = "(ZB)V")
	public abstract void method7605(@OriginalArg(0) boolean arg0);
}
