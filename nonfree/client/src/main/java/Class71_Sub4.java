import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!oc")
public final class Class71_Sub4 extends Class71 {

	@OriginalMember(owner = "client!oc", name = "k", descriptor = "I")
	private final int anInt6726;

	@OriginalMember(owner = "client!oc", name = "q", descriptor = "I")
	private final int anInt6732;

	@OriginalMember(owner = "client!oc", name = "m", descriptor = "I")
	private final int anInt6728;

	@OriginalMember(owner = "client!oc", name = "n", descriptor = "I")
	private final int anInt6729;

	@OriginalMember(owner = "client!oc", name = "o", descriptor = "I")
	private final int anInt6730;

	@OriginalMember(owner = "client!oc", name = "s", descriptor = "I")
	private final int anInt6734;

	@OriginalMember(owner = "client!oc", name = "g", descriptor = "I")
	private final int anInt6723;

	@OriginalMember(owner = "client!oc", name = "r", descriptor = "I")
	private final int anInt6733;

	@OriginalMember(owner = "client!oc", name = "<init>", descriptor = "(IIIIIIIIII)V")
	public Class71_Sub4(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9) {
		super(-1, arg8, arg9);
		this.anInt6726 = arg1;
		this.anInt6732 = arg6;
		this.anInt6728 = arg5;
		this.anInt6729 = arg3;
		this.anInt6730 = arg0;
		this.anInt6734 = arg4;
		this.anInt6723 = arg7;
		this.anInt6733 = arg2;
	}

	@OriginalMember(owner = "client!oc", name = "a", descriptor = "(IIB)V")
	@Override
	public void method5894(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(10) int local10 = this.anInt6730 * arg1 >> 12;
		@Pc(17) int local17 = this.anInt6726 * arg0 >> 12;
		@Pc(24) int local24 = this.anInt6733 * arg1 >> 12;
		@Pc(31) int local31 = arg0 * this.anInt6729 >> 12;
		@Pc(38) int local38 = this.anInt6734 * arg1 >> 12;
		@Pc(51) int local51 = this.anInt6728 * arg0 >> 12;
		@Pc(58) int local58 = arg1 * this.anInt6732 >> 12;
		@Pc(65) int local65 = arg0 * this.anInt6723 >> 12;
		Static408.method5155(super.anInt6721, local10, local65, local38, local58, local24, local51, local17, local31);
	}

	@OriginalMember(owner = "client!oc", name = "b", descriptor = "(III)V")
	@Override
	public void method5893(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
	}

	@OriginalMember(owner = "client!oc", name = "a", descriptor = "(III)V")
	@Override
	public void method5892(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
	}
}
