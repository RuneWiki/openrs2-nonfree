import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!th")
public final class Class78_Sub4 extends Class78 {

	@OriginalMember(owner = "client!th", name = "r", descriptor = "I")
	private final int anInt6439;

	@OriginalMember(owner = "client!th", name = "n", descriptor = "I")
	private final int anInt6435;

	@OriginalMember(owner = "client!th", name = "k", descriptor = "I")
	private final int anInt6432;

	@OriginalMember(owner = "client!th", name = "q", descriptor = "I")
	private final int anInt6438;

	@OriginalMember(owner = "client!th", name = "<init>", descriptor = "(IIIIII)V")
	public Class78_Sub4(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		super(-1, arg4, arg5);
		this.anInt6439 = arg1;
		this.anInt6435 = arg3;
		this.anInt6432 = arg0;
		this.anInt6438 = arg2;
	}

	@OriginalMember(owner = "client!th", name = "a", descriptor = "(IIZ)V")
	@Override
	public void method5064(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
	}

	@OriginalMember(owner = "client!th", name = "b", descriptor = "(III)V")
	@Override
	public void method5067(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
	}

	@OriginalMember(owner = "client!th", name = "a", descriptor = "(III)V")
	@Override
	public void method5065(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(18) int local18 = arg0 * this.anInt6432 >> 12;
		@Pc(25) int local25 = this.anInt6438 * arg0 >> 12;
		@Pc(32) int local32 = this.anInt6439 * arg1 >> 12;
		@Pc(39) int local39 = this.anInt6435 * arg1 >> 12;
		Static161.method2329(local25, local18, local32, super.anInt6427, local39);
	}
}
