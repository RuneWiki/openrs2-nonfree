import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!om")
public final class Class51_Sub1 extends Class51 {

	@OriginalMember(owner = "client!om", name = "q", descriptor = "I")
	private final int anInt4742;

	@OriginalMember(owner = "client!om", name = "p", descriptor = "I")
	private final int anInt4741;

	@OriginalMember(owner = "client!om", name = "u", descriptor = "I")
	private final int anInt4746;

	@OriginalMember(owner = "client!om", name = "w", descriptor = "I")
	private final int anInt4748;

	@OriginalMember(owner = "client!om", name = "r", descriptor = "I")
	private final int anInt4743;

	@OriginalMember(owner = "client!om", name = "t", descriptor = "I")
	private final int anInt4745;

	@OriginalMember(owner = "client!om", name = "k", descriptor = "I")
	private final int anInt4737;

	@OriginalMember(owner = "client!om", name = "j", descriptor = "I")
	private final int anInt4736;

	@OriginalMember(owner = "client!om", name = "<init>", descriptor = "(IIIIIIIIII)V")
	public Class51_Sub1(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9) {
		super(-1, arg8, arg9);
		this.anInt4742 = arg2;
		this.anInt4741 = arg3;
		this.anInt4746 = arg0;
		this.anInt4748 = arg5;
		this.anInt4743 = arg1;
		this.anInt4745 = arg7;
		this.anInt4737 = arg6;
		this.anInt4736 = arg4;
	}

	@OriginalMember(owner = "client!om", name = "a", descriptor = "(IZI)V")
	@Override
	public void method5810(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(10) int local10 = this.anInt4746 * arg0 >> 12;
		@Pc(17) int local17 = arg1 * this.anInt4743 >> 12;
		@Pc(30) int local30 = this.anInt4742 * arg0 >> 12;
		@Pc(37) int local37 = arg1 * this.anInt4741 >> 12;
		@Pc(44) int local44 = this.anInt4736 * arg0 >> 12;
		@Pc(51) int local51 = arg1 * this.anInt4748 >> 12;
		@Pc(58) int local58 = this.anInt4737 * arg0 >> 12;
		@Pc(65) int local65 = arg1 * this.anInt4745 >> 12;
		Static94.method4426(local65, local58, local37, local44, local17, local30, local51, super.anInt7223, local10);
	}

	@OriginalMember(owner = "client!om", name = "b", descriptor = "(III)V")
	@Override
	public void method5809(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
	}

	@OriginalMember(owner = "client!om", name = "a", descriptor = "(III)V")
	@Override
	public void method5807(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
	}
}
