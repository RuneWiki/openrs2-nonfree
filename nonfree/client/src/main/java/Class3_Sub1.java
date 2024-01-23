import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ea")
public final class Class3_Sub1 extends Class3 {

	@OriginalMember(owner = "client!ea", name = "s", descriptor = "I")
	private final int anInt1087;

	@OriginalMember(owner = "client!ea", name = "r", descriptor = "I")
	private final int anInt1086;

	@OriginalMember(owner = "client!ea", name = "v", descriptor = "I")
	private final int anInt1089;

	@OriginalMember(owner = "client!ea", name = "o", descriptor = "I")
	private final int anInt1083;

	@OriginalMember(owner = "client!ea", name = "n", descriptor = "I")
	private final int anInt1082;

	@OriginalMember(owner = "client!ea", name = "q", descriptor = "I")
	private final int anInt1085;

	@OriginalMember(owner = "client!ea", name = "m", descriptor = "I")
	private final int anInt1081;

	@OriginalMember(owner = "client!ea", name = "y", descriptor = "I")
	private final int anInt1092;

	@OriginalMember(owner = "client!ea", name = "<init>", descriptor = "(IIIIIIIIII)V")
	public Class3_Sub1(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9) {
		super(-1, arg8, arg9);
		this.anInt1087 = arg3;
		this.anInt1086 = arg0;
		this.anInt1089 = arg5;
		this.anInt1083 = arg6;
		this.anInt1082 = arg2;
		this.anInt1085 = arg1;
		this.anInt1081 = arg7;
		this.anInt1092 = arg4;
	}

	@OriginalMember(owner = "client!ea", name = "a", descriptor = "(III)V")
	@Override
	public void method3660(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
	}

	@OriginalMember(owner = "client!ea", name = "a", descriptor = "(IBI)V")
	@Override
	public void method3661(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
	}

	@OriginalMember(owner = "client!ea", name = "b", descriptor = "(III)V")
	@Override
	public void method3663(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(14) int local14 = arg0 * this.anInt1086 >> 12;
		@Pc(21) int local21 = this.anInt1085 * arg1 >> 12;
		@Pc(28) int local28 = this.anInt1082 * arg0 >> 12;
		@Pc(35) int local35 = arg1 * this.anInt1087 >> 12;
		@Pc(42) int local42 = this.anInt1092 * arg0 >> 12;
		@Pc(49) int local49 = arg1 * this.anInt1089 >> 12;
		@Pc(56) int local56 = arg0 * this.anInt1083 >> 12;
		@Pc(63) int local63 = this.anInt1081 * arg1 >> 12;
		Static109.method1904(local14, local49, local63, local35, local42, super.anInt4875, local28, local56, local21);
	}
}
