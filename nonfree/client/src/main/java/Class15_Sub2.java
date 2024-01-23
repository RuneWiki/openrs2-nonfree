import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ij")
public final class Class15_Sub2 extends Class15 {

	@OriginalMember(owner = "client!ij", name = "l", descriptor = "I")
	private int anInt2588;

	@OriginalMember(owner = "client!ij", name = "r", descriptor = "I")
	private int anInt2594;

	@OriginalMember(owner = "client!ij", name = "y", descriptor = "I")
	private int anInt2600;

	@OriginalMember(owner = "client!ij", name = "s", descriptor = "I")
	private int anInt2595;

	@OriginalMember(owner = "client!ij", name = "<init>", descriptor = "(IIIIIII)V")
	public Class15_Sub2(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		super(arg4, arg5, arg6);
		this.anInt2588 = arg2;
		this.anInt2594 = arg0;
		this.anInt2600 = arg3;
		this.anInt2595 = arg1;
	}

	@OriginalMember(owner = "client!ij", name = "c", descriptor = "(III)V")
	@Override
	public void method4465(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(16) int local16 = this.anInt2588 * arg1 >> 12;
		@Pc(23) int local23 = arg0 * this.anInt2600 >> 12;
		@Pc(30) int local30 = arg1 * this.anInt2594 >> 12;
		@Pc(37) int local37 = this.anInt2595 * arg0 >> 12;
		Static2.method133(local37, local16, local23, this.anInt5624, local30);
	}

	@OriginalMember(owner = "client!ij", name = "a", descriptor = "(III)V")
	@Override
	public void method4463(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(17) int local17 = arg1 * this.anInt2594 >> 12;
		@Pc(24) int local24 = arg1 * this.anInt2588 >> 12;
		@Pc(31) int local31 = arg0 * this.anInt2595 >> 12;
		@Pc(38) int local38 = arg0 * this.anInt2600 >> 12;
		Static224.method3520(local38, local31, local24, this.anInt5625, local17, this.anInt5624, this.anInt5626);
	}

	@OriginalMember(owner = "client!ij", name = "b", descriptor = "(III)V")
	@Override
	public void method4464(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
	}
}
