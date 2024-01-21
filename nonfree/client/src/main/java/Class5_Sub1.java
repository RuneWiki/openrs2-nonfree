import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ag")
public final class Class5_Sub1 extends Class5 {

	@OriginalMember(owner = "client!ag", name = "y", descriptor = "I")
	private final int anInt210;

	@OriginalMember(owner = "client!ag", name = "p", descriptor = "I")
	private final int anInt203;

	@OriginalMember(owner = "client!ag", name = "t", descriptor = "I")
	private final int anInt205;

	@OriginalMember(owner = "client!ag", name = "u", descriptor = "I")
	private final int anInt206;

	@OriginalMember(owner = "client!ag", name = "<init>", descriptor = "(IIIIIII)V")
	public Class5_Sub1(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		super(arg4, arg5, arg6);
		this.anInt210 = arg3;
		this.anInt203 = arg0;
		this.anInt205 = arg1;
		this.anInt206 = arg2;
	}

	@OriginalMember(owner = "client!ag", name = "a", descriptor = "(BII)V")
	@Override
	public void method2104(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(14) int local14 = this.anInt203 * arg1 >> 12;
		@Pc(25) int local25 = arg1 * this.anInt206 >> 12;
		@Pc(32) int local32 = this.anInt205 * arg0 >> 12;
		@Pc(39) int local39 = arg0 * this.anInt210 >> 12;
		Static190.method3140(local39, local32, local14, super.anInt2783, local25);
	}

	@OriginalMember(owner = "client!ag", name = "b", descriptor = "(BII)V")
	@Override
	public void method2105(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(18) int local18 = this.anInt203 * arg1 >> 12;
		@Pc(25) int local25 = this.anInt206 * arg1 >> 12;
		@Pc(32) int local32 = arg0 * this.anInt205 >> 12;
		@Pc(39) int local39 = arg0 * this.anInt210 >> 12;
		Static23.method420(local25, super.anInt2782, local39, local32, super.anInt2786, local18);
	}

	@OriginalMember(owner = "client!ag", name = "a", descriptor = "(III)V")
	@Override
	public void method2102(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(10) int local10 = arg0 * this.anInt203 >> 12;
		@Pc(17) int local17 = this.anInt206 * arg0 >> 12;
		@Pc(28) int local28 = arg1 * this.anInt205 >> 12;
		@Pc(35) int local35 = this.anInt210 * arg1 >> 12;
		Static185.method3074(local10, super.anInt2786, super.anInt2783, local35, local17, local28, super.anInt2782);
	}
}
