import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ue")
public abstract class Class22 {

	@OriginalMember(owner = "client!ue", name = "b", descriptor = "Lclient!vd;")
	protected final Class51_Sub2 aClass51_Sub2_33;

	@OriginalMember(owner = "client!ue", name = "<init>", descriptor = "(Lclient!vd;)V")
	public Class22(@OriginalArg(0) Class51_Sub2 arg0) {
		this.aClass51_Sub2_33 = arg0;
	}

	@OriginalMember(owner = "client!ue", name = "a", descriptor = "(ZI)V")
	public abstract void method4099(@OriginalArg(0) boolean arg0);

	@OriginalMember(owner = "client!ue", name = "a", descriptor = "(ZLclient!ew;I)V")
	public abstract void method4100(@OriginalArg(1) Class59 arg0, @OriginalArg(2) int arg1);

	@OriginalMember(owner = "client!ue", name = "a", descriptor = "(ZZ)V")
	public abstract void method4101(@OriginalArg(0) boolean arg0);

	@OriginalMember(owner = "client!ue", name = "a", descriptor = "(I)V")
	public abstract void method4103();

	@OriginalMember(owner = "client!ue", name = "a", descriptor = "(III)V")
	public abstract void method4104(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1);

	@OriginalMember(owner = "client!ue", name = "a", descriptor = "(B)Z")
	public abstract boolean method4106();
}
