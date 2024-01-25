import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!vm")
public final class Class363 {

	@OriginalMember(owner = "client!vm", name = "k", descriptor = "Lclient!va;")
	private Class14 aClass14_66;

	@OriginalMember(owner = "client!vm", name = "f", descriptor = "Lclient!va;")
	private final Class14 aClass14_65 = new Class14();

	@OriginalMember(owner = "client!vm", name = "<init>", descriptor = "()V")
	public Class363() {
		this.aClass14_65.aClass14_67 = this.aClass14_65;
		this.aClass14_65.aClass14_68 = this.aClass14_65;
	}

	@OriginalMember(owner = "client!vm", name = "a", descriptor = "(B)I")
	public int method8476() {
		@Pc(7) int local7 = 0;
		for (@Pc(18) Class14 local18 = this.aClass14_65.aClass14_67; local18 != this.aClass14_65; local18 = local18.aClass14_67) {
			local7++;
		}
		return local7;
	}

	@OriginalMember(owner = "client!vm", name = "a", descriptor = "(I)Lclient!va;")
	public Class14 method8478() {
		@Pc(6) Class14 local6 = this.aClass14_66;
		if (local6 == this.aClass14_65) {
			this.aClass14_66 = null;
			return null;
		} else {
			this.aClass14_66 = local6.aClass14_67;
			return local6;
		}
	}

	@OriginalMember(owner = "client!vm", name = "a", descriptor = "(Z)Lclient!va;")
	public Class14 method8479() {
		@Pc(7) Class14 local7 = this.aClass14_65.aClass14_68;
		if (this.aClass14_65 == local7) {
			this.aClass14_66 = null;
			return null;
		} else {
			this.aClass14_66 = local7.aClass14_68;
			return local7;
		}
	}

	@OriginalMember(owner = "client!vm", name = "a", descriptor = "(Lclient!va;I)V")
	public void method8480(@OriginalArg(0) Class14 arg0) {
		if (arg0.aClass14_68 != null) {
			arg0.method8904();
		}
		arg0.aClass14_67 = this.aClass14_65;
		arg0.aClass14_68 = this.aClass14_65.aClass14_68;
		arg0.aClass14_68.aClass14_67 = arg0;
		arg0.aClass14_67.aClass14_68 = arg0;
	}

	@OriginalMember(owner = "client!vm", name = "b", descriptor = "(Z)Z")
	public boolean method8481() {
		return this.aClass14_65.aClass14_67 == this.aClass14_65;
	}

	@OriginalMember(owner = "client!vm", name = "b", descriptor = "(I)V")
	public void method8482() {
		while (true) {
			@Pc(9) Class14 local9 = this.aClass14_65.aClass14_67;
			if (local9 == this.aClass14_65) {
				this.aClass14_66 = null;
				return;
			}
			local9.method8904();
		}
	}

	@OriginalMember(owner = "client!vm", name = "c", descriptor = "(Z)Lclient!va;")
	public Class14 method8483() {
		@Pc(14) Class14 local14 = this.aClass14_65.aClass14_67;
		if (local14 == this.aClass14_65) {
			return null;
		} else {
			local14.method8904();
			return local14;
		}
	}

	@OriginalMember(owner = "client!vm", name = "c", descriptor = "(B)Lclient!va;")
	public Class14 method8484() {
		@Pc(12) Class14 local12 = this.aClass14_65.aClass14_67;
		if (this.aClass14_65 == local12) {
			this.aClass14_66 = null;
			return null;
		} else {
			this.aClass14_66 = local12.aClass14_67;
			return local12;
		}
	}
}
