import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!a")
public final class Class1 {

	@OriginalMember(owner = "client!a", name = "m", descriptor = "Lclient!ma;")
	private Class2 aClass2_2;

	@OriginalMember(owner = "client!a", name = "e", descriptor = "Lclient!ma;")
	public Class2 aClass2_1 = new Class2();

	@OriginalMember(owner = "client!a", name = "<init>", descriptor = "()V")
	public Class1() {
		this.aClass2_1.aClass2_230 = this.aClass2_1;
		this.aClass2_1.aClass2_231 = this.aClass2_1;
	}

	@OriginalMember(owner = "client!a", name = "a", descriptor = "(I)Z")
	public boolean method1() {
		return this.aClass2_1 == this.aClass2_1.aClass2_231;
	}

	@OriginalMember(owner = "client!a", name = "b", descriptor = "(I)Lclient!ma;")
	public Class2 method2() {
		@Pc(6) Class2 local6 = this.aClass2_2;
		if (this.aClass2_1 == local6) {
			this.aClass2_2 = null;
			return null;
		} else {
			this.aClass2_2 = local6.aClass2_230;
			return local6;
		}
	}

	@OriginalMember(owner = "client!a", name = "c", descriptor = "(I)Lclient!ma;")
	public Class2 method3() {
		@Pc(7) Class2 local7 = this.aClass2_1.aClass2_231;
		if (local7 == this.aClass2_1) {
			return null;
		} else {
			local7.method4926();
			return local7;
		}
	}

	@OriginalMember(owner = "client!a", name = "a", descriptor = "(B)Lclient!ma;")
	public Class2 method4() {
		@Pc(13) Class2 local13 = this.aClass2_1.aClass2_230;
		if (local13 == this.aClass2_1) {
			this.aClass2_2 = null;
			return null;
		} else {
			this.aClass2_2 = local13.aClass2_230;
			return local13;
		}
	}

	@OriginalMember(owner = "client!a", name = "a", descriptor = "(Lclient!ma;B)V")
	public void method8(@OriginalArg(0) Class2 arg0) {
		if (arg0.aClass2_230 != null) {
			arg0.method4926();
		}
		arg0.aClass2_230 = this.aClass2_1;
		arg0.aClass2_231 = this.aClass2_1.aClass2_231;
		arg0.aClass2_230.aClass2_231 = arg0;
		arg0.aClass2_231.aClass2_230 = arg0;
	}

	@OriginalMember(owner = "client!a", name = "b", descriptor = "(B)Lclient!ma;")
	public Class2 method9() {
		@Pc(6) Class2 local6 = this.aClass2_2;
		if (local6 == this.aClass2_1) {
			this.aClass2_2 = null;
			return null;
		} else {
			this.aClass2_2 = local6.aClass2_231;
			return local6;
		}
	}

	@OriginalMember(owner = "client!a", name = "e", descriptor = "(I)V")
	public void method10() {
		while (true) {
			@Pc(13) Class2 local13 = this.aClass2_1.aClass2_231;
			if (local13 == this.aClass2_1) {
				this.aClass2_2 = null;
				return;
			}
			local13.method4926();
		}
	}

	@OriginalMember(owner = "client!a", name = "a", descriptor = "(Lclient!ma;I)V")
	public void method11(@OriginalArg(0) Class2 arg0) {
		if (arg0.aClass2_230 != null) {
			arg0.method4926();
		}
		arg0.aClass2_231 = this.aClass2_1;
		arg0.aClass2_230 = this.aClass2_1.aClass2_230;
		arg0.aClass2_230.aClass2_231 = arg0;
		arg0.aClass2_231.aClass2_230 = arg0;
	}

	@OriginalMember(owner = "client!a", name = "g", descriptor = "(I)Lclient!ma;")
	public Class2 method13() {
		@Pc(7) Class2 local7 = this.aClass2_1.aClass2_231;
		if (local7 == this.aClass2_1) {
			this.aClass2_2 = null;
			return null;
		} else {
			this.aClass2_2 = local7.aClass2_231;
			return local7;
		}
	}
}
