import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ro")
public final class Class104_Sub3 extends Class104 {

	@OriginalMember(owner = "client!ro", name = "n", descriptor = "I")
	private final int anInt5935;

	@OriginalMember(owner = "client!ro", name = "r", descriptor = "I")
	private final int anInt5939;

	@OriginalMember(owner = "client!ro", name = "v", descriptor = "I")
	private final int anInt5943;

	@OriginalMember(owner = "client!ro", name = "t", descriptor = "I")
	private final int anInt5941;

	@OriginalMember(owner = "client!ro", name = "<init>", descriptor = "(IIIIIII)V")
	public Class104_Sub3(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		super(arg4, arg5, arg6);
		this.anInt5935 = arg2;
		this.anInt5939 = arg3;
		this.anInt5943 = arg0;
		this.anInt5941 = arg1;
	}

	@OriginalMember(owner = "client!ro", name = "c", descriptor = "(III)V")
	@Override
	public void method5336(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(16) int local16 = this.anInt5943 * arg0 >> 12;
		@Pc(23) int local23 = this.anInt5935 * arg0 >> 12;
		@Pc(30) int local30 = this.anInt5941 * arg1 >> 12;
		@Pc(37) int local37 = arg1 * this.anInt5939 >> 12;
		Static12.method259(local30, super.anInt6746, local37, local16, local23, super.anInt6742);
	}

	@OriginalMember(owner = "client!ro", name = "b", descriptor = "(III)V")
	@Override
	public void method5333(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(15) int local15 = this.anInt5943 * arg1 >> 12;
		@Pc(22) int local22 = this.anInt5935 * arg1 >> 12;
		@Pc(29) int local29 = arg0 * this.anInt5941 >> 12;
		@Pc(36) int local36 = arg0 * this.anInt5939 >> 12;
		Static215.method3375(super.anInt6745, local15, local29, local22, local36);
	}

	@OriginalMember(owner = "client!ro", name = "a", descriptor = "(IZI)V")
	@Override
	public void method5332(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(10) int local10 = arg0 * this.anInt5943 >> 12;
		@Pc(25) int local25 = this.anInt5935 * arg0 >> 12;
		@Pc(32) int local32 = arg1 * this.anInt5941 >> 12;
		@Pc(39) int local39 = this.anInt5939 * arg1 >> 12;
		Static379.method5083(local32, super.anInt6742, local25, super.anInt6746, local39, super.anInt6745, local10);
	}
}
