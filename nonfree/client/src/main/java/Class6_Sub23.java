import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hg")
public final class Class6_Sub23 extends Class6 {

	@OriginalMember(owner = "client!hg", name = "v", descriptor = "I")
	public final int anInt4118;

	@OriginalMember(owner = "client!hg", name = "u", descriptor = "I")
	public final int anInt4117;

	@OriginalMember(owner = "client!hg", name = "o", descriptor = "I")
	public final int anInt4112;

	@OriginalMember(owner = "client!hg", name = "n", descriptor = "I")
	private final int anInt4111;

	@OriginalMember(owner = "client!hg", name = "t", descriptor = "I")
	private final int anInt4116;

	@OriginalMember(owner = "client!hg", name = "x", descriptor = "I")
	private final int anInt4119;

	@OriginalMember(owner = "client!hg", name = "B", descriptor = "I")
	private final int anInt4123;

	@OriginalMember(owner = "client!hg", name = "C", descriptor = "I")
	public final int anInt4124;

	@OriginalMember(owner = "client!hg", name = "D", descriptor = "I")
	private final int anInt4125;

	@OriginalMember(owner = "client!hg", name = "<init>", descriptor = "(IIIIIIIII)V")
	public Class6_Sub23(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8) {
		this.anInt4118 = arg6;
		this.anInt4117 = arg7;
		this.anInt4112 = arg5;
		this.anInt4111 = arg3;
		this.anInt4116 = arg2;
		this.anInt4119 = arg4;
		this.anInt4123 = arg1;
		this.anInt4124 = arg8;
		this.anInt4125 = arg0;
	}

	@OriginalMember(owner = "client!hg", name = "a", descriptor = "(I[III)V")
	public void method3593(@OriginalArg(0) int arg0, @OriginalArg(1) int[] arg1, @OriginalArg(3) int arg2) {
		arg1[1] = this.anInt4112 + arg2 - this.anInt4123;
		arg1[2] = arg0 + this.anInt4118 - this.anInt4116;
		arg1[0] = 0;
	}

	@OriginalMember(owner = "client!hg", name = "a", descriptor = "(IIII)Z")
	public boolean method3595(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		return this.anInt4125 == arg0 && arg2 >= this.anInt4123 && this.anInt4111 >= arg2 && this.anInt4116 <= arg1 && this.anInt4119 >= arg1;
	}

	@OriginalMember(owner = "client!hg", name = "a", descriptor = "(III)Z")
	public boolean method3596(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return this.anInt4112 <= arg1 && this.anInt4117 >= arg1 && this.anInt4118 <= arg0 && this.anInt4124 >= arg0;
	}

	@OriginalMember(owner = "client!hg", name = "a", descriptor = "(I[IIZ)V")
	public void method3597(@OriginalArg(0) int arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) int arg2) {
		arg1[1] = arg2 + this.anInt4123 - this.anInt4112;
		arg1[2] = arg0 + this.anInt4116 - this.anInt4118;
		arg1[0] = this.anInt4125;
	}

	@OriginalMember(owner = "client!hg", name = "b", descriptor = "(III)Z")
	public boolean method3598(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		return arg0 >= this.anInt4123 && arg0 <= this.anInt4111 && arg1 >= this.anInt4116 && arg1 <= this.anInt4119;
	}
}
