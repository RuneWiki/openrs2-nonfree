import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!lf")
public final class Class95_Sub2 extends Class95 {

	@OriginalMember(owner = "client!lf", name = "B", descriptor = "I")
	private int anInt3064;

	@OriginalMember(owner = "client!lf", name = "l", descriptor = "I")
	private int anInt3050;

	@OriginalMember(owner = "client!lf", name = "q", descriptor = "I")
	private int anInt3055;

	@OriginalMember(owner = "client!lf", name = "v", descriptor = "I")
	private int anInt3059;

	@OriginalMember(owner = "client!lf", name = "E", descriptor = "I")
	private int anInt3066;

	@OriginalMember(owner = "client!lf", name = "u", descriptor = "I")
	private int anInt3058;

	@OriginalMember(owner = "client!lf", name = "y", descriptor = "I")
	private int anInt3061;

	@OriginalMember(owner = "client!lf", name = "o", descriptor = "I")
	private int anInt3053;

	@OriginalMember(owner = "client!lf", name = "<init>", descriptor = "(IIIIIIIIII)V")
	public Class95_Sub2(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9) {
		super(-1, arg8, arg9);
		this.anInt3064 = arg1;
		this.anInt3050 = arg7;
		this.anInt3055 = arg4;
		this.anInt3059 = arg0;
		this.anInt3066 = arg6;
		this.anInt3058 = arg5;
		this.anInt3061 = arg2;
		this.anInt3053 = arg3;
	}

	@OriginalMember(owner = "client!lf", name = "a", descriptor = "(BII)V")
	@Override
	public void method3993(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
	}

	@OriginalMember(owner = "client!lf", name = "a", descriptor = "(III)V")
	@Override
	public void method3990(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(10) int local10 = this.anInt3059 * arg1 >> 12;
		@Pc(17) int local17 = this.anInt3064 * arg0 >> 12;
		@Pc(28) int local28 = arg0 * this.anInt3053 >> 12;
		@Pc(35) int local35 = this.anInt3061 * arg1 >> 12;
		@Pc(42) int local42 = this.anInt3055 * arg1 >> 12;
		@Pc(49) int local49 = arg1 * this.anInt3066 >> 12;
		@Pc(56) int local56 = arg0 * this.anInt3058 >> 12;
		@Pc(63) int local63 = this.anInt3050 * arg0 >> 12;
		Static286.method4298(this.anInt4995, local35, local28, local42, local17, local56, local49, local63, local10);
	}

	@OriginalMember(owner = "client!lf", name = "a", descriptor = "(IIZ)V")
	@Override
	public void method3991(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
	}
}
