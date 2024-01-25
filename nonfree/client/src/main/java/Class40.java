import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!cm")
public final class Class40 {

	@OriginalMember(owner = "client!cm", name = "d", descriptor = "Lclient!ug;")
	private Class243 aClass243_10;

	@OriginalMember(owner = "client!cm", name = "e", descriptor = "Lclient!qg;")
	private Class3 aClass3_43;

	@OriginalMember(owner = "client!cm", name = "<init>", descriptor = "()V")
	public Class40() {
	}

	@OriginalMember(owner = "client!cm", name = "<init>", descriptor = "(Lclient!ug;)V")
	public Class40(@OriginalArg(0) Class243 arg0) {
		this.aClass243_10 = arg0;
	}

	@OriginalMember(owner = "client!cm", name = "a", descriptor = "(I)Lclient!qg;")
	public Class3 method1126() {
		@Pc(14) Class3 local14 = this.aClass3_43;
		if (this.aClass243_10.aClass3_231 == local14) {
			this.aClass3_43 = null;
			return null;
		} else {
			this.aClass3_43 = local14.aClass3_261;
			return local14;
		}
	}

	@OriginalMember(owner = "client!cm", name = "a", descriptor = "(Z)Lclient!qg;")
	public Class3 method1127() {
		@Pc(13) Class3 local13 = this.aClass243_10.aClass3_231.aClass3_261;
		if (local13 == this.aClass243_10.aClass3_231) {
			this.aClass3_43 = null;
			return null;
		} else {
			this.aClass3_43 = local13.aClass3_261;
			return local13;
		}
	}

	@OriginalMember(owner = "client!cm", name = "a", descriptor = "(ILclient!ug;)V")
	public void method1129(@OriginalArg(1) Class243 arg0) {
		this.aClass243_10 = arg0;
	}
}
