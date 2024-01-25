import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!cv")
public final class Class60 {

	@OriginalMember(owner = "client!cv", name = "d", descriptor = "Lclient!an;")
	private Class3 aClass3_77;

	@OriginalMember(owner = "client!cv", name = "a", descriptor = "Lclient!tj;")
	private Class357 aClass357_5;

	@OriginalMember(owner = "client!cv", name = "<init>", descriptor = "()V")
	public Class60() {
	}

	@OriginalMember(owner = "client!cv", name = "<init>", descriptor = "(Lclient!tj;)V")
	public Class60(@OriginalArg(0) Class357 arg0) {
		this.aClass357_5 = arg0;
	}

	@OriginalMember(owner = "client!cv", name = "a", descriptor = "(ILclient!tj;)V")
	public void method1303(@OriginalArg(1) Class357 arg0) {
		this.aClass357_5 = arg0;
	}

	@OriginalMember(owner = "client!cv", name = "a", descriptor = "(B)Lclient!an;")
	public Class3 method1304() {
		@Pc(16) Class3 local16 = this.aClass357_5.aClass3_303.aClass3_341;
		if (this.aClass357_5.aClass3_303 == local16) {
			this.aClass3_77 = null;
			return null;
		} else {
			this.aClass3_77 = local16.aClass3_341;
			return local16;
		}
	}

	@OriginalMember(owner = "client!cv", name = "b", descriptor = "(B)Lclient!an;")
	public Class3 method1305() {
		@Pc(6) Class3 local6 = this.aClass3_77;
		if (this.aClass357_5.aClass3_303 == local6) {
			this.aClass3_77 = null;
			return null;
		} else {
			this.aClass3_77 = local6.aClass3_341;
			return local6;
		}
	}
}
