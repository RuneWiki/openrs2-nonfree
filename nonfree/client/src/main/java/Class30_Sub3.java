import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hc")
public abstract class Class30_Sub3 extends Class30 {

	@OriginalMember(owner = "client!hc", name = "h", descriptor = "I")
	protected int anInt5438;

	@OriginalMember(owner = "client!hc", name = "g", descriptor = "I")
	protected int anInt5437;

	@OriginalMember(owner = "client!hc", name = "l", descriptor = "I")
	public final int anInt5441;

	@OriginalMember(owner = "client!hc", name = "i", descriptor = "I")
	protected final int anInt5439;

	@OriginalMember(owner = "client!hc", name = "<init>", descriptor = "(IIII)V")
	protected Class30_Sub3(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		this.anInt5438 = arg2;
		this.anInt5437 = arg0;
		this.anInt5441 = arg3;
		this.anInt5439 = arg1;
	}
}
