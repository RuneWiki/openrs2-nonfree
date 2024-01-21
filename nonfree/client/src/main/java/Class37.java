import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ja")
public final class Class37 {

	@OriginalMember(owner = "client!ja", name = "t", descriptor = "Lclient!sa;")
	private Class3 aClass3_56;

	@OriginalMember(owner = "client!ja", name = "a", descriptor = "Lclient!sa;")
	public final Class3 aClass3_55 = new Class3();

	@OriginalMember(owner = "client!ja", name = "<init>", descriptor = "()V")
	public Class37() {
		this.aClass3_55.aClass3_116 = this.aClass3_55;
		this.aClass3_55.aClass3_115 = this.aClass3_55;
	}

	@OriginalMember(owner = "client!ja", name = "a", descriptor = "(ILclient!sa;)V")
	public void method985(@OriginalArg(1) Class3 arg0) {
		if (arg0.aClass3_115 != null) {
			arg0.method2055();
		}
		arg0.aClass3_116 = this.aClass3_55;
		arg0.aClass3_115 = this.aClass3_55.aClass3_115;
		arg0.aClass3_115.aClass3_116 = arg0;
		arg0.aClass3_116.aClass3_115 = arg0;
	}

	@OriginalMember(owner = "client!ja", name = "a", descriptor = "(ZLclient!sa;Lclient!sa;)V")
	public void method986(@OriginalArg(1) Class3 arg0, @OriginalArg(2) Class3 arg1) {
		if (arg0.aClass3_115 != null) {
			arg0.method2055();
		}
		arg0.aClass3_115 = arg1.aClass3_115;
		arg0.aClass3_116 = arg1;
		arg0.aClass3_115.aClass3_116 = arg0;
		arg0.aClass3_116.aClass3_115 = arg0;
	}

	@OriginalMember(owner = "client!ja", name = "b", descriptor = "(I)Lclient!sa;")
	public Class3 method989() {
		@Pc(7) Class3 local7 = this.aClass3_55.aClass3_116;
		if (local7 == this.aClass3_55) {
			this.aClass3_56 = null;
			return null;
		} else {
			this.aClass3_56 = local7.aClass3_116;
			return local7;
		}
	}

	@OriginalMember(owner = "client!ja", name = "c", descriptor = "(I)Lclient!sa;")
	public Class3 method990() {
		@Pc(6) Class3 local6 = this.aClass3_56;
		if (local6 == this.aClass3_55) {
			this.aClass3_56 = null;
			return null;
		} else {
			this.aClass3_56 = local6.aClass3_116;
			return local6;
		}
	}

	@OriginalMember(owner = "client!ja", name = "a", descriptor = "(Lclient!sa;I)V")
	public void method991(@OriginalArg(0) Class3 arg0) {
		if (arg0.aClass3_115 != null) {
			arg0.method2055();
		}
		arg0.aClass3_115 = this.aClass3_55;
		arg0.aClass3_116 = this.aClass3_55.aClass3_116;
		arg0.aClass3_115.aClass3_116 = arg0;
		arg0.aClass3_116.aClass3_115 = arg0;
	}

	@OriginalMember(owner = "client!ja", name = "a", descriptor = "(B)Lclient!sa;")
	public Class3 method992() {
		@Pc(7) Class3 local7 = this.aClass3_55.aClass3_115;
		if (this.aClass3_55 == local7) {
			return null;
		} else {
			local7.method2055();
			return local7;
		}
	}

	@OriginalMember(owner = "client!ja", name = "a", descriptor = "(Z)Lclient!sa;")
	public Class3 method993() {
		@Pc(7) Class3 local7 = this.aClass3_56;
		if (local7 == this.aClass3_55) {
			this.aClass3_56 = null;
			return null;
		} else {
			this.aClass3_56 = local7.aClass3_115;
			return local7;
		}
	}

	@OriginalMember(owner = "client!ja", name = "c", descriptor = "(Z)V")
	public void method996() {
		while (true) {
			@Pc(14) Class3 local14 = this.aClass3_55.aClass3_116;
			if (this.aClass3_55 == local14) {
				return;
			}
			local14.method2055();
		}
	}

	@OriginalMember(owner = "client!ja", name = "b", descriptor = "(B)Lclient!sa;")
	public Class3 method997() {
		@Pc(7) Class3 local7 = this.aClass3_55.aClass3_115;
		if (this.aClass3_55 == local7) {
			this.aClass3_56 = null;
			return null;
		} else {
			this.aClass3_56 = local7.aClass3_115;
			return local7;
		}
	}

	@OriginalMember(owner = "client!ja", name = "c", descriptor = "(B)Lclient!sa;")
	public Class3 method999() {
		@Pc(12) Class3 local12 = this.aClass3_55.aClass3_116;
		if (this.aClass3_55 == local12) {
			return null;
		} else {
			local12.method2055();
			return local12;
		}
	}
}
