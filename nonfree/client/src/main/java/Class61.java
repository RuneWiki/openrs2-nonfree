import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!hi")
public final class Class61 {

	@OriginalMember(owner = "client!hi", name = "s", descriptor = "Lclient!im;")
	private Class1 aClass1_107;

	@OriginalMember(owner = "client!hi", name = "k", descriptor = "Lclient!im;")
	public Class1 aClass1_106 = new Class1();

	@OriginalMember(owner = "client!hi", name = "<init>", descriptor = "()V")
	public Class61() {
		this.aClass1_106.aClass1_230 = this.aClass1_106;
		this.aClass1_106.aClass1_231 = this.aClass1_106;
	}

	@OriginalMember(owner = "client!hi", name = "a", descriptor = "(I)Lclient!im;")
	public Class1 method1835() {
		@Pc(14) Class1 local14 = this.aClass1_106.aClass1_231;
		if (local14 == this.aClass1_106) {
			this.aClass1_107 = null;
			return null;
		} else {
			this.aClass1_107 = local14.aClass1_231;
			return local14;
		}
	}

	@OriginalMember(owner = "client!hi", name = "b", descriptor = "(I)Lclient!im;")
	public Class1 method1836() {
		@Pc(9) Class1 local9 = this.aClass1_107;
		if (this.aClass1_106 == local9) {
			this.aClass1_107 = null;
			return null;
		} else {
			this.aClass1_107 = local9.aClass1_231;
			return local9;
		}
	}

	@OriginalMember(owner = "client!hi", name = "c", descriptor = "(I)Lclient!im;")
	public Class1 method1838() {
		@Pc(7) Class1 local7 = this.aClass1_106.aClass1_230;
		if (local7 == this.aClass1_106) {
			this.aClass1_107 = null;
			return null;
		} else {
			this.aClass1_107 = local7.aClass1_230;
			return local7;
		}
	}

	@OriginalMember(owner = "client!hi", name = "a", descriptor = "(BLclient!im;)V")
	public void method1839(@OriginalArg(1) Class1 arg0) {
		if (arg0.aClass1_230 != null) {
			arg0.method4441();
		}
		arg0.aClass1_230 = this.aClass1_106.aClass1_230;
		arg0.aClass1_231 = this.aClass1_106;
		arg0.aClass1_230.aClass1_231 = arg0;
		arg0.aClass1_231.aClass1_230 = arg0;
	}

	@OriginalMember(owner = "client!hi", name = "a", descriptor = "(Lclient!im;I)V")
	public void method1843(@OriginalArg(0) Class1 arg0) {
		if (arg0.aClass1_230 != null) {
			arg0.method4441();
		}
		arg0.aClass1_230 = this.aClass1_106;
		arg0.aClass1_231 = this.aClass1_106.aClass1_231;
		arg0.aClass1_230.aClass1_231 = arg0;
		arg0.aClass1_231.aClass1_230 = arg0;
	}

	@OriginalMember(owner = "client!hi", name = "e", descriptor = "(I)V")
	public void method1845() {
		while (true) {
			@Pc(13) Class1 local13 = this.aClass1_106.aClass1_231;
			if (this.aClass1_106 == local13) {
				this.aClass1_107 = null;
				return;
			}
			local13.method4441();
		}
	}

	@OriginalMember(owner = "client!hi", name = "f", descriptor = "(I)Lclient!im;")
	public Class1 method1848() {
		@Pc(6) Class1 local6 = this.aClass1_107;
		if (local6 == this.aClass1_106) {
			this.aClass1_107 = null;
			return null;
		} else {
			this.aClass1_107 = local6.aClass1_230;
			return local6;
		}
	}

	@OriginalMember(owner = "client!hi", name = "g", descriptor = "(I)Z")
	public boolean method1849() {
		return this.aClass1_106.aClass1_231 == this.aClass1_106;
	}

	@OriginalMember(owner = "client!hi", name = "a", descriptor = "(B)Lclient!im;")
	public Class1 method1850() {
		@Pc(7) Class1 local7 = this.aClass1_106.aClass1_231;
		if (this.aClass1_106 == local7) {
			return null;
		} else {
			local7.method4441();
			return local7;
		}
	}
}
