import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!um")
public final class Class53_Sub4 extends Class53 {

	@OriginalMember(owner = "client!um", name = "t", descriptor = "I")
	private final int anInt9780;

	@OriginalMember(owner = "client!um", name = "k", descriptor = "I")
	private final int anInt9773;

	@OriginalMember(owner = "client!um", name = "r", descriptor = "I")
	private final int anInt9778;

	@OriginalMember(owner = "client!um", name = "q", descriptor = "I")
	private final int anInt9777;

	@OriginalMember(owner = "client!um", name = "<init>", descriptor = "(IIIIIII)V")
	public Class53_Sub4(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		super(arg4, arg5, arg6);
		this.anInt9780 = arg1;
		this.anInt9773 = arg2;
		this.anInt9778 = arg0;
		this.anInt9777 = arg3;
	}

	@OriginalMember(owner = "client!um", name = "a", descriptor = "(III)V")
	@Override
	public void method8328(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(10) int local10 = arg1 * this.anInt9778 >> 12;
		@Pc(21) int local21 = arg1 * this.anInt9773 >> 12;
		@Pc(28) int local28 = arg0 * this.anInt9780 >> 12;
		@Pc(35) int local35 = arg0 * this.anInt9777 >> 12;
		Static85.method1799(super.anInt9772, local21, super.anInt9768, super.anInt9767, local35, local10, local28);
	}

	@OriginalMember(owner = "client!um", name = "b", descriptor = "(III)V")
	@Override
	public void method8329(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
	}

	@OriginalMember(owner = "client!um", name = "a", descriptor = "(ZII)V")
	@Override
	public void method8322(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(10) int local10 = arg1 * this.anInt9778 >> 12;
		@Pc(25) int local25 = arg1 * this.anInt9773 >> 12;
		@Pc(32) int local32 = arg0 * this.anInt9780 >> 12;
		@Pc(39) int local39 = this.anInt9777 * arg0 >> 12;
		Static311.method8604(local10, local25, super.anInt9767, local32, local39);
	}
}
