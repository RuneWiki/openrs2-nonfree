import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!mq")
public final class Class163 {

	@OriginalMember(owner = "client!mq", name = "h", descriptor = "Lclient!jq;")
	private Class1_Sub3 aClass1_Sub3_44;

	@OriginalMember(owner = "client!mq", name = "b", descriptor = "Lclient!jq;")
	private final Class1_Sub3 aClass1_Sub3_43 = new Class1_Sub3();

	@OriginalMember(owner = "client!mq", name = "<init>", descriptor = "()V")
	public Class163() {
		this.aClass1_Sub3_43.aClass1_Sub3_58 = this.aClass1_Sub3_43;
		this.aClass1_Sub3_43.aClass1_Sub3_57 = this.aClass1_Sub3_43;
	}

	@OriginalMember(owner = "client!mq", name = "a", descriptor = "(B)Lclient!jq;")
	public Class1_Sub3 method3654() {
		@Pc(7) Class1_Sub3 local7 = this.aClass1_Sub3_43.aClass1_Sub3_57;
		if (this.aClass1_Sub3_43 == local7) {
			return null;
		} else {
			local7.method5941();
			return local7;
		}
	}

	@OriginalMember(owner = "client!mq", name = "b", descriptor = "(B)Lclient!jq;")
	public Class1_Sub3 method3655() {
		@Pc(11) Class1_Sub3 local11 = this.aClass1_Sub3_44;
		if (local11 == this.aClass1_Sub3_43) {
			this.aClass1_Sub3_44 = null;
			return null;
		} else {
			this.aClass1_Sub3_44 = local11.aClass1_Sub3_57;
			return local11;
		}
	}

	@OriginalMember(owner = "client!mq", name = "a", descriptor = "(I)I")
	public int method3656() {
		@Pc(7) int local7 = 0;
		for (@Pc(16) Class1_Sub3 local16 = this.aClass1_Sub3_43.aClass1_Sub3_57; local16 != this.aClass1_Sub3_43; local16 = local16.aClass1_Sub3_57) {
			local7++;
		}
		return local7;
	}

	@OriginalMember(owner = "client!mq", name = "a", descriptor = "(Lclient!jq;Z)V")
	public void method3657(@OriginalArg(0) Class1_Sub3 arg0) {
		if (arg0.aClass1_Sub3_58 != null) {
			arg0.method5941();
		}
		arg0.aClass1_Sub3_57 = this.aClass1_Sub3_43;
		arg0.aClass1_Sub3_58 = this.aClass1_Sub3_43.aClass1_Sub3_58;
		arg0.aClass1_Sub3_58.aClass1_Sub3_57 = arg0;
		arg0.aClass1_Sub3_57.aClass1_Sub3_58 = arg0;
	}

	@OriginalMember(owner = "client!mq", name = "b", descriptor = "(I)Lclient!jq;")
	public Class1_Sub3 method3658() {
		@Pc(7) Class1_Sub3 local7 = this.aClass1_Sub3_43.aClass1_Sub3_57;
		if (local7 == this.aClass1_Sub3_43) {
			this.aClass1_Sub3_44 = null;
			return null;
		} else {
			this.aClass1_Sub3_44 = local7.aClass1_Sub3_57;
			return local7;
		}
	}

	@OriginalMember(owner = "client!mq", name = "c", descriptor = "(B)V")
	public void method3659() {
		while (true) {
			@Pc(13) Class1_Sub3 local13 = this.aClass1_Sub3_43.aClass1_Sub3_57;
			if (local13 == this.aClass1_Sub3_43) {
				this.aClass1_Sub3_44 = null;
				return;
			}
			local13.method5941();
		}
	}
}
