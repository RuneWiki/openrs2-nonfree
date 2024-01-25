import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cv")
public final class Class8_Sub14 extends Class8 {

	@OriginalMember(owner = "client!cv", name = "p", descriptor = "I")
	private final int anInt2463;

	@OriginalMember(owner = "client!cv", name = "z", descriptor = "I")
	public final int anInt2472;

	@OriginalMember(owner = "client!cv", name = "u", descriptor = "I")
	public final int anInt2468;

	@OriginalMember(owner = "client!cv", name = "s", descriptor = "I")
	private final int anInt2466;

	@OriginalMember(owner = "client!cv", name = "v", descriptor = "I")
	private final int anInt2469;

	@OriginalMember(owner = "client!cv", name = "t", descriptor = "I")
	private final int anInt2467;

	@OriginalMember(owner = "client!cv", name = "m", descriptor = "I")
	public final int anInt2460;

	@OriginalMember(owner = "client!cv", name = "x", descriptor = "I")
	public final int anInt2470;

	@OriginalMember(owner = "client!cv", name = "o", descriptor = "I")
	private final int anInt2462;

	@OriginalMember(owner = "client!cv", name = "<init>", descriptor = "(IIIIIIIII)V")
	public Class8_Sub14(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8) {
		this.anInt2463 = arg4;
		this.anInt2472 = arg6;
		this.anInt2468 = arg8;
		this.anInt2466 = arg1;
		this.anInt2469 = arg3;
		this.anInt2467 = arg0;
		this.anInt2460 = arg5;
		this.anInt2470 = arg7;
		this.anInt2462 = arg2;
	}

	@OriginalMember(owner = "client!cv", name = "a", descriptor = "(I[III)V")
	public void method2086(@OriginalArg(0) int arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) int arg2) {
		arg1[2] = this.anInt2462 + arg2 - this.anInt2472;
		arg1[1] = this.anInt2466 + arg0 - this.anInt2460;
		arg1[0] = this.anInt2467;
	}

	@OriginalMember(owner = "client!cv", name = "a", descriptor = "(BII)Z")
	public boolean method2087(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		return arg1 >= this.anInt2460 && arg1 <= this.anInt2470 && this.anInt2472 <= arg0 && this.anInt2468 >= arg0;
	}

	@OriginalMember(owner = "client!cv", name = "a", descriptor = "(III[I)V")
	public void method2088(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int[] arg2) {
		arg2[0] = 0;
		arg2[1] = this.anInt2460 + arg0 - this.anInt2466;
		arg2[2] = arg1 + this.anInt2472 - this.anInt2462;
	}

	@OriginalMember(owner = "client!cv", name = "a", descriptor = "(IBI)Z")
	public boolean method2089(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		return arg1 >= this.anInt2466 && this.anInt2469 >= arg1 && arg0 >= this.anInt2462 && this.anInt2463 >= arg0;
	}

	@OriginalMember(owner = "client!cv", name = "a", descriptor = "(BIII)Z")
	public boolean method2090(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		return arg1 == this.anInt2467 && arg2 >= this.anInt2466 && this.anInt2469 >= arg2 && arg0 >= this.anInt2462 && arg0 <= this.anInt2463;
	}
}
