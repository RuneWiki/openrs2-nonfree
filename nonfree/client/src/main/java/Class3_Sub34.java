import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mw")
public final class Class3_Sub34 extends Class3 {

	@OriginalMember(owner = "client!mw", name = "x", descriptor = "I")
	public final int anInt4495;

	@OriginalMember(owner = "client!mw", name = "m", descriptor = "I")
	private final int anInt4485;

	@OriginalMember(owner = "client!mw", name = "s", descriptor = "I")
	private final int anInt4491;

	@OriginalMember(owner = "client!mw", name = "t", descriptor = "I")
	public final int anInt4492;

	@OriginalMember(owner = "client!mw", name = "o", descriptor = "I")
	private final int anInt4487;

	@OriginalMember(owner = "client!mw", name = "l", descriptor = "I")
	private final int anInt4484;

	@OriginalMember(owner = "client!mw", name = "r", descriptor = "I")
	public final int anInt4490;

	@OriginalMember(owner = "client!mw", name = "u", descriptor = "I")
	public final int anInt4493;

	@OriginalMember(owner = "client!mw", name = "n", descriptor = "I")
	private final int anInt4486;

	@OriginalMember(owner = "client!mw", name = "<init>", descriptor = "(IIIIIIIII)V")
	public Class3_Sub34(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8) {
		this.anInt4495 = arg6;
		this.anInt4485 = arg2;
		this.anInt4491 = arg3;
		this.anInt4492 = arg7;
		this.anInt4487 = arg1;
		this.anInt4484 = arg0;
		this.anInt4490 = arg8;
		this.anInt4493 = arg5;
		this.anInt4486 = arg4;
	}

	@OriginalMember(owner = "client!mw", name = "a", descriptor = "(III)Z")
	public boolean method3719(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		return this.anInt4487 <= arg1 && arg1 <= this.anInt4491 && arg0 >= this.anInt4485 && this.anInt4486 >= arg0;
	}

	@OriginalMember(owner = "client!mw", name = "a", descriptor = "(IB[II)V")
	public void method3721(@OriginalArg(0) int arg0, @OriginalArg(2) int[] arg1, @OriginalArg(3) int arg2) {
		arg1[2] = this.anInt4485 + arg2 - this.anInt4495;
		arg1[1] = this.anInt4487 + arg0 - this.anInt4493;
		arg1[0] = this.anInt4484;
	}

	@OriginalMember(owner = "client!mw", name = "a", descriptor = "(IIB)Z")
	public boolean method3722(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return arg0 >= this.anInt4493 && this.anInt4492 >= arg0 && arg1 >= this.anInt4495 && this.anInt4490 >= arg1;
	}

	@OriginalMember(owner = "client!mw", name = "a", descriptor = "(IIII)Z")
	public boolean method3723(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		return this.anInt4484 == arg2 && this.anInt4487 <= arg0 && arg0 <= this.anInt4491 && this.anInt4485 <= arg1 && this.anInt4486 >= arg1;
	}

	@OriginalMember(owner = "client!mw", name = "a", descriptor = "([IIII)V")
	public void method3725(@OriginalArg(0) int[] arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		arg0[2] = this.anInt4495 + arg2 - this.anInt4485;
		arg0[0] = 0;
		arg0[1] = arg1 + this.anInt4493 - this.anInt4487;
	}
}
