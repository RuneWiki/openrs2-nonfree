import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!uf")
public final class Class13_Sub4 extends Class13 {

	@OriginalMember(owner = "client!uf", name = "C", descriptor = "[I")
	public static int[] anIntArray529 = new int[99];

	@OriginalMember(owner = "client!uf", name = "y", descriptor = "I")
	private int anInt5554;

	@OriginalMember(owner = "client!uf", name = "A", descriptor = "I")
	private int anInt5556;

	@OriginalMember(owner = "client!uf", name = "s", descriptor = "I")
	private int anInt5550;

	@OriginalMember(owner = "client!uf", name = "o", descriptor = "I")
	private int anInt5546;

	@OriginalMember(owner = "client!uf", name = "z", descriptor = "I")
	private int anInt5555;

	@OriginalMember(owner = "client!uf", name = "u", descriptor = "I")
	private int anInt5552;

	@OriginalMember(owner = "client!uf", name = "F", descriptor = "I")
	private int anInt5560;

	@OriginalMember(owner = "client!uf", name = "x", descriptor = "I")
	private int anInt5553;

	static {
		@Pc(8) int local8 = 0;
		for (@Pc(10) int local10 = 0; local10 < 99; local10++) {
			@Pc(17) int local17 = local10 + 1;
			@Pc(30) int local30 = (int) (Math.pow(2.0D, (double) local17 / 7.0D) * 300.0D + (double) local17);
			local8 += local30;
			anIntArray529[local10] = local8 / 4;
		}
	}

	@OriginalMember(owner = "client!uf", name = "<init>", descriptor = "(IIIIIIIIII)V")
	public Class13_Sub4(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9) {
		super(-1, arg8, arg9);
		this.anInt5554 = arg3;
		this.anInt5556 = arg6;
		this.anInt5550 = arg7;
		this.anInt5546 = arg2;
		this.anInt5555 = arg4;
		this.anInt5552 = arg1;
		this.anInt5560 = arg0;
		this.anInt5553 = arg5;
	}

	@OriginalMember(owner = "client!uf", name = "a", descriptor = "(III)V")
	@Override
	public void method4389(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
	}

	@OriginalMember(owner = "client!uf", name = "c", descriptor = "(III)V")
	@Override
	public void method4392(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
	}

	@OriginalMember(owner = "client!uf", name = "b", descriptor = "(III)V")
	@Override
	public void method4390(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(15) int local15 = this.anInt5552 * arg0 >> 12;
		@Pc(22) int local22 = this.anInt5546 * arg1 >> 12;
		@Pc(29) int local29 = this.anInt5554 * arg0 >> 12;
		@Pc(36) int local36 = arg0 * this.anInt5553 >> 12;
		@Pc(43) int local43 = this.anInt5555 * arg1 >> 12;
		@Pc(50) int local50 = arg1 * this.anInt5560 >> 12;
		@Pc(57) int local57 = arg1 * this.anInt5556 >> 12;
		@Pc(64) int local64 = this.anInt5550 * arg0 >> 12;
		Static11.method223(local15, this.anInt5540, local29, local22, local36, local57, local64, local43, local50);
	}
}
