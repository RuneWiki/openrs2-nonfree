import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!vfa")
public final class Class130_Sub3 extends Class130 {

	@OriginalMember(owner = "client!vfa", name = "r", descriptor = "I")
	private final int anInt10710;

	@OriginalMember(owner = "client!vfa", name = "u", descriptor = "I")
	private final int anInt10712;

	@OriginalMember(owner = "client!vfa", name = "p", descriptor = "I")
	private final int anInt10714;

	@OriginalMember(owner = "client!vfa", name = "m", descriptor = "I")
	private final int anInt10716;

	@OriginalMember(owner = "client!vfa", name = "<init>", descriptor = "(IIIIIII)V")
	public Class130_Sub3(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		super(arg4, arg5, arg6);
		this.anInt10710 = arg1;
		this.anInt10712 = arg2;
		this.anInt10714 = arg3;
		this.anInt10716 = arg0;
	}

	@OriginalMember(owner = "client!vfa", name = "a", descriptor = "(III)V")
	@Override
	public void method9435(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
	}

	@OriginalMember(owner = "client!vfa", name = "a", descriptor = "(IIB)V")
	@Override
	public void method9436(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(10) int local10 = this.anInt10716 * arg1 >> 12;
		@Pc(17) int local17 = arg1 * this.anInt10712 >> 12;
		@Pc(24) int local24 = this.anInt10710 * arg0 >> 12;
		@Pc(36) int local36 = arg0 * this.anInt10714 >> 12;
		Static406.method6064(super.anInt11292, super.anInt11290, local36, local17, super.anInt11294, local10, local24);
	}

	@OriginalMember(owner = "client!vfa", name = "b", descriptor = "(III)V")
	@Override
	public void method9438(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(10) int local10 = arg1 * this.anInt10716 >> 12;
		@Pc(17) int local17 = arg1 * this.anInt10712 >> 12;
		@Pc(24) int local24 = arg0 * this.anInt10710 >> 12;
		@Pc(31) int local31 = this.anInt10714 * arg0 >> 12;
		Static707.method9224(local17, super.anInt11290, local24, local31, local10);
	}
}
