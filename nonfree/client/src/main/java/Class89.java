import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ej")
public final class Class89 {

	@OriginalMember(owner = "client!ej", name = "a", descriptor = "Lclient!ii;")
	private Class4 aClass4_63;

	@OriginalMember(owner = "client!ej", name = "d", descriptor = "Lclient!oe;")
	private Class244 aClass244_22;

	@OriginalMember(owner = "client!ej", name = "<init>", descriptor = "()V")
	public Class89() {
	}

	@OriginalMember(owner = "client!ej", name = "<init>", descriptor = "(Lclient!oe;)V")
	public Class89(@OriginalArg(0) Class244 arg0) {
		this.aClass244_22 = arg0;
	}

	@OriginalMember(owner = "client!ej", name = "a", descriptor = "(I)Lclient!ii;")
	public Class4 method2481() {
		@Pc(14) Class4 local14 = this.aClass4_63;
		if (local14 == this.aClass244_22.aClass4_185) {
			this.aClass4_63 = null;
			return null;
		} else {
			this.aClass4_63 = local14.aClass4_285;
			return local14;
		}
	}

	@OriginalMember(owner = "client!ej", name = "a", descriptor = "(Lclient!oe;I)V")
	public void method2482(@OriginalArg(0) Class244 arg0) {
		this.aClass244_22 = arg0;
	}

	@OriginalMember(owner = "client!ej", name = "b", descriptor = "(I)Lclient!ii;")
	public Class4 method2483() {
		@Pc(14) Class4 local14 = this.aClass244_22.aClass4_185.aClass4_285;
		if (local14 == this.aClass244_22.aClass4_185) {
			this.aClass4_63 = null;
			return null;
		} else {
			this.aClass4_63 = local14.aClass4_285;
			return local14;
		}
	}
}
