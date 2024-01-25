import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lca")
public final class Class198 {

	@OriginalMember(owner = "client!lca", name = "a", descriptor = "I")
	public int anInt5356;

	@OriginalMember(owner = "client!lca", name = "b", descriptor = "I")
	public int anInt5357;

	@OriginalMember(owner = "client!lca", name = "c", descriptor = "I")
	public int anInt5358;

	@OriginalMember(owner = "client!lca", name = "<init>", descriptor = "()V")
	public Class198() {
	}

	@OriginalMember(owner = "client!lca", name = "<init>", descriptor = "(Lclient!lca;)V")
	public Class198(@OriginalArg(0) Class198 arg0) {
		this.anInt5358 = arg0.anInt5358;
		this.anInt5357 = arg0.anInt5357;
		this.anInt5356 = arg0.anInt5356;
	}
}
