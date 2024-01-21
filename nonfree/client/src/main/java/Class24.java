import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!fc")
public final class Class24 {

	@OriginalMember(owner = "client!fc", name = "I", descriptor = "Lclient!de;")
	private Class3 aClass3_28;

	@OriginalMember(owner = "client!fc", name = "x", descriptor = "Lclient!de;")
	public final Class3 aClass3_27 = new Class3();

	@OriginalMember(owner = "client!fc", name = "<init>", descriptor = "()V")
	public Class24() {
		this.aClass3_27.aClass3_96 = this.aClass3_27;
		this.aClass3_27.aClass3_95 = this.aClass3_27;
	}

	@OriginalMember(owner = "client!fc", name = "a", descriptor = "(Lclient!de;Lclient!de;I)V")
	public void method523(@OriginalArg(0) Class3 arg0, @OriginalArg(1) Class3 arg1) {
		if (arg1.aClass3_95 != null) {
			arg1.method1852();
		}
		arg1.aClass3_96 = arg0;
		arg1.aClass3_95 = arg0.aClass3_95;
		arg1.aClass3_95.aClass3_96 = arg1;
		arg1.aClass3_96.aClass3_95 = arg1;
	}

	@OriginalMember(owner = "client!fc", name = "a", descriptor = "(ZLclient!de;)V")
	public void method524(@OriginalArg(1) Class3 arg0) {
		if (arg0.aClass3_95 != null) {
			arg0.method1852();
		}
		arg0.aClass3_95 = this.aClass3_27;
		arg0.aClass3_96 = this.aClass3_27.aClass3_96;
		arg0.aClass3_95.aClass3_96 = arg0;
		arg0.aClass3_96.aClass3_95 = arg0;
	}

	@OriginalMember(owner = "client!fc", name = "a", descriptor = "(B)Lclient!de;")
	public Class3 method525() {
		@Pc(12) Class3 local12 = this.aClass3_28;
		if (this.aClass3_27 == local12) {
			this.aClass3_28 = null;
			return null;
		} else {
			this.aClass3_28 = local12.aClass3_96;
			return local12;
		}
	}

	@OriginalMember(owner = "client!fc", name = "b", descriptor = "(B)Lclient!de;")
	public Class3 method527() {
		@Pc(12) Class3 local12 = this.aClass3_27.aClass3_96;
		if (local12 == this.aClass3_27) {
			return null;
		} else {
			local12.method1852();
			return local12;
		}
	}

	@OriginalMember(owner = "client!fc", name = "a", descriptor = "(I)Lclient!de;")
	public Class3 method528() {
		@Pc(6) Class3 local6 = this.aClass3_28;
		if (this.aClass3_27 == local6) {
			this.aClass3_28 = null;
			return null;
		} else {
			this.aClass3_28 = local6.aClass3_95;
			return local6;
		}
	}

	@OriginalMember(owner = "client!fc", name = "c", descriptor = "(B)Lclient!de;")
	public Class3 method529() {
		@Pc(12) Class3 local12 = this.aClass3_27.aClass3_95;
		if (local12 == this.aClass3_27) {
			return null;
		} else {
			local12.method1852();
			return local12;
		}
	}

	@OriginalMember(owner = "client!fc", name = "d", descriptor = "(B)Lclient!de;")
	public Class3 method530() {
		@Pc(15) Class3 local15 = this.aClass3_27.aClass3_95;
		if (this.aClass3_27 == local15) {
			this.aClass3_28 = null;
			return null;
		} else {
			this.aClass3_28 = local15.aClass3_95;
			return local15;
		}
	}

	@OriginalMember(owner = "client!fc", name = "e", descriptor = "(B)V")
	public void method531() {
		while (true) {
			@Pc(15) Class3 local15 = this.aClass3_27.aClass3_96;
			if (local15 == this.aClass3_27) {
				return;
			}
			local15.method1852();
		}
	}

	@OriginalMember(owner = "client!fc", name = "f", descriptor = "(B)Lclient!de;")
	public Class3 method534() {
		@Pc(12) Class3 local12 = this.aClass3_27.aClass3_96;
		if (this.aClass3_27 == local12) {
			this.aClass3_28 = null;
			return null;
		} else {
			this.aClass3_28 = local12.aClass3_96;
			return local12;
		}
	}

	@OriginalMember(owner = "client!fc", name = "b", descriptor = "(ZLclient!de;)V")
	public void method535(@OriginalArg(1) Class3 arg0) {
		if (arg0.aClass3_95 != null) {
			arg0.method1852();
		}
		arg0.aClass3_96 = this.aClass3_27;
		arg0.aClass3_95 = this.aClass3_27.aClass3_95;
		arg0.aClass3_95.aClass3_96 = arg0;
		arg0.aClass3_96.aClass3_95 = arg0;
	}
}
