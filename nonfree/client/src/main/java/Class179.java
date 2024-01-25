import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rl")
public final class Class179 {

	@OriginalMember(owner = "client!rl", name = "a", descriptor = "I")
	public int anInt5526;

	@OriginalMember(owner = "client!rl", name = "b", descriptor = "I")
	public int anInt5527;

	@OriginalMember(owner = "client!rl", name = "c", descriptor = "I")
	public int anInt5528;

	@OriginalMember(owner = "client!rl", name = "d", descriptor = "I")
	public int anInt5529;

	@OriginalMember(owner = "client!rl", name = "<init>", descriptor = "()V")
	public Class179() {
	}

	@OriginalMember(owner = "client!rl", name = "<init>", descriptor = "(Lclient!rl;)V")
	public Class179(@OriginalArg(0) Class179 arg0) {
		this.anInt5527 = arg0.anInt5527;
		this.anInt5528 = arg0.anInt5528;
		this.anInt5529 = arg0.anInt5529;
		this.anInt5526 = arg0.anInt5526;
	}
}
