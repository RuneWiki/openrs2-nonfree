import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!v")
public final class Class91 {

	@OriginalMember(owner = "client!v", name = "t", descriptor = "Lclient!ji;")
	private Class1 aClass1_198;

	@OriginalMember(owner = "client!v", name = "o", descriptor = "Lclient!ji;")
	public final Class1 aClass1_197 = new Class1();

	@OriginalMember(owner = "client!v", name = "<init>", descriptor = "()V")
	public Class91() {
		this.aClass1_197.aClass1_213 = this.aClass1_197;
		this.aClass1_197.aClass1_214 = this.aClass1_197;
	}

	@OriginalMember(owner = "client!v", name = "a", descriptor = "(I)Lclient!ji;")
	public Class1 method3142() {
		@Pc(11) Class1 local11 = this.aClass1_198;
		if (this.aClass1_197 == local11) {
			this.aClass1_198 = null;
			return null;
		} else {
			this.aClass1_198 = local11.aClass1_214;
			return local11;
		}
	}

	@OriginalMember(owner = "client!v", name = "a", descriptor = "(Lclient!ji;ILclient!ji;)V")
	public void method3144(@OriginalArg(0) Class1 arg0, @OriginalArg(2) Class1 arg1) {
		if (arg0.aClass1_214 != null) {
			arg0.method3295();
		}
		arg0.aClass1_213 = arg1;
		arg0.aClass1_214 = arg1.aClass1_214;
		arg0.aClass1_214.aClass1_213 = arg0;
		arg0.aClass1_213.aClass1_214 = arg0;
	}

	@OriginalMember(owner = "client!v", name = "b", descriptor = "(I)Lclient!ji;")
	public Class1 method3145() {
		@Pc(7) Class1 local7 = this.aClass1_197.aClass1_213;
		if (this.aClass1_197 == local7) {
			return null;
		} else {
			local7.method3295();
			return local7;
		}
	}

	@OriginalMember(owner = "client!v", name = "a", descriptor = "(Lclient!ji;I)V")
	public void method3146(@OriginalArg(0) Class1 arg0) {
		if (arg0.aClass1_214 != null) {
			arg0.method3295();
		}
		arg0.aClass1_214 = this.aClass1_197;
		arg0.aClass1_213 = this.aClass1_197.aClass1_213;
		arg0.aClass1_214.aClass1_213 = arg0;
		arg0.aClass1_213.aClass1_214 = arg0;
	}

	@OriginalMember(owner = "client!v", name = "c", descriptor = "(I)V")
	public void method3147() {
		while (true) {
			@Pc(24) Class1 local24 = this.aClass1_197.aClass1_213;
			if (this.aClass1_197 == local24) {
				return;
			}
			local24.method3295();
		}
	}

	@OriginalMember(owner = "client!v", name = "d", descriptor = "(I)Lclient!ji;")
	public Class1 method3148() {
		@Pc(12) Class1 local12 = this.aClass1_197.aClass1_213;
		if (this.aClass1_197 == local12) {
			this.aClass1_198 = null;
			return null;
		} else {
			this.aClass1_198 = local12.aClass1_213;
			return local12;
		}
	}

	@OriginalMember(owner = "client!v", name = "e", descriptor = "(I)Lclient!ji;")
	public Class1 method3149() {
		@Pc(7) Class1 local7 = this.aClass1_197.aClass1_214;
		if (local7 == this.aClass1_197) {
			this.aClass1_198 = null;
			return null;
		} else {
			this.aClass1_198 = local7.aClass1_214;
			return local7;
		}
	}

	@OriginalMember(owner = "client!v", name = "a", descriptor = "(Z)Lclient!ji;")
	public Class1 method3150() {
		@Pc(11) Class1 local11 = this.aClass1_198;
		if (local11 == this.aClass1_197) {
			this.aClass1_198 = null;
			return null;
		} else {
			this.aClass1_198 = local11.aClass1_213;
			return local11;
		}
	}

	@OriginalMember(owner = "client!v", name = "a", descriptor = "(Lclient!ji;B)V")
	public void method3151(@OriginalArg(0) Class1 arg0) {
		if (arg0.aClass1_214 != null) {
			arg0.method3295();
		}
		arg0.aClass1_214 = this.aClass1_197.aClass1_214;
		arg0.aClass1_213 = this.aClass1_197;
		arg0.aClass1_214.aClass1_213 = arg0;
		arg0.aClass1_213.aClass1_214 = arg0;
	}
}
