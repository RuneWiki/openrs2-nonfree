import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!lca")
public final class Class71_Sub3 extends Class71 {

	@OriginalMember(owner = "client!lca", name = "h", descriptor = "I")
	private final int anInt5182;

	@OriginalMember(owner = "client!lca", name = "q", descriptor = "I")
	private final int anInt5188;

	@OriginalMember(owner = "client!lca", name = "m", descriptor = "I")
	private final int anInt5185;

	@OriginalMember(owner = "client!lca", name = "s", descriptor = "I")
	private final int anInt5190;

	@OriginalMember(owner = "client!lca", name = "<init>", descriptor = "(IIIIIII)V")
	public Class71_Sub3(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		super(arg4, arg5, arg6);
		this.anInt5182 = arg1;
		this.anInt5188 = arg2;
		this.anInt5185 = arg0;
		this.anInt5190 = arg3;
	}

	@OriginalMember(owner = "client!lca", name = "a", descriptor = "(III)V")
	@Override
	public void method5892(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(10) int local10 = this.anInt5185 * arg0 >> 12;
		@Pc(17) int local17 = arg0 * this.anInt5188 >> 12;
		@Pc(32) int local32 = this.anInt5182 * arg1 >> 12;
		@Pc(39) int local39 = this.anInt5190 * arg1 >> 12;
		Static274.method3962(local32, local10, local39, local17, super.anInt6720);
	}

	@OriginalMember(owner = "client!lca", name = "a", descriptor = "(IIB)V")
	@Override
	public void method5894(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
	}

	@OriginalMember(owner = "client!lca", name = "b", descriptor = "(III)V")
	@Override
	public void method5893(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(14) int local14 = this.anInt5185 * arg1 >> 12;
		@Pc(21) int local21 = arg1 * this.anInt5188 >> 12;
		@Pc(28) int local28 = arg0 * this.anInt5182 >> 12;
		@Pc(35) int local35 = arg0 * this.anInt5190 >> 12;
		Static429.method5934(local14, super.anInt6719, super.anInt6721, local35, super.anInt6720, local21, local28);
	}
}
