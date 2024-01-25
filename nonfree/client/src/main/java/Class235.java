import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!tc")
public final class Class235 {

	@OriginalMember(owner = "client!tc", name = "i", descriptor = "Lclient!ta;")
	private Class6_Sub3 aClass6_Sub3_8;

	@OriginalMember(owner = "client!tc", name = "g", descriptor = "Lclient!ta;")
	public final Class6_Sub3 aClass6_Sub3_7 = new Class6_Sub3();

	static {
		new Class189("You cannot report that person for Staff Impersonation, they are Jagex Staff.", "Diese Person ist ein Jagex-Mitarbeiter!", "Cette personne est un membre du personnel de Jagex, vous ne pouvez pas la signaler pour abus d'identité.", "Você não pode denunciar essa pessoa por tentar se passar por membro da equipe Jagex, pois ela faz parte da equipe.");
	}

	@OriginalMember(owner = "client!tc", name = "<init>", descriptor = "()V")
	public Class235() {
		this.aClass6_Sub3_7.aClass6_Sub3_6 = this.aClass6_Sub3_7;
		this.aClass6_Sub3_7.aClass6_Sub3_5 = this.aClass6_Sub3_7;
	}

	@OriginalMember(owner = "client!tc", name = "a", descriptor = "(B)Lclient!ta;")
	public Class6_Sub3 method4958() {
		@Pc(13) Class6_Sub3 local13 = this.aClass6_Sub3_7.aClass6_Sub3_5;
		if (this.aClass6_Sub3_7 == local13) {
			this.aClass6_Sub3_8 = null;
			return null;
		} else {
			this.aClass6_Sub3_8 = local13.aClass6_Sub3_5;
			return local13;
		}
	}

	@OriginalMember(owner = "client!tc", name = "a", descriptor = "(Lclient!ta;I)V")
	public void method4959(@OriginalArg(0) Class6_Sub3 arg0) {
		if (arg0.aClass6_Sub3_6 != null) {
			arg0.method1456();
		}
		arg0.aClass6_Sub3_5 = this.aClass6_Sub3_7;
		arg0.aClass6_Sub3_6 = this.aClass6_Sub3_7.aClass6_Sub3_6;
		arg0.aClass6_Sub3_6.aClass6_Sub3_5 = arg0;
		arg0.aClass6_Sub3_5.aClass6_Sub3_6 = arg0;
	}

	@OriginalMember(owner = "client!tc", name = "a", descriptor = "(I)I")
	public int method4960() {
		@Pc(7) int local7 = 0;
		@Pc(18) Class6_Sub3 local18 = this.aClass6_Sub3_7.aClass6_Sub3_5;
		while (this.aClass6_Sub3_7 != local18) {
			local18 = local18.aClass6_Sub3_5;
			local7++;
		}
		return local7;
	}

	@OriginalMember(owner = "client!tc", name = "b", descriptor = "(B)Lclient!ta;")
	public Class6_Sub3 method4961() {
		@Pc(11) Class6_Sub3 local11 = this.aClass6_Sub3_8;
		if (local11 == this.aClass6_Sub3_7) {
			this.aClass6_Sub3_8 = null;
			return null;
		} else {
			this.aClass6_Sub3_8 = local11.aClass6_Sub3_5;
			return local11;
		}
	}

	@OriginalMember(owner = "client!tc", name = "c", descriptor = "(B)V")
	public void method4962() {
		while (true) {
			@Pc(15) Class6_Sub3 local15 = this.aClass6_Sub3_7.aClass6_Sub3_5;
			if (local15 == this.aClass6_Sub3_7) {
				this.aClass6_Sub3_8 = null;
				return;
			}
			local15.method1456();
		}
	}
}
