import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nm")
public abstract class Class1_Sub27 extends Class1 {

	@OriginalMember(owner = "client!nm", name = "n", descriptor = "I")
	protected int anInt6326;

	@OriginalMember(owner = "client!nm", name = "q", descriptor = "I")
	private final int anInt6329;

	@OriginalMember(owner = "client!nm", name = "j", descriptor = "I")
	protected int anInt6323;

	@OriginalMember(owner = "client!nm", name = "w", descriptor = "F")
	protected float aFloat124;

	@OriginalMember(owner = "client!nm", name = "k", descriptor = "I")
	private final int anInt6324;

	@OriginalMember(owner = "client!nm", name = "m", descriptor = "I")
	protected int anInt6325;

	@OriginalMember(owner = "client!nm", name = "<init>", descriptor = "(IIIIIF)V")
	public Class1_Sub27(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) float arg5) {
		this.anInt6326 = arg1;
		this.anInt6329 = arg3;
		this.anInt6323 = arg0;
		this.aFloat124 = arg5;
		this.anInt6324 = arg4;
		this.anInt6325 = arg2;
	}

	@OriginalMember(owner = "client!nm", name = "a", descriptor = "(I)F")
	public final float method5486() {
		return this.aFloat124;
	}

	@OriginalMember(owner = "client!nm", name = "b", descriptor = "(I)I")
	public final int method5487() {
		return this.anInt6326;
	}

	@OriginalMember(owner = "client!nm", name = "c", descriptor = "(I)I")
	public final int method5488() {
		return this.anInt6324;
	}

	@OriginalMember(owner = "client!nm", name = "a", descriptor = "(BIII)V")
	public abstract void method5491(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2);

	@OriginalMember(owner = "client!nm", name = "b", descriptor = "(B)I")
	public final int method5493() {
		return this.anInt6323;
	}

	@OriginalMember(owner = "client!nm", name = "a", descriptor = "(FZ)V")
	public abstract void method5494(@OriginalArg(0) float arg0);

	@OriginalMember(owner = "client!nm", name = "h", descriptor = "(I)I")
	public final int method5495() {
		return this.anInt6325;
	}

	@OriginalMember(owner = "client!nm", name = "i", descriptor = "(I)I")
	public final int method5496() {
		return this.anInt6329;
	}
}
