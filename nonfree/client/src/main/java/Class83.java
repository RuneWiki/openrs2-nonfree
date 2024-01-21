import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!wf")
public final class Class83 {

	@OriginalMember(owner = "client!wf", name = "k", descriptor = "Lclient!rf;")
	private final Class5_Sub2 aClass5_Sub2_66 = new Class5_Sub2();

	@OriginalMember(owner = "client!wf", name = "<init>", descriptor = "()V")
	public Class83() {
		this.aClass5_Sub2_66.aClass5_Sub2_65 = this.aClass5_Sub2_66;
		this.aClass5_Sub2_66.aClass5_Sub2_64 = this.aClass5_Sub2_66;
	}

	@OriginalMember(owner = "client!wf", name = "a", descriptor = "(Z)Lclient!rf;")
	public Class5_Sub2 method2198() {
		@Pc(3) Class5_Sub2 local3 = this.aClass5_Sub2_66.aClass5_Sub2_65;
		return local3 == this.aClass5_Sub2_66 ? null : local3;
	}

	@OriginalMember(owner = "client!wf", name = "a", descriptor = "(I)Lclient!rf;")
	public Class5_Sub2 method2199() {
		@Pc(3) Class5_Sub2 local3 = this.aClass5_Sub2_66.aClass5_Sub2_65;
		if (local3 == this.aClass5_Sub2_66) {
			return null;
		} else {
			local3.method2172();
			return local3;
		}
	}

	@OriginalMember(owner = "client!wf", name = "a", descriptor = "(Lclient!rf;Z)V")
	public void method2201(@OriginalArg(0) Class5_Sub2 arg0) {
		if (arg0.aClass5_Sub2_64 != null) {
			arg0.method2172();
		}
		arg0.aClass5_Sub2_65 = this.aClass5_Sub2_66.aClass5_Sub2_65;
		arg0.aClass5_Sub2_64 = this.aClass5_Sub2_66;
		arg0.aClass5_Sub2_64.aClass5_Sub2_65 = arg0;
		arg0.aClass5_Sub2_65.aClass5_Sub2_64 = arg0;
	}

	@OriginalMember(owner = "client!wf", name = "b", descriptor = "(Lclient!rf;Z)V")
	public void method2202(@OriginalArg(0) Class5_Sub2 arg0) {
		if (arg0.aClass5_Sub2_64 != null) {
			arg0.method2172();
		}
		arg0.aClass5_Sub2_65 = this.aClass5_Sub2_66;
		arg0.aClass5_Sub2_64 = this.aClass5_Sub2_66.aClass5_Sub2_64;
		arg0.aClass5_Sub2_64.aClass5_Sub2_65 = arg0;
		arg0.aClass5_Sub2_65.aClass5_Sub2_64 = arg0;
	}
}
