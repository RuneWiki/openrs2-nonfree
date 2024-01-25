import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!au")
public abstract class Class5_Sub2_Sub2 extends Class5_Sub2 {

	@OriginalMember(owner = "client!au", name = "t", descriptor = "Z")
	public boolean aBoolean233;

	@OriginalMember(owner = "client!au", name = "z", descriptor = "Z")
	public boolean aBoolean235;

	@OriginalMember(owner = "client!au", name = "w", descriptor = "Z")
	public volatile boolean aBoolean234 = true;

	static {
		new Class40("You already sent an abuse report under 60 secs ago! Do not abuse this system!", "Du hast bereits vor weniger als 60 Sekunden einen Regelverstoß gemeldet!", "Vous avez déjà signalé un abus il y a moins d'une minute ! N'abusez pas du système !", "Você já enviou uma denúncia de abuso há menos de um minuto. Não abuse deste sistema!");
	}

	@OriginalMember(owner = "client!au", name = "a", descriptor = "(I)I")
	public abstract int method3371();

	@OriginalMember(owner = "client!au", name = "c", descriptor = "(I)[B")
	public abstract byte[] method3373();
}
