import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!sc")
public final class Class72 {

	@OriginalMember(owner = "client!sc", name = "s", descriptor = "Lclient!od;")
	private Class3 aClass3_178;

	@OriginalMember(owner = "client!sc", name = "o", descriptor = "Lclient!od;")
	public final Class3 aClass3_177 = new Class3();

	@OriginalMember(owner = "client!sc", name = "<init>", descriptor = "()V")
	public Class72() {
		this.aClass3_177.aClass3_209 = this.aClass3_177;
		this.aClass3_177.aClass3_210 = this.aClass3_177;
	}

	@OriginalMember(owner = "client!sc", name = "a", descriptor = "(I)V")
	public void method2396() {
		while (true) {
			@Pc(15) Class3 local15 = this.aClass3_177.aClass3_210;
			if (this.aClass3_177 == local15) {
				return;
			}
			local15.method2783();
		}
	}

	@OriginalMember(owner = "client!sc", name = "a", descriptor = "(ILclient!od;)V")
	public void method2397(@OriginalArg(1) Class3 arg0) {
		if (arg0.aClass3_209 != null) {
			arg0.method2783();
		}
		arg0.aClass3_210 = this.aClass3_177.aClass3_210;
		arg0.aClass3_209 = this.aClass3_177;
		arg0.aClass3_209.aClass3_210 = arg0;
		arg0.aClass3_210.aClass3_209 = arg0;
	}

	@OriginalMember(owner = "client!sc", name = "a", descriptor = "(Z)Lclient!od;")
	public Class3 method2398() {
		@Pc(11) Class3 local11 = this.aClass3_178;
		if (local11 == this.aClass3_177) {
			this.aClass3_178 = null;
			return null;
		} else {
			this.aClass3_178 = local11.aClass3_209;
			return local11;
		}
	}

	@OriginalMember(owner = "client!sc", name = "a", descriptor = "(B)Lclient!od;")
	public Class3 method2401() {
		@Pc(12) Class3 local12 = this.aClass3_177.aClass3_210;
		if (this.aClass3_177 == local12) {
			this.aClass3_178 = null;
			return null;
		} else {
			this.aClass3_178 = local12.aClass3_210;
			return local12;
		}
	}

	@OriginalMember(owner = "client!sc", name = "c", descriptor = "(I)Lclient!od;")
	public Class3 method2403() {
		@Pc(15) Class3 local15 = this.aClass3_177.aClass3_209;
		if (this.aClass3_177 == local15) {
			this.aClass3_178 = null;
			return null;
		} else {
			this.aClass3_178 = local15.aClass3_209;
			return local15;
		}
	}

	@OriginalMember(owner = "client!sc", name = "b", descriptor = "(ILclient!od;)V")
	public void method2404(@OriginalArg(1) Class3 arg0) {
		if (arg0.aClass3_209 != null) {
			arg0.method2783();
		}
		arg0.aClass3_210 = this.aClass3_177;
		arg0.aClass3_209 = this.aClass3_177.aClass3_209;
		arg0.aClass3_209.aClass3_210 = arg0;
		arg0.aClass3_210.aClass3_209 = arg0;
	}

	@OriginalMember(owner = "client!sc", name = "a", descriptor = "(Lclient!od;Lclient!od;I)V")
	public void method2405(@OriginalArg(0) Class3 arg0, @OriginalArg(1) Class3 arg1) {
		if (arg0.aClass3_209 != null) {
			arg0.method2783();
		}
		arg0.aClass3_210 = arg1;
		arg0.aClass3_209 = arg1.aClass3_209;
		arg0.aClass3_209.aClass3_210 = arg0;
		arg0.aClass3_210.aClass3_209 = arg0;
	}

	@OriginalMember(owner = "client!sc", name = "b", descriptor = "(Z)Lclient!od;")
	public Class3 method2406() {
		@Pc(12) Class3 local12 = this.aClass3_177.aClass3_210;
		if (this.aClass3_177 == local12) {
			return null;
		} else {
			local12.method2783();
			return local12;
		}
	}

	@OriginalMember(owner = "client!sc", name = "b", descriptor = "(B)Lclient!od;")
	public Class3 method2407() {
		@Pc(14) Class3 local14 = this.aClass3_178;
		if (local14 == this.aClass3_177) {
			this.aClass3_178 = null;
			return null;
		} else {
			this.aClass3_178 = local14.aClass3_210;
			return local14;
		}
	}
}
