import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ke")
public final class Class1_Sub28 extends Class1 {

	@OriginalMember(owner = "client!ke", name = "p", descriptor = "I")
	public final int anInt4864;

	@OriginalMember(owner = "client!ke", name = "l", descriptor = "I")
	private final int anInt4860;

	@OriginalMember(owner = "client!ke", name = "t", descriptor = "I")
	private final int anInt4868;

	@OriginalMember(owner = "client!ke", name = "o", descriptor = "I")
	private final int anInt4863;

	@OriginalMember(owner = "client!ke", name = "A", descriptor = "I")
	private final int anInt4874;

	@OriginalMember(owner = "client!ke", name = "r", descriptor = "I")
	public final int anInt4866;

	@OriginalMember(owner = "client!ke", name = "v", descriptor = "I")
	public final int anInt4870;

	@OriginalMember(owner = "client!ke", name = "u", descriptor = "I")
	public final int anInt4869;

	@OriginalMember(owner = "client!ke", name = "y", descriptor = "I")
	private final int anInt4873;

	static {
		new Class306(" days.", " Tage.", " jours.", " dias.");
	}

	@OriginalMember(owner = "client!ke", name = "<init>", descriptor = "(IIIIIIIII)V")
	public Class1_Sub28(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8) {
		this.anInt4864 = arg6;
		this.anInt4860 = arg3;
		this.anInt4868 = arg1;
		this.anInt4863 = arg2;
		this.anInt4874 = arg4;
		this.anInt4866 = arg8;
		this.anInt4870 = arg5;
		this.anInt4869 = arg7;
		this.anInt4873 = arg0;
	}

	@OriginalMember(owner = "client!ke", name = "a", descriptor = "(IIII)Z")
	public boolean method4192(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		return this.anInt4873 == arg0 && arg1 >= this.anInt4868 && this.anInt4860 >= arg1 && this.anInt4863 <= arg2 && arg2 <= this.anInt4874;
	}

	@OriginalMember(owner = "client!ke", name = "a", descriptor = "([IIII)V")
	public void method4193(@OriginalArg(0) int[] arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		arg0[2] = arg1 + this.anInt4864 - this.anInt4863;
		arg0[1] = arg2 + this.anInt4870 - this.anInt4868;
		arg0[0] = 0;
	}

	@OriginalMember(owner = "client!ke", name = "a", descriptor = "(I[III)V")
	public void method4194(@OriginalArg(0) int arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) int arg2) {
		arg1[1] = arg2 + this.anInt4868 - this.anInt4870;
		arg1[2] = arg0 + this.anInt4863 - this.anInt4864;
		arg1[0] = this.anInt4873;
	}

	@OriginalMember(owner = "client!ke", name = "a", descriptor = "(III)Z")
	public boolean method4196(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return arg0 >= this.anInt4870 && arg0 <= this.anInt4869 && this.anInt4864 <= arg1 && arg1 <= this.anInt4866;
	}

	@OriginalMember(owner = "client!ke", name = "b", descriptor = "(III)Z")
	public boolean method4197(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		return arg0 >= this.anInt4868 && arg0 <= this.anInt4860 && this.anInt4863 <= arg1 && this.anInt4874 >= arg1;
	}
}
