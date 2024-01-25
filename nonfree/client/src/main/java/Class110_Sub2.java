import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ku")
public final class Class110_Sub2 extends Class110 {

	@OriginalMember(owner = "client!ku", name = "m", descriptor = "I")
	private final int anInt5508;

	@OriginalMember(owner = "client!ku", name = "h", descriptor = "I")
	private final int anInt5503;

	@OriginalMember(owner = "client!ku", name = "g", descriptor = "I")
	private final int anInt5502;

	@OriginalMember(owner = "client!ku", name = "j", descriptor = "I")
	private final int anInt5505;

	@OriginalMember(owner = "client!ku", name = "<init>", descriptor = "(IIIIIII)V")
	public Class110_Sub2(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		super(arg4, arg5, arg6);
		this.anInt5508 = arg0;
		this.anInt5503 = arg3;
		this.anInt5502 = arg1;
		this.anInt5505 = arg2;
	}

	@OriginalMember(owner = "client!ku", name = "a", descriptor = "(IIB)V")
	@Override
	public void method7738(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(15) int local15 = arg1 * this.anInt5508 >> 12;
		@Pc(22) int local22 = arg1 * this.anInt5505 >> 12;
		@Pc(29) int local29 = this.anInt5502 * arg0 >> 12;
		@Pc(36) int local36 = this.anInt5503 * arg0 >> 12;
		Static125.method2371(local36, local29, super.anInt9842, local15, super.anInt9843, super.anInt9840, local22);
	}

	@OriginalMember(owner = "client!ku", name = "a", descriptor = "(III)V")
	@Override
	public void method7735(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(10) int local10 = arg0 * this.anInt5508 >> 12;
		@Pc(17) int local17 = this.anInt5505 * arg0 >> 12;
		@Pc(24) int local24 = this.anInt5502 * arg1 >> 12;
		@Pc(37) int local37 = arg1 * this.anInt5503 >> 12;
		Static495.method6687(local17, local10, local37, local24, super.anInt9843);
	}

	@OriginalMember(owner = "client!ku", name = "b", descriptor = "(III)V")
	@Override
	public void method7737(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
	}
}
