import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!np")
public final class Class2_Sub31 extends Class2 {

	@OriginalMember(owner = "client!np", name = "E", descriptor = "I")
	private final int anInt4185;

	@OriginalMember(owner = "client!np", name = "J", descriptor = "I")
	private final int anInt4190;

	@OriginalMember(owner = "client!np", name = "I", descriptor = "I")
	public final int anInt4189;

	@OriginalMember(owner = "client!np", name = "y", descriptor = "I")
	public final int anInt4180;

	@OriginalMember(owner = "client!np", name = "x", descriptor = "I")
	public final int anInt4179;

	@OriginalMember(owner = "client!np", name = "G", descriptor = "I")
	public final int anInt4187;

	@OriginalMember(owner = "client!np", name = "r", descriptor = "I")
	private final int anInt4174;

	@OriginalMember(owner = "client!np", name = "B", descriptor = "I")
	private final int anInt4182;

	@OriginalMember(owner = "client!np", name = "H", descriptor = "I")
	private final int anInt4188;

	@OriginalMember(owner = "client!np", name = "<init>", descriptor = "(IIIIIIIII)V")
	public Class2_Sub31(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8) {
		this.anInt4185 = arg4;
		this.anInt4190 = arg1;
		this.anInt4189 = arg6;
		this.anInt4180 = arg7;
		this.anInt4179 = arg8;
		this.anInt4187 = arg5;
		this.anInt4174 = arg2;
		this.anInt4182 = arg0;
		this.anInt4188 = arg3;
	}

	@OriginalMember(owner = "client!np", name = "a", descriptor = "(B[III)V")
	public void method3808(@OriginalArg(1) int[] arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		arg0[2] = arg2 + this.anInt4174 - this.anInt4189;
		arg0[1] = arg1 + this.anInt4190 - this.anInt4187;
		arg0[0] = this.anInt4182;
	}

	@OriginalMember(owner = "client!np", name = "a", descriptor = "([IZII)V")
	public void method3809(@OriginalArg(0) int[] arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		arg0[0] = 0;
		arg0[1] = this.anInt4187 + arg2 - this.anInt4190;
		arg0[2] = this.anInt4189 + arg1 - this.anInt4174;
	}

	@OriginalMember(owner = "client!np", name = "a", descriptor = "(III)Z")
	public boolean method3810(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return arg1 >= this.anInt4187 && this.anInt4180 >= arg1 && this.anInt4189 <= arg0 && arg0 <= this.anInt4179;
	}

	@OriginalMember(owner = "client!np", name = "a", descriptor = "(IIZI)Z")
	public boolean method3811(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		return arg1 == this.anInt4182 && arg0 >= this.anInt4190 && this.anInt4188 >= arg0 && arg2 >= this.anInt4174 && this.anInt4185 >= arg2;
	}

	@OriginalMember(owner = "client!np", name = "a", descriptor = "(IIB)Z")
	public boolean method3814(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return arg1 >= this.anInt4190 && arg1 <= this.anInt4188 && this.anInt4174 <= arg0 && this.anInt4185 >= arg0;
	}
}
