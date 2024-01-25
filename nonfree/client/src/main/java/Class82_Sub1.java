import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!fu")
public final class Class82_Sub1 extends Class82 {

	@OriginalMember(owner = "client!fu", name = "m", descriptor = "I")
	private final int anInt2681;

	@OriginalMember(owner = "client!fu", name = "p", descriptor = "I")
	private final int anInt2684;

	@OriginalMember(owner = "client!fu", name = "j", descriptor = "I")
	private final int anInt2678;

	@OriginalMember(owner = "client!fu", name = "o", descriptor = "I")
	private final int anInt2683;

	@OriginalMember(owner = "client!fu", name = "<init>", descriptor = "(IIIIIII)V")
	public Class82_Sub1(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		super(arg4, arg5, arg6);
		this.anInt2681 = arg1;
		this.anInt2684 = arg3;
		this.anInt2678 = arg2;
		this.anInt2683 = arg0;
	}

	@OriginalMember(owner = "client!fu", name = "a", descriptor = "(III)V")
	@Override
	public void method5120(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(17) int local17 = this.anInt2683 * arg1 >> 12;
		@Pc(24) int local24 = this.anInt2678 * arg1 >> 12;
		@Pc(31) int local31 = arg0 * this.anInt2681 >> 12;
		@Pc(38) int local38 = this.anInt2684 * arg0 >> 12;
		Static418.method5599(super.anInt6503, local17, local31, local24, local38, super.anInt6499, super.anInt6498);
	}

	@OriginalMember(owner = "client!fu", name = "a", descriptor = "(IIB)V")
	@Override
	public void method5119(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
	}

	@OriginalMember(owner = "client!fu", name = "a", descriptor = "(IZI)V")
	@Override
	public void method5121(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(10) int local10 = arg1 * this.anInt2683 >> 12;
		@Pc(17) int local17 = arg1 * this.anInt2678 >> 12;
		@Pc(24) int local24 = this.anInt2681 * arg0 >> 12;
		@Pc(31) int local31 = this.anInt2684 * arg0 >> 12;
		Static186.method3116(super.anInt6499, local10, local24, local31, local17);
	}
}
