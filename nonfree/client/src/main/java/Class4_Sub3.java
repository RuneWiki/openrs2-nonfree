import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ji")
public final class Class4_Sub3 extends Class4 {

	@OriginalMember(owner = "client!ji", name = "w", descriptor = "I")
	private final int anInt2618;

	@OriginalMember(owner = "client!ji", name = "u", descriptor = "I")
	private final int anInt2616;

	@OriginalMember(owner = "client!ji", name = "z", descriptor = "I")
	private final int anInt2621;

	@OriginalMember(owner = "client!ji", name = "q", descriptor = "I")
	private final int anInt2613;

	@OriginalMember(owner = "client!ji", name = "s", descriptor = "I")
	private final int anInt2615;

	@OriginalMember(owner = "client!ji", name = "y", descriptor = "I")
	private final int anInt2620;

	@OriginalMember(owner = "client!ji", name = "v", descriptor = "I")
	private final int anInt2617;

	@OriginalMember(owner = "client!ji", name = "A", descriptor = "I")
	private final int anInt2622;

	@OriginalMember(owner = "client!ji", name = "<init>", descriptor = "(IIIIIIIIII)V")
	public Class4_Sub3(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9) {
		super(-1, arg8, arg9);
		this.anInt2618 = arg7;
		this.anInt2616 = arg3;
		this.anInt2621 = arg0;
		this.anInt2613 = arg1;
		this.anInt2615 = arg2;
		this.anInt2620 = arg6;
		this.anInt2617 = arg4;
		this.anInt2622 = arg5;
	}

	@OriginalMember(owner = "client!ji", name = "a", descriptor = "(IBI)V")
	@Override
	public void method2411(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
	}

	@OriginalMember(owner = "client!ji", name = "a", descriptor = "(IIZ)V")
	@Override
	public void method2415(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
	}

	@OriginalMember(owner = "client!ji", name = "a", descriptor = "(BII)V")
	@Override
	public void method2413(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(10) int local10 = arg1 * this.anInt2621 >> 12;
		@Pc(17) int local17 = this.anInt2613 * arg0 >> 12;
		@Pc(24) int local24 = this.anInt2615 * arg1 >> 12;
		@Pc(31) int local31 = this.anInt2616 * arg0 >> 12;
		@Pc(38) int local38 = arg1 * this.anInt2620 >> 12;
		@Pc(45) int local45 = this.anInt2617 * arg1 >> 12;
		@Pc(52) int local52 = arg0 * this.anInt2618 >> 12;
		@Pc(64) int local64 = arg0 * this.anInt2622 >> 12;
		Static123.method2611(local64, local38, local31, local24, local10, super.anInt3069, local17, local52, local45);
	}
}
