import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!tn")
public final class Class229 {

	@OriginalMember(owner = "client!tn", name = "k", descriptor = "Lclient!ac;")
	private Class4_Sub1 aClass4_Sub1_58;

	@OriginalMember(owner = "client!tn", name = "d", descriptor = "Lclient!ac;")
	private final Class4_Sub1 aClass4_Sub1_57 = new Class4_Sub1();

	@OriginalMember(owner = "client!tn", name = "<init>", descriptor = "()V")
	public Class229() {
		this.aClass4_Sub1_57.aClass4_Sub1_56 = this.aClass4_Sub1_57;
		this.aClass4_Sub1_57.aClass4_Sub1_55 = this.aClass4_Sub1_57;
	}

	@OriginalMember(owner = "client!tn", name = "a", descriptor = "(B)V")
	public void method5087() {
		while (true) {
			@Pc(5) Class4_Sub1 local5 = this.aClass4_Sub1_57.aClass4_Sub1_55;
			if (this.aClass4_Sub1_57 == local5) {
				this.aClass4_Sub1_58 = null;
				return;
			}
			local5.method4662();
		}
	}

	@OriginalMember(owner = "client!tn", name = "a", descriptor = "(ILclient!ac;)V")
	public void method5088(@OriginalArg(1) Class4_Sub1 arg0) {
		if (arg0.aClass4_Sub1_56 != null) {
			arg0.method4662();
		}
		arg0.aClass4_Sub1_55 = this.aClass4_Sub1_57;
		arg0.aClass4_Sub1_56 = this.aClass4_Sub1_57.aClass4_Sub1_56;
		arg0.aClass4_Sub1_56.aClass4_Sub1_55 = arg0;
		arg0.aClass4_Sub1_55.aClass4_Sub1_56 = arg0;
	}

	@OriginalMember(owner = "client!tn", name = "b", descriptor = "(B)Lclient!ac;")
	public Class4_Sub1 method5089() {
		@Pc(12) Class4_Sub1 local12 = this.aClass4_Sub1_57.aClass4_Sub1_55;
		if (local12 == this.aClass4_Sub1_57) {
			this.aClass4_Sub1_58 = null;
			return null;
		} else {
			this.aClass4_Sub1_58 = local12.aClass4_Sub1_55;
			return local12;
		}
	}

	@OriginalMember(owner = "client!tn", name = "c", descriptor = "(B)Lclient!ac;")
	public Class4_Sub1 method5091() {
		@Pc(7) Class4_Sub1 local7 = this.aClass4_Sub1_57.aClass4_Sub1_55;
		if (this.aClass4_Sub1_57 == local7) {
			return null;
		} else {
			local7.method4662();
			return local7;
		}
	}

	@OriginalMember(owner = "client!tn", name = "b", descriptor = "(Z)Lclient!ac;")
	public Class4_Sub1 method5092() {
		@Pc(11) Class4_Sub1 local11 = this.aClass4_Sub1_58;
		if (this.aClass4_Sub1_57 == local11) {
			this.aClass4_Sub1_58 = null;
			return null;
		} else {
			this.aClass4_Sub1_58 = local11.aClass4_Sub1_55;
			return local11;
		}
	}

	@OriginalMember(owner = "client!tn", name = "c", descriptor = "(Z)I")
	public int method5093() {
		@Pc(13) int local13 = 0;
		@Pc(17) Class4_Sub1 local17 = this.aClass4_Sub1_57.aClass4_Sub1_55;
		while (local17 != this.aClass4_Sub1_57) {
			local17 = local17.aClass4_Sub1_55;
			local13++;
		}
		return local13;
	}
}
