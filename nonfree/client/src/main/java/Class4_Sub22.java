import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lj")
public final class Class4_Sub22 extends Class4 {

	@OriginalMember(owner = "client!lj", name = "D", descriptor = "I")
	private final int anInt4483;

	@OriginalMember(owner = "client!lj", name = "H", descriptor = "I")
	private final int anInt4486;

	@OriginalMember(owner = "client!lj", name = "z", descriptor = "I")
	public final int anInt4479;

	@OriginalMember(owner = "client!lj", name = "t", descriptor = "I")
	public final int anInt4473;

	@OriginalMember(owner = "client!lj", name = "E", descriptor = "I")
	public final int anInt4484;

	@OriginalMember(owner = "client!lj", name = "r", descriptor = "I")
	private final int anInt4472;

	@OriginalMember(owner = "client!lj", name = "q", descriptor = "I")
	private final int anInt4471;

	@OriginalMember(owner = "client!lj", name = "C", descriptor = "I")
	private final int anInt4482;

	@OriginalMember(owner = "client!lj", name = "w", descriptor = "I")
	public final int anInt4476;

	@OriginalMember(owner = "client!lj", name = "<init>", descriptor = "(IIIIIIIII)V")
	public Class4_Sub22(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8) {
		this.anInt4483 = arg0;
		this.anInt4486 = arg3;
		this.anInt4479 = arg8;
		this.anInt4473 = arg7;
		this.anInt4484 = arg5;
		this.anInt4472 = arg4;
		this.anInt4471 = arg2;
		this.anInt4482 = arg1;
		this.anInt4476 = arg6;
	}

	@OriginalMember(owner = "client!lj", name = "a", descriptor = "([IIII)V")
	public void method3839(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		arg0[0] = this.anInt4483;
		arg0[2] = arg1 + this.anInt4471 - this.anInt4476;
		arg0[1] = arg2 + this.anInt4482 - this.anInt4484;
	}

	@OriginalMember(owner = "client!lj", name = "a", descriptor = "(BII)Z")
	public boolean method3840(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		return this.anInt4484 <= arg1 && this.anInt4473 >= arg1 && this.anInt4476 <= arg0 && this.anInt4479 >= arg0;
	}

	@OriginalMember(owner = "client!lj", name = "a", descriptor = "(IIII)Z")
	public boolean method3841(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		return this.anInt4483 == arg1 && arg0 >= this.anInt4482 && arg0 <= this.anInt4486 && arg2 >= this.anInt4471 && arg2 <= this.anInt4472;
	}

	@OriginalMember(owner = "client!lj", name = "a", descriptor = "([IBII)V")
	public void method3842(@OriginalArg(0) int[] arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		arg0[1] = arg2 + this.anInt4484 - this.anInt4482;
		arg0[2] = arg1 + this.anInt4476 - this.anInt4471;
		arg0[0] = 0;
	}

	@OriginalMember(owner = "client!lj", name = "a", descriptor = "(IIZ)Z")
	public boolean method3843(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return arg0 >= this.anInt4482 && arg0 <= this.anInt4486 && arg1 >= this.anInt4471 && arg1 <= this.anInt4472;
	}
}
