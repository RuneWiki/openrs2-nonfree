import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!uk")
public final class Class240 {

	@OriginalMember(owner = "client!uk", name = "s", descriptor = "I")
	public int anInt6683;

	@OriginalMember(owner = "client!uk", name = "h", descriptor = "Lclient!fa;")
	private final Class68 aClass68_48 = new Class68(64);

	@OriginalMember(owner = "client!uk", name = "p", descriptor = "Lclient!fa;")
	public final Class68 aClass68_49 = new Class68(50);

	@OriginalMember(owner = "client!uk", name = "r", descriptor = "Lclient!fa;")
	public final Class68 aClass68_50 = new Class68(5);

	@OriginalMember(owner = "client!uk", name = "k", descriptor = "Z")
	public boolean aBoolean604;

	@OriginalMember(owner = "client!uk", name = "j", descriptor = "Lclient!fs;")
	private final Class76 aClass76_93;

	@OriginalMember(owner = "client!uk", name = "n", descriptor = "Lclient!fs;")
	public final Class76 aClass76_94;

	static {
		new Class83("Login to a members' server to use this object.", "Du musst auf einer Mitglieder-Welt sein, um diesen Gegenstand zu benutzen.", "Connectez-vous à un serveur d'abonnés pour utiliser cet objet.", "Acesse um servidor para membros para usar este objeto.");
	}

	@OriginalMember(owner = "client!uk", name = "<init>", descriptor = "(Lclient!jk;IZLclient!fs;Lclient!fs;)V")
	public Class240(@OriginalArg(0) Class121 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2, @OriginalArg(3) Class76 arg3, @OriginalArg(4) Class76 arg4) {
		this.aBoolean604 = arg2;
		this.aClass76_93 = arg3;
		this.aClass76_94 = arg4;
		if (this.aClass76_93 != null) {
			@Pc(38) int local38 = this.aClass76_93.method2100() - 1;
			this.aClass76_93.method2108(local38);
		}
	}

	@OriginalMember(owner = "client!uk", name = "a", descriptor = "(B)V")
	public void method5221() {
		@Pc(2) Class68 local2 = this.aClass68_48;
		synchronized (this.aClass68_48) {
			this.aClass68_48.method1791();
		}
		local2 = this.aClass68_49;
		synchronized (this.aClass68_49) {
			this.aClass68_49.method1791();
		}
		local2 = this.aClass68_50;
		synchronized (this.aClass68_50) {
			this.aClass68_50.method1791();
		}
	}

	@OriginalMember(owner = "client!uk", name = "a", descriptor = "(I)V")
	public void method5223() {
		@Pc(6) Class68 local6 = this.aClass68_49;
		synchronized (this.aClass68_49) {
			this.aClass68_49.method1777();
		}
		local6 = this.aClass68_50;
		synchronized (this.aClass68_50) {
			this.aClass68_50.method1777();
		}
	}

	@OriginalMember(owner = "client!uk", name = "b", descriptor = "(II)V")
	public void method5225(@OriginalArg(0) int arg0) {
		this.anInt6683 = arg0;
		@Pc(9) Class68 local9 = this.aClass68_49;
		synchronized (this.aClass68_49) {
			this.aClass68_49.method1777();
		}
		local9 = this.aClass68_50;
		synchronized (this.aClass68_50) {
			this.aClass68_50.method1777();
		}
	}

	@OriginalMember(owner = "client!uk", name = "a", descriptor = "(Z)V")
	public void method5226() {
		@Pc(6) Class68 local6 = this.aClass68_48;
		synchronized (this.aClass68_48) {
			this.aClass68_48.method1777();
		}
		local6 = this.aClass68_49;
		synchronized (this.aClass68_49) {
			this.aClass68_49.method1777();
		}
		local6 = this.aClass68_50;
		synchronized (this.aClass68_50) {
			this.aClass68_50.method1777();
		}
	}

	@OriginalMember(owner = "client!uk", name = "d", descriptor = "(II)Lclient!wh;")
	public Class264 method5229(@OriginalArg(0) int arg0) {
		@Pc(6) Class68 local6 = this.aClass68_48;
		@Pc(16) Class264 local16;
		synchronized (this.aClass68_48) {
			local16 = (Class264) this.aClass68_48.method1787((long) arg0);
		}
		if (local16 != null) {
			return local16;
		}
		@Pc(37) byte[] local37 = this.aClass76_93.method2104(Static174.method2820(arg0), Static354.method4785(arg0));
		local16 = new Class264();
		local16.anInt7211 = arg0;
		local16.aClass240_2 = this;
		if (local37 != null) {
			local16.method5581(new Class4_Sub12(local37));
		}
		local16.method5576();
		@Pc(62) Class68 local62 = this.aClass68_48;
		synchronized (this.aClass68_48) {
			this.aClass68_48.method1779((long) arg0, local16);
			return local16;
		}
	}

	@OriginalMember(owner = "client!uk", name = "a", descriptor = "(ZI)V")
	public void method5230(@OriginalArg(0) boolean arg0) {
		if (arg0 != this.aBoolean604) {
			this.aBoolean604 = arg0;
			this.method5226();
		}
	}

	@OriginalMember(owner = "client!uk", name = "a", descriptor = "(BI)V")
	public void method5232() {
		@Pc(6) Class68 local6 = this.aClass68_48;
		synchronized (this.aClass68_48) {
			this.aClass68_48.method1788(5);
		}
		local6 = this.aClass68_49;
		synchronized (this.aClass68_49) {
			this.aClass68_49.method1788(5);
		}
		local6 = this.aClass68_50;
		synchronized (this.aClass68_50) {
			this.aClass68_50.method1788(5);
		}
	}
}
