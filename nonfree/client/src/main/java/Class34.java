import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!es")
public abstract class Class34 {

	@OriginalMember(owner = "client!es", name = "b", descriptor = "Lclient!rda;")
	protected final Class126_Sub3 aClass126_Sub3_39;

	@OriginalMember(owner = "client!es", name = "<init>", descriptor = "(Lclient!rda;)V")
	public Class34(@OriginalArg(0) Class126_Sub3 arg0) {
		this.aClass126_Sub3_39 = arg0;
	}

	@OriginalMember(owner = "client!es", name = "a", descriptor = "(Z)V")
	public abstract void method8516();

	@OriginalMember(owner = "client!es", name = "a", descriptor = "(BZ)V")
	public abstract void method8518(@OriginalArg(1) boolean arg0);

	@OriginalMember(owner = "client!es", name = "a", descriptor = "(I)Z")
	public abstract boolean method8519();

	@OriginalMember(owner = "client!es", name = "a", descriptor = "(III)V")
	public abstract void method8520(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1);

	@OriginalMember(owner = "client!es", name = "a", descriptor = "(ZB)V")
	public abstract void method8521(@OriginalArg(0) boolean arg0);

	@OriginalMember(owner = "client!es", name = "a", descriptor = "(BILclient!iga;)V")
	public abstract void method8522(@OriginalArg(1) int arg0, @OriginalArg(2) Class24 arg1);
}
