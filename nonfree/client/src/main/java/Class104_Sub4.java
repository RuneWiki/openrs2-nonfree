import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!uo")
public final class Class104_Sub4 extends Class104 {

	@OriginalMember(owner = "client!uo", name = "n", descriptor = "I")
	private final int anInt6748;

	@OriginalMember(owner = "client!uo", name = "p", descriptor = "I")
	private final int anInt6750;

	@OriginalMember(owner = "client!uo", name = "q", descriptor = "I")
	private final int anInt6751;

	@OriginalMember(owner = "client!uo", name = "v", descriptor = "I")
	private final int anInt6754;

	@OriginalMember(owner = "client!uo", name = "<init>", descriptor = "(IIIIIII)V")
	public Class104_Sub4(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		super(arg4, arg5, arg6);
		this.anInt6748 = arg2;
		this.anInt6750 = arg0;
		this.anInt6751 = arg3;
		this.anInt6754 = arg1;
	}

	@OriginalMember(owner = "client!uo", name = "b", descriptor = "(III)V")
	@Override
	public void method5333(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(17) int local17 = arg1 * this.anInt6750 >> 12;
		@Pc(24) int local24 = arg1 * this.anInt6748 >> 12;
		@Pc(31) int local31 = this.anInt6754 * arg0 >> 12;
		@Pc(38) int local38 = this.anInt6751 * arg0 >> 12;
		Static79.method1469(local24, local17, local31, super.anInt6745, local38);
	}

	@OriginalMember(owner = "client!uo", name = "a", descriptor = "(IZI)V")
	@Override
	public void method5332(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(10) int local10 = this.anInt6750 * arg0 >> 12;
		@Pc(17) int local17 = arg0 * this.anInt6748 >> 12;
		@Pc(24) int local24 = arg1 * this.anInt6754 >> 12;
		@Pc(31) int local31 = this.anInt6751 * arg1 >> 12;
		Static374.method5055(local24, super.anInt6745, local17, super.anInt6742, local10, local31, super.anInt6746);
	}

	@OriginalMember(owner = "client!uo", name = "c", descriptor = "(III)V")
	@Override
	public void method5336(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
	}
}
