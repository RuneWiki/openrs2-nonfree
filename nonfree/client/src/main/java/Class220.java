import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!mb")
public final class Class220 {

	@OriginalMember(owner = "client!mb", name = "n", descriptor = "Lclient!mm;")
	private Class12 aClass12_40;

	@OriginalMember(owner = "client!mb", name = "m", descriptor = "Lclient!mm;")
	private final Class12 aClass12_39 = new Class12();

	@OriginalMember(owner = "client!mb", name = "<init>", descriptor = "()V")
	public Class220() {
		this.aClass12_39.aClass12_67 = this.aClass12_39;
		this.aClass12_39.aClass12_68 = this.aClass12_39;
	}

	@OriginalMember(owner = "client!mb", name = "a", descriptor = "(B)Lclient!mm;")
	public Class12 method4653() {
		@Pc(12) Class12 local12 = this.aClass12_39.aClass12_68;
		if (this.aClass12_39 == local12) {
			this.aClass12_40 = null;
			return null;
		} else {
			this.aClass12_40 = local12.aClass12_68;
			return local12;
		}
	}

	@OriginalMember(owner = "client!mb", name = "a", descriptor = "(I)Z")
	public boolean method4656() {
		return this.aClass12_39 == this.aClass12_39.aClass12_67;
	}

	@OriginalMember(owner = "client!mb", name = "a", descriptor = "(Z)V")
	public void method4657() {
		while (true) {
			@Pc(16) Class12 local16 = this.aClass12_39.aClass12_67;
			if (local16 == this.aClass12_39) {
				this.aClass12_40 = null;
				return;
			}
			local16.method7630();
		}
	}

	@OriginalMember(owner = "client!mb", name = "b", descriptor = "(I)I")
	public int method4658() {
		@Pc(7) int local7 = 0;
		@Pc(17) Class12 local17 = this.aClass12_39.aClass12_67;
		while (this.aClass12_39 != local17) {
			local17 = local17.aClass12_67;
			local7++;
		}
		return local7;
	}

	@OriginalMember(owner = "client!mb", name = "a", descriptor = "(ILclient!mm;)V")
	public void method4659(@OriginalArg(1) Class12 arg0) {
		if (arg0.aClass12_68 != null) {
			arg0.method7630();
		}
		arg0.aClass12_67 = this.aClass12_39;
		arg0.aClass12_68 = this.aClass12_39.aClass12_68;
		arg0.aClass12_68.aClass12_67 = arg0;
		arg0.aClass12_67.aClass12_68 = arg0;
	}

	@OriginalMember(owner = "client!mb", name = "c", descriptor = "(B)Lclient!mm;")
	public Class12 method4660() {
		@Pc(14) Class12 local14 = this.aClass12_40;
		if (local14 == this.aClass12_39) {
			this.aClass12_40 = null;
			return null;
		} else {
			this.aClass12_40 = local14.aClass12_67;
			return local14;
		}
	}

	@OriginalMember(owner = "client!mb", name = "c", descriptor = "(I)Lclient!mm;")
	public Class12 method4661() {
		@Pc(7) Class12 local7 = this.aClass12_39.aClass12_67;
		if (local7 == this.aClass12_39) {
			this.aClass12_40 = null;
			return null;
		} else {
			this.aClass12_40 = local7.aClass12_67;
			return local7;
		}
	}

	@OriginalMember(owner = "client!mb", name = "d", descriptor = "(I)Lclient!mm;")
	public Class12 method4662() {
		@Pc(7) Class12 local7 = this.aClass12_39.aClass12_67;
		if (this.aClass12_39 == local7) {
			return null;
		} else {
			local7.method7630();
			return local7;
		}
	}
}
