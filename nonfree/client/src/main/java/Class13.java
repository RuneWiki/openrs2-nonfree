import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ar")
public final class Class13 {

	@OriginalMember(owner = "client!ar", name = "k", descriptor = "Lclient!hs;")
	private Class32_Sub3 aClass32_Sub3_2;

	@OriginalMember(owner = "client!ar", name = "d", descriptor = "Lclient!hs;")
	public final Class32_Sub3 aClass32_Sub3_1 = new Class32_Sub3();

	static {
		new Class85("Changes will take effect on your clan in the next 60 seconds.", "Die Änderungen am Chatraum werden innerhalb von 60 Sekunden gültig.", "Les modifications seront apportées à votre clan dans les prochaines 60 secondes.", "As alterações passarão a valer no seu clã nos próximos 60 segundos.");
	}

	@OriginalMember(owner = "client!ar", name = "<init>", descriptor = "()V")
	public Class13() {
		this.aClass32_Sub3_1.aClass32_Sub3_8 = this.aClass32_Sub3_1;
		this.aClass32_Sub3_1.aClass32_Sub3_7 = this.aClass32_Sub3_1;
	}

	@OriginalMember(owner = "client!ar", name = "a", descriptor = "(B)Lclient!hs;")
	public Class32_Sub3 method303() {
		@Pc(7) Class32_Sub3 local7 = this.aClass32_Sub3_1.aClass32_Sub3_8;
		if (local7 == this.aClass32_Sub3_1) {
			this.aClass32_Sub3_2 = null;
			return null;
		} else {
			this.aClass32_Sub3_2 = local7.aClass32_Sub3_8;
			return local7;
		}
	}

	@OriginalMember(owner = "client!ar", name = "b", descriptor = "(B)V")
	public void method304() {
		while (true) {
			@Pc(9) Class32_Sub3 local9 = this.aClass32_Sub3_1.aClass32_Sub3_8;
			if (local9 == this.aClass32_Sub3_1) {
				this.aClass32_Sub3_2 = null;
				return;
			}
			local9.method3392();
		}
	}

	@OriginalMember(owner = "client!ar", name = "a", descriptor = "(Lclient!hs;Z)V")
	public void method305(@OriginalArg(0) Class32_Sub3 arg0) {
		if (arg0.aClass32_Sub3_7 != null) {
			arg0.method3392();
		}
		arg0.aClass32_Sub3_8 = this.aClass32_Sub3_1;
		arg0.aClass32_Sub3_7 = this.aClass32_Sub3_1.aClass32_Sub3_7;
		arg0.aClass32_Sub3_7.aClass32_Sub3_8 = arg0;
		arg0.aClass32_Sub3_8.aClass32_Sub3_7 = arg0;
	}

	@OriginalMember(owner = "client!ar", name = "c", descriptor = "(B)Lclient!hs;")
	public Class32_Sub3 method308() {
		@Pc(6) Class32_Sub3 local6 = this.aClass32_Sub3_2;
		if (local6 == this.aClass32_Sub3_1) {
			this.aClass32_Sub3_2 = null;
			return null;
		} else {
			this.aClass32_Sub3_2 = local6.aClass32_Sub3_8;
			return local6;
		}
	}
}
