import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!kr")
public final class Class142 {

	@OriginalMember(owner = "client!kr", name = "a", descriptor = "Lclient!dd;")
	private Class5 aClass5_132;

	@OriginalMember(owner = "client!kr", name = "l", descriptor = "Lclient!nv;")
	private Class177 aClass177_23;

	@OriginalMember(owner = "client!kr", name = "<init>", descriptor = "()V")
	public Class142() {
	}

	@OriginalMember(owner = "client!kr", name = "<init>", descriptor = "(Lclient!nv;)V")
	public Class142(@OriginalArg(0) Class177 arg0) {
		this.aClass177_23 = arg0;
	}

	@OriginalMember(owner = "client!kr", name = "a", descriptor = "(I)Lclient!dd;")
	public Class5 method2954() {
		@Pc(13) Class5 local13 = this.aClass177_23.aClass5_167.aClass5_267;
		if (local13 == this.aClass177_23.aClass5_167) {
			this.aClass5_132 = null;
			return null;
		} else {
			this.aClass5_132 = local13.aClass5_267;
			return local13;
		}
	}

	@OriginalMember(owner = "client!kr", name = "c", descriptor = "(I)Lclient!dd;")
	public Class5 method2958() {
		@Pc(11) Class5 local11 = this.aClass5_132;
		if (this.aClass177_23.aClass5_167 == local11) {
			this.aClass5_132 = null;
			return null;
		} else {
			this.aClass5_132 = local11.aClass5_267;
			return local11;
		}
	}

	@OriginalMember(owner = "client!kr", name = "a", descriptor = "(ILclient!nv;)V")
	public void method2961(@OriginalArg(1) Class177 arg0) {
		this.aClass177_23 = arg0;
	}
}
