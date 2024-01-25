import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!gs")
public final class Class93 {

	@OriginalMember(owner = "client!gs", name = "h", descriptor = "Lclient!vi;")
	private Class21 aClass21_14;

	@OriginalMember(owner = "client!gs", name = "c", descriptor = "Lclient!vi;")
	private final Class21 aClass21_13 = new Class21();

	static {
		new Class134("If you are not, please change your password to something more obscure!", "nicht der Fall ist, ändere dein Passwort zu einem ungewöhnlicheren Begriff!", "Si ce n'est pas le cas, remplacez votre mot de passe par une formule moins évidente !", "Caso não esteja, altere sua senha para algo mais obscuro!");
	}

	@OriginalMember(owner = "client!gs", name = "<init>", descriptor = "()V")
	public Class93() {
		this.aClass21_13.aClass21_26 = this.aClass21_13;
		this.aClass21_13.aClass21_25 = this.aClass21_13;
	}

	@OriginalMember(owner = "client!gs", name = "a", descriptor = "(Z)V")
	public void method2073() {
		while (true) {
			@Pc(9) Class21 local9 = this.aClass21_13.aClass21_26;
			if (this.aClass21_13 == local9) {
				this.aClass21_14 = null;
				return;
			}
			local9.method5593();
		}
	}

	@OriginalMember(owner = "client!gs", name = "a", descriptor = "(I)Lclient!vi;")
	public Class21 method2075() {
		@Pc(13) Class21 local13 = this.aClass21_13.aClass21_25;
		if (this.aClass21_13 == local13) {
			this.aClass21_14 = null;
			return null;
		} else {
			this.aClass21_14 = local13.aClass21_25;
			return local13;
		}
	}

	@OriginalMember(owner = "client!gs", name = "b", descriptor = "(Z)Lclient!vi;")
	public Class21 method2076() {
		@Pc(12) Class21 local12 = this.aClass21_13.aClass21_26;
		if (this.aClass21_13 == local12) {
			return null;
		} else {
			local12.method5593();
			return local12;
		}
	}

	@OriginalMember(owner = "client!gs", name = "b", descriptor = "(I)Z")
	public boolean method2078() {
		return this.aClass21_13.aClass21_26 == this.aClass21_13;
	}

	@OriginalMember(owner = "client!gs", name = "a", descriptor = "(ILclient!vi;)V")
	public void method2079(@OriginalArg(1) Class21 arg0) {
		if (arg0.aClass21_25 != null) {
			arg0.method5593();
		}
		arg0.aClass21_25 = this.aClass21_13.aClass21_25;
		arg0.aClass21_26 = this.aClass21_13;
		arg0.aClass21_25.aClass21_26 = arg0;
		arg0.aClass21_26.aClass21_25 = arg0;
	}

	@OriginalMember(owner = "client!gs", name = "b", descriptor = "(B)Lclient!vi;")
	public Class21 method2080() {
		@Pc(7) Class21 local7 = this.aClass21_13.aClass21_26;
		if (this.aClass21_13 == local7) {
			this.aClass21_14 = null;
			return null;
		} else {
			this.aClass21_14 = local7.aClass21_26;
			return local7;
		}
	}

	@OriginalMember(owner = "client!gs", name = "c", descriptor = "(I)Lclient!vi;")
	public Class21 method2081() {
		@Pc(6) Class21 local6 = this.aClass21_14;
		if (local6 == this.aClass21_13) {
			this.aClass21_14 = null;
			return null;
		} else {
			this.aClass21_14 = local6.aClass21_26;
			return local6;
		}
	}

	@OriginalMember(owner = "client!gs", name = "c", descriptor = "(B)I")
	public int method2082() {
		@Pc(7) int local7 = 0;
		@Pc(11) Class21 local11 = this.aClass21_13.aClass21_26;
		while (local11 != this.aClass21_13) {
			local11 = local11.aClass21_26;
			local7++;
		}
		return local7;
	}
}
