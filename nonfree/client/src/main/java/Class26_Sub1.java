import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!bb")
public final class Class26_Sub1 extends Class26 {

	@OriginalMember(owner = "client!bb", name = "e", descriptor = "I")
	private final int anInt592;

	@OriginalMember(owner = "client!bb", name = "d", descriptor = "I")
	private final int anInt591;

	@OriginalMember(owner = "client!bb", name = "g", descriptor = "I")
	private final int anInt594;

	@OriginalMember(owner = "client!bb", name = "n", descriptor = "I")
	private final int anInt600;

	@OriginalMember(owner = "client!bb", name = "<init>", descriptor = "(IIIIIII)V")
	public Class26_Sub1(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		super(arg4, arg5, arg6);
		this.anInt592 = arg2;
		this.anInt591 = arg0;
		this.anInt594 = arg3;
		this.anInt600 = arg1;
	}

	@OriginalMember(owner = "client!bb", name = "a", descriptor = "(IZI)V")
	@Override
	public void method4304(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(10) int local10 = this.anInt591 * arg1 >> 12;
		@Pc(17) int local17 = this.anInt592 * arg1 >> 12;
		@Pc(24) int local24 = arg0 * this.anInt600 >> 12;
		@Pc(31) int local31 = this.anInt594 * arg0 >> 12;
		Static584.method4100(local31, local17, local10, super.anInt4744, local24);
	}

	@OriginalMember(owner = "client!bb", name = "a", descriptor = "(III)V")
	@Override
	public void method4303(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
	}

	@OriginalMember(owner = "client!bb", name = "a", descriptor = "(ZII)V")
	@Override
	public void method4306(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(16) int local16 = this.anInt591 * arg1 >> 12;
		@Pc(23) int local23 = arg1 * this.anInt592 >> 12;
		@Pc(30) int local30 = this.anInt600 * arg0 >> 12;
		@Pc(37) int local37 = this.anInt594 * arg0 >> 12;
		Static184.method3570(local23, local16, super.anInt4745, super.anInt4744, local37, local30, super.anInt4746);
	}
}
