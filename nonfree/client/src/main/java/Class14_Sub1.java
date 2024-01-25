import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!b")
public final class Class14_Sub1 extends Class14 {

	@OriginalMember(owner = "client!b", name = "n", descriptor = "I")
	private final int anInt519;

	@OriginalMember(owner = "client!b", name = "m", descriptor = "I")
	private final int anInt518;

	@OriginalMember(owner = "client!b", name = "j", descriptor = "I")
	private final int anInt516;

	@OriginalMember(owner = "client!b", name = "s", descriptor = "I")
	private final int anInt523;

	@OriginalMember(owner = "client!b", name = "<init>", descriptor = "(IIIIIII)V")
	public Class14_Sub1(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		super(arg4, arg5, arg6);
		this.anInt519 = arg3;
		this.anInt518 = arg2;
		this.anInt516 = arg1;
		this.anInt523 = arg0;
	}

	@OriginalMember(owner = "client!b", name = "a", descriptor = "(BII)V")
	@Override
	public void method5442(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(14) int local14 = this.anInt523 * arg1 >> 12;
		@Pc(21) int local21 = arg1 * this.anInt518 >> 12;
		@Pc(28) int local28 = this.anInt516 * arg0 >> 12;
		@Pc(35) int local35 = arg0 * this.anInt519 >> 12;
		Static244.method4383(super.anInt6452, local35, local21, local14, local28);
	}

	@OriginalMember(owner = "client!b", name = "a", descriptor = "(IBI)V")
	@Override
	public void method5443(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(10) int local10 = arg0 * this.anInt523 >> 12;
		@Pc(17) int local17 = arg0 * this.anInt518 >> 12;
		@Pc(24) int local24 = this.anInt516 * arg1 >> 12;
		@Pc(39) int local39 = this.anInt519 * arg1 >> 12;
		Static44.method1027(super.anInt6449, local39, local17, local24, local10, super.anInt6450, super.anInt6452);
	}

	@OriginalMember(owner = "client!b", name = "a", descriptor = "(III)V")
	@Override
	public void method5440(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
	}
}
