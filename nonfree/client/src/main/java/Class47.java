import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!db")
public final class Class47 {

	@OriginalMember(owner = "client!db", name = "g", descriptor = "Lclient!ff;")
	private final Class83 aClass83_10 = new Class83(64);

	@OriginalMember(owner = "client!db", name = "n", descriptor = "I")
	public int anInt1363 = 0;

	@OriginalMember(owner = "client!db", name = "e", descriptor = "Lclient!vh;")
	private final Class250 aClass250_14;

	@OriginalMember(owner = "client!db", name = "m", descriptor = "I")
	public final int anInt1362;

	static {
		new Class84("Unable to add friend - unknown player.", "Spieler konnte nicht hinzugefügt werden - Spieler unbekannt.", "Impossible d'ajouter l'ami - joueur inconnu.", "Não foi possível adicionar um amigo - jogador desconhecido.");
	}

	@OriginalMember(owner = "client!db", name = "<init>", descriptor = "(Lclient!lf;ILclient!vh;)V")
	public Class47(@OriginalArg(0) Class145 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class250 arg2) {
		this.aClass250_14 = arg2;
		this.anInt1362 = this.aClass250_14.method5653(4);
	}

	@OriginalMember(owner = "client!db", name = "b", descriptor = "(B)V")
	public void method1139() {
		@Pc(2) Class83 local2 = this.aClass83_10;
		synchronized (this.aClass83_10) {
			this.aClass83_10.method1669();
		}
	}

	@OriginalMember(owner = "client!db", name = "b", descriptor = "(I)V")
	public void method1140() {
		@Pc(7) Class83 local7 = this.aClass83_10;
		synchronized (this.aClass83_10) {
			this.aClass83_10.method1667();
		}
	}

	@OriginalMember(owner = "client!db", name = "b", descriptor = "(IB)Lclient!mv;")
	public Class162 method1142(@OriginalArg(0) int arg0) {
		@Pc(6) Class83 local6 = this.aClass83_10;
		@Pc(16) Class162 local16;
		synchronized (this.aClass83_10) {
			local16 = (Class162) this.aClass83_10.method1658((long) arg0);
		}
		if (local16 != null) {
			return local16;
		}
		@Pc(33) byte[] local33 = this.aClass250_14.method5667(arg0, 4);
		local16 = new Class162();
		local16.anInt4632 = arg0;
		local16.aClass47_7 = this;
		if (local33 != null) {
			local16.method3784(new Class1_Sub1(local33));
		}
		local16.method3785();
		@Pc(58) Class83 local58 = this.aClass83_10;
		synchronized (this.aClass83_10) {
			this.aClass83_10.method1675((long) arg0, local16);
			return local16;
		}
	}

	@OriginalMember(owner = "client!db", name = "a", descriptor = "(BI)V")
	public void method1143() {
		@Pc(11) Class83 local11 = this.aClass83_10;
		synchronized (this.aClass83_10) {
			this.aClass83_10.method1663(5);
		}
	}
}
