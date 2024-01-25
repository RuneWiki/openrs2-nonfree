import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!as")
public abstract class Class2_Sub4 extends Class2 {

	@OriginalMember(owner = "client!as", name = "t", descriptor = "I")
	protected int anInt5167;

	@OriginalMember(owner = "client!as", name = "n", descriptor = "I")
	protected int anInt5162;

	@OriginalMember(owner = "client!as", name = "o", descriptor = "F")
	protected float aFloat73;

	@OriginalMember(owner = "client!as", name = "r", descriptor = "I")
	private final int anInt5165;

	@OriginalMember(owner = "client!as", name = "A", descriptor = "I")
	protected int anInt5173;

	@OriginalMember(owner = "client!as", name = "w", descriptor = "I")
	private final int anInt5169;

	@OriginalMember(owner = "client!as", name = "<init>", descriptor = "(IIIIIF)V")
	public Class2_Sub4(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) float arg5) {
		this.anInt5167 = arg0;
		this.anInt5162 = arg1;
		this.aFloat73 = arg5;
		this.anInt5165 = arg4;
		this.anInt5173 = arg2;
		this.anInt5169 = arg3;
	}

	@OriginalMember(owner = "client!as", name = "a", descriptor = "(I)I")
	public final int method4081() {
		return this.anInt5162;
	}

	@OriginalMember(owner = "client!as", name = "a", descriptor = "(ZF)V")
	public abstract void method4083(@OriginalArg(1) float arg0);

	@OriginalMember(owner = "client!as", name = "b", descriptor = "(I)I")
	public final int method4084() {
		return this.anInt5165;
	}

	@OriginalMember(owner = "client!as", name = "a", descriptor = "(Z)F")
	public final float method4085() {
		return this.aFloat73;
	}

	@OriginalMember(owner = "client!as", name = "c", descriptor = "(I)I")
	public final int method4087() {
		return this.anInt5167;
	}

	@OriginalMember(owner = "client!as", name = "a", descriptor = "(IIII)V")
	public abstract void method4088(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2);

	@OriginalMember(owner = "client!as", name = "g", descriptor = "(I)I")
	public final int method4089() {
		return this.anInt5169;
	}

	@OriginalMember(owner = "client!as", name = "h", descriptor = "(I)I")
	public final int method4092() {
		return this.anInt5173;
	}
}
