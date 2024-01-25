import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dda")
public abstract class Class44 {

	@OriginalMember(owner = "client!dda", name = "b", descriptor = "Lclient!pc;")
	protected final Class33_Sub3 aClass33_Sub3_34;

	@OriginalMember(owner = "client!dda", name = "<init>", descriptor = "(Lclient!pc;)V")
	public Class44(@OriginalArg(0) Class33_Sub3 arg0) {
		this.aClass33_Sub3_34 = arg0;
	}

	@OriginalMember(owner = "client!dda", name = "a", descriptor = "(B)Z")
	public abstract boolean method7666();

	@OriginalMember(owner = "client!dda", name = "a", descriptor = "(IBLclient!fha;)V")
	public abstract void method7667(@OriginalArg(0) int arg0, @OriginalArg(2) Class116 arg1);

	@OriginalMember(owner = "client!dda", name = "a", descriptor = "(III)V")
	public abstract void method7668(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1);

	@OriginalMember(owner = "client!dda", name = "b", descriptor = "(IZ)V")
	public abstract void method7670(@OriginalArg(1) boolean arg0);

	@OriginalMember(owner = "client!dda", name = "c", descriptor = "(IZ)V")
	public abstract void method7671(@OriginalArg(1) boolean arg0);

	@OriginalMember(owner = "client!dda", name = "a", descriptor = "(I)V")
	public abstract void method7672();
}
