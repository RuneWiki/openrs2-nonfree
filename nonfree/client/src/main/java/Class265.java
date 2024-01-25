import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!wd")
public final class Class265 {

	@OriginalMember(owner = "client!wd", name = "c", descriptor = "J")
	private long aLong257;

	@OriginalMember(owner = "client!wd", name = "d", descriptor = "Lclient!ol;")
	private Class10_Sub1 aClass10_Sub1_58;

	@OriginalMember(owner = "client!wd", name = "j", descriptor = "I")
	private final int anInt7451;

	@OriginalMember(owner = "client!wd", name = "f", descriptor = "[Lclient!ol;")
	private final Class10_Sub1[] aClass10_Sub1Array1;

	static {
		new Class182("Changes will take effect on your clan in the next 60 seconds.", "Die Änderungen am Chatraum werden innerhalb von 60 Sekunden gültig.", "Les modifications seront apportées à votre clan dans les prochaines 60 secondes.", "As alterações passarão a valer no seu clã nos próximos 60 segundos.");
	}

	@OriginalMember(owner = "client!wd", name = "<init>", descriptor = "(I)V")
	public Class265(@OriginalArg(0) int arg0) {
		this.anInt7451 = arg0;
		this.aClass10_Sub1Array1 = new Class10_Sub1[arg0];
		for (@Pc(10) int local10 = 0; local10 < arg0; local10++) {
			@Pc(20) Class10_Sub1 local20 = this.aClass10_Sub1Array1[local10] = new Class10_Sub1();
			local20.aClass10_Sub1_56 = local20;
			local20.aClass10_Sub1_57 = local20;
		}
	}

	@OriginalMember(owner = "client!wd", name = "a", descriptor = "(JLclient!ol;I)V")
	public void method5936(@OriginalArg(0) long arg0, @OriginalArg(1) Class10_Sub1 arg1) {
		if (arg1.aClass10_Sub1_57 != null) {
			arg1.method5897();
		}
		@Pc(21) Class10_Sub1 local21 = this.aClass10_Sub1Array1[(int) ((long) (this.anInt7451 - 1) & arg0)];
		arg1.aClass10_Sub1_57 = local21.aClass10_Sub1_57;
		arg1.aClass10_Sub1_56 = local21;
		arg1.aClass10_Sub1_57.aClass10_Sub1_56 = arg1;
		arg1.aClass10_Sub1_56.aClass10_Sub1_57 = arg1;
		arg1.aLong254 = arg0;
	}

	@OriginalMember(owner = "client!wd", name = "a", descriptor = "(B)Lclient!ol;")
	public Class10_Sub1 method5937() {
		if (this.aClass10_Sub1_58 == null) {
			return null;
		}
		@Pc(31) Class10_Sub1 local31 = this.aClass10_Sub1Array1[(int) ((long) (this.anInt7451 - 1) & this.aLong257)];
		while (this.aClass10_Sub1_58 != local31) {
			if (this.aLong257 == this.aClass10_Sub1_58.aLong254) {
				@Pc(47) Class10_Sub1 local47 = this.aClass10_Sub1_58;
				this.aClass10_Sub1_58 = this.aClass10_Sub1_58.aClass10_Sub1_56;
				return local47;
			}
			this.aClass10_Sub1_58 = this.aClass10_Sub1_58.aClass10_Sub1_56;
		}
		this.aClass10_Sub1_58 = null;
		return null;
	}

	@OriginalMember(owner = "client!wd", name = "a", descriptor = "(JI)Lclient!ol;")
	public Class10_Sub1 method5940(@OriginalArg(0) long arg0) {
		this.aLong257 = arg0;
		@Pc(25) Class10_Sub1 local25 = this.aClass10_Sub1Array1[(int) (arg0 & (long) (this.anInt7451 - 1))];
		for (this.aClass10_Sub1_58 = local25.aClass10_Sub1_56; this.aClass10_Sub1_58 != local25; this.aClass10_Sub1_58 = this.aClass10_Sub1_58.aClass10_Sub1_56) {
			if (arg0 == this.aClass10_Sub1_58.aLong254) {
				@Pc(44) Class10_Sub1 local44 = this.aClass10_Sub1_58;
				this.aClass10_Sub1_58 = this.aClass10_Sub1_58.aClass10_Sub1_56;
				return local44;
			}
		}
		this.aClass10_Sub1_58 = null;
		return null;
	}
}
