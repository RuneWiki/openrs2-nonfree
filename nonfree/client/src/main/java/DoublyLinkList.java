import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ve")
public final class Class78 {

	@OriginalMember(owner = "client!ve", name = "d", descriptor = "Lclient!be;")
	private final Class4_Sub1 aClass4_Sub1_66 = new Class4_Sub1();

	@OriginalMember(owner = "client!ve", name = "<init>", descriptor = "()V")
	public Class78() {
		this.aClass4_Sub1_66.aClass4_Sub1_65 = this.aClass4_Sub1_66;
		this.aClass4_Sub1_66.aClass4_Sub1_64 = this.aClass4_Sub1_66;
	}

	@OriginalMember(owner = "client!ve", name = "a", descriptor = "(BLclient!be;)V")
	public void method1972(@OriginalArg(1) Class4_Sub1 arg0) {
		if (arg0.aClass4_Sub1_65 != null) {
			arg0.method1906();
		}
		arg0.aClass4_Sub1_65 = this.aClass4_Sub1_66;
		arg0.aClass4_Sub1_64 = this.aClass4_Sub1_66.aClass4_Sub1_64;
		arg0.aClass4_Sub1_65.aClass4_Sub1_64 = arg0;
		arg0.aClass4_Sub1_64.aClass4_Sub1_65 = arg0;
	}

	@OriginalMember(owner = "client!ve", name = "a", descriptor = "(B)Lclient!be;")
	public Class4_Sub1 method1974() {
		@Pc(3) Class4_Sub1 local3 = this.aClass4_Sub1_66.aClass4_Sub1_64;
		return this.aClass4_Sub1_66 == local3 ? null : local3;
	}

	@OriginalMember(owner = "client!ve", name = "a", descriptor = "(Lclient!be;I)V")
	public void method1975(@OriginalArg(0) Class4_Sub1 arg0) {
		if (arg0.aClass4_Sub1_65 != null) {
			arg0.method1906();
		}
		arg0.aClass4_Sub1_64 = this.aClass4_Sub1_66;
		arg0.aClass4_Sub1_65 = this.aClass4_Sub1_66.aClass4_Sub1_65;
		arg0.aClass4_Sub1_65.aClass4_Sub1_64 = arg0;
		arg0.aClass4_Sub1_64.aClass4_Sub1_65 = arg0;
	}

	@OriginalMember(owner = "client!ve", name = "a", descriptor = "(I)Lclient!be;")
	public Class4_Sub1 method1977() {
		@Pc(3) Class4_Sub1 local3 = this.aClass4_Sub1_66.aClass4_Sub1_64;
		if (local3 == this.aClass4_Sub1_66) {
			return null;
		} else {
			local3.method1906();
			return local3;
		}
	}
}
