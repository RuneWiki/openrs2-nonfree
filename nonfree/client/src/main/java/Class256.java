import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!vu")
public final class Class256 {

	@OriginalMember(owner = "client!vu", name = "b", descriptor = "Lclient!um;")
	private Class244 aClass244_46;

	@OriginalMember(owner = "client!vu", name = "h", descriptor = "Lclient!cg;")
	private Class6 aClass6_240;

	@OriginalMember(owner = "client!vu", name = "<init>", descriptor = "()V")
	public Class256() {
	}

	@OriginalMember(owner = "client!vu", name = "<init>", descriptor = "(Lclient!um;)V")
	public Class256(@OriginalArg(0) Class244 arg0) {
		this.aClass244_46 = arg0;
	}

	@OriginalMember(owner = "client!vu", name = "a", descriptor = "(B)Lclient!cg;")
	public Class6 method6288() {
		@Pc(15) Class6 local15 = this.aClass244_46.aClass6_220.aClass6_252;
		if (this.aClass244_46.aClass6_220 == local15) {
			this.aClass6_240 = null;
			return null;
		} else {
			this.aClass6_240 = local15.aClass6_252;
			return local15;
		}
	}

	@OriginalMember(owner = "client!vu", name = "a", descriptor = "(ILclient!um;)V")
	public void method6291(@OriginalArg(1) Class244 arg0) {
		this.aClass244_46 = arg0;
	}

	@OriginalMember(owner = "client!vu", name = "c", descriptor = "(I)Lclient!cg;")
	public Class6 method6292() {
		@Pc(6) Class6 local6 = this.aClass6_240;
		if (this.aClass244_46.aClass6_220 == local6) {
			this.aClass6_240 = null;
			return null;
		} else {
			this.aClass6_240 = local6.aClass6_252;
			return local6;
		}
	}
}
