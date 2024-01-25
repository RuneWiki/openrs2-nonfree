import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ul")
public final class Class63_Sub4 extends Class63 {

	@OriginalMember(owner = "client!ul", name = "x", descriptor = "I")
	private final int anInt6699;

	@OriginalMember(owner = "client!ul", name = "q", descriptor = "I")
	private final int anInt6694;

	@OriginalMember(owner = "client!ul", name = "j", descriptor = "I")
	private final int anInt6688;

	@OriginalMember(owner = "client!ul", name = "m", descriptor = "I")
	private final int anInt6690;

	@OriginalMember(owner = "client!ul", name = "p", descriptor = "I")
	private final int anInt6693;

	@OriginalMember(owner = "client!ul", name = "n", descriptor = "I")
	private final int anInt6691;

	@OriginalMember(owner = "client!ul", name = "o", descriptor = "I")
	private final int anInt6692;

	@OriginalMember(owner = "client!ul", name = "u", descriptor = "I")
	private final int anInt6697;

	@OriginalMember(owner = "client!ul", name = "<init>", descriptor = "(IIIIIIIIII)V")
	public Class63_Sub4(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9) {
		super(-1, arg8, arg9);
		this.anInt6699 = arg1;
		this.anInt6694 = arg0;
		this.anInt6688 = arg3;
		this.anInt6690 = arg2;
		this.anInt6693 = arg5;
		this.anInt6691 = arg7;
		this.anInt6692 = arg4;
		this.anInt6697 = arg6;
	}

	@OriginalMember(owner = "client!ul", name = "a", descriptor = "(III)V")
	@Override
	public void method5134(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
	}

	@OriginalMember(owner = "client!ul", name = "a", descriptor = "(IIZ)V")
	@Override
	public void method5133(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(10) int local10 = this.anInt6694 * arg0 >> 12;
		@Pc(17) int local17 = this.anInt6699 * arg1 >> 12;
		@Pc(24) int local24 = this.anInt6690 * arg0 >> 12;
		@Pc(31) int local31 = this.anInt6688 * arg1 >> 12;
		@Pc(38) int local38 = arg0 * this.anInt6692 >> 12;
		@Pc(49) int local49 = arg1 * this.anInt6693 >> 12;
		@Pc(56) int local56 = arg0 * this.anInt6697 >> 12;
		@Pc(63) int local63 = this.anInt6691 * arg1 >> 12;
		Static182.method2409(local10, local63, local24, super.anInt6687, local31, local56, local38, local49, local17);
	}

	@OriginalMember(owner = "client!ul", name = "b", descriptor = "(III)V")
	@Override
	public void method5135(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
	}
}
