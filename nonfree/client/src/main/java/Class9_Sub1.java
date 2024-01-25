import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!aea")
public final class Class9_Sub1 extends Class9 {

	@OriginalMember(owner = "client!aea", name = "n", descriptor = "I")
	private final int anInt133;

	@OriginalMember(owner = "client!aea", name = "o", descriptor = "I")
	private final int anInt134;

	@OriginalMember(owner = "client!aea", name = "l", descriptor = "I")
	private final int anInt131;

	@OriginalMember(owner = "client!aea", name = "m", descriptor = "I")
	private final int anInt132;

	@OriginalMember(owner = "client!aea", name = "<init>", descriptor = "(IIIIIII)V")
	public Class9_Sub1(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		super(arg4, arg5, arg6);
		this.anInt133 = arg0;
		this.anInt134 = arg3;
		this.anInt131 = arg1;
		this.anInt132 = arg2;
	}

	@OriginalMember(owner = "client!aea", name = "b", descriptor = "(IIB)V")
	@Override
	public void method7305(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(16) int local16 = arg1 * this.anInt133 >> 12;
		@Pc(23) int local23 = this.anInt132 * arg1 >> 12;
		@Pc(30) int local30 = this.anInt131 * arg0 >> 12;
		@Pc(37) int local37 = arg0 * this.anInt134 >> 12;
		Static575.method7933(local23, local16, local30, local37, super.anInt8565);
	}

	@OriginalMember(owner = "client!aea", name = "a", descriptor = "(IIB)V")
	@Override
	public void method7304(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(10) int local10 = this.anInt133 * arg0 >> 12;
		@Pc(21) int local21 = arg0 * this.anInt132 >> 12;
		@Pc(28) int local28 = arg1 * this.anInt131 >> 12;
		@Pc(35) int local35 = arg1 * this.anInt134 >> 12;
		Static445.method6462(local10, local21, local28, local35, super.anInt8563, super.anInt8564, super.anInt8565);
	}

	@OriginalMember(owner = "client!aea", name = "a", descriptor = "(III)V")
	@Override
	public void method7306(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(10) int local10 = this.anInt133 * arg0 >> 12;
		@Pc(23) int local23 = this.anInt132 * arg0 >> 12;
		@Pc(30) int local30 = arg1 * this.anInt131 >> 12;
		@Pc(37) int local37 = arg1 * this.anInt134 >> 12;
		Static640.method8648(local37, super.anInt8563, local30, super.anInt8564, local10, local23);
	}
}
