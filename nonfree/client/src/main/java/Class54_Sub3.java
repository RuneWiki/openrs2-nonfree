import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!sh")
public final class Class54_Sub3 extends Class54 {

	@OriginalMember(owner = "client!sh", name = "A", descriptor = "I")
	private final int anInt3560;

	@OriginalMember(owner = "client!sh", name = "q", descriptor = "I")
	private final int anInt3552;

	@OriginalMember(owner = "client!sh", name = "u", descriptor = "I")
	private final int anInt3556;

	@OriginalMember(owner = "client!sh", name = "y", descriptor = "I")
	private final int anInt3559;

	@OriginalMember(owner = "client!sh", name = "<init>", descriptor = "(IIIIII)V")
	public Class54_Sub3(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		super(-1, arg4, arg5);
		this.anInt3560 = arg3;
		this.anInt3552 = arg0;
		this.anInt3556 = arg2;
		this.anInt3559 = arg1;
	}

	@OriginalMember(owner = "client!sh", name = "c", descriptor = "(III)V")
	@Override
	public void method2770(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(18) int local18 = this.anInt3556 * arg0 >> 12;
		@Pc(25) int local25 = arg1 * this.anInt3559 >> 12;
		@Pc(32) int local32 = this.anInt3552 * arg0 >> 12;
		@Pc(39) int local39 = this.anInt3560 * arg1 >> 12;
		Static106.method1719(local39, local18, local25, local32, super.anInt3666);
	}

	@OriginalMember(owner = "client!sh", name = "b", descriptor = "(III)V")
	@Override
	public void method2769(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
	}

	@OriginalMember(owner = "client!sh", name = "a", descriptor = "(III)V")
	@Override
	public void method2767(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
	}
}
