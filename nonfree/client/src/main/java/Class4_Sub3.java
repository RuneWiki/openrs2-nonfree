import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!am")
public abstract class Class4_Sub3 extends Class4 {

	@OriginalMember(owner = "client!am", name = "D", descriptor = "I")
	protected int anInt6300;

	@OriginalMember(owner = "client!am", name = "t", descriptor = "I")
	protected int anInt6292;

	@OriginalMember(owner = "client!am", name = "B", descriptor = "F")
	protected float aFloat154;

	@OriginalMember(owner = "client!am", name = "s", descriptor = "I")
	private final int anInt6291;

	@OriginalMember(owner = "client!am", name = "H", descriptor = "I")
	private final int anInt6303;

	@OriginalMember(owner = "client!am", name = "F", descriptor = "I")
	protected int anInt6301;

	@OriginalMember(owner = "client!am", name = "<init>", descriptor = "(IIIIIF)V")
	public Class4_Sub3(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) float arg5) {
		this.anInt6300 = arg2;
		this.anInt6292 = arg0;
		this.aFloat154 = arg5;
		this.anInt6291 = arg3;
		this.anInt6303 = arg4;
		this.anInt6301 = arg1;
	}

	@OriginalMember(owner = "client!am", name = "a", descriptor = "(BIII)V")
	public abstract void method4948(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2);

	@OriginalMember(owner = "client!am", name = "a", descriptor = "(Z)I")
	public final int method4949() {
		return this.anInt6300;
	}

	@OriginalMember(owner = "client!am", name = "b", descriptor = "(Z)I")
	public final int method4950() {
		return this.anInt6291;
	}

	@OriginalMember(owner = "client!am", name = "a", descriptor = "(I)I")
	public final int method4952() {
		return this.anInt6303;
	}

	@OriginalMember(owner = "client!am", name = "e", descriptor = "(B)I")
	public final int method4953() {
		return this.anInt6301;
	}

	@OriginalMember(owner = "client!am", name = "f", descriptor = "(B)I")
	public final int method4954() {
		return this.anInt6292;
	}

	@OriginalMember(owner = "client!am", name = "b", descriptor = "(I)F")
	public final float method4955() {
		return this.aFloat154;
	}

	@OriginalMember(owner = "client!am", name = "a", descriptor = "(FB)V")
	public abstract void method4956(@OriginalArg(0) float arg0);
}
