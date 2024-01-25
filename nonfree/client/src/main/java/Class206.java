import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!mf")
public final class Class206 {

	@OriginalMember(owner = "client!mf", name = "g", descriptor = "Lclient!ku;")
	private Class41_Sub3 aClass41_Sub3_6;

	@OriginalMember(owner = "client!mf", name = "f", descriptor = "Lclient!ku;")
	public final Class41_Sub3 aClass41_Sub3_5 = new Class41_Sub3();

	static {
		new Class137("", 73);
	}

	@OriginalMember(owner = "client!mf", name = "<init>", descriptor = "()V")
	public Class206() {
		this.aClass41_Sub3_5.aClass41_Sub3_9 = this.aClass41_Sub3_5;
		this.aClass41_Sub3_5.aClass41_Sub3_10 = this.aClass41_Sub3_5;
	}

	@OriginalMember(owner = "client!mf", name = "a", descriptor = "(Lclient!ku;Z)V")
	public void method4712(@OriginalArg(0) Class41_Sub3 arg0) {
		if (arg0.aClass41_Sub3_9 != null) {
			arg0.method5762();
		}
		arg0.aClass41_Sub3_10 = this.aClass41_Sub3_5;
		arg0.aClass41_Sub3_9 = this.aClass41_Sub3_5.aClass41_Sub3_9;
		arg0.aClass41_Sub3_9.aClass41_Sub3_10 = arg0;
		arg0.aClass41_Sub3_10.aClass41_Sub3_9 = arg0;
	}

	@OriginalMember(owner = "client!mf", name = "a", descriptor = "(B)Lclient!ku;")
	public Class41_Sub3 method4713() {
		@Pc(11) Class41_Sub3 local11 = this.aClass41_Sub3_6;
		if (this.aClass41_Sub3_5 == local11) {
			this.aClass41_Sub3_6 = null;
			return null;
		} else {
			this.aClass41_Sub3_6 = local11.aClass41_Sub3_10;
			return local11;
		}
	}

	@OriginalMember(owner = "client!mf", name = "a", descriptor = "(Z)I")
	public int method4714() {
		@Pc(12) int local12 = 0;
		@Pc(16) Class41_Sub3 local16 = this.aClass41_Sub3_5.aClass41_Sub3_10;
		while (local16 != this.aClass41_Sub3_5) {
			local16 = local16.aClass41_Sub3_10;
			local12++;
		}
		return local12;
	}

	@OriginalMember(owner = "client!mf", name = "b", descriptor = "(Z)Lclient!ku;")
	public Class41_Sub3 method4715() {
		@Pc(7) Class41_Sub3 local7 = this.aClass41_Sub3_5.aClass41_Sub3_10;
		if (local7 == this.aClass41_Sub3_5) {
			this.aClass41_Sub3_6 = null;
			return null;
		} else {
			this.aClass41_Sub3_6 = local7.aClass41_Sub3_10;
			return local7;
		}
	}

	@OriginalMember(owner = "client!mf", name = "c", descriptor = "(Z)V")
	public void method4716() {
		while (true) {
			@Pc(9) Class41_Sub3 local9 = this.aClass41_Sub3_5.aClass41_Sub3_10;
			if (this.aClass41_Sub3_5 == local9) {
				this.aClass41_Sub3_6 = null;
				return;
			}
			local9.method5762();
		}
	}
}
