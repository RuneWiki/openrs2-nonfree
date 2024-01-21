import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ea")
public final class Class22 {

	@OriginalMember(owner = "client!ea", name = "d", descriptor = "Lclient!r;")
	private final Class1_Sub2 aClass1_Sub2_21 = new Class1_Sub2();

	@OriginalMember(owner = "client!ea", name = "<init>", descriptor = "()V")
	public Class22() {
		this.aClass1_Sub2_21.aClass1_Sub2_65 = this.aClass1_Sub2_21;
		this.aClass1_Sub2_21.aClass1_Sub2_66 = this.aClass1_Sub2_21;
	}

	@OriginalMember(owner = "client!ea", name = "a", descriptor = "(I)Lclient!r;")
	public Class1_Sub2 method722() {
		@Pc(7) Class1_Sub2 local7 = this.aClass1_Sub2_21.aClass1_Sub2_65;
		return local7 == this.aClass1_Sub2_21 ? null : local7;
	}

	@OriginalMember(owner = "client!ea", name = "b", descriptor = "(Z)Lclient!r;")
	public Class1_Sub2 method723() {
		@Pc(12) Class1_Sub2 local12 = this.aClass1_Sub2_21.aClass1_Sub2_65;
		if (this.aClass1_Sub2_21 == local12) {
			return null;
		} else {
			local12.method3229();
			return local12;
		}
	}

	@OriginalMember(owner = "client!ea", name = "a", descriptor = "(BLclient!r;)V")
	public void method724(@OriginalArg(1) Class1_Sub2 arg0) {
		if (arg0.aClass1_Sub2_66 != null) {
			arg0.method3229();
		}
		arg0.aClass1_Sub2_65 = this.aClass1_Sub2_21.aClass1_Sub2_65;
		arg0.aClass1_Sub2_66 = this.aClass1_Sub2_21;
		arg0.aClass1_Sub2_66.aClass1_Sub2_65 = arg0;
		arg0.aClass1_Sub2_65.aClass1_Sub2_66 = arg0;
	}

	@OriginalMember(owner = "client!ea", name = "a", descriptor = "(ILclient!r;)V")
	public void method725(@OriginalArg(1) Class1_Sub2 arg0) {
		if (arg0.aClass1_Sub2_66 != null) {
			arg0.method3229();
		}
		arg0.aClass1_Sub2_66 = this.aClass1_Sub2_21.aClass1_Sub2_66;
		arg0.aClass1_Sub2_65 = this.aClass1_Sub2_21;
		arg0.aClass1_Sub2_66.aClass1_Sub2_65 = arg0;
		arg0.aClass1_Sub2_65.aClass1_Sub2_66 = arg0;
	}
}
