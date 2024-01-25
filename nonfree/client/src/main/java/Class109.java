import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!fha")
public final class Class109 {

	@OriginalMember(owner = "client!fha", name = "m", descriptor = "Lclient!tq;")
	private Class2 aClass2_79;

	@OriginalMember(owner = "client!fha", name = "a", descriptor = "Lclient!tq;")
	public final Class2 aClass2_78 = new Class2();

	@OriginalMember(owner = "client!fha", name = "<init>", descriptor = "()V")
	public Class109() {
		this.aClass2_78.aClass2_300 = this.aClass2_78;
		this.aClass2_78.aClass2_299 = this.aClass2_78;
	}

	@OriginalMember(owner = "client!fha", name = "a", descriptor = "(I)Lclient!tq;")
	public Class2 method2318() {
		@Pc(6) Class2 local6 = this.aClass2_79;
		if (this.aClass2_78 == local6) {
			this.aClass2_79 = null;
			return null;
		} else {
			this.aClass2_79 = local6.aClass2_300;
			return local6;
		}
	}

	@OriginalMember(owner = "client!fha", name = "a", descriptor = "(B)I")
	public int method2320() {
		@Pc(13) int local13 = 0;
		@Pc(17) Class2 local17 = this.aClass2_78.aClass2_300;
		while (local17 != this.aClass2_78) {
			local17 = local17.aClass2_300;
			local13++;
		}
		return local13;
	}

	@OriginalMember(owner = "client!fha", name = "b", descriptor = "(I)Lclient!tq;")
	public Class2 method2321() {
		@Pc(7) Class2 local7 = this.aClass2_78.aClass2_299;
		if (local7 == this.aClass2_78) {
			this.aClass2_79 = null;
			return null;
		} else {
			this.aClass2_79 = local7.aClass2_299;
			return local7;
		}
	}

	@OriginalMember(owner = "client!fha", name = "b", descriptor = "(Z)Lclient!tq;")
	public Class2 method2322() {
		@Pc(7) Class2 local7 = this.aClass2_78.aClass2_300;
		if (this.aClass2_78 == local7) {
			return null;
		} else {
			local7.method8653();
			return local7;
		}
	}

	@OriginalMember(owner = "client!fha", name = "a", descriptor = "(ILclient!tq;)V")
	public void method2323(@OriginalArg(1) Class2 arg0) {
		if (arg0.aClass2_299 != null) {
			arg0.method8653();
		}
		arg0.aClass2_299 = this.aClass2_78.aClass2_299;
		arg0.aClass2_300 = this.aClass2_78;
		arg0.aClass2_299.aClass2_300 = arg0;
		arg0.aClass2_300.aClass2_299 = arg0;
	}

	@OriginalMember(owner = "client!fha", name = "b", descriptor = "(B)Lclient!tq;")
	public Class2 method2324() {
		@Pc(6) Class2 local6 = this.aClass2_79;
		if (local6 == this.aClass2_78) {
			this.aClass2_79 = null;
			return null;
		} else {
			this.aClass2_79 = local6.aClass2_299;
			return local6;
		}
	}

	@OriginalMember(owner = "client!fha", name = "c", descriptor = "(B)Lclient!tq;")
	public Class2 method2325() {
		@Pc(14) Class2 local14 = this.aClass2_78.aClass2_300;
		if (this.aClass2_78 == local14) {
			this.aClass2_79 = null;
			return null;
		} else {
			this.aClass2_79 = local14.aClass2_300;
			return local14;
		}
	}

	@OriginalMember(owner = "client!fha", name = "a", descriptor = "(ZLclient!fha;Lclient!tq;)V")
	private void method2327(@OriginalArg(1) Class109 arg0, @OriginalArg(2) Class2 arg1) {
		@Pc(7) Class2 local7 = this.aClass2_78.aClass2_299;
		this.aClass2_78.aClass2_299 = arg1.aClass2_299;
		arg1.aClass2_299.aClass2_300 = this.aClass2_78;
		if (arg1 != this.aClass2_78) {
			arg1.aClass2_299 = arg0.aClass2_78.aClass2_299;
			arg1.aClass2_299.aClass2_300 = arg1;
			local7.aClass2_300 = arg0.aClass2_78;
			arg0.aClass2_78.aClass2_299 = local7;
		}
	}

	@OriginalMember(owner = "client!fha", name = "d", descriptor = "(B)Z")
	public boolean method2328() {
		return this.aClass2_78.aClass2_300 == this.aClass2_78;
	}

	@OriginalMember(owner = "client!fha", name = "c", descriptor = "(I)V")
	public void method2329() {
		while (true) {
			@Pc(12) Class2 local12 = this.aClass2_78.aClass2_300;
			if (local12 == this.aClass2_78) {
				this.aClass2_79 = null;
				return;
			}
			local12.method8653();
		}
	}

	@OriginalMember(owner = "client!fha", name = "a", descriptor = "(Lclient!fha;B)V")
	public void method2330(@OriginalArg(0) Class109 arg0) {
		this.method2327(arg0, this.aClass2_78.aClass2_300);
	}

	@OriginalMember(owner = "client!fha", name = "a", descriptor = "(Lclient!tq;B)V")
	public void method2331(@OriginalArg(0) Class2 arg0) {
		if (arg0.aClass2_299 != null) {
			arg0.method8653();
		}
		arg0.aClass2_299 = this.aClass2_78;
		arg0.aClass2_300 = this.aClass2_78.aClass2_300;
		arg0.aClass2_299.aClass2_300 = arg0;
		arg0.aClass2_300.aClass2_299 = arg0;
	}
}
