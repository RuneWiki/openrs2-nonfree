import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!qq")
public final class Class198 {

	@OriginalMember(owner = "client!qq", name = "f", descriptor = "Lclient!er;")
	private Class69 aClass69_53 = new Class69(128);

	@OriginalMember(owner = "client!qq", name = "k", descriptor = "Lclient!er;")
	public Class69 aClass69_54 = new Class69(64);

	@OriginalMember(owner = "client!qq", name = "a", descriptor = "Lclient!ns;")
	private final Class166 aClass166_229;

	@OriginalMember(owner = "client!qq", name = "d", descriptor = "Lclient!ns;")
	public final Class166 aClass166_230;

	static {
		new Class242("Your ignore list is full. Max of 100 users.", "Deine Ignorieren-Liste ist voll, du kannst nur 100 Spieler darauf eintragen.", "Votre liste noire est pleine (100 noms maximum).", "Sua lista de ignorados está cheia. O limite é 100 usuários.");
	}

	@OriginalMember(owner = "client!qq", name = "<init>", descriptor = "(Lclient!go;ILclient!ns;Lclient!ns;)V")
	public Class198(@OriginalArg(0) Class95 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class166 arg2, @OriginalArg(3) Class166 arg3) {
		this.aClass166_229 = arg2;
		this.aClass166_230 = arg3;
		this.aClass166_229.method3691(36);
	}

	@OriginalMember(owner = "client!qq", name = "a", descriptor = "(BI)V")
	public void method4489() {
		@Pc(6) Class69 local6 = this.aClass69_53;
		synchronized (this.aClass69_53) {
			this.aClass69_53.method1594(5);
		}
		local6 = this.aClass69_54;
		synchronized (this.aClass69_54) {
			this.aClass69_54.method1594(5);
		}
	}

	@OriginalMember(owner = "client!qq", name = "a", descriptor = "(Z)V")
	public void method4490() {
		@Pc(6) Class69 local6 = this.aClass69_53;
		synchronized (this.aClass69_53) {
			this.aClass69_53.method1593();
		}
		local6 = this.aClass69_54;
		synchronized (this.aClass69_54) {
			this.aClass69_54.method1593();
		}
	}

	@OriginalMember(owner = "client!qq", name = "a", descriptor = "(II)Lclient!bo;")
	public Class25 method4491(@OriginalArg(1) int arg0) {
		@Pc(6) Class69 local6 = this.aClass69_53;
		@Pc(16) Class25 local16;
		synchronized (this.aClass69_53) {
			local16 = (Class25) this.aClass69_53.method1591((long) arg0);
		}
		if (local16 != null) {
			return local16;
		}
		@Pc(33) byte[] local33 = this.aClass166_229.method3696(arg0, 36);
		local16 = new Class25();
		local16.aClass198_1 = this;
		local16.anInt859 = arg0;
		if (local33 != null) {
			local16.method672(new Class4_Sub30(local33));
		}
		local16.method662();
		@Pc(63) Class69 local63 = this.aClass69_53;
		synchronized (this.aClass69_53) {
			this.aClass69_53.method1590((long) arg0, local16);
			return local16;
		}
	}

	@OriginalMember(owner = "client!qq", name = "a", descriptor = "(I)V")
	public void method4492() {
		@Pc(10) Class69 local10 = this.aClass69_53;
		synchronized (this.aClass69_53) {
			this.aClass69_53.method1600();
		}
		local10 = this.aClass69_54;
		synchronized (this.aClass69_54) {
			this.aClass69_54.method1600();
		}
	}

	@OriginalMember(owner = "client!qq", name = "a", descriptor = "(BII)V")
	public void method4493(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		this.aClass69_53 = new Class69(arg0);
		this.aClass69_54 = new Class69(arg1);
	}
}
