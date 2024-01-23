import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!pf")
public final class Class13_Sub3 extends Class13 {

	@OriginalMember(owner = "client!pf", name = "u", descriptor = "I")
	private int anInt4388;

	@OriginalMember(owner = "client!pf", name = "C", descriptor = "I")
	private int anInt4393;

	@OriginalMember(owner = "client!pf", name = "q", descriptor = "I")
	private int anInt4384;

	@OriginalMember(owner = "client!pf", name = "x", descriptor = "I")
	private int anInt4390;

	@OriginalMember(owner = "client!pf", name = "<init>", descriptor = "(IIIIII)V")
	public Class13_Sub3(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		super(-1, arg4, arg5);
		this.anInt4388 = arg1;
		this.anInt4393 = arg2;
		this.anInt4384 = arg3;
		this.anInt4390 = arg0;
	}

	@OriginalMember(owner = "client!pf", name = "a", descriptor = "(III)V")
	@Override
	public void method4389(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
	}

	@OriginalMember(owner = "client!pf", name = "b", descriptor = "(III)V")
	@Override
	public void method4390(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(6) int local6 = this.anInt4390 * arg1 >> 12;
		@Pc(19) int local19 = arg0 * this.anInt4388 >> 12;
		@Pc(26) int local26 = arg1 * this.anInt4393 >> 12;
		@Pc(37) int local37 = this.anInt4384 * arg0 >> 12;
		Static159.method2931(local37, local26, local6, this.anInt5540, local19);
	}

	@OriginalMember(owner = "client!pf", name = "c", descriptor = "(III)V")
	@Override
	public void method4392(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
	}
}
