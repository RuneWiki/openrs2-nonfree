import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!rv")
public final class Class221 {

	@OriginalMember(owner = "client!rv", name = "a", descriptor = "Lclient!ru;")
	public Class220 aClass220_36;

	@OriginalMember(owner = "client!rv", name = "d", descriptor = "I")
	private int anInt6428;

	@OriginalMember(owner = "client!rv", name = "o", descriptor = "Lclient!ru;")
	private Class220 aClass220_37;

	@OriginalMember(owner = "client!rv", name = "p", descriptor = "C")
	public char aChar4;

	@OriginalMember(owner = "client!rv", name = "r", descriptor = "C")
	public char aChar5;

	@OriginalMember(owner = "client!rv", name = "k", descriptor = "Ljava/lang/String;")
	private String aString67 = "null";

	static {
		new Class231("Error sending message to clan chat - please try again later!", "Fehler beim Versenden der Nachricht - bitte versuch es später erneut.", "Erreur lors de l'envoi du message au canal de clan - veuillez réessayer ultérieurement.", "Erro ao enviar mensagem ao canal de clã. Tente de novo depois!");
	}

	@OriginalMember(owner = "client!rv", name = "a", descriptor = "(IBLclient!hw;)V")
	private void method5107(@OriginalArg(0) int arg0, @OriginalArg(2) Class2_Sub17 arg1) {
		if (arg0 == 1) {
			this.aChar4 = Static408.method1357(arg1.method6120());
		} else if (arg0 == 2) {
			this.aChar5 = Static408.method1357(arg1.method6120());
		} else if (arg0 == 3) {
			this.aString67 = arg1.method6141();
		} else if (arg0 == 4) {
			this.anInt6428 = arg1.method6129();
		} else if (arg0 == 5 || arg0 == 6) {
			@Pc(47) int local47 = arg1.method6148();
			this.aClass220_36 = new Class220(Static43.method654(local47));
			for (@Pc(59) int local59 = 0; local59 < local47; local59++) {
				@Pc(65) int local65 = arg1.method6129();
				@Pc(77) Class2 local77;
				if (arg0 == 5) {
					local77 = new Class2_Sub29(arg1.method6141());
				} else {
					local77 = new Class2_Sub5(arg1.method6129());
				}
				this.aClass220_36.method5104(local77, (long) local65);
			}
		}
	}

	@OriginalMember(owner = "client!rv", name = "a", descriptor = "(B)V")
	private void method5108() {
		this.aClass220_37 = new Class220(this.aClass220_36.method5106());
		for (@Pc(26) Class2_Sub29 local26 = (Class2_Sub29) this.aClass220_36.method5096(); local26 != null; local26 = (Class2_Sub29) this.aClass220_36.method5098()) {
			@Pc(37) Class2_Sub33 local37 = new Class2_Sub33(local26.aString43, (int) local26.aLong401);
			this.aClass220_37.method5104(local37, Static283.method4014(local26.aString43));
		}
	}

	@OriginalMember(owner = "client!rv", name = "a", descriptor = "(IB)I")
	public int method5109(@OriginalArg(0) int arg0) {
		if (this.aClass220_36 == null) {
			return this.anInt6428;
		} else {
			@Pc(23) Class2_Sub5 local23 = (Class2_Sub5) this.aClass220_36.method5099((long) arg0);
			return local23 == null ? this.anInt6428 : local23.anInt603;
		}
	}

	@OriginalMember(owner = "client!rv", name = "a", descriptor = "(ILclient!hw;)V")
	public void method5112(@OriginalArg(1) Class2_Sub17 arg0) {
		while (true) {
			@Pc(11) int local11 = arg0.method6138();
			if (local11 == 0) {
				return;
			}
			this.method5107(local11, arg0);
		}
	}

	@OriginalMember(owner = "client!rv", name = "a", descriptor = "(II)Z")
	public boolean method5113(@OriginalArg(0) int arg0) {
		if (this.aClass220_36 == null) {
			return false;
		}
		if (this.aClass220_37 == null) {
			this.method5118();
		}
		@Pc(27) Class2_Sub5 local27 = (Class2_Sub5) this.aClass220_37.method5099((long) arg0);
		return local27 != null;
	}

	@OriginalMember(owner = "client!rv", name = "b", descriptor = "(II)Ljava/lang/String;")
	public String method5114(@OriginalArg(0) int arg0) {
		if (this.aClass220_36 == null) {
			return this.aString67;
		} else {
			@Pc(17) Class2_Sub29 local17 = (Class2_Sub29) this.aClass220_36.method5099((long) arg0);
			return local17 == null ? this.aString67 : local17.aString43;
		}
	}

	@OriginalMember(owner = "client!rv", name = "a", descriptor = "(BLjava/lang/String;)Z")
	public boolean method5117(@OriginalArg(1) String arg0) {
		if (this.aClass220_36 == null) {
			return false;
		}
		if (this.aClass220_37 == null) {
			this.method5108();
		}
		for (@Pc(25) Class2_Sub33 local25 = (Class2_Sub33) this.aClass220_37.method5099(Static283.method4014(arg0)); local25 != null; local25 = (Class2_Sub33) this.aClass220_37.method5101()) {
			if (local25.aString54.equals(arg0)) {
				return true;
			}
		}
		return false;
	}

	@OriginalMember(owner = "client!rv", name = "b", descriptor = "(I)V")
	private void method5118() {
		this.aClass220_37 = new Class220(this.aClass220_36.method5106());
		for (@Pc(26) Class2_Sub5 local26 = (Class2_Sub5) this.aClass220_36.method5096(); local26 != null; local26 = (Class2_Sub5) this.aClass220_36.method5098()) {
			@Pc(35) Class2_Sub5 local35 = new Class2_Sub5((int) local26.aLong401);
			this.aClass220_37.method5104(local35, (long) local26.anInt603);
		}
	}
}
