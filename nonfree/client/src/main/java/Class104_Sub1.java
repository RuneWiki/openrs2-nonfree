import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!he")
public final class Class104_Sub1 extends Class104 {

	@OriginalMember(owner = "client!he", name = "o", descriptor = "I")
	private final int anInt3037;

	@OriginalMember(owner = "client!he", name = "v", descriptor = "I")
	private final int anInt3042;

	@OriginalMember(owner = "client!he", name = "s", descriptor = "I")
	private final int anInt3039;

	@OriginalMember(owner = "client!he", name = "u", descriptor = "I")
	private final int anInt3041;

	@OriginalMember(owner = "client!he", name = "z", descriptor = "I")
	private final int anInt3046;

	@OriginalMember(owner = "client!he", name = "m", descriptor = "I")
	private final int anInt3035;

	@OriginalMember(owner = "client!he", name = "x", descriptor = "I")
	private final int anInt3044;

	@OriginalMember(owner = "client!he", name = "n", descriptor = "I")
	private final int anInt3036;

	@OriginalMember(owner = "client!he", name = "<init>", descriptor = "(IIIIIIIIII)V")
	public Class104_Sub1(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9) {
		super(-1, arg8, arg9);
		this.anInt3037 = arg5;
		this.anInt3042 = arg0;
		this.anInt3039 = arg6;
		this.anInt3041 = arg7;
		this.anInt3046 = arg4;
		this.anInt3035 = arg2;
		this.anInt3044 = arg1;
		this.anInt3036 = arg3;
	}

	@OriginalMember(owner = "client!he", name = "a", descriptor = "(IZI)V")
	@Override
	public void method5332(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
	}

	@OriginalMember(owner = "client!he", name = "c", descriptor = "(III)V")
	@Override
	public void method5336(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(10) int local10 = this.anInt3042 * arg0 >> 12;
		@Pc(30) int local30 = this.anInt3044 * arg1 >> 12;
		@Pc(37) int local37 = arg0 * this.anInt3035 >> 12;
		@Pc(44) int local44 = this.anInt3036 * arg1 >> 12;
		@Pc(51) int local51 = arg0 * this.anInt3046 >> 12;
		@Pc(58) int local58 = arg1 * this.anInt3037 >> 12;
		@Pc(65) int local65 = arg0 * this.anInt3039 >> 12;
		@Pc(72) int local72 = arg1 * this.anInt3041 >> 12;
		Static285.method4123(local10, local72, local44, local65, super.anInt6746, local37, local51, local58, local30);
	}

	@OriginalMember(owner = "client!he", name = "b", descriptor = "(III)V")
	@Override
	public void method5333(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
	}
}
