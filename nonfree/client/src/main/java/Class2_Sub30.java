import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vd")
public final class Class2_Sub30 extends Class2 {

	@OriginalMember(owner = "client!vd", name = "C", descriptor = "I")
	public int anInt5728;

	@OriginalMember(owner = "client!vd", name = "m", descriptor = "I")
	public int anInt5715;

	@OriginalMember(owner = "client!vd", name = "y", descriptor = "I")
	public int anInt5725;

	@OriginalMember(owner = "client!vd", name = "n", descriptor = "I")
	private int anInt5716;

	@OriginalMember(owner = "client!vd", name = "o", descriptor = "I")
	public int anInt5717;

	@OriginalMember(owner = "client!vd", name = "F", descriptor = "I")
	private int anInt5730;

	@OriginalMember(owner = "client!vd", name = "s", descriptor = "I")
	private int anInt5721;

	@OriginalMember(owner = "client!vd", name = "r", descriptor = "I")
	private int anInt5720;

	@OriginalMember(owner = "client!vd", name = "G", descriptor = "I")
	private int anInt5731;

	@OriginalMember(owner = "client!vd", name = "l", descriptor = "I")
	private int anInt5714;

	@OriginalMember(owner = "client!vd", name = "<init>", descriptor = "(IIIIIIIIII)V")
	public Class2_Sub30(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9) {
		this.anInt5728 = arg9;
		this.anInt5715 = arg6;
		this.anInt5725 = arg8;
		this.anInt5716 = arg1;
		this.anInt5717 = arg7;
		this.anInt5730 = arg4;
		this.anInt5721 = arg5;
		this.anInt5720 = arg3;
		this.anInt5731 = arg2;
		this.anInt5714 = arg0;
	}

	@OriginalMember(owner = "client!vd", name = "a", descriptor = "(II[II)V")
	public void method4511(@OriginalArg(0) int arg0, @OriginalArg(2) int[] arg1, @OriginalArg(3) int arg2) {
		arg1[0] = this.anInt5714;
		arg1[2] = this.anInt5720 + arg0 - this.anInt5717;
		arg1[1] = arg2 + this.anInt5731 - this.anInt5715;
	}

	@OriginalMember(owner = "client!vd", name = "a", descriptor = "(III)Z")
	public boolean method4512(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		return arg0 >= this.anInt5731 && this.anInt5730 >= arg0 && this.anInt5720 <= arg1 && this.anInt5721 >= arg1;
	}

	@OriginalMember(owner = "client!vd", name = "a", descriptor = "(IBII)Z")
	public boolean method4517(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		return arg1 == this.anInt5714 && this.anInt5731 <= arg0 && this.anInt5730 >= arg0 && this.anInt5720 <= arg2 && arg2 <= this.anInt5721;
	}

	@OriginalMember(owner = "client!vd", name = "a", descriptor = "(IIB)Z")
	public boolean method4518(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return this.anInt5715 <= arg1 && this.anInt5725 >= arg1 && arg0 >= this.anInt5717 && this.anInt5728 >= arg0;
	}

	@OriginalMember(owner = "client!vd", name = "a", descriptor = "(BII[I)V")
	public void method4519(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int[] arg2) {
		arg2[1] = arg0 + this.anInt5715 - this.anInt5731;
		arg2[2] = arg1 + this.anInt5717 - this.anInt5720;
		arg2[0] = this.anInt5716;
	}
}
