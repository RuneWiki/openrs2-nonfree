import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!wa")
public final class Class307 {

	@OriginalMember(owner = "client!wa", name = "a", descriptor = "Lclient!dt;")
	public Class61 aClass61_2;

	@OriginalMember(owner = "client!wa", name = "c", descriptor = "I")
	private int anInt9112;

	@OriginalMember(owner = "client!wa", name = "d", descriptor = "I")
	public int anInt9113;

	@OriginalMember(owner = "client!wa", name = "f", descriptor = "I")
	public int anInt9114;

	static {
		new Class202("Login to a members' server to use this object.", "Du musst auf einer Mitglieder-Welt sein, um diesen Gegenstand zu benutzen.", "Connectez-vous à un serveur d'abonnés pour utiliser cet objet.", "Acesse um servidor para membros para usar este objeto.");
	}

	@OriginalMember(owner = "client!wa", name = "a", descriptor = "(I)Lclient!qr;")
	public synchronized Class241 method7618() {
		@Pc(13) Class241 local13 = (Class241) this.aClass61_2.aClass231_20.method6228((long) this.anInt9112);
		if (local13 != null) {
			return local13;
		}
		local13 = Static558.method6373(this.aClass61_2.aClass53_29, this.anInt9112, 0);
		if (local13 != null) {
			this.aClass61_2.aClass231_20.method6232(local13, (long) this.anInt9112);
		}
		return local13;
	}

	@OriginalMember(owner = "client!wa", name = "a", descriptor = "(Lclient!ps;I)V")
	public void method7619(@OriginalArg(0) Class2_Sub29 arg0) {
		while (true) {
			@Pc(14) int local14 = arg0.method5170();
			if (local14 == 0) {
				return;
			}
			this.method7621(arg0, local14);
		}
	}

	@OriginalMember(owner = "client!wa", name = "a", descriptor = "(BLclient!ps;I)V")
	private void method7621(@OriginalArg(1) Class2_Sub29 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 1) {
			this.anInt9112 = arg0.method5229();
		} else if (arg1 == 2) {
			this.anInt9114 = arg0.method5170();
			this.anInt9113 = arg0.method5170();
		}
	}
}
