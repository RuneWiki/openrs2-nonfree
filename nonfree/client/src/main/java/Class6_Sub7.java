import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bj")
public abstract class Class6_Sub7 extends Class6 {

	@OriginalMember(owner = "client!bj", name = "s", descriptor = "F")
	protected float aFloat115;

	@OriginalMember(owner = "client!bj", name = "q", descriptor = "I")
	protected int anInt4949;

	@OriginalMember(owner = "client!bj", name = "r", descriptor = "I")
	private final int anInt4950;

	@OriginalMember(owner = "client!bj", name = "o", descriptor = "I")
	protected int anInt4947;

	@OriginalMember(owner = "client!bj", name = "v", descriptor = "I")
	protected int anInt4951;

	@OriginalMember(owner = "client!bj", name = "m", descriptor = "I")
	private final int anInt4945;

	@OriginalMember(owner = "client!bj", name = "<init>", descriptor = "(IIIIIF)V")
	public Class6_Sub7(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) float arg5) {
		this.aFloat115 = arg5;
		this.anInt4949 = arg1;
		this.anInt4950 = arg4;
		this.anInt4947 = arg0;
		this.anInt4951 = arg2;
		this.anInt4945 = arg3;
	}

	@OriginalMember(owner = "client!bj", name = "a", descriptor = "(I)I")
	public final int method4283() {
		return this.anInt4945;
	}

	@OriginalMember(owner = "client!bj", name = "b", descriptor = "(I)F")
	public final float method4284() {
		return this.aFloat115;
	}

	@OriginalMember(owner = "client!bj", name = "a", descriptor = "(B)I")
	public final int method4286() {
		return this.anInt4951;
	}

	@OriginalMember(owner = "client!bj", name = "e", descriptor = "(I)I")
	public final int method4288() {
		return this.anInt4950;
	}

	@OriginalMember(owner = "client!bj", name = "a", descriptor = "(FZ)V")
	public abstract void method4289(@OriginalArg(0) float arg0);

	@OriginalMember(owner = "client!bj", name = "a", descriptor = "(BIII)V")
	public abstract void method4290(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2);

	@OriginalMember(owner = "client!bj", name = "b", descriptor = "(B)I")
	public final int method4291() {
		return this.anInt4949;
	}

	@OriginalMember(owner = "client!bj", name = "c", descriptor = "(B)I")
	public final int method4292() {
		return this.anInt4947;
	}
}
