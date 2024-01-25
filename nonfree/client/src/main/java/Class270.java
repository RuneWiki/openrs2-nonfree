import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ti")
public final class Class270 {

	@OriginalMember(owner = "client!ti", name = "c", descriptor = "Lclient!qc;")
	private final Class231 aClass231_65 = new Class231(64);

	@OriginalMember(owner = "client!ti", name = "b", descriptor = "Lclient!dda;")
	private final Class53 aClass53_130;

	static {
		new Class202("You are temporarily blocked from joining channels - please try again later!", "Du darfst derzeit keine Chaträume betreten - bitte versuch es später.", "Vous êtes temporairement exclu des canaux - veuillez réessayer ultérieurement.", "Você está temporariamente impedido de entrar em canais. Tente de novo depois!");
		new Class202("Unable to add name - system busy.", "Der Name konnte nicht hinzugefügt werden, das System ist derzeit ausgelastet.", "Impossible d'ajouter un nom - système occupé.", "Não foi possível adicionar o nome. O sistema está ocupado.");
	}

	@OriginalMember(owner = "client!ti", name = "<init>", descriptor = "(Lclient!oda;ILclient!dda;)V")
	public Class270(@OriginalArg(0) Class212 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class53 arg2) {
		this.aClass53_130 = arg2;
		this.aClass53_130.method1592(5);
	}

	@OriginalMember(owner = "client!ti", name = "a", descriptor = "(BI)Lclient!qm;")
	public Class2_Sub13_Sub14 method6979(@OriginalArg(1) int arg0) {
		@Pc(6) Class231 local6 = this.aClass231_65;
		@Pc(16) Class2_Sub13_Sub14 local16;
		synchronized (this.aClass231_65) {
			local16 = (Class2_Sub13_Sub14) this.aClass231_65.method6228((long) arg0);
		}
		if (local16 != null) {
			return local16;
		}
		@Pc(37) Class53 local37 = this.aClass53_130;
		@Pc(46) byte[] local46;
		synchronized (this.aClass53_130) {
			local46 = this.aClass53_130.method1616(arg0, 5);
		}
		local16 = new Class2_Sub13_Sub14();
		if (local46 != null) {
			local16.method6357(new Class2_Sub29(local46));
		}
		@Pc(68) Class231 local68 = this.aClass231_65;
		synchronized (this.aClass231_65) {
			this.aClass231_65.method6232(local16, (long) arg0);
			return local16;
		}
	}
}
