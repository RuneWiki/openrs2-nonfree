import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!kg")
public final class Class163 {

	@OriginalMember(owner = "client!kg", name = "g", descriptor = "Lclient!ii;")
	private Class4_Sub3 aClass4_Sub3_4;

	@OriginalMember(owner = "client!kg", name = "e", descriptor = "Lclient!ii;")
	public final Class4_Sub3 aClass4_Sub3_3 = new Class4_Sub3();

	@OriginalMember(owner = "client!kg", name = "<init>", descriptor = "()V")
	public Class163() {
		this.aClass4_Sub3_3.aClass4_Sub3_10 = this.aClass4_Sub3_3;
		this.aClass4_Sub3_3.aClass4_Sub3_9 = this.aClass4_Sub3_3;
	}

	@OriginalMember(owner = "client!kg", name = "a", descriptor = "(B)Lclient!ii;")
	public Class4_Sub3 method4279() {
		@Pc(7) Class4_Sub3 local7 = this.aClass4_Sub3_3.aClass4_Sub3_10;
		if (this.aClass4_Sub3_3 == local7) {
			this.aClass4_Sub3_4 = null;
			return null;
		} else {
			this.aClass4_Sub3_4 = local7.aClass4_Sub3_10;
			return local7;
		}
	}

	@OriginalMember(owner = "client!kg", name = "a", descriptor = "(Z)V")
	public void method4280() {
		while (true) {
			@Pc(11) Class4_Sub3 local11 = this.aClass4_Sub3_3.aClass4_Sub3_10;
			if (local11 == this.aClass4_Sub3_3) {
				this.aClass4_Sub3_4 = null;
				return;
			}
			local11.method5698();
		}
	}

	@OriginalMember(owner = "client!kg", name = "a", descriptor = "(Lclient!ii;Z)V")
	public void method4281(@OriginalArg(0) Class4_Sub3 arg0) {
		if (arg0.aClass4_Sub3_9 != null) {
			arg0.method5698();
		}
		arg0.aClass4_Sub3_9 = this.aClass4_Sub3_3.aClass4_Sub3_9;
		arg0.aClass4_Sub3_10 = this.aClass4_Sub3_3;
		arg0.aClass4_Sub3_9.aClass4_Sub3_10 = arg0;
		arg0.aClass4_Sub3_10.aClass4_Sub3_9 = arg0;
	}

	@OriginalMember(owner = "client!kg", name = "a", descriptor = "(I)Lclient!ii;")
	public Class4_Sub3 method4282() {
		@Pc(6) Class4_Sub3 local6 = this.aClass4_Sub3_4;
		if (local6 == this.aClass4_Sub3_3) {
			this.aClass4_Sub3_4 = null;
			return null;
		} else {
			this.aClass4_Sub3_4 = local6.aClass4_Sub3_10;
			return local6;
		}
	}

	@OriginalMember(owner = "client!kg", name = "b", descriptor = "(Z)I")
	public int method4283() {
		@Pc(7) int local7 = 0;
		@Pc(11) Class4_Sub3 local11 = this.aClass4_Sub3_3.aClass4_Sub3_10;
		while (this.aClass4_Sub3_3 != local11) {
			local11 = local11.aClass4_Sub3_10;
			local7++;
		}
		return local7;
	}
}
