import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!is")
public final class Class104 {

	@OriginalMember(owner = "client!is", name = "q", descriptor = "Lclient!ea;")
	private Class10_Sub3 aClass10_Sub3_8;

	@OriginalMember(owner = "client!is", name = "i", descriptor = "Lclient!ea;")
	public final Class10_Sub3 aClass10_Sub3_7 = new Class10_Sub3();

	@OriginalMember(owner = "client!is", name = "<init>", descriptor = "()V")
	public Class104() {
		this.aClass10_Sub3_7.aClass10_Sub3_6 = this.aClass10_Sub3_7;
		this.aClass10_Sub3_7.aClass10_Sub3_5 = this.aClass10_Sub3_7;
	}

	@OriginalMember(owner = "client!is", name = "a", descriptor = "(ILclient!ea;)V")
	public void method2129(@OriginalArg(1) Class10_Sub3 arg0) {
		if (arg0.aClass10_Sub3_5 != null) {
			arg0.method1706();
		}
		arg0.aClass10_Sub3_5 = this.aClass10_Sub3_7.aClass10_Sub3_5;
		arg0.aClass10_Sub3_6 = this.aClass10_Sub3_7;
		arg0.aClass10_Sub3_5.aClass10_Sub3_6 = arg0;
		arg0.aClass10_Sub3_6.aClass10_Sub3_5 = arg0;
	}

	@OriginalMember(owner = "client!is", name = "a", descriptor = "(I)V")
	public void method2130() {
		while (true) {
			@Pc(17) Class10_Sub3 local17 = this.aClass10_Sub3_7.aClass10_Sub3_6;
			if (local17 == this.aClass10_Sub3_7) {
				this.aClass10_Sub3_8 = null;
				return;
			}
			local17.method1706();
		}
	}

	@OriginalMember(owner = "client!is", name = "a", descriptor = "(B)Lclient!ea;")
	public Class10_Sub3 method2132() {
		@Pc(7) Class10_Sub3 local7 = this.aClass10_Sub3_7.aClass10_Sub3_6;
		if (this.aClass10_Sub3_7 == local7) {
			this.aClass10_Sub3_8 = null;
			return null;
		} else {
			this.aClass10_Sub3_8 = local7.aClass10_Sub3_6;
			return local7;
		}
	}

	@OriginalMember(owner = "client!is", name = "c", descriptor = "(I)Lclient!ea;")
	public Class10_Sub3 method2137() {
		@Pc(6) Class10_Sub3 local6 = this.aClass10_Sub3_8;
		if (local6 == this.aClass10_Sub3_7) {
			this.aClass10_Sub3_8 = null;
			return null;
		} else {
			this.aClass10_Sub3_8 = local6.aClass10_Sub3_6;
			return local6;
		}
	}
}
