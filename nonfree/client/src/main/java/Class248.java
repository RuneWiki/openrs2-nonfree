import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!vi")
public final class Class248 {

	@OriginalMember(owner = "client!vi", name = "l", descriptor = "Lclient!np;")
	private Class3_Sub3 aClass3_Sub3_58;

	@OriginalMember(owner = "client!vi", name = "k", descriptor = "Lclient!np;")
	private final Class3_Sub3 aClass3_Sub3_57 = new Class3_Sub3();

	@OriginalMember(owner = "client!vi", name = "<init>", descriptor = "()V")
	public Class248() {
		this.aClass3_Sub3_57.aClass3_Sub3_55 = this.aClass3_Sub3_57;
		this.aClass3_Sub3_57.aClass3_Sub3_56 = this.aClass3_Sub3_57;
	}

	@OriginalMember(owner = "client!vi", name = "a", descriptor = "(Z)Lclient!np;")
	public Class3_Sub3 method5657() {
		@Pc(6) Class3_Sub3 local6 = this.aClass3_Sub3_58;
		if (this.aClass3_Sub3_57 == local6) {
			this.aClass3_Sub3_58 = null;
			return null;
		} else {
			this.aClass3_Sub3_58 = local6.aClass3_Sub3_56;
			return local6;
		}
	}

	@OriginalMember(owner = "client!vi", name = "a", descriptor = "(ILclient!np;)V")
	public void method5659(@OriginalArg(1) Class3_Sub3 arg0) {
		if (arg0.aClass3_Sub3_55 != null) {
			arg0.method4647();
		}
		arg0.aClass3_Sub3_56 = this.aClass3_Sub3_57;
		arg0.aClass3_Sub3_55 = this.aClass3_Sub3_57.aClass3_Sub3_55;
		arg0.aClass3_Sub3_55.aClass3_Sub3_56 = arg0;
		arg0.aClass3_Sub3_56.aClass3_Sub3_55 = arg0;
	}

	@OriginalMember(owner = "client!vi", name = "a", descriptor = "(I)Lclient!np;")
	public Class3_Sub3 method5661() {
		@Pc(11) Class3_Sub3 local11 = this.aClass3_Sub3_57.aClass3_Sub3_56;
		if (local11 == this.aClass3_Sub3_57) {
			this.aClass3_Sub3_58 = null;
			return null;
		} else {
			this.aClass3_Sub3_58 = local11.aClass3_Sub3_56;
			return local11;
		}
	}

	@OriginalMember(owner = "client!vi", name = "a", descriptor = "(B)Lclient!np;")
	public Class3_Sub3 method5662() {
		@Pc(7) Class3_Sub3 local7 = this.aClass3_Sub3_57.aClass3_Sub3_56;
		if (this.aClass3_Sub3_57 == local7) {
			return null;
		} else {
			local7.method4647();
			return local7;
		}
	}

	@OriginalMember(owner = "client!vi", name = "b", descriptor = "(I)V")
	public void method5663() {
		while (true) {
			@Pc(7) Class3_Sub3 local7 = this.aClass3_Sub3_57.aClass3_Sub3_56;
			if (this.aClass3_Sub3_57 == local7) {
				this.aClass3_Sub3_58 = null;
				return;
			}
			local7.method4647();
		}
	}

	@OriginalMember(owner = "client!vi", name = "c", descriptor = "(I)I")
	public int method5664() {
		@Pc(5) int local5 = 0;
		@Pc(9) Class3_Sub3 local9 = this.aClass3_Sub3_57.aClass3_Sub3_56;
		while (local9 != this.aClass3_Sub3_57) {
			local9 = local9.aClass3_Sub3_56;
			local5++;
		}
		return local5;
	}
}
