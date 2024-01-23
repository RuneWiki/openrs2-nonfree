import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kk")
public final class Class1_Sub19 extends Class1 {

	@OriginalMember(owner = "client!kk", name = "s", descriptor = "I")
	public int anInt2924;

	@OriginalMember(owner = "client!kk", name = "y", descriptor = "I")
	public int anInt2928;

	@OriginalMember(owner = "client!kk", name = "o", descriptor = "I")
	private int anInt2920;

	@OriginalMember(owner = "client!kk", name = "n", descriptor = "I")
	private int anInt2919;

	@OriginalMember(owner = "client!kk", name = "l", descriptor = "I")
	private int anInt2917;

	@OriginalMember(owner = "client!kk", name = "B", descriptor = "I")
	private int anInt2930;

	@OriginalMember(owner = "client!kk", name = "r", descriptor = "I")
	private int anInt2923;

	@OriginalMember(owner = "client!kk", name = "E", descriptor = "I")
	private int anInt2933;

	@OriginalMember(owner = "client!kk", name = "w", descriptor = "I")
	public int anInt2926;

	@OriginalMember(owner = "client!kk", name = "p", descriptor = "I")
	public int anInt2921;

	@OriginalMember(owner = "client!kk", name = "<init>", descriptor = "(IIIIIIIIII)V")
	public Class1_Sub19(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9) {
		this.anInt2924 = arg9;
		this.anInt2928 = arg7;
		this.anInt2920 = arg3;
		this.anInt2919 = arg2;
		this.anInt2917 = arg4;
		this.anInt2930 = arg0;
		this.anInt2923 = arg5;
		this.anInt2933 = arg1;
		this.anInt2926 = arg6;
		this.anInt2921 = arg8;
	}

	@OriginalMember(owner = "client!kk", name = "a", descriptor = "(III)Z")
	public boolean method2511(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		return arg0 >= this.anInt2926 && arg0 <= this.anInt2921 && arg1 >= this.anInt2928 && arg1 <= this.anInt2924;
	}

	@OriginalMember(owner = "client!kk", name = "a", descriptor = "([IIBI)V")
	public void method2513(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		arg0[1] = this.anInt2919 + arg2 - this.anInt2926;
		arg0[0] = this.anInt2930;
		arg0[2] = arg1 + this.anInt2920 - this.anInt2928;
	}

	@OriginalMember(owner = "client!kk", name = "a", descriptor = "(IBII)Z")
	public boolean method2516(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		return this.anInt2930 == arg0 && this.anInt2919 <= arg1 && arg1 <= this.anInt2917 && this.anInt2920 <= arg2 && this.anInt2923 >= arg2;
	}

	@OriginalMember(owner = "client!kk", name = "a", descriptor = "(IZI)Z")
	public boolean method2518(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		return this.anInt2919 <= arg1 && this.anInt2917 >= arg1 && this.anInt2920 <= arg0 && this.anInt2923 >= arg0;
	}

	@OriginalMember(owner = "client!kk", name = "a", descriptor = "(IIZ[I)V")
	public void method2519(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int[] arg2) {
		arg2[0] = this.anInt2933;
		arg2[1] = arg0 + this.anInt2926 - this.anInt2919;
		arg2[2] = arg1 + this.anInt2928 - this.anInt2920;
	}
}
