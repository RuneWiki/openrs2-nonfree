import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!mba")
public final class Class202 {

	@OriginalMember(owner = "client!mba", name = "c", descriptor = "Lclient!gga;")
	private Class3 aClass3_172;

	@OriginalMember(owner = "client!mba", name = "d", descriptor = "Lclient!gk;")
	private Class112 aClass112_36;

	@OriginalMember(owner = "client!mba", name = "<init>", descriptor = "()V")
	public Class202() {
	}

	@OriginalMember(owner = "client!mba", name = "<init>", descriptor = "(Lclient!gk;)V")
	public Class202(@OriginalArg(0) Class112 arg0) {
		this.aClass112_36 = arg0;
	}

	@OriginalMember(owner = "client!mba", name = "a", descriptor = "(ILclient!gk;)V")
	public void method4668(@OriginalArg(1) Class112 arg0) {
		this.aClass112_36 = arg0;
	}

	@OriginalMember(owner = "client!mba", name = "a", descriptor = "(I)Lclient!gga;")
	public Class3 method4670() {
		@Pc(12) Class3 local12 = this.aClass3_172;
		if (local12 == this.aClass112_36.aClass3_111) {
			this.aClass3_172 = null;
			return null;
		} else {
			this.aClass3_172 = local12.aClass3_286;
			return local12;
		}
	}

	@OriginalMember(owner = "client!mba", name = "c", descriptor = "(Z)Lclient!gga;")
	public Class3 method4672() {
		@Pc(8) Class3 local8 = this.aClass112_36.aClass3_111.aClass3_286;
		if (this.aClass112_36.aClass3_111 == local8) {
			this.aClass3_172 = null;
			return null;
		} else {
			this.aClass3_172 = local8.aClass3_286;
			return local8;
		}
	}
}
