import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ha")
public abstract class Class87 {

	@OriginalMember(owner = "client!ha", name = "a", descriptor = "Lclient!ql;")
	protected final Class92_Sub2 aClass92_Sub2_40;

	@OriginalMember(owner = "client!ha", name = "<init>", descriptor = "(Lclient!ql;)V")
	public Class87(@OriginalArg(0) Class92_Sub2 arg0) {
		this.aClass92_Sub2_40 = arg0;
	}

	@OriginalMember(owner = "client!ha", name = "a", descriptor = "()V")
	public abstract void method5651();

	@OriginalMember(owner = "client!ha", name = "a", descriptor = "(Z)V")
	public abstract void method5652(@OriginalArg(0) boolean arg0);

	@OriginalMember(owner = "client!ha", name = "b", descriptor = "(Z)V")
	public abstract void method5653(@OriginalArg(0) boolean arg0);

	@OriginalMember(owner = "client!ha", name = "a", descriptor = "(Lclient!na;)V")
	public abstract void method5654(@OriginalArg(0) Class70 arg0);

	@OriginalMember(owner = "client!ha", name = "a", descriptor = "(I)V")
	public abstract void method5655(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!ha", name = "b", descriptor = "()Z")
	public abstract boolean method5656();
}
