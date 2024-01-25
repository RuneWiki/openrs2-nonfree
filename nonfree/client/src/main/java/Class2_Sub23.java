import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!jo")
public final class Class2_Sub23 extends Class2 {

	@OriginalMember(owner = "client!jo", name = "n", descriptor = "Lclient!il;")
	public Class2_Sub18_Sub1 aClass2_Sub18_Sub1_2;

	@OriginalMember(owner = "client!jo", name = "p", descriptor = "Z")
	public boolean aBoolean312;

	@OriginalMember(owner = "client!jo", name = "r", descriptor = "I")
	public int anInt3778;

	@OriginalMember(owner = "client!jo", name = "s", descriptor = "I")
	public int anInt3779;

	@OriginalMember(owner = "client!jo", name = "t", descriptor = "I")
	public int anInt3780;

	@OriginalMember(owner = "client!jo", name = "u", descriptor = "I")
	public int anInt3781;

	@OriginalMember(owner = "client!jo", name = "v", descriptor = "I")
	public int anInt3782;

	@OriginalMember(owner = "client!jo", name = "w", descriptor = "Lclient!sq;")
	public Class4_Sub2_Sub2_Sub2 aClass4_Sub2_Sub2_Sub2_1;

	@OriginalMember(owner = "client!jo", name = "y", descriptor = "Lclient!us;")
	public Class250 aClass250_1;

	@OriginalMember(owner = "client!jo", name = "z", descriptor = "[I")
	public int[] anIntArray252;

	@OriginalMember(owner = "client!jo", name = "A", descriptor = "I")
	public int anInt3784;

	@OriginalMember(owner = "client!jo", name = "B", descriptor = "Lclient!il;")
	public Class2_Sub18_Sub1 aClass2_Sub18_Sub1_3;

	@OriginalMember(owner = "client!jo", name = "C", descriptor = "I")
	public int anInt3785;

	@OriginalMember(owner = "client!jo", name = "E", descriptor = "I")
	public int anInt3786;

	@OriginalMember(owner = "client!jo", name = "G", descriptor = "Lclient!ql;")
	public Class4_Sub2_Sub2_Sub1 aClass4_Sub2_Sub2_Sub1_1;

	@OriginalMember(owner = "client!jo", name = "I", descriptor = "I")
	public int anInt3788;

	@OriginalMember(owner = "client!jo", name = "J", descriptor = "I")
	public int anInt3789;

	@OriginalMember(owner = "client!jo", name = "K", descriptor = "I")
	public int anInt3790;

	@OriginalMember(owner = "client!jo", name = "o", descriptor = "I")
	public int anInt3776 = 0;

	static {
		new Class256("Error sending message to clan chat - please try again later!", "Fehler beim Versenden der Nachricht - bitte versuch es später erneut.", "Erreur lors de l'envoi du message au canal de clan - veuillez réessayer ultérieurement.", "Erro ao enviar mensagem ao canal de clã. Tente de novo depois!");
	}

	@OriginalMember(owner = "client!jo", name = "e", descriptor = "(I)V")
	public void method3020() {
		@Pc(12) int local12 = this.anInt3790;
		if (this.aClass250_1 != null) {
			@Pc(21) Class250 local21 = this.aClass250_1.method5591(Static215.aClass225_1);
			if (local21 == null) {
				this.anInt3788 = 0;
				this.anInt3781 = 0;
				this.anInt3789 = 0;
				this.anIntArray252 = null;
				this.anInt3790 = -1;
				this.anInt3786 = 0;
			} else {
				this.anInt3790 = local21.anInt7171;
				this.anIntArray252 = local21.anIntArray477;
				this.anInt3789 = local21.anInt7147;
				this.anInt3781 = local21.anInt7172;
				this.anInt3786 = local21.anInt7141 << 7;
				this.anInt3788 = local21.anInt7157;
			}
		} else if (this.aClass4_Sub2_Sub2_Sub2_1 != null) {
			@Pc(102) int local102 = Static184.method2922(this.aClass4_Sub2_Sub2_Sub2_1);
			if (local102 != local12) {
				this.anInt3790 = local102;
				@Pc(112) Class215 local112 = this.aClass4_Sub2_Sub2_Sub2_1.aClass215_1;
				if (local112.anIntArray400 != null) {
					local112 = local112.method4795(Static215.aClass225_1);
				}
				if (local112 == null) {
					this.anInt3789 = this.anInt3786 = 0;
				} else {
					this.anInt3786 = local112.anInt6006 << 7;
					this.anInt3789 = local112.anInt6010;
				}
			}
		} else if (this.aClass4_Sub2_Sub2_Sub1_1 != null) {
			this.anInt3790 = Static218.method769(this.aClass4_Sub2_Sub2_Sub1_1);
			this.anInt3786 = this.aClass4_Sub2_Sub2_Sub1_1.anInt5726 << 7;
			this.anInt3789 = this.aClass4_Sub2_Sub2_Sub1_1.anInt5723;
		}
		if (this.anInt3790 != local12 && this.aClass2_Sub18_Sub1_3 != null) {
			Static360.aClass2_Sub18_Sub4_2.method4456(this.aClass2_Sub18_Sub1_3);
			this.aClass2_Sub18_Sub1_3 = null;
		}
	}
}
