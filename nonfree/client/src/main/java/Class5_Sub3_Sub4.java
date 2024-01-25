import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pfa")
public abstract class Class5_Sub3_Sub4 extends Class5_Sub3 {

	@OriginalMember(owner = "client!pfa", name = "r", descriptor = "I")
	public final int anInt9732;

	@OriginalMember(owner = "client!pfa", name = "<init>", descriptor = "(I)V")
	protected Class5_Sub3_Sub4(@OriginalArg(0) int arg0) {
		this.anInt9732 = arg0;
	}

	@OriginalMember(owner = "client!pfa", name = "a", descriptor = "(Z)Ljava/lang/Object;")
	public abstract Object method8129();

	@OriginalMember(owner = "client!pfa", name = "a", descriptor = "(B)Z")
	public abstract boolean method8131();
}
