import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!jo")
public final class Class86 {

	@OriginalMember(owner = "client!jo", name = "h", descriptor = "Lclient!nh;")
	private Class4_Sub2 aClass4_Sub2_36;

	@OriginalMember(owner = "client!jo", name = "e", descriptor = "Lclient!nh;")
	private Class4_Sub2 aClass4_Sub2_35 = new Class4_Sub2();

	@OriginalMember(owner = "client!jo", name = "<init>", descriptor = "()V")
	public Class86() {
		this.aClass4_Sub2_35.aClass4_Sub2_72 = this.aClass4_Sub2_35;
		this.aClass4_Sub2_35.aClass4_Sub2_71 = this.aClass4_Sub2_35;
	}

	@OriginalMember(owner = "client!jo", name = "a", descriptor = "(I)V")
	public void method2179() {
		while (true) {
			@Pc(5) Class4_Sub2 local5 = this.aClass4_Sub2_35.aClass4_Sub2_72;
			if (local5 == this.aClass4_Sub2_35) {
				this.aClass4_Sub2_36 = null;
				return;
			}
			local5.method4697();
		}
	}

	@OriginalMember(owner = "client!jo", name = "c", descriptor = "(I)I")
	public int method2181() {
		@Pc(9) Class4_Sub2 local9 = this.aClass4_Sub2_35.aClass4_Sub2_72;
		@Pc(11) int local11 = 0;
		while (local9 != this.aClass4_Sub2_35) {
			local9 = local9.aClass4_Sub2_72;
			local11++;
		}
		return local11;
	}

	@OriginalMember(owner = "client!jo", name = "d", descriptor = "(I)Lclient!nh;")
	public Class4_Sub2 method2183() {
		@Pc(7) Class4_Sub2 local7 = this.aClass4_Sub2_35.aClass4_Sub2_72;
		if (this.aClass4_Sub2_35 == local7) {
			this.aClass4_Sub2_36 = null;
			return null;
		} else {
			this.aClass4_Sub2_36 = local7.aClass4_Sub2_72;
			return local7;
		}
	}

	@OriginalMember(owner = "client!jo", name = "e", descriptor = "(I)Lclient!nh;")
	public Class4_Sub2 method2184() {
		@Pc(6) Class4_Sub2 local6 = this.aClass4_Sub2_36;
		if (local6 == this.aClass4_Sub2_35) {
			this.aClass4_Sub2_36 = null;
			return null;
		} else {
			this.aClass4_Sub2_36 = local6.aClass4_Sub2_72;
			return local6;
		}
	}

	@OriginalMember(owner = "client!jo", name = "a", descriptor = "(Lclient!nh;B)V")
	public void method2185(@OriginalArg(0) Class4_Sub2 arg0) {
		if (arg0.aClass4_Sub2_71 != null) {
			arg0.method4697();
		}
		arg0.aClass4_Sub2_71 = this.aClass4_Sub2_35.aClass4_Sub2_71;
		arg0.aClass4_Sub2_72 = this.aClass4_Sub2_35;
		arg0.aClass4_Sub2_71.aClass4_Sub2_72 = arg0;
		arg0.aClass4_Sub2_72.aClass4_Sub2_71 = arg0;
	}

	@OriginalMember(owner = "client!jo", name = "f", descriptor = "(I)Lclient!nh;")
	public Class4_Sub2 method2186() {
		@Pc(14) Class4_Sub2 local14 = this.aClass4_Sub2_35.aClass4_Sub2_72;
		if (local14 == this.aClass4_Sub2_35) {
			return null;
		} else {
			local14.method4697();
			return local14;
		}
	}
}
