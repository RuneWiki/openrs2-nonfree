import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!th")
public final class Class57_Sub3 extends Class57 {

	@OriginalMember(owner = "client!th", name = "m", descriptor = "I")
	private final int anInt6729;

	@OriginalMember(owner = "client!th", name = "j", descriptor = "I")
	private final int anInt6726;

	@OriginalMember(owner = "client!th", name = "q", descriptor = "I")
	private final int anInt6733;

	@OriginalMember(owner = "client!th", name = "k", descriptor = "I")
	private final int anInt6727;

	@OriginalMember(owner = "client!th", name = "<init>", descriptor = "(IIIIII)V")
	public Class57_Sub3(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		super(-1, arg4, arg5);
		this.anInt6729 = arg3;
		this.anInt6726 = arg0;
		this.anInt6733 = arg1;
		this.anInt6727 = arg2;
	}

	@OriginalMember(owner = "client!th", name = "a", descriptor = "(III)V")
	@Override
	public void method5862(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
	}

	@OriginalMember(owner = "client!th", name = "b", descriptor = "(III)V")
	@Override
	public void method5863(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
	}

	@OriginalMember(owner = "client!th", name = "a", descriptor = "(IBI)V")
	@Override
	public void method5861(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(14) int local14 = arg1 * this.anInt6726 >> 12;
		@Pc(21) int local21 = arg1 * this.anInt6727 >> 12;
		@Pc(28) int local28 = this.anInt6733 * arg0 >> 12;
		@Pc(35) int local35 = arg0 * this.anInt6729 >> 12;
		Static358.method4933(local28, local14, local35, local21, super.anInt7558);
	}
}
