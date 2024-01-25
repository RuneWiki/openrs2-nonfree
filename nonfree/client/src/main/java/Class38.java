import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vaa")
public abstract class Class38 {

	@OriginalMember(owner = "client!vaa", name = "b", descriptor = "Lclient!dia;")
	protected final Class13_Sub2 aClass13_Sub2_39;

	@OriginalMember(owner = "client!vaa", name = "<init>", descriptor = "(Lclient!dia;)V")
	public Class38(@OriginalArg(0) Class13_Sub2 arg0) {
		this.aClass13_Sub2_39 = arg0;
	}

	@OriginalMember(owner = "client!vaa", name = "a", descriptor = "(ILclient!il;I)V")
	public abstract void method7810(@OriginalArg(1) Class85 arg0, @OriginalArg(2) int arg1);

	@OriginalMember(owner = "client!vaa", name = "b", descriptor = "(ZZ)V")
	public abstract void method7812(@OriginalArg(0) boolean arg0);

	@OriginalMember(owner = "client!vaa", name = "a", descriptor = "(IZ)V")
	public abstract void method7813(@OriginalArg(1) boolean arg0);

	@OriginalMember(owner = "client!vaa", name = "a", descriptor = "(III)V")
	public abstract void method7814(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1);

	@OriginalMember(owner = "client!vaa", name = "b", descriptor = "(I)Z")
	public abstract boolean method7818();

	@OriginalMember(owner = "client!vaa", name = "c", descriptor = "(I)V")
	public abstract void method7819();
}
