import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bh")
public final class Class28_Sub1 extends Class28 {

	@OriginalMember(owner = "client!bh", name = "k", descriptor = "Lclient!wo;")
	public final Class164_Sub3_Sub1 aClass164_Sub3_Sub1_1;

	static {
		new Class45("You already sent an abuse report under 60 secs ago! Do not abuse this system!", "Du hast bereits vor weniger als 60 Sekunden einen Regelverstoß gemeldet!", "Vous avez déjà signalé un abus il y a moins d'une minute ! N'abusez pas du système !", "Você já enviou uma denúncia de abuso há menos de um minuto. Não abuse deste sistema!");
	}

	@OriginalMember(owner = "client!bh", name = "<init>", descriptor = "(Lclient!mh;II[B)V")
	public Class28_Sub1(@OriginalArg(0) Class4_Sub3 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) byte[] arg3) {
		this.aClass164_Sub3_Sub1_1 = Static281.method4925(arg0, arg2, arg3, arg1);
		this.aClass164_Sub3_Sub1_1.method8159(false, false);
	}
}
