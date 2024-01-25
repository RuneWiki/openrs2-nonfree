import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!so")
public final class Class225 {

	@OriginalMember(owner = "client!so", name = "k", descriptor = "Lclient!jn;")
	private Class1_Sub5 aClass1_Sub5_52;

	@OriginalMember(owner = "client!so", name = "d", descriptor = "Lclient!jn;")
	private final Class1_Sub5 aClass1_Sub5_51 = new Class1_Sub5();

	@OriginalMember(owner = "client!so", name = "<init>", descriptor = "()V")
	public Class225() {
		this.aClass1_Sub5_51.aClass1_Sub5_58 = this.aClass1_Sub5_51;
		this.aClass1_Sub5_51.aClass1_Sub5_57 = this.aClass1_Sub5_51;
	}

	@OriginalMember(owner = "client!so", name = "a", descriptor = "(I)Lclient!jn;")
	public Class1_Sub5 method4937() {
		@Pc(6) Class1_Sub5 local6 = this.aClass1_Sub5_52;
		if (local6 == this.aClass1_Sub5_51) {
			this.aClass1_Sub5_52 = null;
			return null;
		} else {
			this.aClass1_Sub5_52 = local6.aClass1_Sub5_57;
			return local6;
		}
	}

	@OriginalMember(owner = "client!so", name = "b", descriptor = "(I)V")
	public void method4938() {
		while (true) {
			@Pc(5) Class1_Sub5 local5 = this.aClass1_Sub5_51.aClass1_Sub5_57;
			if (local5 == this.aClass1_Sub5_51) {
				this.aClass1_Sub5_52 = null;
				return;
			}
			local5.method5305();
		}
	}

	@OriginalMember(owner = "client!so", name = "a", descriptor = "(B)Lclient!jn;")
	public Class1_Sub5 method4939() {
		@Pc(7) Class1_Sub5 local7 = this.aClass1_Sub5_51.aClass1_Sub5_57;
		if (local7 == this.aClass1_Sub5_51) {
			return null;
		} else {
			local7.method5305();
			return local7;
		}
	}

	@OriginalMember(owner = "client!so", name = "b", descriptor = "(B)I")
	public int method4941() {
		@Pc(7) int local7 = 0;
		@Pc(16) Class1_Sub5 local16 = this.aClass1_Sub5_51.aClass1_Sub5_57;
		while (this.aClass1_Sub5_51 != local16) {
			local16 = local16.aClass1_Sub5_57;
			local7++;
		}
		return local7;
	}

	@OriginalMember(owner = "client!so", name = "a", descriptor = "(Z)Lclient!jn;")
	public Class1_Sub5 method4942() {
		@Pc(12) Class1_Sub5 local12 = this.aClass1_Sub5_51.aClass1_Sub5_57;
		if (local12 == this.aClass1_Sub5_51) {
			this.aClass1_Sub5_52 = null;
			return null;
		} else {
			this.aClass1_Sub5_52 = local12.aClass1_Sub5_57;
			return local12;
		}
	}

	@OriginalMember(owner = "client!so", name = "a", descriptor = "(ZLclient!jn;)V")
	public void method4943(@OriginalArg(1) Class1_Sub5 arg0) {
		if (arg0.aClass1_Sub5_58 != null) {
			arg0.method5305();
		}
		arg0.aClass1_Sub5_58 = this.aClass1_Sub5_51.aClass1_Sub5_58;
		arg0.aClass1_Sub5_57 = this.aClass1_Sub5_51;
		arg0.aClass1_Sub5_58.aClass1_Sub5_57 = arg0;
		arg0.aClass1_Sub5_57.aClass1_Sub5_58 = arg0;
	}
}
