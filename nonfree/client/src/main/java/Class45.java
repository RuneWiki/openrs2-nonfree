import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!dc")
public final class Class45 {

	@OriginalMember(owner = "client!dc", name = "g", descriptor = "Lclient!ge;")
	private final Class83 aClass83_10 = new Class83(64);

	@OriginalMember(owner = "client!dc", name = "a", descriptor = "Lclient!ci;")
	private final Class38 aClass38_14;

	@OriginalMember(owner = "client!dc", name = "f", descriptor = "I")
	public final int anInt1568;

	static {
		new Class21("Error joining clan channel - please try again later!", "Fehler beim Betreten des Chatraums - bitte versuch es später erneut.", "Erreur lors de la connexion au canal de clan - veuillez réessayer ultérieurement.", "Erro ao entrar no canal do clã. Tente de novo depois!");
	}

	@OriginalMember(owner = "client!dc", name = "<init>", descriptor = "(Lclient!sn;ILclient!ci;)V")
	public Class45(@OriginalArg(0) Class235 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class38 arg2) {
		this.aClass38_14 = arg2;
		this.anInt1568 = this.aClass38_14.method1032(19);
	}

	@OriginalMember(owner = "client!dc", name = "a", descriptor = "(IZ)Lclient!rl;")
	public Class221 method1431(@OriginalArg(0) int arg0) {
		@Pc(12) Class83 local12 = this.aClass83_10;
		@Pc(22) Class221 local22;
		synchronized (this.aClass83_10) {
			local22 = (Class221) this.aClass83_10.method2338((long) arg0);
		}
		if (local22 != null) {
			return local22;
		}
		@Pc(35) Class38 local35 = this.aClass38_14;
		@Pc(44) byte[] local44;
		synchronized (this.aClass38_14) {
			local44 = this.aClass38_14.method1039(arg0, 19);
		}
		local22 = new Class221();
		if (local44 != null) {
			local22.method5121(new Class4_Sub20(local44));
		}
		@Pc(66) Class83 local66 = this.aClass83_10;
		synchronized (this.aClass83_10) {
			this.aClass83_10.method2337(local22, (long) arg0);
			return local22;
		}
	}
}
