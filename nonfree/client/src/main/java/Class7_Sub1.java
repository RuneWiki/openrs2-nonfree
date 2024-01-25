import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ag")
public final class Class7_Sub1 extends Class7 {

	@OriginalMember(owner = "client!ag", name = "q", descriptor = "I")
	private final int anInt125;

	@OriginalMember(owner = "client!ag", name = "x", descriptor = "I")
	private final int anInt132;

	@OriginalMember(owner = "client!ag", name = "n", descriptor = "I")
	private final int anInt122;

	@OriginalMember(owner = "client!ag", name = "s", descriptor = "I")
	private final int anInt127;

	static {
		new Class85("You already sent an abuse report under 60 secs ago! Do not abuse this system!", "Du hast bereits vor weniger als 60 Sekunden einen Regelverstoß gemeldet!", "Vous avez déjà signalé un abus il y a moins d'une minute ! N'abusez pas du système !", "Você já enviou uma denúncia de abuso há menos de um minuto. Não abuse deste sistema!");
	}

	@OriginalMember(owner = "client!ag", name = "<init>", descriptor = "(IIIIIII)V")
	public Class7_Sub1(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		super(arg4, arg5, arg6);
		this.anInt125 = arg1;
		this.anInt132 = arg3;
		this.anInt122 = arg0;
		this.anInt127 = arg2;
	}

	@OriginalMember(owner = "client!ag", name = "a", descriptor = "(III)V")
	@Override
	public void method6053(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(10) int local10 = this.anInt122 * arg1 >> 12;
		@Pc(17) int local17 = this.anInt127 * arg1 >> 12;
		@Pc(24) int local24 = arg0 * this.anInt125 >> 12;
		@Pc(39) int local39 = arg0 * this.anInt132 >> 12;
		Static33.method565(local24, local17, super.anInt6831, super.anInt6830, local39, local10);
	}

	@OriginalMember(owner = "client!ag", name = "b", descriptor = "(III)V")
	@Override
	public void method6054(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(14) int local14 = arg1 * this.anInt122 >> 12;
		@Pc(21) int local21 = arg1 * this.anInt127 >> 12;
		@Pc(28) int local28 = this.anInt125 * arg0 >> 12;
		@Pc(35) int local35 = arg0 * this.anInt132 >> 12;
		Static178.method3196(local14, local21, local35, super.anInt6834, local28);
	}

	@OriginalMember(owner = "client!ag", name = "a", descriptor = "(ZII)V")
	@Override
	public void method6051(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(10) int local10 = arg0 * this.anInt122 >> 12;
		@Pc(17) int local17 = arg0 * this.anInt127 >> 12;
		@Pc(24) int local24 = this.anInt125 * arg1 >> 12;
		@Pc(31) int local31 = arg1 * this.anInt132 >> 12;
		Static69.method1303(local17, super.anInt6830, super.anInt6831, local24, local10, super.anInt6834, local31);
	}
}
