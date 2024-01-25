import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!gu")
public final class Class107 {

	@OriginalMember(owner = "client!gu", name = "d", descriptor = "Lclient!bk;")
	private Class6 aClass6_16;

	@OriginalMember(owner = "client!gu", name = "c", descriptor = "Lclient!bk;")
	private final Class6 aClass6_15 = new Class6();

	static {
		new Class202("To interact with this please login to a members' server.", "Logg dich auf einer Mitglieder-Welt ein, um damit zu interagieren.", "Veuillez vous connecter à un serveur d'abonnés pour cette interaction.", "Para interagir, acesse um servidor para membros.");
		new Class202(" left the channel.", " hat den Chatraum verlassen.", " a quitté le canal.", " deixou o canal.");
	}

	@OriginalMember(owner = "client!gu", name = "<init>", descriptor = "()V")
	public Class107() {
		this.aClass6_15.aClass6_26 = this.aClass6_15;
		this.aClass6_15.aClass6_25 = this.aClass6_15;
	}

	@OriginalMember(owner = "client!gu", name = "a", descriptor = "(B)Z")
	public boolean method2828() {
		return this.aClass6_15.aClass6_26 == this.aClass6_15;
	}

	@OriginalMember(owner = "client!gu", name = "a", descriptor = "(ILclient!bk;)V")
	public void method2830(@OriginalArg(1) Class6 arg0) {
		if (arg0.aClass6_25 != null) {
			arg0.method7058();
		}
		arg0.aClass6_26 = this.aClass6_15;
		arg0.aClass6_25 = this.aClass6_15.aClass6_25;
		arg0.aClass6_25.aClass6_26 = arg0;
		arg0.aClass6_26.aClass6_25 = arg0;
	}

	@OriginalMember(owner = "client!gu", name = "a", descriptor = "(I)Lclient!bk;")
	public Class6 method2832() {
		@Pc(7) Class6 local7 = this.aClass6_15.aClass6_26;
		if (local7 == this.aClass6_15) {
			this.aClass6_16 = null;
			return null;
		} else {
			this.aClass6_16 = local7.aClass6_26;
			return local7;
		}
	}

	@OriginalMember(owner = "client!gu", name = "a", descriptor = "(Z)I")
	public int method2833() {
		@Pc(12) int local12 = 0;
		@Pc(16) Class6 local16 = this.aClass6_15.aClass6_26;
		while (local16 != this.aClass6_15) {
			local16 = local16.aClass6_26;
			local12++;
		}
		return local12;
	}

	@OriginalMember(owner = "client!gu", name = "b", descriptor = "(I)Lclient!bk;")
	public Class6 method2834() {
		@Pc(13) Class6 local13 = this.aClass6_15.aClass6_26;
		if (this.aClass6_15 == local13) {
			return null;
		} else {
			local13.method7058();
			return local13;
		}
	}

	@OriginalMember(owner = "client!gu", name = "c", descriptor = "(I)Lclient!bk;")
	public Class6 method2835() {
		@Pc(6) Class6 local6 = this.aClass6_16;
		if (this.aClass6_15 == local6) {
			this.aClass6_16 = null;
			return null;
		} else {
			this.aClass6_16 = local6.aClass6_26;
			return local6;
		}
	}

	@OriginalMember(owner = "client!gu", name = "d", descriptor = "(I)Lclient!bk;")
	public Class6 method2837() {
		@Pc(12) Class6 local12 = this.aClass6_15.aClass6_25;
		if (this.aClass6_15 == local12) {
			this.aClass6_16 = null;
			return null;
		} else {
			this.aClass6_16 = local12.aClass6_25;
			return local12;
		}
	}

	@OriginalMember(owner = "client!gu", name = "c", descriptor = "(B)V")
	public void method2838() {
		while (true) {
			@Pc(9) Class6 local9 = this.aClass6_15.aClass6_26;
			if (local9 == this.aClass6_15) {
				this.aClass6_16 = null;
				return;
			}
			local9.method7058();
		}
	}
}
