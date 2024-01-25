import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lca")
public final class Class5_Sub32 extends Class5 {

	@OriginalMember(owner = "client!lca", name = "p", descriptor = "I")
	public final int anInt5333;

	@OriginalMember(owner = "client!lca", name = "l", descriptor = "I")
	public int anInt5329;

	@OriginalMember(owner = "client!lca", name = "<init>", descriptor = "(II)V")
	public Class5_Sub32(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.anInt5333 = arg0;
		this.anInt5329 = arg1;
	}
}
