import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!si")
public final class Class303 {

	@OriginalMember(owner = "client!si", name = "b", descriptor = "J")
	private long aLong253;

	@OriginalMember(owner = "client!si", name = "f", descriptor = "Lclient!jga;")
	private Class4_Sub6 aClass4_Sub6_55;

	@OriginalMember(owner = "client!si", name = "k", descriptor = "[Lclient!jga;")
	private final Class4_Sub6[] aClass4_Sub6Array1;

	@OriginalMember(owner = "client!si", name = "g", descriptor = "I")
	private final int anInt9100;

	@OriginalMember(owner = "client!si", name = "<init>", descriptor = "(I)V")
	public Class303(@OriginalArg(0) int arg0) {
		this.aClass4_Sub6Array1 = new Class4_Sub6[arg0];
		this.anInt9100 = arg0;
		for (@Pc(10) int local10 = 0; local10 < arg0; local10++) {
			@Pc(20) Class4_Sub6 local20 = this.aClass4_Sub6Array1[local10] = new Class4_Sub6();
			local20.aClass4_Sub6_62 = local20;
			local20.aClass4_Sub6_61 = local20;
		}
	}

	@OriginalMember(owner = "client!si", name = "a", descriptor = "(I)Lclient!jga;")
	public Class4_Sub6 method6976() {
		if (this.aClass4_Sub6_55 == null) {
			return null;
		}
		@Pc(31) Class4_Sub6 local31 = this.aClass4_Sub6Array1[(int) (this.aLong253 & (long) (this.anInt9100 - 1))];
		while (this.aClass4_Sub6_55 != local31) {
			if (this.aLong253 == this.aClass4_Sub6_55.aLong286) {
				@Pc(43) Class4_Sub6 local43 = this.aClass4_Sub6_55;
				this.aClass4_Sub6_55 = this.aClass4_Sub6_55.aClass4_Sub6_62;
				return local43;
			}
			this.aClass4_Sub6_55 = this.aClass4_Sub6_55.aClass4_Sub6_62;
		}
		this.aClass4_Sub6_55 = null;
		return null;
	}

	@OriginalMember(owner = "client!si", name = "a", descriptor = "(Lclient!jga;IJ)V")
	public void method6977(@OriginalArg(0) Class4_Sub6 arg0, @OriginalArg(2) long arg1) {
		if (arg0.aClass4_Sub6_61 != null) {
			arg0.method7880();
		}
		@Pc(21) Class4_Sub6 local21 = this.aClass4_Sub6Array1[(int) (arg1 & (long) (this.anInt9100 - 1))];
		arg0.aClass4_Sub6_61 = local21.aClass4_Sub6_61;
		arg0.aClass4_Sub6_62 = local21;
		arg0.aClass4_Sub6_61.aClass4_Sub6_62 = arg0;
		arg0.aClass4_Sub6_62.aClass4_Sub6_61 = arg0;
		arg0.aLong286 = arg1;
	}

	@OriginalMember(owner = "client!si", name = "a", descriptor = "(JI)Lclient!jga;")
	public Class4_Sub6 method6978(@OriginalArg(0) long arg0) {
		this.aLong253 = arg0;
		@Pc(26) Class4_Sub6 local26 = this.aClass4_Sub6Array1[(int) (arg0 & (long) (this.anInt9100 - 1))];
		for (this.aClass4_Sub6_55 = local26.aClass4_Sub6_62; this.aClass4_Sub6_55 != local26; this.aClass4_Sub6_55 = this.aClass4_Sub6_55.aClass4_Sub6_62) {
			if (arg0 == this.aClass4_Sub6_55.aLong286) {
				@Pc(41) Class4_Sub6 local41 = this.aClass4_Sub6_55;
				this.aClass4_Sub6_55 = this.aClass4_Sub6_55.aClass4_Sub6_62;
				return local41;
			}
		}
		this.aClass4_Sub6_55 = null;
		return null;
	}
}
