import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!b")
public final class Class6 {

	@OriginalMember(owner = "client!b", name = "k", descriptor = "Lclient!ta;")
	private final Class5_Sub1 aClass5_Sub1_9 = new Class5_Sub1();

	@OriginalMember(owner = "client!b", name = "<init>", descriptor = "()V")
	public Class6() {
		this.aClass5_Sub1_9.aClass5_Sub1_65 = this.aClass5_Sub1_9;
		this.aClass5_Sub1_9.aClass5_Sub1_66 = this.aClass5_Sub1_9;
	}

	@OriginalMember(owner = "client!b", name = "a", descriptor = "(B)Lclient!ta;")
	public Class5_Sub1 method153() {
		@Pc(7) Class5_Sub1 local7 = this.aClass5_Sub1_9.aClass5_Sub1_65;
		if (local7 == this.aClass5_Sub1_9) {
			return null;
		} else {
			local7.method2009();
			return local7;
		}
	}

	@OriginalMember(owner = "client!b", name = "a", descriptor = "(Lclient!ta;I)V")
	public void method155(@OriginalArg(0) Class5_Sub1 arg0) {
		if (arg0.aClass5_Sub1_66 != null) {
			arg0.method2009();
		}
		arg0.aClass5_Sub1_66 = this.aClass5_Sub1_9.aClass5_Sub1_66;
		arg0.aClass5_Sub1_65 = this.aClass5_Sub1_9;
		arg0.aClass5_Sub1_66.aClass5_Sub1_65 = arg0;
		arg0.aClass5_Sub1_65.aClass5_Sub1_66 = arg0;
	}

	@OriginalMember(owner = "client!b", name = "b", descriptor = "(B)Lclient!ta;")
	public Class5_Sub1 method157() {
		@Pc(12) Class5_Sub1 local12 = this.aClass5_Sub1_9.aClass5_Sub1_65;
		return local12 == this.aClass5_Sub1_9 ? null : local12;
	}

	@OriginalMember(owner = "client!b", name = "a", descriptor = "(Lclient!ta;B)V")
	public void method158(@OriginalArg(0) Class5_Sub1 arg0) {
		if (arg0.aClass5_Sub1_66 != null) {
			arg0.method2009();
		}
		arg0.aClass5_Sub1_65 = this.aClass5_Sub1_9.aClass5_Sub1_65;
		arg0.aClass5_Sub1_66 = this.aClass5_Sub1_9;
		arg0.aClass5_Sub1_66.aClass5_Sub1_65 = arg0;
		arg0.aClass5_Sub1_65.aClass5_Sub1_66 = arg0;
	}
}
