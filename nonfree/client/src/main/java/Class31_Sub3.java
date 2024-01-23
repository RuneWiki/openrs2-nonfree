import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!qi")
public final class Class31_Sub3 extends Class31 {

	@OriginalMember(owner = "client!qi", name = "q", descriptor = "I")
	private int anInt4825;

	@OriginalMember(owner = "client!qi", name = "r", descriptor = "I")
	private int anInt4826;

	@OriginalMember(owner = "client!qi", name = "p", descriptor = "I")
	private int anInt4824;

	@OriginalMember(owner = "client!qi", name = "o", descriptor = "I")
	private int anInt4823;

	@OriginalMember(owner = "client!qi", name = "<init>", descriptor = "(IIIIIII)V")
	public Class31_Sub3(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		super(arg4, arg5, arg6);
		this.anInt4825 = arg3;
		this.anInt4826 = arg1;
		this.anInt4824 = arg2;
		this.anInt4823 = arg0;
	}

	@OriginalMember(owner = "client!qi", name = "a", descriptor = "(BII)V")
	@Override
	public void method4431(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(10) int local10 = arg1 * this.anInt4823 >> 12;
		@Pc(17) int local17 = this.anInt4824 * arg1 >> 12;
		@Pc(24) int local24 = this.anInt4826 * arg0 >> 12;
		@Pc(31) int local31 = this.anInt4825 * arg0 >> 12;
		Static241.method3786(local10, this.anInt5792, local17, local24, local31, this.anInt5797, this.anInt5791);
	}

	@OriginalMember(owner = "client!qi", name = "a", descriptor = "(ZII)V")
	@Override
	public void method4426(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
	}

	@OriginalMember(owner = "client!qi", name = "a", descriptor = "(IZI)V")
	@Override
	public void method4428(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(6) int local6 = this.anInt4823 * arg0 >> 12;
		@Pc(23) int local23 = arg0 * this.anInt4824 >> 12;
		@Pc(30) int local30 = arg1 * this.anInt4826 >> 12;
		@Pc(37) int local37 = arg1 * this.anInt4825 >> 12;
		Static302.method4615(local23, local6, local37, local30, this.anInt5792);
	}
}
