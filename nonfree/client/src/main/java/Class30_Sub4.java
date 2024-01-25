import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!uba")
public final class Class30_Sub4 extends Class30 {

	@OriginalMember(owner = "client!uba", name = "u", descriptor = "I")
	private final int anInt8676;

	@OriginalMember(owner = "client!uba", name = "w", descriptor = "I")
	private final int anInt8678;

	@OriginalMember(owner = "client!uba", name = "n", descriptor = "I")
	private final int anInt8670;

	@OriginalMember(owner = "client!uba", name = "y", descriptor = "I")
	private final int anInt8680;

	@OriginalMember(owner = "client!uba", name = "l", descriptor = "I")
	private final int anInt8669;

	@OriginalMember(owner = "client!uba", name = "v", descriptor = "I")
	private final int anInt8677;

	@OriginalMember(owner = "client!uba", name = "r", descriptor = "I")
	private final int anInt8674;

	@OriginalMember(owner = "client!uba", name = "A", descriptor = "I")
	private final int anInt8681;

	@OriginalMember(owner = "client!uba", name = "<init>", descriptor = "(IIIIIIIIII)V")
	public Class30_Sub4(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9) {
		super(-1, arg8, arg9);
		this.anInt8676 = arg6;
		this.anInt8678 = arg1;
		this.anInt8670 = arg4;
		this.anInt8680 = arg7;
		this.anInt8669 = arg0;
		this.anInt8677 = arg2;
		this.anInt8674 = arg3;
		this.anInt8681 = arg5;
	}

	@OriginalMember(owner = "client!uba", name = "a", descriptor = "(IBI)V")
	@Override
	public void method7127(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(10) int local10 = this.anInt8669 * arg1 >> 12;
		@Pc(17) int local17 = this.anInt8678 * arg0 >> 12;
		@Pc(24) int local24 = arg1 * this.anInt8677 >> 12;
		@Pc(31) int local31 = arg0 * this.anInt8674 >> 12;
		@Pc(38) int local38 = this.anInt8670 * arg1 >> 12;
		@Pc(45) int local45 = arg0 * this.anInt8681 >> 12;
		@Pc(60) int local60 = arg1 * this.anInt8676 >> 12;
		@Pc(67) int local67 = this.anInt8680 * arg0 >> 12;
		Static186.method3523(local17, local67, super.anInt8662, local31, local60, local24, local45, local10, local38);
	}

	@OriginalMember(owner = "client!uba", name = "a", descriptor = "(III)V")
	@Override
	public void method7125(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
	}

	@OriginalMember(owner = "client!uba", name = "a", descriptor = "(IIZ)V")
	@Override
	public void method7131(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
	}
}
