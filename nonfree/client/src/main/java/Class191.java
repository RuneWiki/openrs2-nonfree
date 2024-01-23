import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!wl")
public final class Class191 {

	@OriginalMember(owner = "client!wl", name = "k", descriptor = "Lclient!mc;")
	private Class22_Sub1 aClass22_Sub1_6;

	@OriginalMember(owner = "client!wl", name = "h", descriptor = "Lclient!mc;")
	public Class22_Sub1 aClass22_Sub1_5 = new Class22_Sub1();

	@OriginalMember(owner = "client!wl", name = "<init>", descriptor = "()V")
	public Class191() {
		this.aClass22_Sub1_5.aClass22_Sub1_4 = this.aClass22_Sub1_5;
		this.aClass22_Sub1_5.aClass22_Sub1_3 = this.aClass22_Sub1_5;
	}

	@OriginalMember(owner = "client!wl", name = "a", descriptor = "(BLclient!mc;)V")
	public void method4659(@OriginalArg(1) Class22_Sub1 arg0) {
		if (arg0.aClass22_Sub1_4 != null) {
			arg0.method599();
		}
		arg0.aClass22_Sub1_3 = this.aClass22_Sub1_5;
		arg0.aClass22_Sub1_4 = this.aClass22_Sub1_5.aClass22_Sub1_4;
		arg0.aClass22_Sub1_4.aClass22_Sub1_3 = arg0;
		arg0.aClass22_Sub1_3.aClass22_Sub1_4 = arg0;
	}

	@OriginalMember(owner = "client!wl", name = "b", descriptor = "(I)Lclient!mc;")
	public Class22_Sub1 method4664() {
		@Pc(7) Class22_Sub1 local7 = this.aClass22_Sub1_5.aClass22_Sub1_3;
		if (local7 == this.aClass22_Sub1_5) {
			this.aClass22_Sub1_6 = null;
			return null;
		} else {
			this.aClass22_Sub1_6 = local7.aClass22_Sub1_3;
			return local7;
		}
	}

	@OriginalMember(owner = "client!wl", name = "c", descriptor = "(I)V")
	public void method4665() {
		while (true) {
			@Pc(5) Class22_Sub1 local5 = this.aClass22_Sub1_5.aClass22_Sub1_3;
			if (local5 == this.aClass22_Sub1_5) {
				this.aClass22_Sub1_6 = null;
				return;
			}
			local5.method599();
		}
	}

	@OriginalMember(owner = "client!wl", name = "e", descriptor = "(I)Lclient!mc;")
	public Class22_Sub1 method4667() {
		@Pc(6) Class22_Sub1 local6 = this.aClass22_Sub1_6;
		if (local6 == this.aClass22_Sub1_5) {
			this.aClass22_Sub1_6 = null;
			return null;
		} else {
			this.aClass22_Sub1_6 = local6.aClass22_Sub1_3;
			return local6;
		}
	}
}
