import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!hv")
public final class Class107 {

	@OriginalMember(owner = "client!hv", name = "m", descriptor = "Lclient!nk;")
	private Class88 aClass88_12;

	@OriginalMember(owner = "client!hv", name = "e", descriptor = "Lclient!nk;")
	private final Class88 aClass88_11 = new Class88();

	@OriginalMember(owner = "client!hv", name = "<init>", descriptor = "()V")
	public Class107() {
		this.aClass88_11.aClass88_26 = this.aClass88_11;
		this.aClass88_11.aClass88_25 = this.aClass88_11;
	}

	@OriginalMember(owner = "client!hv", name = "a", descriptor = "(Z)Lclient!nk;")
	public Class88 method2322() {
		@Pc(14) Class88 local14 = this.aClass88_11.aClass88_26;
		if (local14 == this.aClass88_11) {
			this.aClass88_12 = null;
			return null;
		} else {
			this.aClass88_12 = local14.aClass88_26;
			return local14;
		}
	}

	@OriginalMember(owner = "client!hv", name = "a", descriptor = "(I)Lclient!nk;")
	public Class88 method2323() {
		@Pc(12) Class88 local12 = this.aClass88_11.aClass88_25;
		if (local12 == this.aClass88_11) {
			return null;
		} else {
			local12.method5917();
			return local12;
		}
	}

	@OriginalMember(owner = "client!hv", name = "a", descriptor = "(B)Z")
	public boolean method2324() {
		return this.aClass88_11 == this.aClass88_11.aClass88_25;
	}

	@OriginalMember(owner = "client!hv", name = "b", descriptor = "(Z)I")
	public int method2325() {
		@Pc(7) int local7 = 0;
		for (@Pc(11) Class88 local11 = this.aClass88_11.aClass88_25; local11 != this.aClass88_11; local11 = local11.aClass88_25) {
			local7++;
		}
		return local7;
	}

	@OriginalMember(owner = "client!hv", name = "b", descriptor = "(B)Lclient!nk;")
	public Class88 method2326() {
		@Pc(12) Class88 local12 = this.aClass88_11.aClass88_25;
		if (local12 == this.aClass88_11) {
			this.aClass88_12 = null;
			return null;
		} else {
			this.aClass88_12 = local12.aClass88_25;
			return local12;
		}
	}

	@OriginalMember(owner = "client!hv", name = "b", descriptor = "(I)Lclient!nk;")
	public Class88 method2327() {
		@Pc(6) Class88 local6 = this.aClass88_12;
		if (local6 == this.aClass88_11) {
			this.aClass88_12 = null;
			return null;
		} else {
			this.aClass88_12 = local6.aClass88_25;
			return local6;
		}
	}

	@OriginalMember(owner = "client!hv", name = "c", descriptor = "(Z)V")
	public void method2329() {
		while (true) {
			@Pc(13) Class88 local13 = this.aClass88_11.aClass88_25;
			if (local13 == this.aClass88_11) {
				this.aClass88_12 = null;
				return;
			}
			local13.method5917();
		}
	}

	@OriginalMember(owner = "client!hv", name = "a", descriptor = "(Lclient!nk;I)V")
	public void method2332(@OriginalArg(0) Class88 arg0) {
		if (arg0.aClass88_26 != null) {
			arg0.method5917();
		}
		arg0.aClass88_26 = this.aClass88_11.aClass88_26;
		arg0.aClass88_25 = this.aClass88_11;
		arg0.aClass88_26.aClass88_25 = arg0;
		arg0.aClass88_25.aClass88_26 = arg0;
	}
}
