import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ta")
public abstract class Class6_Sub10 extends Class6 {

	@OriginalMember(owner = "client!ta", name = "s", descriptor = "I")
	protected int anInt9547;

	@OriginalMember(owner = "client!ta", name = "o", descriptor = "I")
	protected int anInt9544;

	@OriginalMember(owner = "client!ta", name = "j", descriptor = "I")
	private final int anInt9545;

	@OriginalMember(owner = "client!ta", name = "k", descriptor = "F")
	protected float aFloat194;

	@OriginalMember(owner = "client!ta", name = "l", descriptor = "I")
	private final int anInt9548;

	@OriginalMember(owner = "client!ta", name = "u", descriptor = "I")
	protected int anInt9555;

	@OriginalMember(owner = "client!ta", name = "<init>", descriptor = "(IIIIIF)V")
	public Class6_Sub10(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) float arg5) {
		this.anInt9547 = arg0;
		this.anInt9544 = arg2;
		this.anInt9545 = arg3;
		this.aFloat194 = arg5;
		this.anInt9548 = arg4;
		this.anInt9555 = arg1;
	}

	@OriginalMember(owner = "client!ta", name = "a", descriptor = "(B)I")
	public final int method8327() {
		return this.anInt9555;
	}

	@OriginalMember(owner = "client!ta", name = "a", descriptor = "(I)I")
	public final int method8328() {
		return this.anInt9548;
	}

	@OriginalMember(owner = "client!ta", name = "b", descriptor = "(Z)I")
	public final int method8329() {
		return this.anInt9544;
	}

	@OriginalMember(owner = "client!ta", name = "c", descriptor = "(B)I")
	public final int method8331() {
		return this.anInt9545;
	}

	@OriginalMember(owner = "client!ta", name = "d", descriptor = "(B)I")
	public final int method8332() {
		return this.anInt9547;
	}

	@OriginalMember(owner = "client!ta", name = "a", descriptor = "(IIII)V")
	public abstract void method8333(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2);

	@OriginalMember(owner = "client!ta", name = "b", descriptor = "(I)F")
	public final float method8334() {
		return this.aFloat194;
	}

	@OriginalMember(owner = "client!ta", name = "a", descriptor = "(FI)V")
	public abstract void method8335(@OriginalArg(0) float arg0);
}
