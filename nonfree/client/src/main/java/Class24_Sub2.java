import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!fa")
public final class Class24_Sub2 extends Class24 {

	@OriginalMember(owner = "client!fa", name = "I", descriptor = "I")
	private final int anInt1106;

	@OriginalMember(owner = "client!fa", name = "G", descriptor = "I")
	private final int anInt1105;

	@OriginalMember(owner = "client!fa", name = "A", descriptor = "I")
	private final int anInt1101;

	@OriginalMember(owner = "client!fa", name = "C", descriptor = "I")
	private final int anInt1102;

	@OriginalMember(owner = "client!fa", name = "<init>", descriptor = "(IIIIIII)V")
	public Class24_Sub2(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		super(arg4, arg5, arg6);
		this.anInt1106 = arg1;
		this.anInt1105 = arg2;
		this.anInt1101 = arg3;
		this.anInt1102 = arg0;
	}

	@OriginalMember(owner = "client!fa", name = "a", descriptor = "(III)V")
	@Override
	public void method3002(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(10) int local10 = arg0 * this.anInt1106 >> 12;
		@Pc(17) int local17 = this.anInt1101 * arg0 >> 12;
		@Pc(24) int local24 = arg1 * this.anInt1105 >> 12;
		@Pc(36) int local36 = arg1 * this.anInt1102 >> 12;
		Static169.method2457(local10, super.anInt4288, local24, super.anInt4287, local36, super.anInt4280, local17);
	}

	@OriginalMember(owner = "client!fa", name = "a", descriptor = "(IBI)V")
	@Override
	public void method3007(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(10) int local10 = arg1 * this.anInt1102 >> 12;
		@Pc(25) int local25 = this.anInt1105 * arg1 >> 12;
		@Pc(32) int local32 = arg0 * this.anInt1106 >> 12;
		@Pc(39) int local39 = arg0 * this.anInt1101 >> 12;
		Static198.method2916(local10, local25, local32, local39, super.anInt4288);
	}

	@OriginalMember(owner = "client!fa", name = "a", descriptor = "(IZI)V")
	@Override
	public void method2999(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(6) int local6 = arg0 * this.anInt1102 >> 12;
		@Pc(17) int local17 = arg0 * this.anInt1105 >> 12;
		@Pc(24) int local24 = arg1 * this.anInt1106 >> 12;
		@Pc(35) int local35 = arg1 * this.anInt1101 >> 12;
		Static194.method2773(super.anInt4280, local24, super.anInt4287, local35, local17, local6);
	}
}
