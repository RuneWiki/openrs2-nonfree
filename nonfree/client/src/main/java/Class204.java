import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!pv")
public final class Class204 {

	@OriginalMember(owner = "client!pv", name = "a", descriptor = "J")
	private long aLong170;

	@OriginalMember(owner = "client!pv", name = "c", descriptor = "Lclient!wc;")
	private Class1_Sub1 aClass1_Sub1_41;

	@OriginalMember(owner = "client!pv", name = "f", descriptor = "[Lclient!wc;")
	private final Class1_Sub1[] aClass1_Sub1Array1;

	@OriginalMember(owner = "client!pv", name = "g", descriptor = "I")
	private final int anInt5960;

	static {
		new Class158("You already sent an abuse report under 60 secs ago! Do not abuse this system!", "Du hast bereits vor weniger als 60 Sekunden einen Regelverstoß gemeldet!", "Vous avez déjà signalé un abus il y a moins d'une minute ! N'abusez pas du système !", "Você já enviou uma denúncia de abuso há menos de um minuto. Não abuse deste sistema!");
		new Class158("Unable to send abuse report - system busy.", "Meldung konnte nicht gesendet werden - Systeme überlastet", "Impossible de signaler un abus - Erreur système", "Sistema ocupado. Não foi possível enviar sua denúncia de abuso.");
	}

	@OriginalMember(owner = "client!pv", name = "<init>", descriptor = "(I)V")
	public Class204(@OriginalArg(0) int arg0) {
		this.aClass1_Sub1Array1 = new Class1_Sub1[arg0];
		this.anInt5960 = arg0;
		for (@Pc(10) int local10 = 0; local10 < arg0; local10++) {
			@Pc(20) Class1_Sub1 local20 = this.aClass1_Sub1Array1[local10] = new Class1_Sub1();
			local20.aClass1_Sub1_57 = local20;
			local20.aClass1_Sub1_58 = local20;
		}
	}

	@OriginalMember(owner = "client!pv", name = "a", descriptor = "(BLclient!wc;J)V")
	public void method4559(@OriginalArg(1) Class1_Sub1 arg0, @OriginalArg(2) long arg1) {
		if (arg0.aClass1_Sub1_57 != null) {
			arg0.method6125();
		}
		@Pc(25) Class1_Sub1 local25 = this.aClass1_Sub1Array1[(int) ((long) (this.anInt5960 - 1) & arg1)];
		arg0.aClass1_Sub1_57 = local25.aClass1_Sub1_57;
		arg0.aClass1_Sub1_58 = local25;
		arg0.aClass1_Sub1_57.aClass1_Sub1_58 = arg0;
		arg0.aClass1_Sub1_58.aClass1_Sub1_57 = arg0;
		arg0.aLong227 = arg1;
	}

	@OriginalMember(owner = "client!pv", name = "a", descriptor = "(BJ)Lclient!wc;")
	public Class1_Sub1 method4561(@OriginalArg(1) long arg0) {
		this.aLong170 = arg0;
		@Pc(25) Class1_Sub1 local25 = this.aClass1_Sub1Array1[(int) (arg0 & (long) (this.anInt5960 - 1))];
		for (this.aClass1_Sub1_41 = local25.aClass1_Sub1_58; this.aClass1_Sub1_41 != local25; this.aClass1_Sub1_41 = this.aClass1_Sub1_41.aClass1_Sub1_58) {
			if (this.aClass1_Sub1_41.aLong227 == arg0) {
				@Pc(40) Class1_Sub1 local40 = this.aClass1_Sub1_41;
				this.aClass1_Sub1_41 = this.aClass1_Sub1_41.aClass1_Sub1_58;
				return local40;
			}
		}
		this.aClass1_Sub1_41 = null;
		return null;
	}

	@OriginalMember(owner = "client!pv", name = "a", descriptor = "(I)Lclient!wc;")
	public Class1_Sub1 method4562() {
		if (this.aClass1_Sub1_41 == null) {
			return null;
		}
		@Pc(23) Class1_Sub1 local23 = this.aClass1_Sub1Array1[(int) ((long) (this.anInt5960 - 1) & this.aLong170)];
		while (this.aClass1_Sub1_41 != local23) {
			if (this.aLong170 == this.aClass1_Sub1_41.aLong227) {
				@Pc(42) Class1_Sub1 local42 = this.aClass1_Sub1_41;
				this.aClass1_Sub1_41 = this.aClass1_Sub1_41.aClass1_Sub1_58;
				return local42;
			}
			this.aClass1_Sub1_41 = this.aClass1_Sub1_41.aClass1_Sub1_58;
		}
		this.aClass1_Sub1_41 = null;
		return null;
	}
}
