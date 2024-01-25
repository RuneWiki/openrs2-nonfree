import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!uc")
public abstract class Class101 {

	@OriginalMember(owner = "client!uc", name = "h", descriptor = "Lclient!qj;")
	protected final Class100_Sub3 aClass100_Sub3_43;

	@OriginalMember(owner = "client!uc", name = "<init>", descriptor = "(Lclient!qj;)V")
	public Class101(@OriginalArg(0) Class100_Sub3 arg0) {
		this.aClass100_Sub3_43 = arg0;
	}

	@OriginalMember(owner = "client!uc", name = "a", descriptor = "(IILclient!rg;)V")
	public abstract void method7834(@OriginalArg(0) int arg0, @OriginalArg(2) Class23 arg1);

	@OriginalMember(owner = "client!uc", name = "a", descriptor = "(I)V")
	public abstract void method7835();

	@OriginalMember(owner = "client!uc", name = "a", descriptor = "(B)Z")
	public abstract boolean method7836();

	@OriginalMember(owner = "client!uc", name = "a", descriptor = "(IZ)V")
	public abstract void method7839(@OriginalArg(1) boolean arg0);

	@OriginalMember(owner = "client!uc", name = "a", descriptor = "(III)V")
	public abstract void method7840(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1);

	@OriginalMember(owner = "client!uc", name = "b", descriptor = "(IZ)V")
	public abstract void method7841(@OriginalArg(1) boolean arg0);
}
