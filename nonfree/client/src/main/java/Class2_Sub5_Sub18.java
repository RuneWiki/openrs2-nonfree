import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ve")
public final class Class2_Sub5_Sub18 extends Class2_Sub5 {

	@OriginalMember(owner = "client!ve", name = "w", descriptor = "I")
	public int anInt6997;

	@OriginalMember(owner = "client!ve", name = "x", descriptor = "I")
	public int anInt6998;

	@OriginalMember(owner = "client!ve", name = "B", descriptor = "I")
	public int anInt7000;

	@OriginalMember(owner = "client!ve", name = "E", descriptor = "I")
	public int anInt7002;

	@OriginalMember(owner = "client!ve", name = "G", descriptor = "I")
	public int anInt7004;

	@OriginalMember(owner = "client!ve", name = "C", descriptor = "Lclient!pd;")
	public final Class189 aClass189_2;

	@OriginalMember(owner = "client!ve", name = "A", descriptor = "Lclient!wl;")
	public final Class267 aClass267_1;

	static {
		new Class209("Unable to send message - system busy.", "Deine Nachricht konnte nicht verschickt werden, das System ist derzeit ausgelastet.", "Impossible d'envoyer un message - système occupé.", "Não foi possível enviar a mensagem. O sistema está ocupado.");
	}

	@OriginalMember(owner = "client!ve", name = "<init>", descriptor = "(Lclient!pd;Lclient!bq;)V")
	public Class2_Sub5_Sub18(@OriginalArg(0) Class189 arg0, @OriginalArg(1) Class8_Sub3 arg1) {
		this.aClass189_2 = arg0;
		this.aClass267_1 = this.aClass189_2.method4279();
		this.method5539();
	}

	@OriginalMember(owner = "client!ve", name = "a", descriptor = "(B)V")
	public void method5539() {
		this.anInt7000 = this.aClass189_2.anInt5342;
		this.anInt6998 = this.aClass189_2.anInt5346;
		this.anInt7004 = this.aClass189_2.anInt5348;
		if (this.aClass189_2.aClass35_6 != null) {
			this.aClass189_2.aClass35_6.p(this.aClass267_1.anInt7252, this.aClass267_1.anInt7251, this.aClass267_1.anInt7245, Static43.anIntArray188);
		}
		this.anInt6997 = Static43.anIntArray188[2];
		this.anInt7002 = Static43.anIntArray188[0];
	}
}
