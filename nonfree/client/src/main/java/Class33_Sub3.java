import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!kh")
public final class Class33_Sub3 extends Class33 {

	@OriginalMember(owner = "client!kh", name = "n", descriptor = "I")
	private final int anInt2292;

	@OriginalMember(owner = "client!kh", name = "o", descriptor = "I")
	private final int anInt2293;

	@OriginalMember(owner = "client!kh", name = "y", descriptor = "I")
	private final int anInt2301;

	@OriginalMember(owner = "client!kh", name = "r", descriptor = "I")
	private final int anInt2296;

	@OriginalMember(owner = "client!kh", name = "q", descriptor = "I")
	private final int anInt2295;

	@OriginalMember(owner = "client!kh", name = "A", descriptor = "I")
	private final int anInt2303;

	@OriginalMember(owner = "client!kh", name = "s", descriptor = "I")
	private final int anInt2297;

	@OriginalMember(owner = "client!kh", name = "x", descriptor = "I")
	private final int anInt2300;

	@OriginalMember(owner = "client!kh", name = "<init>", descriptor = "(IIIIIIIIII)V")
	public Class33_Sub3(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9) {
		super(-1, arg8, arg9);
		this.anInt2292 = arg6;
		this.anInt2293 = arg7;
		this.anInt2301 = arg1;
		this.anInt2296 = arg5;
		this.anInt2295 = arg3;
		this.anInt2303 = arg2;
		this.anInt2297 = arg0;
		this.anInt2300 = arg4;
	}

	@OriginalMember(owner = "client!kh", name = "a", descriptor = "(III)V")
	@Override
	public void method2267(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
	}

	@OriginalMember(owner = "client!kh", name = "b", descriptor = "(III)V")
	@Override
	public void method2269(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(10) int local10 = this.anInt2297 * arg0 >> 12;
		@Pc(17) int local17 = arg0 * this.anInt2303 >> 12;
		@Pc(24) int local24 = this.anInt2301 * arg1 >> 12;
		@Pc(31) int local31 = this.anInt2295 * arg1 >> 12;
		@Pc(43) int local43 = this.anInt2300 * arg0 >> 12;
		@Pc(50) int local50 = arg1 * this.anInt2293 >> 12;
		@Pc(57) int local57 = this.anInt2292 * arg0 >> 12;
		@Pc(64) int local64 = this.anInt2296 * arg1 >> 12;
		Static169.method2643(local50, local10, local64, local17, local57, local43, local31, super.anInt3057, local24);
	}

	@OriginalMember(owner = "client!kh", name = "a", descriptor = "(BII)V")
	@Override
	public void method2270(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
	}
}
