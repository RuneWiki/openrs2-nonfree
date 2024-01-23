import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!fk")
public final class Class56 {

	@OriginalMember(owner = "client!fk", name = "v", descriptor = "Lclient!wk;")
	private Class3 aClass3_67;

	@OriginalMember(owner = "client!fk", name = "u", descriptor = "Lclient!wk;")
	public Class3 aClass3_66 = new Class3();

	@OriginalMember(owner = "client!fk", name = "<init>", descriptor = "()V")
	public Class56() {
		this.aClass3_66.aClass3_233 = this.aClass3_66;
		this.aClass3_66.aClass3_232 = this.aClass3_66;
	}

	@OriginalMember(owner = "client!fk", name = "a", descriptor = "(B)Z")
	public boolean method1267() {
		return this.aClass3_66.aClass3_232 == this.aClass3_66;
	}

	@OriginalMember(owner = "client!fk", name = "b", descriptor = "(B)Lclient!wk;")
	public Class3 method1269() {
		@Pc(14) Class3 local14 = this.aClass3_67;
		if (local14 == this.aClass3_66) {
			this.aClass3_67 = null;
			return null;
		} else {
			this.aClass3_67 = local14.aClass3_233;
			return local14;
		}
	}

	@OriginalMember(owner = "client!fk", name = "b", descriptor = "(I)V")
	public void method1270() {
		while (true) {
			@Pc(5) Class3 local5 = this.aClass3_66.aClass3_232;
			if (local5 == this.aClass3_66) {
				this.aClass3_67 = null;
				return;
			}
			local5.method5013();
		}
	}

	@OriginalMember(owner = "client!fk", name = "a", descriptor = "(ZLclient!wk;)V")
	public void method1274(@OriginalArg(1) Class3 arg0) {
		if (arg0.aClass3_233 != null) {
			arg0.method5013();
		}
		arg0.aClass3_232 = this.aClass3_66.aClass3_232;
		arg0.aClass3_233 = this.aClass3_66;
		arg0.aClass3_233.aClass3_232 = arg0;
		arg0.aClass3_232.aClass3_233 = arg0;
	}

	@OriginalMember(owner = "client!fk", name = "d", descriptor = "(B)Lclient!wk;")
	public Class3 method1275() {
		@Pc(7) Class3 local7 = this.aClass3_66.aClass3_233;
		if (local7 == this.aClass3_66) {
			this.aClass3_67 = null;
			return null;
		} else {
			this.aClass3_67 = local7.aClass3_233;
			return local7;
		}
	}

	@OriginalMember(owner = "client!fk", name = "e", descriptor = "(I)Lclient!wk;")
	public Class3 method1278() {
		@Pc(9) Class3 local9 = this.aClass3_67;
		if (local9 == this.aClass3_66) {
			this.aClass3_67 = null;
			return null;
		} else {
			this.aClass3_67 = local9.aClass3_232;
			return local9;
		}
	}

	@OriginalMember(owner = "client!fk", name = "e", descriptor = "(B)Lclient!wk;")
	public Class3 method1279() {
		@Pc(7) Class3 local7 = this.aClass3_66.aClass3_232;
		if (this.aClass3_66 == local7) {
			return null;
		} else {
			local7.method5013();
			return local7;
		}
	}

	@OriginalMember(owner = "client!fk", name = "f", descriptor = "(B)Lclient!wk;")
	public Class3 method1281() {
		@Pc(7) Class3 local7 = this.aClass3_66.aClass3_232;
		if (this.aClass3_66 == local7) {
			this.aClass3_67 = null;
			return null;
		} else {
			this.aClass3_67 = local7.aClass3_232;
			return local7;
		}
	}

	@OriginalMember(owner = "client!fk", name = "a", descriptor = "(Lclient!wk;I)V")
	public void method1282(@OriginalArg(0) Class3 arg0) {
		if (arg0.aClass3_233 != null) {
			arg0.method5013();
		}
		arg0.aClass3_233 = this.aClass3_66.aClass3_233;
		arg0.aClass3_232 = this.aClass3_66;
		arg0.aClass3_233.aClass3_232 = arg0;
		arg0.aClass3_232.aClass3_233 = arg0;
	}
}
