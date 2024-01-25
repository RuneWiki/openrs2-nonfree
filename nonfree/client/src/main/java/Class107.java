import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ffa")
public abstract class Class107 {

	@OriginalMember(owner = "client!ffa", name = "c", descriptor = "Lclient!oea;")
	protected final Class87_Sub2 aClass87_Sub2_37;

	@OriginalMember(owner = "client!ffa", name = "<init>", descriptor = "(Lclient!oea;)V")
	public Class107(@OriginalArg(0) Class87_Sub2 arg0) {
		this.aClass87_Sub2_37 = arg0;
	}

	@OriginalMember(owner = "client!ffa", name = "a", descriptor = "(Lclient!iia;ZI)V")
	public abstract void method7695(@OriginalArg(0) Class88 arg0, @OriginalArg(2) int arg1);

	@OriginalMember(owner = "client!ffa", name = "a", descriptor = "(I)Z")
	public abstract boolean method7696();

	@OriginalMember(owner = "client!ffa", name = "a", descriptor = "(ZI)V")
	public abstract void method7697(@OriginalArg(0) boolean arg0);

	@OriginalMember(owner = "client!ffa", name = "a", descriptor = "(Z)V")
	public abstract void method7698();

	@OriginalMember(owner = "client!ffa", name = "a", descriptor = "(IIZ)V")
	public abstract void method7700(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1);

	@OriginalMember(owner = "client!ffa", name = "a", descriptor = "(IZ)V")
	public abstract void method7702(@OriginalArg(1) boolean arg0);
}
