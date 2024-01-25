import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!uo")
public final class Class209 {

	@OriginalMember(owner = "client!uo", name = "f", descriptor = "Lclient!pc;")
	private Class32_Sub3 aClass32_Sub3_8;

	@OriginalMember(owner = "client!uo", name = "b", descriptor = "Lclient!pc;")
	public final Class32_Sub3 aClass32_Sub3_7 = new Class32_Sub3();

	@OriginalMember(owner = "client!uo", name = "<init>", descriptor = "()V")
	public Class209() {
		this.aClass32_Sub3_7.aClass32_Sub3_6 = this.aClass32_Sub3_7;
		this.aClass32_Sub3_7.aClass32_Sub3_5 = this.aClass32_Sub3_7;
	}

	@OriginalMember(owner = "client!uo", name = "b", descriptor = "(I)Lclient!pc;")
	public Class32_Sub3 method5548() {
		@Pc(6) Class32_Sub3 local6 = this.aClass32_Sub3_8;
		if (this.aClass32_Sub3_7 == local6) {
			this.aClass32_Sub3_8 = null;
			return null;
		} else {
			this.aClass32_Sub3_8 = local6.aClass32_Sub3_5;
			return local6;
		}
	}

	@OriginalMember(owner = "client!uo", name = "c", descriptor = "(I)Lclient!pc;")
	public Class32_Sub3 method5549() {
		@Pc(12) Class32_Sub3 local12 = this.aClass32_Sub3_7.aClass32_Sub3_5;
		if (this.aClass32_Sub3_7 == local12) {
			this.aClass32_Sub3_8 = null;
			return null;
		} else {
			this.aClass32_Sub3_8 = local12.aClass32_Sub3_5;
			return local12;
		}
	}

	@OriginalMember(owner = "client!uo", name = "a", descriptor = "(B)V")
	public void method5550() {
		while (true) {
			@Pc(15) Class32_Sub3 local15 = this.aClass32_Sub3_7.aClass32_Sub3_5;
			if (this.aClass32_Sub3_7 == local15) {
				this.aClass32_Sub3_8 = null;
				return;
			}
			local15.method2578();
		}
	}

	@OriginalMember(owner = "client!uo", name = "a", descriptor = "(ZLclient!pc;)V")
	public void method5551(@OriginalArg(1) Class32_Sub3 arg0) {
		if (arg0.aClass32_Sub3_6 != null) {
			arg0.method2578();
		}
		arg0.aClass32_Sub3_5 = this.aClass32_Sub3_7;
		arg0.aClass32_Sub3_6 = this.aClass32_Sub3_7.aClass32_Sub3_6;
		arg0.aClass32_Sub3_6.aClass32_Sub3_5 = arg0;
		arg0.aClass32_Sub3_5.aClass32_Sub3_6 = arg0;
	}
}
