import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!be")
public abstract class Class3_Sub7 extends Class3 {

	@OriginalMember(owner = "client!be", name = "j", descriptor = "I")
	protected int anInt2901;

	@OriginalMember(owner = "client!be", name = "l", descriptor = "I")
	private final int anInt2903;

	@OriginalMember(owner = "client!be", name = "k", descriptor = "I")
	protected int anInt2902;

	@OriginalMember(owner = "client!be", name = "o", descriptor = "I")
	protected int anInt2906;

	@OriginalMember(owner = "client!be", name = "t", descriptor = "I")
	private final int anInt2911;

	@OriginalMember(owner = "client!be", name = "w", descriptor = "F")
	protected float aFloat50;

	@OriginalMember(owner = "client!be", name = "<init>", descriptor = "(IIIIIF)V")
	public Class3_Sub7(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) float arg5) {
		this.anInt2901 = arg0;
		this.anInt2903 = arg3;
		this.anInt2902 = arg1;
		this.anInt2906 = arg2;
		this.anInt2911 = arg4;
		this.aFloat50 = arg5;
	}

	@OriginalMember(owner = "client!be", name = "a", descriptor = "(B)I")
	public final int method2476() {
		return this.anInt2902;
	}

	@OriginalMember(owner = "client!be", name = "a", descriptor = "(I)I")
	public final int method2478() {
		return this.anInt2903;
	}

	@OriginalMember(owner = "client!be", name = "a", descriptor = "(Z)F")
	public final float method2479() {
		return this.aFloat50;
	}

	@OriginalMember(owner = "client!be", name = "b", descriptor = "(Z)I")
	public final int method2480() {
		return this.anInt2911;
	}

	@OriginalMember(owner = "client!be", name = "f", descriptor = "(I)I")
	public final int method2481() {
		return this.anInt2906;
	}

	@OriginalMember(owner = "client!be", name = "a", descriptor = "(BF)V")
	public abstract void method2482(@OriginalArg(1) float arg0);

	@OriginalMember(owner = "client!be", name = "g", descriptor = "(I)I")
	public final int method2483() {
		return this.anInt2901;
	}

	@OriginalMember(owner = "client!be", name = "a", descriptor = "(IIII)V")
	public abstract void method2485(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2);
}
