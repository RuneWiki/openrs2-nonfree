import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ov")
public abstract class Class38 {

	@OriginalMember(owner = "client!ov", name = "d", descriptor = "Lclient!ur;")
	protected final Class34_Sub2 aClass34_Sub2_41;

	@OriginalMember(owner = "client!ov", name = "<init>", descriptor = "(Lclient!ur;)V")
	public Class38(@OriginalArg(0) Class34_Sub2 arg0) {
		this.aClass34_Sub2_41 = arg0;
	}

	@OriginalMember(owner = "client!ov", name = "a", descriptor = "(ZI)V")
	public abstract void method5820(@OriginalArg(0) boolean arg0);

	@OriginalMember(owner = "client!ov", name = "a", descriptor = "(ILclient!he;I)V")
	public abstract void method5821(@OriginalArg(1) Class10 arg0, @OriginalArg(2) int arg1);

	@OriginalMember(owner = "client!ov", name = "a", descriptor = "(I)Z")
	public abstract boolean method5823();

	@OriginalMember(owner = "client!ov", name = "b", descriptor = "(I)V")
	public abstract void method5824();

	@OriginalMember(owner = "client!ov", name = "b", descriptor = "(ZI)V")
	public abstract void method5825(@OriginalArg(0) boolean arg0);

	@OriginalMember(owner = "client!ov", name = "a", descriptor = "(III)V")
	public abstract void method5827(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1);
}
