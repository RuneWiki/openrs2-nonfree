import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!wc")
public final class Class387 {

	@OriginalMember(owner = "client!wc", name = "k", descriptor = "Lclient!hga;")
	private Class4 aClass4_68;

	@OriginalMember(owner = "client!wc", name = "d", descriptor = "Lclient!hga;")
	private final Class4 aClass4_67 = new Class4();

	@OriginalMember(owner = "client!wc", name = "<init>", descriptor = "()V")
	public Class387() {
		this.aClass4_67.aClass4_65 = this.aClass4_67;
		this.aClass4_67.aClass4_66 = this.aClass4_67;
	}

	@OriginalMember(owner = "client!wc", name = "a", descriptor = "(B)Lclient!hga;")
	public Class4 method9012() {
		@Pc(7) Class4 local7 = this.aClass4_67.aClass4_65;
		if (local7 == this.aClass4_67) {
			this.aClass4_68 = null;
			return null;
		} else {
			this.aClass4_68 = local7.aClass4_65;
			return local7;
		}
	}

	@OriginalMember(owner = "client!wc", name = "e", descriptor = "(I)Lclient!hga;")
	public Class4 method9013() {
		@Pc(14) Class4 local14 = this.aClass4_67.aClass4_66;
		if (local14 == this.aClass4_67) {
			return null;
		} else {
			local14.method8570();
			return local14;
		}
	}

	@OriginalMember(owner = "client!wc", name = "c", descriptor = "(I)V")
	public void method9014() {
		while (true) {
			@Pc(9) Class4 local9 = this.aClass4_67.aClass4_66;
			if (local9 == this.aClass4_67) {
				this.aClass4_68 = null;
				return;
			}
			local9.method8570();
		}
	}

	@OriginalMember(owner = "client!wc", name = "b", descriptor = "(I)I")
	public int method9015() {
		@Pc(7) int local7 = 0;
		for (@Pc(11) Class4 local11 = this.aClass4_67.aClass4_66; local11 != this.aClass4_67; local11 = local11.aClass4_66) {
			local7++;
		}
		return local7;
	}

	@OriginalMember(owner = "client!wc", name = "b", descriptor = "(B)Lclient!hga;")
	public Class4 method9016() {
		@Pc(14) Class4 local14 = this.aClass4_68;
		if (this.aClass4_67 == local14) {
			this.aClass4_68 = null;
			return null;
		} else {
			this.aClass4_68 = local14.aClass4_66;
			return local14;
		}
	}

	@OriginalMember(owner = "client!wc", name = "a", descriptor = "(ILclient!hga;)V")
	public void method9017(@OriginalArg(1) Class4 arg0) {
		if (arg0.aClass4_65 != null) {
			arg0.method8570();
		}
		arg0.aClass4_66 = this.aClass4_67;
		arg0.aClass4_65 = this.aClass4_67.aClass4_65;
		arg0.aClass4_65.aClass4_66 = arg0;
		arg0.aClass4_66.aClass4_65 = arg0;
	}

	@OriginalMember(owner = "client!wc", name = "d", descriptor = "(I)Lclient!hga;")
	public Class4 method9018() {
		@Pc(7) Class4 local7 = this.aClass4_67.aClass4_66;
		if (local7 == this.aClass4_67) {
			this.aClass4_68 = null;
			return null;
		} else {
			this.aClass4_68 = local7.aClass4_66;
			return local7;
		}
	}

	@OriginalMember(owner = "client!wc", name = "a", descriptor = "(Z)Z")
	public boolean method9020() {
		return this.aClass4_67.aClass4_66 == this.aClass4_67;
	}
}
