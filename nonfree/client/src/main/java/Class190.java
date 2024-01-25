import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!pi")
public final class Class190 {

	@OriginalMember(owner = "client!pi", name = "f", descriptor = "Lclient!mo;")
	private final Class160 aClass160_40 = new Class160(64);

	@OriginalMember(owner = "client!pi", name = "k", descriptor = "Lclient!nl;")
	private final Class171 aClass171_65;

	@OriginalMember(owner = "client!pi", name = "i", descriptor = "I")
	public final int anInt4616;

	static {
		new Class32("For that rule you can only report players who have spoken or traded recently.", "Mit dieser Option können nur Spieler gemeldet werden,", "Cette règle n'est invocable que pour les discussions ou échanges récents.", "Para essa regra, você só pode denunciar jogadores com quem tenha falado ou negociado recentemente.");
	}

	@OriginalMember(owner = "client!pi", name = "<init>", descriptor = "(Lclient!lo;ILclient!nl;)V")
	public Class190(@OriginalArg(0) Class150 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class171 arg2) {
		this.aClass171_65 = arg2;
		this.anInt4616 = this.aClass171_65.method3750(19);
	}

	@OriginalMember(owner = "client!pi", name = "a", descriptor = "(II)Lclient!nh;")
	public Class168 method4085(@OriginalArg(1) int arg0) {
		@Pc(6) Class160 local6 = this.aClass160_40;
		@Pc(16) Class168 local16;
		synchronized (this.aClass160_40) {
			local16 = (Class168) this.aClass160_40.method3599((long) arg0);
		}
		if (local16 != null) {
			return local16;
		}
		@Pc(33) byte[] local33 = this.aClass171_65.method3745(19, arg0);
		local16 = new Class168();
		if (local33 != null) {
			local16.method3715(new Class2_Sub16(local33));
		}
		@Pc(49) Class160 local49 = this.aClass160_40;
		synchronized (this.aClass160_40) {
			this.aClass160_40.method3602((long) arg0, local16);
			return local16;
		}
	}
}
