import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cba")
public final class Class2_Sub11 extends Class2 {

	@OriginalMember(owner = "client!cba", name = "l", descriptor = "Lclient!lk;")
	public final Class1_Sub1_Sub2_Sub2 aClass1_Sub1_Sub2_Sub2_1;

	static {
		new Class202("For that rule you can only report players who have spoken or traded recently.", "Mit dieser Option können nur Spieler gemeldet werden,", "Cette règle n'est invocable que pour les discussions ou échanges récents.", "Para essa regra, você só pode denunciar jogadores com quem tenha falado ou negociado recentemente.");
	}

	@OriginalMember(owner = "client!cba", name = "<init>", descriptor = "(Lclient!lk;)V")
	public Class2_Sub11(@OriginalArg(0) Class1_Sub1_Sub2_Sub2 arg0) {
		this.aClass1_Sub1_Sub2_Sub2_1 = arg0;
	}
}
