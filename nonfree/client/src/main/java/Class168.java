import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!tf")
public final class Class168 {

	@OriginalMember(owner = "client!tf", name = "i", descriptor = "Lclient!en;")
	private Class45 aClass45_12;

	@OriginalMember(owner = "client!tf", name = "f", descriptor = "Lclient!en;")
	public Class45 aClass45_11 = new Class45();

	@OriginalMember(owner = "client!tf", name = "<init>", descriptor = "()V")
	public Class168() {
		this.aClass45_11.aClass45_9 = this.aClass45_11;
		this.aClass45_11.aClass45_10 = this.aClass45_11;
	}

	@OriginalMember(owner = "client!tf", name = "a", descriptor = "(I)I")
	public int method3981() {
		@Pc(12) int local12 = 0;
		for (@Pc(16) Class45 local16 = this.aClass45_11.aClass45_9; local16 != this.aClass45_11; local16 = local16.aClass45_9) {
			local12++;
		}
		return local12;
	}

	@OriginalMember(owner = "client!tf", name = "a", descriptor = "(Lclient!en;B)V")
	public void method3984(@OriginalArg(0) Class45 arg0) {
		if (arg0.aClass45_10 != null) {
			arg0.method2449();
		}
		arg0.aClass45_10 = this.aClass45_11.aClass45_10;
		arg0.aClass45_9 = this.aClass45_11;
		arg0.aClass45_10.aClass45_9 = arg0;
		arg0.aClass45_9.aClass45_10 = arg0;
	}

	@OriginalMember(owner = "client!tf", name = "a", descriptor = "(Z)Lclient!en;")
	public Class45 method3985() {
		@Pc(7) Class45 local7 = this.aClass45_11.aClass45_9;
		if (local7 == this.aClass45_11) {
			this.aClass45_12 = null;
			return null;
		} else {
			this.aClass45_12 = local7.aClass45_9;
			return local7;
		}
	}

	@OriginalMember(owner = "client!tf", name = "c", descriptor = "(I)Lclient!en;")
	public Class45 method3988() {
		@Pc(6) Class45 local6 = this.aClass45_12;
		if (local6 == this.aClass45_11) {
			this.aClass45_12 = null;
			return null;
		} else {
			this.aClass45_12 = local6.aClass45_9;
			return local6;
		}
	}
}
