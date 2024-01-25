import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ut")
public final class Class367 {

	@OriginalMember(owner = "client!ut", name = "m", descriptor = "Lclient!hc;")
	private Class4_Sub5 aClass4_Sub5_59;

	@OriginalMember(owner = "client!ut", name = "d", descriptor = "Lclient!hc;")
	public final Class4_Sub5 aClass4_Sub5_58 = new Class4_Sub5();

	@OriginalMember(owner = "client!ut", name = "<init>", descriptor = "()V")
	public Class367() {
		this.aClass4_Sub5_58.aClass4_Sub5_66 = this.aClass4_Sub5_58;
		this.aClass4_Sub5_58.aClass4_Sub5_67 = this.aClass4_Sub5_58;
	}

	@OriginalMember(owner = "client!ut", name = "a", descriptor = "(I)V")
	public void method8305() {
		while (true) {
			@Pc(16) Class4_Sub5 local16 = this.aClass4_Sub5_58.aClass4_Sub5_67;
			if (this.aClass4_Sub5_58 == local16) {
				this.aClass4_Sub5_59 = null;
				return;
			}
			local16.method8990();
		}
	}

	@OriginalMember(owner = "client!ut", name = "b", descriptor = "(I)I")
	public int method8306() {
		@Pc(7) int local7 = 0;
		@Pc(11) Class4_Sub5 local11 = this.aClass4_Sub5_58.aClass4_Sub5_67;
		while (local11 != this.aClass4_Sub5_58) {
			local11 = local11.aClass4_Sub5_67;
			local7++;
		}
		return local7;
	}

	@OriginalMember(owner = "client!ut", name = "a", descriptor = "(B)Lclient!hc;")
	public Class4_Sub5 method8308() {
		@Pc(7) Class4_Sub5 local7 = this.aClass4_Sub5_58.aClass4_Sub5_67;
		if (local7 == this.aClass4_Sub5_58) {
			this.aClass4_Sub5_59 = null;
			return null;
		} else {
			this.aClass4_Sub5_59 = local7.aClass4_Sub5_67;
			return local7;
		}
	}

	@OriginalMember(owner = "client!ut", name = "a", descriptor = "(Z)Lclient!hc;")
	public Class4_Sub5 method8309() {
		@Pc(6) Class4_Sub5 local6 = this.aClass4_Sub5_59;
		if (local6 == this.aClass4_Sub5_58) {
			this.aClass4_Sub5_59 = null;
			return null;
		} else {
			this.aClass4_Sub5_59 = local6.aClass4_Sub5_67;
			return local6;
		}
	}

	@OriginalMember(owner = "client!ut", name = "a", descriptor = "(ILclient!hc;)V")
	public void method8310(@OriginalArg(1) Class4_Sub5 arg0) {
		if (arg0.aClass4_Sub5_66 != null) {
			arg0.method8990();
		}
		arg0.aClass4_Sub5_66 = this.aClass4_Sub5_58.aClass4_Sub5_66;
		arg0.aClass4_Sub5_67 = this.aClass4_Sub5_58;
		arg0.aClass4_Sub5_66.aClass4_Sub5_67 = arg0;
		arg0.aClass4_Sub5_67.aClass4_Sub5_66 = arg0;
	}

	@OriginalMember(owner = "client!ut", name = "c", descriptor = "(I)Lclient!hc;")
	public Class4_Sub5 method8311() {
		@Pc(12) Class4_Sub5 local12 = this.aClass4_Sub5_58.aClass4_Sub5_67;
		if (local12 == this.aClass4_Sub5_58) {
			return null;
		} else {
			local12.method8990();
			return local12;
		}
	}
}
