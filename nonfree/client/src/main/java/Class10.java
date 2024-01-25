import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!aj")
public final class Class10 {

	@OriginalMember(owner = "client!aj", name = "f", descriptor = "Lclient!er;")
	private final Class69 aClass69_4 = new Class69(64);

	@OriginalMember(owner = "client!aj", name = "o", descriptor = "Lclient!er;")
	private final Class69 aClass69_5 = new Class69(100);

	@OriginalMember(owner = "client!aj", name = "c", descriptor = "Lclient!ns;")
	private final Class166 aClass166_16;

	static {
		new Class242("Unable to add friend - unknown player.", "Spieler konnte nicht hinzugefügt werden - Spieler unbekannt.", "Impossible d'ajouter l'ami - joueur inconnu.", "Não foi possível adicionar um amigo - jogador desconhecido.");
	}

	@OriginalMember(owner = "client!aj", name = "<init>", descriptor = "(Lclient!go;ILclient!ns;Lclient!ns;Lclient!ns;)V")
	public Class10(@OriginalArg(0) Class95 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class166 arg2, @OriginalArg(3) Class166 arg3, @OriginalArg(4) Class166 arg4) {
		this.aClass166_16 = arg2;
		if (this.aClass166_16 != null) {
			@Pc(26) int local26 = this.aClass166_16.method3695() - 1;
			this.aClass166_16.method3691(local26);
		}
		Static325.method4445(arg4, arg3);
	}

	@OriginalMember(owner = "client!aj", name = "a", descriptor = "(Z)V")
	public void method283() {
		@Pc(2) Class69 local2 = this.aClass69_4;
		synchronized (this.aClass69_4) {
			this.aClass69_4.method1593();
		}
		local2 = this.aClass69_5;
		synchronized (this.aClass69_5) {
			this.aClass69_5.method1593();
		}
	}

	@OriginalMember(owner = "client!aj", name = "a", descriptor = "(BI)V")
	public void method284() {
		@Pc(2) Class69 local2 = this.aClass69_4;
		synchronized (this.aClass69_4) {
			this.aClass69_4.method1594(5);
		}
		local2 = this.aClass69_5;
		synchronized (this.aClass69_5) {
			this.aClass69_5.method1594(5);
		}
	}

	@OriginalMember(owner = "client!aj", name = "b", descriptor = "(B)V")
	public void method285() {
		@Pc(6) Class69 local6 = this.aClass69_4;
		synchronized (this.aClass69_4) {
			this.aClass69_4.method1600();
		}
		local6 = this.aClass69_5;
		synchronized (this.aClass69_5) {
			this.aClass69_5.method1600();
		}
	}

	@OriginalMember(owner = "client!aj", name = "a", descriptor = "(II)Lclient!tq;")
	public Class233 method286(@OriginalArg(1) int arg0) {
		@Pc(6) Class69 local6 = this.aClass69_4;
		@Pc(16) Class233 local16;
		synchronized (this.aClass69_4) {
			local16 = (Class233) this.aClass69_4.method1591((long) arg0);
		}
		if (local16 != null) {
			return local16;
		}
		@Pc(37) byte[] local37 = this.aClass166_16.method3696(Static93.method1518(arg0), Static449.method5757(arg0));
		local16 = new Class233();
		local16.anInt6755 = arg0;
		local16.aClass10_2 = this;
		if (local37 != null) {
			local16.method5248(new Class4_Sub30(local37));
		}
		local16.method5247();
		@Pc(67) Class69 local67 = this.aClass69_4;
		synchronized (this.aClass69_4) {
			this.aClass69_4.method1590((long) arg0, local16);
			return local16;
		}
	}

	@OriginalMember(owner = "client!aj", name = "b", descriptor = "(II)Lclient!nl;")
	public Class4_Sub1_Sub12 method288(@OriginalArg(0) int arg0) {
		@Pc(6) Class69 local6 = this.aClass69_5;
		@Pc(16) Class4_Sub1_Sub12 local16;
		synchronized (this.aClass69_5) {
			local16 = (Class4_Sub1_Sub12) this.aClass69_5.method1591((long) arg0);
			if (local16 == null) {
				local16 = new Class4_Sub1_Sub12(arg0);
				this.aClass69_5.method1590((long) arg0, local16);
			}
		}
		synchronized (local16) {
			return local16.method3629() ? local16 : null;
		}
	}
}
