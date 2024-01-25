import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nm")
public final class Class11_Sub28 extends Class11 {

	@OriginalMember(owner = "client!nm", name = "B", descriptor = "I")
	private final int anInt4372;

	@OriginalMember(owner = "client!nm", name = "n", descriptor = "I")
	public final int anInt4360;

	@OriginalMember(owner = "client!nm", name = "x", descriptor = "I")
	private final int anInt4368;

	@OriginalMember(owner = "client!nm", name = "w", descriptor = "I")
	private final int anInt4367;

	@OriginalMember(owner = "client!nm", name = "A", descriptor = "I")
	private final int anInt4371;

	@OriginalMember(owner = "client!nm", name = "r", descriptor = "I")
	public final int anInt4363;

	@OriginalMember(owner = "client!nm", name = "s", descriptor = "I")
	private final int anInt4364;

	@OriginalMember(owner = "client!nm", name = "o", descriptor = "I")
	public final int anInt4361;

	@OriginalMember(owner = "client!nm", name = "y", descriptor = "I")
	public final int anInt4369;

	@OriginalMember(owner = "client!nm", name = "<init>", descriptor = "(IIIIIIIII)V")
	public Class11_Sub28(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8) {
		this.anInt4372 = arg1;
		this.anInt4360 = arg6;
		this.anInt4368 = arg3;
		this.anInt4367 = arg2;
		this.anInt4371 = arg0;
		this.anInt4363 = arg5;
		this.anInt4364 = arg4;
		this.anInt4361 = arg8;
		this.anInt4369 = arg7;
	}

	@OriginalMember(owner = "client!nm", name = "b", descriptor = "(III)Z")
	public boolean method3838(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		return arg0 >= this.anInt4372 && this.anInt4368 >= arg0 && arg1 >= this.anInt4367 && arg1 <= this.anInt4364;
	}

	@OriginalMember(owner = "client!nm", name = "a", descriptor = "(IIZ)Z")
	public boolean method3841(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return this.anInt4363 <= arg1 && this.anInt4369 >= arg1 && arg0 >= this.anInt4360 && this.anInt4361 >= arg0;
	}

	@OriginalMember(owner = "client!nm", name = "a", descriptor = "([IIII)V")
	public void method3842(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		arg0[1] = this.anInt4363 + arg2 - this.anInt4372;
		arg0[2] = this.anInt4360 + arg1 - this.anInt4367;
		arg0[0] = 0;
	}

	@OriginalMember(owner = "client!nm", name = "a", descriptor = "(BI[II)V")
	public void method3843(@OriginalArg(1) int arg0, @OriginalArg(2) int[] arg1, @OriginalArg(3) int arg2) {
		arg1[2] = this.anInt4367 + arg0 - this.anInt4360;
		arg1[1] = this.anInt4372 + arg2 - this.anInt4363;
		arg1[0] = this.anInt4371;
	}

	@OriginalMember(owner = "client!nm", name = "a", descriptor = "(IZII)Z")
	public boolean method3844(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		return this.anInt4371 == arg1 && this.anInt4372 <= arg2 && this.anInt4368 >= arg2 && arg0 >= this.anInt4367 && arg0 <= this.anInt4364;
	}
}
