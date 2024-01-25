import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wo")
public abstract class Class20_Sub4 extends Class20 {

	@OriginalMember(owner = "client!wo", name = "w", descriptor = "I")
	public final int anInt6663;

	@OriginalMember(owner = "client!wo", name = "o", descriptor = "I")
	public final int anInt6656;

	@OriginalMember(owner = "client!wo", name = "q", descriptor = "I")
	public int anInt6658;

	@OriginalMember(owner = "client!wo", name = "l", descriptor = "I")
	public int anInt6653;

	@OriginalMember(owner = "client!wo", name = "u", descriptor = "I")
	public int anInt6662;

	@OriginalMember(owner = "client!wo", name = "x", descriptor = "I")
	protected final int anInt6664;

	@OriginalMember(owner = "client!wo", name = "t", descriptor = "I")
	public int anInt6661;

	@OriginalMember(owner = "client!wo", name = "<init>", descriptor = "(IIIIIII)V")
	protected Class20_Sub4(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		this.anInt6663 = arg3;
		this.anInt6656 = arg6;
		this.anInt6658 = arg0;
		this.anInt6653 = arg4;
		this.anInt6662 = arg5;
		this.anInt6664 = arg1;
		this.anInt6661 = arg2;
	}

	@OriginalMember(owner = "client!wo", name = "d", descriptor = "(B)V")
	@Override
	public final void method5111() {
		throw new IllegalStateException();
	}

	@OriginalMember(owner = "client!wo", name = "f", descriptor = "(B)I")
	public abstract int method5118();

	@OriginalMember(owner = "client!wo", name = "c", descriptor = "(I)Z")
	@Override
	public final boolean method5110() {
		return false;
	}

	@OriginalMember(owner = "client!wo", name = "a", descriptor = "(ZIILclient!er;Lclient!qa;IB)V")
	@Override
	public final void method5116(@OriginalArg(0) boolean arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) Class20 arg3, @OriginalArg(4) Class128 arg4, @OriginalArg(5) int arg5) {
		throw new IllegalStateException();
	}
}
