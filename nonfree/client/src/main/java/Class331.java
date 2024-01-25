import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!uf")
public final class Class331 {

	@OriginalMember(owner = "client!uf", name = "e", descriptor = "Lclient!gj;")
	private Class124 aClass124_62;

	@OriginalMember(owner = "client!uf", name = "g", descriptor = "Lclient!rc;")
	private Class4 aClass4_260;

	@OriginalMember(owner = "client!uf", name = "<init>", descriptor = "()V")
	public Class331() {
	}

	@OriginalMember(owner = "client!uf", name = "<init>", descriptor = "(Lclient!gj;)V")
	public Class331(@OriginalArg(0) Class124 arg0) {
		this.aClass124_62 = arg0;
	}

	@OriginalMember(owner = "client!uf", name = "a", descriptor = "(I)Lclient!rc;")
	public Class4 method7399() {
		@Pc(8) Class4 local8 = this.aClass124_62.aClass4_90.aClass4_287;
		if (this.aClass124_62.aClass4_90 == local8) {
			this.aClass4_260 = null;
			return null;
		} else {
			this.aClass4_260 = local8.aClass4_287;
			return local8;
		}
	}

	@OriginalMember(owner = "client!uf", name = "a", descriptor = "(Lclient!gj;Z)V")
	public void method7400(@OriginalArg(0) Class124 arg0) {
		this.aClass124_62 = arg0;
	}

	@OriginalMember(owner = "client!uf", name = "b", descriptor = "(I)Lclient!rc;")
	public Class4 method7401() {
		@Pc(6) Class4 local6 = this.aClass4_260;
		if (this.aClass124_62.aClass4_90 == local6) {
			this.aClass4_260 = null;
			return null;
		} else {
			this.aClass4_260 = local6.aClass4_287;
			return local6;
		}
	}
}
