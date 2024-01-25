import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!qfa")
public final class Class271 {

	@OriginalMember(owner = "client!qfa", name = "e", descriptor = "Lclient!qia;")
	private Class276 aClass276_49;

	@OriginalMember(owner = "client!qfa", name = "f", descriptor = "Lclient!ns;")
	private Class3 aClass3_230;

	@OriginalMember(owner = "client!qfa", name = "<init>", descriptor = "()V")
	public Class271() {
	}

	@OriginalMember(owner = "client!qfa", name = "<init>", descriptor = "(Lclient!qia;)V")
	public Class271(@OriginalArg(0) Class276 arg0) {
		this.aClass276_49 = arg0;
	}

	@OriginalMember(owner = "client!qfa", name = "a", descriptor = "(Lclient!qia;I)V")
	public void method6847(@OriginalArg(0) Class276 arg0) {
		this.aClass276_49 = arg0;
	}

	@OriginalMember(owner = "client!qfa", name = "a", descriptor = "(B)Lclient!ns;")
	public Class3 method6848() {
		@Pc(13) Class3 local13 = this.aClass276_49.aClass3_231.aClass3_300;
		if (this.aClass276_49.aClass3_231 == local13) {
			this.aClass3_230 = null;
			return null;
		} else {
			this.aClass3_230 = local13.aClass3_300;
			return local13;
		}
	}

	@OriginalMember(owner = "client!qfa", name = "b", descriptor = "(B)Lclient!ns;")
	public Class3 method6849() {
		@Pc(6) Class3 local6 = this.aClass3_230;
		if (local6 == this.aClass276_49.aClass3_231) {
			this.aClass3_230 = null;
			return null;
		} else {
			this.aClass3_230 = local6.aClass3_300;
			return local6;
		}
	}
}
