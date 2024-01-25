import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!mv")
public final class Class167 {

	@OriginalMember(owner = "client!mv", name = "k", descriptor = "Lclient!kh;")
	private final Class134 aClass134_40 = new Class134(64);

	@OriginalMember(owner = "client!mv", name = "b", descriptor = "Lclient!ul;")
	private final Class246 aClass246_141;

	static {
		new Class7("Adventurer", "Abenteurer", "Aventurier", "Aventureiro");
		new Class7("You have been temporarily muted due to breaking a rule.", "Aufgrund eines Regelverstoßes wurdest du vorübergehend stumm geschaltet.", "La messagerie instantanée a été temporairement bloquée suite à une infraction.", "Você foi temporariamente vetado por ter violado uma regra.");
		new Class7("To prevent further mutes please read the rules.", "Um eine erneute Stummschaltung zu verhindern, lies bitte die Regeln.", "Pour éviter un nouveau blocage, lisez le règlement.", "Para evitar outros vetos, leia as regras.");
	}

	@OriginalMember(owner = "client!mv", name = "<init>", descriptor = "(Lclient!ee;ILclient!ul;)V")
	public Class167(@OriginalArg(0) Class61 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class246 arg2) {
		this.aClass246_141 = arg2;
		this.aClass246_141.method5492(31);
	}

	@OriginalMember(owner = "client!mv", name = "a", descriptor = "(B)V")
	public void method3832() {
		@Pc(8) Class134 local8 = this.aClass134_40;
		synchronized (this.aClass134_40) {
			this.aClass134_40.method3272();
		}
	}

	@OriginalMember(owner = "client!mv", name = "a", descriptor = "(IZ)V")
	public void method3835() {
		@Pc(2) Class134 local2 = this.aClass134_40;
		synchronized (this.aClass134_40) {
			this.aClass134_40.method3270(5);
		}
	}

	@OriginalMember(owner = "client!mv", name = "b", descriptor = "(II)Lclient!rs;")
	public Class216 method3836(@OriginalArg(1) int arg0) {
		@Pc(6) Class134 local6 = this.aClass134_40;
		@Pc(18) Class216 local18;
		synchronized (this.aClass134_40) {
			local18 = (Class216) this.aClass134_40.method3266((long) arg0);
		}
		if (local18 != null) {
			return local18;
		}
		@Pc(31) Class246 local31 = this.aClass246_141;
		@Pc(40) byte[] local40;
		synchronized (this.aClass246_141) {
			local40 = this.aClass246_141.method5477(31, arg0);
		}
		local18 = new Class216();
		if (local40 != null) {
			local18.method4892(new Class1_Sub5(local40));
		}
		@Pc(62) Class134 local62 = this.aClass134_40;
		synchronized (this.aClass134_40) {
			this.aClass134_40.method3263((long) arg0, local18);
			return local18;
		}
	}

	@OriginalMember(owner = "client!mv", name = "c", descriptor = "(B)V")
	public void method3839() {
		@Pc(2) Class134 local2 = this.aClass134_40;
		synchronized (this.aClass134_40) {
			this.aClass134_40.method3267();
		}
	}
}
