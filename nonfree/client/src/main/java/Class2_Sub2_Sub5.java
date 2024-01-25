import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bia")
public abstract class Class2_Sub2_Sub5 extends Class2_Sub2 {

	@OriginalMember(owner = "client!bia", name = "v", descriptor = "I")
	public final int anInt5796;

	@OriginalMember(owner = "client!bia", name = "<init>", descriptor = "(I)V")
	protected Class2_Sub2_Sub5(@OriginalArg(0) int arg0) {
		this.anInt5796 = arg0;
	}

	@OriginalMember(owner = "client!bia", name = "b", descriptor = "(B)Z")
	public abstract boolean method4970();

	@OriginalMember(owner = "client!bia", name = "a", descriptor = "(I)Ljava/lang/Object;")
	public abstract Object method4971();
}
