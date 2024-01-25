import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qp")
public abstract class Class1_Sub31 extends Class1 {

	@OriginalMember(owner = "client!qp", name = "o", descriptor = "I")
	protected int anInt7221;

	@OriginalMember(owner = "client!qp", name = "n", descriptor = "I")
	private final int anInt7220;

	@OriginalMember(owner = "client!qp", name = "x", descriptor = "F")
	protected float aFloat101;

	@OriginalMember(owner = "client!qp", name = "u", descriptor = "I")
	protected int anInt7226;

	@OriginalMember(owner = "client!qp", name = "k", descriptor = "I")
	private final int anInt7217;

	@OriginalMember(owner = "client!qp", name = "m", descriptor = "I")
	protected int anInt7219;

	@OriginalMember(owner = "client!qp", name = "<init>", descriptor = "(IIIIIF)V")
	public Class1_Sub31(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) float arg5) {
		this.anInt7221 = arg0;
		this.anInt7220 = arg4;
		this.aFloat101 = arg5;
		this.anInt7226 = arg2;
		this.anInt7217 = arg3;
		this.anInt7219 = arg1;
	}

	@OriginalMember(owner = "client!qp", name = "a", descriptor = "(Z)I")
	public final int method5902() {
		return this.anInt7219;
	}

	@OriginalMember(owner = "client!qp", name = "a", descriptor = "(IF)V")
	public abstract void method5903(@OriginalArg(1) float arg0);

	@OriginalMember(owner = "client!qp", name = "a", descriptor = "(B)I")
	public final int method5904() {
		return this.anInt7226;
	}

	@OriginalMember(owner = "client!qp", name = "a", descriptor = "(I)F")
	public final float method5905() {
		return this.aFloat101;
	}

	@OriginalMember(owner = "client!qp", name = "g", descriptor = "(I)I")
	public final int method5906() {
		return this.anInt7221;
	}

	@OriginalMember(owner = "client!qp", name = "b", descriptor = "(B)I")
	public final int method5907() {
		return this.anInt7220;
	}

	@OriginalMember(owner = "client!qp", name = "a", descriptor = "(IZII)V")
	public abstract void method5908(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2);

	@OriginalMember(owner = "client!qp", name = "c", descriptor = "(B)I")
	public final int method5910() {
		return this.anInt7217;
	}
}
