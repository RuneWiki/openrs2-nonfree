import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!vt")
public final class Class262 {

	@OriginalMember(owner = "client!vt", name = "n", descriptor = "Lclient!wc;")
	private Class1_Sub1 aClass1_Sub1_54;

	@OriginalMember(owner = "client!vt", name = "j", descriptor = "Lclient!wc;")
	private final Class1_Sub1 aClass1_Sub1_53 = new Class1_Sub1();

	@OriginalMember(owner = "client!vt", name = "<init>", descriptor = "()V")
	public Class262() {
		this.aClass1_Sub1_53.aClass1_Sub1_57 = this.aClass1_Sub1_53;
		this.aClass1_Sub1_53.aClass1_Sub1_58 = this.aClass1_Sub1_53;
	}

	@OriginalMember(owner = "client!vt", name = "a", descriptor = "(I)I")
	public int method5874() {
		@Pc(7) int local7 = 0;
		for (@Pc(16) Class1_Sub1 local16 = this.aClass1_Sub1_53.aClass1_Sub1_58; local16 != this.aClass1_Sub1_53; local16 = local16.aClass1_Sub1_58) {
			local7++;
		}
		return local7;
	}

	@OriginalMember(owner = "client!vt", name = "b", descriptor = "(I)V")
	public void method5875() {
		while (true) {
			@Pc(10) Class1_Sub1 local10 = this.aClass1_Sub1_53.aClass1_Sub1_58;
			if (this.aClass1_Sub1_53 == local10) {
				this.aClass1_Sub1_54 = null;
				return;
			}
			local10.method6125();
		}
	}

	@OriginalMember(owner = "client!vt", name = "a", descriptor = "(Lclient!wc;I)V")
	public void method5876(@OriginalArg(0) Class1_Sub1 arg0) {
		if (arg0.aClass1_Sub1_57 != null) {
			arg0.method6125();
		}
		arg0.aClass1_Sub1_58 = this.aClass1_Sub1_53;
		arg0.aClass1_Sub1_57 = this.aClass1_Sub1_53.aClass1_Sub1_57;
		arg0.aClass1_Sub1_57.aClass1_Sub1_58 = arg0;
		arg0.aClass1_Sub1_58.aClass1_Sub1_57 = arg0;
	}

	@OriginalMember(owner = "client!vt", name = "c", descriptor = "(I)Lclient!wc;")
	public Class1_Sub1 method5879() {
		@Pc(6) Class1_Sub1 local6 = this.aClass1_Sub1_54;
		if (local6 == this.aClass1_Sub1_53) {
			this.aClass1_Sub1_54 = null;
			return null;
		} else {
			this.aClass1_Sub1_54 = local6.aClass1_Sub1_58;
			return local6;
		}
	}

	@OriginalMember(owner = "client!vt", name = "d", descriptor = "(I)Lclient!wc;")
	public Class1_Sub1 method5880() {
		@Pc(12) Class1_Sub1 local12 = this.aClass1_Sub1_53.aClass1_Sub1_58;
		if (this.aClass1_Sub1_53 == local12) {
			return null;
		} else {
			local12.method6125();
			return local12;
		}
	}

	@OriginalMember(owner = "client!vt", name = "f", descriptor = "(I)Lclient!wc;")
	public Class1_Sub1 method5882() {
		@Pc(13) Class1_Sub1 local13 = this.aClass1_Sub1_53.aClass1_Sub1_58;
		if (local13 == this.aClass1_Sub1_53) {
			this.aClass1_Sub1_54 = null;
			return null;
		} else {
			this.aClass1_Sub1_54 = local13.aClass1_Sub1_58;
			return local13;
		}
	}
}
