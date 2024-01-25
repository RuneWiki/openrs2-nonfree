import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!qb")
public final class Class197 {

	@OriginalMember(owner = "client!qb", name = "o", descriptor = "Lclient!hw;")
	private Class40_Sub2 aClass40_Sub2_10;

	@OriginalMember(owner = "client!qb", name = "i", descriptor = "Lclient!hw;")
	public final Class40_Sub2 aClass40_Sub2_9 = new Class40_Sub2();

	static {
		new Class182("Unable to send abuse report - system busy.", "Meldung konnte nicht gesendet werden - Systeme überlastet", "Impossible de signaler un abus - Erreur système", "Sistema ocupado. Não foi possível enviar sua denúncia de abuso.");
	}

	@OriginalMember(owner = "client!qb", name = "<init>", descriptor = "()V")
	public Class197() {
		this.aClass40_Sub2_9.aClass40_Sub2_7 = this.aClass40_Sub2_9;
		this.aClass40_Sub2_9.aClass40_Sub2_8 = this.aClass40_Sub2_9;
	}

	@OriginalMember(owner = "client!qb", name = "b", descriptor = "(I)I")
	public int method4413() {
		@Pc(7) int local7 = 0;
		@Pc(11) Class40_Sub2 local11 = this.aClass40_Sub2_9.aClass40_Sub2_7;
		while (local11 != this.aClass40_Sub2_9) {
			local11 = local11.aClass40_Sub2_7;
			local7++;
		}
		return local7;
	}

	@OriginalMember(owner = "client!qb", name = "c", descriptor = "(I)Lclient!hw;")
	public Class40_Sub2 method4414() {
		@Pc(11) Class40_Sub2 local11 = this.aClass40_Sub2_10;
		if (this.aClass40_Sub2_9 == local11) {
			this.aClass40_Sub2_10 = null;
			return null;
		} else {
			this.aClass40_Sub2_10 = local11.aClass40_Sub2_7;
			return local11;
		}
	}

	@OriginalMember(owner = "client!qb", name = "a", descriptor = "(ILclient!hw;)V")
	public void method4416(@OriginalArg(1) Class40_Sub2 arg0) {
		if (arg0.aClass40_Sub2_8 != null) {
			arg0.method3361();
		}
		arg0.aClass40_Sub2_7 = this.aClass40_Sub2_9;
		arg0.aClass40_Sub2_8 = this.aClass40_Sub2_9.aClass40_Sub2_8;
		arg0.aClass40_Sub2_8.aClass40_Sub2_7 = arg0;
		arg0.aClass40_Sub2_7.aClass40_Sub2_8 = arg0;
	}

	@OriginalMember(owner = "client!qb", name = "d", descriptor = "(I)Lclient!hw;")
	public Class40_Sub2 method4418() {
		@Pc(7) Class40_Sub2 local7 = this.aClass40_Sub2_9.aClass40_Sub2_7;
		if (this.aClass40_Sub2_9 == local7) {
			this.aClass40_Sub2_10 = null;
			return null;
		} else {
			this.aClass40_Sub2_10 = local7.aClass40_Sub2_7;
			return local7;
		}
	}

	@OriginalMember(owner = "client!qb", name = "a", descriptor = "(B)V")
	public void method4419() {
		while (true) {
			@Pc(11) Class40_Sub2 local11 = this.aClass40_Sub2_9.aClass40_Sub2_7;
			if (local11 == this.aClass40_Sub2_9) {
				this.aClass40_Sub2_10 = null;
				return;
			}
			local11.method3361();
		}
	}
}
