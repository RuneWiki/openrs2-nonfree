import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!g")
public final class Class28 {

	@OriginalMember(owner = "client!g", name = "n", descriptor = "Lclient!mf;")
	private final Class2_Sub1 aClass2_Sub1_29 = new Class2_Sub1();

	@OriginalMember(owner = "client!g", name = "<init>", descriptor = "()V")
	public Class28() {
		this.aClass2_Sub1_29.aClass2_Sub1_69 = this.aClass2_Sub1_29;
		this.aClass2_Sub1_29.aClass2_Sub1_70 = this.aClass2_Sub1_29;
	}

	@OriginalMember(owner = "client!g", name = "a", descriptor = "(Z)Lclient!mf;")
	public Class2_Sub1 method947() {
		@Pc(7) Class2_Sub1 local7 = this.aClass2_Sub1_29.aClass2_Sub1_69;
		return local7 == this.aClass2_Sub1_29 ? null : local7;
	}

	@OriginalMember(owner = "client!g", name = "a", descriptor = "(B)Lclient!mf;")
	public Class2_Sub1 method948() {
		@Pc(12) Class2_Sub1 local12 = this.aClass2_Sub1_29.aClass2_Sub1_69;
		if (this.aClass2_Sub1_29 == local12) {
			return null;
		} else {
			local12.method2540();
			return local12;
		}
	}

	@OriginalMember(owner = "client!g", name = "a", descriptor = "(Lclient!mf;I)V")
	public void method950(@OriginalArg(0) Class2_Sub1 arg0) {
		if (arg0.aClass2_Sub1_70 != null) {
			arg0.method2540();
		}
		arg0.aClass2_Sub1_70 = this.aClass2_Sub1_29;
		arg0.aClass2_Sub1_69 = this.aClass2_Sub1_29.aClass2_Sub1_69;
		arg0.aClass2_Sub1_70.aClass2_Sub1_69 = arg0;
		arg0.aClass2_Sub1_69.aClass2_Sub1_70 = arg0;
	}

	@OriginalMember(owner = "client!g", name = "a", descriptor = "(BLclient!mf;)V")
	public void method951(@OriginalArg(1) Class2_Sub1 arg0) {
		if (arg0.aClass2_Sub1_70 != null) {
			arg0.method2540();
		}
		arg0.aClass2_Sub1_70 = this.aClass2_Sub1_29.aClass2_Sub1_70;
		arg0.aClass2_Sub1_69 = this.aClass2_Sub1_29;
		arg0.aClass2_Sub1_70.aClass2_Sub1_69 = arg0;
		arg0.aClass2_Sub1_69.aClass2_Sub1_70 = arg0;
	}
}
