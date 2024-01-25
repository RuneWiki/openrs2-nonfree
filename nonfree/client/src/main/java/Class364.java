import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!vb")
public final class Class364 {

	@OriginalMember(owner = "client!vb", name = "f", descriptor = "Lclient!v;")
	private Class362 aClass362_62;

	@OriginalMember(owner = "client!vb", name = "i", descriptor = "Lclient!sja;")
	private Class6 aClass6_314;

	@OriginalMember(owner = "client!vb", name = "<init>", descriptor = "()V")
	public Class364() {
	}

	@OriginalMember(owner = "client!vb", name = "<init>", descriptor = "(Lclient!v;)V")
	public Class364(@OriginalArg(0) Class362 arg0) {
		this.aClass362_62 = arg0;
	}

	@OriginalMember(owner = "client!vb", name = "a", descriptor = "(ILclient!v;)V")
	public void method8566(@OriginalArg(1) Class362 arg0) {
		this.aClass362_62 = arg0;
	}

	@OriginalMember(owner = "client!vb", name = "a", descriptor = "(I)Lclient!sja;")
	public Class6 method8570() {
		@Pc(8) Class6 local8 = this.aClass362_62.aClass6_312.aClass6_338;
		if (local8 == this.aClass362_62.aClass6_312) {
			this.aClass6_314 = null;
			return null;
		} else {
			this.aClass6_314 = local8.aClass6_338;
			return local8;
		}
	}

	@OriginalMember(owner = "client!vb", name = "b", descriptor = "(I)Lclient!sja;")
	public Class6 method8572() {
		@Pc(11) Class6 local11 = this.aClass6_314;
		if (this.aClass362_62.aClass6_312 == local11) {
			this.aClass6_314 = null;
			return null;
		} else {
			this.aClass6_314 = local11.aClass6_338;
			return local11;
		}
	}
}
