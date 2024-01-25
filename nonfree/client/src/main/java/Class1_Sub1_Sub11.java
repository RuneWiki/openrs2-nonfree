import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sda")
public abstract class Class1_Sub1_Sub11 extends Class1_Sub1 {

	@OriginalMember(owner = "client!sda", name = "q", descriptor = "Z")
	public boolean aBoolean561;

	@OriginalMember(owner = "client!sda", name = "s", descriptor = "Z")
	public boolean aBoolean563;

	@OriginalMember(owner = "client!sda", name = "r", descriptor = "Z")
	public volatile boolean aBoolean562 = true;

	static {
		new Class114("For that rule you can only report players who have spoken or traded recently.", "Mit dieser Option können nur Spieler gemeldet werden,", "Cette règle n'est invocable que pour les discussions ou échanges récents.", "Para essa regra, você só pode denunciar jogadores com quem tenha falado ou negociado recentemente.");
	}

	@OriginalMember(owner = "client!sda", name = "b", descriptor = "(B)I")
	public abstract int method6986();

	@OriginalMember(owner = "client!sda", name = "a", descriptor = "(I)[B")
	public abstract byte[] method6987();
}
