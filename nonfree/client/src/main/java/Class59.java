import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ob")
public final class Class59 {

	@OriginalMember(owner = "client!ob", name = "j", descriptor = "Lclient!kf;")
	private final Class4_Sub3 aClass4_Sub3_40 = new Class4_Sub3();

	@OriginalMember(owner = "client!ob", name = "<init>", descriptor = "()V")
	public Class59() {
		this.aClass4_Sub3_40.aClass4_Sub3_65 = this.aClass4_Sub3_40;
		this.aClass4_Sub3_40.aClass4_Sub3_66 = this.aClass4_Sub3_40;
	}

	@OriginalMember(owner = "client!ob", name = "a", descriptor = "(Lclient!kf;B)V")
	public void method1284(@OriginalArg(0) Class4_Sub3 arg0) {
		if (arg0.aClass4_Sub3_66 != null) {
			arg0.method1996();
		}
		arg0.aClass4_Sub3_65 = this.aClass4_Sub3_40.aClass4_Sub3_65;
		arg0.aClass4_Sub3_66 = this.aClass4_Sub3_40;
		arg0.aClass4_Sub3_66.aClass4_Sub3_65 = arg0;
		arg0.aClass4_Sub3_65.aClass4_Sub3_66 = arg0;
	}

	@OriginalMember(owner = "client!ob", name = "a", descriptor = "(I)Lclient!kf;")
	public Class4_Sub3 method1285() {
		@Pc(15) Class4_Sub3 local15 = this.aClass4_Sub3_40.aClass4_Sub3_65;
		return this.aClass4_Sub3_40 == local15 ? null : local15;
	}

	@OriginalMember(owner = "client!ob", name = "a", descriptor = "(B)Lclient!kf;")
	public Class4_Sub3 method1286() {
		@Pc(7) Class4_Sub3 local7 = this.aClass4_Sub3_40.aClass4_Sub3_65;
		if (local7 == this.aClass4_Sub3_40) {
			return null;
		} else {
			local7.method1996();
			return local7;
		}
	}

	@OriginalMember(owner = "client!ob", name = "a", descriptor = "(Lclient!kf;I)V")
	public void method1290(@OriginalArg(0) Class4_Sub3 arg0) {
		if (arg0.aClass4_Sub3_66 != null) {
			arg0.method1996();
		}
		arg0.aClass4_Sub3_65 = this.aClass4_Sub3_40;
		arg0.aClass4_Sub3_66 = this.aClass4_Sub3_40.aClass4_Sub3_66;
		arg0.aClass4_Sub3_66.aClass4_Sub3_65 = arg0;
		arg0.aClass4_Sub3_65.aClass4_Sub3_66 = arg0;
	}
}
