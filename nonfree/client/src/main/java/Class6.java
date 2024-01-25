import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bp")
public abstract class Class6 {

	@OriginalMember(owner = "client!bp", name = "a", descriptor = "Lclient!dw;")
	protected final Class82_Sub1 aClass82_Sub1_41;

	@OriginalMember(owner = "client!bp", name = "<init>", descriptor = "(Lclient!dw;)V")
	public Class6(@OriginalArg(0) Class82_Sub1 arg0) {
		this.aClass82_Sub1_41 = arg0;
	}

	@OriginalMember(owner = "client!bp", name = "a", descriptor = "(ZII)V")
	public abstract void method8024(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1);

	@OriginalMember(owner = "client!bp", name = "a", descriptor = "(Z)Z")
	public abstract boolean method8025();

	@OriginalMember(owner = "client!bp", name = "a", descriptor = "(BZ)V")
	public abstract void method8026(@OriginalArg(1) boolean arg0);

	@OriginalMember(owner = "client!bp", name = "a", descriptor = "(ZB)V")
	public abstract void method8028(@OriginalArg(0) boolean arg0);

	@OriginalMember(owner = "client!bp", name = "a", descriptor = "(Lclient!wu;II)V")
	public abstract void method8029(@OriginalArg(0) Class94 arg0, @OriginalArg(2) int arg1);

	@OriginalMember(owner = "client!bp", name = "b", descriptor = "(B)V")
	public abstract void method8031();
}
