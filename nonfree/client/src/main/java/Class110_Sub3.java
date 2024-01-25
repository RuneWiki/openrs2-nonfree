import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!pda")
public final class Class110_Sub3 extends Class110 {

	@OriginalMember(owner = "client!pda", name = "h", descriptor = "I")
	private final int anInt7306;

	@OriginalMember(owner = "client!pda", name = "k", descriptor = "I")
	private final int anInt7308;

	@OriginalMember(owner = "client!pda", name = "p", descriptor = "I")
	private final int anInt7313;

	@OriginalMember(owner = "client!pda", name = "f", descriptor = "I")
	private final int anInt7304;

	@OriginalMember(owner = "client!pda", name = "t", descriptor = "I")
	private final int anInt7316;

	@OriginalMember(owner = "client!pda", name = "i", descriptor = "I")
	private final int anInt7307;

	@OriginalMember(owner = "client!pda", name = "n", descriptor = "I")
	private final int anInt7311;

	@OriginalMember(owner = "client!pda", name = "o", descriptor = "I")
	private final int anInt7312;

	@OriginalMember(owner = "client!pda", name = "<init>", descriptor = "(IIIIIIIIII)V")
	public Class110_Sub3(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9) {
		super(-1, arg8, arg9);
		this.anInt7306 = arg6;
		this.anInt7308 = arg7;
		this.anInt7313 = arg0;
		this.anInt7304 = arg1;
		this.anInt7316 = arg2;
		this.anInt7307 = arg4;
		this.anInt7311 = arg5;
		this.anInt7312 = arg3;
	}

	@OriginalMember(owner = "client!pda", name = "a", descriptor = "(IIB)V")
	@Override
	public void method7738(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
	}

	@OriginalMember(owner = "client!pda", name = "b", descriptor = "(III)V")
	@Override
	public void method7737(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(10) int local10 = this.anInt7313 * arg0 >> 12;
		@Pc(17) int local17 = this.anInt7304 * arg1 >> 12;
		@Pc(24) int local24 = this.anInt7316 * arg0 >> 12;
		@Pc(31) int local31 = this.anInt7312 * arg1 >> 12;
		@Pc(38) int local38 = arg0 * this.anInt7307 >> 12;
		@Pc(51) int local51 = arg1 * this.anInt7311 >> 12;
		@Pc(58) int local58 = arg0 * this.anInt7306 >> 12;
		@Pc(65) int local65 = arg1 * this.anInt7308 >> 12;
		Static199.method3473(super.anInt9840, local65, local58, local17, local38, local10, local31, local24, local51);
	}

	@OriginalMember(owner = "client!pda", name = "a", descriptor = "(III)V")
	@Override
	public void method7735(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
	}
}
