import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!pi")
public final class Class67 {

	@OriginalMember(owner = "client!pi", name = "t", descriptor = "Lclient!vd;")
	private Class2 aClass2_166;

	@OriginalMember(owner = "client!pi", name = "m", descriptor = "Lclient!vd;")
	public final Class2 aClass2_165 = new Class2();

	@OriginalMember(owner = "client!pi", name = "<init>", descriptor = "()V")
	public Class67() {
		this.aClass2_165.aClass2_217 = this.aClass2_165;
		this.aClass2_165.aClass2_218 = this.aClass2_165;
	}

	@OriginalMember(owner = "client!pi", name = "a", descriptor = "(I)Lclient!vd;")
	public Class2 method2842() {
		@Pc(7) Class2 local7 = this.aClass2_165.aClass2_218;
		if (this.aClass2_165 == local7) {
			return null;
		} else {
			local7.method3556();
			return local7;
		}
	}

	@OriginalMember(owner = "client!pi", name = "a", descriptor = "(ILclient!vd;)V")
	public void method2843(@OriginalArg(1) Class2 arg0) {
		if (arg0.aClass2_217 != null) {
			arg0.method3556();
		}
		arg0.aClass2_218 = this.aClass2_165;
		arg0.aClass2_217 = this.aClass2_165.aClass2_217;
		arg0.aClass2_217.aClass2_218 = arg0;
		arg0.aClass2_218.aClass2_217 = arg0;
	}

	@OriginalMember(owner = "client!pi", name = "a", descriptor = "(Lclient!vd;Z)V")
	public void method2845(@OriginalArg(0) Class2 arg0) {
		if (arg0.aClass2_217 != null) {
			arg0.method3556();
		}
		arg0.aClass2_218 = this.aClass2_165.aClass2_218;
		arg0.aClass2_217 = this.aClass2_165;
		arg0.aClass2_217.aClass2_218 = arg0;
		arg0.aClass2_218.aClass2_217 = arg0;
	}

	@OriginalMember(owner = "client!pi", name = "a", descriptor = "(ZLclient!vd;Lclient!vd;)V")
	public void method2846(@OriginalArg(1) Class2 arg0, @OriginalArg(2) Class2 arg1) {
		if (arg1.aClass2_217 != null) {
			arg1.method3556();
		}
		arg1.aClass2_217 = arg0.aClass2_217;
		arg1.aClass2_218 = arg0;
		arg1.aClass2_217.aClass2_218 = arg1;
		arg1.aClass2_218.aClass2_217 = arg1;
	}

	@OriginalMember(owner = "client!pi", name = "c", descriptor = "(I)V")
	public void method2847() {
		while (true) {
			@Pc(15) Class2 local15 = this.aClass2_165.aClass2_218;
			if (local15 == this.aClass2_165) {
				return;
			}
			local15.method3556();
		}
	}

	@OriginalMember(owner = "client!pi", name = "a", descriptor = "(B)Lclient!vd;")
	public Class2 method2848() {
		@Pc(15) Class2 local15 = this.aClass2_165.aClass2_218;
		if (local15 == this.aClass2_165) {
			this.aClass2_166 = null;
			return null;
		} else {
			this.aClass2_166 = local15.aClass2_218;
			return local15;
		}
	}

	@OriginalMember(owner = "client!pi", name = "d", descriptor = "(I)Lclient!vd;")
	public Class2 method2849() {
		@Pc(3) Class2 local3 = this.aClass2_165.aClass2_217;
		if (local3 == this.aClass2_165) {
			this.aClass2_166 = null;
			return null;
		} else {
			this.aClass2_166 = local3.aClass2_217;
			return local3;
		}
	}

	@OriginalMember(owner = "client!pi", name = "e", descriptor = "(I)Lclient!vd;")
	public Class2 method2850() {
		@Pc(6) Class2 local6 = this.aClass2_166;
		if (this.aClass2_165 == local6) {
			this.aClass2_166 = null;
			return null;
		} else {
			this.aClass2_166 = local6.aClass2_217;
			return local6;
		}
	}

	@OriginalMember(owner = "client!pi", name = "b", descriptor = "(B)Lclient!vd;")
	public Class2 method2851() {
		@Pc(6) Class2 local6 = this.aClass2_166;
		if (this.aClass2_165 == local6) {
			this.aClass2_166 = null;
			return null;
		} else {
			this.aClass2_166 = local6.aClass2_218;
			return local6;
		}
	}
}
