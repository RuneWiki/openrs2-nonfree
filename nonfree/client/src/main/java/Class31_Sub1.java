import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!co")
public final class Class31_Sub1 extends Class31 {

	@OriginalMember(owner = "client!co", name = "x", descriptor = "I")
	private int anInt958;

	@OriginalMember(owner = "client!co", name = "v", descriptor = "I")
	private int anInt956;

	@OriginalMember(owner = "client!co", name = "A", descriptor = "I")
	private int anInt960;

	@OriginalMember(owner = "client!co", name = "r", descriptor = "I")
	private int anInt952;

	@OriginalMember(owner = "client!co", name = "<init>", descriptor = "(IIIIIII)V")
	public Class31_Sub1(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		super(arg4, arg5, arg6);
		this.anInt958 = arg0;
		this.anInt956 = arg1;
		this.anInt960 = arg2;
		this.anInt952 = arg3;
	}

	@OriginalMember(owner = "client!co", name = "a", descriptor = "(IZI)V")
	@Override
	public void method4428(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(16) int local16 = arg0 * this.anInt958 >> 12;
		@Pc(23) int local23 = this.anInt960 * arg0 >> 12;
		@Pc(30) int local30 = arg1 * this.anInt952 >> 12;
		@Pc(37) int local37 = this.anInt956 * arg1 >> 12;
		Static240.method3775(local37, this.anInt5792, local16, local23, local30);
	}

	@OriginalMember(owner = "client!co", name = "a", descriptor = "(ZII)V")
	@Override
	public void method4426(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(10) int local10 = arg1 * this.anInt958 >> 12;
		@Pc(17) int local17 = this.anInt956 * arg0 >> 12;
		@Pc(24) int local24 = arg1 * this.anInt960 >> 12;
		@Pc(31) int local31 = arg0 * this.anInt952 >> 12;
		Static207.method3276(local24, local10, local31, this.anInt5791, local17, this.anInt5797);
	}

	@OriginalMember(owner = "client!co", name = "a", descriptor = "(BII)V")
	@Override
	public void method4431(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(10) int local10 = arg1 * this.anInt958 >> 12;
		@Pc(17) int local17 = arg1 * this.anInt960 >> 12;
		@Pc(30) int local30 = this.anInt956 * arg0 >> 12;
		@Pc(37) int local37 = arg0 * this.anInt952 >> 12;
		Static251.method4184(this.anInt5791, this.anInt5792, local30, local10, local17, local37, this.anInt5797);
	}
}
