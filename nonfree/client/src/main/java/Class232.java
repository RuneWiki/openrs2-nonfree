import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!mi")
public final class Class232 {

	@OriginalMember(owner = "client!mi", name = "b", descriptor = "Lclient!ifa;")
	private Class163 aClass163_34;

	@OriginalMember(owner = "client!mi", name = "f", descriptor = "Lclient!oq;")
	private Class4 aClass4_188;

	@OriginalMember(owner = "client!mi", name = "<init>", descriptor = "()V")
	public Class232() {
	}

	@OriginalMember(owner = "client!mi", name = "<init>", descriptor = "(Lclient!ifa;)V")
	public Class232(@OriginalArg(0) Class163 arg0) {
		this.aClass163_34 = arg0;
	}

	@OriginalMember(owner = "client!mi", name = "a", descriptor = "(BLclient!ifa;)V")
	public void method4931(@OriginalArg(1) Class163 arg0) {
		this.aClass163_34 = arg0;
	}

	@OriginalMember(owner = "client!mi", name = "b", descriptor = "(B)Lclient!oq;")
	public Class4 method4932() {
		@Pc(13) Class4 local13 = this.aClass4_188;
		if (this.aClass163_34.aClass4_127 == local13) {
			this.aClass4_188 = null;
			return null;
		} else {
			this.aClass4_188 = local13.aClass4_337;
			return local13;
		}
	}

	@OriginalMember(owner = "client!mi", name = "c", descriptor = "(B)Lclient!oq;")
	public Class4 method4933() {
		@Pc(8) Class4 local8 = this.aClass163_34.aClass4_127.aClass4_337;
		if (local8 == this.aClass163_34.aClass4_127) {
			this.aClass4_188 = null;
			return null;
		} else {
			this.aClass4_188 = local8.aClass4_337;
			return local8;
		}
	}
}
