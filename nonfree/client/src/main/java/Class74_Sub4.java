import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!uu")
public final class Class74_Sub4 extends Class74 {

	@OriginalMember(owner = "client!uu", name = "o", descriptor = "I")
	private final int anInt9657;

	@OriginalMember(owner = "client!uu", name = "i", descriptor = "I")
	private final int anInt9651;

	@OriginalMember(owner = "client!uu", name = "n", descriptor = "I")
	private final int anInt9656;

	@OriginalMember(owner = "client!uu", name = "m", descriptor = "I")
	private final int anInt9655;

	@OriginalMember(owner = "client!uu", name = "r", descriptor = "I")
	private final int anInt9660;

	@OriginalMember(owner = "client!uu", name = "h", descriptor = "I")
	private final int anInt9650;

	@OriginalMember(owner = "client!uu", name = "p", descriptor = "I")
	private final int anInt9658;

	@OriginalMember(owner = "client!uu", name = "f", descriptor = "I")
	private final int anInt9648;

	@OriginalMember(owner = "client!uu", name = "<init>", descriptor = "(IIIIIIIIII)V")
	public Class74_Sub4(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9) {
		super(-1, arg8, arg9);
		this.anInt9657 = arg1;
		this.anInt9651 = arg6;
		this.anInt9656 = arg5;
		this.anInt9655 = arg3;
		this.anInt9660 = arg7;
		this.anInt9650 = arg4;
		this.anInt9658 = arg0;
		this.anInt9648 = arg2;
	}

	@OriginalMember(owner = "client!uu", name = "a", descriptor = "(IBI)V")
	@Override
	public void method8218(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
	}

	@OriginalMember(owner = "client!uu", name = "a", descriptor = "(III)V")
	@Override
	public void method8221(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(14) int local14 = arg1 * this.anInt9658 >> 12;
		@Pc(21) int local21 = this.anInt9657 * arg0 >> 12;
		@Pc(28) int local28 = this.anInt9648 * arg1 >> 12;
		@Pc(35) int local35 = this.anInt9655 * arg0 >> 12;
		@Pc(42) int local42 = this.anInt9650 * arg1 >> 12;
		@Pc(49) int local49 = arg0 * this.anInt9656 >> 12;
		@Pc(56) int local56 = arg1 * this.anInt9651 >> 12;
		@Pc(63) int local63 = this.anInt9660 * arg0 >> 12;
		Static446.method6453(local28, local14, local35, local56, local63, super.anInt9645, local42, local49, local21);
	}

	@OriginalMember(owner = "client!uu", name = "b", descriptor = "(IBI)V")
	@Override
	public void method8219(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
	}
}
