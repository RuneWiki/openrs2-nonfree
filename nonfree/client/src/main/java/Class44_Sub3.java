import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!rm")
public final class Class44_Sub3 extends Class44 {

	@OriginalMember(owner = "client!rm", name = "w", descriptor = "I")
	private int anInt4501;

	@OriginalMember(owner = "client!rm", name = "C", descriptor = "I")
	private int anInt4506;

	@OriginalMember(owner = "client!rm", name = "z", descriptor = "I")
	private int anInt4504;

	@OriginalMember(owner = "client!rm", name = "y", descriptor = "I")
	private int anInt4503;

	@OriginalMember(owner = "client!rm", name = "<init>", descriptor = "(IIIIIII)V")
	public Class44_Sub3(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		super(arg4, arg5, arg6);
		this.anInt4501 = arg3;
		this.anInt4506 = arg2;
		this.anInt4504 = arg0;
		this.anInt4503 = arg1;
	}

	@OriginalMember(owner = "client!rm", name = "a", descriptor = "(III)V")
	@Override
	public void method4279(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
	}

	@OriginalMember(owner = "client!rm", name = "b", descriptor = "(BII)V")
	@Override
	public void method4284(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(10) int local10 = this.anInt4504 * arg0 >> 12;
		@Pc(17) int local17 = arg1 * this.anInt4503 >> 12;
		@Pc(32) int local32 = arg1 * this.anInt4501 >> 12;
		@Pc(39) int local39 = arg0 * this.anInt4506 >> 12;
		Static61.method1110(this.anInt4980, this.anInt4974, this.anInt4984, local17, local10, local32, local39);
	}

	@OriginalMember(owner = "client!rm", name = "a", descriptor = "(BII)V")
	@Override
	public void method4277(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(15) int local15 = arg1 * this.anInt4506 >> 12;
		@Pc(22) int local22 = this.anInt4503 * arg0 >> 12;
		@Pc(29) int local29 = arg0 * this.anInt4501 >> 12;
		@Pc(36) int local36 = arg1 * this.anInt4504 >> 12;
		Static168.method2848(local36, local15, this.anInt4980, local22, local29);
	}
}
