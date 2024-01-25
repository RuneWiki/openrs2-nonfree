import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!wc")
public final class Class57_Sub4 extends Class57 {

	@OriginalMember(owner = "client!wc", name = "s", descriptor = "I")
	private final int anInt7573;

	@OriginalMember(owner = "client!wc", name = "u", descriptor = "I")
	private final int anInt7575;

	@OriginalMember(owner = "client!wc", name = "j", descriptor = "I")
	private final int anInt7564;

	@OriginalMember(owner = "client!wc", name = "l", descriptor = "I")
	private final int anInt7566;

	@OriginalMember(owner = "client!wc", name = "<init>", descriptor = "(IIIIIII)V")
	public Class57_Sub4(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		super(arg4, arg5, arg6);
		this.anInt7573 = arg3;
		this.anInt7575 = arg1;
		this.anInt7564 = arg0;
		this.anInt7566 = arg2;
	}

	@OriginalMember(owner = "client!wc", name = "a", descriptor = "(IBI)V")
	@Override
	public void method5861(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
	}

	@OriginalMember(owner = "client!wc", name = "a", descriptor = "(III)V")
	@Override
	public void method5862(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(14) int local14 = arg1 * this.anInt7564 >> 12;
		@Pc(21) int local21 = this.anInt7566 * arg1 >> 12;
		@Pc(28) int local28 = arg0 * this.anInt7575 >> 12;
		@Pc(35) int local35 = this.anInt7573 * arg0 >> 12;
		Static403.method5451(local28, local14, super.anInt7559, super.anInt7560, local35, super.anInt7558, local21);
	}

	@OriginalMember(owner = "client!wc", name = "b", descriptor = "(III)V")
	@Override
	public void method5863(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(10) int local10 = arg0 * this.anInt7564 >> 12;
		@Pc(17) int local17 = arg0 * this.anInt7566 >> 12;
		@Pc(24) int local24 = this.anInt7575 * arg1 >> 12;
		@Pc(35) int local35 = arg1 * this.anInt7573 >> 12;
		Static42.method686(local17, local24, local10, super.anInt7559, local35);
	}
}
