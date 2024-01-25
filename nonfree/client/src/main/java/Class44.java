import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!iq")
public abstract class Class44 {

	@OriginalMember(owner = "client!iq", name = "d", descriptor = "Lclient!jj;")
	protected final Class62_Sub3 aClass62_Sub3_43;

	@OriginalMember(owner = "client!iq", name = "<init>", descriptor = "(Lclient!jj;)V")
	public Class44(@OriginalArg(0) Class62_Sub3 arg0) {
		this.aClass62_Sub3_43 = arg0;
	}

	@OriginalMember(owner = "client!iq", name = "a", descriptor = "(ZB)V")
	public abstract void method7274(@OriginalArg(0) boolean arg0);

	@OriginalMember(owner = "client!iq", name = "a", descriptor = "(ILclient!aba;I)V")
	public abstract void method7275(@OriginalArg(0) int arg0, @OriginalArg(1) Class4 arg1);

	@OriginalMember(owner = "client!iq", name = "a", descriptor = "(ZI)V")
	public abstract void method7277(@OriginalArg(0) boolean arg0);

	@OriginalMember(owner = "client!iq", name = "a", descriptor = "(III)V")
	public abstract void method7278(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1);

	@OriginalMember(owner = "client!iq", name = "a", descriptor = "(B)V")
	public abstract void method7280();

	@OriginalMember(owner = "client!iq", name = "b", descriptor = "(I)Z")
	public abstract boolean method7281();
}
