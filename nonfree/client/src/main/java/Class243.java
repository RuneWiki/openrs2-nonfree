import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ug")
public final class Class243 {

	@OriginalMember(owner = "client!ug", name = "s", descriptor = "Lclient!qg;")
	private Class3 aClass3_232;

	@OriginalMember(owner = "client!ug", name = "b", descriptor = "Lclient!qg;")
	public final Class3 aClass3_231 = new Class3();

	static {
		new Class189("Now talking in clan channel of player: ", "Clanchat dieses Spieler beigetreten: ", "Vous participez actuellement au canal de clan du joueur : ", "Falando no canal do clã do jogador: ");
	}

	@OriginalMember(owner = "client!ug", name = "<init>", descriptor = "()V")
	public Class243() {
		this.aClass3_231.aClass3_262 = this.aClass3_231;
		this.aClass3_231.aClass3_261 = this.aClass3_231;
	}

	@OriginalMember(owner = "client!ug", name = "a", descriptor = "(ILclient!qg;)V")
	public void method5198(@OriginalArg(1) Class3 arg0) {
		if (arg0.aClass3_262 != null) {
			arg0.method5977();
		}
		arg0.aClass3_261 = this.aClass3_231;
		arg0.aClass3_262 = this.aClass3_231.aClass3_262;
		arg0.aClass3_262.aClass3_261 = arg0;
		arg0.aClass3_261.aClass3_262 = arg0;
	}

	@OriginalMember(owner = "client!ug", name = "a", descriptor = "(B)V")
	public void method5200() {
		while (true) {
			@Pc(3) Class3 local3 = this.aClass3_231.aClass3_261;
			if (local3 == this.aClass3_231) {
				this.aClass3_232 = null;
				return;
			}
			local3.method5977();
		}
	}

	@OriginalMember(owner = "client!ug", name = "a", descriptor = "(I)I")
	public int method5201() {
		@Pc(5) int local5 = 0;
		for (@Pc(9) Class3 local9 = this.aClass3_231.aClass3_261; local9 != this.aClass3_231; local9 = local9.aClass3_261) {
			local5++;
		}
		return local5;
	}

	@OriginalMember(owner = "client!ug", name = "b", descriptor = "(I)Lclient!qg;")
	public Class3 method5203() {
		@Pc(6) Class3 local6 = this.aClass3_232;
		if (local6 == this.aClass3_231) {
			this.aClass3_232 = null;
			return null;
		} else {
			this.aClass3_232 = local6.aClass3_261;
			return local6;
		}
	}

	@OriginalMember(owner = "client!ug", name = "c", descriptor = "(I)Lclient!qg;")
	public Class3 method5204() {
		@Pc(13) Class3 local13 = this.aClass3_231.aClass3_261;
		if (local13 == this.aClass3_231) {
			return null;
		} else {
			local13.method5977();
			return local13;
		}
	}

	@OriginalMember(owner = "client!ug", name = "a", descriptor = "(Lclient!qg;ILclient!ug;)V")
	private void method5205(@OriginalArg(0) Class3 arg0, @OriginalArg(2) Class243 arg1) {
		@Pc(7) Class3 local7 = this.aClass3_231.aClass3_262;
		this.aClass3_231.aClass3_262 = arg0.aClass3_262;
		arg0.aClass3_262.aClass3_261 = this.aClass3_231;
		if (this.aClass3_231 != arg0) {
			arg0.aClass3_262 = arg1.aClass3_231.aClass3_262;
			arg0.aClass3_262.aClass3_261 = arg0;
			local7.aClass3_261 = arg1.aClass3_231;
			arg1.aClass3_231.aClass3_262 = local7;
		}
	}

	@OriginalMember(owner = "client!ug", name = "a", descriptor = "(Z)Lclient!qg;")
	public Class3 method5207() {
		@Pc(7) Class3 local7 = this.aClass3_231.aClass3_262;
		if (this.aClass3_231 == local7) {
			this.aClass3_232 = null;
			return null;
		} else {
			this.aClass3_232 = local7.aClass3_262;
			return local7;
		}
	}

	@OriginalMember(owner = "client!ug", name = "d", descriptor = "(I)Lclient!qg;")
	public Class3 method5208() {
		@Pc(7) Class3 local7 = this.aClass3_231.aClass3_261;
		if (this.aClass3_231 == local7) {
			this.aClass3_232 = null;
			return null;
		} else {
			this.aClass3_232 = local7.aClass3_261;
			return local7;
		}
	}

	@OriginalMember(owner = "client!ug", name = "a", descriptor = "(BLclient!qg;)V")
	public void method5209(@OriginalArg(1) Class3 arg0) {
		if (arg0.aClass3_262 != null) {
			arg0.method5977();
		}
		arg0.aClass3_261 = this.aClass3_231.aClass3_261;
		arg0.aClass3_262 = this.aClass3_231;
		arg0.aClass3_262.aClass3_261 = arg0;
		arg0.aClass3_261.aClass3_262 = arg0;
	}

	@OriginalMember(owner = "client!ug", name = "f", descriptor = "(I)Z")
	public boolean method5211() {
		return this.aClass3_231 == this.aClass3_231.aClass3_261;
	}

	@OriginalMember(owner = "client!ug", name = "a", descriptor = "(Lclient!ug;B)V")
	public void method5212(@OriginalArg(0) Class243 arg0) {
		this.method5205(this.aClass3_231.aClass3_261, arg0);
	}

	@OriginalMember(owner = "client!ug", name = "g", descriptor = "(I)Lclient!qg;")
	public Class3 method5214() {
		@Pc(12) Class3 local12 = this.aClass3_232;
		if (local12 == this.aClass3_231) {
			this.aClass3_232 = null;
			return null;
		} else {
			this.aClass3_232 = local12.aClass3_262;
			return local12;
		}
	}
}
