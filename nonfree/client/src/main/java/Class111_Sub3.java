import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!mj")
public final class Class111_Sub3 extends Class111 {

	@OriginalMember(owner = "client!mj", name = "q", descriptor = "I")
	private final int anInt5893;

	@OriginalMember(owner = "client!mj", name = "k", descriptor = "I")
	private final int anInt5888;

	@OriginalMember(owner = "client!mj", name = "o", descriptor = "I")
	private final int anInt5891;

	@OriginalMember(owner = "client!mj", name = "f", descriptor = "I")
	private final int anInt5885;

	@OriginalMember(owner = "client!mj", name = "<init>", descriptor = "(IIIIIII)V")
	public Class111_Sub3(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		super(arg4, arg5, arg6);
		this.anInt5893 = arg3;
		this.anInt5888 = arg2;
		this.anInt5891 = arg1;
		this.anInt5885 = arg0;
	}

	@OriginalMember(owner = "client!mj", name = "a", descriptor = "(IIB)V")
	@Override
	public void method7713(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(16) int local16 = this.anInt5885 * arg1 >> 12;
		@Pc(23) int local23 = arg1 * this.anInt5888 >> 12;
		@Pc(30) int local30 = this.anInt5891 * arg0 >> 12;
		@Pc(37) int local37 = arg0 * this.anInt5893 >> 12;
		Static350.method6848(local16, super.anInt9309, local37, super.anInt9311, local23, super.anInt9310, local30);
	}

	@OriginalMember(owner = "client!mj", name = "a", descriptor = "(III)V")
	@Override
	public void method7711(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(10) int local10 = this.anInt5885 * arg0 >> 12;
		@Pc(17) int local17 = arg0 * this.anInt5888 >> 12;
		@Pc(24) int local24 = this.anInt5891 * arg1 >> 12;
		@Pc(31) int local31 = arg1 * this.anInt5893 >> 12;
		Static452.method6299(local17, local24, local10, super.anInt9309, local31);
	}

	@OriginalMember(owner = "client!mj", name = "a", descriptor = "(IZI)V")
	@Override
	public void method7714(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(10) int local10 = arg0 * this.anInt5885 >> 12;
		@Pc(21) int local21 = arg0 * this.anInt5888 >> 12;
		@Pc(28) int local28 = this.anInt5891 * arg1 >> 12;
		@Pc(35) int local35 = this.anInt5893 * arg1 >> 12;
		Static474.method6506(super.anInt9311, super.anInt9310, local21, local28, local10, local35);
	}
}
