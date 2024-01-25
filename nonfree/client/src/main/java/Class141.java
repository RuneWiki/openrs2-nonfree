import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ks")
public final class Class141 {

	@OriginalMember(owner = "client!ks", name = "o", descriptor = "Lclient!rf;")
	private Class4 aClass4_20;

	@OriginalMember(owner = "client!ks", name = "e", descriptor = "Lclient!rf;")
	private final Class4 aClass4_19 = new Class4();

	@OriginalMember(owner = "client!ks", name = "<init>", descriptor = "()V")
	public Class141() {
		this.aClass4_19.aClass4_25 = this.aClass4_19;
		this.aClass4_19.aClass4_26 = this.aClass4_19;
	}

	@OriginalMember(owner = "client!ks", name = "b", descriptor = "(B)Z")
	public boolean method3354() {
		return this.aClass4_19 == this.aClass4_19.aClass4_26;
	}

	@OriginalMember(owner = "client!ks", name = "a", descriptor = "(ILclient!rf;)V")
	public void method3356(@OriginalArg(1) Class4 arg0) {
		if (arg0.aClass4_25 != null) {
			arg0.method5737();
		}
		arg0.aClass4_25 = this.aClass4_19.aClass4_25;
		arg0.aClass4_26 = this.aClass4_19;
		arg0.aClass4_25.aClass4_26 = arg0;
		arg0.aClass4_26.aClass4_25 = arg0;
	}

	@OriginalMember(owner = "client!ks", name = "a", descriptor = "(I)Lclient!rf;")
	public Class4 method3357() {
		@Pc(7) Class4 local7 = this.aClass4_19.aClass4_26;
		if (this.aClass4_19 == local7) {
			this.aClass4_20 = null;
			return null;
		} else {
			this.aClass4_20 = local7.aClass4_26;
			return local7;
		}
	}

	@OriginalMember(owner = "client!ks", name = "b", descriptor = "(I)V")
	public void method3358() {
		while (true) {
			@Pc(3) Class4 local3 = this.aClass4_19.aClass4_26;
			if (local3 == this.aClass4_19) {
				this.aClass4_20 = null;
				return;
			}
			local3.method5737();
		}
	}

	@OriginalMember(owner = "client!ks", name = "c", descriptor = "(I)Lclient!rf;")
	public Class4 method3359() {
		@Pc(7) Class4 local7 = this.aClass4_19.aClass4_25;
		if (this.aClass4_19 == local7) {
			this.aClass4_20 = null;
			return null;
		} else {
			this.aClass4_20 = local7.aClass4_25;
			return local7;
		}
	}

	@OriginalMember(owner = "client!ks", name = "d", descriptor = "(I)Lclient!rf;")
	public Class4 method3360() {
		@Pc(14) Class4 local14 = this.aClass4_20;
		if (this.aClass4_19 == local14) {
			this.aClass4_20 = null;
			return null;
		} else {
			this.aClass4_20 = local14.aClass4_26;
			return local14;
		}
	}

	@OriginalMember(owner = "client!ks", name = "e", descriptor = "(I)I")
	public int method3361() {
		@Pc(15) int local15 = 0;
		@Pc(19) Class4 local19 = this.aClass4_19.aClass4_26;
		while (this.aClass4_19 != local19) {
			local19 = local19.aClass4_26;
			local15++;
		}
		return local15;
	}

	@OriginalMember(owner = "client!ks", name = "f", descriptor = "(I)Lclient!rf;")
	public Class4 method3362() {
		@Pc(12) Class4 local12 = this.aClass4_19.aClass4_26;
		if (local12 == this.aClass4_19) {
			return null;
		} else {
			local12.method5737();
			return local12;
		}
	}
}
