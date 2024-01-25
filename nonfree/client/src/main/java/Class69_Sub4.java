import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ms")
public final class Class69_Sub4 extends Class69 {

	@OriginalMember(owner = "client!ms", name = "n", descriptor = "I")
	private final int anInt6649;

	@OriginalMember(owner = "client!ms", name = "l", descriptor = "I")
	private final int anInt6647;

	@OriginalMember(owner = "client!ms", name = "m", descriptor = "I")
	private final int anInt6648;

	@OriginalMember(owner = "client!ms", name = "q", descriptor = "I")
	private final int anInt6652;

	@OriginalMember(owner = "client!ms", name = "<init>", descriptor = "(IIIIIII)V")
	public Class69_Sub4(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		super(arg4, arg5, arg6);
		this.anInt6649 = arg3;
		this.anInt6647 = arg2;
		this.anInt6648 = arg1;
		this.anInt6652 = arg0;
	}

	@OriginalMember(owner = "client!ms", name = "e", descriptor = "(III)V")
	@Override
	public void method5709(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(15) int local15 = this.anInt6652 * arg0 >> 12;
		@Pc(22) int local22 = arg0 * this.anInt6647 >> 12;
		@Pc(29) int local29 = arg1 * this.anInt6648 >> 12;
		@Pc(36) int local36 = this.anInt6649 * arg1 >> 12;
		Static469.method7113(local29, local15, local36, super.anInt6639, super.anInt6642, local22, super.anInt6646);
	}

	@OriginalMember(owner = "client!ms", name = "c", descriptor = "(III)V")
	@Override
	public void method5707(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
	}

	@OriginalMember(owner = "client!ms", name = "a", descriptor = "(III)V")
	@Override
	public void method5702(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(10) int local10 = this.anInt6652 * arg0 >> 12;
		@Pc(17) int local17 = arg0 * this.anInt6647 >> 12;
		@Pc(24) int local24 = arg1 * this.anInt6648 >> 12;
		@Pc(31) int local31 = arg1 * this.anInt6649 >> 12;
		Static4.method7044(local31, super.anInt6639, local10, local17, local24);
	}
}
