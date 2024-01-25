import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!wh")
public final class Class85_Sub4 extends Class85 {

	@OriginalMember(owner = "client!wh", name = "w", descriptor = "I")
	private final int anInt7183;

	@OriginalMember(owner = "client!wh", name = "n", descriptor = "I")
	private final int anInt7174;

	@OriginalMember(owner = "client!wh", name = "v", descriptor = "I")
	private final int anInt7182;

	@OriginalMember(owner = "client!wh", name = "q", descriptor = "I")
	private final int anInt7177;

	@OriginalMember(owner = "client!wh", name = "k", descriptor = "I")
	private final int anInt7172;

	@OriginalMember(owner = "client!wh", name = "x", descriptor = "I")
	private final int anInt7184;

	@OriginalMember(owner = "client!wh", name = "t", descriptor = "I")
	private final int anInt7180;

	@OriginalMember(owner = "client!wh", name = "r", descriptor = "I")
	private final int anInt7178;

	static {
		new Class7("For that rule you can only report players who have spoken or traded recently.", "Mit dieser Option können nur Spieler gemeldet werden,", "Cette règle n'est invocable que pour les discussions ou échanges récents.", "Para essa regra, você só pode denunciar jogadores com quem tenha falado ou negociado recentemente.");
	}

	@OriginalMember(owner = "client!wh", name = "<init>", descriptor = "(IIIIIIIIII)V")
	public Class85_Sub4(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9) {
		super(-1, arg8, arg9);
		this.anInt7183 = arg2;
		this.anInt7174 = arg7;
		this.anInt7182 = arg3;
		this.anInt7177 = arg6;
		this.anInt7172 = arg0;
		this.anInt7184 = arg1;
		this.anInt7180 = arg5;
		this.anInt7178 = arg4;
	}

	@OriginalMember(owner = "client!wh", name = "a", descriptor = "(IIB)V")
	@Override
	public void method5870(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
	}

	@OriginalMember(owner = "client!wh", name = "a", descriptor = "(IBI)V")
	@Override
	public void method5869(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(10) int local10 = this.anInt7172 * arg0 >> 12;
		@Pc(17) int local17 = arg1 * this.anInt7184 >> 12;
		@Pc(24) int local24 = arg0 * this.anInt7183 >> 12;
		@Pc(31) int local31 = arg1 * this.anInt7182 >> 12;
		@Pc(38) int local38 = this.anInt7178 * arg0 >> 12;
		@Pc(45) int local45 = arg1 * this.anInt7180 >> 12;
		@Pc(52) int local52 = this.anInt7177 * arg0 >> 12;
		@Pc(63) int local63 = this.anInt7174 * arg1 >> 12;
		Static403.method5424(local17, local63, local24, super.anInt7170, local38, local45, local31, local10, local52);
	}

	@OriginalMember(owner = "client!wh", name = "c", descriptor = "(III)V")
	@Override
	public void method5867(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
	}
}
