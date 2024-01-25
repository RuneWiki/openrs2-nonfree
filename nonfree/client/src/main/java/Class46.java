import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!cj")
public final class Class46 {

	@OriginalMember(owner = "client!cj", name = "a", descriptor = "Lclient!hc;")
	private Class4_Sub5 aClass4_Sub5_15;

	@OriginalMember(owner = "client!cj", name = "b", descriptor = "Lclient!ut;")
	private Class367 aClass367_1;

	@OriginalMember(owner = "client!cj", name = "<init>", descriptor = "()V")
	private Class46() {
	}

	@OriginalMember(owner = "client!cj", name = "<init>", descriptor = "(Lclient!ut;)V")
	public Class46(@OriginalArg(0) Class367 arg0) {
		this.aClass367_1 = arg0;
	}

	@OriginalMember(owner = "client!cj", name = "a", descriptor = "(I)Lclient!hc;")
	public Class4_Sub5 method1495() {
		@Pc(14) Class4_Sub5 local14 = this.aClass367_1.aClass4_Sub5_58.aClass4_Sub5_67;
		if (this.aClass367_1.aClass4_Sub5_58 == local14) {
			this.aClass4_Sub5_15 = null;
			return null;
		} else {
			this.aClass4_Sub5_15 = local14.aClass4_Sub5_67;
			return local14;
		}
	}

	@OriginalMember(owner = "client!cj", name = "b", descriptor = "(I)Lclient!hc;")
	public Class4_Sub5 method1496() {
		@Pc(6) Class4_Sub5 local6 = this.aClass4_Sub5_15;
		if (this.aClass367_1.aClass4_Sub5_58 == local6) {
			this.aClass4_Sub5_15 = null;
			return null;
		} else {
			this.aClass4_Sub5_15 = local6.aClass4_Sub5_67;
			return local6;
		}
	}
}
