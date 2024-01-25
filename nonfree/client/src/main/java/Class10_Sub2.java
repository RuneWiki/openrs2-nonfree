import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!aq")
public abstract class Class10_Sub2 extends Class10 {

	@OriginalMember(owner = "client!aq", name = "s", descriptor = "I")
	public final int anInt2445;

	@OriginalMember(owner = "client!aq", name = "k", descriptor = "I")
	protected int anInt2438;

	@OriginalMember(owner = "client!aq", name = "q", descriptor = "I")
	protected final int anInt2443;

	@OriginalMember(owner = "client!aq", name = "p", descriptor = "I")
	protected int anInt2442;

	@OriginalMember(owner = "client!aq", name = "<init>", descriptor = "(IIII)V")
	protected Class10_Sub2(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		this.anInt2445 = arg3;
		this.anInt2438 = arg2;
		this.anInt2443 = arg1;
		this.anInt2442 = arg0;
	}
}
