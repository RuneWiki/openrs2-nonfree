import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kd")
public final class Class77_Sub1 extends Class77 {

	@OriginalMember(owner = "client!kd", name = "n", descriptor = "[I")
	public final int[] anIntArray281;

	@OriginalMember(owner = "client!kd", name = "q", descriptor = "[I")
	public final int[] anIntArray282;

	static {
		new Class93("You already sent an abuse report under 60 secs ago! Do not abuse this system!", "Du hast bereits vor weniger als 60 Sekunden einen Regelverstoß gemeldet!", "Vous avez déjà signalé un abus il y a moins d'une minute ! N'abusez pas du système !", "Você já enviou uma denúncia de abuso há menos de um minuto. Não abuse deste sistema!");
	}

	@OriginalMember(owner = "client!kd", name = "<init>", descriptor = "(II[I[I)V")
	public Class77_Sub1(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[] arg2, @OriginalArg(3) int[] arg3) {
		this.anIntArray281 = arg2;
		this.anIntArray282 = arg3;
	}
}
