import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!wr")
public final class Class7_Sub4 extends Class7 {

	@OriginalMember(owner = "client!wr", name = "r", descriptor = "I")
	private final int anInt6840;

	@OriginalMember(owner = "client!wr", name = "w", descriptor = "I")
	private final int anInt6845;

	@OriginalMember(owner = "client!wr", name = "t", descriptor = "I")
	private final int anInt6842;

	@OriginalMember(owner = "client!wr", name = "p", descriptor = "I")
	private final int anInt6838;

	@OriginalMember(owner = "client!wr", name = "A", descriptor = "I")
	private final int anInt6848;

	@OriginalMember(owner = "client!wr", name = "v", descriptor = "I")
	private final int anInt6844;

	@OriginalMember(owner = "client!wr", name = "n", descriptor = "I")
	private final int anInt6836;

	@OriginalMember(owner = "client!wr", name = "x", descriptor = "I")
	private final int anInt6846;

	@OriginalMember(owner = "client!wr", name = "<init>", descriptor = "(IIIIIIIIII)V")
	public Class7_Sub4(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9) {
		super(-1, arg8, arg9);
		this.anInt6840 = arg6;
		this.anInt6845 = arg2;
		this.anInt6842 = arg4;
		this.anInt6838 = arg1;
		this.anInt6848 = arg0;
		this.anInt6844 = arg3;
		this.anInt6836 = arg7;
		this.anInt6846 = arg5;
	}

	@OriginalMember(owner = "client!wr", name = "a", descriptor = "(III)V")
	@Override
	public void method6053(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(10) int local10 = arg1 * this.anInt6848 >> 12;
		@Pc(17) int local17 = arg0 * this.anInt6838 >> 12;
		@Pc(24) int local24 = arg1 * this.anInt6845 >> 12;
		@Pc(31) int local31 = this.anInt6844 * arg0 >> 12;
		@Pc(38) int local38 = this.anInt6842 * arg1 >> 12;
		@Pc(45) int local45 = this.anInt6846 * arg0 >> 12;
		@Pc(52) int local52 = arg1 * this.anInt6840 >> 12;
		@Pc(65) int local65 = this.anInt6836 * arg0 >> 12;
		Static15.method288(local31, local52, local38, local65, local10, local24, super.anInt6830, local17, local45);
	}

	@OriginalMember(owner = "client!wr", name = "b", descriptor = "(III)V")
	@Override
	public void method6054(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
	}

	@OriginalMember(owner = "client!wr", name = "a", descriptor = "(ZII)V")
	@Override
	public void method6051(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
	}
}
