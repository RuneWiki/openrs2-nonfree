import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!el")
public final class Class31_Sub2 extends Class31 {

	@OriginalMember(owner = "client!el", name = "p", descriptor = "I")
	private final int anInt2039;

	@OriginalMember(owner = "client!el", name = "t", descriptor = "I")
	private final int anInt2042;

	@OriginalMember(owner = "client!el", name = "s", descriptor = "I")
	private final int anInt2041;

	@OriginalMember(owner = "client!el", name = "o", descriptor = "I")
	private final int anInt2038;

	@OriginalMember(owner = "client!el", name = "h", descriptor = "I")
	private final int anInt2031;

	@OriginalMember(owner = "client!el", name = "u", descriptor = "I")
	private final int anInt2043;

	@OriginalMember(owner = "client!el", name = "k", descriptor = "I")
	private final int anInt2034;

	@OriginalMember(owner = "client!el", name = "m", descriptor = "I")
	private final int anInt2036;

	@OriginalMember(owner = "client!el", name = "<init>", descriptor = "(IIIIIIIIII)V")
	public Class31_Sub2(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9) {
		super(-1, arg8, arg9);
		this.anInt2039 = arg0;
		this.anInt2042 = arg5;
		this.anInt2041 = arg3;
		this.anInt2038 = arg4;
		this.anInt2031 = arg7;
		this.anInt2043 = arg1;
		this.anInt2034 = arg6;
		this.anInt2036 = arg2;
	}

	@OriginalMember(owner = "client!el", name = "b", descriptor = "(IIB)V")
	@Override
	public void method3544(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
	}

	@OriginalMember(owner = "client!el", name = "a", descriptor = "(III)V")
	@Override
	public void method3543(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
	}

	@OriginalMember(owner = "client!el", name = "a", descriptor = "(IIB)V")
	@Override
	public void method3541(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(16) int local16 = this.anInt2039 * arg1 >> 12;
		@Pc(23) int local23 = this.anInt2043 * arg0 >> 12;
		@Pc(30) int local30 = arg1 * this.anInt2036 >> 12;
		@Pc(37) int local37 = this.anInt2041 * arg0 >> 12;
		@Pc(44) int local44 = this.anInt2038 * arg1 >> 12;
		@Pc(51) int local51 = this.anInt2042 * arg0 >> 12;
		@Pc(58) int local58 = this.anInt2034 * arg1 >> 12;
		@Pc(65) int local65 = arg0 * this.anInt2031 >> 12;
		Static324.method4833(super.anInt3958, local30, local65, local51, local37, local58, local44, local23, local16);
	}
}
