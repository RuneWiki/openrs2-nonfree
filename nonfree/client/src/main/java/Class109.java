import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!fca")
public final class Class109 {

	@OriginalMember(owner = "client!fca", name = "m", descriptor = "Lclient!fga;")
	private Class6 aClass6_20;

	@OriginalMember(owner = "client!fca", name = "d", descriptor = "Lclient!fga;")
	private final Class6 aClass6_19 = new Class6();

	@OriginalMember(owner = "client!fca", name = "<init>", descriptor = "()V")
	public Class109() {
		this.aClass6_19.aClass6_67 = this.aClass6_19;
		this.aClass6_19.aClass6_68 = this.aClass6_19;
	}

	@OriginalMember(owner = "client!fca", name = "a", descriptor = "(I)Z")
	public boolean method2308() {
		return this.aClass6_19.aClass6_67 == this.aClass6_19;
	}

	@OriginalMember(owner = "client!fca", name = "b", descriptor = "(I)V")
	public void method2311() {
		while (true) {
			@Pc(15) Class6 local15 = this.aClass6_19.aClass6_67;
			if (local15 == this.aClass6_19) {
				this.aClass6_20 = null;
				return;
			}
			local15.method7989();
		}
	}

	@OriginalMember(owner = "client!fca", name = "a", descriptor = "(B)Lclient!fga;")
	public Class6 method2312() {
		@Pc(17) Class6 local17 = this.aClass6_20;
		if (this.aClass6_19 == local17) {
			this.aClass6_20 = null;
			return null;
		} else {
			this.aClass6_20 = local17.aClass6_67;
			return local17;
		}
	}

	@OriginalMember(owner = "client!fca", name = "a", descriptor = "(Lclient!fga;I)V")
	public void method2313(@OriginalArg(0) Class6 arg0) {
		if (arg0.aClass6_68 != null) {
			arg0.method7989();
		}
		arg0.aClass6_67 = this.aClass6_19;
		arg0.aClass6_68 = this.aClass6_19.aClass6_68;
		arg0.aClass6_68.aClass6_67 = arg0;
		arg0.aClass6_67.aClass6_68 = arg0;
	}

	@OriginalMember(owner = "client!fca", name = "b", descriptor = "(B)Lclient!fga;")
	public Class6 method2314() {
		@Pc(12) Class6 local12 = this.aClass6_19.aClass6_67;
		if (this.aClass6_19 == local12) {
			this.aClass6_20 = null;
			return null;
		} else {
			this.aClass6_20 = local12.aClass6_67;
			return local12;
		}
	}

	@OriginalMember(owner = "client!fca", name = "c", descriptor = "(I)Lclient!fga;")
	public Class6 method2315() {
		@Pc(12) Class6 local12 = this.aClass6_19.aClass6_68;
		if (local12 == this.aClass6_19) {
			this.aClass6_20 = null;
			return null;
		} else {
			this.aClass6_20 = local12.aClass6_68;
			return local12;
		}
	}

	@OriginalMember(owner = "client!fca", name = "d", descriptor = "(I)I")
	public int method2316() {
		@Pc(7) int local7 = 0;
		@Pc(11) Class6 local11 = this.aClass6_19.aClass6_67;
		while (local11 != this.aClass6_19) {
			local11 = local11.aClass6_67;
			local7++;
		}
		return local7;
	}

	@OriginalMember(owner = "client!fca", name = "a", descriptor = "(Z)Lclient!fga;")
	public Class6 method2319() {
		@Pc(13) Class6 local13 = this.aClass6_19.aClass6_67;
		if (local13 == this.aClass6_19) {
			return null;
		} else {
			local13.method7989();
			return local13;
		}
	}
}
