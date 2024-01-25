import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!rm")
public final class Class222 {

	@OriginalMember(owner = "client!rm", name = "e", descriptor = "Lclient!gw;")
	private Class91 aClass91_43;

	@OriginalMember(owner = "client!rm", name = "g", descriptor = "Lclient!ha;")
	private Class4 aClass4_211;

	@OriginalMember(owner = "client!rm", name = "<init>", descriptor = "()V")
	public Class222() {
	}

	@OriginalMember(owner = "client!rm", name = "<init>", descriptor = "(Lclient!gw;)V")
	public Class222(@OriginalArg(0) Class91 arg0) {
		this.aClass91_43 = arg0;
	}

	@OriginalMember(owner = "client!rm", name = "a", descriptor = "(Lclient!gw;I)V")
	public void method5127(@OriginalArg(0) Class91 arg0) {
		this.aClass91_43 = arg0;
	}

	@OriginalMember(owner = "client!rm", name = "b", descriptor = "(I)Lclient!ha;")
	public Class4 method5128() {
		@Pc(6) Class4 local6 = this.aClass4_211;
		if (this.aClass91_43.aClass4_103 == local6) {
			this.aClass4_211 = null;
			return null;
		} else {
			this.aClass4_211 = local6.aClass4_269;
			return local6;
		}
	}

	@OriginalMember(owner = "client!rm", name = "c", descriptor = "(I)Lclient!ha;")
	public Class4 method5130() {
		@Pc(8) Class4 local8 = this.aClass91_43.aClass4_103.aClass4_269;
		if (this.aClass91_43.aClass4_103 == local8) {
			this.aClass4_211 = null;
			return null;
		} else {
			this.aClass4_211 = local8.aClass4_269;
			return local8;
		}
	}
}
