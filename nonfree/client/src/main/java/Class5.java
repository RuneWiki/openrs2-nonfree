import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ad")
public final class Class5 {

	@OriginalMember(owner = "client!ad", name = "o", descriptor = "Lclient!ka;")
	private Class3 aClass3_10;

	@OriginalMember(owner = "client!ad", name = "n", descriptor = "Lclient!ka;")
	public final Class3 aClass3_9 = new Class3();

	@OriginalMember(owner = "client!ad", name = "<init>", descriptor = "()V")
	public Class5() {
		this.aClass3_9.aClass3_118 = this.aClass3_9;
		this.aClass3_9.aClass3_117 = this.aClass3_9;
	}

	@OriginalMember(owner = "client!ad", name = "a", descriptor = "(Z)Lclient!ka;")
	public Class3 method78() {
		@Pc(12) Class3 local12 = this.aClass3_9.aClass3_117;
		if (local12 == this.aClass3_9) {
			return null;
		} else {
			local12.method2264();
			return local12;
		}
	}

	@OriginalMember(owner = "client!ad", name = "a", descriptor = "(I)Lclient!ka;")
	public Class3 method79() {
		@Pc(2) Class3 local2 = this.aClass3_10;
		if (local2 == this.aClass3_9) {
			this.aClass3_10 = null;
			return null;
		} else {
			this.aClass3_10 = local2.aClass3_118;
			return local2;
		}
	}

	@OriginalMember(owner = "client!ad", name = "b", descriptor = "(I)Lclient!ka;")
	public Class3 method81() {
		@Pc(12) Class3 local12 = this.aClass3_9.aClass3_118;
		if (local12 == this.aClass3_9) {
			return null;
		} else {
			local12.method2264();
			return local12;
		}
	}

	@OriginalMember(owner = "client!ad", name = "a", descriptor = "(Lclient!ka;I)V")
	public void method85(@OriginalArg(0) Class3 arg0) {
		if (arg0.aClass3_118 != null) {
			arg0.method2264();
		}
		arg0.aClass3_118 = this.aClass3_9;
		arg0.aClass3_117 = this.aClass3_9.aClass3_117;
		arg0.aClass3_118.aClass3_117 = arg0;
		arg0.aClass3_117.aClass3_118 = arg0;
	}

	@OriginalMember(owner = "client!ad", name = "a", descriptor = "(Lclient!ka;B)V")
	public void method87(@OriginalArg(0) Class3 arg0) {
		if (arg0.aClass3_118 != null) {
			arg0.method2264();
		}
		arg0.aClass3_117 = this.aClass3_9;
		arg0.aClass3_118 = this.aClass3_9.aClass3_118;
		arg0.aClass3_118.aClass3_117 = arg0;
		arg0.aClass3_117.aClass3_118 = arg0;
	}

	@OriginalMember(owner = "client!ad", name = "a", descriptor = "(Lclient!ka;Lclient!ka;I)V")
	public void method89(@OriginalArg(0) Class3 arg0, @OriginalArg(1) Class3 arg1) {
		if (arg0.aClass3_118 != null) {
			arg0.method2264();
		}
		arg0.aClass3_118 = arg1.aClass3_118;
		arg0.aClass3_117 = arg1;
		arg0.aClass3_118.aClass3_117 = arg0;
		arg0.aClass3_117.aClass3_118 = arg0;
	}

	@OriginalMember(owner = "client!ad", name = "b", descriptor = "(B)Lclient!ka;")
	public Class3 method90() {
		@Pc(6) Class3 local6 = this.aClass3_10;
		if (this.aClass3_9 == local6) {
			this.aClass3_10 = null;
			return null;
		} else {
			this.aClass3_10 = local6.aClass3_117;
			return local6;
		}
	}

	@OriginalMember(owner = "client!ad", name = "d", descriptor = "(I)V")
	public void method91() {
		while (true) {
			@Pc(12) Class3 local12 = this.aClass3_9.aClass3_117;
			if (local12 == this.aClass3_9) {
				return;
			}
			local12.method2264();
		}
	}

	@OriginalMember(owner = "client!ad", name = "e", descriptor = "(I)Lclient!ka;")
	public Class3 method92() {
		@Pc(7) Class3 local7 = this.aClass3_9.aClass3_117;
		if (local7 == this.aClass3_9) {
			this.aClass3_10 = null;
			return null;
		} else {
			this.aClass3_10 = local7.aClass3_117;
			return local7;
		}
	}

	@OriginalMember(owner = "client!ad", name = "g", descriptor = "(I)Lclient!ka;")
	public Class3 method94() {
		@Pc(12) Class3 local12 = this.aClass3_9.aClass3_118;
		if (local12 == this.aClass3_9) {
			this.aClass3_10 = null;
			return null;
		} else {
			this.aClass3_10 = local12.aClass3_118;
			return local12;
		}
	}
}
