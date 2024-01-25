import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!wh")
public final class Class111_Sub4 extends Class111 {

	@OriginalMember(owner = "client!wh", name = "p", descriptor = "I")
	private final int anInt9322;

	@OriginalMember(owner = "client!wh", name = "f", descriptor = "I")
	private final int anInt9312;

	@OriginalMember(owner = "client!wh", name = "k", descriptor = "I")
	private final int anInt9317;

	@OriginalMember(owner = "client!wh", name = "o", descriptor = "I")
	private final int anInt9321;

	@OriginalMember(owner = "client!wh", name = "j", descriptor = "I")
	private final int anInt9316;

	@OriginalMember(owner = "client!wh", name = "m", descriptor = "I")
	private final int anInt9319;

	@OriginalMember(owner = "client!wh", name = "n", descriptor = "I")
	private final int anInt9320;

	@OriginalMember(owner = "client!wh", name = "i", descriptor = "I")
	private final int anInt9315;

	@OriginalMember(owner = "client!wh", name = "<init>", descriptor = "(IIIIIIIIII)V")
	public Class111_Sub4(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9) {
		super(-1, arg8, arg9);
		this.anInt9322 = arg5;
		this.anInt9312 = arg0;
		this.anInt9317 = arg2;
		this.anInt9321 = arg3;
		this.anInt9316 = arg6;
		this.anInt9319 = arg4;
		this.anInt9320 = arg1;
		this.anInt9315 = arg7;
	}

	@OriginalMember(owner = "client!wh", name = "a", descriptor = "(III)V")
	@Override
	public void method7711(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
	}

	@OriginalMember(owner = "client!wh", name = "a", descriptor = "(IIB)V")
	@Override
	public void method7713(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
	}

	@OriginalMember(owner = "client!wh", name = "a", descriptor = "(IZI)V")
	@Override
	public void method7714(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(18) int local18 = this.anInt9312 * arg0 >> 12;
		@Pc(25) int local25 = arg1 * this.anInt9320 >> 12;
		@Pc(32) int local32 = this.anInt9317 * arg0 >> 12;
		@Pc(39) int local39 = arg1 * this.anInt9321 >> 12;
		@Pc(46) int local46 = arg0 * this.anInt9319 >> 12;
		@Pc(53) int local53 = arg1 * this.anInt9322 >> 12;
		@Pc(60) int local60 = this.anInt9316 * arg0 >> 12;
		@Pc(67) int local67 = this.anInt9315 * arg1 >> 12;
		Static363.method5454(local32, local46, local25, local67, local53, local60, local39, super.anInt9311, local18);
	}
}
