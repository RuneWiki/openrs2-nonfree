import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!js")
public abstract class Class5_Sub5_Sub8 extends Class5_Sub5 {

	@OriginalMember(owner = "client!js", name = "v", descriptor = "I")
	public final int anInt5137;

	@OriginalMember(owner = "client!js", name = "<init>", descriptor = "(I)V")
	protected Class5_Sub5_Sub8(@OriginalArg(0) int arg0) {
		this.anInt5137 = arg0;
	}

	@OriginalMember(owner = "client!js", name = "a", descriptor = "(Z)Z")
	public abstract boolean method4378();

	@OriginalMember(owner = "client!js", name = "b", descriptor = "(Z)Ljava/lang/Object;")
	public abstract Object method4379();
}
