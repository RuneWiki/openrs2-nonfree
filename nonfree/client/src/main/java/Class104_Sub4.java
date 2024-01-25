import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!st")
public final class Class104_Sub4 extends Class104 {

	@OriginalMember(owner = "client!st", name = "z", descriptor = "I")
	private final int anInt5824;

	@OriginalMember(owner = "client!st", name = "u", descriptor = "I")
	private final int anInt5820;

	@OriginalMember(owner = "client!st", name = "m", descriptor = "I")
	private final int anInt5813;

	@OriginalMember(owner = "client!st", name = "q", descriptor = "I")
	private final int anInt5817;

	@OriginalMember(owner = "client!st", name = "<init>", descriptor = "(IIIIIII)V")
	public Class104_Sub4(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		super(arg4, arg5, arg6);
		this.anInt5824 = arg0;
		this.anInt5820 = arg3;
		this.anInt5813 = arg2;
		this.anInt5817 = arg1;
	}

	@OriginalMember(owner = "client!st", name = "a", descriptor = "(BII)V")
	@Override
	public void method5084(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
	}

	@OriginalMember(owner = "client!st", name = "a", descriptor = "(ZII)V")
	@Override
	public void method5079(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(15) int local15 = this.anInt5824 * arg0 >> 12;
		@Pc(22) int local22 = this.anInt5813 * arg0 >> 12;
		@Pc(29) int local29 = this.anInt5817 * arg1 >> 12;
		@Pc(36) int local36 = arg1 * this.anInt5820 >> 12;
		Static195.method3257(super.anInt5808, local22, local15, local29, local36);
	}

	@OriginalMember(owner = "client!st", name = "a", descriptor = "(III)V")
	@Override
	public void method5080(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(10) int local10 = this.anInt5824 * arg1 >> 12;
		@Pc(17) int local17 = arg1 * this.anInt5813 >> 12;
		@Pc(29) int local29 = this.anInt5817 * arg0 >> 12;
		@Pc(36) int local36 = arg0 * this.anInt5820 >> 12;
		Static343.method5243(super.anInt5808, super.anInt5806, local10, local17, local36, local29, super.anInt5807);
	}
}
