import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!q")
public final class Class71_Sub1 extends Class71 {

	@OriginalMember(owner = "client!q", name = "o", descriptor = "I")
	private final int anInt5575;

	@OriginalMember(owner = "client!q", name = "k", descriptor = "I")
	private final int anInt5572;

	@OriginalMember(owner = "client!q", name = "n", descriptor = "I")
	private final int anInt5574;

	@OriginalMember(owner = "client!q", name = "p", descriptor = "I")
	private final int anInt5576;

	@OriginalMember(owner = "client!q", name = "<init>", descriptor = "(IIIIIII)V")
	public Class71_Sub1(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		super(arg4, arg5, arg6);
		this.anInt5575 = arg0;
		this.anInt5572 = arg1;
		this.anInt5574 = arg2;
		this.anInt5576 = arg3;
	}

	@OriginalMember(owner = "client!q", name = "a", descriptor = "(IIZ)V")
	@Override
	public void method5331(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(16) int local16 = this.anInt5575 * arg1 >> 12;
		@Pc(23) int local23 = this.anInt5574 * arg1 >> 12;
		@Pc(30) int local30 = arg0 * this.anInt5572 >> 12;
		@Pc(37) int local37 = this.anInt5576 * arg0 >> 12;
		Static353.method4696(local37, local16, local30, local23, super.anInt6815);
	}

	@OriginalMember(owner = "client!q", name = "a", descriptor = "(IBI)V")
	@Override
	public void method5333(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
	}

	@OriginalMember(owner = "client!q", name = "a", descriptor = "(III)V")
	@Override
	public void method5334(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(10) int local10 = this.anInt5575 * arg0 >> 12;
		@Pc(21) int local21 = arg0 * this.anInt5574 >> 12;
		@Pc(28) int local28 = arg1 * this.anInt5572 >> 12;
		@Pc(35) int local35 = arg1 * this.anInt5576 >> 12;
		Static454.method5981(local35, local28, super.anInt6815, local10, local21, super.anInt6816, super.anInt6817);
	}
}
