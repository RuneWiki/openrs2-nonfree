import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qg")
public final class Class244 {

	@OriginalMember(owner = "client!qg", name = "c", descriptor = "I")
	public final int anInt7151;

	@OriginalMember(owner = "client!qg", name = "a", descriptor = "Lclient!lh;")
	private final Class62_Sub1_Sub2 aClass62_Sub1_Sub2_8;

	static {
		new Class40("For that rule you can only report players who have spoken or traded recently.", "Mit dieser Option können nur Spieler gemeldet werden,", "Cette règle n'est invocable que pour les discussions ou échanges récents.", "Para essa regra, você só pode denunciar jogadores com quem tenha falado ou negociado recentemente.");
	}

	@OriginalMember(owner = "client!qg", name = "<init>", descriptor = "(Lclient!lh;II)V")
	public Class244(@OriginalArg(0) Class62_Sub1_Sub2 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.anInt7151 = arg2;
		this.aClass62_Sub1_Sub2_8 = arg0;
	}

	@OriginalMember(owner = "client!qg", name = "finalize", descriptor = "()V")
	@Override
	public void finalize() throws Throwable {
		this.aClass62_Sub1_Sub2_8.method4792(this.anInt7151);
		super.finalize();
	}
}
