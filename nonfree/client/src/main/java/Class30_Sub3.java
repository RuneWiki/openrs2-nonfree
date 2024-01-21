import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!mh")
public final class Class30_Sub3 extends Class30 {

	@OriginalMember(owner = "client!mh", name = "k", descriptor = "I")
	private final int anInt2558;

	@OriginalMember(owner = "client!mh", name = "o", descriptor = "I")
	private final int anInt2562;

	@OriginalMember(owner = "client!mh", name = "v", descriptor = "I")
	private final int anInt2568;

	@OriginalMember(owner = "client!mh", name = "l", descriptor = "I")
	private final int anInt2559;

	@OriginalMember(owner = "client!mh", name = "<init>", descriptor = "(IIIIIII)V")
	public Class30_Sub3(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		super(arg4, arg5, arg6);
		this.anInt2558 = arg3;
		this.anInt2562 = arg1;
		this.anInt2568 = arg0;
		this.anInt2559 = arg2;
	}

	@OriginalMember(owner = "client!mh", name = "a", descriptor = "(IBI)V")
	@Override
	public void method2384(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
	}

	@OriginalMember(owner = "client!mh", name = "b", descriptor = "(III)V")
	@Override
	public void method2390(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(10) int local10 = this.anInt2568 * arg0 >> 12;
		@Pc(21) int local21 = arg1 * this.anInt2562 >> 12;
		@Pc(28) int local28 = arg0 * this.anInt2559 >> 12;
		@Pc(35) int local35 = this.anInt2558 * arg1 >> 12;
		Static52.method835(local35, super.anInt3269, local21, local28, local10);
	}

	@OriginalMember(owner = "client!mh", name = "a", descriptor = "(BII)V")
	@Override
	public void method2391(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(6) int local6 = this.anInt2568 * arg1 >> 12;
		@Pc(17) int local17 = arg1 * this.anInt2559 >> 12;
		@Pc(29) int local29 = this.anInt2562 * arg0 >> 12;
		@Pc(36) int local36 = this.anInt2558 * arg0 >> 12;
		Static183.method2098(super.anInt3269, super.anInt3273, local17, local36, local6, super.anInt3274, local29);
	}
}
