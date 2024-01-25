import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ee")
public final class Class85 {

	@OriginalMember(owner = "client!ee", name = "e", descriptor = "Lclient!or;")
	private Class244 aClass244_24;

	@OriginalMember(owner = "client!ee", name = "g", descriptor = "Lclient!u;")
	private Class3 aClass3_63;

	@OriginalMember(owner = "client!ee", name = "<init>", descriptor = "()V")
	public Class85() {
	}

	@OriginalMember(owner = "client!ee", name = "<init>", descriptor = "(Lclient!or;)V")
	public Class85(@OriginalArg(0) Class244 arg0) {
		this.aClass244_24 = arg0;
	}

	@OriginalMember(owner = "client!ee", name = "a", descriptor = "(Z)Lclient!u;")
	public Class3 method2286() {
		@Pc(6) Class3 local6 = this.aClass3_63;
		if (this.aClass244_24.aClass3_189 == local6) {
			this.aClass3_63 = null;
			return null;
		} else {
			this.aClass3_63 = local6.aClass3_285;
			return local6;
		}
	}

	@OriginalMember(owner = "client!ee", name = "c", descriptor = "(I)Lclient!u;")
	public Class3 method2289() {
		@Pc(8) Class3 local8 = this.aClass244_24.aClass3_189.aClass3_285;
		if (local8 == this.aClass244_24.aClass3_189) {
			this.aClass3_63 = null;
			return null;
		} else {
			this.aClass3_63 = local8.aClass3_285;
			return local8;
		}
	}

	@OriginalMember(owner = "client!ee", name = "a", descriptor = "(BLclient!or;)V")
	public void method2290(@OriginalArg(1) Class244 arg0) {
		this.aClass244_24 = arg0;
	}
}
