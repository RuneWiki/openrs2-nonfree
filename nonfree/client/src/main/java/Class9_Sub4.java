import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!qp")
public final class Class9_Sub4 extends Class9 {

	@OriginalMember(owner = "client!qp", name = "s", descriptor = "I")
	private final int anInt6027;

	@OriginalMember(owner = "client!qp", name = "w", descriptor = "I")
	private final int anInt6030;

	@OriginalMember(owner = "client!qp", name = "r", descriptor = "I")
	private final int anInt6026;

	@OriginalMember(owner = "client!qp", name = "q", descriptor = "I")
	private final int anInt6025;

	@OriginalMember(owner = "client!qp", name = "<init>", descriptor = "(IIIIIII)V")
	public Class9_Sub4(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		super(arg4, arg5, arg6);
		this.anInt6027 = arg2;
		this.anInt6030 = arg1;
		this.anInt6026 = arg3;
		this.anInt6025 = arg0;
	}

	@OriginalMember(owner = "client!qp", name = "a", descriptor = "(IIZ)V")
	@Override
	public void method4774(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(10) int local10 = this.anInt6025 * arg0 >> 12;
		@Pc(17) int local17 = this.anInt6027 * arg0 >> 12;
		@Pc(24) int local24 = this.anInt6030 * arg1 >> 12;
		@Pc(37) int local37 = arg1 * this.anInt6026 >> 12;
		Static440.method5906(super.anInt6017, local17, local24, super.anInt6022, local10, local37);
	}

	@OriginalMember(owner = "client!qp", name = "b", descriptor = "(III)V")
	@Override
	public void method4773(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(10) int local10 = this.anInt6025 * arg1 >> 12;
		@Pc(17) int local17 = this.anInt6027 * arg1 >> 12;
		@Pc(24) int local24 = this.anInt6030 * arg0 >> 12;
		@Pc(31) int local31 = arg0 * this.anInt6026 >> 12;
		Static162.method2536(local24, local10, local31, super.anInt6015, local17);
	}

	@OriginalMember(owner = "client!qp", name = "a", descriptor = "(III)V")
	@Override
	public void method4772(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(10) int local10 = this.anInt6025 * arg0 >> 12;
		@Pc(17) int local17 = arg0 * this.anInt6027 >> 12;
		@Pc(24) int local24 = arg1 * this.anInt6030 >> 12;
		@Pc(31) int local31 = this.anInt6026 * arg1 >> 12;
		Static212.method3189(local10, local31, super.anInt6017, super.anInt6015, local24, super.anInt6022, local17);
	}
}
