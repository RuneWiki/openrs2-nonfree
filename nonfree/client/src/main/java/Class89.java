import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!sf")
public final class Class89 {

	@OriginalMember(owner = "client!sf", name = "h", descriptor = "Lclient!me;")
	private Class2_Sub2 aClass2_Sub2_48 = new Class2_Sub2();

	@OriginalMember(owner = "client!sf", name = "<init>", descriptor = "()V")
	public Class89() {
		this.aClass2_Sub2_48.aClass2_Sub2_65 = this.aClass2_Sub2_48;
		this.aClass2_Sub2_48.aClass2_Sub2_66 = this.aClass2_Sub2_48;
	}

	@OriginalMember(owner = "client!sf", name = "a", descriptor = "(I)Lclient!me;")
	public Class2_Sub2 method2843() {
		@Pc(12) Class2_Sub2 local12 = this.aClass2_Sub2_48.aClass2_Sub2_65;
		return local12 == this.aClass2_Sub2_48 ? null : local12;
	}

	@OriginalMember(owner = "client!sf", name = "b", descriptor = "(I)Lclient!me;")
	public Class2_Sub2 method2844() {
		@Pc(7) Class2_Sub2 local7 = this.aClass2_Sub2_48.aClass2_Sub2_65;
		if (local7 == this.aClass2_Sub2_48) {
			return null;
		} else {
			local7.method3320();
			return local7;
		}
	}

	@OriginalMember(owner = "client!sf", name = "a", descriptor = "(ILclient!me;)V")
	public void method2849(@OriginalArg(1) Class2_Sub2 arg0) {
		if (arg0.aClass2_Sub2_66 != null) {
			arg0.method3320();
		}
		arg0.aClass2_Sub2_65 = this.aClass2_Sub2_48;
		arg0.aClass2_Sub2_66 = this.aClass2_Sub2_48.aClass2_Sub2_66;
		arg0.aClass2_Sub2_66.aClass2_Sub2_65 = arg0;
		arg0.aClass2_Sub2_65.aClass2_Sub2_66 = arg0;
	}

	@OriginalMember(owner = "client!sf", name = "a", descriptor = "(Lclient!me;B)V")
	public void method2850(@OriginalArg(0) Class2_Sub2 arg0) {
		if (arg0.aClass2_Sub2_66 != null) {
			arg0.method3320();
		}
		arg0.aClass2_Sub2_66 = this.aClass2_Sub2_48;
		arg0.aClass2_Sub2_65 = this.aClass2_Sub2_48.aClass2_Sub2_65;
		arg0.aClass2_Sub2_66.aClass2_Sub2_65 = arg0;
		arg0.aClass2_Sub2_65.aClass2_Sub2_66 = arg0;
	}
}
