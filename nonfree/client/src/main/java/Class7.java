import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ba")
public final class Class7 {

	@OriginalMember(owner = "client!ba", name = "g", descriptor = "Lclient!df;")
	private final Class4_Sub2 aClass4_Sub2_7 = new Class4_Sub2();

	@OriginalMember(owner = "client!ba", name = "<init>", descriptor = "()V")
	public Class7() {
		this.aClass4_Sub2_7.aClass4_Sub2_63 = this.aClass4_Sub2_7;
		this.aClass4_Sub2_7.aClass4_Sub2_64 = this.aClass4_Sub2_7;
	}

	@OriginalMember(owner = "client!ba", name = "a", descriptor = "(I)Lclient!df;")
	public Class4_Sub2 method180() {
		@Pc(3) Class4_Sub2 local3 = this.aClass4_Sub2_7.aClass4_Sub2_64;
		if (local3 == this.aClass4_Sub2_7) {
			return null;
		} else {
			local3.method2201();
			return local3;
		}
	}

	@OriginalMember(owner = "client!ba", name = "a", descriptor = "(ILclient!df;)V")
	public void method181(@OriginalArg(1) Class4_Sub2 arg0) {
		if (arg0.aClass4_Sub2_63 != null) {
			arg0.method2201();
		}
		arg0.aClass4_Sub2_63 = this.aClass4_Sub2_7.aClass4_Sub2_63;
		arg0.aClass4_Sub2_64 = this.aClass4_Sub2_7;
		arg0.aClass4_Sub2_63.aClass4_Sub2_64 = arg0;
		arg0.aClass4_Sub2_64.aClass4_Sub2_63 = arg0;
	}

	@OriginalMember(owner = "client!ba", name = "a", descriptor = "(Z)Lclient!df;")
	public Class4_Sub2 method182() {
		@Pc(7) Class4_Sub2 local7 = this.aClass4_Sub2_7.aClass4_Sub2_64;
		return local7 == this.aClass4_Sub2_7 ? null : local7;
	}

	@OriginalMember(owner = "client!ba", name = "b", descriptor = "(ILclient!df;)V")
	public void method185(@OriginalArg(1) Class4_Sub2 arg0) {
		if (arg0.aClass4_Sub2_63 != null) {
			arg0.method2201();
		}
		arg0.aClass4_Sub2_63 = this.aClass4_Sub2_7;
		arg0.aClass4_Sub2_64 = this.aClass4_Sub2_7.aClass4_Sub2_64;
		arg0.aClass4_Sub2_63.aClass4_Sub2_64 = arg0;
		arg0.aClass4_Sub2_64.aClass4_Sub2_63 = arg0;
	}
}
