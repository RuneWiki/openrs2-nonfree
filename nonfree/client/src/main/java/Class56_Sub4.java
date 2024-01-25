import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ll")
public final class Class56_Sub4 extends Class56 {

	@OriginalMember(owner = "client!ll", name = "k", descriptor = "I")
	private final int anInt5412;

	@OriginalMember(owner = "client!ll", name = "p", descriptor = "I")
	private final int anInt5416;

	@OriginalMember(owner = "client!ll", name = "o", descriptor = "I")
	private final int anInt5415;

	@OriginalMember(owner = "client!ll", name = "g", descriptor = "I")
	private final int anInt5409;

	@OriginalMember(owner = "client!ll", name = "m", descriptor = "I")
	private final int anInt5414;

	@OriginalMember(owner = "client!ll", name = "l", descriptor = "I")
	private final int anInt5413;

	@OriginalMember(owner = "client!ll", name = "h", descriptor = "I")
	private final int anInt5410;

	@OriginalMember(owner = "client!ll", name = "r", descriptor = "I")
	private final int anInt5417;

	@OriginalMember(owner = "client!ll", name = "<init>", descriptor = "(IIIIIIIIII)V")
	public Class56_Sub4(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9) {
		super(-1, arg8, arg9);
		this.anInt5412 = arg6;
		this.anInt5416 = arg2;
		this.anInt5415 = arg3;
		this.anInt5409 = arg5;
		this.anInt5414 = arg4;
		this.anInt5413 = arg7;
		this.anInt5410 = arg1;
		this.anInt5417 = arg0;
	}

	@OriginalMember(owner = "client!ll", name = "a", descriptor = "(IIZ)V")
	@Override
	public void method4857(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(10) int local10 = arg1 * this.anInt5417 >> 12;
		@Pc(17) int local17 = this.anInt5410 * arg0 >> 12;
		@Pc(24) int local24 = arg1 * this.anInt5416 >> 12;
		@Pc(31) int local31 = this.anInt5415 * arg0 >> 12;
		@Pc(38) int local38 = arg1 * this.anInt5414 >> 12;
		@Pc(51) int local51 = this.anInt5409 * arg0 >> 12;
		@Pc(58) int local58 = this.anInt5412 * arg1 >> 12;
		@Pc(65) int local65 = arg0 * this.anInt5413 >> 12;
		Static627.method8867(local31, super.anInt5408, local24, local58, local17, local51, local65, local38, local10);
	}

	@OriginalMember(owner = "client!ll", name = "a", descriptor = "(ZII)V")
	@Override
	public void method4858(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
	}

	@OriginalMember(owner = "client!ll", name = "a", descriptor = "(III)V")
	@Override
	public void method4856(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
	}
}
