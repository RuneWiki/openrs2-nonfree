import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!tn")
public final class Class71_Sub3 extends Class71 {

	@OriginalMember(owner = "client!tn", name = "r", descriptor = "I")
	private final int anInt6517;

	@OriginalMember(owner = "client!tn", name = "n", descriptor = "I")
	private final int anInt6514;

	@OriginalMember(owner = "client!tn", name = "u", descriptor = "I")
	private final int anInt6520;

	@OriginalMember(owner = "client!tn", name = "x", descriptor = "I")
	private final int anInt6523;

	@OriginalMember(owner = "client!tn", name = "s", descriptor = "I")
	private final int anInt6518;

	@OriginalMember(owner = "client!tn", name = "l", descriptor = "I")
	private final int anInt6512;

	@OriginalMember(owner = "client!tn", name = "k", descriptor = "I")
	private final int anInt6511;

	@OriginalMember(owner = "client!tn", name = "w", descriptor = "I")
	private final int anInt6522;

	@OriginalMember(owner = "client!tn", name = "<init>", descriptor = "(IIIIIIIIII)V")
	public Class71_Sub3(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9) {
		super(-1, arg8, arg9);
		this.anInt6517 = arg1;
		this.anInt6514 = arg6;
		this.anInt6520 = arg2;
		this.anInt6523 = arg5;
		this.anInt6518 = arg7;
		this.anInt6512 = arg3;
		this.anInt6511 = arg4;
		this.anInt6522 = arg0;
	}

	@OriginalMember(owner = "client!tn", name = "a", descriptor = "(IBI)V")
	@Override
	public void method5333(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(10) int local10 = arg0 * this.anInt6522 >> 12;
		@Pc(17) int local17 = arg1 * this.anInt6517 >> 12;
		@Pc(24) int local24 = arg0 * this.anInt6520 >> 12;
		@Pc(31) int local31 = this.anInt6512 * arg1 >> 12;
		@Pc(38) int local38 = this.anInt6511 * arg0 >> 12;
		@Pc(45) int local45 = arg1 * this.anInt6523 >> 12;
		@Pc(52) int local52 = arg0 * this.anInt6514 >> 12;
		@Pc(65) int local65 = arg1 * this.anInt6518 >> 12;
		Static111.method1884(local31, local65, local38, super.anInt6816, local17, local24, local52, local45, local10);
	}

	@OriginalMember(owner = "client!tn", name = "a", descriptor = "(III)V")
	@Override
	public void method5334(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
	}

	@OriginalMember(owner = "client!tn", name = "a", descriptor = "(IIZ)V")
	@Override
	public void method5331(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
	}
}
