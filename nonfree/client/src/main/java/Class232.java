import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!st")
public final class Class232 {

	@OriginalMember(owner = "client!st", name = "j", descriptor = "Lclient!tg;")
	private Class28_Sub1 aClass28_Sub1_8;

	@OriginalMember(owner = "client!st", name = "i", descriptor = "Lclient!tg;")
	public final Class28_Sub1 aClass28_Sub1_7 = new Class28_Sub1();

	static {
		new Class55("Join your channel by clicking 'Join Chat' and typing: ", "Klick auf 'Betreten' und gib ein: ", "Pour rejoindre votre canal, cliquez sur « Participer » et entrez : ", "Para entrar no seu canal, clique em \"Acessar bate-papo\" e digite: ");
	}

	@OriginalMember(owner = "client!st", name = "<init>", descriptor = "()V")
	public Class232() {
		this.aClass28_Sub1_7.aClass28_Sub1_9 = this.aClass28_Sub1_7;
		this.aClass28_Sub1_7.aClass28_Sub1_10 = this.aClass28_Sub1_7;
	}

	@OriginalMember(owner = "client!st", name = "b", descriptor = "(I)I")
	public int method4836() {
		@Pc(12) int local12 = 0;
		for (@Pc(16) Class28_Sub1 local16 = this.aClass28_Sub1_7.aClass28_Sub1_10; local16 != this.aClass28_Sub1_7; local16 = local16.aClass28_Sub1_10) {
			local12++;
		}
		return local12;
	}

	@OriginalMember(owner = "client!st", name = "a", descriptor = "(ILclient!tg;)V")
	public void method4837(@OriginalArg(1) Class28_Sub1 arg0) {
		if (arg0.aClass28_Sub1_9 != null) {
			arg0.method5645();
		}
		arg0.aClass28_Sub1_9 = this.aClass28_Sub1_7.aClass28_Sub1_9;
		arg0.aClass28_Sub1_10 = this.aClass28_Sub1_7;
		arg0.aClass28_Sub1_9.aClass28_Sub1_10 = arg0;
		arg0.aClass28_Sub1_10.aClass28_Sub1_9 = arg0;
	}

	@OriginalMember(owner = "client!st", name = "b", descriptor = "(B)Lclient!tg;")
	public Class28_Sub1 method4838() {
		@Pc(13) Class28_Sub1 local13 = this.aClass28_Sub1_7.aClass28_Sub1_10;
		if (this.aClass28_Sub1_7 == local13) {
			this.aClass28_Sub1_8 = null;
			return null;
		} else {
			this.aClass28_Sub1_8 = local13.aClass28_Sub1_10;
			return local13;
		}
	}

	@OriginalMember(owner = "client!st", name = "c", descriptor = "(I)V")
	public void method4840() {
		while (true) {
			@Pc(14) Class28_Sub1 local14 = this.aClass28_Sub1_7.aClass28_Sub1_10;
			if (local14 == this.aClass28_Sub1_7) {
				this.aClass28_Sub1_8 = null;
				return;
			}
			local14.method5645();
		}
	}

	@OriginalMember(owner = "client!st", name = "d", descriptor = "(I)Lclient!tg;")
	public Class28_Sub1 method4841() {
		@Pc(6) Class28_Sub1 local6 = this.aClass28_Sub1_8;
		if (this.aClass28_Sub1_7 == local6) {
			this.aClass28_Sub1_8 = null;
			return null;
		} else {
			this.aClass28_Sub1_8 = local6.aClass28_Sub1_10;
			return local6;
		}
	}
}
