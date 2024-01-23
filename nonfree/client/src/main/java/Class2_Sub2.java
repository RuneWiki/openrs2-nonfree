import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!in")
public final class Class2_Sub2 extends Class2 {

	@OriginalMember(owner = "client!in", name = "n", descriptor = "I")
	private int anInt2318;

	@OriginalMember(owner = "client!in", name = "q", descriptor = "I")
	private int anInt2321;

	@OriginalMember(owner = "client!in", name = "p", descriptor = "I")
	private int anInt2320;

	@OriginalMember(owner = "client!in", name = "k", descriptor = "I")
	private int anInt2315;

	@OriginalMember(owner = "client!in", name = "u", descriptor = "I")
	private int anInt2325;

	@OriginalMember(owner = "client!in", name = "w", descriptor = "I")
	private int anInt2327;

	@OriginalMember(owner = "client!in", name = "r", descriptor = "I")
	private int anInt2322;

	@OriginalMember(owner = "client!in", name = "l", descriptor = "I")
	private int anInt2316;

	@OriginalMember(owner = "client!in", name = "<init>", descriptor = "(IIIIIIIIII)V")
	public Class2_Sub2(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9) {
		super(-1, arg8, arg9);
		this.anInt2318 = arg7;
		this.anInt2321 = arg1;
		this.anInt2320 = arg4;
		this.anInt2315 = arg5;
		this.anInt2325 = arg2;
		this.anInt2327 = arg3;
		this.anInt2322 = arg0;
		this.anInt2316 = arg6;
	}

	@OriginalMember(owner = "client!in", name = "a", descriptor = "(III)V")
	@Override
	public void method4157(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(10) int local10 = arg0 * this.anInt2322 >> 12;
		@Pc(23) int local23 = this.anInt2321 * arg1 >> 12;
		@Pc(30) int local30 = arg0 * this.anInt2325 >> 12;
		@Pc(37) int local37 = arg0 * this.anInt2320 >> 12;
		@Pc(44) int local44 = this.anInt2327 * arg1 >> 12;
		@Pc(51) int local51 = arg1 * this.anInt2315 >> 12;
		@Pc(58) int local58 = this.anInt2316 * arg0 >> 12;
		@Pc(65) int local65 = this.anInt2318 * arg1 >> 12;
		Static176.method2887(local23, local44, local30, local51, local65, local37, this.anInt4979, local10, local58);
	}

	@OriginalMember(owner = "client!in", name = "b", descriptor = "(IBI)V")
	@Override
	public void method4158(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
	}

	@OriginalMember(owner = "client!in", name = "a", descriptor = "(IBI)V")
	@Override
	public void method4154(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
	}
}
