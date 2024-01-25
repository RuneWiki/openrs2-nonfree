import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!nba")
public final class Class195 {

	@OriginalMember(owner = "client!nba", name = "l", descriptor = "I")
	public int anInt6007;

	@OriginalMember(owner = "client!nba", name = "i", descriptor = "Lclient!sw;")
	private final Class277 aClass277_44 = new Class277(64);

	@OriginalMember(owner = "client!nba", name = "k", descriptor = "Lclient!sw;")
	public final Class277 aClass277_45 = new Class277(30);

	@OriginalMember(owner = "client!nba", name = "e", descriptor = "Lclient!dn;")
	public final Class69 aClass69_64;

	@OriginalMember(owner = "client!nba", name = "c", descriptor = "Lclient!dn;")
	private final Class69 aClass69_63;

	static {
		new Class45("You can spot a Jagex moderator by the gold crown next to their name.", "Jagex-Mitarbeiter haben eine goldene Krone neben ihrem Namen.", "Vous pouvez reconnaître les modérateurs Jagex à la couronne dorée en regard de leur nom.", "Os moderadores da Jagex são identificados por uma coroa dourada próxima ao \u007fnome.");
	}

	@OriginalMember(owner = "client!nba", name = "<init>", descriptor = "(Lclient!re;ILclient!dn;Lclient!dn;)V")
	public Class195(@OriginalArg(0) Class250 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class69 arg2, @OriginalArg(3) Class69 arg3) {
		this.aClass69_64 = arg3;
		this.aClass69_63 = arg2;
		@Pc(26) int local26 = this.aClass69_63.method1895() - 1;
		this.aClass69_63.method1884(local26);
	}

	@OriginalMember(owner = "client!nba", name = "a", descriptor = "(I)V")
	public void method5435() {
		@Pc(10) Class277 local10 = this.aClass277_44;
		synchronized (this.aClass277_44) {
			this.aClass277_44.method7019();
		}
		local10 = this.aClass277_45;
		synchronized (this.aClass277_45) {
			this.aClass277_45.method7019();
		}
	}

	@OriginalMember(owner = "client!nba", name = "a", descriptor = "(BI)V")
	public void method5436() {
		@Pc(6) Class277 local6 = this.aClass277_44;
		synchronized (this.aClass277_44) {
			this.aClass277_44.method7018(5);
		}
		local6 = this.aClass277_45;
		synchronized (this.aClass277_45) {
			this.aClass277_45.method7018(5);
		}
	}

	@OriginalMember(owner = "client!nba", name = "a", descriptor = "(B)V")
	public void method5437() {
		@Pc(6) Class277 local6 = this.aClass277_44;
		synchronized (this.aClass277_44) {
			this.aClass277_44.method7026();
		}
		local6 = this.aClass277_45;
		synchronized (this.aClass277_45) {
			this.aClass277_45.method7026();
		}
	}

	@OriginalMember(owner = "client!nba", name = "a", descriptor = "(ZI)V")
	public void method5438(@OriginalArg(1) int arg0) {
		this.anInt6007 = arg0;
		@Pc(9) Class277 local9 = this.aClass277_45;
		synchronized (this.aClass277_45) {
			this.aClass277_45.method7019();
		}
	}

	@OriginalMember(owner = "client!nba", name = "a", descriptor = "(II)Lclient!ep;")
	public Class87 method5439(@OriginalArg(1) int arg0) {
		@Pc(6) Class277 local6 = this.aClass277_44;
		@Pc(16) Class87 local16;
		synchronized (this.aClass277_44) {
			local16 = (Class87) this.aClass277_44.method7014((long) arg0);
		}
		if (local16 != null) {
			return local16;
		}
		@Pc(29) Class69 local29 = this.aClass69_63;
		@Pc(44) byte[] local44;
		synchronized (this.aClass69_63) {
			local44 = this.aClass69_63.method1888(Static30.method809(arg0), Static449.method6962(arg0));
		}
		local16 = new Class87();
		local16.anInt2309 = arg0;
		local16.aClass195_1 = this;
		if (local44 != null) {
			local16.method2238(new Class1_Sub17(local44));
		}
		@Pc(78) Class277 local78 = this.aClass277_44;
		synchronized (this.aClass277_44) {
			this.aClass277_44.method7016(local16, (long) arg0);
			return local16;
		}
	}
}
