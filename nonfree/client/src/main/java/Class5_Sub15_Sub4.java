import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lca")
public final class Class5_Sub15_Sub4 extends Class5_Sub15 {

	@OriginalMember(owner = "client!lca", name = "u", descriptor = "I")
	private int anInt5525;

	@OriginalMember(owner = "client!lca", name = "v", descriptor = "I")
	private int anInt5526;

	@OriginalMember(owner = "client!lca", name = "a", descriptor = "(Lclient!sca;I)V")
	@Override
	public void method9164(@OriginalArg(0) Class325 arg0) {
		arg0.method7392(this.anInt5525, this.anInt5526);
	}

	@OriginalMember(owner = "client!lca", name = "a", descriptor = "(ILclient!wq;)V")
	@Override
	public void method9163(@OriginalArg(1) Class5_Sub36 arg0) {
		this.anInt5526 = arg0.method7268();
		this.anInt5525 = arg0.method7268();
	}
}
