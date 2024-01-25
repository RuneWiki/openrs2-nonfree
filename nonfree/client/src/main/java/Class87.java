import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!eea")
public final class Class87 {

	@OriginalMember(owner = "client!eea", name = "g", descriptor = "Lclient!me;")
	private Class3_Sub3 aClass3_Sub3_8;

	@OriginalMember(owner = "client!eea", name = "b", descriptor = "Lclient!me;")
	public final Class3_Sub3 aClass3_Sub3_7 = new Class3_Sub3();

	@OriginalMember(owner = "client!eea", name = "<init>", descriptor = "()V")
	public Class87() {
		this.aClass3_Sub3_7.aClass3_Sub3_9 = this.aClass3_Sub3_7;
		this.aClass3_Sub3_7.aClass3_Sub3_10 = this.aClass3_Sub3_7;
	}

	@OriginalMember(owner = "client!eea", name = "a", descriptor = "(ZLclient!me;)V")
	public void method2173(@OriginalArg(1) Class3_Sub3 arg0) {
		if (arg0.aClass3_Sub3_10 != null) {
			arg0.method4806();
		}
		arg0.aClass3_Sub3_10 = this.aClass3_Sub3_7.aClass3_Sub3_10;
		arg0.aClass3_Sub3_9 = this.aClass3_Sub3_7;
		arg0.aClass3_Sub3_10.aClass3_Sub3_9 = arg0;
		arg0.aClass3_Sub3_9.aClass3_Sub3_10 = arg0;
	}

	@OriginalMember(owner = "client!eea", name = "a", descriptor = "(I)Lclient!me;")
	public Class3_Sub3 method2175() {
		@Pc(13) Class3_Sub3 local13 = this.aClass3_Sub3_7.aClass3_Sub3_9;
		if (local13 == this.aClass3_Sub3_7) {
			this.aClass3_Sub3_8 = null;
			return null;
		} else {
			this.aClass3_Sub3_8 = local13.aClass3_Sub3_9;
			return local13;
		}
	}

	@OriginalMember(owner = "client!eea", name = "b", descriptor = "(I)I")
	public int method2177() {
		@Pc(12) int local12 = 0;
		for (@Pc(16) Class3_Sub3 local16 = this.aClass3_Sub3_7.aClass3_Sub3_9; local16 != this.aClass3_Sub3_7; local16 = local16.aClass3_Sub3_9) {
			local12++;
		}
		return local12;
	}

	@OriginalMember(owner = "client!eea", name = "c", descriptor = "(I)V")
	public void method2178() {
		while (true) {
			@Pc(5) Class3_Sub3 local5 = this.aClass3_Sub3_7.aClass3_Sub3_9;
			if (local5 == this.aClass3_Sub3_7) {
				this.aClass3_Sub3_8 = null;
				return;
			}
			local5.method4806();
		}
	}

	@OriginalMember(owner = "client!eea", name = "a", descriptor = "(Z)Lclient!me;")
	public Class3_Sub3 method2180() {
		@Pc(6) Class3_Sub3 local6 = this.aClass3_Sub3_8;
		if (this.aClass3_Sub3_7 == local6) {
			this.aClass3_Sub3_8 = null;
			return null;
		} else {
			this.aClass3_Sub3_8 = local6.aClass3_Sub3_9;
			return local6;
		}
	}
}
