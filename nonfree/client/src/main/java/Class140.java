import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!kn")
public final class Class140 {

	@OriginalMember(owner = "client!kn", name = "h", descriptor = "Lclient!jn;")
	private Class4_Sub1 aClass4_Sub1_30;

	@OriginalMember(owner = "client!kn", name = "d", descriptor = "Lclient!jn;")
	private final Class4_Sub1 aClass4_Sub1_29 = new Class4_Sub1();

	@OriginalMember(owner = "client!kn", name = "<init>", descriptor = "()V")
	public Class140() {
		this.aClass4_Sub1_29.aClass4_Sub1_57 = this.aClass4_Sub1_29;
		this.aClass4_Sub1_29.aClass4_Sub1_58 = this.aClass4_Sub1_29;
	}

	@OriginalMember(owner = "client!kn", name = "b", descriptor = "(I)V")
	public void method3013() {
		while (true) {
			@Pc(9) Class4_Sub1 local9 = this.aClass4_Sub1_29.aClass4_Sub1_57;
			if (local9 == this.aClass4_Sub1_29) {
				this.aClass4_Sub1_30 = null;
				return;
			}
			local9.method5863();
		}
	}

	@OriginalMember(owner = "client!kn", name = "a", descriptor = "(B)Lclient!jn;")
	public Class4_Sub1 method3014() {
		@Pc(7) Class4_Sub1 local7 = this.aClass4_Sub1_29.aClass4_Sub1_57;
		if (this.aClass4_Sub1_29 == local7) {
			this.aClass4_Sub1_30 = null;
			return null;
		} else {
			this.aClass4_Sub1_30 = local7.aClass4_Sub1_57;
			return local7;
		}
	}

	@OriginalMember(owner = "client!kn", name = "a", descriptor = "(Lclient!jn;I)V")
	public void method3015(@OriginalArg(0) Class4_Sub1 arg0) {
		if (arg0.aClass4_Sub1_58 != null) {
			arg0.method5863();
		}
		arg0.aClass4_Sub1_58 = this.aClass4_Sub1_29.aClass4_Sub1_58;
		arg0.aClass4_Sub1_57 = this.aClass4_Sub1_29;
		arg0.aClass4_Sub1_58.aClass4_Sub1_57 = arg0;
		arg0.aClass4_Sub1_57.aClass4_Sub1_58 = arg0;
	}

	@OriginalMember(owner = "client!kn", name = "c", descriptor = "(I)Lclient!jn;")
	public Class4_Sub1 method3016() {
		@Pc(7) Class4_Sub1 local7 = this.aClass4_Sub1_29.aClass4_Sub1_57;
		if (this.aClass4_Sub1_29 == local7) {
			return null;
		} else {
			local7.method5863();
			return local7;
		}
	}

	@OriginalMember(owner = "client!kn", name = "d", descriptor = "(I)I")
	public int method3017() {
		@Pc(7) int local7 = 0;
		@Pc(11) Class4_Sub1 local11 = this.aClass4_Sub1_29.aClass4_Sub1_57;
		while (local11 != this.aClass4_Sub1_29) {
			local11 = local11.aClass4_Sub1_57;
			local7++;
		}
		return local7;
	}

	@OriginalMember(owner = "client!kn", name = "e", descriptor = "(I)Lclient!jn;")
	public Class4_Sub1 method3018() {
		@Pc(6) Class4_Sub1 local6 = this.aClass4_Sub1_30;
		if (this.aClass4_Sub1_29 == local6) {
			this.aClass4_Sub1_30 = null;
			return null;
		} else {
			this.aClass4_Sub1_30 = local6.aClass4_Sub1_57;
			return local6;
		}
	}
}
