import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!eb")
public final class Class42 {

	@OriginalMember(owner = "client!eb", name = "s", descriptor = "Lclient!gk;")
	private Class1 aClass1_74;

	@OriginalMember(owner = "client!eb", name = "b", descriptor = "Lclient!gk;")
	public final Class1 aClass1_73 = new Class1();

	static {
		new Class106("Unable to send abuse report - system busy.", "Unable to send abuse report - system busy.", "Unable to send abuse report - system busy.", "Unable to send abuse report - system busy.");
	}

	@OriginalMember(owner = "client!eb", name = "<init>", descriptor = "()V")
	public Class42() {
		this.aClass1_73.aClass1_251 = this.aClass1_73;
		this.aClass1_73.aClass1_252 = this.aClass1_73;
	}

	@OriginalMember(owner = "client!eb", name = "a", descriptor = "(B)Z")
	public boolean method1538() {
		return this.aClass1_73.aClass1_251 == this.aClass1_73;
	}

	@OriginalMember(owner = "client!eb", name = "a", descriptor = "(ILclient!gk;)V")
	public void method1539(@OriginalArg(1) Class1 arg0) {
		if (arg0.aClass1_252 != null) {
			arg0.method6045();
		}
		arg0.aClass1_251 = this.aClass1_73.aClass1_251;
		arg0.aClass1_252 = this.aClass1_73;
		arg0.aClass1_252.aClass1_251 = arg0;
		arg0.aClass1_251.aClass1_252 = arg0;
	}

	@OriginalMember(owner = "client!eb", name = "b", descriptor = "(I)Lclient!gk;")
	public Class1 method1541() {
		@Pc(7) Class1 local7 = this.aClass1_73.aClass1_251;
		if (local7 == this.aClass1_73) {
			return null;
		} else {
			local7.method6045();
			return local7;
		}
	}

	@OriginalMember(owner = "client!eb", name = "c", descriptor = "(I)V")
	public void method1542() {
		while (true) {
			@Pc(5) Class1 local5 = this.aClass1_73.aClass1_251;
			if (local5 == this.aClass1_73) {
				this.aClass1_74 = null;
				return;
			}
			local5.method6045();
		}
	}

	@OriginalMember(owner = "client!eb", name = "d", descriptor = "(I)Lclient!gk;")
	public Class1 method1543() {
		@Pc(12) Class1 local12 = this.aClass1_73.aClass1_251;
		if (this.aClass1_73 == local12) {
			this.aClass1_74 = null;
			return null;
		} else {
			this.aClass1_74 = local12.aClass1_251;
			return local12;
		}
	}

	@OriginalMember(owner = "client!eb", name = "e", descriptor = "(I)Lclient!gk;")
	public Class1 method1544() {
		@Pc(12) Class1 local12 = this.aClass1_73.aClass1_252;
		if (this.aClass1_73 == local12) {
			this.aClass1_74 = null;
			return null;
		} else {
			this.aClass1_74 = local12.aClass1_252;
			return local12;
		}
	}

	@OriginalMember(owner = "client!eb", name = "f", descriptor = "(I)Lclient!gk;")
	public Class1 method1547() {
		@Pc(13) Class1 local13 = this.aClass1_74;
		if (this.aClass1_73 == local13) {
			this.aClass1_74 = null;
			return null;
		} else {
			this.aClass1_74 = local13.aClass1_252;
			return local13;
		}
	}

	@OriginalMember(owner = "client!eb", name = "b", descriptor = "(B)I")
	public int method1548() {
		@Pc(7) int local7 = 0;
		@Pc(11) Class1 local11 = this.aClass1_73.aClass1_251;
		while (this.aClass1_73 != local11) {
			local11 = local11.aClass1_251;
			local7++;
		}
		return local7;
	}

	@OriginalMember(owner = "client!eb", name = "b", descriptor = "(ILclient!gk;)V")
	public void method1549(@OriginalArg(1) Class1 arg0) {
		if (arg0.aClass1_252 != null) {
			arg0.method6045();
		}
		arg0.aClass1_251 = this.aClass1_73;
		arg0.aClass1_252 = this.aClass1_73.aClass1_252;
		arg0.aClass1_252.aClass1_251 = arg0;
		arg0.aClass1_251.aClass1_252 = arg0;
	}

	@OriginalMember(owner = "client!eb", name = "c", descriptor = "(B)Lclient!gk;")
	public Class1 method1551() {
		@Pc(13) Class1 local13 = this.aClass1_74;
		if (local13 == this.aClass1_73) {
			this.aClass1_74 = null;
			return null;
		} else {
			this.aClass1_74 = local13.aClass1_251;
			return local13;
		}
	}

	@OriginalMember(owner = "client!eb", name = "a", descriptor = "(BLclient!eb;Lclient!gk;)V")
	private void method1552(@OriginalArg(1) Class42 arg0, @OriginalArg(2) Class1 arg1) {
		@Pc(7) Class1 local7 = this.aClass1_73.aClass1_252;
		this.aClass1_73.aClass1_252 = arg1.aClass1_252;
		arg1.aClass1_252.aClass1_251 = this.aClass1_73;
		if (this.aClass1_73 != arg1) {
			arg1.aClass1_252 = arg0.aClass1_73.aClass1_252;
			arg1.aClass1_252.aClass1_251 = arg1;
			local7.aClass1_251 = arg0.aClass1_73;
			arg0.aClass1_73.aClass1_252 = local7;
		}
	}

	@OriginalMember(owner = "client!eb", name = "a", descriptor = "(ILclient!eb;)V")
	public void method1553(@OriginalArg(1) Class42 arg0) {
		this.method1552(arg0, this.aClass1_73.aClass1_251);
	}
}
