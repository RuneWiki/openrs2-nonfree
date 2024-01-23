import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!cc")
public final class Class13_Sub2 extends Class13 {

	@OriginalMember(owner = "client!cc", name = "C", descriptor = "I")
	private final int anInt527;

	@OriginalMember(owner = "client!cc", name = "B", descriptor = "I")
	private final int anInt526;

	@OriginalMember(owner = "client!cc", name = "t", descriptor = "I")
	private final int anInt519;

	@OriginalMember(owner = "client!cc", name = "p", descriptor = "I")
	private final int anInt515;

	@OriginalMember(owner = "client!cc", name = "A", descriptor = "I")
	private final int anInt525;

	@OriginalMember(owner = "client!cc", name = "r", descriptor = "I")
	private final int anInt517;

	@OriginalMember(owner = "client!cc", name = "q", descriptor = "I")
	private final int anInt516;

	@OriginalMember(owner = "client!cc", name = "z", descriptor = "I")
	private final int anInt524;

	@OriginalMember(owner = "client!cc", name = "<init>", descriptor = "(IIIIIIIIII)V")
	public Class13_Sub2(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9) {
		super(-1, arg8, arg9);
		this.anInt527 = arg6;
		this.anInt526 = arg1;
		this.anInt519 = arg5;
		this.anInt515 = arg0;
		this.anInt525 = arg3;
		this.anInt517 = arg7;
		this.anInt516 = arg4;
		this.anInt524 = arg2;
	}

	@OriginalMember(owner = "client!cc", name = "a", descriptor = "(III)V")
	@Override
	public void method2676(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
	}

	@OriginalMember(owner = "client!cc", name = "a", descriptor = "(BII)V")
	@Override
	public void method2677(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(10) int local10 = arg0 * this.anInt515 >> 12;
		@Pc(17) int local17 = this.anInt526 * arg1 >> 12;
		@Pc(24) int local24 = arg0 * this.anInt524 >> 12;
		@Pc(31) int local31 = arg0 * this.anInt516 >> 12;
		@Pc(38) int local38 = arg1 * this.anInt519 >> 12;
		@Pc(45) int local45 = this.anInt525 * arg1 >> 12;
		@Pc(52) int local52 = arg0 * this.anInt527 >> 12;
		@Pc(64) int local64 = arg1 * this.anInt517 >> 12;
		Static123.method1274(local10, local64, local31, local45, local24, super.anInt3322, local38, local52, local17);
	}

	@OriginalMember(owner = "client!cc", name = "b", descriptor = "(III)V")
	@Override
	public void method2680(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
	}
}
