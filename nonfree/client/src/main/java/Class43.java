import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ov")
public abstract class Class43 {

	@OriginalMember(owner = "client!ov", name = "b", descriptor = "Lclient!gia;")
	protected final Class67_Sub2 aClass67_Sub2_41;

	@OriginalMember(owner = "client!ov", name = "<init>", descriptor = "(Lclient!gia;)V")
	public Class43(@OriginalArg(0) Class67_Sub2 arg0) {
		this.aClass67_Sub2_41 = arg0;
	}

	@OriginalMember(owner = "client!ov", name = "a", descriptor = "(IZ)V")
	public abstract void method8858(@OriginalArg(1) boolean arg0);

	@OriginalMember(owner = "client!ov", name = "a", descriptor = "(I)Z")
	public abstract boolean method8859();

	@OriginalMember(owner = "client!ov", name = "a", descriptor = "(III)V")
	public abstract void method8860(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1);

	@OriginalMember(owner = "client!ov", name = "a", descriptor = "(ZI)V")
	public abstract void method8863(@OriginalArg(0) boolean arg0);

	@OriginalMember(owner = "client!ov", name = "a", descriptor = "(ILclient!sga;I)V")
	public abstract void method8865(@OriginalArg(0) int arg0, @OriginalArg(1) Class245 arg1);

	@OriginalMember(owner = "client!ov", name = "b", descriptor = "(I)V")
	public abstract void method8866();
}
