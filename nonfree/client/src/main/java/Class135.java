import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!kk")
public final class Class135 {

	@OriginalMember(owner = "client!kk", name = "b", descriptor = "Lclient!np;")
	private Class3_Sub3 aClass3_Sub3_43;

	@OriginalMember(owner = "client!kk", name = "h", descriptor = "J")
	private long aLong129;

	@OriginalMember(owner = "client!kk", name = "a", descriptor = "[Lclient!np;")
	private final Class3_Sub3[] aClass3_Sub3Array1;

	@OriginalMember(owner = "client!kk", name = "f", descriptor = "I")
	private final int anInt4173;

	static {
		new Class175("Changes will take effect on your clan in the next 60 seconds.", "Die Änderungen am Chatraum werden innerhalb von 60 Sekunden gültig.", "Les modifications seront apportées à votre clan dans les prochaines 60 secondes.", "As alterações passarão a valer no seu clã nos próximos 60 segundos.");
		new Class175("Already attempting to join a channel - please wait...", "Du versuchst bereits, einem Chatraum beizutreten - bitte warte.", "Tentative de connexion au canal déjà en cours - veuillez patienter...", "Já há uma tentativa de entrar em um canal. Aguarde...");
	}

	@OriginalMember(owner = "client!kk", name = "<init>", descriptor = "(I)V")
	public Class135(@OriginalArg(0) int arg0) {
		this.aClass3_Sub3Array1 = new Class3_Sub3[arg0];
		this.anInt4173 = arg0;
		for (@Pc(10) int local10 = 0; local10 < arg0; local10++) {
			@Pc(20) Class3_Sub3 local20 = this.aClass3_Sub3Array1[local10] = new Class3_Sub3();
			local20.aClass3_Sub3_55 = local20;
			local20.aClass3_Sub3_56 = local20;
		}
	}

	@OriginalMember(owner = "client!kk", name = "a", descriptor = "(I)Lclient!np;")
	public Class3_Sub3 method3429() {
		if (this.aClass3_Sub3_43 == null) {
			return null;
		}
		@Pc(29) Class3_Sub3 local29 = this.aClass3_Sub3Array1[(int) ((long) (this.anInt4173 - 1) & this.aLong129)];
		while (local29 != this.aClass3_Sub3_43) {
			if (this.aLong129 == this.aClass3_Sub3_43.aLong175) {
				@Pc(41) Class3_Sub3 local41 = this.aClass3_Sub3_43;
				this.aClass3_Sub3_43 = this.aClass3_Sub3_43.aClass3_Sub3_56;
				return local41;
			}
			this.aClass3_Sub3_43 = this.aClass3_Sub3_43.aClass3_Sub3_56;
		}
		this.aClass3_Sub3_43 = null;
		return null;
	}

	@OriginalMember(owner = "client!kk", name = "a", descriptor = "(JI)Lclient!np;")
	public Class3_Sub3 method3430(@OriginalArg(0) long arg0) {
		this.aLong129 = arg0;
		@Pc(20) Class3_Sub3 local20 = this.aClass3_Sub3Array1[(int) ((long) (this.anInt4173 - 1) & arg0)];
		for (this.aClass3_Sub3_43 = local20.aClass3_Sub3_56; this.aClass3_Sub3_43 != local20; this.aClass3_Sub3_43 = this.aClass3_Sub3_43.aClass3_Sub3_56) {
			if (this.aClass3_Sub3_43.aLong175 == arg0) {
				@Pc(39) Class3_Sub3 local39 = this.aClass3_Sub3_43;
				this.aClass3_Sub3_43 = this.aClass3_Sub3_43.aClass3_Sub3_56;
				return local39;
			}
		}
		this.aClass3_Sub3_43 = null;
		return null;
	}

	@OriginalMember(owner = "client!kk", name = "a", descriptor = "(IJLclient!np;)V")
	public void method3433(@OriginalArg(1) long arg0, @OriginalArg(2) Class3_Sub3 arg1) {
		if (arg1.aClass3_Sub3_55 != null) {
			arg1.method4647();
		}
		@Pc(21) Class3_Sub3 local21 = this.aClass3_Sub3Array1[(int) ((long) (this.anInt4173 - 1) & arg0)];
		arg1.aClass3_Sub3_56 = local21;
		arg1.aClass3_Sub3_55 = local21.aClass3_Sub3_55;
		arg1.aClass3_Sub3_55.aClass3_Sub3_56 = arg1;
		arg1.aClass3_Sub3_56.aClass3_Sub3_55 = arg1;
		arg1.aLong175 = arg0;
	}
}
