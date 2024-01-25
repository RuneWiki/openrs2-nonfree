import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!iq")
public final class Class43_Sub2 extends Class43 {

	@OriginalMember(owner = "client!iq", name = "A", descriptor = "I")
	private final int anInt3050;

	@OriginalMember(owner = "client!iq", name = "v", descriptor = "I")
	private final int anInt3046;

	@OriginalMember(owner = "client!iq", name = "u", descriptor = "I")
	private final int anInt3045;

	@OriginalMember(owner = "client!iq", name = "l", descriptor = "I")
	private final int anInt3037;

	@OriginalMember(owner = "client!iq", name = "y", descriptor = "I")
	private final int anInt3049;

	@OriginalMember(owner = "client!iq", name = "q", descriptor = "I")
	private final int anInt3041;

	@OriginalMember(owner = "client!iq", name = "s", descriptor = "I")
	private final int anInt3043;

	@OriginalMember(owner = "client!iq", name = "p", descriptor = "I")
	private final int anInt3040;

	@OriginalMember(owner = "client!iq", name = "<init>", descriptor = "(IIIIIIIIII)V")
	public Class43_Sub2(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9) {
		super(-1, arg8, arg9);
		this.anInt3050 = arg3;
		this.anInt3046 = arg6;
		this.anInt3045 = arg4;
		this.anInt3037 = arg0;
		this.anInt3049 = arg2;
		this.anInt3041 = arg5;
		this.anInt3043 = arg7;
		this.anInt3040 = arg1;
	}

	@OriginalMember(owner = "client!iq", name = "a", descriptor = "(IIB)V")
	@Override
	public void method4688(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
	}

	@OriginalMember(owner = "client!iq", name = "a", descriptor = "(III)V")
	@Override
	public void method4686(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
	}

	@OriginalMember(owner = "client!iq", name = "c", descriptor = "(III)V")
	@Override
	public void method4692(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(10) int local10 = this.anInt3037 * arg0 >> 12;
		@Pc(17) int local17 = arg1 * this.anInt3040 >> 12;
		@Pc(24) int local24 = this.anInt3049 * arg0 >> 12;
		@Pc(31) int local31 = arg1 * this.anInt3050 >> 12;
		@Pc(38) int local38 = arg0 * this.anInt3045 >> 12;
		@Pc(45) int local45 = arg1 * this.anInt3041 >> 12;
		@Pc(58) int local58 = arg0 * this.anInt3046 >> 12;
		@Pc(65) int local65 = arg1 * this.anInt3043 >> 12;
		Static229.method4023(local45, local17, local38, super.anInt5551, local58, local10, local65, local24, local31);
	}
}
