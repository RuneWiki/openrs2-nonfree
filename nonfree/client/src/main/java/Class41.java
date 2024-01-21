import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!kb")
public final class Class41 {

	@OriginalMember(owner = "client!kb", name = "t", descriptor = "Lclient!jd;")
	private final Class3_Sub1 aClass3_Sub1_35 = new Class3_Sub1();

	@OriginalMember(owner = "client!kb", name = "<init>", descriptor = "()V")
	public Class41() {
		this.aClass3_Sub1_35.aClass3_Sub1_64 = this.aClass3_Sub1_35;
		this.aClass3_Sub1_35.aClass3_Sub1_63 = this.aClass3_Sub1_35;
	}

	@OriginalMember(owner = "client!kb", name = "a", descriptor = "(B)Lclient!jd;")
	public Class3_Sub1 method1067() {
		@Pc(3) Class3_Sub1 local3 = this.aClass3_Sub1_35.aClass3_Sub1_63;
		return local3 == this.aClass3_Sub1_35 ? null : local3;
	}

	@OriginalMember(owner = "client!kb", name = "b", descriptor = "(I)Lclient!jd;")
	public Class3_Sub1 method1070() {
		@Pc(12) Class3_Sub1 local12 = this.aClass3_Sub1_35.aClass3_Sub1_63;
		if (this.aClass3_Sub1_35 == local12) {
			return null;
		} else {
			local12.method1956();
			return local12;
		}
	}

	@OriginalMember(owner = "client!kb", name = "a", descriptor = "(ILclient!jd;)V")
	public void method1072(@OriginalArg(1) Class3_Sub1 arg0) {
		if (arg0.aClass3_Sub1_64 != null) {
			arg0.method1956();
		}
		arg0.aClass3_Sub1_63 = this.aClass3_Sub1_35;
		arg0.aClass3_Sub1_64 = this.aClass3_Sub1_35.aClass3_Sub1_64;
		arg0.aClass3_Sub1_64.aClass3_Sub1_63 = arg0;
		arg0.aClass3_Sub1_63.aClass3_Sub1_64 = arg0;
	}

	@OriginalMember(owner = "client!kb", name = "a", descriptor = "(Lclient!jd;I)V")
	public void method1073(@OriginalArg(0) Class3_Sub1 arg0) {
		if (arg0.aClass3_Sub1_64 != null) {
			arg0.method1956();
		}
		arg0.aClass3_Sub1_64 = this.aClass3_Sub1_35;
		arg0.aClass3_Sub1_63 = this.aClass3_Sub1_35.aClass3_Sub1_63;
		arg0.aClass3_Sub1_64.aClass3_Sub1_63 = arg0;
		arg0.aClass3_Sub1_63.aClass3_Sub1_64 = arg0;
	}
}
