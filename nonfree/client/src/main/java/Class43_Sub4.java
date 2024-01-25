import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!gd")
public final class Class43_Sub4 extends Class43 {

	@OriginalMember(owner = "client!gd", name = "q", descriptor = "I")
	private final int anInt2486;

	@OriginalMember(owner = "client!gd", name = "j", descriptor = "I")
	private final int anInt2480;

	@OriginalMember(owner = "client!gd", name = "o", descriptor = "I")
	private final int anInt2484;

	@OriginalMember(owner = "client!gd", name = "n", descriptor = "I")
	private final int anInt2483;

	@OriginalMember(owner = "client!gd", name = "p", descriptor = "I")
	private final int anInt2485;

	@OriginalMember(owner = "client!gd", name = "r", descriptor = "I")
	private final int anInt2487;

	@OriginalMember(owner = "client!gd", name = "i", descriptor = "I")
	private final int anInt2479;

	@OriginalMember(owner = "client!gd", name = "v", descriptor = "I")
	private final int anInt2490;

	@OriginalMember(owner = "client!gd", name = "<init>", descriptor = "(IIIIIIIIII)V")
	public Class43_Sub4(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9) {
		super(-1, arg8, arg9);
		this.anInt2486 = arg1;
		this.anInt2480 = arg0;
		this.anInt2484 = arg5;
		this.anInt2483 = arg6;
		this.anInt2485 = arg4;
		this.anInt2487 = arg2;
		this.anInt2479 = arg7;
		this.anInt2490 = arg3;
	}

	@OriginalMember(owner = "client!gd", name = "a", descriptor = "(BII)V")
	@Override
	public void method2013(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
	}

	@OriginalMember(owner = "client!gd", name = "a", descriptor = "(IIZ)V")
	@Override
	public void method2016(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
	}

	@OriginalMember(owner = "client!gd", name = "a", descriptor = "(ZII)V")
	@Override
	public void method2017(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(10) int local10 = arg1 * this.anInt2480 >> 12;
		@Pc(17) int local17 = this.anInt2486 * arg0 >> 12;
		@Pc(24) int local24 = this.anInt2487 * arg1 >> 12;
		@Pc(31) int local31 = this.anInt2490 * arg0 >> 12;
		@Pc(38) int local38 = arg1 * this.anInt2485 >> 12;
		@Pc(51) int local51 = arg0 * this.anInt2484 >> 12;
		@Pc(58) int local58 = arg1 * this.anInt2483 >> 12;
		@Pc(65) int local65 = this.anInt2479 * arg0 >> 12;
		Static315.method5102(local38, local58, local10, local24, local17, local65, super.anInt2475, local31, local51);
	}
}
