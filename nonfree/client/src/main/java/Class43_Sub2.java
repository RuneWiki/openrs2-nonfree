import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!lp")
public final class Class43_Sub2 extends Class43 {

	@OriginalMember(owner = "client!lp", name = "v", descriptor = "I")
	private final int anInt3429;

	@OriginalMember(owner = "client!lp", name = "x", descriptor = "I")
	private final int anInt3431;

	@OriginalMember(owner = "client!lp", name = "A", descriptor = "I")
	private final int anInt3434;

	@OriginalMember(owner = "client!lp", name = "u", descriptor = "I")
	private final int anInt3428;

	@OriginalMember(owner = "client!lp", name = "l", descriptor = "I")
	private final int anInt3421;

	@OriginalMember(owner = "client!lp", name = "q", descriptor = "I")
	private final int anInt3424;

	@OriginalMember(owner = "client!lp", name = "n", descriptor = "I")
	private final int anInt3422;

	@OriginalMember(owner = "client!lp", name = "p", descriptor = "I")
	private final int anInt3423;

	@OriginalMember(owner = "client!lp", name = "<init>", descriptor = "(IIIIIIIIII)V")
	public Class43_Sub2(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9) {
		super(-1, arg8, arg9);
		this.anInt3429 = arg5;
		this.anInt3431 = arg7;
		this.anInt3434 = arg2;
		this.anInt3428 = arg0;
		this.anInt3421 = arg6;
		this.anInt3424 = arg3;
		this.anInt3422 = arg1;
		this.anInt3423 = arg4;
	}

	@OriginalMember(owner = "client!lp", name = "a", descriptor = "(III)V")
	@Override
	public void method5170(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(10) int local10 = arg1 * this.anInt3428 >> 12;
		@Pc(17) int local17 = arg0 * this.anInt3422 >> 12;
		@Pc(31) int local31 = arg1 * this.anInt3434 >> 12;
		@Pc(38) int local38 = arg0 * this.anInt3424 >> 12;
		@Pc(45) int local45 = arg1 * this.anInt3423 >> 12;
		@Pc(52) int local52 = this.anInt3429 * arg0 >> 12;
		@Pc(59) int local59 = arg1 * this.anInt3421 >> 12;
		@Pc(66) int local66 = arg0 * this.anInt3431 >> 12;
		Static179.method3448(local38, local10, super.anInt5696, local59, local45, local66, local17, local52, local31);
	}

	@OriginalMember(owner = "client!lp", name = "a", descriptor = "(IIB)V")
	@Override
	public void method5169(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
	}

	@OriginalMember(owner = "client!lp", name = "b", descriptor = "(III)V")
	@Override
	public void method5174(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
	}
}
