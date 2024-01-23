import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!p")
public final class Class25_Sub4 extends Class25 {

	@OriginalMember(owner = "client!p", name = "m", descriptor = "I")
	private int anInt4044;

	@OriginalMember(owner = "client!p", name = "u", descriptor = "I")
	private int anInt4051;

	@OriginalMember(owner = "client!p", name = "k", descriptor = "I")
	private int anInt4042;

	@OriginalMember(owner = "client!p", name = "s", descriptor = "I")
	private int anInt4049;

	@OriginalMember(owner = "client!p", name = "<init>", descriptor = "(IIIIIII)V")
	public Class25_Sub4(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		super(arg4, arg5, arg6);
		this.anInt4044 = arg0;
		this.anInt4051 = arg1;
		this.anInt4042 = arg3;
		this.anInt4049 = arg2;
	}

	@OriginalMember(owner = "client!p", name = "a", descriptor = "(III)V")
	@Override
	public void method3008(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(16) int local16 = this.anInt4044 * arg0 >> 12;
		@Pc(23) int local23 = arg1 * this.anInt4042 >> 12;
		@Pc(30) int local30 = this.anInt4051 * arg1 >> 12;
		@Pc(37) int local37 = this.anInt4049 * arg0 >> 12;
		Static205.method3434(super.anInt4034, local30, local16, local23, local37);
	}

	@OriginalMember(owner = "client!p", name = "a", descriptor = "(IZI)V")
	@Override
	public void method3013(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
	}

	@OriginalMember(owner = "client!p", name = "b", descriptor = "(III)V")
	@Override
	public void method3012(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(10) int local10 = arg0 * this.anInt4049 >> 12;
		@Pc(17) int local17 = arg0 * this.anInt4044 >> 12;
		@Pc(24) int local24 = arg1 * this.anInt4042 >> 12;
		@Pc(31) int local31 = arg1 * this.anInt4051 >> 12;
		Static171.method2966(local10, super.anInt4035, local24, super.anInt4034, super.anInt4038, local17, local31);
	}
}
