import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!jo")
public final class Class96 {

	@OriginalMember(owner = "client!jo", name = "u", descriptor = "Lclient!ak;")
	private Class1 aClass1_110;

	@OriginalMember(owner = "client!jo", name = "p", descriptor = "Lclient!ak;")
	public Class1 aClass1_109 = new Class1();

	@OriginalMember(owner = "client!jo", name = "<init>", descriptor = "()V")
	public Class96() {
		this.aClass1_109.aClass1_235 = this.aClass1_109;
		this.aClass1_109.aClass1_234 = this.aClass1_109;
	}

	@OriginalMember(owner = "client!jo", name = "a", descriptor = "(ILclient!ak;)V")
	public void method2336(@OriginalArg(1) Class1 arg0) {
		if (arg0.aClass1_234 != null) {
			arg0.method4573();
		}
		arg0.aClass1_235 = this.aClass1_109;
		arg0.aClass1_234 = this.aClass1_109.aClass1_234;
		arg0.aClass1_234.aClass1_235 = arg0;
		arg0.aClass1_235.aClass1_234 = arg0;
	}

	@OriginalMember(owner = "client!jo", name = "a", descriptor = "(Lclient!ak;B)V")
	public void method2337(@OriginalArg(0) Class1 arg0) {
		if (arg0.aClass1_234 != null) {
			arg0.method4573();
		}
		arg0.aClass1_234 = this.aClass1_109;
		arg0.aClass1_235 = this.aClass1_109.aClass1_235;
		arg0.aClass1_234.aClass1_235 = arg0;
		arg0.aClass1_235.aClass1_234 = arg0;
	}

	@OriginalMember(owner = "client!jo", name = "a", descriptor = "(I)Lclient!ak;")
	public Class1 method2339() {
		@Pc(13) Class1 local13 = this.aClass1_109.aClass1_235;
		if (this.aClass1_109 == local13) {
			return null;
		} else {
			local13.method4573();
			return local13;
		}
	}

	@OriginalMember(owner = "client!jo", name = "b", descriptor = "(I)Lclient!ak;")
	public Class1 method2340() {
		@Pc(15) Class1 local15 = this.aClass1_109.aClass1_235;
		if (this.aClass1_109 == local15) {
			this.aClass1_110 = null;
			return null;
		} else {
			this.aClass1_110 = local15.aClass1_235;
			return local15;
		}
	}

	@OriginalMember(owner = "client!jo", name = "c", descriptor = "(I)V")
	public void method2341() {
		while (true) {
			@Pc(9) Class1 local9 = this.aClass1_109.aClass1_235;
			if (local9 == this.aClass1_109) {
				this.aClass1_110 = null;
				return;
			}
			local9.method4573();
		}
	}

	@OriginalMember(owner = "client!jo", name = "b", descriptor = "(B)Lclient!ak;")
	public Class1 method2342() {
		@Pc(13) Class1 local13 = this.aClass1_110;
		if (this.aClass1_109 == local13) {
			this.aClass1_110 = null;
			return null;
		} else {
			this.aClass1_110 = local13.aClass1_235;
			return local13;
		}
	}

	@OriginalMember(owner = "client!jo", name = "a", descriptor = "(Z)Z")
	public boolean method2343() {
		return this.aClass1_109.aClass1_235 == this.aClass1_109;
	}

	@OriginalMember(owner = "client!jo", name = "e", descriptor = "(I)Lclient!ak;")
	public Class1 method2345() {
		@Pc(13) Class1 local13 = this.aClass1_109.aClass1_234;
		if (this.aClass1_109 == local13) {
			this.aClass1_110 = null;
			return null;
		} else {
			this.aClass1_110 = local13.aClass1_234;
			return local13;
		}
	}

	@OriginalMember(owner = "client!jo", name = "f", descriptor = "(I)Lclient!ak;")
	public Class1 method2347() {
		@Pc(13) Class1 local13 = this.aClass1_110;
		if (this.aClass1_109 == local13) {
			this.aClass1_110 = null;
			return null;
		} else {
			this.aClass1_110 = local13.aClass1_234;
			return local13;
		}
	}
}
