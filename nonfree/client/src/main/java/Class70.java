import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!of")
public final class Class70 {

	@OriginalMember(owner = "client!of", name = "J", descriptor = "Lclient!n;")
	private Class3 aClass3_140;

	@OriginalMember(owner = "client!of", name = "C", descriptor = "Lclient!n;")
	public final Class3 aClass3_139 = new Class3();

	@OriginalMember(owner = "client!of", name = "<init>", descriptor = "()V")
	public Class70() {
		this.aClass3_139.aClass3_216 = this.aClass3_139;
		this.aClass3_139.aClass3_215 = this.aClass3_139;
	}

	@OriginalMember(owner = "client!of", name = "a", descriptor = "(ILclient!n;Lclient!n;)V")
	public void method1947(@OriginalArg(1) Class3 arg0, @OriginalArg(2) Class3 arg1) {
		if (arg1.aClass3_216 != null) {
			arg1.method3159();
		}
		arg1.aClass3_215 = arg0;
		arg1.aClass3_216 = arg0.aClass3_216;
		arg1.aClass3_216.aClass3_215 = arg1;
		arg1.aClass3_215.aClass3_216 = arg1;
	}

	@OriginalMember(owner = "client!of", name = "a", descriptor = "(B)Lclient!n;")
	public Class3 method1948() {
		@Pc(6) Class3 local6 = this.aClass3_140;
		if (local6 == this.aClass3_139) {
			this.aClass3_140 = null;
			return null;
		} else {
			this.aClass3_140 = local6.aClass3_215;
			return local6;
		}
	}

	@OriginalMember(owner = "client!of", name = "b", descriptor = "(I)Lclient!n;")
	public Class3 method1953() {
		@Pc(12) Class3 local12 = this.aClass3_139.aClass3_215;
		if (this.aClass3_139 == local12) {
			this.aClass3_140 = null;
			return null;
		} else {
			this.aClass3_140 = local12.aClass3_215;
			return local12;
		}
	}

	@OriginalMember(owner = "client!of", name = "b", descriptor = "(B)V")
	public void method1954() {
		while (true) {
			@Pc(11) Class3 local11 = this.aClass3_139.aClass3_215;
			if (this.aClass3_139 == local11) {
				return;
			}
			local11.method3159();
		}
	}

	@OriginalMember(owner = "client!of", name = "d", descriptor = "(I)Lclient!n;")
	public Class3 method1956() {
		@Pc(12) Class3 local12 = this.aClass3_139.aClass3_216;
		if (local12 == this.aClass3_139) {
			this.aClass3_140 = null;
			return null;
		} else {
			this.aClass3_140 = local12.aClass3_216;
			return local12;
		}
	}

	@OriginalMember(owner = "client!of", name = "e", descriptor = "(I)Lclient!n;")
	public Class3 method1957() {
		@Pc(11) Class3 local11 = this.aClass3_139.aClass3_215;
		if (this.aClass3_139 == local11) {
			return null;
		} else {
			local11.method3159();
			return local11;
		}
	}

	@OriginalMember(owner = "client!of", name = "a", descriptor = "(ZLclient!n;)V")
	public void method1958(@OriginalArg(1) Class3 arg0) {
		if (arg0.aClass3_216 != null) {
			arg0.method3159();
		}
		arg0.aClass3_216 = this.aClass3_139.aClass3_216;
		arg0.aClass3_215 = this.aClass3_139;
		arg0.aClass3_216.aClass3_215 = arg0;
		arg0.aClass3_215.aClass3_216 = arg0;
	}

	@OriginalMember(owner = "client!of", name = "f", descriptor = "(I)Lclient!n;")
	public Class3 method1961() {
		@Pc(6) Class3 local6 = this.aClass3_140;
		if (local6 == this.aClass3_139) {
			this.aClass3_140 = null;
			return null;
		} else {
			this.aClass3_140 = local6.aClass3_216;
			return local6;
		}
	}

	@OriginalMember(owner = "client!of", name = "a", descriptor = "(ILclient!n;)V")
	public void method1963(@OriginalArg(1) Class3 arg0) {
		if (arg0.aClass3_216 != null) {
			arg0.method3159();
		}
		arg0.aClass3_216 = this.aClass3_139;
		arg0.aClass3_215 = this.aClass3_139.aClass3_215;
		arg0.aClass3_216.aClass3_215 = arg0;
		arg0.aClass3_215.aClass3_216 = arg0;
	}
}
