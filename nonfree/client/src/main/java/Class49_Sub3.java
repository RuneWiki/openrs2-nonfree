import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!nk")
public final class Class49_Sub3 extends Class49 {

	@OriginalMember(owner = "client!nk", name = "t", descriptor = "I")
	private final int anInt4261;

	@OriginalMember(owner = "client!nk", name = "r", descriptor = "I")
	private final int anInt4259;

	@OriginalMember(owner = "client!nk", name = "l", descriptor = "I")
	private final int anInt4254;

	@OriginalMember(owner = "client!nk", name = "q", descriptor = "I")
	private final int anInt4258;

	@OriginalMember(owner = "client!nk", name = "<init>", descriptor = "(IIIIII)V")
	public Class49_Sub3(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		super(-1, arg4, arg5);
		this.anInt4261 = arg0;
		this.anInt4259 = arg2;
		this.anInt4254 = arg1;
		this.anInt4258 = arg3;
	}

	@OriginalMember(owner = "client!nk", name = "b", descriptor = "(III)V")
	@Override
	public void method4890(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
	}

	@OriginalMember(owner = "client!nk", name = "c", descriptor = "(III)V")
	@Override
	public void method4891(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
	}

	@OriginalMember(owner = "client!nk", name = "a", descriptor = "(III)V")
	@Override
	public void method4887(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(10) int local10 = arg1 * this.anInt4261 >> 12;
		@Pc(17) int local17 = this.anInt4259 * arg1 >> 12;
		@Pc(24) int local24 = arg0 * this.anInt4254 >> 12;
		@Pc(31) int local31 = this.anInt4258 * arg0 >> 12;
		Static8.method111(local24, local17, local31, local10, super.anInt5595);
	}
}
