import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!kj")
public final class Class45_Sub2 extends Class45 {

	@OriginalMember(owner = "client!kj", name = "n", descriptor = "I")
	private final int anInt2459;

	@OriginalMember(owner = "client!kj", name = "J", descriptor = "I")
	private final int anInt2477;

	@OriginalMember(owner = "client!kj", name = "z", descriptor = "I")
	private final int anInt2470;

	@OriginalMember(owner = "client!kj", name = "s", descriptor = "I")
	private final int anInt2464;

	@OriginalMember(owner = "client!kj", name = "A", descriptor = "I")
	private final int anInt2471;

	@OriginalMember(owner = "client!kj", name = "w", descriptor = "I")
	private final int anInt2468;

	@OriginalMember(owner = "client!kj", name = "p", descriptor = "I")
	private final int anInt2461;

	@OriginalMember(owner = "client!kj", name = "v", descriptor = "I")
	private final int anInt2467;

	@OriginalMember(owner = "client!kj", name = "<init>", descriptor = "(IIIIIIIIII)V")
	public Class45_Sub2(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9) {
		super(-1, arg8, arg9);
		this.anInt2459 = arg6;
		this.anInt2477 = arg4;
		this.anInt2470 = arg1;
		this.anInt2464 = arg5;
		this.anInt2471 = arg2;
		this.anInt2468 = arg7;
		this.anInt2461 = arg3;
		this.anInt2467 = arg0;
	}

	@OriginalMember(owner = "client!kj", name = "a", descriptor = "(BII)V")
	@Override
	public void method2628(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
	}

	@OriginalMember(owner = "client!kj", name = "a", descriptor = "(III)V")
	@Override
	public void method2632(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(6) int local6 = arg1 * this.anInt2467 >> 12;
		@Pc(25) int local25 = this.anInt2470 * arg0 >> 12;
		@Pc(32) int local32 = this.anInt2461 * arg0 >> 12;
		@Pc(39) int local39 = this.anInt2471 * arg1 >> 12;
		@Pc(46) int local46 = arg1 * this.anInt2459 >> 12;
		@Pc(53) int local53 = arg0 * this.anInt2464 >> 12;
		@Pc(60) int local60 = arg0 * this.anInt2468 >> 12;
		@Pc(67) int local67 = arg1 * this.anInt2477 >> 12;
		Static150.method2564(local67, local60, local25, super.anInt3466, local6, local46, local53, local39, local32);
	}

	@OriginalMember(owner = "client!kj", name = "b", descriptor = "(BII)V")
	@Override
	public void method2629(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
	}
}
