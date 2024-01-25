import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nr")
public final class Class6_Sub25 extends Class6 {

	@OriginalMember(owner = "client!nr", name = "y", descriptor = "I")
	public final int anInt4921;

	@OriginalMember(owner = "client!nr", name = "u", descriptor = "I")
	private final int anInt4917;

	@OriginalMember(owner = "client!nr", name = "v", descriptor = "I")
	private final int anInt4918;

	@OriginalMember(owner = "client!nr", name = "w", descriptor = "I")
	public final int anInt4919;

	@OriginalMember(owner = "client!nr", name = "r", descriptor = "I")
	public final int anInt4914;

	@OriginalMember(owner = "client!nr", name = "A", descriptor = "I")
	private final int anInt4923;

	@OriginalMember(owner = "client!nr", name = "D", descriptor = "I")
	private final int anInt4925;

	@OriginalMember(owner = "client!nr", name = "E", descriptor = "I")
	private final int anInt4926;

	@OriginalMember(owner = "client!nr", name = "t", descriptor = "I")
	public final int anInt4916;

	@OriginalMember(owner = "client!nr", name = "<init>", descriptor = "(IIIIIIIII)V")
	public Class6_Sub25(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8) {
		this.anInt4921 = arg8;
		this.anInt4917 = arg3;
		this.anInt4918 = arg4;
		this.anInt4919 = arg5;
		this.anInt4914 = arg7;
		this.anInt4923 = arg2;
		this.anInt4925 = arg0;
		this.anInt4926 = arg1;
		this.anInt4916 = arg6;
	}

	@OriginalMember(owner = "client!nr", name = "b", descriptor = "(III)Z")
	public boolean method4141(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		return arg1 >= this.anInt4919 && arg1 <= this.anInt4914 && this.anInt4916 <= arg0 && this.anInt4921 >= arg0;
	}

	@OriginalMember(owner = "client!nr", name = "a", descriptor = "(IZI)Z")
	public boolean method4142(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		return this.anInt4926 <= arg0 && this.anInt4917 >= arg0 && this.anInt4923 <= arg1 && this.anInt4918 >= arg1;
	}

	@OriginalMember(owner = "client!nr", name = "a", descriptor = "(I[III)V")
	public void method4143(@OriginalArg(1) int[] arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		arg0[1] = this.anInt4926 + arg2 - this.anInt4919;
		arg0[2] = arg1 + this.anInt4923 - this.anInt4916;
		arg0[0] = this.anInt4925;
	}

	@OriginalMember(owner = "client!nr", name = "a", descriptor = "(III[I)V")
	public void method4144(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int[] arg2) {
		arg2[2] = arg0 + this.anInt4916 - this.anInt4923;
		arg2[1] = this.anInt4919 + arg1 - this.anInt4926;
		arg2[0] = 0;
	}

	@OriginalMember(owner = "client!nr", name = "a", descriptor = "(IIZI)Z")
	public boolean method4146(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		return this.anInt4925 == arg2 && this.anInt4926 <= arg0 && arg0 <= this.anInt4917 && this.anInt4923 <= arg1 && this.anInt4918 >= arg1;
	}
}
