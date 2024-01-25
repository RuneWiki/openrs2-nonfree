import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!dd")
public final class Class68 {

	@OriginalMember(owner = "client!dd", name = "p", descriptor = "I")
	private int anInt2275;

	@OriginalMember(owner = "client!dd", name = "h", descriptor = "I")
	private int anInt2267;

	@OriginalMember(owner = "client!dd", name = "m", descriptor = "I")
	private int anInt2272;

	@OriginalMember(owner = "client!dd", name = "a", descriptor = "I")
	private int anInt2260;

	@OriginalMember(owner = "client!dd", name = "f", descriptor = "I")
	private int anInt2265;

	@OriginalMember(owner = "client!dd", name = "i", descriptor = "I")
	private int anInt2268;

	@OriginalMember(owner = "client!dd", name = "k", descriptor = "I")
	private int anInt2270;

	@OriginalMember(owner = "client!dd", name = "n", descriptor = "I")
	private int anInt2273;

	@OriginalMember(owner = "client!dd", name = "l", descriptor = "I")
	private int anInt2271;

	@OriginalMember(owner = "client!dd", name = "d", descriptor = "I")
	private int anInt2263;

	@OriginalMember(owner = "client!dd", name = "<init>", descriptor = "(IIIIIIIIII)V")
	public Class68(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9) {
		this.anInt2275 = arg1;
		this.anInt2267 = arg3 * arg3;
		this.anInt2272 = arg2;
		this.anInt2260 = arg0;
		this.anInt2265 = arg4 + this.anInt2260;
		this.anInt2268 = this.anInt2272 + arg8;
		this.anInt2270 = this.anInt2260 + arg5;
		this.anInt2273 = this.anInt2275 + arg7;
		this.anInt2271 = arg6 + this.anInt2275;
		this.anInt2263 = arg9 + this.anInt2272;
	}

	@OriginalMember(owner = "client!dd", name = "a", descriptor = "(IIII)Z")
	public boolean method2048(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		if (this.anInt2265 > arg1 || arg1 > this.anInt2270) {
			return false;
		} else if (arg0 < this.anInt2271 || arg0 > this.anInt2273) {
			return false;
		} else if (this.anInt2268 <= arg2 && arg2 <= this.anInt2263) {
			@Pc(59) int local59 = arg1 - this.anInt2260;
			@Pc(65) int local65 = arg2 - this.anInt2272;
			return local59 * local59 + local65 * local65 < this.anInt2267;
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!dd", name = "a", descriptor = "(IIIIBIIIIII)V")
	public void method2049(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8, @OriginalArg(10) int arg9) {
		this.anInt2275 = arg5;
		this.anInt2267 = arg3 * arg3;
		this.anInt2260 = arg4;
		this.anInt2272 = arg6;
		this.anInt2265 = this.anInt2260 + arg8;
		this.anInt2268 = arg9 + this.anInt2272;
		this.anInt2273 = arg2 + this.anInt2275;
		this.anInt2271 = arg7 + this.anInt2275;
		this.anInt2270 = this.anInt2260 + arg1;
		this.anInt2263 = this.anInt2272 + arg0;
	}
}
