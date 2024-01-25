import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!si")
public final class Class222 {

	@OriginalMember(owner = "client!si", name = "g", descriptor = "Lclient!kq;")
	private Class23_Sub1 aClass23_Sub1_10;

	@OriginalMember(owner = "client!si", name = "b", descriptor = "Lclient!kq;")
	public final Class23_Sub1 aClass23_Sub1_9 = new Class23_Sub1();

	static {
		new Class174("You are not allowed to talk in this clan channel.", "Du darfst in diesem Chatraum nicht reden.", "Vous n'êtes pas autorisé à parler dans ce canal de clan.", "Você não tem permissão para conversar neste canal de clã.");
		new Class174("Unable to add friend - unknown player.", "Spieler konnte nicht hinzugefügt werden - Spieler unbekannt.", "Impossible d'ajouter l'ami - joueur inconnu.", "Não foi possível adicionar um amigo - jogador desconhecido.");
	}

	@OriginalMember(owner = "client!si", name = "<init>", descriptor = "()V")
	public Class222() {
		this.aClass23_Sub1_9.aClass23_Sub1_8 = this.aClass23_Sub1_9;
		this.aClass23_Sub1_9.aClass23_Sub1_7 = this.aClass23_Sub1_9;
	}

	@OriginalMember(owner = "client!si", name = "a", descriptor = "(I)I")
	public int method5208() {
		@Pc(7) int local7 = 0;
		for (@Pc(16) Class23_Sub1 local16 = this.aClass23_Sub1_9.aClass23_Sub1_7; local16 != this.aClass23_Sub1_9; local16 = local16.aClass23_Sub1_7) {
			local7++;
		}
		return local7;
	}

	@OriginalMember(owner = "client!si", name = "a", descriptor = "(B)Lclient!kq;")
	public Class23_Sub1 method5210() {
		@Pc(15) Class23_Sub1 local15 = this.aClass23_Sub1_9.aClass23_Sub1_7;
		if (this.aClass23_Sub1_9 == local15) {
			this.aClass23_Sub1_10 = null;
			return null;
		} else {
			this.aClass23_Sub1_10 = local15.aClass23_Sub1_7;
			return local15;
		}
	}

	@OriginalMember(owner = "client!si", name = "a", descriptor = "(ILclient!kq;)V")
	public void method5211(@OriginalArg(1) Class23_Sub1 arg0) {
		if (arg0.aClass23_Sub1_8 != null) {
			arg0.method3683();
		}
		arg0.aClass23_Sub1_7 = this.aClass23_Sub1_9;
		arg0.aClass23_Sub1_8 = this.aClass23_Sub1_9.aClass23_Sub1_8;
		arg0.aClass23_Sub1_8.aClass23_Sub1_7 = arg0;
		arg0.aClass23_Sub1_7.aClass23_Sub1_8 = arg0;
	}

	@OriginalMember(owner = "client!si", name = "c", descriptor = "(I)Lclient!kq;")
	public Class23_Sub1 method5212() {
		@Pc(6) Class23_Sub1 local6 = this.aClass23_Sub1_10;
		if (this.aClass23_Sub1_9 == local6) {
			this.aClass23_Sub1_10 = null;
			return null;
		} else {
			this.aClass23_Sub1_10 = local6.aClass23_Sub1_7;
			return local6;
		}
	}

	@OriginalMember(owner = "client!si", name = "a", descriptor = "(Z)V")
	public void method5213() {
		while (true) {
			@Pc(10) Class23_Sub1 local10 = this.aClass23_Sub1_9.aClass23_Sub1_7;
			if (this.aClass23_Sub1_9 == local10) {
				this.aClass23_Sub1_10 = null;
				return;
			}
			local10.method3683();
		}
	}
}
