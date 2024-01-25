import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!uea")
public final class Class125_Sub4 extends Class125 {

	@OriginalMember(owner = "client!uea", name = "j", descriptor = "I")
	private final int anInt9685;

	@OriginalMember(owner = "client!uea", name = "p", descriptor = "I")
	private final int anInt9683;

	@OriginalMember(owner = "client!uea", name = "r", descriptor = "I")
	private final int anInt9687;

	@OriginalMember(owner = "client!uea", name = "v", descriptor = "I")
	private final int anInt9681;

	@OriginalMember(owner = "client!uea", name = "m", descriptor = "I")
	private final int anInt9686;

	@OriginalMember(owner = "client!uea", name = "t", descriptor = "I")
	private final int anInt9677;

	@OriginalMember(owner = "client!uea", name = "h", descriptor = "I")
	private final int anInt9690;

	@OriginalMember(owner = "client!uea", name = "l", descriptor = "I")
	private final int anInt9688;

	@OriginalMember(owner = "client!uea", name = "<init>", descriptor = "(IIIIIIIIII)V")
	public Class125_Sub4(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9) {
		super(-1, arg8, arg9);
		this.anInt9685 = arg5;
		this.anInt9683 = arg6;
		this.anInt9687 = arg3;
		this.anInt9681 = arg4;
		this.anInt9686 = arg0;
		this.anInt9677 = arg1;
		this.anInt9690 = arg7;
		this.anInt9688 = arg2;
	}

	@OriginalMember(owner = "client!uea", name = "a", descriptor = "(ZII)V")
	@Override
	public void method8244(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(20) int local20 = arg0 * this.anInt9686 >> 12;
		@Pc(27) int local27 = arg1 * this.anInt9677 >> 12;
		@Pc(34) int local34 = arg0 * this.anInt9688 >> 12;
		@Pc(41) int local41 = this.anInt9687 * arg1 >> 12;
		@Pc(48) int local48 = this.anInt9681 * arg0 >> 12;
		@Pc(55) int local55 = arg1 * this.anInt9685 >> 12;
		@Pc(62) int local62 = arg0 * this.anInt9683 >> 12;
		@Pc(69) int local69 = this.anInt9690 * arg1 >> 12;
		Static253.method4124(local69, local62, local55, local34, local41, local48, local27, local20, super.anInt9675);
	}

	@OriginalMember(owner = "client!uea", name = "a", descriptor = "(III)V")
	@Override
	public void method8246(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
	}

	@OriginalMember(owner = "client!uea", name = "a", descriptor = "(IIB)V")
	@Override
	public void method8245(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
	}
}
