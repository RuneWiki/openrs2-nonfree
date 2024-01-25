import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!re")
public final class Class320 {

	@OriginalMember(owner = "client!re", name = "b", descriptor = "Lclient!vj;")
	private Class4 aClass4_58;

	@OriginalMember(owner = "client!re", name = "g", descriptor = "Lclient!vj;")
	private final Class4 aClass4_57 = new Class4();

	@OriginalMember(owner = "client!re", name = "<init>", descriptor = "()V")
	public Class320() {
		this.aClass4_57.aClass4_68 = this.aClass4_57;
		this.aClass4_57.aClass4_67 = this.aClass4_57;
	}

	@OriginalMember(owner = "client!re", name = "a", descriptor = "(ILclient!vj;)V")
	public void method7600(@OriginalArg(1) Class4 arg0) {
		if (arg0.aClass4_68 != null) {
			arg0.method9416();
		}
		arg0.aClass4_67 = this.aClass4_57;
		arg0.aClass4_68 = this.aClass4_57.aClass4_68;
		arg0.aClass4_68.aClass4_67 = arg0;
		arg0.aClass4_67.aClass4_68 = arg0;
	}

	@OriginalMember(owner = "client!re", name = "a", descriptor = "(B)Z")
	public boolean method7602() {
		return this.aClass4_57 == this.aClass4_57.aClass4_67;
	}

	@OriginalMember(owner = "client!re", name = "f", descriptor = "(I)V")
	public void method7603() {
		while (true) {
			@Pc(18) Class4 local18 = this.aClass4_57.aClass4_67;
			if (local18 == this.aClass4_57) {
				this.aClass4_58 = null;
				return;
			}
			local18.method9416();
		}
	}

	@OriginalMember(owner = "client!re", name = "d", descriptor = "(I)Lclient!vj;")
	public Class4 method7604() {
		@Pc(7) Class4 local7 = this.aClass4_57.aClass4_67;
		if (local7 == this.aClass4_57) {
			return null;
		} else {
			local7.method9416();
			return local7;
		}
	}

	@OriginalMember(owner = "client!re", name = "a", descriptor = "(I)Lclient!vj;")
	public Class4 method7605() {
		@Pc(7) Class4 local7 = this.aClass4_57.aClass4_67;
		if (this.aClass4_57 == local7) {
			this.aClass4_58 = null;
			return null;
		} else {
			this.aClass4_58 = local7.aClass4_67;
			return local7;
		}
	}

	@OriginalMember(owner = "client!re", name = "a", descriptor = "(Z)Lclient!vj;")
	public Class4 method7606() {
		@Pc(14) Class4 local14 = this.aClass4_57.aClass4_68;
		if (this.aClass4_57 == local14) {
			this.aClass4_58 = null;
			return null;
		} else {
			this.aClass4_58 = local14.aClass4_68;
			return local14;
		}
	}

	@OriginalMember(owner = "client!re", name = "c", descriptor = "(I)I")
	public int method7607() {
		@Pc(16) int local16 = 0;
		@Pc(20) Class4 local20 = this.aClass4_57.aClass4_67;
		while (local20 != this.aClass4_57) {
			local20 = local20.aClass4_67;
			local16++;
		}
		return local16;
	}

	@OriginalMember(owner = "client!re", name = "e", descriptor = "(I)Lclient!vj;")
	public Class4 method7608() {
		@Pc(6) Class4 local6 = this.aClass4_58;
		if (this.aClass4_57 == local6) {
			this.aClass4_58 = null;
			return null;
		} else {
			this.aClass4_58 = local6.aClass4_67;
			return local6;
		}
	}
}
