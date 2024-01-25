import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rc")
public abstract class Class1_Sub18 extends Class1 {

	@OriginalMember(owner = "client!rc", name = "s", descriptor = "F")
	protected float aFloat119;

	@OriginalMember(owner = "client!rc", name = "o", descriptor = "I")
	private final int anInt5034;

	@OriginalMember(owner = "client!rc", name = "w", descriptor = "I")
	private final int anInt5038;

	@OriginalMember(owner = "client!rc", name = "k", descriptor = "I")
	protected int anInt5030;

	@OriginalMember(owner = "client!rc", name = "z", descriptor = "I")
	protected int anInt5041;

	@OriginalMember(owner = "client!rc", name = "u", descriptor = "I")
	protected int anInt5037;

	@OriginalMember(owner = "client!rc", name = "<init>", descriptor = "(IIIIIF)V")
	public Class1_Sub18(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) float arg5) {
		this.aFloat119 = arg5;
		this.anInt5034 = arg4;
		this.anInt5038 = arg3;
		this.anInt5030 = arg1;
		this.anInt5041 = arg2;
		this.anInt5037 = arg0;
	}

	@OriginalMember(owner = "client!rc", name = "b", descriptor = "(Z)I")
	public final int method4098() {
		return this.anInt5041;
	}

	@OriginalMember(owner = "client!rc", name = "a", descriptor = "(I)F")
	public final float method4099() {
		return this.aFloat119;
	}

	@OriginalMember(owner = "client!rc", name = "a", descriptor = "(BF)V")
	public abstract void method4100(@OriginalArg(1) float arg0);

	@OriginalMember(owner = "client!rc", name = "b", descriptor = "(I)I")
	public final int method4101() {
		return this.anInt5030;
	}

	@OriginalMember(owner = "client!rc", name = "a", descriptor = "(B)I")
	public final int method4102() {
		return this.anInt5034;
	}

	@OriginalMember(owner = "client!rc", name = "c", descriptor = "(I)I")
	public final int method4104() {
		return this.anInt5038;
	}

	@OriginalMember(owner = "client!rc", name = "e", descriptor = "(I)I")
	public final int method4107() {
		return this.anInt5037;
	}

	@OriginalMember(owner = "client!rc", name = "a", descriptor = "(IIII)V")
	public abstract void method4108(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2);
}
