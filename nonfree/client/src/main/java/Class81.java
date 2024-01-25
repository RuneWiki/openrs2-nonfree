import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!eba")
public final class Class81 {

	@OriginalMember(owner = "client!eba", name = "b", descriptor = "I")
	public int anInt2681;

	@OriginalMember(owner = "client!eba", name = "d", descriptor = "I")
	public int anInt2683;

	@OriginalMember(owner = "client!eba", name = "l", descriptor = "I")
	public int anInt2690;

	@OriginalMember(owner = "client!eba", name = "g", descriptor = "I")
	public int anInt2686 = 128;

	@OriginalMember(owner = "client!eba", name = "e", descriptor = "I")
	public int anInt2684 = 128;

	@OriginalMember(owner = "client!eba", name = "m", descriptor = "I")
	public int anInt2691;

	@OriginalMember(owner = "client!eba", name = "<init>", descriptor = "(I)V")
	public Class81(@OriginalArg(0) int arg0) {
		this.anInt2691 = arg0;
	}

	@OriginalMember(owner = "client!eba", name = "<init>", descriptor = "(IIIIII)V")
	private Class81(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		this.anInt2684 = arg1;
		this.anInt2686 = arg2;
		this.anInt2690 = arg5;
		this.anInt2691 = arg0;
		this.anInt2681 = arg3;
		this.anInt2683 = arg4;
	}

	@OriginalMember(owner = "client!eba", name = "a", descriptor = "(Lclient!eba;B)V")
	public void method2260(@OriginalArg(0) Class81 arg0) {
		this.anInt2681 = arg0.anInt2681;
		this.anInt2691 = arg0.anInt2691;
		this.anInt2686 = arg0.anInt2686;
		this.anInt2684 = arg0.anInt2684;
		this.anInt2683 = arg0.anInt2683;
		this.anInt2690 = arg0.anInt2690;
	}

	@OriginalMember(owner = "client!eba", name = "a", descriptor = "(B)Lclient!eba;")
	public Class81 method2261() {
		return new Class81(this.anInt2691, this.anInt2684, this.anInt2686, this.anInt2681, this.anInt2683, this.anInt2690);
	}
}
