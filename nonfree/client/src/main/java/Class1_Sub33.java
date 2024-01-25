import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pb")
public final class Class1_Sub33 extends Class1 {

	@OriginalMember(owner = "client!pb", name = "w", descriptor = "I")
	private final int anInt4773;

	@OriginalMember(owner = "client!pb", name = "p", descriptor = "I")
	private final int anInt4768;

	@OriginalMember(owner = "client!pb", name = "I", descriptor = "I")
	private final int anInt4784;

	@OriginalMember(owner = "client!pb", name = "x", descriptor = "I")
	public final int anInt4774;

	@OriginalMember(owner = "client!pb", name = "F", descriptor = "I")
	private final int anInt4781;

	@OriginalMember(owner = "client!pb", name = "E", descriptor = "I")
	private final int anInt4780;

	@OriginalMember(owner = "client!pb", name = "C", descriptor = "I")
	public final int anInt4779;

	@OriginalMember(owner = "client!pb", name = "B", descriptor = "I")
	public final int anInt4778;

	@OriginalMember(owner = "client!pb", name = "r", descriptor = "I")
	public final int anInt4769;

	@OriginalMember(owner = "client!pb", name = "<init>", descriptor = "(IIIIIIIII)V")
	public Class1_Sub33(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8) {
		this.anInt4773 = arg1;
		this.anInt4768 = arg3;
		this.anInt4784 = arg4;
		this.anInt4774 = arg6;
		this.anInt4781 = arg2;
		this.anInt4780 = arg0;
		this.anInt4779 = arg5;
		this.anInt4778 = arg7;
		this.anInt4769 = arg8;
	}

	@OriginalMember(owner = "client!pb", name = "a", descriptor = "(III)Z")
	public boolean method4374(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		return arg0 >= this.anInt4779 && this.anInt4778 >= arg0 && this.anInt4774 <= arg1 && arg1 <= this.anInt4769;
	}

	@OriginalMember(owner = "client!pb", name = "a", descriptor = "(IIZI)Z")
	public boolean method4376(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		return this.anInt4780 == arg1 && arg2 >= this.anInt4773 && this.anInt4768 >= arg2 && this.anInt4781 <= arg0 && arg0 <= this.anInt4784;
	}

	@OriginalMember(owner = "client!pb", name = "a", descriptor = "(I[III)V")
	public void method4377(@OriginalArg(0) int arg0, @OriginalArg(1) int[] arg1, @OriginalArg(3) int arg2) {
		arg1[0] = 0;
		arg1[1] = this.anInt4779 + arg2 - this.anInt4773;
		arg1[2] = this.anInt4774 + arg0 - this.anInt4781;
	}

	@OriginalMember(owner = "client!pb", name = "a", descriptor = "(I[IIB)V")
	public void method4378(@OriginalArg(0) int arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) int arg2) {
		arg1[2] = arg0 + this.anInt4781 - this.anInt4774;
		arg1[1] = arg2 + this.anInt4773 - this.anInt4779;
		arg1[0] = this.anInt4780;
	}

	@OriginalMember(owner = "client!pb", name = "a", descriptor = "(IZI)Z")
	public boolean method4380(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		return this.anInt4773 <= arg1 && this.anInt4768 >= arg1 && this.anInt4781 <= arg0 && arg0 <= this.anInt4784;
	}
}
