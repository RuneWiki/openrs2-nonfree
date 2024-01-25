import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!pg")
public final class Class180 {

	@OriginalMember(owner = "client!pg", name = "j", descriptor = "Lclient!ag;")
	private Class7_Sub1 aClass7_Sub1_8;

	@OriginalMember(owner = "client!pg", name = "b", descriptor = "Lclient!ag;")
	public final Class7_Sub1 aClass7_Sub1_7 = new Class7_Sub1();

	@OriginalMember(owner = "client!pg", name = "<init>", descriptor = "()V")
	public Class180() {
		this.aClass7_Sub1_7.aClass7_Sub1_5 = this.aClass7_Sub1_7;
		this.aClass7_Sub1_7.aClass7_Sub1_6 = this.aClass7_Sub1_7;
	}

	@OriginalMember(owner = "client!pg", name = "a", descriptor = "(B)V")
	public void method4496() {
		while (true) {
			@Pc(5) Class7_Sub1 local5 = this.aClass7_Sub1_7.aClass7_Sub1_5;
			if (this.aClass7_Sub1_7 == local5) {
				this.aClass7_Sub1_8 = null;
				return;
			}
			local5.method373();
		}
	}

	@OriginalMember(owner = "client!pg", name = "b", descriptor = "(B)Lclient!ag;")
	public Class7_Sub1 method4497() {
		@Pc(6) Class7_Sub1 local6 = this.aClass7_Sub1_8;
		if (local6 == this.aClass7_Sub1_7) {
			this.aClass7_Sub1_8 = null;
			return null;
		} else {
			this.aClass7_Sub1_8 = local6.aClass7_Sub1_5;
			return local6;
		}
	}

	@OriginalMember(owner = "client!pg", name = "a", descriptor = "(ILclient!ag;)V")
	public void method4498(@OriginalArg(1) Class7_Sub1 arg0) {
		if (arg0.aClass7_Sub1_6 != null) {
			arg0.method373();
		}
		arg0.aClass7_Sub1_5 = this.aClass7_Sub1_7;
		arg0.aClass7_Sub1_6 = this.aClass7_Sub1_7.aClass7_Sub1_6;
		arg0.aClass7_Sub1_6.aClass7_Sub1_5 = arg0;
		arg0.aClass7_Sub1_5.aClass7_Sub1_6 = arg0;
	}

	@OriginalMember(owner = "client!pg", name = "c", descriptor = "(B)Lclient!ag;")
	public Class7_Sub1 method4500() {
		@Pc(7) Class7_Sub1 local7 = this.aClass7_Sub1_7.aClass7_Sub1_5;
		if (this.aClass7_Sub1_7 == local7) {
			this.aClass7_Sub1_8 = null;
			return null;
		} else {
			this.aClass7_Sub1_8 = local7.aClass7_Sub1_5;
			return local7;
		}
	}
}
