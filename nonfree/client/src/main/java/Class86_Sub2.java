import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!em")
public final class Class86_Sub2 extends Class86 {

	@OriginalMember(owner = "client!em", name = "j", descriptor = "I")
	private final int anInt2664;

	@OriginalMember(owner = "client!em", name = "l", descriptor = "I")
	private final int anInt2666;

	@OriginalMember(owner = "client!em", name = "e", descriptor = "I")
	private final int anInt2659;

	@OriginalMember(owner = "client!em", name = "i", descriptor = "I")
	private final int anInt2663;

	@OriginalMember(owner = "client!em", name = "h", descriptor = "I")
	private final int anInt2662;

	@OriginalMember(owner = "client!em", name = "m", descriptor = "I")
	private final int anInt2667;

	@OriginalMember(owner = "client!em", name = "q", descriptor = "I")
	private final int anInt2671;

	@OriginalMember(owner = "client!em", name = "o", descriptor = "I")
	private final int anInt2669;

	@OriginalMember(owner = "client!em", name = "<init>", descriptor = "(IIIIIIIIII)V")
	public Class86_Sub2(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9) {
		super(-1, arg8, arg9);
		this.anInt2664 = arg6;
		this.anInt2666 = arg5;
		this.anInt2659 = arg2;
		this.anInt2663 = arg7;
		this.anInt2662 = arg0;
		this.anInt2667 = arg4;
		this.anInt2671 = arg1;
		this.anInt2669 = arg3;
	}

	@OriginalMember(owner = "client!em", name = "b", descriptor = "(III)V")
	@Override
	public void method9264(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
	}

	@OriginalMember(owner = "client!em", name = "c", descriptor = "(III)V")
	@Override
	public void method9265(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
	}

	@OriginalMember(owner = "client!em", name = "a", descriptor = "(III)V")
	@Override
	public void method9263(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(10) int local10 = this.anInt2662 * arg1 >> 12;
		@Pc(17) int local17 = arg0 * this.anInt2671 >> 12;
		@Pc(24) int local24 = this.anInt2659 * arg1 >> 12;
		@Pc(31) int local31 = this.anInt2669 * arg0 >> 12;
		@Pc(38) int local38 = arg1 * this.anInt2667 >> 12;
		@Pc(45) int local45 = this.anInt2666 * arg0 >> 12;
		@Pc(52) int local52 = arg1 * this.anInt2664 >> 12;
		@Pc(65) int local65 = this.anInt2663 * arg0 >> 12;
		Static592.method1598(local24, local52, super.anInt11131, local45, local17, local31, local38, local10, local65);
	}
}
