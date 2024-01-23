import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!un")
public final class Class1_Sub31 extends Class1 {

	@OriginalMember(owner = "client!un", name = "p", descriptor = "I")
	public int anInt5243;

	@OriginalMember(owner = "client!un", name = "t", descriptor = "I")
	private int anInt5246;

	@OriginalMember(owner = "client!un", name = "n", descriptor = "I")
	public int anInt5242;

	@OriginalMember(owner = "client!un", name = "C", descriptor = "I")
	private int anInt5254;

	@OriginalMember(owner = "client!un", name = "F", descriptor = "I")
	private int anInt5256;

	@OriginalMember(owner = "client!un", name = "v", descriptor = "I")
	private int anInt5248;

	@OriginalMember(owner = "client!un", name = "B", descriptor = "I")
	public int anInt5253;

	@OriginalMember(owner = "client!un", name = "l", descriptor = "I")
	private int anInt5240;

	@OriginalMember(owner = "client!un", name = "q", descriptor = "I")
	public int anInt5244;

	@OriginalMember(owner = "client!un", name = "E", descriptor = "I")
	private int anInt5255;

	@OriginalMember(owner = "client!un", name = "<init>", descriptor = "(IIIIIIIIII)V")
	public Class1_Sub31(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9) {
		this.anInt5243 = arg8;
		this.anInt5246 = arg5;
		this.anInt5242 = arg6;
		this.anInt5254 = arg2;
		this.anInt5256 = arg3;
		this.anInt5248 = arg0;
		this.anInt5253 = arg9;
		this.anInt5240 = arg1;
		this.anInt5244 = arg7;
		this.anInt5255 = arg4;
	}

	@OriginalMember(owner = "client!un", name = "a", descriptor = "(IIII)Z")
	public boolean method4352(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		return arg1 == this.anInt5248 && arg2 >= this.anInt5254 && arg2 <= this.anInt5255 && arg0 >= this.anInt5256 && arg0 <= this.anInt5246;
	}

	@OriginalMember(owner = "client!un", name = "a", descriptor = "(IIB)Z")
	public boolean method4353(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return this.anInt5242 <= arg1 && arg1 <= this.anInt5243 && arg0 >= this.anInt5244 && arg0 <= this.anInt5253;
	}

	@OriginalMember(owner = "client!un", name = "b", descriptor = "(III)Z")
	public boolean method4354(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return arg0 >= this.anInt5254 && this.anInt5255 >= arg0 && arg1 >= this.anInt5256 && this.anInt5246 >= arg1;
	}

	@OriginalMember(owner = "client!un", name = "a", descriptor = "(III[I)V")
	public void method4355(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int[] arg2) {
		arg2[0] = this.anInt5248;
		arg2[1] = this.anInt5254 + arg1 - this.anInt5242;
		arg2[2] = arg0 + this.anInt5256 - this.anInt5244;
	}

	@OriginalMember(owner = "client!un", name = "a", descriptor = "(IZ[II)V")
	public void method4358(@OriginalArg(0) int arg0, @OriginalArg(2) int[] arg1, @OriginalArg(3) int arg2) {
		arg1[1] = this.anInt5242 + arg2 - this.anInt5254;
		arg1[2] = arg0 + this.anInt5244 - this.anInt5256;
		arg1[0] = this.anInt5240;
	}
}
