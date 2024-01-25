import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!to")
public final class Class195 {

	@OriginalMember(owner = "client!to", name = "h", descriptor = "Lclient!jq;")
	private Class2_Sub1 aClass2_Sub1_8;

	@OriginalMember(owner = "client!to", name = "g", descriptor = "Lclient!jq;")
	public final Class2_Sub1 aClass2_Sub1_7 = new Class2_Sub1();

	static {
		new Class159("Attempting to join channel...", "Chatraum wird betreten...", "Tentative de connexion au canal...", "Tentando acessar canal...");
	}

	@OriginalMember(owner = "client!to", name = "<init>", descriptor = "()V")
	public Class195() {
		this.aClass2_Sub1_7.aClass2_Sub1_5 = this.aClass2_Sub1_7;
		this.aClass2_Sub1_7.aClass2_Sub1_6 = this.aClass2_Sub1_7;
	}

	@OriginalMember(owner = "client!to", name = "a", descriptor = "(B)V")
	public void method5110() {
		while (true) {
			@Pc(13) Class2_Sub1 local13 = this.aClass2_Sub1_7.aClass2_Sub1_6;
			if (this.aClass2_Sub1_7 == local13) {
				this.aClass2_Sub1_8 = null;
				return;
			}
			local13.method4516();
		}
	}

	@OriginalMember(owner = "client!to", name = "a", descriptor = "(I)Lclient!jq;")
	public Class2_Sub1 method5111() {
		@Pc(12) Class2_Sub1 local12 = this.aClass2_Sub1_7.aClass2_Sub1_6;
		if (this.aClass2_Sub1_7 == local12) {
			this.aClass2_Sub1_8 = null;
			return null;
		} else {
			this.aClass2_Sub1_8 = local12.aClass2_Sub1_6;
			return local12;
		}
	}

	@OriginalMember(owner = "client!to", name = "b", descriptor = "(I)Lclient!jq;")
	public Class2_Sub1 method5114() {
		@Pc(6) Class2_Sub1 local6 = this.aClass2_Sub1_8;
		if (local6 == this.aClass2_Sub1_7) {
			this.aClass2_Sub1_8 = null;
			return null;
		} else {
			this.aClass2_Sub1_8 = local6.aClass2_Sub1_6;
			return local6;
		}
	}

	@OriginalMember(owner = "client!to", name = "a", descriptor = "(ILclient!jq;)V")
	public void method5115(@OriginalArg(1) Class2_Sub1 arg0) {
		if (arg0.aClass2_Sub1_5 != null) {
			arg0.method4516();
		}
		arg0.aClass2_Sub1_5 = this.aClass2_Sub1_7.aClass2_Sub1_5;
		arg0.aClass2_Sub1_6 = this.aClass2_Sub1_7;
		arg0.aClass2_Sub1_5.aClass2_Sub1_6 = arg0;
		arg0.aClass2_Sub1_6.aClass2_Sub1_5 = arg0;
	}
}
