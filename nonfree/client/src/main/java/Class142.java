import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ld")
public final class Class142 {

	@OriginalMember(owner = "client!ld", name = "g", descriptor = "Lclient!ku;")
	private final Class139 aClass139_41 = new Class139(64);

	@OriginalMember(owner = "client!ld", name = "c", descriptor = "Lclient!b;")
	private final Class20 aClass20_49;

	static {
		new Class57("You appear to be telling someone your password - please don't!", "Willst du jemandem dein Passwort verraten? Das darfst du nicht! Falls das", "Il semble que vous révéliez votre mot de passe à quelqu'un - ne faites jamais ça !", "Parece que você está revelando sua senha a alguém. Não faça isso!");
	}

	@OriginalMember(owner = "client!ld", name = "<init>", descriptor = "(Lclient!ea;ILclient!b;)V")
	public Class142(@OriginalArg(0) Class63 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class20 arg2) {
		this.aClass20_49 = arg2;
		this.aClass20_49.method231(5);
	}

	@OriginalMember(owner = "client!ld", name = "a", descriptor = "(BI)Lclient!nf;")
	public Class3_Sub7_Sub10 method3104(@OriginalArg(1) int arg0) {
		@Pc(14) Class139 local14 = this.aClass139_41;
		@Pc(24) Class3_Sub7_Sub10 local24;
		synchronized (this.aClass139_41) {
			local24 = (Class3_Sub7_Sub10) this.aClass139_41.method3076((long) arg0);
		}
		if (local24 != null) {
			return local24;
		}
		@Pc(41) byte[] local41 = this.aClass20_49.method253(arg0, 5);
		local24 = new Class3_Sub7_Sub10();
		if (local41 != null) {
			local24.method3857(new Class3_Sub5(local41));
		}
		@Pc(57) Class139 local57 = this.aClass139_41;
		synchronized (this.aClass139_41) {
			this.aClass139_41.method3070(local24, (long) arg0);
			return local24;
		}
	}
}
