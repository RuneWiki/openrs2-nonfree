import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!n")
public final class Class55 {

	@OriginalMember(owner = "client!n", name = "l", descriptor = "Lclient!rg;")
	private final Class2_Sub1 aClass2_Sub1_57 = new Class2_Sub1();

	@OriginalMember(owner = "client!n", name = "<init>", descriptor = "()V")
	public Class55() {
		this.aClass2_Sub1_57.aClass2_Sub1_73 = this.aClass2_Sub1_57;
		this.aClass2_Sub1_57.aClass2_Sub1_72 = this.aClass2_Sub1_57;
	}

	@OriginalMember(owner = "client!n", name = "a", descriptor = "(Lclient!rg;I)V")
	public void method2524(@OriginalArg(0) Class2_Sub1 arg0) {
		if (arg0.aClass2_Sub1_72 != null) {
			arg0.method3415();
		}
		arg0.aClass2_Sub1_73 = this.aClass2_Sub1_57.aClass2_Sub1_73;
		arg0.aClass2_Sub1_72 = this.aClass2_Sub1_57;
		arg0.aClass2_Sub1_72.aClass2_Sub1_73 = arg0;
		arg0.aClass2_Sub1_73.aClass2_Sub1_72 = arg0;
	}

	@OriginalMember(owner = "client!n", name = "a", descriptor = "(I)Lclient!rg;")
	public Class2_Sub1 method2526() {
		@Pc(14) Class2_Sub1 local14 = this.aClass2_Sub1_57.aClass2_Sub1_73;
		return local14 == this.aClass2_Sub1_57 ? null : local14;
	}

	@OriginalMember(owner = "client!n", name = "a", descriptor = "(BLclient!rg;)V")
	public void method2528(@OriginalArg(1) Class2_Sub1 arg0) {
		if (arg0.aClass2_Sub1_72 != null) {
			arg0.method3415();
		}
		arg0.aClass2_Sub1_72 = this.aClass2_Sub1_57.aClass2_Sub1_72;
		arg0.aClass2_Sub1_73 = this.aClass2_Sub1_57;
		arg0.aClass2_Sub1_72.aClass2_Sub1_73 = arg0;
		arg0.aClass2_Sub1_73.aClass2_Sub1_72 = arg0;
	}

	@OriginalMember(owner = "client!n", name = "a", descriptor = "(B)Lclient!rg;")
	public Class2_Sub1 method2530() {
		@Pc(7) Class2_Sub1 local7 = this.aClass2_Sub1_57.aClass2_Sub1_73;
		if (this.aClass2_Sub1_57 == local7) {
			return null;
		} else {
			local7.method3415();
			return local7;
		}
	}
}
