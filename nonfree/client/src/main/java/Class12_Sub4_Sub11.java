import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ks")
public abstract class Class12_Sub4_Sub11 extends Class12_Sub4 {

	@OriginalMember(owner = "client!ks", name = "z", descriptor = "I")
	public final int anInt8655;

	@OriginalMember(owner = "client!ks", name = "<init>", descriptor = "(I)V")
	protected Class12_Sub4_Sub11(@OriginalArg(0) int arg0) {
		this.anInt8655 = arg0;
	}

	@OriginalMember(owner = "client!ks", name = "a", descriptor = "(B)Z")
	public abstract boolean method7117();

	@OriginalMember(owner = "client!ks", name = "c", descriptor = "(I)Ljava/lang/Object;")
	public abstract Object method7120();
}
