import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!al")
public final class Class12 {

	@OriginalMember(owner = "client!al", name = "h", descriptor = "Lclient!rj;")
	private Class2_Sub7 aClass2_Sub7_1;

	@OriginalMember(owner = "client!al", name = "j", descriptor = "J")
	private long aLong5;

	@OriginalMember(owner = "client!al", name = "b", descriptor = "I")
	private final int anInt202;

	@OriginalMember(owner = "client!al", name = "f", descriptor = "[Lclient!rj;")
	private final Class2_Sub7[] aClass2_Sub7Array1;

	static {
		new Class62(" days.", " Tage.", " jours.", " dias.");
		new Class62("Changes will take effect on your clan in the next 60 seconds.", "Die Änderungen am Chatraum werden innerhalb von 60 Sekunden gültig.", "Les modifications seront apportées à votre clan dans les prochaines 60 secondes.", "As alterações passarão a valer no seu clã nos próximos 60 segundos.");
	}

	@OriginalMember(owner = "client!al", name = "<init>", descriptor = "(I)V")
	public Class12(@OriginalArg(0) int arg0) {
		this.anInt202 = arg0;
		this.aClass2_Sub7Array1 = new Class2_Sub7[arg0];
		for (@Pc(10) int local10 = 0; local10 < arg0; local10++) {
			@Pc(20) Class2_Sub7 local20 = this.aClass2_Sub7Array1[local10] = new Class2_Sub7();
			local20.aClass2_Sub7_54 = local20;
			local20.aClass2_Sub7_53 = local20;
		}
	}

	@OriginalMember(owner = "client!al", name = "b", descriptor = "(I)Lclient!rj;")
	public Class2_Sub7 method102() {
		if (this.aClass2_Sub7_1 == null) {
			return null;
		}
		@Pc(28) Class2_Sub7 local28 = this.aClass2_Sub7Array1[(int) ((long) (this.anInt202 - 1) & this.aLong5)];
		while (local28 != this.aClass2_Sub7_1) {
			if (this.aLong5 == this.aClass2_Sub7_1.aLong209) {
				@Pc(40) Class2_Sub7 local40 = this.aClass2_Sub7_1;
				this.aClass2_Sub7_1 = this.aClass2_Sub7_1.aClass2_Sub7_53;
				return local40;
			}
			this.aClass2_Sub7_1 = this.aClass2_Sub7_1.aClass2_Sub7_53;
		}
		this.aClass2_Sub7_1 = null;
		return null;
	}

	@OriginalMember(owner = "client!al", name = "a", descriptor = "(BLclient!rj;J)V")
	public void method106(@OriginalArg(1) Class2_Sub7 arg0, @OriginalArg(2) long arg1) {
		if (arg0.aClass2_Sub7_54 != null) {
			arg0.method6085();
		}
		@Pc(26) Class2_Sub7 local26 = this.aClass2_Sub7Array1[(int) (arg1 & (long) (this.anInt202 - 1))];
		arg0.aClass2_Sub7_54 = local26.aClass2_Sub7_54;
		arg0.aClass2_Sub7_53 = local26;
		arg0.aClass2_Sub7_54.aClass2_Sub7_53 = arg0;
		arg0.aClass2_Sub7_53.aClass2_Sub7_54 = arg0;
		arg0.aLong209 = arg1;
	}

	@OriginalMember(owner = "client!al", name = "a", descriptor = "(ZJ)Lclient!rj;")
	public Class2_Sub7 method107(@OriginalArg(1) long arg0) {
		this.aLong5 = arg0;
		@Pc(20) Class2_Sub7 local20 = this.aClass2_Sub7Array1[(int) (arg0 & (long) (this.anInt202 - 1))];
		for (this.aClass2_Sub7_1 = local20.aClass2_Sub7_53; this.aClass2_Sub7_1 != local20; this.aClass2_Sub7_1 = this.aClass2_Sub7_1.aClass2_Sub7_53) {
			if (this.aClass2_Sub7_1.aLong209 == arg0) {
				@Pc(39) Class2_Sub7 local39 = this.aClass2_Sub7_1;
				this.aClass2_Sub7_1 = this.aClass2_Sub7_1.aClass2_Sub7_53;
				return local39;
			}
		}
		this.aClass2_Sub7_1 = null;
		return null;
	}
}
