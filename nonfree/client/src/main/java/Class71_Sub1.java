import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!du")
public final class Class71_Sub1 extends Class71 {

	@OriginalMember(owner = "client!du", name = "s", descriptor = "I")
	private final int anInt2661;

	@OriginalMember(owner = "client!du", name = "k", descriptor = "I")
	private final int anInt2653;

	@OriginalMember(owner = "client!du", name = "n", descriptor = "I")
	private final int anInt2656;

	@OriginalMember(owner = "client!du", name = "l", descriptor = "I")
	private final int anInt2654;

	@OriginalMember(owner = "client!du", name = "<init>", descriptor = "(IIIIIII)V")
	public Class71_Sub1(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		super(arg4, arg5, arg6);
		this.anInt2661 = arg2;
		this.anInt2653 = arg0;
		this.anInt2656 = arg3;
		this.anInt2654 = arg1;
	}

	@OriginalMember(owner = "client!du", name = "a", descriptor = "(IIB)V")
	@Override
	public void method6986(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(19) int local19 = arg1 * this.anInt2653 >> 12;
		@Pc(26) int local26 = this.anInt2661 * arg1 >> 12;
		@Pc(33) int local33 = this.anInt2654 * arg0 >> 12;
		@Pc(40) int local40 = arg0 * this.anInt2656 >> 12;
		Static203.method3961(local40, super.anInt8461, local26, super.anInt8462, local33, local19, super.anInt8466);
	}

	@OriginalMember(owner = "client!du", name = "a", descriptor = "(III)V")
	@Override
	public void method6988(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(18) int local18 = arg0 * this.anInt2653 >> 12;
		@Pc(25) int local25 = arg0 * this.anInt2661 >> 12;
		@Pc(32) int local32 = this.anInt2654 * arg1 >> 12;
		@Pc(39) int local39 = arg1 * this.anInt2656 >> 12;
		Static370.method5906(local32, local25, super.anInt8462, local18, local39);
	}

	@OriginalMember(owner = "client!du", name = "a", descriptor = "(BII)V")
	@Override
	public void method6990(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(10) int local10 = this.anInt2653 * arg0 >> 12;
		@Pc(17) int local17 = arg0 * this.anInt2661 >> 12;
		@Pc(32) int local32 = arg1 * this.anInt2654 >> 12;
		@Pc(39) int local39 = this.anInt2656 * arg1 >> 12;
		Static410.method6439(local17, super.anInt8461, local32, local10, super.anInt8466, local39);
	}
}
