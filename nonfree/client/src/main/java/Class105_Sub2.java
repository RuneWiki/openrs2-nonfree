import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!mw")
public final class Class105_Sub2 extends Class105 {

	@OriginalMember(owner = "client!mw", name = "u", descriptor = "I")
	private final int anInt4650;

	@OriginalMember(owner = "client!mw", name = "p", descriptor = "I")
	private final int anInt4646;

	@OriginalMember(owner = "client!mw", name = "o", descriptor = "I")
	private final int anInt4645;

	@OriginalMember(owner = "client!mw", name = "r", descriptor = "I")
	private final int anInt4648;

	@OriginalMember(owner = "client!mw", name = "z", descriptor = "I")
	private final int anInt4655;

	@OriginalMember(owner = "client!mw", name = "q", descriptor = "I")
	private final int anInt4647;

	@OriginalMember(owner = "client!mw", name = "v", descriptor = "I")
	private final int anInt4651;

	@OriginalMember(owner = "client!mw", name = "w", descriptor = "I")
	private final int anInt4652;

	@OriginalMember(owner = "client!mw", name = "<init>", descriptor = "(IIIIIIIIII)V")
	public Class105_Sub2(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9) {
		super(-1, arg8, arg9);
		this.anInt4650 = arg5;
		this.anInt4646 = arg2;
		this.anInt4645 = arg3;
		this.anInt4648 = arg1;
		this.anInt4655 = arg7;
		this.anInt4647 = arg6;
		this.anInt4651 = arg4;
		this.anInt4652 = arg0;
	}

	@OriginalMember(owner = "client!mw", name = "a", descriptor = "(IIB)V")
	@Override
	public void method5922(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
	}

	@OriginalMember(owner = "client!mw", name = "b", descriptor = "(IIB)V")
	@Override
	public void method5927(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
	}

	@OriginalMember(owner = "client!mw", name = "a", descriptor = "(IZI)V")
	@Override
	public void method5928(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(10) int local10 = arg0 * this.anInt4652 >> 12;
		@Pc(21) int local21 = arg1 * this.anInt4648 >> 12;
		@Pc(28) int local28 = arg0 * this.anInt4646 >> 12;
		@Pc(35) int local35 = arg1 * this.anInt4645 >> 12;
		@Pc(42) int local42 = this.anInt4651 * arg0 >> 12;
		@Pc(49) int local49 = this.anInt4650 * arg1 >> 12;
		@Pc(56) int local56 = arg0 * this.anInt4647 >> 12;
		@Pc(63) int local63 = arg1 * this.anInt4655 >> 12;
		Static4.method57(local21, local42, local28, local10, super.anInt7370, local49, local56, local35, local63);
	}
}
