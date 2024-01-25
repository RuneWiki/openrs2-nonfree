import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!sh")
public final class Class82_Sub4 extends Class82 {

	@OriginalMember(owner = "client!sh", name = "h", descriptor = "I")
	private final int anInt6504;

	@OriginalMember(owner = "client!sh", name = "j", descriptor = "I")
	private final int anInt6506;

	@OriginalMember(owner = "client!sh", name = "l", descriptor = "I")
	private final int anInt6508;

	@OriginalMember(owner = "client!sh", name = "m", descriptor = "I")
	private final int anInt6509;

	@OriginalMember(owner = "client!sh", name = "<init>", descriptor = "(IIIIIII)V")
	public Class82_Sub4(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		super(arg4, arg5, arg6);
		this.anInt6504 = arg3;
		this.anInt6506 = arg2;
		this.anInt6508 = arg0;
		this.anInt6509 = arg1;
	}

	@OriginalMember(owner = "client!sh", name = "a", descriptor = "(IZI)V")
	@Override
	public void method5121(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(10) int local10 = arg1 * this.anInt6508 >> 12;
		@Pc(21) int local21 = this.anInt6506 * arg1 >> 12;
		@Pc(28) int local28 = arg0 * this.anInt6509 >> 12;
		@Pc(35) int local35 = arg0 * this.anInt6504 >> 12;
		Static126.method2880(local35, local28, local10, local21, super.anInt6499);
	}

	@OriginalMember(owner = "client!sh", name = "a", descriptor = "(IIB)V")
	@Override
	public void method5119(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(10) int local10 = this.anInt6508 * arg1 >> 12;
		@Pc(17) int local17 = arg1 * this.anInt6506 >> 12;
		@Pc(32) int local32 = arg0 * this.anInt6509 >> 12;
		@Pc(39) int local39 = arg0 * this.anInt6504 >> 12;
		Static126.method2881(local10, super.anInt6498, local39, local32, super.anInt6503, local17);
	}

	@OriginalMember(owner = "client!sh", name = "a", descriptor = "(III)V")
	@Override
	public void method5120(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(10) int local10 = this.anInt6508 * arg1 >> 12;
		@Pc(17) int local17 = arg1 * this.anInt6506 >> 12;
		@Pc(24) int local24 = this.anInt6509 * arg0 >> 12;
		@Pc(38) int local38 = arg0 * this.anInt6504 >> 12;
		Static66.method1283(local24, local10, super.anInt6499, local17, local38, super.anInt6498, super.anInt6503);
	}
}
