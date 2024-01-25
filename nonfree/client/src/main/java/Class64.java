import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!em")
public final class Class64 {

	@OriginalMember(owner = "client!em", name = "c", descriptor = "I")
	private int anInt2048;

	@OriginalMember(owner = "client!em", name = "r", descriptor = "I")
	private int anInt2061;

	@OriginalMember(owner = "client!em", name = "f", descriptor = "I")
	private int anInt2051;

	@OriginalMember(owner = "client!em", name = "e", descriptor = "I")
	private int anInt2050;

	@OriginalMember(owner = "client!em", name = "l", descriptor = "I")
	private int anInt2056;

	@OriginalMember(owner = "client!em", name = "d", descriptor = "I")
	private int anInt2049;

	@OriginalMember(owner = "client!em", name = "i", descriptor = "I")
	private int anInt2053;

	@OriginalMember(owner = "client!em", name = "h", descriptor = "I")
	private int anInt2052;

	@OriginalMember(owner = "client!em", name = "p", descriptor = "I")
	private int anInt2059;

	@OriginalMember(owner = "client!em", name = "b", descriptor = "I")
	private int anInt2047;

	@OriginalMember(owner = "client!em", name = "<init>", descriptor = "(IIIIIIIIII)V")
	public Class64(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9) {
		this.anInt2048 = arg3 * arg3;
		this.anInt2061 = arg2;
		this.anInt2051 = arg0;
		this.anInt2050 = arg1;
		this.anInt2056 = arg4 + this.anInt2051;
		this.anInt2049 = this.anInt2050 + arg7;
		this.anInt2053 = arg9 + this.anInt2061;
		this.anInt2052 = arg5 + this.anInt2051;
		this.anInt2059 = this.anInt2061 + arg8;
		this.anInt2047 = arg6 + this.anInt2050;
	}

	@OriginalMember(owner = "client!em", name = "a", descriptor = "(IBII)Z")
	public boolean method1818(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		if (arg1 < this.anInt2056 || this.anInt2052 < arg1) {
			return false;
		} else if (arg0 < this.anInt2047 || arg0 > this.anInt2049) {
			return false;
		} else if (this.anInt2059 <= arg2 && this.anInt2053 >= arg2) {
			@Pc(50) int local50 = arg1 - this.anInt2051;
			@Pc(63) int local63 = arg2 - this.anInt2061;
			return local63 * local63 + local50 * local50 < this.anInt2048;
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!em", name = "a", descriptor = "(IIIIIIIIIII)V")
	public void method1819(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(10) int arg9) {
		this.anInt2050 = arg6;
		this.anInt2051 = arg8;
		this.anInt2061 = arg9;
		this.anInt2048 = arg4 * arg4;
		this.anInt2049 = this.anInt2050 + arg7;
		this.anInt2056 = this.anInt2051 + arg0;
		this.anInt2052 = arg2 + this.anInt2051;
		this.anInt2053 = arg1 + this.anInt2061;
		this.anInt2059 = this.anInt2061 + arg3;
		this.anInt2047 = this.anInt2050 + arg5;
	}
}
