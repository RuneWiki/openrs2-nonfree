import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!oga")
public final class Class269 {

	@OriginalMember(owner = "client!oga", name = "i", descriptor = "Lclient!v;")
	private Class14_Sub2 aClass14_Sub2_43;

	@OriginalMember(owner = "client!oga", name = "m", descriptor = "Lclient!v;")
	public final Class14_Sub2 aClass14_Sub2_42 = new Class14_Sub2();

	@OriginalMember(owner = "client!oga", name = "<init>", descriptor = "()V")
	public Class269() {
		this.aClass14_Sub2_42.aClass14_Sub2_66 = this.aClass14_Sub2_42;
		this.aClass14_Sub2_42.aClass14_Sub2_67 = this.aClass14_Sub2_42;
	}

	@OriginalMember(owner = "client!oga", name = "a", descriptor = "(I)I")
	public int method6486() {
		@Pc(7) int local7 = 0;
		for (@Pc(11) Class14_Sub2 local11 = this.aClass14_Sub2_42.aClass14_Sub2_67; local11 != this.aClass14_Sub2_42; local11 = local11.aClass14_Sub2_67) {
			local7++;
		}
		return local7;
	}

	@OriginalMember(owner = "client!oga", name = "b", descriptor = "(I)Lclient!v;")
	public Class14_Sub2 method6490() {
		@Pc(13) Class14_Sub2 local13 = this.aClass14_Sub2_42.aClass14_Sub2_67;
		if (this.aClass14_Sub2_42 == local13) {
			return null;
		} else {
			local13.method9093();
			return local13;
		}
	}

	@OriginalMember(owner = "client!oga", name = "a", descriptor = "(Z)Lclient!v;")
	public Class14_Sub2 method6491() {
		@Pc(6) Class14_Sub2 local6 = this.aClass14_Sub2_43;
		if (this.aClass14_Sub2_42 == local6) {
			this.aClass14_Sub2_43 = null;
			return null;
		} else {
			this.aClass14_Sub2_43 = local6.aClass14_Sub2_67;
			return local6;
		}
	}

	@OriginalMember(owner = "client!oga", name = "c", descriptor = "(I)V")
	public void method6492() {
		while (true) {
			@Pc(7) Class14_Sub2 local7 = this.aClass14_Sub2_42.aClass14_Sub2_67;
			if (local7 == this.aClass14_Sub2_42) {
				this.aClass14_Sub2_43 = null;
				return;
			}
			local7.method9093();
		}
	}

	@OriginalMember(owner = "client!oga", name = "a", descriptor = "(BLclient!v;)V")
	public void method6493(@OriginalArg(1) Class14_Sub2 arg0) {
		if (arg0.aClass14_Sub2_66 != null) {
			arg0.method9093();
		}
		arg0.aClass14_Sub2_67 = this.aClass14_Sub2_42;
		arg0.aClass14_Sub2_66 = this.aClass14_Sub2_42.aClass14_Sub2_66;
		arg0.aClass14_Sub2_66.aClass14_Sub2_67 = arg0;
		arg0.aClass14_Sub2_67.aClass14_Sub2_66 = arg0;
	}

	@OriginalMember(owner = "client!oga", name = "c", descriptor = "(B)Lclient!v;")
	public Class14_Sub2 method6494() {
		@Pc(14) Class14_Sub2 local14 = this.aClass14_Sub2_42.aClass14_Sub2_67;
		if (this.aClass14_Sub2_42 == local14) {
			this.aClass14_Sub2_43 = null;
			return null;
		} else {
			this.aClass14_Sub2_43 = local14.aClass14_Sub2_67;
			return local14;
		}
	}
}
