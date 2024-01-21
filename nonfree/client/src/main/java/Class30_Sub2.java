import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!lb")
public final class Class30_Sub2 extends Class30 {

	@OriginalMember(owner = "client!lb", name = "p", descriptor = "I")
	private final int anInt2312;

	@OriginalMember(owner = "client!lb", name = "B", descriptor = "I")
	private final int anInt2320;

	@OriginalMember(owner = "client!lb", name = "r", descriptor = "I")
	private final int anInt2314;

	@OriginalMember(owner = "client!lb", name = "y", descriptor = "I")
	private final int anInt2317;

	@OriginalMember(owner = "client!lb", name = "<init>", descriptor = "(IIIIIII)V")
	public Class30_Sub2(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		super(arg4, arg5, arg6);
		this.anInt2312 = arg2;
		this.anInt2320 = arg1;
		this.anInt2314 = arg3;
		this.anInt2317 = arg0;
	}

	@OriginalMember(owner = "client!lb", name = "a", descriptor = "(BII)V")
	@Override
	public void method2391(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(10) int local10 = arg1 * this.anInt2317 >> 12;
		@Pc(17) int local17 = this.anInt2312 * arg1 >> 12;
		@Pc(28) int local28 = this.anInt2314 * arg0 >> 12;
		@Pc(35) int local35 = arg0 * this.anInt2320 >> 12;
		Static99.method1413(super.anInt3274, local17, local35, super.anInt3273, local28, super.anInt3269, local10);
	}

	@OriginalMember(owner = "client!lb", name = "a", descriptor = "(IBI)V")
	@Override
	public void method2384(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(10) int local10 = arg0 * this.anInt2317 >> 12;
		@Pc(17) int local17 = arg0 * this.anInt2312 >> 12;
		@Pc(24) int local24 = arg1 * this.anInt2320 >> 12;
		@Pc(35) int local35 = arg1 * this.anInt2314 >> 12;
		Static114.method1645(local10, super.anInt3274, super.anInt3273, local17, local35, local24);
	}

	@OriginalMember(owner = "client!lb", name = "b", descriptor = "(III)V")
	@Override
	public void method2390(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(10) int local10 = this.anInt2317 * arg0 >> 12;
		@Pc(17) int local17 = this.anInt2314 * arg1 >> 12;
		@Pc(24) int local24 = this.anInt2312 * arg0 >> 12;
		@Pc(35) int local35 = arg1 * this.anInt2320 >> 12;
		Static135.method1931(local17, super.anInt3269, local35, local10, local24);
	}
}
