import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!du")
public final class Class56 {

	@OriginalMember(owner = "client!du", name = "n", descriptor = "Lclient!nb;")
	private Class22 aClass22_10;

	@OriginalMember(owner = "client!du", name = "j", descriptor = "Lclient!nb;")
	private final Class22 aClass22_9 = new Class22();

	static {
		new Class221("Join your channel by clicking 'Join Chat' and typing: ", "Klick auf 'Betreten' und gib ein: ", "Pour rejoindre votre canal, cliquez sur « Participer » et entrez : ", "Para entrar no seu canal, clique em \"Acessar bate-papo\" e digite: ");
	}

	@OriginalMember(owner = "client!du", name = "<init>", descriptor = "()V")
	public Class56() {
		this.aClass22_9.aClass22_24 = this.aClass22_9;
		this.aClass22_9.aClass22_23 = this.aClass22_9;
	}

	@OriginalMember(owner = "client!du", name = "a", descriptor = "(I)Lclient!nb;")
	public Class22 method1251() {
		@Pc(7) Class22 local7 = this.aClass22_9.aClass22_23;
		if (this.aClass22_9 == local7) {
			this.aClass22_10 = null;
			return null;
		} else {
			this.aClass22_10 = local7.aClass22_23;
			return local7;
		}
	}

	@OriginalMember(owner = "client!du", name = "b", descriptor = "(I)I")
	public int method1252() {
		@Pc(13) int local13 = 0;
		for (@Pc(17) Class22 local17 = this.aClass22_9.aClass22_24; local17 != this.aClass22_9; local17 = local17.aClass22_24) {
			local13++;
		}
		return local13;
	}

	@OriginalMember(owner = "client!du", name = "a", descriptor = "(ZLclient!nb;)V")
	public void method1253(@OriginalArg(1) Class22 arg0) {
		if (arg0.aClass22_23 != null) {
			arg0.method5237();
		}
		arg0.aClass22_23 = this.aClass22_9.aClass22_23;
		arg0.aClass22_24 = this.aClass22_9;
		arg0.aClass22_23.aClass22_24 = arg0;
		arg0.aClass22_24.aClass22_23 = arg0;
	}

	@OriginalMember(owner = "client!du", name = "c", descriptor = "(I)Lclient!nb;")
	public Class22 method1254() {
		@Pc(6) Class22 local6 = this.aClass22_10;
		if (local6 == this.aClass22_9) {
			this.aClass22_10 = null;
			return null;
		} else {
			this.aClass22_10 = local6.aClass22_24;
			return local6;
		}
	}

	@OriginalMember(owner = "client!du", name = "a", descriptor = "(B)V")
	public void method1255() {
		while (true) {
			@Pc(16) Class22 local16 = this.aClass22_9.aClass22_24;
			if (local16 == this.aClass22_9) {
				this.aClass22_10 = null;
				return;
			}
			local16.method5237();
		}
	}

	@OriginalMember(owner = "client!du", name = "d", descriptor = "(I)Lclient!nb;")
	public Class22 method1256() {
		@Pc(7) Class22 local7 = this.aClass22_9.aClass22_24;
		if (this.aClass22_9 == local7) {
			return null;
		} else {
			local7.method5237();
			return local7;
		}
	}

	@OriginalMember(owner = "client!du", name = "a", descriptor = "(Z)Z")
	public boolean method1258() {
		return this.aClass22_9 == this.aClass22_9.aClass22_24;
	}

	@OriginalMember(owner = "client!du", name = "f", descriptor = "(I)Lclient!nb;")
	public Class22 method1259() {
		@Pc(13) Class22 local13 = this.aClass22_9.aClass22_24;
		if (local13 == this.aClass22_9) {
			this.aClass22_10 = null;
			return null;
		} else {
			this.aClass22_10 = local13.aClass22_24;
			return local13;
		}
	}
}
