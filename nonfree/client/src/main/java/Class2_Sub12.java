import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fl")
public final class Class2_Sub12 extends Class2 {

	@OriginalMember(owner = "client!fl", name = "z", descriptor = "I")
	public final int anInt2290;

	@OriginalMember(owner = "client!fl", name = "u", descriptor = "I")
	public final int anInt2286;

	@OriginalMember(owner = "client!fl", name = "x", descriptor = "I")
	private final int anInt2289;

	@OriginalMember(owner = "client!fl", name = "s", descriptor = "I")
	private final int anInt2284;

	@OriginalMember(owner = "client!fl", name = "w", descriptor = "I")
	public final int anInt2288;

	@OriginalMember(owner = "client!fl", name = "o", descriptor = "I")
	private final int anInt2280;

	@OriginalMember(owner = "client!fl", name = "F", descriptor = "I")
	public final int anInt2293;

	@OriginalMember(owner = "client!fl", name = "v", descriptor = "I")
	private final int anInt2287;

	@OriginalMember(owner = "client!fl", name = "H", descriptor = "I")
	private final int anInt2294;

	@OriginalMember(owner = "client!fl", name = "<init>", descriptor = "(IIIIIIIII)V")
	public Class2_Sub12(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8) {
		this.anInt2290 = arg7;
		this.anInt2286 = arg8;
		this.anInt2289 = arg4;
		this.anInt2284 = arg3;
		this.anInt2288 = arg6;
		this.anInt2280 = arg2;
		this.anInt2293 = arg5;
		this.anInt2287 = arg1;
		this.anInt2294 = arg0;
	}

	@OriginalMember(owner = "client!fl", name = "a", descriptor = "(IIB)Z")
	public boolean method1830(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return arg1 >= this.anInt2293 && arg1 <= this.anInt2290 && arg0 >= this.anInt2288 && this.anInt2286 >= arg0;
	}

	@OriginalMember(owner = "client!fl", name = "a", descriptor = "(BII)Z")
	public boolean method1831(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		return arg1 >= this.anInt2287 && this.anInt2284 >= arg1 && this.anInt2280 <= arg0 && arg0 <= this.anInt2289;
	}

	@OriginalMember(owner = "client!fl", name = "a", descriptor = "(B[III)V")
	public void method1832(@OriginalArg(1) int[] arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		arg0[0] = 0;
		arg0[2] = arg2 + this.anInt2288 - this.anInt2280;
		arg0[1] = arg1 + this.anInt2293 - this.anInt2287;
	}

	@OriginalMember(owner = "client!fl", name = "a", descriptor = "(IIII)Z")
	public boolean method1837(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		return this.anInt2294 == arg1 && arg2 >= this.anInt2287 && arg2 <= this.anInt2284 && this.anInt2280 <= arg0 && this.anInt2289 >= arg0;
	}

	@OriginalMember(owner = "client!fl", name = "a", descriptor = "([IIZI)V")
	public void method1838(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		arg0[2] = arg2 + this.anInt2280 - this.anInt2288;
		arg0[1] = arg1 + this.anInt2287 - this.anInt2293;
		arg0[0] = this.anInt2294;
	}
}
