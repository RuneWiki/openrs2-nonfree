import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!nj")
public final class Class78_Sub3 extends Class78 {

	@OriginalMember(owner = "client!nj", name = "q", descriptor = "I")
	private final int anInt6216;

	@OriginalMember(owner = "client!nj", name = "m", descriptor = "I")
	private final int anInt6214;

	@OriginalMember(owner = "client!nj", name = "r", descriptor = "I")
	private final int anInt6217;

	@OriginalMember(owner = "client!nj", name = "e", descriptor = "I")
	private final int anInt6208;

	@OriginalMember(owner = "client!nj", name = "<init>", descriptor = "(IIIIII)V")
	public Class78_Sub3(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		super(-1, arg4, arg5);
		this.anInt6216 = arg2;
		this.anInt6214 = arg1;
		this.anInt6217 = arg0;
		this.anInt6208 = arg3;
	}

	@OriginalMember(owner = "client!nj", name = "a", descriptor = "(BII)V")
	@Override
	public void method6316(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(14) int local14 = this.anInt6217 * arg1 >> 12;
		@Pc(21) int local21 = arg1 * this.anInt6216 >> 12;
		@Pc(28) int local28 = arg0 * this.anInt6214 >> 12;
		@Pc(35) int local35 = arg0 * this.anInt6208 >> 12;
		Static318.method4846(local35, local28, local14, local21, super.anInt7670);
	}

	@OriginalMember(owner = "client!nj", name = "a", descriptor = "(III)V")
	@Override
	public void method6318(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
	}

	@OriginalMember(owner = "client!nj", name = "a", descriptor = "(IBI)V")
	@Override
	public void method6317(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
	}
}
