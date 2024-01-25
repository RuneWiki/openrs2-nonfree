import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!se")
public final class Class180 {

	@OriginalMember(owner = "client!se", name = "k", descriptor = "Lclient!wa;")
	private Class4_Sub4 aClass4_Sub4_48;

	@OriginalMember(owner = "client!se", name = "a", descriptor = "Lclient!wa;")
	private final Class4_Sub4 aClass4_Sub4_47 = new Class4_Sub4();

	static {
		new Class159("Unable to send message - player not on your friendlist.", "Nachricht kann nicht geschickt werden,", "Impossible d'envoyer un message - joueur non inclus dans votre liste d'amis.", "Não foi possível enviar a mensagem. O jogador não está na sua lista de amigos.");
	}

	@OriginalMember(owner = "client!se", name = "<init>", descriptor = "()V")
	public Class180() {
		this.aClass4_Sub4_47.aClass4_Sub4_62 = this.aClass4_Sub4_47;
		this.aClass4_Sub4_47.aClass4_Sub4_61 = this.aClass4_Sub4_47;
	}

	@OriginalMember(owner = "client!se", name = "a", descriptor = "(I)Lclient!wa;")
	public Class4_Sub4 method4838() {
		@Pc(12) Class4_Sub4 local12 = this.aClass4_Sub4_47.aClass4_Sub4_61;
		if (this.aClass4_Sub4_47 == local12) {
			this.aClass4_Sub4_48 = null;
			return null;
		} else {
			this.aClass4_Sub4_48 = local12.aClass4_Sub4_61;
			return local12;
		}
	}

	@OriginalMember(owner = "client!se", name = "a", descriptor = "(B)Lclient!wa;")
	public Class4_Sub4 method4839() {
		@Pc(14) Class4_Sub4 local14 = this.aClass4_Sub4_47.aClass4_Sub4_61;
		if (local14 == this.aClass4_Sub4_47) {
			return null;
		} else {
			local14.method5678();
			return local14;
		}
	}

	@OriginalMember(owner = "client!se", name = "a", descriptor = "(Lclient!wa;I)V")
	public void method4840(@OriginalArg(0) Class4_Sub4 arg0) {
		if (arg0.aClass4_Sub4_62 != null) {
			arg0.method5678();
		}
		arg0.aClass4_Sub4_62 = this.aClass4_Sub4_47.aClass4_Sub4_62;
		arg0.aClass4_Sub4_61 = this.aClass4_Sub4_47;
		arg0.aClass4_Sub4_62.aClass4_Sub4_61 = arg0;
		arg0.aClass4_Sub4_61.aClass4_Sub4_62 = arg0;
	}

	@OriginalMember(owner = "client!se", name = "b", descriptor = "(I)V")
	public void method4841() {
		while (true) {
			@Pc(12) Class4_Sub4 local12 = this.aClass4_Sub4_47.aClass4_Sub4_61;
			if (this.aClass4_Sub4_47 == local12) {
				this.aClass4_Sub4_48 = null;
				return;
			}
			local12.method5678();
		}
	}

	@OriginalMember(owner = "client!se", name = "d", descriptor = "(I)Lclient!wa;")
	public Class4_Sub4 method4843() {
		@Pc(6) Class4_Sub4 local6 = this.aClass4_Sub4_48;
		if (local6 == this.aClass4_Sub4_47) {
			this.aClass4_Sub4_48 = null;
			return null;
		} else {
			this.aClass4_Sub4_48 = local6.aClass4_Sub4_61;
			return local6;
		}
	}

	@OriginalMember(owner = "client!se", name = "e", descriptor = "(I)I")
	public int method4844() {
		@Pc(7) int local7 = 0;
		for (@Pc(11) Class4_Sub4 local11 = this.aClass4_Sub4_47.aClass4_Sub4_61; local11 != this.aClass4_Sub4_47; local11 = local11.aClass4_Sub4_61) {
			local7++;
		}
		return local7;
	}
}
