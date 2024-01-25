import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ho")
public final class Class7_Sub13 extends Class7 {

	@OriginalMember(owner = "client!ho", name = "y", descriptor = "I")
	private final int anInt2744;

	@OriginalMember(owner = "client!ho", name = "q", descriptor = "I")
	public final int anInt2737;

	@OriginalMember(owner = "client!ho", name = "l", descriptor = "I")
	public final int anInt2733;

	@OriginalMember(owner = "client!ho", name = "z", descriptor = "I")
	public final int anInt2745;

	@OriginalMember(owner = "client!ho", name = "x", descriptor = "I")
	public final int anInt2743;

	@OriginalMember(owner = "client!ho", name = "C", descriptor = "I")
	private final int anInt2748;

	@OriginalMember(owner = "client!ho", name = "B", descriptor = "I")
	private final int anInt2747;

	@OriginalMember(owner = "client!ho", name = "m", descriptor = "I")
	private final int anInt2734;

	@OriginalMember(owner = "client!ho", name = "p", descriptor = "I")
	private final int anInt2736;

	@OriginalMember(owner = "client!ho", name = "<init>", descriptor = "(IIIIIIIII)V")
	public Class7_Sub13(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8) {
		this.anInt2744 = arg4;
		this.anInt2737 = arg5;
		this.anInt2733 = arg6;
		this.anInt2745 = arg7;
		this.anInt2743 = arg8;
		this.anInt2748 = arg0;
		this.anInt2747 = arg1;
		this.anInt2734 = arg2;
		this.anInt2736 = arg3;
	}

	@OriginalMember(owner = "client!ho", name = "a", descriptor = "(IBII)Z")
	public boolean method2561(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		return this.anInt2748 == arg0 && arg1 >= this.anInt2747 && arg1 <= this.anInt2736 && arg2 >= this.anInt2734 && this.anInt2744 >= arg2;
	}

	@OriginalMember(owner = "client!ho", name = "a", descriptor = "(BII)Z")
	public boolean method2562(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		return arg1 >= this.anInt2747 && arg1 <= this.anInt2736 && this.anInt2734 <= arg0 && this.anInt2744 >= arg0;
	}

	@OriginalMember(owner = "client!ho", name = "a", descriptor = "(III[I)V")
	public void method2563(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int[] arg2) {
		arg2[2] = this.anInt2734 + arg1 - this.anInt2733;
		arg2[1] = arg0 + this.anInt2747 - this.anInt2737;
		arg2[0] = this.anInt2748;
	}

	@OriginalMember(owner = "client!ho", name = "a", descriptor = "(IZI)Z")
	public boolean method2564(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		return arg0 >= this.anInt2737 && arg0 <= this.anInt2745 && this.anInt2733 <= arg1 && arg1 <= this.anInt2743;
	}

	@OriginalMember(owner = "client!ho", name = "b", descriptor = "(III[I)V")
	public void method2566(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int[] arg2) {
		arg2[2] = arg1 + this.anInt2733 - this.anInt2734;
		arg2[1] = this.anInt2737 + arg0 - this.anInt2747;
		arg2[0] = 0;
	}
}
