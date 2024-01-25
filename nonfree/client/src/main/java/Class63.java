import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ej")
public final class Class63 {

	@OriginalMember(owner = "client!ej", name = "c", descriptor = "Lclient!er;")
	private final Class69 aClass69_21 = new Class69(256);

	@OriginalMember(owner = "client!ej", name = "f", descriptor = "Lclient!m;")
	private final Interface10 anInterface10_4;

	@OriginalMember(owner = "client!ej", name = "h", descriptor = "Lclient!bv;")
	private final Class30_Sub1 aClass30_Sub1_14;

	static {
		new Class242("Error joining clan channel - please try again later!", "Fehler beim Betreten des Chatraums - bitte versuch es später erneut.", "Erreur lors de la connexion au canal de clan - veuillez réessayer ultérieurement.", "Erro ao entrar no canal do clã. Tente de novo depois!");
	}

	@OriginalMember(owner = "client!ej", name = "<init>", descriptor = "(Lclient!bv;Lclient!m;)V")
	public Class63(@OriginalArg(0) Class30_Sub1 arg0, @OriginalArg(1) Interface10 arg1) {
		this.anInterface10_4 = arg1;
		this.aClass30_Sub1_14 = arg0;
	}

	@OriginalMember(owner = "client!ej", name = "a", descriptor = "(I)V")
	public void method1547() {
		this.aClass69_21.method1593();
	}

	@OriginalMember(owner = "client!ej", name = "a", descriptor = "(B)V")
	public void method1549() {
		this.aClass69_21.method1594(5);
	}

	@OriginalMember(owner = "client!ej", name = "c", descriptor = "(II)Lclient!wg;")
	public Class1_Sub3 method1552(@OriginalArg(1) int arg0) {
		@Pc(12) Object local12 = this.aClass69_21.method1591((long) arg0);
		if (local12 != null) {
			return (Class1_Sub3) local12;
		} else if (this.anInterface10_4.method4242(arg0)) {
			@Pc(37) Class118 local37 = this.anInterface10_4.method4241(arg0);
			@Pc(46) int local46 = local37.aBoolean231 ? 64 : this.aClass30_Sub1_14.anInt1240;
			@Pc(81) Class1_Sub3 local81;
			if (local37.aBoolean236 && this.aClass30_Sub1_14.method4666()) {
				@Pc(63) float[] local63 = this.anInterface10_4.method4240(local46, arg0, 0.7F, local46);
				local81 = new Class1_Sub3(this.aClass30_Sub1_14, 3553, 34842, local46, local46, local37.aByte57 != 0, local63, 6408);
			} else {
				@Pc(93) short local93;
				@Pc(103) int[] local103;
				if (local37.aBoolean237 && Static193.method5638(local37.aByte56)) {
					local103 = this.anInterface10_4.method4238(0.7F, arg0, local46, false, local46);
					local93 = 6407;
				} else {
					local93 = 6408;
					local103 = this.anInterface10_4.method4239(arg0, local46, local46, 0.7F);
				}
				local81 = new Class1_Sub3(this.aClass30_Sub1_14, 3553, local93, local46, local46, local37.aByte57 != 0, local103, false);
			}
			local81.method3964(local37.aBoolean238, local37.aBoolean234);
			this.aClass69_21.method1590((long) arg0, local81);
			return local81;
		} else {
			return null;
		}
	}
}
