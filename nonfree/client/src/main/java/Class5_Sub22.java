import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fga")
public final class Class5_Sub22 extends Class5 {

	@OriginalMember(owner = "client!fga", name = "k", descriptor = "I")
	public final int anInt2654;

	@OriginalMember(owner = "client!fga", name = "l", descriptor = "I")
	private final int anInt2655;

	@OriginalMember(owner = "client!fga", name = "s", descriptor = "I")
	private final int anInt2661;

	@OriginalMember(owner = "client!fga", name = "n", descriptor = "I")
	public final int anInt2657;

	@OriginalMember(owner = "client!fga", name = "u", descriptor = "I")
	private final int anInt2663;

	@OriginalMember(owner = "client!fga", name = "z", descriptor = "I")
	private final int anInt2667;

	@OriginalMember(owner = "client!fga", name = "o", descriptor = "I")
	public final int anInt2658;

	@OriginalMember(owner = "client!fga", name = "m", descriptor = "I")
	public final int anInt2656;

	@OriginalMember(owner = "client!fga", name = "y", descriptor = "I")
	private final int anInt2666;

	@OriginalMember(owner = "client!fga", name = "<init>", descriptor = "(IIIIIIIII)V")
	public Class5_Sub22(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8) {
		this.anInt2654 = arg8;
		this.anInt2655 = arg0;
		this.anInt2661 = arg2;
		this.anInt2657 = arg5;
		this.anInt2663 = arg1;
		this.anInt2667 = arg4;
		this.anInt2658 = arg7;
		this.anInt2656 = arg6;
		this.anInt2666 = arg3;
	}

	@OriginalMember(owner = "client!fga", name = "a", descriptor = "(III)Z")
	public boolean method2381(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		return this.anInt2657 <= arg0 && this.anInt2658 >= arg0 && arg1 >= this.anInt2656 && this.anInt2654 >= arg1;
	}

	@OriginalMember(owner = "client!fga", name = "a", descriptor = "(BIII)Z")
	public boolean method2382(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		return arg1 == this.anInt2655 && this.anInt2663 <= arg0 && arg0 <= this.anInt2666 && arg2 >= this.anInt2661 && this.anInt2667 >= arg2;
	}

	@OriginalMember(owner = "client!fga", name = "b", descriptor = "(III)Z")
	public boolean method2383(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		return this.anInt2663 <= arg0 && arg0 <= this.anInt2666 && this.anInt2661 <= arg1 && arg1 <= this.anInt2667;
	}

	@OriginalMember(owner = "client!fga", name = "a", descriptor = "([IBII)V")
	public void method2385(@OriginalArg(0) int[] arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		arg0[1] = arg2 + this.anInt2663 - this.anInt2657;
		arg0[0] = this.anInt2655;
		arg0[2] = arg1 + this.anInt2661 - this.anInt2656;
	}

	@OriginalMember(owner = "client!fga", name = "a", descriptor = "(III[I)V")
	public void method2386(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int[] arg2) {
		arg2[1] = this.anInt2657 + arg0 - this.anInt2663;
		arg2[0] = 0;
		arg2[2] = arg1 + this.anInt2656 - this.anInt2661;
	}
}
