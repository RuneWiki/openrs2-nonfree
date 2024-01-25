import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ra")
public final class Class7_Sub4 extends Class7 {

	@OriginalMember(owner = "client!ra", name = "m", descriptor = "I")
	private final int anInt5778;

	@OriginalMember(owner = "client!ra", name = "u", descriptor = "I")
	private final int anInt5785;

	@OriginalMember(owner = "client!ra", name = "q", descriptor = "I")
	private final int anInt5782;

	@OriginalMember(owner = "client!ra", name = "p", descriptor = "I")
	private final int anInt5781;

	@OriginalMember(owner = "client!ra", name = "j", descriptor = "I")
	private final int anInt5775;

	@OriginalMember(owner = "client!ra", name = "n", descriptor = "I")
	private final int anInt5779;

	@OriginalMember(owner = "client!ra", name = "r", descriptor = "I")
	private final int anInt5783;

	@OriginalMember(owner = "client!ra", name = "l", descriptor = "I")
	private final int anInt5777;

	@OriginalMember(owner = "client!ra", name = "<init>", descriptor = "(IIIIIIIIII)V")
	public Class7_Sub4(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9) {
		super(-1, arg8, arg9);
		this.anInt5778 = arg7;
		this.anInt5785 = arg4;
		this.anInt5782 = arg5;
		this.anInt5781 = arg3;
		this.anInt5775 = arg1;
		this.anInt5779 = arg6;
		this.anInt5783 = arg2;
		this.anInt5777 = arg0;
	}

	@OriginalMember(owner = "client!ra", name = "b", descriptor = "(III)V")
	@Override
	public void method4835(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
	}

	@OriginalMember(owner = "client!ra", name = "c", descriptor = "(III)V")
	@Override
	public void method4836(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
	}

	@OriginalMember(owner = "client!ra", name = "a", descriptor = "(III)V")
	@Override
	public void method4834(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(16) int local16 = arg1 * this.anInt5777 >> 12;
		@Pc(23) int local23 = this.anInt5775 * arg0 >> 12;
		@Pc(30) int local30 = this.anInt5783 * arg1 >> 12;
		@Pc(37) int local37 = arg0 * this.anInt5781 >> 12;
		@Pc(44) int local44 = arg1 * this.anInt5785 >> 12;
		@Pc(51) int local51 = arg0 * this.anInt5782 >> 12;
		@Pc(58) int local58 = this.anInt5779 * arg1 >> 12;
		@Pc(65) int local65 = this.anInt5778 * arg0 >> 12;
		Static147.method2505(local44, local23, local65, local30, local51, local16, local58, super.anInt5773, local37);
	}
}
