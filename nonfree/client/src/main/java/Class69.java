import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!hh")
public final class Class69 {

	@OriginalMember(owner = "client!hh", name = "n", descriptor = "Lclient!tf;")
	private Class1 aClass1_86;

	@OriginalMember(owner = "client!hh", name = "k", descriptor = "Lclient!tf;")
	public Class1 aClass1_85 = new Class1();

	@OriginalMember(owner = "client!hh", name = "<init>", descriptor = "()V")
	public Class69() {
		this.aClass1_85.aClass1_230 = this.aClass1_85;
		this.aClass1_85.aClass1_231 = this.aClass1_85;
	}

	@OriginalMember(owner = "client!hh", name = "a", descriptor = "(B)Z")
	public boolean method1626() {
		return this.aClass1_85.aClass1_230 == this.aClass1_85;
	}

	@OriginalMember(owner = "client!hh", name = "a", descriptor = "(ILclient!tf;)V")
	public void method1627(@OriginalArg(1) Class1 arg0) {
		if (arg0.aClass1_231 != null) {
			arg0.method4534();
		}
		arg0.aClass1_230 = this.aClass1_85.aClass1_230;
		arg0.aClass1_231 = this.aClass1_85;
		arg0.aClass1_231.aClass1_230 = arg0;
		arg0.aClass1_230.aClass1_231 = arg0;
	}

	@OriginalMember(owner = "client!hh", name = "b", descriptor = "(ILclient!tf;)V")
	public void method1628(@OriginalArg(1) Class1 arg0) {
		if (arg0.aClass1_231 != null) {
			arg0.method4534();
		}
		arg0.aClass1_230 = this.aClass1_85;
		arg0.aClass1_231 = this.aClass1_85.aClass1_231;
		arg0.aClass1_231.aClass1_230 = arg0;
		arg0.aClass1_230.aClass1_231 = arg0;
	}

	@OriginalMember(owner = "client!hh", name = "a", descriptor = "(I)V")
	public void method1629() {
		while (true) {
			@Pc(15) Class1 local15 = this.aClass1_85.aClass1_230;
			if (local15 == this.aClass1_85) {
				this.aClass1_86 = null;
				return;
			}
			local15.method4534();
		}
	}

	@OriginalMember(owner = "client!hh", name = "b", descriptor = "(B)Lclient!tf;")
	public Class1 method1630() {
		@Pc(7) Class1 local7 = this.aClass1_85.aClass1_230;
		if (this.aClass1_85 == local7) {
			return null;
		} else {
			local7.method4534();
			return local7;
		}
	}

	@OriginalMember(owner = "client!hh", name = "a", descriptor = "(Z)Lclient!tf;")
	public Class1 method1631() {
		@Pc(11) Class1 local11 = this.aClass1_86;
		if (this.aClass1_85 == local11) {
			this.aClass1_86 = null;
			return null;
		} else {
			this.aClass1_86 = local11.aClass1_230;
			return local11;
		}
	}

	@OriginalMember(owner = "client!hh", name = "c", descriptor = "(B)Lclient!tf;")
	public Class1 method1632() {
		@Pc(3) Class1 local3 = this.aClass1_85.aClass1_231;
		if (local3 == this.aClass1_85) {
			this.aClass1_86 = null;
			return null;
		} else {
			this.aClass1_86 = local3.aClass1_231;
			return local3;
		}
	}

	@OriginalMember(owner = "client!hh", name = "b", descriptor = "(I)Lclient!tf;")
	public Class1 method1635() {
		@Pc(9) Class1 local9 = this.aClass1_86;
		if (this.aClass1_85 == local9) {
			this.aClass1_86 = null;
			return null;
		} else {
			this.aClass1_86 = local9.aClass1_231;
			return local9;
		}
	}

	@OriginalMember(owner = "client!hh", name = "c", descriptor = "(I)Lclient!tf;")
	public Class1 method1636() {
		@Pc(12) Class1 local12 = this.aClass1_85.aClass1_230;
		if (this.aClass1_85 == local12) {
			this.aClass1_86 = null;
			return null;
		} else {
			this.aClass1_86 = local12.aClass1_230;
			return local12;
		}
	}
}
