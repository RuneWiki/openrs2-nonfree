import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!qg")
public final class Class131 {

	@OriginalMember(owner = "client!qg", name = "p", descriptor = "Lclient!hl;")
	private Class1 aClass1_181;

	@OriginalMember(owner = "client!qg", name = "k", descriptor = "Lclient!hl;")
	public Class1 aClass1_180 = new Class1();

	@OriginalMember(owner = "client!qg", name = "<init>", descriptor = "()V")
	public Class131() {
		this.aClass1_180.aClass1_231 = this.aClass1_180;
		this.aClass1_180.aClass1_230 = this.aClass1_180;
	}

	@OriginalMember(owner = "client!qg", name = "a", descriptor = "(I)Lclient!hl;")
	public Class1 method3785() {
		@Pc(2) Class1 local2 = this.aClass1_181;
		if (local2 == this.aClass1_180) {
			this.aClass1_181 = null;
			return null;
		} else {
			this.aClass1_181 = local2.aClass1_230;
			return local2;
		}
	}

	@OriginalMember(owner = "client!qg", name = "b", descriptor = "(I)Lclient!hl;")
	public Class1 method3786() {
		@Pc(7) Class1 local7 = this.aClass1_180.aClass1_230;
		if (local7 == this.aClass1_180) {
			this.aClass1_181 = null;
			return null;
		} else {
			this.aClass1_181 = local7.aClass1_230;
			return local7;
		}
	}

	@OriginalMember(owner = "client!qg", name = "a", descriptor = "(Z)Z")
	public boolean method3789() {
		return this.aClass1_180 == this.aClass1_180.aClass1_231;
	}

	@OriginalMember(owner = "client!qg", name = "b", descriptor = "(B)Lclient!hl;")
	public Class1 method3791() {
		@Pc(9) Class1 local9 = this.aClass1_180.aClass1_231;
		if (local9 == this.aClass1_180) {
			this.aClass1_181 = null;
			return null;
		} else {
			this.aClass1_181 = local9.aClass1_231;
			return local9;
		}
	}

	@OriginalMember(owner = "client!qg", name = "d", descriptor = "(I)Lclient!hl;")
	public Class1 method3792() {
		@Pc(6) Class1 local6 = this.aClass1_181;
		if (local6 == this.aClass1_180) {
			this.aClass1_181 = null;
			return null;
		} else {
			this.aClass1_181 = local6.aClass1_231;
			return local6;
		}
	}

	@OriginalMember(owner = "client!qg", name = "a", descriptor = "(Lclient!hl;B)V")
	public void method3793(@OriginalArg(0) Class1 arg0) {
		if (arg0.aClass1_230 != null) {
			arg0.method4742();
		}
		arg0.aClass1_230 = this.aClass1_180;
		arg0.aClass1_231 = this.aClass1_180.aClass1_231;
		arg0.aClass1_230.aClass1_231 = arg0;
		arg0.aClass1_231.aClass1_230 = arg0;
	}

	@OriginalMember(owner = "client!qg", name = "c", descriptor = "(B)V")
	public void method3795() {
		while (true) {
			@Pc(5) Class1 local5 = this.aClass1_180.aClass1_231;
			if (this.aClass1_180 == local5) {
				this.aClass1_181 = null;
				return;
			}
			local5.method4742();
		}
	}

	@OriginalMember(owner = "client!qg", name = "f", descriptor = "(I)Lclient!hl;")
	public Class1 method3798() {
		@Pc(13) Class1 local13 = this.aClass1_180.aClass1_231;
		if (local13 == this.aClass1_180) {
			return null;
		} else {
			local13.method4742();
			return local13;
		}
	}

	@OriginalMember(owner = "client!qg", name = "a", descriptor = "(BLclient!hl;)V")
	public void method3799(@OriginalArg(1) Class1 arg0) {
		if (arg0.aClass1_230 != null) {
			arg0.method4742();
		}
		arg0.aClass1_231 = this.aClass1_180;
		arg0.aClass1_230 = this.aClass1_180.aClass1_230;
		arg0.aClass1_230.aClass1_231 = arg0;
		arg0.aClass1_231.aClass1_230 = arg0;
	}
}
