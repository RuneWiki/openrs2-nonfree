import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!raa")
public abstract class Class6_Sub1 extends Class6 {

	@OriginalMember(owner = "client!raa", name = "m", descriptor = "I")
	private final int anInt9788;

	@OriginalMember(owner = "client!raa", name = "r", descriptor = "I")
	protected int anInt9792;

	@OriginalMember(owner = "client!raa", name = "q", descriptor = "I")
	protected int anInt9791;

	@OriginalMember(owner = "client!raa", name = "n", descriptor = "I")
	protected int anInt9789;

	@OriginalMember(owner = "client!raa", name = "x", descriptor = "I")
	private final int anInt9797;

	@OriginalMember(owner = "client!raa", name = "t", descriptor = "F")
	protected float aFloat194;

	@OriginalMember(owner = "client!raa", name = "<init>", descriptor = "(IIIIIF)V")
	public Class6_Sub1(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) float arg5) {
		this.anInt9788 = arg4;
		this.anInt9792 = arg2;
		this.anInt9791 = arg1;
		this.anInt9789 = arg0;
		this.anInt9797 = arg3;
		this.aFloat194 = arg5;
	}

	@OriginalMember(owner = "client!raa", name = "a", descriptor = "(I)I")
	public final int method8260() {
		return this.anInt9792;
	}

	@OriginalMember(owner = "client!raa", name = "a", descriptor = "(FI)V")
	public abstract void method8261(@OriginalArg(0) float arg0);

	@OriginalMember(owner = "client!raa", name = "a", descriptor = "(IIIZ)V")
	public abstract void method8262(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2);

	@OriginalMember(owner = "client!raa", name = "a", descriptor = "(Z)I")
	public final int method8264() {
		return this.anInt9789;
	}

	@OriginalMember(owner = "client!raa", name = "b", descriptor = "(I)I")
	public final int method8265() {
		return this.anInt9788;
	}

	@OriginalMember(owner = "client!raa", name = "b", descriptor = "(B)F")
	public final float method8266() {
		return this.aFloat194;
	}

	@OriginalMember(owner = "client!raa", name = "c", descriptor = "(I)I")
	public final int method8267() {
		return this.anInt9791;
	}

	@OriginalMember(owner = "client!raa", name = "e", descriptor = "(I)I")
	public final int method8268() {
		return this.anInt9797;
	}
}
