import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!wn")
public final class Class125_Sub4 extends Class125 {

	@OriginalMember(owner = "client!wn", name = "y", descriptor = "I")
	private final int anInt10763;

	@OriginalMember(owner = "client!wn", name = "s", descriptor = "I")
	private final int anInt10761;

	@OriginalMember(owner = "client!wn", name = "u", descriptor = "I")
	private final int anInt10766;

	@OriginalMember(owner = "client!wn", name = "m", descriptor = "I")
	private final int anInt10762;

	@OriginalMember(owner = "client!wn", name = "q", descriptor = "I")
	private final int anInt10759;

	@OriginalMember(owner = "client!wn", name = "w", descriptor = "I")
	private final int anInt10769;

	@OriginalMember(owner = "client!wn", name = "n", descriptor = "I")
	private final int anInt10760;

	@OriginalMember(owner = "client!wn", name = "z", descriptor = "I")
	private final int anInt10764;

	@OriginalMember(owner = "client!wn", name = "<init>", descriptor = "(IIIIIIIIII)V")
	public Class125_Sub4(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9) {
		super(-1, arg8, arg9);
		this.anInt10763 = arg5;
		this.anInt10761 = arg4;
		this.anInt10766 = arg3;
		this.anInt10762 = arg1;
		this.anInt10759 = arg2;
		this.anInt10769 = arg6;
		this.anInt10760 = arg0;
		this.anInt10764 = arg7;
	}

	@OriginalMember(owner = "client!wn", name = "a", descriptor = "(ZII)V")
	@Override
	public void method9263(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
	}

	@OriginalMember(owner = "client!wn", name = "a", descriptor = "(III)V")
	@Override
	public void method9264(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
	}

	@OriginalMember(owner = "client!wn", name = "a", descriptor = "(IIB)V")
	@Override
	public void method9258(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(10) int local10 = this.anInt10760 * arg1 >> 12;
		@Pc(24) int local24 = this.anInt10762 * arg0 >> 12;
		@Pc(31) int local31 = this.anInt10759 * arg1 >> 12;
		@Pc(38) int local38 = this.anInt10766 * arg0 >> 12;
		@Pc(45) int local45 = this.anInt10761 * arg1 >> 12;
		@Pc(52) int local52 = this.anInt10763 * arg0 >> 12;
		@Pc(59) int local59 = arg1 * this.anInt10769 >> 12;
		@Pc(66) int local66 = arg0 * this.anInt10764 >> 12;
		Static32.method552(super.anInt10751, local24, local10, local31, local38, local52, local45, local59, local66);
	}
}
