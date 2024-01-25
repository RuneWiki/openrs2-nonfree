import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!vv")
public final class Class376 {

	@OriginalMember(owner = "client!vv", name = "n", descriptor = "Lclient!ea;")
	private Class12 aClass12_66;

	@OriginalMember(owner = "client!vv", name = "j", descriptor = "Lclient!ea;")
	private final Class12 aClass12_65 = new Class12();

	@OriginalMember(owner = "client!vv", name = "<init>", descriptor = "()V")
	public Class376() {
		this.aClass12_65.aClass12_68 = this.aClass12_65;
		this.aClass12_65.aClass12_67 = this.aClass12_65;
	}

	@OriginalMember(owner = "client!vv", name = "a", descriptor = "(B)Z")
	public boolean method9006() {
		return this.aClass12_65 == this.aClass12_65.aClass12_68;
	}

	@OriginalMember(owner = "client!vv", name = "a", descriptor = "(I)V")
	public void method9007() {
		while (true) {
			@Pc(5) Class12 local5 = this.aClass12_65.aClass12_68;
			if (local5 == this.aClass12_65) {
				this.aClass12_66 = null;
				return;
			}
			local5.method9143();
		}
	}

	@OriginalMember(owner = "client!vv", name = "a", descriptor = "(Z)Lclient!ea;")
	public Class12 method9008() {
		@Pc(12) Class12 local12 = this.aClass12_65.aClass12_68;
		if (this.aClass12_65 == local12) {
			this.aClass12_66 = null;
			return null;
		} else {
			this.aClass12_66 = local12.aClass12_68;
			return local12;
		}
	}

	@OriginalMember(owner = "client!vv", name = "c", descriptor = "(I)Lclient!ea;")
	public Class12 method9010() {
		@Pc(15) Class12 local15 = this.aClass12_65.aClass12_68;
		if (local15 == this.aClass12_65) {
			return null;
		} else {
			local15.method9143();
			return local15;
		}
	}

	@OriginalMember(owner = "client!vv", name = "a", descriptor = "(ILclient!ea;)V")
	public void method9011(@OriginalArg(1) Class12 arg0) {
		if (arg0.aClass12_67 != null) {
			arg0.method9143();
		}
		arg0.aClass12_68 = this.aClass12_65;
		arg0.aClass12_67 = this.aClass12_65.aClass12_67;
		arg0.aClass12_67.aClass12_68 = arg0;
		arg0.aClass12_68.aClass12_67 = arg0;
	}

	@OriginalMember(owner = "client!vv", name = "d", descriptor = "(I)I")
	public int method9012() {
		@Pc(7) int local7 = 0;
		@Pc(16) Class12 local16 = this.aClass12_65.aClass12_68;
		while (this.aClass12_65 != local16) {
			local16 = local16.aClass12_68;
			local7++;
		}
		return local7;
	}

	@OriginalMember(owner = "client!vv", name = "e", descriptor = "(I)Lclient!ea;")
	public Class12 method9013() {
		@Pc(7) Class12 local7 = this.aClass12_65.aClass12_67;
		if (this.aClass12_65 == local7) {
			this.aClass12_66 = null;
			return null;
		} else {
			this.aClass12_66 = local7.aClass12_67;
			return local7;
		}
	}

	@OriginalMember(owner = "client!vv", name = "f", descriptor = "(I)Lclient!ea;")
	public Class12 method9014() {
		@Pc(11) Class12 local11 = this.aClass12_66;
		if (this.aClass12_65 == local11) {
			this.aClass12_66 = null;
			return null;
		} else {
			this.aClass12_66 = local11.aClass12_68;
			return local11;
		}
	}
}
