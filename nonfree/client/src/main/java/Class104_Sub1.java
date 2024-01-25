import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ip")
public final class Class104_Sub1 extends Class104 {

	@OriginalMember(owner = "client!ip", name = "l", descriptor = "I")
	private final int anInt2789;

	@OriginalMember(owner = "client!ip", name = "s", descriptor = "I")
	private final int anInt2795;

	@OriginalMember(owner = "client!ip", name = "m", descriptor = "I")
	private final int anInt2790;

	@OriginalMember(owner = "client!ip", name = "o", descriptor = "I")
	private final int anInt2792;

	static {
		new Class221("Unable to join clan chat at this time - please try again later!", "Chatraum kann nicht betreten werden - bitte versuch es später erneut.", "Impossible de participer à une discussion de clan pour le moment - veuillez réessayer ultérieurement.", "Não foi possível entrar no bate-papo do clã dessa vez. Tente de novo depois!");
		new Class221("I can't reach that!", "Da kommst du nicht hin.", "Je ne peux pas l'atteindre !", "Não consigo alcançar!");
	}

	@OriginalMember(owner = "client!ip", name = "<init>", descriptor = "(IIIIIII)V")
	public Class104_Sub1(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		super(arg4, arg5, arg6);
		this.anInt2789 = arg2;
		this.anInt2795 = arg1;
		this.anInt2790 = arg0;
		this.anInt2792 = arg3;
	}

	@OriginalMember(owner = "client!ip", name = "a", descriptor = "(ZII)V")
	@Override
	public void method5079(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(14) int local14 = this.anInt2790 * arg0 >> 12;
		@Pc(21) int local21 = this.anInt2789 * arg0 >> 12;
		@Pc(28) int local28 = this.anInt2795 * arg1 >> 12;
		@Pc(35) int local35 = arg1 * this.anInt2792 >> 12;
		Static97.method1769(local35, local21, local28, super.anInt5808, local14);
	}

	@OriginalMember(owner = "client!ip", name = "a", descriptor = "(III)V")
	@Override
	public void method5080(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(17) int local17 = this.anInt2790 * arg1 >> 12;
		@Pc(24) int local24 = arg1 * this.anInt2789 >> 12;
		@Pc(31) int local31 = arg0 * this.anInt2795 >> 12;
		@Pc(38) int local38 = this.anInt2792 * arg0 >> 12;
		Static148.method2525(super.anInt5806, super.anInt5808, local31, super.anInt5807, local17, local24, local38);
	}

	@OriginalMember(owner = "client!ip", name = "a", descriptor = "(BII)V")
	@Override
	public void method5084(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(14) int local14 = arg1 * this.anInt2790 >> 12;
		@Pc(21) int local21 = arg1 * this.anInt2789 >> 12;
		@Pc(28) int local28 = arg0 * this.anInt2795 >> 12;
		@Pc(35) int local35 = arg0 * this.anInt2792 >> 12;
		Static29.method709(super.anInt5806, super.anInt5807, local14, local21, local28, local35);
	}
}
