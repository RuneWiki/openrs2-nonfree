import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rk")
public final class Class5_Sub35 extends Class5 {

	@OriginalMember(owner = "client!rk", name = "s", descriptor = "I")
	private final int anInt5508;

	@OriginalMember(owner = "client!rk", name = "G", descriptor = "I")
	private final int anInt5520;

	@OriginalMember(owner = "client!rk", name = "r", descriptor = "I")
	public final int anInt5507;

	@OriginalMember(owner = "client!rk", name = "H", descriptor = "I")
	private final int anInt5521;

	@OriginalMember(owner = "client!rk", name = "t", descriptor = "I")
	private final int anInt5509;

	@OriginalMember(owner = "client!rk", name = "w", descriptor = "I")
	private final int anInt5511;

	@OriginalMember(owner = "client!rk", name = "M", descriptor = "I")
	public final int anInt5525;

	@OriginalMember(owner = "client!rk", name = "I", descriptor = "I")
	public final int anInt5522;

	@OriginalMember(owner = "client!rk", name = "p", descriptor = "I")
	public final int anInt5505;

	@OriginalMember(owner = "client!rk", name = "<init>", descriptor = "(IIIIIIIII)V")
	public Class5_Sub35(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8) {
		this.anInt5508 = arg4;
		this.anInt5520 = arg1;
		this.anInt5507 = arg6;
		this.anInt5521 = arg3;
		this.anInt5509 = arg2;
		this.anInt5511 = arg0;
		this.anInt5525 = arg5;
		this.anInt5522 = arg8;
		this.anInt5505 = arg7;
	}

	@OriginalMember(owner = "client!rk", name = "a", descriptor = "(IIB)Z")
	public boolean method4871(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return arg0 >= this.anInt5525 && arg0 <= this.anInt5505 && this.anInt5507 <= arg1 && arg1 <= this.anInt5522;
	}

	@OriginalMember(owner = "client!rk", name = "a", descriptor = "([IIII)V")
	public void method4873(@OriginalArg(0) int[] arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		arg0[1] = this.anInt5520 + arg2 - this.anInt5525;
		arg0[0] = this.anInt5511;
		arg0[2] = this.anInt5509 + arg1 - this.anInt5507;
	}

	@OriginalMember(owner = "client!rk", name = "b", descriptor = "(IIB)Z")
	public boolean method4874(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return this.anInt5520 <= arg0 && arg0 <= this.anInt5521 && this.anInt5509 <= arg1 && arg1 <= this.anInt5508;
	}

	@OriginalMember(owner = "client!rk", name = "a", descriptor = "(BIII)Z")
	public boolean method4876(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		return arg1 == this.anInt5511 && arg2 >= this.anInt5520 && this.anInt5521 >= arg2 && this.anInt5509 <= arg0 && arg0 <= this.anInt5508;
	}

	@OriginalMember(owner = "client!rk", name = "a", descriptor = "(II[II)V")
	public void method4878(@OriginalArg(0) int arg0, @OriginalArg(2) int[] arg1, @OriginalArg(3) int arg2) {
		arg1[1] = arg2 + this.anInt5525 - this.anInt5520;
		arg1[0] = 0;
		arg1[2] = arg0 + this.anInt5507 - this.anInt5509;
	}
}
