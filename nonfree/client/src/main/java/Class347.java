import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!va")
public final class Class347 {

	@OriginalMember(owner = "client!va", name = "h", descriptor = "Lclient!ug;")
	private Class9_Sub3 aClass9_Sub3_10;

	@OriginalMember(owner = "client!va", name = "c", descriptor = "Lclient!ug;")
	public final Class9_Sub3 aClass9_Sub3_9 = new Class9_Sub3();

	@OriginalMember(owner = "client!va", name = "<init>", descriptor = "()V")
	public Class347() {
		this.aClass9_Sub3_9.aClass9_Sub3_8 = this.aClass9_Sub3_9;
		this.aClass9_Sub3_9.aClass9_Sub3_7 = this.aClass9_Sub3_9;
	}

	@OriginalMember(owner = "client!va", name = "a", descriptor = "(Z)I")
	public int method8204() {
		@Pc(13) int local13 = 0;
		@Pc(17) Class9_Sub3 local17 = this.aClass9_Sub3_9.aClass9_Sub3_8;
		while (local17 != this.aClass9_Sub3_9) {
			local17 = local17.aClass9_Sub3_8;
			local13++;
		}
		return local13;
	}

	@OriginalMember(owner = "client!va", name = "b", descriptor = "(Z)Lclient!ug;")
	public Class9_Sub3 method8205() {
		@Pc(6) Class9_Sub3 local6 = this.aClass9_Sub3_10;
		if (this.aClass9_Sub3_9 == local6) {
			this.aClass9_Sub3_10 = null;
			return null;
		} else {
			this.aClass9_Sub3_10 = local6.aClass9_Sub3_8;
			return local6;
		}
	}

	@OriginalMember(owner = "client!va", name = "a", descriptor = "(B)Lclient!ug;")
	public Class9_Sub3 method8206() {
		@Pc(7) Class9_Sub3 local7 = this.aClass9_Sub3_9.aClass9_Sub3_8;
		if (local7 == this.aClass9_Sub3_9) {
			this.aClass9_Sub3_10 = null;
			return null;
		} else {
			this.aClass9_Sub3_10 = local7.aClass9_Sub3_8;
			return local7;
		}
	}

	@OriginalMember(owner = "client!va", name = "a", descriptor = "(Lclient!ug;I)V")
	public void method8207(@OriginalArg(0) Class9_Sub3 arg0) {
		if (arg0.aClass9_Sub3_7 != null) {
			arg0.method5871();
		}
		arg0.aClass9_Sub3_7 = this.aClass9_Sub3_9.aClass9_Sub3_7;
		arg0.aClass9_Sub3_8 = this.aClass9_Sub3_9;
		arg0.aClass9_Sub3_7.aClass9_Sub3_8 = arg0;
		arg0.aClass9_Sub3_8.aClass9_Sub3_7 = arg0;
	}

	@OriginalMember(owner = "client!va", name = "b", descriptor = "(B)V")
	public void method8209() {
		while (true) {
			@Pc(9) Class9_Sub3 local9 = this.aClass9_Sub3_9.aClass9_Sub3_8;
			if (this.aClass9_Sub3_9 == local9) {
				this.aClass9_Sub3_10 = null;
				return;
			}
			local9.method5871();
		}
	}
}
