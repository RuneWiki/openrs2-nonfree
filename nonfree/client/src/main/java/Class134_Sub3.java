import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!rea")
public final class Class134_Sub3 extends Class134 {

	@OriginalMember(owner = "client!rea", name = "h", descriptor = "I")
	private final int anInt8567;

	@OriginalMember(owner = "client!rea", name = "l", descriptor = "I")
	private final int anInt8560;

	@OriginalMember(owner = "client!rea", name = "s", descriptor = "I")
	private final int anInt8562;

	@OriginalMember(owner = "client!rea", name = "i", descriptor = "I")
	private final int anInt8561;

	@OriginalMember(owner = "client!rea", name = "<init>", descriptor = "(IIIIIII)V")
	public Class134_Sub3(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		super(arg4, arg5, arg6);
		this.anInt8567 = arg3;
		this.anInt8560 = arg0;
		this.anInt8562 = arg1;
		this.anInt8561 = arg2;
	}

	@OriginalMember(owner = "client!rea", name = "b", descriptor = "(III)V")
	@Override
	public void method8052(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(10) int local10 = arg0 * this.anInt8560 >> 12;
		@Pc(17) int local17 = this.anInt8561 * arg0 >> 12;
		@Pc(24) int local24 = arg1 * this.anInt8562 >> 12;
		@Pc(31) int local31 = arg1 * this.anInt8567 >> 12;
		Static659.method8790(super.anInt9223, local31, local17, local24, local10);
	}

	@OriginalMember(owner = "client!rea", name = "a", descriptor = "(III)V")
	@Override
	public void method8051(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
	}

	@OriginalMember(owner = "client!rea", name = "a", descriptor = "(IIB)V")
	@Override
	public void method8050(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(10) int local10 = arg0 * this.anInt8560 >> 12;
		@Pc(17) int local17 = arg0 * this.anInt8561 >> 12;
		@Pc(24) int local24 = arg1 * this.anInt8562 >> 12;
		@Pc(39) int local39 = this.anInt8567 * arg1 >> 12;
		Static127.method2489(local24, local10, super.anInt9222, super.anInt9224, local17, super.anInt9223, local39);
	}
}
