import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!kw")
public final class Class74_Sub2 extends Class74 {

	@OriginalMember(owner = "client!kw", name = "s", descriptor = "I")
	private final int anInt5665;

	@OriginalMember(owner = "client!kw", name = "i", descriptor = "I")
	private final int anInt5672;

	@OriginalMember(owner = "client!kw", name = "o", descriptor = "I")
	private final int anInt5673;

	@OriginalMember(owner = "client!kw", name = "t", descriptor = "I")
	private final int anInt5669;

	@OriginalMember(owner = "client!kw", name = "n", descriptor = "I")
	private final int anInt5667;

	@OriginalMember(owner = "client!kw", name = "r", descriptor = "I")
	private final int anInt5666;

	@OriginalMember(owner = "client!kw", name = "m", descriptor = "I")
	private final int anInt5668;

	@OriginalMember(owner = "client!kw", name = "q", descriptor = "I")
	private final int anInt5670;

	@OriginalMember(owner = "client!kw", name = "<init>", descriptor = "(IIIIIIIIII)V")
	public Class74_Sub2(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9) {
		super(-1, arg8, arg9);
		this.anInt5665 = arg6;
		this.anInt5672 = arg4;
		this.anInt5673 = arg0;
		this.anInt5669 = arg2;
		this.anInt5667 = arg3;
		this.anInt5666 = arg7;
		this.anInt5668 = arg1;
		this.anInt5670 = arg5;
	}

	@OriginalMember(owner = "client!kw", name = "a", descriptor = "(IBI)V")
	@Override
	public void method7572(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(10) int local10 = arg1 * this.anInt5673 >> 12;
		@Pc(17) int local17 = this.anInt5668 * arg0 >> 12;
		@Pc(34) int local34 = arg1 * this.anInt5669 >> 12;
		@Pc(41) int local41 = arg0 * this.anInt5667 >> 12;
		@Pc(48) int local48 = this.anInt5672 * arg1 >> 12;
		@Pc(55) int local55 = this.anInt5670 * arg0 >> 12;
		@Pc(62) int local62 = arg1 * this.anInt5665 >> 12;
		@Pc(69) int local69 = arg0 * this.anInt5666 >> 12;
		Static40.method672(local10, local69, local62, super.anInt8751, local34, local17, local41, local55, local48);
	}

	@OriginalMember(owner = "client!kw", name = "a", descriptor = "(III)V")
	@Override
	public void method7570(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
	}

	@OriginalMember(owner = "client!kw", name = "b", descriptor = "(III)V")
	@Override
	public void method7574(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
	}
}
