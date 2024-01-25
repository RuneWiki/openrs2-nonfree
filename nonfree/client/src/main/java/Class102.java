import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ef")
public final class Class102 {

	@OriginalMember(owner = "client!ef", name = "s", descriptor = "Lclient!me;")
	private Class5 aClass5_62;

	@OriginalMember(owner = "client!ef", name = "b", descriptor = "Lclient!me;")
	public final Class5 aClass5_61 = new Class5();

	@OriginalMember(owner = "client!ef", name = "<init>", descriptor = "()V")
	public Class102() {
		this.aClass5_61.aClass5_338 = this.aClass5_61;
		this.aClass5_61.aClass5_337 = this.aClass5_61;
	}

	@OriginalMember(owner = "client!ef", name = "b", descriptor = "(I)Lclient!me;")
	public Class5 method1915() {
		@Pc(6) Class5 local6 = this.aClass5_62;
		if (local6 == this.aClass5_61) {
			this.aClass5_62 = null;
			return null;
		} else {
			this.aClass5_62 = local6.aClass5_338;
			return local6;
		}
	}

	@OriginalMember(owner = "client!ef", name = "b", descriptor = "(B)Lclient!me;")
	public Class5 method1916() {
		@Pc(15) Class5 local15 = this.aClass5_61.aClass5_338;
		if (local15 == this.aClass5_61) {
			this.aClass5_62 = null;
			return null;
		} else {
			this.aClass5_62 = local15.aClass5_338;
			return local15;
		}
	}

	@OriginalMember(owner = "client!ef", name = "a", descriptor = "(Lclient!ef;Lclient!me;Z)V")
	private void method1917(@OriginalArg(0) Class102 arg0, @OriginalArg(1) Class5 arg1) {
		@Pc(7) Class5 local7 = this.aClass5_61.aClass5_337;
		this.aClass5_61.aClass5_337 = arg1.aClass5_337;
		arg1.aClass5_337.aClass5_338 = this.aClass5_61;
		if (arg1 != this.aClass5_61) {
			arg1.aClass5_337 = arg0.aClass5_61.aClass5_337;
			arg1.aClass5_337.aClass5_338 = arg1;
			arg0.aClass5_61.aClass5_337 = local7;
			local7.aClass5_338 = arg0.aClass5_61;
		}
	}

	@OriginalMember(owner = "client!ef", name = "a", descriptor = "(ILclient!ef;)V")
	public void method1919(@OriginalArg(1) Class102 arg0) {
		this.method1917(arg0, this.aClass5_61.aClass5_338);
	}

	@OriginalMember(owner = "client!ef", name = "a", descriptor = "(ILclient!me;)V")
	public void method1921(@OriginalArg(1) Class5 arg0) {
		if (arg0.aClass5_337 != null) {
			arg0.method9327(1);
		}
		arg0.aClass5_338 = this.aClass5_61;
		arg0.aClass5_337 = this.aClass5_61.aClass5_337;
		arg0.aClass5_337.aClass5_338 = arg0;
		arg0.aClass5_338.aClass5_337 = arg0;
	}

	@OriginalMember(owner = "client!ef", name = "h", descriptor = "(I)Lclient!me;")
	public Class5 method1922() {
		@Pc(16) Class5 local16 = this.aClass5_62;
		if (this.aClass5_61 == local16) {
			this.aClass5_62 = null;
			return null;
		} else {
			this.aClass5_62 = local16.aClass5_337;
			return local16;
		}
	}

	@OriginalMember(owner = "client!ef", name = "a", descriptor = "(Z)Lclient!me;")
	public Class5 method1924() {
		@Pc(15) Class5 local15 = this.aClass5_61.aClass5_337;
		if (this.aClass5_61 == local15) {
			this.aClass5_62 = null;
			return null;
		} else {
			this.aClass5_62 = local15.aClass5_337;
			return local15;
		}
	}

	@OriginalMember(owner = "client!ef", name = "c", descriptor = "(I)Z")
	public boolean method1926() {
		return this.aClass5_61 == this.aClass5_61.aClass5_338;
	}

	@OriginalMember(owner = "client!ef", name = "e", descriptor = "(I)I")
	public int method1927() {
		@Pc(7) int local7 = 0;
		for (@Pc(20) Class5 local20 = this.aClass5_61.aClass5_338; local20 != this.aClass5_61; local20 = local20.aClass5_338) {
			local7++;
		}
		return local7;
	}

	@OriginalMember(owner = "client!ef", name = "d", descriptor = "(I)Lclient!me;")
	public Class5 method1928() {
		@Pc(15) Class5 local15 = this.aClass5_61.aClass5_338;
		if (this.aClass5_61 == local15) {
			return null;
		} else {
			local15.method9327(1);
			return local15;
		}
	}

	@OriginalMember(owner = "client!ef", name = "a", descriptor = "(ZLclient!me;)V")
	public void method1929(@OriginalArg(1) Class5 arg0) {
		if (arg0.aClass5_337 != null) {
			arg0.method9327(1);
		}
		arg0.aClass5_337 = this.aClass5_61;
		arg0.aClass5_338 = this.aClass5_61.aClass5_338;
		arg0.aClass5_337.aClass5_338 = arg0;
		arg0.aClass5_338.aClass5_337 = arg0;
	}

	@OriginalMember(owner = "client!ef", name = "g", descriptor = "(I)V")
	public void method1932() {
		while (true) {
			@Pc(5) Class5 local5 = this.aClass5_61.aClass5_338;
			if (this.aClass5_61 == local5) {
				this.aClass5_62 = null;
				return;
			}
			local5.method9327(1);
		}
	}
}
