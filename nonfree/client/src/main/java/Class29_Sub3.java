import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!qn")
public final class Class29_Sub3 extends Class29 {

	@OriginalMember(owner = "client!qn", name = "p", descriptor = "I")
	private final int anInt5061;

	@OriginalMember(owner = "client!qn", name = "B", descriptor = "I")
	private final int anInt5070;

	@OriginalMember(owner = "client!qn", name = "w", descriptor = "I")
	private final int anInt5065;

	@OriginalMember(owner = "client!qn", name = "z", descriptor = "I")
	private final int anInt5068;

	@OriginalMember(owner = "client!qn", name = "o", descriptor = "I")
	private final int anInt5060;

	@OriginalMember(owner = "client!qn", name = "n", descriptor = "I")
	private final int anInt5059;

	@OriginalMember(owner = "client!qn", name = "A", descriptor = "I")
	private final int anInt5069;

	@OriginalMember(owner = "client!qn", name = "s", descriptor = "I")
	private final int anInt5062;

	@OriginalMember(owner = "client!qn", name = "<init>", descriptor = "(IIIIIIIIII)V")
	public Class29_Sub3(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9) {
		super(-1, arg8, arg9);
		this.anInt5061 = arg1;
		this.anInt5070 = arg5;
		this.anInt5065 = arg2;
		this.anInt5068 = arg0;
		this.anInt5060 = arg4;
		this.anInt5059 = arg6;
		this.anInt5069 = arg7;
		this.anInt5062 = arg3;
	}

	@OriginalMember(owner = "client!qn", name = "b", descriptor = "(IIB)V")
	@Override
	public void method5053(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
	}

	@OriginalMember(owner = "client!qn", name = "a", descriptor = "(III)V")
	@Override
	public void method5055(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
	}

	@OriginalMember(owner = "client!qn", name = "a", descriptor = "(IIB)V")
	@Override
	public void method5051(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(14) int local14 = arg0 * this.anInt5068 >> 12;
		@Pc(21) int local21 = this.anInt5061 * arg1 >> 12;
		@Pc(28) int local28 = arg0 * this.anInt5065 >> 12;
		@Pc(35) int local35 = this.anInt5062 * arg1 >> 12;
		@Pc(42) int local42 = this.anInt5060 * arg0 >> 12;
		@Pc(49) int local49 = arg1 * this.anInt5070 >> 12;
		@Pc(56) int local56 = this.anInt5059 * arg0 >> 12;
		@Pc(63) int local63 = this.anInt5069 * arg1 >> 12;
		Static9.method280(local49, local14, local42, super.anInt5716, local63, local28, local21, local56, local35);
	}
}
