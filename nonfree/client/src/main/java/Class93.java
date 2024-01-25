import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fq")
public abstract class Class93 {

	@OriginalMember(owner = "client!fq", name = "e", descriptor = "Lclient!os;")
	protected final Class39_Sub3 aClass39_Sub3_40;

	@OriginalMember(owner = "client!fq", name = "<init>", descriptor = "(Lclient!os;)V")
	public Class93(@OriginalArg(0) Class39_Sub3 arg0) {
		this.aClass39_Sub3_40 = arg0;
	}

	@OriginalMember(owner = "client!fq", name = "a", descriptor = "(ZB)V")
	public abstract void method7489(@OriginalArg(0) boolean arg0);

	@OriginalMember(owner = "client!fq", name = "a", descriptor = "(B)Z")
	public abstract boolean method7490();

	@OriginalMember(owner = "client!fq", name = "a", descriptor = "(BZ)V")
	public abstract void method7493(@OriginalArg(1) boolean arg0);

	@OriginalMember(owner = "client!fq", name = "a", descriptor = "(I)V")
	public abstract void method7494();

	@OriginalMember(owner = "client!fq", name = "a", descriptor = "(Lclient!baa;IB)V")
	public abstract void method7495(@OriginalArg(0) Class19 arg0, @OriginalArg(1) int arg1);

	@OriginalMember(owner = "client!fq", name = "a", descriptor = "(IBI)V")
	public abstract void method7496(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1);
}
