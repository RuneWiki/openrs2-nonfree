import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ve")
public abstract class Class3_Sub23 extends Class3 {

	@OriginalMember(owner = "client!ve", name = "C", descriptor = "I")
	private final int anInt4511;

	@OriginalMember(owner = "client!ve", name = "A", descriptor = "I")
	protected int anInt4509;

	@OriginalMember(owner = "client!ve", name = "z", descriptor = "I")
	protected int anInt4508;

	@OriginalMember(owner = "client!ve", name = "y", descriptor = "F")
	protected float aFloat59;

	@OriginalMember(owner = "client!ve", name = "t", descriptor = "I")
	private final int anInt4503;

	@OriginalMember(owner = "client!ve", name = "F", descriptor = "I")
	protected int anInt4513;

	@OriginalMember(owner = "client!ve", name = "<init>", descriptor = "(IIIIIF)V")
	public Class3_Sub23(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) float arg5) {
		this.anInt4511 = arg3;
		this.anInt4509 = arg1;
		this.anInt4508 = arg2;
		this.aFloat59 = arg5;
		this.anInt4503 = arg4;
		this.anInt4513 = arg0;
	}

	@OriginalMember(owner = "client!ve", name = "a", descriptor = "(Z)I")
	public final int method3670() {
		return this.anInt4511;
	}

	@OriginalMember(owner = "client!ve", name = "a", descriptor = "(BF)V")
	public abstract void method3672(@OriginalArg(1) float arg0);

	@OriginalMember(owner = "client!ve", name = "d", descriptor = "(B)I")
	public final int method3674() {
		return this.anInt4503;
	}

	@OriginalMember(owner = "client!ve", name = "e", descriptor = "(B)I")
	public final int method3675() {
		return this.anInt4509;
	}

	@OriginalMember(owner = "client!ve", name = "a", descriptor = "(I)F")
	public final float method3677() {
		return this.aFloat59;
	}

	@OriginalMember(owner = "client!ve", name = "f", descriptor = "(B)I")
	public final int method3678() {
		return this.anInt4508;
	}

	@OriginalMember(owner = "client!ve", name = "g", descriptor = "(B)I")
	public final int method3679() {
		return this.anInt4513;
	}

	@OriginalMember(owner = "client!ve", name = "a", descriptor = "(IIII)V")
	public abstract void method3681(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2);
}
