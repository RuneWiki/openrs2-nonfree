import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!te")
public final class Class3_Sub3 extends Class3 {

	@OriginalMember(owner = "client!te", name = "m", descriptor = "I")
	private final int anInt8867;

	@OriginalMember(owner = "client!te", name = "w", descriptor = "I")
	private final int anInt8876;

	@OriginalMember(owner = "client!te", name = "r", descriptor = "I")
	private final int anInt8872;

	@OriginalMember(owner = "client!te", name = "n", descriptor = "I")
	private final int anInt8868;

	@OriginalMember(owner = "client!te", name = "x", descriptor = "I")
	private final int anInt8877;

	@OriginalMember(owner = "client!te", name = "l", descriptor = "I")
	private final int anInt8866;

	@OriginalMember(owner = "client!te", name = "p", descriptor = "I")
	private final int anInt8870;

	@OriginalMember(owner = "client!te", name = "q", descriptor = "I")
	private final int anInt8871;

	@OriginalMember(owner = "client!te", name = "<init>", descriptor = "(IIIIIIIIII)V")
	public Class3_Sub3(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9) {
		super(-1, arg8, arg9);
		this.anInt8867 = arg4;
		this.anInt8876 = arg3;
		this.anInt8872 = arg6;
		this.anInt8868 = arg7;
		this.anInt8877 = arg5;
		this.anInt8866 = arg2;
		this.anInt8870 = arg0;
		this.anInt8871 = arg1;
	}

	@OriginalMember(owner = "client!te", name = "a", descriptor = "(IBI)V")
	@Override
	public void method8589(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
	}

	@OriginalMember(owner = "client!te", name = "a", descriptor = "(ZII)V")
	@Override
	public void method8595(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
	}

	@OriginalMember(owner = "client!te", name = "a", descriptor = "(III)V")
	@Override
	public void method8593(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(10) int local10 = this.anInt8870 * arg0 >> 12;
		@Pc(21) int local21 = this.anInt8871 * arg1 >> 12;
		@Pc(28) int local28 = arg0 * this.anInt8866 >> 12;
		@Pc(35) int local35 = this.anInt8876 * arg1 >> 12;
		@Pc(42) int local42 = this.anInt8867 * arg0 >> 12;
		@Pc(49) int local49 = this.anInt8877 * arg1 >> 12;
		@Pc(56) int local56 = this.anInt8872 * arg0 >> 12;
		@Pc(63) int local63 = arg1 * this.anInt8868 >> 12;
		Static56.method4533(local10, local35, local56, local63, local42, local28, super.anInt10310, local21, local49);
	}
}
